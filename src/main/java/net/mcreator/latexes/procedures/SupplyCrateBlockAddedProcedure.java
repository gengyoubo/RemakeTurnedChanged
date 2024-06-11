/*    */ package net.mcreator.latexes.procedures;
/*    */ import net.minecraft.commands.CommandSource;
/*    */ import net.minecraft.commands.CommandSourceStack;
/*    */ import net.minecraft.network.chat.Component;
/*    */ import net.minecraft.network.chat.TextComponent;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.phys.Vec2;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ 
/*    */ public class SupplyCrateBlockAddedProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 13 */     if (Math.random() < 0.4D)
/* 14 */     { if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 15 */         _level.getServer().getCommands()
/* 16 */           .performCommand((new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", (Component)new TextComponent(""), _level
/*    */               
/* 18 */               .getServer(), null)).withSuppressedOutput(), "data merge block ~ ~ ~ {LootTable:\"latex:chests/militaryloot\"}"); }
/*    */       
/*    */        }
/* 21 */     else if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 22 */       _level.getServer().getCommands()
/* 23 */         .performCommand((new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", (Component)new TextComponent(""), _level
/*    */             
/* 25 */             .getServer(), null)).withSuppressedOutput(), "data merge block ~ ~ ~ {LootTable:\"latex:laboratory_loot\"}"); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\SupplyCrateBlockAddedProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */