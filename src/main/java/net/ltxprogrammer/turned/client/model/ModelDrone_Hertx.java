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

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/model/ModelDrone_Hertx.class */
public class ModelDrone_Hertx<T extends Entity> extends EntityModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(LatexMod.MODID, "model_drone_hertx"), "main");
    public final ModelPart Head;
    public final ModelPart Body;
    public final ModelPart Tail;
    public final ModelPart RightArm;
    public final ModelPart LeftArm;
    public final ModelPart RightLeg;
    public final ModelPart LeftLeg;

    public ModelDrone_Hertx(ModelPart root) {
        this.Head = root.getChild("Head");
        this.Body = root.getChild("Body");
        this.Tail = root.getChild("Tail");
        this.RightArm = root.getChild("RightArm");
        this.LeftArm = root.getChild("LeftArm");
        this.RightLeg = root.getChild("RightLeg");
        this.LeftLeg = root.getChild("LeftLeg");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(15, 0).addBox(-3.0f, -1.3f, -5.0f, 6.0f, 1.0f, 7.0f, new CubeDeformation(0.0f)).texOffs(34, 0).addBox(-2.0f, -2.4f, -3.0f, 4.0f, 1.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(0, 59).addBox(-2.0f, -6.4f, 2.0f, 4.0f, 4.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(16, 23).addBox(-1.5f, -6.9f, -4.5f, 3.0f, 1.0f, 8.0f, new CubeDeformation(0.0f)).texOffs(15, 8).addBox(-2.0f, -2.4f, 3.0f, 4.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(32, 14).addBox(-3.0f, -2.4f, 2.0f, 6.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(32, 8).addBox(-3.0f, -0.275f, -2.275f, 6.0f, 1.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(15, 5).addBox(-1.0f, -0.15f, -2.4f, 2.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(15, 0).addBox(2.0f, -6.4f, 2.0f, 1.0f, 4.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 13).addBox(-3.0f, -6.4f, 2.0f, 1.0f, 4.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 13).addBox(-3.0f, -6.4f, -5.0f, 6.0f, 1.0f, 7.0f, new CubeDeformation(0.0f)).texOffs(47, 7).addBox(2.0f, -5.4f, -5.0f, 1.0f, 3.0f, 7.0f, new CubeDeformation(0.0f)).texOffs(47, 28).addBox(2.0f, -2.3f, -5.0f, 1.0f, 1.0f, 7.0f, new CubeDeformation(0.0f)).texOffs(46, 38).addBox(-3.0f, -5.4f, -5.0f, 1.0f, 3.0f, 7.0f, new CubeDeformation(0.0f)).texOffs(28, 55).addBox(-3.0f, -2.3f, -5.0f, 1.0f, 1.0f, 7.0f, new CubeDeformation(0.0f)).texOffs(30, 27).addBox(-2.0f, -5.4f, -5.0f, 4.0f, 3.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(20, 21).addBox(-2.0f, -2.3f, -5.0f, 4.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, -2.0f, -0.2f)).addOrReplaceChild("Antenna", CubeListBuilder.create(), PartPose.offset(0.0f, -6.1528f, 3.0874f)).addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(56, 53).addBox(0.0f, -2.75f, -1.25f, 1.0f, 1.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(37, 55).addBox(-6.5f, -2.75f, -1.25f, 1.0f, 1.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(0, 0).addBox(-6.5f, -3.75f, -5.25f, 1.0f, 2.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(55, 60).addBox(0.0f, -3.75f, -5.25f, 1.0f, 2.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(2.75f, 0.3511f, 2.7389f, 1.3526f, 0.0f, 0.0f));
        partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 21).addBox(-4.0f, 0.2f, -2.0f, 8.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(0, 32).addBox(-4.0f, 10.2f, -2.0f, 8.0f, 2.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(30, 19).addBox(-3.625f, 6.2f, -2.0f, 7.0f, 4.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, -2.0f, 0.0f));
        PartDefinition Tail = partdefinition.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offset(0.0f, 10.0f, 0.0f));
        Tail.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 6).addBox(-1.25f, 10.3026f, 24.6391f, 4.0f, 4.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 1).addBox(-0.25f, 10.8026f, 25.6391f, 0.0f, 1.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(0, 0).addBox(1.75f, 10.8026f, 25.6391f, 0.0f, 1.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(6, 0).addBox(-0.25f, 12.8026f, 25.6391f, 0.0f, 1.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(6, 1).addBox(1.75f, 12.8026f, 25.6391f, 0.0f, 1.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(19, 8).addBox(-0.25f, 11.3026f, 15.6391f, 2.0f, 2.0f, 9.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-0.75f, -10.3628f, -1.0141f, -0.3927f, 0.0f, 0.0f));
        Tail.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-0.25f, 4.2f, 7.0f, 2.0f, 2.0f, 11.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-0.75f, -9.2f, 0.0f, -0.7854f, 0.0f, 0.0f));
        partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(52, 17).addBox(-2.0f, -1.8f, -2.0f, 3.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(47, 59).addBox(-1.0f, -2.8f, -2.0f, 2.0f, 1.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(24, 32).addBox(-3.0f, 5.2f, -2.0f, 4.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(32, 10).addBox(-3.0f, 11.2f, 1.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(32, 8).addBox(-3.0f, 11.2f, -2.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(29, 20).addBox(-1.0f, 11.2f, -2.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 31).addBox(-3.0f, 11.2f, -0.5f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-5.0f, 1.0f, 0.125f, 0.0f, 0.0f, 0.0436f));
        partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(14, 52).addBox(-1.0f, -1.8f, -2.0f, 3.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(56, 9).addBox(-1.0f, -2.8f, -2.0f, 2.0f, 1.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(0, 38).addBox(-1.0f, 5.2f, -2.0f, 4.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(26, 19).addBox(0.0f, 11.2f, -2.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(6, 0).addBox(2.0f, 11.2f, -2.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 0).addBox(2.0f, 11.2f, -0.5f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(20, 23).addBox(2.0f, 11.2f, 1.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(5.0f, 1.0f, 0.125f, 0.0f, 0.0f, -0.0436f));
        PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(58, 45).addBox(-2.0f, -0.8f, -2.0f, 4.0f, 2.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(36, 27).addBox(-2.375f, 10.0f, -2.9102f, 4.0f, 3.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(3, 17).addBox(0.625f, 11.0f, -3.9102f, 1.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(19, 13).addBox(-2.375f, 11.0f, -3.9102f, 1.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offset(-2.0f, 11.0f, 0.0f));
        LeftLeg.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(55, 36).addBox(-2.0f, 4.3f, 3.0f, 4.0f, 6.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-0.25f, 1.0f, 0.0f, -0.3927f, 0.0f, 0.0f));
        LeftLeg.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 48).addBox(-3.5625f, -3.5f, -2.0f, 3.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(1.8125f, 6.0735f, -0.1237f, 0.7418f, 0.0f, 0.0f));
        LeftLeg.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(16, 42).addBox(-2.0f, -0.6f, -2.2f, 4.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-0.125f, 1.0f, 0.0f, -0.3927f, 0.0f, 0.0f));
        PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(56, 28).addBox(-2.0f, -0.8f, -2.0f, 4.0f, 2.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(35, 37).addBox(-1.625f, 10.0f, -2.9102f, 4.0f, 3.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(23, 13).addBox(1.375f, 11.0f, -3.9102f, 1.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 21).addBox(-1.625f, 11.0f, -3.9102f, 1.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offset(2.0f, 11.0f, 0.0f));
        RightLeg.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(56, 0).addBox(-2.0f, 4.3f, 3.0f, 4.0f, 6.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.25f, 1.0f, 0.0f, -0.3927f, 0.0f, 0.0f));
        RightLeg.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(48, 48).addBox(0.5625f, -3.5f, -2.0f, 3.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-1.9375f, 6.0735f, -0.1237f, 0.7418f, 0.0f, 0.0f));
        RightLeg.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(32, 45).addBox(-2.0f, -0.6f, -2.2f, 4.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.125f, 1.0f, 0.0f, -0.3927f, 0.0f, 0.0f));
        return LayerDefinition.create(meshdefinition, 80, 80);
    }

    public void renderToBuffer(@NotNull PoseStack poseStack, @NotNull VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        this.Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.Tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
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
