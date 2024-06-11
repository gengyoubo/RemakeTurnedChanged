package net.mcreator.latexes.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.LevelAccessor;

public class DleffecttransfurProcedure {
  public static boolean execute(LevelAccessor world, double x, double y, double z, Entity entity) {
    // Byte code:
    //   0: aload #7
    //   2: ifnonnull -> 7
    //   5: iconst_0
    //   6: ireturn
    //   7: aload_0
    //   8: invokeinterface getLevelData : ()Lnet/minecraft/world/level/storage/LevelData;
    //   13: invokeinterface getGameRules : ()Lnet/minecraft/world/level/GameRules;
    //   18: getstatic net/mcreator/latexes/init/LatexModGameRules.DARKLATEXTRANSFUR : Lnet/minecraft/world/level/GameRules$Key;
    //   21: invokevirtual getBoolean : (Lnet/minecraft/world/level/GameRules$Key;)Z
    //   24: iconst_1
    //   25: if_icmpne -> 3433
    //   28: aload #7
    //   30: instanceof net/minecraft/world/entity/LivingEntity
    //   33: ifeq -> 54
    //   36: aload #7
    //   38: checkcast net/minecraft/world/entity/LivingEntity
    //   41: astore #8
    //   43: aload #8
    //   45: getstatic net/minecraft/world/entity/EquipmentSlot.HEAD : Lnet/minecraft/world/entity/EquipmentSlot;
    //   48: invokevirtual getItemBySlot : (Lnet/minecraft/world/entity/EquipmentSlot;)Lnet/minecraft/world/item/ItemStack;
    //   51: goto -> 57
    //   54: getstatic net/minecraft/world/item/ItemStack.EMPTY : Lnet/minecraft/world/item/ItemStack;
    //   57: invokevirtual getItem : ()Lnet/minecraft/world/item/Item;
    //   60: getstatic net/mcreator/latexes/init/LatexModItems.HAZMAT_HELMET : Lnet/minecraftforge/registries/RegistryObject;
    //   63: invokevirtual get : ()Ljava/lang/Object;
    //   66: if_acmpne -> 196
    //   69: aload #7
    //   71: instanceof net/minecraft/world/entity/LivingEntity
    //   74: ifeq -> 95
    //   77: aload #7
    //   79: checkcast net/minecraft/world/entity/LivingEntity
    //   82: astore #9
    //   84: aload #9
    //   86: getstatic net/minecraft/world/entity/EquipmentSlot.CHEST : Lnet/minecraft/world/entity/EquipmentSlot;
    //   89: invokevirtual getItemBySlot : (Lnet/minecraft/world/entity/EquipmentSlot;)Lnet/minecraft/world/item/ItemStack;
    //   92: goto -> 98
    //   95: getstatic net/minecraft/world/item/ItemStack.EMPTY : Lnet/minecraft/world/item/ItemStack;
    //   98: invokevirtual getItem : ()Lnet/minecraft/world/item/Item;
    //   101: getstatic net/mcreator/latexes/init/LatexModItems.HAZMAT_CHESTPLATE : Lnet/minecraftforge/registries/RegistryObject;
    //   104: invokevirtual get : ()Ljava/lang/Object;
    //   107: if_acmpne -> 196
    //   110: aload #7
    //   112: instanceof net/minecraft/world/entity/LivingEntity
    //   115: ifeq -> 136
    //   118: aload #7
    //   120: checkcast net/minecraft/world/entity/LivingEntity
    //   123: astore #10
    //   125: aload #10
    //   127: getstatic net/minecraft/world/entity/EquipmentSlot.LEGS : Lnet/minecraft/world/entity/EquipmentSlot;
    //   130: invokevirtual getItemBySlot : (Lnet/minecraft/world/entity/EquipmentSlot;)Lnet/minecraft/world/item/ItemStack;
    //   133: goto -> 139
    //   136: getstatic net/minecraft/world/item/ItemStack.EMPTY : Lnet/minecraft/world/item/ItemStack;
    //   139: invokevirtual getItem : ()Lnet/minecraft/world/item/Item;
    //   142: getstatic net/mcreator/latexes/init/LatexModItems.HAZMAT_LEGGINGS : Lnet/minecraftforge/registries/RegistryObject;
    //   145: invokevirtual get : ()Ljava/lang/Object;
    //   148: if_acmpne -> 196
    //   151: aload #7
    //   153: instanceof net/minecraft/world/entity/LivingEntity
    //   156: ifeq -> 177
    //   159: aload #7
    //   161: checkcast net/minecraft/world/entity/LivingEntity
    //   164: astore #11
    //   166: aload #11
    //   168: getstatic net/minecraft/world/entity/EquipmentSlot.FEET : Lnet/minecraft/world/entity/EquipmentSlot;
    //   171: invokevirtual getItemBySlot : (Lnet/minecraft/world/entity/EquipmentSlot;)Lnet/minecraft/world/item/ItemStack;
    //   174: goto -> 180
    //   177: getstatic net/minecraft/world/item/ItemStack.EMPTY : Lnet/minecraft/world/item/ItemStack;
    //   180: invokevirtual getItem : ()Lnet/minecraft/world/item/Item;
    //   183: getstatic net/mcreator/latexes/init/LatexModItems.HAZMAT_BOOTS : Lnet/minecraftforge/registries/RegistryObject;
    //   186: invokevirtual get : ()Ljava/lang/Object;
    //   189: if_acmpne -> 196
    //   192: iconst_1
    //   193: goto -> 197
    //   196: iconst_0
    //   197: iconst_1
    //   198: if_icmpeq -> 3423
    //   201: aload #7
    //   203: invokevirtual getType : ()Lnet/minecraft/world/entity/EntityType;
    //   206: getstatic net/minecraft/core/Registry.ENTITY_TYPE_REGISTRY : Lnet/minecraft/resources/ResourceKey;
    //   209: new net/minecraft/resources/ResourceLocation
    //   212: dup
    //   213: ldc 'latex:robots'
    //   215: invokespecial <init> : (Ljava/lang/String;)V
    //   218: invokestatic create : (Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraft/tags/TagKey;
    //   221: invokevirtual is : (Lnet/minecraft/tags/TagKey;)Z
    //   224: ifne -> 235
    //   227: aload #7
    //   229: instanceof net/minecraft/world/entity/player/Player
    //   232: ifeq -> 237
    //   235: iconst_1
    //   236: ireturn
    //   237: aload #7
    //   239: instanceof net/minecraft/world/entity/FlyingMob
    //   242: iconst_1
    //   243: if_icmpne -> 935
    //   246: invokestatic random : ()D
    //   249: ldc2_w 0.3
    //   252: dcmpg
    //   253: ifge -> 479
    //   256: aload #7
    //   258: getfield level : Lnet/minecraft/world/level/Level;
    //   261: invokevirtual isClientSide : ()Z
    //   264: ifne -> 272
    //   267: aload #7
    //   269: invokevirtual discard : ()V
    //   272: aload_0
    //   273: instanceof net/minecraft/world/level/Level
    //   276: ifeq -> 373
    //   279: aload_0
    //   280: checkcast net/minecraft/world/level/Level
    //   283: astore #12
    //   285: aload #12
    //   287: invokevirtual isClientSide : ()Z
    //   290: ifne -> 338
    //   293: aload #12
    //   295: aconst_null
    //   296: new net/minecraft/core/BlockPos
    //   299: dup
    //   300: dload_1
    //   301: dload_3
    //   302: dload #5
    //   304: invokespecial <init> : (DDD)V
    //   307: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   310: new net/minecraft/resources/ResourceLocation
    //   313: dup
    //   314: ldc 'latex:transfur'
    //   316: invokespecial <init> : (Ljava/lang/String;)V
    //   319: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   324: checkcast net/minecraft/sounds/SoundEvent
    //   327: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   330: fconst_1
    //   331: fconst_1
    //   332: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   335: goto -> 373
    //   338: aload #12
    //   340: dload_1
    //   341: dload_3
    //   342: dload #5
    //   344: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   347: new net/minecraft/resources/ResourceLocation
    //   350: dup
    //   351: ldc 'latex:transfur'
    //   353: invokespecial <init> : (Ljava/lang/String;)V
    //   356: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   361: checkcast net/minecraft/sounds/SoundEvent
    //   364: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   367: fconst_1
    //   368: fconst_1
    //   369: iconst_0
    //   370: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   373: aload_0
    //   374: instanceof net/minecraft/server/level/ServerLevel
    //   377: ifeq -> 476
    //   380: aload_0
    //   381: checkcast net/minecraft/server/level/ServerLevel
    //   384: astore #12
    //   386: new net/mcreator/latexes/entity/DarkLatexMothEntity
    //   389: dup
    //   390: getstatic net/mcreator/latexes/init/LatexModEntities.DARK_LATEX_MOTH : Lnet/minecraftforge/registries/RegistryObject;
    //   393: invokevirtual get : ()Ljava/lang/Object;
    //   396: checkcast net/minecraft/world/entity/EntityType
    //   399: aload #12
    //   401: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   404: astore #13
    //   406: aload #13
    //   408: dload_1
    //   409: dload_3
    //   410: dload #5
    //   412: aload_0
    //   413: invokeinterface getRandom : ()Ljava/util/Random;
    //   418: invokevirtual nextFloat : ()F
    //   421: ldc 360.0
    //   423: fmul
    //   424: fconst_0
    //   425: invokevirtual moveTo : (DDDFF)V
    //   428: aload #13
    //   430: instanceof net/minecraft/world/entity/Mob
    //   433: ifeq -> 467
    //   436: aload #13
    //   438: checkcast net/minecraft/world/entity/Mob
    //   441: astore #14
    //   443: aload #14
    //   445: aload #12
    //   447: aload_0
    //   448: aload #13
    //   450: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   453: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   458: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   461: aconst_null
    //   462: aconst_null
    //   463: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   466: pop
    //   467: aload_0
    //   468: aload #13
    //   470: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   475: pop
    //   476: goto -> 3433
    //   479: invokestatic random : ()D
    //   482: ldc2_w 0.3
    //   485: dcmpg
    //   486: ifge -> 712
    //   489: aload #7
    //   491: getfield level : Lnet/minecraft/world/level/Level;
    //   494: invokevirtual isClientSide : ()Z
    //   497: ifne -> 505
    //   500: aload #7
    //   502: invokevirtual discard : ()V
    //   505: aload_0
    //   506: instanceof net/minecraft/world/level/Level
    //   509: ifeq -> 606
    //   512: aload_0
    //   513: checkcast net/minecraft/world/level/Level
    //   516: astore #12
    //   518: aload #12
    //   520: invokevirtual isClientSide : ()Z
    //   523: ifne -> 571
    //   526: aload #12
    //   528: aconst_null
    //   529: new net/minecraft/core/BlockPos
    //   532: dup
    //   533: dload_1
    //   534: dload_3
    //   535: dload #5
    //   537: invokespecial <init> : (DDD)V
    //   540: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   543: new net/minecraft/resources/ResourceLocation
    //   546: dup
    //   547: ldc 'latex:transfur'
    //   549: invokespecial <init> : (Ljava/lang/String;)V
    //   552: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   557: checkcast net/minecraft/sounds/SoundEvent
    //   560: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   563: fconst_1
    //   564: fconst_1
    //   565: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   568: goto -> 606
    //   571: aload #12
    //   573: dload_1
    //   574: dload_3
    //   575: dload #5
    //   577: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   580: new net/minecraft/resources/ResourceLocation
    //   583: dup
    //   584: ldc 'latex:transfur'
    //   586: invokespecial <init> : (Ljava/lang/String;)V
    //   589: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   594: checkcast net/minecraft/sounds/SoundEvent
    //   597: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   600: fconst_1
    //   601: fconst_1
    //   602: iconst_0
    //   603: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   606: aload_0
    //   607: instanceof net/minecraft/server/level/ServerLevel
    //   610: ifeq -> 709
    //   613: aload_0
    //   614: checkcast net/minecraft/server/level/ServerLevel
    //   617: astore #12
    //   619: new net/mcreator/latexes/entity/DLbeeEntity
    //   622: dup
    //   623: getstatic net/mcreator/latexes/init/LatexModEntities.D_LBEE : Lnet/minecraftforge/registries/RegistryObject;
    //   626: invokevirtual get : ()Ljava/lang/Object;
    //   629: checkcast net/minecraft/world/entity/EntityType
    //   632: aload #12
    //   634: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   637: astore #13
    //   639: aload #13
    //   641: dload_1
    //   642: dload_3
    //   643: dload #5
    //   645: aload_0
    //   646: invokeinterface getRandom : ()Ljava/util/Random;
    //   651: invokevirtual nextFloat : ()F
    //   654: ldc 360.0
    //   656: fmul
    //   657: fconst_0
    //   658: invokevirtual moveTo : (DDDFF)V
    //   661: aload #13
    //   663: instanceof net/minecraft/world/entity/Mob
    //   666: ifeq -> 700
    //   669: aload #13
    //   671: checkcast net/minecraft/world/entity/Mob
    //   674: astore #14
    //   676: aload #14
    //   678: aload #12
    //   680: aload_0
    //   681: aload #13
    //   683: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   686: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   691: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   694: aconst_null
    //   695: aconst_null
    //   696: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   699: pop
    //   700: aload_0
    //   701: aload #13
    //   703: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   708: pop
    //   709: goto -> 3433
    //   712: aload #7
    //   714: getfield level : Lnet/minecraft/world/level/Level;
    //   717: invokevirtual isClientSide : ()Z
    //   720: ifne -> 728
    //   723: aload #7
    //   725: invokevirtual discard : ()V
    //   728: aload_0
    //   729: instanceof net/minecraft/world/level/Level
    //   732: ifeq -> 829
    //   735: aload_0
    //   736: checkcast net/minecraft/world/level/Level
    //   739: astore #12
    //   741: aload #12
    //   743: invokevirtual isClientSide : ()Z
    //   746: ifne -> 794
    //   749: aload #12
    //   751: aconst_null
    //   752: new net/minecraft/core/BlockPos
    //   755: dup
    //   756: dload_1
    //   757: dload_3
    //   758: dload #5
    //   760: invokespecial <init> : (DDD)V
    //   763: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   766: new net/minecraft/resources/ResourceLocation
    //   769: dup
    //   770: ldc 'latex:transfur'
    //   772: invokespecial <init> : (Ljava/lang/String;)V
    //   775: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   780: checkcast net/minecraft/sounds/SoundEvent
    //   783: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   786: fconst_1
    //   787: fconst_1
    //   788: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   791: goto -> 829
    //   794: aload #12
    //   796: dload_1
    //   797: dload_3
    //   798: dload #5
    //   800: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   803: new net/minecraft/resources/ResourceLocation
    //   806: dup
    //   807: ldc 'latex:transfur'
    //   809: invokespecial <init> : (Ljava/lang/String;)V
    //   812: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   817: checkcast net/minecraft/sounds/SoundEvent
    //   820: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   823: fconst_1
    //   824: fconst_1
    //   825: iconst_0
    //   826: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   829: aload_0
    //   830: instanceof net/minecraft/server/level/ServerLevel
    //   833: ifeq -> 932
    //   836: aload_0
    //   837: checkcast net/minecraft/server/level/ServerLevel
    //   840: astore #12
    //   842: new net/mcreator/latexes/entity/YufengEntity
    //   845: dup
    //   846: getstatic net/mcreator/latexes/init/LatexModEntities.YUFENG : Lnet/minecraftforge/registries/RegistryObject;
    //   849: invokevirtual get : ()Ljava/lang/Object;
    //   852: checkcast net/minecraft/world/entity/EntityType
    //   855: aload #12
    //   857: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   860: astore #13
    //   862: aload #13
    //   864: dload_1
    //   865: dload_3
    //   866: dload #5
    //   868: aload_0
    //   869: invokeinterface getRandom : ()Ljava/util/Random;
    //   874: invokevirtual nextFloat : ()F
    //   877: ldc 360.0
    //   879: fmul
    //   880: fconst_0
    //   881: invokevirtual moveTo : (DDDFF)V
    //   884: aload #13
    //   886: instanceof net/minecraft/world/entity/Mob
    //   889: ifeq -> 923
    //   892: aload #13
    //   894: checkcast net/minecraft/world/entity/Mob
    //   897: astore #14
    //   899: aload #14
    //   901: aload #12
    //   903: aload_0
    //   904: aload #13
    //   906: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   909: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   914: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   917: aconst_null
    //   918: aconst_null
    //   919: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   922: pop
    //   923: aload_0
    //   924: aload #13
    //   926: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   931: pop
    //   932: goto -> 3433
    //   935: aload #7
    //   937: instanceof net/minecraft/world/entity/animal/WaterAnimal
    //   940: iconst_1
    //   941: if_icmpne -> 1400
    //   944: invokestatic random : ()D
    //   947: ldc2_w 0.3
    //   950: dcmpg
    //   951: ifge -> 1177
    //   954: aload #7
    //   956: getfield level : Lnet/minecraft/world/level/Level;
    //   959: invokevirtual isClientSide : ()Z
    //   962: ifne -> 970
    //   965: aload #7
    //   967: invokevirtual discard : ()V
    //   970: aload_0
    //   971: instanceof net/minecraft/world/level/Level
    //   974: ifeq -> 1071
    //   977: aload_0
    //   978: checkcast net/minecraft/world/level/Level
    //   981: astore #12
    //   983: aload #12
    //   985: invokevirtual isClientSide : ()Z
    //   988: ifne -> 1036
    //   991: aload #12
    //   993: aconst_null
    //   994: new net/minecraft/core/BlockPos
    //   997: dup
    //   998: dload_1
    //   999: dload_3
    //   1000: dload #5
    //   1002: invokespecial <init> : (DDD)V
    //   1005: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   1008: new net/minecraft/resources/ResourceLocation
    //   1011: dup
    //   1012: ldc 'latex:transfur'
    //   1014: invokespecial <init> : (Ljava/lang/String;)V
    //   1017: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   1022: checkcast net/minecraft/sounds/SoundEvent
    //   1025: getstatic net/minecraft/sounds/SoundSource.HOSTILE : Lnet/minecraft/sounds/SoundSource;
    //   1028: fconst_1
    //   1029: fconst_1
    //   1030: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   1033: goto -> 1071
    //   1036: aload #12
    //   1038: dload_1
    //   1039: dload_3
    //   1040: dload #5
    //   1042: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   1045: new net/minecraft/resources/ResourceLocation
    //   1048: dup
    //   1049: ldc 'latex:transfur'
    //   1051: invokespecial <init> : (Ljava/lang/String;)V
    //   1054: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   1059: checkcast net/minecraft/sounds/SoundEvent
    //   1062: getstatic net/minecraft/sounds/SoundSource.HOSTILE : Lnet/minecraft/sounds/SoundSource;
    //   1065: fconst_1
    //   1066: fconst_1
    //   1067: iconst_0
    //   1068: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   1071: aload_0
    //   1072: instanceof net/minecraft/server/level/ServerLevel
    //   1075: ifeq -> 1174
    //   1078: aload_0
    //   1079: checkcast net/minecraft/server/level/ServerLevel
    //   1082: astore #12
    //   1084: new net/mcreator/latexes/entity/DlSquidDogEntity
    //   1087: dup
    //   1088: getstatic net/mcreator/latexes/init/LatexModEntities.DL_SQUID_DOG : Lnet/minecraftforge/registries/RegistryObject;
    //   1091: invokevirtual get : ()Ljava/lang/Object;
    //   1094: checkcast net/minecraft/world/entity/EntityType
    //   1097: aload #12
    //   1099: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   1102: astore #13
    //   1104: aload #13
    //   1106: dload_1
    //   1107: dload_3
    //   1108: dload #5
    //   1110: aload_0
    //   1111: invokeinterface getRandom : ()Ljava/util/Random;
    //   1116: invokevirtual nextFloat : ()F
    //   1119: ldc 360.0
    //   1121: fmul
    //   1122: fconst_0
    //   1123: invokevirtual moveTo : (DDDFF)V
    //   1126: aload #13
    //   1128: instanceof net/minecraft/world/entity/Mob
    //   1131: ifeq -> 1165
    //   1134: aload #13
    //   1136: checkcast net/minecraft/world/entity/Mob
    //   1139: astore #14
    //   1141: aload #14
    //   1143: aload #12
    //   1145: aload_0
    //   1146: aload #13
    //   1148: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   1151: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   1156: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   1159: aconst_null
    //   1160: aconst_null
    //   1161: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   1164: pop
    //   1165: aload_0
    //   1166: aload #13
    //   1168: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   1173: pop
    //   1174: goto -> 3433
    //   1177: aload #7
    //   1179: getfield level : Lnet/minecraft/world/level/Level;
    //   1182: invokevirtual isClientSide : ()Z
    //   1185: ifne -> 1193
    //   1188: aload #7
    //   1190: invokevirtual discard : ()V
    //   1193: aload_0
    //   1194: instanceof net/minecraft/world/level/Level
    //   1197: ifeq -> 1294
    //   1200: aload_0
    //   1201: checkcast net/minecraft/world/level/Level
    //   1204: astore #12
    //   1206: aload #12
    //   1208: invokevirtual isClientSide : ()Z
    //   1211: ifne -> 1259
    //   1214: aload #12
    //   1216: aconst_null
    //   1217: new net/minecraft/core/BlockPos
    //   1220: dup
    //   1221: dload_1
    //   1222: dload_3
    //   1223: dload #5
    //   1225: invokespecial <init> : (DDD)V
    //   1228: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   1231: new net/minecraft/resources/ResourceLocation
    //   1234: dup
    //   1235: ldc 'latex:transfur'
    //   1237: invokespecial <init> : (Ljava/lang/String;)V
    //   1240: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   1245: checkcast net/minecraft/sounds/SoundEvent
    //   1248: getstatic net/minecraft/sounds/SoundSource.HOSTILE : Lnet/minecraft/sounds/SoundSource;
    //   1251: fconst_1
    //   1252: fconst_1
    //   1253: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   1256: goto -> 1294
    //   1259: aload #12
    //   1261: dload_1
    //   1262: dload_3
    //   1263: dload #5
    //   1265: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   1268: new net/minecraft/resources/ResourceLocation
    //   1271: dup
    //   1272: ldc 'latex:transfur'
    //   1274: invokespecial <init> : (Ljava/lang/String;)V
    //   1277: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   1282: checkcast net/minecraft/sounds/SoundEvent
    //   1285: getstatic net/minecraft/sounds/SoundSource.HOSTILE : Lnet/minecraft/sounds/SoundSource;
    //   1288: fconst_1
    //   1289: fconst_1
    //   1290: iconst_0
    //   1291: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   1294: aload_0
    //   1295: instanceof net/minecraft/server/level/ServerLevel
    //   1298: ifeq -> 1397
    //   1301: aload_0
    //   1302: checkcast net/minecraft/server/level/ServerLevel
    //   1305: astore #12
    //   1307: new net/mcreator/latexes/entity/DlsharkEntity
    //   1310: dup
    //   1311: getstatic net/mcreator/latexes/init/LatexModEntities.DLSHARK : Lnet/minecraftforge/registries/RegistryObject;
    //   1314: invokevirtual get : ()Ljava/lang/Object;
    //   1317: checkcast net/minecraft/world/entity/EntityType
    //   1320: aload #12
    //   1322: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   1325: astore #13
    //   1327: aload #13
    //   1329: dload_1
    //   1330: dload_3
    //   1331: dload #5
    //   1333: aload_0
    //   1334: invokeinterface getRandom : ()Ljava/util/Random;
    //   1339: invokevirtual nextFloat : ()F
    //   1342: ldc 360.0
    //   1344: fmul
    //   1345: fconst_0
    //   1346: invokevirtual moveTo : (DDDFF)V
    //   1349: aload #13
    //   1351: instanceof net/minecraft/world/entity/Mob
    //   1354: ifeq -> 1388
    //   1357: aload #13
    //   1359: checkcast net/minecraft/world/entity/Mob
    //   1362: astore #14
    //   1364: aload #14
    //   1366: aload #12
    //   1368: aload_0
    //   1369: aload #13
    //   1371: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   1374: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   1379: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   1382: aconst_null
    //   1383: aconst_null
    //   1384: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   1387: pop
    //   1388: aload_0
    //   1389: aload #13
    //   1391: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   1396: pop
    //   1397: goto -> 3433
    //   1400: aload #7
    //   1402: instanceof net/minecraft/world/entity/animal/Fox
    //   1405: iconst_1
    //   1406: if_icmpne -> 1632
    //   1409: aload #7
    //   1411: getfield level : Lnet/minecraft/world/level/Level;
    //   1414: invokevirtual isClientSide : ()Z
    //   1417: ifne -> 1425
    //   1420: aload #7
    //   1422: invokevirtual discard : ()V
    //   1425: aload_0
    //   1426: instanceof net/minecraft/world/level/Level
    //   1429: ifeq -> 1526
    //   1432: aload_0
    //   1433: checkcast net/minecraft/world/level/Level
    //   1436: astore #12
    //   1438: aload #12
    //   1440: invokevirtual isClientSide : ()Z
    //   1443: ifne -> 1491
    //   1446: aload #12
    //   1448: aconst_null
    //   1449: new net/minecraft/core/BlockPos
    //   1452: dup
    //   1453: dload_1
    //   1454: dload_3
    //   1455: dload #5
    //   1457: invokespecial <init> : (DDD)V
    //   1460: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   1463: new net/minecraft/resources/ResourceLocation
    //   1466: dup
    //   1467: ldc 'latex:transfur'
    //   1469: invokespecial <init> : (Ljava/lang/String;)V
    //   1472: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   1477: checkcast net/minecraft/sounds/SoundEvent
    //   1480: getstatic net/minecraft/sounds/SoundSource.HOSTILE : Lnet/minecraft/sounds/SoundSource;
    //   1483: fconst_1
    //   1484: fconst_1
    //   1485: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   1488: goto -> 1526
    //   1491: aload #12
    //   1493: dload_1
    //   1494: dload_3
    //   1495: dload #5
    //   1497: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   1500: new net/minecraft/resources/ResourceLocation
    //   1503: dup
    //   1504: ldc 'latex:transfur'
    //   1506: invokespecial <init> : (Ljava/lang/String;)V
    //   1509: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   1514: checkcast net/minecraft/sounds/SoundEvent
    //   1517: getstatic net/minecraft/sounds/SoundSource.HOSTILE : Lnet/minecraft/sounds/SoundSource;
    //   1520: fconst_1
    //   1521: fconst_1
    //   1522: iconst_0
    //   1523: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   1526: aload_0
    //   1527: instanceof net/minecraft/server/level/ServerLevel
    //   1530: ifeq -> 1629
    //   1533: aload_0
    //   1534: checkcast net/minecraft/server/level/ServerLevel
    //   1537: astore #12
    //   1539: new net/mcreator/latexes/entity/DarkLatexFoxEntity
    //   1542: dup
    //   1543: getstatic net/mcreator/latexes/init/LatexModEntities.DARK_LATEX_FOX : Lnet/minecraftforge/registries/RegistryObject;
    //   1546: invokevirtual get : ()Ljava/lang/Object;
    //   1549: checkcast net/minecraft/world/entity/EntityType
    //   1552: aload #12
    //   1554: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   1557: astore #13
    //   1559: aload #13
    //   1561: dload_1
    //   1562: dload_3
    //   1563: dload #5
    //   1565: aload_0
    //   1566: invokeinterface getRandom : ()Ljava/util/Random;
    //   1571: invokevirtual nextFloat : ()F
    //   1574: ldc 360.0
    //   1576: fmul
    //   1577: fconst_0
    //   1578: invokevirtual moveTo : (DDDFF)V
    //   1581: aload #13
    //   1583: instanceof net/minecraft/world/entity/Mob
    //   1586: ifeq -> 1620
    //   1589: aload #13
    //   1591: checkcast net/minecraft/world/entity/Mob
    //   1594: astore #14
    //   1596: aload #14
    //   1598: aload #12
    //   1600: aload_0
    //   1601: aload #13
    //   1603: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   1606: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   1611: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   1614: aconst_null
    //   1615: aconst_null
    //   1616: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   1619: pop
    //   1620: aload_0
    //   1621: aload #13
    //   1623: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   1628: pop
    //   1629: goto -> 3433
    //   1632: aload #7
    //   1634: instanceof net/minecraft/world/entity/monster/Skeleton
    //   1637: ifne -> 1648
    //   1640: aload #7
    //   1642: instanceof net/minecraft/world/entity/monster/WitherSkeleton
    //   1645: ifeq -> 1652
    //   1648: iconst_1
    //   1649: goto -> 1653
    //   1652: iconst_0
    //   1653: iconst_1
    //   1654: if_icmpne -> 1880
    //   1657: aload #7
    //   1659: getfield level : Lnet/minecraft/world/level/Level;
    //   1662: invokevirtual isClientSide : ()Z
    //   1665: ifne -> 1673
    //   1668: aload #7
    //   1670: invokevirtual discard : ()V
    //   1673: aload_0
    //   1674: instanceof net/minecraft/world/level/Level
    //   1677: ifeq -> 1774
    //   1680: aload_0
    //   1681: checkcast net/minecraft/world/level/Level
    //   1684: astore #12
    //   1686: aload #12
    //   1688: invokevirtual isClientSide : ()Z
    //   1691: ifne -> 1739
    //   1694: aload #12
    //   1696: aconst_null
    //   1697: new net/minecraft/core/BlockPos
    //   1700: dup
    //   1701: dload_1
    //   1702: dload_3
    //   1703: dload #5
    //   1705: invokespecial <init> : (DDD)V
    //   1708: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   1711: new net/minecraft/resources/ResourceLocation
    //   1714: dup
    //   1715: ldc 'latex:transfur'
    //   1717: invokespecial <init> : (Ljava/lang/String;)V
    //   1720: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   1725: checkcast net/minecraft/sounds/SoundEvent
    //   1728: getstatic net/minecraft/sounds/SoundSource.HOSTILE : Lnet/minecraft/sounds/SoundSource;
    //   1731: fconst_1
    //   1732: fconst_1
    //   1733: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   1736: goto -> 1774
    //   1739: aload #12
    //   1741: dload_1
    //   1742: dload_3
    //   1743: dload #5
    //   1745: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   1748: new net/minecraft/resources/ResourceLocation
    //   1751: dup
    //   1752: ldc 'latex:transfur'
    //   1754: invokespecial <init> : (Ljava/lang/String;)V
    //   1757: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   1762: checkcast net/minecraft/sounds/SoundEvent
    //   1765: getstatic net/minecraft/sounds/SoundSource.HOSTILE : Lnet/minecraft/sounds/SoundSource;
    //   1768: fconst_1
    //   1769: fconst_1
    //   1770: iconst_0
    //   1771: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   1774: aload_0
    //   1775: instanceof net/minecraft/server/level/ServerLevel
    //   1778: ifeq -> 1877
    //   1781: aload_0
    //   1782: checkcast net/minecraft/server/level/ServerLevel
    //   1785: astore #12
    //   1787: new net/mcreator/latexes/entity/DarkLatexSkeletonEntity
    //   1790: dup
    //   1791: getstatic net/mcreator/latexes/init/LatexModEntities.DARK_LATEX_SKELETON : Lnet/minecraftforge/registries/RegistryObject;
    //   1794: invokevirtual get : ()Ljava/lang/Object;
    //   1797: checkcast net/minecraft/world/entity/EntityType
    //   1800: aload #12
    //   1802: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   1805: astore #13
    //   1807: aload #13
    //   1809: dload_1
    //   1810: dload_3
    //   1811: dload #5
    //   1813: aload_0
    //   1814: invokeinterface getRandom : ()Ljava/util/Random;
    //   1819: invokevirtual nextFloat : ()F
    //   1822: ldc 360.0
    //   1824: fmul
    //   1825: fconst_0
    //   1826: invokevirtual moveTo : (DDDFF)V
    //   1829: aload #13
    //   1831: instanceof net/minecraft/world/entity/Mob
    //   1834: ifeq -> 1868
    //   1837: aload #13
    //   1839: checkcast net/minecraft/world/entity/Mob
    //   1842: astore #14
    //   1844: aload #14
    //   1846: aload #12
    //   1848: aload_0
    //   1849: aload #13
    //   1851: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   1854: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   1859: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   1862: aconst_null
    //   1863: aconst_null
    //   1864: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   1867: pop
    //   1868: aload_0
    //   1869: aload #13
    //   1871: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   1876: pop
    //   1877: goto -> 3433
    //   1880: aload #7
    //   1882: instanceof net/minecraft/world/entity/animal/Bee
    //   1885: iconst_1
    //   1886: if_icmpne -> 2112
    //   1889: aload #7
    //   1891: getfield level : Lnet/minecraft/world/level/Level;
    //   1894: invokevirtual isClientSide : ()Z
    //   1897: ifne -> 1905
    //   1900: aload #7
    //   1902: invokevirtual discard : ()V
    //   1905: aload_0
    //   1906: instanceof net/minecraft/world/level/Level
    //   1909: ifeq -> 2006
    //   1912: aload_0
    //   1913: checkcast net/minecraft/world/level/Level
    //   1916: astore #12
    //   1918: aload #12
    //   1920: invokevirtual isClientSide : ()Z
    //   1923: ifne -> 1971
    //   1926: aload #12
    //   1928: aconst_null
    //   1929: new net/minecraft/core/BlockPos
    //   1932: dup
    //   1933: dload_1
    //   1934: dload_3
    //   1935: dload #5
    //   1937: invokespecial <init> : (DDD)V
    //   1940: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   1943: new net/minecraft/resources/ResourceLocation
    //   1946: dup
    //   1947: ldc 'latex:transfur'
    //   1949: invokespecial <init> : (Ljava/lang/String;)V
    //   1952: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   1957: checkcast net/minecraft/sounds/SoundEvent
    //   1960: getstatic net/minecraft/sounds/SoundSource.HOSTILE : Lnet/minecraft/sounds/SoundSource;
    //   1963: fconst_1
    //   1964: fconst_1
    //   1965: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   1968: goto -> 2006
    //   1971: aload #12
    //   1973: dload_1
    //   1974: dload_3
    //   1975: dload #5
    //   1977: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   1980: new net/minecraft/resources/ResourceLocation
    //   1983: dup
    //   1984: ldc 'latex:transfur'
    //   1986: invokespecial <init> : (Ljava/lang/String;)V
    //   1989: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   1994: checkcast net/minecraft/sounds/SoundEvent
    //   1997: getstatic net/minecraft/sounds/SoundSource.HOSTILE : Lnet/minecraft/sounds/SoundSource;
    //   2000: fconst_1
    //   2001: fconst_1
    //   2002: iconst_0
    //   2003: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   2006: aload_0
    //   2007: instanceof net/minecraft/server/level/ServerLevel
    //   2010: ifeq -> 2109
    //   2013: aload_0
    //   2014: checkcast net/minecraft/server/level/ServerLevel
    //   2017: astore #12
    //   2019: new net/mcreator/latexes/entity/DLbeeEntity
    //   2022: dup
    //   2023: getstatic net/mcreator/latexes/init/LatexModEntities.D_LBEE : Lnet/minecraftforge/registries/RegistryObject;
    //   2026: invokevirtual get : ()Ljava/lang/Object;
    //   2029: checkcast net/minecraft/world/entity/EntityType
    //   2032: aload #12
    //   2034: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   2037: astore #13
    //   2039: aload #13
    //   2041: dload_1
    //   2042: dload_3
    //   2043: dload #5
    //   2045: aload_0
    //   2046: invokeinterface getRandom : ()Ljava/util/Random;
    //   2051: invokevirtual nextFloat : ()F
    //   2054: ldc 360.0
    //   2056: fmul
    //   2057: fconst_0
    //   2058: invokevirtual moveTo : (DDDFF)V
    //   2061: aload #13
    //   2063: instanceof net/minecraft/world/entity/Mob
    //   2066: ifeq -> 2100
    //   2069: aload #13
    //   2071: checkcast net/minecraft/world/entity/Mob
    //   2074: astore #14
    //   2076: aload #14
    //   2078: aload #12
    //   2080: aload_0
    //   2081: aload #13
    //   2083: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   2086: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   2091: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   2094: aconst_null
    //   2095: aconst_null
    //   2096: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   2099: pop
    //   2100: aload_0
    //   2101: aload #13
    //   2103: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   2108: pop
    //   2109: goto -> 3433
    //   2112: aload #7
    //   2114: instanceof net/mcreator/latexes/entity/ScientistEntity
    //   2117: ifne -> 2136
    //   2120: aload #7
    //   2122: instanceof net/mcreator/latexes/entity/EvilScientistEntity
    //   2125: ifne -> 2136
    //   2128: aload #7
    //   2130: instanceof net/mcreator/latexes/entity/EvilSniperEntity
    //   2133: ifeq -> 2475
    //   2136: aload #7
    //   2138: getfield level : Lnet/minecraft/world/level/Level;
    //   2141: invokevirtual isClientSide : ()Z
    //   2144: ifne -> 2152
    //   2147: aload #7
    //   2149: invokevirtual discard : ()V
    //   2152: aload_0
    //   2153: instanceof net/minecraft/world/level/Level
    //   2156: ifeq -> 2253
    //   2159: aload_0
    //   2160: checkcast net/minecraft/world/level/Level
    //   2163: astore #12
    //   2165: aload #12
    //   2167: invokevirtual isClientSide : ()Z
    //   2170: ifne -> 2218
    //   2173: aload #12
    //   2175: aconst_null
    //   2176: new net/minecraft/core/BlockPos
    //   2179: dup
    //   2180: dload_1
    //   2181: dload_3
    //   2182: dload #5
    //   2184: invokespecial <init> : (DDD)V
    //   2187: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   2190: new net/minecraft/resources/ResourceLocation
    //   2193: dup
    //   2194: ldc 'latex:transfur'
    //   2196: invokespecial <init> : (Ljava/lang/String;)V
    //   2199: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   2204: checkcast net/minecraft/sounds/SoundEvent
    //   2207: getstatic net/minecraft/sounds/SoundSource.HOSTILE : Lnet/minecraft/sounds/SoundSource;
    //   2210: fconst_1
    //   2211: fconst_1
    //   2212: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   2215: goto -> 2253
    //   2218: aload #12
    //   2220: dload_1
    //   2221: dload_3
    //   2222: dload #5
    //   2224: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   2227: new net/minecraft/resources/ResourceLocation
    //   2230: dup
    //   2231: ldc 'latex:transfur'
    //   2233: invokespecial <init> : (Ljava/lang/String;)V
    //   2236: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   2241: checkcast net/minecraft/sounds/SoundEvent
    //   2244: getstatic net/minecraft/sounds/SoundSource.HOSTILE : Lnet/minecraft/sounds/SoundSource;
    //   2247: fconst_1
    //   2248: fconst_1
    //   2249: iconst_0
    //   2250: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   2253: invokestatic random : ()D
    //   2256: ldc2_w 0.2
    //   2259: dcmpg
    //   2260: ifge -> 2369
    //   2263: aload_0
    //   2264: instanceof net/minecraft/server/level/ServerLevel
    //   2267: ifeq -> 2366
    //   2270: aload_0
    //   2271: checkcast net/minecraft/server/level/ServerLevel
    //   2274: astore #12
    //   2276: new net/mcreator/latexes/entity/DarkLatexFoxSniperEntity
    //   2279: dup
    //   2280: getstatic net/mcreator/latexes/init/LatexModEntities.DARK_LATEX_FOX_SNIPER : Lnet/minecraftforge/registries/RegistryObject;
    //   2283: invokevirtual get : ()Ljava/lang/Object;
    //   2286: checkcast net/minecraft/world/entity/EntityType
    //   2289: aload #12
    //   2291: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   2294: astore #13
    //   2296: aload #13
    //   2298: dload_1
    //   2299: dload_3
    //   2300: dload #5
    //   2302: aload_0
    //   2303: invokeinterface getRandom : ()Ljava/util/Random;
    //   2308: invokevirtual nextFloat : ()F
    //   2311: ldc 360.0
    //   2313: fmul
    //   2314: fconst_0
    //   2315: invokevirtual moveTo : (DDDFF)V
    //   2318: aload #13
    //   2320: instanceof net/minecraft/world/entity/Mob
    //   2323: ifeq -> 2357
    //   2326: aload #13
    //   2328: checkcast net/minecraft/world/entity/Mob
    //   2331: astore #14
    //   2333: aload #14
    //   2335: aload #12
    //   2337: aload_0
    //   2338: aload #13
    //   2340: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   2343: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   2348: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   2351: aconst_null
    //   2352: aconst_null
    //   2353: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   2356: pop
    //   2357: aload_0
    //   2358: aload #13
    //   2360: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   2365: pop
    //   2366: goto -> 3433
    //   2369: aload_0
    //   2370: instanceof net/minecraft/server/level/ServerLevel
    //   2373: ifeq -> 2472
    //   2376: aload_0
    //   2377: checkcast net/minecraft/server/level/ServerLevel
    //   2380: astore #12
    //   2382: new net/mcreator/latexes/entity/DarkLatexFoxScientistEntity
    //   2385: dup
    //   2386: getstatic net/mcreator/latexes/init/LatexModEntities.DARK_LATEX_FOX_SCIENTIST : Lnet/minecraftforge/registries/RegistryObject;
    //   2389: invokevirtual get : ()Ljava/lang/Object;
    //   2392: checkcast net/minecraft/world/entity/EntityType
    //   2395: aload #12
    //   2397: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   2400: astore #13
    //   2402: aload #13
    //   2404: dload_1
    //   2405: dload_3
    //   2406: dload #5
    //   2408: aload_0
    //   2409: invokeinterface getRandom : ()Ljava/util/Random;
    //   2414: invokevirtual nextFloat : ()F
    //   2417: ldc 360.0
    //   2419: fmul
    //   2420: fconst_0
    //   2421: invokevirtual moveTo : (DDDFF)V
    //   2424: aload #13
    //   2426: instanceof net/minecraft/world/entity/Mob
    //   2429: ifeq -> 2463
    //   2432: aload #13
    //   2434: checkcast net/minecraft/world/entity/Mob
    //   2437: astore #14
    //   2439: aload #14
    //   2441: aload #12
    //   2443: aload_0
    //   2444: aload #13
    //   2446: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   2449: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   2454: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   2457: aconst_null
    //   2458: aconst_null
    //   2459: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   2462: pop
    //   2463: aload_0
    //   2464: aload #13
    //   2466: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   2471: pop
    //   2472: goto -> 3433
    //   2475: aload #7
    //   2477: instanceof net/minecraft/world/entity/monster/Creeper
    //   2480: ifeq -> 2706
    //   2483: aload #7
    //   2485: getfield level : Lnet/minecraft/world/level/Level;
    //   2488: invokevirtual isClientSide : ()Z
    //   2491: ifne -> 2499
    //   2494: aload #7
    //   2496: invokevirtual discard : ()V
    //   2499: aload_0
    //   2500: instanceof net/minecraft/world/level/Level
    //   2503: ifeq -> 2600
    //   2506: aload_0
    //   2507: checkcast net/minecraft/world/level/Level
    //   2510: astore #12
    //   2512: aload #12
    //   2514: invokevirtual isClientSide : ()Z
    //   2517: ifne -> 2565
    //   2520: aload #12
    //   2522: aconst_null
    //   2523: new net/minecraft/core/BlockPos
    //   2526: dup
    //   2527: dload_1
    //   2528: dload_3
    //   2529: dload #5
    //   2531: invokespecial <init> : (DDD)V
    //   2534: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   2537: new net/minecraft/resources/ResourceLocation
    //   2540: dup
    //   2541: ldc 'latex:transfur'
    //   2543: invokespecial <init> : (Ljava/lang/String;)V
    //   2546: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   2551: checkcast net/minecraft/sounds/SoundEvent
    //   2554: getstatic net/minecraft/sounds/SoundSource.HOSTILE : Lnet/minecraft/sounds/SoundSource;
    //   2557: fconst_1
    //   2558: fconst_1
    //   2559: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   2562: goto -> 2600
    //   2565: aload #12
    //   2567: dload_1
    //   2568: dload_3
    //   2569: dload #5
    //   2571: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   2574: new net/minecraft/resources/ResourceLocation
    //   2577: dup
    //   2578: ldc 'latex:transfur'
    //   2580: invokespecial <init> : (Ljava/lang/String;)V
    //   2583: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   2588: checkcast net/minecraft/sounds/SoundEvent
    //   2591: getstatic net/minecraft/sounds/SoundSource.HOSTILE : Lnet/minecraft/sounds/SoundSource;
    //   2594: fconst_1
    //   2595: fconst_1
    //   2596: iconst_0
    //   2597: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   2600: aload_0
    //   2601: instanceof net/minecraft/server/level/ServerLevel
    //   2604: ifeq -> 2703
    //   2607: aload_0
    //   2608: checkcast net/minecraft/server/level/ServerLevel
    //   2611: astore #12
    //   2613: new net/mcreator/latexes/entity/DarkLatexCreeperEntity
    //   2616: dup
    //   2617: getstatic net/mcreator/latexes/init/LatexModEntities.DARK_LATEX_CREEPER : Lnet/minecraftforge/registries/RegistryObject;
    //   2620: invokevirtual get : ()Ljava/lang/Object;
    //   2623: checkcast net/minecraft/world/entity/EntityType
    //   2626: aload #12
    //   2628: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   2631: astore #13
    //   2633: aload #13
    //   2635: dload_1
    //   2636: dload_3
    //   2637: dload #5
    //   2639: aload_0
    //   2640: invokeinterface getRandom : ()Ljava/util/Random;
    //   2645: invokevirtual nextFloat : ()F
    //   2648: ldc 360.0
    //   2650: fmul
    //   2651: fconst_0
    //   2652: invokevirtual moveTo : (DDDFF)V
    //   2655: aload #13
    //   2657: instanceof net/minecraft/world/entity/Mob
    //   2660: ifeq -> 2694
    //   2663: aload #13
    //   2665: checkcast net/minecraft/world/entity/Mob
    //   2668: astore #14
    //   2670: aload #14
    //   2672: aload #12
    //   2674: aload_0
    //   2675: aload #13
    //   2677: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   2680: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   2685: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   2688: aconst_null
    //   2689: aconst_null
    //   2690: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   2693: pop
    //   2694: aload_0
    //   2695: aload #13
    //   2697: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   2702: pop
    //   2703: goto -> 3433
    //   2706: aload #7
    //   2708: invokevirtual getType : ()Lnet/minecraft/world/entity/EntityType;
    //   2711: getstatic net/minecraft/core/Registry.ENTITY_TYPE_REGISTRY : Lnet/minecraft/resources/ResourceKey;
    //   2714: new net/minecraft/resources/ResourceLocation
    //   2717: dup
    //   2718: ldc_w 'latex:darklatexes'
    //   2721: invokespecial <init> : (Ljava/lang/String;)V
    //   2724: invokestatic create : (Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraft/tags/TagKey;
    //   2727: invokevirtual is : (Lnet/minecraft/tags/TagKey;)Z
    //   2730: iconst_1
    //   2731: if_icmpeq -> 3433
    //   2734: invokestatic random : ()D
    //   2737: ldc2_w 0.1
    //   2740: dcmpg
    //   2741: ifge -> 2967
    //   2744: aload #7
    //   2746: getfield level : Lnet/minecraft/world/level/Level;
    //   2749: invokevirtual isClientSide : ()Z
    //   2752: ifne -> 2760
    //   2755: aload #7
    //   2757: invokevirtual discard : ()V
    //   2760: aload_0
    //   2761: instanceof net/minecraft/world/level/Level
    //   2764: ifeq -> 2861
    //   2767: aload_0
    //   2768: checkcast net/minecraft/world/level/Level
    //   2771: astore #12
    //   2773: aload #12
    //   2775: invokevirtual isClientSide : ()Z
    //   2778: ifne -> 2826
    //   2781: aload #12
    //   2783: aconst_null
    //   2784: new net/minecraft/core/BlockPos
    //   2787: dup
    //   2788: dload_1
    //   2789: dload_3
    //   2790: dload #5
    //   2792: invokespecial <init> : (DDD)V
    //   2795: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   2798: new net/minecraft/resources/ResourceLocation
    //   2801: dup
    //   2802: ldc 'latex:transfur'
    //   2804: invokespecial <init> : (Ljava/lang/String;)V
    //   2807: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   2812: checkcast net/minecraft/sounds/SoundEvent
    //   2815: getstatic net/minecraft/sounds/SoundSource.HOSTILE : Lnet/minecraft/sounds/SoundSource;
    //   2818: fconst_1
    //   2819: fconst_1
    //   2820: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   2823: goto -> 2861
    //   2826: aload #12
    //   2828: dload_1
    //   2829: dload_3
    //   2830: dload #5
    //   2832: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   2835: new net/minecraft/resources/ResourceLocation
    //   2838: dup
    //   2839: ldc 'latex:transfur'
    //   2841: invokespecial <init> : (Ljava/lang/String;)V
    //   2844: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   2849: checkcast net/minecraft/sounds/SoundEvent
    //   2852: getstatic net/minecraft/sounds/SoundSource.HOSTILE : Lnet/minecraft/sounds/SoundSource;
    //   2855: fconst_1
    //   2856: fconst_1
    //   2857: iconst_0
    //   2858: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   2861: aload_0
    //   2862: instanceof net/minecraft/server/level/ServerLevel
    //   2865: ifeq -> 2964
    //   2868: aload_0
    //   2869: checkcast net/minecraft/server/level/ServerLevel
    //   2872: astore #12
    //   2874: new net/mcreator/latexes/entity/YufengEntity
    //   2877: dup
    //   2878: getstatic net/mcreator/latexes/init/LatexModEntities.YUFENG : Lnet/minecraftforge/registries/RegistryObject;
    //   2881: invokevirtual get : ()Ljava/lang/Object;
    //   2884: checkcast net/minecraft/world/entity/EntityType
    //   2887: aload #12
    //   2889: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   2892: astore #13
    //   2894: aload #13
    //   2896: dload_1
    //   2897: dload_3
    //   2898: dload #5
    //   2900: aload_0
    //   2901: invokeinterface getRandom : ()Ljava/util/Random;
    //   2906: invokevirtual nextFloat : ()F
    //   2909: ldc 360.0
    //   2911: fmul
    //   2912: fconst_0
    //   2913: invokevirtual moveTo : (DDDFF)V
    //   2916: aload #13
    //   2918: instanceof net/minecraft/world/entity/Mob
    //   2921: ifeq -> 2955
    //   2924: aload #13
    //   2926: checkcast net/minecraft/world/entity/Mob
    //   2929: astore #14
    //   2931: aload #14
    //   2933: aload #12
    //   2935: aload_0
    //   2936: aload #13
    //   2938: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   2941: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   2946: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   2949: aconst_null
    //   2950: aconst_null
    //   2951: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   2954: pop
    //   2955: aload_0
    //   2956: aload #13
    //   2958: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   2963: pop
    //   2964: goto -> 3433
    //   2967: invokestatic random : ()D
    //   2970: ldc2_w 0.1
    //   2973: dcmpg
    //   2974: ifge -> 3200
    //   2977: aload #7
    //   2979: getfield level : Lnet/minecraft/world/level/Level;
    //   2982: invokevirtual isClientSide : ()Z
    //   2985: ifne -> 2993
    //   2988: aload #7
    //   2990: invokevirtual discard : ()V
    //   2993: aload_0
    //   2994: instanceof net/minecraft/world/level/Level
    //   2997: ifeq -> 3094
    //   3000: aload_0
    //   3001: checkcast net/minecraft/world/level/Level
    //   3004: astore #12
    //   3006: aload #12
    //   3008: invokevirtual isClientSide : ()Z
    //   3011: ifne -> 3059
    //   3014: aload #12
    //   3016: aconst_null
    //   3017: new net/minecraft/core/BlockPos
    //   3020: dup
    //   3021: dload_1
    //   3022: dload_3
    //   3023: dload #5
    //   3025: invokespecial <init> : (DDD)V
    //   3028: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   3031: new net/minecraft/resources/ResourceLocation
    //   3034: dup
    //   3035: ldc 'latex:transfur'
    //   3037: invokespecial <init> : (Ljava/lang/String;)V
    //   3040: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   3045: checkcast net/minecraft/sounds/SoundEvent
    //   3048: getstatic net/minecraft/sounds/SoundSource.HOSTILE : Lnet/minecraft/sounds/SoundSource;
    //   3051: fconst_1
    //   3052: fconst_1
    //   3053: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   3056: goto -> 3094
    //   3059: aload #12
    //   3061: dload_1
    //   3062: dload_3
    //   3063: dload #5
    //   3065: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   3068: new net/minecraft/resources/ResourceLocation
    //   3071: dup
    //   3072: ldc 'latex:transfur'
    //   3074: invokespecial <init> : (Ljava/lang/String;)V
    //   3077: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   3082: checkcast net/minecraft/sounds/SoundEvent
    //   3085: getstatic net/minecraft/sounds/SoundSource.HOSTILE : Lnet/minecraft/sounds/SoundSource;
    //   3088: fconst_1
    //   3089: fconst_1
    //   3090: iconst_0
    //   3091: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   3094: aload_0
    //   3095: instanceof net/minecraft/server/level/ServerLevel
    //   3098: ifeq -> 3197
    //   3101: aload_0
    //   3102: checkcast net/minecraft/server/level/ServerLevel
    //   3105: astore #12
    //   3107: new net/mcreator/latexes/entity/DarkLatexCentaurEntity
    //   3110: dup
    //   3111: getstatic net/mcreator/latexes/init/LatexModEntities.DARK_LATEX_CENTAUR : Lnet/minecraftforge/registries/RegistryObject;
    //   3114: invokevirtual get : ()Ljava/lang/Object;
    //   3117: checkcast net/minecraft/world/entity/EntityType
    //   3120: aload #12
    //   3122: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   3125: astore #13
    //   3127: aload #13
    //   3129: dload_1
    //   3130: dload_3
    //   3131: dload #5
    //   3133: aload_0
    //   3134: invokeinterface getRandom : ()Ljava/util/Random;
    //   3139: invokevirtual nextFloat : ()F
    //   3142: ldc 360.0
    //   3144: fmul
    //   3145: fconst_0
    //   3146: invokevirtual moveTo : (DDDFF)V
    //   3149: aload #13
    //   3151: instanceof net/minecraft/world/entity/Mob
    //   3154: ifeq -> 3188
    //   3157: aload #13
    //   3159: checkcast net/minecraft/world/entity/Mob
    //   3162: astore #14
    //   3164: aload #14
    //   3166: aload #12
    //   3168: aload_0
    //   3169: aload #13
    //   3171: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   3174: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   3179: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   3182: aconst_null
    //   3183: aconst_null
    //   3184: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   3187: pop
    //   3188: aload_0
    //   3189: aload #13
    //   3191: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   3196: pop
    //   3197: goto -> 3433
    //   3200: aload #7
    //   3202: getfield level : Lnet/minecraft/world/level/Level;
    //   3205: invokevirtual isClientSide : ()Z
    //   3208: ifne -> 3216
    //   3211: aload #7
    //   3213: invokevirtual discard : ()V
    //   3216: aload_0
    //   3217: instanceof net/minecraft/world/level/Level
    //   3220: ifeq -> 3317
    //   3223: aload_0
    //   3224: checkcast net/minecraft/world/level/Level
    //   3227: astore #12
    //   3229: aload #12
    //   3231: invokevirtual isClientSide : ()Z
    //   3234: ifne -> 3282
    //   3237: aload #12
    //   3239: aconst_null
    //   3240: new net/minecraft/core/BlockPos
    //   3243: dup
    //   3244: dload_1
    //   3245: dload_3
    //   3246: dload #5
    //   3248: invokespecial <init> : (DDD)V
    //   3251: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   3254: new net/minecraft/resources/ResourceLocation
    //   3257: dup
    //   3258: ldc 'latex:transfur'
    //   3260: invokespecial <init> : (Ljava/lang/String;)V
    //   3263: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   3268: checkcast net/minecraft/sounds/SoundEvent
    //   3271: getstatic net/minecraft/sounds/SoundSource.HOSTILE : Lnet/minecraft/sounds/SoundSource;
    //   3274: fconst_1
    //   3275: fconst_1
    //   3276: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   3279: goto -> 3317
    //   3282: aload #12
    //   3284: dload_1
    //   3285: dload_3
    //   3286: dload #5
    //   3288: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   3291: new net/minecraft/resources/ResourceLocation
    //   3294: dup
    //   3295: ldc 'latex:transfur'
    //   3297: invokespecial <init> : (Ljava/lang/String;)V
    //   3300: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   3305: checkcast net/minecraft/sounds/SoundEvent
    //   3308: getstatic net/minecraft/sounds/SoundSource.HOSTILE : Lnet/minecraft/sounds/SoundSource;
    //   3311: fconst_1
    //   3312: fconst_1
    //   3313: iconst_0
    //   3314: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   3317: aload_0
    //   3318: instanceof net/minecraft/server/level/ServerLevel
    //   3321: ifeq -> 3420
    //   3324: aload_0
    //   3325: checkcast net/minecraft/server/level/ServerLevel
    //   3328: astore #12
    //   3330: new net/mcreator/latexes/entity/DarklatexEntity
    //   3333: dup
    //   3334: getstatic net/mcreator/latexes/init/LatexModEntities.DARKLATEX : Lnet/minecraftforge/registries/RegistryObject;
    //   3337: invokevirtual get : ()Ljava/lang/Object;
    //   3340: checkcast net/minecraft/world/entity/EntityType
    //   3343: aload #12
    //   3345: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   3348: astore #13
    //   3350: aload #13
    //   3352: dload_1
    //   3353: dload_3
    //   3354: dload #5
    //   3356: aload_0
    //   3357: invokeinterface getRandom : ()Ljava/util/Random;
    //   3362: invokevirtual nextFloat : ()F
    //   3365: ldc 360.0
    //   3367: fmul
    //   3368: fconst_0
    //   3369: invokevirtual moveTo : (DDDFF)V
    //   3372: aload #13
    //   3374: instanceof net/minecraft/world/entity/Mob
    //   3377: ifeq -> 3411
    //   3380: aload #13
    //   3382: checkcast net/minecraft/world/entity/Mob
    //   3385: astore #14
    //   3387: aload #14
    //   3389: aload #12
    //   3391: aload_0
    //   3392: aload #13
    //   3394: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   3397: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   3402: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   3405: aconst_null
    //   3406: aconst_null
    //   3407: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   3410: pop
    //   3411: aload_0
    //   3412: aload #13
    //   3414: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   3419: pop
    //   3420: goto -> 3433
    //   3423: aload #7
    //   3425: instanceof net/minecraft/world/entity/player/Player
    //   3428: ifeq -> 3433
    //   3431: iconst_1
    //   3432: ireturn
    //   3433: iconst_0
    //   3434: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #49	-> 0
    //   #50	-> 5
    //   #51	-> 7
    //   #52	-> 28
    //   #53	-> 57
    //   #54	-> 69
    //   #55	-> 98
    //   #56	-> 110
    //   #57	-> 139
    //   #58	-> 151
    //   #59	-> 180
    //   #60	-> 201
    //   #62	-> 235
    //   #63	-> 237
    //   #64	-> 246
    //   #65	-> 256
    //   #66	-> 267
    //   #67	-> 272
    //   #68	-> 285
    //   #69	-> 293
    //   #70	-> 319
    //   #69	-> 332
    //   #72	-> 338
    //   #76	-> 373
    //   #77	-> 386
    //   #78	-> 406
    //   #79	-> 428
    //   #80	-> 443
    //   #82	-> 467
    //   #83	-> 476
    //   #84	-> 479
    //   #85	-> 489
    //   #86	-> 500
    //   #87	-> 505
    //   #88	-> 518
    //   #89	-> 526
    //   #90	-> 552
    //   #89	-> 565
    //   #92	-> 571
    //   #96	-> 606
    //   #97	-> 619
    //   #98	-> 639
    //   #99	-> 661
    //   #100	-> 676
    //   #102	-> 700
    //   #103	-> 709
    //   #105	-> 712
    //   #106	-> 723
    //   #107	-> 728
    //   #108	-> 741
    //   #109	-> 749
    //   #110	-> 775
    //   #109	-> 788
    //   #112	-> 794
    //   #116	-> 829
    //   #117	-> 842
    //   #118	-> 862
    //   #119	-> 884
    //   #120	-> 899
    //   #122	-> 923
    //   #123	-> 932
    //   #125	-> 935
    //   #126	-> 944
    //   #127	-> 954
    //   #128	-> 965
    //   #129	-> 970
    //   #130	-> 983
    //   #131	-> 991
    //   #132	-> 1017
    //   #131	-> 1030
    //   #134	-> 1036
    //   #138	-> 1071
    //   #139	-> 1084
    //   #140	-> 1104
    //   #141	-> 1126
    //   #142	-> 1141
    //   #144	-> 1165
    //   #145	-> 1174
    //   #147	-> 1177
    //   #148	-> 1188
    //   #149	-> 1193
    //   #150	-> 1206
    //   #151	-> 1214
    //   #152	-> 1240
    //   #151	-> 1253
    //   #154	-> 1259
    //   #158	-> 1294
    //   #159	-> 1307
    //   #160	-> 1327
    //   #161	-> 1349
    //   #162	-> 1364
    //   #164	-> 1388
    //   #165	-> 1397
    //   #167	-> 1400
    //   #168	-> 1409
    //   #169	-> 1420
    //   #170	-> 1425
    //   #171	-> 1438
    //   #172	-> 1446
    //   #173	-> 1472
    //   #172	-> 1485
    //   #175	-> 1491
    //   #179	-> 1526
    //   #180	-> 1539
    //   #181	-> 1559
    //   #182	-> 1581
    //   #183	-> 1596
    //   #185	-> 1620
    //   #186	-> 1629
    //   #187	-> 1632
    //   #188	-> 1657
    //   #189	-> 1668
    //   #190	-> 1673
    //   #191	-> 1686
    //   #192	-> 1694
    //   #193	-> 1720
    //   #192	-> 1733
    //   #195	-> 1739
    //   #199	-> 1774
    //   #200	-> 1787
    //   #201	-> 1807
    //   #202	-> 1829
    //   #203	-> 1844
    //   #205	-> 1868
    //   #206	-> 1877
    //   #207	-> 1880
    //   #208	-> 1889
    //   #209	-> 1900
    //   #210	-> 1905
    //   #211	-> 1918
    //   #212	-> 1926
    //   #213	-> 1952
    //   #212	-> 1965
    //   #215	-> 1971
    //   #219	-> 2006
    //   #220	-> 2019
    //   #221	-> 2039
    //   #222	-> 2061
    //   #223	-> 2076
    //   #225	-> 2100
    //   #226	-> 2109
    //   #227	-> 2112
    //   #228	-> 2136
    //   #229	-> 2147
    //   #230	-> 2152
    //   #231	-> 2165
    //   #232	-> 2173
    //   #233	-> 2199
    //   #232	-> 2212
    //   #235	-> 2218
    //   #239	-> 2253
    //   #240	-> 2263
    //   #241	-> 2276
    //   #242	-> 2296
    //   #243	-> 2318
    //   #244	-> 2333
    //   #246	-> 2357
    //   #247	-> 2366
    //   #249	-> 2369
    //   #250	-> 2382
    //   #251	-> 2402
    //   #252	-> 2424
    //   #253	-> 2439
    //   #255	-> 2463
    //   #256	-> 2472
    //   #258	-> 2475
    //   #259	-> 2483
    //   #260	-> 2494
    //   #261	-> 2499
    //   #262	-> 2512
    //   #263	-> 2520
    //   #264	-> 2546
    //   #263	-> 2559
    //   #266	-> 2565
    //   #270	-> 2600
    //   #271	-> 2613
    //   #272	-> 2633
    //   #273	-> 2655
    //   #274	-> 2670
    //   #276	-> 2694
    //   #277	-> 2703
    //   #278	-> 2706
    //   #279	-> 2734
    //   #280	-> 2744
    //   #281	-> 2755
    //   #282	-> 2760
    //   #283	-> 2773
    //   #284	-> 2781
    //   #285	-> 2807
    //   #284	-> 2820
    //   #287	-> 2826
    //   #291	-> 2861
    //   #292	-> 2874
    //   #293	-> 2894
    //   #294	-> 2916
    //   #295	-> 2931
    //   #297	-> 2955
    //   #298	-> 2964
    //   #299	-> 2967
    //   #300	-> 2977
    //   #301	-> 2988
    //   #302	-> 2993
    //   #303	-> 3006
    //   #304	-> 3014
    //   #305	-> 3040
    //   #304	-> 3053
    //   #307	-> 3059
    //   #311	-> 3094
    //   #312	-> 3107
    //   #313	-> 3127
    //   #314	-> 3149
    //   #315	-> 3164
    //   #317	-> 3188
    //   #318	-> 3197
    //   #320	-> 3200
    //   #321	-> 3211
    //   #322	-> 3216
    //   #323	-> 3229
    //   #324	-> 3237
    //   #325	-> 3263
    //   #324	-> 3276
    //   #327	-> 3282
    //   #331	-> 3317
    //   #332	-> 3330
    //   #333	-> 3350
    //   #334	-> 3372
    //   #335	-> 3387
    //   #337	-> 3411
    //   #338	-> 3420
    //   #341	-> 3423
    //   #342	-> 3431
    //   #345	-> 3433
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   43	11	8	_entGetArmor	Lnet/minecraft/world/entity/LivingEntity;
    //   84	11	9	_entGetArmor	Lnet/minecraft/world/entity/LivingEntity;
    //   125	11	10	_entGetArmor	Lnet/minecraft/world/entity/LivingEntity;
    //   166	11	11	_entGetArmor	Lnet/minecraft/world/entity/LivingEntity;
    //   285	88	12	_level	Lnet/minecraft/world/level/Level;
    //   443	24	14	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   406	70	13	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   386	90	12	_level	Lnet/minecraft/server/level/ServerLevel;
    //   518	88	12	_level	Lnet/minecraft/world/level/Level;
    //   676	24	14	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   639	70	13	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   619	90	12	_level	Lnet/minecraft/server/level/ServerLevel;
    //   741	88	12	_level	Lnet/minecraft/world/level/Level;
    //   899	24	14	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   862	70	13	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   842	90	12	_level	Lnet/minecraft/server/level/ServerLevel;
    //   983	88	12	_level	Lnet/minecraft/world/level/Level;
    //   1141	24	14	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   1104	70	13	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   1084	90	12	_level	Lnet/minecraft/server/level/ServerLevel;
    //   1206	88	12	_level	Lnet/minecraft/world/level/Level;
    //   1364	24	14	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   1327	70	13	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   1307	90	12	_level	Lnet/minecraft/server/level/ServerLevel;
    //   1438	88	12	_level	Lnet/minecraft/world/level/Level;
    //   1596	24	14	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   1559	70	13	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   1539	90	12	_level	Lnet/minecraft/server/level/ServerLevel;
    //   1686	88	12	_level	Lnet/minecraft/world/level/Level;
    //   1844	24	14	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   1807	70	13	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   1787	90	12	_level	Lnet/minecraft/server/level/ServerLevel;
    //   1918	88	12	_level	Lnet/minecraft/world/level/Level;
    //   2076	24	14	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   2039	70	13	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   2019	90	12	_level	Lnet/minecraft/server/level/ServerLevel;
    //   2165	88	12	_level	Lnet/minecraft/world/level/Level;
    //   2333	24	14	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   2296	70	13	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   2276	90	12	_level	Lnet/minecraft/server/level/ServerLevel;
    //   2439	24	14	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   2402	70	13	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   2382	90	12	_level	Lnet/minecraft/server/level/ServerLevel;
    //   2512	88	12	_level	Lnet/minecraft/world/level/Level;
    //   2670	24	14	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   2633	70	13	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   2613	90	12	_level	Lnet/minecraft/server/level/ServerLevel;
    //   2773	88	12	_level	Lnet/minecraft/world/level/Level;
    //   2931	24	14	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   2894	70	13	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   2874	90	12	_level	Lnet/minecraft/server/level/ServerLevel;
    //   3006	88	12	_level	Lnet/minecraft/world/level/Level;
    //   3164	24	14	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   3127	70	13	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   3107	90	12	_level	Lnet/minecraft/server/level/ServerLevel;
    //   3229	88	12	_level	Lnet/minecraft/world/level/Level;
    //   3387	24	14	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   3350	70	13	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   3330	90	12	_level	Lnet/minecraft/server/level/ServerLevel;
    //   0	3435	0	world	Lnet/minecraft/world/level/LevelAccessor;
    //   0	3435	1	x	D
    //   0	3435	3	y	D
    //   0	3435	5	z	D
    //   0	3435	7	entity	Lnet/minecraft/world/entity/Entity;
  }
}


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\DleffecttransfurProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */