/*    */ package net.ltxprogrammer.turned.item;
/*    */ 
/*    */ import net.ltxprogrammer.turned.entity.DartrifleEntity;
/*    */ import net.ltxprogrammer.turned.init.LatexModTabs;
/*    */ import net.ltxprogrammer.turned.procedures.DartrifleCanUseRangedItemProcedure;
/*    */ import net.ltxprogrammer.turned.procedures.DartrifleEntitySwingsItemProcedure;
/*    */ import net.ltxprogrammer.turned.procedures.DartrifleRangedItemUsedProcedure;
/*    */ import net.minecraft.server.level.ServerPlayer;
/*    */ import net.minecraft.world.InteractionHand;
/*    */ import net.minecraft.world.InteractionResult;
/*    */ import net.minecraft.world.InteractionResultHolder;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.entity.projectile.AbstractArrow;
/*    */ import net.minecraft.world.item.Item;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.item.UseAnim;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class DartrifleItem extends Item {
/*    */   public DartrifleItem() {
/* 24 */     super((new Item.Properties()).m_41491_(LatexModTabs.TAB_LATEXITEMS).m_41487_(1));
/*    */   }
/*    */ 
/*    */   
/*    */   public InteractionResultHolder<ItemStack> m_7203_(Level world, Player entity, InteractionHand hand) {
/* 29 */     entity.m_6672_(hand);
/* 30 */     return new InteractionResultHolder(InteractionResult.SUCCESS, entity.m_21120_(hand));
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean onEntitySwing(ItemStack itemstack, LivingEntity entity) {
/* 35 */     boolean retval = super.onEntitySwing(itemstack, entity);
/* 36 */     DartrifleEntitySwingsItemProcedure.execute((Entity)entity);
/* 37 */     return retval;
/*    */   }
/*    */ 
/*    */   
/*    */   public UseAnim m_6164_(ItemStack itemstack) {
/* 42 */     return UseAnim.NONE;
/*    */   }
/*    */ 
/*    */   
/*    */   public int m_8105_(ItemStack itemstack) {
/* 47 */     return 72000;
/*    */   }
/*    */ 
/*    */   
/*    */   public void m_5551_(ItemStack itemstack, Level world, LivingEntity entityLiving, int timeLeft) {
/* 52 */     if (!world.m_5776_() && entityLiving instanceof ServerPlayer) { ServerPlayer entity = (ServerPlayer)entityLiving;
/* 53 */       double x = entity.m_20185_();
/* 54 */       double y = entity.m_20186_();
/* 55 */       double z = entity.m_20189_();
/* 56 */       if (DartrifleCanUseRangedItemProcedure.execute((Entity)entity, itemstack)) {
/* 57 */         DartrifleEntity entityarrow = DartrifleEntity.shoot(world, (LivingEntity)entity, world.m_5822_(), 2.5F, 2.5D, 0);
/* 58 */         itemstack.m_41622_(1, (LivingEntity)entity, e -> e.m_21190_(entity.m_7655_()));
/* 59 */         entityarrow.f_36705_ = AbstractArrow.Pickup.DISALLOWED;
/*    */         
/* 61 */         DartrifleRangedItemUsedProcedure.execute((LevelAccessor)world, x, y, z, (Entity)entity, itemstack);
/*    */       }  }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\item\DartrifleItem.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */