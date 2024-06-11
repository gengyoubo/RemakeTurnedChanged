/*    */ package net.ltxprogrammer.turned.item;
/*    */ 
/*    */ import com.google.common.collect.ImmutableMultimap;
/*    */ import com.google.common.collect.Multimap;
/*    */ import net.ltxprogrammer.turned.entity.AR70AssaultRifleEntity;
/*    */ import net.ltxprogrammer.turned.init.LatexModTabs;
/*    */ import net.ltxprogrammer.turned.procedures.AssaultRifleCanUseRangedItemProcedure;
/*    */ import net.ltxprogrammer.turned.procedures.AssaultRifleRangedItemUsedProcedure;
/*    */ import net.minecraft.server.level.ServerPlayer;
/*    */ import net.minecraft.world.InteractionHand;
/*    */ import net.minecraft.world.InteractionResult;
/*    */ import net.minecraft.world.InteractionResultHolder;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.EquipmentSlot;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.entity.ai.attributes.Attribute;
/*    */ import net.minecraft.world.entity.ai.attributes.AttributeModifier;
/*    */ import net.minecraft.world.entity.ai.attributes.Attributes;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.entity.projectile.AbstractArrow;
/*    */ import net.minecraft.world.item.Item;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.item.UseAnim;
/*    */ import net.minecraft.world.level.Level;
/*    */ 
/*    */ public class AR70AssaultRifleItem
/*    */   extends Item
/*    */ {
/*    */   public AR70AssaultRifleItem() {
/* 30 */     super((new Item.Properties()).m_41491_(LatexModTabs.TAB_LATEXITEMS).m_41503_(280));
/*    */   }
/*    */ 
/*    */   
/*    */   public InteractionResultHolder<ItemStack> m_7203_(Level world, Player entity, InteractionHand hand) {
/* 35 */     entity.m_6672_(hand);
/* 36 */     return new InteractionResultHolder(InteractionResult.SUCCESS, entity.m_21120_(hand));
/*    */   }
/*    */ 
/*    */   
/*    */   public UseAnim m_6164_(ItemStack itemstack) {
/* 41 */     return UseAnim.NONE;
/*    */   }
/*    */ 
/*    */   
/*    */   public int m_8105_(ItemStack itemstack) {
/* 46 */     return 72000;
/*    */   }
/*    */ 
/*    */   
/*    */   public Multimap<Attribute, AttributeModifier> m_7167_(EquipmentSlot slot) {
/* 51 */     if (slot == EquipmentSlot.MAINHAND) {
/* 52 */       ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
/* 53 */       builder.putAll(super.m_7167_(slot));
/* 54 */       builder.put(Attributes.f_22281_, new AttributeModifier(f_41374_, "Ranged item modifier", 4.5D, AttributeModifier.Operation.ADDITION));
/*    */       
/* 56 */       builder.put(Attributes.f_22283_, new AttributeModifier(f_41375_, "Ranged item modifier", -2.4D, AttributeModifier.Operation.ADDITION));
/*    */       
/* 58 */       return (Multimap<Attribute, AttributeModifier>)builder.build();
/*    */     } 
/* 60 */     return super.m_7167_(slot);
/*    */   }
/*    */ 
/*    */   
/*    */   public void onUsingTick(ItemStack itemstack, LivingEntity entityLiving, int count) {
/* 65 */     Level world = entityLiving.f_19853_;
/* 66 */     if (!world.m_5776_() && entityLiving instanceof ServerPlayer) { ServerPlayer entity = (ServerPlayer)entityLiving;
/* 67 */       double x = entity.m_20185_();
/* 68 */       double y = entity.m_20186_();
/* 69 */       double z = entity.m_20189_();
/* 70 */       if (AssaultRifleCanUseRangedItemProcedure.execute((Entity)entity, itemstack)) {
/* 71 */         AR70AssaultRifleEntity entityarrow = AR70AssaultRifleEntity.shoot(world, (LivingEntity)entity, world.m_5822_(), 2.4F, 1.0D, 0);
/* 72 */         itemstack.m_41622_(1, (LivingEntity)entity, e -> e.m_21190_(entity.m_7655_()));
/* 73 */         entityarrow.f_36705_ = AbstractArrow.Pickup.DISALLOWED;
/*    */         
/* 75 */         AssaultRifleRangedItemUsedProcedure.execute((Entity)entity, itemstack);
/* 76 */         entity.m_21253_();
/*    */       }  }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\item\AR70AssaultRifleItem.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */