package net.mcreator.latexes.procedures;

import net.minecraft.world.entity.Entity;

public class ReloadkeyOnKeyPressedProcedure {
  public static void execute(Entity entity) {
    // Byte code:
    //   0: aload_0
    //   1: ifnonnull -> 5
    //   4: return
    //   5: aload_0
    //   6: instanceof net/minecraft/world/entity/LivingEntity
    //   9: ifeq -> 24
    //   12: aload_0
    //   13: checkcast net/minecraft/world/entity/LivingEntity
    //   16: astore_1
    //   17: aload_1
    //   18: invokevirtual getMainHandItem : ()Lnet/minecraft/world/item/ItemStack;
    //   21: goto -> 27
    //   24: getstatic net/minecraft/world/item/ItemStack.EMPTY : Lnet/minecraft/world/item/ItemStack;
    //   27: invokevirtual getItem : ()Lnet/minecraft/world/item/Item;
    //   30: getstatic net/mcreator/latexes/init/LatexModItems.DARTRIFLE : Lnet/minecraftforge/registries/RegistryObject;
    //   33: invokevirtual get : ()Ljava/lang/Object;
    //   36: if_acmpne -> 43
    //   39: aload_0
    //   40: invokestatic execute : (Lnet/minecraft/world/entity/Entity;)V
    //   43: aload_0
    //   44: instanceof net/minecraft/world/entity/LivingEntity
    //   47: ifeq -> 62
    //   50: aload_0
    //   51: checkcast net/minecraft/world/entity/LivingEntity
    //   54: astore_1
    //   55: aload_1
    //   56: invokevirtual getMainHandItem : ()Lnet/minecraft/world/item/ItemStack;
    //   59: goto -> 65
    //   62: getstatic net/minecraft/world/item/ItemStack.EMPTY : Lnet/minecraft/world/item/ItemStack;
    //   65: invokevirtual getItem : ()Lnet/minecraft/world/item/Item;
    //   68: getstatic net/mcreator/latexes/init/LatexModItems.LATEX_DART_RIFLE : Lnet/minecraftforge/registries/RegistryObject;
    //   71: invokevirtual get : ()Ljava/lang/Object;
    //   74: if_acmpne -> 81
    //   77: aload_0
    //   78: invokestatic execute : (Lnet/minecraft/world/entity/Entity;)V
    //   81: aload_0
    //   82: instanceof net/minecraft/world/entity/LivingEntity
    //   85: ifeq -> 100
    //   88: aload_0
    //   89: checkcast net/minecraft/world/entity/LivingEntity
    //   92: astore_1
    //   93: aload_1
    //   94: invokevirtual getMainHandItem : ()Lnet/minecraft/world/item/ItemStack;
    //   97: goto -> 103
    //   100: getstatic net/minecraft/world/item/ItemStack.EMPTY : Lnet/minecraft/world/item/ItemStack;
    //   103: invokevirtual getItem : ()Lnet/minecraft/world/item/Item;
    //   106: getstatic net/mcreator/latexes/init/LatexModItems.M_4_ASSAULT_RIFLE : Lnet/minecraftforge/registries/RegistryObject;
    //   109: invokevirtual get : ()Ljava/lang/Object;
    //   112: if_acmpeq -> 149
    //   115: aload_0
    //   116: instanceof net/minecraft/world/entity/LivingEntity
    //   119: ifeq -> 134
    //   122: aload_0
    //   123: checkcast net/minecraft/world/entity/LivingEntity
    //   126: astore_2
    //   127: aload_2
    //   128: invokevirtual getMainHandItem : ()Lnet/minecraft/world/item/ItemStack;
    //   131: goto -> 137
    //   134: getstatic net/minecraft/world/item/ItemStack.EMPTY : Lnet/minecraft/world/item/ItemStack;
    //   137: invokevirtual getItem : ()Lnet/minecraft/world/item/Item;
    //   140: getstatic net/mcreator/latexes/init/LatexModItems.SCRAP_M_16_RIFLE : Lnet/minecraftforge/registries/RegistryObject;
    //   143: invokevirtual get : ()Ljava/lang/Object;
    //   146: if_acmpne -> 153
    //   149: aload_0
    //   150: invokestatic execute : (Lnet/minecraft/world/entity/Entity;)V
    //   153: aload_0
    //   154: instanceof net/minecraft/world/entity/LivingEntity
    //   157: ifeq -> 172
    //   160: aload_0
    //   161: checkcast net/minecraft/world/entity/LivingEntity
    //   164: astore_1
    //   165: aload_1
    //   166: invokevirtual getMainHandItem : ()Lnet/minecraft/world/item/ItemStack;
    //   169: goto -> 175
    //   172: getstatic net/minecraft/world/item/ItemStack.EMPTY : Lnet/minecraft/world/item/ItemStack;
    //   175: invokevirtual getItem : ()Lnet/minecraft/world/item/Item;
    //   178: getstatic net/mcreator/latexes/init/LatexModItems.AR_70_ASSAULT_RIFLE : Lnet/minecraftforge/registries/RegistryObject;
    //   181: invokevirtual get : ()Ljava/lang/Object;
    //   184: if_acmpne -> 191
    //   187: aload_0
    //   188: invokestatic execute : (Lnet/minecraft/world/entity/Entity;)V
    //   191: aload_0
    //   192: instanceof net/minecraft/world/entity/LivingEntity
    //   195: ifeq -> 210
    //   198: aload_0
    //   199: checkcast net/minecraft/world/entity/LivingEntity
    //   202: astore_1
    //   203: aload_1
    //   204: invokevirtual getMainHandItem : ()Lnet/minecraft/world/item/ItemStack;
    //   207: goto -> 213
    //   210: getstatic net/minecraft/world/item/ItemStack.EMPTY : Lnet/minecraft/world/item/ItemStack;
    //   213: invokevirtual getItem : ()Lnet/minecraft/world/item/Item;
    //   216: getstatic net/mcreator/latexes/init/LatexModItems.FLAMETHOWER : Lnet/minecraftforge/registries/RegistryObject;
    //   219: invokevirtual get : ()Ljava/lang/Object;
    //   222: if_acmpne -> 229
    //   225: aload_0
    //   226: invokestatic execute : (Lnet/minecraft/world/entity/Entity;)V
    //   229: aload_0
    //   230: instanceof net/minecraft/world/entity/LivingEntity
    //   233: ifeq -> 248
    //   236: aload_0
    //   237: checkcast net/minecraft/world/entity/LivingEntity
    //   240: astore_1
    //   241: aload_1
    //   242: invokevirtual getMainHandItem : ()Lnet/minecraft/world/item/ItemStack;
    //   245: goto -> 251
    //   248: getstatic net/minecraft/world/item/ItemStack.EMPTY : Lnet/minecraft/world/item/ItemStack;
    //   251: invokevirtual getItem : ()Lnet/minecraft/world/item/Item;
    //   254: getstatic net/mcreator/latexes/init/LatexModItems.TSC_PISTOL : Lnet/minecraftforge/registries/RegistryObject;
    //   257: invokevirtual get : ()Ljava/lang/Object;
    //   260: if_acmpeq -> 297
    //   263: aload_0
    //   264: instanceof net/minecraft/world/entity/LivingEntity
    //   267: ifeq -> 282
    //   270: aload_0
    //   271: checkcast net/minecraft/world/entity/LivingEntity
    //   274: astore_2
    //   275: aload_2
    //   276: invokevirtual getOffhandItem : ()Lnet/minecraft/world/item/ItemStack;
    //   279: goto -> 285
    //   282: getstatic net/minecraft/world/item/ItemStack.EMPTY : Lnet/minecraft/world/item/ItemStack;
    //   285: invokevirtual getItem : ()Lnet/minecraft/world/item/Item;
    //   288: getstatic net/mcreator/latexes/init/LatexModItems.TSC_PISTOL : Lnet/minecraftforge/registries/RegistryObject;
    //   291: invokevirtual get : ()Ljava/lang/Object;
    //   294: if_acmpne -> 301
    //   297: aload_0
    //   298: invokestatic execute : (Lnet/minecraft/world/entity/Entity;)V
    //   301: aload_0
    //   302: instanceof net/minecraft/world/entity/LivingEntity
    //   305: ifeq -> 320
    //   308: aload_0
    //   309: checkcast net/minecraft/world/entity/LivingEntity
    //   312: astore_1
    //   313: aload_1
    //   314: invokevirtual getMainHandItem : ()Lnet/minecraft/world/item/ItemStack;
    //   317: goto -> 323
    //   320: getstatic net/minecraft/world/item/ItemStack.EMPTY : Lnet/minecraft/world/item/ItemStack;
    //   323: invokevirtual getItem : ()Lnet/minecraft/world/item/Item;
    //   326: getstatic net/mcreator/latexes/init/LatexModItems.OVERUNDERSHOTGUN : Lnet/minecraftforge/registries/RegistryObject;
    //   329: invokevirtual get : ()Ljava/lang/Object;
    //   332: if_acmpne -> 339
    //   335: aload_0
    //   336: invokestatic execute : (Lnet/minecraft/world/entity/Entity;)V
    //   339: aload_0
    //   340: instanceof net/minecraft/world/entity/LivingEntity
    //   343: ifeq -> 358
    //   346: aload_0
    //   347: checkcast net/minecraft/world/entity/LivingEntity
    //   350: astore_1
    //   351: aload_1
    //   352: invokevirtual getMainHandItem : ()Lnet/minecraft/world/item/ItemStack;
    //   355: goto -> 361
    //   358: getstatic net/minecraft/world/item/ItemStack.EMPTY : Lnet/minecraft/world/item/ItemStack;
    //   361: invokevirtual getItem : ()Lnet/minecraft/world/item/Item;
    //   364: getstatic net/mcreator/latexes/init/LatexModItems.MATCH_LOCK_MUSKET : Lnet/minecraftforge/registries/RegistryObject;
    //   367: invokevirtual get : ()Ljava/lang/Object;
    //   370: if_acmpne -> 377
    //   373: aload_0
    //   374: invokestatic execute : (Lnet/minecraft/world/entity/Entity;)V
    //   377: aload_0
    //   378: instanceof net/minecraft/world/entity/LivingEntity
    //   381: ifeq -> 396
    //   384: aload_0
    //   385: checkcast net/minecraft/world/entity/LivingEntity
    //   388: astore_1
    //   389: aload_1
    //   390: invokevirtual getMainHandItem : ()Lnet/minecraft/world/item/ItemStack;
    //   393: goto -> 399
    //   396: getstatic net/minecraft/world/item/ItemStack.EMPTY : Lnet/minecraft/world/item/ItemStack;
    //   399: invokevirtual getItem : ()Lnet/minecraft/world/item/Item;
    //   402: getstatic net/mcreator/latexes/init/LatexModItems.MATCHLOCK_PISTOL : Lnet/minecraftforge/registries/RegistryObject;
    //   405: invokevirtual get : ()Ljava/lang/Object;
    //   408: if_acmpeq -> 445
    //   411: aload_0
    //   412: instanceof net/minecraft/world/entity/LivingEntity
    //   415: ifeq -> 430
    //   418: aload_0
    //   419: checkcast net/minecraft/world/entity/LivingEntity
    //   422: astore_2
    //   423: aload_2
    //   424: invokevirtual getOffhandItem : ()Lnet/minecraft/world/item/ItemStack;
    //   427: goto -> 433
    //   430: getstatic net/minecraft/world/item/ItemStack.EMPTY : Lnet/minecraft/world/item/ItemStack;
    //   433: invokevirtual getItem : ()Lnet/minecraft/world/item/Item;
    //   436: getstatic net/mcreator/latexes/init/LatexModItems.MATCHLOCK_PISTOL : Lnet/minecraftforge/registries/RegistryObject;
    //   439: invokevirtual get : ()Ljava/lang/Object;
    //   442: if_acmpne -> 449
    //   445: aload_0
    //   446: invokestatic execute : (Lnet/minecraft/world/entity/Entity;)V
    //   449: aload_0
    //   450: instanceof net/minecraft/world/entity/LivingEntity
    //   453: ifeq -> 468
    //   456: aload_0
    //   457: checkcast net/minecraft/world/entity/LivingEntity
    //   460: astore_1
    //   461: aload_1
    //   462: invokevirtual getMainHandItem : ()Lnet/minecraft/world/item/ItemStack;
    //   465: goto -> 471
    //   468: getstatic net/minecraft/world/item/ItemStack.EMPTY : Lnet/minecraft/world/item/ItemStack;
    //   471: invokevirtual getItem : ()Lnet/minecraft/world/item/Item;
    //   474: getstatic net/mcreator/latexes/init/LatexModItems.REVOLVING_GOO_CANNON : Lnet/minecraftforge/registries/RegistryObject;
    //   477: invokevirtual get : ()Ljava/lang/Object;
    //   480: if_acmpne -> 487
    //   483: aload_0
    //   484: invokestatic execute : (Lnet/minecraft/world/entity/Entity;)V
    //   487: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #11	-> 0
    //   #12	-> 4
    //   #13	-> 5
    //   #14	-> 39
    //   #16	-> 43
    //   #17	-> 71
    //   #18	-> 77
    //   #20	-> 81
    //   #21	-> 115
    //   #22	-> 143
    //   #23	-> 149
    //   #25	-> 153
    //   #26	-> 181
    //   #27	-> 187
    //   #29	-> 191
    //   #30	-> 225
    //   #32	-> 229
    //   #33	-> 263
    //   #34	-> 291
    //   #35	-> 297
    //   #37	-> 301
    //   #38	-> 329
    //   #39	-> 335
    //   #41	-> 339
    //   #42	-> 367
    //   #43	-> 373
    //   #45	-> 377
    //   #46	-> 411
    //   #47	-> 439
    //   #48	-> 445
    //   #50	-> 449
    //   #51	-> 477
    //   #52	-> 483
    //   #54	-> 487
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   17	7	1	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
    //   55	7	1	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
    //   93	7	1	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
    //   127	7	2	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
    //   165	7	1	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
    //   203	7	1	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
    //   241	7	1	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
    //   275	7	2	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
    //   313	7	1	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
    //   351	7	1	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
    //   389	7	1	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
    //   423	7	2	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
    //   461	7	1	_livEnt	Lnet/minecraft/world/entity/LivingEntity;
    //   0	488	0	entity	Lnet/minecraft/world/entity/Entity;
  }
}


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\ReloadkeyOnKeyPressedProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */