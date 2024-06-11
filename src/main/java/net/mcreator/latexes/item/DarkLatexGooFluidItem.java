/*    */ package net.mcreator.latexes.item;
/*    */ 
/*    */ import java.util.function.Supplier;
/*    */ import net.mcreator.latexes.init.LatexModFluids;
/*    */ import net.mcreator.latexes.init.LatexModTabs;
/*    */ import net.minecraft.world.item.BucketItem;
/*    */ import net.minecraft.world.item.Item;
/*    */ import net.minecraft.world.item.Items;
/*    */ import net.minecraft.world.item.Rarity;
/*    */ 
/*    */ public class DarkLatexGooFluidItem
/*    */   extends BucketItem {
/*    */   public DarkLatexGooFluidItem() {
/* 14 */     super((Supplier)LatexModFluids.DARK_LATEX_GOO_FLUID, (new Item.Properties())
/* 15 */         .craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(LatexModTabs.TAB_LATEX));
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\item\DarkLatexGooFluidItem.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */