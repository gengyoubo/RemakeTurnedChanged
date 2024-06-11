/*    */ package net.ltxprogrammer.turned.procedures;
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
/*    */     //   28: invokevirtual m_21205_ : ()Lnet/minecraft/world/item/ItemStack;
/*    */     //   31: goto -> 37
/*    */     //   34: getstatic net/minecraft/world/item/ItemStack.f_41583_ : Lnet/minecraft/world/item/ItemStack;
/*    */     //   37: invokevirtual m_41720_ : ()Lnet/minecraft/world/item/Item;
/*    */     //   40: getstatic net/ltxprogrammer/changed/init/ChangedItems.DARK_LATEX_GOO : Lnet/minecraftforge/registries/RegistryObject;
/*    */     //   43: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   46: if_acmpeq -> 87
/*    */     //   49: aload #8
/*    */     //   51: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   54: ifeq -> 72
/*    */     //   57: aload #8
/*    */     //   59: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   62: astore #10
/*    */     //   64: aload #10
/*    */     //   66: invokevirtual m_21206_ : ()Lnet/minecraft/world/item/ItemStack;
/*    */     //   69: goto -> 75
/*    */     //   72: getstatic net/minecraft/world/item/ItemStack.f_41583_ : Lnet/minecraft/world/item/ItemStack;
/*    */     //   75: invokevirtual m_41720_ : ()Lnet/minecraft/world/item/Item;
/*    */     //   78: getstatic net/ltxprogrammer/changed/init/ChangedItems.DARK_LATEX_GOO : Lnet/minecraftforge/registries/RegistryObject;
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
/*    */     //   106: getstatic net/ltxprogrammer/changed/init/ChangedItems.DARK_LATEX_GOO : Lnet/minecraftforge/registries/RegistryObject;
/*    */     //   109: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   112: checkcast net/minecraft/world/level/ItemLike
/*    */     //   115: invokespecial <init> : (Lnet/minecraft/world/level/ItemLike;)V
/*    */     //   118: astore #12
/*    */     //   120: aload #11
/*    */     //   122: invokevirtual m_150109_ : ()Lnet/minecraft/world/entity/player/Inventory;
/*    */     //   125: aload #12
/*    */     //   127: <illegal opcode> test : (Lnet/minecraft/world/item/ItemStack;)Ljava/util/function/Predicate;
/*    */     //   132: iconst_1
/*    */     //   133: aload #11
/*    */     //   135: getfield f_36095_ : Lnet/minecraft/world/inventory/InventoryMenu;
/*    */     //   138: invokevirtual m_39730_ : ()Lnet/minecraft/world/inventory/CraftingContainer;
/*    */     //   141: invokevirtual m_36022_ : (Ljava/util/function/Predicate;ILnet/minecraft/world/Container;)I
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
/*    */     //   180: getstatic net/minecraft/core/particles/ParticleTypes.f_123750_ : Lnet/minecraft/core/particles/SimpleParticleType;
/*    */     //   183: dload_1
/*    */     //   184: dload_3
/*    */     //   185: dload #5
/*    */     //   187: bipush #6
/*    */     //   189: ldc2_w 2.0
/*    */     //   192: ldc2_w 2.0
/*    */     //   195: ldc2_w 2.0
/*    */     //   198: dconst_1
/*    */     //   199: invokevirtual m_8767_ : (Lnet/minecraft/core/particles/ParticleOptions;DDDIDDDD)I
/*    */     //   202: pop
/*    */     //   203: aload_0
/*    */     //   204: instanceof net/minecraft/server/level/ServerLevel
/*    */     //   207: ifeq -> 315
/*    */     //   210: aload_0
/*    */     //   211: checkcast net/minecraft/server/level/ServerLevel
/*    */     //   214: astore #11
/*    */     //   216: new net/ltxprogrammer/turned/entity/ProtectorSlimelingEntity
/*    */     //   219: dup
/*    */     //   220: getstatic net/ltxprogrammer/turned/init/LatexModEntities.PROTECTOR_SLIMELING : Lnet/minecraftforge/registries/RegistryObject;
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
/*    */     //   244: invokevirtual m_7678_ : (DDDFF)V
/*    */     //   247: aload #12
/*    */     //   249: fconst_0
/*    */     //   250: invokevirtual m_5618_ : (F)V
/*    */     //   253: aload #12
/*    */     //   255: fconst_0
/*    */     //   256: invokevirtual m_5616_ : (F)V
/*    */     //   259: aload #12
/*    */     //   261: dconst_0
/*    */     //   262: dconst_0
/*    */     //   263: dconst_0
/*    */     //   264: invokevirtual m_20334_ : (DDD)V
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
/*    */     //   289: invokevirtual m_142538_ : ()Lnet/minecraft/core/BlockPos;
/*    */     //   292: invokeinterface m_6436_ : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
/*    */     //   297: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
/*    */     //   300: aconst_null
/*    */     //   301: aconst_null
/*    */     //   302: invokevirtual m_6518_ : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
/*    */     //   305: pop
/*    */     //   306: aload_0
/*    */     //   307: aload #12
/*    */     //   309: invokeinterface m_7967_ : (Lnet/minecraft/world/entity/Entity;)Z
/*    */     //   314: pop
/*    */     //   315: aload #7
/*    */     //   317: getfield f_19853_ : Lnet/minecraft/world/level/Level;
/*    */     //   320: invokevirtual m_5776_ : ()Z
/*    */     //   323: ifne -> 541
/*    */     //   326: aload #7
/*    */     //   328: invokevirtual m_146870_ : ()V
/*    */     //   331: goto -> 541
/*    */     //   334: aload_0
/*    */     //   335: instanceof net/minecraft/server/level/ServerLevel
/*    */     //   338: ifeq -> 372
/*    */     //   341: aload_0
/*    */     //   342: checkcast net/minecraft/server/level/ServerLevel
/*    */     //   345: astore #11
/*    */     //   347: aload #11
/*    */     //   349: getstatic net/minecraft/core/particles/ParticleTypes.f_123750_ : Lnet/minecraft/core/particles/SimpleParticleType;
/*    */     //   352: dload_1
/*    */     //   353: dload_3
/*    */     //   354: dload #5
/*    */     //   356: bipush #6
/*    */     //   358: ldc2_w 2.0
/*    */     //   361: ldc2_w 2.0
/*    */     //   364: ldc2_w 2.0
/*    */     //   367: dconst_1
/*    */     //   368: invokevirtual m_8767_ : (Lnet/minecraft/core/particles/ParticleOptions;DDDIDDDD)I
/*    */     //   371: pop
/*    */     //   372: aload_0
/*    */     //   373: instanceof net/minecraft/server/level/ServerLevel
/*    */     //   376: ifeq -> 484
/*    */     //   379: aload_0
/*    */     //   380: checkcast net/minecraft/server/level/ServerLevel
/*    */     //   383: astore #11
/*    */     //   385: new net/ltxprogrammer/turned/entity/SlimelingTamedEntity
/*    */     //   388: dup
/*    */     //   389: getstatic net/ltxprogrammer/turned/init/LatexModEntities.SLIMELING_TAMED : Lnet/minecraftforge/registries/RegistryObject;
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
/*    */     //   413: invokevirtual m_7678_ : (DDDFF)V
/*    */     //   416: aload #12
/*    */     //   418: fconst_0
/*    */     //   419: invokevirtual m_5618_ : (F)V
/*    */     //   422: aload #12
/*    */     //   424: fconst_0
/*    */     //   425: invokevirtual m_5616_ : (F)V
/*    */     //   428: aload #12
/*    */     //   430: dconst_0
/*    */     //   431: dconst_0
/*    */     //   432: dconst_0
/*    */     //   433: invokevirtual m_20334_ : (DDD)V
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
/*    */     //   458: invokevirtual m_142538_ : ()Lnet/minecraft/core/BlockPos;
/*    */     //   461: invokeinterface m_6436_ : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
/*    */     //   466: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
/*    */     //   469: aconst_null
/*    */     //   470: aconst_null
/*    */     //   471: invokevirtual m_6518_ : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
/*    */     //   474: pop
/*    */     //   475: aload_0
/*    */     //   476: aload #12
/*    */     //   478: invokeinterface m_7967_ : (Lnet/minecraft/world/entity/Entity;)Z
/*    */     //   483: pop
/*    */     //   484: aload #7
/*    */     //   486: getfield f_19853_ : Lnet/minecraft/world/level/Level;
/*    */     //   489: invokevirtual m_5776_ : ()Z
/*    */     //   492: ifne -> 541
/*    */     //   495: aload #7
/*    */     //   497: invokevirtual m_146870_ : ()V
/*    */     //   500: goto -> 541
/*    */     //   503: aload_0
/*    */     //   504: instanceof net/minecraft/server/level/ServerLevel
/*    */     //   507: ifeq -> 541
/*    */     //   510: aload_0
/*    */     //   511: checkcast net/minecraft/server/level/ServerLevel
/*    */     //   514: astore #11
/*    */     //   516: aload #11
/*    */     //   518: getstatic net/minecraft/core/particles/ParticleTypes.f_123762_ : Lnet/minecraft/core/particles/SimpleParticleType;
/*    */     //   521: dload_1
/*    */     //   522: dload_3
/*    */     //   523: dload #5
/*    */     //   525: bipush #6
/*    */     //   527: ldc2_w 2.0
/*    */     //   530: ldc2_w 2.0
/*    */     //   533: ldc2_w 2.0
/*    */     //   536: dconst_1
/*    */     //   537: invokevirtual m_8767_ : (Lnet/minecraft/core/particles/ParticleOptions;DDDIDDDD)I
/*    */     //   540: pop
/*    */     //   541: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #19	-> 0
/*    */     //   #20	-> 10
/*    */     //   #21	-> 11
/*    */     //   #22	-> 49
/*    */     //   #23	-> 81
/*    */     //   #24	-> 87
/*    */     //   #25	-> 102
/*    */     //   #26	-> 120
/*    */     //   #27	-> 138
/*    */     //   #26	-> 141
/*    */     //   #29	-> 145
/*    */     //   #30	-> 155
/*    */     //   #31	-> 165
/*    */     //   #32	-> 178
/*    */     //   #33	-> 203
/*    */     //   #34	-> 216
/*    */     //   #35	-> 236
/*    */     //   #36	-> 247
/*    */     //   #37	-> 253
/*    */     //   #38	-> 259
/*    */     //   #39	-> 267
/*    */     //   #40	-> 282
/*    */     //   #42	-> 306
/*    */     //   #44	-> 315
/*    */     //   #45	-> 326
/*    */     //   #47	-> 334
/*    */     //   #48	-> 347
/*    */     //   #49	-> 372
/*    */     //   #50	-> 385
/*    */     //   #51	-> 405
/*    */     //   #52	-> 416
/*    */     //   #53	-> 422
/*    */     //   #54	-> 428
/*    */     //   #55	-> 436
/*    */     //   #56	-> 451
/*    */     //   #58	-> 475
/*    */     //   #60	-> 484
/*    */     //   #61	-> 495
/*    */     //   #64	-> 503
/*    */     //   #65	-> 516
/*    */     //   #68	-> 541
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


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\SlimelingRightClickedOnEntityProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */