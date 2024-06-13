//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.ltxprogrammer.turned.entity;

import net.ltxprogrammer.changed.entity.beast.AbstractDarkLatexEntity;
import net.ltxprogrammer.changed.entity.beast.AquaticEntity;
import net.ltxprogrammer.changed.util.Color3;
import LatexModEntities;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.level.Level;
import net.minecraftforge.network.PlayMessages;

public class DlSquidDogEntity extends AbstractDarkLatexEntity implements AquaticEntity {
    public DlSquidDogEntity(PlayMessages.SpawnEntity packet, Level world) {
        this((EntityType) LatexModEntities.DL_SQUID_DOG.get(), world);
    }

    public DlSquidDogEntity(EntityType<DlSquidDogEntity> type, Level world) {
        super(type, world);
        this.xpReward = 9;
        this.setNoAi(false);
    }

    public MobType getMobType() {
        return MobType.ARTHROPOD;
    }

    public static void init() {
    }

    public static AttributeSupplier.Builder createAttributes() {
        AttributeSupplier.Builder builder = Mob.createMobAttributes();
        builder = builder.add(Attributes.MOVEMENT_SPEED, 0.2);
        builder = builder.add(Attributes.MAX_HEALTH, 42.0);
        builder = builder.add(Attributes.ARMOR, 0.7999999999999999);
        builder = builder.add(Attributes.ATTACK_DAMAGE, 4.0);
        builder = builder.add(Attributes.FOLLOW_RANGE, 16.0);
        builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 0.4);
        return builder;
    }

    public Color3 getDripColor() {
        return Color3.DARK;
    }
}
