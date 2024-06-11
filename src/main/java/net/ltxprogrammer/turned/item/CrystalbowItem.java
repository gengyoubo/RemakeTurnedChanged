/*    */ package net.ltxprogrammer.turned.item;
/*    */ 
/*    */ import java.util.List;
/*    */ import net.ltxprogrammer.turned.entity.CrystalbowEntity;
/*    */ import net.ltxprogrammer.turned.init.LatexModItems;
/*    */ import net.ltxprogrammer.turned.init.LatexModTabs;
/*    */ import net.ltxprogrammer.turned.procedures.CrystalbowRangedItemUsedProcedure;
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
/*    */ public class CrystalbowItem
/*    */   extends Item {
/*    */   public CrystalbowItem() {
/* 29 */     super((new Item.Properties()).m_41491_(LatexModTabs.TAB_LATEXITEMS).m_41503_(120));
/*    */   }
/*    */ 
/*    */   
/*    */   public InteractionResultHolder<ItemStack> m_7203_(Level world, Player entity, InteractionHand hand) {
/* 34 */     entity.m_6672_(hand);
/* 35 */     return new InteractionResultHolder(InteractionResult.SUCCESS, entity.m_21120_(hand));
/*    */   }
/*    */ 
/*    */   
/*    */   public void m_7373_(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
/* 40 */     super.m_7373_(itemstack, world, list, flag);
/* 41 */     list.add(new TextComponent("help how to make bow animations"));
/*    */   }
/*    */ 
/*    */   
/*    */   public UseAnim m_6164_(ItemStack itemstack) {
/* 46 */     return UseAnim.BOW;
/*    */   }
/*    */ 
/*    */   
/*    */   public int m_8105_(ItemStack itemstack) {
/* 51 */     return 72000;
/*    */   }
/*    */ 
/*    */   
/*    */   public void m_5551_(ItemStack itemstack, Level world, LivingEntity entityLiving, int timeLeft) {
/* 56 */     if (!world.m_5776_() && entityLiving instanceof ServerPlayer) { ServerPlayer entity = (ServerPlayer)entityLiving;
/* 57 */       double x = entity.m_20185_();
/* 58 */       double y = entity.m_20186_();
/* 59 */       double z = entity.m_20189_();
/*    */       
/* 61 */       ItemStack stack = ProjectileWeaponItem.m_43010_((LivingEntity)entity, e -> (e.m_41720_() == LatexModItems.CRYSTALARROW.get()));
/* 62 */       if (stack == ItemStack.f_41583_) {
/* 63 */         for (int i = 0; i < (entity.m_150109_()).f_35974_.size(); i++) {
/* 64 */           ItemStack teststack = (ItemStack)(entity.m_150109_()).f_35974_.get(i);
/* 65 */           if (teststack != null && teststack.m_41720_() == LatexModItems.CRYSTALARROW.get()) {
/* 66 */             stack = teststack;
/*    */             break;
/*    */           } 
/*    */         } 
/*    */       }
/* 71 */       if ((entity.m_150110_()).f_35937_ || stack != ItemStack.f_41583_) {
/* 72 */         CrystalbowEntity entityarrow = CrystalbowEntity.shoot(world, (LivingEntity)entity, world.m_5822_(), 1.5F, 1.5D, 0);
/* 73 */         itemstack.m_41622_(1, (LivingEntity)entity, e -> e.m_21190_(entity.m_7655_()));
/* 74 */         if ((entity.m_150110_()).f_35937_) {
/* 75 */           entityarrow.f_36705_ = AbstractArrow.Pickup.CREATIVE_ONLY;
/*    */         }
/* 77 */         else if ((new ItemStack((ItemLike)LatexModItems.CRYSTALARROW.get())).m_41763_()) {
/* 78 */           if (stack.m_41629_(1, world.m_5822_(), entity)) {
/* 79 */             stack.m_41774_(1);
/* 80 */             stack.m_41721_(0);
/* 81 */             if (stack.m_41619_())
/* 82 */               entity.m_150109_().m_36057_(stack); 
/*    */           } 
/*    */         } else {
/* 85 */           stack.m_41774_(1);
/* 86 */           if (stack.m_41619_()) {
/* 87 */             entity.m_150109_().m_36057_(stack);
/*    */           }
/*    */         } 
/*    */         
/* 91 */         CrystalbowRangedItemUsedProcedure.execute((Entity)entity, itemstack);
/*    */       }  }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\item\CrystalbowItem.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */