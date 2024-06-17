//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.mcreator.latexes.procedures;

import com.google.common.collect.UnmodifiableIterator;
import java.util.Map;
import net.mcreator.latexes.init.LatexModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraftforge.registries.ForgeRegistries;

public class ComputerOnBlockRightClickedProcedure {
    public ComputerOnBlockRightClickedProcedure() {
    }

    public static void execute(LevelAccessor world, double x, double y, double z) {
        BlockPos _bp = new BlockPos(x, y, z);
        BlockState _bs = ((Block)LatexModBlocks.COMPUTER_ON.get()).defaultBlockState();
        BlockState _bso = world.getBlockState(_bp);
        UnmodifiableIterator var10 = _bso.getValues().entrySet().iterator();

        while(var10.hasNext()) {
            Map.Entry<Property<?>, Comparable<?>> entry = (Map.Entry)var10.next();
            Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
            if (_property != null && _bs.getValue(_property) != null) {
                try {
                    _bs = (BlockState)_bs.setValue(_property, (Comparable)entry.getValue());
                } catch (Exception var14) {
                }
            }
        }

        world.setBlock(_bp, _bs, 3);
        if (world instanceof Level _level) {
            if (!_level.isClientSide()) {
                _level.playSound((Player)null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:computer_on")), SoundSource.NEUTRAL, 1.0F, 1.0F);
            } else {
                _level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:computer_on")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
            }
        }

    }
}
