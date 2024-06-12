//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.ltxprogrammer.turned.entity;

import net.ltxprogrammer.changed.entity.beast.AbstractDarkLatexEntity;
import net.ltxprogrammer.changed.util.Color3;
import net.ltxprogrammer.turned.init.LatexModEntities;
import net.ltxprogrammer.turned.procedures.DarkLatexCakePlayerCollidesWithThisEntityProcedure;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.DungeonHooks;
import net.minecraftforge.network.PlayMessages;

public class DarkLatexCakeEntity extends AbstractDarkLatexEntity {
    public DarkLatexCakeEntity(PlayMessages.SpawnEntity packet, Level world) {
        this((EntityType)LatexModEntities.DARK_LATEX_CAKE.get(), world);
    }

    public DarkLatexCakeEntity(EntityType<DarkLatexCakeEntity> type, Level world) {
        super(type, world);
        this.xpReward = 6;
        this.setNoAi(false);
    }

    public Color3 getDripColor() {
        return Color3.DARK;
    }

    public MobType getMobType() {
        return MobType.ARTHROPOD;
    }

    public void playerTouch(Player sourceentity) {
        super.playerTouch(sourceentity);
        DarkLatexCakePlayerCollidesWithThisEntityProcedure.execute(this, sourceentity);
    }

    public static void init() {
        DungeonHooks.addDungeonMob((EntityType)LatexModEntities.DARK_LATEX_CAKE.get(), 180);
    }
}
