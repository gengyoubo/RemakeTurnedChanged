package net.ltxprogrammer.turned.procedures;

import net.ltxprogrammer.changed.entity.beast.DarkLatexDragon;
import net.ltxprogrammer.changed.entity.beast.DarkLatexYufeng;
import net.ltxprogrammer.changed.init.ChangedEntities;
import net.ltxprogrammer.turned.entity.DLbeeEntity;
import net.ltxprogrammer.turned.entity.DarkLatexFoxEntity;
import net.ltxprogrammer.turned.entity.DarkLatexFoxScientistEntity;
import net.ltxprogrammer.turned.entity.DarkLatexFoxSniperEntity;
import net.ltxprogrammer.turned.entity.DarkLatexMothEntity;
import net.ltxprogrammer.turned.entity.DarkLatexQueenBeeEntity;
import net.ltxprogrammer.turned.entity.DarkLatexSkeletonEntity;
import net.ltxprogrammer.turned.entity.DarkLatexSnakeEntity;
import net.ltxprogrammer.turned.entity.DarkLatexSnepEntity;
import net.ltxprogrammer.turned.entity.DarkLatexSpiderEntity;
import net.ltxprogrammer.turned.entity.DarkLatexSpiderQueenEntity;
import net.ltxprogrammer.turned.entity.DarklatexEntity;
import net.ltxprogrammer.turned.entity.DarklatexslugEntity;
import net.ltxprogrammer.turned.entity.DlsharkEntity;
import net.ltxprogrammer.turned.entity.NoiseStalkerEntity;
import net.ltxprogrammer.turned.entity.ScientistEntity;
import net.ltxprogrammer.turned.init.LatexModEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/LatexDropPodOnEntityTickUpdateProcedure.class */
public class LatexDropPodOnEntityTickUpdateProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity != null) {
            if (!(world.getBlockState(new BlockPos(x, y - 1.0d, z)).getBlock() == Blocks.CAVE_AIR || world.getBlockState(new BlockPos(x, y - 1.0d, z)).getBlock() == Blocks.VOID_AIR || world.getBlockState(new BlockPos(x, y - 1.0d, z)).getBlock() == Blocks.AIR || world.getBlockState(new BlockPos(x, y - 2.0d, z)).getBlock() == Blocks.CAVE_AIR || world.getBlockState(new BlockPos(x, y - 1.0d, z)).getBlock() == Blocks.VOID_AIR || world.getBlockState(new BlockPos(x, y - 1.0d, z)).getBlock() == Blocks.AIR || world.getBlockState(new BlockPos(x + 1.0d, y - 1.0d, z)).getBlock() == Blocks.CAVE_AIR || world.getBlockState(new BlockPos(x + 1.0d, y - 1.0d, z)).getBlock() == Blocks.VOID_AIR || world.getBlockState(new BlockPos(x + 1.0d, y - 1.0d, z)).getBlock() == Blocks.AIR || world.getBlockState(new BlockPos(x - 1.0d, y - 1.0d, z)).getBlock() == Blocks.CAVE_AIR || world.getBlockState(new BlockPos(x - 1.0d, y - 1.0d, z)).getBlock() == Blocks.VOID_AIR || world.getBlockState(new BlockPos(x - 1.0d, y - 1.0d, z)).getBlock() == Blocks.AIR || world.getBlockState(new BlockPos(x, y - 1.0d, z + 1.0d)).getBlock() == Blocks.CAVE_AIR || world.getBlockState(new BlockPos(x, y - 1.0d, z + 1.0d)).getBlock() == Blocks.VOID_AIR || world.getBlockState(new BlockPos(x, y - 1.0d, z + 1.0d)).getBlock() == Blocks.AIR || world.getBlockState(new BlockPos(x, y - 1.0d, z - 1.0d)).getBlock() == Blocks.CAVE_AIR || world.getBlockState(new BlockPos(x, y - 1.0d, z - 1.0d)).getBlock() == Blocks.VOID_AIR || world.getBlockState(new BlockPos(x, y - 1.0d, z - 1.0d)).getBlock() == Blocks.AIR)) {
                if (world instanceof Level _level) {
                    if (!_level.isClientSide()) {
                        _level.explode(null, x, y, z, 3.0f, Explosion.BlockInteraction.DESTROY);
                    }
                }
                if (Math.random() < 0.4d) {
                    if (world instanceof ServerLevel _level2) {
                        Entity entityToSpawn = new DarklatexslugEntity((EntityType<DarklatexslugEntity>) LatexModEntities.DARKLATEXSLUG.get(), _level2);
                        entityToSpawn.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn.setYBodyRot(0.0f);
                        entityToSpawn.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn).finalizeSpawn(_level2, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn);
                    }
                    if (world instanceof ServerLevel _level3) {
                        Entity entityToSpawn2 = new DarklatexslugEntity((EntityType<DarklatexslugEntity>) LatexModEntities.DARKLATEXSLUG.get(), _level3);
                        entityToSpawn2.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn2.setYBodyRot(0.0f);
                        entityToSpawn2.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn2).finalizeSpawn(_level3, world.getCurrentDifficultyAt(entityToSpawn2.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn2);
                    }
                    if (world instanceof ServerLevel _level4) {
                        Entity entityToSpawn3 = new DarklatexslugEntity((EntityType<DarklatexslugEntity>) LatexModEntities.DARKLATEXSLUG.get(), _level4);
                        entityToSpawn3.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn3.setYBodyRot(0.0f);
                        entityToSpawn3.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn3).finalizeSpawn(_level4, world.getCurrentDifficultyAt(entityToSpawn3.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn3);
                    }
                    if (world instanceof ServerLevel _level5) {
                        Entity entityToSpawn4 = new DarklatexslugEntity((EntityType<DarklatexslugEntity>) LatexModEntities.DARKLATEXSLUG.get(), _level5);
                        entityToSpawn4.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn4.setYBodyRot(0.0f);
                        entityToSpawn4.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn4).finalizeSpawn(_level5, world.getCurrentDifficultyAt(entityToSpawn4.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn4);
                    }
                    if (world instanceof ServerLevel _level6) {
                        Entity entityToSpawn5 = new DarklatexslugEntity((EntityType<DarklatexslugEntity>) LatexModEntities.DARKLATEXSLUG.get(), _level6);
                        entityToSpawn5.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn5.setYBodyRot(0.0f);
                        entityToSpawn5.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn5).finalizeSpawn(_level6, world.getCurrentDifficultyAt(entityToSpawn5.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn5);
                    }
                    if (world instanceof ServerLevel _level7) {
                        Entity entityToSpawn6 = new DarklatexslugEntity((EntityType<DarklatexslugEntity>) LatexModEntities.DARKLATEXSLUG.get(), _level7);
                        entityToSpawn6.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn6.setYBodyRot(0.0f);
                        entityToSpawn6.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn6).finalizeSpawn(_level7, world.getCurrentDifficultyAt(entityToSpawn6.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn6);
                    }
                    if (world instanceof ServerLevel _level8) {
                        Entity entityToSpawn7 = new DarklatexslugEntity((EntityType<DarklatexslugEntity>) LatexModEntities.DARKLATEXSLUG.get(), _level8);
                        entityToSpawn7.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn7.setYBodyRot(0.0f);
                        entityToSpawn7.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn7).finalizeSpawn(_level8, world.getCurrentDifficultyAt(entityToSpawn7.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn7);
                    }
                    if (world instanceof ServerLevel _level9) {
                        Entity entityToSpawn8 = new DarklatexslugEntity((EntityType<DarklatexslugEntity>) LatexModEntities.DARKLATEXSLUG.get(), _level9);
                        entityToSpawn8.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn8.setYBodyRot(0.0f);
                        entityToSpawn8.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn8).finalizeSpawn(_level9, world.getCurrentDifficultyAt(entityToSpawn8.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn8);
                    }
                } else if (Math.random() < 0.2d) {
                    if (world instanceof ServerLevel _level10) {
                        Entity entityToSpawn9 = new DarkLatexFoxScientistEntity((EntityType<DarkLatexFoxScientistEntity>) LatexModEntities.DARK_LATEX_FOX_SCIENTIST.get(), _level10);
                        entityToSpawn9.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn9.setYBodyRot(0.0f);
                        entityToSpawn9.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn9).finalizeSpawn(_level10, world.getCurrentDifficultyAt(entityToSpawn9.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn9);
                    }
                    if (world instanceof ServerLevel _level11) {
                        Entity entityToSpawn10 = new DarkLatexFoxSniperEntity((EntityType<DarkLatexFoxSniperEntity>) LatexModEntities.DARK_LATEX_FOX_SNIPER.get(), _level11);
                        entityToSpawn10.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn10.setYBodyRot(0.0f);
                        entityToSpawn10.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn10).finalizeSpawn(_level11, world.getCurrentDifficultyAt(entityToSpawn10.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn10);
                    }
                    if (world instanceof ServerLevel _level12) {
                        Entity entityToSpawn11 = new DarkLatexFoxScientistEntity((EntityType<DarkLatexFoxScientistEntity>) LatexModEntities.DARK_LATEX_FOX_SCIENTIST.get(), _level12);
                        entityToSpawn11.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn11.setYBodyRot(0.0f);
                        entityToSpawn11.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn11).finalizeSpawn(_level12, world.getCurrentDifficultyAt(entityToSpawn11.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn11);
                    }
                    if (world instanceof ServerLevel _level13) {
                        Entity entityToSpawn12 = new DarkLatexFoxScientistEntity((EntityType<DarkLatexFoxScientistEntity>) LatexModEntities.DARK_LATEX_FOX_SCIENTIST.get(), _level13);
                        entityToSpawn12.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn12.setYBodyRot(0.0f);
                        entityToSpawn12.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn12).finalizeSpawn(_level13, world.getCurrentDifficultyAt(entityToSpawn12.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn12);
                    }
                } else if (Math.random() < 0.2d) {
                    if (world instanceof ServerLevel _level14) {
                        Entity entityToSpawn13 = new DlsharkEntity((EntityType<DlsharkEntity>) LatexModEntities.DLSHARK.get(), _level14);
                        entityToSpawn13.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn13.setYBodyRot(0.0f);
                        entityToSpawn13.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn13).finalizeSpawn(_level14, world.getCurrentDifficultyAt(entityToSpawn13.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn13);
                    }
                    if (world instanceof ServerLevel _level15) {
                        Entity entityToSpawn14 = new DlsharkEntity((EntityType<DlsharkEntity>) LatexModEntities.DLSHARK.get(), _level15);
                        entityToSpawn14.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn14.setYBodyRot(0.0f);
                        entityToSpawn14.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn14).finalizeSpawn(_level15, world.getCurrentDifficultyAt(entityToSpawn14.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn14);
                    }
                    if (world instanceof ServerLevel _level16) {
                        Entity entityToSpawn15 = new DarkLatexMothEntity((EntityType<DarkLatexMothEntity>) LatexModEntities.DARK_LATEX_MOTH.get(), _level16);
                        entityToSpawn15.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn15.setYBodyRot(0.0f);
                        entityToSpawn15.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn15).finalizeSpawn(_level16, world.getCurrentDifficultyAt(entityToSpawn15.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn15);
                    }
                    if (world instanceof ServerLevel _level17) {
                        Entity entityToSpawn16 = new DarkLatexSkeletonEntity((EntityType<DarkLatexSkeletonEntity>) LatexModEntities.DARK_LATEX_SKELETON.get(), _level17);
                        entityToSpawn16.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn16.setYBodyRot(0.0f);
                        entityToSpawn16.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn16).finalizeSpawn(_level17, world.getCurrentDifficultyAt(entityToSpawn16.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn16);
                    }
                } else if (Math.random() < 0.2d) {
                    if (world instanceof ServerLevel _level18) {
                        Entity entityToSpawn17 = new DarkLatexSnakeEntity((EntityType<DarkLatexSnakeEntity>) LatexModEntities.DARK_LATEX_SNAKE.get(), _level18);
                        entityToSpawn17.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn17.setYBodyRot(0.0f);
                        entityToSpawn17.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn17).finalizeSpawn(_level18, world.getCurrentDifficultyAt(entityToSpawn17.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn17);
                    }
                    if (world instanceof ServerLevel _level19) {
                        Entity entityToSpawn18 = new DarkLatexSnepEntity((EntityType<DarkLatexSnepEntity>) LatexModEntities.DARK_LATEX_SNEP.get(), _level19);
                        entityToSpawn18.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn18.setYBodyRot(0.0f);
                        entityToSpawn18.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn18).finalizeSpawn(_level19, world.getCurrentDifficultyAt(entityToSpawn18.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn18);
                    }
                    if (world instanceof ServerLevel _level20) {
                        Entity entityToSpawn19 = new DarklatexEntity((EntityType<DarklatexEntity>) LatexModEntities.DARKLATEX.get(), _level20);
                        entityToSpawn19.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn19.setYBodyRot(0.0f);
                        entityToSpawn19.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn19).finalizeSpawn(_level20, world.getCurrentDifficultyAt(entityToSpawn19.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn19);
                    }
                } else if (Math.random() < 0.1d) {
                    if (world instanceof ServerLevel _level21) {
                        Entity entityToSpawn20 = new ScientistEntity((EntityType<ScientistEntity>) LatexModEntities.SCIENTIST.get(), _level21);
                        entityToSpawn20.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn20.setYBodyRot(0.0f);
                        entityToSpawn20.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn20).finalizeSpawn(_level21, world.getCurrentDifficultyAt(entityToSpawn20.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn20);
                    }
                    if (world instanceof ServerLevel _level22) {
                        Entity entityToSpawn21 = new ScientistEntity((EntityType<ScientistEntity>) LatexModEntities.SCIENTIST.get(), _level22);
                        entityToSpawn21.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn21.setYBodyRot(0.0f);
                        entityToSpawn21.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn21).finalizeSpawn(_level22, world.getCurrentDifficultyAt(entityToSpawn21.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn21);
                    }
                    if (world instanceof ServerLevel _level23) {
                        Entity entityToSpawn22 = new DarkLatexFoxScientistEntity((EntityType<DarkLatexFoxScientistEntity>) LatexModEntities.DARK_LATEX_FOX_SCIENTIST.get(), _level23);
                        entityToSpawn22.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn22.setYBodyRot(0.0f);
                        entityToSpawn22.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn22).finalizeSpawn(_level23, world.getCurrentDifficultyAt(entityToSpawn22.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn22);
                    }
                    if (world instanceof ServerLevel _level24) {
                        Entity entityToSpawn23 = new DarkLatexFoxScientistEntity((EntityType<DarkLatexFoxScientistEntity>) LatexModEntities.DARK_LATEX_FOX_SCIENTIST.get(), _level24);
                        entityToSpawn23.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn23.setYBodyRot(0.0f);
                        entityToSpawn23.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn23).finalizeSpawn(_level24, world.getCurrentDifficultyAt(entityToSpawn23.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn23);
                    }
                    if (world instanceof ServerLevel _level25) {
                        Entity entityToSpawn24 = new DarkLatexFoxSniperEntity((EntityType<DarkLatexFoxSniperEntity>) LatexModEntities.DARK_LATEX_FOX_SNIPER.get(), _level25);
                        entityToSpawn24.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn24.setYBodyRot(0.0f);
                        entityToSpawn24.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn24).finalizeSpawn(_level25, world.getCurrentDifficultyAt(entityToSpawn24.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn24);
                    }
                    if (world instanceof ServerLevel _level26) {
                        Entity entityToSpawn25 = new DarkLatexFoxScientistEntity((EntityType<DarkLatexFoxScientistEntity>) LatexModEntities.DARK_LATEX_FOX_SCIENTIST.get(), _level26);
                        entityToSpawn25.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn25.setYBodyRot(0.0f);
                        entityToSpawn25.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn25).finalizeSpawn(_level26, world.getCurrentDifficultyAt(entityToSpawn25.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn25);
                    }
                    if (world instanceof ServerLevel _level27) {
                        Entity entityToSpawn26 = new DarkLatexFoxScientistEntity((EntityType<DarkLatexFoxScientistEntity>) LatexModEntities.DARK_LATEX_FOX_SCIENTIST.get(), _level27);
                        entityToSpawn26.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn26.setYBodyRot(0.0f);
                        entityToSpawn26.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn26).finalizeSpawn(_level27, world.getCurrentDifficultyAt(entityToSpawn26.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn26);
                    }
                    if (world instanceof ServerLevel _level28) {
                        Entity entityToSpawn27 = new DarkLatexFoxSniperEntity((EntityType<DarkLatexFoxSniperEntity>) LatexModEntities.DARK_LATEX_FOX_SNIPER.get(), _level28);
                        entityToSpawn27.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn27.setYBodyRot(0.0f);
                        entityToSpawn27.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn27).finalizeSpawn(_level28, world.getCurrentDifficultyAt(entityToSpawn27.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn27);
                    }
                } else if (Math.random() < 0.2d) {
                    if (world instanceof ServerLevel _level29) {
                        Entity entityToSpawn28 = new NoiseStalkerEntity((EntityType<NoiseStalkerEntity>) LatexModEntities.NOISE_STALKER.get(), _level29);
                        entityToSpawn28.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn28.setYBodyRot(0.0f);
                        entityToSpawn28.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn28).finalizeSpawn(_level29, world.getCurrentDifficultyAt(entityToSpawn28.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn28);
                    }
                    if (world instanceof ServerLevel _level30) {
                        Entity entityToSpawn29 = new NoiseStalkerEntity((EntityType<NoiseStalkerEntity>) LatexModEntities.NOISE_STALKER.get(), _level30);
                        entityToSpawn29.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn29.setYBodyRot(0.0f);
                        entityToSpawn29.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn29).finalizeSpawn(_level30, world.getCurrentDifficultyAt(entityToSpawn29.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn29);
                    }
                    if (world instanceof ServerLevel _level31) {
                        Entity entityToSpawn30 = new NoiseStalkerEntity((EntityType<NoiseStalkerEntity>) LatexModEntities.NOISE_STALKER.get(), _level31);
                        entityToSpawn30.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn30.setYBodyRot(0.0f);
                        entityToSpawn30.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn30).finalizeSpawn(_level31, world.getCurrentDifficultyAt(entityToSpawn30.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn30);
                    }
                    if (world instanceof ServerLevel _level32) {
                        Entity entityToSpawn31 = new NoiseStalkerEntity((EntityType<NoiseStalkerEntity>) LatexModEntities.NOISE_STALKER.get(), _level32);
                        entityToSpawn31.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn31.setYBodyRot(0.0f);
                        entityToSpawn31.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn31).finalizeSpawn(_level32, world.getCurrentDifficultyAt(entityToSpawn31.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn31);
                    }
                } else if (Math.random() < 0.2d) {
                    if (world instanceof ServerLevel _level33) {
                        Entity entityToSpawn32 = new DarklatexEntity((EntityType<DarklatexEntity>) LatexModEntities.DARKLATEX.get(), _level33);
                        entityToSpawn32.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn32.setYBodyRot(0.0f);
                        entityToSpawn32.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn32).finalizeSpawn(_level33, world.getCurrentDifficultyAt(entityToSpawn32.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn32);
                    }
                    if (world instanceof ServerLevel _level34) {
                        Entity entityToSpawn33 = new DarkLatexSkeletonEntity((EntityType<DarkLatexSkeletonEntity>) LatexModEntities.DARK_LATEX_SKELETON.get(), _level34);
                        entityToSpawn33.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn33.setYBodyRot(0.0f);
                        entityToSpawn33.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn33).finalizeSpawn(_level34, world.getCurrentDifficultyAt(entityToSpawn33.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn33);
                    }
                    if (world instanceof ServerLevel _level35) {
                        Entity entityToSpawn34 = new DarklatexEntity((EntityType<DarklatexEntity>) LatexModEntities.DARKLATEX.get(), _level35);
                        entityToSpawn34.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn34.setYBodyRot(0.0f);
                        entityToSpawn34.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn34).finalizeSpawn(_level35, world.getCurrentDifficultyAt(entityToSpawn34.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn34);
                    }
                    if (world instanceof ServerLevel _level36) {
                        Entity entityToSpawn35 = new DarkLatexSkeletonEntity((EntityType<DarkLatexSkeletonEntity>) LatexModEntities.DARK_LATEX_SKELETON.get(), _level36);
                        entityToSpawn35.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn35.setYBodyRot(0.0f);
                        entityToSpawn35.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn35).finalizeSpawn(_level36, world.getCurrentDifficultyAt(entityToSpawn35.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn35);
                    }
                    if (world instanceof ServerLevel _level37) {
                        Entity entityToSpawn36 = new DarklatexEntity((EntityType<DarklatexEntity>) LatexModEntities.DARKLATEX.get(), _level37);
                        entityToSpawn36.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn36.setYBodyRot(0.0f);
                        entityToSpawn36.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn36).finalizeSpawn(_level37, world.getCurrentDifficultyAt(entityToSpawn36.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn36);
                    }
                } else if (Math.random() < 0.2d) {
                    if (world instanceof ServerLevel _level38) {
                        Entity entityToSpawn37 = new DarkLatexSpiderEntity((EntityType<DarkLatexSpiderEntity>) LatexModEntities.DARK_LATEX_SPIDER.get(), _level38);
                        entityToSpawn37.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn37.setYBodyRot(0.0f);
                        entityToSpawn37.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn37).finalizeSpawn(_level38, world.getCurrentDifficultyAt(entityToSpawn37.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn37);
                    }
                    if (world instanceof ServerLevel _level39) {
                        Entity entityToSpawn38 = new DarkLatexSpiderEntity((EntityType<DarkLatexSpiderEntity>) LatexModEntities.DARK_LATEX_SPIDER.get(), _level39);
                        entityToSpawn38.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn38.setYBodyRot(0.0f);
                        entityToSpawn38.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn38).finalizeSpawn(_level39, world.getCurrentDifficultyAt(entityToSpawn38.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn38);
                    }
                    if (world instanceof ServerLevel _level40) {
                        Entity entityToSpawn39 = new DarkLatexSpiderEntity((EntityType<DarkLatexSpiderEntity>) LatexModEntities.DARK_LATEX_SPIDER.get(), _level40);
                        entityToSpawn39.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn39.setYBodyRot(0.0f);
                        entityToSpawn39.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn39).finalizeSpawn(_level40, world.getCurrentDifficultyAt(entityToSpawn39.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn39);
                    }
                    if (world instanceof ServerLevel _level41) {
                        Entity entityToSpawn40 = new DarkLatexSpiderEntity((EntityType<DarkLatexSpiderEntity>) LatexModEntities.DARK_LATEX_SPIDER.get(), _level41);
                        entityToSpawn40.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn40.setYBodyRot(0.0f);
                        entityToSpawn40.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn40).finalizeSpawn(_level41, world.getCurrentDifficultyAt(entityToSpawn40.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn40);
                    }
                } else if (Math.random() < 0.1d) {
                    if (world instanceof ServerLevel _level42) {
                        Entity entityToSpawn41 = new DarkLatexSkeletonEntity((EntityType<DarkLatexSkeletonEntity>) LatexModEntities.DARK_LATEX_SKELETON.get(), _level42);
                        entityToSpawn41.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn41.setYBodyRot(0.0f);
                        entityToSpawn41.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn41).finalizeSpawn(_level42, world.getCurrentDifficultyAt(entityToSpawn41.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn41);
                    }
                    if (world instanceof ServerLevel _level43) {
                        Entity entityToSpawn42 = new DarkLatexDragon(ChangedEntities.DARK_LATEX_DRAGON.get(), _level43);
                        entityToSpawn42.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn42.setYBodyRot(0.0f);
                        entityToSpawn42.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn42).finalizeSpawn(_level43, world.getCurrentDifficultyAt(entityToSpawn42.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn42);
                    }
                    if (world instanceof ServerLevel _level44) {
                        Entity entityToSpawn43 = new DarkLatexYufeng(ChangedEntities.DARK_LATEX_YUFENG.get(), _level44);
                        entityToSpawn43.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn43.setYBodyRot(0.0f);
                        entityToSpawn43.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn43).finalizeSpawn(_level44, world.getCurrentDifficultyAt(entityToSpawn43.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn43);
                    }
                } else if (Math.random() < 0.1d) {
                    if (world instanceof ServerLevel _level45) {
                        Entity entityToSpawn44 = new DarkLatexSpiderQueenEntity((EntityType<DarkLatexSpiderQueenEntity>) LatexModEntities.DARK_LATEX_SPIDER_QUEEN.get(), _level45);
                        entityToSpawn44.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn44.setYBodyRot(0.0f);
                        entityToSpawn44.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn44).finalizeSpawn(_level45, world.getCurrentDifficultyAt(entityToSpawn44.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn44);
                    }
                    if (world instanceof ServerLevel _level46) {
                        Entity entityToSpawn45 = new DarkLatexSpiderEntity((EntityType<DarkLatexSpiderEntity>) LatexModEntities.DARK_LATEX_SPIDER.get(), _level46);
                        entityToSpawn45.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn45.setYBodyRot(0.0f);
                        entityToSpawn45.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn45).finalizeSpawn(_level46, world.getCurrentDifficultyAt(entityToSpawn45.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn45);
                    }
                    if (world instanceof ServerLevel _level47) {
                        Entity entityToSpawn46 = new DarkLatexSpiderEntity((EntityType<DarkLatexSpiderEntity>) LatexModEntities.DARK_LATEX_SPIDER.get(), _level47);
                        entityToSpawn46.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn46.setYBodyRot(0.0f);
                        entityToSpawn46.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn46).finalizeSpawn(_level47, world.getCurrentDifficultyAt(entityToSpawn46.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn46);
                    }
                } else if (Math.random() < 0.1d) {
                    if (world instanceof ServerLevel _level48) {
                        Entity entityToSpawn47 = new DarkLatexQueenBeeEntity((EntityType<DarkLatexQueenBeeEntity>) LatexModEntities.DARK_LATEX_QUEEN_BEE.get(), _level48);
                        entityToSpawn47.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn47.setYBodyRot(0.0f);
                        entityToSpawn47.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn47).finalizeSpawn(_level48, world.getCurrentDifficultyAt(entityToSpawn47.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn47);
                    }
                    if (world instanceof ServerLevel _level49) {
                        Entity entityToSpawn48 = new DLbeeEntity((EntityType<DLbeeEntity>) LatexModEntities.D_LBEE.get(), _level49);
                        entityToSpawn48.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn48.setYBodyRot(0.0f);
                        entityToSpawn48.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn48).finalizeSpawn(_level49, world.getCurrentDifficultyAt(entityToSpawn48.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn48);
                    }
                    if (world instanceof ServerLevel _level50) {
                        Entity entityToSpawn49 = new DLbeeEntity((EntityType<DLbeeEntity>) LatexModEntities.D_LBEE.get(), _level50);
                        entityToSpawn49.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn49.setYBodyRot(0.0f);
                        entityToSpawn49.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn49).finalizeSpawn(_level50, world.getCurrentDifficultyAt(entityToSpawn49.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn49);
                    }
                } else if (Math.random() < 0.25d) {
                    if (world instanceof ServerLevel _level51) {
                        Entity entityToSpawn50 = new DarkLatexSnakeEntity((EntityType<DarkLatexSnakeEntity>) LatexModEntities.DARK_LATEX_SNAKE.get(), _level51);
                        entityToSpawn50.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn50.setYBodyRot(0.0f);
                        entityToSpawn50.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn50).finalizeSpawn(_level51, world.getCurrentDifficultyAt(entityToSpawn50.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn50);
                    }
                    if (world instanceof ServerLevel _level52) {
                        Entity entityToSpawn51 = new NoiseStalkerEntity((EntityType<NoiseStalkerEntity>) LatexModEntities.NOISE_STALKER.get(), _level52);
                        entityToSpawn51.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn51.setYBodyRot(0.0f);
                        entityToSpawn51.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn51).finalizeSpawn(_level52, world.getCurrentDifficultyAt(entityToSpawn51.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn51);
                    }
                    if (world instanceof ServerLevel _level53) {
                        Entity entityToSpawn52 = new DarkLatexSkeletonEntity((EntityType<DarkLatexSkeletonEntity>) LatexModEntities.DARK_LATEX_SKELETON.get(), _level53);
                        entityToSpawn52.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn52.setYBodyRot(0.0f);
                        entityToSpawn52.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn52).finalizeSpawn(_level53, world.getCurrentDifficultyAt(entityToSpawn52.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn52);
                    }
                    if (world instanceof ServerLevel _level54) {
                        Entity entityToSpawn53 = new DarkLatexSkeletonEntity((EntityType<DarkLatexSkeletonEntity>) LatexModEntities.DARK_LATEX_SKELETON.get(), _level54);
                        entityToSpawn53.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn53.setYBodyRot(0.0f);
                        entityToSpawn53.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn53).finalizeSpawn(_level54, world.getCurrentDifficultyAt(entityToSpawn53.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn53);
                    }
                } else if (Math.random() < 0.25d) {
                    if (world instanceof ServerLevel _level55) {
                        Entity entityToSpawn54 = new DarklatexEntity((EntityType<DarklatexEntity>) LatexModEntities.DARKLATEX.get(), _level55);
                        entityToSpawn54.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn54.setYBodyRot(0.0f);
                        entityToSpawn54.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn54).finalizeSpawn(_level55, world.getCurrentDifficultyAt(entityToSpawn54.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn54);
                    }
                    if (world instanceof ServerLevel _level56) {
                        Entity entityToSpawn55 = new DarklatexEntity((EntityType<DarklatexEntity>) LatexModEntities.DARKLATEX.get(), _level56);
                        entityToSpawn55.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn55.setYBodyRot(0.0f);
                        entityToSpawn55.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn55).finalizeSpawn(_level56, world.getCurrentDifficultyAt(entityToSpawn55.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn55);
                    }
                    if (world instanceof ServerLevel _level57) {
                        Entity entityToSpawn56 = new DarklatexEntity((EntityType<DarklatexEntity>) LatexModEntities.DARKLATEX.get(), _level57);
                        entityToSpawn56.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn56.setYBodyRot(0.0f);
                        entityToSpawn56.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn56).finalizeSpawn(_level57, world.getCurrentDifficultyAt(entityToSpawn56.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn56);
                    }
                    if (world instanceof ServerLevel _level58) {
                        Entity entityToSpawn57 = new DarklatexEntity((EntityType<DarklatexEntity>) LatexModEntities.DARKLATEX.get(), _level58);
                        entityToSpawn57.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn57.setYBodyRot(0.0f);
                        entityToSpawn57.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn57).finalizeSpawn(_level58, world.getCurrentDifficultyAt(entityToSpawn57.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn57);
                    }
                    if (world instanceof ServerLevel _level59) {
                        Entity entityToSpawn58 = new DarkLatexFoxEntity((EntityType<DarkLatexFoxEntity>) LatexModEntities.DARK_LATEX_FOX.get(), _level59);
                        entityToSpawn58.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn58.setYBodyRot(0.0f);
                        entityToSpawn58.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn58).finalizeSpawn(_level59, world.getCurrentDifficultyAt(entityToSpawn58.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn58);
                    }
                    if (world instanceof ServerLevel _level60) {
                        Entity entityToSpawn59 = new DarklatexslugEntity((EntityType<DarklatexslugEntity>) LatexModEntities.DARKLATEXSLUG.get(), _level60);
                        entityToSpawn59.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn59.setYBodyRot(0.0f);
                        entityToSpawn59.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn59).finalizeSpawn(_level60, world.getCurrentDifficultyAt(entityToSpawn59.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn59);
                    }
                    if (world instanceof ServerLevel _level61) {
                        Entity entityToSpawn60 = new DarklatexslugEntity((EntityType<DarklatexslugEntity>) LatexModEntities.DARKLATEXSLUG.get(), _level61);
                        entityToSpawn60.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn60.setYBodyRot(0.0f);
                        entityToSpawn60.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn60).finalizeSpawn(_level61, world.getCurrentDifficultyAt(entityToSpawn60.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn60);
                    }
                    if (world instanceof ServerLevel _level62) {
                        Entity entityToSpawn61 = new DarklatexslugEntity((EntityType<DarklatexslugEntity>) LatexModEntities.DARKLATEXSLUG.get(), _level62);
                        entityToSpawn61.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn61.setYBodyRot(0.0f);
                        entityToSpawn61.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn61).finalizeSpawn(_level62, world.getCurrentDifficultyAt(entityToSpawn61.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn61);
                    }
                    if (world instanceof ServerLevel _level63) {
                        Entity entityToSpawn62 = new DarklatexslugEntity((EntityType<DarklatexslugEntity>) LatexModEntities.DARKLATEXSLUG.get(), _level63);
                        entityToSpawn62.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn62.setYBodyRot(0.0f);
                        entityToSpawn62.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn62).finalizeSpawn(_level63, world.getCurrentDifficultyAt(entityToSpawn62.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn62);
                    }
                } else {
                    if (world instanceof ServerLevel _level64) {
                        Entity entityToSpawn63 = new DarkLatexYufeng(ChangedEntities.DARK_LATEX_YUFENG.get(), _level64);
                        entityToSpawn63.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn63.setYBodyRot(0.0f);
                        entityToSpawn63.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn63).finalizeSpawn(_level64, world.getCurrentDifficultyAt(entityToSpawn63.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn63);
                    }
                    if (world instanceof ServerLevel _level65) {
                        Entity entityToSpawn64 = new DarklatexEntity((EntityType<DarklatexEntity>) LatexModEntities.DARKLATEX.get(), _level65);
                        entityToSpawn64.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn64.setYBodyRot(0.0f);
                        entityToSpawn64.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn64).finalizeSpawn(_level65, world.getCurrentDifficultyAt(entityToSpawn64.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn64);
                    }
                }
                if (!entity.level.isClientSide()) {
                    entity.discard();
                }
            }
        }
    }
}
