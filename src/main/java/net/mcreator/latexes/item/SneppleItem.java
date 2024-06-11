/*    */ package net.mcreator.latexes.item;
/*    */ 
/*    */ import java.util.List;
/*    */ import net.mcreator.latexes.entity.SneppleEntity;
/*    */ import net.mcreator.latexes.init.LatexModItems;
/*    */ import net.mcreator.latexes.procedures.SneppleRangedItemUsedProcedure;
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
/* 28 */     super((new Item.Properties()).tab(null).stacksTo(16));
/*    */   }
/*    */ 
/*    */   
/*    */   public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
/* 33 */     entity.startUsingItem(hand);
/* 34 */     return new InteractionResultHolder(InteractionResult.SUCCESS, entity.getItemInHand(hand));
/*    */   }
/*    */ 
/*    */   
/*    */   public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
/* 39 */     super.appendHoverText(itemstack, world, list, flag);
/* 40 */     list.add(new TextComponent("Snep in a bottle."));
/*    */   }
/*    */ 
/*    */   
/*    */   public UseAnim getUseAnimation(ItemStack itemstack) {
/* 45 */     return UseAnim.SPEAR;
/*    */   }
/*    */ 
/*    */   
/*    */   public int getUseDuration(ItemStack itemstack) {
/* 50 */     return 72000;
/*    */   }
/*    */ 
/*    */   
/*    */   public void releaseUsing(ItemStack itemstack, Level world, LivingEntity entityLiving, int timeLeft) {
/* 55 */     if (!world.isClientSide() && entityLiving instanceof ServerPlayer) { ServerPlayer entity = (ServerPlayer)entityLiving;
/* 56 */       double x = entity.getX();
/* 57 */       double y = entity.getY();
/* 58 */       double z = entity.getZ();
/*    */       
/* 60 */       ItemStack stack = ProjectileWeaponItem.getHeldProjectile((LivingEntity)entity, e -> (e.getItem() == LatexModItems.SNEPPLE.get()));
/* 61 */       if (stack == ItemStack.EMPTY) {
/* 62 */         for (int i = 0; i < (entity.getInventory()).items.size(); i++) {
/* 63 */           ItemStack teststack = (ItemStack)(entity.getInventory()).items.get(i);
/* 64 */           if (teststack != null && teststack.getItem() == LatexModItems.SNEPPLE.get()) {
/* 65 */             stack = teststack;
/*    */             break;
/*    */           } 
/*    */         } 
/*    */       }
/* 70 */       if ((entity.getAbilities()).instabuild || stack != ItemStack.EMPTY) {
/* 71 */         SneppleEntity entityarrow = SneppleEntity.shoot(world, (LivingEntity)entity, world.getRandom(), 1.0F, 2.0D, 1);
/* 72 */         itemstack.hurtAndBreak(1, (LivingEntity)entity, e -> e.broadcastBreakEvent(entity.getUsedItemHand()));
/* 73 */         if ((entity.getAbilities()).instabuild) {
/* 74 */           entityarrow.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
/*    */         }
/* 76 */         else if ((new ItemStack((ItemLike)LatexModItems.SNEPPLE.get())).isDamageableItem()) {
/* 77 */           if (stack.hurt(1, world.getRandom(), entity)) {
/* 78 */             stack.shrink(1);
/* 79 */             stack.setDamageValue(0);
/* 80 */             if (stack.isEmpty())
/* 81 */               entity.getInventory().removeItem(stack); 
/*    */           } 
/*    */         } else {
/* 84 */           stack.shrink(1);
/* 85 */           if (stack.isEmpty()) {
/* 86 */             entity.getInventory().removeItem(stack);
/*    */           }
/*    */         } 
/*    */         
/* 90 */         SneppleRangedItemUsedProcedure.execute((Entity)entity, itemstack);
/*    */       }  }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\item\SneppleItem.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */