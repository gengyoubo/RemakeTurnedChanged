package net.mcreator.latexes.entity;

import net.mcreator.latexes.init.LatexModEntities;
import net.mcreator.latexes.init.LatexModItems;
import net.mcreator.latexes.procedures.TargethasabatonProcedure;
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

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/PrisionerEntity.class */
public class PrisionerEntity extends PathfinderMob {
    public PrisionerEntity(PlayMessages.SpawnEntity packet, Level world) {
        this((EntityType) LatexModEntities.PRISIONER.get(), world);
    }

    public PrisionerEntity(EntityType<PrisionerEntity> type, Level world) {
        super(type, world);
        this.xpReward = 0;
        setNoAi(false);
        setPersistenceRequired();
    }

    public Packet<?> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }

    /* renamed from: net.mcreator.latexes.entity.PrisionerEntity$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/PrisionerEntity$1.class */
    class AnonymousClass1 extends HurtByTargetGoal {
        AnonymousClass1(PathfinderMob arg0, Class... clsArr) {
            super(arg0, clsArr);
        }

        public boolean canUse() {
            PrisionerEntity.this.getX();
            PrisionerEntity.this.getY();
            PrisionerEntity.this.getZ();
            Entity entity = PrisionerEntity.this;
            Level level = PrisionerEntity.this.level;
            return canUse() && TargethasabatonProcedure.execute(entity);
        }
    }

    protected void registerGoals() {
        registerGoals();
        this.targetSelector.addGoal(1, new AnonymousClass1(this, new Class[0]));
        this.goalSelector.addGoal(2, new AnonymousClass2(this, 1.2d, false));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, Monster.class, true, true));
        this.goalSelector.addGoal(4, new OpenDoorGoal(this, true));
        this.goalSelector.addGoal(5, new MoveBackToVillageGoal(this, 0.6d, false));
        this.goalSelector.addGoal(6, new AvoidEntityGoal(this, Monster.class, 7.0f, 1.5d, 0.8d));
        this.goalSelector.addGoal(7, new TemptGoal(this, 0.8d, Ingredient.of(new ItemLike[]{(ItemLike) LatexModItems.BATON.get()}), false));
        this.goalSelector.addGoal(8, new LookAtPlayerGoal(this, Player.class, 5.0f));
        this.goalSelector.addGoal(9, new LookAtPlayerGoal(this, MilitaryEntity.class, 6.0f));
        this.goalSelector.addGoal(10, new LookAtPlayerGoal(this, MilitaryRiotEntity.class, 6.0f));
        this.goalSelector.addGoal(11, new LookAtPlayerGoal(this, ScientistEntity.class, 6.0f));
        this.goalSelector.addGoal(12, new LookAtPlayerGoal(this, EvilScientistEntity.class, 6.0f));
        this.goalSelector.addGoal(13, new LookAtPlayerGoal(this, EvilMilitaryEntity.class, 6.0f));
        this.goalSelector.addGoal(14, new LookAtPlayerGoal(this, LivingEntity.class, 4.0f));
        this.goalSelector.addGoal(15, new RandomStrollGoal(this, 0.6d));
        this.goalSelector.addGoal(16, new OpenDoorGoal(this, false));
        this.goalSelector.addGoal(17, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(18, new FloatGoal(this));
    }

    /* renamed from: net.mcreator.latexes.entity.PrisionerEntity$2  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/PrisionerEntity$2.class */
    class AnonymousClass2 extends MeleeAttackGoal {
        AnonymousClass2(PathfinderMob arg0, double arg1, boolean arg2) {
            super(arg0, arg1, arg2);
        }

        protected double getAttackReachSqr(LivingEntity entity) {
            return 4.0d + ((double) (entity.getBbWidth() * entity.getBbWidth()));
        }
    }

    public MobType getMobType() {
        return MobType.UNDEFINED;
    }

    public boolean removeWhenFarAway(double distanceToClosestPlayer) {
        return false;
    }

    public void playStepSound(BlockPos pos, BlockState blockIn) {
        playSound((SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.vindicator.ambient")), 0.15f, 1.0f);
    }

    public SoundEvent getHurtSound(DamageSource ds) {
        return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.vindicator.hurt"));
    }

    public SoundEvent getDeathSound() {
        return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.vindicator.death"));
    }

    public static void init() {
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes().add(Attributes.MOVEMENT_SPEED, 0.25d).add(Attributes.MAX_HEALTH, 20.0d).add(Attributes.ARMOR, 0.0d).add(Attributes.ATTACK_DAMAGE, 1.0d).add(Attributes.FOLLOW_RANGE, 12.0d);
    }
}
