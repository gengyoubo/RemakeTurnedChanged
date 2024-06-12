package net.ltxprogrammer.turned.entity;

import net.ltxprogrammer.changed.entity.beast.AbstractDarkLatexEntity;
import net.ltxprogrammer.changed.init.ChangedItems;
import net.ltxprogrammer.changed.init.ChangedParticles;
import net.ltxprogrammer.turned.init.LatexModEntities;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.ai.goal.BreakDoorGoal;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraftforge.network.PlayMessages;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/entity/DarkLatexSnepEntity.class */
public class DarkLatexSnepEntity extends AbstractDarkLatexEntity {
    public DarkLatexSnepEntity(PlayMessages.SpawnEntity packet, Level world) {
        this((EntityType) LatexModEntities.DARK_LATEX_SNEP.get(), world);
    }

    public DarkLatexSnepEntity(EntityType<DarkLatexSnepEntity> type, Level world) {
        super(type, world);
        this.xpReward = 6;
        setNoAi(false);
    }

    protected void registerGoals() {
        registerGoals();
        this.goalSelector.addGoal(19, new BreakDoorGoal(this, e -> {
            return true;
        }));
    }

    public MobType getMobType() {
        return MobType.ARTHROPOD;
    }

    protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHitIn) {
        dropCustomDeathLoot(source, looting, recentlyHitIn);
        spawnAtLocation(new ItemStack((ItemLike) ChangedItems.DARK_LATEX_GOO.get()));
    }

    public static void init() {
    }

    public ChangedParticles.Color3 getDripColor() {
        return ChangedParticles.Color3.DARK;
    }
}
