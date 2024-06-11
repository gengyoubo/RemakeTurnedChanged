/*    */ package net.mcreator.latexes.item;
/*    */ 
/*    */ import java.util.List;
/*    */ import net.mcreator.latexes.init.LatexModTabs;
/*    */ import net.minecraft.network.chat.Component;
/*    */ import net.minecraft.network.chat.TextComponent;
/*    */ import net.minecraft.world.item.Item;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.item.Rarity;
/*    */ import net.minecraft.world.item.TooltipFlag;
/*    */ import net.minecraft.world.level.Level;
/*    */ 
/*    */ 
/*    */ public class Brokenm16Item
/*    */   extends Item
/*    */ {
/*    */   public Brokenm16Item() {
/* 18 */     super((new Item.Properties()).tab(LatexModTabs.TAB_LATEXITEMS).stacksTo(8).rarity(Rarity.COMMON));
/*    */   }
/*    */ 
/*    */   
/*    */   public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
/* 23 */     super.appendHoverText(itemstack, world, list, flag);
/* 24 */     list.add(new TextComponent("hmm... maybe it's not junk yet..."));
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\item\Brokenm16Item.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */