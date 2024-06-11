/*    */ package net.mcreator.latexes.item;
/*    */ 
/*    */ import java.util.List;
/*    */ import net.mcreator.latexes.init.LatexModTabs;
/*    */ import net.mcreator.latexes.procedures.HandcuffsRightclickedProcedure;
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
/*    */ public class HandcuffsItem
/*    */   extends Item {
/*    */   public HandcuffsItem() {
/* 20 */     super((new Item.Properties()).tab(LatexModTabs.TAB_LATEXITEMS).stacksTo(16).rarity(Rarity.COMMON));
/*    */   }
/*    */ 
/*    */   
/*    */   public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
/* 25 */     super.appendHoverText(itemstack, world, list, flag);
/* 26 */     list.add(new TextComponent("Hit non-combattant humans to arrest them."));
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
/* 31 */     boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
/* 32 */     HandcuffsRightclickedProcedure.execute((LevelAccessor)entity.level, entity.getX(), entity.getY(), entity.getZ(), (Entity)entity);
/* 33 */     return retval;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\item\HandcuffsItem.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */