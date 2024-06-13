package net.ltxprogrammer.turned.entity;

import javax.annotation.Nullable;
import net.ltxprogrammer.turned.entity.p000ai.TargetCheck;
import net.ltxprogrammer.turned.init.LatexModEntities;
import net.ltxprogrammer.turned.init.LatexModItems;
import net.ltxprogrammer.turned.procedures.MilitaryOnInitialEntitySpawnProcedure;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.Packet;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.AreaEffectCloud;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.FollowMobGoal;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.OpenDoorGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RangedAttackGoal;
import net.minecraft.world.entity.ai.goal.TemptGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.monster.Illusioner;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.Pillager;
import net.minecraft.world.entity.monster.RangedAttackMob;
import net.minecraft.world.entity.monster.Ravager;
import net.minecraft.world.entity.monster.SpellcasterIllager;
import net.minecraft.world.entity.monster.Vindicator;
import net.minecraft.world.entity.monster.piglin.Piglin;
import net.minecraft.world.entity.monster.piglin.PiglinBrute;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.ThrownPotion;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.NotNull;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/entity/MilitaryEntity.class */
public class MilitaryEntity extends PathfinderMob implements RangedAttackMob {
    public MilitaryEntity(PlayMessages.SpawnEntity packet, Level world) {
        this(LatexModEntities.MILITARY.get(), world);
    }

    public MilitaryEntity(EntityType<MilitaryEntity> type, Level world) {
        super(type, world);
        this.xpReward = 0;
        setNoAi(false);
        setPersistenceRequired();
        setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(LatexModItems.M_4_ASSAULT_RIFLE.get()));
    }

    public @NotNull Packet<?> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }

    protected void registerGoals() {
        registerGoals();
        this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.0d, false) { // from class: net.ltxprogrammer.turned.entity.MilitaryEntity.1
            protected double getAttackReachSqr(@NotNull LivingEntity entity) {
                return 4.0d + ((double) (entity.getBbWidth() * entity.getBbWidth()));
            }
        });
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, DROPPODEntity.class, true, false));
        this.targetSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, PathfinderMob.class, 10, true, false, TargetCheck.IS_EVIL));
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, LivingEntity.class, 10, true, false, TargetCheck.IS_LATEX));
        this.targetSelector.addGoal(5, new NearestAttackableTargetGoal<>(this, EvilMilitaryEntity.class, true, false));
        this.targetSelector.addGoal(6, new NearestAttackableTargetGoal<>(this, EvilSniperEntity.class, true, false));
        this.targetSelector.addGoal(7, new NearestAttackableTargetGoal<>(this, PrisionermilitiaEntity.class, true, false));
        this.targetSelector.addGoal(8, new NearestAttackableTargetGoal<>(this, PrisionerMilitiaMeleeEntity.class, true, false));
        this.targetSelector.addGoal(9, new NearestAttackableTargetGoal<>(this, SlimelingEntity.class, true, false));
        this.targetSelector.addGoal(10, new NearestAttackableTargetGoal<>(this, Illusioner.class, true, false));
        this.targetSelector.addGoal(11, new NearestAttackableTargetGoal<>(this, Pillager.class, true, false));
        this.targetSelector.addGoal(12, new NearestAttackableTargetGoal<>(this, Ravager.class, true, false));
        this.targetSelector.addGoal(13, new NearestAttackableTargetGoal<>(this, SpellcasterIllager.class, true, false));
        this.targetSelector.addGoal(14, new NearestAttackableTargetGoal<>(this, Vindicator.class, true, false));
        this.targetSelector.addGoal(15, new NearestAttackableTargetGoal<>(this, Piglin.class, true, false));
        this.targetSelector.addGoal(16, new NearestAttackableTargetGoal<>(this, PiglinBrute.class, true, false));
        this.targetSelector.addGoal(17, new NearestAttackableTargetGoal<>(this, Monster.class, true, false));
        this.goalSelector.addGoal(18, new OpenDoorGoal(this, true));
        this.goalSelector.addGoal(19, new TemptGoal(this, 1.0d, Ingredient.of((ItemLike) LatexModItems.TABLET.get()), false));
        this.goalSelector.addGoal(20, new FollowMobGoal(this, 0.800000011920929d, 12.0f, 6.0f));
        this.goalSelector.addGoal(21, new RandomStrollGoal(this, 0.6d));
        this.goalSelector.addGoal(22, new LookAtPlayerGoal(this, LivingEntity.class, 6.0f));
        this.goalSelector.addGoal(23, new LookAtPlayerGoal(this, Player.class, 6.0f));
        this.goalSelector.addGoal(24, new OpenDoorGoal(this, false));
        this.targetSelector.addGoal(25, new HurtByTargetGoal(this).setAlertOthers());
        this.goalSelector.addGoal(26, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(27, new FloatGoal(this));
        this.goalSelector.addGoal(1, new RangedAttackGoal(this, 1.25d, 20, 10.0f) { // from class: net.ltxprogrammer.turned.entity.MilitaryEntity.2
            public boolean canContinueToUse() {
                return canUse();
            }
        });
    }

    public boolean removeWhenFarAway(double distanceToClosestPlayer) {
        return false;
    }

    public SoundEvent getHurtSound(@NotNull DamageSource ds) {
        return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
    }

    public SoundEvent getDeathSound() {
        return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
    }

    public boolean hurt(DamageSource source, float amount) {
        if ((source.getDirectEntity() instanceof ThrownPotion) || (source.getDirectEntity() instanceof AreaEffectCloud)) {
            return false;
        }
        return hurt(source, amount);
    }

    public SpawnGroupData finalizeSpawn(@NotNull ServerLevelAccessor world, @NotNull DifficultyInstance difficulty, @NotNull MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
        SpawnGroupData retval = finalizeSpawn(world, difficulty, reason, livingdata, tag);
        MilitaryOnInitialEntitySpawnProcedure.execute(this);
        return retval;
    }

    public void performRangedAttack(@NotNull LivingEntity target, float flval) {
        M4AssaultRifleEntity.shoot(this, target);
    }

    public static void init() {
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes().add(Attributes.MOVEMENT_SPEED, 0.25d).add(Attributes.MAX_HEALTH, 20.0d).add(Attributes.ARMOR, 0.0d).add(Attributes.ATTACK_DAMAGE, 3.0d).add(Attributes.FOLLOW_RANGE, 16.0d);
    }
}
