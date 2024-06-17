//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.mcreator.latexes.procedures;

import net.mcreator.latexes.entity.DarkLatexSkeletonEntity;
import net.mcreator.latexes.entity.DarklatexEntity;
import net.mcreator.latexes.entity.YufengEntity;
import net.mcreator.latexes.init.LatexModBlocks;
import net.mcreator.latexes.init.LatexModEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.TickEvent.Phase;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class DarkLatexDragonEntityIsHurtProcedure {
    public DarkLatexDragonEntityIsHurtProcedure() {
    }

    public static void execute(LevelAccessor world, final double x, final double y, final double z, final Entity entity) {
        if (entity != null) {
            if (Math.random() < 0.1) {
                if (world instanceof ServerLevel) {
                    ServerLevel _level = (ServerLevel)world;
                    _level.sendParticles(ParticleTypes.ENCHANTED_HIT, entity.getX(), entity.getY(), entity.getZ(), 5, 3.0, 3.0, 3.0, 1.0);
                }

                ((<undefinedtype>)(new Object() {
                    private int ticks = 0;
                    private float waitTicks;
                    private LevelAccessor world;

                    public void start(LevelAccessor world, int waitTicks) {
                        this.waitTicks = (float)waitTicks;
                        MinecraftForge.EVENT_BUS.register(this);
                        this.world = world;
                    }

                    @SubscribeEvent
                    public void tick(TickEvent.ServerTickEvent event) {
                        if (event.phase == Phase.END) {
                            ++this.ticks;
                            if ((float)this.ticks >= this.waitTicks) {
                                this.run();
                            }
                        }

                    }

                    private void run() {
                        this.world.setBlock(new BlockPos(entity.getX(), entity.getY(), entity.getZ()), ((Block)LatexModBlocks.DARKLATEXCRYSTALEGG.get()).defaultBlockState(), 3);
                        this.world.setBlock(new BlockPos(entity.getX(), entity.getY() - 1.0, entity.getZ()), ((Block)LatexModBlocks.DARKLATEXBLOCKCRYSTALGROW.get()).defaultBlockState(), 3);
                        MinecraftForge.EVENT_BUS.unregister(this);
                    }
                })).start(world, 60);
            }

            float var10000;
            if (entity instanceof LivingEntity) {
                LivingEntity _livEnt = (LivingEntity)entity;
                var10000 = _livEnt.getHealth();
            } else {
                var10000 = -1.0F;
            }

            float var10001;
            if (entity instanceof LivingEntity) {
                LivingEntity _livEnt = (LivingEntity)entity;
                var10001 = _livEnt.getMaxHealth();
            } else {
                var10001 = -1.0F;
            }

            if (var10000 <= var10001 / 2.0F) {
                ((<undefinedtype>)(new Object() {
                    private int ticks = 0;
                    private float waitTicks;
                    private LevelAccessor world;

                    public void start(LevelAccessor world, int waitTicks) {
                        this.waitTicks = (float)waitTicks;
                        MinecraftForge.EVENT_BUS.register(this);
                        this.world = world;
                    }

                    @SubscribeEvent
                    public void tick(TickEvent.ServerTickEvent event) {
                        if (event.phase == Phase.END) {
                            ++this.ticks;
                            if ((float)this.ticks >= this.waitTicks) {
                                this.run();
                            }
                        }

                    }

                    private void run() {
                        if (Math.random() < 1.0E-4) {
                            ServerLevel _level;
                            LevelAccessor var2;
                            Mob _mobToSpawn;
                            if (Math.random() < 0.7) {
                                var2 = this.world;
                                if (var2 instanceof ServerLevel) {
                                    _level = (ServerLevel)var2;
                                    Entity entityToSpawnx = new DarklatexEntity((EntityType)LatexModEntities.DARKLATEX.get(), _level);
                                    entityToSpawnx.moveTo(x, y, z, 0.0F, 0.0F);
                                    entityToSpawnx.setYBodyRot(0.0F);
                                    entityToSpawnx.setYHeadRot(0.0F);
                                    entityToSpawnx.setDeltaMovement(0.0, 0.0, 0.0);
                                    if (entityToSpawnx instanceof Mob) {
                                        _mobToSpawn = (Mob)entityToSpawnx;
                                        _mobToSpawn.finalizeSpawn(_level, this.world.getCurrentDifficultyAt(entityToSpawnx.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData)null, (CompoundTag)null);
                                    }

                                    this.world.addFreshEntity(entityToSpawnx);
                                }

                                var2 = this.world;
                                if (var2 instanceof ServerLevel) {
                                    _level = (ServerLevel)var2;
                                    _level.sendParticles(ParticleTypes.ITEM_SLIME, x, y, z, 3, 3.0, 3.0, 3.0, 1.0);
                                }
                            } else if (Math.random() < 0.3) {
                                var2 = this.world;
                                if (var2 instanceof ServerLevel) {
                                    _level = (ServerLevel)var2;
                                    Entity entityToSpawnxx = new YufengEntity((EntityType)LatexModEntities.YUFENG.get(), _level);
                                    entityToSpawnxx.moveTo(x, y, z, 0.0F, 0.0F);
                                    entityToSpawnxx.setYBodyRot(0.0F);
                                    entityToSpawnxx.setYHeadRot(0.0F);
                                    entityToSpawnxx.setDeltaMovement(0.0, 0.0, 0.0);
                                    if (entityToSpawnxx instanceof Mob) {
                                        _mobToSpawn = (Mob)entityToSpawnxx;
                                        _mobToSpawn.finalizeSpawn(_level, this.world.getCurrentDifficultyAt(entityToSpawnxx.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData)null, (CompoundTag)null);
                                    }

                                    this.world.addFreshEntity(entityToSpawnxx);
                                }

                                var2 = this.world;
                                if (var2 instanceof ServerLevel) {
                                    _level = (ServerLevel)var2;
                                    _level.sendParticles(ParticleTypes.ITEM_SLIME, x, y, z, 3, 3.0, 3.0, 3.0, 1.0);
                                }
                            } else if (Math.random() < 0.1) {
                                var2 = this.world;
                                if (var2 instanceof ServerLevel) {
                                    _level = (ServerLevel)var2;
                                    Entity entityToSpawn = new DarkLatexSkeletonEntity((EntityType)LatexModEntities.DARK_LATEX_SKELETON.get(), _level);
                                    entityToSpawn.moveTo(x, y, z, 0.0F, 0.0F);
                                    entityToSpawn.setYBodyRot(0.0F);
                                    entityToSpawn.setYHeadRot(0.0F);
                                    entityToSpawn.setDeltaMovement(0.0, 0.0, 0.0);
                                    if (entityToSpawn instanceof Mob) {
                                        _mobToSpawn = (Mob)entityToSpawn;
                                        _mobToSpawn.finalizeSpawn(_level, this.world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData)null, (CompoundTag)null);
                                    }

                                    this.world.addFreshEntity(entityToSpawn);
                                }

                                var2 = this.world;
                                if (var2 instanceof ServerLevel) {
                                    _level = (ServerLevel)var2;
                                    _level.sendParticles(ParticleTypes.ITEM_SLIME, x, y, z, 3, 3.0, 3.0, 3.0, 1.0);
                                }
                            }
                        }

                        MinecraftForge.EVENT_BUS.unregister(this);
                    }
                })).start(world, 250);
            }

        }
    }
}
