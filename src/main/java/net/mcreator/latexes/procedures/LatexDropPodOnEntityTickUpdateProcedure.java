package net.mcreator.latexes.procedures;

import net.mcreator.latexes.entity.DLbeeEntity;
import net.mcreator.latexes.entity.DarkLatexDragonEntity;
import net.mcreator.latexes.entity.DarkLatexFoxEntity;
import net.mcreator.latexes.entity.DarkLatexFoxScientistEntity;
import net.mcreator.latexes.entity.DarkLatexFoxSniperEntity;
import net.mcreator.latexes.entity.DarkLatexMothEntity;
import net.mcreator.latexes.entity.DarkLatexQueenBeeEntity;
import net.mcreator.latexes.entity.DarkLatexSkeletonEntity;
import net.mcreator.latexes.entity.DarkLatexSnakeEntity;
import net.mcreator.latexes.entity.DarkLatexSnepEntity;
import net.mcreator.latexes.entity.DarkLatexSpiderEntity;
import net.mcreator.latexes.entity.DarkLatexSpiderQueenEntity;
import net.mcreator.latexes.entity.DarklatexEntity;
import net.mcreator.latexes.entity.DarklatexslugEntity;
import net.mcreator.latexes.entity.DlsharkEntity;
import net.mcreator.latexes.entity.NoiseStalkerEntity;
import net.mcreator.latexes.entity.ScientistEntity;
import net.mcreator.latexes.entity.YufengEntity;
import net.mcreator.latexes.init.LatexModEntities;
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

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/LatexDropPodOnEntityTickUpdateProcedure.class */
public class LatexDropPodOnEntityTickUpdateProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity != null) {
            if (!(world.getBlockState(new BlockPos(x, y - 1.0d, z)).getBlock() == Blocks.CAVE_AIR || world.getBlockState(new BlockPos(x, y - 1.0d, z)).getBlock() == Blocks.VOID_AIR || world.getBlockState(new BlockPos(x, y - 1.0d, z)).getBlock() == Blocks.AIR || world.getBlockState(new BlockPos(x, y - 2.0d, z)).getBlock() == Blocks.CAVE_AIR || world.getBlockState(new BlockPos(x, y - 1.0d, z)).getBlock() == Blocks.VOID_AIR || world.getBlockState(new BlockPos(x, y - 1.0d, z)).getBlock() == Blocks.AIR || world.getBlockState(new BlockPos(x + 1.0d, y - 1.0d, z)).getBlock() == Blocks.CAVE_AIR || world.getBlockState(new BlockPos(x + 1.0d, y - 1.0d, z)).getBlock() == Blocks.VOID_AIR || world.getBlockState(new BlockPos(x + 1.0d, y - 1.0d, z)).getBlock() == Blocks.AIR || world.getBlockState(new BlockPos(x - 1.0d, y - 1.0d, z)).getBlock() == Blocks.CAVE_AIR || world.getBlockState(new BlockPos(x - 1.0d, y - 1.0d, z)).getBlock() == Blocks.VOID_AIR || world.getBlockState(new BlockPos(x - 1.0d, y - 1.0d, z)).getBlock() == Blocks.AIR || world.getBlockState(new BlockPos(x, y - 1.0d, z + 1.0d)).getBlock() == Blocks.CAVE_AIR || world.getBlockState(new BlockPos(x, y - 1.0d, z + 1.0d)).getBlock() == Blocks.VOID_AIR || world.getBlockState(new BlockPos(x, y - 1.0d, z + 1.0d)).getBlock() == Blocks.AIR || world.getBlockState(new BlockPos(x, y - 1.0d, z - 1.0d)).getBlock() == Blocks.CAVE_AIR || world.getBlockState(new BlockPos(x, y - 1.0d, z - 1.0d)).getBlock() == Blocks.VOID_AIR || world.getBlockState(new BlockPos(x, y - 1.0d, z - 1.0d)).getBlock() == Blocks.AIR)) {
                if (world instanceof Level) {
                    Level _level = (Level) world;
                    if (!_level.isClientSide()) {
                        _level.explode((Entity) null, x, y, z, 3.0f, Explosion.BlockInteraction.DESTROY);
                    }
                }
                if (Math.random() < 0.4d) {
                    if (world instanceof ServerLevel) {
                        ServerLevel _level2 = (ServerLevel) world;
                        Entity entityToSpawn = new DarklatexslugEntity((EntityType<DarklatexslugEntity>) ((EntityType) LatexModEntities.DARKLATEXSLUG.get()), (Level) _level2);
                        entityToSpawn.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn.setYBodyRot(0.0f);
                        entityToSpawn.setYHeadRot(0.0f);
                        if (entityToSpawn instanceof Mob) {
                            ((Mob) entityToSpawn).finalizeSpawn(_level2, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn);
                    }
                    if (world instanceof ServerLevel) {
                        ServerLevel _level3 = (ServerLevel) world;
                        Entity entityToSpawn2 = new DarklatexslugEntity((EntityType<DarklatexslugEntity>) ((EntityType) LatexModEntities.DARKLATEXSLUG.get()), (Level) _level3);
                        entityToSpawn2.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn2.setYBodyRot(0.0f);
                        entityToSpawn2.setYHeadRot(0.0f);
                        if (entityToSpawn2 instanceof Mob) {
                            ((Mob) entityToSpawn2).finalizeSpawn(_level3, world.getCurrentDifficultyAt(entityToSpawn2.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn2);
                    }
                    if (world instanceof ServerLevel) {
                        ServerLevel _level4 = (ServerLevel) world;
                        Entity entityToSpawn3 = new DarklatexslugEntity((EntityType<DarklatexslugEntity>) ((EntityType) LatexModEntities.DARKLATEXSLUG.get()), (Level) _level4);
                        entityToSpawn3.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn3.setYBodyRot(0.0f);
                        entityToSpawn3.setYHeadRot(0.0f);
                        if (entityToSpawn3 instanceof Mob) {
                            ((Mob) entityToSpawn3).finalizeSpawn(_level4, world.getCurrentDifficultyAt(entityToSpawn3.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn3);
                    }
                    if (world instanceof ServerLevel) {
                        ServerLevel _level5 = (ServerLevel) world;
                        Entity entityToSpawn4 = new DarklatexslugEntity((EntityType<DarklatexslugEntity>) ((EntityType) LatexModEntities.DARKLATEXSLUG.get()), (Level) _level5);
                        entityToSpawn4.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn4.setYBodyRot(0.0f);
                        entityToSpawn4.setYHeadRot(0.0f);
                        if (entityToSpawn4 instanceof Mob) {
                            ((Mob) entityToSpawn4).finalizeSpawn(_level5, world.getCurrentDifficultyAt(entityToSpawn4.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn4);
                    }
                    if (world instanceof ServerLevel) {
                        ServerLevel _level6 = (ServerLevel) world;
                        Entity entityToSpawn5 = new DarklatexslugEntity((EntityType<DarklatexslugEntity>) ((EntityType) LatexModEntities.DARKLATEXSLUG.get()), (Level) _level6);
                        entityToSpawn5.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn5.setYBodyRot(0.0f);
                        entityToSpawn5.setYHeadRot(0.0f);
                        if (entityToSpawn5 instanceof Mob) {
                            ((Mob) entityToSpawn5).finalizeSpawn(_level6, world.getCurrentDifficultyAt(entityToSpawn5.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn5);
                    }
                    if (world instanceof ServerLevel) {
                        ServerLevel _level7 = (ServerLevel) world;
                        Entity entityToSpawn6 = new DarklatexslugEntity((EntityType<DarklatexslugEntity>) ((EntityType) LatexModEntities.DARKLATEXSLUG.get()), (Level) _level7);
                        entityToSpawn6.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn6.setYBodyRot(0.0f);
                        entityToSpawn6.setYHeadRot(0.0f);
                        if (entityToSpawn6 instanceof Mob) {
                            ((Mob) entityToSpawn6).finalizeSpawn(_level7, world.getCurrentDifficultyAt(entityToSpawn6.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn6);
                    }
                    if (world instanceof ServerLevel) {
                        ServerLevel _level8 = (ServerLevel) world;
                        Entity entityToSpawn7 = new DarklatexslugEntity((EntityType<DarklatexslugEntity>) ((EntityType) LatexModEntities.DARKLATEXSLUG.get()), (Level) _level8);
                        entityToSpawn7.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn7.setYBodyRot(0.0f);
                        entityToSpawn7.setYHeadRot(0.0f);
                        if (entityToSpawn7 instanceof Mob) {
                            ((Mob) entityToSpawn7).finalizeSpawn(_level8, world.getCurrentDifficultyAt(entityToSpawn7.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn7);
                    }
                    if (world instanceof ServerLevel) {
                        ServerLevel _level9 = (ServerLevel) world;
                        Entity entityToSpawn8 = new DarklatexslugEntity((EntityType<DarklatexslugEntity>) ((EntityType) LatexModEntities.DARKLATEXSLUG.get()), (Level) _level9);
                        entityToSpawn8.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn8.setYBodyRot(0.0f);
                        entityToSpawn8.setYHeadRot(0.0f);
                        if (entityToSpawn8 instanceof Mob) {
                            ((Mob) entityToSpawn8).finalizeSpawn(_level9, world.getCurrentDifficultyAt(entityToSpawn8.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn8);
                    }
                } else if (Math.random() < 0.2d) {
                    if (world instanceof ServerLevel) {
                        ServerLevel _level10 = (ServerLevel) world;
                        Entity entityToSpawn9 = new DarkLatexFoxScientistEntity((EntityType<DarkLatexFoxScientistEntity>) ((EntityType) LatexModEntities.DARK_LATEX_FOX_SCIENTIST.get()), (Level) _level10);
                        entityToSpawn9.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn9.setYBodyRot(0.0f);
                        entityToSpawn9.setYHeadRot(0.0f);
                        if (entityToSpawn9 instanceof Mob) {
                            ((Mob) entityToSpawn9).finalizeSpawn(_level10, world.getCurrentDifficultyAt(entityToSpawn9.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn9);
                    }
                    if (world instanceof ServerLevel) {
                        ServerLevel _level11 = (ServerLevel) world;
                        Entity entityToSpawn10 = new DarkLatexFoxSniperEntity((EntityType<DarkLatexFoxSniperEntity>) ((EntityType) LatexModEntities.DARK_LATEX_FOX_SNIPER.get()), (Level) _level11);
                        entityToSpawn10.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn10.setYBodyRot(0.0f);
                        entityToSpawn10.setYHeadRot(0.0f);
                        if (entityToSpawn10 instanceof Mob) {
                            ((Mob) entityToSpawn10).finalizeSpawn(_level11, world.getCurrentDifficultyAt(entityToSpawn10.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn10);
                    }
                    if (world instanceof ServerLevel) {
                        ServerLevel _level12 = (ServerLevel) world;
                        Entity entityToSpawn11 = new DarkLatexFoxScientistEntity((EntityType<DarkLatexFoxScientistEntity>) ((EntityType) LatexModEntities.DARK_LATEX_FOX_SCIENTIST.get()), (Level) _level12);
                        entityToSpawn11.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn11.setYBodyRot(0.0f);
                        entityToSpawn11.setYHeadRot(0.0f);
                        if (entityToSpawn11 instanceof Mob) {
                            ((Mob) entityToSpawn11).finalizeSpawn(_level12, world.getCurrentDifficultyAt(entityToSpawn11.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn11);
                    }
                    if (world instanceof ServerLevel) {
                        ServerLevel _level13 = (ServerLevel) world;
                        Entity entityToSpawn12 = new DarkLatexFoxScientistEntity((EntityType<DarkLatexFoxScientistEntity>) ((EntityType) LatexModEntities.DARK_LATEX_FOX_SCIENTIST.get()), (Level) _level13);
                        entityToSpawn12.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn12.setYBodyRot(0.0f);
                        entityToSpawn12.setYHeadRot(0.0f);
                        if (entityToSpawn12 instanceof Mob) {
                            ((Mob) entityToSpawn12).finalizeSpawn(_level13, world.getCurrentDifficultyAt(entityToSpawn12.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn12);
                    }
                } else if (Math.random() < 0.2d) {
                    if (world instanceof ServerLevel) {
                        ServerLevel _level14 = (ServerLevel) world;
                        Entity entityToSpawn13 = new DlsharkEntity((EntityType<DlsharkEntity>) ((EntityType) LatexModEntities.DLSHARK.get()), (Level) _level14);
                        entityToSpawn13.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn13.setYBodyRot(0.0f);
                        entityToSpawn13.setYHeadRot(0.0f);
                        if (entityToSpawn13 instanceof Mob) {
                            ((Mob) entityToSpawn13).finalizeSpawn(_level14, world.getCurrentDifficultyAt(entityToSpawn13.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn13);
                    }
                    if (world instanceof ServerLevel) {
                        ServerLevel _level15 = (ServerLevel) world;
                        Entity entityToSpawn14 = new DlsharkEntity((EntityType<DlsharkEntity>) ((EntityType) LatexModEntities.DLSHARK.get()), (Level) _level15);
                        entityToSpawn14.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn14.setYBodyRot(0.0f);
                        entityToSpawn14.setYHeadRot(0.0f);
                        if (entityToSpawn14 instanceof Mob) {
                            ((Mob) entityToSpawn14).finalizeSpawn(_level15, world.getCurrentDifficultyAt(entityToSpawn14.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn14);
                    }
                    if (world instanceof ServerLevel) {
                        ServerLevel _level16 = (ServerLevel) world;
                        Entity entityToSpawn15 = new DarkLatexMothEntity((EntityType<DarkLatexMothEntity>) ((EntityType) LatexModEntities.DARK_LATEX_MOTH.get()), (Level) _level16);
                        entityToSpawn15.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn15.setYBodyRot(0.0f);
                        entityToSpawn15.setYHeadRot(0.0f);
                        if (entityToSpawn15 instanceof Mob) {
                            ((Mob) entityToSpawn15).finalizeSpawn(_level16, world.getCurrentDifficultyAt(entityToSpawn15.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn15);
                    }
                    if (world instanceof ServerLevel) {
                        ServerLevel _level17 = (ServerLevel) world;
                        Entity entityToSpawn16 = new DarkLatexSkeletonEntity((EntityType<DarkLatexSkeletonEntity>) ((EntityType) LatexModEntities.DARK_LATEX_SKELETON.get()), (Level) _level17);
                        entityToSpawn16.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn16.setYBodyRot(0.0f);
                        entityToSpawn16.setYHeadRot(0.0f);
                        if (entityToSpawn16 instanceof Mob) {
                            ((Mob) entityToSpawn16).finalizeSpawn(_level17, world.getCurrentDifficultyAt(entityToSpawn16.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn16);
                    }
                } else if (Math.random() < 0.2d) {
                    if (world instanceof ServerLevel) {
                        ServerLevel _level18 = (ServerLevel) world;
                        Entity entityToSpawn17 = new DarkLatexSnakeEntity((EntityType<DarkLatexSnakeEntity>) ((EntityType) LatexModEntities.DARK_LATEX_SNAKE.get()), (Level) _level18);
                        entityToSpawn17.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn17.setYBodyRot(0.0f);
                        entityToSpawn17.setYHeadRot(0.0f);
                        if (entityToSpawn17 instanceof Mob) {
                            ((Mob) entityToSpawn17).finalizeSpawn(_level18, world.getCurrentDifficultyAt(entityToSpawn17.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn17);
                    }
                    if (world instanceof ServerLevel) {
                        ServerLevel _level19 = (ServerLevel) world;
                        Entity entityToSpawn18 = new DarkLatexSnepEntity((EntityType<DarkLatexSnepEntity>) ((EntityType) LatexModEntities.DARK_LATEX_SNEP.get()), (Level) _level19);
                        entityToSpawn18.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn18.setYBodyRot(0.0f);
                        entityToSpawn18.setYHeadRot(0.0f);
                        if (entityToSpawn18 instanceof Mob) {
                            ((Mob) entityToSpawn18).finalizeSpawn(_level19, world.getCurrentDifficultyAt(entityToSpawn18.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn18);
                    }
                    if (world instanceof ServerLevel) {
                        ServerLevel _level20 = (ServerLevel) world;
                        Entity entityToSpawn19 = new DarklatexEntity((EntityType<DarklatexEntity>) ((EntityType) LatexModEntities.DARKLATEX.get()), (Level) _level20);
                        entityToSpawn19.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn19.setYBodyRot(0.0f);
                        entityToSpawn19.setYHeadRot(0.0f);
                        if (entityToSpawn19 instanceof Mob) {
                            ((Mob) entityToSpawn19).finalizeSpawn(_level20, world.getCurrentDifficultyAt(entityToSpawn19.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn19);
                    }
                } else if (Math.random() < 0.1d) {
                    if (world instanceof ServerLevel) {
                        ServerLevel _level21 = (ServerLevel) world;
                        Entity entityToSpawn20 = new ScientistEntity((EntityType<ScientistEntity>) ((EntityType) LatexModEntities.SCIENTIST.get()), (Level) _level21);
                        entityToSpawn20.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn20.setYBodyRot(0.0f);
                        entityToSpawn20.setYHeadRot(0.0f);
                        if (entityToSpawn20 instanceof Mob) {
                            ((Mob) entityToSpawn20).finalizeSpawn(_level21, world.getCurrentDifficultyAt(entityToSpawn20.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn20);
                    }
                    if (world instanceof ServerLevel) {
                        ServerLevel _level22 = (ServerLevel) world;
                        Entity entityToSpawn21 = new ScientistEntity((EntityType<ScientistEntity>) ((EntityType) LatexModEntities.SCIENTIST.get()), (Level) _level22);
                        entityToSpawn21.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn21.setYBodyRot(0.0f);
                        entityToSpawn21.setYHeadRot(0.0f);
                        if (entityToSpawn21 instanceof Mob) {
                            ((Mob) entityToSpawn21).finalizeSpawn(_level22, world.getCurrentDifficultyAt(entityToSpawn21.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn21);
                    }
                    if (world instanceof ServerLevel) {
                        ServerLevel _level23 = (ServerLevel) world;
                        Entity entityToSpawn22 = new DarkLatexFoxScientistEntity((EntityType<DarkLatexFoxScientistEntity>) ((EntityType) LatexModEntities.DARK_LATEX_FOX_SCIENTIST.get()), (Level) _level23);
                        entityToSpawn22.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn22.setYBodyRot(0.0f);
                        entityToSpawn22.setYHeadRot(0.0f);
                        if (entityToSpawn22 instanceof Mob) {
                            ((Mob) entityToSpawn22).finalizeSpawn(_level23, world.getCurrentDifficultyAt(entityToSpawn22.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn22);
                    }
                    if (world instanceof ServerLevel) {
                        ServerLevel _level24 = (ServerLevel) world;
                        Entity entityToSpawn23 = new DarkLatexFoxScientistEntity((EntityType<DarkLatexFoxScientistEntity>) ((EntityType) LatexModEntities.DARK_LATEX_FOX_SCIENTIST.get()), (Level) _level24);
                        entityToSpawn23.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn23.setYBodyRot(0.0f);
                        entityToSpawn23.setYHeadRot(0.0f);
                        if (entityToSpawn23 instanceof Mob) {
                            ((Mob) entityToSpawn23).finalizeSpawn(_level24, world.getCurrentDifficultyAt(entityToSpawn23.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn23);
                    }
                    if (world instanceof ServerLevel) {
                        ServerLevel _level25 = (ServerLevel) world;
                        Entity entityToSpawn24 = new DarkLatexFoxSniperEntity((EntityType<DarkLatexFoxSniperEntity>) ((EntityType) LatexModEntities.DARK_LATEX_FOX_SNIPER.get()), (Level) _level25);
                        entityToSpawn24.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn24.setYBodyRot(0.0f);
                        entityToSpawn24.setYHeadRot(0.0f);
                        if (entityToSpawn24 instanceof Mob) {
                            ((Mob) entityToSpawn24).finalizeSpawn(_level25, world.getCurrentDifficultyAt(entityToSpawn24.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn24);
                    }
                    if (world instanceof ServerLevel) {
                        ServerLevel _level26 = (ServerLevel) world;
                        Entity entityToSpawn25 = new DarkLatexFoxScientistEntity((EntityType<DarkLatexFoxScientistEntity>) ((EntityType) LatexModEntities.DARK_LATEX_FOX_SCIENTIST.get()), (Level) _level26);
                        entityToSpawn25.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn25.setYBodyRot(0.0f);
                        entityToSpawn25.setYHeadRot(0.0f);
                        if (entityToSpawn25 instanceof Mob) {
                            ((Mob) entityToSpawn25).finalizeSpawn(_level26, world.getCurrentDifficultyAt(entityToSpawn25.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn25);
                    }
                    if (world instanceof ServerLevel) {
                        ServerLevel _level27 = (ServerLevel) world;
                        Entity entityToSpawn26 = new DarkLatexFoxScientistEntity((EntityType<DarkLatexFoxScientistEntity>) ((EntityType) LatexModEntities.DARK_LATEX_FOX_SCIENTIST.get()), (Level) _level27);
                        entityToSpawn26.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn26.setYBodyRot(0.0f);
                        entityToSpawn26.setYHeadRot(0.0f);
                        if (entityToSpawn26 instanceof Mob) {
                            ((Mob) entityToSpawn26).finalizeSpawn(_level27, world.getCurrentDifficultyAt(entityToSpawn26.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn26);
                    }
                    if (world instanceof ServerLevel) {
                        ServerLevel _level28 = (ServerLevel) world;
                        Entity entityToSpawn27 = new DarkLatexFoxSniperEntity((EntityType<DarkLatexFoxSniperEntity>) ((EntityType) LatexModEntities.DARK_LATEX_FOX_SNIPER.get()), (Level) _level28);
                        entityToSpawn27.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn27.setYBodyRot(0.0f);
                        entityToSpawn27.setYHeadRot(0.0f);
                        if (entityToSpawn27 instanceof Mob) {
                            ((Mob) entityToSpawn27).finalizeSpawn(_level28, world.getCurrentDifficultyAt(entityToSpawn27.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn27);
                    }
                } else if (Math.random() < 0.2d) {
                    if (world instanceof ServerLevel) {
                        ServerLevel _level29 = (ServerLevel) world;
                        Entity entityToSpawn28 = new NoiseStalkerEntity((EntityType<NoiseStalkerEntity>) ((EntityType) LatexModEntities.NOISE_STALKER.get()), (Level) _level29);
                        entityToSpawn28.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn28.setYBodyRot(0.0f);
                        entityToSpawn28.setYHeadRot(0.0f);
                        if (entityToSpawn28 instanceof Mob) {
                            ((Mob) entityToSpawn28).finalizeSpawn(_level29, world.getCurrentDifficultyAt(entityToSpawn28.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn28);
                    }
                    if (world instanceof ServerLevel) {
                        ServerLevel _level30 = (ServerLevel) world;
                        Entity entityToSpawn29 = new NoiseStalkerEntity((EntityType<NoiseStalkerEntity>) ((EntityType) LatexModEntities.NOISE_STALKER.get()), (Level) _level30);
                        entityToSpawn29.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn29.setYBodyRot(0.0f);
                        entityToSpawn29.setYHeadRot(0.0f);
                        if (entityToSpawn29 instanceof Mob) {
                            ((Mob) entityToSpawn29).finalizeSpawn(_level30, world.getCurrentDifficultyAt(entityToSpawn29.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn29);
                    }
                    if (world instanceof ServerLevel) {
                        ServerLevel _level31 = (ServerLevel) world;
                        Entity entityToSpawn30 = new NoiseStalkerEntity((EntityType<NoiseStalkerEntity>) ((EntityType) LatexModEntities.NOISE_STALKER.get()), (Level) _level31);
                        entityToSpawn30.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn30.setYBodyRot(0.0f);
                        entityToSpawn30.setYHeadRot(0.0f);
                        if (entityToSpawn30 instanceof Mob) {
                            ((Mob) entityToSpawn30).finalizeSpawn(_level31, world.getCurrentDifficultyAt(entityToSpawn30.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn30);
                    }
                    if (world instanceof ServerLevel) {
                        ServerLevel _level32 = (ServerLevel) world;
                        Entity entityToSpawn31 = new NoiseStalkerEntity((EntityType<NoiseStalkerEntity>) ((EntityType) LatexModEntities.NOISE_STALKER.get()), (Level) _level32);
                        entityToSpawn31.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn31.setYBodyRot(0.0f);
                        entityToSpawn31.setYHeadRot(0.0f);
                        if (entityToSpawn31 instanceof Mob) {
                            ((Mob) entityToSpawn31).finalizeSpawn(_level32, world.getCurrentDifficultyAt(entityToSpawn31.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn31);
                    }
                } else if (Math.random() < 0.2d) {
                    if (world instanceof ServerLevel) {
                        ServerLevel _level33 = (ServerLevel) world;
                        Entity entityToSpawn32 = new DarklatexEntity((EntityType<DarklatexEntity>) ((EntityType) LatexModEntities.DARKLATEX.get()), (Level) _level33);
                        entityToSpawn32.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn32.setYBodyRot(0.0f);
                        entityToSpawn32.setYHeadRot(0.0f);
                        if (entityToSpawn32 instanceof Mob) {
                            ((Mob) entityToSpawn32).finalizeSpawn(_level33, world.getCurrentDifficultyAt(entityToSpawn32.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn32);
                    }
                    if (world instanceof ServerLevel) {
                        ServerLevel _level34 = (ServerLevel) world;
                        Entity entityToSpawn33 = new DarkLatexSkeletonEntity((EntityType<DarkLatexSkeletonEntity>) ((EntityType) LatexModEntities.DARK_LATEX_SKELETON.get()), (Level) _level34);
                        entityToSpawn33.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn33.setYBodyRot(0.0f);
                        entityToSpawn33.setYHeadRot(0.0f);
                        if (entityToSpawn33 instanceof Mob) {
                            ((Mob) entityToSpawn33).finalizeSpawn(_level34, world.getCurrentDifficultyAt(entityToSpawn33.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn33);
                    }
                    if (world instanceof ServerLevel) {
                        ServerLevel _level35 = (ServerLevel) world;
                        Entity entityToSpawn34 = new DarklatexEntity((EntityType<DarklatexEntity>) ((EntityType) LatexModEntities.DARKLATEX.get()), (Level) _level35);
                        entityToSpawn34.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn34.setYBodyRot(0.0f);
                        entityToSpawn34.setYHeadRot(0.0f);
                        if (entityToSpawn34 instanceof Mob) {
                            ((Mob) entityToSpawn34).finalizeSpawn(_level35, world.getCurrentDifficultyAt(entityToSpawn34.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn34);
                    }
                    if (world instanceof ServerLevel) {
                        ServerLevel _level36 = (ServerLevel) world;
                        Entity entityToSpawn35 = new DarkLatexSkeletonEntity((EntityType<DarkLatexSkeletonEntity>) ((EntityType) LatexModEntities.DARK_LATEX_SKELETON.get()), (Level) _level36);
                        entityToSpawn35.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn35.setYBodyRot(0.0f);
                        entityToSpawn35.setYHeadRot(0.0f);
                        if (entityToSpawn35 instanceof Mob) {
                            ((Mob) entityToSpawn35).finalizeSpawn(_level36, world.getCurrentDifficultyAt(entityToSpawn35.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn35);
                    }
                    if (world instanceof ServerLevel) {
                        ServerLevel _level37 = (ServerLevel) world;
                        Entity entityToSpawn36 = new DarklatexEntity((EntityType<DarklatexEntity>) ((EntityType) LatexModEntities.DARKLATEX.get()), (Level) _level37);
                        entityToSpawn36.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn36.setYBodyRot(0.0f);
                        entityToSpawn36.setYHeadRot(0.0f);
                        if (entityToSpawn36 instanceof Mob) {
                            ((Mob) entityToSpawn36).finalizeSpawn(_level37, world.getCurrentDifficultyAt(entityToSpawn36.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn36);
                    }
                } else if (Math.random() < 0.2d) {
                    if (world instanceof ServerLevel) {
                        ServerLevel _level38 = (ServerLevel) world;
                        Entity entityToSpawn37 = new DarkLatexSpiderEntity((EntityType<DarkLatexSpiderEntity>) ((EntityType) LatexModEntities.DARK_LATEX_SPIDER.get()), (Level) _level38);
                        entityToSpawn37.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn37.setYBodyRot(0.0f);
                        entityToSpawn37.setYHeadRot(0.0f);
                        if (entityToSpawn37 instanceof Mob) {
                            ((Mob) entityToSpawn37).finalizeSpawn(_level38, world.getCurrentDifficultyAt(entityToSpawn37.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn37);
                    }
                    if (world instanceof ServerLevel) {
                        ServerLevel _level39 = (ServerLevel) world;
                        Entity entityToSpawn38 = new DarkLatexSpiderEntity((EntityType<DarkLatexSpiderEntity>) ((EntityType) LatexModEntities.DARK_LATEX_SPIDER.get()), (Level) _level39);
                        entityToSpawn38.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn38.setYBodyRot(0.0f);
                        entityToSpawn38.setYHeadRot(0.0f);
                        if (entityToSpawn38 instanceof Mob) {
                            ((Mob) entityToSpawn38).finalizeSpawn(_level39, world.getCurrentDifficultyAt(entityToSpawn38.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn38);
                    }
                    if (world instanceof ServerLevel) {
                        ServerLevel _level40 = (ServerLevel) world;
                        Entity entityToSpawn39 = new DarkLatexSpiderEntity((EntityType<DarkLatexSpiderEntity>) ((EntityType) LatexModEntities.DARK_LATEX_SPIDER.get()), (Level) _level40);
                        entityToSpawn39.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn39.setYBodyRot(0.0f);
                        entityToSpawn39.setYHeadRot(0.0f);
                        if (entityToSpawn39 instanceof Mob) {
                            ((Mob) entityToSpawn39).finalizeSpawn(_level40, world.getCurrentDifficultyAt(entityToSpawn39.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn39);
                    }
                    if (world instanceof ServerLevel) {
                        ServerLevel _level41 = (ServerLevel) world;
                        Entity entityToSpawn40 = new DarkLatexSpiderEntity((EntityType<DarkLatexSpiderEntity>) ((EntityType) LatexModEntities.DARK_LATEX_SPIDER.get()), (Level) _level41);
                        entityToSpawn40.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn40.setYBodyRot(0.0f);
                        entityToSpawn40.setYHeadRot(0.0f);
                        if (entityToSpawn40 instanceof Mob) {
                            ((Mob) entityToSpawn40).finalizeSpawn(_level41, world.getCurrentDifficultyAt(entityToSpawn40.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn40);
                    }
                } else if (Math.random() < 0.1d) {
                    if (world instanceof ServerLevel) {
                        ServerLevel _level42 = (ServerLevel) world;
                        Entity entityToSpawn41 = new DarkLatexSkeletonEntity((EntityType<DarkLatexSkeletonEntity>) ((EntityType) LatexModEntities.DARK_LATEX_SKELETON.get()), (Level) _level42);
                        entityToSpawn41.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn41.setYBodyRot(0.0f);
                        entityToSpawn41.setYHeadRot(0.0f);
                        if (entityToSpawn41 instanceof Mob) {
                            ((Mob) entityToSpawn41).finalizeSpawn(_level42, world.getCurrentDifficultyAt(entityToSpawn41.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn41);
                    }
                    if (world instanceof ServerLevel) {
                        ServerLevel _level43 = (ServerLevel) world;
                        Entity entityToSpawn42 = new DarkLatexDragonEntity((EntityType<DarkLatexDragonEntity>) ((EntityType) LatexModEntities.DARK_LATEX_DRAGON.get()), (Level) _level43);
                        entityToSpawn42.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn42.setYBodyRot(0.0f);
                        entityToSpawn42.setYHeadRot(0.0f);
                        if (entityToSpawn42 instanceof Mob) {
                            ((Mob) entityToSpawn42).finalizeSpawn(_level43, world.getCurrentDifficultyAt(entityToSpawn42.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn42);
                    }
                    if (world instanceof ServerLevel) {
                        ServerLevel _level44 = (ServerLevel) world;
                        Entity entityToSpawn43 = new YufengEntity((EntityType<YufengEntity>) ((EntityType) LatexModEntities.YUFENG.get()), (Level) _level44);
                        entityToSpawn43.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn43.setYBodyRot(0.0f);
                        entityToSpawn43.setYHeadRot(0.0f);
                        if (entityToSpawn43 instanceof Mob) {
                            ((Mob) entityToSpawn43).finalizeSpawn(_level44, world.getCurrentDifficultyAt(entityToSpawn43.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn43);
                    }
                } else if (Math.random() < 0.1d) {
                    if (world instanceof ServerLevel) {
                        ServerLevel _level45 = (ServerLevel) world;
                        Entity entityToSpawn44 = new DarkLatexSpiderQueenEntity((EntityType<DarkLatexSpiderQueenEntity>) ((EntityType) LatexModEntities.DARK_LATEX_SPIDER_QUEEN.get()), (Level) _level45);
                        entityToSpawn44.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn44.setYBodyRot(0.0f);
                        entityToSpawn44.setYHeadRot(0.0f);
                        if (entityToSpawn44 instanceof Mob) {
                            ((Mob) entityToSpawn44).finalizeSpawn(_level45, world.getCurrentDifficultyAt(entityToSpawn44.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn44);
                    }
                    if (world instanceof ServerLevel) {
                        ServerLevel _level46 = (ServerLevel) world;
                        Entity entityToSpawn45 = new DarkLatexSpiderEntity((EntityType<DarkLatexSpiderEntity>) ((EntityType) LatexModEntities.DARK_LATEX_SPIDER.get()), (Level) _level46);
                        entityToSpawn45.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn45.setYBodyRot(0.0f);
                        entityToSpawn45.setYHeadRot(0.0f);
                        if (entityToSpawn45 instanceof Mob) {
                            ((Mob) entityToSpawn45).finalizeSpawn(_level46, world.getCurrentDifficultyAt(entityToSpawn45.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn45);
                    }
                    if (world instanceof ServerLevel) {
                        ServerLevel _level47 = (ServerLevel) world;
                        Entity entityToSpawn46 = new DarkLatexSpiderEntity((EntityType<DarkLatexSpiderEntity>) ((EntityType) LatexModEntities.DARK_LATEX_SPIDER.get()), (Level) _level47);
                        entityToSpawn46.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn46.setYBodyRot(0.0f);
                        entityToSpawn46.setYHeadRot(0.0f);
                        if (entityToSpawn46 instanceof Mob) {
                            ((Mob) entityToSpawn46).finalizeSpawn(_level47, world.getCurrentDifficultyAt(entityToSpawn46.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn46);
                    }
                } else if (Math.random() < 0.1d) {
                    if (world instanceof ServerLevel) {
                        ServerLevel _level48 = (ServerLevel) world;
                        Entity entityToSpawn47 = new DarkLatexQueenBeeEntity((EntityType<DarkLatexQueenBeeEntity>) ((EntityType) LatexModEntities.DARK_LATEX_QUEEN_BEE.get()), (Level) _level48);
                        entityToSpawn47.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn47.setYBodyRot(0.0f);
                        entityToSpawn47.setYHeadRot(0.0f);
                        if (entityToSpawn47 instanceof Mob) {
                            ((Mob) entityToSpawn47).finalizeSpawn(_level48, world.getCurrentDifficultyAt(entityToSpawn47.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn47);
                    }
                    if (world instanceof ServerLevel) {
                        ServerLevel _level49 = (ServerLevel) world;
                        Entity entityToSpawn48 = new DLbeeEntity((EntityType<DLbeeEntity>) ((EntityType) LatexModEntities.D_LBEE.get()), (Level) _level49);
                        entityToSpawn48.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn48.setYBodyRot(0.0f);
                        entityToSpawn48.setYHeadRot(0.0f);
                        if (entityToSpawn48 instanceof Mob) {
                            ((Mob) entityToSpawn48).finalizeSpawn(_level49, world.getCurrentDifficultyAt(entityToSpawn48.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn48);
                    }
                    if (world instanceof ServerLevel) {
                        ServerLevel _level50 = (ServerLevel) world;
                        Entity entityToSpawn49 = new DLbeeEntity((EntityType<DLbeeEntity>) ((EntityType) LatexModEntities.D_LBEE.get()), (Level) _level50);
                        entityToSpawn49.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn49.setYBodyRot(0.0f);
                        entityToSpawn49.setYHeadRot(0.0f);
                        if (entityToSpawn49 instanceof Mob) {
                            ((Mob) entityToSpawn49).finalizeSpawn(_level50, world.getCurrentDifficultyAt(entityToSpawn49.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn49);
                    }
                } else if (Math.random() < 0.25d) {
                    if (world instanceof ServerLevel) {
                        ServerLevel _level51 = (ServerLevel) world;
                        Entity entityToSpawn50 = new DarkLatexSnakeEntity((EntityType<DarkLatexSnakeEntity>) ((EntityType) LatexModEntities.DARK_LATEX_SNAKE.get()), (Level) _level51);
                        entityToSpawn50.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn50.setYBodyRot(0.0f);
                        entityToSpawn50.setYHeadRot(0.0f);
                        if (entityToSpawn50 instanceof Mob) {
                            ((Mob) entityToSpawn50).finalizeSpawn(_level51, world.getCurrentDifficultyAt(entityToSpawn50.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn50);
                    }
                    if (world instanceof ServerLevel) {
                        ServerLevel _level52 = (ServerLevel) world;
                        Entity entityToSpawn51 = new NoiseStalkerEntity((EntityType<NoiseStalkerEntity>) ((EntityType) LatexModEntities.NOISE_STALKER.get()), (Level) _level52);
                        entityToSpawn51.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn51.setYBodyRot(0.0f);
                        entityToSpawn51.setYHeadRot(0.0f);
                        if (entityToSpawn51 instanceof Mob) {
                            ((Mob) entityToSpawn51).finalizeSpawn(_level52, world.getCurrentDifficultyAt(entityToSpawn51.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn51);
                    }
                    if (world instanceof ServerLevel) {
                        ServerLevel _level53 = (ServerLevel) world;
                        Entity entityToSpawn52 = new DarkLatexSkeletonEntity((EntityType<DarkLatexSkeletonEntity>) ((EntityType) LatexModEntities.DARK_LATEX_SKELETON.get()), (Level) _level53);
                        entityToSpawn52.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn52.setYBodyRot(0.0f);
                        entityToSpawn52.setYHeadRot(0.0f);
                        if (entityToSpawn52 instanceof Mob) {
                            ((Mob) entityToSpawn52).finalizeSpawn(_level53, world.getCurrentDifficultyAt(entityToSpawn52.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn52);
                    }
                    if (world instanceof ServerLevel) {
                        ServerLevel _level54 = (ServerLevel) world;
                        Entity entityToSpawn53 = new DarkLatexSkeletonEntity((EntityType<DarkLatexSkeletonEntity>) ((EntityType) LatexModEntities.DARK_LATEX_SKELETON.get()), (Level) _level54);
                        entityToSpawn53.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn53.setYBodyRot(0.0f);
                        entityToSpawn53.setYHeadRot(0.0f);
                        if (entityToSpawn53 instanceof Mob) {
                            ((Mob) entityToSpawn53).finalizeSpawn(_level54, world.getCurrentDifficultyAt(entityToSpawn53.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn53);
                    }
                } else if (Math.random() < 0.25d) {
                    if (world instanceof ServerLevel) {
                        ServerLevel _level55 = (ServerLevel) world;
                        Entity entityToSpawn54 = new DarklatexEntity((EntityType<DarklatexEntity>) ((EntityType) LatexModEntities.DARKLATEX.get()), (Level) _level55);
                        entityToSpawn54.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn54.setYBodyRot(0.0f);
                        entityToSpawn54.setYHeadRot(0.0f);
                        if (entityToSpawn54 instanceof Mob) {
                            ((Mob) entityToSpawn54).finalizeSpawn(_level55, world.getCurrentDifficultyAt(entityToSpawn54.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn54);
                    }
                    if (world instanceof ServerLevel) {
                        ServerLevel _level56 = (ServerLevel) world;
                        Entity entityToSpawn55 = new DarklatexEntity((EntityType<DarklatexEntity>) ((EntityType) LatexModEntities.DARKLATEX.get()), (Level) _level56);
                        entityToSpawn55.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn55.setYBodyRot(0.0f);
                        entityToSpawn55.setYHeadRot(0.0f);
                        if (entityToSpawn55 instanceof Mob) {
                            ((Mob) entityToSpawn55).finalizeSpawn(_level56, world.getCurrentDifficultyAt(entityToSpawn55.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn55);
                    }
                    if (world instanceof ServerLevel) {
                        ServerLevel _level57 = (ServerLevel) world;
                        Entity entityToSpawn56 = new DarklatexEntity((EntityType<DarklatexEntity>) ((EntityType) LatexModEntities.DARKLATEX.get()), (Level) _level57);
                        entityToSpawn56.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn56.setYBodyRot(0.0f);
                        entityToSpawn56.setYHeadRot(0.0f);
                        if (entityToSpawn56 instanceof Mob) {
                            ((Mob) entityToSpawn56).finalizeSpawn(_level57, world.getCurrentDifficultyAt(entityToSpawn56.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn56);
                    }
                    if (world instanceof ServerLevel) {
                        ServerLevel _level58 = (ServerLevel) world;
                        Entity entityToSpawn57 = new DarklatexEntity((EntityType<DarklatexEntity>) ((EntityType) LatexModEntities.DARKLATEX.get()), (Level) _level58);
                        entityToSpawn57.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn57.setYBodyRot(0.0f);
                        entityToSpawn57.setYHeadRot(0.0f);
                        if (entityToSpawn57 instanceof Mob) {
                            ((Mob) entityToSpawn57).finalizeSpawn(_level58, world.getCurrentDifficultyAt(entityToSpawn57.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn57);
                    }
                    if (world instanceof ServerLevel) {
                        ServerLevel _level59 = (ServerLevel) world;
                        Entity entityToSpawn58 = new DarkLatexFoxEntity((EntityType<DarkLatexFoxEntity>) ((EntityType) LatexModEntities.DARK_LATEX_FOX.get()), (Level) _level59);
                        entityToSpawn58.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn58.setYBodyRot(0.0f);
                        entityToSpawn58.setYHeadRot(0.0f);
                        if (entityToSpawn58 instanceof Mob) {
                            ((Mob) entityToSpawn58).finalizeSpawn(_level59, world.getCurrentDifficultyAt(entityToSpawn58.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn58);
                    }
                    if (world instanceof ServerLevel) {
                        ServerLevel _level60 = (ServerLevel) world;
                        Entity entityToSpawn59 = new DarklatexslugEntity((EntityType<DarklatexslugEntity>) ((EntityType) LatexModEntities.DARKLATEXSLUG.get()), (Level) _level60);
                        entityToSpawn59.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn59.setYBodyRot(0.0f);
                        entityToSpawn59.setYHeadRot(0.0f);
                        if (entityToSpawn59 instanceof Mob) {
                            ((Mob) entityToSpawn59).finalizeSpawn(_level60, world.getCurrentDifficultyAt(entityToSpawn59.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn59);
                    }
                    if (world instanceof ServerLevel) {
                        ServerLevel _level61 = (ServerLevel) world;
                        Entity entityToSpawn60 = new DarklatexslugEntity((EntityType<DarklatexslugEntity>) ((EntityType) LatexModEntities.DARKLATEXSLUG.get()), (Level) _level61);
                        entityToSpawn60.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn60.setYBodyRot(0.0f);
                        entityToSpawn60.setYHeadRot(0.0f);
                        if (entityToSpawn60 instanceof Mob) {
                            ((Mob) entityToSpawn60).finalizeSpawn(_level61, world.getCurrentDifficultyAt(entityToSpawn60.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn60);
                    }
                    if (world instanceof ServerLevel) {
                        ServerLevel _level62 = (ServerLevel) world;
                        Entity entityToSpawn61 = new DarklatexslugEntity((EntityType<DarklatexslugEntity>) ((EntityType) LatexModEntities.DARKLATEXSLUG.get()), (Level) _level62);
                        entityToSpawn61.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn61.setYBodyRot(0.0f);
                        entityToSpawn61.setYHeadRot(0.0f);
                        if (entityToSpawn61 instanceof Mob) {
                            ((Mob) entityToSpawn61).finalizeSpawn(_level62, world.getCurrentDifficultyAt(entityToSpawn61.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn61);
                    }
                    if (world instanceof ServerLevel) {
                        ServerLevel _level63 = (ServerLevel) world;
                        Entity entityToSpawn62 = new DarklatexslugEntity((EntityType<DarklatexslugEntity>) ((EntityType) LatexModEntities.DARKLATEXSLUG.get()), (Level) _level63);
                        entityToSpawn62.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn62.setYBodyRot(0.0f);
                        entityToSpawn62.setYHeadRot(0.0f);
                        if (entityToSpawn62 instanceof Mob) {
                            ((Mob) entityToSpawn62).finalizeSpawn(_level63, world.getCurrentDifficultyAt(entityToSpawn62.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn62);
                    }
                } else {
                    if (world instanceof ServerLevel) {
                        ServerLevel _level64 = (ServerLevel) world;
                        Entity entityToSpawn63 = new YufengEntity((EntityType<YufengEntity>) ((EntityType) LatexModEntities.YUFENG.get()), (Level) _level64);
                        entityToSpawn63.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn63.setYBodyRot(0.0f);
                        entityToSpawn63.setYHeadRot(0.0f);
                        if (entityToSpawn63 instanceof Mob) {
                            ((Mob) entityToSpawn63).finalizeSpawn(_level64, world.getCurrentDifficultyAt(entityToSpawn63.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn63);
                    }
                    if (world instanceof ServerLevel) {
                        ServerLevel _level65 = (ServerLevel) world;
                        Entity entityToSpawn64 = new DarklatexEntity((EntityType<DarklatexEntity>) ((EntityType) LatexModEntities.DARKLATEX.get()), (Level) _level65);
                        entityToSpawn64.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn64.setYBodyRot(0.0f);
                        entityToSpawn64.setYHeadRot(0.0f);
                        if (entityToSpawn64 instanceof Mob) {
                            ((Mob) entityToSpawn64).finalizeSpawn(_level65, world.getCurrentDifficultyAt(entityToSpawn64.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
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
