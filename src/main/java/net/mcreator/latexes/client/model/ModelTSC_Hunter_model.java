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

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/model/ModelTSC_Hunter_model.class */
public class ModelTSC_Hunter_model<T extends Entity> extends EntityModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(LatexMod.MODID, "model_tsc_hunter_model"), "main");
    public final ModelPart Head;
    public final ModelPart Body;
    public final ModelPart LeftArm;
    public final ModelPart RightArm;
    public final ModelPart LeftLeg;
    public final ModelPart RightLeg;

    public ModelTSC_Hunter_model(ModelPart root) {
        this.Head = root.getChild("Head");
        this.Body = root.getChild("Body");
        this.LeftArm = root.getChild("LeftArm");
        this.RightArm = root.getChild("RightArm");
        this.LeftLeg = root.getChild("LeftLeg");
        this.RightLeg = root.getChild("RightLeg");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 16).addBox(-4.0f, -8.0f, -4.0f, 8.0f, 8.0f, 8.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, -13.0f, 0.0f));
        Head.addOrReplaceChild("Muzzle", CubeListBuilder.create().texOffs(76, 32).addBox(-3.9f, -3.2384f, -6.9248f, 5.0f, 3.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(1.4f, -1.0f, 1.0f, 0.3054f, 0.0f, 0.0f));
        Head.addOrReplaceChild("Hair", CubeListBuilder.create().texOffs(87, 63).addBox(-7.0f, -4.0f, -5.25f, 4.0f, 5.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(61, 39).addBox(-7.0f, 1.0f, -5.0f, 2.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(42, 10).addBox(-7.0f, 1.0f, -4.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 0).addBox(-7.0f, -4.0f, -4.25f, 1.0f, 5.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(24, 22).addBox(-7.0f, -5.0f, -5.25f, 5.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(17, 46).addBox(-6.0f, -7.0f, -5.25f, 5.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(49, 2).addBox(-3.0f, -4.0f, -5.0f, 1.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(32, 83).addBox(-7.0f, -7.0f, -4.25f, 1.0f, 3.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(47, 3).addBox(-6.0f, -8.0f, -4.25f, 6.0f, 1.0f, 7.0f, new CubeDeformation(0.0f)).texOffs(19, 61).addBox(-1.0f, -7.0f, -5.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 49).addBox(-2.0f, -5.0f, -5.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offset(2.0f, -1.0f, 0.25f));
        Head.addOrReplaceChild("Ears", CubeListBuilder.create().texOffs(82, 72).addBox(2.6f, -7.8978f, 0.7765f, 1.0f, 1.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(14, 82).addBox(-5.4f, -7.8978f, 0.7765f, 1.0f, 1.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(10, 73).addBox(2.6f, -8.8978f, 0.7765f, 1.0f, 1.0f, 8.0f, new CubeDeformation(0.0f)).texOffs(0, 72).addBox(-5.4f, -8.8978f, 0.7765f, 1.0f, 1.0f, 8.0f, new CubeDeformation(0.0f)).texOffs(66, 0).addBox(2.6f, -9.8978f, 0.7765f, 1.0f, 1.0f, 9.0f, new CubeDeformation(0.0f)).texOffs(59, 23).addBox(-5.4f, -9.8978f, 0.7765f, 1.0f, 1.0f, 9.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.9f, 3.0f, 2.0f, 0.2618f, 0.0f, 0.0f));
        PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(30, 12).addBox(-5.5f, 1.0f, -2.0f, 11.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(61, 56).addBox(-0.5f, 2.0f, 2.0f, 1.0f, 7.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(24, 16).addBox(-0.5f, 3.0f, 3.0f, 1.0f, 5.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(24, 0).addBox(-0.5f, 4.0f, 4.0f, 1.0f, 4.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 46).addBox(-0.5f, 6.0f, 5.0f, 1.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 61).addBox(-0.5f, 8.0f, 6.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 32).addBox(-2.5f, 0.0f, -2.0f, 5.0f, 1.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(48, 33).addBox(-5.0f, 12.0f, -2.0f, 10.0f, 2.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(0, 37).addBox(-5.5f, 14.0f, -2.0f, 11.0f, 5.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(70, 21).addBox(-8.25f, 0.75f, -2.5f, 4.0f, 6.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(48, 69).addBox(4.25f, 0.75f, -2.5f, 4.0f, 6.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(22, 50).addBox(-4.5f, 7.0f, -1.5f, 9.0f, 7.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, -13.0f, 0.0f));
        Body.addOrReplaceChild("breast", CubeListBuilder.create().texOffs(24, 0).addBox(-5.0f, -0.7716f, -2.8519f, 10.0f, 5.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 3.0f, -3.0f, 0.3927f, 0.0f, 0.0f));
        PartDefinition bone = Body.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 0).addBox(-3.5f, 9.3478f, -0.3686f, 7.0f, 6.0f, 10.0f, new CubeDeformation(0.0f)).texOffs(24, 24).addBox(-3.0f, 9.9147f, 9.3814f, 6.0f, 5.0f, 8.0f, new CubeDeformation(0.0f)).texOffs(79, 8).addBox(3.5f, 11.3478f, 2.6314f, 1.0f, 1.0f, 7.0f, new CubeDeformation(0.0f)).texOffs(68, 85).addBox(4.5f, 11.3478f, 3.6314f, 1.0f, 1.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(83, 16).addBox(-5.5f, 11.3478f, 3.6314f, 1.0f, 1.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(14, 32).addBox(5.5f, 11.3478f, 5.6314f, 1.0f, 1.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(0, 20).addBox(-6.5f, 11.3478f, 5.6314f, 1.0f, 1.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(44, 25).addBox(6.5f, 11.3478f, 6.6314f, 1.0f, 1.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(44, 22).addBox(-7.5f, 11.3478f, 6.6314f, 1.0f, 1.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(56, 58).addBox(7.5f, 11.3478f, 8.6314f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(56, 56).addBox(-8.5f, 11.3478f, 8.6314f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(78, 64).addBox(-4.5f, 11.3478f, 2.6314f, 1.0f, 1.0f, 7.0f, new CubeDeformation(0.0f)).texOffs(87, 33).addBox(-0.5f, 8.3478f, 4.6314f, 1.0f, 1.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(26, 37).addBox(-0.5f, 7.3478f, 5.6314f, 1.0f, 1.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(0, 59).addBox(-0.5f, 5.3478f, 8.6314f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(15, 61).addBox(-0.5f, 6.3478f, 6.6314f, 1.0f, 1.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 3.0f, 6.0f, -0.5236f, 0.0f, 0.0f)).addOrReplaceChild("bone", CubeListBuilder.create().texOffs(52, 39).addBox(-1.0f, 4.1205f, 16.1991f, 3.0f, 4.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(77, 0).addBox(-2.0f, 4.1205f, 12.1991f, 5.0f, 4.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-0.5f, 9.884f, 2.933f, 0.2618f, 0.0f, 0.0f));
        bone.addOrReplaceChild("bone6", CubeListBuilder.create().texOffs(60, 81).addBox(0.0f, -26.6952f, -2.3316f, 1.0f, 7.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -1.9635f, 0.0f, 0.0f));
        bone.addOrReplaceChild("bone7", CubeListBuilder.create().texOffs(20, 60).addBox(0.0f, -23.3693f, 14.3681f, 1.0f, 15.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.7854f, 0.0f, 0.0f));
        partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(66, 71).addBox(-3.071f, -2.2617f, -2.0f, 4.0f, 9.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(15, 59).addBox(-3.571f, 14.7383f, 1.5f, 3.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(56, 1).addBox(-3.571f, 14.7383f, 0.15f, 3.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(49, 0).addBox(-3.571f, 14.7383f, -1.15f, 3.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(43, 50).addBox(-3.571f, 14.7383f, -2.5f, 3.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 59).addBox(-3.571f, 6.7383f, -2.5f, 5.0f, 8.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(56, 11).addBox(0.429f, 14.7383f, -2.5f, 1.0f, 1.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(82, 55).addBox(-3.571f, 3.7383f, -2.5f, 2.0f, 3.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-6.0f, -9.0f, 0.0f, 0.0f, 0.0f, 0.1309f));
        partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(32, 69).addBox(-0.929f, -2.2617f, -2.0f, 4.0f, 9.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(17, 49).addBox(0.571f, 14.7383f, 1.5f, 3.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(47, 39).addBox(0.571f, 14.7383f, 0.15f, 3.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(36, 22).addBox(0.571f, 14.7383f, -1.15f, 3.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(34, 10).addBox(0.571f, 14.7383f, -2.5f, 3.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(41, 56).addBox(-1.429f, 6.7383f, -2.5f, 5.0f, 8.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(0, 16).addBox(-1.429f, 14.7383f, -2.5f, 1.0f, 1.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(23, 80).addBox(1.571f, 3.7383f, -2.5f, 2.0f, 3.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(6.0f, -9.0f, 0.0f, 0.0f, 0.0f, -0.1309f));
        partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(81, 43).addBox(-3.0f, -3.5f, -2.5f, 2.0f, 3.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(65, 51).addBox(-3.0f, -1.5f, -2.5f, 6.0f, 4.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(31, 37).addBox(-3.0f, 16.0f, -5.5f, 1.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 37).addBox(2.0f, 16.0f, -5.5f, 1.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(19, 32).addBox(-0.5f, 16.0f, -5.5f, 1.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(81, 39).addBox(-3.0f, 15.0f, -4.5f, 6.0f, 3.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(46, 46).addBox(-3.0f, 14.0f, -3.5f, 6.0f, 4.0f, 6.0f, new CubeDeformation(0.0f)), PartPose.offset(-3.0f, 6.0f, 0.0f)).addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(0, 46).addBox(-4.0f, -0.7654f, -3.1522f, 6.0f, 8.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(1.0f, 2.5f, 0.5f, -0.3927f, 0.0f, 0.0f)).addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(61, 61).addBox(-4.0f, 0.4335f, -8.6488f, 6.0f, 5.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, -1.4142f, 1.4142f, 1.5708f, 0.0f, 0.0f)).addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(78, 80).addBox(-3.0f, 8.0f, -1.8284f, 4.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 3.262f, -0.6488f, -1.5708f, 0.0f, 0.0f));
        partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(0, 81).addBox(1.0f, -3.5f, -2.5f, 2.0f, 3.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(64, 39).addBox(-3.0f, -1.5f, -2.5f, 6.0f, 4.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(0, 32).addBox(2.0f, 16.0f, -5.5f, 1.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(6, 0).addBox(-3.0f, 16.0f, -5.5f, 1.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 0).addBox(-0.5f, 16.0f, -5.5f, 1.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(27, 60).addBox(-3.0f, 15.0f, -4.5f, 6.0f, 3.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(44, 22).addBox(-3.0f, 14.0f, -3.5f, 6.0f, 4.0f, 6.0f, new CubeDeformation(0.0f)), PartPose.offset(3.0f, 6.0f, 0.0f)).addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(30, 37).addBox(-2.0f, -0.7654f, -3.1522f, 6.0f, 8.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-1.0f, 2.5f, 0.5f, -0.3927f, 0.0f, 0.0f)).addOrReplaceChild("bone8", CubeListBuilder.create().texOffs(60, 11).addBox(-2.0f, 0.4335f, -8.6488f, 6.0f, 5.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, -1.4142f, 1.4142f, 1.5708f, 0.0f, 0.0f)).addOrReplaceChild("bone9", CubeListBuilder.create().texOffs(44, 80).addBox(-1.0f, 8.0f, -1.8284f, 4.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 3.262f, -0.6488f, -1.5708f, 0.0f, 0.0f));
        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    public void renderToBuffer(@NotNull PoseStack poseStack, @NotNull VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        this.Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setupAnim(@NotNull T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.RightArm.xRot = Mth.cos((limbSwing * 0.6662f) + 3.1415927f) * limbSwingAmount;
        this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0f) * -1.0f * limbSwingAmount;
        this.Head.yRot = netHeadYaw / 57.295776f;
        this.Head.xRot = headPitch / 57.295776f;
        this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662f) * limbSwingAmount;
        this.RightLeg.xRot = Mth.cos(limbSwing * 1.0f) * 1.0f * limbSwingAmount;
    }
}
