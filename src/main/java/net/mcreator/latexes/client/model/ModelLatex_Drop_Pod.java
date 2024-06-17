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
import net.minecraft.world.entity.Entity;
import org.jetbrains.annotations.NotNull;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/model/ModelLatex_Drop_Pod.class */
public class ModelLatex_Drop_Pod<T extends Entity> extends EntityModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(LatexMod.MODID, "model_latex_drop_pod"), "main");
    public final ModelPart group;

    public ModelLatex_Drop_Pod(ModelPart root) {
        this.group = root.getChild("group");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition Parachadute = meshdefinition.getRoot().addOrReplaceChild("group", CubeListBuilder.create().texOffs(100, 100).addBox(15.0f, -22.0f, -17.0f, 2.0f, 30.0f, 18.0f, new CubeDeformation(0.0f)).texOffs(60, 95).addBox(-1.0f, -22.0f, -17.0f, 2.0f, 30.0f, 18.0f, new CubeDeformation(0.0f)).texOffs(88, 31).addBox(0.0f, -22.0f, -17.0f, 15.0f, 30.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(45, 72).addBox(0.0f, -1.0f, -0.25f, 16.0f, 8.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(0, 0).addBox(12.0f, -9.0f, -0.25f, 4.0f, 8.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(0, 15).addBox(6.0f, -3.0f, -0.25f, 6.0f, 2.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(0, 31).addBox(8.0f, -4.0f, -0.25f, 4.0f, 1.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(12, 5).addBox(11.0f, -5.0f, -0.25f, 1.0f, 1.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(69, 0).addBox(0.0f, -22.0f, -0.25f, 16.0f, 2.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(69, 63).addBox(0.0f, -20.0f, -0.25f, 11.0f, 2.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(45, 82).addBox(0.0f, -18.0f, -0.25f, 10.0f, 2.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(0, 10).addBox(0.0f, -16.0f, -0.25f, 6.0f, 3.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(0, 24).addBox(0.0f, -13.0f, -0.25f, 3.0f, 5.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(12, 0).addBox(3.0f, -13.0f, -0.25f, 1.0f, 3.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(10, 24).addBox(6.0f, -16.0f, -0.25f, 1.0f, 1.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(69, 5).addBox(-1.5f, -29.0f, -17.5f, 19.0f, 7.0f, 19.0f, new CubeDeformation(0.0f)).texOffs(69, 69).addBox(-1.5f, 7.0f, -17.5f, 19.0f, 7.0f, 19.0f, new CubeDeformation(0.0f)).texOffs(0, 72).addBox(0.5f, -21.0f, -15.5f, 15.0f, 28.0f, 15.0f, new CubeDeformation(0.0f)), PartPose.offset(-8.0f, 16.0f, 8.0f)).addOrReplaceChild("Parachadute", CubeListBuilder.create().texOffs(0, 48).addBox(-12.5f, -45.0f, -9.5f, 25.0f, 5.0f, 19.0f, new CubeDeformation(0.0f)), PartPose.offset(8.0f, -4.0f, -8.0f));
        Parachadute.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(0, 24).addBox(9.71f, -13.9898f, -10.0f, 25.0f, 5.0f, 19.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-0.5f, -34.0f, 0.5f, 0.0f, 0.0f, 0.2618f));
        Parachadute.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(0, 0).addBox(-34.71f, -13.9898f, -10.0f, 25.0f, 5.0f, 19.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.5f, -34.0f, 0.5f, 0.0f, 0.0f, -0.2618f));
        Parachadute.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(12, 115).addBox(-10.0f, -31.0f, 4.0f, 1.0f, 25.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(2.5f, -19.0f, -6.5f, 0.0f, 0.0f, -0.6545f));
        Parachadute.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(0, 115).addBox(9.0f, -31.0f, 4.0f, 1.0f, 25.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-2.5f, -19.0f, -6.5f, 0.0f, 0.0f, 0.6545f));
        return LayerDefinition.create(meshdefinition, 160, 160);
    }

    public void renderToBuffer(@NotNull PoseStack poseStack, @NotNull VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        this.group.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setupAnim(@NotNull T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }
}
