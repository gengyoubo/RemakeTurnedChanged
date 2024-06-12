package net.ltxprogrammer.turned.procedures;

import net.ltxprogrammer.turned.entity.AllydroppodEntity;
import net.ltxprogrammer.turned.init.LatexModEntities;
import net.ltxprogrammer.turned.init.LatexModItems;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/AllyradiodroppodcallerRightClickedOnBlockProcedure.class */
public class AllyradiodroppodcallerRightClickedOnBlockProcedure {
    public static void execute(LevelAccessor world, final double x, final double y, final double z, Entity entity, ItemStack itemstack) {
        if (entity != null) {
            if (entity instanceof Player) {
                ((Player) entity).getCooldowns().addCooldown(itemstack.getItem(), 650);
            }
            if (entity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(LatexModItems.ALLYRADIODROPPODCALLER.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (entity instanceof Player _player2) {
                if (!_player2.level.isClientSide()) {
                    _player2.displayClientMessage(new TextComponent("\"Arlight, Ally Drop Pod is coming! hold still.\""), false);
                }
            }
            new Object() { // from class: net.ltxprogrammer.turned.procedures.AllyradiodroppodcallerRightClickedOnBlockProcedure.1
                private int ticks = 0;
                private float waitTicks;
                private LevelAccessor world;

                public void start(LevelAccessor world2, int waitTicks) {
                    this.waitTicks = (float) waitTicks;
                    MinecraftForge.EVENT_BUS.register(this);
                    this.world = world2;
                }

                @SubscribeEvent
                public void tick(TickEvent.ServerTickEvent event) {
                    if (event.phase == TickEvent.Phase.END) {
                        this.ticks++;
                        if (((float) this.ticks) >= this.waitTicks) {
                            run();
                        }
                    }
                }

                private void run() {
                    ServerLevel serverLevel = this.world;
                    if (serverLevel instanceof ServerLevel) {
                        Entity entityToSpawn = new AllydroppodEntity((EntityType<AllydroppodEntity>) LatexModEntities.ALLYDROPPOD.get(), serverLevel);
                        entityToSpawn.moveTo(x, y + 32.0d, z, 0.0f, 0.0f);
                        entityToSpawn.setYBodyRot(0.0f);
                        entityToSpawn.setYHeadRot(0.0f);
                        ((Mob) entityToSpawn).finalizeSpawn(serverLevel, this.world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        this.world.addFreshEntity(entityToSpawn);
                    }
                    MinecraftForge.EVENT_BUS.unregister(this);
                }
            }.start(world, 60);
        }
    }
}
