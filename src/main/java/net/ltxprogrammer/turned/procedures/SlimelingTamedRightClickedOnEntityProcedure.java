/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ 
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class SlimelingTamedRightClickedOnEntityProcedure {
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
/*    */     //   62: astore #14
/*    */     //   64: aload #14
/*    */     //   66: invokevirtual m_21824_ : ()Z
/*    */     //   69: ifeq -> 76
/*    */     //   72: iconst_1
/*    */     //   73: goto -> 77
/*    */     //   76: iconst_0
/*    */     //   77: iconst_1
/*    */     //   78: if_icmpne -> 938
/*    */     //   81: aload #7
/*    */     //   83: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   86: ifeq -> 104
/*    */     //   89: aload #7
/*    */     //   91: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   94: astore #15
/*    */     //   96: aload #15
/*    */     //   98: invokevirtual m_21223_ : ()F
/*    */     //   101: goto -> 106
/*    */     //   104: ldc -1.0
/*    */     //   106: aload #7
/*    */     //   108: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   111: ifeq -> 129
/*    */     //   114: aload #7
/*    */     //   116: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   119: astore #16
/*    */     //   121: aload #16
/*    */     //   123: invokevirtual m_21233_ : ()F
/*    */     //   126: goto -> 131
/*    */     //   129: ldc -1.0
/*    */     //   131: fcmpg
/*    */     //   132: ifge -> 938
/*    */     //   135: aload #7
/*    */     //   137: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   140: ifeq -> 170
/*    */     //   143: aload #7
/*    */     //   145: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   148: astore #17
/*    */     //   150: aload #17
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
/*    */     //   181: astore #17
/*    */     //   183: aload #17
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
/*    */     //   216: astore #17
/*    */     //   218: new net/minecraft/world/item/ItemStack
/*    */     //   221: dup
/*    */     //   222: getstatic net/ltxprogrammer/changed/init/ChangedItems.DARK_LATEX_GOO : Lnet/minecraftforge/registries/RegistryObject;
/*    */     //   225: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   228: checkcast net/minecraft/world/level/ItemLike
/*    */     //   231: invokespecial <init> : (Lnet/minecraft/world/level/ItemLike;)V
/*    */     //   234: astore #18
/*    */     //   236: aload #17
/*    */     //   238: invokevirtual m_150109_ : ()Lnet/minecraft/world/entity/player/Inventory;
/*    */     //   241: aload #18
/*    */     //   243: <illegal opcode> test : (Lnet/minecraft/world/item/ItemStack;)Ljava/util/function/Predicate;
/*    */     //   248: iconst_1
/*    */     //   249: aload #17
/*    */     //   251: getfield f_36095_ : Lnet/minecraft/world/inventory/InventoryMenu;
/*    */     //   254: invokevirtual m_39730_ : ()Lnet/minecraft/world/inventory/CraftingContainer;
/*    */     //   257: invokevirtual m_36022_ : (Ljava/util/function/Predicate;ILnet/minecraft/world/Container;)I
/*    */     //   260: pop
/*    */     //   261: goto -> 938
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
/*    */     //   315: astore #14
/*    */     //   317: aload #14
/*    */     //   319: invokevirtual m_21824_ : ()Z
/*    */     //   322: ifeq -> 329
/*    */     //   325: iconst_1
/*    */     //   326: goto -> 330
/*    */     //   329: iconst_0
/*    */     //   330: iconst_1
/*    */     //   331: if_icmpne -> 938
/*    */     //   334: aload #7
/*    */     //   336: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   339: ifeq -> 357
/*    */     //   342: aload #7
/*    */     //   344: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   347: astore #15
/*    */     //   349: aload #15
/*    */     //   351: invokevirtual m_21223_ : ()F
/*    */     //   354: goto -> 359
/*    */     //   357: ldc -1.0
/*    */     //   359: aload #7
/*    */     //   361: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   364: ifeq -> 382
/*    */     //   367: aload #7
/*    */     //   369: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   372: astore #16
/*    */     //   374: aload #16
/*    */     //   376: invokevirtual m_21233_ : ()F
/*    */     //   379: goto -> 384
/*    */     //   382: ldc -1.0
/*    */     //   384: fcmpg
/*    */     //   385: ifge -> 938
/*    */     //   388: aload #7
/*    */     //   390: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   393: ifeq -> 423
/*    */     //   396: aload #7
/*    */     //   398: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   401: astore #17
/*    */     //   403: aload #17
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
/*    */     //   434: astore #17
/*    */     //   436: aload #17
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
/*    */     //   469: astore #17
/*    */     //   471: new net/minecraft/world/item/ItemStack
/*    */     //   474: dup
/*    */     //   475: getstatic net/ltxprogrammer/turned/init/LatexModItems.LATEX_SOUP : Lnet/minecraftforge/registries/RegistryObject;
/*    */     //   478: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   481: checkcast net/minecraft/world/level/ItemLike
/*    */     //   484: invokespecial <init> : (Lnet/minecraft/world/level/ItemLike;)V
/*    */     //   487: astore #18
/*    */     //   489: aload #17
/*    */     //   491: invokevirtual m_150109_ : ()Lnet/minecraft/world/entity/player/Inventory;
/*    */     //   494: aload #18
/*    */     //   496: <illegal opcode> test : (Lnet/minecraft/world/item/ItemStack;)Ljava/util/function/Predicate;
/*    */     //   501: iconst_1
/*    */     //   502: aload #17
/*    */     //   504: getfield f_36095_ : Lnet/minecraft/world/inventory/InventoryMenu;
/*    */     //   507: invokevirtual m_39730_ : ()Lnet/minecraft/world/inventory/CraftingContainer;
/*    */     //   510: invokevirtual m_36022_ : (Ljava/util/function/Predicate;ILnet/minecraft/world/Container;)I
/*    */     //   513: pop
/*    */     //   514: goto -> 938
/*    */     //   517: aload #8
/*    */     //   519: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   522: ifeq -> 540
/*    */     //   525: aload #8
/*    */     //   527: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   530: astore #11
/*    */     //   532: aload #11
/*    */     //   534: invokevirtual m_21205_ : ()Lnet/minecraft/world/item/ItemStack;
/*    */     //   537: goto -> 543
/*    */     //   540: getstatic net/minecraft/world/item/ItemStack.f_41583_ : Lnet/minecraft/world/item/ItemStack;
/*    */     //   543: invokevirtual m_41720_ : ()Lnet/minecraft/world/item/Item;
/*    */     //   546: getstatic net/minecraft/world/item/Items.f_42518_ : Lnet/minecraft/world/item/Item;
/*    */     //   549: if_acmpne -> 762
/*    */     //   552: aload #7
/*    */     //   554: instanceof net/minecraft/world/entity/TamableAnimal
/*    */     //   557: ifeq -> 579
/*    */     //   560: aload #7
/*    */     //   562: checkcast net/minecraft/world/entity/TamableAnimal
/*    */     //   565: astore #14
/*    */     //   567: aload #14
/*    */     //   569: invokevirtual m_21824_ : ()Z
/*    */     //   572: ifeq -> 579
/*    */     //   575: iconst_1
/*    */     //   576: goto -> 580
/*    */     //   579: iconst_0
/*    */     //   580: iconst_1
/*    */     //   581: if_icmpne -> 938
/*    */     //   584: aload #7
/*    */     //   586: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   589: ifeq -> 607
/*    */     //   592: aload #7
/*    */     //   594: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   597: astore #15
/*    */     //   599: aload #15
/*    */     //   601: invokevirtual m_21223_ : ()F
/*    */     //   604: goto -> 609
/*    */     //   607: ldc -1.0
/*    */     //   609: aload #7
/*    */     //   611: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   614: ifeq -> 632
/*    */     //   617: aload #7
/*    */     //   619: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   622: astore #16
/*    */     //   624: aload #16
/*    */     //   626: invokevirtual m_21233_ : ()F
/*    */     //   629: goto -> 634
/*    */     //   632: ldc -1.0
/*    */     //   634: fcmpg
/*    */     //   635: ifge -> 938
/*    */     //   638: aload #7
/*    */     //   640: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   643: ifeq -> 674
/*    */     //   646: aload #7
/*    */     //   648: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   651: astore #17
/*    */     //   653: aload #17
/*    */     //   655: new net/minecraft/world/effect/MobEffectInstance
/*    */     //   658: dup
/*    */     //   659: getstatic net/minecraft/world/effect/MobEffects.f_19605_ : Lnet/minecraft/world/effect/MobEffect;
/*    */     //   662: bipush #120
/*    */     //   664: iconst_1
/*    */     //   665: iconst_0
/*    */     //   666: iconst_0
/*    */     //   667: invokespecial <init> : (Lnet/minecraft/world/effect/MobEffect;IIZZ)V
/*    */     //   670: invokevirtual m_7292_ : (Lnet/minecraft/world/effect/MobEffectInstance;)Z
/*    */     //   673: pop
/*    */     //   674: aload_0
/*    */     //   675: instanceof net/minecraft/server/level/ServerLevel
/*    */     //   678: ifeq -> 707
/*    */     //   681: aload_0
/*    */     //   682: checkcast net/minecraft/server/level/ServerLevel
/*    */     //   685: astore #17
/*    */     //   687: aload #17
/*    */     //   689: getstatic net/minecraft/core/particles/ParticleTypes.f_123748_ : Lnet/minecraft/core/particles/SimpleParticleType;
/*    */     //   692: dload_1
/*    */     //   693: dload_3
/*    */     //   694: dload #5
/*    */     //   696: iconst_5
/*    */     //   697: dconst_1
/*    */     //   698: ldc2_w 2.0
/*    */     //   701: dconst_1
/*    */     //   702: dconst_1
/*    */     //   703: invokevirtual m_8767_ : (Lnet/minecraft/core/particles/ParticleOptions;DDDIDDDD)I
/*    */     //   706: pop
/*    */     //   707: aload #7
/*    */     //   709: instanceof net/minecraft/world/entity/player/Player
/*    */     //   712: ifeq -> 759
/*    */     //   715: aload #7
/*    */     //   717: checkcast net/minecraft/world/entity/player/Player
/*    */     //   720: astore #17
/*    */     //   722: new net/minecraft/world/item/ItemStack
/*    */     //   725: dup
/*    */     //   726: getstatic net/minecraft/world/item/Items.f_42518_ : Lnet/minecraft/world/item/Item;
/*    */     //   729: invokespecial <init> : (Lnet/minecraft/world/level/ItemLike;)V
/*    */     //   732: astore #18
/*    */     //   734: aload #17
/*    */     //   736: invokevirtual m_150109_ : ()Lnet/minecraft/world/entity/player/Inventory;
/*    */     //   739: aload #18
/*    */     //   741: <illegal opcode> test : (Lnet/minecraft/world/item/ItemStack;)Ljava/util/function/Predicate;
/*    */     //   746: iconst_1
/*    */     //   747: aload #17
/*    */     //   749: getfield f_36095_ : Lnet/minecraft/world/inventory/InventoryMenu;
/*    */     //   752: invokevirtual m_39730_ : ()Lnet/minecraft/world/inventory/CraftingContainer;
/*    */     //   755: invokevirtual m_36022_ : (Ljava/util/function/Predicate;ILnet/minecraft/world/Container;)I
/*    */     //   758: pop
/*    */     //   759: goto -> 938
/*    */     //   762: aload #7
/*    */     //   764: instanceof net/minecraft/world/entity/TamableAnimal
/*    */     //   767: ifeq -> 938
/*    */     //   770: aload #7
/*    */     //   772: checkcast net/minecraft/world/entity/TamableAnimal
/*    */     //   775: astore #12
/*    */     //   777: aload #8
/*    */     //   779: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   782: ifeq -> 938
/*    */     //   785: aload #8
/*    */     //   787: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   790: astore #13
/*    */     //   792: aload #12
/*    */     //   794: aload #13
/*    */     //   796: invokevirtual m_21830_ : (Lnet/minecraft/world/entity/LivingEntity;)Z
/*    */     //   799: ifeq -> 938
/*    */     //   802: aload_0
/*    */     //   803: instanceof net/minecraft/server/level/ServerLevel
/*    */     //   806: ifeq -> 922
/*    */     //   809: aload_0
/*    */     //   810: checkcast net/minecraft/server/level/ServerLevel
/*    */     //   813: astore #14
/*    */     //   815: new net/ltxprogrammer/turned/entity/SlimelingtamedsitEntity
/*    */     //   818: dup
/*    */     //   819: getstatic net/ltxprogrammer/turned/init/LatexModEntities.SLIMELINGTAMEDSIT : Lnet/minecraftforge/registries/RegistryObject;
/*    */     //   822: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   825: checkcast net/minecraft/world/entity/EntityType
/*    */     //   828: aload #14
/*    */     //   830: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
/*    */     //   833: astore #15
/*    */     //   835: aload #15
/*    */     //   837: dload_1
/*    */     //   838: dload_3
/*    */     //   839: dload #5
/*    */     //   841: aload #7
/*    */     //   843: invokevirtual m_146908_ : ()F
/*    */     //   846: aload #7
/*    */     //   848: invokevirtual m_146909_ : ()F
/*    */     //   851: invokevirtual m_7678_ : (DDDFF)V
/*    */     //   854: aload #15
/*    */     //   856: aload #7
/*    */     //   858: invokevirtual m_146908_ : ()F
/*    */     //   861: invokevirtual m_5618_ : (F)V
/*    */     //   864: aload #15
/*    */     //   866: aload #7
/*    */     //   868: invokevirtual m_146908_ : ()F
/*    */     //   871: invokevirtual m_5616_ : (F)V
/*    */     //   874: aload #15
/*    */     //   876: instanceof net/minecraft/world/entity/Mob
/*    */     //   879: ifeq -> 913
/*    */     //   882: aload #15
/*    */     //   884: checkcast net/minecraft/world/entity/Mob
/*    */     //   887: astore #16
/*    */     //   889: aload #16
/*    */     //   891: aload #14
/*    */     //   893: aload_0
/*    */     //   894: aload #15
/*    */     //   896: invokevirtual m_142538_ : ()Lnet/minecraft/core/BlockPos;
/*    */     //   899: invokeinterface m_6436_ : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
/*    */     //   904: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
/*    */     //   907: aconst_null
/*    */     //   908: aconst_null
/*    */     //   909: invokevirtual m_6518_ : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
/*    */     //   912: pop
/*    */     //   913: aload_0
/*    */     //   914: aload #15
/*    */     //   916: invokeinterface m_7967_ : (Lnet/minecraft/world/entity/Entity;)Z
/*    */     //   921: pop
/*    */     //   922: aload #7
/*    */     //   924: getfield f_19853_ : Lnet/minecraft/world/level/Level;
/*    */     //   927: invokevirtual m_5776_ : ()Z
/*    */     //   930: ifne -> 938
/*    */     //   933: aload #7
/*    */     //   935: invokevirtual m_146870_ : ()V
/*    */     //   938: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #23	-> 0
/*    */     //   #24	-> 10
/*    */     //   #25	-> 11
/*    */     //   #26	-> 43
/*    */     //   #27	-> 49
/*    */     //   #28	-> 81
/*    */     //   #29	-> 121
/*    */     //   #30	-> 129
/*    */     //   #31	-> 135
/*    */     //   #32	-> 150
/*    */     //   #33	-> 170
/*    */     //   #34	-> 183
/*    */     //   #35	-> 203
/*    */     //   #36	-> 218
/*    */     //   #37	-> 236
/*    */     //   #38	-> 254
/*    */     //   #37	-> 257
/*    */     //   #39	-> 261
/*    */     //   #42	-> 264
/*    */     //   #43	-> 296
/*    */     //   #44	-> 302
/*    */     //   #45	-> 334
/*    */     //   #46	-> 374
/*    */     //   #47	-> 382
/*    */     //   #48	-> 388
/*    */     //   #49	-> 403
/*    */     //   #50	-> 423
/*    */     //   #51	-> 436
/*    */     //   #52	-> 456
/*    */     //   #53	-> 471
/*    */     //   #54	-> 489
/*    */     //   #55	-> 507
/*    */     //   #54	-> 510
/*    */     //   #56	-> 514
/*    */     //   #59	-> 517
/*    */     //   #60	-> 552
/*    */     //   #61	-> 584
/*    */     //   #62	-> 624
/*    */     //   #63	-> 632
/*    */     //   #64	-> 638
/*    */     //   #65	-> 653
/*    */     //   #66	-> 674
/*    */     //   #67	-> 687
/*    */     //   #68	-> 707
/*    */     //   #69	-> 722
/*    */     //   #70	-> 734
/*    */     //   #71	-> 752
/*    */     //   #70	-> 755
/*    */     //   #72	-> 759
/*    */     //   #75	-> 762
/*    */     //   #76	-> 802
/*    */     //   #77	-> 815
/*    */     //   #78	-> 835
/*    */     //   #79	-> 854
/*    */     //   #80	-> 864
/*    */     //   #81	-> 874
/*    */     //   #82	-> 889
/*    */     //   #84	-> 913
/*    */     //   #86	-> 922
/*    */     //   #87	-> 933
/*    */     //   #89	-> 938
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   26	8	9	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   64	12	14	_tamEnt	Lnet/minecraft/world/entity/TamableAnimal;
/*    */     //   96	8	15	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   121	8	16	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   150	20	17	_entity	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   183	20	17	_level	Lnet/minecraft/server/level/ServerLevel;
/*    */     //   236	25	18	_stktoremove	Lnet/minecraft/world/item/ItemStack;
/*    */     //   218	43	17	_player	Lnet/minecraft/world/entity/player/Player;
/*    */     //   279	8	10	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   317	12	14	_tamEnt	Lnet/minecraft/world/entity/TamableAnimal;
/*    */     //   349	8	15	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   374	8	16	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   403	20	17	_entity	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   436	20	17	_level	Lnet/minecraft/server/level/ServerLevel;
/*    */     //   489	25	18	_stktoremove	Lnet/minecraft/world/item/ItemStack;
/*    */     //   471	43	17	_player	Lnet/minecraft/world/entity/player/Player;
/*    */     //   532	8	11	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   567	12	14	_tamEnt	Lnet/minecraft/world/entity/TamableAnimal;
/*    */     //   599	8	15	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   624	8	16	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   653	21	17	_entity	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   687	20	17	_level	Lnet/minecraft/server/level/ServerLevel;
/*    */     //   734	25	18	_stktoremove	Lnet/minecraft/world/item/ItemStack;
/*    */     //   722	37	17	_player	Lnet/minecraft/world/entity/player/Player;
/*    */     //   889	24	16	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
/*    */     //   835	87	15	entityToSpawn	Lnet/minecraft/world/entity/Entity;
/*    */     //   815	107	14	_level	Lnet/minecraft/server/level/ServerLevel;
/*    */     //   777	161	12	_tamIsTamedBy	Lnet/minecraft/world/entity/TamableAnimal;
/*    */     //   792	146	13	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   0	939	0	world	Lnet/minecraft/world/level/LevelAccessor;
/*    */     //   0	939	1	x	D
/*    */     //   0	939	3	y	D
/*    */     //   0	939	5	z	D
/*    */     //   0	939	7	entity	Lnet/minecraft/world/entity/Entity;
/*    */     //   0	939	8	sourceentity	Lnet/minecraft/world/entity/Entity;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\SlimelingTamedRightClickedOnEntityProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */