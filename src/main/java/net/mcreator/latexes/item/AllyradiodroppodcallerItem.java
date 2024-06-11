/*    */ package net.mcreator.latexes.item;
/*    */ 
/*    */ import net.mcreator.latexes.init.LatexModTabs;
/*    */ import net.mcreator.latexes.procedures.AllyradiodroppodcallerRightClickedOnBlockProcedure;
/*    */ import net.minecraft.world.InteractionResult;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.item.Item;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.item.Rarity;
/*    */ import net.minecraft.world.item.UseAnim;
/*    */ import net.minecraft.world.item.context.UseOnContext;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class AllyradiodroppodcallerItem extends Item {
/*    */   public AllyradiodroppodcallerItem() {
/* 16 */     super((new Item.Properties()).tab(LatexModTabs.TAB_LATEXITEMS).stacksTo(1).rarity(Rarity.UNCOMMON));
/*    */   }
/*    */ 
/*    */   
/*    */   public UseAnim getUseAnimation(ItemStack itemstack) {
/* 21 */     return UseAnim.EAT;
/*    */   }
/*    */ 
/*    */   
/*    */   public InteractionResult useOn(UseOnContext context) {
/* 26 */     InteractionResult retval = super.useOn(context);
/* 27 */     AllyradiodroppodcallerRightClickedOnBlockProcedure.execute((LevelAccessor)context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context
/* 28 */         .getClickedPos().getZ(), (Entity)context.getPlayer(), context.getItemInHand());
/* 29 */     return retval;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\item\AllyradiodroppodcallerItem.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */