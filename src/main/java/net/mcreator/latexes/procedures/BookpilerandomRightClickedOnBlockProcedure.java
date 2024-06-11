package net.mcreator.latexes.procedures;

import net.mcreator.latexes.init.LatexModBlocks;
import net.mcreator.latexes.init.LatexModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/BookpilerandomRightClickedOnBlockProcedure.class */
public class BookpilerandomRightClickedOnBlockProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity != null && world.getBlockState(new BlockPos(x, y + 1.0d, z)).getBlock() == Blocks.AIR) {
            if (!(entity instanceof Player ? ((Player) entity).getAbilities().instabuild : false) && (entity instanceof Player)) {
                Player _player = (Player) entity;
                ItemStack _stktoremove = new ItemStack((ItemLike) LatexModItems.BOOKPILERANDOM.get());
                _player.getInventory().clearOrCountMatchingItems(p -> {
                    return _stktoremove.getItem() == p.getItem();
                }, 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < Math.random()) {
                world.setBlock(new BlockPos(x, y + 1.0d, z), ((Block) LatexModBlocks.BOOKPILE_1.get()).defaultBlockState(), 3);
            } else if (Math.random() < Math.random()) {
                world.setBlock(new BlockPos(x, y + 1.0d, z), ((Block) LatexModBlocks.BOOKPILE_2.get()).defaultBlockState(), 3);
            } else if (Math.random() < Math.random()) {
                world.setBlock(new BlockPos(x, y + 1.0d, z), ((Block) LatexModBlocks.BOOKPILE_3.get()).defaultBlockState(), 3);
            } else if (Math.random() < Math.random()) {
                world.setBlock(new BlockPos(x, y + 1.0d, z), ((Block) LatexModBlocks.BOOKPILE_4.get()).defaultBlockState(), 3);
            } else {
                world.setBlock(new BlockPos(x, y + 1.0d, z), ((Block) LatexModBlocks.BOOKPILE_5.get()).defaultBlockState(), 3);
            }
        }
    }
}
