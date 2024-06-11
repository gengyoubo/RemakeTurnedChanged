package net.mcreator.latexes.procedures;

import net.mcreator.latexes.entity.DarkLatexSpiderEntity;
import net.mcreator.latexes.entity.DarkLatexSpiderQueenEntity;
import net.mcreator.latexes.init.LatexModMobEffects;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.CaveSpider;
import net.minecraft.world.entity.monster.Spider;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.Vec3;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/LatexcobwebEntityCollidesInTheBlockProcedure.class */
public class LatexcobwebEntityCollidesInTheBlockProcedure {
    public static void execute(Entity entity) {
        if (entity != null) {
            if (!((entity instanceof DarkLatexSpiderEntity) || (entity instanceof DarkLatexSpiderQueenEntity) || (entity instanceof Spider) || (entity instanceof CaveSpider))) {
                entity.makeStuckInBlock(Blocks.AIR.defaultBlockState(), new Vec3(0.25d, 0.05d, 0.25d));
                if (Math.random() < 0.01d && (entity instanceof LivingEntity)) {
                    ((LivingEntity) entity).addEffect(new MobEffectInstance((MobEffect) LatexModMobEffects.DARKLATEXDARTEFFECT.get(), 20, 1, false, false));
                }
            }
        }
    }
}
