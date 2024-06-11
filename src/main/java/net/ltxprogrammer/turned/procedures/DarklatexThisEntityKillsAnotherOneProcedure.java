package net.ltxprogrammer.turned.procedures;

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
    //   16: invokeinterface m_6106_ : ()Lnet/minecraft/world/level/storage/LevelData;
    //   21: invokeinterface m_5470_ : ()Lnet/minecraft/world/level/GameRules;
    //   26: getstatic net/ltxprogrammer/turned/init/LatexModGameRules.DARKLATEXTRANSFUR : Lnet/minecraft/world/level/GameRules$Key;
    //   29: invokevirtual m_46207_ : (Lnet/minecraft/world/level/GameRules$Key;)Z
    //   32: iconst_1
    //   33: if_icmpne -> 3441
    //   36: aload #7
    //   38: instanceof net/minecraft/world/entity/LivingEntity
    //   41: ifeq -> 62
    //   44: aload #7
    //   46: checkcast net/minecraft/world/entity/LivingEntity
    //   49: astore #11
    //   51: aload #11
    //   53: getstatic net/minecraft/world/entity/EquipmentSlot.HEAD : Lnet/minecraft/world/entity/EquipmentSlot;
    //   56: invokevirtual m_6844_ : (Lnet/minecraft/world/entity/EquipmentSlot;)Lnet/minecraft/world/item/ItemStack;
    //   59: goto -> 65
    //   62: getstatic net/minecraft/world/item/ItemStack.f_41583_ : Lnet/minecraft/world/item/ItemStack;
    //   65: invokevirtual m_41720_ : ()Lnet/minecraft/world/item/Item;
    //   68: getstatic net/ltxprogrammer/turned/init/LatexModItems.HAZMAT_HELMET : Lnet/minecraftforge/registries/RegistryObject;
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
    //   97: invokevirtual m_6844_ : (Lnet/minecraft/world/entity/EquipmentSlot;)Lnet/minecraft/world/item/ItemStack;
    //   100: goto -> 106
    //   103: getstatic net/minecraft/world/item/ItemStack.f_41583_ : Lnet/minecraft/world/item/ItemStack;
    //   106: invokevirtual m_41720_ : ()Lnet/minecraft/world/item/Item;
    //   109: getstatic net/ltxprogrammer/turned/init/LatexModItems.HAZMAT_CHESTPLATE : Lnet/minecraftforge/registries/RegistryObject;
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
    //   138: invokevirtual m_6844_ : (Lnet/minecraft/world/entity/EquipmentSlot;)Lnet/minecraft/world/item/ItemStack;
    //   141: goto -> 147
    //   144: getstatic net/minecraft/world/item/ItemStack.f_41583_ : Lnet/minecraft/world/item/ItemStack;
    //   147: invokevirtual m_41720_ : ()Lnet/minecraft/world/item/Item;
    //   150: getstatic net/ltxprogrammer/turned/init/LatexModItems.HAZMAT_LEGGINGS : Lnet/minecraftforge/registries/RegistryObject;
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
    //   179: invokevirtual m_6844_ : (Lnet/minecraft/world/entity/EquipmentSlot;)Lnet/minecraft/world/item/ItemStack;
    //   182: goto -> 188
    //   185: getstatic net/minecraft/world/item/ItemStack.f_41583_ : Lnet/minecraft/world/item/ItemStack;
    //   188: invokevirtual m_41720_ : ()Lnet/minecraft/world/item/Item;
    //   191: getstatic net/ltxprogrammer/turned/init/LatexModItems.HAZMAT_BOOTS : Lnet/minecraftforge/registries/RegistryObject;
    //   194: invokevirtual get : ()Ljava/lang/Object;
    //   197: if_acmpne -> 204
    //   200: iconst_1
    //   201: goto -> 205
    //   204: iconst_0
    //   205: iconst_1
    //   206: if_icmpeq -> 3435
    //   209: aload #7
    //   211: invokevirtual m_6095_ : ()Lnet/minecraft/world/entity/EntityType;
    //   214: getstatic net/minecraft/core/Registry.f_122903_ : Lnet/minecraft/resources/ResourceKey;
    //   217: new net/minecraft/resources/ResourceLocation
    //   220: dup
    //   221: ldc 'turned:robots'
    //   223: invokespecial <init> : (Ljava/lang/String;)V
    //   226: invokestatic m_203882_ : (Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraft/tags/TagKey;
    //   229: invokevirtual m_204039_ : (Lnet/minecraft/tags/TagKey;)Z
    //   232: ifne -> 243
    //   235: aload #7
    //   237: instanceof net/minecraft/world/entity/player/Player
    //   240: ifeq -> 245
    //   243: iconst_1
    //   244: ireturn
    //   245: aload #7
    //   247: instanceof net/minecraft/world/entity/FlyingMob
    //   250: iconst_1
    //   251: if_icmpne -> 1056
    //   254: invokestatic random : ()D
    //   257: ldc2_w 0.3
    //   260: dcmpg
    //   261: ifge -> 453
    //   264: aload #7
    //   266: getfield f_19853_ : Lnet/minecraft/world/level/Level;
    //   269: invokevirtual m_5776_ : ()Z
    //   272: ifne -> 280
    //   275: aload #7
    //   277: invokevirtual m_146870_ : ()V
    //   280: aload_0
    //   281: instanceof net/minecraft/world/level/Level
    //   284: ifeq -> 347
    //   287: aload_0
    //   288: checkcast net/minecraft/world/level/Level
    //   291: astore #15
    //   293: aload #15
    //   295: invokevirtual m_5776_ : ()Z
    //   298: ifne -> 329
    //   301: aload #15
    //   303: aconst_null
    //   304: new net/minecraft/core/BlockPos
    //   307: dup
    //   308: dload_1
    //   309: dload_3
    //   310: dload #5
    //   312: invokespecial <init> : (DDD)V
    //   315: getstatic net/ltxprogrammer/changed/init/ChangedSounds.POISON : Lnet/minecraft/sounds/SoundEvent;
    //   318: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   321: fconst_1
    //   322: fconst_1
    //   323: invokevirtual m_5594_ : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   326: goto -> 347
    //   329: aload #15
    //   331: dload_1
    //   332: dload_3
    //   333: dload #5
    //   335: getstatic net/ltxprogrammer/changed/init/ChangedSounds.POISON : Lnet/minecraft/sounds/SoundEvent;
    //   338: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   341: fconst_1
    //   342: fconst_1
    //   343: iconst_0
    //   344: invokevirtual m_7785_ : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   347: aload_0
    //   348: instanceof net/minecraft/server/level/ServerLevel
    //   351: ifeq -> 450
    //   354: aload_0
    //   355: checkcast net/minecraft/server/level/ServerLevel
    //   358: astore #15
    //   360: new net/ltxprogrammer/changed/entity/beast/DarkLatexYufeng
    //   363: dup
    //   364: getstatic net/ltxprogrammer/changed/init/ChangedEntities.DARK_LATEX_YUFENG : Lnet/minecraftforge/registries/RegistryObject;
    //   367: invokevirtual get : ()Ljava/lang/Object;
    //   370: checkcast net/minecraft/world/entity/EntityType
    //   373: aload #15
    //   375: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   378: astore #16
    //   380: aload #16
    //   382: dload_1
    //   383: dload_3
    //   384: dload #5
    //   386: aload_0
    //   387: invokeinterface m_5822_ : ()Ljava/util/Random;
    //   392: invokevirtual nextFloat : ()F
    //   395: ldc 360.0
    //   397: fmul
    //   398: fconst_0
    //   399: invokevirtual m_7678_ : (DDDFF)V
    //   402: aload #16
    //   404: instanceof net/minecraft/world/entity/Mob
    //   407: ifeq -> 441
    //   410: aload #16
    //   412: checkcast net/minecraft/world/entity/Mob
    //   415: astore #17
    //   417: aload #17
    //   419: aload #15
    //   421: aload_0
    //   422: aload #16
    //   424: invokevirtual m_142538_ : ()Lnet/minecraft/core/BlockPos;
    //   427: invokeinterface m_6436_ : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   432: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   435: aconst_null
    //   436: aconst_null
    //   437: invokevirtual m_6518_ : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   440: pop
    //   441: aload_0
    //   442: aload #16
    //   444: invokeinterface m_7967_ : (Lnet/minecraft/world/entity/Entity;)Z
    //   449: pop
    //   450: goto -> 3441
    //   453: invokestatic random : ()D
    //   456: ldc2_w 0.3
    //   459: dcmpg
    //   460: ifge -> 652
    //   463: aload #7
    //   465: getfield f_19853_ : Lnet/minecraft/world/level/Level;
    //   468: invokevirtual m_5776_ : ()Z
    //   471: ifne -> 479
    //   474: aload #7
    //   476: invokevirtual m_146870_ : ()V
    //   479: aload_0
    //   480: instanceof net/minecraft/world/level/Level
    //   483: ifeq -> 546
    //   486: aload_0
    //   487: checkcast net/minecraft/world/level/Level
    //   490: astore #15
    //   492: aload #15
    //   494: invokevirtual m_5776_ : ()Z
    //   497: ifne -> 528
    //   500: aload #15
    //   502: aconst_null
    //   503: new net/minecraft/core/BlockPos
    //   506: dup
    //   507: dload_1
    //   508: dload_3
    //   509: dload #5
    //   511: invokespecial <init> : (DDD)V
    //   514: getstatic net/ltxprogrammer/changed/init/ChangedSounds.POISON : Lnet/minecraft/sounds/SoundEvent;
    //   517: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   520: fconst_1
    //   521: fconst_1
    //   522: invokevirtual m_5594_ : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   525: goto -> 546
    //   528: aload #15
    //   530: dload_1
    //   531: dload_3
    //   532: dload #5
    //   534: getstatic net/ltxprogrammer/changed/init/ChangedSounds.POISON : Lnet/minecraft/sounds/SoundEvent;
    //   537: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   540: fconst_1
    //   541: fconst_1
    //   542: iconst_0
    //   543: invokevirtual m_7785_ : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   546: aload_0
    //   547: instanceof net/minecraft/server/level/ServerLevel
    //   550: ifeq -> 649
    //   553: aload_0
    //   554: checkcast net/minecraft/server/level/ServerLevel
    //   557: astore #15
    //   559: new net/ltxprogrammer/turned/entity/DarkLatexMothEntity
    //   562: dup
    //   563: getstatic net/ltxprogrammer/turned/init/LatexModEntities.DARK_LATEX_MOTH : Lnet/minecraftforge/registries/RegistryObject;
    //   566: invokevirtual get : ()Ljava/lang/Object;
    //   569: checkcast net/minecraft/world/entity/EntityType
    //   572: aload #15
    //   574: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   577: astore #16
    //   579: aload #16
    //   581: dload_1
    //   582: dload_3
    //   583: dload #5
    //   585: aload_0
    //   586: invokeinterface m_5822_ : ()Ljava/util/Random;
    //   591: invokevirtual nextFloat : ()F
    //   594: ldc 360.0
    //   596: fmul
    //   597: fconst_0
    //   598: invokevirtual m_7678_ : (DDDFF)V
    //   601: aload #16
    //   603: instanceof net/minecraft/world/entity/Mob
    //   606: ifeq -> 640
    //   609: aload #16
    //   611: checkcast net/minecraft/world/entity/Mob
    //   614: astore #17
    //   616: aload #17
    //   618: aload #15
    //   620: aload_0
    //   621: aload #16
    //   623: invokevirtual m_142538_ : ()Lnet/minecraft/core/BlockPos;
    //   626: invokeinterface m_6436_ : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   631: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   634: aconst_null
    //   635: aconst_null
    //   636: invokevirtual m_6518_ : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   639: pop
    //   640: aload_0
    //   641: aload #16
    //   643: invokeinterface m_7967_ : (Lnet/minecraft/world/entity/Entity;)Z
    //   648: pop
    //   649: goto -> 3441
    //   652: invokestatic random : ()D
    //   655: ldc2_w 0.3
    //   658: dcmpg
    //   659: ifge -> 851
    //   662: aload #7
    //   664: getfield f_19853_ : Lnet/minecraft/world/level/Level;
    //   667: invokevirtual m_5776_ : ()Z
    //   670: ifne -> 678
    //   673: aload #7
    //   675: invokevirtual m_146870_ : ()V
    //   678: aload_0
    //   679: instanceof net/minecraft/world/level/Level
    //   682: ifeq -> 745
    //   685: aload_0
    //   686: checkcast net/minecraft/world/level/Level
    //   689: astore #15
    //   691: aload #15
    //   693: invokevirtual m_5776_ : ()Z
    //   696: ifne -> 727
    //   699: aload #15
    //   701: aconst_null
    //   702: new net/minecraft/core/BlockPos
    //   705: dup
    //   706: dload_1
    //   707: dload_3
    //   708: dload #5
    //   710: invokespecial <init> : (DDD)V
    //   713: getstatic net/ltxprogrammer/changed/init/ChangedSounds.POISON : Lnet/minecraft/sounds/SoundEvent;
    //   716: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   719: fconst_1
    //   720: fconst_1
    //   721: invokevirtual m_5594_ : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   724: goto -> 745
    //   727: aload #15
    //   729: dload_1
    //   730: dload_3
    //   731: dload #5
    //   733: getstatic net/ltxprogrammer/changed/init/ChangedSounds.POISON : Lnet/minecraft/sounds/SoundEvent;
    //   736: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   739: fconst_1
    //   740: fconst_1
    //   741: iconst_0
    //   742: invokevirtual m_7785_ : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   745: aload_0
    //   746: instanceof net/minecraft/server/level/ServerLevel
    //   749: ifeq -> 848
    //   752: aload_0
    //   753: checkcast net/minecraft/server/level/ServerLevel
    //   756: astore #15
    //   758: new net/ltxprogrammer/turned/entity/DLbeeEntity
    //   761: dup
    //   762: getstatic net/ltxprogrammer/turned/init/LatexModEntities.D_LBEE : Lnet/minecraftforge/registries/RegistryObject;
    //   765: invokevirtual get : ()Ljava/lang/Object;
    //   768: checkcast net/minecraft/world/entity/EntityType
    //   771: aload #15
    //   773: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   776: astore #16
    //   778: aload #16
    //   780: dload_1
    //   781: dload_3
    //   782: dload #5
    //   784: aload_0
    //   785: invokeinterface m_5822_ : ()Ljava/util/Random;
    //   790: invokevirtual nextFloat : ()F
    //   793: ldc 360.0
    //   795: fmul
    //   796: fconst_0
    //   797: invokevirtual m_7678_ : (DDDFF)V
    //   800: aload #16
    //   802: instanceof net/minecraft/world/entity/Mob
    //   805: ifeq -> 839
    //   808: aload #16
    //   810: checkcast net/minecraft/world/entity/Mob
    //   813: astore #17
    //   815: aload #17
    //   817: aload #15
    //   819: aload_0
    //   820: aload #16
    //   822: invokevirtual m_142538_ : ()Lnet/minecraft/core/BlockPos;
    //   825: invokeinterface m_6436_ : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   830: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   833: aconst_null
    //   834: aconst_null
    //   835: invokevirtual m_6518_ : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   838: pop
    //   839: aload_0
    //   840: aload #16
    //   842: invokeinterface m_7967_ : (Lnet/minecraft/world/entity/Entity;)Z
    //   847: pop
    //   848: goto -> 3441
    //   851: aload #7
    //   853: getfield f_19853_ : Lnet/minecraft/world/level/Level;
    //   856: invokevirtual m_5776_ : ()Z
    //   859: ifne -> 867
    //   862: aload #7
    //   864: invokevirtual m_146870_ : ()V
    //   867: aload #8
    //   869: getfield f_19853_ : Lnet/minecraft/world/level/Level;
    //   872: invokevirtual m_5776_ : ()Z
    //   875: ifne -> 883
    //   878: aload #8
    //   880: invokevirtual m_146870_ : ()V
    //   883: aload_0
    //   884: instanceof net/minecraft/world/level/Level
    //   887: ifeq -> 950
    //   890: aload_0
    //   891: checkcast net/minecraft/world/level/Level
    //   894: astore #15
    //   896: aload #15
    //   898: invokevirtual m_5776_ : ()Z
    //   901: ifne -> 932
    //   904: aload #15
    //   906: aconst_null
    //   907: new net/minecraft/core/BlockPos
    //   910: dup
    //   911: dload_1
    //   912: dload_3
    //   913: dload #5
    //   915: invokespecial <init> : (DDD)V
    //   918: getstatic net/ltxprogrammer/changed/init/ChangedSounds.POISON : Lnet/minecraft/sounds/SoundEvent;
    //   921: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   924: fconst_1
    //   925: fconst_1
    //   926: invokevirtual m_5594_ : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   929: goto -> 950
    //   932: aload #15
    //   934: dload_1
    //   935: dload_3
    //   936: dload #5
    //   938: getstatic net/ltxprogrammer/changed/init/ChangedSounds.POISON : Lnet/minecraft/sounds/SoundEvent;
    //   941: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   944: fconst_1
    //   945: fconst_1
    //   946: iconst_0
    //   947: invokevirtual m_7785_ : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   950: aload_0
    //   951: instanceof net/minecraft/server/level/ServerLevel
    //   954: ifeq -> 1053
    //   957: aload_0
    //   958: checkcast net/minecraft/server/level/ServerLevel
    //   961: astore #15
    //   963: new net/ltxprogrammer/changed/entity/beast/DarkLatexYufeng
    //   966: dup
    //   967: getstatic net/ltxprogrammer/changed/init/ChangedEntities.DARK_LATEX_YUFENG : Lnet/minecraftforge/registries/RegistryObject;
    //   970: invokevirtual get : ()Ljava/lang/Object;
    //   973: checkcast net/minecraft/world/entity/EntityType
    //   976: aload #15
    //   978: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   981: astore #16
    //   983: aload #16
    //   985: dload_1
    //   986: dload_3
    //   987: dload #5
    //   989: aload_0
    //   990: invokeinterface m_5822_ : ()Ljava/util/Random;
    //   995: invokevirtual nextFloat : ()F
    //   998: ldc 360.0
    //   1000: fmul
    //   1001: fconst_0
    //   1002: invokevirtual m_7678_ : (DDDFF)V
    //   1005: aload #16
    //   1007: instanceof net/minecraft/world/entity/Mob
    //   1010: ifeq -> 1044
    //   1013: aload #16
    //   1015: checkcast net/minecraft/world/entity/Mob
    //   1018: astore #17
    //   1020: aload #17
    //   1022: aload #15
    //   1024: aload_0
    //   1025: aload #16
    //   1027: invokevirtual m_142538_ : ()Lnet/minecraft/core/BlockPos;
    //   1030: invokeinterface m_6436_ : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   1035: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   1038: aconst_null
    //   1039: aconst_null
    //   1040: invokevirtual m_6518_ : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   1043: pop
    //   1044: aload_0
    //   1045: aload #16
    //   1047: invokeinterface m_7967_ : (Lnet/minecraft/world/entity/Entity;)Z
    //   1052: pop
    //   1053: goto -> 3441
    //   1056: aload #7
    //   1058: instanceof net/minecraft/world/entity/animal/WaterAnimal
    //   1061: iconst_1
    //   1062: if_icmpne -> 1668
    //   1065: invokestatic random : ()D
    //   1068: ldc2_w 0.3
    //   1071: dcmpg
    //   1072: ifge -> 1264
    //   1075: aload #7
    //   1077: getfield f_19853_ : Lnet/minecraft/world/level/Level;
    //   1080: invokevirtual m_5776_ : ()Z
    //   1083: ifne -> 1091
    //   1086: aload #7
    //   1088: invokevirtual m_146870_ : ()V
    //   1091: aload_0
    //   1092: instanceof net/minecraft/world/level/Level
    //   1095: ifeq -> 1158
    //   1098: aload_0
    //   1099: checkcast net/minecraft/world/level/Level
    //   1102: astore #15
    //   1104: aload #15
    //   1106: invokevirtual m_5776_ : ()Z
    //   1109: ifne -> 1140
    //   1112: aload #15
    //   1114: aconst_null
    //   1115: new net/minecraft/core/BlockPos
    //   1118: dup
    //   1119: dload_1
    //   1120: dload_3
    //   1121: dload #5
    //   1123: invokespecial <init> : (DDD)V
    //   1126: getstatic net/ltxprogrammer/changed/init/ChangedSounds.POISON : Lnet/minecraft/sounds/SoundEvent;
    //   1129: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   1132: fconst_1
    //   1133: fconst_1
    //   1134: invokevirtual m_5594_ : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   1137: goto -> 1158
    //   1140: aload #15
    //   1142: dload_1
    //   1143: dload_3
    //   1144: dload #5
    //   1146: getstatic net/ltxprogrammer/changed/init/ChangedSounds.POISON : Lnet/minecraft/sounds/SoundEvent;
    //   1149: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   1152: fconst_1
    //   1153: fconst_1
    //   1154: iconst_0
    //   1155: invokevirtual m_7785_ : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   1158: aload_0
    //   1159: instanceof net/minecraft/server/level/ServerLevel
    //   1162: ifeq -> 1261
    //   1165: aload_0
    //   1166: checkcast net/minecraft/server/level/ServerLevel
    //   1169: astore #15
    //   1171: new net/ltxprogrammer/turned/entity/DlsharkEntity
    //   1174: dup
    //   1175: getstatic net/ltxprogrammer/turned/init/LatexModEntities.DLSHARK : Lnet/minecraftforge/registries/RegistryObject;
    //   1178: invokevirtual get : ()Ljava/lang/Object;
    //   1181: checkcast net/minecraft/world/entity/EntityType
    //   1184: aload #15
    //   1186: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   1189: astore #16
    //   1191: aload #16
    //   1193: dload_1
    //   1194: dload_3
    //   1195: dload #5
    //   1197: aload_0
    //   1198: invokeinterface m_5822_ : ()Ljava/util/Random;
    //   1203: invokevirtual nextFloat : ()F
    //   1206: ldc 360.0
    //   1208: fmul
    //   1209: fconst_0
    //   1210: invokevirtual m_7678_ : (DDDFF)V
    //   1213: aload #16
    //   1215: instanceof net/minecraft/world/entity/Mob
    //   1218: ifeq -> 1252
    //   1221: aload #16
    //   1223: checkcast net/minecraft/world/entity/Mob
    //   1226: astore #17
    //   1228: aload #17
    //   1230: aload #15
    //   1232: aload_0
    //   1233: aload #16
    //   1235: invokevirtual m_142538_ : ()Lnet/minecraft/core/BlockPos;
    //   1238: invokeinterface m_6436_ : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   1243: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   1246: aconst_null
    //   1247: aconst_null
    //   1248: invokevirtual m_6518_ : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   1251: pop
    //   1252: aload_0
    //   1253: aload #16
    //   1255: invokeinterface m_7967_ : (Lnet/minecraft/world/entity/Entity;)Z
    //   1260: pop
    //   1261: goto -> 3441
    //   1264: invokestatic random : ()D
    //   1267: ldc2_w 0.2
    //   1270: dcmpg
    //   1271: ifge -> 1463
    //   1274: aload #7
    //   1276: getfield f_19853_ : Lnet/minecraft/world/level/Level;
    //   1279: invokevirtual m_5776_ : ()Z
    //   1282: ifne -> 1290
    //   1285: aload #7
    //   1287: invokevirtual m_146870_ : ()V
    //   1290: aload_0
    //   1291: instanceof net/minecraft/world/level/Level
    //   1294: ifeq -> 1357
    //   1297: aload_0
    //   1298: checkcast net/minecraft/world/level/Level
    //   1301: astore #15
    //   1303: aload #15
    //   1305: invokevirtual m_5776_ : ()Z
    //   1308: ifne -> 1339
    //   1311: aload #15
    //   1313: aconst_null
    //   1314: new net/minecraft/core/BlockPos
    //   1317: dup
    //   1318: dload_1
    //   1319: dload_3
    //   1320: dload #5
    //   1322: invokespecial <init> : (DDD)V
    //   1325: getstatic net/ltxprogrammer/changed/init/ChangedSounds.POISON : Lnet/minecraft/sounds/SoundEvent;
    //   1328: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   1331: fconst_1
    //   1332: fconst_1
    //   1333: invokevirtual m_5594_ : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   1336: goto -> 1357
    //   1339: aload #15
    //   1341: dload_1
    //   1342: dload_3
    //   1343: dload #5
    //   1345: getstatic net/ltxprogrammer/changed/init/ChangedSounds.POISON : Lnet/minecraft/sounds/SoundEvent;
    //   1348: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   1351: fconst_1
    //   1352: fconst_1
    //   1353: iconst_0
    //   1354: invokevirtual m_7785_ : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   1357: aload_0
    //   1358: instanceof net/minecraft/server/level/ServerLevel
    //   1361: ifeq -> 1460
    //   1364: aload_0
    //   1365: checkcast net/minecraft/server/level/ServerLevel
    //   1368: astore #15
    //   1370: new net/ltxprogrammer/turned/entity/DlSquidDogEntity
    //   1373: dup
    //   1374: getstatic net/ltxprogrammer/turned/init/LatexModEntities.DL_SQUID_DOG : Lnet/minecraftforge/registries/RegistryObject;
    //   1377: invokevirtual get : ()Ljava/lang/Object;
    //   1380: checkcast net/minecraft/world/entity/EntityType
    //   1383: aload #15
    //   1385: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   1388: astore #16
    //   1390: aload #16
    //   1392: dload_1
    //   1393: dload_3
    //   1394: dload #5
    //   1396: aload_0
    //   1397: invokeinterface m_5822_ : ()Ljava/util/Random;
    //   1402: invokevirtual nextFloat : ()F
    //   1405: ldc 360.0
    //   1407: fmul
    //   1408: fconst_0
    //   1409: invokevirtual m_7678_ : (DDDFF)V
    //   1412: aload #16
    //   1414: instanceof net/minecraft/world/entity/Mob
    //   1417: ifeq -> 1451
    //   1420: aload #16
    //   1422: checkcast net/minecraft/world/entity/Mob
    //   1425: astore #17
    //   1427: aload #17
    //   1429: aload #15
    //   1431: aload_0
    //   1432: aload #16
    //   1434: invokevirtual m_142538_ : ()Lnet/minecraft/core/BlockPos;
    //   1437: invokeinterface m_6436_ : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   1442: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   1445: aconst_null
    //   1446: aconst_null
    //   1447: invokevirtual m_6518_ : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   1450: pop
    //   1451: aload_0
    //   1452: aload #16
    //   1454: invokeinterface m_7967_ : (Lnet/minecraft/world/entity/Entity;)Z
    //   1459: pop
    //   1460: goto -> 3441
    //   1463: aload #7
    //   1465: getfield f_19853_ : Lnet/minecraft/world/level/Level;
    //   1468: invokevirtual m_5776_ : ()Z
    //   1471: ifne -> 1479
    //   1474: aload #7
    //   1476: invokevirtual m_146870_ : ()V
    //   1479: aload #8
    //   1481: getfield f_19853_ : Lnet/minecraft/world/level/Level;
    //   1484: invokevirtual m_5776_ : ()Z
    //   1487: ifne -> 1495
    //   1490: aload #8
    //   1492: invokevirtual m_146870_ : ()V
    //   1495: aload_0
    //   1496: instanceof net/minecraft/world/level/Level
    //   1499: ifeq -> 1562
    //   1502: aload_0
    //   1503: checkcast net/minecraft/world/level/Level
    //   1506: astore #15
    //   1508: aload #15
    //   1510: invokevirtual m_5776_ : ()Z
    //   1513: ifne -> 1544
    //   1516: aload #15
    //   1518: aconst_null
    //   1519: new net/minecraft/core/BlockPos
    //   1522: dup
    //   1523: dload_1
    //   1524: dload_3
    //   1525: dload #5
    //   1527: invokespecial <init> : (DDD)V
    //   1530: getstatic net/ltxprogrammer/changed/init/ChangedSounds.POISON : Lnet/minecraft/sounds/SoundEvent;
    //   1533: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   1536: fconst_1
    //   1537: fconst_1
    //   1538: invokevirtual m_5594_ : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   1541: goto -> 1562
    //   1544: aload #15
    //   1546: dload_1
    //   1547: dload_3
    //   1548: dload #5
    //   1550: getstatic net/ltxprogrammer/changed/init/ChangedSounds.POISON : Lnet/minecraft/sounds/SoundEvent;
    //   1553: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   1556: fconst_1
    //   1557: fconst_1
    //   1558: iconst_0
    //   1559: invokevirtual m_7785_ : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   1562: aload_0
    //   1563: instanceof net/minecraft/server/level/ServerLevel
    //   1566: ifeq -> 1665
    //   1569: aload_0
    //   1570: checkcast net/minecraft/server/level/ServerLevel
    //   1573: astore #15
    //   1575: new net/ltxprogrammer/turned/entity/DlsharkEntity
    //   1578: dup
    //   1579: getstatic net/ltxprogrammer/turned/init/LatexModEntities.DLSHARK : Lnet/minecraftforge/registries/RegistryObject;
    //   1582: invokevirtual get : ()Ljava/lang/Object;
    //   1585: checkcast net/minecraft/world/entity/EntityType
    //   1588: aload #15
    //   1590: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   1593: astore #16
    //   1595: aload #16
    //   1597: dload_1
    //   1598: dload_3
    //   1599: dload #5
    //   1601: aload_0
    //   1602: invokeinterface m_5822_ : ()Ljava/util/Random;
    //   1607: invokevirtual nextFloat : ()F
    //   1610: ldc 360.0
    //   1612: fmul
    //   1613: fconst_0
    //   1614: invokevirtual m_7678_ : (DDDFF)V
    //   1617: aload #16
    //   1619: instanceof net/minecraft/world/entity/Mob
    //   1622: ifeq -> 1656
    //   1625: aload #16
    //   1627: checkcast net/minecraft/world/entity/Mob
    //   1630: astore #17
    //   1632: aload #17
    //   1634: aload #15
    //   1636: aload_0
    //   1637: aload #16
    //   1639: invokevirtual m_142538_ : ()Lnet/minecraft/core/BlockPos;
    //   1642: invokeinterface m_6436_ : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   1647: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   1650: aconst_null
    //   1651: aconst_null
    //   1652: invokevirtual m_6518_ : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   1655: pop
    //   1656: aload_0
    //   1657: aload #16
    //   1659: invokeinterface m_7967_ : (Lnet/minecraft/world/entity/Entity;)Z
    //   1664: pop
    //   1665: goto -> 3441
    //   1668: aload #7
    //   1670: instanceof net/minecraft/world/entity/animal/Fox
    //   1673: iconst_1
    //   1674: if_icmpne -> 1866
    //   1677: aload #7
    //   1679: getfield f_19853_ : Lnet/minecraft/world/level/Level;
    //   1682: invokevirtual m_5776_ : ()Z
    //   1685: ifne -> 1693
    //   1688: aload #7
    //   1690: invokevirtual m_146870_ : ()V
    //   1693: aload_0
    //   1694: instanceof net/minecraft/world/level/Level
    //   1697: ifeq -> 1760
    //   1700: aload_0
    //   1701: checkcast net/minecraft/world/level/Level
    //   1704: astore #15
    //   1706: aload #15
    //   1708: invokevirtual m_5776_ : ()Z
    //   1711: ifne -> 1742
    //   1714: aload #15
    //   1716: aconst_null
    //   1717: new net/minecraft/core/BlockPos
    //   1720: dup
    //   1721: dload_1
    //   1722: dload_3
    //   1723: dload #5
    //   1725: invokespecial <init> : (DDD)V
    //   1728: getstatic net/ltxprogrammer/changed/init/ChangedSounds.POISON : Lnet/minecraft/sounds/SoundEvent;
    //   1731: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   1734: fconst_1
    //   1735: fconst_1
    //   1736: invokevirtual m_5594_ : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   1739: goto -> 1760
    //   1742: aload #15
    //   1744: dload_1
    //   1745: dload_3
    //   1746: dload #5
    //   1748: getstatic net/ltxprogrammer/changed/init/ChangedSounds.POISON : Lnet/minecraft/sounds/SoundEvent;
    //   1751: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   1754: fconst_1
    //   1755: fconst_1
    //   1756: iconst_0
    //   1757: invokevirtual m_7785_ : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   1760: aload_0
    //   1761: instanceof net/minecraft/server/level/ServerLevel
    //   1764: ifeq -> 1863
    //   1767: aload_0
    //   1768: checkcast net/minecraft/server/level/ServerLevel
    //   1771: astore #15
    //   1773: new net/ltxprogrammer/turned/entity/DarkLatexFoxEntity
    //   1776: dup
    //   1777: getstatic net/ltxprogrammer/turned/init/LatexModEntities.DARK_LATEX_FOX : Lnet/minecraftforge/registries/RegistryObject;
    //   1780: invokevirtual get : ()Ljava/lang/Object;
    //   1783: checkcast net/minecraft/world/entity/EntityType
    //   1786: aload #15
    //   1788: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   1791: astore #16
    //   1793: aload #16
    //   1795: dload_1
    //   1796: dload_3
    //   1797: dload #5
    //   1799: aload_0
    //   1800: invokeinterface m_5822_ : ()Ljava/util/Random;
    //   1805: invokevirtual nextFloat : ()F
    //   1808: ldc 360.0
    //   1810: fmul
    //   1811: fconst_0
    //   1812: invokevirtual m_7678_ : (DDDFF)V
    //   1815: aload #16
    //   1817: instanceof net/minecraft/world/entity/Mob
    //   1820: ifeq -> 1854
    //   1823: aload #16
    //   1825: checkcast net/minecraft/world/entity/Mob
    //   1828: astore #17
    //   1830: aload #17
    //   1832: aload #15
    //   1834: aload_0
    //   1835: aload #16
    //   1837: invokevirtual m_142538_ : ()Lnet/minecraft/core/BlockPos;
    //   1840: invokeinterface m_6436_ : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   1845: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   1848: aconst_null
    //   1849: aconst_null
    //   1850: invokevirtual m_6518_ : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   1853: pop
    //   1854: aload_0
    //   1855: aload #16
    //   1857: invokeinterface m_7967_ : (Lnet/minecraft/world/entity/Entity;)Z
    //   1862: pop
    //   1863: goto -> 3441
    //   1866: aload #7
    //   1868: instanceof net/minecraft/world/entity/monster/Skeleton
    //   1871: ifne -> 1882
    //   1874: aload #7
    //   1876: instanceof net/minecraft/world/entity/monster/WitherSkeleton
    //   1879: ifeq -> 1886
    //   1882: iconst_1
    //   1883: goto -> 1887
    //   1886: iconst_0
    //   1887: iconst_1
    //   1888: if_icmpne -> 2080
    //   1891: aload #7
    //   1893: getfield f_19853_ : Lnet/minecraft/world/level/Level;
    //   1896: invokevirtual m_5776_ : ()Z
    //   1899: ifne -> 1907
    //   1902: aload #7
    //   1904: invokevirtual m_146870_ : ()V
    //   1907: aload_0
    //   1908: instanceof net/minecraft/world/level/Level
    //   1911: ifeq -> 1974
    //   1914: aload_0
    //   1915: checkcast net/minecraft/world/level/Level
    //   1918: astore #15
    //   1920: aload #15
    //   1922: invokevirtual m_5776_ : ()Z
    //   1925: ifne -> 1956
    //   1928: aload #15
    //   1930: aconst_null
    //   1931: new net/minecraft/core/BlockPos
    //   1934: dup
    //   1935: dload_1
    //   1936: dload_3
    //   1937: dload #5
    //   1939: invokespecial <init> : (DDD)V
    //   1942: getstatic net/ltxprogrammer/changed/init/ChangedSounds.POISON : Lnet/minecraft/sounds/SoundEvent;
    //   1945: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   1948: fconst_1
    //   1949: fconst_1
    //   1950: invokevirtual m_5594_ : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   1953: goto -> 1974
    //   1956: aload #15
    //   1958: dload_1
    //   1959: dload_3
    //   1960: dload #5
    //   1962: getstatic net/ltxprogrammer/changed/init/ChangedSounds.POISON : Lnet/minecraft/sounds/SoundEvent;
    //   1965: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   1968: fconst_1
    //   1969: fconst_1
    //   1970: iconst_0
    //   1971: invokevirtual m_7785_ : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   1974: aload_0
    //   1975: instanceof net/minecraft/server/level/ServerLevel
    //   1978: ifeq -> 2077
    //   1981: aload_0
    //   1982: checkcast net/minecraft/server/level/ServerLevel
    //   1985: astore #15
    //   1987: new net/ltxprogrammer/turned/entity/DarkLatexSkeletonEntity
    //   1990: dup
    //   1991: getstatic net/ltxprogrammer/turned/init/LatexModEntities.DARK_LATEX_SKELETON : Lnet/minecraftforge/registries/RegistryObject;
    //   1994: invokevirtual get : ()Ljava/lang/Object;
    //   1997: checkcast net/minecraft/world/entity/EntityType
    //   2000: aload #15
    //   2002: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   2005: astore #16
    //   2007: aload #16
    //   2009: dload_1
    //   2010: dload_3
    //   2011: dload #5
    //   2013: aload_0
    //   2014: invokeinterface m_5822_ : ()Ljava/util/Random;
    //   2019: invokevirtual nextFloat : ()F
    //   2022: ldc 360.0
    //   2024: fmul
    //   2025: fconst_0
    //   2026: invokevirtual m_7678_ : (DDDFF)V
    //   2029: aload #16
    //   2031: instanceof net/minecraft/world/entity/Mob
    //   2034: ifeq -> 2068
    //   2037: aload #16
    //   2039: checkcast net/minecraft/world/entity/Mob
    //   2042: astore #17
    //   2044: aload #17
    //   2046: aload #15
    //   2048: aload_0
    //   2049: aload #16
    //   2051: invokevirtual m_142538_ : ()Lnet/minecraft/core/BlockPos;
    //   2054: invokeinterface m_6436_ : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   2059: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   2062: aconst_null
    //   2063: aconst_null
    //   2064: invokevirtual m_6518_ : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   2067: pop
    //   2068: aload_0
    //   2069: aload #16
    //   2071: invokeinterface m_7967_ : (Lnet/minecraft/world/entity/Entity;)Z
    //   2076: pop
    //   2077: goto -> 3441
    //   2080: aload #7
    //   2082: instanceof net/minecraft/world/entity/animal/Bee
    //   2085: iconst_1
    //   2086: if_icmpne -> 2278
    //   2089: aload #7
    //   2091: getfield f_19853_ : Lnet/minecraft/world/level/Level;
    //   2094: invokevirtual m_5776_ : ()Z
    //   2097: ifne -> 2105
    //   2100: aload #7
    //   2102: invokevirtual m_146870_ : ()V
    //   2105: aload_0
    //   2106: instanceof net/minecraft/world/level/Level
    //   2109: ifeq -> 2172
    //   2112: aload_0
    //   2113: checkcast net/minecraft/world/level/Level
    //   2116: astore #15
    //   2118: aload #15
    //   2120: invokevirtual m_5776_ : ()Z
    //   2123: ifne -> 2154
    //   2126: aload #15
    //   2128: aconst_null
    //   2129: new net/minecraft/core/BlockPos
    //   2132: dup
    //   2133: dload_1
    //   2134: dload_3
    //   2135: dload #5
    //   2137: invokespecial <init> : (DDD)V
    //   2140: getstatic net/ltxprogrammer/changed/init/ChangedSounds.POISON : Lnet/minecraft/sounds/SoundEvent;
    //   2143: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   2146: fconst_1
    //   2147: fconst_1
    //   2148: invokevirtual m_5594_ : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   2151: goto -> 2172
    //   2154: aload #15
    //   2156: dload_1
    //   2157: dload_3
    //   2158: dload #5
    //   2160: getstatic net/ltxprogrammer/changed/init/ChangedSounds.POISON : Lnet/minecraft/sounds/SoundEvent;
    //   2163: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   2166: fconst_1
    //   2167: fconst_1
    //   2168: iconst_0
    //   2169: invokevirtual m_7785_ : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   2172: aload_0
    //   2173: instanceof net/minecraft/server/level/ServerLevel
    //   2176: ifeq -> 2275
    //   2179: aload_0
    //   2180: checkcast net/minecraft/server/level/ServerLevel
    //   2183: astore #15
    //   2185: new net/ltxprogrammer/turned/entity/DLbeeEntity
    //   2188: dup
    //   2189: getstatic net/ltxprogrammer/turned/init/LatexModEntities.D_LBEE : Lnet/minecraftforge/registries/RegistryObject;
    //   2192: invokevirtual get : ()Ljava/lang/Object;
    //   2195: checkcast net/minecraft/world/entity/EntityType
    //   2198: aload #15
    //   2200: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   2203: astore #16
    //   2205: aload #16
    //   2207: dload_1
    //   2208: dload_3
    //   2209: dload #5
    //   2211: aload_0
    //   2212: invokeinterface m_5822_ : ()Ljava/util/Random;
    //   2217: invokevirtual nextFloat : ()F
    //   2220: ldc 360.0
    //   2222: fmul
    //   2223: fconst_0
    //   2224: invokevirtual m_7678_ : (DDDFF)V
    //   2227: aload #16
    //   2229: instanceof net/minecraft/world/entity/Mob
    //   2232: ifeq -> 2266
    //   2235: aload #16
    //   2237: checkcast net/minecraft/world/entity/Mob
    //   2240: astore #17
    //   2242: aload #17
    //   2244: aload #15
    //   2246: aload_0
    //   2247: aload #16
    //   2249: invokevirtual m_142538_ : ()Lnet/minecraft/core/BlockPos;
    //   2252: invokeinterface m_6436_ : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   2257: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   2260: aconst_null
    //   2261: aconst_null
    //   2262: invokevirtual m_6518_ : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   2265: pop
    //   2266: aload_0
    //   2267: aload #16
    //   2269: invokeinterface m_7967_ : (Lnet/minecraft/world/entity/Entity;)Z
    //   2274: pop
    //   2275: goto -> 3441
    //   2278: aload #7
    //   2280: instanceof net/ltxprogrammer/turned/entity/ScientistEntity
    //   2283: ifne -> 2302
    //   2286: aload #7
    //   2288: instanceof net/ltxprogrammer/turned/entity/EvilScientistEntity
    //   2291: ifne -> 2302
    //   2294: aload #7
    //   2296: instanceof net/ltxprogrammer/turned/entity/EvilSniperEntity
    //   2299: ifeq -> 2607
    //   2302: aload #7
    //   2304: getfield f_19853_ : Lnet/minecraft/world/level/Level;
    //   2307: invokevirtual m_5776_ : ()Z
    //   2310: ifne -> 2318
    //   2313: aload #7
    //   2315: invokevirtual m_146870_ : ()V
    //   2318: aload_0
    //   2319: instanceof net/minecraft/world/level/Level
    //   2322: ifeq -> 2385
    //   2325: aload_0
    //   2326: checkcast net/minecraft/world/level/Level
    //   2329: astore #15
    //   2331: aload #15
    //   2333: invokevirtual m_5776_ : ()Z
    //   2336: ifne -> 2367
    //   2339: aload #15
    //   2341: aconst_null
    //   2342: new net/minecraft/core/BlockPos
    //   2345: dup
    //   2346: dload_1
    //   2347: dload_3
    //   2348: dload #5
    //   2350: invokespecial <init> : (DDD)V
    //   2353: getstatic net/ltxprogrammer/changed/init/ChangedSounds.POISON : Lnet/minecraft/sounds/SoundEvent;
    //   2356: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   2359: fconst_1
    //   2360: fconst_1
    //   2361: invokevirtual m_5594_ : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   2364: goto -> 2385
    //   2367: aload #15
    //   2369: dload_1
    //   2370: dload_3
    //   2371: dload #5
    //   2373: getstatic net/ltxprogrammer/changed/init/ChangedSounds.POISON : Lnet/minecraft/sounds/SoundEvent;
    //   2376: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   2379: fconst_1
    //   2380: fconst_1
    //   2381: iconst_0
    //   2382: invokevirtual m_7785_ : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   2385: invokestatic random : ()D
    //   2388: ldc2_w 0.2
    //   2391: dcmpg
    //   2392: ifge -> 2501
    //   2395: aload_0
    //   2396: instanceof net/minecraft/server/level/ServerLevel
    //   2399: ifeq -> 2498
    //   2402: aload_0
    //   2403: checkcast net/minecraft/server/level/ServerLevel
    //   2406: astore #15
    //   2408: new net/ltxprogrammer/turned/entity/DarkLatexFoxSniperEntity
    //   2411: dup
    //   2412: getstatic net/ltxprogrammer/turned/init/LatexModEntities.DARK_LATEX_FOX_SNIPER : Lnet/minecraftforge/registries/RegistryObject;
    //   2415: invokevirtual get : ()Ljava/lang/Object;
    //   2418: checkcast net/minecraft/world/entity/EntityType
    //   2421: aload #15
    //   2423: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   2426: astore #16
    //   2428: aload #16
    //   2430: dload_1
    //   2431: dload_3
    //   2432: dload #5
    //   2434: aload_0
    //   2435: invokeinterface m_5822_ : ()Ljava/util/Random;
    //   2440: invokevirtual nextFloat : ()F
    //   2443: ldc 360.0
    //   2445: fmul
    //   2446: fconst_0
    //   2447: invokevirtual m_7678_ : (DDDFF)V
    //   2450: aload #16
    //   2452: instanceof net/minecraft/world/entity/Mob
    //   2455: ifeq -> 2489
    //   2458: aload #16
    //   2460: checkcast net/minecraft/world/entity/Mob
    //   2463: astore #17
    //   2465: aload #17
    //   2467: aload #15
    //   2469: aload_0
    //   2470: aload #16
    //   2472: invokevirtual m_142538_ : ()Lnet/minecraft/core/BlockPos;
    //   2475: invokeinterface m_6436_ : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   2480: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   2483: aconst_null
    //   2484: aconst_null
    //   2485: invokevirtual m_6518_ : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   2488: pop
    //   2489: aload_0
    //   2490: aload #16
    //   2492: invokeinterface m_7967_ : (Lnet/minecraft/world/entity/Entity;)Z
    //   2497: pop
    //   2498: goto -> 3441
    //   2501: aload_0
    //   2502: instanceof net/minecraft/server/level/ServerLevel
    //   2505: ifeq -> 2604
    //   2508: aload_0
    //   2509: checkcast net/minecraft/server/level/ServerLevel
    //   2512: astore #15
    //   2514: new net/ltxprogrammer/turned/entity/DarkLatexFoxScientistEntity
    //   2517: dup
    //   2518: getstatic net/ltxprogrammer/turned/init/LatexModEntities.DARK_LATEX_FOX_SCIENTIST : Lnet/minecraftforge/registries/RegistryObject;
    //   2521: invokevirtual get : ()Ljava/lang/Object;
    //   2524: checkcast net/minecraft/world/entity/EntityType
    //   2527: aload #15
    //   2529: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   2532: astore #16
    //   2534: aload #16
    //   2536: dload_1
    //   2537: dload_3
    //   2538: dload #5
    //   2540: aload_0
    //   2541: invokeinterface m_5822_ : ()Ljava/util/Random;
    //   2546: invokevirtual nextFloat : ()F
    //   2549: ldc 360.0
    //   2551: fmul
    //   2552: fconst_0
    //   2553: invokevirtual m_7678_ : (DDDFF)V
    //   2556: aload #16
    //   2558: instanceof net/minecraft/world/entity/Mob
    //   2561: ifeq -> 2595
    //   2564: aload #16
    //   2566: checkcast net/minecraft/world/entity/Mob
    //   2569: astore #17
    //   2571: aload #17
    //   2573: aload #15
    //   2575: aload_0
    //   2576: aload #16
    //   2578: invokevirtual m_142538_ : ()Lnet/minecraft/core/BlockPos;
    //   2581: invokeinterface m_6436_ : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   2586: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   2589: aconst_null
    //   2590: aconst_null
    //   2591: invokevirtual m_6518_ : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   2594: pop
    //   2595: aload_0
    //   2596: aload #16
    //   2598: invokeinterface m_7967_ : (Lnet/minecraft/world/entity/Entity;)Z
    //   2603: pop
    //   2604: goto -> 3441
    //   2607: aload #7
    //   2609: instanceof net/minecraft/world/entity/monster/Creeper
    //   2612: ifeq -> 2804
    //   2615: aload #7
    //   2617: getfield f_19853_ : Lnet/minecraft/world/level/Level;
    //   2620: invokevirtual m_5776_ : ()Z
    //   2623: ifne -> 2631
    //   2626: aload #7
    //   2628: invokevirtual m_146870_ : ()V
    //   2631: aload_0
    //   2632: instanceof net/minecraft/world/level/Level
    //   2635: ifeq -> 2698
    //   2638: aload_0
    //   2639: checkcast net/minecraft/world/level/Level
    //   2642: astore #15
    //   2644: aload #15
    //   2646: invokevirtual m_5776_ : ()Z
    //   2649: ifne -> 2680
    //   2652: aload #15
    //   2654: aconst_null
    //   2655: new net/minecraft/core/BlockPos
    //   2658: dup
    //   2659: dload_1
    //   2660: dload_3
    //   2661: dload #5
    //   2663: invokespecial <init> : (DDD)V
    //   2666: getstatic net/ltxprogrammer/changed/init/ChangedSounds.POISON : Lnet/minecraft/sounds/SoundEvent;
    //   2669: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   2672: fconst_1
    //   2673: fconst_1
    //   2674: invokevirtual m_5594_ : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   2677: goto -> 2698
    //   2680: aload #15
    //   2682: dload_1
    //   2683: dload_3
    //   2684: dload #5
    //   2686: getstatic net/ltxprogrammer/changed/init/ChangedSounds.POISON : Lnet/minecraft/sounds/SoundEvent;
    //   2689: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   2692: fconst_1
    //   2693: fconst_1
    //   2694: iconst_0
    //   2695: invokevirtual m_7785_ : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   2698: aload_0
    //   2699: instanceof net/minecraft/server/level/ServerLevel
    //   2702: ifeq -> 2801
    //   2705: aload_0
    //   2706: checkcast net/minecraft/server/level/ServerLevel
    //   2709: astore #15
    //   2711: new net/ltxprogrammer/turned/entity/DarkLatexCreeperEntity
    //   2714: dup
    //   2715: getstatic net/ltxprogrammer/turned/init/LatexModEntities.DARK_LATEX_CREEPER : Lnet/minecraftforge/registries/RegistryObject;
    //   2718: invokevirtual get : ()Ljava/lang/Object;
    //   2721: checkcast net/minecraft/world/entity/EntityType
    //   2724: aload #15
    //   2726: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   2729: astore #16
    //   2731: aload #16
    //   2733: dload_1
    //   2734: dload_3
    //   2735: dload #5
    //   2737: aload_0
    //   2738: invokeinterface m_5822_ : ()Ljava/util/Random;
    //   2743: invokevirtual nextFloat : ()F
    //   2746: ldc 360.0
    //   2748: fmul
    //   2749: fconst_0
    //   2750: invokevirtual m_7678_ : (DDDFF)V
    //   2753: aload #16
    //   2755: instanceof net/minecraft/world/entity/Mob
    //   2758: ifeq -> 2792
    //   2761: aload #16
    //   2763: checkcast net/minecraft/world/entity/Mob
    //   2766: astore #17
    //   2768: aload #17
    //   2770: aload #15
    //   2772: aload_0
    //   2773: aload #16
    //   2775: invokevirtual m_142538_ : ()Lnet/minecraft/core/BlockPos;
    //   2778: invokeinterface m_6436_ : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   2783: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   2786: aconst_null
    //   2787: aconst_null
    //   2788: invokevirtual m_6518_ : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   2791: pop
    //   2792: aload_0
    //   2793: aload #16
    //   2795: invokeinterface m_7967_ : (Lnet/minecraft/world/entity/Entity;)Z
    //   2800: pop
    //   2801: goto -> 3441
    //   2804: aload #7
    //   2806: invokevirtual m_6095_ : ()Lnet/minecraft/world/entity/EntityType;
    //   2809: getstatic net/minecraft/core/Registry.f_122903_ : Lnet/minecraft/resources/ResourceKey;
    //   2812: new net/minecraft/resources/ResourceLocation
    //   2815: dup
    //   2816: ldc_w 'turned:darklatexes'
    //   2819: invokespecial <init> : (Ljava/lang/String;)V
    //   2822: invokestatic m_203882_ : (Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraft/tags/TagKey;
    //   2825: invokevirtual m_204039_ : (Lnet/minecraft/tags/TagKey;)Z
    //   2828: iconst_1
    //   2829: if_icmpeq -> 3441
    //   2832: invokestatic random : ()D
    //   2835: ldc2_w 0.1
    //   2838: dcmpg
    //   2839: ifge -> 3031
    //   2842: aload #7
    //   2844: getfield f_19853_ : Lnet/minecraft/world/level/Level;
    //   2847: invokevirtual m_5776_ : ()Z
    //   2850: ifne -> 2858
    //   2853: aload #7
    //   2855: invokevirtual m_146870_ : ()V
    //   2858: aload_0
    //   2859: instanceof net/minecraft/world/level/Level
    //   2862: ifeq -> 2925
    //   2865: aload_0
    //   2866: checkcast net/minecraft/world/level/Level
    //   2869: astore #15
    //   2871: aload #15
    //   2873: invokevirtual m_5776_ : ()Z
    //   2876: ifne -> 2907
    //   2879: aload #15
    //   2881: aconst_null
    //   2882: new net/minecraft/core/BlockPos
    //   2885: dup
    //   2886: dload_1
    //   2887: dload_3
    //   2888: dload #5
    //   2890: invokespecial <init> : (DDD)V
    //   2893: getstatic net/ltxprogrammer/changed/init/ChangedSounds.POISON : Lnet/minecraft/sounds/SoundEvent;
    //   2896: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   2899: fconst_1
    //   2900: fconst_1
    //   2901: invokevirtual m_5594_ : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   2904: goto -> 2925
    //   2907: aload #15
    //   2909: dload_1
    //   2910: dload_3
    //   2911: dload #5
    //   2913: getstatic net/ltxprogrammer/changed/init/ChangedSounds.POISON : Lnet/minecraft/sounds/SoundEvent;
    //   2916: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   2919: fconst_1
    //   2920: fconst_1
    //   2921: iconst_0
    //   2922: invokevirtual m_7785_ : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   2925: aload_0
    //   2926: instanceof net/minecraft/server/level/ServerLevel
    //   2929: ifeq -> 3028
    //   2932: aload_0
    //   2933: checkcast net/minecraft/server/level/ServerLevel
    //   2936: astore #15
    //   2938: new net/ltxprogrammer/changed/entity/beast/DarkLatexYufeng
    //   2941: dup
    //   2942: getstatic net/ltxprogrammer/changed/init/ChangedEntities.DARK_LATEX_YUFENG : Lnet/minecraftforge/registries/RegistryObject;
    //   2945: invokevirtual get : ()Ljava/lang/Object;
    //   2948: checkcast net/minecraft/world/entity/EntityType
    //   2951: aload #15
    //   2953: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   2956: astore #16
    //   2958: aload #16
    //   2960: dload_1
    //   2961: dload_3
    //   2962: dload #5
    //   2964: aload_0
    //   2965: invokeinterface m_5822_ : ()Ljava/util/Random;
    //   2970: invokevirtual nextFloat : ()F
    //   2973: ldc 360.0
    //   2975: fmul
    //   2976: fconst_0
    //   2977: invokevirtual m_7678_ : (DDDFF)V
    //   2980: aload #16
    //   2982: instanceof net/minecraft/world/entity/Mob
    //   2985: ifeq -> 3019
    //   2988: aload #16
    //   2990: checkcast net/minecraft/world/entity/Mob
    //   2993: astore #17
    //   2995: aload #17
    //   2997: aload #15
    //   2999: aload_0
    //   3000: aload #16
    //   3002: invokevirtual m_142538_ : ()Lnet/minecraft/core/BlockPos;
    //   3005: invokeinterface m_6436_ : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   3010: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   3013: aconst_null
    //   3014: aconst_null
    //   3015: invokevirtual m_6518_ : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   3018: pop
    //   3019: aload_0
    //   3020: aload #16
    //   3022: invokeinterface m_7967_ : (Lnet/minecraft/world/entity/Entity;)Z
    //   3027: pop
    //   3028: goto -> 3441
    //   3031: invokestatic random : ()D
    //   3034: ldc2_w 0.2
    //   3037: dcmpg
    //   3038: ifge -> 3246
    //   3041: aload #7
    //   3043: getfield f_19853_ : Lnet/minecraft/world/level/Level;
    //   3046: invokevirtual m_5776_ : ()Z
    //   3049: ifne -> 3057
    //   3052: aload #7
    //   3054: invokevirtual m_146870_ : ()V
    //   3057: aload #8
    //   3059: getfield f_19853_ : Lnet/minecraft/world/level/Level;
    //   3062: invokevirtual m_5776_ : ()Z
    //   3065: ifne -> 3073
    //   3068: aload #8
    //   3070: invokevirtual m_146870_ : ()V
    //   3073: aload_0
    //   3074: instanceof net/minecraft/world/level/Level
    //   3077: ifeq -> 3140
    //   3080: aload_0
    //   3081: checkcast net/minecraft/world/level/Level
    //   3084: astore #15
    //   3086: aload #15
    //   3088: invokevirtual m_5776_ : ()Z
    //   3091: ifne -> 3122
    //   3094: aload #15
    //   3096: aconst_null
    //   3097: new net/minecraft/core/BlockPos
    //   3100: dup
    //   3101: dload_1
    //   3102: dload_3
    //   3103: dload #5
    //   3105: invokespecial <init> : (DDD)V
    //   3108: getstatic net/ltxprogrammer/changed/init/ChangedSounds.POISON : Lnet/minecraft/sounds/SoundEvent;
    //   3111: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   3114: fconst_1
    //   3115: fconst_1
    //   3116: invokevirtual m_5594_ : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   3119: goto -> 3140
    //   3122: aload #15
    //   3124: dload_1
    //   3125: dload_3
    //   3126: dload #5
    //   3128: getstatic net/ltxprogrammer/changed/init/ChangedSounds.POISON : Lnet/minecraft/sounds/SoundEvent;
    //   3131: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   3134: fconst_1
    //   3135: fconst_1
    //   3136: iconst_0
    //   3137: invokevirtual m_7785_ : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   3140: aload_0
    //   3141: instanceof net/minecraft/server/level/ServerLevel
    //   3144: ifeq -> 3243
    //   3147: aload_0
    //   3148: checkcast net/minecraft/server/level/ServerLevel
    //   3151: astore #15
    //   3153: new net/ltxprogrammer/turned/entity/DarkLatexCentaurEntity
    //   3156: dup
    //   3157: getstatic net/ltxprogrammer/turned/init/LatexModEntities.DARK_LATEX_CENTAUR : Lnet/minecraftforge/registries/RegistryObject;
    //   3160: invokevirtual get : ()Ljava/lang/Object;
    //   3163: checkcast net/minecraft/world/entity/EntityType
    //   3166: aload #15
    //   3168: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   3171: astore #16
    //   3173: aload #16
    //   3175: dload_1
    //   3176: dload_3
    //   3177: dload #5
    //   3179: aload_0
    //   3180: invokeinterface m_5822_ : ()Ljava/util/Random;
    //   3185: invokevirtual nextFloat : ()F
    //   3188: ldc 360.0
    //   3190: fmul
    //   3191: fconst_0
    //   3192: invokevirtual m_7678_ : (DDDFF)V
    //   3195: aload #16
    //   3197: instanceof net/minecraft/world/entity/Mob
    //   3200: ifeq -> 3234
    //   3203: aload #16
    //   3205: checkcast net/minecraft/world/entity/Mob
    //   3208: astore #17
    //   3210: aload #17
    //   3212: aload #15
    //   3214: aload_0
    //   3215: aload #16
    //   3217: invokevirtual m_142538_ : ()Lnet/minecraft/core/BlockPos;
    //   3220: invokeinterface m_6436_ : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   3225: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   3228: aconst_null
    //   3229: aconst_null
    //   3230: invokevirtual m_6518_ : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   3233: pop
    //   3234: aload_0
    //   3235: aload #16
    //   3237: invokeinterface m_7967_ : (Lnet/minecraft/world/entity/Entity;)Z
    //   3242: pop
    //   3243: goto -> 3441
    //   3246: aload #7
    //   3248: getfield f_19853_ : Lnet/minecraft/world/level/Level;
    //   3251: invokevirtual m_5776_ : ()Z
    //   3254: ifne -> 3262
    //   3257: aload #7
    //   3259: invokevirtual m_146870_ : ()V
    //   3262: aload_0
    //   3263: instanceof net/minecraft/world/level/Level
    //   3266: ifeq -> 3329
    //   3269: aload_0
    //   3270: checkcast net/minecraft/world/level/Level
    //   3273: astore #15
    //   3275: aload #15
    //   3277: invokevirtual m_5776_ : ()Z
    //   3280: ifne -> 3311
    //   3283: aload #15
    //   3285: aconst_null
    //   3286: new net/minecraft/core/BlockPos
    //   3289: dup
    //   3290: dload_1
    //   3291: dload_3
    //   3292: dload #5
    //   3294: invokespecial <init> : (DDD)V
    //   3297: getstatic net/ltxprogrammer/changed/init/ChangedSounds.POISON : Lnet/minecraft/sounds/SoundEvent;
    //   3300: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   3303: fconst_1
    //   3304: fconst_1
    //   3305: invokevirtual m_5594_ : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   3308: goto -> 3329
    //   3311: aload #15
    //   3313: dload_1
    //   3314: dload_3
    //   3315: dload #5
    //   3317: getstatic net/ltxprogrammer/changed/init/ChangedSounds.POISON : Lnet/minecraft/sounds/SoundEvent;
    //   3320: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   3323: fconst_1
    //   3324: fconst_1
    //   3325: iconst_0
    //   3326: invokevirtual m_7785_ : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   3329: aload_0
    //   3330: instanceof net/minecraft/server/level/ServerLevel
    //   3333: ifeq -> 3432
    //   3336: aload_0
    //   3337: checkcast net/minecraft/server/level/ServerLevel
    //   3340: astore #15
    //   3342: new net/ltxprogrammer/turned/entity/DarklatexEntity
    //   3345: dup
    //   3346: getstatic net/ltxprogrammer/turned/init/LatexModEntities.DARKLATEX : Lnet/minecraftforge/registries/RegistryObject;
    //   3349: invokevirtual get : ()Ljava/lang/Object;
    //   3352: checkcast net/minecraft/world/entity/EntityType
    //   3355: aload #15
    //   3357: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   3360: astore #16
    //   3362: aload #16
    //   3364: dload_1
    //   3365: dload_3
    //   3366: dload #5
    //   3368: aload_0
    //   3369: invokeinterface m_5822_ : ()Ljava/util/Random;
    //   3374: invokevirtual nextFloat : ()F
    //   3377: ldc 360.0
    //   3379: fmul
    //   3380: fconst_0
    //   3381: invokevirtual m_7678_ : (DDDFF)V
    //   3384: aload #16
    //   3386: instanceof net/minecraft/world/entity/Mob
    //   3389: ifeq -> 3423
    //   3392: aload #16
    //   3394: checkcast net/minecraft/world/entity/Mob
    //   3397: astore #17
    //   3399: aload #17
    //   3401: aload #15
    //   3403: aload_0
    //   3404: aload #16
    //   3406: invokevirtual m_142538_ : ()Lnet/minecraft/core/BlockPos;
    //   3409: invokeinterface m_6436_ : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   3414: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   3417: aconst_null
    //   3418: aconst_null
    //   3419: invokevirtual m_6518_ : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   3422: pop
    //   3423: aload_0
    //   3424: aload #16
    //   3426: invokeinterface m_7967_ : (Lnet/minecraft/world/entity/Entity;)Z
    //   3431: pop
    //   3432: goto -> 3441
    //   3435: aload #7
    //   3437: instanceof net/minecraft/world/entity/player/Player
    //   3440: ireturn
    //   3441: iconst_0
    //   3442: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #38	-> 0
    //   #39	-> 10
    //   #40	-> 12
    //   #41	-> 15
    //   #42	-> 36
    //   #43	-> 65
    //   #44	-> 77
    //   #45	-> 106
    //   #46	-> 118
    //   #47	-> 147
    //   #48	-> 159
    //   #49	-> 188
    //   #50	-> 209
    //   #52	-> 243
    //   #53	-> 245
    //   #54	-> 254
    //   #55	-> 264
    //   #56	-> 275
    //   #57	-> 280
    //   #58	-> 293
    //   #59	-> 301
    //   #62	-> 329
    //   #66	-> 347
    //   #67	-> 360
    //   #68	-> 380
    //   #69	-> 402
    //   #70	-> 417
    //   #72	-> 441
    //   #73	-> 450
    //   #74	-> 453
    //   #75	-> 463
    //   #76	-> 474
    //   #77	-> 479
    //   #78	-> 492
    //   #79	-> 500
    //   #82	-> 528
    //   #86	-> 546
    //   #87	-> 559
    //   #88	-> 579
    //   #89	-> 601
    //   #90	-> 616
    //   #92	-> 640
    //   #93	-> 649
    //   #94	-> 652
    //   #95	-> 662
    //   #96	-> 673
    //   #97	-> 678
    //   #98	-> 691
    //   #99	-> 699
    //   #102	-> 727
    //   #106	-> 745
    //   #107	-> 758
    //   #108	-> 778
    //   #109	-> 800
    //   #110	-> 815
    //   #112	-> 839
    //   #113	-> 848
    //   #115	-> 851
    //   #116	-> 862
    //   #117	-> 867
    //   #118	-> 878
    //   #119	-> 883
    //   #120	-> 896
    //   #121	-> 904
    //   #124	-> 932
    //   #128	-> 950
    //   #129	-> 963
    //   #130	-> 983
    //   #131	-> 1005
    //   #132	-> 1020
    //   #134	-> 1044
    //   #135	-> 1053
    //   #137	-> 1056
    //   #138	-> 1065
    //   #139	-> 1075
    //   #140	-> 1086
    //   #141	-> 1091
    //   #142	-> 1104
    //   #143	-> 1112
    //   #146	-> 1140
    //   #150	-> 1158
    //   #151	-> 1171
    //   #152	-> 1191
    //   #153	-> 1213
    //   #154	-> 1228
    //   #156	-> 1252
    //   #157	-> 1261
    //   #158	-> 1264
    //   #159	-> 1274
    //   #160	-> 1285
    //   #161	-> 1290
    //   #162	-> 1303
    //   #163	-> 1311
    //   #166	-> 1339
    //   #170	-> 1357
    //   #171	-> 1370
    //   #172	-> 1390
    //   #173	-> 1412
    //   #174	-> 1427
    //   #176	-> 1451
    //   #177	-> 1460
    //   #179	-> 1463
    //   #180	-> 1474
    //   #181	-> 1479
    //   #182	-> 1490
    //   #183	-> 1495
    //   #184	-> 1508
    //   #185	-> 1516
    //   #188	-> 1544
    //   #192	-> 1562
    //   #193	-> 1575
    //   #194	-> 1595
    //   #195	-> 1617
    //   #196	-> 1632
    //   #198	-> 1656
    //   #199	-> 1665
    //   #201	-> 1668
    //   #202	-> 1677
    //   #203	-> 1688
    //   #204	-> 1693
    //   #205	-> 1706
    //   #206	-> 1714
    //   #209	-> 1742
    //   #213	-> 1760
    //   #214	-> 1773
    //   #215	-> 1793
    //   #216	-> 1815
    //   #217	-> 1830
    //   #219	-> 1854
    //   #220	-> 1863
    //   #221	-> 1866
    //   #222	-> 1891
    //   #223	-> 1902
    //   #224	-> 1907
    //   #225	-> 1920
    //   #226	-> 1928
    //   #229	-> 1956
    //   #233	-> 1974
    //   #234	-> 1987
    //   #235	-> 2007
    //   #236	-> 2029
    //   #237	-> 2044
    //   #239	-> 2068
    //   #240	-> 2077
    //   #241	-> 2080
    //   #242	-> 2089
    //   #243	-> 2100
    //   #244	-> 2105
    //   #245	-> 2118
    //   #246	-> 2126
    //   #249	-> 2154
    //   #253	-> 2172
    //   #254	-> 2185
    //   #255	-> 2205
    //   #256	-> 2227
    //   #257	-> 2242
    //   #259	-> 2266
    //   #260	-> 2275
    //   #261	-> 2278
    //   #262	-> 2302
    //   #263	-> 2313
    //   #264	-> 2318
    //   #265	-> 2331
    //   #266	-> 2339
    //   #269	-> 2367
    //   #273	-> 2385
    //   #274	-> 2395
    //   #275	-> 2408
    //   #276	-> 2428
    //   #277	-> 2450
    //   #278	-> 2465
    //   #280	-> 2489
    //   #281	-> 2498
    //   #283	-> 2501
    //   #284	-> 2514
    //   #285	-> 2534
    //   #286	-> 2556
    //   #287	-> 2571
    //   #289	-> 2595
    //   #290	-> 2604
    //   #292	-> 2607
    //   #293	-> 2615
    //   #294	-> 2626
    //   #295	-> 2631
    //   #296	-> 2644
    //   #297	-> 2652
    //   #300	-> 2680
    //   #304	-> 2698
    //   #305	-> 2711
    //   #306	-> 2731
    //   #307	-> 2753
    //   #308	-> 2768
    //   #310	-> 2792
    //   #311	-> 2801
    //   #312	-> 2804
    //   #313	-> 2832
    //   #314	-> 2842
    //   #315	-> 2853
    //   #316	-> 2858
    //   #317	-> 2871
    //   #318	-> 2879
    //   #321	-> 2907
    //   #325	-> 2925
    //   #326	-> 2938
    //   #327	-> 2958
    //   #328	-> 2980
    //   #329	-> 2995
    //   #331	-> 3019
    //   #332	-> 3028
    //   #333	-> 3031
    //   #334	-> 3041
    //   #335	-> 3052
    //   #336	-> 3057
    //   #337	-> 3068
    //   #338	-> 3073
    //   #339	-> 3086
    //   #340	-> 3094
    //   #343	-> 3122
    //   #347	-> 3140
    //   #348	-> 3153
    //   #349	-> 3173
    //   #350	-> 3195
    //   #351	-> 3210
    //   #353	-> 3234
    //   #354	-> 3243
    //   #356	-> 3246
    //   #357	-> 3257
    //   #358	-> 3262
    //   #359	-> 3275
    //   #360	-> 3283
    //   #363	-> 3311
    //   #367	-> 3329
    //   #368	-> 3342
    //   #369	-> 3362
    //   #370	-> 3384
    //   #371	-> 3399
    //   #373	-> 3423
    //   #374	-> 3432
    //   #377	-> 3435
    //   #379	-> 3441
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   51	11	11	_entGetArmor	Lnet/minecraft/world/entity/LivingEntity;
    //   92	11	12	_entGetArmor	Lnet/minecraft/world/entity/LivingEntity;
    //   133	11	13	_entGetArmor	Lnet/minecraft/world/entity/LivingEntity;
    //   174	11	14	_entGetArmor	Lnet/minecraft/world/entity/LivingEntity;
    //   293	54	15	_level	Lnet/minecraft/world/level/Level;
    //   417	24	17	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   380	70	16	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   360	90	15	_level	Lnet/minecraft/server/level/ServerLevel;
    //   492	54	15	_level	Lnet/minecraft/world/level/Level;
    //   616	24	17	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   579	70	16	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   559	90	15	_level	Lnet/minecraft/server/level/ServerLevel;
    //   691	54	15	_level	Lnet/minecraft/world/level/Level;
    //   815	24	17	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   778	70	16	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   758	90	15	_level	Lnet/minecraft/server/level/ServerLevel;
    //   896	54	15	_level	Lnet/minecraft/world/level/Level;
    //   1020	24	17	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   983	70	16	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   963	90	15	_level	Lnet/minecraft/server/level/ServerLevel;
    //   1104	54	15	_level	Lnet/minecraft/world/level/Level;
    //   1228	24	17	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   1191	70	16	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   1171	90	15	_level	Lnet/minecraft/server/level/ServerLevel;
    //   1303	54	15	_level	Lnet/minecraft/world/level/Level;
    //   1427	24	17	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   1390	70	16	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   1370	90	15	_level	Lnet/minecraft/server/level/ServerLevel;
    //   1508	54	15	_level	Lnet/minecraft/world/level/Level;
    //   1632	24	17	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   1595	70	16	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   1575	90	15	_level	Lnet/minecraft/server/level/ServerLevel;
    //   1706	54	15	_level	Lnet/minecraft/world/level/Level;
    //   1830	24	17	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   1793	70	16	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   1773	90	15	_level	Lnet/minecraft/server/level/ServerLevel;
    //   1920	54	15	_level	Lnet/minecraft/world/level/Level;
    //   2044	24	17	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   2007	70	16	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   1987	90	15	_level	Lnet/minecraft/server/level/ServerLevel;
    //   2118	54	15	_level	Lnet/minecraft/world/level/Level;
    //   2242	24	17	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   2205	70	16	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   2185	90	15	_level	Lnet/minecraft/server/level/ServerLevel;
    //   2331	54	15	_level	Lnet/minecraft/world/level/Level;
    //   2465	24	17	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   2428	70	16	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   2408	90	15	_level	Lnet/minecraft/server/level/ServerLevel;
    //   2571	24	17	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   2534	70	16	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   2514	90	15	_level	Lnet/minecraft/server/level/ServerLevel;
    //   2644	54	15	_level	Lnet/minecraft/world/level/Level;
    //   2768	24	17	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   2731	70	16	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   2711	90	15	_level	Lnet/minecraft/server/level/ServerLevel;
    //   2871	54	15	_level	Lnet/minecraft/world/level/Level;
    //   2995	24	17	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   2958	70	16	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   2938	90	15	_level	Lnet/minecraft/server/level/ServerLevel;
    //   3086	54	15	_level	Lnet/minecraft/world/level/Level;
    //   3210	24	17	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   3173	70	16	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   3153	90	15	_level	Lnet/minecraft/server/level/ServerLevel;
    //   3275	54	15	_level	Lnet/minecraft/world/level/Level;
    //   3399	24	17	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   3362	70	16	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   3342	90	15	_level	Lnet/minecraft/server/level/ServerLevel;
    //   0	3443	0	world	Lnet/minecraft/world/level/LevelAccessor;
    //   0	3443	1	x	D
    //   0	3443	3	y	D
    //   0	3443	5	z	D
    //   0	3443	7	entity	Lnet/minecraft/world/entity/Entity;
    //   0	3443	8	sourceentity	Lnet/minecraft/world/entity/Entity;
    //   15	3428	9	entitykills	D
  }
}


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\DarklatexThisEntityKillsAnotherOneProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */