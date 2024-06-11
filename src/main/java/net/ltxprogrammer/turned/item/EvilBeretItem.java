/*    */ package net.ltxprogrammer.turned.item;
/*    */ 
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
/*    */ import net.minecraftforge.registries.ForgeRegistries;
/*    */ 
/*    */ public abstract class EvilBeretItem
/*    */   extends ArmorItem
/*    */ {
/*    */   public EvilBeretItem(EquipmentSlot slot, Item.Properties properties) {
/* 19 */     super(new ArmorMaterial()
/*    */         {
/*    */           public int m_7366_(EquipmentSlot slot) {
/* 22 */             (new int[4])[0] = 13; (new int[4])[1] = 15; (new int[4])[2] = 16; (new int[4])[3] = 11; return (new int[4])[slot.m_20749_()] * 20;
/*    */           }
/*    */ 
/*    */           
/*    */           public int m_7365_(EquipmentSlot slot) {
/* 27 */             (new int[4])[0] = 2; (new int[4])[1] = 5; (new int[4])[2] = 6; (new int[4])[3] = 1; return (new int[4])[slot.m_20749_()];
/*    */           }
/*    */ 
/*    */           
/*    */           public int m_6646_() {
/* 32 */             return 9;
/*    */           }
/*    */ 
/*    */           
/*    */           public SoundEvent m_7344_() {
/* 37 */             return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
/*    */           }
/*    */ 
/*    */           
/*    */           public Ingredient m_6230_() {
/* 42 */             return Ingredient.f_43901_;
/*    */           }
/*    */ 
/*    */           
/*    */           public String m_6082_() {
/* 47 */             return "evil_beret";
/*    */           }
/*    */ 
/*    */           
/*    */           public float m_6651_() {
/* 52 */             return 0.0F;
/*    */           }
/*    */ 
/*    */           
/*    */           public float m_6649_() {
/* 57 */             return 0.0F;
/*    */           }
/*    */         },  slot, properties);
/*    */   }
/*    */   
/*    */   public static class Helmet extends EvilBeretItem {
/*    */     public Helmet() {
/* 64 */       super(EquipmentSlot.HEAD, (new Item.Properties()).m_41491_(LatexModTabs.TAB_LATEXITEMS));
/*    */     }
/*    */ 
/*    */     
/*    */     public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
/* 69 */       return "turned:textures/models/armor/red_beret__layer_1.png";
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\item\EvilBeretItem.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */