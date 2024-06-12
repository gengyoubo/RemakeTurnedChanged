package net.ltxprogrammer.turned.client.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.ltxprogrammer.changed.client.renderer.model.LatexHumanoidModel;
import net.ltxprogrammer.changed.client.renderer.model.LatexHumanoidModelController;
import net.ltxprogrammer.changed.client.renderer.model.LatexHumanoidModelInterface;
import net.ltxprogrammer.turned.LatexMod;
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

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/model/Modeldark_latex_cake_model.class */
public class Modeldark_latex_cake_model extends LatexHumanoidModel<DarkLatexCakeEntity> implements LatexHumanoidModelInterface {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(LatexMod.MODID, "modeldark_latex_cake_model"), "main");
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
        this.controller = LatexHumanoidModelController.Builder.of(this, this.head, this.body, this.body.getChild("Tail"), this.rightArm, this.leftArm, this.rightLeg, this.leftLeg).hipOffset(-2.0f).build();
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(24, 22).addBox(-4.0f, -5.75f, -4.0f, 8.0f, 8.0f, 8.0f, new CubeDeformation(0.0f)).texOffs(27, 2).addBox(4.0f, -0.75f, -4.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(27, 0).addBox(-5.0f, -0.75f, -4.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(19, 14).addBox(-6.0f, 0.25f, -4.0f, 2.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(19, 16).addBox(4.0f, 0.25f, -4.0f, 2.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, -2.25f, 0.0f));
        head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(0, 0).addBox(0.5f, -2.75f, -1.625f, 1.0f, 6.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(0, 14).addBox(-0.5f, -1.75f, -1.625f, 1.0f, 5.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(4.5f, -5.75f, 0.5f, 0.0f, 1.5708f, 0.6109f));
        head.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(15, 30).addBox(-0.5f, -0.75f, -1.625f, 1.0f, 4.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(5, 19).addBox(-1.5f, -1.75f, -1.625f, 1.0f, 5.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-5.5f, -5.25f, 0.5f, 0.0f, -1.5708f, -0.9599f));
        head.addOrReplaceChild("Cake", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0f, -32.0f, -5.0f, 9.0f, 5.0f, 9.0f, new CubeDeformation(0.0f)).texOffs(5, 14).addBox(-0.5f, -32.875f, -1.5f, 2.0f, 1.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offset(-0.375f, 25.875f, 0.5f));
        head.addOrReplaceChild("mask", CubeListBuilder.create().texOffs(0, 26).addBox(1.0f, -7.0f, -5.0f, 2.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(19, 21).addBox(-4.0f, -3.0f, -5.0f, 8.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(5, 2).addBox(-1.0f, -6.0f, -5.0f, 2.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(19, 25).addBox(-3.0f, -7.0f, -5.0f, 4.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(11, 14).addBox(-0.5f, -4.0f, -5.0f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(0, 14).addBox(-3.375f, -6.0f, -5.0f, 1.0f, 3.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(0, 0).addBox(2.375f, -6.0f, -5.0f, 1.0f, 3.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(5, 14).addBox(-0.5f, -5.0f, -5.0f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 2.25f, 0.75f));
        PartDefinition Tail = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(27, 0).addBox(-4.0f, 2.0f, -2.0f, 8.0f, 5.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(31, 9).addBox(-4.0f, 7.0f, -3.0f, 8.0f, 6.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, -2.0f, 0.0f)).addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offset(0.0f, 13.0f, 0.0f));
        Tail.addOrReplaceChild("Tail_r1", CubeListBuilder.create().texOffs(19, 14).addBox(-1.25f, -16.6125f, 0.7823f, 3.0f, 1.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(14, 38).addBox(-1.25f, -12.6125f, 5.7823f, 3.0f, 1.0f, 8.0f, new CubeDeformation(0.0f)).texOffs(19, 22).addBox(-1.25f, -15.6125f, 14.7823f, 3.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 14).addBox(-1.25f, -15.6125f, 1.7823f, 3.0f, 3.0f, 13.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 12.0f, -8.0f, -0.5672f, 0.0f, 0.0f));
        Tail.addOrReplaceChild("Cake4", CubeListBuilder.create().texOffs(0, 30).addBox(-1.75f, -17.1125f, 0.4073f, 4.0f, 2.0f, 7.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 12.0f, -8.0f, -0.5672f, 0.0f, 0.0f));
        partdefinition.addOrReplaceChild("rightArm", CubeListBuilder.create().texOffs(0, 43).addBox(-4.0f, 5.0f, -2.0f, 5.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(44, 61).addBox(-2.0f, 0.0f, -2.0f, 3.0f, 5.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(20, 30).addBox(-4.0f, 12.0f, -2.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(27, 22).addBox(-4.0f, 12.0f, -0.5f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 30).addBox(-4.0f, 12.0f, 1.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offset(-5.0f, 0.0f, 0.0f)).addOrReplaceChild("Cake2", CubeListBuilder.create().texOffs(51, 33).addBox(-8.0f, -19.0f, -3.0f, 4.0f, 2.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offset(5.5f, 18.25f, 0.5f));
        partdefinition.addOrReplaceChild("leftArm", CubeListBuilder.create().texOffs(36, 38).addBox(-1.0f, 5.0f, -2.0f, 5.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(30, 59).addBox(-1.0f, 0.0f, -2.0f, 3.0f, 5.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(3, 33).addBox(3.0f, 12.0f, -2.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 32).addBox(3.0f, 12.0f, 1.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(3, 31).addBox(3.0f, 12.0f, -0.5f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offset(5.0f, 0.0f, 0.0f)).addOrReplaceChild("Cake3", CubeListBuilder.create().texOffs(51, 0).addBox(4.0f, -19.0f, -3.0f, 4.0f, 2.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offset(-5.5f, 18.25f, 0.5f));
        PartDefinition rightLeg = partdefinition.addOrReplaceChild("rightLeg", CubeListBuilder.create().texOffs(58, 61).addBox(-2.0f, 1.0f, -2.0f, 4.0f, 2.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(49, 44).addBox(-2.375f, 11.213f, -3.1649f, 4.0f, 3.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(19, 18).addBox(-2.375f, 13.213f, -4.1649f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(8, 17).addBox(0.625f, 13.213f, -4.1649f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(5, 0).addBox(-0.875f, 13.213f, -4.1649f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offset(-2.0f, 10.0f, 0.0f));
        rightLeg.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(0, 54).addBox(-2.0f, 0.0f, -2.0f, 4.0f, 5.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 2.0f, 0.0f, -0.3927f, 0.0f, 0.0f));
        rightLeg.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(34, 49).addBox(-6.375f, 0.0f, -2.0f, 4.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(4.0f, 5.0f, -1.0f, 0.6545f, 0.0f, 0.0f));
        rightLeg.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(16, 57).addBox(-2.375f, -0.1371f, 3.7689f, 4.0f, 7.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 5.0f, -1.0f, -0.48f, 0.0f, 0.0f));
        PartDefinition leftLeg = partdefinition.addOrReplaceChild("leftLeg", CubeListBuilder.create().texOffs(61, 17).addBox(-2.0f, 1.0f, -2.0f, 4.0f, 2.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(48, 20).addBox(-1.625f, 11.213f, -3.1649f, 4.0f, 3.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(26, 25).addBox(1.375f, 13.213f, -4.1649f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 24).addBox(-1.625f, 13.213f, -4.1649f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 22).addBox(-0.125f, 13.213f, -4.1649f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offset(2.0f, 10.0f, 0.0f));
        leftLeg.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(50, 52).addBox(-2.0f, 0.0f, -2.0f, 4.0f, 5.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 2.0f, 0.0f, -0.3927f, 0.0f, 0.0f));
        leftLeg.addOrReplaceChild("bone6", CubeListBuilder.create().texOffs(18, 47).addBox(2.375f, 0.0f, -2.0f, 4.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-4.0f, 5.0f, -1.0f, 0.6545f, 0.0f, 0.0f));
        leftLeg.addOrReplaceChild("bone7", CubeListBuilder.create().texOffs(57, 7).addBox(-1.625f, -0.1371f, 3.7689f, 4.0f, 7.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 5.0f, -1.0f, -0.48f, 0.0f, 0.0f));
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
        prepareMobModel(this.controller, p_102861_, p_102862_, p_102863_, p_102864_);
    }

    public void setupAnim(DarkLatexCakeEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float HeadPitch) {
        this.controller.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, HeadPitch);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: net.ltxprogrammer.turned.client.model.Modeldark_latex_cake_model$1 */
    /* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/model/Modeldark_latex_cake_model$1.class */
    public static /* synthetic */ class C00651 {
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
        switch (C00651.$SwitchMap$net$minecraft$world$entity$HumanoidArm[humanoidArm.ordinal()]) {
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
