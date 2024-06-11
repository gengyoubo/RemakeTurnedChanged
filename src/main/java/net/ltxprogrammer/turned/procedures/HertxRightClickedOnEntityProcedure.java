/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ 
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class HertxRightClickedOnEntityProcedure {
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
/*    */     //   46: if_acmpne -> 264
/*    */     //   49: aload #7
/*    */     //   51: instanceof net/minecraft/world/entity/TamableAnimal
/*    */     //   54: ifeq -> 76
/*    */     //   57: aload #7
/*    */     //   59: checkcast net/minecraft/world/entity/TamableAnimal
/*    */     //   62: astore #15
/*    */     //   64: aload #15
/*    */     //   66: invokevirtual m_21824_ : ()Z
/*    */     //   69: ifeq -> 76
/*    */     //   72: iconst_1
/*    */     //   73: goto -> 77
/*    */     //   76: iconst_0
/*    */     //   77: iconst_1
/*    */     //   78: if_icmpne -> 818
/*    */     //   81: aload #7
/*    */     //   83: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   86: ifeq -> 104
/*    */     //   89: aload #7
/*    */     //   91: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   94: astore #16
/*    */     //   96: aload #16
/*    */     //   98: invokevirtual m_21223_ : ()F
/*    */     //   101: goto -> 106
/*    */     //   104: ldc -1.0
/*    */     //   106: aload #7
/*    */     //   108: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   111: ifeq -> 129
/*    */     //   114: aload #7
/*    */     //   116: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   119: astore #17
/*    */     //   121: aload #17
/*    */     //   123: invokevirtual m_21233_ : ()F
/*    */     //   126: goto -> 131
/*    */     //   129: ldc -1.0
/*    */     //   131: fcmpg
/*    */     //   132: ifge -> 818
/*    */     //   135: aload #7
/*    */     //   137: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   140: ifeq -> 170
/*    */     //   143: aload #7
/*    */     //   145: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   148: astore #18
/*    */     //   150: aload #18
/*    */     //   152: new net/minecraft/world/effect/MobEffectInstance
/*    */     //   155: dup
/*    */     //   156: getstatic net/minecraft/world/effect/MobEffects.f_19601_ : Lnet/minecraft/world/effect/MobEffect;
/*    */     //   159: iconst_1
/*    */     //   160: iconst_1
/*    */     //   161: iconst_0
/*    */     //   162: iconst_0
/*    */     //   163: invokespecial <init> : (Lnet/minecraft/world/effect/MobEffect;IIZZ)V
/*    */     //   166: invokevirtual m_7292_ : (Lnet/minecraft/world/effect/MobEffectInstance;)Z
/*    */     //   169: pop
/*    */     //   170: aload_0
/*    */     //   171: instanceof net/minecraft/server/level/ServerLevel
/*    */     //   174: ifeq -> 203
/*    */     //   177: aload_0
/*    */     //   178: checkcast net/minecraft/server/level/ServerLevel
/*    */     //   181: astore #18
/*    */     //   183: aload #18
/*    */     //   185: getstatic net/minecraft/core/particles/ParticleTypes.f_123748_ : Lnet/minecraft/core/particles/SimpleParticleType;
/*    */     //   188: dload_1
/*    */     //   189: dload_3
/*    */     //   190: dload #5
/*    */     //   192: iconst_5
/*    */     //   193: dconst_1
/*    */     //   194: ldc2_w 2.0
/*    */     //   197: dconst_1
/*    */     //   198: dconst_1
/*    */     //   199: invokevirtual m_8767_ : (Lnet/minecraft/core/particles/ParticleOptions;DDDIDDDD)I
/*    */     //   202: pop
/*    */     //   203: aload #7
/*    */     //   205: instanceof net/minecraft/world/entity/player/Player
/*    */     //   208: ifeq -> 261
/*    */     //   211: aload #7
/*    */     //   213: checkcast net/minecraft/world/entity/player/Player
/*    */     //   216: astore #18
/*    */     //   218: new net/minecraft/world/item/ItemStack
/*    */     //   221: dup
/*    */     //   222: getstatic net/ltxprogrammer/changed/init/ChangedItems.DARK_LATEX_GOO : Lnet/minecraftforge/registries/RegistryObject;
/*    */     //   225: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   228: checkcast net/minecraft/world/level/ItemLike
/*    */     //   231: invokespecial <init> : (Lnet/minecraft/world/level/ItemLike;)V
/*    */     //   234: astore #19
/*    */     //   236: aload #18
/*    */     //   238: invokevirtual m_150109_ : ()Lnet/minecraft/world/entity/player/Inventory;
/*    */     //   241: aload #19
/*    */     //   243: <illegal opcode> test : (Lnet/minecraft/world/item/ItemStack;)Ljava/util/function/Predicate;
/*    */     //   248: iconst_1
/*    */     //   249: aload #18
/*    */     //   251: getfield f_36095_ : Lnet/minecraft/world/inventory/InventoryMenu;
/*    */     //   254: invokevirtual m_39730_ : ()Lnet/minecraft/world/inventory/CraftingContainer;
/*    */     //   257: invokevirtual m_36022_ : (Ljava/util/function/Predicate;ILnet/minecraft/world/Container;)I
/*    */     //   260: pop
/*    */     //   261: goto -> 818
/*    */     //   264: aload #8
/*    */     //   266: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   269: ifeq -> 287
/*    */     //   272: aload #8
/*    */     //   274: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   277: astore #10
/*    */     //   279: aload #10
/*    */     //   281: invokevirtual m_21205_ : ()Lnet/minecraft/world/item/ItemStack;
/*    */     //   284: goto -> 290
/*    */     //   287: getstatic net/minecraft/world/item/ItemStack.f_41583_ : Lnet/minecraft/world/item/ItemStack;
/*    */     //   290: invokevirtual m_41720_ : ()Lnet/minecraft/world/item/Item;
/*    */     //   293: getstatic net/ltxprogrammer/turned/init/LatexModItems.LATEX_SOUP : Lnet/minecraftforge/registries/RegistryObject;
/*    */     //   296: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   299: if_acmpne -> 517
/*    */     //   302: aload #7
/*    */     //   304: instanceof net/minecraft/world/entity/TamableAnimal
/*    */     //   307: ifeq -> 329
/*    */     //   310: aload #7
/*    */     //   312: checkcast net/minecraft/world/entity/TamableAnimal
/*    */     //   315: astore #15
/*    */     //   317: aload #15
/*    */     //   319: invokevirtual m_21824_ : ()Z
/*    */     //   322: ifeq -> 329
/*    */     //   325: iconst_1
/*    */     //   326: goto -> 330
/*    */     //   329: iconst_0
/*    */     //   330: iconst_1
/*    */     //   331: if_icmpne -> 818
/*    */     //   334: aload #7
/*    */     //   336: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   339: ifeq -> 357
/*    */     //   342: aload #7
/*    */     //   344: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   347: astore #16
/*    */     //   349: aload #16
/*    */     //   351: invokevirtual m_21223_ : ()F
/*    */     //   354: goto -> 359
/*    */     //   357: ldc -1.0
/*    */     //   359: aload #7
/*    */     //   361: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   364: ifeq -> 382
/*    */     //   367: aload #7
/*    */     //   369: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   372: astore #17
/*    */     //   374: aload #17
/*    */     //   376: invokevirtual m_21233_ : ()F
/*    */     //   379: goto -> 384
/*    */     //   382: ldc -1.0
/*    */     //   384: fcmpg
/*    */     //   385: ifge -> 818
/*    */     //   388: aload #7
/*    */     //   390: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   393: ifeq -> 423
/*    */     //   396: aload #7
/*    */     //   398: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   401: astore #18
/*    */     //   403: aload #18
/*    */     //   405: new net/minecraft/world/effect/MobEffectInstance
/*    */     //   408: dup
/*    */     //   409: getstatic net/minecraft/world/effect/MobEffects.f_19601_ : Lnet/minecraft/world/effect/MobEffect;
/*    */     //   412: iconst_1
/*    */     //   413: iconst_2
/*    */     //   414: iconst_0
/*    */     //   415: iconst_0
/*    */     //   416: invokespecial <init> : (Lnet/minecraft/world/effect/MobEffect;IIZZ)V
/*    */     //   419: invokevirtual m_7292_ : (Lnet/minecraft/world/effect/MobEffectInstance;)Z
/*    */     //   422: pop
/*    */     //   423: aload_0
/*    */     //   424: instanceof net/minecraft/server/level/ServerLevel
/*    */     //   427: ifeq -> 456
/*    */     //   430: aload_0
/*    */     //   431: checkcast net/minecraft/server/level/ServerLevel
/*    */     //   434: astore #18
/*    */     //   436: aload #18
/*    */     //   438: getstatic net/minecraft/core/particles/ParticleTypes.f_123748_ : Lnet/minecraft/core/particles/SimpleParticleType;
/*    */     //   441: dload_1
/*    */     //   442: dload_3
/*    */     //   443: dload #5
/*    */     //   445: iconst_5
/*    */     //   446: dconst_1
/*    */     //   447: ldc2_w 2.0
/*    */     //   450: dconst_1
/*    */     //   451: dconst_1
/*    */     //   452: invokevirtual m_8767_ : (Lnet/minecraft/core/particles/ParticleOptions;DDDIDDDD)I
/*    */     //   455: pop
/*    */     //   456: aload #7
/*    */     //   458: instanceof net/minecraft/world/entity/player/Player
/*    */     //   461: ifeq -> 514
/*    */     //   464: aload #7
/*    */     //   466: checkcast net/minecraft/world/entity/player/Player
/*    */     //   469: astore #18
/*    */     //   471: new net/minecraft/world/item/ItemStack
/*    */     //   474: dup
/*    */     //   475: getstatic net/ltxprogrammer/turned/init/LatexModItems.LATEX_SOUP : Lnet/minecraftforge/registries/RegistryObject;
/*    */     //   478: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   481: checkcast net/minecraft/world/level/ItemLike
/*    */     //   484: invokespecial <init> : (Lnet/minecraft/world/level/ItemLike;)V
/*    */     //   487: astore #19
/*    */     //   489: aload #18
/*    */     //   491: invokevirtual m_150109_ : ()Lnet/minecraft/world/entity/player/Inventory;
/*    */     //   494: aload #19
/*    */     //   496: <illegal opcode> test : (Lnet/minecraft/world/item/ItemStack;)Ljava/util/function/Predicate;
/*    */     //   501: iconst_1
/*    */     //   502: aload #18
/*    */     //   504: getfield f_36095_ : Lnet/minecraft/world/inventory/InventoryMenu;
/*    */     //   507: invokevirtual m_39730_ : ()Lnet/minecraft/world/inventory/CraftingContainer;
/*    */     //   510: invokevirtual m_36022_ : (Ljava/util/function/Predicate;ILnet/minecraft/world/Container;)I
/*    */     //   513: pop
/*    */     //   514: goto -> 818
/*    */     //   517: aload #8
/*    */     //   519: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   522: ifeq -> 540
/*    */     //   525: aload #8
/*    */     //   527: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   530: astore #11
/*    */     //   532: aload #11
/*    */     //   534: invokevirtual m_21223_ : ()F
/*    */     //   537: goto -> 542
/*    */     //   540: ldc -1.0
/*    */     //   542: aload #8
/*    */     //   544: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   547: ifeq -> 565
/*    */     //   550: aload #8
/*    */     //   552: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   555: astore #12
/*    */     //   557: aload #12
/*    */     //   559: invokevirtual m_21233_ : ()F
/*    */     //   562: goto -> 567
/*    */     //   565: ldc -1.0
/*    */     //   567: fcmpg
/*    */     //   568: ifge -> 642
/*    */     //   571: aload #7
/*    */     //   573: instanceof net/minecraft/world/entity/TamableAnimal
/*    */     //   576: ifeq -> 598
/*    */     //   579: aload #7
/*    */     //   581: checkcast net/minecraft/world/entity/TamableAnimal
/*    */     //   584: astore #15
/*    */     //   586: aload #15
/*    */     //   588: invokevirtual m_21824_ : ()Z
/*    */     //   591: ifeq -> 598
/*    */     //   594: iconst_1
/*    */     //   595: goto -> 599
/*    */     //   598: iconst_0
/*    */     //   599: iconst_1
/*    */     //   600: if_icmpne -> 818
/*    */     //   603: aload #8
/*    */     //   605: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   608: ifeq -> 639
/*    */     //   611: aload #8
/*    */     //   613: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   616: astore #16
/*    */     //   618: aload #16
/*    */     //   620: new net/minecraft/world/effect/MobEffectInstance
/*    */     //   623: dup
/*    */     //   624: getstatic net/minecraft/world/effect/MobEffects.f_19605_ : Lnet/minecraft/world/effect/MobEffect;
/*    */     //   627: bipush #100
/*    */     //   629: iconst_1
/*    */     //   630: iconst_0
/*    */     //   631: iconst_0
/*    */     //   632: invokespecial <init> : (Lnet/minecraft/world/effect/MobEffect;IIZZ)V
/*    */     //   635: invokevirtual m_7292_ : (Lnet/minecraft/world/effect/MobEffectInstance;)Z
/*    */     //   638: pop
/*    */     //   639: goto -> 818
/*    */     //   642: aload #7
/*    */     //   644: instanceof net/minecraft/world/entity/TamableAnimal
/*    */     //   647: ifeq -> 818
/*    */     //   650: aload #7
/*    */     //   652: checkcast net/minecraft/world/entity/TamableAnimal
/*    */     //   655: astore #13
/*    */     //   657: aload #8
/*    */     //   659: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   662: ifeq -> 818
/*    */     //   665: aload #8
/*    */     //   667: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   670: astore #14
/*    */     //   672: aload #13
/*    */     //   674: aload #14
/*    */     //   676: invokevirtual m_21830_ : (Lnet/minecraft/world/entity/LivingEntity;)Z
/*    */     //   679: ifeq -> 818
/*    */     //   682: aload_0
/*    */     //   683: instanceof net/minecraft/server/level/ServerLevel
/*    */     //   686: ifeq -> 802
/*    */     //   689: aload_0
/*    */     //   690: checkcast net/minecraft/server/level/ServerLevel
/*    */     //   693: astore #15
/*    */     //   695: new net/ltxprogrammer/turned/entity/HertxSitEntity
/*    */     //   698: dup
/*    */     //   699: getstatic net/ltxprogrammer/turned/init/LatexModEntities.HERTX_SIT : Lnet/minecraftforge/registries/RegistryObject;
/*    */     //   702: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   705: checkcast net/minecraft/world/entity/EntityType
/*    */     //   708: aload #15
/*    */     //   710: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
/*    */     //   713: astore #16
/*    */     //   715: aload #16
/*    */     //   717: dload_1
/*    */     //   718: dload_3
/*    */     //   719: dload #5
/*    */     //   721: aload #7
/*    */     //   723: invokevirtual m_146908_ : ()F
/*    */     //   726: aload #7
/*    */     //   728: invokevirtual m_146909_ : ()F
/*    */     //   731: invokevirtual m_7678_ : (DDDFF)V
/*    */     //   734: aload #16
/*    */     //   736: aload #7
/*    */     //   738: invokevirtual m_146908_ : ()F
/*    */     //   741: invokevirtual m_5618_ : (F)V
/*    */     //   744: aload #16
/*    */     //   746: aload #7
/*    */     //   748: invokevirtual m_146908_ : ()F
/*    */     //   751: invokevirtual m_5616_ : (F)V
/*    */     //   754: aload #16
/*    */     //   756: instanceof net/minecraft/world/entity/Mob
/*    */     //   759: ifeq -> 793
/*    */     //   762: aload #16
/*    */     //   764: checkcast net/minecraft/world/entity/Mob
/*    */     //   767: astore #17
/*    */     //   769: aload #17
/*    */     //   771: aload #15
/*    */     //   773: aload_0
/*    */     //   774: aload #16
/*    */     //   776: invokevirtual m_142538_ : ()Lnet/minecraft/core/BlockPos;
/*    */     //   779: invokeinterface m_6436_ : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
/*    */     //   784: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
/*    */     //   787: aconst_null
/*    */     //   788: aconst_null
/*    */     //   789: invokevirtual m_6518_ : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
/*    */     //   792: pop
/*    */     //   793: aload_0
/*    */     //   794: aload #16
/*    */     //   796: invokeinterface m_7967_ : (Lnet/minecraft/world/entity/Entity;)Z
/*    */     //   801: pop
/*    */     //   802: aload #7
/*    */     //   804: getfield f_19853_ : Lnet/minecraft/world/level/Level;
/*    */     //   807: invokevirtual m_5776_ : ()Z
/*    */     //   810: ifne -> 818
/*    */     //   813: aload #7
/*    */     //   815: invokevirtual m_146870_ : ()V
/*    */     //   818: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #22	-> 0
/*    */     //   #23	-> 10
/*    */     //   #24	-> 11
/*    */     //   #25	-> 43
/*    */     //   #26	-> 49
/*    */     //   #27	-> 81
/*    */     //   #28	-> 121
/*    */     //   #29	-> 129
/*    */     //   #30	-> 135
/*    */     //   #31	-> 150
/*    */     //   #32	-> 170
/*    */     //   #33	-> 183
/*    */     //   #34	-> 203
/*    */     //   #35	-> 218
/*    */     //   #36	-> 236
/*    */     //   #37	-> 254
/*    */     //   #36	-> 257
/*    */     //   #38	-> 261
/*    */     //   #41	-> 264
/*    */     //   #42	-> 296
/*    */     //   #43	-> 302
/*    */     //   #44	-> 334
/*    */     //   #45	-> 374
/*    */     //   #46	-> 382
/*    */     //   #47	-> 388
/*    */     //   #48	-> 403
/*    */     //   #49	-> 423
/*    */     //   #50	-> 436
/*    */     //   #51	-> 456
/*    */     //   #52	-> 471
/*    */     //   #53	-> 489
/*    */     //   #54	-> 507
/*    */     //   #53	-> 510
/*    */     //   #55	-> 514
/*    */     //   #58	-> 517
/*    */     //   #59	-> 557
/*    */     //   #60	-> 565
/*    */     //   #61	-> 571
/*    */     //   #62	-> 603
/*    */     //   #63	-> 618
/*    */     //   #65	-> 642
/*    */     //   #66	-> 682
/*    */     //   #67	-> 695
/*    */     //   #68	-> 715
/*    */     //   #69	-> 734
/*    */     //   #70	-> 744
/*    */     //   #71	-> 754
/*    */     //   #72	-> 769
/*    */     //   #74	-> 793
/*    */     //   #76	-> 802
/*    */     //   #77	-> 813
/*    */     //   #79	-> 818
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   26	8	9	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   64	12	15	_tamEnt	Lnet/minecraft/world/entity/TamableAnimal;
/*    */     //   96	8	16	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   121	8	17	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   150	20	18	_entity	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   183	20	18	_level	Lnet/minecraft/server/level/ServerLevel;
/*    */     //   236	25	19	_stktoremove	Lnet/minecraft/world/item/ItemStack;
/*    */     //   218	43	18	_player	Lnet/minecraft/world/entity/player/Player;
/*    */     //   279	8	10	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   317	12	15	_tamEnt	Lnet/minecraft/world/entity/TamableAnimal;
/*    */     //   349	8	16	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   374	8	17	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   403	20	18	_entity	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   436	20	18	_level	Lnet/minecraft/server/level/ServerLevel;
/*    */     //   489	25	19	_stktoremove	Lnet/minecraft/world/item/ItemStack;
/*    */     //   471	43	18	_player	Lnet/minecraft/world/entity/player/Player;
/*    */     //   532	8	11	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   557	8	12	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   586	12	15	_tamEnt	Lnet/minecraft/world/entity/TamableAnimal;
/*    */     //   618	21	16	_entity	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   769	24	17	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
/*    */     //   715	87	16	entityToSpawn	Lnet/minecraft/world/entity/Entity;
/*    */     //   695	107	15	_level	Lnet/minecraft/server/level/ServerLevel;
/*    */     //   657	161	13	_tamIsTamedBy	Lnet/minecraft/world/entity/TamableAnimal;
/*    */     //   672	146	14	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   0	819	0	world	Lnet/minecraft/world/level/LevelAccessor;
/*    */     //   0	819	1	x	D
/*    */     //   0	819	3	y	D
/*    */     //   0	819	5	z	D
/*    */     //   0	819	7	entity	Lnet/minecraft/world/entity/Entity;
/*    */     //   0	819	8	sourceentity	Lnet/minecraft/world/entity/Entity;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\HertxRightClickedOnEntityProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */