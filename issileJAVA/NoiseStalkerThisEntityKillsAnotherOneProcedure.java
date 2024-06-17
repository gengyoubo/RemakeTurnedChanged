//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

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
import net.minecraft.sounds.SoundEvent;
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
import net.minecraftforge.event.TickEvent.Phase;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;

public class NoiseStalkerThisEntityKillsAnotherOneProcedure {
    public NoiseStalkerThisEntityKillsAnotherOneProcedure() {
    }

    public static void execute(LevelAccessor world, final double x, final double y, final double z, Entity entity, Entity sourceentity) {
        if (entity != null && sourceentity != null) {
            ItemStack var10000;
            if (entity instanceof LivingEntity) {
                LivingEntity _entGetArmor = (LivingEntity)entity;
                var10000 = _entGetArmor.getItemBySlot(EquipmentSlot.HEAD);
            } else {
                var10000 = ItemStack.EMPTY;
            }

            boolean var20;
            label152: {
                if (var10000.getItem() != LatexModItems.HAZMAT_HELMET.get()) {
                    if (entity instanceof LivingEntity) {
                        LivingEntity _entGetArmor = (LivingEntity)entity;
                        var10000 = _entGetArmor.getItemBySlot(EquipmentSlot.CHEST);
                    } else {
                        var10000 = ItemStack.EMPTY;
                    }

                    if (var10000.getItem() != LatexModItems.HAZMAT_CHESTPLATE.get()) {
                        if (entity instanceof LivingEntity) {
                            LivingEntity _entGetArmor = (LivingEntity)entity;
                            var10000 = _entGetArmor.getItemBySlot(EquipmentSlot.LEGS);
                        } else {
                            var10000 = ItemStack.EMPTY;
                        }

                        if (var10000.getItem() != LatexModItems.HAZMAT_LEGGINGS.get()) {
                            if (entity instanceof LivingEntity) {
                                LivingEntity _entGetArmor = (LivingEntity)entity;
                                var10000 = _entGetArmor.getItemBySlot(EquipmentSlot.FEET);
                            } else {
                                var10000 = ItemStack.EMPTY;
                            }

                            if (var10000.getItem() != LatexModItems.HAZMAT_BOOTS.get()) {
                                var20 = false;
                                break label152;
                            }
                        }
                    }
                }

                var20 = true;
            }

            if (!var20) {
                Level _level;
                LivingEntity _livEnt;
                LivingEntity _livEnt;
                LivingEntity _entity;
                float var10001;
                float var10002;
                if (world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXTRANSFUR) && !(entity instanceof HertxEntity) && !(entity instanceof IronGolem)) {
                    if (Math.random() < 0.4) {
                        if (!(entity instanceof HertxEntity) && !(entity instanceof HertxEntity) && !(entity instanceof SlimelingEntity) && !(entity instanceof BeeHertxEntity) && !(entity instanceof AHVHertxEntity) && !(entity instanceof Player)) {
                            if (world instanceof Level) {
                                _level = (Level)world;
                                if (!_level.isClientSide()) {
                                    _level.playSound((Player)null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0F, 1.0F);
                                } else {
                                    _level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
                                }
                            }

                            if (!entity.level.isClientSide()) {
                                entity.discard();
                            }

                            if (world instanceof ServerLevel) {
                                ServerLevel _level = (ServerLevel)world;
                                Entity entityToSpawn = new NoiseStalkerEntity((EntityType)LatexModEntities.NOISE_STALKER.get(), _level);
                                entityToSpawn.moveTo(x, y, z, 0.0F, 0.0F);
                                entityToSpawn.setYBodyRot(0.0F);
                                entityToSpawn.setYHeadRot(0.0F);
                                if (entityToSpawn instanceof Mob) {
                                    Mob _mobToSpawn = (Mob)entityToSpawn;
                                    _mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData)null, (CompoundTag)null);
                                }

                                world.addFreshEntity(entityToSpawn);
                            }
                        }
                    } else {
                        if (world instanceof Level) {
                            _level = (Level)world;
                            if (!_level.isClientSide()) {
                                _level.playSound((Player)null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 2.0F, 2.0F);
                            } else {
                                _level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 2.0F, 2.0F, false);
                            }
                        }

                        if (!entity.level.isClientSide()) {
                            entity.discard();
                        }

                        if (sourceentity instanceof LivingEntity) {
                            _entity = (LivingEntity)sourceentity;
                            if (sourceentity instanceof LivingEntity) {
                                _livEnt = (LivingEntity)sourceentity;
                                var10001 = _livEnt.getHealth();
                            } else {
                                var10001 = -1.0F;
                            }

                            if (entity instanceof LivingEntity) {
                                _livEnt = (LivingEntity)entity;
                                var10002 = _livEnt.getMaxHealth();
                            } else {
                                var10002 = -1.0F;
                            }

                            _entity.setHealth(var10001 + var10002 / 2.0F);
                        }

                        if (Math.random() < 0.7) {
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
                                            _level.playSound((Player)null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:burp")), SoundSource.NEUTRAL, 2.0F, 2.0F);
                                        } else {
                                            _level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:burp")), SoundSource.NEUTRAL, 2.0F, 2.0F, false);
                                        }
                                    }

                                    var2 = this.world;
                                    ItemEntity entityToSpawn;
                                    if (var2 instanceof Level _level) {
                                        if (!_level.isClientSide()) {
                                            entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.BONE));
                                            entityToSpawn.setPickUpDelay(30);
                                            _level.addFreshEntity(entityToSpawn);
                                        }
                                    }

                                    var2 = this.world;
                                    if (var2 instanceof Level _level) {
                                        if (!_level.isClientSide()) {
                                            entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)LatexModItems.DARKLATEXGOO.get()));
                                            entityToSpawn.setPickUpDelay(30);
                                            _level.addFreshEntity(entityToSpawn);
                                        }
                                    }

                                    MinecraftForge.EVENT_BUS.unregister(this);
                                }
                            })).start(world, 400);
                        }
                    }
                } else {
                    if (world instanceof Level) {
                        _level = (Level)world;
                        if (!_level.isClientSide()) {
                            _level.playSound((Player)null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 2.0F, 2.0F);
                        } else {
                            _level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 2.0F, 2.0F, false);
                        }
                    }

                    if (!entity.level.isClientSide()) {
                        entity.discard();
                    }

                    if (sourceentity instanceof LivingEntity) {
                        _entity = (LivingEntity)sourceentity;
                        if (sourceentity instanceof LivingEntity) {
                            _livEnt = (LivingEntity)sourceentity;
                            var10001 = _livEnt.getHealth();
                        } else {
                            var10001 = -1.0F;
                        }

                        if (entity instanceof LivingEntity) {
                            _livEnt = (LivingEntity)entity;
                            var10002 = _livEnt.getMaxHealth();
                        } else {
                            var10002 = -1.0F;
                        }

                        _entity.setHealth(var10001 + var10002 / 2.0F);
                    }

                    if (Math.random() < 0.25) {
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
                                        _level.playSound((Player)null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:burp")), SoundSource.NEUTRAL, 2.0F, 2.0F);
                                    } else {
                                        _level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:burp")), SoundSource.NEUTRAL, 2.0F, 2.0F, false);
                                    }
                                }

                                var2 = this.world;
                                if (var2 instanceof Level _level) {
                                    if (!_level.isClientSide()) {
                                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.BONE));
                                        entityToSpawn.setPickUpDelay(30);
                                        _level.addFreshEntity(entityToSpawn);
                                    }
                                }

                                MinecraftForge.EVENT_BUS.unregister(this);
                            }
                        })).start(world, (int)(Math.random() * 50.0 * 20.0));
                    }
                }
            }

        }
    }
}
