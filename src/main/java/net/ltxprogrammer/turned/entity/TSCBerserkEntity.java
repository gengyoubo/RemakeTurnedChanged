//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

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

public class TSCBerserkEntity extends AbstractTSCEntity {
    public TSCBerserkEntity(PlayMessages.SpawnEntity packet, Level world) {
        this((EntityType)LatexModEntities.TSC_BERSERK.get(), world);
    }

    public TSCBerserkEntity(EntityType<TSCBerserkEntity> type, Level world) {
        super(type, world);
        this.xpReward = 16;
        this.setNoAi(false);
        this.setPersistenceRequired();
    }

    public void die(DamageSource source) {
        super.die(source);
        TSCOutsiderEntityDiesProcedure.execute(this.level, this.getX(), this.getY(), this.getZ());
    }

    public static void init() {
    }

    public static AttributeSupplier.Builder createAttributes() {
        AttributeSupplier.Builder builder = Mob.createMobAttributes();
        builder = builder.add(Attributes.MOVEMENT_SPEED, 0.4);
        builder = builder.add(Attributes.MAX_HEALTH, 72.0);
        builder = builder.add(Attributes.ARMOR, 7.199999999999999);
        builder = builder.add(Attributes.ATTACK_DAMAGE, 8.0);
        builder = builder.add(Attributes.FOLLOW_RANGE, 32.0);
        builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 1.0);
        builder = builder.add(Attributes.ATTACK_KNOCKBACK, 0.5);
        return builder;
    }
}
