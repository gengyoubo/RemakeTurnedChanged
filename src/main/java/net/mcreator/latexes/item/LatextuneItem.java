/*    */ package net.mcreator.latexes.item;
/*    */ 
/*    */ import net.mcreator.latexes.init.LatexModSounds;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.sounds.SoundEvent;
/*    */ import net.minecraft.world.item.CreativeModeTab;
/*    */ import net.minecraft.world.item.Item;
/*    */ import net.minecraft.world.item.Rarity;
/*    */ import net.minecraft.world.item.RecordItem;
/*    */ 
/*    */ public class LatextuneItem
/*    */   extends RecordItem {
/*    */   public LatextuneItem() {
/* 14 */     super(0, (SoundEvent)LatexModSounds.REGISTRY.get(new ResourceLocation("latex:latex_tune")), (new Item.Properties())
/* 15 */         .tab(CreativeModeTab.TAB_MISC).stacksTo(1).rarity(Rarity.RARE));
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\item\LatextuneItem.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */