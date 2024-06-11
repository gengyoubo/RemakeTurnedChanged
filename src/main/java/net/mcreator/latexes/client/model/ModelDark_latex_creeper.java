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

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/model/ModelDark_latex_creeper.class */
public class ModelDark_latex_creeper<T extends Entity> extends EntityModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(LatexMod.MODID, "model_dark_latex_creeper"), "main");
    public final ModelPart head;
    public final ModelPart body;
    public final ModelPart leg0;
    public final ModelPart leg1;
    public final ModelPart leg2;
    public final ModelPart leg3;

    public ModelDark_latex_creeper(ModelPart root) {
        this.head = root.getChild("head");
        this.body = root.getChild("body");
        this.leg0 = root.getChild("leg0");
        this.leg1 = root.getChild("leg1");
        this.leg2 = root.getChild("leg2");
        this.leg3 = root.getChild("leg3");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0f, -10.7721f, -6.6047f, 8.0f, 8.0f, 8.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 6.0f, 0.0f));
        head.addOrReplaceChild("Crest", CubeListBuilder.create().texOffs(0, 3).addBox(0.0f, -6.0f, -4.0f, 0.0f, 1.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(18, 16).addBox(0.0f, -7.0f, -4.0f, 0.0f, 1.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(18, 13).addBox(0.0f, -7.0f, 2.0f, 0.0f, 3.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(0, 23).addBox(0.0f, -6.0f, 5.0f, 0.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 0).addBox(0.0f, -2.0f, 2.0f, 0.0f, 4.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(2, 15).addBox(0.0f, -1.0f, 5.0f, 0.0f, 3.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, -5.7721f, -2.6047f));
        head.addOrReplaceChild("Mask", CubeListBuilder.create().texOffs(34, 21).addBox(-3.0f, 2.25f, -4.5f, 2.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(0, 2).addBox(1.0f, 2.25f, -4.5f, 2.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(24, 19).addBox(-1.0f, 1.75f, -4.5f, 2.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(40, 31).addBox(3.0f, -3.0f, -4.5f, 1.0f, 6.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(24, 0).addBox(-3.0f, -4.0f, -4.5f, 6.0f, 4.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(32, 11).addBox(1.0f, 0.0f, -4.5f, 2.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(24, 18).addBox(-3.0f, 0.0f, -4.5f, 2.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(16, 24).addBox(-4.0f, -3.0f, -4.5f, 1.0f, 6.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(24, 16).addBox(-6.0f, 0.0f, -4.5f, 2.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(22, 20).addBox(-1.0f, -5.0f, -4.5f, 2.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(24, 17).addBox(4.0f, 0.0f, -4.5f, 2.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(4, 2).addBox(-5.0f, -1.0f, -4.5f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(6, 6).addBox(4.0f, -1.0f, -4.5f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, -5.7721f, -2.4797f));
        PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0f, 24.0f, 0.0f));
        body.addOrReplaceChild("body_r1", CubeListBuilder.create().texOffs(0, 16).addBox(-3.5f, -12.0f, -2.125f, 7.0f, 4.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(40, 9).addBox(-2.5f, -6.5f, -4.625f, 5.0f, 5.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(0, 24).addBox(-3.0f, -8.0f, -3.0f, 6.0f, 9.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(44, 31).addBox(-3.0f, -7.0f, -4.0f, 6.0f, 6.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(24, 42).addBox(-3.0f, -1.0f, 2.0f, 6.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(19, 21).addBox(-3.0f, -8.0f, -1.0f, 6.0f, 9.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, -10.0f, 0.0f, 0.1745f, 0.0f, 0.0f));
        body.addOrReplaceChild("Crest2", CubeListBuilder.create(), PartPose.offset(0.0f, -9.0f, 0.0f)).addOrReplaceChild("body_r2", CubeListBuilder.create().texOffs(14, 23).addBox(0.0f, -3.0f, 4.0f, 0.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(6, 1).addBox(0.0f, -5.0f, 3.0f, 0.0f, 4.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(16, 29).addBox(0.0f, -8.0f, 4.0f, 0.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 15).addBox(0.0f, -10.0f, 3.0f, 0.0f, 4.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 0).addBox(-1.5f, -6.125f, 1.375f, 3.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(44, 2).addBox(-2.5f, -7.75f, 1.375f, 5.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 35).addBox(-3.0f, -9.375f, 1.375f, 6.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(24, 33).addBox(-3.375f, -9.5f, -2.375f, 2.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(32, 9).addBox(1.375f, -9.5f, -2.375f, 2.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(24, 4).addBox(-3.375f, -11.125f, -2.5f, 3.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(24, 6).addBox(0.375f, -11.125f, -2.5f, 3.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(44, 0).addBox(-3.0f, -11.0f, 1.375f, 6.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(38, 41).addBox(0.0f, -11.0f, 2.0f, 0.0f, 10.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, -1.0f, 0.0f, 0.1745f, 0.0f, 0.0f));
        partdefinition.addOrReplaceChild("leg0", CubeListBuilder.create().texOffs(28, 33).addBox(-2.0f, 4.75f, -1.0f, 4.0f, 5.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offset(-2.25f, 14.25f, 3.0f)).addOrReplaceChild("leg1_r1", CubeListBuilder.create().texOffs(40, 38).addBox(-3.25f, -3.5f, -2.0f, 3.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(1.75f, 3.2057f, 0.1955f, 0.3927f, 0.0f, 0.0f));
        partdefinition.addOrReplaceChild("leg1", CubeListBuilder.create().texOffs(12, 33).addBox(-2.0f, 4.75f, -1.0f, 4.0f, 5.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offset(2.25f, 14.25f, 3.0f)).addOrReplaceChild("leg2_r1", CubeListBuilder.create().texOffs(14, 42).addBox(1.25f, -3.5f, -2.0f, 3.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-2.75f, 3.2057f, 0.1955f, 0.3927f, 0.0f, 0.0f));
        partdefinition.addOrReplaceChild("leg2", CubeListBuilder.create().texOffs(32, 0).addBox(-2.0f, 4.75f, -3.25f, 4.0f, 5.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offset(-2.25f, 14.25f, -3.0f)).addOrReplaceChild("leg3_r1", CubeListBuilder.create().texOffs(37, 21).addBox(-3.25f, -3.5f, -2.0f, 3.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(1.75f, 3.2057f, -0.4455f, -0.3927f, 0.0f, 0.0f));
        partdefinition.addOrReplaceChild("leg3", CubeListBuilder.create().texOffs(28, 12).addBox(-2.0f, 4.75f, -3.25f, 4.0f, 5.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offset(2.25f, 14.25f, -3.0f)).addOrReplaceChild("leg4_r1", CubeListBuilder.create().texOffs(0, 38).addBox(1.25f, -3.5f, -2.0f, 3.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-2.75f, 3.2057f, -0.4455f, -0.3927f, 0.0f, 0.0f));
        return LayerDefinition.create(meshdefinition, 64, 64);
    }

    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        this.head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.leg0.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.leg1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.leg2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.leg3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.head.yRot = netHeadYaw / 57.295776f;
        this.head.xRot = headPitch / 57.295776f;
        this.leg0.xRot = Mth.cos(limbSwing * 1.0f) * 1.0f * limbSwingAmount;
        this.leg1.xRot = Mth.cos(limbSwing * 1.0f) * 1.0f * limbSwingAmount;
        this.leg2.xRot = Mth.cos(limbSwing * 1.0f) * -1.0f * limbSwingAmount;
        this.leg3.xRot = Mth.cos(limbSwing * 1.0f) * -1.0f * limbSwingAmount;
    }
}
