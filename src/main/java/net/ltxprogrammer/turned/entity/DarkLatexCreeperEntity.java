//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.ltxprogrammer.turned.entity;

import net.ltxprogrammer.changed.entity.beast.AbstractDarkLatexEntity;
import net.ltxprogrammer.changed.init.ChangedItems;
import net.ltxprogrammer.changed.util.Color3;
import net.ltxprogrammer.turned.entity.ai.TargetCheck;
import net.ltxprogrammer.turned.init.LatexModEntities;
import net.ltxprogrammer.turned.init.LatexModParticleTypes;
import net.ltxprogrammer.turned.procedures.DarkLatexCreeperEnhancedEntityIsHurtProcedure;
import net.ltxprogrammer.turned.procedures.DarkLatexCreeperPlayerCollidesWithThisEntityProcedure;
import net.ltxprogrammer.turned.procedures.DarkLatexCreeperRightClickedOnEntityProcedure;
import net.ltxprogrammer.turned.procedures.DarkLatexCreeperdiesProcedure;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.network.protocol.Packet;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.BreakDoorGoal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.LeapAtTargetGoal;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.animal.Bee;
import net.minecraft.world.entity.animal.Fox;
import net.minecraft.world.entity.animal.IronGolem;
import net.minecraft.world.entity.monster.Evoker;
import net.minecraft.world.entity.monster.Guardian;
import net.minecraft.world.entity.monster.Pillager;
import net.minecraft.world.entity.monster.Vindicator;
import net.minecraft.world.entity.monster.Witch;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.monster.ZombieVillager;
import net.minecraft.world.entity.monster.piglin.Piglin;
import net.minecraft.world.entity.monster.piglin.PiglinBrute;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.npc.WanderingTrader;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.DungeonHooks;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.registries.ForgeRegistries;

public class DarkLatexCreeperEntity extends AbstractDarkLatexEntity {
    public DarkLatexCreeperEntity(PlayMessages.SpawnEntity packet, Level world) {
        this((EntityType)LatexModEntities.DARK_LATEX_CREEPER.get(), world);
    }

    public DarkLatexCreeperEntity(EntityType<DarkLatexCreeperEntity> type, Level world) {
        super(type, world);
        this.xpReward = 6;
        this.setNoAi(false);
    }

    public Packet<?> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }

    protected void registerGoals() {
        super.registerGoals();
        this.targetSelector.addGoal(2, (new HurtByTargetGoal(this, new Class[0])).setAlertOthers(new Class[0]));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, LivingEntity.class, 10, false, false, TargetCheck.IS_SLIMELING));
        this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, LivingEntity.class, 10, true, false, TargetCheck.IS_GOOD));
        this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, LivingEntity.class, 10, true, false, TargetCheck.IS_EVIL));
        this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, Player.class, true, false));
        this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, WanderingTrader.class, true, false));
        this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, Villager.class, true, false));
        this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, IronGolem.class, true, false));
        this.targetSelector.addGoal(10, new NearestAttackableTargetGoal(this, Witch.class, true, false));
        this.targetSelector.addGoal(11, new NearestAttackableTargetGoal(this, Pillager.class, true, false));
        this.targetSelector.addGoal(12, new NearestAttackableTargetGoal(this, Vindicator.class, true, false));
        this.targetSelector.addGoal(13, new NearestAttackableTargetGoal(this, Evoker.class, true, false));
        this.targetSelector.addGoal(14, new NearestAttackableTargetGoal(this, Guardian.class, true, false));
        this.targetSelector.addGoal(15, new NearestAttackableTargetGoal(this, Bee.class, true, false));
        this.targetSelector.addGoal(16, new NearestAttackableTargetGoal(this, Fox.class, true, false));
        this.targetSelector.addGoal(17, new NearestAttackableTargetGoal(this, Zombie.class, true, false));
        this.targetSelector.addGoal(18, new NearestAttackableTargetGoal(this, ZombieVillager.class, true, false));
        this.targetSelector.addGoal(19, new NearestAttackableTargetGoal(this, Piglin.class, true, false));
        this.targetSelector.addGoal(20, new NearestAttackableTargetGoal(this, PiglinBrute.class, true, false));
        this.goalSelector.addGoal(21, new BreakDoorGoal(this, (e) -> {
            return true;
        }));
        this.goalSelector.addGoal(22, new LookAtPlayerGoal(this, DarkLatexCreeperEnhancedEntity.class, 8.0F));
        this.goalSelector.addGoal(23, new LeapAtTargetGoal(this, 0.5F));
        this.goalSelector.addGoal(24, new LookAtPlayerGoal(this, LivingEntity.class, 6.0F));
        this.goalSelector.addGoal(25, new RandomStrollGoal(this, 0.8));
        this.goalSelector.addGoal(26, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(27, new FloatGoal(this));
    }

    public MobType getMobType() {
        return MobType.ARTHROPOD;
    }

    protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHitIn) {
        super.dropCustomDeathLoot(source, looting, recentlyHitIn);
        this.spawnAtLocation(new ItemStack((ItemLike)ChangedItems.DARK_LATEX_GOO.get()));
    }

    public void playStepSound(BlockPos pos, BlockState blockIn) {
        this.playSound((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.squish")), 0.15F, 1.0F);
    }

    public SoundEvent getHurtSound(DamageSource ds) {
        return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.creeper.hurt"));
    }

    public SoundEvent getDeathSound() {
        return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.death"));
    }

    public boolean hurt(DamageSource source, float amount) {
        DarkLatexCreeperEnhancedEntityIsHurtProcedure.execute(this);
        if (source == DamageSource.FALL) {
            return false;
        } else if (source == DamageSource.CACTUS) {
            return false;
        } else if (source == DamageSource.WITHER) {
            return false;
        } else {
            return source.getMsgId().equals("witherSkull") ? false : super.hurt(source, amount);
        }
    }

    public void die(DamageSource source) {
        super.die(source);
        DarkLatexCreeperdiesProcedure.execute(this.level, this.getX(), this.getY(), this.getZ(), this);
    }

    public InteractionResult mobInteract(Player sourceentity, InteractionHand hand) {
        sourceentity.getItemInHand(hand);
        InteractionResult retval = InteractionResult.sidedSuccess(this.level.isClientSide());
        super.mobInteract(sourceentity, hand);
        double x = this.getX();
        double y = this.getY();
        double z = this.getZ();
        Entity entity = this;
        Level world = this.level;
        DarkLatexCreeperRightClickedOnEntityProcedure.execute(world, x, y, z, entity);
        return retval;
    }

    public void playerTouch(Player sourceentity) {
        super.playerTouch(sourceentity);
        DarkLatexCreeperPlayerCollidesWithThisEntityProcedure.execute(this.level, this.getX(), this.getY(), this.getZ(), this, sourceentity);
    }

    public void aiStep() {
        super.aiStep();
        double x = this.getX();
        double y = this.getY();
        double z = this.getZ();
        Level world = this.level;

        for(int l = 0; l < 2; ++l) {
            double x0 = x + (double)this.random.nextFloat();
            double y0 = y + (double)this.random.nextFloat();
            double z0 = z + (double)this.random.nextFloat();
            double dx = ((double)this.random.nextFloat() - 0.5) * 0.3999999985098839;
            double dy = ((double)this.random.nextFloat() - 0.5) * 0.3999999985098839;
            double dz = ((double)this.random.nextFloat() - 0.5) * 0.3999999985098839;
            world.addParticle((SimpleParticleType)LatexModParticleTypes.DLEFFECTPARTICLES.get(), x0, y0, z0, dx, dy, dz);
        }

    }

    public static void init() {
        DungeonHooks.addDungeonMob((EntityType)LatexModEntities.DARK_LATEX_CREEPER.get(), 180);
    }

    public static AttributeSupplier.Builder createAttributes() {
        AttributeSupplier.Builder builder = Mob.createMobAttributes();
        builder = builder.add(Attributes.MOVEMENT_SPEED, 0.2);
        builder = builder.add(Attributes.MAX_HEALTH, 12.0);
        builder = builder.add(Attributes.ARMOR, 0.0);
        builder = builder.add(Attributes.ATTACK_DAMAGE, 1.0);
        builder = builder.add(Attributes.FOLLOW_RANGE, 16.0);
        builder = builder.add(Attributes.ATTACK_KNOCKBACK, 1.0);
        return builder;
    }

    public Color3 getDripColor() {
        return Color3.DARK;
    }
}
