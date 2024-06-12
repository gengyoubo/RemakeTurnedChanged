package net.ltxprogrammer.turned.procedures;

import net.ltxprogrammer.turned.entity.DroneHertxEntity;
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

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/DronehertxiconRightclickedOnBlockProcedure.class */
public class DronehertxiconRightclickedOnBlockProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity != null) {
            if (world instanceof ServerLevel _level) {
                Entity entityToSpawn = new DroneHertxEntity((EntityType<DroneHertxEntity>) LatexModEntities.DRONE_HERTX.get(), _level);
                entityToSpawn.moveTo(x, y + 1.0d, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                ((Mob) entityToSpawn).finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                world.addFreshEntity(entityToSpawn);
            }
            if (entity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(LatexModItems.DRONEHERTXICON.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
        }
    }
}
