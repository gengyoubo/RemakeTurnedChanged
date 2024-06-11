package net.mcreator.latexes.procedures;

import com.google.common.collect.UnmodifiableIterator;
import java.util.Map;
import net.mcreator.latexes.init.LatexModBlocks;
import net.mcreator.latexes.init.LatexModGameRules;
import net.mcreator.latexes.init.LatexModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Property;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/YufengEntityDiesProcedure.class */
public class YufengEntityDiesProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        if (world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXESLEAVEBLOCK)) {
            if (!(world.getBlockState(new BlockPos(x, y - 1.0d, z)).getBlock() == Blocks.BEDROCK)) {
                if (!(world.getBlockState(new BlockPos(x, y - 1.0d, z)).getBlock() == Blocks.CAVE_AIR || world.getBlockState(new BlockPos(x, y - 1.0d, z)).getBlock() == Blocks.AIR || world.getBlockState(new BlockPos(x, y - 1.0d, z)).getBlock() == Blocks.VOID_AIR)) {
                    BlockPos _bp = new BlockPos(x, y, z);
                    BlockState _bs = ((Block) LatexModBlocks.DARKLATEXCARPET.get()).defaultBlockState();
                    UnmodifiableIterator it = world.getBlockState(_bp).getValues().entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry<Property<?>, Comparable<?>> entry = (Map.Entry) it.next();
                        Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
                        if (!(_property == null || _bs.getValue(_property) == null)) {
                            try {
                                _bs = (BlockState) _bs.setValue(_property, entry.getValue());
                            } catch (Exception e) {
                            }
                        }
                    }
                    world.setBlock(_bp, _bs, 3);
                }
            }
        }
        if (Math.random() < 0.01d && (world instanceof Level)) {
            Level _level = (Level) world;
            if (!_level.isClientSide()) {
                ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike) LatexModItems.YUFENGBODY_CHESTPLATE.get()));
                entityToSpawn.setPickUpDelay(10);
                _level.addFreshEntity(entityToSpawn);
            }
        }
    }
}
