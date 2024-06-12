package net.ltxprogrammer.turned.client.renderer;

import net.ltxprogrammer.changed.client.renderer.LatexHumanoidRenderer;
import net.ltxprogrammer.changed.client.renderer.model.armor.ArmorNoneModel;
import net.ltxprogrammer.turned.client.model.Modeldl_moth_model;
import net.ltxprogrammer.turned.entity.DarkLatexMothEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/renderer/DarkLatexMothRenderer.class */
public class DarkLatexMothRenderer extends LatexHumanoidRenderer<DarkLatexMothEntity, Modeldl_moth_model, ArmorNoneModel<DarkLatexMothEntity>> {
    public DarkLatexMothRenderer(EntityRendererProvider.Context context) {
        super(context, new Modeldl_moth_model(context.bakeLayer(Modeldl_moth_model.LAYER_LOCATION)), ArmorNoneModel::new, ArmorNoneModel.INNER_ARMOR, ArmorNoneModel.OUTER_ARMOR, 0.6f);
    }

    public ResourceLocation getTextureLocation(DarkLatexMothEntity entity) {
        return new ResourceLocation("turned:textures/entities/dl_moth_texture.png");
    }
}
