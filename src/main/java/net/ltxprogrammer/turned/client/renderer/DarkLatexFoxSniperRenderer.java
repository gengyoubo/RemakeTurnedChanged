package net.ltxprogrammer.turned.client.renderer;

import net.ltxprogrammer.turned.client.model.Modeldark_latex_fox_sniper;
import net.ltxprogrammer.turned.entity.DarkLatexFoxSniperEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/renderer/DarkLatexFoxSniperRenderer.class */
public class DarkLatexFoxSniperRenderer extends MobRenderer<DarkLatexFoxSniperEntity, Modeldark_latex_fox_sniper<DarkLatexFoxSniperEntity>> {
    public DarkLatexFoxSniperRenderer(EntityRendererProvider.Context context) {
        super(context, new Modeldark_latex_fox_sniper(context.bakeLayer(Modeldark_latex_fox_sniper.LAYER_LOCATION)), 0.5f);
    }

    public ResourceLocation getTextureLocation(DarkLatexFoxSniperEntity entity) {
        return new ResourceLocation("turned:textures/entities/darklatexfoxsniper.png");
    }
}
