package net.ltxprogrammer.turned.procedures;

import net.ltxprogrammer.changed.init.ChangedSounds;
import net.ltxprogrammer.turned.entity.AHVHertxEntity;
import net.ltxprogrammer.turned.entity.BeeHertxEntity;
import net.ltxprogrammer.turned.entity.DLbeeEntity;
import net.ltxprogrammer.turned.entity.HertxEntity;
import net.ltxprogrammer.turned.entity.HertxvarFEntity;
import net.ltxprogrammer.turned.entity.NXTHertxEntity;
import net.ltxprogrammer.turned.init.LatexModEntities;
import net.ltxprogrammer.turned.init.LatexModItems;
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
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/HertxvisorLivingEntityIsHitWithItemProcedure.class */
public class HertxvisorLivingEntityIsHitWithItemProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity != null) {
            if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("turned:darklatexes")))) {
                if (entity instanceof Player) {
                    Player _player = (Player) entity;
                    ItemStack _stktoremove = new ItemStack((ItemLike) LatexModItems.HERTXVISOR.get());
                    _player.getInventory().clearOrCountMatchingItems(p -> {
                        return _stktoremove.getItem() == p.getItem();
                    }, 1, _player.inventoryMenu.getCraftSlots());
                }
                if (!entity.level.isClientSide()) {
                    entity.discard();
                }
                if (world instanceof Level) {
                    Level _level = (Level) world;
                    if (!_level.isClientSide()) {
                        _level.playSound((Player) null, new BlockPos(x, y, z), ChangedSounds.POISON, SoundSource.NEUTRAL, 1.0f, 1.0f);
                    } else {
                        _level.playLocalSound(x, y, z, ChangedSounds.POISON, SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                    }
                }
                if (Math.random() < 0.01d) {
                    if (world instanceof ServerLevel) {
                        ServerLevel _level2 = (ServerLevel) world;
                        Entity entityToSpawn = new AHVHertxEntity((EntityType<AHVHertxEntity>) ((EntityType) LatexModEntities.AHV_HERTX.get()), (Level) _level2);
                        entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                        if (entityToSpawn instanceof Mob) {
                            ((Mob) entityToSpawn).finalizeSpawn(_level2, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn);
                    }
                } else if (Math.random() < 0.01d) {
                    if (world instanceof ServerLevel) {
                        ServerLevel _level3 = (ServerLevel) world;
                        Entity entityToSpawn2 = new NXTHertxEntity((EntityType<NXTHertxEntity>) ((EntityType) LatexModEntities.NXT_HERTX.get()), (Level) _level3);
                        entityToSpawn2.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                        if (entityToSpawn2 instanceof Mob) {
                            ((Mob) entityToSpawn2).finalizeSpawn(_level3, world.getCurrentDifficultyAt(entityToSpawn2.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn2);
                    }
                } else if (Math.random() < 0.1d) {
                    if (world instanceof ServerLevel) {
                        ServerLevel _level4 = (ServerLevel) world;
                        Entity entityToSpawn3 = new HertxvarFEntity((EntityType<HertxvarFEntity>) ((EntityType) LatexModEntities.HERTXVAR_F.get()), (Level) _level4);
                        entityToSpawn3.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                        if (entityToSpawn3 instanceof Mob) {
                            ((Mob) entityToSpawn3).finalizeSpawn(_level4, world.getCurrentDifficultyAt(entityToSpawn3.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn3);
                    }
                } else if (Math.random() < 0.1d) {
                    if (world instanceof ServerLevel) {
                        ServerLevel _level5 = (ServerLevel) world;
                        Entity entityToSpawn4 = new HertxvarFEntity((EntityType<HertxvarFEntity>) ((EntityType) LatexModEntities.HERTXVAR_F.get()), (Level) _level5);
                        entityToSpawn4.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                        if (entityToSpawn4 instanceof Mob) {
                            ((Mob) entityToSpawn4).finalizeSpawn(_level5, world.getCurrentDifficultyAt(entityToSpawn4.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn4);
                    }
                } else if (world instanceof ServerLevel) {
                    ServerLevel _level6 = (ServerLevel) world;
                    Entity entityToSpawn5 = new HertxEntity((EntityType<HertxEntity>) ((EntityType) LatexModEntities.HERTX.get()), (Level) _level6);
                    entityToSpawn5.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                    if (entityToSpawn5 instanceof Mob) {
                        ((Mob) entityToSpawn5).finalizeSpawn(_level6, world.getCurrentDifficultyAt(entityToSpawn5.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                    }
                    world.addFreshEntity(entityToSpawn5);
                }
            } else if (entity instanceof DLbeeEntity) {
                if (entity instanceof Player) {
                    Player _player2 = (Player) entity;
                    ItemStack _stktoremove2 = new ItemStack((ItemLike) LatexModItems.HERTXVISOR.get());
                    _player2.getInventory().clearOrCountMatchingItems(p -> {
                        return _stktoremove2.getItem() == p.getItem();
                    }, 1, _player2.inventoryMenu.getCraftSlots());
                }
                if (!entity.level.isClientSide()) {
                    entity.discard();
                }
                if (world instanceof Level) {
                    Level _level7 = (Level) world;
                    if (!_level7.isClientSide()) {
                        _level7.playSound((Player) null, new BlockPos(x, y, z), ChangedSounds.POISON, SoundSource.NEUTRAL, 1.0f, 1.0f);
                    } else {
                        _level7.playLocalSound(x, y, z, ChangedSounds.POISON, SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                    }
                }
                if (world instanceof ServerLevel) {
                    ServerLevel _level8 = (ServerLevel) world;
                    Entity entityToSpawn6 = new BeeHertxEntity((EntityType<BeeHertxEntity>) ((EntityType) LatexModEntities.BEE_HERTX.get()), (Level) _level8);
                    entityToSpawn6.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                    if (entityToSpawn6 instanceof Mob) {
                        ((Mob) entityToSpawn6).finalizeSpawn(_level8, world.getCurrentDifficultyAt(entityToSpawn6.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                    }
                    world.addFreshEntity(entityToSpawn6);
                }
            }
        }
    }
}
