//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.mcreator.latexes.procedures;

import java.util.Comparator;
import net.mcreator.latexes.init.LatexModItems;
import net.minecraft.world.Difficulty;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

public class SlimelingattackconditionsProcedure {
    public SlimelingattackconditionsProcedure() {
    }

    public static boolean execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity == null) {
            return false;
        } else {
            ItemStack var10000;
            if (entity instanceof LivingEntity) {
                LivingEntity _entGetArmor = (LivingEntity)entity;
                var10000 = _entGetArmor.getItemBySlot(EquipmentSlot.HEAD);
            } else {
                var10000 = ItemStack.EMPTY;
            }

            boolean var12;
            if (var10000.getItem() != LatexModItems.DLMASK_HELMET.get()) {
                LivingEntity var11;
                if (entity instanceof TamableAnimal) {
                    TamableAnimal _tamEnt = (TamableAnimal)entity;
                    var11 = _tamEnt.getOwner();
                } else {
                    var11 = null;
                }

                if (var11 == (Entity)world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 6.0, 6.0, 6.0), (e) -> {
                    return true;
                }).stream().sorted(((<undefinedtype>)(new Object() {
                    Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble((_entcnd) -> {
                            return _entcnd.distanceToSqr(_x, _y, _z);
                        });
                    }
                })).compareDistOf(x, y, z)).findFirst().orElse((Object)null)) {
                    label74: {
                        if (world.getDifficulty() != Difficulty.PEACEFUL) {
                            label47: {
                                if (world instanceof Level) {
                                    Level _lvl = (Level)world;
                                    if (_lvl.isDay()) {
                                        var12 = true;
                                        break label47;
                                    }
                                }

                                var12 = false;
                            }

                            if (!var12) {
                                break label74;
                            }
                        }

                        var12 = false;
                        return var12;
                    }
                }
            }

            var12 = true;
            return var12;
        }
    }
}
