package net.ltxprogrammer.turned.client.renderer;

import net.ltxprogrammer.turned.client.model.Modeldark_latex_fox_scientist;
import net.ltxprogrammer.turned.entity.DarkLatexFoxScientistEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/renderer/DarkLatexFoxScientistRenderer.class */
public class DarkLatexFoxScientistRenderer extends MobRenderer<DarkLatexFoxScientistEntity, Modeldark_latex_fox_scientist<DarkLatexFoxScientistEntity>> {
    public DarkLatexFoxScientistRenderer(EntityRendererProvider.Context context) {
        super(context, new Modeldark_latex_fox_scientist<>(context.bakeLayer(Modeldark_latex_fox_scientist.LAYER_LOCATION)), 0.5f);
    }

    public @NotNull ResourceLocation getTextureLocation(@NotNull DarkLatexFoxScientistEntity entity) {
        return new ResourceLocation("turned:textures/entities/darklatexfoxscientist.png");
    }
}
