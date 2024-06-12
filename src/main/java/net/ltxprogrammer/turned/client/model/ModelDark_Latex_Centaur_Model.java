package net.ltxprogrammer.turned.client.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.ltxprogrammer.changed.client.renderer.model.LatexHumanoidModel;
import net.ltxprogrammer.changed.client.renderer.model.LatexHumanoidModelController;
import net.ltxprogrammer.changed.client.renderer.model.LatexHumanoidModelInterface;
import net.ltxprogrammer.turned.LatexMod;
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

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/model/ModelDark_Latex_Centaur_Model.class */
public class ModelDark_Latex_Centaur_Model extends LatexHumanoidModel<DarkLatexCentaurEntity> implements LatexHumanoidModelInterface {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(LatexMod.MODID, "model_dark_latex_centaur_model"), "main");
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
        this.controller = LatexHumanoidModelController.Builder.of(this, this.Head, this.Body, this.Tail, this.RightArm, this.LeftArm, this.RightLeg1, this.LeftLeg1).legs2(this.Body.getChild("LowerBody"), this.RightLeg2, this.LeftLeg2).hipOffset(0.0f).forewardOffset(-8.375f).build();
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offset(0.0f, -2.0f, -8.25f));
        Head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(36, 39).addBox(-3.0f, -7.0f, -5.0f, 6.0f, 4.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 82).addBox(-2.0f, -3.0f, -5.0f, 4.0f, 9.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, -3.0f, 0.0f, -3.1416f, 0.0f, 3.1416f));
        Head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(38, 0).addBox(-4.0f, -4.0f, -4.0f, 8.0f, 8.0f, 8.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, -7.0f, 0.0f, -3.1416f, 0.0f, 3.1416f));
        Head.addOrReplaceChild("Mask", CubeListBuilder.create().texOffs(16, 0).addBox(-4.25f, -3.875f, 3.125f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(16, 0).mirror().addBox(3.25f, -3.875f, 3.125f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).mirror(false).texOffs(16, 1).addBox(-2.5f, -0.875f, 3.25f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(16, 4).addBox(1.5f, -0.875f, 3.25f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(0, 1).addBox(-3.5f, -4.875f, 3.25f, 1.0f, 3.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(2, 1).addBox(2.5f, -4.875f, 3.25f, 1.0f, 3.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(12, 0).addBox(-0.5f, -3.875f, 3.25f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(12, 3).addBox(-1.5f, -4.875f, 3.25f, 3.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(0, 0).addBox(-1.0f, -7.875f, 3.25f, 2.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(0, 19).addBox(-2.5f, -6.875f, 3.25f, 5.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(0, 18).addBox(-3.5f, -5.875f, 3.25f, 7.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(38, 16).addBox(-2.5f, -2.875f, 3.25f, 5.0f, 2.0f, 0.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, -3.0f, -1.0f, -3.1416f, 0.0f, 3.1416f));
        Head.addOrReplaceChild("Ears", CubeListBuilder.create().texOffs(72, 85).addBox(-4.75f, -6.3832f, -3.3303f, 1.0f, 4.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(62, 0).addBox(-4.75f, -2.3832f, -3.3303f, 1.0f, 4.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(14, 16).addBox(-4.75f, 1.6168f, -3.3303f, 1.0f, 1.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(12, 0).addBox(3.75f, 1.6168f, -3.3303f, 1.0f, 1.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(38, 0).addBox(3.75f, -2.3832f, -3.3303f, 1.0f, 4.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(46, 55).addBox(3.75f, -6.3832f, -3.3303f, 1.0f, 4.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, -9.0f, 5.75f, 1.1781f, 0.0f, 3.1416f));
        PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offset(0.0f, -2.0f, 0.0f));
        Body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(58, 16).addBox(-3.5f, 5.0f, 13.25f, 7.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(0, 47).addBox(-5.0f, 0.0f, 12.75f, 10.0f, 5.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, -3.0f, 7.0f, -3.1416f, 0.0f, 3.1416f));
        PartDefinition LowerBody = Body.addOrReplaceChild("LowerBody", CubeListBuilder.create(), PartPose.offset(0.0f, 11.0f, 0.0f));
        LowerBody.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(36, 26).addBox(-3.0f, -2.75f, -9.0f, 6.0f, 1.0f, 18.0f, new CubeDeformation(0.0f)).texOffs(0, 26).addBox(-4.0f, -1.75f, -10.0f, 8.0f, 1.0f, 20.0f, new CubeDeformation(0.0f)).texOffs(0, 0).addBox(-4.5f, -0.75f, -10.0f, 9.0f, 6.0f, 20.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, -2.25f, -0.75f, -3.1416f, 0.0f, 3.1416f));
        LowerBody.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offset(0.0f, -2.125f, 7.25f)).addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(38, 45).addBox(-1.5f, -5.7164f, -26.4923f, 4.0f, 3.0f, 18.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.5f, 0.5376f, -9.7249f, -2.7489f, 0.0f, 3.1416f));
        partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create(), PartPose.offset(5.0f, 0.0f, -8.375f)).addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(66, 37).addBox(-13.0f, 13.75f, 5.25f, 3.0f, 2.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(45, 47).addBox(-13.0f, -1.25f, 5.25f, 1.0f, 1.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(0, 26).addBox(-13.0f, -0.25f, 5.25f, 4.0f, 14.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-9.897f, -2.7496f, 7.375f, 3.1416f, 0.0f, 2.9671f));
        partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create(), PartPose.offset(-5.0f, 0.0f, -8.375f)).addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(64, 57).addBox(9.75f, 13.75f, 5.25f, 3.0f, 2.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(25, 47).addBox(11.75f, -1.25f, 5.25f, 1.0f, 1.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(0, 0).addBox(8.75f, -0.25f, 5.25f, 4.0f, 14.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(9.897f, -2.7496f, 7.375f, -3.1416f, 0.0f, -2.9671f));
        PartDefinition RightLeg1 = partdefinition.addOrReplaceChild("RightLeg1", CubeListBuilder.create(), PartPose.offset(-2.75f, 9.25f, -9.0f));
        RightLeg1.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(77, 61).addBox(0.25f, 5.2934f, 7.2611f, 5.0f, 3.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(82, 85).addBox(0.625f, -8.7934f, 4.5039f, 5.0f, 5.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(40, 66).addBox(0.25f, -8.7934f, 5.5039f, 5.0f, 6.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(2.75f, 6.4184f, 8.2461f, -3.1416f, 0.0f, 3.1416f));
        PartDefinition bone = RightLeg1.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(5.75f, 0.625f, 15.75f, -0.7854f, 0.0f, 0.0f));
        bone.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(70, 0).addBox(0.25f, -0.1715f, 5.697f, 5.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-3.0f, 10.2865f, -2.0934f, 3.0543f, 0.0f, -3.1416f));
        PartDefinition bone2 = bone.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0f, -2.2929f, 1.5355f, 1.1781f, 0.0f, 0.0f));
        bone2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(84, 44).addBox(0.75f, 2.9624f, 2.3798f, 4.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-3.0f, 1.4612f, -13.0106f, -2.3562f, 0.0f, 3.1416f));
        bone2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(81, 19).addBox(0.75f, -9.065f, 3.6476f, 4.0f, 8.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-3.0f, 1.4612f, -13.0106f, 2.7489f, 0.0f, -3.1416f));
        PartDefinition RightLeg2 = partdefinition.addOrReplaceChild("RightLeg2", CubeListBuilder.create(), PartPose.offset(-2.75f, 9.25f, 6.0f));
        RightLeg2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(48, 77).addBox(0.625f, 5.2816f, -7.0623f, 5.0f, 3.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(60, 85).addBox(0.625f, -9.7934f, -10.2611f, 5.0f, 6.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(20, 61).addBox(0.625f, -9.7934f, -9.2611f, 5.0f, 7.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(2.75f, 6.4184f, -6.7539f, -3.1416f, 0.0f, 3.1416f));
        PartDefinition bone3 = RightLeg2.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(5.75f, 0.625f, -13.25f, -0.7854f, 0.0f, 0.0f));
        bone3.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(64, 45).addBox(0.625f, -10.4283f, -4.9708f, 5.0f, 7.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-3.0f, 0.387f, 7.8061f, 3.0543f, 0.0f, -3.1416f));
        PartDefinition bone4 = bone3.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0f, -2.2929f, 1.5355f, 1.1781f, 0.0f, 0.0f));
        bone4.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(12, 81).addBox(1.125f, -3.5298f, -10.8488f, 4.0f, 8.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-3.0f, 6.8188f, -0.0762f, -2.3562f, 0.0f, 3.1416f));
        bone4.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 69).addBox(1.125f, -0.3278f, -7.4128f, 4.0f, 9.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-3.0f, 6.8188f, -0.0762f, 2.7489f, 0.0f, -3.1416f));
        PartDefinition LeftLeg1 = partdefinition.addOrReplaceChild("LeftLeg1", CubeListBuilder.create(), PartPose.offset(2.75f, 9.25f, -9.0f));
        LeftLeg1.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(76, 11).addBox(-5.375f, 5.2934f, 7.2611f, 5.0f, 3.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(84, 55).addBox(-5.625f, -8.7934f, 4.5039f, 5.0f, 5.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(66, 26).addBox(-5.375f, -8.7934f, 5.5039f, 5.0f, 6.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-2.75f, 6.4184f, 8.2461f, -3.1416f, 0.0f, 3.1416f));
        PartDefinition bone5 = LeftLeg1.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.75f, 0.625f, 15.75f, -0.7854f, 0.0f, 0.0f));
        bone5.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(60, 66).addBox(-5.375f, -0.1715f, 5.697f, 5.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(3.0f, 10.2865f, -2.0934f, 3.0543f, 0.0f, -3.1416f));
        PartDefinition bone6 = bone5.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0f, -2.2929f, 1.5355f, 1.1781f, 0.0f, 0.0f));
        bone6.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(82, 33).addBox(-4.875f, 2.9624f, 2.3798f, 4.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(3.0f, 1.4612f, -13.0106f, -2.3562f, 0.0f, 3.1416f));
        bone6.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(32, 77).addBox(-4.875f, -9.065f, 3.6476f, 4.0f, 8.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(3.0f, 1.4612f, -13.0106f, 2.7489f, 0.0f, -3.1416f));
        PartDefinition LeftLeg2 = partdefinition.addOrReplaceChild("LeftLeg2", CubeListBuilder.create(), PartPose.offset(2.75f, 9.25f, 6.0f));
        LeftLeg2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(16, 73).addBox(-5.375f, 5.2816f, -7.0623f, 5.0f, 3.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(48, 85).addBox(-5.375f, -9.7934f, -10.2611f, 5.0f, 6.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(30, 47).addBox(-5.375f, -9.7934f, -9.2611f, 5.0f, 7.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-2.75f, 6.4184f, -6.7539f, -3.1416f, 0.0f, 3.1416f));
        PartDefinition bone9 = LeftLeg2.addOrReplaceChild("bone9", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.75f, 0.625f, -13.25f, -0.7854f, 0.0f, 0.0f));
        bone9.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(0, 57).addBox(-5.375f, -10.4283f, -4.9708f, 5.0f, 7.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(3.0f, 0.387f, 7.8061f, 3.0543f, 0.0f, -3.1416f));
        PartDefinition bone10 = bone9.addOrReplaceChild("bone10", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0f, -2.2929f, 1.5355f, 1.1781f, 0.0f, 0.0f));
        bone10.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(74, 73).addBox(-4.875f, -3.5298f, -10.8488f, 4.0f, 8.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(3.0f, 6.8188f, -0.0762f, -2.3562f, 0.0f, 3.1416f));
        bone10.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(36, 26).addBox(-4.875f, -0.3278f, -7.4128f, 4.0f, 9.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(3.0f, 6.8188f, -0.0762f, 2.7489f, 0.0f, -3.1416f));
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
        prepareMobModel(this.controller, p_102861_, p_102862_, p_102863_, p_102864_);
    }

    public void setupAnim(DarkLatexCentaurEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float HeadPitch) {
        this.controller.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, HeadPitch);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: net.ltxprogrammer.turned.client.model.ModelDark_Latex_Centaur_Model$1 */
    /* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/model/ModelDark_Latex_Centaur_Model$1.class */
    public static /* synthetic */ class C00591 {
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
        switch (C00591.$SwitchMap$net$minecraft$world$entity$HumanoidArm[humanoidArm.ordinal()]) {
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
