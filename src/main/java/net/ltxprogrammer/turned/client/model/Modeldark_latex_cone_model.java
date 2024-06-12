package net.ltxprogrammer.turned.client.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.ltxprogrammer.changed.client.renderer.model.LatexHumanoidModel;
import net.ltxprogrammer.changed.client.renderer.model.LatexHumanoidModelController;
import net.ltxprogrammer.changed.client.renderer.model.LatexHumanoidModelInterface;
import net.ltxprogrammer.turned.LatexMod;
import net.ltxprogrammer.turned.entity.DarklatexconeEntity;
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

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/model/Modeldark_latex_cone_model.class */
public class Modeldark_latex_cone_model extends LatexHumanoidModel<DarklatexconeEntity> implements LatexHumanoidModelInterface {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(LatexMod.MODID, "modeldark_latex_cone_model"), "main");
    public final ModelPart head;
    public final ModelPart body;
    public final ModelPart leftArm;
    public final ModelPart rightArm;
    public final ModelPart leftLeg;
    public final ModelPart rightLeg;
    public final LatexHumanoidModelController controller;

    public Modeldark_latex_cone_model(ModelPart root) {
        super(root);
        this.head = root.getChild("head");
        this.body = root.getChild("body");
        this.leftArm = root.getChild("leftArm");
        this.rightArm = root.getChild("rightArm");
        this.leftLeg = root.getChild("leftLeg");
        this.rightLeg = root.getChild("rightLeg");
        this.controller = LatexHumanoidModelController.Builder.of(this, this.head, this.body, this.body.getChild("Tail"), this.rightArm, this.leftArm, this.rightLeg, this.leftLeg).build();
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 22).addBox(-4.0f, -6.0f, -4.0f, 8.0f, 8.0f, 8.0f, new CubeDeformation(0.0f)).texOffs(0, 11).addBox(4.0f, -2.0f, -4.0f, 1.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 0).addBox(-5.0f, -2.0f, -4.0f, 1.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, -2.0f, 0.0f));
        PartDefinition ears_t = head.addOrReplaceChild("ears_t", CubeListBuilder.create(), PartPose.offset(3.75f, -7.0f, 0.5f));
        ears_t.addOrReplaceChild("ear_t_l", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5f, 0.25f, 0.0f, -0.1338f, -0.5595f, 0.137f)).addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(0, 22).addBox(0.5f, -1.75f, -1.625f, 1.0f, 5.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(38, 54).addBox(-0.5f, -0.75f, -1.625f, 1.0f, 4.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 1.5708f, 0.3927f));
        ears_t.addOrReplaceChild("ear_t_r", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.0f, 0.25f, 0.0f, -0.1338f, 0.5595f, -0.137f)).addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(0, 22).mirror().addBox(-1.5f, -1.75f, -1.625f, 1.0f, 5.0f, 3.0f, new CubeDeformation(0.0f)).mirror(false).texOffs(38, 54).mirror().addBox(-0.5f, -0.75f, -1.625f, 1.0f, 4.0f, 3.0f, new CubeDeformation(0.0f)).mirror(false), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -1.5708f, -0.3927f));
        PartDefinition ears_b = head.addOrReplaceChild("ears_b", CubeListBuilder.create(), PartPose.offset(3.5f, -7.0f, 0.5f));
        ears_b.addOrReplaceChild("ear_b_l", CubeListBuilder.create(), PartPose.offsetAndRotation(0.875f, 5.0f, 1.0f, -0.7719f, -0.4612f, 1.3981f)).addOrReplaceChild("Head_r3", CubeListBuilder.create().texOffs(24, 22).addBox(-0.5f, -1.75f, -1.625f, 1.0f, 5.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(25, 0).addBox(0.5f, -2.75f, -1.625f, 1.0f, 6.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 1.5708f, 0.3927f));
        ears_b.addOrReplaceChild("ear_b_r", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.875f, 5.0f, 1.0f, -0.7719f, 0.4612f, -1.3981f)).addOrReplaceChild("Head_r4", CubeListBuilder.create().texOffs(24, 22).mirror().addBox(-0.5f, -1.75f, -1.625f, 1.0f, 5.0f, 3.0f, new CubeDeformation(0.0f)).mirror(false).texOffs(25, 0).mirror().addBox(-1.5f, -2.75f, -1.625f, 1.0f, 6.0f, 3.0f, new CubeDeformation(0.0f)).mirror(false), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -1.5708f, -0.3927f));
        head.addOrReplaceChild("mask", CubeListBuilder.create().texOffs(12, 15).addBox(-1.0f, -8.0f, -5.0f, 2.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(0, 18).addBox(-4.0f, -3.0f, -5.0f, 8.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(25, 9).addBox(-3.0f, -2.0f, -5.0f, 6.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(12, 3).addBox(-2.5f, -1.0f, -5.0f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(3, 11).addBox(1.5f, -1.0f, -5.0f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(25, 10).addBox(-3.0f, -6.0f, -5.0f, 6.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(25, 11).addBox(-2.0f, -7.0f, -5.0f, 4.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(3, 14).addBox(-0.5f, -4.0f, -5.0f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(15, 1).addBox(2.375f, -4.0f, -5.0f, 2.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(0, 3).addBox(-4.375f, -4.0f, -5.0f, 2.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(4, 13).addBox(-3.375f, -5.0f, -5.0f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(4, 12).addBox(2.375f, -5.0f, -5.0f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(12, 0).addBox(-1.5f, -5.0f, -5.0f, 3.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 2.0f, 0.75f));
        head.addOrReplaceChild("hears", CubeListBuilder.create(), PartPose.offset(0.0f, 2.0f, 0.0f));
        partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(32, 22).addBox(-4.0f, 2.0f, -2.0f, 8.0f, 11.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, -2.0f, 0.0f)).addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offset(0.0f, 12.0f, 0.0f)).addOrReplaceChild("Tail_r1", CubeListBuilder.create().texOffs(22, 37).addBox(-1.25f, -16.6125f, 15.7823f, 3.0f, 1.0f, 10.0f, new CubeDeformation(0.0f)).texOffs(0, 11).addBox(-1.25f, -16.6125f, 0.7823f, 3.0f, 1.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(25, 0).addBox(-1.25f, -12.6125f, 5.7823f, 3.0f, 1.0f, 12.0f, new CubeDeformation(0.0f)).texOffs(51, 32).addBox(-1.25f, -15.6125f, 20.7823f, 3.0f, 2.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(0, 0).addBox(-1.25f, -15.6125f, 1.7823f, 3.0f, 3.0f, 19.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 12.0f, -8.0f, -0.5672f, 0.0f, 0.0f));
        partdefinition.addOrReplaceChild("rightArm", CubeListBuilder.create().texOffs(0, 38).addBox(-3.0f, 5.0f, -2.0f, 4.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(0, 54).addBox(-2.0f, 0.0f, -2.0f, 3.0f, 5.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(12, 13).addBox(-3.0f, 12.0f, -2.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(12, 1).addBox(-3.0f, 12.0f, -0.5f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(12, 11).addBox(-3.0f, 12.0f, 1.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offset(-5.0f, 0.0f, 0.0f));
        partdefinition.addOrReplaceChild("leftArm", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0f, 5.0f, -2.0f, 4.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(27, 48).addBox(-1.0f, 0.0f, -2.0f, 3.0f, 5.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(15, 10).addBox(2.0f, 12.0f, -2.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(15, 2).addBox(2.0f, 12.0f, 1.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 14).addBox(2.0f, 12.0f, -0.5f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offset(5.0f, 0.0f, 0.0f));
        PartDefinition leftLeg = partdefinition.addOrReplaceChild("rightLeg", CubeListBuilder.create().texOffs(55, 53).addBox(-2.0f, 1.0f, -2.0f, 4.0f, 2.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(55, 6).addBox(-2.375f, 12.213f, -2.1649f, 4.0f, 2.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offset(-2.0f, 10.0f, 0.0f));
        leftLeg.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(44, 13).addBox(-2.125f, 0.0f, -2.0f, 4.0f, 5.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 2.0f, 0.0f, -0.3927f, 0.0f, 0.0f));
        leftLeg.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(43, 0).addBox(-6.25f, 0.0f, -2.0f, 4.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(4.0f, 5.0f, -1.0f, 0.6545f, 0.0f, 0.0f));
        leftLeg.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(13, 48).addBox(-2.375f, -0.1371f, 3.7689f, 4.0f, 7.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 5.0f, -1.0f, -0.48f, 0.0f, 0.0f));
        PartDefinition rightLeg = partdefinition.addOrReplaceChild("leftLeg", CubeListBuilder.create().texOffs(54, 39).addBox(-2.0f, 1.0f, -2.0f, 4.0f, 2.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(25, 13).addBox(-1.625f, 12.213f, -2.1649f, 4.0f, 2.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offset(2.0f, 10.0f, 0.0f));
        rightLeg.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(16, 38).addBox(-1.875f, 0.0f, -2.0f, 4.0f, 5.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 2.0f, 0.0f, -0.3927f, 0.0f, 0.0f));
        rightLeg.addOrReplaceChild("bone6", CubeListBuilder.create().texOffs(38, 37).addBox(2.25f, 0.0f, -2.0f, 4.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-4.0f, 5.0f, -1.0f, 0.6545f, 0.0f, 0.0f));
        rightLeg.addOrReplaceChild("bone7", CubeListBuilder.create().texOffs(45, 47).addBox(-1.625f, -0.1371f, 3.7689f, 4.0f, 7.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 5.0f, -1.0f, -0.48f, 0.0f, 0.0f));
        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        this.head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.leftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.rightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.leftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.rightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void prepareMobModel(DarklatexconeEntity p_102861_, float p_102862_, float p_102863_, float p_102864_) {
        prepareMobModel(this.controller, p_102861_, p_102862_, p_102863_, p_102864_);
    }

    public void setupAnim(DarklatexconeEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float HeadPitch) {
        this.controller.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, HeadPitch);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: net.ltxprogrammer.turned.client.model.Modeldark_latex_cone_model$1 */
    /* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/model/Modeldark_latex_cone_model$1.class */
    public static /* synthetic */ class C00661 {
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
        switch (C00661.$SwitchMap$net$minecraft$world$entity$HumanoidArm[humanoidArm.ordinal()]) {
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
