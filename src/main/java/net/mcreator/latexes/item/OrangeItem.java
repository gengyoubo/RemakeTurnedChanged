/*    */ package net.mcreator.latexes.item;
/*    */ 
/*    */ import net.mcreator.latexes.init.LatexModTabs;
/*    */ import net.minecraft.world.food.FoodProperties;
/*    */ import net.minecraft.world.item.Item;
/*    */ import net.minecraft.world.item.Rarity;
/*    */ 
/*    */ public class OrangeItem
/*    */   extends Item
/*    */ {
/*    */   public OrangeItem() {
/* 12 */     super((new Item.Properties()).tab(LatexModTabs.TAB_LATEXITEMS).stacksTo(64).rarity(Rarity.COMMON)
/* 13 */         .food((new FoodProperties.Builder()).nutrition(5).saturationMod(0.4F).alwaysEat()
/*    */           
/* 15 */           .build()));
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\item\OrangeItem.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */