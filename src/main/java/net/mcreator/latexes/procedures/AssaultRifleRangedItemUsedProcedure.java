/*    */ package net.mcreator.latexes.procedures;
/*    */ 
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ 
/*    */ public class AssaultRifleRangedItemUsedProcedure {
/*    */   public static void execute(Entity entity, ItemStack itemstack) {
/*  9 */     if (entity == null)
/*    */       return; 
/* 11 */     if (entity instanceof Player) { Player _player = (Player)entity;
/* 12 */       _player.getCooldowns().addCooldown(itemstack.getItem(), 4); }
/* 13 */      if (itemstack.getOrCreateTag().getDouble("ammo") >= 1.0D)
/* 14 */       itemstack.getOrCreateTag().putDouble("ammo", itemstack.getOrCreateTag().getDouble("ammo") - 1.0D); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\AssaultRifleRangedItemUsedProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */