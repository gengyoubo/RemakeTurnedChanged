package net.mcreator.latexes.procedures;

import net.mcreator.latexes.entity.ProtectorSlimelingEntity;
import net.mcreator.latexes.entity.SlimelingTamedEntity;
import net.mcreator.latexes.init.LatexModEntities;
import net.mcreator.latexes.init.LatexModItems;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/SlimelingRightClickedOnEntityProcedure.class */
public class SlimelingRightClickedOnEntityProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
        if (entity != null && sourceentity != null) {
            if ((sourceentity instanceof LivingEntity ? ((LivingEntity) sourceentity).getMainHandItem() : ItemStack.EMPTY).getItem() != LatexModItems.DARKLATEXGOO.get()) {
                if ((sourceentity instanceof LivingEntity ? ((LivingEntity) sourceentity).getOffhandItem() : ItemStack.EMPTY).getItem() != LatexModItems.DARKLATEXGOO.get()) {
                    return;
                }
            }
            if (sourceentity instanceof Player) {
                Player _player = (Player) sourceentity;
                ItemStack _stktoremove = new ItemStack((ItemLike) LatexModItems.DARKLATEXGOO.get());
                _player.getInventory().clearOrCountMatchingItems(p -> {
                    return _stktoremove.getItem() == p.getItem();
                }, 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.4d) {
                if (Math.random() < 0.025d) {
                    if (world instanceof ServerLevel) {
                        ((ServerLevel) world).sendParticles(ParticleTypes.HEART, x, y, z, 6, 2.0d, 2.0d, 2.0d, 1.0d);
                    }
                    if (world instanceof ServerLevel) {
                        ServerLevel _level = (ServerLevel) world;
                        Entity entityToSpawn = new ProtectorSlimelingEntity((EntityType<ProtectorSlimelingEntity>) ((EntityType) LatexModEntities.PROTECTOR_SLIMELING.get()), (Level) _level);
                        entityToSpawn.moveTo(x, y, z, 0.0f, 0.0f);
                        entityToSpawn.setYBodyRot(0.0f);
                        entityToSpawn.setYHeadRot(0.0f);
                        entityToSpawn.setDeltaMovement(0.0d, 0.0d, 0.0d);
                        if (entityToSpawn instanceof Mob) {
                            ((Mob) entityToSpawn).finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn);
                    }
                    if (!entity.level.isClientSide()) {
                        entity.discard();
                        return;
                    }
                    return;
                }
                if (world instanceof ServerLevel) {
                    ((ServerLevel) world).sendParticles(ParticleTypes.HEART, x, y, z, 6, 2.0d, 2.0d, 2.0d, 1.0d);
                }
                if (world instanceof ServerLevel) {
                    ServerLevel _level2 = (ServerLevel) world;
                    Entity entityToSpawn2 = new SlimelingTamedEntity((EntityType<SlimelingTamedEntity>) ((EntityType) LatexModEntities.SLIMELING_TAMED.get()), (Level) _level2);
                    entityToSpawn2.moveTo(x, y, z, 0.0f, 0.0f);
                    entityToSpawn2.setYBodyRot(0.0f);
                    entityToSpawn2.setYHeadRot(0.0f);
                    entityToSpawn2.setDeltaMovement(0.0d, 0.0d, 0.0d);
                    if (entityToSpawn2 instanceof Mob) {
                        ((Mob) entityToSpawn2).finalizeSpawn(_level2, world.getCurrentDifficultyAt(entityToSpawn2.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                    }
                    world.addFreshEntity(entityToSpawn2);
                }
                if (!entity.level.isClientSide()) {
                    entity.discard();
                }
            } else if (world instanceof ServerLevel) {
                ((ServerLevel) world).sendParticles(ParticleTypes.SMOKE, x, y, z, 6, 2.0d, 2.0d, 2.0d, 1.0d);
            }
        }
    }
}
