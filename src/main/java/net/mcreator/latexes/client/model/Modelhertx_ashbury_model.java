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

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/model/Modelhertx_ashbury_model.class */
public class Modelhertx_ashbury_model<T extends Entity> extends EntityModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(LatexMod.MODID, "modelhertx_ashbury_model"), "main");
    public final ModelPart Head;
    public final ModelPart Body;
    public final ModelPart Tail;
    public final ModelPart LeftArm;
    public final ModelPart RightArm;
    public final ModelPart LeftLeg;
    public final ModelPart RightLeg;

    public Modelhertx_ashbury_model(ModelPart root) {
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
        partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(24, 16).addBox(-3.0f, -1.8268f, -5.0166f, 6.0f, 1.0f, 7.0f, new CubeDeformation(0.0f)).texOffs(14, 57).addBox(-2.0f, -2.8268f, -3.0166f, 4.0f, 1.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(63, 9).addBox(-2.0f, -6.8268f, 1.9834f, 4.0f, 4.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(54, 9).addBox(-2.0f, -2.8268f, 2.9834f, 4.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(19, 8).addBox(-3.0f, -2.8268f, 1.9834f, 6.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(61, 33).addBox(-2.0f, -0.8268f, -1.9166f, 4.0f, 1.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(20, 32).addBox(2.0f, -6.8268f, 1.9834f, 1.0f, 4.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(24, 24).addBox(-3.0f, -6.8268f, 1.9834f, 1.0f, 4.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(19, 0).addBox(-3.0f, -6.8268f, -5.0166f, 6.0f, 1.0f, 7.0f, new CubeDeformation(0.0f)).texOffs(52, 31).addBox(2.0f, -5.8268f, -5.0166f, 1.0f, 3.0f, 7.0f, new CubeDeformation(0.0f)).texOffs(55, 50).addBox(2.0f, -2.8268f, -5.0166f, 1.0f, 1.0f, 7.0f, new CubeDeformation(0.0f)).texOffs(45, 9).addBox(-3.0f, -5.8268f, -5.0166f, 1.0f, 3.0f, 7.0f, new CubeDeformation(0.0f)).texOffs(54, 12).addBox(-3.0f, -2.8268f, -5.0166f, 1.0f, 1.0f, 7.0f, new CubeDeformation(0.0f)).texOffs(20, 16).addBox(-2.0f, -5.8268f, -5.0166f, 4.0f, 3.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 11).addBox(-2.0f, -2.8268f, -5.0166f, 4.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, -3.25f, -0.2f)).addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 16).addBox(-3.125f, -8.7546f, 10.2581f, 1.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(21, 63).addBox(-3.125f, -8.7546f, 5.2581f, 1.0f, 3.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(7, 0).addBox(2.125f, -8.7546f, 10.2581f, 1.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(9, 10).addBox(2.125f, -8.7546f, 11.2581f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(19, 5).addBox(-3.125f, -8.7546f, 11.2581f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(9, 63).addBox(2.125f, -8.7546f, 5.2581f, 1.0f, 3.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 3.65f, 2.25f, 0.6545f, 0.0f, 0.0f));
        partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 32).addBox(-3.5f, 0.122f, -2.9153f, 7.0f, 5.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(0, 16).addBox(-4.0f, -0.2268f, -2.0166f, 8.0f, 12.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(62, 20).addBox(-3.97f, 8.6532f, -3.0166f, 3.0f, 3.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(41, 57).addBox(-1.625f, -0.3518f, -3.2666f, 3.0f, 2.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, -3.25f, 0.0f)).addOrReplaceChild("booba", CubeListBuilder.create(), PartPose.offset(0.0f, 3.65f, -0.2f)).addOrReplaceChild("Body_r1", CubeListBuilder.create().texOffs(32, 8).addBox(-3.5f, -1.5f, -2.0f, 7.0f, 5.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, -1.3768f, -1.4416f, -0.3927f, 0.0f, 0.0f));
        PartDefinition Tail = partdefinition.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offset(0.0f, -3.25f, 0.0f));
        PartDefinition cube_r2 = Tail.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(24, 24).addBox(-1.3f, 9.7598f, 14.9821f, 3.0f, 3.0f, 7.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 3.25f, 0.0f, -0.3927f, 0.0f, 0.0f));
        cube_r2.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0f, -6.1263f, -3.5555f, 2.0f, 8.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(44, 31).addBox(-1.0f, -7.1263f, -3.5555f, 2.0f, 1.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.2f, 11.0418f, 23.0617f, -0.7854f, 0.0f, 0.0f));
        cube_r2.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(41, 64).addBox(-1.0f, -1.3026f, -3.1739f, 2.0f, 5.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(37, 28).addBox(-1.0f, -2.3026f, -2.1739f, 2.0f, 1.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.2f, 14.2637f, 23.4492f, -1.9635f, 0.0f, 0.0f));
        Tail.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-1.3f, 3.0261f, 5.8026f, 3.0f, 3.0f, 13.0f, new CubeDeformation(0.0f)).texOffs(16, 63).addBox(1.7f, 4.0261f, 10.8026f, 1.0f, 1.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(28, 46).addBox(3.7f, 4.0261f, 12.8026f, 1.0f, 1.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(12, 40).addBox(2.7f, 4.0261f, 11.8026f, 1.0f, 1.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(32, 34).addBox(-4.2f, 4.0261f, 12.8026f, 1.0f, 1.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(48, 31).addBox(-2.2f, 4.0261f, 10.8026f, 1.0f, 1.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(37, 24).addBox(-3.2f, 4.0261f, 11.8026f, 1.0f, 1.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(64, 0).addBox(-0.3f, 2.0261f, 7.8026f, 1.0f, 1.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(0, 67).addBox(-0.3f, 1.0261f, 8.8026f, 1.0f, 1.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(51, 64).addBox(-0.3f, 0.0261f, 9.8026f, 1.0f, 1.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(64, 50).addBox(-0.3f, -0.9739f, 10.8026f, 1.0f, 1.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 3.25f, 0.0f, -0.7854f, 0.0f, 0.0f));
        partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(0, 51).addBox(-2.0f, -2.4768f, -2.0166f, 3.0f, 9.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(46, 46).addBox(-3.0f, 6.5232f, -2.0166f, 4.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offset(-5.0f, -1.0f, 0.0f));
        partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(32, 46).addBox(-1.75f, -2.4268f, -2.0166f, 3.0f, 9.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(46, 20).addBox(-1.75f, 6.5732f, -2.0166f, 4.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offset(5.75f, -1.05f, 0.0f));
        PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(61, 27).addBox(-1.875f, -1.4768f, -2.0166f, 4.0f, 2.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(51, 2).addBox(-1.895f, 12.0f, -2.6002f, 4.0f, 2.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(19, 11).addBox(-0.395f, 13.0f, -3.6002f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(23, 11).addBox(1.105f, 13.0f, -3.6002f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(24, 20).addBox(-1.895f, 13.0f, -3.6002f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offset(-2.125f, 10.0f, 0.0f));
        LeftLeg.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(57, 58).addBox(-1.875f, 4.1814f, 3.2864f, 4.0f, 6.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 2.0f, 0.0f, -0.3927f, 0.0f, 0.0f));
        LeftLeg.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(36, 34).addBox(-1.95f, -0.7808f, -5.5808f, 4.0f, 8.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 2.0f, 0.0f, 0.7854f, 0.0f, 0.0f));
        LeftLeg.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(16, 46).addBox(-2.0f, -2.1428f, -2.857f, 4.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(19, 0).addBox(-3.0f, -0.4229f, -2.0254f, 1.0f, 3.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 2.0f, 0.0f, -0.3927f, 0.0f, 0.0f));
        PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(28, 60).addBox(-2.0f, -1.4768f, -2.0166f, 4.0f, 2.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(38, 0).addBox(-1.97f, 12.0f, -2.6002f, 4.0f, 2.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(27, 28).addBox(1.03f, 13.0f, -3.6002f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(27, 21).addBox(-1.97f, 13.0f, -3.6002f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(27, 11).addBox(-0.47f, 13.0f, -3.6002f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offset(2.0f, 10.0f, 0.0f));
        RightLeg.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(58, 41).addBox(-2.0f, 4.1814f, 3.2864f, 4.0f, 6.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 2.0f, 0.0f, -0.3927f, 0.0f, 0.0f));
        RightLeg.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(20, 34).addBox(-1.925f, -0.7808f, -5.5808f, 4.0f, 8.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 2.0f, 0.0f, 0.7854f, 0.0f, 0.0f));
        RightLeg.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 40).addBox(-1.875f, -2.1428f, -2.857f, 4.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 2.0f, 0.0f, -0.3927f, 0.0f, 0.0f));
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
        this.RightArm.xRot = Mth.cos((limbSwing * 0.6662f) + 3.1415927f) * limbSwingAmount;
        this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0f) * -1.0f * limbSwingAmount;
        this.Head.yRot = netHeadYaw / 57.295776f;
        this.Head.xRot = headPitch / 57.295776f;
        this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662f) * limbSwingAmount;
        this.RightLeg.xRot = Mth.cos(limbSwing * 1.0f) * 1.0f * limbSwingAmount;
    }
}
