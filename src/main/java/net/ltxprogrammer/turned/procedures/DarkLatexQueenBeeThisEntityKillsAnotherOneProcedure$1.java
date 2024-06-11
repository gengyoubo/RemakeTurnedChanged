/*     */ package net.ltxprogrammer.turned.procedures;
/*     */ 
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.sounds.SoundEvent;
/*     */ import net.minecraft.sounds.SoundSource;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.item.ItemEntity;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.item.Items;
/*     */ import net.minecraft.world.level.ItemLike;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.block.Blocks;
/*     */ import net.minecraftforge.common.MinecraftForge;
/*     */ import net.minecraftforge.event.TickEvent;
/*     */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/* 108 */   private int ticks = 0;
/*     */   private float waitTicks;
/*     */   private LevelAccessor world;
/*     */   
/*     */   public void start(LevelAccessor world, int waitTicks) {
/* 113 */     this.waitTicks = waitTicks;
/* 114 */     MinecraftForge.EVENT_BUS.register(this);
/* 115 */     this.world = world;
/*     */   }
/*     */   
/*     */   @SubscribeEvent
/*     */   public void tick(TickEvent.ServerTickEvent event) {
/* 120 */     if (event.phase == TickEvent.Phase.END) {
/* 121 */       this.ticks++;
/* 122 */       if (this.ticks >= this.waitTicks)
/* 123 */         run(); 
/*     */     } 
/*     */   }
/*     */   
/*     */   private void run() {
/* 128 */     LevelAccessor levelAccessor = this.world; if (levelAccessor instanceof Level) { Level _level = (Level)levelAccessor;
/* 129 */       if (!_level.m_5776_()) {
/* 130 */         _level.m_5594_(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/* 131 */             .getValue(new ResourceLocation("turned:burp")), SoundSource.NEUTRAL, 1.0F, 2.0F);
/*     */       } else {
/* 133 */         _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:burp")), SoundSource.NEUTRAL, 1.0F, 2.0F, false);
/*     */       }  }
/*     */ 
/*     */     
/* 137 */     levelAccessor = this.world; if (levelAccessor instanceof Level) { Level _level = (Level)levelAccessor; if (!_level.m_5776_()) {
/* 138 */         ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.f_42787_));
/* 139 */         entityToSpawn.m_32010_(5);
/* 140 */         entityToSpawn.m_149678_();
/* 141 */         _level.m_7967_((Entity)entityToSpawn);
/*     */       }  }
/* 143 */      if (Math.random() < 0.7D) {
/* 144 */       levelAccessor = this.world; if (levelAccessor instanceof Level) { Level _level = (Level)levelAccessor; if (!_level.m_5776_()) {
/* 145 */           ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.f_42787_));
/* 146 */           entityToSpawn.m_32010_(5);
/* 147 */           entityToSpawn.m_149678_();
/* 148 */           _level.m_7967_((Entity)entityToSpawn);
/*     */         }  }
/* 150 */        if (Math.random() < 0.3D) {
/* 151 */         levelAccessor = this.world; if (levelAccessor instanceof Level) { Level _level = (Level)levelAccessor; if (!_level.m_5776_()) {
/* 152 */             ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.f_42787_));
/* 153 */             entityToSpawn.m_32010_(5);
/* 154 */             entityToSpawn.m_149678_();
/* 155 */             _level.m_7967_((Entity)entityToSpawn);
/*     */           }  }
/* 157 */          if (Math.random() < 0.1D) {
/* 158 */           levelAccessor = this.world; if (levelAccessor instanceof Level) { Level _level = (Level)levelAccessor; if (!_level.m_5776_()) {
/* 159 */               ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.f_42787_));
/* 160 */               entityToSpawn.m_32010_(5);
/* 161 */               entityToSpawn.m_149678_();
/* 162 */               _level.m_7967_((Entity)entityToSpawn);
/*     */             }  }
/*     */         
/*     */         } 
/*     */       } 
/* 167 */     }  if (Math.random() < 0.1D) {
/* 168 */       levelAccessor = this.world; if (levelAccessor instanceof Level) { Level _level = (Level)levelAccessor; if (!_level.m_5776_()) {
/* 169 */           ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Blocks.f_50719_));
/* 170 */           entityToSpawn.m_32010_(5);
/* 171 */           entityToSpawn.m_149678_();
/* 172 */           _level.m_7967_((Entity)entityToSpawn);
/*     */         }  }
/*     */     
/* 175 */     }  levelAccessor = this.world; if (levelAccessor instanceof Level) { Level _level = (Level)levelAccessor; if (!_level.m_5776_()) {
/* 176 */         ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.f_42500_));
/* 177 */         entityToSpawn.m_32010_(5);
/* 178 */         entityToSpawn.m_149678_();
/* 179 */         _level.m_7967_((Entity)entityToSpawn);
/*     */       }  }
/* 181 */      MinecraftForge.EVENT_BUS.unregister(this);
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\DarkLatexQueenBeeThisEntityKillsAnotherOneProcedure$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */