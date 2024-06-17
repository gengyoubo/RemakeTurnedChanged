//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

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
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Property;

public class DarklatexcrystaleggUpdateTickProcedure {
    public DarklatexcrystaleggUpdateTickProcedure() {
    }

    public static void execute(LevelAccessor world, double x, double y, double z) {
        if (world.getBlockState(new BlockPos(x, y - 1.0, z)).getBlock() == Blocks.AIR || world.getBlockState(new BlockPos(x, y - 1.0, z)).getBlock() == Blocks.CAVE_AIR || world.getBlockState(new BlockPos(x, y - 1.0, z)).getBlock() == Blocks.VOID_AIR) {
            world.destroyBlock(new BlockPos(x, y, z), false);
        }

        if (world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXCRYSTALSPAWN) && Math.random() < 0.15) {
            if (world.getBlockState(new BlockPos(x, y + 1.0, z)).getBlock() == Blocks.AIR || world.getBlockState(new BlockPos(x, y + 1.0, z)).getBlock() == Blocks.CAVE_AIR || world.getBlockState(new BlockPos(x, y + 1.0, z)).getBlock() == Blocks.VOID_AIR) {
                ServerLevel _level;
                Mob _mobToSpawn;
                if (Math.random() < 0.8) {
                    world.destroyBlock(new BlockPos(x, y, z), false);
                    if (world instanceof ServerLevel) {
                        _level = (ServerLevel)world;
                        Entity entityToSpawn = new DarklatexslugEntity((EntityType)LatexModEntities.DARKLATEXSLUG.get(), _level);
                        entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0F, 0.0F);
                        if (entityToSpawn instanceof Mob) {
                            _mobToSpawn = (Mob)entityToSpawn;
                            _mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData)null, (CompoundTag)null);
                        }

                        world.addFreshEntity(entityToSpawn);
                    }
                } else if (Math.random() < 0.2) {
                    world.destroyBlock(new BlockPos(x, y, z), false);
                    if (world instanceof ServerLevel) {
                        _level = (ServerLevel)world;
                        Entity entityToSpawn = new YufengEntity((EntityType)LatexModEntities.YUFENG.get(), _level);
                        entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0F, 0.0F);
                        if (entityToSpawn instanceof Mob) {
                            _mobToSpawn = (Mob)entityToSpawn;
                            _mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData)null, (CompoundTag)null);
                        }

                        world.addFreshEntity(entityToSpawn);
                    }
                } else if (Math.random() < 0.1) {
                    world.destroyBlock(new BlockPos(x, y, z), false);
                    if (world instanceof ServerLevel) {
                        _level = (ServerLevel)world;
                        Entity entityToSpawn = new DarkLatexSpiderEntity((EntityType)LatexModEntities.DARK_LATEX_SPIDER.get(), _level);
                        entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0F, 0.0F);
                        if (entityToSpawn instanceof Mob) {
                            _mobToSpawn = (Mob)entityToSpawn;
                            _mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData)null, (CompoundTag)null);
                        }

                        world.addFreshEntity(entityToSpawn);
                    }
                } else if (Math.random() < 0.1) {
                    world.destroyBlock(new BlockPos(x, y, z), false);
                    if (world instanceof ServerLevel) {
                        _level = (ServerLevel)world;
                        Entity entityToSpawn = new DarkLatexSnakeEntity((EntityType)LatexModEntities.DARK_LATEX_SNAKE.get(), _level);
                        entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0F, 0.0F);
                        if (entityToSpawn instanceof Mob) {
                            _mobToSpawn = (Mob)entityToSpawn;
                            _mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData)null, (CompoundTag)null);
                        }

                        world.addFreshEntity(entityToSpawn);
                    }
                } else if (Math.random() < 0.1) {
                    world.destroyBlock(new BlockPos(x, y, z), false);
                    if (world instanceof ServerLevel) {
                        _level = (ServerLevel)world;
                        Entity entityToSpawn = new NoiseStalkerEntity((EntityType)LatexModEntities.NOISE_STALKER.get(), _level);
                        entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0F, 0.0F);
                        if (entityToSpawn instanceof Mob) {
                            _mobToSpawn = (Mob)entityToSpawn;
                            _mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData)null, (CompoundTag)null);
                        }

                        world.addFreshEntity(entityToSpawn);
                    }
                } else if (Math.random() < 0.2) {
                    world.destroyBlock(new BlockPos(x, y, z), false);
                    if (world instanceof ServerLevel) {
                        _level = (ServerLevel)world;
                        Entity entityToSpawn = new DarkLatexFoxEntity((EntityType)LatexModEntities.DARK_LATEX_FOX.get(), _level);
                        entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0F, 0.0F);
                        if (entityToSpawn instanceof Mob) {
                            _mobToSpawn = (Mob)entityToSpawn;
                            _mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData)null, (CompoundTag)null);
                        }

                        world.addFreshEntity(entityToSpawn);
                    }
                } else if (Math.random() < 0.05) {
                    world.destroyBlock(new BlockPos(x, y, z), false);
                    if (world instanceof ServerLevel) {
                        _level = (ServerLevel)world;
                        Entity entityToSpawn = new DLbeeEntity((EntityType)LatexModEntities.D_LBEE.get(), _level);
                        entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0F, 0.0F);
                        if (entityToSpawn instanceof Mob) {
                            _mobToSpawn = (Mob)entityToSpawn;
                            _mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData)null, (CompoundTag)null);
                        }

                        world.addFreshEntity(entityToSpawn);
                    }
                } else if (world.getBlockState(new BlockPos(x, y + 1.0, z)).getBlock() != Blocks.WATER && world.getBlockState(new BlockPos(x, y + 1.0, z)).getBlock() != Blocks.WATER) {
                    world.destroyBlock(new BlockPos(x, y, z), false);
                    if (world instanceof ServerLevel) {
                        _level = (ServerLevel)world;
                        Entity entityToSpawn = new DarklatexEntity((EntityType)LatexModEntities.DARKLATEX.get(), _level);
                        entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0F, 0.0F);
                        if (entityToSpawn instanceof Mob) {
                            _mobToSpawn = (Mob)entityToSpawn;
                            _mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData)null, (CompoundTag)null);
                        }

                        world.addFreshEntity(entityToSpawn);
                    }
                } else {
                    world.destroyBlock(new BlockPos(x, y, z), false);
                    if (world instanceof ServerLevel) {
                        _level = (ServerLevel)world;
                        Entity entityToSpawn = new DlsharkEntity((EntityType)LatexModEntities.DLSHARK.get(), _level);
                        entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0F, 0.0F);
                        if (entityToSpawn instanceof Mob) {
                            _mobToSpawn = (Mob)entityToSpawn;
                            _mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData)null, (CompoundTag)null);
                        }

                        world.addFreshEntity(entityToSpawn);
                    }
                }
            } else {
                BlockPos _bp = new BlockPos(x, y, z);
                BlockState _bs = ((Block)LatexModBlocks.DARKLATEXICE.get()).defaultBlockState();
                BlockState _bso = world.getBlockState(_bp);
                UnmodifiableIterator var10 = _bso.getValues().entrySet().iterator();

                while(var10.hasNext()) {
                    Map.Entry<Property<?>, Comparable<?>> entry = (Map.Entry)var10.next();
                    Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
                    if (_property != null && _bs.getValue(_property) != null) {
                        try {
                            _bs = (BlockState)_bs.setValue(_property, (Comparable)entry.getValue());
                        } catch (Exception var14) {
                        }
                    }
                }

                world.setBlock(_bp, _bs, 3);
            }
        }

    }
}
