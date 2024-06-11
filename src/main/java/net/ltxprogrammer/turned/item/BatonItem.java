/*    */ package net.ltxprogrammer.turned.item;
/*    */ 
/*    */ import net.ltxprogrammer.turned.init.LatexModItems;
/*    */ import net.minecraft.world.item.Item;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.item.Items;
/*    */ import net.minecraft.world.item.SwordItem;
/*    */ import net.minecraft.world.item.Tier;
/*    */ import net.minecraft.world.item.crafting.Ingredient;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ 
/*    */ public class BatonItem extends SwordItem {
/*    */   public BatonItem() {
/* 14 */     super(new Tier() {
/*    */           public int m_6609_() {
/* 16 */             return 120;
/*    */           }
/*    */           
/*    */           public float m_6624_() {
/* 20 */             return 5.0F;
/*    */           }
/*    */           
/*    */           public float m_6631_() {
/* 24 */             return 2.5F;
/*    */           }
/*    */           
/*    */           public int m_6604_() {
/* 28 */             return 1;
/*    */           }
/*    */           
/*    */           public int m_6601_() {
/* 32 */             return 5;
/*    */           }
/*    */           
/*    */           public Ingredient m_6282_() {
/* 36 */             return Ingredient.m_43927_(new ItemStack[] { new ItemStack((ItemLike)LatexModItems.BATON.get()), new ItemStack((ItemLike)Items.f_42416_), new ItemStack((ItemLike)Items.f_42749_) }, );
/*    */           }
/* 38 */         },  3, -3.0F, (new Item.Properties()).m_41491_(null));
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\item\BatonItem.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */