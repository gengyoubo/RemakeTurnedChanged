/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ 
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class HertxFBSitRightClickedOnEntityProcedure {
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
/*    */     //   78: if_icmpne -> 565
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
/*    */     //   132: ifge -> 565
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
/*    */     //   261: goto -> 565
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
/*    */     //   315: ifge -> 389
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
/*    */     //   347: if_icmpne -> 565
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
/*    */     //   386: goto -> 565
/*    */     //   389: aload #7
/*    */     //   391: instanceof net/minecraft/world/entity/TamableAnimal
/*    */     //   394: ifeq -> 565
/*    */     //   397: aload #7
/*    */     //   399: checkcast net/minecraft/world/entity/TamableAnimal
/*    */     //   402: astore #12
/*    */     //   404: aload #8
/*    */     //   406: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   409: ifeq -> 565
/*    */     //   412: aload #8
/*    */     //   414: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   417: astore #13
/*    */     //   419: aload #12
/*    */     //   421: aload #13
/*    */     //   423: invokevirtual m_21830_ : (Lnet/minecraft/world/entity/LivingEntity;)Z
/*    */     //   426: ifeq -> 565
/*    */     //   429: aload_0
/*    */     //   430: instanceof net/minecraft/server/level/ServerLevel
/*    */     //   433: ifeq -> 549
/*    */     //   436: aload_0
/*    */     //   437: checkcast net/minecraft/server/level/ServerLevel
/*    */     //   440: astore #14
/*    */     //   442: new net/ltxprogrammer/turned/entity/HertxvarFBEntity
/*    */     //   445: dup
/*    */     //   446: getstatic net/ltxprogrammer/turned/init/LatexModEntities.HERTXVAR_FB : Lnet/minecraftforge/registries/RegistryObject;
/*    */     //   449: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   452: checkcast net/minecraft/world/entity/EntityType
/*    */     //   455: aload #14
/*    */     //   457: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
/*    */     //   460: astore #15
/*    */     //   462: aload #15
/*    */     //   464: dload_1
/*    */     //   465: dload_3
/*    */     //   466: dload #5
/*    */     //   468: aload #7
/*    */     //   470: invokevirtual m_146908_ : ()F
/*    */     //   473: aload #7
/*    */     //   475: invokevirtual m_146909_ : ()F
/*    */     //   478: invokevirtual m_7678_ : (DDDFF)V
/*    */     //   481: aload #15
/*    */     //   483: aload #7
/*    */     //   485: invokevirtual m_146908_ : ()F
/*    */     //   488: invokevirtual m_5618_ : (F)V
/*    */     //   491: aload #15
/*    */     //   493: aload #7
/*    */     //   495: invokevirtual m_146908_ : ()F
/*    */     //   498: invokevirtual m_5616_ : (F)V
/*    */     //   501: aload #15
/*    */     //   503: instanceof net/minecraft/world/entity/Mob
/*    */     //   506: ifeq -> 540
/*    */     //   509: aload #15
/*    */     //   511: checkcast net/minecraft/world/entity/Mob
/*    */     //   514: astore #16
/*    */     //   516: aload #16
/*    */     //   518: aload #14
/*    */     //   520: aload_0
/*    */     //   521: aload #15
/*    */     //   523: invokevirtual m_142538_ : ()Lnet/minecraft/core/BlockPos;
/*    */     //   526: invokeinterface m_6436_ : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
/*    */     //   531: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
/*    */     //   534: aconst_null
/*    */     //   535: aconst_null
/*    */     //   536: invokevirtual m_6518_ : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
/*    */     //   539: pop
/*    */     //   540: aload_0
/*    */     //   541: aload #15
/*    */     //   543: invokeinterface m_7967_ : (Lnet/minecraft/world/entity/Entity;)Z
/*    */     //   548: pop
/*    */     //   549: aload #7
/*    */     //   551: getfield f_19853_ : Lnet/minecraft/world/level/Level;
/*    */     //   554: invokevirtual m_5776_ : ()Z
/*    */     //   557: ifne -> 565
/*    */     //   560: aload #7
/*    */     //   562: invokevirtual m_146870_ : ()V
/*    */     //   565: return
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
/*    */     //   #47	-> 389
/*    */     //   #48	-> 429
/*    */     //   #49	-> 442
/*    */     //   #50	-> 462
/*    */     //   #51	-> 481
/*    */     //   #52	-> 491
/*    */     //   #53	-> 501
/*    */     //   #54	-> 516
/*    */     //   #56	-> 540
/*    */     //   #58	-> 549
/*    */     //   #59	-> 560
/*    */     //   #61	-> 565
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
/*    */     //   516	24	16	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
/*    */     //   462	87	15	entityToSpawn	Lnet/minecraft/world/entity/Entity;
/*    */     //   442	107	14	_level	Lnet/minecraft/server/level/ServerLevel;
/*    */     //   404	161	12	_tamIsTamedBy	Lnet/minecraft/world/entity/TamableAnimal;
/*    */     //   419	146	13	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   0	566	0	world	Lnet/minecraft/world/level/LevelAccessor;
/*    */     //   0	566	1	x	D
/*    */     //   0	566	3	y	D
/*    */     //   0	566	5	z	D
/*    */     //   0	566	7	entity	Lnet/minecraft/world/entity/Entity;
/*    */     //   0	566	8	sourceentity	Lnet/minecraft/world/entity/Entity;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\HertxFBSitRightClickedOnEntityProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */