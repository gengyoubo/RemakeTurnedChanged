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

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/model/Modeltsc_outsider_ranged_model.class */
public class Modeltsc_outsider_ranged_model<T extends Entity> extends EntityModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(LatexMod.MODID, "modeltsc_outsider_ranged_model"), "main");
    public final ModelPart Head;
    public final ModelPart Body;
    public final ModelPart LeftArm;
    public final ModelPart RightArm;
    public final ModelPart LeftLeg;
    public final ModelPart RightLeg;

    public Modeltsc_outsider_ranged_model(ModelPart root) {
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
        partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(-3.5f, -7.0f, -3.5f, 7.0f, 7.0f, 7.0f, new CubeDeformation(0.0f)).texOffs(12, 27).addBox(-3.0f, -5.25f, -3.75f, 6.0f, 3.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 0.0f, 0.0f)).addOrReplaceChild("Ears", CubeListBuilder.create().texOffs(53, 24).addBox(-1.0f, -1.5f, -3.0f, 2.0f, 3.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(52, 34).addBox(6.0f, -1.5f, -3.0f, 2.0f, 3.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-3.5f, -6.5f, 2.5f, 0.7854f, 0.0f, 0.0f));
        partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(16, 14).addBox(-4.0f, 0.0f, -2.0f, 8.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(28, 0).addBox(-4.0f, 8.0f, -2.0f, 8.0f, 4.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(28, 8).addBox(-3.5f, 6.0f, -2.0f, 7.0f, 2.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(24, 35).addBox(-1.5f, 0.5f, -2.5f, 3.0f, 3.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 0.0f, 0.0f)).addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(0, 14).addBox(-1.5f, -14.9043f, 1.769f, 3.0f, 3.0f, 10.0f, new CubeDeformation(0.0f)).texOffs(19, 24).addBox(-2.0f, -15.4424f, 3.9603f, 4.0f, 4.0f, 7.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 23.0f, -5.2f, -0.3927f, 0.0f, 0.0f));
        partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(16, 45).addBox(-3.0f, -2.0f, -2.0f, 4.0f, 5.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(28, 50).addBox(-3.0f, 3.0f, -2.0f, 4.0f, 3.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(41, 30).addBox(-3.0f, 6.0f, -2.0f, 4.0f, 5.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-5.0f, 2.0f, 0.0f, -1.5708f, 0.0f, 0.0f)).addOrReplaceChild("TSCPistol", CubeListBuilder.create().texOffs(21, 0).addBox(-2.0f, -2.3108f, 0.4651f, 2.0f, 2.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(40, 14).addBox(-2.0f, -3.3108f, -2.5349f, 2.0f, 4.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(53, 46).addBox(-2.0f, -0.3108f, -1.5349f, 2.0f, 1.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 9.0f, 1.0f, 1.9635f, 0.0f, 0.0f)).addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(0, 14).addBox(-2.0f, -7.0f, 3.0f, 2.0f, 6.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(16, 14).addBox(-1.5f, -10.0f, 3.0f, 1.0f, 3.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 0).addBox(-2.0f, -11.0f, 4.0f, 2.0f, 4.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(21, 4).addBox(-2.0f, -6.0f, 5.0f, 2.0f, 3.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(0, 5).addBox(-2.0f, -6.0f, 5.0f, 2.0f, 0.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 1.8806f, 1.927f, 1.1781f, 0.0f, 0.0f));
        partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(40, 41).addBox(-1.0f, -2.0f, -2.0f, 4.0f, 5.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(0, 50).addBox(-1.0f, 3.0f, -2.0f, 4.0f, 3.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(0, 41).addBox(-1.0f, 6.0f, -2.0f, 4.0f, 5.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offset(5.0f, 2.0f, 0.0f));
        PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create(), PartPose.offset(-2.0f, 12.0f, 0.0f));
        LeftLeg.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(48, 17).addBox(-2.0f, 4.3732f, -4.2794f, 4.0f, 3.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 4.6268f, 1.6794f));
        LeftLeg.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(52, 0).addBox(-1.5f, 0.0f, -1.0f, 3.0f, 7.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 4.6268f, 2.2794f, -0.3927f, 0.0f, 0.0f));
        LeftLeg.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(36, 20).addBox(-2.0f, 0.0f, -2.0f, 4.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 2.5637f, -2.5296f, 0.7854f, 0.0f, 0.0f));
        LeftLeg.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(28, 35).addBox(-2.0f, 0.0f, -2.0f, 4.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, -0.8f, 0.2f, -0.3927f, 0.0f, 0.0f));
        PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create(), PartPose.offset(2.0f, 12.0f, 0.0f));
        RightLeg.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(46, 10).addBox(-2.0f, 4.3732f, -4.2794f, 4.0f, 3.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 4.6268f, 1.6794f));
        RightLeg.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(44, 50).addBox(-1.5f, 0.0f, -1.0f, 3.0f, 7.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 4.6268f, 2.2794f, -0.3927f, 0.0f, 0.0f));
        RightLeg.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(12, 35).addBox(-2.0f, 0.0f, -2.0f, 4.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 2.5637f, -2.5296f, 0.7854f, 0.0f, 0.0f));
        RightLeg.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 27).addBox(-2.0f, 0.0f, -2.0f, 4.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, -0.8f, 0.2f, -0.3927f, 0.0f, 0.0f));
        return LayerDefinition.create(meshdefinition, 80, 80);
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
        this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0f) * -1.0f * limbSwingAmount;
        this.Head.yRot = netHeadYaw / 57.295776f;
        this.Head.xRot = headPitch / 57.295776f;
        this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662f) * limbSwingAmount;
        this.RightLeg.xRot = Mth.cos(limbSwing * 1.0f) * 1.0f * limbSwingAmount;
    }
}
