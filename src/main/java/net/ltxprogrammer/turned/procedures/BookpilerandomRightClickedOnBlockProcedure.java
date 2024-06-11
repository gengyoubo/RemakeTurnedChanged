/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ 
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class BookpilerandomRightClickedOnBlockProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/*    */     // Byte code:
/*    */     //   0: aload #7
/*    */     //   2: ifnonnull -> 6
/*    */     //   5: return
/*    */     //   6: aload_0
/*    */     //   7: new net/minecraft/core/BlockPos
/*    */     //   10: dup
/*    */     //   11: dload_1
/*    */     //   12: dload_3
/*    */     //   13: dconst_1
/*    */     //   14: dadd
/*    */     //   15: dload #5
/*    */     //   17: invokespecial <init> : (DDD)V
/*    */     //   20: invokeinterface m_8055_ : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;
/*    */     //   25: invokevirtual m_60734_ : ()Lnet/minecraft/world/level/block/Block;
/*    */     //   28: getstatic net/minecraft/world/level/block/Blocks.f_50016_ : Lnet/minecraft/world/level/block/Block;
/*    */     //   31: if_acmpne -> 343
/*    */     //   34: aload #7
/*    */     //   36: instanceof net/minecraft/world/entity/player/Player
/*    */     //   39: ifeq -> 64
/*    */     //   42: aload #7
/*    */     //   44: checkcast net/minecraft/world/entity/player/Player
/*    */     //   47: astore #8
/*    */     //   49: aload #8
/*    */     //   51: invokevirtual m_150110_ : ()Lnet/minecraft/world/entity/player/Abilities;
/*    */     //   54: getfield f_35937_ : Z
/*    */     //   57: ifeq -> 64
/*    */     //   60: iconst_1
/*    */     //   61: goto -> 65
/*    */     //   64: iconst_0
/*    */     //   65: ifne -> 126
/*    */     //   68: aload #7
/*    */     //   70: instanceof net/minecraft/world/entity/player/Player
/*    */     //   73: ifeq -> 126
/*    */     //   76: aload #7
/*    */     //   78: checkcast net/minecraft/world/entity/player/Player
/*    */     //   81: astore #9
/*    */     //   83: new net/minecraft/world/item/ItemStack
/*    */     //   86: dup
/*    */     //   87: getstatic net/ltxprogrammer/turned/init/LatexModItems.BOOKPILERANDOM : Lnet/minecraftforge/registries/RegistryObject;
/*    */     //   90: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   93: checkcast net/minecraft/world/level/ItemLike
/*    */     //   96: invokespecial <init> : (Lnet/minecraft/world/level/ItemLike;)V
/*    */     //   99: astore #10
/*    */     //   101: aload #9
/*    */     //   103: invokevirtual m_150109_ : ()Lnet/minecraft/world/entity/player/Inventory;
/*    */     //   106: aload #10
/*    */     //   108: <illegal opcode> test : (Lnet/minecraft/world/item/ItemStack;)Ljava/util/function/Predicate;
/*    */     //   113: iconst_1
/*    */     //   114: aload #9
/*    */     //   116: getfield f_36095_ : Lnet/minecraft/world/inventory/InventoryMenu;
/*    */     //   119: invokevirtual m_39730_ : ()Lnet/minecraft/world/inventory/CraftingContainer;
/*    */     //   122: invokevirtual m_36022_ : (Ljava/util/function/Predicate;ILnet/minecraft/world/Container;)I
/*    */     //   125: pop
/*    */     //   126: invokestatic random : ()D
/*    */     //   129: invokestatic random : ()D
/*    */     //   132: dcmpg
/*    */     //   133: ifge -> 172
/*    */     //   136: aload_0
/*    */     //   137: new net/minecraft/core/BlockPos
/*    */     //   140: dup
/*    */     //   141: dload_1
/*    */     //   142: dload_3
/*    */     //   143: dconst_1
/*    */     //   144: dadd
/*    */     //   145: dload #5
/*    */     //   147: invokespecial <init> : (DDD)V
/*    */     //   150: getstatic net/ltxprogrammer/turned/init/LatexModBlocks.BOOKPILE_1 : Lnet/minecraftforge/registries/RegistryObject;
/*    */     //   153: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   156: checkcast net/minecraft/world/level/block/Block
/*    */     //   159: invokevirtual m_49966_ : ()Lnet/minecraft/world/level/block/state/BlockState;
/*    */     //   162: iconst_3
/*    */     //   163: invokeinterface m_7731_ : (Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;I)Z
/*    */     //   168: pop
/*    */     //   169: goto -> 343
/*    */     //   172: invokestatic random : ()D
/*    */     //   175: invokestatic random : ()D
/*    */     //   178: dcmpg
/*    */     //   179: ifge -> 218
/*    */     //   182: aload_0
/*    */     //   183: new net/minecraft/core/BlockPos
/*    */     //   186: dup
/*    */     //   187: dload_1
/*    */     //   188: dload_3
/*    */     //   189: dconst_1
/*    */     //   190: dadd
/*    */     //   191: dload #5
/*    */     //   193: invokespecial <init> : (DDD)V
/*    */     //   196: getstatic net/ltxprogrammer/turned/init/LatexModBlocks.BOOKPILE_2 : Lnet/minecraftforge/registries/RegistryObject;
/*    */     //   199: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   202: checkcast net/minecraft/world/level/block/Block
/*    */     //   205: invokevirtual m_49966_ : ()Lnet/minecraft/world/level/block/state/BlockState;
/*    */     //   208: iconst_3
/*    */     //   209: invokeinterface m_7731_ : (Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;I)Z
/*    */     //   214: pop
/*    */     //   215: goto -> 343
/*    */     //   218: invokestatic random : ()D
/*    */     //   221: invokestatic random : ()D
/*    */     //   224: dcmpg
/*    */     //   225: ifge -> 264
/*    */     //   228: aload_0
/*    */     //   229: new net/minecraft/core/BlockPos
/*    */     //   232: dup
/*    */     //   233: dload_1
/*    */     //   234: dload_3
/*    */     //   235: dconst_1
/*    */     //   236: dadd
/*    */     //   237: dload #5
/*    */     //   239: invokespecial <init> : (DDD)V
/*    */     //   242: getstatic net/ltxprogrammer/turned/init/LatexModBlocks.BOOKPILE_3 : Lnet/minecraftforge/registries/RegistryObject;
/*    */     //   245: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   248: checkcast net/minecraft/world/level/block/Block
/*    */     //   251: invokevirtual m_49966_ : ()Lnet/minecraft/world/level/block/state/BlockState;
/*    */     //   254: iconst_3
/*    */     //   255: invokeinterface m_7731_ : (Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;I)Z
/*    */     //   260: pop
/*    */     //   261: goto -> 343
/*    */     //   264: invokestatic random : ()D
/*    */     //   267: invokestatic random : ()D
/*    */     //   270: dcmpg
/*    */     //   271: ifge -> 310
/*    */     //   274: aload_0
/*    */     //   275: new net/minecraft/core/BlockPos
/*    */     //   278: dup
/*    */     //   279: dload_1
/*    */     //   280: dload_3
/*    */     //   281: dconst_1
/*    */     //   282: dadd
/*    */     //   283: dload #5
/*    */     //   285: invokespecial <init> : (DDD)V
/*    */     //   288: getstatic net/ltxprogrammer/turned/init/LatexModBlocks.BOOKPILE_4 : Lnet/minecraftforge/registries/RegistryObject;
/*    */     //   291: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   294: checkcast net/minecraft/world/level/block/Block
/*    */     //   297: invokevirtual m_49966_ : ()Lnet/minecraft/world/level/block/state/BlockState;
/*    */     //   300: iconst_3
/*    */     //   301: invokeinterface m_7731_ : (Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;I)Z
/*    */     //   306: pop
/*    */     //   307: goto -> 343
/*    */     //   310: aload_0
/*    */     //   311: new net/minecraft/core/BlockPos
/*    */     //   314: dup
/*    */     //   315: dload_1
/*    */     //   316: dload_3
/*    */     //   317: dconst_1
/*    */     //   318: dadd
/*    */     //   319: dload #5
/*    */     //   321: invokespecial <init> : (DDD)V
/*    */     //   324: getstatic net/ltxprogrammer/turned/init/LatexModBlocks.BOOKPILE_5 : Lnet/minecraftforge/registries/RegistryObject;
/*    */     //   327: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   330: checkcast net/minecraft/world/level/block/Block
/*    */     //   333: invokevirtual m_49966_ : ()Lnet/minecraft/world/level/block/state/BlockState;
/*    */     //   336: iconst_3
/*    */     //   337: invokeinterface m_7731_ : (Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;I)Z
/*    */     //   342: pop
/*    */     //   343: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #14	-> 0
/*    */     //   #15	-> 5
/*    */     //   #16	-> 6
/*    */     //   #17	-> 34
/*    */     //   #18	-> 68
/*    */     //   #19	-> 83
/*    */     //   #20	-> 101
/*    */     //   #21	-> 119
/*    */     //   #20	-> 122
/*    */     //   #24	-> 126
/*    */     //   #25	-> 136
/*    */     //   #26	-> 172
/*    */     //   #27	-> 182
/*    */     //   #28	-> 218
/*    */     //   #29	-> 228
/*    */     //   #30	-> 264
/*    */     //   #31	-> 274
/*    */     //   #33	-> 310
/*    */     //   #36	-> 343
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   49	15	8	_plr	Lnet/minecraft/world/entity/player/Player;
/*    */     //   101	25	10	_stktoremove	Lnet/minecraft/world/item/ItemStack;
/*    */     //   83	43	9	_player	Lnet/minecraft/world/entity/player/Player;
/*    */     //   0	344	0	world	Lnet/minecraft/world/level/LevelAccessor;
/*    */     //   0	344	1	x	D
/*    */     //   0	344	3	y	D
/*    */     //   0	344	5	z	D
/*    */     //   0	344	7	entity	Lnet/minecraft/world/entity/Entity;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\BookpilerandomRightClickedOnBlockProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */