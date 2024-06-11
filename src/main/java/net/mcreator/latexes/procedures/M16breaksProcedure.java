package net.mcreator.latexes.procedures;

import javax.annotation.Nullable;
import net.mcreator.latexes.init.LatexModItems;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.event.entity.player.PlayerDestroyItemEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/M16breaksProcedure.class */
public class M16breaksProcedure {
    @SubscribeEvent
    public static void onItemDestroyed(PlayerDestroyItemEvent event) {
        execute(event, event.getPlayer());
    }

    public static void execute(Entity entity) {
        execute(null, entity);
    }

    private static void execute(@Nullable Event event, Entity entity) {
        if (entity != null) {
            if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getMainHandItem() : ItemStack.EMPTY).getItem() == LatexModItems.M_4_ASSAULT_RIFLE.get() && (entity instanceof LivingEntity)) {
                LivingEntity _entity = (LivingEntity) entity;
                ItemStack _setstack = new ItemStack((ItemLike) LatexModItems.BROKENM_16.get());
                _setstack.setCount(1);
                _entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
                if (_entity instanceof Player) {
                    ((Player) _entity).getInventory().setChanged();
                }
            }
        }
    }
}
