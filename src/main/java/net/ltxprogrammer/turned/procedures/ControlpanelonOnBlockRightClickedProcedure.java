package net.ltxprogrammer.turned.procedures;

import com.google.common.collect.UnmodifiableIterator;
import java.util.Map;
import net.ltxprogrammer.turned.init.LatexModBlocks;
import net.ltxprogrammer.turned.init.LatexModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraftforge.registries.ForgeRegistries;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/ControlpanelonOnBlockRightClickedProcedure.class */
public class ControlpanelonOnBlockRightClickedProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity != null) {
            if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getMainHandItem() : ItemStack.EMPTY).getItem() == LatexModItems.KEYCARD.get()) {
                BlockPos _bp = new BlockPos(x, y, z);
                BlockState _bs = ((Block) LatexModBlocks.CONTROLPANELOFF.get()).defaultBlockState();
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
                if (world instanceof Level) {
                    Level _level = (Level) world;
                    if (!_level.isClientSide()) {
                        _level.playSound((Player) null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:approve_beep")), SoundSource.BLOCKS, 1.0f, 1.0f);
                    } else {
                        _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:approve_beep")), SoundSource.BLOCKS, 1.0f, 1.0f, false);
                    }
                }
            } else if (world instanceof Level) {
                Level _level2 = (Level) world;
                if (!_level2.isClientSide()) {
                    _level2.playSound((Player) null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:deny_beep")), SoundSource.BLOCKS, 1.0f, 1.0f);
                } else {
                    _level2.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:deny_beep")), SoundSource.BLOCKS, 1.0f, 1.0f, false);
                }
            }
        }
    }
}
