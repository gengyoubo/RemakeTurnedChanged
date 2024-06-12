package net.ltxprogrammer.turned.procedures;

import net.ltxprogrammer.changed.block.AbstractLatexBlock;
import net.ltxprogrammer.changed.entity.LatexType;
import net.ltxprogrammer.changed.init.ChangedBlocks;
import net.ltxprogrammer.turned.entity.DarklatexslugEntity;
import net.ltxprogrammer.turned.init.LatexModEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Objects;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/DarkLatexSpiderQueenEntityIsHurtProcedure.class */
public class DarkLatexSpiderQueenEntityIsHurtProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        float f;
        if (entity != null) {
            if (Math.random() < 0.0025d) {
                if (world instanceof ServerLevel) {
                    ((ServerLevel) world).sendParticles(ParticleTypes.ITEM_SLIME, x, y, z, 5, 3.0d, 1.0d, 3.0d, 1.0d);
                }
                if (world instanceof Level _level) {
                    if (!_level.isClientSide()) {
                        _level.playSound(null, new BlockPos(x, y, z), Objects.requireNonNull(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.death"))), SoundSource.NEUTRAL, 1.0f, 1.0f);
                    } else {
                        _level.playLocalSound(x, y, z, Objects.requireNonNull(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.death"))), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                    }
                }
                world.setBlock(new BlockPos(x, y, z), ChangedBlocks.DARK_LATEX_BLOCK.get().defaultBlockState(), 3);
                world.setBlock(new BlockPos(x, y + 1.0d, z), Blocks.COBWEB.defaultBlockState().setValue(AbstractLatexBlock.COVERED, LatexType.DARK_LATEX), 3);
            }
            if (entity instanceof LivingEntity) {
                f = ((LivingEntity) entity).getHealth();
            } else {
                f = -1.0f;
            }
            if (f <= (entity instanceof LivingEntity ? ((LivingEntity) entity).getMaxHealth() : -1.0f) / 2.0f && Math.random() < 0.001d) {
                if (world instanceof ServerLevel) {
                    ((ServerLevel) world).sendParticles(ParticleTypes.ITEM_SNOWBALL, x, y, z, 5, 3.0d, 3.0d, 3.0d, 1.0d);
                }
                if (world instanceof Level _level2) {
                    if (!_level2.isClientSide()) {
                        _level2.playSound(null, new BlockPos(x, y, z), Objects.requireNonNull(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.slime_block.place"))), SoundSource.NEUTRAL, 1.0f, 2.0f);
                    } else {
                        _level2.playLocalSound(x, y, z, Objects.requireNonNull(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.slime_block.place"))), SoundSource.NEUTRAL, 1.0f, 2.0f, false);
                    }
                }
                if (world instanceof Level _level3) {
                    if (!_level3.isClientSide()) {
                        _level3.playSound(null, new BlockPos(x, y, z), Objects.requireNonNull(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:computer_on"))), SoundSource.NEUTRAL, 1.0f, 1.0f);
                    } else {
                        _level3.playLocalSound(x, y, z, Objects.requireNonNull(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:computer_on"))), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                    }
                }
                if (world instanceof ServerLevel _level4) {
                    Entity entityToSpawn = new DarklatexslugEntity((EntityType<DarklatexslugEntity>) LatexModEntities.DARKLATEXSLUG.get(), _level4);
                    entityToSpawn.moveTo(x, y, z, 0.0f, 0.0f);
                    entityToSpawn.setYBodyRot(0.0f);
                    entityToSpawn.setYHeadRot(0.0f);
                    entityToSpawn.setDeltaMovement(1.0d, 0.0d, 0.0d);
                    ((Mob) entityToSpawn).finalizeSpawn(_level4, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                    world.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level5) {
                    Entity entityToSpawn2 = new DarklatexslugEntity((EntityType<DarklatexslugEntity>) LatexModEntities.DARKLATEXSLUG.get(), _level5);
                    entityToSpawn2.moveTo(x, y, z, 0.0f, 0.0f);
                    entityToSpawn2.setYBodyRot(0.0f);
                    entityToSpawn2.setYHeadRot(0.0f);
                    entityToSpawn2.setDeltaMovement(-1.0d, 0.0d, 0.0d);
                    ((Mob) entityToSpawn2).finalizeSpawn(_level5, world.getCurrentDifficultyAt(entityToSpawn2.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                    world.addFreshEntity(entityToSpawn2);
                }
                if (world instanceof ServerLevel _level6) {
                    Entity entityToSpawn3 = new DarklatexslugEntity((EntityType<DarklatexslugEntity>) LatexModEntities.DARKLATEXSLUG.get(), _level6);
                    entityToSpawn3.moveTo(x, y, z, 0.0f, 0.0f);
                    entityToSpawn3.setYBodyRot(0.0f);
                    entityToSpawn3.setYHeadRot(0.0f);
                    entityToSpawn3.setDeltaMovement(0.0d, 0.0d, -1.0d);
                    ((Mob) entityToSpawn3).finalizeSpawn(_level6, world.getCurrentDifficultyAt(entityToSpawn3.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                    world.addFreshEntity(entityToSpawn3);
                }
            }
        }
    }
}
