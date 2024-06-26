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

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/model/Modeldl_dragon_model.class */
public class Modeldl_dragon_model<T extends Entity> extends EntityModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(LatexMod.MODID, "modeldl_dragon_model"), "main");
    public final ModelPart Head;
    public final ModelPart Body;
    public final ModelPart Tail;
    public final ModelPart Wings;
    public final ModelPart LeftArm;
    public final ModelPart RightArm;
    public final ModelPart LeftLeg;
    public final ModelPart RightLeg;

    public Modeldl_dragon_model(ModelPart root) {
        this.Head = root.getChild("Head");
        this.Body = root.getChild("Body");
        this.Tail = root.getChild("Tail");
        this.Wings = root.getChild("Wings");
        this.LeftArm = root.getChild("LeftArm");
        this.RightArm = root.getChild("RightArm");
        this.LeftLeg = root.getChild("LeftLeg");
        this.RightLeg = root.getChild("RightLeg");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 16).addBox(-5.0f, -10.0f, -5.0f, 10.0f, 10.0f, 10.0f, new CubeDeformation(0.0f)).texOffs(30, 20).addBox(-4.0f, -4.0f, -7.0f, 8.0f, 4.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, -21.0f, 0.0f));
        Head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(54, 45).addBox(-4.7f, -26.0f, 7.0f, 1.0f, 5.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(58, 45).addBox(3.8f, -26.0f, 7.0f, 1.0f, 5.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 37).addBox(-4.7f, -27.0f, 8.0f, 1.0f, 6.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(4, 37).addBox(3.8f, -27.0f, 8.0f, 1.0f, 6.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 13.0f, 0.0f, 0.4363f, 0.0f, 0.0f));
        Head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 16).addBox(-5.5f, -19.0f, 15.0f, 1.0f, 3.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(53, 20).addBox(4.5f, -19.0f, 15.0f, 1.0f, 3.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(96, 29).addBox(-5.5f, -19.0f, 7.0f, 1.0f, 5.0f, 8.0f, new CubeDeformation(0.0f)).texOffs(64, 102).addBox(4.5f, -19.0f, 7.0f, 1.0f, 5.0f, 8.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 13.0f, 0.0f, 0.48f, 0.0f, 0.0f));
        Head.addOrReplaceChild("Mask", CubeListBuilder.create().texOffs(20, 36).addBox(-4.0f, -21.25f, -5.25f, 8.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(22, 52).addBox(-3.0f, -22.25f, -5.25f, 6.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(38, 0).addBox(-4.0f, -17.35f, -7.25f, 8.0f, 0.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(40, 2).addBox(-4.0f, -17.25f, -7.25f, 8.0f, 3.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(6, 14).addBox(4.1f, -17.25f, -7.25f, 0.0f, 3.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(0, 14).addBox(-4.1f, -17.25f, -7.25f, 0.0f, 3.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(6, 19).addBox(2.0f, -14.25f, -7.25f, 2.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(0, 19).addBox(-4.0f, -14.25f, -7.25f, 2.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(76, 43).addBox(-1.0f, -19.25f, -5.25f, 2.0f, 2.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(0, 36).addBox(-5.0f, -20.25f, -5.25f, 10.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(6, 4).addBox(-5.0f, -19.25f, -5.25f, 1.0f, 4.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(2, 25).addBox(-6.0f, -18.25f, -5.25f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(0, 25).addBox(5.0f, -18.25f, -5.25f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(6, 25).addBox(-2.0f, -19.25f, -5.25f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(4, 25).addBox(1.0f, -19.25f, -5.25f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(6, 0).addBox(4.0f, -19.25f, -5.25f, 1.0f, 4.0f, 0.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 13.0f, 0.0f));
        partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-8.0f, 0.0f, -4.0f, 16.0f, 8.0f, 8.0f, new CubeDeformation(0.0f)).texOffs(40, 8).addBox(-7.0f, 8.0f, -4.0f, 14.0f, 4.0f, 8.0f, new CubeDeformation(0.0f)).texOffs(0, 37).addBox(-6.0f, 12.0f, -4.0f, 12.0f, 4.0f, 8.0f, new CubeDeformation(0.0f)).texOffs(32, 32).addBox(-7.0f, 16.0f, -4.0f, 14.0f, 5.0f, 8.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, -21.0f, 0.0f)).addOrReplaceChild("Bones", CubeListBuilder.create().texOffs(22, 49).addBox(-7.9f, -12.1f, -4.5f, 6.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(40, 26).addBox(-7.9f, -9.1f, -4.5f, 6.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(54, 5).addBox(-7.9f, -6.1f, -4.5f, 6.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(56, 3).addBox(-6.9f, -5.1f, -4.5f, 5.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(56, 0).addBox(-6.9f, -3.1f, -4.5f, 5.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(59, 20).addBox(1.9f, -3.1f, -4.5f, 5.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(54, 30).addBox(1.9f, -5.1f, -4.5f, 5.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(53, 28).addBox(1.9f, -6.1f, -4.5f, 6.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(40, 5).addBox(1.9f, -9.1f, -4.5f, 6.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(40, 29).addBox(1.9f, -12.1f, -4.5f, 6.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(19, 73).addBox(-2.0f, -13.0f, 3.5f, 1.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(84, 102).addBox(-1.0f, -13.0f, 3.5f, 2.0f, 20.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(76, 40).addBox(1.0f, -13.0f, 3.5f, 1.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(69, 23).addBox(1.0f, -10.0f, 3.5f, 1.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(72, 54).addBox(-2.0f, -10.0f, 3.5f, 1.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(36, 49).addBox(1.0f, -7.0f, 3.5f, 1.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(66, 54).addBox(1.0f, -4.0f, 3.5f, 2.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(44, 68).addBox(-3.0f, -4.0f, 3.5f, 2.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(26, 69).addBox(-2.0f, -7.0f, 3.5f, 1.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(22, 53).addBox(-3.0f, -1.0f, 3.5f, 2.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 53).addBox(1.0f, -1.0f, 3.5f, 2.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(44, 65).addBox(-3.0f, 2.0f, 3.5f, 2.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(63, 23).addBox(1.0f, 2.0f, 3.5f, 2.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(88, 15).addBox(2.0f, -13.0f, 4.0f, 2.0f, 8.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 0).addBox(-4.0f, -12.0f, 4.0f, 2.0f, 7.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 13.0f, 0.0f));
        PartDefinition Tail = partdefinition.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(84, 102).addBox(-1.0f, -45.0f, 3.5f, 2.0f, 15.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(112, 109).addBox(-2.0f, -45.0f, -0.5f, 4.0f, 15.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 29.0f, 37.0f, 0.9163f, 0.0f, 0.0f));
        Tail.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(112, 107).addBox(-2.0f, 5.0f, -0.5f, 4.0f, 17.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, -34.8107f, -1.9515f, 0.3927f, 0.0f, 0.0f));
        Tail.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(84, 102).addBox(-1.0f, 10.0f, 3.5f, 2.0f, 15.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, -37.8994f, -3.5604f, 0.3927f, 0.0f, 0.0f));
        partdefinition.addOrReplaceChild("Wings", CubeListBuilder.create().texOffs(0, 69).addBox(-8.0f, -13.0f, 5.5f, 2.0f, 15.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(30, 53).addBox(-4.0f, -12.0f, 5.5f, 1.0f, 9.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(62, 45).addBox(-6.0f, -13.0f, 5.5f, 2.0f, 12.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(14, 72).addBox(-4.0f, -13.0f, 5.0f, 2.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 23).addBox(-8.0f, -14.0f, 5.5f, 4.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(30, 18).addBox(-11.0f, -15.0f, 6.5f, 3.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(67, 6).addBox(-13.0f, -16.0f, 6.5f, 2.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(26, 96).addBox(-15.0f, -19.0f, 6.5f, 2.0f, 27.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(62, 26).addBox(-17.0f, -17.0f, 7.5f, 2.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(76, 62).addBox(-18.0f, -18.0f, 7.5f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(54, 51).addBox(-20.0f, -19.0f, 8.5f, 2.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 49).addBox(-22.0f, -21.0f, 8.5f, 2.0f, 3.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(52, 93).addBox(-23.0f, -18.0f, 8.5f, 1.0f, 30.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(8, 69).addBox(-22.0f, 12.0f, 8.5f, 2.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(68, 3).addBox(-20.0f, 14.0f, 8.5f, 2.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(68, 0).addBox(-18.0f, 16.0f, 8.5f, 2.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(60, 93).addBox(-22.0f, -18.0f, 8.5f, 2.0f, 30.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(42, 96).addBox(-20.0f, -18.0f, 8.5f, 2.0f, 29.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(50, 96).addBox(-18.0f, -17.0f, 7.5f, 1.0f, 26.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(0, 104).addBox(-17.0f, -16.0f, 7.5f, 2.0f, 23.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(76, 60).addBox(-13.0f, 8.0f, 6.5f, 2.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(8, 104).addBox(-13.0f, -15.0f, 6.5f, 2.0f, 21.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(102, 42).addBox(-11.0f, -14.0f, 6.5f, 3.0f, 18.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(72, 45).addBox(3.0f, -12.0f, 5.5f, 1.0f, 9.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(73, 2).addBox(2.0f, -13.0f, 5.0f, 2.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(30, 16).addBox(4.0f, -14.0f, 5.5f, 4.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(51, 65).addBox(4.0f, -13.0f, 5.5f, 2.0f, 12.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(4, 69).addBox(6.0f, -13.0f, 5.5f, 2.0f, 15.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(16, 104).addBox(8.0f, -14.0f, 6.5f, 3.0f, 18.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(12, 104).addBox(11.0f, -15.0f, 6.5f, 2.0f, 21.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(32, 37).addBox(8.0f, -15.0f, 6.5f, 3.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(13, 74).addBox(11.0f, -16.0f, 6.5f, 2.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(36, 96).addBox(13.0f, -19.0f, 6.5f, 2.0f, 27.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(69, 77).addBox(11.0f, 8.0f, 6.5f, 2.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(4, 104).addBox(15.0f, -16.0f, 7.5f, 2.0f, 23.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(46, 96).addBox(18.0f, -18.0f, 8.5f, 2.0f, 29.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(82, 102).addBox(17.0f, -17.0f, 7.5f, 1.0f, 26.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(32, 96).addBox(20.0f, -18.0f, 8.5f, 2.0f, 30.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(56, 93).addBox(22.0f, -18.0f, 8.5f, 1.0f, 30.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(8, 72).addBox(20.0f, 12.0f, 8.5f, 2.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(20, 69).addBox(18.0f, 14.0f, 8.5f, 2.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(14, 69).addBox(16.0f, 16.0f, 8.5f, 2.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(50, 20).addBox(20.0f, -21.0f, 8.5f, 2.0f, 3.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(74, 4).addBox(18.0f, -19.0f, 8.5f, 2.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(74, 0).addBox(15.0f, -17.0f, 7.5f, 2.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(65, 77).addBox(17.0f, -18.0f, 7.5f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, -8.0f, 0.0f));
        partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(0, 90).addBox(-7.0f, -4.0f, -3.0f, 7.0f, 8.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(45, 78).addBox(-7.0f, 12.0f, -3.0f, 7.0f, 9.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(94, 15).addBox(-6.0f, 4.0f, -3.0f, 6.0f, 8.0f, 6.0f, new CubeDeformation(0.0f)), PartPose.offset(-8.0f, -17.0f, 0.0f));
        partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(76, 0).addBox(0.0f, 12.0f, -3.0f, 7.0f, 9.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(65, 88).addBox(0.0f, -4.0f, -3.0f, 7.0f, 8.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(91, 91).addBox(0.0f, 4.0f, -3.0f, 6.0f, 8.0f, 6.0f, new CubeDeformation(0.0f)), PartPose.offset(8.0f, -17.0f, 0.0f));
        PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(22, 85).addBox(-3.0f, 0.0f, -4.0f, 7.0f, 3.0f, 8.0f, new CubeDeformation(0.0f)).texOffs(75, 75).addBox(-3.0f, 18.0083f, -5.2582f, 7.0f, 5.0f, 8.0f, new CubeDeformation(0.0f)), PartPose.offset(-4.0f, 0.0f, 0.0f));
        LeftLeg.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(23, 65).addBox(-5.0f, -4.0f, -4.0f, 7.0f, 12.0f, 7.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(2.0f, 8.8603f, -2.757f, 1.1781f, 0.0f, 0.0f));
        LeftLeg.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(76, 40).addBox(-5.0f, -3.0f, -2.0f, 7.0f, 14.0f, 6.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(2.0f, 11.3149f, 3.2558f, -0.3927f, 0.0f, 0.0f));
        LeftLeg.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(32, 45).addBox(-5.0f, -4.0f, -4.0f, 7.0f, 12.0f, 8.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(2.0f, 5.1648f, -1.2263f, -0.3927f, 0.0f, 0.0f));
        PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(83, 60).addBox(-4.0f, 0.0f, -4.0f, 7.0f, 3.0f, 8.0f, new CubeDeformation(0.0f)).texOffs(0, 76).addBox(-4.0f, 18.0083f, -5.2582f, 7.0f, 5.0f, 8.0f, new CubeDeformation(0.0f)), PartPose.offset(4.0f, 0.0f, 0.0f));
        RightLeg.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(55, 58).addBox(-2.0f, -4.0f, -4.0f, 7.0f, 12.0f, 7.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-2.0f, 8.8603f, -2.757f, 1.1781f, 0.0f, 0.0f));
        RightLeg.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(68, 20).addBox(-2.0f, -3.0f, -2.0f, 7.0f, 14.0f, 6.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-2.0f, 11.3149f, 3.2558f, -0.3927f, 0.0f, 0.0f));
        RightLeg.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 49).addBox(-2.0f, -4.0f, -4.0f, 7.0f, 12.0f, 8.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-2.0f, 5.1648f, -1.2263f, -0.3927f, 0.0f, 0.0f));
        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    public void renderToBuffer(@NotNull PoseStack poseStack, @NotNull VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        this.Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.Tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.Wings.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setupAnim(@NotNull T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.RightArm.xRot = Mth.cos((limbSwing * 0.6662f) + 3.1415927f) * limbSwingAmount;
        this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0f) * -1.0f * limbSwingAmount;
        this.Head.yRot = netHeadYaw / 57.295776f;
        this.Head.xRot = headPitch / 57.295776f;
        this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662f) * limbSwingAmount;
        this.RightLeg.xRot = Mth.cos(limbSwing * 1.0f) * 1.0f * limbSwingAmount;
    }
}
