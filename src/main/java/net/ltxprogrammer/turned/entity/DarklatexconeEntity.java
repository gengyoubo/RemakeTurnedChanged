//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.ltxprogrammer.turned.entity;

import net.ltxprogrammer.changed.entity.beast.AbstractDarkLatexEntity;
import net.ltxprogrammer.changed.init.ChangedItems;
import net.ltxprogrammer.changed.util.Color3;
import net.ltxprogrammer.turned.init.LatexModEntities;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.DungeonHooks;
import net.minecraftforge.network.PlayMessages;

public class DarklatexconeEntity extends AbstractDarkLatexEntity {
    public DarklatexconeEntity(PlayMessages.SpawnEntity packet, Level world) {
        this((EntityType)LatexModEntities.DARKLATEXCONE.get(), world);
    }

    public DarklatexconeEntity(EntityType<DarklatexconeEntity> type, Level world) {
        super(type, world);
        this.xpReward = 6;
        this.setNoAi(false);
    }

    public MobType getMobType() {
        return MobType.ARTHROPOD;
    }

    public double getPassengersRidingOffset() {
        return super.getPassengersRidingOffset() + 1.8;
    }

    protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHitIn) {
        super.dropCustomDeathLoot(source, looting, recentlyHitIn);
        this.spawnAtLocation(new ItemStack((ItemLike)ChangedItems.DARK_LATEX_GOO.get()));
    }

    public static void init() {
        DungeonHooks.addDungeonMob((EntityType)LatexModEntities.DARKLATEXCONE.get(), 180);
    }

    public Color3 getDripColor() {
        return Color3.DARK;
    }
}
