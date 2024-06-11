/*    */ package net.mcreator.latexes.item;
/*    */ 
/*    */ import net.mcreator.latexes.init.LatexModTabs;
/*    */ import net.mcreator.latexes.procedures.VaccineSyringeLivingEntityIsHitWithItemProcedure;
/*    */ import net.mcreator.latexes.procedures.VaccineSyringeRightclickedOnBlockProcedure;
/*    */ import net.minecraft.world.InteractionResult;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.item.Item;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.item.Rarity;
/*    */ import net.minecraft.world.item.UseAnim;
/*    */ import net.minecraft.world.item.context.UseOnContext;
/*    */ 
/*    */ public class VaccineSyringeItem
/*    */   extends Item {
/*    */   public VaccineSyringeItem() {
/* 18 */     super((new Item.Properties()).tab(LatexModTabs.TAB_LATEXITEMS).stacksTo(8).rarity(Rarity.COMMON));
/*    */   }
/*    */ 
/*    */   
/*    */   public UseAnim getUseAnimation(ItemStack itemstack) {
/* 23 */     return UseAnim.BOW;
/*    */   }
/*    */ 
/*    */   
/*    */   public int getUseDuration(ItemStack itemstack) {
/* 28 */     return 8;
/*    */   }
/*    */ 
/*    */   
/*    */   public InteractionResult useOn(UseOnContext context) {
/* 33 */     InteractionResult retval = super.useOn(context);
/* 34 */     VaccineSyringeRightclickedOnBlockProcedure.execute((Entity)context.getPlayer());
/* 35 */     return retval;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
/* 40 */     boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
/* 41 */     VaccineSyringeLivingEntityIsHitWithItemProcedure.execute((Entity)entity);
/* 42 */     return retval;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\item\VaccineSyringeItem.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */