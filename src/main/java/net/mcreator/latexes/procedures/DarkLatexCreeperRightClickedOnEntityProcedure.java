package net.mcreator.latexes.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.LevelAccessor;

public class DarkLatexCreeperRightClickedOnEntityProcedure {
  public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
    // Byte code:
    //   0: aload #7
    //   2: ifnonnull -> 6
    //   5: return
    //   6: iconst_0
    //   7: istore #8
    //   9: dconst_0
    //   10: dstore #9
    //   12: dconst_0
    //   13: dstore #11
    //   15: dconst_0
    //   16: dstore #13
    //   18: aload #7
    //   20: invokevirtual isOnFire : ()Z
    //   23: ifne -> 96
    //   26: aload #7
    //   28: instanceof net/minecraft/world/entity/LivingEntity
    //   31: ifeq -> 49
    //   34: aload #7
    //   36: checkcast net/minecraft/world/entity/LivingEntity
    //   39: astore #15
    //   41: aload #15
    //   43: invokevirtual getMainHandItem : ()Lnet/minecraft/world/item/ItemStack;
    //   46: goto -> 52
    //   49: getstatic net/minecraft/world/item/ItemStack.EMPTY : Lnet/minecraft/world/item/ItemStack;
    //   52: invokevirtual getItem : ()Lnet/minecraft/world/item/Item;
    //   55: getstatic net/minecraft/world/item/Items.FLINT_AND_STEEL : Lnet/minecraft/world/item/Item;
    //   58: if_acmpeq -> 96
    //   61: aload #7
    //   63: instanceof net/minecraft/world/entity/LivingEntity
    //   66: ifeq -> 84
    //   69: aload #7
    //   71: checkcast net/minecraft/world/entity/LivingEntity
    //   74: astore #16
    //   76: aload #16
    //   78: invokevirtual getMainHandItem : ()Lnet/minecraft/world/item/ItemStack;
    //   81: goto -> 87
    //   84: getstatic net/minecraft/world/item/ItemStack.EMPTY : Lnet/minecraft/world/item/ItemStack;
    //   87: invokevirtual getItem : ()Lnet/minecraft/world/item/Item;
    //   90: getstatic net/minecraft/world/item/Items.FIRE_CHARGE : Lnet/minecraft/world/item/Item;
    //   93: if_acmpne -> 464
    //   96: aload #7
    //   98: getfield level : Lnet/minecraft/world/level/Level;
    //   101: invokevirtual isClientSide : ()Z
    //   104: ifne -> 112
    //   107: aload #7
    //   109: invokevirtual discard : ()V
    //   112: aload_0
    //   113: instanceof net/minecraft/world/level/Level
    //   116: ifeq -> 149
    //   119: aload_0
    //   120: checkcast net/minecraft/world/level/Level
    //   123: astore #17
    //   125: aload #17
    //   127: invokevirtual isClientSide : ()Z
    //   130: ifne -> 149
    //   133: aload #17
    //   135: aconst_null
    //   136: dload_1
    //   137: dload_3
    //   138: dload #5
    //   140: ldc 5.0
    //   142: getstatic net/minecraft/world/level/Explosion$BlockInteraction.BREAK : Lnet/minecraft/world/level/Explosion$BlockInteraction;
    //   145: invokevirtual explode : (Lnet/minecraft/world/entity/Entity;DDDFLnet/minecraft/world/level/Explosion$BlockInteraction;)Lnet/minecraft/world/level/Explosion;
    //   148: pop
    //   149: ldc2_w -3.0
    //   152: dstore #9
    //   154: iconst_0
    //   155: istore #8
    //   157: iconst_0
    //   158: istore #17
    //   160: iload #17
    //   162: bipush #6
    //   164: if_icmpge -> 341
    //   167: ldc2_w -5.0
    //   170: dstore #11
    //   172: iconst_0
    //   173: istore #18
    //   175: iload #18
    //   177: bipush #6
    //   179: if_icmpge -> 329
    //   182: ldc2_w -3.0
    //   185: dstore #13
    //   187: iconst_0
    //   188: istore #19
    //   190: iload #19
    //   192: bipush #6
    //   194: if_icmpge -> 317
    //   197: aload_0
    //   198: new net/minecraft/core/BlockPos
    //   201: dup
    //   202: dload_1
    //   203: dload #9
    //   205: dadd
    //   206: dload_3
    //   207: dload #11
    //   209: dadd
    //   210: dload #5
    //   212: dload #13
    //   214: dadd
    //   215: invokespecial <init> : (DDD)V
    //   218: invokeinterface getBlockState : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;
    //   223: invokevirtual getBlock : ()Lnet/minecraft/world/level/block/Block;
    //   226: getstatic net/minecraft/world/level/block/Blocks.CAVE_AIR : Lnet/minecraft/world/level/block/Block;
    //   229: if_acmpeq -> 305
    //   232: aload_0
    //   233: new net/minecraft/core/BlockPos
    //   236: dup
    //   237: dload_1
    //   238: dload #9
    //   240: dadd
    //   241: dload_3
    //   242: dload #11
    //   244: dadd
    //   245: dload #5
    //   247: dload #13
    //   249: dadd
    //   250: invokespecial <init> : (DDD)V
    //   253: invokeinterface getBlockState : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;
    //   258: invokevirtual getBlock : ()Lnet/minecraft/world/level/block/Block;
    //   261: getstatic net/minecraft/world/level/block/Blocks.VOID_AIR : Lnet/minecraft/world/level/block/Block;
    //   264: if_acmpeq -> 305
    //   267: aload_0
    //   268: new net/minecraft/core/BlockPos
    //   271: dup
    //   272: dload_1
    //   273: dload #9
    //   275: dadd
    //   276: dload_3
    //   277: dload #11
    //   279: dadd
    //   280: dload #5
    //   282: dload #13
    //   284: dadd
    //   285: invokespecial <init> : (DDD)V
    //   288: invokeinterface getBlockState : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;
    //   293: invokevirtual getBlock : ()Lnet/minecraft/world/level/block/Block;
    //   296: getstatic net/minecraft/world/level/block/Blocks.AIR : Lnet/minecraft/world/level/block/Block;
    //   299: if_acmpeq -> 305
    //   302: iconst_1
    //   303: istore #8
    //   305: dload #13
    //   307: dconst_1
    //   308: dadd
    //   309: dstore #13
    //   311: iinc #19, 1
    //   314: goto -> 190
    //   317: dload #11
    //   319: dconst_1
    //   320: dadd
    //   321: dstore #11
    //   323: iinc #18, 1
    //   326: goto -> 175
    //   329: dload #9
    //   331: dconst_1
    //   332: dadd
    //   333: dstore #9
    //   335: iinc #17, 1
    //   338: goto -> 160
    //   341: iload #8
    //   343: iconst_1
    //   344: if_icmpne -> 464
    //   347: aload_0
    //   348: new net/minecraft/core/BlockPos
    //   351: dup
    //   352: dload_1
    //   353: dload_3
    //   354: dconst_1
    //   355: dadd
    //   356: dload #5
    //   358: invokespecial <init> : (DDD)V
    //   361: invokeinterface getBlockState : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;
    //   366: invokevirtual getBlock : ()Lnet/minecraft/world/level/block/Block;
    //   369: getstatic net/minecraft/world/level/block/Blocks.AIR : Lnet/minecraft/world/level/block/Block;
    //   372: if_acmpeq -> 431
    //   375: aload_0
    //   376: new net/minecraft/core/BlockPos
    //   379: dup
    //   380: dload_1
    //   381: dload_3
    //   382: dconst_1
    //   383: dadd
    //   384: dload #5
    //   386: invokespecial <init> : (DDD)V
    //   389: invokeinterface getBlockState : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;
    //   394: invokevirtual getBlock : ()Lnet/minecraft/world/level/block/Block;
    //   397: getstatic net/minecraft/world/level/block/Blocks.VOID_AIR : Lnet/minecraft/world/level/block/Block;
    //   400: if_acmpeq -> 431
    //   403: aload_0
    //   404: new net/minecraft/core/BlockPos
    //   407: dup
    //   408: dload_1
    //   409: dload_3
    //   410: dconst_1
    //   411: dadd
    //   412: dload #5
    //   414: invokespecial <init> : (DDD)V
    //   417: invokeinterface getBlockState : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;
    //   422: invokevirtual getBlock : ()Lnet/minecraft/world/level/block/Block;
    //   425: getstatic net/minecraft/world/level/block/Blocks.CAVE_AIR : Lnet/minecraft/world/level/block/Block;
    //   428: if_acmpne -> 464
    //   431: aload_0
    //   432: new net/minecraft/core/BlockPos
    //   435: dup
    //   436: dload_1
    //   437: dload_3
    //   438: dconst_1
    //   439: dadd
    //   440: dload #5
    //   442: invokespecial <init> : (DDD)V
    //   445: getstatic net/mcreator/latexes/init/LatexModBlocks.DARKLATEXCARPET : Lnet/minecraftforge/registries/RegistryObject;
    //   448: invokevirtual get : ()Ljava/lang/Object;
    //   451: checkcast net/minecraft/world/level/block/Block
    //   454: invokevirtual defaultBlockState : ()Lnet/minecraft/world/level/block/state/BlockState;
    //   457: iconst_3
    //   458: invokeinterface setBlock : (Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;I)Z
    //   463: pop
    //   464: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #17	-> 0
    //   #18	-> 5
    //   #19	-> 6
    //   #20	-> 9
    //   #21	-> 12
    //   #22	-> 15
    //   #23	-> 18
    //   #24	-> 26
    //   #25	-> 61
    //   #26	-> 96
    //   #27	-> 107
    //   #28	-> 112
    //   #29	-> 133
    //   #30	-> 149
    //   #31	-> 154
    //   #32	-> 157
    //   #33	-> 167
    //   #34	-> 172
    //   #35	-> 182
    //   #36	-> 187
    //   #37	-> 197
    //   #38	-> 253
    //   #39	-> 288
    //   #40	-> 302
    //   #42	-> 305
    //   #36	-> 311
    //   #44	-> 317
    //   #34	-> 323
    //   #46	-> 329
    //   #32	-> 335
    //   #48	-> 341
    //   #49	-> 347
    //   #50	-> 389
    //   #51	-> 417
    //   #52	-> 431
    //   #56	-> 464
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   41	8	15	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
    //   76	8	16	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
    //   125	24	17	_level	Lnet/minecraft/world/level/Level;
    //   190	127	19	index2	I
    //   175	154	18	index1	I
    //   160	181	17	index0	I
    //   0	465	0	world	Lnet/minecraft/world/level/LevelAccessor;
    //   0	465	1	x	D
    //   0	465	3	y	D
    //   0	465	5	z	D
    //   0	465	7	entity	Lnet/minecraft/world/entity/Entity;
    //   9	456	8	found	Z
    //   12	453	9	sx	D
    //   15	450	11	sy	D
    //   18	447	13	sz	D
  }
}


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\DarkLatexCreeperRightClickedOnEntityProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */