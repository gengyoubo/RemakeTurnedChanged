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

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/model/Modelhertx_model_s1.class */
public class Modelhertx_model_s1<T extends Entity> extends EntityModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(LatexMod.MODID, "modelhertx_model_s_1"), "main");
    public final ModelPart Head;
    public final ModelPart Body;
    public final ModelPart Tail;
    public final ModelPart LeftArm;
    public final ModelPart RightArm;
    public final ModelPart LeftLeg;
    public final ModelPart RightLeg;

    public Modelhertx_model_s1(ModelPart root) {
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
        PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(24, 0).addBox(-3.0f, -3.7f, -5.0f, 6.0f, 1.0f, 7.0f, new CubeDeformation(0.0f)).texOffs(56, 47).addBox(-2.0f, -4.8f, -3.0f, 4.0f, 1.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(18, 60).addBox(-2.0f, -8.8f, 2.0f, 4.0f, 4.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(42, 11).addBox(-2.0f, -4.8f, 3.0f, 4.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(14, 30).addBox(-3.0f, -4.8f, 2.0f, 6.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(24, 8).addBox(-3.0f, -2.8f, -2.9f, 6.0f, 1.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(24, 4).addBox(-1.0f, -2.55f, -3.15f, 2.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(36, 22).addBox(2.0f, -8.8f, 2.0f, 1.0f, 4.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(35, 30).addBox(-3.0f, -8.8f, 2.0f, 1.0f, 4.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(17, 22).addBox(-3.0f, -8.8f, -5.0f, 6.0f, 1.0f, 7.0f, new CubeDeformation(0.0f)).texOffs(0, 53).addBox(2.0f, -7.8f, -5.0f, 1.0f, 3.0f, 7.0f, new CubeDeformation(0.0f)).texOffs(25, 60).addBox(2.0f, -4.7f, -5.0f, 1.0f, 1.0f, 7.0f, new CubeDeformation(0.0f)).texOffs(50, 30).addBox(-3.0f, -7.8f, -5.0f, 1.0f, 3.0f, 7.0f, new CubeDeformation(0.0f)).texOffs(9, 60).addBox(-3.0f, -4.7f, -5.0f, 1.0f, 1.0f, 7.0f, new CubeDeformation(0.0f)).texOffs(59, 28).addBox(-3.25f, -4.5125f, -4.625f, 1.0f, 1.0f, 7.0f, new CubeDeformation(0.0f)).texOffs(58, 0).addBox(2.25f, -4.5125f, -4.625f, 1.0f, 1.0f, 7.0f, new CubeDeformation(0.0f)).texOffs(20, 0).addBox(-2.0f, -7.8f, -5.0f, 4.0f, 3.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(28, 41).addBox(-2.0f, -4.7f, -5.0f, 4.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(54, 54).addBox(-1.0f, -4.5125f, -5.1875f, 2.0f, 2.0f, 6.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 0.4f, -0.2f));
        Head.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0f, -8.3f, -1.5f, 0.4276f, 0.0f, 0.0f));
        Head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 33).addBox(-3.125f, -7.4142f, 9.2505f, 1.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(67, 16).addBox(-3.125f, -7.4142f, 4.2505f, 1.0f, 3.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(0, 0).addBox(2.125f, -7.4142f, 9.2505f, 1.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 63).addBox(2.125f, -7.4142f, 4.2505f, 1.0f, 3.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 0.0f, 1.125f, 0.4712f, 0.0f, 0.0f));
        partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0f, -1.8f, -2.0f, 8.0f, 12.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(0, 16).addBox(-3.0f, -0.05f, -3.0f, 6.0f, 6.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(48, 60).addBox(-4.25f, 3.2f, -3.5f, 2.0f, 3.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(34, 60).addBox(2.25f, 3.2f, -3.5f, 2.0f, 3.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(0, 28).addBox(-1.0f, 3.2f, -3.5f, 2.0f, 3.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(28, 39).addBox(-2.5f, 3.2f, 2.25f, 5.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(14, 33).addBox(-2.5f, 0.95f, 2.25f, 5.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(24, 8).addBox(2.8125f, 0.95f, 1.8125f, 1.0f, 4.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(18, 16).addBox(-3.8125f, 0.95f, 1.8125f, 1.0f, 4.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(18, 16).addBox(-4.5f, 4.2f, -2.5f, 9.0f, 1.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(53, 62).addBox(-3.5f, -2.05f, -2.5f, 1.0f, 6.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(41, 60).addBox(2.5f, -2.05f, -2.5f, 1.0f, 6.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition Tail = partdefinition.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offset(0.0f, 0.0f, 0.0f));
        Tail.addOrReplaceChild("cube_r2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.3927f, 0.0f, 0.0f));
        Tail.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 28).addBox(-1.3f, 4.2f, 7.0f, 3.0f, 3.0f, 8.0f, new CubeDeformation(0.0f)).texOffs(22, 30).addBox(-1.3f, 5.2f, 15.0f, 3.0f, 2.0f, 7.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.7854f, 0.0f, 0.0f));
        partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(0, 39).addBox(-3.0f, -3.8f, -2.0f, 4.0f, 8.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(54, 11).addBox(-3.0f, 4.2f, -2.0f, 4.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(45, 3).addBox(-3.25f, -4.05f, -2.5f, 4.0f, 3.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(16, 39).addBox(-3.0f, 10.2f, 1.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(12, 39).addBox(-3.0f, 10.2f, -2.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 39).addBox(-1.0f, 10.2f, -2.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(36, 27).addBox(-3.0f, 10.2f, -0.5f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offset(-5.0f, 2.0f, 0.0f));
        partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(41, 17).addBox(-0.75f, -4.05f, -2.5f, 4.0f, 3.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(38, 38).addBox(-1.0f, -3.8f, -2.0f, 4.0f, 8.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(44, 50).addBox(-1.0f, 4.2f, -2.0f, 4.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(35, 35).addBox(0.0f, 10.2f, -2.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(22, 35).addBox(2.0f, 10.2f, -2.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(25, 34).addBox(2.0f, 10.2f, -0.5f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(4, 33).addBox(2.0f, 10.2f, 1.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offset(5.0f, 2.0f, 0.0f));
        PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(66, 8).addBox(-2.0f, -1.8f, -2.0f, 4.0f, 2.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(0, 16).addBox(-1.625f, -1.8f, 1.75f, 2.0f, 4.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(54, 40).addBox(-2.0f, 10.0f, -2.9102f, 4.0f, 2.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offset(-2.0f, 12.0f, 0.0f));
        LeftLeg.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(67, 36).addBox(-2.0f, 4.3f, 3.0f, 4.0f, 6.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.3927f, 0.0f, 0.0f));
        LeftLeg.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(39, 26).addBox(-2.0f, 0.0f, -5.8f, 4.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.7854f, 0.0f, 0.0f));
        LeftLeg.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(28, 50).addBox(-2.0f, -0.6f, -2.2f, 4.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.3927f, 0.0f, 0.0f));
        PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(64, 53).addBox(-2.0f, -1.8f, -2.0f, 4.0f, 2.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(54, 21).addBox(-2.0f, 10.0f, -2.9102f, 4.0f, 2.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offset(2.0f, 12.0f, 0.0f));
        RightLeg.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(65, 65).addBox(-2.0f, 4.3f, 3.0f, 4.0f, 6.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.3927f, 0.0f, 0.0f));
        RightLeg.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(16, 39).addBox(-2.0f, 0.0f, -5.8f, 4.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.7854f, 0.0f, 0.0f));
        RightLeg.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(12, 50).addBox(-2.0f, -0.6f, -2.2f, 4.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.3927f, 0.0f, 0.0f));
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
