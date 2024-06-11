/*    */ package net.ltxprogrammer.turned.item;
/*    */ 
/*    */ import java.util.List;
/*    */ import net.ltxprogrammer.turned.entity.TankCannonEntity;
/*    */ import net.minecraft.network.chat.Component;
/*    */ import net.minecraft.network.chat.TextComponent;
/*    */ import net.minecraft.server.level.ServerPlayer;
/*    */ import net.minecraft.world.InteractionHand;
/*    */ import net.minecraft.world.InteractionResult;
/*    */ import net.minecraft.world.InteractionResultHolder;
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
/*    */ import net.minecraft.world.level.block.Blocks;
/*    */ 
/*    */ public class TankCannonItem
/*    */   extends Item
/*    */ {
/*    */   public TankCannonItem() {
/* 27 */     super((new Item.Properties()).m_41491_(null).m_41487_(1));
/*    */   }
/*    */ 
/*    */   
/*    */   public InteractionResultHolder<ItemStack> m_7203_(Level world, Player entity, InteractionHand hand) {
/* 32 */     entity.m_6672_(hand);
/* 33 */     return new InteractionResultHolder(InteractionResult.SUCCESS, entity.m_21120_(hand));
/*    */   }
/*    */ 
/*    */   
/*    */   public void m_7373_(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
/* 38 */     super.m_7373_(itemstack, world, list, flag);
/* 39 */     list.add(new TextComponent("You're DEFINETIVELY not supposed to have this."));
/*    */   }
/*    */ 
/*    */   
/*    */   public UseAnim m_6164_(ItemStack itemstack) {
/* 44 */     return UseAnim.NONE;
/*    */   }
/*    */ 
/*    */   
/*    */   public int m_8105_(ItemStack itemstack) {
/* 49 */     return 72000;
/*    */   }
/*    */ 
/*    */   
/*    */   public void m_5551_(ItemStack itemstack, Level world, LivingEntity entityLiving, int timeLeft) {
/* 54 */     if (!world.m_5776_() && entityLiving instanceof ServerPlayer) { ServerPlayer entity = (ServerPlayer)entityLiving;
/* 55 */       double x = entity.m_20185_();
/* 56 */       double y = entity.m_20186_();
/* 57 */       double z = entity.m_20189_();
/*    */       
/* 59 */       ItemStack stack = ProjectileWeaponItem.m_43010_((LivingEntity)entity, e -> (e.m_41720_() == Blocks.f_50077_.m_5456_()));
/* 60 */       if (stack == ItemStack.f_41583_) {
/* 61 */         for (int i = 0; i < (entity.m_150109_()).f_35974_.size(); i++) {
/* 62 */           ItemStack teststack = (ItemStack)(entity.m_150109_()).f_35974_.get(i);
/* 63 */           if (teststack != null && teststack.m_41720_() == Blocks.f_50077_.m_5456_()) {
/* 64 */             stack = teststack;
/*    */             break;
/*    */           } 
/*    */         } 
/*    */       }
/* 69 */       if ((entity.m_150110_()).f_35937_ || stack != ItemStack.f_41583_) {
/* 70 */         TankCannonEntity entityarrow = TankCannonEntity.shoot(world, (LivingEntity)entity, world.m_5822_(), 10.0F, 100.0D, 5);
/* 71 */         itemstack.m_41622_(1, (LivingEntity)entity, e -> e.m_21190_(entity.m_7655_()));
/* 72 */         if ((entity.m_150110_()).f_35937_) {
/* 73 */           entityarrow.f_36705_ = AbstractArrow.Pickup.CREATIVE_ONLY;
/*    */         }
/* 75 */         else if ((new ItemStack((ItemLike)Blocks.f_50077_)).m_41763_()) {
/* 76 */           if (stack.m_41629_(1, world.m_5822_(), entity)) {
/* 77 */             stack.m_41774_(1);
/* 78 */             stack.m_41721_(0);
/* 79 */             if (stack.m_41619_())
/* 80 */               entity.m_150109_().m_36057_(stack); 
/*    */           } 
/*    */         } else {
/* 83 */           stack.m_41774_(1);
/* 84 */           if (stack.m_41619_())
/* 85 */             entity.m_150109_().m_36057_(stack); 
/*    */         } 
/*    */       }  }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\item\TankCannonItem.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */