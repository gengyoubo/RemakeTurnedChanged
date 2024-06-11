/*    */ package net.ltxprogrammer.turned.init;
/*    */ 
/*    */ import net.minecraft.world.item.CreativeModeTab;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ import net.minecraftforge.api.distmarker.Dist;
/*    */ import net.minecraftforge.api.distmarker.OnlyIn;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class null
/*    */   extends CreativeModeTab
/*    */ {
/*    */   null(String arg0) {
/* 30 */     super(arg0);
/*    */   }
/*    */   public ItemStack m_6976_() {
/* 33 */     return new ItemStack((ItemLike)LatexModItems.DL_AXE.get());
/*    */   }
/*    */   
/*    */   @OnlyIn(Dist.CLIENT)
/*    */   public boolean hasSearchBar() {
/* 38 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\init\LatexModTabs$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */