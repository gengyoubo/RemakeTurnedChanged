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

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/model/ModelAHV_hertx_model.class */
public class ModelAHV_hertx_model<T extends Entity> extends EntityModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(LatexMod.MODID, "model_ahv_hertx_model"), "main");
    public final ModelPart Head;
    public final ModelPart Body;
    public final ModelPart LeftArm;
    public final ModelPart RightArm;
    public final ModelPart LeftLeg;
    public final ModelPart RightLeg;

    public ModelAHV_hertx_model(ModelPart root) {
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
        partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(21, 8).addBox(-3.0f, -2.3f, -5.2f, 6.0f, 1.0f, 7.0f, new CubeDeformation(0.0f)).texOffs(56, 43).addBox(-2.0f, -3.4f, -3.2f, 4.0f, 1.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(16, 66).addBox(-2.0f, -7.4f, 1.8f, 4.0f, 4.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(38, 0).addBox(-2.0f, -3.4f, 2.8f, 4.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(30, 59).addBox(-3.0f, -3.4f, 1.8f, 6.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(24, 16).addBox(-3.0f, -1.4f, -3.1f, 6.0f, 1.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(3, 4).addBox(2.0f, -7.4f, 1.8f, 1.0f, 4.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 0).addBox(-3.0f, -7.4f, 1.8f, 1.0f, 4.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(19, 0).addBox(-3.0f, -7.4f, -5.2f, 6.0f, 1.0f, 7.0f, new CubeDeformation(0.0f)).texOffs(50, 22).addBox(2.0f, -6.4f, -5.2f, 1.0f, 3.0f, 7.0f, new CubeDeformation(0.0f)).texOffs(55, 5).addBox(2.0f, -3.3f, -5.2f, 1.0f, 1.0f, 7.0f, new CubeDeformation(0.0f)).texOffs(41, 29).addBox(-3.0f, -6.4f, -5.2f, 1.0f, 3.0f, 7.0f, new CubeDeformation(0.0f)).texOffs(53, 53).addBox(-3.0f, -3.3f, -5.2f, 1.0f, 1.0f, 7.0f, new CubeDeformation(0.0f)).texOffs(32, 38).addBox(-2.0f, -6.4f, -5.2f, 4.0f, 3.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(20, 16).addBox(-2.0f, -3.3f, -5.2f, 4.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, -1.0f, 0.0f)).addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 14).addBox(-3.0f, -7.4142f, 9.2505f, 1.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(69, 39).addBox(-3.0f, -7.4142f, 4.2505f, 1.0f, 3.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(4, 0).addBox(2.0f, -7.4142f, 9.2505f, 1.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(46, 65).addBox(2.0f, -7.4142f, 4.2505f, 1.0f, 3.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 1.4f, -0.2f, 0.2618f, 0.0f, 0.0f));
        PartDefinition Tail = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 14).addBox(-4.0f, -0.8f, -2.0f, 8.0f, 12.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(0, 58).addBox(-4.0f, -0.8f, -3.0f, 8.0f, 6.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(43, 23).addBox(-3.0f, -0.8f, -3.3f, 6.0f, 5.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(66, 28).addBox(-3.0f, 5.2f, -2.6f, 6.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, -1.0f, 0.0f)).addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offset(0.0f, 11.0f, 1.0f));
        Tail.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(17, 36).addBox(-2.3f, 6.7384f, 3.3388f, 4.0f, 4.0f, 7.0f, new CubeDeformation(0.0f)), PartPose.offset(0.5f, -9.0f, -4.0f));
        Tail.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-2.8f, 9.9039f, -0.2825f, 5.0f, 5.0f, 9.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.5f, -9.0f, -4.0f, 0.7854f, 0.0f, 0.0f));
        PartDefinition cube_r10 = Tail.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(24, 24).addBox(-3.8f, 9.7028f, -4.3744f, 7.0f, 7.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(0, 30).addBox(-3.8f, 9.7028f, 0.6256f, 7.0f, 4.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(57, 39).addBox(-3.8f, 11.7028f, 5.6256f, 7.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.5f, -9.0f, -4.0f, 1.5708f, 0.0f, 0.0f));
        cube_r10.addOrReplaceChild("uppertailjaw", CubeListBuilder.create().texOffs(39, 39).addBox(-3.8f, -10.2972f, 2.6256f, 7.0f, 5.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 24.0f, 0.0f));
        cube_r10.addOrReplaceChild("lowertailjaw", CubeListBuilder.create().texOffs(57, 32).addBox(-3.8f, -10.5518f, -0.741f, 7.0f, 5.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 24.0f, 0.0f, -0.1309f, 0.0f, 0.0f));
        partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(45, 0).addBox(-3.0f, -3.8f, -2.0f, 4.0f, 8.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(59, 22).addBox(-3.0f, 7.2f, -2.0f, 4.0f, 2.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(40, 58).addBox(-3.0f, 4.2f, -2.0f, 4.0f, 3.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(22, 1).addBox(-3.0f, 10.2f, -2.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(19, 4).addBox(-1.0f, 10.2f, -2.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(62, 55).addBox(-3.0f, 9.2f, -2.0f, 4.0f, 1.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(19, 2).addBox(-3.0f, 10.2f, -0.5f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(19, 0).addBox(-3.0f, 10.2f, 1.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offset(-5.0f, 2.0f, 0.0f));
        partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(0, 39).addBox(-1.0f, -3.8f, -2.0f, 4.0f, 8.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(66, 66).addBox(-1.0f, 9.2f, -2.0f, 4.0f, 1.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(18, 59).addBox(-1.0f, 4.2f, -2.0f, 4.0f, 3.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(62, 49).addBox(-1.0f, 7.2f, -2.0f, 4.0f, 2.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(24, 18).addBox(0.0f, 10.2f, -2.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(24, 24).addBox(2.0f, 10.2f, -2.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(22, 5).addBox(2.0f, 10.2f, -0.5f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(22, 3).addBox(2.0f, 10.2f, 1.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offset(5.0f, 2.0f, 0.0f));
        PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(30, 65).addBox(-2.0f, -1.8f, -2.0f, 4.0f, 2.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(0, 65).addBox(-2.0f, 10.0f, -2.4102f, 4.0f, 2.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offset(-2.0f, 12.0f, 0.0f));
        LeftLeg.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(59, 13).addBox(-2.0f, 4.3f, 3.0f, 4.0f, 6.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.3927f, 0.0f, 0.0f));
        LeftLeg.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(28, 48).addBox(-2.0f, 0.0f, -5.8f, 4.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.7854f, 0.0f, 0.0f));
        LeftLeg.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(44, 48).addBox(-2.0f, -0.6f, -2.2f, 4.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.3927f, 0.0f, 0.0f));
        PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(64, 6).addBox(-2.0f, -1.8f, -2.0f, 4.0f, 2.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(64, 0).addBox(-2.0f, 10.0f, -2.4102f, 4.0f, 2.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offset(2.0f, 12.0f, 0.0f));
        RightLeg.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(56, 61).addBox(-2.0f, 4.3f, 3.0f, 4.0f, 6.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.3927f, 0.0f, 0.0f));
        RightLeg.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(12, 47).addBox(-2.0f, 0.0f, -5.8f, 4.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.7854f, 0.0f, 0.0f));
        RightLeg.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(43, 12).addBox(-2.0f, -0.6f, -2.2f, 4.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.3927f, 0.0f, 0.0f));
        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        this.Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
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
