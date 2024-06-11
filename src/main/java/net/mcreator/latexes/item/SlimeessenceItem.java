/*    */ package net.mcreator.latexes.item;
/*    */ 
/*    */ import net.mcreator.latexes.init.LatexModTabs;
/*    */ import net.mcreator.latexes.procedures.SlimeessenceLivingEntityIsHitWithItemProcedure;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.item.Item;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.item.Rarity;
/*    */ import net.minecraft.world.item.UseAnim;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class SlimeessenceItem extends Item {
/*    */   public SlimeessenceItem() {
/* 15 */     super((new Item.Properties()).tab(LatexModTabs.TAB_LATEXITEMS).stacksTo(64).rarity(Rarity.UNCOMMON));
/*    */   }
/*    */ 
/*    */   
/*    */   public UseAnim getUseAnimation(ItemStack itemstack) {
/* 20 */     return UseAnim.EAT;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
/* 25 */     boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
/* 26 */     SlimeessenceLivingEntityIsHitWithItemProcedure.execute((LevelAccessor)entity.level, entity.getX(), entity.getY(), entity.getZ(), (Entity)entity);
/* 27 */     return retval;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\item\SlimeessenceItem.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */