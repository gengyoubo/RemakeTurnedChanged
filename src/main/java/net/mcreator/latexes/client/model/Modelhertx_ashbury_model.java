/*     */ package net.mcreator.latexes.client.model;
/*     */ 
/*     */ import com.mojang.blaze3d.vertex.PoseStack;
/*     */ import com.mojang.blaze3d.vertex.VertexConsumer;
/*     */ import net.minecraft.client.model.EntityModel;
/*     */ import net.minecraft.client.model.geom.ModelLayerLocation;
/*     */ import net.minecraft.client.model.geom.ModelPart;
/*     */ import net.minecraft.client.model.geom.PartPose;
/*     */ import net.minecraft.client.model.geom.builders.CubeDeformation;
/*     */ import net.minecraft.client.model.geom.builders.CubeListBuilder;
/*     */ import net.minecraft.client.model.geom.builders.LayerDefinition;
/*     */ import net.minecraft.client.model.geom.builders.MeshDefinition;
/*     */ import net.minecraft.client.model.geom.builders.PartDefinition;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.util.Mth;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Modelhertx_ashbury_model<T extends Entity>
/*     */   extends EntityModel<T>
/*     */ {
/*  25 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("latex", "modelhertx_ashbury_model"), "main");
/*     */   public final ModelPart Head;
/*     */   public final ModelPart Body;
/*     */   public final ModelPart Tail;
/*     */   public final ModelPart LeftArm;
/*     */   public final ModelPart RightArm;
/*     */   public final ModelPart LeftLeg;
/*     */   public final ModelPart RightLeg;
/*     */   
/*     */   public Modelhertx_ashbury_model(ModelPart root) {
/*  35 */     this.Head = root.getChild("Head");
/*  36 */     this.Body = root.getChild("Body");
/*  37 */     this.Tail = root.getChild("Tail");
/*  38 */     this.LeftArm = root.getChild("LeftArm");
/*  39 */     this.RightArm = root.getChild("RightArm");
/*  40 */     this.LeftLeg = root.getChild("LeftLeg");
/*  41 */     this.RightLeg = root.getChild("RightLeg");
/*     */   }
/*     */   
/*     */   public static LayerDefinition createBodyLayer() {
/*  45 */     MeshDefinition meshdefinition = new MeshDefinition();
/*  46 */     PartDefinition partdefinition = meshdefinition.getRoot();
/*  47 */     PartDefinition Head = partdefinition.addOrReplaceChild("Head", 
/*  48 */         CubeListBuilder.create().texOffs(24, 16).addBox(-3.0F, -1.8268F, -5.0166F, 6.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
/*  49 */         .texOffs(14, 57).addBox(-2.0F, -2.8268F, -3.0166F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(63, 9)
/*  50 */         .addBox(-2.0F, -6.8268F, 1.9834F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(54, 9)
/*  51 */         .addBox(-2.0F, -2.8268F, 2.9834F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 8)
/*  52 */         .addBox(-3.0F, -2.8268F, 1.9834F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(61, 33)
/*  53 */         .addBox(-2.0F, -0.8268F, -1.9166F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(20, 32)
/*  54 */         .addBox(2.0F, -6.8268F, 1.9834F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 24)
/*  55 */         .addBox(-3.0F, -6.8268F, 1.9834F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 0)
/*  56 */         .addBox(-3.0F, -6.8268F, -5.0166F, 6.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(52, 31)
/*  57 */         .addBox(2.0F, -5.8268F, -5.0166F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(55, 50)
/*  58 */         .addBox(2.0F, -2.8268F, -5.0166F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(45, 9)
/*  59 */         .addBox(-3.0F, -5.8268F, -5.0166F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(54, 12)
/*  60 */         .addBox(-3.0F, -2.8268F, -5.0166F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(20, 16)
/*  61 */         .addBox(-2.0F, -5.8268F, -5.0166F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 11)
/*  62 */         .addBox(-2.0F, -2.8268F, -5.0166F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  63 */         PartPose.offset(0.0F, -3.25F, -0.2F));
/*  64 */     PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1", 
/*  65 */         CubeListBuilder.create().texOffs(0, 16).addBox(-3.125F, -8.7546F, 10.2581F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
/*  66 */         .texOffs(21, 63).addBox(-3.125F, -8.7546F, 5.2581F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(7, 0)
/*  67 */         .addBox(2.125F, -8.7546F, 10.2581F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(9, 10)
/*  68 */         .addBox(2.125F, -8.7546F, 11.2581F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 5)
/*  69 */         .addBox(-3.125F, -8.7546F, 11.2581F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(9, 63)
/*  70 */         .addBox(2.125F, -8.7546F, 5.2581F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), 
/*  71 */         PartPose.offsetAndRotation(0.0F, 3.65F, 2.25F, 0.6545F, 0.0F, 0.0F));
/*  72 */     PartDefinition Body = partdefinition.addOrReplaceChild("Body", 
/*  73 */         CubeListBuilder.create().texOffs(0, 32).addBox(-3.5F, 0.122F, -2.9153F, 7.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
/*  74 */         .addBox(-4.0F, -0.2268F, -2.0166F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(62, 20)
/*  75 */         .addBox(-3.97F, 8.6532F, -3.0166F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(41, 57)
/*  76 */         .addBox(-1.625F, -0.3518F, -3.2666F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), 
/*  77 */         PartPose.offset(0.0F, -3.25F, 0.0F));
/*  78 */     PartDefinition booba = Body.addOrReplaceChild("booba", CubeListBuilder.create(), PartPose.offset(0.0F, 3.65F, -0.2F));
/*  79 */     PartDefinition Body_r1 = booba.addOrReplaceChild("Body_r1", 
/*  80 */         CubeListBuilder.create().texOffs(32, 8).addBox(-3.5F, -1.5F, -2.0F, 7.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), 
/*  81 */         PartPose.offsetAndRotation(0.0F, -1.3768F, -1.4416F, -0.3927F, 0.0F, 0.0F));
/*  82 */     PartDefinition Tail = partdefinition.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offset(0.0F, -3.25F, 0.0F));
/*  83 */     PartDefinition cube_r2 = Tail.addOrReplaceChild("cube_r2", 
/*  84 */         CubeListBuilder.create().texOffs(24, 24).addBox(-1.3F, 9.7598F, 14.9821F, 3.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), 
/*  85 */         PartPose.offsetAndRotation(0.0F, 3.25F, 0.0F, -0.3927F, 0.0F, 0.0F));
/*  86 */     PartDefinition bone = cube_r2.addOrReplaceChild("bone", 
/*  87 */         CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -6.1263F, -3.5555F, 2.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(44, 31)
/*  88 */         .addBox(-1.0F, -7.1263F, -3.5555F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), 
/*  89 */         PartPose.offsetAndRotation(0.2F, 11.0418F, 23.0617F, -0.7854F, 0.0F, 0.0F));
/*  90 */     PartDefinition bone2 = cube_r2.addOrReplaceChild("bone2", 
/*  91 */         CubeListBuilder.create().texOffs(41, 64).addBox(-1.0F, -1.3026F, -3.1739F, 2.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
/*  92 */         .texOffs(37, 28).addBox(-1.0F, -2.3026F, -2.1739F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), 
/*  93 */         PartPose.offsetAndRotation(0.2F, 14.2637F, 23.4492F, -1.9635F, 0.0F, 0.0F));
/*  94 */     PartDefinition cube_r3 = Tail.addOrReplaceChild("cube_r3", 
/*  95 */         CubeListBuilder.create().texOffs(0, 0).addBox(-1.3F, 3.0261F, 5.8026F, 3.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(16, 63)
/*  96 */         .addBox(1.7F, 4.0261F, 10.8026F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(28, 46)
/*  97 */         .addBox(3.7F, 4.0261F, 12.8026F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(12, 40)
/*  98 */         .addBox(2.7F, 4.0261F, 11.8026F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(32, 34)
/*  99 */         .addBox(-4.2F, 4.0261F, 12.8026F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(48, 31)
/* 100 */         .addBox(-2.2F, 4.0261F, 10.8026F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(37, 24)
/* 101 */         .addBox(-3.2F, 4.0261F, 11.8026F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(64, 0)
/* 102 */         .addBox(-0.3F, 2.0261F, 7.8026F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 67)
/* 103 */         .addBox(-0.3F, 1.0261F, 8.8026F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(51, 64)
/* 104 */         .addBox(-0.3F, 0.0261F, 9.8026F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(64, 50)
/* 105 */         .addBox(-0.3F, -0.9739F, 10.8026F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 106 */         PartPose.offsetAndRotation(0.0F, 3.25F, 0.0F, -0.7854F, 0.0F, 0.0F));
/* 107 */     PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", 
/* 108 */         CubeListBuilder.create().texOffs(0, 51).addBox(-2.0F, -2.4768F, -2.0166F, 3.0F, 9.0F, 4.0F, new CubeDeformation(0.0F))
/* 109 */         .texOffs(46, 46).addBox(-3.0F, 6.5232F, -2.0166F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 110 */         PartPose.offset(-5.0F, -1.0F, 0.0F));
/* 111 */     PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", 
/* 112 */         CubeListBuilder.create().texOffs(32, 46).addBox(-1.75F, -2.4268F, -2.0166F, 3.0F, 9.0F, 4.0F, new CubeDeformation(0.0F))
/* 113 */         .texOffs(46, 20).addBox(-1.75F, 6.5732F, -2.0166F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 114 */         PartPose.offset(5.75F, -1.05F, 0.0F));
/* 115 */     PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", 
/* 116 */         CubeListBuilder.create().texOffs(61, 27).addBox(-1.875F, -1.4768F, -2.0166F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
/* 117 */         .texOffs(51, 2).addBox(-1.895F, 12.0F, -2.6002F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(19, 11)
/* 118 */         .addBox(-0.395F, 13.0F, -3.6002F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(23, 11)
/* 119 */         .addBox(1.105F, 13.0F, -3.6002F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 20)
/* 120 */         .addBox(-1.895F, 13.0F, -3.6002F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 121 */         PartPose.offset(-2.125F, 10.0F, 0.0F));
/* 122 */     PartDefinition cube_r4 = LeftLeg.addOrReplaceChild("cube_r4", 
/* 123 */         CubeListBuilder.create().texOffs(57, 58).addBox(-1.875F, 4.1814F, 3.2864F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 124 */         PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 125 */     PartDefinition cube_r5 = LeftLeg.addOrReplaceChild("cube_r5", 
/* 126 */         CubeListBuilder.create().texOffs(36, 34).addBox(-1.95F, -0.7808F, -5.5808F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 127 */         PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
/* 128 */     PartDefinition cube_r6 = LeftLeg.addOrReplaceChild("cube_r6", 
/* 129 */         CubeListBuilder.create().texOffs(16, 46).addBox(-2.0F, -2.1428F, -2.857F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(19, 0)
/* 130 */         .addBox(-3.0F, -0.4229F, -2.0254F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), 
/* 131 */         PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 132 */     PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", 
/* 133 */         CubeListBuilder.create().texOffs(28, 60).addBox(-2.0F, -1.4768F, -2.0166F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(38, 0)
/* 134 */         .addBox(-1.97F, 12.0F, -2.6002F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(27, 28)
/* 135 */         .addBox(1.03F, 13.0F, -3.6002F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(27, 21)
/* 136 */         .addBox(-1.97F, 13.0F, -3.6002F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(27, 11)
/* 137 */         .addBox(-0.47F, 13.0F, -3.6002F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 138 */         PartPose.offset(2.0F, 10.0F, 0.0F));
/* 139 */     PartDefinition cube_r7 = RightLeg.addOrReplaceChild("cube_r7", 
/* 140 */         CubeListBuilder.create().texOffs(58, 41).addBox(-2.0F, 4.1814F, 3.2864F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 141 */         PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 142 */     PartDefinition cube_r8 = RightLeg.addOrReplaceChild("cube_r8", 
/* 143 */         CubeListBuilder.create().texOffs(20, 34).addBox(-1.925F, -0.7808F, -5.5808F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 144 */         PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
/* 145 */     PartDefinition cube_r9 = RightLeg.addOrReplaceChild("cube_r9", 
/* 146 */         CubeListBuilder.create().texOffs(0, 40).addBox(-1.875F, -2.1428F, -2.857F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 147 */         PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 148 */     return LayerDefinition.create(meshdefinition, 80, 80);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 154 */     this.Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 155 */     this.Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 156 */     this.Tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 157 */     this.LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 158 */     this.RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 159 */     this.LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 160 */     this.RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */   
/*     */   public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
/* 164 */     this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + 3.1415927F) * limbSwingAmount;
/* 165 */     this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
/* 166 */     this.Head.yRot = netHeadYaw / 57.295776F;
/* 167 */     this.Head.xRot = headPitch / 57.295776F;
/* 168 */     this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
/* 169 */     this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\client\model\Modelhertx_ashbury_model.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */