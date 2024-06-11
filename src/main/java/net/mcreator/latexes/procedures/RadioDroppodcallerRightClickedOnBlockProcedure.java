package net.mcreator.latexes.procedures;

import net.mcreator.latexes.entity.DROPPODEntity;
import net.mcreator.latexes.init.LatexModEntities;
import net.mcreator.latexes.init.LatexModItems;
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

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/RadioDroppodcallerRightClickedOnBlockProcedure.class */
public class RadioDroppodcallerRightClickedOnBlockProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
        if (entity != null) {
            if (entity instanceof Player) {
                ((Player) entity).getCooldowns().addCooldown(itemstack.getItem(), 450);
            }
            if (entity instanceof Player) {
                Player _player = (Player) entity;
                ItemStack _stktoremove = new ItemStack((ItemLike) LatexModItems.RADIO_DROPPODCALLER.get());
                _player.getInventory().clearOrCountMatchingItems(p -> {
                    return _stktoremove.getItem() == p.getItem();
                }, 1, _player.inventoryMenu.getCraftSlots());
            }
            if (entity instanceof Player) {
                Player _player2 = (Player) entity;
                if (!_player2.level.isClientSide()) {
                    _player2.displayClientMessage(new TextComponent("\"ROGER THAT,EVIL DROP POD INCOMING!\""), false);
                }
            }
            new AnonymousClass1(x, y, z).start(world, 60);
        }
    }

    /* renamed from: net.mcreator.latexes.procedures.RadioDroppodcallerRightClickedOnBlockProcedure$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/RadioDroppodcallerRightClickedOnBlockProcedure$1.class */
    class AnonymousClass1 {
        private int ticks = 0;
        private float waitTicks;
        private LevelAccessor world;
        final /* synthetic */ double val$x;
        final /* synthetic */ double val$y;
        final /* synthetic */ double val$z;

        AnonymousClass1(double d, double d2, double d3) {
            this.val$x = d;
            this.val$y = d2;
            this.val$z = d3;
        }

        public void start(LevelAccessor world, int waitTicks) {
            this.waitTicks = (float) waitTicks;
            MinecraftForge.EVENT_BUS.register(this);
            this.world = world;
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
                ServerLevel _level = serverLevel;
                Entity entityToSpawn = new DROPPODEntity((EntityType<DROPPODEntity>) ((EntityType) LatexModEntities.DROPPOD.get()), (Level) _level);
                entityToSpawn.moveTo(this.val$x, this.val$y + 32.0d, this.val$z, 0.0f, 0.0f);
                entityToSpawn.setYBodyRot(0.0f);
                entityToSpawn.setYHeadRot(0.0f);
                if (entityToSpawn instanceof Mob) {
                    ((Mob) entityToSpawn).finalizeSpawn(_level, this.world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                }
                this.world.addFreshEntity(entityToSpawn);
            }
            MinecraftForge.EVENT_BUS.unregister(this);
        }
    }
}
