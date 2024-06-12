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
import net.ltxprogrammer.turned.entity.DarkLatexMothEntity;
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

public class Modeldl_moth_model extends LatexHumanoidModel<DarkLatexMothEntity> implements LatexHumanoidModelInterface {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("turned", "modeldl_moth_model"), "main");
    public final ModelPart Head;
    public final ModelPart Body;
    public final ModelPart LeftArm;
    public final ModelPart RightArm;
    public final ModelPart LeftLeg;
    public final ModelPart RightLeg;
    public final LatexHumanoidModelController controller;

    public Modeldl_moth_model(ModelPart root) {
        super(root);
        this.Head = root.getChild("Head");
        this.Body = root.getChild("Body");
        this.LeftArm = root.getChild("LeftArm");
        this.RightArm = root.getChild("RightArm");
        this.LeftLeg = root.getChild("LeftLeg");
        this.RightLeg = root.getChild("RightLeg");
        this.controller = Builder.of(this, this.Head, this.Body, this.Body.getChild("Tail"), this.RightArm, this.LeftArm, this.RightLeg, this.LeftLeg).hipOffset(-1.0F).build();
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(22, 0).addBox(-4.5F, -2.25F, -2.7F, 9.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(27, 10).addBox(-3.0F, -6.0F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, 0.0F));
        Head.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(38, 42).addBox(-2.0F, -7.0F, -2.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(36, 29).addBox(-3.0F, -6.0F, -2.0F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(24, 29).addBox(-3.0F, -3.0F, -2.0F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.0F, -5.0F, -2.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(2, 2).addBox(-4.0F, -5.0F, -2.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 2).addBox(3.0F, -5.0F, -2.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.0F, -1.25F));
        Head.addOrReplaceChild("bone8", CubeListBuilder.create().texOffs(56, 47).addBox(-4.0F, -6.0F, 1.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(59, 59).addBox(2.0F, -6.0F, 1.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 5).addBox(2.0F, -7.0F, 1.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-4.0F, -7.0F, 1.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.25F, 2.0F, 0.3927F, 0.0F, 0.0F));
        PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(30, 30).addBox(-4.0F, 1.0F, -2.0F, 8.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(30, 22).addBox(-4.0F, 9.0F, -2.0F, 8.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(46, 0).addBox(-3.5F, 7.0F, -1.5F, 7.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 26).addBox(-4.5F, 2.0F, -3.0F, 9.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 16).addBox(-5.0F, -1.0F, -3.5F, 10.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, 0.0F));
        Body.addOrReplaceChild("BREAAAAAAAAAAAAAASTS", CubeListBuilder.create().texOffs(48, 6).addBox(-3.5F, -3.7073F, -3.7495F, 7.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.5F, 0.5F, 1.1781F, 0.0F, 0.0F));
        Body.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -1.8394F, 1.2472F, 6.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(65, 47).addBox(-2.5F, -1.3394F, 11.2472F, 5.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
        PartDefinition Wings = Body.addOrReplaceChild("Wings", CubeListBuilder.create(), PartPose.offset(0.0F, 3.0F, 1.5F));
        PartDefinition LeftWing = Wings.addOrReplaceChild("LeftWing", CubeListBuilder.create(), PartPose.offsetAndRotation(9.0F, -2.0F, 4.0F, 0.0F, -0.3927F, 0.0F));
        LeftWing.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(14, 35).addBox(-1.0F, -6.0F, -1.0F, 5.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(10, 54).addBox(-4.0F, -6.0F, -1.0F, 3.0F, 16.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.9635F));
        LeftWing.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(63, 14).addBox(-5.0F, -7.0F, -0.5F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 40).addBox(-3.0F, -8.0F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(66, 3).addBox(-9.0F, -6.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5708F));
        LeftWing.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(32, 57).addBox(-8.0F, -5.0F, -1.0F, 4.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(52, 66).addBox(-10.0F, -5.0F, -1.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 2.0F, 0.0F, 0.0F, 0.0F, -1.1781F));
        PartDefinition Rightwing = Wings.addOrReplaceChild("Rightwing", CubeListBuilder.create(), PartPose.offsetAndRotation(-9.0F, -2.0F, 4.0F, 0.0F, 0.3927F, 0.0F));
        Rightwing.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(0, 35).addBox(-4.0F, -6.0F, -1.0F, 5.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 54).addBox(1.0F, -6.0F, -1.0F, 3.0F, 16.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.9635F));
        Rightwing.addOrReplaceChild("bone6", CubeListBuilder.create().texOffs(62, 55).addBox(-1.0F, -7.0F, -0.5F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 30).addBox(0.0F, -8.0F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(63, 0).addBox(5.0F, -6.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5708F));
        Rightwing.addOrReplaceChild("bone7", CubeListBuilder.create().texOffs(20, 57).addBox(4.0F, -5.0F, -1.0F, 4.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 59).addBox(8.0F, -5.0F, -1.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 2.0F, 0.0F, 0.0F, 0.0F, 1.1781F));
        partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(42, 42).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, 1.0F, 0.0F));
        partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(28, 40).addBox(-1.0F, -2.0F, -2.0F, 3.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 1.0F, 0.0F));
        partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(54, 25).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(56, 36).addBox(-1.0F, 6.0F, -2.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 11.0F, 0.0F));
        partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(51, 14).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(52, 55).addBox(-2.0F, 6.0F, -2.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 11.0F, 0.0F));
        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        this.Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void prepareMobModel(DarkLatexMothEntity p_102861_, float p_102862_, float p_102863_, float p_102864_) {
        this.prepareMobModel(this.controller, p_102861_, p_102862_, p_102863_, p_102864_);
    }

    public void setupAnim(DarkLatexMothEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float HeadPitch) {
        this.controller.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, HeadPitch);
    }

    public ModelPart getArm(HumanoidArm humanoidArm) {
        ModelPart var10000;
        switch (humanoidArm) {
            case LEFT -> var10000 = this.LeftArm;
            case RIGHT -> var10000 = this.RightArm;
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
        return this.Head;
    }
}
