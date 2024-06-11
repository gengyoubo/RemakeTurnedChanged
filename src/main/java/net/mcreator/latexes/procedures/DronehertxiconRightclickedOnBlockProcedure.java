/*    */ package net.mcreator.latexes.procedures;
/*    */ import net.mcreator.latexes.entity.DroneHertxEntity;
/*    */ import net.mcreator.latexes.init.LatexModItems;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.Container;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.Mob;
/*    */ import net.minecraft.world.entity.MobSpawnType;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class DronehertxiconRightclickedOnBlockProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 17 */     if (entity == null)
/*    */       return; 
/* 19 */     if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 20 */       DroneHertxEntity droneHertxEntity = new DroneHertxEntity((EntityType)LatexModEntities.DRONE_HERTX.get(), (Level)_level);
/* 21 */       droneHertxEntity.moveTo(x, y + 1.0D, z, world.getRandom().nextFloat() * 360.0F, 0.0F);
/* 22 */       if (droneHertxEntity instanceof Mob) { Mob _mobToSpawn = (Mob)droneHertxEntity;
/* 23 */         _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(droneHertxEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/* 24 */        world.addFreshEntity((Entity)droneHertxEntity); }
/*    */     
/* 26 */     if (entity instanceof Player) { Player _player = (Player)entity;
/* 27 */       ItemStack _stktoremove = new ItemStack((ItemLike)LatexModItems.DRONEHERTXICON.get());
/* 28 */       _player.getInventory().clearOrCountMatchingItems(p -> (_stktoremove.getItem() == p.getItem()), 1, (Container)_player.inventoryMenu.getCraftSlots()); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\DronehertxiconRightclickedOnBlockProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */