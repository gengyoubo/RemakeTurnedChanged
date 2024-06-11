/*    */ package net.ltxprogrammer.turned.item;
/*    */ 
/*    */ import net.ltxprogrammer.turned.init.LatexModTabs;
/*    */ import net.ltxprogrammer.turned.procedures.LatexSoupFoodEatenProcedure;
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
/* 20 */     super((new Item.Properties()).m_41491_(LatexModTabs.TAB_LATEXITEMS).m_41487_(16).m_41497_(Rarity.COMMON)
/* 21 */         .m_41489_((new FoodProperties.Builder()).m_38760_(5).m_38758_(0.5F)
/*    */           
/* 23 */           .m_38767_()));
/*    */   }
/*    */ 
/*    */   
/*    */   public UseAnim m_6164_(ItemStack itemstack) {
/* 28 */     return UseAnim.DRINK;
/*    */   }
/*    */ 
/*    */   
/*    */   public int m_8105_(ItemStack itemstack) {
/* 33 */     return 42;
/*    */   }
/*    */ 
/*    */   
/*    */   public float m_8102_(ItemStack par1ItemStack, BlockState par2Block) {
/* 38 */     return 0.0F;
/*    */   }
/*    */ 
/*    */   
/*    */   public ItemStack m_5922_(ItemStack itemstack, Level world, LivingEntity entity) {
/* 43 */     ItemStack retval = new ItemStack((ItemLike)Items.f_42399_);
/* 44 */     super.m_5922_(itemstack, world, entity);
/* 45 */     double x = entity.m_20185_();
/* 46 */     double y = entity.m_20186_();
/* 47 */     double z = entity.m_20189_();
/*    */     
/* 49 */     LatexSoupFoodEatenProcedure.execute((Entity)entity);
/* 50 */     if (itemstack.m_41619_()) {
/* 51 */       return retval;
/*    */     }
/* 53 */     if (entity instanceof Player) { Player player = (Player)entity; if (!(player.m_150110_()).f_35937_ && 
/* 54 */         !player.m_150109_().m_36054_(retval))
/* 55 */         player.m_36176_(retval, false);  }
/*    */     
/* 57 */     return itemstack;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\item\LatexSoupItem.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */