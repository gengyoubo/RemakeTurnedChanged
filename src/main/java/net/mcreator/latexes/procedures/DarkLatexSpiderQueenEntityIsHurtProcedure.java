package net.mcreator.latexes.procedures;

import net.mcreator.latexes.entity.DarklatexslugEntity;
import net.mcreator.latexes.init.LatexModBlocks;
import net.mcreator.latexes.init.LatexModEntities;
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
import net.minecraftforge.registries.ForgeRegistries;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/DarkLatexSpiderQueenEntityIsHurtProcedure.class */
public class DarkLatexSpiderQueenEntityIsHurtProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        float f;
        if (entity != null) {
            if (Math.random() < 0.0025d) {
                if (world instanceof ServerLevel) {
                    ((ServerLevel) world).sendParticles(ParticleTypes.ITEM_SLIME, x, y, z, 5, 3.0d, 1.0d, 3.0d, 1.0d);
                }
                if (world instanceof Level) {
                    Level _level = (Level) world;
                    if (!_level.isClientSide()) {
                        _level.playSound((Player) null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.death")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                    } else {
                        _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.death")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                    }
                }
                world.setBlock(new BlockPos(x, y, z), ((Block) LatexModBlocks.DARKLATEXBLOCK.get()).defaultBlockState(), 3);
                world.setBlock(new BlockPos(x, y + 1.0d, z), ((Block) LatexModBlocks.LATEXCOBWEBFIX.get()).defaultBlockState(), 3);
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
                if (world instanceof Level) {
                    Level _level2 = (Level) world;
                    if (!_level2.isClientSide()) {
                        _level2.playSound((Player) null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.slime_block.place")), SoundSource.NEUTRAL, 1.0f, 2.0f);
                    } else {
                        _level2.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.slime_block.place")), SoundSource.NEUTRAL, 1.0f, 2.0f, false);
                    }
                }
                if (world instanceof Level) {
                    Level _level3 = (Level) world;
                    if (!_level3.isClientSide()) {
                        _level3.playSound((Player) null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:computer_on")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                    } else {
                        _level3.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:computer_on")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                    }
                }
                if (world instanceof ServerLevel) {
                    ServerLevel _level4 = (ServerLevel) world;
                    Entity entityToSpawn = new DarklatexslugEntity((EntityType<DarklatexslugEntity>) ((EntityType) LatexModEntities.DARKLATEXSLUG.get()), (Level) _level4);
                    entityToSpawn.moveTo(x, y, z, 0.0f, 0.0f);
                    entityToSpawn.setYBodyRot(0.0f);
                    entityToSpawn.setYHeadRot(0.0f);
                    entityToSpawn.setDeltaMovement(1.0d, 0.0d, 0.0d);
                    if (entityToSpawn instanceof Mob) {
                        ((Mob) entityToSpawn).finalizeSpawn(_level4, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                    }
                    world.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel) {
                    ServerLevel _level5 = (ServerLevel) world;
                    Entity entityToSpawn2 = new DarklatexslugEntity((EntityType<DarklatexslugEntity>) ((EntityType) LatexModEntities.DARKLATEXSLUG.get()), (Level) _level5);
                    entityToSpawn2.moveTo(x, y, z, 0.0f, 0.0f);
                    entityToSpawn2.setYBodyRot(0.0f);
                    entityToSpawn2.setYHeadRot(0.0f);
                    entityToSpawn2.setDeltaMovement(-1.0d, 0.0d, 0.0d);
                    if (entityToSpawn2 instanceof Mob) {
                        ((Mob) entityToSpawn2).finalizeSpawn(_level5, world.getCurrentDifficultyAt(entityToSpawn2.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                    }
                    world.addFreshEntity(entityToSpawn2);
                }
                if (world instanceof ServerLevel) {
                    ServerLevel _level6 = (ServerLevel) world;
                    Entity entityToSpawn3 = new DarklatexslugEntity((EntityType<DarklatexslugEntity>) ((EntityType) LatexModEntities.DARKLATEXSLUG.get()), (Level) _level6);
                    entityToSpawn3.moveTo(x, y, z, 0.0f, 0.0f);
                    entityToSpawn3.setYBodyRot(0.0f);
                    entityToSpawn3.setYHeadRot(0.0f);
                    entityToSpawn3.setDeltaMovement(0.0d, 0.0d, -1.0d);
                    if (entityToSpawn3 instanceof Mob) {
                        ((Mob) entityToSpawn3).finalizeSpawn(_level6, world.getCurrentDifficultyAt(entityToSpawn3.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                    }
                    world.addFreshEntity(entityToSpawn3);
                }
            }
        }
    }
}
