package net.ltxprogrammer.turned.entity;

import java.util.Objects;
import java.util.Random;
import LatexModEntities;
import net.ltxprogrammer.turned.procedures.FlamethowerBulletHitsBlockProcedure;
import net.ltxprogrammer.turned.procedures.FlamethowerWhileBulletFlyingTickProcedure;
import net.minecraft.network.protocol.Packet;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.NotNull;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/entity/FlamethowerEntity.class */
public class FlamethowerEntity extends AbstractArrow implements ItemSupplier {
    public FlamethowerEntity(PlayMessages.SpawnEntity packet, Level world) {
        super(LatexModEntities.FLAMETHOWER.get(), world);
    }

    public FlamethowerEntity(EntityType<? extends FlamethowerEntity> type, Level world) {
        super(type, world);
    }

    public FlamethowerEntity(EntityType<? extends FlamethowerEntity> type, double x, double y, double z, Level world) {
        super(type, x, y, z, world);
    }

    public FlamethowerEntity(EntityType<? extends FlamethowerEntity> type, LivingEntity entity, Level world) {
        super(type, entity, world);
    }

    public @NotNull Packet<?> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }

    @OnlyIn(Dist.CLIENT)
    public @NotNull ItemStack getItem() {
        return new ItemStack(Blocks.FIRE);
    }

    protected @NotNull ItemStack getPickupItem() {
        return ItemStack.EMPTY;
    }

    protected void doPostHurtEffects(@NotNull LivingEntity entity) {
        doPostHurtEffects(entity);
        entity.setArrowCount(entity.getArrowCount() - 1);
    }

    public void onHitBlock(@NotNull BlockHitResult blockHitResult) {
        onHitBlock(blockHitResult);
        FlamethowerBulletHitsBlockProcedure.execute(this.level, blockHitResult.getBlockPos().getX(), blockHitResult.getBlockPos().getY(), blockHitResult.getBlockPos().getZ());
    }

    public void tick() {
        tick();
        FlamethowerWhileBulletFlyingTickProcedure.execute(this.level, getX(), getY(), getZ());
        if (this.inGround) {
            discard();
        }
    }

    public static FlamethowerEntity shoot(Level world, LivingEntity entity, Random random, float power, double damage, int knockback) {
        FlamethowerEntity entityarrow = new FlamethowerEntity(LatexModEntities.FLAMETHOWER.get(), entity, world);
        entityarrow.shoot(entity.getViewVector(1.0f).x, entity.getViewVector(1.0f).y, entity.getViewVector(1.0f).z, power * 2.0f, 0.0f);
        entityarrow.setSilent(true);
        entityarrow.setCritArrow(false);
        entityarrow.setBaseDamage(damage);
        entityarrow.setKnockback(knockback);
        entityarrow.setSecondsOnFire(100);
        world.addFreshEntity(entityarrow);
        world.playSound(null, entity.getX(), entity.getY(), entity.getZ(), Objects.requireNonNull(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.blaze.shoot"))), SoundSource.PLAYERS, 1.0f, (1.0f / ((random.nextFloat() * 0.5f) + 1.0f)) + (power / 2.0f));
        return entityarrow;
    }

    public static void shoot(LivingEntity entity, LivingEntity target) {
        FlamethowerEntity entityarrow = new FlamethowerEntity(LatexModEntities.FLAMETHOWER.get(), entity, entity.level);
        double dx = target.getX() - entity.getX();
        double dy = (target.getY() + ((double) target.getEyeHeight())) - 1.1d;
        double dz = target.getZ() - entity.getZ();
        entityarrow.shoot(dx, (dy - entityarrow.getY()) + (Math.hypot(dx, dz) * 0.20000000298023224d), dz, 3.0f, 12.0f);
        entityarrow.setSilent(true);
        entityarrow.setBaseDamage(5.0d);
        entityarrow.setKnockback(0);
        entityarrow.setCritArrow(false);
        entityarrow.setSecondsOnFire(100);
        entity.level.addFreshEntity(entityarrow);
        entity.level.playSound(null, entity.getX(), entity.getY(), entity.getZ(), Objects.requireNonNull(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.blaze.shoot"))), SoundSource.PLAYERS, 1.0f, 1.0f / ((new Random().nextFloat() * 0.5f) + 1.0f));
    }
}
