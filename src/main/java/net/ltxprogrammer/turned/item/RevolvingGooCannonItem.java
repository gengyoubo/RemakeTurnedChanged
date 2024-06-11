/*    */ package net.ltxprogrammer.turned.item;
/*    */ 
/*    */ import net.ltxprogrammer.changed.init.ChangedItems;
/*    */ import net.ltxprogrammer.turned.entity.RevolvingGooCannonEntity;
/*    */ import net.ltxprogrammer.turned.init.LatexModTabs;
/*    */ import net.ltxprogrammer.turned.procedures.RevolvingGooCannonCanUseRangedItemProcedure;
/*    */ import net.ltxprogrammer.turned.procedures.RevolvingGooCannonRangedItemUsedProcedure;
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
/*    */ import net.minecraft.world.item.UseAnim;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ import net.minecraft.world.level.Level;
/*    */ 
/*    */ public class RevolvingGooCannonItem extends Item {
/*    */   public RevolvingGooCannonItem() {
/* 25 */     super((new Item.Properties()).m_41491_(LatexModTabs.TAB_LATEXITEMS).m_41503_(96));
/*    */   }
/*    */ 
/*    */   
/*    */   public InteractionResultHolder<ItemStack> m_7203_(Level world, Player entity, InteractionHand hand) {
/* 30 */     entity.m_6672_(hand);
/* 31 */     return new InteractionResultHolder(InteractionResult.SUCCESS, entity.m_21120_(hand));
/*    */   }
/*    */ 
/*    */   
/*    */   public UseAnim m_6164_(ItemStack itemstack) {
/* 36 */     return UseAnim.NONE;
/*    */   }
/*    */ 
/*    */   
/*    */   public int m_8105_(ItemStack itemstack) {
/* 41 */     return 72000;
/*    */   }
/*    */ 
/*    */   
/*    */   public void onUsingTick(ItemStack itemstack, LivingEntity entityLiving, int count) {
/* 46 */     Level world = entityLiving.f_19853_;
/* 47 */     if (!world.m_5776_() && entityLiving instanceof ServerPlayer) { ServerPlayer entity = (ServerPlayer)entityLiving;
/* 48 */       double x = entity.m_20185_();
/* 49 */       double y = entity.m_20186_();
/* 50 */       double z = entity.m_20189_();
/* 51 */       if (RevolvingGooCannonCanUseRangedItemProcedure.execute(itemstack)) {
/* 52 */         ItemStack stack = ProjectileWeaponItem.m_43010_((LivingEntity)entity, e -> (e.m_41720_() == ChangedItems.DARK_LATEX_GOO.get()));
/* 53 */         if (stack == ItemStack.f_41583_) {
/* 54 */           for (int i = 0; i < (entity.m_150109_()).f_35974_.size(); i++) {
/* 55 */             ItemStack teststack = (ItemStack)(entity.m_150109_()).f_35974_.get(i);
/* 56 */             if (teststack != null && teststack.m_41720_() == ChangedItems.DARK_LATEX_GOO.get()) {
/* 57 */               stack = teststack;
/*    */               break;
/*    */             } 
/*    */           } 
/*    */         }
/* 62 */         if ((entity.m_150110_()).f_35937_ || stack != ItemStack.f_41583_) {
/* 63 */           RevolvingGooCannonEntity entityarrow = RevolvingGooCannonEntity.shoot(world, (LivingEntity)entity, world.m_5822_(), 1.2F, 0.6D, 1);
/* 64 */           itemstack.m_41622_(1, (LivingEntity)entity, e -> e.m_21190_(entity.m_7655_()));
/* 65 */           if ((entity.m_150110_()).f_35937_) {
/* 66 */             entityarrow.f_36705_ = AbstractArrow.Pickup.CREATIVE_ONLY;
/*    */           }
/* 68 */           else if ((new ItemStack((ItemLike)ChangedItems.DARK_LATEX_GOO.get())).m_41763_()) {
/* 69 */             if (stack.m_41629_(1, world.m_5822_(), entity)) {
/* 70 */               stack.m_41774_(1);
/* 71 */               stack.m_41721_(0);
/* 72 */               if (stack.m_41619_())
/* 73 */                 entity.m_150109_().m_36057_(stack); 
/*    */             } 
/*    */           } else {
/* 76 */             stack.m_41774_(1);
/* 77 */             if (stack.m_41619_()) {
/* 78 */               entity.m_150109_().m_36057_(stack);
/*    */             }
/*    */           } 
/*    */           
/* 82 */           RevolvingGooCannonRangedItemUsedProcedure.execute((Entity)entity, itemstack);
/*    */         } 
/* 84 */         entity.m_21253_();
/*    */       }  }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\item\RevolvingGooCannonItem.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */