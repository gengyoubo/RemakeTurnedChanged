package net.ltxprogrammer.turned.entity;

import net.ltxprogrammer.changed.entity.beast.AbstractDarkLatexEntity;
import net.ltxprogrammer.changed.init.ChangedItems;
import net.ltxprogrammer.changed.init.ChangedParticles;
import net.ltxprogrammer.turned.init.LatexModEntities;
import net.ltxprogrammer.turned.procedures.DarkLatexSpiderOnEntityTickUpdateProcedure;
import net.ltxprogrammer.turned.procedures.DarkLatexSpiderThisEntityKillsAnotherOneProcedure;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraftforge.network.PlayMessages;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/entity/DarkLatexSpiderEntity.class */
public class DarkLatexSpiderEntity extends AbstractDarkLatexEntity {
    public DarkLatexSpiderEntity(PlayMessages.SpawnEntity packet, Level world) {
        this((EntityType) LatexModEntities.DARK_LATEX_SPIDER.get(), world);
    }

    public DarkLatexSpiderEntity(EntityType<DarkLatexSpiderEntity> type, Level world) {
        super(type, world);
        this.xpReward = 8;
        setNoAi(false);
    }

    public MobType getMobType() {
        return MobType.ARTHROPOD;
    }

    protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHitIn) {
        dropCustomDeathLoot(source, looting, recentlyHitIn);
        spawnAtLocation(new ItemStack((ItemLike) ChangedItems.DARK_LATEX_GOO.get()));
    }

    public void awardKillScore(Entity entity, int score, DamageSource damageSource) {
        awardKillScore(entity, score, damageSource);
        DarkLatexSpiderThisEntityKillsAnotherOneProcedure.execute(this.level, getX(), getY(), getZ(), entity);
    }

    public void baseTick() {
        baseTick();
        DarkLatexSpiderOnEntityTickUpdateProcedure.execute(this.level, getX(), getY(), getZ(), this);
    }

    public static void init() {
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes().add(Attributes.MOVEMENT_SPEED, 0.25d).add(Attributes.MAX_HEALTH, 25.0d).add(Attributes.ARMOR, 2.0d).add(Attributes.ATTACK_DAMAGE, 5.0d).add(Attributes.FOLLOW_RANGE, 16.0d).add(Attributes.KNOCKBACK_RESISTANCE, 0.5d);
    }

    public ChangedParticles.Color3 getDripColor() {
        return ChangedParticles.Color3.DARK;
    }
}
