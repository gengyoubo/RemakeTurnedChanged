package net.ltxprogrammer.turned.procedures;

import net.ltxprogrammer.turned.init.LatexModGameRules;
import net.minecraft.world.level.LevelAccessor;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/CheckevilraidProcedure.class */
public class CheckevilraidProcedure {
    public static boolean execute(LevelAccessor world) {
        return world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DOEVILSRAID);
    }
}
