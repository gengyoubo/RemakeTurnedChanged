/*    */ package net.ltxprogrammer.turned.item;
/*    */ 
/*    */ import java.util.List;
/*    */ import net.ltxprogrammer.turned.entity.LatexDartRifleEntity;
/*    */ import net.ltxprogrammer.turned.procedures.DartrifleEntitySwingsItemProcedure;
/*    */ import net.ltxprogrammer.turned.procedures.DartrifleRangedItemUsedProcedure;
/*    */ import net.ltxprogrammer.turned.procedures.LatexDartRifleCanUseRangedItemProcedure;
/*    */ import net.minecraft.network.chat.Component;
/*    */ import net.minecraft.network.chat.TextComponent;
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
/*    */ import net.minecraft.world.item.TooltipFlag;
/*    */ import net.minecraft.world.item.UseAnim;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class LatexDartRifleItem
/*    */   extends Item {
/*    */   public LatexDartRifleItem() {
/* 28 */     super((new Item.Properties()).m_41491_(null).m_41487_(1));
/*    */   }
/*    */ 
/*    */   
/*    */   public InteractionResultHolder<ItemStack> m_7203_(Level world, Player entity, InteractionHand hand) {
/* 33 */     entity.m_6672_(hand);
/* 34 */     return new InteractionResultHolder(InteractionResult.SUCCESS, entity.m_21120_(hand));
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean onEntitySwing(ItemStack itemstack, LivingEntity entity) {
/* 39 */     boolean retval = super.onEntitySwing(itemstack, entity);
/* 40 */     DartrifleEntitySwingsItemProcedure.execute((Entity)entity);
/* 41 */     return retval;
/*    */   }
/*    */ 
/*    */   
/*    */   public void m_7373_(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
/* 46 */     super.m_7373_(itemstack, world, list, flag);
/* 47 */     list.add(new TextComponent("Latex Mode"));
/*    */   }
/*    */ 
/*    */   
/*    */   public UseAnim m_6164_(ItemStack itemstack) {
/* 52 */     return UseAnim.NONE;
/*    */   }
/*    */ 
/*    */   
/*    */   public int m_8105_(ItemStack itemstack) {
/* 57 */     return 72000;
/*    */   }
/*    */ 
/*    */   
/*    */   public void m_5551_(ItemStack itemstack, Level world, LivingEntity entityLiving, int timeLeft) {
/* 62 */     if (!world.m_5776_() && entityLiving instanceof ServerPlayer) { ServerPlayer entity = (ServerPlayer)entityLiving;
/* 63 */       double x = entity.m_20185_();
/* 64 */       double y = entity.m_20186_();
/* 65 */       double z = entity.m_20189_();
/* 66 */       if (LatexDartRifleCanUseRangedItemProcedure.execute((Entity)entity, itemstack)) {
/* 67 */         LatexDartRifleEntity entityarrow = LatexDartRifleEntity.shoot(world, (LivingEntity)entity, world.m_5822_(), 2.5F, 1.5D, 0);
/* 68 */         itemstack.m_41622_(1, (LivingEntity)entity, e -> e.m_21190_(entity.m_7655_()));
/* 69 */         entityarrow.f_36705_ = AbstractArrow.Pickup.DISALLOWED;
/*    */         
/* 71 */         DartrifleRangedItemUsedProcedure.execute((LevelAccessor)world, x, y, z, (Entity)entity, itemstack);
/*    */       }  }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\item\LatexDartRifleItem.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */