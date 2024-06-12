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

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/model/Modeltsc_drone_model.class */
public class Modeltsc_drone_model<T extends Entity> extends EntityModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(LatexMod.MODID, "modeltsc_drone_model"), "main");
    public final ModelPart Head;
    public final ModelPart Body;
    public final ModelPart LeftArm;
    public final ModelPart RightArm;
    public final ModelPart LeftLeg;
    public final ModelPart RightLeg;

    public Modeltsc_drone_model(ModelPart root) {
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
        partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0f, -8.0f, -4.0f, 8.0f, 8.0f, 8.0f, new CubeDeformation(0.0f)).texOffs(22, 23).addBox(-3.0f, -8.5f, -4.5f, 6.0f, 8.0f, 8.0f, new CubeDeformation(0.0f)).texOffs(31, 16).addBox(2.75f, -2.5f, -4.75f, 2.0f, 3.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(12, 31).addBox(-4.75f, -2.5f, -4.75f, 2.0f, 3.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(17, 23).addBox(-2.0f, -1.5f, -4.75f, 4.0f, 2.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 0.0f, 0.0f)).addOrReplaceChild("bone", CubeListBuilder.create().texOffs(12, 39).addBox(2.5f, -9.0f, -2.0f, 2.0f, 4.0f, 8.0f, new CubeDeformation(0.0f)).texOffs(0, 31).addBox(-4.5f, -9.0f, -2.0f, 2.0f, 4.0f, 8.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 0.0f, 3.0f, 0.3927f, 0.0f, 0.0f));
        partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(32, 0).addBox(-4.0f, 0.0f, -2.0f, 8.0f, 12.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 0.0f, 0.0f)).addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(0, 16).addBox(-1.0f, 10.0f, -2.0f, 2.0f, 2.0f, 13.0f, new CubeDeformation(0.0f)).texOffs(48, 43).addBox(-1.5f, 9.4619f, -1.8087f, 3.0f, 3.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(54, 16).addBox(-1.5f, 9.4619f, 1.1913f, 3.0f, 3.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(52, 0).addBox(-1.5f, 9.4619f, 3.1913f, 3.0f, 3.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(42, 25).addBox(-1.5f, 9.4619f, 7.1913f, 3.0f, 3.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(8, 43).addBox(-1.5f, 9.4619f, 5.1913f, 3.0f, 3.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 43).addBox(-1.5f, 9.4619f, 9.1913f, 3.0f, 3.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 1.0f, 7.0f, -0.3927f, 0.0f, 0.0f));
        partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(50, 25).addBox(-3.0f, -2.0f, -2.0f, 4.0f, 4.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(48, 48).addBox(-3.0f, 5.0f, -2.0f, 4.0f, 5.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(16, 51).addBox(-2.0f, 2.0f, -2.0f, 3.0f, 3.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(0, 16).addBox(-3.0f, -3.0f, -2.0f, 2.0f, 1.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offset(-5.0f, 2.0f, 0.0f)).addOrReplaceChild("bone6", CubeListBuilder.create().texOffs(0, 31).addBox(-2.0f, 1.0f, -1.0f, 2.0f, 4.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-2.5f, 0.0f, 0.0f, 0.0f, 0.0f, -0.3491f));
        partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(46, 35).addBox(-1.0f, -2.0f, -2.0f, 4.0f, 4.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(42, 16).addBox(-1.0f, 5.0f, -2.0f, 4.0f, 5.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(17, 16).addBox(-1.0f, 2.0f, -2.0f, 3.0f, 3.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(0, 21).addBox(1.0f, -3.0f, -2.0f, 2.0f, 1.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offset(5.0f, 2.0f, 0.0f)).addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(24, 39).addBox(0.0f, 1.0f, -1.0f, 2.0f, 4.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(2.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.3491f));
        partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(0, 47).addBox(-2.0f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offset(-2.0f, 12.0f, 0.0f)).addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(24, 0).addBox(-1.0f, 4.0f, 0.0f, 2.0f, 5.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(4.0f, 0.0f, 3.5f, -0.3927f, 0.0f, 0.0f));
        partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(32, 39).addBox(-2.0f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offset(2.0f, 12.0f, 0.0f)).addOrReplaceChild("bone7", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0f, 4.0f, 0.0f, 2.0f, 5.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-4.0f, 0.0f, 3.5f, -0.3927f, 0.0f, 0.0f));
        return LayerDefinition.create(meshdefinition, 80, 80);
    }

    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        this.Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
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
