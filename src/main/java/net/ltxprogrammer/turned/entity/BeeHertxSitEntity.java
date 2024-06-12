package net.ltxprogrammer.turned.entity;

import java.util.List;
import javax.annotation.Nullable;
import net.ltxprogrammer.changed.init.ChangedItems;
import net.ltxprogrammer.turned.init.LatexModEntities;
import net.ltxprogrammer.turned.procedures.BeeHertxSitRightClickedOnEntityProcedure;
import net.ltxprogrammer.turned.procedures.HertxEntityDiesProcedure;
import net.ltxprogrammer.turned.procedures.HertxOnInitialEntitySpawnProcedure;
import net.ltxprogrammer.turned.procedures.HertxPlayerCollidesWithThisEntityProcedure;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.protocol.Packet;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.AgeableMob;
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
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.event.ForgeEventFactory;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.registries.ForgeRegistries;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/entity/BeeHertxSitEntity.class */
public class BeeHertxSitEntity extends TamableAnimal {
    public BeeHertxSitEntity(PlayMessages.SpawnEntity packet, Level world) {
        this((EntityType) LatexModEntities.BEE_HERTX_SIT.get(), world);
    }

    public BeeHertxSitEntity(EntityType<BeeHertxSitEntity> type, Level world) {
        super(type, world);
        this.xpReward = 4;
        setNoAi(false);
        setCustomName(new TextComponent("§e[Idle]"));
        setCustomNameVisible(true);
        setPersistenceRequired();
    }

    public Packet<?> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }

    protected void registerGoals() {
        registerGoals();
        this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.2d, false) { // from class: net.ltxprogrammer.turned.entity.BeeHertxSitEntity.1
            protected double getAttackReachSqr(LivingEntity entity) {
                return 4.0d + ((double) (entity.getBbWidth() * entity.getBbWidth()));
            }
        });
        this.goalSelector.addGoal(2, new LookAtPlayerGoal(this, Player.class, 3.0f));
        this.goalSelector.addGoal(3, new LookAtPlayerGoal(this, PathfinderMob.class, 6.0f));
        this.targetSelector.addGoal(4, new HurtByTargetGoal(this, new Class[0]));
        this.goalSelector.addGoal(5, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(6, new FloatGoal(this));
    }

    public MobType getMobType() {
        return MobType.UNDEFINED;
    }

    public boolean removeWhenFarAway(double distanceToClosestPlayer) {
        return false;
    }

    public SoundEvent getAmbientSound() {
        return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:robot_beep"));
    }

    public void playStepSound(BlockPos pos, BlockState blockIn) {
        playSound((SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.squish")), 0.15f, 1.0f);
    }

    public SoundEvent getHurtSound(DamageSource ds) {
        return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.hurt"));
    }

    public SoundEvent getDeathSound() {
        return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:death_beep"));
    }

    public boolean hurt(DamageSource source, float amount) {
        if (source == DamageSource.FALL || source == DamageSource.CACTUS || source == DamageSource.DROWN || source == DamageSource.WITHER || source.getMsgId().equals("witherSkull")) {
            return false;
        }
        return hurt(source, amount);
    }

    public void die(DamageSource source) {
        die(source);
        HertxEntityDiesProcedure.execute(this.level, getX(), getY(), getZ());
    }

    public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
        SpawnGroupData retval = finalizeSpawn(world, difficulty, reason, livingdata, tag);
        HertxOnInitialEntitySpawnProcedure.execute(world, getX(), getY(), getZ(), this);
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
        BeeHertxSitRightClickedOnEntityProcedure.execute(this.level, getX(), getY(), getZ(), this, sourceentity);
        return retval;
    }

    public void playerTouch(Player sourceentity) {
        playerTouch(sourceentity);
        HertxPlayerCollidesWithThisEntityProcedure.execute(this);
    }

    public AgeableMob getBreedOffspring(ServerLevel serverWorld, AgeableMob ageable) {
        BeeHertxSitEntity retval = ((EntityType) LatexModEntities.BEE_HERTX_SIT.get()).create(serverWorld);
        retval.finalizeSpawn(serverWorld, serverWorld.getCurrentDifficultyAt(retval.blockPosition()), MobSpawnType.BREEDING, null, null);
        return retval;
    }

    public boolean isFood(ItemStack stack) {
        return List.of((Object[]) new Item[]{Items.HONEYCOMB, Items.HONEY_BOTTLE, (Item) ChangedItems.DARK_LATEX_GOO.get(), Blocks.DANDELION.asItem(), Blocks.POPPY.asItem(), Blocks.BLUE_ORCHID.asItem(), Blocks.ALLIUM.asItem(), Blocks.AZURE_BLUET.asItem(), Blocks.RED_TULIP.asItem(), Blocks.ORANGE_TULIP.asItem(), Blocks.WHITE_TULIP.asItem(), Blocks.PINK_TULIP.asItem(), Blocks.OXEYE_DAISY.asItem(), Blocks.CORNFLOWER.asItem(), Blocks.SUNFLOWER.asItem()}).contains(stack.getItem());
    }

    public static void init() {
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes().add(Attributes.MOVEMENT_SPEED, 0.0d).add(Attributes.MAX_HEALTH, 30.0d).add(Attributes.ARMOR, 5.0d).add(Attributes.ATTACK_DAMAGE, 0.0d).add(Attributes.FOLLOW_RANGE, 16.0d).add(Attributes.KNOCKBACK_RESISTANCE, 0.5d);
    }
}
