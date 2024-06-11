package net.mcreator.latexes.entity;

import java.util.List;
import java.util.Set;
import net.mcreator.latexes.init.LatexModBlocks;
import net.mcreator.latexes.init.LatexModEntities;
import net.mcreator.latexes.init.LatexModItems;
import net.mcreator.latexes.procedures.CheckentityislatexProcedure;
import net.mcreator.latexes.procedures.CheckiftamedProcedure;
import net.mcreator.latexes.procedures.SlimelingEntityDiesProcedure;
import net.mcreator.latexes.procedures.SlimelingRightClickedOnEntityProcedure;
import net.mcreator.latexes.procedures.SlimelingThisEntityKillsAnotherOneProcedure;
import net.mcreator.latexes.procedures.SlimelingattackconditionsProcedure;
import net.minecraft.core.BlockPos;
import net.minecraft.network.protocol.Packet;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.AreaEffectCloud;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.SpawnPlacements;
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
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.common.DungeonHooks;
import net.minecraftforge.event.ForgeEventFactory;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber
/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/SlimelingEntity.class */
public class SlimelingEntity extends TamableAnimal {
    private static final Set<ResourceLocation> SPAWN_BIOMES = Set.of(new ResourceLocation("windswept_hills"), new ResourceLocation("plains"), new ResourceLocation("swamp"));

    @SubscribeEvent
    public static void addLivingEntityToBiomes(BiomeLoadingEvent event) {
        if (SPAWN_BIOMES.contains(event.getName())) {
            event.getSpawns().getSpawner(MobCategory.CREATURE).add(new MobSpawnSettings.SpawnerData((EntityType) LatexModEntities.SLIMELING.get(), 6, 1, 3));
        }
    }

    public SlimelingEntity(PlayMessages.SpawnEntity packet, Level world) {
        this((EntityType) LatexModEntities.SLIMELING.get(), world);
    }

    public SlimelingEntity(EntityType<SlimelingEntity> type, Level world) {
        super(type, world);
        this.xpReward = 4;
        setNoAi(false);
        setPersistenceRequired();
    }

    public Packet<?> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }

    protected void registerGoals() {
        registerGoals();
        this.goalSelector.addGoal(1, new FollowOwnerGoal(this, 1.0d, 9.0f, 2.0f, false));
        this.targetSelector.addGoal(2, new OwnerHurtTargetGoal(this));
        this.goalSelector.addGoal(3, new OwnerHurtByTargetGoal(this));
        this.goalSelector.addGoal(4, new AnonymousClass1(this, 1.2d, false));
        this.targetSelector.addGoal(5, new AnonymousClass2(this, LivingEntity.class, false, false));
        this.targetSelector.addGoal(6, new AnonymousClass3(this, Player.class, true, false));
        this.targetSelector.addGoal(7, new AnonymousClass4(this, EvilScientistEntity.class, true, false));
        this.targetSelector.addGoal(8, new AnonymousClass5(this, ScientistEntity.class, true, false));
        this.targetSelector.addGoal(9, new AnonymousClass6(this, Pillager.class, true, false));
        this.targetSelector.addGoal(10, new AnonymousClass7(this, Vindicator.class, true, false));
        this.targetSelector.addGoal(11, new AnonymousClass8(this, Illusioner.class, true, false));
        this.targetSelector.addGoal(12, new AnonymousClass9(this, Evoker.class, true, false));
        this.targetSelector.addGoal(13, new AnonymousClass10(this, PiglinBrute.class, true, false));
        this.targetSelector.addGoal(14, new AnonymousClass11(this, Villager.class, true, false));
        this.targetSelector.addGoal(15, new AnonymousClass12(this, WanderingTrader.class, true, false));
        this.targetSelector.addGoal(16, new AnonymousClass13(this, Piglin.class, true, false));
        this.goalSelector.addGoal(17, new RemoveBlockGoal((Block) LatexModBlocks.DARKLATEXICE.get(), this, 1.0d, 3));
        this.goalSelector.addGoal(18, new RemoveBlockGoal((Block) LatexModBlocks.DARKLATEXBLOCKCRYSTALGROW.get(), this, 1.0d, 3));
        this.goalSelector.addGoal(19, new RemoveBlockGoal((Block) LatexModBlocks.DARKLATEXBLOCK.get(), this, 1.0d, 3));
        this.goalSelector.addGoal(20, new RemoveBlockGoal((Block) LatexModBlocks.DARKLATEXCARPET.get(), this, 1.0d, 3));
        this.goalSelector.addGoal(21, new RemoveBlockGoal((Block) LatexModBlocks.DARKLATEXLEAVES.get(), this, 1.0d, 3));
        this.goalSelector.addGoal(22, new RemoveBlockGoal((Block) LatexModBlocks.DARKLATEXLOG.get(), this, 1.0d, 3));
        this.goalSelector.addGoal(23, new RemoveBlockGoal((Block) LatexModBlocks.DARKLATEXCRYSTALEGG.get(), this, 1.0d, 3));
        this.goalSelector.addGoal(24, new RemoveBlockGoal((Block) LatexModBlocks.DARKLATEXHIVE.get(), this, 1.0d, 3));
        this.goalSelector.addGoal(25, new AnonymousClass14(this, Player.class, 9.0f));
        this.goalSelector.addGoal(26, new AnonymousClass15(this, Villager.class, 9.0f));
        this.goalSelector.addGoal(27, new AnonymousClass16(this, WanderingTrader.class, 9.0f));
        this.goalSelector.addGoal(28, new AnonymousClass17(this, 0.8d, Ingredient.of(new ItemLike[]{(ItemLike) LatexModItems.DARKLATEXGOO.get()}), true));
        this.goalSelector.addGoal(29, new RandomStrollGoal(this, 1.0d));
        this.goalSelector.addGoal(30, new OpenDoorGoal(this, true));
        this.goalSelector.addGoal(31, new OpenDoorGoal(this, false));
        this.targetSelector.addGoal(32, new HurtByTargetGoal(this, new Class[0]).setAlertOthers(new Class[0]));
        this.goalSelector.addGoal(33, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(34, new FloatGoal(this));
    }

    /* renamed from: net.mcreator.latexes.entity.SlimelingEntity$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/SlimelingEntity$1.class */
    class AnonymousClass1 extends MeleeAttackGoal {
        AnonymousClass1(PathfinderMob arg0, double arg1, boolean arg2) {
            super(arg0, arg1, arg2);
        }

        protected double getAttackReachSqr(LivingEntity entity) {
            return 4.0d + ((double) (entity.getBbWidth() * entity.getBbWidth()));
        }
    }

    /* renamed from: net.mcreator.latexes.entity.SlimelingEntity$2  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/SlimelingEntity$2.class */
    class AnonymousClass2 extends NearestAttackableTargetGoal {
        AnonymousClass2(Mob arg0, Class arg1, boolean arg2, boolean arg3) {
            super(arg0, arg1, arg2, arg3);
        }

        public boolean canUse() {
            SlimelingEntity.this.getX();
            SlimelingEntity.this.getY();
            SlimelingEntity.this.getZ();
            Entity entity = SlimelingEntity.this;
            Level level = SlimelingEntity.this.level;
            return canUse() && CheckentityislatexProcedure.execute(entity);
        }
    }

    /* renamed from: net.mcreator.latexes.entity.SlimelingEntity$3  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/SlimelingEntity$3.class */
    class AnonymousClass3 extends NearestAttackableTargetGoal {
        AnonymousClass3(Mob arg0, Class arg1, boolean arg2, boolean arg3) {
            super(arg0, arg1, arg2, arg3);
        }

        public boolean canUse() {
            return canUse() && SlimelingattackconditionsProcedure.execute(SlimelingEntity.this.level, SlimelingEntity.this.getX(), SlimelingEntity.this.getY(), SlimelingEntity.this.getZ(), SlimelingEntity.this);
        }
    }

    /* renamed from: net.mcreator.latexes.entity.SlimelingEntity$4  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/SlimelingEntity$4.class */
    class AnonymousClass4 extends NearestAttackableTargetGoal {
        AnonymousClass4(Mob arg0, Class arg1, boolean arg2, boolean arg3) {
            super(arg0, arg1, arg2, arg3);
        }

        public boolean canUse() {
            return canUse() && CheckiftamedProcedure.execute(SlimelingEntity.this.level, SlimelingEntity.this.getX(), SlimelingEntity.this.getY(), SlimelingEntity.this.getZ(), SlimelingEntity.this);
        }
    }

    /* renamed from: net.mcreator.latexes.entity.SlimelingEntity$5  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/SlimelingEntity$5.class */
    class AnonymousClass5 extends NearestAttackableTargetGoal {
        AnonymousClass5(Mob arg0, Class arg1, boolean arg2, boolean arg3) {
            super(arg0, arg1, arg2, arg3);
        }

        public boolean canUse() {
            return canUse() && CheckiftamedProcedure.execute(SlimelingEntity.this.level, SlimelingEntity.this.getX(), SlimelingEntity.this.getY(), SlimelingEntity.this.getZ(), SlimelingEntity.this);
        }
    }

    /* renamed from: net.mcreator.latexes.entity.SlimelingEntity$6  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/SlimelingEntity$6.class */
    class AnonymousClass6 extends NearestAttackableTargetGoal {
        AnonymousClass6(Mob arg0, Class arg1, boolean arg2, boolean arg3) {
            super(arg0, arg1, arg2, arg3);
        }

        public boolean canUse() {
            return canUse() && CheckiftamedProcedure.execute(SlimelingEntity.this.level, SlimelingEntity.this.getX(), SlimelingEntity.this.getY(), SlimelingEntity.this.getZ(), SlimelingEntity.this);
        }
    }

    /* renamed from: net.mcreator.latexes.entity.SlimelingEntity$7  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/SlimelingEntity$7.class */
    class AnonymousClass7 extends NearestAttackableTargetGoal {
        AnonymousClass7(Mob arg0, Class arg1, boolean arg2, boolean arg3) {
            super(arg0, arg1, arg2, arg3);
        }

        public boolean canUse() {
            return canUse() && CheckiftamedProcedure.execute(SlimelingEntity.this.level, SlimelingEntity.this.getX(), SlimelingEntity.this.getY(), SlimelingEntity.this.getZ(), SlimelingEntity.this);
        }
    }

    /* renamed from: net.mcreator.latexes.entity.SlimelingEntity$8  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/SlimelingEntity$8.class */
    class AnonymousClass8 extends NearestAttackableTargetGoal {
        AnonymousClass8(Mob arg0, Class arg1, boolean arg2, boolean arg3) {
            super(arg0, arg1, arg2, arg3);
        }

        public boolean canUse() {
            return canUse() && CheckiftamedProcedure.execute(SlimelingEntity.this.level, SlimelingEntity.this.getX(), SlimelingEntity.this.getY(), SlimelingEntity.this.getZ(), SlimelingEntity.this);
        }
    }

    /* renamed from: net.mcreator.latexes.entity.SlimelingEntity$9  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/SlimelingEntity$9.class */
    class AnonymousClass9 extends NearestAttackableTargetGoal {
        AnonymousClass9(Mob arg0, Class arg1, boolean arg2, boolean arg3) {
            super(arg0, arg1, arg2, arg3);
        }

        public boolean canUse() {
            return canUse() && CheckiftamedProcedure.execute(SlimelingEntity.this.level, SlimelingEntity.this.getX(), SlimelingEntity.this.getY(), SlimelingEntity.this.getZ(), SlimelingEntity.this);
        }
    }

    /* renamed from: net.mcreator.latexes.entity.SlimelingEntity$10  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/SlimelingEntity$10.class */
    class AnonymousClass10 extends NearestAttackableTargetGoal {
        AnonymousClass10(Mob arg0, Class arg1, boolean arg2, boolean arg3) {
            super(arg0, arg1, arg2, arg3);
        }

        public boolean canUse() {
            return canUse() && CheckiftamedProcedure.execute(SlimelingEntity.this.level, SlimelingEntity.this.getX(), SlimelingEntity.this.getY(), SlimelingEntity.this.getZ(), SlimelingEntity.this);
        }
    }

    /* renamed from: net.mcreator.latexes.entity.SlimelingEntity$11  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/SlimelingEntity$11.class */
    class AnonymousClass11 extends NearestAttackableTargetGoal {
        AnonymousClass11(Mob arg0, Class arg1, boolean arg2, boolean arg3) {
            super(arg0, arg1, arg2, arg3);
        }

        public boolean canUse() {
            return canUse() && CheckiftamedProcedure.execute(SlimelingEntity.this.level, SlimelingEntity.this.getX(), SlimelingEntity.this.getY(), SlimelingEntity.this.getZ(), SlimelingEntity.this);
        }
    }

    /* renamed from: net.mcreator.latexes.entity.SlimelingEntity$12  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/SlimelingEntity$12.class */
    class AnonymousClass12 extends NearestAttackableTargetGoal {
        AnonymousClass12(Mob arg0, Class arg1, boolean arg2, boolean arg3) {
            super(arg0, arg1, arg2, arg3);
        }

        public boolean canUse() {
            return canUse() && CheckiftamedProcedure.execute(SlimelingEntity.this.level, SlimelingEntity.this.getX(), SlimelingEntity.this.getY(), SlimelingEntity.this.getZ(), SlimelingEntity.this);
        }
    }

    /* renamed from: net.mcreator.latexes.entity.SlimelingEntity$13  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/SlimelingEntity$13.class */
    class AnonymousClass13 extends NearestAttackableTargetGoal {
        AnonymousClass13(Mob arg0, Class arg1, boolean arg2, boolean arg3) {
            super(arg0, arg1, arg2, arg3);
        }

        public boolean canUse() {
            return canUse() && CheckiftamedProcedure.execute(SlimelingEntity.this.level, SlimelingEntity.this.getX(), SlimelingEntity.this.getY(), SlimelingEntity.this.getZ(), SlimelingEntity.this);
        }
    }

    /* renamed from: net.mcreator.latexes.entity.SlimelingEntity$14  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/SlimelingEntity$14.class */
    class AnonymousClass14 extends LookAtPlayerGoal {
        AnonymousClass14(Mob arg0, Class cls, float arg2) {
            super(arg0, cls, arg2);
        }

        public boolean canUse() {
            return canUse() && CheckiftamedProcedure.execute(SlimelingEntity.this.level, SlimelingEntity.this.getX(), SlimelingEntity.this.getY(), SlimelingEntity.this.getZ(), SlimelingEntity.this);
        }
    }

    /* renamed from: net.mcreator.latexes.entity.SlimelingEntity$15  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/SlimelingEntity$15.class */
    class AnonymousClass15 extends LookAtPlayerGoal {
        AnonymousClass15(Mob arg0, Class cls, float arg2) {
            super(arg0, cls, arg2);
        }

        public boolean canUse() {
            return canUse() && CheckiftamedProcedure.execute(SlimelingEntity.this.level, SlimelingEntity.this.getX(), SlimelingEntity.this.getY(), SlimelingEntity.this.getZ(), SlimelingEntity.this);
        }
    }

    /* renamed from: net.mcreator.latexes.entity.SlimelingEntity$16  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/SlimelingEntity$16.class */
    class AnonymousClass16 extends LookAtPlayerGoal {
        AnonymousClass16(Mob arg0, Class cls, float arg2) {
            super(arg0, cls, arg2);
        }

        public boolean canUse() {
            return canUse() && CheckiftamedProcedure.execute(SlimelingEntity.this.level, SlimelingEntity.this.getX(), SlimelingEntity.this.getY(), SlimelingEntity.this.getZ(), SlimelingEntity.this);
        }
    }

    /* renamed from: net.mcreator.latexes.entity.SlimelingEntity$17  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/SlimelingEntity$17.class */
    class AnonymousClass17 extends TemptGoal {
        AnonymousClass17(PathfinderMob arg0, double arg1, Ingredient arg2, boolean arg3) {
            super(arg0, arg1, arg2, arg3);
        }

        public boolean canUse() {
            return canUse() && CheckiftamedProcedure.execute(SlimelingEntity.this.level, SlimelingEntity.this.getX(), SlimelingEntity.this.getY(), SlimelingEntity.this.getZ(), SlimelingEntity.this);
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

    public void die(DamageSource source) {
        die(source);
        SlimelingEntityDiesProcedure.execute(this.level, getX(), getY(), getZ());
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
        SlimelingRightClickedOnEntityProcedure.execute(this.level, getX(), getY(), getZ(), this, sourceentity);
        return retval;
    }

    public void awardKillScore(Entity entity, int score, DamageSource damageSource) {
        awardKillScore(entity, score, damageSource);
        SlimelingThisEntityKillsAnotherOneProcedure.execute(this.level, getX(), getY(), getZ(), entity, this);
    }

    public AgeableMob getBreedOffspring(ServerLevel serverWorld, AgeableMob ageable) {
        SlimelingEntity retval = ((EntityType) LatexModEntities.SLIMELING.get()).create(serverWorld);
        retval.finalizeSpawn(serverWorld, serverWorld.getCurrentDifficultyAt(retval.blockPosition()), MobSpawnType.BREEDING, null, null);
        return retval;
    }

    public boolean isFood(ItemStack stack) {
        return List.of().contains(stack.getItem());
    }

    public static void init() {
        SpawnPlacements.register((EntityType) LatexModEntities.SLIMELING.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, entityType, world, reason, pos, random -> {
            return world.getBlockState(pos.below()).getMaterial() == Material.GRASS && world.getRawBrightness(pos, 0) > 8;
        });
        DungeonHooks.addDungeonMob((EntityType) LatexModEntities.SLIMELING.get(), 180);
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes().add(Attributes.MOVEMENT_SPEED, 0.3d).add(Attributes.MAX_HEALTH, 20.0d).add(Attributes.ARMOR, 0.0d).add(Attributes.ATTACK_DAMAGE, 2.0d).add(Attributes.FOLLOW_RANGE, 16.0d);
    }
}
