package net.mcreator.latexes.entity;

import javax.annotation.Nullable;
import net.mcreator.latexes.init.LatexModEntities;
import net.mcreator.latexes.init.LatexModItems;
import net.mcreator.latexes.procedures.CheckEvilProcedure;
import net.mcreator.latexes.procedures.CheckGoodProcedure;
import net.mcreator.latexes.procedures.CheckRobotProcedure;
import net.mcreator.latexes.procedures.CheckentityislatexProcedure;
import net.mcreator.latexes.procedures.EvilMilitaryOnInitialEntitySpawnProcedure;
import net.mcreator.latexes.procedures.TargetwearingbadberetProcedure;
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
import net.minecraft.world.entity.MobType;
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
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.registries.ForgeRegistries;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/EvilMilitaryEntity.class */
public class EvilMilitaryEntity extends PathfinderMob implements RangedAttackMob {
    public EvilMilitaryEntity(PlayMessages.SpawnEntity packet, Level world) {
        this((EntityType) LatexModEntities.EVIL_MILITARY.get(), world);
    }

    public EvilMilitaryEntity(EntityType<EvilMilitaryEntity> type, Level world) {
        super(type, world);
        this.xpReward = 0;
        setNoAi(false);
        setPersistenceRequired();
        setItemSlot(EquipmentSlot.MAINHAND, new ItemStack((ItemLike) LatexModItems.AR_70_ASSAULT_RIFLE.get()));
    }

    public Packet<?> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }

    /* renamed from: net.mcreator.latexes.entity.EvilMilitaryEntity$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/EvilMilitaryEntity$1.class */
    class AnonymousClass1 extends NearestAttackableTargetGoal {
        AnonymousClass1(Mob arg0, Class arg1, boolean arg2, boolean arg3) {
            super(arg0, arg1, arg2, arg3);
        }

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
    }

    protected void registerGoals() {
        registerGoals();
        this.targetSelector.addGoal(1, new AnonymousClass1(this, Player.class, true, false));
        this.targetSelector.addGoal(2, new AnonymousClass2(this, Monster.class, true, false));
        this.targetSelector.addGoal(3, new AnonymousClass3(this, PathfinderMob.class, true, false));
        this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, MilitaryEntity.class, true, false));
        this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, MilitaryRiotEntity.class, true, false));
        this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, MilitaryflameunitEntity.class, true, false));
        this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, CivilianEntity.class, true, false));
        this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, CivilianMilitiaMeleeEntity.class, true, false));
        this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, CivlianMilitiaEntity.class, true, false));
        this.targetSelector.addGoal(10, new NearestAttackableTargetGoal(this, Villager.class, true, false));
        this.targetSelector.addGoal(11, new NearestAttackableTargetGoal(this, WanderingTrader.class, true, false));
        this.goalSelector.addGoal(12, new AnonymousClass4(this, 1.0d, false));
        this.targetSelector.addGoal(13, new HurtByTargetGoal(this, new Class[0]).setAlertOthers(new Class[0]));
        this.goalSelector.addGoal(14, new MoveBackToVillageGoal(this, 0.6d, false));
        this.goalSelector.addGoal(15, new RandomStrollGoal(this, 1.0d));
        this.goalSelector.addGoal(16, new OpenDoorGoal(this, true));
        this.goalSelector.addGoal(17, new OpenDoorGoal(this, false));
        this.goalSelector.addGoal(18, new AnonymousClass5(this, LivingEntity.class, 6.0f));
        this.goalSelector.addGoal(19, new LookAtPlayerGoal(this, PrisionerEntity.class, 5.0f));
        this.goalSelector.addGoal(20, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(21, new FloatGoal(this));
        this.goalSelector.addGoal(1, new AnonymousClass6(this, 1.25d, 20, 10.0f));
    }

    /* renamed from: net.mcreator.latexes.entity.EvilMilitaryEntity$2  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/EvilMilitaryEntity$2.class */
    class AnonymousClass2 extends NearestAttackableTargetGoal {
        AnonymousClass2(Mob arg0, Class arg1, boolean arg2, boolean arg3) {
            super(arg0, arg1, arg2, arg3);
        }

        public boolean canUse() {
            EvilMilitaryEntity.this.getX();
            EvilMilitaryEntity.this.getY();
            EvilMilitaryEntity.this.getZ();
            Entity entity = EvilMilitaryEntity.this;
            Level level = EvilMilitaryEntity.this.level;
            return canUse() && CheckentityislatexProcedure.execute(entity);
        }

        public boolean canContinueToUse() {
            EvilMilitaryEntity.this.getX();
            EvilMilitaryEntity.this.getY();
            EvilMilitaryEntity.this.getZ();
            Entity entity = EvilMilitaryEntity.this;
            Level level = EvilMilitaryEntity.this.level;
            return canContinueToUse() && CheckentityislatexProcedure.execute(entity);
        }
    }

    /* renamed from: net.mcreator.latexes.entity.EvilMilitaryEntity$3  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/EvilMilitaryEntity$3.class */
    class AnonymousClass3 extends NearestAttackableTargetGoal {
        AnonymousClass3(Mob arg0, Class arg1, boolean arg2, boolean arg3) {
            super(arg0, arg1, arg2, arg3);
        }

        public boolean canUse() {
            EvilMilitaryEntity.this.getX();
            EvilMilitaryEntity.this.getY();
            EvilMilitaryEntity.this.getZ();
            Entity entity = EvilMilitaryEntity.this;
            Level level = EvilMilitaryEntity.this.level;
            return canUse() && CheckGoodProcedure.execute(entity);
        }

        public boolean canContinueToUse() {
            EvilMilitaryEntity.this.getX();
            EvilMilitaryEntity.this.getY();
            EvilMilitaryEntity.this.getZ();
            Entity entity = EvilMilitaryEntity.this;
            Level level = EvilMilitaryEntity.this.level;
            return canContinueToUse() && CheckGoodProcedure.execute(entity);
        }
    }

    /* renamed from: net.mcreator.latexes.entity.EvilMilitaryEntity$4  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/EvilMilitaryEntity$4.class */
    class AnonymousClass4 extends MeleeAttackGoal {
        AnonymousClass4(PathfinderMob arg0, double arg1, boolean arg2) {
            super(arg0, arg1, arg2);
        }

        protected double getAttackReachSqr(LivingEntity entity) {
            return 4.0d + ((double) (entity.getBbWidth() * entity.getBbWidth()));
        }

        public boolean canUse() {
            EvilMilitaryEntity.this.getX();
            EvilMilitaryEntity.this.getY();
            EvilMilitaryEntity.this.getZ();
            Entity entity = EvilMilitaryEntity.this;
            Level level = EvilMilitaryEntity.this.level;
            return canUse() && CheckRobotProcedure.execute(entity);
        }
    }

    /* renamed from: net.mcreator.latexes.entity.EvilMilitaryEntity$5  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/EvilMilitaryEntity$5.class */
    class AnonymousClass5 extends LookAtPlayerGoal {
        AnonymousClass5(Mob arg0, Class cls, float arg2) {
            super(arg0, cls, arg2);
        }

        public boolean canUse() {
            EvilMilitaryEntity.this.getX();
            EvilMilitaryEntity.this.getY();
            EvilMilitaryEntity.this.getZ();
            Entity entity = EvilMilitaryEntity.this;
            Level level = EvilMilitaryEntity.this.level;
            return canUse() && CheckEvilProcedure.execute(entity);
        }
    }

    /* renamed from: net.mcreator.latexes.entity.EvilMilitaryEntity$6  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/EvilMilitaryEntity$6.class */
    class AnonymousClass6 extends RangedAttackGoal {
        AnonymousClass6(RangedAttackMob arg0, double arg1, int arg2, float arg3) {
            super(arg0, arg1, arg2, arg3);
        }

        public boolean canContinueToUse() {
            return canUse();
        }
    }

    public MobType getMobType() {
        return MobType.UNDEFINED;
    }

    public boolean removeWhenFarAway(double distanceToClosestPlayer) {
        return false;
    }

    public SoundEvent getHurtSound(DamageSource ds) {
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

    public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
        SpawnGroupData retval = finalizeSpawn(world, difficulty, reason, livingdata, tag);
        EvilMilitaryOnInitialEntitySpawnProcedure.execute(this);
        return retval;
    }

    public void performRangedAttack(LivingEntity target, float flval) {
        AR70AssaultRifleEntity.shoot(this, target);
    }

    public static void init() {
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes().add(Attributes.MOVEMENT_SPEED, 0.25d).add(Attributes.MAX_HEALTH, 20.0d).add(Attributes.ARMOR, 0.0d).add(Attributes.ATTACK_DAMAGE, 3.0d).add(Attributes.FOLLOW_RANGE, 16.0d);
    }
}
