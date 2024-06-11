package net.mcreator.latexes.entity;

import javax.annotation.Nullable;
import net.mcreator.latexes.init.LatexModEntities;
import net.mcreator.latexes.procedures.CheckEvilProcedure;
import net.mcreator.latexes.procedures.CivilianMilitiaMeleeOnInitialEntitySpawnProcedure;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.Packet;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.AvoidEntityGoal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.MoveBackToVillageGoal;
import net.minecraft.world.entity.ai.goal.OpenDoorGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.registries.ForgeRegistries;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/CivilianMilitiaMeleeEntity.class */
public class CivilianMilitiaMeleeEntity extends PathfinderMob {
    public CivilianMilitiaMeleeEntity(PlayMessages.SpawnEntity packet, Level world) {
        this((EntityType) LatexModEntities.CIVILIAN_MILITIA_MELEE.get(), world);
    }

    public CivilianMilitiaMeleeEntity(EntityType<CivilianMilitiaMeleeEntity> type, Level world) {
        super(type, world);
        this.xpReward = 0;
        setNoAi(false);
        setPersistenceRequired();
    }

    public Packet<?> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }

    protected void registerGoals() {
        registerGoals();
        this.targetSelector.addGoal(1, new NearestAttackableTargetGoal(this, Monster.class, true, false));
        this.targetSelector.addGoal(2, new AnonymousClass1(this, PathfinderMob.class, true, false));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, EvilMilitaryEntity.class, true, false));
        this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, EvilSniperEntity.class, true, false));
        this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, PrisionermilitiaEntity.class, true, false));
        this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, PrisionerMilitiaMeleeEntity.class, true, false));
        this.goalSelector.addGoal(7, new AnonymousClass2(this, 1.0d, false));
        this.targetSelector.addGoal(8, new HurtByTargetGoal(this, new Class[0]).setAlertOthers(new Class[0]));
        this.goalSelector.addGoal(9, new OpenDoorGoal(this, true));
        this.goalSelector.addGoal(10, new AvoidEntityGoal(this, Monster.class, 9.0f, 1.2d, 0.8d));
        this.goalSelector.addGoal(11, new AvoidEntityGoal(this, EvilMilitaryEntity.class, 8.0f, 1.2d, 0.8d));
        this.goalSelector.addGoal(12, new AvoidEntityGoal(this, EvilSniperEntity.class, 8.0f, 1.2d, 0.8d));
        this.goalSelector.addGoal(13, new AvoidEntityGoal(this, PrisionermilitiaEntity.class, 8.0f, 1.2d, 0.8d));
        this.goalSelector.addGoal(14, new AvoidEntityGoal(this, PrisionerMilitiaMeleeEntity.class, 8.0f, 1.2d, 0.8d));
        this.goalSelector.addGoal(15, new AvoidEntityGoal(this, SlimelingEntity.class, 9.0f, 1.2d, 0.8d));
        this.goalSelector.addGoal(16, new MoveBackToVillageGoal(this, 0.6d, false));
        this.goalSelector.addGoal(17, new LookAtPlayerGoal(this, Player.class, 6.0f));
        this.goalSelector.addGoal(18, new LookAtPlayerGoal(this, MilitaryEntity.class, 6.0f));
        this.goalSelector.addGoal(19, new LookAtPlayerGoal(this, ScientistEntity.class, 6.0f));
        this.goalSelector.addGoal(20, new LookAtPlayerGoal(this, EvilScientistEntity.class, 6.0f));
        this.goalSelector.addGoal(21, new RandomStrollGoal(this, 0.6d));
        this.goalSelector.addGoal(22, new OpenDoorGoal(this, false));
        this.goalSelector.addGoal(23, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(24, new FloatGoal(this));
    }

    /* renamed from: net.mcreator.latexes.entity.CivilianMilitiaMeleeEntity$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/CivilianMilitiaMeleeEntity$1.class */
    class AnonymousClass1 extends NearestAttackableTargetGoal {
        AnonymousClass1(Mob arg0, Class arg1, boolean arg2, boolean arg3) {
            super(arg0, arg1, arg2, arg3);
        }

        public boolean canUse() {
            CivilianMilitiaMeleeEntity.this.getX();
            CivilianMilitiaMeleeEntity.this.getY();
            CivilianMilitiaMeleeEntity.this.getZ();
            Entity entity = CivilianMilitiaMeleeEntity.this;
            Level level = CivilianMilitiaMeleeEntity.this.level;
            return canUse() && CheckEvilProcedure.execute(entity);
        }

        public boolean canContinueToUse() {
            CivilianMilitiaMeleeEntity.this.getX();
            CivilianMilitiaMeleeEntity.this.getY();
            CivilianMilitiaMeleeEntity.this.getZ();
            Entity entity = CivilianMilitiaMeleeEntity.this;
            Level level = CivilianMilitiaMeleeEntity.this.level;
            return canContinueToUse() && CheckEvilProcedure.execute(entity);
        }
    }

    /* renamed from: net.mcreator.latexes.entity.CivilianMilitiaMeleeEntity$2  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/CivilianMilitiaMeleeEntity$2.class */
    class AnonymousClass2 extends MeleeAttackGoal {
        AnonymousClass2(PathfinderMob arg0, double arg1, boolean arg2) {
            super(arg0, arg1, arg2);
        }

        protected double getAttackReachSqr(LivingEntity entity) {
            return 4.0d + ((double) (entity.getBbWidth() * entity.getBbWidth()));
        }
    }

    public MobType getMobType() {
        return MobType.UNDEFINED;
    }

    public boolean removeWhenFarAway(double distanceToClosestPlayer) {
        return false;
    }

    public void playStepSound(BlockPos pos, BlockState blockIn) {
        playSound((SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.ambient")), 0.15f, 1.0f);
    }

    public SoundEvent getHurtSound(DamageSource ds) {
        return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.hurt"));
    }

    public SoundEvent getDeathSound() {
        return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.death"));
    }

    public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
        SpawnGroupData retval = finalizeSpawn(world, difficulty, reason, livingdata, tag);
        CivilianMilitiaMeleeOnInitialEntitySpawnProcedure.execute(this);
        return retval;
    }

    public static void init() {
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes().add(Attributes.MOVEMENT_SPEED, 0.25d).add(Attributes.MAX_HEALTH, 20.0d).add(Attributes.ARMOR, 0.0d).add(Attributes.ATTACK_DAMAGE, 2.0d).add(Attributes.FOLLOW_RANGE, 16.0d);
    }
}
