package net.mcreator.latexes.procedures;

import net.mcreator.latexes.entity.DLbeeEntity;
import net.mcreator.latexes.entity.DarkLatexCentaurEntity;
import net.mcreator.latexes.entity.DarkLatexFoxEntity;
import net.mcreator.latexes.entity.DarkLatexMothEntity;
import net.mcreator.latexes.entity.DarkLatexSnakeEntity;
import net.mcreator.latexes.entity.DarkLatexSpiderEntity;
import net.mcreator.latexes.entity.DarklatexEntity;
import net.mcreator.latexes.entity.DlsharkEntity;
import net.mcreator.latexes.entity.NoiseStalkerEntity;
import net.mcreator.latexes.entity.YufengEntity;
import net.mcreator.latexes.init.LatexModEntities;
import net.mcreator.latexes.init.LatexModGameRules;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/DarklatexslugOnInitialEntitySpawnProcedure.class */
public class DarklatexslugOnInitialEntitySpawnProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity != null) {
            new AnonymousClass1(entity, x, y, z).start(world, 30 + world.getLevelData().getGameRules().getInt(LatexModGameRules.DARKLATEXSLUGGROWTIME));
        }
    }

    /* renamed from: net.mcreator.latexes.procedures.DarklatexslugOnInitialEntitySpawnProcedure$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/DarklatexslugOnInitialEntitySpawnProcedure$1.class */
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
            if (this.val$entity.isAlive()) {
                if (!this.val$entity.level.isClientSide()) {
                    this.val$entity.discard();
                }
                Level level = this.world;
                if (level instanceof Level) {
                    Level _level = level;
                    if (!_level.isClientSide()) {
                        _level.playSound((Player) null, new BlockPos(this.val$x, this.val$y, this.val$z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                    } else {
                        _level.playLocalSound(this.val$x, this.val$y, this.val$z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                    }
                }
                if (Math.random() < 0.175d) {
                    ServerLevel serverLevel = this.world;
                    if (serverLevel instanceof ServerLevel) {
                        ServerLevel _level2 = serverLevel;
                        Entity entityToSpawn = new YufengEntity((EntityType<YufengEntity>) ((EntityType) LatexModEntities.YUFENG.get()), (Level) _level2);
                        entityToSpawn.moveTo(this.val$entity.getX(), this.val$entity.getY(), this.val$entity.getZ(), this.world.getRandom().nextFloat() * 360.0f, 0.0f);
                        if (entityToSpawn instanceof Mob) {
                            ((Mob) entityToSpawn).finalizeSpawn(_level2, this.world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        this.world.addFreshEntity(entityToSpawn);
                    }
                } else if (Math.random() < 0.15d) {
                    ServerLevel serverLevel2 = this.world;
                    if (serverLevel2 instanceof ServerLevel) {
                        ServerLevel _level3 = serverLevel2;
                        Entity entityToSpawn2 = new DlsharkEntity((EntityType<DlsharkEntity>) ((EntityType) LatexModEntities.DLSHARK.get()), (Level) _level3);
                        entityToSpawn2.moveTo(this.val$entity.getX(), this.val$entity.getY(), this.val$entity.getZ(), this.world.getRandom().nextFloat() * 360.0f, 0.0f);
                        if (entityToSpawn2 instanceof Mob) {
                            ((Mob) entityToSpawn2).finalizeSpawn(_level3, this.world.getCurrentDifficultyAt(entityToSpawn2.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        this.world.addFreshEntity(entityToSpawn2);
                    }
                } else if (Math.random() < 0.175d) {
                    ServerLevel serverLevel3 = this.world;
                    if (serverLevel3 instanceof ServerLevel) {
                        ServerLevel _level4 = serverLevel3;
                        Entity entityToSpawn3 = new DarkLatexFoxEntity((EntityType<DarkLatexFoxEntity>) ((EntityType) LatexModEntities.DARK_LATEX_FOX.get()), (Level) _level4);
                        entityToSpawn3.moveTo(this.val$entity.getX(), this.val$entity.getY(), this.val$entity.getZ(), this.world.getRandom().nextFloat() * 360.0f, 0.0f);
                        if (entityToSpawn3 instanceof Mob) {
                            ((Mob) entityToSpawn3).finalizeSpawn(_level4, this.world.getCurrentDifficultyAt(entityToSpawn3.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        this.world.addFreshEntity(entityToSpawn3);
                    }
                } else if (Math.random() < 0.15d) {
                    ServerLevel serverLevel4 = this.world;
                    if (serverLevel4 instanceof ServerLevel) {
                        ServerLevel _level5 = serverLevel4;
                        Entity entityToSpawn4 = new DLbeeEntity((EntityType<DLbeeEntity>) ((EntityType) LatexModEntities.D_LBEE.get()), (Level) _level5);
                        entityToSpawn4.moveTo(this.val$entity.getX(), this.val$entity.getY(), this.val$entity.getZ(), this.world.getRandom().nextFloat() * 360.0f, 0.0f);
                        if (entityToSpawn4 instanceof Mob) {
                            ((Mob) entityToSpawn4).finalizeSpawn(_level5, this.world.getCurrentDifficultyAt(entityToSpawn4.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        this.world.addFreshEntity(entityToSpawn4);
                    }
                } else if (Math.random() < 0.125d) {
                    ServerLevel serverLevel5 = this.world;
                    if (serverLevel5 instanceof ServerLevel) {
                        ServerLevel _level6 = serverLevel5;
                        Entity entityToSpawn5 = new NoiseStalkerEntity((EntityType<NoiseStalkerEntity>) ((EntityType) LatexModEntities.NOISE_STALKER.get()), (Level) _level6);
                        entityToSpawn5.moveTo(this.val$entity.getX(), this.val$entity.getY(), this.val$entity.getZ(), this.world.getRandom().nextFloat() * 360.0f, 0.0f);
                        if (entityToSpawn5 instanceof Mob) {
                            ((Mob) entityToSpawn5).finalizeSpawn(_level6, this.world.getCurrentDifficultyAt(entityToSpawn5.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        this.world.addFreshEntity(entityToSpawn5);
                    }
                } else if (Math.random() < 0.125d) {
                    ServerLevel serverLevel6 = this.world;
                    if (serverLevel6 instanceof ServerLevel) {
                        ServerLevel _level7 = serverLevel6;
                        Entity entityToSpawn6 = new DarkLatexSnakeEntity((EntityType<DarkLatexSnakeEntity>) ((EntityType) LatexModEntities.DARK_LATEX_SNAKE.get()), (Level) _level7);
                        entityToSpawn6.moveTo(this.val$entity.getX(), this.val$entity.getY(), this.val$entity.getZ(), this.world.getRandom().nextFloat() * 360.0f, 0.0f);
                        if (entityToSpawn6 instanceof Mob) {
                            ((Mob) entityToSpawn6).finalizeSpawn(_level7, this.world.getCurrentDifficultyAt(entityToSpawn6.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        this.world.addFreshEntity(entityToSpawn6);
                    }
                } else if (Math.random() < 0.125d) {
                    ServerLevel serverLevel7 = this.world;
                    if (serverLevel7 instanceof ServerLevel) {
                        ServerLevel _level8 = serverLevel7;
                        Entity entityToSpawn7 = new DarkLatexSpiderEntity((EntityType<DarkLatexSpiderEntity>) ((EntityType) LatexModEntities.DARK_LATEX_SPIDER.get()), (Level) _level8);
                        entityToSpawn7.moveTo(this.val$entity.getX(), this.val$entity.getY(), this.val$entity.getZ(), this.world.getRandom().nextFloat() * 360.0f, 0.0f);
                        if (entityToSpawn7 instanceof Mob) {
                            ((Mob) entityToSpawn7).finalizeSpawn(_level8, this.world.getCurrentDifficultyAt(entityToSpawn7.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        this.world.addFreshEntity(entityToSpawn7);
                    }
                } else if (Math.random() < 0.125d) {
                    ServerLevel serverLevel8 = this.world;
                    if (serverLevel8 instanceof ServerLevel) {
                        ServerLevel _level9 = serverLevel8;
                        Entity entityToSpawn8 = new DarkLatexMothEntity((EntityType<DarkLatexMothEntity>) ((EntityType) LatexModEntities.DARK_LATEX_MOTH.get()), (Level) _level9);
                        entityToSpawn8.moveTo(this.val$entity.getX(), this.val$entity.getY(), this.val$entity.getZ(), this.world.getRandom().nextFloat() * 360.0f, 0.0f);
                        if (entityToSpawn8 instanceof Mob) {
                            ((Mob) entityToSpawn8).finalizeSpawn(_level9, this.world.getCurrentDifficultyAt(entityToSpawn8.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        this.world.addFreshEntity(entityToSpawn8);
                    }
                } else if (Math.random() < 0.075d) {
                    ServerLevel serverLevel9 = this.world;
                    if (serverLevel9 instanceof ServerLevel) {
                        ServerLevel _level10 = serverLevel9;
                        Entity entityToSpawn9 = new DarkLatexCentaurEntity((EntityType<DarkLatexCentaurEntity>) ((EntityType) LatexModEntities.DARK_LATEX_CENTAUR.get()), (Level) _level10);
                        entityToSpawn9.moveTo(this.val$entity.getX(), this.val$entity.getY(), this.val$entity.getZ(), this.world.getRandom().nextFloat() * 360.0f, 0.0f);
                        if (entityToSpawn9 instanceof Mob) {
                            ((Mob) entityToSpawn9).finalizeSpawn(_level10, this.world.getCurrentDifficultyAt(entityToSpawn9.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        this.world.addFreshEntity(entityToSpawn9);
                    }
                } else {
                    ServerLevel serverLevel10 = this.world;
                    if (serverLevel10 instanceof ServerLevel) {
                        ServerLevel _level11 = serverLevel10;
                        Entity entityToSpawn10 = new DarklatexEntity((EntityType<DarklatexEntity>) ((EntityType) LatexModEntities.DARKLATEX.get()), (Level) _level11);
                        entityToSpawn10.moveTo(this.val$entity.getX(), this.val$entity.getY(), this.val$entity.getZ(), this.world.getRandom().nextFloat() * 360.0f, 0.0f);
                        if (entityToSpawn10 instanceof Mob) {
                            ((Mob) entityToSpawn10).finalizeSpawn(_level11, this.world.getCurrentDifficultyAt(entityToSpawn10.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        this.world.addFreshEntity(entityToSpawn10);
                    }
                }
            }
            MinecraftForge.EVENT_BUS.unregister(this);
        }
    }
}
