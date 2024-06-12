package net.ltxprogrammer.turned.client.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.ltxprogrammer.changed.client.renderer.model.LatexHumanoidModel;
import net.ltxprogrammer.changed.client.renderer.model.LatexHumanoidModelController;
import net.ltxprogrammer.changed.client.renderer.model.LatexHumanoidModelInterface;
import net.ltxprogrammer.turned.LatexMod;
import net.ltxprogrammer.turned.entity.DLbeeEntity;
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

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/model/ModelDark_latex_bee.class */
public class ModelDark_latex_bee extends LatexHumanoidModel<DLbeeEntity> implements LatexHumanoidModelInterface {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(LatexMod.MODID, "model_dark_latex_bee"), "main");
    public final ModelPart Head;
    public final ModelPart Body;
    public final ModelPart LeftArm;
    public final ModelPart RightArm;
    public final ModelPart LeftLeg;
    public final ModelPart RightLeg;
    public final LatexHumanoidModelController controller;

    public ModelDark_latex_bee(ModelPart root) {
        super(root);
        this.Head = root.getChild("Head");
        this.Body = root.getChild("Body");
        this.LeftArm = root.getChild("LeftArm");
        this.RightArm = root.getChild("RightArm");
        this.LeftLeg = root.getChild("LeftLeg");
        this.RightLeg = root.getChild("RightLeg");
        this.controller = LatexHumanoidModelController.Builder.of(this, this.Head, this.Body, this.Body.getChild("Tail"), this.RightArm, this.LeftArm, this.RightLeg, this.LeftLeg).hipOffset(-1.0f).build();
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0f, -8.0f, -4.0f, 8.0f, 6.0f, 8.0f, new CubeDeformation(0.0f)).texOffs(18, 24).addBox(-4.0f, -2.0f, -1.0f, 8.0f, 2.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 0.0f, 0.0f));
        Head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 14).addBox(3.0f, -12.0f, -2.0f, 1.0f, 4.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-0.2f, -11.2403f, 2.7827f, 1.6144f, 0.0f, 0.0f));
        Head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(18, 37).addBox(3.0f, -12.0f, -2.0f, 1.0f, 4.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-6.8f, -11.2403f, 2.7827f, 1.6144f, 0.0f, 0.0f));
        Head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(18, 24).addBox(3.0f, -12.0f, -2.0f, 1.0f, 4.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-6.8f, 0.0f, 1.7f, 0.5236f, 0.0f, 0.0f));
        Head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(22, 37).addBox(3.0f, -12.0f, -0.3f, 1.0f, 4.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-0.2f, 1.0f, 0.2f, 0.5236f, 0.0f, 0.0f));
        Head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(48, 0).addBox(-4.0f, -2.0f, -4.0f, 4.0f, 2.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-0.1895f, 0.341f, 0.0f, 0.0f, 0.0f, 0.0873f));
        Head.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(48, 9).addBox(0.0f, -2.0f, -4.0f, 4.0f, 2.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.1895f, 0.341f, 0.0f, 0.0f, 0.0f, -0.0873f));
        Head.addOrReplaceChild("Mask", CubeListBuilder.create().texOffs(36, 31).addBox(-4.0f, -5.0f, -4.5f, 1.0f, 4.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(26, 19).addBox(-3.0f, -3.0f, -4.5f, 6.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(36, 20).addBox(-1.0f, -5.0f, -4.5f, 2.0f, 2.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(26, 14).addBox(3.0f, -5.0f, -4.5f, 1.0f, 4.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(32, 8).addBox(-5.0f, -6.0f, -4.5f, 10.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(0, 7).addBox(-2.0f, -7.0f, -4.5f, 4.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(28, 10).addBox(-4.0f, 0.0f, -2.0f, 8.0f, 5.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(0, 14).addBox(-5.0f, -1.0f, -3.0f, 10.0f, 4.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(39, 19).addBox(-3.0f, 5.0f, -2.0f, 6.0f, 3.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(24, 0).addBox(-4.0f, 8.0f, -2.0f, 8.0f, 4.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition Wings = Body.addOrReplaceChild("Wings", CubeListBuilder.create(), PartPose.offset(0.0f, 0.0f, 0.0f));
        Wings.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 31).addBox(-10.3f, 2.5f, 1.4f, 3.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(18, 31).addBox(-7.3f, 1.5f, 1.4f, 3.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(6, 6).addBox(-4.3f, 0.5f, 1.4f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(0, 37).addBox(-3.3f, 3.5f, 1.4f, 1.0f, 3.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(6, 0).addBox(-4.3f, 1.5f, 1.4f, 1.0f, 6.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(4, 14).addBox(-5.3f, 2.5f, 1.4f, 1.0f, 6.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(14, 37).addBox(-7.3f, 2.5f, 1.4f, 2.0f, 7.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(0, 0).addBox(-10.3f, 3.5f, 1.4f, 3.0f, 7.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(6, 24).addBox(-11.3f, 3.5f, 1.4f, 1.0f, 6.0f, 0.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.3927f, 0.0f));
        Wings.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 24).addBox(7.3f, 2.5f, 1.4f, 3.0f, 7.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(32, 23).addBox(4.3f, 1.5f, 1.4f, 3.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(0, 19).addBox(3.3f, 0.5f, 1.4f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(2, 37).addBox(2.3f, 3.5f, 1.4f, 1.0f, 3.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(42, 50).addBox(3.3f, 1.5f, 1.4f, 1.0f, 6.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(44, 50).addBox(4.3f, 2.5f, 1.4f, 1.0f, 6.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(40, 37).addBox(5.3f, 2.5f, 1.4f, 2.0f, 7.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(32, 9).addBox(7.3f, 9.5f, 1.4f, 3.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(46, 50).addBox(10.3f, 3.5f, 1.4f, 1.0f, 6.0f, 0.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.3927f, 0.0f));
        Body.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offset(0.0f, 0.0f, 0.0f)).addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 24).addBox(-2.5f, 7.0f, 4.75f, 5.0f, 5.0f, 8.0f, new CubeDeformation(0.0f)).texOffs(32, 20).addBox(-0.5f, 9.0f, 12.75f, 1.0f, 1.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.3927f, 0.0f, 0.0f));
        partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(0, 37).addBox(-2.0f, -2.0f, -2.0f, 3.0f, 12.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offset(-5.0f, 2.0f, 0.0f));
        partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(26, 31).addBox(-1.0f, -2.0f, -2.0f, 3.0f, 12.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offset(5.0f, 2.0f, 0.0f));
        partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(40, 27).addBox(-2.0f, 0.0f, -2.0f, 4.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(28, 47).addBox(-1.0f, 6.0f, -2.0f, 3.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offset(-2.0f, 12.0f, 0.0f)).addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(24, 0).addBox(0.0f, 4.0f, 3.6f, 1.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.3927f, 0.0f, 0.0f));
        partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(40, 40).addBox(-2.0f, 0.0f, -2.0f, 4.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(14, 43).addBox(-2.0f, 6.0f, -2.0f, 3.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offset(2.0f, 12.0f, 0.0f)).addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(26, 31).addBox(-1.0f, 4.0f, 3.6f, 1.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.3927f, 0.0f, 0.0f));
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

    public void prepareMobModel(DLbeeEntity p_102861_, float p_102862_, float p_102863_, float p_102864_) {
        prepareMobModel(this.controller, p_102861_, p_102862_, p_102863_, p_102864_);
    }

    public void setupAnim(DLbeeEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float HeadPitch) {
        this.controller.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, HeadPitch);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: net.ltxprogrammer.turned.client.model.ModelDark_latex_bee$1 */
    /* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/model/ModelDark_latex_bee$1.class */
    public static /* synthetic */ class C00601 {
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
        switch (C00601.$SwitchMap$net$minecraft$world$entity$HumanoidArm[humanoidArm.ordinal()]) {
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
