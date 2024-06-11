/*    */ package net.mcreator.latexes.item;
/*    */ 
/*    */ import net.mcreator.latexes.init.LatexModTabs;
/*    */ import net.mcreator.latexes.procedures.BloodSyringeLivingEntityIsHitWithItemProcedure;
/*    */ import net.mcreator.latexes.procedures.SyringeRightClickedOnBlockProcedure;
/*    */ import net.minecraft.world.InteractionResult;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.item.Item;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.item.Rarity;
/*    */ import net.minecraft.world.item.UseAnim;
/*    */ import net.minecraft.world.item.context.UseOnContext;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class SyringeItem extends Item {
/*    */   public SyringeItem() {
/* 18 */     super((new Item.Properties()).tab(LatexModTabs.TAB_LATEXITEMS).stacksTo(64).rarity(Rarity.COMMON));
/*    */   }
/*    */ 
/*    */   
/*    */   public UseAnim getUseAnimation(ItemStack itemstack) {
/* 23 */     return UseAnim.EAT;
/*    */   }
/*    */ 
/*    */   
/*    */   public InteractionResult useOn(UseOnContext context) {
/* 28 */     InteractionResult retval = super.useOn(context);
/* 29 */     SyringeRightClickedOnBlockProcedure.execute((LevelAccessor)context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context
/* 30 */         .getClickedPos().getZ(), (Entity)context.getPlayer());
/* 31 */     return retval;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
/* 36 */     boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
/* 37 */     BloodSyringeLivingEntityIsHitWithItemProcedure.execute((Entity)entity, (Entity)sourceentity);
/* 38 */     return retval;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\item\SyringeItem.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */