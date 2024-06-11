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
/*     */ public class Modelhertx_model_s1<T extends Entity>
/*     */   extends EntityModel<T>
/*     */ {
/*  25 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("latex", "modelhertx_model_s_1"), "main");
/*     */   public final ModelPart Head;
/*     */   public final ModelPart Body;
/*     */   public final ModelPart Tail;
/*     */   public final ModelPart LeftArm;
/*     */   public final ModelPart RightArm;
/*     */   public final ModelPart LeftLeg;
/*     */   public final ModelPart RightLeg;
/*     */   
/*     */   public Modelhertx_model_s1(ModelPart root) {
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
/*  48 */         CubeListBuilder.create().texOffs(24, 0).addBox(-3.0F, -3.7F, -5.0F, 6.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(56, 47)
/*  49 */         .addBox(-2.0F, -4.8F, -3.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(18, 60)
/*  50 */         .addBox(-2.0F, -8.8F, 2.0F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(42, 11)
/*  51 */         .addBox(-2.0F, -4.8F, 3.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 30)
/*  52 */         .addBox(-3.0F, -4.8F, 2.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 8)
/*  53 */         .addBox(-3.0F, -2.8F, -2.9F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(24, 4)
/*  54 */         .addBox(-1.0F, -2.55F, -3.15F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 22)
/*  55 */         .addBox(2.0F, -8.8F, 2.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 30)
/*  56 */         .addBox(-3.0F, -8.8F, 2.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(17, 22)
/*  57 */         .addBox(-3.0F, -8.8F, -5.0F, 6.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 53)
/*  58 */         .addBox(2.0F, -7.8F, -5.0F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(25, 60)
/*  59 */         .addBox(2.0F, -4.7F, -5.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(50, 30)
/*  60 */         .addBox(-3.0F, -7.8F, -5.0F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(9, 60)
/*  61 */         .addBox(-3.0F, -4.7F, -5.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(59, 28)
/*  62 */         .addBox(-3.25F, -4.5125F, -4.625F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(58, 0)
/*  63 */         .addBox(2.25F, -4.5125F, -4.625F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(20, 0)
/*  64 */         .addBox(-2.0F, -7.8F, -5.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 41)
/*  65 */         .addBox(-2.0F, -4.7F, -5.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 54)
/*  66 */         .addBox(-1.0F, -4.5125F, -5.1875F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), 
/*  67 */         PartPose.offset(0.0F, 0.4F, -0.2F));
/*  68 */     PartDefinition bone = Head.addOrReplaceChild("bone", CubeListBuilder.create(), 
/*  69 */         PartPose.offsetAndRotation(0.0F, -8.3F, -1.5F, 0.4276F, 0.0F, 0.0F));
/*  70 */     PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1", 
/*  71 */         CubeListBuilder.create().texOffs(0, 33).addBox(-3.125F, -7.4142F, 9.2505F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
/*  72 */         .texOffs(67, 16).addBox(-3.125F, -7.4142F, 4.2505F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
/*  73 */         .addBox(2.125F, -7.4142F, 9.2505F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 63)
/*  74 */         .addBox(2.125F, -7.4142F, 4.2505F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), 
/*  75 */         PartPose.offsetAndRotation(0.0F, 0.0F, 1.125F, 0.4712F, 0.0F, 0.0F));
/*  76 */     PartDefinition Body = partdefinition.addOrReplaceChild("Body", 
/*  77 */         CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -1.8F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
/*  78 */         .addBox(-3.0F, -0.05F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(48, 60)
/*  79 */         .addBox(-4.25F, 3.2F, -3.5F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(34, 60)
/*  80 */         .addBox(2.25F, 3.2F, -3.5F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 28)
/*  81 */         .addBox(-1.0F, 3.2F, -3.5F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(28, 39)
/*  82 */         .addBox(-2.5F, 3.2F, 2.25F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 33)
/*  83 */         .addBox(-2.5F, 0.95F, 2.25F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 8)
/*  84 */         .addBox(2.8125F, 0.95F, 1.8125F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 16)
/*  85 */         .addBox(-3.8125F, 0.95F, 1.8125F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 16)
/*  86 */         .addBox(-4.5F, 4.2F, -2.5F, 9.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(53, 62)
/*  87 */         .addBox(-3.5F, -2.05F, -2.5F, 1.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(41, 60)
/*  88 */         .addBox(2.5F, -2.05F, -2.5F, 1.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), 
/*  89 */         PartPose.offset(0.0F, 0.0F, 0.0F));
/*  90 */     PartDefinition Tail = partdefinition.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
/*  91 */     PartDefinition cube_r2 = Tail.addOrReplaceChild("cube_r2", CubeListBuilder.create(), 
/*  92 */         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/*  93 */     PartDefinition cube_r3 = Tail.addOrReplaceChild("cube_r3", 
/*  94 */         CubeListBuilder.create().texOffs(0, 28).addBox(-1.3F, 4.2F, 7.0F, 3.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(22, 30)
/*  95 */         .addBox(-1.3F, 5.2F, 15.0F, 3.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), 
/*  96 */         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
/*  97 */     PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", 
/*  98 */         CubeListBuilder.create().texOffs(0, 39).addBox(-3.0F, -3.8F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(54, 11)
/*  99 */         .addBox(-3.0F, 4.2F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(45, 3)
/* 100 */         .addBox(-3.25F, -4.05F, -2.5F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(16, 39)
/* 101 */         .addBox(-3.0F, 10.2F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 39)
/* 102 */         .addBox(-3.0F, 10.2F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 39)
/* 103 */         .addBox(-1.0F, 10.2F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 27)
/* 104 */         .addBox(-3.0F, 10.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 105 */         PartPose.offset(-5.0F, 2.0F, 0.0F));
/* 106 */     PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", 
/* 107 */         CubeListBuilder.create().texOffs(41, 17).addBox(-0.75F, -4.05F, -2.5F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(38, 38)
/* 108 */         .addBox(-1.0F, -3.8F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(44, 50)
/* 109 */         .addBox(-1.0F, 4.2F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(35, 35)
/* 110 */         .addBox(0.0F, 10.2F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 35)
/* 111 */         .addBox(2.0F, 10.2F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(25, 34)
/* 112 */         .addBox(2.0F, 10.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 33)
/* 113 */         .addBox(2.0F, 10.2F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 114 */         PartPose.offset(5.0F, 2.0F, 0.0F));
/* 115 */     PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", 
/* 116 */         CubeListBuilder.create().texOffs(66, 8).addBox(-2.0F, -1.8F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
/* 117 */         .addBox(-1.625F, -1.8F, 1.75F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 40)
/* 118 */         .addBox(-2.0F, 10.0F, -2.9102F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 119 */         PartPose.offset(-2.0F, 12.0F, 0.0F));
/* 120 */     PartDefinition cube_r4 = LeftLeg.addOrReplaceChild("cube_r4", 
/* 121 */         CubeListBuilder.create().texOffs(67, 36).addBox(-2.0F, 4.3F, 3.0F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 122 */         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 123 */     PartDefinition cube_r5 = LeftLeg.addOrReplaceChild("cube_r5", 
/* 124 */         CubeListBuilder.create().texOffs(39, 26).addBox(-2.0F, 0.0F, -5.8F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 125 */         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
/* 126 */     PartDefinition cube_r6 = LeftLeg.addOrReplaceChild("cube_r6", 
/* 127 */         CubeListBuilder.create().texOffs(28, 50).addBox(-2.0F, -0.6F, -2.2F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 128 */         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 129 */     PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", 
/* 130 */         CubeListBuilder.create().texOffs(64, 53).addBox(-2.0F, -1.8F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
/* 131 */         .texOffs(54, 21).addBox(-2.0F, 10.0F, -2.9102F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 132 */         PartPose.offset(2.0F, 12.0F, 0.0F));
/* 133 */     PartDefinition cube_r7 = RightLeg.addOrReplaceChild("cube_r7", 
/* 134 */         CubeListBuilder.create().texOffs(65, 65).addBox(-2.0F, 4.3F, 3.0F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 135 */         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 136 */     PartDefinition cube_r8 = RightLeg.addOrReplaceChild("cube_r8", 
/* 137 */         CubeListBuilder.create().texOffs(16, 39).addBox(-2.0F, 0.0F, -5.8F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 138 */         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
/* 139 */     PartDefinition cube_r9 = RightLeg.addOrReplaceChild("cube_r9", 
/* 140 */         CubeListBuilder.create().texOffs(12, 50).addBox(-2.0F, -0.6F, -2.2F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 141 */         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 142 */     return LayerDefinition.create(meshdefinition, 128, 128);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 148 */     this.Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 149 */     this.Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 150 */     this.Tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 151 */     this.LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 152 */     this.RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 153 */     this.LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 154 */     this.RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */   
/*     */   public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
/* 158 */     this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + 3.1415927F) * limbSwingAmount;
/* 159 */     this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
/* 160 */     this.Head.yRot = netHeadYaw / 57.295776F;
/* 161 */     this.Head.xRot = headPitch / 57.295776F;
/* 162 */     this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
/* 163 */     this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\client\model\Modelhertx_model_s1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */