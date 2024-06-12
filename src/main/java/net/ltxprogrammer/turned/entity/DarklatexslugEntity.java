package net.ltxprogrammer.turned.entity;

import java.util.Set;
import javax.annotation.Nullable;
import net.ltxprogrammer.changed.entity.beast.AbstractDarkLatexEntity;
import net.ltxprogrammer.changed.init.ChangedItems;
import net.ltxprogrammer.changed.init.ChangedParticles;
import net.ltxprogrammer.turned.init.LatexModBlocks;
import net.ltxprogrammer.turned.init.LatexModEntities;
import net.ltxprogrammer.turned.procedures.DarklatexslugNaturalEntitySpawningConditionProcedure;
import net.ltxprogrammer.turned.procedures.DarklatexslugOnEntityTickUpdateProcedure;
import net.ltxprogrammer.turned.procedures.DarklatexslugOnInitialEntitySpawnProcedure;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.Packet;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.AvoidEntityGoal;
import net.minecraft.world.entity.ai.goal.EatBlockGoal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.FollowMobGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.MoveBackToVillageGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RemoveBlockGoal;
import net.minecraft.world.entity.ai.goal.RestrictSunGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber
/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/entity/DarklatexslugEntity.class */
public class DarklatexslugEntity extends AbstractDarkLatexEntity {
    private static final Set<ResourceLocation> SPAWN_BIOMES = Set.of((Object[]) new ResourceLocation[]{new ResourceLocation("savanna_plateau"), new ResourceLocation("forest"), new ResourceLocation("sunflower_plains"), new ResourceLocation("taiga"), new ResourceLocation("flower_forest"), new ResourceLocation("swamp"), new ResourceLocation("eroded_badlands"), new ResourceLocation("windswept_hills"), new ResourceLocation("changed:dark_latex_plains"), new ResourceLocation("plains"), new ResourceLocation("savanna"), new ResourceLocation("windswept_savanna"), new ResourceLocation("the_void"), new ResourceLocation("jungle"), new ResourceLocation("windswept_gravelly_hills"), new ResourceLocation("desert")});

    @SubscribeEvent
    public static void addLivingEntityToBiomes(BiomeLoadingEvent event) {
        if (SPAWN_BIOMES.contains(event.getName())) {
            event.getSpawns().getSpawner(MobCategory.MONSTER).add(new MobSpawnSettings.SpawnerData((EntityType) LatexModEntities.DARKLATEXSLUG.get(), 5, 1, 3));
        }
    }

    public DarklatexslugEntity(PlayMessages.SpawnEntity packet, Level world) {
        this((EntityType) LatexModEntities.DARKLATEXSLUG.get(), world);
    }

    public DarklatexslugEntity(EntityType<DarklatexslugEntity> type, Level world) {
        super(type, world);
        this.xpReward = 1;
        setNoAi(false);
        setPersistenceRequired();
    }

    public Packet<?> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }

    protected void registerGoals() {
        registerGoals();
        this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.2d, false) { // from class: net.ltxprogrammer.turned.entity.DarklatexslugEntity.1
            protected double getAttackReachSqr(LivingEntity entity) {
                return 4.0d + ((double) (entity.getBbWidth() * entity.getBbWidth()));
            }
        });
        this.goalSelector.addGoal(2, new AvoidEntityGoal(this, Monster.class, 16.0f, 1.0d, 1.2d));
        this.goalSelector.addGoal(3, new AvoidEntityGoal(this, PathfinderMob.class, 12.0f, 1.0d, 1.0d));
        this.goalSelector.addGoal(4, new AvoidEntityGoal(this, Player.class, 16.0f, 1.0d, 1.25d));
        this.goalSelector.addGoal(5, new FollowMobGoal(this, 0.800000011920929d, 10.0f, 5.0f));
        this.goalSelector.addGoal(6, new RandomStrollGoal(this, 0.6d));
        this.targetSelector.addGoal(7, new HurtByTargetGoal(this, new Class[0]).setAlertOthers(new Class[0]));
        this.goalSelector.addGoal(8, new RemoveBlockGoal(Blocks.CHEST, this, 1.0d, 3));
        this.goalSelector.addGoal(9, new RemoveBlockGoal((Block) LatexModBlocks.BOX.get(), this, 1.0d, 3));
        this.goalSelector.addGoal(10, new RemoveBlockGoal((Block) LatexModBlocks.BOX_INVENTORY.get(), this, 1.0d, 3));
        this.goalSelector.addGoal(11, new RestrictSunGoal(this));
        this.goalSelector.addGoal(12, new MoveBackToVillageGoal(this, 0.6d, false));
        this.goalSelector.addGoal(13, new EatBlockGoal(this));
        this.goalSelector.addGoal(14, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(15, new FloatGoal(this));
    }

    public MobType getMobType() {
        return MobType.UNDEFINED;
    }

    public boolean removeWhenFarAway(double distanceToClosestPlayer) {
        return false;
    }

    protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHitIn) {
        dropCustomDeathLoot(source, looting, recentlyHitIn);
        spawnAtLocation(new ItemStack((ItemLike) ChangedItems.DARK_LATEX_GOO.get()));
    }

    public SoundEvent getAmbientSound() {
        return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.silverfish.ambient"));
    }

    public SoundEvent getHurtSound(DamageSource ds) {
        return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.hurt"));
    }

    public SoundEvent getDeathSound() {
        return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.death"));
    }

    public boolean hurt(DamageSource source, float amount) {
        if (source == DamageSource.FALL || source == DamageSource.WITHER || source.getMsgId().equals("witherSkull")) {
            return false;
        }
        return hurt(source, amount);
    }

    public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
        SpawnGroupData retval = finalizeSpawn(world, difficulty, reason, livingdata, tag);
        DarklatexslugOnInitialEntitySpawnProcedure.execute(world, getX(), getY(), getZ(), this);
        return retval;
    }

    public void baseTick() {
        baseTick();
        DarklatexslugOnEntityTickUpdateProcedure.execute(this.level, getX(), getY(), getZ(), this);
    }

    public static void init() {
        SpawnPlacements.register((EntityType) LatexModEntities.DARKLATEXSLUG.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, entityType, world, reason, pos, random -> {
            pos.getX();
            pos.getY();
            pos.getZ();
            return DarklatexslugNaturalEntitySpawningConditionProcedure.execute(world);
        });
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes().add(Attributes.MOVEMENT_SPEED, 0.35d).add(Attributes.MAX_HEALTH, 4.0d).add(Attributes.ARMOR, 0.0d).add(Attributes.ATTACK_DAMAGE, 1.0d).add(Attributes.FOLLOW_RANGE, 9.0d);
    }

    public ChangedParticles.Color3 getDripColor() {
        return ChangedParticles.Color3.DARK;
    }
}
