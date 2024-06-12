package net.ltxprogrammer.turned.entity;

import net.ltxprogrammer.changed.entity.beast.AbstractDarkLatexEntity;
import net.ltxprogrammer.changed.init.ChangedParticles;
import net.ltxprogrammer.turned.init.LatexModEntities;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.level.Level;
import net.minecraftforge.network.PlayMessages;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/entity/DarkLatexFoxEntity.class */
public class DarkLatexFoxEntity extends AbstractDarkLatexEntity {
    public DarkLatexFoxEntity(PlayMessages.SpawnEntity packet, Level world) {
        this((EntityType) LatexModEntities.DARK_LATEX_FOX.get(), world);
    }

    public DarkLatexFoxEntity(EntityType<DarkLatexFoxEntity> type, Level world) {
        super(type, world);
        this.xpReward = 6;
        setNoAi(false);
    }

    public MobType getMobType() {
        return MobType.ARTHROPOD;
    }

    public static void init() {
    }

    public ChangedParticles.Color3 getDripColor() {
        return ChangedParticles.Color3.DARK;
    }
}
