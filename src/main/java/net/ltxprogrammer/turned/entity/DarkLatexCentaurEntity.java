//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.ltxprogrammer.turned.entity;

import net.ltxprogrammer.changed.Changed;
import net.ltxprogrammer.changed.ability.AccessSaddleAbility;
import net.ltxprogrammer.changed.ability.AccessSaddleAbilityInstance;
import net.ltxprogrammer.changed.entity.beast.AbstractDarkLatexEntity;
import net.ltxprogrammer.changed.entity.beast.LightLatexCentaur;
import net.ltxprogrammer.changed.entity.variant.LatexVariant;
import net.ltxprogrammer.changed.entity.variant.LatexVariantInstance;
import net.ltxprogrammer.changed.init.ChangedAbilities;
import net.ltxprogrammer.changed.network.packet.MountLatexPacket;
import net.ltxprogrammer.changed.process.ProcessTransfur;
import net.ltxprogrammer.changed.util.Color3;
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

public class DarkLatexCentaurEntity extends AbstractDarkLatexEntity implements Saddleable {
    public DarkLatexCentaurEntity(PlayMessages.SpawnEntity packet, Level world) {
        this((EntityType)LatexModEntities.DARK_LATEX_CENTAUR.get(), world);
    }

    public DarkLatexCentaurEntity(EntityType<DarkLatexCentaurEntity> type, Level world) {
        super(type, world);
        this.xpReward = 8;
        this.setNoAi(false);
    }

    public Packet<?> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }

    public MobType getMobType() {
        return MobType.ARTHROPOD;
    }

    public double getPassengersRidingOffset() {
        return super.getPassengersRidingOffset() + 1.4000000000000001;
    }

    public static void init() {
        DungeonHooks.addDungeonMob((EntityType)LatexModEntities.DARK_LATEX_CENTAUR.get(), 180);
    }

    public static AttributeSupplier.Builder createAttributes() {
        AttributeSupplier.Builder builder = Mob.createMobAttributes();
        builder = builder.add(Attributes.MOVEMENT_SPEED, 0.32);
        builder = builder.add(Attributes.MAX_HEALTH, 28.0);
        builder = builder.add(Attributes.ARMOR, 1.0);
        builder = builder.add(Attributes.ATTACK_DAMAGE, 4.0);
        builder = builder.add(Attributes.FOLLOW_RANGE, 16.0);
        builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 0.5);
        builder = builder.add(Attributes.ATTACK_KNOCKBACK, 0.2);
        return builder;
    }

    public Color3 getDripColor() {
        return Color3.DARK;
    }

    public boolean isSaddleable() {
        return false;
    }

    public void equipSaddle(@Nullable SoundSource p_21748_) {
        this.getPersistentData().put(LightLatexCentaur.SADDLE_LOCATION, (new ItemStack(Items.SADDLE)).serializeNBT());
        if (p_21748_ != null) {
            this.level.playSound((Player)null, this, SoundEvents.HORSE_SADDLE, p_21748_, 0.5F, 1.0F);
        }

    }

    public boolean isSaddled() {
        if (this.getUnderlyingPlayer() != null && ProcessTransfur.isPlayerLatex(this.getUnderlyingPlayer())) {
            // 获取 LatexVariantInstance 而不是 LatexVariant
            LatexVariantInstance<?> variantInstance = ProcessTransfur.getPlayerLatexVariant(this.getUnderlyingPlayer());
            if (variantInstance == null) {
                return false;
            }
            // 获取 AccessSaddleAbility 实例
            AccessSaddleAbility saddleAbility = ChangedAbilities.ACCESS_SADDLE.get();
            // 使用 LatexVariantInstance 获取能力实例
            AccessSaddleAbilityInstance ability = (AccessSaddleAbilityInstance)variantInstance.getAbilityInstance(saddleAbility);
            if (ability == null) {
                return false;
            } else {
                return ability.saddle != null && !ability.saddle.isEmpty();
            }
        } else {
            return this.getPersistentData().contains(LightLatexCentaur.SADDLE_LOCATION);
        }
    }

    protected void doPlayerRide(Player p_30634_) {
        if (!this.level.isClientSide) {
            p_30634_.setYRot(this.getYRot());
            p_30634_.setXRot(this.getXRot());
            Player underlying = this.getUnderlyingPlayer();
            if (underlying == null) {
                p_30634_.startRiding(this);
            } else {
                p_30634_.startRiding(underlying);
                Changed.PACKET_HANDLER.send(PacketDistributor.ALL.noArg(), new MountLatexPacket(p_30634_.getUUID(), underlying.getUUID()));
            }
        }

    }

    public InteractionResult mobInteract(Player p_30713_, InteractionHand p_30714_) {
        if (this.isSaddled()) {
            this.doPlayerRide(p_30713_);
            return InteractionResult.sidedSuccess(this.level.isClientSide);
        } else {
            return InteractionResult.PASS;
        }
    }
}
