package net.mcreator.latexes.entity;

import net.mcreator.latexes.init.LatexModBlocks;
import net.mcreator.latexes.init.LatexModEntities;
import net.mcreator.latexes.init.LatexModItems;
import net.mcreator.latexes.procedures.CheckEvilProcedure;
import net.mcreator.latexes.procedures.CheckentityislatexProcedure;
import net.minecraft.network.protocol.Packet;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.AreaEffectCloud;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.OpenDoorGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RangedAttackGoal;
import net.minecraft.world.entity.ai.goal.RemoveBlockGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.monster.Illusioner;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.Pillager;
import net.minecraft.world.entity.monster.RangedAttackMob;
import net.minecraft.world.entity.monster.SpellcasterIllager;
import net.minecraft.world.entity.monster.Vindicator;
import net.minecraft.world.entity.monster.piglin.Piglin;
import net.minecraft.world.entity.monster.piglin.PiglinBrute;
import net.minecraft.world.entity.projectile.ThrownPotion;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.registries.ForgeRegistries;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/MilitaryflameunitEntity.class */
public class MilitaryflameunitEntity extends PathfinderMob implements RangedAttackMob {
    public MilitaryflameunitEntity(PlayMessages.SpawnEntity packet, Level world) {
        this((EntityType) LatexModEntities.MILITARYFLAMEUNIT.get(), world);
    }

    public MilitaryflameunitEntity(EntityType<MilitaryflameunitEntity> type, Level world) {
        super(type, world);
        this.xpReward = 0;
        setNoAi(false);
        setPersistenceRequired();
        setItemSlot(EquipmentSlot.MAINHAND, new ItemStack((ItemLike) LatexModItems.FLAMETHOWER.get()));
    }

    public Packet<?> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }

    /* renamed from: net.mcreator.latexes.entity.MilitaryflameunitEntity$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/MilitaryflameunitEntity$1.class */
    class AnonymousClass1 extends NearestAttackableTargetGoal {
        AnonymousClass1(Mob arg0, Class arg1, boolean arg2, boolean arg3) {
            super(arg0, arg1, arg2, arg3);
        }

        public boolean canUse() {
            MilitaryflameunitEntity.this.getX();
            MilitaryflameunitEntity.this.getY();
            MilitaryflameunitEntity.this.getZ();
            Entity entity = MilitaryflameunitEntity.this;
            Level level = MilitaryflameunitEntity.this.level;
            return canUse() && CheckEvilProcedure.execute(entity);
        }

        public boolean canContinueToUse() {
            MilitaryflameunitEntity.this.getX();
            MilitaryflameunitEntity.this.getY();
            MilitaryflameunitEntity.this.getZ();
            Entity entity = MilitaryflameunitEntity.this;
            Level level = MilitaryflameunitEntity.this.level;
            return canContinueToUse() && CheckEvilProcedure.execute(entity);
        }
    }

    protected void registerGoals() {
        registerGoals();
        this.targetSelector.addGoal(1, new AnonymousClass1(this, PathfinderMob.class, true, false));
        this.targetSelector.addGoal(2, new AnonymousClass2(this, Monster.class, true, false));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, EvilMilitaryEntity.class, true, false));
        this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, EvilSniperEntity.class, true, false));
        this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, PrisionermilitiaEntity.class, true, false));
        this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, PrisionerMilitiaMeleeEntity.class, true, false));
        this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, Illusioner.class, true, false));
        this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, Pillager.class, true, false));
        this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, SpellcasterIllager.class, true, false));
        this.targetSelector.addGoal(10, new NearestAttackableTargetGoal(this, Vindicator.class, true, false));
        this.targetSelector.addGoal(11, new NearestAttackableTargetGoal(this, Piglin.class, true, false));
        this.targetSelector.addGoal(12, new NearestAttackableTargetGoal(this, PiglinBrute.class, true, false));
        this.targetSelector.addGoal(13, new NearestAttackableTargetGoal(this, Monster.class, true, false));
        this.goalSelector.addGoal(14, new AnonymousClass3(this, 1.0d, false));
        this.goalSelector.addGoal(15, new RandomStrollGoal(this, 0.6d));
        this.goalSelector.addGoal(16, new OpenDoorGoal(this, true));
        this.goalSelector.addGoal(17, new OpenDoorGoal(this, false));
        this.goalSelector.addGoal(18, new RemoveBlockGoal((Block) LatexModBlocks.DARKLATEXBLOCK.get(), this, 1.0d, 3));
        this.goalSelector.addGoal(19, new RemoveBlockGoal((Block) LatexModBlocks.DARKLATEXBLOCKHARMLESS.get(), this, 1.0d, 3));
        this.goalSelector.addGoal(20, new RemoveBlockGoal((Block) LatexModBlocks.DARKLATEXBLOCKCRYSTALGROW.get(), this, 1.0d, 3));
        this.targetSelector.addGoal(21, new HurtByTargetGoal(this, new Class[0]).setAlertOthers(new Class[0]));
        this.goalSelector.addGoal(22, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(23, new FloatGoal(this));
        this.goalSelector.addGoal(1, new AnonymousClass4(this, 1.25d, 20, 10.0f));
    }

    /* renamed from: net.mcreator.latexes.entity.MilitaryflameunitEntity$2  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/MilitaryflameunitEntity$2.class */
    class AnonymousClass2 extends NearestAttackableTargetGoal {
        AnonymousClass2(Mob arg0, Class arg1, boolean arg2, boolean arg3) {
            super(arg0, arg1, arg2, arg3);
        }

        public boolean canUse() {
            MilitaryflameunitEntity.this.getX();
            MilitaryflameunitEntity.this.getY();
            MilitaryflameunitEntity.this.getZ();
            Entity entity = MilitaryflameunitEntity.this;
            Level level = MilitaryflameunitEntity.this.level;
            return canUse() && CheckentityislatexProcedure.execute(entity);
        }

        public boolean canContinueToUse() {
            MilitaryflameunitEntity.this.getX();
            MilitaryflameunitEntity.this.getY();
            MilitaryflameunitEntity.this.getZ();
            Entity entity = MilitaryflameunitEntity.this;
            Level level = MilitaryflameunitEntity.this.level;
            return canContinueToUse() && CheckentityislatexProcedure.execute(entity);
        }
    }

    /* renamed from: net.mcreator.latexes.entity.MilitaryflameunitEntity$3  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/MilitaryflameunitEntity$3.class */
    class AnonymousClass3 extends MeleeAttackGoal {
        AnonymousClass3(PathfinderMob arg0, double arg1, boolean arg2) {
            super(arg0, arg1, arg2);
        }

        protected double getAttackReachSqr(LivingEntity entity) {
            return 4.0d + ((double) (entity.getBbWidth() * entity.getBbWidth()));
        }
    }

    /* renamed from: net.mcreator.latexes.entity.MilitaryflameunitEntity$4  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/MilitaryflameunitEntity$4.class */
    class AnonymousClass4 extends RangedAttackGoal {
        AnonymousClass4(RangedAttackMob arg0, double arg1, int arg2, float arg3) {
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

    public SoundEvent getHurtSound(DamageSource ds) {
        return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
    }

    public SoundEvent getDeathSound() {
        return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
    }

    public boolean hurt(DamageSource source, float amount) {
        if ((source.getDirectEntity() instanceof ThrownPotion) || (source.getDirectEntity() instanceof AreaEffectCloud) || source == DamageSource.DRAGON_BREATH || source == DamageSource.WITHER || source.getMsgId().equals("witherSkull")) {
            return false;
        }
        return hurt(source, amount);
    }

    public void performRangedAttack(LivingEntity target, float flval) {
        FlamethowerEntity.shoot(this, target);
    }

    public static void init() {
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes().add(Attributes.MOVEMENT_SPEED, 0.25d).add(Attributes.MAX_HEALTH, 20.0d).add(Attributes.ARMOR, 0.0d).add(Attributes.ATTACK_DAMAGE, 3.0d).add(Attributes.FOLLOW_RANGE, 16.0d);
    }
}
