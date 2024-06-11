/*    */ package net.mcreator.latexes.item;
/*    */ 
/*    */ import java.util.List;
/*    */ import net.mcreator.latexes.init.LatexModTabs;
/*    */ import net.mcreator.latexes.procedures.MilitaryDroneHertxIconRightclickedOnBlockProcedure;
/*    */ import net.minecraft.network.chat.Component;
/*    */ import net.minecraft.network.chat.TextComponent;
/*    */ import net.minecraft.world.InteractionResult;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.item.Item;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.item.Rarity;
/*    */ import net.minecraft.world.item.TooltipFlag;
/*    */ import net.minecraft.world.item.context.UseOnContext;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraftforge.api.distmarker.Dist;
/*    */ import net.minecraftforge.api.distmarker.OnlyIn;
/*    */ 
/*    */ public class MilitaryDroneHertxIconItem
/*    */   extends Item
/*    */ {
/*    */   public MilitaryDroneHertxIconItem() {
/* 24 */     super((new Item.Properties()).tab(LatexModTabs.TAB_LATEXITEMS).stacksTo(1).rarity(Rarity.COMMON));
/*    */   }
/*    */ 
/*    */   
/*    */   @OnlyIn(Dist.CLIENT)
/*    */   public boolean isFoil(ItemStack itemstack) {
/* 30 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
/* 35 */     super.appendHoverText(itemstack, world, list, flag);
/* 36 */     list.add(new TextComponent("Place down your new soldier!"));
/*    */   }
/*    */ 
/*    */   
/*    */   public InteractionResult useOn(UseOnContext context) {
/* 41 */     InteractionResult retval = super.useOn(context);
/* 42 */     MilitaryDroneHertxIconRightclickedOnBlockProcedure.execute((LevelAccessor)context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context
/* 43 */         .getClickedPos().getZ(), (Entity)context.getPlayer());
/* 44 */     return retval;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\item\MilitaryDroneHertxIconItem.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */