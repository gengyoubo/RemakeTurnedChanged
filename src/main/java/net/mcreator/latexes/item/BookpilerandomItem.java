/*    */ package net.mcreator.latexes.item;
/*    */ 
/*    */ import java.util.List;
/*    */ import net.mcreator.latexes.init.LatexModTabs;
/*    */ import net.mcreator.latexes.procedures.BookpilerandomRightClickedOnBlockProcedure;
/*    */ import net.minecraft.network.chat.Component;
/*    */ import net.minecraft.network.chat.TextComponent;
/*    */ import net.minecraft.world.InteractionResult;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.item.Item;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.item.Rarity;
/*    */ import net.minecraft.world.item.TooltipFlag;
/*    */ import net.minecraft.world.item.UseAnim;
/*    */ import net.minecraft.world.item.context.UseOnContext;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class BookpilerandomItem
/*    */   extends Item {
/*    */   public BookpilerandomItem() {
/* 22 */     super((new Item.Properties()).tab(LatexModTabs.TAB_LATEX).stacksTo(16).rarity(Rarity.COMMON));
/*    */   }
/*    */ 
/*    */   
/*    */   public UseAnim getUseAnimation(ItemStack itemstack) {
/* 27 */     return UseAnim.EAT;
/*    */   }
/*    */ 
/*    */   
/*    */   public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
/* 32 */     super.appendHoverText(itemstack, world, list, flag);
/* 33 */     list.add(new TextComponent("Places a random book pile"));
/*    */   }
/*    */ 
/*    */   
/*    */   public InteractionResult useOn(UseOnContext context) {
/* 38 */     InteractionResult retval = super.useOn(context);
/* 39 */     BookpilerandomRightClickedOnBlockProcedure.execute((LevelAccessor)context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context
/* 40 */         .getClickedPos().getZ(), (Entity)context.getPlayer());
/* 41 */     return retval;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\item\BookpilerandomItem.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */