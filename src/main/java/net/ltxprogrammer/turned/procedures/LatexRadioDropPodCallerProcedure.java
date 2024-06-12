package net.ltxprogrammer.turned.procedures;

import net.ltxprogrammer.turned.entity.LatexDropPodEntity;
import net.ltxprogrammer.turned.init.LatexModEntities;
import net.ltxprogrammer.turned.init.LatexModItems;
import net.minecraft.nbt.CompoundTag;
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

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/LatexRadioDropPodCallerProcedure.class */
public class LatexRadioDropPodCallerProcedure {
    public static void execute(LevelAccessor world, final double x, final double y, final double z, Entity entity, ItemStack itemstack) {
        if (entity != null) {
            if (entity instanceof Player) {
                ((Player) entity).getCooldowns().addCooldown(itemstack.getItem(), 400);
            }
            if (entity instanceof Player) {
                Player _player = (Player) entity;
                ItemStack _stktoremove = new ItemStack((ItemLike) LatexModItems.LATEX_RADIO_CALLER.get());
                _player.getInventory().clearOrCountMatchingItems(p -> {
                    return _stktoremove.getItem() == p.getItem();
                }, 1, _player.inventoryMenu.getCraftSlots());
            }
            new Object() { // from class: net.ltxprogrammer.turned.procedures.LatexRadioDropPodCallerProcedure.1
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
                        ServerLevel _level = serverLevel;
                        Entity entityToSpawn = new LatexDropPodEntity((EntityType<LatexDropPodEntity>) ((EntityType) LatexModEntities.LATEX_DROP_POD.get()), (Level) _level);
                        entityToSpawn.moveTo(x, y + 32.0d, z, 0.0f, 0.0f);
                        entityToSpawn.setYBodyRot(0.0f);
                        entityToSpawn.setYHeadRot(0.0f);
                        if (entityToSpawn instanceof Mob) {
                            ((Mob) entityToSpawn).finalizeSpawn(_level, this.world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        this.world.addFreshEntity(entityToSpawn);
                    }
                    MinecraftForge.EVENT_BUS.unregister(this);
                }
            }.start(world, 60);
        }
    }
}
