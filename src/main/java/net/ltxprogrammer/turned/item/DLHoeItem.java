/*    */ package net.ltxprogrammer.turned.item;
/*    */ 
/*    */ import net.ltxprogrammer.changed.init.ChangedBlocks;
/*    */ import net.ltxprogrammer.changed.init.ChangedItems;
/*    */ import net.ltxprogrammer.turned.init.LatexModTabs;
/*    */ import net.ltxprogrammer.turned.procedures.DLSwordLivingEntityIsHitWithToolProcedure;
/*    */ import net.minecraft.world.InteractionResult;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.item.HoeItem;
/*    */ import net.minecraft.world.item.Item;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.item.Tier;
/*    */ import net.minecraft.world.item.context.UseOnContext;
/*    */ import net.minecraft.world.item.crafting.Ingredient;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ 
/*    */ public class DLHoeItem extends HoeItem {
/*    */   public DLHoeItem() {
/* 20 */     super(new Tier() {
/*    */           public int m_6609_() {
/* 22 */             return 225;
/*    */           }
/*    */           
/*    */           public float m_6624_() {
/* 26 */             return 5.0F;
/*    */           }
/*    */           
/*    */           public float m_6631_() {
/* 30 */             return 1.5F;
/*    */           }
/*    */           
/*    */           public int m_6604_() {
/* 34 */             return 2;
/*    */           }
/*    */           
/*    */           public int m_6601_() {
/* 38 */             return 25;
/*    */           }
/*    */           
/*    */           public Ingredient m_6282_() {
/* 42 */             return Ingredient.m_43927_(new ItemStack[] { new ItemStack((ItemLike)ChangedItems.DARK_LATEX_GOO.get()), new ItemStack((ItemLike)ChangedBlocks.DARK_LATEX_BLOCK.get()), new ItemStack((ItemLike)ChangedItems.DARK_LATEX_CRYSTAL_FRAGMENT
/* 43 */                     .get()) }, );
/*    */           }
/* 45 */         },  0, -3.5F, (new Item.Properties()).m_41491_(LatexModTabs.TAB_LATEXITEMS));
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean m_7579_(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
/* 50 */     boolean retval = super.m_7579_(itemstack, entity, sourceentity);
/* 51 */     DLSwordLivingEntityIsHitWithToolProcedure.execute((Entity)entity);
/* 52 */     return retval;
/*    */   }
/*    */ 
/*    */   
/*    */   public InteractionResult m_6225_(UseOnContext context) {
/* 57 */     return super.m_6225_(context);
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\item\DLHoeItem.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */