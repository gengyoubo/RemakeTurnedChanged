package net.ltxprogrammer.turned.entity;

import javax.annotation.Nullable;
import net.ltxprogrammer.turned.entity.p000ai.TargetCheck;
import net.ltxprogrammer.turned.init.LatexModEntities;
import net.ltxprogrammer.turned.init.LatexModItems;
import net.ltxprogrammer.turned.procedures.EvilMilitaryOnInitialEntitySpawnProcedure;
import net.ltxprogrammer.turned.procedures.TargetwearingbadberetProcedure;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.Packet;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.AreaEffectCloud;
import net.minecraft.world.entity.Entity;
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
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.MoveBackToVillageGoal;
import net.minecraft.world.entity.ai.goal.OpenDoorGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RangedAttackGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.RangedAttackMob;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.npc.WanderingTrader;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.ThrownPotion;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.NotNull;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/entity/EvilMilitaryEntity.class */
public class EvilMilitaryEntity extends PathfinderMob implements RangedAttackMob {
    public EvilMilitaryEntity(PlayMessages.SpawnEntity packet, Level world) {
        this(LatexModEntities.EVIL_MILITARY.get(), world);
    }

    public EvilMilitaryEntity(EntityType<EvilMilitaryEntity> type, Level world) {
        super(type, world);
        this.xpReward = 0;
        setNoAi(false);
        setPersistenceRequired();
        setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(LatexModItems.AR_70_ASSAULT_RIFLE.get()));
    }

    public @NotNull Packet<?> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }

    protected void registerGoals() {
        registerGoals();
        this.targetSelector.addGoal(1, new NearestAttackableTargetGoal(this, Player.class, true, false) { // from class: net.ltxprogrammer.turned.entity.EvilMilitaryEntity.1
            public boolean canUse() {
                EvilMilitaryEntity.this.getX();
                EvilMilitaryEntity.this.getY();
                EvilMilitaryEntity.this.getZ();
                Entity entity = EvilMilitaryEntity.this;
                Level level = EvilMilitaryEntity.this.level;
                return canUse() && TargetwearingbadberetProcedure.execute(entity);
            }

            public boolean canContinueToUse() {
                EvilMilitaryEntity.this.getX();
                EvilMilitaryEntity.this.getY();
                EvilMilitaryEntity.this.getZ();
                Entity entity = EvilMilitaryEntity.this;
                Level level = EvilMilitaryEntity.this.level;
                return canContinueToUse() && TargetwearingbadberetProcedure.execute(entity);
            }
        });
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, Monster.class, 10, true, false, TargetCheck.IS_LATEX));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, PathfinderMob.class, 10, true, false, TargetCheck.IS_GOOD));
        this.targetSelector.addGoal(4, new NearestAttackableTargetGoal<>(this, MilitaryEntity.class, true, false));
        this.targetSelector.addGoal(5, new NearestAttackableTargetGoal<>(this, MilitaryRiotEntity.class, true, false));
        this.targetSelector.addGoal(6, new NearestAttackableTargetGoal<>(this, MilitaryflameunitEntity.class, true, false));
        this.targetSelector.addGoal(7, new NearestAttackableTargetGoal<>(this, CivilianEntity.class, true, false));
        this.targetSelector.addGoal(8, new NearestAttackableTargetGoal<>(this, CivilianMilitiaMeleeEntity.class, true, false));
        this.targetSelector.addGoal(9, new NearestAttackableTargetGoal<>(this, CivlianMilitiaEntity.class, true, false));
        this.targetSelector.addGoal(10, new NearestAttackableTargetGoal<>(this, Villager.class, true, false));
        this.targetSelector.addGoal(11, new NearestAttackableTargetGoal<>(this, WanderingTrader.class, true, false));
        this.goalSelector.addGoal(12, new MeleeAttackGoal(this, 1.0d, false));
        this.targetSelector.addGoal(13, new HurtByTargetGoal(this).setAlertOthers());
        this.goalSelector.addGoal(14, new MoveBackToVillageGoal(this, 0.6d, false));
        this.goalSelector.addGoal(15, new RandomStrollGoal(this, 1.0d));
        this.goalSelector.addGoal(16, new OpenDoorGoal(this, true));
        this.goalSelector.addGoal(17, new OpenDoorGoal(this, false));
        this.goalSelector.addGoal(18, new LookAtPlayerGoal(this, LivingEntity.class, 6.0f));
        this.goalSelector.addGoal(19, new LookAtPlayerGoal(this, PrisionerEntity.class, 5.0f));
        this.goalSelector.addGoal(20, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(21, new FloatGoal(this));
        this.goalSelector.addGoal(1, new RangedAttackGoal(this, 1.25d, 20, 10.0f) { // from class: net.ltxprogrammer.turned.entity.EvilMilitaryEntity.2
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
        EvilMilitaryOnInitialEntitySpawnProcedure.execute(this);
        return retval;
    }

    public void performRangedAttack(@NotNull LivingEntity target, float flval) {
        AR70AssaultRifleEntity.shoot(this, target);
    }

    public static void init() {
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes().add(Attributes.MOVEMENT_SPEED, 0.25d).add(Attributes.MAX_HEALTH, 20.0d).add(Attributes.ARMOR, 0.0d).add(Attributes.ATTACK_DAMAGE, 3.0d).add(Attributes.FOLLOW_RANGE, 16.0d);
    }
}
