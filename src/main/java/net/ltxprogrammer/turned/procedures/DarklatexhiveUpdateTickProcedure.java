package net.ltxprogrammer.turned.procedures;

import net.ltxprogrammer.turned.entity.DLbeeEntity;
import net.ltxprogrammer.turned.init.LatexModEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Objects;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/DarklatexhiveUpdateTickProcedure.class */
public class DarklatexhiveUpdateTickProcedure {
    public static void execute(LevelAccessor world, final double x, final double y, final double z) {
        new Object() { // from class: net.ltxprogrammer.turned.procedures.DarklatexhiveUpdateTickProcedure.1
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
                if (Math.random() < 0.01d) {
                    Level level = this.world;
                    if (level instanceof Level) {
                        if (!level.isClientSide()) {
                            level.playSound(null, new BlockPos(x, y, z), Objects.requireNonNull(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.slime_block.break"))), SoundSource.NEUTRAL, 1.0f, 1.0f);
                        } else {
                            level.playLocalSound(x, y, z, Objects.requireNonNull(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.slime_block.break"))), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                        }
                    }
                    ServerLevel serverLevel = this.world;
                    if (serverLevel instanceof ServerLevel) {
                        Entity entityToSpawn = new DLbeeEntity((EntityType<DLbeeEntity>) LatexModEntities.D_LBEE.get(), serverLevel);
                        entityToSpawn.moveTo(x, y, z, this.world.getRandom().nextFloat() * 360.0f, 0.0f);
                        ((Mob) entityToSpawn).finalizeSpawn(serverLevel, this.world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        this.world.addFreshEntity(entityToSpawn);
                    }
                }
                MinecraftForge.EVENT_BUS.unregister(this);
            }
        }.start(world, 200);
    }
}
