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
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/model/Modeldark_latex_fox_scientist.class */
public class Modeldark_latex_fox_scientist<T extends Entity> extends EntityModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(LatexMod.modResource("dark_latex_fox_scientist"), "main");
    private final ModelPart Head;
    private final ModelPart Body;
    private final ModelPart Tail;
    private final ModelPart LeftArm;
    private final ModelPart RightArm;
    private final ModelPart LeftLeg;
    private final ModelPart RightLeg;

    public Modeldark_latex_fox_scientist(ModelPart root) {
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
        partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(23, 16).addBox(-3.0f, -3.5f, -7.8f, 1.0f, 3.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(20, 4).addBox(2.0f, -3.5f, -7.8f, 1.0f, 3.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(50, 30).addBox(-2.0f, -3.9f, -7.5f, 4.0f, 3.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(0, 16).addBox(-4.0f, -8.0f, -3.5f, 8.0f, 7.0f, 7.0f, new CubeDeformation(0.0f)).texOffs(0, 8).addBox(-3.0f, -4.0f, -4.5f, 6.0f, 3.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(12, 30).addBox(-3.0f, -8.0f, -4.5f, 6.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(28, 4).addBox(-4.0f, -8.0f, -4.5f, 1.0f, 6.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 16).addBox(3.0f, -8.0f, -4.5f, 1.0f, 6.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 5).addBox(-4.0f, -11.0f, -0.5f, 3.0f, 3.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(0, 0).addBox(1.0f, -11.0f, -0.5f, 3.0f, 3.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 0.0f, 0.0f));
        partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(26, 26).addBox(-4.0f, -1.0f, -2.0f, 8.0f, 12.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 0.0f, 0.0f));
        partdefinition.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(16, 33).addBox(-1.0f, -14.9239f, 1.6173f, 2.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 0).addBox(-2.0f, -15.9239f, 2.6173f, 4.0f, 4.0f, 12.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 23.0f, -5.2f, -0.3927f, 0.0f, 0.0f));
        partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(32, 0).addBox(-3.0f, -3.0f, -2.0f, 4.0f, 13.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offset(-5.0f, 2.0f, 0.0f));
        partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(0, 30).addBox(-1.0f, -3.0f, -2.0f, 4.0f, 13.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offset(5.0f, 2.0f, 0.0f));
        PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(48, 43).addBox(-2.0f, -1.0f, -1.9f, 4.0f, 1.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offset(-2.0f, 12.0f, 0.0f));
        LeftLeg.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(46, 23).addBox(-2.0f, 4.3732f, -4.2794f, 4.0f, 3.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 4.6268f, 1.6794f, 0.0f, 0.0f, 0.0f));
        LeftLeg.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(48, 48).addBox(-2.0f, 0.0f, -1.0f, 4.0f, 7.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 4.6268f, 2.2794f, -0.3927f, 0.0f, 0.0f));
        LeftLeg.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(16, 42).addBox(-2.0f, 0.0f, -2.0f, 4.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 2.5637f, -2.5296f, 0.7854f, 0.0f, 0.0f));
        LeftLeg.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 47).addBox(-2.0f, 0.0f, -2.0f, 4.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, -0.8f, 0.2f, -0.3927f, 0.0f, 0.0f));
        PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(48, 43).mirror().addBox(-2.0f, -1.0f, -1.9f, 4.0f, 1.0f, 4.0f, new CubeDeformation(0.0f)).mirror(false), PartPose.offset(2.0f, 12.0f, 0.0f));
        RightLeg.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(30, 19).addBox(-2.0f, 4.3732f, -4.2794f, 4.0f, 3.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 4.6268f, 1.6794f, 0.0f, 0.0f, 0.0f));
        RightLeg.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(48, 0).addBox(-2.0f, 0.0f, -1.0f, 4.0f, 7.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 4.6268f, 2.2794f, -0.3927f, 0.0f, 0.0f));
        RightLeg.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(32, 42).addBox(-2.0f, 0.0f, -2.0f, 4.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 2.5637f, -2.5296f, 0.7854f, 0.0f, 0.0f));
        RightLeg.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(44, 13).addBox(-2.0f, 0.0f, -2.0f, 4.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, -0.8f, 0.2f, -0.3927f, 0.0f, 0.0f));
        return LayerDefinition.create(meshdefinition, 64, 64);
    }

    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.Head.yRot = netHeadYaw / 57.295776f;
        this.Head.xRot = headPitch / 57.295776f;
        this.RightLeg.xRot = Mth.cos(limbSwing * 1.0f) * 1.0f * limbSwingAmount;
        this.RightArm.xRot = Mth.cos((limbSwing * 0.6662f) + 3.1415927f) * limbSwingAmount;
        this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662f) * limbSwingAmount;
        this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0f) * -1.0f * limbSwingAmount;
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
}
