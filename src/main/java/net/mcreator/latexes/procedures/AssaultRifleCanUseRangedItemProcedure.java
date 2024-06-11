package net.mcreator.latexes.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.ItemStack;

public class AssaultRifleCanUseRangedItemProcedure {
  public static boolean execute(Entity entity, ItemStack itemstack) {
    // Byte code:
    //   0: aload_0
    //   1: ifnonnull -> 6
    //   4: iconst_0
    //   5: ireturn
    //   6: aload_1
    //   7: invokevirtual getOrCreateTag : ()Lnet/minecraft/nbt/CompoundTag;
    //   10: ldc 'ammo'
    //   12: invokevirtual getDouble : (Ljava/lang/String;)D
    //   15: dconst_0
    //   16: dcmpl
    //   17: ifle -> 128
    //   20: aload_0
    //   21: instanceof net/minecraft/world/entity/LivingEntity
    //   24: ifeq -> 41
    //   27: aload_0
    //   28: checkcast net/minecraft/world/entity/LivingEntity
    //   31: astore #4
    //   33: aload #4
    //   35: invokevirtual getMainHandItem : ()Lnet/minecraft/world/item/ItemStack;
    //   38: goto -> 44
    //   41: getstatic net/minecraft/world/item/ItemStack.EMPTY : Lnet/minecraft/world/item/ItemStack;
    //   44: invokevirtual getItem : ()Lnet/minecraft/world/item/Item;
    //   47: getstatic net/mcreator/latexes/init/LatexModItems.AR_70_ASSAULT_RIFLE : Lnet/minecraftforge/registries/RegistryObject;
    //   50: invokevirtual get : ()Ljava/lang/Object;
    //   53: if_acmpeq -> 124
    //   56: aload_0
    //   57: instanceof net/minecraft/world/entity/LivingEntity
    //   60: ifeq -> 75
    //   63: aload_0
    //   64: checkcast net/minecraft/world/entity/LivingEntity
    //   67: astore_3
    //   68: aload_3
    //   69: invokevirtual getMainHandItem : ()Lnet/minecraft/world/item/ItemStack;
    //   72: goto -> 78
    //   75: getstatic net/minecraft/world/item/ItemStack.EMPTY : Lnet/minecraft/world/item/ItemStack;
    //   78: invokevirtual getItem : ()Lnet/minecraft/world/item/Item;
    //   81: getstatic net/mcreator/latexes/init/LatexModItems.M_4_ASSAULT_RIFLE : Lnet/minecraftforge/registries/RegistryObject;
    //   84: invokevirtual get : ()Ljava/lang/Object;
    //   87: if_acmpeq -> 124
    //   90: aload_0
    //   91: instanceof net/minecraft/world/entity/LivingEntity
    //   94: ifeq -> 109
    //   97: aload_0
    //   98: checkcast net/minecraft/world/entity/LivingEntity
    //   101: astore_2
    //   102: aload_2
    //   103: invokevirtual getMainHandItem : ()Lnet/minecraft/world/item/ItemStack;
    //   106: goto -> 112
    //   109: getstatic net/minecraft/world/item/ItemStack.EMPTY : Lnet/minecraft/world/item/ItemStack;
    //   112: invokevirtual getItem : ()Lnet/minecraft/world/item/Item;
    //   115: getstatic net/mcreator/latexes/init/LatexModItems.SCRAP_M_16_RIFLE : Lnet/minecraftforge/registries/RegistryObject;
    //   118: invokevirtual get : ()Ljava/lang/Object;
    //   121: if_acmpne -> 128
    //   124: iconst_1
    //   125: goto -> 129
    //   128: iconst_0
    //   129: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #11	-> 0
    //   #12	-> 4
    //   #14	-> 6
    //   #13	-> 7
    //   #14	-> 20
    //   #15	-> 44
    //   #16	-> 56
    //   #17	-> 78
    //   #18	-> 90
    //   #19	-> 112
    //   #13	-> 129
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   33	8	4	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
    //   68	7	3	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
    //   102	7	2	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
    //   0	130	0	entity	Lnet/minecraft/world/entity/Entity;
    //   0	130	1	itemstack	Lnet/minecraft/world/item/ItemStack;
  }
}


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\AssaultRifleCanUseRangedItemProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */