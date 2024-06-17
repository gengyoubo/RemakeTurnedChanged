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

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/model/ModelArmed_Drone_Hertx_Rest.class */
public class ModelArmed_Drone_Hertx_Rest<T extends Entity> extends EntityModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(LatexMod.MODID, "model_armed_drone_hertx_rest"), "main");
    public final ModelPart Head;
    public final ModelPart Body;
    public final ModelPart Tail;
    public final ModelPart LeftArm;
    public final ModelPart RightArm;
    public final ModelPart LeftLeg;
    public final ModelPart RightLeg;
    public final ModelPart bb_main;

    public ModelArmed_Drone_Hertx_Rest(ModelPart root) {
        this.Head = root.getChild("Head");
        this.Body = root.getChild("Body");
        this.Tail = root.getChild("Tail");
        this.LeftArm = root.getChild("LeftArm");
        this.RightArm = root.getChild("RightArm");
        this.LeftLeg = root.getChild("LeftLeg");
        this.RightLeg = root.getChild("RightLeg");
        this.bb_main = root.getChild("bb_main");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(30, 25).addBox(-3.0f, -1.3f, -4.0f, 6.0f, 1.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(51, 53).addBox(-2.0f, -2.4f, -3.0f, 4.0f, 1.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(16, 42).addBox(-2.0f, -6.4f, 2.0f, 4.0f, 4.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(33, 7).addBox(-1.5f, -6.775f, -3.75f, 3.0f, 1.0f, 7.0f, new CubeDeformation(0.0f)).texOffs(30, 7).addBox(-2.0f, -2.4f, 3.0f, 4.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 11).addBox(-3.0f, -2.4f, 2.0f, 6.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(10, 36).addBox(-3.0f, -0.275f, -2.275f, 6.0f, 1.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(26, 12).addBox(-1.0f, -0.15f, -2.4f, 2.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 44).addBox(2.0f, -6.4f, 2.0f, 1.0f, 4.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(10, 34).addBox(-3.0f, -6.4f, 2.0f, 1.0f, 4.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(30, 0).addBox(-3.0f, -6.3f, -4.0f, 6.0f, 1.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(8, 58).addBox(2.0f, -5.3f, -4.0f, 1.0f, 3.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(0, 63).addBox(2.0f, -2.3f, -4.0f, 1.0f, 1.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(56, 42).addBox(-3.0f, -5.3f, -4.0f, 1.0f, 3.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(63, 53).addBox(-3.0f, -2.3f, -4.0f, 1.0f, 1.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(16, 6).addBox(-2.0f, -5.3f, -4.0f, 4.0f, 3.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(16, 12).addBox(-2.0f, -2.3f, -4.0f, 4.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(40, 40).addBox(-1.0f, -2.8f, -4.875f, 2.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, -2.0f, -0.2f));
        Head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(35, 15).addBox(-1.0f, -4.3f, -6.7f, 2.0f, 2.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 1.75f, 1.825f, 0.0f, 0.48f, 0.0f));
        Head.addOrReplaceChild("Antenna", CubeListBuilder.create(), PartPose.offset(0.0f, -6.1528f, 3.0874f)).addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(60, 0).addBox(0.0f, -2.75f, -1.25f, 1.0f, 1.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(22, 59).addBox(-6.5f, -2.75f, -1.25f, 1.0f, 1.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(16, 0).addBox(-6.5f, -3.75f, -5.25f, 1.0f, 2.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(16, 58).addBox(0.0f, -3.75f, -5.25f, 1.0f, 2.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(2.75f, 0.3511f, 2.7389f, 1.3526f, 0.0f, 0.0f));
        partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(15, 15).addBox(-4.0f, 0.2f, -2.0f, 8.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(0, 28).addBox(-4.0f, 10.2f, -2.0f, 8.0f, 2.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(35, 32).addBox(-3.625f, 6.2f, -2.0f, 7.0f, 4.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, -2.0f, 0.0f));
        PartDefinition Tail = partdefinition.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offset(0.0f, 10.0f, 0.0f));
        Tail.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 21).addBox(-1.25f, 10.3026f, 24.6391f, 4.0f, 4.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 16).addBox(-0.25f, 10.8026f, 25.6391f, 0.0f, 1.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(10, 1).addBox(1.75f, 10.8026f, 25.6391f, 0.0f, 1.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(16, 0).addBox(-0.25f, 12.8026f, 25.6391f, 0.0f, 1.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(16, 1).addBox(1.75f, 12.8026f, 25.6391f, 0.0f, 1.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(17, 25).addBox(-0.25f, 11.3026f, 15.6391f, 2.0f, 2.0f, 9.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-0.75f, -10.3628f, -1.0141f, -0.3927f, 0.0f, 0.0f));
        Tail.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 15).addBox(-0.25f, 4.2f, 7.0f, 2.0f, 2.0f, 11.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-0.75f, -9.2f, 0.0f, -0.7854f, 0.0f, 0.0f));
        PartDefinition M16 = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(54, 21).addBox(-2.0f, -1.8f, -2.0f, 3.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(64, 7).addBox(-0.375f, -2.925f, -1.875f, 3.0f, 3.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(39, 15).addBox(-3.0f, 5.2f, -2.0f, 4.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(46, 10).addBox(-3.0f, 11.2f, 1.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(26, 42).addBox(-3.0f, 11.2f, -2.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(36, 12).addBox(-1.0f, 11.2f, -2.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(10, 39).addBox(-3.0f, 11.2f, -0.5f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-5.0f, 1.0f, 0.125f, -0.9667f, -0.7684f, -0.1824f)).addOrReplaceChild("M16", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4987f, 9.9293f, -2.0497f, 1.5708f, 0.0f, 0.0873f));
        PartDefinition Grip = M16.addOrReplaceChild("Grip", CubeListBuilder.create().texOffs(32, 50).addBox(-0.5209f, -0.0875f, 1.2465f, 1.0f, 1.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 0.0f, 0.0f));
        Grip.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5934f, 2.0486f, 1.6886f, 1.0f, 3.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.1225f, -0.4268f, -0.7684f, 0.3927f, 0.0f, 0.0f));
        Grip.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(48, 25).addBox(-0.4934f, 2.0486f, 0.5386f, 1.0f, 3.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.1225f, -0.7768f, 0.1316f, 0.3927f, 0.0f, 0.0f));
        M16.addOrReplaceChild("Mag", CubeListBuilder.create().texOffs(30, 25).addBox(-0.4934f, 1.9643f, -3.2225f, 1.0f, 3.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offset(0.1225f, -1.7768f, 0.0066f)).addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(48, 0).addBox(-0.4934f, 4.6897f, -0.8395f, 1.0f, 3.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 0.1875f, -0.5f, -0.3927f, 0.0f, 0.0f));
        M16.addOrReplaceChild("Receiver", CubeListBuilder.create().texOffs(10, 0).addBox(-0.7434f, -0.2232f, -4.6225f, 1.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 15).addBox(-0.7434f, -0.2232f, -0.6225f, 1.0f, 2.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(0, 34).addBox(-0.7434f, -0.2232f, -3.6225f, 1.0f, 4.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(15, 15).addBox(-0.4309f, -0.9732f, -3.6225f, 1.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(23, 51).addBox(-0.4309f, -1.9732f, -3.6225f, 1.0f, 1.0f, 7.0f, new CubeDeformation(0.0f)).texOffs(6, 15).addBox(-0.4309f, -0.9732f, 2.3775f, 1.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offset(0.1225f, -1.7768f, 0.0066f));
        M16.addOrReplaceChild("Stock", CubeListBuilder.create().texOffs(20, 28).addBox(-0.474f, 1.7572f, 9.0725f, 1.0f, 2.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(0, 34).addBox(-0.474f, -0.2428f, 3.0725f, 1.0f, 2.0f, 8.0f, new CubeDeformation(0.0f)), PartPose.offset(0.1225f, -1.7768f, 0.0066f)).addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(30, 0).addBox(-0.4806f, -3.6572f, 0.328f, 1.0f, 4.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0066f, 3.8698f, 8.6116f, 1.0472f, 0.0f, 0.0f));
        M16.addOrReplaceChild("Handguard", CubeListBuilder.create().texOffs(16, 0).addBox(-1.1184f, -0.3482f, -14.6225f, 2.0f, 2.0f, 10.0f, new CubeDeformation(0.0f)), PartPose.offset(0.2725f, -1.7768f, 0.0066f));
        M16.addOrReplaceChild("Barrel", CubeListBuilder.create().texOffs(0, 0).addBox(-0.25f, 0.625f, -4.375f, 1.0f, 1.0f, 14.0f, new CubeDeformation(0.0f)).texOffs(0, 15).addBox(-0.25f, -1.375f, -0.375f, 1.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offset(-0.0959f, -2.125f, -15.2409f));
        partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(0, 52).addBox(-1.0f, -1.8f, -2.0f, 3.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(62, 61).addBox(-2.5924f, -2.0237f, -1.7847f, 3.0f, 3.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(28, 40).addBox(-1.0f, 5.2f, -2.0f, 4.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(34, 32).addBox(0.0f, 11.2f, -2.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(32, 12).addBox(2.0f, 11.2f, -2.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(16, 0).addBox(2.0f, 11.2f, -0.5f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(30, 32).addBox(2.0f, 11.2f, 1.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(5.0f, 1.0f, 0.125f, -1.3796f, -0.4282f, 1.1014f));
        PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(50, 59).addBox(-2.0f, -0.8f, -2.0f, 4.0f, 2.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(0, 44).addBox(-2.375f, 10.0f, -2.9102f, 4.0f, 3.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(22, 0).addBox(0.625f, 11.0f, -3.9102f, 1.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 28).addBox(-2.375f, 11.0f, -3.9102f, 1.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offset(-2.0f, 11.0f, 0.0f));
        LeftLeg.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(57, 32).addBox(-2.0f, 4.3f, 3.0f, 4.0f, 6.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-0.25f, 1.0f, 0.0f, -0.3927f, 0.0f, 0.0f));
        LeftLeg.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 0).addBox(-3.5625f, -3.5f, -2.0f, 3.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(1.8125f, 6.0735f, -0.1237f, 0.7418f, 0.0f, 0.0f));
        LeftLeg.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(14, 48).addBox(-2.0f, -0.6f, -2.2f, 4.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-0.125f, 1.0f, 0.0f, -0.3927f, 0.0f, 0.0f));
        PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(55, 14).addBox(-2.0f, -0.8f, -2.0f, 4.0f, 2.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(44, 40).addBox(-1.625f, 10.0f, -2.9102f, 4.0f, 3.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(46, 7).addBox(1.375f, 11.0f, -3.9102f, 1.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(45, 42).addBox(-1.625f, 11.0f, -3.9102f, 1.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offset(2.0f, 11.0f, 0.0f));
        RightLeg.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(36, 58).addBox(-2.0f, 4.3f, 3.0f, 4.0f, 6.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.25f, 1.0f, 0.0f, -0.3927f, 0.0f, 0.0f));
        RightLeg.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(50, 3).addBox(0.5625f, -3.5f, -2.0f, 3.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-1.9375f, 6.0735f, -0.1237f, 0.7418f, 0.0f, 0.0f));
        RightLeg.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(40, 48).addBox(-2.0f, -0.6f, -2.2f, 4.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.125f, 1.0f, 0.0f, -0.3927f, 0.0f, 0.0f));
        partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create(), PartPose.offset(0.0f, 24.0f, 0.0f)).addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(27, 36).addBox(-1.0f, -4.3f, -6.7f, 2.0f, 2.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, -24.25f, 1.625f, 0.0f, -0.48f, 0.0f));
        return LayerDefinition.create(meshdefinition, 80, 80);
    }

    public void renderToBuffer(@NotNull PoseStack poseStack, @NotNull VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        this.Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.Tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setupAnim(@NotNull T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.Head.yRot = netHeadYaw / 57.295776f;
        this.Head.xRot = headPitch / 57.295776f;
    }
}
