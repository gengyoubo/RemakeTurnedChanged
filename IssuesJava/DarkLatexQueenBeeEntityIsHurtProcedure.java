//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.ltxprogrammer.turned.procedures;

import net.ltxprogrammer.turned.entity.DLbeeEntity;
import net.ltxprogrammer.turned.init.LatexModEntities;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.TickEvent.Phase;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class DarkLatexQueenBeeEntityIsHurtProcedure {
    public DarkLatexQueenBeeEntityIsHurtProcedure() {
    }

    public static void execute(LevelAccessor world, final double x, final double y, final double z, final Entity entity) {
        if (entity != null) {
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
                    float var10000;
                    if (entity instanceof LivingEntity) {
                        LivingEntity _livEnt = (LivingEntity)entity;
                        var10000 = _livEnt.getHealth();
                    } else {
                        var10000 = -1.0F;
                    }

                    float var10001;
                    if (entity instanceof LivingEntity) {
                        LivingEntity _livEntx = (LivingEntity)entity;
                        var10001 = _livEntx.getMaxHealth();
                    } else {
                        var10001 = -1.0F;
                    }

                    if (var10000 <= var10001 / 2.0F && Math.random() < 0.001) {
                        LevelAccessor var4 = this.world;
                        ServerLevel _level;
                        Mob _mobToSpawn;
                        DLbeeEntity entityToSpawn;
                        if (var4 instanceof ServerLevel) {
                            _level = (ServerLevel)var4;
                            entityToSpawn = new DLbeeEntity((EntityType)LatexModEntities.D_LBEE.get(), _level);
                            entityToSpawn.moveTo(x, y, z, 0.0F, 0.0F);
                            entityToSpawn.setYBodyRot(0.0F);
                            entityToSpawn.setYHeadRot(0.0F);
                            if (entityToSpawn instanceof Mob) {
                                _mobToSpawn = (Mob)entityToSpawn;
                                _mobToSpawn.finalizeSpawn(_level, this.world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData)null, (CompoundTag)null);
                            }

                            this.world.addFreshEntity(entityToSpawn);
                        }

                        if (Math.random() < 0.3) {
                            var4 = this.world;
                            if (var4 instanceof ServerLevel) {
                                _level = (ServerLevel)var4;
                                entityToSpawn = new DLbeeEntity((EntityType)LatexModEntities.D_LBEE.get(), _level);
                                entityToSpawn.moveTo(x, y, z, 0.0F, 0.0F);
                                entityToSpawn.setYBodyRot(0.0F);
                                entityToSpawn.setYHeadRot(0.0F);
                                if (entityToSpawn instanceof Mob) {
                                    _mobToSpawn = (Mob)entityToSpawn;
                                    _mobToSpawn.finalizeSpawn(_level, this.world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData)null, (CompoundTag)null);
                                }

                                this.world.addFreshEntity(entityToSpawn);
                            }

                            if (Math.random() < 0.3) {
                                var4 = this.world;
                                if (var4 instanceof ServerLevel) {
                                    _level = (ServerLevel)var4;
                                    entityToSpawn = new DLbeeEntity((EntityType)LatexModEntities.D_LBEE.get(), _level);
                                    entityToSpawn.moveTo(x, y, z, 0.0F, 0.0F);
                                    entityToSpawn.setYBodyRot(0.0F);
                                    entityToSpawn.setYHeadRot(0.0F);
                                    if (entityToSpawn instanceof Mob) {
                                        _mobToSpawn = (Mob)entityToSpawn;
                                        _mobToSpawn.finalizeSpawn(_level, this.world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData)null, (CompoundTag)null);
                                    }

                                    this.world.addFreshEntity(entityToSpawn);
                                }
                            }
                        }
                    }

                    MinecraftForge.EVENT_BUS.unregister(this);
                }
            })).start(world, 300);
        }
    }
}
