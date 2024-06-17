package net.mcreator.latexes.client.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.mcreator.latexes.LatexMod;
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
import org.jetbrains.annotations.NotNull;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/model/Modelhertx_model_fb_sit.class */
public class Modelhertx_model_fb_sit<T extends Entity> extends EntityModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(LatexMod.MODID, "modelhertx_model_fb_sit"), "main");
    public final ModelPart Head;
    public final ModelPart Body;
    public final ModelPart Tail;
    public final ModelPart LeftArm;
    public final ModelPart RightArm;
    public final ModelPart LeftLeg;
    public final ModelPart RightLeg;

    public Modelhertx_model_fb_sit(ModelPart root) {
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
        partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(15, 13).addBox(-3.0f, -1.675f, -5.075f, 6.0f, 1.0f, 7.0f, new CubeDeformation(0.0f)).texOffs(52, 41).addBox(-2.0f, -2.775f, -3.075f, 4.0f, 1.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(58, 47).addBox(-2.0f, -6.775f, 1.925f, 4.0f, 4.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(0, 7).addBox(-2.0f, -2.775f, 2.925f, 4.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(58, 3).addBox(-3.0f, -2.775f, 1.925f, 6.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(38, 0).addBox(-2.5f, -0.775f, -2.475f, 5.0f, 1.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(0, 17).addBox(2.0f, -6.775f, 1.925f, 1.0f, 4.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(5, 16).addBox(-3.0f, -6.775f, 1.925f, 1.0f, 4.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 27).addBox(-3.0f, -6.775f, -3.075f, 6.0f, 1.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(41, 57).addBox(2.0f, -5.775f, -4.075f, 1.0f, 3.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(49, 50).addBox(2.0f, -2.675f, -5.075f, 1.0f, 1.0f, 7.0f, new CubeDeformation(0.0f)).texOffs(0, 56).addBox(-3.0f, -5.775f, -4.075f, 1.0f, 3.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(53, 0).addBox(-3.0f, -4.775f, -5.075f, 6.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 46).addBox(-3.0f, -2.675f, -5.075f, 1.0f, 1.0f, 7.0f, new CubeDeformation(0.0f)).texOffs(58, 54).addBox(-2.0f, -5.775f, -5.075f, 4.0f, 1.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(0, 25).addBox(-2.0f, -6.775f, -4.075f, 4.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(10, 25).addBox(-2.0f, -2.675f, -5.075f, 4.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 4.125f, 1.5f)).addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(15, 15).addBox(-3.0f, -1.8601f, 6.7623f, 1.0f, 2.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(0, 0).addBox(-3.0f, -1.8601f, 8.7623f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(60, 27).addBox(-3.0f, -1.8601f, 2.7623f, 1.0f, 3.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(0, 13).addBox(2.0f, -1.8601f, 6.7623f, 1.0f, 2.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(0, 2).addBox(2.0f, -1.8601f, 8.7623f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 0).addBox(2.0f, -1.8601f, 2.7623f, 1.0f, 3.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, -3.725f, -0.075f, 0.2618f, 0.0f, 0.0f));
        partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(26, 8).addBox(-4.0f, 10.9265f, -1.6411f, 8.0f, 1.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(16, 0).addBox(-3.5f, 6.9265f, -1.6411f, 7.0f, 4.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(20, 21).addBox(-4.0f, -0.0735f, -1.6411f, 8.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(55, 58).addBox(-3.5f, -0.261f, -2.3911f, 7.0f, 5.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(15, 13).addBox(-1.0f, 5.739f, -1.9536f, 2.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(16, 8).addBox(-3.0f, 4.739f, -2.1411f, 6.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 4.125f, 1.5f, -0.1309f, 0.0f, 0.0f));
        PartDefinition Tail = partdefinition.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0f, 15.0f, 1.0f, 0.6545f, 0.0f, 0.0f));
        Tail.addOrReplaceChild("cube_r2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0f, -13.3689f, 23.8592f, -1.1781f, 0.0f, 0.0f)).addOrReplaceChild("cube_r2_r1", CubeListBuilder.create().texOffs(0, 13).addBox(-1.3f, -0.1297f, 36.5872f, 3.0f, 3.0f, 9.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 40.8187f, -20.2444f, 0.5236f, 0.0f, 0.0f));
        Tail.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-1.3f, 10.1852f, 7.174f, 3.0f, 3.0f, 10.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, -13.3689f, 2.8592f, -0.7854f, 0.0f, 0.0f));
        partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(42, 45).addBox(-1.8228f, -2.0604f, -2.25f, 3.0f, 8.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(41, 13).addBox(-2.8228f, 5.9396f, -2.25f, 4.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(16, 0).addBox(-2.8228f, 12.9396f, 0.75f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(6, 2).addBox(-2.8228f, 12.9396f, -2.25f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(6, 0).addBox(-0.8228f, 12.9396f, -2.25f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(4, 13).addBox(-2.8228f, 12.9396f, -0.75f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-5.0f, 6.25f, 2.0f, 0.0f, 0.0f, 0.0873f));
        partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(28, 45).addBox(-1.2397f, -2.0604f, -2.25f, 3.0f, 8.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(34, 34).addBox(-1.2397f, 5.9396f, -2.25f, 4.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(16, 2).addBox(-0.2397f, 12.9396f, -2.25f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 27).addBox(1.7603f, 12.9396f, -2.25f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(26, 10).addBox(1.7603f, 12.9396f, -2.25f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 29).addBox(1.7603f, 12.9396f, -2.25f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(5.0f, 6.25f, 2.0f, 0.0f, 0.0f, -0.0873f));
        PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(57, 13).addBox(-2.0319f, -1.042f, -2.0541f, 4.0f, 3.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-2.0f, 17.0f, 0.0f, -0.2164f, 0.0283f, 0.1278f));
        LeftLeg.addOrReplaceChild("LeftLeg_r1", CubeListBuilder.create().texOffs(50, 34).addBox(-3.2648f, -7.2043f, -7.6956f, 4.0f, 2.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(1.1705f, -6.3463f, 10.542f, 2.618f, 0.0f, 0.0f));
        LeftLeg.addOrReplaceChild("cube_r4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9545f, -4.7756f, -1.5151f, -0.3927f, 0.0f, 0.0f)).addOrReplaceChild("cube_r4_r1", CubeListBuilder.create().texOffs(27, 57).addBox(-3.2023f, -7.6768f, -3.4127f, 4.0f, 6.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(2.0625f, -1.9018f, 13.6106f, 2.2253f, 0.0f, 0.0f));
        LeftLeg.addOrReplaceChild("cube_r5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9545f, -4.7756f, -1.5151f, 1.5708f, 0.0f, 0.0f)).addOrReplaceChild("cube_r5_r1", CubeListBuilder.create().texOffs(0, 33).addBox(-3.1398f, -16.3407f, -14.2647f, 4.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(2.0f, 10.6954f, 7.2207f, 0.3927f, 0.0f, 0.0f));
        LeftLeg.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(44, 24).addBox(-1.1398f, 4.8772f, 1.6501f, 4.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-0.9545f, -4.7756f, -1.5151f, -0.3927f, 0.0f, 0.0f));
        PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(56, 20).addBox(-1.9681f, -1.042f, -2.0541f, 4.0f, 3.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(2.0f, 17.0f, 0.0f, -0.2164f, -0.0283f, -0.1278f));
        RightLeg.addOrReplaceChild("RightLeg_r1", CubeListBuilder.create().texOffs(50, 6).addBox(-0.7352f, -6.9278f, -7.4422f, 4.0f, 2.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-1.1705f, -5.9801f, 10.6232f, 2.618f, 0.0f, 0.0f));
        RightLeg.addOrReplaceChild("cube_r7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9545f, -4.7756f, -1.5151f, -0.3927f, 0.0f, 0.0f)).addOrReplaceChild("cube_r7_r1", CubeListBuilder.create().texOffs(13, 53).addBox(-0.7977f, -9.5183f, -3.0729f, 4.0f, 6.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-2.0625f, -2.7532f, 15.2784f, 2.2253f, 0.0f, 0.0f));
        RightLeg.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(18, 32).addBox(-2.8602f, -3.6961f, -11.6865f, 4.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.9545f, -4.7756f, -1.5151f, 1.9635f, 0.0f, 0.0f));
        RightLeg.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(12, 43).addBox(-2.8602f, 4.8772f, 1.6501f, 4.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.9545f, -4.7756f, -1.5151f, -0.3927f, 0.0f, 0.0f));
        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    public void renderToBuffer(@NotNull PoseStack poseStack, @NotNull VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        this.Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.Tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setupAnim(@NotNull T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.Head.yRot = netHeadYaw / 57.295776f;
        this.Head.xRot = headPitch / 57.295776f;
    }
}
