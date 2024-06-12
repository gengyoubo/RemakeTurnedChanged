package net.ltxprogrammer.turned.procedures;

import net.ltxprogrammer.changed.entity.beast.DarkLatexYufeng;
import net.ltxprogrammer.changed.init.ChangedEntities;
import net.ltxprogrammer.turned.entity.DarkLatexSnakeEntity;
import net.ltxprogrammer.turned.entity.DarkLatexSnepEntity;
import net.ltxprogrammer.turned.entity.DarkLatexSpiderEntity;
import net.ltxprogrammer.turned.entity.DarklatexEntity;
import net.ltxprogrammer.turned.entity.DarklatexslugEntity;
import net.ltxprogrammer.turned.init.LatexModEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/BoxTrapOnBlockRightClickedProcedure.class */
public class BoxTrapOnBlockRightClickedProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        world.destroyBlock(new BlockPos(x, y, z), false);
        if (Math.random() < 0.4d) {
            if (world instanceof ServerLevel) {
                ServerLevel _level = (ServerLevel) world;
                Entity entityToSpawn = new DarklatexEntity((EntityType<DarklatexEntity>) ((EntityType) LatexModEntities.DARKLATEX.get()), (Level) _level);
                entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                if (entityToSpawn instanceof Mob) {
                    ((Mob) entityToSpawn).finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                }
                world.addFreshEntity(entityToSpawn);
            }
        } else if (Math.random() < 0.1d) {
            if (world instanceof ServerLevel) {
                ServerLevel _level2 = (ServerLevel) world;
                Entity entityToSpawn2 = new DarkLatexSnepEntity((EntityType<DarkLatexSnepEntity>) ((EntityType) LatexModEntities.DARK_LATEX_SNEP.get()), (Level) _level2);
                entityToSpawn2.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                if (entityToSpawn2 instanceof Mob) {
                    ((Mob) entityToSpawn2).finalizeSpawn(_level2, world.getCurrentDifficultyAt(entityToSpawn2.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                }
                world.addFreshEntity(entityToSpawn2);
            }
        } else if (Math.random() < 0.1d) {
            if (world instanceof ServerLevel) {
                ServerLevel _level3 = (ServerLevel) world;
                Entity entityToSpawn3 = new DarkLatexSnakeEntity((EntityType<DarkLatexSnakeEntity>) ((EntityType) LatexModEntities.DARK_LATEX_SNAKE.get()), (Level) _level3);
                entityToSpawn3.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                if (entityToSpawn3 instanceof Mob) {
                    ((Mob) entityToSpawn3).finalizeSpawn(_level3, world.getCurrentDifficultyAt(entityToSpawn3.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                }
                world.addFreshEntity(entityToSpawn3);
            }
        } else if (Math.random() < 0.1d) {
            if (world instanceof ServerLevel) {
                ServerLevel _level4 = (ServerLevel) world;
                Entity entityToSpawn4 = new DarkLatexSpiderEntity((EntityType<DarkLatexSpiderEntity>) ((EntityType) LatexModEntities.DARK_LATEX_SPIDER.get()), (Level) _level4);
                entityToSpawn4.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                if (entityToSpawn4 instanceof Mob) {
                    ((Mob) entityToSpawn4).finalizeSpawn(_level4, world.getCurrentDifficultyAt(entityToSpawn4.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                }
                world.addFreshEntity(entityToSpawn4);
            }
        } else if (Math.random() < 0.1d) {
            if (world instanceof ServerLevel) {
                ServerLevel _level5 = (ServerLevel) world;
                Entity entityToSpawn5 = new DarkLatexYufeng((EntityType) ChangedEntities.DARK_LATEX_YUFENG.get(), _level5);
                entityToSpawn5.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                if (entityToSpawn5 instanceof Mob) {
                    ((Mob) entityToSpawn5).finalizeSpawn(_level5, world.getCurrentDifficultyAt(entityToSpawn5.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                }
                world.addFreshEntity(entityToSpawn5);
            }
        } else if (world instanceof ServerLevel) {
            ServerLevel _level6 = (ServerLevel) world;
            Entity entityToSpawn6 = new DarklatexslugEntity((EntityType<DarklatexslugEntity>) ((EntityType) LatexModEntities.DARKLATEXSLUG.get()), (Level) _level6);
            entityToSpawn6.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
            if (entityToSpawn6 instanceof Mob) {
                ((Mob) entityToSpawn6).finalizeSpawn(_level6, world.getCurrentDifficultyAt(entityToSpawn6.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
            }
            world.addFreshEntity(entityToSpawn6);
        }
    }
}
