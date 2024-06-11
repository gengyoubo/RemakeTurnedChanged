package net.mcreator.latexes.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.LevelAccessor;

public class DarkLatexDragonThisEntityKillsAnotherOneProcedure {
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
    //   30: if_icmpne -> 2031
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
    //   203: if_icmpeq -> 2031
    //   206: aload #7
    //   208: instanceof net/minecraft/world/entity/player/Player
    //   211: ifne -> 240
    //   214: aload #7
    //   216: invokevirtual getType : ()Lnet/minecraft/world/entity/EntityType;
    //   219: getstatic net/minecraft/core/Registry.ENTITY_TYPE_REGISTRY : Lnet/minecraft/resources/ResourceKey;
    //   222: new net/minecraft/resources/ResourceLocation
    //   225: dup
    //   226: ldc 'latex:robots'
    //   228: invokespecial <init> : (Ljava/lang/String;)V
    //   231: invokestatic create : (Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraft/tags/TagKey;
    //   234: invokevirtual is : (Lnet/minecraft/tags/TagKey;)Z
    //   237: ifeq -> 242
    //   240: iconst_1
    //   241: ireturn
    //   242: aload #7
    //   244: instanceof net/minecraft/world/entity/FlyingMob
    //   247: iconst_1
    //   248: if_icmpne -> 723
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
    //   481: goto -> 2031
    //   484: aload #7
    //   486: getfield level : Lnet/minecraft/world/level/Level;
    //   489: invokevirtual isClientSide : ()Z
    //   492: ifne -> 500
    //   495: aload #7
    //   497: invokevirtual discard : ()V
    //   500: aload #8
    //   502: getfield level : Lnet/minecraft/world/level/Level;
    //   505: invokevirtual isClientSide : ()Z
    //   508: ifne -> 516
    //   511: aload #8
    //   513: invokevirtual discard : ()V
    //   516: aload_0
    //   517: instanceof net/minecraft/world/level/Level
    //   520: ifeq -> 617
    //   523: aload_0
    //   524: checkcast net/minecraft/world/level/Level
    //   527: astore #13
    //   529: aload #13
    //   531: invokevirtual isClientSide : ()Z
    //   534: ifne -> 582
    //   537: aload #13
    //   539: aconst_null
    //   540: new net/minecraft/core/BlockPos
    //   543: dup
    //   544: dload_1
    //   545: dload_3
    //   546: dload #5
    //   548: invokespecial <init> : (DDD)V
    //   551: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   554: new net/minecraft/resources/ResourceLocation
    //   557: dup
    //   558: ldc 'latex:transfur'
    //   560: invokespecial <init> : (Ljava/lang/String;)V
    //   563: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   568: checkcast net/minecraft/sounds/SoundEvent
    //   571: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   574: fconst_1
    //   575: fconst_1
    //   576: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   579: goto -> 617
    //   582: aload #13
    //   584: dload_1
    //   585: dload_3
    //   586: dload #5
    //   588: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   591: new net/minecraft/resources/ResourceLocation
    //   594: dup
    //   595: ldc 'latex:transfur'
    //   597: invokespecial <init> : (Ljava/lang/String;)V
    //   600: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   605: checkcast net/minecraft/sounds/SoundEvent
    //   608: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   611: fconst_1
    //   612: fconst_1
    //   613: iconst_0
    //   614: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   617: aload_0
    //   618: instanceof net/minecraft/server/level/ServerLevel
    //   621: ifeq -> 720
    //   624: aload_0
    //   625: checkcast net/minecraft/server/level/ServerLevel
    //   628: astore #13
    //   630: new net/mcreator/latexes/entity/YufengEntity
    //   633: dup
    //   634: getstatic net/mcreator/latexes/init/LatexModEntities.YUFENG : Lnet/minecraftforge/registries/RegistryObject;
    //   637: invokevirtual get : ()Ljava/lang/Object;
    //   640: checkcast net/minecraft/world/entity/EntityType
    //   643: aload #13
    //   645: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   648: astore #14
    //   650: aload #14
    //   652: dload_1
    //   653: dload_3
    //   654: dload #5
    //   656: aload_0
    //   657: invokeinterface getRandom : ()Ljava/util/Random;
    //   662: invokevirtual nextFloat : ()F
    //   665: ldc 360.0
    //   667: fmul
    //   668: fconst_0
    //   669: invokevirtual moveTo : (DDDFF)V
    //   672: aload #14
    //   674: instanceof net/minecraft/world/entity/Mob
    //   677: ifeq -> 711
    //   680: aload #14
    //   682: checkcast net/minecraft/world/entity/Mob
    //   685: astore #15
    //   687: aload #15
    //   689: aload #13
    //   691: aload_0
    //   692: aload #14
    //   694: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   697: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   702: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   705: aconst_null
    //   706: aconst_null
    //   707: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   710: pop
    //   711: aload_0
    //   712: aload #14
    //   714: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   719: pop
    //   720: goto -> 2031
    //   723: aload #7
    //   725: instanceof net/minecraft/world/entity/animal/WaterAnimal
    //   728: iconst_1
    //   729: if_icmpne -> 1204
    //   732: invokestatic random : ()D
    //   735: ldc2_w 0.3
    //   738: dcmpg
    //   739: ifge -> 965
    //   742: aload #7
    //   744: getfield level : Lnet/minecraft/world/level/Level;
    //   747: invokevirtual isClientSide : ()Z
    //   750: ifne -> 758
    //   753: aload #7
    //   755: invokevirtual discard : ()V
    //   758: aload_0
    //   759: instanceof net/minecraft/world/level/Level
    //   762: ifeq -> 859
    //   765: aload_0
    //   766: checkcast net/minecraft/world/level/Level
    //   769: astore #13
    //   771: aload #13
    //   773: invokevirtual isClientSide : ()Z
    //   776: ifne -> 824
    //   779: aload #13
    //   781: aconst_null
    //   782: new net/minecraft/core/BlockPos
    //   785: dup
    //   786: dload_1
    //   787: dload_3
    //   788: dload #5
    //   790: invokespecial <init> : (DDD)V
    //   793: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   796: new net/minecraft/resources/ResourceLocation
    //   799: dup
    //   800: ldc 'latex:transfur'
    //   802: invokespecial <init> : (Ljava/lang/String;)V
    //   805: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   810: checkcast net/minecraft/sounds/SoundEvent
    //   813: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   816: fconst_1
    //   817: fconst_1
    //   818: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   821: goto -> 859
    //   824: aload #13
    //   826: dload_1
    //   827: dload_3
    //   828: dload #5
    //   830: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   833: new net/minecraft/resources/ResourceLocation
    //   836: dup
    //   837: ldc 'latex:transfur'
    //   839: invokespecial <init> : (Ljava/lang/String;)V
    //   842: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   847: checkcast net/minecraft/sounds/SoundEvent
    //   850: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   853: fconst_1
    //   854: fconst_1
    //   855: iconst_0
    //   856: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   859: aload_0
    //   860: instanceof net/minecraft/server/level/ServerLevel
    //   863: ifeq -> 962
    //   866: aload_0
    //   867: checkcast net/minecraft/server/level/ServerLevel
    //   870: astore #13
    //   872: new net/mcreator/latexes/entity/DlsharkEntity
    //   875: dup
    //   876: getstatic net/mcreator/latexes/init/LatexModEntities.DLSHARK : Lnet/minecraftforge/registries/RegistryObject;
    //   879: invokevirtual get : ()Ljava/lang/Object;
    //   882: checkcast net/minecraft/world/entity/EntityType
    //   885: aload #13
    //   887: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   890: astore #14
    //   892: aload #14
    //   894: dload_1
    //   895: dload_3
    //   896: dload #5
    //   898: aload_0
    //   899: invokeinterface getRandom : ()Ljava/util/Random;
    //   904: invokevirtual nextFloat : ()F
    //   907: ldc 360.0
    //   909: fmul
    //   910: fconst_0
    //   911: invokevirtual moveTo : (DDDFF)V
    //   914: aload #14
    //   916: instanceof net/minecraft/world/entity/Mob
    //   919: ifeq -> 953
    //   922: aload #14
    //   924: checkcast net/minecraft/world/entity/Mob
    //   927: astore #15
    //   929: aload #15
    //   931: aload #13
    //   933: aload_0
    //   934: aload #14
    //   936: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   939: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   944: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   947: aconst_null
    //   948: aconst_null
    //   949: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   952: pop
    //   953: aload_0
    //   954: aload #14
    //   956: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   961: pop
    //   962: goto -> 2031
    //   965: aload #7
    //   967: getfield level : Lnet/minecraft/world/level/Level;
    //   970: invokevirtual isClientSide : ()Z
    //   973: ifne -> 981
    //   976: aload #7
    //   978: invokevirtual discard : ()V
    //   981: aload #8
    //   983: getfield level : Lnet/minecraft/world/level/Level;
    //   986: invokevirtual isClientSide : ()Z
    //   989: ifne -> 997
    //   992: aload #8
    //   994: invokevirtual discard : ()V
    //   997: aload_0
    //   998: instanceof net/minecraft/world/level/Level
    //   1001: ifeq -> 1098
    //   1004: aload_0
    //   1005: checkcast net/minecraft/world/level/Level
    //   1008: astore #13
    //   1010: aload #13
    //   1012: invokevirtual isClientSide : ()Z
    //   1015: ifne -> 1063
    //   1018: aload #13
    //   1020: aconst_null
    //   1021: new net/minecraft/core/BlockPos
    //   1024: dup
    //   1025: dload_1
    //   1026: dload_3
    //   1027: dload #5
    //   1029: invokespecial <init> : (DDD)V
    //   1032: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   1035: new net/minecraft/resources/ResourceLocation
    //   1038: dup
    //   1039: ldc 'latex:transfur'
    //   1041: invokespecial <init> : (Ljava/lang/String;)V
    //   1044: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   1049: checkcast net/minecraft/sounds/SoundEvent
    //   1052: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   1055: fconst_1
    //   1056: fconst_1
    //   1057: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   1060: goto -> 1098
    //   1063: aload #13
    //   1065: dload_1
    //   1066: dload_3
    //   1067: dload #5
    //   1069: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   1072: new net/minecraft/resources/ResourceLocation
    //   1075: dup
    //   1076: ldc 'latex:transfur'
    //   1078: invokespecial <init> : (Ljava/lang/String;)V
    //   1081: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   1086: checkcast net/minecraft/sounds/SoundEvent
    //   1089: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   1092: fconst_1
    //   1093: fconst_1
    //   1094: iconst_0
    //   1095: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   1098: aload_0
    //   1099: instanceof net/minecraft/server/level/ServerLevel
    //   1102: ifeq -> 1201
    //   1105: aload_0
    //   1106: checkcast net/minecraft/server/level/ServerLevel
    //   1109: astore #13
    //   1111: new net/mcreator/latexes/entity/DlsharkEntity
    //   1114: dup
    //   1115: getstatic net/mcreator/latexes/init/LatexModEntities.DLSHARK : Lnet/minecraftforge/registries/RegistryObject;
    //   1118: invokevirtual get : ()Ljava/lang/Object;
    //   1121: checkcast net/minecraft/world/entity/EntityType
    //   1124: aload #13
    //   1126: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   1129: astore #14
    //   1131: aload #14
    //   1133: dload_1
    //   1134: dload_3
    //   1135: dload #5
    //   1137: aload_0
    //   1138: invokeinterface getRandom : ()Ljava/util/Random;
    //   1143: invokevirtual nextFloat : ()F
    //   1146: ldc 360.0
    //   1148: fmul
    //   1149: fconst_0
    //   1150: invokevirtual moveTo : (DDDFF)V
    //   1153: aload #14
    //   1155: instanceof net/minecraft/world/entity/Mob
    //   1158: ifeq -> 1192
    //   1161: aload #14
    //   1163: checkcast net/minecraft/world/entity/Mob
    //   1166: astore #15
    //   1168: aload #15
    //   1170: aload #13
    //   1172: aload_0
    //   1173: aload #14
    //   1175: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   1178: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   1183: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   1186: aconst_null
    //   1187: aconst_null
    //   1188: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   1191: pop
    //   1192: aload_0
    //   1193: aload #14
    //   1195: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   1200: pop
    //   1201: goto -> 2031
    //   1204: aload #7
    //   1206: instanceof net/minecraft/world/entity/animal/Fox
    //   1209: iconst_1
    //   1210: if_icmpne -> 1436
    //   1213: aload #7
    //   1215: getfield level : Lnet/minecraft/world/level/Level;
    //   1218: invokevirtual isClientSide : ()Z
    //   1221: ifne -> 1229
    //   1224: aload #7
    //   1226: invokevirtual discard : ()V
    //   1229: aload_0
    //   1230: instanceof net/minecraft/world/level/Level
    //   1233: ifeq -> 1330
    //   1236: aload_0
    //   1237: checkcast net/minecraft/world/level/Level
    //   1240: astore #13
    //   1242: aload #13
    //   1244: invokevirtual isClientSide : ()Z
    //   1247: ifne -> 1295
    //   1250: aload #13
    //   1252: aconst_null
    //   1253: new net/minecraft/core/BlockPos
    //   1256: dup
    //   1257: dload_1
    //   1258: dload_3
    //   1259: dload #5
    //   1261: invokespecial <init> : (DDD)V
    //   1264: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   1267: new net/minecraft/resources/ResourceLocation
    //   1270: dup
    //   1271: ldc 'latex:transfur'
    //   1273: invokespecial <init> : (Ljava/lang/String;)V
    //   1276: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   1281: checkcast net/minecraft/sounds/SoundEvent
    //   1284: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   1287: fconst_1
    //   1288: fconst_1
    //   1289: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   1292: goto -> 1330
    //   1295: aload #13
    //   1297: dload_1
    //   1298: dload_3
    //   1299: dload #5
    //   1301: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   1304: new net/minecraft/resources/ResourceLocation
    //   1307: dup
    //   1308: ldc 'latex:transfur'
    //   1310: invokespecial <init> : (Ljava/lang/String;)V
    //   1313: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   1318: checkcast net/minecraft/sounds/SoundEvent
    //   1321: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   1324: fconst_1
    //   1325: fconst_1
    //   1326: iconst_0
    //   1327: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   1330: aload_0
    //   1331: instanceof net/minecraft/server/level/ServerLevel
    //   1334: ifeq -> 1433
    //   1337: aload_0
    //   1338: checkcast net/minecraft/server/level/ServerLevel
    //   1341: astore #13
    //   1343: new net/mcreator/latexes/entity/DarkLatexFoxEntity
    //   1346: dup
    //   1347: getstatic net/mcreator/latexes/init/LatexModEntities.DARK_LATEX_FOX : Lnet/minecraftforge/registries/RegistryObject;
    //   1350: invokevirtual get : ()Ljava/lang/Object;
    //   1353: checkcast net/minecraft/world/entity/EntityType
    //   1356: aload #13
    //   1358: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   1361: astore #14
    //   1363: aload #14
    //   1365: dload_1
    //   1366: dload_3
    //   1367: dload #5
    //   1369: aload_0
    //   1370: invokeinterface getRandom : ()Ljava/util/Random;
    //   1375: invokevirtual nextFloat : ()F
    //   1378: ldc 360.0
    //   1380: fmul
    //   1381: fconst_0
    //   1382: invokevirtual moveTo : (DDDFF)V
    //   1385: aload #14
    //   1387: instanceof net/minecraft/world/entity/Mob
    //   1390: ifeq -> 1424
    //   1393: aload #14
    //   1395: checkcast net/minecraft/world/entity/Mob
    //   1398: astore #15
    //   1400: aload #15
    //   1402: aload #13
    //   1404: aload_0
    //   1405: aload #14
    //   1407: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   1410: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   1415: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   1418: aconst_null
    //   1419: aconst_null
    //   1420: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   1423: pop
    //   1424: aload_0
    //   1425: aload #14
    //   1427: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   1432: pop
    //   1433: goto -> 2031
    //   1436: aload #7
    //   1438: invokevirtual getType : ()Lnet/minecraft/world/entity/EntityType;
    //   1441: getstatic net/minecraft/core/Registry.ENTITY_TYPE_REGISTRY : Lnet/minecraft/resources/ResourceKey;
    //   1444: new net/minecraft/resources/ResourceLocation
    //   1447: dup
    //   1448: ldc 'minecraft:skeletons'
    //   1450: invokespecial <init> : (Ljava/lang/String;)V
    //   1453: invokestatic create : (Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraft/tags/TagKey;
    //   1456: invokevirtual is : (Lnet/minecraft/tags/TagKey;)Z
    //   1459: iconst_1
    //   1460: if_icmpne -> 1802
    //   1463: aload #7
    //   1465: getfield level : Lnet/minecraft/world/level/Level;
    //   1468: invokevirtual isClientSide : ()Z
    //   1471: ifne -> 1479
    //   1474: aload #7
    //   1476: invokevirtual discard : ()V
    //   1479: aload_0
    //   1480: instanceof net/minecraft/world/level/Level
    //   1483: ifeq -> 1580
    //   1486: aload_0
    //   1487: checkcast net/minecraft/world/level/Level
    //   1490: astore #13
    //   1492: aload #13
    //   1494: invokevirtual isClientSide : ()Z
    //   1497: ifne -> 1545
    //   1500: aload #13
    //   1502: aconst_null
    //   1503: new net/minecraft/core/BlockPos
    //   1506: dup
    //   1507: dload_1
    //   1508: dload_3
    //   1509: dload #5
    //   1511: invokespecial <init> : (DDD)V
    //   1514: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   1517: new net/minecraft/resources/ResourceLocation
    //   1520: dup
    //   1521: ldc 'latex:transfur'
    //   1523: invokespecial <init> : (Ljava/lang/String;)V
    //   1526: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   1531: checkcast net/minecraft/sounds/SoundEvent
    //   1534: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   1537: fconst_1
    //   1538: fconst_1
    //   1539: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   1542: goto -> 1580
    //   1545: aload #13
    //   1547: dload_1
    //   1548: dload_3
    //   1549: dload #5
    //   1551: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   1554: new net/minecraft/resources/ResourceLocation
    //   1557: dup
    //   1558: ldc 'latex:transfur'
    //   1560: invokespecial <init> : (Ljava/lang/String;)V
    //   1563: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   1568: checkcast net/minecraft/sounds/SoundEvent
    //   1571: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   1574: fconst_1
    //   1575: fconst_1
    //   1576: iconst_0
    //   1577: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   1580: invokestatic random : ()D
    //   1583: ldc2_w 0.25
    //   1586: dcmpg
    //   1587: ifge -> 1696
    //   1590: aload_0
    //   1591: instanceof net/minecraft/server/level/ServerLevel
    //   1594: ifeq -> 1693
    //   1597: aload_0
    //   1598: checkcast net/minecraft/server/level/ServerLevel
    //   1601: astore #13
    //   1603: new net/mcreator/latexes/entity/YufengEntity
    //   1606: dup
    //   1607: getstatic net/mcreator/latexes/init/LatexModEntities.YUFENG : Lnet/minecraftforge/registries/RegistryObject;
    //   1610: invokevirtual get : ()Ljava/lang/Object;
    //   1613: checkcast net/minecraft/world/entity/EntityType
    //   1616: aload #13
    //   1618: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   1621: astore #14
    //   1623: aload #14
    //   1625: dload_1
    //   1626: dload_3
    //   1627: dload #5
    //   1629: aload_0
    //   1630: invokeinterface getRandom : ()Ljava/util/Random;
    //   1635: invokevirtual nextFloat : ()F
    //   1638: ldc 360.0
    //   1640: fmul
    //   1641: fconst_0
    //   1642: invokevirtual moveTo : (DDDFF)V
    //   1645: aload #14
    //   1647: instanceof net/minecraft/world/entity/Mob
    //   1650: ifeq -> 1684
    //   1653: aload #14
    //   1655: checkcast net/minecraft/world/entity/Mob
    //   1658: astore #15
    //   1660: aload #15
    //   1662: aload #13
    //   1664: aload_0
    //   1665: aload #14
    //   1667: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   1670: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   1675: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   1678: aconst_null
    //   1679: aconst_null
    //   1680: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   1683: pop
    //   1684: aload_0
    //   1685: aload #14
    //   1687: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   1692: pop
    //   1693: goto -> 2031
    //   1696: aload_0
    //   1697: instanceof net/minecraft/server/level/ServerLevel
    //   1700: ifeq -> 1799
    //   1703: aload_0
    //   1704: checkcast net/minecraft/server/level/ServerLevel
    //   1707: astore #13
    //   1709: new net/mcreator/latexes/entity/DarkLatexSkeletonEntity
    //   1712: dup
    //   1713: getstatic net/mcreator/latexes/init/LatexModEntities.DARK_LATEX_SKELETON : Lnet/minecraftforge/registries/RegistryObject;
    //   1716: invokevirtual get : ()Ljava/lang/Object;
    //   1719: checkcast net/minecraft/world/entity/EntityType
    //   1722: aload #13
    //   1724: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   1727: astore #14
    //   1729: aload #14
    //   1731: dload_1
    //   1732: dload_3
    //   1733: dload #5
    //   1735: aload_0
    //   1736: invokeinterface getRandom : ()Ljava/util/Random;
    //   1741: invokevirtual nextFloat : ()F
    //   1744: ldc 360.0
    //   1746: fmul
    //   1747: fconst_0
    //   1748: invokevirtual moveTo : (DDDFF)V
    //   1751: aload #14
    //   1753: instanceof net/minecraft/world/entity/Mob
    //   1756: ifeq -> 1790
    //   1759: aload #14
    //   1761: checkcast net/minecraft/world/entity/Mob
    //   1764: astore #15
    //   1766: aload #15
    //   1768: aload #13
    //   1770: aload_0
    //   1771: aload #14
    //   1773: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   1776: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   1781: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   1784: aconst_null
    //   1785: aconst_null
    //   1786: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   1789: pop
    //   1790: aload_0
    //   1791: aload #14
    //   1793: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   1798: pop
    //   1799: goto -> 2031
    //   1802: aload #7
    //   1804: instanceof net/mcreator/latexes/entity/DarklatexEntity
    //   1807: iconst_1
    //   1808: if_icmpeq -> 2031
    //   1811: aload #7
    //   1813: getfield level : Lnet/minecraft/world/level/Level;
    //   1816: invokevirtual isClientSide : ()Z
    //   1819: ifne -> 1827
    //   1822: aload #7
    //   1824: invokevirtual discard : ()V
    //   1827: aload_0
    //   1828: instanceof net/minecraft/world/level/Level
    //   1831: ifeq -> 1928
    //   1834: aload_0
    //   1835: checkcast net/minecraft/world/level/Level
    //   1838: astore #13
    //   1840: aload #13
    //   1842: invokevirtual isClientSide : ()Z
    //   1845: ifne -> 1893
    //   1848: aload #13
    //   1850: aconst_null
    //   1851: new net/minecraft/core/BlockPos
    //   1854: dup
    //   1855: dload_1
    //   1856: dload_3
    //   1857: dload #5
    //   1859: invokespecial <init> : (DDD)V
    //   1862: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   1865: new net/minecraft/resources/ResourceLocation
    //   1868: dup
    //   1869: ldc 'latex:transfur'
    //   1871: invokespecial <init> : (Ljava/lang/String;)V
    //   1874: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   1879: checkcast net/minecraft/sounds/SoundEvent
    //   1882: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   1885: fconst_1
    //   1886: fconst_1
    //   1887: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   1890: goto -> 1928
    //   1893: aload #13
    //   1895: dload_1
    //   1896: dload_3
    //   1897: dload #5
    //   1899: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   1902: new net/minecraft/resources/ResourceLocation
    //   1905: dup
    //   1906: ldc 'latex:transfur'
    //   1908: invokespecial <init> : (Ljava/lang/String;)V
    //   1911: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   1916: checkcast net/minecraft/sounds/SoundEvent
    //   1919: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   1922: fconst_1
    //   1923: fconst_1
    //   1924: iconst_0
    //   1925: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   1928: aload_0
    //   1929: instanceof net/minecraft/server/level/ServerLevel
    //   1932: ifeq -> 2031
    //   1935: aload_0
    //   1936: checkcast net/minecraft/server/level/ServerLevel
    //   1939: astore #13
    //   1941: new net/mcreator/latexes/entity/DarklatexEntity
    //   1944: dup
    //   1945: getstatic net/mcreator/latexes/init/LatexModEntities.DARKLATEX : Lnet/minecraftforge/registries/RegistryObject;
    //   1948: invokevirtual get : ()Ljava/lang/Object;
    //   1951: checkcast net/minecraft/world/entity/EntityType
    //   1954: aload #13
    //   1956: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   1959: astore #14
    //   1961: aload #14
    //   1963: dload_1
    //   1964: dload_3
    //   1965: dload #5
    //   1967: aload_0
    //   1968: invokeinterface getRandom : ()Ljava/util/Random;
    //   1973: invokevirtual nextFloat : ()F
    //   1976: ldc 360.0
    //   1978: fmul
    //   1979: fconst_0
    //   1980: invokevirtual moveTo : (DDDFF)V
    //   1983: aload #14
    //   1985: instanceof net/minecraft/world/entity/Mob
    //   1988: ifeq -> 2022
    //   1991: aload #14
    //   1993: checkcast net/minecraft/world/entity/Mob
    //   1996: astore #15
    //   1998: aload #15
    //   2000: aload #13
    //   2002: aload_0
    //   2003: aload #14
    //   2005: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   2008: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   2013: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   2016: aconst_null
    //   2017: aconst_null
    //   2018: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   2021: pop
    //   2022: aload_0
    //   2023: aload #14
    //   2025: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   2030: pop
    //   2031: iconst_0
    //   2032: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #35	-> 0
    //   #36	-> 10
    //   #37	-> 12
    //   #38	-> 33
    //   #39	-> 62
    //   #40	-> 74
    //   #41	-> 103
    //   #42	-> 115
    //   #43	-> 144
    //   #44	-> 156
    //   #45	-> 185
    //   #46	-> 206
    //   #47	-> 216
    //   #48	-> 240
    //   #49	-> 242
    //   #50	-> 251
    //   #51	-> 261
    //   #52	-> 272
    //   #53	-> 277
    //   #54	-> 290
    //   #55	-> 298
    //   #56	-> 324
    //   #55	-> 337
    //   #58	-> 343
    //   #62	-> 378
    //   #63	-> 391
    //   #64	-> 411
    //   #65	-> 433
    //   #66	-> 448
    //   #68	-> 472
    //   #69	-> 481
    //   #71	-> 484
    //   #72	-> 495
    //   #73	-> 500
    //   #74	-> 511
    //   #75	-> 516
    //   #76	-> 529
    //   #77	-> 537
    //   #78	-> 563
    //   #77	-> 576
    //   #80	-> 582
    //   #84	-> 617
    //   #85	-> 630
    //   #86	-> 650
    //   #87	-> 672
    //   #88	-> 687
    //   #90	-> 711
    //   #91	-> 720
    //   #93	-> 723
    //   #94	-> 732
    //   #95	-> 742
    //   #96	-> 753
    //   #97	-> 758
    //   #98	-> 771
    //   #99	-> 779
    //   #100	-> 805
    //   #99	-> 818
    //   #102	-> 824
    //   #106	-> 859
    //   #107	-> 872
    //   #108	-> 892
    //   #109	-> 914
    //   #110	-> 929
    //   #112	-> 953
    //   #113	-> 962
    //   #115	-> 965
    //   #116	-> 976
    //   #117	-> 981
    //   #118	-> 992
    //   #119	-> 997
    //   #120	-> 1010
    //   #121	-> 1018
    //   #122	-> 1044
    //   #121	-> 1057
    //   #124	-> 1063
    //   #128	-> 1098
    //   #129	-> 1111
    //   #130	-> 1131
    //   #131	-> 1153
    //   #132	-> 1168
    //   #134	-> 1192
    //   #135	-> 1201
    //   #137	-> 1204
    //   #138	-> 1213
    //   #139	-> 1224
    //   #140	-> 1229
    //   #141	-> 1242
    //   #142	-> 1250
    //   #143	-> 1276
    //   #142	-> 1289
    //   #145	-> 1295
    //   #149	-> 1330
    //   #150	-> 1343
    //   #151	-> 1363
    //   #152	-> 1385
    //   #153	-> 1400
    //   #155	-> 1424
    //   #156	-> 1433
    //   #157	-> 1436
    //   #158	-> 1463
    //   #159	-> 1474
    //   #160	-> 1479
    //   #161	-> 1492
    //   #162	-> 1500
    //   #163	-> 1526
    //   #162	-> 1539
    //   #165	-> 1545
    //   #169	-> 1580
    //   #170	-> 1590
    //   #171	-> 1603
    //   #172	-> 1623
    //   #173	-> 1645
    //   #174	-> 1660
    //   #176	-> 1684
    //   #177	-> 1693
    //   #179	-> 1696
    //   #180	-> 1709
    //   #181	-> 1729
    //   #182	-> 1751
    //   #183	-> 1766
    //   #185	-> 1790
    //   #186	-> 1799
    //   #188	-> 1802
    //   #189	-> 1811
    //   #190	-> 1822
    //   #191	-> 1827
    //   #192	-> 1840
    //   #193	-> 1848
    //   #194	-> 1874
    //   #193	-> 1887
    //   #196	-> 1893
    //   #200	-> 1928
    //   #201	-> 1941
    //   #202	-> 1961
    //   #203	-> 1983
    //   #204	-> 1998
    //   #206	-> 2022
    //   #211	-> 2031
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
    //   529	88	13	_level	Lnet/minecraft/world/level/Level;
    //   687	24	15	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   650	70	14	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   630	90	13	_level	Lnet/minecraft/server/level/ServerLevel;
    //   771	88	13	_level	Lnet/minecraft/world/level/Level;
    //   929	24	15	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   892	70	14	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   872	90	13	_level	Lnet/minecraft/server/level/ServerLevel;
    //   1010	88	13	_level	Lnet/minecraft/world/level/Level;
    //   1168	24	15	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   1131	70	14	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   1111	90	13	_level	Lnet/minecraft/server/level/ServerLevel;
    //   1242	88	13	_level	Lnet/minecraft/world/level/Level;
    //   1400	24	15	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   1363	70	14	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   1343	90	13	_level	Lnet/minecraft/server/level/ServerLevel;
    //   1492	88	13	_level	Lnet/minecraft/world/level/Level;
    //   1660	24	15	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   1623	70	14	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   1603	90	13	_level	Lnet/minecraft/server/level/ServerLevel;
    //   1766	24	15	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   1729	70	14	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   1709	90	13	_level	Lnet/minecraft/server/level/ServerLevel;
    //   1840	88	13	_level	Lnet/minecraft/world/level/Level;
    //   1998	24	15	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   1961	70	14	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   1941	90	13	_level	Lnet/minecraft/server/level/ServerLevel;
    //   0	2033	0	world	Lnet/minecraft/world/level/LevelAccessor;
    //   0	2033	1	x	D
    //   0	2033	3	y	D
    //   0	2033	5	z	D
    //   0	2033	7	entity	Lnet/minecraft/world/entity/Entity;
    //   0	2033	8	sourceentity	Lnet/minecraft/world/entity/Entity;
  }
}


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\DarkLatexDragonThisEntityKillsAnotherOneProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */