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

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/model/ModelDark_Latex_Centaur_Model.class */
public class ModelDark_Latex_Centaur_Model<T extends Entity> extends EntityModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(LatexMod.MODID, "model_dark_latex_centaur_model"), "main");
    public final ModelPart Head;
    public final ModelPart Body;
    public final ModelPart Tail;
    public final ModelPart LeftArm;
    public final ModelPart RightArm;
    public final ModelPart RightLeg1;
    public final ModelPart RightLeg2;
    public final ModelPart LeftLeg1;
    public final ModelPart LeftLeg2;

    public ModelDark_Latex_Centaur_Model(ModelPart root) {
        this.Head = root.getChild("Head");
        this.Body = root.getChild("Body");
        this.Tail = root.getChild("Tail");
        this.LeftArm = root.getChild("LeftArm");
        this.RightArm = root.getChild("RightArm");
        this.RightLeg1 = root.getChild("RightLeg1");
        this.RightLeg2 = root.getChild("RightLeg2");
        this.LeftLeg1 = root.getChild("LeftLeg1");
        this.LeftLeg2 = root.getChild("LeftLeg2");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offset(0.0f, -5.0f, -7.0f));
        Head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(36, 39).addBox(-3.0154f, -15.489f, -1.4718f, 6.0f, 4.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 82).addBox(-2.0154f, -11.489f, -1.4718f, 4.0f, 9.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(38, 0).addBox(-4.0154f, -16.489f, -0.4718f, 8.0f, 8.0f, 8.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0154f, 8.489f, 3.2218f, -3.1416f, 0.0f, 3.1416f));
        Head.addOrReplaceChild("Mask", CubeListBuilder.create(), PartPose.offset(0.0f, 0.0f, 13.75f)).addOrReplaceChild("Mask_r1", CubeListBuilder.create().texOffs(38, 16).addBox(-2.5154f, -11.364f, 7.7782f, 5.0f, 2.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(0, 18).addBox(-3.5154f, -14.364f, 7.7782f, 7.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(0, 19).addBox(-2.5154f, -15.364f, 7.7782f, 5.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(0, 0).addBox(-1.0154f, -16.364f, 7.7782f, 2.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(12, 3).addBox(-1.5154f, -13.364f, 7.7782f, 3.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(12, 0).addBox(-0.5154f, -12.364f, 7.7782f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(2, 1).addBox(2.4846f, -13.364f, 7.7782f, 1.0f, 3.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(0, 1).addBox(-3.5154f, -13.364f, 7.7782f, 1.0f, 3.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(16, 4).addBox(1.4846f, -9.364f, 7.7782f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(16, 1).addBox(-2.5154f, -9.364f, 7.7782f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(16, 0).mirror().addBox(3.2346f, -12.364f, 7.6532f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)).mirror(false).texOffs(16, 0).addBox(-4.2654f, -12.364f, 7.6532f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0154f, 8.489f, -10.5282f, -3.1416f, 0.0f, 3.1416f));
        Head.addOrReplaceChild("Ears", CubeListBuilder.create(), PartPose.offsetAndRotation(0.25f, -6.0f, 6.75f, -1.9635f, 0.0f, 0.0f)).addOrReplaceChild("Ears_r1", CubeListBuilder.create().texOffs(46, 55).addBox(3.7346f, -5.7148f, -18.7363f, 1.0f, 4.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(38, 0).addBox(3.7346f, -1.7148f, -18.7363f, 1.0f, 4.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(12, 0).addBox(3.7346f, 2.2852f, -18.7363f, 1.0f, 1.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(14, 16).addBox(-4.7654f, 2.2852f, -18.7363f, 1.0f, 1.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(62, 0).addBox(-4.7654f, -1.7148f, -18.7363f, 1.0f, 4.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(72, 85).addBox(-4.7654f, -5.7148f, -18.7363f, 1.0f, 4.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-0.2346f, -8.7523f, 12.0574f, -0.7854f, 0.0f, 3.1416f));
        partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offset(0.0f, -5.0f, -7.0f)).addOrReplaceChild("Body_r1", CubeListBuilder.create().texOffs(36, 26).addBox(-3.0154f, 0.511f, -13.2218f, 6.0f, 1.0f, 18.0f, new CubeDeformation(0.0f)).texOffs(0, 26).addBox(-4.0154f, 1.511f, -14.2218f, 8.0f, 1.0f, 20.0f, new CubeDeformation(0.0f)).texOffs(0, 0).addBox(-4.5154f, 2.511f, -14.2218f, 9.0f, 6.0f, 20.0f, new CubeDeformation(0.0f)).texOffs(58, 16).addBox(-3.5154f, -3.489f, 1.5282f, 7.0f, 6.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(0, 47).addBox(-5.0154f, -8.489f, 1.0282f, 10.0f, 5.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0154f, 8.489f, 3.2218f, -3.1416f, 0.0f, 3.1416f));
        partdefinition.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0f, 6.0f, 9.625f, 0.3927f, 0.0f, 0.0f)).addOrReplaceChild("Tail_r1", CubeListBuilder.create().texOffs(38, 45).addBox(-2.0154f, -1.3296f, -25.276f, 4.0f, 3.0f, 18.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0154f, -4.7702f, -4.9548f, -2.3562f, 0.0f, 3.1416f));
        partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(5.0f, -2.5f, -7.25f, 0.0f, 0.0f, 0.1745f)).addOrReplaceChild("LeftArm_r1", CubeListBuilder.create().texOffs(66, 37).addBox(-9.1108f, 6.8967f, 8.5282f, 3.0f, 2.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(45, 47).addBox(-9.1108f, -8.1033f, 8.5282f, 1.0f, 1.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(0, 26).addBox(-9.1108f, -7.1033f, 8.5282f, 4.0f, 14.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-3.8709f, 6.7636f, 10.4718f, 3.1416f, 0.0f, 2.7926f));
        partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.0f, -2.5f, -7.25f, 0.0f, 0.0f, -0.1745f)).addOrReplaceChild("RightArm_r1", CubeListBuilder.create().texOffs(64, 57).addBox(6.0805f, 6.8914f, 8.5282f, 3.0f, 2.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(25, 47).addBox(8.0805f, -8.1086f, 8.5282f, 1.0f, 1.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(0, 0).addBox(5.0805f, -7.1086f, 8.5282f, 4.0f, 14.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(3.8994f, 6.7688f, 10.4718f, -3.1416f, 0.0f, -2.7926f));
        PartDefinition RightLeg1 = partdefinition.addOrReplaceChild("RightLeg1", CubeListBuilder.create(), PartPose.offset(-2.5f, 9.0f, -7.0f));
        RightLeg1.addOrReplaceChild("RightLeg1_r1", CubeListBuilder.create().texOffs(77, 61).addBox(0.2346f, 17.4727f, 2.7854f, 5.0f, 3.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(82, 85).addBox(0.6096f, 3.386f, 0.0282f, 5.0f, 5.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(40, 66).addBox(0.2346f, 3.386f, 1.0282f, 5.0f, 6.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(2.5154f, -5.511f, 3.2218f, -3.1416f, 0.0f, 3.1416f));
        PartDefinition bone = RightLeg1.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(5.5f, 0.875f, 13.75f, -0.7854f, 0.0f, 0.0f));
        bone.addOrReplaceChild("cube_r1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0f, 1.9888f, -2.8143f, 1.4835f, 0.0f, 0.0f)).addOrReplaceChild("cube_r1_r1", CubeListBuilder.create().texOffs(70, 0).addBox(0.2346f, 11.5843f, 0.7598f, 5.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-2.9846f, -4.5297f, 3.6285f, -1.7454f, 0.0f, -3.1416f));
        PartDefinition bone2 = bone.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0f, -2.2929f, 1.5355f, 1.1781f, 0.0f, 0.0f));
        bone2.addOrReplaceChild("bone2_r1", CubeListBuilder.create().texOffs(84, 44).addBox(0.7346f, 15.659f, 1.2059f, 4.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-2.9846f, -7.7912f, -3.5217f, -2.3562f, 0.0f, -3.1416f));
        bone2.addOrReplaceChild("cube_r2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0f, 3.5598f, 1.3004f, -1.1781f, 0.0f, 0.0f)).addOrReplaceChild("cube_r2_r1", CubeListBuilder.create().texOffs(81, 19).addBox(0.7346f, -3.1217f, 14.9285f, 4.0f, 8.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-2.9846f, 0.1113f, -12.3323f, 1.5708f, 0.0f, 3.1416f));
        PartDefinition RightLeg2 = partdefinition.addOrReplaceChild("RightLeg2", CubeListBuilder.create(), PartPose.offset(-3.5f, 9.0f, 8.0f));
        RightLeg2.addOrReplaceChild("RightLeg2_r1", CubeListBuilder.create().texOffs(48, 77).addBox(0.6096f, 17.4609f, -11.538f, 5.0f, 3.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(60, 85).addBox(0.6096f, 2.386f, -14.7368f, 5.0f, 6.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(20, 61).addBox(0.6096f, 2.386f, -13.7368f, 5.0f, 7.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(3.5154f, -5.511f, -11.7782f, -3.1416f, 0.0f, 3.1416f));
        PartDefinition bone3 = RightLeg2.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(6.5f, 0.875f, -15.25f, -0.7854f, 0.0f, 0.0f));
        bone3.addOrReplaceChild("cube_r3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0f, 1.9888f, -2.8143f, 1.4835f, 0.0f, 0.0f)).addOrReplaceChild("cube_r3_r1", CubeListBuilder.create().texOffs(64, 45).addBox(0.6096f, 1.3279f, -9.9083f, 5.0f, 7.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-2.9846f, 4.469f, 14.3534f, -1.7454f, 0.0f, -3.1416f));
        PartDefinition bone4 = bone3.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0f, -2.2929f, 1.5355f, 1.1781f, 0.0f, 0.0f));
        bone4.addOrReplaceChild("bone4_r1", CubeListBuilder.create().texOffs(12, 81).addBox(1.1096f, 9.1667f, -12.0227f, 4.0f, 8.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-2.9846f, -2.4336f, 9.4126f, -2.3562f, 0.0f, -3.1416f));
        bone4.addOrReplaceChild("cube_r4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5f, 2.3352f, 2.6368f, -1.1781f, 0.0f, 0.0f)).addOrReplaceChild("cube_r4_r1", CubeListBuilder.create().texOffs(0, 69).addBox(1.1096f, 5.6155f, 3.8681f, 4.0f, 9.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-3.4846f, -8.0849f, -1.8129f, 1.5708f, 0.0f, 3.1416f));
        PartDefinition LeftLeg1 = partdefinition.addOrReplaceChild("LeftLeg1", CubeListBuilder.create(), PartPose.offset(2.5f, 9.0f, -7.0f));
        LeftLeg1.addOrReplaceChild("LeftLeg1_r1", CubeListBuilder.create().texOffs(76, 11).addBox(-5.3904f, 17.4727f, 2.7854f, 5.0f, 3.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(84, 55).addBox(-5.6404f, 3.386f, 0.0282f, 5.0f, 5.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(66, 26).addBox(-5.3904f, 3.386f, 1.0282f, 5.0f, 6.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-2.4846f, -5.511f, 3.2218f, -3.1416f, 0.0f, 3.1416f));
        PartDefinition bone5 = LeftLeg1.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.5f, 0.875f, 13.75f, -0.7854f, 0.0f, 0.0f));
        bone5.addOrReplaceChild("cube_r5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0f, 1.9888f, -2.8143f, 1.4835f, 0.0f, 0.0f)).addOrReplaceChild("cube_r5_r1", CubeListBuilder.create().texOffs(60, 66).addBox(-5.3904f, 11.5843f, 0.7598f, 5.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(3.0154f, -4.5297f, 3.6285f, -1.7454f, 0.0f, -3.1416f));
        PartDefinition bone6 = bone5.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0f, -2.2929f, 1.5355f, 1.1781f, 0.0f, 0.0f));
        bone6.addOrReplaceChild("bone6_r1", CubeListBuilder.create().texOffs(82, 33).addBox(-4.8904f, 15.659f, 1.2059f, 4.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(3.0154f, -7.7912f, -3.5217f, -2.3562f, 0.0f, -3.1416f));
        bone6.addOrReplaceChild("cube_r6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0f, 3.5598f, 1.3004f, -1.1781f, 0.0f, 0.0f)).addOrReplaceChild("cube_r6_r1", CubeListBuilder.create().texOffs(32, 77).addBox(-4.8904f, -3.1217f, 14.9285f, 4.0f, 8.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(3.0154f, 0.1113f, -12.3323f, 1.5708f, 0.0f, 3.1416f));
        PartDefinition LeftLeg2 = partdefinition.addOrReplaceChild("LeftLeg2", CubeListBuilder.create(), PartPose.offset(3.5f, 9.0f, 8.0f));
        LeftLeg2.addOrReplaceChild("LeftLeg2_r1", CubeListBuilder.create().texOffs(16, 73).addBox(-5.3904f, 17.4609f, -11.538f, 5.0f, 3.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(48, 85).addBox(-5.3904f, 2.386f, -14.7368f, 5.0f, 6.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(30, 47).addBox(-5.3904f, 2.386f, -13.7368f, 5.0f, 7.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-3.4846f, -5.511f, -11.7782f, -3.1416f, 0.0f, 3.1416f));
        PartDefinition bone9 = LeftLeg2.addOrReplaceChild("bone9", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.5f, 0.875f, -15.25f, -0.7854f, 0.0f, 0.0f));
        bone9.addOrReplaceChild("cube_r7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0f, 1.9888f, -2.8143f, 1.4835f, 0.0f, 0.0f)).addOrReplaceChild("cube_r7_r1", CubeListBuilder.create().texOffs(0, 57).addBox(-5.3904f, 1.3279f, -9.9083f, 5.0f, 7.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(3.0154f, 4.469f, 14.3534f, -1.7454f, 0.0f, -3.1416f));
        PartDefinition bone10 = bone9.addOrReplaceChild("bone10", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0f, -2.2929f, 1.5355f, 1.1781f, 0.0f, 0.0f));
        bone10.addOrReplaceChild("bone10_r1", CubeListBuilder.create().texOffs(74, 73).addBox(-4.8904f, 9.1667f, -12.0227f, 4.0f, 8.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(3.0154f, -2.4336f, 9.4126f, -2.3562f, 0.0f, -3.1416f));
        bone10.addOrReplaceChild("cube_r8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5f, 2.3352f, 2.6368f, -1.1781f, 0.0f, 0.0f)).addOrReplaceChild("cube_r8_r1", CubeListBuilder.create().texOffs(36, 26).addBox(-4.8904f, 5.6155f, 3.8681f, 4.0f, 9.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(2.5154f, -8.0849f, -1.8129f, 1.5708f, 0.0f, 3.1416f));
        return LayerDefinition.create(meshdefinition, 112, 112);
    }

    public void renderToBuffer(@NotNull PoseStack poseStack, @NotNull VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        this.Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.Tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.RightLeg1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.RightLeg2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.LeftLeg1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.LeftLeg2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setupAnim(@NotNull T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.RightArm.xRot = Mth.cos((limbSwing * 0.6662f) + 3.1415927f) * limbSwingAmount;
        this.Head.yRot = netHeadYaw / 57.295776f;
        this.Head.xRot = headPitch / 57.295776f;
        this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662f) * limbSwingAmount;
        this.RightLeg2.xRot = Mth.cos(limbSwing * 1.0f) * 1.0f * limbSwingAmount;
        this.RightLeg1.xRot = Mth.cos(limbSwing * 1.0f) * 1.0f * limbSwingAmount;
        this.LeftLeg2.xRot = Mth.cos(limbSwing * 1.0f) * -1.0f * limbSwingAmount;
        this.LeftLeg1.xRot = Mth.cos(limbSwing * 1.0f) * -1.0f * limbSwingAmount;
    }
}
