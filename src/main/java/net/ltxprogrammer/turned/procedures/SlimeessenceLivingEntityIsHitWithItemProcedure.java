package net.ltxprogrammer.turned.procedures;

import net.ltxprogrammer.changed.init.ChangedSounds;
import net.ltxprogrammer.turned.entity.SlimelingEntity;
import net.ltxprogrammer.turned.init.LatexModEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.nbt.CompoundTag;
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

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/SlimeessenceLivingEntityIsHitWithItemProcedure.class */
public class SlimeessenceLivingEntityIsHitWithItemProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if ((entity instanceof Slime)) {
            if (world instanceof Level _level) {
                if (!_level.isClientSide()) {
                    _level.playSound(null, new BlockPos(x, y, z), ChangedSounds.POISON, SoundSource.NEUTRAL, 1.0f, 1.0f);
                } else {
                    _level.playLocalSound(x, y, z, ChangedSounds.POISON, SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                }
            }
            if (world instanceof ServerLevel) {
                ((ServerLevel) world).sendParticles(ParticleTypes.ITEM_SLIME, x, y, z, 5, 3.0d, 3.0d, 3.0d, 1.0d);
            }
            if (world instanceof ServerLevel _level2) {
                Entity entityToSpawn = new SlimelingEntity((EntityType<SlimelingEntity>) LatexModEntities.SLIMELING.get(), _level2);
                entityToSpawn.moveTo(x, y, z, 0.0f, 0.0f);
                entityToSpawn.setYBodyRot(0.0f);
                entityToSpawn.setYHeadRot(0.0f);
                ((Mob) entityToSpawn).finalizeSpawn(_level2, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                world.addFreshEntity(entityToSpawn);
            }
        }
    }
}
