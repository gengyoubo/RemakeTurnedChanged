package net.ltxprogrammer.turned.client.renderer;

import net.ltxprogrammer.changed.client.renderer.LatexHumanoidRenderer;
import net.ltxprogrammer.changed.client.renderer.layers.EmissiveBodyLayer;
import net.ltxprogrammer.changed.client.renderer.model.armor.ArmorNoneModel;
import net.ltxprogrammer.turned.client.model.Modeldark_latex_model;
import net.ltxprogrammer.turned.entity.DarklatexEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/renderer/DarklatexRenderer.class */
public class DarklatexRenderer extends LatexHumanoidRenderer<DarklatexEntity, Modeldark_latex_model, ArmorNoneModel<DarklatexEntity>> {
    public DarklatexRenderer(EntityRendererProvider.Context context) {
        super(context, new Modeldark_latex_model(context.bakeLayer(Modeldark_latex_model.LAYER_LOCATION)), ArmorNoneModel::new, ArmorNoneModel.INNER_ARMOR, ArmorNoneModel.OUTER_ARMOR, 0.5f);
        addLayer(new EmissiveBodyLayer(this, new ResourceLocation("turned:textures/entities/dark_latex_glow.png")));
    }

    public ResourceLocation getTextureLocation(DarklatexEntity entity) {
        return new ResourceLocation("turned:textures/entities/dark_latex_texture.png");
    }
}
