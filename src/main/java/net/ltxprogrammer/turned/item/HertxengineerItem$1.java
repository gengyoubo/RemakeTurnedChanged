/*    */ package net.ltxprogrammer.turned.item;
/*    */ 
/*    */ import net.ltxprogrammer.turned.init.LatexModItems;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.sounds.SoundEvent;
/*    */ import net.minecraft.world.entity.EquipmentSlot;
/*    */ import net.minecraft.world.item.ArmorMaterial;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.item.Items;
/*    */ import net.minecraft.world.item.crafting.Ingredient;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ import net.minecraftforge.registries.ForgeRegistries;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class null
/*    */   implements ArmorMaterial
/*    */ {
/*    */   public int m_7366_(EquipmentSlot slot) {
/* 30 */     (new int[4])[0] = 13; (new int[4])[1] = 15; (new int[4])[2] = 16; (new int[4])[3] = 11; return (new int[4])[slot.m_20749_()] * 40;
/*    */   }
/*    */ 
/*    */   
/*    */   public int m_7365_(EquipmentSlot slot) {
/* 35 */     (new int[4])[0] = 2; (new int[4])[1] = 1; (new int[4])[2] = 5; (new int[4])[3] = 2; return (new int[4])[slot.m_20749_()];
/*    */   }
/*    */ 
/*    */   
/*    */   public int m_6646_() {
/* 40 */     return 12;
/*    */   }
/*    */ 
/*    */   
/*    */   public SoundEvent m_7344_() {
/* 45 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_iron"));
/*    */   }
/*    */ 
/*    */   
/*    */   public Ingredient m_6230_() {
/* 50 */     return Ingredient.m_43927_(new ItemStack[] { new ItemStack((ItemLike)Items.f_42416_), new ItemStack((ItemLike)LatexModItems.BATTERY.get()), new ItemStack((ItemLike)Items.f_42451_) });
/*    */   }
/*    */ 
/*    */   
/*    */   public String m_6082_() {
/* 55 */     return "hertxengineer";
/*    */   }
/*    */ 
/*    */   
/*    */   public float m_6651_() {
/* 60 */     return 0.0F;
/*    */   }
/*    */ 
/*    */   
/*    */   public float m_6649_() {
/* 65 */     return 0.0F;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\item\HertxengineerItem$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */