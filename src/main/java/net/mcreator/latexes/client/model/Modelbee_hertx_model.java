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

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/model/Modelbee_hertx_model.class */
public class Modelbee_hertx_model<T extends Entity> extends EntityModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(LatexMod.MODID, "modelbee_hertx_model"), "main");
    public final ModelPart Head;
    public final ModelPart Body;
    public final ModelPart LeftArm;
    public final ModelPart RightArm;
    public final ModelPart LeftLeg;
    public final ModelPart RightLeg;

    public Modelbee_hertx_model(ModelPart root) {
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
        PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 31).addBox(-3.0f, -1.4f, -5.0f, 6.0f, 1.0f, 7.0f, new CubeDeformation(0.0f)).texOffs(58, 11).addBox(-3.0f, -6.4f, 2.0f, 6.0f, 6.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(32, 25).addBox(-3.0f, -6.4f, 3.0f, 6.0f, 4.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(44, 60).addBox(-3.0f, -2.4f, -4.0f, 1.0f, 1.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(50, 12).addBox(-3.0f, -5.4f, -4.0f, 1.0f, 3.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(58, 18).addBox(2.0f, -2.4f, -4.0f, 1.0f, 1.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(54, 54).addBox(2.0f, -5.4f, -4.0f, 1.0f, 3.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(60, 38).addBox(-3.0f, -2.4f, -5.0f, 6.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(48, 41).addBox(-3.0f, -5.4f, -5.0f, 6.0f, 3.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(32, 18).addBox(-3.0f, -6.4f, -4.0f, 6.0f, 1.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(45, 35).addBox(-2.5f, -0.4f, -1.9f, 5.0f, 1.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, -5.0f, 0.0f));
        Head.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(26, 15).addBox(2.0f, -10.8124f, 2.5135f, 1.0f, 4.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(20, 0).addBox(-3.0f, -10.8124f, 2.5135f, 1.0f, 4.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 1.35f, 2.75f, 0.3927f, 0.0f, 0.0f)).addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(36, 57).addBox(2.0f, -10.3263f, -5.4786f, 1.0f, 2.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(6, 7).addBox(2.0f, -9.3263f, -6.4786f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(56, 41).addBox(-3.0f, -10.3263f, -5.4786f, 1.0f, 2.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(25, 21).addBox(-3.0f, -9.3263f, -6.4786f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, -2.067f, 0.6109f, -0.2618f, 0.0f, 0.0f));
        Head.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(50, 21).addBox(-3.0f, -0.7071f, -7.7782f, 6.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(46, 32).addBox(-3.0f, -3.5355f, -0.2929f, 6.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(56, 49).addBox(-3.0f, -0.2929f, -7.7782f, 6.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(48, 45).addBox(-3.0f, -3.1213f, -0.2929f, 6.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, -0.4f, 1.0f, -0.7854f, 0.0f, 0.0f));
        PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(26, 31).addBox(-4.0f, 1.0f, -2.0f, 8.0f, 5.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(20, 0).addBox(-5.0f, 0.0f, -3.0f, 10.0f, 4.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(46, 25).addBox(-3.0f, 6.0f, -2.0f, 6.0f, 3.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(32, 10).addBox(-4.0f, 9.0f, -2.0f, 8.0f, 4.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, -5.0f, 0.0f));
        PartDefinition Wings = Body.addOrReplaceChild("Wings", CubeListBuilder.create(), PartPose.offset(0.0f, 4.0f, 1.0f));
        Wings.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(6, 15).addBox(-4.3f, -2.5f, 1.4f, 1.0f, 6.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(19, 31).addBox(-3.3f, -0.5f, 1.4f, 1.0f, 3.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(24, 0).addBox(-5.3f, -1.5f, 1.4f, 1.0f, 6.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(6, 0).addBox(-7.3f, -1.5f, 1.4f, 2.0f, 7.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(0, 0).addBox(-10.3f, -0.5f, 1.4f, 3.0f, 7.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(0, 30).addBox(-11.3f, -0.5f, 1.4f, 1.0f, 6.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(0, 7).addBox(-10.3f, -1.5f, 1.4f, 3.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(0, 8).addBox(-7.3f, -2.5f, 1.4f, 3.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(6, 9).addBox(-4.3f, -3.5f, 1.4f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.2618f, 0.0f));
        Wings.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(30, 10).addBox(10.3f, -0.5f, 1.4f, 1.0f, 6.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(0, 9).addBox(7.3f, 5.5f, 1.4f, 3.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(22, 15).addBox(5.3f, -1.5f, 1.4f, 2.0f, 7.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(4, 30).addBox(4.3f, -1.5f, 1.4f, 1.0f, 6.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(2, 30).addBox(3.3f, -2.5f, 1.4f, 1.0f, 6.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(21, 31).addBox(2.3f, -0.5f, 1.4f, 1.0f, 3.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(8, 9).addBox(3.3f, -3.5f, 1.4f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(0, 22).addBox(4.3f, -2.5f, 1.4f, 3.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(0, 15).addBox(7.3f, -1.5f, 1.4f, 3.0f, 7.0f, 0.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.2618f, 0.0f));
        Body.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(60, 32).addBox(-1.5f, 4.3045f, 3.2193f, 3.0f, 3.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(0, 15).addBox(-3.5f, 2.3045f, 6.2193f, 7.0f, 7.0f, 8.0f, new CubeDeformation(0.0f)).texOffs(0, 0).addBox(-2.5f, 3.3045f, 5.2193f, 5.0f, 5.0f, 10.0f, new CubeDeformation(0.0f)).texOffs(17, 17).addBox(-0.5f, 5.3045f, 5.2193f, 1.0f, 1.0f, 13.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 5.0f, 0.0f, -0.3927f, 0.0f, 0.0f));
        partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(44, 48).addBox(-3.0f, 6.0f, -2.0f, 4.0f, 8.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(28, 52).addBox(-2.0f, -1.0f, -2.0f, 3.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offset(-5.0f, -3.0f, 0.0f));
        partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(32, 40).addBox(-1.0f, 6.0f, -2.0f, 4.0f, 8.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(52, 0).addBox(-1.0f, -1.0f, -2.0f, 3.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offset(5.0f, -3.0f, 0.0f));
        partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(16, 40).addBox(-2.0f, 1.0f, -2.0f, 4.0f, 8.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(14, 52).addBox(-1.0f, 9.0f, -2.0f, 3.0f, 8.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offset(-2.0f, 7.0f, 0.0f));
        partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(0, 39).addBox(-2.0f, 1.0f, -2.0f, 4.0f, 8.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(0, 51).addBox(-2.0f, 9.0f, -2.0f, 3.0f, 8.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offset(2.0f, 7.0f, 0.0f));
        return LayerDefinition.create(meshdefinition, 80, 80);
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
