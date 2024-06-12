package net.ltxprogrammer.turned.entity.p000ai;

import java.lang.Comparable;
import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.core.BlockPos;
import net.minecraft.core.SectionPos;
import net.minecraft.core.particles.ItemParticleOption;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.ai.goal.MoveToBlockGoal;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.chunk.ChunkAccess;
import net.minecraft.world.level.chunk.ChunkStatus;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.common.ForgeHooks;

/* renamed from: net.ltxprogrammer.turned.entity.ai.RevertBlockStateGoal */
/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/entity/ai/RevertBlockStateGoal.class */
public class RevertBlockStateGoal<T extends Comparable<T>> extends MoveToBlockGoal {
    private final Property<T> property;
    private final T targetValue;
    private final T goalValue;
    private final Mob removerMob;
    private int ticksSinceReachedGoal;
    private static final int WAIT_AFTER_BLOCK_FOUND = 20;

    public RevertBlockStateGoal(Property<T> property, T from, T to, PathfinderMob p_25841_, double p_25842_, int p_25843_) {
        super(p_25841_, p_25842_, 24, p_25843_);
        this.property = property;
        this.targetValue = from;
        this.goalValue = to;
        this.removerMob = p_25841_;
    }

    public boolean canUse() {
        if (!ForgeHooks.canEntityDestroy(this.removerMob.level, this.blockPos, this.removerMob)) {
            return false;
        }
        if (this.nextStartTick > 0) {
            this.nextStartTick--;
            return false;
        } else if (tryFindBlock()) {
            this.nextStartTick = reducedTickDelay(WAIT_AFTER_BLOCK_FOUND);
            return true;
        } else {
            this.nextStartTick = nextStartTick(this.mob);
            return false;
        }
    }

    private boolean tryFindBlock() {
        if (!isValidTarget(this.mob.level, this.blockPos)) {
            return findNearestBlock();
        }
        return true;
    }

    public void stop() {
        stop();
        this.removerMob.fallDistance = 1.0f;
    }

    public void start() {
        start();
        this.ticksSinceReachedGoal = 0;
    }

    public void playDestroyProgressSound(LevelAccessor p_25847_, BlockPos p_25848_) {
    }

    public void playBreakSound(Level p_25845_, BlockPos p_25846_) {
    }

    public void tick() {
        tick();
        Level level = this.removerMob.level;
        BlockPos blockpos1 = getPosWithBlock(this.removerMob.blockPosition(), level);
        Random random = this.removerMob.getRandom();
        if (isReachedTarget() && blockpos1 != null) {
            if (this.ticksSinceReachedGoal > 0) {
                Vec3 vec3 = this.removerMob.getDeltaMovement();
                this.removerMob.setDeltaMovement(vec3.x, 0.3d, vec3.z);
                if (!level.isClientSide) {
                    ((ServerLevel) level).sendParticles(new ItemParticleOption(ParticleTypes.ITEM, new ItemStack(Items.EGG)), ((double) blockpos1.getX()) + 0.5d, ((double) blockpos1.getY()) + 0.7d, ((double) blockpos1.getZ()) + 0.5d, 3, (((double) random.nextFloat()) - 0.5d) * 0.08d, (((double) random.nextFloat()) - 0.5d) * 0.08d, (((double) random.nextFloat()) - 0.5d) * 0.08d, 0.15000000596046448d);
                }
            }
            if (this.ticksSinceReachedGoal % 2 == 0) {
                Vec3 vec31 = this.removerMob.getDeltaMovement();
                this.removerMob.setDeltaMovement(vec31.x, -0.3d, vec31.z);
                if (this.ticksSinceReachedGoal % 6 == 0) {
                    playDestroyProgressSound(level, this.blockPos);
                }
            }
            if (this.ticksSinceReachedGoal > 60) {
                level.setBlockAndUpdate(blockpos1, level.getBlockState(blockpos1).setValue(this.property, this.goalValue));
                if (!level.isClientSide) {
                    for (int i = 0; i < WAIT_AFTER_BLOCK_FOUND; i++) {
                        ((ServerLevel) level).sendParticles(ParticleTypes.POOF, ((double) blockpos1.getX()) + 0.5d, blockpos1.getY(), ((double) blockpos1.getZ()) + 0.5d, 1, random.nextGaussian() * 0.02d, random.nextGaussian() * 0.02d, random.nextGaussian() * 0.02d, 0.15000000596046448d);
                    }
                    playBreakSound(level, blockpos1);
                }
            }
            this.ticksSinceReachedGoal++;
        }
    }

    @Nullable
    private BlockPos getPosWithBlock(BlockPos p_25853_, BlockGetter p_25854_) {
        if (p_25854_.getBlockState(p_25853_).getProperties().contains(this.property) && p_25854_.getBlockState(p_25853_).getValue(this.property).compareTo(this.targetValue) == 0) {
            return p_25853_;
        }
        BlockPos[] ablockpos = {p_25853_.below(), p_25853_.west(), p_25853_.east(), p_25853_.north(), p_25853_.south(), p_25853_.below().below()};
        for (BlockPos blockpos : ablockpos) {
            if (p_25854_.getBlockState(blockpos).getProperties().contains(this.property) && p_25854_.getBlockState(blockpos).getValue(this.property).compareTo(this.targetValue) == 0) {
                return blockpos;
            }
        }
        return null;
    }

    protected boolean isValidTarget(LevelReader p_25850_, BlockPos p_25851_) {
        ChunkAccess chunkaccess = p_25850_.getChunk(SectionPos.blockToSectionCoord(p_25851_.getX()), SectionPos.blockToSectionCoord(p_25851_.getZ()), ChunkStatus.FULL, false);
        return chunkaccess != null && chunkaccess.getBlockState(p_25851_).getProperties().contains(this.property) && chunkaccess.getBlockState(p_25851_).getValue(this.property).compareTo(this.targetValue) == 0 && chunkaccess.getBlockState(p_25851_.above()).isAir() && chunkaccess.getBlockState(p_25851_.above(2)).isAir();
    }
}
