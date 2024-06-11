package net.mcreator.latexes.procedures;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/CivilianMilitiaMeleeOnInitialEntitySpawnProcedure.class */
public class CivilianMilitiaMeleeOnInitialEntitySpawnProcedure {
    public static void execute(Entity entity) {
        if (entity != null) {
            if (Math.random() < 0.6d) {
                if (Math.random() < 0.5d) {
                    if (entity instanceof LivingEntity) {
                        LivingEntity _entity = (LivingEntity) entity;
                        ItemStack _setstack = new ItemStack(Items.STONE_SWORD);
                        _setstack.setCount(1);
                        _entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
                        if (_entity instanceof Player) {
                            ((Player) _entity).getInventory().setChanged();
                        }
                    }
                } else if (entity instanceof LivingEntity) {
                    LivingEntity _entity2 = (LivingEntity) entity;
                    ItemStack _setstack2 = new ItemStack(Items.STONE_AXE);
                    _setstack2.setCount(1);
                    _entity2.setItemInHand(InteractionHand.MAIN_HAND, _setstack2);
                    if (_entity2 instanceof Player) {
                        ((Player) _entity2).getInventory().setChanged();
                    }
                }
            } else if (Math.random() < 0.4d) {
                if (entity instanceof Player) {
                    Player _player = (Player) entity;
                    _player.getInventory().armor.set(3, new ItemStack(Items.CHAINMAIL_HELMET));
                    _player.getInventory().setChanged();
                } else if (entity instanceof LivingEntity) {
                    ((LivingEntity) entity).setItemSlot(EquipmentSlot.HEAD, new ItemStack(Items.CHAINMAIL_HELMET));
                }
                if (entity instanceof Player) {
                    Player _player2 = (Player) entity;
                    _player2.getInventory().armor.set(2, new ItemStack(Items.CHAINMAIL_CHESTPLATE));
                    _player2.getInventory().setChanged();
                } else if (entity instanceof LivingEntity) {
                    ((LivingEntity) entity).setItemSlot(EquipmentSlot.CHEST, new ItemStack(Items.CHAINMAIL_CHESTPLATE));
                }
                if (entity instanceof LivingEntity) {
                    LivingEntity _entity3 = (LivingEntity) entity;
                    ItemStack _setstack3 = new ItemStack(Items.STONE_AXE);
                    _setstack3.setCount(1);
                    _entity3.setItemInHand(InteractionHand.MAIN_HAND, _setstack3);
                    if (_entity3 instanceof Player) {
                        ((Player) _entity3).getInventory().setChanged();
                    }
                }
            } else if (Math.random() < 0.4d) {
                if (entity instanceof LivingEntity) {
                    LivingEntity _entity4 = (LivingEntity) entity;
                    ItemStack _setstack4 = new ItemStack(Items.SHIELD);
                    _setstack4.setCount(1);
                    _entity4.setItemInHand(InteractionHand.OFF_HAND, _setstack4);
                    if (_entity4 instanceof Player) {
                        ((Player) _entity4).getInventory().setChanged();
                    }
                }
                if (entity instanceof LivingEntity) {
                    LivingEntity _entity5 = (LivingEntity) entity;
                    ItemStack _setstack5 = new ItemStack(Items.STONE_SWORD);
                    _setstack5.setCount(1);
                    _entity5.setItemInHand(InteractionHand.MAIN_HAND, _setstack5);
                    if (_entity5 instanceof Player) {
                        ((Player) _entity5).getInventory().setChanged();
                    }
                }
            } else {
                if (entity instanceof Player) {
                    Player _player3 = (Player) entity;
                    _player3.getInventory().armor.set(3, new ItemStack(Items.CHAINMAIL_HELMET));
                    _player3.getInventory().setChanged();
                } else if (entity instanceof LivingEntity) {
                    ((LivingEntity) entity).setItemSlot(EquipmentSlot.HEAD, new ItemStack(Items.CHAINMAIL_HELMET));
                }
                if (entity instanceof Player) {
                    Player _player4 = (Player) entity;
                    _player4.getInventory().armor.set(2, new ItemStack(Items.CHAINMAIL_CHESTPLATE));
                    _player4.getInventory().setChanged();
                } else if (entity instanceof LivingEntity) {
                    ((LivingEntity) entity).setItemSlot(EquipmentSlot.CHEST, new ItemStack(Items.CHAINMAIL_CHESTPLATE));
                }
                if (entity instanceof LivingEntity) {
                    LivingEntity _entity6 = (LivingEntity) entity;
                    ItemStack _setstack6 = new ItemStack(Items.SHIELD);
                    _setstack6.setCount(1);
                    _entity6.setItemInHand(InteractionHand.OFF_HAND, _setstack6);
                    if (_entity6 instanceof Player) {
                        ((Player) _entity6).getInventory().setChanged();
                    }
                }
                if (entity instanceof LivingEntity) {
                    LivingEntity _entity7 = (LivingEntity) entity;
                    ItemStack _setstack7 = new ItemStack(Items.IRON_SWORD);
                    _setstack7.setCount(1);
                    _entity7.setItemInHand(InteractionHand.MAIN_HAND, _setstack7);
                    if (_entity7 instanceof Player) {
                        ((Player) _entity7).getInventory().setChanged();
                    }
                }
            }
        }
    }
}
