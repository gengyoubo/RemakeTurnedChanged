package net.ltxprogrammer.turned.init;

import java.util.List;
import net.ltxprogrammer.changed.entity.variant.LatexVariant;
import net.ltxprogrammer.changed.init.ChangedItems;
import net.ltxprogrammer.changed.item.Syringe;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.BasicItemListing;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/init/LatexModTrades.class */
public class LatexModTrades {
    @SubscribeEvent
    public static void registerTrades(VillagerTradesEvent event) {
        if (event.getType() == VillagerProfession.CLERIC) {
            event.getTrades().get(2).add(new BasicItemListing(new ItemStack(ChangedItems.SYRINGE.get(), 9), new ItemStack(Items.EMERALD), 10, 5, 0.05f));
            event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 7), Syringe.setUnpureVariant(new ItemStack(ChangedItems.LATEX_SYRINGE.get()), LatexVariant.DARK_LATEX_WOLF.male().getFormId()), 10, 5, 0.05f));
            event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 13), new ItemStack(LatexModItems.SLIMEESSENCE.get()), 10, 5, 0.05f));
        }
    }
}
