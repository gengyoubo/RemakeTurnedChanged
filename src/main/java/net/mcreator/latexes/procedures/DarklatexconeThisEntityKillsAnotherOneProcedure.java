package net.mcreator.latexes.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.LevelAccessor;

public class DarklatexconeThisEntityKillsAnotherOneProcedure {
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
    //   30: if_icmpne -> 3470
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
    //   203: if_icmpeq -> 3460
    //   206: aload #7
    //   208: invokevirtual getType : ()Lnet/minecraft/world/entity/EntityType;
    //   211: getstatic net/minecraft/core/Registry.ENTITY_TYPE_REGISTRY : Lnet/minecraft/resources/ResourceKey;
    //   214: new net/minecraft/resources/ResourceLocation
    //   217: dup
    //   218: ldc 'latex:robots'
    //   220: invokespecial <init> : (Ljava/lang/String;)V
    //   223: invokestatic create : (Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraft/tags/TagKey;
    //   226: invokevirtual is : (Lnet/minecraft/tags/TagKey;)Z
    //   229: ifne -> 240
    //   232: aload #7
    //   234: instanceof net/minecraft/world/entity/player/Player
    //   237: ifeq -> 242
    //   240: iconst_1
    //   241: ireturn
    //   242: aload #7
    //   244: instanceof net/minecraft/world/entity/FlyingMob
    //   247: iconst_1
    //   248: if_icmpne -> 1189
    //   251: invokestatic random : ()D
    //   254: ldc2_w 0.3
    //   257: dcmpg
    //   258: ifge -> 484
    //   261: aload #7
    //   263: getfield level : Lnet/minecraft/world/level/Level;
    //   266: invokevirtual isClientSide : ()Z
    //   269: ifne -> 277
    //   272: aload #7
    //   274: invokevirtual discard : ()V
    //   277: aload_0
    //   278: instanceof net/minecraft/world/level/Level
    //   281: ifeq -> 378
    //   284: aload_0
    //   285: checkcast net/minecraft/world/level/Level
    //   288: astore #13
    //   290: aload #13
    //   292: invokevirtual isClientSide : ()Z
    //   295: ifne -> 343
    //   298: aload #13
    //   300: aconst_null
    //   301: new net/minecraft/core/BlockPos
    //   304: dup
    //   305: dload_1
    //   306: dload_3
    //   307: dload #5
    //   309: invokespecial <init> : (DDD)V
    //   312: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   315: new net/minecraft/resources/ResourceLocation
    //   318: dup
    //   319: ldc 'latex:transfur'
    //   321: invokespecial <init> : (Ljava/lang/String;)V
    //   324: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   329: checkcast net/minecraft/sounds/SoundEvent
    //   332: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   335: fconst_1
    //   336: fconst_1
    //   337: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   340: goto -> 378
    //   343: aload #13
    //   345: dload_1
    //   346: dload_3
    //   347: dload #5
    //   349: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   352: new net/minecraft/resources/ResourceLocation
    //   355: dup
    //   356: ldc 'latex:transfur'
    //   358: invokespecial <init> : (Ljava/lang/String;)V
    //   361: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   366: checkcast net/minecraft/sounds/SoundEvent
    //   369: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   372: fconst_1
    //   373: fconst_1
    //   374: iconst_0
    //   375: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   378: aload_0
    //   379: instanceof net/minecraft/server/level/ServerLevel
    //   382: ifeq -> 481
    //   385: aload_0
    //   386: checkcast net/minecraft/server/level/ServerLevel
    //   389: astore #13
    //   391: new net/mcreator/latexes/entity/YufengEntity
    //   394: dup
    //   395: getstatic net/mcreator/latexes/init/LatexModEntities.YUFENG : Lnet/minecraftforge/registries/RegistryObject;
    //   398: invokevirtual get : ()Ljava/lang/Object;
    //   401: checkcast net/minecraft/world/entity/EntityType
    //   404: aload #13
    //   406: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   409: astore #14
    //   411: aload #14
    //   413: dload_1
    //   414: dload_3
    //   415: dload #5
    //   417: aload_0
    //   418: invokeinterface getRandom : ()Ljava/util/Random;
    //   423: invokevirtual nextFloat : ()F
    //   426: ldc 360.0
    //   428: fmul
    //   429: fconst_0
    //   430: invokevirtual moveTo : (DDDFF)V
    //   433: aload #14
    //   435: instanceof net/minecraft/world/entity/Mob
    //   438: ifeq -> 472
    //   441: aload #14
    //   443: checkcast net/minecraft/world/entity/Mob
    //   446: astore #15
    //   448: aload #15
    //   450: aload #13
    //   452: aload_0
    //   453: aload #14
    //   455: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   458: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   463: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   466: aconst_null
    //   467: aconst_null
    //   468: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   471: pop
    //   472: aload_0
    //   473: aload #14
    //   475: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   480: pop
    //   481: goto -> 3470
    //   484: invokestatic random : ()D
    //   487: ldc2_w 0.3
    //   490: dcmpg
    //   491: ifge -> 717
    //   494: aload #7
    //   496: getfield level : Lnet/minecraft/world/level/Level;
    //   499: invokevirtual isClientSide : ()Z
    //   502: ifne -> 510
    //   505: aload #7
    //   507: invokevirtual discard : ()V
    //   510: aload_0
    //   511: instanceof net/minecraft/world/level/Level
    //   514: ifeq -> 611
    //   517: aload_0
    //   518: checkcast net/minecraft/world/level/Level
    //   521: astore #13
    //   523: aload #13
    //   525: invokevirtual isClientSide : ()Z
    //   528: ifne -> 576
    //   531: aload #13
    //   533: aconst_null
    //   534: new net/minecraft/core/BlockPos
    //   537: dup
    //   538: dload_1
    //   539: dload_3
    //   540: dload #5
    //   542: invokespecial <init> : (DDD)V
    //   545: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   548: new net/minecraft/resources/ResourceLocation
    //   551: dup
    //   552: ldc 'latex:transfur'
    //   554: invokespecial <init> : (Ljava/lang/String;)V
    //   557: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   562: checkcast net/minecraft/sounds/SoundEvent
    //   565: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   568: fconst_1
    //   569: fconst_1
    //   570: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   573: goto -> 611
    //   576: aload #13
    //   578: dload_1
    //   579: dload_3
    //   580: dload #5
    //   582: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   585: new net/minecraft/resources/ResourceLocation
    //   588: dup
    //   589: ldc 'latex:transfur'
    //   591: invokespecial <init> : (Ljava/lang/String;)V
    //   594: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   599: checkcast net/minecraft/sounds/SoundEvent
    //   602: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   605: fconst_1
    //   606: fconst_1
    //   607: iconst_0
    //   608: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   611: aload_0
    //   612: instanceof net/minecraft/server/level/ServerLevel
    //   615: ifeq -> 714
    //   618: aload_0
    //   619: checkcast net/minecraft/server/level/ServerLevel
    //   622: astore #13
    //   624: new net/mcreator/latexes/entity/DarkLatexMothEntity
    //   627: dup
    //   628: getstatic net/mcreator/latexes/init/LatexModEntities.DARK_LATEX_MOTH : Lnet/minecraftforge/registries/RegistryObject;
    //   631: invokevirtual get : ()Ljava/lang/Object;
    //   634: checkcast net/minecraft/world/entity/EntityType
    //   637: aload #13
    //   639: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   642: astore #14
    //   644: aload #14
    //   646: dload_1
    //   647: dload_3
    //   648: dload #5
    //   650: aload_0
    //   651: invokeinterface getRandom : ()Ljava/util/Random;
    //   656: invokevirtual nextFloat : ()F
    //   659: ldc 360.0
    //   661: fmul
    //   662: fconst_0
    //   663: invokevirtual moveTo : (DDDFF)V
    //   666: aload #14
    //   668: instanceof net/minecraft/world/entity/Mob
    //   671: ifeq -> 705
    //   674: aload #14
    //   676: checkcast net/minecraft/world/entity/Mob
    //   679: astore #15
    //   681: aload #15
    //   683: aload #13
    //   685: aload_0
    //   686: aload #14
    //   688: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   691: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   696: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   699: aconst_null
    //   700: aconst_null
    //   701: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   704: pop
    //   705: aload_0
    //   706: aload #14
    //   708: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   713: pop
    //   714: goto -> 3470
    //   717: invokestatic random : ()D
    //   720: ldc2_w 0.3
    //   723: dcmpg
    //   724: ifge -> 950
    //   727: aload #7
    //   729: getfield level : Lnet/minecraft/world/level/Level;
    //   732: invokevirtual isClientSide : ()Z
    //   735: ifne -> 743
    //   738: aload #7
    //   740: invokevirtual discard : ()V
    //   743: aload_0
    //   744: instanceof net/minecraft/world/level/Level
    //   747: ifeq -> 844
    //   750: aload_0
    //   751: checkcast net/minecraft/world/level/Level
    //   754: astore #13
    //   756: aload #13
    //   758: invokevirtual isClientSide : ()Z
    //   761: ifne -> 809
    //   764: aload #13
    //   766: aconst_null
    //   767: new net/minecraft/core/BlockPos
    //   770: dup
    //   771: dload_1
    //   772: dload_3
    //   773: dload #5
    //   775: invokespecial <init> : (DDD)V
    //   778: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   781: new net/minecraft/resources/ResourceLocation
    //   784: dup
    //   785: ldc 'latex:transfur'
    //   787: invokespecial <init> : (Ljava/lang/String;)V
    //   790: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   795: checkcast net/minecraft/sounds/SoundEvent
    //   798: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   801: fconst_1
    //   802: fconst_1
    //   803: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   806: goto -> 844
    //   809: aload #13
    //   811: dload_1
    //   812: dload_3
    //   813: dload #5
    //   815: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   818: new net/minecraft/resources/ResourceLocation
    //   821: dup
    //   822: ldc 'latex:transfur'
    //   824: invokespecial <init> : (Ljava/lang/String;)V
    //   827: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   832: checkcast net/minecraft/sounds/SoundEvent
    //   835: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   838: fconst_1
    //   839: fconst_1
    //   840: iconst_0
    //   841: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   844: aload_0
    //   845: instanceof net/minecraft/server/level/ServerLevel
    //   848: ifeq -> 947
    //   851: aload_0
    //   852: checkcast net/minecraft/server/level/ServerLevel
    //   855: astore #13
    //   857: new net/mcreator/latexes/entity/DLbeeEntity
    //   860: dup
    //   861: getstatic net/mcreator/latexes/init/LatexModEntities.D_LBEE : Lnet/minecraftforge/registries/RegistryObject;
    //   864: invokevirtual get : ()Ljava/lang/Object;
    //   867: checkcast net/minecraft/world/entity/EntityType
    //   870: aload #13
    //   872: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   875: astore #14
    //   877: aload #14
    //   879: dload_1
    //   880: dload_3
    //   881: dload #5
    //   883: aload_0
    //   884: invokeinterface getRandom : ()Ljava/util/Random;
    //   889: invokevirtual nextFloat : ()F
    //   892: ldc 360.0
    //   894: fmul
    //   895: fconst_0
    //   896: invokevirtual moveTo : (DDDFF)V
    //   899: aload #14
    //   901: instanceof net/minecraft/world/entity/Mob
    //   904: ifeq -> 938
    //   907: aload #14
    //   909: checkcast net/minecraft/world/entity/Mob
    //   912: astore #15
    //   914: aload #15
    //   916: aload #13
    //   918: aload_0
    //   919: aload #14
    //   921: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   924: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   929: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   932: aconst_null
    //   933: aconst_null
    //   934: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   937: pop
    //   938: aload_0
    //   939: aload #14
    //   941: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   946: pop
    //   947: goto -> 3470
    //   950: aload #7
    //   952: getfield level : Lnet/minecraft/world/level/Level;
    //   955: invokevirtual isClientSide : ()Z
    //   958: ifne -> 966
    //   961: aload #7
    //   963: invokevirtual discard : ()V
    //   966: aload #8
    //   968: getfield level : Lnet/minecraft/world/level/Level;
    //   971: invokevirtual isClientSide : ()Z
    //   974: ifne -> 982
    //   977: aload #8
    //   979: invokevirtual discard : ()V
    //   982: aload_0
    //   983: instanceof net/minecraft/world/level/Level
    //   986: ifeq -> 1083
    //   989: aload_0
    //   990: checkcast net/minecraft/world/level/Level
    //   993: astore #13
    //   995: aload #13
    //   997: invokevirtual isClientSide : ()Z
    //   1000: ifne -> 1048
    //   1003: aload #13
    //   1005: aconst_null
    //   1006: new net/minecraft/core/BlockPos
    //   1009: dup
    //   1010: dload_1
    //   1011: dload_3
    //   1012: dload #5
    //   1014: invokespecial <init> : (DDD)V
    //   1017: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   1020: new net/minecraft/resources/ResourceLocation
    //   1023: dup
    //   1024: ldc 'latex:transfur'
    //   1026: invokespecial <init> : (Ljava/lang/String;)V
    //   1029: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   1034: checkcast net/minecraft/sounds/SoundEvent
    //   1037: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   1040: fconst_1
    //   1041: fconst_1
    //   1042: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   1045: goto -> 1083
    //   1048: aload #13
    //   1050: dload_1
    //   1051: dload_3
    //   1052: dload #5
    //   1054: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   1057: new net/minecraft/resources/ResourceLocation
    //   1060: dup
    //   1061: ldc 'latex:transfur'
    //   1063: invokespecial <init> : (Ljava/lang/String;)V
    //   1066: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   1071: checkcast net/minecraft/sounds/SoundEvent
    //   1074: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   1077: fconst_1
    //   1078: fconst_1
    //   1079: iconst_0
    //   1080: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   1083: aload_0
    //   1084: instanceof net/minecraft/server/level/ServerLevel
    //   1087: ifeq -> 1186
    //   1090: aload_0
    //   1091: checkcast net/minecraft/server/level/ServerLevel
    //   1094: astore #13
    //   1096: new net/mcreator/latexes/entity/YufengEntity
    //   1099: dup
    //   1100: getstatic net/mcreator/latexes/init/LatexModEntities.YUFENG : Lnet/minecraftforge/registries/RegistryObject;
    //   1103: invokevirtual get : ()Ljava/lang/Object;
    //   1106: checkcast net/minecraft/world/entity/EntityType
    //   1109: aload #13
    //   1111: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   1114: astore #14
    //   1116: aload #14
    //   1118: dload_1
    //   1119: dload_3
    //   1120: dload #5
    //   1122: aload_0
    //   1123: invokeinterface getRandom : ()Ljava/util/Random;
    //   1128: invokevirtual nextFloat : ()F
    //   1131: ldc 360.0
    //   1133: fmul
    //   1134: fconst_0
    //   1135: invokevirtual moveTo : (DDDFF)V
    //   1138: aload #14
    //   1140: instanceof net/minecraft/world/entity/Mob
    //   1143: ifeq -> 1177
    //   1146: aload #14
    //   1148: checkcast net/minecraft/world/entity/Mob
    //   1151: astore #15
    //   1153: aload #15
    //   1155: aload #13
    //   1157: aload_0
    //   1158: aload #14
    //   1160: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   1163: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   1168: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   1171: aconst_null
    //   1172: aconst_null
    //   1173: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   1176: pop
    //   1177: aload_0
    //   1178: aload #14
    //   1180: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   1185: pop
    //   1186: goto -> 3470
    //   1189: aload #7
    //   1191: instanceof net/minecraft/world/entity/animal/WaterAnimal
    //   1194: iconst_1
    //   1195: if_icmpne -> 1903
    //   1198: invokestatic random : ()D
    //   1201: ldc2_w 0.3
    //   1204: dcmpg
    //   1205: ifge -> 1431
    //   1208: aload #7
    //   1210: getfield level : Lnet/minecraft/world/level/Level;
    //   1213: invokevirtual isClientSide : ()Z
    //   1216: ifne -> 1224
    //   1219: aload #7
    //   1221: invokevirtual discard : ()V
    //   1224: aload_0
    //   1225: instanceof net/minecraft/world/level/Level
    //   1228: ifeq -> 1325
    //   1231: aload_0
    //   1232: checkcast net/minecraft/world/level/Level
    //   1235: astore #13
    //   1237: aload #13
    //   1239: invokevirtual isClientSide : ()Z
    //   1242: ifne -> 1290
    //   1245: aload #13
    //   1247: aconst_null
    //   1248: new net/minecraft/core/BlockPos
    //   1251: dup
    //   1252: dload_1
    //   1253: dload_3
    //   1254: dload #5
    //   1256: invokespecial <init> : (DDD)V
    //   1259: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   1262: new net/minecraft/resources/ResourceLocation
    //   1265: dup
    //   1266: ldc 'latex:transfur'
    //   1268: invokespecial <init> : (Ljava/lang/String;)V
    //   1271: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   1276: checkcast net/minecraft/sounds/SoundEvent
    //   1279: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   1282: fconst_1
    //   1283: fconst_1
    //   1284: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   1287: goto -> 1325
    //   1290: aload #13
    //   1292: dload_1
    //   1293: dload_3
    //   1294: dload #5
    //   1296: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   1299: new net/minecraft/resources/ResourceLocation
    //   1302: dup
    //   1303: ldc 'latex:transfur'
    //   1305: invokespecial <init> : (Ljava/lang/String;)V
    //   1308: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   1313: checkcast net/minecraft/sounds/SoundEvent
    //   1316: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   1319: fconst_1
    //   1320: fconst_1
    //   1321: iconst_0
    //   1322: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   1325: aload_0
    //   1326: instanceof net/minecraft/server/level/ServerLevel
    //   1329: ifeq -> 1428
    //   1332: aload_0
    //   1333: checkcast net/minecraft/server/level/ServerLevel
    //   1336: astore #13
    //   1338: new net/mcreator/latexes/entity/DlsharkEntity
    //   1341: dup
    //   1342: getstatic net/mcreator/latexes/init/LatexModEntities.DLSHARK : Lnet/minecraftforge/registries/RegistryObject;
    //   1345: invokevirtual get : ()Ljava/lang/Object;
    //   1348: checkcast net/minecraft/world/entity/EntityType
    //   1351: aload #13
    //   1353: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   1356: astore #14
    //   1358: aload #14
    //   1360: dload_1
    //   1361: dload_3
    //   1362: dload #5
    //   1364: aload_0
    //   1365: invokeinterface getRandom : ()Ljava/util/Random;
    //   1370: invokevirtual nextFloat : ()F
    //   1373: ldc 360.0
    //   1375: fmul
    //   1376: fconst_0
    //   1377: invokevirtual moveTo : (DDDFF)V
    //   1380: aload #14
    //   1382: instanceof net/minecraft/world/entity/Mob
    //   1385: ifeq -> 1419
    //   1388: aload #14
    //   1390: checkcast net/minecraft/world/entity/Mob
    //   1393: astore #15
    //   1395: aload #15
    //   1397: aload #13
    //   1399: aload_0
    //   1400: aload #14
    //   1402: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   1405: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   1410: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   1413: aconst_null
    //   1414: aconst_null
    //   1415: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   1418: pop
    //   1419: aload_0
    //   1420: aload #14
    //   1422: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   1427: pop
    //   1428: goto -> 3470
    //   1431: invokestatic random : ()D
    //   1434: ldc2_w 0.2
    //   1437: dcmpg
    //   1438: ifge -> 1664
    //   1441: aload #7
    //   1443: getfield level : Lnet/minecraft/world/level/Level;
    //   1446: invokevirtual isClientSide : ()Z
    //   1449: ifne -> 1457
    //   1452: aload #7
    //   1454: invokevirtual discard : ()V
    //   1457: aload_0
    //   1458: instanceof net/minecraft/world/level/Level
    //   1461: ifeq -> 1558
    //   1464: aload_0
    //   1465: checkcast net/minecraft/world/level/Level
    //   1468: astore #13
    //   1470: aload #13
    //   1472: invokevirtual isClientSide : ()Z
    //   1475: ifne -> 1523
    //   1478: aload #13
    //   1480: aconst_null
    //   1481: new net/minecraft/core/BlockPos
    //   1484: dup
    //   1485: dload_1
    //   1486: dload_3
    //   1487: dload #5
    //   1489: invokespecial <init> : (DDD)V
    //   1492: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   1495: new net/minecraft/resources/ResourceLocation
    //   1498: dup
    //   1499: ldc 'latex:transfur'
    //   1501: invokespecial <init> : (Ljava/lang/String;)V
    //   1504: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   1509: checkcast net/minecraft/sounds/SoundEvent
    //   1512: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   1515: fconst_1
    //   1516: fconst_1
    //   1517: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   1520: goto -> 1558
    //   1523: aload #13
    //   1525: dload_1
    //   1526: dload_3
    //   1527: dload #5
    //   1529: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   1532: new net/minecraft/resources/ResourceLocation
    //   1535: dup
    //   1536: ldc 'latex:transfur'
    //   1538: invokespecial <init> : (Ljava/lang/String;)V
    //   1541: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   1546: checkcast net/minecraft/sounds/SoundEvent
    //   1549: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   1552: fconst_1
    //   1553: fconst_1
    //   1554: iconst_0
    //   1555: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   1558: aload_0
    //   1559: instanceof net/minecraft/server/level/ServerLevel
    //   1562: ifeq -> 1661
    //   1565: aload_0
    //   1566: checkcast net/minecraft/server/level/ServerLevel
    //   1569: astore #13
    //   1571: new net/mcreator/latexes/entity/DlSquidDogEntity
    //   1574: dup
    //   1575: getstatic net/mcreator/latexes/init/LatexModEntities.DL_SQUID_DOG : Lnet/minecraftforge/registries/RegistryObject;
    //   1578: invokevirtual get : ()Ljava/lang/Object;
    //   1581: checkcast net/minecraft/world/entity/EntityType
    //   1584: aload #13
    //   1586: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   1589: astore #14
    //   1591: aload #14
    //   1593: dload_1
    //   1594: dload_3
    //   1595: dload #5
    //   1597: aload_0
    //   1598: invokeinterface getRandom : ()Ljava/util/Random;
    //   1603: invokevirtual nextFloat : ()F
    //   1606: ldc 360.0
    //   1608: fmul
    //   1609: fconst_0
    //   1610: invokevirtual moveTo : (DDDFF)V
    //   1613: aload #14
    //   1615: instanceof net/minecraft/world/entity/Mob
    //   1618: ifeq -> 1652
    //   1621: aload #14
    //   1623: checkcast net/minecraft/world/entity/Mob
    //   1626: astore #15
    //   1628: aload #15
    //   1630: aload #13
    //   1632: aload_0
    //   1633: aload #14
    //   1635: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   1638: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   1643: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   1646: aconst_null
    //   1647: aconst_null
    //   1648: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   1651: pop
    //   1652: aload_0
    //   1653: aload #14
    //   1655: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   1660: pop
    //   1661: goto -> 3470
    //   1664: aload #7
    //   1666: getfield level : Lnet/minecraft/world/level/Level;
    //   1669: invokevirtual isClientSide : ()Z
    //   1672: ifne -> 1680
    //   1675: aload #7
    //   1677: invokevirtual discard : ()V
    //   1680: aload #8
    //   1682: getfield level : Lnet/minecraft/world/level/Level;
    //   1685: invokevirtual isClientSide : ()Z
    //   1688: ifne -> 1696
    //   1691: aload #8
    //   1693: invokevirtual discard : ()V
    //   1696: aload_0
    //   1697: instanceof net/minecraft/world/level/Level
    //   1700: ifeq -> 1797
    //   1703: aload_0
    //   1704: checkcast net/minecraft/world/level/Level
    //   1707: astore #13
    //   1709: aload #13
    //   1711: invokevirtual isClientSide : ()Z
    //   1714: ifne -> 1762
    //   1717: aload #13
    //   1719: aconst_null
    //   1720: new net/minecraft/core/BlockPos
    //   1723: dup
    //   1724: dload_1
    //   1725: dload_3
    //   1726: dload #5
    //   1728: invokespecial <init> : (DDD)V
    //   1731: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   1734: new net/minecraft/resources/ResourceLocation
    //   1737: dup
    //   1738: ldc 'latex:transfur'
    //   1740: invokespecial <init> : (Ljava/lang/String;)V
    //   1743: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   1748: checkcast net/minecraft/sounds/SoundEvent
    //   1751: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   1754: fconst_1
    //   1755: fconst_1
    //   1756: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   1759: goto -> 1797
    //   1762: aload #13
    //   1764: dload_1
    //   1765: dload_3
    //   1766: dload #5
    //   1768: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   1771: new net/minecraft/resources/ResourceLocation
    //   1774: dup
    //   1775: ldc 'latex:transfur'
    //   1777: invokespecial <init> : (Ljava/lang/String;)V
    //   1780: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   1785: checkcast net/minecraft/sounds/SoundEvent
    //   1788: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   1791: fconst_1
    //   1792: fconst_1
    //   1793: iconst_0
    //   1794: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   1797: aload_0
    //   1798: instanceof net/minecraft/server/level/ServerLevel
    //   1801: ifeq -> 1900
    //   1804: aload_0
    //   1805: checkcast net/minecraft/server/level/ServerLevel
    //   1808: astore #13
    //   1810: new net/mcreator/latexes/entity/DlsharkEntity
    //   1813: dup
    //   1814: getstatic net/mcreator/latexes/init/LatexModEntities.DLSHARK : Lnet/minecraftforge/registries/RegistryObject;
    //   1817: invokevirtual get : ()Ljava/lang/Object;
    //   1820: checkcast net/minecraft/world/entity/EntityType
    //   1823: aload #13
    //   1825: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   1828: astore #14
    //   1830: aload #14
    //   1832: dload_1
    //   1833: dload_3
    //   1834: dload #5
    //   1836: aload_0
    //   1837: invokeinterface getRandom : ()Ljava/util/Random;
    //   1842: invokevirtual nextFloat : ()F
    //   1845: ldc 360.0
    //   1847: fmul
    //   1848: fconst_0
    //   1849: invokevirtual moveTo : (DDDFF)V
    //   1852: aload #14
    //   1854: instanceof net/minecraft/world/entity/Mob
    //   1857: ifeq -> 1891
    //   1860: aload #14
    //   1862: checkcast net/minecraft/world/entity/Mob
    //   1865: astore #15
    //   1867: aload #15
    //   1869: aload #13
    //   1871: aload_0
    //   1872: aload #14
    //   1874: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   1877: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   1882: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   1885: aconst_null
    //   1886: aconst_null
    //   1887: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   1890: pop
    //   1891: aload_0
    //   1892: aload #14
    //   1894: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   1899: pop
    //   1900: goto -> 3470
    //   1903: aload #7
    //   1905: instanceof net/minecraft/world/entity/animal/Fox
    //   1908: iconst_1
    //   1909: if_icmpne -> 2135
    //   1912: aload #7
    //   1914: getfield level : Lnet/minecraft/world/level/Level;
    //   1917: invokevirtual isClientSide : ()Z
    //   1920: ifne -> 1928
    //   1923: aload #7
    //   1925: invokevirtual discard : ()V
    //   1928: aload_0
    //   1929: instanceof net/minecraft/world/level/Level
    //   1932: ifeq -> 2029
    //   1935: aload_0
    //   1936: checkcast net/minecraft/world/level/Level
    //   1939: astore #13
    //   1941: aload #13
    //   1943: invokevirtual isClientSide : ()Z
    //   1946: ifne -> 1994
    //   1949: aload #13
    //   1951: aconst_null
    //   1952: new net/minecraft/core/BlockPos
    //   1955: dup
    //   1956: dload_1
    //   1957: dload_3
    //   1958: dload #5
    //   1960: invokespecial <init> : (DDD)V
    //   1963: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   1966: new net/minecraft/resources/ResourceLocation
    //   1969: dup
    //   1970: ldc 'latex:transfur'
    //   1972: invokespecial <init> : (Ljava/lang/String;)V
    //   1975: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   1980: checkcast net/minecraft/sounds/SoundEvent
    //   1983: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   1986: fconst_1
    //   1987: fconst_1
    //   1988: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   1991: goto -> 2029
    //   1994: aload #13
    //   1996: dload_1
    //   1997: dload_3
    //   1998: dload #5
    //   2000: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   2003: new net/minecraft/resources/ResourceLocation
    //   2006: dup
    //   2007: ldc 'latex:transfur'
    //   2009: invokespecial <init> : (Ljava/lang/String;)V
    //   2012: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   2017: checkcast net/minecraft/sounds/SoundEvent
    //   2020: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   2023: fconst_1
    //   2024: fconst_1
    //   2025: iconst_0
    //   2026: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   2029: aload_0
    //   2030: instanceof net/minecraft/server/level/ServerLevel
    //   2033: ifeq -> 2132
    //   2036: aload_0
    //   2037: checkcast net/minecraft/server/level/ServerLevel
    //   2040: astore #13
    //   2042: new net/mcreator/latexes/entity/DarkLatexFoxEntity
    //   2045: dup
    //   2046: getstatic net/mcreator/latexes/init/LatexModEntities.DARK_LATEX_FOX : Lnet/minecraftforge/registries/RegistryObject;
    //   2049: invokevirtual get : ()Ljava/lang/Object;
    //   2052: checkcast net/minecraft/world/entity/EntityType
    //   2055: aload #13
    //   2057: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   2060: astore #14
    //   2062: aload #14
    //   2064: dload_1
    //   2065: dload_3
    //   2066: dload #5
    //   2068: aload_0
    //   2069: invokeinterface getRandom : ()Ljava/util/Random;
    //   2074: invokevirtual nextFloat : ()F
    //   2077: ldc 360.0
    //   2079: fmul
    //   2080: fconst_0
    //   2081: invokevirtual moveTo : (DDDFF)V
    //   2084: aload #14
    //   2086: instanceof net/minecraft/world/entity/Mob
    //   2089: ifeq -> 2123
    //   2092: aload #14
    //   2094: checkcast net/minecraft/world/entity/Mob
    //   2097: astore #15
    //   2099: aload #15
    //   2101: aload #13
    //   2103: aload_0
    //   2104: aload #14
    //   2106: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   2109: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   2114: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   2117: aconst_null
    //   2118: aconst_null
    //   2119: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   2122: pop
    //   2123: aload_0
    //   2124: aload #14
    //   2126: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   2131: pop
    //   2132: goto -> 3470
    //   2135: aload #7
    //   2137: instanceof net/minecraft/world/entity/monster/Skeleton
    //   2140: ifne -> 2151
    //   2143: aload #7
    //   2145: instanceof net/minecraft/world/entity/monster/WitherSkeleton
    //   2148: ifeq -> 2155
    //   2151: iconst_1
    //   2152: goto -> 2156
    //   2155: iconst_0
    //   2156: iconst_1
    //   2157: if_icmpne -> 2383
    //   2160: aload #7
    //   2162: getfield level : Lnet/minecraft/world/level/Level;
    //   2165: invokevirtual isClientSide : ()Z
    //   2168: ifne -> 2176
    //   2171: aload #7
    //   2173: invokevirtual discard : ()V
    //   2176: aload_0
    //   2177: instanceof net/minecraft/world/level/Level
    //   2180: ifeq -> 2277
    //   2183: aload_0
    //   2184: checkcast net/minecraft/world/level/Level
    //   2187: astore #13
    //   2189: aload #13
    //   2191: invokevirtual isClientSide : ()Z
    //   2194: ifne -> 2242
    //   2197: aload #13
    //   2199: aconst_null
    //   2200: new net/minecraft/core/BlockPos
    //   2203: dup
    //   2204: dload_1
    //   2205: dload_3
    //   2206: dload #5
    //   2208: invokespecial <init> : (DDD)V
    //   2211: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   2214: new net/minecraft/resources/ResourceLocation
    //   2217: dup
    //   2218: ldc 'latex:transfur'
    //   2220: invokespecial <init> : (Ljava/lang/String;)V
    //   2223: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   2228: checkcast net/minecraft/sounds/SoundEvent
    //   2231: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   2234: fconst_1
    //   2235: fconst_1
    //   2236: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   2239: goto -> 2277
    //   2242: aload #13
    //   2244: dload_1
    //   2245: dload_3
    //   2246: dload #5
    //   2248: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   2251: new net/minecraft/resources/ResourceLocation
    //   2254: dup
    //   2255: ldc 'latex:transfur'
    //   2257: invokespecial <init> : (Ljava/lang/String;)V
    //   2260: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   2265: checkcast net/minecraft/sounds/SoundEvent
    //   2268: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   2271: fconst_1
    //   2272: fconst_1
    //   2273: iconst_0
    //   2274: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   2277: aload_0
    //   2278: instanceof net/minecraft/server/level/ServerLevel
    //   2281: ifeq -> 2380
    //   2284: aload_0
    //   2285: checkcast net/minecraft/server/level/ServerLevel
    //   2288: astore #13
    //   2290: new net/mcreator/latexes/entity/DarkLatexSkeletonEntity
    //   2293: dup
    //   2294: getstatic net/mcreator/latexes/init/LatexModEntities.DARK_LATEX_SKELETON : Lnet/minecraftforge/registries/RegistryObject;
    //   2297: invokevirtual get : ()Ljava/lang/Object;
    //   2300: checkcast net/minecraft/world/entity/EntityType
    //   2303: aload #13
    //   2305: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   2308: astore #14
    //   2310: aload #14
    //   2312: dload_1
    //   2313: dload_3
    //   2314: dload #5
    //   2316: aload_0
    //   2317: invokeinterface getRandom : ()Ljava/util/Random;
    //   2322: invokevirtual nextFloat : ()F
    //   2325: ldc 360.0
    //   2327: fmul
    //   2328: fconst_0
    //   2329: invokevirtual moveTo : (DDDFF)V
    //   2332: aload #14
    //   2334: instanceof net/minecraft/world/entity/Mob
    //   2337: ifeq -> 2371
    //   2340: aload #14
    //   2342: checkcast net/minecraft/world/entity/Mob
    //   2345: astore #15
    //   2347: aload #15
    //   2349: aload #13
    //   2351: aload_0
    //   2352: aload #14
    //   2354: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   2357: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   2362: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   2365: aconst_null
    //   2366: aconst_null
    //   2367: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   2370: pop
    //   2371: aload_0
    //   2372: aload #14
    //   2374: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   2379: pop
    //   2380: goto -> 3470
    //   2383: aload #7
    //   2385: instanceof net/minecraft/world/entity/animal/Bee
    //   2388: iconst_1
    //   2389: if_icmpne -> 2615
    //   2392: aload #7
    //   2394: getfield level : Lnet/minecraft/world/level/Level;
    //   2397: invokevirtual isClientSide : ()Z
    //   2400: ifne -> 2408
    //   2403: aload #7
    //   2405: invokevirtual discard : ()V
    //   2408: aload_0
    //   2409: instanceof net/minecraft/world/level/Level
    //   2412: ifeq -> 2509
    //   2415: aload_0
    //   2416: checkcast net/minecraft/world/level/Level
    //   2419: astore #13
    //   2421: aload #13
    //   2423: invokevirtual isClientSide : ()Z
    //   2426: ifne -> 2474
    //   2429: aload #13
    //   2431: aconst_null
    //   2432: new net/minecraft/core/BlockPos
    //   2435: dup
    //   2436: dload_1
    //   2437: dload_3
    //   2438: dload #5
    //   2440: invokespecial <init> : (DDD)V
    //   2443: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   2446: new net/minecraft/resources/ResourceLocation
    //   2449: dup
    //   2450: ldc 'latex:transfur'
    //   2452: invokespecial <init> : (Ljava/lang/String;)V
    //   2455: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   2460: checkcast net/minecraft/sounds/SoundEvent
    //   2463: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   2466: fconst_1
    //   2467: fconst_1
    //   2468: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   2471: goto -> 2509
    //   2474: aload #13
    //   2476: dload_1
    //   2477: dload_3
    //   2478: dload #5
    //   2480: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   2483: new net/minecraft/resources/ResourceLocation
    //   2486: dup
    //   2487: ldc 'latex:transfur'
    //   2489: invokespecial <init> : (Ljava/lang/String;)V
    //   2492: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   2497: checkcast net/minecraft/sounds/SoundEvent
    //   2500: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   2503: fconst_1
    //   2504: fconst_1
    //   2505: iconst_0
    //   2506: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   2509: aload_0
    //   2510: instanceof net/minecraft/server/level/ServerLevel
    //   2513: ifeq -> 2612
    //   2516: aload_0
    //   2517: checkcast net/minecraft/server/level/ServerLevel
    //   2520: astore #13
    //   2522: new net/mcreator/latexes/entity/DLbeeEntity
    //   2525: dup
    //   2526: getstatic net/mcreator/latexes/init/LatexModEntities.D_LBEE : Lnet/minecraftforge/registries/RegistryObject;
    //   2529: invokevirtual get : ()Ljava/lang/Object;
    //   2532: checkcast net/minecraft/world/entity/EntityType
    //   2535: aload #13
    //   2537: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   2540: astore #14
    //   2542: aload #14
    //   2544: dload_1
    //   2545: dload_3
    //   2546: dload #5
    //   2548: aload_0
    //   2549: invokeinterface getRandom : ()Ljava/util/Random;
    //   2554: invokevirtual nextFloat : ()F
    //   2557: ldc 360.0
    //   2559: fmul
    //   2560: fconst_0
    //   2561: invokevirtual moveTo : (DDDFF)V
    //   2564: aload #14
    //   2566: instanceof net/minecraft/world/entity/Mob
    //   2569: ifeq -> 2603
    //   2572: aload #14
    //   2574: checkcast net/minecraft/world/entity/Mob
    //   2577: astore #15
    //   2579: aload #15
    //   2581: aload #13
    //   2583: aload_0
    //   2584: aload #14
    //   2586: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   2589: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   2594: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   2597: aconst_null
    //   2598: aconst_null
    //   2599: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   2602: pop
    //   2603: aload_0
    //   2604: aload #14
    //   2606: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   2611: pop
    //   2612: goto -> 3470
    //   2615: aload #7
    //   2617: instanceof net/mcreator/latexes/entity/ScientistEntity
    //   2620: ifne -> 2639
    //   2623: aload #7
    //   2625: instanceof net/mcreator/latexes/entity/EvilScientistEntity
    //   2628: ifne -> 2639
    //   2631: aload #7
    //   2633: instanceof net/mcreator/latexes/entity/EvilSniperEntity
    //   2636: ifeq -> 2978
    //   2639: aload #7
    //   2641: getfield level : Lnet/minecraft/world/level/Level;
    //   2644: invokevirtual isClientSide : ()Z
    //   2647: ifne -> 2655
    //   2650: aload #7
    //   2652: invokevirtual discard : ()V
    //   2655: aload_0
    //   2656: instanceof net/minecraft/world/level/Level
    //   2659: ifeq -> 2756
    //   2662: aload_0
    //   2663: checkcast net/minecraft/world/level/Level
    //   2666: astore #13
    //   2668: aload #13
    //   2670: invokevirtual isClientSide : ()Z
    //   2673: ifne -> 2721
    //   2676: aload #13
    //   2678: aconst_null
    //   2679: new net/minecraft/core/BlockPos
    //   2682: dup
    //   2683: dload_1
    //   2684: dload_3
    //   2685: dload #5
    //   2687: invokespecial <init> : (DDD)V
    //   2690: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   2693: new net/minecraft/resources/ResourceLocation
    //   2696: dup
    //   2697: ldc 'latex:transfur'
    //   2699: invokespecial <init> : (Ljava/lang/String;)V
    //   2702: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   2707: checkcast net/minecraft/sounds/SoundEvent
    //   2710: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   2713: fconst_1
    //   2714: fconst_1
    //   2715: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   2718: goto -> 2756
    //   2721: aload #13
    //   2723: dload_1
    //   2724: dload_3
    //   2725: dload #5
    //   2727: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   2730: new net/minecraft/resources/ResourceLocation
    //   2733: dup
    //   2734: ldc 'latex:transfur'
    //   2736: invokespecial <init> : (Ljava/lang/String;)V
    //   2739: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   2744: checkcast net/minecraft/sounds/SoundEvent
    //   2747: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   2750: fconst_1
    //   2751: fconst_1
    //   2752: iconst_0
    //   2753: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   2756: invokestatic random : ()D
    //   2759: ldc2_w 0.2
    //   2762: dcmpg
    //   2763: ifge -> 2872
    //   2766: aload_0
    //   2767: instanceof net/minecraft/server/level/ServerLevel
    //   2770: ifeq -> 2869
    //   2773: aload_0
    //   2774: checkcast net/minecraft/server/level/ServerLevel
    //   2777: astore #13
    //   2779: new net/mcreator/latexes/entity/DarkLatexFoxSniperEntity
    //   2782: dup
    //   2783: getstatic net/mcreator/latexes/init/LatexModEntities.DARK_LATEX_FOX_SNIPER : Lnet/minecraftforge/registries/RegistryObject;
    //   2786: invokevirtual get : ()Ljava/lang/Object;
    //   2789: checkcast net/minecraft/world/entity/EntityType
    //   2792: aload #13
    //   2794: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   2797: astore #14
    //   2799: aload #14
    //   2801: dload_1
    //   2802: dload_3
    //   2803: dload #5
    //   2805: aload_0
    //   2806: invokeinterface getRandom : ()Ljava/util/Random;
    //   2811: invokevirtual nextFloat : ()F
    //   2814: ldc 360.0
    //   2816: fmul
    //   2817: fconst_0
    //   2818: invokevirtual moveTo : (DDDFF)V
    //   2821: aload #14
    //   2823: instanceof net/minecraft/world/entity/Mob
    //   2826: ifeq -> 2860
    //   2829: aload #14
    //   2831: checkcast net/minecraft/world/entity/Mob
    //   2834: astore #15
    //   2836: aload #15
    //   2838: aload #13
    //   2840: aload_0
    //   2841: aload #14
    //   2843: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   2846: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   2851: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   2854: aconst_null
    //   2855: aconst_null
    //   2856: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   2859: pop
    //   2860: aload_0
    //   2861: aload #14
    //   2863: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   2868: pop
    //   2869: goto -> 3470
    //   2872: aload_0
    //   2873: instanceof net/minecraft/server/level/ServerLevel
    //   2876: ifeq -> 2975
    //   2879: aload_0
    //   2880: checkcast net/minecraft/server/level/ServerLevel
    //   2883: astore #13
    //   2885: new net/mcreator/latexes/entity/DarkLatexFoxScientistEntity
    //   2888: dup
    //   2889: getstatic net/mcreator/latexes/init/LatexModEntities.DARK_LATEX_FOX_SCIENTIST : Lnet/minecraftforge/registries/RegistryObject;
    //   2892: invokevirtual get : ()Ljava/lang/Object;
    //   2895: checkcast net/minecraft/world/entity/EntityType
    //   2898: aload #13
    //   2900: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   2903: astore #14
    //   2905: aload #14
    //   2907: dload_1
    //   2908: dload_3
    //   2909: dload #5
    //   2911: aload_0
    //   2912: invokeinterface getRandom : ()Ljava/util/Random;
    //   2917: invokevirtual nextFloat : ()F
    //   2920: ldc 360.0
    //   2922: fmul
    //   2923: fconst_0
    //   2924: invokevirtual moveTo : (DDDFF)V
    //   2927: aload #14
    //   2929: instanceof net/minecraft/world/entity/Mob
    //   2932: ifeq -> 2966
    //   2935: aload #14
    //   2937: checkcast net/minecraft/world/entity/Mob
    //   2940: astore #15
    //   2942: aload #15
    //   2944: aload #13
    //   2946: aload_0
    //   2947: aload #14
    //   2949: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   2952: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   2957: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   2960: aconst_null
    //   2961: aconst_null
    //   2962: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   2965: pop
    //   2966: aload_0
    //   2967: aload #14
    //   2969: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   2974: pop
    //   2975: goto -> 3470
    //   2978: aload #7
    //   2980: instanceof net/minecraft/world/entity/monster/Creeper
    //   2983: ifeq -> 3209
    //   2986: aload #7
    //   2988: getfield level : Lnet/minecraft/world/level/Level;
    //   2991: invokevirtual isClientSide : ()Z
    //   2994: ifne -> 3002
    //   2997: aload #7
    //   2999: invokevirtual discard : ()V
    //   3002: aload_0
    //   3003: instanceof net/minecraft/world/level/Level
    //   3006: ifeq -> 3103
    //   3009: aload_0
    //   3010: checkcast net/minecraft/world/level/Level
    //   3013: astore #13
    //   3015: aload #13
    //   3017: invokevirtual isClientSide : ()Z
    //   3020: ifne -> 3068
    //   3023: aload #13
    //   3025: aconst_null
    //   3026: new net/minecraft/core/BlockPos
    //   3029: dup
    //   3030: dload_1
    //   3031: dload_3
    //   3032: dload #5
    //   3034: invokespecial <init> : (DDD)V
    //   3037: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   3040: new net/minecraft/resources/ResourceLocation
    //   3043: dup
    //   3044: ldc 'latex:transfur'
    //   3046: invokespecial <init> : (Ljava/lang/String;)V
    //   3049: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   3054: checkcast net/minecraft/sounds/SoundEvent
    //   3057: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   3060: fconst_1
    //   3061: fconst_1
    //   3062: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   3065: goto -> 3103
    //   3068: aload #13
    //   3070: dload_1
    //   3071: dload_3
    //   3072: dload #5
    //   3074: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   3077: new net/minecraft/resources/ResourceLocation
    //   3080: dup
    //   3081: ldc 'latex:transfur'
    //   3083: invokespecial <init> : (Ljava/lang/String;)V
    //   3086: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   3091: checkcast net/minecraft/sounds/SoundEvent
    //   3094: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   3097: fconst_1
    //   3098: fconst_1
    //   3099: iconst_0
    //   3100: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   3103: aload_0
    //   3104: instanceof net/minecraft/server/level/ServerLevel
    //   3107: ifeq -> 3206
    //   3110: aload_0
    //   3111: checkcast net/minecraft/server/level/ServerLevel
    //   3114: astore #13
    //   3116: new net/mcreator/latexes/entity/DarkLatexCreeperEntity
    //   3119: dup
    //   3120: getstatic net/mcreator/latexes/init/LatexModEntities.DARK_LATEX_CREEPER : Lnet/minecraftforge/registries/RegistryObject;
    //   3123: invokevirtual get : ()Ljava/lang/Object;
    //   3126: checkcast net/minecraft/world/entity/EntityType
    //   3129: aload #13
    //   3131: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   3134: astore #14
    //   3136: aload #14
    //   3138: dload_1
    //   3139: dload_3
    //   3140: dload #5
    //   3142: aload_0
    //   3143: invokeinterface getRandom : ()Ljava/util/Random;
    //   3148: invokevirtual nextFloat : ()F
    //   3151: ldc 360.0
    //   3153: fmul
    //   3154: fconst_0
    //   3155: invokevirtual moveTo : (DDDFF)V
    //   3158: aload #14
    //   3160: instanceof net/minecraft/world/entity/Mob
    //   3163: ifeq -> 3197
    //   3166: aload #14
    //   3168: checkcast net/minecraft/world/entity/Mob
    //   3171: astore #15
    //   3173: aload #15
    //   3175: aload #13
    //   3177: aload_0
    //   3178: aload #14
    //   3180: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   3183: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   3188: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   3191: aconst_null
    //   3192: aconst_null
    //   3193: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   3196: pop
    //   3197: aload_0
    //   3198: aload #14
    //   3200: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   3205: pop
    //   3206: goto -> 3470
    //   3209: aload #7
    //   3211: invokevirtual getType : ()Lnet/minecraft/world/entity/EntityType;
    //   3214: getstatic net/minecraft/core/Registry.ENTITY_TYPE_REGISTRY : Lnet/minecraft/resources/ResourceKey;
    //   3217: new net/minecraft/resources/ResourceLocation
    //   3220: dup
    //   3221: ldc_w 'latex:darklatexes'
    //   3224: invokespecial <init> : (Ljava/lang/String;)V
    //   3227: invokestatic create : (Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraft/tags/TagKey;
    //   3230: invokevirtual is : (Lnet/minecraft/tags/TagKey;)Z
    //   3233: iconst_1
    //   3234: if_icmpeq -> 3470
    //   3237: aload #7
    //   3239: getfield level : Lnet/minecraft/world/level/Level;
    //   3242: invokevirtual isClientSide : ()Z
    //   3245: ifne -> 3253
    //   3248: aload #7
    //   3250: invokevirtual discard : ()V
    //   3253: aload_0
    //   3254: instanceof net/minecraft/world/level/Level
    //   3257: ifeq -> 3354
    //   3260: aload_0
    //   3261: checkcast net/minecraft/world/level/Level
    //   3264: astore #13
    //   3266: aload #13
    //   3268: invokevirtual isClientSide : ()Z
    //   3271: ifne -> 3319
    //   3274: aload #13
    //   3276: aconst_null
    //   3277: new net/minecraft/core/BlockPos
    //   3280: dup
    //   3281: dload_1
    //   3282: dload_3
    //   3283: dload #5
    //   3285: invokespecial <init> : (DDD)V
    //   3288: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   3291: new net/minecraft/resources/ResourceLocation
    //   3294: dup
    //   3295: ldc 'latex:transfur'
    //   3297: invokespecial <init> : (Ljava/lang/String;)V
    //   3300: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   3305: checkcast net/minecraft/sounds/SoundEvent
    //   3308: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   3311: fconst_1
    //   3312: fconst_1
    //   3313: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   3316: goto -> 3354
    //   3319: aload #13
    //   3321: dload_1
    //   3322: dload_3
    //   3323: dload #5
    //   3325: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   3328: new net/minecraft/resources/ResourceLocation
    //   3331: dup
    //   3332: ldc 'latex:transfur'
    //   3334: invokespecial <init> : (Ljava/lang/String;)V
    //   3337: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   3342: checkcast net/minecraft/sounds/SoundEvent
    //   3345: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   3348: fconst_1
    //   3349: fconst_1
    //   3350: iconst_0
    //   3351: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   3354: aload_0
    //   3355: instanceof net/minecraft/server/level/ServerLevel
    //   3358: ifeq -> 3457
    //   3361: aload_0
    //   3362: checkcast net/minecraft/server/level/ServerLevel
    //   3365: astore #13
    //   3367: new net/mcreator/latexes/entity/DarklatexconeEntity
    //   3370: dup
    //   3371: getstatic net/mcreator/latexes/init/LatexModEntities.DARKLATEXCONE : Lnet/minecraftforge/registries/RegistryObject;
    //   3374: invokevirtual get : ()Ljava/lang/Object;
    //   3377: checkcast net/minecraft/world/entity/EntityType
    //   3380: aload #13
    //   3382: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   3385: astore #14
    //   3387: aload #14
    //   3389: dload_1
    //   3390: dload_3
    //   3391: dload #5
    //   3393: aload_0
    //   3394: invokeinterface getRandom : ()Ljava/util/Random;
    //   3399: invokevirtual nextFloat : ()F
    //   3402: ldc 360.0
    //   3404: fmul
    //   3405: fconst_0
    //   3406: invokevirtual moveTo : (DDDFF)V
    //   3409: aload #14
    //   3411: instanceof net/minecraft/world/entity/Mob
    //   3414: ifeq -> 3448
    //   3417: aload #14
    //   3419: checkcast net/minecraft/world/entity/Mob
    //   3422: astore #15
    //   3424: aload #15
    //   3426: aload #13
    //   3428: aload_0
    //   3429: aload #14
    //   3431: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   3434: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   3439: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   3442: aconst_null
    //   3443: aconst_null
    //   3444: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   3447: pop
    //   3448: aload_0
    //   3449: aload #14
    //   3451: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   3456: pop
    //   3457: goto -> 3470
    //   3460: aload #7
    //   3462: instanceof net/minecraft/world/entity/player/Player
    //   3465: ifeq -> 3470
    //   3468: iconst_1
    //   3469: ireturn
    //   3470: iconst_0
    //   3471: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #48	-> 0
    //   #49	-> 10
    //   #50	-> 12
    //   #51	-> 33
    //   #52	-> 62
    //   #53	-> 74
    //   #54	-> 103
    //   #55	-> 115
    //   #56	-> 144
    //   #57	-> 156
    //   #58	-> 185
    //   #59	-> 206
    //   #61	-> 240
    //   #62	-> 242
    //   #63	-> 251
    //   #64	-> 261
    //   #65	-> 272
    //   #66	-> 277
    //   #67	-> 290
    //   #68	-> 298
    //   #69	-> 324
    //   #68	-> 337
    //   #71	-> 343
    //   #75	-> 378
    //   #76	-> 391
    //   #77	-> 411
    //   #78	-> 433
    //   #79	-> 448
    //   #81	-> 472
    //   #82	-> 481
    //   #83	-> 484
    //   #84	-> 494
    //   #85	-> 505
    //   #86	-> 510
    //   #87	-> 523
    //   #88	-> 531
    //   #89	-> 557
    //   #88	-> 570
    //   #91	-> 576
    //   #95	-> 611
    //   #96	-> 624
    //   #97	-> 644
    //   #98	-> 666
    //   #99	-> 681
    //   #101	-> 705
    //   #102	-> 714
    //   #103	-> 717
    //   #104	-> 727
    //   #105	-> 738
    //   #106	-> 743
    //   #107	-> 756
    //   #108	-> 764
    //   #109	-> 790
    //   #108	-> 803
    //   #111	-> 809
    //   #115	-> 844
    //   #116	-> 857
    //   #117	-> 877
    //   #118	-> 899
    //   #119	-> 914
    //   #121	-> 938
    //   #122	-> 947
    //   #124	-> 950
    //   #125	-> 961
    //   #126	-> 966
    //   #127	-> 977
    //   #128	-> 982
    //   #129	-> 995
    //   #130	-> 1003
    //   #131	-> 1029
    //   #130	-> 1042
    //   #133	-> 1048
    //   #137	-> 1083
    //   #138	-> 1096
    //   #139	-> 1116
    //   #140	-> 1138
    //   #141	-> 1153
    //   #143	-> 1177
    //   #144	-> 1186
    //   #146	-> 1189
    //   #147	-> 1198
    //   #148	-> 1208
    //   #149	-> 1219
    //   #150	-> 1224
    //   #151	-> 1237
    //   #152	-> 1245
    //   #153	-> 1271
    //   #152	-> 1284
    //   #155	-> 1290
    //   #159	-> 1325
    //   #160	-> 1338
    //   #161	-> 1358
    //   #162	-> 1380
    //   #163	-> 1395
    //   #165	-> 1419
    //   #166	-> 1428
    //   #167	-> 1431
    //   #168	-> 1441
    //   #169	-> 1452
    //   #170	-> 1457
    //   #171	-> 1470
    //   #172	-> 1478
    //   #173	-> 1504
    //   #172	-> 1517
    //   #175	-> 1523
    //   #179	-> 1558
    //   #180	-> 1571
    //   #181	-> 1591
    //   #182	-> 1613
    //   #183	-> 1628
    //   #185	-> 1652
    //   #186	-> 1661
    //   #188	-> 1664
    //   #189	-> 1675
    //   #190	-> 1680
    //   #191	-> 1691
    //   #192	-> 1696
    //   #193	-> 1709
    //   #194	-> 1717
    //   #195	-> 1743
    //   #194	-> 1756
    //   #197	-> 1762
    //   #201	-> 1797
    //   #202	-> 1810
    //   #203	-> 1830
    //   #204	-> 1852
    //   #205	-> 1867
    //   #207	-> 1891
    //   #208	-> 1900
    //   #210	-> 1903
    //   #211	-> 1912
    //   #212	-> 1923
    //   #213	-> 1928
    //   #214	-> 1941
    //   #215	-> 1949
    //   #216	-> 1975
    //   #215	-> 1988
    //   #218	-> 1994
    //   #222	-> 2029
    //   #223	-> 2042
    //   #224	-> 2062
    //   #225	-> 2084
    //   #226	-> 2099
    //   #228	-> 2123
    //   #229	-> 2132
    //   #230	-> 2135
    //   #231	-> 2160
    //   #232	-> 2171
    //   #233	-> 2176
    //   #234	-> 2189
    //   #235	-> 2197
    //   #236	-> 2223
    //   #235	-> 2236
    //   #238	-> 2242
    //   #242	-> 2277
    //   #243	-> 2290
    //   #244	-> 2310
    //   #245	-> 2332
    //   #246	-> 2347
    //   #248	-> 2371
    //   #249	-> 2380
    //   #250	-> 2383
    //   #251	-> 2392
    //   #252	-> 2403
    //   #253	-> 2408
    //   #254	-> 2421
    //   #255	-> 2429
    //   #256	-> 2455
    //   #255	-> 2468
    //   #258	-> 2474
    //   #262	-> 2509
    //   #263	-> 2522
    //   #264	-> 2542
    //   #265	-> 2564
    //   #266	-> 2579
    //   #268	-> 2603
    //   #269	-> 2612
    //   #270	-> 2615
    //   #271	-> 2639
    //   #272	-> 2650
    //   #273	-> 2655
    //   #274	-> 2668
    //   #275	-> 2676
    //   #276	-> 2702
    //   #275	-> 2715
    //   #278	-> 2721
    //   #282	-> 2756
    //   #283	-> 2766
    //   #284	-> 2779
    //   #285	-> 2799
    //   #286	-> 2821
    //   #287	-> 2836
    //   #289	-> 2860
    //   #290	-> 2869
    //   #292	-> 2872
    //   #293	-> 2885
    //   #294	-> 2905
    //   #295	-> 2927
    //   #296	-> 2942
    //   #298	-> 2966
    //   #299	-> 2975
    //   #301	-> 2978
    //   #302	-> 2986
    //   #303	-> 2997
    //   #304	-> 3002
    //   #305	-> 3015
    //   #306	-> 3023
    //   #307	-> 3049
    //   #306	-> 3062
    //   #309	-> 3068
    //   #313	-> 3103
    //   #314	-> 3116
    //   #315	-> 3136
    //   #316	-> 3158
    //   #317	-> 3173
    //   #319	-> 3197
    //   #320	-> 3206
    //   #321	-> 3209
    //   #322	-> 3237
    //   #323	-> 3248
    //   #324	-> 3253
    //   #325	-> 3266
    //   #326	-> 3274
    //   #327	-> 3300
    //   #326	-> 3313
    //   #329	-> 3319
    //   #333	-> 3354
    //   #334	-> 3367
    //   #335	-> 3387
    //   #336	-> 3409
    //   #337	-> 3424
    //   #339	-> 3448
    //   #340	-> 3457
    //   #342	-> 3460
    //   #343	-> 3468
    //   #346	-> 3470
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   48	11	9	_entGetArmor	Lnet/minecraft/world/entity/LivingEntity;
    //   89	11	10	_entGetArmor	Lnet/minecraft/world/entity/LivingEntity;
    //   130	11	11	_entGetArmor	Lnet/minecraft/world/entity/LivingEntity;
    //   171	11	12	_entGetArmor	Lnet/minecraft/world/entity/LivingEntity;
    //   290	88	13	_level	Lnet/minecraft/world/level/Level;
    //   448	24	15	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   411	70	14	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   391	90	13	_level	Lnet/minecraft/server/level/ServerLevel;
    //   523	88	13	_level	Lnet/minecraft/world/level/Level;
    //   681	24	15	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   644	70	14	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   624	90	13	_level	Lnet/minecraft/server/level/ServerLevel;
    //   756	88	13	_level	Lnet/minecraft/world/level/Level;
    //   914	24	15	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   877	70	14	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   857	90	13	_level	Lnet/minecraft/server/level/ServerLevel;
    //   995	88	13	_level	Lnet/minecraft/world/level/Level;
    //   1153	24	15	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   1116	70	14	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   1096	90	13	_level	Lnet/minecraft/server/level/ServerLevel;
    //   1237	88	13	_level	Lnet/minecraft/world/level/Level;
    //   1395	24	15	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   1358	70	14	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   1338	90	13	_level	Lnet/minecraft/server/level/ServerLevel;
    //   1470	88	13	_level	Lnet/minecraft/world/level/Level;
    //   1628	24	15	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   1591	70	14	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   1571	90	13	_level	Lnet/minecraft/server/level/ServerLevel;
    //   1709	88	13	_level	Lnet/minecraft/world/level/Level;
    //   1867	24	15	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   1830	70	14	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   1810	90	13	_level	Lnet/minecraft/server/level/ServerLevel;
    //   1941	88	13	_level	Lnet/minecraft/world/level/Level;
    //   2099	24	15	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   2062	70	14	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   2042	90	13	_level	Lnet/minecraft/server/level/ServerLevel;
    //   2189	88	13	_level	Lnet/minecraft/world/level/Level;
    //   2347	24	15	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   2310	70	14	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   2290	90	13	_level	Lnet/minecraft/server/level/ServerLevel;
    //   2421	88	13	_level	Lnet/minecraft/world/level/Level;
    //   2579	24	15	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   2542	70	14	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   2522	90	13	_level	Lnet/minecraft/server/level/ServerLevel;
    //   2668	88	13	_level	Lnet/minecraft/world/level/Level;
    //   2836	24	15	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   2799	70	14	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   2779	90	13	_level	Lnet/minecraft/server/level/ServerLevel;
    //   2942	24	15	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   2905	70	14	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   2885	90	13	_level	Lnet/minecraft/server/level/ServerLevel;
    //   3015	88	13	_level	Lnet/minecraft/world/level/Level;
    //   3173	24	15	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   3136	70	14	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   3116	90	13	_level	Lnet/minecraft/server/level/ServerLevel;
    //   3266	88	13	_level	Lnet/minecraft/world/level/Level;
    //   3424	24	15	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   3387	70	14	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   3367	90	13	_level	Lnet/minecraft/server/level/ServerLevel;
    //   0	3472	0	world	Lnet/minecraft/world/level/LevelAccessor;
    //   0	3472	1	x	D
    //   0	3472	3	y	D
    //   0	3472	5	z	D
    //   0	3472	7	entity	Lnet/minecraft/world/entity/Entity;
    //   0	3472	8	sourceentity	Lnet/minecraft/world/entity/Entity;
  }
}


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\DarklatexconeThisEntityKillsAnotherOneProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */