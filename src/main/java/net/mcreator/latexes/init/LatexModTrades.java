package net.mcreator.latexes.init;

import java.util.List;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.BasicItemListing;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/init/LatexModTrades.class */
public class LatexModTrades {
    @SubscribeEvent
    public static void registerTrades(VillagerTradesEvent event) {
        if (event.getType() == VillagerProfession.CLERIC) {
            ((List) event.getTrades().get(2)).add(new BasicItemListing(new ItemStack((ItemLike) LatexModItems.SYRINGE.get(), 9), new ItemStack(Items.EMERALD), 10, 5, 0.05f));
            ((List) event.getTrades().get(3)).add(new BasicItemListing(new ItemStack(Items.EMERALD, 7), new ItemStack((ItemLike) LatexModItems.DL_SYRINGE.get()), 10, 5, 0.05f));
            ((List) event.getTrades().get(5)).add(new BasicItemListing(new ItemStack(Items.EMERALD, 13), new ItemStack((ItemLike) LatexModItems.SLIMEESSENCE.get()), 10, 5, 0.05f));
        }
    }
}
