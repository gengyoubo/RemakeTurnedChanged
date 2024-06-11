package net.mcreator.latexes.entity;

import net.mcreator.latexes.init.LatexModBlocks;
import net.mcreator.latexes.init.LatexModEntities;
import net.mcreator.latexes.procedures.CheckEvilProcedure;
import net.mcreator.latexes.procedures.CheckentityislatexProcedure;
import net.mcreator.latexes.procedures.TSCOutsiderGunnerEntityDiesProcedure;
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
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.OpenDoorGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RangedAttackGoal;
import net.minecraft.world.entity.ai.goal.RemoveBlockGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.animal.IronGolem;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.RangedAttackMob;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.npc.WanderingTrader;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.ThrownPotion;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.registries.ForgeRegistries;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/TSCOutsiderGunnerEntity.class */
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

    /* renamed from: net.mcreator.latexes.entity.TSCOutsiderGunnerEntity$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/TSCOutsiderGunnerEntity$1.class */
    class AnonymousClass1 extends MeleeAttackGoal {
        AnonymousClass1(PathfinderMob arg0, double arg1, boolean arg2) {
            super(arg0, arg1, arg2);
        }

        protected double getAttackReachSqr(LivingEntity entity) {
            return 4.0d + ((double) (entity.getBbWidth() * entity.getBbWidth()));
        }
    }

    protected void registerGoals() {
        registerGoals();
        this.goalSelector.addGoal(1, new AnonymousClass1(this, 1.2d, false));
        this.goalSelector.addGoal(2, new OpenDoorGoal(this, true));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, Player.class, true, false));
        this.targetSelector.addGoal(4, new AnonymousClass2(this, LivingEntity.class, true, false));
        this.targetSelector.addGoal(5, new AnonymousClass3(this, LivingEntity.class, true, false));
        this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, Villager.class, true, false));
        this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, WanderingTrader.class, true, false));
        this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, IronGolem.class, true, false));
        this.goalSelector.addGoal(9, new RandomStrollGoal(this, 1.0d));
        this.goalSelector.addGoal(10, new AnonymousClass4(this, LivingEntity.class, 4.0f));
        this.goalSelector.addGoal(11, new LookAtPlayerGoal(this, Player.class, 8.0f));
        this.targetSelector.addGoal(12, new HurtByTargetGoal(this, new Class[0]).setAlertOthers(new Class[0]));
        this.goalSelector.addGoal(13, new RemoveBlockGoal((Block) LatexModBlocks.DARKLATEXBLOCK.get(), this, 1.0d, 3));
        this.goalSelector.addGoal(14, new RemoveBlockGoal((Block) LatexModBlocks.DARKLATEXBLOCKHARMLESS.get(), this, 1.0d, 3));
        this.goalSelector.addGoal(15, new RemoveBlockGoal((Block) LatexModBlocks.DARKLATEXBLOCKCRYSTALGROW.get(), this, 1.0d, 3));
        this.goalSelector.addGoal(16, new RemoveBlockGoal((Block) LatexModBlocks.DARKLATEXHIVE.get(), this, 1.0d, 3));
        this.goalSelector.addGoal(17, new OpenDoorGoal(this, false));
        this.goalSelector.addGoal(18, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(19, new FloatGoal(this));
        this.goalSelector.addGoal(1, new AnonymousClass5(this, 1.25d, 20, 10.0f));
    }

    /* renamed from: net.mcreator.latexes.entity.TSCOutsiderGunnerEntity$2  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/TSCOutsiderGunnerEntity$2.class */
    class AnonymousClass2 extends NearestAttackableTargetGoal {
        AnonymousClass2(Mob arg0, Class arg1, boolean arg2, boolean arg3) {
            super(arg0, arg1, arg2, arg3);
        }

        public boolean canUse() {
            TSCOutsiderGunnerEntity.this.getX();
            TSCOutsiderGunnerEntity.this.getY();
            TSCOutsiderGunnerEntity.this.getZ();
            Entity entity = TSCOutsiderGunnerEntity.this;
            Level level = TSCOutsiderGunnerEntity.this.level;
            return canUse() && CheckentityislatexProcedure.execute(entity);
        }
    }

    /* renamed from: net.mcreator.latexes.entity.TSCOutsiderGunnerEntity$3  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/TSCOutsiderGunnerEntity$3.class */
    class AnonymousClass3 extends NearestAttackableTargetGoal {
        AnonymousClass3(Mob arg0, Class arg1, boolean arg2, boolean arg3) {
            super(arg0, arg1, arg2, arg3);
        }

        public boolean canUse() {
            TSCOutsiderGunnerEntity.this.getX();
            TSCOutsiderGunnerEntity.this.getY();
            TSCOutsiderGunnerEntity.this.getZ();
            Entity entity = TSCOutsiderGunnerEntity.this;
            Level level = TSCOutsiderGunnerEntity.this.level;
            return canUse() && CheckentityislatexProcedure.execute(entity);
        }
    }

    /* renamed from: net.mcreator.latexes.entity.TSCOutsiderGunnerEntity$4  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/TSCOutsiderGunnerEntity$4.class */
    class AnonymousClass4 extends LookAtPlayerGoal {
        AnonymousClass4(Mob arg0, Class cls, float arg2) {
            super(arg0, cls, arg2);
        }

        public boolean canUse() {
            TSCOutsiderGunnerEntity.this.getX();
            TSCOutsiderGunnerEntity.this.getY();
            TSCOutsiderGunnerEntity.this.getZ();
            Entity entity = TSCOutsiderGunnerEntity.this;
            Level level = TSCOutsiderGunnerEntity.this.level;
            return canUse() && CheckEvilProcedure.execute(entity);
        }
    }

    /* renamed from: net.mcreator.latexes.entity.TSCOutsiderGunnerEntity$5  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/TSCOutsiderGunnerEntity$5.class */
    class AnonymousClass5 extends RangedAttackGoal {
        AnonymousClass5(RangedAttackMob arg0, double arg1, int arg2, float arg3) {
            super(arg0, arg1, arg2, arg3);
        }

        public boolean canContinueToUse() {
            return canUse();
        }
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
        return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:death_beep"));
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
