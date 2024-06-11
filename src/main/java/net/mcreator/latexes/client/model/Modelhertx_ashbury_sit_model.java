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

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/model/Modelhertx_ashbury_sit_model.class */
public class Modelhertx_ashbury_sit_model<T extends Entity> extends EntityModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(LatexMod.MODID, "modelhertx_ashbury_sit_model"), "main");
    public final ModelPart Head;
    public final ModelPart Body;
    public final ModelPart Tail;
    public final ModelPart LeftArm;
    public final ModelPart RightArm;
    public final ModelPart LeftLeg;
    public final ModelPart RightLeg;

    public Modelhertx_ashbury_sit_model(ModelPart root) {
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
        partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(24, 16).addBox(-3.0f, -1.5768f, -5.0166f, 6.0f, 1.0f, 7.0f, new CubeDeformation(0.0f)).texOffs(14, 57).addBox(-2.0f, -2.5768f, -3.0166f, 4.0f, 1.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(63, 9).addBox(-2.0f, -6.5768f, 1.9834f, 4.0f, 4.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(54, 9).addBox(-2.0f, -2.5768f, 2.9834f, 4.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(19, 8).addBox(-3.0f, -2.5768f, 1.9834f, 6.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(61, 33).addBox(-2.0f, -0.5768f, -1.9166f, 4.0f, 1.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(20, 32).addBox(2.0f, -6.5768f, 1.9834f, 1.0f, 4.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(24, 24).addBox(-3.0f, -6.5768f, 1.9834f, 1.0f, 4.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(19, 0).addBox(-3.0f, -6.5768f, -5.0166f, 6.0f, 1.0f, 7.0f, new CubeDeformation(0.0f)).texOffs(52, 31).addBox(2.0f, -5.5768f, -5.0166f, 1.0f, 3.0f, 7.0f, new CubeDeformation(0.0f)).texOffs(55, 50).addBox(2.0f, -2.5768f, -5.0166f, 1.0f, 1.0f, 7.0f, new CubeDeformation(0.0f)).texOffs(45, 9).addBox(-3.0f, -5.5768f, -5.0166f, 1.0f, 3.0f, 7.0f, new CubeDeformation(0.0f)).texOffs(54, 12).addBox(-3.0f, -2.5768f, -5.0166f, 1.0f, 1.0f, 7.0f, new CubeDeformation(0.0f)).texOffs(20, 16).addBox(-2.0f, -5.5768f, -5.0166f, 4.0f, 3.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 11).addBox(-2.0f, -2.5768f, -5.0166f, 4.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 9.75f, 5.8f)).addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 16).addBox(-3.125f, 5.4099f, 6.9521f, 1.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(21, 63).addBox(-3.125f, 5.4099f, 1.9521f, 1.0f, 3.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(7, 0).addBox(2.125f, 5.4099f, 6.9521f, 1.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(9, 10).addBox(2.125f, 5.4099f, 7.9521f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(19, 5).addBox(-3.125f, 5.4099f, 7.9521f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(9, 63).addBox(2.125f, 5.4099f, 1.9521f, 1.0f, 3.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, -9.35f, -3.75f, 0.6545f, 0.0f, 0.0f));
        partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 32).addBox(-3.5f, 10.0673f, 7.6985f, 7.0f, 5.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(0, 16).addBox(-4.0f, 9.7185f, 8.5972f, 8.0f, 12.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(62, 20).addBox(-3.97f, 18.5985f, 7.5972f, 3.0f, 3.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(41, 57).addBox(-1.625f, 9.5935f, 7.3472f, 3.0f, 2.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, -3.25f, 0.0f, -0.3927f, 0.0f, 0.0f)).addOrReplaceChild("booba", CubeListBuilder.create(), PartPose.offset(0.0f, 3.65f, -0.2f)).addOrReplaceChild("Body_r1", CubeListBuilder.create().texOffs(32, 8).addBox(-3.5f, 3.6265f, 11.6118f, 7.0f, 5.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, -1.3768f, -1.4416f, -0.3927f, 0.0f, 0.0f));
        PartDefinition Tail = partdefinition.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0f, 20.75f, 3.0f, 0.7854f, 0.0f, 0.0f));
        PartDefinition cube_r2 = Tail.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(24, 24).addBox(-1.3f, 19.0976f, 20.0755f, 3.0f, 3.0f, 7.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, -17.8865f, -2.2909f, -0.3927f, 0.0f, 0.0f));
        cube_r2.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0f, -3.125f, 6.6489f, 2.0f, 8.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(44, 31).addBox(-1.0f, -4.125f, 6.6489f, 2.0f, 1.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.2f, 11.0418f, 23.0617f, -0.7854f, 0.0f, 0.0f));
        cube_r2.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(41, 64).addBox(-1.0f, -9.5817f, 3.5039f, 2.0f, 5.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(37, 28).addBox(-1.0f, -10.5817f, 4.5039f, 2.0f, 1.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.2f, 14.2637f, 23.4492f, -1.9635f, 0.0f, 0.0f));
        Tail.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-1.3f, 9.704f, 14.0817f, 3.0f, 3.0f, 13.0f, new CubeDeformation(0.0f)).texOffs(16, 63).addBox(1.7f, 10.704f, 19.0817f, 1.0f, 1.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(28, 46).addBox(3.7f, 10.704f, 21.0817f, 1.0f, 1.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(12, 40).addBox(2.7f, 10.704f, 20.0817f, 1.0f, 1.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(32, 34).addBox(-4.2f, 10.704f, 21.0817f, 1.0f, 1.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(48, 31).addBox(-2.2f, 10.704f, 19.0817f, 1.0f, 1.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(37, 24).addBox(-3.2f, 10.704f, 20.0817f, 1.0f, 1.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(64, 0).addBox(-0.3f, 8.704f, 16.0817f, 1.0f, 1.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(0, 67).addBox(-0.3f, 7.704f, 17.0817f, 1.0f, 1.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(51, 64).addBox(-0.3f, 6.704f, 18.0817f, 1.0f, 1.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(64, 50).addBox(-0.3f, 5.704f, 19.0817f, 1.0f, 1.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, -17.8865f, -2.2909f, -0.7854f, 0.0f, 0.0f));
        partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(0, 51).addBox(-2.0f, 10.9693f, -3.9049f, 3.0f, 9.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(46, 46).addBox(-3.0f, 19.9693f, -3.9049f, 4.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-5.0f, -1.0f, 0.0f, 0.5236f, 0.0f, 0.0f));
        partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(32, 46).addBox(-1.75f, 9.1059f, -3.5243f, 3.0f, 9.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(46, 20).addBox(-1.75f, 18.1059f, -3.5243f, 4.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(5.75f, 0.95f, 0.0f, 0.5236f, 0.0f, 0.0f));
        PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(61, 27).addBox(-4.8871f, -3.866f, 7.9834f, 4.0f, 2.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(51, 2).addBox(-4.9071f, 9.6108f, 7.3998f, 4.0f, 2.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(19, 11).addBox(-3.4071f, 10.6108f, 6.3998f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(23, 11).addBox(-1.9071f, 10.6108f, 6.3998f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(24, 20).addBox(-4.9071f, 10.6108f, 6.3998f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-2.125f, 10.0f, 0.0f, -1.7453f, 0.2618f, -0.2618f));
        LeftLeg.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(57, 58).addBox(-4.8871f, -1.8528f, 11.6109f, 4.0f, 6.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 2.0f, 0.0f, -0.3927f, 0.0f, 0.0f));
        LeftLeg.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(36, 34).addBox(-4.9621f, 4.6009f, 3.1797f, 4.0f, 8.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 2.0f, 0.0f, 0.7854f, 0.0f, 0.0f));
        LeftLeg.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(16, 46).addBox(-5.0121f, -8.177f, 5.4675f, 4.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(19, 0).addBox(-6.0121f, -6.4571f, 6.2991f, 1.0f, 3.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 2.0f, 0.0f, -0.3927f, 0.0f, 0.0f));
        PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(28, 60).addBox(1.0121f, -3.866f, 7.9834f, 4.0f, 2.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(38, 0).addBox(1.0421f, 9.6108f, 7.3998f, 4.0f, 2.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(27, 28).addBox(4.0421f, 10.6108f, 6.3998f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(27, 21).addBox(1.0421f, 10.6108f, 6.3998f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(27, 11).addBox(2.5421f, 10.6108f, 6.3998f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(2.0f, 10.0f, 0.0f, -1.7453f, -0.2618f, 0.2618f));
        RightLeg.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(58, 41).addBox(1.0121f, -1.8528f, 11.6109f, 4.0f, 6.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 2.0f, 0.0f, -0.3927f, 0.0f, 0.0f));
        RightLeg.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(20, 34).addBox(1.0871f, 4.6009f, 3.1797f, 4.0f, 8.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 2.0f, 0.0f, 0.7854f, 0.0f, 0.0f));
        RightLeg.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 40).addBox(1.1371f, -8.177f, 5.4675f, 4.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 2.0f, 0.0f, -0.3927f, 0.0f, 0.0f));
        return LayerDefinition.create(meshdefinition, 80, 80);
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
