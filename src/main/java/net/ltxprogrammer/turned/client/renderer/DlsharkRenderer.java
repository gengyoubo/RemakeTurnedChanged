package net.ltxprogrammer.turned.client.renderer;

import net.ltxprogrammer.changed.client.renderer.LatexHumanoidRenderer;
import net.ltxprogrammer.changed.client.renderer.model.armor.ArmorNoneModel;
import net.ltxprogrammer.turned.client.model.Modeldark_latex_shark;
import net.ltxprogrammer.turned.entity.DlsharkEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/renderer/DlsharkRenderer.class */
public class DlsharkRenderer extends LatexHumanoidRenderer<DlsharkEntity, Modeldark_latex_shark, ArmorNoneModel<DlsharkEntity>> {
    public DlsharkRenderer(EntityRendererProvider.Context context) {
        super(context, new Modeldark_latex_shark(context.bakeLayer(Modeldark_latex_shark.LAYER_LOCATION)), ArmorNoneModel::new, ArmorNoneModel.INNER_ARMOR, ArmorNoneModel.OUTER_ARMOR, 0.6f);
        addLayer(new EyesLayer<DlsharkEntity, Modeldark_latex_shark>(this) { // from class: net.ltxprogrammer.turned.client.renderer.DlsharkRenderer.1
            public RenderType renderType() {
                return RenderType.eyes(new ResourceLocation("turned:textures/entities/dark_latex_shark_glow.png"));
            }
        });
    }

    public ResourceLocation getTextureLocation(DlsharkEntity entity) {
        return new ResourceLocation("turned:textures/entities/dark_latex_shark_texture.png");
    }
}
