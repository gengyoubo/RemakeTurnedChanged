package net.ltxprogrammer.turned.client.renderer;

import net.ltxprogrammer.changed.client.renderer.LatexHumanoidRenderer;
import net.ltxprogrammer.changed.client.renderer.layers.EmissiveBodyLayer;
import net.ltxprogrammer.changed.client.renderer.model.armor.ArmorNoneModel;
import net.ltxprogrammer.turned.client.model.ModelDark_latex_bee;
import net.ltxprogrammer.turned.entity.DLbeeEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/renderer/DLbeeRenderer.class */
public class DLbeeRenderer extends LatexHumanoidRenderer<DLbeeEntity, ModelDark_latex_bee, ArmorNoneModel<DLbeeEntity>> {
    public DLbeeRenderer(EntityRendererProvider.Context context) {
        super(context, new ModelDark_latex_bee(context.bakeLayer(ModelDark_latex_bee.LAYER_LOCATION)), ArmorNoneModel::new, ArmorNoneModel.INNER_ARMOR, ArmorNoneModel.OUTER_ARMOR, 0.5f);
        addLayer(new EmissiveBodyLayer<>(this, new ResourceLocation("turned:textures/entities/dark_latex_bee_glow.png")));
    }

    public @NotNull ResourceLocation getTextureLocation(@NotNull DLbeeEntity entity) {
        return new ResourceLocation("turned:textures/entities/dark_latex_bee_texture.png");
    }
}
