//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.ltxprogrammer.turned.entity;

import net.ltxprogrammer.changed.entity.beast.AbstractDarkLatexEntity;
import net.ltxprogrammer.changed.util.Color3;
import LatexModEntities;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.DungeonHooks;
import net.minecraftforge.network.PlayMessages;

public class DarklatexEntity extends AbstractDarkLatexEntity {
    public DarklatexEntity(PlayMessages.SpawnEntity packet, Level world) {
        this((EntityType) LatexModEntities.DARKLATEX.get(), world);
    }

    public DarklatexEntity(EntityType<DarklatexEntity> type, Level world) {
        super(type, world);
        this.xpReward = 5;
        this.setNoAi(false);
    }

    public Color3 getDripColor() {
        return Color3.DARK;
    }

    public MobType getMobType() {
        return MobType.ARTHROPOD;
    }

    public double getPassengersRidingOffset() {
        return super.getPassengersRidingOffset() + 1.8;
    }

    public static void init() {
        DungeonHooks.addDungeonMob((EntityType) LatexModEntities.DARKLATEX.get(), 180);
    }
}
