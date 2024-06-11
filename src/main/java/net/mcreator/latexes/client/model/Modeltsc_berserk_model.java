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

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/model/Modeltsc_berserk_model.class */
public class Modeltsc_berserk_model<T extends Entity> extends EntityModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(LatexMod.MODID, "modeltsc_berserk_model"), "main");
    public final ModelPart Head;
    public final ModelPart Body;
    public final ModelPart LeftArm;
    public final ModelPart LeftArm2;
    public final ModelPart RightArm;
    public final ModelPart RightArm2;
    public final ModelPart LeftLeg;
    public final ModelPart RightLeg;
    public final ModelPart LeftArm3;
    public final ModelPart RightArm3;

    public Modeltsc_berserk_model(ModelPart root) {
        this.Head = root.getChild("Head");
        this.Body = root.getChild("Body");
        this.LeftArm = root.getChild("LeftArm");
        this.LeftArm2 = root.getChild("LeftArm2");
        this.RightArm = root.getChild("RightArm");
        this.RightArm2 = root.getChild("RightArm2");
        this.LeftLeg = root.getChild("LeftLeg");
        this.RightLeg = root.getChild("RightLeg");
        this.LeftArm3 = root.getChild("LeftArm3");
        this.RightArm3 = root.getChild("RightArm3");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(-3.5f, -7.0f, -3.5f, 7.0f, 5.0f, 7.0f, new CubeDeformation(0.0f)).texOffs(39, 16).addBox(-0.5f, -7.25f, -3.75f, 1.0f, 1.0f, 7.0f, new CubeDeformation(0.0f)).texOffs(13, 25).addBox(-3.5f, -2.0f, -2.5f, 7.0f, 2.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(18, 45).addBox(-2.5f, -1.0f, -3.5f, 5.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(48, 16).addBox(-3.5f, -2.0f, -3.5f, 1.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(74, 32).addBox(-3.75f, -2.625f, -3.625f, 1.0f, 2.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(74, 24).addBox(2.75f, -2.625f, -3.625f, 1.0f, 2.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(64, 28).addBox(-3.875f, -2.125f, -4.0f, 1.0f, 1.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(64, 19).addBox(2.875f, -2.125f, -4.0f, 1.0f, 1.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(62, 35).addBox(2.875f, -0.875f, -4.0f, 1.0f, 1.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(59, 32).addBox(-3.875f, -0.875f, -4.0f, 1.0f, 1.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(78, 13).addBox(2.75f, -2.625f, 0.375f, 1.0f, 1.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(15, 78).addBox(-3.75f, -2.625f, 0.375f, 1.0f, 1.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(47, 0).addBox(2.5f, -2.0f, -3.5f, 1.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, -1.75f, -3.125f));
        Head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(23, 3).addBox(-0.5f, -0.5f, 0.0f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-2.125f, -0.875f, -3.375f, 0.0f, 0.0f, 0.7854f));
        Head.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(0, 23).addBox(-0.5f, -0.5f, 0.0f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-2.7071f, -2.2071f, -3.375f, 0.0f, 0.0f, 0.7854f));
        Head.addOrReplaceChild("Head_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5f, -0.5f, 0.0f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(2.6997f, -2.2071f, -3.375f, 0.0f, 0.0f, 0.7854f));
        Head.addOrReplaceChild("Head_r4", CubeListBuilder.create().texOffs(4, 0).addBox(-0.5f, -0.5f, 0.0f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(2.1176f, -0.875f, -3.375f, 0.0f, 0.0f, 0.7854f));
        Head.addOrReplaceChild("Head_r5", CubeListBuilder.create().texOffs(0, 1).addBox(-0.5f, -0.5f, 0.0f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(1.4105f, -1.8321f, -3.375f, 0.0f, 0.0f, 0.7854f));
        Head.addOrReplaceChild("Head_r6", CubeListBuilder.create().texOffs(21, 3).addBox(-0.5f, -0.5f, 0.0f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-0.0037f, -2.0821f, -3.375f, 0.0f, 0.0f, 0.7854f));
        Head.addOrReplaceChild("Head_r7", CubeListBuilder.create().texOffs(4, 1).addBox(-0.5f, -0.5f, 0.0f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.7034f, -0.75f, -3.375f, 0.0f, 0.0f, 0.7854f));
        Head.addOrReplaceChild("Head_r8", CubeListBuilder.create().texOffs(23, 12).addBox(-0.5f, -0.5f, 0.0f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-1.4179f, -1.8321f, -3.375f, 0.0f, 0.0f, 0.7854f));
        Head.addOrReplaceChild("Head_r9", CubeListBuilder.create().texOffs(0, 24).addBox(-0.5f, -0.5f, 0.0f, 1.0f, 1.0f, 0.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-0.7108f, -0.75f, -3.375f, 0.0f, 0.0f, 0.7854f));
        Head.addOrReplaceChild("Head_r10", CubeListBuilder.create().texOffs(48, 26).addBox(-0.5f, -0.5f, -0.5f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-3.2217f, -1.625f, -4.2706f, 0.0f, -1.9635f, 0.0f));
        Head.addOrReplaceChild("Head_r11", CubeListBuilder.create().texOffs(27, 49).addBox(-0.5f, -0.5f, -0.5f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(3.2217f, -1.625f, -4.2706f, 0.0f, 1.9635f, 0.0f));
        Head.addOrReplaceChild("Head_r12", CubeListBuilder.create().texOffs(33, 49).addBox(-0.5f, -0.5f, -0.5f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(1.9152f, -0.375f, -4.4948f, 0.0f, 1.9635f, 0.0f));
        Head.addOrReplaceChild("Head_r13", CubeListBuilder.create().texOffs(49, 33).addBox(-0.5f, -0.5f, -0.5f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-1.9152f, -0.375f, -4.4948f, 0.0f, -1.9635f, 0.0f));
        Head.addOrReplaceChild("Head_r14", CubeListBuilder.create().texOffs(56, 56).addBox(-0.5f, -0.5f, -1.0f, 1.0f, 1.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-2.7598f, -0.375f, -3.9207f, 0.0f, -1.1781f, 0.0f));
        Head.addOrReplaceChild("Head_r15", CubeListBuilder.create().texOffs(14, 57).addBox(-0.5f, -0.5f, -1.0f, 1.0f, 1.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(2.7598f, -0.375f, -3.9207f, 0.0f, 1.1781f, 0.0f));
        Head.addOrReplaceChild("Head_r16", CubeListBuilder.create().texOffs(34, 41).addBox(-3.5f, -3.0f, 0.0f, 7.0f, 4.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, -2.2119f, 1.172f, -0.9599f, 0.0f, 0.0f));
        Head.addOrReplaceChild("Head_r17", CubeListBuilder.create().texOffs(26, 9).addBox(-3.5f, -2.5f, 1.5f, 7.0f, 4.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, -5.2643f, 1.1575f, -0.3927f, 0.0f, 0.0f));
        Head.addOrReplaceChild("Head_r18", CubeListBuilder.create().texOffs(32, 34).addBox(-3.5f, -2.5f, 1.5f, 7.0f, 5.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, -5.2643f, -5.8425f, -0.3927f, 0.0f, 0.0f));
        Head.addOrReplaceChild("Head_r19", CubeListBuilder.create().texOffs(31, 72).addBox(-0.5f, -0.5f, -1.5f, 1.0f, 1.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, -3.8251f, -4.6275f, 1.1781f, 0.0f, 0.0f));
        Head.addOrReplaceChild("Ears", CubeListBuilder.create().texOffs(68, 40).addBox(-0.875f, -1.5f, -4.0f, 1.0f, 2.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(66, 67).addBox(6.875f, -1.5f, -4.0f, 1.0f, 2.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(56, 17).addBox(6.875f, -1.5f, 1.0f, 1.0f, 1.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(56, 25).addBox(-0.875f, -1.5f, 1.0f, 1.0f, 1.0f, 6.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-3.5f, -5.625f, 1.75f, 0.2618f, 0.0f, 0.0f));
        Head.addOrReplaceChild("Ears2", CubeListBuilder.create().texOffs(3, 67).addBox(-0.625f, -1.5f, -4.0f, 1.0f, 2.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(66, 60).addBox(6.625f, -1.5f, -4.0f, 1.0f, 2.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(50, 49).addBox(6.625f, -1.5f, 1.0f, 1.0f, 1.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(47, 42).addBox(-0.625f, -1.5f, 1.0f, 1.0f, 1.0f, 6.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-3.5f, -3.875f, 4.25f, 0.2618f, 0.0f, 0.0f));
        PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(21, 0).addBox(-4.0f, 8.0f, -2.0f, 8.0f, 3.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(26, 16).addBox(-3.5f, 4.0f, -1.375f, 7.0f, 4.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 0.0f, 0.0f));
        Body.addOrReplaceChild("Body_r1", CubeListBuilder.create().texOffs(33, 51).addBox(-2.125f, -0.5f, -1.875f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(27, 51).addBox(0.125f, -0.5f, -1.875f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 1.125f, -2.25f, 0.0f, -0.3927f, 1.5708f));
        Body.addOrReplaceChild("Body_r2", CubeListBuilder.create().texOffs(54, 7).addBox(0.625f, -1.0f, -1.875f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(43, 57).addBox(-1.625f, -1.0f, -1.875f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(31, 78).addBox(-1.5f, -2.0f, -1.75f, 3.0f, 3.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 1.125f, -2.25f, 0.3927f, 0.0f, 0.0f));
        Body.addOrReplaceChild("Body_r3", CubeListBuilder.create().texOffs(28, 34).addBox(-1.0f, -13.0f, -2.0f, 2.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(74, 20).addBox(-2.0f, -16.0f, -2.0f, 4.0f, 3.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 23.5474f, -6.2752f, -0.3927f, 0.0f, 0.0f));
        Body.addOrReplaceChild("Body_r4", CubeListBuilder.create().texOffs(0, 12).addBox(2.0f, -2.5284f, -2.3321f, 1.0f, 3.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(20, 12).addBox(-3.0f, -2.5284f, -2.3321f, 1.0f, 3.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 45).addBox(-4.0f, -3.0284f, -2.0821f, 8.0f, 4.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(22, 31).addBox(-4.125f, 1.5966f, -2.3321f, 2.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(43, 9).addBox(2.125f, 1.5966f, -2.3321f, 2.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(27, 49).addBox(2.625f, -3.6534f, -1.8321f, 1.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(8, 56).addBox(-3.625f, -3.6534f, -1.8321f, 1.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(69, 0).addBox(3.625f, -4.2216f, -2.1679f, 1.0f, 1.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(72, 47).addBox(3.625f, -5.2216f, -1.1679f, 1.0f, 1.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(73, 67).addBox(-4.625f, -5.2216f, -1.1679f, 1.0f, 1.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(71, 14).addBox(-4.625f, -4.2216f, -2.1679f, 1.0f, 1.0f, 5.0f, new CubeDeformation(0.0f)).texOffs(0, 12).addBox(-4.0f, -3.3466f, -1.4179f, 8.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(64, 52).addBox(-2.5f, -4.3466f, -0.9179f, 5.0f, 1.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 1.7081f, -1.5933f, 0.2618f, 0.0f, 0.0f));
        Body.addOrReplaceChild("Body_r5", CubeListBuilder.create().texOffs(59, 0).addBox(-2.5f, -1.0f, -0.5f, 5.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-0.125f, -2.3813f, 0.1016f, -0.3491f, 0.0f, 0.0f));
        PartDefinition Tail = Body.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(0, 23).addBox(-1.0f, -1.0474f, 8.4222f, 2.0f, 2.0f, 9.0f, new CubeDeformation(0.0f)).texOffs(28, 25).addBox(-1.0f, -1.0474f, -0.0778f, 2.0f, 2.0f, 7.0f, new CubeDeformation(0.0f)).texOffs(14, 13).addBox(-0.5f, -0.8937f, 7.9508f, 1.0f, 2.0f, 10.0f, new CubeDeformation(0.0f)).texOffs(25, 41).addBox(-0.5f, 1.1063f, 7.9508f, 1.0f, 1.0f, 7.0f, new CubeDeformation(0.0f)).texOffs(38, 0).addBox(-0.5f, -0.8937f, 0.4508f, 1.0f, 2.0f, 7.0f, new CubeDeformation(0.0f)).texOffs(39, 24).addBox(-0.5f, 1.1063f, 0.4508f, 1.0f, 1.0f, 7.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 7.9632f, 1.5971f, -0.3927f, 0.0f, 0.0f));
        Tail.addOrReplaceChild("Tail_r1", CubeListBuilder.create().texOffs(10, 75).addBox(-0.5f, -0.5f, -1.5f, 1.0f, 1.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 1.1235f, 16.1893f, 0.3491f, 0.0f, 0.0f));
        Tail.addOrReplaceChild("Tail_r2", CubeListBuilder.create().texOffs(58, 16).addBox(-0.6971f, 0.8948f, -0.3029f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(58, 18).addBox(-0.6971f, -0.8552f, -0.3029f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 0.1063f, 7.4508f, 0.0f, 0.7854f, 0.0f));
        PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(64, 10).addBox(-2.653f, -0.7563f, -0.6637f, 3.0f, 6.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(59, 3).addBox(-3.653f, 4.2437f, -2.1637f, 3.0f, 3.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(58, 10).addBox(-3.7804f, 5.7699f, -1.5655f, 3.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(48, 16).addBox(-3.2912f, -1.5734f, -1.2389f, 3.0f, 3.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-4.0f, 1.0f, -3.0f, 0.1309f, 0.0f, 0.3054f));
        LeftArm.addOrReplaceChild("RightBlade_r1", CubeListBuilder.create().texOffs(0, 23).addBox(-0.5f, -2.5f, -1.0f, 1.0f, 4.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-1.7636f, 13.2461f, -10.2117f, -1.5272f, 0.0f, 0.0f));
        LeftArm.addOrReplaceChild("LeftBlade_r1", CubeListBuilder.create().texOffs(21, 0).addBox(-13.1106f, -0.8591f, -0.118f, 1.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(10.847f, 19.3667f, -8.1568f, 0.7854f, 0.0f, 0.0f));
        LeftArm.addOrReplaceChild("RightBlade_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-0.06f, 9.5f, -4.0f, 1.0f, 5.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-2.2036f, 11.5238f, 2.9344f, -1.0472f, 0.0f, 0.0f));
        LeftArm.addOrReplaceChild("LeftBlade_r2", CubeListBuilder.create().texOffs(31, 25).addBox(-13.1106f, -0.8591f, -0.118f, 1.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(10.847f, 17.5912f, -8.1312f, -1.1781f, 0.0f, 0.0f));
        LeftArm.addOrReplaceChild("LeftBlade_r3", CubeListBuilder.create().texOffs(27, 72).addBox(-13.1106f, -0.8591f, -0.118f, 1.0f, 13.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(36, 23).addBox(-13.1106f, 8.1409f, -1.118f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(28, 36).addBox(-13.1106f, 1.1409f, -1.118f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(58, 65).addBox(-13.1106f, 0.1409f, -4.118f, 1.0f, 9.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(10.847f, 8.8687f, 0.9613f, -0.7854f, 0.0f, 0.0f));
        LeftArm.addOrReplaceChild("LeftArm_r1", CubeListBuilder.create().texOffs(66, 28).addBox(-1.03f, -2.5f, -5.0f, 2.0f, 4.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-1.653f, 9.7437f, -0.1637f, -0.7854f, 0.0f, 0.0f));
        PartDefinition LeftArm2 = partdefinition.addOrReplaceChild("LeftArm2", CubeListBuilder.create().texOffs(58, 38).addBox(-0.8125f, -9.9365f, -1.041f, 3.0f, 3.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(47, 56).addBox(-0.9375f, -7.6865f, 0.459f, 3.0f, 6.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(73, 6).addBox(-0.4375f, -2.8115f, -0.541f, 2.0f, 4.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(28, 7).addBox(-0.5699f, -9.4192f, -0.547f, 3.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-3.0f, 1.0f, 0.0f, -0.2839f, -0.3178f, -0.9685f));
        LeftArm2.addOrReplaceChild("RightBlade_r3", CubeListBuilder.create().texOffs(78, 45).addBox(-0.5f, -1.0f, -1.0f, 1.0f, 3.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.4425f, -17.7731f, -7.1356f, 0.829f, 0.0f, 0.0f));
        LeftArm2.addOrReplaceChild("RightBlade_r4", CubeListBuilder.create().texOffs(61, 78).addBox(-0.5f, -4.0f, -1.0f, 1.0f, 6.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.4425f, -17.2699f, -7.2407f, 0.5236f, 0.0f, 0.0f));
        LeftArm2.addOrReplaceChild("RightBlade_r5", CubeListBuilder.create().texOffs(38, 64).addBox(-0.7449f, -8.957f, -4.0407f, 1.0f, 9.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.6875f, -11.5615f, 2.084f, 0.7854f, 0.0f, 0.0f));
        LeftArm2.addOrReplaceChild("RightArm_r1", CubeListBuilder.create().texOffs(46, 65).addBox(-1.7449f, -0.957f, -5.0407f, 2.0f, 4.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(1.1875f, -12.4365f, 0.959f, 0.7854f, 0.0f, 0.0f));
        PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(59, 56).addBox(-0.4588f, -0.6984f, -0.7389f, 3.0f, 6.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(48, 24).addBox(0.2912f, -1.5734f, -1.2389f, 3.0f, 3.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(58, 45).addBox(0.5412f, 4.3016f, -2.1139f, 3.0f, 3.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(58, 52).addBox(0.7804f, 5.7699f, -1.5655f, 3.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(4.0f, 1.0f, -3.0f, 0.0873f, 0.0f, -0.3927f));
        RightArm.addOrReplaceChild("LeftBlade_r4", CubeListBuilder.create().texOffs(23, 71).addBox(12.1106f, -1.8591f, -0.118f, 1.0f, 13.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-11.0094f, 10.6782f, -0.5736f, -0.7854f, 0.0f, 0.0f));
        RightArm.addOrReplaceChild("LeftBlade_r5", CubeListBuilder.create().texOffs(5, 23).addBox(12.1106f, -0.8591f, -0.118f, 1.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-11.0094f, 20.4691f, -8.9845f, 0.7854f, 0.0f, 0.0f));
        RightArm.addOrReplaceChild("LeftBlade_r6", CubeListBuilder.create().texOffs(13, 25).addBox(12.1106f, -0.8591f, -0.118f, 1.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-11.0094f, 18.6936f, -8.959f, -1.1781f, 0.0f, 0.0f));
        RightArm.addOrReplaceChild("RightBlade_r6", CubeListBuilder.create().texOffs(39, 24).addBox(-0.94f, 9.5f, -4.0f, 1.0f, 5.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(2.0412f, 11.919f, 2.8137f, -1.0472f, 0.0f, 0.0f));
        RightArm.addOrReplaceChild("RightBlade_r7", CubeListBuilder.create().texOffs(53, 74).addBox(-0.5f, -2.5f, -1.0f, 1.0f, 4.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(1.6012f, 13.6414f, -10.3323f, -1.5272f, 0.0f, 0.0f));
        RightArm.addOrReplaceChild("RightBlade_r8", CubeListBuilder.create().texOffs(46, 32).addBox(-0.94f, 1.5f, -1.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(48, 24).addBox(-0.94f, 8.5f, -1.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(15, 66).addBox(-0.94f, 0.5f, -4.0f, 1.0f, 9.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(2.0412f, 8.9266f, 1.0111f, -0.7854f, 0.0f, 0.0f));
        RightArm.addOrReplaceChild("RightArm_r2", CubeListBuilder.create().texOffs(66, 20).addBox(-0.94f, -2.5f, -5.0f, 2.0f, 4.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(1.5412f, 9.8016f, -0.1139f, -0.7854f, 0.0f, 0.0f));
        PartDefinition RightArm2 = partdefinition.addOrReplaceChild("RightArm2", CubeListBuilder.create().texOffs(18, 57).addBox(-2.0625f, -7.6865f, 0.459f, 3.0f, 6.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(43, 73).addBox(-1.5625f, -2.8115f, -0.541f, 2.0f, 4.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(33, 57).addBox(-2.1875f, -9.9365f, -1.041f, 3.0f, 3.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(0, 30).addBox(-2.4301f, -9.4192f, -0.547f, 3.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(3.0f, 1.0f, 0.0f, -0.2839f, 0.3178f, 0.9685f));
        RightArm2.addOrReplaceChild("RightBlade_r9", CubeListBuilder.create().texOffs(50, 49).addBox(-0.2856f, -12.1186f, -4.067f, 1.0f, 3.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-0.6875f, -12.6867f, 3.0756f, 0.829f, 0.0f, 0.0f));
        RightArm2.addOrReplaceChild("RightBlade_r10", CubeListBuilder.create().texOffs(39, 78).addBox(-0.5f, -4.0f, -1.0f, 1.0f, 6.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-0.4731f, -17.434f, -7.2991f, 0.5236f, 0.0f, 0.0f));
        RightArm2.addOrReplaceChild("RightBlade_r11", CubeListBuilder.create().texOffs(0, 60).addBox(-0.2856f, -9.1143f, -3.966f, 1.0f, 9.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-0.6875f, -11.5615f, 2.084f, 0.7854f, 0.0f, 0.0f));
        RightArm2.addOrReplaceChild("RightArm_r3", CubeListBuilder.create().texOffs(26, 64).addBox(-0.2856f, -1.1143f, -4.966f, 2.0f, 4.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-1.1875f, -12.4365f, 0.959f, 0.7854f, 0.0f, 0.0f));
        PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create(), PartPose.offset(-2.19f, 10.0f, 0.0f));
        LeftLeg.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(47, 0).addBox(-2.875f, 4.3732f, -4.2794f, 4.0f, 3.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(75, 38).addBox(-3.34f, 5.3732f, -6.2794f, 2.0f, 2.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(76, 0).addBox(-0.28f, 5.3732f, -6.2794f, 2.0f, 2.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 6.6268f, 1.6794f)).addOrReplaceChild("cube_r7_r1", CubeListBuilder.create().texOffs(63, 74).addBox(-4.5325f, -0.5f, -2.0f, 2.0f, 1.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(2.6275f, 6.2482f, 0.7206f, 0.3054f, 0.0f, 0.0f));
        LeftLeg.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(50, 32).addBox(-2.375f, 0.0f, -1.0f, 3.0f, 7.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(0, 34).addBox(-2.28f, -4.0f, 1.0f, 1.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(55, 45).addBox(-2.28f, -2.0f, 1.0f, 2.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 6.6268f, 2.2794f, -0.3927f, 0.0f, 0.0f));
        LeftLeg.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 50).addBox(-1.875f, -1.0f, -1.0f, 3.0f, 7.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 4.5637f, -2.5296f, 0.7854f, 0.0f, 0.0f));
        PartDefinition cube_r4 = LeftLeg.addOrReplaceChild("cube_r4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0f, 1.2f, 0.2f, -0.3927f, 0.0f, 0.0f));
        cube_r4.addOrReplaceChild("cube_r5_r1", CubeListBuilder.create().texOffs(0, 74).addBox(-1.5f, -0.375f, -2.875f, 3.0f, 4.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(4.38f, 2.5f, 0.0f, 0.0f, 0.0f, -0.0873f));
        cube_r4.addOrReplaceChild("cube_r4_r1", CubeListBuilder.create().texOffs(16, 34).addBox(-2.0f, -3.5f, -2.625f, 4.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 2.5f, 0.0f, 0.0f, 0.0f, 0.0873f));
        PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create(), PartPose.offset(2.22f, 10.0f, 0.0f));
        RightLeg.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(46, 9).addBox(-1.25f, 4.3732f, -4.2794f, 4.0f, 3.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(68, 36).addBox(-1.75f, 5.3732f, -6.2794f, 2.0f, 2.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(12, 34).addBox(1.31f, 5.3732f, -6.2794f, 2.0f, 2.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 6.6268f, 1.6794f)).addOrReplaceChild("cube_r6_r1", CubeListBuilder.create().texOffs(73, 74).addBox(1.5325f, -0.5f, -2.0f, 2.0f, 1.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-1.7825f, 6.2482f, 0.7206f, 0.3054f, 0.0f, 0.0f));
        RightLeg.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(38, 47).addBox(-0.75f, 0.0f, -1.0f, 3.0f, 7.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(41, 0).addBox(1.25f, -4.0f, 1.0f, 1.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(9, 50).addBox(0.25f, -2.0f, 1.0f, 2.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 6.6268f, 2.2794f, -0.3927f, 0.0f, 0.0f));
        RightLeg.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(15, 47).addBox(-1.25f, -1.0f, -1.0f, 3.0f, 7.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 4.5637f, -2.5296f, 0.7854f, 0.0f, 0.0f));
        PartDefinition cube_r8 = RightLeg.addOrReplaceChild("cube_r8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0f, 1.2f, 0.2f, -0.3927f, 0.0f, 0.0f));
        cube_r8.addOrReplaceChild("cube_r6_r2", CubeListBuilder.create().texOffs(73, 56).addBox(-1.5f, -0.375f, -2.875f, 3.0f, 4.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-4.41f, 2.5f, 0.0f, 0.0f, 0.0f, 0.0873f));
        cube_r8.addOrReplaceChild("cube_r8_r1", CubeListBuilder.create().texOffs(0, 34).addBox(-2.0f, -3.5f, -2.625f, 4.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 2.5f, 0.0f, 0.0f, 0.0f, -0.0873f));
        PartDefinition LeftArm3 = partdefinition.addOrReplaceChild("LeftArm3", CubeListBuilder.create().texOffs(58, 38).addBox(-0.8125f, -9.9365f, -1.041f, 3.0f, 3.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(47, 56).addBox(-0.9375f, -7.6865f, 0.459f, 3.0f, 6.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(73, 6).addBox(-0.4375f, -2.8115f, -0.541f, 2.0f, 4.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(28, 7).addBox(-0.5699f, -9.4192f, -0.547f, 3.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-3.0f, 4.0f, 0.0f, -0.4611f, -0.3971f, -2.0917f));
        LeftArm3.addOrReplaceChild("RightBlade_r12", CubeListBuilder.create().texOffs(78, 45).addBox(-0.5f, -1.0f, -1.0f, 1.0f, 3.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.4425f, -17.7731f, -7.1356f, 0.829f, 0.0f, 0.0f));
        LeftArm3.addOrReplaceChild("RightBlade_r13", CubeListBuilder.create().texOffs(61, 78).addBox(-0.5f, -4.0f, -1.0f, 1.0f, 6.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.4425f, -17.2699f, -7.2407f, 0.5236f, 0.0f, 0.0f));
        LeftArm3.addOrReplaceChild("RightBlade_r14", CubeListBuilder.create().texOffs(38, 64).addBox(-0.7449f, -8.957f, -4.0407f, 1.0f, 9.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.6875f, -11.5615f, 2.084f, 0.7854f, 0.0f, 0.0f));
        LeftArm3.addOrReplaceChild("RightArm_r4", CubeListBuilder.create().texOffs(46, 65).addBox(-1.7449f, -0.957f, -5.0407f, 2.0f, 4.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(1.1875f, -12.4365f, 0.959f, 0.7854f, 0.0f, 0.0f));
        PartDefinition RightArm3 = partdefinition.addOrReplaceChild("RightArm3", CubeListBuilder.create().texOffs(18, 57).addBox(-2.0625f, -7.6865f, 0.459f, 3.0f, 6.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(43, 73).addBox(-1.5625f, -2.8115f, -0.541f, 2.0f, 4.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(33, 57).addBox(-2.1875f, -9.9365f, -1.041f, 3.0f, 3.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(0, 30).addBox(-2.4301f, -9.4192f, -0.547f, 3.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(3.0f, 4.0f, 0.0f, -0.4611f, 0.3971f, 2.0917f));
        RightArm3.addOrReplaceChild("RightBlade_r15", CubeListBuilder.create().texOffs(50, 49).addBox(-0.2856f, -12.1186f, -4.067f, 1.0f, 3.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-0.6875f, -12.6867f, 3.0756f, 0.829f, 0.0f, 0.0f));
        RightArm3.addOrReplaceChild("RightBlade_r16", CubeListBuilder.create().texOffs(39, 78).addBox(-0.5f, -4.0f, -1.0f, 1.0f, 6.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-0.4731f, -17.434f, -7.2991f, 0.5236f, 0.0f, 0.0f));
        RightArm3.addOrReplaceChild("RightBlade_r17", CubeListBuilder.create().texOffs(0, 60).addBox(-0.2856f, -9.1143f, -3.966f, 1.0f, 9.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-0.6875f, -11.5615f, 2.084f, 0.7854f, 0.0f, 0.0f));
        RightArm3.addOrReplaceChild("RightArm_r5", CubeListBuilder.create().texOffs(26, 64).addBox(-0.2856f, -1.1143f, -4.966f, 2.0f, 4.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-1.1875f, -12.4365f, 0.959f, 0.7854f, 0.0f, 0.0f));
        return LayerDefinition.create(meshdefinition, 96, 96);
    }

    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        this.Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.LeftArm2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.RightArm2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.LeftArm3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.RightArm3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.RightArm2.xRot = Mth.cos((limbSwing * 0.6662f) + 3.1415927f) * limbSwingAmount;
        this.LeftArm3.xRot = Mth.cos(limbSwing * 0.6662f) * limbSwingAmount;
        this.RightArm.xRot = Mth.cos((limbSwing * 0.6662f) + 3.1415927f) * limbSwingAmount;
        this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0f) * -1.0f * limbSwingAmount;
        this.RightArm3.xRot = Mth.cos((limbSwing * 0.6662f) + 3.1415927f) * limbSwingAmount;
        this.Head.yRot = netHeadYaw / 57.295776f;
        this.Head.xRot = headPitch / 57.295776f;
        this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662f) * limbSwingAmount;
        this.LeftArm2.xRot = Mth.cos(limbSwing * 0.6662f) * limbSwingAmount;
        this.RightLeg.xRot = Mth.cos(limbSwing * 1.0f) * 1.0f * limbSwingAmount;
    }
}
