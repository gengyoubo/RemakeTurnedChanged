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
import net.ltxprogrammer.turned.entity.DarkLatexSnakeEntity;
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

public class Modeldark_latex_snek_model extends LatexHumanoidModel<DarkLatexSnakeEntity> implements LatexHumanoidModelInterface {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("turned", "modeldark_latex_snek_model"), "main");
    public final ModelPart Head;
    public final ModelPart Body;
    public final ModelPart LeftArm;
    public final ModelPart RightArm;
    public final ModelPart Tail;
    public final LatexHumanoidModelController controller;

    public Modeldark_latex_snek_model(ModelPart root) {
        super(root);
        this.Head = root.getChild("Head");
        this.Body = root.getChild("Body");
        this.LeftArm = root.getChild("LeftArm");
        this.RightArm = root.getChild("RightArm");
        this.Tail = root.getChild("Tail");
        this.controller = Builder.of(this, this.Head, this.Body, this.Tail, this.RightArm, this.LeftArm, root, root).build();
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(48, 6).addBox(-4.0F, -2.2F, -1.875F, 8.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
        Head.addOrReplaceChild("headbone", CubeListBuilder.create().texOffs(16, 53).addBox(-3.0F, 1.1522F, 0.1046F, 6.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
        Head.addOrReplaceChild("headbone2", CubeListBuilder.create().texOffs(52, 11).addBox(-3.0F, 0.2331F, -3.4936F, 6.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
        PartDefinition headbone3 = Head.addOrReplaceChild("headbone3", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, 3.1364F, -2.6487F, 6.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(20, 34).addBox(-3.0F, 1.1364F, -0.6487F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -10.5F, -4.5F));
        PartDefinition Jawbone = headbone3.addOrReplaceChild("Jawbone", CubeListBuilder.create().texOffs(43, 19).addBox(-6.0F, 6.7184F, -10.0575F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -2.4136F, 6.2263F, 0.1745F, 0.0F, 0.0F));
        Jawbone.addOrReplaceChild("Tongue", CubeListBuilder.create().texOffs(3, 7).addBox(-1.125F, -30.2094F, -8.5178F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.5F, -30.2094F, -7.5178F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(2, 0).addBox(0.125F, -30.2094F, -8.5178F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, 36.9136F, -1.7263F));
        Head.addOrReplaceChild("Mask", CubeListBuilder.create().texOffs(46, 26).addBox(-3.0F, -32.3636F, -5.3987F, 6.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(36, 36).addBox(-3.0F, -30.3636F, -7.3987F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(36, 36).addBox(-3.0F, -32.3636F, -5.3987F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(36, 36).addBox(-3.0F, -32.3636F, -3.3987F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(46, 28).addBox(-3.0F, -30.3636F, -7.3987F, 6.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(4, 2).addBox(3.125F, -30.3636F, -7.3987F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 9).addBox(3.125F, -30.3636F, -6.3987F, 0.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(10, 32).addBox(3.125F, -32.3636F, -5.3987F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 1).addBox(3.125F, -31.3636F, -1.3987F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 1).addBox(3.125F, -31.3636F, -5.3987F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(23, 18).addBox(-3.125F, -30.3636F, -6.3987F, 0.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 32).addBox(-3.125F, -32.3636F, -5.3987F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(4, 0).addBox(-3.125F, -30.3636F, -7.3987F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-3.125F, -31.3636F, -1.3987F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-3.125F, -31.3636F, -5.3987F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(20, 0).addBox(1.0F, -28.3636F, -7.3987F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(20, 2).addBox(-2.0F, -28.3636F, -7.3987F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 22.875F, 0.0F));
        partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 21).addBox(-4.5F, -1.2F, -2.375F, 9.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(40, 38).addBox(-4.0F, 9.8F, -1.875F, 8.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 38).addBox(-3.5F, 4.8F, -1.875F, 7.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(46, 0).addBox(-4.0F, 2.8F, -1.875F, 8.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition LeftArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(0, 47).addBox(-3.2164F, -3.1763F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.2182F));
        LeftArm.addOrReplaceChild("RightArm_r1", CubeListBuilder.create().texOffs(0, 6).addBox(-2.3865F, 8.8266F, 0.1201F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 10).addBox(-2.3865F, 8.8266F, -1.3799F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 12).addBox(-2.3865F, 8.8266F, 1.6201F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 51).addBox(-2.3865F, 1.8266F, -1.3799F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 1.8F, -0.125F, -0.5219F, -0.0436F, -0.0756F));
        PartDefinition RightArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(38, 51).addBox(-0.7836F, -3.1763F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, 2.0F, 0.0F, 0.0F, 0.0F, -0.2182F));
        RightArm.addOrReplaceChild("RightArm_r2", CubeListBuilder.create().texOffs(3, 5).addBox(1.3865F, 8.8266F, 1.6201F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 4).addBox(1.3865F, 8.8266F, -1.3799F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(1.3865F, 8.8266F, 0.1201F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 59).addBox(-1.6135F, 1.8266F, -1.3799F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.8F, -0.125F, -0.5219F, 0.0436F, 0.0756F));
        PartDefinition Tail = partdefinition.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offset(-2.0F, 12.0F, 0.0F));
        Tail.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(46, 30).addBox(-6.0F, 0.8F, -2.0F, 8.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, 0.0F, 0.0F));
        PartDefinition bone = Tail.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(24, 26).addBox(-4.5F, -3.677F, -4.8486F, 9.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 6.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
        bone.addOrReplaceChild("bone_r1", CubeListBuilder.create().texOffs(42, 45).addBox(-4.5F, -1.0F, -1.5F, 9.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.8281F, -4.4184F, 1.1781F, 0.0F, 0.0F));
        bone.addOrReplaceChild("bone_r2", CubeListBuilder.create().texOffs(0, 30).addBox(-4.5F, -1.0F, -2.5F, 9.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.9507F, -2.9997F, 0.3927F, 0.0F, 0.0F));
        Tail.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(26, 8).addBox(-6.5F, 2.8F, -3.6569F, 9.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, 0.0F, 0.0F));
        Tail.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(23, 17).addBox(-4.5F, -0.6603F, -3.6846F, 9.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 6.0F, 0.0F, 0.3927F, 0.0F, 0.0F));
        Tail.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(20, 0).addBox(-4.5F, -0.2439F, -4.967F, 9.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 6.0F, 0.0F, 1.1781F, 0.0F, 0.0F));
        Tail.addOrReplaceChild("bone6", CubeListBuilder.create().texOffs(0, 10).addBox(-4.5F, 1.5694F, -6.0263F, 9.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(22, 42).addBox(-3.5F, 8.5694F, -6.0263F, 7.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(16, 61).addBox(-2.5F, 16.5694F, -6.0263F, 5.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 6.0F, 0.0F, 1.5708F, 0.0F, 0.0F));
        return LayerDefinition.create(meshdefinition, 80, 80);
    }

    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        this.Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.Tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void prepareMobModel(DarkLatexSnakeEntity p_102861_, float p_102862_, float p_102863_, float p_102864_) {
        this.prepareMobModel(this.controller, p_102861_, p_102862_, p_102863_, p_102864_);
    }

    public void setupAnim(DarkLatexSnakeEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float HeadPitch) {
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
