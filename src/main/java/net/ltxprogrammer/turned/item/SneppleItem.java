/*    */ package net.ltxprogrammer.turned.item;
/*    */ 
/*    */ import java.util.List;
/*    */ import net.ltxprogrammer.turned.entity.SneppleEntity;
/*    */ import net.ltxprogrammer.turned.init.LatexModItems;
/*    */ import net.ltxprogrammer.turned.procedures.SneppleRangedItemUsedProcedure;
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
/*    */ import net.minecraft.world.item.ProjectileWeaponItem;
/*    */ import net.minecraft.world.item.TooltipFlag;
/*    */ import net.minecraft.world.item.UseAnim;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ import net.minecraft.world.level.Level;
/*    */ 
/*    */ public class SneppleItem
/*    */   extends Item {
/*    */   public SneppleItem() {
/* 28 */     super((new Item.Properties()).m_41491_(null).m_41487_(16));
/*    */   }
/*    */ 
/*    */   
/*    */   public InteractionResultHolder<ItemStack> m_7203_(Level world, Player entity, InteractionHand hand) {
/* 33 */     entity.m_6672_(hand);
/* 34 */     return new InteractionResultHolder(InteractionResult.SUCCESS, entity.m_21120_(hand));
/*    */   }
/*    */ 
/*    */   
/*    */   public void m_7373_(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
/* 39 */     super.m_7373_(itemstack, world, list, flag);
/* 40 */     list.add(new TextComponent("Snep in a bottle."));
/*    */   }
/*    */ 
/*    */   
/*    */   public UseAnim m_6164_(ItemStack itemstack) {
/* 45 */     return UseAnim.SPEAR;
/*    */   }
/*    */ 
/*    */   
/*    */   public int m_8105_(ItemStack itemstack) {
/* 50 */     return 72000;
/*    */   }
/*    */ 
/*    */   
/*    */   public void m_5551_(ItemStack itemstack, Level world, LivingEntity entityLiving, int timeLeft) {
/* 55 */     if (!world.m_5776_() && entityLiving instanceof ServerPlayer) { ServerPlayer entity = (ServerPlayer)entityLiving;
/* 56 */       double x = entity.m_20185_();
/* 57 */       double y = entity.m_20186_();
/* 58 */       double z = entity.m_20189_();
/*    */       
/* 60 */       ItemStack stack = ProjectileWeaponItem.m_43010_((LivingEntity)entity, e -> (e.m_41720_() == LatexModItems.SNEPPLE.get()));
/* 61 */       if (stack == ItemStack.f_41583_) {
/* 62 */         for (int i = 0; i < (entity.m_150109_()).f_35974_.size(); i++) {
/* 63 */           ItemStack teststack = (ItemStack)(entity.m_150109_()).f_35974_.get(i);
/* 64 */           if (teststack != null && teststack.m_41720_() == LatexModItems.SNEPPLE.get()) {
/* 65 */             stack = teststack;
/*    */             break;
/*    */           } 
/*    */         } 
/*    */       }
/* 70 */       if ((entity.m_150110_()).f_35937_ || stack != ItemStack.f_41583_) {
/* 71 */         SneppleEntity entityarrow = SneppleEntity.shoot(world, (LivingEntity)entity, world.m_5822_(), 1.0F, 2.0D, 1);
/* 72 */         itemstack.m_41622_(1, (LivingEntity)entity, e -> e.m_21190_(entity.m_7655_()));
/* 73 */         if ((entity.m_150110_()).f_35937_) {
/* 74 */           entityarrow.f_36705_ = AbstractArrow.Pickup.CREATIVE_ONLY;
/*    */         }
/* 76 */         else if ((new ItemStack((ItemLike)LatexModItems.SNEPPLE.get())).m_41763_()) {
/* 77 */           if (stack.m_41629_(1, world.m_5822_(), entity)) {
/* 78 */             stack.m_41774_(1);
/* 79 */             stack.m_41721_(0);
/* 80 */             if (stack.m_41619_())
/* 81 */               entity.m_150109_().m_36057_(stack); 
/*    */           } 
/*    */         } else {
/* 84 */           stack.m_41774_(1);
/* 85 */           if (stack.m_41619_()) {
/* 86 */             entity.m_150109_().m_36057_(stack);
/*    */           }
/*    */         } 
/*    */         
/* 90 */         SneppleRangedItemUsedProcedure.execute((Entity)entity, itemstack);
/*    */       }  }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\item\SneppleItem.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */