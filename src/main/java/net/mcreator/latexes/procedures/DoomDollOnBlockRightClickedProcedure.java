package net.mcreator.latexes.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraftforge.registries.ForgeRegistries;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/DoomDollOnBlockRightClickedProcedure.class */
public class DoomDollOnBlockRightClickedProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        if (world instanceof Level) {
            Level _level = (Level) world;
            if (!_level.isClientSide()) {
                _level.playSound((Player) null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:the_only_thing_they_fear_is_you")), SoundSource.NEUTRAL, 1.0f, 1.0f);
            } else {
                _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:the_only_thing_they_fear_is_you")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
            }
        }
        BlockPos _pos = new BlockPos(x, y, z);
        Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), (BlockEntity) null);
        world.destroyBlock(_pos, false);
    }
}
