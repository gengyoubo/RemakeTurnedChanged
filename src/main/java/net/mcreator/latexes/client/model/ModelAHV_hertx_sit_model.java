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

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/model/ModelAHV_hertx_sit_model.class */
public class ModelAHV_hertx_sit_model<T extends Entity> extends EntityModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(LatexMod.MODID, "model_ahv_hertx_sit_model"), "main");
    public final ModelPart Head;
    public final ModelPart Body;
    public final ModelPart Tail;
    public final ModelPart LeftArm;
    public final ModelPart RightArm;
    public final ModelPart LeftLeg;
    public final ModelPart RightLeg;

    public ModelAHV_hertx_sit_model(ModelPart root) {
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
        partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(21, 8).addBox(-3.0f, -2.3f, -5.2f, 6.0f, 1.0f, 7.0f, new CubeDeformation(0.0f)).texOffs(56, 43).addBox(-2.0f, -3.4f, -3.2f, 4.0f, 1.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(16, 66).addBox(-2.0f, -7.4f, 1.8f, 4.0f, 4.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(38, 0).addBox(-2.0f, -3.4f, 2.8f, 4.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(30, 59).addBox(-3.0f, -3.4f, 1.8f, 6.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(24, 16).addBox(-3.0f, -1.4f, -3.1f, 6.0f, 1.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(3, 4).addBox(2.0f, -7.4f, 1.8f, 1.0f, 4.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 0).addBox(-3.0f, -7.4f, 1.8f, 1.0f, 4.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(19, 0).addBox(-3.0f, -7.4f, -5.2f, 6.0f, 1.0f, 7.0f, new CubeDeformation(0.0f)).texOffs(50, 22).addBox(2.0f, -6.4f, -5.2f, 1.0f, 3.0f, 7.0f, new CubeDeformation(0.0f)).texOffs(55, 5).addBox(2.0f, -3.3f, -5.2f, 1.0f, 1.0f, 7.0f, new CubeDeformation(0.0f)).texOffs(41, 29).addBox(-3.0f, -6.4f, -5.2f, 1.0f, 3.0f, 7.0f, new CubeDeformation(0.0f)).texOffs(53, 53).addBox(-3.0f, -3.3f, -5.2f, 1.0f, 1.0f, 7.0f, new CubeDeformation(0.0f)).texOffs(32, 38).addBox(-2.0f, -6.4f, -5.2f, 4.0f, 3.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(20, 16).addBox(-2.0f, -3.3f, -5.2f, 4.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 8.0f, 0.0f)).addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 14).addBox(-3.0f, 1.2791f, 6.9211f, 1.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(69, 39).addBox(-3.0f, 1.2791f, 1.9211f, 1.0f, 3.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(4, 0).addBox(2.0f, 1.2791f, 6.9211f, 1.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(46, 65).addBox(2.0f, 1.2791f, 1.9211f, 1.0f, 3.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, -7.6f, -0.2f, 0.2618f, 0.0f, 0.0f));
        partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 14).addBox(-4.0f, -0.8f, -2.0f, 8.0f, 12.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(0, 58).addBox(-4.0f, -0.8f, -3.0f, 8.0f, 6.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(43, 23).addBox(-3.0f, -0.8f, -3.3f, 6.0f, 5.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(66, 28).addBox(-3.0f, 5.2f, -2.6f, 6.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 8.0f, 0.0f));
        PartDefinition Tail = partdefinition.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0f, 19.0f, 1.0f, 0.0f, -0.5672f, 0.0f));
        Tail.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(17, 36).addBox(-2.3f, 15.7384f, 3.3388f, 4.0f, 4.0f, 7.0f, new CubeDeformation(0.0f)), PartPose.offset(0.5f, -18.0f, -4.0f));
        Tail.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-2.8f, 16.2678f, -6.6465f, 5.0f, 5.0f, 9.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.5f, -18.0f, -4.0f, 0.7854f, 0.0f, 0.0f));
        PartDefinition cube_r10 = Tail.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(24, 24).addBox(-3.8f, 9.7028f, -13.3744f, 7.0f, 7.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(5.5f, -18.0f, -2.0f, 1.5708f, -0.3927f, 0.0f));
        cube_r10.addOrReplaceChild("cube_r10_r1", CubeListBuilder.create().texOffs(57, 39).addBox(-4.3222f, -2.8968f, -7.1705f, 7.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 30).addBox(-4.3222f, -4.8968f, -12.1705f, 7.0f, 4.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-1.6967f, 14.025f, 3.7962f, 0.0f, 0.0f, 1.9635f));
        cube_r10.addOrReplaceChild("uppertailjaw", CubeListBuilder.create(), PartPose.offset(0.0f, 24.0f, 0.0f)).addOrReplaceChild("uppertailjaw_r1", CubeListBuilder.create().texOffs(39, 39).addBox(-4.3222f, -0.8968f, -10.1705f, 7.0f, 5.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-1.6967f, -9.975f, 3.7962f, 0.0f, 0.0f, 1.9635f));
        cube_r10.addOrReplaceChild("lowertailjaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0f, 24.0f, 0.0f, -0.1309f, 0.0f, 0.0f)).addOrReplaceChild("lowertailjaw_r1", CubeListBuilder.create().texOffs(57, 32).addBox(-4.3222f, 0.4384f, -12.2007f, 7.0f, 5.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-1.6967f, -10.3852f, 2.4617f, -0.1812f, -0.1209f, 1.9665f));
        partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(45, 0).addBox(-2.8393f, -1.9591f, -1.2349f, 4.0f, 8.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(59, 22).addBox(-2.8393f, 9.0409f, -1.2349f, 4.0f, 2.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(40, 58).addBox(-2.8393f, 6.0409f, -1.2349f, 4.0f, 3.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(22, 1).addBox(-2.8393f, 12.0409f, -1.2349f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(19, 4).addBox(-0.8393f, 12.0409f, -1.2349f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(62, 55).addBox(-2.8393f, 11.0409f, -1.2349f, 4.0f, 1.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(19, 2).addBox(-2.8393f, 12.0409f, 0.2651f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(19, 0).addBox(-2.8393f, 12.0409f, 1.7651f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-5.0f, 9.0f, 0.0f, -0.3914f, 0.0334f, 0.0807f));
        partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(0, 39).addBox(-1.1607f, -1.9591f, -1.2349f, 4.0f, 8.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(66, 66).addBox(-1.1607f, 11.0409f, -1.2349f, 4.0f, 1.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(18, 59).addBox(-1.1607f, 6.0409f, -1.2349f, 4.0f, 3.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(62, 49).addBox(-1.1607f, 9.0409f, -1.2349f, 4.0f, 2.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(24, 18).addBox(-0.1607f, 12.0409f, -1.2349f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(24, 24).addBox(1.8393f, 12.0409f, -1.2349f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(22, 5).addBox(1.8393f, 12.0409f, 0.2651f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(22, 3).addBox(1.8393f, 12.0409f, 1.7651f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(5.0f, 9.0f, 0.0f, -0.3914f, -0.0334f, -0.0807f));
        PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(30, 65).addBox(-2.2578f, -2.0692f, -1.0721f, 4.0f, 2.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(0, 65).addBox(-2.2578f, 9.7308f, -1.4823f, 4.0f, 2.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-2.0f, 20.0f, 0.0f, -1.8762f, 0.0873f, -0.2618f));
        LeftLeg.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(59, 13).addBox(-4.3205f, -1.1325f, 9.79f, 4.0f, 6.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(2.0627f, 2.1513f, -7.4241f, -0.3927f, 0.0f, 0.0f));
        LeftLeg.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(28, 48).addBox(-4.3205f, 4.1942f, 1.8173f, 4.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(2.0627f, 2.1513f, -7.4241f, 0.7854f, 0.0f, 0.0f));
        LeftLeg.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(44, 48).addBox(-4.3205f, -6.0325f, 4.59f, 4.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(2.0627f, 2.1513f, -7.4241f, -0.3927f, 0.0f, 0.0f));
        PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(64, 6).addBox(-1.7422f, -2.0692f, -1.0721f, 4.0f, 2.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(64, 0).addBox(-1.7422f, 9.7308f, -1.4823f, 4.0f, 2.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(2.0f, 20.0f, 0.0f, -1.8762f, -0.0873f, 0.2618f));
        RightLeg.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(56, 61).addBox(0.3205f, -1.1325f, 9.79f, 4.0f, 6.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-2.0627f, 2.1513f, -7.4241f, -0.3927f, 0.0f, 0.0f));
        RightLeg.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(12, 47).addBox(0.3205f, 4.1942f, 1.8173f, 4.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-2.0627f, 2.1513f, -7.4241f, 0.7854f, 0.0f, 0.0f));
        RightLeg.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(43, 12).addBox(0.3205f, -6.0325f, 4.59f, 4.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-2.0627f, 2.1513f, -7.4241f, -0.3927f, 0.0f, 0.0f));
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
