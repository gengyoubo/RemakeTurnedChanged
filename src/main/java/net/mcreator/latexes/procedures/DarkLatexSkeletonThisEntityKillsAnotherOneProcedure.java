package net.mcreator.latexes.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.LevelAccessor;

public class DarkLatexSkeletonThisEntityKillsAnotherOneProcedure {
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
    //   33: if_icmpne -> 2283
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
    //   206: if_icmpeq -> 2283
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
    //   251: if_icmpne -> 726
    //   254: invokestatic random : ()D
    //   257: ldc2_w 0.3
    //   260: dcmpg
    //   261: ifge -> 503
    //   264: aload #7
    //   266: getfield level : Lnet/minecraft/world/level/Level;
    //   269: invokevirtual isClientSide : ()Z
    //   272: ifne -> 280
    //   275: aload #7
    //   277: invokevirtual discard : ()V
    //   280: aload #8
    //   282: getfield level : Lnet/minecraft/world/level/Level;
    //   285: invokevirtual isClientSide : ()Z
    //   288: ifne -> 296
    //   291: aload #8
    //   293: invokevirtual discard : ()V
    //   296: aload_0
    //   297: instanceof net/minecraft/world/level/Level
    //   300: ifeq -> 397
    //   303: aload_0
    //   304: checkcast net/minecraft/world/level/Level
    //   307: astore #15
    //   309: aload #15
    //   311: invokevirtual isClientSide : ()Z
    //   314: ifne -> 362
    //   317: aload #15
    //   319: aconst_null
    //   320: new net/minecraft/core/BlockPos
    //   323: dup
    //   324: dload_1
    //   325: dload_3
    //   326: dload #5
    //   328: invokespecial <init> : (DDD)V
    //   331: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   334: new net/minecraft/resources/ResourceLocation
    //   337: dup
    //   338: ldc 'latex:transfur'
    //   340: invokespecial <init> : (Ljava/lang/String;)V
    //   343: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   348: checkcast net/minecraft/sounds/SoundEvent
    //   351: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   354: fconst_1
    //   355: fconst_1
    //   356: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   359: goto -> 397
    //   362: aload #15
    //   364: dload_1
    //   365: dload_3
    //   366: dload #5
    //   368: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   371: new net/minecraft/resources/ResourceLocation
    //   374: dup
    //   375: ldc 'latex:transfur'
    //   377: invokespecial <init> : (Ljava/lang/String;)V
    //   380: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   385: checkcast net/minecraft/sounds/SoundEvent
    //   388: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   391: fconst_1
    //   392: fconst_1
    //   393: iconst_0
    //   394: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   397: aload_0
    //   398: instanceof net/minecraft/server/level/ServerLevel
    //   401: ifeq -> 500
    //   404: aload_0
    //   405: checkcast net/minecraft/server/level/ServerLevel
    //   408: astore #15
    //   410: new net/mcreator/latexes/entity/YufengEntity
    //   413: dup
    //   414: getstatic net/mcreator/latexes/init/LatexModEntities.YUFENG : Lnet/minecraftforge/registries/RegistryObject;
    //   417: invokevirtual get : ()Ljava/lang/Object;
    //   420: checkcast net/minecraft/world/entity/EntityType
    //   423: aload #15
    //   425: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   428: astore #16
    //   430: aload #16
    //   432: dload_1
    //   433: dload_3
    //   434: dload #5
    //   436: aload_0
    //   437: invokeinterface getRandom : ()Ljava/util/Random;
    //   442: invokevirtual nextFloat : ()F
    //   445: ldc 360.0
    //   447: fmul
    //   448: fconst_0
    //   449: invokevirtual moveTo : (DDDFF)V
    //   452: aload #16
    //   454: instanceof net/minecraft/world/entity/Mob
    //   457: ifeq -> 491
    //   460: aload #16
    //   462: checkcast net/minecraft/world/entity/Mob
    //   465: astore #17
    //   467: aload #17
    //   469: aload #15
    //   471: aload_0
    //   472: aload #16
    //   474: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   477: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   482: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   485: aconst_null
    //   486: aconst_null
    //   487: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   490: pop
    //   491: aload_0
    //   492: aload #16
    //   494: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   499: pop
    //   500: goto -> 2283
    //   503: aload #7
    //   505: getfield level : Lnet/minecraft/world/level/Level;
    //   508: invokevirtual isClientSide : ()Z
    //   511: ifne -> 519
    //   514: aload #7
    //   516: invokevirtual discard : ()V
    //   519: aload_0
    //   520: instanceof net/minecraft/world/level/Level
    //   523: ifeq -> 620
    //   526: aload_0
    //   527: checkcast net/minecraft/world/level/Level
    //   530: astore #15
    //   532: aload #15
    //   534: invokevirtual isClientSide : ()Z
    //   537: ifne -> 585
    //   540: aload #15
    //   542: aconst_null
    //   543: new net/minecraft/core/BlockPos
    //   546: dup
    //   547: dload_1
    //   548: dload_3
    //   549: dload #5
    //   551: invokespecial <init> : (DDD)V
    //   554: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   557: new net/minecraft/resources/ResourceLocation
    //   560: dup
    //   561: ldc 'latex:transfur'
    //   563: invokespecial <init> : (Ljava/lang/String;)V
    //   566: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   571: checkcast net/minecraft/sounds/SoundEvent
    //   574: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   577: fconst_1
    //   578: fconst_1
    //   579: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   582: goto -> 620
    //   585: aload #15
    //   587: dload_1
    //   588: dload_3
    //   589: dload #5
    //   591: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   594: new net/minecraft/resources/ResourceLocation
    //   597: dup
    //   598: ldc 'latex:transfur'
    //   600: invokespecial <init> : (Ljava/lang/String;)V
    //   603: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   608: checkcast net/minecraft/sounds/SoundEvent
    //   611: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   614: fconst_1
    //   615: fconst_1
    //   616: iconst_0
    //   617: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   620: aload_0
    //   621: instanceof net/minecraft/server/level/ServerLevel
    //   624: ifeq -> 723
    //   627: aload_0
    //   628: checkcast net/minecraft/server/level/ServerLevel
    //   631: astore #15
    //   633: new net/mcreator/latexes/entity/DLbeeEntity
    //   636: dup
    //   637: getstatic net/mcreator/latexes/init/LatexModEntities.D_LBEE : Lnet/minecraftforge/registries/RegistryObject;
    //   640: invokevirtual get : ()Ljava/lang/Object;
    //   643: checkcast net/minecraft/world/entity/EntityType
    //   646: aload #15
    //   648: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   651: astore #16
    //   653: aload #16
    //   655: dload_1
    //   656: dload_3
    //   657: dload #5
    //   659: aload_0
    //   660: invokeinterface getRandom : ()Ljava/util/Random;
    //   665: invokevirtual nextFloat : ()F
    //   668: ldc 360.0
    //   670: fmul
    //   671: fconst_0
    //   672: invokevirtual moveTo : (DDDFF)V
    //   675: aload #16
    //   677: instanceof net/minecraft/world/entity/Mob
    //   680: ifeq -> 714
    //   683: aload #16
    //   685: checkcast net/minecraft/world/entity/Mob
    //   688: astore #17
    //   690: aload #17
    //   692: aload #15
    //   694: aload_0
    //   695: aload #16
    //   697: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   700: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   705: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   708: aconst_null
    //   709: aconst_null
    //   710: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   713: pop
    //   714: aload_0
    //   715: aload #16
    //   717: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   722: pop
    //   723: goto -> 2283
    //   726: aload #7
    //   728: instanceof net/minecraft/world/entity/animal/WaterAnimal
    //   731: iconst_1
    //   732: if_icmpne -> 1207
    //   735: invokestatic random : ()D
    //   738: ldc2_w 0.3
    //   741: dcmpg
    //   742: ifge -> 968
    //   745: aload #7
    //   747: getfield level : Lnet/minecraft/world/level/Level;
    //   750: invokevirtual isClientSide : ()Z
    //   753: ifne -> 761
    //   756: aload #7
    //   758: invokevirtual discard : ()V
    //   761: aload_0
    //   762: instanceof net/minecraft/world/level/Level
    //   765: ifeq -> 862
    //   768: aload_0
    //   769: checkcast net/minecraft/world/level/Level
    //   772: astore #15
    //   774: aload #15
    //   776: invokevirtual isClientSide : ()Z
    //   779: ifne -> 827
    //   782: aload #15
    //   784: aconst_null
    //   785: new net/minecraft/core/BlockPos
    //   788: dup
    //   789: dload_1
    //   790: dload_3
    //   791: dload #5
    //   793: invokespecial <init> : (DDD)V
    //   796: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   799: new net/minecraft/resources/ResourceLocation
    //   802: dup
    //   803: ldc 'latex:transfur'
    //   805: invokespecial <init> : (Ljava/lang/String;)V
    //   808: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   813: checkcast net/minecraft/sounds/SoundEvent
    //   816: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   819: fconst_1
    //   820: fconst_1
    //   821: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   824: goto -> 862
    //   827: aload #15
    //   829: dload_1
    //   830: dload_3
    //   831: dload #5
    //   833: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   836: new net/minecraft/resources/ResourceLocation
    //   839: dup
    //   840: ldc 'latex:transfur'
    //   842: invokespecial <init> : (Ljava/lang/String;)V
    //   845: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   850: checkcast net/minecraft/sounds/SoundEvent
    //   853: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   856: fconst_1
    //   857: fconst_1
    //   858: iconst_0
    //   859: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   862: aload_0
    //   863: instanceof net/minecraft/server/level/ServerLevel
    //   866: ifeq -> 965
    //   869: aload_0
    //   870: checkcast net/minecraft/server/level/ServerLevel
    //   873: astore #15
    //   875: new net/mcreator/latexes/entity/DlsharkEntity
    //   878: dup
    //   879: getstatic net/mcreator/latexes/init/LatexModEntities.DLSHARK : Lnet/minecraftforge/registries/RegistryObject;
    //   882: invokevirtual get : ()Ljava/lang/Object;
    //   885: checkcast net/minecraft/world/entity/EntityType
    //   888: aload #15
    //   890: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   893: astore #16
    //   895: aload #16
    //   897: dload_1
    //   898: dload_3
    //   899: dload #5
    //   901: aload_0
    //   902: invokeinterface getRandom : ()Ljava/util/Random;
    //   907: invokevirtual nextFloat : ()F
    //   910: ldc 360.0
    //   912: fmul
    //   913: fconst_0
    //   914: invokevirtual moveTo : (DDDFF)V
    //   917: aload #16
    //   919: instanceof net/minecraft/world/entity/Mob
    //   922: ifeq -> 956
    //   925: aload #16
    //   927: checkcast net/minecraft/world/entity/Mob
    //   930: astore #17
    //   932: aload #17
    //   934: aload #15
    //   936: aload_0
    //   937: aload #16
    //   939: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   942: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   947: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   950: aconst_null
    //   951: aconst_null
    //   952: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   955: pop
    //   956: aload_0
    //   957: aload #16
    //   959: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   964: pop
    //   965: goto -> 2283
    //   968: aload #7
    //   970: getfield level : Lnet/minecraft/world/level/Level;
    //   973: invokevirtual isClientSide : ()Z
    //   976: ifne -> 984
    //   979: aload #7
    //   981: invokevirtual discard : ()V
    //   984: aload #8
    //   986: getfield level : Lnet/minecraft/world/level/Level;
    //   989: invokevirtual isClientSide : ()Z
    //   992: ifne -> 1000
    //   995: aload #8
    //   997: invokevirtual discard : ()V
    //   1000: aload_0
    //   1001: instanceof net/minecraft/world/level/Level
    //   1004: ifeq -> 1101
    //   1007: aload_0
    //   1008: checkcast net/minecraft/world/level/Level
    //   1011: astore #15
    //   1013: aload #15
    //   1015: invokevirtual isClientSide : ()Z
    //   1018: ifne -> 1066
    //   1021: aload #15
    //   1023: aconst_null
    //   1024: new net/minecraft/core/BlockPos
    //   1027: dup
    //   1028: dload_1
    //   1029: dload_3
    //   1030: dload #5
    //   1032: invokespecial <init> : (DDD)V
    //   1035: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   1038: new net/minecraft/resources/ResourceLocation
    //   1041: dup
    //   1042: ldc 'latex:transfur'
    //   1044: invokespecial <init> : (Ljava/lang/String;)V
    //   1047: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   1052: checkcast net/minecraft/sounds/SoundEvent
    //   1055: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   1058: fconst_1
    //   1059: fconst_1
    //   1060: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   1063: goto -> 1101
    //   1066: aload #15
    //   1068: dload_1
    //   1069: dload_3
    //   1070: dload #5
    //   1072: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   1075: new net/minecraft/resources/ResourceLocation
    //   1078: dup
    //   1079: ldc 'latex:transfur'
    //   1081: invokespecial <init> : (Ljava/lang/String;)V
    //   1084: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   1089: checkcast net/minecraft/sounds/SoundEvent
    //   1092: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   1095: fconst_1
    //   1096: fconst_1
    //   1097: iconst_0
    //   1098: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   1101: aload_0
    //   1102: instanceof net/minecraft/server/level/ServerLevel
    //   1105: ifeq -> 1204
    //   1108: aload_0
    //   1109: checkcast net/minecraft/server/level/ServerLevel
    //   1112: astore #15
    //   1114: new net/mcreator/latexes/entity/DlsharkEntity
    //   1117: dup
    //   1118: getstatic net/mcreator/latexes/init/LatexModEntities.DLSHARK : Lnet/minecraftforge/registries/RegistryObject;
    //   1121: invokevirtual get : ()Ljava/lang/Object;
    //   1124: checkcast net/minecraft/world/entity/EntityType
    //   1127: aload #15
    //   1129: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   1132: astore #16
    //   1134: aload #16
    //   1136: dload_1
    //   1137: dload_3
    //   1138: dload #5
    //   1140: aload_0
    //   1141: invokeinterface getRandom : ()Ljava/util/Random;
    //   1146: invokevirtual nextFloat : ()F
    //   1149: ldc 360.0
    //   1151: fmul
    //   1152: fconst_0
    //   1153: invokevirtual moveTo : (DDDFF)V
    //   1156: aload #16
    //   1158: instanceof net/minecraft/world/entity/Mob
    //   1161: ifeq -> 1195
    //   1164: aload #16
    //   1166: checkcast net/minecraft/world/entity/Mob
    //   1169: astore #17
    //   1171: aload #17
    //   1173: aload #15
    //   1175: aload_0
    //   1176: aload #16
    //   1178: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   1181: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   1186: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   1189: aconst_null
    //   1190: aconst_null
    //   1191: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   1194: pop
    //   1195: aload_0
    //   1196: aload #16
    //   1198: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   1203: pop
    //   1204: goto -> 2283
    //   1207: aload #7
    //   1209: instanceof net/minecraft/world/entity/animal/Fox
    //   1212: iconst_1
    //   1213: if_icmpne -> 1439
    //   1216: aload #7
    //   1218: getfield level : Lnet/minecraft/world/level/Level;
    //   1221: invokevirtual isClientSide : ()Z
    //   1224: ifne -> 1232
    //   1227: aload #7
    //   1229: invokevirtual discard : ()V
    //   1232: aload_0
    //   1233: instanceof net/minecraft/world/level/Level
    //   1236: ifeq -> 1333
    //   1239: aload_0
    //   1240: checkcast net/minecraft/world/level/Level
    //   1243: astore #15
    //   1245: aload #15
    //   1247: invokevirtual isClientSide : ()Z
    //   1250: ifne -> 1298
    //   1253: aload #15
    //   1255: aconst_null
    //   1256: new net/minecraft/core/BlockPos
    //   1259: dup
    //   1260: dload_1
    //   1261: dload_3
    //   1262: dload #5
    //   1264: invokespecial <init> : (DDD)V
    //   1267: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   1270: new net/minecraft/resources/ResourceLocation
    //   1273: dup
    //   1274: ldc 'latex:transfur'
    //   1276: invokespecial <init> : (Ljava/lang/String;)V
    //   1279: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   1284: checkcast net/minecraft/sounds/SoundEvent
    //   1287: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   1290: fconst_1
    //   1291: fconst_1
    //   1292: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   1295: goto -> 1333
    //   1298: aload #15
    //   1300: dload_1
    //   1301: dload_3
    //   1302: dload #5
    //   1304: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   1307: new net/minecraft/resources/ResourceLocation
    //   1310: dup
    //   1311: ldc 'latex:transfur'
    //   1313: invokespecial <init> : (Ljava/lang/String;)V
    //   1316: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   1321: checkcast net/minecraft/sounds/SoundEvent
    //   1324: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   1327: fconst_1
    //   1328: fconst_1
    //   1329: iconst_0
    //   1330: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   1333: aload_0
    //   1334: instanceof net/minecraft/server/level/ServerLevel
    //   1337: ifeq -> 1436
    //   1340: aload_0
    //   1341: checkcast net/minecraft/server/level/ServerLevel
    //   1344: astore #15
    //   1346: new net/mcreator/latexes/entity/DarkLatexFoxEntity
    //   1349: dup
    //   1350: getstatic net/mcreator/latexes/init/LatexModEntities.DARK_LATEX_FOX : Lnet/minecraftforge/registries/RegistryObject;
    //   1353: invokevirtual get : ()Ljava/lang/Object;
    //   1356: checkcast net/minecraft/world/entity/EntityType
    //   1359: aload #15
    //   1361: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   1364: astore #16
    //   1366: aload #16
    //   1368: dload_1
    //   1369: dload_3
    //   1370: dload #5
    //   1372: aload_0
    //   1373: invokeinterface getRandom : ()Ljava/util/Random;
    //   1378: invokevirtual nextFloat : ()F
    //   1381: ldc 360.0
    //   1383: fmul
    //   1384: fconst_0
    //   1385: invokevirtual moveTo : (DDDFF)V
    //   1388: aload #16
    //   1390: instanceof net/minecraft/world/entity/Mob
    //   1393: ifeq -> 1427
    //   1396: aload #16
    //   1398: checkcast net/minecraft/world/entity/Mob
    //   1401: astore #17
    //   1403: aload #17
    //   1405: aload #15
    //   1407: aload_0
    //   1408: aload #16
    //   1410: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   1413: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   1418: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   1421: aconst_null
    //   1422: aconst_null
    //   1423: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   1426: pop
    //   1427: aload_0
    //   1428: aload #16
    //   1430: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   1435: pop
    //   1436: goto -> 2283
    //   1439: aload #7
    //   1441: invokevirtual getType : ()Lnet/minecraft/world/entity/EntityType;
    //   1444: getstatic net/minecraft/core/Registry.ENTITY_TYPE_REGISTRY : Lnet/minecraft/resources/ResourceKey;
    //   1447: new net/minecraft/resources/ResourceLocation
    //   1450: dup
    //   1451: ldc_w 'minecraft:skeletons'
    //   1454: invokespecial <init> : (Ljava/lang/String;)V
    //   1457: invokestatic create : (Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraft/tags/TagKey;
    //   1460: invokevirtual is : (Lnet/minecraft/tags/TagKey;)Z
    //   1463: iconst_1
    //   1464: if_icmpne -> 1806
    //   1467: aload #7
    //   1469: getfield level : Lnet/minecraft/world/level/Level;
    //   1472: invokevirtual isClientSide : ()Z
    //   1475: ifne -> 1483
    //   1478: aload #7
    //   1480: invokevirtual discard : ()V
    //   1483: aload_0
    //   1484: instanceof net/minecraft/world/level/Level
    //   1487: ifeq -> 1584
    //   1490: aload_0
    //   1491: checkcast net/minecraft/world/level/Level
    //   1494: astore #15
    //   1496: aload #15
    //   1498: invokevirtual isClientSide : ()Z
    //   1501: ifne -> 1549
    //   1504: aload #15
    //   1506: aconst_null
    //   1507: new net/minecraft/core/BlockPos
    //   1510: dup
    //   1511: dload_1
    //   1512: dload_3
    //   1513: dload #5
    //   1515: invokespecial <init> : (DDD)V
    //   1518: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   1521: new net/minecraft/resources/ResourceLocation
    //   1524: dup
    //   1525: ldc 'latex:transfur'
    //   1527: invokespecial <init> : (Ljava/lang/String;)V
    //   1530: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   1535: checkcast net/minecraft/sounds/SoundEvent
    //   1538: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   1541: fconst_1
    //   1542: fconst_1
    //   1543: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   1546: goto -> 1584
    //   1549: aload #15
    //   1551: dload_1
    //   1552: dload_3
    //   1553: dload #5
    //   1555: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   1558: new net/minecraft/resources/ResourceLocation
    //   1561: dup
    //   1562: ldc 'latex:transfur'
    //   1564: invokespecial <init> : (Ljava/lang/String;)V
    //   1567: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   1572: checkcast net/minecraft/sounds/SoundEvent
    //   1575: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   1578: fconst_1
    //   1579: fconst_1
    //   1580: iconst_0
    //   1581: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   1584: invokestatic random : ()D
    //   1587: ldc2_w 0.25
    //   1590: dcmpg
    //   1591: ifge -> 1700
    //   1594: aload_0
    //   1595: instanceof net/minecraft/server/level/ServerLevel
    //   1598: ifeq -> 1697
    //   1601: aload_0
    //   1602: checkcast net/minecraft/server/level/ServerLevel
    //   1605: astore #15
    //   1607: new net/mcreator/latexes/entity/DarkLatexSkeletonEntity
    //   1610: dup
    //   1611: getstatic net/mcreator/latexes/init/LatexModEntities.DARK_LATEX_SKELETON : Lnet/minecraftforge/registries/RegistryObject;
    //   1614: invokevirtual get : ()Ljava/lang/Object;
    //   1617: checkcast net/minecraft/world/entity/EntityType
    //   1620: aload #15
    //   1622: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   1625: astore #16
    //   1627: aload #16
    //   1629: dload_1
    //   1630: dload_3
    //   1631: dload #5
    //   1633: aload_0
    //   1634: invokeinterface getRandom : ()Ljava/util/Random;
    //   1639: invokevirtual nextFloat : ()F
    //   1642: ldc 360.0
    //   1644: fmul
    //   1645: fconst_0
    //   1646: invokevirtual moveTo : (DDDFF)V
    //   1649: aload #16
    //   1651: instanceof net/minecraft/world/entity/Mob
    //   1654: ifeq -> 1688
    //   1657: aload #16
    //   1659: checkcast net/minecraft/world/entity/Mob
    //   1662: astore #17
    //   1664: aload #17
    //   1666: aload #15
    //   1668: aload_0
    //   1669: aload #16
    //   1671: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   1674: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   1679: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   1682: aconst_null
    //   1683: aconst_null
    //   1684: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   1687: pop
    //   1688: aload_0
    //   1689: aload #16
    //   1691: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   1696: pop
    //   1697: goto -> 2283
    //   1700: aload_0
    //   1701: instanceof net/minecraft/server/level/ServerLevel
    //   1704: ifeq -> 1803
    //   1707: aload_0
    //   1708: checkcast net/minecraft/server/level/ServerLevel
    //   1711: astore #15
    //   1713: new net/mcreator/latexes/entity/YufengEntity
    //   1716: dup
    //   1717: getstatic net/mcreator/latexes/init/LatexModEntities.YUFENG : Lnet/minecraftforge/registries/RegistryObject;
    //   1720: invokevirtual get : ()Ljava/lang/Object;
    //   1723: checkcast net/minecraft/world/entity/EntityType
    //   1726: aload #15
    //   1728: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   1731: astore #16
    //   1733: aload #16
    //   1735: dload_1
    //   1736: dload_3
    //   1737: dload #5
    //   1739: aload_0
    //   1740: invokeinterface getRandom : ()Ljava/util/Random;
    //   1745: invokevirtual nextFloat : ()F
    //   1748: ldc 360.0
    //   1750: fmul
    //   1751: fconst_0
    //   1752: invokevirtual moveTo : (DDDFF)V
    //   1755: aload #16
    //   1757: instanceof net/minecraft/world/entity/Mob
    //   1760: ifeq -> 1794
    //   1763: aload #16
    //   1765: checkcast net/minecraft/world/entity/Mob
    //   1768: astore #17
    //   1770: aload #17
    //   1772: aload #15
    //   1774: aload_0
    //   1775: aload #16
    //   1777: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   1780: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   1785: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   1788: aconst_null
    //   1789: aconst_null
    //   1790: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   1793: pop
    //   1794: aload_0
    //   1795: aload #16
    //   1797: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   1802: pop
    //   1803: goto -> 2283
    //   1806: aload #7
    //   1808: instanceof net/mcreator/latexes/entity/DarklatexEntity
    //   1811: iconst_1
    //   1812: if_icmpeq -> 2283
    //   1815: aload #7
    //   1817: getfield level : Lnet/minecraft/world/level/Level;
    //   1820: invokevirtual isClientSide : ()Z
    //   1823: ifne -> 1831
    //   1826: aload #7
    //   1828: invokevirtual discard : ()V
    //   1831: aload_0
    //   1832: instanceof net/minecraft/world/level/Level
    //   1835: ifeq -> 1932
    //   1838: aload_0
    //   1839: checkcast net/minecraft/world/level/Level
    //   1842: astore #15
    //   1844: aload #15
    //   1846: invokevirtual isClientSide : ()Z
    //   1849: ifne -> 1897
    //   1852: aload #15
    //   1854: aconst_null
    //   1855: new net/minecraft/core/BlockPos
    //   1858: dup
    //   1859: dload_1
    //   1860: dload_3
    //   1861: dload #5
    //   1863: invokespecial <init> : (DDD)V
    //   1866: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   1869: new net/minecraft/resources/ResourceLocation
    //   1872: dup
    //   1873: ldc 'latex:transfur'
    //   1875: invokespecial <init> : (Ljava/lang/String;)V
    //   1878: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   1883: checkcast net/minecraft/sounds/SoundEvent
    //   1886: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   1889: fconst_1
    //   1890: fconst_1
    //   1891: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   1894: goto -> 1932
    //   1897: aload #15
    //   1899: dload_1
    //   1900: dload_3
    //   1901: dload #5
    //   1903: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   1906: new net/minecraft/resources/ResourceLocation
    //   1909: dup
    //   1910: ldc 'latex:transfur'
    //   1912: invokespecial <init> : (Ljava/lang/String;)V
    //   1915: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   1920: checkcast net/minecraft/sounds/SoundEvent
    //   1923: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   1926: fconst_1
    //   1927: fconst_1
    //   1928: iconst_0
    //   1929: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   1932: invokestatic random : ()D
    //   1935: ldc2_w 0.25
    //   1938: dcmpg
    //   1939: ifge -> 2048
    //   1942: aload_0
    //   1943: instanceof net/minecraft/server/level/ServerLevel
    //   1946: ifeq -> 2045
    //   1949: aload_0
    //   1950: checkcast net/minecraft/server/level/ServerLevel
    //   1953: astore #15
    //   1955: new net/mcreator/latexes/entity/YufengEntity
    //   1958: dup
    //   1959: getstatic net/mcreator/latexes/init/LatexModEntities.YUFENG : Lnet/minecraftforge/registries/RegistryObject;
    //   1962: invokevirtual get : ()Ljava/lang/Object;
    //   1965: checkcast net/minecraft/world/entity/EntityType
    //   1968: aload #15
    //   1970: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   1973: astore #16
    //   1975: aload #16
    //   1977: dload_1
    //   1978: dload_3
    //   1979: dload #5
    //   1981: aload_0
    //   1982: invokeinterface getRandom : ()Ljava/util/Random;
    //   1987: invokevirtual nextFloat : ()F
    //   1990: ldc 360.0
    //   1992: fmul
    //   1993: fconst_0
    //   1994: invokevirtual moveTo : (DDDFF)V
    //   1997: aload #16
    //   1999: instanceof net/minecraft/world/entity/Mob
    //   2002: ifeq -> 2036
    //   2005: aload #16
    //   2007: checkcast net/minecraft/world/entity/Mob
    //   2010: astore #17
    //   2012: aload #17
    //   2014: aload #15
    //   2016: aload_0
    //   2017: aload #16
    //   2019: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   2022: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   2027: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   2030: aconst_null
    //   2031: aconst_null
    //   2032: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   2035: pop
    //   2036: aload_0
    //   2037: aload #16
    //   2039: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   2044: pop
    //   2045: goto -> 2283
    //   2048: invokestatic random : ()D
    //   2051: ldc2_w 0.01
    //   2054: dcmpg
    //   2055: ifge -> 2180
    //   2058: aload #8
    //   2060: getfield level : Lnet/minecraft/world/level/Level;
    //   2063: invokevirtual isClientSide : ()Z
    //   2066: ifne -> 2074
    //   2069: aload #8
    //   2071: invokevirtual discard : ()V
    //   2074: aload_0
    //   2075: instanceof net/minecraft/server/level/ServerLevel
    //   2078: ifeq -> 2177
    //   2081: aload_0
    //   2082: checkcast net/minecraft/server/level/ServerLevel
    //   2085: astore #15
    //   2087: new net/mcreator/latexes/entity/YufengEntity
    //   2090: dup
    //   2091: getstatic net/mcreator/latexes/init/LatexModEntities.YUFENG : Lnet/minecraftforge/registries/RegistryObject;
    //   2094: invokevirtual get : ()Ljava/lang/Object;
    //   2097: checkcast net/minecraft/world/entity/EntityType
    //   2100: aload #15
    //   2102: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   2105: astore #16
    //   2107: aload #16
    //   2109: dload_1
    //   2110: dload_3
    //   2111: dload #5
    //   2113: aload_0
    //   2114: invokeinterface getRandom : ()Ljava/util/Random;
    //   2119: invokevirtual nextFloat : ()F
    //   2122: ldc 360.0
    //   2124: fmul
    //   2125: fconst_0
    //   2126: invokevirtual moveTo : (DDDFF)V
    //   2129: aload #16
    //   2131: instanceof net/minecraft/world/entity/Mob
    //   2134: ifeq -> 2168
    //   2137: aload #16
    //   2139: checkcast net/minecraft/world/entity/Mob
    //   2142: astore #17
    //   2144: aload #17
    //   2146: aload #15
    //   2148: aload_0
    //   2149: aload #16
    //   2151: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   2154: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   2159: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   2162: aconst_null
    //   2163: aconst_null
    //   2164: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   2167: pop
    //   2168: aload_0
    //   2169: aload #16
    //   2171: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   2176: pop
    //   2177: goto -> 2283
    //   2180: aload_0
    //   2181: instanceof net/minecraft/server/level/ServerLevel
    //   2184: ifeq -> 2283
    //   2187: aload_0
    //   2188: checkcast net/minecraft/server/level/ServerLevel
    //   2191: astore #15
    //   2193: new net/mcreator/latexes/entity/DarkLatexSkeletonEntity
    //   2196: dup
    //   2197: getstatic net/mcreator/latexes/init/LatexModEntities.DARK_LATEX_SKELETON : Lnet/minecraftforge/registries/RegistryObject;
    //   2200: invokevirtual get : ()Ljava/lang/Object;
    //   2203: checkcast net/minecraft/world/entity/EntityType
    //   2206: aload #15
    //   2208: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   2211: astore #16
    //   2213: aload #16
    //   2215: dload_1
    //   2216: dload_3
    //   2217: dload #5
    //   2219: aload_0
    //   2220: invokeinterface getRandom : ()Ljava/util/Random;
    //   2225: invokevirtual nextFloat : ()F
    //   2228: ldc 360.0
    //   2230: fmul
    //   2231: fconst_0
    //   2232: invokevirtual moveTo : (DDDFF)V
    //   2235: aload #16
    //   2237: instanceof net/minecraft/world/entity/Mob
    //   2240: ifeq -> 2274
    //   2243: aload #16
    //   2245: checkcast net/minecraft/world/entity/Mob
    //   2248: astore #17
    //   2250: aload #17
    //   2252: aload #15
    //   2254: aload_0
    //   2255: aload #16
    //   2257: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   2260: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   2265: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   2268: aconst_null
    //   2269: aconst_null
    //   2270: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   2273: pop
    //   2274: aload_0
    //   2275: aload #16
    //   2277: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   2282: pop
    //   2283: iconst_0
    //   2284: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #36	-> 0
    //   #37	-> 10
    //   #38	-> 12
    //   #39	-> 15
    //   #40	-> 36
    //   #41	-> 65
    //   #42	-> 77
    //   #43	-> 106
    //   #44	-> 118
    //   #45	-> 147
    //   #46	-> 159
    //   #47	-> 188
    //   #48	-> 209
    //   #50	-> 243
    //   #51	-> 245
    //   #52	-> 254
    //   #53	-> 264
    //   #54	-> 275
    //   #55	-> 280
    //   #56	-> 291
    //   #57	-> 296
    //   #58	-> 309
    //   #59	-> 317
    //   #60	-> 343
    //   #59	-> 356
    //   #62	-> 362
    //   #66	-> 397
    //   #67	-> 410
    //   #68	-> 430
    //   #69	-> 452
    //   #70	-> 467
    //   #72	-> 491
    //   #73	-> 500
    //   #75	-> 503
    //   #76	-> 514
    //   #77	-> 519
    //   #78	-> 532
    //   #79	-> 540
    //   #80	-> 566
    //   #79	-> 579
    //   #82	-> 585
    //   #86	-> 620
    //   #87	-> 633
    //   #88	-> 653
    //   #89	-> 675
    //   #90	-> 690
    //   #92	-> 714
    //   #93	-> 723
    //   #95	-> 726
    //   #96	-> 735
    //   #97	-> 745
    //   #98	-> 756
    //   #99	-> 761
    //   #100	-> 774
    //   #101	-> 782
    //   #102	-> 808
    //   #101	-> 821
    //   #104	-> 827
    //   #108	-> 862
    //   #109	-> 875
    //   #110	-> 895
    //   #111	-> 917
    //   #112	-> 932
    //   #114	-> 956
    //   #115	-> 965
    //   #117	-> 968
    //   #118	-> 979
    //   #119	-> 984
    //   #120	-> 995
    //   #121	-> 1000
    //   #122	-> 1013
    //   #123	-> 1021
    //   #124	-> 1047
    //   #123	-> 1060
    //   #126	-> 1066
    //   #130	-> 1101
    //   #131	-> 1114
    //   #132	-> 1134
    //   #133	-> 1156
    //   #134	-> 1171
    //   #136	-> 1195
    //   #137	-> 1204
    //   #139	-> 1207
    //   #140	-> 1216
    //   #141	-> 1227
    //   #142	-> 1232
    //   #143	-> 1245
    //   #144	-> 1253
    //   #145	-> 1279
    //   #144	-> 1292
    //   #147	-> 1298
    //   #151	-> 1333
    //   #152	-> 1346
    //   #153	-> 1366
    //   #154	-> 1388
    //   #155	-> 1403
    //   #157	-> 1427
    //   #158	-> 1436
    //   #159	-> 1439
    //   #160	-> 1467
    //   #161	-> 1478
    //   #162	-> 1483
    //   #163	-> 1496
    //   #164	-> 1504
    //   #165	-> 1530
    //   #164	-> 1543
    //   #167	-> 1549
    //   #171	-> 1584
    //   #172	-> 1594
    //   #173	-> 1607
    //   #174	-> 1627
    //   #175	-> 1649
    //   #176	-> 1664
    //   #178	-> 1688
    //   #179	-> 1697
    //   #181	-> 1700
    //   #182	-> 1713
    //   #183	-> 1733
    //   #184	-> 1755
    //   #185	-> 1770
    //   #187	-> 1794
    //   #188	-> 1803
    //   #190	-> 1806
    //   #191	-> 1815
    //   #192	-> 1826
    //   #193	-> 1831
    //   #194	-> 1844
    //   #195	-> 1852
    //   #196	-> 1878
    //   #195	-> 1891
    //   #198	-> 1897
    //   #202	-> 1932
    //   #203	-> 1942
    //   #204	-> 1955
    //   #205	-> 1975
    //   #206	-> 1997
    //   #207	-> 2012
    //   #209	-> 2036
    //   #210	-> 2045
    //   #211	-> 2048
    //   #212	-> 2058
    //   #213	-> 2069
    //   #214	-> 2074
    //   #215	-> 2087
    //   #216	-> 2107
    //   #217	-> 2129
    //   #218	-> 2144
    //   #220	-> 2168
    //   #221	-> 2177
    //   #223	-> 2180
    //   #224	-> 2193
    //   #225	-> 2213
    //   #226	-> 2235
    //   #227	-> 2250
    //   #229	-> 2274
    //   #235	-> 2283
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   51	11	11	_entGetArmor	Lnet/minecraft/world/entity/LivingEntity;
    //   92	11	12	_entGetArmor	Lnet/minecraft/world/entity/LivingEntity;
    //   133	11	13	_entGetArmor	Lnet/minecraft/world/entity/LivingEntity;
    //   174	11	14	_entGetArmor	Lnet/minecraft/world/entity/LivingEntity;
    //   309	88	15	_level	Lnet/minecraft/world/level/Level;
    //   467	24	17	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   430	70	16	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   410	90	15	_level	Lnet/minecraft/server/level/ServerLevel;
    //   532	88	15	_level	Lnet/minecraft/world/level/Level;
    //   690	24	17	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   653	70	16	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   633	90	15	_level	Lnet/minecraft/server/level/ServerLevel;
    //   774	88	15	_level	Lnet/minecraft/world/level/Level;
    //   932	24	17	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   895	70	16	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   875	90	15	_level	Lnet/minecraft/server/level/ServerLevel;
    //   1013	88	15	_level	Lnet/minecraft/world/level/Level;
    //   1171	24	17	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   1134	70	16	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   1114	90	15	_level	Lnet/minecraft/server/level/ServerLevel;
    //   1245	88	15	_level	Lnet/minecraft/world/level/Level;
    //   1403	24	17	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   1366	70	16	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   1346	90	15	_level	Lnet/minecraft/server/level/ServerLevel;
    //   1496	88	15	_level	Lnet/minecraft/world/level/Level;
    //   1664	24	17	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   1627	70	16	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   1607	90	15	_level	Lnet/minecraft/server/level/ServerLevel;
    //   1770	24	17	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   1733	70	16	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   1713	90	15	_level	Lnet/minecraft/server/level/ServerLevel;
    //   1844	88	15	_level	Lnet/minecraft/world/level/Level;
    //   2012	24	17	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   1975	70	16	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   1955	90	15	_level	Lnet/minecraft/server/level/ServerLevel;
    //   2144	24	17	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   2107	70	16	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   2087	90	15	_level	Lnet/minecraft/server/level/ServerLevel;
    //   2250	24	17	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   2213	70	16	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   2193	90	15	_level	Lnet/minecraft/server/level/ServerLevel;
    //   0	2285	0	world	Lnet/minecraft/world/level/LevelAccessor;
    //   0	2285	1	x	D
    //   0	2285	3	y	D
    //   0	2285	5	z	D
    //   0	2285	7	entity	Lnet/minecraft/world/entity/Entity;
    //   0	2285	8	sourceentity	Lnet/minecraft/world/entity/Entity;
    //   15	2270	9	entitykills	D
  }
}


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\DarkLatexSkeletonThisEntityKillsAnotherOneProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */