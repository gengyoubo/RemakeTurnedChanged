package net.ltxprogrammer.turned.entity;

import net.ltxprogrammer.changed.entity.beast.AbstractDarkLatexEntity;
import net.ltxprogrammer.changed.init.ChangedParticles;
import net.ltxprogrammer.turned.init.LatexModEntities;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.DungeonHooks;
import net.minecraftforge.network.PlayMessages;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/entity/DarklatexEntity.class */
public class DarklatexEntity extends AbstractDarkLatexEntity {
    public DarklatexEntity(PlayMessages.SpawnEntity packet, Level world) {
        this((EntityType) LatexModEntities.DARKLATEX.get(), world);
    }

    public DarklatexEntity(EntityType<DarklatexEntity> type, Level world) {
        super(type, world);
        this.xpReward = 5;
        setNoAi(false);
    }

    public ChangedParticles.Color3 getDripColor() {
        return ChangedParticles.Color3.DARK;
    }

    public MobType getMobType() {
        return MobType.ARTHROPOD;
    }

    public double getPassengersRidingOffset() {
        return getPassengersRidingOffset() + 1.8d;
    }

    public static void init() {
        DungeonHooks.addDungeonMob((EntityType) LatexModEntities.DARKLATEX.get(), 180);
    }
}
