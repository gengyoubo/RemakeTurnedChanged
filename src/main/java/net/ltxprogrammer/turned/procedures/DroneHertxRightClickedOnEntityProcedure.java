/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ 
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class DroneHertxRightClickedOnEntityProcedure {
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
/*    */     //   40: getstatic net/minecraft/world/item/Items.f_42416_ : Lnet/minecraft/world/item/Item;
/*    */     //   43: if_acmpne -> 255
/*    */     //   46: aload #7
/*    */     //   48: instanceof net/minecraft/world/entity/TamableAnimal
/*    */     //   51: ifeq -> 73
/*    */     //   54: aload #7
/*    */     //   56: checkcast net/minecraft/world/entity/TamableAnimal
/*    */     //   59: astore #12
/*    */     //   61: aload #12
/*    */     //   63: invokevirtual m_21824_ : ()Z
/*    */     //   66: ifeq -> 73
/*    */     //   69: iconst_1
/*    */     //   70: goto -> 74
/*    */     //   73: iconst_0
/*    */     //   74: iconst_1
/*    */     //   75: if_icmpne -> 431
/*    */     //   78: aload #7
/*    */     //   80: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   83: ifeq -> 101
/*    */     //   86: aload #7
/*    */     //   88: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   91: astore #13
/*    */     //   93: aload #13
/*    */     //   95: invokevirtual m_21223_ : ()F
/*    */     //   98: goto -> 103
/*    */     //   101: ldc -1.0
/*    */     //   103: aload #7
/*    */     //   105: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   108: ifeq -> 126
/*    */     //   111: aload #7
/*    */     //   113: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   116: astore #14
/*    */     //   118: aload #14
/*    */     //   120: invokevirtual m_21233_ : ()F
/*    */     //   123: goto -> 128
/*    */     //   126: ldc -1.0
/*    */     //   128: fcmpg
/*    */     //   129: ifge -> 431
/*    */     //   132: aload #7
/*    */     //   134: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   137: ifeq -> 167
/*    */     //   140: aload #7
/*    */     //   142: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   145: astore #15
/*    */     //   147: aload #15
/*    */     //   149: new net/minecraft/world/effect/MobEffectInstance
/*    */     //   152: dup
/*    */     //   153: getstatic net/minecraft/world/effect/MobEffects.f_19601_ : Lnet/minecraft/world/effect/MobEffect;
/*    */     //   156: iconst_1
/*    */     //   157: iconst_1
/*    */     //   158: iconst_0
/*    */     //   159: iconst_0
/*    */     //   160: invokespecial <init> : (Lnet/minecraft/world/effect/MobEffect;IIZZ)V
/*    */     //   163: invokevirtual m_7292_ : (Lnet/minecraft/world/effect/MobEffectInstance;)Z
/*    */     //   166: pop
/*    */     //   167: aload_0
/*    */     //   168: instanceof net/minecraft/server/level/ServerLevel
/*    */     //   171: ifeq -> 200
/*    */     //   174: aload_0
/*    */     //   175: checkcast net/minecraft/server/level/ServerLevel
/*    */     //   178: astore #15
/*    */     //   180: aload #15
/*    */     //   182: getstatic net/minecraft/core/particles/ParticleTypes.f_123748_ : Lnet/minecraft/core/particles/SimpleParticleType;
/*    */     //   185: dload_1
/*    */     //   186: dload_3
/*    */     //   187: dload #5
/*    */     //   189: iconst_5
/*    */     //   190: dconst_1
/*    */     //   191: ldc2_w 2.0
/*    */     //   194: dconst_1
/*    */     //   195: dconst_1
/*    */     //   196: invokevirtual m_8767_ : (Lnet/minecraft/core/particles/ParticleOptions;DDDIDDDD)I
/*    */     //   199: pop
/*    */     //   200: aload #7
/*    */     //   202: instanceof net/minecraft/world/entity/player/Player
/*    */     //   205: ifeq -> 252
/*    */     //   208: aload #7
/*    */     //   210: checkcast net/minecraft/world/entity/player/Player
/*    */     //   213: astore #15
/*    */     //   215: new net/minecraft/world/item/ItemStack
/*    */     //   218: dup
/*    */     //   219: getstatic net/minecraft/world/item/Items.f_42416_ : Lnet/minecraft/world/item/Item;
/*    */     //   222: invokespecial <init> : (Lnet/minecraft/world/level/ItemLike;)V
/*    */     //   225: astore #16
/*    */     //   227: aload #15
/*    */     //   229: invokevirtual m_150109_ : ()Lnet/minecraft/world/entity/player/Inventory;
/*    */     //   232: aload #16
/*    */     //   234: <illegal opcode> test : (Lnet/minecraft/world/item/ItemStack;)Ljava/util/function/Predicate;
/*    */     //   239: iconst_1
/*    */     //   240: aload #15
/*    */     //   242: getfield f_36095_ : Lnet/minecraft/world/inventory/InventoryMenu;
/*    */     //   245: invokevirtual m_39730_ : ()Lnet/minecraft/world/inventory/CraftingContainer;
/*    */     //   248: invokevirtual m_36022_ : (Ljava/util/function/Predicate;ILnet/minecraft/world/Container;)I
/*    */     //   251: pop
/*    */     //   252: goto -> 431
/*    */     //   255: aload #7
/*    */     //   257: instanceof net/minecraft/world/entity/TamableAnimal
/*    */     //   260: ifeq -> 431
/*    */     //   263: aload #7
/*    */     //   265: checkcast net/minecraft/world/entity/TamableAnimal
/*    */     //   268: astore #10
/*    */     //   270: aload #8
/*    */     //   272: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   275: ifeq -> 431
/*    */     //   278: aload #8
/*    */     //   280: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   283: astore #11
/*    */     //   285: aload #10
/*    */     //   287: aload #11
/*    */     //   289: invokevirtual m_21830_ : (Lnet/minecraft/world/entity/LivingEntity;)Z
/*    */     //   292: ifeq -> 431
/*    */     //   295: aload_0
/*    */     //   296: instanceof net/minecraft/server/level/ServerLevel
/*    */     //   299: ifeq -> 415
/*    */     //   302: aload_0
/*    */     //   303: checkcast net/minecraft/server/level/ServerLevel
/*    */     //   306: astore #12
/*    */     //   308: new net/ltxprogrammer/turned/entity/DroneHertxWaitEntity
/*    */     //   311: dup
/*    */     //   312: getstatic net/ltxprogrammer/turned/init/LatexModEntities.DRONE_HERTX_WAIT : Lnet/minecraftforge/registries/RegistryObject;
/*    */     //   315: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   318: checkcast net/minecraft/world/entity/EntityType
/*    */     //   321: aload #12
/*    */     //   323: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
/*    */     //   326: astore #13
/*    */     //   328: aload #13
/*    */     //   330: dload_1
/*    */     //   331: dload_3
/*    */     //   332: dload #5
/*    */     //   334: aload #7
/*    */     //   336: invokevirtual m_146908_ : ()F
/*    */     //   339: aload #7
/*    */     //   341: invokevirtual m_146909_ : ()F
/*    */     //   344: invokevirtual m_7678_ : (DDDFF)V
/*    */     //   347: aload #13
/*    */     //   349: aload #7
/*    */     //   351: invokevirtual m_146908_ : ()F
/*    */     //   354: invokevirtual m_5618_ : (F)V
/*    */     //   357: aload #13
/*    */     //   359: aload #7
/*    */     //   361: invokevirtual m_146908_ : ()F
/*    */     //   364: invokevirtual m_5616_ : (F)V
/*    */     //   367: aload #13
/*    */     //   369: instanceof net/minecraft/world/entity/Mob
/*    */     //   372: ifeq -> 406
/*    */     //   375: aload #13
/*    */     //   377: checkcast net/minecraft/world/entity/Mob
/*    */     //   380: astore #14
/*    */     //   382: aload #14
/*    */     //   384: aload #12
/*    */     //   386: aload_0
/*    */     //   387: aload #13
/*    */     //   389: invokevirtual m_142538_ : ()Lnet/minecraft/core/BlockPos;
/*    */     //   392: invokeinterface m_6436_ : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
/*    */     //   397: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
/*    */     //   400: aconst_null
/*    */     //   401: aconst_null
/*    */     //   402: invokevirtual m_6518_ : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
/*    */     //   405: pop
/*    */     //   406: aload_0
/*    */     //   407: aload #13
/*    */     //   409: invokeinterface m_7967_ : (Lnet/minecraft/world/entity/Entity;)Z
/*    */     //   414: pop
/*    */     //   415: aload #7
/*    */     //   417: getfield f_19853_ : Lnet/minecraft/world/level/Level;
/*    */     //   420: invokevirtual m_5776_ : ()Z
/*    */     //   423: ifne -> 431
/*    */     //   426: aload #7
/*    */     //   428: invokevirtual m_146870_ : ()V
/*    */     //   431: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #21	-> 0
/*    */     //   #22	-> 10
/*    */     //   #23	-> 11
/*    */     //   #24	-> 46
/*    */     //   #25	-> 78
/*    */     //   #26	-> 118
/*    */     //   #27	-> 126
/*    */     //   #28	-> 132
/*    */     //   #29	-> 147
/*    */     //   #30	-> 167
/*    */     //   #31	-> 180
/*    */     //   #32	-> 200
/*    */     //   #33	-> 215
/*    */     //   #34	-> 227
/*    */     //   #35	-> 245
/*    */     //   #34	-> 248
/*    */     //   #36	-> 252
/*    */     //   #39	-> 255
/*    */     //   #40	-> 295
/*    */     //   #41	-> 308
/*    */     //   #42	-> 328
/*    */     //   #43	-> 347
/*    */     //   #44	-> 357
/*    */     //   #45	-> 367
/*    */     //   #46	-> 382
/*    */     //   #48	-> 406
/*    */     //   #50	-> 415
/*    */     //   #51	-> 426
/*    */     //   #53	-> 431
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   26	8	9	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   61	12	12	_tamEnt	Lnet/minecraft/world/entity/TamableAnimal;
/*    */     //   93	8	13	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   118	8	14	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   147	20	15	_entity	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   180	20	15	_level	Lnet/minecraft/server/level/ServerLevel;
/*    */     //   227	25	16	_stktoremove	Lnet/minecraft/world/item/ItemStack;
/*    */     //   215	37	15	_player	Lnet/minecraft/world/entity/player/Player;
/*    */     //   382	24	14	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
/*    */     //   328	87	13	entityToSpawn	Lnet/minecraft/world/entity/Entity;
/*    */     //   308	107	12	_level	Lnet/minecraft/server/level/ServerLevel;
/*    */     //   270	161	10	_tamIsTamedBy	Lnet/minecraft/world/entity/TamableAnimal;
/*    */     //   285	146	11	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   0	432	0	world	Lnet/minecraft/world/level/LevelAccessor;
/*    */     //   0	432	1	x	D
/*    */     //   0	432	3	y	D
/*    */     //   0	432	5	z	D
/*    */     //   0	432	7	entity	Lnet/minecraft/world/entity/Entity;
/*    */     //   0	432	8	sourceentity	Lnet/minecraft/world/entity/Entity;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\DroneHertxRightClickedOnEntityProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */