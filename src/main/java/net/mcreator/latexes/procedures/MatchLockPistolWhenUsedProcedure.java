/*    */ package net.mcreator.latexes.procedures;
/*    */ import net.minecraft.core.particles.ParticleOptions;
/*    */ import net.minecraft.core.particles.ParticleTypes;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class MatchLockPistolWhenUsedProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
/* 12 */     if (entity == null)
/*    */       return; 
/* 14 */     if (entity instanceof Player) { Player _player = (Player)entity;
/* 15 */       _player.getCooldowns().addCooldown(itemstack.getItem(), 22); }
/* 16 */      if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 17 */       _level.sendParticles((ParticleOptions)ParticleTypes.CAMPFIRE_COSY_SMOKE, x, y, z, 8, 0.5D, 0.5D, 0.5D, 0.25D); }
/* 18 */      if (itemstack.getOrCreateTag().getDouble("ammo") >= 1.0D)
/* 19 */       itemstack.getOrCreateTag().putDouble("ammo", itemstack.getOrCreateTag().getDouble("ammo") - 1.0D); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\MatchLockPistolWhenUsedProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */