package net.mcreator.latexes.entity;

import net.mcreator.latexes.init.LatexModBlocks;
import net.mcreator.latexes.init.LatexModEntities;
import net.mcreator.latexes.procedures.CheckEvilProcedure;
import net.mcreator.latexes.procedures.CheckGoodProcedure;
import net.mcreator.latexes.procedures.CheckentityislatexProcedure;
import net.mcreator.latexes.procedures.TSCHunterEntityDiesProcedure;
import net.mcreator.latexes.procedures.TSCHunterThisEntityKillsAnotherOneProcedure;
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
import net.minecraft.world.entity.ai.goal.RemoveBlockGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.animal.IronGolem;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.Witch;
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

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/TSCHunterEntity.class */
public class TSCHunterEntity extends Monster {
    public TSCHunterEntity(PlayMessages.SpawnEntity packet, Level world) {
        this((EntityType) LatexModEntities.TSC_HUNTER.get(), world);
    }

    public TSCHunterEntity(EntityType<TSCHunterEntity> type, Level world) {
        super(type, world);
        this.xpReward = 0;
        setNoAi(false);
        setPersistenceRequired();
    }

    public Packet<?> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }

    /* renamed from: net.mcreator.latexes.entity.TSCHunterEntity$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/TSCHunterEntity$1.class */
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
        this.targetSelector.addGoal(2, new HurtByTargetGoal(this, new Class[0]).setAlertOthers(new Class[0]));
        this.goalSelector.addGoal(3, new OpenDoorGoal(this, true));
        this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, Player.class, true, false));
        this.targetSelector.addGoal(5, new AnonymousClass2(this, Mob.class, true, false));
        this.targetSelector.addGoal(6, new AnonymousClass3(this, Mob.class, true, false));
        this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, Villager.class, true, false));
        this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, WanderingTrader.class, true, false));
        this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, IronGolem.class, true, false));
        this.targetSelector.addGoal(10, new NearestAttackableTargetGoal(this, Witch.class, true, false));
        this.goalSelector.addGoal(11, new RandomStrollGoal(this, 1.0d));
        this.goalSelector.addGoal(12, new RemoveBlockGoal((Block) LatexModBlocks.DARKLATEXBLOCK.get(), this, 1.0d, 3));
        this.goalSelector.addGoal(13, new RemoveBlockGoal((Block) LatexModBlocks.DARKLATEXBLOCKHARMLESS.get(), this, 1.0d, 3));
        this.goalSelector.addGoal(14, new RemoveBlockGoal((Block) LatexModBlocks.DARKLATEXBLOCKCRYSTALGROW.get(), this, 1.0d, 3));
        this.goalSelector.addGoal(15, new RemoveBlockGoal((Block) LatexModBlocks.DARKLATEXHIVE.get(), this, 1.0d, 3));
        this.goalSelector.addGoal(16, new OpenDoorGoal(this, false));
        this.goalSelector.addGoal(17, new AnonymousClass4(this, LivingEntity.class, 6.0f));
        this.goalSelector.addGoal(18, new LookAtPlayerGoal(this, Player.class, 9.0f));
        this.goalSelector.addGoal(19, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(20, new FloatGoal(this));
    }

    /* renamed from: net.mcreator.latexes.entity.TSCHunterEntity$2  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/TSCHunterEntity$2.class */
    class AnonymousClass2 extends NearestAttackableTargetGoal {
        AnonymousClass2(Mob arg0, Class arg1, boolean arg2, boolean arg3) {
            super(arg0, arg1, arg2, arg3);
        }

        public boolean canUse() {
            TSCHunterEntity.this.getX();
            TSCHunterEntity.this.getY();
            TSCHunterEntity.this.getZ();
            Entity entity = TSCHunterEntity.this;
            Level level = TSCHunterEntity.this.level;
            return canUse() && CheckentityislatexProcedure.execute(entity);
        }
    }

    /* renamed from: net.mcreator.latexes.entity.TSCHunterEntity$3  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/TSCHunterEntity$3.class */
    class AnonymousClass3 extends NearestAttackableTargetGoal {
        AnonymousClass3(Mob arg0, Class arg1, boolean arg2, boolean arg3) {
            super(arg0, arg1, arg2, arg3);
        }

        public boolean canUse() {
            TSCHunterEntity.this.getX();
            TSCHunterEntity.this.getY();
            TSCHunterEntity.this.getZ();
            Entity entity = TSCHunterEntity.this;
            Level level = TSCHunterEntity.this.level;
            return canUse() && CheckGoodProcedure.execute(entity);
        }
    }

    /* renamed from: net.mcreator.latexes.entity.TSCHunterEntity$4  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/TSCHunterEntity$4.class */
    class AnonymousClass4 extends LookAtPlayerGoal {
        AnonymousClass4(Mob arg0, Class cls, float arg2) {
            super(arg0, cls, arg2);
        }

        public boolean canUse() {
            TSCHunterEntity.this.getX();
            TSCHunterEntity.this.getY();
            TSCHunterEntity.this.getZ();
            Entity entity = TSCHunterEntity.this;
            Level level = TSCHunterEntity.this.level;
            return canUse() && CheckEvilProcedure.execute(entity);
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
