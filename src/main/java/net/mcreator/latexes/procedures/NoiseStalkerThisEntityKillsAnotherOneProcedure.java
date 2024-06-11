package net.mcreator.latexes.procedures;

import net.mcreator.latexes.entity.AHVHertxEntity;
import net.mcreator.latexes.entity.BeeHertxEntity;
import net.mcreator.latexes.entity.HertxEntity;
import net.mcreator.latexes.entity.NoiseStalkerEntity;
import net.mcreator.latexes.entity.SlimelingEntity;
import net.mcreator.latexes.init.LatexModEntities;
import net.mcreator.latexes.init.LatexModGameRules;
import net.mcreator.latexes.init.LatexModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.animal.IronGolem;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/NoiseStalkerThisEntityKillsAnotherOneProcedure.class */
public class NoiseStalkerThisEntityKillsAnotherOneProcedure {
    /* JADX WARNING: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b8  */
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
        boolean z2;
        if (entity != null && sourceentity != null) {
            if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() != LatexModItems.HAZMAT_HELMET.get()) {
                if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() != LatexModItems.HAZMAT_CHESTPLATE.get()) {
                    if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem() != LatexModItems.HAZMAT_LEGGINGS.get()) {
                        if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() != LatexModItems.HAZMAT_BOOTS.get()) {
                            z2 = false;
                            if (z2) {
                                if (world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXTRANSFUR)) {
                                    if (!((entity instanceof HertxEntity) || (entity instanceof IronGolem))) {
                                        if (Math.random() < 0.4d) {
                                            if (!((entity instanceof HertxEntity) || (entity instanceof HertxEntity) || (entity instanceof SlimelingEntity) || (entity instanceof BeeHertxEntity) || (entity instanceof AHVHertxEntity) || (entity instanceof Player))) {
                                                if (world instanceof Level) {
                                                    Level _level = (Level) world;
                                                    if (!_level.isClientSide()) {
                                                        _level.playSound((Player) null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                                                    } else {
                                                        _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                                                    }
                                                }
                                                if (!entity.level.isClientSide()) {
                                                    entity.discard();
                                                }
                                                if (world instanceof ServerLevel) {
                                                    ServerLevel _level2 = (ServerLevel) world;
                                                    Entity entityToSpawn = new NoiseStalkerEntity((EntityType<NoiseStalkerEntity>) ((EntityType) LatexModEntities.NOISE_STALKER.get()), (Level) _level2);
                                                    entityToSpawn.moveTo(x, y, z, 0.0f, 0.0f);
                                                    entityToSpawn.setYBodyRot(0.0f);
                                                    entityToSpawn.setYHeadRot(0.0f);
                                                    if (entityToSpawn instanceof Mob) {
                                                        ((Mob) entityToSpawn).finalizeSpawn(_level2, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                                                    }
                                                    world.addFreshEntity(entityToSpawn);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        }
                                        if (world instanceof Level) {
                                            Level _level3 = (Level) world;
                                            if (!_level3.isClientSide()) {
                                                _level3.playSound((Player) null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 2.0f, 2.0f);
                                            } else {
                                                _level3.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 2.0f, 2.0f, false);
                                            }
                                        }
                                        if (!entity.level.isClientSide()) {
                                            entity.discard();
                                        }
                                        if (sourceentity instanceof LivingEntity) {
                                            ((LivingEntity) sourceentity).setHealth((sourceentity instanceof LivingEntity ? ((LivingEntity) sourceentity).getHealth() : -1.0f) + ((entity instanceof LivingEntity ? ((LivingEntity) entity).getMaxHealth() : -1.0f) / 2.0f));
                                        }
                                        if (Math.random() < 0.7d) {
                                            new AnonymousClass1(x, y, z).start(world, 400);
                                            return;
                                        }
                                        return;
                                    }
                                }
                                if (world instanceof Level) {
                                    Level _level4 = (Level) world;
                                    if (!_level4.isClientSide()) {
                                        _level4.playSound((Player) null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 2.0f, 2.0f);
                                    } else {
                                        _level4.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 2.0f, 2.0f, false);
                                    }
                                }
                                if (!entity.level.isClientSide()) {
                                    entity.discard();
                                }
                                if (sourceentity instanceof LivingEntity) {
                                    ((LivingEntity) sourceentity).setHealth((sourceentity instanceof LivingEntity ? ((LivingEntity) sourceentity).getHealth() : -1.0f) + ((entity instanceof LivingEntity ? ((LivingEntity) entity).getMaxHealth() : -1.0f) / 2.0f));
                                }
                                if (Math.random() < 0.25d) {
                                    new AnonymousClass2(x, y, z).start(world, (int) (Math.random() * 50.0d * 20.0d));
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                    }
                }
            }
            z2 = true;
            if (z2) {
            }
        }
    }

    /* renamed from: net.mcreator.latexes.procedures.NoiseStalkerThisEntityKillsAnotherOneProcedure$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/NoiseStalkerThisEntityKillsAnotherOneProcedure$1.class */
    class AnonymousClass1 {
        private int ticks = 0;
        private float waitTicks;
        private LevelAccessor world;
        final /* synthetic */ double val$x;
        final /* synthetic */ double val$y;
        final /* synthetic */ double val$z;

        AnonymousClass1(double d, double d2, double d3) {
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
            Level level = this.world;
            if (level instanceof Level) {
                Level _level = level;
                if (!_level.isClientSide()) {
                    _level.playSound((Player) null, new BlockPos(this.val$x, this.val$y, this.val$z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:burp")), SoundSource.NEUTRAL, 2.0f, 2.0f);
                } else {
                    _level.playLocalSound(this.val$x, this.val$y, this.val$z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:burp")), SoundSource.NEUTRAL, 2.0f, 2.0f, false);
                }
            }
            Level level2 = this.world;
            if (level2 instanceof Level) {
                Level _level2 = level2;
                if (!_level2.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level2, this.val$x, this.val$y, this.val$z, new ItemStack(Items.BONE));
                    entityToSpawn.setPickUpDelay(30);
                    _level2.addFreshEntity(entityToSpawn);
                }
            }
            Level level3 = this.world;
            if (level3 instanceof Level) {
                Level _level3 = level3;
                if (!_level3.isClientSide()) {
                    ItemEntity entityToSpawn2 = new ItemEntity(_level3, this.val$x, this.val$y, this.val$z, new ItemStack((ItemLike) LatexModItems.DARKLATEXGOO.get()));
                    entityToSpawn2.setPickUpDelay(30);
                    _level3.addFreshEntity(entityToSpawn2);
                }
            }
            MinecraftForge.EVENT_BUS.unregister(this);
        }
    }

    /* renamed from: net.mcreator.latexes.procedures.NoiseStalkerThisEntityKillsAnotherOneProcedure$2  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/NoiseStalkerThisEntityKillsAnotherOneProcedure$2.class */
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
            Level level = this.world;
            if (level instanceof Level) {
                Level _level = level;
                if (!_level.isClientSide()) {
                    _level.playSound((Player) null, new BlockPos(this.val$x, this.val$y, this.val$z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:burp")), SoundSource.NEUTRAL, 2.0f, 2.0f);
                } else {
                    _level.playLocalSound(this.val$x, this.val$y, this.val$z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:burp")), SoundSource.NEUTRAL, 2.0f, 2.0f, false);
                }
            }
            Level level2 = this.world;
            if (level2 instanceof Level) {
                Level _level2 = level2;
                if (!_level2.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level2, this.val$x, this.val$y, this.val$z, new ItemStack(Items.BONE));
                    entityToSpawn.setPickUpDelay(30);
                    _level2.addFreshEntity(entityToSpawn);
                }
            }
            MinecraftForge.EVENT_BUS.unregister(this);
        }
    }
}
