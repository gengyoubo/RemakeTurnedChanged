package net.ltxprogrammer.turned.entity;

import net.ltxprogrammer.changed.entity.beast.AbstractDarkLatexEntity;
import net.ltxprogrammer.changed.init.ChangedItems;
import net.ltxprogrammer.changed.init.ChangedParticles;
import net.ltxprogrammer.turned.init.LatexModEntities;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.DungeonHooks;
import net.minecraftforge.network.PlayMessages;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/entity/DarklatexconeEntity.class */
public class DarklatexconeEntity extends AbstractDarkLatexEntity {
    public DarklatexconeEntity(PlayMessages.SpawnEntity packet, Level world) {
        this((EntityType) LatexModEntities.DARKLATEXCONE.get(), world);
    }

    public DarklatexconeEntity(EntityType<DarklatexconeEntity> type, Level world) {
        super(type, world);
        this.xpReward = 6;
        setNoAi(false);
    }

    public MobType getMobType() {
        return MobType.ARTHROPOD;
    }

    public double getPassengersRidingOffset() {
        return getPassengersRidingOffset() + 1.8d;
    }

    protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHitIn) {
        dropCustomDeathLoot(source, looting, recentlyHitIn);
        spawnAtLocation(new ItemStack((ItemLike) ChangedItems.DARK_LATEX_GOO.get()));
    }

    public static void init() {
        DungeonHooks.addDungeonMob((EntityType) LatexModEntities.DARKLATEXCONE.get(), 180);
    }

    public ChangedParticles.Color3 getDripColor() {
        return ChangedParticles.Color3.DARK;
    }
}
