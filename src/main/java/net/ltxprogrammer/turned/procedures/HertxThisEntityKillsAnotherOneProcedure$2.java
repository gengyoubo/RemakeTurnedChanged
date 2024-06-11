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
/*     */ class null
/*     */ {
/* 102 */   private int ticks = 0;
/*     */   private float waitTicks;
/*     */   private LevelAccessor world;
/*     */   
/*     */   public void start(LevelAccessor world, int waitTicks) {
/* 107 */     this.waitTicks = waitTicks;
/* 108 */     MinecraftForge.EVENT_BUS.register(this);
/* 109 */     this.world = world;
/*     */   }
/*     */   
/*     */   @SubscribeEvent
/*     */   public void tick(TickEvent.ServerTickEvent event) {
/* 114 */     if (event.phase == TickEvent.Phase.END) {
/* 115 */       this.ticks++;
/* 116 */       if (this.ticks >= this.waitTicks)
/* 117 */         run(); 
/*     */     } 
/*     */   }
/*     */   
/*     */   private void run() {
/* 122 */     LevelAccessor levelAccessor = this.world; if (levelAccessor instanceof Level) { Level _level = (Level)levelAccessor;
/* 123 */       if (!_level.m_5776_()) {
/* 124 */         _level.m_5594_(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/* 125 */             .getValue(new ResourceLocation("turned:robot_burp")), SoundSource.NEUTRAL, 1.0F, 1.0F);
/*     */       } else {
/* 127 */         _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:robot_burp")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*     */       }  }
/*     */ 
/*     */     
/* 131 */     levelAccessor = this.world; if (levelAccessor instanceof Level) { Level _level = (Level)levelAccessor; if (!_level.m_5776_()) {
/* 132 */         ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.f_42500_));
/* 133 */         entityToSpawn.m_32010_(60);
/* 134 */         _level.m_7967_((Entity)entityToSpawn);
/*     */       }  }
/* 136 */      levelAccessor = this.world; if (levelAccessor instanceof Level) { Level _level = (Level)levelAccessor; if (!_level.m_5776_()) {
/* 137 */         ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)ChangedItems.DARK_LATEX_GOO.get()));
/* 138 */         entityToSpawn.m_32010_(60);
/* 139 */         _level.m_7967_((Entity)entityToSpawn);
/*     */       }  }
/* 141 */      if (Math.random() < 0.1D) {
/* 142 */       levelAccessor = this.world; if (levelAccessor instanceof Level) { Level _level = (Level)levelAccessor; if (!_level.m_5776_()) {
/* 143 */           ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)LatexModItems.BROKENDLMASK.get()));
/* 144 */           entityToSpawn.m_32010_(60);
/* 145 */           _level.m_7967_((Entity)entityToSpawn);
/*     */         }  }
/*     */     
/* 148 */     }  MinecraftForge.EVENT_BUS.unregister(this);
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\HertxThisEntityKillsAnotherOneProcedure$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */