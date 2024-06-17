package net.mcreator.latexes.procedures;

import net.mcreator.latexes.entity.SlimelingEntity;
import net.mcreator.latexes.init.LatexModEntities;
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
import net.minecraft.world.entity.monster.Slime;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.registries.ForgeRegistries;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/SlimeessenceLivingEntityIsHitWithItemProcedure.class */
public class SlimeessenceLivingEntityIsHitWithItemProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity != null && (entity instanceof Slime)) {
            if (world instanceof Level) {
                Level _level = (Level) world;
                if (!_level.isClientSide()) {
                    _level.playSound((Player) null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                } else {
                    _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                }
            }
            if (world instanceof ServerLevel) {
                ((ServerLevel) world).sendParticles(ParticleTypes.ITEM_SLIME, x, y, z, 5, 3.0d, 3.0d, 3.0d, 1.0d);
            }
            if (world instanceof ServerLevel) {
                ServerLevel _level2 = (ServerLevel) world;
                Entity entityToSpawn = new SlimelingEntity((EntityType<SlimelingEntity>) ((EntityType) LatexModEntities.SLIMELING.get()), (Level) _level2);
                entityToSpawn.moveTo(x, y, z, 0.0f, 0.0f);
                entityToSpawn.setYBodyRot(0.0f);
                entityToSpawn.setYHeadRot(0.0f);
                if (entityToSpawn instanceof Mob) {
                    ((Mob) entityToSpawn).finalizeSpawn(_level2, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                }
                world.addFreshEntity(entityToSpawn);
            }
        }
    }
}
