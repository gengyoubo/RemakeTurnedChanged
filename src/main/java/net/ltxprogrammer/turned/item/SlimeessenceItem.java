/*    */ package net.ltxprogrammer.turned.item;
/*    */ 
/*    */ import net.ltxprogrammer.turned.init.LatexModTabs;
/*    */ import net.ltxprogrammer.turned.procedures.SlimeessenceLivingEntityIsHitWithItemProcedure;
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
/* 15 */     super((new Item.Properties()).m_41491_(LatexModTabs.TAB_LATEXITEMS).m_41487_(64).m_41497_(Rarity.UNCOMMON));
/*    */   }
/*    */ 
/*    */   
/*    */   public UseAnim m_6164_(ItemStack itemstack) {
/* 20 */     return UseAnim.EAT;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean m_7579_(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
/* 25 */     boolean retval = super.m_7579_(itemstack, entity, sourceentity);
/* 26 */     SlimeessenceLivingEntityIsHitWithItemProcedure.execute((LevelAccessor)entity.f_19853_, entity.m_20185_(), entity.m_20186_(), entity.m_20189_(), (Entity)entity);
/* 27 */     return retval;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\item\SlimeessenceItem.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */