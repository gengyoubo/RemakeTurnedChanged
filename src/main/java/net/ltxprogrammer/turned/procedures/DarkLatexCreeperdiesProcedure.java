/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ import net.ltxprogrammer.changed.init.ChangedItems;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.item.ItemEntity;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.item.Items;
/*    */ import net.minecraft.world.level.Explosion;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Blocks;
/*    */ 
/*    */ public class DarkLatexCreeperdiesProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 16 */     if (entity == null)
/*    */       return; 
/* 18 */     boolean found = false;
/* 19 */     double sx = 0.0D;
/* 20 */     double sy = 0.0D;
/* 21 */     double sz = 0.0D;
/* 22 */     if (entity.m_6060_() && Math.random() <= 0.75D) {
/* 23 */       if (!entity.f_19853_.m_5776_())
/* 24 */         entity.m_146870_(); 
/* 25 */       if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_())
/* 26 */           _level.m_46511_(null, x, y, z, 5.0F, Explosion.BlockInteraction.BREAK);  }
/* 27 */        sx = -3.0D;
/* 28 */       found = false;
/* 29 */       for (int index0 = 0; index0 < 6; index0++) {
/* 30 */         sy = -5.0D;
/* 31 */         for (int index1 = 0; index1 < 6; index1++) {
/* 32 */           sz = -3.0D;
/* 33 */           for (int index2 = 0; index2 < 6; index2++) {
/* 34 */             if (world.m_8055_(new BlockPos(x + sx, y + sy, z + sz)).m_60734_() != Blocks.f_50627_ && world
/* 35 */               .m_8055_(new BlockPos(x + sx, y + sy, z + sz)).m_60734_() != Blocks.f_50626_ && world
/* 36 */               .m_8055_(new BlockPos(x + sx, y + sy, z + sz)).m_60734_() != Blocks.f_50016_) {
/* 37 */               found = true;
/*    */             }
/* 39 */             sz++;
/*    */           } 
/* 41 */           sy++;
/*    */         } 
/* 43 */         sx++;
/*    */       } 
/*    */     } else {
/* 46 */       if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/* 47 */           ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)ChangedItems.DARK_LATEX_GOO.get()));
/* 48 */           entityToSpawn.m_32010_(10);
/* 49 */           _level.m_7967_((Entity)entityToSpawn);
/*    */         }  }
/* 51 */        if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/* 52 */           ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.f_42403_));
/* 53 */           entityToSpawn.m_32010_(10);
/* 54 */           _level.m_7967_((Entity)entityToSpawn);
/*    */         }  }
/* 56 */        if (Math.random() < 0.35D) {
/* 57 */         if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/* 58 */             ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)ChangedItems.DARK_LATEX_GOO.get()));
/* 59 */             entityToSpawn.m_32010_(10);
/* 60 */             _level.m_7967_((Entity)entityToSpawn);
/*    */           }  }
/* 62 */          if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/* 63 */             ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.f_42500_));
/* 64 */             entityToSpawn.m_32010_(10);
/* 65 */             _level.m_7967_((Entity)entityToSpawn);
/*    */           }  }
/*    */       
/* 68 */       }  if (Math.random() < 0.1D && 
/* 69 */         world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/* 70 */           ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.f_42403_));
/* 71 */           entityToSpawn.m_32010_(10);
/* 72 */           _level.m_7967_((Entity)entityToSpawn);
/*    */         }  }
/*    */     
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\DarkLatexCreeperdiesProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */