/*    */ package net.mcreator.latexes.procedures;
/*    */ 
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class DarklatexblockOnBlockRightClickedProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/*    */     // Byte code:
/*    */     //   0: aload #7
/*    */     //   2: ifnonnull -> 6
/*    */     //   5: return
/*    */     //   6: aload #7
/*    */     //   8: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   11: ifeq -> 29
/*    */     //   14: aload #7
/*    */     //   16: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   19: astore #8
/*    */     //   21: aload #8
/*    */     //   23: invokevirtual getOffhandItem : ()Lnet/minecraft/world/item/ItemStack;
/*    */     //   26: goto -> 32
/*    */     //   29: getstatic net/minecraft/world/item/ItemStack.EMPTY : Lnet/minecraft/world/item/ItemStack;
/*    */     //   32: invokevirtual getItem : ()Lnet/minecraft/world/item/Item;
/*    */     //   35: getstatic net/minecraft/world/item/Items.BONE_MEAL : Lnet/minecraft/world/item/Item;
/*    */     //   38: if_acmpeq -> 76
/*    */     //   41: aload #7
/*    */     //   43: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   46: ifeq -> 64
/*    */     //   49: aload #7
/*    */     //   51: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   54: astore #9
/*    */     //   56: aload #9
/*    */     //   58: invokevirtual getMainHandItem : ()Lnet/minecraft/world/item/ItemStack;
/*    */     //   61: goto -> 67
/*    */     //   64: getstatic net/minecraft/world/item/ItemStack.EMPTY : Lnet/minecraft/world/item/ItemStack;
/*    */     //   67: invokevirtual getItem : ()Lnet/minecraft/world/item/Item;
/*    */     //   70: getstatic net/minecraft/world/item/Items.BONE_MEAL : Lnet/minecraft/world/item/Item;
/*    */     //   73: if_acmpne -> 316
/*    */     //   76: aload_0
/*    */     //   77: instanceof net/minecraft/server/level/ServerLevel
/*    */     //   80: ifeq -> 109
/*    */     //   83: aload_0
/*    */     //   84: checkcast net/minecraft/server/level/ServerLevel
/*    */     //   87: astore #10
/*    */     //   89: aload #10
/*    */     //   91: getstatic net/minecraft/core/particles/ParticleTypes.HAPPY_VILLAGER : Lnet/minecraft/core/particles/SimpleParticleType;
/*    */     //   94: dload_1
/*    */     //   95: dload_3
/*    */     //   96: dload #5
/*    */     //   98: iconst_5
/*    */     //   99: dconst_1
/*    */     //   100: ldc2_w 2.0
/*    */     //   103: dconst_1
/*    */     //   104: dconst_1
/*    */     //   105: invokevirtual sendParticles : (Lnet/minecraft/core/particles/ParticleOptions;DDDIDDDD)I
/*    */     //   108: pop
/*    */     //   109: aload #7
/*    */     //   111: instanceof net/minecraft/world/entity/player/Player
/*    */     //   114: ifeq -> 161
/*    */     //   117: aload #7
/*    */     //   119: checkcast net/minecraft/world/entity/player/Player
/*    */     //   122: astore #10
/*    */     //   124: new net/minecraft/world/item/ItemStack
/*    */     //   127: dup
/*    */     //   128: getstatic net/minecraft/world/item/Items.BONE_MEAL : Lnet/minecraft/world/item/Item;
/*    */     //   131: invokespecial <init> : (Lnet/minecraft/world/level/ItemLike;)V
/*    */     //   134: astore #11
/*    */     //   136: aload #10
/*    */     //   138: invokevirtual getInventory : ()Lnet/minecraft/world/entity/player/Inventory;
/*    */     //   141: aload #11
/*    */     //   143: <illegal opcode> test : (Lnet/minecraft/world/item/ItemStack;)Ljava/util/function/Predicate;
/*    */     //   148: iconst_1
/*    */     //   149: aload #10
/*    */     //   151: getfield inventoryMenu : Lnet/minecraft/world/inventory/InventoryMenu;
/*    */     //   154: invokevirtual getCraftSlots : ()Lnet/minecraft/world/inventory/CraftingContainer;
/*    */     //   157: invokevirtual clearOrCountMatchingItems : (Ljava/util/function/Predicate;ILnet/minecraft/world/Container;)I
/*    */     //   160: pop
/*    */     //   161: new net/minecraft/core/BlockPos
/*    */     //   164: dup
/*    */     //   165: dload_1
/*    */     //   166: dload_3
/*    */     //   167: dload #5
/*    */     //   169: invokespecial <init> : (DDD)V
/*    */     //   172: astore #10
/*    */     //   174: getstatic net/mcreator/latexes/init/LatexModBlocks.DARKLATEXBLOCKHARMLESS : Lnet/minecraftforge/registries/RegistryObject;
/*    */     //   177: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   180: checkcast net/minecraft/world/level/block/Block
/*    */     //   183: invokevirtual defaultBlockState : ()Lnet/minecraft/world/level/block/state/BlockState;
/*    */     //   186: astore #11
/*    */     //   188: aload_0
/*    */     //   189: aload #10
/*    */     //   191: invokeinterface getBlockState : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;
/*    */     //   196: astore #12
/*    */     //   198: aload #12
/*    */     //   200: invokevirtual getValues : ()Lcom/google/common/collect/ImmutableMap;
/*    */     //   203: invokevirtual entrySet : ()Lcom/google/common/collect/ImmutableSet;
/*    */     //   206: invokevirtual iterator : ()Lcom/google/common/collect/UnmodifiableIterator;
/*    */     //   209: astore #13
/*    */     //   211: aload #13
/*    */     //   213: invokeinterface hasNext : ()Z
/*    */     //   218: ifeq -> 304
/*    */     //   221: aload #13
/*    */     //   223: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   228: checkcast java/util/Map$Entry
/*    */     //   231: astore #14
/*    */     //   233: aload #11
/*    */     //   235: invokevirtual getBlock : ()Lnet/minecraft/world/level/block/Block;
/*    */     //   238: invokevirtual getStateDefinition : ()Lnet/minecraft/world/level/block/state/StateDefinition;
/*    */     //   241: aload #14
/*    */     //   243: invokeinterface getKey : ()Ljava/lang/Object;
/*    */     //   248: checkcast net/minecraft/world/level/block/state/properties/Property
/*    */     //   251: invokevirtual getName : ()Ljava/lang/String;
/*    */     //   254: invokevirtual getProperty : (Ljava/lang/String;)Lnet/minecraft/world/level/block/state/properties/Property;
/*    */     //   257: astore #15
/*    */     //   259: aload #15
/*    */     //   261: ifnull -> 301
/*    */     //   264: aload #11
/*    */     //   266: aload #15
/*    */     //   268: invokevirtual getValue : (Lnet/minecraft/world/level/block/state/properties/Property;)Ljava/lang/Comparable;
/*    */     //   271: ifnull -> 301
/*    */     //   274: aload #11
/*    */     //   276: aload #15
/*    */     //   278: aload #14
/*    */     //   280: invokeinterface getValue : ()Ljava/lang/Object;
/*    */     //   285: checkcast java/lang/Comparable
/*    */     //   288: invokevirtual setValue : (Lnet/minecraft/world/level/block/state/properties/Property;Ljava/lang/Comparable;)Ljava/lang/Object;
/*    */     //   291: checkcast net/minecraft/world/level/block/state/BlockState
/*    */     //   294: astore #11
/*    */     //   296: goto -> 301
/*    */     //   299: astore #16
/*    */     //   301: goto -> 211
/*    */     //   304: aload_0
/*    */     //   305: aload #10
/*    */     //   307: aload #11
/*    */     //   309: iconst_3
/*    */     //   310: invokeinterface setBlock : (Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;I)Z
/*    */     //   315: pop
/*    */     //   316: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #21	-> 0
/*    */     //   #22	-> 5
/*    */     //   #23	-> 6
/*    */     //   #24	-> 41
/*    */     //   #25	-> 76
/*    */     //   #26	-> 89
/*    */     //   #27	-> 109
/*    */     //   #28	-> 124
/*    */     //   #29	-> 136
/*    */     //   #30	-> 154
/*    */     //   #29	-> 157
/*    */     //   #33	-> 161
/*    */     //   #34	-> 174
/*    */     //   #35	-> 188
/*    */     //   #36	-> 198
/*    */     //   #37	-> 233
/*    */     //   #38	-> 259
/*    */     //   #40	-> 274
/*    */     //   #42	-> 296
/*    */     //   #41	-> 299
/*    */     //   #43	-> 301
/*    */     //   #44	-> 304
/*    */     //   #47	-> 316
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   21	8	8	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   56	8	9	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   89	20	10	_level	Lnet/minecraft/server/level/ServerLevel;
/*    */     //   136	25	11	_stktoremove	Lnet/minecraft/world/item/ItemStack;
/*    */     //   124	37	10	_player	Lnet/minecraft/world/entity/player/Player;
/*    */     //   259	42	15	_property	Lnet/minecraft/world/level/block/state/properties/Property;
/*    */     //   233	68	14	entry	Ljava/util/Map$Entry;
/*    */     //   174	142	10	_bp	Lnet/minecraft/core/BlockPos;
/*    */     //   188	128	11	_bs	Lnet/minecraft/world/level/block/state/BlockState;
/*    */     //   198	118	12	_bso	Lnet/minecraft/world/level/block/state/BlockState;
/*    */     //   0	317	0	world	Lnet/minecraft/world/level/LevelAccessor;
/*    */     //   0	317	1	x	D
/*    */     //   0	317	3	y	D
/*    */     //   0	317	5	z	D
/*    */     //   0	317	7	entity	Lnet/minecraft/world/entity/Entity;
/*    */     // Local variable type table:
/*    */     //   start	length	slot	name	signature
/*    */     //   233	68	14	entry	Ljava/util/Map$Entry<Lnet/minecraft/world/level/block/state/properties/Property<*>;Ljava/lang/Comparable<*>;>;
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   274	296	299	java/lang/Exception
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\DarklatexblockOnBlockRightClickedProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */