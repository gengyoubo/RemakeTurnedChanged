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
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/DarkLatexQueenBeeEntityIsHurtProcedure.class */
public class DarkLatexQueenBeeEntityIsHurtProcedure {
    public static void execute(LevelAccessor world, final double x, final double y, final double z, final Entity entity) {
        if (entity != null) {
            new Object() { // from class: net.ltxprogrammer.turned.procedures.DarkLatexQueenBeeEntityIsHurtProcedure.1
                private int ticks = 0;
                private float waitTicks;
                private LevelAccessor world;

                public void start(LevelAccessor world2, int waitTicks) {
                    this.waitTicks = (float) waitTicks;
                    MinecraftForge.EVENT_BUS.register(this);
                    this.world = world2;
                }

                @SubscribeEvent
                public void tick(TickEvent.ServerTickEvent event) {
                    if (event.phase == TickEvent.Phase.END) {
                        this.ticks++;
                        if (((float) this.ticks) >= this.waitTicks) {
                            run();
                        }
                    }
                }

                private void run() {
                    float f;
                    if (entity instanceof LivingEntity) {
                        f = entity.getHealth();
                    } else {
                        f = -1.0f;
                    }
                    if (f <= (entity instanceof LivingEntity ? entity.getMaxHealth() : -1.0f) / 2.0f && Math.random() < 0.001d) {
                        ServerLevel serverLevel = this.world;
                        if (serverLevel instanceof ServerLevel) {
                            ServerLevel _level = serverLevel;
                            Entity entityToSpawn = new DLbeeEntity((EntityType<DLbeeEntity>) ((EntityType) LatexModEntities.D_LBEE.get()), (Level) _level);
                            entityToSpawn.moveTo(x, y, z, 0.0f, 0.0f);
                            entityToSpawn.setYBodyRot(0.0f);
                            entityToSpawn.setYHeadRot(0.0f);
                            if (entityToSpawn instanceof Mob) {
                                ((Mob) entityToSpawn).finalizeSpawn(_level, this.world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                            }
                            this.world.addFreshEntity(entityToSpawn);
                        }
                        if (Math.random() < 0.3d) {
                            ServerLevel serverLevel2 = this.world;
                            if (serverLevel2 instanceof ServerLevel) {
                                ServerLevel _level2 = serverLevel2;
                                Entity entityToSpawn2 = new DLbeeEntity((EntityType<DLbeeEntity>) ((EntityType) LatexModEntities.D_LBEE.get()), (Level) _level2);
                                entityToSpawn2.moveTo(x, y, z, 0.0f, 0.0f);
                                entityToSpawn2.setYBodyRot(0.0f);
                                entityToSpawn2.setYHeadRot(0.0f);
                                if (entityToSpawn2 instanceof Mob) {
                                    ((Mob) entityToSpawn2).finalizeSpawn(_level2, this.world.getCurrentDifficultyAt(entityToSpawn2.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                                }
                                this.world.addFreshEntity(entityToSpawn2);
                            }
                            if (Math.random() < 0.3d) {
                                ServerLevel serverLevel3 = this.world;
                                if (serverLevel3 instanceof ServerLevel) {
                                    ServerLevel _level3 = serverLevel3;
                                    Entity entityToSpawn3 = new DLbeeEntity((EntityType<DLbeeEntity>) ((EntityType) LatexModEntities.D_LBEE.get()), (Level) _level3);
                                    entityToSpawn3.moveTo(x, y, z, 0.0f, 0.0f);
                                    entityToSpawn3.setYBodyRot(0.0f);
                                    entityToSpawn3.setYHeadRot(0.0f);
                                    if (entityToSpawn3 instanceof Mob) {
                                        ((Mob) entityToSpawn3).finalizeSpawn(_level3, this.world.getCurrentDifficultyAt(entityToSpawn3.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                                    }
                                    this.world.addFreshEntity(entityToSpawn3);
                                }
                            }
                        }
                    }
                    MinecraftForge.EVENT_BUS.unregister(this);
                }
            }.start(world, 300);
        }
    }
}
