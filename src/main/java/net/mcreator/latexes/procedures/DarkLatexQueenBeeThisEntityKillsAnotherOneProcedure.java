package net.mcreator.latexes.procedures;

import net.mcreator.latexes.entity.DarklatexEntity;
import net.mcreator.latexes.entity.DlsharkEntity;
import net.mcreator.latexes.entity.HertxEntity;
import net.mcreator.latexes.init.LatexModEntities;
import net.mcreator.latexes.init.LatexModGameRules;
import net.mcreator.latexes.init.LatexModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.animal.IronGolem;
import net.minecraft.world.entity.animal.WaterAnimal;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/DarkLatexQueenBeeThisEntityKillsAnotherOneProcedure.class */
public class DarkLatexQueenBeeThisEntityKillsAnotherOneProcedure {
    /* JADX WARNING: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c9  */
    public static boolean execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        boolean z2;
        if (entity == null || !world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXTRANSFUR)) {
            return false;
        }
        if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == LatexModItems.HAZMAT_HELMET.get()) {
            if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == LatexModItems.HAZMAT_CHESTPLATE.get()) {
                if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem() == LatexModItems.HAZMAT_LEGGINGS.get()) {
                    if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == LatexModItems.HAZMAT_BOOTS.get()) {
                        z2 = true;
                        if (!z2) {
                            return false;
                        }
                        if ((entity instanceof Player) || Math.random() >= 0.3d) {
                            if (!entity.level.isClientSide()) {
                                entity.discard();
                            }
                            if (world instanceof Level) {
                                Level _level = (Level) world;
                                if (!_level.isClientSide()) {
                                    _level.playSound((Player) null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 2.0f, 2.0f);
                                } else {
                                    _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 2.0f, 2.0f, false);
                                }
                            }
                            if (entity instanceof LivingEntity) {
                                ((LivingEntity) entity).addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 50, 1, false, false));
                            }
                            if (entity instanceof LivingEntity) {
                                ((LivingEntity) entity).addEffect(new MobEffectInstance(MobEffects.REGENERATION, 300, 1, false, false));
                            }
                            if (entity instanceof LivingEntity) {
                                ((LivingEntity) entity).addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 50, 1, false, false));
                            }
                            new AnonymousClass1(x, y, z).start(world, 300);
                            return false;
                        } else if ((entity instanceof IronGolem) || (entity instanceof HertxEntity)) {
                            return true;
                        } else {
                            if (entity instanceof WaterAnimal) {
                                if (!entity.level.isClientSide()) {
                                    entity.discard();
                                }
                                if (world instanceof Level) {
                                    Level _level2 = (Level) world;
                                    if (!_level2.isClientSide()) {
                                        _level2.playSound((Player) null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                                    } else {
                                        _level2.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                                    }
                                }
                                if (!(world instanceof ServerLevel)) {
                                    return false;
                                }
                                ServerLevel _level3 = (ServerLevel) world;
                                Entity entityToSpawn = new DlsharkEntity((EntityType<DlsharkEntity>) ((EntityType) LatexModEntities.DLSHARK.get()), (Level) _level3);
                                entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                                if (entityToSpawn instanceof Mob) {
                                    ((Mob) entityToSpawn).finalizeSpawn(_level3, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                                }
                                world.addFreshEntity(entityToSpawn);
                                return false;
                            } else if (entity instanceof DarklatexEntity) {
                                return false;
                            } else {
                                if (!entity.level.isClientSide()) {
                                    entity.discard();
                                }
                                if (world instanceof Level) {
                                    Level _level4 = (Level) world;
                                    if (!_level4.isClientSide()) {
                                        _level4.playSound((Player) null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                                    } else {
                                        _level4.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                                    }
                                }
                                if (!(world instanceof ServerLevel)) {
                                    return false;
                                }
                                ServerLevel _level5 = (ServerLevel) world;
                                Entity entityToSpawn2 = new DarklatexEntity((EntityType<DarklatexEntity>) ((EntityType) LatexModEntities.DARKLATEX.get()), (Level) _level5);
                                entityToSpawn2.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                                if (entityToSpawn2 instanceof Mob) {
                                    ((Mob) entityToSpawn2).finalizeSpawn(_level5, world.getCurrentDifficultyAt(entityToSpawn2.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                                }
                                world.addFreshEntity(entityToSpawn2);
                                return false;
                            }
                        }
                    }
                }
            }
        }
        z2 = false;
        if (!z2) {
        }
    }

    /* renamed from: net.mcreator.latexes.procedures.DarkLatexQueenBeeThisEntityKillsAnotherOneProcedure$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/DarkLatexQueenBeeThisEntityKillsAnotherOneProcedure$1.class */
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
                    _level.playSound((Player) null, new BlockPos(this.val$x, this.val$y, this.val$z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:burp")), SoundSource.NEUTRAL, 1.0f, 2.0f);
                } else {
                    _level.playLocalSound(this.val$x, this.val$y, this.val$z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:burp")), SoundSource.NEUTRAL, 1.0f, 2.0f, false);
                }
            }
            Level level2 = this.world;
            if (level2 instanceof Level) {
                Level _level2 = level2;
                if (!_level2.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level2, this.val$x, this.val$y, this.val$z, new ItemStack(Items.HONEY_BOTTLE));
                    entityToSpawn.setPickUpDelay(5);
                    entityToSpawn.setUnlimitedLifetime();
                    _level2.addFreshEntity(entityToSpawn);
                }
            }
            if (Math.random() < 0.7d) {
                Level level3 = this.world;
                if (level3 instanceof Level) {
                    Level _level3 = level3;
                    if (!_level3.isClientSide()) {
                        ItemEntity entityToSpawn2 = new ItemEntity(_level3, this.val$x, this.val$y, this.val$z, new ItemStack(Items.HONEY_BOTTLE));
                        entityToSpawn2.setPickUpDelay(5);
                        entityToSpawn2.setUnlimitedLifetime();
                        _level3.addFreshEntity(entityToSpawn2);
                    }
                }
                if (Math.random() < 0.3d) {
                    Level level4 = this.world;
                    if (level4 instanceof Level) {
                        Level _level4 = level4;
                        if (!_level4.isClientSide()) {
                            ItemEntity entityToSpawn3 = new ItemEntity(_level4, this.val$x, this.val$y, this.val$z, new ItemStack(Items.HONEY_BOTTLE));
                            entityToSpawn3.setPickUpDelay(5);
                            entityToSpawn3.setUnlimitedLifetime();
                            _level4.addFreshEntity(entityToSpawn3);
                        }
                    }
                    if (Math.random() < 0.1d) {
                        Level level5 = this.world;
                        if (level5 instanceof Level) {
                            Level _level5 = level5;
                            if (!_level5.isClientSide()) {
                                ItemEntity entityToSpawn4 = new ItemEntity(_level5, this.val$x, this.val$y, this.val$z, new ItemStack(Items.HONEY_BOTTLE));
                                entityToSpawn4.setPickUpDelay(5);
                                entityToSpawn4.setUnlimitedLifetime();
                                _level5.addFreshEntity(entityToSpawn4);
                            }
                        }
                    }
                }
            }
            if (Math.random() < 0.1d) {
                Level level6 = this.world;
                if (level6 instanceof Level) {
                    Level _level6 = level6;
                    if (!_level6.isClientSide()) {
                        ItemEntity entityToSpawn5 = new ItemEntity(_level6, this.val$x, this.val$y, this.val$z, new ItemStack(Blocks.HONEY_BLOCK));
                        entityToSpawn5.setPickUpDelay(5);
                        entityToSpawn5.setUnlimitedLifetime();
                        _level6.addFreshEntity(entityToSpawn5);
                    }
                }
            }
            Level level7 = this.world;
            if (level7 instanceof Level) {
                Level _level7 = level7;
                if (!_level7.isClientSide()) {
                    ItemEntity entityToSpawn6 = new ItemEntity(_level7, this.val$x, this.val$y, this.val$z, new ItemStack(Items.BONE));
                    entityToSpawn6.setPickUpDelay(5);
                    entityToSpawn6.setUnlimitedLifetime();
                    _level7.addFreshEntity(entityToSpawn6);
                }
            }
            MinecraftForge.EVENT_BUS.unregister(this);
        }
    }
}
