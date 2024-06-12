package net.ltxprogrammer.turned.procedures;

import net.ltxprogrammer.turned.init.LatexModItems;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/TSCOutsiderEntityDiesProcedure.class */
public class TSCOutsiderEntityDiesProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        if (Math.random() >= 0.1d || !world.getLevelData().getGameRules().getBoolean(GameRules.RULE_MOBGRIEFING)) {
            TSCdroneEntityDiesProcedure.execute(world, x, y, z);
        } else if (world instanceof Level _level4) {
            if (!_level4.isClientSide()) {
                _level4.explode(null, x, y, z, 1.0f, Explosion.BlockInteraction.DESTROY);
            }
        }
    }
}
