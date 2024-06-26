//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.mcreator.latexes.procedures;

import com.google.common.collect.UnmodifiableIterator;
import java.util.Map;
import net.mcreator.latexes.init.LatexModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Property;

public class DarklatexblockOnBlockRightClickedProcedure {
    public DarklatexblockOnBlockRightClickedProcedure() {
    }

    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity != null) {
            ItemStack var10000;
            if (entity instanceof LivingEntity) {
                LivingEntity _livEnt = (LivingEntity)entity;
                var10000 = _livEnt.getOffhandItem();
            } else {
                var10000 = ItemStack.EMPTY;
            }

            if (var10000.getItem() != Items.BONE_MEAL) {
                if (entity instanceof LivingEntity) {
                    LivingEntity _livEnt = (LivingEntity)entity;
                    var10000 = _livEnt.getMainHandItem();
                } else {
                    var10000 = ItemStack.EMPTY;
                }

                if (var10000.getItem() != Items.BONE_MEAL) {
                    return;
                }
            }

            if (world instanceof ServerLevel) {
                ServerLevel _level = (ServerLevel)world;
                _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 5, 1.0, 2.0, 1.0, 1.0);
            }

            if (entity instanceof Player) {
                Player _player = (Player)entity;
                ItemStack _stktoremove = new ItemStack(Items.BONE_MEAL);
                _player.getInventory().clearOrCountMatchingItems((p) -> {
                    return _stktoremove.getItem() == p.getItem();
                }, 1, _player.inventoryMenu.getCraftSlots());
            }

            BlockPos _bp = new BlockPos(x, y, z);
            BlockState _bs = ((Block)LatexModBlocks.DARKLATEXBLOCKHARMLESS.get()).defaultBlockState();
            BlockState _bso = world.getBlockState(_bp);
            UnmodifiableIterator var13 = _bso.getValues().entrySet().iterator();

            while(var13.hasNext()) {
                Map.Entry<Property<?>, Comparable<?>> entry = (Map.Entry)var13.next();
                Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
                if (_property != null && _bs.getValue(_property) != null) {
                    try {
                        _bs = (BlockState)_bs.setValue(_property, (Comparable)entry.getValue());
                    } catch (Exception var17) {
                    }
                }
            }

            world.setBlock(_bp, _bs, 3);
        }
    }
}
