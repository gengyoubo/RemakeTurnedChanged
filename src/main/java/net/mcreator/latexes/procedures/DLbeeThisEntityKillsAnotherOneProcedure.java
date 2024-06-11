package net.mcreator.latexes.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.LevelAccessor;

public class DLbeeThisEntityKillsAnotherOneProcedure {
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
    //   33: if_icmpne -> 945
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
    //   206: if_icmpeq -> 945
    //   209: aload #7
    //   211: instanceof net/minecraft/world/entity/animal/IronGolem
    //   214: ifne -> 233
    //   217: aload #7
    //   219: instanceof net/minecraft/world/entity/player/Player
    //   222: ifne -> 233
    //   225: aload #7
    //   227: instanceof net/mcreator/latexes/entity/HertxEntity
    //   230: ifeq -> 235
    //   233: iconst_1
    //   234: ireturn
    //   235: aload #7
    //   237: instanceof net/minecraft/world/entity/animal/WaterAnimal
    //   240: iconst_1
    //   241: if_icmpne -> 716
    //   244: invokestatic random : ()D
    //   247: ldc2_w 0.3
    //   250: dcmpg
    //   251: ifge -> 477
    //   254: aload #7
    //   256: getfield level : Lnet/minecraft/world/level/Level;
    //   259: invokevirtual isClientSide : ()Z
    //   262: ifne -> 270
    //   265: aload #7
    //   267: invokevirtual discard : ()V
    //   270: aload_0
    //   271: instanceof net/minecraft/world/level/Level
    //   274: ifeq -> 371
    //   277: aload_0
    //   278: checkcast net/minecraft/world/level/Level
    //   281: astore #15
    //   283: aload #15
    //   285: invokevirtual isClientSide : ()Z
    //   288: ifne -> 336
    //   291: aload #15
    //   293: aconst_null
    //   294: new net/minecraft/core/BlockPos
    //   297: dup
    //   298: dload_1
    //   299: dload_3
    //   300: dload #5
    //   302: invokespecial <init> : (DDD)V
    //   305: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   308: new net/minecraft/resources/ResourceLocation
    //   311: dup
    //   312: ldc 'latex:transfur'
    //   314: invokespecial <init> : (Ljava/lang/String;)V
    //   317: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   322: checkcast net/minecraft/sounds/SoundEvent
    //   325: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   328: fconst_1
    //   329: fconst_1
    //   330: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   333: goto -> 371
    //   336: aload #15
    //   338: dload_1
    //   339: dload_3
    //   340: dload #5
    //   342: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   345: new net/minecraft/resources/ResourceLocation
    //   348: dup
    //   349: ldc 'latex:transfur'
    //   351: invokespecial <init> : (Ljava/lang/String;)V
    //   354: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   359: checkcast net/minecraft/sounds/SoundEvent
    //   362: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   365: fconst_1
    //   366: fconst_1
    //   367: iconst_0
    //   368: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   371: aload_0
    //   372: instanceof net/minecraft/server/level/ServerLevel
    //   375: ifeq -> 474
    //   378: aload_0
    //   379: checkcast net/minecraft/server/level/ServerLevel
    //   382: astore #15
    //   384: new net/mcreator/latexes/entity/DlsharkEntity
    //   387: dup
    //   388: getstatic net/mcreator/latexes/init/LatexModEntities.DLSHARK : Lnet/minecraftforge/registries/RegistryObject;
    //   391: invokevirtual get : ()Ljava/lang/Object;
    //   394: checkcast net/minecraft/world/entity/EntityType
    //   397: aload #15
    //   399: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   402: astore #16
    //   404: aload #16
    //   406: dload_1
    //   407: dload_3
    //   408: dload #5
    //   410: aload_0
    //   411: invokeinterface getRandom : ()Ljava/util/Random;
    //   416: invokevirtual nextFloat : ()F
    //   419: ldc 360.0
    //   421: fmul
    //   422: fconst_0
    //   423: invokevirtual moveTo : (DDDFF)V
    //   426: aload #16
    //   428: instanceof net/minecraft/world/entity/Mob
    //   431: ifeq -> 465
    //   434: aload #16
    //   436: checkcast net/minecraft/world/entity/Mob
    //   439: astore #17
    //   441: aload #17
    //   443: aload #15
    //   445: aload_0
    //   446: aload #16
    //   448: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   451: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   456: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   459: aconst_null
    //   460: aconst_null
    //   461: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   464: pop
    //   465: aload_0
    //   466: aload #16
    //   468: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   473: pop
    //   474: goto -> 945
    //   477: aload #7
    //   479: getfield level : Lnet/minecraft/world/level/Level;
    //   482: invokevirtual isClientSide : ()Z
    //   485: ifne -> 493
    //   488: aload #7
    //   490: invokevirtual discard : ()V
    //   493: aload #8
    //   495: getfield level : Lnet/minecraft/world/level/Level;
    //   498: invokevirtual isClientSide : ()Z
    //   501: ifne -> 509
    //   504: aload #8
    //   506: invokevirtual discard : ()V
    //   509: aload_0
    //   510: instanceof net/minecraft/world/level/Level
    //   513: ifeq -> 610
    //   516: aload_0
    //   517: checkcast net/minecraft/world/level/Level
    //   520: astore #15
    //   522: aload #15
    //   524: invokevirtual isClientSide : ()Z
    //   527: ifne -> 575
    //   530: aload #15
    //   532: aconst_null
    //   533: new net/minecraft/core/BlockPos
    //   536: dup
    //   537: dload_1
    //   538: dload_3
    //   539: dload #5
    //   541: invokespecial <init> : (DDD)V
    //   544: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   547: new net/minecraft/resources/ResourceLocation
    //   550: dup
    //   551: ldc 'latex:transfur'
    //   553: invokespecial <init> : (Ljava/lang/String;)V
    //   556: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   561: checkcast net/minecraft/sounds/SoundEvent
    //   564: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   567: fconst_1
    //   568: fconst_1
    //   569: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   572: goto -> 610
    //   575: aload #15
    //   577: dload_1
    //   578: dload_3
    //   579: dload #5
    //   581: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   584: new net/minecraft/resources/ResourceLocation
    //   587: dup
    //   588: ldc 'latex:transfur'
    //   590: invokespecial <init> : (Ljava/lang/String;)V
    //   593: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   598: checkcast net/minecraft/sounds/SoundEvent
    //   601: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   604: fconst_1
    //   605: fconst_1
    //   606: iconst_0
    //   607: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   610: aload_0
    //   611: instanceof net/minecraft/server/level/ServerLevel
    //   614: ifeq -> 713
    //   617: aload_0
    //   618: checkcast net/minecraft/server/level/ServerLevel
    //   621: astore #15
    //   623: new net/mcreator/latexes/entity/DlsharkEntity
    //   626: dup
    //   627: getstatic net/mcreator/latexes/init/LatexModEntities.DLSHARK : Lnet/minecraftforge/registries/RegistryObject;
    //   630: invokevirtual get : ()Ljava/lang/Object;
    //   633: checkcast net/minecraft/world/entity/EntityType
    //   636: aload #15
    //   638: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   641: astore #16
    //   643: aload #16
    //   645: dload_1
    //   646: dload_3
    //   647: dload #5
    //   649: aload_0
    //   650: invokeinterface getRandom : ()Ljava/util/Random;
    //   655: invokevirtual nextFloat : ()F
    //   658: ldc 360.0
    //   660: fmul
    //   661: fconst_0
    //   662: invokevirtual moveTo : (DDDFF)V
    //   665: aload #16
    //   667: instanceof net/minecraft/world/entity/Mob
    //   670: ifeq -> 704
    //   673: aload #16
    //   675: checkcast net/minecraft/world/entity/Mob
    //   678: astore #17
    //   680: aload #17
    //   682: aload #15
    //   684: aload_0
    //   685: aload #16
    //   687: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   690: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   695: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   698: aconst_null
    //   699: aconst_null
    //   700: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   703: pop
    //   704: aload_0
    //   705: aload #16
    //   707: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   712: pop
    //   713: goto -> 945
    //   716: aload #7
    //   718: instanceof net/mcreator/latexes/entity/DarklatexEntity
    //   721: iconst_1
    //   722: if_icmpeq -> 945
    //   725: aload #7
    //   727: getfield level : Lnet/minecraft/world/level/Level;
    //   730: invokevirtual isClientSide : ()Z
    //   733: ifne -> 741
    //   736: aload #7
    //   738: invokevirtual discard : ()V
    //   741: aload_0
    //   742: instanceof net/minecraft/world/level/Level
    //   745: ifeq -> 842
    //   748: aload_0
    //   749: checkcast net/minecraft/world/level/Level
    //   752: astore #15
    //   754: aload #15
    //   756: invokevirtual isClientSide : ()Z
    //   759: ifne -> 807
    //   762: aload #15
    //   764: aconst_null
    //   765: new net/minecraft/core/BlockPos
    //   768: dup
    //   769: dload_1
    //   770: dload_3
    //   771: dload #5
    //   773: invokespecial <init> : (DDD)V
    //   776: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   779: new net/minecraft/resources/ResourceLocation
    //   782: dup
    //   783: ldc 'latex:transfur'
    //   785: invokespecial <init> : (Ljava/lang/String;)V
    //   788: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   793: checkcast net/minecraft/sounds/SoundEvent
    //   796: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   799: fconst_1
    //   800: fconst_1
    //   801: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
    //   804: goto -> 842
    //   807: aload #15
    //   809: dload_1
    //   810: dload_3
    //   811: dload #5
    //   813: getstatic net/minecraftforge/registries/ForgeRegistries.SOUND_EVENTS : Lnet/minecraftforge/registries/IForgeRegistry;
    //   816: new net/minecraft/resources/ResourceLocation
    //   819: dup
    //   820: ldc 'latex:transfur'
    //   822: invokespecial <init> : (Ljava/lang/String;)V
    //   825: invokeinterface getValue : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraftforge/registries/IForgeRegistryEntry;
    //   830: checkcast net/minecraft/sounds/SoundEvent
    //   833: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
    //   836: fconst_1
    //   837: fconst_1
    //   838: iconst_0
    //   839: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
    //   842: aload_0
    //   843: instanceof net/minecraft/server/level/ServerLevel
    //   846: ifeq -> 945
    //   849: aload_0
    //   850: checkcast net/minecraft/server/level/ServerLevel
    //   853: astore #15
    //   855: new net/mcreator/latexes/entity/DLbeeEntity
    //   858: dup
    //   859: getstatic net/mcreator/latexes/init/LatexModEntities.D_LBEE : Lnet/minecraftforge/registries/RegistryObject;
    //   862: invokevirtual get : ()Ljava/lang/Object;
    //   865: checkcast net/minecraft/world/entity/EntityType
    //   868: aload #15
    //   870: invokespecial <init> : (Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V
    //   873: astore #16
    //   875: aload #16
    //   877: dload_1
    //   878: dload_3
    //   879: dload #5
    //   881: aload_0
    //   882: invokeinterface getRandom : ()Ljava/util/Random;
    //   887: invokevirtual nextFloat : ()F
    //   890: ldc 360.0
    //   892: fmul
    //   893: fconst_0
    //   894: invokevirtual moveTo : (DDDFF)V
    //   897: aload #16
    //   899: instanceof net/minecraft/world/entity/Mob
    //   902: ifeq -> 936
    //   905: aload #16
    //   907: checkcast net/minecraft/world/entity/Mob
    //   910: astore #17
    //   912: aload #17
    //   914: aload #15
    //   916: aload_0
    //   917: aload #16
    //   919: invokevirtual blockPosition : ()Lnet/minecraft/core/BlockPos;
    //   922: invokeinterface getCurrentDifficultyAt : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/DifficultyInstance;
    //   927: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
    //   930: aconst_null
    //   931: aconst_null
    //   932: invokevirtual finalizeSpawn : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/MobSpawnType;Lnet/minecraft/world/entity/SpawnGroupData;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/world/entity/SpawnGroupData;
    //   935: pop
    //   936: aload_0
    //   937: aload #16
    //   939: invokeinterface addFreshEntity : (Lnet/minecraft/world/entity/Entity;)Z
    //   944: pop
    //   945: iconst_0
    //   946: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #31	-> 0
    //   #32	-> 10
    //   #33	-> 12
    //   #34	-> 15
    //   #35	-> 36
    //   #36	-> 65
    //   #37	-> 77
    //   #38	-> 106
    //   #39	-> 118
    //   #40	-> 147
    //   #41	-> 159
    //   #42	-> 188
    //   #43	-> 209
    //   #44	-> 233
    //   #45	-> 235
    //   #46	-> 244
    //   #47	-> 254
    //   #48	-> 265
    //   #49	-> 270
    //   #50	-> 283
    //   #51	-> 291
    //   #52	-> 317
    //   #51	-> 330
    //   #54	-> 336
    //   #58	-> 371
    //   #59	-> 384
    //   #60	-> 404
    //   #61	-> 426
    //   #62	-> 441
    //   #64	-> 465
    //   #65	-> 474
    //   #67	-> 477
    //   #68	-> 488
    //   #69	-> 493
    //   #70	-> 504
    //   #71	-> 509
    //   #72	-> 522
    //   #73	-> 530
    //   #74	-> 556
    //   #73	-> 569
    //   #76	-> 575
    //   #80	-> 610
    //   #81	-> 623
    //   #82	-> 643
    //   #83	-> 665
    //   #84	-> 680
    //   #86	-> 704
    //   #87	-> 713
    //   #89	-> 716
    //   #90	-> 725
    //   #91	-> 736
    //   #92	-> 741
    //   #93	-> 754
    //   #94	-> 762
    //   #95	-> 788
    //   #94	-> 801
    //   #97	-> 807
    //   #101	-> 842
    //   #102	-> 855
    //   #103	-> 875
    //   #104	-> 897
    //   #105	-> 912
    //   #107	-> 936
    //   #112	-> 945
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   51	11	11	_entGetArmor	Lnet/minecraft/world/entity/LivingEntity;
    //   92	11	12	_entGetArmor	Lnet/minecraft/world/entity/LivingEntity;
    //   133	11	13	_entGetArmor	Lnet/minecraft/world/entity/LivingEntity;
    //   174	11	14	_entGetArmor	Lnet/minecraft/world/entity/LivingEntity;
    //   283	88	15	_level	Lnet/minecraft/world/level/Level;
    //   441	24	17	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   404	70	16	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   384	90	15	_level	Lnet/minecraft/server/level/ServerLevel;
    //   522	88	15	_level	Lnet/minecraft/world/level/Level;
    //   680	24	17	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   643	70	16	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   623	90	15	_level	Lnet/minecraft/server/level/ServerLevel;
    //   754	88	15	_level	Lnet/minecraft/world/level/Level;
    //   912	24	17	_mobToSpawn	Lnet/minecraft/world/entity/Mob;
    //   875	70	16	entityToSpawn	Lnet/minecraft/world/entity/Entity;
    //   855	90	15	_level	Lnet/minecraft/server/level/ServerLevel;
    //   0	947	0	world	Lnet/minecraft/world/level/LevelAccessor;
    //   0	947	1	x	D
    //   0	947	3	y	D
    //   0	947	5	z	D
    //   0	947	7	entity	Lnet/minecraft/world/entity/Entity;
    //   0	947	8	sourceentity	Lnet/minecraft/world/entity/Entity;
    //   15	932	9	entitykills	D
  }
}


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\DLbeeThisEntityKillsAnotherOneProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */