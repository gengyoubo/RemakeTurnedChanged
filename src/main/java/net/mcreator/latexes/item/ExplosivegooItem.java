/*    */ package net.mcreator.latexes.item;
/*    */ 
/*    */ import net.mcreator.latexes.entity.ExplosivegooEntity;
/*    */ import net.mcreator.latexes.init.LatexModItems;
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
/* 25 */     super((new Item.Properties()).tab(null).stacksTo(8));
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
/* 36 */     return UseAnim.SPEAR;
/*    */   }
/*    */ 
/*    */   
/*    */   public int getUseDuration(ItemStack itemstack) {
/* 41 */     return 72000;
/*    */   }
/*    */ 
/*    */   
/*    */   @OnlyIn(Dist.CLIENT)
/*    */   public boolean isFoil(ItemStack itemstack) {
/* 47 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public void onUsingTick(ItemStack itemstack, LivingEntity entityLiving, int count) {
/* 52 */     Level world = entityLiving.level;
/* 53 */     if (!world.isClientSide() && entityLiving instanceof ServerPlayer) { ServerPlayer entity = (ServerPlayer)entityLiving;
/* 54 */       double x = entity.getX();
/* 55 */       double y = entity.getY();
/* 56 */       double z = entity.getZ();
/*    */       
/* 58 */       ItemStack stack = ProjectileWeaponItem.getHeldProjectile((LivingEntity)entity, e -> (e.getItem() == LatexModItems.EXPLOSIVEGOO.get()));
/* 59 */       if (stack == ItemStack.EMPTY) {
/* 60 */         for (int i = 0; i < (entity.getInventory()).items.size(); i++) {
/* 61 */           ItemStack teststack = (ItemStack)(entity.getInventory()).items.get(i);
/* 62 */           if (teststack != null && teststack.getItem() == LatexModItems.EXPLOSIVEGOO.get()) {
/* 63 */             stack = teststack;
/*    */             break;
/*    */           } 
/*    */         } 
/*    */       }
/* 68 */       if ((entity.getAbilities()).instabuild || stack != ItemStack.EMPTY) {
/* 69 */         ExplosivegooEntity entityarrow = ExplosivegooEntity.shoot(world, (LivingEntity)entity, world.getRandom(), 0.5F, 0.5D, 2);
/* 70 */         itemstack.hurtAndBreak(1, (LivingEntity)entity, e -> e.broadcastBreakEvent(entity.getUsedItemHand()));
/* 71 */         if ((entity.getAbilities()).instabuild) {
/* 72 */           entityarrow.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
/*    */         }
/* 74 */         else if ((new ItemStack((ItemLike)LatexModItems.EXPLOSIVEGOO.get())).isDamageableItem()) {
/* 75 */           if (stack.hurt(1, world.getRandom(), entity)) {
/* 76 */             stack.shrink(1);
/* 77 */             stack.setDamageValue(0);
/* 78 */             if (stack.isEmpty())
/* 79 */               entity.getInventory().removeItem(stack); 
/*    */           } 
/*    */         } else {
/* 82 */           stack.shrink(1);
/* 83 */           if (stack.isEmpty()) {
/* 84 */             entity.getInventory().removeItem(stack);
/*    */           }
/*    */         } 
/*    */       } 
/* 88 */       entity.releaseUsingItem(); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\item\ExplosivegooItem.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */