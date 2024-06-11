/*    */ package net.mcreator.latexes.item;
/*    */ 
/*    */ import net.mcreator.latexes.entity.RevolvingGooCannonEntity;
/*    */ import net.mcreator.latexes.init.LatexModItems;
/*    */ import net.mcreator.latexes.init.LatexModTabs;
/*    */ import net.mcreator.latexes.procedures.RevolvingGooCannonCanUseRangedItemProcedure;
/*    */ import net.mcreator.latexes.procedures.RevolvingGooCannonRangedItemUsedProcedure;
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
/* 25 */     super((new Item.Properties()).tab(LatexModTabs.TAB_LATEXITEMS).durability(96));
/*    */   }
/*    */ 
/*    */   
/*    */   public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
/* 30 */     entity.startUsingItem(hand);
/* 31 */     return new InteractionResultHolder(InteractionResult.SUCCESS, entity.getItemInHand(hand));
/*    */   }
/*    */ 
/*    */   
/*    */   public UseAnim getUseAnimation(ItemStack itemstack) {
/* 36 */     return UseAnim.NONE;
/*    */   }
/*    */ 
/*    */   
/*    */   public int getUseDuration(ItemStack itemstack) {
/* 41 */     return 72000;
/*    */   }
/*    */ 
/*    */   
/*    */   public void onUsingTick(ItemStack itemstack, LivingEntity entityLiving, int count) {
/* 46 */     Level world = entityLiving.level;
/* 47 */     if (!world.isClientSide() && entityLiving instanceof ServerPlayer) { ServerPlayer entity = (ServerPlayer)entityLiving;
/* 48 */       double x = entity.getX();
/* 49 */       double y = entity.getY();
/* 50 */       double z = entity.getZ();
/* 51 */       if (RevolvingGooCannonCanUseRangedItemProcedure.execute(itemstack)) {
/* 52 */         ItemStack stack = ProjectileWeaponItem.getHeldProjectile((LivingEntity)entity, e -> (e.getItem() == LatexModItems.DARKLATEXGOO.get()));
/* 53 */         if (stack == ItemStack.EMPTY) {
/* 54 */           for (int i = 0; i < (entity.getInventory()).items.size(); i++) {
/* 55 */             ItemStack teststack = (ItemStack)(entity.getInventory()).items.get(i);
/* 56 */             if (teststack != null && teststack.getItem() == LatexModItems.DARKLATEXGOO.get()) {
/* 57 */               stack = teststack;
/*    */               break;
/*    */             } 
/*    */           } 
/*    */         }
/* 62 */         if ((entity.getAbilities()).instabuild || stack != ItemStack.EMPTY) {
/* 63 */           RevolvingGooCannonEntity entityarrow = RevolvingGooCannonEntity.shoot(world, (LivingEntity)entity, world.getRandom(), 1.2F, 0.6D, 1);
/* 64 */           itemstack.hurtAndBreak(1, (LivingEntity)entity, e -> e.broadcastBreakEvent(entity.getUsedItemHand()));
/* 65 */           if ((entity.getAbilities()).instabuild) {
/* 66 */             entityarrow.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
/*    */           }
/* 68 */           else if ((new ItemStack((ItemLike)LatexModItems.DARKLATEXGOO.get())).isDamageableItem()) {
/* 69 */             if (stack.hurt(1, world.getRandom(), entity)) {
/* 70 */               stack.shrink(1);
/* 71 */               stack.setDamageValue(0);
/* 72 */               if (stack.isEmpty())
/* 73 */                 entity.getInventory().removeItem(stack); 
/*    */             } 
/*    */           } else {
/* 76 */             stack.shrink(1);
/* 77 */             if (stack.isEmpty()) {
/* 78 */               entity.getInventory().removeItem(stack);
/*    */             }
/*    */           } 
/*    */           
/* 82 */           RevolvingGooCannonRangedItemUsedProcedure.execute((Entity)entity, itemstack);
/*    */         } 
/* 84 */         entity.releaseUsingItem();
/*    */       }  }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\item\RevolvingGooCannonItem.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */