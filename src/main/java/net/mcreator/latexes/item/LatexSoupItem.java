/*    */ package net.mcreator.latexes.item;
/*    */ 
/*    */ import net.mcreator.latexes.init.LatexModTabs;
/*    */ import net.mcreator.latexes.procedures.LatexSoupFoodEatenProcedure;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.food.FoodProperties;
/*    */ import net.minecraft.world.item.Item;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.item.Items;
/*    */ import net.minecraft.world.item.Rarity;
/*    */ import net.minecraft.world.item.UseAnim;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.block.state.BlockState;
/*    */ 
/*    */ public class LatexSoupItem extends Item {
/*    */   public LatexSoupItem() {
/* 20 */     super((new Item.Properties()).tab(LatexModTabs.TAB_LATEXITEMS).stacksTo(16).rarity(Rarity.COMMON)
/* 21 */         .food((new FoodProperties.Builder()).nutrition(5).saturationMod(0.5F)
/*    */           
/* 23 */           .build()));
/*    */   }
/*    */ 
/*    */   
/*    */   public UseAnim getUseAnimation(ItemStack itemstack) {
/* 28 */     return UseAnim.DRINK;
/*    */   }
/*    */ 
/*    */   
/*    */   public int getUseDuration(ItemStack itemstack) {
/* 33 */     return 42;
/*    */   }
/*    */ 
/*    */   
/*    */   public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
/* 38 */     return 0.0F;
/*    */   }
/*    */ 
/*    */   
/*    */   public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
/* 43 */     ItemStack retval = new ItemStack((ItemLike)Items.BOWL);
/* 44 */     super.finishUsingItem(itemstack, world, entity);
/* 45 */     double x = entity.getX();
/* 46 */     double y = entity.getY();
/* 47 */     double z = entity.getZ();
/*    */     
/* 49 */     LatexSoupFoodEatenProcedure.execute((Entity)entity);
/* 50 */     if (itemstack.isEmpty()) {
/* 51 */       return retval;
/*    */     }
/* 53 */     if (entity instanceof Player) { Player player = (Player)entity; if (!(player.getAbilities()).instabuild && 
/* 54 */         !player.getInventory().add(retval))
/* 55 */         player.drop(retval, false);  }
/*    */     
/* 57 */     return itemstack;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\item\LatexSoupItem.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */