package net.ltxprogrammer.turned.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/TacticalbombOnBlockRightClickedProcedure.class */
public class TacticalbombOnBlockRightClickedProcedure {
    public static void execute(LevelAccessor world, final double x, final double y, final double z) {
        if (world instanceof Level) {
            Level _level = (Level) world;
            if (!_level.isClientSide()) {
                _level.playSound((Player) null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.lever.click")), SoundSource.NEUTRAL, 1.0f, 1.0f);
            } else {
                _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.lever.click")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
            }
        }
        new Object() { // from class: net.ltxprogrammer.turned.procedures.TacticalbombOnBlockRightClickedProcedure.1
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
                for (int index0 = 0; index0 < 10; index0++) {
                    ServerLevel _level2 = this.world;
                    if (_level2 instanceof ServerLevel) {
                        _level2.sendParticles(ParticleTypes.FLAME, x, y, z, 5, 3.0d, 3.0d, 3.0d, 1.0d);
                    }
                }
                Level level = this.world;
                if (level instanceof Level) {
                    Level _level3 = level;
                    if (!_level3.isClientSide()) {
                        _level3.explode((Entity) null, x, y, z, 5.0f, Explosion.BlockInteraction.DESTROY);
                    }
                }
                MinecraftForge.EVENT_BUS.unregister(this);
            }
        }.start(world, 40);
    }
}
