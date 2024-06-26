//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.mcreator.latexes.entity;

import java.util.List;
import javax.annotation.Nullable;
import net.mcreator.latexes.init.LatexModBlocks;
import net.mcreator.latexes.init.LatexModEntities;
import net.mcreator.latexes.init.LatexModItems;
import net.mcreator.latexes.procedures.CheckEvilProcedure;
import net.mcreator.latexes.procedures.CheckentityislatexProcedure;
import net.mcreator.latexes.procedures.CheckiftamedProcedure;
import net.mcreator.latexes.procedures.SlimelingEntityDiesProcedure;
import net.mcreator.latexes.procedures.SlimelingTamedOnInitialEntitySpawnProcedure;
import net.mcreator.latexes.procedures.SlimelingTamedRightClickedOnEntityProcedure;
import net.mcreator.latexes.procedures.SlimelingThisEntityKillsAnotherOneProcedure;
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
import org.jetbrains.annotations.NotNull;

public class SlimelingTamedEntity extends TamableAnimal {
    public SlimelingTamedEntity(PlayMessages.SpawnEntity packet, Level world) {
        this((EntityType)LatexModEntities.SLIMELING_TAMED.get(), world);
    }

    public SlimelingTamedEntity(EntityType<SlimelingTamedEntity> type, Level world) {
        super(type, world);
        this.xpReward = 4;
        this.setNoAi(false);
        this.setPersistenceRequired();
    }

    public @NotNull Packet<?> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }

    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(1, new FollowOwnerGoal(this, 0.9, 12.0F, 2.0F, false));
        this.targetSelector.addGoal(2, new OwnerHurtTargetGoal(this));
        this.goalSelector.addGoal(3, new OwnerHurtByTargetGoal(this));
        this.goalSelector.addGoal(4, new MeleeAttackGoal(this, 1.2, false) {
            protected double getAttackReachSqr(@NotNull LivingEntity entity) {
                return 4.0 + (double)(entity.getBbWidth() * entity.getBbWidth());
            }
        });
        this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, Mob.class, false, false) {
            public boolean canUse() {
                double x = SlimelingTamedEntity.this.getX();
                double y = SlimelingTamedEntity.this.getY();
                double z = SlimelingTamedEntity.this.getZ();
                Entity entity = SlimelingTamedEntity.this;
                Level world = SlimelingTamedEntity.this.level;
                return super.canUse() && CheckentityislatexProcedure.execute(entity);
            }
        });
        this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, Mob.class, true, false) {
            public boolean canUse() {
                double x = SlimelingTamedEntity.this.getX();
                double y = SlimelingTamedEntity.this.getY();
                double z = SlimelingTamedEntity.this.getZ();
                Entity entity = SlimelingTamedEntity.this;
                Level world = SlimelingTamedEntity.this.level;
                return super.canUse() && CheckEvilProcedure.execute(entity);
            }
        });
        this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, Pillager.class, true, false) {
            public boolean canUse() {
                double x = SlimelingTamedEntity.this.getX();
                double y = SlimelingTamedEntity.this.getY();
                double z = SlimelingTamedEntity.this.getZ();
                Entity entity = SlimelingTamedEntity.this;
                Level world = SlimelingTamedEntity.this.level;
                return super.canUse() && CheckiftamedProcedure.execute(world, x, y, z, entity);
            }
        });
        this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, Vindicator.class, true, false) {
            public boolean canUse() {
                double x = SlimelingTamedEntity.this.getX();
                double y = SlimelingTamedEntity.this.getY();
                double z = SlimelingTamedEntity.this.getZ();
                Entity entity = SlimelingTamedEntity.this;
                Level world = SlimelingTamedEntity.this.level;
                return super.canUse() && CheckiftamedProcedure.execute(world, x, y, z, entity);
            }
        });
        this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, Illusioner.class, true, false) {
            public boolean canUse() {
                double x = SlimelingTamedEntity.this.getX();
                double y = SlimelingTamedEntity.this.getY();
                double z = SlimelingTamedEntity.this.getZ();
                Entity entity = SlimelingTamedEntity.this;
                Level world = SlimelingTamedEntity.this.level;
                return super.canUse() && CheckiftamedProcedure.execute(world, x, y, z, entity);
            }
        });
        this.targetSelector.addGoal(10, new NearestAttackableTargetGoal(this, Evoker.class, true, false) {
            public boolean canUse() {
                double x = SlimelingTamedEntity.this.getX();
                double y = SlimelingTamedEntity.this.getY();
                double z = SlimelingTamedEntity.this.getZ();
                Entity entity = SlimelingTamedEntity.this;
                Level world = SlimelingTamedEntity.this.level;
                return super.canUse() && CheckiftamedProcedure.execute(world, x, y, z, entity);
            }
        });
        this.targetSelector.addGoal(11, new NearestAttackableTargetGoal(this, PiglinBrute.class, true, false) {
            public boolean canUse() {
                double x = SlimelingTamedEntity.this.getX();
                double y = SlimelingTamedEntity.this.getY();
                double z = SlimelingTamedEntity.this.getZ();
                Entity entity = SlimelingTamedEntity.this;
                Level world = SlimelingTamedEntity.this.level;
                return super.canUse() && CheckiftamedProcedure.execute(world, x, y, z, entity);
            }
        });
        this.targetSelector.addGoal(12, new NearestAttackableTargetGoal(this, Piglin.class, true, false) {
            public boolean canUse() {
                double x = SlimelingTamedEntity.this.getX();
                double y = SlimelingTamedEntity.this.getY();
                double z = SlimelingTamedEntity.this.getZ();
                Entity entity = SlimelingTamedEntity.this;
                Level world = SlimelingTamedEntity.this.level;
                return super.canUse() && CheckiftamedProcedure.execute(world, x, y, z, entity);
            }
        });
        this.goalSelector.addGoal(13, new RemoveBlockGoal((Block)LatexModBlocks.DARKLATEXICE.get(), this, 1.0, 3));
        this.goalSelector.addGoal(14, new RemoveBlockGoal((Block)LatexModBlocks.DARKLATEXBLOCKCRYSTALGROW.get(), this, 1.0, 3));
        this.goalSelector.addGoal(15, new RemoveBlockGoal((Block)LatexModBlocks.DARKLATEXBLOCK.get(), this, 1.0, 3));
        this.goalSelector.addGoal(16, new RemoveBlockGoal((Block)LatexModBlocks.DARKLATEXCARPET.get(), this, 1.0, 3));
        this.goalSelector.addGoal(17, new RemoveBlockGoal((Block)LatexModBlocks.DARKLATEXLEAVES.get(), this, 1.0, 3));
        this.goalSelector.addGoal(18, new RemoveBlockGoal((Block)LatexModBlocks.DARKLATEXLOG.get(), this, 1.0, 3));
        this.goalSelector.addGoal(19, new RemoveBlockGoal((Block)LatexModBlocks.DARKLATEXCRYSTALEGG.get(), this, 1.0, 3));
        this.goalSelector.addGoal(20, new RemoveBlockGoal((Block)LatexModBlocks.DARKLATEXHIVE.get(), this, 1.0, 3));
        this.goalSelector.addGoal(21, new LookAtPlayerGoal(this, Player.class, 9.0F));
        this.goalSelector.addGoal(22, new LookAtPlayerGoal(this, ScientistEntity.class, 9.0F));
        this.goalSelector.addGoal(23, new LookAtPlayerGoal(this, Villager.class, 9.0F));
        this.goalSelector.addGoal(24, new LookAtPlayerGoal(this, WanderingTrader.class, 9.0F));
        this.goalSelector.addGoal(25, new TemptGoal(this, 0.6, Ingredient.of(new ItemLike[]{(ItemLike)LatexModItems.DARKLATEXGOO.get()}), true) {
            public boolean canUse() {
                double x = SlimelingTamedEntity.this.getX();
                double y = SlimelingTamedEntity.this.getY();
                double z = SlimelingTamedEntity.this.getZ();
                Entity entity = SlimelingTamedEntity.this;
                Level world = SlimelingTamedEntity.this.level;
                return super.canUse() && CheckiftamedProcedure.execute(world, x, y, z, entity);
            }
        });
        this.goalSelector.addGoal(26, new TemptGoal(this, 0.6, Ingredient.of(new ItemLike[]{Items.SLIME_BALL}), true) {
            public boolean canUse() {
                double x = SlimelingTamedEntity.this.getX();
                double y = SlimelingTamedEntity.this.getY();
                double z = SlimelingTamedEntity.this.getZ();
                Entity entity = SlimelingTamedEntity.this;
                Level world = SlimelingTamedEntity.this.level;
                return super.canUse() && CheckiftamedProcedure.execute(world, x, y, z, entity);
            }
        });
        this.goalSelector.addGoal(27, new TemptGoal(this, 0.7, Ingredient.of(new ItemLike[]{(ItemLike)LatexModItems.LATEX_SOUP.get()}), true) {
            public boolean canUse() {
                double x = SlimelingTamedEntity.this.getX();
                double y = SlimelingTamedEntity.this.getY();
                double z = SlimelingTamedEntity.this.getZ();
                Entity entity = SlimelingTamedEntity.this;
                Level world = SlimelingTamedEntity.this.level;
                return super.canUse() && CheckiftamedProcedure.execute(world, x, y, z, entity);
            }
        });
        this.goalSelector.addGoal(28, new RandomStrollGoal(this, 1.0));
        this.goalSelector.addGoal(29, new OpenDoorGoal(this, true));
        this.goalSelector.addGoal(30, new OpenDoorGoal(this, false));
        this.targetSelector.addGoal(31, (new HurtByTargetGoal(this, new Class[0])).setAlertOthers(new Class[0]));
        this.goalSelector.addGoal(32, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(33, new FloatGoal(this));
    }

    public @NotNull MobType getMobType() {
        return MobType.UNDEFINED;
    }

    public boolean removeWhenFarAway(double distanceToClosestPlayer) {
        return false;
    }

    protected void dropCustomDeathLoot(@NotNull DamageSource source, int looting, boolean recentlyHitIn) {
        super.dropCustomDeathLoot(source, looting, recentlyHitIn);
        this.spawnAtLocation(new ItemStack((ItemLike)LatexModItems.SLIMEESSENCE.get()));
    }

    public void playStepSound(@NotNull BlockPos pos, @NotNull BlockState blockIn) {
        this.playSound((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.squish")), 0.15F, 1.0F);
    }

    public SoundEvent getHurtSound(@NotNull DamageSource ds) {
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

    public void die(@NotNull DamageSource source) {
        super.die(source);
        SlimelingEntityDiesProcedure.execute(this.level, this.getX(), this.getY(), this.getZ());
    }

    public SpawnGroupData finalizeSpawn(@NotNull ServerLevelAccessor world, @NotNull DifficultyInstance difficulty, @NotNull MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
        SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata, tag);
        SlimelingTamedOnInitialEntitySpawnProcedure.execute(world, this.getX(), this.getY(), this.getZ(), this);
        return retval;
    }

    public @NotNull InteractionResult mobInteract(Player sourceentity, @NotNull InteractionHand hand) {
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
        SlimelingTamedRightClickedOnEntityProcedure.execute(world, x, y, z, entity, sourceentity);
        return retval;
    }

    public void awardKillScore(@NotNull Entity entity, int score, @NotNull DamageSource damageSource) {
        super.awardKillScore(entity, score, damageSource);
        SlimelingThisEntityKillsAnotherOneProcedure.execute(this.level, this.getX(), this.getY(), this.getZ(), entity, this);
    }

    public AgeableMob getBreedOffspring(@NotNull ServerLevel serverWorld, @NotNull AgeableMob ageable) {
        SlimelingTamedEntity retval = (SlimelingTamedEntity)((EntityType)LatexModEntities.SLIMELING_TAMED.get()).create(serverWorld);
        retval.finalizeSpawn(serverWorld, serverWorld.getCurrentDifficultyAt(retval.blockPosition()), MobSpawnType.BREEDING, (SpawnGroupData)null, (CompoundTag)null);
        return retval;
    }

    public boolean isFood(ItemStack stack) {
        return List.of((Item)LatexModItems.DARKLATEXGOO.get(), Items.SLIME_BALL, (Item)LatexModItems.LATEX_SOUP.get()).contains(stack.getItem());
    }

    public static void init() {
        DungeonHooks.addDungeonMob((EntityType)LatexModEntities.SLIMELING_TAMED.get(), 180);
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
