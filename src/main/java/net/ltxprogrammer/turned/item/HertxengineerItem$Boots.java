/*     */ package net.ltxprogrammer.turned.item;
/*     */ 
/*     */ import net.ltxprogrammer.turned.init.LatexModTabs;
/*     */ import net.ltxprogrammer.turned.procedures.HertxengineerBootsTickEventProcedure;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EquipmentSlot;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.item.Item;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.level.Level;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Boots
/*     */   extends HertxengineerItem
/*     */ {
/*     */   public Boots() {
/* 115 */     super(EquipmentSlot.FEET, (new Item.Properties()).m_41491_(LatexModTabs.TAB_LATEXITEMS));
/*     */   }
/*     */ 
/*     */   
/*     */   public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
/* 120 */     return "turned:textures/models/armor/drone_hertx_armor__layer_1.png";
/*     */   }
/*     */ 
/*     */   
/*     */   public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
/* 125 */     HertxengineerBootsTickEventProcedure.execute((Entity)entity);
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\item\HertxengineerItem$Boots.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */