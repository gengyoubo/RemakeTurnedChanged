/*    */ package net.mcreator.latexes.procedures;
/*    */ 
/*    */ import net.mcreator.latexes.init.LatexModItems;
/*    */ import net.minecraft.world.Container;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ import net.minecraftforge.items.ItemHandlerHelper;
/*    */ 
/*    */ public class BloodSyringeRightclickedOnBlockProcedure {
/*    */   public static void execute(Entity entity) {
/* 14 */     if (entity == null)
/*    */       return; 
/* 16 */     LivingEntity _livEnt = (LivingEntity)entity, livingEntity1 = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? _livEnt.getHealth() : -1.0F) < ((entity instanceof LivingEntity) ? 
/* 17 */       livingEntity1.getMaxHealth() : 
/* 18 */       -1.0F)) {
/* 19 */       if (entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity;
/* 20 */         LivingEntity livingEntity2 = (LivingEntity)entity; _entity.setHealth(((entity instanceof LivingEntity) ? livingEntity2.getHealth() : -1.0F) + 3.0F); }
/* 21 */        if (entity instanceof Player) { Player _player = (Player)entity;
/* 22 */         ItemStack _stktoremove = new ItemStack((ItemLike)LatexModItems.BLOOD_SYRINGE.get());
/* 23 */         _player.getInventory().clearOrCountMatchingItems(p -> (_stktoremove.getItem() == p.getItem()), 1, (Container)_player.inventoryMenu
/* 24 */             .getCraftSlots()); }
/*    */       
/* 26 */       if (entity instanceof Player) { Player _player = (Player)entity;
/* 27 */         ItemStack _setstack = new ItemStack((ItemLike)LatexModItems.SYRINGE.get());
/* 28 */         _setstack.setCount(1);
/* 29 */         ItemHandlerHelper.giveItemToPlayer(_player, _setstack); }
/*    */     
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\BloodSyringeRightclickedOnBlockProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */