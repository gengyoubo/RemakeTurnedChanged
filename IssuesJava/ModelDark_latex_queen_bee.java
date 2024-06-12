//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.ltxprogrammer.turned.client.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.ltxprogrammer.changed.client.renderer.model.LatexHumanoidModel;
import net.ltxprogrammer.changed.client.renderer.model.LatexHumanoidModelController;
import net.ltxprogrammer.changed.client.renderer.model.LatexHumanoidModelInterface;
import net.ltxprogrammer.changed.client.renderer.model.LatexHumanoidModelController.Builder;
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
        this.controller = Builder.of(this, this.Head, this.Torso, this.Torso.getChild("Tail"), this.RightArm, this.LeftArm, this.RightLeg, this.LeftLeg).hipOffset(0.0F).build();
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition QueenBee = partdefinition.addOrReplaceChild("QueenBee", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, 3.1416F, 0.0F));
        PartDefinition Head = QueenBee.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(28, 28).addBox(-4.0F, -7.0F, -4.0F, 8.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -34.0F, 0.0F));
        Head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-3.5F, -20.7F, -6.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(4, 5).addBox(-9.5F, -20.7F, -6.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, -4.4965F, -13.7044F, -1.5708F, 0.0F, 0.0F));
        Head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(31, 0).addBox(-3.5F, -19.7F, -6.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(58, 0).addBox(-9.5F, -19.7F, -6.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, 10.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
        Head.addOrReplaceChild("Mask", CubeListBuilder.create().texOffs(28, 25).addBox(-3.0F, -12.0F, 4.5F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(28, 26).addBox(3.0F, -13.0F, 4.5F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(48, 27).addBox(4.0F, -14.0F, 4.5F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(28, 24).addBox(-6.0F, -15.0F, 4.5F, 12.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 12).addBox(-3.0F, -16.0F, 4.5F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(14, 34).addBox(-2.0F, -17.0F, 4.5F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(2, 49).addBox(-5.0F, -14.0F, 4.5F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(10, 9).addBox(-4.0F, -13.0F, 4.5F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(17, 49).addBox(-1.0F, -14.0F, 4.5F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 10.0F, 0.0F));
        QueenBee.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 38).addBox(-6.0F, 1.0F, -2.0F, 12.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 22).addBox(-5.0F, -1.0F, -4.0F, 10.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(31, 0).addBox(-5.0F, 3.0F, -3.25F, 10.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(56, 43).addBox(-7.0F, 0.0F, -4.0F, 2.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(19, 75).addBox(-6.0F, 4.0F, -3.25F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(52, 24).addBox(5.0F, 0.0F, -4.0F, 2.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(72, 74).addBox(5.0F, 4.0F, -3.25F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(38, 16).addBox(-5.0F, 3.25F, -3.0F, 10.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(22, 51).addBox(-4.0F, 6.0F, -2.0F, 8.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 42).addBox(-5.0F, 11.0F, -2.0F, 10.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 47).addBox(-3.0F, 9.0F, -2.5F, 6.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -34.0F, 0.0F));
        PartDefinition Wings = QueenBee.addOrReplaceChild("Wings", CubeListBuilder.create(), PartPose.offset(0.0F, -27.0F, 0.0F));
        PartDefinition LeftWings = Wings.addOrReplaceChild("LeftWings", CubeListBuilder.create().texOffs(30, 47).addBox(0.159F, -6.6563F, 1.8484F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 47).addBox(-0.841F, -8.6563F, 1.8484F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(2, 76).addBox(-1.841F, -9.6563F, 1.8484F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(4, 34).addBox(-4.841F, -10.6563F, 1.8484F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(62, 42).addBox(-2.841F, -9.6563F, 1.8484F, 1.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(47, 11).addBox(-0.841F, -9.6563F, 1.8484F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(33, 27).addBox(-8.841F, -9.6563F, 1.8484F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(22, 47).addBox(-4.841F, -9.6563F, 1.8484F, 2.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(52, 24).addBox(-7.841F, -8.6563F, 1.8484F, 2.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(62, 55).addBox(-5.841F, -8.6563F, 1.8484F, 1.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(32, 60).addBox(-8.841F, -8.6563F, 1.8484F, 1.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(45, 12).addBox(-10.841F, -8.6563F, 1.8484F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(56, 24).addBox(-10.841F, -7.6563F, 1.8484F, 2.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(47, 8).addBox(-11.841F, -7.6563F, 1.8484F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(6, 76).addBox(-12.841F, -5.6563F, 1.8484F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(4, 76).addBox(-11.841F, -5.6563F, 1.8484F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(33, 26).addBox(-11.841F, 0.3438F, 1.8484F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(44, 25).addBox(-7.841F, -0.6563F, 1.8484F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(22, 34).addBox(-5.841F, -1.6563F, 1.8484F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(47, 10).addBox(-2.841F, -2.6563F, 1.8484F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(20, 47).addBox(-1.841F, -3.6563F, 1.8484F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(41, 27).addBox(-0.841F, -4.6563F, 1.8484F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(-6.159F, 2.6563F, -6.0984F));
        LeftWings.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(60, 55).addBox(-0.9688F, -3.6563F, 0.0F, 1.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(43, 8).addBox(-3.9688F, -0.6563F, 0.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(23, 37).addBox(0.0312F, 2.3438F, 0.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(31, 11).addBox(-3.9688F, 3.3438F, 0.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(4, 37).addBox(3.0312F, 0.3438F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(40, 25).addBox(2.0312F, 1.3438F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(2, 7).addBox(-4.9688F, -0.6563F, 0.0F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(36, 22).addBox(-3.9688F, -2.6563F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(30, 73).addBox(-2.9688F, -2.6563F, 0.0F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 76).addBox(-1.9688F, -2.6563F, 0.0F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(60, 36).addBox(0.0312F, -3.6563F, 0.0F, 2.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(41, 12).addBox(-2.9688F, -3.6563F, 0.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(39, 8).addBox(2.0312F, -3.6563F, 0.0F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(31, 12).addBox(-0.9688F, -4.6563F, 0.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(45, 8).addBox(3.0312F, -3.6563F, 0.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(2, 47).addBox(4.0312F, -1.6563F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));
        PartDefinition RightWings = Wings.addOrReplaceChild("RightWings", CubeListBuilder.create().texOffs(0, 34).addBox(-2.5476F, -4.619F, 0.0F, 2.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(31, 6).addBox(-2.5476F, 3.381F, 0.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(15, 37).addBox(0.4524F, 4.381F, 0.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(4, 22).addBox(0.4524F, -3.619F, 0.0F, 2.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(34, 60).addBox(-0.5476F, -3.619F, 0.0F, 1.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(10, 0).addBox(2.4524F, -3.619F, 0.0F, 1.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(31, 8).addBox(2.4524F, 5.381F, 0.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(64, 36).addBox(5.4524F, -0.619F, 0.0F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(58, 69).addBox(6.4524F, -0.619F, 0.0F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(31, 0).addBox(5.4524F, -2.619F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 22).addBox(3.4524F, -2.619F, 0.0F, 2.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(19, 37).addBox(3.4524F, -3.619F, 0.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(31, 9).addBox(-0.5476F, -4.619F, 0.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(31, 10).addBox(-4.5476F, -5.619F, 0.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(60, 42).addBox(-3.5476F, -4.619F, 0.0F, 1.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(23, 35).addBox(-5.5476F, -4.619F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(28, 73).addBox(-4.5476F, -4.619F, 0.0F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(34, 42).addBox(-5.5476F, -3.619F, 0.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(35, 0).addBox(-6.5476F, -1.619F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(34, 34).addBox(-5.5476F, 0.381F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(14, 35).addBox(-4.5476F, 1.381F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(19, 35).addBox(-3.5476F, 2.381F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(11.5476F, -2.381F, -4.25F));
        RightWings.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(28, 23).addBox(-3.2667F, -4.6F, 0.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(11, 37).addBox(0.7333F, -3.6F, 0.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(2.7333F, -2.6F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(7, 35).addBox(-2.2667F, 2.4F, 0.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(30, 34).addBox(-3.2667F, 1.4F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(4, 0).addBox(-5.2667F, -1.6F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 7).addBox(-3.2667F, -3.6F, 0.0F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(32, 42).addBox(-4.2667F, -3.6F, 0.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(14, 58).addBox(-2.2667F, -3.6F, 0.0F, 2.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(8, 0).addBox(-0.2667F, -3.6F, 0.0F, 1.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(64, 16).addBox(0.7333F, -2.6F, 0.0F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(28, 22).addBox(-0.2667F, 3.4F, 0.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(41, 8).addBox(2.7333F, -0.6F, 0.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(6, 0).addBox(3.7333F, -0.6F, 0.0F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(64, 0).addBox(1.7333F, -2.6F, 0.0F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.2221F, 4.981F, -2.0148F, 0.0F, 0.7854F, 0.0F));
        RightWings.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(33, 28).addBox(11.0F, -3.0F, 0.75F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.5476F, 8.381F, 8.25F, 0.0F, 0.7854F, 0.0F));
        PartDefinition Tail = QueenBee.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offset(0.0F, -22.0F, -1.0F));
        Tail.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(78, 60).addBox(-2.0F, 0.0F, -4.5F, 5.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-4.0F, -2.0F, -17.5F, 9.0F, 9.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -3.0F, 1.0F, 0.3927F, 0.0F, 0.0F));
        Tail.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(10, 34).addBox(0.0F, -9.0F, -18.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -9.247F, -7.3241F, 1.5708F, 0.0F, 0.0F));
        Tail.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(28, 26).addBox(0.0F, -5.0F, -19.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -3.0F, 1.0F, 0.7854F, 0.0F, 0.0F));
        QueenBee.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(0, 58).addBox(1.0F, 2.0F, -2.0F, 3.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(44, 26).addBox(3.0F, 16.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(41, 25).addBox(3.0F, 16.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(7, 36).addBox(3.0F, 16.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(78, 0).addBox(1.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(68, 40).addBox(0.5F, -2.5F, -2.5F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(45, 71).addBox(0.5F, 11.0F, -2.5F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -31.0F, 0.0F));
        QueenBee.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(46, 51).addBox(-4.0F, 2.0F, -2.0F, 3.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(24, 35).addBox(-4.0F, 16.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 35).addBox(-4.0F, 16.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 35).addBox(-4.0F, 16.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(63, 73).addBox(-5.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(67, 31).addBox(-4.5F, -2.5F, -2.5F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(65, 22).addBox(-4.5F, 11.0F, -2.5F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, -31.0F, 0.0F));
        PartDefinition RightLeg = QueenBee.addOrReplaceChild("RightLeg", CubeListBuilder.create(), PartPose.offset(2.0F, -19.0F, 0.0F));
        RightLeg.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(61, 3).addBox(-2.5F, -3.25F, -0.5F, 6.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(66, 11).addBox(-2.0F, -6.25F, 0.0F, 5.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.6932F, -2.6685F, -0.829F, 0.0F, 0.0F));
        RightLeg.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(60, 60).addBox(-2.0F, -6.25F, 0.0F, 5.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.0F, 0.0F, 0.3054F, 0.0F, 0.0F));
        RightLeg.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(17, 47).addBox(0.0F, 11.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 47).addBox(1.5F, 11.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(47, 25).addBox(-1.5F, 11.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 73).addBox(-1.5F, 6.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.0052F, 4.2588F, -1.1781F, 0.0F, 0.0F));
        PartDefinition LeftLeg = QueenBee.addOrReplaceChild("LeftLeg", CubeListBuilder.create(), PartPose.offset(-2.0F, -19.0F, 0.0F));
        LeftLeg.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(44, 8).addBox(-3.5F, -3.25F, -0.5F, 6.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(32, 65).addBox(-3.0F, -6.25F, 0.0F, 5.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.6932F, -2.6685F, -0.829F, 0.0F, 0.0F));
        LeftLeg.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(14, 60).addBox(-3.0F, -6.25F, 0.0F, 5.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.0F, 0.0F, 0.3054F, 0.0F, 0.0F));
        LeftLeg.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(27, 34).addBox(-1.0F, 11.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(31, 34).addBox(-2.5F, 11.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 35).addBox(0.5F, 11.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 51).addBox(-2.5F, 6.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.0052F, 4.2588F, -1.1781F, 0.0F, 0.0F));
        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        this.QueenBee.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void prepareMobModel(DarkLatexQueenBeeEntity p_102861_, float p_102862_, float p_102863_, float p_102864_) {
        this.prepareMobModel(this.controller, p_102861_, p_102862_, p_102863_, p_102864_);
    }

    public void setupAnim(DarkLatexQueenBeeEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float HeadPitch) {
        this.controller.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, HeadPitch);
    }

    public ModelPart getArm(HumanoidArm humanoidArm) {
        ModelPart var10000;
        switch (humanoidArm) {
            case LEFT -> var10000 = this.LeftArm;
            case RIGHT -> var10000 = this.RightArm;
            default -> throw new IncompatibleClassChangeError();
        }

        return var10000;
    }

    public void setupHand() {
        this.controller.setupHand();
    }

    public LatexHumanoidModelController getController() {
        return this.controller;
    }

    public void translateToHand(HumanoidArm p_102108_, PoseStack p_102109_) {
        this.getArm(p_102108_).translateAndRotate(p_102109_);
    }

    public ModelPart getHead() {
        return this.Head;
    }
}
