//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.ltxprogrammer.turned.entity;

import net.ltxprogrammer.changed.entity.beast.AbstractDarkLatexEntity;
import net.ltxprogrammer.changed.util.Color3;
import net.ltxprogrammer.turned.init.LatexModEntities;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.level.Level;
import net.minecraftforge.network.PlayMessages;

public class DarkLatexFoxEntity extends AbstractDarkLatexEntity {
    public DarkLatexFoxEntity(PlayMessages.SpawnEntity packet, Level world) {
        this((EntityType) LatexModEntities.DARK_LATEX_FOX.get(), world);
    }

    public DarkLatexFoxEntity(EntityType<DarkLatexFoxEntity> type, Level world) {
        super(type, world);
        this.xpReward = 6;
        this.setNoAi(false);
    }

    public MobType getMobType() {
        return MobType.ARTHROPOD;
    }

    public static void init() {
    }

    public Color3 getDripColor() {
        return Color3.DARK;
    }
}
