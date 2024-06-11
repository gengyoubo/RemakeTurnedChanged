/*    */ package net.mcreator.latexes.item;
/*    */ 
/*    */ import java.util.List;
/*    */ import net.mcreator.latexes.entity.LatexDartRifleEntity;
/*    */ import net.mcreator.latexes.procedures.DartrifleEntitySwingsItemProcedure;
/*    */ import net.mcreator.latexes.procedures.DartrifleRangedItemUsedProcedure;
/*    */ import net.mcreator.latexes.procedures.LatexDartRifleCanUseRangedItemProcedure;
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
/*    */ import net.minecraft.world.item.TooltipFlag;
/*    */ import net.minecraft.world.item.UseAnim;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class LatexDartRifleItem
/*    */   extends Item {
/*    */   public LatexDartRifleItem() {
/* 28 */     super((new Item.Properties()).tab(null).stacksTo(1));
/*    */   }
/*    */ 
/*    */   
/*    */   public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
/* 33 */     entity.startUsingItem(hand);
/* 34 */     return new InteractionResultHolder(InteractionResult.SUCCESS, entity.getItemInHand(hand));
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean onEntitySwing(ItemStack itemstack, LivingEntity entity) {
/* 39 */     boolean retval = super.onEntitySwing(itemstack, entity);
/* 40 */     DartrifleEntitySwingsItemProcedure.execute((Entity)entity);
/* 41 */     return retval;
/*    */   }
/*    */ 
/*    */   
/*    */   public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
/* 46 */     super.appendHoverText(itemstack, world, list, flag);
/* 47 */     list.add(new TextComponent("Latex Mode"));
/*    */   }
/*    */ 
/*    */   
/*    */   public UseAnim getUseAnimation(ItemStack itemstack) {
/* 52 */     return UseAnim.NONE;
/*    */   }
/*    */ 
/*    */   
/*    */   public int getUseDuration(ItemStack itemstack) {
/* 57 */     return 72000;
/*    */   }
/*    */ 
/*    */   
/*    */   public void releaseUsing(ItemStack itemstack, Level world, LivingEntity entityLiving, int timeLeft) {
/* 62 */     if (!world.isClientSide() && entityLiving instanceof ServerPlayer) { ServerPlayer entity = (ServerPlayer)entityLiving;
/* 63 */       double x = entity.getX();
/* 64 */       double y = entity.getY();
/* 65 */       double z = entity.getZ();
/* 66 */       if (LatexDartRifleCanUseRangedItemProcedure.execute((Entity)entity, itemstack)) {
/* 67 */         LatexDartRifleEntity entityarrow = LatexDartRifleEntity.shoot(world, (LivingEntity)entity, world.getRandom(), 2.5F, 1.5D, 0);
/* 68 */         itemstack.hurtAndBreak(1, (LivingEntity)entity, e -> e.broadcastBreakEvent(entity.getUsedItemHand()));
/* 69 */         entityarrow.pickup = AbstractArrow.Pickup.DISALLOWED;
/*    */         
/* 71 */         DartrifleRangedItemUsedProcedure.execute((LevelAccessor)world, x, y, z, (Entity)entity, itemstack);
/*    */       }  }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\item\LatexDartRifleItem.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */