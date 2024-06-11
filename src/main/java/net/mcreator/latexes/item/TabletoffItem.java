/*    */ package net.mcreator.latexes.item;
/*    */ 
/*    */ import net.mcreator.latexes.procedures.TabletoffRightClickedInAirProcedure;
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
/*    */ public class TabletoffItem
/*    */   extends Item {
/*    */   public TabletoffItem() {
/* 17 */     super((new Item.Properties()).tab(null).stacksTo(1).rarity(Rarity.COMMON));
/*    */   }
/*    */ 
/*    */   
/*    */   public UseAnim getUseAnimation(ItemStack itemstack) {
/* 22 */     return UseAnim.EAT;
/*    */   }
/*    */ 
/*    */   
/*    */   public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
/* 27 */     InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
/* 28 */     ItemStack itemstack = (ItemStack)ar.getObject();
/* 29 */     double x = entity.getX();
/* 30 */     double y = entity.getY();
/* 31 */     double z = entity.getZ();
/*    */     
/* 33 */     TabletoffRightClickedInAirProcedure.execute((Entity)entity);
/* 34 */     return ar;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\item\TabletoffItem.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */