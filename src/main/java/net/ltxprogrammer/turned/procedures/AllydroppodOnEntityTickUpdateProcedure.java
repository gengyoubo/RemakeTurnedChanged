/*     */ package net.ltxprogrammer.turned.procedures;
/*     */ import net.ltxprogrammer.turned.entity.AHVHertxEntity;
/*     */ import net.ltxprogrammer.turned.entity.AshburyHertxEntity;
/*     */ import net.ltxprogrammer.turned.entity.BeeHertxEntity;
/*     */ import net.ltxprogrammer.turned.entity.HertxEntity;
/*     */ import net.ltxprogrammer.turned.entity.HertxvarFBEntity;
/*     */ import net.ltxprogrammer.turned.entity.HertxvarFEntity;
/*     */ import net.ltxprogrammer.turned.entity.HertxvarSolEntity;
/*     */ import net.ltxprogrammer.turned.entity.MilitaryEntity;
/*     */ import net.ltxprogrammer.turned.entity.NXTHertxEntity;
/*     */ import net.ltxprogrammer.turned.entity.ScientistEntity;
/*     */ import net.ltxprogrammer.turned.init.LatexModEntities;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.core.particles.ParticleOptions;
/*     */ import net.minecraft.core.particles.ParticleTypes;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.sounds.SoundEvent;
/*     */ import net.minecraft.sounds.SoundSource;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.Mob;
/*     */ import net.minecraft.world.entity.MobSpawnType;
/*     */ import net.minecraft.world.entity.animal.IronGolem;
/*     */ import net.minecraft.world.entity.npc.Villager;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.ServerLevelAccessor;
/*     */ import net.minecraft.world.level.block.Block;
/*     */ import net.minecraft.world.level.block.Blocks;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ public class AllydroppodOnEntityTickUpdateProcedure {
/*     */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/*  35 */     if (entity == null)
/*     */       return; 
/*  37 */     if (((world.m_8055_(new BlockPos(x, y - 1.0D, z)).m_60734_() == Blocks.f_50627_ || world
/*  38 */       .m_8055_(new BlockPos(x, y - 1.0D, z)).m_60734_() == Blocks.f_50626_ || world
/*  39 */       .m_8055_(new BlockPos(x, y - 1.0D, z)).m_60734_() == Blocks.f_50016_ || world
/*  40 */       .m_8055_(new BlockPos(x + 1.0D, y - 1.0D, z)).m_60734_() == Blocks.f_50627_ || world
/*  41 */       .m_8055_(new BlockPos(x + 1.0D, y - 1.0D, z)).m_60734_() == Blocks.f_50626_ || world
/*  42 */       .m_8055_(new BlockPos(x + 1.0D, y - 1.0D, z)).m_60734_() == Blocks.f_50016_ || world
/*  43 */       .m_8055_(new BlockPos(x - 1.0D, y - 1.0D, z)).m_60734_() == Blocks.f_50627_ || world
/*  44 */       .m_8055_(new BlockPos(x - 1.0D, y - 1.0D, z)).m_60734_() == Blocks.f_50626_ || world
/*  45 */       .m_8055_(new BlockPos(x - 1.0D, y - 1.0D, z)).m_60734_() == Blocks.f_50016_ || world
/*  46 */       .m_8055_(new BlockPos(x, y - 1.0D, z + 1.0D)).m_60734_() == Blocks.f_50627_ || world
/*  47 */       .m_8055_(new BlockPos(x, y - 1.0D, z + 1.0D)).m_60734_() == Blocks.f_50626_ || world
/*  48 */       .m_8055_(new BlockPos(x, y - 1.0D, z + 1.0D)).m_60734_() == Blocks.f_50016_ || world
/*  49 */       .m_8055_(new BlockPos(x, y - 1.0D, z - 1.0D)).m_60734_() == Blocks.f_50627_ || world
/*  50 */       .m_8055_(new BlockPos(x, y - 1.0D, z - 1.0D)).m_60734_() == Blocks.f_50626_ || world
/*  51 */       .m_8055_(new BlockPos(x, y - 1.0D, z - 1.0D)).m_60734_() == Blocks.f_50016_) ? true : false) != true) {
/*  52 */       if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  53 */         _level.m_8767_((ParticleOptions)ParticleTypes.f_123769_, x, y, z, 5, 3.0D, 3.0D, 3.0D, 1.0D); }
/*  54 */        if (world instanceof Level) { Level _level = (Level)world;
/*  55 */         if (!_level.m_5776_()) {
/*  56 */           _level.m_5594_(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/*  57 */               .getValue(new ResourceLocation("entity.experience_orb.pickup")), SoundSource.BLOCKS, 1.0F, 1.0F);
/*     */         } else {
/*  59 */           _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.experience_orb.pickup")), SoundSource.BLOCKS, 1.0F, 1.0F, false);
/*     */         }  }
/*     */ 
/*     */       
/*  63 */       if (Math.random() < 0.7D)
/*  64 */       { world.m_7731_(new BlockPos(x, y, z), ((Block)LatexModBlocks.SUPPLY_CRATE.get()).m_49966_(), 3); }
/*     */       
/*  66 */       else if (Math.random() < 0.2D)
/*  67 */       { if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  68 */           Villager villager = new Villager(EntityType.f_20492_, (Level)_level);
/*  69 */           villager.m_7678_(x, y, z, 0.0F, 0.0F);
/*  70 */           villager.m_5618_(0.0F);
/*  71 */           villager.m_5616_(0.0F);
/*  72 */           if (villager instanceof Mob) { Mob _mobToSpawn = (Mob)villager;
/*  73 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(villager.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/*  75 */           world.m_7967_((Entity)villager); }
/*     */         
/*  77 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  78 */           IronGolem ironGolem = new IronGolem(EntityType.f_20460_, (Level)_level);
/*  79 */           ironGolem.m_7678_(x, y, z, 0.0F, 0.0F);
/*  80 */           ironGolem.m_5618_(0.0F);
/*  81 */           ironGolem.m_5616_(0.0F);
/*  82 */           if (ironGolem instanceof Mob) { Mob _mobToSpawn = (Mob)ironGolem;
/*  83 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(ironGolem.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/*  85 */           world.m_7967_((Entity)ironGolem); }
/*     */         
/*  87 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  88 */           Villager villager = new Villager(EntityType.f_20492_, (Level)_level);
/*  89 */           villager.m_7678_(x, y, z, 0.0F, 0.0F);
/*  90 */           villager.m_5618_(0.0F);
/*  91 */           villager.m_5616_(0.0F);
/*  92 */           if (villager instanceof Mob) { Mob _mobToSpawn = (Mob)villager;
/*  93 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(villager.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/*  95 */           world.m_7967_((Entity)villager); }
/*     */         
/*  97 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  98 */           Villager villager = new Villager(EntityType.f_20492_, (Level)_level);
/*  99 */           villager.m_7678_(x, y, z, 0.0F, 0.0F);
/* 100 */           villager.m_5618_(0.0F);
/* 101 */           villager.m_5616_(0.0F);
/* 102 */           if (villager instanceof Mob) { Mob _mobToSpawn = (Mob)villager;
/* 103 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(villager.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 105 */           world.m_7967_((Entity)villager); }
/*     */          }
/* 107 */       else if (Math.random() < 0.2D)
/* 108 */       { if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 109 */           Villager villager = new Villager(EntityType.f_20492_, (Level)_level);
/* 110 */           villager.m_7678_(x, y, z, 0.0F, 0.0F);
/* 111 */           villager.m_5618_(0.0F);
/* 112 */           villager.m_5616_(0.0F);
/* 113 */           if (villager instanceof Mob) { Mob _mobToSpawn = (Mob)villager;
/* 114 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(villager.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 116 */           world.m_7967_((Entity)villager); }
/*     */         
/* 118 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 119 */           Villager villager = new Villager(EntityType.f_20492_, (Level)_level);
/* 120 */           villager.m_7678_(x, y, z, 0.0F, 0.0F);
/* 121 */           villager.m_5618_(0.0F);
/* 122 */           villager.m_5616_(0.0F);
/* 123 */           if (villager instanceof Mob) { Mob _mobToSpawn = (Mob)villager;
/* 124 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(villager.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 126 */           world.m_7967_((Entity)villager); }
/*     */         
/* 128 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 129 */           Villager villager = new Villager(EntityType.f_20492_, (Level)_level);
/* 130 */           villager.m_7678_(x, y, z, 0.0F, 0.0F);
/* 131 */           villager.m_5618_(0.0F);
/* 132 */           villager.m_5616_(0.0F);
/* 133 */           if (villager instanceof Mob) { Mob _mobToSpawn = (Mob)villager;
/* 134 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(villager.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 136 */           world.m_7967_((Entity)villager); }
/*     */         
/* 138 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 139 */           MilitaryEntity militaryEntity = new MilitaryEntity((EntityType)LatexModEntities.MILITARY.get(), (Level)_level);
/* 140 */           militaryEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 141 */           militaryEntity.m_5618_(0.0F);
/* 142 */           militaryEntity.m_5616_(0.0F);
/* 143 */           if (militaryEntity instanceof Mob) { Mob _mobToSpawn = (Mob)militaryEntity;
/* 144 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(militaryEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 146 */           world.m_7967_((Entity)militaryEntity); }
/*     */          }
/* 148 */       else if (Math.random() < 0.2D)
/* 149 */       { if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 150 */           MilitaryEntity militaryEntity = new MilitaryEntity((EntityType)LatexModEntities.MILITARY.get(), (Level)_level);
/* 151 */           militaryEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 152 */           militaryEntity.m_5618_(0.0F);
/* 153 */           militaryEntity.m_5616_(0.0F);
/* 154 */           if (militaryEntity instanceof Mob) { Mob _mobToSpawn = (Mob)militaryEntity;
/* 155 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(militaryEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 157 */           world.m_7967_((Entity)militaryEntity); }
/*     */         
/* 159 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 160 */           ScientistEntity scientistEntity = new ScientistEntity((EntityType)LatexModEntities.SCIENTIST.get(), (Level)_level);
/* 161 */           scientistEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 162 */           scientistEntity.m_5618_(0.0F);
/* 163 */           scientistEntity.m_5616_(0.0F);
/* 164 */           if (scientistEntity instanceof Mob) { Mob _mobToSpawn = (Mob)scientistEntity;
/* 165 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(scientistEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 167 */           world.m_7967_((Entity)scientistEntity); }
/*     */         
/* 169 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 170 */           ScientistEntity scientistEntity = new ScientistEntity((EntityType)LatexModEntities.SCIENTIST.get(), (Level)_level);
/* 171 */           scientistEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 172 */           scientistEntity.m_5618_(0.0F);
/* 173 */           scientistEntity.m_5616_(0.0F);
/* 174 */           if (scientistEntity instanceof Mob) { Mob _mobToSpawn = (Mob)scientistEntity;
/* 175 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(scientistEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 177 */           world.m_7967_((Entity)scientistEntity); }
/*     */          }
/* 179 */       else if (Math.random() < 0.2D)
/* 180 */       { if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 181 */           ScientistEntity scientistEntity = new ScientistEntity((EntityType)LatexModEntities.SCIENTIST.get(), (Level)_level);
/* 182 */           scientistEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 183 */           scientistEntity.m_5618_(0.0F);
/* 184 */           scientistEntity.m_5616_(0.0F);
/* 185 */           if (scientistEntity instanceof Mob) { Mob _mobToSpawn = (Mob)scientistEntity;
/* 186 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(scientistEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 188 */           world.m_7967_((Entity)scientistEntity); }
/*     */         
/* 190 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 191 */           ScientistEntity scientistEntity = new ScientistEntity((EntityType)LatexModEntities.SCIENTIST.get(), (Level)_level);
/* 192 */           scientistEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 193 */           scientistEntity.m_5618_(0.0F);
/* 194 */           scientistEntity.m_5616_(0.0F);
/* 195 */           if (scientistEntity instanceof Mob) { Mob _mobToSpawn = (Mob)scientistEntity;
/* 196 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(scientistEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 198 */           world.m_7967_((Entity)scientistEntity); }
/*     */         
/* 200 */         if (Math.random() < 0.05D)
/* 201 */         { if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 202 */             AHVHertxEntity aHVHertxEntity = new AHVHertxEntity((EntityType)LatexModEntities.AHV_HERTX.get(), (Level)_level);
/* 203 */             aHVHertxEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 204 */             aHVHertxEntity.m_5618_(0.0F);
/* 205 */             aHVHertxEntity.m_5616_(0.0F);
/* 206 */             if (aHVHertxEntity instanceof Mob) { Mob _mobToSpawn = (Mob)aHVHertxEntity;
/* 207 */               _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(aHVHertxEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */             
/* 209 */             world.m_7967_((Entity)aHVHertxEntity); }
/*     */            }
/* 211 */         else if (Math.random() < 0.05D)
/* 212 */         { if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 213 */             NXTHertxEntity nXTHertxEntity = new NXTHertxEntity((EntityType)LatexModEntities.NXT_HERTX.get(), (Level)_level);
/* 214 */             nXTHertxEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 215 */             nXTHertxEntity.m_5618_(0.0F);
/* 216 */             nXTHertxEntity.m_5616_(0.0F);
/* 217 */             if (nXTHertxEntity instanceof Mob) { Mob _mobToSpawn = (Mob)nXTHertxEntity;
/* 218 */               _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(nXTHertxEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */             
/* 220 */             world.m_7967_((Entity)nXTHertxEntity); }
/*     */            }
/* 222 */         else if (Math.random() < 0.05D)
/* 223 */         { if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 224 */             AshburyHertxEntity ashburyHertxEntity = new AshburyHertxEntity((EntityType)LatexModEntities.ASHBURY_HERTX.get(), (Level)_level);
/* 225 */             ashburyHertxEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 226 */             ashburyHertxEntity.m_5618_(0.0F);
/* 227 */             ashburyHertxEntity.m_5616_(0.0F);
/* 228 */             if (ashburyHertxEntity instanceof Mob) { Mob _mobToSpawn = (Mob)ashburyHertxEntity;
/* 229 */               _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(ashburyHertxEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */             
/* 231 */             world.m_7967_((Entity)ashburyHertxEntity); }
/*     */            }
/* 233 */         else if (Math.random() < 0.075D)
/* 234 */         { if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 235 */             BeeHertxEntity beeHertxEntity = new BeeHertxEntity((EntityType)LatexModEntities.BEE_HERTX.get(), (Level)_level);
/* 236 */             beeHertxEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 237 */             beeHertxEntity.m_5618_(0.0F);
/* 238 */             beeHertxEntity.m_5616_(0.0F);
/* 239 */             if (beeHertxEntity instanceof Mob) { Mob _mobToSpawn = (Mob)beeHertxEntity;
/* 240 */               _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(beeHertxEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */             
/* 242 */             world.m_7967_((Entity)beeHertxEntity); }
/*     */            }
/* 244 */         else if (Math.random() < 0.1D)
/* 245 */         { if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 246 */             HertxvarFEntity hertxvarFEntity = new HertxvarFEntity((EntityType)LatexModEntities.HERTXVAR_F.get(), (Level)_level);
/* 247 */             hertxvarFEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 248 */             hertxvarFEntity.m_5618_(0.0F);
/* 249 */             hertxvarFEntity.m_5616_(0.0F);
/* 250 */             if (hertxvarFEntity instanceof Mob) { Mob _mobToSpawn = (Mob)hertxvarFEntity;
/* 251 */               _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(hertxvarFEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */             
/* 253 */             world.m_7967_((Entity)hertxvarFEntity); }
/*     */            }
/* 255 */         else if (Math.random() < 0.1D)
/* 256 */         { if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 257 */             HertxvarFBEntity hertxvarFBEntity = new HertxvarFBEntity((EntityType)LatexModEntities.HERTXVAR_FB.get(), (Level)_level);
/* 258 */             hertxvarFBEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 259 */             hertxvarFBEntity.m_5618_(0.0F);
/* 260 */             hertxvarFBEntity.m_5616_(0.0F);
/* 261 */             if (hertxvarFBEntity instanceof Mob) { Mob _mobToSpawn = (Mob)hertxvarFBEntity;
/* 262 */               _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(hertxvarFBEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */             
/* 264 */             world.m_7967_((Entity)hertxvarFBEntity); }
/*     */            }
/* 266 */         else if (Math.random() < 0.1D)
/* 267 */         { if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 268 */             HertxvarSolEntity hertxvarSolEntity = new HertxvarSolEntity((EntityType)LatexModEntities.HERTXVAR_SOL.get(), (Level)_level);
/* 269 */             hertxvarSolEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 270 */             hertxvarSolEntity.m_5618_(0.0F);
/* 271 */             hertxvarSolEntity.m_5616_(0.0F);
/* 272 */             if (hertxvarSolEntity instanceof Mob) { Mob _mobToSpawn = (Mob)hertxvarSolEntity;
/* 273 */               _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(hertxvarSolEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */             
/* 275 */             world.m_7967_((Entity)hertxvarSolEntity); }
/*     */           
/*     */            }
/* 278 */         else if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 279 */           HertxEntity hertxEntity = new HertxEntity((EntityType)LatexModEntities.HERTX.get(), (Level)_level);
/* 280 */           hertxEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 281 */           hertxEntity.m_5618_(0.0F);
/* 282 */           hertxEntity.m_5616_(0.0F);
/* 283 */           if (hertxEntity instanceof Mob) { Mob _mobToSpawn = (Mob)hertxEntity;
/* 284 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(hertxEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 286 */           world.m_7967_((Entity)hertxEntity); }
/*     */         
/*     */          }
/* 289 */       else if (Math.random() < 0.2D)
/* 290 */       { if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 291 */           Villager villager = new Villager(EntityType.f_20492_, (Level)_level);
/* 292 */           villager.m_7678_(x, y, z, 0.0F, 0.0F);
/* 293 */           villager.m_5618_(0.0F);
/* 294 */           villager.m_5616_(0.0F);
/* 295 */           if (villager instanceof Mob) { Mob _mobToSpawn = (Mob)villager;
/* 296 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(villager.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 298 */           world.m_7967_((Entity)villager); }
/*     */         
/* 300 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 301 */           Villager villager = new Villager(EntityType.f_20492_, (Level)_level);
/* 302 */           villager.m_7678_(x, y, z, 0.0F, 0.0F);
/* 303 */           villager.m_5618_(0.0F);
/* 304 */           villager.m_5616_(0.0F);
/* 305 */           if (villager instanceof Mob) { Mob _mobToSpawn = (Mob)villager;
/* 306 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(villager.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 308 */           world.m_7967_((Entity)villager); }
/*     */         
/* 310 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 311 */           ScientistEntity scientistEntity = new ScientistEntity((EntityType)LatexModEntities.SCIENTIST.get(), (Level)_level);
/* 312 */           scientistEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 313 */           scientistEntity.m_5618_(0.0F);
/* 314 */           scientistEntity.m_5616_(0.0F);
/* 315 */           if (scientistEntity instanceof Mob) { Mob _mobToSpawn = (Mob)scientistEntity;
/* 316 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(scientistEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 318 */           world.m_7967_((Entity)scientistEntity); }
/*     */         
/* 320 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 321 */           ScientistEntity scientistEntity = new ScientistEntity((EntityType)LatexModEntities.SCIENTIST.get(), (Level)_level);
/* 322 */           scientistEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 323 */           scientistEntity.m_5618_(0.0F);
/* 324 */           scientistEntity.m_5616_(0.0F);
/* 325 */           if (scientistEntity instanceof Mob) { Mob _mobToSpawn = (Mob)scientistEntity;
/* 326 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(scientistEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 328 */           world.m_7967_((Entity)scientistEntity); }
/*     */         
/*     */          }
/* 331 */       else if (Math.random() < 0.05D)
/* 332 */       { if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 333 */           AHVHertxEntity aHVHertxEntity = new AHVHertxEntity((EntityType)LatexModEntities.AHV_HERTX.get(), (Level)_level);
/* 334 */           aHVHertxEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 335 */           aHVHertxEntity.m_5618_(0.0F);
/* 336 */           aHVHertxEntity.m_5616_(0.0F);
/* 337 */           if (aHVHertxEntity instanceof Mob) { Mob _mobToSpawn = (Mob)aHVHertxEntity;
/* 338 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(aHVHertxEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 340 */           world.m_7967_((Entity)aHVHertxEntity); }
/*     */          }
/* 342 */       else if (Math.random() < 0.05D)
/* 343 */       { if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 344 */           NXTHertxEntity nXTHertxEntity = new NXTHertxEntity((EntityType)LatexModEntities.NXT_HERTX.get(), (Level)_level);
/* 345 */           nXTHertxEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 346 */           nXTHertxEntity.m_5618_(0.0F);
/* 347 */           nXTHertxEntity.m_5616_(0.0F);
/* 348 */           if (nXTHertxEntity instanceof Mob) { Mob _mobToSpawn = (Mob)nXTHertxEntity;
/* 349 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(nXTHertxEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 351 */           world.m_7967_((Entity)nXTHertxEntity); }
/*     */          }
/* 353 */       else if (Math.random() < 0.05D)
/* 354 */       { if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 355 */           AshburyHertxEntity ashburyHertxEntity = new AshburyHertxEntity((EntityType)LatexModEntities.ASHBURY_HERTX.get(), (Level)_level);
/* 356 */           ashburyHertxEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 357 */           ashburyHertxEntity.m_5618_(0.0F);
/* 358 */           ashburyHertxEntity.m_5616_(0.0F);
/* 359 */           if (ashburyHertxEntity instanceof Mob) { Mob _mobToSpawn = (Mob)ashburyHertxEntity;
/* 360 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(ashburyHertxEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 362 */           world.m_7967_((Entity)ashburyHertxEntity); }
/*     */          }
/* 364 */       else if (Math.random() < 0.075D)
/* 365 */       { if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 366 */           BeeHertxEntity beeHertxEntity = new BeeHertxEntity((EntityType)LatexModEntities.BEE_HERTX.get(), (Level)_level);
/* 367 */           beeHertxEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 368 */           beeHertxEntity.m_5618_(0.0F);
/* 369 */           beeHertxEntity.m_5616_(0.0F);
/* 370 */           if (beeHertxEntity instanceof Mob) { Mob _mobToSpawn = (Mob)beeHertxEntity;
/* 371 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(beeHertxEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 373 */           world.m_7967_((Entity)beeHertxEntity); }
/*     */          }
/* 375 */       else if (Math.random() < 0.1D)
/* 376 */       { if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 377 */           HertxvarFEntity hertxvarFEntity = new HertxvarFEntity((EntityType)LatexModEntities.HERTXVAR_F.get(), (Level)_level);
/* 378 */           hertxvarFEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 379 */           hertxvarFEntity.m_5618_(0.0F);
/* 380 */           hertxvarFEntity.m_5616_(0.0F);
/* 381 */           if (hertxvarFEntity instanceof Mob) { Mob _mobToSpawn = (Mob)hertxvarFEntity;
/* 382 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(hertxvarFEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 384 */           world.m_7967_((Entity)hertxvarFEntity); }
/*     */          }
/* 386 */       else if (Math.random() < 0.1D)
/* 387 */       { if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 388 */           HertxvarFBEntity hertxvarFBEntity = new HertxvarFBEntity((EntityType)LatexModEntities.HERTXVAR_FB.get(), (Level)_level);
/* 389 */           hertxvarFBEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 390 */           hertxvarFBEntity.m_5618_(0.0F);
/* 391 */           hertxvarFBEntity.m_5616_(0.0F);
/* 392 */           if (hertxvarFBEntity instanceof Mob) { Mob _mobToSpawn = (Mob)hertxvarFBEntity;
/* 393 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(hertxvarFBEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 395 */           world.m_7967_((Entity)hertxvarFBEntity); }
/*     */          }
/* 397 */       else if (Math.random() < 0.1D)
/* 398 */       { if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 399 */           HertxvarSolEntity hertxvarSolEntity = new HertxvarSolEntity((EntityType)LatexModEntities.HERTXVAR_SOL.get(), (Level)_level);
/* 400 */           hertxvarSolEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 401 */           hertxvarSolEntity.m_5618_(0.0F);
/* 402 */           hertxvarSolEntity.m_5616_(0.0F);
/* 403 */           if (hertxvarSolEntity instanceof Mob) { Mob _mobToSpawn = (Mob)hertxvarSolEntity;
/* 404 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(hertxvarSolEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 406 */           world.m_7967_((Entity)hertxvarSolEntity); }
/*     */         
/*     */          }
/* 409 */       else if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 410 */         HertxEntity hertxEntity = new HertxEntity((EntityType)LatexModEntities.HERTX.get(), (Level)_level);
/* 411 */         hertxEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 412 */         hertxEntity.m_5618_(0.0F);
/* 413 */         hertxEntity.m_5616_(0.0F);
/* 414 */         if (hertxEntity instanceof Mob) { Mob _mobToSpawn = (Mob)hertxEntity;
/* 415 */           _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(hertxEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */         
/* 417 */         world.m_7967_((Entity)hertxEntity); }
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 422 */       if (!entity.f_19853_.m_5776_())
/* 423 */         entity.m_146870_(); 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\AllydroppodOnEntityTickUpdateProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */