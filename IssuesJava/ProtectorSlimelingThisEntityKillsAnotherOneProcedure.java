package net.ltxprogrammer.turned.procedures;

import net.ltxprogrammer.changed.init.ChangedSounds;
import net.ltxprogrammer.turned.entity.DarklatexEntity;
import net.ltxprogrammer.turned.entity.ProtectorSlimelingEntity;
import LatexModEntities;
import net.ltxprogrammer.turned.init.LatexModGameRules;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.nbt.CompoundTag;
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

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/ProtectorSlimelingThisEntityKillsAnotherOneProcedure.class */
public class ProtectorSlimelingThisEntityKillsAnotherOneProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
        if (entity != null && sourceentity != null) {
            if (Math.random() < 0.5d) {
                if (!entity.level.isClientSide()) {
                    entity.discard();
                }
                if (world instanceof ServerLevel) {
                    ((ServerLevel) world).sendParticles(ParticleTypes.HEART, x, y, z, 3, 3.0d, 3.0d, 3.0d, 1.0d);
                }
                if (world instanceof Level _level) {
                    if (!_level.isClientSide()) {
                        _level.playSound(null, new BlockPos(x, y, z), ChangedSounds.POISON, SoundSource.NEUTRAL, 1.0f, 2.0f);
                    } else {
                        _level.playLocalSound(x, y, z, ChangedSounds.POISON, SoundSource.NEUTRAL, 1.0f, 2.0f, false);
                    }
                }
                if (sourceentity instanceof LivingEntity) {
                    ((LivingEntity) sourceentity).setHealth((sourceentity instanceof LivingEntity ? ((LivingEntity) sourceentity).getHealth() : -1.0f) + ((sourceentity instanceof LivingEntity ? ((LivingEntity) sourceentity).getMaxHealth() : -1.0f) / 4.0f));
                }
            } else if (world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXTRANSFUR) && Math.random() < 0.5d) {
                if ((entity instanceof Pillager) || (entity instanceof Player) || (entity instanceof DarklatexEntity) || (entity instanceof ZombifiedPiglin) || (entity instanceof PiglinBrute) || (entity instanceof ZombieVillager) || (entity instanceof Vindicator) || (entity instanceof Villager) || (entity instanceof WanderingTrader) || (entity instanceof Husk) || (entity instanceof Evoker) || (entity instanceof Illusioner) || (entity instanceof Drowned)) {
                    if (world instanceof Level _level2) {
                        if (!_level2.isClientSide()) {
                            _level2.playSound(null, new BlockPos(x, y, z), ChangedSounds.POISON, SoundSource.NEUTRAL, 1.0f, 1.0f);
                        } else {
                            _level2.playLocalSound(x, y, z, ChangedSounds.POISON, SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                        }
                    }
                    if (world instanceof ServerLevel) {
                        ((ServerLevel) world).sendParticles(ParticleTypes.ITEM_SLIME, x, y, z, 5, 3.0d, 3.0d, 3.0d, 1.0d);
                    }
                    if (world instanceof ServerLevel _level3) {
                        Entity entityToSpawn = new ProtectorSlimelingEntity((EntityType<ProtectorSlimelingEntity>) LatexModEntities.PROTECTOR_SLIMELING.get(), _level3);
                        entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                        ((Mob) entityToSpawn).finalizeSpawn(_level3, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn);
                    }
                }
            }
        }
    }
}
