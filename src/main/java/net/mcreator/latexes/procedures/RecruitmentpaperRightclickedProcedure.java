/*     */ package net.mcreator.latexes.procedures;
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
/*     */     //   13: instanceof net/mcreator/latexes/entity/CivilianEntity
/*     */     //   16: ifeq -> 255
/*     */     //   19: aload_0
/*     */     //   20: instanceof net/minecraft/server/level/ServerLevel
/*     */     //   23: ifeq -> 147
/*     */     //   26: aload_0
/*     */     //   27: checkcast net/minecraft/server/level/ServerLevel
/*     */     //   30: astore #11
/*     */     //   32: new net/mcreator/latexes/entity/CivlianMilitiaEntity
/*     */     //   35: dup
/*     */     //   36: getstatic net/mcreator/latexes/init/LatexModEntities.CIVLIAN_MILITIA : Lnet/minecraftforge/registries/RegistryObject;
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
/*     */     //   60: invokevirtual getYRot : ()F
/*     */     //   63: aload #7
/*     */     //   65: invokevirtual getXRot : ()F
/*     */     //   68: invokevirtual moveTo : (DDDFF)V
/*     */     //   71: aload #12
/*     */     //   73: aload #7
/*     */     //   75: invokevirtual getYRot : ()F
/*     */     //   78: invokevirtual setYBodyRot : (F)V
/*     */     //   81: aload #12
/*     */     //   83: aload #7
/*     */     //   85: invokevirtual getYRot : ()F
/*     */     //   88: invokevirtual setYHeadRot : (F)V
/*     */     //   91: aload #12
/*     */     //   93: dconst_0
/*     */     //   94: dconst_0
/*     */     //   95: dconst_0
/*     */     //   96: invokevirtual setDeltaMovement : (DDD)V
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
/*     */     //   121: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
/*     */     //   124: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
/*     */     //   129: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
/*     */     //   132: aconst_null
/*     */     //   133: aconst_null
/*     */     //   134: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
/*     */     //   137: pop
/*     */     //   138: aload_0
/*     */     //   139: aload #12
/*     */     //   141: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
/*     */     //   146: pop
/*     */     //   147: aload #7
/*     */     //   149: getfield level : Lnet/minecraft/world/level/Level;
/*     */     //   152: invokevirtual isClientSide : ()Z
/*     */     //   155: ifne -> 163
/*     */     //   158: aload #7
/*     */     //   160: invokevirtual discard : ()V
/*     */     //   163: aload #7
/*     */     //   165: instanceof net/minecraft/world/entity/player/Player
/*     */     //   168: ifeq -> 189
/*     */     //   171: aload #7
/*     */     //   173: checkcast net/minecraft/world/entity/player/Player
/*     */     //   176: astore #11
/*     */     //   178: aload #11
/*     */     //   180: invokevirtual getAbilities : ()Lnet/minecraft/world/entity/player/Abilities;
/*     */     //   183: getfield instabuild : Z
/*     */     //   186: goto -> 190
/*     */     //   189: iconst_0
/*     */     //   190: iconst_1
/*     */     //   191: if_icmpeq -> 1560
/*     */     //   194: aload #7
/*     */     //   196: instanceof net/minecraft/world/entity/player/Player
/*     */     //   199: ifeq -> 252
/*     */     //   202: aload #7
/*     */     //   204: checkcast net/minecraft/world/entity/player/Player
/*     */     //   207: astore #12
/*     */     //   209: new net/minecraft/world/item/ItemStack
/*     */     //   212: dup
/*     */     //   213: getstatic net/mcreator/latexes/init/LatexModItems.RECRUITMENTPAPER : Lnet/minecraftforge/registries/RegistryObject;
/*     */     //   216: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   219: checkcast net/minecraft/world/level/ItemLike
/*     */     //   222: invokespecial <init> : (Lnet/minecraft/world/level/ItemLike;)V
/*     */     //   225: astore #13
/*     */     //   227: aload #12
/*     */     //   229: invokevirtual getInventory : ()Lnet/minecraft/world/entity/player/Inventory;
/*     */     //   232: aload #13
/*     */     //   234: <illegal opcode> test : (Lnet/minecraft/world/item/ItemStack;)Ljava/util/function/Predicate;
/*     */     //   239: iconst_1
/*     */     //   240: aload #12
/*     */     //   242: getfield inventoryMenu : Lnet/minecraft/world/inventory/InventoryMenu;
/*     */     //   245: invokevirtual getCraftSlots : ()Lnet/minecraft/world/inventory/CraftingContainer;
/*     */     //   248: invokevirtual clearOrCountMatchingItems : (Ljava/util/function/Predicate;ILnet/minecraft/world/Container;)I
/*     */     //   251: pop
/*     */     //   252: goto -> 1560
/*     */     //   255: aload #7
/*     */     //   257: instanceof net/mcreator/latexes/entity/CivilianEntity
/*     */     //   260: ifeq -> 786
/*     */     //   263: aload #8
/*     */     //   265: instanceof net/minecraft/world/entity/LivingEntity
/*     */     //   268: ifeq -> 289
/*     */     //   271: aload #8
/*     */     //   273: checkcast net/minecraft/world/entity/LivingEntity
/*     */     //   276: astore #9
/*     */     //   278: aload #9
/*     */     //   280: getstatic net/minecraft/world/entity/EquipmentSlot.HEAD : Lnet/minecraft/world/entity/EquipmentSlot;
/*     */     //   283: invokevirtual getItemBySlot : (Lnet/minecraft/world/entity/EquipmentSlot;)Lnet/minecraft/world/item/ItemStack;
/*     */     //   286: goto -> 292
/*     */     //   289: getstatic net/minecraft/world/item/ItemStack.EMPTY : Lnet/minecraft/world/item/ItemStack;
/*     */     //   292: invokevirtual getItem : ()Lnet/minecraft/world/item/Item;
/*     */     //   295: getstatic net/mcreator/latexes/init/LatexModItems.GOOD_BERET_HELMET : Lnet/minecraftforge/registries/RegistryObject;
/*     */     //   298: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   301: if_acmpne -> 786
/*     */     //   304: invokestatic random : ()D
/*     */     //   307: ldc2_w 0.5
/*     */     //   310: dcmpg
/*     */     //   311: ifge -> 550
/*     */     //   314: aload_0
/*     */     //   315: instanceof net/minecraft/server/level/ServerLevel
/*     */     //   318: ifeq -> 442
/*     */     //   321: aload_0
/*     */     //   322: checkcast net/minecraft/server/level/ServerLevel
/*     */     //   325: astore #11
/*     */     //   327: new net/mcreator/latexes/entity/ScientistEntity
/*     */     //   330: dup
/*     */     //   331: getstatic net/mcreator/latexes/init/LatexModEntities.SCIENTIST : Lnet/minecraftforge/registries/RegistryObject;
/*     */     //   334: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   337: checkcast net/minecraft/world/entity/EntityType
/*     */     //   340: aload #11
/*     */     //   342: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
/*     */     //   345: astore #12
/*     */     //   347: aload #12
/*     */     //   349: dload_1
/*     */     //   350: dload_3
/*     */     //   351: dload #5
/*     */     //   353: aload #7
/*     */     //   355: invokevirtual getYRot : ()F
/*     */     //   358: aload #7
/*     */     //   360: invokevirtual getXRot : ()F
/*     */     //   363: invokevirtual moveTo : (DDDFF)V
/*     */     //   366: aload #12
/*     */     //   368: aload #7
/*     */     //   370: invokevirtual getYRot : ()F
/*     */     //   373: invokevirtual setYBodyRot : (F)V
/*     */     //   376: aload #12
/*     */     //   378: aload #7
/*     */     //   380: invokevirtual getYRot : ()F
/*     */     //   383: invokevirtual setYHeadRot : (F)V
/*     */     //   386: aload #12
/*     */     //   388: dconst_0
/*     */     //   389: dconst_0
/*     */     //   390: dconst_0
/*     */     //   391: invokevirtual setDeltaMovement : (DDD)V
/*     */     //   394: aload #12
/*     */     //   396: instanceof net/minecraft/world/entity/Mob
/*     */     //   399: ifeq -> 433
/*     */     //   402: aload #12
/*     */     //   404: checkcast net/minecraft/world/entity/Mob
/*     */     //   407: astore #13
/*     */     //   409: aload #13
/*     */     //   411: aload #11
/*     */     //   413: aload_0
/*     */     //   414: aload #12
/*     */     //   416: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
/*     */     //   419: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
/*     */     //   424: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
/*     */     //   427: aconst_null
/*     */     //   428: aconst_null
/*     */     //   429: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
/*     */     //   432: pop
/*     */     //   433: aload_0
/*     */     //   434: aload #12
/*     */     //   436: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
/*     */     //   441: pop
/*     */     //   442: aload #7
/*     */     //   444: getfield level : Lnet/minecraft/world/level/Level;
/*     */     //   447: invokevirtual isClientSide : ()Z
/*     */     //   450: ifne -> 458
/*     */     //   453: aload #7
/*     */     //   455: invokevirtual discard : ()V
/*     */     //   458: aload #7
/*     */     //   460: instanceof net/minecraft/world/entity/player/Player
/*     */     //   463: ifeq -> 484
/*     */     //   466: aload #7
/*     */     //   468: checkcast net/minecraft/world/entity/player/Player
/*     */     //   471: astore #11
/*     */     //   473: aload #11
/*     */     //   475: invokevirtual getAbilities : ()Lnet/minecraft/world/entity/player/Abilities;
/*     */     //   478: getfield instabuild : Z
/*     */     //   481: goto -> 485
/*     */     //   484: iconst_0
/*     */     //   485: iconst_1
/*     */     //   486: if_icmpeq -> 1560
/*     */     //   489: aload #7
/*     */     //   491: instanceof net/minecraft/world/entity/player/Player
/*     */     //   494: ifeq -> 547
/*     */     //   497: aload #7
/*     */     //   499: checkcast net/minecraft/world/entity/player/Player
/*     */     //   502: astore #12
/*     */     //   504: new net/minecraft/world/item/ItemStack
/*     */     //   507: dup
/*     */     //   508: getstatic net/mcreator/latexes/init/LatexModItems.RECRUITMENTPAPER : Lnet/minecraftforge/registries/RegistryObject;
/*     */     //   511: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   514: checkcast net/minecraft/world/level/ItemLike
/*     */     //   517: invokespecial <init> : (Lnet/minecraft/world/level/ItemLike;)V
/*     */     //   520: astore #13
/*     */     //   522: aload #12
/*     */     //   524: invokevirtual getInventory : ()Lnet/minecraft/world/entity/player/Inventory;
/*     */     //   527: aload #13
/*     */     //   529: <illegal opcode> test : (Lnet/minecraft/world/item/ItemStack;)Ljava/util/function/Predicate;
/*     */     //   534: iconst_1
/*     */     //   535: aload #12
/*     */     //   537: getfield inventoryMenu : Lnet/minecraft/world/inventory/InventoryMenu;
/*     */     //   540: invokevirtual getCraftSlots : ()Lnet/minecraft/world/inventory/CraftingContainer;
/*     */     //   543: invokevirtual clearOrCountMatchingItems : (Ljava/util/function/Predicate;ILnet/minecraft/world/Container;)I
/*     */     //   546: pop
/*     */     //   547: goto -> 1560
/*     */     //   550: aload_0
/*     */     //   551: instanceof net/minecraft/server/level/ServerLevel
/*     */     //   554: ifeq -> 678
/*     */     //   557: aload_0
/*     */     //   558: checkcast net/minecraft/server/level/ServerLevel
/*     */     //   561: astore #11
/*     */     //   563: new net/mcreator/latexes/entity/CivlianMilitiaEntity
/*     */     //   566: dup
/*     */     //   567: getstatic net/mcreator/latexes/init/LatexModEntities.CIVLIAN_MILITIA : Lnet/minecraftforge/registries/RegistryObject;
/*     */     //   570: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   573: checkcast net/minecraft/world/entity/EntityType
/*     */     //   576: aload #11
/*     */     //   578: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
/*     */     //   581: astore #12
/*     */     //   583: aload #12
/*     */     //   585: dload_1
/*     */     //   586: dload_3
/*     */     //   587: dload #5
/*     */     //   589: aload #7
/*     */     //   591: invokevirtual getYRot : ()F
/*     */     //   594: aload #7
/*     */     //   596: invokevirtual getXRot : ()F
/*     */     //   599: invokevirtual moveTo : (DDDFF)V
/*     */     //   602: aload #12
/*     */     //   604: aload #7
/*     */     //   606: invokevirtual getYRot : ()F
/*     */     //   609: invokevirtual setYBodyRot : (F)V
/*     */     //   612: aload #12
/*     */     //   614: aload #7
/*     */     //   616: invokevirtual getYRot : ()F
/*     */     //   619: invokevirtual setYHeadRot : (F)V
/*     */     //   622: aload #12
/*     */     //   624: dconst_0
/*     */     //   625: dconst_0
/*     */     //   626: dconst_0
/*     */     //   627: invokevirtual setDeltaMovement : (DDD)V
/*     */     //   630: aload #12
/*     */     //   632: instanceof net/minecraft/world/entity/Mob
/*     */     //   635: ifeq -> 669
/*     */     //   638: aload #12
/*     */     //   640: checkcast net/minecraft/world/entity/Mob
/*     */     //   643: astore #13
/*     */     //   645: aload #13
/*     */     //   647: aload #11
/*     */     //   649: aload_0
/*     */     //   650: aload #12
/*     */     //   652: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
/*     */     //   655: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
/*     */     //   660: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
/*     */     //   663: aconst_null
/*     */     //   664: aconst_null
/*     */     //   665: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
/*     */     //   668: pop
/*     */     //   669: aload_0
/*     */     //   670: aload #12
/*     */     //   672: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
/*     */     //   677: pop
/*     */     //   678: aload #7
/*     */     //   680: getfield level : Lnet/minecraft/world/level/Level;
/*     */     //   683: invokevirtual isClientSide : ()Z
/*     */     //   686: ifne -> 694
/*     */     //   689: aload #7
/*     */     //   691: invokevirtual discard : ()V
/*     */     //   694: aload #7
/*     */     //   696: instanceof net/minecraft/world/entity/player/Player
/*     */     //   699: ifeq -> 720
/*     */     //   702: aload #7
/*     */     //   704: checkcast net/minecraft/world/entity/player/Player
/*     */     //   707: astore #11
/*     */     //   709: aload #11
/*     */     //   711: invokevirtual getAbilities : ()Lnet/minecraft/world/entity/player/Abilities;
/*     */     //   714: getfield instabuild : Z
/*     */     //   717: goto -> 721
/*     */     //   720: iconst_0
/*     */     //   721: iconst_1
/*     */     //   722: if_icmpeq -> 1560
/*     */     //   725: aload #7
/*     */     //   727: instanceof net/minecraft/world/entity/player/Player
/*     */     //   730: ifeq -> 783
/*     */     //   733: aload #7
/*     */     //   735: checkcast net/minecraft/world/entity/player/Player
/*     */     //   738: astore #12
/*     */     //   740: new net/minecraft/world/item/ItemStack
/*     */     //   743: dup
/*     */     //   744: getstatic net/mcreator/latexes/init/LatexModItems.RECRUITMENTPAPER : Lnet/minecraftforge/registries/RegistryObject;
/*     */     //   747: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   750: checkcast net/minecraft/world/level/ItemLike
/*     */     //   753: invokespecial <init> : (Lnet/minecraft/world/level/ItemLike;)V
/*     */     //   756: astore #13
/*     */     //   758: aload #12
/*     */     //   760: invokevirtual getInventory : ()Lnet/minecraft/world/entity/player/Inventory;
/*     */     //   763: aload #13
/*     */     //   765: <illegal opcode> test : (Lnet/minecraft/world/item/ItemStack;)Ljava/util/function/Predicate;
/*     */     //   770: iconst_1
/*     */     //   771: aload #12
/*     */     //   773: getfield inventoryMenu : Lnet/minecraft/world/inventory/InventoryMenu;
/*     */     //   776: invokevirtual getCraftSlots : ()Lnet/minecraft/world/inventory/CraftingContainer;
/*     */     //   779: invokevirtual clearOrCountMatchingItems : (Ljava/util/function/Predicate;ILnet/minecraft/world/Container;)I
/*     */     //   782: pop
/*     */     //   783: goto -> 1560
/*     */     //   786: aload #7
/*     */     //   788: instanceof net/mcreator/latexes/entity/ScientistEntity
/*     */     //   791: ifeq -> 1560
/*     */     //   794: aload #8
/*     */     //   796: instanceof net/minecraft/world/entity/LivingEntity
/*     */     //   799: ifeq -> 820
/*     */     //   802: aload #8
/*     */     //   804: checkcast net/minecraft/world/entity/LivingEntity
/*     */     //   807: astore #10
/*     */     //   809: aload #10
/*     */     //   811: getstatic net/minecraft/world/entity/EquipmentSlot.HEAD : Lnet/minecraft/world/entity/EquipmentSlot;
/*     */     //   814: invokevirtual getItemBySlot : (Lnet/minecraft/world/entity/EquipmentSlot;)Lnet/minecraft/world/item/ItemStack;
/*     */     //   817: goto -> 823
/*     */     //   820: getstatic net/minecraft/world/item/ItemStack.EMPTY : Lnet/minecraft/world/item/ItemStack;
/*     */     //   823: invokevirtual getItem : ()Lnet/minecraft/world/item/Item;
/*     */     //   826: getstatic net/mcreator/latexes/init/LatexModItems.GOOD_BERET_HELMET : Lnet/minecraftforge/registries/RegistryObject;
/*     */     //   829: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   832: if_acmpne -> 1560
/*     */     //   835: invokestatic random : ()D
/*     */     //   838: ldc2_w 0.5
/*     */     //   841: dcmpg
/*     */     //   842: ifge -> 1081
/*     */     //   845: aload_0
/*     */     //   846: instanceof net/minecraft/server/level/ServerLevel
/*     */     //   849: ifeq -> 973
/*     */     //   852: aload_0
/*     */     //   853: checkcast net/minecraft/server/level/ServerLevel
/*     */     //   856: astore #11
/*     */     //   858: new net/mcreator/latexes/entity/MilitaryRiotEntity
/*     */     //   861: dup
/*     */     //   862: getstatic net/mcreator/latexes/init/LatexModEntities.MILITARY_RIOT : Lnet/minecraftforge/registries/RegistryObject;
/*     */     //   865: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   868: checkcast net/minecraft/world/entity/EntityType
/*     */     //   871: aload #11
/*     */     //   873: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
/*     */     //   876: astore #12
/*     */     //   878: aload #12
/*     */     //   880: dload_1
/*     */     //   881: dload_3
/*     */     //   882: dload #5
/*     */     //   884: aload #7
/*     */     //   886: invokevirtual getYRot : ()F
/*     */     //   889: aload #7
/*     */     //   891: invokevirtual getXRot : ()F
/*     */     //   894: invokevirtual moveTo : (DDDFF)V
/*     */     //   897: aload #12
/*     */     //   899: aload #7
/*     */     //   901: invokevirtual getYRot : ()F
/*     */     //   904: invokevirtual setYBodyRot : (F)V
/*     */     //   907: aload #12
/*     */     //   909: aload #7
/*     */     //   911: invokevirtual getYRot : ()F
/*     */     //   914: invokevirtual setYHeadRot : (F)V
/*     */     //   917: aload #12
/*     */     //   919: dconst_0
/*     */     //   920: dconst_0
/*     */     //   921: dconst_0
/*     */     //   922: invokevirtual setDeltaMovement : (DDD)V
/*     */     //   925: aload #12
/*     */     //   927: instanceof net/minecraft/world/entity/Mob
/*     */     //   930: ifeq -> 964
/*     */     //   933: aload #12
/*     */     //   935: checkcast net/minecraft/world/entity/Mob
/*     */     //   938: astore #13
/*     */     //   940: aload #13
/*     */     //   942: aload #11
/*     */     //   944: aload_0
/*     */     //   945: aload #12
/*     */     //   947: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
/*     */     //   950: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
/*     */     //   955: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
/*     */     //   958: aconst_null
/*     */     //   959: aconst_null
/*     */     //   960: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
/*     */     //   963: pop
/*     */     //   964: aload_0
/*     */     //   965: aload #12
/*     */     //   967: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
/*     */     //   972: pop
/*     */     //   973: aload #7
/*     */     //   975: getfield level : Lnet/minecraft/world/level/Level;
/*     */     //   978: invokevirtual isClientSide : ()Z
/*     */     //   981: ifne -> 989
/*     */     //   984: aload #7
/*     */     //   986: invokevirtual discard : ()V
/*     */     //   989: aload #7
/*     */     //   991: instanceof net/minecraft/world/entity/player/Player
/*     */     //   994: ifeq -> 1015
/*     */     //   997: aload #7
/*     */     //   999: checkcast net/minecraft/world/entity/player/Player
/*     */     //   1002: astore #11
/*     */     //   1004: aload #11
/*     */     //   1006: invokevirtual getAbilities : ()Lnet/minecraft/world/entity/player/Abilities;
/*     */     //   1009: getfield instabuild : Z
/*     */     //   1012: goto -> 1016
/*     */     //   1015: iconst_0
/*     */     //   1016: iconst_1
/*     */     //   1017: if_icmpeq -> 1560
/*     */     //   1020: aload #7
/*     */     //   1022: instanceof net/minecraft/world/entity/player/Player
/*     */     //   1025: ifeq -> 1078
/*     */     //   1028: aload #7
/*     */     //   1030: checkcast net/minecraft/world/entity/player/Player
/*     */     //   1033: astore #12
/*     */     //   1035: new net/minecraft/world/item/ItemStack
/*     */     //   1038: dup
/*     */     //   1039: getstatic net/mcreator/latexes/init/LatexModItems.RECRUITMENTPAPER : Lnet/minecraftforge/registries/RegistryObject;
/*     */     //   1042: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   1045: checkcast net/minecraft/world/level/ItemLike
/*     */     //   1048: invokespecial <init> : (Lnet/minecraft/world/level/ItemLike;)V
/*     */     //   1051: astore #13
/*     */     //   1053: aload #12
/*     */     //   1055: invokevirtual getInventory : ()Lnet/minecraft/world/entity/player/Inventory;
/*     */     //   1058: aload #13
/*     */     //   1060: <illegal opcode> test : (Lnet/minecraft/world/item/ItemStack;)Ljava/util/function/Predicate;
/*     */     //   1065: iconst_1
/*     */     //   1066: aload #12
/*     */     //   1068: getfield inventoryMenu : Lnet/minecraft/world/inventory/InventoryMenu;
/*     */     //   1071: invokevirtual getCraftSlots : ()Lnet/minecraft/world/inventory/CraftingContainer;
/*     */     //   1074: invokevirtual clearOrCountMatchingItems : (Ljava/util/function/Predicate;ILnet/minecraft/world/Container;)I
/*     */     //   1077: pop
/*     */     //   1078: goto -> 1560
/*     */     //   1081: invokestatic random : ()D
/*     */     //   1084: ldc2_w 0.1
/*     */     //   1087: dcmpg
/*     */     //   1088: ifge -> 1327
/*     */     //   1091: aload_0
/*     */     //   1092: instanceof net/minecraft/server/level/ServerLevel
/*     */     //   1095: ifeq -> 1219
/*     */     //   1098: aload_0
/*     */     //   1099: checkcast net/minecraft/server/level/ServerLevel
/*     */     //   1102: astore #11
/*     */     //   1104: new net/mcreator/latexes/entity/MilitaryflameunitEntity
/*     */     //   1107: dup
/*     */     //   1108: getstatic net/mcreator/latexes/init/LatexModEntities.MILITARYFLAMEUNIT : Lnet/minecraftforge/registries/RegistryObject;
/*     */     //   1111: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   1114: checkcast net/minecraft/world/entity/EntityType
/*     */     //   1117: aload #11
/*     */     //   1119: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
/*     */     //   1122: astore #12
/*     */     //   1124: aload #12
/*     */     //   1126: dload_1
/*     */     //   1127: dload_3
/*     */     //   1128: dload #5
/*     */     //   1130: aload #7
/*     */     //   1132: invokevirtual getYRot : ()F
/*     */     //   1135: aload #7
/*     */     //   1137: invokevirtual getXRot : ()F
/*     */     //   1140: invokevirtual moveTo : (DDDFF)V
/*     */     //   1143: aload #12
/*     */     //   1145: aload #7
/*     */     //   1147: invokevirtual getYRot : ()F
/*     */     //   1150: invokevirtual setYBodyRot : (F)V
/*     */     //   1153: aload #12
/*     */     //   1155: aload #7
/*     */     //   1157: invokevirtual getYRot : ()F
/*     */     //   1160: invokevirtual setYHeadRot : (F)V
/*     */     //   1163: aload #12
/*     */     //   1165: dconst_0
/*     */     //   1166: dconst_0
/*     */     //   1167: dconst_0
/*     */     //   1168: invokevirtual setDeltaMovement : (DDD)V
/*     */     //   1171: aload #12
/*     */     //   1173: instanceof net/minecraft/world/entity/Mob
/*     */     //   1176: ifeq -> 1210
/*     */     //   1179: aload #12
/*     */     //   1181: checkcast net/minecraft/world/entity/Mob
/*     */     //   1184: astore #13
/*     */     //   1186: aload #13
/*     */     //   1188: aload #11
/*     */     //   1190: aload_0
/*     */     //   1191: aload #12
/*     */     //   1193: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
/*     */     //   1196: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
/*     */     //   1201: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
/*     */     //   1204: aconst_null
/*     */     //   1205: aconst_null
/*     */     //   1206: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
/*     */     //   1209: pop
/*     */     //   1210: aload_0
/*     */     //   1211: aload #12
/*     */     //   1213: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
/*     */     //   1218: pop
/*     */     //   1219: aload #7
/*     */     //   1221: getfield level : Lnet/minecraft/world/level/Level;
/*     */     //   1224: invokevirtual isClientSide : ()Z
/*     */     //   1227: ifne -> 1235
/*     */     //   1230: aload #7
/*     */     //   1232: invokevirtual discard : ()V
/*     */     //   1235: aload #7
/*     */     //   1237: instanceof net/minecraft/world/entity/player/Player
/*     */     //   1240: ifeq -> 1261
/*     */     //   1243: aload #7
/*     */     //   1245: checkcast net/minecraft/world/entity/player/Player
/*     */     //   1248: astore #11
/*     */     //   1250: aload #11
/*     */     //   1252: invokevirtual getAbilities : ()Lnet/minecraft/world/entity/player/Abilities;
/*     */     //   1255: getfield instabuild : Z
/*     */     //   1258: goto -> 1262
/*     */     //   1261: iconst_0
/*     */     //   1262: iconst_1
/*     */     //   1263: if_icmpeq -> 1560
/*     */     //   1266: aload #7
/*     */     //   1268: instanceof net/minecraft/world/entity/player/Player
/*     */     //   1271: ifeq -> 1324
/*     */     //   1274: aload #7
/*     */     //   1276: checkcast net/minecraft/world/entity/player/Player
/*     */     //   1279: astore #12
/*     */     //   1281: new net/minecraft/world/item/ItemStack
/*     */     //   1284: dup
/*     */     //   1285: getstatic net/mcreator/latexes/init/LatexModItems.RECRUITMENTPAPER : Lnet/minecraftforge/registries/RegistryObject;
/*     */     //   1288: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   1291: checkcast net/minecraft/world/level/ItemLike
/*     */     //   1294: invokespecial <init> : (Lnet/minecraft/world/level/ItemLike;)V
/*     */     //   1297: astore #13
/*     */     //   1299: aload #12
/*     */     //   1301: invokevirtual getInventory : ()Lnet/minecraft/world/entity/player/Inventory;
/*     */     //   1304: aload #13
/*     */     //   1306: <illegal opcode> test : (Lnet/minecraft/world/item/ItemStack;)Ljava/util/function/Predicate;
/*     */     //   1311: iconst_1
/*     */     //   1312: aload #12
/*     */     //   1314: getfield inventoryMenu : Lnet/minecraft/world/inventory/InventoryMenu;
/*     */     //   1317: invokevirtual getCraftSlots : ()Lnet/minecraft/world/inventory/CraftingContainer;
/*     */     //   1320: invokevirtual clearOrCountMatchingItems : (Ljava/util/function/Predicate;ILnet/minecraft/world/Container;)I
/*     */     //   1323: pop
/*     */     //   1324: goto -> 1560
/*     */     //   1327: aload_0
/*     */     //   1328: instanceof net/minecraft/server/level/ServerLevel
/*     */     //   1331: ifeq -> 1455
/*     */     //   1334: aload_0
/*     */     //   1335: checkcast net/minecraft/server/level/ServerLevel
/*     */     //   1338: astore #11
/*     */     //   1340: new net/mcreator/latexes/entity/MilitaryEntity
/*     */     //   1343: dup
/*     */     //   1344: getstatic net/mcreator/latexes/init/LatexModEntities.MILITARY : Lnet/minecraftforge/registries/RegistryObject;
/*     */     //   1347: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   1350: checkcast net/minecraft/world/entity/EntityType
/*     */     //   1353: aload #11
/*     */     //   1355: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
/*     */     //   1358: astore #12
/*     */     //   1360: aload #12
/*     */     //   1362: dload_1
/*     */     //   1363: dload_3
/*     */     //   1364: dload #5
/*     */     //   1366: aload #7
/*     */     //   1368: invokevirtual getYRot : ()F
/*     */     //   1371: aload #7
/*     */     //   1373: invokevirtual getXRot : ()F
/*     */     //   1376: invokevirtual moveTo : (DDDFF)V
/*     */     //   1379: aload #12
/*     */     //   1381: aload #7
/*     */     //   1383: invokevirtual getYRot : ()F
/*     */     //   1386: invokevirtual setYBodyRot : (F)V
/*     */     //   1389: aload #12
/*     */     //   1391: aload #7
/*     */     //   1393: invokevirtual getYRot : ()F
/*     */     //   1396: invokevirtual setYHeadRot : (F)V
/*     */     //   1399: aload #12
/*     */     //   1401: dconst_0
/*     */     //   1402: dconst_0
/*     */     //   1403: dconst_0
/*     */     //   1404: invokevirtual setDeltaMovement : (DDD)V
/*     */     //   1407: aload #12
/*     */     //   1409: instanceof net/minecraft/world/entity/Mob
/*     */     //   1412: ifeq -> 1446
/*     */     //   1415: aload #12
/*     */     //   1417: checkcast net/minecraft/world/entity/Mob
/*     */     //   1420: astore #13
/*     */     //   1422: aload #13
/*     */     //   1424: aload #11
/*     */     //   1426: aload_0
/*     */     //   1427: aload #12
/*     */     //   1429: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
/*     */     //   1432: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
/*     */     //   1437: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
/*     */     //   1440: aconst_null
/*     */     //   1441: aconst_null
/*     */     //   1442: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
/*     */     //   1445: pop
/*     */     //   1446: aload_0
/*     */     //   1447: aload #12
/*     */     //   1449: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
/*     */     //   1454: pop
/*     */     //   1455: aload #7
/*     */     //   1457: getfield level : Lnet/minecraft/world/level/Level;
/*     */     //   1460: invokevirtual isClientSide : ()Z
/*     */     //   1463: ifne -> 1471
/*     */     //   1466: aload #7
/*     */     //   1468: invokevirtual discard : ()V
/*     */     //   1471: aload #7
/*     */     //   1473: instanceof net/minecraft/world/entity/player/Player
/*     */     //   1476: ifeq -> 1497
/*     */     //   1479: aload #7
/*     */     //   1481: checkcast net/minecraft/world/entity/player/Player
/*     */     //   1484: astore #11
/*     */     //   1486: aload #11
/*     */     //   1488: invokevirtual getAbilities : ()Lnet/minecraft/world/entity/player/Abilities;
/*     */     //   1491: getfield instabuild : Z
/*     */     //   1494: goto -> 1498
/*     */     //   1497: iconst_0
/*     */     //   1498: iconst_1
/*     */     //   1499: if_icmpeq -> 1560
/*     */     //   1502: aload #7
/*     */     //   1504: instanceof net/minecraft/world/entity/player/Player
/*     */     //   1507: ifeq -> 1560
/*     */     //   1510: aload #7
/*     */     //   1512: checkcast net/minecraft/world/entity/player/Player
/*     */     //   1515: astore #12
/*     */     //   1517: new net/minecraft/world/item/ItemStack
/*     */     //   1520: dup
/*     */     //   1521: getstatic net/mcreator/latexes/init/LatexModItems.RECRUITMENTPAPER : Lnet/minecraftforge/registries/RegistryObject;
/*     */     //   1524: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   1527: checkcast net/minecraft/world/level/ItemLike
/*     */     //   1530: invokespecial <init> : (Lnet/minecraft/world/level/ItemLike;)V
/*     */     //   1533: astore #13
/*     */     //   1535: aload #12
/*     */     //   1537: invokevirtual getInventory : ()Lnet/minecraft/world/entity/player/Inventory;
/*     */     //   1540: aload #13
/*     */     //   1542: <illegal opcode> test : (Lnet/minecraft/world/item/ItemStack;)Ljava/util/function/Predicate;
/*     */     //   1547: iconst_1
/*     */     //   1548: aload #12
/*     */     //   1550: getfield inventoryMenu : Lnet/minecraft/world/inventory/InventoryMenu;
/*     */     //   1553: invokevirtual getCraftSlots : ()Lnet/minecraft/world/inventory/CraftingContainer;
/*     */     //   1556: invokevirtual clearOrCountMatchingItems : (Ljava/util/function/Predicate;ILnet/minecraft/world/Container;)I
/*     */     //   1559: pop
/*     */     //   1560: aload #8
/*     */     //   1562: instanceof net/minecraft/world/entity/LivingEntity
/*     */     //   1565: ifeq -> 1586
/*     */     //   1568: aload #8
/*     */     //   1570: checkcast net/minecraft/world/entity/LivingEntity
/*     */     //   1573: astore #9
/*     */     //   1575: aload #9
/*     */     //   1577: getstatic net/minecraft/world/entity/EquipmentSlot.HEAD : Lnet/minecraft/world/entity/EquipmentSlot;
/*     */     //   1580: invokevirtual getItemBySlot : (Lnet/minecraft/world/entity/EquipmentSlot;)Lnet/minecraft/world/item/ItemStack;
/*     */     //   1583: goto -> 1589
/*     */     //   1586: getstatic net/minecraft/world/item/ItemStack.EMPTY : Lnet/minecraft/world/item/ItemStack;
/*     */     //   1589: invokevirtual getItem : ()Lnet/minecraft/world/item/Item;
/*     */     //   1592: getstatic net/mcreator/latexes/init/LatexModItems.EVIL_BERET_HELMET : Lnet/minecraftforge/registries/RegistryObject;
/*     */     //   1595: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   1598: if_acmpne -> 1845
/*     */     //   1601: aload #7
/*     */     //   1603: instanceof net/mcreator/latexes/entity/PrisionerEntity
/*     */     //   1606: ifeq -> 1845
/*     */     //   1609: aload_0
/*     */     //   1610: instanceof net/minecraft/server/level/ServerLevel
/*     */     //   1613: ifeq -> 1737
/*     */     //   1616: aload_0
/*     */     //   1617: checkcast net/minecraft/server/level/ServerLevel
/*     */     //   1620: astore #11
/*     */     //   1622: new net/mcreator/latexes/entity/PrisionermilitiaEntity
/*     */     //   1625: dup
/*     */     //   1626: getstatic net/mcreator/latexes/init/LatexModEntities.PRISIONERMILITIA : Lnet/minecraftforge/registries/RegistryObject;
/*     */     //   1629: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   1632: checkcast net/minecraft/world/entity/EntityType
/*     */     //   1635: aload #11
/*     */     //   1637: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
/*     */     //   1640: astore #12
/*     */     //   1642: aload #12
/*     */     //   1644: dload_1
/*     */     //   1645: dload_3
/*     */     //   1646: dload #5
/*     */     //   1648: aload #7
/*     */     //   1650: invokevirtual getYRot : ()F
/*     */     //   1653: aload #7
/*     */     //   1655: invokevirtual getXRot : ()F
/*     */     //   1658: invokevirtual moveTo : (DDDFF)V
/*     */     //   1661: aload #12
/*     */     //   1663: aload #7
/*     */     //   1665: invokevirtual getYRot : ()F
/*     */     //   1668: invokevirtual setYBodyRot : (F)V
/*     */     //   1671: aload #12
/*     */     //   1673: aload #7
/*     */     //   1675: invokevirtual getYRot : ()F
/*     */     //   1678: invokevirtual setYHeadRot : (F)V
/*     */     //   1681: aload #12
/*     */     //   1683: dconst_0
/*     */     //   1684: dconst_0
/*     */     //   1685: dconst_0
/*     */     //   1686: invokevirtual setDeltaMovement : (DDD)V
/*     */     //   1689: aload #12
/*     */     //   1691: instanceof net/minecraft/world/entity/Mob
/*     */     //   1694: ifeq -> 1728
/*     */     //   1697: aload #12
/*     */     //   1699: checkcast net/minecraft/world/entity/Mob
/*     */     //   1702: astore #13
/*     */     //   1704: aload #13
/*     */     //   1706: aload #11
/*     */     //   1708: aload_0
/*     */     //   1709: aload #12
/*     */     //   1711: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
/*     */     //   1714: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
/*     */     //   1719: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
/*     */     //   1722: aconst_null
/*     */     //   1723: aconst_null
/*     */     //   1724: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
/*     */     //   1727: pop
/*     */     //   1728: aload_0
/*     */     //   1729: aload #12
/*     */     //   1731: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
/*     */     //   1736: pop
/*     */     //   1737: aload #7
/*     */     //   1739: getfield level : Lnet/minecraft/world/level/Level;
/*     */     //   1742: invokevirtual isClientSide : ()Z
/*     */     //   1745: ifne -> 1753
/*     */     //   1748: aload #7
/*     */     //   1750: invokevirtual discard : ()V
/*     */     //   1753: aload #7
/*     */     //   1755: instanceof net/minecraft/world/entity/player/Player
/*     */     //   1758: ifeq -> 1779
/*     */     //   1761: aload #7
/*     */     //   1763: checkcast net/minecraft/world/entity/player/Player
/*     */     //   1766: astore #11
/*     */     //   1768: aload #11
/*     */     //   1770: invokevirtual getAbilities : ()Lnet/minecraft/world/entity/player/Abilities;
/*     */     //   1773: getfield instabuild : Z
/*     */     //   1776: goto -> 1780
/*     */     //   1779: iconst_0
/*     */     //   1780: iconst_1
/*     */     //   1781: if_icmpeq -> 2127
/*     */     //   1784: aload #7
/*     */     //   1786: instanceof net/minecraft/world/entity/player/Player
/*     */     //   1789: ifeq -> 1842
/*     */     //   1792: aload #7
/*     */     //   1794: checkcast net/minecraft/world/entity/player/Player
/*     */     //   1797: astore #12
/*     */     //   1799: new net/minecraft/world/item/ItemStack
/*     */     //   1802: dup
/*     */     //   1803: getstatic net/mcreator/latexes/init/LatexModItems.RECRUITMENTPAPER : Lnet/minecraftforge/registries/RegistryObject;
/*     */     //   1806: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   1809: checkcast net/minecraft/world/level/ItemLike
/*     */     //   1812: invokespecial <init> : (Lnet/minecraft/world/level/ItemLike;)V
/*     */     //   1815: astore #13
/*     */     //   1817: aload #12
/*     */     //   1819: invokevirtual getInventory : ()Lnet/minecraft/world/entity/player/Inventory;
/*     */     //   1822: aload #13
/*     */     //   1824: <illegal opcode> test : (Lnet/minecraft/world/item/ItemStack;)Ljava/util/function/Predicate;
/*     */     //   1829: iconst_1
/*     */     //   1830: aload #12
/*     */     //   1832: getfield inventoryMenu : Lnet/minecraft/world/inventory/InventoryMenu;
/*     */     //   1835: invokevirtual getCraftSlots : ()Lnet/minecraft/world/inventory/CraftingContainer;
/*     */     //   1838: invokevirtual clearOrCountMatchingItems : (Ljava/util/function/Predicate;ILnet/minecraft/world/Container;)I
/*     */     //   1841: pop
/*     */     //   1842: goto -> 2127
/*     */     //   1845: aload #8
/*     */     //   1847: instanceof net/minecraft/world/entity/LivingEntity
/*     */     //   1850: ifeq -> 1871
/*     */     //   1853: aload #8
/*     */     //   1855: checkcast net/minecraft/world/entity/LivingEntity
/*     */     //   1858: astore #10
/*     */     //   1860: aload #10
/*     */     //   1862: getstatic net/minecraft/world/entity/EquipmentSlot.HEAD : Lnet/minecraft/world/entity/EquipmentSlot;
/*     */     //   1865: invokevirtual getItemBySlot : (Lnet/minecraft/world/entity/EquipmentSlot;)Lnet/minecraft/world/item/ItemStack;
/*     */     //   1868: goto -> 1874
/*     */     //   1871: getstatic net/minecraft/world/item/ItemStack.EMPTY : Lnet/minecraft/world/item/ItemStack;
/*     */     //   1874: invokevirtual getItem : ()Lnet/minecraft/world/item/Item;
/*     */     //   1877: getstatic net/mcreator/latexes/init/LatexModItems.GOOD_BERET_HELMET : Lnet/minecraftforge/registries/RegistryObject;
/*     */     //   1880: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   1883: if_acmpne -> 2127
/*     */     //   1886: aload #7
/*     */     //   1888: instanceof net/mcreator/latexes/entity/PrisionerEntity
/*     */     //   1891: ifeq -> 2127
/*     */     //   1894: aload_0
/*     */     //   1895: instanceof net/minecraft/server/level/ServerLevel
/*     */     //   1898: ifeq -> 2022
/*     */     //   1901: aload_0
/*     */     //   1902: checkcast net/minecraft/server/level/ServerLevel
/*     */     //   1905: astore #11
/*     */     //   1907: new net/mcreator/latexes/entity/CivilianEntity
/*     */     //   1910: dup
/*     */     //   1911: getstatic net/mcreator/latexes/init/LatexModEntities.CIVILIAN : Lnet/minecraftforge/registries/RegistryObject;
/*     */     //   1914: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   1917: checkcast net/minecraft/world/entity/EntityType
/*     */     //   1920: aload #11
/*     */     //   1922: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
/*     */     //   1925: astore #12
/*     */     //   1927: aload #12
/*     */     //   1929: dload_1
/*     */     //   1930: dload_3
/*     */     //   1931: dload #5
/*     */     //   1933: aload #7
/*     */     //   1935: invokevirtual getYRot : ()F
/*     */     //   1938: aload #7
/*     */     //   1940: invokevirtual getXRot : ()F
/*     */     //   1943: invokevirtual moveTo : (DDDFF)V
/*     */     //   1946: aload #12
/*     */     //   1948: aload #7
/*     */     //   1950: invokevirtual getYRot : ()F
/*     */     //   1953: invokevirtual setYBodyRot : (F)V
/*     */     //   1956: aload #12
/*     */     //   1958: aload #7
/*     */     //   1960: invokevirtual getYRot : ()F
/*     */     //   1963: invokevirtual setYHeadRot : (F)V
/*     */     //   1966: aload #12
/*     */     //   1968: dconst_0
/*     */     //   1969: dconst_0
/*     */     //   1970: dconst_0
/*     */     //   1971: invokevirtual setDeltaMovement : (DDD)V
/*     */     //   1974: aload #12
/*     */     //   1976: instanceof net/minecraft/world/entity/Mob
/*     */     //   1979: ifeq -> 2013
/*     */     //   1982: aload #12
/*     */     //   1984: checkcast net/minecraft/world/entity/Mob
/*     */     //   1987: astore #13
/*     */     //   1989: aload #13
/*     */     //   1991: aload #11
/*     */     //   1993: aload_0
/*     */     //   1994: aload #12
/*     */     //   1996: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
/*     */     //   1999: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
/*     */     //   2004: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
/*     */     //   2007: aconst_null
/*     */     //   2008: aconst_null
/*     */     //   2009: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
/*     */     //   2012: pop
/*     */     //   2013: aload_0
/*     */     //   2014: aload #12
/*     */     //   2016: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
/*     */     //   2021: pop
/*     */     //   2022: aload #7
/*     */     //   2024: getfield level : Lnet/minecraft/world/level/Level;
/*     */     //   2027: invokevirtual isClientSide : ()Z
/*     */     //   2030: ifne -> 2038
/*     */     //   2033: aload #7
/*     */     //   2035: invokevirtual discard : ()V
/*     */     //   2038: aload #7
/*     */     //   2040: instanceof net/minecraft/world/entity/player/Player
/*     */     //   2043: ifeq -> 2064
/*     */     //   2046: aload #7
/*     */     //   2048: checkcast net/minecraft/world/entity/player/Player
/*     */     //   2051: astore #11
/*     */     //   2053: aload #11
/*     */     //   2055: invokevirtual getAbilities : ()Lnet/minecraft/world/entity/player/Abilities;
/*     */     //   2058: getfield instabuild : Z
/*     */     //   2061: goto -> 2065
/*     */     //   2064: iconst_0
/*     */     //   2065: iconst_1
/*     */     //   2066: if_icmpeq -> 2127
/*     */     //   2069: aload #7
/*     */     //   2071: instanceof net/minecraft/world/entity/player/Player
/*     */     //   2074: ifeq -> 2127
/*     */     //   2077: aload #7
/*     */     //   2079: checkcast net/minecraft/world/entity/player/Player
/*     */     //   2082: astore #12
/*     */     //   2084: new net/minecraft/world/item/ItemStack
/*     */     //   2087: dup
/*     */     //   2088: getstatic net/mcreator/latexes/init/LatexModItems.RECRUITMENTPAPER : Lnet/minecraftforge/registries/RegistryObject;
/*     */     //   2091: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   2094: checkcast net/minecraft/world/level/ItemLike
/*     */     //   2097: invokespecial <init> : (Lnet/minecraft/world/level/ItemLike;)V
/*     */     //   2100: astore #13
/*     */     //   2102: aload #12
/*     */     //   2104: invokevirtual getInventory : ()Lnet/minecraft/world/entity/player/Inventory;
/*     */     //   2107: aload #13
/*     */     //   2109: <illegal opcode> test : (Lnet/minecraft/world/item/ItemStack;)Ljava/util/function/Predicate;
/*     */     //   2114: iconst_1
/*     */     //   2115: aload #12
/*     */     //   2117: getfield inventoryMenu : Lnet/minecraft/world/inventory/InventoryMenu;
/*     */     //   2120: invokevirtual getCraftSlots : ()Lnet/minecraft/world/inventory/CraftingContainer;
/*     */     //   2123: invokevirtual clearOrCountMatchingItems : (Ljava/util/function/Predicate;ILnet/minecraft/world/Container;)I
/*     */     //   2126: pop
/*     */     //   2127: aload #8
/*     */     //   2129: instanceof net/minecraft/world/entity/LivingEntity
/*     */     //   2132: ifeq -> 2153
/*     */     //   2135: aload #8
/*     */     //   2137: checkcast net/minecraft/world/entity/LivingEntity
/*     */     //   2140: astore #9
/*     */     //   2142: aload #9
/*     */     //   2144: getstatic net/minecraft/world/entity/EquipmentSlot.HEAD : Lnet/minecraft/world/entity/EquipmentSlot;
/*     */     //   2147: invokevirtual getItemBySlot : (Lnet/minecraft/world/entity/EquipmentSlot;)Lnet/minecraft/world/item/ItemStack;
/*     */     //   2150: goto -> 2156
/*     */     //   2153: getstatic net/minecraft/world/item/ItemStack.EMPTY : Lnet/minecraft/world/item/ItemStack;
/*     */     //   2156: invokevirtual getItem : ()Lnet/minecraft/world/item/Item;
/*     */     //   2159: getstatic net/mcreator/latexes/init/LatexModItems.EVIL_BERET_HELMET : Lnet/minecraftforge/registries/RegistryObject;
/*     */     //   2162: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   2165: if_acmpne -> 2658
/*     */     //   2168: aload #7
/*     */     //   2170: instanceof net/mcreator/latexes/entity/EvilScientistEntity
/*     */     //   2173: ifeq -> 2658
/*     */     //   2176: invokestatic random : ()D
/*     */     //   2179: ldc2_w 0.5
/*     */     //   2182: dcmpg
/*     */     //   2183: ifge -> 2422
/*     */     //   2186: aload_0
/*     */     //   2187: instanceof net/minecraft/server/level/ServerLevel
/*     */     //   2190: ifeq -> 2314
/*     */     //   2193: aload_0
/*     */     //   2194: checkcast net/minecraft/server/level/ServerLevel
/*     */     //   2197: astore #11
/*     */     //   2199: new net/mcreator/latexes/entity/EvilSniperEntity
/*     */     //   2202: dup
/*     */     //   2203: getstatic net/mcreator/latexes/init/LatexModEntities.EVIL_SNIPER : Lnet/minecraftforge/registries/RegistryObject;
/*     */     //   2206: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   2209: checkcast net/minecraft/world/entity/EntityType
/*     */     //   2212: aload #11
/*     */     //   2214: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
/*     */     //   2217: astore #12
/*     */     //   2219: aload #12
/*     */     //   2221: dload_1
/*     */     //   2222: dload_3
/*     */     //   2223: dload #5
/*     */     //   2225: aload #7
/*     */     //   2227: invokevirtual getYRot : ()F
/*     */     //   2230: aload #7
/*     */     //   2232: invokevirtual getXRot : ()F
/*     */     //   2235: invokevirtual moveTo : (DDDFF)V
/*     */     //   2238: aload #12
/*     */     //   2240: aload #7
/*     */     //   2242: invokevirtual getYRot : ()F
/*     */     //   2245: invokevirtual setYBodyRot : (F)V
/*     */     //   2248: aload #12
/*     */     //   2250: aload #7
/*     */     //   2252: invokevirtual getYRot : ()F
/*     */     //   2255: invokevirtual setYHeadRot : (F)V
/*     */     //   2258: aload #12
/*     */     //   2260: dconst_0
/*     */     //   2261: dconst_0
/*     */     //   2262: dconst_0
/*     */     //   2263: invokevirtual setDeltaMovement : (DDD)V
/*     */     //   2266: aload #12
/*     */     //   2268: instanceof net/minecraft/world/entity/Mob
/*     */     //   2271: ifeq -> 2305
/*     */     //   2274: aload #12
/*     */     //   2276: checkcast net/minecraft/world/entity/Mob
/*     */     //   2279: astore #13
/*     */     //   2281: aload #13
/*     */     //   2283: aload #11
/*     */     //   2285: aload_0
/*     */     //   2286: aload #12
/*     */     //   2288: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
/*     */     //   2291: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
/*     */     //   2296: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
/*     */     //   2299: aconst_null
/*     */     //   2300: aconst_null
/*     */     //   2301: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
/*     */     //   2304: pop
/*     */     //   2305: aload_0
/*     */     //   2306: aload #12
/*     */     //   2308: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
/*     */     //   2313: pop
/*     */     //   2314: aload #7
/*     */     //   2316: getfield level : Lnet/minecraft/world/level/Level;
/*     */     //   2319: invokevirtual isClientSide : ()Z
/*     */     //   2322: ifne -> 2330
/*     */     //   2325: aload #7
/*     */     //   2327: invokevirtual discard : ()V
/*     */     //   2330: aload #7
/*     */     //   2332: instanceof net/minecraft/world/entity/player/Player
/*     */     //   2335: ifeq -> 2356
/*     */     //   2338: aload #7
/*     */     //   2340: checkcast net/minecraft/world/entity/player/Player
/*     */     //   2343: astore #11
/*     */     //   2345: aload #11
/*     */     //   2347: invokevirtual getAbilities : ()Lnet/minecraft/world/entity/player/Abilities;
/*     */     //   2350: getfield instabuild : Z
/*     */     //   2353: goto -> 2357
/*     */     //   2356: iconst_0
/*     */     //   2357: iconst_1
/*     */     //   2358: if_icmpeq -> 3186
/*     */     //   2361: aload #7
/*     */     //   2363: instanceof net/minecraft/world/entity/player/Player
/*     */     //   2366: ifeq -> 2419
/*     */     //   2369: aload #7
/*     */     //   2371: checkcast net/minecraft/world/entity/player/Player
/*     */     //   2374: astore #12
/*     */     //   2376: new net/minecraft/world/item/ItemStack
/*     */     //   2379: dup
/*     */     //   2380: getstatic net/mcreator/latexes/init/LatexModItems.RECRUITMENTPAPER : Lnet/minecraftforge/registries/RegistryObject;
/*     */     //   2383: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   2386: checkcast net/minecraft/world/level/ItemLike
/*     */     //   2389: invokespecial <init> : (Lnet/minecraft/world/level/ItemLike;)V
/*     */     //   2392: astore #13
/*     */     //   2394: aload #12
/*     */     //   2396: invokevirtual getInventory : ()Lnet/minecraft/world/entity/player/Inventory;
/*     */     //   2399: aload #13
/*     */     //   2401: <illegal opcode> test : (Lnet/minecraft/world/item/ItemStack;)Ljava/util/function/Predicate;
/*     */     //   2406: iconst_1
/*     */     //   2407: aload #12
/*     */     //   2409: getfield inventoryMenu : Lnet/minecraft/world/inventory/InventoryMenu;
/*     */     //   2412: invokevirtual getCraftSlots : ()Lnet/minecraft/world/inventory/CraftingContainer;
/*     */     //   2415: invokevirtual clearOrCountMatchingItems : (Ljava/util/function/Predicate;ILnet/minecraft/world/Container;)I
/*     */     //   2418: pop
/*     */     //   2419: goto -> 3186
/*     */     //   2422: aload_0
/*     */     //   2423: instanceof net/minecraft/server/level/ServerLevel
/*     */     //   2426: ifeq -> 2550
/*     */     //   2429: aload_0
/*     */     //   2430: checkcast net/minecraft/server/level/ServerLevel
/*     */     //   2433: astore #11
/*     */     //   2435: new net/mcreator/latexes/entity/EvilMilitaryEntity
/*     */     //   2438: dup
/*     */     //   2439: getstatic net/mcreator/latexes/init/LatexModEntities.EVIL_MILITARY : Lnet/minecraftforge/registries/RegistryObject;
/*     */     //   2442: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   2445: checkcast net/minecraft/world/entity/EntityType
/*     */     //   2448: aload #11
/*     */     //   2450: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
/*     */     //   2453: astore #12
/*     */     //   2455: aload #12
/*     */     //   2457: dload_1
/*     */     //   2458: dload_3
/*     */     //   2459: dload #5
/*     */     //   2461: aload #7
/*     */     //   2463: invokevirtual getYRot : ()F
/*     */     //   2466: aload #7
/*     */     //   2468: invokevirtual getXRot : ()F
/*     */     //   2471: invokevirtual moveTo : (DDDFF)V
/*     */     //   2474: aload #12
/*     */     //   2476: aload #7
/*     */     //   2478: invokevirtual getYRot : ()F
/*     */     //   2481: invokevirtual setYBodyRot : (F)V
/*     */     //   2484: aload #12
/*     */     //   2486: aload #7
/*     */     //   2488: invokevirtual getYRot : ()F
/*     */     //   2491: invokevirtual setYHeadRot : (F)V
/*     */     //   2494: aload #12
/*     */     //   2496: dconst_0
/*     */     //   2497: dconst_0
/*     */     //   2498: dconst_0
/*     */     //   2499: invokevirtual setDeltaMovement : (DDD)V
/*     */     //   2502: aload #12
/*     */     //   2504: instanceof net/minecraft/world/entity/Mob
/*     */     //   2507: ifeq -> 2541
/*     */     //   2510: aload #12
/*     */     //   2512: checkcast net/minecraft/world/entity/Mob
/*     */     //   2515: astore #13
/*     */     //   2517: aload #13
/*     */     //   2519: aload #11
/*     */     //   2521: aload_0
/*     */     //   2522: aload #12
/*     */     //   2524: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
/*     */     //   2527: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
/*     */     //   2532: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
/*     */     //   2535: aconst_null
/*     */     //   2536: aconst_null
/*     */     //   2537: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
/*     */     //   2540: pop
/*     */     //   2541: aload_0
/*     */     //   2542: aload #12
/*     */     //   2544: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
/*     */     //   2549: pop
/*     */     //   2550: aload #7
/*     */     //   2552: getfield level : Lnet/minecraft/world/level/Level;
/*     */     //   2555: invokevirtual isClientSide : ()Z
/*     */     //   2558: ifne -> 2566
/*     */     //   2561: aload #7
/*     */     //   2563: invokevirtual discard : ()V
/*     */     //   2566: aload #7
/*     */     //   2568: instanceof net/minecraft/world/entity/player/Player
/*     */     //   2571: ifeq -> 2592
/*     */     //   2574: aload #7
/*     */     //   2576: checkcast net/minecraft/world/entity/player/Player
/*     */     //   2579: astore #11
/*     */     //   2581: aload #11
/*     */     //   2583: invokevirtual getAbilities : ()Lnet/minecraft/world/entity/player/Abilities;
/*     */     //   2586: getfield instabuild : Z
/*     */     //   2589: goto -> 2593
/*     */     //   2592: iconst_0
/*     */     //   2593: iconst_1
/*     */     //   2594: if_icmpeq -> 3186
/*     */     //   2597: aload #7
/*     */     //   2599: instanceof net/minecraft/world/entity/player/Player
/*     */     //   2602: ifeq -> 2655
/*     */     //   2605: aload #7
/*     */     //   2607: checkcast net/minecraft/world/entity/player/Player
/*     */     //   2610: astore #12
/*     */     //   2612: new net/minecraft/world/item/ItemStack
/*     */     //   2615: dup
/*     */     //   2616: getstatic net/mcreator/latexes/init/LatexModItems.RECRUITMENTPAPER : Lnet/minecraftforge/registries/RegistryObject;
/*     */     //   2619: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   2622: checkcast net/minecraft/world/level/ItemLike
/*     */     //   2625: invokespecial <init> : (Lnet/minecraft/world/level/ItemLike;)V
/*     */     //   2628: astore #13
/*     */     //   2630: aload #12
/*     */     //   2632: invokevirtual getInventory : ()Lnet/minecraft/world/entity/player/Inventory;
/*     */     //   2635: aload #13
/*     */     //   2637: <illegal opcode> test : (Lnet/minecraft/world/item/ItemStack;)Ljava/util/function/Predicate;
/*     */     //   2642: iconst_1
/*     */     //   2643: aload #12
/*     */     //   2645: getfield inventoryMenu : Lnet/minecraft/world/inventory/InventoryMenu;
/*     */     //   2648: invokevirtual getCraftSlots : ()Lnet/minecraft/world/inventory/CraftingContainer;
/*     */     //   2651: invokevirtual clearOrCountMatchingItems : (Ljava/util/function/Predicate;ILnet/minecraft/world/Container;)I
/*     */     //   2654: pop
/*     */     //   2655: goto -> 3186
/*     */     //   2658: aload #8
/*     */     //   2660: instanceof net/minecraft/world/entity/LivingEntity
/*     */     //   2663: ifeq -> 2684
/*     */     //   2666: aload #8
/*     */     //   2668: checkcast net/minecraft/world/entity/LivingEntity
/*     */     //   2671: astore #10
/*     */     //   2673: aload #10
/*     */     //   2675: getstatic net/minecraft/world/entity/EquipmentSlot.HEAD : Lnet/minecraft/world/entity/EquipmentSlot;
/*     */     //   2678: invokevirtual getItemBySlot : (Lnet/minecraft/world/entity/EquipmentSlot;)Lnet/minecraft/world/item/ItemStack;
/*     */     //   2681: goto -> 2687
/*     */     //   2684: getstatic net/minecraft/world/item/ItemStack.EMPTY : Lnet/minecraft/world/item/ItemStack;
/*     */     //   2687: invokevirtual getItem : ()Lnet/minecraft/world/item/Item;
/*     */     //   2690: getstatic net/mcreator/latexes/init/LatexModItems.EVIL_BERET_HELMET : Lnet/minecraftforge/registries/RegistryObject;
/*     */     //   2693: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   2696: if_acmpne -> 3186
/*     */     //   2699: aload #7
/*     */     //   2701: instanceof net/mcreator/latexes/entity/CivilianEntity
/*     */     //   2704: ifeq -> 3186
/*     */     //   2707: invokestatic random : ()D
/*     */     //   2710: ldc2_w 0.5
/*     */     //   2713: dcmpg
/*     */     //   2714: ifge -> 2953
/*     */     //   2717: aload_0
/*     */     //   2718: instanceof net/minecraft/server/level/ServerLevel
/*     */     //   2721: ifeq -> 2845
/*     */     //   2724: aload_0
/*     */     //   2725: checkcast net/minecraft/server/level/ServerLevel
/*     */     //   2728: astore #11
/*     */     //   2730: new net/mcreator/latexes/entity/EvilScientistEntity
/*     */     //   2733: dup
/*     */     //   2734: getstatic net/mcreator/latexes/init/LatexModEntities.EVIL_SCIENTIST : Lnet/minecraftforge/registries/RegistryObject;
/*     */     //   2737: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   2740: checkcast net/minecraft/world/entity/EntityType
/*     */     //   2743: aload #11
/*     */     //   2745: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
/*     */     //   2748: astore #12
/*     */     //   2750: aload #12
/*     */     //   2752: dload_1
/*     */     //   2753: dload_3
/*     */     //   2754: dload #5
/*     */     //   2756: aload #7
/*     */     //   2758: invokevirtual getYRot : ()F
/*     */     //   2761: aload #7
/*     */     //   2763: invokevirtual getXRot : ()F
/*     */     //   2766: invokevirtual moveTo : (DDDFF)V
/*     */     //   2769: aload #12
/*     */     //   2771: aload #7
/*     */     //   2773: invokevirtual getYRot : ()F
/*     */     //   2776: invokevirtual setYBodyRot : (F)V
/*     */     //   2779: aload #12
/*     */     //   2781: aload #7
/*     */     //   2783: invokevirtual getYRot : ()F
/*     */     //   2786: invokevirtual setYHeadRot : (F)V
/*     */     //   2789: aload #12
/*     */     //   2791: dconst_0
/*     */     //   2792: dconst_0
/*     */     //   2793: dconst_0
/*     */     //   2794: invokevirtual setDeltaMovement : (DDD)V
/*     */     //   2797: aload #12
/*     */     //   2799: instanceof net/minecraft/world/entity/Mob
/*     */     //   2802: ifeq -> 2836
/*     */     //   2805: aload #12
/*     */     //   2807: checkcast net/minecraft/world/entity/Mob
/*     */     //   2810: astore #13
/*     */     //   2812: aload #13
/*     */     //   2814: aload #11
/*     */     //   2816: aload_0
/*     */     //   2817: aload #12
/*     */     //   2819: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
/*     */     //   2822: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
/*     */     //   2827: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
/*     */     //   2830: aconst_null
/*     */     //   2831: aconst_null
/*     */     //   2832: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
/*     */     //   2835: pop
/*     */     //   2836: aload_0
/*     */     //   2837: aload #12
/*     */     //   2839: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
/*     */     //   2844: pop
/*     */     //   2845: aload #7
/*     */     //   2847: getfield level : Lnet/minecraft/world/level/Level;
/*     */     //   2850: invokevirtual isClientSide : ()Z
/*     */     //   2853: ifne -> 2861
/*     */     //   2856: aload #7
/*     */     //   2858: invokevirtual discard : ()V
/*     */     //   2861: aload #7
/*     */     //   2863: instanceof net/minecraft/world/entity/player/Player
/*     */     //   2866: ifeq -> 2887
/*     */     //   2869: aload #7
/*     */     //   2871: checkcast net/minecraft/world/entity/player/Player
/*     */     //   2874: astore #11
/*     */     //   2876: aload #11
/*     */     //   2878: invokevirtual getAbilities : ()Lnet/minecraft/world/entity/player/Abilities;
/*     */     //   2881: getfield instabuild : Z
/*     */     //   2884: goto -> 2888
/*     */     //   2887: iconst_0
/*     */     //   2888: iconst_1
/*     */     //   2889: if_icmpeq -> 3186
/*     */     //   2892: aload #7
/*     */     //   2894: instanceof net/minecraft/world/entity/player/Player
/*     */     //   2897: ifeq -> 2950
/*     */     //   2900: aload #7
/*     */     //   2902: checkcast net/minecraft/world/entity/player/Player
/*     */     //   2905: astore #12
/*     */     //   2907: new net/minecraft/world/item/ItemStack
/*     */     //   2910: dup
/*     */     //   2911: getstatic net/mcreator/latexes/init/LatexModItems.RECRUITMENTPAPER : Lnet/minecraftforge/registries/RegistryObject;
/*     */     //   2914: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   2917: checkcast net/minecraft/world/level/ItemLike
/*     */     //   2920: invokespecial <init> : (Lnet/minecraft/world/level/ItemLike;)V
/*     */     //   2923: astore #13
/*     */     //   2925: aload #12
/*     */     //   2927: invokevirtual getInventory : ()Lnet/minecraft/world/entity/player/Inventory;
/*     */     //   2930: aload #13
/*     */     //   2932: <illegal opcode> test : (Lnet/minecraft/world/item/ItemStack;)Ljava/util/function/Predicate;
/*     */     //   2937: iconst_1
/*     */     //   2938: aload #12
/*     */     //   2940: getfield inventoryMenu : Lnet/minecraft/world/inventory/InventoryMenu;
/*     */     //   2943: invokevirtual getCraftSlots : ()Lnet/minecraft/world/inventory/CraftingContainer;
/*     */     //   2946: invokevirtual clearOrCountMatchingItems : (Ljava/util/function/Predicate;ILnet/minecraft/world/Container;)I
/*     */     //   2949: pop
/*     */     //   2950: goto -> 3186
/*     */     //   2953: aload_0
/*     */     //   2954: instanceof net/minecraft/server/level/ServerLevel
/*     */     //   2957: ifeq -> 3081
/*     */     //   2960: aload_0
/*     */     //   2961: checkcast net/minecraft/server/level/ServerLevel
/*     */     //   2964: astore #11
/*     */     //   2966: new net/mcreator/latexes/entity/EvilMilitaryEntity
/*     */     //   2969: dup
/*     */     //   2970: getstatic net/mcreator/latexes/init/LatexModEntities.EVIL_MILITARY : Lnet/minecraftforge/registries/RegistryObject;
/*     */     //   2973: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   2976: checkcast net/minecraft/world/entity/EntityType
/*     */     //   2979: aload #11
/*     */     //   2981: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
/*     */     //   2984: astore #12
/*     */     //   2986: aload #12
/*     */     //   2988: dload_1
/*     */     //   2989: dload_3
/*     */     //   2990: dload #5
/*     */     //   2992: aload #7
/*     */     //   2994: invokevirtual getYRot : ()F
/*     */     //   2997: aload #7
/*     */     //   2999: invokevirtual getXRot : ()F
/*     */     //   3002: invokevirtual moveTo : (DDDFF)V
/*     */     //   3005: aload #12
/*     */     //   3007: aload #7
/*     */     //   3009: invokevirtual getYRot : ()F
/*     */     //   3012: invokevirtual setYBodyRot : (F)V
/*     */     //   3015: aload #12
/*     */     //   3017: aload #7
/*     */     //   3019: invokevirtual getYRot : ()F
/*     */     //   3022: invokevirtual setYHeadRot : (F)V
/*     */     //   3025: aload #12
/*     */     //   3027: dconst_0
/*     */     //   3028: dconst_0
/*     */     //   3029: dconst_0
/*     */     //   3030: invokevirtual setDeltaMovement : (DDD)V
/*     */     //   3033: aload #12
/*     */     //   3035: instanceof net/minecraft/world/entity/Mob
/*     */     //   3038: ifeq -> 3072
/*     */     //   3041: aload #12
/*     */     //   3043: checkcast net/minecraft/world/entity/Mob
/*     */     //   3046: astore #13
/*     */     //   3048: aload #13
/*     */     //   3050: aload #11
/*     */     //   3052: aload_0
/*     */     //   3053: aload #12
/*     */     //   3055: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
/*     */     //   3058: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
/*     */     //   3063: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
/*     */     //   3066: aconst_null
/*     */     //   3067: aconst_null
/*     */     //   3068: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
/*     */     //   3071: pop
/*     */     //   3072: aload_0
/*     */     //   3073: aload #12
/*     */     //   3075: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
/*     */     //   3080: pop
/*     */     //   3081: aload #7
/*     */     //   3083: getfield level : Lnet/minecraft/world/level/Level;
/*     */     //   3086: invokevirtual isClientSide : ()Z
/*     */     //   3089: ifne -> 3097
/*     */     //   3092: aload #7
/*     */     //   3094: invokevirtual discard : ()V
/*     */     //   3097: aload #7
/*     */     //   3099: instanceof net/minecraft/world/entity/player/Player
/*     */     //   3102: ifeq -> 3123
/*     */     //   3105: aload #7
/*     */     //   3107: checkcast net/minecraft/world/entity/player/Player
/*     */     //   3110: astore #11
/*     */     //   3112: aload #11
/*     */     //   3114: invokevirtual getAbilities : ()Lnet/minecraft/world/entity/player/Abilities;
/*     */     //   3117: getfield instabuild : Z
/*     */     //   3120: goto -> 3124
/*     */     //   3123: iconst_0
/*     */     //   3124: iconst_1
/*     */     //   3125: if_icmpeq -> 3186
/*     */     //   3128: aload #7
/*     */     //   3130: instanceof net/minecraft/world/entity/player/Player
/*     */     //   3133: ifeq -> 3186
/*     */     //   3136: aload #7
/*     */     //   3138: checkcast net/minecraft/world/entity/player/Player
/*     */     //   3141: astore #12
/*     */     //   3143: new net/minecraft/world/item/ItemStack
/*     */     //   3146: dup
/*     */     //   3147: getstatic net/mcreator/latexes/init/LatexModItems.RECRUITMENTPAPER : Lnet/minecraftforge/registries/RegistryObject;
/*     */     //   3150: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   3153: checkcast net/minecraft/world/level/ItemLike
/*     */     //   3156: invokespecial <init> : (Lnet/minecraft/world/level/ItemLike;)V
/*     */     //   3159: astore #13
/*     */     //   3161: aload #12
/*     */     //   3163: invokevirtual getInventory : ()Lnet/minecraft/world/entity/player/Inventory;
/*     */     //   3166: aload #13
/*     */     //   3168: <illegal opcode> test : (Lnet/minecraft/world/item/ItemStack;)Ljava/util/function/Predicate;
/*     */     //   3173: iconst_1
/*     */     //   3174: aload #12
/*     */     //   3176: getfield inventoryMenu : Lnet/minecraft/world/inventory/InventoryMenu;
/*     */     //   3179: invokevirtual getCraftSlots : ()Lnet/minecraft/world/inventory/CraftingContainer;
/*     */     //   3182: invokevirtual clearOrCountMatchingItems : (Ljava/util/function/Predicate;ILnet/minecraft/world/Container;)I
/*     */     //   3185: pop
/*     */     //   3186: return
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
/*     */     //   #46	-> 194
/*     */     //   #47	-> 209
/*     */     //   #48	-> 227
/*     */     //   #49	-> 245
/*     */     //   #48	-> 248
/*     */     //   #50	-> 252
/*     */     //   #52	-> 255
/*     */     //   #53	-> 263
/*     */     //   #54	-> 292
/*     */     //   #55	-> 304
/*     */     //   #56	-> 314
/*     */     //   #57	-> 327
/*     */     //   #58	-> 347
/*     */     //   #59	-> 366
/*     */     //   #60	-> 376
/*     */     //   #61	-> 386
/*     */     //   #62	-> 394
/*     */     //   #63	-> 409
/*     */     //   #65	-> 433
/*     */     //   #67	-> 442
/*     */     //   #68	-> 453
/*     */     //   #69	-> 458
/*     */     //   #70	-> 489
/*     */     //   #71	-> 504
/*     */     //   #72	-> 522
/*     */     //   #73	-> 540
/*     */     //   #72	-> 543
/*     */     //   #74	-> 547
/*     */     //   #77	-> 550
/*     */     //   #78	-> 563
/*     */     //   #79	-> 583
/*     */     //   #80	-> 602
/*     */     //   #81	-> 612
/*     */     //   #82	-> 622
/*     */     //   #83	-> 630
/*     */     //   #84	-> 645
/*     */     //   #86	-> 669
/*     */     //   #88	-> 678
/*     */     //   #89	-> 689
/*     */     //   #90	-> 694
/*     */     //   #91	-> 725
/*     */     //   #92	-> 740
/*     */     //   #93	-> 758
/*     */     //   #94	-> 776
/*     */     //   #93	-> 779
/*     */     //   #95	-> 783
/*     */     //   #98	-> 786
/*     */     //   #99	-> 794
/*     */     //   #100	-> 823
/*     */     //   #101	-> 835
/*     */     //   #102	-> 845
/*     */     //   #103	-> 858
/*     */     //   #104	-> 878
/*     */     //   #105	-> 897
/*     */     //   #106	-> 907
/*     */     //   #107	-> 917
/*     */     //   #108	-> 925
/*     */     //   #109	-> 940
/*     */     //   #111	-> 964
/*     */     //   #113	-> 973
/*     */     //   #114	-> 984
/*     */     //   #115	-> 989
/*     */     //   #116	-> 1020
/*     */     //   #117	-> 1035
/*     */     //   #118	-> 1053
/*     */     //   #119	-> 1071
/*     */     //   #118	-> 1074
/*     */     //   #120	-> 1078
/*     */     //   #122	-> 1081
/*     */     //   #123	-> 1091
/*     */     //   #124	-> 1104
/*     */     //   #125	-> 1124
/*     */     //   #126	-> 1143
/*     */     //   #127	-> 1153
/*     */     //   #128	-> 1163
/*     */     //   #129	-> 1171
/*     */     //   #130	-> 1186
/*     */     //   #132	-> 1210
/*     */     //   #134	-> 1219
/*     */     //   #135	-> 1230
/*     */     //   #136	-> 1235
/*     */     //   #137	-> 1266
/*     */     //   #138	-> 1281
/*     */     //   #139	-> 1299
/*     */     //   #140	-> 1317
/*     */     //   #139	-> 1320
/*     */     //   #141	-> 1324
/*     */     //   #144	-> 1327
/*     */     //   #145	-> 1340
/*     */     //   #146	-> 1360
/*     */     //   #147	-> 1379
/*     */     //   #148	-> 1389
/*     */     //   #149	-> 1399
/*     */     //   #150	-> 1407
/*     */     //   #151	-> 1422
/*     */     //   #153	-> 1446
/*     */     //   #155	-> 1455
/*     */     //   #156	-> 1466
/*     */     //   #157	-> 1471
/*     */     //   #158	-> 1502
/*     */     //   #159	-> 1517
/*     */     //   #160	-> 1535
/*     */     //   #161	-> 1553
/*     */     //   #160	-> 1556
/*     */     //   #166	-> 1560
/*     */     //   #167	-> 1589
/*     */     //   #168	-> 1609
/*     */     //   #169	-> 1622
/*     */     //   #170	-> 1642
/*     */     //   #171	-> 1661
/*     */     //   #172	-> 1671
/*     */     //   #173	-> 1681
/*     */     //   #174	-> 1689
/*     */     //   #175	-> 1704
/*     */     //   #177	-> 1728
/*     */     //   #179	-> 1737
/*     */     //   #180	-> 1748
/*     */     //   #181	-> 1753
/*     */     //   #182	-> 1784
/*     */     //   #183	-> 1799
/*     */     //   #184	-> 1817
/*     */     //   #185	-> 1835
/*     */     //   #184	-> 1838
/*     */     //   #186	-> 1842
/*     */     //   #188	-> 1845
/*     */     //   #189	-> 1874
/*     */     //   #190	-> 1894
/*     */     //   #191	-> 1907
/*     */     //   #192	-> 1927
/*     */     //   #193	-> 1946
/*     */     //   #194	-> 1956
/*     */     //   #195	-> 1966
/*     */     //   #196	-> 1974
/*     */     //   #197	-> 1989
/*     */     //   #199	-> 2013
/*     */     //   #201	-> 2022
/*     */     //   #202	-> 2033
/*     */     //   #203	-> 2038
/*     */     //   #204	-> 2069
/*     */     //   #205	-> 2084
/*     */     //   #206	-> 2102
/*     */     //   #207	-> 2120
/*     */     //   #206	-> 2123
/*     */     //   #211	-> 2127
/*     */     //   #212	-> 2156
/*     */     //   #213	-> 2176
/*     */     //   #214	-> 2186
/*     */     //   #215	-> 2199
/*     */     //   #216	-> 2219
/*     */     //   #217	-> 2238
/*     */     //   #218	-> 2248
/*     */     //   #219	-> 2258
/*     */     //   #220	-> 2266
/*     */     //   #221	-> 2281
/*     */     //   #223	-> 2305
/*     */     //   #225	-> 2314
/*     */     //   #226	-> 2325
/*     */     //   #227	-> 2330
/*     */     //   #228	-> 2361
/*     */     //   #229	-> 2376
/*     */     //   #230	-> 2394
/*     */     //   #231	-> 2412
/*     */     //   #230	-> 2415
/*     */     //   #232	-> 2419
/*     */     //   #235	-> 2422
/*     */     //   #236	-> 2435
/*     */     //   #237	-> 2455
/*     */     //   #238	-> 2474
/*     */     //   #239	-> 2484
/*     */     //   #240	-> 2494
/*     */     //   #241	-> 2502
/*     */     //   #242	-> 2517
/*     */     //   #244	-> 2541
/*     */     //   #246	-> 2550
/*     */     //   #247	-> 2561
/*     */     //   #248	-> 2566
/*     */     //   #249	-> 2597
/*     */     //   #250	-> 2612
/*     */     //   #251	-> 2630
/*     */     //   #252	-> 2648
/*     */     //   #251	-> 2651
/*     */     //   #253	-> 2655
/*     */     //   #256	-> 2658
/*     */     //   #257	-> 2687
/*     */     //   #258	-> 2707
/*     */     //   #259	-> 2717
/*     */     //   #260	-> 2730
/*     */     //   #261	-> 2750
/*     */     //   #262	-> 2769
/*     */     //   #263	-> 2779
/*     */     //   #264	-> 2789
/*     */     //   #265	-> 2797
/*     */     //   #266	-> 2812
/*     */     //   #268	-> 2836
/*     */     //   #270	-> 2845
/*     */     //   #271	-> 2856
/*     */     //   #272	-> 2861
/*     */     //   #273	-> 2892
/*     */     //   #274	-> 2907
/*     */     //   #275	-> 2925
/*     */     //   #276	-> 2943
/*     */     //   #275	-> 2946
/*     */     //   #277	-> 2950
/*     */     //   #280	-> 2953
/*     */     //   #281	-> 2966
/*     */     //   #282	-> 2986
/*     */     //   #283	-> 3005
/*     */     //   #284	-> 3015
/*     */     //   #285	-> 3025
/*     */     //   #286	-> 3033
/*     */     //   #287	-> 3048
/*     */     //   #289	-> 3072
/*     */     //   #291	-> 3081
/*     */     //   #292	-> 3092
/*     */     //   #293	-> 3097
/*     */     //   #294	-> 3128
/*     */     //   #295	-> 3143
/*     */     //   #296	-> 3161
/*     */     //   #297	-> 3179
/*     */     //   #296	-> 3182
/*     */     //   #302	-> 3186
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   114	24	13	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
/*     */     //   52	95	12	entityToSpawn	Lnet/minecraft/world/entity/Entity;
/*     */     //   32	115	11	_level	Lnet/minecraft/server/level/ServerLevel;
/*     */     //   178	11	11	_plr	Lnet/minecraft/world/entity/player/Player;
/*     */     //   227	25	13	_stktoremove	Lnet/minecraft/world/item/ItemStack;
/*     */     //   209	43	12	_player	Lnet/minecraft/world/entity/player/Player;
/*     */     //   278	11	9	_entGetArmor	Lnet/minecraft/world/entity/LivingEntity;
/*     */     //   409	24	13	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
/*     */     //   347	95	12	entityToSpawn	Lnet/minecraft/world/entity/Entity;
/*     */     //   327	115	11	_level	Lnet/minecraft/server/level/ServerLevel;
/*     */     //   473	11	11	_plr	Lnet/minecraft/world/entity/player/Player;
/*     */     //   522	25	13	_stktoremove	Lnet/minecraft/world/item/ItemStack;
/*     */     //   504	43	12	_player	Lnet/minecraft/world/entity/player/Player;
/*     */     //   645	24	13	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
/*     */     //   583	95	12	entityToSpawn	Lnet/minecraft/world/entity/Entity;
/*     */     //   563	115	11	_level	Lnet/minecraft/server/level/ServerLevel;
/*     */     //   709	11	11	_plr	Lnet/minecraft/world/entity/player/Player;
/*     */     //   758	25	13	_stktoremove	Lnet/minecraft/world/item/ItemStack;
/*     */     //   740	43	12	_player	Lnet/minecraft/world/entity/player/Player;
/*     */     //   809	11	10	_entGetArmor	Lnet/minecraft/world/entity/LivingEntity;
/*     */     //   940	24	13	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
/*     */     //   878	95	12	entityToSpawn	Lnet/minecraft/world/entity/Entity;
/*     */     //   858	115	11	_level	Lnet/minecraft/server/level/ServerLevel;
/*     */     //   1004	11	11	_plr	Lnet/minecraft/world/entity/player/Player;
/*     */     //   1053	25	13	_stktoremove	Lnet/minecraft/world/item/ItemStack;
/*     */     //   1035	43	12	_player	Lnet/minecraft/world/entity/player/Player;
/*     */     //   1186	24	13	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
/*     */     //   1124	95	12	entityToSpawn	Lnet/minecraft/world/entity/Entity;
/*     */     //   1104	115	11	_level	Lnet/minecraft/server/level/ServerLevel;
/*     */     //   1250	11	11	_plr	Lnet/minecraft/world/entity/player/Player;
/*     */     //   1299	25	13	_stktoremove	Lnet/minecraft/world/item/ItemStack;
/*     */     //   1281	43	12	_player	Lnet/minecraft/world/entity/player/Player;
/*     */     //   1422	24	13	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
/*     */     //   1360	95	12	entityToSpawn	Lnet/minecraft/world/entity/Entity;
/*     */     //   1340	115	11	_level	Lnet/minecraft/server/level/ServerLevel;
/*     */     //   1486	11	11	_plr	Lnet/minecraft/world/entity/player/Player;
/*     */     //   1535	25	13	_stktoremove	Lnet/minecraft/world/item/ItemStack;
/*     */     //   1517	43	12	_player	Lnet/minecraft/world/entity/player/Player;
/*     */     //   1575	11	9	_entGetArmor	Lnet/minecraft/world/entity/LivingEntity;
/*     */     //   1704	24	13	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
/*     */     //   1642	95	12	entityToSpawn	Lnet/minecraft/world/entity/Entity;
/*     */     //   1622	115	11	_level	Lnet/minecraft/server/level/ServerLevel;
/*     */     //   1768	11	11	_plr	Lnet/minecraft/world/entity/player/Player;
/*     */     //   1817	25	13	_stktoremove	Lnet/minecraft/world/item/ItemStack;
/*     */     //   1799	43	12	_player	Lnet/minecraft/world/entity/player/Player;
/*     */     //   1860	11	10	_entGetArmor	Lnet/minecraft/world/entity/LivingEntity;
/*     */     //   1989	24	13	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
/*     */     //   1927	95	12	entityToSpawn	Lnet/minecraft/world/entity/Entity;
/*     */     //   1907	115	11	_level	Lnet/minecraft/server/level/ServerLevel;
/*     */     //   2053	11	11	_plr	Lnet/minecraft/world/entity/player/Player;
/*     */     //   2102	25	13	_stktoremove	Lnet/minecraft/world/item/ItemStack;
/*     */     //   2084	43	12	_player	Lnet/minecraft/world/entity/player/Player;
/*     */     //   2142	11	9	_entGetArmor	Lnet/minecraft/world/entity/LivingEntity;
/*     */     //   2281	24	13	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
/*     */     //   2219	95	12	entityToSpawn	Lnet/minecraft/world/entity/Entity;
/*     */     //   2199	115	11	_level	Lnet/minecraft/server/level/ServerLevel;
/*     */     //   2345	11	11	_plr	Lnet/minecraft/world/entity/player/Player;
/*     */     //   2394	25	13	_stktoremove	Lnet/minecraft/world/item/ItemStack;
/*     */     //   2376	43	12	_player	Lnet/minecraft/world/entity/player/Player;
/*     */     //   2517	24	13	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
/*     */     //   2455	95	12	entityToSpawn	Lnet/minecraft/world/entity/Entity;
/*     */     //   2435	115	11	_level	Lnet/minecraft/server/level/ServerLevel;
/*     */     //   2581	11	11	_plr	Lnet/minecraft/world/entity/player/Player;
/*     */     //   2630	25	13	_stktoremove	Lnet/minecraft/world/item/ItemStack;
/*     */     //   2612	43	12	_player	Lnet/minecraft/world/entity/player/Player;
/*     */     //   2673	11	10	_entGetArmor	Lnet/minecraft/world/entity/LivingEntity;
/*     */     //   2812	24	13	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
/*     */     //   2750	95	12	entityToSpawn	Lnet/minecraft/world/entity/Entity;
/*     */     //   2730	115	11	_level	Lnet/minecraft/server/level/ServerLevel;
/*     */     //   2876	11	11	_plr	Lnet/minecraft/world/entity/player/Player;
/*     */     //   2925	25	13	_stktoremove	Lnet/minecraft/world/item/ItemStack;
/*     */     //   2907	43	12	_player	Lnet/minecraft/world/entity/player/Player;
/*     */     //   3048	24	13	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
/*     */     //   2986	95	12	entityToSpawn	Lnet/minecraft/world/entity/Entity;
/*     */     //   2966	115	11	_level	Lnet/minecraft/server/level/ServerLevel;
/*     */     //   3112	11	11	_plr	Lnet/minecraft/world/entity/player/Player;
/*     */     //   3161	25	13	_stktoremove	Lnet/minecraft/world/item/ItemStack;
/*     */     //   3143	43	12	_player	Lnet/minecraft/world/entity/player/Player;
/*     */     //   0	3187	0	world	Lnet/minecraft/world/level/LevelAccessor;
/*     */     //   0	3187	1	x	D
/*     */     //   0	3187	3	y	D
/*     */     //   0	3187	5	z	D
/*     */     //   0	3187	7	entity	Lnet/minecraft/world/entity/Entity;
/*     */     //   0	3187	8	sourceentity	Lnet/minecraft/world/entity/Entity;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\RecruitmentpaperRightclickedProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */