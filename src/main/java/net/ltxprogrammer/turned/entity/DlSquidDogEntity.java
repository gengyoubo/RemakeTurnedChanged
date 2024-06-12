package net.ltxprogrammer.turned.entity;

import net.ltxprogrammer.changed.entity.beast.AbstractDarkLatexEntity;
import net.ltxprogrammer.changed.entity.beast.AquaticEntity;
import net.ltxprogrammer.changed.init.ChangedParticles;
import net.ltxprogrammer.turned.init.LatexModEntities;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.level.Level;
import net.minecraftforge.network.PlayMessages;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/entity/DlSquidDogEntity.class */
public class DlSquidDogEntity extends AbstractDarkLatexEntity implements AquaticEntity {
    public DlSquidDogEntity(PlayMessages.SpawnEntity packet, Level world) {
        this((EntityType) LatexModEntities.DL_SQUID_DOG.get(), world);
    }

    public DlSquidDogEntity(EntityType<DlSquidDogEntity> type, Level world) {
        super(type, world);
        this.xpReward = 9;
        setNoAi(false);
    }

    public MobType getMobType() {
        return MobType.ARTHROPOD;
    }

    public static void init() {
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes().add(Attributes.MOVEMENT_SPEED, 0.2d).add(Attributes.MAX_HEALTH, 42.0d).add(Attributes.ARMOR, 0.7999999999999999d).add(Attributes.ATTACK_DAMAGE, 4.0d).add(Attributes.FOLLOW_RANGE, 16.0d).add(Attributes.KNOCKBACK_RESISTANCE, 0.4d);
    }

    public ChangedParticles.Color3 getDripColor() {
        return ChangedParticles.Color3.DARK;
    }
}
