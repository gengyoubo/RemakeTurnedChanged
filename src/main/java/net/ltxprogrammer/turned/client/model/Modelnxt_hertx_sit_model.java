package net.ltxprogrammer.turned.client.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.ltxprogrammer.turned.LatexMod;
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
import net.minecraft.world.entity.Entity;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/model/Modelnxt_hertx_sit_model.class */
public class Modelnxt_hertx_sit_model<T extends Entity> extends EntityModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(LatexMod.MODID, "modelnxt_hertx_sit_model"), "main");
    public final ModelPart Head;
    public final ModelPart Body;
    public final ModelPart Tail;
    public final ModelPart LeftArm;
    public final ModelPart RightArm;
    public final ModelPart LeftLeg;
    public final ModelPart RightLeg;

    public Modelnxt_hertx_sit_model(ModelPart root) {
        this.Head = root.getChild("Head");
        this.Body = root.getChild("Body");
        this.Tail = root.getChild("Tail");
        this.LeftArm = root.getChild("LeftArm");
        this.RightArm = root.getChild("RightArm");
        this.LeftLeg = root.getChild("LeftLeg");
        this.RightLeg = root.getChild("RightLeg");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(46, 33).addBox(-2.0f, -2.65f, -3.2f, 4.0f, 1.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(58, 12).addBox(-2.0f, -6.65f, 1.8f, 4.0f, 4.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(24, 18).addBox(-2.0f, -2.65f, 2.8f, 4.0f, 3.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(62, 64).addBox(-3.0f, -2.65f, 1.8f, 6.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(22, 11).addBox(-3.0f, -0.65f, -3.1f, 6.0f, 1.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(20, 14).addBox(-1.5f, 0.35f, -2.85f, 3.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(16, 33).addBox(-3.5f, -5.65f, 1.8f, 1.0f, 4.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(31, 0).addBox(2.5f, -5.65f, 1.8f, 1.0f, 4.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(30, 39).addBox(2.0f, -6.65f, 1.8f, 1.0f, 4.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 45).addBox(-3.0f, -6.65f, 1.8f, 1.0f, 4.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(31, 0).addBox(-3.0f, -6.65f, -3.2f, 6.0f, 1.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(10, 50).addBox(2.0f, -5.65f, -4.2f, 1.0f, 3.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(34, 48).addBox(-3.0f, -5.65f, -4.2f, 1.0f, 3.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(0, 7).addBox(-2.0f, -5.65f, -4.2f, 4.0f, 3.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 9.0f, -1.0f));
        Head.addOrReplaceChild("Jaw", CubeListBuilder.create().texOffs(30, 57).addBox(2.0f, 11.45f, -6.2f, 1.0f, 1.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(31, 6).addBox(-2.0f, 11.45f, -6.2f, 4.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(16, 33).addBox(-3.0f, 12.45f, -5.2f, 6.0f, 1.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(0, 56).addBox(-3.0f, 11.45f, -6.2f, 1.0f, 1.0f, 6.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, -14.0f, 2.0f)).addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(33, 33).addBox(-3.0f, -9.7328f, -14.2583f, 6.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(36, 46).addBox(-3.0f, -9.7328f, -14.6725f, 6.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 29.0f, -2.0f, -0.7854f, 0.0f, 0.0f));
        Head.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(38, 59).addBox(-3.0f, -17.5716f, 11.6319f, 6.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(58, 46).addBox(-3.0f, -17.5716f, 12.0461f, 6.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 15.0f, 0.0f, 0.7854f, 0.0f, 0.0f));
        Head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(33, 35).addBox(-2.9f, 2.5831f, 6.5717f, 1.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(9, 59).addBox(-2.9f, 2.5831f, 1.5717f, 1.0f, 3.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(12, 30).addBox(1.9f, 2.5831f, 6.5717f, 1.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 30).addBox(-3.4f, 3.9354f, 5.2094f, 1.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 14).addBox(2.4f, 3.9354f, 5.2094f, 1.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(58, 48).addBox(1.9f, 2.5831f, 1.5717f, 1.0f, 3.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(0, 63).addBox(-3.4f, 3.9354f, 1.2094f, 1.0f, 3.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(0, 0).addBox(2.4f, 3.9354f, 1.2094f, 1.0f, 3.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, -8.6f, -0.2f, 0.2618f, 0.0f, 0.0f));
        partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 14).addBox(-4.0f, -0.0614f, -2.1302f, 8.0f, 12.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(59, 30).addBox(-3.0f, 0.9386f, -3.1302f, 6.0f, 5.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(48, 0).addBox(-4.0f, 0.9386f, 1.8698f, 8.0f, 4.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(6, 0).addBox(3.0f, 0.9386f, -3.1302f, 1.0f, 3.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 0).addBox(-4.0f, 0.9386f, -3.1302f, 1.0f, 3.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(50, 61).addBox(3.0f, -1.0614f, -2.6302f, 1.0f, 2.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(21, 61).addBox(-4.0f, -1.0614f, -2.6302f, 1.0f, 2.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(24, 39).addBox(-1.0f, 1.9386f, -3.3802f, 2.0f, 3.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 56).addBox(-2.5f, 5.9386f, -3.1302f, 2.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(42, 18).addBox(0.5f, 5.9386f, -3.1302f, 2.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 9.0f, -1.0f, 0.1745f, 0.0f, 0.0f));
        PartDefinition Tail = partdefinition.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0f, 19.625f, 0.0f, 0.5236f, 0.0f, 0.0f));
        Tail.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(17, 0).addBox(-1.3f, 26.1445f, 11.7379f, 3.0f, 3.0f, 8.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, -17.5263f, 5.5f, -0.0873f, 0.0f, 0.0f));
        Tail.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(16, 22).addBox(-1.3f, 21.2659f, 11.9581f, 3.0f, 3.0f, 8.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, -17.5263f, 5.5f, -0.3927f, 0.0f, 0.0f));
        Tail.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-1.3f, 14.8425f, 9.334f, 3.0f, 3.0f, 11.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, -17.5263f, 5.5f, -0.7854f, 0.0f, 0.0f));
        partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(30, 18).addBox(-3.0f, -2.2697f, -2.8839f, 4.0f, 8.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(20, 55).addBox(-3.0f, 5.7303f, -2.8839f, 4.0f, 2.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(17, 0).addBox(-3.25f, 5.7303f, -1.8839f, 1.0f, 2.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(46, 16).addBox(-3.0f, 7.7303f, -2.8839f, 4.0f, 4.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(18, 54).addBox(-3.0f, 11.7303f, 0.1161f, 2.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(52, 5).addBox(-3.0f, 11.7303f, -1.3839f, 2.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(6, 42).addBox(0.0f, 11.7303f, -2.8839f, 1.0f, 1.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(18, 52).addBox(-3.0f, 11.7303f, -2.8839f, 2.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-5.0f, 12.0f, -1.0f, -0.7854f, 0.0f, 0.0f));
        partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(0, 30).addBox(-1.0f, -2.2697f, -2.4697f, 4.0f, 8.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(54, 24).addBox(-1.0f, 5.7303f, -2.4697f, 4.0f, 2.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(24, 46).addBox(-1.0f, 7.7303f, -2.4697f, 4.0f, 4.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(0, 42).addBox(-1.0f, 11.7303f, -2.4697f, 1.0f, 1.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(18, 50).addBox(1.0f, 11.7303f, -2.4697f, 2.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(42, 48).addBox(1.0f, 11.7303f, -0.9697f, 2.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(28, 44).addBox(1.0f, 11.7303f, 0.5303f, 2.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(17, 4).addBox(2.25f, 5.7303f, -1.4697f, 1.0f, 2.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(5.0f, 12.0f, -1.0f, -0.7854f, 0.0f, 0.0f));
        PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(44, 53).addBox(-1.75f, -0.8f, -2.0f, 4.0f, 2.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-2.0f, 22.0f, 1.0f, -1.8326f, 0.0f, -1.5708f));
        LeftLeg.addOrReplaceChild("LeftLeg_r1", CubeListBuilder.create().texOffs(45, 45).addBox(-15.75f, -3.0f, -3.4102f, 4.0f, 3.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(14.0f, 13.7095f, 3.6236f, 1.5708f, 0.0f, 0.0f));
        LeftLeg.addOrReplaceChild("cube_r4", CubeListBuilder.create(), PartPose.offsetAndRotation(12.0f, 2.0f, 0.0f, -0.3927f, 0.0f, 0.0f)).addOrReplaceChild("cube_r4_r1", CubeListBuilder.create().texOffs(41, 61).addBox(-15.75f, -3.7f, 3.0f, 4.0f, 2.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(62, 36).addBox(-15.75f, -4.7f, 3.0f, 4.0f, 1.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(57, 57).addBox(-15.75f, -8.7f, 3.0f, 4.0f, 4.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(2.0f, 13.9626f, 8.9204f, 1.5708f, 0.0f, 0.0f));
        LeftLeg.addOrReplaceChild("cube_r5", CubeListBuilder.create(), PartPose.offsetAndRotation(12.0f, 2.0f, 0.0f, 0.7854f, 0.0f, 0.0f)).addOrReplaceChild("cube_r5_r1", CubeListBuilder.create().texOffs(12, 39).addBox(-15.75f, 4.4152f, -5.0633f, 4.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(2.0f, -0.0927f, 1.6082f, -0.7854f, 0.0f, 0.0f));
        LeftLeg.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 46).addBox(-13.75f, -1.5045f, -2.4584f, 4.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(12.0f, 2.0f, 0.0f, -0.3927f, 0.0f, 0.0f));
        PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(44, 53).mirror().addBox(-2.25f, -0.8f, -2.0f, 4.0f, 2.0f, 4.0f, new CubeDeformation(0.0f)).mirror(false), PartPose.offsetAndRotation(2.0f, 22.0f, 1.0f, -1.8326f, 0.0f, 1.5708f));
        RightLeg.addOrReplaceChild("LeftLeg_r2", CubeListBuilder.create().texOffs(45, 45).mirror().addBox(11.75f, -3.0f, -3.4102f, 4.0f, 3.0f, 5.0f, new CubeDeformation(0.0f)).mirror(false), PartPose.offsetAndRotation(-14.0f, 13.7095f, 3.6236f, 1.5708f, 0.0f, 0.0f));
        RightLeg.addOrReplaceChild("cube_r7", CubeListBuilder.create(), PartPose.offsetAndRotation(-12.0f, 2.0f, 0.0f, -0.3927f, 0.0f, 0.0f)).addOrReplaceChild("cube_r5_r2", CubeListBuilder.create().texOffs(41, 61).mirror().addBox(11.75f, -3.7f, 3.0f, 4.0f, 2.0f, 3.0f, new CubeDeformation(0.0f)).mirror(false).texOffs(62, 36).mirror().addBox(11.75f, -4.7f, 3.0f, 4.0f, 1.0f, 3.0f, new CubeDeformation(0.0f)).mirror(false).texOffs(57, 57).mirror().addBox(11.75f, -8.7f, 3.0f, 4.0f, 4.0f, 3.0f, new CubeDeformation(0.0f)).mirror(false), PartPose.offsetAndRotation(-2.0f, 13.9626f, 8.9204f, 1.5708f, 0.0f, 0.0f));
        RightLeg.addOrReplaceChild("cube_r8", CubeListBuilder.create(), PartPose.offsetAndRotation(-12.0f, 2.0f, 0.0f, 0.7854f, 0.0f, 0.0f)).addOrReplaceChild("cube_r6_r1", CubeListBuilder.create().texOffs(12, 39).mirror().addBox(11.75f, 4.4152f, -5.0633f, 4.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)).mirror(false), PartPose.offsetAndRotation(-2.0f, -0.0927f, 1.6082f, -0.7854f, 0.0f, 0.0f));
        RightLeg.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 46).mirror().addBox(9.75f, -1.5045f, -2.4584f, 4.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)).mirror(false), PartPose.offsetAndRotation(-12.0f, 2.0f, 0.0f, -0.3927f, 0.0f, 0.0f));
        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        this.Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.Tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.Head.yRot = netHeadYaw / 57.295776f;
        this.Head.xRot = headPitch / 57.295776f;
    }
}
