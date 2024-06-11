package net.mcreator.latexes.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.LevelAccessor;

public class DarkLatexSnepThisEntityKillsAnotherOneProcedure {
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
    //   30: if_icmpne -> 2249
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
    //   203: if_icmpeq -> 2249
    //   206: aload #7
    //   208: instanceof net/minecraft/world/entity/player/Player
    //   211: iconst_1
    //   212: if_icmpeq -> 2249
    //   215: aload #7
    //   217: invokevirtual getType : ()Lnet/minecraft/world/entity/EntityType;
    //   220: getstatic net/minecraft/core/Registry.ENTITY_TYPE_REGISTRY : Lnet/minecraft/resources/ResourceKey;
    //   223: new net/minecraft/resources/ResourceLocation
    //   226: dup
    //   227: ldc 'latex:robots'
    //   229: invokespecial <init> : (Ljava/lang/String;)V
    //   232: invokestatic create : (Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraft/tags/TagKey;
    //   235: invokevirtual is : (Lnet/minecraft/tags/TagKey;)Z
    //   238: ifeq -> 243
    //   241: iconst_1
    //   242: ireturn
    //   243: aload #7
    //   245: instanceof net/minecraft/world/entity/FlyingMob
    //   248: iconst_1
    //   249: if_icmpne -> 724
    //   252: invokestatic random : ()D
    //   255: ldc2_w 0.3
    //   258: dcmpg
    //   259: ifge -> 485
    //   262: aload #7
    //   264: getfield level : Lnet/minecraft/world/level/Level;
    //   267: invokevirtual isClientSide : ()Z
    //   270: ifne -> 278
    //   273: aload #7
    //   275: invokevirtual discard : ()V
    //   278: aload_0
    //   279: instanceof net/minecraft/world/level/Level
    //   282: ifeq -> 379
    //   285: aload_0
    //   286: checkcast net/minecraft/world/level/Level
    //   289: astore #13
    //   291: aload #13
    //   293: invokevirtual isClientSide : ()Z
    //   296: ifne -> 344
    //   299: aload #13
    //   301: aconst_null
    //   302: new net/minecraft/core/BlockPos
    //   305: dup
    //   306: dload_1
    //   307: dload_3
    //   308: dload #5
    //   310: invokespecial <init> : (DDD)V
    //   313: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   316: new net/minecraft/resources/ResourceLocation
    //   319: dup
    //   320: ldc 'latex:transfur'
    //   322: invokespecial <init> : (Ljava/lang/String;)V
    //   325: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   330: checkcast net/minecraft/sounds/SoundEvent
    //   333: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   336: fconst_1
    //   337: fconst_1
    //   338: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   341: goto -> 379
    //   344: aload #13
    //   346: dload_1
    //   347: dload_3
    //   348: dload #5
    //   350: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   353: new net/minecraft/resources/ResourceLocation
    //   356: dup
    //   357: ldc 'latex:transfur'
    //   359: invokespecial <init> : (Ljava/lang/String;)V
    //   362: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   367: checkcast net/minecraft/sounds/SoundEvent
    //   370: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   373: fconst_1
    //   374: fconst_1
    //   375: iconst_0
    //   376: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   379: aload_0
    //   380: instanceof net/minecraft/server/level/ServerLevel
    //   383: ifeq -> 482
    //   386: aload_0
    //   387: checkcast net/minecraft/server/level/ServerLevel
    //   390: astore #13
    //   392: new net/mcreator/latexes/entity/YufengEntity
    //   395: dup
    //   396: getstatic net/mcreator/latexes/init/LatexModEntities.YUFENG : Lnet/minecraftforge/registries/RegistryObject;
    //   399: invokevirtual get : ()Ljava/lang/Object;
    //   402: checkcast net/minecraft/world/entity/EntityType
    //   405: aload #13
    //   407: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   410: astore #14
    //   412: aload #14
    //   414: dload_1
    //   415: dload_3
    //   416: dload #5
    //   418: aload_0
    //   419: invokeinterface getRandom : ()Ljava/util/Random;
    //   424: invokevirtual nextFloat : ()F
    //   427: ldc 360.0
    //   429: fmul
    //   430: fconst_0
    //   431: invokevirtual moveTo : (DDDFF)V
    //   434: aload #14
    //   436: instanceof net/minecraft/world/entity/Mob
    //   439: ifeq -> 473
    //   442: aload #14
    //   444: checkcast net/minecraft/world/entity/Mob
    //   447: astore #15
    //   449: aload #15
    //   451: aload #13
    //   453: aload_0
    //   454: aload #14
    //   456: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   459: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   464: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   467: aconst_null
    //   468: aconst_null
    //   469: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   472: pop
    //   473: aload_0
    //   474: aload #14
    //   476: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   481: pop
    //   482: goto -> 2249
    //   485: aload #7
    //   487: getfield level : Lnet/minecraft/world/level/Level;
    //   490: invokevirtual isClientSide : ()Z
    //   493: ifne -> 501
    //   496: aload #7
    //   498: invokevirtual discard : ()V
    //   501: aload #8
    //   503: getfield level : Lnet/minecraft/world/level/Level;
    //   506: invokevirtual isClientSide : ()Z
    //   509: ifne -> 517
    //   512: aload #8
    //   514: invokevirtual discard : ()V
    //   517: aload_0
    //   518: instanceof net/minecraft/world/level/Level
    //   521: ifeq -> 618
    //   524: aload_0
    //   525: checkcast net/minecraft/world/level/Level
    //   528: astore #13
    //   530: aload #13
    //   532: invokevirtual isClientSide : ()Z
    //   535: ifne -> 583
    //   538: aload #13
    //   540: aconst_null
    //   541: new net/minecraft/core/BlockPos
    //   544: dup
    //   545: dload_1
    //   546: dload_3
    //   547: dload #5
    //   549: invokespecial <init> : (DDD)V
    //   552: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   555: new net/minecraft/resources/ResourceLocation
    //   558: dup
    //   559: ldc 'latex:transfur'
    //   561: invokespecial <init> : (Ljava/lang/String;)V
    //   564: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   569: checkcast net/minecraft/sounds/SoundEvent
    //   572: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   575: fconst_1
    //   576: fconst_1
    //   577: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   580: goto -> 618
    //   583: aload #13
    //   585: dload_1
    //   586: dload_3
    //   587: dload #5
    //   589: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   592: new net/minecraft/resources/ResourceLocation
    //   595: dup
    //   596: ldc 'latex:transfur'
    //   598: invokespecial <init> : (Ljava/lang/String;)V
    //   601: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   606: checkcast net/minecraft/sounds/SoundEvent
    //   609: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   612: fconst_1
    //   613: fconst_1
    //   614: iconst_0
    //   615: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   618: aload_0
    //   619: instanceof net/minecraft/server/level/ServerLevel
    //   622: ifeq -> 721
    //   625: aload_0
    //   626: checkcast net/minecraft/server/level/ServerLevel
    //   629: astore #13
    //   631: new net/mcreator/latexes/entity/YufengEntity
    //   634: dup
    //   635: getstatic net/mcreator/latexes/init/LatexModEntities.YUFENG : Lnet/minecraftforge/registries/RegistryObject;
    //   638: invokevirtual get : ()Ljava/lang/Object;
    //   641: checkcast net/minecraft/world/entity/EntityType
    //   644: aload #13
    //   646: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   649: astore #14
    //   651: aload #14
    //   653: dload_1
    //   654: dload_3
    //   655: dload #5
    //   657: aload_0
    //   658: invokeinterface getRandom : ()Ljava/util/Random;
    //   663: invokevirtual nextFloat : ()F
    //   666: ldc 360.0
    //   668: fmul
    //   669: fconst_0
    //   670: invokevirtual moveTo : (DDDFF)V
    //   673: aload #14
    //   675: instanceof net/minecraft/world/entity/Mob
    //   678: ifeq -> 712
    //   681: aload #14
    //   683: checkcast net/minecraft/world/entity/Mob
    //   686: astore #15
    //   688: aload #15
    //   690: aload #13
    //   692: aload_0
    //   693: aload #14
    //   695: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   698: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   703: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   706: aconst_null
    //   707: aconst_null
    //   708: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   711: pop
    //   712: aload_0
    //   713: aload #14
    //   715: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   720: pop
    //   721: goto -> 2249
    //   724: aload #7
    //   726: instanceof net/minecraft/world/entity/animal/WaterAnimal
    //   729: iconst_1
    //   730: if_icmpne -> 956
    //   733: aload #7
    //   735: getfield level : Lnet/minecraft/world/level/Level;
    //   738: invokevirtual isClientSide : ()Z
    //   741: ifne -> 749
    //   744: aload #7
    //   746: invokevirtual discard : ()V
    //   749: aload_0
    //   750: instanceof net/minecraft/world/level/Level
    //   753: ifeq -> 850
    //   756: aload_0
    //   757: checkcast net/minecraft/world/level/Level
    //   760: astore #13
    //   762: aload #13
    //   764: invokevirtual isClientSide : ()Z
    //   767: ifne -> 815
    //   770: aload #13
    //   772: aconst_null
    //   773: new net/minecraft/core/BlockPos
    //   776: dup
    //   777: dload_1
    //   778: dload_3
    //   779: dload #5
    //   781: invokespecial <init> : (DDD)V
    //   784: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   787: new net/minecraft/resources/ResourceLocation
    //   790: dup
    //   791: ldc 'latex:transfur'
    //   793: invokespecial <init> : (Ljava/lang/String;)V
    //   796: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   801: checkcast net/minecraft/sounds/SoundEvent
    //   804: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   807: fconst_1
    //   808: fconst_1
    //   809: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   812: goto -> 850
    //   815: aload #13
    //   817: dload_1
    //   818: dload_3
    //   819: dload #5
    //   821: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   824: new net/minecraft/resources/ResourceLocation
    //   827: dup
    //   828: ldc 'latex:transfur'
    //   830: invokespecial <init> : (Ljava/lang/String;)V
    //   833: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   838: checkcast net/minecraft/sounds/SoundEvent
    //   841: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   844: fconst_1
    //   845: fconst_1
    //   846: iconst_0
    //   847: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   850: aload_0
    //   851: instanceof net/minecraft/server/level/ServerLevel
    //   854: ifeq -> 953
    //   857: aload_0
    //   858: checkcast net/minecraft/server/level/ServerLevel
    //   861: astore #13
    //   863: new net/mcreator/latexes/entity/DlsharkEntity
    //   866: dup
    //   867: getstatic net/mcreator/latexes/init/LatexModEntities.DLSHARK : Lnet/minecraftforge/registries/RegistryObject;
    //   870: invokevirtual get : ()Ljava/lang/Object;
    //   873: checkcast net/minecraft/world/entity/EntityType
    //   876: aload #13
    //   878: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   881: astore #14
    //   883: aload #14
    //   885: dload_1
    //   886: dload_3
    //   887: dload #5
    //   889: aload_0
    //   890: invokeinterface getRandom : ()Ljava/util/Random;
    //   895: invokevirtual nextFloat : ()F
    //   898: ldc 360.0
    //   900: fmul
    //   901: fconst_0
    //   902: invokevirtual moveTo : (DDDFF)V
    //   905: aload #14
    //   907: instanceof net/minecraft/world/entity/Mob
    //   910: ifeq -> 944
    //   913: aload #14
    //   915: checkcast net/minecraft/world/entity/Mob
    //   918: astore #15
    //   920: aload #15
    //   922: aload #13
    //   924: aload_0
    //   925: aload #14
    //   927: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   930: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   935: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   938: aconst_null
    //   939: aconst_null
    //   940: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   943: pop
    //   944: aload_0
    //   945: aload #14
    //   947: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   952: pop
    //   953: goto -> 2249
    //   956: aload #7
    //   958: instanceof net/minecraft/world/entity/animal/Fox
    //   961: iconst_1
    //   962: if_icmpne -> 1421
    //   965: invokestatic random : ()D
    //   968: ldc2_w 0.5
    //   971: dcmpg
    //   972: ifge -> 1198
    //   975: aload #7
    //   977: getfield level : Lnet/minecraft/world/level/Level;
    //   980: invokevirtual isClientSide : ()Z
    //   983: ifne -> 991
    //   986: aload #7
    //   988: invokevirtual discard : ()V
    //   991: aload_0
    //   992: instanceof net/minecraft/world/level/Level
    //   995: ifeq -> 1092
    //   998: aload_0
    //   999: checkcast net/minecraft/world/level/Level
    //   1002: astore #13
    //   1004: aload #13
    //   1006: invokevirtual isClientSide : ()Z
    //   1009: ifne -> 1057
    //   1012: aload #13
    //   1014: aconst_null
    //   1015: new net/minecraft/core/BlockPos
    //   1018: dup
    //   1019: dload_1
    //   1020: dload_3
    //   1021: dload #5
    //   1023: invokespecial <init> : (DDD)V
    //   1026: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   1029: new net/minecraft/resources/ResourceLocation
    //   1032: dup
    //   1033: ldc 'latex:transfur'
    //   1035: invokespecial <init> : (Ljava/lang/String;)V
    //   1038: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   1043: checkcast net/minecraft/sounds/SoundEvent
    //   1046: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   1049: fconst_1
    //   1050: fconst_1
    //   1051: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   1054: goto -> 1092
    //   1057: aload #13
    //   1059: dload_1
    //   1060: dload_3
    //   1061: dload #5
    //   1063: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   1066: new net/minecraft/resources/ResourceLocation
    //   1069: dup
    //   1070: ldc 'latex:transfur'
    //   1072: invokespecial <init> : (Ljava/lang/String;)V
    //   1075: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   1080: checkcast net/minecraft/sounds/SoundEvent
    //   1083: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   1086: fconst_1
    //   1087: fconst_1
    //   1088: iconst_0
    //   1089: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   1092: aload_0
    //   1093: instanceof net/minecraft/server/level/ServerLevel
    //   1096: ifeq -> 1195
    //   1099: aload_0
    //   1100: checkcast net/minecraft/server/level/ServerLevel
    //   1103: astore #13
    //   1105: new net/mcreator/latexes/entity/DarkLatexSnepEntity
    //   1108: dup
    //   1109: getstatic net/mcreator/latexes/init/LatexModEntities.DARK_LATEX_SNEP : Lnet/minecraftforge/registries/RegistryObject;
    //   1112: invokevirtual get : ()Ljava/lang/Object;
    //   1115: checkcast net/minecraft/world/entity/EntityType
    //   1118: aload #13
    //   1120: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   1123: astore #14
    //   1125: aload #14
    //   1127: dload_1
    //   1128: dload_3
    //   1129: dload #5
    //   1131: aload_0
    //   1132: invokeinterface getRandom : ()Ljava/util/Random;
    //   1137: invokevirtual nextFloat : ()F
    //   1140: ldc 360.0
    //   1142: fmul
    //   1143: fconst_0
    //   1144: invokevirtual moveTo : (DDDFF)V
    //   1147: aload #14
    //   1149: instanceof net/minecraft/world/entity/Mob
    //   1152: ifeq -> 1186
    //   1155: aload #14
    //   1157: checkcast net/minecraft/world/entity/Mob
    //   1160: astore #15
    //   1162: aload #15
    //   1164: aload #13
    //   1166: aload_0
    //   1167: aload #14
    //   1169: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   1172: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   1177: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   1180: aconst_null
    //   1181: aconst_null
    //   1182: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   1185: pop
    //   1186: aload_0
    //   1187: aload #14
    //   1189: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   1194: pop
    //   1195: goto -> 2249
    //   1198: aload #7
    //   1200: getfield level : Lnet/minecraft/world/level/Level;
    //   1203: invokevirtual isClientSide : ()Z
    //   1206: ifne -> 1214
    //   1209: aload #7
    //   1211: invokevirtual discard : ()V
    //   1214: aload_0
    //   1215: instanceof net/minecraft/world/level/Level
    //   1218: ifeq -> 1315
    //   1221: aload_0
    //   1222: checkcast net/minecraft/world/level/Level
    //   1225: astore #13
    //   1227: aload #13
    //   1229: invokevirtual isClientSide : ()Z
    //   1232: ifne -> 1280
    //   1235: aload #13
    //   1237: aconst_null
    //   1238: new net/minecraft/core/BlockPos
    //   1241: dup
    //   1242: dload_1
    //   1243: dload_3
    //   1244: dload #5
    //   1246: invokespecial <init> : (DDD)V
    //   1249: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   1252: new net/minecraft/resources/ResourceLocation
    //   1255: dup
    //   1256: ldc 'latex:transfur'
    //   1258: invokespecial <init> : (Ljava/lang/String;)V
    //   1261: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   1266: checkcast net/minecraft/sounds/SoundEvent
    //   1269: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   1272: fconst_1
    //   1273: fconst_1
    //   1274: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   1277: goto -> 1315
    //   1280: aload #13
    //   1282: dload_1
    //   1283: dload_3
    //   1284: dload #5
    //   1286: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   1289: new net/minecraft/resources/ResourceLocation
    //   1292: dup
    //   1293: ldc 'latex:transfur'
    //   1295: invokespecial <init> : (Ljava/lang/String;)V
    //   1298: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   1303: checkcast net/minecraft/sounds/SoundEvent
    //   1306: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   1309: fconst_1
    //   1310: fconst_1
    //   1311: iconst_0
    //   1312: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   1315: aload_0
    //   1316: instanceof net/minecraft/server/level/ServerLevel
    //   1319: ifeq -> 1418
    //   1322: aload_0
    //   1323: checkcast net/minecraft/server/level/ServerLevel
    //   1326: astore #13
    //   1328: new net/mcreator/latexes/entity/DarkLatexFoxEntity
    //   1331: dup
    //   1332: getstatic net/mcreator/latexes/init/LatexModEntities.DARK_LATEX_FOX : Lnet/minecraftforge/registries/RegistryObject;
    //   1335: invokevirtual get : ()Ljava/lang/Object;
    //   1338: checkcast net/minecraft/world/entity/EntityType
    //   1341: aload #13
    //   1343: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   1346: astore #14
    //   1348: aload #14
    //   1350: dload_1
    //   1351: dload_3
    //   1352: dload #5
    //   1354: aload_0
    //   1355: invokeinterface getRandom : ()Ljava/util/Random;
    //   1360: invokevirtual nextFloat : ()F
    //   1363: ldc 360.0
    //   1365: fmul
    //   1366: fconst_0
    //   1367: invokevirtual moveTo : (DDDFF)V
    //   1370: aload #14
    //   1372: instanceof net/minecraft/world/entity/Mob
    //   1375: ifeq -> 1409
    //   1378: aload #14
    //   1380: checkcast net/minecraft/world/entity/Mob
    //   1383: astore #15
    //   1385: aload #15
    //   1387: aload #13
    //   1389: aload_0
    //   1390: aload #14
    //   1392: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   1395: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   1400: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   1403: aconst_null
    //   1404: aconst_null
    //   1405: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   1408: pop
    //   1409: aload_0
    //   1410: aload #14
    //   1412: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   1417: pop
    //   1418: goto -> 2249
    //   1421: aload #7
    //   1423: invokevirtual getType : ()Lnet/minecraft/world/entity/EntityType;
    //   1426: getstatic net/minecraft/core/Registry.ENTITY_TYPE_REGISTRY : Lnet/minecraft/resources/ResourceKey;
    //   1429: new net/minecraft/resources/ResourceLocation
    //   1432: dup
    //   1433: ldc_w 'minecraft:skeletons'
    //   1436: invokespecial <init> : (Ljava/lang/String;)V
    //   1439: invokestatic create : (Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraft/tags/TagKey;
    //   1442: invokevirtual is : (Lnet/minecraft/tags/TagKey;)Z
    //   1445: iconst_1
    //   1446: if_icmpne -> 1788
    //   1449: aload #7
    //   1451: getfield level : Lnet/minecraft/world/level/Level;
    //   1454: invokevirtual isClientSide : ()Z
    //   1457: ifne -> 1465
    //   1460: aload #7
    //   1462: invokevirtual discard : ()V
    //   1465: aload_0
    //   1466: instanceof net/minecraft/world/level/Level
    //   1469: ifeq -> 1566
    //   1472: aload_0
    //   1473: checkcast net/minecraft/world/level/Level
    //   1476: astore #13
    //   1478: aload #13
    //   1480: invokevirtual isClientSide : ()Z
    //   1483: ifne -> 1531
    //   1486: aload #13
    //   1488: aconst_null
    //   1489: new net/minecraft/core/BlockPos
    //   1492: dup
    //   1493: dload_1
    //   1494: dload_3
    //   1495: dload #5
    //   1497: invokespecial <init> : (DDD)V
    //   1500: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   1503: new net/minecraft/resources/ResourceLocation
    //   1506: dup
    //   1507: ldc 'latex:transfur'
    //   1509: invokespecial <init> : (Ljava/lang/String;)V
    //   1512: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   1517: checkcast net/minecraft/sounds/SoundEvent
    //   1520: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   1523: fconst_1
    //   1524: fconst_1
    //   1525: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   1528: goto -> 1566
    //   1531: aload #13
    //   1533: dload_1
    //   1534: dload_3
    //   1535: dload #5
    //   1537: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   1540: new net/minecraft/resources/ResourceLocation
    //   1543: dup
    //   1544: ldc 'latex:transfur'
    //   1546: invokespecial <init> : (Ljava/lang/String;)V
    //   1549: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   1554: checkcast net/minecraft/sounds/SoundEvent
    //   1557: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   1560: fconst_1
    //   1561: fconst_1
    //   1562: iconst_0
    //   1563: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   1566: invokestatic random : ()D
    //   1569: ldc2_w 0.25
    //   1572: dcmpg
    //   1573: ifge -> 1682
    //   1576: aload_0
    //   1577: instanceof net/minecraft/server/level/ServerLevel
    //   1580: ifeq -> 1679
    //   1583: aload_0
    //   1584: checkcast net/minecraft/server/level/ServerLevel
    //   1587: astore #13
    //   1589: new net/mcreator/latexes/entity/YufengEntity
    //   1592: dup
    //   1593: getstatic net/mcreator/latexes/init/LatexModEntities.YUFENG : Lnet/minecraftforge/registries/RegistryObject;
    //   1596: invokevirtual get : ()Ljava/lang/Object;
    //   1599: checkcast net/minecraft/world/entity/EntityType
    //   1602: aload #13
    //   1604: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   1607: astore #14
    //   1609: aload #14
    //   1611: dload_1
    //   1612: dload_3
    //   1613: dload #5
    //   1615: aload_0
    //   1616: invokeinterface getRandom : ()Ljava/util/Random;
    //   1621: invokevirtual nextFloat : ()F
    //   1624: ldc 360.0
    //   1626: fmul
    //   1627: fconst_0
    //   1628: invokevirtual moveTo : (DDDFF)V
    //   1631: aload #14
    //   1633: instanceof net/minecraft/world/entity/Mob
    //   1636: ifeq -> 1670
    //   1639: aload #14
    //   1641: checkcast net/minecraft/world/entity/Mob
    //   1644: astore #15
    //   1646: aload #15
    //   1648: aload #13
    //   1650: aload_0
    //   1651: aload #14
    //   1653: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   1656: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   1661: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   1664: aconst_null
    //   1665: aconst_null
    //   1666: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   1669: pop
    //   1670: aload_0
    //   1671: aload #14
    //   1673: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   1678: pop
    //   1679: goto -> 2249
    //   1682: aload_0
    //   1683: instanceof net/minecraft/server/level/ServerLevel
    //   1686: ifeq -> 1785
    //   1689: aload_0
    //   1690: checkcast net/minecraft/server/level/ServerLevel
    //   1693: astore #13
    //   1695: new net/mcreator/latexes/entity/DarkLatexSkeletonEntity
    //   1698: dup
    //   1699: getstatic net/mcreator/latexes/init/LatexModEntities.DARK_LATEX_SKELETON : Lnet/minecraftforge/registries/RegistryObject;
    //   1702: invokevirtual get : ()Ljava/lang/Object;
    //   1705: checkcast net/minecraft/world/entity/EntityType
    //   1708: aload #13
    //   1710: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   1713: astore #14
    //   1715: aload #14
    //   1717: dload_1
    //   1718: dload_3
    //   1719: dload #5
    //   1721: aload_0
    //   1722: invokeinterface getRandom : ()Ljava/util/Random;
    //   1727: invokevirtual nextFloat : ()F
    //   1730: ldc 360.0
    //   1732: fmul
    //   1733: fconst_0
    //   1734: invokevirtual moveTo : (DDDFF)V
    //   1737: aload #14
    //   1739: instanceof net/minecraft/world/entity/Mob
    //   1742: ifeq -> 1776
    //   1745: aload #14
    //   1747: checkcast net/minecraft/world/entity/Mob
    //   1750: astore #15
    //   1752: aload #15
    //   1754: aload #13
    //   1756: aload_0
    //   1757: aload #14
    //   1759: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   1762: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   1767: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   1770: aconst_null
    //   1771: aconst_null
    //   1772: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   1775: pop
    //   1776: aload_0
    //   1777: aload #14
    //   1779: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   1784: pop
    //   1785: goto -> 2249
    //   1788: aload #7
    //   1790: instanceof net/minecraft/world/entity/animal/Bee
    //   1793: iconst_1
    //   1794: if_icmpne -> 2020
    //   1797: aload #7
    //   1799: getfield level : Lnet/minecraft/world/level/Level;
    //   1802: invokevirtual isClientSide : ()Z
    //   1805: ifne -> 1813
    //   1808: aload #7
    //   1810: invokevirtual discard : ()V
    //   1813: aload_0
    //   1814: instanceof net/minecraft/world/level/Level
    //   1817: ifeq -> 1914
    //   1820: aload_0
    //   1821: checkcast net/minecraft/world/level/Level
    //   1824: astore #13
    //   1826: aload #13
    //   1828: invokevirtual isClientSide : ()Z
    //   1831: ifne -> 1879
    //   1834: aload #13
    //   1836: aconst_null
    //   1837: new net/minecraft/core/BlockPos
    //   1840: dup
    //   1841: dload_1
    //   1842: dload_3
    //   1843: dload #5
    //   1845: invokespecial <init> : (DDD)V
    //   1848: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   1851: new net/minecraft/resources/ResourceLocation
    //   1854: dup
    //   1855: ldc 'latex:transfur'
    //   1857: invokespecial <init> : (Ljava/lang/String;)V
    //   1860: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   1865: checkcast net/minecraft/sounds/SoundEvent
    //   1868: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   1871: fconst_1
    //   1872: fconst_1
    //   1873: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   1876: goto -> 1914
    //   1879: aload #13
    //   1881: dload_1
    //   1882: dload_3
    //   1883: dload #5
    //   1885: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   1888: new net/minecraft/resources/ResourceLocation
    //   1891: dup
    //   1892: ldc 'latex:transfur'
    //   1894: invokespecial <init> : (Ljava/lang/String;)V
    //   1897: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   1902: checkcast net/minecraft/sounds/SoundEvent
    //   1905: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   1908: fconst_1
    //   1909: fconst_1
    //   1910: iconst_0
    //   1911: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   1914: aload_0
    //   1915: instanceof net/minecraft/server/level/ServerLevel
    //   1918: ifeq -> 2017
    //   1921: aload_0
    //   1922: checkcast net/minecraft/server/level/ServerLevel
    //   1925: astore #13
    //   1927: new net/mcreator/latexes/entity/DLbeeEntity
    //   1930: dup
    //   1931: getstatic net/mcreator/latexes/init/LatexModEntities.D_LBEE : Lnet/minecraftforge/registries/RegistryObject;
    //   1934: invokevirtual get : ()Ljava/lang/Object;
    //   1937: checkcast net/minecraft/world/entity/EntityType
    //   1940: aload #13
    //   1942: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   1945: astore #14
    //   1947: aload #14
    //   1949: dload_1
    //   1950: dload_3
    //   1951: dload #5
    //   1953: aload_0
    //   1954: invokeinterface getRandom : ()Ljava/util/Random;
    //   1959: invokevirtual nextFloat : ()F
    //   1962: ldc 360.0
    //   1964: fmul
    //   1965: fconst_0
    //   1966: invokevirtual moveTo : (DDDFF)V
    //   1969: aload #14
    //   1971: instanceof net/minecraft/world/entity/Mob
    //   1974: ifeq -> 2008
    //   1977: aload #14
    //   1979: checkcast net/minecraft/world/entity/Mob
    //   1982: astore #15
    //   1984: aload #15
    //   1986: aload #13
    //   1988: aload_0
    //   1989: aload #14
    //   1991: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   1994: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   1999: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   2002: aconst_null
    //   2003: aconst_null
    //   2004: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   2007: pop
    //   2008: aload_0
    //   2009: aload #14
    //   2011: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   2016: pop
    //   2017: goto -> 2249
    //   2020: aload #7
    //   2022: instanceof net/mcreator/latexes/entity/DarklatexEntity
    //   2025: iconst_1
    //   2026: if_icmpeq -> 2249
    //   2029: aload #7
    //   2031: getfield level : Lnet/minecraft/world/level/Level;
    //   2034: invokevirtual isClientSide : ()Z
    //   2037: ifne -> 2045
    //   2040: aload #7
    //   2042: invokevirtual discard : ()V
    //   2045: aload_0
    //   2046: instanceof net/minecraft/world/level/Level
    //   2049: ifeq -> 2146
    //   2052: aload_0
    //   2053: checkcast net/minecraft/world/level/Level
    //   2056: astore #13
    //   2058: aload #13
    //   2060: invokevirtual isClientSide : ()Z
    //   2063: ifne -> 2111
    //   2066: aload #13
    //   2068: aconst_null
    //   2069: new net/minecraft/core/BlockPos
    //   2072: dup
    //   2073: dload_1
    //   2074: dload_3
    //   2075: dload #5
    //   2077: invokespecial <init> : (DDD)V
    //   2080: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   2083: new net/minecraft/resources/ResourceLocation
    //   2086: dup
    //   2087: ldc 'latex:transfur'
    //   2089: invokespecial <init> : (Ljava/lang/String;)V
    //   2092: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   2097: checkcast net/minecraft/sounds/SoundEvent
    //   2100: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   2103: fconst_1
    //   2104: fconst_1
    //   2105: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   2108: goto -> 2146
    //   2111: aload #13
    //   2113: dload_1
    //   2114: dload_3
    //   2115: dload #5
    //   2117: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   2120: new net/minecraft/resources/ResourceLocation
    //   2123: dup
    //   2124: ldc 'latex:transfur'
    //   2126: invokespecial <init> : (Ljava/lang/String;)V
    //   2129: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   2134: checkcast net/minecraft/sounds/SoundEvent
    //   2137: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   2140: fconst_1
    //   2141: fconst_1
    //   2142: iconst_0
    //   2143: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   2146: aload_0
    //   2147: instanceof net/minecraft/server/level/ServerLevel
    //   2150: ifeq -> 2249
    //   2153: aload_0
    //   2154: checkcast net/minecraft/server/level/ServerLevel
    //   2157: astore #13
    //   2159: new net/mcreator/latexes/entity/DarkLatexSnepEntity
    //   2162: dup
    //   2163: getstatic net/mcreator/latexes/init/LatexModEntities.DARK_LATEX_SNEP : Lnet/minecraftforge/registries/RegistryObject;
    //   2166: invokevirtual get : ()Ljava/lang/Object;
    //   2169: checkcast net/minecraft/world/entity/EntityType
    //   2172: aload #13
    //   2174: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   2177: astore #14
    //   2179: aload #14
    //   2181: dload_1
    //   2182: dload_3
    //   2183: dload #5
    //   2185: aload_0
    //   2186: invokeinterface getRandom : ()Ljava/util/Random;
    //   2191: invokevirtual nextFloat : ()F
    //   2194: ldc 360.0
    //   2196: fmul
    //   2197: fconst_0
    //   2198: invokevirtual moveTo : (DDDFF)V
    //   2201: aload #14
    //   2203: instanceof net/minecraft/world/entity/Mob
    //   2206: ifeq -> 2240
    //   2209: aload #14
    //   2211: checkcast net/minecraft/world/entity/Mob
    //   2214: astore #15
    //   2216: aload #15
    //   2218: aload #13
    //   2220: aload_0
    //   2221: aload #14
    //   2223: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   2226: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   2231: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   2234: aconst_null
    //   2235: aconst_null
    //   2236: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   2239: pop
    //   2240: aload_0
    //   2241: aload #14
    //   2243: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   2248: pop
    //   2249: iconst_0
    //   2250: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #38	-> 0
    //   #39	-> 10
    //   #40	-> 12
    //   #41	-> 33
    //   #42	-> 62
    //   #43	-> 74
    //   #44	-> 103
    //   #45	-> 115
    //   #46	-> 144
    //   #47	-> 156
    //   #48	-> 185
    //   #50	-> 215
    //   #51	-> 241
    //   #52	-> 243
    //   #53	-> 252
    //   #54	-> 262
    //   #55	-> 273
    //   #56	-> 278
    //   #57	-> 291
    //   #58	-> 299
    //   #59	-> 325
    //   #58	-> 338
    //   #61	-> 344
    //   #65	-> 379
    //   #66	-> 392
    //   #67	-> 412
    //   #68	-> 434
    //   #69	-> 449
    //   #71	-> 473
    //   #72	-> 482
    //   #74	-> 485
    //   #75	-> 496
    //   #76	-> 501
    //   #77	-> 512
    //   #78	-> 517
    //   #79	-> 530
    //   #80	-> 538
    //   #81	-> 564
    //   #80	-> 577
    //   #83	-> 583
    //   #87	-> 618
    //   #88	-> 631
    //   #89	-> 651
    //   #90	-> 673
    //   #91	-> 688
    //   #93	-> 712
    //   #94	-> 721
    //   #96	-> 724
    //   #97	-> 733
    //   #98	-> 744
    //   #99	-> 749
    //   #100	-> 762
    //   #101	-> 770
    //   #102	-> 796
    //   #101	-> 809
    //   #104	-> 815
    //   #108	-> 850
    //   #109	-> 863
    //   #110	-> 883
    //   #111	-> 905
    //   #112	-> 920
    //   #114	-> 944
    //   #115	-> 953
    //   #116	-> 956
    //   #117	-> 965
    //   #118	-> 975
    //   #119	-> 986
    //   #120	-> 991
    //   #121	-> 1004
    //   #122	-> 1012
    //   #123	-> 1038
    //   #122	-> 1051
    //   #125	-> 1057
    //   #129	-> 1092
    //   #130	-> 1105
    //   #131	-> 1125
    //   #132	-> 1147
    //   #133	-> 1162
    //   #135	-> 1186
    //   #136	-> 1195
    //   #138	-> 1198
    //   #139	-> 1209
    //   #140	-> 1214
    //   #141	-> 1227
    //   #142	-> 1235
    //   #143	-> 1261
    //   #142	-> 1274
    //   #145	-> 1280
    //   #149	-> 1315
    //   #150	-> 1328
    //   #151	-> 1348
    //   #152	-> 1370
    //   #153	-> 1385
    //   #155	-> 1409
    //   #156	-> 1418
    //   #158	-> 1421
    //   #159	-> 1449
    //   #160	-> 1460
    //   #161	-> 1465
    //   #162	-> 1478
    //   #163	-> 1486
    //   #164	-> 1512
    //   #163	-> 1525
    //   #166	-> 1531
    //   #170	-> 1566
    //   #171	-> 1576
    //   #172	-> 1589
    //   #173	-> 1609
    //   #174	-> 1631
    //   #175	-> 1646
    //   #177	-> 1670
    //   #178	-> 1679
    //   #180	-> 1682
    //   #181	-> 1695
    //   #182	-> 1715
    //   #183	-> 1737
    //   #184	-> 1752
    //   #186	-> 1776
    //   #187	-> 1785
    //   #189	-> 1788
    //   #190	-> 1797
    //   #191	-> 1808
    //   #192	-> 1813
    //   #193	-> 1826
    //   #194	-> 1834
    //   #195	-> 1860
    //   #194	-> 1873
    //   #197	-> 1879
    //   #201	-> 1914
    //   #202	-> 1927
    //   #203	-> 1947
    //   #204	-> 1969
    //   #205	-> 1984
    //   #207	-> 2008
    //   #208	-> 2017
    //   #209	-> 2020
    //   #210	-> 2029
    //   #211	-> 2040
    //   #212	-> 2045
    //   #213	-> 2058
    //   #214	-> 2066
    //   #215	-> 2092
    //   #214	-> 2105
    //   #217	-> 2111
    //   #221	-> 2146
    //   #222	-> 2159
    //   #223	-> 2179
    //   #224	-> 2201
    //   #225	-> 2216
    //   #227	-> 2240
    //   #232	-> 2249
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   48	11	9	_entGetArmor	Lnet/minecraft/world/entity/LivingEntity;
    //   89	11	10	_entGetArmor	Lnet/minecraft/world/entity/LivingEntity;
    //   130	11	11	_entGetArmor	Lnet/minecraft/world/entity/LivingEntity;
    //   171	11	12	_entGetArmor	Lnet/minecraft/world/entity/LivingEntity;
    //   291	88	13	_level	Lnet/minecraft/world/level/Level;
    //   449	24	15	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   412	70	14	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   392	90	13	_level	Lnet/minecraft/server/level/ServerLevel;
    //   530	88	13	_level	Lnet/minecraft/world/level/Level;
    //   688	24	15	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   651	70	14	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   631	90	13	_level	Lnet/minecraft/server/level/ServerLevel;
    //   762	88	13	_level	Lnet/minecraft/world/level/Level;
    //   920	24	15	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   883	70	14	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   863	90	13	_level	Lnet/minecraft/server/level/ServerLevel;
    //   1004	88	13	_level	Lnet/minecraft/world/level/Level;
    //   1162	24	15	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   1125	70	14	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   1105	90	13	_level	Lnet/minecraft/server/level/ServerLevel;
    //   1227	88	13	_level	Lnet/minecraft/world/level/Level;
    //   1385	24	15	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   1348	70	14	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   1328	90	13	_level	Lnet/minecraft/server/level/ServerLevel;
    //   1478	88	13	_level	Lnet/minecraft/world/level/Level;
    //   1646	24	15	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   1609	70	14	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   1589	90	13	_level	Lnet/minecraft/server/level/ServerLevel;
    //   1752	24	15	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   1715	70	14	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   1695	90	13	_level	Lnet/minecraft/server/level/ServerLevel;
    //   1826	88	13	_level	Lnet/minecraft/world/level/Level;
    //   1984	24	15	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   1947	70	14	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   1927	90	13	_level	Lnet/minecraft/server/level/ServerLevel;
    //   2058	88	13	_level	Lnet/minecraft/world/level/Level;
    //   2216	24	15	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   2179	70	14	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   2159	90	13	_level	Lnet/minecraft/server/level/ServerLevel;
    //   0	2251	0	world	Lnet/minecraft/world/level/LevelAccessor;
    //   0	2251	1	x	D
    //   0	2251	3	y	D
    //   0	2251	5	z	D
    //   0	2251	7	entity	Lnet/minecraft/world/entity/Entity;
    //   0	2251	8	sourceentity	Lnet/minecraft/world/entity/Entity;
  }
}


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\DarkLatexSnepThisEntityKillsAnotherOneProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */