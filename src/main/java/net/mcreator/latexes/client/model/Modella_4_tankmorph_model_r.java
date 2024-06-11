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

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/model/Modella_4_tankmorph_model_r.class */
public class Modella_4_tankmorph_model_r<T extends Entity> extends EntityModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(LatexMod.MODID, "modella_4_tankmorph_model_r"), "main");
    public final ModelPart Head;
    public final ModelPart Body;
    public final ModelPart Cannon;
    public final ModelPart LeftArm;
    public final ModelPart RightArm;
    public final ModelPart LeftLeg;
    public final ModelPart RightLeg;

    public Modella_4_tankmorph_model_r(ModelPart root) {
        this.Head = root.getChild("Head");
        this.Body = root.getChild("Body");
        this.Cannon = root.getChild("Cannon");
        this.LeftArm = root.getChild("LeftArm");
        this.RightArm = root.getChild("RightArm");
        this.LeftLeg = root.getChild("LeftLeg");
        this.RightLeg = root.getChild("RightLeg");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(52, 81).addBox(-4.0f, -10.0f, -3.5f, 8.0f, 8.0f, 8.0f, new CubeDeformation(0.0f)).texOffs(46, 34).addBox(-0.1f, -6.5f, -3.75f, 4.0f, 3.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(68, 46).addBox(-4.5f, -4.0f, -4.0f, 9.0f, 2.0f, 9.0f, new CubeDeformation(0.0f)).texOffs(20, 63).addBox(-5.0f, -2.5f, -4.5f, 10.0f, 3.0f, 10.0f, new CubeDeformation(0.0f)).texOffs(26, 99).addBox(0.5f, -1.5f, 3.0f, 5.0f, 11.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, -33.0f, 0.0f));
        Head.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(96, 101).addBox(8.1676f, -31.6354f, -2.5f, 3.0f, 5.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(22, 42).addBox(10.0212f, -31.0701f, -2.0f, 4.0f, 4.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(0, 105).addBox(11.1676f, -31.6354f, -2.5f, 3.0f, 4.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 22.6f, 0.5f, 0.0f, 0.0f, -0.1745f));
        Head.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(80, 101).addBox(-11.1676f, -31.6354f, -2.5f, 3.0f, 5.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(104, 12).addBox(-14.1676f, -31.6354f, -2.5f, 3.0f, 4.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(106, 0).addBox(-14.0525f, -30.0704f, -2.0f, 4.0f, 3.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 22.6f, 0.5f, 0.0f, 0.0f, 0.1745f));
        partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 15).addBox(-9.5f, 0.0f, -2.5f, 19.0f, 7.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(44, 22).addBox(-7.5f, 7.0f, -2.5f, 15.0f, 6.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(60, 34).addBox(-7.0f, 13.0f, -2.5f, 14.0f, 6.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(0, 28).addBox(-8.0f, 19.0f, -3.0f, 16.0f, 7.0f, 7.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, -33.0f, 0.0f)).addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(0, 0).addBox(-8.5f, -18.8747f, 7.5115f, 17.0f, 7.0f, 8.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 25.0f, -0.5f, 0.7418f, 0.0f, 0.0f));
        partdefinition.addOrReplaceChild("Cannon", CubeListBuilder.create().texOffs(94, 57).addBox(-9.0f, 2.5f, 2.25f, 6.0f, 6.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(42, 0).addBox(-8.0f, -1.5f, 3.75f, 4.0f, 4.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(50, 97).addBox(-7.5f, -21.5f, 4.75f, 3.0f, 20.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(106, 69).addBox(-8.5f, 8.5f, 4.25f, 5.0f, 4.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(34, 42).addBox(-8.5f, 8.5f, 3.25f, 5.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-1.0f, -30.0f, -5.25f, 1.5708f, 0.0f, 0.0f));
        partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(95, 48).addBox(-5.45f, -5.75f, -2.0f, 4.0f, 2.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(84, 84).addBox(-5.45f, -3.75f, -2.0f, 6.0f, 12.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(88, 75).addBox(-4.95f, 7.25f, -2.5f, 6.0f, 1.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(0, 70).addBox(-5.95f, 8.25f, -2.5f, 7.0f, 17.0f, 6.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-9.0f, -31.0f, -2.0f, -1.5708f, 0.0f, 0.0f));
        partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(84, 0).addBox(0.45f, -3.75f, -3.0f, 6.0f, 12.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(101, 82).addBox(2.45f, -5.75f, -3.0f, 4.0f, 2.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(94, 29).addBox(-0.05f, 7.25f, -3.5f, 6.0f, 1.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(26, 76).addBox(-0.05f, 8.25f, -3.5f, 7.0f, 17.0f, 6.0f, new CubeDeformation(0.0f)), PartPose.offset(9.0f, -29.0f, 1.0f));
        partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(86, 17).addBox(-5.0f, -4.0f, -3.5f, 5.0f, 4.0f, 8.0f, new CubeDeformation(0.0f)).texOffs(95, 38).addBox(0.0f, -2.0f, -3.5f, 2.0f, 2.0f, 8.0f, new CubeDeformation(0.0f)).texOffs(50, 0).addBox(-5.0f, 0.0f, -3.5f, 9.0f, 13.0f, 8.0f, new CubeDeformation(0.0f)).texOffs(38, 38).addBox(-3.0f, 13.0f, -3.5f, 7.0f, 17.0f, 8.0f, new CubeDeformation(0.0f)), PartPose.offset(-4.0f, -8.0f, 0.0f));
        partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(0, 93).addBox(0.0f, -4.0f, -3.5f, 5.0f, 4.0f, 8.0f, new CubeDeformation(0.0f)).texOffs(60, 97).addBox(-2.0f, -2.0f, -3.5f, 2.0f, 2.0f, 8.0f, new CubeDeformation(0.0f)).texOffs(60, 60).addBox(-4.0f, 0.0f, -3.5f, 9.0f, 13.0f, 8.0f, new CubeDeformation(0.0f)).texOffs(0, 42).addBox(-4.0f, 13.0f, -3.5f, 7.0f, 17.0f, 8.0f, new CubeDeformation(0.0f)), PartPose.offset(4.0f, -8.0f, 0.0f));
        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        this.Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.Cannon.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
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
        this.RightLeg.xRot = Mth.cos(limbSwing * 1.0f) * 1.0f * limbSwingAmount;
    }
}
