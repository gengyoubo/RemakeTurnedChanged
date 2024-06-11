/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ 
/*    */ import java.util.Comparator;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class SlimelingattackconditionsProcedure {
/*    */   public static boolean execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/*    */     // Byte code:
/*    */     //   0: aload #7
/*    */     //   2: ifnonnull -> 7
/*    */     //   5: iconst_0
/*    */     //   6: ireturn
/*    */     //   7: aload #7
/*    */     //   9: instanceof net/minecraft/world/entity/LivingEntity
/*    */     //   12: ifeq -> 33
/*    */     //   15: aload #7
/*    */     //   17: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   20: astore #10
/*    */     //   22: aload #10
/*    */     //   24: getstatic net/minecraft/world/entity/EquipmentSlot.HEAD : Lnet/minecraft/world/entity/EquipmentSlot;
/*    */     //   27: invokevirtual m_6844_ : (Lnet/minecraft/world/entity/EquipmentSlot;)Lnet/minecraft/world/item/ItemStack;
/*    */     //   30: goto -> 36
/*    */     //   33: getstatic net/minecraft/world/item/ItemStack.f_41583_ : Lnet/minecraft/world/item/ItemStack;
/*    */     //   36: invokevirtual m_41720_ : ()Lnet/minecraft/world/item/Item;
/*    */     //   39: getstatic net/ltxprogrammer/changed/init/ChangedItems.DARK_LATEX_MASK : Lnet/minecraftforge/registries/RegistryObject;
/*    */     //   42: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   45: if_acmpeq -> 204
/*    */     //   48: aload #7
/*    */     //   50: instanceof net/minecraft/world/entity/TamableAnimal
/*    */     //   53: ifeq -> 71
/*    */     //   56: aload #7
/*    */     //   58: checkcast net/minecraft/world/entity/TamableAnimal
/*    */     //   61: astore #9
/*    */     //   63: aload #9
/*    */     //   65: invokevirtual m_142480_ : ()Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   68: goto -> 72
/*    */     //   71: aconst_null
/*    */     //   72: aload_0
/*    */     //   73: ldc net/minecraft/world/entity/player/Player
/*    */     //   75: new net/minecraft/world/phys/Vec3
/*    */     //   78: dup
/*    */     //   79: dload_1
/*    */     //   80: dload_3
/*    */     //   81: dload #5
/*    */     //   83: invokespecial <init> : (DDD)V
/*    */     //   86: ldc2_w 6.0
/*    */     //   89: ldc2_w 6.0
/*    */     //   92: ldc2_w 6.0
/*    */     //   95: invokestatic m_165882_ : (Lnet/minecraft/world/phys/Vec3;DDD)Lnet/minecraft/world/phys/AABB;
/*    */     //   98: <illegal opcode> test : ()Ljava/util/function/Predicate;
/*    */     //   103: invokeinterface m_6443_ : (Ljava/lang/Class;Lnet/minecraft/world/phys/AABB;Ljava/util/function/Predicate;)Ljava/util/List;
/*    */     //   108: invokeinterface stream : ()Ljava/util/stream/Stream;
/*    */     //   113: new net/ltxprogrammer/turned/procedures/SlimelingattackconditionsProcedure$1
/*    */     //   116: dup
/*    */     //   117: invokespecial <init> : ()V
/*    */     //   120: dload_1
/*    */     //   121: dload_3
/*    */     //   122: dload #5
/*    */     //   124: invokevirtual compareDistOf : (DDD)Ljava/util/Comparator;
/*    */     //   127: invokeinterface sorted : (Ljava/util/Comparator;)Ljava/util/stream/Stream;
/*    */     //   132: invokeinterface findFirst : ()Ljava/util/Optional;
/*    */     //   137: aconst_null
/*    */     //   138: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   141: if_acmpne -> 148
/*    */     //   144: iconst_1
/*    */     //   145: goto -> 149
/*    */     //   148: iconst_0
/*    */     //   149: iconst_1
/*    */     //   150: if_icmpne -> 204
/*    */     //   153: aload_0
/*    */     //   154: invokeinterface m_46791_ : ()Lnet/minecraft/world/Difficulty;
/*    */     //   159: getstatic net/minecraft/world/Difficulty.PEACEFUL : Lnet/minecraft/world/Difficulty;
/*    */     //   162: if_acmpne -> 169
/*    */     //   165: iconst_1
/*    */     //   166: goto -> 170
/*    */     //   169: iconst_0
/*    */     //   170: iconst_1
/*    */     //   171: if_icmpeq -> 208
/*    */     //   174: aload_0
/*    */     //   175: instanceof net/minecraft/world/level/Level
/*    */     //   178: ifeq -> 199
/*    */     //   181: aload_0
/*    */     //   182: checkcast net/minecraft/world/level/Level
/*    */     //   185: astore #8
/*    */     //   187: aload #8
/*    */     //   189: invokevirtual m_46461_ : ()Z
/*    */     //   192: ifeq -> 199
/*    */     //   195: iconst_1
/*    */     //   196: goto -> 200
/*    */     //   199: iconst_0
/*    */     //   200: iconst_1
/*    */     //   201: if_icmpeq -> 208
/*    */     //   204: iconst_1
/*    */     //   205: goto -> 209
/*    */     //   208: iconst_0
/*    */     //   209: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #20	-> 0
/*    */     //   #21	-> 5
/*    */     //   #22	-> 7
/*    */     //   #23	-> 36
/*    */     //   #24	-> 48
/*    */     //   #25	-> 95
/*    */     //   #29	-> 124
/*    */     //   #25	-> 127
/*    */     //   #29	-> 132
/*    */     //   #30	-> 154
/*    */     //   #22	-> 209
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   22	11	10	_entGetArmor	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   63	8	9	_tamEnt	Lnet/minecraft/world/entity/TamableAnimal;
/*    */     //   187	12	8	_lvl	Lnet/minecraft/world/level/Level;
/*    */     //   0	210	0	world	Lnet/minecraft/world/level/LevelAccessor;
/*    */     //   0	210	1	x	D
/*    */     //   0	210	3	y	D
/*    */     //   0	210	5	z	D
/*    */     //   0	210	7	entity	Lnet/minecraft/world/entity/Entity;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\SlimelingattackconditionsProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */