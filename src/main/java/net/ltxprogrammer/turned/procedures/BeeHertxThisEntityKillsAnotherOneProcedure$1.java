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
/* 51 */   private int ticks = 0;
/*    */   private float waitTicks;
/*    */   private LevelAccessor world;
/*    */   
/*    */   public void start(LevelAccessor world, int waitTicks) {
/* 56 */     this.waitTicks = waitTicks;
/* 57 */     MinecraftForge.EVENT_BUS.register(this);
/* 58 */     this.world = world;
/*    */   }
/*    */   
/*    */   @SubscribeEvent
/*    */   public void tick(TickEvent.ServerTickEvent event) {
/* 63 */     if (event.phase == TickEvent.Phase.END) {
/* 64 */       this.ticks++;
/* 65 */       if (this.ticks >= this.waitTicks)
/* 66 */         run(); 
/*    */     } 
/*    */   }
/*    */   
/*    */   private void run() {
/* 71 */     LevelAccessor levelAccessor = this.world; if (levelAccessor instanceof Level) { Level _level = (Level)levelAccessor;
/* 72 */       if (!_level.m_5776_()) {
/* 73 */         _level.m_5594_(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/* 74 */             .getValue(new ResourceLocation("turned:robot_burp")), SoundSource.NEUTRAL, 1.0F, 2.0F);
/*    */       } else {
/* 76 */         _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:robot_burp")), SoundSource.NEUTRAL, 1.0F, 2.0F, false);
/*    */       }  }
/*    */ 
/*    */     
/* 80 */     levelAccessor = this.world; if (levelAccessor instanceof Level) { Level _level = (Level)levelAccessor; if (!_level.m_5776_()) {
/* 81 */         ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)ChangedItems.DARK_LATEX_GOO.get()));
/* 82 */         entityToSpawn.m_32010_(60);
/* 83 */         _level.m_7967_((Entity)entityToSpawn);
/*    */       }  }
/* 85 */      levelAccessor = this.world; if (levelAccessor instanceof Level) { Level _level = (Level)levelAccessor; if (!_level.m_5776_()) {
/* 86 */         ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.f_42787_));
/* 87 */         entityToSpawn.m_32010_(60);
/* 88 */         _level.m_7967_((Entity)entityToSpawn);
/*    */       }  }
/* 90 */      if (Math.random() < 0.1D) {
/* 91 */       levelAccessor = this.world; if (levelAccessor instanceof Level) { Level _level = (Level)levelAccessor; if (!_level.m_5776_()) {
/* 92 */           ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)LatexModItems.BROKENDLMASK.get()));
/* 93 */           entityToSpawn.m_32010_(60);
/* 94 */           _level.m_7967_((Entity)entityToSpawn);
/*    */         }  }
/*    */     
/* 97 */     }  MinecraftForge.EVENT_BUS.unregister(this);
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\BeeHertxThisEntityKillsAnotherOneProcedure$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */