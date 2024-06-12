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
import net.minecraft.world.entity.Entity;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/model/ModelRoomba.class */
public class ModelRoomba<T extends Entity> extends EntityModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(LatexMod.MODID, "model_roomba"), "main");
    public final ModelPart roomba;

    public ModelRoomba(ModelPart root) {
        this.roomba = root.getChild("roomba");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition roomba = meshdefinition.getRoot().addOrReplaceChild("roomba", CubeListBuilder.create(), PartPose.offset(-5.0607f, 23.0f, 3.5251f));
        roomba.addOrReplaceChild("eyes", CubeListBuilder.create().texOffs(0, 6).addBox(-6.0f, -1.0f, -2.0f, 0.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(12, 14).addBox(-6.0f, -1.0f, -3.0f, 2.0f, 1.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(7, 1).addBox(-6.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offset(5.0607f, 1.0f, -3.5251f));
        PartDefinition body = roomba.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(1.0607f, -1.0f, -9.5251f, 8.0f, 2.0f, 12.0f, new CubeDeformation(0.0f)).texOffs(0, 14).addBox(9.0607f, -1.0f, -7.5251f, 2.0f, 2.0f, 8.0f, new CubeDeformation(0.0f)).texOffs(12, 14).addBox(-0.9393f, -1.0f, -0.5251f, 2.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(14, 21).addBox(-0.9393f, -1.0f, -6.5251f, 2.0f, 1.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(0, 14).addBox(-0.9393f, -1.0f, -7.5251f, 2.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 2).addBox(-1.9393f, 1.0f, -1.5251f, 1.0f, 0.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 1).addBox(-1.9393f, 1.0f, -6.5251f, 1.0f, 0.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 0).addBox(-1.9393f, 1.0f, -4.0251f, 1.0f, 0.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 0.0f, 0.0f));
        body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 5).addBox(-2.0f, 1.0f, -2.5f, 1.0f, 0.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(6, 0).addBox(-2.0f, 1.0f, -0.5f, 1.0f, 0.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 24).addBox(-1.0f, -1.0f, -2.5f, 2.0f, 2.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 0.0f, -7.0503f, 0.0f, -0.7854f, 0.0f));
        body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 6).addBox(-2.0f, 1.0f, 1.5f, 1.0f, 0.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(6, 1).addBox(-2.0f, 1.0f, -0.5f, 1.0f, 0.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 5).addBox(-1.0f, -1.0f, -0.5f, 2.0f, 2.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, 0.7854f, 0.0f));
        body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0f, -1.0f, -0.5f, 2.0f, 2.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(10.1213f, 0.0f, 0.0f, 0.0f, -0.7854f, 0.0f));
        body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(22, 14).addBox(-1.0f, -1.0f, -2.5f, 2.0f, 2.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(10.1213f, 0.0f, -7.0503f, 0.0f, 0.7854f, 0.0f));
        return LayerDefinition.create(meshdefinition, 64, 64);
    }

    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }

    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        this.roomba.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }
}
