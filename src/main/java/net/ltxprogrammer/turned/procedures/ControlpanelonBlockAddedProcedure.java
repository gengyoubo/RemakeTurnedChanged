package net.ltxprogrammer.turned.procedures;

import com.google.common.collect.UnmodifiableIterator;
import java.util.Map;
import net.ltxprogrammer.turned.init.LatexModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/ControlpanelonBlockAddedProcedure.class */
public class ControlpanelonBlockAddedProcedure {
    public static void execute(LevelAccessor world, final double x, final double y, final double z) {
        new Object() { // from class: net.ltxprogrammer.turned.procedures.ControlpanelonBlockAddedProcedure.1
            private int ticks = 0;
            private float waitTicks;
            private LevelAccessor world;

            public void start(LevelAccessor world2, int waitTicks) {
                this.waitTicks = (float) waitTicks;
                MinecraftForge.EVENT_BUS.register(this);
                this.world = world2;
            }

            @SubscribeEvent
            public void tick(TickEvent.ServerTickEvent event) {
                if (event.phase == TickEvent.Phase.END) {
                    this.ticks++;
                    if (((float) this.ticks) >= this.waitTicks) {
                        run();
                    }
                }
            }

            private void run() {
                BlockPos _bp = new BlockPos(x, y, z);
                BlockState _bs = ((Block) LatexModBlocks.CONTROLPANELOFF.get()).defaultBlockState();
                UnmodifiableIterator it = this.world.getBlockState(_bp).getValues().entrySet().iterator();
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
                this.world.setBlock(_bp, _bs, 3);
                MinecraftForge.EVENT_BUS.unregister(this);
            }
        }.start(world, 120);
    }
}
