package net.mcreator.latexes.procedures;

import net.mcreator.latexes.LatexMod;
import net.mcreator.latexes.init.LatexModItems;
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

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/Instafacility2RightClickedOnBlockProcedure.class */
public class Instafacility2RightClickedOnBlockProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity != null) {
            if (world instanceof ServerLevel) {
                ServerLevel _serverworld = (ServerLevel) world;
                StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation(LatexMod.MODID, "operative_facility_2"));
                if (template != null) {
                    template.placeInWorld(_serverworld, new BlockPos(x, y, z), new BlockPos(x, y, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
                }
            }
            if (entity instanceof Player) {
                Player _player = (Player) entity;
                ItemStack _stktoremove = new ItemStack((ItemLike) LatexModItems.INSTAFACILITY_2.get());
                _player.getInventory().clearOrCountMatchingItems(p -> {
                    return _stktoremove.getItem() == p.getItem();
                }, 1, _player.inventoryMenu.getCraftSlots());
            }
        }
    }
}
