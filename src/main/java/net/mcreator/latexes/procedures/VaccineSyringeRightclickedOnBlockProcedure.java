/*    */ package net.mcreator.latexes.procedures;
/*    */ import net.mcreator.latexes.init.LatexModItems;
/*    */ import net.mcreator.latexes.init.LatexModMobEffects;
/*    */ import net.minecraft.world.Container;
/*    */ import net.minecraft.world.effect.MobEffect;
/*    */ import net.minecraft.world.effect.MobEffectInstance;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ import net.minecraftforge.items.ItemHandlerHelper;
/*    */ 
/*    */ public class VaccineSyringeRightclickedOnBlockProcedure {
/*    */   public static void execute(Entity entity) {
/* 16 */     if (entity == null)
/*    */       return; 
/* 18 */     if (entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity;
/* 19 */       _entity.addEffect(new MobEffectInstance((MobEffect)LatexModMobEffects.VACCINEEFFECT.get(), 3750, 1)); }
/* 20 */      if (entity instanceof Player) { Player _player = (Player)entity;
/* 21 */       ItemStack _stktoremove = new ItemStack((ItemLike)LatexModItems.VACCINE_SYRINGE.get());
/* 22 */       _player.getInventory().clearOrCountMatchingItems(p -> (_stktoremove.getItem() == p.getItem()), 1, (Container)_player.inventoryMenu.getCraftSlots()); }
/*    */     
/* 24 */     if (entity instanceof Player) { Player _player = (Player)entity;
/* 25 */       ItemStack _setstack = new ItemStack((ItemLike)LatexModItems.SYRINGE.get());
/* 26 */       _setstack.setCount(1);
/* 27 */       ItemHandlerHelper.giveItemToPlayer(_player, _setstack); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\VaccineSyringeRightclickedOnBlockProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */