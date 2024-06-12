package net.ltxprogrammer.turned.client.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.ltxprogrammer.changed.client.renderer.model.LatexHumanoidModel;
import net.ltxprogrammer.changed.client.renderer.model.LatexHumanoidModelController;
import net.ltxprogrammer.changed.client.renderer.model.LatexHumanoidModelInterface;
import net.ltxprogrammer.turned.LatexMod;
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

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/model/ModelDark_latex_fox.class */
public class ModelDark_latex_fox extends LatexHumanoidModel<DarkLatexFoxEntity> implements LatexHumanoidModelInterface {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(LatexMod.MODID, "model_dark_latex_fox"), "main");
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
        this.controller = LatexHumanoidModelController.Builder.of(this, this.Head, this.Body, this.Tail, this.RightArm, this.LeftArm, this.RightLeg, this.LeftLeg).hipOffset(0.0f).build();
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(47, 39).addBox(-2.0f, -2.9f, -6.5f, 4.0f, 3.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(0, 16).addBox(-4.0f, -7.0f, -3.5f, 8.0f, 7.0f, 7.0f, new CubeDeformation(0.0f)).texOffs(20, 0).addBox(-4.0f, -10.0f, -0.5f, 3.0f, 3.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(0, 3).addBox(1.0f, -10.0f, -0.5f, 3.0f, 3.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 0.0f, 0.0f)).addOrReplaceChild("Mask", CubeListBuilder.create().texOffs(0, 11).addBox(-2.0f, -7.2f, -4.2f, 4.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(0, 8).addBox(-3.0f, -6.2f, -4.2f, 6.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(0, 19).addBox(-1.0f, -5.2f, -4.2f, 2.0f, 2.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(20, 5).addBox(-2.0f, -3.2f, -7.2f, 4.0f, 2.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(0, 4).addBox(-2.0f, -1.2f, -7.2f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(8, 3).addBox(1.0f, -1.2f, -7.2f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(4, 19).addBox(2.0f, -3.2f, -4.2f, 1.0f, 3.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(0, 0).addBox(3.0f, -5.2f, -4.2f, 1.0f, 4.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(0, 6).addBox(2.1f, -3.2f, -7.2f, 0.0f, 2.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(6, 6).addBox(-2.1f, -3.2f, -7.2f, 0.0f, 2.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(20, 7).addBox(-3.0f, -3.2f, -4.2f, 1.0f, 3.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(10, 3).addBox(-4.0f, -5.2f, -4.2f, 1.0f, 4.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(0, 0).addBox(-2.0f, -3.2f, -7.2f, 4.0f, 0.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 0.0f, 0.375f));
        partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(26, 26).addBox(-4.0f, 0.0f, -2.0f, 8.0f, 12.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 0.0f, 0.0f)).addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offset(0.0f, 11.0f, 0.0f)).addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0f, 7.25f, 12.25f, 4.0f, 4.0f, 12.0f, new CubeDeformation(0.0f)).texOffs(0, 16).addBox(-1.0f, 8.25f, 11.25f, 2.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, -12.0f, -5.2f, -0.3927f, 0.0f, 0.0f));
        partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(32, 0).addBox(-2.0f, -2.0f, -2.0f, 3.0f, 13.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offset(-5.0f, 2.0f, 0.0f));
        partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(0, 30).addBox(-1.0f, -2.0f, -2.0f, 3.0f, 13.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offset(5.0f, 2.0f, 0.0f));
        PartDefinition LeftLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create(), PartPose.offset(-2.0f, 12.0f, 0.0f));
        LeftLeg.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(46, 23).addBox(-2.0f, 4.3732f, -4.2794f, 4.0f, 3.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 4.6268f, 1.6794f));
        LeftLeg.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(46, 0).addBox(-2.0f, 0.0f, -1.0f, 4.0f, 7.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 4.6268f, 2.2794f, -0.3927f, 0.0f, 0.0f));
        LeftLeg.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(14, 38).addBox(-2.0f, 0.0f, -2.0f, 4.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 2.5637f, -2.5296f, 0.7854f, 0.0f, 0.0f));
        LeftLeg.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(46, 46).addBox(-2.0f, 0.0f, -2.0f, 4.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, -0.8f, 0.2f, -0.3927f, 0.0f, 0.0f));
        PartDefinition RightLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create(), PartPose.offset(2.0f, 12.0f, 0.0f));
        RightLeg.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(30, 19).addBox(-2.0f, 4.3732f, -4.2794f, 4.0f, 3.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 4.6268f, 1.6794f));
        RightLeg.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 47).addBox(-2.0f, 0.0f, -1.0f, 4.0f, 7.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 4.6268f, 2.2794f, -0.3927f, 0.0f, 0.0f));
        RightLeg.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(30, 42).addBox(-2.0f, 0.0f, -2.0f, 4.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 2.5637f, -2.5296f, 0.7854f, 0.0f, 0.0f));
        RightLeg.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(42, 13).addBox(-2.0f, 0.0f, -2.0f, 4.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, -0.8f, 0.2f, -0.3927f, 0.0f, 0.0f));
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
        prepareMobModel(this.controller, p_102861_, p_102862_, p_102863_, p_102864_);
    }

    public void setupAnim(DarkLatexFoxEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float HeadPitch) {
        this.controller.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, HeadPitch);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: net.ltxprogrammer.turned.client.model.ModelDark_latex_fox$1 */
    /* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/model/ModelDark_latex_fox$1.class */
    public static /* synthetic */ class C00611 {
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
        switch (C00611.$SwitchMap$net$minecraft$world$entity$HumanoidArm[humanoidArm.ordinal()]) {
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
