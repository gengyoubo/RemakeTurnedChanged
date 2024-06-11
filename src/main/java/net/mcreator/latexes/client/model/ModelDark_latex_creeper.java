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
/*     */ public class ModelDark_latex_creeper<T extends Entity>
/*     */   extends EntityModel<T>
/*     */ {
/*  25 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("latex", "model_dark_latex_creeper"), "main");
/*     */   public final ModelPart head;
/*     */   public final ModelPart body;
/*     */   public final ModelPart leg0;
/*     */   public final ModelPart leg1;
/*     */   public final ModelPart leg2;
/*     */   public final ModelPart leg3;
/*     */   
/*     */   public ModelDark_latex_creeper(ModelPart root) {
/*  34 */     this.head = root.getChild("head");
/*  35 */     this.body = root.getChild("body");
/*  36 */     this.leg0 = root.getChild("leg0");
/*  37 */     this.leg1 = root.getChild("leg1");
/*  38 */     this.leg2 = root.getChild("leg2");
/*  39 */     this.leg3 = root.getChild("leg3");
/*     */   }
/*     */   
/*     */   public static LayerDefinition createBodyLayer() {
/*  43 */     MeshDefinition meshdefinition = new MeshDefinition();
/*  44 */     PartDefinition partdefinition = meshdefinition.getRoot();
/*  45 */     PartDefinition head = partdefinition.addOrReplaceChild("head", 
/*  46 */         CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -10.7721F, -6.6047F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), 
/*  47 */         PartPose.offset(0.0F, 6.0F, 0.0F));
/*  48 */     PartDefinition Crest = head.addOrReplaceChild("Crest", 
/*  49 */         CubeListBuilder.create().texOffs(0, 3).addBox(0.0F, -6.0F, -4.0F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(18, 16)
/*  50 */         .addBox(0.0F, -7.0F, -4.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(18, 13)
/*  51 */         .addBox(0.0F, -7.0F, 2.0F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 23)
/*  52 */         .addBox(0.0F, -6.0F, 5.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
/*  53 */         .addBox(0.0F, -2.0F, 2.0F, 0.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(2, 15)
/*  54 */         .addBox(0.0F, -1.0F, 5.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  55 */         PartPose.offset(0.0F, -5.7721F, -2.6047F));
/*  56 */     PartDefinition Mask = head.addOrReplaceChild("Mask", 
/*  57 */         CubeListBuilder.create().texOffs(34, 21).addBox(-3.0F, 2.25F, -4.5F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 2)
/*  58 */         .addBox(1.0F, 2.25F, -4.5F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(24, 19)
/*  59 */         .addBox(-1.0F, 1.75F, -4.5F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(40, 31)
/*  60 */         .addBox(3.0F, -3.0F, -4.5F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(24, 0)
/*  61 */         .addBox(-3.0F, -4.0F, -4.5F, 6.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(32, 11)
/*  62 */         .addBox(1.0F, 0.0F, -4.5F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(24, 18)
/*  63 */         .addBox(-3.0F, 0.0F, -4.5F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(16, 24)
/*  64 */         .addBox(-4.0F, -3.0F, -4.5F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(24, 16)
/*  65 */         .addBox(-6.0F, 0.0F, -4.5F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(22, 20)
/*  66 */         .addBox(-1.0F, -5.0F, -4.5F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(24, 17)
/*  67 */         .addBox(4.0F, 0.0F, -4.5F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(4, 2)
/*  68 */         .addBox(-5.0F, -1.0F, -4.5F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(6, 6)
/*  69 */         .addBox(4.0F, -1.0F, -4.5F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), 
/*  70 */         PartPose.offset(0.0F, -5.7721F, -2.4797F));
/*  71 */     PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
/*  72 */     PartDefinition body_r1 = body.addOrReplaceChild("body_r1", 
/*  73 */         CubeListBuilder.create().texOffs(0, 16).addBox(-3.5F, -12.0F, -2.125F, 7.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 9)
/*  74 */         .addBox(-2.5F, -6.5F, -4.625F, 5.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 24)
/*  75 */         .addBox(-3.0F, -8.0F, -3.0F, 6.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 31)
/*  76 */         .addBox(-3.0F, -7.0F, -4.0F, 6.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 42)
/*  77 */         .addBox(-3.0F, -1.0F, 2.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 21).addBox(-3.0F, -8.0F, -1.0F, 6.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)), 
/*     */         
/*  79 */         PartPose.offsetAndRotation(0.0F, -10.0F, 0.0F, 0.1745F, 0.0F, 0.0F));
/*  80 */     PartDefinition Crest2 = body.addOrReplaceChild("Crest2", CubeListBuilder.create(), PartPose.offset(0.0F, -9.0F, 0.0F));
/*  81 */     PartDefinition body_r2 = Crest2.addOrReplaceChild("body_r2", 
/*  82 */         CubeListBuilder.create().texOffs(14, 23).addBox(0.0F, -3.0F, 4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 1)
/*  83 */         .addBox(0.0F, -5.0F, 3.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 29)
/*  84 */         .addBox(0.0F, -8.0F, 4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 15)
/*  85 */         .addBox(0.0F, -10.0F, 3.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
/*  86 */         .addBox(-1.5F, -6.125F, 1.375F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 2)
/*  87 */         .addBox(-2.5F, -7.75F, 1.375F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 35)
/*  88 */         .addBox(-3.0F, -9.375F, 1.375F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 33)
/*  89 */         .addBox(-3.375F, -9.5F, -2.375F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 9)
/*  90 */         .addBox(1.375F, -9.5F, -2.375F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 4)
/*  91 */         .addBox(-3.375F, -11.125F, -2.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 6)
/*  92 */         .addBox(0.375F, -11.125F, -2.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 0)
/*  93 */         .addBox(-3.0F, -11.0F, 1.375F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 41).addBox(0.0F, -11.0F, 2.0F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), 
/*     */         
/*  95 */         PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 0.1745F, 0.0F, 0.0F));
/*  96 */     PartDefinition leg0 = partdefinition.addOrReplaceChild("leg0", 
/*  97 */         CubeListBuilder.create().texOffs(28, 33).addBox(-2.0F, 4.75F, -1.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  98 */         PartPose.offset(-2.25F, 14.25F, 3.0F));
/*  99 */     PartDefinition leg1_r1 = leg0.addOrReplaceChild("leg1_r1", 
/* 100 */         CubeListBuilder.create().texOffs(40, 38).addBox(-3.25F, -3.5F, -2.0F, 3.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 101 */         PartPose.offsetAndRotation(1.75F, 3.2057F, 0.1955F, 0.3927F, 0.0F, 0.0F));
/* 102 */     PartDefinition leg1 = partdefinition.addOrReplaceChild("leg1", 
/* 103 */         CubeListBuilder.create().texOffs(12, 33).addBox(-2.0F, 4.75F, -1.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 104 */         PartPose.offset(2.25F, 14.25F, 3.0F));
/* 105 */     PartDefinition leg2_r1 = leg1.addOrReplaceChild("leg2_r1", 
/* 106 */         CubeListBuilder.create().texOffs(14, 42).addBox(1.25F, -3.5F, -2.0F, 3.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 107 */         PartPose.offsetAndRotation(-2.75F, 3.2057F, 0.1955F, 0.3927F, 0.0F, 0.0F));
/* 108 */     PartDefinition leg2 = partdefinition.addOrReplaceChild("leg2", 
/* 109 */         CubeListBuilder.create().texOffs(32, 0).addBox(-2.0F, 4.75F, -3.25F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 110 */         PartPose.offset(-2.25F, 14.25F, -3.0F));
/* 111 */     PartDefinition leg3_r1 = leg2.addOrReplaceChild("leg3_r1", 
/* 112 */         CubeListBuilder.create().texOffs(37, 21).addBox(-3.25F, -3.5F, -2.0F, 3.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 113 */         PartPose.offsetAndRotation(1.75F, 3.2057F, -0.4455F, -0.3927F, 0.0F, 0.0F));
/* 114 */     PartDefinition leg3 = partdefinition.addOrReplaceChild("leg3", 
/* 115 */         CubeListBuilder.create().texOffs(28, 12).addBox(-2.0F, 4.75F, -3.25F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 116 */         PartPose.offset(2.25F, 14.25F, -3.0F));
/* 117 */     PartDefinition leg4_r1 = leg3.addOrReplaceChild("leg4_r1", 
/* 118 */         CubeListBuilder.create().texOffs(0, 38).addBox(1.25F, -3.5F, -2.0F, 3.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 119 */         PartPose.offsetAndRotation(-2.75F, 3.2057F, -0.4455F, -0.3927F, 0.0F, 0.0F));
/* 120 */     return LayerDefinition.create(meshdefinition, 64, 64);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 126 */     this.head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 127 */     this.body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 128 */     this.leg0.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 129 */     this.leg1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 130 */     this.leg2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 131 */     this.leg3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */   
/*     */   public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
/* 135 */     this.head.yRot = netHeadYaw / 57.295776F;
/* 136 */     this.head.xRot = headPitch / 57.295776F;
/* 137 */     this.leg0.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
/* 138 */     this.leg1.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
/* 139 */     this.leg2.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
/* 140 */     this.leg3.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\client\model\ModelDark_latex_creeper.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */