/*    */ package net.ltxprogrammer.turned.item;
/*    */ 
/*    */ import java.util.List;
/*    */ import net.ltxprogrammer.turned.init.LatexModTabs;
/*    */ import net.minecraft.network.chat.Component;
/*    */ import net.minecraft.network.chat.TextComponent;
/*    */ import net.minecraft.world.item.Item;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.item.Rarity;
/*    */ import net.minecraft.world.item.TooltipFlag;
/*    */ import net.minecraft.world.level.Level;
/*    */ 
/*    */ public class Brokenm16Item
/*    */   extends Item
/*    */ {
/*    */   public Brokenm16Item() {
/* 17 */     super((new Item.Properties()).m_41491_(LatexModTabs.TAB_LATEXITEMS).m_41487_(8).m_41497_(Rarity.COMMON));
/*    */   }
/*    */ 
/*    */   
/*    */   public void m_7373_(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
/* 22 */     super.m_7373_(itemstack, world, list, flag);
/* 23 */     list.add(new TextComponent("hmm... maybe it's not junk yet..."));
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\item\Brokenm16Item.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */