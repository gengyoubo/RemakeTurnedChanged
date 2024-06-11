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
/*     */ public class Modelhertx_model_fb<T extends Entity>
/*     */   extends EntityModel<T>
/*     */ {
/*  25 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("latex", "modelhertx_model_fb"), "main");
/*     */   public final ModelPart Head;
/*     */   public final ModelPart Body;
/*     */   public final ModelPart Tail;
/*     */   public final ModelPart LeftArm;
/*     */   public final ModelPart RightArm;
/*     */   public final ModelPart LeftLeg;
/*     */   public final ModelPart RightLeg;
/*     */   
/*     */   public Modelhertx_model_fb(ModelPart root) {
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
/*  48 */         CubeListBuilder.create().texOffs(15, 13).addBox(-3.0F, -1.7F, -5.0F, 6.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(52, 41)
/*  49 */         .addBox(-2.0F, -2.8F, -3.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(58, 47)
/*  50 */         .addBox(-2.0F, -6.8F, 2.0F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 7)
/*  51 */         .addBox(-2.0F, -2.8F, 3.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 3)
/*  52 */         .addBox(-3.0F, -2.8F, 2.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 0)
/*  53 */         .addBox(-2.5F, -0.8F, -2.4F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 17)
/*  54 */         .addBox(2.0F, -6.8F, 2.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(5, 16)
/*  55 */         .addBox(-3.0F, -6.8F, 2.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 27)
/*  56 */         .addBox(-3.0F, -6.8F, -3.0F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(41, 57)
/*  57 */         .addBox(2.0F, -5.8F, -4.0F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(49, 50)
/*  58 */         .addBox(2.0F, -2.7F, -5.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 56)
/*  59 */         .addBox(-3.0F, -5.8F, -4.0F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(53, 0)
/*  60 */         .addBox(-3.0F, -4.8F, -5.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 46)
/*  61 */         .addBox(-3.0F, -2.7F, -5.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(58, 54)
/*  62 */         .addBox(-2.0F, -5.8F, -5.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 25)
/*  63 */         .addBox(-2.0F, -6.8F, -4.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 25)
/*  64 */         .addBox(-2.0F, -2.7F, -5.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  65 */         PartPose.offset(0.0F, -2.6F, -0.2F));
/*  66 */     PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1", 
/*  67 */         CubeListBuilder.create().texOffs(15, 15).addBox(-3.0F, -8.3801F, 8.5093F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
/*  68 */         .addBox(-3.0F, -8.3801F, 10.5093F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 27)
/*  69 */         .addBox(-3.0F, -8.3801F, 4.5093F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 13)
/*  70 */         .addBox(2.0F, -8.3801F, 8.5093F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 2)
/*  71 */         .addBox(2.0F, -8.3801F, 10.5093F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(2.0F, -8.3801F, 4.5093F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), 
/*     */         
/*  73 */         PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, 0.2618F, 0.0F, 0.0F));
/*  74 */     PartDefinition Body = partdefinition.addOrReplaceChild("Body", 
/*  75 */         CubeListBuilder.create().texOffs(26, 8).addBox(-4.0F, 8.2F, -2.0F, 8.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 0)
/*  76 */         .addBox(-3.5F, 4.2F, -2.0F, 7.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(20, 21)
/*  77 */         .addBox(-4.0F, -2.8F, -2.0F, 8.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(55, 58)
/*  78 */         .addBox(-3.5F, -2.9875F, -2.75F, 7.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(15, 13)
/*  79 */         .addBox(-1.0F, 3.0125F, -2.3125F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 8)
/*  80 */         .addBox(-3.0F, 2.0125F, -2.5F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  81 */         PartPose.offset(0.0F, 0.0F, 0.0F));
/*  82 */     PartDefinition Tail = partdefinition.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
/*  83 */     PartDefinition cube_r2 = Tail.addOrReplaceChild("cube_r2", 
/*  84 */         CubeListBuilder.create().texOffs(0, 13).addBox(-1.3F, 9.2337F, 12.5679F, 3.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), 
/*  85 */         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/*  86 */     PartDefinition cube_r3 = Tail.addOrReplaceChild("cube_r3", 
/*  87 */         CubeListBuilder.create().texOffs(0, 0).addBox(-1.3F, 3.4929F, 6.2929F, 3.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)), 
/*  88 */         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
/*  89 */     PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", 
/*  90 */         CubeListBuilder.create().texOffs(42, 45).addBox(-1.7385F, -1.8114F, -2.0F, 3.0F, 8.0F, 4.0F, new CubeDeformation(0.0F))
/*  91 */         .texOffs(41, 13).addBox(-2.7385F, 6.1886F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 0)
/*  92 */         .addBox(-2.7385F, 13.1886F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 2)
/*  93 */         .addBox(-2.7385F, 13.1886F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 0)
/*  94 */         .addBox(-0.7385F, 13.1886F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 13)
/*  95 */         .addBox(-2.7385F, 13.1886F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  96 */         PartPose.offsetAndRotation(-5.0625F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0873F));
/*  97 */     PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", 
/*  98 */         CubeListBuilder.create().texOffs(28, 45).addBox(-1.2615F, -1.8114F, -2.0F, 3.0F, 8.0F, 4.0F, new CubeDeformation(0.0F))
/*  99 */         .texOffs(34, 34).addBox(-1.2615F, 6.1886F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 2)
/* 100 */         .addBox(-0.2615F, 13.1886F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 27)
/* 101 */         .addBox(1.7385F, 13.1886F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 10)
/* 102 */         .addBox(1.7385F, 13.1886F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 29).addBox(1.7385F, 13.1886F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*     */         
/* 104 */         PartPose.offsetAndRotation(5.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.0873F));
/* 105 */     PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", 
/* 106 */         CubeListBuilder.create().texOffs(57, 13).addBox(-2.0F, -0.8F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
/* 107 */         .texOffs(50, 34).addBox(-2.125F, 12.0F, -2.9102F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 108 */         PartPose.offset(-2.0F, 10.0F, 0.0F));
/* 109 */     PartDefinition cube_r4 = LeftLeg.addOrReplaceChild("cube_r4", 
/* 110 */         CubeListBuilder.create().texOffs(27, 57).addBox(-2.0F, 4.3F, 3.0F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 111 */         PartPose.offsetAndRotation(-0.0625F, 2.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 112 */     PartDefinition cube_r5 = LeftLeg.addOrReplaceChild("cube_r5", 
/* 113 */         CubeListBuilder.create().texOffs(0, 33).addBox(-1.9375F, 0.0F, -5.8F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 114 */         PartPose.offsetAndRotation(-0.0625F, 2.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
/* 115 */     PartDefinition cube_r6 = LeftLeg.addOrReplaceChild("cube_r6", 
/* 116 */         CubeListBuilder.create().texOffs(44, 24).addBox(-2.0F, -0.6F, -2.2F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 117 */         PartPose.offsetAndRotation(-0.0625F, 2.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 118 */     PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", 
/* 119 */         CubeListBuilder.create().texOffs(56, 20).addBox(-2.0F, -0.8F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
/* 120 */         .texOffs(50, 6).addBox(-1.875F, 12.0F, -2.9102F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 121 */         PartPose.offset(2.0F, 10.0F, 0.0F));
/* 122 */     PartDefinition cube_r7 = RightLeg.addOrReplaceChild("cube_r7", 
/* 123 */         CubeListBuilder.create().texOffs(13, 53).addBox(-2.0F, 4.3F, 3.0F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 124 */         PartPose.offsetAndRotation(0.0625F, 2.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 125 */     PartDefinition cube_r8 = RightLeg.addOrReplaceChild("cube_r8", 
/* 126 */         CubeListBuilder.create().texOffs(18, 32).addBox(-2.0625F, 0.0F, -5.8F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 127 */         PartPose.offsetAndRotation(0.0625F, 2.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
/* 128 */     PartDefinition cube_r9 = RightLeg.addOrReplaceChild("cube_r9", 
/* 129 */         CubeListBuilder.create().texOffs(12, 43).addBox(-2.0F, -0.6F, -2.2F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 130 */         PartPose.offsetAndRotation(0.0625F, 2.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 131 */     return LayerDefinition.create(meshdefinition, 128, 128);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 137 */     this.Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 138 */     this.Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 139 */     this.Tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 140 */     this.LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 141 */     this.RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 142 */     this.LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 143 */     this.RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */   
/*     */   public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
/* 147 */     this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + 3.1415927F) * limbSwingAmount;
/* 148 */     this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
/* 149 */     this.Head.yRot = netHeadYaw / 57.295776F;
/* 150 */     this.Head.xRot = headPitch / 57.295776F;
/* 151 */     this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
/* 152 */     this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\client\model\Modelhertx_model_fb.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */