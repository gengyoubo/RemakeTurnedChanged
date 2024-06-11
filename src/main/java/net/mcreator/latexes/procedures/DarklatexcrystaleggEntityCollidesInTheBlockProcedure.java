package net.mcreator.latexes.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.LevelAccessor;

public class DarklatexcrystaleggEntityCollidesInTheBlockProcedure {
  public static boolean execute(LevelAccessor world, double x, double y, double z, Entity entity) {
    // Byte code:
    //   0: aload #7
    //   2: ifnonnull -> 7
    //   5: iconst_0
    //   6: ireturn
    //   7: aload #7
    //   9: instanceof net/minecraft/world/entity/player/Player
    //   12: ifeq -> 35
    //   15: aload #7
    //   17: checkcast net/minecraft/world/entity/player/Player
    //   20: astore #8
    //   22: aload #8
    //   24: invokevirtual getAbilities : ()Lnet/minecraft/world/entity/player/Abilities;
    //   27: getfield instabuild : Z
    //   30: ifeq -> 35
    //   33: iconst_1
    //   34: ireturn
    //   35: aload #7
    //   37: instanceof net/minecraft/world/entity/LivingEntity
    //   40: ifeq -> 61
    //   43: aload #7
    //   45: checkcast net/minecraft/world/entity/LivingEntity
    //   48: astore #9
    //   50: aload #9
    //   52: getstatic net/minecraft/world/entity/EquipmentSlot.HEAD : Lnet/minecraft/world/entity/EquipmentSlot;
    //   55: invokevirtual getItemBySlot : (Lnet/minecraft/world/entity/EquipmentSlot;)Lnet/minecraft/world/item/ItemStack;
    //   58: goto -> 64
    //   61: getstatic net/minecraft/world/item/ItemStack.EMPTY : Lnet/minecraft/world/item/ItemStack;
    //   64: invokevirtual getItem : ()Lnet/minecraft/world/item/Item;
    //   67: getstatic net/mcreator/latexes/init/LatexModItems.HAZMAT_HELMET : Lnet/minecraftforge/registries/RegistryObject;
    //   70: invokevirtual get : ()Ljava/lang/Object;
    //   73: if_acmpne -> 199
    //   76: aload #7
    //   78: instanceof net/minecraft/world/entity/LivingEntity
    //   81: ifeq -> 102
    //   84: aload #7
    //   86: checkcast net/minecraft/world/entity/LivingEntity
    //   89: astore #10
    //   91: aload #10
    //   93: getstatic net/minecraft/world/entity/EquipmentSlot.CHEST : Lnet/minecraft/world/entity/EquipmentSlot;
    //   96: invokevirtual getItemBySlot : (Lnet/minecraft/world/entity/EquipmentSlot;)Lnet/minecraft/world/item/ItemStack;
    //   99: goto -> 105
    //   102: getstatic net/minecraft/world/item/ItemStack.EMPTY : Lnet/minecraft/world/item/ItemStack;
    //   105: invokevirtual getItem : ()Lnet/minecraft/world/item/Item;
    //   108: getstatic net/mcreator/latexes/init/LatexModItems.HAZMAT_CHESTPLATE : Lnet/minecraftforge/registries/RegistryObject;
    //   111: invokevirtual get : ()Ljava/lang/Object;
    //   114: if_acmpne -> 199
    //   117: aload #7
    //   119: instanceof net/minecraft/world/entity/LivingEntity
    //   122: ifeq -> 143
    //   125: aload #7
    //   127: checkcast net/minecraft/world/entity/LivingEntity
    //   130: astore #11
    //   132: aload #11
    //   134: getstatic net/minecraft/world/entity/EquipmentSlot.LEGS : Lnet/minecraft/world/entity/EquipmentSlot;
    //   137: invokevirtual getItemBySlot : (Lnet/minecraft/world/entity/EquipmentSlot;)Lnet/minecraft/world/item/ItemStack;
    //   140: goto -> 146
    //   143: getstatic net/minecraft/world/item/ItemStack.EMPTY : Lnet/minecraft/world/item/ItemStack;
    //   146: invokevirtual getItem : ()Lnet/minecraft/world/item/Item;
    //   149: getstatic net/mcreator/latexes/init/LatexModItems.HAZMAT_LEGGINGS : Lnet/minecraftforge/registries/RegistryObject;
    //   152: invokevirtual get : ()Ljava/lang/Object;
    //   155: if_acmpne -> 199
    //   158: aload #7
    //   160: instanceof net/minecraft/world/entity/LivingEntity
    //   163: ifeq -> 184
    //   166: aload #7
    //   168: checkcast net/minecraft/world/entity/LivingEntity
    //   171: astore #12
    //   173: aload #12
    //   175: getstatic net/minecraft/world/entity/EquipmentSlot.FEET : Lnet/minecraft/world/entity/EquipmentSlot;
    //   178: invokevirtual getItemBySlot : (Lnet/minecraft/world/entity/EquipmentSlot;)Lnet/minecraft/world/item/ItemStack;
    //   181: goto -> 187
    //   184: getstatic net/minecraft/world/item/ItemStack.EMPTY : Lnet/minecraft/world/item/ItemStack;
    //   187: invokevirtual getItem : ()Lnet/minecraft/world/item/Item;
    //   190: getstatic net/mcreator/latexes/init/LatexModItems.HAZMAT_BOOTS : Lnet/minecraftforge/registries/RegistryObject;
    //   193: invokevirtual get : ()Ljava/lang/Object;
    //   196: if_acmpeq -> 249
    //   199: aload #7
    //   201: invokevirtual getType : ()Lnet/minecraft/world/entity/EntityType;
    //   204: getstatic net/minecraft/core/Registry.ENTITY_TYPE_REGISTRY : Lnet/minecraft/resources/ResourceKey;
    //   207: new net/minecraft/resources/ResourceLocation
    //   210: dup
    //   211: ldc 'latex:robots'
    //   213: invokespecial <init> : (Ljava/lang/String;)V
    //   216: invokestatic create : (Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraft/tags/TagKey;
    //   219: invokevirtual is : (Lnet/minecraft/tags/TagKey;)Z
    //   222: ifne -> 249
    //   225: aload #7
    //   227: instanceof net/minecraft/world/entity/monster/ElderGuardian
    //   230: ifne -> 249
    //   233: aload #7
    //   235: instanceof net/minecraft/world/entity/boss/wither/WitherBoss
    //   238: ifne -> 249
    //   241: aload #7
    //   243: instanceof net/minecraft/world/entity/boss/enderdragon/EnderDragon
    //   246: ifeq -> 253
    //   249: iconst_1
    //   250: goto -> 254
    //   253: iconst_0
    //   254: iconst_1
    //   255: if_icmpeq -> 4361
    //   258: invokestatic random : ()D
    //   261: ldc2_w 0.25
    //   264: dcmpg
    //   265: ifge -> 4346
    //   268: aload #7
    //   270: instanceof net/minecraft/world/entity/player/Player
    //   273: iconst_1
    //   274: if_icmpeq -> 4346
    //   277: aload #7
    //   279: instanceof net/mcreator/latexes/entity/DarklatexEntity
    //   282: ifeq -> 892
    //   285: invokestatic random : ()D
    //   288: ldc2_w 0.3
    //   291: dcmpg
    //   292: ifge -> 518
    //   295: aload #7
    //   297: getfield level : Lnet/minecraft/world/level/Level;
    //   300: invokevirtual isClientSide : ()Z
    //   303: ifne -> 311
    //   306: aload #7
    //   308: invokevirtual discard : ()V
    //   311: aload_0
    //   312: instanceof net/minecraft/world/level/Level
    //   315: ifeq -> 412
    //   318: aload_0
    //   319: checkcast net/minecraft/world/level/Level
    //   322: astore #13
    //   324: aload #13
    //   326: invokevirtual isClientSide : ()Z
    //   329: ifne -> 377
    //   332: aload #13
    //   334: aconst_null
    //   335: new net/minecraft/core/BlockPos
    //   338: dup
    //   339: dload_1
    //   340: dload_3
    //   341: dload #5
    //   343: invokespecial <init> : (DDD)V
    //   346: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   349: new net/minecraft/resources/ResourceLocation
    //   352: dup
    //   353: ldc 'entity.zombie_villager.converted'
    //   355: invokespecial <init> : (Ljava/lang/String;)V
    //   358: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   363: checkcast net/minecraft/sounds/SoundEvent
    //   366: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   369: fconst_1
    //   370: fconst_1
    //   371: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   374: goto -> 412
    //   377: aload #13
    //   379: dload_1
    //   380: dload_3
    //   381: dload #5
    //   383: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   386: new net/minecraft/resources/ResourceLocation
    //   389: dup
    //   390: ldc 'entity.zombie_villager.converted'
    //   392: invokespecial <init> : (Ljava/lang/String;)V
    //   395: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   400: checkcast net/minecraft/sounds/SoundEvent
    //   403: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   406: fconst_1
    //   407: fconst_1
    //   408: iconst_0
    //   409: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   412: aload_0
    //   413: instanceof net/minecraft/server/level/ServerLevel
    //   416: ifeq -> 515
    //   419: aload_0
    //   420: checkcast net/minecraft/server/level/ServerLevel
    //   423: astore #13
    //   425: new net/mcreator/latexes/entity/DarkLatexSkeletonEntity
    //   428: dup
    //   429: getstatic net/mcreator/latexes/init/LatexModEntities.DARK_LATEX_SKELETON : Lnet/minecraftforge/registries/RegistryObject;
    //   432: invokevirtual get : ()Ljava/lang/Object;
    //   435: checkcast net/minecraft/world/entity/EntityType
    //   438: aload #13
    //   440: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   443: astore #14
    //   445: aload #14
    //   447: dload_1
    //   448: dload_3
    //   449: dload #5
    //   451: aload_0
    //   452: invokeinterface getRandom : ()Ljava/util/Random;
    //   457: invokevirtual nextFloat : ()F
    //   460: ldc 360.0
    //   462: fmul
    //   463: fconst_0
    //   464: invokevirtual moveTo : (DDDFF)V
    //   467: aload #14
    //   469: instanceof net/minecraft/world/entity/Mob
    //   472: ifeq -> 506
    //   475: aload #14
    //   477: checkcast net/minecraft/world/entity/Mob
    //   480: astore #15
    //   482: aload #15
    //   484: aload #13
    //   486: aload_0
    //   487: aload #14
    //   489: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   492: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   497: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   500: aconst_null
    //   501: aconst_null
    //   502: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   505: pop
    //   506: aload_0
    //   507: aload #14
    //   509: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   514: pop
    //   515: goto -> 870
    //   518: invokestatic random : ()D
    //   521: ldc2_w 0.1
    //   524: dcmpg
    //   525: ifge -> 751
    //   528: aload #7
    //   530: getfield level : Lnet/minecraft/world/level/Level;
    //   533: invokevirtual isClientSide : ()Z
    //   536: ifne -> 544
    //   539: aload #7
    //   541: invokevirtual discard : ()V
    //   544: aload_0
    //   545: instanceof net/minecraft/world/level/Level
    //   548: ifeq -> 645
    //   551: aload_0
    //   552: checkcast net/minecraft/world/level/Level
    //   555: astore #13
    //   557: aload #13
    //   559: invokevirtual isClientSide : ()Z
    //   562: ifne -> 610
    //   565: aload #13
    //   567: aconst_null
    //   568: new net/minecraft/core/BlockPos
    //   571: dup
    //   572: dload_1
    //   573: dload_3
    //   574: dload #5
    //   576: invokespecial <init> : (DDD)V
    //   579: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   582: new net/minecraft/resources/ResourceLocation
    //   585: dup
    //   586: ldc 'entity.zombie_villager.converted'
    //   588: invokespecial <init> : (Ljava/lang/String;)V
    //   591: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   596: checkcast net/minecraft/sounds/SoundEvent
    //   599: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   602: fconst_1
    //   603: fconst_1
    //   604: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   607: goto -> 645
    //   610: aload #13
    //   612: dload_1
    //   613: dload_3
    //   614: dload #5
    //   616: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   619: new net/minecraft/resources/ResourceLocation
    //   622: dup
    //   623: ldc 'entity.zombie_villager.converted'
    //   625: invokespecial <init> : (Ljava/lang/String;)V
    //   628: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   633: checkcast net/minecraft/sounds/SoundEvent
    //   636: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   639: fconst_1
    //   640: fconst_1
    //   641: iconst_0
    //   642: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   645: aload_0
    //   646: instanceof net/minecraft/server/level/ServerLevel
    //   649: ifeq -> 748
    //   652: aload_0
    //   653: checkcast net/minecraft/server/level/ServerLevel
    //   656: astore #13
    //   658: new net/mcreator/latexes/entity/YufengEntity
    //   661: dup
    //   662: getstatic net/mcreator/latexes/init/LatexModEntities.YUFENG : Lnet/minecraftforge/registries/RegistryObject;
    //   665: invokevirtual get : ()Ljava/lang/Object;
    //   668: checkcast net/minecraft/world/entity/EntityType
    //   671: aload #13
    //   673: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   676: astore #14
    //   678: aload #14
    //   680: dload_1
    //   681: dload_3
    //   682: dload #5
    //   684: aload_0
    //   685: invokeinterface getRandom : ()Ljava/util/Random;
    //   690: invokevirtual nextFloat : ()F
    //   693: ldc 360.0
    //   695: fmul
    //   696: fconst_0
    //   697: invokevirtual moveTo : (DDDFF)V
    //   700: aload #14
    //   702: instanceof net/minecraft/world/entity/Mob
    //   705: ifeq -> 739
    //   708: aload #14
    //   710: checkcast net/minecraft/world/entity/Mob
    //   713: astore #15
    //   715: aload #15
    //   717: aload #13
    //   719: aload_0
    //   720: aload #14
    //   722: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   725: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   730: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   733: aconst_null
    //   734: aconst_null
    //   735: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   738: pop
    //   739: aload_0
    //   740: aload #14
    //   742: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   747: pop
    //   748: goto -> 870
    //   751: aload #7
    //   753: instanceof net/minecraft/world/entity/LivingEntity
    //   756: ifeq -> 796
    //   759: aload #7
    //   761: checkcast net/minecraft/world/entity/LivingEntity
    //   764: astore #13
    //   766: aload #13
    //   768: aload #7
    //   770: instanceof net/minecraft/world/entity/LivingEntity
    //   773: ifeq -> 791
    //   776: aload #7
    //   778: checkcast net/minecraft/world/entity/LivingEntity
    //   781: astore #14
    //   783: aload #14
    //   785: invokevirtual getMaxHealth : ()F
    //   788: goto -> 793
    //   791: ldc -1.0
    //   793: invokevirtual setHealth : (F)V
    //   796: aload #7
    //   798: instanceof net/minecraft/world/entity/LivingEntity
    //   801: ifeq -> 833
    //   804: aload #7
    //   806: checkcast net/minecraft/world/entity/LivingEntity
    //   809: astore #13
    //   811: aload #13
    //   813: new net/minecraft/world/effect/MobEffectInstance
    //   816: dup
    //   817: getstatic net/minecraft/world/effect/MobEffects.DAMAGE_RESISTANCE : Lnet/minecraft/world/effect/MobEffect;
    //   820: sipush #200
    //   823: iconst_1
    //   824: iconst_0
    //   825: iconst_0
    //   826: invokespecial <init> : (Lnet/minecraft/world/effect/MobEffect;IIZZ)V
    //   829: invokevirtual addEffect : (Lnet/minecraft/world/effect/MobEffectInstance;)Z
    //   832: pop
    //   833: aload #7
    //   835: instanceof net/minecraft/world/entity/LivingEntity
    //   838: ifeq -> 870
    //   841: aload #7
    //   843: checkcast net/minecraft/world/entity/LivingEntity
    //   846: astore #13
    //   848: aload #13
    //   850: new net/minecraft/world/effect/MobEffectInstance
    //   853: dup
    //   854: getstatic net/minecraft/world/effect/MobEffects.DAMAGE_BOOST : Lnet/minecraft/world/effect/MobEffect;
    //   857: sipush #200
    //   860: iconst_1
    //   861: iconst_0
    //   862: iconst_0
    //   863: invokespecial <init> : (Lnet/minecraft/world/effect/MobEffect;IIZZ)V
    //   866: invokevirtual addEffect : (Lnet/minecraft/world/effect/MobEffectInstance;)Z
    //   869: pop
    //   870: aload_0
    //   871: new net/minecraft/core/BlockPos
    //   874: dup
    //   875: dload_1
    //   876: dload_3
    //   877: dload #5
    //   879: invokespecial <init> : (DDD)V
    //   882: iconst_0
    //   883: invokeinterface destroyBlock : (Lnet/minecraft/core/BlockPos;Z)Z
    //   888: pop
    //   889: goto -> 4363
    //   892: aload #7
    //   894: instanceof net/mcreator/latexes/entity/DLbeeEntity
    //   897: ifeq -> 1274
    //   900: invokestatic random : ()D
    //   903: ldc2_w 0.3
    //   906: dcmpg
    //   907: ifge -> 1133
    //   910: aload #7
    //   912: getfield level : Lnet/minecraft/world/level/Level;
    //   915: invokevirtual isClientSide : ()Z
    //   918: ifne -> 926
    //   921: aload #7
    //   923: invokevirtual discard : ()V
    //   926: aload_0
    //   927: instanceof net/minecraft/world/level/Level
    //   930: ifeq -> 1027
    //   933: aload_0
    //   934: checkcast net/minecraft/world/level/Level
    //   937: astore #13
    //   939: aload #13
    //   941: invokevirtual isClientSide : ()Z
    //   944: ifne -> 992
    //   947: aload #13
    //   949: aconst_null
    //   950: new net/minecraft/core/BlockPos
    //   953: dup
    //   954: dload_1
    //   955: dload_3
    //   956: dload #5
    //   958: invokespecial <init> : (DDD)V
    //   961: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   964: new net/minecraft/resources/ResourceLocation
    //   967: dup
    //   968: ldc 'entity.zombie_villager.converted'
    //   970: invokespecial <init> : (Ljava/lang/String;)V
    //   973: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   978: checkcast net/minecraft/sounds/SoundEvent
    //   981: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   984: fconst_1
    //   985: fconst_1
    //   986: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   989: goto -> 1027
    //   992: aload #13
    //   994: dload_1
    //   995: dload_3
    //   996: dload #5
    //   998: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   1001: new net/minecraft/resources/ResourceLocation
    //   1004: dup
    //   1005: ldc 'entity.zombie_villager.converted'
    //   1007: invokespecial <init> : (Ljava/lang/String;)V
    //   1010: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   1015: checkcast net/minecraft/sounds/SoundEvent
    //   1018: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   1021: fconst_1
    //   1022: fconst_1
    //   1023: iconst_0
    //   1024: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   1027: aload_0
    //   1028: instanceof net/minecraft/server/level/ServerLevel
    //   1031: ifeq -> 1130
    //   1034: aload_0
    //   1035: checkcast net/minecraft/server/level/ServerLevel
    //   1038: astore #13
    //   1040: new net/mcreator/latexes/entity/DarkLatexQueenBeeEntity
    //   1043: dup
    //   1044: getstatic net/mcreator/latexes/init/LatexModEntities.DARK_LATEX_QUEEN_BEE : Lnet/minecraftforge/registries/RegistryObject;
    //   1047: invokevirtual get : ()Ljava/lang/Object;
    //   1050: checkcast net/minecraft/world/entity/EntityType
    //   1053: aload #13
    //   1055: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   1058: astore #14
    //   1060: aload #14
    //   1062: dload_1
    //   1063: dload_3
    //   1064: dload #5
    //   1066: aload_0
    //   1067: invokeinterface getRandom : ()Ljava/util/Random;
    //   1072: invokevirtual nextFloat : ()F
    //   1075: ldc 360.0
    //   1077: fmul
    //   1078: fconst_0
    //   1079: invokevirtual moveTo : (DDDFF)V
    //   1082: aload #14
    //   1084: instanceof net/minecraft/world/entity/Mob
    //   1087: ifeq -> 1121
    //   1090: aload #14
    //   1092: checkcast net/minecraft/world/entity/Mob
    //   1095: astore #15
    //   1097: aload #15
    //   1099: aload #13
    //   1101: aload_0
    //   1102: aload #14
    //   1104: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   1107: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   1112: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   1115: aconst_null
    //   1116: aconst_null
    //   1117: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   1120: pop
    //   1121: aload_0
    //   1122: aload #14
    //   1124: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   1129: pop
    //   1130: goto -> 1252
    //   1133: aload #7
    //   1135: instanceof net/minecraft/world/entity/LivingEntity
    //   1138: ifeq -> 1178
    //   1141: aload #7
    //   1143: checkcast net/minecraft/world/entity/LivingEntity
    //   1146: astore #13
    //   1148: aload #13
    //   1150: aload #7
    //   1152: instanceof net/minecraft/world/entity/LivingEntity
    //   1155: ifeq -> 1173
    //   1158: aload #7
    //   1160: checkcast net/minecraft/world/entity/LivingEntity
    //   1163: astore #14
    //   1165: aload #14
    //   1167: invokevirtual getMaxHealth : ()F
    //   1170: goto -> 1175
    //   1173: ldc -1.0
    //   1175: invokevirtual setHealth : (F)V
    //   1178: aload #7
    //   1180: instanceof net/minecraft/world/entity/LivingEntity
    //   1183: ifeq -> 1215
    //   1186: aload #7
    //   1188: checkcast net/minecraft/world/entity/LivingEntity
    //   1191: astore #13
    //   1193: aload #13
    //   1195: new net/minecraft/world/effect/MobEffectInstance
    //   1198: dup
    //   1199: getstatic net/minecraft/world/effect/MobEffects.DAMAGE_RESISTANCE : Lnet/minecraft/world/effect/MobEffect;
    //   1202: sipush #200
    //   1205: iconst_1
    //   1206: iconst_0
    //   1207: iconst_0
    //   1208: invokespecial <init> : (Lnet/minecraft/world/effect/MobEffect;IIZZ)V
    //   1211: invokevirtual addEffect : (Lnet/minecraft/world/effect/MobEffectInstance;)Z
    //   1214: pop
    //   1215: aload #7
    //   1217: instanceof net/minecraft/world/entity/LivingEntity
    //   1220: ifeq -> 1252
    //   1223: aload #7
    //   1225: checkcast net/minecraft/world/entity/LivingEntity
    //   1228: astore #13
    //   1230: aload #13
    //   1232: new net/minecraft/world/effect/MobEffectInstance
    //   1235: dup
    //   1236: getstatic net/minecraft/world/effect/MobEffects.DAMAGE_BOOST : Lnet/minecraft/world/effect/MobEffect;
    //   1239: sipush #200
    //   1242: iconst_1
    //   1243: iconst_0
    //   1244: iconst_0
    //   1245: invokespecial <init> : (Lnet/minecraft/world/effect/MobEffect;IIZZ)V
    //   1248: invokevirtual addEffect : (Lnet/minecraft/world/effect/MobEffectInstance;)Z
    //   1251: pop
    //   1252: aload_0
    //   1253: new net/minecraft/core/BlockPos
    //   1256: dup
    //   1257: dload_1
    //   1258: dload_3
    //   1259: dload #5
    //   1261: invokespecial <init> : (DDD)V
    //   1264: iconst_0
    //   1265: invokeinterface destroyBlock : (Lnet/minecraft/core/BlockPos;Z)Z
    //   1270: pop
    //   1271: goto -> 4363
    //   1274: aload #7
    //   1276: instanceof net/mcreator/latexes/entity/YufengEntity
    //   1279: ifeq -> 1656
    //   1282: invokestatic random : ()D
    //   1285: ldc2_w 0.01
    //   1288: dcmpg
    //   1289: ifge -> 1515
    //   1292: aload #7
    //   1294: getfield level : Lnet/minecraft/world/level/Level;
    //   1297: invokevirtual isClientSide : ()Z
    //   1300: ifne -> 1308
    //   1303: aload #7
    //   1305: invokevirtual discard : ()V
    //   1308: aload_0
    //   1309: instanceof net/minecraft/world/level/Level
    //   1312: ifeq -> 1409
    //   1315: aload_0
    //   1316: checkcast net/minecraft/world/level/Level
    //   1319: astore #13
    //   1321: aload #13
    //   1323: invokevirtual isClientSide : ()Z
    //   1326: ifne -> 1374
    //   1329: aload #13
    //   1331: aconst_null
    //   1332: new net/minecraft/core/BlockPos
    //   1335: dup
    //   1336: dload_1
    //   1337: dload_3
    //   1338: dload #5
    //   1340: invokespecial <init> : (DDD)V
    //   1343: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   1346: new net/minecraft/resources/ResourceLocation
    //   1349: dup
    //   1350: ldc 'entity.zombie_villager.converted'
    //   1352: invokespecial <init> : (Ljava/lang/String;)V
    //   1355: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   1360: checkcast net/minecraft/sounds/SoundEvent
    //   1363: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   1366: fconst_1
    //   1367: fconst_1
    //   1368: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   1371: goto -> 1409
    //   1374: aload #13
    //   1376: dload_1
    //   1377: dload_3
    //   1378: dload #5
    //   1380: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   1383: new net/minecraft/resources/ResourceLocation
    //   1386: dup
    //   1387: ldc 'entity.zombie_villager.converted'
    //   1389: invokespecial <init> : (Ljava/lang/String;)V
    //   1392: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   1397: checkcast net/minecraft/sounds/SoundEvent
    //   1400: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   1403: fconst_1
    //   1404: fconst_1
    //   1405: iconst_0
    //   1406: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   1409: aload_0
    //   1410: instanceof net/minecraft/server/level/ServerLevel
    //   1413: ifeq -> 1512
    //   1416: aload_0
    //   1417: checkcast net/minecraft/server/level/ServerLevel
    //   1420: astore #13
    //   1422: new net/mcreator/latexes/entity/DarkLatexDragonEntity
    //   1425: dup
    //   1426: getstatic net/mcreator/latexes/init/LatexModEntities.DARK_LATEX_DRAGON : Lnet/minecraftforge/registries/RegistryObject;
    //   1429: invokevirtual get : ()Ljava/lang/Object;
    //   1432: checkcast net/minecraft/world/entity/EntityType
    //   1435: aload #13
    //   1437: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   1440: astore #14
    //   1442: aload #14
    //   1444: dload_1
    //   1445: dload_3
    //   1446: dload #5
    //   1448: aload_0
    //   1449: invokeinterface getRandom : ()Ljava/util/Random;
    //   1454: invokevirtual nextFloat : ()F
    //   1457: ldc 360.0
    //   1459: fmul
    //   1460: fconst_0
    //   1461: invokevirtual moveTo : (DDDFF)V
    //   1464: aload #14
    //   1466: instanceof net/minecraft/world/entity/Mob
    //   1469: ifeq -> 1503
    //   1472: aload #14
    //   1474: checkcast net/minecraft/world/entity/Mob
    //   1477: astore #15
    //   1479: aload #15
    //   1481: aload #13
    //   1483: aload_0
    //   1484: aload #14
    //   1486: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   1489: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   1494: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   1497: aconst_null
    //   1498: aconst_null
    //   1499: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   1502: pop
    //   1503: aload_0
    //   1504: aload #14
    //   1506: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   1511: pop
    //   1512: goto -> 1634
    //   1515: aload #7
    //   1517: instanceof net/minecraft/world/entity/LivingEntity
    //   1520: ifeq -> 1560
    //   1523: aload #7
    //   1525: checkcast net/minecraft/world/entity/LivingEntity
    //   1528: astore #13
    //   1530: aload #13
    //   1532: aload #7
    //   1534: instanceof net/minecraft/world/entity/LivingEntity
    //   1537: ifeq -> 1555
    //   1540: aload #7
    //   1542: checkcast net/minecraft/world/entity/LivingEntity
    //   1545: astore #14
    //   1547: aload #14
    //   1549: invokevirtual getMaxHealth : ()F
    //   1552: goto -> 1557
    //   1555: ldc -1.0
    //   1557: invokevirtual setHealth : (F)V
    //   1560: aload #7
    //   1562: instanceof net/minecraft/world/entity/LivingEntity
    //   1565: ifeq -> 1597
    //   1568: aload #7
    //   1570: checkcast net/minecraft/world/entity/LivingEntity
    //   1573: astore #13
    //   1575: aload #13
    //   1577: new net/minecraft/world/effect/MobEffectInstance
    //   1580: dup
    //   1581: getstatic net/minecraft/world/effect/MobEffects.MOVEMENT_SPEED : Lnet/minecraft/world/effect/MobEffect;
    //   1584: sipush #200
    //   1587: iconst_1
    //   1588: iconst_0
    //   1589: iconst_0
    //   1590: invokespecial <init> : (Lnet/minecraft/world/effect/MobEffect;IIZZ)V
    //   1593: invokevirtual addEffect : (Lnet/minecraft/world/effect/MobEffectInstance;)Z
    //   1596: pop
    //   1597: aload #7
    //   1599: instanceof net/minecraft/world/entity/LivingEntity
    //   1602: ifeq -> 1634
    //   1605: aload #7
    //   1607: checkcast net/minecraft/world/entity/LivingEntity
    //   1610: astore #13
    //   1612: aload #13
    //   1614: new net/minecraft/world/effect/MobEffectInstance
    //   1617: dup
    //   1618: getstatic net/minecraft/world/effect/MobEffects.DAMAGE_BOOST : Lnet/minecraft/world/effect/MobEffect;
    //   1621: sipush #200
    //   1624: iconst_1
    //   1625: iconst_0
    //   1626: iconst_0
    //   1627: invokespecial <init> : (Lnet/minecraft/world/effect/MobEffect;IIZZ)V
    //   1630: invokevirtual addEffect : (Lnet/minecraft/world/effect/MobEffectInstance;)Z
    //   1633: pop
    //   1634: aload_0
    //   1635: new net/minecraft/core/BlockPos
    //   1638: dup
    //   1639: dload_1
    //   1640: dload_3
    //   1641: dload #5
    //   1643: invokespecial <init> : (DDD)V
    //   1646: iconst_0
    //   1647: invokeinterface destroyBlock : (Lnet/minecraft/core/BlockPos;Z)Z
    //   1652: pop
    //   1653: goto -> 4363
    //   1656: aload #7
    //   1658: invokevirtual getType : ()Lnet/minecraft/world/entity/EntityType;
    //   1661: getstatic net/minecraft/core/Registry.ENTITY_TYPE_REGISTRY : Lnet/minecraft/resources/ResourceKey;
    //   1664: new net/minecraft/resources/ResourceLocation
    //   1667: dup
    //   1668: ldc_w 'latex:darklatexes'
    //   1671: invokespecial <init> : (Ljava/lang/String;)V
    //   1674: invokestatic create : (Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraft/tags/TagKey;
    //   1677: invokevirtual is : (Lnet/minecraft/tags/TagKey;)Z
    //   1680: ifeq -> 1824
    //   1683: aload #7
    //   1685: instanceof net/minecraft/world/entity/LivingEntity
    //   1688: ifeq -> 1728
    //   1691: aload #7
    //   1693: checkcast net/minecraft/world/entity/LivingEntity
    //   1696: astore #13
    //   1698: aload #13
    //   1700: aload #7
    //   1702: instanceof net/minecraft/world/entity/LivingEntity
    //   1705: ifeq -> 1723
    //   1708: aload #7
    //   1710: checkcast net/minecraft/world/entity/LivingEntity
    //   1713: astore #14
    //   1715: aload #14
    //   1717: invokevirtual getMaxHealth : ()F
    //   1720: goto -> 1725
    //   1723: ldc -1.0
    //   1725: invokevirtual setHealth : (F)V
    //   1728: aload #7
    //   1730: instanceof net/minecraft/world/entity/LivingEntity
    //   1733: ifeq -> 1765
    //   1736: aload #7
    //   1738: checkcast net/minecraft/world/entity/LivingEntity
    //   1741: astore #13
    //   1743: aload #13
    //   1745: new net/minecraft/world/effect/MobEffectInstance
    //   1748: dup
    //   1749: getstatic net/minecraft/world/effect/MobEffects.DAMAGE_RESISTANCE : Lnet/minecraft/world/effect/MobEffect;
    //   1752: sipush #200
    //   1755: iconst_1
    //   1756: iconst_0
    //   1757: iconst_0
    //   1758: invokespecial <init> : (Lnet/minecraft/world/effect/MobEffect;IIZZ)V
    //   1761: invokevirtual addEffect : (Lnet/minecraft/world/effect/MobEffectInstance;)Z
    //   1764: pop
    //   1765: aload #7
    //   1767: instanceof net/minecraft/world/entity/LivingEntity
    //   1770: ifeq -> 1802
    //   1773: aload #7
    //   1775: checkcast net/minecraft/world/entity/LivingEntity
    //   1778: astore #13
    //   1780: aload #13
    //   1782: new net/minecraft/world/effect/MobEffectInstance
    //   1785: dup
    //   1786: getstatic net/minecraft/world/effect/MobEffects.DAMAGE_BOOST : Lnet/minecraft/world/effect/MobEffect;
    //   1789: sipush #200
    //   1792: iconst_1
    //   1793: iconst_0
    //   1794: iconst_0
    //   1795: invokespecial <init> : (Lnet/minecraft/world/effect/MobEffect;IIZZ)V
    //   1798: invokevirtual addEffect : (Lnet/minecraft/world/effect/MobEffectInstance;)Z
    //   1801: pop
    //   1802: aload_0
    //   1803: new net/minecraft/core/BlockPos
    //   1806: dup
    //   1807: dload_1
    //   1808: dload_3
    //   1809: dload #5
    //   1811: invokespecial <init> : (DDD)V
    //   1814: iconst_0
    //   1815: invokeinterface destroyBlock : (Lnet/minecraft/core/BlockPos;Z)Z
    //   1820: pop
    //   1821: goto -> 4363
    //   1824: aload #7
    //   1826: instanceof net/mcreator/latexes/entity/DarkLatexCreeperEntity
    //   1829: ifeq -> 2224
    //   1832: invokestatic random : ()D
    //   1835: ldc2_w 0.01
    //   1838: dcmpg
    //   1839: ifge -> 2065
    //   1842: aload #7
    //   1844: getfield level : Lnet/minecraft/world/level/Level;
    //   1847: invokevirtual isClientSide : ()Z
    //   1850: ifne -> 1858
    //   1853: aload #7
    //   1855: invokevirtual discard : ()V
    //   1858: aload_0
    //   1859: instanceof net/minecraft/world/level/Level
    //   1862: ifeq -> 1959
    //   1865: aload_0
    //   1866: checkcast net/minecraft/world/level/Level
    //   1869: astore #13
    //   1871: aload #13
    //   1873: invokevirtual isClientSide : ()Z
    //   1876: ifne -> 1924
    //   1879: aload #13
    //   1881: aconst_null
    //   1882: new net/minecraft/core/BlockPos
    //   1885: dup
    //   1886: dload_1
    //   1887: dload_3
    //   1888: dload #5
    //   1890: invokespecial <init> : (DDD)V
    //   1893: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   1896: new net/minecraft/resources/ResourceLocation
    //   1899: dup
    //   1900: ldc 'entity.zombie_villager.converted'
    //   1902: invokespecial <init> : (Ljava/lang/String;)V
    //   1905: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   1910: checkcast net/minecraft/sounds/SoundEvent
    //   1913: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   1916: fconst_1
    //   1917: fconst_1
    //   1918: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   1921: goto -> 1959
    //   1924: aload #13
    //   1926: dload_1
    //   1927: dload_3
    //   1928: dload #5
    //   1930: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   1933: new net/minecraft/resources/ResourceLocation
    //   1936: dup
    //   1937: ldc 'entity.zombie_villager.converted'
    //   1939: invokespecial <init> : (Ljava/lang/String;)V
    //   1942: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   1947: checkcast net/minecraft/sounds/SoundEvent
    //   1950: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   1953: fconst_1
    //   1954: fconst_1
    //   1955: iconst_0
    //   1956: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   1959: aload_0
    //   1960: instanceof net/minecraft/server/level/ServerLevel
    //   1963: ifeq -> 2062
    //   1966: aload_0
    //   1967: checkcast net/minecraft/server/level/ServerLevel
    //   1970: astore #13
    //   1972: new net/mcreator/latexes/entity/DarkLatexCreeperEnhancedEntity
    //   1975: dup
    //   1976: getstatic net/mcreator/latexes/init/LatexModEntities.DARK_LATEX_CREEPER_ENHANCED : Lnet/minecraftforge/registries/RegistryObject;
    //   1979: invokevirtual get : ()Ljava/lang/Object;
    //   1982: checkcast net/minecraft/world/entity/EntityType
    //   1985: aload #13
    //   1987: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   1990: astore #14
    //   1992: aload #14
    //   1994: dload_1
    //   1995: dload_3
    //   1996: dload #5
    //   1998: aload_0
    //   1999: invokeinterface getRandom : ()Ljava/util/Random;
    //   2004: invokevirtual nextFloat : ()F
    //   2007: ldc 360.0
    //   2009: fmul
    //   2010: fconst_0
    //   2011: invokevirtual moveTo : (DDDFF)V
    //   2014: aload #14
    //   2016: instanceof net/minecraft/world/entity/Mob
    //   2019: ifeq -> 2053
    //   2022: aload #14
    //   2024: checkcast net/minecraft/world/entity/Mob
    //   2027: astore #15
    //   2029: aload #15
    //   2031: aload #13
    //   2033: aload_0
    //   2034: aload #14
    //   2036: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   2039: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   2044: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   2047: aconst_null
    //   2048: aconst_null
    //   2049: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   2052: pop
    //   2053: aload_0
    //   2054: aload #14
    //   2056: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   2061: pop
    //   2062: goto -> 4363
    //   2065: aload #7
    //   2067: instanceof net/minecraft/world/entity/LivingEntity
    //   2070: ifeq -> 2110
    //   2073: aload #7
    //   2075: checkcast net/minecraft/world/entity/LivingEntity
    //   2078: astore #13
    //   2080: aload #13
    //   2082: aload #7
    //   2084: instanceof net/minecraft/world/entity/LivingEntity
    //   2087: ifeq -> 2105
    //   2090: aload #7
    //   2092: checkcast net/minecraft/world/entity/LivingEntity
    //   2095: astore #14
    //   2097: aload #14
    //   2099: invokevirtual getMaxHealth : ()F
    //   2102: goto -> 2107
    //   2105: ldc -1.0
    //   2107: invokevirtual setHealth : (F)V
    //   2110: aload #7
    //   2112: instanceof net/minecraft/world/entity/LivingEntity
    //   2115: ifeq -> 2147
    //   2118: aload #7
    //   2120: checkcast net/minecraft/world/entity/LivingEntity
    //   2123: astore #13
    //   2125: aload #13
    //   2127: new net/minecraft/world/effect/MobEffectInstance
    //   2130: dup
    //   2131: getstatic net/minecraft/world/effect/MobEffects.MOVEMENT_SPEED : Lnet/minecraft/world/effect/MobEffect;
    //   2134: sipush #320
    //   2137: iconst_1
    //   2138: iconst_0
    //   2139: iconst_0
    //   2140: invokespecial <init> : (Lnet/minecraft/world/effect/MobEffect;IIZZ)V
    //   2143: invokevirtual addEffect : (Lnet/minecraft/world/effect/MobEffectInstance;)Z
    //   2146: pop
    //   2147: aload #7
    //   2149: instanceof net/minecraft/world/entity/LivingEntity
    //   2152: ifeq -> 2184
    //   2155: aload #7
    //   2157: checkcast net/minecraft/world/entity/LivingEntity
    //   2160: astore #13
    //   2162: aload #13
    //   2164: new net/minecraft/world/effect/MobEffectInstance
    //   2167: dup
    //   2168: getstatic net/minecraft/world/effect/MobEffects.JUMP : Lnet/minecraft/world/effect/MobEffect;
    //   2171: sipush #320
    //   2174: iconst_1
    //   2175: iconst_0
    //   2176: iconst_0
    //   2177: invokespecial <init> : (Lnet/minecraft/world/effect/MobEffect;IIZZ)V
    //   2180: invokevirtual addEffect : (Lnet/minecraft/world/effect/MobEffectInstance;)Z
    //   2183: pop
    //   2184: aload #7
    //   2186: instanceof net/minecraft/world/entity/LivingEntity
    //   2189: ifeq -> 2221
    //   2192: aload #7
    //   2194: checkcast net/minecraft/world/entity/LivingEntity
    //   2197: astore #13
    //   2199: aload #13
    //   2201: new net/minecraft/world/effect/MobEffectInstance
    //   2204: dup
    //   2205: getstatic net/minecraft/world/effect/MobEffects.ABSORPTION : Lnet/minecraft/world/effect/MobEffect;
    //   2208: sipush #320
    //   2211: iconst_2
    //   2212: iconst_0
    //   2213: iconst_0
    //   2214: invokespecial <init> : (Lnet/minecraft/world/effect/MobEffect;IIZZ)V
    //   2217: invokevirtual addEffect : (Lnet/minecraft/world/effect/MobEffectInstance;)Z
    //   2220: pop
    //   2221: goto -> 4363
    //   2224: aload #7
    //   2226: instanceof net/minecraft/world/entity/animal/Bee
    //   2229: ifeq -> 2488
    //   2232: aload #7
    //   2234: getstatic net/minecraft/world/damagesource/DamageSource.CACTUS : Lnet/minecraft/world/damagesource/DamageSource;
    //   2237: ldc_w 20.0
    //   2240: invokevirtual hurt : (Lnet/minecraft/world/damagesource/DamageSource;F)Z
    //   2243: pop
    //   2244: aload #7
    //   2246: getfield level : Lnet/minecraft/world/level/Level;
    //   2249: invokevirtual isClientSide : ()Z
    //   2252: ifne -> 2260
    //   2255: aload #7
    //   2257: invokevirtual discard : ()V
    //   2260: aload_0
    //   2261: new net/minecraft/core/BlockPos
    //   2264: dup
    //   2265: dload_1
    //   2266: dload_3
    //   2267: dload #5
    //   2269: invokespecial <init> : (DDD)V
    //   2272: iconst_0
    //   2273: invokeinterface destroyBlock : (Lnet/minecraft/core/BlockPos;Z)Z
    //   2278: pop
    //   2279: aload_0
    //   2280: instanceof net/minecraft/world/level/Level
    //   2283: ifeq -> 2382
    //   2286: aload_0
    //   2287: checkcast net/minecraft/world/level/Level
    //   2290: astore #13
    //   2292: aload #13
    //   2294: invokevirtual isClientSide : ()Z
    //   2297: ifne -> 2346
    //   2300: aload #13
    //   2302: aconst_null
    //   2303: new net/minecraft/core/BlockPos
    //   2306: dup
    //   2307: dload_1
    //   2308: dload_3
    //   2309: dload #5
    //   2311: invokespecial <init> : (DDD)V
    //   2314: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   2317: new net/minecraft/resources/ResourceLocation
    //   2320: dup
    //   2321: ldc_w 'latex:transfur'
    //   2324: invokespecial <init> : (Ljava/lang/String;)V
    //   2327: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   2332: checkcast net/minecraft/sounds/SoundEvent
    //   2335: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   2338: fconst_1
    //   2339: fconst_1
    //   2340: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   2343: goto -> 2382
    //   2346: aload #13
    //   2348: dload_1
    //   2349: dload_3
    //   2350: dload #5
    //   2352: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   2355: new net/minecraft/resources/ResourceLocation
    //   2358: dup
    //   2359: ldc_w 'latex:transfur'
    //   2362: invokespecial <init> : (Ljava/lang/String;)V
    //   2365: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   2370: checkcast net/minecraft/sounds/SoundEvent
    //   2373: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   2376: fconst_1
    //   2377: fconst_1
    //   2378: iconst_0
    //   2379: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   2382: aload_0
    //   2383: instanceof net/minecraft/server/level/ServerLevel
    //   2386: ifeq -> 2485
    //   2389: aload_0
    //   2390: checkcast net/minecraft/server/level/ServerLevel
    //   2393: astore #13
    //   2395: new net/mcreator/latexes/entity/DLbeeEntity
    //   2398: dup
    //   2399: getstatic net/mcreator/latexes/init/LatexModEntities.D_LBEE : Lnet/minecraftforge/registries/RegistryObject;
    //   2402: invokevirtual get : ()Ljava/lang/Object;
    //   2405: checkcast net/minecraft/world/entity/EntityType
    //   2408: aload #13
    //   2410: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   2413: astore #14
    //   2415: aload #14
    //   2417: dload_1
    //   2418: dload_3
    //   2419: dload #5
    //   2421: aload_0
    //   2422: invokeinterface getRandom : ()Ljava/util/Random;
    //   2427: invokevirtual nextFloat : ()F
    //   2430: ldc 360.0
    //   2432: fmul
    //   2433: fconst_0
    //   2434: invokevirtual moveTo : (DDDFF)V
    //   2437: aload #14
    //   2439: instanceof net/minecraft/world/entity/Mob
    //   2442: ifeq -> 2476
    //   2445: aload #14
    //   2447: checkcast net/minecraft/world/entity/Mob
    //   2450: astore #15
    //   2452: aload #15
    //   2454: aload #13
    //   2456: aload_0
    //   2457: aload #14
    //   2459: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   2462: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   2467: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   2470: aconst_null
    //   2471: aconst_null
    //   2472: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   2475: pop
    //   2476: aload_0
    //   2477: aload #14
    //   2479: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   2484: pop
    //   2485: goto -> 4363
    //   2488: aload #7
    //   2490: instanceof net/mcreator/latexes/entity/DarkLatexSkeletonEntity
    //   2493: ifeq -> 2889
    //   2496: invokestatic random : ()D
    //   2499: ldc2_w 0.02
    //   2502: dcmpg
    //   2503: ifge -> 2748
    //   2506: aload #7
    //   2508: getfield level : Lnet/minecraft/world/level/Level;
    //   2511: invokevirtual isClientSide : ()Z
    //   2514: ifne -> 2522
    //   2517: aload #7
    //   2519: invokevirtual discard : ()V
    //   2522: aload_0
    //   2523: instanceof net/minecraft/world/level/Level
    //   2526: ifeq -> 2623
    //   2529: aload_0
    //   2530: checkcast net/minecraft/world/level/Level
    //   2533: astore #13
    //   2535: aload #13
    //   2537: invokevirtual isClientSide : ()Z
    //   2540: ifne -> 2588
    //   2543: aload #13
    //   2545: aconst_null
    //   2546: new net/minecraft/core/BlockPos
    //   2549: dup
    //   2550: dload_1
    //   2551: dload_3
    //   2552: dload #5
    //   2554: invokespecial <init> : (DDD)V
    //   2557: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   2560: new net/minecraft/resources/ResourceLocation
    //   2563: dup
    //   2564: ldc 'entity.zombie_villager.converted'
    //   2566: invokespecial <init> : (Ljava/lang/String;)V
    //   2569: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   2574: checkcast net/minecraft/sounds/SoundEvent
    //   2577: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   2580: fconst_1
    //   2581: fconst_1
    //   2582: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   2585: goto -> 2623
    //   2588: aload #13
    //   2590: dload_1
    //   2591: dload_3
    //   2592: dload #5
    //   2594: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   2597: new net/minecraft/resources/ResourceLocation
    //   2600: dup
    //   2601: ldc 'entity.zombie_villager.converted'
    //   2603: invokespecial <init> : (Ljava/lang/String;)V
    //   2606: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   2611: checkcast net/minecraft/sounds/SoundEvent
    //   2614: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   2617: fconst_1
    //   2618: fconst_1
    //   2619: iconst_0
    //   2620: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   2623: aload_0
    //   2624: instanceof net/minecraft/server/level/ServerLevel
    //   2627: ifeq -> 2726
    //   2630: aload_0
    //   2631: checkcast net/minecraft/server/level/ServerLevel
    //   2634: astore #13
    //   2636: new net/mcreator/latexes/entity/DarkLatexDragonEntity
    //   2639: dup
    //   2640: getstatic net/mcreator/latexes/init/LatexModEntities.DARK_LATEX_DRAGON : Lnet/minecraftforge/registries/RegistryObject;
    //   2643: invokevirtual get : ()Ljava/lang/Object;
    //   2646: checkcast net/minecraft/world/entity/EntityType
    //   2649: aload #13
    //   2651: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   2654: astore #14
    //   2656: aload #14
    //   2658: dload_1
    //   2659: dload_3
    //   2660: dload #5
    //   2662: aload_0
    //   2663: invokeinterface getRandom : ()Ljava/util/Random;
    //   2668: invokevirtual nextFloat : ()F
    //   2671: ldc 360.0
    //   2673: fmul
    //   2674: fconst_0
    //   2675: invokevirtual moveTo : (DDDFF)V
    //   2678: aload #14
    //   2680: instanceof net/minecraft/world/entity/Mob
    //   2683: ifeq -> 2717
    //   2686: aload #14
    //   2688: checkcast net/minecraft/world/entity/Mob
    //   2691: astore #15
    //   2693: aload #15
    //   2695: aload #13
    //   2697: aload_0
    //   2698: aload #14
    //   2700: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   2703: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   2708: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   2711: aconst_null
    //   2712: aconst_null
    //   2713: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   2716: pop
    //   2717: aload_0
    //   2718: aload #14
    //   2720: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   2725: pop
    //   2726: aload_0
    //   2727: new net/minecraft/core/BlockPos
    //   2730: dup
    //   2731: dload_1
    //   2732: dload_3
    //   2733: dload #5
    //   2735: invokespecial <init> : (DDD)V
    //   2738: iconst_0
    //   2739: invokeinterface destroyBlock : (Lnet/minecraft/core/BlockPos;Z)Z
    //   2744: pop
    //   2745: goto -> 4363
    //   2748: aload #7
    //   2750: instanceof net/minecraft/world/entity/LivingEntity
    //   2753: ifeq -> 2793
    //   2756: aload #7
    //   2758: checkcast net/minecraft/world/entity/LivingEntity
    //   2761: astore #13
    //   2763: aload #13
    //   2765: aload #7
    //   2767: instanceof net/minecraft/world/entity/LivingEntity
    //   2770: ifeq -> 2788
    //   2773: aload #7
    //   2775: checkcast net/minecraft/world/entity/LivingEntity
    //   2778: astore #14
    //   2780: aload #14
    //   2782: invokevirtual getMaxHealth : ()F
    //   2785: goto -> 2790
    //   2788: ldc -1.0
    //   2790: invokevirtual setHealth : (F)V
    //   2793: aload #7
    //   2795: instanceof net/minecraft/world/entity/LivingEntity
    //   2798: ifeq -> 2830
    //   2801: aload #7
    //   2803: checkcast net/minecraft/world/entity/LivingEntity
    //   2806: astore #13
    //   2808: aload #13
    //   2810: new net/minecraft/world/effect/MobEffectInstance
    //   2813: dup
    //   2814: getstatic net/minecraft/world/effect/MobEffects.DAMAGE_RESISTANCE : Lnet/minecraft/world/effect/MobEffect;
    //   2817: sipush #200
    //   2820: iconst_1
    //   2821: iconst_0
    //   2822: iconst_0
    //   2823: invokespecial <init> : (Lnet/minecraft/world/effect/MobEffect;IIZZ)V
    //   2826: invokevirtual addEffect : (Lnet/minecraft/world/effect/MobEffectInstance;)Z
    //   2829: pop
    //   2830: aload #7
    //   2832: instanceof net/minecraft/world/entity/LivingEntity
    //   2835: ifeq -> 2867
    //   2838: aload #7
    //   2840: checkcast net/minecraft/world/entity/LivingEntity
    //   2843: astore #13
    //   2845: aload #13
    //   2847: new net/minecraft/world/effect/MobEffectInstance
    //   2850: dup
    //   2851: getstatic net/minecraft/world/effect/MobEffects.DAMAGE_BOOST : Lnet/minecraft/world/effect/MobEffect;
    //   2854: sipush #200
    //   2857: iconst_1
    //   2858: iconst_0
    //   2859: iconst_0
    //   2860: invokespecial <init> : (Lnet/minecraft/world/effect/MobEffect;IIZZ)V
    //   2863: invokevirtual addEffect : (Lnet/minecraft/world/effect/MobEffectInstance;)Z
    //   2866: pop
    //   2867: aload_0
    //   2868: new net/minecraft/core/BlockPos
    //   2871: dup
    //   2872: dload_1
    //   2873: dload_3
    //   2874: dload #5
    //   2876: invokespecial <init> : (DDD)V
    //   2879: iconst_0
    //   2880: invokeinterface destroyBlock : (Lnet/minecraft/core/BlockPos;Z)Z
    //   2885: pop
    //   2886: goto -> 4363
    //   2889: aload #7
    //   2891: invokevirtual isInWater : ()Z
    //   2894: ifeq -> 3153
    //   2897: aload #7
    //   2899: getstatic net/minecraft/world/damagesource/DamageSource.CACTUS : Lnet/minecraft/world/damagesource/DamageSource;
    //   2902: ldc_w 20.0
    //   2905: invokevirtual hurt : (Lnet/minecraft/world/damagesource/DamageSource;F)Z
    //   2908: pop
    //   2909: aload #7
    //   2911: getfield level : Lnet/minecraft/world/level/Level;
    //   2914: invokevirtual isClientSide : ()Z
    //   2917: ifne -> 2925
    //   2920: aload #7
    //   2922: invokevirtual discard : ()V
    //   2925: aload_0
    //   2926: new net/minecraft/core/BlockPos
    //   2929: dup
    //   2930: dload_1
    //   2931: dload_3
    //   2932: dload #5
    //   2934: invokespecial <init> : (DDD)V
    //   2937: iconst_0
    //   2938: invokeinterface destroyBlock : (Lnet/minecraft/core/BlockPos;Z)Z
    //   2943: pop
    //   2944: aload_0
    //   2945: instanceof net/minecraft/world/level/Level
    //   2948: ifeq -> 3047
    //   2951: aload_0
    //   2952: checkcast net/minecraft/world/level/Level
    //   2955: astore #13
    //   2957: aload #13
    //   2959: invokevirtual isClientSide : ()Z
    //   2962: ifne -> 3011
    //   2965: aload #13
    //   2967: aconst_null
    //   2968: new net/minecraft/core/BlockPos
    //   2971: dup
    //   2972: dload_1
    //   2973: dload_3
    //   2974: dload #5
    //   2976: invokespecial <init> : (DDD)V
    //   2979: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   2982: new net/minecraft/resources/ResourceLocation
    //   2985: dup
    //   2986: ldc_w 'latex:transfur'
    //   2989: invokespecial <init> : (Ljava/lang/String;)V
    //   2992: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   2997: checkcast net/minecraft/sounds/SoundEvent
    //   3000: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   3003: fconst_1
    //   3004: fconst_1
    //   3005: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   3008: goto -> 3047
    //   3011: aload #13
    //   3013: dload_1
    //   3014: dload_3
    //   3015: dload #5
    //   3017: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   3020: new net/minecraft/resources/ResourceLocation
    //   3023: dup
    //   3024: ldc_w 'latex:transfur'
    //   3027: invokespecial <init> : (Ljava/lang/String;)V
    //   3030: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   3035: checkcast net/minecraft/sounds/SoundEvent
    //   3038: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   3041: fconst_1
    //   3042: fconst_1
    //   3043: iconst_0
    //   3044: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   3047: aload_0
    //   3048: instanceof net/minecraft/server/level/ServerLevel
    //   3051: ifeq -> 3150
    //   3054: aload_0
    //   3055: checkcast net/minecraft/server/level/ServerLevel
    //   3058: astore #13
    //   3060: new net/mcreator/latexes/entity/DlsharkEntity
    //   3063: dup
    //   3064: getstatic net/mcreator/latexes/init/LatexModEntities.DLSHARK : Lnet/minecraftforge/registries/RegistryObject;
    //   3067: invokevirtual get : ()Ljava/lang/Object;
    //   3070: checkcast net/minecraft/world/entity/EntityType
    //   3073: aload #13
    //   3075: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   3078: astore #14
    //   3080: aload #14
    //   3082: dload_1
    //   3083: dload_3
    //   3084: dload #5
    //   3086: aload_0
    //   3087: invokeinterface getRandom : ()Ljava/util/Random;
    //   3092: invokevirtual nextFloat : ()F
    //   3095: ldc 360.0
    //   3097: fmul
    //   3098: fconst_0
    //   3099: invokevirtual moveTo : (DDDFF)V
    //   3102: aload #14
    //   3104: instanceof net/minecraft/world/entity/Mob
    //   3107: ifeq -> 3141
    //   3110: aload #14
    //   3112: checkcast net/minecraft/world/entity/Mob
    //   3115: astore #15
    //   3117: aload #15
    //   3119: aload #13
    //   3121: aload_0
    //   3122: aload #14
    //   3124: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   3127: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   3132: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   3135: aconst_null
    //   3136: aconst_null
    //   3137: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   3140: pop
    //   3141: aload_0
    //   3142: aload #14
    //   3144: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   3149: pop
    //   3150: goto -> 4363
    //   3153: aload #7
    //   3155: instanceof net/minecraft/world/entity/monster/Spider
    //   3158: ifne -> 3169
    //   3161: aload #7
    //   3163: instanceof net/minecraft/world/entity/monster/CaveSpider
    //   3166: ifeq -> 3425
    //   3169: aload #7
    //   3171: getstatic net/minecraft/world/damagesource/DamageSource.CACTUS : Lnet/minecraft/world/damagesource/DamageSource;
    //   3174: ldc_w 20.0
    //   3177: invokevirtual hurt : (Lnet/minecraft/world/damagesource/DamageSource;F)Z
    //   3180: pop
    //   3181: aload #7
    //   3183: getfield level : Lnet/minecraft/world/level/Level;
    //   3186: invokevirtual isClientSide : ()Z
    //   3189: ifne -> 3197
    //   3192: aload #7
    //   3194: invokevirtual discard : ()V
    //   3197: aload_0
    //   3198: new net/minecraft/core/BlockPos
    //   3201: dup
    //   3202: dload_1
    //   3203: dload_3
    //   3204: dload #5
    //   3206: invokespecial <init> : (DDD)V
    //   3209: iconst_0
    //   3210: invokeinterface destroyBlock : (Lnet/minecraft/core/BlockPos;Z)Z
    //   3215: pop
    //   3216: aload_0
    //   3217: instanceof net/minecraft/world/level/Level
    //   3220: ifeq -> 3319
    //   3223: aload_0
    //   3224: checkcast net/minecraft/world/level/Level
    //   3227: astore #13
    //   3229: aload #13
    //   3231: invokevirtual isClientSide : ()Z
    //   3234: ifne -> 3283
    //   3237: aload #13
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
    //   3258: ldc_w 'latex:transfur'
    //   3261: invokespecial <init> : (Ljava/lang/String;)V
    //   3264: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   3269: checkcast net/minecraft/sounds/SoundEvent
    //   3272: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   3275: fconst_1
    //   3276: fconst_1
    //   3277: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   3280: goto -> 3319
    //   3283: aload #13
    //   3285: dload_1
    //   3286: dload_3
    //   3287: dload #5
    //   3289: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   3292: new net/minecraft/resources/ResourceLocation
    //   3295: dup
    //   3296: ldc_w 'latex:transfur'
    //   3299: invokespecial <init> : (Ljava/lang/String;)V
    //   3302: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   3307: checkcast net/minecraft/sounds/SoundEvent
    //   3310: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   3313: fconst_1
    //   3314: fconst_1
    //   3315: iconst_0
    //   3316: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   3319: aload_0
    //   3320: instanceof net/minecraft/server/level/ServerLevel
    //   3323: ifeq -> 3422
    //   3326: aload_0
    //   3327: checkcast net/minecraft/server/level/ServerLevel
    //   3330: astore #13
    //   3332: new net/mcreator/latexes/entity/DarkLatexSpiderEntity
    //   3335: dup
    //   3336: getstatic net/mcreator/latexes/init/LatexModEntities.DARK_LATEX_SPIDER : Lnet/minecraftforge/registries/RegistryObject;
    //   3339: invokevirtual get : ()Ljava/lang/Object;
    //   3342: checkcast net/minecraft/world/entity/EntityType
    //   3345: aload #13
    //   3347: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   3350: astore #14
    //   3352: aload #14
    //   3354: dload_1
    //   3355: dload_3
    //   3356: dload #5
    //   3358: aload_0
    //   3359: invokeinterface getRandom : ()Ljava/util/Random;
    //   3364: invokevirtual nextFloat : ()F
    //   3367: ldc 360.0
    //   3369: fmul
    //   3370: fconst_0
    //   3371: invokevirtual moveTo : (DDDFF)V
    //   3374: aload #14
    //   3376: instanceof net/minecraft/world/entity/Mob
    //   3379: ifeq -> 3413
    //   3382: aload #14
    //   3384: checkcast net/minecraft/world/entity/Mob
    //   3387: astore #15
    //   3389: aload #15
    //   3391: aload #13
    //   3393: aload_0
    //   3394: aload #14
    //   3396: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   3399: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   3404: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   3407: aconst_null
    //   3408: aconst_null
    //   3409: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   3412: pop
    //   3413: aload_0
    //   3414: aload #14
    //   3416: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   3421: pop
    //   3422: goto -> 4363
    //   3425: aload #7
    //   3427: instanceof net/minecraft/world/entity/monster/Creeper
    //   3430: ifeq -> 3689
    //   3433: aload #7
    //   3435: getstatic net/minecraft/world/damagesource/DamageSource.CACTUS : Lnet/minecraft/world/damagesource/DamageSource;
    //   3438: ldc_w 20.0
    //   3441: invokevirtual hurt : (Lnet/minecraft/world/damagesource/DamageSource;F)Z
    //   3444: pop
    //   3445: aload #7
    //   3447: getfield level : Lnet/minecraft/world/level/Level;
    //   3450: invokevirtual isClientSide : ()Z
    //   3453: ifne -> 3461
    //   3456: aload #7
    //   3458: invokevirtual discard : ()V
    //   3461: aload_0
    //   3462: new net/minecraft/core/BlockPos
    //   3465: dup
    //   3466: dload_1
    //   3467: dload_3
    //   3468: dload #5
    //   3470: invokespecial <init> : (DDD)V
    //   3473: iconst_0
    //   3474: invokeinterface destroyBlock : (Lnet/minecraft/core/BlockPos;Z)Z
    //   3479: pop
    //   3480: aload_0
    //   3481: instanceof net/minecraft/world/level/Level
    //   3484: ifeq -> 3583
    //   3487: aload_0
    //   3488: checkcast net/minecraft/world/level/Level
    //   3491: astore #13
    //   3493: aload #13
    //   3495: invokevirtual isClientSide : ()Z
    //   3498: ifne -> 3547
    //   3501: aload #13
    //   3503: aconst_null
    //   3504: new net/minecraft/core/BlockPos
    //   3507: dup
    //   3508: dload_1
    //   3509: dload_3
    //   3510: dload #5
    //   3512: invokespecial <init> : (DDD)V
    //   3515: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   3518: new net/minecraft/resources/ResourceLocation
    //   3521: dup
    //   3522: ldc_w 'latex:transfur'
    //   3525: invokespecial <init> : (Ljava/lang/String;)V
    //   3528: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   3533: checkcast net/minecraft/sounds/SoundEvent
    //   3536: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   3539: fconst_1
    //   3540: fconst_1
    //   3541: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   3544: goto -> 3583
    //   3547: aload #13
    //   3549: dload_1
    //   3550: dload_3
    //   3551: dload #5
    //   3553: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   3556: new net/minecraft/resources/ResourceLocation
    //   3559: dup
    //   3560: ldc_w 'latex:transfur'
    //   3563: invokespecial <init> : (Ljava/lang/String;)V
    //   3566: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   3571: checkcast net/minecraft/sounds/SoundEvent
    //   3574: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   3577: fconst_1
    //   3578: fconst_1
    //   3579: iconst_0
    //   3580: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   3583: aload_0
    //   3584: instanceof net/minecraft/server/level/ServerLevel
    //   3587: ifeq -> 3686
    //   3590: aload_0
    //   3591: checkcast net/minecraft/server/level/ServerLevel
    //   3594: astore #13
    //   3596: new net/mcreator/latexes/entity/DarkLatexCreeperEntity
    //   3599: dup
    //   3600: getstatic net/mcreator/latexes/init/LatexModEntities.DARK_LATEX_CREEPER : Lnet/minecraftforge/registries/RegistryObject;
    //   3603: invokevirtual get : ()Ljava/lang/Object;
    //   3606: checkcast net/minecraft/world/entity/EntityType
    //   3609: aload #13
    //   3611: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   3614: astore #14
    //   3616: aload #14
    //   3618: dload_1
    //   3619: dload_3
    //   3620: dload #5
    //   3622: aload_0
    //   3623: invokeinterface getRandom : ()Ljava/util/Random;
    //   3628: invokevirtual nextFloat : ()F
    //   3631: ldc 360.0
    //   3633: fmul
    //   3634: fconst_0
    //   3635: invokevirtual moveTo : (DDDFF)V
    //   3638: aload #14
    //   3640: instanceof net/minecraft/world/entity/Mob
    //   3643: ifeq -> 3677
    //   3646: aload #14
    //   3648: checkcast net/minecraft/world/entity/Mob
    //   3651: astore #15
    //   3653: aload #15
    //   3655: aload #13
    //   3657: aload_0
    //   3658: aload #14
    //   3660: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   3663: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   3668: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   3671: aconst_null
    //   3672: aconst_null
    //   3673: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   3676: pop
    //   3677: aload_0
    //   3678: aload #14
    //   3680: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   3685: pop
    //   3686: goto -> 4363
    //   3689: aload #7
    //   3691: instanceof net/mcreator/latexes/entity/DarkLatexSpiderEntity
    //   3694: ifeq -> 4090
    //   3697: invokestatic random : ()D
    //   3700: ldc2_w 0.3
    //   3703: dcmpg
    //   3704: ifge -> 3949
    //   3707: aload #7
    //   3709: getfield level : Lnet/minecraft/world/level/Level;
    //   3712: invokevirtual isClientSide : ()Z
    //   3715: ifne -> 3723
    //   3718: aload #7
    //   3720: invokevirtual discard : ()V
    //   3723: aload_0
    //   3724: new net/minecraft/core/BlockPos
    //   3727: dup
    //   3728: dload_1
    //   3729: dload_3
    //   3730: dload #5
    //   3732: invokespecial <init> : (DDD)V
    //   3735: iconst_0
    //   3736: invokeinterface destroyBlock : (Lnet/minecraft/core/BlockPos;Z)Z
    //   3741: pop
    //   3742: aload_0
    //   3743: instanceof net/minecraft/world/level/Level
    //   3746: ifeq -> 3843
    //   3749: aload_0
    //   3750: checkcast net/minecraft/world/level/Level
    //   3753: astore #13
    //   3755: aload #13
    //   3757: invokevirtual isClientSide : ()Z
    //   3760: ifne -> 3808
    //   3763: aload #13
    //   3765: aconst_null
    //   3766: new net/minecraft/core/BlockPos
    //   3769: dup
    //   3770: dload_1
    //   3771: dload_3
    //   3772: dload #5
    //   3774: invokespecial <init> : (DDD)V
    //   3777: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   3780: new net/minecraft/resources/ResourceLocation
    //   3783: dup
    //   3784: ldc 'entity.zombie_villager.converted'
    //   3786: invokespecial <init> : (Ljava/lang/String;)V
    //   3789: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   3794: checkcast net/minecraft/sounds/SoundEvent
    //   3797: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   3800: fconst_1
    //   3801: fconst_1
    //   3802: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   3805: goto -> 3843
    //   3808: aload #13
    //   3810: dload_1
    //   3811: dload_3
    //   3812: dload #5
    //   3814: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   3817: new net/minecraft/resources/ResourceLocation
    //   3820: dup
    //   3821: ldc 'entity.zombie_villager.converted'
    //   3823: invokespecial <init> : (Ljava/lang/String;)V
    //   3826: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   3831: checkcast net/minecraft/sounds/SoundEvent
    //   3834: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   3837: fconst_1
    //   3838: fconst_1
    //   3839: iconst_0
    //   3840: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   3843: aload_0
    //   3844: instanceof net/minecraft/server/level/ServerLevel
    //   3847: ifeq -> 3946
    //   3850: aload_0
    //   3851: checkcast net/minecraft/server/level/ServerLevel
    //   3854: astore #13
    //   3856: new net/mcreator/latexes/entity/DarkLatexSpiderQueenEntity
    //   3859: dup
    //   3860: getstatic net/mcreator/latexes/init/LatexModEntities.DARK_LATEX_SPIDER_QUEEN : Lnet/minecraftforge/registries/RegistryObject;
    //   3863: invokevirtual get : ()Ljava/lang/Object;
    //   3866: checkcast net/minecraft/world/entity/EntityType
    //   3869: aload #13
    //   3871: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   3874: astore #14
    //   3876: aload #14
    //   3878: dload_1
    //   3879: dload_3
    //   3880: dload #5
    //   3882: aload_0
    //   3883: invokeinterface getRandom : ()Ljava/util/Random;
    //   3888: invokevirtual nextFloat : ()F
    //   3891: ldc 360.0
    //   3893: fmul
    //   3894: fconst_0
    //   3895: invokevirtual moveTo : (DDDFF)V
    //   3898: aload #14
    //   3900: instanceof net/minecraft/world/entity/Mob
    //   3903: ifeq -> 3937
    //   3906: aload #14
    //   3908: checkcast net/minecraft/world/entity/Mob
    //   3911: astore #15
    //   3913: aload #15
    //   3915: aload #13
    //   3917: aload_0
    //   3918: aload #14
    //   3920: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   3923: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   3928: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   3931: aconst_null
    //   3932: aconst_null
    //   3933: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   3936: pop
    //   3937: aload_0
    //   3938: aload #14
    //   3940: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   3945: pop
    //   3946: goto -> 4363
    //   3949: aload #7
    //   3951: instanceof net/minecraft/world/entity/LivingEntity
    //   3954: ifeq -> 3994
    //   3957: aload #7
    //   3959: checkcast net/minecraft/world/entity/LivingEntity
    //   3962: astore #13
    //   3964: aload #13
    //   3966: aload #7
    //   3968: instanceof net/minecraft/world/entity/LivingEntity
    //   3971: ifeq -> 3989
    //   3974: aload #7
    //   3976: checkcast net/minecraft/world/entity/LivingEntity
    //   3979: astore #14
    //   3981: aload #14
    //   3983: invokevirtual getMaxHealth : ()F
    //   3986: goto -> 3991
    //   3989: ldc -1.0
    //   3991: invokevirtual setHealth : (F)V
    //   3994: aload #7
    //   3996: instanceof net/minecraft/world/entity/LivingEntity
    //   3999: ifeq -> 4031
    //   4002: aload #7
    //   4004: checkcast net/minecraft/world/entity/LivingEntity
    //   4007: astore #13
    //   4009: aload #13
    //   4011: new net/minecraft/world/effect/MobEffectInstance
    //   4014: dup
    //   4015: getstatic net/minecraft/world/effect/MobEffects.DAMAGE_RESISTANCE : Lnet/minecraft/world/effect/MobEffect;
    //   4018: sipush #200
    //   4021: iconst_1
    //   4022: iconst_0
    //   4023: iconst_0
    //   4024: invokespecial <init> : (Lnet/minecraft/world/effect/MobEffect;IIZZ)V
    //   4027: invokevirtual addEffect : (Lnet/minecraft/world/effect/MobEffectInstance;)Z
    //   4030: pop
    //   4031: aload #7
    //   4033: instanceof net/minecraft/world/entity/LivingEntity
    //   4036: ifeq -> 4068
    //   4039: aload #7
    //   4041: checkcast net/minecraft/world/entity/LivingEntity
    //   4044: astore #13
    //   4046: aload #13
    //   4048: new net/minecraft/world/effect/MobEffectInstance
    //   4051: dup
    //   4052: getstatic net/minecraft/world/effect/MobEffects.DAMAGE_BOOST : Lnet/minecraft/world/effect/MobEffect;
    //   4055: sipush #200
    //   4058: iconst_1
    //   4059: iconst_0
    //   4060: iconst_0
    //   4061: invokespecial <init> : (Lnet/minecraft/world/effect/MobEffect;IIZZ)V
    //   4064: invokevirtual addEffect : (Lnet/minecraft/world/effect/MobEffectInstance;)Z
    //   4067: pop
    //   4068: aload_0
    //   4069: new net/minecraft/core/BlockPos
    //   4072: dup
    //   4073: dload_1
    //   4074: dload_3
    //   4075: dload #5
    //   4077: invokespecial <init> : (DDD)V
    //   4080: iconst_0
    //   4081: invokeinterface destroyBlock : (Lnet/minecraft/core/BlockPos;Z)Z
    //   4086: pop
    //   4087: goto -> 4363
    //   4090: aload #7
    //   4092: getstatic net/minecraft/world/damagesource/DamageSource.CACTUS : Lnet/minecraft/world/damagesource/DamageSource;
    //   4095: ldc_w 20.0
    //   4098: invokevirtual hurt : (Lnet/minecraft/world/damagesource/DamageSource;F)Z
    //   4101: pop
    //   4102: aload #7
    //   4104: getfield level : Lnet/minecraft/world/level/Level;
    //   4107: invokevirtual isClientSide : ()Z
    //   4110: ifne -> 4118
    //   4113: aload #7
    //   4115: invokevirtual discard : ()V
    //   4118: aload_0
    //   4119: new net/minecraft/core/BlockPos
    //   4122: dup
    //   4123: dload_1
    //   4124: dload_3
    //   4125: dload #5
    //   4127: invokespecial <init> : (DDD)V
    //   4130: iconst_0
    //   4131: invokeinterface destroyBlock : (Lnet/minecraft/core/BlockPos;Z)Z
    //   4136: pop
    //   4137: aload_0
    //   4138: instanceof net/minecraft/world/level/Level
    //   4141: ifeq -> 4240
    //   4144: aload_0
    //   4145: checkcast net/minecraft/world/level/Level
    //   4148: astore #13
    //   4150: aload #13
    //   4152: invokevirtual isClientSide : ()Z
    //   4155: ifne -> 4204
    //   4158: aload #13
    //   4160: aconst_null
    //   4161: new net/minecraft/core/BlockPos
    //   4164: dup
    //   4165: dload_1
    //   4166: dload_3
    //   4167: dload #5
    //   4169: invokespecial <init> : (DDD)V
    //   4172: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   4175: new net/minecraft/resources/ResourceLocation
    //   4178: dup
    //   4179: ldc_w 'latex:transfur'
    //   4182: invokespecial <init> : (Ljava/lang/String;)V
    //   4185: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   4190: checkcast net/minecraft/sounds/SoundEvent
    //   4193: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   4196: fconst_1
    //   4197: fconst_1
    //   4198: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   4201: goto -> 4240
    //   4204: aload #13
    //   4206: dload_1
    //   4207: dload_3
    //   4208: dload #5
    //   4210: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   4213: new net/minecraft/resources/ResourceLocation
    //   4216: dup
    //   4217: ldc_w 'latex:transfur'
    //   4220: invokespecial <init> : (Ljava/lang/String;)V
    //   4223: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   4228: checkcast net/minecraft/sounds/SoundEvent
    //   4231: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   4234: fconst_1
    //   4235: fconst_1
    //   4236: iconst_0
    //   4237: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   4240: aload_0
    //   4241: instanceof net/minecraft/server/level/ServerLevel
    //   4244: ifeq -> 4343
    //   4247: aload_0
    //   4248: checkcast net/minecraft/server/level/ServerLevel
    //   4251: astore #13
    //   4253: new net/mcreator/latexes/entity/DarklatexEntity
    //   4256: dup
    //   4257: getstatic net/mcreator/latexes/init/LatexModEntities.DARKLATEX : Lnet/minecraftforge/registries/RegistryObject;
    //   4260: invokevirtual get : ()Ljava/lang/Object;
    //   4263: checkcast net/minecraft/world/entity/EntityType
    //   4266: aload #13
    //   4268: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   4271: astore #14
    //   4273: aload #14
    //   4275: dload_1
    //   4276: dload_3
    //   4277: dload #5
    //   4279: aload_0
    //   4280: invokeinterface getRandom : ()Ljava/util/Random;
    //   4285: invokevirtual nextFloat : ()F
    //   4288: ldc 360.0
    //   4290: fmul
    //   4291: fconst_0
    //   4292: invokevirtual moveTo : (DDDFF)V
    //   4295: aload #14
    //   4297: instanceof net/minecraft/world/entity/Mob
    //   4300: ifeq -> 4334
    //   4303: aload #14
    //   4305: checkcast net/minecraft/world/entity/Mob
    //   4308: astore #15
    //   4310: aload #15
    //   4312: aload #13
    //   4314: aload_0
    //   4315: aload #14
    //   4317: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   4320: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   4325: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   4328: aconst_null
    //   4329: aconst_null
    //   4330: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   4333: pop
    //   4334: aload_0
    //   4335: aload #14
    //   4337: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   4342: pop
    //   4343: goto -> 4363
    //   4346: aload #7
    //   4348: getstatic net/minecraft/world/damagesource/DamageSource.CACTUS : Lnet/minecraft/world/damagesource/DamageSource;
    //   4351: ldc_w 5.0
    //   4354: invokevirtual hurt : (Lnet/minecraft/world/damagesource/DamageSource;F)Z
    //   4357: pop
    //   4358: goto -> 4363
    //   4361: iconst_1
    //   4362: ireturn
    //   4363: iconst_0
    //   4364: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #47	-> 0
    //   #48	-> 5
    //   #49	-> 7
    //   #50	-> 33
    //   #52	-> 35
    //   #53	-> 64
    //   #54	-> 76
    //   #55	-> 105
    //   #56	-> 117
    //   #57	-> 146
    //   #58	-> 158
    //   #59	-> 187
    //   #60	-> 201
    //   #62	-> 258
    //   #63	-> 277
    //   #64	-> 285
    //   #65	-> 295
    //   #66	-> 306
    //   #67	-> 311
    //   #68	-> 324
    //   #69	-> 332
    //   #70	-> 358
    //   #69	-> 371
    //   #73	-> 377
    //   #74	-> 395
    //   #73	-> 409
    //   #78	-> 412
    //   #79	-> 425
    //   #80	-> 445
    //   #81	-> 467
    //   #82	-> 482
    //   #84	-> 506
    //   #85	-> 515
    //   #86	-> 518
    //   #87	-> 528
    //   #88	-> 539
    //   #89	-> 544
    //   #90	-> 557
    //   #91	-> 565
    //   #92	-> 591
    //   #91	-> 604
    //   #95	-> 610
    //   #96	-> 628
    //   #95	-> 642
    //   #100	-> 645
    //   #101	-> 658
    //   #102	-> 678
    //   #103	-> 700
    //   #104	-> 715
    //   #106	-> 739
    //   #107	-> 748
    //   #109	-> 751
    //   #110	-> 766
    //   #111	-> 796
    //   #112	-> 811
    //   #113	-> 833
    //   #114	-> 848
    //   #116	-> 870
    //   #117	-> 892
    //   #118	-> 900
    //   #119	-> 910
    //   #120	-> 921
    //   #121	-> 926
    //   #122	-> 939
    //   #123	-> 947
    //   #124	-> 973
    //   #123	-> 986
    //   #127	-> 992
    //   #128	-> 1010
    //   #127	-> 1024
    //   #132	-> 1027
    //   #133	-> 1040
    //   #134	-> 1060
    //   #135	-> 1082
    //   #136	-> 1097
    //   #138	-> 1121
    //   #139	-> 1130
    //   #141	-> 1133
    //   #142	-> 1148
    //   #143	-> 1178
    //   #144	-> 1193
    //   #145	-> 1215
    //   #146	-> 1230
    //   #148	-> 1252
    //   #149	-> 1274
    //   #150	-> 1282
    //   #151	-> 1292
    //   #152	-> 1303
    //   #153	-> 1308
    //   #154	-> 1321
    //   #155	-> 1329
    //   #156	-> 1355
    //   #155	-> 1368
    //   #159	-> 1374
    //   #160	-> 1392
    //   #159	-> 1406
    //   #164	-> 1409
    //   #165	-> 1422
    //   #166	-> 1442
    //   #167	-> 1464
    //   #168	-> 1479
    //   #170	-> 1503
    //   #171	-> 1512
    //   #173	-> 1515
    //   #174	-> 1530
    //   #175	-> 1560
    //   #176	-> 1575
    //   #177	-> 1597
    //   #178	-> 1612
    //   #180	-> 1634
    //   #181	-> 1656
    //   #182	-> 1683
    //   #183	-> 1698
    //   #184	-> 1728
    //   #185	-> 1743
    //   #186	-> 1765
    //   #187	-> 1780
    //   #188	-> 1802
    //   #189	-> 1824
    //   #190	-> 1832
    //   #191	-> 1842
    //   #192	-> 1853
    //   #193	-> 1858
    //   #194	-> 1871
    //   #195	-> 1879
    //   #196	-> 1905
    //   #195	-> 1918
    //   #199	-> 1924
    //   #200	-> 1942
    //   #199	-> 1956
    //   #204	-> 1959
    //   #205	-> 1972
    //   #206	-> 1992
    //   #207	-> 2014
    //   #208	-> 2029
    //   #210	-> 2053
    //   #211	-> 2062
    //   #213	-> 2065
    //   #214	-> 2080
    //   #215	-> 2110
    //   #216	-> 2125
    //   #217	-> 2147
    //   #218	-> 2162
    //   #219	-> 2184
    //   #220	-> 2199
    //   #222	-> 2224
    //   #223	-> 2232
    //   #224	-> 2244
    //   #225	-> 2255
    //   #226	-> 2260
    //   #227	-> 2279
    //   #228	-> 2292
    //   #229	-> 2300
    //   #230	-> 2327
    //   #229	-> 2340
    //   #232	-> 2346
    //   #236	-> 2382
    //   #237	-> 2395
    //   #238	-> 2415
    //   #239	-> 2437
    //   #240	-> 2452
    //   #242	-> 2476
    //   #243	-> 2485
    //   #244	-> 2488
    //   #245	-> 2496
    //   #246	-> 2506
    //   #247	-> 2517
    //   #248	-> 2522
    //   #249	-> 2535
    //   #250	-> 2543
    //   #251	-> 2569
    //   #250	-> 2582
    //   #254	-> 2588
    //   #255	-> 2606
    //   #254	-> 2620
    //   #259	-> 2623
    //   #260	-> 2636
    //   #261	-> 2656
    //   #262	-> 2678
    //   #263	-> 2693
    //   #265	-> 2717
    //   #267	-> 2726
    //   #269	-> 2748
    //   #270	-> 2763
    //   #271	-> 2793
    //   #272	-> 2808
    //   #273	-> 2830
    //   #274	-> 2845
    //   #275	-> 2867
    //   #277	-> 2889
    //   #278	-> 2897
    //   #279	-> 2909
    //   #280	-> 2920
    //   #281	-> 2925
    //   #282	-> 2944
    //   #283	-> 2957
    //   #284	-> 2965
    //   #285	-> 2992
    //   #284	-> 3005
    //   #287	-> 3011
    //   #291	-> 3047
    //   #292	-> 3060
    //   #293	-> 3080
    //   #294	-> 3102
    //   #295	-> 3117
    //   #297	-> 3141
    //   #298	-> 3150
    //   #299	-> 3153
    //   #300	-> 3169
    //   #301	-> 3181
    //   #302	-> 3192
    //   #303	-> 3197
    //   #304	-> 3216
    //   #305	-> 3229
    //   #306	-> 3237
    //   #307	-> 3264
    //   #306	-> 3277
    //   #309	-> 3283
    //   #313	-> 3319
    //   #314	-> 3332
    //   #315	-> 3352
    //   #316	-> 3374
    //   #317	-> 3389
    //   #319	-> 3413
    //   #320	-> 3422
    //   #321	-> 3425
    //   #322	-> 3433
    //   #323	-> 3445
    //   #324	-> 3456
    //   #325	-> 3461
    //   #326	-> 3480
    //   #327	-> 3493
    //   #328	-> 3501
    //   #329	-> 3528
    //   #328	-> 3541
    //   #331	-> 3547
    //   #335	-> 3583
    //   #336	-> 3596
    //   #337	-> 3616
    //   #338	-> 3638
    //   #339	-> 3653
    //   #341	-> 3677
    //   #342	-> 3686
    //   #343	-> 3689
    //   #344	-> 3697
    //   #345	-> 3707
    //   #346	-> 3718
    //   #347	-> 3723
    //   #348	-> 3742
    //   #349	-> 3755
    //   #350	-> 3763
    //   #351	-> 3789
    //   #350	-> 3802
    //   #354	-> 3808
    //   #355	-> 3826
    //   #354	-> 3840
    //   #359	-> 3843
    //   #360	-> 3856
    //   #361	-> 3876
    //   #362	-> 3898
    //   #363	-> 3913
    //   #365	-> 3937
    //   #366	-> 3946
    //   #368	-> 3949
    //   #369	-> 3964
    //   #370	-> 3994
    //   #371	-> 4009
    //   #372	-> 4031
    //   #373	-> 4046
    //   #374	-> 4068
    //   #377	-> 4090
    //   #378	-> 4102
    //   #379	-> 4113
    //   #380	-> 4118
    //   #381	-> 4137
    //   #382	-> 4150
    //   #383	-> 4158
    //   #384	-> 4185
    //   #383	-> 4198
    //   #386	-> 4204
    //   #390	-> 4240
    //   #391	-> 4253
    //   #392	-> 4273
    //   #393	-> 4295
    //   #394	-> 4310
    //   #396	-> 4334
    //   #397	-> 4343
    //   #400	-> 4346
    //   #403	-> 4361
    //   #406	-> 4363
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   22	13	8	_plr	Lnet/minecraft/world/entity/player/Player;
    //   50	11	9	_entGetArmor	Lnet/minecraft/world/entity/LivingEntity;
    //   91	11	10	_entGetArmor	Lnet/minecraft/world/entity/LivingEntity;
    //   132	11	11	_entGetArmor	Lnet/minecraft/world/entity/LivingEntity;
    //   173	11	12	_entGetArmor	Lnet/minecraft/world/entity/LivingEntity;
    //   324	88	13	_level	Lnet/minecraft/world/level/Level;
    //   482	24	15	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   445	70	14	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   425	90	13	_level	Lnet/minecraft/server/level/ServerLevel;
    //   557	88	13	_level	Lnet/minecraft/world/level/Level;
    //   715	24	15	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   678	70	14	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   658	90	13	_level	Lnet/minecraft/server/level/ServerLevel;
    //   783	8	14	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
    //   766	30	13	_entity	Lnet/minecraft/world/entity/LivingEntity;
    //   811	22	13	_entity	Lnet/minecraft/world/entity/LivingEntity;
    //   848	22	13	_entity	Lnet/minecraft/world/entity/LivingEntity;
    //   939	88	13	_level	Lnet/minecraft/world/level/Level;
    //   1097	24	15	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   1060	70	14	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   1040	90	13	_level	Lnet/minecraft/server/level/ServerLevel;
    //   1165	8	14	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
    //   1148	30	13	_entity	Lnet/minecraft/world/entity/LivingEntity;
    //   1193	22	13	_entity	Lnet/minecraft/world/entity/LivingEntity;
    //   1230	22	13	_entity	Lnet/minecraft/world/entity/LivingEntity;
    //   1321	88	13	_level	Lnet/minecraft/world/level/Level;
    //   1479	24	15	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   1442	70	14	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   1422	90	13	_level	Lnet/minecraft/server/level/ServerLevel;
    //   1547	8	14	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
    //   1530	30	13	_entity	Lnet/minecraft/world/entity/LivingEntity;
    //   1575	22	13	_entity	Lnet/minecraft/world/entity/LivingEntity;
    //   1612	22	13	_entity	Lnet/minecraft/world/entity/LivingEntity;
    //   1715	8	14	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
    //   1698	30	13	_entity	Lnet/minecraft/world/entity/LivingEntity;
    //   1743	22	13	_entity	Lnet/minecraft/world/entity/LivingEntity;
    //   1780	22	13	_entity	Lnet/minecraft/world/entity/LivingEntity;
    //   1871	88	13	_level	Lnet/minecraft/world/level/Level;
    //   2029	24	15	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   1992	70	14	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   1972	90	13	_level	Lnet/minecraft/server/level/ServerLevel;
    //   2097	8	14	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
    //   2080	30	13	_entity	Lnet/minecraft/world/entity/LivingEntity;
    //   2125	22	13	_entity	Lnet/minecraft/world/entity/LivingEntity;
    //   2162	22	13	_entity	Lnet/minecraft/world/entity/LivingEntity;
    //   2199	22	13	_entity	Lnet/minecraft/world/entity/LivingEntity;
    //   2292	90	13	_level	Lnet/minecraft/world/level/Level;
    //   2452	24	15	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   2415	70	14	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   2395	90	13	_level	Lnet/minecraft/server/level/ServerLevel;
    //   2535	88	13	_level	Lnet/minecraft/world/level/Level;
    //   2693	24	15	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   2656	70	14	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   2636	90	13	_level	Lnet/minecraft/server/level/ServerLevel;
    //   2780	8	14	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
    //   2763	30	13	_entity	Lnet/minecraft/world/entity/LivingEntity;
    //   2808	22	13	_entity	Lnet/minecraft/world/entity/LivingEntity;
    //   2845	22	13	_entity	Lnet/minecraft/world/entity/LivingEntity;
    //   2957	90	13	_level	Lnet/minecraft/world/level/Level;
    //   3117	24	15	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   3080	70	14	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   3060	90	13	_level	Lnet/minecraft/server/level/ServerLevel;
    //   3229	90	13	_level	Lnet/minecraft/world/level/Level;
    //   3389	24	15	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   3352	70	14	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   3332	90	13	_level	Lnet/minecraft/server/level/ServerLevel;
    //   3493	90	13	_level	Lnet/minecraft/world/level/Level;
    //   3653	24	15	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   3616	70	14	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   3596	90	13	_level	Lnet/minecraft/server/level/ServerLevel;
    //   3755	88	13	_level	Lnet/minecraft/world/level/Level;
    //   3913	24	15	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   3876	70	14	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   3856	90	13	_level	Lnet/minecraft/server/level/ServerLevel;
    //   3981	8	14	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
    //   3964	30	13	_entity	Lnet/minecraft/world/entity/LivingEntity;
    //   4009	22	13	_entity	Lnet/minecraft/world/entity/LivingEntity;
    //   4046	22	13	_entity	Lnet/minecraft/world/entity/LivingEntity;
    //   4150	90	13	_level	Lnet/minecraft/world/level/Level;
    //   4310	24	15	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   4273	70	14	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   4253	90	13	_level	Lnet/minecraft/server/level/ServerLevel;
    //   0	4365	0	world	Lnet/minecraft/world/level/LevelAccessor;
    //   0	4365	1	x	D
    //   0	4365	3	y	D
    //   0	4365	5	z	D
    //   0	4365	7	entity	Lnet/minecraft/world/entity/Entity;
  }
}


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\DarklatexcrystaleggEntityCollidesInTheBlockProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */