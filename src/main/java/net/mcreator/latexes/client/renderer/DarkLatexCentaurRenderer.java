package net.mcreator.latexes.client.renderer;

import net.mcreator.latexes.client.model.ModelDark_Latex_Centaur_Model;
import net.mcreator.latexes.entity.DarkLatexCentaurEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/DarkLatexCentaurRenderer.class */
public class DarkLatexCentaurRenderer extends MobRenderer<DarkLatexCentaurEntity, ModelDark_Latex_Centaur_Model<DarkLatexCentaurEntity>> {

    /* renamed from: net.mcreator.latexes.client.renderer.DarkLatexCentaurRenderer$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/DarkLatexCentaurRenderer$1.class */
    class AnonymousClass1 extends EyesLayer<DarkLatexCentaurEntity, ModelDark_Latex_Centaur_Model<DarkLatexCentaurEntity>> {
        AnonymousClass1(RenderLayerParent renderLayerParent) {
            super(renderLayerParent);
        }

        public RenderType renderType() {
            return RenderType.eyes(new ResourceLocation("latex:textures/entities/dark_latex_centaur_glow.png"));
        }
    }

    public DarkLatexCentaurRenderer(EntityRendererProvider.Context context) {
        super(context, new ModelDark_Latex_Centaur_Model(context.bakeLayer(ModelDark_Latex_Centaur_Model.LAYER_LOCATION)), 1.5f);
        addLayer(new AnonymousClass1(this));
    }

    public ResourceLocation getTextureLocation(DarkLatexCentaurEntity entity) {
        return new ResourceLocation("latex:textures/entities/dark_latex_centaur_texture.png");
    }
}
