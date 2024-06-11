/*    */ package net.mcreator.latexes.procedures;
/*    */ 
/*    */ import net.mcreator.latexes.init.LatexModItems;
/*    */ import net.mcreator.latexes.init.LatexModMobEffects;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.sounds.SoundEvent;
/*    */ import net.minecraft.sounds.SoundSource;
/*    */ import net.minecraft.world.damagesource.DamageSource;
/*    */ import net.minecraft.world.effect.MobEffect;
/*    */ import net.minecraft.world.effect.MobEffectInstance;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.EquipmentSlot;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraftforge.registries.ForgeRegistries;
/*    */ 
/*    */ public class YufengbodyBodyTickEventProcedure
/*    */ {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 24 */     if (entity == null)
/*    */       return; 
/* 26 */     LivingEntity _entGetArmor = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)
/* 27 */       .getItem() == LatexModItems.DLMASK_HELMET.get()) {
/* 28 */       LivingEntity livingEntity = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? livingEntity.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY)
/* 29 */         .getItem() == LatexModItems.YUFENGBODY_CHESTPLATE.get() && 
/* 30 */         entity instanceof Player) { Player _player = (Player)entity;
/* 31 */         (_player.getAbilities()).mayfly = true;
/* 32 */         _player.onUpdateAbilities(); }
/*    */ 
/*    */     
/* 35 */     } else if (entity instanceof net.mcreator.latexes.entity.YufengEntity) {
/* 36 */       LivingEntity livingEntity = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? livingEntity.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY)
/* 37 */         .getItem() == LatexModItems.YUFENGBODY_CHESTPLATE.get() && 
/* 38 */         entity instanceof Player) { Player _player = (Player)entity;
/* 39 */         (_player.getAbilities()).mayfly = true;
/* 40 */         _player.onUpdateAbilities(); }
/*    */     
/*    */     } else {
/*    */       
/* 44 */       Player _plr = (Player)entity; if (((entity instanceof Player) ? (_plr.getAbilities()).instabuild : false) != true) {
/* 45 */         if (entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity;
/* 46 */           _entity.addEffect(new MobEffectInstance((MobEffect)LatexModMobEffects.DARKLATEXDARTEFFECT.get(), 150, 1, false, false)); }
/* 47 */          LivingEntity _livEnt = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? _livEnt.getHealth() : -1.0F) < 1.0F) {
/* 48 */           if (world instanceof Level) { Level _level = (Level)world;
/* 49 */             if (!_level.isClientSide()) {
/* 50 */               _level.playSound(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/* 51 */                   .getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0F, 1.0F);
/*    */             } else {
/* 53 */               _level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*    */             }  }
/*    */ 
/*    */           
/* 57 */           entity.hurt(DamageSource.WITHER, 1.0F);
/*    */         } 
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\YufengbodyBodyTickEventProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */