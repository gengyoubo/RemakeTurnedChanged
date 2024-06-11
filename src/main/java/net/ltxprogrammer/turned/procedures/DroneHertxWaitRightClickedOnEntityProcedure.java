/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ 
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class DroneHertxWaitRightClickedOnEntityProcedure {
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
/*    */     //   62: astore #12
/*    */     //   64: aload #12
/*    */     //   66: invokevirtual m_21824_ : ()Z
/*    */     //   69: ifeq -> 76
/*    */     //   72: iconst_1
/*    */     //   73: goto -> 77
/*    */     //   76: iconst_0
/*    */     //   77: iconst_1
/*    */     //   78: if_icmpne -> 440
/*    */     //   81: aload #7
/*    */     //   83: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   86: ifeq -> 104
/*    */     //   89: aload #7
/*    */     //   91: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   94: astore #13
/*    */     //   96: aload #13
/*    */     //   98: invokevirtual m_21223_ : ()F
/*    */     //   101: goto -> 106
/*    */     //   104: ldc -1.0
/*    */     //   106: aload #7
/*    */     //   108: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   111: ifeq -> 129
/*    */     //   114: aload #7
/*    */     //   116: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   119: astore #14
/*    */     //   121: aload #14
/*    */     //   123: invokevirtual m_21233_ : ()F
/*    */     //   126: goto -> 131
/*    */     //   129: ldc -1.0
/*    */     //   131: fcmpg
/*    */     //   132: ifge -> 440
/*    */     //   135: aload #7
/*    */     //   137: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   140: ifeq -> 170
/*    */     //   143: aload #7
/*    */     //   145: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   148: astore #15
/*    */     //   150: aload #15
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
/*    */     //   181: astore #15
/*    */     //   183: aload #15
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
/*    */     //   216: astore #15
/*    */     //   218: new net/minecraft/world/item/ItemStack
/*    */     //   221: dup
/*    */     //   222: getstatic net/ltxprogrammer/changed/init/ChangedItems.DARK_LATEX_GOO : Lnet/minecraftforge/registries/RegistryObject;
/*    */     //   225: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   228: checkcast net/minecraft/world/level/ItemLike
/*    */     //   231: invokespecial <init> : (Lnet/minecraft/world/level/ItemLike;)V
/*    */     //   234: astore #16
/*    */     //   236: aload #15
/*    */     //   238: invokevirtual m_150109_ : ()Lnet/minecraft/world/entity/player/Inventory;
/*    */     //   241: aload #16
/*    */     //   243: <illegal opcode> test : (Lnet/minecraft/world/item/ItemStack;)Ljava/util/function/Predicate;
/*    */     //   248: iconst_1
/*    */     //   249: aload #15
/*    */     //   251: getfield f_36095_ : Lnet/minecraft/world/inventory/InventoryMenu;
/*    */     //   254: invokevirtual m_39730_ : ()Lnet/minecraft/world/inventory/CraftingContainer;
/*    */     //   257: invokevirtual m_36022_ : (Ljava/util/function/Predicate;ILnet/minecraft/world/Container;)I
/*    */     //   260: pop
/*    */     //   261: goto -> 440
/*    */     //   264: aload #7
/*    */     //   266: instanceof net/minecraft/world/entity/TamableAnimal
/*    */     //   269: ifeq -> 440
/*    */     //   272: aload #7
/*    */     //   274: checkcast net/minecraft/world/entity/TamableAnimal
/*    */     //   277: astore #10
/*    */     //   279: aload #8
/*    */     //   281: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   284: ifeq -> 440
/*    */     //   287: aload #8
/*    */     //   289: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   292: astore #11
/*    */     //   294: aload #10
/*    */     //   296: aload #11
/*    */     //   298: invokevirtual m_21830_ : (Lnet/minecraft/world/entity/LivingEntity;)Z
/*    */     //   301: ifeq -> 440
/*    */     //   304: aload_0
/*    */     //   305: instanceof net/minecraft/server/level/ServerLevel
/*    */     //   308: ifeq -> 424
/*    */     //   311: aload_0
/*    */     //   312: checkcast net/minecraft/server/level/ServerLevel
/*    */     //   315: astore #12
/*    */     //   317: new net/ltxprogrammer/turned/entity/DroneHertxEntity
/*    */     //   320: dup
/*    */     //   321: getstatic net/ltxprogrammer/turned/init/LatexModEntities.DRONE_HERTX : Lnet/minecraftforge/registries/RegistryObject;
/*    */     //   324: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   327: checkcast net/minecraft/world/entity/EntityType
/*    */     //   330: aload #12
/*    */     //   332: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
/*    */     //   335: astore #13
/*    */     //   337: aload #13
/*    */     //   339: dload_1
/*    */     //   340: dload_3
/*    */     //   341: dload #5
/*    */     //   343: aload #7
/*    */     //   345: invokevirtual m_146908_ : ()F
/*    */     //   348: aload #7
/*    */     //   350: invokevirtual m_146909_ : ()F
/*    */     //   353: invokevirtual m_7678_ : (DDDFF)V
/*    */     //   356: aload #13
/*    */     //   358: aload #7
/*    */     //   360: invokevirtual m_146908_ : ()F
/*    */     //   363: invokevirtual m_5618_ : (F)V
/*    */     //   366: aload #13
/*    */     //   368: aload #7
/*    */     //   370: invokevirtual m_146908_ : ()F
/*    */     //   373: invokevirtual m_5616_ : (F)V
/*    */     //   376: aload #13
/*    */     //   378: instanceof net/minecraft/world/entity/Mob
/*    */     //   381: ifeq -> 415
/*    */     //   384: aload #13
/*    */     //   386: checkcast net/minecraft/world/entity/Mob
/*    */     //   389: astore #14
/*    */     //   391: aload #14
/*    */     //   393: aload #12
/*    */     //   395: aload_0
/*    */     //   396: aload #13
/*    */     //   398: invokevirtual m_142538_ : ()Lnet/minecraft/core/BlockPos;
/*    */     //   401: invokeinterface m_6436_ : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
/*    */     //   406: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
/*    */     //   409: aconst_null
/*    */     //   410: aconst_null
/*    */     //   411: invokevirtual m_6518_ : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
/*    */     //   414: pop
/*    */     //   415: aload_0
/*    */     //   416: aload #13
/*    */     //   418: invokeinterface m_7967_ : (Lnet/minecraft/world/entity/Entity;)Z
/*    */     //   423: pop
/*    */     //   424: aload #7
/*    */     //   426: getfield f_19853_ : Lnet/minecraft/world/level/Level;
/*    */     //   429: invokevirtual m_5776_ : ()Z
/*    */     //   432: ifne -> 440
/*    */     //   435: aload #7
/*    */     //   437: invokevirtual m_146870_ : ()V
/*    */     //   440: return
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
/*    */     //   #42	-> 317
/*    */     //   #43	-> 337
/*    */     //   #44	-> 356
/*    */     //   #45	-> 366
/*    */     //   #46	-> 376
/*    */     //   #47	-> 391
/*    */     //   #49	-> 415
/*    */     //   #51	-> 424
/*    */     //   #52	-> 435
/*    */     //   #54	-> 440
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   26	8	9	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   64	12	12	_tamEnt	Lnet/minecraft/world/entity/TamableAnimal;
/*    */     //   96	8	13	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   121	8	14	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   150	20	15	_entity	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   183	20	15	_level	Lnet/minecraft/server/level/ServerLevel;
/*    */     //   236	25	16	_stktoremove	Lnet/minecraft/world/item/ItemStack;
/*    */     //   218	43	15	_player	Lnet/minecraft/world/entity/player/Player;
/*    */     //   391	24	14	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
/*    */     //   337	87	13	entityToSpawn	Lnet/minecraft/world/entity/Entity;
/*    */     //   317	107	12	_level	Lnet/minecraft/server/level/ServerLevel;
/*    */     //   279	161	10	_tamIsTamedBy	Lnet/minecraft/world/entity/TamableAnimal;
/*    */     //   294	146	11	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   0	441	0	world	Lnet/minecraft/world/level/LevelAccessor;
/*    */     //   0	441	1	x	D
/*    */     //   0	441	3	y	D
/*    */     //   0	441	5	z	D
/*    */     //   0	441	7	entity	Lnet/minecraft/world/entity/Entity;
/*    */     //   0	441	8	sourceentity	Lnet/minecraft/world/entity/Entity;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\DroneHertxWaitRightClickedOnEntityProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */