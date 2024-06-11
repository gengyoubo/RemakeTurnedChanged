/*     */ package net.ltxprogrammer.turned.procedures;
/*     */ 
/*     */ import net.ltxprogrammer.changed.init.ChangedItems;
/*     */ import net.ltxprogrammer.turned.init.LatexModItems;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class null
/*     */ {
/* 114 */   private int ticks = 0;
/*     */   private float waitTicks;
/*     */   private LevelAccessor world;
/*     */   
/*     */   public void start(LevelAccessor world, int waitTicks) {
/* 119 */     this.waitTicks = waitTicks;
/* 120 */     MinecraftForge.EVENT_BUS.register(this);
/* 121 */     this.world = world;
/*     */   }
/*     */   
/*     */   @SubscribeEvent
/*     */   public void tick(TickEvent.ServerTickEvent event) {
/* 126 */     if (event.phase == TickEvent.Phase.END) {
/* 127 */       this.ticks++;
/* 128 */       if (this.ticks >= this.waitTicks)
/* 129 */         run(); 
/*     */     } 
/*     */   }
/*     */   
/*     */   private void run() {
/* 134 */     LevelAccessor levelAccessor = this.world; if (levelAccessor instanceof Level) { Level _level = (Level)levelAccessor;
/* 135 */       if (!_level.m_5776_()) {
/* 136 */         _level.m_5594_(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/* 137 */             .getValue(new ResourceLocation("turned:robot_burp")), SoundSource.NEUTRAL, 1.0F, 1.0F);
/*     */       } else {
/* 139 */         _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:robot_burp")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*     */       }  }
/*     */ 
/*     */     
/* 143 */     levelAccessor = this.world; if (levelAccessor instanceof Level) { Level _level = (Level)levelAccessor; if (!_level.m_5776_()) {
/* 144 */         ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.f_42500_));
/* 145 */         entityToSpawn.m_32010_(60);
/* 146 */         _level.m_7967_((Entity)entityToSpawn);
/*     */       }  }
/* 148 */      levelAccessor = this.world; if (levelAccessor instanceof Level) { Level _level = (Level)levelAccessor; if (!_level.m_5776_()) {
/* 149 */         ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)ChangedItems.DARK_LATEX_GOO.get()));
/* 150 */         entityToSpawn.m_32010_(60);
/* 151 */         _level.m_7967_((Entity)entityToSpawn);
/*     */       }  }
/* 153 */      if (Math.random() < 0.1D) {
/* 154 */       levelAccessor = this.world; if (levelAccessor instanceof Level) { Level _level = (Level)levelAccessor; if (!_level.m_5776_()) {
/* 155 */           ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)LatexModItems.BROKENDLMASK.get()));
/* 156 */           entityToSpawn.m_32010_(60);
/* 157 */           _level.m_7967_((Entity)entityToSpawn);
/*     */         }  }
/*     */     
/* 160 */     }  if (Math.random() < 0.1D) {
/* 161 */       levelAccessor = this.world; if (levelAccessor instanceof Level) { Level _level = (Level)levelAccessor; if (!_level.m_5776_()) {
/* 162 */           ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.f_42749_));
/* 163 */           entityToSpawn.m_32010_(60);
/* 164 */           _level.m_7967_((Entity)entityToSpawn);
/*     */         }  }
/* 166 */        levelAccessor = this.world; if (levelAccessor instanceof Level) { Level _level = (Level)levelAccessor; if (!_level.m_5776_()) {
/* 167 */           ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.f_42749_));
/* 168 */           entityToSpawn.m_32010_(60);
/* 169 */           _level.m_7967_((Entity)entityToSpawn);
/*     */         }  }
/*     */     
/* 172 */     }  MinecraftForge.EVENT_BUS.unregister(this);
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\DroneHertxKillsEntityProcedure$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */