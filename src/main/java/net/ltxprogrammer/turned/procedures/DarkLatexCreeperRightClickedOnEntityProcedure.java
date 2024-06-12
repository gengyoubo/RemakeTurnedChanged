package net.ltxprogrammer.turned.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/DarkLatexCreeperRightClickedOnEntityProcedure.class */
public class DarkLatexCreeperRightClickedOnEntityProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity != null) {
            if (!entity.isOnFire()) {
                if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getMainHandItem() : ItemStack.EMPTY).getItem() != Items.FLINT_AND_STEEL) {
                    if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getMainHandItem() : ItemStack.EMPTY).getItem() != Items.FIRE_CHARGE) {
                        return;
                    }
                }
            }
            if (!entity.level.isClientSide()) {
                entity.discard();
            }
            if (world instanceof Level) {
                Level _level = (Level) world;
                if (!_level.isClientSide()) {
                    _level.explode((Entity) null, x, y, z, 5.0f, Explosion.BlockInteraction.BREAK);
                }
            }
        }
    }
}
