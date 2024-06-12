package net.ltxprogrammer.turned.entity;

import net.ltxprogrammer.changed.init.ChangedBlocks;
import net.ltxprogrammer.turned.entity.p000ai.TargetCheck;
import net.ltxprogrammer.turned.init.LatexModBlocks;
import net.ltxprogrammer.turned.init.LatexModEntities;
import net.ltxprogrammer.turned.procedures.TSCHunterEntityDiesProcedure;
import net.ltxprogrammer.turned.procedures.TSCHunterThisEntityKillsAnotherOneProcedure;
import net.minecraft.core.BlockPos;
import net.minecraft.network.protocol.Packet;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.AreaEffectCloud;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.OpenDoorGoal;
import net.minecraft.world.entity.ai.goal.RemoveBlockGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.projectile.ThrownPotion;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.registries.ForgeRegistries;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/entity/TSCHunterEntity.class */
public class TSCHunterEntity extends AbstractTSCEntity {
    public TSCHunterEntity(PlayMessages.SpawnEntity packet, Level world) {
        this((EntityType) LatexModEntities.TSC_HUNTER.get(), world);
    }

    public TSCHunterEntity(EntityType<TSCHunterEntity> type, Level world) {
        super(type, world);
        this.xpReward = 0;
        setNoAi(false);
        setPersistenceRequired();
    }

    @Override // net.ltxprogrammer.turned.entity.AbstractTSCEntity
    public Packet<?> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }

    @Override // net.ltxprogrammer.turned.entity.AbstractTSCEntity
    protected void registerGoals() {
        registerGoals();
        this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.2d, false) { // from class: net.ltxprogrammer.turned.entity.TSCHunterEntity.1
            protected double getAttackReachSqr(LivingEntity entity) {
                return 4.0d + ((double) (entity.getBbWidth() * entity.getBbWidth()));
            }
        });
        this.targetSelector.addGoal(2, new HurtByTargetGoal(this, new Class[0]).setAlertOthers(new Class[0]));
        this.goalSelector.addGoal(3, new OpenDoorGoal(this, true));
        this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, Mob.class, 10, true, false, TargetCheck.IS_GOOD));
        this.goalSelector.addGoal(12, new RemoveBlockGoal((Block) ChangedBlocks.DARK_LATEX_BLOCK.get(), this, 1.0d, 3));
        this.goalSelector.addGoal(15, new RemoveBlockGoal((Block) LatexModBlocks.DARKLATEXHIVE.get(), this, 1.0d, 3));
    }

    @Override // net.ltxprogrammer.turned.entity.AbstractTSCEntity
    public MobType getMobType() {
        return MobType.UNDEFINED;
    }

    @Override // net.ltxprogrammer.turned.entity.AbstractTSCEntity
    public boolean removeWhenFarAway(double distanceToClosestPlayer) {
        return false;
    }

    @Override // net.ltxprogrammer.turned.entity.AbstractTSCEntity
    protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHitIn) {
        dropCustomDeathLoot(source, looting, recentlyHitIn);
        spawnAtLocation(new ItemStack(Items.IRON_INGOT));
    }

    @Override // net.ltxprogrammer.turned.entity.AbstractTSCEntity
    public void playStepSound(BlockPos pos, BlockState blockIn) {
        playSound((SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.iron_golem.step")), 0.15f, 1.0f);
    }

    @Override // net.ltxprogrammer.turned.entity.AbstractTSCEntity
    public SoundEvent getHurtSound(DamageSource ds) {
        return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.metal.hit"));
    }

    @Override // net.ltxprogrammer.turned.entity.AbstractTSCEntity
    public SoundEvent getDeathSound() {
        return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:death_beep"));
    }

    @Override // net.ltxprogrammer.turned.entity.AbstractTSCEntity
    public boolean hurt(DamageSource source, float amount) {
        if ((source.getDirectEntity() instanceof ThrownPotion) || (source.getDirectEntity() instanceof AreaEffectCloud) || source == DamageSource.DROWN || source == DamageSource.DRAGON_BREATH || source == DamageSource.WITHER || source.getMsgId().equals("witherSkull")) {
            return false;
        }
        return hurt(source, amount);
    }

    public void die(DamageSource source) {
        die(source);
        TSCHunterEntityDiesProcedure.execute(this.level, getX(), getY(), getZ());
    }

    public void awardKillScore(Entity entity, int score, DamageSource damageSource) {
        awardKillScore(entity, score, damageSource);
        TSCHunterThisEntityKillsAnotherOneProcedure.execute(this.level, getX(), getY(), getZ(), entity, this);
    }

    public static void init() {
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes().add(Attributes.MOVEMENT_SPEED, 0.3d).add(Attributes.MAX_HEALTH, 85.0d).add(Attributes.ARMOR, 8.0d).add(Attributes.ATTACK_DAMAGE, 4.0d).add(Attributes.FOLLOW_RANGE, 16.0d).add(Attributes.KNOCKBACK_RESISTANCE, 0.7999999999999999d);
    }
}
