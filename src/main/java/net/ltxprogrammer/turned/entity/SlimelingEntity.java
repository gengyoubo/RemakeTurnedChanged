//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.ltxprogrammer.turned.entity;

import java.util.List;
import java.util.Set;
import net.ltxprogrammer.changed.block.AbstractLatexBlock;
import net.ltxprogrammer.changed.entity.LatexType;
import net.ltxprogrammer.changed.init.ChangedBlocks;
import net.ltxprogrammer.changed.init.ChangedItems;
import net.ltxprogrammer.turned.entity.ai.RevertBlockStateGoal;
import net.ltxprogrammer.turned.entity.ai.TargetCheck;
import net.ltxprogrammer.turned.init.LatexModBlocks;
import net.ltxprogrammer.turned.init.LatexModEntities;
import net.ltxprogrammer.turned.init.LatexModItems;
import net.ltxprogrammer.turned.procedures.CheckiftamedProcedure;
import net.ltxprogrammer.turned.procedures.SlimelingEntityDiesProcedure;
import net.ltxprogrammer.turned.procedures.SlimelingRightClickedOnEntityProcedure;
import net.ltxprogrammer.turned.procedures.SlimelingThisEntityKillsAnotherOneProcedure;
import net.ltxprogrammer.turned.procedures.SlimelingattackconditionsProcedure;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
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
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.SpawnPlacements.Type;
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
import net.minecraft.world.level.levelgen.Heightmap.Types;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.common.DungeonHooks;
import net.minecraftforge.event.ForgeEventFactory;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.registries.ForgeRegistries;

@EventBusSubscriber
public class SlimelingEntity extends TamableAnimal {
    private static final Set<ResourceLocation> SPAWN_BIOMES = Set.of(new ResourceLocation("windswept_hills"), new ResourceLocation("plains"), new ResourceLocation("swamp"));

    @SubscribeEvent
    public static void addLivingEntityToBiomes(BiomeLoadingEvent event) {
        if (SPAWN_BIOMES.contains(event.getName())) {
            event.getSpawns().getSpawner(MobCategory.CREATURE).add(new MobSpawnSettings.SpawnerData((EntityType)LatexModEntities.SLIMELING.get(), 6, 1, 3));
        }

    }

    public SlimelingEntity(PlayMessages.SpawnEntity packet, Level world) {
        this((EntityType)LatexModEntities.SLIMELING.get(), world);
    }

    public SlimelingEntity(EntityType<SlimelingEntity> type, Level world) {
        super(type, world);
        this.xpReward = 4;
        this.setNoAi(false);
        this.setPersistenceRequired();
    }

    public Packet<?> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }

    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(1, new FollowOwnerGoal(this, 1.0, 9.0F, 2.0F, false));
        this.targetSelector.addGoal(2, new OwnerHurtTargetGoal(this));
        this.goalSelector.addGoal(3, new OwnerHurtByTargetGoal(this));
        this.goalSelector.addGoal(4, new MeleeAttackGoal(this, 1.2, false) {
            protected double getAttackReachSqr(LivingEntity entity) {
                return 4.0 + (double)(entity.getBbWidth() * entity.getBbWidth());
            }
        });
        this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, LivingEntity.class, 10, false, false, TargetCheck.IS_LATEX));
        this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, Player.class, true, false) {
            public boolean canUse() {
                double x = SlimelingEntity.this.getX();
                double y = SlimelingEntity.this.getY();
                double z = SlimelingEntity.this.getZ();
                Entity entity = SlimelingEntity.this;
                Level world = SlimelingEntity.this.level;
                return super.canUse() && SlimelingattackconditionsProcedure.execute(world, x, y, z, entity);
            }
        });
        this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, EvilScientistEntity.class, true, false) {
            public boolean canUse() {
                double x = SlimelingEntity.this.getX();
                double y = SlimelingEntity.this.getY();
                double z = SlimelingEntity.this.getZ();
                Entity entity = SlimelingEntity.this;
                Level world = SlimelingEntity.this.level;
                return super.canUse() && CheckiftamedProcedure.execute(world, x, y, z, entity);
            }
        });
        this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, ScientistEntity.class, true, false) {
            public boolean canUse() {
                double x = SlimelingEntity.this.getX();
                double y = SlimelingEntity.this.getY();
                double z = SlimelingEntity.this.getZ();
                Entity entity = SlimelingEntity.this;
                Level world = SlimelingEntity.this.level;
                return super.canUse() && CheckiftamedProcedure.execute(world, x, y, z, entity);
            }
        });
        this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, Pillager.class, true, false) {
            public boolean canUse() {
                double x = SlimelingEntity.this.getX();
                double y = SlimelingEntity.this.getY();
                double z = SlimelingEntity.this.getZ();
                Entity entity = SlimelingEntity.this;
                Level world = SlimelingEntity.this.level;
                return super.canUse() && CheckiftamedProcedure.execute(world, x, y, z, entity);
            }
        });
        this.targetSelector.addGoal(10, new NearestAttackableTargetGoal(this, Vindicator.class, true, false) {
            public boolean canUse() {
                double x = SlimelingEntity.this.getX();
                double y = SlimelingEntity.this.getY();
                double z = SlimelingEntity.this.getZ();
                Entity entity = SlimelingEntity.this;
                Level world = SlimelingEntity.this.level;
                return super.canUse() && CheckiftamedProcedure.execute(world, x, y, z, entity);
            }
        });
        this.targetSelector.addGoal(11, new NearestAttackableTargetGoal(this, Illusioner.class, true, false) {
            public boolean canUse() {
                double x = SlimelingEntity.this.getX();
                double y = SlimelingEntity.this.getY();
                double z = SlimelingEntity.this.getZ();
                Entity entity = SlimelingEntity.this;
                Level world = SlimelingEntity.this.level;
                return super.canUse() && CheckiftamedProcedure.execute(world, x, y, z, entity);
            }
        });
        this.targetSelector.addGoal(12, new NearestAttackableTargetGoal(this, Evoker.class, true, false) {
            public boolean canUse() {
                double x = SlimelingEntity.this.getX();
                double y = SlimelingEntity.this.getY();
                double z = SlimelingEntity.this.getZ();
                Entity entity = SlimelingEntity.this;
                Level world = SlimelingEntity.this.level;
                return super.canUse() && CheckiftamedProcedure.execute(world, x, y, z, entity);
            }
        });
        this.targetSelector.addGoal(13, new NearestAttackableTargetGoal(this, PiglinBrute.class, true, false) {
            public boolean canUse() {
                double x = SlimelingEntity.this.getX();
                double y = SlimelingEntity.this.getY();
                double z = SlimelingEntity.this.getZ();
                Entity entity = SlimelingEntity.this;
                Level world = SlimelingEntity.this.level;
                return super.canUse() && CheckiftamedProcedure.execute(world, x, y, z, entity);
            }
        });
        this.targetSelector.addGoal(14, new NearestAttackableTargetGoal(this, Villager.class, true, false) {
            public boolean canUse() {
                double x = SlimelingEntity.this.getX();
                double y = SlimelingEntity.this.getY();
                double z = SlimelingEntity.this.getZ();
                Entity entity = SlimelingEntity.this;
                Level world = SlimelingEntity.this.level;
                return super.canUse() && CheckiftamedProcedure.execute(world, x, y, z, entity);
            }
        });
        this.targetSelector.addGoal(15, new NearestAttackableTargetGoal(this, WanderingTrader.class, true, false) {
            public boolean canUse() {
                double x = SlimelingEntity.this.getX();
                double y = SlimelingEntity.this.getY();
                double z = SlimelingEntity.this.getZ();
                Entity entity = SlimelingEntity.this;
                Level world = SlimelingEntity.this.level;
                return super.canUse() && CheckiftamedProcedure.execute(world, x, y, z, entity);
            }
        });
        this.targetSelector.addGoal(16, new NearestAttackableTargetGoal(this, Piglin.class, true, false) {
            public boolean canUse() {
                double x = SlimelingEntity.this.getX();
                double y = SlimelingEntity.this.getY();
                double z = SlimelingEntity.this.getZ();
                Entity entity = SlimelingEntity.this;
                Level world = SlimelingEntity.this.level;
                return super.canUse() && CheckiftamedProcedure.execute(world, x, y, z, entity);
            }
        });
        this.goalSelector.addGoal(12, new RevertBlockStateGoal(AbstractLatexBlock.COVERED, LatexType.DARK_LATEX, LatexType.NEUTRAL, this, 1.0, 3));
        this.goalSelector.addGoal(12, new RevertBlockStateGoal(AbstractLatexBlock.COVERED, LatexType.WHITE_LATEX, LatexType.NEUTRAL, this, 1.0, 3));
        this.goalSelector.addGoal(13, new RemoveBlockGoal((Block)ChangedBlocks.DARK_LATEX_ICE.get(), this, 1.0, 3));
        this.goalSelector.addGoal(14, new RemoveBlockGoal((Block)ChangedBlocks.LATEX_CRYSTAL.get(), this, 1.0, 3));
        this.goalSelector.addGoal(15, new RemoveBlockGoal((Block)ChangedBlocks.DARK_LATEX_BLOCK.get(), this, 1.0, 3));
        this.goalSelector.addGoal(20, new RemoveBlockGoal((Block)LatexModBlocks.DARKLATEXHIVE.get(), this, 1.0, 3));
        this.goalSelector.addGoal(24, new RemoveBlockGoal((Block)LatexModBlocks.DARKLATEXHIVE.get(), this, 1.0, 3));
        this.goalSelector.addGoal(25, new LookAtPlayerGoal(this, Player.class, 9.0F) {
            public boolean canUse() {
                double x = SlimelingEntity.this.getX();
                double y = SlimelingEntity.this.getY();
                double z = SlimelingEntity.this.getZ();
                Entity entity = SlimelingEntity.this;
                Level world = SlimelingEntity.this.level;
                return super.canUse() && CheckiftamedProcedure.execute(world, x, y, z, entity);
            }
        });
        this.goalSelector.addGoal(26, new LookAtPlayerGoal(this, Villager.class, 9.0F) {
            public boolean canUse() {
                double x = SlimelingEntity.this.getX();
                double y = SlimelingEntity.this.getY();
                double z = SlimelingEntity.this.getZ();
                Entity entity = SlimelingEntity.this;
                Level world = SlimelingEntity.this.level;
                return super.canUse() && CheckiftamedProcedure.execute(world, x, y, z, entity);
            }
        });
        this.goalSelector.addGoal(27, new LookAtPlayerGoal(this, WanderingTrader.class, 9.0F) {
            public boolean canUse() {
                double x = SlimelingEntity.this.getX();
                double y = SlimelingEntity.this.getY();
                double z = SlimelingEntity.this.getZ();
                Entity entity = SlimelingEntity.this;
                Level world = SlimelingEntity.this.level;
                return super.canUse() && CheckiftamedProcedure.execute(world, x, y, z, entity);
            }
        });
        this.goalSelector.addGoal(28, new TemptGoal(this, 0.8, Ingredient.of(new ItemLike[]{(ItemLike)ChangedItems.DARK_LATEX_GOO.get()}), true) {
            public boolean canUse() {
                double x = SlimelingEntity.this.getX();
                double y = SlimelingEntity.this.getY();
                double z = SlimelingEntity.this.getZ();
                Entity entity = SlimelingEntity.this;
                Level world = SlimelingEntity.this.level;
                return super.canUse() && CheckiftamedProcedure.execute(world, x, y, z, entity);
            }
        });
        this.goalSelector.addGoal(29, new RandomStrollGoal(this, 1.0));
        this.goalSelector.addGoal(30, new OpenDoorGoal(this, true));
        this.goalSelector.addGoal(31, new OpenDoorGoal(this, false));
        this.targetSelector.addGoal(32, (new HurtByTargetGoal(this, new Class[0])).setAlertOthers(new Class[0]));
        this.goalSelector.addGoal(33, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(34, new FloatGoal(this));
    }

    public MobType getMobType() {
        return MobType.UNDEFINED;
    }

    public boolean removeWhenFarAway(double distanceToClosestPlayer) {
        return false;
    }

    protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHitIn) {
        super.dropCustomDeathLoot(source, looting, recentlyHitIn);
        this.spawnAtLocation(new ItemStack((ItemLike)LatexModItems.SLIMEESSENCE.get()));
    }

    public void playStepSound(BlockPos pos, BlockState blockIn) {
        this.playSound((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.squish")), 0.15F, 1.0F);
    }

    public SoundEvent getHurtSound(DamageSource ds) {
        return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.hurt"));
    }

    public SoundEvent getDeathSound() {
        return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.death"));
    }

    public boolean hurt(DamageSource source, float amount) {
        if (!(source.getDirectEntity() instanceof ThrownPotion) && !(source.getDirectEntity() instanceof AreaEffectCloud)) {
            if (source == DamageSource.FALL) {
                return false;
            } else if (source == DamageSource.CACTUS) {
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

    public void die(DamageSource source) {
        super.die(source);
        SlimelingEntityDiesProcedure.execute(this.level, this.getX(), this.getY(), this.getZ());
    }

    public InteractionResult mobInteract(Player sourceentity, InteractionHand hand) {
        ItemStack itemstack = sourceentity.getItemInHand(hand);
        InteractionResult retval = InteractionResult.sidedSuccess(this.level.isClientSide());
        Item item = itemstack.getItem();
        if (itemstack.getItem() instanceof SpawnEggItem) {
            retval = super.mobInteract(sourceentity, hand);
        } else if (this.level.isClientSide()) {
            retval = (!this.isTame() || !this.isOwnedBy(sourceentity)) && !this.isFood(itemstack) ? InteractionResult.PASS : InteractionResult.sidedSuccess(this.level.isClientSide());
        } else if (this.isTame()) {
            if (this.isOwnedBy(sourceentity)) {
                if (item.isEdible() && this.isFood(itemstack) && this.getHealth() < this.getMaxHealth()) {
                    this.usePlayerItem(sourceentity, hand, itemstack);
                    this.heal((float)item.getFoodProperties().getNutrition());
                    retval = InteractionResult.sidedSuccess(this.level.isClientSide());
                } else if (this.isFood(itemstack) && this.getHealth() < this.getMaxHealth()) {
                    this.usePlayerItem(sourceentity, hand, itemstack);
                    this.heal(4.0F);
                    retval = InteractionResult.sidedSuccess(this.level.isClientSide());
                } else {
                    retval = super.mobInteract(sourceentity, hand);
                }
            }
        } else if (this.isFood(itemstack)) {
            this.usePlayerItem(sourceentity, hand, itemstack);
            if (this.random.nextInt(3) == 0 && !ForgeEventFactory.onAnimalTame(this, sourceentity)) {
                this.tame(sourceentity);
                this.level.broadcastEntityEvent(this, (byte)7);
            } else {
                this.level.broadcastEntityEvent(this, (byte)6);
            }

            this.setPersistenceRequired();
            retval = InteractionResult.sidedSuccess(this.level.isClientSide());
        } else {
            retval = super.mobInteract(sourceentity, hand);
            if (retval == InteractionResult.SUCCESS || retval == InteractionResult.CONSUME) {
                this.setPersistenceRequired();
            }
        }

        double x = this.getX();
        double y = this.getY();
        double z = this.getZ();
        Entity entity = this;
        Level world = this.level;
        SlimelingRightClickedOnEntityProcedure.execute(world, x, y, z, entity, sourceentity);
        return retval;
    }

    public void awardKillScore(Entity entity, int score, DamageSource damageSource) {
        super.awardKillScore(entity, score, damageSource);
        SlimelingThisEntityKillsAnotherOneProcedure.execute(this.level, this.getX(), this.getY(), this.getZ(), entity, this);
    }

    public AgeableMob getBreedOffspring(ServerLevel serverWorld, AgeableMob ageable) {
        SlimelingEntity retval = (SlimelingEntity)((EntityType)LatexModEntities.SLIMELING.get()).create(serverWorld);
        retval.finalizeSpawn(serverWorld, serverWorld.getCurrentDifficultyAt(retval.blockPosition()), MobSpawnType.BREEDING, (SpawnGroupData)null, (CompoundTag)null);
        return retval;
    }

    public boolean isFood(ItemStack stack) {
        return List.of().contains(stack.getItem());
    }

    public static void init() {
        SpawnPlacements.register((EntityType)LatexModEntities.SLIMELING.get(), Type.ON_GROUND, Types.MOTION_BLOCKING_NO_LEAVES, (entityType, world, reason, pos, random) -> {
            return world.getBlockState(pos.below()).getMaterial() == Material.GRASS && world.getRawBrightness(pos, 0) > 8;
        });
        DungeonHooks.addDungeonMob((EntityType)LatexModEntities.SLIMELING.get(), 180);
    }

    public static AttributeSupplier.Builder createAttributes() {
        AttributeSupplier.Builder builder = Mob.createMobAttributes();
        builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
        builder = builder.add(Attributes.MAX_HEALTH, 20.0);
        builder = builder.add(Attributes.ARMOR, 0.0);
        builder = builder.add(Attributes.ATTACK_DAMAGE, 2.0);
        builder = builder.add(Attributes.FOLLOW_RANGE, 16.0);
        return builder;
    }
}
