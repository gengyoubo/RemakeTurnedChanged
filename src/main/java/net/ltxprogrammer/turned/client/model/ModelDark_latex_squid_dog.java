package net.ltxprogrammer.turned.client.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.ltxprogrammer.changed.client.renderer.model.LatexHumanoidModel;
import net.ltxprogrammer.changed.client.renderer.model.LatexHumanoidModelController;
import net.ltxprogrammer.changed.client.renderer.model.LatexHumanoidModelInterface;
import net.ltxprogrammer.turned.LatexMod;
import net.ltxprogrammer.turned.entity.DlSquidDogEntity;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.HumanoidArm;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/model/ModelDark_latex_squid_dog.class */
public class ModelDark_latex_squid_dog extends LatexHumanoidModel<DlSquidDogEntity> implements LatexHumanoidModelInterface {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(LatexMod.MODID, "model_dark_latex_squid_dog"), "main");
    public final ModelPart Head;
    public final ModelPart Torso;
    public final ModelPart LeftArm;
    public final ModelPart RightArm;
    public final ModelPart LeftArm2;
    public final ModelPart RightArm2;
    public final ModelPart LeftLeg;
    public final ModelPart Rightleg;
    public final LatexHumanoidModelController controller;

    public ModelDark_latex_squid_dog(ModelPart root) {
        super(root);
        this.Head = root.getChild("head");
        this.Torso = root.getChild("body");
        this.LeftArm = root.getChild("rightArm");
        this.RightArm = root.getChild("leftArm");
        this.LeftArm2 = root.getChild("rightArm2");
        this.RightArm2 = root.getChild("leftArm2");
        this.LeftLeg = root.getChild("rightLeg");
        this.Rightleg = root.getChild("leftLeg");
        this.controller = LatexHumanoidModelController.Builder.of(this, this.Head, this.Torso, this.Torso.getChild("Tail"), this.RightArm, this.LeftArm, this.Rightleg, this.LeftLeg).arms2(this.RightArm2, this.LeftArm2).hipOffset(-5.0f).build();
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 19).addBox(-4.0f, -7.375f, -4.0f, 8.0f, 8.0f, 8.0f, new CubeDeformation(0.0f)).texOffs(24, 19).addBox(-5.0f, -3.375f, -4.0f, 1.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(35, 12).addBox(-5.75f, -3.25f, -3.75f, 2.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(27, 12).addBox(3.75f, -3.25f, -3.75f, 2.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(22, 0).addBox(-4.625f, -2.75f, -3.875f, 1.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 0).addBox(4.0f, -3.375f, -4.0f, 1.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(11, 0).addBox(3.625f, -2.75f, -3.875f, 1.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, -5.0f, 0.0f));
        head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(0, 19).addBox(0.5f, -1.75f, -1.625f, 1.0f, 4.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(14, 35).addBox(-0.5f, -0.75f, -1.625f, 1.0f, 3.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(3.5f, -8.375f, 0.5f, 0.0f, 1.5708f, 0.3927f));
        head.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(38, 27).addBox(-0.5f, -0.75f, -1.625f, 1.0f, 3.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(0, 35).addBox(-1.5f, -1.75f, -1.625f, 1.0f, 4.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-3.5f, -8.375f, 0.5f, 0.0f, -1.5708f, -0.3927f));
        head.addOrReplaceChild("mask", CubeListBuilder.create().texOffs(29, 8).addBox(-1.0f, -11.375f, -5.0f, 2.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(0, 13).addBox(-4.0f, -6.375f, -5.0f, 8.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(0, 14).addBox(-3.0f, -5.375f, -5.0f, 6.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(3, 3).addBox(-2.5f, -4.375f, -5.0f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(3, 0).addBox(1.5f, -4.375f, -5.0f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(0, 15).addBox(-3.0f, -9.375f, -5.0f, 6.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(0, 26).addBox(-2.0f, -10.375f, -5.0f, 4.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(0, 19).addBox(-0.5f, -7.375f, -5.0f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(24, 22).addBox(2.375f, -7.375f, -5.0f, 2.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(22, 3).addBox(-4.375f, -7.375f, -5.0f, 2.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(14, 3).addBox(-3.375f, -8.375f, -5.0f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(14, 0).addBox(2.375f, -8.375f, -5.0f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(27, 14).addBox(-1.5f, -8.375f, -5.0f, 3.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 4.0f, 0.75f));
        PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(24, 19).addBox(-4.5f, 0.625f, -2.0f, 9.0f, 4.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(28, 38).addBox(-1.375f, -1.375f, -1.375f, 3.0f, 2.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(30, 47).addBox(1.0f, -1.0f, -3.0f, 4.0f, 4.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(0, 46).addBox(-5.0f, -1.0f, -3.0f, 4.0f, 4.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(38, 12).addBox(-4.5f, 10.625f, -2.0f, 9.0f, 2.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(36, 41).addBox(-4.0f, 4.625f, -2.0f, 8.0f, 2.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(53, 0).addBox(-2.5f, 12.625f, -2.0f, 5.0f, 1.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(50, 18).addBox(-3.5f, 6.625f, -2.0f, 7.0f, 4.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, -5.0f, 0.0f));
        PartDefinition Tentapaws = body.addOrReplaceChild("Tentapaws", CubeListBuilder.create(), PartPose.offset(0.0f, 25.0f, 0.0f));
        PartDefinition Tentapaw1 = Tentapaws.addOrReplaceChild("Tentapaw1", CubeListBuilder.create(), PartPose.offset(1.3642f, -22.6544f, 2.3598f));
        Tentapaw1.addOrReplaceChild("Body_r1", CubeListBuilder.create().texOffs(61, 47).addBox(0.8003f, -4.0208f, 19.792f, 1.0f, 1.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(42, 57).addBox(0.8003f, -3.0208f, 24.167f, 1.0f, 1.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(5, 57).addBox(0.8003f, -1.6458f, 24.167f, 1.0f, 1.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(0, 56).addBox(0.8003f, -0.0208f, 24.167f, 1.0f, 1.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(26, 49).addBox(0.8003f, 1.3542f, 24.167f, 1.0f, 1.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(44, 47).addBox(0.8003f, 2.3542f, 19.792f, 1.0f, 1.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(51, 90).addBox(0.8003f, -2.3958f, 19.792f, 1.0f, 4.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(10.7875f, 5.4329f, 5.2181f, -2.2119f, 0.7864f, 2.9331f));
        Tentapaw1.addOrReplaceChild("Body_r2", CubeListBuilder.create().texOffs(57, 84).addBox(-2.347f, -1.375f, -4.6602f, 3.0f, 3.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(11.0f, -3.0f, 4.0f, -2.9234f, 1.5272f, 3.1416f));
        Tentapaw1.addOrReplaceChild("Body_r3", CubeListBuilder.create().texOffs(91, 57).addBox(-1.0849f, -0.25f, 16.4149f, 3.0f, 6.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(31, 57).addBox(-1.0849f, -1.25f, 11.4149f, 3.0f, 8.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(11, 84).addBox(-1.3349f, 1.375f, 6.6649f, 3.0f, 3.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(11.0f, -3.0f, 4.0f, -2.2119f, 0.7864f, 2.9331f));
        Tentapaw1.addOrReplaceChild("Body_r4", CubeListBuilder.create().texOffs(38, 30).addBox(-1.3349f, -1.625f, -0.3351f, 3.0f, 3.0f, 8.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(11.0f, -3.0f, 4.0f, -2.6483f, 0.7864f, 2.9331f));
        Tentapaw1.addOrReplaceChild("Body_r5", CubeListBuilder.create().texOffs(68, 87).addBox(-2.875f, -0.75f, 1.0f, 3.0f, 3.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(1.9067f, -1.5622f, 1.8475f, 0.491f, 1.1418f, 0.3592f));
        Tentapaw1.addOrReplaceChild("Body_r6", CubeListBuilder.create().texOffs(84, 87).addBox(-2.5f, -0.5f, 0.0f, 3.0f, 3.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(1.1358f, -0.8456f, -1.3598f, 0.2182f, 0.4363f, 0.0f));
        PartDefinition Tentapaw2 = Tentapaws.addOrReplaceChild("Tentapaw2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.3642f, -18.6544f, 2.3598f, 0.0f, 0.0f, 0.6109f));
        Tentapaw2.addOrReplaceChild("Body_r7", CubeListBuilder.create().texOffs(41, 82).addBox(-2.347f, -1.375f, -4.6602f, 3.0f, 3.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(9.9122f, -3.2783f, 4.0f, -2.9234f, 1.5272f, 3.1416f));
        Tentapaw2.addOrReplaceChild("Body_r8", CubeListBuilder.create().texOffs(91, 35).addBox(-0.4081f, 1.8708f, 15.506f, 3.0f, 6.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(86, 74).addBox(1.8003f, 1.2292f, 10.917f, 1.0f, 1.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(84, 0).addBox(1.8003f, 2.2292f, 15.292f, 1.0f, 1.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(36, 81).addBox(1.8003f, 3.6042f, 15.292f, 1.0f, 1.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(52, 82).addBox(1.8003f, 5.2292f, 15.292f, 1.0f, 1.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(86, 12).addBox(1.8003f, 6.6042f, 15.292f, 1.0f, 1.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(79, 87).addBox(1.8003f, 7.6042f, 10.917f, 1.0f, 1.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(92, 45).addBox(1.8003f, 2.8542f, 10.917f, 1.0f, 4.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(15, 52).addBox(-0.4081f, 0.8708f, 10.506f, 3.0f, 8.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(83, 4).addBox(-0.6581f, 3.4958f, 5.756f, 3.0f, 3.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(9.6998f, -4.8455f, 5.2181f, -2.1217f, 0.9972f, -2.8432f));
        Tentapaw2.addOrReplaceChild("Body_r9", CubeListBuilder.create().texOffs(14, 38).addBox(-0.6581f, 0.6812f, -0.2626f, 3.0f, 3.0f, 8.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(9.6998f, -4.8455f, 5.2181f, -2.5581f, 0.9972f, -2.8432f));
        Tentapaw2.addOrReplaceChild("Body_r10", CubeListBuilder.create().texOffs(83, 27).addBox(-2.875f, -0.75f, 1.0f, 3.0f, 3.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.8189f, -1.8405f, 1.8475f, 0.491f, 1.1418f, 0.3592f));
        Tentapaw2.addOrReplaceChild("Body_r11", CubeListBuilder.create().texOffs(83, 66).addBox(-2.5f, -0.5f, 0.0f, 3.0f, 3.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0481f, -1.1239f, -1.3598f, 0.2182f, 0.4363f, 0.0f));
        PartDefinition Tentapaw3 = Tentapaws.addOrReplaceChild("Tentapaw3", CubeListBuilder.create(), PartPose.offset(-2.6358f, -22.6544f, 3.3598f));
        Tentapaw3.addOrReplaceChild("Body_r12", CubeListBuilder.create().texOffs(47, 26).addBox(-1.8003f, -1.6458f, 24.167f, 1.0f, 1.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(46, 18).addBox(-1.8003f, -0.0208f, 24.167f, 1.0f, 1.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(39, 4).addBox(-1.8003f, 1.3542f, 24.167f, 1.0f, 1.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(39, 0).addBox(-1.8003f, -4.0208f, 19.792f, 1.0f, 1.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(30, 12).addBox(-1.8003f, -3.0208f, 24.167f, 1.0f, 1.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(22, 0).addBox(-1.8003f, -2.3958f, 19.792f, 1.0f, 4.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(22, 12).addBox(-1.8003f, 2.3542f, 19.792f, 1.0f, 1.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-9.5159f, 5.4329f, 4.2181f, -2.2119f, -0.7864f, -2.9331f));
        Tentapaw3.addOrReplaceChild("Body_r13", CubeListBuilder.create().texOffs(0, 81).addBox(-0.653f, -1.375f, -4.6602f, 3.0f, 3.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-9.7284f, -3.0f, 3.0f, -2.9234f, -1.5272f, -3.1416f));
        Tentapaw3.addOrReplaceChild("Body_r14", CubeListBuilder.create().texOffs(39, 90).addBox(-1.9151f, -0.25f, 16.4149f, 3.0f, 6.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(50, 47).addBox(-1.9151f, -1.25f, 11.4149f, 3.0f, 8.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(25, 81).addBox(-1.6651f, 1.375f, 6.6649f, 3.0f, 3.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-9.7284f, -3.0f, 3.0f, -2.2119f, -0.7864f, -2.9331f));
        Tentapaw3.addOrReplaceChild("Body_r15", CubeListBuilder.create().texOffs(0, 35).addBox(-1.6651f, -1.625f, -0.3351f, 3.0f, 3.0f, 8.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-9.7284f, -3.0f, 3.0f, -2.6483f, -0.7864f, -2.9331f));
        Tentapaw3.addOrReplaceChild("Body_r16", CubeListBuilder.create().texOffs(81, 79).addBox(-0.125f, -0.75f, 1.0f, 3.0f, 3.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-0.635f, -1.5622f, 0.8475f, 0.491f, -1.1418f, -0.3592f));
        Tentapaw3.addOrReplaceChild("Body_r17", CubeListBuilder.create().texOffs(82, 19).addBox(-0.5f, -0.5f, 0.0f, 3.0f, 3.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.1358f, -0.8456f, -2.3598f, 0.2182f, -0.4363f, 0.0f));
        PartDefinition Tentapaw4 = Tentapaws.addOrReplaceChild("Tentapaw4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.3642f, -18.6544f, 2.3598f, 0.0f, 0.0f, -0.6109f));
        Tentapaw4.addOrReplaceChild("Body_r18", CubeListBuilder.create().texOffs(12, 92).addBox(-2.8003f, 2.8542f, 10.917f, 1.0f, 4.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(67, 0).addBox(-2.8003f, 7.6042f, 10.917f, 1.0f, 1.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(68, 33).addBox(-2.8003f, 6.6042f, 15.292f, 1.0f, 1.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(74, 54).addBox(-2.8003f, 5.2292f, 15.292f, 1.0f, 1.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(76, 41).addBox(-2.8003f, 3.6042f, 15.292f, 1.0f, 1.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(78, 19).addBox(-2.8003f, 2.2292f, 15.292f, 1.0f, 1.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(79, 66).addBox(-2.8003f, 1.2292f, 10.917f, 1.0f, 1.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(0, 89).addBox(-2.5919f, 1.8708f, 15.506f, 3.0f, 6.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(0, 0).addBox(-2.5919f, 0.8708f, 10.506f, 3.0f, 8.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(75, 58).addBox(-2.3419f, 3.4958f, 5.756f, 3.0f, 3.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-9.6998f, -4.8455f, 5.2181f, -2.1217f, -0.9972f, 2.8432f));
        Tentapaw4.addOrReplaceChild("Body_r19", CubeListBuilder.create().texOffs(72, 33).addBox(-0.653f, -1.375f, -4.6602f, 3.0f, 3.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-9.9122f, -3.2783f, 4.0f, -2.9234f, -1.5272f, -3.1416f));
        Tentapaw4.addOrReplaceChild("Body_r20", CubeListBuilder.create().texOffs(24, 27).addBox(-2.3419f, 0.6812f, -0.2626f, 3.0f, 3.0f, 8.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-9.6998f, -4.8455f, 5.2181f, -2.5581f, -0.9972f, 2.8432f));
        Tentapaw4.addOrReplaceChild("Body_r21", CubeListBuilder.create().texOffs(79, 49).addBox(-0.125f, -0.75f, 1.0f, 3.0f, 3.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-0.8189f, -1.8405f, 1.8475f, 0.491f, -1.1418f, -0.3592f));
        Tentapaw4.addOrReplaceChild("Body_r22", CubeListBuilder.create().texOffs(80, 41).addBox(-0.5f, -0.5f, 0.0f, 3.0f, 3.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-0.0481f, -1.1239f, -1.3598f, 0.2182f, -0.4363f, 0.0f));
        body.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offset(0.0f, 12.0f, 0.0f)).addOrReplaceChild("Tail_r1", CubeListBuilder.create().texOffs(39, 0).addBox(-1.25f, -19.459f, -1.031f, 3.0f, 1.0f, 8.0f, new CubeDeformation(0.0f)).texOffs(22, 0).addBox(-1.25f, -15.459f, 3.969f, 3.0f, 1.0f, 11.0f, new CubeDeformation(0.0f)).texOffs(22, 8).addBox(-1.25f, -18.459f, 15.969f, 3.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 0).addBox(-1.25f, -18.459f, -0.031f, 3.0f, 3.0f, 16.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 14.2802f, -8.3882f, -0.5672f, 0.0f, 0.0f));
        partdefinition.addOrReplaceChild("rightArm2", CubeListBuilder.create(), PartPose.offset(4.0f, -2.0f, 0.125f)).addOrReplaceChild("bone", CubeListBuilder.create().texOffs(16, 73).addBox(-1.7276f, 0.0853f, -2.0f, 3.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, -2.0f, 0.0f, 0.0f, 0.0f, -1.0908f)).addOrReplaceChild("bone8", CubeListBuilder.create().texOffs(47, 60).addBox(-1.7109f, -0.4976f, -1.9985f, 4.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(39, 9).addBox(1.2891f, 6.5024f, -1.9985f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(38, 33).addBox(1.2891f, 6.5024f, -0.4985f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(38, 14).addBox(1.2891f, 6.5024f, 1.0015f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-0.1687f, 6.9791f, 0.0f, -0.5672f, 0.0f, 0.7418f));
        partdefinition.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offset(3.75f, 2.25f, 0.75f)).addOrReplaceChild("bone13", CubeListBuilder.create().texOffs(58, 73).addBox(-1.6233f, -0.4507f, -2.0f, 3.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, -2.0f, 0.0f, 0.0f, 0.0f, -0.6545f)).addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(0, 61).addBox(-2.2102f, -0.9644f, -2.1567f, 4.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(42, 33).addBox(0.7898f, 6.0356f, -2.1567f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(14, 41).addBox(0.7898f, 6.0356f, -0.6567f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(18, 41).addBox(0.7898f, 6.0356f, 0.8433f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-0.2094f, 6.7095f, 0.0f, -0.5564f, -0.1166f, 0.5569f));
        partdefinition.addOrReplaceChild("leftArm2", CubeListBuilder.create(), PartPose.offset(-4.0f, -1.0f, 0.125f)).addOrReplaceChild("bone12", CubeListBuilder.create().texOffs(68, 22).addBox(-2.1594f, -0.3764f, -2.0f, 3.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 1.0908f)).addOrReplaceChild("bone11", CubeListBuilder.create().texOffs(52, 26).addBox(-2.3812f, -0.5688f, -2.0439f, 4.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(12, 14).addBox(-2.3812f, 6.4312f, -2.0439f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(11, 3).addBox(-2.3812f, 6.4312f, -0.5439f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 3).addBox(-2.3812f, 6.4312f, 0.9561f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-0.5933f, 6.5173f, 0.0f, -0.5672f, 0.0f, -0.7418f));
        partdefinition.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offset(-3.75f, 2.25f, 0.75f)).addOrReplaceChild("bone14", CubeListBuilder.create().texOffs(30, 70).addBox(-1.3767f, -0.4507f, -2.0f, 3.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.6545f)).addOrReplaceChild("bone10", CubeListBuilder.create().texOffs(60, 5).addBox(-1.7898f, -0.9644f, -2.1567f, 4.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(19, 35).addBox(-1.7898f, 6.0356f, -2.1567f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(28, 2).addBox(-1.7898f, 6.0356f, -0.6567f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(28, 0).addBox(-1.7898f, 6.0356f, 0.8433f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.2094f, 6.7095f, 0.0f, -0.5564f, 0.1166f, -0.5569f));
        PartDefinition rightLeg = partdefinition.addOrReplaceChild("rightLeg", CubeListBuilder.create().texOffs(72, 12).addBox(-2.0f, -0.375f, -1.75f, 5.0f, 3.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(16, 65).addBox(-0.125f, 13.9965f, -3.8953f, 4.0f, 3.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offset(2.125f, 7.0f, 0.125f));
        rightLeg.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(72, 0).addBox(-1.5f, -3.0357f, -2.6784f, 4.0f, 5.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(23, 89).addBox(-1.25f, 1.9643f, -2.6784f, 4.0f, 3.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 5.0f, 0.0f, -0.3927f, 0.0f, 0.0f));
        rightLeg.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0f, 8.0f, -1.0f, 0.6545f, 0.0f, 0.0f)).addOrReplaceChild("bone6_r1", CubeListBuilder.create().texOffs(63, 63).addBox(-1.3698f, -4.6945f, -1.3912f, 4.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(5.0f, 3.688f, -0.051f, 0.0f, 0.0f, -0.1745f));
        rightLeg.addOrReplaceChild("bone7", CubeListBuilder.create().texOffs(72, 73).addBox(-0.125f, -1.1097f, 3.0027f, 4.0f, 8.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 8.0f, -1.0f, -0.48f, 0.0f, 0.0f));
        PartDefinition leftLeg = partdefinition.addOrReplaceChild("leftLeg", CubeListBuilder.create().texOffs(66, 47).addBox(-3.0f, -0.375f, -1.75f, 5.0f, 3.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(61, 55).addBox(-3.875f, 13.9965f, -3.8953f, 4.0f, 3.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-2.125f, 7.0f, 0.125f, 0.0f, 0.0f, 0.0f));
        leftLeg.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(0, 72).addBox(-2.5f, -3.0357f, -2.6784f, 4.0f, 5.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(90, 12).addBox(-2.75f, 1.9643f, -2.6784f, 4.0f, 3.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 5.0f, 0.0f, -0.3927f, 0.0f, 0.0f));
        leftLeg.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0f, 8.0f, -1.0f, 0.6545f, 0.0f, 0.0f)).addOrReplaceChild("bone7_r1", CubeListBuilder.create().texOffs(60, 37).addBox(-2.6302f, -4.6945f, -1.3912f, 4.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-5.0f, 3.688f, -0.051f, 0.0f, 0.0f, 0.1745f));
        leftLeg.addOrReplaceChild("bone9", CubeListBuilder.create().texOffs(44, 71).addBox(-3.875f, -1.1097f, 3.0027f, 4.0f, 8.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 8.0f, -1.0f, -0.48f, 0.0f, 0.0f));
        return LayerDefinition.create(meshdefinition, 112, 112);
    }

    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        this.Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.Torso.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.LeftArm2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.RightArm2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.Rightleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void prepareMobModel(DlSquidDogEntity p_102861_, float p_102862_, float p_102863_, float p_102864_) {
        prepareMobModel(this.controller, p_102861_, p_102862_, p_102863_, p_102864_);
    }

    public void setupAnim(DlSquidDogEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float HeadPitch) {
        this.controller.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, HeadPitch);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: net.ltxprogrammer.turned.client.model.ModelDark_latex_squid_dog$1 */
    /* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/model/ModelDark_latex_squid_dog$1.class */
    public static /* synthetic */ class C00641 {
        static final /* synthetic */ int[] $SwitchMap$net$minecraft$world$entity$HumanoidArm = new int[HumanoidArm.values().length];

        static {
            try {
                $SwitchMap$net$minecraft$world$entity$HumanoidArm[HumanoidArm.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$net$minecraft$world$entity$HumanoidArm[HumanoidArm.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
        }
    }

    public ModelPart getArm(HumanoidArm humanoidArm) {
        switch (C00641.$SwitchMap$net$minecraft$world$entity$HumanoidArm[humanoidArm.ordinal()]) {
            case 1:
                return this.LeftArm;
            case 2:
                return this.RightArm;
            default:
                throw new IncompatibleClassChangeError();
        }
    }

    public void setupHand() {
        this.controller.setupHand();
    }

    public LatexHumanoidModelController getController() {
        return this.controller;
    }

    public void translateToHand(HumanoidArm p_102108_, PoseStack p_102109_) {
        getArm(p_102108_).translateAndRotate(p_102109_);
    }

    public ModelPart getHead() {
        return this.Head;
    }
}
