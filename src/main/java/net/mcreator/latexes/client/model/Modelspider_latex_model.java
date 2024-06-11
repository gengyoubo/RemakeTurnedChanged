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

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/model/Modelspider_latex_model.class */
public class Modelspider_latex_model<T extends Entity> extends EntityModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(LatexMod.MODID, "modelspider_latex_model"), "main");
    public final ModelPart Head;
    public final ModelPart Body;
    public final ModelPart LeftArm;
    public final ModelPart RightArm;
    public final ModelPart LowerBody;
    public final ModelPart Rightleg;
    public final ModelPart Leftleg;

    public Modelspider_latex_model(ModelPart root) {
        this.Head = root.getChild("Head");
        this.Body = root.getChild("Body");
        this.LeftArm = root.getChild("LeftArm");
        this.RightArm = root.getChild("RightArm");
        this.LowerBody = root.getChild("LowerBody");
        this.Rightleg = root.getChild("Rightleg");
        this.Leftleg = root.getChild("Leftleg");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(26, 31).addBox(-4.0f, -8.0f, -3.75f, 8.0f, 8.0f, 8.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 0.0f, -4.5f));
        Head.addOrReplaceChild("bone9", CubeListBuilder.create().texOffs(46, 64).addBox(-4.0f, -3.0f, -5.25f, 2.0f, 4.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.5f, 0.0f, 0.25f, 0.0f, 0.0f, -0.1745f));
        Head.addOrReplaceChild("bone10", CubeListBuilder.create().texOffs(0, 24).addBox(-3.9248f, -1.9978f, -5.25f, 2.0f, 4.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(5.5f, 0.0f, 0.25f, 0.0f, 0.0f, 0.1745f));
        partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(54, 54).addBox(-4.5f, 0.0f, -1.75f, 9.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(0, 39).addBox(-4.0f, 7.0f, -1.25f, 8.0f, 5.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 0.0f, -4.5f));
        partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(32, 64).addBox(-2.0f, -2.0f, -1.75f, 3.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(16, 63).addBox(-3.0f, 5.0f, -1.75f, 4.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offset(-5.5f, 2.0f, -4.5f));
        partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0f, -2.0f, -1.75f, 3.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(0, 63).addBox(-1.0f, 5.0f, -1.75f, 4.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offset(5.5f, 2.0f, -4.5f));
        partdefinition.addOrReplaceChild("LowerBody", CubeListBuilder.create().texOffs(0, 24).addBox(-4.5f, 14.0f, -2.75f, 9.0f, 7.0f, 8.0f, new CubeDeformation(0.0f)).texOffs(58, 24).addBox(-3.5f, 15.0f, -3.75f, 7.0f, 5.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 0).addBox(-6.0f, 12.25f, 10.25f, 12.0f, 10.0f, 14.0f, new CubeDeformation(0.0f)).texOffs(58, 36).addBox(-5.0f, 13.25f, 24.25f, 10.0f, 8.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(28, 53).addBox(-4.0f, 14.5f, 5.25f, 8.0f, 6.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(0, 53).addBox(-4.0f, 12.0f, -2.25f, 8.0f, 4.0f, 6.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 0.0f, -4.5f));
        PartDefinition Rightleg = partdefinition.addOrReplaceChild("Rightleg", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0f, 18.75f, -1.25f, 0.0f, 0.0f, 0.3927f));
        Rightleg.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(52, 12).addBox(2.4476f, 6.0f, -0.7907f, 13.0f, 3.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-1.3886f, -7.2722f, 2.25f, 0.0f, -0.3927f, 0.0f));
        Rightleg.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(52, 18).addBox(2.9791f, 6.0f, -1.2044f, 13.0f, 3.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-1.8109f, -7.6384f, 0.25f, 0.0f, -0.1745f, 0.0f));
        Rightleg.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(32, 47).addBox(3.5559f, 4.5941f, -3.8746f, 13.0f, 3.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-1.8886f, -6.2721f, 1.75f, 0.0f, 0.1745f, 0.0f));
        Rightleg.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(50, 30).addBox(4.0929f, 4.6898f, -3.8044f, 13.0f, 3.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-1.8886f, -6.2722f, -0.25f, 0.0f, 0.3927f, 0.0f));
        PartDefinition Leftleg = partdefinition.addOrReplaceChild("Leftleg", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0f, 18.75f, -1.25f, 0.0f, 0.0f, -0.3927f));
        Leftleg.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(0, 47).addBox(-15.4476f, 6.0f, -0.7907f, 13.0f, 3.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(1.3886f, -7.2722f, 2.25f, 0.0f, 0.3927f, 0.0f));
        Leftleg.addOrReplaceChild("bone6", CubeListBuilder.create().texOffs(38, 6).addBox(-15.9791f, 6.0f, -1.2044f, 13.0f, 3.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(1.8109f, -7.6384f, 0.25f, 0.0f, 0.1745f, 0.0f));
        Leftleg.addOrReplaceChild("bone7", CubeListBuilder.create().texOffs(38, 0).addBox(-16.5559f, 4.5941f, -3.8746f, 13.0f, 3.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(1.8886f, -6.2721f, 1.75f, 0.0f, -0.1745f, 0.0f));
        Leftleg.addOrReplaceChild("bone8", CubeListBuilder.create().texOffs(26, 24).addBox(-17.0929f, 4.6898f, -3.8044f, 13.0f, 3.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(1.8886f, -6.2722f, -0.25f, 0.0f, -0.3927f, 0.0f));
        return LayerDefinition.create(meshdefinition, 96, 96);
    }

    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        this.Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.LowerBody.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.Rightleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.Leftleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.RightArm.xRot = Mth.cos(limbSwing * 1.0f) * 1.0f * limbSwingAmount;
        this.Leftleg.xRot = Mth.cos(limbSwing * 1.0f) * -1.0f * limbSwingAmount;
        this.Head.yRot = netHeadYaw / 57.295776f;
        this.Head.xRot = headPitch / 57.295776f;
        this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662f) * limbSwingAmount;
        this.Rightleg.xRot = Mth.cos(limbSwing * 1.0f) * 1.0f * limbSwingAmount;
    }
}
