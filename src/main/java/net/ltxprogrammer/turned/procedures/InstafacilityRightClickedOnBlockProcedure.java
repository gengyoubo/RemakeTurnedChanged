/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ import net.ltxprogrammer.turned.init.LatexModItems;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.Container;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Mirror;
/*    */ import net.minecraft.world.level.block.Rotation;
/*    */ import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
/*    */ import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
/*    */ 
/*    */ public class InstafacilityRightClickedOnBlockProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 18 */     if (entity == null)
/*    */       return; 
/* 20 */     if (world instanceof ServerLevel) { ServerLevel _serverworld = (ServerLevel)world;
/* 21 */       StructureTemplate template = _serverworld.m_8875_().m_74341_(new ResourceLocation("turned", "operative_facility"));
/* 22 */       if (template != null) {
/* 23 */         template.m_74536_((ServerLevelAccessor)_serverworld, new BlockPos(x, y - 2.0D, z), new BlockPos(x, y - 2.0D, z), (new StructurePlaceSettings())
/* 24 */             .m_74379_(Rotation.NONE).m_74377_(Mirror.NONE).m_74392_(false), _serverworld.f_46441_, 3);
/*    */       } }
/*    */ 
/*    */     
/* 28 */     if (entity instanceof Player) { Player _player = (Player)entity;
/* 29 */       ItemStack _stktoremove = new ItemStack((ItemLike)LatexModItems.INSTAFACILITY.get());
/* 30 */       _player.m_150109_().m_36022_(p -> (_stktoremove.m_41720_() == p.m_41720_()), 1, (Container)_player.f_36095_.m_39730_()); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\InstafacilityRightClickedOnBlockProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */