package net.ltxprogrammer.turned.procedures;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.monster.Slime;
import net.minecraft.world.level.LevelAccessor;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/SlimelingEntityDiesProcedure.class */
public class SlimelingEntityDiesProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        if (Math.random() < 0.25d && (world instanceof ServerLevel)) {
            ServerLevel _level = (ServerLevel) world;
            Entity entityToSpawn = new Slime(EntityType.SLIME, _level);
            entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
            if (entityToSpawn instanceof Mob) {
                ((Mob) entityToSpawn).finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
            }
            world.addFreshEntity(entityToSpawn);
        }
    }
}
