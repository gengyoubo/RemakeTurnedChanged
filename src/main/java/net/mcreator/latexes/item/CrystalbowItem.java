/*    */ package net.mcreator.latexes.item;
/*    */ 
/*    */ import java.util.List;
/*    */ import net.mcreator.latexes.entity.CrystalbowEntity;
/*    */ import net.mcreator.latexes.init.LatexModItems;
/*    */ import net.mcreator.latexes.init.LatexModTabs;
/*    */ import net.mcreator.latexes.procedures.CrystalbowRangedItemUsedProcedure;
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
/*    */ public class CrystalbowItem
/*    */   extends Item {
/*    */   public CrystalbowItem() {
/* 29 */     super((new Item.Properties()).tab(LatexModTabs.TAB_LATEXITEMS).durability(120));
/*    */   }
/*    */ 
/*    */   
/*    */   public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
/* 34 */     entity.startUsingItem(hand);
/* 35 */     return new InteractionResultHolder(InteractionResult.SUCCESS, entity.getItemInHand(hand));
/*    */   }
/*    */ 
/*    */   
/*    */   public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
/* 40 */     super.appendHoverText(itemstack, world, list, flag);
/* 41 */     list.add(new TextComponent("help how to make bow animations"));
/*    */   }
/*    */ 
/*    */   
/*    */   public UseAnim getUseAnimation(ItemStack itemstack) {
/* 46 */     return UseAnim.BOW;
/*    */   }
/*    */ 
/*    */   
/*    */   public int getUseDuration(ItemStack itemstack) {
/* 51 */     return 72000;
/*    */   }
/*    */ 
/*    */   
/*    */   public void releaseUsing(ItemStack itemstack, Level world, LivingEntity entityLiving, int timeLeft) {
/* 56 */     if (!world.isClientSide() && entityLiving instanceof ServerPlayer) { ServerPlayer entity = (ServerPlayer)entityLiving;
/* 57 */       double x = entity.getX();
/* 58 */       double y = entity.getY();
/* 59 */       double z = entity.getZ();
/*    */       
/* 61 */       ItemStack stack = ProjectileWeaponItem.getHeldProjectile((LivingEntity)entity, e -> (e.getItem() == LatexModItems.CRYSTALARROW.get()));
/* 62 */       if (stack == ItemStack.EMPTY) {
/* 63 */         for (int i = 0; i < (entity.getInventory()).items.size(); i++) {
/* 64 */           ItemStack teststack = (ItemStack)(entity.getInventory()).items.get(i);
/* 65 */           if (teststack != null && teststack.getItem() == LatexModItems.CRYSTALARROW.get()) {
/* 66 */             stack = teststack;
/*    */             break;
/*    */           } 
/*    */         } 
/*    */       }
/* 71 */       if ((entity.getAbilities()).instabuild || stack != ItemStack.EMPTY) {
/* 72 */         CrystalbowEntity entityarrow = CrystalbowEntity.shoot(world, (LivingEntity)entity, world.getRandom(), 1.5F, 1.5D, 0);
/* 73 */         itemstack.hurtAndBreak(1, (LivingEntity)entity, e -> e.broadcastBreakEvent(entity.getUsedItemHand()));
/* 74 */         if ((entity.getAbilities()).instabuild) {
/* 75 */           entityarrow.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
/*    */         }
/* 77 */         else if ((new ItemStack((ItemLike)LatexModItems.CRYSTALARROW.get())).isDamageableItem()) {
/* 78 */           if (stack.hurt(1, world.getRandom(), entity)) {
/* 79 */             stack.shrink(1);
/* 80 */             stack.setDamageValue(0);
/* 81 */             if (stack.isEmpty())
/* 82 */               entity.getInventory().removeItem(stack); 
/*    */           } 
/*    */         } else {
/* 85 */           stack.shrink(1);
/* 86 */           if (stack.isEmpty()) {
/* 87 */             entity.getInventory().removeItem(stack);
/*    */           }
/*    */         } 
/*    */         
/* 91 */         CrystalbowRangedItemUsedProcedure.execute((Entity)entity, itemstack);
/*    */       }  }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\item\CrystalbowItem.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */