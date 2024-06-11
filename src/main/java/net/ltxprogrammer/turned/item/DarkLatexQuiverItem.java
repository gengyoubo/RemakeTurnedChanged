/*    */ package net.ltxprogrammer.turned.item;
/*    */ 
/*    */ import net.ltxprogrammer.changed.init.ChangedItems;
/*    */ import net.ltxprogrammer.turned.init.LatexModTabs;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.sounds.SoundEvent;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.EquipmentSlot;
/*    */ import net.minecraft.world.item.ArmorItem;
/*    */ import net.minecraft.world.item.ArmorMaterial;
/*    */ import net.minecraft.world.item.Item;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.item.crafting.Ingredient;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ import net.minecraftforge.registries.ForgeRegistries;
/*    */ 
/*    */ public abstract class DarkLatexQuiverItem
/*    */   extends ArmorItem {
/*    */   public DarkLatexQuiverItem(EquipmentSlot slot, Item.Properties properties) {
/* 20 */     super(new ArmorMaterial()
/*    */         {
/*    */           public int m_7366_(EquipmentSlot slot) {
/* 23 */             (new int[4])[0] = 13; (new int[4])[1] = 15; (new int[4])[2] = 16; (new int[4])[3] = 11; return (new int[4])[slot.m_20749_()] * 75;
/*    */           }
/*    */ 
/*    */           
/*    */           public int m_7365_(EquipmentSlot slot) {
/* 28 */             (new int[4])[0] = 0; (new int[4])[1] = 0; (new int[4])[2] = 2; (new int[4])[3] = 0; return (new int[4])[slot.m_20749_()];
/*    */           }
/*    */ 
/*    */           
/*    */           public int m_6646_() {
/* 33 */             return 25;
/*    */           }
/*    */ 
/*    */           
/*    */           public SoundEvent m_7344_() {
/* 38 */             return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
/*    */           }
/*    */ 
/*    */           
/*    */           public Ingredient m_6230_() {
/* 43 */             return Ingredient.m_43927_(new ItemStack[] { new ItemStack((ItemLike)ChangedItems.DARK_LATEX_GOO.get()), new ItemStack((ItemLike)ChangedItems.DARK_LATEX_CRYSTAL_FRAGMENT.get()) }, );
/*    */           }
/*    */ 
/*    */           
/*    */           public String m_6082_() {
/* 48 */             return "dark_latex_quiver";
/*    */           }
/*    */ 
/*    */           
/*    */           public float m_6651_() {
/* 53 */             return 0.0F;
/*    */           }
/*    */ 
/*    */           
/*    */           public float m_6649_() {
/* 58 */             return 0.0F;
/*    */           }
/*    */         },  slot, properties);
/*    */   }
/*    */   
/*    */   public static class Chestplate extends DarkLatexQuiverItem {
/*    */     public Chestplate() {
/* 65 */       super(EquipmentSlot.CHEST, (new Item.Properties()).m_41491_(LatexModTabs.TAB_LATEXITEMS));
/*    */     }
/*    */ 
/*    */     
/*    */     public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
/* 70 */       return "turned:textures/entities/dark_latex_quiver.png";
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\item\DarkLatexQuiverItem.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */