//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.ltxprogrammer.turned.entity;

import net.ltxprogrammer.changed.block.AbstractLatexBlock;
import net.ltxprogrammer.changed.entity.LatexType;
import net.ltxprogrammer.changed.init.ChangedBlocks;
import net.ltxprogrammer.turned.entity.ai.RevertBlockStateGoal;
import net.ltxprogrammer.turned.entity.ai.TargetCheck;
import net.ltxprogrammer.turned.init.LatexModEntities;
import net.ltxprogrammer.turned.init.LatexModItems;
import net.minecraft.network.protocol.Packet;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.AreaEffectCloud;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.OpenDoorGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RangedAttackGoal;
import net.minecraft.world.entity.ai.goal.RemoveBlockGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.monster.Illusioner;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.Pillager;
import net.minecraft.world.entity.monster.RangedAttackMob;
import net.minecraft.world.entity.monster.SpellcasterIllager;
import net.minecraft.world.entity.monster.Vindicator;
import net.minecraft.world.entity.monster.piglin.Piglin;
import net.minecraft.world.entity.monster.piglin.PiglinBrute;
import net.minecraft.world.entity.projectile.ThrownPotion;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.registries.ForgeRegistries;

public class MilitaryflameunitEntity extends PathfinderMob implements RangedAttackMob {
    public MilitaryflameunitEntity(PlayMessages.SpawnEntity packet, Level world) {
        this((EntityType)LatexModEntities.MILITARYFLAMEUNIT.get(), world);
    }

    public MilitaryflameunitEntity(EntityType<MilitaryflameunitEntity> type, Level world) {
        super(type, world);
        this.xpReward = 0;
        this.setNoAi(false);
        this.setPersistenceRequired();
        this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack((ItemLike)LatexModItems.FLAMETHOWER.get()));
    }

    public Packet<?> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }

    protected void registerGoals() {
        super.registerGoals();
        this.targetSelector.addGoal(1, new NearestAttackableTargetGoal(this, PathfinderMob.class, 10, true, false, TargetCheck.IS_EVIL));
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal(this, LivingEntity.class, 10, true, false, TargetCheck.IS_LATEX));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, EvilMilitaryEntity.class, true, false));
        this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, EvilSniperEntity.class, true, false));
        this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, PrisionermilitiaEntity.class, true, false));
        this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, PrisionerMilitiaMeleeEntity.class, true, false));
        this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, Illusioner.class, true, false));
        this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, Pillager.class, true, false));
        this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, SpellcasterIllager.class, true, false));
        this.targetSelector.addGoal(10, new NearestAttackableTargetGoal(this, Vindicator.class, true, false));
        this.targetSelector.addGoal(11, new NearestAttackableTargetGoal(this, Piglin.class, true, false));
        this.targetSelector.addGoal(12, new NearestAttackableTargetGoal(this, PiglinBrute.class, true, false));
        this.targetSelector.addGoal(13, new NearestAttackableTargetGoal(this, Monster.class, true, false));
        this.goalSelector.addGoal(14, new MeleeAttackGoal(this, 1.0, false) {
            protected double getAttackReachSqr(LivingEntity entity) {
                return 4.0 + (double)(entity.getBbWidth() * entity.getBbWidth());
            }
        });
        this.goalSelector.addGoal(15, new RandomStrollGoal(this, 0.6));
        this.goalSelector.addGoal(16, new OpenDoorGoal(this, true));
        this.goalSelector.addGoal(17, new OpenDoorGoal(this, false));
        this.goalSelector.addGoal(18, new RemoveBlockGoal((Block)ChangedBlocks.DARK_LATEX_BLOCK.get(), this, 1.0, 3));
        this.goalSelector.addGoal(18, new RevertBlockStateGoal(AbstractLatexBlock.COVERED, LatexType.DARK_LATEX, LatexType.NEUTRAL, this, 1.0, 3));
        this.goalSelector.addGoal(18, new RevertBlockStateGoal(AbstractLatexBlock.COVERED, LatexType.WHITE_LATEX, LatexType.NEUTRAL, this, 1.0, 3));
        this.goalSelector.addGoal(20, new RemoveBlockGoal((Block)ChangedBlocks.LATEX_CRYSTAL.get(), this, 1.0, 3));
        this.targetSelector.addGoal(21, (new HurtByTargetGoal(this, new Class[0])).setAlertOthers(new Class[0]));
        this.goalSelector.addGoal(22, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(23, new FloatGoal(this));
        this.goalSelector.addGoal(1, new RangedAttackGoal(this, 1.25, 20, 10.0F) {
            public boolean canContinueToUse() {
                return this.canUse();
            }
        });
    }

    public MobType getMobType() {
        return MobType.UNDEFINED;
    }

    public boolean removeWhenFarAway(double distanceToClosestPlayer) {
        return false;
    }

    public SoundEvent getHurtSound(DamageSource ds) {
        return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
    }

    public SoundEvent getDeathSound() {
        return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
    }

    public boolean hurt(DamageSource source, float amount) {
        if (!(source.getDirectEntity() instanceof ThrownPotion) && !(source.getDirectEntity() instanceof AreaEffectCloud)) {
            if (source == DamageSource.DRAGON_BREATH) {
                return false;
            } else if (source == DamageSource.WITHER) {
                return false;
            } else {
                return source.getMsgId().equals("witherSkull") ? false : super.hurt(source, amount);
            }
        } else {
            return false;
        }
    }

    public void performRangedAttack(LivingEntity target, float flval) {
        FlamethowerEntity.shoot(this, target);
    }

    public static void init() {
    }

    public static AttributeSupplier.Builder createAttributes() {
        AttributeSupplier.Builder builder = Mob.createMobAttributes();
        builder = builder.add(Attributes.MOVEMENT_SPEED, 0.25);
        builder = builder.add(Attributes.MAX_HEALTH, 20.0);
        builder = builder.add(Attributes.ARMOR, 0.0);
        builder = builder.add(Attributes.ATTACK_DAMAGE, 3.0);
        builder = builder.add(Attributes.FOLLOW_RANGE, 16.0);
        return builder;
    }
}
