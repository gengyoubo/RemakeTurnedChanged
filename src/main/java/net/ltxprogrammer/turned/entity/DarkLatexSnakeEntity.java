//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.ltxprogrammer.turned.entity;

import net.ltxprogrammer.changed.entity.beast.AbstractDarkLatexEntity;
import net.ltxprogrammer.changed.util.Color3;
import net.ltxprogrammer.turned.entity.ai.TargetCheck;
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
import org.jetbrains.annotations.NotNull;

public class DarkLatexSnakeEntity extends AbstractDarkLatexEntity {
    public DarkLatexSnakeEntity(PlayMessages.SpawnEntity packet, Level world) {
        this(LatexModEntities.DARK_LATEX_SNAKE.get(), world);
    }

    public DarkLatexSnakeEntity(EntityType<DarkLatexSnakeEntity> type, Level world) {
        super(type, world);
        this.xpReward = 6;
        this.setNoAi(false);
    }

    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.25, false) {
            protected double getAttackReachSqr(@NotNull LivingEntity entity) {
                return 4.0 + (double)(entity.getBbWidth() * entity.getBbWidth());
            }
        });
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, LivingEntity.class, 10, false, true, TargetCheck.IS_SLIMELING));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, LivingEntity.class, 10, true, false, TargetCheck.IS_GOOD));
        this.targetSelector.addGoal(4, new NearestAttackableTargetGoal<>(this, LivingEntity.class, 10, true, false, TargetCheck.IS_EVIL));
    }

    public MobType getMobType() {
        return MobType.ARTHROPOD;
    }

    public static void init() {
    }

    public static AttributeSupplier.Builder createAttributes() {
        AttributeSupplier.Builder builder = Mob.createMobAttributes();
        builder = builder.add(Attributes.MOVEMENT_SPEED, 0.25);
        builder = builder.add(Attributes.MAX_HEALTH, 32.0);
        builder = builder.add(Attributes.ARMOR, 2.0);
        builder = builder.add(Attributes.ATTACK_DAMAGE, 4.0);
        builder = builder.add(Attributes.FOLLOW_RANGE, 16.0);
        builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 0.2);
        return builder;
    }

    public Color3 getDripColor() {
        return Color3.DARK;
    }
}
