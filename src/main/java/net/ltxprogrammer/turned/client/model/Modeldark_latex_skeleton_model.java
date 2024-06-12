package net.ltxprogrammer.turned.client.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.ltxprogrammer.changed.client.renderer.model.LatexHumanoidModel;
import net.ltxprogrammer.changed.client.renderer.model.LatexHumanoidModelController;
import net.ltxprogrammer.changed.client.renderer.model.LatexHumanoidModelInterface;
import net.ltxprogrammer.turned.LatexMod;
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

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/model/Modeldark_latex_skeleton_model.class */
public class Modeldark_latex_skeleton_model extends LatexHumanoidModel<DarkLatexSkeletonEntity> implements LatexHumanoidModelInterface {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(LatexMod.MODID, "modeldark_latex_skeleton_model"), "main");
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
        this.controller = LatexHumanoidModelController.Builder.of(this, this.head, this.body, this.body.getChild("Tail"), this.rightArm, this.leftArm, this.rightLeg, this.leftLeg).hipOffset(-1.0f).build();
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0f, -7.0f, -4.0f, 8.0f, 8.0f, 8.0f, new CubeDeformation(0.0f)).texOffs(20, 16).addBox(4.0f, -2.0f, -4.0f, 1.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 16).addBox(-5.0f, -2.0f, -4.0f, 1.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(24, 2).addBox(-6.0f, -1.0f, -4.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(24, 0).addBox(5.0f, -1.0f, -4.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, -1.0f, 0.0f));
        head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(0, 0).addBox(0.5f, -1.75f, -1.625f, 1.0f, 4.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(20, 64).addBox(-0.5f, -0.75f, -1.625f, 1.0f, 3.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(3.5f, -8.0f, 0.5f, 0.0f, 1.5708f, 0.3927f));
        head.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(64, 23).addBox(-0.5f, -0.75f, -1.625f, 1.0f, 3.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(64, 0).addBox(-1.5f, -1.75f, -1.625f, 1.0f, 4.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-3.5f, -8.0f, 0.5f, 0.0f, -1.5708f, -0.3927f));
        head.addOrReplaceChild("mask", CubeListBuilder.create().texOffs(23, 16).addBox(-1.0f, -8.0f, -5.0f, 2.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(24, 7).addBox(-4.0f, -3.0f, -5.0f, 8.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(28, 23).addBox(-3.0f, -2.0f, -5.0f, 6.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(28, 24).addBox(-2.5f, -1.0f, -5.0f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(22, 28).addBox(1.5f, -1.0f, -5.0f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(24, 6).addBox(-4.0f, -6.0f, -5.0f, 8.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(0, 7).addBox(-2.0f, -7.0f, -5.0f, 4.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(22, 31).addBox(-0.5f, -4.0f, -5.0f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(20, 19).addBox(2.375f, -4.0f, -5.0f, 2.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(0, 19).addBox(-4.375f, -4.0f, -5.0f, 2.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(20, 31).addBox(-3.375f, -5.0f, -5.0f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(30, 24).addBox(2.375f, -5.0f, -5.0f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(16, 28).addBox(-1.5f, -5.0f, -5.0f, 3.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 1.0f, 0.75f));
        partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 16).addBox(-4.0f, 1.0f, -2.0f, 8.0f, 5.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(55, 59).addBox(-4.125f, 4.0f, -2.125f, 3.0f, 1.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(60, 41).addBox(-3.375f, 5.5f, -2.125f, 2.0f, 1.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(60, 18).addBox(1.125f, 5.75f, -2.125f, 2.0f, 1.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(30, 55).addBox(2.125f, 7.375f, -2.125f, 1.0f, 1.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(60, 46).addBox(-3.375f, 7.375f, -2.125f, 1.0f, 1.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(52, 27).addBox(-4.125f, 2.0f, -2.125f, 4.0f, 1.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(56, 13).addBox(1.125f, 4.0f, -2.125f, 3.0f, 1.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(42, 50).addBox(0.125f, 2.0f, -2.125f, 4.0f, 1.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(64, 7).addBox(-3.25f, 2.0f, 0.125f, 3.0f, 1.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(25, 64).addBox(-3.25f, 4.0f, 0.125f, 3.0f, 1.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(0, 43).addBox(0.75f, 2.0f, 0.125f, 3.0f, 1.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(16, 57).addBox(0.75f, 4.0f, 0.125f, 3.0f, 1.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(24, 39).addBox(-2.25f, 5.75f, 0.125f, 2.0f, 1.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(44, 0).addBox(0.75f, 5.75f, 0.125f, 2.0f, 1.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(32, 8).addBox(0.75f, 7.375f, 0.125f, 2.0f, 1.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(12, 33).addBox(-2.25f, 7.375f, 0.125f, 2.0f, 1.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(0, 25).addBox(-3.0f, 6.0f, -2.0f, 6.0f, 4.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(24, 0).addBox(-4.0f, 10.0f, -2.0f, 8.0f, 2.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(35, 62).addBox(-0.25f, 1.0f, 1.125f, 1.0f, 11.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, -1.0f, 0.0f)).addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offset(0.0f, 12.0f, 0.0f)).addOrReplaceChild("Tail_r1", CubeListBuilder.create().texOffs(0, 63).addBox(-0.25f, -16.4875f, 12.7823f, 1.0f, 1.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(0, 56).addBox(-0.25f, -16.6125f, 6.7823f, 1.0f, 1.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(56, 6).addBox(-0.25f, -16.7375f, 0.7823f, 1.0f, 1.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(51, 59).addBox(-0.75f, -16.2375f, 14.7823f, 2.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(16, 17).addBox(-0.75f, -16.3625f, 6.7823f, 2.0f, 3.0f, 8.0f, new CubeDeformation(0.0f)).texOffs(14, 49).addBox(-0.75f, -16.6125f, 1.7823f, 2.0f, 3.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 13.0f, -8.0f, -0.5672f, 0.0f, 0.0f));
        PartDefinition rightArm = partdefinition.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offset(5.0f, 0.0f, 0.0f));
        rightArm.addOrReplaceChild("RightArm_r1", CubeListBuilder.create().texOffs(23, 55).addBox(1.625f, -2.625f, -2.5f, 1.0f, 4.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(32, 35).addBox(-1.5f, -2.5f, -2.0f, 4.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.5f, 2.5f, 0.0f, 0.0f, 0.0f, -0.3927f));
        rightArm.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(20, 28).addBox(-3.2f, -7.081f, -1.666f, 4.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(35, 55).addBox(-0.95f, -2.081f, -2.041f, 2.0f, 2.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(60, 51).addBox(-0.95f, -3.331f, -1.166f, 2.0f, 1.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(38, 8).addBox(-0.95f, -4.456f, -0.166f, 2.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(8, 59).addBox(-1.075f, -0.081f, -1.666f, 2.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(32, 28).addBox(-0.075f, 1.919f, -1.666f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(56, 41).addBox(-1.075f, -0.081f, -0.166f, 2.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(32, 30).addBox(-0.075f, 1.919f, -0.166f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 59).addBox(-1.075f, -0.081f, 1.334f, 2.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 33).addBox(-0.075f, 1.919f, 1.334f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(3.7f, 10.9375f, -2.8625f, -0.3927f, 0.0f, 0.0f));
        PartDefinition leftArm = partdefinition.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offset(-5.0f, 0.0f, 0.0f));
        leftArm.addOrReplaceChild("RightArm_r2", CubeListBuilder.create().texOffs(53, 50).addBox(-2.625f, -2.625f, -2.5f, 1.0f, 4.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(0, 33).addBox(-2.5f, -2.5f, -2.0f, 4.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-0.5f, 2.5f, 0.0f, 0.0f, 0.0f, 0.3927f));
        leftArm.addOrReplaceChild("bone8", CubeListBuilder.create().texOffs(28, 12).addBox(-0.8f, -7.081f, -1.666f, 4.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(55, 34).addBox(-1.05f, -2.081f, -2.041f, 2.0f, 2.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(52, 6).addBox(-1.05f, -3.331f, -1.166f, 2.0f, 1.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(36, 33).addBox(-1.05f, -4.456f, -0.166f, 2.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(8, 56).addBox(-0.925f, -0.081f, -1.666f, 2.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(20, 29).addBox(-0.925f, 1.919f, -1.666f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 56).addBox(-0.925f, -0.081f, -0.166f, 2.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 27).addBox(-0.925f, 1.919f, -0.166f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(44, 55).addBox(-0.925f, -0.081f, 1.334f, 2.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 25).addBox(-0.925f, 1.919f, 1.334f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-3.7f, 10.9375f, -2.8625f, -0.3927f, 0.0f, 0.0f));
        PartDefinition leftLeg = partdefinition.addOrReplaceChild("rightLeg", CubeListBuilder.create().texOffs(48, 21).addBox(-2.0f, 0.0f, -2.0f, 4.0f, 2.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(48, 0).addBox(-2.0f, 11.213f, -2.1649f, 4.0f, 2.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(0, 2).addBox(-1.875f, 12.213f, -2.2899f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(0, 1).addBox(-0.5f, 12.213f, -2.2899f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(0, 0).addBox(0.875f, 12.213f, -2.2899f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)), PartPose.offset(-2.0f, 11.0f, 0.0f));
        leftLeg.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(44, 41).addBox(-2.0f, 0.0f, -2.0f, 4.0f, 5.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(45, 58).addBox(-2.25f, -0.125f, -2.5f, 1.0f, 5.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 1.0f, 0.0f, -0.3927f, 0.0f, 0.0f));
        leftLeg.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(12, 39).addBox(-6.0f, 0.0f, -2.0f, 4.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(4.0f, 4.0f, -1.0f, 0.6545f, 0.0f, 0.0f));
        leftLeg.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(0, 46).addBox(-2.0f, -0.1371f, 3.7689f, 4.0f, 7.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 4.0f, -1.0f, -0.48f, 0.0f, 0.0f));
        PartDefinition rightLeg = partdefinition.addOrReplaceChild("leftLeg", CubeListBuilder.create().texOffs(44, 33).addBox(-2.0f, 0.0f, -2.0f, 4.0f, 2.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(44, 15).addBox(-2.0f, 11.213f, -2.1649f, 4.0f, 2.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(5, 2).addBox(0.875f, 12.213f, -2.2899f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(5, 1).addBox(-1.875f, 12.213f, -2.2899f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(5, 0).addBox(-0.5f, 12.213f, -2.2899f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)), PartPose.offset(2.0f, 11.0f, 0.0f));
        rightLeg.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(40, 6).addBox(-2.0f, 0.0f, -2.0f, 4.0f, 5.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(10, 59).addBox(1.25f, -0.125f, -2.5f, 1.0f, 5.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 1.0f, 0.0f, -0.3927f, 0.0f, 0.0f));
        rightLeg.addOrReplaceChild("bone6", CubeListBuilder.create().texOffs(36, 23).addBox(2.0f, 0.0f, -2.0f, 4.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-4.0f, 4.0f, -1.0f, 0.6545f, 0.0f, 0.0f));
        rightLeg.addOrReplaceChild("bone7", CubeListBuilder.create().texOffs(28, 45).addBox(-2.0f, -0.1371f, 3.7689f, 4.0f, 7.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 4.0f, -1.0f, -0.48f, 0.0f, 0.0f));
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
        prepareMobModel(this.controller, p_102861_, p_102862_, p_102863_, p_102864_);
    }

    public void setupAnim(DarkLatexSkeletonEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float HeadPitch) {
        this.controller.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, HeadPitch);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: net.ltxprogrammer.turned.client.model.Modeldark_latex_skeleton_model$1 */
    /* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/model/Modeldark_latex_skeleton_model$1.class */
    public static /* synthetic */ class C00691 {
        static final /* synthetic */ int[] $SwitchMap$net$minecraft$world$entity$HumanoidArm = new int[HumanoidArm.values().length];

        static {
            try {
                $SwitchMap$net$minecraft$world$entity$HumanoidArm[HumanoidArm.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$net$minecraft$world$entity$HumanoidArm[HumanoidArm.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
        }
    }

    public ModelPart getArm(HumanoidArm humanoidArm) {
        switch (C00691.$SwitchMap$net$minecraft$world$entity$HumanoidArm[humanoidArm.ordinal()]) {
            case 1:
                return this.leftArm;
            case 2:
                return this.rightArm;
            default:
                throw new IncompatibleClassChangeError();
        }
    }

    public void setupHand() {
        this.controller.setupHand();
    }

    public LatexHumanoidModelController getController() {
        return this.controller;
    }

    public void translateToHand(HumanoidArm p_102108_, PoseStack p_102109_) {
        getArm(p_102108_).translateAndRotate(p_102109_);
    }

    public ModelPart getHead() {
        return this.head;
    }
}
