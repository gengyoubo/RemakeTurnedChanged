package net.mcreator.latexes.procedures;

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

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/TacticalbombOnBlockRightClickedProcedure.class */
public class TacticalbombOnBlockRightClickedProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        if (world instanceof Level) {
            Level _level = (Level) world;
            if (!_level.isClientSide()) {
                _level.playSound((Player) null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.lever.click")), SoundSource.NEUTRAL, 1.0f, 1.0f);
            } else {
                _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.lever.click")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
            }
        }
        new AnonymousClass1(x, y, z).start(world, 40);
    }

    /* renamed from: net.mcreator.latexes.procedures.TacticalbombOnBlockRightClickedProcedure$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/TacticalbombOnBlockRightClickedProcedure$1.class */
    class AnonymousClass1 {
        private int ticks = 0;
        private float waitTicks;
        private LevelAccessor world;
        final /* synthetic */ double val$x;
        final /* synthetic */ double val$y;
        final /* synthetic */ double val$z;

        AnonymousClass1(double d, double d2, double d3) {
            this.val$x = d;
            this.val$y = d2;
            this.val$z = d3;
        }

        public void start(LevelAccessor world, int waitTicks) {
            this.waitTicks = (float) waitTicks;
            MinecraftForge.EVENT_BUS.register(this);
            this.world = world;
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
                ServerLevel _level = this.world;
                if (_level instanceof ServerLevel) {
                    _level.sendParticles(ParticleTypes.FLAME, this.val$x, this.val$y, this.val$z, 5, 3.0d, 3.0d, 3.0d, 1.0d);
                }
            }
            Level level = this.world;
            if (level instanceof Level) {
                Level _level2 = level;
                if (!_level2.isClientSide()) {
                    _level2.explode((Entity) null, this.val$x, this.val$y, this.val$z, 5.0f, Explosion.BlockInteraction.DESTROY);
                }
            }
            MinecraftForge.EVENT_BUS.unregister(this);
        }
    }
}
