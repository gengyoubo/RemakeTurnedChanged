package net.ltxprogrammer.turned.entity;

import java.util.Random;
import net.ltxprogrammer.turned.init.LatexModEntities;
import net.ltxprogrammer.turned.init.LatexModItems;
import net.minecraft.network.protocol.Packet;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.registries.ForgeRegistries;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/entity/MatchlockPistolEntity.class */
public class MatchlockPistolEntity extends AbstractArrow implements ItemSupplier {
    public MatchlockPistolEntity(PlayMessages.SpawnEntity packet, Level world) {
        super((EntityType) LatexModEntities.MATCHLOCK_PISTOL.get(), world);
    }

    public MatchlockPistolEntity(EntityType<? extends MatchlockPistolEntity> type, Level world) {
        super(type, world);
    }

    public MatchlockPistolEntity(EntityType<? extends MatchlockPistolEntity> type, double x, double y, double z, Level world) {
        super(type, x, y, z, world);
    }

    public MatchlockPistolEntity(EntityType<? extends MatchlockPistolEntity> type, LivingEntity entity, Level world) {
        super(type, entity, world);
    }

    public Packet<?> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }

    @OnlyIn(Dist.CLIENT)
    public ItemStack getItem() {
        return new ItemStack((ItemLike) LatexModItems.BULLETICON.get());
    }

    protected ItemStack getPickupItem() {
        return ItemStack.EMPTY;
    }

    protected void doPostHurtEffects(LivingEntity entity) {
        doPostHurtEffects(entity);
        entity.setArrowCount(entity.getArrowCount() - 1);
    }

    public void tick() {
        tick();
        if (this.inGround) {
            discard();
        }
    }

    public static MatchlockPistolEntity shoot(Level world, LivingEntity entity, Random random, float power, double damage, int knockback) {
        MatchlockPistolEntity entityarrow = new MatchlockPistolEntity((EntityType) LatexModEntities.MATCHLOCK_PISTOL.get(), entity, world);
        entityarrow.shoot(entity.getViewVector(1.0f).x, entity.getViewVector(1.0f).y, entity.getViewVector(1.0f).z, power * 2.0f, 0.0f);
        entityarrow.setSilent(true);
        entityarrow.setCritArrow(true);
        entityarrow.setBaseDamage(damage);
        entityarrow.setKnockback(knockback);
        world.addFreshEntity(entityarrow);
        world.playSound((Player) null, entity.getX(), entity.getY(), entity.getZ(), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:musket_fire")), SoundSource.PLAYERS, 1.0f, (1.0f / ((random.nextFloat() * 0.5f) + 1.0f)) + (power / 2.0f));
        return entityarrow;
    }

    public static MatchlockPistolEntity shoot(LivingEntity entity, LivingEntity target) {
        MatchlockPistolEntity entityarrow = new MatchlockPistolEntity((EntityType) LatexModEntities.MATCHLOCK_PISTOL.get(), entity, entity.level);
        double dx = target.getX() - entity.getX();
        double dy = (target.getY() + ((double) target.getEyeHeight())) - 1.1d;
        double dz = target.getZ() - entity.getZ();
        entityarrow.shoot(dx, (dy - entityarrow.getY()) + (Math.hypot(dx, dz) * 0.20000000298023224d), dz, 4.0f, 12.0f);
        entityarrow.setSilent(true);
        entityarrow.setBaseDamage(2.0d);
        entityarrow.setKnockback(1);
        entityarrow.setCritArrow(true);
        entity.level.addFreshEntity(entityarrow);
        entity.level.playSound((Player) null, entity.getX(), entity.getY(), entity.getZ(), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:musket_fire")), SoundSource.PLAYERS, 1.0f, 1.0f / ((new Random().nextFloat() * 0.5f) + 1.0f));
        return entityarrow;
    }
}
