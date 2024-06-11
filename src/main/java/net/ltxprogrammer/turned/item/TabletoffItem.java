/*    */ package net.ltxprogrammer.turned.item;
/*    */ 
/*    */ import net.ltxprogrammer.turned.procedures.TabletoffRightClickedInAirProcedure;
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
/* 17 */     super((new Item.Properties()).m_41491_(null).m_41487_(1).m_41497_(Rarity.COMMON));
/*    */   }
/*    */ 
/*    */   
/*    */   public UseAnim m_6164_(ItemStack itemstack) {
/* 22 */     return UseAnim.EAT;
/*    */   }
/*    */ 
/*    */   
/*    */   public InteractionResultHolder<ItemStack> m_7203_(Level world, Player entity, InteractionHand hand) {
/* 27 */     InteractionResultHolder<ItemStack> ar = super.m_7203_(world, entity, hand);
/* 28 */     ItemStack itemstack = (ItemStack)ar.m_19095_();
/* 29 */     double x = entity.m_20185_();
/* 30 */     double y = entity.m_20186_();
/* 31 */     double z = entity.m_20189_();
/*    */     
/* 33 */     TabletoffRightClickedInAirProcedure.execute((Entity)entity);
/* 34 */     return ar;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\item\TabletoffItem.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */