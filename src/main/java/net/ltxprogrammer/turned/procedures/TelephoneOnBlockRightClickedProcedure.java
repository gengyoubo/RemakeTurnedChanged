//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.ltxprogrammer.turned.procedures;

import com.google.common.collect.UnmodifiableIterator;
import java.util.Map;
import net.ltxprogrammer.turned.init.LatexModBlocks;
import net.ltxprogrammer.turned.init.LatexModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.registries.ForgeRegistries;

public class TelephoneOnBlockRightClickedProcedure {
    public TelephoneOnBlockRightClickedProcedure() {
    }

    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity != null) {
            if (entity instanceof Player) {
                Player _player = (Player)entity;
                ItemStack _setstack = new ItemStack((ItemLike)LatexModItems.PHONE.get());
                _setstack.setCount(1);
                ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
            }

            if (world instanceof Level) {
                Level _level = (Level)world;
                if (!_level.isClientSide()) {
                    _level.playSound((Player)null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:click_noise")), SoundSource.NEUTRAL, 1.0F, 1.0F);
                } else {
                    _level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:click_noise")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
                }
            }

            BlockPos _bp = new BlockPos(x, y, z);
            BlockState _bs = ((Block)LatexModBlocks.TELEPHONENOPHONE.get()).defaultBlockState();
            BlockState _bso = world.getBlockState(_bp);
            UnmodifiableIterator var11 = _bso.getValues().entrySet().iterator();

            while(var11.hasNext()) {
                Map.Entry<Property<?>, Comparable<?>> entry = (Map.Entry)var11.next();
                Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
                if (_property != null && _bs.getValue(_property) != null) {
                    try {
                        _bs = (BlockState)_bs.setValue(_property, (Comparable)entry.getValue());
                    } catch (Exception var15) {
                    }
                }
            }

            world.setBlock(_bp, _bs, 3);
        }
    }
}
