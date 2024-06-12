package net.ltxprogrammer.turned.client.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.ltxprogrammer.turned.LatexMod;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/model/Modeldrop_pod.class */
public class Modeldrop_pod<T extends Entity> extends EntityModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(LatexMod.MODID, "modeldrop_pod"), "main");
    public final ModelPart Drop_pod;

    public Modeldrop_pod(ModelPart root) {
        this.Drop_pod = root.getChild("Drop_pod");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition Drop_pod = meshdefinition.getRoot().addOrReplaceChild("Drop_pod", CubeListBuilder.create().texOffs(44, 44).addBox(-10.0f, -7.0f, -10.0f, 20.0f, 5.0f, 20.0f, new CubeDeformation(0.0f)).texOffs(32, 46).addBox(-3.0f, -48.0f, -3.0f, 6.0f, 11.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(72, 0).addBox(-1.0f, -65.0f, -1.0f, 2.0f, 17.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(0, 0).addBox(-8.0f, -37.0f, -8.0f, 16.0f, 30.0f, 16.0f, new CubeDeformation(0.0f)).texOffs(114, 57).addBox(6.0f, -38.0f, -6.0f, 3.0f, 31.0f, 12.0f, new CubeDeformation(0.0f)).texOffs(126, 126).addBox(-6.0f, -38.0f, -9.0f, 12.0f, 31.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(96, 96).addBox(-9.0f, -38.0f, -6.0f, 3.0f, 31.0f, 12.0f, new CubeDeformation(0.0f)).texOffs(29, 139).addBox(-6.0f, -38.0f, 6.0f, 12.0f, 31.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(64, 0).addBox(-10.0f, -2.0f, -10.0f, 20.0f, 2.0f, 20.0f, new CubeDeformation(0.0f)).texOffs(64, 22).addBox(-6.0f, 0.0f, -6.0f, 12.0f, 2.0f, 12.0f, new CubeDeformation(0.0f)).texOffs(48, 0).addBox(-3.0f, 2.0f, -3.0f, 6.0f, 2.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(0, 0).addBox(-1.0f, 4.0f, -1.0f, 2.0f, 5.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(104, 45).addBox(-10.0f, -2.0f, 10.0f, 20.0f, 3.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(104, 22).addBox(-12.0f, -2.0f, -10.0f, 2.0f, 3.0f, 20.0f, new CubeDeformation(0.0f)).texOffs(64, 36).addBox(-10.0f, -2.0f, -12.0f, 20.0f, 3.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(32, 116).addBox(10.0f, -2.0f, -10.0f, 2.0f, 3.0f, 20.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 24.0f, 0.0f));
        Drop_pod.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(64, 69).addBox(-7.0f, -45.4809f, -13.89f, 14.0f, 45.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, -0.0873f, 0.0f, 0.0f));
        Drop_pod.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(32, 69).addBox(-7.0f, -45.4809f, -13.89f, 14.0f, 45.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(1.0f, 0.0f, 0.0f, -0.0873f, 1.5708f, 0.0f));
        Drop_pod.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(0, 93).addBox(-7.0f, -45.4809f, 9.89f, 14.0f, 45.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0873f, 0.0f, 0.0f));
        Drop_pod.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(0, 46).addBox(-6.0f, -45.3937f, 10.8862f, 14.0f, 45.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 0.0f, 1.0f, 0.0f, 1.5708f, -0.0873f));
        return LayerDefinition.create(meshdefinition, 256, 256);
    }

    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        this.Drop_pod.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }
}
