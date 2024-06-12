//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.ltxprogrammer.turned.entity.ai;

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
        } else if (this.nextStartTick > 0) {
            --this.nextStartTick;
            return false;
        } else if (this.tryFindBlock()) {
            this.nextStartTick = reducedTickDelay(20);
            return true;
        } else {
            this.nextStartTick = this.nextStartTick(this.mob);
            return false;
        }
    }

    private boolean tryFindBlock() {
        return this.blockPos != null && this.isValidTarget(this.mob.level, this.blockPos) ? true : this.findNearestBlock();
    }

    public void stop() {
        super.stop();
        this.removerMob.fallDistance = 1.0F;
    }

    public void start() {
        super.start();
        this.ticksSinceReachedGoal = 0;
    }

    public void playDestroyProgressSound(LevelAccessor p_25847_, BlockPos p_25848_) {
    }

    public void playBreakSound(Level p_25845_, BlockPos p_25846_) {
    }

    public void tick() {
        super.tick();
        Level level = this.removerMob.level;
        BlockPos blockpos = this.removerMob.blockPosition();
        BlockPos blockpos1 = this.getPosWithBlock(blockpos, level);
        Random random = this.removerMob.getRandom();
        if (this.isReachedTarget() && blockpos1 != null) {
            Vec3 vec31;
            double d3;
            if (this.ticksSinceReachedGoal > 0) {
                vec31 = this.removerMob.getDeltaMovement();
                this.removerMob.setDeltaMovement(vec31.x, 0.3, vec31.z);
                if (!level.isClientSide) {
                    d3 = 0.08;
                    ((ServerLevel)level).sendParticles(new ItemParticleOption(ParticleTypes.ITEM, new ItemStack(Items.EGG)), (double)blockpos1.getX() + 0.5, (double)blockpos1.getY() + 0.7, (double)blockpos1.getZ() + 0.5, 3, ((double)random.nextFloat() - 0.5) * 0.08, ((double)random.nextFloat() - 0.5) * 0.08, ((double)random.nextFloat() - 0.5) * 0.08, 0.15000000596046448);
                }
            }

            if (this.ticksSinceReachedGoal % 2 == 0) {
                vec31 = this.removerMob.getDeltaMovement();
                this.removerMob.setDeltaMovement(vec31.x, -0.3, vec31.z);
                if (this.ticksSinceReachedGoal % 6 == 0) {
                    this.playDestroyProgressSound(level, this.blockPos);
                }
            }

            if (this.ticksSinceReachedGoal > 60) {
                level.setBlockAndUpdate(blockpos1, (BlockState)level.getBlockState(blockpos1).setValue(this.property, this.goalValue));
                if (!level.isClientSide) {
                    for(int i = 0; i < 20; ++i) {
                        d3 = random.nextGaussian() * 0.02;
                        double d1 = random.nextGaussian() * 0.02;
                        double d2 = random.nextGaussian() * 0.02;
                        ((ServerLevel)level).sendParticles(ParticleTypes.POOF, (double)blockpos1.getX() + 0.5, (double)blockpos1.getY(), (double)blockpos1.getZ() + 0.5, 1, d3, d1, d2, 0.15000000596046448);
                    }

                    this.playBreakSound(level, blockpos1);
                }
            }

            ++this.ticksSinceReachedGoal;
        }

    }

    @Nullable
    private BlockPos getPosWithBlock(BlockPos p_25853_, BlockGetter p_25854_) {
        if (p_25854_.getBlockState(p_25853_).getProperties().contains(this.property) && p_25854_.getBlockState(p_25853_).getValue(this.property).compareTo(this.targetValue) == 0) {
            return p_25853_;
        } else {
            BlockPos[] ablockpos = new BlockPos[]{p_25853_.below(), p_25853_.west(), p_25853_.east(), p_25853_.north(), p_25853_.south(), p_25853_.below().below()};
            BlockPos[] var4 = ablockpos;
            int var5 = ablockpos.length;

            for(int var6 = 0; var6 < var5; ++var6) {
                BlockPos blockpos = var4[var6];
                if (p_25854_.getBlockState(blockpos).getProperties().contains(this.property) && p_25854_.getBlockState(blockpos).getValue(this.property).compareTo(this.targetValue) == 0) {
                    return blockpos;
                }
            }

            return null;
        }
    }

    protected boolean isValidTarget(LevelReader p_25850_, BlockPos p_25851_) {
        ChunkAccess chunkaccess = p_25850_.getChunk(SectionPos.blockToSectionCoord(p_25851_.getX()), SectionPos.blockToSectionCoord(p_25851_.getZ()), ChunkStatus.FULL, false);
        if (chunkaccess == null) {
            return false;
        } else {
            return chunkaccess.getBlockState(p_25851_).getProperties().contains(this.property) && chunkaccess.getBlockState(p_25851_).getValue(this.property).compareTo(this.targetValue) == 0 && chunkaccess.getBlockState(p_25851_.above()).isAir() && chunkaccess.getBlockState(p_25851_.above(2)).isAir();
        }
    }
}
