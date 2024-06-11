/*    */ package net.mcreator.latexes.procedures;
/*    */ 
/*    */ import net.mcreator.latexes.init.LatexModGameRules;
/*    */ import net.mcreator.latexes.init.LatexModItems;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.EquipmentSlot;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.item.enchantment.EnchantmentHelper;
/*    */ import net.minecraft.world.item.enchantment.Enchantments;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class DlmaskHelmetTickEventProcedure
/*    */ {
/*    */   public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
/* 17 */     if (entity == null)
/*    */       return; 
/* 19 */     if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BINDING_CURSE, itemstack) < 1 && world
/* 20 */       .getLevelData().getGameRules().getBoolean(LatexModGameRules.CURSEOFBINDINGMASK)) {
/* 21 */       LivingEntity livingEntity = (LivingEntity)entity; ((entity instanceof LivingEntity) ? livingEntity.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)
/* 22 */         .enchant(Enchantments.BINDING_CURSE, 1);
/*    */     } 
/* 24 */     LivingEntity _entGetArmor = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)
/* 25 */       .getItem() == LatexModItems.DLMASK_HELMET.get()) {
/* 26 */       LivingEntity livingEntity = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? livingEntity.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY)
/* 27 */         .getItem() == LatexModItems.YUFENGBODY_CHESTPLATE.get() && 
/* 28 */         entity instanceof Player) { Player _player = (Player)entity;
/* 29 */         (_player.getAbilities()).mayfly = true;
/* 30 */         _player.onUpdateAbilities(); }
/*    */     
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\DlmaskHelmetTickEventProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */