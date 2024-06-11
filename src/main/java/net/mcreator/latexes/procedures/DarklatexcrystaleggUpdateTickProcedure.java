package net.mcreator.latexes.procedures;

import com.google.common.collect.UnmodifiableIterator;
import java.util.Map;
import net.mcreator.latexes.entity.DLbeeEntity;
import net.mcreator.latexes.entity.DarkLatexFoxEntity;
import net.mcreator.latexes.entity.DarkLatexSnakeEntity;
import net.mcreator.latexes.entity.DarkLatexSpiderEntity;
import net.mcreator.latexes.entity.DarklatexEntity;
import net.mcreator.latexes.entity.DarklatexslugEntity;
import net.mcreator.latexes.entity.DlsharkEntity;
import net.mcreator.latexes.entity.NoiseStalkerEntity;
import net.mcreator.latexes.entity.YufengEntity;
import net.mcreator.latexes.init.LatexModBlocks;
import net.mcreator.latexes.init.LatexModEntities;
import net.mcreator.latexes.init.LatexModGameRules;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Property;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/DarklatexcrystaleggUpdateTickProcedure.class */
public class DarklatexcrystaleggUpdateTickProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        if (world.getBlockState(new BlockPos(x, y - 1.0d, z)).getBlock() == Blocks.AIR || world.getBlockState(new BlockPos(x, y - 1.0d, z)).getBlock() == Blocks.CAVE_AIR || world.getBlockState(new BlockPos(x, y - 1.0d, z)).getBlock() == Blocks.VOID_AIR) {
            world.destroyBlock(new BlockPos(x, y, z), false);
        }
        if (world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXCRYSTALSPAWN) && Math.random() < 0.15d) {
            if (!(world.getBlockState(new BlockPos(x, y + 1.0d, z)).getBlock() == Blocks.AIR || world.getBlockState(new BlockPos(x, y + 1.0d, z)).getBlock() == Blocks.CAVE_AIR || world.getBlockState(new BlockPos(x, y + 1.0d, z)).getBlock() == Blocks.VOID_AIR)) {
                BlockPos _bp = new BlockPos(x, y, z);
                BlockState _bs = ((Block) LatexModBlocks.DARKLATEXICE.get()).defaultBlockState();
                UnmodifiableIterator it = world.getBlockState(_bp).getValues().entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry<Property<?>, Comparable<?>> entry = (Map.Entry) it.next();
                    Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
                    if (!(_property == null || _bs.getValue(_property) == null)) {
                        try {
                            _bs = (BlockState) _bs.setValue(_property, entry.getValue());
                        } catch (Exception e) {
                        }
                    }
                }
                world.setBlock(_bp, _bs, 3);
            } else if (Math.random() < 0.8d) {
                world.destroyBlock(new BlockPos(x, y, z), false);
                if (world instanceof ServerLevel) {
                    ServerLevel _level = (ServerLevel) world;
                    Entity entityToSpawn = new DarklatexslugEntity((EntityType<DarklatexslugEntity>) ((EntityType) LatexModEntities.DARKLATEXSLUG.get()), (Level) _level);
                    entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                    if (entityToSpawn instanceof Mob) {
                        ((Mob) entityToSpawn).finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                    }
                    world.addFreshEntity(entityToSpawn);
                }
            } else if (Math.random() < 0.2d) {
                world.destroyBlock(new BlockPos(x, y, z), false);
                if (world instanceof ServerLevel) {
                    ServerLevel _level2 = (ServerLevel) world;
                    Entity entityToSpawn2 = new YufengEntity((EntityType<YufengEntity>) ((EntityType) LatexModEntities.YUFENG.get()), (Level) _level2);
                    entityToSpawn2.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                    if (entityToSpawn2 instanceof Mob) {
                        ((Mob) entityToSpawn2).finalizeSpawn(_level2, world.getCurrentDifficultyAt(entityToSpawn2.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                    }
                    world.addFreshEntity(entityToSpawn2);
                }
            } else if (Math.random() < 0.1d) {
                world.destroyBlock(new BlockPos(x, y, z), false);
                if (world instanceof ServerLevel) {
                    ServerLevel _level3 = (ServerLevel) world;
                    Entity entityToSpawn3 = new DarkLatexSpiderEntity((EntityType<DarkLatexSpiderEntity>) ((EntityType) LatexModEntities.DARK_LATEX_SPIDER.get()), (Level) _level3);
                    entityToSpawn3.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                    if (entityToSpawn3 instanceof Mob) {
                        ((Mob) entityToSpawn3).finalizeSpawn(_level3, world.getCurrentDifficultyAt(entityToSpawn3.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                    }
                    world.addFreshEntity(entityToSpawn3);
                }
            } else if (Math.random() < 0.1d) {
                world.destroyBlock(new BlockPos(x, y, z), false);
                if (world instanceof ServerLevel) {
                    ServerLevel _level4 = (ServerLevel) world;
                    Entity entityToSpawn4 = new DarkLatexSnakeEntity((EntityType<DarkLatexSnakeEntity>) ((EntityType) LatexModEntities.DARK_LATEX_SNAKE.get()), (Level) _level4);
                    entityToSpawn4.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                    if (entityToSpawn4 instanceof Mob) {
                        ((Mob) entityToSpawn4).finalizeSpawn(_level4, world.getCurrentDifficultyAt(entityToSpawn4.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                    }
                    world.addFreshEntity(entityToSpawn4);
                }
            } else if (Math.random() < 0.1d) {
                world.destroyBlock(new BlockPos(x, y, z), false);
                if (world instanceof ServerLevel) {
                    ServerLevel _level5 = (ServerLevel) world;
                    Entity entityToSpawn5 = new NoiseStalkerEntity((EntityType<NoiseStalkerEntity>) ((EntityType) LatexModEntities.NOISE_STALKER.get()), (Level) _level5);
                    entityToSpawn5.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                    if (entityToSpawn5 instanceof Mob) {
                        ((Mob) entityToSpawn5).finalizeSpawn(_level5, world.getCurrentDifficultyAt(entityToSpawn5.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                    }
                    world.addFreshEntity(entityToSpawn5);
                }
            } else if (Math.random() < 0.2d) {
                world.destroyBlock(new BlockPos(x, y, z), false);
                if (world instanceof ServerLevel) {
                    ServerLevel _level6 = (ServerLevel) world;
                    Entity entityToSpawn6 = new DarkLatexFoxEntity((EntityType<DarkLatexFoxEntity>) ((EntityType) LatexModEntities.DARK_LATEX_FOX.get()), (Level) _level6);
                    entityToSpawn6.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                    if (entityToSpawn6 instanceof Mob) {
                        ((Mob) entityToSpawn6).finalizeSpawn(_level6, world.getCurrentDifficultyAt(entityToSpawn6.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                    }
                    world.addFreshEntity(entityToSpawn6);
                }
            } else if (Math.random() < 0.05d) {
                world.destroyBlock(new BlockPos(x, y, z), false);
                if (world instanceof ServerLevel) {
                    ServerLevel _level7 = (ServerLevel) world;
                    Entity entityToSpawn7 = new DLbeeEntity((EntityType<DLbeeEntity>) ((EntityType) LatexModEntities.D_LBEE.get()), (Level) _level7);
                    entityToSpawn7.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                    if (entityToSpawn7 instanceof Mob) {
                        ((Mob) entityToSpawn7).finalizeSpawn(_level7, world.getCurrentDifficultyAt(entityToSpawn7.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                    }
                    world.addFreshEntity(entityToSpawn7);
                }
            } else if (world.getBlockState(new BlockPos(x, y + 1.0d, z)).getBlock() == Blocks.WATER || world.getBlockState(new BlockPos(x, y + 1.0d, z)).getBlock() == Blocks.WATER) {
                world.destroyBlock(new BlockPos(x, y, z), false);
                if (world instanceof ServerLevel) {
                    ServerLevel _level8 = (ServerLevel) world;
                    Entity entityToSpawn8 = new DlsharkEntity((EntityType<DlsharkEntity>) ((EntityType) LatexModEntities.DLSHARK.get()), (Level) _level8);
                    entityToSpawn8.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                    if (entityToSpawn8 instanceof Mob) {
                        ((Mob) entityToSpawn8).finalizeSpawn(_level8, world.getCurrentDifficultyAt(entityToSpawn8.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                    }
                    world.addFreshEntity(entityToSpawn8);
                }
            } else {
                world.destroyBlock(new BlockPos(x, y, z), false);
                if (world instanceof ServerLevel) {
                    ServerLevel _level9 = (ServerLevel) world;
                    Entity entityToSpawn9 = new DarklatexEntity((EntityType<DarklatexEntity>) ((EntityType) LatexModEntities.DARKLATEX.get()), (Level) _level9);
                    entityToSpawn9.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                    if (entityToSpawn9 instanceof Mob) {
                        ((Mob) entityToSpawn9).finalizeSpawn(_level9, world.getCurrentDifficultyAt(entityToSpawn9.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                    }
                    world.addFreshEntity(entityToSpawn9);
                }
            }
        }
    }
}
