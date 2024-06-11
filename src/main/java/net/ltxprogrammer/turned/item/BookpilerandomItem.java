/*    */ package net.ltxprogrammer.turned.item;
/*    */ 
/*    */ import java.util.List;
/*    */ import net.ltxprogrammer.turned.init.LatexModTabs;
/*    */ import net.ltxprogrammer.turned.procedures.BookpilerandomRightClickedOnBlockProcedure;
/*    */ import net.minecraft.network.chat.Component;
/*    */ import net.minecraft.network.chat.TextComponent;
/*    */ import net.minecraft.world.InteractionResult;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.item.Item;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.item.Rarity;
/*    */ import net.minecraft.world.item.TooltipFlag;
/*    */ import net.minecraft.world.item.UseAnim;
/*    */ import net.minecraft.world.item.context.UseOnContext;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class BookpilerandomItem
/*    */   extends Item {
/*    */   public BookpilerandomItem() {
/* 22 */     super((new Item.Properties()).m_41491_(LatexModTabs.TAB_LATEX).m_41487_(16).m_41497_(Rarity.COMMON));
/*    */   }
/*    */ 
/*    */   
/*    */   public UseAnim m_6164_(ItemStack itemstack) {
/* 27 */     return UseAnim.EAT;
/*    */   }
/*    */ 
/*    */   
/*    */   public void m_7373_(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
/* 32 */     super.m_7373_(itemstack, world, list, flag);
/* 33 */     list.add(new TextComponent("Places a random book pile"));
/*    */   }
/*    */ 
/*    */   
/*    */   public InteractionResult m_6225_(UseOnContext context) {
/* 38 */     InteractionResult retval = super.m_6225_(context);
/* 39 */     BookpilerandomRightClickedOnBlockProcedure.execute((LevelAccessor)context.m_43725_(), context.m_8083_().m_123341_(), context.m_8083_().m_123342_(), context
/* 40 */         .m_8083_().m_123343_(), (Entity)context.m_43723_());
/* 41 */     return retval;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\item\BookpilerandomItem.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */