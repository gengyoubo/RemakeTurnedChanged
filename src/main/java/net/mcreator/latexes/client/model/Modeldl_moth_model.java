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

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/model/Modeldl_moth_model.class */
public class Modeldl_moth_model<T extends Entity> extends EntityModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(LatexMod.MODID, "modeldl_moth_model"), "main");
    public final ModelPart Head;
    public final ModelPart Body;
    public final ModelPart LeftArm;
    public final ModelPart RightArm;
    public final ModelPart LeftLeg;
    public final ModelPart RightLeg;

    public Modeldl_moth_model(ModelPart root) {
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
        PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(22, 0).addBox(-4.5f, -2.25f, -2.7f, 9.0f, 4.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(27, 10).addBox(-3.0f, -6.0f, -3.0f, 6.0f, 6.0f, 6.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, -2.0f, 0.0f));
        Head.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(38, 42).addBox(-2.0f, -7.0f, -2.0f, 4.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(36, 29).addBox(-3.0f, -6.0f, -2.0f, 6.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(24, 29).addBox(-3.0f, -3.0f, -2.0f, 6.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(0, 0).addBox(-1.0f, -5.0f, -2.0f, 2.0f, 2.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(2, 2).addBox(-4.0f, -5.0f, -2.0f, 1.0f, 2.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(0, 2).addBox(3.0f, -5.0f, -2.0f, 1.0f, 2.0f, 0.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 1.0f, -1.25f));
        Head.addOrReplaceChild("bone8", CubeListBuilder.create().texOffs(56, 47).addBox(-4.0f, -6.0f, 1.0f, 1.0f, 1.0f, 7.0f, new CubeDeformation(0.0f)).texOffs(59, 59).addBox(2.0f, -6.0f, 1.0f, 1.0f, 1.0f, 7.0f, new CubeDeformation(0.0f)).texOffs(0, 5).addBox(2.0f, -7.0f, 1.0f, 1.0f, 1.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(0, 0).addBox(-4.0f, -7.0f, 1.0f, 1.0f, 1.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.5f, 1.25f, 2.0f, 0.3927f, 0.0f, 0.0f));
        PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(30, 30).addBox(-4.0f, 1.0f, -2.0f, 8.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(30, 22).addBox(-4.0f, 9.0f, -2.0f, 8.0f, 3.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(46, 0).addBox(-3.5f, 7.0f, -1.5f, 7.0f, 3.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(0, 26).addBox(-4.5f, 2.0f, -3.0f, 9.0f, 3.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(0, 16).addBox(-5.0f, -1.0f, -3.5f, 10.0f, 3.0f, 7.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, -2.0f, 0.0f));
        Body.addOrReplaceChild("BREAAAAAAAAAAAAAASTS", CubeListBuilder.create().texOffs(48, 6).addBox(-3.5f, -3.7073f, -3.7495f, 7.0f, 4.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 3.5f, 0.5f, 1.1781f, 0.0f, 0.0f));
        Body.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0f, -1.8394f, 1.2472f, 6.0f, 6.0f, 10.0f, new CubeDeformation(0.0f)).texOffs(65, 47).addBox(-2.5f, -1.3394f, 11.2472f, 5.0f, 5.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 9.0f, 0.0f, -0.3927f, 0.0f, 0.0f));
        PartDefinition Wings = Body.addOrReplaceChild("Wings", CubeListBuilder.create(), PartPose.offset(0.0f, 3.0f, 1.5f));
        PartDefinition LeftWing = Wings.addOrReplaceChild("LeftWing", CubeListBuilder.create(), PartPose.offsetAndRotation(9.0f, -2.0f, 4.0f, 0.0f, -0.3927f, 0.0f));
        LeftWing.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(14, 35).addBox(-1.0f, -6.0f, -1.0f, 5.0f, 17.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(10, 54).addBox(-4.0f, -6.0f, -1.0f, 3.0f, 16.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.9635f));
        LeftWing.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(63, 14).addBox(-5.0f, -7.0f, -0.5f, 6.0f, 3.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(38, 40).addBox(-3.0f, -8.0f, -0.5f, 3.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(66, 3).addBox(-9.0f, -6.0f, -0.5f, 4.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.5708f));
        LeftWing.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(32, 57).addBox(-8.0f, -5.0f, -1.0f, 4.0f, 10.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(52, 66).addBox(-10.0f, -5.0f, -1.0f, 2.0f, 9.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(2.0f, 2.0f, 0.0f, 0.0f, 0.0f, -1.1781f));
        PartDefinition Rightwing = Wings.addOrReplaceChild("Rightwing", CubeListBuilder.create(), PartPose.offsetAndRotation(-9.0f, -2.0f, 4.0f, 0.0f, 0.3927f, 0.0f));
        Rightwing.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(0, 35).addBox(-4.0f, -6.0f, -1.0f, 5.0f, 17.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(0, 54).addBox(1.0f, -6.0f, -1.0f, 3.0f, 16.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.9635f));
        Rightwing.addOrReplaceChild("bone6", CubeListBuilder.create().texOffs(62, 55).addBox(-1.0f, -7.0f, -0.5f, 6.0f, 3.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(24, 30).addBox(0.0f, -8.0f, -0.5f, 3.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(63, 0).addBox(5.0f, -6.0f, -0.5f, 4.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.5708f));
        Rightwing.addOrReplaceChild("bone7", CubeListBuilder.create().texOffs(20, 57).addBox(4.0f, -5.0f, -1.0f, 4.0f, 10.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(44, 59).addBox(8.0f, -5.0f, -1.0f, 2.0f, 9.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-2.0f, 2.0f, 0.0f, 0.0f, 0.0f, 1.1781f));
        partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(42, 42).addBox(-2.0f, -2.0f, -2.0f, 3.0f, 13.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offset(-5.0f, 1.0f, 0.0f));
        partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(28, 40).addBox(-1.0f, -2.0f, -2.0f, 3.0f, 13.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offset(5.0f, 1.0f, 0.0f));
        partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(54, 25).addBox(-2.0f, -1.0f, -2.0f, 4.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(56, 36).addBox(-1.0f, 6.0f, -2.0f, 3.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offset(-2.0f, 11.0f, 0.0f));
        partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(51, 14).addBox(-2.0f, -1.0f, -2.0f, 4.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(52, 55).addBox(-2.0f, 6.0f, -2.0f, 3.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offset(2.0f, 11.0f, 0.0f));
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
