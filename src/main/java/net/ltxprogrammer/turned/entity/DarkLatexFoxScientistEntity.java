package net.ltxprogrammer.turned.entity;

import net.ltxprogrammer.changed.entity.beast.AbstractDarkLatexEntity;
import net.ltxprogrammer.changed.init.ChangedItems;
import net.ltxprogrammer.changed.init.ChangedParticles;
import net.ltxprogrammer.turned.entity.p000ai.TargetCheck;
import net.ltxprogrammer.turned.init.LatexModEntities;
import net.ltxprogrammer.turned.procedures.DarkLatexFoxThisEntityKillsAnotherOneProcedure;
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
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.BreakDoorGoal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.animal.IronGolem;
import net.minecraft.world.entity.monster.Evoker;
import net.minecraft.world.entity.monster.Guardian;
import net.minecraft.world.entity.monster.Pillager;
import net.minecraft.world.entity.monster.Vindicator;
import net.minecraft.world.entity.monster.Witch;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.monster.ZombieVillager;
import net.minecraft.world.entity.monster.piglin.Piglin;
import net.minecraft.world.entity.monster.piglin.PiglinBrute;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.npc.WanderingTrader;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.registries.ForgeRegistries;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/entity/DarkLatexFoxScientistEntity.class */
public class DarkLatexFoxScientistEntity extends AbstractDarkLatexEntity {
    public DarkLatexFoxScientistEntity(PlayMessages.SpawnEntity packet, Level world) {
        this((EntityType) LatexModEntities.DARK_LATEX_FOX_SCIENTIST.get(), world);
    }

    public DarkLatexFoxScientistEntity(EntityType<DarkLatexFoxScientistEntity> type, Level world) {
        super(type, world);
        this.xpReward = 6;
        setNoAi(false);
    }

    public Packet<?> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }

    protected void registerGoals() {
        registerGoals();
        this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.1d, false) { // from class: net.ltxprogrammer.turned.entity.DarkLatexFoxScientistEntity.1
            protected double getAttackReachSqr(LivingEntity entity) {
                return 4.0d + ((double) (entity.getBbWidth() * entity.getBbWidth()));
            }
        });
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal(this, LivingEntity.class, 10, false, true, TargetCheck.IS_SLIMELING));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, LivingEntity.class, 10, false, true, TargetCheck.IS_GOOD));
        this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, LivingEntity.class, 10, false, true, TargetCheck.IS_EVIL));
        this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, Player.class, true, false));
        this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, Villager.class, true, false));
        this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, WanderingTrader.class, true, false));
        this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, IronGolem.class, false, false));
        this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, Witch.class, true, false));
        this.targetSelector.addGoal(10, new NearestAttackableTargetGoal(this, Pillager.class, true, false));
        this.targetSelector.addGoal(11, new NearestAttackableTargetGoal(this, Vindicator.class, true, false));
        this.targetSelector.addGoal(12, new NearestAttackableTargetGoal(this, Evoker.class, true, false));
        this.targetSelector.addGoal(13, new NearestAttackableTargetGoal(this, Guardian.class, true, false));
        this.targetSelector.addGoal(14, new NearestAttackableTargetGoal(this, Zombie.class, true, false));
        this.targetSelector.addGoal(15, new NearestAttackableTargetGoal(this, ZombieVillager.class, true, false));
        this.targetSelector.addGoal(16, new NearestAttackableTargetGoal(this, Piglin.class, true, false));
        this.targetSelector.addGoal(17, new NearestAttackableTargetGoal(this, PiglinBrute.class, true, false));
        this.goalSelector.addGoal(18, new BreakDoorGoal(this, e -> {
            return true;
        }));
        this.goalSelector.addGoal(19, new RandomStrollGoal(this, 0.8d));
        this.targetSelector.addGoal(20, new HurtByTargetGoal(this, new Class[0]).setAlertOthers(new Class[0]));
        this.goalSelector.addGoal(21, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(22, new FloatGoal(this));
    }

    public MobType getMobType() {
        return MobType.ARTHROPOD;
    }

    protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHitIn) {
        dropCustomDeathLoot(source, looting, recentlyHitIn);
        spawnAtLocation(new ItemStack((ItemLike) ChangedItems.DARK_LATEX_GOO.get()));
    }

    public void playStepSound(BlockPos pos, BlockState blockIn) {
        playSound((SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.squish")), 0.15f, 1.0f);
    }

    public SoundEvent getHurtSound(DamageSource ds) {
        return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.hurt"));
    }

    public SoundEvent getDeathSound() {
        return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.death"));
    }

    public boolean hurt(DamageSource source, float amount) {
        if (source == DamageSource.FALL || source == DamageSource.CACTUS || source == DamageSource.WITHER || source.getMsgId().equals("witherSkull")) {
            return false;
        }
        return hurt(source, amount);
    }

    public void awardKillScore(Entity entity, int score, DamageSource damageSource) {
        awardKillScore(entity, score, damageSource);
        DarkLatexFoxThisEntityKillsAnotherOneProcedure.execute(this.level, getX(), getY(), getZ(), entity);
    }

    public static void init() {
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes().add(Attributes.MOVEMENT_SPEED, 0.4d).add(Attributes.MAX_HEALTH, 18.0d).add(Attributes.ARMOR, 0.0d).add(Attributes.ATTACK_DAMAGE, 4.0d).add(Attributes.FOLLOW_RANGE, 16.0d).add(Attributes.KNOCKBACK_RESISTANCE, 0.3d);
    }

    public ChangedParticles.Color3 getDripColor() {
        return ChangedParticles.Color3.DARK;
    }
}
