package net.mcreator.latexes.init;

import com.mojang.datafixers.types.Type;
import net.mcreator.latexes.LatexMod;
import net.mcreator.latexes.block.entity.BoxBlockEntity;
import net.mcreator.latexes.block.entity.BoxInventoryBlockEntity;
import net.mcreator.latexes.block.entity.BoxTrapBlockEntity;
import net.mcreator.latexes.block.entity.ChesTrapBlockEntity;
import net.mcreator.latexes.block.entity.CrateBlockEntity;
import net.mcreator.latexes.block.entity.LockerBlockEntity;
import net.mcreator.latexes.block.entity.MetalBoxBlockEntity;
import net.mcreator.latexes.block.entity.ScientificCrateBlockEntity;
import net.mcreator.latexes.block.entity.SmallBoxBlockEntity;
import net.mcreator.latexes.block.entity.SupplyCrateBlockEntity;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/init/LatexModBlockEntities.class */
public class LatexModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, LatexMod.MODID);
    public static final RegistryObject<BlockEntityType<?>> SUPPLY_CRATE = register("supply_crate", LatexModBlocks.SUPPLY_CRATE, SupplyCrateBlockEntity::new);
    public static final RegistryObject<BlockEntityType<?>> SMALL_BOX = register("small_box", LatexModBlocks.SMALL_BOX, SmallBoxBlockEntity::new);
    public static final RegistryObject<BlockEntityType<?>> BOX = register("box", LatexModBlocks.BOX, BoxBlockEntity::new);
    public static final RegistryObject<BlockEntityType<?>> BOX_INVENTORY = register("box_inventory", LatexModBlocks.BOX_INVENTORY, BoxInventoryBlockEntity::new);
    public static final RegistryObject<BlockEntityType<?>> BOX_TRAP = register("box_trap", LatexModBlocks.BOX_TRAP, BoxTrapBlockEntity::new);
    public static final RegistryObject<BlockEntityType<?>> SCIENTIFIC_CRATE = register("scientific_crate", LatexModBlocks.SCIENTIFIC_CRATE, ScientificCrateBlockEntity::new);
    public static final RegistryObject<BlockEntityType<?>> CRATE = register("crate", LatexModBlocks.CRATE, CrateBlockEntity::new);
    public static final RegistryObject<BlockEntityType<?>> METAL_BOX = register("metal_box", LatexModBlocks.METAL_BOX, MetalBoxBlockEntity::new);
    public static final RegistryObject<BlockEntityType<?>> CHES_TRAP = register("ches_trap", LatexModBlocks.CHES_TRAP, ChesTrapBlockEntity::new);
    public static final RegistryObject<BlockEntityType<?>> LOCKER = register("locker", LatexModBlocks.LOCKER, LockerBlockEntity::new);

    private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
        return REGISTRY.register(registryname, () -> {
            return BlockEntityType.Builder.of(supplier, new Block[]{(Block) block.get()}).build((Type) null);
        });
    }
}
