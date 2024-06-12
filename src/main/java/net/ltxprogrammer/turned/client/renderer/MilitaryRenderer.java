package net.ltxprogrammer.turned.client.renderer;

import net.ltxprogrammer.turned.entity.MilitaryEntity;
import net.ltxprogrammer.turned.init.LatexModModels;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/renderer/MilitaryRenderer.class */
public class MilitaryRenderer extends HumanoidMobRenderer<MilitaryEntity, HumanoidModel<MilitaryEntity>> {
    public MilitaryRenderer(EntityRendererProvider.Context context) {
        super(context, new HumanoidModel<>(context.bakeLayer(LatexModModels.HUMANOID)), 0.5f);
        addLayer(new HumanoidArmorLayer<>(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));
    }

    public @NotNull ResourceLocation getTextureLocation(@NotNull MilitaryEntity entity) {
        return new ResourceLocation("turned:textures/entities/military_steve.png");
    }
}
