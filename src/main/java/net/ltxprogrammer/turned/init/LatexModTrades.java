/*    */ package net.ltxprogrammer.turned.init;
/*    */ 
/*    */ import java.util.List;
/*    */ import net.ltxprogrammer.changed.entity.variant.LatexVariant;
/*    */ import net.ltxprogrammer.changed.init.ChangedItems;
/*    */ import net.ltxprogrammer.changed.item.Syringe;
/*    */ import net.minecraft.world.entity.npc.VillagerProfession;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.item.Items;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ import net.minecraftforge.common.BasicItemListing;
/*    */ import net.minecraftforge.event.village.VillagerTradesEvent;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ import net.minecraftforge.fml.common.Mod;
/*    */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*    */ 
/*    */ 
/*    */ @EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
/*    */ public class LatexModTrades
/*    */ {
/*    */   @SubscribeEvent
/*    */   public static void registerTrades(VillagerTradesEvent event) {
/* 23 */     if (event.getType() == VillagerProfession.f_35589_) {
/* 24 */       ((List<BasicItemListing>)event.getTrades().get(2)).add(new BasicItemListing(new ItemStack((ItemLike)ChangedItems.SYRINGE.get(), 9), new ItemStack((ItemLike)Items.f_42616_), 10, 5, 0.05F));
/*    */ 
/*    */       
/* 27 */       ((List<BasicItemListing>)event.getTrades().get(3)).add(new BasicItemListing(new ItemStack((ItemLike)Items.f_42616_, 7), 
/*    */             
/* 29 */             Syringe.setUnpureVariant(new ItemStack((ItemLike)ChangedItems.LATEX_SYRINGE.get()), LatexVariant.DARK_LATEX_WOLF
/* 30 */               .male().getFormId()), 10, 5, 0.05F));
/* 31 */       ((List<BasicItemListing>)event.getTrades().get(5)).add(new BasicItemListing(new ItemStack((ItemLike)Items.f_42616_, 13), new ItemStack((ItemLike)LatexModItems.SLIMEESSENCE
/*    */               
/* 33 */               .get()), 10, 5, 0.05F));
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\init\LatexModTrades.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */