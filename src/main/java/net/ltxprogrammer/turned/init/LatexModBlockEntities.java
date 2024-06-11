/*    */ package net.ltxprogrammer.turned.init;
/*    */ 
/*    */ import net.minecraft.world.level.block.Block;
/*    */ import net.minecraft.world.level.block.entity.BlockEntityType;
/*    */ import net.minecraftforge.registries.DeferredRegister;
/*    */ import net.minecraftforge.registries.ForgeRegistries;
/*    */ import net.minecraftforge.registries.RegistryObject;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class LatexModBlockEntities
/*    */ {
/* 27 */   public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, "turned");
/* 28 */   public static final RegistryObject<BlockEntityType<?>> SUPPLY_CRATE = register("supply_crate", LatexModBlocks.SUPPLY_CRATE, net.ltxprogrammer.turned.block.entity.SupplyCrateBlockEntity::new);
/*    */   
/* 30 */   public static final RegistryObject<BlockEntityType<?>> SMALL_BOX = register("small_box", LatexModBlocks.SMALL_BOX, net.ltxprogrammer.turned.block.entity.SmallBoxBlockEntity::new);
/* 31 */   public static final RegistryObject<BlockEntityType<?>> BOX = register("box", LatexModBlocks.BOX, net.ltxprogrammer.turned.block.entity.BoxBlockEntity::new);
/* 32 */   public static final RegistryObject<BlockEntityType<?>> BOX_INVENTORY = register("box_inventory", LatexModBlocks.BOX_INVENTORY, net.ltxprogrammer.turned.block.entity.BoxInventoryBlockEntity::new);
/*    */   
/* 34 */   public static final RegistryObject<BlockEntityType<?>> BOX_TRAP = register("box_trap", LatexModBlocks.BOX_TRAP, net.ltxprogrammer.turned.block.entity.BoxTrapBlockEntity::new);
/* 35 */   public static final RegistryObject<BlockEntityType<?>> SCIENTIFIC_CRATE = register("scientific_crate", LatexModBlocks.SCIENTIFIC_CRATE, net.ltxprogrammer.turned.block.entity.ScientificCrateBlockEntity::new);
/*    */   
/* 37 */   public static final RegistryObject<BlockEntityType<?>> CRATE = register("crate", LatexModBlocks.CRATE, net.ltxprogrammer.turned.block.entity.CrateBlockEntity::new);
/* 38 */   public static final RegistryObject<BlockEntityType<?>> METAL_BOX = register("metal_box", LatexModBlocks.METAL_BOX, net.ltxprogrammer.turned.block.entity.MetalBoxBlockEntity::new);
/* 39 */   public static final RegistryObject<BlockEntityType<?>> CHES_TRAP = register("ches_trap", LatexModBlocks.CHES_TRAP, net.ltxprogrammer.turned.block.entity.ChesTrapBlockEntity::new);
/* 40 */   public static final RegistryObject<BlockEntityType<?>> LOCKER = register("locker", LatexModBlocks.LOCKER, net.ltxprogrammer.turned.block.entity.LockerBlockEntity::new);
/*    */ 
/*    */   
/*    */   private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
/* 44 */     return REGISTRY.register(registryname, () -> BlockEntityType.Builder.m_155273_(supplier, new Block[] { (Block)block.get() }).m_58966_(null));
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\init\LatexModBlockEntities.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */