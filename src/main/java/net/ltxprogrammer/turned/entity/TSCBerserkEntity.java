package net.ltxprogrammer.turned.entity;

import net.ltxprogrammer.turned.init.LatexModEntities;
import net.ltxprogrammer.turned.procedures.TSCOutsiderEntityDiesProcedure;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.level.Level;
import net.minecraftforge.network.PlayMessages;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/entity/TSCBerserkEntity.class */
public class TSCBerserkEntity extends AbstractTSCEntity {
    public TSCBerserkEntity(PlayMessages.SpawnEntity packet, Level world) {
        this((EntityType) LatexModEntities.TSC_BERSERK.get(), world);
    }

    public TSCBerserkEntity(EntityType<TSCBerserkEntity> type, Level world) {
        super(type, world);
        this.xpReward = 16;
        setNoAi(false);
        setPersistenceRequired();
    }

    public void die(DamageSource source) {
        die(source);
        TSCOutsiderEntityDiesProcedure.execute(this.level, getX(), getY(), getZ());
    }

    public static void init() {
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes().add(Attributes.MOVEMENT_SPEED, 0.4d).add(Attributes.MAX_HEALTH, 72.0d).add(Attributes.ARMOR, 7.199999999999999d).add(Attributes.ATTACK_DAMAGE, 8.0d).add(Attributes.FOLLOW_RANGE, 32.0d).add(Attributes.KNOCKBACK_RESISTANCE, 1.0d).add(Attributes.ATTACK_KNOCKBACK, 0.5d);
    }
}
