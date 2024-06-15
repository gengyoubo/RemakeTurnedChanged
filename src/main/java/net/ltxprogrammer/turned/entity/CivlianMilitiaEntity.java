//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.ltxprogrammer.turned.entity;

import javax.annotation.Nullable;
import net.ltxprogrammer.turned.entity.ai.TargetCheck;
import net.ltxprogrammer.turned.init.LatexModEntities;
import net.ltxprogrammer.turned.init.LatexModItems;
import net.ltxprogrammer.turned.procedures.CivlianMilitiaOnInitialEntitySpawnProcedure;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.Packet;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.damagesource.DamageSource;
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
import net.minecraft.world.entity.ai.goal.RangedAttackGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.RangedAttackMob;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.registries.ForgeRegistries;

public class CivlianMilitiaEntity extends PathfinderMob implements RangedAttackMob {
    public CivlianMilitiaEntity(PlayMessages.SpawnEntity packet, Level world) {
        this((EntityType)LatexModEntities.CIVLIAN_MILITIA.get(), world);
    }

    public CivlianMilitiaEntity(EntityType<CivlianMilitiaEntity> type, Level world) {
        super(type, world);
        this.xpReward = 0;
        this.setNoAi(false);
        this.setPersistenceRequired();
        this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack((ItemLike)LatexModItems.SCRAP_M_16_RIFLE.get()));
    }

    public Packet<?> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }

    protected void registerGoals() {
        super.registerGoals();
        this.targetSelector.addGoal(1, new NearestAttackableTargetGoal(this, Monster.class, true, false));
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal(this, PathfinderMob.class, 10, true, false, TargetCheck.IS_EVIL));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, EvilMilitaryEntity.class, true, false));
        this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, EvilSniperEntity.class, true, false));
        this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, PrisionermilitiaEntity.class, true, false));
        this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, PrisionerMilitiaMeleeEntity.class, true, false));
        this.goalSelector.addGoal(7, new MeleeAttackGoal(this, 1.0, false) {
            protected double getAttackReachSqr(LivingEntity entity) {
                return 4.0 + (double)(entity.getBbWidth() * entity.getBbWidth());
            }
        });
        this.targetSelector.addGoal(8, (new HurtByTargetGoal(this, new Class[0])).setAlertOthers(new Class[0]));
        this.goalSelector.addGoal(9, new OpenDoorGoal(this, true));
        this.goalSelector.addGoal(10, new AvoidEntityGoal(this, Monster.class, 9.0F, 1.2, 0.8));
        this.goalSelector.addGoal(11, new AvoidEntityGoal(this, EvilMilitaryEntity.class, 8.0F, 1.2, 0.8));
        this.goalSelector.addGoal(12, new AvoidEntityGoal(this, EvilSniperEntity.class, 8.0F, 1.2, 0.8));
        this.goalSelector.addGoal(13, new AvoidEntityGoal(this, PrisionermilitiaEntity.class, 8.0F, 1.2, 0.8));
        this.goalSelector.addGoal(14, new AvoidEntityGoal(this, PrisionerMilitiaMeleeEntity.class, 8.0F, 1.2, 0.8));
        this.goalSelector.addGoal(15, new AvoidEntityGoal(this, SlimelingEntity.class, 9.0F, 1.2, 0.8));
        this.goalSelector.addGoal(16, new MoveBackToVillageGoal(this, 0.6, false));
        this.goalSelector.addGoal(17, new LookAtPlayerGoal(this, Player.class, 6.0F));
        this.goalSelector.addGoal(18, new LookAtPlayerGoal(this, MilitaryEntity.class, 6.0F));
        this.goalSelector.addGoal(19, new LookAtPlayerGoal(this, ScientistEntity.class, 6.0F));
        this.goalSelector.addGoal(20, new LookAtPlayerGoal(this, EvilScientistEntity.class, 6.0F));
        this.goalSelector.addGoal(21, new RandomStrollGoal(this, 0.6));
        this.goalSelector.addGoal(22, new OpenDoorGoal(this, false));
        this.goalSelector.addGoal(23, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(24, new FloatGoal(this));
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

    public void playStepSound(BlockPos pos, BlockState blockIn) {
        this.playSound((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.ambient")), 0.15F, 1.0F);
    }

    public SoundEvent getHurtSound(DamageSource ds) {
        return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.hurt"));
    }

    public SoundEvent getDeathSound() {
        return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.death"));
    }

    public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
        SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata, tag);
        CivlianMilitiaOnInitialEntitySpawnProcedure.execute(world, this.getX(), this.getY(), this.getZ(), this);
        return retval;
    }

    public void performRangedAttack(LivingEntity target, float flval) {
        ScrapM16RifleEntity.shoot(this, target);
    }

    public static void init() {
    }

    public static AttributeSupplier.Builder createAttributes() {
        AttributeSupplier.Builder builder = Mob.createMobAttributes();
        builder = builder.add(Attributes.MOVEMENT_SPEED, 0.25);
        builder = builder.add(Attributes.MAX_HEALTH, 20.0);
        builder = builder.add(Attributes.ARMOR, 0.0);
        builder = builder.add(Attributes.ATTACK_DAMAGE, 1.0);
        builder = builder.add(Attributes.FOLLOW_RANGE, 16.0);
        return builder;
    }
}
