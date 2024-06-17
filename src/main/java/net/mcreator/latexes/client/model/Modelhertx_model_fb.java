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

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/model/Modelhertx_model_fb.class */
public class Modelhertx_model_fb<T extends Entity> extends EntityModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(LatexMod.MODID, "modelhertx_model_fb"), "main");
    public final ModelPart Head;
    public final ModelPart Body;
    public final ModelPart Tail;
    public final ModelPart LeftArm;
    public final ModelPart RightArm;
    public final ModelPart LeftLeg;
    public final ModelPart RightLeg;

    public Modelhertx_model_fb(ModelPart root) {
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
        partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(15, 13).addBox(-3.0f, -1.7f, -5.0f, 6.0f, 1.0f, 7.0f, new CubeDeformation(0.0f)).texOffs(52, 41).addBox(-2.0f, -2.8f, -3.0f, 4.0f, 1.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(58, 47).addBox(-2.0f, -6.8f, 2.0f, 4.0f, 4.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(0, 7).addBox(-2.0f, -2.8f, 3.0f, 4.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(58, 3).addBox(-3.0f, -2.8f, 2.0f, 6.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(38, 0).addBox(-2.5f, -0.8f, -2.4f, 5.0f, 1.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(0, 17).addBox(2.0f, -6.8f, 2.0f, 1.0f, 4.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(5, 16).addBox(-3.0f, -6.8f, 2.0f, 1.0f, 4.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 27).addBox(-3.0f, -6.8f, -3.0f, 6.0f, 1.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(41, 57).addBox(2.0f, -5.8f, -4.0f, 1.0f, 3.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(49, 50).addBox(2.0f, -2.7f, -5.0f, 1.0f, 1.0f, 7.0f, new CubeDeformation(0.0f)).texOffs(0, 56).addBox(-3.0f, -5.8f, -4.0f, 1.0f, 3.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(53, 0).addBox(-3.0f, -4.8f, -5.0f, 6.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 46).addBox(-3.0f, -2.7f, -5.0f, 1.0f, 1.0f, 7.0f, new CubeDeformation(0.0f)).texOffs(58, 54).addBox(-2.0f, -5.8f, -5.0f, 4.0f, 1.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(0, 25).addBox(-2.0f, -6.8f, -4.0f, 4.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(10, 25).addBox(-2.0f, -2.7f, -5.0f, 4.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, -2.6f, -0.2f)).addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(15, 15).addBox(-3.0f, -8.3801f, 8.5093f, 1.0f, 2.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(0, 0).addBox(-3.0f, -8.3801f, 10.5093f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(60, 27).addBox(-3.0f, -8.3801f, 4.5093f, 1.0f, 3.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(0, 13).addBox(2.0f, -8.3801f, 8.5093f, 1.0f, 2.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(0, 2).addBox(2.0f, -8.3801f, 10.5093f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 0).addBox(2.0f, -8.3801f, 4.5093f, 1.0f, 3.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 3.0f, 0.0f, 0.2618f, 0.0f, 0.0f));
        partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(26, 8).addBox(-4.0f, 8.2f, -2.0f, 8.0f, 1.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(16, 0).addBox(-3.5f, 4.2f, -2.0f, 7.0f, 4.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(20, 21).addBox(-4.0f, -2.8f, -2.0f, 8.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(55, 58).addBox(-3.5f, -2.9875f, -2.75f, 7.0f, 5.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(15, 13).addBox(-1.0f, 3.0125f, -2.3125f, 2.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(16, 8).addBox(-3.0f, 2.0125f, -2.5f, 6.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition Tail = partdefinition.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offset(0.0f, 0.0f, 0.0f));
        Tail.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 13).addBox(-1.3f, 9.2337f, 12.5679f, 3.0f, 3.0f, 9.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.3927f, 0.0f, 0.0f));
        Tail.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-1.3f, 3.4929f, 6.2929f, 3.0f, 3.0f, 10.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.7854f, 0.0f, 0.0f));
        partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(42, 45).addBox(-1.7385f, -1.8114f, -2.0f, 3.0f, 8.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(41, 13).addBox(-2.7385f, 6.1886f, -2.0f, 4.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(16, 0).addBox(-2.7385f, 13.1886f, 1.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(6, 2).addBox(-2.7385f, 13.1886f, -2.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(6, 0).addBox(-0.7385f, 13.1886f, -2.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(4, 13).addBox(-2.7385f, 13.1886f, -0.5f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-5.0625f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0873f));
        partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(28, 45).addBox(-1.2615f, -1.8114f, -2.0f, 3.0f, 8.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(34, 34).addBox(-1.2615f, 6.1886f, -2.0f, 4.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(16, 2).addBox(-0.2615f, 13.1886f, -2.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 27).addBox(1.7385f, 13.1886f, -2.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(26, 10).addBox(1.7385f, 13.1886f, -0.5f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 29).addBox(1.7385f, 13.1886f, 1.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(5.0f, -1.0f, 0.0f, 0.0f, 0.0f, -0.0873f));
        PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(57, 13).addBox(-2.0f, -0.8f, -2.0f, 4.0f, 3.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(50, 34).addBox(-2.125f, 12.0f, -2.9102f, 4.0f, 2.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offset(-2.0f, 10.0f, 0.0f));
        LeftLeg.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(27, 57).addBox(-2.0f, 4.3f, 3.0f, 4.0f, 6.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-0.0625f, 2.0f, 0.0f, -0.3927f, 0.0f, 0.0f));
        LeftLeg.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 33).addBox(-1.9375f, 0.0f, -5.8f, 4.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-0.0625f, 2.0f, 0.0f, 0.7854f, 0.0f, 0.0f));
        LeftLeg.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(44, 24).addBox(-2.0f, -0.6f, -2.2f, 4.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-0.0625f, 2.0f, 0.0f, -0.3927f, 0.0f, 0.0f));
        PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(56, 20).addBox(-2.0f, -0.8f, -2.0f, 4.0f, 3.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(50, 6).addBox(-1.875f, 12.0f, -2.9102f, 4.0f, 2.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offset(2.0f, 10.0f, 0.0f));
        RightLeg.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(13, 53).addBox(-2.0f, 4.3f, 3.0f, 4.0f, 6.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0625f, 2.0f, 0.0f, -0.3927f, 0.0f, 0.0f));
        RightLeg.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(18, 32).addBox(-2.0625f, 0.0f, -5.8f, 4.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0625f, 2.0f, 0.0f, 0.7854f, 0.0f, 0.0f));
        RightLeg.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(12, 43).addBox(-2.0f, -0.6f, -2.2f, 4.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0625f, 2.0f, 0.0f, -0.3927f, 0.0f, 0.0f));
        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    public void renderToBuffer(@NotNull PoseStack poseStack, @NotNull VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        this.Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.Tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
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
