package net.mcreator.latexes.procedures;

import net.mcreator.latexes.entity.DarkLatexSkeletonEntity;
import net.mcreator.latexes.entity.DarklatexEntity;
import net.mcreator.latexes.entity.DlsharkEntity;
import net.mcreator.latexes.entity.NoiseStalkerEntity;
import net.mcreator.latexes.entity.YufengEntity;
import net.mcreator.latexes.init.LatexModEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.TagKey;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.monster.Skeleton;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/DarklatexdarteffectOnPotionActiveTickProcedure.class */
public class DarklatexdarteffectOnPotionActiveTickProcedure {
    public static void execute(LevelAccessor world, Entity entity) {
        if (entity != null) {
            new AnonymousClass1(entity).start(world, 15);
            if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getHealth() : -1.0f) <= 1.0f) {
                if (!(entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("latex:robots"))) || entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("latex:darklatexes")))) && !(entity instanceof Player)) {
                    if (entity.isInWaterOrBubble()) {
                        if (!entity.level.isClientSide()) {
                            entity.discard();
                        }
                        if (world instanceof ServerLevel) {
                            ServerLevel _level = (ServerLevel) world;
                            Entity entityToSpawn = new DlsharkEntity((EntityType<DlsharkEntity>) ((EntityType) LatexModEntities.DLSHARK.get()), (Level) _level);
                            entityToSpawn.moveTo(entity.getX(), entity.getY(), entity.getZ(), world.getRandom().nextFloat() * 360.0f, 0.0f);
                            if (entityToSpawn instanceof Mob) {
                                ((Mob) entityToSpawn).finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                            }
                            world.addFreshEntity(entityToSpawn);
                        }
                        if (world instanceof Level) {
                            Level _level2 = (Level) world;
                            if (!_level2.isClientSide()) {
                                _level2.playSound((Player) null, new BlockPos(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                            } else {
                                _level2.playLocalSound(entity.getX(), entity.getY(), entity.getZ(), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                            }
                        }
                    } else if (entity instanceof Skeleton) {
                        if (!entity.level.isClientSide()) {
                            entity.discard();
                        }
                        if (world instanceof ServerLevel) {
                            ServerLevel _level3 = (ServerLevel) world;
                            Entity entityToSpawn2 = new DarkLatexSkeletonEntity((EntityType<DarkLatexSkeletonEntity>) ((EntityType) LatexModEntities.DARK_LATEX_SKELETON.get()), (Level) _level3);
                            entityToSpawn2.moveTo(entity.getX(), entity.getY(), entity.getZ(), world.getRandom().nextFloat() * 360.0f, 0.0f);
                            if (entityToSpawn2 instanceof Mob) {
                                ((Mob) entityToSpawn2).finalizeSpawn(_level3, world.getCurrentDifficultyAt(entityToSpawn2.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                            }
                            world.addFreshEntity(entityToSpawn2);
                        }
                        if (world instanceof Level) {
                            Level _level4 = (Level) world;
                            if (!_level4.isClientSide()) {
                                _level4.playSound((Player) null, new BlockPos(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                            } else {
                                _level4.playLocalSound(entity.getX(), entity.getY(), entity.getZ(), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                            }
                        }
                    } else if (Math.random() < 0.075d) {
                        if (!entity.level.isClientSide()) {
                            entity.discard();
                        }
                        if (world instanceof ServerLevel) {
                            ServerLevel _level5 = (ServerLevel) world;
                            Entity entityToSpawn3 = new DlsharkEntity((EntityType<DlsharkEntity>) ((EntityType) LatexModEntities.DLSHARK.get()), (Level) _level5);
                            entityToSpawn3.moveTo(entity.getX(), entity.getY(), entity.getZ(), world.getRandom().nextFloat() * 360.0f, 0.0f);
                            if (entityToSpawn3 instanceof Mob) {
                                ((Mob) entityToSpawn3).finalizeSpawn(_level5, world.getCurrentDifficultyAt(entityToSpawn3.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                            }
                            world.addFreshEntity(entityToSpawn3);
                        }
                        if (world instanceof Level) {
                            Level _level6 = (Level) world;
                            if (!_level6.isClientSide()) {
                                _level6.playSound((Player) null, new BlockPos(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                            } else {
                                _level6.playLocalSound(entity.getX(), entity.getY(), entity.getZ(), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                            }
                        }
                    } else if (Math.random() < 0.075d) {
                        if (!entity.level.isClientSide()) {
                            entity.discard();
                        }
                        if (world instanceof ServerLevel) {
                            ServerLevel _level7 = (ServerLevel) world;
                            Entity entityToSpawn4 = new YufengEntity((EntityType<YufengEntity>) ((EntityType) LatexModEntities.YUFENG.get()), (Level) _level7);
                            entityToSpawn4.moveTo(entity.getX(), entity.getY(), entity.getZ(), world.getRandom().nextFloat() * 360.0f, 0.0f);
                            if (entityToSpawn4 instanceof Mob) {
                                ((Mob) entityToSpawn4).finalizeSpawn(_level7, world.getCurrentDifficultyAt(entityToSpawn4.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                            }
                            world.addFreshEntity(entityToSpawn4);
                        }
                        if (world instanceof Level) {
                            Level _level8 = (Level) world;
                            if (!_level8.isClientSide()) {
                                _level8.playSound((Player) null, new BlockPos(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                            } else {
                                _level8.playLocalSound(entity.getX(), entity.getY(), entity.getZ(), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                            }
                        }
                    } else if (Math.random() < 0.025d) {
                        if (!entity.level.isClientSide()) {
                            entity.discard();
                        }
                        if (world instanceof ServerLevel) {
                            ServerLevel _level9 = (ServerLevel) world;
                            Entity entityToSpawn5 = new NoiseStalkerEntity((EntityType<NoiseStalkerEntity>) ((EntityType) LatexModEntities.NOISE_STALKER.get()), (Level) _level9);
                            entityToSpawn5.moveTo(entity.getX(), entity.getY(), entity.getZ(), world.getRandom().nextFloat() * 360.0f, 0.0f);
                            if (entityToSpawn5 instanceof Mob) {
                                ((Mob) entityToSpawn5).finalizeSpawn(_level9, world.getCurrentDifficultyAt(entityToSpawn5.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                            }
                            world.addFreshEntity(entityToSpawn5);
                        }
                        if (world instanceof Level) {
                            Level _level10 = (Level) world;
                            if (!_level10.isClientSide()) {
                                _level10.playSound((Player) null, new BlockPos(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                            } else {
                                _level10.playLocalSound(entity.getX(), entity.getY(), entity.getZ(), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                            }
                        }
                    } else if (entity instanceof DarklatexEntity) {
                        if (!entity.level.isClientSide()) {
                            entity.discard();
                        }
                        if (world instanceof ServerLevel) {
                            ServerLevel _level11 = (ServerLevel) world;
                            Entity entityToSpawn6 = new DarkLatexSkeletonEntity((EntityType<DarkLatexSkeletonEntity>) ((EntityType) LatexModEntities.DARK_LATEX_SKELETON.get()), (Level) _level11);
                            entityToSpawn6.moveTo(entity.getX(), entity.getY(), entity.getZ(), world.getRandom().nextFloat() * 360.0f, 0.0f);
                            if (entityToSpawn6 instanceof Mob) {
                                ((Mob) entityToSpawn6).finalizeSpawn(_level11, world.getCurrentDifficultyAt(entityToSpawn6.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                            }
                            world.addFreshEntity(entityToSpawn6);
                        }
                        if (world instanceof Level) {
                            Level _level12 = (Level) world;
                            if (!_level12.isClientSide()) {
                                _level12.playSound((Player) null, new BlockPos(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                            } else {
                                _level12.playLocalSound(entity.getX(), entity.getY(), entity.getZ(), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                            }
                        }
                    } else {
                        if (!entity.level.isClientSide()) {
                            entity.discard();
                        }
                        if (world instanceof ServerLevel) {
                            ServerLevel _level13 = (ServerLevel) world;
                            Entity entityToSpawn7 = new DarklatexEntity((EntityType<DarklatexEntity>) ((EntityType) LatexModEntities.DARKLATEX.get()), (Level) _level13);
                            entityToSpawn7.moveTo(entity.getX(), entity.getY(), entity.getZ(), world.getRandom().nextFloat() * 360.0f, 0.0f);
                            if (entityToSpawn7 instanceof Mob) {
                                ((Mob) entityToSpawn7).finalizeSpawn(_level13, world.getCurrentDifficultyAt(entityToSpawn7.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                            }
                            world.addFreshEntity(entityToSpawn7);
                        }
                        if (world instanceof Level) {
                            Level _level14 = (Level) world;
                            if (!_level14.isClientSide()) {
                                _level14.playSound((Player) null, new BlockPos(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                            } else {
                                _level14.playLocalSound(entity.getX(), entity.getY(), entity.getZ(), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: net.mcreator.latexes.procedures.DarklatexdarteffectOnPotionActiveTickProcedure$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/DarklatexdarteffectOnPotionActiveTickProcedure$1.class */
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
            this.val$entity.hurt(DamageSource.WITHER, 3.0f);
            MinecraftForge.EVENT_BUS.unregister(this);
        }
    }
}
