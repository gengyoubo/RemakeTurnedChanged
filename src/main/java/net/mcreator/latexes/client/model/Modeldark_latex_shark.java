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
import org.jetbrains.annotations.NotNull;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/model/Modeldark_latex_shark.class */
public class Modeldark_latex_shark<T extends Entity> extends EntityModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(LatexMod.MODID, "modeldark_latex_shark"), "main");
    public final ModelPart head;
    public final ModelPart body;
    public final ModelPart leftArm;
    public final ModelPart rightArm;
    public final ModelPart leftLeg;
    public final ModelPart rightLeg;

    public Modeldark_latex_shark(ModelPart root) {
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
        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 16).addBox(-4.0f, -8.0f, -4.0f, 8.0f, 8.0f, 8.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 0.0f, 0.0f));
        head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(16, 49).addBox(-4.8f, -5.4f, 8.0f, 1.0f, 2.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(12, 47).addBox(2.8f, -5.4f, 8.0f, 1.0f, 2.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(16, 47).addBox(-4.8f, -5.4f, 2.0f, 1.0f, 3.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(50, 45).addBox(2.8f, -5.4f, 2.0f, 1.0f, 3.0f, 6.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.5f, 0.0f, 0.0f, 0.3927f, 0.0f, 0.0f));
        head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 0).addBox(0.0f, -7.65f, 2.25f, 1.0f, 1.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(36, 35).addBox(0.0f, -5.65f, 9.25f, 1.0f, 2.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(24, 51).addBox(0.0f, -6.65f, 3.25f, 1.0f, 3.0f, 6.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-0.5f, 0.0f, -2.5f, 0.3927f, 0.0f, 0.0f));
        head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 22).addBox(0.0f, -5.9f, 8.875f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-0.5f, 0.246f, 0.1726f, 0.3927f, 0.0f, 0.0f));
        head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(4, 22).addBox(-5.1f, -2.1f, 2.1f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(52, 54).addBox(-5.1f, -2.1f, -1.9f, 2.0f, 1.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.3927f, 0.0f));
        head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(24, 22).addBox(4.1f, -2.1f, 2.1f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(52, 17).addBox(3.1f, -2.1f, -1.9f, 2.0f, 1.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.3927f, 0.0f));
        head.addOrReplaceChild("mask", CubeListBuilder.create().texOffs(21, 12).addBox(-5.0f, -4.0f, -4.1f, 2.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(0, 11).addBox(-3.0f, -3.0f, -4.1f, 6.0f, 2.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(10, 6).addBox(-2.0f, -1.0f, -4.1f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(10, 7).addBox(1.0f, -1.0f, -4.1f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(29, 12).addBox(3.0f, -4.0f, -4.1f, 2.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(0, 7).addBox(3.0f, -5.0f, -4.1f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(21, 9).addBox(-2.0f, -5.0f, -4.1f, 4.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(21, 8).addBox(-2.0f, -7.0f, -4.1f, 4.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(21, 11).addBox(-3.0f, -6.0f, -4.1f, 6.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(25, 12).addBox(-1.0f, -8.0f, -4.1f, 2.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(3, 0).addBox(-0.5f, -9.0f, -4.1f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(27, 3).addBox(-1.0f, -4.0f, -4.1f, 2.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(0, 6).addBox(-4.0f, -5.0f, -4.1f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 32).addBox(-4.0f, 0.0f, -2.0f, 8.0f, 11.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 0.0f, 0.0f));
        body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 56).addBox(0.0f, -0.5f, 1.875f, 1.0f, 6.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(21, 0).addBox(0.0f, 3.5f, 5.875f, 1.0f, 3.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 0).addBox(0.0f, 1.5f, 4.875f, 1.0f, 4.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 16).addBox(0.0f, 0.5f, 2.875f, 1.0f, 4.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-0.5f, 0.0f, 0.0f, -0.1309f, 0.0f, 0.0f));
        PartDefinition Tail = body.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offset(0.0f, 0.0f, 0.0f));
        Tail.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(53, 0).addBox(1.149f, -0.793f, 6.662f, 4.0f, 1.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(21, 0).addBox(0.149f, -0.793f, -3.338f, 5.0f, 1.0f, 10.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 17.3374f, 18.8717f, -0.1745f, 0.5672f, -1.5708f));
        Tail.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(4, 16).addBox(-4.149f, -0.793f, 3.662f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(24, 11).addBox(-4.149f, -0.793f, -6.338f, 3.0f, 1.0f, 10.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 17.3374f, 18.8717f, -0.1745f, -0.5672f, -1.5708f));
        Tail.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(24, 24).addBox(-2.5f, 7.25f, 3.75f, 6.0f, 3.0f, 8.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-0.5f, 6.5063f, 7.4678f, -0.1745f, 0.0f, 0.0f));
        Tail.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(21, 0).addBox(0.0f, 1.25f, 10.75f, 1.0f, 4.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-0.5f, 0.0f, 0.0f, -0.7854f, 0.0f, 0.0f));
        Tail.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5f, 7.25f, 3.75f, 4.0f, 3.0f, 13.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-0.5f, 0.0f, 0.0f, -0.5236f, 0.0f, 0.0f));
        partdefinition.addOrReplaceChild("leftArm", CubeListBuilder.create().texOffs(40, 35).addBox(-3.0f, -2.0f, -2.0f, 4.0f, 12.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(28, 22).addBox(-3.0f, 10.0f, 1.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(30, 19).addBox(-3.0f, 10.0f, -2.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offset(-5.0f, 2.0f, 0.0f)).addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(30, 16).addBox(-5.5f, -2.7f, -1.0f, 1.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(7, 0).addBox(-5.5f, -0.7f, -1.0f, 2.0f, 4.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5672f));
        partdefinition.addOrReplaceChild("rightArm", CubeListBuilder.create().texOffs(24, 35).addBox(-1.0f, -2.0f, -2.0f, 4.0f, 12.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(20, 32).addBox(2.0f, 10.0f, 1.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 32).addBox(2.0f, 10.0f, -2.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offset(5.0f, 2.0f, 0.0f)).addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(27, 0).addBox(4.5f, -2.7f, -1.0f, 1.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(24, 16).addBox(3.5f, -0.7f, -1.0f, 2.0f, 4.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5672f));
        PartDefinition leftLeg = partdefinition.addOrReplaceChild("leftLeg", CubeListBuilder.create().texOffs(0, 47).addBox(-2.0f, -1.0f, -2.0f, 4.0f, 5.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offset(-2.0f, 12.0f, 0.0f));
        leftLeg.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(52, 10).addBox(-2.0f, 0.0f, 0.0f, 4.0f, 3.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-0.03f, 9.8745f, 0.96f, -1.5708f, 0.0f, 0.0f));
        leftLeg.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(52, 31).addBox(-2.0f, -1.0f, -1.0f, 4.0f, 5.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-0.03f, 7.4835f, 1.8083f, -0.6545f, 0.0f, 0.0f));
        leftLeg.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(40, 11).addBox(-2.0f, -2.0f, -2.0f, 4.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-0.03f, 4.9635f, 0.2358f, 0.48f, 0.0f, 0.0f));
        PartDefinition rightLeg = partdefinition.addOrReplaceChild("rightLeg", CubeListBuilder.create().texOffs(44, 22).addBox(-2.0f, -1.0f, -2.0f, 4.0f, 5.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offset(2.0f, 12.0f, 0.0f));
        rightLeg.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 6).addBox(-2.0f, 0.0f, 0.0f, 4.0f, 3.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.03f, 9.8745f, 0.96f, -1.5708f, 0.0f, 0.0f));
        rightLeg.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(38, 51).addBox(-2.0f, -1.0f, -1.0f, 4.0f, 5.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.03f, 7.4835f, 1.8083f, -0.6545f, 0.0f, 0.0f));
        rightLeg.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(41, 0).addBox(-2.0f, -2.0f, -2.0f, 4.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.03f, 4.9635f, 0.2358f, 0.48f, 0.0f, 0.0f));
        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    public void renderToBuffer(@NotNull PoseStack poseStack, @NotNull VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        this.head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.leftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.rightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.leftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.rightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setupAnim(@NotNull T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.head.yRot = netHeadYaw / 57.295776f;
        this.head.xRot = headPitch / 57.295776f;
        this.rightLeg.xRot = Mth.cos(limbSwing * 1.0f) * 1.0f * limbSwingAmount;
        this.rightArm.xRot = Mth.cos((limbSwing * 0.6662f) + 3.1415927f) * limbSwingAmount;
        this.leftArm.xRot = Mth.cos(limbSwing * 0.6662f) * limbSwingAmount;
        this.leftLeg.xRot = Mth.cos(limbSwing * 1.0f) * -1.0f * limbSwingAmount;
    }
}
