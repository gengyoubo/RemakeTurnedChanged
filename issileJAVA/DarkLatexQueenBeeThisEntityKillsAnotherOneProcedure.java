//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

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
import net.minecraft.sounds.SoundEvent;
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
import net.minecraftforge.event.TickEvent.Phase;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;

public class DarkLatexQueenBeeThisEntityKillsAnotherOneProcedure {
    public DarkLatexQueenBeeThisEntityKillsAnotherOneProcedure() {
    }

    public static boolean execute(LevelAccessor world, final double x, final double y, final double z, Entity entity) {
        if (entity == null) {
            return false;
        } else {
            if (world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXTRANSFUR)) {
                ItemStack var10000;
                if (entity instanceof LivingEntity) {
                    LivingEntity _entGetArmor = (LivingEntity)entity;
                    var10000 = _entGetArmor.getItemBySlot(EquipmentSlot.HEAD);
                } else {
                    var10000 = ItemStack.EMPTY;
                }

                boolean var18;
                label123: {
                    if (var10000.getItem() == LatexModItems.HAZMAT_HELMET.get()) {
                        if (entity instanceof LivingEntity) {
                            LivingEntity _entGetArmor = (LivingEntity)entity;
                            var10000 = _entGetArmor.getItemBySlot(EquipmentSlot.CHEST);
                        } else {
                            var10000 = ItemStack.EMPTY;
                        }

                        if (var10000.getItem() == LatexModItems.HAZMAT_CHESTPLATE.get()) {
                            if (entity instanceof LivingEntity) {
                                LivingEntity _entGetArmor = (LivingEntity)entity;
                                var10000 = _entGetArmor.getItemBySlot(EquipmentSlot.LEGS);
                            } else {
                                var10000 = ItemStack.EMPTY;
                            }

                            if (var10000.getItem() == LatexModItems.HAZMAT_LEGGINGS.get()) {
                                if (entity instanceof LivingEntity) {
                                    LivingEntity _entGetArmor = (LivingEntity)entity;
                                    var10000 = _entGetArmor.getItemBySlot(EquipmentSlot.FEET);
                                } else {
                                    var10000 = ItemStack.EMPTY;
                                }

                                if (var10000.getItem() == LatexModItems.HAZMAT_BOOTS.get()) {
                                    var18 = true;
                                    break label123;
                                }
                            }
                        }
                    }

                    var18 = false;
                }

                if (!var18) {
                    Level _level;
                    if (!(entity instanceof Player) && Math.random() < 0.3) {
                        if (entity instanceof IronGolem || entity instanceof HertxEntity) {
                            return true;
                        }

                        Mob _mobToSpawn;
                        ServerLevel _level;
                        if (entity instanceof WaterAnimal) {
                            if (!entity.level.isClientSide()) {
                                entity.discard();
                            }

                            if (world instanceof Level) {
                                _level = (Level)world;
                                if (!_level.isClientSide()) {
                                    _level.playSound((Player)null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0F, 1.0F);
                                } else {
                                    _level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
                                }
                            }

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
                        } else if (!(entity instanceof DarklatexEntity)) {
                            if (!entity.level.isClientSide()) {
                                entity.discard();
                            }

                            if (world instanceof Level) {
                                _level = (Level)world;
                                if (!_level.isClientSide()) {
                                    _level.playSound((Player)null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0F, 1.0F);
                                } else {
                                    _level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
                                }
                            }

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
                        }
                    } else {
                        if (!entity.level.isClientSide()) {
                            entity.discard();
                        }

                        if (world instanceof Level) {
                            _level = (Level)world;
                            if (!_level.isClientSide()) {
                                _level.playSound((Player)null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 2.0F, 2.0F);
                            } else {
                                _level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 2.0F, 2.0F, false);
                            }
                        }

                        LivingEntity _entity;
                        if (entity instanceof LivingEntity) {
                            _entity = (LivingEntity)entity;
                            _entity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 50, 1, false, false));
                        }

                        if (entity instanceof LivingEntity) {
                            _entity = (LivingEntity)entity;
                            _entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 300, 1, false, false));
                        }

                        if (entity instanceof LivingEntity) {
                            _entity = (LivingEntity)entity;
                            _entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 50, 1, false, false));
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
                                LevelAccessor var2 = this.world;
                                if (var2 instanceof Level _level) {
                                    if (!_level.isClientSide()) {
                                        _level.playSound((Player)null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:burp")), SoundSource.NEUTRAL, 1.0F, 2.0F);
                                    } else {
                                        _level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:burp")), SoundSource.NEUTRAL, 1.0F, 2.0F, false);
                                    }
                                }

                                var2 = this.world;
                                ItemEntity entityToSpawn;
                                if (var2 instanceof Level _level) {
                                    if (!_level.isClientSide()) {
                                        entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.HONEY_BOTTLE));
                                        entityToSpawn.setPickUpDelay(5);
                                        entityToSpawn.setUnlimitedLifetime();
                                        _level.addFreshEntity(entityToSpawn);
                                    }
                                }

                                if (Math.random() < 0.7) {
                                    var2 = this.world;
                                    if (var2 instanceof Level) {
                                        _level = (Level)var2;
                                        if (!_level.isClientSide()) {
                                            entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.HONEY_BOTTLE));
                                            entityToSpawn.setPickUpDelay(5);
                                            entityToSpawn.setUnlimitedLifetime();
                                            _level.addFreshEntity(entityToSpawn);
                                        }
                                    }

                                    if (Math.random() < 0.3) {
                                        var2 = this.world;
                                        if (var2 instanceof Level) {
                                            _level = (Level)var2;
                                            if (!_level.isClientSide()) {
                                                entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.HONEY_BOTTLE));
                                                entityToSpawn.setPickUpDelay(5);
                                                entityToSpawn.setUnlimitedLifetime();
                                                _level.addFreshEntity(entityToSpawn);
                                            }
                                        }

                                        if (Math.random() < 0.1) {
                                            var2 = this.world;
                                            if (var2 instanceof Level) {
                                                _level = (Level)var2;
                                                if (!_level.isClientSide()) {
                                                    entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.HONEY_BOTTLE));
                                                    entityToSpawn.setPickUpDelay(5);
                                                    entityToSpawn.setUnlimitedLifetime();
                                                    _level.addFreshEntity(entityToSpawn);
                                                }
                                            }
                                        }
                                    }
                                }

                                if (Math.random() < 0.1) {
                                    var2 = this.world;
                                    if (var2 instanceof Level) {
                                        _level = (Level)var2;
                                        if (!_level.isClientSide()) {
                                            entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.HONEY_BLOCK));
                                            entityToSpawn.setPickUpDelay(5);
                                            entityToSpawn.setUnlimitedLifetime();
                                            _level.addFreshEntity(entityToSpawn);
                                        }
                                    }
                                }

                                var2 = this.world;
                                if (var2 instanceof Level _level) {
                                    if (!_level.isClientSide()) {
                                        entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.BONE));
                                        entityToSpawn.setPickUpDelay(5);
                                        entityToSpawn.setUnlimitedLifetime();
                                        _level.addFreshEntity(entityToSpawn);
                                    }
                                }

                                MinecraftForge.EVENT_BUS.unregister(this);
                            }
                        })).start(world, 300);
                    }
                }
            }

            return false;
        }
    }
}
