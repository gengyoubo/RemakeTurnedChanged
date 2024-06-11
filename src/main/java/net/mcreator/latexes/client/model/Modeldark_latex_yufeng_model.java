package net.mcreator.latexes.client.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.mcreator.latexes.LatexMod;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/model/Modeldark_latex_yufeng_model.class */
public class Modeldark_latex_yufeng_model<T extends Entity> extends EntityModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(LatexMod.MODID, "modeldark_latex_yufeng_model"), "main");
    public final ModelPart head;
    public final ModelPart body;
    public final ModelPart leftArm;
    public final ModelPart rightArm;
    public final ModelPart leftLeg;
    public final ModelPart rightLeg;

    public Modeldark_latex_yufeng_model(ModelPart root) {
        this.head = root.getChild("head");
        this.body = root.getChild("body");
        this.leftArm = root.getChild("leftArm");
        this.rightArm = root.getChild("rightArm");
        this.leftLeg = root.getChild("leftLeg");
        this.rightLeg = root.getChild("rightLeg");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0f, -8.0f, -4.0f, 8.0f, 8.0f, 8.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 0.0f, 0.0f));
        head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(38, 55).addBox(-1.5f, -7.75f, -1.625f, 1.0f, 3.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(50, 30).addBox(-1.5f, -4.75f, -1.625f, 1.0f, 6.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-3.0f, -5.5f, -0.5f, -1.309f, 0.0f, 0.0f));
        head.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(44, 55).addBox(0.5f, -7.75f, -1.625f, 1.0f, 3.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(4, 52).addBox(0.5f, -4.75f, -1.625f, 1.0f, 6.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(3.0f, -5.5f, -0.5f, -1.309f, 0.0f, 0.0f));
        head.addOrReplaceChild("Head_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5f, -0.5f, -1.5f, 1.0f, 1.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(20, 16).addBox(-0.5f, -2.875f, 1.5f, 1.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(54, 1).addBox(-0.5f, -2.875f, -1.5f, 2.0f, 2.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-4.125f, -0.75f, -2.25f, 0.0f, -0.3927f, 0.0f));
        head.addOrReplaceChild("Head_r4", CubeListBuilder.create().texOffs(0, 31).addBox(-0.5f, -1.5f, 1.5f, 1.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(20, 54).addBox(-1.5f, -1.5f, -1.5f, 2.0f, 2.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(0, 4).addBox(-0.5f, 0.875f, -1.5f, 1.0f, 1.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(4.125f, -2.125f, -2.25f, 0.0f, 0.3927f, 0.0f));
        head.addOrReplaceChild("Head_r5", CubeListBuilder.create().texOffs(0, 16).addBox(-0.5f, -2.0f, -0.5f, 1.0f, 3.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(24, 0).addBox(-6.25f, -2.0f, -0.5f, 1.0f, 3.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(2.875f, -8.125f, -3.875f, 0.7854f, 0.0f, 0.0f));
        head.addOrReplaceChild("mask", CubeListBuilder.create().texOffs(30, 30).addBox(-1.0f, -8.0f, -5.0f, 2.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(50, 0).addBox(-4.0f, -3.0f, -5.0f, 8.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(20, 19).addBox(-3.0f, -2.0f, -5.0f, 6.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(5, 5).addBox(-2.5f, -1.0f, -5.0f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(5, 4).addBox(1.5f, -1.0f, -5.0f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(24, 7).addBox(-3.0f, -6.0f, -5.0f, 6.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(24, 20).addBox(-2.0f, -7.0f, -5.0f, 4.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(27, 0).addBox(-0.5f, -4.0f, -5.0f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(24, 22).addBox(2.375f, -4.0f, -5.0f, 2.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(24, 4).addBox(-4.375f, -4.0f, -5.0f, 2.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(5, 6).addBox(-3.375f, -5.0f, -5.0f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(0, 6).addBox(2.375f, -5.0f, -5.0f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(24, 21).addBox(-1.5f, -5.0f, -5.0f, 3.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 0.0f, 0.75f));
        PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 16).addBox(-4.0f, 0.0f, -2.0f, 8.0f, 11.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(24, 0).addBox(-1.25f, 17.6466f, 12.6581f, 2.0f, 2.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, -0.125f, 0.375f));
        tail.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(16, 23).addBox(-1.5f, 11.0f, 11.5f, 3.0f, 3.0f, 8.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.3927f, 0.0f, 0.0f));
        tail.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(24, 8).addBox(-1.5f, 5.5f, 8.0f, 3.0f, 3.0f, 8.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.7854f, 0.0f, 0.0f));
        PartDefinition wings = body.addOrReplaceChild("wings", CubeListBuilder.create(), PartPose.offset(0.0f, -0.125f, 0.375f));
        wings.addOrReplaceChild("wing_left", CubeListBuilder.create().texOffs(0, 4).addBox(1.0f, 2.0f, 2.0f, 1.0f, 2.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(56, 6).addBox(3.0f, 1.0f, 2.0f, 1.0f, 6.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(35, 0).addBox(2.0f, 1.0f, 2.0f, 1.0f, 5.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(54, 55).addBox(4.0f, 1.0f, 2.0f, 1.0f, 7.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(52, 55).addBox(5.0f, 0.0f, 2.0f, 1.0f, 9.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(32, 55).addBox(6.0f, 0.0f, 2.0f, 1.0f, 11.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(5, 1).addBox(5.0f, 11.0f, 2.0f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(36, 55).addBox(7.0f, -1.0f, 2.0f, 1.0f, 10.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(18, 54).addBox(8.0f, -4.0f, 2.0f, 1.0f, 14.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(16, 54).addBox(9.0f, -3.0f, 2.0f, 1.0f, 14.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(2, 52).addBox(10.0f, -2.0f, 2.0f, 1.0f, 15.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(5, 2).addBox(9.0f, 13.0f, 2.0f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 0.0f, 0.0f));
        wings.addOrReplaceChild("wing_right", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0f, 2.0f, 2.0f, 1.0f, 2.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(33, 0).addBox(-3.0f, 1.0f, 2.0f, 1.0f, 5.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(32, 34).addBox(-4.0f, 1.0f, 2.0f, 1.0f, 6.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(44, 9).addBox(-5.0f, 1.0f, 2.0f, 1.0f, 7.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(50, 55).addBox(-6.0f, 0.0f, 2.0f, 1.0f, 9.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(30, 55).addBox(-7.0f, 0.0f, 2.0f, 1.0f, 11.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(34, 55).addBox(-8.0f, -1.0f, 2.0f, 1.0f, 10.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(0, 52).addBox(-11.0f, -2.0f, 2.0f, 1.0f, 15.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(5, 0).addBox(-10.0f, 13.0f, 2.0f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(0, 2).addBox(-6.0f, 11.0f, 2.0f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(14, 54).addBox(-10.0f, -3.0f, 2.0f, 1.0f, 14.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(12, 52).addBox(-9.0f, -4.0f, 2.0f, 1.0f, 14.0f, 0.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 0.0f, 0.0f));
        partdefinition.addOrReplaceChild("leftArm", CubeListBuilder.create().texOffs(0, 31).addBox(-3.0f, 3.0f, -2.0f, 4.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(46, 9).addBox(-2.0f, -2.0f, -2.0f, 3.0f, 5.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(38, 9).addBox(-3.375f, 1.0f, -1.0f, 1.0f, 3.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offset(-5.0f, 2.0f, 0.0f)).addOrReplaceChild("claws_l", CubeListBuilder.create().texOffs(29, 21).addBox(-8.0f, -12.0f, -0.5f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(12, 31).addBox(-8.0f, -12.0f, 1.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(12, 33).addBox(-8.0f, -12.0f, -2.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offset(5.0f, 22.0f, 0.0f));
        partdefinition.addOrReplaceChild("rightArm", CubeListBuilder.create().texOffs(30, 19).addBox(-1.0f, 3.0f, -2.0f, 4.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(54, 39).addBox(2.375f, 1.0f, -1.0f, 1.0f, 3.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(44, 40).addBox(-1.0f, -2.0f, -2.0f, 3.0f, 5.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offset(5.0f, 2.0f, 0.0f)).addOrReplaceChild("claws_r", CubeListBuilder.create().texOffs(16, 36).addBox(7.0f, -12.0f, -2.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(16, 34).addBox(7.0f, -12.0f, -0.5f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(28, 34).addBox(7.0f, -12.0f, 1.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offset(-5.0f, 22.0f, 0.0f));
        PartDefinition leftLeg = partdefinition.addOrReplaceChild("leftLeg", CubeListBuilder.create().texOffs(44, 49).addBox(-2.0f, 0.0f, -2.0f, 4.0f, 2.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(28, 49).addBox(-2.0f, 11.213f, -2.1649f, 4.0f, 2.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offset(-2.0f, 11.0f, 0.0f));
        leftLeg.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(28, 40).addBox(-2.0f, 0.0f, -2.0f, 4.0f, 5.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 1.0f, 0.0f, -0.3927f, 0.0f, 0.0f));
        leftLeg.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(34, 30).addBox(-6.0f, 0.0f, -2.0f, 4.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(4.0f, 4.0f, -1.0f, 0.6545f, 0.0f, 0.0f));
        leftLeg.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(14, 44).addBox(-2.0f, -0.1371f, 3.7689f, 4.0f, 7.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 4.0f, -1.0f, -0.48f, 0.0f, 0.0f));
        PartDefinition rightLeg = partdefinition.addOrReplaceChild("rightLeg", CubeListBuilder.create().texOffs(46, 24).addBox(-2.0f, 0.0f, -2.0f, 4.0f, 2.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(46, 18).addBox(-2.0f, 11.213f, -2.1649f, 4.0f, 2.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offset(2.0f, 11.0f, 0.0f));
        rightLeg.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(38, 0).addBox(-2.0f, 0.0f, -2.0f, 4.0f, 5.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 1.0f, 0.0f, -0.3927f, 0.0f, 0.0f));
        rightLeg.addOrReplaceChild("bone6", CubeListBuilder.create().texOffs(16, 34).addBox(2.0f, 0.0f, -2.0f, 4.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-4.0f, 4.0f, -1.0f, 0.6545f, 0.0f, 0.0f));
        rightLeg.addOrReplaceChild("bone7", CubeListBuilder.create().texOffs(0, 42).addBox(-2.0f, -0.1371f, 3.7689f, 4.0f, 7.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 4.0f, -1.0f, -0.48f, 0.0f, 0.0f));
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

    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.head.yRot = netHeadYaw / 57.295776f;
        this.head.xRot = headPitch / 57.295776f;
        this.rightLeg.xRot = Mth.cos(limbSwing * 1.0f) * 1.0f * limbSwingAmount;
        this.rightArm.xRot = Mth.cos((limbSwing * 0.6662f) + 3.1415927f) * limbSwingAmount;
        this.leftArm.xRot = Mth.cos(limbSwing * 0.6662f) * limbSwingAmount;
        this.leftLeg.xRot = Mth.cos(limbSwing * 1.0f) * -1.0f * limbSwingAmount;
    }
}
