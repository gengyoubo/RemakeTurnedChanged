/*    */ package net.mcreator.latexes.item;
/*    */ 
/*    */ import net.mcreator.latexes.entity.MatchlockPistolEntity;
/*    */ import net.mcreator.latexes.init.LatexModTabs;
/*    */ import net.mcreator.latexes.procedures.MatchLockPistolWhenUsedProcedure;
/*    */ import net.mcreator.latexes.procedures.MatchlockPistolCanUseRangedItemProcedure;
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
/*    */ public class MatchlockPistolItem extends Item {
/*    */   public MatchlockPistolItem() {
/* 23 */     super((new Item.Properties()).tab(LatexModTabs.TAB_LATEXITEMS).durability(48));
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
/*    */   public void onUsingTick(ItemStack itemstack, LivingEntity entityLiving, int count) {
/* 44 */     Level world = entityLiving.level;
/* 45 */     if (!world.isClientSide() && entityLiving instanceof ServerPlayer) { ServerPlayer entity = (ServerPlayer)entityLiving;
/* 46 */       double x = entity.getX();
/* 47 */       double y = entity.getY();
/* 48 */       double z = entity.getZ();
/* 49 */       if (MatchlockPistolCanUseRangedItemProcedure.execute(itemstack)) {
/* 50 */         MatchlockPistolEntity entityarrow = MatchlockPistolEntity.shoot(world, (LivingEntity)entity, world.getRandom(), 2.0F, 2.0D, 1);
/* 51 */         itemstack.hurtAndBreak(1, (LivingEntity)entity, e -> e.broadcastBreakEvent(entity.getUsedItemHand()));
/* 52 */         entityarrow.pickup = AbstractArrow.Pickup.DISALLOWED;
/*    */         
/* 54 */         MatchLockPistolWhenUsedProcedure.execute((LevelAccessor)world, x, y, z, (Entity)entity, itemstack);
/* 55 */         entity.releaseUsingItem();
/*    */       }  }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\item\MatchlockPistolItem.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */