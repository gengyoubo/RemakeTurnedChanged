package net.mcreator.latexes.procedures;

import net.mcreator.latexes.entity.DLbeeEntity;
import net.mcreator.latexes.entity.DarkLatexCreeperEnhancedEntity;
import net.mcreator.latexes.entity.DarkLatexCreeperEntity;
import net.mcreator.latexes.entity.DarkLatexDragonEntity;
import net.mcreator.latexes.entity.DarkLatexQueenBeeEntity;
import net.mcreator.latexes.entity.DarkLatexSkeletonEntity;
import net.mcreator.latexes.entity.DarkLatexSpiderEntity;
import net.mcreator.latexes.entity.DarkLatexSpiderQueenEntity;
import net.mcreator.latexes.entity.DarklatexEntity;
import net.mcreator.latexes.entity.DlsharkEntity;
import net.mcreator.latexes.entity.YufengEntity;
import net.mcreator.latexes.init.LatexModEntities;
import net.mcreator.latexes.init.LatexModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.TagKey;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.animal.Bee;
import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
import net.minecraft.world.entity.boss.wither.WitherBoss;
import net.minecraft.world.entity.monster.CaveSpider;
import net.minecraft.world.entity.monster.Creeper;
import net.minecraft.world.entity.monster.ElderGuardian;
import net.minecraft.world.entity.monster.Spider;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.registries.ForgeRegistries;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/DarklatexcrystaleggEntityCollidesInTheBlockProcedure.class */
public class DarklatexcrystaleggEntityCollidesInTheBlockProcedure {
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c4, code lost:
        if ((r20 instanceof net.minecraft.world.entity.LivingEntity ? ((net.minecraft.world.entity.LivingEntity) r20).getItemBySlot(net.minecraft.world.entity.EquipmentSlot.FEET) : net.minecraft.world.item.ItemStack.EMPTY).getItem() != net.mcreator.latexes.init.LatexModItems.HAZMAT_BOOTS.get()) goto L_0x00c7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:370:0x1109 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0102  */
    public static boolean execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        boolean z2;
        if (entity == null) {
            return false;
        }
        if ((entity instanceof Player) && ((Player) entity).getAbilities().instabuild) {
            return true;
        }
        if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == LatexModItems.HAZMAT_HELMET.get()) {
            if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == LatexModItems.HAZMAT_CHESTPLATE.get()) {
                if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem() == LatexModItems.HAZMAT_LEGGINGS.get()) {
                }
            }
        }
        if (!entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("latex:robots"))) && !(entity instanceof ElderGuardian) && !(entity instanceof WitherBoss) && !(entity instanceof EnderDragon)) {
            z2 = false;
            if (!z2) {
                return true;
            }
            if (Math.random() >= 0.25d || (entity instanceof Player)) {
                entity.hurt(DamageSource.CACTUS, 5.0f);
                return false;
            } else if (entity instanceof DarklatexEntity) {
                if (Math.random() < 0.3d) {
                    if (!entity.level.isClientSide()) {
                        entity.discard();
                    }
                    if (world instanceof Level) {
                        Level _level = (Level) world;
                        if (!_level.isClientSide()) {
                            _level.playSound((Player) null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie_villager.converted")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                        } else {
                            _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie_villager.converted")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                        }
                    }
                    if (world instanceof ServerLevel) {
                        ServerLevel _level2 = (ServerLevel) world;
                        Entity entityToSpawn = new DarkLatexSkeletonEntity((EntityType<DarkLatexSkeletonEntity>) ((EntityType) LatexModEntities.DARK_LATEX_SKELETON.get()), (Level) _level2);
                        entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                        if (entityToSpawn instanceof Mob) {
                            ((Mob) entityToSpawn).finalizeSpawn(_level2, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn);
                    }
                } else if (Math.random() < 0.1d) {
                    if (!entity.level.isClientSide()) {
                        entity.discard();
                    }
                    if (world instanceof Level) {
                        Level _level3 = (Level) world;
                        if (!_level3.isClientSide()) {
                            _level3.playSound((Player) null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie_villager.converted")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                        } else {
                            _level3.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie_villager.converted")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                        }
                    }
                    if (world instanceof ServerLevel) {
                        ServerLevel _level4 = (ServerLevel) world;
                        Entity entityToSpawn2 = new YufengEntity((EntityType<YufengEntity>) ((EntityType) LatexModEntities.YUFENG.get()), (Level) _level4);
                        entityToSpawn2.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                        if (entityToSpawn2 instanceof Mob) {
                            ((Mob) entityToSpawn2).finalizeSpawn(_level4, world.getCurrentDifficultyAt(entityToSpawn2.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn2);
                    }
                } else {
                    if (entity instanceof LivingEntity) {
                        ((LivingEntity) entity).setHealth(entity instanceof LivingEntity ? ((LivingEntity) entity).getMaxHealth() : -1.0f);
                    }
                    if (entity instanceof LivingEntity) {
                        ((LivingEntity) entity).addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 200, 1, false, false));
                    }
                    if (entity instanceof LivingEntity) {
                        ((LivingEntity) entity).addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 200, 1, false, false));
                    }
                }
                world.destroyBlock(new BlockPos(x, y, z), false);
                return false;
            } else if (entity instanceof DLbeeEntity) {
                if (Math.random() < 0.3d) {
                    if (!entity.level.isClientSide()) {
                        entity.discard();
                    }
                    if (world instanceof Level) {
                        Level _level5 = (Level) world;
                        if (!_level5.isClientSide()) {
                            _level5.playSound((Player) null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie_villager.converted")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                        } else {
                            _level5.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie_villager.converted")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                        }
                    }
                    if (world instanceof ServerLevel) {
                        ServerLevel _level6 = (ServerLevel) world;
                        Entity entityToSpawn3 = new DarkLatexQueenBeeEntity((EntityType<DarkLatexQueenBeeEntity>) ((EntityType) LatexModEntities.DARK_LATEX_QUEEN_BEE.get()), (Level) _level6);
                        entityToSpawn3.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                        if (entityToSpawn3 instanceof Mob) {
                            ((Mob) entityToSpawn3).finalizeSpawn(_level6, world.getCurrentDifficultyAt(entityToSpawn3.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn3);
                    }
                } else {
                    if (entity instanceof LivingEntity) {
                        ((LivingEntity) entity).setHealth(entity instanceof LivingEntity ? ((LivingEntity) entity).getMaxHealth() : -1.0f);
                    }
                    if (entity instanceof LivingEntity) {
                        ((LivingEntity) entity).addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 200, 1, false, false));
                    }
                    if (entity instanceof LivingEntity) {
                        ((LivingEntity) entity).addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 200, 1, false, false));
                    }
                }
                world.destroyBlock(new BlockPos(x, y, z), false);
                return false;
            } else if (entity instanceof YufengEntity) {
                if (Math.random() < 0.01d) {
                    if (!entity.level.isClientSide()) {
                        entity.discard();
                    }
                    if (world instanceof Level) {
                        Level _level7 = (Level) world;
                        if (!_level7.isClientSide()) {
                            _level7.playSound((Player) null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie_villager.converted")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                        } else {
                            _level7.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie_villager.converted")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                        }
                    }
                    if (world instanceof ServerLevel) {
                        ServerLevel _level8 = (ServerLevel) world;
                        Entity entityToSpawn4 = new DarkLatexDragonEntity((EntityType<DarkLatexDragonEntity>) ((EntityType) LatexModEntities.DARK_LATEX_DRAGON.get()), (Level) _level8);
                        entityToSpawn4.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                        if (entityToSpawn4 instanceof Mob) {
                            ((Mob) entityToSpawn4).finalizeSpawn(_level8, world.getCurrentDifficultyAt(entityToSpawn4.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn4);
                    }
                } else {
                    if (entity instanceof LivingEntity) {
                        ((LivingEntity) entity).setHealth(entity instanceof LivingEntity ? ((LivingEntity) entity).getMaxHealth() : -1.0f);
                    }
                    if (entity instanceof LivingEntity) {
                        ((LivingEntity) entity).addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200, 1, false, false));
                    }
                    if (entity instanceof LivingEntity) {
                        ((LivingEntity) entity).addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 200, 1, false, false));
                    }
                }
                world.destroyBlock(new BlockPos(x, y, z), false);
                return false;
            } else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("latex:darklatexes")))) {
                if (entity instanceof LivingEntity) {
                    ((LivingEntity) entity).setHealth(entity instanceof LivingEntity ? ((LivingEntity) entity).getMaxHealth() : -1.0f);
                }
                if (entity instanceof LivingEntity) {
                    ((LivingEntity) entity).addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 200, 1, false, false));
                }
                if (entity instanceof LivingEntity) {
                    ((LivingEntity) entity).addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 200, 1, false, false));
                }
                world.destroyBlock(new BlockPos(x, y, z), false);
                return false;
            } else if (entity instanceof DarkLatexCreeperEntity) {
                if (Math.random() < 0.01d) {
                    if (!entity.level.isClientSide()) {
                        entity.discard();
                    }
                    if (world instanceof Level) {
                        Level _level9 = (Level) world;
                        if (!_level9.isClientSide()) {
                            _level9.playSound((Player) null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie_villager.converted")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                        } else {
                            _level9.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie_villager.converted")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                        }
                    }
                    if (!(world instanceof ServerLevel)) {
                        return false;
                    }
                    ServerLevel _level10 = (ServerLevel) world;
                    Entity entityToSpawn5 = new DarkLatexCreeperEnhancedEntity((EntityType<DarkLatexCreeperEnhancedEntity>) ((EntityType) LatexModEntities.DARK_LATEX_CREEPER_ENHANCED.get()), (Level) _level10);
                    entityToSpawn5.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                    if (entityToSpawn5 instanceof Mob) {
                        ((Mob) entityToSpawn5).finalizeSpawn(_level10, world.getCurrentDifficultyAt(entityToSpawn5.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                    }
                    world.addFreshEntity(entityToSpawn5);
                    return false;
                }
                if (entity instanceof LivingEntity) {
                    ((LivingEntity) entity).setHealth(entity instanceof LivingEntity ? ((LivingEntity) entity).getMaxHealth() : -1.0f);
                }
                if (entity instanceof LivingEntity) {
                    ((LivingEntity) entity).addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 320, 1, false, false));
                }
                if (entity instanceof LivingEntity) {
                    ((LivingEntity) entity).addEffect(new MobEffectInstance(MobEffects.JUMP, 320, 1, false, false));
                }
                if (!(entity instanceof LivingEntity)) {
                    return false;
                }
                ((LivingEntity) entity).addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 320, 2, false, false));
                return false;
            } else if (entity instanceof Bee) {
                entity.hurt(DamageSource.CACTUS, 20.0f);
                if (!entity.level.isClientSide()) {
                    entity.discard();
                }
                world.destroyBlock(new BlockPos(x, y, z), false);
                if (world instanceof Level) {
                    Level _level11 = (Level) world;
                    if (!_level11.isClientSide()) {
                        _level11.playSound((Player) null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                    } else {
                        _level11.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                    }
                }
                if (!(world instanceof ServerLevel)) {
                    return false;
                }
                ServerLevel _level12 = (ServerLevel) world;
                Entity entityToSpawn6 = new DLbeeEntity((EntityType<DLbeeEntity>) ((EntityType) LatexModEntities.D_LBEE.get()), (Level) _level12);
                entityToSpawn6.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                if (entityToSpawn6 instanceof Mob) {
                    ((Mob) entityToSpawn6).finalizeSpawn(_level12, world.getCurrentDifficultyAt(entityToSpawn6.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                }
                world.addFreshEntity(entityToSpawn6);
                return false;
            } else if (entity instanceof DarkLatexSkeletonEntity) {
                if (Math.random() < 0.02d) {
                    if (!entity.level.isClientSide()) {
                        entity.discard();
                    }
                    if (world instanceof Level) {
                        Level _level13 = (Level) world;
                        if (!_level13.isClientSide()) {
                            _level13.playSound((Player) null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie_villager.converted")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                        } else {
                            _level13.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie_villager.converted")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                        }
                    }
                    if (world instanceof ServerLevel) {
                        ServerLevel _level14 = (ServerLevel) world;
                        Entity entityToSpawn7 = new DarkLatexDragonEntity((EntityType<DarkLatexDragonEntity>) ((EntityType) LatexModEntities.DARK_LATEX_DRAGON.get()), (Level) _level14);
                        entityToSpawn7.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                        if (entityToSpawn7 instanceof Mob) {
                            ((Mob) entityToSpawn7).finalizeSpawn(_level14, world.getCurrentDifficultyAt(entityToSpawn7.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn7);
                    }
                    world.destroyBlock(new BlockPos(x, y, z), false);
                    return false;
                }
                if (entity instanceof LivingEntity) {
                    ((LivingEntity) entity).setHealth(entity instanceof LivingEntity ? ((LivingEntity) entity).getMaxHealth() : -1.0f);
                }
                if (entity instanceof LivingEntity) {
                    ((LivingEntity) entity).addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 200, 1, false, false));
                }
                if (entity instanceof LivingEntity) {
                    ((LivingEntity) entity).addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 200, 1, false, false));
                }
                world.destroyBlock(new BlockPos(x, y, z), false);
                return false;
            } else if (entity.isInWater()) {
                entity.hurt(DamageSource.CACTUS, 20.0f);
                if (!entity.level.isClientSide()) {
                    entity.discard();
                }
                world.destroyBlock(new BlockPos(x, y, z), false);
                if (world instanceof Level) {
                    Level _level15 = (Level) world;
                    if (!_level15.isClientSide()) {
                        _level15.playSound((Player) null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                    } else {
                        _level15.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                    }
                }
                if (!(world instanceof ServerLevel)) {
                    return false;
                }
                ServerLevel _level16 = (ServerLevel) world;
                Entity entityToSpawn8 = new DlsharkEntity((EntityType<DlsharkEntity>) ((EntityType) LatexModEntities.DLSHARK.get()), (Level) _level16);
                entityToSpawn8.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                if (entityToSpawn8 instanceof Mob) {
                    ((Mob) entityToSpawn8).finalizeSpawn(_level16, world.getCurrentDifficultyAt(entityToSpawn8.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                }
                world.addFreshEntity(entityToSpawn8);
                return false;
            } else if ((entity instanceof Spider) || (entity instanceof CaveSpider)) {
                entity.hurt(DamageSource.CACTUS, 20.0f);
                if (!entity.level.isClientSide()) {
                    entity.discard();
                }
                world.destroyBlock(new BlockPos(x, y, z), false);
                if (world instanceof Level) {
                    Level _level17 = (Level) world;
                    if (!_level17.isClientSide()) {
                        _level17.playSound((Player) null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                    } else {
                        _level17.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                    }
                }
                if (!(world instanceof ServerLevel)) {
                    return false;
                }
                ServerLevel _level18 = (ServerLevel) world;
                Entity entityToSpawn9 = new DarkLatexSpiderEntity((EntityType<DarkLatexSpiderEntity>) ((EntityType) LatexModEntities.DARK_LATEX_SPIDER.get()), (Level) _level18);
                entityToSpawn9.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                if (entityToSpawn9 instanceof Mob) {
                    ((Mob) entityToSpawn9).finalizeSpawn(_level18, world.getCurrentDifficultyAt(entityToSpawn9.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                }
                world.addFreshEntity(entityToSpawn9);
                return false;
            } else if (entity instanceof Creeper) {
                entity.hurt(DamageSource.CACTUS, 20.0f);
                if (!entity.level.isClientSide()) {
                    entity.discard();
                }
                world.destroyBlock(new BlockPos(x, y, z), false);
                if (world instanceof Level) {
                    Level _level19 = (Level) world;
                    if (!_level19.isClientSide()) {
                        _level19.playSound((Player) null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                    } else {
                        _level19.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                    }
                }
                if (!(world instanceof ServerLevel)) {
                    return false;
                }
                ServerLevel _level20 = (ServerLevel) world;
                Entity entityToSpawn10 = new DarkLatexCreeperEntity((EntityType<DarkLatexCreeperEntity>) ((EntityType) LatexModEntities.DARK_LATEX_CREEPER.get()), (Level) _level20);
                entityToSpawn10.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                if (entityToSpawn10 instanceof Mob) {
                    ((Mob) entityToSpawn10).finalizeSpawn(_level20, world.getCurrentDifficultyAt(entityToSpawn10.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                }
                world.addFreshEntity(entityToSpawn10);
                return false;
            } else if (!(entity instanceof DarkLatexSpiderEntity)) {
                entity.hurt(DamageSource.CACTUS, 20.0f);
                if (!entity.level.isClientSide()) {
                    entity.discard();
                }
                world.destroyBlock(new BlockPos(x, y, z), false);
                if (world instanceof Level) {
                    Level _level21 = (Level) world;
                    if (!_level21.isClientSide()) {
                        _level21.playSound((Player) null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                    } else {
                        _level21.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                    }
                }
                if (!(world instanceof ServerLevel)) {
                    return false;
                }
                ServerLevel _level22 = (ServerLevel) world;
                Entity entityToSpawn11 = new DarklatexEntity((EntityType<DarklatexEntity>) ((EntityType) LatexModEntities.DARKLATEX.get()), (Level) _level22);
                entityToSpawn11.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                if (entityToSpawn11 instanceof Mob) {
                    ((Mob) entityToSpawn11).finalizeSpawn(_level22, world.getCurrentDifficultyAt(entityToSpawn11.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                }
                world.addFreshEntity(entityToSpawn11);
                return false;
            } else if (Math.random() < 0.3d) {
                if (!entity.level.isClientSide()) {
                    entity.discard();
                }
                world.destroyBlock(new BlockPos(x, y, z), false);
                if (world instanceof Level) {
                    Level _level23 = (Level) world;
                    if (!_level23.isClientSide()) {
                        _level23.playSound((Player) null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie_villager.converted")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                    } else {
                        _level23.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie_villager.converted")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                    }
                }
                if (!(world instanceof ServerLevel)) {
                    return false;
                }
                ServerLevel _level24 = (ServerLevel) world;
                Entity entityToSpawn12 = new DarkLatexSpiderQueenEntity((EntityType<DarkLatexSpiderQueenEntity>) ((EntityType) LatexModEntities.DARK_LATEX_SPIDER_QUEEN.get()), (Level) _level24);
                entityToSpawn12.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                if (entityToSpawn12 instanceof Mob) {
                    ((Mob) entityToSpawn12).finalizeSpawn(_level24, world.getCurrentDifficultyAt(entityToSpawn12.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                }
                world.addFreshEntity(entityToSpawn12);
                return false;
            } else {
                if (entity instanceof LivingEntity) {
                    ((LivingEntity) entity).setHealth(entity instanceof LivingEntity ? ((LivingEntity) entity).getMaxHealth() : -1.0f);
                }
                if (entity instanceof LivingEntity) {
                    ((LivingEntity) entity).addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 200, 1, false, false));
                }
                if (entity instanceof LivingEntity) {
                    ((LivingEntity) entity).addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 200, 1, false, false));
                }
                world.destroyBlock(new BlockPos(x, y, z), false);
                return false;
            }
        }
        z2 = true;
        if (!z2) {
        }
    }
}
