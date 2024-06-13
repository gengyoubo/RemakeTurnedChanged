package net.ltxprogrammer.turned.procedures;

import net.ltxprogrammer.changed.entity.beast.DarkLatexYufeng;
import net.ltxprogrammer.changed.init.ChangedEntities;
import net.ltxprogrammer.changed.init.ChangedSounds;
import net.ltxprogrammer.turned.entity.DLbeeEntity;
import net.ltxprogrammer.turned.entity.DarkLatexFoxEntity;
import net.ltxprogrammer.turned.entity.DarkLatexFoxScientistEntity;
import net.ltxprogrammer.turned.entity.DarkLatexFoxSniperEntity;
import net.ltxprogrammer.turned.entity.DarkLatexSnakeEntity;
import net.ltxprogrammer.turned.entity.DarklatexEntity;
import net.ltxprogrammer.turned.entity.DlSquidDogEntity;
import net.ltxprogrammer.turned.entity.DlsharkEntity;
import net.ltxprogrammer.turned.entity.EvilScientistEntity;
import net.ltxprogrammer.turned.entity.EvilSniperEntity;
import net.ltxprogrammer.turned.entity.HertxEntity;
import net.ltxprogrammer.turned.entity.NoiseStalkerEntity;
import net.ltxprogrammer.turned.entity.ScientistEntity;
import LatexModEntities;
import net.ltxprogrammer.turned.init.LatexModGameRules;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
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

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/DarkLatexFoxThisEntityKillsAnotherOneProcedure.class */
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
                if (world instanceof Level _level) {
                    if (!_level.isClientSide()) {
                        _level.playSound(null, new BlockPos(x, y, z), ChangedSounds.POISON, SoundSource.NEUTRAL, 1.0f, 1.0f);
                    } else {
                        _level.playLocalSound(x, y, z, ChangedSounds.POISON, SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                    }
                }
                if (Math.random() < 0.2d) {
                    if (world instanceof ServerLevel _level2) {
                        Entity entityToSpawn = new DarkLatexFoxSniperEntity((EntityType<DarkLatexFoxSniperEntity>) LatexModEntities.DARK_LATEX_FOX_SNIPER.get(), _level2);
                        entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                        ((Mob) entityToSpawn).finalizeSpawn(_level2, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn);
                    }
                } else if (world instanceof ServerLevel _level3) {
                    Entity entityToSpawn2 = new DarkLatexFoxScientistEntity((EntityType<DarkLatexFoxScientistEntity>) LatexModEntities.DARK_LATEX_FOX_SCIENTIST.get(), _level3);
                    entityToSpawn2.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                    ((Mob) entityToSpawn2).finalizeSpawn(_level3, world.getCurrentDifficultyAt(entityToSpawn2.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                    world.addFreshEntity(entityToSpawn2);
                }
            } else if (Math.random() < 0.4d) {
                if (!entity.level.isClientSide()) {
                    entity.discard();
                }
                if (world instanceof Level _level4) {
                    if (!_level4.isClientSide()) {
                        _level4.playSound(null, new BlockPos(x, y, z), ChangedSounds.POISON, SoundSource.NEUTRAL, 1.0f, 1.0f);
                    } else {
                        _level4.playLocalSound(x, y, z, ChangedSounds.POISON, SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                    }
                }
                if (world instanceof ServerLevel _level5) {
                    Entity entityToSpawn3 = new DarkLatexFoxEntity((EntityType<DarkLatexFoxEntity>) LatexModEntities.DARK_LATEX_FOX.get(), _level5);
                    entityToSpawn3.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                    ((Mob) entityToSpawn3).finalizeSpawn(_level5, world.getCurrentDifficultyAt(entityToSpawn3.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                    world.addFreshEntity(entityToSpawn3);
                }
            } else if (Math.random() < 0.1d) {
                if (!entity.level.isClientSide()) {
                    entity.discard();
                }
                if (world instanceof Level _level6) {
                    if (!_level6.isClientSide()) {
                        _level6.playSound(null, new BlockPos(x, y, z), ChangedSounds.POISON, SoundSource.NEUTRAL, 1.0f, 1.0f);
                    } else {
                        _level6.playLocalSound(x, y, z, ChangedSounds.POISON, SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                    }
                }
                if (world instanceof ServerLevel _level7) {
                    Entity entityToSpawn4 = new DarkLatexYufeng(ChangedEntities.DARK_LATEX_YUFENG.get(), _level7);
                    entityToSpawn4.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                    ((Mob) entityToSpawn4).finalizeSpawn(_level7, world.getCurrentDifficultyAt(entityToSpawn4.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                    world.addFreshEntity(entityToSpawn4);
                }
            } else if (Math.random() < 0.1d) {
                if (!entity.level.isClientSide()) {
                    entity.discard();
                }
                if (world instanceof Level _level8) {
                    if (!_level8.isClientSide()) {
                        _level8.playSound(null, new BlockPos(x, y, z), ChangedSounds.POISON, SoundSource.NEUTRAL, 1.0f, 1.0f);
                    } else {
                        _level8.playLocalSound(x, y, z, ChangedSounds.POISON, SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                    }
                }
                if (world instanceof ServerLevel _level9) {
                    Entity entityToSpawn5 = new NoiseStalkerEntity((EntityType<NoiseStalkerEntity>) LatexModEntities.NOISE_STALKER.get(), _level9);
                    entityToSpawn5.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                    ((Mob) entityToSpawn5).finalizeSpawn(_level9, world.getCurrentDifficultyAt(entityToSpawn5.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                    world.addFreshEntity(entityToSpawn5);
                }
            } else if (Math.random() < 0.1d) {
                if (!entity.level.isClientSide()) {
                    entity.discard();
                }
                if (world instanceof Level _level10) {
                    if (!_level10.isClientSide()) {
                        _level10.playSound(null, new BlockPos(x, y, z), ChangedSounds.POISON, SoundSource.NEUTRAL, 1.0f, 1.0f);
                    } else {
                        _level10.playLocalSound(x, y, z, ChangedSounds.POISON, SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                    }
                }
                if (world instanceof ServerLevel _level11) {
                    Entity entityToSpawn6 = new DlsharkEntity((EntityType<DlsharkEntity>) LatexModEntities.DLSHARK.get(), _level11);
                    entityToSpawn6.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                    ((Mob) entityToSpawn6).finalizeSpawn(_level11, world.getCurrentDifficultyAt(entityToSpawn6.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                    world.addFreshEntity(entityToSpawn6);
                }
            } else if (Math.random() < 0.1d) {
                if (!entity.level.isClientSide()) {
                    entity.discard();
                }
                if (world instanceof Level _level12) {
                    if (!_level12.isClientSide()) {
                        _level12.playSound(null, new BlockPos(x, y, z), ChangedSounds.POISON, SoundSource.NEUTRAL, 1.0f, 1.0f);
                    } else {
                        _level12.playLocalSound(x, y, z, ChangedSounds.POISON, SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                    }
                }
                if (world instanceof ServerLevel _level13) {
                    Entity entityToSpawn7 = new DarkLatexSnakeEntity((EntityType<DarkLatexSnakeEntity>) LatexModEntities.DARK_LATEX_SNAKE.get(), _level13);
                    entityToSpawn7.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                    ((Mob) entityToSpawn7).finalizeSpawn(_level13, world.getCurrentDifficultyAt(entityToSpawn7.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                    world.addFreshEntity(entityToSpawn7);
                }
            } else if (Math.random() < 0.1d) {
                if (!entity.level.isClientSide()) {
                    entity.discard();
                }
                if (world instanceof Level _level14) {
                    if (!_level14.isClientSide()) {
                        _level14.playSound(null, new BlockPos(x, y, z), ChangedSounds.POISON, SoundSource.NEUTRAL, 1.0f, 1.0f);
                    } else {
                        _level14.playLocalSound(x, y, z, ChangedSounds.POISON, SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                    }
                }
                if (world instanceof ServerLevel _level15) {
                    Entity entityToSpawn8 = new DLbeeEntity((EntityType<DLbeeEntity>) LatexModEntities.D_LBEE.get(), _level15);
                    entityToSpawn8.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                    ((Mob) entityToSpawn8).finalizeSpawn(_level15, world.getCurrentDifficultyAt(entityToSpawn8.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                    world.addFreshEntity(entityToSpawn8);
                }
            } else if (Math.random() < 0.1d) {
                if (!entity.level.isClientSide()) {
                    entity.discard();
                }
                if (world instanceof Level _level16) {
                    if (!_level16.isClientSide()) {
                        _level16.playSound(null, new BlockPos(x, y, z), ChangedSounds.POISON, SoundSource.NEUTRAL, 1.0f, 1.0f);
                    } else {
                        _level16.playLocalSound(x, y, z, ChangedSounds.POISON, SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                    }
                }
                if (world instanceof ServerLevel _level17) {
                    Entity entityToSpawn9 = new DlSquidDogEntity((EntityType<DlSquidDogEntity>) LatexModEntities.DL_SQUID_DOG.get(), _level17);
                    entityToSpawn9.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                    ((Mob) entityToSpawn9).finalizeSpawn(_level17, world.getCurrentDifficultyAt(entityToSpawn9.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                    world.addFreshEntity(entityToSpawn9);
                }
            } else {
                if (!entity.level.isClientSide()) {
                    entity.discard();
                }
                if (world instanceof Level _level18) {
                    if (!_level18.isClientSide()) {
                        _level18.playSound(null, new BlockPos(x, y, z), ChangedSounds.POISON, SoundSource.NEUTRAL, 1.0f, 1.0f);
                    } else {
                        _level18.playLocalSound(x, y, z, ChangedSounds.POISON, SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                    }
                }
                if (world instanceof ServerLevel _level19) {
                    Entity entityToSpawn10 = new DarklatexEntity((EntityType<DarklatexEntity>) LatexModEntities.DARKLATEX.get(), _level19);
                    entityToSpawn10.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                    ((Mob) entityToSpawn10).finalizeSpawn(_level19, world.getCurrentDifficultyAt(entityToSpawn10.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                    world.addFreshEntity(entityToSpawn10);
                }
            }
        }
    }
}
