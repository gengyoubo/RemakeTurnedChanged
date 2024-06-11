/*    */ package net.mcreator.latexes.item;
/*    */ 
/*    */ import com.google.common.collect.ImmutableMultimap;
/*    */ import com.google.common.collect.Multimap;
/*    */ import net.mcreator.latexes.entity.AR70AssaultRifleEntity;
/*    */ import net.mcreator.latexes.init.LatexModTabs;
/*    */ import net.mcreator.latexes.procedures.AssaultRifleCanUseRangedItemProcedure;
/*    */ import net.mcreator.latexes.procedures.AssaultRifleRangedItemUsedProcedure;
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
/* 30 */     super((new Item.Properties()).tab(LatexModTabs.TAB_LATEXITEMS).durability(280));
/*    */   }
/*    */ 
/*    */   
/*    */   public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
/* 35 */     entity.startUsingItem(hand);
/* 36 */     return new InteractionResultHolder(InteractionResult.SUCCESS, entity.getItemInHand(hand));
/*    */   }
/*    */ 
/*    */   
/*    */   public UseAnim getUseAnimation(ItemStack itemstack) {
/* 41 */     return UseAnim.NONE;
/*    */   }
/*    */ 
/*    */   
/*    */   public int getUseDuration(ItemStack itemstack) {
/* 46 */     return 72000;
/*    */   }
/*    */ 
/*    */   
/*    */   public Multimap<Attribute, AttributeModifier> getDefaultAttributeModifiers(EquipmentSlot slot) {
/* 51 */     if (slot == EquipmentSlot.MAINHAND) {
/* 52 */       ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
/* 53 */       builder.putAll(super.getDefaultAttributeModifiers(slot));
/* 54 */       builder.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(BASE_ATTACK_DAMAGE_UUID, "Ranged item modifier", 4.5D, AttributeModifier.Operation.ADDITION));
/*    */       
/* 56 */       builder.put(Attributes.ATTACK_SPEED, new AttributeModifier(BASE_ATTACK_SPEED_UUID, "Ranged item modifier", -2.4D, AttributeModifier.Operation.ADDITION));
/*    */       
/* 58 */       return (Multimap<Attribute, AttributeModifier>)builder.build();
/*    */     } 
/* 60 */     return super.getDefaultAttributeModifiers(slot);
/*    */   }
/*    */ 
/*    */   
/*    */   public void onUsingTick(ItemStack itemstack, LivingEntity entityLiving, int count) {
/* 65 */     Level world = entityLiving.level;
/* 66 */     if (!world.isClientSide() && entityLiving instanceof ServerPlayer) { ServerPlayer entity = (ServerPlayer)entityLiving;
/* 67 */       double x = entity.getX();
/* 68 */       double y = entity.getY();
/* 69 */       double z = entity.getZ();
/* 70 */       if (AssaultRifleCanUseRangedItemProcedure.execute((Entity)entity, itemstack)) {
/* 71 */         AR70AssaultRifleEntity entityarrow = AR70AssaultRifleEntity.shoot(world, (LivingEntity)entity, world.getRandom(), 2.4F, 1.0D, 0);
/* 72 */         itemstack.hurtAndBreak(1, (LivingEntity)entity, e -> e.broadcastBreakEvent(entity.getUsedItemHand()));
/* 73 */         entityarrow.pickup = AbstractArrow.Pickup.DISALLOWED;
/*    */         
/* 75 */         AssaultRifleRangedItemUsedProcedure.execute((Entity)entity, itemstack);
/* 76 */         entity.releaseUsingItem();
/*    */       }  }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\item\AR70AssaultRifleItem.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */