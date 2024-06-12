//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.ltxprogrammer.turned.client.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.ltxprogrammer.changed.client.renderer.model.LatexHumanoidModel;
import net.ltxprogrammer.changed.client.renderer.model.LatexHumanoidModelController;
import net.ltxprogrammer.changed.client.renderer.model.LatexHumanoidModelInterface;
import net.ltxprogrammer.changed.client.renderer.model.LatexHumanoidModelController.Builder;
import net.ltxprogrammer.turned.entity.DarkLatexSkeletonEntity;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.HumanoidArm;

public class Modeldark_latex_skeleton_model extends LatexHumanoidModel<DarkLatexSkeletonEntity> implements LatexHumanoidModelInterface {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("turned", "modeldark_latex_skeleton_model"), "main");
    public final ModelPart head;
    public final ModelPart body;
    public final ModelPart rightArm;
    public final ModelPart leftArm;
    public final ModelPart leftLeg;
    public final ModelPart rightLeg;
    public final LatexHumanoidModelController controller;

    public Modeldark_latex_skeleton_model(ModelPart root) {
        super(root);
        this.head = root.getChild("head");
        this.body = root.getChild("body");
        this.rightArm = root.getChild("rightArm");
        this.leftArm = root.getChild("leftArm");
        this.leftLeg = root.getChild("leftLeg");
        this.rightLeg = root.getChild("rightLeg");
        this.controller = Builder.of(this, this.head, this.body, this.body.getChild("Tail"), this.rightArm, this.leftArm, this.rightLeg, this.leftLeg).hipOffset(-1.0F).build();
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -7.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(20, 16).addBox(4.0F, -2.0F, -4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 16).addBox(-5.0F, -2.0F, -4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 2).addBox(-6.0F, -1.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 0).addBox(5.0F, -1.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.0F, 0.0F));
        head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(0, 0).addBox(0.5F, -1.75F, -1.625F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(20, 64).addBox(-0.5F, -0.75F, -1.625F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, -8.0F, 0.5F, 0.0F, 1.5708F, 0.3927F));
        head.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(64, 23).addBox(-0.5F, -0.75F, -1.625F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(64, 0).addBox(-1.5F, -1.75F, -1.625F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5F, -8.0F, 0.5F, 0.0F, -1.5708F, -0.3927F));
        head.addOrReplaceChild("mask", CubeListBuilder.create().texOffs(23, 16).addBox(-1.0F, -8.0F, -5.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(24, 7).addBox(-4.0F, -3.0F, -5.0F, 8.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(28, 23).addBox(-3.0F, -2.0F, -5.0F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(28, 24).addBox(-2.5F, -1.0F, -5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(22, 28).addBox(1.5F, -1.0F, -5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(24, 6).addBox(-4.0F, -6.0F, -5.0F, 8.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 7).addBox(-2.0F, -7.0F, -5.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(22, 31).addBox(-0.5F, -4.0F, -5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(20, 19).addBox(2.375F, -4.0F, -5.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 19).addBox(-4.375F, -4.0F, -5.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(20, 31).addBox(-3.375F, -5.0F, -5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(30, 24).addBox(2.375F, -5.0F, -5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(16, 28).addBox(-1.5F, -5.0F, -5.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.0F, 0.75F));
        PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 16).addBox(-4.0F, 1.0F, -2.0F, 8.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(55, 59).addBox(-4.125F, 4.0F, -2.125F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(60, 41).addBox(-3.375F, 5.5F, -2.125F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(60, 18).addBox(1.125F, 5.75F, -2.125F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(30, 55).addBox(2.125F, 7.375F, -2.125F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(60, 46).addBox(-3.375F, 7.375F, -2.125F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(52, 27).addBox(-4.125F, 2.0F, -2.125F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(56, 13).addBox(1.125F, 4.0F, -2.125F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(42, 50).addBox(0.125F, 2.0F, -2.125F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(64, 7).addBox(-3.25F, 2.0F, 0.125F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(25, 64).addBox(-3.25F, 4.0F, 0.125F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 43).addBox(0.75F, 2.0F, 0.125F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 57).addBox(0.75F, 4.0F, 0.125F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 39).addBox(-2.25F, 5.75F, 0.125F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 0).addBox(0.75F, 5.75F, 0.125F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(32, 8).addBox(0.75F, 7.375F, 0.125F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 33).addBox(-2.25F, 7.375F, 0.125F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 25).addBox(-3.0F, 6.0F, -2.0F, 6.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(24, 0).addBox(-4.0F, 10.0F, -2.0F, 8.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(35, 62).addBox(-0.25F, 1.0F, 1.125F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.0F, 0.0F));
        PartDefinition Tail = body.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offset(0.0F, 12.0F, 0.0F));
        Tail.addOrReplaceChild("Tail_r1", CubeListBuilder.create().texOffs(0, 63).addBox(-0.25F, -16.4875F, 12.7823F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 56).addBox(-0.25F, -16.6125F, 6.7823F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(56, 6).addBox(-0.25F, -16.7375F, 0.7823F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(51, 59).addBox(-0.75F, -16.2375F, 14.7823F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 17).addBox(-0.75F, -16.3625F, 6.7823F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(14, 49).addBox(-0.75F, -16.6125F, 1.7823F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 13.0F, -8.0F, -0.5672F, 0.0F, 0.0F));
        PartDefinition rightArm = partdefinition.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offset(5.0F, 0.0F, 0.0F));
        rightArm.addOrReplaceChild("RightArm_r1", CubeListBuilder.create().texOffs(23, 55).addBox(1.625F, -2.625F, -2.5F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(32, 35).addBox(-1.5F, -2.5F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.5F, 0.0F, 0.0F, 0.0F, -0.3927F));
        rightArm.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(20, 28).addBox(-3.2F, -7.081F, -1.666F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(35, 55).addBox(-0.95F, -2.081F, -2.041F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(60, 51).addBox(-0.95F, -3.331F, -1.166F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(38, 8).addBox(-0.95F, -4.456F, -0.166F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 59).addBox(-1.075F, -0.081F, -1.666F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 28).addBox(-0.075F, 1.919F, -1.666F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 41).addBox(-1.075F, -0.081F, -0.166F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 30).addBox(-0.075F, 1.919F, -0.166F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 59).addBox(-1.075F, -0.081F, 1.334F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 33).addBox(-0.075F, 1.919F, 1.334F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.7F, 10.9375F, -2.8625F, -0.3927F, 0.0F, 0.0F));
        PartDefinition leftArm = partdefinition.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offset(-5.0F, 0.0F, 0.0F));
        leftArm.addOrReplaceChild("RightArm_r2", CubeListBuilder.create().texOffs(53, 50).addBox(-2.625F, -2.625F, -2.5F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 33).addBox(-2.5F, -2.5F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 2.5F, 0.0F, 0.0F, 0.0F, 0.3927F));
        leftArm.addOrReplaceChild("bone8", CubeListBuilder.create().texOffs(28, 12).addBox(-0.8F, -7.081F, -1.666F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(55, 34).addBox(-1.05F, -2.081F, -2.041F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(52, 6).addBox(-1.05F, -3.331F, -1.166F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(36, 33).addBox(-1.05F, -4.456F, -0.166F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 56).addBox(-0.925F, -0.081F, -1.666F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 29).addBox(-0.925F, 1.919F, -1.666F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 56).addBox(-0.925F, -0.081F, -0.166F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 27).addBox(-0.925F, 1.919F, -0.166F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 55).addBox(-0.925F, -0.081F, 1.334F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 25).addBox(-0.925F, 1.919F, 1.334F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.7F, 10.9375F, -2.8625F, -0.3927F, 0.0F, 0.0F));
        PartDefinition leftLeg = partdefinition.addOrReplaceChild("rightLeg", CubeListBuilder.create().texOffs(48, 21).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 0).addBox(-2.0F, 11.213F, -2.1649F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 2).addBox(-1.875F, 12.213F, -2.2899F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 1).addBox(-0.5F, 12.213F, -2.2899F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(0.875F, 12.213F, -2.2899F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 11.0F, 0.0F));
        leftLeg.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(44, 41).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(45, 58).addBox(-2.25F, -0.125F, -2.5F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
        leftLeg.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(12, 39).addBox(-6.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 4.0F, -1.0F, 0.6545F, 0.0F, 0.0F));
        leftLeg.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(0, 46).addBox(-2.0F, -0.1371F, 3.7689F, 4.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.0F, -1.0F, -0.48F, 0.0F, 0.0F));
        PartDefinition rightLeg = partdefinition.addOrReplaceChild("leftLeg", CubeListBuilder.create().texOffs(44, 33).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(44, 15).addBox(-2.0F, 11.213F, -2.1649F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(5, 2).addBox(0.875F, 12.213F, -2.2899F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(5, 1).addBox(-1.875F, 12.213F, -2.2899F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(5, 0).addBox(-0.5F, 12.213F, -2.2899F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 11.0F, 0.0F));
        rightLeg.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(40, 6).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(10, 59).addBox(1.25F, -0.125F, -2.5F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
        rightLeg.addOrReplaceChild("bone6", CubeListBuilder.create().texOffs(36, 23).addBox(2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 4.0F, -1.0F, 0.6545F, 0.0F, 0.0F));
        rightLeg.addOrReplaceChild("bone7", CubeListBuilder.create().texOffs(28, 45).addBox(-2.0F, -0.1371F, 3.7689F, 4.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.0F, -1.0F, -0.48F, 0.0F, 0.0F));
        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        this.head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.rightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.leftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.leftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.rightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void prepareMobModel(DarkLatexSkeletonEntity p_102861_, float p_102862_, float p_102863_, float p_102864_) {
        this.prepareMobModel(this.controller, p_102861_, p_102862_, p_102863_, p_102864_);
    }

    public void setupAnim(DarkLatexSkeletonEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float HeadPitch) {
        this.controller.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, HeadPitch);
    }

    public ModelPart getArm(HumanoidArm humanoidArm) {
        ModelPart var10000;
        switch (humanoidArm) {
            case LEFT -> var10000 = this.leftArm;
            case RIGHT -> var10000 = this.rightArm;
            default -> throw new IncompatibleClassChangeError();
        }

        return var10000;
    }

    public void setupHand() {
        this.controller.setupHand();
    }

    public LatexHumanoidModelController getController() {
        return this.controller;
    }

    public void translateToHand(HumanoidArm p_102108_, PoseStack p_102109_) {
        this.getArm(p_102108_).translateAndRotate(p_102109_);
    }

    public ModelPart getHead() {
        return this.head;
    }
}
