//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.ltxprogrammer.turned.entity;

import net.ltxprogrammer.changed.entity.beast.AbstractDarkLatexEntity;
import net.ltxprogrammer.changed.init.ChangedItems;
import net.ltxprogrammer.changed.util.Color3;
import net.ltxprogrammer.turned.init.LatexModEntities;
import net.minecraft.network.protocol.Packet;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages;
import org.jetbrains.annotations.NotNull;

public class DarkLatexSkeletonEntity extends AbstractDarkLatexEntity {
    public DarkLatexSkeletonEntity(PlayMessages.SpawnEntity packet, Level world) {
        this((EntityType) LatexModEntities.DARK_LATEX_SKELETON.get(), world);
    }

    public DarkLatexSkeletonEntity(EntityType<DarkLatexSkeletonEntity> type, Level world) {
        super(type, world);
        this.xpReward = 8;
        this.setNoAi(false);
    }

    public @NotNull Packet<?> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }

    public MobType getMobType() {
        return MobType.UNDEAD;
    }

    protected void dropCustomDeathLoot(@NotNull DamageSource source, int looting, boolean recentlyHitIn) {
        super.dropCustomDeathLoot(source, looting, recentlyHitIn);
        this.spawnAtLocation(new ItemStack((ItemLike)ChangedItems.DARK_LATEX_GOO.get()));
    }

    public static void init() {
    }

    public Color3 getDripColor() {
        return Color3.DARK;
    }
}
