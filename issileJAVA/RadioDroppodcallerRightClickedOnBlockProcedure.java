//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

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
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.TickEvent.Phase;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class RadioDroppodcallerRightClickedOnBlockProcedure {
    public RadioDroppodcallerRightClickedOnBlockProcedure() {
    }

    public static void execute(LevelAccessor world, final double x, final double y, final double z, Entity entity, ItemStack itemstack) {
        if (entity != null) {
            Player _player;
            if (entity instanceof Player) {
                _player = (Player)entity;
                _player.getCooldowns().addCooldown(itemstack.getItem(), 450);
            }

            if (entity instanceof Player) {
                _player = (Player)entity;
                ItemStack _stktoremove = new ItemStack((ItemLike)LatexModItems.RADIO_DROPPODCALLER.get());
                _player.getInventory().clearOrCountMatchingItems((p) -> {
                    return _stktoremove.getItem() == p.getItem();
                }, 1, _player.inventoryMenu.getCraftSlots());
            }

            if (entity instanceof Player) {
                _player = (Player)entity;
                if (!_player.level.isClientSide()) {
                    _player.displayClientMessage(new TextComponent("\"ROGER THAT,EVIL DROP POD INCOMING!\""), false);
                }
            }

            ((<undefinedtype>)(new Object() {
                private int ticks = 0;
                private float waitTicks;
                private LevelAccessor world;

                public void start(LevelAccessor world, int waitTicks) {
                    this.waitTicks = (float)waitTicks;
                    MinecraftForge.EVENT_BUS.register(this);
                    this.world = world;
                }

                @SubscribeEvent
                public void tick(TickEvent.ServerTickEvent event) {
                    if (event.phase == Phase.END) {
                        ++this.ticks;
                        if ((float)this.ticks >= this.waitTicks) {
                            this.run();
                        }
                    }

                }

                private void run() {
                    LevelAccessor var2 = this.world;
                    if (var2 instanceof ServerLevel _level) {
                        Entity entityToSpawn = new DROPPODEntity((EntityType)LatexModEntities.DROPPOD.get(), _level);
                        entityToSpawn.moveTo(x, y + 32.0, z, 0.0F, 0.0F);
                        entityToSpawn.setYBodyRot(0.0F);
                        entityToSpawn.setYHeadRot(0.0F);
                        if (entityToSpawn instanceof Mob _mobToSpawn) {
                            _mobToSpawn.finalizeSpawn(_level, this.world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData)null, (CompoundTag)null);
                        }

                        this.world.addFreshEntity(entityToSpawn);
                    }

                    MinecraftForge.EVENT_BUS.unregister(this);
                }
            })).start(world, 60);
        }
    }
}
