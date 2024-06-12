package net.ltxprogrammer.turned.entity;

import net.ltxprogrammer.changed.Changed;
import net.ltxprogrammer.changed.ability.AccessSaddleAbilityInstance;
import net.ltxprogrammer.changed.entity.beast.AbstractDarkLatexEntity;
import net.ltxprogrammer.changed.entity.beast.LightLatexCentaur;
import net.ltxprogrammer.changed.init.ChangedAbilities;
import net.ltxprogrammer.changed.init.ChangedParticles;
import net.ltxprogrammer.changed.network.packet.MountLatexPacket;
import net.ltxprogrammer.changed.process.ProcessTransfur;
import net.ltxprogrammer.turned.init.LatexModEntities;
import net.minecraft.network.protocol.Packet;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.Saddleable;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.DungeonHooks;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.PlayMessages;
import org.jetbrains.annotations.Nullable;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/entity/DarkLatexCentaurEntity.class */
public class DarkLatexCentaurEntity extends AbstractDarkLatexEntity implements Saddleable {
    public DarkLatexCentaurEntity(PlayMessages.SpawnEntity packet, Level world) {
        this((EntityType) LatexModEntities.DARK_LATEX_CENTAUR.get(), world);
    }

    public DarkLatexCentaurEntity(EntityType<DarkLatexCentaurEntity> type, Level world) {
        super(type, world);
        this.xpReward = 8;
        setNoAi(false);
    }

    public Packet<?> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }

    public MobType getMobType() {
        return MobType.ARTHROPOD;
    }

    public double getPassengersRidingOffset() {
        return getPassengersRidingOffset() + 1.4000000000000001d;
    }

    public static void init() {
        DungeonHooks.addDungeonMob((EntityType) LatexModEntities.DARK_LATEX_CENTAUR.get(), 180);
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes().add(Attributes.MOVEMENT_SPEED, 0.32d).add(Attributes.MAX_HEALTH, 28.0d).add(Attributes.ARMOR, 1.0d).add(Attributes.ATTACK_DAMAGE, 4.0d).add(Attributes.FOLLOW_RANGE, 16.0d).add(Attributes.KNOCKBACK_RESISTANCE, 0.5d).add(Attributes.ATTACK_KNOCKBACK, 0.2d);
    }

    public ChangedParticles.Color3 getDripColor() {
        return ChangedParticles.Color3.DARK;
    }

    public boolean isSaddleable() {
        return false;
    }

    public void equipSaddle(@Nullable SoundSource p_21748_) {
        getPersistentData().put(LightLatexCentaur.SADDLE_LOCATION, new ItemStack(Items.SADDLE).serializeNBT());
        if (p_21748_ != null) {
            this.level.playSound((Player) null, this, SoundEvents.HORSE_SADDLE, p_21748_, 0.5f, 1.0f);
        }
    }

    public boolean isSaddled() {
        if (getUnderlyingPlayer() == null || !ProcessTransfur.isPlayerLatex(getUnderlyingPlayer())) {
            return getPersistentData().contains(LightLatexCentaur.SADDLE_LOCATION);
        }
        AccessSaddleAbilityInstance ability = ProcessTransfur.getPlayerLatexVariant(getUnderlyingPlayer()).getAbilityInstance(ChangedAbilities.ACCESS_SADDLE);
        return (ability == null || ability.saddle == null || ability.saddle.isEmpty()) ? false : true;
    }

    protected void doPlayerRide(Player p_30634_) {
        if (!this.level.isClientSide) {
            p_30634_.setYRot(getYRot());
            p_30634_.setXRot(getXRot());
            Player underlying = getUnderlyingPlayer();
            if (underlying == null) {
                p_30634_.startRiding(this);
                return;
            }
            p_30634_.startRiding(underlying);
            Changed.PACKET_HANDLER.send(PacketDistributor.ALL.noArg(), new MountLatexPacket(p_30634_.getUUID(), underlying.getUUID()));
        }
    }

    public InteractionResult mobInteract(Player p_30713_, InteractionHand p_30714_) {
        if (!isSaddled()) {
            return InteractionResult.PASS;
        }
        doPlayerRide(p_30713_);
        return InteractionResult.sidedSuccess(this.level.isClientSide);
    }
}
