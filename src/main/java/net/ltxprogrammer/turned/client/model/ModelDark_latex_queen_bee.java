package net.ltxprogrammer.turned.client.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.ltxprogrammer.changed.client.renderer.model.LatexHumanoidModel;
import net.ltxprogrammer.changed.client.renderer.model.LatexHumanoidModelController;
import net.ltxprogrammer.changed.client.renderer.model.LatexHumanoidModelInterface;
import net.ltxprogrammer.turned.LatexMod;
import net.ltxprogrammer.turned.entity.DarkLatexQueenBeeEntity;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.world.entity.HumanoidArm;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/model/ModelDark_latex_queen_bee.class */
public class ModelDark_latex_queen_bee extends LatexHumanoidModel<DarkLatexQueenBeeEntity> implements LatexHumanoidModelInterface {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(LatexMod.modResource("dl_queen_bee"), "main");
    private final ModelPart QueenBee;
    private final ModelPart Head;
    private final ModelPart Torso;
    private final ModelPart LeftArm;
    private final ModelPart RightArm;
    private final ModelPart LeftLeg;
    private final ModelPart RightLeg;
    private final LatexHumanoidModelController controller;

    public ModelDark_latex_queen_bee(ModelPart root) {
        super(root);
        this.QueenBee = root.getChild("QueenBee");
        this.Head = this.QueenBee.getChild("Head");
        this.Torso = this.QueenBee.getChild("Body");
        this.LeftArm = this.QueenBee.getChild("LeftArm");
        this.RightArm = this.QueenBee.getChild("RightArm");
        this.LeftLeg = this.QueenBee.getChild("LeftLeg");
        this.RightLeg = this.QueenBee.getChild("RightLeg");
        this.controller = LatexHumanoidModelController.Builder.of(this, this.Head, this.Torso, this.Torso.getChild("Tail"), this.RightArm, this.LeftArm, this.RightLeg, this.LeftLeg).hipOffset(0.0f).build();
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition QueenBee = meshdefinition.getRoot().addOrReplaceChild("QueenBee", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0f, 24.0f, 0.0f, 0.0f, 3.1416f, 0.0f));
        PartDefinition Head = QueenBee.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(28, 28).addBox(-4.0f, -7.0f, -4.0f, 8.0f, 6.0f, 8.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, -34.0f, 0.0f));
        Head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-3.5f, -20.7f, -6.0f, 1.0f, 5.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(4, 5).addBox(-9.5f, -20.7f, -6.0f, 1.0f, 5.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(6.0f, -4.4965f, -13.7044f, -1.5708f, 0.0f, 0.0f));
        Head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(31, 0).addBox(-3.5f, -19.7f, -6.0f, 1.0f, 4.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(58, 0).addBox(-9.5f, -19.7f, -6.0f, 1.0f, 4.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(6.0f, 10.0f, 0.0f, -0.3927f, 0.0f, 0.0f));
        Head.addOrReplaceChild("Mask", CubeListBuilder.create().texOffs(28, 25).addBox(-3.0f, -12.0f, 4.5f, 6.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(28, 26).addBox(3.0f, -13.0f, 4.5f, 1.0f, 3.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(48, 27).addBox(4.0f, -14.0f, 4.5f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(28, 24).addBox(-6.0f, -15.0f, 4.5f, 12.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(0, 12).addBox(-3.0f, -16.0f, 4.5f, 6.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(14, 34).addBox(-2.0f, -17.0f, 4.5f, 4.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(2, 49).addBox(-5.0f, -14.0f, 4.5f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(10, 9).addBox(-4.0f, -13.0f, 4.5f, 1.0f, 3.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(17, 49).addBox(-1.0f, -14.0f, 4.5f, 2.0f, 2.0f, 0.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 10.0f, 0.0f));
        QueenBee.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 38).addBox(-6.0f, 1.0f, -2.0f, 12.0f, 5.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(0, 22).addBox(-5.0f, -1.0f, -4.0f, 10.0f, 4.0f, 8.0f, new CubeDeformation(0.0f)).texOffs(31, 0).addBox(-5.0f, 3.0f, -3.25f, 10.0f, 1.0f, 7.0f, new CubeDeformation(0.0f)).texOffs(56, 43).addBox(-7.0f, 0.0f, -4.0f, 2.0f, 4.0f, 8.0f, new CubeDeformation(0.0f)).texOffs(19, 75).addBox(-6.0f, 4.0f, -3.25f, 1.0f, 1.0f, 7.0f, new CubeDeformation(0.0f)).texOffs(52, 24).addBox(5.0f, 0.0f, -4.0f, 2.0f, 4.0f, 8.0f, new CubeDeformation(0.0f)).texOffs(72, 74).addBox(5.0f, 4.0f, -3.25f, 1.0f, 1.0f, 7.0f, new CubeDeformation(0.0f)).texOffs(38, 16).addBox(-5.0f, 3.25f, -3.0f, 10.0f, 2.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(22, 51).addBox(-4.0f, 6.0f, -2.0f, 8.0f, 5.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(32, 42).addBox(-5.0f, 11.0f, -2.0f, 10.0f, 5.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(0, 47).addBox(-3.0f, 9.0f, -2.5f, 6.0f, 6.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, -34.0f, 0.0f));
        PartDefinition Wings = QueenBee.addOrReplaceChild("Wings", CubeListBuilder.create(), PartPose.offset(0.0f, -27.0f, 0.0f));
        Wings.addOrReplaceChild("LeftWings", CubeListBuilder.create().texOffs(30, 47).addBox(0.159f, -6.6563f, 1.8484f, 1.0f, 2.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(0, 47).addBox(-0.841f, -8.6563f, 1.8484f, 1.0f, 4.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(2, 76).addBox(-1.841f, -9.6563f, 1.8484f, 1.0f, 6.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(4, 34).addBox(-4.841f, -10.6563f, 1.8484f, 4.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(62, 42).addBox(-2.841f, -9.6563f, 1.8484f, 1.0f, 7.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(47, 11).addBox(-0.841f, -9.6563f, 1.8484f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(33, 27).addBox(-8.841f, -9.6563f, 1.8484f, 4.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(22, 47).addBox(-4.841f, -9.6563f, 1.8484f, 2.0f, 8.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(52, 24).addBox(-7.841f, -8.6563f, 1.8484f, 2.0f, 8.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(62, 55).addBox(-5.841f, -8.6563f, 1.8484f, 1.0f, 7.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(32, 60).addBox(-8.841f, -8.6563f, 1.8484f, 1.0f, 9.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(45, 12).addBox(-10.841f, -8.6563f, 1.8484f, 2.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(56, 24).addBox(-10.841f, -7.6563f, 1.8484f, 2.0f, 8.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(47, 8).addBox(-11.841f, -7.6563f, 1.8484f, 1.0f, 2.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(6, 76).addBox(-12.841f, -5.6563f, 1.8484f, 1.0f, 6.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(4, 76).addBox(-11.841f, -5.6563f, 1.8484f, 1.0f, 6.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(33, 26).addBox(-11.841f, 0.3438f, 1.8484f, 4.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(44, 25).addBox(-7.841f, -0.6563f, 1.8484f, 2.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(22, 34).addBox(-5.841f, -1.6563f, 1.8484f, 3.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(47, 10).addBox(-2.841f, -2.6563f, 1.8484f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(20, 47).addBox(-1.841f, -3.6563f, 1.8484f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(41, 27).addBox(-0.841f, -4.6563f, 1.8484f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)), PartPose.offset(-6.159f, 2.6563f, -6.0984f)).addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(60, 55).addBox(-0.9688f, -3.6563f, 0.0f, 1.0f, 7.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(43, 8).addBox(-3.9688f, -0.6563f, 0.0f, 1.0f, 4.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(23, 37).addBox(0.0312f, 2.3438f, 0.0f, 2.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(31, 11).addBox(-3.9688f, 3.3438f, 0.0f, 4.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(4, 37).addBox(3.0312f, 0.3438f, 0.0f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(40, 25).addBox(2.0312f, 1.3438f, 0.0f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(2, 7).addBox(-4.9688f, -0.6563f, 0.0f, 1.0f, 5.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(36, 22).addBox(-3.9688f, -2.6563f, 0.0f, 1.0f, 2.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(30, 73).addBox(-2.9688f, -2.6563f, 0.0f, 1.0f, 6.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(0, 76).addBox(-1.9688f, -2.6563f, 0.0f, 1.0f, 6.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(60, 36).addBox(0.0312f, -3.6563f, 0.0f, 2.0f, 6.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(41, 12).addBox(-2.9688f, -3.6563f, 0.0f, 2.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(39, 8).addBox(2.0312f, -3.6563f, 0.0f, 1.0f, 5.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(31, 12).addBox(-0.9688f, -4.6563f, 0.0f, 4.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(45, 8).addBox(3.0312f, -3.6563f, 0.0f, 1.0f, 4.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(2, 47).addBox(4.0312f, -1.6563f, 0.0f, 1.0f, 2.0f, 0.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, 0.0f, -0.7854f, 0.0f));
        PartDefinition RightWings = Wings.addOrReplaceChild("RightWings", CubeListBuilder.create().texOffs(0, 34).addBox(-2.5476f, -4.619f, 0.0f, 2.0f, 8.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(31, 6).addBox(-2.5476f, 3.381f, 0.0f, 3.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(15, 37).addBox(0.4524f, 4.381f, 0.0f, 2.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(4, 22).addBox(0.4524f, -3.619f, 0.0f, 2.0f, 8.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(34, 60).addBox(-0.5476f, -3.619f, 0.0f, 1.0f, 7.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(10, 0).addBox(2.4524f, -3.619f, 0.0f, 1.0f, 9.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(31, 8).addBox(2.4524f, 5.381f, 0.0f, 4.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(64, 36).addBox(5.4524f, -0.619f, 0.0f, 1.0f, 6.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(58, 69).addBox(6.4524f, -0.619f, 0.0f, 1.0f, 6.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(31, 0).addBox(5.4524f, -2.619f, 0.0f, 1.0f, 2.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(0, 22).addBox(3.4524f, -2.619f, 0.0f, 2.0f, 8.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(19, 37).addBox(3.4524f, -3.619f, 0.0f, 2.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(31, 9).addBox(-0.5476f, -4.619f, 0.0f, 4.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(31, 10).addBox(-4.5476f, -5.619f, 0.0f, 4.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(60, 42).addBox(-3.5476f, -4.619f, 0.0f, 1.0f, 7.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(23, 35).addBox(-5.5476f, -4.619f, 0.0f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(28, 73).addBox(-4.5476f, -4.619f, 0.0f, 1.0f, 6.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(34, 42).addBox(-5.5476f, -3.619f, 0.0f, 1.0f, 4.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(35, 0).addBox(-6.5476f, -1.619f, 0.0f, 1.0f, 2.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(34, 34).addBox(-5.5476f, 0.381f, 0.0f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(14, 35).addBox(-4.5476f, 1.381f, 0.0f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(19, 35).addBox(-3.5476f, 2.381f, 0.0f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)), PartPose.offset(11.5476f, -2.381f, -4.25f));
        RightWings.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(28, 23).addBox(-3.2667f, -4.6f, 0.0f, 4.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(11, 37).addBox(0.7333f, -3.6f, 0.0f, 2.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(0, 0).addBox(2.7333f, -2.6f, 0.0f, 1.0f, 2.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(7, 35).addBox(-2.2667f, 2.4f, 0.0f, 2.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(30, 34).addBox(-3.2667f, 1.4f, 0.0f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(4, 0).addBox(-5.2667f, -1.6f, 0.0f, 1.0f, 2.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(0, 7).addBox(-3.2667f, -3.6f, 0.0f, 1.0f, 5.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(32, 42).addBox(-4.2667f, -3.6f, 0.0f, 1.0f, 4.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(14, 58).addBox(-2.2667f, -3.6f, 0.0f, 2.0f, 6.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(8, 0).addBox(-0.2667f, -3.6f, 0.0f, 1.0f, 7.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(64, 16).addBox(0.7333f, -2.6f, 0.0f, 1.0f, 6.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(28, 22).addBox(-0.2667f, 3.4f, 0.0f, 4.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(41, 8).addBox(2.7333f, -0.6f, 0.0f, 1.0f, 4.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(6, 0).addBox(3.7333f, -0.6f, 0.0f, 1.0f, 5.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(64, 0).addBox(1.7333f, -2.6f, 0.0f, 1.0f, 6.0f, 0.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-5.2221f, 4.981f, -2.0148f, 0.0f, 0.7854f, 0.0f));
        RightWings.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(33, 28).addBox(11.0f, -3.0f, 0.75f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-16.5476f, 8.381f, 8.25f, 0.0f, 0.7854f, 0.0f));
        PartDefinition Tail = QueenBee.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offset(0.0f, -22.0f, -1.0f));
        Tail.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(78, 60).addBox(-2.0f, 0.0f, -4.5f, 5.0f, 5.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(0, 0).addBox(-4.0f, -2.0f, -17.5f, 9.0f, 9.0f, 13.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-0.5f, -3.0f, 1.0f, 0.3927f, 0.0f, 0.0f));
        Tail.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(10, 34).addBox(0.0f, -9.0f, -18.5f, 1.0f, 1.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-0.5f, -9.247f, -7.3241f, 1.5708f, 0.0f, 0.0f));
        Tail.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(28, 26).addBox(0.0f, -5.0f, -19.5f, 1.0f, 1.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-0.5f, -3.0f, 1.0f, 0.7854f, 0.0f, 0.0f));
        QueenBee.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(0, 58).addBox(1.0f, 2.0f, -2.0f, 3.0f, 14.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(44, 26).addBox(3.0f, 16.0f, -2.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(41, 25).addBox(3.0f, 16.0f, 1.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(7, 36).addBox(3.0f, 16.0f, -0.5f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(78, 0).addBox(1.0f, -2.0f, -2.0f, 4.0f, 4.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(68, 40).addBox(0.5f, -2.5f, -2.5f, 4.0f, 4.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(45, 71).addBox(0.5f, 11.0f, -2.5f, 4.0f, 4.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offset(5.0f, -31.0f, 0.0f));
        QueenBee.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(46, 51).addBox(-4.0f, 2.0f, -2.0f, 3.0f, 14.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(24, 35).addBox(-4.0f, 16.0f, -2.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(20, 35).addBox(-4.0f, 16.0f, 1.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(16, 35).addBox(-4.0f, 16.0f, -0.5f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(63, 73).addBox(-5.0f, -2.0f, -2.0f, 4.0f, 4.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(67, 31).addBox(-4.5f, -2.5f, -2.5f, 4.0f, 4.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(65, 22).addBox(-4.5f, 11.0f, -2.5f, 4.0f, 4.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offset(-5.0f, -31.0f, 0.0f));
        PartDefinition RightLeg = QueenBee.addOrReplaceChild("RightLeg", CubeListBuilder.create(), PartPose.offset(2.0f, -19.0f, 0.0f));
        RightLeg.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(61, 3).addBox(-2.5f, -3.25f, -0.5f, 6.0f, 3.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(66, 11).addBox(-2.0f, -6.25f, 0.0f, 5.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 9.6932f, -2.6685f, -0.829f, 0.0f, 0.0f));
        RightLeg.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(60, 60).addBox(-2.0f, -6.25f, 0.0f, 5.0f, 9.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 7.0f, 0.0f, 0.3054f, 0.0f, 0.0f));
        RightLeg.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(17, 47).addBox(0.0f, 11.0f, 1.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(26, 47).addBox(1.5f, 11.0f, 1.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(47, 25).addBox(-1.5f, 11.0f, 1.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(10, 73).addBox(-1.5f, 6.0f, -2.0f, 4.0f, 5.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 9.0052f, 4.2588f, -1.1781f, 0.0f, 0.0f));
        PartDefinition LeftLeg = QueenBee.addOrReplaceChild("LeftLeg", CubeListBuilder.create(), PartPose.offset(-2.0f, -19.0f, 0.0f));
        LeftLeg.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(44, 8).addBox(-3.5f, -3.25f, -0.5f, 6.0f, 3.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(32, 65).addBox(-3.0f, -6.25f, 0.0f, 5.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 9.6932f, -2.6685f, -0.829f, 0.0f, 0.0f));
        LeftLeg.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(14, 60).addBox(-3.0f, -6.25f, 0.0f, 5.0f, 9.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 7.0f, 0.0f, 0.3054f, 0.0f, 0.0f));
        LeftLeg.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(27, 34).addBox(-1.0f, 11.0f, 1.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(31, 34).addBox(-2.5f, 11.0f, 1.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(4, 35).addBox(0.5f, 11.0f, 1.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(72, 51).addBox(-2.5f, 6.0f, -2.0f, 4.0f, 5.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 9.0052f, 4.2588f, -1.1781f, 0.0f, 0.0f));
        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        this.QueenBee.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void prepareMobModel(DarkLatexQueenBeeEntity p_102861_, float p_102862_, float p_102863_, float p_102864_) {
        prepareMobModel(this.controller, p_102861_, p_102862_, p_102863_, p_102864_);
    }

    public void setupAnim(DarkLatexQueenBeeEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float HeadPitch) {
        this.controller.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, HeadPitch);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: net.ltxprogrammer.turned.client.model.ModelDark_latex_queen_bee$1 */
    /* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/model/ModelDark_latex_queen_bee$1.class */
    public static /* synthetic */ class C00621 {
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
        switch (C00621.$SwitchMap$net$minecraft$world$entity$HumanoidArm[humanoidArm.ordinal()]) {
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
