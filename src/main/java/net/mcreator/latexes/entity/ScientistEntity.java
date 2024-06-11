package net.mcreator.latexes.entity;

import javax.annotation.Nullable;
import net.mcreator.latexes.init.LatexModEntities;
import net.mcreator.latexes.init.LatexModItems;
import net.mcreator.latexes.procedures.CheckGoodProcedure;
import net.mcreator.latexes.procedures.ScientistOnInitialEntitySpawnProcedure;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.Packet;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.SpawnGroupData;
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
import net.minecraft.world.entity.ai.goal.TemptGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.registries.ForgeRegistries;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/ScientistEntity.class */
public class ScientistEntity extends PathfinderMob {
    public ScientistEntity(PlayMessages.SpawnEntity packet, Level world) {
        this((EntityType) LatexModEntities.SCIENTIST.get(), world);
    }

    public ScientistEntity(EntityType<ScientistEntity> type, Level world) {
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
        this.goalSelector.addGoal(1, new OpenDoorGoal(this, true));
        this.targetSelector.addGoal(2, new HurtByTargetGoal(this, new Class[0]).setAlertOthers(new Class[0]));
        this.goalSelector.addGoal(3, new PanicGoal(this, 1.2d));
        this.goalSelector.addGoal(4, new AvoidEntityGoal(this, Monster.class, 8.0f, 1.6d, 0.9d));
        this.goalSelector.addGoal(5, new AnonymousClass1(this, PathfinderMob.class, 6.0f, 1.2d, 0.9d));
        this.goalSelector.addGoal(6, new MoveBackToVillageGoal(this, 0.6d, false));
        this.goalSelector.addGoal(7, new TemptGoal(this, 1.0d, Ingredient.of(new ItemLike[]{(ItemLike) LatexModItems.TABLET.get()}), false));
        this.goalSelector.addGoal(8, new LookAtPlayerGoal(this, Player.class, 6.0f));
        this.goalSelector.addGoal(9, new LookAtPlayerGoal(this, PathfinderMob.class, 8.0f));
        this.goalSelector.addGoal(10, new LookAtPlayerGoal(this, Monster.class, 9.0f));
        this.goalSelector.addGoal(11, new RandomStrollGoal(this, 1.0d));
        this.goalSelector.addGoal(12, new OpenDoorGoal(this, false));
        this.goalSelector.addGoal(13, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(14, new FloatGoal(this));
    }

    /* renamed from: net.mcreator.latexes.entity.ScientistEntity$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/ScientistEntity$1.class */
    class AnonymousClass1 extends AvoidEntityGoal<PathfinderMob> {
        AnonymousClass1(PathfinderMob arg0, Class cls, float arg2, double arg3, double arg4) {
            super(arg0, cls, arg2, arg3, arg4);
        }

        public boolean canUse() {
            ScientistEntity.this.getX();
            ScientistEntity.this.getY();
            ScientistEntity.this.getZ();
            Entity entity = ScientistEntity.this;
            Level level = ScientistEntity.this.level;
            return canUse() && CheckGoodProcedure.execute(entity);
        }

        public boolean canContinueToUse() {
            ScientistEntity.this.getX();
            ScientistEntity.this.getY();
            ScientistEntity.this.getZ();
            Entity entity = ScientistEntity.this;
            Level level = ScientistEntity.this.level;
            return canContinueToUse() && CheckGoodProcedure.execute(entity);
        }
    }

    public MobType getMobType() {
        return MobType.UNDEFINED;
    }

    public boolean removeWhenFarAway(double distanceToClosestPlayer) {
        return false;
    }

    public void playStepSound(BlockPos pos, BlockState blockIn) {
        playSound((SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.ambient")), 0.15f, 1.0f);
    }

    public SoundEvent getHurtSound(DamageSource ds) {
        return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.hurt"));
    }

    public SoundEvent getDeathSound() {
        return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.death"));
    }

    public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
        SpawnGroupData retval = finalizeSpawn(world, difficulty, reason, livingdata, tag);
        ScientistOnInitialEntitySpawnProcedure.execute(this);
        return retval;
    }

    public static void init() {
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes().add(Attributes.MOVEMENT_SPEED, 0.25d).add(Attributes.MAX_HEALTH, 20.0d).add(Attributes.ARMOR, 0.0d).add(Attributes.ATTACK_DAMAGE, 3.0d).add(Attributes.FOLLOW_RANGE, 16.0d);
    }
}
