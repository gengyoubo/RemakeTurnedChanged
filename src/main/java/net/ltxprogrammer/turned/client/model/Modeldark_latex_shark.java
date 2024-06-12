package net.ltxprogrammer.turned.client.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.ltxprogrammer.changed.client.renderer.model.LatexHumanoidModel;
import net.ltxprogrammer.changed.client.renderer.model.LatexHumanoidModelController;
import net.ltxprogrammer.changed.client.renderer.model.LatexHumanoidModelInterface;
import net.ltxprogrammer.turned.LatexMod;
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

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/model/Modeldark_latex_shark.class */
public class Modeldark_latex_shark extends LatexHumanoidModel<DlsharkEntity> implements LatexHumanoidModelInterface {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(LatexMod.MODID, "modeldark_latex_shark"), "main");
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
        this.controller = LatexHumanoidModelController.Builder.of(this, this.Head, this.Torso, this.Torso.getChild("Tail"), this.RightArm, this.LeftArm, this.RightLeg, this.LeftLeg).hipOffset(0.0f).tailAidsInSwim().build();
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 16).addBox(-4.1f, -33.9f, -4.0f, 8.0f, 8.0f, 8.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 24.0f, 0.0f));
        Head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(16, 49).addBox(-4.8f, -5.4f, 8.0f, 1.0f, 2.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(12, 47).addBox(2.8f, -5.4f, 8.0f, 1.0f, 2.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(16, 47).addBox(-4.8f, -5.4f, 2.0f, 1.0f, 3.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(50, 45).addBox(2.8f, -5.4f, 2.0f, 1.0f, 3.0f, 6.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.5f, -26.0f, 0.0f, 0.3927f, 0.0f, 0.0f));
        Head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 0).addBox(0.0f, -7.65f, 2.25f, 1.0f, 1.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(36, 35).addBox(0.0f, -5.65f, 9.25f, 1.0f, 2.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(24, 51).addBox(0.0f, -6.65f, 3.25f, 1.0f, 3.0f, 6.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-0.5f, -26.0f, -2.5f, 0.3927f, 0.0f, 0.0f));
        Head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 22).addBox(0.0f, -5.9f, 8.875f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-0.5f, -23.754f, 0.1726f, 0.3927f, 0.0f, 0.0f));
        Head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(4, 22).addBox(-5.1f, -2.1f, 2.1f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(52, 54).addBox(-5.1f, -2.1f, -1.9f, 2.0f, 1.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, -26.0f, 0.0f, 0.0f, -0.3927f, 0.0f));
        Head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(24, 22).addBox(4.1f, -2.1f, 2.1f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(52, 17).addBox(3.1f, -2.1f, -1.9f, 2.0f, 1.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, -26.0f, 0.0f, 0.0f, 0.3927f, 0.0f));
        Head.addOrReplaceChild("mask", CubeListBuilder.create().texOffs(21, 12).addBox(-5.0f, -4.0f, -4.1f, 2.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(0, 11).addBox(-3.0f, -3.0f, -4.1f, 6.0f, 2.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(10, 6).addBox(-2.0f, -1.0f, -4.1f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(10, 7).addBox(1.0f, -1.0f, -4.1f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(29, 12).addBox(3.0f, -4.0f, -4.1f, 2.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(0, 7).addBox(3.0f, -5.0f, -4.1f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(21, 9).addBox(-2.0f, -5.0f, -4.1f, 4.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(21, 8).addBox(-2.0f, -7.0f, -4.1f, 4.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(21, 11).addBox(-3.0f, -6.0f, -4.1f, 6.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(25, 12).addBox(-1.0f, -8.0f, -4.1f, 2.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(3, 0).addBox(-0.5f, -9.0f, -4.1f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(27, 3).addBox(-1.0f, -4.0f, -4.1f, 2.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(0, 6).addBox(-4.0f, -5.0f, -4.1f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, -26.0f, 0.0f));
        PartDefinition Torso = partdefinition.addOrReplaceChild("Torso", CubeListBuilder.create().texOffs(0, 32).addBox(-4.0f, -25.0f, -2.0f, 8.0f, 11.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 25.0f, 0.0f));
        Torso.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 56).addBox(0.0f, -0.5f, 1.875f, 1.0f, 6.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(21, 0).addBox(0.0f, 3.5f, 5.875f, 1.0f, 3.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 0).addBox(0.0f, 1.5f, 4.875f, 1.0f, 4.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 16).addBox(0.0f, 0.5f, 2.875f, 1.0f, 4.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-0.5f, -25.0f, 0.0f, -0.1309f, 0.0f, 0.0f));
        PartDefinition Tail = Torso.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offset(0.0f, -15.0f, 0.0f));
        Tail.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(53, 0).addBox(-1.5375f, -0.5405f, 10.9885f, 4.0f, 1.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(21, 0).addBox(-2.5375f, -0.5405f, 0.9885f, 5.0f, 1.0f, 10.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 7.3374f, 13.8717f, -0.0197f, 0.5618f, -1.4878f));
        Tail.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(4, 16).addBox(-1.4625f, -0.5405f, 7.9885f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(24, 11).addBox(-1.4625f, -0.5405f, -2.0115f, 3.0f, 1.0f, 10.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 7.3374f, 13.8717f, -0.0197f, -0.5618f, -1.6538f));
        Tail.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(24, 24).addBox(-2.5f, 7.25f, 3.75f, 6.0f, 3.0f, 8.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-0.5f, -3.4937f, 7.4678f, -0.1745f, 0.0f, 0.0f));
        Tail.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(21, 0).addBox(0.0f, 1.25f, 10.75f, 1.0f, 4.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-0.5f, -10.0f, 0.0f, -0.7854f, 0.0f, 0.0f));
        Tail.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5f, 7.25f, 3.75f, 4.0f, 3.0f, 13.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-0.5f, -10.0f, 0.0f, -0.5236f, 0.0f, 0.0f));
        partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(40, 35).addBox(-8.0f, -26.0f, -2.0f, 4.0f, 12.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(28, 22).addBox(-8.0f, -14.0f, 1.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(30, 19).addBox(-8.0f, -14.0f, -2.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 25.0f, 0.0f)).addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(30, 16).addBox(-5.5f, -2.7f, -1.0f, 1.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(7, 0).addBox(-5.5f, -0.7f, -1.0f, 2.0f, 4.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-5.0f, -24.0f, 0.0f, 0.0f, 0.0f, -0.5672f));
        partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(24, 35).addBox(4.0f, -26.0f, -2.0f, 4.0f, 12.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(20, 32).addBox(7.0f, -14.0f, 1.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 32).addBox(7.0f, -14.0f, -2.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 25.0f, 0.0f)).addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(27, 0).addBox(4.5f, -2.7f, -1.0f, 1.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(24, 16).addBox(3.5f, -0.7f, -1.0f, 2.0f, 4.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(5.0f, -24.0f, 0.0f, 0.0f, 0.0f, 0.5672f));
        PartDefinition LeftLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(0, 47).addBox(-2.0f, -1.0f, -2.0f, 4.0f, 5.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offset(-2.0f, 12.0f, 0.0f));
        LeftLeg.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(52, 10).addBox(-2.0f, 0.0f, 0.0f, 4.0f, 3.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-0.03f, 9.8745f, 0.96f, -1.5708f, 0.0f, 0.0f));
        LeftLeg.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(52, 31).addBox(-2.0f, -1.0f, -1.0f, 4.0f, 5.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-0.03f, 7.4835f, 1.8083f, -0.6545f, 0.0f, 0.0f));
        LeftLeg.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(40, 11).addBox(-2.0f, -2.0f, -2.0f, 4.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-0.03f, 4.9635f, 0.2358f, 0.48f, 0.0f, 0.0f));
        PartDefinition RightLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(44, 22).addBox(-2.0f, -1.0f, -2.0f, 4.0f, 5.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offset(2.0f, 12.0f, 0.0f));
        RightLeg.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 6).addBox(-2.0f, 0.0f, 0.0f, 4.0f, 3.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.03f, 9.8745f, 0.96f, -1.5708f, 0.0f, 0.0f));
        RightLeg.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(38, 51).addBox(-2.0f, -1.0f, -1.0f, 4.0f, 5.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.03f, 7.4835f, 1.8083f, -0.6545f, 0.0f, 0.0f));
        RightLeg.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(41, 0).addBox(-2.0f, -2.0f, -2.0f, 4.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.03f, 4.9635f, 0.2358f, 0.48f, 0.0f, 0.0f));
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
        prepareMobModel(this.controller, p_102861_, p_102862_, p_102863_, p_102864_);
    }

    public void setupAnim(DlsharkEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float HeadPitch) {
        this.controller.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, HeadPitch);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: net.ltxprogrammer.turned.client.model.Modeldark_latex_shark$1 */
    /* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/model/Modeldark_latex_shark$1.class */
    public static /* synthetic */ class C00681 {
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
        switch (C00681.$SwitchMap$net$minecraft$world$entity$HumanoidArm[humanoidArm.ordinal()]) {
            case 1:
                return this.LeftArm;
            case 2:
                return this.RightArm;
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
        return this.Head;
    }
}
