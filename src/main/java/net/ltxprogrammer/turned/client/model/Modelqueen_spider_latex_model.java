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

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/model/Modelqueen_spider_latex_model.class */
public class Modelqueen_spider_latex_model<T extends Entity> extends EntityModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(LatexMod.MODID, "modelqueen_spider_latex_model"), "main");
    public final ModelPart Head;
    public final ModelPart Body;
    public final ModelPart RightArm;
    public final ModelPart LeftArm;
    public final ModelPart LowerBody;
    public final ModelPart Rightleg;
    public final ModelPart Leftleg;

    public Modelqueen_spider_latex_model(ModelPart root) {
        this.Head = root.getChild("Head");
        this.Body = root.getChild("Body");
        this.RightArm = root.getChild("RightArm");
        this.LeftArm = root.getChild("LeftArm");
        this.LowerBody = root.getChild("LowerBody");
        this.Rightleg = root.getChild("Rightleg");
        this.Leftleg = root.getChild("Leftleg");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(47, 74).addBox(-4.5f, -9.0f, -4.75f, 9.0f, 9.0f, 9.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, -9.5f, -11.5f));
        Head.addOrReplaceChild("bone9", CubeListBuilder.create().texOffs(14, 6).addBox(-4.0941f, -4.5396f, -5.25f, 2.0f, 4.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.5f, 1.0f, -0.75f, 0.0f, 0.0f, -0.1745f));
        Head.addOrReplaceChild("bone10", CubeListBuilder.create().texOffs(14, 0).addBox(-3.8706f, -3.4501f, -5.25f, 2.0f, 4.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(5.5f, 1.0f, -0.75f, 0.0f, 0.0f, 0.1745f));
        partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(79, 29).addBox(-5.5f, 0.5f, -3.5f, 11.0f, 8.0f, 7.0f, new CubeDeformation(0.0f)).texOffs(98, 0).addBox(-5.5f, 2.5f, -5.5f, 11.0f, 5.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(62, 17).addBox(-5.5f, 1.5f, -4.5f, 11.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 16).addBox(-2.5f, 0.0f, -2.5f, 5.0f, 1.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(0, 99).addBox(-4.0f, 8.5f, -2.25f, 8.0f, 8.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(0, 0).addBox(-3.0f, 1.5f, 2.75f, 6.0f, 15.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, -9.5f, -11.5f));
        partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(12, 112).addBox(0.0f, -2.0f, -1.75f, 4.0f, 9.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(26, 99).addBox(-1.0f, 7.0f, -2.75f, 6.0f, 2.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(43, 101).addBox(0.0f, 9.0f, -2.75f, 4.0f, 5.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offset(5.5f, -7.0f, -11.25f));
        partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(0, 36).addBox(-4.0f, -2.0f, -1.75f, 4.0f, 9.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(98, 50).addBox(-5.0f, 7.0f, -2.75f, 6.0f, 2.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(61, 101).addBox(-4.0f, 9.0f, -2.75f, 4.0f, 5.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offset(-5.5f, -7.0f, -11.25f));
        partdefinition.addOrReplaceChild("LowerBody", CubeListBuilder.create().texOffs(0, 36).addBox(-7.5f, 18.5f, -3.75f, 15.0f, 9.0f, 16.0f, new CubeDeformation(0.0f)).texOffs(62, 0).addBox(-6.5f, 19.5f, -5.75f, 13.0f, 7.0f, 10.0f, new CubeDeformation(0.0f)).texOffs(0, 0).addBox(-10.0f, 14.75f, 17.25f, 20.0f, 14.0f, 22.0f, new CubeDeformation(0.0f)).texOffs(51, 51).addBox(-9.0f, 15.75f, 31.25f, 18.0f, 12.0f, 11.0f, new CubeDeformation(0.0f)).texOffs(88, 95).addBox(-6.0f, 19.0f, 12.25f, 12.0f, 8.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(0, 61).addBox(-7.0f, 16.5f, -3.25f, 14.0f, 6.0f, 14.0f, new CubeDeformation(0.0f)).texOffs(46, 36).addBox(-5.0f, 15.5f, -2.75f, 10.0f, 1.0f, 13.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, -9.5f, -11.5f));
        PartDefinition Rightleg = partdefinition.addOrReplaceChild("Rightleg", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0f, 10.75f, -5.25f, 0.0f, 0.0f, 0.7854f));
        PartDefinition bone = Rightleg.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1469f, -3.7366f, 9.25f, -0.0524f, -0.2094f, 0.3927f));
        bone.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(0, 112).addBox(-2.3886f, -15.2722f, 0.25f, 3.0f, 11.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offset(1.3886f, 7.2722f, -2.25f));
        bone.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(44, 95).addBox(0.6114f, -15.2722f, 0.25f, 19.0f, 3.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offset(1.3886f, 7.2722f, -2.25f));
        PartDefinition bone4 = Rightleg.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1469f, -3.7366f, 5.0f, -0.0524f, -0.1047f, 0.3927f));
        bone4.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(62, 111).addBox(-2.3886f, -15.2722f, 0.25f, 3.0f, 11.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offset(1.3886f, 7.2722f, -2.25f));
        bone4.addOrReplaceChild("bone6", CubeListBuilder.create().texOffs(0, 93).addBox(0.6114f, -15.2722f, 0.25f, 19.0f, 3.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offset(1.3886f, 7.2722f, -2.25f));
        PartDefinition bone15 = Rightleg.addOrReplaceChild("bone15", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1469f, -3.7366f, 1.0f, -0.0524f, 0.0f, 0.3927f));
        bone15.addOrReplaceChild("bone16", CubeListBuilder.create().texOffs(109, 57).addBox(-2.3886f, -15.2722f, 0.25f, 3.0f, 11.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offset(1.3886f, 7.2722f, -2.25f));
        bone15.addOrReplaceChild("bone17", CubeListBuilder.create().texOffs(0, 87).addBox(0.6114f, -15.2722f, 0.25f, 19.0f, 3.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offset(1.3886f, 7.2722f, -2.25f));
        PartDefinition bone7 = Rightleg.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1469f, -3.7366f, 0.75f, -0.0524f, 0.1047f, 0.3927f));
        bone7.addOrReplaceChild("bone8", CubeListBuilder.create().texOffs(50, 111).addBox(-1.9705f, -15.064f, -3.7226f, 3.0f, 11.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offset(1.3886f, 7.2722f, -2.25f));
        bone7.addOrReplaceChild("bone11", CubeListBuilder.create().texOffs(92, 44).addBox(1.0295f, -15.064f, -3.7226f, 19.0f, 3.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offset(1.3886f, 7.2722f, -2.25f));
        PartDefinition bone12 = Rightleg.addOrReplaceChild("bone12", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1469f, -3.7366f, -3.25f, -0.0524f, 0.2094f, 0.3927f));
        bone12.addOrReplaceChild("bone13", CubeListBuilder.create().texOffs(38, 111).addBox(-1.557f, -15.0674f, -3.6572f, 3.0f, 11.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offset(1.3886f, 7.2722f, -2.25f));
        bone12.addOrReplaceChild("bone14", CubeListBuilder.create().texOffs(80, 89).addBox(1.443f, -15.0674f, -3.6572f, 19.0f, 3.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offset(1.3886f, 7.2722f, -2.25f));
        PartDefinition Leftleg = partdefinition.addOrReplaceChild("Leftleg", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0f, 10.75f, -5.25f, 0.0f, 0.0f, -0.7854f));
        PartDefinition bone18 = Leftleg.addOrReplaceChild("bone18", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.1469f, -3.7366f, 9.25f, -0.0524f, 0.2094f, -0.3927f));
        bone18.addOrReplaceChild("bone19", CubeListBuilder.create().texOffs(103, 108).addBox(-0.6114f, -15.2722f, 0.25f, 3.0f, 11.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offset(-1.3886f, 7.2722f, -2.25f));
        bone18.addOrReplaceChild("bone20", CubeListBuilder.create().texOffs(84, 23).addBox(-19.6114f, -15.2722f, 0.25f, 19.0f, 3.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offset(-1.3886f, 7.2722f, -2.25f));
        PartDefinition bone21 = Leftleg.addOrReplaceChild("bone21", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.1469f, -3.7366f, 5.0f, -0.0524f, 0.1047f, -0.3927f));
        bone21.addOrReplaceChild("bone22", CubeListBuilder.create().texOffs(91, 108).addBox(-0.6114f, -15.2722f, 0.25f, 3.0f, 11.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offset(-1.3886f, 7.2722f, -2.25f));
        bone21.addOrReplaceChild("bone23", CubeListBuilder.create().texOffs(84, 17).addBox(-19.6114f, -15.2722f, 0.25f, 19.0f, 3.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offset(-1.3886f, 7.2722f, -2.25f));
        PartDefinition bone24 = Leftleg.addOrReplaceChild("bone24", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.1469f, -3.7366f, 1.0f, -0.0524f, 0.0f, -0.3927f));
        bone24.addOrReplaceChild("bone25", CubeListBuilder.create().texOffs(26, 106).addBox(-0.6114f, -15.2722f, 0.25f, 3.0f, 11.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offset(-1.3886f, 7.2722f, -2.25f));
        bone24.addOrReplaceChild("bone26", CubeListBuilder.create().texOffs(83, 83).addBox(-19.6114f, -15.2722f, 0.25f, 19.0f, 3.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offset(-1.3886f, 7.2722f, -2.25f));
        PartDefinition bone27 = Leftleg.addOrReplaceChild("bone27", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.1469f, -3.7366f, 0.75f, -0.0524f, -0.1047f, -0.3927f));
        bone27.addOrReplaceChild("bone28", CubeListBuilder.create().texOffs(79, 105).addBox(-1.0295f, -15.064f, -3.7226f, 3.0f, 11.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offset(-1.3886f, 7.2722f, -2.25f));
        bone27.addOrReplaceChild("bone29", CubeListBuilder.create().texOffs(0, 81).addBox(-20.0295f, -15.064f, -3.7226f, 19.0f, 3.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offset(-1.3886f, 7.2722f, -2.25f));
        PartDefinition bone30 = Leftleg.addOrReplaceChild("bone30", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.1469f, -3.7366f, -3.25f, -0.0524f, -0.2094f, -0.3927f));
        bone30.addOrReplaceChild("bone31", CubeListBuilder.create().texOffs(0, 61).addBox(-1.443f, -15.0674f, -3.6572f, 3.0f, 11.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offset(-1.3886f, 7.2722f, -2.25f));
        bone30.addOrReplaceChild("bone32", CubeListBuilder.create().texOffs(74, 74).addBox(-20.443f, -15.0674f, -3.6572f, 19.0f, 3.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offset(-1.3886f, 7.2722f, -2.25f));
        return LayerDefinition.create(meshdefinition, 256, 256);
    }

    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        this.Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.LowerBody.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.Rightleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.Leftleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.RightArm.xRot = Mth.cos((limbSwing * 0.6662f) + 3.1415927f) * limbSwingAmount;
        this.Leftleg.xRot = Mth.cos(limbSwing * 1.0f) * -1.0f * limbSwingAmount;
        this.Head.yRot = netHeadYaw / 57.295776f;
        this.Head.xRot = headPitch / 57.295776f;
        this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662f) * limbSwingAmount;
        this.Rightleg.xRot = Mth.cos(limbSwing * 1.0f) * 1.0f * limbSwingAmount;
    }
}
