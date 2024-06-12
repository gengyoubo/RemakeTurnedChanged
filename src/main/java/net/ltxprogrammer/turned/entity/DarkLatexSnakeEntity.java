package net.ltxprogrammer.turned.entity;

import net.ltxprogrammer.changed.entity.beast.AbstractDarkLatexEntity;
import net.ltxprogrammer.changed.init.ChangedParticles;
import net.ltxprogrammer.turned.entity.p000ai.TargetCheck;
import net.ltxprogrammer.turned.init.LatexModEntities;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.level.Level;
import net.minecraftforge.network.PlayMessages;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/entity/DarkLatexSnakeEntity.class */
public class DarkLatexSnakeEntity extends AbstractDarkLatexEntity {
    public DarkLatexSnakeEntity(PlayMessages.SpawnEntity packet, Level world) {
        this((EntityType) LatexModEntities.DARK_LATEX_SNAKE.get(), world);
    }

    public DarkLatexSnakeEntity(EntityType<DarkLatexSnakeEntity> type, Level world) {
        super(type, world);
        this.xpReward = 6;
        setNoAi(false);
    }

    protected void registerGoals() {
        registerGoals();
        this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.25d, false) { // from class: net.ltxprogrammer.turned.entity.DarkLatexSnakeEntity.1
            protected double getAttackReachSqr(LivingEntity entity) {
                return 4.0d + ((double) (entity.getBbWidth() * entity.getBbWidth()));
            }
        });
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal(this, LivingEntity.class, 10, false, true, TargetCheck.IS_SLIMELING));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, LivingEntity.class, 10, true, false, TargetCheck.IS_GOOD));
        this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, LivingEntity.class, 10, true, false, TargetCheck.IS_EVIL));
    }

    public MobType getMobType() {
        return MobType.ARTHROPOD;
    }

    public static void init() {
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes().add(Attributes.MOVEMENT_SPEED, 0.25d).add(Attributes.MAX_HEALTH, 32.0d).add(Attributes.ARMOR, 2.0d).add(Attributes.ATTACK_DAMAGE, 4.0d).add(Attributes.FOLLOW_RANGE, 16.0d).add(Attributes.KNOCKBACK_RESISTANCE, 0.2d);
    }

    public ChangedParticles.Color3 getDripColor() {
        return ChangedParticles.Color3.DARK;
    }
}
