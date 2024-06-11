package net.mcreator.latexes.entity;

import javax.annotation.Nullable;
import net.mcreator.latexes.init.LatexModEntities;
import net.mcreator.latexes.init.LatexModItems;
import net.mcreator.latexes.procedures.CheckEvilProcedure;
import net.mcreator.latexes.procedures.CheckGoodProcedure;
import net.mcreator.latexes.procedures.MilitaryRiotOnInitialEntitySpawnProcedure;
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
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.OpenDoorGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.monster.Illusioner;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.Pillager;
import net.minecraft.world.entity.monster.Ravager;
import net.minecraft.world.entity.monster.SpellcasterIllager;
import net.minecraft.world.entity.monster.Vindicator;
import net.minecraft.world.entity.monster.piglin.Piglin;
import net.minecraft.world.entity.monster.piglin.PiglinBrute;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.registries.ForgeRegistries;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/MilitaryRiotEntity.class */
public class MilitaryRiotEntity extends PathfinderMob {
    public MilitaryRiotEntity(PlayMessages.SpawnEntity packet, Level world) {
        this((EntityType) LatexModEntities.MILITARY_RIOT.get(), world);
    }

    public MilitaryRiotEntity(EntityType<MilitaryRiotEntity> type, Level world) {
        super(type, world);
        this.xpReward = 6;
        setNoAi(false);
        setPersistenceRequired();
        setItemSlot(EquipmentSlot.MAINHAND, new ItemStack((ItemLike) LatexModItems.BATON.get()));
        setItemSlot(EquipmentSlot.HEAD, new ItemStack((ItemLike) LatexModItems.RIOTARMOR_HELMET.get()));
        setItemSlot(EquipmentSlot.CHEST, new ItemStack((ItemLike) LatexModItems.RIOTARMOR_CHESTPLATE.get()));
    }

    public Packet<?> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }

    protected void registerGoals() {
        registerGoals();
        this.targetSelector.addGoal(1, new HurtByTargetGoal(this, new Class[0]).setAlertOthers(new Class[0]));
        this.goalSelector.addGoal(2, new AnonymousClass1(this, 1.0d, false));
        this.goalSelector.addGoal(3, new OpenDoorGoal(this, true));
        this.goalSelector.addGoal(4, new RandomStrollGoal(this, 0.6d));
        this.goalSelector.addGoal(5, new AnonymousClass2(this, LivingEntity.class, 6.0f));
        this.goalSelector.addGoal(6, new LookAtPlayerGoal(this, Player.class, 5.0f));
        this.goalSelector.addGoal(7, new OpenDoorGoal(this, false));
        this.goalSelector.addGoal(8, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(9, new FloatGoal(this));
        this.targetSelector.addGoal(10, new NearestAttackableTargetGoal(this, Monster.class, true, false));
        this.targetSelector.addGoal(11, new AnonymousClass3(this, PathfinderMob.class, true, false));
        this.targetSelector.addGoal(12, new NearestAttackableTargetGoal(this, SlimelingEntity.class, true, false));
        this.targetSelector.addGoal(13, new AnonymousClass4(this, LivingEntity.class, true, false));
        this.targetSelector.addGoal(14, new NearestAttackableTargetGoal(this, Illusioner.class, true, false));
        this.targetSelector.addGoal(15, new NearestAttackableTargetGoal(this, Pillager.class, true, false));
        this.targetSelector.addGoal(16, new NearestAttackableTargetGoal(this, Ravager.class, true, false));
        this.targetSelector.addGoal(17, new NearestAttackableTargetGoal(this, SpellcasterIllager.class, true, false));
        this.targetSelector.addGoal(18, new NearestAttackableTargetGoal(this, Vindicator.class, true, false));
        this.targetSelector.addGoal(19, new NearestAttackableTargetGoal(this, Piglin.class, true, false));
        this.targetSelector.addGoal(20, new NearestAttackableTargetGoal(this, PiglinBrute.class, true, false));
        this.targetSelector.addGoal(21, new NearestAttackableTargetGoal(this, Monster.class, true, false));
    }

    /* renamed from: net.mcreator.latexes.entity.MilitaryRiotEntity$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/MilitaryRiotEntity$1.class */
    class AnonymousClass1 extends MeleeAttackGoal {
        AnonymousClass1(PathfinderMob arg0, double arg1, boolean arg2) {
            super(arg0, arg1, arg2);
        }

        protected double getAttackReachSqr(LivingEntity entity) {
            return 4.0d + ((double) (entity.getBbWidth() * entity.getBbWidth()));
        }
    }

    /* renamed from: net.mcreator.latexes.entity.MilitaryRiotEntity$2  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/MilitaryRiotEntity$2.class */
    class AnonymousClass2 extends LookAtPlayerGoal {
        AnonymousClass2(Mob arg0, Class cls, float arg2) {
            super(arg0, cls, arg2);
        }

        public boolean canUse() {
            MilitaryRiotEntity.this.getX();
            MilitaryRiotEntity.this.getY();
            MilitaryRiotEntity.this.getZ();
            Entity entity = MilitaryRiotEntity.this;
            Level level = MilitaryRiotEntity.this.level;
            return canUse() && CheckGoodProcedure.execute(entity);
        }
    }

    /* renamed from: net.mcreator.latexes.entity.MilitaryRiotEntity$3  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/MilitaryRiotEntity$3.class */
    class AnonymousClass3 extends NearestAttackableTargetGoal {
        AnonymousClass3(Mob arg0, Class arg1, boolean arg2, boolean arg3) {
            super(arg0, arg1, arg2, arg3);
        }

        public boolean canUse() {
            MilitaryRiotEntity.this.getX();
            MilitaryRiotEntity.this.getY();
            MilitaryRiotEntity.this.getZ();
            Entity entity = MilitaryRiotEntity.this;
            Level level = MilitaryRiotEntity.this.level;
            return canUse() && CheckEvilProcedure.execute(entity);
        }

        public boolean canContinueToUse() {
            MilitaryRiotEntity.this.getX();
            MilitaryRiotEntity.this.getY();
            MilitaryRiotEntity.this.getZ();
            Entity entity = MilitaryRiotEntity.this;
            Level level = MilitaryRiotEntity.this.level;
            return canContinueToUse() && CheckEvilProcedure.execute(entity);
        }
    }

    /* renamed from: net.mcreator.latexes.entity.MilitaryRiotEntity$4  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/MilitaryRiotEntity$4.class */
    class AnonymousClass4 extends NearestAttackableTargetGoal {
        AnonymousClass4(Mob arg0, Class arg1, boolean arg2, boolean arg3) {
            super(arg0, arg1, arg2, arg3);
        }

        public boolean canUse() {
            MilitaryRiotEntity.this.getX();
            MilitaryRiotEntity.this.getY();
            MilitaryRiotEntity.this.getZ();
            Entity entity = MilitaryRiotEntity.this;
            Level level = MilitaryRiotEntity.this.level;
            return canUse() && CheckEvilProcedure.execute(entity);
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

    public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
        SpawnGroupData retval = finalizeSpawn(world, difficulty, reason, livingdata, tag);
        MilitaryRiotOnInitialEntitySpawnProcedure.execute(this);
        return retval;
    }

    public static void init() {
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes().add(Attributes.MOVEMENT_SPEED, 0.25d).add(Attributes.MAX_HEALTH, 20.0d).add(Attributes.ARMOR, 1.5d).add(Attributes.ATTACK_DAMAGE, 3.0d).add(Attributes.FOLLOW_RANGE, 16.0d).add(Attributes.KNOCKBACK_RESISTANCE, 0.6d).add(Attributes.ATTACK_KNOCKBACK, 0.2d);
    }
}
