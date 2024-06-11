/*    */ package net.ltxprogrammer.turned.item;
/*    */ 
/*    */ import java.util.List;
/*    */ import net.ltxprogrammer.turned.init.LatexModTabs;
/*    */ import net.ltxprogrammer.turned.procedures.RecruitmentpaperRightclickedProcedure;
/*    */ import net.minecraft.network.chat.Component;
/*    */ import net.minecraft.network.chat.TextComponent;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.item.Item;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.item.Rarity;
/*    */ import net.minecraft.world.item.TooltipFlag;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class RecruitmentpaperItem
/*    */   extends Item {
/*    */   public RecruitmentpaperItem() {
/* 20 */     super((new Item.Properties()).m_41491_(LatexModTabs.TAB_LATEXITEMS).m_41487_(64).m_41497_(Rarity.COMMON));
/*    */   }
/*    */ 
/*    */   
/*    */   public void m_7373_(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
/* 25 */     super.m_7373_(itemstack, world, list, flag);
/* 26 */     list.add(new TextComponent("Hit the humans for a promotion! Works best with berets."));
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean m_7579_(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
/* 31 */     boolean retval = super.m_7579_(itemstack, entity, sourceentity);
/* 32 */     RecruitmentpaperRightclickedProcedure.execute((LevelAccessor)entity.f_19853_, entity.m_20185_(), entity.m_20186_(), entity.m_20189_(), (Entity)entity, (Entity)sourceentity);
/* 33 */     return retval;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\item\RecruitmentpaperItem.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */