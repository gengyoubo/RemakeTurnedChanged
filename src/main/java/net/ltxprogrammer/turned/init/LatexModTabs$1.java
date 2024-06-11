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
/*    */ class null
/*    */   extends CreativeModeTab
/*    */ {
/*    */   null(String arg0) {
/* 19 */     super(arg0);
/*    */   }
/*    */   public ItemStack m_6976_() {
/* 22 */     return new ItemStack((ItemLike)LatexModBlocks.BLACKLABBLOCK_1A.get());
/*    */   }
/*    */   
/*    */   @OnlyIn(Dist.CLIENT)
/*    */   public boolean hasSearchBar() {
/* 27 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\init\LatexModTabs$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */