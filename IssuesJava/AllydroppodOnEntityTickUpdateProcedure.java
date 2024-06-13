package net.ltxprogrammer.turned.procedures;

import net.ltxprogrammer.turned.entity.AHVHertxEntity;
import net.ltxprogrammer.turned.entity.AshburyHertxEntity;
import net.ltxprogrammer.turned.entity.BeeHertxEntity;
import net.ltxprogrammer.turned.entity.HertxEntity;
import net.ltxprogrammer.turned.entity.HertxvarFBEntity;
import net.ltxprogrammer.turned.entity.HertxvarFEntity;
import net.ltxprogrammer.turned.entity.HertxvarSolEntity;
import net.ltxprogrammer.turned.entity.MilitaryEntity;
import net.ltxprogrammer.turned.entity.NXTHertxEntity;
import net.ltxprogrammer.turned.entity.ScientistEntity;
import net.ltxprogrammer.turned.init.LatexModBlocks;
import LatexModEntities;
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
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Objects;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/AllydroppodOnEntityTickUpdateProcedure.class */
public class AllydroppodOnEntityTickUpdateProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity != null) {
            if (!(world.getBlockState(new BlockPos(x, y - 1.0d, z)).getBlock() == Blocks.CAVE_AIR || world.getBlockState(new BlockPos(x, y - 1.0d, z)).getBlock() == Blocks.VOID_AIR || world.getBlockState(new BlockPos(x, y - 1.0d, z)).getBlock() == Blocks.AIR || world.getBlockState(new BlockPos(x + 1.0d, y - 1.0d, z)).getBlock() == Blocks.CAVE_AIR || world.getBlockState(new BlockPos(x + 1.0d, y - 1.0d, z)).getBlock() == Blocks.VOID_AIR || world.getBlockState(new BlockPos(x + 1.0d, y - 1.0d, z)).getBlock() == Blocks.AIR || world.getBlockState(new BlockPos(x - 1.0d, y - 1.0d, z)).getBlock() == Blocks.CAVE_AIR || world.getBlockState(new BlockPos(x - 1.0d, y - 1.0d, z)).getBlock() == Blocks.VOID_AIR || world.getBlockState(new BlockPos(x - 1.0d, y - 1.0d, z)).getBlock() == Blocks.AIR || world.getBlockState(new BlockPos(x, y - 1.0d, z + 1.0d)).getBlock() == Blocks.CAVE_AIR || world.getBlockState(new BlockPos(x, y - 1.0d, z + 1.0d)).getBlock() == Blocks.VOID_AIR || world.getBlockState(new BlockPos(x, y - 1.0d, z + 1.0d)).getBlock() == Blocks.AIR || world.getBlockState(new BlockPos(x, y - 1.0d, z - 1.0d)).getBlock() == Blocks.CAVE_AIR || world.getBlockState(new BlockPos(x, y - 1.0d, z - 1.0d)).getBlock() == Blocks.VOID_AIR || world.getBlockState(new BlockPos(x, y - 1.0d, z - 1.0d)).getBlock() == Blocks.AIR)) {
                if (world instanceof ServerLevel) {
                    ((ServerLevel) world).sendParticles(ParticleTypes.SPLASH, x, y, z, 5, 3.0d, 3.0d, 3.0d, 1.0d);
                }
                if (world instanceof Level _level) {
                    if (!_level.isClientSide()) {
                        _level.playSound(null, new BlockPos(x, y, z), Objects.requireNonNull(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.experience_orb.pickup"))), SoundSource.BLOCKS, 1.0f, 1.0f);
                    } else {
                        _level.playLocalSound(x, y, z, Objects.requireNonNull(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.experience_orb.pickup"))), SoundSource.BLOCKS, 1.0f, 1.0f, false);
                    }
                }
                if (Math.random() < 0.7d) {
                    world.setBlock(new BlockPos(x, y, z), LatexModBlocks.SUPPLY_CRATE.get().defaultBlockState(), 3);
                } else if (Math.random() < 0.2d) {
                    if (world instanceof ServerLevel _level2) {
                        Entity entityToSpawn = new Villager(EntityType.VILLAGER, _level2);
                        entityToSpawn.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn.setYBodyRot(0.0f);
                        entityToSpawn.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn).finalizeSpawn(_level2, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn);
                    }
                    if (world instanceof ServerLevel _level3) {
                        Entity entityToSpawn2 = new IronGolem(EntityType.IRON_GOLEM, _level3);
                        entityToSpawn2.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn2.setYBodyRot(0.0f);
                        entityToSpawn2.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn2).finalizeSpawn(_level3, world.getCurrentDifficultyAt(entityToSpawn2.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn2);
                    }
                    if (world instanceof ServerLevel _level4) {
                        Entity entityToSpawn3 = new Villager(EntityType.VILLAGER, _level4);
                        entityToSpawn3.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn3.setYBodyRot(0.0f);
                        entityToSpawn3.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn3).finalizeSpawn(_level4, world.getCurrentDifficultyAt(entityToSpawn3.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn3);
                    }
                    if (world instanceof ServerLevel _level5) {
                        Entity entityToSpawn4 = new Villager(EntityType.VILLAGER, _level5);
                        entityToSpawn4.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn4.setYBodyRot(0.0f);
                        entityToSpawn4.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn4).finalizeSpawn(_level5, world.getCurrentDifficultyAt(entityToSpawn4.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn4);
                    }
                } else if (Math.random() < 0.2d) {
                    if (world instanceof ServerLevel _level6) {
                        Entity entityToSpawn5 = new Villager(EntityType.VILLAGER, _level6);
                        entityToSpawn5.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn5.setYBodyRot(0.0f);
                        entityToSpawn5.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn5).finalizeSpawn(_level6, world.getCurrentDifficultyAt(entityToSpawn5.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn5);
                    }
                    if (world instanceof ServerLevel _level7) {
                        Entity entityToSpawn6 = new Villager(EntityType.VILLAGER, _level7);
                        entityToSpawn6.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn6.setYBodyRot(0.0f);
                        entityToSpawn6.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn6).finalizeSpawn(_level7, world.getCurrentDifficultyAt(entityToSpawn6.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn6);
                    }
                    if (world instanceof ServerLevel _level8) {
                        Entity entityToSpawn7 = new Villager(EntityType.VILLAGER, _level8);
                        entityToSpawn7.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn7.setYBodyRot(0.0f);
                        entityToSpawn7.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn7).finalizeSpawn(_level8, world.getCurrentDifficultyAt(entityToSpawn7.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn7);
                    }
                    if (world instanceof ServerLevel _level9) {
                        Entity entityToSpawn8 = new MilitaryEntity((EntityType<MilitaryEntity>) LatexModEntities.MILITARY.get(), _level9);
                        entityToSpawn8.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn8.setYBodyRot(0.0f);
                        entityToSpawn8.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn8).finalizeSpawn(_level9, world.getCurrentDifficultyAt(entityToSpawn8.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn8);
                    }
                } else if (Math.random() < 0.2d) {
                    if (world instanceof ServerLevel _level10) {
                        Entity entityToSpawn9 = new MilitaryEntity((EntityType<MilitaryEntity>) LatexModEntities.MILITARY.get(), _level10);
                        entityToSpawn9.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn9.setYBodyRot(0.0f);
                        entityToSpawn9.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn9).finalizeSpawn(_level10, world.getCurrentDifficultyAt(entityToSpawn9.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn9);
                    }
                    if (world instanceof ServerLevel _level11) {
                        Entity entityToSpawn10 = new ScientistEntity((EntityType<ScientistEntity>) LatexModEntities.SCIENTIST.get(), _level11);
                        entityToSpawn10.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn10.setYBodyRot(0.0f);
                        entityToSpawn10.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn10).finalizeSpawn(_level11, world.getCurrentDifficultyAt(entityToSpawn10.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn10);
                    }
                    if (world instanceof ServerLevel _level12) {
                        Entity entityToSpawn11 = new ScientistEntity((EntityType<ScientistEntity>) LatexModEntities.SCIENTIST.get(), _level12);
                        entityToSpawn11.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn11.setYBodyRot(0.0f);
                        entityToSpawn11.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn11).finalizeSpawn(_level12, world.getCurrentDifficultyAt(entityToSpawn11.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn11);
                    }
                } else if (Math.random() < 0.2d) {
                    if (world instanceof ServerLevel _level13) {
                        Entity entityToSpawn12 = new ScientistEntity((EntityType<ScientistEntity>) LatexModEntities.SCIENTIST.get(), _level13);
                        entityToSpawn12.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn12.setYBodyRot(0.0f);
                        entityToSpawn12.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn12).finalizeSpawn(_level13, world.getCurrentDifficultyAt(entityToSpawn12.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn12);
                    }
                    if (world instanceof ServerLevel _level14) {
                        Entity entityToSpawn13 = new ScientistEntity((EntityType<ScientistEntity>) LatexModEntities.SCIENTIST.get(), _level14);
                        entityToSpawn13.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn13.setYBodyRot(0.0f);
                        entityToSpawn13.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn13).finalizeSpawn(_level14, world.getCurrentDifficultyAt(entityToSpawn13.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn13);
                    }
                    if (Math.random() < 0.05d) {
                        if (world instanceof ServerLevel _level15) {
                            Entity entityToSpawn14 = new AHVHertxEntity((EntityType<AHVHertxEntity>) LatexModEntities.AHV_HERTX.get(), _level15);
                            entityToSpawn14.moveTo(x, y, z, 0.0f, 0.0f);
                            entityToSpawn14.setYBodyRot(0.0f);
                            entityToSpawn14.setYHeadRot(0.0f);
                            ((Mob) entityToSpawn14).finalizeSpawn(_level15, world.getCurrentDifficultyAt(entityToSpawn14.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                            world.addFreshEntity(entityToSpawn14);
                        }
                    } else if (Math.random() < 0.05d) {
                        if (world instanceof ServerLevel _level16) {
                            Entity entityToSpawn15 = new NXTHertxEntity((EntityType<NXTHertxEntity>) LatexModEntities.NXT_HERTX.get(), _level16);
                            entityToSpawn15.moveTo(x, y, z, 0.0f, 0.0f);
                            entityToSpawn15.setYBodyRot(0.0f);
                            entityToSpawn15.setYHeadRot(0.0f);
                            ((Mob) entityToSpawn15).finalizeSpawn(_level16, world.getCurrentDifficultyAt(entityToSpawn15.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                            world.addFreshEntity(entityToSpawn15);
                        }
                    } else if (Math.random() < 0.05d) {
                        if (world instanceof ServerLevel _level17) {
                            Entity entityToSpawn16 = new AshburyHertxEntity((EntityType<AshburyHertxEntity>) LatexModEntities.ASHBURY_HERTX.get(), _level17);
                            entityToSpawn16.moveTo(x, y, z, 0.0f, 0.0f);
                            entityToSpawn16.setYBodyRot(0.0f);
                            entityToSpawn16.setYHeadRot(0.0f);
                            ((Mob) entityToSpawn16).finalizeSpawn(_level17, world.getCurrentDifficultyAt(entityToSpawn16.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                            world.addFreshEntity(entityToSpawn16);
                        }
                    } else if (Math.random() < 0.075d) {
                        if (world instanceof ServerLevel _level18) {
                            Entity entityToSpawn17 = new BeeHertxEntity((EntityType<BeeHertxEntity>) LatexModEntities.BEE_HERTX.get(), _level18);
                            entityToSpawn17.moveTo(x, y, z, 0.0f, 0.0f);
                            entityToSpawn17.setYBodyRot(0.0f);
                            entityToSpawn17.setYHeadRot(0.0f);
                            ((Mob) entityToSpawn17).finalizeSpawn(_level18, world.getCurrentDifficultyAt(entityToSpawn17.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                            world.addFreshEntity(entityToSpawn17);
                        }
                    } else if (Math.random() < 0.1d) {
                        if (world instanceof ServerLevel _level19) {
                            Entity entityToSpawn18 = new HertxvarFEntity((EntityType<HertxvarFEntity>) LatexModEntities.HERTXVAR_F.get(), _level19);
                            entityToSpawn18.moveTo(x, y, z, 0.0f, 0.0f);
                            entityToSpawn18.setYBodyRot(0.0f);
                            entityToSpawn18.setYHeadRot(0.0f);
                            ((Mob) entityToSpawn18).finalizeSpawn(_level19, world.getCurrentDifficultyAt(entityToSpawn18.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                            world.addFreshEntity(entityToSpawn18);
                        }
                    } else if (Math.random() < 0.1d) {
                        if (world instanceof ServerLevel _level20) {
                            Entity entityToSpawn19 = new HertxvarFBEntity((EntityType<HertxvarFBEntity>) LatexModEntities.HERTXVAR_FB.get(), _level20);
                            entityToSpawn19.moveTo(x, y, z, 0.0f, 0.0f);
                            entityToSpawn19.setYBodyRot(0.0f);
                            entityToSpawn19.setYHeadRot(0.0f);
                            ((Mob) entityToSpawn19).finalizeSpawn(_level20, world.getCurrentDifficultyAt(entityToSpawn19.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                            world.addFreshEntity(entityToSpawn19);
                        }
                    } else if (Math.random() < 0.1d) {
                        if (world instanceof ServerLevel _level21) {
                            Entity entityToSpawn20 = new HertxvarSolEntity((EntityType<HertxvarSolEntity>) LatexModEntities.HERTXVAR_SOL.get(), _level21);
                            entityToSpawn20.moveTo(x, y, z, 0.0f, 0.0f);
                            entityToSpawn20.setYBodyRot(0.0f);
                            entityToSpawn20.setYHeadRot(0.0f);
                            ((Mob) entityToSpawn20).finalizeSpawn(_level21, world.getCurrentDifficultyAt(entityToSpawn20.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                            world.addFreshEntity(entityToSpawn20);
                        }
                    } else if (world instanceof ServerLevel _level22) {
                        Entity entityToSpawn21 = new HertxEntity((EntityType<HertxEntity>) LatexModEntities.HERTX.get(), _level22);
                        entityToSpawn21.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn21.setYBodyRot(0.0f);
                        entityToSpawn21.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn21).finalizeSpawn(_level22, world.getCurrentDifficultyAt(entityToSpawn21.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn21);
                    }
                } else if (Math.random() < 0.2d) {
                    if (world instanceof ServerLevel _level23) {
                        Entity entityToSpawn22 = new Villager(EntityType.VILLAGER, _level23);
                        entityToSpawn22.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn22.setYBodyRot(0.0f);
                        entityToSpawn22.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn22).finalizeSpawn(_level23, world.getCurrentDifficultyAt(entityToSpawn22.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn22);
                    }
                    if (world instanceof ServerLevel _level24) {
                        Entity entityToSpawn23 = new Villager(EntityType.VILLAGER, _level24);
                        entityToSpawn23.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn23.setYBodyRot(0.0f);
                        entityToSpawn23.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn23).finalizeSpawn(_level24, world.getCurrentDifficultyAt(entityToSpawn23.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn23);
                    }
                    if (world instanceof ServerLevel _level25) {
                        Entity entityToSpawn24 = new ScientistEntity((EntityType<ScientistEntity>) LatexModEntities.SCIENTIST.get(), _level25);
                        entityToSpawn24.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn24.setYBodyRot(0.0f);
                        entityToSpawn24.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn24).finalizeSpawn(_level25, world.getCurrentDifficultyAt(entityToSpawn24.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn24);
                    }
                    if (world instanceof ServerLevel _level26) {
                        Entity entityToSpawn25 = new ScientistEntity((EntityType<ScientistEntity>) LatexModEntities.SCIENTIST.get(), _level26);
                        entityToSpawn25.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn25.setYBodyRot(0.0f);
                        entityToSpawn25.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn25).finalizeSpawn(_level26, world.getCurrentDifficultyAt(entityToSpawn25.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn25);
                    }
                } else if (Math.random() < 0.05d) {
                    if (world instanceof ServerLevel _level27) {
                        Entity entityToSpawn26 = new AHVHertxEntity((EntityType<AHVHertxEntity>) LatexModEntities.AHV_HERTX.get(), _level27);
                        entityToSpawn26.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn26.setYBodyRot(0.0f);
                        entityToSpawn26.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn26).finalizeSpawn(_level27, world.getCurrentDifficultyAt(entityToSpawn26.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn26);
                    }
                } else if (Math.random() < 0.05d) {
                    if (world instanceof ServerLevel _level28) {
                        Entity entityToSpawn27 = new NXTHertxEntity((EntityType<NXTHertxEntity>) LatexModEntities.NXT_HERTX.get(), _level28);
                        entityToSpawn27.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn27.setYBodyRot(0.0f);
                        entityToSpawn27.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn27).finalizeSpawn(_level28, world.getCurrentDifficultyAt(entityToSpawn27.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn27);
                    }
                } else if (Math.random() < 0.05d) {
                    if (world instanceof ServerLevel _level29) {
                        Entity entityToSpawn28 = new AshburyHertxEntity((EntityType<AshburyHertxEntity>) LatexModEntities.ASHBURY_HERTX.get(), _level29);
                        entityToSpawn28.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn28.setYBodyRot(0.0f);
                        entityToSpawn28.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn28).finalizeSpawn(_level29, world.getCurrentDifficultyAt(entityToSpawn28.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn28);
                    }
                } else if (Math.random() < 0.075d) {
                    if (world instanceof ServerLevel _level30) {
                        Entity entityToSpawn29 = new BeeHertxEntity((EntityType<BeeHertxEntity>) LatexModEntities.BEE_HERTX.get(), _level30);
                        entityToSpawn29.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn29.setYBodyRot(0.0f);
                        entityToSpawn29.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn29).finalizeSpawn(_level30, world.getCurrentDifficultyAt(entityToSpawn29.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn29);
                    }
                } else if (Math.random() < 0.1d) {
                    if (world instanceof ServerLevel _level31) {
                        Entity entityToSpawn30 = new HertxvarFEntity((EntityType<HertxvarFEntity>) LatexModEntities.HERTXVAR_F.get(), _level31);
                        entityToSpawn30.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn30.setYBodyRot(0.0f);
                        entityToSpawn30.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn30).finalizeSpawn(_level31, world.getCurrentDifficultyAt(entityToSpawn30.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn30);
                    }
                } else if (Math.random() < 0.1d) {
                    if (world instanceof ServerLevel _level32) {
                        Entity entityToSpawn31 = new HertxvarFBEntity((EntityType<HertxvarFBEntity>) LatexModEntities.HERTXVAR_FB.get(), _level32);
                        entityToSpawn31.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn31.setYBodyRot(0.0f);
                        entityToSpawn31.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn31).finalizeSpawn(_level32, world.getCurrentDifficultyAt(entityToSpawn31.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn31);
                    }
                } else if (Math.random() < 0.1d) {
                    if (world instanceof ServerLevel _level33) {
                        Entity entityToSpawn32 = new HertxvarSolEntity((EntityType<HertxvarSolEntity>) LatexModEntities.HERTXVAR_SOL.get(), _level33);
                        entityToSpawn32.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn32.setYBodyRot(0.0f);
                        entityToSpawn32.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn32).finalizeSpawn(_level33, world.getCurrentDifficultyAt(entityToSpawn32.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn32);
                    }
                } else if (world instanceof ServerLevel _level34) {
                    Entity entityToSpawn33 = new HertxEntity((EntityType<HertxEntity>) LatexModEntities.HERTX.get(), _level34);
                    entityToSpawn33.moveTo(x, y, z, 0.0f, 0.0f);
                    entityToSpawn33.setYBodyRot(0.0f);
                    entityToSpawn33.setYHeadRot(0.0f);
                    ((Mob) entityToSpawn33).finalizeSpawn(_level34, world.getCurrentDifficultyAt(entityToSpawn33.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                    world.addFreshEntity(entityToSpawn33);
                }
                if (!entity.level.isClientSide()) {
                    entity.discard();
                }
            }
        }
    }
}
