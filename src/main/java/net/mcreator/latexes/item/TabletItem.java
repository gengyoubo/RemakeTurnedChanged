/*    */ package net.mcreator.latexes.item;
/*    */ 
/*    */ import net.mcreator.latexes.init.LatexModTabs;
/*    */ import net.mcreator.latexes.procedures.TabletRightClickedInAirProcedure;
/*    */ import net.minecraft.world.InteractionHand;
/*    */ import net.minecraft.world.InteractionResultHolder;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.item.Item;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.item.Rarity;
/*    */ import net.minecraft.world.item.UseAnim;
/*    */ import net.minecraft.world.level.Level;
/*    */ 
/*    */ public class TabletItem
/*    */   extends Item {
/*    */   public TabletItem() {
/* 18 */     super((new Item.Properties()).tab(LatexModTabs.TAB_LATEXITEMS).stacksTo(1).rarity(Rarity.COMMON));
/*    */   }
/*    */ 
/*    */   
/*    */   public UseAnim getUseAnimation(ItemStack itemstack) {
/* 23 */     return UseAnim.EAT;
/*    */   }
/*    */ 
/*    */   
/*    */   public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
/* 28 */     InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
/* 29 */     ItemStack itemstack = (ItemStack)ar.getObject();
/* 30 */     double x = entity.getX();
/* 31 */     double y = entity.getY();
/* 32 */     double z = entity.getZ();
/*    */     
/* 34 */     TabletRightClickedInAirProcedure.execute((Entity)entity);
/* 35 */     return ar;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\item\TabletItem.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */