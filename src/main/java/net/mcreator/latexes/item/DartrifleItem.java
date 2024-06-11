/*    */ package net.mcreator.latexes.item;
/*    */ 
/*    */ import net.mcreator.latexes.entity.DartrifleEntity;
/*    */ import net.mcreator.latexes.init.LatexModTabs;
/*    */ import net.mcreator.latexes.procedures.DartrifleCanUseRangedItemProcedure;
/*    */ import net.mcreator.latexes.procedures.DartrifleEntitySwingsItemProcedure;
/*    */ import net.mcreator.latexes.procedures.DartrifleRangedItemUsedProcedure;
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
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class DartrifleItem extends Item {
/*    */   public DartrifleItem() {
/* 24 */     super((new Item.Properties()).tab(LatexModTabs.TAB_LATEXITEMS).stacksTo(1));
/*    */   }
/*    */ 
/*    */   
/*    */   public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
/* 29 */     entity.startUsingItem(hand);
/* 30 */     return new InteractionResultHolder(InteractionResult.SUCCESS, entity.getItemInHand(hand));
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean onEntitySwing(ItemStack itemstack, LivingEntity entity) {
/* 35 */     boolean retval = super.onEntitySwing(itemstack, entity);
/* 36 */     DartrifleEntitySwingsItemProcedure.execute((Entity)entity);
/* 37 */     return retval;
/*    */   }
/*    */ 
/*    */   
/*    */   public UseAnim getUseAnimation(ItemStack itemstack) {
/* 42 */     return UseAnim.NONE;
/*    */   }
/*    */ 
/*    */   
/*    */   public int getUseDuration(ItemStack itemstack) {
/* 47 */     return 72000;
/*    */   }
/*    */ 
/*    */   
/*    */   public void releaseUsing(ItemStack itemstack, Level world, LivingEntity entityLiving, int timeLeft) {
/* 52 */     if (!world.isClientSide() && entityLiving instanceof ServerPlayer) { ServerPlayer entity = (ServerPlayer)entityLiving;
/* 53 */       double x = entity.getX();
/* 54 */       double y = entity.getY();
/* 55 */       double z = entity.getZ();
/* 56 */       if (DartrifleCanUseRangedItemProcedure.execute((Entity)entity, itemstack)) {
/* 57 */         DartrifleEntity entityarrow = DartrifleEntity.shoot(world, (LivingEntity)entity, world.getRandom(), 2.5F, 2.5D, 0);
/* 58 */         itemstack.hurtAndBreak(1, (LivingEntity)entity, e -> e.broadcastBreakEvent(entity.getUsedItemHand()));
/* 59 */         entityarrow.pickup = AbstractArrow.Pickup.DISALLOWED;
/*    */         
/* 61 */         DartrifleRangedItemUsedProcedure.execute((LevelAccessor)world, x, y, z, (Entity)entity, itemstack);
/*    */       }  }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\item\DartrifleItem.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */