package net.ltxprogrammer.turned.client.renderer;

import net.ltxprogrammer.changed.client.renderer.LatexHumanoidRenderer;
import net.ltxprogrammer.changed.client.renderer.layers.EmissiveBodyLayer;
import net.ltxprogrammer.changed.client.renderer.model.armor.ArmorNoneModel;
import net.ltxprogrammer.turned.client.model.ModelDark_latex_squid_dog;
import net.ltxprogrammer.turned.entity.DlSquidDogEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/renderer/DlSquidDogRenderer.class */
public class DlSquidDogRenderer extends LatexHumanoidRenderer<DlSquidDogEntity, ModelDark_latex_squid_dog, ArmorNoneModel<DlSquidDogEntity>> {
    public DlSquidDogRenderer(EntityRendererProvider.Context context) {
        super(context, new ModelDark_latex_squid_dog(context.bakeLayer(ModelDark_latex_squid_dog.LAYER_LOCATION)), ArmorNoneModel::new, ArmorNoneModel.INNER_ARMOR, ArmorNoneModel.OUTER_ARMOR, 0.6f);
        addLayer(new EmissiveBodyLayer(this, new ResourceLocation("turned:textures/entities/dark_latex_squiddog_glow.png")));
    }

    public ResourceLocation getTextureLocation(DlSquidDogEntity entity) {
        return new ResourceLocation("turned:textures/entities/dark_latex_squiddog_model.png");
    }
}
