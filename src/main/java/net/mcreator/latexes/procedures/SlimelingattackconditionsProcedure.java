/*    */ package net.mcreator.latexes.procedures;
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
/*    */     //   27: invokevirtual getItemBySlot : (Lnet/minecraft/world/entity/EquipmentSlot;)Lnet/minecraft/world/item/ItemStack;
/*    */     //   30: goto -> 36
/*    */     //   33: getstatic net/minecraft/world/item/ItemStack.EMPTY : Lnet/minecraft/world/item/ItemStack;
/*    */     //   36: invokevirtual getItem : ()Lnet/minecraft/world/item/Item;
/*    */     //   39: getstatic net/mcreator/latexes/init/LatexModItems.DLMASK_HELMET : Lnet/minecraftforge/registries/RegistryObject;
/*    */     //   42: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   45: if_acmpeq -> 207
/*    */     //   48: aload #7
/*    */     //   50: instanceof net/minecraft/world/entity/TamableAnimal
/*    */     //   53: ifeq -> 71
/*    */     //   56: aload #7
/*    */     //   58: checkcast net/minecraft/world/entity/TamableAnimal
/*    */     //   61: astore #9
/*    */     //   63: aload #9
/*    */     //   65: invokevirtual getOwner : ()Lnet/minecraft/world/entity/LivingEntity;
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
/*    */     //   95: invokestatic ofSize : (Lnet/minecraft/world/phys/Vec3;DDD)Lnet/minecraft/world/phys/AABB;
/*    */     //   98: <illegal opcode> test : ()Ljava/util/function/Predicate;
/*    */     //   103: invokeinterface getEntitiesOfClass : (Ljava/lang/Class;Lnet/minecraft/world/phys/AABB;Ljava/util/function/Predicate;)Ljava/util/List;
/*    */     //   108: invokeinterface stream : ()Ljava/util/stream/Stream;
/*    */     //   113: new net/mcreator/latexes/procedures/SlimelingattackconditionsProcedure$1
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
/*    */     //   141: checkcast net/minecraft/world/entity/Entity
/*    */     //   144: if_acmpne -> 151
/*    */     //   147: iconst_1
/*    */     //   148: goto -> 152
/*    */     //   151: iconst_0
/*    */     //   152: iconst_1
/*    */     //   153: if_icmpne -> 207
/*    */     //   156: aload_0
/*    */     //   157: invokeinterface getDifficulty : ()Lnet/minecraft/world/Difficulty;
/*    */     //   162: getstatic net/minecraft/world/Difficulty.PEACEFUL : Lnet/minecraft/world/Difficulty;
/*    */     //   165: if_acmpne -> 172
/*    */     //   168: iconst_1
/*    */     //   169: goto -> 173
/*    */     //   172: iconst_0
/*    */     //   173: iconst_1
/*    */     //   174: if_icmpeq -> 211
/*    */     //   177: aload_0
/*    */     //   178: instanceof net/minecraft/world/level/Level
/*    */     //   181: ifeq -> 202
/*    */     //   184: aload_0
/*    */     //   185: checkcast net/minecraft/world/level/Level
/*    */     //   188: astore #8
/*    */     //   190: aload #8
/*    */     //   192: invokevirtual isDay : ()Z
/*    */     //   195: ifeq -> 202
/*    */     //   198: iconst_1
/*    */     //   199: goto -> 203
/*    */     //   202: iconst_0
/*    */     //   203: iconst_1
/*    */     //   204: if_icmpeq -> 211
/*    */     //   207: iconst_1
/*    */     //   208: goto -> 212
/*    */     //   211: iconst_0
/*    */     //   212: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #21	-> 0
/*    */     //   #22	-> 5
/*    */     //   #23	-> 7
/*    */     //   #24	-> 36
/*    */     //   #25	-> 48
/*    */     //   #26	-> 95
/*    */     //   #30	-> 124
/*    */     //   #26	-> 127
/*    */     //   #30	-> 132
/*    */     //   #31	-> 157
/*    */     //   #23	-> 212
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   22	11	10	_entGetArmor	Lnet/minecraft/world/entity/LivingEntity;
/*    */     //   63	8	9	_tamEnt	Lnet/minecraft/world/entity/TamableAnimal;
/*    */     //   190	12	8	_lvl	Lnet/minecraft/world/level/Level;
/*    */     //   0	213	0	world	Lnet/minecraft/world/level/LevelAccessor;
/*    */     //   0	213	1	x	D
/*    */     //   0	213	3	y	D
/*    */     //   0	213	5	z	D
/*    */     //   0	213	7	entity	Lnet/minecraft/world/entity/Entity;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\SlimelingattackconditionsProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */