/*    */ package net.mcreator.latexes.item;
/*    */ 
/*    */ import java.util.List;
/*    */ import net.mcreator.latexes.entity.TankCannonEntity;
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
/* 27 */     super((new Item.Properties()).tab(null).stacksTo(1));
/*    */   }
/*    */ 
/*    */   
/*    */   public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
/* 32 */     entity.startUsingItem(hand);
/* 33 */     return new InteractionResultHolder(InteractionResult.SUCCESS, entity.getItemInHand(hand));
/*    */   }
/*    */ 
/*    */   
/*    */   public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
/* 38 */     super.appendHoverText(itemstack, world, list, flag);
/* 39 */     list.add(new TextComponent("You're DEFINETIVELY not supposed to have this."));
/*    */   }
/*    */ 
/*    */   
/*    */   public UseAnim getUseAnimation(ItemStack itemstack) {
/* 44 */     return UseAnim.NONE;
/*    */   }
/*    */ 
/*    */   
/*    */   public int getUseDuration(ItemStack itemstack) {
/* 49 */     return 72000;
/*    */   }
/*    */ 
/*    */   
/*    */   public void releaseUsing(ItemStack itemstack, Level world, LivingEntity entityLiving, int timeLeft) {
/* 54 */     if (!world.isClientSide() && entityLiving instanceof ServerPlayer) { ServerPlayer entity = (ServerPlayer)entityLiving;
/* 55 */       double x = entity.getX();
/* 56 */       double y = entity.getY();
/* 57 */       double z = entity.getZ();
/*    */       
/* 59 */       ItemStack stack = ProjectileWeaponItem.getHeldProjectile((LivingEntity)entity, e -> (e.getItem() == Blocks.TNT.asItem()));
/* 60 */       if (stack == ItemStack.EMPTY) {
/* 61 */         for (int i = 0; i < (entity.getInventory()).items.size(); i++) {
/* 62 */           ItemStack teststack = (ItemStack)(entity.getInventory()).items.get(i);
/* 63 */           if (teststack != null && teststack.getItem() == Blocks.TNT.asItem()) {
/* 64 */             stack = teststack;
/*    */             break;
/*    */           } 
/*    */         } 
/*    */       }
/* 69 */       if ((entity.getAbilities()).instabuild || stack != ItemStack.EMPTY) {
/* 70 */         TankCannonEntity entityarrow = TankCannonEntity.shoot(world, (LivingEntity)entity, world.getRandom(), 10.0F, 100.0D, 5);
/* 71 */         itemstack.hurtAndBreak(1, (LivingEntity)entity, e -> e.broadcastBreakEvent(entity.getUsedItemHand()));
/* 72 */         if ((entity.getAbilities()).instabuild) {
/* 73 */           entityarrow.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
/*    */         }
/* 75 */         else if ((new ItemStack((ItemLike)Blocks.TNT)).isDamageableItem()) {
/* 76 */           if (stack.hurt(1, world.getRandom(), entity)) {
/* 77 */             stack.shrink(1);
/* 78 */             stack.setDamageValue(0);
/* 79 */             if (stack.isEmpty())
/* 80 */               entity.getInventory().removeItem(stack); 
/*    */           } 
/*    */         } else {
/* 83 */           stack.shrink(1);
/* 84 */           if (stack.isEmpty())
/* 85 */             entity.getInventory().removeItem(stack); 
/*    */         } 
/*    */       }  }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\item\TankCannonItem.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */