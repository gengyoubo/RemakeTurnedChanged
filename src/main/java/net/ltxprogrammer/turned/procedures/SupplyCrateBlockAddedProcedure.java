/*    */ package net.ltxprogrammer.turned.procedures;
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
/* 15 */         _level.m_142572_().m_129892_()
/* 16 */           .m_82117_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)new TextComponent(""), _level
/*    */               
/* 18 */               .m_142572_(), null)).m_81324_(), "data merge block ~ ~ ~ {LootTable:\"turned:chests/militaryloot\"}"); }
/*    */       
/*    */        }
/* 21 */     else if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 22 */       _level.m_142572_().m_129892_()
/* 23 */         .m_82117_((new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)new TextComponent(""), _level
/*    */             
/* 25 */             .m_142572_(), null)).m_81324_(), "data merge block ~ ~ ~ {LootTable:\"turned:laboratory_loot\"}"); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\SupplyCrateBlockAddedProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */