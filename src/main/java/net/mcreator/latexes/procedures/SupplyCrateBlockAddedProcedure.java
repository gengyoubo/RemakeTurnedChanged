package net.mcreator.latexes.procedures;

import net.minecraft.commands.CommandSource;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.Vec3;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/SupplyCrateBlockAddedProcedure.class */
public class SupplyCrateBlockAddedProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        if (Math.random() < 0.4d) {
            if (world instanceof ServerLevel) {
                ServerLevel _level = (ServerLevel) world;
                _level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""), _level.getServer(), (Entity) null).withSuppressedOutput(), "data merge block ~ ~ ~ {LootTable:\"latex:chests/militaryloot\"}");
            }
        } else if (world instanceof ServerLevel) {
            ServerLevel _level2 = (ServerLevel) world;
            _level2.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level2, 4, "", new TextComponent(""), _level2.getServer(), (Entity) null).withSuppressedOutput(), "data merge block ~ ~ ~ {LootTable:\"latex:laboratory_loot\"}");
        }
    }
}
