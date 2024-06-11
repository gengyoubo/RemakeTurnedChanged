package net.mcreator.latexes.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.LevelAccessor;

public class YufengThisEntityKillsAnotherOneProcedure {
  public static boolean execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
    // Byte code:
    //   0: aload #7
    //   2: ifnull -> 10
    //   5: aload #8
    //   7: ifnonnull -> 12
    //   10: iconst_0
    //   11: ireturn
    //   12: aload_0
    //   13: invokeinterface getLevelData : ()Lnet/minecraft/world/level/storage/LevelData;
    //   18: invokeinterface getGameRules : ()Lnet/minecraft/world/level/GameRules;
    //   23: getstatic net/mcreator/latexes/init/LatexModGameRules.DARKLATEXTRANSFUR : Lnet/minecraft/world/level/GameRules$Key;
    //   26: invokevirtual getBoolean : (Lnet/minecraft/world/level/GameRules$Key;)Z
    //   29: iconst_1
    //   30: if_icmpne -> 1391
    //   33: aload #7
    //   35: instanceof net/minecraft/world/entity/LivingEntity
    //   38: ifeq -> 59
    //   41: aload #7
    //   43: checkcast net/minecraft/world/entity/LivingEntity
    //   46: astore #9
    //   48: aload #9
    //   50: getstatic net/minecraft/world/entity/EquipmentSlot.HEAD : Lnet/minecraft/world/entity/EquipmentSlot;
    //   53: invokevirtual getItemBySlot : (Lnet/minecraft/world/entity/EquipmentSlot;)Lnet/minecraft/world/item/ItemStack;
    //   56: goto -> 62
    //   59: getstatic net/minecraft/world/item/ItemStack.EMPTY : Lnet/minecraft/world/item/ItemStack;
    //   62: invokevirtual getItem : ()Lnet/minecraft/world/item/Item;
    //   65: getstatic net/mcreator/latexes/init/LatexModItems.HAZMAT_HELMET : Lnet/minecraftforge/registries/RegistryObject;
    //   68: invokevirtual get : ()Ljava/lang/Object;
    //   71: if_acmpne -> 201
    //   74: aload #7
    //   76: instanceof net/minecraft/world/entity/LivingEntity
    //   79: ifeq -> 100
    //   82: aload #7
    //   84: checkcast net/minecraft/world/entity/LivingEntity
    //   87: astore #10
    //   89: aload #10
    //   91: getstatic net/minecraft/world/entity/EquipmentSlot.CHEST : Lnet/minecraft/world/entity/EquipmentSlot;
    //   94: invokevirtual getItemBySlot : (Lnet/minecraft/world/entity/EquipmentSlot;)Lnet/minecraft/world/item/ItemStack;
    //   97: goto -> 103
    //   100: getstatic net/minecraft/world/item/ItemStack.EMPTY : Lnet/minecraft/world/item/ItemStack;
    //   103: invokevirtual getItem : ()Lnet/minecraft/world/item/Item;
    //   106: getstatic net/mcreator/latexes/init/LatexModItems.HAZMAT_CHESTPLATE : Lnet/minecraftforge/registries/RegistryObject;
    //   109: invokevirtual get : ()Ljava/lang/Object;
    //   112: if_acmpne -> 201
    //   115: aload #7
    //   117: instanceof net/minecraft/world/entity/LivingEntity
    //   120: ifeq -> 141
    //   123: aload #7
    //   125: checkcast net/minecraft/world/entity/LivingEntity
    //   128: astore #11
    //   130: aload #11
    //   132: getstatic net/minecraft/world/entity/EquipmentSlot.LEGS : Lnet/minecraft/world/entity/EquipmentSlot;
    //   135: invokevirtual getItemBySlot : (Lnet/minecraft/world/entity/EquipmentSlot;)Lnet/minecraft/world/item/ItemStack;
    //   138: goto -> 144
    //   141: getstatic net/minecraft/world/item/ItemStack.EMPTY : Lnet/minecraft/world/item/ItemStack;
    //   144: invokevirtual getItem : ()Lnet/minecraft/world/item/Item;
    //   147: getstatic net/mcreator/latexes/init/LatexModItems.HAZMAT_LEGGINGS : Lnet/minecraftforge/registries/RegistryObject;
    //   150: invokevirtual get : ()Ljava/lang/Object;
    //   153: if_acmpne -> 201
    //   156: aload #7
    //   158: instanceof net/minecraft/world/entity/LivingEntity
    //   161: ifeq -> 182
    //   164: aload #7
    //   166: checkcast net/minecraft/world/entity/LivingEntity
    //   169: astore #12
    //   171: aload #12
    //   173: getstatic net/minecraft/world/entity/EquipmentSlot.FEET : Lnet/minecraft/world/entity/EquipmentSlot;
    //   176: invokevirtual getItemBySlot : (Lnet/minecraft/world/entity/EquipmentSlot;)Lnet/minecraft/world/item/ItemStack;
    //   179: goto -> 185
    //   182: getstatic net/minecraft/world/item/ItemStack.EMPTY : Lnet/minecraft/world/item/ItemStack;
    //   185: invokevirtual getItem : ()Lnet/minecraft/world/item/Item;
    //   188: getstatic net/mcreator/latexes/init/LatexModItems.HAZMAT_BOOTS : Lnet/minecraftforge/registries/RegistryObject;
    //   191: invokevirtual get : ()Ljava/lang/Object;
    //   194: if_acmpne -> 201
    //   197: iconst_1
    //   198: goto -> 202
    //   201: iconst_0
    //   202: iconst_1
    //   203: if_icmpeq -> 1381
    //   206: aload #7
    //   208: invokevirtual getType : ()Lnet/minecraft/world/entity/EntityType;
    //   211: getstatic net/minecraft/core/Registry.ENTITY_TYPE_REGISTRY : Lnet/minecraft/resources/ResourceKey;
    //   214: new net/minecraft/resources/ResourceLocation
    //   217: dup
    //   218: ldc 'minecraft:skeletons'
    //   220: invokespecial <init> : (Ljava/lang/String;)V
    //   223: invokestatic create : (Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraft/tags/TagKey;
    //   226: invokevirtual is : (Lnet/minecraft/tags/TagKey;)Z
    //   229: iconst_1
    //   230: if_icmpne -> 864
    //   233: aload #7
    //   235: getfield level : Lnet/minecraft/world/level/Level;
    //   238: invokevirtual isClientSide : ()Z
    //   241: ifne -> 249
    //   244: aload #7
    //   246: invokevirtual discard : ()V
    //   249: invokestatic random : ()D
    //   252: ldc2_w 0.3
    //   255: dcmpg
    //   256: ifge -> 482
    //   259: aload #8
    //   261: getfield level : Lnet/minecraft/world/level/Level;
    //   264: invokevirtual isClientSide : ()Z
    //   267: ifne -> 275
    //   270: aload #8
    //   272: invokevirtual discard : ()V
    //   275: aload_0
    //   276: instanceof net/minecraft/world/level/Level
    //   279: ifeq -> 376
    //   282: aload_0
    //   283: checkcast net/minecraft/world/level/Level
    //   286: astore #13
    //   288: aload #13
    //   290: invokevirtual isClientSide : ()Z
    //   293: ifne -> 341
    //   296: aload #13
    //   298: aconst_null
    //   299: new net/minecraft/core/BlockPos
    //   302: dup
    //   303: dload_1
    //   304: dload_3
    //   305: dload #5
    //   307: invokespecial <init> : (DDD)V
    //   310: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   313: new net/minecraft/resources/ResourceLocation
    //   316: dup
    //   317: ldc 'latex:transfur'
    //   319: invokespecial <init> : (Ljava/lang/String;)V
    //   322: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   327: checkcast net/minecraft/sounds/SoundEvent
    //   330: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   333: fconst_2
    //   334: fconst_2
    //   335: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   338: goto -> 376
    //   341: aload #13
    //   343: dload_1
    //   344: dload_3
    //   345: dload #5
    //   347: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   350: new net/minecraft/resources/ResourceLocation
    //   353: dup
    //   354: ldc 'latex:transfur'
    //   356: invokespecial <init> : (Ljava/lang/String;)V
    //   359: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   364: checkcast net/minecraft/sounds/SoundEvent
    //   367: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   370: fconst_2
    //   371: fconst_2
    //   372: iconst_0
    //   373: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   376: aload_0
    //   377: instanceof net/minecraft/server/level/ServerLevel
    //   380: ifeq -> 479
    //   383: aload_0
    //   384: checkcast net/minecraft/server/level/ServerLevel
    //   387: astore #13
    //   389: new net/mcreator/latexes/entity/DarkLatexSkeletonEntity
    //   392: dup
    //   393: getstatic net/mcreator/latexes/init/LatexModEntities.DARK_LATEX_SKELETON : Lnet/minecraftforge/registries/RegistryObject;
    //   396: invokevirtual get : ()Ljava/lang/Object;
    //   399: checkcast net/minecraft/world/entity/EntityType
    //   402: aload #13
    //   404: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   407: astore #14
    //   409: aload #14
    //   411: dload_1
    //   412: dload_3
    //   413: dload #5
    //   415: aload_0
    //   416: invokeinterface getRandom : ()Ljava/util/Random;
    //   421: invokevirtual nextFloat : ()F
    //   424: ldc 360.0
    //   426: fmul
    //   427: fconst_0
    //   428: invokevirtual moveTo : (DDDFF)V
    //   431: aload #14
    //   433: instanceof net/minecraft/world/entity/Mob
    //   436: ifeq -> 470
    //   439: aload #14
    //   441: checkcast net/minecraft/world/entity/Mob
    //   444: astore #15
    //   446: aload #15
    //   448: aload #13
    //   450: aload_0
    //   451: aload #14
    //   453: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   456: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   461: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   464: aconst_null
    //   465: aconst_null
    //   466: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   469: pop
    //   470: aload_0
    //   471: aload #14
    //   473: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   478: pop
    //   479: goto -> 1391
    //   482: invokestatic random : ()D
    //   485: ldc2_w 0.02
    //   488: dcmpg
    //   489: ifge -> 715
    //   492: aload #8
    //   494: getfield level : Lnet/minecraft/world/level/Level;
    //   497: invokevirtual isClientSide : ()Z
    //   500: ifne -> 508
    //   503: aload #8
    //   505: invokevirtual discard : ()V
    //   508: aload_0
    //   509: instanceof net/minecraft/world/level/Level
    //   512: ifeq -> 609
    //   515: aload_0
    //   516: checkcast net/minecraft/world/level/Level
    //   519: astore #13
    //   521: aload #13
    //   523: invokevirtual isClientSide : ()Z
    //   526: ifne -> 574
    //   529: aload #13
    //   531: aconst_null
    //   532: new net/minecraft/core/BlockPos
    //   535: dup
    //   536: dload_1
    //   537: dload_3
    //   538: dload #5
    //   540: invokespecial <init> : (DDD)V
    //   543: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   546: new net/minecraft/resources/ResourceLocation
    //   549: dup
    //   550: ldc 'latex:transfur'
    //   552: invokespecial <init> : (Ljava/lang/String;)V
    //   555: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   560: checkcast net/minecraft/sounds/SoundEvent
    //   563: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   566: fconst_2
    //   567: fconst_2
    //   568: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   571: goto -> 609
    //   574: aload #13
    //   576: dload_1
    //   577: dload_3
    //   578: dload #5
    //   580: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   583: new net/minecraft/resources/ResourceLocation
    //   586: dup
    //   587: ldc 'latex:transfur'
    //   589: invokespecial <init> : (Ljava/lang/String;)V
    //   592: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   597: checkcast net/minecraft/sounds/SoundEvent
    //   600: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   603: fconst_2
    //   604: fconst_2
    //   605: iconst_0
    //   606: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   609: aload_0
    //   610: instanceof net/minecraft/server/level/ServerLevel
    //   613: ifeq -> 712
    //   616: aload_0
    //   617: checkcast net/minecraft/server/level/ServerLevel
    //   620: astore #13
    //   622: new net/mcreator/latexes/entity/DarkLatexDragonEntity
    //   625: dup
    //   626: getstatic net/mcreator/latexes/init/LatexModEntities.DARK_LATEX_DRAGON : Lnet/minecraftforge/registries/RegistryObject;
    //   629: invokevirtual get : ()Ljava/lang/Object;
    //   632: checkcast net/minecraft/world/entity/EntityType
    //   635: aload #13
    //   637: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   640: astore #14
    //   642: aload #14
    //   644: dload_1
    //   645: dload_3
    //   646: dload #5
    //   648: aload_0
    //   649: invokeinterface getRandom : ()Ljava/util/Random;
    //   654: invokevirtual nextFloat : ()F
    //   657: ldc 360.0
    //   659: fmul
    //   660: fconst_0
    //   661: invokevirtual moveTo : (DDDFF)V
    //   664: aload #14
    //   666: instanceof net/minecraft/world/entity/Mob
    //   669: ifeq -> 703
    //   672: aload #14
    //   674: checkcast net/minecraft/world/entity/Mob
    //   677: astore #15
    //   679: aload #15
    //   681: aload #13
    //   683: aload_0
    //   684: aload #14
    //   686: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   689: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   694: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   697: aconst_null
    //   698: aconst_null
    //   699: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   702: pop
    //   703: aload_0
    //   704: aload #14
    //   706: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   711: pop
    //   712: goto -> 1391
    //   715: aload_0
    //   716: instanceof net/minecraft/world/level/Level
    //   719: ifeq -> 816
    //   722: aload_0
    //   723: checkcast net/minecraft/world/level/Level
    //   726: astore #13
    //   728: aload #13
    //   730: invokevirtual isClientSide : ()Z
    //   733: ifne -> 781
    //   736: aload #13
    //   738: aconst_null
    //   739: new net/minecraft/core/BlockPos
    //   742: dup
    //   743: dload_1
    //   744: dload_3
    //   745: dload #5
    //   747: invokespecial <init> : (DDD)V
    //   750: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   753: new net/minecraft/resources/ResourceLocation
    //   756: dup
    //   757: ldc 'latex:transfur'
    //   759: invokespecial <init> : (Ljava/lang/String;)V
    //   762: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   767: checkcast net/minecraft/sounds/SoundEvent
    //   770: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   773: fconst_2
    //   774: fconst_2
    //   775: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   778: goto -> 816
    //   781: aload #13
    //   783: dload_1
    //   784: dload_3
    //   785: dload #5
    //   787: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   790: new net/minecraft/resources/ResourceLocation
    //   793: dup
    //   794: ldc 'latex:transfur'
    //   796: invokespecial <init> : (Ljava/lang/String;)V
    //   799: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   804: checkcast net/minecraft/sounds/SoundEvent
    //   807: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   810: fconst_2
    //   811: fconst_2
    //   812: iconst_0
    //   813: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   816: aload #8
    //   818: instanceof net/minecraft/world/entity/LivingEntity
    //   821: ifeq -> 861
    //   824: aload #8
    //   826: checkcast net/minecraft/world/entity/LivingEntity
    //   829: astore #13
    //   831: aload #13
    //   833: aload #7
    //   835: instanceof net/minecraft/world/entity/LivingEntity
    //   838: ifeq -> 856
    //   841: aload #7
    //   843: checkcast net/minecraft/world/entity/LivingEntity
    //   846: astore #14
    //   848: aload #14
    //   850: invokevirtual getMaxHealth : ()F
    //   853: goto -> 858
    //   856: ldc -1.0
    //   858: invokevirtual setHealth : (F)V
    //   861: goto -> 1391
    //   864: aload #7
    //   866: invokevirtual getType : ()Lnet/minecraft/world/entity/EntityType;
    //   869: getstatic net/minecraft/core/Registry.ENTITY_TYPE_REGISTRY : Lnet/minecraft/resources/ResourceKey;
    //   872: new net/minecraft/resources/ResourceLocation
    //   875: dup
    //   876: ldc 'latex:darklatexes'
    //   878: invokespecial <init> : (Ljava/lang/String;)V
    //   881: invokestatic create : (Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraft/tags/TagKey;
    //   884: invokevirtual is : (Lnet/minecraft/tags/TagKey;)Z
    //   887: ifne -> 916
    //   890: aload #7
    //   892: invokevirtual getType : ()Lnet/minecraft/world/entity/EntityType;
    //   895: getstatic net/minecraft/core/Registry.ENTITY_TYPE_REGISTRY : Lnet/minecraft/resources/ResourceKey;
    //   898: new net/minecraft/resources/ResourceLocation
    //   901: dup
    //   902: ldc 'latex:robots'
    //   904: invokespecial <init> : (Ljava/lang/String;)V
    //   907: invokestatic create : (Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraft/tags/TagKey;
    //   910: invokevirtual is : (Lnet/minecraft/tags/TagKey;)Z
    //   913: ifeq -> 920
    //   916: iconst_1
    //   917: goto -> 921
    //   920: iconst_0
    //   921: iconst_1
    //   922: if_icmpeq -> 1391
    //   925: invokestatic random : ()D
    //   928: ldc2_w 0.4
    //   931: dcmpg
    //   932: ifge -> 1158
    //   935: aload #7
    //   937: getfield level : Lnet/minecraft/world/level/Level;
    //   940: invokevirtual isClientSide : ()Z
    //   943: ifne -> 951
    //   946: aload #7
    //   948: invokevirtual discard : ()V
    //   951: aload_0
    //   952: instanceof net/minecraft/world/level/Level
    //   955: ifeq -> 1052
    //   958: aload_0
    //   959: checkcast net/minecraft/world/level/Level
    //   962: astore #13
    //   964: aload #13
    //   966: invokevirtual isClientSide : ()Z
    //   969: ifne -> 1017
    //   972: aload #13
    //   974: aconst_null
    //   975: new net/minecraft/core/BlockPos
    //   978: dup
    //   979: dload_1
    //   980: dload_3
    //   981: dload #5
    //   983: invokespecial <init> : (DDD)V
    //   986: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   989: new net/minecraft/resources/ResourceLocation
    //   992: dup
    //   993: ldc 'latex:transfur'
    //   995: invokespecial <init> : (Ljava/lang/String;)V
    //   998: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   1003: checkcast net/minecraft/sounds/SoundEvent
    //   1006: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   1009: fconst_2
    //   1010: fconst_2
    //   1011: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   1014: goto -> 1052
    //   1017: aload #13
    //   1019: dload_1
    //   1020: dload_3
    //   1021: dload #5
    //   1023: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   1026: new net/minecraft/resources/ResourceLocation
    //   1029: dup
    //   1030: ldc 'latex:transfur'
    //   1032: invokespecial <init> : (Ljava/lang/String;)V
    //   1035: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   1040: checkcast net/minecraft/sounds/SoundEvent
    //   1043: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   1046: fconst_2
    //   1047: fconst_2
    //   1048: iconst_0
    //   1049: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   1052: aload_0
    //   1053: instanceof net/minecraft/server/level/ServerLevel
    //   1056: ifeq -> 1155
    //   1059: aload_0
    //   1060: checkcast net/minecraft/server/level/ServerLevel
    //   1063: astore #13
    //   1065: new net/mcreator/latexes/entity/DarklatexEntity
    //   1068: dup
    //   1069: getstatic net/mcreator/latexes/init/LatexModEntities.DARKLATEX : Lnet/minecraftforge/registries/RegistryObject;
    //   1072: invokevirtual get : ()Ljava/lang/Object;
    //   1075: checkcast net/minecraft/world/entity/EntityType
    //   1078: aload #13
    //   1080: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   1083: astore #14
    //   1085: aload #14
    //   1087: dload_1
    //   1088: dload_3
    //   1089: dload #5
    //   1091: aload_0
    //   1092: invokeinterface getRandom : ()Ljava/util/Random;
    //   1097: invokevirtual nextFloat : ()F
    //   1100: ldc 360.0
    //   1102: fmul
    //   1103: fconst_0
    //   1104: invokevirtual moveTo : (DDDFF)V
    //   1107: aload #14
    //   1109: instanceof net/minecraft/world/entity/Mob
    //   1112: ifeq -> 1146
    //   1115: aload #14
    //   1117: checkcast net/minecraft/world/entity/Mob
    //   1120: astore #15
    //   1122: aload #15
    //   1124: aload #13
    //   1126: aload_0
    //   1127: aload #14
    //   1129: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   1132: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   1137: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   1140: aconst_null
    //   1141: aconst_null
    //   1142: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   1145: pop
    //   1146: aload_0
    //   1147: aload #14
    //   1149: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   1154: pop
    //   1155: goto -> 1391
    //   1158: aload #7
    //   1160: getfield level : Lnet/minecraft/world/level/Level;
    //   1163: invokevirtual isClientSide : ()Z
    //   1166: ifne -> 1174
    //   1169: aload #7
    //   1171: invokevirtual discard : ()V
    //   1174: aload_0
    //   1175: instanceof net/minecraft/world/level/Level
    //   1178: ifeq -> 1275
    //   1181: aload_0
    //   1182: checkcast net/minecraft/world/level/Level
    //   1185: astore #13
    //   1187: aload #13
    //   1189: invokevirtual isClientSide : ()Z
    //   1192: ifne -> 1240
    //   1195: aload #13
    //   1197: aconst_null
    //   1198: new net/minecraft/core/BlockPos
    //   1201: dup
    //   1202: dload_1
    //   1203: dload_3
    //   1204: dload #5
    //   1206: invokespecial <init> : (DDD)V
    //   1209: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   1212: new net/minecraft/resources/ResourceLocation
    //   1215: dup
    //   1216: ldc 'latex:transfur'
    //   1218: invokespecial <init> : (Ljava/lang/String;)V
    //   1221: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   1226: checkcast net/minecraft/sounds/SoundEvent
    //   1229: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   1232: fconst_1
    //   1233: fconst_1
    //   1234: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   1237: goto -> 1275
    //   1240: aload #13
    //   1242: dload_1
    //   1243: dload_3
    //   1244: dload #5
    //   1246: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   1249: new net/minecraft/resources/ResourceLocation
    //   1252: dup
    //   1253: ldc 'latex:transfur'
    //   1255: invokespecial <init> : (Ljava/lang/String;)V
    //   1258: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   1263: checkcast net/minecraft/sounds/SoundEvent
    //   1266: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   1269: fconst_1
    //   1270: fconst_1
    //   1271: iconst_0
    //   1272: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   1275: aload_0
    //   1276: instanceof net/minecraft/server/level/ServerLevel
    //   1279: ifeq -> 1378
    //   1282: aload_0
    //   1283: checkcast net/minecraft/server/level/ServerLevel
    //   1286: astore #13
    //   1288: new net/mcreator/latexes/entity/YufengEntity
    //   1291: dup
    //   1292: getstatic net/mcreator/latexes/init/LatexModEntities.YUFENG : Lnet/minecraftforge/registries/RegistryObject;
    //   1295: invokevirtual get : ()Ljava/lang/Object;
    //   1298: checkcast net/minecraft/world/entity/EntityType
    //   1301: aload #13
    //   1303: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   1306: astore #14
    //   1308: aload #14
    //   1310: dload_1
    //   1311: dload_3
    //   1312: dload #5
    //   1314: aload_0
    //   1315: invokeinterface getRandom : ()Ljava/util/Random;
    //   1320: invokevirtual nextFloat : ()F
    //   1323: ldc 360.0
    //   1325: fmul
    //   1326: fconst_0
    //   1327: invokevirtual moveTo : (DDDFF)V
    //   1330: aload #14
    //   1332: instanceof net/minecraft/world/entity/Mob
    //   1335: ifeq -> 1369
    //   1338: aload #14
    //   1340: checkcast net/minecraft/world/entity/Mob
    //   1343: astore #15
    //   1345: aload #15
    //   1347: aload #13
    //   1349: aload_0
    //   1350: aload #14
    //   1352: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   1355: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   1360: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   1363: aconst_null
    //   1364: aconst_null
    //   1365: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   1368: pop
    //   1369: aload_0
    //   1370: aload #14
    //   1372: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   1377: pop
    //   1378: goto -> 1391
    //   1381: aload #7
    //   1383: instanceof net/minecraft/world/entity/player/Player
    //   1386: ifeq -> 1391
    //   1389: iconst_1
    //   1390: ireturn
    //   1391: iconst_0
    //   1392: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #31	-> 0
    //   #32	-> 10
    //   #33	-> 12
    //   #34	-> 33
    //   #35	-> 62
    //   #36	-> 74
    //   #37	-> 103
    //   #38	-> 115
    //   #39	-> 144
    //   #40	-> 156
    //   #41	-> 185
    //   #42	-> 206
    //   #43	-> 233
    //   #44	-> 244
    //   #45	-> 249
    //   #46	-> 259
    //   #47	-> 270
    //   #48	-> 275
    //   #49	-> 288
    //   #50	-> 296
    //   #51	-> 322
    //   #50	-> 335
    //   #53	-> 341
    //   #57	-> 376
    //   #58	-> 389
    //   #59	-> 409
    //   #60	-> 431
    //   #61	-> 446
    //   #63	-> 470
    //   #64	-> 479
    //   #65	-> 482
    //   #66	-> 492
    //   #67	-> 503
    //   #68	-> 508
    //   #69	-> 521
    //   #70	-> 529
    //   #71	-> 555
    //   #70	-> 568
    //   #73	-> 574
    //   #77	-> 609
    //   #78	-> 622
    //   #79	-> 642
    //   #80	-> 664
    //   #81	-> 679
    //   #83	-> 703
    //   #84	-> 712
    //   #86	-> 715
    //   #87	-> 728
    //   #88	-> 736
    //   #89	-> 762
    //   #88	-> 775
    //   #91	-> 781
    //   #95	-> 816
    //   #96	-> 831
    //   #98	-> 864
    //   #99	-> 892
    //   #100	-> 925
    //   #101	-> 935
    //   #102	-> 946
    //   #103	-> 951
    //   #104	-> 964
    //   #105	-> 972
    //   #106	-> 998
    //   #105	-> 1011
    //   #108	-> 1017
    //   #112	-> 1052
    //   #113	-> 1065
    //   #114	-> 1085
    //   #115	-> 1107
    //   #116	-> 1122
    //   #118	-> 1146
    //   #119	-> 1155
    //   #121	-> 1158
    //   #122	-> 1169
    //   #123	-> 1174
    //   #124	-> 1187
    //   #125	-> 1195
    //   #126	-> 1221
    //   #125	-> 1234
    //   #128	-> 1240
    //   #132	-> 1275
    //   #133	-> 1288
    //   #134	-> 1308
    //   #135	-> 1330
    //   #136	-> 1345
    //   #138	-> 1369
    //   #139	-> 1378
    //   #142	-> 1381
    //   #143	-> 1389
    //   #146	-> 1391
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   48	11	9	_entGetArmor	Lnet/minecraft/world/entity/LivingEntity;
    //   89	11	10	_entGetArmor	Lnet/minecraft/world/entity/LivingEntity;
    //   130	11	11	_entGetArmor	Lnet/minecraft/world/entity/LivingEntity;
    //   171	11	12	_entGetArmor	Lnet/minecraft/world/entity/LivingEntity;
    //   288	88	13	_level	Lnet/minecraft/world/level/Level;
    //   446	24	15	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   409	70	14	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   389	90	13	_level	Lnet/minecraft/server/level/ServerLevel;
    //   521	88	13	_level	Lnet/minecraft/world/level/Level;
    //   679	24	15	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   642	70	14	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   622	90	13	_level	Lnet/minecraft/server/level/ServerLevel;
    //   728	88	13	_level	Lnet/minecraft/world/level/Level;
    //   848	8	14	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
    //   831	30	13	_entity	Lnet/minecraft/world/entity/LivingEntity;
    //   964	88	13	_level	Lnet/minecraft/world/level/Level;
    //   1122	24	15	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   1085	70	14	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   1065	90	13	_level	Lnet/minecraft/server/level/ServerLevel;
    //   1187	88	13	_level	Lnet/minecraft/world/level/Level;
    //   1345	24	15	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   1308	70	14	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   1288	90	13	_level	Lnet/minecraft/server/level/ServerLevel;
    //   0	1393	0	world	Lnet/minecraft/world/level/LevelAccessor;
    //   0	1393	1	x	D
    //   0	1393	3	y	D
    //   0	1393	5	z	D
    //   0	1393	7	entity	Lnet/minecraft/world/entity/Entity;
    //   0	1393	8	sourceentity	Lnet/minecraft/world/entity/Entity;
  }
}


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\YufengThisEntityKillsAnotherOneProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */