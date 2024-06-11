package net.mcreator.latexes.procedures;

import net.mcreator.latexes.init.LatexModGameRules;
import net.minecraft.world.level.LevelAccessor;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/DarklatexslugNaturalEntitySpawningConditionProcedure.class */
public class DarklatexslugNaturalEntitySpawningConditionProcedure {
    public static boolean execute(LevelAccessor world) {
        return world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DOSLUGSPAWN);
    }
}
