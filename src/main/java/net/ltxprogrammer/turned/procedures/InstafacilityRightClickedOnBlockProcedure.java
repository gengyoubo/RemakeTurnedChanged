package net.ltxprogrammer.turned.procedures;

import net.ltxprogrammer.turned.LatexMod;
import net.ltxprogrammer.turned.init.LatexModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/InstafacilityRightClickedOnBlockProcedure.class */
public class InstafacilityRightClickedOnBlockProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity != null) {
            if (world instanceof ServerLevel _serverworld) {
                StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation(LatexMod.MODID, "operative_facility"));
                template.placeInWorld(_serverworld, new BlockPos(x, y - 2.0d, z), new BlockPos(x, y - 2.0d, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
            }
            if (entity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(LatexModItems.INSTAFACILITY.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
        }
    }
}
