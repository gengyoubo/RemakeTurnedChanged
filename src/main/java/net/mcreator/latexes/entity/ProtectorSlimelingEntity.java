package net.mcreator.latexes.entity;

import java.util.List;
import javax.annotation.Nullable;
import net.mcreator.latexes.init.LatexModBlocks;
import net.mcreator.latexes.init.LatexModEntities;
import net.mcreator.latexes.init.LatexModItems;
import net.mcreator.latexes.procedures.CheckEvilProcedure;
import net.mcreator.latexes.procedures.CheckentityislatexProcedure;
import net.mcreator.latexes.procedures.CheckiftamedProcedure;
import net.mcreator.latexes.procedures.ProtectorSlimelingRightClickedOnEntityProcedure;
import net.mcreator.latexes.procedures.ProtectorSlimelingThisEntityKillsAnotherOneProcedure;
import net.mcreator.latexes.procedures.SlimelingTamedOnInitialEntitySpawnProcedure;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.Packet;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.AreaEffectCloud;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.FollowOwnerGoal;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.OpenDoorGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RemoveBlockGoal;
import net.minecraft.world.entity.ai.goal.TemptGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.target.OwnerHurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.OwnerHurtTargetGoal;
import net.minecraft.world.entity.monster.Evoker;
import net.minecraft.world.entity.monster.Illusioner;
import net.minecraft.world.entity.monster.Pillager;
import net.minecraft.world.entity.monster.Vindicator;
import net.minecraft.world.entity.monster.piglin.Piglin;
import net.minecraft.world.entity.monster.piglin.PiglinBrute;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.npc.WanderingTrader;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.ThrownPotion;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.DungeonHooks;
import net.minecraftforge.event.ForgeEventFactory;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.registries.ForgeRegistries;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/ProtectorSlimelingEntity.class */
public class ProtectorSlimelingEntity extends TamableAnimal {
    public ProtectorSlimelingEntity(PlayMessages.SpawnEntity packet, Level world) {
        this((EntityType) LatexModEntities.PROTECTOR_SLIMELING.get(), world);
    }

    public ProtectorSlimelingEntity(EntityType<ProtectorSlimelingEntity> type, Level world) {
        super(type, world);
        this.xpReward = 6;
        setNoAi(false);
        setPersistenceRequired();
    }

    public Packet<?> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }

    protected void registerGoals() {
        registerGoals();
        this.goalSelector.addGoal(1, new FollowOwnerGoal(this, 0.9d, 12.0f, 2.0f, false));
        this.targetSelector.addGoal(2, new OwnerHurtTargetGoal(this));
        this.goalSelector.addGoal(3, new OwnerHurtByTargetGoal(this));
        this.goalSelector.addGoal(4, new AnonymousClass1(this, 1.2d, false));
        this.targetSelector.addGoal(5, new AnonymousClass2(this, LivingEntity.class, false, false));
        this.targetSelector.addGoal(6, new AnonymousClass3(this, LivingEntity.class, true, false));
        this.targetSelector.addGoal(7, new AnonymousClass4(this, Pillager.class, true, false));
        this.targetSelector.addGoal(8, new AnonymousClass5(this, Vindicator.class, true, false));
        this.targetSelector.addGoal(9, new AnonymousClass6(this, Illusioner.class, true, false));
        this.targetSelector.addGoal(10, new AnonymousClass7(this, Evoker.class, true, false));
        this.targetSelector.addGoal(11, new AnonymousClass8(this, PiglinBrute.class, true, false));
        this.targetSelector.addGoal(12, new AnonymousClass9(this, Piglin.class, true, false));
        this.goalSelector.addGoal(13, new RemoveBlockGoal((Block) LatexModBlocks.DARKLATEXICE.get(), this, 1.0d, 3));
        this.goalSelector.addGoal(14, new RemoveBlockGoal((Block) LatexModBlocks.DARKLATEXBLOCKCRYSTALGROW.get(), this, 1.0d, 3));
        this.goalSelector.addGoal(15, new RemoveBlockGoal((Block) LatexModBlocks.DARKLATEXBLOCK.get(), this, 1.0d, 3));
        this.goalSelector.addGoal(16, new RemoveBlockGoal((Block) LatexModBlocks.DARKLATEXCARPET.get(), this, 1.0d, 3));
        this.goalSelector.addGoal(17, new RemoveBlockGoal((Block) LatexModBlocks.DARKLATEXLEAVES.get(), this, 1.0d, 3));
        this.goalSelector.addGoal(18, new RemoveBlockGoal((Block) LatexModBlocks.DARKLATEXLOG.get(), this, 1.0d, 3));
        this.goalSelector.addGoal(19, new RemoveBlockGoal((Block) LatexModBlocks.DARKLATEXCRYSTALEGG.get(), this, 1.0d, 3));
        this.goalSelector.addGoal(20, new RemoveBlockGoal((Block) LatexModBlocks.DARKLATEXHIVE.get(), this, 1.0d, 3));
        this.goalSelector.addGoal(21, new LookAtPlayerGoal(this, Player.class, 9.0f));
        this.goalSelector.addGoal(22, new LookAtPlayerGoal(this, ScientistEntity.class, 9.0f));
        this.goalSelector.addGoal(23, new LookAtPlayerGoal(this, Villager.class, 9.0f));
        this.goalSelector.addGoal(24, new LookAtPlayerGoal(this, WanderingTrader.class, 9.0f));
        this.goalSelector.addGoal(25, new AnonymousClass10(this, 0.6d, Ingredient.of(new ItemLike[]{(ItemLike) LatexModItems.DARKLATEXGOO.get()}), true));
        this.goalSelector.addGoal(26, new AnonymousClass11(this, 0.6d, Ingredient.of(new ItemLike[]{Items.SLIME_BALL}), true));
        this.goalSelector.addGoal(27, new AnonymousClass12(this, 0.7d, Ingredient.of(new ItemLike[]{(ItemLike) LatexModItems.LATEX_SOUP.get()}), true));
        this.goalSelector.addGoal(28, new RandomStrollGoal(this, 1.0d));
        this.goalSelector.addGoal(29, new OpenDoorGoal(this, true));
        this.goalSelector.addGoal(30, new OpenDoorGoal(this, false));
        this.targetSelector.addGoal(31, new HurtByTargetGoal(this, new Class[0]).setAlertOthers(new Class[0]));
        this.goalSelector.addGoal(32, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(33, new FloatGoal(this));
    }

    /* renamed from: net.mcreator.latexes.entity.ProtectorSlimelingEntity$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/ProtectorSlimelingEntity$1.class */
    class AnonymousClass1 extends MeleeAttackGoal {
        AnonymousClass1(PathfinderMob arg0, double arg1, boolean arg2) {
            super(arg0, arg1, arg2);
        }

        protected double getAttackReachSqr(LivingEntity entity) {
            return 4.0d + ((double) (entity.getBbWidth() * entity.getBbWidth()));
        }
    }

    /* renamed from: net.mcreator.latexes.entity.ProtectorSlimelingEntity$2  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/ProtectorSlimelingEntity$2.class */
    class AnonymousClass2 extends NearestAttackableTargetGoal {
        AnonymousClass2(Mob arg0, Class arg1, boolean arg2, boolean arg3) {
            super(arg0, arg1, arg2, arg3);
        }

        public boolean canUse() {
            ProtectorSlimelingEntity.this.getX();
            ProtectorSlimelingEntity.this.getY();
            ProtectorSlimelingEntity.this.getZ();
            Entity entity = ProtectorSlimelingEntity.this;
            Level level = ProtectorSlimelingEntity.this.level;
            return canUse() && CheckentityislatexProcedure.execute(entity);
        }
    }

    /* renamed from: net.mcreator.latexes.entity.ProtectorSlimelingEntity$3  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/ProtectorSlimelingEntity$3.class */
    class AnonymousClass3 extends NearestAttackableTargetGoal {
        AnonymousClass3(Mob arg0, Class arg1, boolean arg2, boolean arg3) {
            super(arg0, arg1, arg2, arg3);
        }

        public boolean canUse() {
            ProtectorSlimelingEntity.this.getX();
            ProtectorSlimelingEntity.this.getY();
            ProtectorSlimelingEntity.this.getZ();
            Entity entity = ProtectorSlimelingEntity.this;
            Level level = ProtectorSlimelingEntity.this.level;
            return canUse() && CheckEvilProcedure.execute(entity);
        }
    }

    /* renamed from: net.mcreator.latexes.entity.ProtectorSlimelingEntity$4  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/ProtectorSlimelingEntity$4.class */
    class AnonymousClass4 extends NearestAttackableTargetGoal {
        AnonymousClass4(Mob arg0, Class arg1, boolean arg2, boolean arg3) {
            super(arg0, arg1, arg2, arg3);
        }

        public boolean canUse() {
            return canUse() && CheckiftamedProcedure.execute(ProtectorSlimelingEntity.this.level, ProtectorSlimelingEntity.this.getX(), ProtectorSlimelingEntity.this.getY(), ProtectorSlimelingEntity.this.getZ(), ProtectorSlimelingEntity.this);
        }
    }

    /* renamed from: net.mcreator.latexes.entity.ProtectorSlimelingEntity$5  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/ProtectorSlimelingEntity$5.class */
    class AnonymousClass5 extends NearestAttackableTargetGoal {
        AnonymousClass5(Mob arg0, Class arg1, boolean arg2, boolean arg3) {
            super(arg0, arg1, arg2, arg3);
        }

        public boolean canUse() {
            return canUse() && CheckiftamedProcedure.execute(ProtectorSlimelingEntity.this.level, ProtectorSlimelingEntity.this.getX(), ProtectorSlimelingEntity.this.getY(), ProtectorSlimelingEntity.this.getZ(), ProtectorSlimelingEntity.this);
        }
    }

    /* renamed from: net.mcreator.latexes.entity.ProtectorSlimelingEntity$6  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/ProtectorSlimelingEntity$6.class */
    class AnonymousClass6 extends NearestAttackableTargetGoal {
        AnonymousClass6(Mob arg0, Class arg1, boolean arg2, boolean arg3) {
            super(arg0, arg1, arg2, arg3);
        }

        public boolean canUse() {
            return canUse() && CheckiftamedProcedure.execute(ProtectorSlimelingEntity.this.level, ProtectorSlimelingEntity.this.getX(), ProtectorSlimelingEntity.this.getY(), ProtectorSlimelingEntity.this.getZ(), ProtectorSlimelingEntity.this);
        }
    }

    /* renamed from: net.mcreator.latexes.entity.ProtectorSlimelingEntity$7  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/ProtectorSlimelingEntity$7.class */
    class AnonymousClass7 extends NearestAttackableTargetGoal {
        AnonymousClass7(Mob arg0, Class arg1, boolean arg2, boolean arg3) {
            super(arg0, arg1, arg2, arg3);
        }

        public boolean canUse() {
            return canUse() && CheckiftamedProcedure.execute(ProtectorSlimelingEntity.this.level, ProtectorSlimelingEntity.this.getX(), ProtectorSlimelingEntity.this.getY(), ProtectorSlimelingEntity.this.getZ(), ProtectorSlimelingEntity.this);
        }
    }

    /* renamed from: net.mcreator.latexes.entity.ProtectorSlimelingEntity$8  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/ProtectorSlimelingEntity$8.class */
    class AnonymousClass8 extends NearestAttackableTargetGoal {
        AnonymousClass8(Mob arg0, Class arg1, boolean arg2, boolean arg3) {
            super(arg0, arg1, arg2, arg3);
        }

        public boolean canUse() {
            return canUse() && CheckiftamedProcedure.execute(ProtectorSlimelingEntity.this.level, ProtectorSlimelingEntity.this.getX(), ProtectorSlimelingEntity.this.getY(), ProtectorSlimelingEntity.this.getZ(), ProtectorSlimelingEntity.this);
        }
    }

    /* renamed from: net.mcreator.latexes.entity.ProtectorSlimelingEntity$9  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/ProtectorSlimelingEntity$9.class */
    class AnonymousClass9 extends NearestAttackableTargetGoal {
        AnonymousClass9(Mob arg0, Class arg1, boolean arg2, boolean arg3) {
            super(arg0, arg1, arg2, arg3);
        }

        public boolean canUse() {
            return canUse() && CheckiftamedProcedure.execute(ProtectorSlimelingEntity.this.level, ProtectorSlimelingEntity.this.getX(), ProtectorSlimelingEntity.this.getY(), ProtectorSlimelingEntity.this.getZ(), ProtectorSlimelingEntity.this);
        }
    }

    /* renamed from: net.mcreator.latexes.entity.ProtectorSlimelingEntity$10  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/ProtectorSlimelingEntity$10.class */
    class AnonymousClass10 extends TemptGoal {
        AnonymousClass10(PathfinderMob arg0, double arg1, Ingredient arg2, boolean arg3) {
            super(arg0, arg1, arg2, arg3);
        }

        public boolean canUse() {
            return canUse() && CheckiftamedProcedure.execute(ProtectorSlimelingEntity.this.level, ProtectorSlimelingEntity.this.getX(), ProtectorSlimelingEntity.this.getY(), ProtectorSlimelingEntity.this.getZ(), ProtectorSlimelingEntity.this);
        }
    }

    /* renamed from: net.mcreator.latexes.entity.ProtectorSlimelingEntity$11  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/ProtectorSlimelingEntity$11.class */
    class AnonymousClass11 extends TemptGoal {
        AnonymousClass11(PathfinderMob arg0, double arg1, Ingredient arg2, boolean arg3) {
            super(arg0, arg1, arg2, arg3);
        }

        public boolean canUse() {
            return canUse() && CheckiftamedProcedure.execute(ProtectorSlimelingEntity.this.level, ProtectorSlimelingEntity.this.getX(), ProtectorSlimelingEntity.this.getY(), ProtectorSlimelingEntity.this.getZ(), ProtectorSlimelingEntity.this);
        }
    }

    /* renamed from: net.mcreator.latexes.entity.ProtectorSlimelingEntity$12  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/ProtectorSlimelingEntity$12.class */
    class AnonymousClass12 extends TemptGoal {
        AnonymousClass12(PathfinderMob arg0, double arg1, Ingredient arg2, boolean arg3) {
            super(arg0, arg1, arg2, arg3);
        }

        public boolean canUse() {
            return canUse() && CheckiftamedProcedure.execute(ProtectorSlimelingEntity.this.level, ProtectorSlimelingEntity.this.getX(), ProtectorSlimelingEntity.this.getY(), ProtectorSlimelingEntity.this.getZ(), ProtectorSlimelingEntity.this);
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
        spawnAtLocation(new ItemStack((ItemLike) LatexModItems.SLIMEESSENCE.get()));
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
        if ((source.getDirectEntity() instanceof ThrownPotion) || (source.getDirectEntity() instanceof AreaEffectCloud) || source == DamageSource.FALL || source == DamageSource.CACTUS || source == DamageSource.WITHER || source.getMsgId().equals("witherSkull")) {
            return false;
        }
        return hurt(source, amount);
    }

    public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
        SpawnGroupData retval = finalizeSpawn(world, difficulty, reason, livingdata, tag);
        SlimelingTamedOnInitialEntitySpawnProcedure.execute(world, getX(), getY(), getZ(), this);
        return retval;
    }

    public InteractionResult mobInteract(Player sourceentity, InteractionHand hand) {
        ItemStack itemstack = sourceentity.getItemInHand(hand);
        InteractionResult retval = InteractionResult.sidedSuccess(this.level.isClientSide());
        Item item = itemstack.getItem();
        if (itemstack.getItem() instanceof SpawnEggItem) {
            retval = mobInteract(sourceentity, hand);
        } else if (this.level.isClientSide()) {
            if ((!isTame() || !isOwnedBy(sourceentity)) && !isFood(itemstack)) {
                retval = InteractionResult.PASS;
            } else {
                retval = InteractionResult.sidedSuccess(this.level.isClientSide());
            }
        } else if (isTame()) {
            if (isOwnedBy(sourceentity)) {
                if (item.isEdible() && isFood(itemstack) && getHealth() < getMaxHealth()) {
                    usePlayerItem(sourceentity, hand, itemstack);
                    heal((float) item.getFoodProperties().getNutrition());
                    retval = InteractionResult.sidedSuccess(this.level.isClientSide());
                } else if (!isFood(itemstack) || getHealth() >= getMaxHealth()) {
                    retval = mobInteract(sourceentity, hand);
                } else {
                    usePlayerItem(sourceentity, hand, itemstack);
                    heal(4.0f);
                    retval = InteractionResult.sidedSuccess(this.level.isClientSide());
                }
            }
        } else if (isFood(itemstack)) {
            usePlayerItem(sourceentity, hand, itemstack);
            if (this.random.nextInt(3) != 0 || ForgeEventFactory.onAnimalTame(this, sourceentity)) {
                this.level.broadcastEntityEvent(this, (byte) 6);
            } else {
                tame(sourceentity);
                this.level.broadcastEntityEvent(this, (byte) 7);
            }
            setPersistenceRequired();
            retval = InteractionResult.sidedSuccess(this.level.isClientSide());
        } else {
            retval = mobInteract(sourceentity, hand);
            if (retval == InteractionResult.SUCCESS || retval == InteractionResult.CONSUME) {
                setPersistenceRequired();
            }
        }
        ProtectorSlimelingRightClickedOnEntityProcedure.execute(this.level, getX(), getY(), getZ(), this, sourceentity);
        return retval;
    }

    public void awardKillScore(Entity entity, int score, DamageSource damageSource) {
        awardKillScore(entity, score, damageSource);
        ProtectorSlimelingThisEntityKillsAnotherOneProcedure.execute(this.level, getX(), getY(), getZ(), entity, this);
    }

    public AgeableMob getBreedOffspring(ServerLevel serverWorld, AgeableMob ageable) {
        ProtectorSlimelingEntity retval = ((EntityType) LatexModEntities.PROTECTOR_SLIMELING.get()).create(serverWorld);
        retval.finalizeSpawn(serverWorld, serverWorld.getCurrentDifficultyAt(retval.blockPosition()), MobSpawnType.BREEDING, null, null);
        return retval;
    }

    public boolean isFood(ItemStack stack) {
        return List.of((Item) LatexModItems.DARKLATEXGOO.get(), Items.SLIME_BALL, (Item) LatexModItems.LATEX_SOUP.get()).contains(stack.getItem());
    }

    public static void init() {
        DungeonHooks.addDungeonMob((EntityType) LatexModEntities.PROTECTOR_SLIMELING.get(), 180);
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes().add(Attributes.MOVEMENT_SPEED, 0.3d).add(Attributes.MAX_HEALTH, 32.0d).add(Attributes.ARMOR, 0.0d).add(Attributes.ATTACK_DAMAGE, 3.0d).add(Attributes.FOLLOW_RANGE, 16.0d).add(Attributes.KNOCKBACK_RESISTANCE, 0.1d);
    }
}
