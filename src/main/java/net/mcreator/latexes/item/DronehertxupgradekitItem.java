/*    */ package net.mcreator.latexes.item;
/*    */ 
/*    */ import java.util.List;
/*    */ import net.mcreator.latexes.init.LatexModTabs;
/*    */ import net.mcreator.latexes.procedures.DronehertxupgradekitRightclickedProcedure;
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
/* 22 */     super((new Item.Properties()).tab(LatexModTabs.TAB_LATEXITEMS).stacksTo(16).rarity(Rarity.COMMON));
/*    */   }
/*    */ 
/*    */   
/*    */   public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
/* 27 */     super.appendHoverText(itemstack, world, list, flag);
/* 28 */     list.add(new TextComponent("Turn your drone hertx in a military one!"));
/*    */   }
/*    */ 
/*    */   
/*    */   public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
/* 33 */     InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
/* 34 */     ItemStack itemstack = (ItemStack)ar.getObject();
/* 35 */     double x = entity.getX();
/* 36 */     double y = entity.getY();
/* 37 */     double z = entity.getZ();
/*    */     
/* 39 */     DronehertxupgradekitRightclickedProcedure.execute((LevelAccessor)world, x, y, z, (Entity)entity);
/* 40 */     return ar;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\item\DronehertxupgradekitItem.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */