/*    */ package net.mcreator.latexes.procedures;
/*    */ 
/*    */ import net.mcreator.latexes.init.LatexModItems;
/*    */ import net.minecraft.core.Registry;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.tags.TagKey;
/*    */ import net.minecraft.world.Container;
/*    */ import net.minecraft.world.damagesource.DamageSource;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ import net.minecraftforge.items.ItemHandlerHelper;
/*    */ 
/*    */ public class BloodSyringeLivingEntityIsHitWithItemProcedure {
/*    */   public static void execute(Entity entity, Entity sourceentity) {
/* 18 */     if (entity == null || sourceentity == null)
/*    */       return; 
/* 20 */     if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("latex:darklatexes")))) {
/* 21 */       if (entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity;
/* 22 */         _entity.hurt((new DamageSource("%1$s was drained to death")).bypassArmor(), 1.0F); }
/* 23 */        if (sourceentity instanceof Player) { Player _player = (Player)sourceentity;
/* 24 */         ItemStack _stktoremove = new ItemStack((ItemLike)LatexModItems.SYRINGE.get());
/* 25 */         _player.getInventory().clearOrCountMatchingItems(p -> (_stktoremove.getItem() == p.getItem()), 1, (Container)_player.inventoryMenu
/* 26 */             .getCraftSlots()); }
/*    */       
/* 28 */       if (sourceentity instanceof Player) { Player _player = (Player)sourceentity;
/* 29 */         ItemStack _setstack = new ItemStack((ItemLike)LatexModItems.DL_SYRINGE.get());
/* 30 */         _setstack.setCount(1);
/* 31 */         ItemHandlerHelper.giveItemToPlayer(_player, _setstack); }
/*    */     
/* 33 */     } else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("latex:humanlikes")))) {
/* 34 */       if (entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity;
/* 35 */         _entity.hurt((new DamageSource("%1$s was drained to death")).bypassArmor(), 3.0F); }
/* 36 */        if (sourceentity instanceof Player) { Player _player = (Player)sourceentity;
/* 37 */         ItemStack _stktoremove = new ItemStack((ItemLike)LatexModItems.SYRINGE.get());
/* 38 */         _player.getInventory().clearOrCountMatchingItems(p -> (_stktoremove.getItem() == p.getItem()), 1, (Container)_player.inventoryMenu
/* 39 */             .getCraftSlots()); }
/*    */       
/* 41 */       if (sourceentity instanceof Player) { Player _player = (Player)sourceentity;
/* 42 */         ItemStack _setstack = new ItemStack((ItemLike)LatexModItems.BLOOD_SYRINGE.get());
/* 43 */         _setstack.setCount(1);
/* 44 */         ItemHandlerHelper.giveItemToPlayer(_player, _setstack); }
/*    */     
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\BloodSyringeLivingEntityIsHitWithItemProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */