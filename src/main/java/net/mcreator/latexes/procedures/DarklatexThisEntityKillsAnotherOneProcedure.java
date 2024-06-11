package net.mcreator.latexes.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.LevelAccessor;

public class DarklatexThisEntityKillsAnotherOneProcedure {
  public static boolean execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
    // Byte code:
    //   0: aload #7
    //   2: ifnull -> 10
    //   5: aload #8
    //   7: ifnonnull -> 12
    //   10: iconst_0
    //   11: ireturn
    //   12: dconst_0
    //   13: dstore #9
    //   15: aload_0
    //   16: invokeinterface getLevelData : ()Lnet/minecraft/world/level/storage/LevelData;
    //   21: invokeinterface getGameRules : ()Lnet/minecraft/world/level/GameRules;
    //   26: getstatic net/mcreator/latexes/init/LatexModGameRules.DARKLATEXTRANSFUR : Lnet/minecraft/world/level/GameRules$Key;
    //   29: invokevirtual getBoolean : (Lnet/minecraft/world/level/GameRules$Key;)Z
    //   32: iconst_1
    //   33: if_icmpne -> 3955
    //   36: aload #7
    //   38: instanceof net/minecraft/world/entity/LivingEntity
    //   41: ifeq -> 62
    //   44: aload #7
    //   46: checkcast net/minecraft/world/entity/LivingEntity
    //   49: astore #11
    //   51: aload #11
    //   53: getstatic net/minecraft/world/entity/EquipmentSlot.HEAD : Lnet/minecraft/world/entity/EquipmentSlot;
    //   56: invokevirtual getItemBySlot : (Lnet/minecraft/world/entity/EquipmentSlot;)Lnet/minecraft/world/item/ItemStack;
    //   59: goto -> 65
    //   62: getstatic net/minecraft/world/item/ItemStack.EMPTY : Lnet/minecraft/world/item/ItemStack;
    //   65: invokevirtual getItem : ()Lnet/minecraft/world/item/Item;
    //   68: getstatic net/mcreator/latexes/init/LatexModItems.HAZMAT_HELMET : Lnet/minecraftforge/registries/RegistryObject;
    //   71: invokevirtual get : ()Ljava/lang/Object;
    //   74: if_acmpne -> 204
    //   77: aload #7
    //   79: instanceof net/minecraft/world/entity/LivingEntity
    //   82: ifeq -> 103
    //   85: aload #7
    //   87: checkcast net/minecraft/world/entity/LivingEntity
    //   90: astore #12
    //   92: aload #12
    //   94: getstatic net/minecraft/world/entity/EquipmentSlot.CHEST : Lnet/minecraft/world/entity/EquipmentSlot;
    //   97: invokevirtual getItemBySlot : (Lnet/minecraft/world/entity/EquipmentSlot;)Lnet/minecraft/world/item/ItemStack;
    //   100: goto -> 106
    //   103: getstatic net/minecraft/world/item/ItemStack.EMPTY : Lnet/minecraft/world/item/ItemStack;
    //   106: invokevirtual getItem : ()Lnet/minecraft/world/item/Item;
    //   109: getstatic net/mcreator/latexes/init/LatexModItems.HAZMAT_CHESTPLATE : Lnet/minecraftforge/registries/RegistryObject;
    //   112: invokevirtual get : ()Ljava/lang/Object;
    //   115: if_acmpne -> 204
    //   118: aload #7
    //   120: instanceof net/minecraft/world/entity/LivingEntity
    //   123: ifeq -> 144
    //   126: aload #7
    //   128: checkcast net/minecraft/world/entity/LivingEntity
    //   131: astore #13
    //   133: aload #13
    //   135: getstatic net/minecraft/world/entity/EquipmentSlot.LEGS : Lnet/minecraft/world/entity/EquipmentSlot;
    //   138: invokevirtual getItemBySlot : (Lnet/minecraft/world/entity/EquipmentSlot;)Lnet/minecraft/world/item/ItemStack;
    //   141: goto -> 147
    //   144: getstatic net/minecraft/world/item/ItemStack.EMPTY : Lnet/minecraft/world/item/ItemStack;
    //   147: invokevirtual getItem : ()Lnet/minecraft/world/item/Item;
    //   150: getstatic net/mcreator/latexes/init/LatexModItems.HAZMAT_LEGGINGS : Lnet/minecraftforge/registries/RegistryObject;
    //   153: invokevirtual get : ()Ljava/lang/Object;
    //   156: if_acmpne -> 204
    //   159: aload #7
    //   161: instanceof net/minecraft/world/entity/LivingEntity
    //   164: ifeq -> 185
    //   167: aload #7
    //   169: checkcast net/minecraft/world/entity/LivingEntity
    //   172: astore #14
    //   174: aload #14
    //   176: getstatic net/minecraft/world/entity/EquipmentSlot.FEET : Lnet/minecraft/world/entity/EquipmentSlot;
    //   179: invokevirtual getItemBySlot : (Lnet/minecraft/world/entity/EquipmentSlot;)Lnet/minecraft/world/item/ItemStack;
    //   182: goto -> 188
    //   185: getstatic net/minecraft/world/item/ItemStack.EMPTY : Lnet/minecraft/world/item/ItemStack;
    //   188: invokevirtual getItem : ()Lnet/minecraft/world/item/Item;
    //   191: getstatic net/mcreator/latexes/init/LatexModItems.HAZMAT_BOOTS : Lnet/minecraftforge/registries/RegistryObject;
    //   194: invokevirtual get : ()Ljava/lang/Object;
    //   197: if_acmpne -> 204
    //   200: iconst_1
    //   201: goto -> 205
    //   204: iconst_0
    //   205: iconst_1
    //   206: if_icmpeq -> 3945
    //   209: aload #7
    //   211: invokevirtual getType : ()Lnet/minecraft/world/entity/EntityType;
    //   214: getstatic net/minecraft/core/Registry.ENTITY_TYPE_REGISTRY : Lnet/minecraft/resources/ResourceKey;
    //   217: new net/minecraft/resources/ResourceLocation
    //   220: dup
    //   221: ldc 'latex:robots'
    //   223: invokespecial <init> : (Ljava/lang/String;)V
    //   226: invokestatic create : (Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraft/tags/TagKey;
    //   229: invokevirtual is : (Lnet/minecraft/tags/TagKey;)Z
    //   232: ifne -> 243
    //   235: aload #7
    //   237: instanceof net/minecraft/world/entity/player/Player
    //   240: ifeq -> 245
    //   243: iconst_1
    //   244: ireturn
    //   245: aload #7
    //   247: instanceof net/minecraft/world/entity/FlyingMob
    //   250: iconst_1
    //   251: if_icmpne -> 1192
    //   254: invokestatic random : ()D
    //   257: ldc2_w 0.3
    //   260: dcmpg
    //   261: ifge -> 487
    //   264: aload #7
    //   266: getfield level : Lnet/minecraft/world/level/Level;
    //   269: invokevirtual isClientSide : ()Z
    //   272: ifne -> 280
    //   275: aload #7
    //   277: invokevirtual discard : ()V
    //   280: aload_0
    //   281: instanceof net/minecraft/world/level/Level
    //   284: ifeq -> 381
    //   287: aload_0
    //   288: checkcast net/minecraft/world/level/Level
    //   291: astore #15
    //   293: aload #15
    //   295: invokevirtual isClientSide : ()Z
    //   298: ifne -> 346
    //   301: aload #15
    //   303: aconst_null
    //   304: new net/minecraft/core/BlockPos
    //   307: dup
    //   308: dload_1
    //   309: dload_3
    //   310: dload #5
    //   312: invokespecial <init> : (DDD)V
    //   315: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   318: new net/minecraft/resources/ResourceLocation
    //   321: dup
    //   322: ldc 'latex:transfur'
    //   324: invokespecial <init> : (Ljava/lang/String;)V
    //   327: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   332: checkcast net/minecraft/sounds/SoundEvent
    //   335: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   338: fconst_1
    //   339: fconst_1
    //   340: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   343: goto -> 381
    //   346: aload #15
    //   348: dload_1
    //   349: dload_3
    //   350: dload #5
    //   352: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   355: new net/minecraft/resources/ResourceLocation
    //   358: dup
    //   359: ldc 'latex:transfur'
    //   361: invokespecial <init> : (Ljava/lang/String;)V
    //   364: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   369: checkcast net/minecraft/sounds/SoundEvent
    //   372: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   375: fconst_1
    //   376: fconst_1
    //   377: iconst_0
    //   378: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   381: aload_0
    //   382: instanceof net/minecraft/server/level/ServerLevel
    //   385: ifeq -> 484
    //   388: aload_0
    //   389: checkcast net/minecraft/server/level/ServerLevel
    //   392: astore #15
    //   394: new net/mcreator/latexes/entity/YufengEntity
    //   397: dup
    //   398: getstatic net/mcreator/latexes/init/LatexModEntities.YUFENG : Lnet/minecraftforge/registries/RegistryObject;
    //   401: invokevirtual get : ()Ljava/lang/Object;
    //   404: checkcast net/minecraft/world/entity/EntityType
    //   407: aload #15
    //   409: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   412: astore #16
    //   414: aload #16
    //   416: dload_1
    //   417: dload_3
    //   418: dload #5
    //   420: aload_0
    //   421: invokeinterface getRandom : ()Ljava/util/Random;
    //   426: invokevirtual nextFloat : ()F
    //   429: ldc 360.0
    //   431: fmul
    //   432: fconst_0
    //   433: invokevirtual moveTo : (DDDFF)V
    //   436: aload #16
    //   438: instanceof net/minecraft/world/entity/Mob
    //   441: ifeq -> 475
    //   444: aload #16
    //   446: checkcast net/minecraft/world/entity/Mob
    //   449: astore #17
    //   451: aload #17
    //   453: aload #15
    //   455: aload_0
    //   456: aload #16
    //   458: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   461: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   466: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   469: aconst_null
    //   470: aconst_null
    //   471: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   474: pop
    //   475: aload_0
    //   476: aload #16
    //   478: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   483: pop
    //   484: goto -> 3955
    //   487: invokestatic random : ()D
    //   490: ldc2_w 0.3
    //   493: dcmpg
    //   494: ifge -> 720
    //   497: aload #7
    //   499: getfield level : Lnet/minecraft/world/level/Level;
    //   502: invokevirtual isClientSide : ()Z
    //   505: ifne -> 513
    //   508: aload #7
    //   510: invokevirtual discard : ()V
    //   513: aload_0
    //   514: instanceof net/minecraft/world/level/Level
    //   517: ifeq -> 614
    //   520: aload_0
    //   521: checkcast net/minecraft/world/level/Level
    //   524: astore #15
    //   526: aload #15
    //   528: invokevirtual isClientSide : ()Z
    //   531: ifne -> 579
    //   534: aload #15
    //   536: aconst_null
    //   537: new net/minecraft/core/BlockPos
    //   540: dup
    //   541: dload_1
    //   542: dload_3
    //   543: dload #5
    //   545: invokespecial <init> : (DDD)V
    //   548: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   551: new net/minecraft/resources/ResourceLocation
    //   554: dup
    //   555: ldc 'latex:transfur'
    //   557: invokespecial <init> : (Ljava/lang/String;)V
    //   560: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   565: checkcast net/minecraft/sounds/SoundEvent
    //   568: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   571: fconst_1
    //   572: fconst_1
    //   573: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   576: goto -> 614
    //   579: aload #15
    //   581: dload_1
    //   582: dload_3
    //   583: dload #5
    //   585: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   588: new net/minecraft/resources/ResourceLocation
    //   591: dup
    //   592: ldc 'latex:transfur'
    //   594: invokespecial <init> : (Ljava/lang/String;)V
    //   597: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   602: checkcast net/minecraft/sounds/SoundEvent
    //   605: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   608: fconst_1
    //   609: fconst_1
    //   610: iconst_0
    //   611: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   614: aload_0
    //   615: instanceof net/minecraft/server/level/ServerLevel
    //   618: ifeq -> 717
    //   621: aload_0
    //   622: checkcast net/minecraft/server/level/ServerLevel
    //   625: astore #15
    //   627: new net/mcreator/latexes/entity/DarkLatexMothEntity
    //   630: dup
    //   631: getstatic net/mcreator/latexes/init/LatexModEntities.DARK_LATEX_MOTH : Lnet/minecraftforge/registries/RegistryObject;
    //   634: invokevirtual get : ()Ljava/lang/Object;
    //   637: checkcast net/minecraft/world/entity/EntityType
    //   640: aload #15
    //   642: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   645: astore #16
    //   647: aload #16
    //   649: dload_1
    //   650: dload_3
    //   651: dload #5
    //   653: aload_0
    //   654: invokeinterface getRandom : ()Ljava/util/Random;
    //   659: invokevirtual nextFloat : ()F
    //   662: ldc 360.0
    //   664: fmul
    //   665: fconst_0
    //   666: invokevirtual moveTo : (DDDFF)V
    //   669: aload #16
    //   671: instanceof net/minecraft/world/entity/Mob
    //   674: ifeq -> 708
    //   677: aload #16
    //   679: checkcast net/minecraft/world/entity/Mob
    //   682: astore #17
    //   684: aload #17
    //   686: aload #15
    //   688: aload_0
    //   689: aload #16
    //   691: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   694: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   699: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   702: aconst_null
    //   703: aconst_null
    //   704: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   707: pop
    //   708: aload_0
    //   709: aload #16
    //   711: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   716: pop
    //   717: goto -> 3955
    //   720: invokestatic random : ()D
    //   723: ldc2_w 0.3
    //   726: dcmpg
    //   727: ifge -> 953
    //   730: aload #7
    //   732: getfield level : Lnet/minecraft/world/level/Level;
    //   735: invokevirtual isClientSide : ()Z
    //   738: ifne -> 746
    //   741: aload #7
    //   743: invokevirtual discard : ()V
    //   746: aload_0
    //   747: instanceof net/minecraft/world/level/Level
    //   750: ifeq -> 847
    //   753: aload_0
    //   754: checkcast net/minecraft/world/level/Level
    //   757: astore #15
    //   759: aload #15
    //   761: invokevirtual isClientSide : ()Z
    //   764: ifne -> 812
    //   767: aload #15
    //   769: aconst_null
    //   770: new net/minecraft/core/BlockPos
    //   773: dup
    //   774: dload_1
    //   775: dload_3
    //   776: dload #5
    //   778: invokespecial <init> : (DDD)V
    //   781: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   784: new net/minecraft/resources/ResourceLocation
    //   787: dup
    //   788: ldc 'latex:transfur'
    //   790: invokespecial <init> : (Ljava/lang/String;)V
    //   793: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   798: checkcast net/minecraft/sounds/SoundEvent
    //   801: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   804: fconst_1
    //   805: fconst_1
    //   806: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   809: goto -> 847
    //   812: aload #15
    //   814: dload_1
    //   815: dload_3
    //   816: dload #5
    //   818: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   821: new net/minecraft/resources/ResourceLocation
    //   824: dup
    //   825: ldc 'latex:transfur'
    //   827: invokespecial <init> : (Ljava/lang/String;)V
    //   830: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   835: checkcast net/minecraft/sounds/SoundEvent
    //   838: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   841: fconst_1
    //   842: fconst_1
    //   843: iconst_0
    //   844: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   847: aload_0
    //   848: instanceof net/minecraft/server/level/ServerLevel
    //   851: ifeq -> 950
    //   854: aload_0
    //   855: checkcast net/minecraft/server/level/ServerLevel
    //   858: astore #15
    //   860: new net/mcreator/latexes/entity/DLbeeEntity
    //   863: dup
    //   864: getstatic net/mcreator/latexes/init/LatexModEntities.D_LBEE : Lnet/minecraftforge/registries/RegistryObject;
    //   867: invokevirtual get : ()Ljava/lang/Object;
    //   870: checkcast net/minecraft/world/entity/EntityType
    //   873: aload #15
    //   875: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   878: astore #16
    //   880: aload #16
    //   882: dload_1
    //   883: dload_3
    //   884: dload #5
    //   886: aload_0
    //   887: invokeinterface getRandom : ()Ljava/util/Random;
    //   892: invokevirtual nextFloat : ()F
    //   895: ldc 360.0
    //   897: fmul
    //   898: fconst_0
    //   899: invokevirtual moveTo : (DDDFF)V
    //   902: aload #16
    //   904: instanceof net/minecraft/world/entity/Mob
    //   907: ifeq -> 941
    //   910: aload #16
    //   912: checkcast net/minecraft/world/entity/Mob
    //   915: astore #17
    //   917: aload #17
    //   919: aload #15
    //   921: aload_0
    //   922: aload #16
    //   924: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   927: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   932: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   935: aconst_null
    //   936: aconst_null
    //   937: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   940: pop
    //   941: aload_0
    //   942: aload #16
    //   944: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   949: pop
    //   950: goto -> 3955
    //   953: aload #7
    //   955: getfield level : Lnet/minecraft/world/level/Level;
    //   958: invokevirtual isClientSide : ()Z
    //   961: ifne -> 969
    //   964: aload #7
    //   966: invokevirtual discard : ()V
    //   969: aload #8
    //   971: getfield level : Lnet/minecraft/world/level/Level;
    //   974: invokevirtual isClientSide : ()Z
    //   977: ifne -> 985
    //   980: aload #8
    //   982: invokevirtual discard : ()V
    //   985: aload_0
    //   986: instanceof net/minecraft/world/level/Level
    //   989: ifeq -> 1086
    //   992: aload_0
    //   993: checkcast net/minecraft/world/level/Level
    //   996: astore #15
    //   998: aload #15
    //   1000: invokevirtual isClientSide : ()Z
    //   1003: ifne -> 1051
    //   1006: aload #15
    //   1008: aconst_null
    //   1009: new net/minecraft/core/BlockPos
    //   1012: dup
    //   1013: dload_1
    //   1014: dload_3
    //   1015: dload #5
    //   1017: invokespecial <init> : (DDD)V
    //   1020: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   1023: new net/minecraft/resources/ResourceLocation
    //   1026: dup
    //   1027: ldc 'latex:transfur'
    //   1029: invokespecial <init> : (Ljava/lang/String;)V
    //   1032: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   1037: checkcast net/minecraft/sounds/SoundEvent
    //   1040: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   1043: fconst_1
    //   1044: fconst_1
    //   1045: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   1048: goto -> 1086
    //   1051: aload #15
    //   1053: dload_1
    //   1054: dload_3
    //   1055: dload #5
    //   1057: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   1060: new net/minecraft/resources/ResourceLocation
    //   1063: dup
    //   1064: ldc 'latex:transfur'
    //   1066: invokespecial <init> : (Ljava/lang/String;)V
    //   1069: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   1074: checkcast net/minecraft/sounds/SoundEvent
    //   1077: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   1080: fconst_1
    //   1081: fconst_1
    //   1082: iconst_0
    //   1083: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   1086: aload_0
    //   1087: instanceof net/minecraft/server/level/ServerLevel
    //   1090: ifeq -> 1189
    //   1093: aload_0
    //   1094: checkcast net/minecraft/server/level/ServerLevel
    //   1097: astore #15
    //   1099: new net/mcreator/latexes/entity/YufengEntity
    //   1102: dup
    //   1103: getstatic net/mcreator/latexes/init/LatexModEntities.YUFENG : Lnet/minecraftforge/registries/RegistryObject;
    //   1106: invokevirtual get : ()Ljava/lang/Object;
    //   1109: checkcast net/minecraft/world/entity/EntityType
    //   1112: aload #15
    //   1114: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   1117: astore #16
    //   1119: aload #16
    //   1121: dload_1
    //   1122: dload_3
    //   1123: dload #5
    //   1125: aload_0
    //   1126: invokeinterface getRandom : ()Ljava/util/Random;
    //   1131: invokevirtual nextFloat : ()F
    //   1134: ldc 360.0
    //   1136: fmul
    //   1137: fconst_0
    //   1138: invokevirtual moveTo : (DDDFF)V
    //   1141: aload #16
    //   1143: instanceof net/minecraft/world/entity/Mob
    //   1146: ifeq -> 1180
    //   1149: aload #16
    //   1151: checkcast net/minecraft/world/entity/Mob
    //   1154: astore #17
    //   1156: aload #17
    //   1158: aload #15
    //   1160: aload_0
    //   1161: aload #16
    //   1163: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   1166: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   1171: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   1174: aconst_null
    //   1175: aconst_null
    //   1176: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   1179: pop
    //   1180: aload_0
    //   1181: aload #16
    //   1183: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   1188: pop
    //   1189: goto -> 3955
    //   1192: aload #7
    //   1194: instanceof net/minecraft/world/entity/animal/WaterAnimal
    //   1197: iconst_1
    //   1198: if_icmpne -> 1906
    //   1201: invokestatic random : ()D
    //   1204: ldc2_w 0.3
    //   1207: dcmpg
    //   1208: ifge -> 1434
    //   1211: aload #7
    //   1213: getfield level : Lnet/minecraft/world/level/Level;
    //   1216: invokevirtual isClientSide : ()Z
    //   1219: ifne -> 1227
    //   1222: aload #7
    //   1224: invokevirtual discard : ()V
    //   1227: aload_0
    //   1228: instanceof net/minecraft/world/level/Level
    //   1231: ifeq -> 1328
    //   1234: aload_0
    //   1235: checkcast net/minecraft/world/level/Level
    //   1238: astore #15
    //   1240: aload #15
    //   1242: invokevirtual isClientSide : ()Z
    //   1245: ifne -> 1293
    //   1248: aload #15
    //   1250: aconst_null
    //   1251: new net/minecraft/core/BlockPos
    //   1254: dup
    //   1255: dload_1
    //   1256: dload_3
    //   1257: dload #5
    //   1259: invokespecial <init> : (DDD)V
    //   1262: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   1265: new net/minecraft/resources/ResourceLocation
    //   1268: dup
    //   1269: ldc 'latex:transfur'
    //   1271: invokespecial <init> : (Ljava/lang/String;)V
    //   1274: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   1279: checkcast net/minecraft/sounds/SoundEvent
    //   1282: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   1285: fconst_1
    //   1286: fconst_1
    //   1287: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   1290: goto -> 1328
    //   1293: aload #15
    //   1295: dload_1
    //   1296: dload_3
    //   1297: dload #5
    //   1299: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   1302: new net/minecraft/resources/ResourceLocation
    //   1305: dup
    //   1306: ldc 'latex:transfur'
    //   1308: invokespecial <init> : (Ljava/lang/String;)V
    //   1311: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   1316: checkcast net/minecraft/sounds/SoundEvent
    //   1319: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   1322: fconst_1
    //   1323: fconst_1
    //   1324: iconst_0
    //   1325: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   1328: aload_0
    //   1329: instanceof net/minecraft/server/level/ServerLevel
    //   1332: ifeq -> 1431
    //   1335: aload_0
    //   1336: checkcast net/minecraft/server/level/ServerLevel
    //   1339: astore #15
    //   1341: new net/mcreator/latexes/entity/DlsharkEntity
    //   1344: dup
    //   1345: getstatic net/mcreator/latexes/init/LatexModEntities.DLSHARK : Lnet/minecraftforge/registries/RegistryObject;
    //   1348: invokevirtual get : ()Ljava/lang/Object;
    //   1351: checkcast net/minecraft/world/entity/EntityType
    //   1354: aload #15
    //   1356: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   1359: astore #16
    //   1361: aload #16
    //   1363: dload_1
    //   1364: dload_3
    //   1365: dload #5
    //   1367: aload_0
    //   1368: invokeinterface getRandom : ()Ljava/util/Random;
    //   1373: invokevirtual nextFloat : ()F
    //   1376: ldc 360.0
    //   1378: fmul
    //   1379: fconst_0
    //   1380: invokevirtual moveTo : (DDDFF)V
    //   1383: aload #16
    //   1385: instanceof net/minecraft/world/entity/Mob
    //   1388: ifeq -> 1422
    //   1391: aload #16
    //   1393: checkcast net/minecraft/world/entity/Mob
    //   1396: astore #17
    //   1398: aload #17
    //   1400: aload #15
    //   1402: aload_0
    //   1403: aload #16
    //   1405: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   1408: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   1413: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   1416: aconst_null
    //   1417: aconst_null
    //   1418: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   1421: pop
    //   1422: aload_0
    //   1423: aload #16
    //   1425: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   1430: pop
    //   1431: goto -> 3955
    //   1434: invokestatic random : ()D
    //   1437: ldc2_w 0.2
    //   1440: dcmpg
    //   1441: ifge -> 1667
    //   1444: aload #7
    //   1446: getfield level : Lnet/minecraft/world/level/Level;
    //   1449: invokevirtual isClientSide : ()Z
    //   1452: ifne -> 1460
    //   1455: aload #7
    //   1457: invokevirtual discard : ()V
    //   1460: aload_0
    //   1461: instanceof net/minecraft/world/level/Level
    //   1464: ifeq -> 1561
    //   1467: aload_0
    //   1468: checkcast net/minecraft/world/level/Level
    //   1471: astore #15
    //   1473: aload #15
    //   1475: invokevirtual isClientSide : ()Z
    //   1478: ifne -> 1526
    //   1481: aload #15
    //   1483: aconst_null
    //   1484: new net/minecraft/core/BlockPos
    //   1487: dup
    //   1488: dload_1
    //   1489: dload_3
    //   1490: dload #5
    //   1492: invokespecial <init> : (DDD)V
    //   1495: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   1498: new net/minecraft/resources/ResourceLocation
    //   1501: dup
    //   1502: ldc 'latex:transfur'
    //   1504: invokespecial <init> : (Ljava/lang/String;)V
    //   1507: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   1512: checkcast net/minecraft/sounds/SoundEvent
    //   1515: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   1518: fconst_1
    //   1519: fconst_1
    //   1520: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   1523: goto -> 1561
    //   1526: aload #15
    //   1528: dload_1
    //   1529: dload_3
    //   1530: dload #5
    //   1532: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   1535: new net/minecraft/resources/ResourceLocation
    //   1538: dup
    //   1539: ldc 'latex:transfur'
    //   1541: invokespecial <init> : (Ljava/lang/String;)V
    //   1544: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   1549: checkcast net/minecraft/sounds/SoundEvent
    //   1552: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   1555: fconst_1
    //   1556: fconst_1
    //   1557: iconst_0
    //   1558: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   1561: aload_0
    //   1562: instanceof net/minecraft/server/level/ServerLevel
    //   1565: ifeq -> 1664
    //   1568: aload_0
    //   1569: checkcast net/minecraft/server/level/ServerLevel
    //   1572: astore #15
    //   1574: new net/mcreator/latexes/entity/DlSquidDogEntity
    //   1577: dup
    //   1578: getstatic net/mcreator/latexes/init/LatexModEntities.DL_SQUID_DOG : Lnet/minecraftforge/registries/RegistryObject;
    //   1581: invokevirtual get : ()Ljava/lang/Object;
    //   1584: checkcast net/minecraft/world/entity/EntityType
    //   1587: aload #15
    //   1589: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   1592: astore #16
    //   1594: aload #16
    //   1596: dload_1
    //   1597: dload_3
    //   1598: dload #5
    //   1600: aload_0
    //   1601: invokeinterface getRandom : ()Ljava/util/Random;
    //   1606: invokevirtual nextFloat : ()F
    //   1609: ldc 360.0
    //   1611: fmul
    //   1612: fconst_0
    //   1613: invokevirtual moveTo : (DDDFF)V
    //   1616: aload #16
    //   1618: instanceof net/minecraft/world/entity/Mob
    //   1621: ifeq -> 1655
    //   1624: aload #16
    //   1626: checkcast net/minecraft/world/entity/Mob
    //   1629: astore #17
    //   1631: aload #17
    //   1633: aload #15
    //   1635: aload_0
    //   1636: aload #16
    //   1638: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   1641: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   1646: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   1649: aconst_null
    //   1650: aconst_null
    //   1651: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   1654: pop
    //   1655: aload_0
    //   1656: aload #16
    //   1658: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   1663: pop
    //   1664: goto -> 3955
    //   1667: aload #7
    //   1669: getfield level : Lnet/minecraft/world/level/Level;
    //   1672: invokevirtual isClientSide : ()Z
    //   1675: ifne -> 1683
    //   1678: aload #7
    //   1680: invokevirtual discard : ()V
    //   1683: aload #8
    //   1685: getfield level : Lnet/minecraft/world/level/Level;
    //   1688: invokevirtual isClientSide : ()Z
    //   1691: ifne -> 1699
    //   1694: aload #8
    //   1696: invokevirtual discard : ()V
    //   1699: aload_0
    //   1700: instanceof net/minecraft/world/level/Level
    //   1703: ifeq -> 1800
    //   1706: aload_0
    //   1707: checkcast net/minecraft/world/level/Level
    //   1710: astore #15
    //   1712: aload #15
    //   1714: invokevirtual isClientSide : ()Z
    //   1717: ifne -> 1765
    //   1720: aload #15
    //   1722: aconst_null
    //   1723: new net/minecraft/core/BlockPos
    //   1726: dup
    //   1727: dload_1
    //   1728: dload_3
    //   1729: dload #5
    //   1731: invokespecial <init> : (DDD)V
    //   1734: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   1737: new net/minecraft/resources/ResourceLocation
    //   1740: dup
    //   1741: ldc 'latex:transfur'
    //   1743: invokespecial <init> : (Ljava/lang/String;)V
    //   1746: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   1751: checkcast net/minecraft/sounds/SoundEvent
    //   1754: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   1757: fconst_1
    //   1758: fconst_1
    //   1759: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   1762: goto -> 1800
    //   1765: aload #15
    //   1767: dload_1
    //   1768: dload_3
    //   1769: dload #5
    //   1771: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   1774: new net/minecraft/resources/ResourceLocation
    //   1777: dup
    //   1778: ldc 'latex:transfur'
    //   1780: invokespecial <init> : (Ljava/lang/String;)V
    //   1783: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   1788: checkcast net/minecraft/sounds/SoundEvent
    //   1791: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   1794: fconst_1
    //   1795: fconst_1
    //   1796: iconst_0
    //   1797: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   1800: aload_0
    //   1801: instanceof net/minecraft/server/level/ServerLevel
    //   1804: ifeq -> 1903
    //   1807: aload_0
    //   1808: checkcast net/minecraft/server/level/ServerLevel
    //   1811: astore #15
    //   1813: new net/mcreator/latexes/entity/DlsharkEntity
    //   1816: dup
    //   1817: getstatic net/mcreator/latexes/init/LatexModEntities.DLSHARK : Lnet/minecraftforge/registries/RegistryObject;
    //   1820: invokevirtual get : ()Ljava/lang/Object;
    //   1823: checkcast net/minecraft/world/entity/EntityType
    //   1826: aload #15
    //   1828: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   1831: astore #16
    //   1833: aload #16
    //   1835: dload_1
    //   1836: dload_3
    //   1837: dload #5
    //   1839: aload_0
    //   1840: invokeinterface getRandom : ()Ljava/util/Random;
    //   1845: invokevirtual nextFloat : ()F
    //   1848: ldc 360.0
    //   1850: fmul
    //   1851: fconst_0
    //   1852: invokevirtual moveTo : (DDDFF)V
    //   1855: aload #16
    //   1857: instanceof net/minecraft/world/entity/Mob
    //   1860: ifeq -> 1894
    //   1863: aload #16
    //   1865: checkcast net/minecraft/world/entity/Mob
    //   1868: astore #17
    //   1870: aload #17
    //   1872: aload #15
    //   1874: aload_0
    //   1875: aload #16
    //   1877: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   1880: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   1885: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   1888: aconst_null
    //   1889: aconst_null
    //   1890: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   1893: pop
    //   1894: aload_0
    //   1895: aload #16
    //   1897: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   1902: pop
    //   1903: goto -> 3955
    //   1906: aload #7
    //   1908: instanceof net/minecraft/world/entity/animal/Fox
    //   1911: iconst_1
    //   1912: if_icmpne -> 2138
    //   1915: aload #7
    //   1917: getfield level : Lnet/minecraft/world/level/Level;
    //   1920: invokevirtual isClientSide : ()Z
    //   1923: ifne -> 1931
    //   1926: aload #7
    //   1928: invokevirtual discard : ()V
    //   1931: aload_0
    //   1932: instanceof net/minecraft/world/level/Level
    //   1935: ifeq -> 2032
    //   1938: aload_0
    //   1939: checkcast net/minecraft/world/level/Level
    //   1942: astore #15
    //   1944: aload #15
    //   1946: invokevirtual isClientSide : ()Z
    //   1949: ifne -> 1997
    //   1952: aload #15
    //   1954: aconst_null
    //   1955: new net/minecraft/core/BlockPos
    //   1958: dup
    //   1959: dload_1
    //   1960: dload_3
    //   1961: dload #5
    //   1963: invokespecial <init> : (DDD)V
    //   1966: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   1969: new net/minecraft/resources/ResourceLocation
    //   1972: dup
    //   1973: ldc 'latex:transfur'
    //   1975: invokespecial <init> : (Ljava/lang/String;)V
    //   1978: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   1983: checkcast net/minecraft/sounds/SoundEvent
    //   1986: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   1989: fconst_1
    //   1990: fconst_1
    //   1991: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   1994: goto -> 2032
    //   1997: aload #15
    //   1999: dload_1
    //   2000: dload_3
    //   2001: dload #5
    //   2003: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   2006: new net/minecraft/resources/ResourceLocation
    //   2009: dup
    //   2010: ldc 'latex:transfur'
    //   2012: invokespecial <init> : (Ljava/lang/String;)V
    //   2015: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   2020: checkcast net/minecraft/sounds/SoundEvent
    //   2023: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   2026: fconst_1
    //   2027: fconst_1
    //   2028: iconst_0
    //   2029: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   2032: aload_0
    //   2033: instanceof net/minecraft/server/level/ServerLevel
    //   2036: ifeq -> 2135
    //   2039: aload_0
    //   2040: checkcast net/minecraft/server/level/ServerLevel
    //   2043: astore #15
    //   2045: new net/mcreator/latexes/entity/DarkLatexFoxEntity
    //   2048: dup
    //   2049: getstatic net/mcreator/latexes/init/LatexModEntities.DARK_LATEX_FOX : Lnet/minecraftforge/registries/RegistryObject;
    //   2052: invokevirtual get : ()Ljava/lang/Object;
    //   2055: checkcast net/minecraft/world/entity/EntityType
    //   2058: aload #15
    //   2060: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   2063: astore #16
    //   2065: aload #16
    //   2067: dload_1
    //   2068: dload_3
    //   2069: dload #5
    //   2071: aload_0
    //   2072: invokeinterface getRandom : ()Ljava/util/Random;
    //   2077: invokevirtual nextFloat : ()F
    //   2080: ldc 360.0
    //   2082: fmul
    //   2083: fconst_0
    //   2084: invokevirtual moveTo : (DDDFF)V
    //   2087: aload #16
    //   2089: instanceof net/minecraft/world/entity/Mob
    //   2092: ifeq -> 2126
    //   2095: aload #16
    //   2097: checkcast net/minecraft/world/entity/Mob
    //   2100: astore #17
    //   2102: aload #17
    //   2104: aload #15
    //   2106: aload_0
    //   2107: aload #16
    //   2109: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   2112: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   2117: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   2120: aconst_null
    //   2121: aconst_null
    //   2122: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   2125: pop
    //   2126: aload_0
    //   2127: aload #16
    //   2129: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   2134: pop
    //   2135: goto -> 3955
    //   2138: aload #7
    //   2140: instanceof net/minecraft/world/entity/monster/Skeleton
    //   2143: ifne -> 2154
    //   2146: aload #7
    //   2148: instanceof net/minecraft/world/entity/monster/WitherSkeleton
    //   2151: ifeq -> 2158
    //   2154: iconst_1
    //   2155: goto -> 2159
    //   2158: iconst_0
    //   2159: iconst_1
    //   2160: if_icmpne -> 2386
    //   2163: aload #7
    //   2165: getfield level : Lnet/minecraft/world/level/Level;
    //   2168: invokevirtual isClientSide : ()Z
    //   2171: ifne -> 2179
    //   2174: aload #7
    //   2176: invokevirtual discard : ()V
    //   2179: aload_0
    //   2180: instanceof net/minecraft/world/level/Level
    //   2183: ifeq -> 2280
    //   2186: aload_0
    //   2187: checkcast net/minecraft/world/level/Level
    //   2190: astore #15
    //   2192: aload #15
    //   2194: invokevirtual isClientSide : ()Z
    //   2197: ifne -> 2245
    //   2200: aload #15
    //   2202: aconst_null
    //   2203: new net/minecraft/core/BlockPos
    //   2206: dup
    //   2207: dload_1
    //   2208: dload_3
    //   2209: dload #5
    //   2211: invokespecial <init> : (DDD)V
    //   2214: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   2217: new net/minecraft/resources/ResourceLocation
    //   2220: dup
    //   2221: ldc 'latex:transfur'
    //   2223: invokespecial <init> : (Ljava/lang/String;)V
    //   2226: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   2231: checkcast net/minecraft/sounds/SoundEvent
    //   2234: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   2237: fconst_1
    //   2238: fconst_1
    //   2239: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   2242: goto -> 2280
    //   2245: aload #15
    //   2247: dload_1
    //   2248: dload_3
    //   2249: dload #5
    //   2251: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   2254: new net/minecraft/resources/ResourceLocation
    //   2257: dup
    //   2258: ldc 'latex:transfur'
    //   2260: invokespecial <init> : (Ljava/lang/String;)V
    //   2263: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   2268: checkcast net/minecraft/sounds/SoundEvent
    //   2271: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   2274: fconst_1
    //   2275: fconst_1
    //   2276: iconst_0
    //   2277: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   2280: aload_0
    //   2281: instanceof net/minecraft/server/level/ServerLevel
    //   2284: ifeq -> 2383
    //   2287: aload_0
    //   2288: checkcast net/minecraft/server/level/ServerLevel
    //   2291: astore #15
    //   2293: new net/mcreator/latexes/entity/DarkLatexSkeletonEntity
    //   2296: dup
    //   2297: getstatic net/mcreator/latexes/init/LatexModEntities.DARK_LATEX_SKELETON : Lnet/minecraftforge/registries/RegistryObject;
    //   2300: invokevirtual get : ()Ljava/lang/Object;
    //   2303: checkcast net/minecraft/world/entity/EntityType
    //   2306: aload #15
    //   2308: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   2311: astore #16
    //   2313: aload #16
    //   2315: dload_1
    //   2316: dload_3
    //   2317: dload #5
    //   2319: aload_0
    //   2320: invokeinterface getRandom : ()Ljava/util/Random;
    //   2325: invokevirtual nextFloat : ()F
    //   2328: ldc 360.0
    //   2330: fmul
    //   2331: fconst_0
    //   2332: invokevirtual moveTo : (DDDFF)V
    //   2335: aload #16
    //   2337: instanceof net/minecraft/world/entity/Mob
    //   2340: ifeq -> 2374
    //   2343: aload #16
    //   2345: checkcast net/minecraft/world/entity/Mob
    //   2348: astore #17
    //   2350: aload #17
    //   2352: aload #15
    //   2354: aload_0
    //   2355: aload #16
    //   2357: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   2360: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   2365: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   2368: aconst_null
    //   2369: aconst_null
    //   2370: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   2373: pop
    //   2374: aload_0
    //   2375: aload #16
    //   2377: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   2382: pop
    //   2383: goto -> 3955
    //   2386: aload #7
    //   2388: instanceof net/minecraft/world/entity/animal/Bee
    //   2391: iconst_1
    //   2392: if_icmpne -> 2618
    //   2395: aload #7
    //   2397: getfield level : Lnet/minecraft/world/level/Level;
    //   2400: invokevirtual isClientSide : ()Z
    //   2403: ifne -> 2411
    //   2406: aload #7
    //   2408: invokevirtual discard : ()V
    //   2411: aload_0
    //   2412: instanceof net/minecraft/world/level/Level
    //   2415: ifeq -> 2512
    //   2418: aload_0
    //   2419: checkcast net/minecraft/world/level/Level
    //   2422: astore #15
    //   2424: aload #15
    //   2426: invokevirtual isClientSide : ()Z
    //   2429: ifne -> 2477
    //   2432: aload #15
    //   2434: aconst_null
    //   2435: new net/minecraft/core/BlockPos
    //   2438: dup
    //   2439: dload_1
    //   2440: dload_3
    //   2441: dload #5
    //   2443: invokespecial <init> : (DDD)V
    //   2446: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   2449: new net/minecraft/resources/ResourceLocation
    //   2452: dup
    //   2453: ldc 'latex:transfur'
    //   2455: invokespecial <init> : (Ljava/lang/String;)V
    //   2458: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   2463: checkcast net/minecraft/sounds/SoundEvent
    //   2466: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   2469: fconst_1
    //   2470: fconst_1
    //   2471: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   2474: goto -> 2512
    //   2477: aload #15
    //   2479: dload_1
    //   2480: dload_3
    //   2481: dload #5
    //   2483: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   2486: new net/minecraft/resources/ResourceLocation
    //   2489: dup
    //   2490: ldc 'latex:transfur'
    //   2492: invokespecial <init> : (Ljava/lang/String;)V
    //   2495: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   2500: checkcast net/minecraft/sounds/SoundEvent
    //   2503: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   2506: fconst_1
    //   2507: fconst_1
    //   2508: iconst_0
    //   2509: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   2512: aload_0
    //   2513: instanceof net/minecraft/server/level/ServerLevel
    //   2516: ifeq -> 2615
    //   2519: aload_0
    //   2520: checkcast net/minecraft/server/level/ServerLevel
    //   2523: astore #15
    //   2525: new net/mcreator/latexes/entity/DLbeeEntity
    //   2528: dup
    //   2529: getstatic net/mcreator/latexes/init/LatexModEntities.D_LBEE : Lnet/minecraftforge/registries/RegistryObject;
    //   2532: invokevirtual get : ()Ljava/lang/Object;
    //   2535: checkcast net/minecraft/world/entity/EntityType
    //   2538: aload #15
    //   2540: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   2543: astore #16
    //   2545: aload #16
    //   2547: dload_1
    //   2548: dload_3
    //   2549: dload #5
    //   2551: aload_0
    //   2552: invokeinterface getRandom : ()Ljava/util/Random;
    //   2557: invokevirtual nextFloat : ()F
    //   2560: ldc 360.0
    //   2562: fmul
    //   2563: fconst_0
    //   2564: invokevirtual moveTo : (DDDFF)V
    //   2567: aload #16
    //   2569: instanceof net/minecraft/world/entity/Mob
    //   2572: ifeq -> 2606
    //   2575: aload #16
    //   2577: checkcast net/minecraft/world/entity/Mob
    //   2580: astore #17
    //   2582: aload #17
    //   2584: aload #15
    //   2586: aload_0
    //   2587: aload #16
    //   2589: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   2592: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   2597: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   2600: aconst_null
    //   2601: aconst_null
    //   2602: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   2605: pop
    //   2606: aload_0
    //   2607: aload #16
    //   2609: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   2614: pop
    //   2615: goto -> 3955
    //   2618: aload #7
    //   2620: instanceof net/mcreator/latexes/entity/ScientistEntity
    //   2623: ifne -> 2642
    //   2626: aload #7
    //   2628: instanceof net/mcreator/latexes/entity/EvilScientistEntity
    //   2631: ifne -> 2642
    //   2634: aload #7
    //   2636: instanceof net/mcreator/latexes/entity/EvilSniperEntity
    //   2639: ifeq -> 2981
    //   2642: aload #7
    //   2644: getfield level : Lnet/minecraft/world/level/Level;
    //   2647: invokevirtual isClientSide : ()Z
    //   2650: ifne -> 2658
    //   2653: aload #7
    //   2655: invokevirtual discard : ()V
    //   2658: aload_0
    //   2659: instanceof net/minecraft/world/level/Level
    //   2662: ifeq -> 2759
    //   2665: aload_0
    //   2666: checkcast net/minecraft/world/level/Level
    //   2669: astore #15
    //   2671: aload #15
    //   2673: invokevirtual isClientSide : ()Z
    //   2676: ifne -> 2724
    //   2679: aload #15
    //   2681: aconst_null
    //   2682: new net/minecraft/core/BlockPos
    //   2685: dup
    //   2686: dload_1
    //   2687: dload_3
    //   2688: dload #5
    //   2690: invokespecial <init> : (DDD)V
    //   2693: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   2696: new net/minecraft/resources/ResourceLocation
    //   2699: dup
    //   2700: ldc 'latex:transfur'
    //   2702: invokespecial <init> : (Ljava/lang/String;)V
    //   2705: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   2710: checkcast net/minecraft/sounds/SoundEvent
    //   2713: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   2716: fconst_1
    //   2717: fconst_1
    //   2718: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   2721: goto -> 2759
    //   2724: aload #15
    //   2726: dload_1
    //   2727: dload_3
    //   2728: dload #5
    //   2730: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   2733: new net/minecraft/resources/ResourceLocation
    //   2736: dup
    //   2737: ldc 'latex:transfur'
    //   2739: invokespecial <init> : (Ljava/lang/String;)V
    //   2742: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   2747: checkcast net/minecraft/sounds/SoundEvent
    //   2750: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   2753: fconst_1
    //   2754: fconst_1
    //   2755: iconst_0
    //   2756: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   2759: invokestatic random : ()D
    //   2762: ldc2_w 0.2
    //   2765: dcmpg
    //   2766: ifge -> 2875
    //   2769: aload_0
    //   2770: instanceof net/minecraft/server/level/ServerLevel
    //   2773: ifeq -> 2872
    //   2776: aload_0
    //   2777: checkcast net/minecraft/server/level/ServerLevel
    //   2780: astore #15
    //   2782: new net/mcreator/latexes/entity/DarkLatexFoxSniperEntity
    //   2785: dup
    //   2786: getstatic net/mcreator/latexes/init/LatexModEntities.DARK_LATEX_FOX_SNIPER : Lnet/minecraftforge/registries/RegistryObject;
    //   2789: invokevirtual get : ()Ljava/lang/Object;
    //   2792: checkcast net/minecraft/world/entity/EntityType
    //   2795: aload #15
    //   2797: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   2800: astore #16
    //   2802: aload #16
    //   2804: dload_1
    //   2805: dload_3
    //   2806: dload #5
    //   2808: aload_0
    //   2809: invokeinterface getRandom : ()Ljava/util/Random;
    //   2814: invokevirtual nextFloat : ()F
    //   2817: ldc 360.0
    //   2819: fmul
    //   2820: fconst_0
    //   2821: invokevirtual moveTo : (DDDFF)V
    //   2824: aload #16
    //   2826: instanceof net/minecraft/world/entity/Mob
    //   2829: ifeq -> 2863
    //   2832: aload #16
    //   2834: checkcast net/minecraft/world/entity/Mob
    //   2837: astore #17
    //   2839: aload #17
    //   2841: aload #15
    //   2843: aload_0
    //   2844: aload #16
    //   2846: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   2849: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   2854: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   2857: aconst_null
    //   2858: aconst_null
    //   2859: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   2862: pop
    //   2863: aload_0
    //   2864: aload #16
    //   2866: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   2871: pop
    //   2872: goto -> 3955
    //   2875: aload_0
    //   2876: instanceof net/minecraft/server/level/ServerLevel
    //   2879: ifeq -> 2978
    //   2882: aload_0
    //   2883: checkcast net/minecraft/server/level/ServerLevel
    //   2886: astore #15
    //   2888: new net/mcreator/latexes/entity/DarkLatexFoxScientistEntity
    //   2891: dup
    //   2892: getstatic net/mcreator/latexes/init/LatexModEntities.DARK_LATEX_FOX_SCIENTIST : Lnet/minecraftforge/registries/RegistryObject;
    //   2895: invokevirtual get : ()Ljava/lang/Object;
    //   2898: checkcast net/minecraft/world/entity/EntityType
    //   2901: aload #15
    //   2903: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   2906: astore #16
    //   2908: aload #16
    //   2910: dload_1
    //   2911: dload_3
    //   2912: dload #5
    //   2914: aload_0
    //   2915: invokeinterface getRandom : ()Ljava/util/Random;
    //   2920: invokevirtual nextFloat : ()F
    //   2923: ldc 360.0
    //   2925: fmul
    //   2926: fconst_0
    //   2927: invokevirtual moveTo : (DDDFF)V
    //   2930: aload #16
    //   2932: instanceof net/minecraft/world/entity/Mob
    //   2935: ifeq -> 2969
    //   2938: aload #16
    //   2940: checkcast net/minecraft/world/entity/Mob
    //   2943: astore #17
    //   2945: aload #17
    //   2947: aload #15
    //   2949: aload_0
    //   2950: aload #16
    //   2952: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   2955: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   2960: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   2963: aconst_null
    //   2964: aconst_null
    //   2965: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   2968: pop
    //   2969: aload_0
    //   2970: aload #16
    //   2972: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   2977: pop
    //   2978: goto -> 3955
    //   2981: aload #7
    //   2983: instanceof net/minecraft/world/entity/monster/Creeper
    //   2986: ifeq -> 3212
    //   2989: aload #7
    //   2991: getfield level : Lnet/minecraft/world/level/Level;
    //   2994: invokevirtual isClientSide : ()Z
    //   2997: ifne -> 3005
    //   3000: aload #7
    //   3002: invokevirtual discard : ()V
    //   3005: aload_0
    //   3006: instanceof net/minecraft/world/level/Level
    //   3009: ifeq -> 3106
    //   3012: aload_0
    //   3013: checkcast net/minecraft/world/level/Level
    //   3016: astore #15
    //   3018: aload #15
    //   3020: invokevirtual isClientSide : ()Z
    //   3023: ifne -> 3071
    //   3026: aload #15
    //   3028: aconst_null
    //   3029: new net/minecraft/core/BlockPos
    //   3032: dup
    //   3033: dload_1
    //   3034: dload_3
    //   3035: dload #5
    //   3037: invokespecial <init> : (DDD)V
    //   3040: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   3043: new net/minecraft/resources/ResourceLocation
    //   3046: dup
    //   3047: ldc 'latex:transfur'
    //   3049: invokespecial <init> : (Ljava/lang/String;)V
    //   3052: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   3057: checkcast net/minecraft/sounds/SoundEvent
    //   3060: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   3063: fconst_1
    //   3064: fconst_1
    //   3065: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   3068: goto -> 3106
    //   3071: aload #15
    //   3073: dload_1
    //   3074: dload_3
    //   3075: dload #5
    //   3077: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   3080: new net/minecraft/resources/ResourceLocation
    //   3083: dup
    //   3084: ldc 'latex:transfur'
    //   3086: invokespecial <init> : (Ljava/lang/String;)V
    //   3089: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   3094: checkcast net/minecraft/sounds/SoundEvent
    //   3097: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   3100: fconst_1
    //   3101: fconst_1
    //   3102: iconst_0
    //   3103: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   3106: aload_0
    //   3107: instanceof net/minecraft/server/level/ServerLevel
    //   3110: ifeq -> 3209
    //   3113: aload_0
    //   3114: checkcast net/minecraft/server/level/ServerLevel
    //   3117: astore #15
    //   3119: new net/mcreator/latexes/entity/DarkLatexCreeperEntity
    //   3122: dup
    //   3123: getstatic net/mcreator/latexes/init/LatexModEntities.DARK_LATEX_CREEPER : Lnet/minecraftforge/registries/RegistryObject;
    //   3126: invokevirtual get : ()Ljava/lang/Object;
    //   3129: checkcast net/minecraft/world/entity/EntityType
    //   3132: aload #15
    //   3134: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   3137: astore #16
    //   3139: aload #16
    //   3141: dload_1
    //   3142: dload_3
    //   3143: dload #5
    //   3145: aload_0
    //   3146: invokeinterface getRandom : ()Ljava/util/Random;
    //   3151: invokevirtual nextFloat : ()F
    //   3154: ldc 360.0
    //   3156: fmul
    //   3157: fconst_0
    //   3158: invokevirtual moveTo : (DDDFF)V
    //   3161: aload #16
    //   3163: instanceof net/minecraft/world/entity/Mob
    //   3166: ifeq -> 3200
    //   3169: aload #16
    //   3171: checkcast net/minecraft/world/entity/Mob
    //   3174: astore #17
    //   3176: aload #17
    //   3178: aload #15
    //   3180: aload_0
    //   3181: aload #16
    //   3183: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   3186: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   3191: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   3194: aconst_null
    //   3195: aconst_null
    //   3196: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   3199: pop
    //   3200: aload_0
    //   3201: aload #16
    //   3203: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   3208: pop
    //   3209: goto -> 3955
    //   3212: aload #7
    //   3214: invokevirtual getType : ()Lnet/minecraft/world/entity/EntityType;
    //   3217: getstatic net/minecraft/core/Registry.ENTITY_TYPE_REGISTRY : Lnet/minecraft/resources/ResourceKey;
    //   3220: new net/minecraft/resources/ResourceLocation
    //   3223: dup
    //   3224: ldc_w 'latex:darklatexes'
    //   3227: invokespecial <init> : (Ljava/lang/String;)V
    //   3230: invokestatic create : (Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraft/tags/TagKey;
    //   3233: invokevirtual is : (Lnet/minecraft/tags/TagKey;)Z
    //   3236: iconst_1
    //   3237: if_icmpeq -> 3955
    //   3240: invokestatic random : ()D
    //   3243: ldc2_w 0.1
    //   3246: dcmpg
    //   3247: ifge -> 3473
    //   3250: aload #7
    //   3252: getfield level : Lnet/minecraft/world/level/Level;
    //   3255: invokevirtual isClientSide : ()Z
    //   3258: ifne -> 3266
    //   3261: aload #7
    //   3263: invokevirtual discard : ()V
    //   3266: aload_0
    //   3267: instanceof net/minecraft/world/level/Level
    //   3270: ifeq -> 3367
    //   3273: aload_0
    //   3274: checkcast net/minecraft/world/level/Level
    //   3277: astore #15
    //   3279: aload #15
    //   3281: invokevirtual isClientSide : ()Z
    //   3284: ifne -> 3332
    //   3287: aload #15
    //   3289: aconst_null
    //   3290: new net/minecraft/core/BlockPos
    //   3293: dup
    //   3294: dload_1
    //   3295: dload_3
    //   3296: dload #5
    //   3298: invokespecial <init> : (DDD)V
    //   3301: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   3304: new net/minecraft/resources/ResourceLocation
    //   3307: dup
    //   3308: ldc 'latex:transfur'
    //   3310: invokespecial <init> : (Ljava/lang/String;)V
    //   3313: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   3318: checkcast net/minecraft/sounds/SoundEvent
    //   3321: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   3324: fconst_1
    //   3325: fconst_1
    //   3326: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   3329: goto -> 3367
    //   3332: aload #15
    //   3334: dload_1
    //   3335: dload_3
    //   3336: dload #5
    //   3338: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   3341: new net/minecraft/resources/ResourceLocation
    //   3344: dup
    //   3345: ldc 'latex:transfur'
    //   3347: invokespecial <init> : (Ljava/lang/String;)V
    //   3350: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   3355: checkcast net/minecraft/sounds/SoundEvent
    //   3358: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   3361: fconst_1
    //   3362: fconst_1
    //   3363: iconst_0
    //   3364: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   3367: aload_0
    //   3368: instanceof net/minecraft/server/level/ServerLevel
    //   3371: ifeq -> 3470
    //   3374: aload_0
    //   3375: checkcast net/minecraft/server/level/ServerLevel
    //   3378: astore #15
    //   3380: new net/mcreator/latexes/entity/YufengEntity
    //   3383: dup
    //   3384: getstatic net/mcreator/latexes/init/LatexModEntities.YUFENG : Lnet/minecraftforge/registries/RegistryObject;
    //   3387: invokevirtual get : ()Ljava/lang/Object;
    //   3390: checkcast net/minecraft/world/entity/EntityType
    //   3393: aload #15
    //   3395: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   3398: astore #16
    //   3400: aload #16
    //   3402: dload_1
    //   3403: dload_3
    //   3404: dload #5
    //   3406: aload_0
    //   3407: invokeinterface getRandom : ()Ljava/util/Random;
    //   3412: invokevirtual nextFloat : ()F
    //   3415: ldc 360.0
    //   3417: fmul
    //   3418: fconst_0
    //   3419: invokevirtual moveTo : (DDDFF)V
    //   3422: aload #16
    //   3424: instanceof net/minecraft/world/entity/Mob
    //   3427: ifeq -> 3461
    //   3430: aload #16
    //   3432: checkcast net/minecraft/world/entity/Mob
    //   3435: astore #17
    //   3437: aload #17
    //   3439: aload #15
    //   3441: aload_0
    //   3442: aload #16
    //   3444: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   3447: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   3452: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   3455: aconst_null
    //   3456: aconst_null
    //   3457: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   3460: pop
    //   3461: aload_0
    //   3462: aload #16
    //   3464: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   3469: pop
    //   3470: goto -> 3955
    //   3473: invokestatic random : ()D
    //   3476: ldc2_w 0.2
    //   3479: dcmpg
    //   3480: ifge -> 3722
    //   3483: aload #7
    //   3485: getfield level : Lnet/minecraft/world/level/Level;
    //   3488: invokevirtual isClientSide : ()Z
    //   3491: ifne -> 3499
    //   3494: aload #7
    //   3496: invokevirtual discard : ()V
    //   3499: aload #8
    //   3501: getfield level : Lnet/minecraft/world/level/Level;
    //   3504: invokevirtual isClientSide : ()Z
    //   3507: ifne -> 3515
    //   3510: aload #8
    //   3512: invokevirtual discard : ()V
    //   3515: aload_0
    //   3516: instanceof net/minecraft/world/level/Level
    //   3519: ifeq -> 3616
    //   3522: aload_0
    //   3523: checkcast net/minecraft/world/level/Level
    //   3526: astore #15
    //   3528: aload #15
    //   3530: invokevirtual isClientSide : ()Z
    //   3533: ifne -> 3581
    //   3536: aload #15
    //   3538: aconst_null
    //   3539: new net/minecraft/core/BlockPos
    //   3542: dup
    //   3543: dload_1
    //   3544: dload_3
    //   3545: dload #5
    //   3547: invokespecial <init> : (DDD)V
    //   3550: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   3553: new net/minecraft/resources/ResourceLocation
    //   3556: dup
    //   3557: ldc 'latex:transfur'
    //   3559: invokespecial <init> : (Ljava/lang/String;)V
    //   3562: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   3567: checkcast net/minecraft/sounds/SoundEvent
    //   3570: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   3573: fconst_1
    //   3574: fconst_1
    //   3575: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   3578: goto -> 3616
    //   3581: aload #15
    //   3583: dload_1
    //   3584: dload_3
    //   3585: dload #5
    //   3587: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   3590: new net/minecraft/resources/ResourceLocation
    //   3593: dup
    //   3594: ldc 'latex:transfur'
    //   3596: invokespecial <init> : (Ljava/lang/String;)V
    //   3599: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   3604: checkcast net/minecraft/sounds/SoundEvent
    //   3607: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   3610: fconst_1
    //   3611: fconst_1
    //   3612: iconst_0
    //   3613: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   3616: aload_0
    //   3617: instanceof net/minecraft/server/level/ServerLevel
    //   3620: ifeq -> 3719
    //   3623: aload_0
    //   3624: checkcast net/minecraft/server/level/ServerLevel
    //   3627: astore #15
    //   3629: new net/mcreator/latexes/entity/DarkLatexCentaurEntity
    //   3632: dup
    //   3633: getstatic net/mcreator/latexes/init/LatexModEntities.DARK_LATEX_CENTAUR : Lnet/minecraftforge/registries/RegistryObject;
    //   3636: invokevirtual get : ()Ljava/lang/Object;
    //   3639: checkcast net/minecraft/world/entity/EntityType
    //   3642: aload #15
    //   3644: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   3647: astore #16
    //   3649: aload #16
    //   3651: dload_1
    //   3652: dload_3
    //   3653: dload #5
    //   3655: aload_0
    //   3656: invokeinterface getRandom : ()Ljava/util/Random;
    //   3661: invokevirtual nextFloat : ()F
    //   3664: ldc 360.0
    //   3666: fmul
    //   3667: fconst_0
    //   3668: invokevirtual moveTo : (DDDFF)V
    //   3671: aload #16
    //   3673: instanceof net/minecraft/world/entity/Mob
    //   3676: ifeq -> 3710
    //   3679: aload #16
    //   3681: checkcast net/minecraft/world/entity/Mob
    //   3684: astore #17
    //   3686: aload #17
    //   3688: aload #15
    //   3690: aload_0
    //   3691: aload #16
    //   3693: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   3696: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   3701: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   3704: aconst_null
    //   3705: aconst_null
    //   3706: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   3709: pop
    //   3710: aload_0
    //   3711: aload #16
    //   3713: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   3718: pop
    //   3719: goto -> 3955
    //   3722: aload #7
    //   3724: getfield level : Lnet/minecraft/world/level/Level;
    //   3727: invokevirtual isClientSide : ()Z
    //   3730: ifne -> 3738
    //   3733: aload #7
    //   3735: invokevirtual discard : ()V
    //   3738: aload_0
    //   3739: instanceof net/minecraft/world/level/Level
    //   3742: ifeq -> 3839
    //   3745: aload_0
    //   3746: checkcast net/minecraft/world/level/Level
    //   3749: astore #15
    //   3751: aload #15
    //   3753: invokevirtual isClientSide : ()Z
    //   3756: ifne -> 3804
    //   3759: aload #15
    //   3761: aconst_null
    //   3762: new net/minecraft/core/BlockPos
    //   3765: dup
    //   3766: dload_1
    //   3767: dload_3
    //   3768: dload #5
    //   3770: invokespecial <init> : (DDD)V
    //   3773: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   3776: new net/minecraft/resources/ResourceLocation
    //   3779: dup
    //   3780: ldc 'latex:transfur'
    //   3782: invokespecial <init> : (Ljava/lang/String;)V
    //   3785: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   3790: checkcast net/minecraft/sounds/SoundEvent
    //   3793: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   3796: fconst_1
    //   3797: fconst_1
    //   3798: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   3801: goto -> 3839
    //   3804: aload #15
    //   3806: dload_1
    //   3807: dload_3
    //   3808: dload #5
    //   3810: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   3813: new net/minecraft/resources/ResourceLocation
    //   3816: dup
    //   3817: ldc 'latex:transfur'
    //   3819: invokespecial <init> : (Ljava/lang/String;)V
    //   3822: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   3827: checkcast net/minecraft/sounds/SoundEvent
    //   3830: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   3833: fconst_1
    //   3834: fconst_1
    //   3835: iconst_0
    //   3836: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   3839: aload_0
    //   3840: instanceof net/minecraft/server/level/ServerLevel
    //   3843: ifeq -> 3942
    //   3846: aload_0
    //   3847: checkcast net/minecraft/server/level/ServerLevel
    //   3850: astore #15
    //   3852: new net/mcreator/latexes/entity/DarklatexEntity
    //   3855: dup
    //   3856: getstatic net/mcreator/latexes/init/LatexModEntities.DARKLATEX : Lnet/minecraftforge/registries/RegistryObject;
    //   3859: invokevirtual get : ()Ljava/lang/Object;
    //   3862: checkcast net/minecraft/world/entity/EntityType
    //   3865: aload #15
    //   3867: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   3870: astore #16
    //   3872: aload #16
    //   3874: dload_1
    //   3875: dload_3
    //   3876: dload #5
    //   3878: aload_0
    //   3879: invokeinterface getRandom : ()Ljava/util/Random;
    //   3884: invokevirtual nextFloat : ()F
    //   3887: ldc 360.0
    //   3889: fmul
    //   3890: fconst_0
    //   3891: invokevirtual moveTo : (DDDFF)V
    //   3894: aload #16
    //   3896: instanceof net/minecraft/world/entity/Mob
    //   3899: ifeq -> 3933
    //   3902: aload #16
    //   3904: checkcast net/minecraft/world/entity/Mob
    //   3907: astore #17
    //   3909: aload #17
    //   3911: aload #15
    //   3913: aload_0
    //   3914: aload #16
    //   3916: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   3919: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   3924: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   3927: aconst_null
    //   3928: aconst_null
    //   3929: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   3932: pop
    //   3933: aload_0
    //   3934: aload #16
    //   3936: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   3941: pop
    //   3942: goto -> 3955
    //   3945: aload #7
    //   3947: instanceof net/minecraft/world/entity/player/Player
    //   3950: ifeq -> 3955
    //   3953: iconst_1
    //   3954: ireturn
    //   3955: iconst_0
    //   3956: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #49	-> 0
    //   #50	-> 10
    //   #51	-> 12
    //   #52	-> 15
    //   #53	-> 36
    //   #54	-> 65
    //   #55	-> 77
    //   #56	-> 106
    //   #57	-> 118
    //   #58	-> 147
    //   #59	-> 159
    //   #60	-> 188
    //   #61	-> 209
    //   #63	-> 243
    //   #64	-> 245
    //   #65	-> 254
    //   #66	-> 264
    //   #67	-> 275
    //   #68	-> 280
    //   #69	-> 293
    //   #70	-> 301
    //   #71	-> 327
    //   #70	-> 340
    //   #73	-> 346
    //   #77	-> 381
    //   #78	-> 394
    //   #79	-> 414
    //   #80	-> 436
    //   #81	-> 451
    //   #83	-> 475
    //   #84	-> 484
    //   #85	-> 487
    //   #86	-> 497
    //   #87	-> 508
    //   #88	-> 513
    //   #89	-> 526
    //   #90	-> 534
    //   #91	-> 560
    //   #90	-> 573
    //   #93	-> 579
    //   #97	-> 614
    //   #98	-> 627
    //   #99	-> 647
    //   #100	-> 669
    //   #101	-> 684
    //   #103	-> 708
    //   #104	-> 717
    //   #105	-> 720
    //   #106	-> 730
    //   #107	-> 741
    //   #108	-> 746
    //   #109	-> 759
    //   #110	-> 767
    //   #111	-> 793
    //   #110	-> 806
    //   #113	-> 812
    //   #117	-> 847
    //   #118	-> 860
    //   #119	-> 880
    //   #120	-> 902
    //   #121	-> 917
    //   #123	-> 941
    //   #124	-> 950
    //   #126	-> 953
    //   #127	-> 964
    //   #128	-> 969
    //   #129	-> 980
    //   #130	-> 985
    //   #131	-> 998
    //   #132	-> 1006
    //   #133	-> 1032
    //   #132	-> 1045
    //   #135	-> 1051
    //   #139	-> 1086
    //   #140	-> 1099
    //   #141	-> 1119
    //   #142	-> 1141
    //   #143	-> 1156
    //   #145	-> 1180
    //   #146	-> 1189
    //   #148	-> 1192
    //   #149	-> 1201
    //   #150	-> 1211
    //   #151	-> 1222
    //   #152	-> 1227
    //   #153	-> 1240
    //   #154	-> 1248
    //   #155	-> 1274
    //   #154	-> 1287
    //   #157	-> 1293
    //   #161	-> 1328
    //   #162	-> 1341
    //   #163	-> 1361
    //   #164	-> 1383
    //   #165	-> 1398
    //   #167	-> 1422
    //   #168	-> 1431
    //   #169	-> 1434
    //   #170	-> 1444
    //   #171	-> 1455
    //   #172	-> 1460
    //   #173	-> 1473
    //   #174	-> 1481
    //   #175	-> 1507
    //   #174	-> 1520
    //   #177	-> 1526
    //   #181	-> 1561
    //   #182	-> 1574
    //   #183	-> 1594
    //   #184	-> 1616
    //   #185	-> 1631
    //   #187	-> 1655
    //   #188	-> 1664
    //   #190	-> 1667
    //   #191	-> 1678
    //   #192	-> 1683
    //   #193	-> 1694
    //   #194	-> 1699
    //   #195	-> 1712
    //   #196	-> 1720
    //   #197	-> 1746
    //   #196	-> 1759
    //   #199	-> 1765
    //   #203	-> 1800
    //   #204	-> 1813
    //   #205	-> 1833
    //   #206	-> 1855
    //   #207	-> 1870
    //   #209	-> 1894
    //   #210	-> 1903
    //   #212	-> 1906
    //   #213	-> 1915
    //   #214	-> 1926
    //   #215	-> 1931
    //   #216	-> 1944
    //   #217	-> 1952
    //   #218	-> 1978
    //   #217	-> 1991
    //   #220	-> 1997
    //   #224	-> 2032
    //   #225	-> 2045
    //   #226	-> 2065
    //   #227	-> 2087
    //   #228	-> 2102
    //   #230	-> 2126
    //   #231	-> 2135
    //   #232	-> 2138
    //   #233	-> 2163
    //   #234	-> 2174
    //   #235	-> 2179
    //   #236	-> 2192
    //   #237	-> 2200
    //   #238	-> 2226
    //   #237	-> 2239
    //   #240	-> 2245
    //   #244	-> 2280
    //   #245	-> 2293
    //   #246	-> 2313
    //   #247	-> 2335
    //   #248	-> 2350
    //   #250	-> 2374
    //   #251	-> 2383
    //   #252	-> 2386
    //   #253	-> 2395
    //   #254	-> 2406
    //   #255	-> 2411
    //   #256	-> 2424
    //   #257	-> 2432
    //   #258	-> 2458
    //   #257	-> 2471
    //   #260	-> 2477
    //   #264	-> 2512
    //   #265	-> 2525
    //   #266	-> 2545
    //   #267	-> 2567
    //   #268	-> 2582
    //   #270	-> 2606
    //   #271	-> 2615
    //   #272	-> 2618
    //   #273	-> 2642
    //   #274	-> 2653
    //   #275	-> 2658
    //   #276	-> 2671
    //   #277	-> 2679
    //   #278	-> 2705
    //   #277	-> 2718
    //   #280	-> 2724
    //   #284	-> 2759
    //   #285	-> 2769
    //   #286	-> 2782
    //   #287	-> 2802
    //   #288	-> 2824
    //   #289	-> 2839
    //   #291	-> 2863
    //   #292	-> 2872
    //   #294	-> 2875
    //   #295	-> 2888
    //   #296	-> 2908
    //   #297	-> 2930
    //   #298	-> 2945
    //   #300	-> 2969
    //   #301	-> 2978
    //   #303	-> 2981
    //   #304	-> 2989
    //   #305	-> 3000
    //   #306	-> 3005
    //   #307	-> 3018
    //   #308	-> 3026
    //   #309	-> 3052
    //   #308	-> 3065
    //   #311	-> 3071
    //   #315	-> 3106
    //   #316	-> 3119
    //   #317	-> 3139
    //   #318	-> 3161
    //   #319	-> 3176
    //   #321	-> 3200
    //   #322	-> 3209
    //   #323	-> 3212
    //   #324	-> 3240
    //   #325	-> 3250
    //   #326	-> 3261
    //   #327	-> 3266
    //   #328	-> 3279
    //   #329	-> 3287
    //   #330	-> 3313
    //   #329	-> 3326
    //   #332	-> 3332
    //   #336	-> 3367
    //   #337	-> 3380
    //   #338	-> 3400
    //   #339	-> 3422
    //   #340	-> 3437
    //   #342	-> 3461
    //   #343	-> 3470
    //   #344	-> 3473
    //   #345	-> 3483
    //   #346	-> 3494
    //   #347	-> 3499
    //   #348	-> 3510
    //   #349	-> 3515
    //   #350	-> 3528
    //   #351	-> 3536
    //   #352	-> 3562
    //   #351	-> 3575
    //   #354	-> 3581
    //   #358	-> 3616
    //   #359	-> 3629
    //   #360	-> 3649
    //   #361	-> 3671
    //   #362	-> 3686
    //   #364	-> 3710
    //   #365	-> 3719
    //   #367	-> 3722
    //   #368	-> 3733
    //   #369	-> 3738
    //   #370	-> 3751
    //   #371	-> 3759
    //   #372	-> 3785
    //   #371	-> 3798
    //   #374	-> 3804
    //   #378	-> 3839
    //   #379	-> 3852
    //   #380	-> 3872
    //   #381	-> 3894
    //   #382	-> 3909
    //   #384	-> 3933
    //   #385	-> 3942
    //   #388	-> 3945
    //   #389	-> 3953
    //   #392	-> 3955
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   51	11	11	_entGetArmor	Lnet/minecraft/world/entity/LivingEntity;
    //   92	11	12	_entGetArmor	Lnet/minecraft/world/entity/LivingEntity;
    //   133	11	13	_entGetArmor	Lnet/minecraft/world/entity/LivingEntity;
    //   174	11	14	_entGetArmor	Lnet/minecraft/world/entity/LivingEntity;
    //   293	88	15	_level	Lnet/minecraft/world/level/Level;
    //   451	24	17	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   414	70	16	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   394	90	15	_level	Lnet/minecraft/server/level/ServerLevel;
    //   526	88	15	_level	Lnet/minecraft/world/level/Level;
    //   684	24	17	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   647	70	16	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   627	90	15	_level	Lnet/minecraft/server/level/ServerLevel;
    //   759	88	15	_level	Lnet/minecraft/world/level/Level;
    //   917	24	17	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   880	70	16	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   860	90	15	_level	Lnet/minecraft/server/level/ServerLevel;
    //   998	88	15	_level	Lnet/minecraft/world/level/Level;
    //   1156	24	17	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   1119	70	16	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   1099	90	15	_level	Lnet/minecraft/server/level/ServerLevel;
    //   1240	88	15	_level	Lnet/minecraft/world/level/Level;
    //   1398	24	17	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   1361	70	16	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   1341	90	15	_level	Lnet/minecraft/server/level/ServerLevel;
    //   1473	88	15	_level	Lnet/minecraft/world/level/Level;
    //   1631	24	17	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   1594	70	16	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   1574	90	15	_level	Lnet/minecraft/server/level/ServerLevel;
    //   1712	88	15	_level	Lnet/minecraft/world/level/Level;
    //   1870	24	17	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   1833	70	16	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   1813	90	15	_level	Lnet/minecraft/server/level/ServerLevel;
    //   1944	88	15	_level	Lnet/minecraft/world/level/Level;
    //   2102	24	17	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   2065	70	16	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   2045	90	15	_level	Lnet/minecraft/server/level/ServerLevel;
    //   2192	88	15	_level	Lnet/minecraft/world/level/Level;
    //   2350	24	17	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   2313	70	16	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   2293	90	15	_level	Lnet/minecraft/server/level/ServerLevel;
    //   2424	88	15	_level	Lnet/minecraft/world/level/Level;
    //   2582	24	17	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   2545	70	16	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   2525	90	15	_level	Lnet/minecraft/server/level/ServerLevel;
    //   2671	88	15	_level	Lnet/minecraft/world/level/Level;
    //   2839	24	17	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   2802	70	16	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   2782	90	15	_level	Lnet/minecraft/server/level/ServerLevel;
    //   2945	24	17	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   2908	70	16	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   2888	90	15	_level	Lnet/minecraft/server/level/ServerLevel;
    //   3018	88	15	_level	Lnet/minecraft/world/level/Level;
    //   3176	24	17	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   3139	70	16	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   3119	90	15	_level	Lnet/minecraft/server/level/ServerLevel;
    //   3279	88	15	_level	Lnet/minecraft/world/level/Level;
    //   3437	24	17	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   3400	70	16	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   3380	90	15	_level	Lnet/minecraft/server/level/ServerLevel;
    //   3528	88	15	_level	Lnet/minecraft/world/level/Level;
    //   3686	24	17	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   3649	70	16	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   3629	90	15	_level	Lnet/minecraft/server/level/ServerLevel;
    //   3751	88	15	_level	Lnet/minecraft/world/level/Level;
    //   3909	24	17	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   3872	70	16	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   3852	90	15	_level	Lnet/minecraft/server/level/ServerLevel;
    //   0	3957	0	world	Lnet/minecraft/world/level/LevelAccessor;
    //   0	3957	1	x	D
    //   0	3957	3	y	D
    //   0	3957	5	z	D
    //   0	3957	7	entity	Lnet/minecraft/world/entity/Entity;
    //   0	3957	8	sourceentity	Lnet/minecraft/world/entity/Entity;
    //   15	3942	9	entitykills	D
  }
}


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\DarklatexThisEntityKillsAnotherOneProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */