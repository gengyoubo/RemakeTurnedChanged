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
import net.ltxprogrammer.turned.entity.DarkLatexCentaurEntity;
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

public class ModelDark_Latex_Centaur_Model extends LatexHumanoidModel<DarkLatexCentaurEntity> implements LatexHumanoidModelInterface {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("turned", "model_dark_latex_centaur_model"), "main");
    public final ModelPart Head;
    public final ModelPart Body;
    public final ModelPart Tail;
    public final ModelPart LeftArm;
    public final ModelPart RightArm;
    public final ModelPart RightLeg1;
    public final ModelPart RightLeg2;
    public final ModelPart LeftLeg1;
    public final ModelPart LeftLeg2;
    public final LatexHumanoidModelController controller;

    public ModelDark_Latex_Centaur_Model(ModelPart root) {
        super(root);
        this.Head = root.getChild("Head");
        this.Body = root.getChild("Body");
        this.Tail = this.Body.getChild("LowerBody").getChild("Tail");
        this.LeftArm = root.getChild("LeftArm");
        this.RightArm = root.getChild("RightArm");
        this.RightLeg1 = root.getChild("RightLeg1");
        this.RightLeg2 = root.getChild("RightLeg2");
        this.LeftLeg1 = root.getChild("LeftLeg1");
        this.LeftLeg2 = root.getChild("LeftLeg2");
        this.controller = Builder.of(this, this.Head, this.Body, this.Tail, this.RightArm, this.LeftArm, this.RightLeg1, this.LeftLeg1).legs2(this.Body.getChild("LowerBody"), this.RightLeg2, this.LeftLeg2).hipOffset(0.0F).forewardOffset(-8.375F).build();
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offset(0.0F, -2.0F, -8.25F));
        Head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(36, 39).addBox(-3.0F, -7.0F, -5.0F, 6.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 82).addBox(-2.0F, -3.0F, -5.0F, 4.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));
        Head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(38, 0).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));
        Head.addOrReplaceChild("Mask", CubeListBuilder.create().texOffs(16, 0).addBox(-4.25F, -3.875F, 3.125F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(16, 0).mirror().addBox(3.25F, -3.875F, 3.125F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(16, 1).addBox(-2.5F, -0.875F, 3.25F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(16, 4).addBox(1.5F, -0.875F, 3.25F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 1).addBox(-3.5F, -4.875F, 3.25F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(2, 1).addBox(2.5F, -4.875F, 3.25F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(12, 0).addBox(-0.5F, -3.875F, 3.25F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(12, 3).addBox(-1.5F, -4.875F, 3.25F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.0F, -7.875F, 3.25F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 19).addBox(-2.5F, -6.875F, 3.25F, 5.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 18).addBox(-3.5F, -5.875F, 3.25F, 7.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(38, 16).addBox(-2.5F, -2.875F, 3.25F, 5.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0F, -1.0F, -3.1416F, 0.0F, 3.1416F));
        Head.addOrReplaceChild("Ears", CubeListBuilder.create().texOffs(72, 85).addBox(-4.75F, -6.3832F, -3.3303F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(62, 0).addBox(-4.75F, -2.3832F, -3.3303F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(14, 16).addBox(-4.75F, 1.6168F, -3.3303F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 0).addBox(3.75F, 1.6168F, -3.3303F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(38, 0).addBox(3.75F, -2.3832F, -3.3303F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(46, 55).addBox(3.75F, -6.3832F, -3.3303F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -9.0F, 5.75F, 1.1781F, 0.0F, 3.1416F));
        PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offset(0.0F, -2.0F, 0.0F));
        Body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(58, 16).addBox(-3.5F, 5.0F, 13.25F, 7.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 47).addBox(-5.0F, 0.0F, 12.75F, 10.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0F, 7.0F, -3.1416F, 0.0F, 3.1416F));
        PartDefinition LowerBody = Body.addOrReplaceChild("LowerBody", CubeListBuilder.create(), PartPose.offset(0.0F, 11.0F, 0.0F));
        LowerBody.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(36, 26).addBox(-3.0F, -2.75F, -9.0F, 6.0F, 1.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(0, 26).addBox(-4.0F, -1.75F, -10.0F, 8.0F, 1.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-4.5F, -0.75F, -10.0F, 9.0F, 6.0F, 20.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.25F, -0.75F, -3.1416F, 0.0F, 3.1416F));
        PartDefinition Tail = LowerBody.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offset(0.0F, -2.125F, 7.25F));
        Tail.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(38, 45).addBox(-1.5F, -5.7164F, -26.4923F, 4.0F, 3.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5376F, -9.7249F, -2.7489F, 0.0F, 3.1416F));
        PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create(), PartPose.offset(5.0F, 0.0F, -8.375F));
        LeftArm.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(66, 37).addBox(-13.0F, 13.75F, 5.25F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(45, 47).addBox(-13.0F, -1.25F, 5.25F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 26).addBox(-13.0F, -0.25F, 5.25F, 4.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.897F, -2.7496F, 7.375F, 3.1416F, 0.0F, 2.9671F));
        PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create(), PartPose.offset(-5.0F, 0.0F, -8.375F));
        RightArm.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(64, 57).addBox(9.75F, 13.75F, 5.25F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(25, 47).addBox(11.75F, -1.25F, 5.25F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(8.75F, -0.25F, 5.25F, 4.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.897F, -2.7496F, 7.375F, -3.1416F, 0.0F, -2.9671F));
        PartDefinition RightLeg1 = partdefinition.addOrReplaceChild("RightLeg1", CubeListBuilder.create(), PartPose.offset(-2.75F, 9.25F, -9.0F));
        RightLeg1.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(77, 61).addBox(0.25F, 5.2934F, 7.2611F, 5.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(82, 85).addBox(0.625F, -8.7934F, 4.5039F, 5.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 66).addBox(0.25F, -8.7934F, 5.5039F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.75F, 6.4184F, 8.2461F, -3.1416F, 0.0F, 3.1416F));
        PartDefinition bone = RightLeg1.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(5.75F, 0.625F, 15.75F, -0.7854F, 0.0F, 0.0F));
        bone.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(70, 0).addBox(0.25F, -0.1715F, 5.697F, 5.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 10.2865F, -2.0934F, 3.0543F, 0.0F, -3.1416F));
        PartDefinition bone2 = bone.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.2929F, 1.5355F, 1.1781F, 0.0F, 0.0F));
        bone2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(84, 44).addBox(0.75F, 2.9624F, 2.3798F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 1.4612F, -13.0106F, -2.3562F, 0.0F, 3.1416F));
        bone2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(81, 19).addBox(0.75F, -9.065F, 3.6476F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 1.4612F, -13.0106F, 2.7489F, 0.0F, -3.1416F));
        PartDefinition RightLeg2 = partdefinition.addOrReplaceChild("RightLeg2", CubeListBuilder.create(), PartPose.offset(-2.75F, 9.25F, 6.0F));
        RightLeg2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(48, 77).addBox(0.625F, 5.2816F, -7.0623F, 5.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(60, 85).addBox(0.625F, -9.7934F, -10.2611F, 5.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 61).addBox(0.625F, -9.7934F, -9.2611F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.75F, 6.4184F, -6.7539F, -3.1416F, 0.0F, 3.1416F));
        PartDefinition bone3 = RightLeg2.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(5.75F, 0.625F, -13.25F, -0.7854F, 0.0F, 0.0F));
        bone3.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(64, 45).addBox(0.625F, -10.4283F, -4.9708F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 0.387F, 7.8061F, 3.0543F, 0.0F, -3.1416F));
        PartDefinition bone4 = bone3.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.2929F, 1.5355F, 1.1781F, 0.0F, 0.0F));
        bone4.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(12, 81).addBox(1.125F, -3.5298F, -10.8488F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 6.8188F, -0.0762F, -2.3562F, 0.0F, 3.1416F));
        bone4.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 69).addBox(1.125F, -0.3278F, -7.4128F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 6.8188F, -0.0762F, 2.7489F, 0.0F, -3.1416F));
        PartDefinition LeftLeg1 = partdefinition.addOrReplaceChild("LeftLeg1", CubeListBuilder.create(), PartPose.offset(2.75F, 9.25F, -9.0F));
        LeftLeg1.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(76, 11).addBox(-5.375F, 5.2934F, 7.2611F, 5.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(84, 55).addBox(-5.625F, -8.7934F, 4.5039F, 5.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(66, 26).addBox(-5.375F, -8.7934F, 5.5039F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.75F, 6.4184F, 8.2461F, -3.1416F, 0.0F, 3.1416F));
        PartDefinition bone5 = LeftLeg1.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.75F, 0.625F, 15.75F, -0.7854F, 0.0F, 0.0F));
        bone5.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(60, 66).addBox(-5.375F, -0.1715F, 5.697F, 5.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 10.2865F, -2.0934F, 3.0543F, 0.0F, -3.1416F));
        PartDefinition bone6 = bone5.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.2929F, 1.5355F, 1.1781F, 0.0F, 0.0F));
        bone6.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(82, 33).addBox(-4.875F, 2.9624F, 2.3798F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 1.4612F, -13.0106F, -2.3562F, 0.0F, 3.1416F));
        bone6.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(32, 77).addBox(-4.875F, -9.065F, 3.6476F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 1.4612F, -13.0106F, 2.7489F, 0.0F, -3.1416F));
        PartDefinition LeftLeg2 = partdefinition.addOrReplaceChild("LeftLeg2", CubeListBuilder.create(), PartPose.offset(2.75F, 9.25F, 6.0F));
        LeftLeg2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(16, 73).addBox(-5.375F, 5.2816F, -7.0623F, 5.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(48, 85).addBox(-5.375F, -9.7934F, -10.2611F, 5.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 47).addBox(-5.375F, -9.7934F, -9.2611F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.75F, 6.4184F, -6.7539F, -3.1416F, 0.0F, 3.1416F));
        PartDefinition bone9 = LeftLeg2.addOrReplaceChild("bone9", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.75F, 0.625F, -13.25F, -0.7854F, 0.0F, 0.0F));
        bone9.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(0, 57).addBox(-5.375F, -10.4283F, -4.9708F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 0.387F, 7.8061F, 3.0543F, 0.0F, -3.1416F));
        PartDefinition bone10 = bone9.addOrReplaceChild("bone10", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.2929F, 1.5355F, 1.1781F, 0.0F, 0.0F));
        bone10.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(74, 73).addBox(-4.875F, -3.5298F, -10.8488F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 6.8188F, -0.0762F, -2.3562F, 0.0F, 3.1416F));
        bone10.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(36, 26).addBox(-4.875F, -0.3278F, -7.4128F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 6.8188F, -0.0762F, 2.7489F, 0.0F, -3.1416F));
        return LayerDefinition.create(meshdefinition, 112, 112);
    }

    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        this.Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.RightLeg1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.RightLeg2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.LeftLeg1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.LeftLeg2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void prepareMobModel(DarkLatexCentaurEntity p_102861_, float p_102862_, float p_102863_, float p_102864_) {
        this.prepareMobModel(this.controller, p_102861_, p_102862_, p_102863_, p_102864_);
    }

    public void setupAnim(DarkLatexCentaurEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float HeadPitch) {
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
