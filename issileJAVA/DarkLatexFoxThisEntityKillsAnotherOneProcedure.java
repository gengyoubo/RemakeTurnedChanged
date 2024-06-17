package net.mcreator.latexes.procedures;

import net.mcreator.latexes.entity.DLbeeEntity;
import net.mcreator.latexes.entity.DarkLatexFoxEntity;
import net.mcreator.latexes.entity.DarkLatexFoxScientistEntity;
import net.mcreator.latexes.entity.DarkLatexFoxSniperEntity;
import net.mcreator.latexes.entity.DarkLatexSnakeEntity;
import net.mcreator.latexes.entity.DarklatexEntity;
import net.mcreator.latexes.entity.DlSquidDogEntity;
import net.mcreator.latexes.entity.DlsharkEntity;
import net.mcreator.latexes.entity.EvilScientistEntity;
import net.mcreator.latexes.entity.EvilSniperEntity;
import net.mcreator.latexes.entity.HertxEntity;
import net.mcreator.latexes.entity.NoiseStalkerEntity;
import net.mcreator.latexes.entity.ScientistEntity;
import net.mcreator.latexes.entity.YufengEntity;
import net.mcreator.latexes.init.LatexModEntities;
import net.mcreator.latexes.init.LatexModGameRules;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.animal.IronGolem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.registries.ForgeRegistries;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/DarkLatexFoxThisEntityKillsAnotherOneProcedure.class */
public class DarkLatexFoxThisEntityKillsAnotherOneProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity != null && world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXTRANSFUR)) {
            if ((entity instanceof DarklatexEntity) || (entity instanceof HertxEntity) || (entity instanceof IronGolem) || (entity instanceof Player)) {
                return;
            }
            if ((entity instanceof ScientistEntity) || (entity instanceof EvilScientistEntity) || (entity instanceof EvilSniperEntity)) {
                if (!entity.level.isClientSide()) {
                    entity.discard();
                }
                if (world instanceof Level) {
                    Level _level = (Level) world;
                    if (!_level.isClientSide()) {
                        _level.playSound((Player) null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                    } else {
                        _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                    }
                }
                if (Math.random() < 0.2d) {
                    if (world instanceof ServerLevel) {
                        ServerLevel _level2 = (ServerLevel) world;
                        Entity entityToSpawn = new DarkLatexFoxSniperEntity((EntityType<DarkLatexFoxSniperEntity>) ((EntityType) LatexModEntities.DARK_LATEX_FOX_SNIPER.get()), (Level) _level2);
                        entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                        if (entityToSpawn instanceof Mob) {
                            ((Mob) entityToSpawn).finalizeSpawn(_level2, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn);
                    }
                } else if (world instanceof ServerLevel) {
                    ServerLevel _level3 = (ServerLevel) world;
                    Entity entityToSpawn2 = new DarkLatexFoxScientistEntity((EntityType<DarkLatexFoxScientistEntity>) ((EntityType) LatexModEntities.DARK_LATEX_FOX_SCIENTIST.get()), (Level) _level3);
                    entityToSpawn2.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                    if (entityToSpawn2 instanceof Mob) {
                        ((Mob) entityToSpawn2).finalizeSpawn(_level3, world.getCurrentDifficultyAt(entityToSpawn2.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                    }
                    world.addFreshEntity(entityToSpawn2);
                }
            } else if (Math.random() < 0.4d) {
                if (!entity.level.isClientSide()) {
                    entity.discard();
                }
                if (world instanceof Level) {
                    Level _level4 = (Level) world;
                    if (!_level4.isClientSide()) {
                        _level4.playSound((Player) null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                    } else {
                        _level4.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                    }
                }
                if (world instanceof ServerLevel) {
                    ServerLevel _level5 = (ServerLevel) world;
                    Entity entityToSpawn3 = new DarkLatexFoxEntity((EntityType<DarkLatexFoxEntity>) ((EntityType) LatexModEntities.DARK_LATEX_FOX.get()), (Level) _level5);
                    entityToSpawn3.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                    if (entityToSpawn3 instanceof Mob) {
                        ((Mob) entityToSpawn3).finalizeSpawn(_level5, world.getCurrentDifficultyAt(entityToSpawn3.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                    }
                    world.addFreshEntity(entityToSpawn3);
                }
            } else if (Math.random() < 0.1d) {
                if (!entity.level.isClientSide()) {
                    entity.discard();
                }
                if (world instanceof Level) {
                    Level _level6 = (Level) world;
                    if (!_level6.isClientSide()) {
                        _level6.playSound((Player) null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                    } else {
                        _level6.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                    }
                }
                if (world instanceof ServerLevel) {
                    ServerLevel _level7 = (ServerLevel) world;
                    Entity entityToSpawn4 = new YufengEntity((EntityType<YufengEntity>) ((EntityType) LatexModEntities.YUFENG.get()), (Level) _level7);
                    entityToSpawn4.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                    if (entityToSpawn4 instanceof Mob) {
                        ((Mob) entityToSpawn4).finalizeSpawn(_level7, world.getCurrentDifficultyAt(entityToSpawn4.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                    }
                    world.addFreshEntity(entityToSpawn4);
                }
            } else if (Math.random() < 0.1d) {
                if (!entity.level.isClientSide()) {
                    entity.discard();
                }
                if (world instanceof Level) {
                    Level _level8 = (Level) world;
                    if (!_level8.isClientSide()) {
                        _level8.playSound((Player) null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                    } else {
                        _level8.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                    }
                }
                if (world instanceof ServerLevel) {
                    ServerLevel _level9 = (ServerLevel) world;
                    Entity entityToSpawn5 = new NoiseStalkerEntity((EntityType<NoiseStalkerEntity>) ((EntityType) LatexModEntities.NOISE_STALKER.get()), (Level) _level9);
                    entityToSpawn5.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                    if (entityToSpawn5 instanceof Mob) {
                        ((Mob) entityToSpawn5).finalizeSpawn(_level9, world.getCurrentDifficultyAt(entityToSpawn5.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                    }
                    world.addFreshEntity(entityToSpawn5);
                }
            } else if (Math.random() < 0.1d) {
                if (!entity.level.isClientSide()) {
                    entity.discard();
                }
                if (world instanceof Level) {
                    Level _level10 = (Level) world;
                    if (!_level10.isClientSide()) {
                        _level10.playSound((Player) null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                    } else {
                        _level10.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                    }
                }
                if (world instanceof ServerLevel) {
                    ServerLevel _level11 = (ServerLevel) world;
                    Entity entityToSpawn6 = new DlsharkEntity((EntityType<DlsharkEntity>) ((EntityType) LatexModEntities.DLSHARK.get()), (Level) _level11);
                    entityToSpawn6.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                    if (entityToSpawn6 instanceof Mob) {
                        ((Mob) entityToSpawn6).finalizeSpawn(_level11, world.getCurrentDifficultyAt(entityToSpawn6.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                    }
                    world.addFreshEntity(entityToSpawn6);
                }
            } else if (Math.random() < 0.1d) {
                if (!entity.level.isClientSide()) {
                    entity.discard();
                }
                if (world instanceof Level) {
                    Level _level12 = (Level) world;
                    if (!_level12.isClientSide()) {
                        _level12.playSound((Player) null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                    } else {
                        _level12.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                    }
                }
                if (world instanceof ServerLevel) {
                    ServerLevel _level13 = (ServerLevel) world;
                    Entity entityToSpawn7 = new DarkLatexSnakeEntity((EntityType<DarkLatexSnakeEntity>) ((EntityType) LatexModEntities.DARK_LATEX_SNAKE.get()), (Level) _level13);
                    entityToSpawn7.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                    if (entityToSpawn7 instanceof Mob) {
                        ((Mob) entityToSpawn7).finalizeSpawn(_level13, world.getCurrentDifficultyAt(entityToSpawn7.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                    }
                    world.addFreshEntity(entityToSpawn7);
                }
            } else if (Math.random() < 0.1d) {
                if (!entity.level.isClientSide()) {
                    entity.discard();
                }
                if (world instanceof Level) {
                    Level _level14 = (Level) world;
                    if (!_level14.isClientSide()) {
                        _level14.playSound((Player) null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                    } else {
                        _level14.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                    }
                }
                if (world instanceof ServerLevel) {
                    ServerLevel _level15 = (ServerLevel) world;
                    Entity entityToSpawn8 = new DLbeeEntity((EntityType<DLbeeEntity>) ((EntityType) LatexModEntities.D_LBEE.get()), (Level) _level15);
                    entityToSpawn8.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                    if (entityToSpawn8 instanceof Mob) {
                        ((Mob) entityToSpawn8).finalizeSpawn(_level15, world.getCurrentDifficultyAt(entityToSpawn8.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                    }
                    world.addFreshEntity(entityToSpawn8);
                }
            } else if (Math.random() < 0.1d) {
                if (!entity.level.isClientSide()) {
                    entity.discard();
                }
                if (world instanceof Level) {
                    Level _level16 = (Level) world;
                    if (!_level16.isClientSide()) {
                        _level16.playSound((Player) null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                    } else {
                        _level16.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                    }
                }
                if (world instanceof ServerLevel) {
                    ServerLevel _level17 = (ServerLevel) world;
                    Entity entityToSpawn9 = new DlSquidDogEntity((EntityType<DlSquidDogEntity>) ((EntityType) LatexModEntities.DL_SQUID_DOG.get()), (Level) _level17);
                    entityToSpawn9.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                    if (entityToSpawn9 instanceof Mob) {
                        ((Mob) entityToSpawn9).finalizeSpawn(_level17, world.getCurrentDifficultyAt(entityToSpawn9.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                    }
                    world.addFreshEntity(entityToSpawn9);
                }
            } else {
                if (!entity.level.isClientSide()) {
                    entity.discard();
                }
                if (world instanceof Level) {
                    Level _level18 = (Level) world;
                    if (!_level18.isClientSide()) {
                        _level18.playSound((Player) null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                    } else {
                        _level18.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                    }
                }
                if (world instanceof ServerLevel) {
                    ServerLevel _level19 = (ServerLevel) world;
                    Entity entityToSpawn10 = new DarklatexEntity((EntityType<DarklatexEntity>) ((EntityType) LatexModEntities.DARKLATEX.get()), (Level) _level19);
                    entityToSpawn10.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                    if (entityToSpawn10 instanceof Mob) {
                        ((Mob) entityToSpawn10).finalizeSpawn(_level19, world.getCurrentDifficultyAt(entityToSpawn10.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                    }
                    world.addFreshEntity(entityToSpawn10);
                }
            }
        }
    }
}
