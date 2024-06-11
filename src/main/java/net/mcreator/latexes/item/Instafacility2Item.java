/*    */ package net.mcreator.latexes.item;
/*    */ 
/*    */ import java.util.List;
/*    */ import net.mcreator.latexes.procedures.Instafacility2RightClickedOnBlockProcedure;
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
/*    */ public class Instafacility2Item
/*    */   extends Item {
/*    */   public Instafacility2Item() {
/* 21 */     super((new Item.Properties()).tab(null).stacksTo(1).rarity(Rarity.UNCOMMON));
/*    */   }
/*    */ 
/*    */   
/*    */   public UseAnim getUseAnimation(ItemStack itemstack) {
/* 26 */     return UseAnim.EAT;
/*    */   }
/*    */ 
/*    */   
/*    */   public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
/* 31 */     super.appendHoverText(itemstack, world, list, flag);
/* 32 */     list.add(new TextComponent("Instant Facility for lazy people!"));
/*    */   }
/*    */ 
/*    */   
/*    */   public InteractionResult useOn(UseOnContext context) {
/* 37 */     InteractionResult retval = super.useOn(context);
/* 38 */     Instafacility2RightClickedOnBlockProcedure.execute((LevelAccessor)context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context
/* 39 */         .getClickedPos().getZ(), (Entity)context.getPlayer());
/* 40 */     return retval;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\item\Instafacility2Item.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */