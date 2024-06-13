package net.ltxprogrammer.turned.entity;

import net.ltxprogrammer.turned.init.LatexModEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.network.protocol.Packet;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.AvoidEntityGoal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.MoveBackToVillageGoal;
import net.minecraft.world.entity.ai.goal.OpenDoorGoal;
import net.minecraft.world.entity.ai.goal.PanicGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.NotNull;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/entity/CivilianEntity.class */
public class CivilianEntity extends PathfinderMob {
    public CivilianEntity(PlayMessages.SpawnEntity packet, Level world) {
        this(LatexModEntities.CIVILIAN.get(), world);
    }

    public CivilianEntity(EntityType<CivilianEntity> type, Level world) {
        super(type, world);
        this.xpReward = 0;
        setNoAi(false);
        setPersistenceRequired();
    }

    public @NotNull Packet<?> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }

    protected void registerGoals() {
        registerGoals();
        this.targetSelector.addGoal(1, new HurtByTargetGoal(this).setAlertOthers());
        this.goalSelector.addGoal(2, new PanicGoal(this, 1.2d));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, Monster.class, true, false));
        this.goalSelector.addGoal(4, new OpenDoorGoal(this, true));
        this.goalSelector.addGoal(5, new AvoidEntityGoal<>(this, Monster.class, 9.0f, 1.2d, 0.8d));
        this.goalSelector.addGoal(6, new AvoidEntityGoal<>(this, EvilMilitaryEntity.class, 8.0f, 1.2d, 0.8d));
        this.goalSelector.addGoal(7, new AvoidEntityGoal<>(this, EvilSniperEntity.class, 8.0f, 1.2d, 0.8d));
        this.goalSelector.addGoal(8, new AvoidEntityGoal<>(this, SlimelingEntity.class, 9.0f, 1.2d, 0.8d));
        this.goalSelector.addGoal(9, new MoveBackToVillageGoal(this, 0.6d, false));
        this.goalSelector.addGoal(10, new LookAtPlayerGoal(this, Player.class, 6.0f));
        this.goalSelector.addGoal(11, new LookAtPlayerGoal(this, MilitaryEntity.class, 6.0f));
        this.goalSelector.addGoal(12, new LookAtPlayerGoal(this, ScientistEntity.class, 6.0f));
        this.goalSelector.addGoal(13, new LookAtPlayerGoal(this, EvilScientistEntity.class, 6.0f));
        this.goalSelector.addGoal(14, new RandomStrollGoal(this, 0.6d));
        this.goalSelector.addGoal(15, new OpenDoorGoal(this, false));
        this.goalSelector.addGoal(16, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(17, new FloatGoal(this));
    }

    public boolean removeWhenFarAway(double distanceToClosestPlayer) {
        return false;
    }

    public void playStepSound(@NotNull BlockPos pos, @NotNull BlockState blockIn) {
        playSound(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.ambient")), 0.15f, 1.0f);
    }

    public SoundEvent getHurtSound(@NotNull DamageSource ds) {
        return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.hurt"));
    }

    public SoundEvent getDeathSound() {
        return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.death"));
    }

    public static void init() {
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes().add(Attributes.MOVEMENT_SPEED, 0.25d).add(Attributes.MAX_HEALTH, 20.0d).add(Attributes.ARMOR, 0.0d).add(Attributes.ATTACK_DAMAGE, 1.0d).add(Attributes.FOLLOW_RANGE, 12.0d);
    }
}
