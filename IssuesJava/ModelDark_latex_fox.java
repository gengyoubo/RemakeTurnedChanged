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
import net.ltxprogrammer.turned.entity.DarkLatexFoxEntity;
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

public class ModelDark_latex_fox extends LatexHumanoidModel<DarkLatexFoxEntity> implements LatexHumanoidModelInterface {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("turned", "model_dark_latex_fox"), "main");
    public final ModelPart Head;
    public final ModelPart Body;
    public final ModelPart Tail;
    public final ModelPart LeftArm;
    public final ModelPart RightArm;
    public final ModelPart LeftLeg;
    public final ModelPart RightLeg;
    public final LatexHumanoidModelController controller;

    public ModelDark_latex_fox(ModelPart root) {
        super(root);
        this.Head = root.getChild("Head");
        this.Body = root.getChild("Body");
        this.Tail = this.Body.getChild("Tail");
        this.LeftArm = root.getChild("LeftArm");
        this.RightArm = root.getChild("RightArm");
        this.LeftLeg = root.getChild("LeftLeg");
        this.RightLeg = root.getChild("RightLeg");
        this.controller = Builder.of(this, this.Head, this.Body, this.Tail, this.RightArm, this.LeftArm, this.RightLeg, this.LeftLeg).hipOffset(0.0F).build();
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(47, 39).addBox(-2.0F, -2.9F, -6.5F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 16).addBox(-4.0F, -7.0F, -3.5F, 8.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(20, 0).addBox(-4.0F, -10.0F, -0.5F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 3).addBox(1.0F, -10.0F, -0.5F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
        Head.addOrReplaceChild("Mask", CubeListBuilder.create().texOffs(0, 11).addBox(-2.0F, -7.2F, -4.2F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 8).addBox(-3.0F, -6.2F, -4.2F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 19).addBox(-1.0F, -5.2F, -4.2F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(20, 5).addBox(-2.0F, -3.2F, -7.2F, 4.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 4).addBox(-2.0F, -1.2F, -7.2F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(8, 3).addBox(1.0F, -1.2F, -7.2F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(4, 19).addBox(2.0F, -3.2F, -4.2F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(3.0F, -5.2F, -4.2F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 6).addBox(2.1F, -3.2F, -7.2F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(6, 6).addBox(-2.1F, -3.2F, -7.2F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(20, 7).addBox(-3.0F, -3.2F, -4.2F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(10, 3).addBox(-4.0F, -5.2F, -4.2F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-2.0F, -3.2F, -7.2F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.375F));
        PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(26, 26).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition Tail = Body.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offset(0.0F, 11.0F, 0.0F));
        Tail.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, 7.25F, 12.25F, 4.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 16).addBox(-1.0F, 8.25F, 11.25F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -12.0F, -5.2F, -0.3927F, 0.0F, 0.0F));
        partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(32, 0).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, 2.0F, 0.0F));
        partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(0, 30).addBox(-1.0F, -2.0F, -2.0F, 3.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 2.0F, 0.0F));
        PartDefinition LeftLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create(), PartPose.offset(-2.0F, 12.0F, 0.0F));
        LeftLeg.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(46, 23).addBox(-2.0F, 4.3732F, -4.2794F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 4.6268F, 1.6794F));
        LeftLeg.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(46, 0).addBox(-2.0F, 0.0F, -1.0F, 4.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.6268F, 2.2794F, -0.3927F, 0.0F, 0.0F));
        LeftLeg.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(14, 38).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5637F, -2.5296F, 0.7854F, 0.0F, 0.0F));
        LeftLeg.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(46, 46).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, 0.2F, -0.3927F, 0.0F, 0.0F));
        PartDefinition RightLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create(), PartPose.offset(2.0F, 12.0F, 0.0F));
        RightLeg.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(30, 19).addBox(-2.0F, 4.3732F, -4.2794F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 4.6268F, 1.6794F));
        RightLeg.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 47).addBox(-2.0F, 0.0F, -1.0F, 4.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.6268F, 2.2794F, -0.3927F, 0.0F, 0.0F));
        RightLeg.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(30, 42).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5637F, -2.5296F, 0.7854F, 0.0F, 0.0F));
        RightLeg.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(42, 13).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, 0.2F, -0.3927F, 0.0F, 0.0F));
        return LayerDefinition.create(meshdefinition, 64, 64);
    }

    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        this.Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void prepareMobModel(DarkLatexFoxEntity p_102861_, float p_102862_, float p_102863_, float p_102864_) {
        this.prepareMobModel(this.controller, p_102861_, p_102862_, p_102863_, p_102864_);
    }

    public void setupAnim(DarkLatexFoxEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float HeadPitch) {
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
