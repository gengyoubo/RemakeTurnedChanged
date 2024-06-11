package net.mcreator.latexes.procedures;

import net.mcreator.latexes.entity.DLbeeEntity;
import net.mcreator.latexes.init.LatexModEntities;
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

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/DarkLatexQueenBeeEntityIsHurtProcedure.class */
public class DarkLatexQueenBeeEntityIsHurtProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity != null) {
            new AnonymousClass1(entity, x, y, z).start(world, 300);
        }
    }

    /* renamed from: net.mcreator.latexes.procedures.DarkLatexQueenBeeEntityIsHurtProcedure$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/DarkLatexQueenBeeEntityIsHurtProcedure$1.class */
    class AnonymousClass1 {
        private int ticks = 0;
        private float waitTicks;
        private LevelAccessor world;
        final /* synthetic */ Entity val$entity;
        final /* synthetic */ double val$x;
        final /* synthetic */ double val$y;
        final /* synthetic */ double val$z;

        AnonymousClass1(Entity entity, double d, double d2, double d3) {
            this.val$entity = entity;
            this.val$x = d;
            this.val$y = d2;
            this.val$z = d3;
        }

        public void start(LevelAccessor world, int waitTicks) {
            this.waitTicks = (float) waitTicks;
            MinecraftForge.EVENT_BUS.register(this);
            this.world = world;
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
            if (this.val$entity instanceof LivingEntity) {
                f = this.val$entity.getHealth();
            } else {
                f = -1.0f;
            }
            if (f <= (this.val$entity instanceof LivingEntity ? this.val$entity.getMaxHealth() : -1.0f) / 2.0f && Math.random() < 0.001d) {
                ServerLevel serverLevel = this.world;
                if (serverLevel instanceof ServerLevel) {
                    ServerLevel _level = serverLevel;
                    Entity entityToSpawn = new DLbeeEntity((EntityType<DLbeeEntity>) ((EntityType) LatexModEntities.D_LBEE.get()), (Level) _level);
                    entityToSpawn.moveTo(this.val$x, this.val$y, this.val$z, 0.0f, 0.0f);
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
                        entityToSpawn2.moveTo(this.val$x, this.val$y, this.val$z, 0.0f, 0.0f);
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
                            entityToSpawn3.moveTo(this.val$x, this.val$y, this.val$z, 0.0f, 0.0f);
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
    }
}
