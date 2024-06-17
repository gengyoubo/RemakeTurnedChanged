//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.mcreator.latexes.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Explosion.BlockInteraction;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.TickEvent.Phase;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;

public class NukeOnBlockRightClickedProcedure {
    public NukeOnBlockRightClickedProcedure() {
    }

    public static void execute(LevelAccessor world, final double x, final double y, final double z) {
        if (world instanceof Level _level) {
            if (!_level.isClientSide()) {
                _level.playSound((Player)null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.land")), SoundSource.NEUTRAL, 1.0F, 1.0F);
            } else {
                _level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.land")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
            }
        }

        if (world instanceof ServerLevel _level) {
            _level.sendParticles(ParticleTypes.TOTEM_OF_UNDYING, x, y, z, 5, 3.0, 3.0, 3.0, 1.0);
        }

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
                LevelAccessor var2 = this.world;
                if (var2 instanceof Level _level) {
                    if (!_level.isClientSide()) {
                        _level.explode((Entity)null, x, y, z, 100.0F, BlockInteraction.DESTROY);
                    }
                }

                MinecraftForge.EVENT_BUS.unregister(this);
            }
        })).start(world, 150);
    }
}
