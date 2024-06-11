package net.mcreator.latexes.procedures;

import net.mcreator.latexes.entity.DlSquidDogEntity;
import net.mcreator.latexes.entity.DlsharkEntity;
import net.mcreator.latexes.init.LatexModEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.registries.ForgeRegistries;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/DlSquidDogThisEntityKillsAnotherOneProcedure.class */
public class DlSquidDogThisEntityKillsAnotherOneProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity != null) {
            if (!(entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("latex:robots"))) || entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("latex:darklatexes"))) || (entity instanceof Player))) {
                if (!entity.level.isClientSide()) {
                    entity.discard();
                }
                if (world instanceof Level) {
                    Level _level = (Level) world;
                    if (!_level.isClientSide()) {
                        _level.playSound((Player) null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                    } else {
                        _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                    }
                }
                if (Math.random() < 0.7d) {
                    if (world instanceof ServerLevel) {
                        ServerLevel _level2 = (ServerLevel) world;
                        Entity entityToSpawn = new DlSquidDogEntity((EntityType<DlSquidDogEntity>) ((EntityType) LatexModEntities.DL_SQUID_DOG.get()), (Level) _level2);
                        entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                        if (entityToSpawn instanceof Mob) {
                            ((Mob) entityToSpawn).finalizeSpawn(_level2, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn);
                    }
                } else if (world instanceof ServerLevel) {
                    ServerLevel _level3 = (ServerLevel) world;
                    Entity entityToSpawn2 = new DlsharkEntity((EntityType<DlsharkEntity>) ((EntityType) LatexModEntities.DLSHARK.get()), (Level) _level3);
                    entityToSpawn2.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                    if (entityToSpawn2 instanceof Mob) {
                        ((Mob) entityToSpawn2).finalizeSpawn(_level3, world.getCurrentDifficultyAt(entityToSpawn2.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                    }
                    world.addFreshEntity(entityToSpawn2);
                }
            }
        }
    }
}
