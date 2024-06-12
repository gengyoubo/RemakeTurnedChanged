package net.ltxprogrammer.turned.client.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.ltxprogrammer.changed.client.renderer.model.LatexHumanoidModel;
import net.ltxprogrammer.changed.client.renderer.model.LatexHumanoidModelController;
import net.ltxprogrammer.changed.client.renderer.model.LatexHumanoidModelInterface;
import net.ltxprogrammer.turned.LatexMod;
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

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/model/Modeldark_latex_snek_model.class */
public class Modeldark_latex_snek_model extends LatexHumanoidModel<DarkLatexSnakeEntity> implements LatexHumanoidModelInterface {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(LatexMod.MODID, "modeldark_latex_snek_model"), "main");
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
        this.controller = LatexHumanoidModelController.Builder.of(this, this.Head, this.Body, this.Tail, this.RightArm, this.LeftArm, root, root).build();
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(48, 6).addBox(-4.0f, -2.2f, -1.875f, 8.0f, 1.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 0.0f, 0.0f));
        Head.addOrReplaceChild("headbone", CubeListBuilder.create().texOffs(16, 53).addBox(-3.0f, 1.1522f, 0.1046f, 6.0f, 4.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, -7.0f, 0.0f, -0.3927f, 0.0f, 0.0f));
        Head.addOrReplaceChild("headbone2", CubeListBuilder.create().texOffs(52, 11).addBox(-3.0f, 0.2331f, -3.4936f, 6.0f, 4.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, -7.0f, 0.0f, 0.7854f, 0.0f, 0.0f));
        Head.addOrReplaceChild("headbone3", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0f, 3.1364f, -2.6487f, 6.0f, 2.0f, 8.0f, new CubeDeformation(0.0f)).texOffs(20, 34).addBox(-3.0f, 1.1364f, -0.6487f, 6.0f, 2.0f, 6.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, -10.5f, -4.5f)).addOrReplaceChild("Jawbone", CubeListBuilder.create().texOffs(43, 19).addBox(-6.0f, 6.7184f, -10.0575f, 6.0f, 1.0f, 6.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(3.0f, -2.4136f, 6.2263f, 0.1745f, 0.0f, 0.0f)).addOrReplaceChild("Tongue", CubeListBuilder.create().texOffs(3, 7).addBox(-1.125f, -30.2094f, -8.5178f, 1.0f, 0.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 0).addBox(-0.5f, -30.2094f, -7.5178f, 1.0f, 0.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(2, 0).addBox(0.125f, -30.2094f, -8.5178f, 1.0f, 0.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offset(-3.0f, 36.9136f, -1.7263f));
        Head.addOrReplaceChild("Mask", CubeListBuilder.create().texOffs(46, 26).addBox(-3.0f, -32.3636f, -5.3987f, 6.0f, 2.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(36, 36).addBox(-3.0f, -30.3636f, -7.3987f, 6.0f, 0.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(36, 36).addBox(-3.0f, -32.3636f, -5.3987f, 6.0f, 0.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(36, 36).addBox(-3.0f, -32.3636f, -3.3987f, 6.0f, 0.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(46, 28).addBox(-3.0f, -30.3636f, -7.3987f, 6.0f, 2.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(4, 2).addBox(3.125f, -30.3636f, -7.3987f, 0.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(26, 9).addBox(3.125f, -30.3636f, -6.3987f, 0.0f, 1.0f, 7.0f, new CubeDeformation(0.0f)).texOffs(10, 32).addBox(3.125f, -32.3636f, -5.3987f, 0.0f, 1.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(0, 1).addBox(3.125f, -31.3636f, -1.3987f, 0.0f, 1.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(0, 1).addBox(3.125f, -31.3636f, -5.3987f, 0.0f, 1.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(23, 18).addBox(-3.125f, -30.3636f, -6.3987f, 0.0f, 1.0f, 7.0f, new CubeDeformation(0.0f)).texOffs(0, 32).addBox(-3.125f, -32.3636f, -5.3987f, 0.0f, 1.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(4, 0).addBox(-3.125f, -30.3636f, -7.3987f, 0.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 0).addBox(-3.125f, -31.3636f, -1.3987f, 0.0f, 1.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(0, 0).addBox(-3.125f, -31.3636f, -5.3987f, 0.0f, 1.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(20, 0).addBox(1.0f, -28.3636f, -7.3987f, 1.0f, 2.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(20, 2).addBox(-2.0f, -28.3636f, -7.3987f, 1.0f, 2.0f, 0.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 22.875f, 0.0f));
        partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 21).addBox(-4.5f, -1.2f, -2.375f, 9.0f, 4.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(40, 38).addBox(-4.0f, 9.8f, -1.875f, 8.0f, 3.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(0, 38).addBox(-3.5f, 4.8f, -1.875f, 7.0f, 5.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(46, 0).addBox(-4.0f, 2.8f, -1.875f, 8.0f, 2.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 0.0f, 0.0f));
        partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(0, 47).addBox(-3.2164f, -3.1763f, -2.0f, 4.0f, 8.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-5.0f, 2.0f, 0.0f, 0.0f, 0.0f, 0.2182f)).addOrReplaceChild("RightArm_r1", CubeListBuilder.create().texOffs(0, 6).addBox(-2.3865f, 8.8266f, 0.1201f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 10).addBox(-2.3865f, 8.8266f, -1.3799f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 12).addBox(-2.3865f, 8.8266f, 1.6201f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(54, 51).addBox(-2.3865f, 1.8266f, -1.3799f, 4.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-1.0f, 1.8f, -0.125f, -0.5219f, -0.0436f, -0.0756f));
        partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(38, 51).addBox(-0.7836f, -3.1763f, -2.0f, 4.0f, 8.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(5.0f, 2.0f, 0.0f, 0.0f, 0.0f, -0.2182f)).addOrReplaceChild("RightArm_r2", CubeListBuilder.create().texOffs(3, 5).addBox(1.3865f, 8.8266f, 1.6201f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 4).addBox(1.3865f, 8.8266f, -1.3799f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 0).addBox(1.3865f, 8.8266f, 0.1201f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 59).addBox(-1.6135f, 1.8266f, -1.3799f, 4.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(1.0f, 1.8f, -0.125f, -0.5219f, 0.0436f, 0.0756f));
        PartDefinition Tail = partdefinition.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offset(-2.0f, 12.0f, 0.0f));
        Tail.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(46, 30).addBox(-6.0f, 0.8f, -2.0f, 8.0f, 2.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offset(4.0f, 0.0f, 0.0f));
        PartDefinition bone = Tail.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(24, 26).addBox(-4.5f, -3.677f, -4.8486f, 9.0f, 4.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(2.0f, 6.0f, 0.0f, -0.7854f, 0.0f, 0.0f));
        bone.addOrReplaceChild("bone_r1", CubeListBuilder.create().texOffs(42, 45).addBox(-4.5f, -1.0f, -1.5f, 9.0f, 3.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, -5.8281f, -4.4184f, 1.1781f, 0.0f, 0.0f));
        bone.addOrReplaceChild("bone_r2", CubeListBuilder.create().texOffs(0, 30).addBox(-4.5f, -1.0f, -2.5f, 9.0f, 3.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, -4.9507f, -2.9997f, 0.3927f, 0.0f, 0.0f));
        Tail.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(26, 8).addBox(-6.5f, 2.8f, -3.6569f, 9.0f, 4.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offset(4.0f, 0.0f, 0.0f));
        Tail.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(23, 17).addBox(-4.5f, -0.6603f, -3.6846f, 9.0f, 4.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(2.0f, 6.0f, 0.0f, 0.3927f, 0.0f, 0.0f));
        Tail.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(20, 0).addBox(-4.5f, -0.2439f, -4.967f, 9.0f, 4.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(2.0f, 6.0f, 0.0f, 1.1781f, 0.0f, 0.0f));
        Tail.addOrReplaceChild("bone6", CubeListBuilder.create().texOffs(0, 10).addBox(-4.5f, 1.5694f, -6.0263f, 9.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(22, 42).addBox(-3.5f, 8.5694f, -6.0263f, 7.0f, 8.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(16, 61).addBox(-2.5f, 16.5694f, -6.0263f, 5.0f, 7.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(2.0f, 6.0f, 0.0f, 1.5708f, 0.0f, 0.0f));
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
        prepareMobModel(this.controller, p_102861_, p_102862_, p_102863_, p_102864_);
    }

    public void setupAnim(DarkLatexSnakeEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float HeadPitch) {
        this.controller.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, HeadPitch);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: net.ltxprogrammer.turned.client.model.Modeldark_latex_snek_model$1 */
    /* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/model/Modeldark_latex_snek_model$1.class */
    public static /* synthetic */ class C00701 {
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
        switch (C00701.$SwitchMap$net$minecraft$world$entity$HumanoidArm[humanoidArm.ordinal()]) {
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
