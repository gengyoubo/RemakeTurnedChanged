/*     */ package net.ltxprogrammer.turned.procedures;
/*     */ 
/*     */ import net.ltxprogrammer.changed.init.ChangedItems;
/*     */ import net.ltxprogrammer.changed.init.ChangedSounds;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.sounds.SoundSource;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.item.ItemEntity;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.item.Items;
/*     */ import net.minecraft.world.level.ItemLike;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraftforge.common.MinecraftForge;
/*     */ import net.minecraftforge.event.TickEvent;
/*     */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class null
/*     */ {
/* 360 */   private int ticks = 0;
/*     */   private float waitTicks;
/*     */   private LevelAccessor world;
/*     */   
/*     */   public void start(LevelAccessor world, int waitTicks) {
/* 365 */     this.waitTicks = waitTicks;
/* 366 */     MinecraftForge.EVENT_BUS.register(this);
/* 367 */     this.world = world;
/*     */   }
/*     */   
/*     */   @SubscribeEvent
/*     */   public void tick(TickEvent.ServerTickEvent event) {
/* 372 */     if (event.phase == TickEvent.Phase.END) {
/* 373 */       this.ticks++;
/* 374 */       if (this.ticks >= this.waitTicks)
/* 375 */         run(); 
/*     */     } 
/*     */   }
/*     */   
/*     */   private void run() {
/* 380 */     LevelAccessor levelAccessor = this.world; if (levelAccessor instanceof Level) { Level _level = (Level)levelAccessor;
/* 381 */       if (!_level.m_5776_()) {
/* 382 */         _level.m_5594_(null, new BlockPos(x, y, z), ChangedSounds.POISON, SoundSource.BLOCKS, 1.0F, 3.0F);
/*     */       } else {
/*     */         
/* 385 */         _level.m_7785_(x, y, z, ChangedSounds.POISON, SoundSource.BLOCKS, 1.0F, 3.0F, false);
/*     */       }  }
/*     */ 
/*     */     
/* 389 */     levelAccessor = this.world; if (levelAccessor instanceof Level) { Level _level = (Level)levelAccessor; if (!_level.m_5776_()) {
/* 390 */         ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.f_42403_));
/* 391 */         entityToSpawn.m_32010_(10);
/* 392 */         _level.m_7967_((Entity)entityToSpawn);
/*     */       }  }
/* 394 */      if (Math.random() < 0.25D) {
/* 395 */       levelAccessor = this.world; if (levelAccessor instanceof Level) { Level _level = (Level)levelAccessor; if (!_level.m_5776_()) {
/* 396 */           ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)ChangedItems.DARK_LATEX_GOO.get()));
/* 397 */           entityToSpawn.m_32010_(10);
/* 398 */           _level.m_7967_((Entity)entityToSpawn);
/*     */         }  }
/* 400 */        if (Math.random() < 0.25D) {
/* 401 */         levelAccessor = this.world; if (levelAccessor instanceof Level) { Level _level = (Level)levelAccessor; if (!_level.m_5776_()) {
/* 402 */             ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)ChangedItems.DARK_LATEX_GOO.get()));
/* 403 */             entityToSpawn.m_32010_(10);
/* 404 */             _level.m_7967_((Entity)entityToSpawn);
/*     */           }  }
/*     */       
/*     */       } 
/* 408 */     }  if (Math.random() < 0.25D) {
/* 409 */       levelAccessor = this.world; if (levelAccessor instanceof Level) { Level _level = (Level)levelAccessor; if (!_level.m_5776_()) {
/* 410 */           ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.f_42403_));
/* 411 */           entityToSpawn.m_32010_(10);
/* 412 */           _level.m_7967_((Entity)entityToSpawn);
/*     */         }  }
/* 414 */        if (Math.random() < 0.25D) {
/* 415 */         levelAccessor = this.world; if (levelAccessor instanceof Level) { Level _level = (Level)levelAccessor; if (!_level.m_5776_()) {
/* 416 */             ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.f_42403_));
/* 417 */             entityToSpawn.m_32010_(10);
/* 418 */             _level.m_7967_((Entity)entityToSpawn);
/*     */           }  }
/*     */       
/*     */       } 
/* 422 */     }  MinecraftForge.EVENT_BUS.unregister(this);
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\DarkLatexCreeperEnhancedThisEntityKillsAnotherOneProcedure$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */