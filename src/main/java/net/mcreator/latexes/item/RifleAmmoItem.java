/*    */ package net.mcreator.latexes.item;
/*    */ 
/*    */ import net.mcreator.latexes.init.LatexModTabs;
/*    */ import net.minecraft.world.item.Item;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.item.Rarity;
/*    */ import net.minecraft.world.item.UseAnim;
/*    */ 
/*    */ public class RifleAmmoItem
/*    */   extends Item
/*    */ {
/*    */   public RifleAmmoItem() {
/* 13 */     super((new Item.Properties()).tab(LatexModTabs.TAB_LATEXITEMS).stacksTo(30).rarity(Rarity.COMMON));
/*    */   }
/*    */ 
/*    */   
/*    */   public UseAnim getUseAnimation(ItemStack itemstack) {
/* 18 */     return UseAnim.EAT;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\item\RifleAmmoItem.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */