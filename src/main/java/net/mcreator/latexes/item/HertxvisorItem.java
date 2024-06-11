/*    */ package net.mcreator.latexes.item;
/*    */ 
/*    */ import java.util.List;
/*    */ import net.mcreator.latexes.init.LatexModTabs;
/*    */ import net.mcreator.latexes.procedures.HertxvisorLivingEntityIsHitWithItemProcedure;
/*    */ import net.mcreator.latexes.procedures.HertxvisorRightClickedOnBlockProcedure;
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
/* 24 */     super((new Item.Properties()).tab(LatexModTabs.TAB_LATEXITEMS).stacksTo(1).rarity(Rarity.COMMON));
/*    */   }
/*    */ 
/*    */   
/*    */   public UseAnim getUseAnimation(ItemStack itemstack) {
/* 29 */     return UseAnim.EAT;
/*    */   }
/*    */ 
/*    */   
/*    */   public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
/* 34 */     super.appendHoverText(itemstack, world, list, flag);
/* 35 */     list.add(new TextComponent("Right click on a latex block or left click on a normal latex to turn them in an hertx. (Won't work on strong latex variants.) �c(Note"));
/*    */     
/* 37 */     list.add(new TextComponent("you must be 3 blocks near the spawned hertx to insta-tame it"));
/* 38 */     list.add(new TextComponent("otherwise use Latex Goo)"));
/*    */   }
/*    */ 
/*    */   
/*    */   public InteractionResult useOn(UseOnContext context) {
/* 43 */     InteractionResult retval = super.useOn(context);
/* 44 */     HertxvisorRightClickedOnBlockProcedure.execute((LevelAccessor)context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context
/* 45 */         .getClickedPos().getZ(), (Entity)context.getPlayer());
/* 46 */     return retval;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
/* 51 */     boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
/* 52 */     HertxvisorLivingEntityIsHitWithItemProcedure.execute((LevelAccessor)entity.level, entity.getX(), entity.getY(), entity.getZ(), (Entity)entity);
/* 53 */     return retval;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\item\HertxvisorItem.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */