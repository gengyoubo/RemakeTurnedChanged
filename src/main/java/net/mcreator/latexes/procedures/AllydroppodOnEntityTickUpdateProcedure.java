package net.mcreator.latexes.procedures;

import net.mcreator.latexes.entity.AHVHertxEntity;
import net.mcreator.latexes.entity.AshburyHertxEntity;
import net.mcreator.latexes.entity.BeeHertxEntity;
import net.mcreator.latexes.entity.HertxEntity;
import net.mcreator.latexes.entity.HertxvarFBEntity;
import net.mcreator.latexes.entity.HertxvarFEntity;
import net.mcreator.latexes.entity.HertxvarSolEntity;
import net.mcreator.latexes.entity.MilitaryEntity;
import net.mcreator.latexes.entity.NXTHertxEntity;
import net.mcreator.latexes.entity.ScientistEntity;
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
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.animal.IronGolem;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.ForgeRegistries;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/AllydroppodOnEntityTickUpdateProcedure.class */
public class AllydroppodOnEntityTickUpdateProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity != null) {
            if (!(world.getBlockState(new BlockPos(x, y - 1.0d, z)).getBlock() == Blocks.CAVE_AIR || world.getBlockState(new BlockPos(x, y - 1.0d, z)).getBlock() == Blocks.VOID_AIR || world.getBlockState(new BlockPos(x, y - 1.0d, z)).getBlock() == Blocks.AIR || world.getBlockState(new BlockPos(x + 1.0d, y - 1.0d, z)).getBlock() == Blocks.CAVE_AIR || world.getBlockState(new BlockPos(x + 1.0d, y - 1.0d, z)).getBlock() == Blocks.VOID_AIR || world.getBlockState(new BlockPos(x + 1.0d, y - 1.0d, z)).getBlock() == Blocks.AIR || world.getBlockState(new BlockPos(x - 1.0d, y - 1.0d, z)).getBlock() == Blocks.CAVE_AIR || world.getBlockState(new BlockPos(x - 1.0d, y - 1.0d, z)).getBlock() == Blocks.VOID_AIR || world.getBlockState(new BlockPos(x - 1.0d, y - 1.0d, z)).getBlock() == Blocks.AIR || world.getBlockState(new BlockPos(x, y - 1.0d, z + 1.0d)).getBlock() == Blocks.CAVE_AIR || world.getBlockState(new BlockPos(x, y - 1.0d, z + 1.0d)).getBlock() == Blocks.VOID_AIR || world.getBlockState(new BlockPos(x, y - 1.0d, z + 1.0d)).getBlock() == Blocks.AIR || world.getBlockState(new BlockPos(x, y - 1.0d, z - 1.0d)).getBlock() == Blocks.CAVE_AIR || world.getBlockState(new BlockPos(x, y - 1.0d, z - 1.0d)).getBlock() == Blocks.VOID_AIR || world.getBlockState(new BlockPos(x, y - 1.0d, z - 1.0d)).getBlock() == Blocks.AIR)) {
                if (world instanceof ServerLevel) {
                    ((ServerLevel) world).sendParticles(ParticleTypes.SPLASH, x, y, z, 5, 3.0d, 3.0d, 3.0d, 1.0d);
                }
                if (world instanceof Level) {
                    Level _level = (Level) world;
                    if (!_level.isClientSide()) {
                        _level.playSound((Player) null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.experience_orb.pickup")), SoundSource.BLOCKS, 1.0f, 1.0f);
                    } else {
                        _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.experience_orb.pickup")), SoundSource.BLOCKS, 1.0f, 1.0f, false);
                    }
                }
                if (Math.random() < 0.7d) {
                    world.setBlock(new BlockPos(x, y, z), ((Block) LatexModBlocks.SUPPLY_CRATE.get()).defaultBlockState(), 3);
                } else if (Math.random() < 0.2d) {
                    if (world instanceof ServerLevel) {
                        ServerLevel _level2 = (ServerLevel) world;
                        Entity entityToSpawn = new Villager(EntityType.VILLAGER, _level2);
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
                        Entity entityToSpawn2 = new IronGolem(EntityType.IRON_GOLEM, _level3);
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
                        Entity entityToSpawn3 = new Villager(EntityType.VILLAGER, _level4);
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
                        Entity entityToSpawn4 = new Villager(EntityType.VILLAGER, _level5);
                        entityToSpawn4.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn4.setYBodyRot(0.0f);
                        entityToSpawn4.setYHeadRot(0.0f);
                        if (entityToSpawn4 instanceof Mob) {
                            ((Mob) entityToSpawn4).finalizeSpawn(_level5, world.getCurrentDifficultyAt(entityToSpawn4.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn4);
                    }
                } else if (Math.random() < 0.2d) {
                    if (world instanceof ServerLevel) {
                        ServerLevel _level6 = (ServerLevel) world;
                        Entity entityToSpawn5 = new Villager(EntityType.VILLAGER, _level6);
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
                        Entity entityToSpawn6 = new Villager(EntityType.VILLAGER, _level7);
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
                        Entity entityToSpawn7 = new Villager(EntityType.VILLAGER, _level8);
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
                        Entity entityToSpawn8 = new MilitaryEntity((EntityType<MilitaryEntity>) ((EntityType) LatexModEntities.MILITARY.get()), (Level) _level9);
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
                        Entity entityToSpawn9 = new MilitaryEntity((EntityType<MilitaryEntity>) ((EntityType) LatexModEntities.MILITARY.get()), (Level) _level10);
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
                        Entity entityToSpawn10 = new ScientistEntity((EntityType<ScientistEntity>) ((EntityType) LatexModEntities.SCIENTIST.get()), (Level) _level11);
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
                        Entity entityToSpawn11 = new ScientistEntity((EntityType<ScientistEntity>) ((EntityType) LatexModEntities.SCIENTIST.get()), (Level) _level12);
                        entityToSpawn11.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn11.setYBodyRot(0.0f);
                        entityToSpawn11.setYHeadRot(0.0f);
                        if (entityToSpawn11 instanceof Mob) {
                            ((Mob) entityToSpawn11).finalizeSpawn(_level12, world.getCurrentDifficultyAt(entityToSpawn11.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn11);
                    }
                } else if (Math.random() < 0.2d) {
                    if (world instanceof ServerLevel) {
                        ServerLevel _level13 = (ServerLevel) world;
                        Entity entityToSpawn12 = new ScientistEntity((EntityType<ScientistEntity>) ((EntityType) LatexModEntities.SCIENTIST.get()), (Level) _level13);
                        entityToSpawn12.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn12.setYBodyRot(0.0f);
                        entityToSpawn12.setYHeadRot(0.0f);
                        if (entityToSpawn12 instanceof Mob) {
                            ((Mob) entityToSpawn12).finalizeSpawn(_level13, world.getCurrentDifficultyAt(entityToSpawn12.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn12);
                    }
                    if (world instanceof ServerLevel) {
                        ServerLevel _level14 = (ServerLevel) world;
                        Entity entityToSpawn13 = new ScientistEntity((EntityType<ScientistEntity>) ((EntityType) LatexModEntities.SCIENTIST.get()), (Level) _level14);
                        entityToSpawn13.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn13.setYBodyRot(0.0f);
                        entityToSpawn13.setYHeadRot(0.0f);
                        if (entityToSpawn13 instanceof Mob) {
                            ((Mob) entityToSpawn13).finalizeSpawn(_level14, world.getCurrentDifficultyAt(entityToSpawn13.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn13);
                    }
                    if (Math.random() < 0.05d) {
                        if (world instanceof ServerLevel) {
                            ServerLevel _level15 = (ServerLevel) world;
                            Entity entityToSpawn14 = new AHVHertxEntity((EntityType<AHVHertxEntity>) ((EntityType) LatexModEntities.AHV_HERTX.get()), (Level) _level15);
                            entityToSpawn14.moveTo(x, y, z, 0.0f, 0.0f);
                            entityToSpawn14.setYBodyRot(0.0f);
                            entityToSpawn14.setYHeadRot(0.0f);
                            if (entityToSpawn14 instanceof Mob) {
                                ((Mob) entityToSpawn14).finalizeSpawn(_level15, world.getCurrentDifficultyAt(entityToSpawn14.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                            }
                            world.addFreshEntity(entityToSpawn14);
                        }
                    } else if (Math.random() < 0.05d) {
                        if (world instanceof ServerLevel) {
                            ServerLevel _level16 = (ServerLevel) world;
                            Entity entityToSpawn15 = new NXTHertxEntity((EntityType<NXTHertxEntity>) ((EntityType) LatexModEntities.NXT_HERTX.get()), (Level) _level16);
                            entityToSpawn15.moveTo(x, y, z, 0.0f, 0.0f);
                            entityToSpawn15.setYBodyRot(0.0f);
                            entityToSpawn15.setYHeadRot(0.0f);
                            if (entityToSpawn15 instanceof Mob) {
                                ((Mob) entityToSpawn15).finalizeSpawn(_level16, world.getCurrentDifficultyAt(entityToSpawn15.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                            }
                            world.addFreshEntity(entityToSpawn15);
                        }
                    } else if (Math.random() < 0.05d) {
                        if (world instanceof ServerLevel) {
                            ServerLevel _level17 = (ServerLevel) world;
                            Entity entityToSpawn16 = new AshburyHertxEntity((EntityType<AshburyHertxEntity>) ((EntityType) LatexModEntities.ASHBURY_HERTX.get()), (Level) _level17);
                            entityToSpawn16.moveTo(x, y, z, 0.0f, 0.0f);
                            entityToSpawn16.setYBodyRot(0.0f);
                            entityToSpawn16.setYHeadRot(0.0f);
                            if (entityToSpawn16 instanceof Mob) {
                                ((Mob) entityToSpawn16).finalizeSpawn(_level17, world.getCurrentDifficultyAt(entityToSpawn16.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                            }
                            world.addFreshEntity(entityToSpawn16);
                        }
                    } else if (Math.random() < 0.075d) {
                        if (world instanceof ServerLevel) {
                            ServerLevel _level18 = (ServerLevel) world;
                            Entity entityToSpawn17 = new BeeHertxEntity((EntityType<BeeHertxEntity>) ((EntityType) LatexModEntities.BEE_HERTX.get()), (Level) _level18);
                            entityToSpawn17.moveTo(x, y, z, 0.0f, 0.0f);
                            entityToSpawn17.setYBodyRot(0.0f);
                            entityToSpawn17.setYHeadRot(0.0f);
                            if (entityToSpawn17 instanceof Mob) {
                                ((Mob) entityToSpawn17).finalizeSpawn(_level18, world.getCurrentDifficultyAt(entityToSpawn17.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                            }
                            world.addFreshEntity(entityToSpawn17);
                        }
                    } else if (Math.random() < 0.1d) {
                        if (world instanceof ServerLevel) {
                            ServerLevel _level19 = (ServerLevel) world;
                            Entity entityToSpawn18 = new HertxvarFEntity((EntityType<HertxvarFEntity>) ((EntityType) LatexModEntities.HERTXVAR_F.get()), (Level) _level19);
                            entityToSpawn18.moveTo(x, y, z, 0.0f, 0.0f);
                            entityToSpawn18.setYBodyRot(0.0f);
                            entityToSpawn18.setYHeadRot(0.0f);
                            if (entityToSpawn18 instanceof Mob) {
                                ((Mob) entityToSpawn18).finalizeSpawn(_level19, world.getCurrentDifficultyAt(entityToSpawn18.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                            }
                            world.addFreshEntity(entityToSpawn18);
                        }
                    } else if (Math.random() < 0.1d) {
                        if (world instanceof ServerLevel) {
                            ServerLevel _level20 = (ServerLevel) world;
                            Entity entityToSpawn19 = new HertxvarFBEntity((EntityType<HertxvarFBEntity>) ((EntityType) LatexModEntities.HERTXVAR_FB.get()), (Level) _level20);
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
                            Entity entityToSpawn20 = new HertxvarSolEntity((EntityType<HertxvarSolEntity>) ((EntityType) LatexModEntities.HERTXVAR_SOL.get()), (Level) _level21);
                            entityToSpawn20.moveTo(x, y, z, 0.0f, 0.0f);
                            entityToSpawn20.setYBodyRot(0.0f);
                            entityToSpawn20.setYHeadRot(0.0f);
                            if (entityToSpawn20 instanceof Mob) {
                                ((Mob) entityToSpawn20).finalizeSpawn(_level21, world.getCurrentDifficultyAt(entityToSpawn20.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                            }
                            world.addFreshEntity(entityToSpawn20);
                        }
                    } else if (world instanceof ServerLevel) {
                        ServerLevel _level22 = (ServerLevel) world;
                        Entity entityToSpawn21 = new HertxEntity((EntityType<HertxEntity>) ((EntityType) LatexModEntities.HERTX.get()), (Level) _level22);
                        entityToSpawn21.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn21.setYBodyRot(0.0f);
                        entityToSpawn21.setYHeadRot(0.0f);
                        if (entityToSpawn21 instanceof Mob) {
                            ((Mob) entityToSpawn21).finalizeSpawn(_level22, world.getCurrentDifficultyAt(entityToSpawn21.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn21);
                    }
                } else if (Math.random() < 0.2d) {
                    if (world instanceof ServerLevel) {
                        ServerLevel _level23 = (ServerLevel) world;
                        Entity entityToSpawn22 = new Villager(EntityType.VILLAGER, _level23);
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
                        Entity entityToSpawn23 = new Villager(EntityType.VILLAGER, _level24);
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
                        Entity entityToSpawn24 = new ScientistEntity((EntityType<ScientistEntity>) ((EntityType) LatexModEntities.SCIENTIST.get()), (Level) _level25);
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
                        Entity entityToSpawn25 = new ScientistEntity((EntityType<ScientistEntity>) ((EntityType) LatexModEntities.SCIENTIST.get()), (Level) _level26);
                        entityToSpawn25.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn25.setYBodyRot(0.0f);
                        entityToSpawn25.setYHeadRot(0.0f);
                        if (entityToSpawn25 instanceof Mob) {
                            ((Mob) entityToSpawn25).finalizeSpawn(_level26, world.getCurrentDifficultyAt(entityToSpawn25.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn25);
                    }
                } else if (Math.random() < 0.05d) {
                    if (world instanceof ServerLevel) {
                        ServerLevel _level27 = (ServerLevel) world;
                        Entity entityToSpawn26 = new AHVHertxEntity((EntityType<AHVHertxEntity>) ((EntityType) LatexModEntities.AHV_HERTX.get()), (Level) _level27);
                        entityToSpawn26.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn26.setYBodyRot(0.0f);
                        entityToSpawn26.setYHeadRot(0.0f);
                        if (entityToSpawn26 instanceof Mob) {
                            ((Mob) entityToSpawn26).finalizeSpawn(_level27, world.getCurrentDifficultyAt(entityToSpawn26.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn26);
                    }
                } else if (Math.random() < 0.05d) {
                    if (world instanceof ServerLevel) {
                        ServerLevel _level28 = (ServerLevel) world;
                        Entity entityToSpawn27 = new NXTHertxEntity((EntityType<NXTHertxEntity>) ((EntityType) LatexModEntities.NXT_HERTX.get()), (Level) _level28);
                        entityToSpawn27.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn27.setYBodyRot(0.0f);
                        entityToSpawn27.setYHeadRot(0.0f);
                        if (entityToSpawn27 instanceof Mob) {
                            ((Mob) entityToSpawn27).finalizeSpawn(_level28, world.getCurrentDifficultyAt(entityToSpawn27.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn27);
                    }
                } else if (Math.random() < 0.05d) {
                    if (world instanceof ServerLevel) {
                        ServerLevel _level29 = (ServerLevel) world;
                        Entity entityToSpawn28 = new AshburyHertxEntity((EntityType<AshburyHertxEntity>) ((EntityType) LatexModEntities.ASHBURY_HERTX.get()), (Level) _level29);
                        entityToSpawn28.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn28.setYBodyRot(0.0f);
                        entityToSpawn28.setYHeadRot(0.0f);
                        if (entityToSpawn28 instanceof Mob) {
                            ((Mob) entityToSpawn28).finalizeSpawn(_level29, world.getCurrentDifficultyAt(entityToSpawn28.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn28);
                    }
                } else if (Math.random() < 0.075d) {
                    if (world instanceof ServerLevel) {
                        ServerLevel _level30 = (ServerLevel) world;
                        Entity entityToSpawn29 = new BeeHertxEntity((EntityType<BeeHertxEntity>) ((EntityType) LatexModEntities.BEE_HERTX.get()), (Level) _level30);
                        entityToSpawn29.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn29.setYBodyRot(0.0f);
                        entityToSpawn29.setYHeadRot(0.0f);
                        if (entityToSpawn29 instanceof Mob) {
                            ((Mob) entityToSpawn29).finalizeSpawn(_level30, world.getCurrentDifficultyAt(entityToSpawn29.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn29);
                    }
                } else if (Math.random() < 0.1d) {
                    if (world instanceof ServerLevel) {
                        ServerLevel _level31 = (ServerLevel) world;
                        Entity entityToSpawn30 = new HertxvarFEntity((EntityType<HertxvarFEntity>) ((EntityType) LatexModEntities.HERTXVAR_F.get()), (Level) _level31);
                        entityToSpawn30.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn30.setYBodyRot(0.0f);
                        entityToSpawn30.setYHeadRot(0.0f);
                        if (entityToSpawn30 instanceof Mob) {
                            ((Mob) entityToSpawn30).finalizeSpawn(_level31, world.getCurrentDifficultyAt(entityToSpawn30.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn30);
                    }
                } else if (Math.random() < 0.1d) {
                    if (world instanceof ServerLevel) {
                        ServerLevel _level32 = (ServerLevel) world;
                        Entity entityToSpawn31 = new HertxvarFBEntity((EntityType<HertxvarFBEntity>) ((EntityType) LatexModEntities.HERTXVAR_FB.get()), (Level) _level32);
                        entityToSpawn31.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn31.setYBodyRot(0.0f);
                        entityToSpawn31.setYHeadRot(0.0f);
                        if (entityToSpawn31 instanceof Mob) {
                            ((Mob) entityToSpawn31).finalizeSpawn(_level32, world.getCurrentDifficultyAt(entityToSpawn31.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn31);
                    }
                } else if (Math.random() < 0.1d) {
                    if (world instanceof ServerLevel) {
                        ServerLevel _level33 = (ServerLevel) world;
                        Entity entityToSpawn32 = new HertxvarSolEntity((EntityType<HertxvarSolEntity>) ((EntityType) LatexModEntities.HERTXVAR_SOL.get()), (Level) _level33);
                        entityToSpawn32.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn32.setYBodyRot(0.0f);
                        entityToSpawn32.setYHeadRot(0.0f);
                        if (entityToSpawn32 instanceof Mob) {
                            ((Mob) entityToSpawn32).finalizeSpawn(_level33, world.getCurrentDifficultyAt(entityToSpawn32.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn32);
                    }
                } else if (world instanceof ServerLevel) {
                    ServerLevel _level34 = (ServerLevel) world;
                    Entity entityToSpawn33 = new HertxEntity((EntityType<HertxEntity>) ((EntityType) LatexModEntities.HERTX.get()), (Level) _level34);
                    entityToSpawn33.moveTo(x, y, z, 0.0f, 0.0f);
                    entityToSpawn33.setYBodyRot(0.0f);
                    entityToSpawn33.setYHeadRot(0.0f);
                    if (entityToSpawn33 instanceof Mob) {
                        ((Mob) entityToSpawn33).finalizeSpawn(_level34, world.getCurrentDifficultyAt(entityToSpawn33.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                    }
                    world.addFreshEntity(entityToSpawn33);
                }
                if (!entity.level.isClientSide()) {
                    entity.discard();
                }
            }
        }
    }
}
