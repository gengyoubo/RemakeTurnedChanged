package net.mcreator.latexes.procedures;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.Entity;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/CheckentityislatexProcedure.class */
public class CheckentityislatexProcedure {
    public static boolean execute(Entity entity) {
        return entity != null && entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("latex:darklatexes")));
    }
}
