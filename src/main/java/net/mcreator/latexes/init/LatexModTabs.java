/*    */ package net.mcreator.latexes.init;
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
/*    */ public class LatexModTabs
/*    */ {
/*    */   public static CreativeModeTab TAB_LATEX;
/*    */   public static CreativeModeTab TAB_LATEXITEMS;
/*    */   public static CreativeModeTab TAB_LATEXENTITIES;
/*    */   
/*    */   public static void load() {
/* 19 */     TAB_LATEX = new CreativeModeTab("tablatex")
/*    */       {
/*    */         public ItemStack makeIcon() {
/* 22 */           return new ItemStack((ItemLike)LatexModBlocks.BLACKLABBLOCK_1A.get());
/*    */         }
/*    */         
/*    */         @OnlyIn(Dist.CLIENT)
/*    */         public boolean hasSearchBar() {
/* 27 */           return false;
/*    */         }
/*    */       };
/* 30 */     TAB_LATEXITEMS = new CreativeModeTab("tablatexitems")
/*    */       {
/*    */         public ItemStack makeIcon() {
/* 33 */           return new ItemStack((ItemLike)LatexModItems.DL_AXE.get());
/*    */         }
/*    */         
/*    */         @OnlyIn(Dist.CLIENT)
/*    */         public boolean hasSearchBar() {
/* 38 */           return false;
/*    */         }
/*    */       };
/* 41 */     TAB_LATEXENTITIES = new CreativeModeTab("tablatexentities")
/*    */       {
/*    */         public ItemStack makeIcon() {
/* 44 */           return new ItemStack((ItemLike)LatexModItems.DARKLATEXGOO.get());
/*    */         }
/*    */         
/*    */         @OnlyIn(Dist.CLIENT)
/*    */         public boolean hasSearchBar() {
/* 49 */           return false;
/*    */         }
/*    */       };
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\init\LatexModTabs.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */