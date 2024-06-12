package net.ltxprogrammer.turned.entity;

import net.ltxprogrammer.changed.block.AbstractLatexBlock;
import net.ltxprogrammer.changed.entity.LatexType;
import net.ltxprogrammer.changed.init.ChangedBlocks;
import net.ltxprogrammer.turned.entity.p000ai.RevertBlockStateGoal;
import net.ltxprogrammer.turned.init.LatexModBlocks;
import net.ltxprogrammer.turned.init.LatexModEntities;
import net.ltxprogrammer.turned.procedures.TSCOutsiderGunnerEntityDiesProcedure;
import net.minecraft.core.BlockPos;
import net.minecraft.network.protocol.Packet;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.AreaEffectCloud;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.RangedAttackGoal;
import net.minecraft.world.entity.ai.goal.RemoveBlockGoal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.RangedAttackMob;
import net.minecraft.world.entity.projectile.ThrownPotion;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.registries.ForgeRegistries;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/entity/TSCOutsiderGunnerEntity.class */
public class TSCOutsiderGunnerEntity extends Monster implements RangedAttackMob {
    public TSCOutsiderGunnerEntity(PlayMessages.SpawnEntity packet, Level world) {
        this((EntityType) LatexModEntities.TSC_OUTSIDER_GUNNER.get(), world);
    }

    public TSCOutsiderGunnerEntity(EntityType<TSCOutsiderGunnerEntity> type, Level world) {
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
        this.goalSelector.addGoal(12, new RevertBlockStateGoal(AbstractLatexBlock.COVERED, LatexType.DARK_LATEX, LatexType.NEUTRAL, this, 1.0d, 3));
        this.goalSelector.addGoal(12, new RevertBlockStateGoal(AbstractLatexBlock.COVERED, LatexType.WHITE_LATEX, LatexType.NEUTRAL, this, 1.0d, 3));
        this.goalSelector.addGoal(13, new RemoveBlockGoal((Block) ChangedBlocks.DARK_LATEX_ICE.get(), this, 1.0d, 3));
        this.goalSelector.addGoal(14, new RemoveBlockGoal((Block) ChangedBlocks.LATEX_CRYSTAL.get(), this, 1.0d, 3));
        this.goalSelector.addGoal(15, new RemoveBlockGoal((Block) ChangedBlocks.DARK_LATEX_BLOCK.get(), this, 1.0d, 3));
        this.goalSelector.addGoal(20, new RemoveBlockGoal((Block) LatexModBlocks.DARKLATEXHIVE.get(), this, 1.0d, 3));
        this.goalSelector.addGoal(1, new RangedAttackGoal(this, 1.25d, 20, 10.0f) { // from class: net.ltxprogrammer.turned.entity.TSCOutsiderGunnerEntity.1
            public boolean canContinueToUse() {
                return canUse();
            }
        });
    }

    public MobType getMobType() {
        return MobType.UNDEFINED;
    }

    public boolean removeWhenFarAway(double distanceToClosestPlayer) {
        return false;
    }

    protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHitIn) {
        dropCustomDeathLoot(source, looting, recentlyHitIn);
        spawnAtLocation(new ItemStack(Items.IRON_INGOT));
    }

    public void playStepSound(BlockPos pos, BlockState blockIn) {
        playSound((SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.iron_golem.step")), 0.15f, 1.0f);
    }

    public SoundEvent getHurtSound(DamageSource ds) {
        return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.metal.hit"));
    }

    public SoundEvent getDeathSound() {
        return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:death_beep"));
    }

    public boolean hurt(DamageSource source, float amount) {
        if ((source.getDirectEntity() instanceof ThrownPotion) || (source.getDirectEntity() instanceof AreaEffectCloud) || source == DamageSource.DROWN || source == DamageSource.DRAGON_BREATH || source == DamageSource.WITHER || source.getMsgId().equals("witherSkull")) {
            return false;
        }
        return hurt(source, amount);
    }

    public void die(DamageSource source) {
        die(source);
        TSCOutsiderGunnerEntityDiesProcedure.execute();
    }

    public void performRangedAttack(LivingEntity target, float flval) {
        TSCPistolEntity.shoot(this, target);
    }

    public static void init() {
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes().add(Attributes.MOVEMENT_SPEED, 0.3d).add(Attributes.MAX_HEALTH, 30.0d).add(Attributes.ARMOR, 6.0d).add(Attributes.ATTACK_DAMAGE, 3.0d).add(Attributes.FOLLOW_RANGE, 16.0d).add(Attributes.KNOCKBACK_RESISTANCE, 0.5d);
    }
}
