//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.ltxprogrammer.turned.entity;

import net.ltxprogrammer.turned.init.LatexModEntities;
import net.ltxprogrammer.turned.init.LatexModItems;
import net.ltxprogrammer.turned.procedures.TargethasabatonProcedure;
import net.minecraft.core.BlockPos;
import net.minecraft.network.protocol.Packet;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.PathfinderMob;
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
import net.minecraft.world.entity.ai.goal.TemptGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.registries.ForgeRegistries;

public class PrisionerEntity extends PathfinderMob {
    public PrisionerEntity(PlayMessages.SpawnEntity packet, Level world) {
        this((EntityType)LatexModEntities.PRISIONER.get(), world);
    }

    public PrisionerEntity(EntityType<PrisionerEntity> type, Level world) {
        super(type, world);
        this.xpReward = 0;
        this.setNoAi(false);
        this.setPersistenceRequired();
    }

    public Packet<?> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }

    protected void registerGoals() {
        super.registerGoals();
        this.targetSelector.addGoal(1, new HurtByTargetGoal(this, new Class[0]) {
            public boolean canUse() {
                double x = PrisionerEntity.this.getX();
                double y = PrisionerEntity.this.getY();
                double z = PrisionerEntity.this.getZ();
                Entity entity = PrisionerEntity.this;
                Level world = PrisionerEntity.this.level;
                return super.canUse() && TargethasabatonProcedure.execute(entity);
            }
        });
        this.goalSelector.addGoal(2, new MeleeAttackGoal(this, 1.2, false) {
            protected double getAttackReachSqr(LivingEntity entity) {
                return 4.0 + (double)(entity.getBbWidth() * entity.getBbWidth());
            }
        });
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, Monster.class, true, true));
        this.goalSelector.addGoal(4, new OpenDoorGoal(this, true));
        this.goalSelector.addGoal(5, new MoveBackToVillageGoal(this, 0.6, false));
        this.goalSelector.addGoal(6, new AvoidEntityGoal(this, Monster.class, 7.0F, 1.5, 0.8));
        this.goalSelector.addGoal(7, new TemptGoal(this, 0.8, Ingredient.of(new ItemLike[]{(ItemLike)LatexModItems.BATON.get()}), false));
        this.goalSelector.addGoal(8, new LookAtPlayerGoal(this, Player.class, 5.0F));
        this.goalSelector.addGoal(9, new LookAtPlayerGoal(this, MilitaryEntity.class, 6.0F));
        this.goalSelector.addGoal(10, new LookAtPlayerGoal(this, MilitaryRiotEntity.class, 6.0F));
        this.goalSelector.addGoal(11, new LookAtPlayerGoal(this, ScientistEntity.class, 6.0F));
        this.goalSelector.addGoal(12, new LookAtPlayerGoal(this, EvilScientistEntity.class, 6.0F));
        this.goalSelector.addGoal(13, new LookAtPlayerGoal(this, EvilMilitaryEntity.class, 6.0F));
        this.goalSelector.addGoal(14, new LookAtPlayerGoal(this, LivingEntity.class, 4.0F));
        this.goalSelector.addGoal(15, new RandomStrollGoal(this, 0.6));
        this.goalSelector.addGoal(16, new OpenDoorGoal(this, false));
        this.goalSelector.addGoal(17, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(18, new FloatGoal(this));
    }

    public MobType getMobType() {
        return MobType.UNDEFINED;
    }

    public boolean removeWhenFarAway(double distanceToClosestPlayer) {
        return false;
    }

    public void playStepSound(BlockPos pos, BlockState blockIn) {
        this.playSound((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.vindicator.ambient")), 0.15F, 1.0F);
    }

    public SoundEvent getHurtSound(DamageSource ds) {
        return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.vindicator.hurt"));
    }

    public SoundEvent getDeathSound() {
        return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.vindicator.death"));
    }

    public static void init() {
    }

    public static AttributeSupplier.Builder createAttributes() {
        AttributeSupplier.Builder builder = Mob.createMobAttributes();
        builder = builder.add(Attributes.MOVEMENT_SPEED, 0.25);
        builder = builder.add(Attributes.MAX_HEALTH, 20.0);
        builder = builder.add(Attributes.ARMOR, 0.0);
        builder = builder.add(Attributes.ATTACK_DAMAGE, 1.0);
        builder = builder.add(Attributes.FOLLOW_RANGE, 12.0);
        return builder;
    }
}
