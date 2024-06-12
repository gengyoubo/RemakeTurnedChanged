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
import net.ltxprogrammer.turned.entity.DarkLatexCakeEntity;
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

public class Modeldark_latex_cake_model extends LatexHumanoidModel<DarkLatexCakeEntity> implements LatexHumanoidModelInterface {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("turned", "modeldark_latex_cake_model"), "main");
    public final ModelPart head;
    public final ModelPart body;
    public final ModelPart leftArm;
    public final ModelPart rightArm;
    public final ModelPart leftLeg;
    public final ModelPart rightLeg;
    public final LatexHumanoidModelController controller;

    public Modeldark_latex_cake_model(ModelPart root) {
        super(root);
        this.head = root.getChild("head");
        this.body = root.getChild("body");
        this.leftArm = root.getChild("leftArm");
        this.rightArm = root.getChild("rightArm");
        this.leftLeg = root.getChild("leftLeg");
        this.rightLeg = root.getChild("rightLeg");
        this.controller = Builder.of(this, this.head, this.body, this.body.getChild("Tail"), this.rightArm, this.leftArm, this.rightLeg, this.leftLeg).hipOffset(-2.0F).build();
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(24, 22).addBox(-4.0F, -5.75F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(27, 2).addBox(4.0F, -0.75F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(27, 0).addBox(-5.0F, -0.75F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 14).addBox(-6.0F, 0.25F, -4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 16).addBox(4.0F, 0.25F, -4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.25F, 0.0F));
        head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(0, 0).addBox(0.5F, -2.75F, -1.625F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 14).addBox(-0.5F, -1.75F, -1.625F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, -5.75F, 0.5F, 0.0F, 1.5708F, 0.6109F));
        head.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(15, 30).addBox(-0.5F, -0.75F, -1.625F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(5, 19).addBox(-1.5F, -1.75F, -1.625F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.5F, -5.25F, 0.5F, 0.0F, -1.5708F, -0.9599F));
        head.addOrReplaceChild("Cake", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -32.0F, -5.0F, 9.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(5, 14).addBox(-0.5F, -32.875F, -1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.375F, 25.875F, 0.5F));
        head.addOrReplaceChild("mask", CubeListBuilder.create().texOffs(0, 26).addBox(1.0F, -7.0F, -5.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(19, 21).addBox(-4.0F, -3.0F, -5.0F, 8.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(5, 2).addBox(-1.0F, -6.0F, -5.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(19, 25).addBox(-3.0F, -7.0F, -5.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(11, 14).addBox(-0.5F, -4.0F, -5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 14).addBox(-3.375F, -6.0F, -5.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(2.375F, -6.0F, -5.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(5, 14).addBox(-0.5F, -5.0F, -5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.25F, 0.75F));
        PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(27, 0).addBox(-4.0F, 2.0F, -2.0F, 8.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(31, 9).addBox(-4.0F, 7.0F, -3.0F, 8.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, 0.0F));
        PartDefinition Tail = body.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offset(0.0F, 13.0F, 0.0F));
        Tail.addOrReplaceChild("Tail_r1", CubeListBuilder.create().texOffs(19, 14).addBox(-1.25F, -16.6125F, 0.7823F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(14, 38).addBox(-1.25F, -12.6125F, 5.7823F, 3.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(19, 22).addBox(-1.25F, -15.6125F, 14.7823F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 14).addBox(-1.25F, -15.6125F, 1.7823F, 3.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 12.0F, -8.0F, -0.5672F, 0.0F, 0.0F));
        Tail.addOrReplaceChild("Cake4", CubeListBuilder.create().texOffs(0, 30).addBox(-1.75F, -17.1125F, 0.4073F, 4.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 12.0F, -8.0F, -0.5672F, 0.0F, 0.0F));
        PartDefinition rightArm = partdefinition.addOrReplaceChild("rightArm", CubeListBuilder.create().texOffs(0, 43).addBox(-4.0F, 5.0F, -2.0F, 5.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(44, 61).addBox(-2.0F, 0.0F, -2.0F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(20, 30).addBox(-4.0F, 12.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(27, 22).addBox(-4.0F, 12.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 30).addBox(-4.0F, 12.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, 0.0F, 0.0F));
        rightArm.addOrReplaceChild("Cake2", CubeListBuilder.create().texOffs(51, 33).addBox(-8.0F, -19.0F, -3.0F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(5.5F, 18.25F, 0.5F));
        PartDefinition leftArm = partdefinition.addOrReplaceChild("leftArm", CubeListBuilder.create().texOffs(36, 38).addBox(-1.0F, 5.0F, -2.0F, 5.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(30, 59).addBox(-1.0F, 0.0F, -2.0F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(3, 33).addBox(3.0F, 12.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 32).addBox(3.0F, 12.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 31).addBox(3.0F, 12.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 0.0F, 0.0F));
        leftArm.addOrReplaceChild("Cake3", CubeListBuilder.create().texOffs(51, 0).addBox(4.0F, -19.0F, -3.0F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.5F, 18.25F, 0.5F));
        PartDefinition rightLeg = partdefinition.addOrReplaceChild("rightLeg", CubeListBuilder.create().texOffs(58, 61).addBox(-2.0F, 1.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(49, 44).addBox(-2.375F, 11.213F, -3.1649F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(19, 18).addBox(-2.375F, 13.213F, -4.1649F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 17).addBox(0.625F, 13.213F, -4.1649F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(5, 0).addBox(-0.875F, 13.213F, -4.1649F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 10.0F, 0.0F));
        rightLeg.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(0, 54).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
        rightLeg.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(34, 49).addBox(-6.375F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 5.0F, -1.0F, 0.6545F, 0.0F, 0.0F));
        rightLeg.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(16, 57).addBox(-2.375F, -0.1371F, 3.7689F, 4.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.0F, -1.0F, -0.48F, 0.0F, 0.0F));
        PartDefinition leftLeg = partdefinition.addOrReplaceChild("leftLeg", CubeListBuilder.create().texOffs(61, 17).addBox(-2.0F, 1.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 20).addBox(-1.625F, 11.213F, -3.1649F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(26, 25).addBox(1.375F, 13.213F, -4.1649F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 24).addBox(-1.625F, 13.213F, -4.1649F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 22).addBox(-0.125F, 13.213F, -4.1649F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 10.0F, 0.0F));
        leftLeg.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(50, 52).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
        leftLeg.addOrReplaceChild("bone6", CubeListBuilder.create().texOffs(18, 47).addBox(2.375F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 5.0F, -1.0F, 0.6545F, 0.0F, 0.0F));
        leftLeg.addOrReplaceChild("bone7", CubeListBuilder.create().texOffs(57, 7).addBox(-1.625F, -0.1371F, 3.7689F, 4.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.0F, -1.0F, -0.48F, 0.0F, 0.0F));
        return LayerDefinition.create(meshdefinition, 80, 80);
    }

    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        this.head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.leftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.rightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.leftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.rightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void prepareMobModel(DarkLatexCakeEntity p_102861_, float p_102862_, float p_102863_, float p_102864_) {
        this.prepareMobModel(this.controller, p_102861_, p_102862_, p_102863_, p_102864_);
    }

    public void setupAnim(DarkLatexCakeEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float HeadPitch) {
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
