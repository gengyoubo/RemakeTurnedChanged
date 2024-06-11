/*    */ package net.ltxprogrammer.turned.item;
/*    */ 
/*    */ import net.ltxprogrammer.turned.entity.OverundershotgunEntity;
/*    */ import net.ltxprogrammer.turned.init.LatexModTabs;
/*    */ import net.ltxprogrammer.turned.procedures.OverundershotgunCanUseRangedItemProcedure;
/*    */ import net.ltxprogrammer.turned.procedures.OverundershotgunRangedItemUsedProcedure;
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
/*    */ 
/*    */ public class OverundershotgunItem
/*    */   extends Item {
/*    */   public OverundershotgunItem() {
/* 23 */     super((new Item.Properties()).m_41491_(LatexModTabs.TAB_LATEXITEMS).m_41503_(122));
/*    */   }
/*    */ 
/*    */   
/*    */   public InteractionResultHolder<ItemStack> m_7203_(Level world, Player entity, InteractionHand hand) {
/* 28 */     entity.m_6672_(hand);
/* 29 */     return new InteractionResultHolder(InteractionResult.SUCCESS, entity.m_21120_(hand));
/*    */   }
/*    */ 
/*    */   
/*    */   public UseAnim m_6164_(ItemStack itemstack) {
/* 34 */     return UseAnim.NONE;
/*    */   }
/*    */ 
/*    */   
/*    */   public int m_8105_(ItemStack itemstack) {
/* 39 */     return 72000;
/*    */   }
/*    */ 
/*    */   
/*    */   public void m_5551_(ItemStack itemstack, Level world, LivingEntity entityLiving, int timeLeft) {
/* 44 */     if (!world.m_5776_() && entityLiving instanceof ServerPlayer) { ServerPlayer entity = (ServerPlayer)entityLiving;
/* 45 */       double x = entity.m_20185_();
/* 46 */       double y = entity.m_20186_();
/* 47 */       double z = entity.m_20189_();
/* 48 */       if (OverundershotgunCanUseRangedItemProcedure.execute((Entity)entity, itemstack)) {
/* 49 */         OverundershotgunEntity entityarrow = OverundershotgunEntity.shoot(world, (LivingEntity)entity, world.m_5822_(), 1.0F, 3.0D, 2);
/* 50 */         itemstack.m_41622_(1, (LivingEntity)entity, e -> e.m_21190_(entity.m_7655_()));
/* 51 */         entityarrow.f_36705_ = AbstractArrow.Pickup.DISALLOWED;
/*    */         
/* 53 */         OverundershotgunRangedItemUsedProcedure.execute((Entity)entity, itemstack);
/*    */       }  }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\item\OverundershotgunItem.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */