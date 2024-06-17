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

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/model/ModelDark_latex_fox.class */
public class ModelDark_latex_fox<T extends Entity> extends EntityModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(LatexMod.MODID, "model_dark_latex_fox"), "main");
    public final ModelPart Head;
    public final ModelPart Body;
    public final ModelPart Tail;
    public final ModelPart LeftArm;
    public final ModelPart RightArm;
    public final ModelPart LeftLeg;
    public final ModelPart RightLeg;

    public ModelDark_latex_fox(ModelPart root) {
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
        partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(47, 39).addBox(-2.0f, -2.9f, -6.5f, 4.0f, 3.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(0, 16).addBox(-4.0f, -7.0f, -3.5f, 8.0f, 7.0f, 7.0f, new CubeDeformation(0.0f)).texOffs(20, 0).addBox(-4.0f, -10.0f, -0.5f, 3.0f, 3.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(0, 3).addBox(1.0f, -10.0f, -0.5f, 3.0f, 3.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 0.0f, 0.0f)).addOrReplaceChild("Mask", CubeListBuilder.create().texOffs(0, 11).addBox(-2.0f, -7.2f, -4.2f, 4.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(0, 8).addBox(-3.0f, -6.2f, -4.2f, 6.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(0, 19).addBox(-1.0f, -5.2f, -4.2f, 2.0f, 2.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(20, 5).addBox(-2.0f, -3.2f, -7.2f, 4.0f, 2.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(0, 4).addBox(-2.0f, -1.2f, -7.2f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(8, 3).addBox(1.0f, -1.2f, -7.2f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(4, 19).addBox(2.0f, -3.2f, -4.2f, 1.0f, 3.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(0, 0).addBox(3.0f, -5.2f, -4.2f, 1.0f, 4.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(0, 6).addBox(2.1f, -3.2f, -7.2f, 0.0f, 2.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(6, 6).addBox(-2.1f, -3.2f, -7.2f, 0.0f, 2.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(20, 7).addBox(-3.0f, -3.2f, -4.2f, 1.0f, 3.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(10, 3).addBox(-4.0f, -5.2f, -4.2f, 1.0f, 4.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(0, 0).addBox(-2.0f, -3.2f, -7.2f, 4.0f, 0.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 0.0f, 0.375f));
        partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(26, 26).addBox(-4.0f, 0.0f, -2.0f, 8.0f, 12.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 0.0f, 0.0f));
        partdefinition.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(0, 16).addBox(-1.0f, -14.0f, 2.0f, 2.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 0).addBox(-2.0f, -15.0f, 3.0f, 4.0f, 4.0f, 12.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 23.0f, -5.2f, -0.3927f, 0.0f, 0.0f));
        partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(32, 0).addBox(-2.0f, -2.0f, -2.0f, 3.0f, 13.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offset(-5.0f, 2.0f, 0.0f));
        partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(0, 30).addBox(-1.0f, -2.0f, -2.0f, 3.0f, 13.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offset(5.0f, 2.0f, 0.0f));
        PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create(), PartPose.offset(-2.0f, 12.0f, 0.0f));
        LeftLeg.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(46, 23).addBox(-2.0f, 4.3732f, -4.2794f, 4.0f, 3.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 4.6268f, 1.6794f));
        LeftLeg.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(46, 0).addBox(-2.0f, 0.0f, -1.0f, 4.0f, 7.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 4.6268f, 2.2794f, -0.3927f, 0.0f, 0.0f));
        LeftLeg.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(14, 38).addBox(-2.0f, 0.0f, -2.0f, 4.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 2.5637f, -2.5296f, 0.7854f, 0.0f, 0.0f));
        LeftLeg.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(46, 46).addBox(-2.0f, 0.0f, -2.0f, 4.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, -0.8f, 0.2f, -0.3927f, 0.0f, 0.0f));
        PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create(), PartPose.offset(2.0f, 12.0f, 0.0f));
        RightLeg.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(30, 19).addBox(-2.0f, 4.3732f, -4.2794f, 4.0f, 3.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 4.6268f, 1.6794f));
        RightLeg.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 47).addBox(-2.0f, 0.0f, -1.0f, 4.0f, 7.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 4.6268f, 2.2794f, -0.3927f, 0.0f, 0.0f));
        RightLeg.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(30, 42).addBox(-2.0f, 0.0f, -2.0f, 4.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 2.5637f, -2.5296f, 0.7854f, 0.0f, 0.0f));
        RightLeg.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(42, 13).addBox(-2.0f, 0.0f, -2.0f, 4.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, -0.8f, 0.2f, -0.3927f, 0.0f, 0.0f));
        return LayerDefinition.create(meshdefinition, 64, 64);
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
