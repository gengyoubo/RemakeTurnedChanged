/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ 
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class AHVHertxRightClickedOnEntityProcedure {
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
/*    */     //   78: if_icmpne -> 602
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
/*    */     //   132: ifge -> 602
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
/*    */     //   261: goto -> 602
/*    */     //   264: aload #8
/*    */     //   266: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   269: ifeq -> 287
/*    */     //   272: aload #8
/*    */     //   274: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   277: astore #10
/*    */     //   279: aload #10
/*    */     //   281: invokevirtual m_21223_ : ()F
/*    */     //   284: goto -> 289
/*    */     //   287: ldc -1.0
/*    */     //   289: aload #8
/*    */     //   291: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   294: ifeq -> 312
/*    */     //   297: aload #8
/*    */     //   299: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   302: astore #11
/*    */     //   304: aload #11
/*    */     //   306: invokevirtual m_21233_ : ()F
/*    */     //   309: goto -> 314
/*    */     //   312: ldc -1.0
/*    */     //   314: fcmpg
/*    */     //   315: ifge -> 426
/*    */     //   318: aload #7
/*    */     //   320: instanceof net/minecraft/world/entity/TamableAnimal
/*    */     //   323: ifeq -> 345
/*    */     //   326: aload #7
/*    */     //   328: checkcast net/minecraft/world/entity/TamableAnimal
/*    */     //   331: astore #14
/*    */     //   333: aload #14
/*    */     //   335: invokevirtual m_21824_ : ()Z
/*    */     //   338: ifeq -> 345
/*    */     //   341: iconst_1
/*    */     //   342: goto -> 346
/*    */     //   345: iconst_0
/*    */     //   346: iconst_1
/*    */     //   347: if_icmpne -> 602
/*    */     //   350: aload #8
/*    */     //   352: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   355: ifeq -> 386
/*    */     //   358: aload #8
/*    */     //   360: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   363: astore #15
/*    */     //   365: aload #15
/*    */     //   367: new net/minecraft/world/effect/MobEffectInstance
/*    */     //   370: dup
/*    */     //   371: getstatic net/minecraft/world/effect/MobEffects.f_19605_ : Lnet/minecraft/world/effect/MobEffect;
/*    */     //   374: bipush #100
/*    */     //   376: iconst_1
/*    */     //   377: iconst_0
/*    */     //   378: iconst_0
/*    */     //   379: invokespecial <init> : (Lnet/minecraft/world/effect/MobEffect;IIZZ)V
/*    */     //   382: invokevirtual m_7292_ : (Lnet/minecraft/world/effect/MobEffectInstance;)Z
/*    */     //   385: pop
/*    */     //   386: aload #8
/*    */     //   388: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   391: ifeq -> 423
/*    */     //   394: aload #8
/*    */     //   396: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   399: astore #15
/*    */     //   401: aload #15
/*    */     //   403: new net/minecraft/world/effect/MobEffectInstance
/*    */     //   406: dup
/*    */     //   407: getstatic net/minecraft/world/effect/MobEffects.f_19621_ : Lnet/minecraft/world/effect/MobEffect;
/*    */     //   410: sipush #250
/*    */     //   413: iconst_1
/*    */     //   414: iconst_0
/*    */     //   415: iconst_0
/*    */     //   416: invokespecial <init> : (Lnet/minecraft/world/effect/MobEffect;IIZZ)V
/*    */     //   419: invokevirtual m_7292_ : (Lnet/minecraft/world/effect/MobEffectInstance;)Z
/*    */     //   422: pop
/*    */     //   423: goto -> 602
/*    */     //   426: aload #7
/*    */     //   428: instanceof net/minecraft/world/entity/TamableAnimal
/*    */     //   431: ifeq -> 602
/*    */     //   434: aload #7
/*    */     //   436: checkcast net/minecraft/world/entity/TamableAnimal
/*    */     //   439: astore #12
/*    */     //   441: aload #8
/*    */     //   443: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   446: ifeq -> 602
/*    */     //   449: aload #8
/*    */     //   451: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   454: astore #13
/*    */     //   456: aload #12
/*    */     //   458: aload #13
/*    */     //   460: invokevirtual m_21830_ : (Lnet/minecraft/world/entity/LivingEntity;)Z
/*    */     //   463: ifeq -> 602
/*    */     //   466: aload_0
/*    */     //   467: instanceof net/minecraft/server/level/ServerLevel
/*    */     //   470: ifeq -> 586
/*    */     //   473: aload_0
/*    */     //   474: checkcast net/minecraft/server/level/ServerLevel
/*    */     //   477: astore #14
/*    */     //   479: new net/ltxprogrammer/turned/entity/AHVHertxSitEntity
/*    */     //   482: dup
/*    */     //   483: getstatic net/ltxprogrammer/turned/init/LatexModEntities.AHV_HERTX_SIT : Lnet/minecraftforge/registries/RegistryObject;
/*    */     //   486: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   489: checkcast net/minecraft/world/entity/EntityType
/*    */     //   492: aload #14
/*    */     //   494: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
/*    */     //   497: astore #15
/*    */     //   499: aload #15
/*    */     //   501: dload_1
/*    */     //   502: dload_3
/*    */     //   503: dload #5
/*    */     //   505: aload #7
/*    */     //   507: invokevirtual m_146908_ : ()F
/*    */     //   510: aload #7
/*    */     //   512: invokevirtual m_146909_ : ()F
/*    */     //   515: invokevirtual m_7678_ : (DDDFF)V
/*    */     //   518: aload #15
/*    */     //   520: aload #7
/*    */     //   522: invokevirtual m_146908_ : ()F
/*    */     //   525: invokevirtual m_5618_ : (F)V
/*    */     //   528: aload #15
/*    */     //   530: aload #7
/*    */     //   532: invokevirtual m_146908_ : ()F
/*    */     //   535: invokevirtual m_5616_ : (F)V
/*    */     //   538: aload #15
/*    */     //   540: instanceof net/minecraft/world/entity/Mob
/*    */     //   543: ifeq -> 577
/*    */     //   546: aload #15
/*    */     //   548: checkcast net/minecraft/world/entity/Mob
/*    */     //   551: astore #16
/*    */     //   553: aload #16
/*    */     //   555: aload #14
/*    */     //   557: aload_0
/*    */     //   558: aload #15
/*    */     //   560: invokevirtual m_142538_ : ()Lnet/minecraft/core/BlockPos;
/*    */     //   563: invokeinterface m_6436_ : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
/*    */     //   568: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
/*    */     //   571: aconst_null
/*    */     //   572: aconst_null
/*    */     //   573: invokevirtual m_6518_ : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
/*    */     //   576: pop
/*    */     //   577: aload_0
/*    */     //   578: aload #15
/*    */     //   580: invokeinterface m_7967_ : (Lnet/minecraft/world/entity/Entity;)Z
/*    */     //   585: pop
/*    */     //   586: aload #7
/*    */     //   588: getfield f_19853_ : Lnet/minecraft/world/level/Level;
/*    */     //   591: invokevirtual m_5776_ : ()Z
/*    */     //   594: ifne -> 602
/*    */     //   597: aload #7
/*    */     //   599: invokevirtual m_146870_ : ()V
/*    */     //   602: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #21	-> 0
/*    */     //   #22	-> 10
/*    */     //   #23	-> 11
/*    */     //   #24	-> 43
/*    */     //   #25	-> 49
/*    */     //   #26	-> 81
/*    */     //   #27	-> 121
/*    */     //   #28	-> 129
/*    */     //   #29	-> 135
/*    */     //   #30	-> 150
/*    */     //   #31	-> 170
/*    */     //   #32	-> 183
/*    */     //   #33	-> 203
/*    */     //   #34	-> 218
/*    */     //   #35	-> 236
/*    */     //   #36	-> 254
/*    */     //   #35	-> 257
/*    */     //   #37	-> 261
/*    */     //   #40	-> 264
/*    */     //   #41	-> 304
/*    */     //   #42	-> 312
/*    */     //   #43	-> 318
/*    */     //   #44	-> 350
/*    */     //   #45	-> 365
/*    */     //   #46	-> 386
/*    */     //   #47	-> 401
/*    */     //   #49	-> 426
/*    */     //   #50	-> 466
/*    */     //   #51	-> 479
/*    */     //   #52	-> 499
/*    */     //   #53	-> 518
/*    */     //   #54	-> 528
/*    */     //   #55	-> 538
/*    */     //   #56	-> 553
/*    */     //   #58	-> 577
/*    */     //   #60	-> 586
/*    */     //   #61	-> 597
/*    */     //   #63	-> 602
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
/*    */     //   304	8	11	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   333	12	14	_tamEnt	Lnet/minecraft/world/entity/TamableAnimal;
/*    */     //   365	21	15	_entity	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   401	22	15	_entity	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   553	24	16	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
/*    */     //   499	87	15	entityToSpawn	Lnet/minecraft/world/entity/Entity;
/*    */     //   479	107	14	_level	Lnet/minecraft/server/level/ServerLevel;
/*    */     //   441	161	12	_tamIsTamedBy	Lnet/minecraft/world/entity/TamableAnimal;
/*    */     //   456	146	13	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   0	603	0	world	Lnet/minecraft/world/level/LevelAccessor;
/*    */     //   0	603	1	x	D
/*    */     //   0	603	3	y	D
/*    */     //   0	603	5	z	D
/*    */     //   0	603	7	entity	Lnet/minecraft/world/entity/Entity;
/*    */     //   0	603	8	sourceentity	Lnet/minecraft/world/entity/Entity;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\AHVHertxRightClickedOnEntityProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */