/*    */ package net.mcreator.latexes.procedures;
/*    */ 
/*    */ import net.mcreator.latexes.init.LatexModItems;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.tags.BlockTags;
/*    */ import net.minecraft.world.Container;
/*    */ import net.minecraft.world.damagesource.DamageSource;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraftforge.items.ItemHandlerHelper;
/*    */ 
/*    */ public class SyringeRightClickedOnBlockProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 19 */     if (entity == null)
/*    */       return; 
/* 21 */     if (world.getBlockState(new BlockPos(x, y, z)).is(BlockTags.create(new ResourceLocation("latex:darklatexblocks"))))
/* 22 */     { if (entity instanceof Player) { Player _player = (Player)entity;
/* 23 */         ItemStack _stktoremove = new ItemStack((ItemLike)LatexModItems.SYRINGE.get());
/* 24 */         _player.getInventory().clearOrCountMatchingItems(p -> (_stktoremove.getItem() == p.getItem()), 1, (Container)_player.inventoryMenu
/* 25 */             .getCraftSlots()); }
/*    */       
/* 27 */       if (entity instanceof Player) { Player _player = (Player)entity;
/* 28 */         ItemStack _setstack = new ItemStack((ItemLike)LatexModItems.DL_SYRINGE.get());
/* 29 */         _setstack.setCount(1);
/* 30 */         ItemHandlerHelper.giveItemToPlayer(_player, _setstack); }
/*    */        }
/* 32 */     else { LivingEntity _livEnt = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? _livEnt.getHealth() : -1.0F) > 2.0F) {
/* 33 */         if (entity instanceof Player) { Player _player = (Player)entity;
/* 34 */           ItemStack _stktoremove = new ItemStack((ItemLike)LatexModItems.SYRINGE.get());
/* 35 */           _player.getInventory().clearOrCountMatchingItems(p -> (_stktoremove.getItem() == p.getItem()), 1, (Container)_player.inventoryMenu
/* 36 */               .getCraftSlots()); }
/*    */         
/* 38 */         entity.hurt(DamageSource.DRY_OUT, 2.0F);
/* 39 */         if (entity instanceof Player) { Player _player = (Player)entity;
/* 40 */           ItemStack _setstack = new ItemStack((ItemLike)LatexModItems.BLOOD_SYRINGE.get());
/* 41 */           _setstack.setCount(1);
/* 42 */           ItemHandlerHelper.giveItemToPlayer(_player, _setstack); }
/*    */       
/*    */       }  }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\SyringeRightClickedOnBlockProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */