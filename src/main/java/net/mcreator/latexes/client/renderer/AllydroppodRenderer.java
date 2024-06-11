package net.mcreator.latexes.client.renderer;

import net.mcreator.latexes.client.model.ModelScientific_Drop_Pod;
import net.mcreator.latexes.entity.AllydroppodEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/AllydroppodRenderer.class */
public class AllydroppodRenderer extends MobRenderer<AllydroppodEntity, ModelScientific_Drop_Pod<AllydroppodEntity>> {

    /* renamed from: net.mcreator.latexes.client.renderer.AllydroppodRenderer$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/renderer/AllydroppodRenderer$1.class */
    class AnonymousClass1 extends EyesLayer<AllydroppodEntity, ModelScientific_Drop_Pod<AllydroppodEntity>> {
        AnonymousClass1(RenderLayerParent renderLayerParent) {
            super(renderLayerParent);
        }

        public RenderType renderType() {
            return RenderType.eyes(new ResourceLocation("latex:textures/entities/scientific_drop_pod_glow.png"));
        }
    }

    public AllydroppodRenderer(EntityRendererProvider.Context context) {
        super(context, new ModelScientific_Drop_Pod(context.bakeLayer(ModelScientific_Drop_Pod.LAYER_LOCATION)), 1.2f);
        addLayer(new AnonymousClass1(this));
    }

    public ResourceLocation getTextureLocation(AllydroppodEntity entity) {
        return new ResourceLocation("latex:textures/entities/scientific_drop_pod.png");
    }
}
