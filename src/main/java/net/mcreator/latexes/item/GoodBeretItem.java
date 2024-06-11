/*    */ package net.mcreator.latexes.item;
/*    */ 
/*    */ import net.mcreator.latexes.init.LatexModTabs;
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
/*    */ 
/*    */ public abstract class GoodBeretItem
/*    */   extends ArmorItem
/*    */ {
/*    */   public GoodBeretItem(EquipmentSlot slot, Item.Properties properties) {
/* 20 */     super(new ArmorMaterial()
/*    */         {
/*    */           public int getDurabilityForSlot(EquipmentSlot slot) {
/* 23 */             (new int[4])[0] = 13; (new int[4])[1] = 15; (new int[4])[2] = 16; (new int[4])[3] = 11; return (new int[4])[slot.getIndex()] * 20;
/*    */           }
/*    */ 
/*    */           
/*    */           public int getDefenseForSlot(EquipmentSlot slot) {
/* 28 */             (new int[4])[0] = 2; (new int[4])[1] = 5; (new int[4])[2] = 6; (new int[4])[3] = 1; return (new int[4])[slot.getIndex()];
/*    */           }
/*    */ 
/*    */           
/*    */           public int getEnchantmentValue() {
/* 33 */             return 9;
/*    */           }
/*    */ 
/*    */           
/*    */           public SoundEvent getEquipSound() {
/* 38 */             return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
/*    */           }
/*    */ 
/*    */           
/*    */           public Ingredient getRepairIngredient() {
/* 43 */             return Ingredient.EMPTY;
/*    */           }
/*    */ 
/*    */           
/*    */           public String getName() {
/* 48 */             return "good_beret";
/*    */           }
/*    */ 
/*    */           
/*    */           public float getToughness() {
/* 53 */             return 0.0F;
/*    */           }
/*    */ 
/*    */           
/*    */           public float getKnockbackResistance() {
/* 58 */             return 0.0F;
/*    */           }
/*    */         },  slot, properties);
/*    */   }
/*    */   
/*    */   public static class Helmet extends GoodBeretItem {
/*    */     public Helmet() {
/* 65 */       super(EquipmentSlot.HEAD, (new Item.Properties()).tab(LatexModTabs.TAB_LATEXITEMS));
/*    */     }
/*    */ 
/*    */     
/*    */     public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
/* 70 */       return "latex:textures/models/armor/blue_beret__layer_1.png";
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\item\GoodBeretItem.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */