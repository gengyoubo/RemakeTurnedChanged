package net.ltxprogrammer.turned.procedures;

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
    //   20: invokevirtual m_6060_ : ()Z
    //   23: ifne -> 96
    //   26: aload #7
    //   28: instanceof net/minecraft/world/entity/LivingEntity
    //   31: ifeq -> 49
    //   34: aload #7
    //   36: checkcast net/minecraft/world/entity/LivingEntity
    //   39: astore #15
    //   41: aload #15
    //   43: invokevirtual m_21205_ : ()Lnet/minecraft/world/item/ItemStack;
    //   46: goto -> 52
    //   49: getstatic net/minecraft/world/item/ItemStack.f_41583_ : Lnet/minecraft/world/item/ItemStack;
    //   52: invokevirtual m_41720_ : ()Lnet/minecraft/world/item/Item;
    //   55: getstatic net/minecraft/world/item/Items.f_42409_ : Lnet/minecraft/world/item/Item;
    //   58: if_acmpeq -> 96
    //   61: aload #7
    //   63: instanceof net/minecraft/world/entity/LivingEntity
    //   66: ifeq -> 84
    //   69: aload #7
    //   71: checkcast net/minecraft/world/entity/LivingEntity
    //   74: astore #16
    //   76: aload #16
    //   78: invokevirtual m_21205_ : ()Lnet/minecraft/world/item/ItemStack;
    //   81: goto -> 87
    //   84: getstatic net/minecraft/world/item/ItemStack.f_41583_ : Lnet/minecraft/world/item/ItemStack;
    //   87: invokevirtual m_41720_ : ()Lnet/minecraft/world/item/Item;
    //   90: getstatic net/minecraft/world/item/Items.f_42613_ : Lnet/minecraft/world/item/Item;
    //   93: if_acmpne -> 149
    //   96: aload #7
    //   98: getfield f_19853_ : Lnet/minecraft/world/level/Level;
    //   101: invokevirtual m_5776_ : ()Z
    //   104: ifne -> 112
    //   107: aload #7
    //   109: invokevirtual m_146870_ : ()V
    //   112: aload_0
    //   113: instanceof net/minecraft/world/level/Level
    //   116: ifeq -> 149
    //   119: aload_0
    //   120: checkcast net/minecraft/world/level/Level
    //   123: astore #17
    //   125: aload #17
    //   127: invokevirtual m_5776_ : ()Z
    //   130: ifne -> 149
    //   133: aload #17
    //   135: aconst_null
    //   136: dload_1
    //   137: dload_3
    //   138: dload #5
    //   140: ldc 5.0
    //   142: getstatic net/minecraft/world/level/Explosion$BlockInteraction.BREAK : Lnet/minecraft/world/level/Explosion$BlockInteraction;
    //   145: invokevirtual m_46511_ : (Lnet/minecraft/world/entity/Entity;DDDFLnet/minecraft/world/level/Explosion$BlockInteraction;)Lnet/minecraft/world/level/Explosion;
    //   148: pop
    //   149: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #13	-> 0
    //   #14	-> 5
    //   #15	-> 6
    //   #16	-> 9
    //   #17	-> 12
    //   #18	-> 15
    //   #19	-> 18
    //   #20	-> 26
    //   #21	-> 61
    //   #22	-> 96
    //   #23	-> 107
    //   #24	-> 112
    //   #25	-> 133
    //   #27	-> 149
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   41	8	15	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
    //   76	8	16	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
    //   125	24	17	_level	Lnet/minecraft/world/level/Level;
    //   0	150	0	world	Lnet/minecraft/world/level/LevelAccessor;
    //   0	150	1	x	D
    //   0	150	3	y	D
    //   0	150	5	z	D
    //   0	150	7	entity	Lnet/minecraft/world/entity/Entity;
    //   9	141	8	found	Z
    //   12	138	9	sx	D
    //   15	135	11	sy	D
    //   18	132	13	sz	D
  }
}


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\DarkLatexCreeperRightClickedOnEntityProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */