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
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import org.jetbrains.annotations.NotNull;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/model/Modelnxt_hertx_model.class */
public class Modelnxt_hertx_model<T extends Entity> extends EntityModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(LatexMod.MODID, "modelnxt_hertx_model"), "main");
    public final ModelPart Head;
    public final ModelPart Body;
    public final ModelPart Tail;
    public final ModelPart LeftArm;
    public final ModelPart RightArm;
    public final ModelPart LeftLeg;
    public final ModelPart RightLeg;

    public Modelnxt_hertx_model(ModelPart root) {
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
        PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(46, 33).addBox(-2.0f, -3.4f, -3.2f, 4.0f, 1.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(58, 12).addBox(-2.0f, -7.4f, 1.8f, 4.0f, 4.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(24, 18).addBox(-2.0f, -3.4f, 2.8f, 4.0f, 3.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(62, 64).addBox(-3.0f, -3.4f, 1.8f, 6.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(22, 11).addBox(-3.0f, -1.4f, -3.1f, 6.0f, 1.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(20, 14).addBox(-1.5f, -0.4f, -2.85f, 3.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(16, 33).addBox(-3.5f, -6.4f, 1.8f, 1.0f, 4.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(31, 0).addBox(2.5f, -6.4f, 1.8f, 1.0f, 4.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(30, 39).addBox(2.0f, -7.4f, 1.8f, 1.0f, 4.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 45).addBox(-3.0f, -7.4f, 1.8f, 1.0f, 4.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(31, 0).addBox(-3.0f, -7.4f, -3.2f, 6.0f, 1.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(10, 50).addBox(2.0f, -6.4f, -4.2f, 1.0f, 3.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(34, 48).addBox(-3.0f, -6.4f, -4.2f, 1.0f, 3.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(0, 7).addBox(-2.0f, -6.4f, -4.2f, 4.0f, 3.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, -2.0f, 0.0f));
        Head.addOrReplaceChild("Jaw", CubeListBuilder.create().texOffs(30, 57).addBox(2.0f, -0.3f, -6.2f, 1.0f, 1.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(31, 6).addBox(-2.0f, -0.3f, -6.2f, 4.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(16, 33).addBox(-3.0f, 0.7f, -5.2f, 6.0f, 1.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(0, 56).addBox(-3.0f, -0.3f, -6.2f, 1.0f, 1.0f, 6.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, -3.0f, 2.0f)).addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(33, 33).addBox(-3.0f, -18.0413f, -22.5668f, 6.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(36, 46).addBox(-3.0f, -18.0413f, -22.981f, 6.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 29.0f, -2.0f, -0.7854f, 0.0f, 0.0f));
        Head.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(38, 59).addBox(-3.0f, -25.8801f, 19.9404f, 6.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(58, 46).addBox(-3.0f, -25.8801f, 20.3546f, 6.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 26.0f, 0.0f, 0.7854f, 0.0f, 0.0f));
        Head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(33, 35).addBox(-2.9f, -8.7665f, 9.6128f, 1.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(9, 59).addBox(-2.9f, -8.7665f, 4.6128f, 1.0f, 3.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(12, 30).addBox(1.9f, -8.7665f, 9.6128f, 1.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 30).addBox(-3.4f, -7.4142f, 8.2505f, 1.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 14).addBox(2.4f, -7.4142f, 8.2505f, 1.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(58, 48).addBox(1.9f, -8.7665f, 4.6128f, 1.0f, 3.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(0, 63).addBox(-3.4f, -7.4142f, 4.2505f, 1.0f, 3.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(0, 0).addBox(2.4f, -7.4142f, 4.2505f, 1.0f, 3.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 2.4f, -0.2f, 0.2618f, 0.0f, 0.0f));
        partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 14).addBox(-4.0f, -0.8f, -2.0f, 8.0f, 12.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(59, 30).addBox(-3.0f, 0.2f, -3.0f, 6.0f, 5.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(48, 0).addBox(-4.0f, 0.2f, 2.0f, 8.0f, 4.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(6, 0).addBox(3.0f, 0.2f, -3.0f, 1.0f, 3.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 0).addBox(-4.0f, 0.2f, -3.0f, 1.0f, 3.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(50, 61).addBox(3.0f, -1.8f, -2.5f, 1.0f, 2.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(21, 61).addBox(-4.0f, -1.8f, -2.5f, 1.0f, 2.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(24, 39).addBox(-1.0f, 1.2f, -3.25f, 2.0f, 3.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 56).addBox(-2.5f, 5.2f, -3.0f, 2.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(42, 18).addBox(0.5f, 5.2f, -3.0f, 2.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, -2.0f, 0.0f));
        PartDefinition Tail = partdefinition.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offset(0.0f, -2.0f, 0.0f));
        Tail.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(17, 0).addBox(-1.3f, 15.4952f, 16.7033f, 3.0f, 3.0f, 8.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 2.0f, 0.0f, -0.0873f, 0.0f, 0.0f));
        Tail.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(16, 22).addBox(-1.3f, 9.6164f, 13.4918f, 3.0f, 3.0f, 8.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 2.0f, 0.0f, -0.3927f, 0.0f, 0.0f));
        Tail.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-1.3f, 3.4929f, 6.2929f, 3.0f, 3.0f, 11.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 2.0f, 0.0f, -0.7854f, 0.0f, 0.0f));
        partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(30, 18).addBox(-3.0f, -2.8f, -2.0f, 4.0f, 8.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(20, 55).addBox(-3.0f, 5.2f, -2.0f, 4.0f, 2.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(17, 0).addBox(-3.25f, 5.2f, -1.0f, 1.0f, 2.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(46, 16).addBox(-3.0f, 7.2f, -2.0f, 4.0f, 4.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(18, 54).addBox(-3.0f, 11.2f, 1.0f, 2.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(52, 5).addBox(-3.0f, 11.2f, -2.0f, 2.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(6, 42).addBox(-1.0f, 11.2f, -2.0f, 1.0f, 1.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(18, 52).addBox(-3.0f, 11.2f, -0.5f, 2.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offset(-5.0f, 0.0f, 0.0f));
        partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(0, 30).addBox(-1.0f, -4.8f, -2.0f, 4.0f, 8.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(54, 24).addBox(-1.0f, 3.2f, -2.0f, 4.0f, 2.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(24, 46).addBox(-1.0f, 5.2f, -2.0f, 4.0f, 4.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(0, 42).addBox(0.0f, 9.2f, -2.0f, 1.0f, 1.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(18, 50).addBox(1.0f, 9.2f, -2.0f, 2.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(42, 48).addBox(1.0f, 9.2f, -0.5f, 2.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(28, 44).addBox(1.0f, 9.2f, 1.0f, 2.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(17, 4).addBox(2.25f, 3.2f, -1.0f, 1.0f, 2.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offset(5.0f, 2.0f, 0.0f));
        PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(44, 53).addBox(-2.0f, -0.8f, -2.0f, 4.0f, 2.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(45, 45).addBox(-2.0f, 11.0f, -3.4102f, 4.0f, 3.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offset(-2.0f, 10.0f, 0.0f));
        LeftLeg.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(57, 57).addBox(-2.0f, 3.3f, 3.0f, 4.0f, 4.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(62, 36).addBox(-2.0f, 7.3f, 3.0f, 4.0f, 1.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(41, 61).addBox(-2.0f, 8.3f, 3.0f, 4.0f, 2.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 2.0f, 0.0f, -0.3927f, 0.0f, 0.0f));
        LeftLeg.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(12, 39).addBox(-2.0f, -0.5848f, -5.0633f, 4.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 2.0f, 0.0f, 0.7854f, 0.0f, 0.0f));
        LeftLeg.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 46).addBox(-2.0f, -1.5045f, -2.4584f, 4.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 2.0f, 0.0f, -0.3927f, 0.0f, 0.0f));
        PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(50, 39).addBox(-2.0f, -0.8f, -2.0f, 4.0f, 2.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(41, 25).addBox(-2.0f, 11.0f, -3.4102f, 4.0f, 3.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offset(2.0f, 10.0f, 0.0f));
        RightLeg.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(56, 5).addBox(-2.0f, 3.3f, 3.0f, 4.0f, 4.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(63, 42).addBox(-2.0f, 7.3f, 3.0f, 4.0f, 1.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(62, 19).addBox(-2.0f, 8.3f, 3.0f, 4.0f, 2.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 2.0f, 0.0f, -0.3927f, 0.0f, 0.0f));
        RightLeg.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(34, 35).addBox(-2.0f, -0.5848f, -5.0633f, 4.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 2.0f, 0.0f, 0.7854f, 0.0f, 0.0f));
        RightLeg.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(40, 6).addBox(-2.0f, -1.5045f, -2.4584f, 4.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 2.0f, 0.0f, -0.3927f, 0.0f, 0.0f));
        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    public void renderToBuffer(@NotNull PoseStack poseStack, @NotNull VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        this.Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.Tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setupAnim(@NotNull T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.RightArm.xRot = Mth.cos((limbSwing * 0.6662f) + 3.1415927f) * limbSwingAmount;
        this.LeftLeg.xRot = Mth.cos(limbSwing) * -1.0f * limbSwingAmount;
        this.Head.yRot = netHeadYaw / 57.295776f;
        this.Head.xRot = headPitch / 57.295776f;
        this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662f) * limbSwingAmount;
        this.RightLeg.xRot = Mth.cos(limbSwing) * 1.0f * limbSwingAmount;
    }
}
