//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.mcreator.latexes.procedures;

import com.google.common.collect.UnmodifiableIterator;
import java.util.Map;
import net.mcreator.latexes.init.LatexModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.TickEvent.Phase;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ControlpanelonBlockAddedProcedure {
    public ControlpanelonBlockAddedProcedure() {
    }

    public static void execute(LevelAccessor world, final double x, final double y, final double z) {
        ((<undefinedtype>)(new Object() {
            private int ticks = 0;
            private float waitTicks;
            private LevelAccessor world;

            public void start(LevelAccessor world, int waitTicks) {
                this.waitTicks = (float)waitTicks;
                MinecraftForge.EVENT_BUS.register(this);
                this.world = world;
            }

            @SubscribeEvent
            public void tick(TickEvent.ServerTickEvent event) {
                if (event.phase == Phase.END) {
                    ++this.ticks;
                    if ((float)this.ticks >= this.waitTicks) {
                        this.run();
                    }
                }

            }

            private void run() {
                BlockPos _bp = new BlockPos(x, y, z);
                BlockState _bs = ((Block)LatexModBlocks.CONTROLPANELOFF.get()).defaultBlockState();
                BlockState _bso = this.world.getBlockState(_bp);
                UnmodifiableIterator var4 = _bso.getValues().entrySet().iterator();

                while(var4.hasNext()) {
                    Map.Entry<Property<?>, Comparable<?>> entry = (Map.Entry)var4.next();
                    Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
                    if (_property != null && _bs.getValue(_property) != null) {
                        try {
                            _bs = (BlockState)_bs.setValue(_property, (Comparable)entry.getValue());
                        } catch (Exception var8) {
                        }
                    }
                }

                this.world.setBlock(_bp, _bs, 3);
                MinecraftForge.EVENT_BUS.unregister(this);
            }
        })).start(world, 120);
    }
}
