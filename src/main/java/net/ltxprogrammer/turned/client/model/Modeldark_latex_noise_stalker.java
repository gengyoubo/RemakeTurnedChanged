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

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/model/Modeldark_latex_noise_stalker.class */
public class Modeldark_latex_noise_stalker<T extends Entity> extends EntityModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(LatexMod.MODID, "modeldark_latex_noise_stalker"), "main");
    public final ModelPart Head;
    public final ModelPart Body;
    public final ModelPart Tail;
    public final ModelPart LeftArm;
    public final ModelPart RightArm;
    public final ModelPart LeftLeg;
    public final ModelPart RightLeg;

    public Modeldark_latex_noise_stalker(ModelPart root) {
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
        PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 5).addBox(2.0f, -6.0f, -4.0f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(2, 4).addBox(0.0f, -6.0f, -4.0f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(4, 3).addBox(-1.0f, -6.0f, -4.0f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(4, 2).addBox(-3.0f, -6.0f, -4.0f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(2, 2).addBox(-4.0f, -6.0f, -4.0f, 0.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 2).addBox(-4.0f, -6.0f, -2.0f, 0.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(2, 1).addBox(4.0f, -6.0f, -4.0f, 0.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 1).addBox(4.0f, -6.0f, -2.0f, 0.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 0).addBox(-4.0f, -12.0f, -4.0f, 8.0f, 6.0f, 8.0f, new CubeDeformation(0.0f)).texOffs(48, 21).addBox(-4.0f, -12.0f, 4.0f, 8.0f, 6.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 0.0f, -1.0f));
        Head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(65, 46).addBox(-4.0f, -7.75f, 4.5f, 2.0f, 3.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(46, 66).addBox(-11.3f, -7.75f, 4.5f, 2.0f, 3.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(63, 61).addBox(-4.0f, -7.75f, -0.5f, 2.0f, 4.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(0, 65).addBox(-11.3f, -7.75f, -0.5f, 2.0f, 4.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(6.6f, -4.0f, 2.2f, 0.2182f, 0.0f, 0.0f));
        Head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(55, 14).addBox(-3.0f, -2.0f, -4.0f, 6.0f, 1.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, -3.4f, 0.7f, 0.1745f, 0.0f, 0.0f));
        Head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(18, 43).addBox(-4.0f, -2.0f, 0.0f, 8.0f, 1.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(4, 1).addBox(-2.0f, -2.0f, -4.0f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(4, 4).addBox(1.0f, -2.0f, -4.0f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(3, 0).addBox(-4.0f, -2.0f, -4.0f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(0, 4).addBox(3.0f, -2.0f, -4.0f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(17, 14).addBox(-4.0f, -1.0f, -4.0f, 8.0f, 1.0f, 8.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, -4.0f, 0.3f, 0.1745f, 0.0f, 0.0f));
        partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(24, 25).addBox(-5.0f, -4.0f, -2.0f, 10.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(22, 35).addBox(-4.0f, 2.0f, -2.0f, 8.0f, 4.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(24, 0).addBox(-5.0f, 6.0f, -2.0f, 10.0f, 3.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition Tail = partdefinition.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offset(0.0f, 0.0f, 0.0f));
        Tail.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 14).addBox(-1.5f, -1.75f, 1.0f, 3.0f, 4.0f, 11.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 10.6288f, 7.2606f, -0.2618f, 0.0f, 0.0f));
        Tail.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 29).addBox(-1.5f, -0.75f, -6.0f, 3.0f, 3.0f, 8.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 10.2169f, 6.6575f, -0.3927f, 0.0f, 0.0f));
        PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(0, 0).addBox(-5.7098f, 9.3629f, 1.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 0).addBox(-5.7098f, 9.3629f, -2.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 0).addBox(-5.7098f, 9.3629f, -0.5f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 40).addBox(-5.7098f, 1.3629f, -2.0f, 5.0f, 8.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offset(-5.0f, 2.0f, 0.0f));
        LeftArm.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(47, 30).addBox(-4.0f, -5.0f, -2.8f, 5.0f, 4.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.1f, -1.6f, 0.3f, 0.0f, 0.0f, -0.2618f));
        LeftArm.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(16, 57).addBox(-3.0f, -2.0f, -2.0f, 4.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-1.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.1745f));
        PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(0, 40).mirror().addBox(0.7098f, 1.3629f, -2.0f, 5.0f, 8.0f, 4.0f, new CubeDeformation(0.0f)).mirror(false).texOffs(0, 0).mirror().addBox(4.7098f, 9.3629f, 1.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).mirror(false).texOffs(0, 0).mirror().addBox(4.7098f, 9.3629f, -0.5f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).mirror(false).texOffs(0, 0).mirror().addBox(4.7098f, 9.3629f, -2.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).mirror(false), PartPose.offset(5.0f, 2.0f, 0.0f));
        RightArm.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(16, 57).mirror().addBox(-1.0f, -2.0f, -2.0f, 4.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)).mirror(false), PartPose.offsetAndRotation(1.0f, -2.0f, 0.0f, 0.0f, 0.0f, -0.1745f));
        RightArm.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(13, 48).addBox(-1.0f, -5.0f, -2.8f, 5.0f, 4.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-0.1f, -1.6f, 0.3f, 0.0f, 0.0f, 0.2618f));
        PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(60, 39).addBox(-3.0f, -3.0f, -2.0f, 5.0f, 3.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(62, 29).addBox(-3.125f, 9.9239f, -3.3827f, 5.0f, 2.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offset(-2.0f, 12.0f, 0.0f));
        LeftLeg.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 54).addBox(-3.0f, -2.0f, -1.0f, 5.0f, 8.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-0.125f, 5.4614f, 1.379f, -0.4538f, 0.0f, 0.0f));
        LeftLeg.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(41, 7).addBox(-3.0f, -3.0f, -2.0f, 5.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-0.125f, 4.0006f, -0.3861f, 0.9861f, 0.0f, 0.0f));
        LeftLeg.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(51, 50).addBox(-3.0f, -3.0f, -2.0f, 5.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 2.0063f, -0.9958f, -0.3927f, 0.0f, 0.0f));
        PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(32, 60).addBox(-2.0f, -3.0f, -2.0f, 5.0f, 3.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(50, 60).addBox(-1.875f, 9.9239f, -3.3827f, 5.0f, 2.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offset(2.0f, 12.0f, 0.0f));
        RightLeg.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(55, 0).addBox(-2.0f, -2.0f, -1.0f, 5.0f, 8.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.125f, 5.4614f, 1.379f, -0.4538f, 0.0f, 0.0f));
        RightLeg.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(42, 39).addBox(-2.0f, -3.0f, -2.0f, 5.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.125f, 4.0006f, -0.3861f, 0.9861f, 0.0f, 0.0f));
        RightLeg.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(33, 50).addBox(-2.0f, -3.0f, -2.0f, 5.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 2.0063f, -0.9958f, -0.3927f, 0.0f, 0.0f));
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
