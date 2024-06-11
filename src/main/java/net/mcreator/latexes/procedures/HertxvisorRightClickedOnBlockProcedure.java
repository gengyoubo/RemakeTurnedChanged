package net.mcreator.latexes.procedures;

import net.mcreator.latexes.entity.AHVHertxEntity;
import net.mcreator.latexes.entity.BeeHertxEntity;
import net.mcreator.latexes.entity.HertxEntity;
import net.mcreator.latexes.entity.HertxvarFBEntity;
import net.mcreator.latexes.entity.HertxvarFEntity;
import net.mcreator.latexes.entity.HertxvarSolEntity;
import net.mcreator.latexes.entity.NXTHertxEntity;
import net.mcreator.latexes.init.LatexModBlocks;
import net.mcreator.latexes.init.LatexModEntities;
import net.mcreator.latexes.init.LatexModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundSource;
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
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.ForgeRegistries;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/HertxvisorRightClickedOnBlockProcedure.class */
public class HertxvisorRightClickedOnBlockProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity != null && world.getBlockState(new BlockPos(x, y, z)).getBlock() == LatexModBlocks.DARKLATEXBLOCK.get()) {
            if (entity instanceof Player) {
                Player _player = (Player) entity;
                ItemStack _stktoremove = new ItemStack((ItemLike) LatexModItems.HERTXVISOR.get());
                _player.getInventory().clearOrCountMatchingItems(p -> {
                    return _stktoremove.getItem() == p.getItem();
                }, 1, _player.inventoryMenu.getCraftSlots());
            }
            if (world instanceof Level) {
                Level _level = (Level) world;
                if (!_level.isClientSide()) {
                    _level.playSound((Player) null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                } else {
                    _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                }
            }
            world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
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
            } else if (Math.random() < 0.025d) {
                if (world instanceof ServerLevel) {
                    ServerLevel _level4 = (ServerLevel) world;
                    Entity entityToSpawn3 = new BeeHertxEntity((EntityType<BeeHertxEntity>) ((EntityType) LatexModEntities.BEE_HERTX.get()), (Level) _level4);
                    entityToSpawn3.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                    if (entityToSpawn3 instanceof Mob) {
                        ((Mob) entityToSpawn3).finalizeSpawn(_level4, world.getCurrentDifficultyAt(entityToSpawn3.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                    }
                    world.addFreshEntity(entityToSpawn3);
                }
            } else if (Math.random() < 0.0025d) {
                if (world instanceof ServerLevel) {
                    ServerLevel _level5 = (ServerLevel) world;
                    Entity entityToSpawn4 = new HertxvarSolEntity((EntityType<HertxvarSolEntity>) ((EntityType) LatexModEntities.HERTXVAR_SOL.get()), (Level) _level5);
                    entityToSpawn4.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                    if (entityToSpawn4 instanceof Mob) {
                        ((Mob) entityToSpawn4).finalizeSpawn(_level5, world.getCurrentDifficultyAt(entityToSpawn4.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                    }
                    world.addFreshEntity(entityToSpawn4);
                }
            } else if (Math.random() < 0.05d) {
                if (world instanceof ServerLevel) {
                    ServerLevel _level6 = (ServerLevel) world;
                    Entity entityToSpawn5 = new HertxvarFBEntity((EntityType<HertxvarFBEntity>) ((EntityType) LatexModEntities.HERTXVAR_FB.get()), (Level) _level6);
                    entityToSpawn5.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                    if (entityToSpawn5 instanceof Mob) {
                        ((Mob) entityToSpawn5).finalizeSpawn(_level6, world.getCurrentDifficultyAt(entityToSpawn5.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                    }
                    world.addFreshEntity(entityToSpawn5);
                }
            } else if (Math.random() < 0.1d) {
                if (world instanceof ServerLevel) {
                    ServerLevel _level7 = (ServerLevel) world;
                    Entity entityToSpawn6 = new HertxvarFEntity((EntityType<HertxvarFEntity>) ((EntityType) LatexModEntities.HERTXVAR_F.get()), (Level) _level7);
                    entityToSpawn6.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                    if (entityToSpawn6 instanceof Mob) {
                        ((Mob) entityToSpawn6).finalizeSpawn(_level7, world.getCurrentDifficultyAt(entityToSpawn6.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                    }
                    world.addFreshEntity(entityToSpawn6);
                }
            } else if (world instanceof ServerLevel) {
                ServerLevel _level8 = (ServerLevel) world;
                Entity entityToSpawn7 = new HertxEntity((EntityType<HertxEntity>) ((EntityType) LatexModEntities.HERTX.get()), (Level) _level8);
                entityToSpawn7.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                if (entityToSpawn7 instanceof Mob) {
                    ((Mob) entityToSpawn7).finalizeSpawn(_level8, world.getCurrentDifficultyAt(entityToSpawn7.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                }
                world.addFreshEntity(entityToSpawn7);
            }
        }
    }
}
