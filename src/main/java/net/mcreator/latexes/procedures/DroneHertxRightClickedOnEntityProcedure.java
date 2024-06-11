/*    */ package net.mcreator.latexes.procedures;
/*    */ import net.mcreator.latexes.entity.DroneHertxWaitEntity;
/*    */ import net.minecraft.core.particles.ParticleOptions;
/*    */ import net.minecraft.core.particles.ParticleTypes;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.Container;
/*    */ import net.minecraft.world.effect.MobEffectInstance;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.entity.Mob;
/*    */ import net.minecraft.world.entity.MobSpawnType;
/*    */ import net.minecraft.world.entity.TamableAnimal;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.item.Items;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class DroneHertxRightClickedOnEntityProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
/* 22 */     if (entity == null || sourceentity == null)
/*    */       return; 
/* 24 */     LivingEntity _livEnt = (LivingEntity)sourceentity; if (((sourceentity instanceof LivingEntity) ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.IRON_INGOT)
/* 25 */     { TamableAnimal _tamEnt = (TamableAnimal)entity; if (((entity instanceof TamableAnimal) ? _tamEnt.isTame() : false) == true) {
/* 26 */         LivingEntity livingEntity1 = (LivingEntity)entity, livingEntity2 = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? livingEntity1.getHealth() : -1.0F) < ((entity instanceof LivingEntity) ? 
/* 27 */           livingEntity2.getMaxHealth() : 
/* 28 */           -1.0F)) {
/* 29 */           if (entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity;
/* 30 */             _entity.addEffect(new MobEffectInstance(MobEffects.HEAL, 1, 1, false, false)); }
/* 31 */            if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 32 */             _level.sendParticles((ParticleOptions)ParticleTypes.HAPPY_VILLAGER, x, y, z, 5, 1.0D, 2.0D, 1.0D, 1.0D); }
/* 33 */            if (entity instanceof Player) { Player _player = (Player)entity;
/* 34 */             ItemStack _stktoremove = new ItemStack((ItemLike)Items.IRON_INGOT);
/* 35 */             _player.getInventory().clearOrCountMatchingItems(p -> (_stktoremove.getItem() == p.getItem()), 1, (Container)_player.inventoryMenu
/* 36 */                 .getCraftSlots()); }
/*    */         
/*    */         } 
/*    */       }  }
/* 40 */     else if (entity instanceof TamableAnimal) { TamableAnimal _tamIsTamedBy = (TamableAnimal)entity; if (sourceentity instanceof LivingEntity) { LivingEntity livingEntity = (LivingEntity)sourceentity; if (_tamIsTamedBy
/* 41 */           .isOwnedBy(livingEntity)) {
/*    */           
/* 43 */           if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 44 */             DroneHertxWaitEntity droneHertxWaitEntity = new DroneHertxWaitEntity((EntityType)LatexModEntities.DRONE_HERTX_WAIT.get(), (Level)_level);
/* 45 */             droneHertxWaitEntity.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
/* 46 */             droneHertxWaitEntity.setYBodyRot(entity.getYRot());
/* 47 */             droneHertxWaitEntity.setYHeadRot(entity.getYRot());
/* 48 */             if (droneHertxWaitEntity instanceof Mob) { Mob _mobToSpawn = (Mob)droneHertxWaitEntity;
/* 49 */               _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(droneHertxWaitEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*    */             
/* 51 */             world.addFreshEntity((Entity)droneHertxWaitEntity); }
/*    */           
/* 53 */           if (!entity.level.isClientSide())
/* 54 */             entity.discard(); 
/*    */         }  }
/*    */        }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\DroneHertxRightClickedOnEntityProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */