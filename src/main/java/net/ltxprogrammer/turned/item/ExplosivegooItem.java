/*    */ package net.ltxprogrammer.turned.item;
/*    */ 
/*    */ import net.ltxprogrammer.turned.entity.ExplosivegooEntity;
/*    */ import net.ltxprogrammer.turned.init.LatexModItems;
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
/*    */ import net.minecraft.world.item.UseAnim;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraftforge.api.distmarker.Dist;
/*    */ import net.minecraftforge.api.distmarker.OnlyIn;
/*    */ 
/*    */ public class ExplosivegooItem
/*    */   extends Item
/*    */ {
/*    */   public ExplosivegooItem() {
/* 25 */     super((new Item.Properties()).m_41491_(null).m_41487_(8));
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
/* 36 */     return UseAnim.SPEAR;
/*    */   }
/*    */ 
/*    */   
/*    */   public int m_8105_(ItemStack itemstack) {
/* 41 */     return 72000;
/*    */   }
/*    */ 
/*    */   
/*    */   @OnlyIn(Dist.CLIENT)
/*    */   public boolean m_5812_(ItemStack itemstack) {
/* 47 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public void onUsingTick(ItemStack itemstack, LivingEntity entityLiving, int count) {
/* 52 */     Level world = entityLiving.f_19853_;
/* 53 */     if (!world.m_5776_() && entityLiving instanceof ServerPlayer) { ServerPlayer entity = (ServerPlayer)entityLiving;
/* 54 */       double x = entity.m_20185_();
/* 55 */       double y = entity.m_20186_();
/* 56 */       double z = entity.m_20189_();
/*    */       
/* 58 */       ItemStack stack = ProjectileWeaponItem.m_43010_((LivingEntity)entity, e -> (e.m_41720_() == LatexModItems.EXPLOSIVEGOO.get()));
/* 59 */       if (stack == ItemStack.f_41583_) {
/* 60 */         for (int i = 0; i < (entity.m_150109_()).f_35974_.size(); i++) {
/* 61 */           ItemStack teststack = (ItemStack)(entity.m_150109_()).f_35974_.get(i);
/* 62 */           if (teststack != null && teststack.m_41720_() == LatexModItems.EXPLOSIVEGOO.get()) {
/* 63 */             stack = teststack;
/*    */             break;
/*    */           } 
/*    */         } 
/*    */       }
/* 68 */       if ((entity.m_150110_()).f_35937_ || stack != ItemStack.f_41583_) {
/* 69 */         ExplosivegooEntity entityarrow = ExplosivegooEntity.shoot(world, (LivingEntity)entity, world.m_5822_(), 0.5F, 0.5D, 2);
/* 70 */         itemstack.m_41622_(1, (LivingEntity)entity, e -> e.m_21190_(entity.m_7655_()));
/* 71 */         if ((entity.m_150110_()).f_35937_) {
/* 72 */           entityarrow.f_36705_ = AbstractArrow.Pickup.CREATIVE_ONLY;
/*    */         }
/* 74 */         else if ((new ItemStack((ItemLike)LatexModItems.EXPLOSIVEGOO.get())).m_41763_()) {
/* 75 */           if (stack.m_41629_(1, world.m_5822_(), entity)) {
/* 76 */             stack.m_41774_(1);
/* 77 */             stack.m_41721_(0);
/* 78 */             if (stack.m_41619_())
/* 79 */               entity.m_150109_().m_36057_(stack); 
/*    */           } 
/*    */         } else {
/* 82 */           stack.m_41774_(1);
/* 83 */           if (stack.m_41619_()) {
/* 84 */             entity.m_150109_().m_36057_(stack);
/*    */           }
/*    */         } 
/*    */       } 
/* 88 */       entity.m_21253_(); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\item\ExplosivegooItem.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */