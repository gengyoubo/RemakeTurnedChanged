/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ 
/*    */ import net.ltxprogrammer.changed.init.ChangedItems;
/*    */ import net.ltxprogrammer.turned.init.LatexModItems;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.sounds.SoundEvent;
/*    */ import net.minecraft.sounds.SoundSource;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.item.ItemEntity;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.item.Items;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraftforge.common.MinecraftForge;
/*    */ import net.minecraftforge.event.TickEvent;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ import net.minecraftforge.registries.ForgeRegistries;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class null
/*    */ {
/* 43 */   private int ticks = 0;
/*    */   private float waitTicks;
/*    */   private LevelAccessor world;
/*    */   
/*    */   public void start(LevelAccessor world, int waitTicks) {
/* 48 */     this.waitTicks = waitTicks;
/* 49 */     MinecraftForge.EVENT_BUS.register(this);
/* 50 */     this.world = world;
/*    */   }
/*    */   
/*    */   @SubscribeEvent
/*    */   public void tick(TickEvent.ServerTickEvent event) {
/* 55 */     if (event.phase == TickEvent.Phase.END) {
/* 56 */       this.ticks++;
/* 57 */       if (this.ticks >= this.waitTicks)
/* 58 */         run(); 
/*    */     } 
/*    */   }
/*    */   
/*    */   private void run() {
/* 63 */     LevelAccessor levelAccessor = this.world; if (levelAccessor instanceof Level) { Level _level = (Level)levelAccessor;
/* 64 */       if (!_level.m_5776_()) {
/* 65 */         _level.m_5594_(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/* 66 */             .getValue(new ResourceLocation("turned:robot_burp")), SoundSource.NEUTRAL, 1.0F, 1.0F);
/*    */       } else {
/* 68 */         _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:robot_burp")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*    */       }  }
/*    */ 
/*    */     
/* 72 */     levelAccessor = this.world; if (levelAccessor instanceof Level) { Level _level = (Level)levelAccessor; if (!_level.m_5776_()) {
/* 73 */         ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)ChangedItems.DARK_LATEX_GOO.get()));
/* 74 */         entityToSpawn.m_32010_(60);
/* 75 */         _level.m_7967_((Entity)entityToSpawn);
/*    */       }  }
/* 77 */      if (Math.random() < 0.1D) {
/* 78 */       levelAccessor = this.world; if (levelAccessor instanceof Level) { Level _level = (Level)levelAccessor; if (!_level.m_5776_()) {
/* 79 */           ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)LatexModItems.BROKENDLMASK.get()));
/* 80 */           entityToSpawn.m_32010_(60);
/* 81 */           _level.m_7967_((Entity)entityToSpawn);
/*    */         }  }
/*    */     
/* 84 */     }  if (Math.random() < 0.1D) {
/* 85 */       levelAccessor = this.world; if (levelAccessor instanceof Level) { Level _level = (Level)levelAccessor; if (!_level.m_5776_()) {
/* 86 */           ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.f_42749_));
/* 87 */           entityToSpawn.m_32010_(60);
/* 88 */           _level.m_7967_((Entity)entityToSpawn);
/*    */         }  }
/* 90 */        levelAccessor = this.world; if (levelAccessor instanceof Level) { Level _level = (Level)levelAccessor; if (!_level.m_5776_()) {
/* 91 */           ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.f_42749_));
/* 92 */           entityToSpawn.m_32010_(60);
/* 93 */           _level.m_7967_((Entity)entityToSpawn);
/*    */         }  }
/*    */     
/* 96 */     }  MinecraftForge.EVENT_BUS.unregister(this);
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\DroneHertxKillsEntityProcedure$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */