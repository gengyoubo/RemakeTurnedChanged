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
import net.minecraft.world.entity.Entity;
import org.jetbrains.annotations.NotNull;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/model/Modelhertx_sit_model_f.class */
public class Modelhertx_sit_model_f<T extends Entity> extends EntityModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(LatexMod.MODID, "modelhertx_sit_model_f"), "main");
    public final ModelPart Head;
    public final ModelPart Body;
    public final ModelPart Tail;
    public final ModelPart LeftArm;
    public final ModelPart RightArm;
    public final ModelPart LeftLeg;
    public final ModelPart RightLeg;

    public Modelhertx_sit_model_f(ModelPart root) {
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
        partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(24, 16).addBox(-3.0f, -2.3f, -4.2f, 6.0f, 1.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(19, 7).addBox(-2.0f, -3.4f, -3.2f, 4.0f, 1.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(61, 47).addBox(-2.0f, -7.4f, 1.8f, 4.0f, 4.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(20, 16).addBox(-2.0f, -3.4f, 2.8f, 4.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(37, 0).addBox(-3.0f, -3.4f, 1.8f, 6.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(24, 24).addBox(-3.0f, -1.4f, -3.1f, 6.0f, 1.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(7, 0).addBox(2.0f, -7.4f, 1.8f, 1.0f, 4.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 0).addBox(-3.0f, -7.4f, 1.8f, 1.0f, 4.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(19, 0).addBox(-3.0f, -7.4f, -4.2f, 6.0f, 1.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(24, 57).addBox(2.0f, -6.4f, -4.2f, 1.0f, 3.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(0, 60).addBox(2.0f, -3.3f, -4.2f, 1.0f, 1.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(55, 55).addBox(-3.0f, -6.4f, -4.2f, 1.0f, 3.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(59, 40).addBox(-3.0f, -3.3f, -4.2f, 1.0f, 1.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(0, 8).addBox(-2.0f, -6.4f, -4.2f, 4.0f, 3.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(12, 32).addBox(-2.0f, -3.3f, -4.2f, 4.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 9.0f, 4.0f)).addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(24, 24).addBox(-3.0625f, 1.2791f, 7.9211f, 1.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 16).addBox(-3.25f, 2.5749f, 6.4445f, 1.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(54, 23).addBox(-3.0625f, 1.2791f, 1.9211f, 1.0f, 3.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(0, 0).addBox(-3.25f, 2.5749f, 1.4445f, 1.0f, 3.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(19, 7).addBox(2.0625f, 1.2791f, 7.9211f, 1.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(19, 2).addBox(2.25f, 2.6072f, 6.5652f, 1.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(35, 51).addBox(2.0625f, 1.2791f, 1.9211f, 1.0f, 3.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(62, 18).addBox(2.25f, 2.6072f, 1.5652f, 1.0f, 3.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, -7.6f, -0.2f, 0.2618f, 0.0f, 0.0f));
        partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 16).addBox(-4.0f, -0.8761f, -1.6173f, 8.0f, 12.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(32, 14).addBox(-3.0f, 4.9364f, -2.1173f, 6.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(19, 0).addBox(-1.0f, -0.0636f, -2.1173f, 2.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 9.0f, 4.0f, -0.3927f, 0.0f, 0.0f)).addOrReplaceChild("bone", CubeListBuilder.create().texOffs(30, 31).addBox(-4.0f, 2.7268f, 6.267f, 8.0f, 4.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, -5.691f, -5.0615f, -0.637f, 0.0f, 0.0f));
        PartDefinition Tail = partdefinition.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0f, 15.0f, 2.0f, 1.0036f, 0.0f, 0.0f));
        Tail.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(17, 31).addBox(-1.3f, 18.675f, 10.4769f, 3.0f, 3.0f, 7.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, -13.0f, 0.0f, -0.3927f, 0.0f, 0.0f));
        Tail.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-1.3f, 12.9867f, 5.0521f, 3.0f, 3.0f, 13.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, -13.0f, 0.0f, -0.7854f, 0.0f, 0.0f));
        partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(10, 55).addBox(-2.0f, -1.8f, -2.0f, 3.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(33, 38).addBox(-3.0f, 5.2f, -2.0f, 4.0f, 8.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offset(-5.0f, 10.0f, 4.0f));
        partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(0, 48).addBox(-1.0f, -1.8f, -2.0f, 3.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(0, 32).addBox(-1.0f, 5.2f, -2.0f, 4.0f, 8.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offset(5.0f, 10.0f, 4.0f));
        PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(38, 60).addBox(-2.0f, -0.8514f, -1.6826f, 4.0f, 2.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-2.0f, 20.75f, 0.0f, -1.9199f, 0.0f, 0.0f));
        LeftLeg.addOrReplaceChild("LeftLeg_r1", CubeListBuilder.create().texOffs(23, 50).addBox(-4.0f, 3.784f, 4.9976f, 4.0f, 2.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(2.0f, 16.7779f, -3.6805f, 0.9163f, 0.0f, 0.0f));
        LeftLeg.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(55, 9).addBox(-2.0f, 0.2165f, 5.2991f, 4.0f, 6.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 11.1332f, -3.301f, 0.5236f, 0.0f, 0.0f));
        LeftLeg.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(12, 41).addBox(-2.0f, 4.6985f, 1.9106f, 4.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 3.0785f, -8.4571f, 0.7854f, 0.0f, 0.0f));
        LeftLeg.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(45, 46).addBox(-2.0f, -5.9256f, 5.0916f, 4.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 3.0785f, -8.4571f, -0.3927f, 0.0f, 0.0f));
        PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(49, 40).addBox(-2.0f, -0.9768f, -1.6824f, 4.0f, 2.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(47, 33).addBox(-2.0f, 10.8232f, -2.5926f, 4.0f, 2.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(2.0f, 20.75f, 0.0f, -1.8937f, 0.0f, 1.3963f));
        RightLeg.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(55, 0).addBox(6.8633f, 4.0294f, 4.8355f, 4.0f, 6.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-8.8633f, 0.3708f, -1.4818f, -0.3927f, 0.0f, 0.0f));
        RightLeg.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(39, 3).addBox(6.8633f, 1.5923f, -4.8476f, 4.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-8.8633f, 0.3708f, -1.4818f, 0.7854f, 0.0f, 0.0f));
        RightLeg.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(44, 19).addBox(6.8633f, -0.8706f, -0.3645f, 4.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-8.8633f, 0.3708f, -1.4818f, -0.3927f, 0.0f, 0.0f));
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
        this.Head.yRot = netHeadYaw / 57.295776f;
        this.Head.xRot = headPitch / 57.295776f;
    }
}
