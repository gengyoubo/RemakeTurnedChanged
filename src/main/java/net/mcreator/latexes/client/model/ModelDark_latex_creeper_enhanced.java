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

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/model/ModelDark_latex_creeper_enhanced.class */
public class ModelDark_latex_creeper_enhanced<T extends Entity> extends EntityModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(LatexMod.MODID, "model_dark_latex_creeper_enhanced"), "main");
    public final ModelPart head;
    public final ModelPart body;
    public final ModelPart ArmL;
    public final ModelPart ArmR;
    public final ModelPart leg0;
    public final ModelPart leg1;
    public final ModelPart leg2;
    public final ModelPart leg3;

    public ModelDark_latex_creeper_enhanced(ModelPart root) {
        this.head = root.getChild("head");
        this.body = root.getChild("body");
        this.ArmL = root.getChild("ArmL");
        this.ArmR = root.getChild("ArmR");
        this.leg0 = root.getChild("leg0");
        this.leg1 = root.getChild("leg1");
        this.leg2 = root.getChild("leg2");
        this.leg3 = root.getChild("leg3");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(43, 0).addBox(-4.5f, -8.7721f, -5.6047f, 9.0f, 9.0f, 9.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, -13.5f, -10.0f));
        head.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(70, 96).addBox(-0.5f, -1.75f, -4.0f, 1.0f, 4.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(62, 18).addBox(-0.5f, -1.75f, 1.0f, 1.0f, 3.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(13, 0).addBox(-0.5f, -1.75f, 5.0f, 1.0f, 1.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(0, 47).addBox(-10.5f, -1.75f, 5.0f, 1.0f, 1.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(98, 101).addBox(-10.5f, -1.75f, 1.0f, 1.0f, 3.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(100, 74).addBox(-10.5f, -1.75f, -4.0f, 1.0f, 4.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(5.0f, -5.0221f, 0.3953f, 0.2182f, 0.0f, 0.0f));
        head.addOrReplaceChild("Crest", CubeListBuilder.create().texOffs(0, 0).addBox(0.0f, -19.625f, -11.375f, 0.0f, 9.0f, 9.0f, new CubeDeformation(0.0f)).texOffs(43, 15).addBox(0.0f, -20.625f, -10.375f, 0.0f, 1.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(61, 46).addBox(0.0f, -21.625f, -8.375f, 0.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(61, 45).addBox(0.0f, -21.625f, -4.375f, 0.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(43, 5).addBox(0.0f, -20.625f, -6.375f, 0.0f, 1.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 10.2279f, 6.3953f)).addOrReplaceChild("head_r2", CubeListBuilder.create().texOffs(61, 44).addBox(0.0f, -1.0f, -1.0f, 0.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 43).addBox(0.0f, 0.0f, -3.0f, 0.0f, 1.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(44, 61).addBox(0.0f, -1.0f, 3.0f, 0.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 42).addBox(0.0f, 0.0f, 1.0f, 0.0f, 1.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, -15.625f, -1.375f, -1.5708f, 0.0f, 0.0f));
        head.addOrReplaceChild("Mask", CubeListBuilder.create().texOffs(57, 18).addBox(-3.0f, -9.75f, -12.5f, 2.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(14, 8).addBox(1.0f, -9.75f, -12.5f, 2.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(48, 41).addBox(-1.0f, -10.25f, -12.5f, 2.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(45, 77).addBox(3.0f, -16.0f, -12.5f, 1.0f, 7.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(36, 41).addBox(-3.0f, -13.0f, -12.5f, 6.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(0, 4).addBox(-1.0f, -14.0f, -12.5f, 2.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(49, 18).addBox(-2.0f, -15.0f, -12.5f, 4.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(36, 38).addBox(-3.0f, -17.0f, -12.5f, 6.0f, 2.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(0, 50).addBox(1.0f, -12.0f, -12.5f, 2.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(46, 29).addBox(-3.0f, -12.0f, -12.5f, 2.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(34, 55).addBox(-4.0f, -16.0f, -12.5f, 1.0f, 7.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(0, 30).addBox(-6.0f, -12.0f, -12.5f, 2.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(14, 18).addBox(-1.0f, -18.0f, -12.5f, 2.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(36, 29).addBox(4.0f, -12.0f, -12.5f, 2.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(17, 0).addBox(-5.0f, -13.0f, -12.5f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(43, 0).addBox(4.0f, -13.0f, -12.5f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 9.2279f, 6.5203f));
        PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0f, 14.5f, 2.0f, 12.0f, 7.0f, 19.0f, new CubeDeformation(0.0f)).texOffs(66, 63).addBox(-6.0f, 14.5f, 21.0f, 12.0f, 5.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(0, 26).addBox(-5.0f, 21.5f, 4.0f, 10.0f, 3.0f, 16.0f, new CubeDeformation(0.0f)).texOffs(36, 26).addBox(-4.0f, 24.5f, 5.0f, 8.0f, 1.0f, 14.0f, new CubeDeformation(0.0f)).texOffs(54, 52).addBox(-3.0f, 25.5f, 8.0f, 6.0f, 1.0f, 10.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, -13.5f, -10.0f));
        body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(91, 48).addBox(-4.0f, -1.5f, -1.0f, 8.0f, 3.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 15.375f, 22.875f, 0.3054f, 0.0f, 0.0f));
        body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 55).addBox(-5.0f, -1.5f, -6.0f, 10.0f, 3.0f, 6.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 15.375f, 23.625f, 0.0873f, 0.0f, 0.0f));
        body.addOrReplaceChild("body_r1", CubeListBuilder.create().texOffs(59, 44).addBox(-2.5f, -16.0f, -2.0f, 5.0f, 2.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(0, 45).addBox(-6.125f, -15.0f, -2.875f, 12.0f, 4.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(61, 86).addBox(0.375f, -14.0f, -3.0f, 5.0f, 4.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(88, 27).addBox(-5.5f, -14.0f, -3.0f, 5.0f, 4.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(83, 12).addBox(-4.0f, -1.0f, -1.0f, 8.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(0, 0).addBox(-0.5f, -3.25f, -6.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(96, 93).addBox(-3.0f, -7.0f, -5.625f, 6.0f, 6.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(20, 89).addBox(-4.0f, -10.0f, -4.0f, 8.0f, 10.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(95, 37).addBox(-3.5f, -8.5f, -5.0f, 7.0f, 8.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(13, 25).addBox(-0.125f, -11.0f, 4.0f, 0.0f, 3.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(52, 40).addBox(-0.125f, -11.0f, 5.0f, 0.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(61, 17).addBox(-0.125f, -11.0f, 6.0f, 0.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(42, 61).addBox(-0.125f, -15.0f, 6.0f, 0.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(26, 54).addBox(-0.125f, -15.0f, 5.0f, 0.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(36, 25).addBox(-0.125f, -15.0f, 4.0f, 0.0f, 3.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(16, 91).addBox(-0.125f, -15.0f, 3.0f, 0.0f, 11.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(36, 45).addBox(-4.5f, -11.0f, -2.0f, 9.0f, 12.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 15.5f, 2.0f, 0.1745f, 0.0f, 0.0f));
        body.addOrReplaceChild("body_r2", CubeListBuilder.create().texOffs(30, 48).addBox(1.0f, 10.125f, 4.875f, 0.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(32, 48).addBox(1.0f, 7.125f, 4.875f, 0.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(58, 41).addBox(1.0f, 7.125f, 5.875f, 0.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(34, 48).addBox(1.0f, 4.125f, 4.875f, 0.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(28, 59).addBox(1.0f, 4.125f, 5.875f, 0.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(30, 59).addBox(1.0f, 1.125f, 5.875f, 0.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(48, 37).addBox(1.0f, 1.125f, 4.875f, 0.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(90, 21).addBox(1.0f, -0.875f, 3.875f, 0.0f, 11.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(21, 77).addBox(-3.375f, -0.875f, 0.875f, 9.0f, 9.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-1.125f, 15.1403f, 5.1308f, 1.1781f, 0.0f, 0.0f));
        body.addOrReplaceChild("body_r3", CubeListBuilder.create().texOffs(60, 43).addBox(1.0f, -6.0f, 6.0f, 0.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(49, 3).addBox(1.0f, -6.0f, 5.0f, 0.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(11, 25).addBox(1.0f, -6.0f, 4.0f, 0.0f, 3.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(103, 0).addBox(1.0f, -7.0f, 3.0f, 0.0f, 9.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(79, 0).addBox(-3.375f, -7.0f, 0.0f, 9.0f, 9.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-1.125f, 15.1403f, 5.1308f, 0.6109f, 0.0f, 0.0f));
        body.addOrReplaceChild("Crest2", CubeListBuilder.create(), PartPose.offset(0.0f, 29.5f, 10.0f));
        PartDefinition ArmL = partdefinition.addOrReplaceChild("ArmL", CubeListBuilder.create(), PartPose.offsetAndRotation(7.5644f, -4.8193f, -6.8098f, 0.1298f, 0.017f, -0.1298f));
        ArmL.addOrReplaceChild("body_r4", CubeListBuilder.create().texOffs(0, 79).addBox(-1.8219f, -0.5428f, -4.2825f, 5.0f, 8.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(0, 0).addBox(-1.7683f, -3.5318f, -4.2805f, 4.0f, 3.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(78, 93).addBox(-1.7683f, -3.5318f, -4.2805f, 4.0f, 3.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.1856f, 2.5931f, -1.3413f, -0.4765f, -0.0603f, -0.0873f));
        ArmL.addOrReplaceChild("body_r5", CubeListBuilder.create().texOffs(48, 26).addBox(-0.625f, -0.875f, 0.0f, 1.0f, 3.0f, 0.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-0.6733f, 7.8765f, -7.88f, -0.4784f, 0.0403f, 0.1064f));
        ArmL.addOrReplaceChild("body_r6", CubeListBuilder.create().texOffs(30, 45).addBox(-0.5f, -0.875f, -1.0f, 2.0f, 2.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-0.6733f, 7.7515f, -7.88f, -0.4784f, 0.0403f, 0.1064f));
        ArmL.addOrReplaceChild("body_r7", CubeListBuilder.create().texOffs(59, 45).addBox(1.25f, 0.0f, -0.125f, 1.0f, 3.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(32, 59).addBox(1.25f, 0.0f, 3.125f, 1.0f, 3.0f, 0.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(2.1314f, 7.2426f, -7.3669f, -0.4608f, -0.1393f, -0.2437f));
        ArmL.addOrReplaceChild("body_r8", CubeListBuilder.create().texOffs(43, 4).addBox(0.125f, 0.0f, -1.125f, 2.0f, 2.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(43, 0).addBox(0.125f, 0.0f, 2.125f, 2.0f, 2.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(2.1314f, 7.1176f, -7.3669f, -0.4608f, -0.1393f, -0.2437f));
        ArmL.addOrReplaceChild("body_r9", CubeListBuilder.create().texOffs(18, 92).addBox(6.1093f, -17.3441f, -2.4261f, 1.0f, 11.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(62, 19).addBox(5.1093f, -15.3441f, -2.4261f, 1.0f, 2.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(3, 0).addBox(4.1093f, -14.3441f, -2.4261f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(88, 101).addBox(7.0387f, -13.3382f, -4.4271f, 1.0f, 4.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(56, 96).addBox(4.0387f, -13.3382f, -4.4271f, 3.0f, 8.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-5.5644f, 4.8277f, 1.8798f, 0.1745f, 0.0f, 0.0f));
        ArmL.addOrReplaceChild("body_r10", CubeListBuilder.create().texOffs(2, 25).addBox(0.2715f, -7.5348f, -0.2697f, 0.0f, 4.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(26, 58).addBox(0.2715f, -5.5348f, -1.2697f, 0.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.1856f, 2.5931f, -1.3413f, -0.48f, 0.0f, -0.0873f));
        PartDefinition ArmR = partdefinition.addOrReplaceChild("ArmR", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.5644f, -4.8193f, -6.8098f, 0.1304f, -0.0114f, 0.0866f));
        ArmR.addOrReplaceChild("body_r11", CubeListBuilder.create().texOffs(46, 26).addBox(-2.25f, 0.0f, 3.125f, 1.0f, 3.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(38, 45).addBox(-2.25f, 0.0f, -0.125f, 1.0f, 3.0f, 0.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-2.1314f, 7.2426f, -7.3669f, -0.4608f, 0.1393f, 0.2437f));
        ArmR.addOrReplaceChild("body_r12", CubeListBuilder.create().texOffs(38, 26).addBox(-0.375f, -0.875f, 0.0f, 1.0f, 3.0f, 0.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.6733f, 7.8765f, -7.88f, -0.4784f, -0.0403f, -0.1064f));
        ArmR.addOrReplaceChild("body_r13", CubeListBuilder.create().texOffs(78, 101).addBox(-8.0387f, -13.3382f, -4.4271f, 1.0f, 4.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(13, 0).addBox(-5.1093f, -14.3441f, -2.4261f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(92, 22).addBox(-7.1093f, -17.3441f, -2.4261f, 1.0f, 11.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(51, 62).addBox(-6.1093f, -15.3441f, -2.4261f, 1.0f, 2.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(36, 26).addBox(-6.9843f, -13.3441f, -4.4261f, 3.0f, 8.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(5.5644f, 4.8277f, 1.8798f, 0.1745f, 0.0f, 0.0f));
        ArmR.addOrReplaceChild("body_r14", CubeListBuilder.create().texOffs(0, 25).addBox(-0.2178f, -7.5443f, -0.2747f, 0.0f, 4.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(32, 54).addBox(-0.2178f, -5.5443f, -1.2747f, 0.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-0.1856f, 2.5931f, -1.3413f, -0.48f, 0.0f, 0.0873f));
        ArmR.addOrReplaceChild("body_r15", CubeListBuilder.create().texOffs(26, 55).addBox(-2.125f, 0.0f, 2.125f, 2.0f, 2.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(17, 64).addBox(-2.125f, 0.0f, -1.125f, 2.0f, 2.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-2.1314f, 7.1176f, -7.3669f, -0.4608f, 0.1393f, 0.2437f));
        ArmR.addOrReplaceChild("body_r16", CubeListBuilder.create().texOffs(52, 41).addBox(-1.5f, -0.875f, -1.0f, 2.0f, 2.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.6733f, 7.7515f, -7.88f, -0.4784f, -0.0403f, -0.1064f));
        ArmR.addOrReplaceChild("body_r17", CubeListBuilder.create().texOffs(93, 57).addBox(-2.1781f, -3.5428f, -4.2825f, 4.0f, 3.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(83, 80).addBox(-3.1781f, -0.5428f, -4.2825f, 5.0f, 8.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-0.1856f, 2.5931f, -1.3413f, -0.4765f, 0.0603f, 0.0873f));
        PartDefinition leg0 = partdefinition.addOrReplaceChild("leg0", CubeListBuilder.create().texOffs(66, 18).addBox(-4.625f, 11.7545f, -8.1168f, 5.0f, 8.0f, 7.0f, new CubeDeformation(0.0f)).texOffs(51, 92).addBox(-1.125f, 17.7545f, -8.8668f, 2.0f, 2.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(94, 22).addBox(-5.125f, 17.7545f, -8.8668f, 2.0f, 2.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(43, 3).addBox(-4.125f, 17.7545f, -9.8668f, 0.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(30, 44).addBox(-0.125f, 17.7545f, -9.8668f, 0.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(43, 0).addBox(-4.125f, 18.7545f, -10.8668f, 0.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(36, 48).addBox(-0.125f, 18.7545f, -10.8668f, 0.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 58).addBox(-3.125f, 17.7545f, -1.1168f, 2.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offset(-5.5f, 4.25f, -4.0f));
        leg0.addOrReplaceChild("leg4_r1", CubeListBuilder.create().texOffs(30, 101).addBox(-2.25f, -9.5f, -4.0f, 2.0f, 1.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(0, 92).addBox(-3.25f, -8.55f, -4.0f, 3.0f, 11.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-0.25f, 7.2057f, -3.4455f, -0.5672f, 0.0f, 0.0f));
        leg0.addOrReplaceChild("leg4_r2", CubeListBuilder.create().texOffs(0, 11).addBox(-2.25f, -7.5f, -4.0f, 0.0f, 1.0f, 7.0f, new CubeDeformation(0.0f)).texOffs(58, 40).addBox(-2.25f, -10.5f, -4.0f, 0.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 1).addBox(-2.25f, -9.5f, -4.0f, 0.0f, 1.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(13, 1).addBox(-2.25f, -8.5f, -4.0f, 0.0f, 1.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(45, 78).addBox(-4.25f, -6.5f, -4.0f, 4.0f, 7.0f, 7.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 12.25f, -4.25f, 0.2182f, 0.0f, 0.0f));
        PartDefinition leg1 = partdefinition.addOrReplaceChild("leg1", CubeListBuilder.create().texOffs(49, 63).addBox(-0.125f, 11.7545f, -7.1168f, 5.0f, 8.0f, 7.0f, new CubeDeformation(0.0f)).texOffs(79, 12).addBox(-0.625f, 17.7545f, -7.8668f, 2.0f, 2.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(75, 48).addBox(3.375f, 17.7545f, -7.8668f, 2.0f, 2.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(36, 44).addBox(0.375f, 17.7545f, -8.8668f, 0.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 46).addBox(4.375f, 17.7545f, -8.8668f, 0.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(49, 0).addBox(0.375f, 18.7545f, -9.8668f, 0.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(4, 49).addBox(4.375f, 18.7545f, -9.8668f, 0.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(60, 41).addBox(1.5f, 17.7545f, -0.2418f, 2.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offset(5.5f, 4.25f, -5.0f));
        leg1.addOrReplaceChild("leg5_r1", CubeListBuilder.create().texOffs(0, 1).addBox(2.25f, -7.5f, -4.0f, 0.0f, 1.0f, 7.0f, new CubeDeformation(0.0f)).texOffs(13, 0).addBox(2.25f, -8.5f, -4.0f, 0.0f, 1.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(0, 0).addBox(2.25f, -9.5f, -4.0f, 0.0f, 1.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(30, 58).addBox(2.25f, -10.5f, -4.0f, 0.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(73, 34).addBox(0.25f, -6.5f, -4.0f, 4.0f, 7.0f, 7.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 12.25f, -3.25f, 0.2182f, 0.0f, 0.0f));
        leg1.addOrReplaceChild("leg5_r2", CubeListBuilder.create().texOffs(66, 33).addBox(0.25f, -9.5f, -4.0f, 2.0f, 1.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(0, 26).addBox(0.25f, -8.55f, -4.0f, 3.0f, 11.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.25f, 7.2057f, -2.4455f, -0.5672f, 0.0f, 0.0f));
        PartDefinition leg2 = partdefinition.addOrReplaceChild("leg2", CubeListBuilder.create().texOffs(0, 64).addBox(-4.625f, 10.7545f, 3.2582f, 5.0f, 8.0f, 7.0f, new CubeDeformation(0.0f)).texOffs(81, 74).addBox(-1.125f, 16.7545f, 2.5082f, 2.0f, 2.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(81, 70).addBox(-5.125f, 16.7545f, 2.5082f, 2.0f, 2.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(11, 28).addBox(-0.125f, 16.7545f, 1.5082f, 0.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(13, 28).addBox(-4.125f, 16.7545f, 1.5082f, 0.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(13, 0).addBox(-0.125f, 17.7545f, 0.5082f, 0.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(17, 0).addBox(-4.125f, 17.7545f, 0.5082f, 0.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 55).addBox(-3.125f, 16.7545f, 10.2582f, 2.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offset(-5.5f, 5.25f, 7.0f));
        leg2.addOrReplaceChild("leg5_r3", CubeListBuilder.create().texOffs(16, 101).addBox(-2.25f, -8.5f, -1.0f, 2.0f, 1.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(40, 92).addBox(-3.25f, -7.55f, -1.0f, 3.0f, 9.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-0.25f, 6.2057f, 4.4455f, 0.7854f, 0.0f, 0.0f));
        leg2.addOrReplaceChild("leg3_r1", CubeListBuilder.create().texOffs(76, 48).addBox(-9.75f, -3.5f, -3.5f, 4.0f, 7.0f, 7.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(5.5f, 8.4293f, 5.9875f, 0.2182f, 0.0f, 0.0f));
        PartDefinition leg3 = partdefinition.addOrReplaceChild("leg3", CubeListBuilder.create().texOffs(25, 62).addBox(-0.125f, 10.7545f, 2.2582f, 5.0f, 8.0f, 7.0f, new CubeDeformation(0.0f)).texOffs(70, 4).addBox(-0.625f, 16.7545f, 1.5082f, 2.0f, 2.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(70, 0).addBox(3.375f, 16.7545f, 1.5082f, 2.0f, 2.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(4, 46).addBox(0.375f, 16.7545f, 0.5082f, 0.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(38, 47).addBox(4.375f, 16.7545f, 0.5082f, 0.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(49, 7).addBox(0.375f, 17.7545f, -0.4918f, 0.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(28, 58).addBox(4.375f, 17.7545f, -0.4918f, 0.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 64).addBox(1.375f, 16.7545f, 9.1332f, 2.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offset(5.5f, 5.25f, 8.0f));
        leg3.addOrReplaceChild("leg6_r1", CubeListBuilder.create().texOffs(42, 62).addBox(0.25f, -8.5f, -1.0f, 2.0f, 1.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(89, 65).addBox(0.25f, -7.55f, -1.0f, 3.0f, 9.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.25f, 6.2057f, 3.4455f, 0.7854f, 0.0f, 0.0f));
        leg3.addOrReplaceChild("leg4_r3", CubeListBuilder.create().texOffs(66, 71).addBox(5.75f, -3.5f, -3.5f, 4.0f, 7.0f, 7.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-5.5f, 8.4293f, 4.9875f, 0.2182f, 0.0f, 0.0f));
        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    public void renderToBuffer(@NotNull PoseStack poseStack, @NotNull VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        this.head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.ArmL.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.ArmR.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.leg0.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.leg1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.leg2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.leg3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setupAnim(@NotNull T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.head.yRot = netHeadYaw / 57.295776f;
        this.head.xRot = headPitch / 57.295776f;
        this.leg0.xRot = Mth.cos(limbSwing * 1.0f) * 1.0f * limbSwingAmount;
        this.leg1.xRot = Mth.cos(limbSwing * 1.0f) * 1.0f * limbSwingAmount;
        this.leg2.xRot = Mth.cos(limbSwing * 1.0f) * -1.0f * limbSwingAmount;
        this.leg3.xRot = Mth.cos(limbSwing * 1.0f) * -1.0f * limbSwingAmount;
        this.ArmR.xRot = Mth.cos((limbSwing * 0.6662f) + 3.1415927f) * limbSwingAmount;
        this.ArmL.xRot = Mth.cos(limbSwing * 0.6662f) * limbSwingAmount;
    }
}
