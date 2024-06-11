/*    */ package net.ltxprogrammer.turned.item;
/*    */ 
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
/*    */ class null
/*    */   implements ArmorMaterial
/*    */ {
/*    */   public int m_7366_(EquipmentSlot slot) {
/* 23 */     (new int[4])[0] = 13; (new int[4])[1] = 15; (new int[4])[2] = 16; (new int[4])[3] = 11; return (new int[4])[slot.m_20749_()] * 64;
/*    */   }
/*    */ 
/*    */   
/*    */   public int m_7365_(EquipmentSlot slot) {
/* 28 */     (new int[4])[0] = 2; (new int[4])[1] = 3; (new int[4])[2] = 4; (new int[4])[3] = 2; return (new int[4])[slot.m_20749_()];
/*    */   }
/*    */ 
/*    */   
/*    */   public int m_6646_() {
/* 33 */     return 12;
/*    */   }
/*    */ 
/*    */   
/*    */   public SoundEvent m_7344_() {
/* 38 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:gas_mask_wear"));
/*    */   }
/*    */ 
/*    */   
/*    */   public Ingredient m_6230_() {
/* 43 */     return Ingredient.m_43927_(new ItemStack[] { new ItemStack((ItemLike)Items.f_42416_), new ItemStack((ItemLike)Items.f_42454_), new ItemStack((ItemLike)Items.f_42414_), new ItemStack((ItemLike)Items.f_42417_) });
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public String m_6082_() {
/* 49 */     return "hazmat";
/*    */   }
/*    */ 
/*    */   
/*    */   public float m_6651_() {
/* 54 */     return 0.0F;
/*    */   }
/*    */ 
/*    */   
/*    */   public float m_6649_() {
/* 59 */     return 0.0F;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\item\HazmatItem$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */