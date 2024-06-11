package net.mcreator.latexes.entity;

import javax.annotation.Nullable;
import net.mcreator.latexes.init.LatexModEntities;
import net.mcreator.latexes.init.LatexModItems;
import net.mcreator.latexes.procedures.CheckGoodProcedure;
import net.mcreator.latexes.procedures.CivilianMilitiaMeleeOnInitialEntitySpawnProcedure;
import net.mcreator.latexes.procedures.TargethasabatonProcedure;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.Packet;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.damagesource.DamageSource;
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
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.registries.ForgeRegistries;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/PrisionerMilitiaMeleeEntity.class */
public class PrisionerMilitiaMeleeEntity extends PathfinderMob {
    public PrisionerMilitiaMeleeEntity(PlayMessages.SpawnEntity packet, Level world) {
        this((EntityType) LatexModEntities.PRISIONER_MILITIA_MELEE.get(), world);
    }

    public PrisionerMilitiaMeleeEntity(EntityType<PrisionerMilitiaMeleeEntity> type, Level world) {
        super(type, world);
        this.xpReward = 0;
        setNoAi(false);
        setPersistenceRequired();
        setItemSlot(EquipmentSlot.MAINHAND, new ItemStack((ItemLike) LatexModItems.MATCH_LOCK_MUSKET.get()));
    }

    public Packet<?> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }

    protected void registerGoals() {
        registerGoals();
        this.targetSelector.addGoal(1, new NearestAttackableTargetGoal(this, Monster.class, true, false));
        this.targetSelector.addGoal(2, new AnonymousClass1(this, PathfinderMob.class, true, false));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, MilitaryEntity.class, true, false));
        this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, MilitaryflameunitEntity.class, true, false));
        this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, MilitaryRiotEntity.class, true, false));
        this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, CivilianMilitiaMeleeEntity.class, true, false));
        this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, CivlianMilitiaEntity.class, true, false));
        this.targetSelector.addGoal(8, new AnonymousClass2(this, new Class[0]));
        this.goalSelector.addGoal(9, new AnonymousClass3(this, 1.0d, false));
        this.goalSelector.addGoal(10, new OpenDoorGoal(this, true));
        this.goalSelector.addGoal(11, new MoveBackToVillageGoal(this, 0.6d, false));
        this.goalSelector.addGoal(12, new AvoidEntityGoal(this, Monster.class, 7.0f, 1.5d, 0.8d));
        this.goalSelector.addGoal(13, new LookAtPlayerGoal(this, Player.class, 5.0f));
        this.goalSelector.addGoal(14, new LookAtPlayerGoal(this, EvilScientistEntity.class, 6.0f));
        this.goalSelector.addGoal(15, new LookAtPlayerGoal(this, EvilMilitaryEntity.class, 6.0f));
        this.goalSelector.addGoal(16, new LookAtPlayerGoal(this, LivingEntity.class, 4.0f));
        this.goalSelector.addGoal(17, new RandomStrollGoal(this, 0.6d));
        this.goalSelector.addGoal(18, new OpenDoorGoal(this, false));
        this.goalSelector.addGoal(19, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(20, new FloatGoal(this));
    }

    /* renamed from: net.mcreator.latexes.entity.PrisionerMilitiaMeleeEntity$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/PrisionerMilitiaMeleeEntity$1.class */
    class AnonymousClass1 extends NearestAttackableTargetGoal {
        AnonymousClass1(Mob arg0, Class arg1, boolean arg2, boolean arg3) {
            super(arg0, arg1, arg2, arg3);
        }

        public boolean canUse() {
            PrisionerMilitiaMeleeEntity.this.getX();
            PrisionerMilitiaMeleeEntity.this.getY();
            PrisionerMilitiaMeleeEntity.this.getZ();
            Entity entity = PrisionerMilitiaMeleeEntity.this;
            Level level = PrisionerMilitiaMeleeEntity.this.level;
            return canUse() && CheckGoodProcedure.execute(entity);
        }

        public boolean canContinueToUse() {
            PrisionerMilitiaMeleeEntity.this.getX();
            PrisionerMilitiaMeleeEntity.this.getY();
            PrisionerMilitiaMeleeEntity.this.getZ();
            Entity entity = PrisionerMilitiaMeleeEntity.this;
            Level level = PrisionerMilitiaMeleeEntity.this.level;
            return canContinueToUse() && CheckGoodProcedure.execute(entity);
        }
    }

    /* renamed from: net.mcreator.latexes.entity.PrisionerMilitiaMeleeEntity$2  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/PrisionerMilitiaMeleeEntity$2.class */
    class AnonymousClass2 extends HurtByTargetGoal {
        AnonymousClass2(PathfinderMob arg0, Class... clsArr) {
            super(arg0, clsArr);
        }

        public boolean canUse() {
            PrisionerMilitiaMeleeEntity.this.getX();
            PrisionerMilitiaMeleeEntity.this.getY();
            PrisionerMilitiaMeleeEntity.this.getZ();
            Entity entity = PrisionerMilitiaMeleeEntity.this;
            Level level = PrisionerMilitiaMeleeEntity.this.level;
            return canUse() && TargethasabatonProcedure.execute(entity);
        }
    }

    /* renamed from: net.mcreator.latexes.entity.PrisionerMilitiaMeleeEntity$3  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/PrisionerMilitiaMeleeEntity$3.class */
    class AnonymousClass3 extends MeleeAttackGoal {
        AnonymousClass3(PathfinderMob arg0, double arg1, boolean arg2) {
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
        playSound((SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.vindicator.ambient")), 0.15f, 1.0f);
    }

    public SoundEvent getHurtSound(DamageSource ds) {
        return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.vindicator.hurt"));
    }

    public SoundEvent getDeathSound() {
        return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.vindicator.death"));
    }

    public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
        SpawnGroupData retval = finalizeSpawn(world, difficulty, reason, livingdata, tag);
        CivilianMilitiaMeleeOnInitialEntitySpawnProcedure.execute(this);
        return retval;
    }

    public static void init() {
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes().add(Attributes.MOVEMENT_SPEED, 0.25d).add(Attributes.MAX_HEALTH, 20.0d).add(Attributes.ARMOR, 0.0d).add(Attributes.ATTACK_DAMAGE, 1.0d).add(Attributes.FOLLOW_RANGE, 16.0d);
    }
}
