/*    */ package net.mcreator.latexes.procedures;
/*    */ import net.mcreator.latexes.entity.SlimelingtamedsitEntity;
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
/*    */ import net.minecraft.world.item.Items;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class SlimelingTamedRightClickedOnEntityProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
/* 23 */     if (entity == null || sourceentity == null)
/*    */       return; 
/* 25 */     LivingEntity _livEnt = (LivingEntity)sourceentity; if (((sourceentity instanceof LivingEntity) ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == LatexModItems.DARKLATEXGOO
/* 26 */       .get())
/* 27 */     { TamableAnimal _tamEnt = (TamableAnimal)entity; if (((entity instanceof TamableAnimal) ? _tamEnt.isTame() : false) == true) {
/* 28 */         LivingEntity livingEntity1 = (LivingEntity)entity, livingEntity2 = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? livingEntity1.getHealth() : -1.0F) < ((entity instanceof LivingEntity) ? 
/* 29 */           livingEntity2.getMaxHealth() : 
/* 30 */           -1.0F)) {
/* 31 */           if (entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity;
/* 32 */             _entity.addEffect(new MobEffectInstance(MobEffects.HEAL, 1, 1, false, false)); }
/* 33 */            if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 34 */             _level.sendParticles((ParticleOptions)ParticleTypes.HAPPY_VILLAGER, x, y, z, 5, 1.0D, 2.0D, 1.0D, 1.0D); }
/* 35 */            if (entity instanceof Player) { Player _player = (Player)entity;
/* 36 */             ItemStack _stktoremove = new ItemStack((ItemLike)LatexModItems.DARKLATEXGOO.get());
/* 37 */             _player.getInventory().clearOrCountMatchingItems(p -> (_stktoremove.getItem() == p.getItem()), 1, (Container)_player.inventoryMenu
/* 38 */                 .getCraftSlots()); }
/*    */         
/*    */         } 
/*    */       }  }
/* 42 */     else { LivingEntity livingEntity = (LivingEntity)sourceentity; if (((sourceentity instanceof LivingEntity) ? livingEntity.getMainHandItem() : ItemStack.EMPTY).getItem() == LatexModItems.LATEX_SOUP
/* 43 */         .get())
/* 44 */       { TamableAnimal _tamEnt = (TamableAnimal)entity; if (((entity instanceof TamableAnimal) ? _tamEnt.isTame() : false) == true) {
/* 45 */           LivingEntity livingEntity1 = (LivingEntity)entity, livingEntity2 = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? livingEntity1.getHealth() : -1.0F) < ((entity instanceof LivingEntity) ? 
/* 46 */             livingEntity2.getMaxHealth() : 
/* 47 */             -1.0F)) {
/* 48 */             if (entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity;
/* 49 */               _entity.addEffect(new MobEffectInstance(MobEffects.HEAL, 1, 2, false, false)); }
/* 50 */              if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 51 */               _level.sendParticles((ParticleOptions)ParticleTypes.HAPPY_VILLAGER, x, y, z, 5, 1.0D, 2.0D, 1.0D, 1.0D); }
/* 52 */              if (entity instanceof Player) { Player _player = (Player)entity;
/* 53 */               ItemStack _stktoremove = new ItemStack((ItemLike)LatexModItems.LATEX_SOUP.get());
/* 54 */               _player.getInventory().clearOrCountMatchingItems(p -> (_stktoremove.getItem() == p.getItem()), 1, (Container)_player.inventoryMenu
/* 55 */                   .getCraftSlots()); }
/*    */           
/*    */           } 
/*    */         }  }
/* 59 */       else { LivingEntity livingEntity1 = (LivingEntity)sourceentity; if (((sourceentity instanceof LivingEntity) ? livingEntity1.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.SLIME_BALL)
/* 60 */         { TamableAnimal _tamEnt = (TamableAnimal)entity; if (((entity instanceof TamableAnimal) ? _tamEnt.isTame() : false) == true) {
/* 61 */             LivingEntity livingEntity2 = (LivingEntity)entity, livingEntity3 = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? livingEntity2.getHealth() : -1.0F) < ((entity instanceof LivingEntity) ? 
/* 62 */               livingEntity3.getMaxHealth() : 
/* 63 */               -1.0F)) {
/* 64 */               if (entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity;
/* 65 */                 _entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 120, 1, false, false)); }
/* 66 */                if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 67 */                 _level.sendParticles((ParticleOptions)ParticleTypes.HAPPY_VILLAGER, x, y, z, 5, 1.0D, 2.0D, 1.0D, 1.0D); }
/* 68 */                if (entity instanceof Player) { Player _player = (Player)entity;
/* 69 */                 ItemStack _stktoremove = new ItemStack((ItemLike)Items.SLIME_BALL);
/* 70 */                 _player.getInventory().clearOrCountMatchingItems(p -> (_stktoremove.getItem() == p.getItem()), 1, (Container)_player.inventoryMenu
/* 71 */                     .getCraftSlots()); }
/*    */             
/*    */             } 
/*    */           }  }
/* 75 */         else if (entity instanceof TamableAnimal) { TamableAnimal _tamIsTamedBy = (TamableAnimal)entity; if (sourceentity instanceof LivingEntity) { LivingEntity livingEntity2 = (LivingEntity)sourceentity; if (_tamIsTamedBy
/* 76 */               .isOwnedBy(livingEntity2)) {
/*    */               
/* 78 */               if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 79 */                 SlimelingtamedsitEntity slimelingtamedsitEntity = new SlimelingtamedsitEntity((EntityType)LatexModEntities.SLIMELINGTAMEDSIT.get(), (Level)_level);
/* 80 */                 slimelingtamedsitEntity.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
/* 81 */                 slimelingtamedsitEntity.setYBodyRot(entity.getYRot());
/* 82 */                 slimelingtamedsitEntity.setYHeadRot(entity.getYRot());
/* 83 */                 if (slimelingtamedsitEntity instanceof Mob) { Mob _mobToSpawn = (Mob)slimelingtamedsitEntity;
/* 84 */                   _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(slimelingtamedsitEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*    */                 
/* 86 */                 world.addFreshEntity((Entity)slimelingtamedsitEntity); }
/*    */               
/* 88 */               if (!entity.level.isClientSide())
/* 89 */                 entity.discard(); 
/*    */             }  }
/*    */            }
/*    */          }
/*    */        }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\SlimelingTamedRightClickedOnEntityProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */