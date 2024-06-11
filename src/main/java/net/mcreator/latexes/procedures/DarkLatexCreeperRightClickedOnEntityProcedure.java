package net.mcreator.latexes.procedures;

import net.mcreator.latexes.init.LatexModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/DarkLatexCreeperRightClickedOnEntityProcedure.class */
public class DarkLatexCreeperRightClickedOnEntityProcedure {
    /* JADX WARN: Type inference failed for: r0v32, types: [double] */
    /* JADX WARN: Type inference failed for: r0v37, types: [double] */
    /* JADX WARN: Type inference failed for: r0v42, types: [double] */
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity != null) {
            if (!entity.isOnFire()) {
                if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getMainHandItem() : ItemStack.EMPTY).getItem() != Items.FLINT_AND_STEEL) {
                    if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getMainHandItem() : ItemStack.EMPTY).getItem() != Items.FIRE_CHARGE) {
                        return;
                    }
                }
            }
            if (!entity.level.isClientSide()) {
                entity.discard();
            }
            if (world instanceof Level) {
                Level _level = (Level) world;
                if (!_level.isClientSide()) {
                    _level.explode((Entity) null, x, y, z, 5.0f, Explosion.BlockInteraction.BREAK);
                }
            }
            char c = 0;
            boolean found = false;
            for (int index0 = 0; index0 < 6; index0++) {
                char c2 = 0;
                for (int index1 = 0; index1 < 6; index1++) {
                    char c3 = 0;
                    for (int index2 = 0; index2 < 6; index2++) {
                        if (!(world.getBlockState(new BlockPos(x + c, y + c2, z + c3)).getBlock() == Blocks.CAVE_AIR || world.getBlockState(new BlockPos(x + c, y + c2, z + c3)).getBlock() == Blocks.VOID_AIR || world.getBlockState(new BlockPos(x + c, y + c2, z + c3)).getBlock() == Blocks.AIR)) {
                            found = true;
                        }
                        c3 += 0;
                    }
                    c2 += 0;
                }
                c += 0;
            }
            if (!found) {
                return;
            }
            if (world.getBlockState(new BlockPos(x, y + 1.0d, z)).getBlock() == Blocks.AIR || world.getBlockState(new BlockPos(x, y + 1.0d, z)).getBlock() == Blocks.VOID_AIR || world.getBlockState(new BlockPos(x, y + 1.0d, z)).getBlock() == Blocks.CAVE_AIR) {
                world.setBlock(new BlockPos(x, y + 1.0d, z), ((Block) LatexModBlocks.DARKLATEXCARPET.get()).defaultBlockState(), 3);
            }
        }
    }
}
