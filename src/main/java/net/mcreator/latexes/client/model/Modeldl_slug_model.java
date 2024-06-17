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

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/model/Modeldl_slug_model.class */
public class Modeldl_slug_model<T extends Entity> extends EntityModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(LatexMod.MODID, "modeldl_slug_model"), "main");
    public final ModelPart Head;
    public final ModelPart Body;
    public final ModelPart leftarm;
    public final ModelPart Rightarm;

    public Modeldl_slug_model(ModelPart root) {
        this.Head = root.getChild("Head");
        this.Body = root.getChild("Body");
        this.leftarm = root.getChild("leftarm");
        this.Rightarm = root.getChild("Rightarm");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 12).addBox(-2.0f, -3.0f, -2.75f, 4.0f, 4.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(19, 4).addBox(-2.0f, -3.0f, -3.0f, 4.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(2, 5).addBox(2.0f, -2.0f, -3.0f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(19, 5).addBox(-2.0f, -1.0f, -3.0f, 4.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(4, 3).addBox(1.0f, 0.0f, -3.0f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(4, 4).addBox(-2.0f, 0.0f, -3.0f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(0, 4).addBox(-1.0f, -2.0f, -3.0f, 2.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(0, 5).addBox(-3.0f, -2.0f, -3.0f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(0, 3).addBox(-1.0f, -4.0f, -3.0f, 2.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 21.0f, -4.25f));
        partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0f, -2.0f, -0.75f, 6.0f, 5.0f, 7.0f, new CubeDeformation(0.0f)).texOffs(16, 16).addBox(-2.0f, -1.0f, 6.25f, 4.0f, 4.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(0, 20).addBox(-1.0f, 0.0f, 8.25f, 2.0f, 3.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(0, 0).addBox(-1.0f, 1.0f, 10.25f, 2.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 21.0f, -4.25f));
        partdefinition.addOrReplaceChild("leftarm", CubeListBuilder.create().texOffs(19, 0).addBox(1.0f, -1.0f, -1.0f, 3.0f, 2.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offset(2.0f, 23.0f, -3.0f));
        partdefinition.addOrReplaceChild("Rightarm", CubeListBuilder.create().texOffs(12, 12).addBox(-4.0f, -1.0f, -1.0f, 3.0f, 2.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offset(-2.0f, 23.0f, -3.0f));
        return LayerDefinition.create(meshdefinition, 32, 32);
    }

    public void renderToBuffer(@NotNull PoseStack poseStack, @NotNull VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        this.Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.leftarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.Rightarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setupAnim(@NotNull T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.Rightarm.xRot = Mth.cos((limbSwing * 0.6662f) + 3.1415927f) * limbSwingAmount;
        this.Head.yRot = netHeadYaw / 57.295776f;
        this.Head.xRot = headPitch / 57.295776f;
        this.leftarm.xRot = Mth.cos(limbSwing * 0.6662f) * limbSwingAmount;
    }
}
