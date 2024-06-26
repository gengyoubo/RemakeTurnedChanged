package net.mcreator.latexes.world.features.treedecorators;

import com.mojang.serialization.Codec;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;
import net.mcreator.latexes.init.LatexModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.treedecorators.CocoaDecorator;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecoratorType;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.NotNull;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/world/features/treedecorators/DarkLatexBiomeFruitDecorator.class */
public class DarkLatexBiomeFruitDecorator extends CocoaDecorator {
    public static final DarkLatexBiomeFruitDecorator INSTANCE = new DarkLatexBiomeFruitDecorator();
    public static final Codec<DarkLatexBiomeFruitDecorator> codec = Codec.unit(() -> {
        return INSTANCE;
    });
    public static final TreeDecoratorType<?> tdt = new TreeDecoratorType<>(codec);

    static {
        tdt.setRegistryName("dark_latex_biome_tree_fruit_decorator");
        ForgeRegistries.TREE_DECORATOR_TYPES.register(tdt);
    }

    public DarkLatexBiomeFruitDecorator() {
        super(0.2f);
    }

    protected @NotNull TreeDecoratorType<?> type() {
        return tdt;
    }

    public void place(@NotNull LevelSimulatedReader level, @NotNull BiConsumer<BlockPos, BlockState> biConsumer, Random random, @NotNull List<BlockPos> blocks, @NotNull List<BlockPos> blocks2) {
        if (random.nextFloat() < 0.2f) {
            int i = blocks.get(0).getY();
            blocks.stream().filter(p_69980_ -> {
                return p_69980_.getY() - i <= 2;
            }).forEach(p_161728_ -> {
                Iterator it = Direction.Plane.HORIZONTAL.iterator();
                while (it.hasNext()) {
                    Direction direction = (Direction) it.next();
                    if (random.nextFloat() <= 0.25f) {
                        Direction direction1 = direction.getOpposite();
                        BlockPos blockpos = p_161728_.offset(direction1.getStepX(), 0, direction1.getStepZ());
                        if (Feature.isAir(level, blockpos)) {
                            biConsumer.accept(blockpos, ((Block) LatexModBlocks.DARKLATEXHIVE.get()).defaultBlockState());
                        }
                    }
                }
            });
        }
    }
}
