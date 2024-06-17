//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

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

public class MilitaryRiotEntity extends PathfinderMob {
    public MilitaryRiotEntity(PlayMessages.SpawnEntity packet, Level world) {
        this((EntityType)LatexModEntities.MILITARY_RIOT.get(), world);
    }

    public MilitaryRiotEntity(EntityType<MilitaryRiotEntity> type, Level world) {
        super(type, world);
        this.xpReward = 6;
        this.setNoAi(false);
        this.setPersistenceRequired();
        this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack((ItemLike)LatexModItems.BATON.get()));
        this.setItemSlot(EquipmentSlot.HEAD, new ItemStack((ItemLike)LatexModItems.RIOTARMOR_HELMET.get()));
        this.setItemSlot(EquipmentSlot.CHEST, new ItemStack((ItemLike)LatexModItems.RIOTARMOR_CHESTPLATE.get()));
    }

    public Packet<?> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }

    protected void registerGoals() {
        super.registerGoals();
        this.targetSelector.addGoal(1, (new HurtByTargetGoal(this, new Class[0])).setAlertOthers(new Class[0]));
        this.goalSelector.addGoal(2, new MeleeAttackGoal(this, 1.0, false) {
            protected double getAttackReachSqr(LivingEntity entity) {
                return 4.0 + (double)(entity.getBbWidth() * entity.getBbWidth());
            }
        });
        this.goalSelector.addGoal(3, new OpenDoorGoal(this, true));
        this.goalSelector.addGoal(4, new RandomStrollGoal(this, 0.6));
        this.goalSelector.addGoal(5, new LookAtPlayerGoal(this, LivingEntity.class, 6.0F) {
            public boolean canUse() {
                double x = MilitaryRiotEntity.this.getX();
                double y = MilitaryRiotEntity.this.getY();
                double z = MilitaryRiotEntity.this.getZ();
                Entity entity = MilitaryRiotEntity.this;
                Level world = MilitaryRiotEntity.this.level;
                return super.canUse() && CheckGoodProcedure.execute(entity);
            }
        });
        this.goalSelector.addGoal(6, new LookAtPlayerGoal(this, Player.class, 5.0F));
        this.goalSelector.addGoal(7, new OpenDoorGoal(this, false));
        this.goalSelector.addGoal(8, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(9, new FloatGoal(this));
        this.targetSelector.addGoal(10, new NearestAttackableTargetGoal(this, Monster.class, true, false));
        this.targetSelector.addGoal(11, new NearestAttackableTargetGoal(this, PathfinderMob.class, true, false) {
            public boolean canUse() {
                double x = MilitaryRiotEntity.this.getX();
                double y = MilitaryRiotEntity.this.getY();
                double z = MilitaryRiotEntity.this.getZ();
                Entity entity = MilitaryRiotEntity.this;
                Level world = MilitaryRiotEntity.this.level;
                return super.canUse() && CheckEvilProcedure.execute(entity);
            }

            public boolean canContinueToUse() {
                double x = MilitaryRiotEntity.this.getX();
                double y = MilitaryRiotEntity.this.getY();
                double z = MilitaryRiotEntity.this.getZ();
                Entity entity = MilitaryRiotEntity.this;
                Level world = MilitaryRiotEntity.this.level;
                return super.canContinueToUse() && CheckEvilProcedure.execute(entity);
            }
        });
        this.targetSelector.addGoal(12, new NearestAttackableTargetGoal(this, SlimelingEntity.class, true, false));
        this.targetSelector.addGoal(13, new NearestAttackableTargetGoal(this, LivingEntity.class, true, false) {
            public boolean canUse() {
                double x = MilitaryRiotEntity.this.getX();
                double y = MilitaryRiotEntity.this.getY();
                double z = MilitaryRiotEntity.this.getZ();
                Entity entity = MilitaryRiotEntity.this;
                Level world = MilitaryRiotEntity.this.level;
                return super.canUse() && CheckEvilProcedure.execute(entity);
            }
        });
        this.targetSelector.addGoal(14, new NearestAttackableTargetGoal(this, Illusioner.class, true, false));
        this.targetSelector.addGoal(15, new NearestAttackableTargetGoal(this, Pillager.class, true, false));
        this.targetSelector.addGoal(16, new NearestAttackableTargetGoal(this, Ravager.class, true, false));
        this.targetSelector.addGoal(17, new NearestAttackableTargetGoal(this, SpellcasterIllager.class, true, false));
        this.targetSelector.addGoal(18, new NearestAttackableTargetGoal(this, Vindicator.class, true, false));
        this.targetSelector.addGoal(19, new NearestAttackableTargetGoal(this, Piglin.class, true, false));
        this.targetSelector.addGoal(20, new NearestAttackableTargetGoal(this, PiglinBrute.class, true, false));
        this.targetSelector.addGoal(21, new NearestAttackableTargetGoal(this, Monster.class, true, false));
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

    public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
        SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata, tag);
        MilitaryRiotOnInitialEntitySpawnProcedure.execute(this);
        return retval;
    }

    public static void init() {
    }

    public static AttributeSupplier.Builder createAttributes() {
        AttributeSupplier.Builder builder = Mob.createMobAttributes();
        builder = builder.add(Attributes.MOVEMENT_SPEED, 0.25);
        builder = builder.add(Attributes.MAX_HEALTH, 20.0);
        builder = builder.add(Attributes.ARMOR, 1.5);
        builder = builder.add(Attributes.ATTACK_DAMAGE, 3.0);
        builder = builder.add(Attributes.FOLLOW_RANGE, 16.0);
        builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 0.6);
        builder = builder.add(Attributes.ATTACK_KNOCKBACK, 0.2);
        return builder;
    }
}
