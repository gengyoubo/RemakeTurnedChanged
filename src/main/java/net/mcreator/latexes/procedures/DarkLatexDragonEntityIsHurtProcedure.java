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
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/DarkLatexDragonEntityIsHurtProcedure.class */
public class DarkLatexDragonEntityIsHurtProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        float f;
        if (entity != null) {
            if (Math.random() < 0.1d) {
                if (world instanceof ServerLevel) {
                    ((ServerLevel) world).sendParticles(ParticleTypes.ENCHANTED_HIT, entity.getX(), entity.getY(), entity.getZ(), 5, 3.0d, 3.0d, 3.0d, 1.0d);
                }
                new AnonymousClass1(entity).start(world, 60);
            }
            if (entity instanceof LivingEntity) {
                f = ((LivingEntity) entity).getHealth();
            } else {
                f = -1.0f;
            }
            if (f <= (entity instanceof LivingEntity ? ((LivingEntity) entity).getMaxHealth() : -1.0f) / 2.0f) {
                new AnonymousClass2(x, y, z).start(world, 250);
            }
        }
    }

    /* renamed from: net.mcreator.latexes.procedures.DarkLatexDragonEntityIsHurtProcedure$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/DarkLatexDragonEntityIsHurtProcedure$1.class */
    class AnonymousClass1 {
        private int ticks = 0;
        private float waitTicks;
        private LevelAccessor world;
        final /* synthetic */ Entity val$entity;

        AnonymousClass1(Entity entity) {
            this.val$entity = entity;
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
            this.world.setBlock(new BlockPos(this.val$entity.getX(), this.val$entity.getY(), this.val$entity.getZ()), ((Block) LatexModBlocks.DARKLATEXCRYSTALEGG.get()).defaultBlockState(), 3);
            this.world.setBlock(new BlockPos(this.val$entity.getX(), this.val$entity.getY() - 1.0d, this.val$entity.getZ()), ((Block) LatexModBlocks.DARKLATEXBLOCKCRYSTALGROW.get()).defaultBlockState(), 3);
            MinecraftForge.EVENT_BUS.unregister(this);
        }
    }

    /* renamed from: net.mcreator.latexes.procedures.DarkLatexDragonEntityIsHurtProcedure$2  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/DarkLatexDragonEntityIsHurtProcedure$2.class */
    class AnonymousClass2 {
        private int ticks = 0;
        private float waitTicks;
        private LevelAccessor world;
        final /* synthetic */ double val$x;
        final /* synthetic */ double val$y;
        final /* synthetic */ double val$z;

        AnonymousClass2(double d, double d2, double d3) {
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
            if (Math.random() < 1.0E-4d) {
                if (Math.random() < 0.7d) {
                    ServerLevel serverLevel = this.world;
                    if (serverLevel instanceof ServerLevel) {
                        ServerLevel _level = serverLevel;
                        Entity entityToSpawn = new DarklatexEntity((EntityType<DarklatexEntity>) ((EntityType) LatexModEntities.DARKLATEX.get()), (Level) _level);
                        entityToSpawn.moveTo(this.val$x, this.val$y, this.val$z, 0.0f, 0.0f);
                        entityToSpawn.setYBodyRot(0.0f);
                        entityToSpawn.setYHeadRot(0.0f);
                        entityToSpawn.setDeltaMovement(0.0d, 0.0d, 0.0d);
                        if (entityToSpawn instanceof Mob) {
                            ((Mob) entityToSpawn).finalizeSpawn(_level, this.world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        this.world.addFreshEntity(entityToSpawn);
                    }
                    ServerLevel _level2 = this.world;
                    if (_level2 instanceof ServerLevel) {
                        _level2.sendParticles(ParticleTypes.ITEM_SLIME, this.val$x, this.val$y, this.val$z, 3, 3.0d, 3.0d, 3.0d, 1.0d);
                    }
                } else if (Math.random() < 0.3d) {
                    ServerLevel serverLevel2 = this.world;
                    if (serverLevel2 instanceof ServerLevel) {
                        ServerLevel _level3 = serverLevel2;
                        Entity entityToSpawn2 = new YufengEntity((EntityType<YufengEntity>) ((EntityType) LatexModEntities.YUFENG.get()), (Level) _level3);
                        entityToSpawn2.moveTo(this.val$x, this.val$y, this.val$z, 0.0f, 0.0f);
                        entityToSpawn2.setYBodyRot(0.0f);
                        entityToSpawn2.setYHeadRot(0.0f);
                        entityToSpawn2.setDeltaMovement(0.0d, 0.0d, 0.0d);
                        if (entityToSpawn2 instanceof Mob) {
                            ((Mob) entityToSpawn2).finalizeSpawn(_level3, this.world.getCurrentDifficultyAt(entityToSpawn2.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        this.world.addFreshEntity(entityToSpawn2);
                    }
                    ServerLevel _level4 = this.world;
                    if (_level4 instanceof ServerLevel) {
                        _level4.sendParticles(ParticleTypes.ITEM_SLIME, this.val$x, this.val$y, this.val$z, 3, 3.0d, 3.0d, 3.0d, 1.0d);
                    }
                } else if (Math.random() < 0.1d) {
                    ServerLevel serverLevel3 = this.world;
                    if (serverLevel3 instanceof ServerLevel) {
                        ServerLevel _level5 = serverLevel3;
                        Entity entityToSpawn3 = new DarkLatexSkeletonEntity((EntityType<DarkLatexSkeletonEntity>) ((EntityType) LatexModEntities.DARK_LATEX_SKELETON.get()), (Level) _level5);
                        entityToSpawn3.moveTo(this.val$x, this.val$y, this.val$z, 0.0f, 0.0f);
                        entityToSpawn3.setYBodyRot(0.0f);
                        entityToSpawn3.setYHeadRot(0.0f);
                        entityToSpawn3.setDeltaMovement(0.0d, 0.0d, 0.0d);
                        if (entityToSpawn3 instanceof Mob) {
                            ((Mob) entityToSpawn3).finalizeSpawn(_level5, this.world.getCurrentDifficultyAt(entityToSpawn3.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        this.world.addFreshEntity(entityToSpawn3);
                    }
                    ServerLevel _level6 = this.world;
                    if (_level6 instanceof ServerLevel) {
                        _level6.sendParticles(ParticleTypes.ITEM_SLIME, this.val$x, this.val$y, this.val$z, 3, 3.0d, 3.0d, 3.0d, 1.0d);
                    }
                }
            }
            MinecraftForge.EVENT_BUS.unregister(this);
        }
    }
}
