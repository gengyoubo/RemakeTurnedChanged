/**

package net.ltxprogrammer.turned.procedures;

import javax.annotation.Nullable;
import net.ltxprogrammer.turned.init.LatexModItems;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.TickEvent.Phase;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber
public class AmmooverlayProcedure {
    public AmmooverlayProcedure() {
    }

    @SubscribeEvent
    public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
        if (event.phase == Phase.END) {
            execute(event, event.player);
        }

    }

    public static void execute(Entity entity) {
        execute((Event)null, entity);
    }

    private static void execute(@Nullable Event event, Entity entity) {
        if (entity != null) {
            LivingEntity _livEnt;
            ItemStack var10000;
            if (entity instanceof LivingEntity) {
                _livEnt = (LivingEntity)entity;
                var10000 = _livEnt.getMainHandItem();
            } else {
                var10000 = ItemStack.EMPTY;
            }

            Player _player;
            LivingEntity _livEnt;
            CompoundTag var11;
            TextComponent var10001;
            ItemStack var10003;
            if (var10000.getItem() == LatexModItems.DARTRIFLE.get() && entity instanceof Player) {
                _player = (Player)entity;
                if (!_player.level.isClientSide()) {
                    var10001 = new TextComponent;
                    if (entity instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity;
                        var10003 = _livEnt.getMainHandItem();
                    } else {
                        var10003 = ItemStack.EMPTY;
                    }

                    var11 = var10003.getOrCreateTag();
                    var10001.<init>("[Darts] [" + var11.getDouble("ammo") + "/5.0]");
                    _player.displayClientMessage(var10001, true);
                }
            }

            if (entity instanceof LivingEntity) {
                _livEnt = (LivingEntity)entity;
                var10000 = _livEnt.getMainHandItem();
            } else {
                var10000 = ItemStack.EMPTY;
            }

            if (var10000.getItem() == LatexModItems.LATEX_DART_RIFLE.get() && entity instanceof Player) {
                _player = (Player)entity;
                if (!_player.level.isClientSide()) {
                    var10001 = new TextComponent;
                    if (entity instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity;
                        var10003 = _livEnt.getMainHandItem();
                    } else {
                        var10003 = ItemStack.EMPTY;
                    }

                    var11 = var10003.getOrCreateTag();
                    var10001.<init>("[Latex Darts] [" + var11.getDouble("ammo") + "/5.0]");
                    _player.displayClientMessage(var10001, true);
                }
            }

            if (entity instanceof LivingEntity) {
                _livEnt = (LivingEntity)entity;
                var10000 = _livEnt.getMainHandItem();
            } else {
                var10000 = ItemStack.EMPTY;
            }

            LivingEntity _livEnt;
            LivingEntity _livEnt;
            LivingEntity _livEnt;
            Player _player;
            Object var12;
            label290: {
                if (var10000.getItem() != LatexModItems.M_4_ASSAULT_RIFLE.get()) {
                    if (entity instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity;
                        var10000 = _livEnt.getMainHandItem();
                    } else {
                        var10000 = ItemStack.EMPTY;
                    }

                    if (var10000.getItem() != LatexModItems.SCRAP_M_16_RIFLE.get()) {
                        break label290;
                    }
                }

                if (entity instanceof Player) {
                    _player = (Player)entity;
                    if (!_player.level.isClientSide()) {
                        var10001 = new TextComponent;
                        if (entity instanceof LivingEntity) {
                            _livEnt = (LivingEntity)entity;
                            var10003 = _livEnt.getMainHandItem();
                        } else {
                            var10003 = ItemStack.EMPTY;
                        }

                        if (var10003.getOrCreateTag().getDouble("ammo") > 30.0) {
                            if (entity instanceof LivingEntity) {
                                _livEnt = (LivingEntity)entity;
                                var10003 = _livEnt.getMainHandItem();
                            } else {
                                var10003 = ItemStack.EMPTY;
                            }

                            var12 = var10003.getOrCreateTag().getDouble("ammo") - 1.0 + "+1";
                        } else {
                            if (entity instanceof LivingEntity) {
                                LivingEntity _livEnt = (LivingEntity)entity;
                                var10003 = _livEnt.getMainHandItem();
                            } else {
                                var10003 = ItemStack.EMPTY;
                            }

                            var12 = var10003.getOrCreateTag().getDouble("ammo");
                        }

                        var10001.<init>("[Assault Rifle Magazine] [" + var12 + "/30.0]");
                        _player.displayClientMessage(var10001, true);
                    }
                }
            }

            if (entity instanceof LivingEntity) {
                _livEnt = (LivingEntity)entity;
                var10000 = _livEnt.getMainHandItem();
            } else {
                var10000 = ItemStack.EMPTY;
            }

            if (var10000.getItem() == LatexModItems.AR_70_ASSAULT_RIFLE.get() && entity instanceof Player) {
                _player = (Player)entity;
                if (!_player.level.isClientSide()) {
                    var10001 = new TextComponent;
                    if (entity instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity;
                        var10003 = _livEnt.getMainHandItem();
                    } else {
                        var10003 = ItemStack.EMPTY;
                    }

                    if (var10003.getOrCreateTag().getDouble("ammo") > 30.0) {
                        if (entity instanceof LivingEntity) {
                            _livEnt = (LivingEntity)entity;
                            var10003 = _livEnt.getMainHandItem();
                        } else {
                            var10003 = ItemStack.EMPTY;
                        }

                        var12 = var10003.getOrCreateTag().getDouble("ammo") - 1.0 + "+1";
                    } else {
                        if (entity instanceof LivingEntity) {
                            _livEnt = (LivingEntity)entity;
                            var10003 = _livEnt.getMainHandItem();
                        } else {
                            var10003 = ItemStack.EMPTY;
                        }

                        var12 = var10003.getOrCreateTag().getDouble("ammo");
                    }

                    var10001.<init>("[Assault Rifle Magazine] [" + var12 + "/30.0]");
                    _player.displayClientMessage(var10001, true);
                }
            }

            if (entity instanceof LivingEntity) {
                _livEnt = (LivingEntity)entity;
                var10000 = _livEnt.getMainHandItem();
            } else {
                var10000 = ItemStack.EMPTY;
            }

            if (var10000.getItem() == LatexModItems.FLAMETHOWER.get() && entity instanceof Player) {
                _player = (Player)entity;
                if (!_player.level.isClientSide()) {
                    var10001 = new TextComponent;
                    if (entity instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity;
                        var10003 = _livEnt.getMainHandItem();
                    } else {
                        var10003 = ItemStack.EMPTY;
                    }

                    var11 = var10003.getOrCreateTag();
                    var10001.<init>("[Coal Fuel] [" + var11.getDouble("ammo") + "/100.0]");
                    _player.displayClientMessage(var10001, true);
                }
            }

            if (entity instanceof LivingEntity) {
                _livEnt = (LivingEntity)entity;
                var10000 = _livEnt.getMainHandItem();
            } else {
                var10000 = ItemStack.EMPTY;
            }

            if (var10000.getItem() == LatexModItems.TSC_PISTOL.get() && entity instanceof Player) {
                _player = (Player)entity;
                if (!_player.level.isClientSide()) {
                    var10001 = new TextComponent;
                    if (entity instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity;
                        var10003 = _livEnt.getMainHandItem();
                    } else {
                        var10003 = ItemStack.EMPTY;
                    }

                    if (var10003.getOrCreateTag().getDouble("ammo") > 12.0) {
                        if (entity instanceof LivingEntity) {
                            _livEnt = (LivingEntity)entity;
                            var10003 = _livEnt.getMainHandItem();
                        } else {
                            var10003 = ItemStack.EMPTY;
                        }

                        var12 = var10003.getOrCreateTag().getDouble("ammo") - 1.0 + "+1";
                    } else {
                        if (entity instanceof LivingEntity) {
                            _livEnt = (LivingEntity)entity;
                            var10003 = _livEnt.getMainHandItem();
                        } else {
                            var10003 = ItemStack.EMPTY;
                        }

                        var12 = var10003.getOrCreateTag().getDouble("ammo");
                    }

                    var10001.<init>("[TSC Pistol Mag] [" + var12 + "/12.0]");
                    _player.displayClientMessage(var10001, true);
                }
            }

            if (entity instanceof LivingEntity) {
                _livEnt = (LivingEntity)entity;
                var10000 = _livEnt.getOffhandItem();
            } else {
                var10000 = ItemStack.EMPTY;
            }

            if (var10000.getItem() == LatexModItems.TSC_PISTOL.get() && entity instanceof Player) {
                _player = (Player)entity;
                if (!_player.level.isClientSide()) {
                    var10001 = new TextComponent;
                    if (entity instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity;
                        var10003 = _livEnt.getOffhandItem();
                    } else {
                        var10003 = ItemStack.EMPTY;
                    }

                    if (var10003.getOrCreateTag().getDouble("ammo") > 12.0) {
                        if (entity instanceof LivingEntity) {
                            _livEnt = (LivingEntity)entity;
                            var10003 = _livEnt.getOffhandItem();
                        } else {
                            var10003 = ItemStack.EMPTY;
                        }

                        var12 = var10003.getOrCreateTag().getDouble("ammo") - 1.0 + "+1";
                    } else {
                        if (entity instanceof LivingEntity) {
                            _livEnt = (LivingEntity)entity;
                            var10003 = _livEnt.getOffhandItem();
                        } else {
                            var10003 = ItemStack.EMPTY;
                        }

                        var12 = var10003.getOrCreateTag().getDouble("ammo");
                    }

                    var10001.<init>("[TSC Pistol Mag] [" + var12 + "/12.0]");
                    _player.displayClientMessage(var10001, true);
                }
            }

            if (entity instanceof LivingEntity) {
                _livEnt = (LivingEntity)entity;
                var10000 = _livEnt.getMainHandItem();
            } else {
                var10000 = ItemStack.EMPTY;
            }

            if (var10000.getItem() == LatexModItems.OVERUNDERSHOTGUN.get() && entity instanceof Player) {
                _player = (Player)entity;
                if (!_player.level.isClientSide()) {
                    var10001 = new TextComponent;
                    if (entity instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity;
                        var10003 = _livEnt.getMainHandItem();
                    } else {
                        var10003 = ItemStack.EMPTY;
                    }

                    var11 = var10003.getOrCreateTag();
                    var10001.<init>("[Shotgun Shell] [" + var11.getDouble("ammo") + "/2.0]");
                    _player.displayClientMessage(var10001, true);
                }
            }

            if (entity instanceof LivingEntity) {
                _livEnt = (LivingEntity)entity;
                var10000 = _livEnt.getMainHandItem();
            } else {
                var10000 = ItemStack.EMPTY;
            }

            if (var10000.getItem() == LatexModItems.REVOLVING_GOO_CANNON.get() && entity instanceof Player) {
                _player = (Player)entity;
                if (!_player.level.isClientSide()) {
                    var10001 = new TextComponent;
                    if (entity instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity;
                        var10003 = _livEnt.getMainHandItem();
                    } else {
                        var10003 = ItemStack.EMPTY;
                    }

                    var11 = var10003.getOrCreateTag();
                    var10001.<init>("[Dark Latex Goo] [" + var11.getDouble("ammo") + "/ 3.0]");
                    _player.displayClientMessage(var10001, true);
                }
            }

            if (entity instanceof LivingEntity) {
                _livEnt = (LivingEntity)entity;
                var10000 = _livEnt.getMainHandItem();
            } else {
                var10000 = ItemStack.EMPTY;
            }

            label306: {
                if (var10000.getItem() != LatexModItems.MATCH_LOCK_MUSKET.get()) {
                    if (entity instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entity;
                        var10000 = _livEnt.getMainHandItem();
                    } else {
                        var10000 = ItemStack.EMPTY;
                    }

                    if (var10000.getItem() != LatexModItems.MATCHLOCK_PISTOL.get()) {
                        break label306;
                    }
                }

                if (entity instanceof LivingEntity) {
                    _livEnt = (LivingEntity)entity;
                    var10000 = _livEnt.getMainHandItem();
                } else {
                    var10000 = ItemStack.EMPTY;
                }

                Player _player;
                if (var10000.getOrCreateTag().getDouble("ammo") == 1.0) {
                    if (entity instanceof Player) {
                        _player = (Player)entity;
                        if (!_player.level.isClientSide()) {
                            _player.displayClientMessage(new TextComponent("[Paper Cartidge] [ Loaded ]"), true);
                        }
                    }
                } else if (entity instanceof Player) {
                    _player = (Player)entity;
                    if (!_player.level.isClientSide()) {
                        _player.displayClientMessage(new TextComponent("[Paper Cartidge] [ Empty ]"), true);
                    }
                }
            }

            if (entity instanceof LivingEntity) {
                _livEnt = (LivingEntity)entity;
                var10000 = _livEnt.getOffhandItem();
            } else {
                var10000 = ItemStack.EMPTY;
            }

            if (var10000.getItem() == LatexModItems.MATCHLOCK_PISTOL.get()) {
                if (entity instanceof LivingEntity) {
                    _livEnt = (LivingEntity)entity;
                    var10000 = _livEnt.getOffhandItem();
                } else {
                    var10000 = ItemStack.EMPTY;
                }

                if (var10000.getOrCreateTag().getDouble("ammo") == 1.0) {
                    if (entity instanceof Player) {
                        _player = (Player)entity;
                        if (!_player.level.isClientSide()) {
                            _player.displayClientMessage(new TextComponent("[Paper Cartidge] [ Loaded ]"), true);
                        }
                    }
                } else if (entity instanceof Player) {
                    _player = (Player)entity;
                    if (!_player.level.isClientSide()) {
                        _player.displayClientMessage(new TextComponent("[Paper Cartidge] [ Empty ]"), true);
                    }
                }
            }

        }
    }
}
*/