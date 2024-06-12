package net.ltxprogrammer.turned.client.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.ltxprogrammer.changed.client.renderer.model.LatexHumanoidModel;
import net.ltxprogrammer.changed.client.renderer.model.LatexHumanoidModelController;
import net.ltxprogrammer.changed.client.renderer.model.LatexHumanoidModelInterface;
import net.ltxprogrammer.turned.LatexMod;
import net.ltxprogrammer.turned.entity.DarkLatexSnepEntity;
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

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/model/ModelDark_latex_snep.class */
public class ModelDark_latex_snep extends LatexHumanoidModel<DarkLatexSnepEntity> implements LatexHumanoidModelInterface {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(LatexMod.MODID, "model_dark_latex_snep"), "main");
    public final ModelPart Head;
    public final ModelPart Torso;
    public final ModelPart LeftArm;
    public final ModelPart RightArm;
    public final ModelPart LeftLeg;
    public final ModelPart Rightleg;
    public final LatexHumanoidModelController controller;

    public ModelDark_latex_snep(ModelPart root) {
        super(root);
        this.Head = root.getChild("Head");
        this.Torso = root.getChild("Body");
        this.LeftArm = root.getChild("LeftArm");
        this.RightArm = root.getChild("RightArm");
        this.LeftLeg = root.getChild("LeftLeg");
        this.Rightleg = root.getChild("Rightleg");
        this.controller = LatexHumanoidModelController.Builder.of(this, this.Head, this.Torso, this.Torso.getChild("Tail"), this.RightArm, this.LeftArm, this.Rightleg, this.LeftLeg).hipOffset(-1.0f).build();
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(52, 18).addBox(-4.0f, -6.0f, -4.0f, 8.0f, 3.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 17).addBox(-4.0f, -3.0f, -4.0f, 1.0f, 5.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 31).addBox(-3.0f, -3.0f, -4.0f, 1.0f, 3.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(22, 0).addBox(-2.0f, -3.0f, -4.0f, 2.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(23, 21).addBox(0.0f, -3.0f, -4.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 17).addBox(-4.0f, -6.0f, -3.0f, 8.0f, 7.0f, 7.0f, new CubeDeformation(0.0f)).texOffs(23, 18).addBox(-4.0f, 1.0f, 3.0f, 8.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 11).addBox(-4.0f, 3.0f, 3.0f, 5.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(22, 3).addBox(-4.0f, 4.0f, 3.0f, 2.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(3, 22).addBox(-4.0f, 5.0f, 3.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(56, 28).addBox(2.0f, -8.0f, -1.0f, 3.0f, 3.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(56, 22).addBox(-5.0f, -8.0f, -1.0f, 3.0f, 3.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, -2.0f, 0.0f)).addOrReplaceChild("mask", CubeListBuilder.create().texOffs(0, 10).addBox(-3.0f, -3.0f, -5.0f, 6.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(0, 1).addBox(-2.0f, -2.0f, -5.0f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(0, 0).addBox(1.0f, -2.0f, -5.0f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(0, 13).addBox(-3.0f, -6.0f, -5.0f, 6.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(11, 0).addBox(-0.5f, -4.0f, -5.0f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(22, 11).addBox(2.375f, -5.0f, -5.0f, 1.0f, 2.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(22, 11).addBox(-3.625f, -5.0f, -5.0f, 1.0f, 2.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(22, 5).addBox(-1.5f, -5.0f, -5.0f, 3.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 2.0f, 1.75f));
        partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 31).addBox(-4.0f, 2.0f, -2.0f, 8.0f, 11.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(22, 0).addBox(-5.0f, 1.0f, -3.0f, 10.0f, 5.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(30, 11).addBox(-3.5f, 6.0f, -3.0f, 7.0f, 1.0f, 6.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, -2.0f, 0.0f)).addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offset(0.0f, 12.0f, 0.0f)).addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0f, -1.5902f, 1.4559f, 4.0f, 3.0f, 14.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.5672f, 0.0f, 0.0f)).addOrReplaceChild("bone8", CubeListBuilder.create().texOffs(20, 21).addBox(-2.0f, 6.6167f, -7.7314f, 4.0f, 3.0f, 10.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, -10.4336f, 18.9186f, 0.3927f, 0.0f, 0.0f));
        partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(0, 54).addBox(-3.0f, 0.0f, -2.0f, 4.0f, 5.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(24, 34).addBox(-4.0f, 5.0f, -2.0f, 5.0f, 8.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offset(-5.0f, 0.0f, 0.0f));
        partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(50, 49).addBox(-1.0f, 0.0f, -2.0f, 4.0f, 5.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(38, 18).addBox(-1.0f, 5.0f, -2.0f, 5.0f, 8.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offset(5.0f, 0.0f, 0.0f));
        PartDefinition LeftLeg = partdefinition.addOrReplaceChild("Rightleg", CubeListBuilder.create().texOffs(50, 40).addBox(-2.0f, 0.0f, -2.0f, 4.0f, 2.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(0, 46).addBox(-2.0f, 10.213f, -3.1649f, 4.0f, 3.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offset(-2.0f, 11.0f, 0.0f));
        LeftLeg.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(50, 7).addBox(-2.0f, 0.0f, -2.0f, 4.0f, 5.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 1.0f, 0.0f, -0.3927f, 0.0f, 0.0f));
        LeftLeg.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(18, 46).addBox(-6.0f, 0.0f, -2.0f, 4.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(4.0f, 4.0f, -1.0f, 0.6545f, 0.0f, 0.0f));
        LeftLeg.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(16, 56).addBox(-2.0f, -0.1371f, 3.7689f, 4.0f, 7.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 4.0f, -1.0f, -0.48f, 0.0f, 0.0f));
        PartDefinition Rightleg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(48, 0).addBox(-2.0f, 0.0f, -2.0f, 4.0f, 2.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(37, 41).addBox(-2.0f, 10.213f, -3.1649f, 4.0f, 3.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offset(2.0f, 11.0f, 0.0f));
        Rightleg.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(34, 49).addBox(-2.0f, 0.0f, -2.0f, 4.0f, 5.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 1.0f, 0.0f, -0.3927f, 0.0f, 0.0f));
        Rightleg.addOrReplaceChild("bone6", CubeListBuilder.create().texOffs(44, 30).addBox(2.0f, 0.0f, -2.0f, 4.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-4.0f, 4.0f, -1.0f, 0.6545f, 0.0f, 0.0f));
        Rightleg.addOrReplaceChild("bone7", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0f, -0.1371f, 3.7689f, 4.0f, 7.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 4.0f, -1.0f, -0.48f, 0.0f, 0.0f));
        return LayerDefinition.create(meshdefinition, 80, 80);
    }

    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        this.Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.Torso.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.Rightleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void prepareMobModel(DarkLatexSnepEntity p_102861_, float p_102862_, float p_102863_, float p_102864_) {
        prepareMobModel(this.controller, p_102861_, p_102862_, p_102863_, p_102864_);
    }

    public void setupAnim(DarkLatexSnepEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float HeadPitch) {
        this.controller.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, HeadPitch);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: net.ltxprogrammer.turned.client.model.ModelDark_latex_snep$1 */
    /* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/model/ModelDark_latex_snep$1.class */
    public static /* synthetic */ class C00631 {
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
        switch (C00631.$SwitchMap$net$minecraft$world$entity$HumanoidArm[humanoidArm.ordinal()]) {
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
