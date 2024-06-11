/*    */ package net.mcreator.latexes.procedures;
/*    */ 
/*    */ import javax.annotation.Nullable;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraftforge.event.TickEvent;
/*    */ import net.minecraftforge.eventbus.api.Event;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @EventBusSubscriber
/*    */ public class AmmooverlayProcedure
/*    */ {
/*    */   @SubscribeEvent
/*    */   public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
/* 22 */     if (event.phase == TickEvent.Phase.END) {
/* 23 */       execute((Event)event, (Entity)event.player);
/*    */     }
/*    */   }
/*    */   
/*    */   public static void execute(Entity entity) {
/* 28 */     execute(null, entity);
/*    */   }
/*    */   
/*    */   private static void execute(@Nullable Event event, Entity entity) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ifnonnull -> 5
/*    */     //   4: return
/*    */     //   5: aload_1
/*    */     //   6: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   9: ifeq -> 24
/*    */     //   12: aload_1
/*    */     //   13: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   16: astore_2
/*    */     //   17: aload_2
/*    */     //   18: invokevirtual getMainHandItem : ()Lnet/minecraft/world/item/ItemStack;
/*    */     //   21: goto -> 27
/*    */     //   24: getstatic net/minecraft/world/item/ItemStack.EMPTY : Lnet/minecraft/world/item/ItemStack;
/*    */     //   27: invokevirtual getItem : ()Lnet/minecraft/world/item/Item;
/*    */     //   30: getstatic net/mcreator/latexes/init/LatexModItems.DARTRIFLE : Lnet/minecraftforge/registries/RegistryObject;
/*    */     //   33: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   36: if_acmpne -> 110
/*    */     //   39: aload_1
/*    */     //   40: instanceof net/minecraft/world/entity/player/Player
/*    */     //   43: ifeq -> 110
/*    */     //   46: aload_1
/*    */     //   47: checkcast net/minecraft/world/entity/player/Player
/*    */     //   50: astore_3
/*    */     //   51: aload_3
/*    */     //   52: getfield level : Lnet/minecraft/world/level/Level;
/*    */     //   55: invokevirtual isClientSide : ()Z
/*    */     //   58: ifne -> 110
/*    */     //   61: aload_3
/*    */     //   62: new net/minecraft/network/chat/TextComponent
/*    */     //   65: dup
/*    */     //   66: aload_1
/*    */     //   67: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   70: ifeq -> 87
/*    */     //   73: aload_1
/*    */     //   74: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   77: astore #4
/*    */     //   79: aload #4
/*    */     //   81: invokevirtual getMainHandItem : ()Lnet/minecraft/world/item/ItemStack;
/*    */     //   84: goto -> 90
/*    */     //   87: getstatic net/minecraft/world/item/ItemStack.EMPTY : Lnet/minecraft/world/item/ItemStack;
/*    */     //   90: invokevirtual getOrCreateTag : ()Lnet/minecraft/nbt/CompoundTag;
/*    */     //   93: ldc 'ammo'
/*    */     //   95: invokevirtual getDouble : (Ljava/lang/String;)D
/*    */     //   98: <illegal opcode> makeConcatWithConstants : (D)Ljava/lang/String;
/*    */     //   103: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   106: iconst_1
/*    */     //   107: invokevirtual displayClientMessage : (Lnet/minecraft/network/chat/Component;Z)V
/*    */     //   110: aload_1
/*    */     //   111: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   114: ifeq -> 129
/*    */     //   117: aload_1
/*    */     //   118: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   121: astore_2
/*    */     //   122: aload_2
/*    */     //   123: invokevirtual getMainHandItem : ()Lnet/minecraft/world/item/ItemStack;
/*    */     //   126: goto -> 132
/*    */     //   129: getstatic net/minecraft/world/item/ItemStack.EMPTY : Lnet/minecraft/world/item/ItemStack;
/*    */     //   132: invokevirtual getItem : ()Lnet/minecraft/world/item/Item;
/*    */     //   135: getstatic net/mcreator/latexes/init/LatexModItems.LATEX_DART_RIFLE : Lnet/minecraftforge/registries/RegistryObject;
/*    */     //   138: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   141: if_acmpne -> 215
/*    */     //   144: aload_1
/*    */     //   145: instanceof net/minecraft/world/entity/player/Player
/*    */     //   148: ifeq -> 215
/*    */     //   151: aload_1
/*    */     //   152: checkcast net/minecraft/world/entity/player/Player
/*    */     //   155: astore_3
/*    */     //   156: aload_3
/*    */     //   157: getfield level : Lnet/minecraft/world/level/Level;
/*    */     //   160: invokevirtual isClientSide : ()Z
/*    */     //   163: ifne -> 215
/*    */     //   166: aload_3
/*    */     //   167: new net/minecraft/network/chat/TextComponent
/*    */     //   170: dup
/*    */     //   171: aload_1
/*    */     //   172: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   175: ifeq -> 192
/*    */     //   178: aload_1
/*    */     //   179: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   182: astore #4
/*    */     //   184: aload #4
/*    */     //   186: invokevirtual getMainHandItem : ()Lnet/minecraft/world/item/ItemStack;
/*    */     //   189: goto -> 195
/*    */     //   192: getstatic net/minecraft/world/item/ItemStack.EMPTY : Lnet/minecraft/world/item/ItemStack;
/*    */     //   195: invokevirtual getOrCreateTag : ()Lnet/minecraft/nbt/CompoundTag;
/*    */     //   198: ldc 'ammo'
/*    */     //   200: invokevirtual getDouble : (Ljava/lang/String;)D
/*    */     //   203: <illegal opcode> makeConcatWithConstants : (D)Ljava/lang/String;
/*    */     //   208: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   211: iconst_1
/*    */     //   212: invokevirtual displayClientMessage : (Lnet/minecraft/network/chat/Component;Z)V
/*    */     //   215: aload_1
/*    */     //   216: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   219: ifeq -> 234
/*    */     //   222: aload_1
/*    */     //   223: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   226: astore_2
/*    */     //   227: aload_2
/*    */     //   228: invokevirtual getMainHandItem : ()Lnet/minecraft/world/item/ItemStack;
/*    */     //   231: goto -> 237
/*    */     //   234: getstatic net/minecraft/world/item/ItemStack.EMPTY : Lnet/minecraft/world/item/ItemStack;
/*    */     //   237: invokevirtual getItem : ()Lnet/minecraft/world/item/Item;
/*    */     //   240: getstatic net/mcreator/latexes/init/LatexModItems.M_4_ASSAULT_RIFLE : Lnet/minecraftforge/registries/RegistryObject;
/*    */     //   243: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   246: if_acmpeq -> 283
/*    */     //   249: aload_1
/*    */     //   250: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   253: ifeq -> 268
/*    */     //   256: aload_1
/*    */     //   257: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   260: astore_3
/*    */     //   261: aload_3
/*    */     //   262: invokevirtual getMainHandItem : ()Lnet/minecraft/world/item/ItemStack;
/*    */     //   265: goto -> 271
/*    */     //   268: getstatic net/minecraft/world/item/ItemStack.EMPTY : Lnet/minecraft/world/item/ItemStack;
/*    */     //   271: invokevirtual getItem : ()Lnet/minecraft/world/item/Item;
/*    */     //   274: getstatic net/mcreator/latexes/init/LatexModItems.SCRAP_M_16_RIFLE : Lnet/minecraftforge/registries/RegistryObject;
/*    */     //   277: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   280: if_acmpne -> 441
/*    */     //   283: aload_1
/*    */     //   284: instanceof net/minecraft/world/entity/player/Player
/*    */     //   287: ifeq -> 441
/*    */     //   290: aload_1
/*    */     //   291: checkcast net/minecraft/world/entity/player/Player
/*    */     //   294: astore #4
/*    */     //   296: aload #4
/*    */     //   298: getfield level : Lnet/minecraft/world/level/Level;
/*    */     //   301: invokevirtual isClientSide : ()Z
/*    */     //   304: ifne -> 441
/*    */     //   307: aload #4
/*    */     //   309: new net/minecraft/network/chat/TextComponent
/*    */     //   312: dup
/*    */     //   313: aload_1
/*    */     //   314: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   317: ifeq -> 334
/*    */     //   320: aload_1
/*    */     //   321: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   324: astore #5
/*    */     //   326: aload #5
/*    */     //   328: invokevirtual getMainHandItem : ()Lnet/minecraft/world/item/ItemStack;
/*    */     //   331: goto -> 337
/*    */     //   334: getstatic net/minecraft/world/item/ItemStack.EMPTY : Lnet/minecraft/world/item/ItemStack;
/*    */     //   337: invokevirtual getOrCreateTag : ()Lnet/minecraft/nbt/CompoundTag;
/*    */     //   340: ldc 'ammo'
/*    */     //   342: invokevirtual getDouble : (Ljava/lang/String;)D
/*    */     //   345: ldc2_w 30.0
/*    */     //   348: dcmpl
/*    */     //   349: ifle -> 394
/*    */     //   352: aload_1
/*    */     //   353: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   356: ifeq -> 373
/*    */     //   359: aload_1
/*    */     //   360: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   363: astore #6
/*    */     //   365: aload #6
/*    */     //   367: invokevirtual getMainHandItem : ()Lnet/minecraft/world/item/ItemStack;
/*    */     //   370: goto -> 376
/*    */     //   373: getstatic net/minecraft/world/item/ItemStack.EMPTY : Lnet/minecraft/world/item/ItemStack;
/*    */     //   376: invokevirtual getOrCreateTag : ()Lnet/minecraft/nbt/CompoundTag;
/*    */     //   379: ldc 'ammo'
/*    */     //   381: invokevirtual getDouble : (Ljava/lang/String;)D
/*    */     //   384: dconst_1
/*    */     //   385: dsub
/*    */     //   386: <illegal opcode> makeConcatWithConstants : (D)Ljava/lang/String;
/*    */     //   391: goto -> 429
/*    */     //   394: aload_1
/*    */     //   395: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   398: ifeq -> 415
/*    */     //   401: aload_1
/*    */     //   402: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   405: astore #7
/*    */     //   407: aload #7
/*    */     //   409: invokevirtual getMainHandItem : ()Lnet/minecraft/world/item/ItemStack;
/*    */     //   412: goto -> 418
/*    */     //   415: getstatic net/minecraft/world/item/ItemStack.EMPTY : Lnet/minecraft/world/item/ItemStack;
/*    */     //   418: invokevirtual getOrCreateTag : ()Lnet/minecraft/nbt/CompoundTag;
/*    */     //   421: ldc 'ammo'
/*    */     //   423: invokevirtual getDouble : (Ljava/lang/String;)D
/*    */     //   426: invokestatic valueOf : (D)Ljava/lang/Double;
/*    */     //   429: <illegal opcode> makeConcatWithConstants : (Ljava/io/Serializable;)Ljava/lang/String;
/*    */     //   434: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   437: iconst_1
/*    */     //   438: invokevirtual displayClientMessage : (Lnet/minecraft/network/chat/Component;Z)V
/*    */     //   441: aload_1
/*    */     //   442: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   445: ifeq -> 460
/*    */     //   448: aload_1
/*    */     //   449: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   452: astore_2
/*    */     //   453: aload_2
/*    */     //   454: invokevirtual getMainHandItem : ()Lnet/minecraft/world/item/ItemStack;
/*    */     //   457: goto -> 463
/*    */     //   460: getstatic net/minecraft/world/item/ItemStack.EMPTY : Lnet/minecraft/world/item/ItemStack;
/*    */     //   463: invokevirtual getItem : ()Lnet/minecraft/world/item/Item;
/*    */     //   466: getstatic net/mcreator/latexes/init/LatexModItems.AR_70_ASSAULT_RIFLE : Lnet/minecraftforge/registries/RegistryObject;
/*    */     //   469: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   472: if_acmpne -> 630
/*    */     //   475: aload_1
/*    */     //   476: instanceof net/minecraft/world/entity/player/Player
/*    */     //   479: ifeq -> 630
/*    */     //   482: aload_1
/*    */     //   483: checkcast net/minecraft/world/entity/player/Player
/*    */     //   486: astore_3
/*    */     //   487: aload_3
/*    */     //   488: getfield level : Lnet/minecraft/world/level/Level;
/*    */     //   491: invokevirtual isClientSide : ()Z
/*    */     //   494: ifne -> 630
/*    */     //   497: aload_3
/*    */     //   498: new net/minecraft/network/chat/TextComponent
/*    */     //   501: dup
/*    */     //   502: aload_1
/*    */     //   503: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   506: ifeq -> 523
/*    */     //   509: aload_1
/*    */     //   510: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   513: astore #4
/*    */     //   515: aload #4
/*    */     //   517: invokevirtual getMainHandItem : ()Lnet/minecraft/world/item/ItemStack;
/*    */     //   520: goto -> 526
/*    */     //   523: getstatic net/minecraft/world/item/ItemStack.EMPTY : Lnet/minecraft/world/item/ItemStack;
/*    */     //   526: invokevirtual getOrCreateTag : ()Lnet/minecraft/nbt/CompoundTag;
/*    */     //   529: ldc 'ammo'
/*    */     //   531: invokevirtual getDouble : (Ljava/lang/String;)D
/*    */     //   534: ldc2_w 30.0
/*    */     //   537: dcmpl
/*    */     //   538: ifle -> 583
/*    */     //   541: aload_1
/*    */     //   542: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   545: ifeq -> 562
/*    */     //   548: aload_1
/*    */     //   549: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   552: astore #5
/*    */     //   554: aload #5
/*    */     //   556: invokevirtual getMainHandItem : ()Lnet/minecraft/world/item/ItemStack;
/*    */     //   559: goto -> 565
/*    */     //   562: getstatic net/minecraft/world/item/ItemStack.EMPTY : Lnet/minecraft/world/item/ItemStack;
/*    */     //   565: invokevirtual getOrCreateTag : ()Lnet/minecraft/nbt/CompoundTag;
/*    */     //   568: ldc 'ammo'
/*    */     //   570: invokevirtual getDouble : (Ljava/lang/String;)D
/*    */     //   573: dconst_1
/*    */     //   574: dsub
/*    */     //   575: <illegal opcode> makeConcatWithConstants : (D)Ljava/lang/String;
/*    */     //   580: goto -> 618
/*    */     //   583: aload_1
/*    */     //   584: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   587: ifeq -> 604
/*    */     //   590: aload_1
/*    */     //   591: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   594: astore #6
/*    */     //   596: aload #6
/*    */     //   598: invokevirtual getMainHandItem : ()Lnet/minecraft/world/item/ItemStack;
/*    */     //   601: goto -> 607
/*    */     //   604: getstatic net/minecraft/world/item/ItemStack.EMPTY : Lnet/minecraft/world/item/ItemStack;
/*    */     //   607: invokevirtual getOrCreateTag : ()Lnet/minecraft/nbt/CompoundTag;
/*    */     //   610: ldc 'ammo'
/*    */     //   612: invokevirtual getDouble : (Ljava/lang/String;)D
/*    */     //   615: invokestatic valueOf : (D)Ljava/lang/Double;
/*    */     //   618: <illegal opcode> makeConcatWithConstants : (Ljava/io/Serializable;)Ljava/lang/String;
/*    */     //   623: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   626: iconst_1
/*    */     //   627: invokevirtual displayClientMessage : (Lnet/minecraft/network/chat/Component;Z)V
/*    */     //   630: aload_1
/*    */     //   631: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   634: ifeq -> 649
/*    */     //   637: aload_1
/*    */     //   638: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   641: astore_2
/*    */     //   642: aload_2
/*    */     //   643: invokevirtual getMainHandItem : ()Lnet/minecraft/world/item/ItemStack;
/*    */     //   646: goto -> 652
/*    */     //   649: getstatic net/minecraft/world/item/ItemStack.EMPTY : Lnet/minecraft/world/item/ItemStack;
/*    */     //   652: invokevirtual getItem : ()Lnet/minecraft/world/item/Item;
/*    */     //   655: getstatic net/mcreator/latexes/init/LatexModItems.FLAMETHOWER : Lnet/minecraftforge/registries/RegistryObject;
/*    */     //   658: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   661: if_acmpne -> 735
/*    */     //   664: aload_1
/*    */     //   665: instanceof net/minecraft/world/entity/player/Player
/*    */     //   668: ifeq -> 735
/*    */     //   671: aload_1
/*    */     //   672: checkcast net/minecraft/world/entity/player/Player
/*    */     //   675: astore_3
/*    */     //   676: aload_3
/*    */     //   677: getfield level : Lnet/minecraft/world/level/Level;
/*    */     //   680: invokevirtual isClientSide : ()Z
/*    */     //   683: ifne -> 735
/*    */     //   686: aload_3
/*    */     //   687: new net/minecraft/network/chat/TextComponent
/*    */     //   690: dup
/*    */     //   691: aload_1
/*    */     //   692: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   695: ifeq -> 712
/*    */     //   698: aload_1
/*    */     //   699: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   702: astore #4
/*    */     //   704: aload #4
/*    */     //   706: invokevirtual getMainHandItem : ()Lnet/minecraft/world/item/ItemStack;
/*    */     //   709: goto -> 715
/*    */     //   712: getstatic net/minecraft/world/item/ItemStack.EMPTY : Lnet/minecraft/world/item/ItemStack;
/*    */     //   715: invokevirtual getOrCreateTag : ()Lnet/minecraft/nbt/CompoundTag;
/*    */     //   718: ldc 'ammo'
/*    */     //   720: invokevirtual getDouble : (Ljava/lang/String;)D
/*    */     //   723: <illegal opcode> makeConcatWithConstants : (D)Ljava/lang/String;
/*    */     //   728: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   731: iconst_1
/*    */     //   732: invokevirtual displayClientMessage : (Lnet/minecraft/network/chat/Component;Z)V
/*    */     //   735: aload_1
/*    */     //   736: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   739: ifeq -> 754
/*    */     //   742: aload_1
/*    */     //   743: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   746: astore_2
/*    */     //   747: aload_2
/*    */     //   748: invokevirtual getMainHandItem : ()Lnet/minecraft/world/item/ItemStack;
/*    */     //   751: goto -> 757
/*    */     //   754: getstatic net/minecraft/world/item/ItemStack.EMPTY : Lnet/minecraft/world/item/ItemStack;
/*    */     //   757: invokevirtual getItem : ()Lnet/minecraft/world/item/Item;
/*    */     //   760: getstatic net/mcreator/latexes/init/LatexModItems.TSC_PISTOL : Lnet/minecraftforge/registries/RegistryObject;
/*    */     //   763: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   766: if_acmpne -> 924
/*    */     //   769: aload_1
/*    */     //   770: instanceof net/minecraft/world/entity/player/Player
/*    */     //   773: ifeq -> 924
/*    */     //   776: aload_1
/*    */     //   777: checkcast net/minecraft/world/entity/player/Player
/*    */     //   780: astore_3
/*    */     //   781: aload_3
/*    */     //   782: getfield level : Lnet/minecraft/world/level/Level;
/*    */     //   785: invokevirtual isClientSide : ()Z
/*    */     //   788: ifne -> 924
/*    */     //   791: aload_3
/*    */     //   792: new net/minecraft/network/chat/TextComponent
/*    */     //   795: dup
/*    */     //   796: aload_1
/*    */     //   797: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   800: ifeq -> 817
/*    */     //   803: aload_1
/*    */     //   804: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   807: astore #4
/*    */     //   809: aload #4
/*    */     //   811: invokevirtual getMainHandItem : ()Lnet/minecraft/world/item/ItemStack;
/*    */     //   814: goto -> 820
/*    */     //   817: getstatic net/minecraft/world/item/ItemStack.EMPTY : Lnet/minecraft/world/item/ItemStack;
/*    */     //   820: invokevirtual getOrCreateTag : ()Lnet/minecraft/nbt/CompoundTag;
/*    */     //   823: ldc 'ammo'
/*    */     //   825: invokevirtual getDouble : (Ljava/lang/String;)D
/*    */     //   828: ldc2_w 12.0
/*    */     //   831: dcmpl
/*    */     //   832: ifle -> 877
/*    */     //   835: aload_1
/*    */     //   836: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   839: ifeq -> 856
/*    */     //   842: aload_1
/*    */     //   843: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   846: astore #5
/*    */     //   848: aload #5
/*    */     //   850: invokevirtual getMainHandItem : ()Lnet/minecraft/world/item/ItemStack;
/*    */     //   853: goto -> 859
/*    */     //   856: getstatic net/minecraft/world/item/ItemStack.EMPTY : Lnet/minecraft/world/item/ItemStack;
/*    */     //   859: invokevirtual getOrCreateTag : ()Lnet/minecraft/nbt/CompoundTag;
/*    */     //   862: ldc 'ammo'
/*    */     //   864: invokevirtual getDouble : (Ljava/lang/String;)D
/*    */     //   867: dconst_1
/*    */     //   868: dsub
/*    */     //   869: <illegal opcode> makeConcatWithConstants : (D)Ljava/lang/String;
/*    */     //   874: goto -> 912
/*    */     //   877: aload_1
/*    */     //   878: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   881: ifeq -> 898
/*    */     //   884: aload_1
/*    */     //   885: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   888: astore #6
/*    */     //   890: aload #6
/*    */     //   892: invokevirtual getMainHandItem : ()Lnet/minecraft/world/item/ItemStack;
/*    */     //   895: goto -> 901
/*    */     //   898: getstatic net/minecraft/world/item/ItemStack.EMPTY : Lnet/minecraft/world/item/ItemStack;
/*    */     //   901: invokevirtual getOrCreateTag : ()Lnet/minecraft/nbt/CompoundTag;
/*    */     //   904: ldc 'ammo'
/*    */     //   906: invokevirtual getDouble : (Ljava/lang/String;)D
/*    */     //   909: invokestatic valueOf : (D)Ljava/lang/Double;
/*    */     //   912: <illegal opcode> makeConcatWithConstants : (Ljava/io/Serializable;)Ljava/lang/String;
/*    */     //   917: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   920: iconst_1
/*    */     //   921: invokevirtual displayClientMessage : (Lnet/minecraft/network/chat/Component;Z)V
/*    */     //   924: aload_1
/*    */     //   925: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   928: ifeq -> 943
/*    */     //   931: aload_1
/*    */     //   932: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   935: astore_2
/*    */     //   936: aload_2
/*    */     //   937: invokevirtual getOffhandItem : ()Lnet/minecraft/world/item/ItemStack;
/*    */     //   940: goto -> 946
/*    */     //   943: getstatic net/minecraft/world/item/ItemStack.EMPTY : Lnet/minecraft/world/item/ItemStack;
/*    */     //   946: invokevirtual getItem : ()Lnet/minecraft/world/item/Item;
/*    */     //   949: getstatic net/mcreator/latexes/init/LatexModItems.TSC_PISTOL : Lnet/minecraftforge/registries/RegistryObject;
/*    */     //   952: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   955: if_acmpne -> 1113
/*    */     //   958: aload_1
/*    */     //   959: instanceof net/minecraft/world/entity/player/Player
/*    */     //   962: ifeq -> 1113
/*    */     //   965: aload_1
/*    */     //   966: checkcast net/minecraft/world/entity/player/Player
/*    */     //   969: astore_3
/*    */     //   970: aload_3
/*    */     //   971: getfield level : Lnet/minecraft/world/level/Level;
/*    */     //   974: invokevirtual isClientSide : ()Z
/*    */     //   977: ifne -> 1113
/*    */     //   980: aload_3
/*    */     //   981: new net/minecraft/network/chat/TextComponent
/*    */     //   984: dup
/*    */     //   985: aload_1
/*    */     //   986: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   989: ifeq -> 1006
/*    */     //   992: aload_1
/*    */     //   993: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   996: astore #4
/*    */     //   998: aload #4
/*    */     //   1000: invokevirtual getOffhandItem : ()Lnet/minecraft/world/item/ItemStack;
/*    */     //   1003: goto -> 1009
/*    */     //   1006: getstatic net/minecraft/world/item/ItemStack.EMPTY : Lnet/minecraft/world/item/ItemStack;
/*    */     //   1009: invokevirtual getOrCreateTag : ()Lnet/minecraft/nbt/CompoundTag;
/*    */     //   1012: ldc 'ammo'
/*    */     //   1014: invokevirtual getDouble : (Ljava/lang/String;)D
/*    */     //   1017: ldc2_w 12.0
/*    */     //   1020: dcmpl
/*    */     //   1021: ifle -> 1066
/*    */     //   1024: aload_1
/*    */     //   1025: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   1028: ifeq -> 1045
/*    */     //   1031: aload_1
/*    */     //   1032: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   1035: astore #5
/*    */     //   1037: aload #5
/*    */     //   1039: invokevirtual getOffhandItem : ()Lnet/minecraft/world/item/ItemStack;
/*    */     //   1042: goto -> 1048
/*    */     //   1045: getstatic net/minecraft/world/item/ItemStack.EMPTY : Lnet/minecraft/world/item/ItemStack;
/*    */     //   1048: invokevirtual getOrCreateTag : ()Lnet/minecraft/nbt/CompoundTag;
/*    */     //   1051: ldc 'ammo'
/*    */     //   1053: invokevirtual getDouble : (Ljava/lang/String;)D
/*    */     //   1056: dconst_1
/*    */     //   1057: dsub
/*    */     //   1058: <illegal opcode> makeConcatWithConstants : (D)Ljava/lang/String;
/*    */     //   1063: goto -> 1101
/*    */     //   1066: aload_1
/*    */     //   1067: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   1070: ifeq -> 1087
/*    */     //   1073: aload_1
/*    */     //   1074: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   1077: astore #6
/*    */     //   1079: aload #6
/*    */     //   1081: invokevirtual getOffhandItem : ()Lnet/minecraft/world/item/ItemStack;
/*    */     //   1084: goto -> 1090
/*    */     //   1087: getstatic net/minecraft/world/item/ItemStack.EMPTY : Lnet/minecraft/world/item/ItemStack;
/*    */     //   1090: invokevirtual getOrCreateTag : ()Lnet/minecraft/nbt/CompoundTag;
/*    */     //   1093: ldc 'ammo'
/*    */     //   1095: invokevirtual getDouble : (Ljava/lang/String;)D
/*    */     //   1098: invokestatic valueOf : (D)Ljava/lang/Double;
/*    */     //   1101: <illegal opcode> makeConcatWithConstants : (Ljava/io/Serializable;)Ljava/lang/String;
/*    */     //   1106: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   1109: iconst_1
/*    */     //   1110: invokevirtual displayClientMessage : (Lnet/minecraft/network/chat/Component;Z)V
/*    */     //   1113: aload_1
/*    */     //   1114: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   1117: ifeq -> 1132
/*    */     //   1120: aload_1
/*    */     //   1121: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   1124: astore_2
/*    */     //   1125: aload_2
/*    */     //   1126: invokevirtual getMainHandItem : ()Lnet/minecraft/world/item/ItemStack;
/*    */     //   1129: goto -> 1135
/*    */     //   1132: getstatic net/minecraft/world/item/ItemStack.EMPTY : Lnet/minecraft/world/item/ItemStack;
/*    */     //   1135: invokevirtual getItem : ()Lnet/minecraft/world/item/Item;
/*    */     //   1138: getstatic net/mcreator/latexes/init/LatexModItems.OVERUNDERSHOTGUN : Lnet/minecraftforge/registries/RegistryObject;
/*    */     //   1141: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   1144: if_acmpne -> 1218
/*    */     //   1147: aload_1
/*    */     //   1148: instanceof net/minecraft/world/entity/player/Player
/*    */     //   1151: ifeq -> 1218
/*    */     //   1154: aload_1
/*    */     //   1155: checkcast net/minecraft/world/entity/player/Player
/*    */     //   1158: astore_3
/*    */     //   1159: aload_3
/*    */     //   1160: getfield level : Lnet/minecraft/world/level/Level;
/*    */     //   1163: invokevirtual isClientSide : ()Z
/*    */     //   1166: ifne -> 1218
/*    */     //   1169: aload_3
/*    */     //   1170: new net/minecraft/network/chat/TextComponent
/*    */     //   1173: dup
/*    */     //   1174: aload_1
/*    */     //   1175: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   1178: ifeq -> 1195
/*    */     //   1181: aload_1
/*    */     //   1182: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   1185: astore #4
/*    */     //   1187: aload #4
/*    */     //   1189: invokevirtual getMainHandItem : ()Lnet/minecraft/world/item/ItemStack;
/*    */     //   1192: goto -> 1198
/*    */     //   1195: getstatic net/minecraft/world/item/ItemStack.EMPTY : Lnet/minecraft/world/item/ItemStack;
/*    */     //   1198: invokevirtual getOrCreateTag : ()Lnet/minecraft/nbt/CompoundTag;
/*    */     //   1201: ldc 'ammo'
/*    */     //   1203: invokevirtual getDouble : (Ljava/lang/String;)D
/*    */     //   1206: <illegal opcode> makeConcatWithConstants : (D)Ljava/lang/String;
/*    */     //   1211: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   1214: iconst_1
/*    */     //   1215: invokevirtual displayClientMessage : (Lnet/minecraft/network/chat/Component;Z)V
/*    */     //   1218: aload_1
/*    */     //   1219: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   1222: ifeq -> 1237
/*    */     //   1225: aload_1
/*    */     //   1226: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   1229: astore_2
/*    */     //   1230: aload_2
/*    */     //   1231: invokevirtual getMainHandItem : ()Lnet/minecraft/world/item/ItemStack;
/*    */     //   1234: goto -> 1240
/*    */     //   1237: getstatic net/minecraft/world/item/ItemStack.EMPTY : Lnet/minecraft/world/item/ItemStack;
/*    */     //   1240: invokevirtual getItem : ()Lnet/minecraft/world/item/Item;
/*    */     //   1243: getstatic net/mcreator/latexes/init/LatexModItems.REVOLVING_GOO_CANNON : Lnet/minecraftforge/registries/RegistryObject;
/*    */     //   1246: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   1249: if_acmpne -> 1323
/*    */     //   1252: aload_1
/*    */     //   1253: instanceof net/minecraft/world/entity/player/Player
/*    */     //   1256: ifeq -> 1323
/*    */     //   1259: aload_1
/*    */     //   1260: checkcast net/minecraft/world/entity/player/Player
/*    */     //   1263: astore_3
/*    */     //   1264: aload_3
/*    */     //   1265: getfield level : Lnet/minecraft/world/level/Level;
/*    */     //   1268: invokevirtual isClientSide : ()Z
/*    */     //   1271: ifne -> 1323
/*    */     //   1274: aload_3
/*    */     //   1275: new net/minecraft/network/chat/TextComponent
/*    */     //   1278: dup
/*    */     //   1279: aload_1
/*    */     //   1280: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   1283: ifeq -> 1300
/*    */     //   1286: aload_1
/*    */     //   1287: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   1290: astore #4
/*    */     //   1292: aload #4
/*    */     //   1294: invokevirtual getMainHandItem : ()Lnet/minecraft/world/item/ItemStack;
/*    */     //   1297: goto -> 1303
/*    */     //   1300: getstatic net/minecraft/world/item/ItemStack.EMPTY : Lnet/minecraft/world/item/ItemStack;
/*    */     //   1303: invokevirtual getOrCreateTag : ()Lnet/minecraft/nbt/CompoundTag;
/*    */     //   1306: ldc 'ammo'
/*    */     //   1308: invokevirtual getDouble : (Ljava/lang/String;)D
/*    */     //   1311: <illegal opcode> makeConcatWithConstants : (D)Ljava/lang/String;
/*    */     //   1316: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   1319: iconst_1
/*    */     //   1320: invokevirtual displayClientMessage : (Lnet/minecraft/network/chat/Component;Z)V
/*    */     //   1323: aload_1
/*    */     //   1324: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   1327: ifeq -> 1342
/*    */     //   1330: aload_1
/*    */     //   1331: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   1334: astore_2
/*    */     //   1335: aload_2
/*    */     //   1336: invokevirtual getMainHandItem : ()Lnet/minecraft/world/item/ItemStack;
/*    */     //   1339: goto -> 1345
/*    */     //   1342: getstatic net/minecraft/world/item/ItemStack.EMPTY : Lnet/minecraft/world/item/ItemStack;
/*    */     //   1345: invokevirtual getItem : ()Lnet/minecraft/world/item/Item;
/*    */     //   1348: getstatic net/mcreator/latexes/init/LatexModItems.MATCH_LOCK_MUSKET : Lnet/minecraftforge/registries/RegistryObject;
/*    */     //   1351: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   1354: if_acmpeq -> 1391
/*    */     //   1357: aload_1
/*    */     //   1358: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   1361: ifeq -> 1376
/*    */     //   1364: aload_1
/*    */     //   1365: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   1368: astore_3
/*    */     //   1369: aload_3
/*    */     //   1370: invokevirtual getMainHandItem : ()Lnet/minecraft/world/item/ItemStack;
/*    */     //   1373: goto -> 1379
/*    */     //   1376: getstatic net/minecraft/world/item/ItemStack.EMPTY : Lnet/minecraft/world/item/ItemStack;
/*    */     //   1379: invokevirtual getItem : ()Lnet/minecraft/world/item/Item;
/*    */     //   1382: getstatic net/mcreator/latexes/init/LatexModItems.MATCHLOCK_PISTOL : Lnet/minecraftforge/registries/RegistryObject;
/*    */     //   1385: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   1388: if_acmpne -> 1509
/*    */     //   1391: aload_1
/*    */     //   1392: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   1395: ifeq -> 1412
/*    */     //   1398: aload_1
/*    */     //   1399: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   1402: astore #4
/*    */     //   1404: aload #4
/*    */     //   1406: invokevirtual getMainHandItem : ()Lnet/minecraft/world/item/ItemStack;
/*    */     //   1409: goto -> 1415
/*    */     //   1412: getstatic net/minecraft/world/item/ItemStack.EMPTY : Lnet/minecraft/world/item/ItemStack;
/*    */     //   1415: invokevirtual getOrCreateTag : ()Lnet/minecraft/nbt/CompoundTag;
/*    */     //   1418: ldc 'ammo'
/*    */     //   1420: invokevirtual getDouble : (Ljava/lang/String;)D
/*    */     //   1423: dconst_1
/*    */     //   1424: dcmpl
/*    */     //   1425: ifne -> 1470
/*    */     //   1428: aload_1
/*    */     //   1429: instanceof net/minecraft/world/entity/player/Player
/*    */     //   1432: ifeq -> 1467
/*    */     //   1435: aload_1
/*    */     //   1436: checkcast net/minecraft/world/entity/player/Player
/*    */     //   1439: astore #5
/*    */     //   1441: aload #5
/*    */     //   1443: getfield level : Lnet/minecraft/world/level/Level;
/*    */     //   1446: invokevirtual isClientSide : ()Z
/*    */     //   1449: ifne -> 1467
/*    */     //   1452: aload #5
/*    */     //   1454: new net/minecraft/network/chat/TextComponent
/*    */     //   1457: dup
/*    */     //   1458: ldc '[Paper Cartidge] [ Loaded ]'
/*    */     //   1460: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   1463: iconst_1
/*    */     //   1464: invokevirtual displayClientMessage : (Lnet/minecraft/network/chat/Component;Z)V
/*    */     //   1467: goto -> 1509
/*    */     //   1470: aload_1
/*    */     //   1471: instanceof net/minecraft/world/entity/player/Player
/*    */     //   1474: ifeq -> 1509
/*    */     //   1477: aload_1
/*    */     //   1478: checkcast net/minecraft/world/entity/player/Player
/*    */     //   1481: astore #5
/*    */     //   1483: aload #5
/*    */     //   1485: getfield level : Lnet/minecraft/world/level/Level;
/*    */     //   1488: invokevirtual isClientSide : ()Z
/*    */     //   1491: ifne -> 1509
/*    */     //   1494: aload #5
/*    */     //   1496: new net/minecraft/network/chat/TextComponent
/*    */     //   1499: dup
/*    */     //   1500: ldc '[Paper Cartidge] [ Empty ]'
/*    */     //   1502: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   1505: iconst_1
/*    */     //   1506: invokevirtual displayClientMessage : (Lnet/minecraft/network/chat/Component;Z)V
/*    */     //   1509: aload_1
/*    */     //   1510: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   1513: ifeq -> 1528
/*    */     //   1516: aload_1
/*    */     //   1517: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   1520: astore_2
/*    */     //   1521: aload_2
/*    */     //   1522: invokevirtual getOffhandItem : ()Lnet/minecraft/world/item/ItemStack;
/*    */     //   1525: goto -> 1531
/*    */     //   1528: getstatic net/minecraft/world/item/ItemStack.EMPTY : Lnet/minecraft/world/item/ItemStack;
/*    */     //   1531: invokevirtual getItem : ()Lnet/minecraft/world/item/Item;
/*    */     //   1534: getstatic net/mcreator/latexes/init/LatexModItems.MATCHLOCK_PISTOL : Lnet/minecraftforge/registries/RegistryObject;
/*    */     //   1537: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   1540: if_acmpne -> 1659
/*    */     //   1543: aload_1
/*    */     //   1544: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   1547: ifeq -> 1562
/*    */     //   1550: aload_1
/*    */     //   1551: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   1554: astore_3
/*    */     //   1555: aload_3
/*    */     //   1556: invokevirtual getOffhandItem : ()Lnet/minecraft/world/item/ItemStack;
/*    */     //   1559: goto -> 1565
/*    */     //   1562: getstatic net/minecraft/world/item/ItemStack.EMPTY : Lnet/minecraft/world/item/ItemStack;
/*    */     //   1565: invokevirtual getOrCreateTag : ()Lnet/minecraft/nbt/CompoundTag;
/*    */     //   1568: ldc 'ammo'
/*    */     //   1570: invokevirtual getDouble : (Ljava/lang/String;)D
/*    */     //   1573: dconst_1
/*    */     //   1574: dcmpl
/*    */     //   1575: ifne -> 1620
/*    */     //   1578: aload_1
/*    */     //   1579: instanceof net/minecraft/world/entity/player/Player
/*    */     //   1582: ifeq -> 1617
/*    */     //   1585: aload_1
/*    */     //   1586: checkcast net/minecraft/world/entity/player/Player
/*    */     //   1589: astore #4
/*    */     //   1591: aload #4
/*    */     //   1593: getfield level : Lnet/minecraft/world/level/Level;
/*    */     //   1596: invokevirtual isClientSide : ()Z
/*    */     //   1599: ifne -> 1617
/*    */     //   1602: aload #4
/*    */     //   1604: new net/minecraft/network/chat/TextComponent
/*    */     //   1607: dup
/*    */     //   1608: ldc '[Paper Cartidge] [ Loaded ]'
/*    */     //   1610: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   1613: iconst_1
/*    */     //   1614: invokevirtual displayClientMessage : (Lnet/minecraft/network/chat/Component;Z)V
/*    */     //   1617: goto -> 1659
/*    */     //   1620: aload_1
/*    */     //   1621: instanceof net/minecraft/world/entity/player/Player
/*    */     //   1624: ifeq -> 1659
/*    */     //   1627: aload_1
/*    */     //   1628: checkcast net/minecraft/world/entity/player/Player
/*    */     //   1631: astore #4
/*    */     //   1633: aload #4
/*    */     //   1635: getfield level : Lnet/minecraft/world/level/Level;
/*    */     //   1638: invokevirtual isClientSide : ()Z
/*    */     //   1641: ifne -> 1659
/*    */     //   1644: aload #4
/*    */     //   1646: new net/minecraft/network/chat/TextComponent
/*    */     //   1649: dup
/*    */     //   1650: ldc '[Paper Cartidge] [ Empty ]'
/*    */     //   1652: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   1655: iconst_1
/*    */     //   1656: invokevirtual displayClientMessage : (Lnet/minecraft/network/chat/Component;Z)V
/*    */     //   1659: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #32	-> 0
/*    */     //   #33	-> 4
/*    */     //   #34	-> 5
/*    */     //   #35	-> 39
/*    */     //   #36	-> 61
/*    */     //   #37	-> 66
/*    */     //   #36	-> 107
/*    */     //   #40	-> 110
/*    */     //   #41	-> 138
/*    */     //   #42	-> 144
/*    */     //   #43	-> 166
/*    */     //   #44	-> 171
/*    */     //   #43	-> 212
/*    */     //   #47	-> 215
/*    */     //   #48	-> 249
/*    */     //   #49	-> 277
/*    */     //   #50	-> 283
/*    */     //   #51	-> 307
/*    */     //   #52	-> 313
/*    */     //   #53	-> 337
/*    */     //   #54	-> 352
/*    */     //   #55	-> 381
/*    */     //   #56	-> 394
/*    */     //   #57	-> 423
/*    */     //   #56	-> 426
/*    */     //   #51	-> 438
/*    */     //   #61	-> 441
/*    */     //   #62	-> 469
/*    */     //   #63	-> 475
/*    */     //   #64	-> 497
/*    */     //   #65	-> 502
/*    */     //   #66	-> 526
/*    */     //   #67	-> 541
/*    */     //   #68	-> 570
/*    */     //   #69	-> 583
/*    */     //   #70	-> 612
/*    */     //   #69	-> 615
/*    */     //   #64	-> 627
/*    */     //   #74	-> 630
/*    */     //   #75	-> 664
/*    */     //   #76	-> 686
/*    */     //   #77	-> 691
/*    */     //   #76	-> 732
/*    */     //   #80	-> 735
/*    */     //   #81	-> 769
/*    */     //   #82	-> 791
/*    */     //   #83	-> 796
/*    */     //   #84	-> 820
/*    */     //   #85	-> 835
/*    */     //   #86	-> 864
/*    */     //   #87	-> 877
/*    */     //   #88	-> 906
/*    */     //   #87	-> 909
/*    */     //   #82	-> 921
/*    */     //   #92	-> 924
/*    */     //   #93	-> 958
/*    */     //   #94	-> 980
/*    */     //   #95	-> 985
/*    */     //   #96	-> 1009
/*    */     //   #97	-> 1024
/*    */     //   #98	-> 1053
/*    */     //   #99	-> 1066
/*    */     //   #100	-> 1095
/*    */     //   #99	-> 1098
/*    */     //   #94	-> 1110
/*    */     //   #104	-> 1113
/*    */     //   #105	-> 1141
/*    */     //   #106	-> 1147
/*    */     //   #107	-> 1169
/*    */     //   #108	-> 1174
/*    */     //   #107	-> 1215
/*    */     //   #111	-> 1218
/*    */     //   #112	-> 1246
/*    */     //   #113	-> 1252
/*    */     //   #114	-> 1274
/*    */     //   #115	-> 1279
/*    */     //   #114	-> 1320
/*    */     //   #118	-> 1323
/*    */     //   #119	-> 1357
/*    */     //   #120	-> 1385
/*    */     //   #121	-> 1391
/*    */     //   #122	-> 1428
/*    */     //   #123	-> 1452
/*    */     //   #125	-> 1470
/*    */     //   #126	-> 1494
/*    */     //   #129	-> 1509
/*    */     //   #130	-> 1543
/*    */     //   #131	-> 1578
/*    */     //   #132	-> 1602
/*    */     //   #134	-> 1620
/*    */     //   #135	-> 1644
/*    */     //   #138	-> 1659
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   17	7	2	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   79	8	4	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   51	59	3	_player	Lnet/minecraft/world/entity/player/Player;
/*    */     //   122	7	2	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   184	8	4	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   156	59	3	_player	Lnet/minecraft/world/entity/player/Player;
/*    */     //   227	7	2	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   261	7	3	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   326	8	5	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   365	8	6	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   407	8	7	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   296	145	4	_player	Lnet/minecraft/world/entity/player/Player;
/*    */     //   453	7	2	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   515	8	4	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   554	8	5	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   596	8	6	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   487	143	3	_player	Lnet/minecraft/world/entity/player/Player;
/*    */     //   642	7	2	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   704	8	4	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   676	59	3	_player	Lnet/minecraft/world/entity/player/Player;
/*    */     //   747	7	2	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   809	8	4	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   848	8	5	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   890	8	6	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   781	143	3	_player	Lnet/minecraft/world/entity/player/Player;
/*    */     //   936	7	2	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   998	8	4	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   1037	8	5	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   1079	8	6	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   970	143	3	_player	Lnet/minecraft/world/entity/player/Player;
/*    */     //   1125	7	2	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   1187	8	4	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   1159	59	3	_player	Lnet/minecraft/world/entity/player/Player;
/*    */     //   1230	7	2	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   1292	8	4	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   1264	59	3	_player	Lnet/minecraft/world/entity/player/Player;
/*    */     //   1335	7	2	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   1369	7	3	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   1404	8	4	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   1441	26	5	_player	Lnet/minecraft/world/entity/player/Player;
/*    */     //   1483	26	5	_player	Lnet/minecraft/world/entity/player/Player;
/*    */     //   1521	7	2	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   1555	7	3	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   1591	26	4	_player	Lnet/minecraft/world/entity/player/Player;
/*    */     //   1633	26	4	_player	Lnet/minecraft/world/entity/player/Player;
/*    */     //   0	1660	0	event	Lnet/minecraftforge/eventbus/api/Event;
/*    */     //   0	1660	1	entity	Lnet/minecraft/world/entity/Entity;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\AmmooverlayProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */