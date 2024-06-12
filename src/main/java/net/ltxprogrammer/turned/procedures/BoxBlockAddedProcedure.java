package net.ltxprogrammer.turned.procedures;

import net.minecraft.commands.CommandSource;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.Vec3;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/BoxBlockAddedProcedure.class */
public class BoxBlockAddedProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        if (Math.random() < 0.1d) {
            if (world instanceof ServerLevel _level) {
                _level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(), "data merge block ~ ~ ~ {LootTable:\"turned:laboratory_loot\"}");
            }
            if (world instanceof ServerLevel _level2) {
                _level2.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level2, 4, "", new TextComponent(""), _level2.getServer(), null).withSuppressedOutput(), "data merge block ~ ~ ~ {LootTable:\"turned:chests/civilian_loot\"}");
            }
        } else if (Math.random() < 0.25d) {
            if (world instanceof ServerLevel _level3) {
                _level3.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level3, 4, "", new TextComponent(""), _level3.getServer(), null).withSuppressedOutput(), "data merge block ~ ~ ~ {LootTable:\"turned:laboratory_loot\"}");
            }
        } else if (world instanceof ServerLevel _level4) {
            _level4.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level4, 4, "", new TextComponent(""), _level4.getServer(), null).withSuppressedOutput(), "data merge block ~ ~ ~ {LootTable:\"turned:chests/civilian_loot\"}");
        }
    }
}
