//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.ltxprogrammer.turned.entity;

import net.ltxprogrammer.turned.entity.ai.TargetCheck;
import net.minecraft.core.BlockPos;
import net.minecraft.network.protocol.Packet;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.AreaEffectCloud;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.OpenDoorGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.animal.IronGolem;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.npc.WanderingTrader;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.ThrownPotion;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.registries.ForgeRegistries;

public abstract class AbstractTSCEntity extends Monster {
    protected AbstractTSCEntity(EntityType<? extends AbstractTSCEntity> p_33002_, Level p_33003_) {
        super(p_33002_, p_33003_);
    }

    public Packet<?> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }

    public MobType getMobType() {
        return MobType.UNDEFINED;
    }

    protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHitIn) {
        super.dropCustomDeathLoot(source, looting, recentlyHitIn);
        this.spawnAtLocation(new ItemStack(Items.IRON_INGOT));
    }

    public void playStepSound(BlockPos pos, BlockState blockIn) {
        this.playSound((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.iron_golem.step")), 0.15F, 1.0F);
    }

    public SoundEvent getHurtSound(DamageSource ds) {
        return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.metal.hit"));
    }

    public SoundEvent getDeathSound() {
        return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:death_beep"));
    }

    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.25, true) {
            protected double getAttackReachSqr(LivingEntity entity) {
                return 4.0 + (double)(entity.getBbWidth() * entity.getBbWidth());
            }
        });
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal(this, Player.class, true, false));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, LivingEntity.class, 10, true, false, TargetCheck.IS_LATEX));
        this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, Villager.class, true, false));
        this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, WanderingTrader.class, true, false));
        this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, IronGolem.class, true, false));
        this.goalSelector.addGoal(8, new OpenDoorGoal(this, true));
        this.goalSelector.addGoal(9, new RandomStrollGoal(this, 0.75));
        this.goalSelector.addGoal(10, new LookAtPlayerGoal(this, LivingEntity.class, 4.0F));
        this.goalSelector.addGoal(11, new LookAtPlayerGoal(this, Player.class, 9.0F));
        this.goalSelector.addGoal(12, new LookAtPlayerGoal(this, ScientistEntity.class, 6.0F));
        this.targetSelector.addGoal(13, (new HurtByTargetGoal(this, new Class[0])).setAlertOthers(new Class[0]));
        this.goalSelector.addGoal(14, new OpenDoorGoal(this, false));
        this.goalSelector.addGoal(15, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(16, new FloatGoal(this));
    }

    public boolean hurt(DamageSource source, float amount) {
        if (!(source.getDirectEntity() instanceof ThrownPotion) && !(source.getDirectEntity() instanceof AreaEffectCloud)) {
            if (source == DamageSource.CACTUS) {
                return false;
            } else if (source == DamageSource.DROWN) {
                return false;
            } else if (source == DamageSource.DRAGON_BREATH) {
                return false;
            } else if (source == DamageSource.WITHER) {
                return false;
            } else {
                return source.getMsgId().equals("witherSkull") ? false : super.hurt(source, amount);
            }
        } else {
            return false;
        }
    }

    public boolean removeWhenFarAway(double distanceToClosestPlayer) {
        return false;
    }
}
