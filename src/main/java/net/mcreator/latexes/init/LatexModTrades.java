/*    */ package net.mcreator.latexes.init;
/*    */ 
/*    */ import java.util.List;
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
/* 20 */     if (event.getType() == VillagerProfession.CLERIC) {
/* 21 */       ((List<BasicItemListing>)event.getTrades().get(2)).add(new BasicItemListing(new ItemStack((ItemLike)LatexModItems.SYRINGE.get(), 9), new ItemStack((ItemLike)Items.EMERALD), 10, 5, 0.05F));
/*    */ 
/*    */       
/* 24 */       ((List<BasicItemListing>)event.getTrades().get(3)).add(new BasicItemListing(new ItemStack((ItemLike)Items.EMERALD, 7), new ItemStack((ItemLike)LatexModItems.DL_SYRINGE
/*    */               
/* 26 */               .get()), 10, 5, 0.05F));
/* 27 */       ((List<BasicItemListing>)event.getTrades().get(5)).add(new BasicItemListing(new ItemStack((ItemLike)Items.EMERALD, 13), new ItemStack((ItemLike)LatexModItems.SLIMEESSENCE
/*    */               
/* 29 */               .get()), 10, 5, 0.05F));
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\init\LatexModTrades.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */