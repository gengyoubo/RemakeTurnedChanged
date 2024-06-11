/*    */ package net.mcreator.latexes.procedures;
/*    */ 
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class SlimelingRightClickedOnEntityProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
/*    */     // Byte code:
/*    */     //   0: aload #7
/*    */     //   2: ifnull -> 10
/*    */     //   5: aload #8
/*    */     //   7: ifnonnull -> 11
/*    */     //   10: return
/*    */     //   11: aload #8
/*    */     //   13: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   16: ifeq -> 34
/*    */     //   19: aload #8
/*    */     //   21: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   24: astore #9
/*    */     //   26: aload #9
/*    */     //   28: invokevirtual getMainHandItem : ()Lnet/minecraft/world/item/ItemStack;
/*    */     //   31: goto -> 37
/*    */     //   34: getstatic net/minecraft/world/item/ItemStack.EMPTY : Lnet/minecraft/world/item/ItemStack;
/*    */     //   37: invokevirtual getItem : ()Lnet/minecraft/world/item/Item;
/*    */     //   40: getstatic net/mcreator/latexes/init/LatexModItems.DARKLATEXGOO : Lnet/minecraftforge/registries/RegistryObject;
/*    */     //   43: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   46: if_acmpeq -> 87
/*    */     //   49: aload #8
/*    */     //   51: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   54: ifeq -> 72
/*    */     //   57: aload #8
/*    */     //   59: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   62: astore #10
/*    */     //   64: aload #10
/*    */     //   66: invokevirtual getOffhandItem : ()Lnet/minecraft/world/item/ItemStack;
/*    */     //   69: goto -> 75
/*    */     //   72: getstatic net/minecraft/world/item/ItemStack.EMPTY : Lnet/minecraft/world/item/ItemStack;
/*    */     //   75: invokevirtual getItem : ()Lnet/minecraft/world/item/Item;
/*    */     //   78: getstatic net/mcreator/latexes/init/LatexModItems.DARKLATEXGOO : Lnet/minecraftforge/registries/RegistryObject;
/*    */     //   81: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   84: if_acmpne -> 541
/*    */     //   87: aload #8
/*    */     //   89: instanceof net/minecraft/world/entity/player/Player
/*    */     //   92: ifeq -> 145
/*    */     //   95: aload #8
/*    */     //   97: checkcast net/minecraft/world/entity/player/Player
/*    */     //   100: astore #11
/*    */     //   102: new net/minecraft/world/item/ItemStack
/*    */     //   105: dup
/*    */     //   106: getstatic net/mcreator/latexes/init/LatexModItems.DARKLATEXGOO : Lnet/minecraftforge/registries/RegistryObject;
/*    */     //   109: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   112: checkcast net/minecraft/world/level/ItemLike
/*    */     //   115: invokespecial <init> : (Lnet/minecraft/world/level/ItemLike;)V
/*    */     //   118: astore #12
/*    */     //   120: aload #11
/*    */     //   122: invokevirtual getInventory : ()Lnet/minecraft/world/entity/player/Inventory;
/*    */     //   125: aload #12
/*    */     //   127: <illegal opcode> test : (Lnet/minecraft/world/item/ItemStack;)Ljava/util/function/Predicate;
/*    */     //   132: iconst_1
/*    */     //   133: aload #11
/*    */     //   135: getfield inventoryMenu : Lnet/minecraft/world/inventory/InventoryMenu;
/*    */     //   138: invokevirtual getCraftSlots : ()Lnet/minecraft/world/inventory/CraftingContainer;
/*    */     //   141: invokevirtual clearOrCountMatchingItems : (Ljava/util/function/Predicate;ILnet/minecraft/world/Container;)I
/*    */     //   144: pop
/*    */     //   145: invokestatic random : ()D
/*    */     //   148: ldc2_w 0.4
/*    */     //   151: dcmpg
/*    */     //   152: ifge -> 503
/*    */     //   155: invokestatic random : ()D
/*    */     //   158: ldc2_w 0.025
/*    */     //   161: dcmpg
/*    */     //   162: ifge -> 334
/*    */     //   165: aload_0
/*    */     //   166: instanceof net/minecraft/server/level/ServerLevel
/*    */     //   169: ifeq -> 203
/*    */     //   172: aload_0
/*    */     //   173: checkcast net/minecraft/server/level/ServerLevel
/*    */     //   176: astore #11
/*    */     //   178: aload #11
/*    */     //   180: getstatic net/minecraft/core/particles/ParticleTypes.HEART : Lnet/minecraft/core/particles/SimpleParticleType;
/*    */     //   183: dload_1
/*    */     //   184: dload_3
/*    */     //   185: dload #5
/*    */     //   187: bipush #6
/*    */     //   189: ldc2_w 2.0
/*    */     //   192: ldc2_w 2.0
/*    */     //   195: ldc2_w 2.0
/*    */     //   198: dconst_1
/*    */     //   199: invokevirtual sendParticles : (Lnet/minecraft/core/particles/ParticleOptions;DDDIDDDD)I
/*    */     //   202: pop
/*    */     //   203: aload_0
/*    */     //   204: instanceof net/minecraft/server/level/ServerLevel
/*    */     //   207: ifeq -> 315
/*    */     //   210: aload_0
/*    */     //   211: checkcast net/minecraft/server/level/ServerLevel
/*    */     //   214: astore #11
/*    */     //   216: new net/mcreator/latexes/entity/ProtectorSlimelingEntity
/*    */     //   219: dup
/*    */     //   220: getstatic net/mcreator/latexes/init/LatexModEntities.PROTECTOR_SLIMELING : Lnet/minecraftforge/registries/RegistryObject;
/*    */     //   223: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   226: checkcast net/minecraft/world/entity/EntityType
/*    */     //   229: aload #11
/*    */     //   231: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
/*    */     //   234: astore #12
/*    */     //   236: aload #12
/*    */     //   238: dload_1
/*    */     //   239: dload_3
/*    */     //   240: dload #5
/*    */     //   242: fconst_0
/*    */     //   243: fconst_0
/*    */     //   244: invokevirtual moveTo : (DDDFF)V
/*    */     //   247: aload #12
/*    */     //   249: fconst_0
/*    */     //   250: invokevirtual setYBodyRot : (F)V
/*    */     //   253: aload #12
/*    */     //   255: fconst_0
/*    */     //   256: invokevirtual setYHeadRot : (F)V
/*    */     //   259: aload #12
/*    */     //   261: dconst_0
/*    */     //   262: dconst_0
/*    */     //   263: dconst_0
/*    */     //   264: invokevirtual setDeltaMovement : (DDD)V
/*    */     //   267: aload #12
/*    */     //   269: instanceof net/minecraft/world/entity/Mob
/*    */     //   272: ifeq -> 306
/*    */     //   275: aload #12
/*    */     //   277: checkcast net/minecraft/world/entity/Mob
/*    */     //   280: astore #13
/*    */     //   282: aload #13
/*    */     //   284: aload #11
/*    */     //   286: aload_0
/*    */     //   287: aload #12
/*    */     //   289: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
/*    */     //   292: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
/*    */     //   297: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
/*    */     //   300: aconst_null
/*    */     //   301: aconst_null
/*    */     //   302: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
/*    */     //   305: pop
/*    */     //   306: aload_0
/*    */     //   307: aload #12
/*    */     //   309: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
/*    */     //   314: pop
/*    */     //   315: aload #7
/*    */     //   317: getfield level : Lnet/minecraft/world/level/Level;
/*    */     //   320: invokevirtual isClientSide : ()Z
/*    */     //   323: ifne -> 541
/*    */     //   326: aload #7
/*    */     //   328: invokevirtual discard : ()V
/*    */     //   331: goto -> 541
/*    */     //   334: aload_0
/*    */     //   335: instanceof net/minecraft/server/level/ServerLevel
/*    */     //   338: ifeq -> 372
/*    */     //   341: aload_0
/*    */     //   342: checkcast net/minecraft/server/level/ServerLevel
/*    */     //   345: astore #11
/*    */     //   347: aload #11
/*    */     //   349: getstatic net/minecraft/core/particles/ParticleTypes.HEART : Lnet/minecraft/core/particles/SimpleParticleType;
/*    */     //   352: dload_1
/*    */     //   353: dload_3
/*    */     //   354: dload #5
/*    */     //   356: bipush #6
/*    */     //   358: ldc2_w 2.0
/*    */     //   361: ldc2_w 2.0
/*    */     //   364: ldc2_w 2.0
/*    */     //   367: dconst_1
/*    */     //   368: invokevirtual sendParticles : (Lnet/minecraft/core/particles/ParticleOptions;DDDIDDDD)I
/*    */     //   371: pop
/*    */     //   372: aload_0
/*    */     //   373: instanceof net/minecraft/server/level/ServerLevel
/*    */     //   376: ifeq -> 484
/*    */     //   379: aload_0
/*    */     //   380: checkcast net/minecraft/server/level/ServerLevel
/*    */     //   383: astore #11
/*    */     //   385: new net/mcreator/latexes/entity/SlimelingTamedEntity
/*    */     //   388: dup
/*    */     //   389: getstatic net/mcreator/latexes/init/LatexModEntities.SLIMELING_TAMED : Lnet/minecraftforge/registries/RegistryObject;
/*    */     //   392: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   395: checkcast net/minecraft/world/entity/EntityType
/*    */     //   398: aload #11
/*    */     //   400: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
/*    */     //   403: astore #12
/*    */     //   405: aload #12
/*    */     //   407: dload_1
/*    */     //   408: dload_3
/*    */     //   409: dload #5
/*    */     //   411: fconst_0
/*    */     //   412: fconst_0
/*    */     //   413: invokevirtual moveTo : (DDDFF)V
/*    */     //   416: aload #12
/*    */     //   418: fconst_0
/*    */     //   419: invokevirtual setYBodyRot : (F)V
/*    */     //   422: aload #12
/*    */     //   424: fconst_0
/*    */     //   425: invokevirtual setYHeadRot : (F)V
/*    */     //   428: aload #12
/*    */     //   430: dconst_0
/*    */     //   431: dconst_0
/*    */     //   432: dconst_0
/*    */     //   433: invokevirtual setDeltaMovement : (DDD)V
/*    */     //   436: aload #12
/*    */     //   438: instanceof net/minecraft/world/entity/Mob
/*    */     //   441: ifeq -> 475
/*    */     //   444: aload #12
/*    */     //   446: checkcast net/minecraft/world/entity/Mob
/*    */     //   449: astore #13
/*    */     //   451: aload #13
/*    */     //   453: aload #11
/*    */     //   455: aload_0
/*    */     //   456: aload #12
/*    */     //   458: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
/*    */     //   461: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
/*    */     //   466: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
/*    */     //   469: aconst_null
/*    */     //   470: aconst_null
/*    */     //   471: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
/*    */     //   474: pop
/*    */     //   475: aload_0
/*    */     //   476: aload #12
/*    */     //   478: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
/*    */     //   483: pop
/*    */     //   484: aload #7
/*    */     //   486: getfield level : Lnet/minecraft/world/level/Level;
/*    */     //   489: invokevirtual isClientSide : ()Z
/*    */     //   492: ifne -> 541
/*    */     //   495: aload #7
/*    */     //   497: invokevirtual discard : ()V
/*    */     //   500: goto -> 541
/*    */     //   503: aload_0
/*    */     //   504: instanceof net/minecraft/server/level/ServerLevel
/*    */     //   507: ifeq -> 541
/*    */     //   510: aload_0
/*    */     //   511: checkcast net/minecraft/server/level/ServerLevel
/*    */     //   514: astore #11
/*    */     //   516: aload #11
/*    */     //   518: getstatic net/minecraft/core/particles/ParticleTypes.SMOKE : Lnet/minecraft/core/particles/SimpleParticleType;
/*    */     //   521: dload_1
/*    */     //   522: dload_3
/*    */     //   523: dload #5
/*    */     //   525: bipush #6
/*    */     //   527: ldc2_w 2.0
/*    */     //   530: ldc2_w 2.0
/*    */     //   533: ldc2_w 2.0
/*    */     //   536: dconst_1
/*    */     //   537: invokevirtual sendParticles : (Lnet/minecraft/core/particles/ParticleOptions;DDDIDDDD)I
/*    */     //   540: pop
/*    */     //   541: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #20	-> 0
/*    */     //   #21	-> 10
/*    */     //   #22	-> 11
/*    */     //   #23	-> 49
/*    */     //   #24	-> 81
/*    */     //   #25	-> 87
/*    */     //   #26	-> 102
/*    */     //   #27	-> 120
/*    */     //   #28	-> 138
/*    */     //   #27	-> 141
/*    */     //   #30	-> 145
/*    */     //   #31	-> 155
/*    */     //   #32	-> 165
/*    */     //   #33	-> 178
/*    */     //   #34	-> 203
/*    */     //   #35	-> 216
/*    */     //   #36	-> 236
/*    */     //   #37	-> 247
/*    */     //   #38	-> 253
/*    */     //   #39	-> 259
/*    */     //   #40	-> 267
/*    */     //   #41	-> 282
/*    */     //   #43	-> 306
/*    */     //   #45	-> 315
/*    */     //   #46	-> 326
/*    */     //   #48	-> 334
/*    */     //   #49	-> 347
/*    */     //   #50	-> 372
/*    */     //   #51	-> 385
/*    */     //   #52	-> 405
/*    */     //   #53	-> 416
/*    */     //   #54	-> 422
/*    */     //   #55	-> 428
/*    */     //   #56	-> 436
/*    */     //   #57	-> 451
/*    */     //   #59	-> 475
/*    */     //   #61	-> 484
/*    */     //   #62	-> 495
/*    */     //   #65	-> 503
/*    */     //   #66	-> 516
/*    */     //   #69	-> 541
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   26	8	9	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   64	8	10	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   120	25	12	_stktoremove	Lnet/minecraft/world/item/ItemStack;
/*    */     //   102	43	11	_player	Lnet/minecraft/world/entity/player/Player;
/*    */     //   178	25	11	_level	Lnet/minecraft/server/level/ServerLevel;
/*    */     //   282	24	13	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
/*    */     //   236	79	12	entityToSpawn	Lnet/minecraft/world/entity/Entity;
/*    */     //   216	99	11	_level	Lnet/minecraft/server/level/ServerLevel;
/*    */     //   347	25	11	_level	Lnet/minecraft/server/level/ServerLevel;
/*    */     //   451	24	13	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
/*    */     //   405	79	12	entityToSpawn	Lnet/minecraft/world/entity/Entity;
/*    */     //   385	99	11	_level	Lnet/minecraft/server/level/ServerLevel;
/*    */     //   516	25	11	_level	Lnet/minecraft/server/level/ServerLevel;
/*    */     //   0	542	0	world	Lnet/minecraft/world/level/LevelAccessor;
/*    */     //   0	542	1	x	D
/*    */     //   0	542	3	y	D
/*    */     //   0	542	5	z	D
/*    */     //   0	542	7	entity	Lnet/minecraft/world/entity/Entity;
/*    */     //   0	542	8	sourceentity	Lnet/minecraft/world/entity/Entity;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\SlimelingRightClickedOnEntityProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */