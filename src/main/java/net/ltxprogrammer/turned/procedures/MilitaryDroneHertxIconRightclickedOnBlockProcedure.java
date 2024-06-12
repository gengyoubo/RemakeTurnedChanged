package net.ltxprogrammer.turned.procedures;

import net.ltxprogrammer.turned.entity.ArmedDroneHertxEntity;
import net.ltxprogrammer.turned.init.LatexModEntities;
import net.ltxprogrammer.turned.init.LatexModItems;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerLevel;
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

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/MilitaryDroneHertxIconRightclickedOnBlockProcedure.class */
public class MilitaryDroneHertxIconRightclickedOnBlockProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity != null) {
            if (world instanceof ServerLevel) {
                ServerLevel _level = (ServerLevel) world;
                Entity entityToSpawn = new ArmedDroneHertxEntity((EntityType<ArmedDroneHertxEntity>) ((EntityType) LatexModEntities.ARMED_DRONE_HERTX.get()), (Level) _level);
                entityToSpawn.moveTo(x, y + 1.0d, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                if (entityToSpawn instanceof Mob) {
                    ((Mob) entityToSpawn).finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                }
                world.addFreshEntity(entityToSpawn);
            }
            if (entity instanceof Player) {
                Player _player = (Player) entity;
                ItemStack _stktoremove = new ItemStack((ItemLike) LatexModItems.MILITARY_DRONE_HERTX_ICON.get());
                _player.getInventory().clearOrCountMatchingItems(p -> {
                    return _stktoremove.getItem() == p.getItem();
                }, 1, _player.inventoryMenu.getCraftSlots());
            }
        }
    }
}
