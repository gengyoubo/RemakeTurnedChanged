/*     */ package net.ltxprogrammer.turned.procedures;
/*     */ 
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ 
/*     */ public class RecruitmentpaperRightclickedProcedure {
/*     */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
/*     */     // Byte code:
/*     */     //   0: aload #7
/*     */     //   2: ifnull -> 10
/*     */     //   5: aload #8
/*     */     //   7: ifnonnull -> 11
/*     */     //   10: return
/*     */     //   11: aload #7
/*     */     //   13: instanceof net/ltxprogrammer/turned/entity/CivilianEntity
/*     */     //   16: ifeq -> 259
/*     */     //   19: aload_0
/*     */     //   20: instanceof net/minecraft/server/level/ServerLevel
/*     */     //   23: ifeq -> 147
/*     */     //   26: aload_0
/*     */     //   27: checkcast net/minecraft/server/level/ServerLevel
/*     */     //   30: astore #11
/*     */     //   32: new net/ltxprogrammer/turned/entity/CivlianMilitiaEntity
/*     */     //   35: dup
/*     */     //   36: getstatic net/ltxprogrammer/turned/init/LatexModEntities.CIVLIAN_MILITIA : Lnet/minecraftforge/registries/RegistryObject;
/*     */     //   39: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   42: checkcast net/minecraft/world/entity/EntityType
/*     */     //   45: aload #11
/*     */     //   47: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
/*     */     //   50: astore #12
/*     */     //   52: aload #12
/*     */     //   54: dload_1
/*     */     //   55: dload_3
/*     */     //   56: dload #5
/*     */     //   58: aload #7
/*     */     //   60: invokevirtual m_146908_ : ()F
/*     */     //   63: aload #7
/*     */     //   65: invokevirtual m_146909_ : ()F
/*     */     //   68: invokevirtual m_7678_ : (DDDFF)V
/*     */     //   71: aload #12
/*     */     //   73: aload #7
/*     */     //   75: invokevirtual m_146908_ : ()F
/*     */     //   78: invokevirtual m_5618_ : (F)V
/*     */     //   81: aload #12
/*     */     //   83: aload #7
/*     */     //   85: invokevirtual m_146908_ : ()F
/*     */     //   88: invokevirtual m_5616_ : (F)V
/*     */     //   91: aload #12
/*     */     //   93: dconst_0
/*     */     //   94: dconst_0
/*     */     //   95: dconst_0
/*     */     //   96: invokevirtual m_20334_ : (DDD)V
/*     */     //   99: aload #12
/*     */     //   101: instanceof net/minecraft/world/entity/Mob
/*     */     //   104: ifeq -> 138
/*     */     //   107: aload #12
/*     */     //   109: checkcast net/minecraft/world/entity/Mob
/*     */     //   112: astore #13
/*     */     //   114: aload #13
/*     */     //   116: aload #11
/*     */     //   118: aload_0
/*     */     //   119: aload #12
/*     */     //   121: invokevirtual m_142538_ : ()Lnet/minecraft/core/BlockPos;
/*     */     //   124: invokeinterface m_6436_ : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
/*     */     //   129: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
/*     */     //   132: aconst_null
/*     */     //   133: aconst_null
/*     */     //   134: invokevirtual m_6518_ : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
/*     */     //   137: pop
/*     */     //   138: aload_0
/*     */     //   139: aload #12
/*     */     //   141: invokeinterface m_7967_ : (Lnet/minecraft/world/entity/Entity;)Z
/*     */     //   146: pop
/*     */     //   147: aload #7
/*     */     //   149: getfield f_19853_ : Lnet/minecraft/world/level/Level;
/*     */     //   152: invokevirtual m_5776_ : ()Z
/*     */     //   155: ifne -> 163
/*     */     //   158: aload #7
/*     */     //   160: invokevirtual m_146870_ : ()V
/*     */     //   163: aload #7
/*     */     //   165: instanceof net/minecraft/world/entity/player/Player
/*     */     //   168: ifeq -> 193
/*     */     //   171: aload #7
/*     */     //   173: checkcast net/minecraft/world/entity/player/Player
/*     */     //   176: astore #11
/*     */     //   178: aload #11
/*     */     //   180: invokevirtual m_150110_ : ()Lnet/minecraft/world/entity/player/Abilities;
/*     */     //   183: getfield f_35937_ : Z
/*     */     //   186: ifeq -> 193
/*     */     //   189: iconst_1
/*     */     //   190: goto -> 194
/*     */     //   193: iconst_0
/*     */     //   194: iconst_1
/*     */     //   195: if_icmpeq -> 1584
/*     */     //   198: aload #7
/*     */     //   200: instanceof net/minecraft/world/entity/player/Player
/*     */     //   203: ifeq -> 256
/*     */     //   206: aload #7
/*     */     //   208: checkcast net/minecraft/world/entity/player/Player
/*     */     //   211: astore #12
/*     */     //   213: new net/minecraft/world/item/ItemStack
/*     */     //   216: dup
/*     */     //   217: getstatic net/ltxprogrammer/turned/init/LatexModItems.RECRUITMENTPAPER : Lnet/minecraftforge/registries/RegistryObject;
/*     */     //   220: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   223: checkcast net/minecraft/world/level/ItemLike
/*     */     //   226: invokespecial <init> : (Lnet/minecraft/world/level/ItemLike;)V
/*     */     //   229: astore #13
/*     */     //   231: aload #12
/*     */     //   233: invokevirtual m_150109_ : ()Lnet/minecraft/world/entity/player/Inventory;
/*     */     //   236: aload #13
/*     */     //   238: <illegal opcode> test : (Lnet/minecraft/world/item/ItemStack;)Ljava/util/function/Predicate;
/*     */     //   243: iconst_1
/*     */     //   244: aload #12
/*     */     //   246: getfield f_36095_ : Lnet/minecraft/world/inventory/InventoryMenu;
/*     */     //   249: invokevirtual m_39730_ : ()Lnet/minecraft/world/inventory/CraftingContainer;
/*     */     //   252: invokevirtual m_36022_ : (Ljava/util/function/Predicate;ILnet/minecraft/world/Container;)I
/*     */     //   255: pop
/*     */     //   256: goto -> 1584
/*     */     //   259: aload #7
/*     */     //   261: instanceof net/ltxprogrammer/turned/entity/CivilianEntity
/*     */     //   264: ifeq -> 798
/*     */     //   267: aload #8
/*     */     //   269: instanceof net/minecraft/world/entity/LivingEntity
/*     */     //   272: ifeq -> 293
/*     */     //   275: aload #8
/*     */     //   277: checkcast net/minecraft/world/entity/LivingEntity
/*     */     //   280: astore #9
/*     */     //   282: aload #9
/*     */     //   284: getstatic net/minecraft/world/entity/EquipmentSlot.HEAD : Lnet/minecraft/world/entity/EquipmentSlot;
/*     */     //   287: invokevirtual m_6844_ : (Lnet/minecraft/world/entity/EquipmentSlot;)Lnet/minecraft/world/item/ItemStack;
/*     */     //   290: goto -> 296
/*     */     //   293: getstatic net/minecraft/world/item/ItemStack.f_41583_ : Lnet/minecraft/world/item/ItemStack;
/*     */     //   296: invokevirtual m_41720_ : ()Lnet/minecraft/world/item/Item;
/*     */     //   299: getstatic net/ltxprogrammer/turned/init/LatexModItems.GOOD_BERET_HELMET : Lnet/minecraftforge/registries/RegistryObject;
/*     */     //   302: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   305: if_acmpne -> 798
/*     */     //   308: invokestatic random : ()D
/*     */     //   311: ldc2_w 0.5
/*     */     //   314: dcmpg
/*     */     //   315: ifge -> 558
/*     */     //   318: aload_0
/*     */     //   319: instanceof net/minecraft/server/level/ServerLevel
/*     */     //   322: ifeq -> 446
/*     */     //   325: aload_0
/*     */     //   326: checkcast net/minecraft/server/level/ServerLevel
/*     */     //   329: astore #11
/*     */     //   331: new net/ltxprogrammer/turned/entity/ScientistEntity
/*     */     //   334: dup
/*     */     //   335: getstatic net/ltxprogrammer/turned/init/LatexModEntities.SCIENTIST : Lnet/minecraftforge/registries/RegistryObject;
/*     */     //   338: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   341: checkcast net/minecraft/world/entity/EntityType
/*     */     //   344: aload #11
/*     */     //   346: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
/*     */     //   349: astore #12
/*     */     //   351: aload #12
/*     */     //   353: dload_1
/*     */     //   354: dload_3
/*     */     //   355: dload #5
/*     */     //   357: aload #7
/*     */     //   359: invokevirtual m_146908_ : ()F
/*     */     //   362: aload #7
/*     */     //   364: invokevirtual m_146909_ : ()F
/*     */     //   367: invokevirtual m_7678_ : (DDDFF)V
/*     */     //   370: aload #12
/*     */     //   372: aload #7
/*     */     //   374: invokevirtual m_146908_ : ()F
/*     */     //   377: invokevirtual m_5618_ : (F)V
/*     */     //   380: aload #12
/*     */     //   382: aload #7
/*     */     //   384: invokevirtual m_146908_ : ()F
/*     */     //   387: invokevirtual m_5616_ : (F)V
/*     */     //   390: aload #12
/*     */     //   392: dconst_0
/*     */     //   393: dconst_0
/*     */     //   394: dconst_0
/*     */     //   395: invokevirtual m_20334_ : (DDD)V
/*     */     //   398: aload #12
/*     */     //   400: instanceof net/minecraft/world/entity/Mob
/*     */     //   403: ifeq -> 437
/*     */     //   406: aload #12
/*     */     //   408: checkcast net/minecraft/world/entity/Mob
/*     */     //   411: astore #13
/*     */     //   413: aload #13
/*     */     //   415: aload #11
/*     */     //   417: aload_0
/*     */     //   418: aload #12
/*     */     //   420: invokevirtual m_142538_ : ()Lnet/minecraft/core/BlockPos;
/*     */     //   423: invokeinterface m_6436_ : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
/*     */     //   428: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
/*     */     //   431: aconst_null
/*     */     //   432: aconst_null
/*     */     //   433: invokevirtual m_6518_ : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
/*     */     //   436: pop
/*     */     //   437: aload_0
/*     */     //   438: aload #12
/*     */     //   440: invokeinterface m_7967_ : (Lnet/minecraft/world/entity/Entity;)Z
/*     */     //   445: pop
/*     */     //   446: aload #7
/*     */     //   448: getfield f_19853_ : Lnet/minecraft/world/level/Level;
/*     */     //   451: invokevirtual m_5776_ : ()Z
/*     */     //   454: ifne -> 462
/*     */     //   457: aload #7
/*     */     //   459: invokevirtual m_146870_ : ()V
/*     */     //   462: aload #7
/*     */     //   464: instanceof net/minecraft/world/entity/player/Player
/*     */     //   467: ifeq -> 492
/*     */     //   470: aload #7
/*     */     //   472: checkcast net/minecraft/world/entity/player/Player
/*     */     //   475: astore #11
/*     */     //   477: aload #11
/*     */     //   479: invokevirtual m_150110_ : ()Lnet/minecraft/world/entity/player/Abilities;
/*     */     //   482: getfield f_35937_ : Z
/*     */     //   485: ifeq -> 492
/*     */     //   488: iconst_1
/*     */     //   489: goto -> 493
/*     */     //   492: iconst_0
/*     */     //   493: iconst_1
/*     */     //   494: if_icmpeq -> 1584
/*     */     //   497: aload #7
/*     */     //   499: instanceof net/minecraft/world/entity/player/Player
/*     */     //   502: ifeq -> 555
/*     */     //   505: aload #7
/*     */     //   507: checkcast net/minecraft/world/entity/player/Player
/*     */     //   510: astore #12
/*     */     //   512: new net/minecraft/world/item/ItemStack
/*     */     //   515: dup
/*     */     //   516: getstatic net/ltxprogrammer/turned/init/LatexModItems.RECRUITMENTPAPER : Lnet/minecraftforge/registries/RegistryObject;
/*     */     //   519: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   522: checkcast net/minecraft/world/level/ItemLike
/*     */     //   525: invokespecial <init> : (Lnet/minecraft/world/level/ItemLike;)V
/*     */     //   528: astore #13
/*     */     //   530: aload #12
/*     */     //   532: invokevirtual m_150109_ : ()Lnet/minecraft/world/entity/player/Inventory;
/*     */     //   535: aload #13
/*     */     //   537: <illegal opcode> test : (Lnet/minecraft/world/item/ItemStack;)Ljava/util/function/Predicate;
/*     */     //   542: iconst_1
/*     */     //   543: aload #12
/*     */     //   545: getfield f_36095_ : Lnet/minecraft/world/inventory/InventoryMenu;
/*     */     //   548: invokevirtual m_39730_ : ()Lnet/minecraft/world/inventory/CraftingContainer;
/*     */     //   551: invokevirtual m_36022_ : (Ljava/util/function/Predicate;ILnet/minecraft/world/Container;)I
/*     */     //   554: pop
/*     */     //   555: goto -> 1584
/*     */     //   558: aload_0
/*     */     //   559: instanceof net/minecraft/server/level/ServerLevel
/*     */     //   562: ifeq -> 686
/*     */     //   565: aload_0
/*     */     //   566: checkcast net/minecraft/server/level/ServerLevel
/*     */     //   569: astore #11
/*     */     //   571: new net/ltxprogrammer/turned/entity/CivlianMilitiaEntity
/*     */     //   574: dup
/*     */     //   575: getstatic net/ltxprogrammer/turned/init/LatexModEntities.CIVLIAN_MILITIA : Lnet/minecraftforge/registries/RegistryObject;
/*     */     //   578: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   581: checkcast net/minecraft/world/entity/EntityType
/*     */     //   584: aload #11
/*     */     //   586: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
/*     */     //   589: astore #12
/*     */     //   591: aload #12
/*     */     //   593: dload_1
/*     */     //   594: dload_3
/*     */     //   595: dload #5
/*     */     //   597: aload #7
/*     */     //   599: invokevirtual m_146908_ : ()F
/*     */     //   602: aload #7
/*     */     //   604: invokevirtual m_146909_ : ()F
/*     */     //   607: invokevirtual m_7678_ : (DDDFF)V
/*     */     //   610: aload #12
/*     */     //   612: aload #7
/*     */     //   614: invokevirtual m_146908_ : ()F
/*     */     //   617: invokevirtual m_5618_ : (F)V
/*     */     //   620: aload #12
/*     */     //   622: aload #7
/*     */     //   624: invokevirtual m_146908_ : ()F
/*     */     //   627: invokevirtual m_5616_ : (F)V
/*     */     //   630: aload #12
/*     */     //   632: dconst_0
/*     */     //   633: dconst_0
/*     */     //   634: dconst_0
/*     */     //   635: invokevirtual m_20334_ : (DDD)V
/*     */     //   638: aload #12
/*     */     //   640: instanceof net/minecraft/world/entity/Mob
/*     */     //   643: ifeq -> 677
/*     */     //   646: aload #12
/*     */     //   648: checkcast net/minecraft/world/entity/Mob
/*     */     //   651: astore #13
/*     */     //   653: aload #13
/*     */     //   655: aload #11
/*     */     //   657: aload_0
/*     */     //   658: aload #12
/*     */     //   660: invokevirtual m_142538_ : ()Lnet/minecraft/core/BlockPos;
/*     */     //   663: invokeinterface m_6436_ : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
/*     */     //   668: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
/*     */     //   671: aconst_null
/*     */     //   672: aconst_null
/*     */     //   673: invokevirtual m_6518_ : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
/*     */     //   676: pop
/*     */     //   677: aload_0
/*     */     //   678: aload #12
/*     */     //   680: invokeinterface m_7967_ : (Lnet/minecraft/world/entity/Entity;)Z
/*     */     //   685: pop
/*     */     //   686: aload #7
/*     */     //   688: getfield f_19853_ : Lnet/minecraft/world/level/Level;
/*     */     //   691: invokevirtual m_5776_ : ()Z
/*     */     //   694: ifne -> 702
/*     */     //   697: aload #7
/*     */     //   699: invokevirtual m_146870_ : ()V
/*     */     //   702: aload #7
/*     */     //   704: instanceof net/minecraft/world/entity/player/Player
/*     */     //   707: ifeq -> 732
/*     */     //   710: aload #7
/*     */     //   712: checkcast net/minecraft/world/entity/player/Player
/*     */     //   715: astore #11
/*     */     //   717: aload #11
/*     */     //   719: invokevirtual m_150110_ : ()Lnet/minecraft/world/entity/player/Abilities;
/*     */     //   722: getfield f_35937_ : Z
/*     */     //   725: ifeq -> 732
/*     */     //   728: iconst_1
/*     */     //   729: goto -> 733
/*     */     //   732: iconst_0
/*     */     //   733: iconst_1
/*     */     //   734: if_icmpeq -> 1584
/*     */     //   737: aload #7
/*     */     //   739: instanceof net/minecraft/world/entity/player/Player
/*     */     //   742: ifeq -> 795
/*     */     //   745: aload #7
/*     */     //   747: checkcast net/minecraft/world/entity/player/Player
/*     */     //   750: astore #12
/*     */     //   752: new net/minecraft/world/item/ItemStack
/*     */     //   755: dup
/*     */     //   756: getstatic net/ltxprogrammer/turned/init/LatexModItems.RECRUITMENTPAPER : Lnet/minecraftforge/registries/RegistryObject;
/*     */     //   759: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   762: checkcast net/minecraft/world/level/ItemLike
/*     */     //   765: invokespecial <init> : (Lnet/minecraft/world/level/ItemLike;)V
/*     */     //   768: astore #13
/*     */     //   770: aload #12
/*     */     //   772: invokevirtual m_150109_ : ()Lnet/minecraft/world/entity/player/Inventory;
/*     */     //   775: aload #13
/*     */     //   777: <illegal opcode> test : (Lnet/minecraft/world/item/ItemStack;)Ljava/util/function/Predicate;
/*     */     //   782: iconst_1
/*     */     //   783: aload #12
/*     */     //   785: getfield f_36095_ : Lnet/minecraft/world/inventory/InventoryMenu;
/*     */     //   788: invokevirtual m_39730_ : ()Lnet/minecraft/world/inventory/CraftingContainer;
/*     */     //   791: invokevirtual m_36022_ : (Ljava/util/function/Predicate;ILnet/minecraft/world/Container;)I
/*     */     //   794: pop
/*     */     //   795: goto -> 1584
/*     */     //   798: aload #7
/*     */     //   800: instanceof net/ltxprogrammer/turned/entity/ScientistEntity
/*     */     //   803: ifeq -> 1584
/*     */     //   806: aload #8
/*     */     //   808: instanceof net/minecraft/world/entity/LivingEntity
/*     */     //   811: ifeq -> 832
/*     */     //   814: aload #8
/*     */     //   816: checkcast net/minecraft/world/entity/LivingEntity
/*     */     //   819: astore #10
/*     */     //   821: aload #10
/*     */     //   823: getstatic net/minecraft/world/entity/EquipmentSlot.HEAD : Lnet/minecraft/world/entity/EquipmentSlot;
/*     */     //   826: invokevirtual m_6844_ : (Lnet/minecraft/world/entity/EquipmentSlot;)Lnet/minecraft/world/item/ItemStack;
/*     */     //   829: goto -> 835
/*     */     //   832: getstatic net/minecraft/world/item/ItemStack.f_41583_ : Lnet/minecraft/world/item/ItemStack;
/*     */     //   835: invokevirtual m_41720_ : ()Lnet/minecraft/world/item/Item;
/*     */     //   838: getstatic net/ltxprogrammer/turned/init/LatexModItems.GOOD_BERET_HELMET : Lnet/minecraftforge/registries/RegistryObject;
/*     */     //   841: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   844: if_acmpne -> 1584
/*     */     //   847: invokestatic random : ()D
/*     */     //   850: ldc2_w 0.5
/*     */     //   853: dcmpg
/*     */     //   854: ifge -> 1097
/*     */     //   857: aload_0
/*     */     //   858: instanceof net/minecraft/server/level/ServerLevel
/*     */     //   861: ifeq -> 985
/*     */     //   864: aload_0
/*     */     //   865: checkcast net/minecraft/server/level/ServerLevel
/*     */     //   868: astore #11
/*     */     //   870: new net/ltxprogrammer/turned/entity/MilitaryRiotEntity
/*     */     //   873: dup
/*     */     //   874: getstatic net/ltxprogrammer/turned/init/LatexModEntities.MILITARY_RIOT : Lnet/minecraftforge/registries/RegistryObject;
/*     */     //   877: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   880: checkcast net/minecraft/world/entity/EntityType
/*     */     //   883: aload #11
/*     */     //   885: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
/*     */     //   888: astore #12
/*     */     //   890: aload #12
/*     */     //   892: dload_1
/*     */     //   893: dload_3
/*     */     //   894: dload #5
/*     */     //   896: aload #7
/*     */     //   898: invokevirtual m_146908_ : ()F
/*     */     //   901: aload #7
/*     */     //   903: invokevirtual m_146909_ : ()F
/*     */     //   906: invokevirtual m_7678_ : (DDDFF)V
/*     */     //   909: aload #12
/*     */     //   911: aload #7
/*     */     //   913: invokevirtual m_146908_ : ()F
/*     */     //   916: invokevirtual m_5618_ : (F)V
/*     */     //   919: aload #12
/*     */     //   921: aload #7
/*     */     //   923: invokevirtual m_146908_ : ()F
/*     */     //   926: invokevirtual m_5616_ : (F)V
/*     */     //   929: aload #12
/*     */     //   931: dconst_0
/*     */     //   932: dconst_0
/*     */     //   933: dconst_0
/*     */     //   934: invokevirtual m_20334_ : (DDD)V
/*     */     //   937: aload #12
/*     */     //   939: instanceof net/minecraft/world/entity/Mob
/*     */     //   942: ifeq -> 976
/*     */     //   945: aload #12
/*     */     //   947: checkcast net/minecraft/world/entity/Mob
/*     */     //   950: astore #13
/*     */     //   952: aload #13
/*     */     //   954: aload #11
/*     */     //   956: aload_0
/*     */     //   957: aload #12
/*     */     //   959: invokevirtual m_142538_ : ()Lnet/minecraft/core/BlockPos;
/*     */     //   962: invokeinterface m_6436_ : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
/*     */     //   967: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
/*     */     //   970: aconst_null
/*     */     //   971: aconst_null
/*     */     //   972: invokevirtual m_6518_ : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
/*     */     //   975: pop
/*     */     //   976: aload_0
/*     */     //   977: aload #12
/*     */     //   979: invokeinterface m_7967_ : (Lnet/minecraft/world/entity/Entity;)Z
/*     */     //   984: pop
/*     */     //   985: aload #7
/*     */     //   987: getfield f_19853_ : Lnet/minecraft/world/level/Level;
/*     */     //   990: invokevirtual m_5776_ : ()Z
/*     */     //   993: ifne -> 1001
/*     */     //   996: aload #7
/*     */     //   998: invokevirtual m_146870_ : ()V
/*     */     //   1001: aload #7
/*     */     //   1003: instanceof net/minecraft/world/entity/player/Player
/*     */     //   1006: ifeq -> 1031
/*     */     //   1009: aload #7
/*     */     //   1011: checkcast net/minecraft/world/entity/player/Player
/*     */     //   1014: astore #11
/*     */     //   1016: aload #11
/*     */     //   1018: invokevirtual m_150110_ : ()Lnet/minecraft/world/entity/player/Abilities;
/*     */     //   1021: getfield f_35937_ : Z
/*     */     //   1024: ifeq -> 1031
/*     */     //   1027: iconst_1
/*     */     //   1028: goto -> 1032
/*     */     //   1031: iconst_0
/*     */     //   1032: iconst_1
/*     */     //   1033: if_icmpeq -> 1584
/*     */     //   1036: aload #7
/*     */     //   1038: instanceof net/minecraft/world/entity/player/Player
/*     */     //   1041: ifeq -> 1094
/*     */     //   1044: aload #7
/*     */     //   1046: checkcast net/minecraft/world/entity/player/Player
/*     */     //   1049: astore #12
/*     */     //   1051: new net/minecraft/world/item/ItemStack
/*     */     //   1054: dup
/*     */     //   1055: getstatic net/ltxprogrammer/turned/init/LatexModItems.RECRUITMENTPAPER : Lnet/minecraftforge/registries/RegistryObject;
/*     */     //   1058: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   1061: checkcast net/minecraft/world/level/ItemLike
/*     */     //   1064: invokespecial <init> : (Lnet/minecraft/world/level/ItemLike;)V
/*     */     //   1067: astore #13
/*     */     //   1069: aload #12
/*     */     //   1071: invokevirtual m_150109_ : ()Lnet/minecraft/world/entity/player/Inventory;
/*     */     //   1074: aload #13
/*     */     //   1076: <illegal opcode> test : (Lnet/minecraft/world/item/ItemStack;)Ljava/util/function/Predicate;
/*     */     //   1081: iconst_1
/*     */     //   1082: aload #12
/*     */     //   1084: getfield f_36095_ : Lnet/minecraft/world/inventory/InventoryMenu;
/*     */     //   1087: invokevirtual m_39730_ : ()Lnet/minecraft/world/inventory/CraftingContainer;
/*     */     //   1090: invokevirtual m_36022_ : (Ljava/util/function/Predicate;ILnet/minecraft/world/Container;)I
/*     */     //   1093: pop
/*     */     //   1094: goto -> 1584
/*     */     //   1097: invokestatic random : ()D
/*     */     //   1100: ldc2_w 0.1
/*     */     //   1103: dcmpg
/*     */     //   1104: ifge -> 1347
/*     */     //   1107: aload_0
/*     */     //   1108: instanceof net/minecraft/server/level/ServerLevel
/*     */     //   1111: ifeq -> 1235
/*     */     //   1114: aload_0
/*     */     //   1115: checkcast net/minecraft/server/level/ServerLevel
/*     */     //   1118: astore #11
/*     */     //   1120: new net/ltxprogrammer/turned/entity/MilitaryflameunitEntity
/*     */     //   1123: dup
/*     */     //   1124: getstatic net/ltxprogrammer/turned/init/LatexModEntities.MILITARYFLAMEUNIT : Lnet/minecraftforge/registries/RegistryObject;
/*     */     //   1127: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   1130: checkcast net/minecraft/world/entity/EntityType
/*     */     //   1133: aload #11
/*     */     //   1135: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
/*     */     //   1138: astore #12
/*     */     //   1140: aload #12
/*     */     //   1142: dload_1
/*     */     //   1143: dload_3
/*     */     //   1144: dload #5
/*     */     //   1146: aload #7
/*     */     //   1148: invokevirtual m_146908_ : ()F
/*     */     //   1151: aload #7
/*     */     //   1153: invokevirtual m_146909_ : ()F
/*     */     //   1156: invokevirtual m_7678_ : (DDDFF)V
/*     */     //   1159: aload #12
/*     */     //   1161: aload #7
/*     */     //   1163: invokevirtual m_146908_ : ()F
/*     */     //   1166: invokevirtual m_5618_ : (F)V
/*     */     //   1169: aload #12
/*     */     //   1171: aload #7
/*     */     //   1173: invokevirtual m_146908_ : ()F
/*     */     //   1176: invokevirtual m_5616_ : (F)V
/*     */     //   1179: aload #12
/*     */     //   1181: dconst_0
/*     */     //   1182: dconst_0
/*     */     //   1183: dconst_0
/*     */     //   1184: invokevirtual m_20334_ : (DDD)V
/*     */     //   1187: aload #12
/*     */     //   1189: instanceof net/minecraft/world/entity/Mob
/*     */     //   1192: ifeq -> 1226
/*     */     //   1195: aload #12
/*     */     //   1197: checkcast net/minecraft/world/entity/Mob
/*     */     //   1200: astore #13
/*     */     //   1202: aload #13
/*     */     //   1204: aload #11
/*     */     //   1206: aload_0
/*     */     //   1207: aload #12
/*     */     //   1209: invokevirtual m_142538_ : ()Lnet/minecraft/core/BlockPos;
/*     */     //   1212: invokeinterface m_6436_ : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
/*     */     //   1217: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
/*     */     //   1220: aconst_null
/*     */     //   1221: aconst_null
/*     */     //   1222: invokevirtual m_6518_ : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
/*     */     //   1225: pop
/*     */     //   1226: aload_0
/*     */     //   1227: aload #12
/*     */     //   1229: invokeinterface m_7967_ : (Lnet/minecraft/world/entity/Entity;)Z
/*     */     //   1234: pop
/*     */     //   1235: aload #7
/*     */     //   1237: getfield f_19853_ : Lnet/minecraft/world/level/Level;
/*     */     //   1240: invokevirtual m_5776_ : ()Z
/*     */     //   1243: ifne -> 1251
/*     */     //   1246: aload #7
/*     */     //   1248: invokevirtual m_146870_ : ()V
/*     */     //   1251: aload #7
/*     */     //   1253: instanceof net/minecraft/world/entity/player/Player
/*     */     //   1256: ifeq -> 1281
/*     */     //   1259: aload #7
/*     */     //   1261: checkcast net/minecraft/world/entity/player/Player
/*     */     //   1264: astore #11
/*     */     //   1266: aload #11
/*     */     //   1268: invokevirtual m_150110_ : ()Lnet/minecraft/world/entity/player/Abilities;
/*     */     //   1271: getfield f_35937_ : Z
/*     */     //   1274: ifeq -> 1281
/*     */     //   1277: iconst_1
/*     */     //   1278: goto -> 1282
/*     */     //   1281: iconst_0
/*     */     //   1282: iconst_1
/*     */     //   1283: if_icmpeq -> 1584
/*     */     //   1286: aload #7
/*     */     //   1288: instanceof net/minecraft/world/entity/player/Player
/*     */     //   1291: ifeq -> 1344
/*     */     //   1294: aload #7
/*     */     //   1296: checkcast net/minecraft/world/entity/player/Player
/*     */     //   1299: astore #12
/*     */     //   1301: new net/minecraft/world/item/ItemStack
/*     */     //   1304: dup
/*     */     //   1305: getstatic net/ltxprogrammer/turned/init/LatexModItems.RECRUITMENTPAPER : Lnet/minecraftforge/registries/RegistryObject;
/*     */     //   1308: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   1311: checkcast net/minecraft/world/level/ItemLike
/*     */     //   1314: invokespecial <init> : (Lnet/minecraft/world/level/ItemLike;)V
/*     */     //   1317: astore #13
/*     */     //   1319: aload #12
/*     */     //   1321: invokevirtual m_150109_ : ()Lnet/minecraft/world/entity/player/Inventory;
/*     */     //   1324: aload #13
/*     */     //   1326: <illegal opcode> test : (Lnet/minecraft/world/item/ItemStack;)Ljava/util/function/Predicate;
/*     */     //   1331: iconst_1
/*     */     //   1332: aload #12
/*     */     //   1334: getfield f_36095_ : Lnet/minecraft/world/inventory/InventoryMenu;
/*     */     //   1337: invokevirtual m_39730_ : ()Lnet/minecraft/world/inventory/CraftingContainer;
/*     */     //   1340: invokevirtual m_36022_ : (Ljava/util/function/Predicate;ILnet/minecraft/world/Container;)I
/*     */     //   1343: pop
/*     */     //   1344: goto -> 1584
/*     */     //   1347: aload_0
/*     */     //   1348: instanceof net/minecraft/server/level/ServerLevel
/*     */     //   1351: ifeq -> 1475
/*     */     //   1354: aload_0
/*     */     //   1355: checkcast net/minecraft/server/level/ServerLevel
/*     */     //   1358: astore #11
/*     */     //   1360: new net/ltxprogrammer/turned/entity/MilitaryEntity
/*     */     //   1363: dup
/*     */     //   1364: getstatic net/ltxprogrammer/turned/init/LatexModEntities.MILITARY : Lnet/minecraftforge/registries/RegistryObject;
/*     */     //   1367: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   1370: checkcast net/minecraft/world/entity/EntityType
/*     */     //   1373: aload #11
/*     */     //   1375: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
/*     */     //   1378: astore #12
/*     */     //   1380: aload #12
/*     */     //   1382: dload_1
/*     */     //   1383: dload_3
/*     */     //   1384: dload #5
/*     */     //   1386: aload #7
/*     */     //   1388: invokevirtual m_146908_ : ()F
/*     */     //   1391: aload #7
/*     */     //   1393: invokevirtual m_146909_ : ()F
/*     */     //   1396: invokevirtual m_7678_ : (DDDFF)V
/*     */     //   1399: aload #12
/*     */     //   1401: aload #7
/*     */     //   1403: invokevirtual m_146908_ : ()F
/*     */     //   1406: invokevirtual m_5618_ : (F)V
/*     */     //   1409: aload #12
/*     */     //   1411: aload #7
/*     */     //   1413: invokevirtual m_146908_ : ()F
/*     */     //   1416: invokevirtual m_5616_ : (F)V
/*     */     //   1419: aload #12
/*     */     //   1421: dconst_0
/*     */     //   1422: dconst_0
/*     */     //   1423: dconst_0
/*     */     //   1424: invokevirtual m_20334_ : (DDD)V
/*     */     //   1427: aload #12
/*     */     //   1429: instanceof net/minecraft/world/entity/Mob
/*     */     //   1432: ifeq -> 1466
/*     */     //   1435: aload #12
/*     */     //   1437: checkcast net/minecraft/world/entity/Mob
/*     */     //   1440: astore #13
/*     */     //   1442: aload #13
/*     */     //   1444: aload #11
/*     */     //   1446: aload_0
/*     */     //   1447: aload #12
/*     */     //   1449: invokevirtual m_142538_ : ()Lnet/minecraft/core/BlockPos;
/*     */     //   1452: invokeinterface m_6436_ : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
/*     */     //   1457: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
/*     */     //   1460: aconst_null
/*     */     //   1461: aconst_null
/*     */     //   1462: invokevirtual m_6518_ : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
/*     */     //   1465: pop
/*     */     //   1466: aload_0
/*     */     //   1467: aload #12
/*     */     //   1469: invokeinterface m_7967_ : (Lnet/minecraft/world/entity/Entity;)Z
/*     */     //   1474: pop
/*     */     //   1475: aload #7
/*     */     //   1477: getfield f_19853_ : Lnet/minecraft/world/level/Level;
/*     */     //   1480: invokevirtual m_5776_ : ()Z
/*     */     //   1483: ifne -> 1491
/*     */     //   1486: aload #7
/*     */     //   1488: invokevirtual m_146870_ : ()V
/*     */     //   1491: aload #7
/*     */     //   1493: instanceof net/minecraft/world/entity/player/Player
/*     */     //   1496: ifeq -> 1521
/*     */     //   1499: aload #7
/*     */     //   1501: checkcast net/minecraft/world/entity/player/Player
/*     */     //   1504: astore #11
/*     */     //   1506: aload #11
/*     */     //   1508: invokevirtual m_150110_ : ()Lnet/minecraft/world/entity/player/Abilities;
/*     */     //   1511: getfield f_35937_ : Z
/*     */     //   1514: ifeq -> 1521
/*     */     //   1517: iconst_1
/*     */     //   1518: goto -> 1522
/*     */     //   1521: iconst_0
/*     */     //   1522: iconst_1
/*     */     //   1523: if_icmpeq -> 1584
/*     */     //   1526: aload #7
/*     */     //   1528: instanceof net/minecraft/world/entity/player/Player
/*     */     //   1531: ifeq -> 1584
/*     */     //   1534: aload #7
/*     */     //   1536: checkcast net/minecraft/world/entity/player/Player
/*     */     //   1539: astore #12
/*     */     //   1541: new net/minecraft/world/item/ItemStack
/*     */     //   1544: dup
/*     */     //   1545: getstatic net/ltxprogrammer/turned/init/LatexModItems.RECRUITMENTPAPER : Lnet/minecraftforge/registries/RegistryObject;
/*     */     //   1548: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   1551: checkcast net/minecraft/world/level/ItemLike
/*     */     //   1554: invokespecial <init> : (Lnet/minecraft/world/level/ItemLike;)V
/*     */     //   1557: astore #13
/*     */     //   1559: aload #12
/*     */     //   1561: invokevirtual m_150109_ : ()Lnet/minecraft/world/entity/player/Inventory;
/*     */     //   1564: aload #13
/*     */     //   1566: <illegal opcode> test : (Lnet/minecraft/world/item/ItemStack;)Ljava/util/function/Predicate;
/*     */     //   1571: iconst_1
/*     */     //   1572: aload #12
/*     */     //   1574: getfield f_36095_ : Lnet/minecraft/world/inventory/InventoryMenu;
/*     */     //   1577: invokevirtual m_39730_ : ()Lnet/minecraft/world/inventory/CraftingContainer;
/*     */     //   1580: invokevirtual m_36022_ : (Ljava/util/function/Predicate;ILnet/minecraft/world/Container;)I
/*     */     //   1583: pop
/*     */     //   1584: aload #8
/*     */     //   1586: instanceof net/minecraft/world/entity/LivingEntity
/*     */     //   1589: ifeq -> 1610
/*     */     //   1592: aload #8
/*     */     //   1594: checkcast net/minecraft/world/entity/LivingEntity
/*     */     //   1597: astore #9
/*     */     //   1599: aload #9
/*     */     //   1601: getstatic net/minecraft/world/entity/EquipmentSlot.HEAD : Lnet/minecraft/world/entity/EquipmentSlot;
/*     */     //   1604: invokevirtual m_6844_ : (Lnet/minecraft/world/entity/EquipmentSlot;)Lnet/minecraft/world/item/ItemStack;
/*     */     //   1607: goto -> 1613
/*     */     //   1610: getstatic net/minecraft/world/item/ItemStack.f_41583_ : Lnet/minecraft/world/item/ItemStack;
/*     */     //   1613: invokevirtual m_41720_ : ()Lnet/minecraft/world/item/Item;
/*     */     //   1616: getstatic net/ltxprogrammer/turned/init/LatexModItems.EVIL_BERET_HELMET : Lnet/minecraftforge/registries/RegistryObject;
/*     */     //   1619: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   1622: if_acmpne -> 1873
/*     */     //   1625: aload #7
/*     */     //   1627: instanceof net/ltxprogrammer/turned/entity/PrisionerEntity
/*     */     //   1630: ifeq -> 1873
/*     */     //   1633: aload_0
/*     */     //   1634: instanceof net/minecraft/server/level/ServerLevel
/*     */     //   1637: ifeq -> 1761
/*     */     //   1640: aload_0
/*     */     //   1641: checkcast net/minecraft/server/level/ServerLevel
/*     */     //   1644: astore #11
/*     */     //   1646: new net/ltxprogrammer/turned/entity/PrisionermilitiaEntity
/*     */     //   1649: dup
/*     */     //   1650: getstatic net/ltxprogrammer/turned/init/LatexModEntities.PRISIONERMILITIA : Lnet/minecraftforge/registries/RegistryObject;
/*     */     //   1653: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   1656: checkcast net/minecraft/world/entity/EntityType
/*     */     //   1659: aload #11
/*     */     //   1661: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
/*     */     //   1664: astore #12
/*     */     //   1666: aload #12
/*     */     //   1668: dload_1
/*     */     //   1669: dload_3
/*     */     //   1670: dload #5
/*     */     //   1672: aload #7
/*     */     //   1674: invokevirtual m_146908_ : ()F
/*     */     //   1677: aload #7
/*     */     //   1679: invokevirtual m_146909_ : ()F
/*     */     //   1682: invokevirtual m_7678_ : (DDDFF)V
/*     */     //   1685: aload #12
/*     */     //   1687: aload #7
/*     */     //   1689: invokevirtual m_146908_ : ()F
/*     */     //   1692: invokevirtual m_5618_ : (F)V
/*     */     //   1695: aload #12
/*     */     //   1697: aload #7
/*     */     //   1699: invokevirtual m_146908_ : ()F
/*     */     //   1702: invokevirtual m_5616_ : (F)V
/*     */     //   1705: aload #12
/*     */     //   1707: dconst_0
/*     */     //   1708: dconst_0
/*     */     //   1709: dconst_0
/*     */     //   1710: invokevirtual m_20334_ : (DDD)V
/*     */     //   1713: aload #12
/*     */     //   1715: instanceof net/minecraft/world/entity/Mob
/*     */     //   1718: ifeq -> 1752
/*     */     //   1721: aload #12
/*     */     //   1723: checkcast net/minecraft/world/entity/Mob
/*     */     //   1726: astore #13
/*     */     //   1728: aload #13
/*     */     //   1730: aload #11
/*     */     //   1732: aload_0
/*     */     //   1733: aload #12
/*     */     //   1735: invokevirtual m_142538_ : ()Lnet/minecraft/core/BlockPos;
/*     */     //   1738: invokeinterface m_6436_ : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
/*     */     //   1743: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
/*     */     //   1746: aconst_null
/*     */     //   1747: aconst_null
/*     */     //   1748: invokevirtual m_6518_ : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
/*     */     //   1751: pop
/*     */     //   1752: aload_0
/*     */     //   1753: aload #12
/*     */     //   1755: invokeinterface m_7967_ : (Lnet/minecraft/world/entity/Entity;)Z
/*     */     //   1760: pop
/*     */     //   1761: aload #7
/*     */     //   1763: getfield f_19853_ : Lnet/minecraft/world/level/Level;
/*     */     //   1766: invokevirtual m_5776_ : ()Z
/*     */     //   1769: ifne -> 1777
/*     */     //   1772: aload #7
/*     */     //   1774: invokevirtual m_146870_ : ()V
/*     */     //   1777: aload #7
/*     */     //   1779: instanceof net/minecraft/world/entity/player/Player
/*     */     //   1782: ifeq -> 1807
/*     */     //   1785: aload #7
/*     */     //   1787: checkcast net/minecraft/world/entity/player/Player
/*     */     //   1790: astore #11
/*     */     //   1792: aload #11
/*     */     //   1794: invokevirtual m_150110_ : ()Lnet/minecraft/world/entity/player/Abilities;
/*     */     //   1797: getfield f_35937_ : Z
/*     */     //   1800: ifeq -> 1807
/*     */     //   1803: iconst_1
/*     */     //   1804: goto -> 1808
/*     */     //   1807: iconst_0
/*     */     //   1808: iconst_1
/*     */     //   1809: if_icmpeq -> 2159
/*     */     //   1812: aload #7
/*     */     //   1814: instanceof net/minecraft/world/entity/player/Player
/*     */     //   1817: ifeq -> 1870
/*     */     //   1820: aload #7
/*     */     //   1822: checkcast net/minecraft/world/entity/player/Player
/*     */     //   1825: astore #12
/*     */     //   1827: new net/minecraft/world/item/ItemStack
/*     */     //   1830: dup
/*     */     //   1831: getstatic net/ltxprogrammer/turned/init/LatexModItems.RECRUITMENTPAPER : Lnet/minecraftforge/registries/RegistryObject;
/*     */     //   1834: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   1837: checkcast net/minecraft/world/level/ItemLike
/*     */     //   1840: invokespecial <init> : (Lnet/minecraft/world/level/ItemLike;)V
/*     */     //   1843: astore #13
/*     */     //   1845: aload #12
/*     */     //   1847: invokevirtual m_150109_ : ()Lnet/minecraft/world/entity/player/Inventory;
/*     */     //   1850: aload #13
/*     */     //   1852: <illegal opcode> test : (Lnet/minecraft/world/item/ItemStack;)Ljava/util/function/Predicate;
/*     */     //   1857: iconst_1
/*     */     //   1858: aload #12
/*     */     //   1860: getfield f_36095_ : Lnet/minecraft/world/inventory/InventoryMenu;
/*     */     //   1863: invokevirtual m_39730_ : ()Lnet/minecraft/world/inventory/CraftingContainer;
/*     */     //   1866: invokevirtual m_36022_ : (Ljava/util/function/Predicate;ILnet/minecraft/world/Container;)I
/*     */     //   1869: pop
/*     */     //   1870: goto -> 2159
/*     */     //   1873: aload #8
/*     */     //   1875: instanceof net/minecraft/world/entity/LivingEntity
/*     */     //   1878: ifeq -> 1899
/*     */     //   1881: aload #8
/*     */     //   1883: checkcast net/minecraft/world/entity/LivingEntity
/*     */     //   1886: astore #10
/*     */     //   1888: aload #10
/*     */     //   1890: getstatic net/minecraft/world/entity/EquipmentSlot.HEAD : Lnet/minecraft/world/entity/EquipmentSlot;
/*     */     //   1893: invokevirtual m_6844_ : (Lnet/minecraft/world/entity/EquipmentSlot;)Lnet/minecraft/world/item/ItemStack;
/*     */     //   1896: goto -> 1902
/*     */     //   1899: getstatic net/minecraft/world/item/ItemStack.f_41583_ : Lnet/minecraft/world/item/ItemStack;
/*     */     //   1902: invokevirtual m_41720_ : ()Lnet/minecraft/world/item/Item;
/*     */     //   1905: getstatic net/ltxprogrammer/turned/init/LatexModItems.GOOD_BERET_HELMET : Lnet/minecraftforge/registries/RegistryObject;
/*     */     //   1908: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   1911: if_acmpne -> 2159
/*     */     //   1914: aload #7
/*     */     //   1916: instanceof net/ltxprogrammer/turned/entity/PrisionerEntity
/*     */     //   1919: ifeq -> 2159
/*     */     //   1922: aload_0
/*     */     //   1923: instanceof net/minecraft/server/level/ServerLevel
/*     */     //   1926: ifeq -> 2050
/*     */     //   1929: aload_0
/*     */     //   1930: checkcast net/minecraft/server/level/ServerLevel
/*     */     //   1933: astore #11
/*     */     //   1935: new net/ltxprogrammer/turned/entity/CivilianEntity
/*     */     //   1938: dup
/*     */     //   1939: getstatic net/ltxprogrammer/turned/init/LatexModEntities.CIVILIAN : Lnet/minecraftforge/registries/RegistryObject;
/*     */     //   1942: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   1945: checkcast net/minecraft/world/entity/EntityType
/*     */     //   1948: aload #11
/*     */     //   1950: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
/*     */     //   1953: astore #12
/*     */     //   1955: aload #12
/*     */     //   1957: dload_1
/*     */     //   1958: dload_3
/*     */     //   1959: dload #5
/*     */     //   1961: aload #7
/*     */     //   1963: invokevirtual m_146908_ : ()F
/*     */     //   1966: aload #7
/*     */     //   1968: invokevirtual m_146909_ : ()F
/*     */     //   1971: invokevirtual m_7678_ : (DDDFF)V
/*     */     //   1974: aload #12
/*     */     //   1976: aload #7
/*     */     //   1978: invokevirtual m_146908_ : ()F
/*     */     //   1981: invokevirtual m_5618_ : (F)V
/*     */     //   1984: aload #12
/*     */     //   1986: aload #7
/*     */     //   1988: invokevirtual m_146908_ : ()F
/*     */     //   1991: invokevirtual m_5616_ : (F)V
/*     */     //   1994: aload #12
/*     */     //   1996: dconst_0
/*     */     //   1997: dconst_0
/*     */     //   1998: dconst_0
/*     */     //   1999: invokevirtual m_20334_ : (DDD)V
/*     */     //   2002: aload #12
/*     */     //   2004: instanceof net/minecraft/world/entity/Mob
/*     */     //   2007: ifeq -> 2041
/*     */     //   2010: aload #12
/*     */     //   2012: checkcast net/minecraft/world/entity/Mob
/*     */     //   2015: astore #13
/*     */     //   2017: aload #13
/*     */     //   2019: aload #11
/*     */     //   2021: aload_0
/*     */     //   2022: aload #12
/*     */     //   2024: invokevirtual m_142538_ : ()Lnet/minecraft/core/BlockPos;
/*     */     //   2027: invokeinterface m_6436_ : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
/*     */     //   2032: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
/*     */     //   2035: aconst_null
/*     */     //   2036: aconst_null
/*     */     //   2037: invokevirtual m_6518_ : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
/*     */     //   2040: pop
/*     */     //   2041: aload_0
/*     */     //   2042: aload #12
/*     */     //   2044: invokeinterface m_7967_ : (Lnet/minecraft/world/entity/Entity;)Z
/*     */     //   2049: pop
/*     */     //   2050: aload #7
/*     */     //   2052: getfield f_19853_ : Lnet/minecraft/world/level/Level;
/*     */     //   2055: invokevirtual m_5776_ : ()Z
/*     */     //   2058: ifne -> 2066
/*     */     //   2061: aload #7
/*     */     //   2063: invokevirtual m_146870_ : ()V
/*     */     //   2066: aload #7
/*     */     //   2068: instanceof net/minecraft/world/entity/player/Player
/*     */     //   2071: ifeq -> 2096
/*     */     //   2074: aload #7
/*     */     //   2076: checkcast net/minecraft/world/entity/player/Player
/*     */     //   2079: astore #11
/*     */     //   2081: aload #11
/*     */     //   2083: invokevirtual m_150110_ : ()Lnet/minecraft/world/entity/player/Abilities;
/*     */     //   2086: getfield f_35937_ : Z
/*     */     //   2089: ifeq -> 2096
/*     */     //   2092: iconst_1
/*     */     //   2093: goto -> 2097
/*     */     //   2096: iconst_0
/*     */     //   2097: iconst_1
/*     */     //   2098: if_icmpeq -> 2159
/*     */     //   2101: aload #7
/*     */     //   2103: instanceof net/minecraft/world/entity/player/Player
/*     */     //   2106: ifeq -> 2159
/*     */     //   2109: aload #7
/*     */     //   2111: checkcast net/minecraft/world/entity/player/Player
/*     */     //   2114: astore #12
/*     */     //   2116: new net/minecraft/world/item/ItemStack
/*     */     //   2119: dup
/*     */     //   2120: getstatic net/ltxprogrammer/turned/init/LatexModItems.RECRUITMENTPAPER : Lnet/minecraftforge/registries/RegistryObject;
/*     */     //   2123: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   2126: checkcast net/minecraft/world/level/ItemLike
/*     */     //   2129: invokespecial <init> : (Lnet/minecraft/world/level/ItemLike;)V
/*     */     //   2132: astore #13
/*     */     //   2134: aload #12
/*     */     //   2136: invokevirtual m_150109_ : ()Lnet/minecraft/world/entity/player/Inventory;
/*     */     //   2139: aload #13
/*     */     //   2141: <illegal opcode> test : (Lnet/minecraft/world/item/ItemStack;)Ljava/util/function/Predicate;
/*     */     //   2146: iconst_1
/*     */     //   2147: aload #12
/*     */     //   2149: getfield f_36095_ : Lnet/minecraft/world/inventory/InventoryMenu;
/*     */     //   2152: invokevirtual m_39730_ : ()Lnet/minecraft/world/inventory/CraftingContainer;
/*     */     //   2155: invokevirtual m_36022_ : (Ljava/util/function/Predicate;ILnet/minecraft/world/Container;)I
/*     */     //   2158: pop
/*     */     //   2159: aload #8
/*     */     //   2161: instanceof net/minecraft/world/entity/LivingEntity
/*     */     //   2164: ifeq -> 2185
/*     */     //   2167: aload #8
/*     */     //   2169: checkcast net/minecraft/world/entity/LivingEntity
/*     */     //   2172: astore #9
/*     */     //   2174: aload #9
/*     */     //   2176: getstatic net/minecraft/world/entity/EquipmentSlot.HEAD : Lnet/minecraft/world/entity/EquipmentSlot;
/*     */     //   2179: invokevirtual m_6844_ : (Lnet/minecraft/world/entity/EquipmentSlot;)Lnet/minecraft/world/item/ItemStack;
/*     */     //   2182: goto -> 2188
/*     */     //   2185: getstatic net/minecraft/world/item/ItemStack.f_41583_ : Lnet/minecraft/world/item/ItemStack;
/*     */     //   2188: invokevirtual m_41720_ : ()Lnet/minecraft/world/item/Item;
/*     */     //   2191: getstatic net/ltxprogrammer/turned/init/LatexModItems.EVIL_BERET_HELMET : Lnet/minecraftforge/registries/RegistryObject;
/*     */     //   2194: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   2197: if_acmpne -> 2698
/*     */     //   2200: aload #7
/*     */     //   2202: instanceof net/ltxprogrammer/turned/entity/EvilScientistEntity
/*     */     //   2205: ifeq -> 2698
/*     */     //   2208: invokestatic random : ()D
/*     */     //   2211: ldc2_w 0.5
/*     */     //   2214: dcmpg
/*     */     //   2215: ifge -> 2458
/*     */     //   2218: aload_0
/*     */     //   2219: instanceof net/minecraft/server/level/ServerLevel
/*     */     //   2222: ifeq -> 2346
/*     */     //   2225: aload_0
/*     */     //   2226: checkcast net/minecraft/server/level/ServerLevel
/*     */     //   2229: astore #11
/*     */     //   2231: new net/ltxprogrammer/turned/entity/EvilSniperEntity
/*     */     //   2234: dup
/*     */     //   2235: getstatic net/ltxprogrammer/turned/init/LatexModEntities.EVIL_SNIPER : Lnet/minecraftforge/registries/RegistryObject;
/*     */     //   2238: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   2241: checkcast net/minecraft/world/entity/EntityType
/*     */     //   2244: aload #11
/*     */     //   2246: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
/*     */     //   2249: astore #12
/*     */     //   2251: aload #12
/*     */     //   2253: dload_1
/*     */     //   2254: dload_3
/*     */     //   2255: dload #5
/*     */     //   2257: aload #7
/*     */     //   2259: invokevirtual m_146908_ : ()F
/*     */     //   2262: aload #7
/*     */     //   2264: invokevirtual m_146909_ : ()F
/*     */     //   2267: invokevirtual m_7678_ : (DDDFF)V
/*     */     //   2270: aload #12
/*     */     //   2272: aload #7
/*     */     //   2274: invokevirtual m_146908_ : ()F
/*     */     //   2277: invokevirtual m_5618_ : (F)V
/*     */     //   2280: aload #12
/*     */     //   2282: aload #7
/*     */     //   2284: invokevirtual m_146908_ : ()F
/*     */     //   2287: invokevirtual m_5616_ : (F)V
/*     */     //   2290: aload #12
/*     */     //   2292: dconst_0
/*     */     //   2293: dconst_0
/*     */     //   2294: dconst_0
/*     */     //   2295: invokevirtual m_20334_ : (DDD)V
/*     */     //   2298: aload #12
/*     */     //   2300: instanceof net/minecraft/world/entity/Mob
/*     */     //   2303: ifeq -> 2337
/*     */     //   2306: aload #12
/*     */     //   2308: checkcast net/minecraft/world/entity/Mob
/*     */     //   2311: astore #13
/*     */     //   2313: aload #13
/*     */     //   2315: aload #11
/*     */     //   2317: aload_0
/*     */     //   2318: aload #12
/*     */     //   2320: invokevirtual m_142538_ : ()Lnet/minecraft/core/BlockPos;
/*     */     //   2323: invokeinterface m_6436_ : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
/*     */     //   2328: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
/*     */     //   2331: aconst_null
/*     */     //   2332: aconst_null
/*     */     //   2333: invokevirtual m_6518_ : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
/*     */     //   2336: pop
/*     */     //   2337: aload_0
/*     */     //   2338: aload #12
/*     */     //   2340: invokeinterface m_7967_ : (Lnet/minecraft/world/entity/Entity;)Z
/*     */     //   2345: pop
/*     */     //   2346: aload #7
/*     */     //   2348: getfield f_19853_ : Lnet/minecraft/world/level/Level;
/*     */     //   2351: invokevirtual m_5776_ : ()Z
/*     */     //   2354: ifne -> 2362
/*     */     //   2357: aload #7
/*     */     //   2359: invokevirtual m_146870_ : ()V
/*     */     //   2362: aload #7
/*     */     //   2364: instanceof net/minecraft/world/entity/player/Player
/*     */     //   2367: ifeq -> 2392
/*     */     //   2370: aload #7
/*     */     //   2372: checkcast net/minecraft/world/entity/player/Player
/*     */     //   2375: astore #11
/*     */     //   2377: aload #11
/*     */     //   2379: invokevirtual m_150110_ : ()Lnet/minecraft/world/entity/player/Abilities;
/*     */     //   2382: getfield f_35937_ : Z
/*     */     //   2385: ifeq -> 2392
/*     */     //   2388: iconst_1
/*     */     //   2389: goto -> 2393
/*     */     //   2392: iconst_0
/*     */     //   2393: iconst_1
/*     */     //   2394: if_icmpeq -> 3234
/*     */     //   2397: aload #7
/*     */     //   2399: instanceof net/minecraft/world/entity/player/Player
/*     */     //   2402: ifeq -> 2455
/*     */     //   2405: aload #7
/*     */     //   2407: checkcast net/minecraft/world/entity/player/Player
/*     */     //   2410: astore #12
/*     */     //   2412: new net/minecraft/world/item/ItemStack
/*     */     //   2415: dup
/*     */     //   2416: getstatic net/ltxprogrammer/turned/init/LatexModItems.RECRUITMENTPAPER : Lnet/minecraftforge/registries/RegistryObject;
/*     */     //   2419: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   2422: checkcast net/minecraft/world/level/ItemLike
/*     */     //   2425: invokespecial <init> : (Lnet/minecraft/world/level/ItemLike;)V
/*     */     //   2428: astore #13
/*     */     //   2430: aload #12
/*     */     //   2432: invokevirtual m_150109_ : ()Lnet/minecraft/world/entity/player/Inventory;
/*     */     //   2435: aload #13
/*     */     //   2437: <illegal opcode> test : (Lnet/minecraft/world/item/ItemStack;)Ljava/util/function/Predicate;
/*     */     //   2442: iconst_1
/*     */     //   2443: aload #12
/*     */     //   2445: getfield f_36095_ : Lnet/minecraft/world/inventory/InventoryMenu;
/*     */     //   2448: invokevirtual m_39730_ : ()Lnet/minecraft/world/inventory/CraftingContainer;
/*     */     //   2451: invokevirtual m_36022_ : (Ljava/util/function/Predicate;ILnet/minecraft/world/Container;)I
/*     */     //   2454: pop
/*     */     //   2455: goto -> 3234
/*     */     //   2458: aload_0
/*     */     //   2459: instanceof net/minecraft/server/level/ServerLevel
/*     */     //   2462: ifeq -> 2586
/*     */     //   2465: aload_0
/*     */     //   2466: checkcast net/minecraft/server/level/ServerLevel
/*     */     //   2469: astore #11
/*     */     //   2471: new net/ltxprogrammer/turned/entity/EvilMilitaryEntity
/*     */     //   2474: dup
/*     */     //   2475: getstatic net/ltxprogrammer/turned/init/LatexModEntities.EVIL_MILITARY : Lnet/minecraftforge/registries/RegistryObject;
/*     */     //   2478: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   2481: checkcast net/minecraft/world/entity/EntityType
/*     */     //   2484: aload #11
/*     */     //   2486: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
/*     */     //   2489: astore #12
/*     */     //   2491: aload #12
/*     */     //   2493: dload_1
/*     */     //   2494: dload_3
/*     */     //   2495: dload #5
/*     */     //   2497: aload #7
/*     */     //   2499: invokevirtual m_146908_ : ()F
/*     */     //   2502: aload #7
/*     */     //   2504: invokevirtual m_146909_ : ()F
/*     */     //   2507: invokevirtual m_7678_ : (DDDFF)V
/*     */     //   2510: aload #12
/*     */     //   2512: aload #7
/*     */     //   2514: invokevirtual m_146908_ : ()F
/*     */     //   2517: invokevirtual m_5618_ : (F)V
/*     */     //   2520: aload #12
/*     */     //   2522: aload #7
/*     */     //   2524: invokevirtual m_146908_ : ()F
/*     */     //   2527: invokevirtual m_5616_ : (F)V
/*     */     //   2530: aload #12
/*     */     //   2532: dconst_0
/*     */     //   2533: dconst_0
/*     */     //   2534: dconst_0
/*     */     //   2535: invokevirtual m_20334_ : (DDD)V
/*     */     //   2538: aload #12
/*     */     //   2540: instanceof net/minecraft/world/entity/Mob
/*     */     //   2543: ifeq -> 2577
/*     */     //   2546: aload #12
/*     */     //   2548: checkcast net/minecraft/world/entity/Mob
/*     */     //   2551: astore #13
/*     */     //   2553: aload #13
/*     */     //   2555: aload #11
/*     */     //   2557: aload_0
/*     */     //   2558: aload #12
/*     */     //   2560: invokevirtual m_142538_ : ()Lnet/minecraft/core/BlockPos;
/*     */     //   2563: invokeinterface m_6436_ : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
/*     */     //   2568: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
/*     */     //   2571: aconst_null
/*     */     //   2572: aconst_null
/*     */     //   2573: invokevirtual m_6518_ : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
/*     */     //   2576: pop
/*     */     //   2577: aload_0
/*     */     //   2578: aload #12
/*     */     //   2580: invokeinterface m_7967_ : (Lnet/minecraft/world/entity/Entity;)Z
/*     */     //   2585: pop
/*     */     //   2586: aload #7
/*     */     //   2588: getfield f_19853_ : Lnet/minecraft/world/level/Level;
/*     */     //   2591: invokevirtual m_5776_ : ()Z
/*     */     //   2594: ifne -> 2602
/*     */     //   2597: aload #7
/*     */     //   2599: invokevirtual m_146870_ : ()V
/*     */     //   2602: aload #7
/*     */     //   2604: instanceof net/minecraft/world/entity/player/Player
/*     */     //   2607: ifeq -> 2632
/*     */     //   2610: aload #7
/*     */     //   2612: checkcast net/minecraft/world/entity/player/Player
/*     */     //   2615: astore #11
/*     */     //   2617: aload #11
/*     */     //   2619: invokevirtual m_150110_ : ()Lnet/minecraft/world/entity/player/Abilities;
/*     */     //   2622: getfield f_35937_ : Z
/*     */     //   2625: ifeq -> 2632
/*     */     //   2628: iconst_1
/*     */     //   2629: goto -> 2633
/*     */     //   2632: iconst_0
/*     */     //   2633: iconst_1
/*     */     //   2634: if_icmpeq -> 3234
/*     */     //   2637: aload #7
/*     */     //   2639: instanceof net/minecraft/world/entity/player/Player
/*     */     //   2642: ifeq -> 2695
/*     */     //   2645: aload #7
/*     */     //   2647: checkcast net/minecraft/world/entity/player/Player
/*     */     //   2650: astore #12
/*     */     //   2652: new net/minecraft/world/item/ItemStack
/*     */     //   2655: dup
/*     */     //   2656: getstatic net/ltxprogrammer/turned/init/LatexModItems.RECRUITMENTPAPER : Lnet/minecraftforge/registries/RegistryObject;
/*     */     //   2659: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   2662: checkcast net/minecraft/world/level/ItemLike
/*     */     //   2665: invokespecial <init> : (Lnet/minecraft/world/level/ItemLike;)V
/*     */     //   2668: astore #13
/*     */     //   2670: aload #12
/*     */     //   2672: invokevirtual m_150109_ : ()Lnet/minecraft/world/entity/player/Inventory;
/*     */     //   2675: aload #13
/*     */     //   2677: <illegal opcode> test : (Lnet/minecraft/world/item/ItemStack;)Ljava/util/function/Predicate;
/*     */     //   2682: iconst_1
/*     */     //   2683: aload #12
/*     */     //   2685: getfield f_36095_ : Lnet/minecraft/world/inventory/InventoryMenu;
/*     */     //   2688: invokevirtual m_39730_ : ()Lnet/minecraft/world/inventory/CraftingContainer;
/*     */     //   2691: invokevirtual m_36022_ : (Ljava/util/function/Predicate;ILnet/minecraft/world/Container;)I
/*     */     //   2694: pop
/*     */     //   2695: goto -> 3234
/*     */     //   2698: aload #8
/*     */     //   2700: instanceof net/minecraft/world/entity/LivingEntity
/*     */     //   2703: ifeq -> 2724
/*     */     //   2706: aload #8
/*     */     //   2708: checkcast net/minecraft/world/entity/LivingEntity
/*     */     //   2711: astore #10
/*     */     //   2713: aload #10
/*     */     //   2715: getstatic net/minecraft/world/entity/EquipmentSlot.HEAD : Lnet/minecraft/world/entity/EquipmentSlot;
/*     */     //   2718: invokevirtual m_6844_ : (Lnet/minecraft/world/entity/EquipmentSlot;)Lnet/minecraft/world/item/ItemStack;
/*     */     //   2721: goto -> 2727
/*     */     //   2724: getstatic net/minecraft/world/item/ItemStack.f_41583_ : Lnet/minecraft/world/item/ItemStack;
/*     */     //   2727: invokevirtual m_41720_ : ()Lnet/minecraft/world/item/Item;
/*     */     //   2730: getstatic net/ltxprogrammer/turned/init/LatexModItems.EVIL_BERET_HELMET : Lnet/minecraftforge/registries/RegistryObject;
/*     */     //   2733: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   2736: if_acmpne -> 3234
/*     */     //   2739: aload #7
/*     */     //   2741: instanceof net/ltxprogrammer/turned/entity/CivilianEntity
/*     */     //   2744: ifeq -> 3234
/*     */     //   2747: invokestatic random : ()D
/*     */     //   2750: ldc2_w 0.5
/*     */     //   2753: dcmpg
/*     */     //   2754: ifge -> 2997
/*     */     //   2757: aload_0
/*     */     //   2758: instanceof net/minecraft/server/level/ServerLevel
/*     */     //   2761: ifeq -> 2885
/*     */     //   2764: aload_0
/*     */     //   2765: checkcast net/minecraft/server/level/ServerLevel
/*     */     //   2768: astore #11
/*     */     //   2770: new net/ltxprogrammer/turned/entity/EvilScientistEntity
/*     */     //   2773: dup
/*     */     //   2774: getstatic net/ltxprogrammer/turned/init/LatexModEntities.EVIL_SCIENTIST : Lnet/minecraftforge/registries/RegistryObject;
/*     */     //   2777: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   2780: checkcast net/minecraft/world/entity/EntityType
/*     */     //   2783: aload #11
/*     */     //   2785: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
/*     */     //   2788: astore #12
/*     */     //   2790: aload #12
/*     */     //   2792: dload_1
/*     */     //   2793: dload_3
/*     */     //   2794: dload #5
/*     */     //   2796: aload #7
/*     */     //   2798: invokevirtual m_146908_ : ()F
/*     */     //   2801: aload #7
/*     */     //   2803: invokevirtual m_146909_ : ()F
/*     */     //   2806: invokevirtual m_7678_ : (DDDFF)V
/*     */     //   2809: aload #12
/*     */     //   2811: aload #7
/*     */     //   2813: invokevirtual m_146908_ : ()F
/*     */     //   2816: invokevirtual m_5618_ : (F)V
/*     */     //   2819: aload #12
/*     */     //   2821: aload #7
/*     */     //   2823: invokevirtual m_146908_ : ()F
/*     */     //   2826: invokevirtual m_5616_ : (F)V
/*     */     //   2829: aload #12
/*     */     //   2831: dconst_0
/*     */     //   2832: dconst_0
/*     */     //   2833: dconst_0
/*     */     //   2834: invokevirtual m_20334_ : (DDD)V
/*     */     //   2837: aload #12
/*     */     //   2839: instanceof net/minecraft/world/entity/Mob
/*     */     //   2842: ifeq -> 2876
/*     */     //   2845: aload #12
/*     */     //   2847: checkcast net/minecraft/world/entity/Mob
/*     */     //   2850: astore #13
/*     */     //   2852: aload #13
/*     */     //   2854: aload #11
/*     */     //   2856: aload_0
/*     */     //   2857: aload #12
/*     */     //   2859: invokevirtual m_142538_ : ()Lnet/minecraft/core/BlockPos;
/*     */     //   2862: invokeinterface m_6436_ : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
/*     */     //   2867: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
/*     */     //   2870: aconst_null
/*     */     //   2871: aconst_null
/*     */     //   2872: invokevirtual m_6518_ : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
/*     */     //   2875: pop
/*     */     //   2876: aload_0
/*     */     //   2877: aload #12
/*     */     //   2879: invokeinterface m_7967_ : (Lnet/minecraft/world/entity/Entity;)Z
/*     */     //   2884: pop
/*     */     //   2885: aload #7
/*     */     //   2887: getfield f_19853_ : Lnet/minecraft/world/level/Level;
/*     */     //   2890: invokevirtual m_5776_ : ()Z
/*     */     //   2893: ifne -> 2901
/*     */     //   2896: aload #7
/*     */     //   2898: invokevirtual m_146870_ : ()V
/*     */     //   2901: aload #7
/*     */     //   2903: instanceof net/minecraft/world/entity/player/Player
/*     */     //   2906: ifeq -> 2931
/*     */     //   2909: aload #7
/*     */     //   2911: checkcast net/minecraft/world/entity/player/Player
/*     */     //   2914: astore #11
/*     */     //   2916: aload #11
/*     */     //   2918: invokevirtual m_150110_ : ()Lnet/minecraft/world/entity/player/Abilities;
/*     */     //   2921: getfield f_35937_ : Z
/*     */     //   2924: ifeq -> 2931
/*     */     //   2927: iconst_1
/*     */     //   2928: goto -> 2932
/*     */     //   2931: iconst_0
/*     */     //   2932: iconst_1
/*     */     //   2933: if_icmpeq -> 3234
/*     */     //   2936: aload #7
/*     */     //   2938: instanceof net/minecraft/world/entity/player/Player
/*     */     //   2941: ifeq -> 2994
/*     */     //   2944: aload #7
/*     */     //   2946: checkcast net/minecraft/world/entity/player/Player
/*     */     //   2949: astore #12
/*     */     //   2951: new net/minecraft/world/item/ItemStack
/*     */     //   2954: dup
/*     */     //   2955: getstatic net/ltxprogrammer/turned/init/LatexModItems.RECRUITMENTPAPER : Lnet/minecraftforge/registries/RegistryObject;
/*     */     //   2958: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   2961: checkcast net/minecraft/world/level/ItemLike
/*     */     //   2964: invokespecial <init> : (Lnet/minecraft/world/level/ItemLike;)V
/*     */     //   2967: astore #13
/*     */     //   2969: aload #12
/*     */     //   2971: invokevirtual m_150109_ : ()Lnet/minecraft/world/entity/player/Inventory;
/*     */     //   2974: aload #13
/*     */     //   2976: <illegal opcode> test : (Lnet/minecraft/world/item/ItemStack;)Ljava/util/function/Predicate;
/*     */     //   2981: iconst_1
/*     */     //   2982: aload #12
/*     */     //   2984: getfield f_36095_ : Lnet/minecraft/world/inventory/InventoryMenu;
/*     */     //   2987: invokevirtual m_39730_ : ()Lnet/minecraft/world/inventory/CraftingContainer;
/*     */     //   2990: invokevirtual m_36022_ : (Ljava/util/function/Predicate;ILnet/minecraft/world/Container;)I
/*     */     //   2993: pop
/*     */     //   2994: goto -> 3234
/*     */     //   2997: aload_0
/*     */     //   2998: instanceof net/minecraft/server/level/ServerLevel
/*     */     //   3001: ifeq -> 3125
/*     */     //   3004: aload_0
/*     */     //   3005: checkcast net/minecraft/server/level/ServerLevel
/*     */     //   3008: astore #11
/*     */     //   3010: new net/ltxprogrammer/turned/entity/EvilMilitaryEntity
/*     */     //   3013: dup
/*     */     //   3014: getstatic net/ltxprogrammer/turned/init/LatexModEntities.EVIL_MILITARY : Lnet/minecraftforge/registries/RegistryObject;
/*     */     //   3017: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   3020: checkcast net/minecraft/world/entity/EntityType
/*     */     //   3023: aload #11
/*     */     //   3025: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
/*     */     //   3028: astore #12
/*     */     //   3030: aload #12
/*     */     //   3032: dload_1
/*     */     //   3033: dload_3
/*     */     //   3034: dload #5
/*     */     //   3036: aload #7
/*     */     //   3038: invokevirtual m_146908_ : ()F
/*     */     //   3041: aload #7
/*     */     //   3043: invokevirtual m_146909_ : ()F
/*     */     //   3046: invokevirtual m_7678_ : (DDDFF)V
/*     */     //   3049: aload #12
/*     */     //   3051: aload #7
/*     */     //   3053: invokevirtual m_146908_ : ()F
/*     */     //   3056: invokevirtual m_5618_ : (F)V
/*     */     //   3059: aload #12
/*     */     //   3061: aload #7
/*     */     //   3063: invokevirtual m_146908_ : ()F
/*     */     //   3066: invokevirtual m_5616_ : (F)V
/*     */     //   3069: aload #12
/*     */     //   3071: dconst_0
/*     */     //   3072: dconst_0
/*     */     //   3073: dconst_0
/*     */     //   3074: invokevirtual m_20334_ : (DDD)V
/*     */     //   3077: aload #12
/*     */     //   3079: instanceof net/minecraft/world/entity/Mob
/*     */     //   3082: ifeq -> 3116
/*     */     //   3085: aload #12
/*     */     //   3087: checkcast net/minecraft/world/entity/Mob
/*     */     //   3090: astore #13
/*     */     //   3092: aload #13
/*     */     //   3094: aload #11
/*     */     //   3096: aload_0
/*     */     //   3097: aload #12
/*     */     //   3099: invokevirtual m_142538_ : ()Lnet/minecraft/core/BlockPos;
/*     */     //   3102: invokeinterface m_6436_ : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
/*     */     //   3107: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
/*     */     //   3110: aconst_null
/*     */     //   3111: aconst_null
/*     */     //   3112: invokevirtual m_6518_ : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
/*     */     //   3115: pop
/*     */     //   3116: aload_0
/*     */     //   3117: aload #12
/*     */     //   3119: invokeinterface m_7967_ : (Lnet/minecraft/world/entity/Entity;)Z
/*     */     //   3124: pop
/*     */     //   3125: aload #7
/*     */     //   3127: getfield f_19853_ : Lnet/minecraft/world/level/Level;
/*     */     //   3130: invokevirtual m_5776_ : ()Z
/*     */     //   3133: ifne -> 3141
/*     */     //   3136: aload #7
/*     */     //   3138: invokevirtual m_146870_ : ()V
/*     */     //   3141: aload #7
/*     */     //   3143: instanceof net/minecraft/world/entity/player/Player
/*     */     //   3146: ifeq -> 3171
/*     */     //   3149: aload #7
/*     */     //   3151: checkcast net/minecraft/world/entity/player/Player
/*     */     //   3154: astore #11
/*     */     //   3156: aload #11
/*     */     //   3158: invokevirtual m_150110_ : ()Lnet/minecraft/world/entity/player/Abilities;
/*     */     //   3161: getfield f_35937_ : Z
/*     */     //   3164: ifeq -> 3171
/*     */     //   3167: iconst_1
/*     */     //   3168: goto -> 3172
/*     */     //   3171: iconst_0
/*     */     //   3172: iconst_1
/*     */     //   3173: if_icmpeq -> 3234
/*     */     //   3176: aload #7
/*     */     //   3178: instanceof net/minecraft/world/entity/player/Player
/*     */     //   3181: ifeq -> 3234
/*     */     //   3184: aload #7
/*     */     //   3186: checkcast net/minecraft/world/entity/player/Player
/*     */     //   3189: astore #12
/*     */     //   3191: new net/minecraft/world/item/ItemStack
/*     */     //   3194: dup
/*     */     //   3195: getstatic net/ltxprogrammer/turned/init/LatexModItems.RECRUITMENTPAPER : Lnet/minecraftforge/registries/RegistryObject;
/*     */     //   3198: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   3201: checkcast net/minecraft/world/level/ItemLike
/*     */     //   3204: invokespecial <init> : (Lnet/minecraft/world/level/ItemLike;)V
/*     */     //   3207: astore #13
/*     */     //   3209: aload #12
/*     */     //   3211: invokevirtual m_150109_ : ()Lnet/minecraft/world/entity/player/Inventory;
/*     */     //   3214: aload #13
/*     */     //   3216: <illegal opcode> test : (Lnet/minecraft/world/item/ItemStack;)Ljava/util/function/Predicate;
/*     */     //   3221: iconst_1
/*     */     //   3222: aload #12
/*     */     //   3224: getfield f_36095_ : Lnet/minecraft/world/inventory/InventoryMenu;
/*     */     //   3227: invokevirtual m_39730_ : ()Lnet/minecraft/world/inventory/CraftingContainer;
/*     */     //   3230: invokevirtual m_36022_ : (Ljava/util/function/Predicate;ILnet/minecraft/world/Container;)I
/*     */     //   3233: pop
/*     */     //   3234: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #29	-> 0
/*     */     //   #30	-> 10
/*     */     //   #31	-> 11
/*     */     //   #32	-> 19
/*     */     //   #33	-> 32
/*     */     //   #34	-> 52
/*     */     //   #35	-> 71
/*     */     //   #36	-> 81
/*     */     //   #37	-> 91
/*     */     //   #38	-> 99
/*     */     //   #39	-> 114
/*     */     //   #41	-> 138
/*     */     //   #43	-> 147
/*     */     //   #44	-> 158
/*     */     //   #45	-> 163
/*     */     //   #46	-> 198
/*     */     //   #47	-> 213
/*     */     //   #48	-> 231
/*     */     //   #49	-> 249
/*     */     //   #48	-> 252
/*     */     //   #50	-> 256
/*     */     //   #52	-> 259
/*     */     //   #53	-> 267
/*     */     //   #54	-> 296
/*     */     //   #55	-> 308
/*     */     //   #56	-> 318
/*     */     //   #57	-> 331
/*     */     //   #58	-> 351
/*     */     //   #59	-> 370
/*     */     //   #60	-> 380
/*     */     //   #61	-> 390
/*     */     //   #62	-> 398
/*     */     //   #63	-> 413
/*     */     //   #65	-> 437
/*     */     //   #67	-> 446
/*     */     //   #68	-> 457
/*     */     //   #69	-> 462
/*     */     //   #70	-> 497
/*     */     //   #71	-> 512
/*     */     //   #72	-> 530
/*     */     //   #73	-> 548
/*     */     //   #72	-> 551
/*     */     //   #74	-> 555
/*     */     //   #77	-> 558
/*     */     //   #78	-> 571
/*     */     //   #79	-> 591
/*     */     //   #80	-> 610
/*     */     //   #81	-> 620
/*     */     //   #82	-> 630
/*     */     //   #83	-> 638
/*     */     //   #84	-> 653
/*     */     //   #86	-> 677
/*     */     //   #88	-> 686
/*     */     //   #89	-> 697
/*     */     //   #90	-> 702
/*     */     //   #91	-> 737
/*     */     //   #92	-> 752
/*     */     //   #93	-> 770
/*     */     //   #94	-> 788
/*     */     //   #93	-> 791
/*     */     //   #95	-> 795
/*     */     //   #98	-> 798
/*     */     //   #99	-> 806
/*     */     //   #100	-> 835
/*     */     //   #101	-> 847
/*     */     //   #102	-> 857
/*     */     //   #103	-> 870
/*     */     //   #104	-> 890
/*     */     //   #105	-> 909
/*     */     //   #106	-> 919
/*     */     //   #107	-> 929
/*     */     //   #108	-> 937
/*     */     //   #109	-> 952
/*     */     //   #111	-> 976
/*     */     //   #113	-> 985
/*     */     //   #114	-> 996
/*     */     //   #115	-> 1001
/*     */     //   #116	-> 1036
/*     */     //   #117	-> 1051
/*     */     //   #118	-> 1069
/*     */     //   #119	-> 1087
/*     */     //   #118	-> 1090
/*     */     //   #120	-> 1094
/*     */     //   #122	-> 1097
/*     */     //   #123	-> 1107
/*     */     //   #124	-> 1120
/*     */     //   #125	-> 1140
/*     */     //   #126	-> 1159
/*     */     //   #127	-> 1169
/*     */     //   #128	-> 1179
/*     */     //   #129	-> 1187
/*     */     //   #130	-> 1202
/*     */     //   #132	-> 1226
/*     */     //   #134	-> 1235
/*     */     //   #135	-> 1246
/*     */     //   #136	-> 1251
/*     */     //   #137	-> 1286
/*     */     //   #138	-> 1301
/*     */     //   #139	-> 1319
/*     */     //   #140	-> 1337
/*     */     //   #139	-> 1340
/*     */     //   #141	-> 1344
/*     */     //   #144	-> 1347
/*     */     //   #145	-> 1360
/*     */     //   #146	-> 1380
/*     */     //   #147	-> 1399
/*     */     //   #148	-> 1409
/*     */     //   #149	-> 1419
/*     */     //   #150	-> 1427
/*     */     //   #151	-> 1442
/*     */     //   #153	-> 1466
/*     */     //   #155	-> 1475
/*     */     //   #156	-> 1486
/*     */     //   #157	-> 1491
/*     */     //   #158	-> 1526
/*     */     //   #159	-> 1541
/*     */     //   #160	-> 1559
/*     */     //   #161	-> 1577
/*     */     //   #160	-> 1580
/*     */     //   #166	-> 1584
/*     */     //   #167	-> 1613
/*     */     //   #168	-> 1633
/*     */     //   #169	-> 1646
/*     */     //   #170	-> 1666
/*     */     //   #171	-> 1685
/*     */     //   #172	-> 1695
/*     */     //   #173	-> 1705
/*     */     //   #174	-> 1713
/*     */     //   #175	-> 1728
/*     */     //   #177	-> 1752
/*     */     //   #179	-> 1761
/*     */     //   #180	-> 1772
/*     */     //   #181	-> 1777
/*     */     //   #182	-> 1812
/*     */     //   #183	-> 1827
/*     */     //   #184	-> 1845
/*     */     //   #185	-> 1863
/*     */     //   #184	-> 1866
/*     */     //   #186	-> 1870
/*     */     //   #188	-> 1873
/*     */     //   #189	-> 1902
/*     */     //   #190	-> 1922
/*     */     //   #191	-> 1935
/*     */     //   #192	-> 1955
/*     */     //   #193	-> 1974
/*     */     //   #194	-> 1984
/*     */     //   #195	-> 1994
/*     */     //   #196	-> 2002
/*     */     //   #197	-> 2017
/*     */     //   #199	-> 2041
/*     */     //   #201	-> 2050
/*     */     //   #202	-> 2061
/*     */     //   #203	-> 2066
/*     */     //   #204	-> 2101
/*     */     //   #205	-> 2116
/*     */     //   #206	-> 2134
/*     */     //   #207	-> 2152
/*     */     //   #206	-> 2155
/*     */     //   #211	-> 2159
/*     */     //   #212	-> 2188
/*     */     //   #213	-> 2208
/*     */     //   #214	-> 2218
/*     */     //   #215	-> 2231
/*     */     //   #216	-> 2251
/*     */     //   #217	-> 2270
/*     */     //   #218	-> 2280
/*     */     //   #219	-> 2290
/*     */     //   #220	-> 2298
/*     */     //   #221	-> 2313
/*     */     //   #223	-> 2337
/*     */     //   #225	-> 2346
/*     */     //   #226	-> 2357
/*     */     //   #227	-> 2362
/*     */     //   #228	-> 2397
/*     */     //   #229	-> 2412
/*     */     //   #230	-> 2430
/*     */     //   #231	-> 2448
/*     */     //   #230	-> 2451
/*     */     //   #232	-> 2455
/*     */     //   #235	-> 2458
/*     */     //   #236	-> 2471
/*     */     //   #237	-> 2491
/*     */     //   #238	-> 2510
/*     */     //   #239	-> 2520
/*     */     //   #240	-> 2530
/*     */     //   #241	-> 2538
/*     */     //   #242	-> 2553
/*     */     //   #244	-> 2577
/*     */     //   #246	-> 2586
/*     */     //   #247	-> 2597
/*     */     //   #248	-> 2602
/*     */     //   #249	-> 2637
/*     */     //   #250	-> 2652
/*     */     //   #251	-> 2670
/*     */     //   #252	-> 2688
/*     */     //   #251	-> 2691
/*     */     //   #253	-> 2695
/*     */     //   #256	-> 2698
/*     */     //   #257	-> 2727
/*     */     //   #258	-> 2747
/*     */     //   #259	-> 2757
/*     */     //   #260	-> 2770
/*     */     //   #261	-> 2790
/*     */     //   #262	-> 2809
/*     */     //   #263	-> 2819
/*     */     //   #264	-> 2829
/*     */     //   #265	-> 2837
/*     */     //   #266	-> 2852
/*     */     //   #268	-> 2876
/*     */     //   #270	-> 2885
/*     */     //   #271	-> 2896
/*     */     //   #272	-> 2901
/*     */     //   #273	-> 2936
/*     */     //   #274	-> 2951
/*     */     //   #275	-> 2969
/*     */     //   #276	-> 2987
/*     */     //   #275	-> 2990
/*     */     //   #277	-> 2994
/*     */     //   #280	-> 2997
/*     */     //   #281	-> 3010
/*     */     //   #282	-> 3030
/*     */     //   #283	-> 3049
/*     */     //   #284	-> 3059
/*     */     //   #285	-> 3069
/*     */     //   #286	-> 3077
/*     */     //   #287	-> 3092
/*     */     //   #289	-> 3116
/*     */     //   #291	-> 3125
/*     */     //   #292	-> 3136
/*     */     //   #293	-> 3141
/*     */     //   #294	-> 3176
/*     */     //   #295	-> 3191
/*     */     //   #296	-> 3209
/*     */     //   #297	-> 3227
/*     */     //   #296	-> 3230
/*     */     //   #302	-> 3234
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   114	24	13	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
/*     */     //   52	95	12	entityToSpawn	Lnet/minecraft/world/entity/Entity;
/*     */     //   32	115	11	_level	Lnet/minecraft/server/level/ServerLevel;
/*     */     //   178	15	11	_plr	Lnet/minecraft/world/entity/player/Player;
/*     */     //   231	25	13	_stktoremove	Lnet/minecraft/world/item/ItemStack;
/*     */     //   213	43	12	_player	Lnet/minecraft/world/entity/player/Player;
/*     */     //   282	11	9	_entGetArmor	Lnet/minecraft/world/entity/LivingEntity;
/*     */     //   413	24	13	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
/*     */     //   351	95	12	entityToSpawn	Lnet/minecraft/world/entity/Entity;
/*     */     //   331	115	11	_level	Lnet/minecraft/server/level/ServerLevel;
/*     */     //   477	15	11	_plr	Lnet/minecraft/world/entity/player/Player;
/*     */     //   530	25	13	_stktoremove	Lnet/minecraft/world/item/ItemStack;
/*     */     //   512	43	12	_player	Lnet/minecraft/world/entity/player/Player;
/*     */     //   653	24	13	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
/*     */     //   591	95	12	entityToSpawn	Lnet/minecraft/world/entity/Entity;
/*     */     //   571	115	11	_level	Lnet/minecraft/server/level/ServerLevel;
/*     */     //   717	15	11	_plr	Lnet/minecraft/world/entity/player/Player;
/*     */     //   770	25	13	_stktoremove	Lnet/minecraft/world/item/ItemStack;
/*     */     //   752	43	12	_player	Lnet/minecraft/world/entity/player/Player;
/*     */     //   821	11	10	_entGetArmor	Lnet/minecraft/world/entity/LivingEntity;
/*     */     //   952	24	13	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
/*     */     //   890	95	12	entityToSpawn	Lnet/minecraft/world/entity/Entity;
/*     */     //   870	115	11	_level	Lnet/minecraft/server/level/ServerLevel;
/*     */     //   1016	15	11	_plr	Lnet/minecraft/world/entity/player/Player;
/*     */     //   1069	25	13	_stktoremove	Lnet/minecraft/world/item/ItemStack;
/*     */     //   1051	43	12	_player	Lnet/minecraft/world/entity/player/Player;
/*     */     //   1202	24	13	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
/*     */     //   1140	95	12	entityToSpawn	Lnet/minecraft/world/entity/Entity;
/*     */     //   1120	115	11	_level	Lnet/minecraft/server/level/ServerLevel;
/*     */     //   1266	15	11	_plr	Lnet/minecraft/world/entity/player/Player;
/*     */     //   1319	25	13	_stktoremove	Lnet/minecraft/world/item/ItemStack;
/*     */     //   1301	43	12	_player	Lnet/minecraft/world/entity/player/Player;
/*     */     //   1442	24	13	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
/*     */     //   1380	95	12	entityToSpawn	Lnet/minecraft/world/entity/Entity;
/*     */     //   1360	115	11	_level	Lnet/minecraft/server/level/ServerLevel;
/*     */     //   1506	15	11	_plr	Lnet/minecraft/world/entity/player/Player;
/*     */     //   1559	25	13	_stktoremove	Lnet/minecraft/world/item/ItemStack;
/*     */     //   1541	43	12	_player	Lnet/minecraft/world/entity/player/Player;
/*     */     //   1599	11	9	_entGetArmor	Lnet/minecraft/world/entity/LivingEntity;
/*     */     //   1728	24	13	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
/*     */     //   1666	95	12	entityToSpawn	Lnet/minecraft/world/entity/Entity;
/*     */     //   1646	115	11	_level	Lnet/minecraft/server/level/ServerLevel;
/*     */     //   1792	15	11	_plr	Lnet/minecraft/world/entity/player/Player;
/*     */     //   1845	25	13	_stktoremove	Lnet/minecraft/world/item/ItemStack;
/*     */     //   1827	43	12	_player	Lnet/minecraft/world/entity/player/Player;
/*     */     //   1888	11	10	_entGetArmor	Lnet/minecraft/world/entity/LivingEntity;
/*     */     //   2017	24	13	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
/*     */     //   1955	95	12	entityToSpawn	Lnet/minecraft/world/entity/Entity;
/*     */     //   1935	115	11	_level	Lnet/minecraft/server/level/ServerLevel;
/*     */     //   2081	15	11	_plr	Lnet/minecraft/world/entity/player/Player;
/*     */     //   2134	25	13	_stktoremove	Lnet/minecraft/world/item/ItemStack;
/*     */     //   2116	43	12	_player	Lnet/minecraft/world/entity/player/Player;
/*     */     //   2174	11	9	_entGetArmor	Lnet/minecraft/world/entity/LivingEntity;
/*     */     //   2313	24	13	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
/*     */     //   2251	95	12	entityToSpawn	Lnet/minecraft/world/entity/Entity;
/*     */     //   2231	115	11	_level	Lnet/minecraft/server/level/ServerLevel;
/*     */     //   2377	15	11	_plr	Lnet/minecraft/world/entity/player/Player;
/*     */     //   2430	25	13	_stktoremove	Lnet/minecraft/world/item/ItemStack;
/*     */     //   2412	43	12	_player	Lnet/minecraft/world/entity/player/Player;
/*     */     //   2553	24	13	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
/*     */     //   2491	95	12	entityToSpawn	Lnet/minecraft/world/entity/Entity;
/*     */     //   2471	115	11	_level	Lnet/minecraft/server/level/ServerLevel;
/*     */     //   2617	15	11	_plr	Lnet/minecraft/world/entity/player/Player;
/*     */     //   2670	25	13	_stktoremove	Lnet/minecraft/world/item/ItemStack;
/*     */     //   2652	43	12	_player	Lnet/minecraft/world/entity/player/Player;
/*     */     //   2713	11	10	_entGetArmor	Lnet/minecraft/world/entity/LivingEntity;
/*     */     //   2852	24	13	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
/*     */     //   2790	95	12	entityToSpawn	Lnet/minecraft/world/entity/Entity;
/*     */     //   2770	115	11	_level	Lnet/minecraft/server/level/ServerLevel;
/*     */     //   2916	15	11	_plr	Lnet/minecraft/world/entity/player/Player;
/*     */     //   2969	25	13	_stktoremove	Lnet/minecraft/world/item/ItemStack;
/*     */     //   2951	43	12	_player	Lnet/minecraft/world/entity/player/Player;
/*     */     //   3092	24	13	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
/*     */     //   3030	95	12	entityToSpawn	Lnet/minecraft/world/entity/Entity;
/*     */     //   3010	115	11	_level	Lnet/minecraft/server/level/ServerLevel;
/*     */     //   3156	15	11	_plr	Lnet/minecraft/world/entity/player/Player;
/*     */     //   3209	25	13	_stktoremove	Lnet/minecraft/world/item/ItemStack;
/*     */     //   3191	43	12	_player	Lnet/minecraft/world/entity/player/Player;
/*     */     //   0	3235	0	world	Lnet/minecraft/world/level/LevelAccessor;
/*     */     //   0	3235	1	x	D
/*     */     //   0	3235	3	y	D
/*     */     //   0	3235	5	z	D
/*     */     //   0	3235	7	entity	Lnet/minecraft/world/entity/Entity;
/*     */     //   0	3235	8	sourceentity	Lnet/minecraft/world/entity/Entity;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\RecruitmentpaperRightclickedProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */