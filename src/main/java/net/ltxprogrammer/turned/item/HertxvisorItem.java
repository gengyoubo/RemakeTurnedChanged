/*    */ package net.ltxprogrammer.turned.item;
/*    */ 
/*    */ import java.util.List;
/*    */ import net.ltxprogrammer.turned.init.LatexModTabs;
/*    */ import net.ltxprogrammer.turned.procedures.HertxvisorLivingEntityIsHitWithItemProcedure;
/*    */ import net.ltxprogrammer.turned.procedures.HertxvisorRightClickedOnBlockProcedure;
/*    */ import net.minecraft.network.chat.Component;
/*    */ import net.minecraft.network.chat.TextComponent;
/*    */ import net.minecraft.world.InteractionResult;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.item.Item;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.item.Rarity;
/*    */ import net.minecraft.world.item.TooltipFlag;
/*    */ import net.minecraft.world.item.UseAnim;
/*    */ import net.minecraft.world.item.context.UseOnContext;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class HertxvisorItem
/*    */   extends Item {
/*    */   public HertxvisorItem() {
/* 24 */     super((new Item.Properties()).m_41491_(LatexModTabs.TAB_LATEXITEMS).m_41487_(1).m_41497_(Rarity.COMMON));
/*    */   }
/*    */ 
/*    */   
/*    */   public UseAnim m_6164_(ItemStack itemstack) {
/* 29 */     return UseAnim.EAT;
/*    */   }
/*    */ 
/*    */   
/*    */   public void m_7373_(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
/* 34 */     super.m_7373_(itemstack, world, list, flag);
/* 35 */     list.add(new TextComponent("Right click on a latex block or left click on a normal latex to turn them in an hertx. (Won't work on strong latex variants.) �c(Note"));
/*    */     
/* 37 */     list.add(new TextComponent("you must be 3 blocks near the spawned hertx to insta-tame it"));
/* 38 */     list.add(new TextComponent("otherwise use Latex Goo)"));
/*    */   }
/*    */ 
/*    */   
/*    */   public InteractionResult m_6225_(UseOnContext context) {
/* 43 */     InteractionResult retval = super.m_6225_(context);
/* 44 */     HertxvisorRightClickedOnBlockProcedure.execute((LevelAccessor)context.m_43725_(), context.m_8083_().m_123341_(), context.m_8083_().m_123342_(), context
/* 45 */         .m_8083_().m_123343_(), (Entity)context.m_43723_());
/* 46 */     return retval;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean m_7579_(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
/* 51 */     boolean retval = super.m_7579_(itemstack, entity, sourceentity);
/* 52 */     HertxvisorLivingEntityIsHitWithItemProcedure.execute((LevelAccessor)entity.f_19853_, entity.m_20185_(), entity.m_20186_(), entity.m_20189_(), (Entity)entity);
/* 53 */     return retval;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\item\HertxvisorItem.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */