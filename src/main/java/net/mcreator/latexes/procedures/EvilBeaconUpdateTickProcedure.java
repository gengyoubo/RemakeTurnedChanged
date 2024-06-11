package net.mcreator.latexes.procedures;

import com.google.common.collect.UnmodifiableIterator;
import java.util.Map;
import net.mcreator.latexes.entity.DROPPODEntity;
import net.mcreator.latexes.init.LatexModBlocks;
import net.mcreator.latexes.init.LatexModEntities;
import net.mcreator.latexes.init.LatexModGameRules;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
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
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/EvilBeaconUpdateTickProcedure.class */
public class EvilBeaconUpdateTickProcedure {

    /* renamed from: net.mcreator.latexes.procedures.EvilBeaconUpdateTickProcedure$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/EvilBeaconUpdateTickProcedure$1.class */
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
            Level level = this.world;
            if (level instanceof Level) {
                Level _level = level;
                if (!_level.isClientSide()) {
                    _level.playSound((Player) null, new BlockPos(this.val$x, this.val$y, this.val$z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:deny_beep")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                } else {
                    _level.playLocalSound(this.val$x, this.val$y, this.val$z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:deny_beep")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                }
            }
            MinecraftForge.EVENT_BUS.unregister(this);
        }
    }

    public static void execute(LevelAccessor world, double x, double y, double z) {
        if (world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DOEVILSRAID)) {
            new AnonymousClass1(x, y, z).start(world, 30);
            new AnonymousClass2(x, y, z).start(world, 200);
            return;
        }
        BlockPos _bp = new BlockPos(x, y, z);
        BlockState _bs = ((Block) LatexModBlocks.EVIL_BEACON.get()).defaultBlockState();
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
    }

    /* renamed from: net.mcreator.latexes.procedures.EvilBeaconUpdateTickProcedure$2  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/EvilBeaconUpdateTickProcedure$2.class */
    class AnonymousClass2 {
        private int ticks = 0;
        private float waitTicks;
        private LevelAccessor world;
        final /* synthetic */ double val$x;
        final /* synthetic */ double val$y;
        final /* synthetic */ double val$z;

        AnonymousClass2(double d, double d2, double d3) {
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
            if (Math.random() < 0.005d * ((double) (this.world.getLevelData().getGameRules().getInt(LatexModGameRules.BEACONDROPMULTIPLIER) / 10))) {
                ServerLevel _level = this.world;
                if (_level instanceof ServerLevel) {
                    _level.sendParticles(ParticleTypes.ENCHANTED_HIT, this.val$x, this.val$y, this.val$z, 8, 3.0d, 2.0d, 3.0d, 1.0d);
                }
                ServerLevel _level2 = this.world;
                if (_level2 instanceof ServerLevel) {
                    _level2.sendParticles(ParticleTypes.PORTAL, this.val$x, this.val$y + 48.0d, this.val$z, 8, 3.0d, 2.0d, 3.0d, 1.0d);
                }
                this.world.setBlock(new BlockPos(this.val$x, this.val$y, this.val$z), Blocks.AIR.defaultBlockState(), 3);
                new AnonymousClass1().start(this.world, 50);
            }
            MinecraftForge.EVENT_BUS.unregister(this);
        }

        /* renamed from: net.mcreator.latexes.procedures.EvilBeaconUpdateTickProcedure$2$1  reason: invalid class name */
        /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/EvilBeaconUpdateTickProcedure$2$1.class */
        class AnonymousClass1 {
            private int ticks = 0;
            private float waitTicks;
            private LevelAccessor world;

            AnonymousClass1() {
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
                if (Math.random() < 0.1d) {
                    ServerLevel serverLevel = this.world;
                    if (serverLevel instanceof ServerLevel) {
                        ServerLevel _level = serverLevel;
                        Entity entityToSpawn = new DROPPODEntity((EntityType<DROPPODEntity>) ((EntityType) LatexModEntities.DROPPOD.get()), (Level) _level);
                        entityToSpawn.moveTo(AnonymousClass2.this.val$x, AnonymousClass2.this.val$y + 36.0d, AnonymousClass2.this.val$z + 8.0d, this.world.getRandom().nextFloat() * 360.0f, 0.0f);
                        if (entityToSpawn instanceof Mob) {
                            ((Mob) entityToSpawn).finalizeSpawn(_level, this.world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        this.world.addFreshEntity(entityToSpawn);
                    }
                    ServerLevel serverLevel2 = this.world;
                    if (serverLevel2 instanceof ServerLevel) {
                        ServerLevel _level2 = serverLevel2;
                        Entity entityToSpawn2 = new DROPPODEntity((EntityType<DROPPODEntity>) ((EntityType) LatexModEntities.DROPPOD.get()), (Level) _level2);
                        entityToSpawn2.moveTo(AnonymousClass2.this.val$x, AnonymousClass2.this.val$y + 36.0d, AnonymousClass2.this.val$z - 8.0d, this.world.getRandom().nextFloat() * 360.0f, 0.0f);
                        if (entityToSpawn2 instanceof Mob) {
                            ((Mob) entityToSpawn2).finalizeSpawn(_level2, this.world.getCurrentDifficultyAt(entityToSpawn2.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        this.world.addFreshEntity(entityToSpawn2);
                    }
                    ServerLevel serverLevel3 = this.world;
                    if (serverLevel3 instanceof ServerLevel) {
                        ServerLevel _level3 = serverLevel3;
                        Entity entityToSpawn3 = new DROPPODEntity((EntityType<DROPPODEntity>) ((EntityType) LatexModEntities.DROPPOD.get()), (Level) _level3);
                        entityToSpawn3.moveTo(AnonymousClass2.this.val$x + 8.0d, AnonymousClass2.this.val$y + 36.0d, AnonymousClass2.this.val$z, this.world.getRandom().nextFloat() * 360.0f, 0.0f);
                        if (entityToSpawn3 instanceof Mob) {
                            ((Mob) entityToSpawn3).finalizeSpawn(_level3, this.world.getCurrentDifficultyAt(entityToSpawn3.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        this.world.addFreshEntity(entityToSpawn3);
                    }
                    ServerLevel serverLevel4 = this.world;
                    if (serverLevel4 instanceof ServerLevel) {
                        ServerLevel _level4 = serverLevel4;
                        Entity entityToSpawn4 = new DROPPODEntity((EntityType<DROPPODEntity>) ((EntityType) LatexModEntities.DROPPOD.get()), (Level) _level4);
                        entityToSpawn4.moveTo(AnonymousClass2.this.val$x - 8.0d, AnonymousClass2.this.val$y + 36.0d, AnonymousClass2.this.val$z, this.world.getRandom().nextFloat() * 360.0f, 0.0f);
                        if (entityToSpawn4 instanceof Mob) {
                            ((Mob) entityToSpawn4).finalizeSpawn(_level4, this.world.getCurrentDifficultyAt(entityToSpawn4.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        this.world.addFreshEntity(entityToSpawn4);
                    }
                } else {
                    ServerLevel serverLevel5 = this.world;
                    if (serverLevel5 instanceof ServerLevel) {
                        ServerLevel _level5 = serverLevel5;
                        Entity entityToSpawn5 = new DROPPODEntity((EntityType<DROPPODEntity>) ((EntityType) LatexModEntities.DROPPOD.get()), (Level) _level5);
                        entityToSpawn5.moveTo(AnonymousClass2.this.val$x, AnonymousClass2.this.val$y + 48.0d, AnonymousClass2.this.val$z, this.world.getRandom().nextFloat() * 360.0f, 0.0f);
                        if (entityToSpawn5 instanceof Mob) {
                            ((Mob) entityToSpawn5).finalizeSpawn(_level5, this.world.getCurrentDifficultyAt(entityToSpawn5.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        this.world.addFreshEntity(entityToSpawn5);
                    }
                }
                MinecraftForge.EVENT_BUS.unregister(this);
            }
        }
    }
}
