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

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/model/ModelProtector_remaster_sit.class */
public class ModelProtector_remaster_sit<T extends Entity> extends EntityModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(LatexMod.MODID, "model_protector_remaster_sit"), "main");
    public final ModelPart LeftLeg;
    public final ModelPart RightLeg;
    public final ModelPart LeftArm;
    public final ModelPart RightArm;
    public final ModelPart Body;
    public final ModelPart Head;

    public ModelProtector_remaster_sit(ModelPart root) {
        this.LeftLeg = root.getChild("LeftLeg");
        this.RightLeg = root.getChild("RightLeg");
        this.LeftArm = root.getChild("LeftArm");
        this.RightArm = root.getChild("RightArm");
        this.Body = root.getChild("Body");
        this.Head = root.getChild("Head");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0f, 21.0f, 0.0f, -1.6583f, 0.1307f, 0.0f));
        LeftLeg.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(52, 18).addBox(-1.375f, -4.0f, -2.375f, 3.0f, 1.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-1.0f, 3.85f, 0.0f, -0.0436f, 0.0f, 0.0f));
        LeftLeg.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(34, 17).addBox(-2.375f, -3.0f, -2.375f, 4.0f, 5.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-0.375f, 3.475f, 0.0f, -0.0436f, 0.0f, 0.0f));
        PartDefinition bone2 = LeftLeg.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.25f, 4.0398f, 2.347f, -0.0019f, 0.0436f, -0.2618f));
        bone2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(54, 31).addBox(-2.0f, -1.0f, -1.0f, 4.0f, 6.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 7.0f, 0.0f, -0.7854f, 0.0f, 0.0f));
        bone2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(10, 55).addBox(-1.0f, 0.0f, -2.0f, 3.0f, 5.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-0.375f, 4.5602f, -2.347f, 0.3927f, 0.0f, 0.0f));
        bone2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(38, 28).addBox(-4.375f, -5.0f, -2.0f, 4.0f, 8.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(2.5f, 2.5602f, -2.347f, -0.1309f, 0.0f, 0.0f));
        bone2.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(56, 40).addBox(-2.0525f, -1.5833f, -2.4923f, 4.0f, 3.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(47, 18).addBox(-2.0525f, -0.5833f, -3.4923f, 4.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0525f, 10.533f, -2.629f, 1.0388f, 0.1098f, 0.0034f));
        PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0f, 21.0f, 0.0f, -1.6583f, -0.1742f, -0.0019f));
        RightLeg.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(56, 6).addBox(-1.625f, -4.0f, -2.375f, 3.0f, 1.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(1.0f, 3.85f, 0.0f, -0.0436f, 0.0f, 0.0f));
        RightLeg.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 40).addBox(-1.625f, -3.0f, -2.375f, 4.0f, 5.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.375f, 3.475f, 0.0f, -0.0436f, 0.0f, 0.0f));
        PartDefinition bone = RightLeg.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8081f, 4.9895f, 0.0344f, -0.0077f, -0.1744f, 0.3497f));
        bone.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(18, 43).addBox(0.375f, -5.0f, -2.0f, 4.0f, 8.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-2.0f, 2.0f, 0.0f, -0.1309f, 0.0f, 0.0f));
        bone.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(24, 55).addBox(-2.0f, 0.0f, -2.0f, 3.0f, 5.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.875f, 4.0f, 0.0f, 0.3927f, 0.0f, 0.0f));
        bone.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(47, 58).addBox(-2.0f, -1.0f, -1.0f, 4.0f, 6.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.5f, 6.4398f, 2.347f, -0.7854f, 0.0f, 0.0f));
        bone.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(61, 0).addBox(-1.9365f, -1.5865f, -2.4923f, 4.0f, 3.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(8, 50).addBox(-1.9365f, -0.5865f, -3.4923f, 4.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.4365f, 9.976f, -0.2821f, 1.4429f, -0.05f, -0.121f));
        partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(0, 61).addBox(-1.8264f, -1.4152f, -1.5f, 3.0f, 6.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-5.0f, 12.0f, 0.0f, -0.9599f, 0.0f, 0.1745f)).addOrReplaceChild("wrist_l", CubeListBuilder.create().texOffs(45, 0).addBox(-1.6108f, -0.1215f, -2.0f, 4.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(0, 27).addBox(1.3892f, 6.8785f, -2.0f, 1.0f, 1.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(21, 13).addBox(-1.6108f, 6.8785f, -2.0f, 2.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 18).addBox(-1.6108f, 6.8785f, -0.5f, 2.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(4, 0).addBox(-1.6108f, 6.8785f, 1.0f, 2.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-1.2155f, 4.7063f, 0.0f, 0.0f, 0.0f, -0.6981f));
        partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(35, 61).addBox(-1.1736f, -1.4152f, -1.5f, 3.0f, 6.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(5.0f, 12.0f, 0.0f, -0.9599f, 0.0f, -0.1745f)).addOrReplaceChild("wrist_r", CubeListBuilder.create().texOffs(14, 27).addBox(-2.3892f, 6.8785f, -2.0f, 1.0f, 1.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(27, 17).addBox(-0.3892f, 6.8785f, 1.0f, 2.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 30).addBox(-0.3892f, 6.8785f, -0.5f, 2.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(14, 30).addBox(-0.3892f, 6.8785f, -2.0f, 2.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(34, 48).addBox(-2.3892f, -0.1215f, -2.0f, 4.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(1.2155f, 4.7063f, 0.0f, 0.0f, 0.0f, 0.7854f));
        PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(19, 0).addBox(-4.0f, 0.6342f, -1.7156f, 8.0f, 5.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(61, 58).addBox(-2.0f, -1.8658f, -0.5906f, 4.0f, 2.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(0, 27).addBox(2.0f, -1.3658f, -3.0906f, 3.0f, 5.0f, 8.0f, new CubeDeformation(0.0f)).texOffs(0, 50).addBox(5.0f, -0.3658f, -2.0906f, 1.0f, 3.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(48, 42).addBox(-6.0f, -0.3658f, -2.0906f, 1.0f, 3.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(50, 51).addBox(-3.0f, -0.1158f, -2.5906f, 6.0f, 5.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(20, 19).addBox(-5.0f, -1.3658f, -3.0906f, 3.0f, 5.0f, 8.0f, new CubeDeformation(0.0f)).texOffs(50, 25).addBox(-4.0f, -0.6158f, 2.7844f, 8.0f, 4.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(47, 13).addBox(-3.5f, 11.6342f, -1.0906f, 7.0f, 1.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(25, 10).addBox(-3.5f, 9.6342f, -1.2156f, 7.0f, 2.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(34, 40).addBox(-3.0f, 5.6342f, -1.2156f, 6.0f, 4.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 10.0f, -1.0f, 0.0873f, 0.0f, 0.0f));
        Body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(62, 46).addBox(-3.0f, -3.0f, 1.0f, 5.0f, 3.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.5f, 4.4764f, 1.4632f, -0.4363f, 0.0f, 0.0f));
        Body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(61, 63).addBox(-3.0f, -3.0f, 1.0f, 5.0f, 5.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.5f, 8.2264f, 1.2132f, 0.1745f, 0.0f, 0.0f));
        PartDefinition Tail = Body.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0f, 9.6342f, 0.7844f, 0.3491f, 0.0f, 0.0f));
        Tail.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0f, -0.875f, -5.375f, 4.0f, 2.0f, 11.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 9.3866f, 11.9212f, -0.5236f, 0.0f, 0.0f));
        Tail.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(14, 32).addBox(-2.0f, -2.0711f, 0.9289f, 4.0f, 3.0f, 8.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 1.0f, 0.0f, -0.7854f, 0.0f, 0.0f));
        partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 13).addBox(-3.5f, -6.4f, -3.375f, 7.0f, 7.0f, 7.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 9.0f, -0.25f)).addOrReplaceChild("Ears", CubeListBuilder.create(), PartPose.offset(0.0f, -8.4f, 0.125f)).addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(6, 8).addBox(3.5f, -11.0f, 1.5f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(6, 2).addBox(3.5f, -9.0f, 1.5f, 1.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(12, 64).addBox(3.5f, -12.0f, -0.5f, 1.0f, 9.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(0, 13).addBox(3.5f, -6.0f, 1.5f, 1.0f, 3.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(19, 0).addBox(-4.5f, -11.0f, 1.5f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(6, 5).addBox(-4.5f, -9.0f, 1.5f, 1.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(21, 15).addBox(-4.5f, -6.0f, 1.5f, 1.0f, 3.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(0, 0).addBox(-4.5f, -12.0f, -0.5f, 1.0f, 9.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 9.0f, 0.0f, 0.3927f, 0.0f, 0.0f));
        return LayerDefinition.create(meshdefinition, 80, 80);
    }

    public void renderToBuffer(@NotNull PoseStack poseStack, @NotNull VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        this.LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setupAnim(@NotNull T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.LeftLeg.xRot = Mth.cos(limbSwing) * -1.0f * limbSwingAmount;
        this.RightArm.xRot = Mth.cos((limbSwing * 0.6662f) + 3.1415927f) * limbSwingAmount;
        this.Head.yRot = netHeadYaw / 57.295776f;
        this.Head.xRot = headPitch / 57.295776f;
        this.RightLeg.xRot = Mth.cos(limbSwing) * 1.0f * limbSwingAmount;
        this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662f) * limbSwingAmount;
    }
}
