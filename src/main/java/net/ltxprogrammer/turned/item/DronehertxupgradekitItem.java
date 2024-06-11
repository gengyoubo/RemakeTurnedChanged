/*    */ package net.ltxprogrammer.turned.item;
/*    */ 
/*    */ import java.util.List;
/*    */ import net.ltxprogrammer.turned.init.LatexModTabs;
/*    */ import net.ltxprogrammer.turned.procedures.DronehertxupgradekitRightclickedProcedure;
/*    */ import net.minecraft.network.chat.Component;
/*    */ import net.minecraft.network.chat.TextComponent;
/*    */ import net.minecraft.world.InteractionHand;
/*    */ import net.minecraft.world.InteractionResultHolder;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.item.Item;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.item.Rarity;
/*    */ import net.minecraft.world.item.TooltipFlag;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class DronehertxupgradekitItem
/*    */   extends Item {
/*    */   public DronehertxupgradekitItem() {
/* 22 */     super((new Item.Properties()).m_41491_(LatexModTabs.TAB_LATEXITEMS).m_41487_(16).m_41497_(Rarity.COMMON));
/*    */   }
/*    */ 
/*    */   
/*    */   public void m_7373_(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
/* 27 */     super.m_7373_(itemstack, world, list, flag);
/* 28 */     list.add(new TextComponent("Turn your drone hertx in a military one!"));
/*    */   }
/*    */ 
/*    */   
/*    */   public InteractionResultHolder<ItemStack> m_7203_(Level world, Player entity, InteractionHand hand) {
/* 33 */     InteractionResultHolder<ItemStack> ar = super.m_7203_(world, entity, hand);
/* 34 */     ItemStack itemstack = (ItemStack)ar.m_19095_();
/* 35 */     double x = entity.m_20185_();
/* 36 */     double y = entity.m_20186_();
/* 37 */     double z = entity.m_20189_();
/*    */     
/* 39 */     DronehertxupgradekitRightclickedProcedure.execute((LevelAccessor)world, x, y, z, (Entity)entity);
/* 40 */     return ar;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\item\DronehertxupgradekitItem.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */