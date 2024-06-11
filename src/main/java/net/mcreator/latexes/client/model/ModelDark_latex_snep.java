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

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/model/ModelDark_latex_snep.class */
public class ModelDark_latex_snep<T extends Entity> extends EntityModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(LatexMod.MODID, "model_dark_latex_snep"), "main");
    public final ModelPart Head;
    public final ModelPart Body;
    public final ModelPart LeftArm;
    public final ModelPart RightArm;
    public final ModelPart LeftLeg;
    public final ModelPart Rightleg;

    public ModelDark_latex_snep(ModelPart root) {
        this.Head = root.getChild("Head");
        this.Body = root.getChild("Body");
        this.LeftArm = root.getChild("LeftArm");
        this.RightArm = root.getChild("RightArm");
        this.LeftLeg = root.getChild("LeftLeg");
        this.Rightleg = root.getChild("Rightleg");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(52, 18).addBox(-4.0f, -8.0f, -4.0f, 8.0f, 3.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 17).addBox(-4.0f, -5.0f, -4.0f, 1.0f, 5.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 31).addBox(-3.0f, -5.0f, -4.0f, 1.0f, 3.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(22, 0).addBox(-2.0f, -5.0f, -4.0f, 2.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(23, 21).addBox(0.0f, -5.0f, -4.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 17).addBox(-4.0f, -8.0f, -3.0f, 8.0f, 7.0f, 7.0f, new CubeDeformation(0.0f)).texOffs(23, 18).addBox(-4.0f, -1.0f, 3.0f, 8.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 11).addBox(-4.0f, 1.0f, 3.0f, 5.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(22, 3).addBox(-4.0f, 2.0f, 3.0f, 2.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(3, 22).addBox(-4.0f, 3.0f, 3.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(56, 28).addBox(2.0f, -10.0f, -1.0f, 3.0f, 3.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(56, 22).addBox(-5.0f, -10.0f, -1.0f, 3.0f, 3.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 0.0f, 0.0f)).addOrReplaceChild("mask", CubeListBuilder.create().texOffs(0, 10).addBox(-3.0f, -3.0f, -5.0f, 6.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(0, 1).addBox(-2.0f, -2.0f, -5.0f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(0, 0).addBox(1.0f, -2.0f, -5.0f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(0, 13).addBox(-3.0f, -6.0f, -5.0f, 6.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(11, 0).addBox(-0.5f, -4.0f, -5.0f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(22, 11).addBox(2.375f, -5.0f, -5.0f, 1.0f, 2.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(22, 11).addBox(-3.625f, -5.0f, -5.0f, 1.0f, 2.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(22, 5).addBox(-1.5f, -5.0f, -5.0f, 3.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 0.0f, 1.75f));
        partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 31).addBox(-4.0f, 0.0f, -2.0f, 8.0f, 11.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(22, 0).addBox(-5.0f, -1.0f, -3.0f, 10.0f, 5.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(30, 11).addBox(-3.5f, 4.0f, -3.0f, 7.0f, 1.0f, 6.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 0.0f, 0.0f)).addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0f, -0.5902f, 0.4559f, 4.0f, 3.0f, 14.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 9.0f, 1.0f, -0.5672f, 0.0f, 0.0f)).addOrReplaceChild("bone8", CubeListBuilder.create().texOffs(20, 21).addBox(-2.0f, 6.6167f, -7.7314f, 4.0f, 3.0f, 10.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, -9.4336f, 17.9186f, 0.3927f, 0.0f, 0.0f));
        partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(0, 54).addBox(-3.0f, -2.0f, -2.0f, 4.0f, 5.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(24, 34).addBox(-4.0f, 3.0f, -2.0f, 5.0f, 8.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offset(-5.0f, 2.0f, 0.0f));
        partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(50, 49).addBox(-1.0f, -2.0f, -2.0f, 4.0f, 5.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(38, 18).addBox(-1.0f, 3.0f, -2.0f, 5.0f, 8.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offset(5.0f, 2.0f, 0.0f));
        PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(50, 40).addBox(-2.0f, 0.0f, -2.0f, 4.0f, 2.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(0, 46).addBox(-2.0f, 10.213f, -3.1649f, 4.0f, 3.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offset(-2.0f, 11.0f, 0.0f));
        LeftLeg.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(50, 7).addBox(-2.0f, 0.0f, -2.0f, 4.0f, 5.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 1.0f, 0.0f, -0.3927f, 0.0f, 0.0f));
        LeftLeg.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(18, 46).addBox(-6.0f, 0.0f, -2.0f, 4.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(4.0f, 4.0f, -1.0f, 0.6545f, 0.0f, 0.0f));
        LeftLeg.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(16, 56).addBox(-2.0f, -0.1371f, 3.7689f, 4.0f, 7.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 4.0f, -1.0f, -0.48f, 0.0f, 0.0f));
        PartDefinition Rightleg = partdefinition.addOrReplaceChild("Rightleg", CubeListBuilder.create().texOffs(48, 0).addBox(-2.0f, 0.0f, -2.0f, 4.0f, 2.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(37, 41).addBox(-2.0f, 10.213f, -3.1649f, 4.0f, 3.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offset(2.0f, 11.0f, 0.0f));
        Rightleg.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(34, 49).addBox(-2.0f, 0.0f, -2.0f, 4.0f, 5.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 1.0f, 0.0f, -0.3927f, 0.0f, 0.0f));
        Rightleg.addOrReplaceChild("bone6", CubeListBuilder.create().texOffs(44, 30).addBox(2.0f, 0.0f, -2.0f, 4.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-4.0f, 4.0f, -1.0f, 0.6545f, 0.0f, 0.0f));
        Rightleg.addOrReplaceChild("bone7", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0f, -0.1371f, 3.7689f, 4.0f, 7.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 4.0f, -1.0f, -0.48f, 0.0f, 0.0f));
        return LayerDefinition.create(meshdefinition, 80, 80);
    }

    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        this.Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.Rightleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.RightArm.xRot = Mth.cos((limbSwing * 0.6662f) + 3.1415927f) * limbSwingAmount;
        this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0f) * -1.0f * limbSwingAmount;
        this.Head.yRot = netHeadYaw / 57.295776f;
        this.Head.xRot = headPitch / 57.295776f;
        this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662f) * limbSwingAmount;
        this.Rightleg.xRot = Mth.cos(limbSwing * 1.0f) * 1.0f * limbSwingAmount;
    }
}
