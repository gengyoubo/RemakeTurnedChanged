package net.mcreator.latexes.block;

import java.util.Collections;
import java.util.List;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.storage.loot.LootContext;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/block/BunkerStairsBlock.class */
public class BunkerStairsBlock extends StairBlock {
    public BunkerStairsBlock() {
        super(() -> {
            return Blocks.AIR.defaultBlockState();
        }, BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5.0f, 25.0f).dynamicShape());
    }

    public float getExplosionResistance() {
        return 25.0f;
    }

    public boolean isRandomlyTicking(BlockState p_56947_) {
        return false;
    }

    public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
        return 0;
    }

    public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
        List<ItemStack> dropsOriginal = getDrops(state, builder);
        if (!dropsOriginal.isEmpty()) {
            return dropsOriginal;
        }
        return Collections.singletonList(new ItemStack(this, 1));
    }
}
