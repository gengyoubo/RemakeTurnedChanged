/*    */ package net.mcreator.latexes.item;
/*    */ 
/*    */ import net.mcreator.latexes.entity.OverundershotgunEntity;
/*    */ import net.mcreator.latexes.init.LatexModTabs;
/*    */ import net.mcreator.latexes.procedures.OverundershotgunCanUseRangedItemProcedure;
/*    */ import net.mcreator.latexes.procedures.OverundershotgunRangedItemUsedProcedure;
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
/*    */ import net.minecraft.world.item.UseAnim;
/*    */ import net.minecraft.world.level.Level;
/*    */ 
/*    */ public class OverundershotgunItem
/*    */   extends Item {
/*    */   public OverundershotgunItem() {
/* 23 */     super((new Item.Properties()).tab(LatexModTabs.TAB_LATEXITEMS).durability(122));
/*    */   }
/*    */ 
/*    */   
/*    */   public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
/* 28 */     entity.startUsingItem(hand);
/* 29 */     return new InteractionResultHolder(InteractionResult.SUCCESS, entity.getItemInHand(hand));
/*    */   }
/*    */ 
/*    */   
/*    */   public UseAnim getUseAnimation(ItemStack itemstack) {
/* 34 */     return UseAnim.NONE;
/*    */   }
/*    */ 
/*    */   
/*    */   public int getUseDuration(ItemStack itemstack) {
/* 39 */     return 72000;
/*    */   }
/*    */ 
/*    */   
/*    */   public void releaseUsing(ItemStack itemstack, Level world, LivingEntity entityLiving, int timeLeft) {
/* 44 */     if (!world.isClientSide() && entityLiving instanceof ServerPlayer) { ServerPlayer entity = (ServerPlayer)entityLiving;
/* 45 */       double x = entity.getX();
/* 46 */       double y = entity.getY();
/* 47 */       double z = entity.getZ();
/* 48 */       if (OverundershotgunCanUseRangedItemProcedure.execute((Entity)entity, itemstack)) {
/* 49 */         OverundershotgunEntity entityarrow = OverundershotgunEntity.shoot(world, (LivingEntity)entity, world.getRandom(), 1.0F, 3.0D, 2);
/* 50 */         itemstack.hurtAndBreak(1, (LivingEntity)entity, e -> e.broadcastBreakEvent(entity.getUsedItemHand()));
/* 51 */         entityarrow.pickup = AbstractArrow.Pickup.DISALLOWED;
/*    */         
/* 53 */         OverundershotgunRangedItemUsedProcedure.execute((Entity)entity, itemstack);
/*    */       }  }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\item\OverundershotgunItem.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */