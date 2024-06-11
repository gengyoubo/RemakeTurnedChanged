/*    */ package net.mcreator.latexes.procedures;
/*    */ import net.mcreator.latexes.entity.HertxSitEntity;
/*    */ import net.mcreator.latexes.init.LatexModItems;
/*    */ import net.minecraft.core.particles.ParticleOptions;
/*    */ import net.minecraft.core.particles.ParticleTypes;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.Container;
/*    */ import net.minecraft.world.effect.MobEffectInstance;
/*    */ import net.minecraft.world.effect.MobEffects;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.entity.Mob;
/*    */ import net.minecraft.world.entity.MobSpawnType;
/*    */ import net.minecraft.world.entity.TamableAnimal;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class HertxRightClickedOnEntityProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
/* 22 */     if (entity == null || sourceentity == null)
/*    */       return; 
/* 24 */     LivingEntity _livEnt = (LivingEntity)sourceentity; if (((sourceentity instanceof LivingEntity) ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == LatexModItems.DARKLATEXGOO
/* 25 */       .get())
/* 26 */     { TamableAnimal _tamEnt = (TamableAnimal)entity; if (((entity instanceof TamableAnimal) ? _tamEnt.isTame() : false) == true) {
/* 27 */         LivingEntity livingEntity1 = (LivingEntity)entity, livingEntity2 = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? livingEntity1.getHealth() : -1.0F) < ((entity instanceof LivingEntity) ? 
/* 28 */           livingEntity2.getMaxHealth() : 
/* 29 */           -1.0F)) {
/* 30 */           if (entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity;
/* 31 */             _entity.addEffect(new MobEffectInstance(MobEffects.HEAL, 1, 1, false, false)); }
/* 32 */            if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 33 */             _level.sendParticles((ParticleOptions)ParticleTypes.HAPPY_VILLAGER, x, y, z, 5, 1.0D, 2.0D, 1.0D, 1.0D); }
/* 34 */            if (entity instanceof Player) { Player _player = (Player)entity;
/* 35 */             ItemStack _stktoremove = new ItemStack((ItemLike)LatexModItems.DARKLATEXGOO.get());
/* 36 */             _player.getInventory().clearOrCountMatchingItems(p -> (_stktoremove.getItem() == p.getItem()), 1, (Container)_player.inventoryMenu
/* 37 */                 .getCraftSlots()); }
/*    */         
/*    */         } 
/*    */       }  }
/* 41 */     else { LivingEntity livingEntity = (LivingEntity)sourceentity; if (((sourceentity instanceof LivingEntity) ? livingEntity.getMainHandItem() : ItemStack.EMPTY).getItem() == LatexModItems.LATEX_SOUP
/* 42 */         .get())
/* 43 */       { TamableAnimal _tamEnt = (TamableAnimal)entity; if (((entity instanceof TamableAnimal) ? _tamEnt.isTame() : false) == true) {
/* 44 */           LivingEntity livingEntity1 = (LivingEntity)entity, livingEntity2 = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? livingEntity1.getHealth() : -1.0F) < ((entity instanceof LivingEntity) ? 
/* 45 */             livingEntity2.getMaxHealth() : 
/* 46 */             -1.0F)) {
/* 47 */             if (entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity;
/* 48 */               _entity.addEffect(new MobEffectInstance(MobEffects.HEAL, 1, 2, false, false)); }
/* 49 */              if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 50 */               _level.sendParticles((ParticleOptions)ParticleTypes.HAPPY_VILLAGER, x, y, z, 5, 1.0D, 2.0D, 1.0D, 1.0D); }
/* 51 */              if (entity instanceof Player) { Player _player = (Player)entity;
/* 52 */               ItemStack _stktoremove = new ItemStack((ItemLike)LatexModItems.LATEX_SOUP.get());
/* 53 */               _player.getInventory().clearOrCountMatchingItems(p -> (_stktoremove.getItem() == p.getItem()), 1, (Container)_player.inventoryMenu
/* 54 */                   .getCraftSlots()); }
/*    */           
/*    */           } 
/*    */         }  }
/* 58 */       else { LivingEntity livingEntity1 = (LivingEntity)sourceentity, livingEntity2 = (LivingEntity)sourceentity; if (((sourceentity instanceof LivingEntity) ? livingEntity1.getHealth() : -1.0F) < ((sourceentity instanceof LivingEntity) ? 
/* 59 */           livingEntity2.getMaxHealth() : 
/* 60 */           -1.0F))
/* 61 */         { TamableAnimal _tamEnt = (TamableAnimal)entity; if (((entity instanceof TamableAnimal) ? _tamEnt.isTame() : false) == true && 
/* 62 */             sourceentity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)sourceentity;
/* 63 */             _entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 100, 1, false, false)); }
/*    */            }
/* 65 */         else if (entity instanceof TamableAnimal) { TamableAnimal _tamIsTamedBy = (TamableAnimal)entity; if (sourceentity instanceof LivingEntity) { LivingEntity livingEntity3 = (LivingEntity)sourceentity; if (_tamIsTamedBy
/* 66 */               .isOwnedBy(livingEntity3)) {
/*    */               
/* 68 */               if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 69 */                 HertxSitEntity hertxSitEntity = new HertxSitEntity((EntityType)LatexModEntities.HERTX_SIT.get(), (Level)_level);
/* 70 */                 hertxSitEntity.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
/* 71 */                 hertxSitEntity.setYBodyRot(entity.getYRot());
/* 72 */                 hertxSitEntity.setYHeadRot(entity.getYRot());
/* 73 */                 if (hertxSitEntity instanceof Mob) { Mob _mobToSpawn = (Mob)hertxSitEntity;
/* 74 */                   _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(hertxSitEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*    */                 
/* 76 */                 world.addFreshEntity((Entity)hertxSitEntity); }
/*    */               
/* 78 */               if (!entity.level.isClientSide())
/* 79 */                 entity.discard(); 
/*    */             }  }
/*    */            }
/*    */          }
/*    */        }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\HertxRightClickedOnEntityProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */