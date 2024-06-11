/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ 
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ 
/*    */ public class M4AssaultRifleReloadProcedure {
/*    */   public static void execute(Entity entity) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: ifnonnull -> 5
/*    */     //   4: return
/*    */     //   5: aload_0
/*    */     //   6: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   9: ifeq -> 24
/*    */     //   12: aload_0
/*    */     //   13: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   16: astore_1
/*    */     //   17: aload_1
/*    */     //   18: invokevirtual m_21205_ : ()Lnet/minecraft/world/item/ItemStack;
/*    */     //   21: goto -> 27
/*    */     //   24: getstatic net/minecraft/world/item/ItemStack.f_41583_ : Lnet/minecraft/world/item/ItemStack;
/*    */     //   27: invokevirtual m_41720_ : ()Lnet/minecraft/world/item/Item;
/*    */     //   30: getstatic net/ltxprogrammer/turned/init/LatexModItems.M_4_ASSAULT_RIFLE : Lnet/minecraftforge/registries/RegistryObject;
/*    */     //   33: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   36: if_acmpeq -> 73
/*    */     //   39: aload_0
/*    */     //   40: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   43: ifeq -> 58
/*    */     //   46: aload_0
/*    */     //   47: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   50: astore_2
/*    */     //   51: aload_2
/*    */     //   52: invokevirtual m_21205_ : ()Lnet/minecraft/world/item/ItemStack;
/*    */     //   55: goto -> 61
/*    */     //   58: getstatic net/minecraft/world/item/ItemStack.f_41583_ : Lnet/minecraft/world/item/ItemStack;
/*    */     //   61: invokevirtual m_41720_ : ()Lnet/minecraft/world/item/Item;
/*    */     //   64: getstatic net/ltxprogrammer/turned/init/LatexModItems.SCRAP_M_16_RIFLE : Lnet/minecraftforge/registries/RegistryObject;
/*    */     //   67: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   70: if_acmpne -> 803
/*    */     //   73: aload_0
/*    */     //   74: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   77: ifeq -> 92
/*    */     //   80: aload_0
/*    */     //   81: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   84: astore_3
/*    */     //   85: aload_3
/*    */     //   86: invokevirtual m_21205_ : ()Lnet/minecraft/world/item/ItemStack;
/*    */     //   89: goto -> 95
/*    */     //   92: getstatic net/minecraft/world/item/ItemStack.f_41583_ : Lnet/minecraft/world/item/ItemStack;
/*    */     //   95: invokevirtual m_41784_ : ()Lnet/minecraft/nbt/CompoundTag;
/*    */     //   98: ldc 'ammo'
/*    */     //   100: invokevirtual m_128459_ : (Ljava/lang/String;)D
/*    */     //   103: ldc2_w 31.0
/*    */     //   106: dcmpg
/*    */     //   107: ifge -> 457
/*    */     //   110: aload_0
/*    */     //   111: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   114: ifeq -> 131
/*    */     //   117: aload_0
/*    */     //   118: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   121: astore #4
/*    */     //   123: aload #4
/*    */     //   125: invokevirtual m_21205_ : ()Lnet/minecraft/world/item/ItemStack;
/*    */     //   128: goto -> 134
/*    */     //   131: getstatic net/minecraft/world/item/ItemStack.f_41583_ : Lnet/minecraft/world/item/ItemStack;
/*    */     //   134: invokevirtual m_41784_ : ()Lnet/minecraft/nbt/CompoundTag;
/*    */     //   137: ldc 'ammo'
/*    */     //   139: invokevirtual m_128459_ : (Ljava/lang/String;)D
/*    */     //   142: dconst_1
/*    */     //   143: dcmpl
/*    */     //   144: ifle -> 457
/*    */     //   147: aload_0
/*    */     //   148: instanceof net/minecraft/world/entity/player/Player
/*    */     //   151: ifeq -> 454
/*    */     //   154: aload_0
/*    */     //   155: checkcast net/minecraft/world/entity/player/Player
/*    */     //   158: astore #6
/*    */     //   160: aload #6
/*    */     //   162: invokevirtual m_150109_ : ()Lnet/minecraft/world/entity/player/Inventory;
/*    */     //   165: new net/minecraft/world/item/ItemStack
/*    */     //   168: dup
/*    */     //   169: getstatic net/ltxprogrammer/turned/init/LatexModItems.RIFLE_AMMO : Lnet/minecraftforge/registries/RegistryObject;
/*    */     //   172: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   175: checkcast net/minecraft/world/level/ItemLike
/*    */     //   178: invokespecial <init> : (Lnet/minecraft/world/level/ItemLike;)V
/*    */     //   181: invokevirtual m_36063_ : (Lnet/minecraft/world/item/ItemStack;)Z
/*    */     //   184: ifeq -> 454
/*    */     //   187: aload_0
/*    */     //   188: instanceof net/minecraft/world/entity/player/Player
/*    */     //   191: ifeq -> 237
/*    */     //   194: aload_0
/*    */     //   195: checkcast net/minecraft/world/entity/player/Player
/*    */     //   198: astore #7
/*    */     //   200: aload #7
/*    */     //   202: invokevirtual m_36335_ : ()Lnet/minecraft/world/item/ItemCooldowns;
/*    */     //   205: aload_0
/*    */     //   206: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   209: ifeq -> 226
/*    */     //   212: aload_0
/*    */     //   213: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   216: astore #8
/*    */     //   218: aload #8
/*    */     //   220: invokevirtual m_21205_ : ()Lnet/minecraft/world/item/ItemStack;
/*    */     //   223: goto -> 229
/*    */     //   226: getstatic net/minecraft/world/item/ItemStack.f_41583_ : Lnet/minecraft/world/item/ItemStack;
/*    */     //   229: invokevirtual m_41720_ : ()Lnet/minecraft/world/item/Item;
/*    */     //   232: bipush #72
/*    */     //   234: invokevirtual m_41524_ : (Lnet/minecraft/world/item/Item;I)V
/*    */     //   237: iconst_0
/*    */     //   238: istore #7
/*    */     //   240: iload #7
/*    */     //   242: bipush #30
/*    */     //   244: if_icmpge -> 454
/*    */     //   247: aload_0
/*    */     //   248: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   251: ifeq -> 268
/*    */     //   254: aload_0
/*    */     //   255: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   258: astore #8
/*    */     //   260: aload #8
/*    */     //   262: invokevirtual m_21205_ : ()Lnet/minecraft/world/item/ItemStack;
/*    */     //   265: goto -> 271
/*    */     //   268: getstatic net/minecraft/world/item/ItemStack.f_41583_ : Lnet/minecraft/world/item/ItemStack;
/*    */     //   271: invokevirtual m_41784_ : ()Lnet/minecraft/nbt/CompoundTag;
/*    */     //   274: ldc 'ammo'
/*    */     //   276: invokevirtual m_128459_ : (Ljava/lang/String;)D
/*    */     //   279: ldc2_w 31.0
/*    */     //   282: dcmpg
/*    */     //   283: ifge -> 448
/*    */     //   286: aload_0
/*    */     //   287: instanceof net/minecraft/world/entity/player/Player
/*    */     //   290: ifeq -> 448
/*    */     //   293: aload_0
/*    */     //   294: checkcast net/minecraft/world/entity/player/Player
/*    */     //   297: astore #9
/*    */     //   299: aload #9
/*    */     //   301: invokevirtual m_150109_ : ()Lnet/minecraft/world/entity/player/Inventory;
/*    */     //   304: new net/minecraft/world/item/ItemStack
/*    */     //   307: dup
/*    */     //   308: getstatic net/ltxprogrammer/turned/init/LatexModItems.RIFLE_AMMO : Lnet/minecraftforge/registries/RegistryObject;
/*    */     //   311: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   314: checkcast net/minecraft/world/level/ItemLike
/*    */     //   317: invokespecial <init> : (Lnet/minecraft/world/level/ItemLike;)V
/*    */     //   320: invokevirtual m_36063_ : (Lnet/minecraft/world/item/ItemStack;)Z
/*    */     //   323: ifeq -> 448
/*    */     //   326: aload_0
/*    */     //   327: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   330: ifeq -> 347
/*    */     //   333: aload_0
/*    */     //   334: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   337: astore #10
/*    */     //   339: aload #10
/*    */     //   341: invokevirtual m_21205_ : ()Lnet/minecraft/world/item/ItemStack;
/*    */     //   344: goto -> 350
/*    */     //   347: getstatic net/minecraft/world/item/ItemStack.f_41583_ : Lnet/minecraft/world/item/ItemStack;
/*    */     //   350: invokevirtual m_41784_ : ()Lnet/minecraft/nbt/CompoundTag;
/*    */     //   353: ldc 'ammo'
/*    */     //   355: aload_0
/*    */     //   356: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   359: ifeq -> 376
/*    */     //   362: aload_0
/*    */     //   363: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   366: astore #10
/*    */     //   368: aload #10
/*    */     //   370: invokevirtual m_21205_ : ()Lnet/minecraft/world/item/ItemStack;
/*    */     //   373: goto -> 379
/*    */     //   376: getstatic net/minecraft/world/item/ItemStack.f_41583_ : Lnet/minecraft/world/item/ItemStack;
/*    */     //   379: invokevirtual m_41784_ : ()Lnet/minecraft/nbt/CompoundTag;
/*    */     //   382: ldc 'ammo'
/*    */     //   384: invokevirtual m_128459_ : (Ljava/lang/String;)D
/*    */     //   387: dconst_1
/*    */     //   388: dadd
/*    */     //   389: invokevirtual m_128347_ : (Ljava/lang/String;D)V
/*    */     //   392: aload_0
/*    */     //   393: instanceof net/minecraft/world/entity/player/Player
/*    */     //   396: ifeq -> 448
/*    */     //   399: aload_0
/*    */     //   400: checkcast net/minecraft/world/entity/player/Player
/*    */     //   403: astore #10
/*    */     //   405: new net/minecraft/world/item/ItemStack
/*    */     //   408: dup
/*    */     //   409: getstatic net/ltxprogrammer/turned/init/LatexModItems.RIFLE_AMMO : Lnet/minecraftforge/registries/RegistryObject;
/*    */     //   412: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   415: checkcast net/minecraft/world/level/ItemLike
/*    */     //   418: invokespecial <init> : (Lnet/minecraft/world/level/ItemLike;)V
/*    */     //   421: astore #11
/*    */     //   423: aload #10
/*    */     //   425: invokevirtual m_150109_ : ()Lnet/minecraft/world/entity/player/Inventory;
/*    */     //   428: aload #11
/*    */     //   430: <illegal opcode> test : (Lnet/minecraft/world/item/ItemStack;)Ljava/util/function/Predicate;
/*    */     //   435: iconst_1
/*    */     //   436: aload #10
/*    */     //   438: getfield f_36095_ : Lnet/minecraft/world/inventory/InventoryMenu;
/*    */     //   441: invokevirtual m_39730_ : ()Lnet/minecraft/world/inventory/CraftingContainer;
/*    */     //   444: invokevirtual m_36022_ : (Ljava/util/function/Predicate;ILnet/minecraft/world/Container;)I
/*    */     //   447: pop
/*    */     //   448: iinc #7, 1
/*    */     //   451: goto -> 240
/*    */     //   454: goto -> 803
/*    */     //   457: aload_0
/*    */     //   458: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   461: ifeq -> 478
/*    */     //   464: aload_0
/*    */     //   465: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   468: astore #5
/*    */     //   470: aload #5
/*    */     //   472: invokevirtual m_21205_ : ()Lnet/minecraft/world/item/ItemStack;
/*    */     //   475: goto -> 481
/*    */     //   478: getstatic net/minecraft/world/item/ItemStack.f_41583_ : Lnet/minecraft/world/item/ItemStack;
/*    */     //   481: invokevirtual m_41784_ : ()Lnet/minecraft/nbt/CompoundTag;
/*    */     //   484: ldc 'ammo'
/*    */     //   486: invokevirtual m_128459_ : (Ljava/lang/String;)D
/*    */     //   489: ldc2_w 31.0
/*    */     //   492: dcmpg
/*    */     //   493: ifge -> 803
/*    */     //   496: aload_0
/*    */     //   497: instanceof net/minecraft/world/entity/player/Player
/*    */     //   500: ifeq -> 803
/*    */     //   503: aload_0
/*    */     //   504: checkcast net/minecraft/world/entity/player/Player
/*    */     //   507: astore #6
/*    */     //   509: aload #6
/*    */     //   511: invokevirtual m_150109_ : ()Lnet/minecraft/world/entity/player/Inventory;
/*    */     //   514: new net/minecraft/world/item/ItemStack
/*    */     //   517: dup
/*    */     //   518: getstatic net/ltxprogrammer/turned/init/LatexModItems.RIFLE_AMMO : Lnet/minecraftforge/registries/RegistryObject;
/*    */     //   521: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   524: checkcast net/minecraft/world/level/ItemLike
/*    */     //   527: invokespecial <init> : (Lnet/minecraft/world/level/ItemLike;)V
/*    */     //   530: invokevirtual m_36063_ : (Lnet/minecraft/world/item/ItemStack;)Z
/*    */     //   533: ifeq -> 803
/*    */     //   536: aload_0
/*    */     //   537: instanceof net/minecraft/world/entity/player/Player
/*    */     //   540: ifeq -> 586
/*    */     //   543: aload_0
/*    */     //   544: checkcast net/minecraft/world/entity/player/Player
/*    */     //   547: astore #7
/*    */     //   549: aload #7
/*    */     //   551: invokevirtual m_36335_ : ()Lnet/minecraft/world/item/ItemCooldowns;
/*    */     //   554: aload_0
/*    */     //   555: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   558: ifeq -> 575
/*    */     //   561: aload_0
/*    */     //   562: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   565: astore #8
/*    */     //   567: aload #8
/*    */     //   569: invokevirtual m_21205_ : ()Lnet/minecraft/world/item/ItemStack;
/*    */     //   572: goto -> 578
/*    */     //   575: getstatic net/minecraft/world/item/ItemStack.f_41583_ : Lnet/minecraft/world/item/ItemStack;
/*    */     //   578: invokevirtual m_41720_ : ()Lnet/minecraft/world/item/Item;
/*    */     //   581: bipush #95
/*    */     //   583: invokevirtual m_41524_ : (Lnet/minecraft/world/item/Item;I)V
/*    */     //   586: iconst_0
/*    */     //   587: istore #7
/*    */     //   589: iload #7
/*    */     //   591: bipush #30
/*    */     //   593: if_icmpge -> 803
/*    */     //   596: aload_0
/*    */     //   597: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   600: ifeq -> 617
/*    */     //   603: aload_0
/*    */     //   604: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   607: astore #8
/*    */     //   609: aload #8
/*    */     //   611: invokevirtual m_21205_ : ()Lnet/minecraft/world/item/ItemStack;
/*    */     //   614: goto -> 620
/*    */     //   617: getstatic net/minecraft/world/item/ItemStack.f_41583_ : Lnet/minecraft/world/item/ItemStack;
/*    */     //   620: invokevirtual m_41784_ : ()Lnet/minecraft/nbt/CompoundTag;
/*    */     //   623: ldc 'ammo'
/*    */     //   625: invokevirtual m_128459_ : (Ljava/lang/String;)D
/*    */     //   628: ldc2_w 31.0
/*    */     //   631: dcmpg
/*    */     //   632: ifge -> 797
/*    */     //   635: aload_0
/*    */     //   636: instanceof net/minecraft/world/entity/player/Player
/*    */     //   639: ifeq -> 797
/*    */     //   642: aload_0
/*    */     //   643: checkcast net/minecraft/world/entity/player/Player
/*    */     //   646: astore #9
/*    */     //   648: aload #9
/*    */     //   650: invokevirtual m_150109_ : ()Lnet/minecraft/world/entity/player/Inventory;
/*    */     //   653: new net/minecraft/world/item/ItemStack
/*    */     //   656: dup
/*    */     //   657: getstatic net/ltxprogrammer/turned/init/LatexModItems.RIFLE_AMMO : Lnet/minecraftforge/registries/RegistryObject;
/*    */     //   660: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   663: checkcast net/minecraft/world/level/ItemLike
/*    */     //   666: invokespecial <init> : (Lnet/minecraft/world/level/ItemLike;)V
/*    */     //   669: invokevirtual m_36063_ : (Lnet/minecraft/world/item/ItemStack;)Z
/*    */     //   672: ifeq -> 797
/*    */     //   675: aload_0
/*    */     //   676: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   679: ifeq -> 696
/*    */     //   682: aload_0
/*    */     //   683: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   686: astore #10
/*    */     //   688: aload #10
/*    */     //   690: invokevirtual m_21205_ : ()Lnet/minecraft/world/item/ItemStack;
/*    */     //   693: goto -> 699
/*    */     //   696: getstatic net/minecraft/world/item/ItemStack.f_41583_ : Lnet/minecraft/world/item/ItemStack;
/*    */     //   699: invokevirtual m_41784_ : ()Lnet/minecraft/nbt/CompoundTag;
/*    */     //   702: ldc 'ammo'
/*    */     //   704: aload_0
/*    */     //   705: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   708: ifeq -> 725
/*    */     //   711: aload_0
/*    */     //   712: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   715: astore #10
/*    */     //   717: aload #10
/*    */     //   719: invokevirtual m_21205_ : ()Lnet/minecraft/world/item/ItemStack;
/*    */     //   722: goto -> 728
/*    */     //   725: getstatic net/minecraft/world/item/ItemStack.f_41583_ : Lnet/minecraft/world/item/ItemStack;
/*    */     //   728: invokevirtual m_41784_ : ()Lnet/minecraft/nbt/CompoundTag;
/*    */     //   731: ldc 'ammo'
/*    */     //   733: invokevirtual m_128459_ : (Ljava/lang/String;)D
/*    */     //   736: dconst_1
/*    */     //   737: dadd
/*    */     //   738: invokevirtual m_128347_ : (Ljava/lang/String;D)V
/*    */     //   741: aload_0
/*    */     //   742: instanceof net/minecraft/world/entity/player/Player
/*    */     //   745: ifeq -> 797
/*    */     //   748: aload_0
/*    */     //   749: checkcast net/minecraft/world/entity/player/Player
/*    */     //   752: astore #10
/*    */     //   754: new net/minecraft/world/item/ItemStack
/*    */     //   757: dup
/*    */     //   758: getstatic net/ltxprogrammer/turned/init/LatexModItems.RIFLE_AMMO : Lnet/minecraftforge/registries/RegistryObject;
/*    */     //   761: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   764: checkcast net/minecraft/world/level/ItemLike
/*    */     //   767: invokespecial <init> : (Lnet/minecraft/world/level/ItemLike;)V
/*    */     //   770: astore #11
/*    */     //   772: aload #10
/*    */     //   774: invokevirtual m_150109_ : ()Lnet/minecraft/world/entity/player/Inventory;
/*    */     //   777: aload #11
/*    */     //   779: <illegal opcode> test : (Lnet/minecraft/world/item/ItemStack;)Ljava/util/function/Predicate;
/*    */     //   784: iconst_1
/*    */     //   785: aload #10
/*    */     //   787: getfield f_36095_ : Lnet/minecraft/world/inventory/InventoryMenu;
/*    */     //   790: invokevirtual m_39730_ : ()Lnet/minecraft/world/inventory/CraftingContainer;
/*    */     //   793: invokevirtual m_36022_ : (Ljava/util/function/Predicate;ILnet/minecraft/world/Container;)I
/*    */     //   796: pop
/*    */     //   797: iinc #7, 1
/*    */     //   800: goto -> 589
/*    */     //   803: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #12	-> 0
/*    */     //   #13	-> 4
/*    */     //   #14	-> 5
/*    */     //   #15	-> 39
/*    */     //   #16	-> 67
/*    */     //   #17	-> 73
/*    */     //   #18	-> 110
/*    */     //   #19	-> 139
/*    */     //   #20	-> 147
/*    */     //   #21	-> 162
/*    */     //   #23	-> 187
/*    */     //   #24	-> 200
/*    */     //   #25	-> 205
/*    */     //   #26	-> 237
/*    */     //   #27	-> 247
/*    */     //   #28	-> 276
/*    */     //   #29	-> 286
/*    */     //   #30	-> 301
/*    */     //   #32	-> 326
/*    */     //   #33	-> 355
/*    */     //   #34	-> 379
/*    */     //   #33	-> 389
/*    */     //   #35	-> 392
/*    */     //   #36	-> 405
/*    */     //   #37	-> 423
/*    */     //   #38	-> 441
/*    */     //   #37	-> 444
/*    */     //   #26	-> 448
/*    */     //   #44	-> 457
/*    */     //   #45	-> 486
/*    */     //   #46	-> 496
/*    */     //   #47	-> 511
/*    */     //   #49	-> 536
/*    */     //   #50	-> 549
/*    */     //   #51	-> 554
/*    */     //   #52	-> 586
/*    */     //   #53	-> 596
/*    */     //   #54	-> 625
/*    */     //   #55	-> 635
/*    */     //   #56	-> 650
/*    */     //   #58	-> 675
/*    */     //   #59	-> 704
/*    */     //   #60	-> 728
/*    */     //   #59	-> 738
/*    */     //   #61	-> 741
/*    */     //   #62	-> 754
/*    */     //   #63	-> 772
/*    */     //   #64	-> 790
/*    */     //   #63	-> 793
/*    */     //   #52	-> 797
/*    */     //   #72	-> 803
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   17	7	1	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   51	7	2	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   85	7	3	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   123	8	4	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   218	8	8	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   200	37	7	_player	Lnet/minecraft/world/entity/player/Player;
/*    */     //   260	8	8	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   339	8	10	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   368	8	10	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   423	25	11	_stktoremove	Lnet/minecraft/world/item/ItemStack;
/*    */     //   405	43	10	_player	Lnet/minecraft/world/entity/player/Player;
/*    */     //   299	149	9	_playerHasItem	Lnet/minecraft/world/entity/player/Player;
/*    */     //   240	214	7	index0	I
/*    */     //   160	294	6	_playerHasItem	Lnet/minecraft/world/entity/player/Player;
/*    */     //   470	8	5	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   567	8	8	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   549	37	7	_player	Lnet/minecraft/world/entity/player/Player;
/*    */     //   609	8	8	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   688	8	10	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   717	8	10	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   772	25	11	_stktoremove	Lnet/minecraft/world/item/ItemStack;
/*    */     //   754	43	10	_player	Lnet/minecraft/world/entity/player/Player;
/*    */     //   648	149	9	_playerHasItem	Lnet/minecraft/world/entity/player/Player;
/*    */     //   589	214	7	index1	I
/*    */     //   509	294	6	_playerHasItem	Lnet/minecraft/world/entity/player/Player;
/*    */     //   0	804	0	entity	Lnet/minecraft/world/entity/Entity;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\M4AssaultRifleReloadProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */