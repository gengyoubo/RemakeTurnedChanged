package net.mcreator.latexes.procedures;

import net.mcreator.latexes.entity.DarklatexEntity;
import net.mcreator.latexes.entity.SlimelingEntity;
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
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.monster.Drowned;
import net.minecraft.world.entity.monster.Evoker;
import net.minecraft.world.entity.monster.Husk;
import net.minecraft.world.entity.monster.Illusioner;
import net.minecraft.world.entity.monster.Pillager;
import net.minecraft.world.entity.monster.Vindicator;
import net.minecraft.world.entity.monster.ZombieVillager;
import net.minecraft.world.entity.monster.ZombifiedPiglin;
import net.minecraft.world.entity.monster.piglin.PiglinBrute;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.npc.WanderingTrader;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.registries.ForgeRegistries;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/SlimelingThisEntityKillsAnotherOneProcedure.class */
public class SlimelingThisEntityKillsAnotherOneProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
        if (entity != null && sourceentity != null) {
            if (Math.random() < 0.7d) {
                if (!entity.level.isClientSide()) {
                    entity.discard();
                }
                if (world instanceof ServerLevel) {
                    ((ServerLevel) world).sendParticles(ParticleTypes.HEART, x, y, z, 3, 3.0d, 3.0d, 3.0d, 1.0d);
                }
                if (world instanceof Level) {
                    Level _level = (Level) world;
                    if (!_level.isClientSide()) {
                        _level.playSound((Player) null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 2.0f);
                    } else {
                        _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 2.0f, false);
                    }
                }
                if (sourceentity instanceof LivingEntity) {
                    ((LivingEntity) sourceentity).setHealth((sourceentity instanceof LivingEntity ? ((LivingEntity) sourceentity).getHealth() : -1.0f) + ((sourceentity instanceof LivingEntity ? ((LivingEntity) sourceentity).getMaxHealth() : -1.0f) / 4.0f));
                }
            } else if (world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXTRANSFUR) && Math.random() < 0.6d) {
                if ((entity instanceof Pillager) || (entity instanceof Player) || (entity instanceof DarklatexEntity) || (entity instanceof ZombifiedPiglin) || (entity instanceof PiglinBrute) || (entity instanceof ZombieVillager) || (entity instanceof Vindicator) || (entity instanceof Villager) || (entity instanceof WanderingTrader) || (entity instanceof Husk) || (entity instanceof Evoker) || (entity instanceof Illusioner) || (entity instanceof Drowned)) {
                    if (world instanceof Level) {
                        Level _level2 = (Level) world;
                        if (!_level2.isClientSide()) {
                            _level2.playSound((Player) null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                        } else {
                            _level2.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                        }
                    }
                    if (world instanceof ServerLevel) {
                        ((ServerLevel) world).sendParticles(ParticleTypes.ITEM_SLIME, x, y, z, 5, 3.0d, 3.0d, 3.0d, 1.0d);
                    }
                    if (world instanceof ServerLevel) {
                        ServerLevel _level3 = (ServerLevel) world;
                        Entity entityToSpawn = new SlimelingEntity((EntityType<SlimelingEntity>) ((EntityType) LatexModEntities.SLIMELING.get()), (Level) _level3);
                        entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                        if (entityToSpawn instanceof Mob) {
                            ((Mob) entityToSpawn).finalizeSpawn(_level3, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn);
                    }
                }
            }
        }
    }
}
