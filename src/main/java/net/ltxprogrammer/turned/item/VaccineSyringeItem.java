/*    */ package net.ltxprogrammer.turned.item;
/*    */ 
/*    */ import net.ltxprogrammer.turned.init.LatexModTabs;
/*    */ import net.ltxprogrammer.turned.procedures.VaccineSyringeLivingEntityIsHitWithItemProcedure;
/*    */ import net.ltxprogrammer.turned.procedures.VaccineSyringeRightclickedOnBlockProcedure;
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
/* 18 */     super((new Item.Properties()).m_41491_(LatexModTabs.TAB_LATEXITEMS).m_41487_(8).m_41497_(Rarity.COMMON));
/*    */   }
/*    */ 
/*    */   
/*    */   public UseAnim m_6164_(ItemStack itemstack) {
/* 23 */     return UseAnim.BOW;
/*    */   }
/*    */ 
/*    */   
/*    */   public int m_8105_(ItemStack itemstack) {
/* 28 */     return 8;
/*    */   }
/*    */ 
/*    */   
/*    */   public InteractionResult m_6225_(UseOnContext context) {
/* 33 */     InteractionResult retval = super.m_6225_(context);
/* 34 */     VaccineSyringeRightclickedOnBlockProcedure.execute((Entity)context.m_43723_());
/* 35 */     return retval;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean m_7579_(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
/* 40 */     boolean retval = super.m_7579_(itemstack, entity, sourceentity);
/* 41 */     VaccineSyringeLivingEntityIsHitWithItemProcedure.execute((Entity)entity);
/* 42 */     return retval;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\item\VaccineSyringeItem.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */