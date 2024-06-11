package net.mcreator.latexes.client.renderer;

import net.mcreator.latexes.entity.EvilScientistEntity;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.resources.ResourceLocation;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/EvilScientistRenderer.class */
public class EvilScientistRenderer extends HumanoidMobRenderer<EvilScientistEntity, HumanoidModel<EvilScientistEntity>> {
    public EvilScientistRenderer(EntityRendererProvider.Context context) {
        super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
        addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));
    }

    public ResourceLocation getTextureLocation(EvilScientistEntity entity) {
        return new ResourceLocation("latex:textures/entities/evil_scientist_steve.png");
    }
}
