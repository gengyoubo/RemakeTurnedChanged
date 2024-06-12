//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.ltxprogrammer.turned.client.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.ltxprogrammer.changed.client.renderer.model.LatexHumanoidModel;
import net.ltxprogrammer.changed.client.renderer.model.LatexHumanoidModelInterface;
import net.ltxprogrammer.turned.entity.DlsharkEntity;
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

public class Modeldark_latex_shark extends LatexHumanoidModel<DlsharkEntity> implements LatexHumanoidModelInterface {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("turned", "modeldark_latex_shark"), "main");
    public final ModelPart Head;
    public final ModelPart Torso;
    public final ModelPart LeftArm;
    public final ModelPart RightArm;
    public final ModelPart LeftLeg;
    public final ModelPart RightLeg;
    private final LatexHumanoidModelController controller;

    public Modeldark_latex_shark(ModelPart root) {
        super(root);
        this.Head = root.getChild("Head");
        this.Torso = root.getChild("Torso");
        this.LeftArm = root.getChild("LeftArm");
        this.RightArm = root.getChild("RightArm");
        this.LeftLeg = root.getChild("LeftLeg");
        this.RightLeg = root.getChild("RightLeg");
        this.controller = Builder.of(this, this.Head, this.Torso, this.Torso.getChild("Tail"), this.RightArm, this.LeftArm, this.RightLeg, this.LeftLeg).hipOffset(0.0F).tailAidsInSwim().build();
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 16).addBox(-4.1F, -33.9F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
        Head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(16, 49).addBox(-4.8F, -5.4F, 8.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 47).addBox(2.8F, -5.4F, 8.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 47).addBox(-4.8F, -5.4F, 2.0F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(50, 45).addBox(2.8F, -5.4F, 2.0F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -26.0F, 0.0F, 0.3927F, 0.0F, 0.0F));
        Head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -7.65F, 2.25F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(36, 35).addBox(0.0F, -5.65F, 9.25F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 51).addBox(0.0F, -6.65F, 3.25F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -26.0F, -2.5F, 0.3927F, 0.0F, 0.0F));
        Head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 22).addBox(0.0F, -5.9F, 8.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -23.754F, 0.1726F, 0.3927F, 0.0F, 0.0F));
        Head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(4, 22).addBox(-5.1F, -2.1F, 2.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 54).addBox(-5.1F, -2.1F, -1.9F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -26.0F, 0.0F, 0.0F, -0.3927F, 0.0F));
        Head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(24, 22).addBox(4.1F, -2.1F, 2.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 17).addBox(3.1F, -2.1F, -1.9F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -26.0F, 0.0F, 0.0F, 0.3927F, 0.0F));
        Head.addOrReplaceChild("mask", CubeListBuilder.create().texOffs(21, 12).addBox(-5.0F, -4.0F, -4.1F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 11).addBox(-3.0F, -3.0F, -4.1F, 6.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(10, 6).addBox(-2.0F, -1.0F, -4.1F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(10, 7).addBox(1.0F, -1.0F, -4.1F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(29, 12).addBox(3.0F, -4.0F, -4.1F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 7).addBox(3.0F, -5.0F, -4.1F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(21, 9).addBox(-2.0F, -5.0F, -4.1F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(21, 8).addBox(-2.0F, -7.0F, -4.1F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(21, 11).addBox(-3.0F, -6.0F, -4.1F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(25, 12).addBox(-1.0F, -8.0F, -4.1F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(3, 0).addBox(-0.5F, -9.0F, -4.1F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(27, 3).addBox(-1.0F, -4.0F, -4.1F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 6).addBox(-4.0F, -5.0F, -4.1F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -26.0F, 0.0F));
        PartDefinition Torso = partdefinition.addOrReplaceChild("Torso", CubeListBuilder.create().texOffs(0, 32).addBox(-4.0F, -25.0F, -2.0F, 8.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 25.0F, 0.0F));
        Torso.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 56).addBox(0.0F, -0.5F, 1.875F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(21, 0).addBox(0.0F, 3.5F, 5.875F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(0.0F, 1.5F, 4.875F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 16).addBox(0.0F, 0.5F, 2.875F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -25.0F, 0.0F, -0.1309F, 0.0F, 0.0F));
        PartDefinition Tail = Torso.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offset(0.0F, -15.0F, 0.0F));
        Tail.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(53, 0).addBox(-1.5375F, -0.5405F, 10.9885F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(21, 0).addBox(-2.5375F, -0.5405F, 0.9885F, 5.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.3374F, 13.8717F, -0.0197F, 0.5618F, -1.4878F));
        Tail.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(4, 16).addBox(-1.4625F, -0.5405F, 7.9885F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 11).addBox(-1.4625F, -0.5405F, -2.0115F, 3.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.3374F, 13.8717F, -0.0197F, -0.5618F, -1.6538F));
        Tail.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(24, 24).addBox(-2.5F, 7.25F, 3.75F, 6.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -3.4937F, 7.4678F, -0.1745F, 0.0F, 0.0F));
        Tail.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(21, 0).addBox(0.0F, 1.25F, 10.75F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -10.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
        Tail.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, 7.25F, 3.75F, 4.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -10.0F, 0.0F, -0.5236F, 0.0F, 0.0F));
        PartDefinition LeftArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(40, 35).addBox(-8.0F, -26.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(28, 22).addBox(-8.0F, -14.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 19).addBox(-8.0F, -14.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 25.0F, 0.0F));
        LeftArm.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(30, 16).addBox(-5.5F, -2.7F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(7, 0).addBox(-5.5F, -0.7F, -1.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0F, -24.0F, 0.0F, 0.0F, 0.0F, -0.5672F));
        PartDefinition RightArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(24, 35).addBox(4.0F, -26.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(20, 32).addBox(7.0F, -14.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 32).addBox(7.0F, -14.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 25.0F, 0.0F));
        RightArm.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(27, 0).addBox(4.5F, -2.7F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 16).addBox(3.5F, -0.7F, -1.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -24.0F, 0.0F, 0.0F, 0.0F, 0.5672F));
        PartDefinition LeftLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(0, 47).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 12.0F, 0.0F));
        LeftLeg.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(52, 10).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.03F, 9.8745F, 0.96F, -1.5708F, 0.0F, 0.0F));
        LeftLeg.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(52, 31).addBox(-2.0F, -1.0F, -1.0F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.03F, 7.4835F, 1.8083F, -0.6545F, 0.0F, 0.0F));
        LeftLeg.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(40, 11).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.03F, 4.9635F, 0.2358F, 0.48F, 0.0F, 0.0F));
        PartDefinition RightLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(44, 22).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 12.0F, 0.0F));
        RightLeg.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 6).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.03F, 9.8745F, 0.96F, -1.5708F, 0.0F, 0.0F));
        RightLeg.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(38, 51).addBox(-2.0F, -1.0F, -1.0F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.03F, 7.4835F, 1.8083F, -0.6545F, 0.0F, 0.0F));
        RightLeg.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(41, 0).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.03F, 4.9635F, 0.2358F, 0.48F, 0.0F, 0.0F));
        return LayerDefinition.create(process(meshdefinition), 128, 128);
    }

    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        this.Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.Torso.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void prepareMobModel(DlsharkEntity p_102861_, float p_102862_, float p_102863_, float p_102864_) {
        this.prepareMobModel(this.controller, p_102861_, p_102862_, p_102863_, p_102864_);
    }

    public void setupAnim(DlsharkEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float HeadPitch) {
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
