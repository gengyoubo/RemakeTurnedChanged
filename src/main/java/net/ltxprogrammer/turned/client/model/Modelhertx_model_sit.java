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

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/model/Modelhertx_model_sit.class */
public class Modelhertx_model_sit<T extends Entity> extends EntityModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(LatexMod.MODID, "modelhertx_model_sit"), "main");
    public final ModelPart Head;
    public final ModelPart Body;
    public final ModelPart Tail;
    public final ModelPart LeftArm;
    public final ModelPart RightArm;
    public final ModelPart LeftLeg;
    public final ModelPart RightLeg;

    public Modelhertx_model_sit(ModelPart root) {
        this.Head = root.getChild("Head");
        this.Body = root.getChild("Body");
        this.Tail = root.getChild("Tail");
        this.LeftArm = root.getChild("LeftArm");
        this.RightArm = root.getChild("RightArm");
        this.LeftLeg = root.getChild("LeftLeg");
        this.RightLeg = root.getChild("RightLeg");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(24, 24).addBox(-3.0f, 5.3f, -5.0f, 6.0f, 1.0f, 7.0f, new CubeDeformation(0.0f)).texOffs(18, 54).addBox(-2.0f, 4.2f, -3.0f, 4.0f, 1.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(0, 60).addBox(-2.0f, 0.2f, 2.0f, 4.0f, 4.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(20, 16).addBox(-2.0f, 4.2f, 3.0f, 4.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(19, 8).addBox(-3.0f, 4.2f, 2.0f, 6.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(24, 16).addBox(-3.0f, 6.2f, -2.9f, 6.0f, 1.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(7, 0).addBox(2.0f, 0.2f, 2.0f, 1.0f, 4.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 0).addBox(-3.0f, 0.2f, 2.0f, 1.0f, 4.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(19, 0).addBox(-3.0f, 0.2f, -5.0f, 6.0f, 1.0f, 7.0f, new CubeDeformation(0.0f)).texOffs(50, 8).addBox(2.0f, 1.2f, -5.0f, 1.0f, 3.0f, 7.0f, new CubeDeformation(0.0f)).texOffs(32, 8).addBox(2.0f, 4.3f, -5.0f, 1.0f, 1.0f, 7.0f, new CubeDeformation(0.0f)).texOffs(48, 29).addBox(-3.0f, 1.2f, -5.0f, 1.0f, 3.0f, 7.0f, new CubeDeformation(0.0f)).texOffs(57, 57).addBox(-3.0f, 4.3f, -5.0f, 1.0f, 1.0f, 7.0f, new CubeDeformation(0.0f)).texOffs(0, 8).addBox(-2.0f, 1.2f, -5.0f, 4.0f, 3.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(13, 32).addBox(-2.0f, 4.3f, -5.0f, 4.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 0.4f, -0.2f)).addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(19, 0).addBox(-3.0f, 1.2791f, 6.9211f, 1.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 0).addBox(-3.0f, 1.2791f, 1.9211f, 1.0f, 3.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(0, 16).addBox(2.0f, 1.2791f, 6.9211f, 1.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(14, 60).addBox(2.0f, 1.2791f, 1.9211f, 1.0f, 3.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.2618f, 0.0f, 0.0f));
        partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 16).addBox(-4.0f, 7.2f, -2.0f, 8.0f, 12.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(52, 39).addBox(-4.0f, 7.2f, -3.0f, 8.0f, 6.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(19, 11).addBox(-3.0f, 13.2f, -3.0f, 6.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition Tail = partdefinition.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0f, 11.0f, 0.0f, 0.6109f, 0.0f, 0.0f));
        Tail.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 32).addBox(-1.3f, 20.0893f, 13.6912f, 3.0f, 3.0f, 7.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, -10.0f, 0.0f, -0.3927f, 0.0f, 0.0f));
        Tail.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-1.3f, 13.0633f, 8.5628f, 3.0f, 3.0f, 13.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, -10.0f, 0.0f, -0.7854f, 0.0f, 0.0f));
        partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(36, 36).addBox(-2.1472f, -1.4133f, -2.0884f, 4.0f, 8.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(16, 44).addBox(-2.1472f, 6.5867f, -2.0884f, 4.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(24, 26).addBox(-2.1472f, 12.5867f, 0.9116f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(24, 19).addBox(-2.1472f, 12.5867f, -2.0884f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(22, 4).addBox(-0.1472f, 12.5867f, -2.0884f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(24, 24).addBox(-2.1472f, 12.5867f, -0.5884f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-5.0f, 9.0f, 0.0f, 0.2618f, 0.0f, 0.2618f));
        partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(20, 32).addBox(-1.6769f, -1.2771f, -2.125f, 4.0f, 8.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(44, 19).addBox(-1.6769f, 6.7229f, -2.125f, 4.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(22, 2).addBox(-0.6769f, 12.7229f, -2.125f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(19, 3).addBox(1.3231f, 12.7229f, 0.875f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(9, 11).addBox(1.3231f, 12.7229f, -0.625f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(19, 5).addBox(1.3231f, 12.7229f, -2.125f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(5.0f, 9.0f, 0.0f, 0.2618f, 0.0f, -0.2618f));
        PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(59, 7).addBox(-1.9299f, -2.4753f, -0.66f, 4.0f, 2.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(0, 53).addBox(-1.9299f, 9.3247f, -1.5702f, 4.0f, 2.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-2.0f, 20.0f, 0.0f, -1.7802f, 0.2094f, 0.0524f));
        LeftLeg.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(57, 26).addBox(-1.5393f, -0.8714f, 10.3515f, 4.0f, 6.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-0.3906f, 1.2891f, -7.4309f, -0.3927f, 0.0f, 0.0f));
        LeftLeg.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(41, 4).addBox(-1.5393f, 4.8129f, 1.791f, 4.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-0.3906f, 1.2891f, -7.4309f, 0.7854f, 0.0f, 0.0f));
        LeftLeg.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(32, 48).addBox(-1.5393f, -5.7714f, 5.1515f, 4.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-0.3906f, 1.2891f, -7.4309f, -0.3927f, 0.0f, 0.0f));
        PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(47, 58).addBox(-1.9492f, -1.9973f, -1.021f, 4.0f, 2.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(53, 0).addBox(-1.9492f, 9.8027f, -1.9312f, 4.0f, 2.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(2.0f, 20.0f, 0.0f, -1.7802f, -0.2094f, 0.0524f));
        RightLeg.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(33, 58).addBox(-1.5393f, -0.71f, 10.4624f, 4.0f, 6.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-0.4099f, 1.5755f, -7.8326f, -0.3927f, 0.0f, 0.0f));
        RightLeg.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 42).addBox(-1.5393f, 4.9772f, 1.6843f, 4.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-0.4099f, 1.5755f, -7.8326f, 0.7854f, 0.0f, 0.0f));
        RightLeg.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(48, 48).addBox(-1.5393f, -5.61f, 5.2624f, 4.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-0.4099f, 1.5755f, -7.8326f, -0.3927f, 0.0f, 0.0f));
        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        this.Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.Tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.Head.yRot = netHeadYaw / 57.295776f;
        this.Head.xRot = headPitch / 57.295776f;
    }
}
