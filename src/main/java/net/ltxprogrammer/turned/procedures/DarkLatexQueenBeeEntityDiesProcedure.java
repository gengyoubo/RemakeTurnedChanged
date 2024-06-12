package net.ltxprogrammer.turned.procedures;

import net.ltxprogrammer.changed.init.ChangedBlocks;
import net.ltxprogrammer.turned.init.LatexModBlocks;
import net.ltxprogrammer.turned.init.LatexModGameRules;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.animal.Bee;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/DarkLatexQueenBeeEntityDiesProcedure.class */
public class DarkLatexQueenBeeEntityDiesProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        if (!world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXESLEAVEBLOCK)) {
            return;
        }
        if (Math.random() < 0.8d) {
            world.setBlock(new BlockPos(x, y + 1.0d, z), LatexModBlocks.DARKLATEXHIVE.get().defaultBlockState(), 3);
            world.setBlock(new BlockPos(x, y, z), ChangedBlocks.DARK_LATEX_BLOCK.get().defaultBlockState(), 3);
        } else if (world instanceof ServerLevel _level) {
            Entity entityToSpawn = new Bee(EntityType.BEE, _level);
            entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
            ((Mob) entityToSpawn).finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
            world.addFreshEntity(entityToSpawn);
        }
    }
}
