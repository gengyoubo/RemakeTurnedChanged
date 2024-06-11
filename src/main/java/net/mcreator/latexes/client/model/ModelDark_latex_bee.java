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
/*     */ public class ModelDark_latex_bee<T extends Entity>
/*     */   extends EntityModel<T>
/*     */ {
/*  25 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("latex", "model_dark_latex_bee"), "main");
/*     */   public final ModelPart Head;
/*     */   public final ModelPart Body;
/*     */   public final ModelPart LeftArm;
/*     */   public final ModelPart RightArm;
/*     */   public final ModelPart LeftLeg;
/*     */   public final ModelPart RightLeg;
/*     */   
/*     */   public ModelDark_latex_bee(ModelPart root) {
/*  34 */     this.Head = root.getChild("Head");
/*  35 */     this.Body = root.getChild("Body");
/*  36 */     this.LeftArm = root.getChild("LeftArm");
/*  37 */     this.RightArm = root.getChild("RightArm");
/*  38 */     this.LeftLeg = root.getChild("LeftLeg");
/*  39 */     this.RightLeg = root.getChild("RightLeg");
/*     */   }
/*     */   
/*     */   public static LayerDefinition createBodyLayer() {
/*  43 */     MeshDefinition meshdefinition = new MeshDefinition();
/*  44 */     PartDefinition partdefinition = meshdefinition.getRoot();
/*     */     
/*  46 */     PartDefinition Head = partdefinition.addOrReplaceChild("Head", 
/*  47 */         CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 6.0F, 8.0F, new CubeDeformation(0.0F))
/*  48 */         .texOffs(18, 24).addBox(-4.0F, -2.0F, -1.0F, 8.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), 
/*  49 */         PartPose.offset(0.0F, 0.0F, 0.0F));
/*  50 */     PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1", 
/*  51 */         CubeListBuilder.create().texOffs(0, 14).addBox(3.0F, -12.0F, -2.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  52 */         PartPose.offsetAndRotation(-0.2F, -11.2403F, 2.7827F, 1.6144F, 0.0F, 0.0F));
/*  53 */     PartDefinition cube_r2 = Head.addOrReplaceChild("cube_r2", 
/*  54 */         CubeListBuilder.create().texOffs(18, 37).addBox(3.0F, -12.0F, -2.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  55 */         PartPose.offsetAndRotation(-6.8F, -11.2403F, 2.7827F, 1.6144F, 0.0F, 0.0F));
/*  56 */     PartDefinition cube_r3 = Head.addOrReplaceChild("cube_r3", 
/*  57 */         CubeListBuilder.create().texOffs(18, 24).addBox(3.0F, -12.0F, -2.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  58 */         PartPose.offsetAndRotation(-6.8F, 0.0F, 1.7F, 0.5236F, 0.0F, 0.0F));
/*  59 */     PartDefinition cube_r4 = Head.addOrReplaceChild("cube_r4", 
/*  60 */         CubeListBuilder.create().texOffs(22, 37).addBox(3.0F, -12.0F, -0.3F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  61 */         PartPose.offsetAndRotation(-0.2F, 1.0F, 0.2F, 0.5236F, 0.0F, 0.0F));
/*  62 */     PartDefinition cube_r5 = Head.addOrReplaceChild("cube_r5", 
/*  63 */         CubeListBuilder.create().texOffs(48, 0).addBox(-4.0F, -2.0F, -4.0F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), 
/*  64 */         PartPose.offsetAndRotation(-0.1895F, 0.341F, 0.0F, 0.0F, 0.0F, 0.0873F));
/*  65 */     PartDefinition cube_r6 = Head.addOrReplaceChild("cube_r6", 
/*  66 */         CubeListBuilder.create().texOffs(48, 9).addBox(0.0F, -2.0F, -4.0F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), 
/*  67 */         PartPose.offsetAndRotation(0.1895F, 0.341F, 0.0F, 0.0F, 0.0F, -0.0873F));
/*  68 */     PartDefinition Mask = Head.addOrReplaceChild("Mask", 
/*  69 */         CubeListBuilder.create().texOffs(36, 31).addBox(-4.0F, -5.0F, -4.5F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(26, 19)
/*  70 */         .addBox(-3.0F, -3.0F, -4.5F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(36, 20)
/*  71 */         .addBox(-1.0F, -5.0F, -4.5F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(26, 14)
/*  72 */         .addBox(3.0F, -5.0F, -4.5F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(32, 8)
/*  73 */         .addBox(-5.0F, -6.0F, -4.5F, 10.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 7)
/*  74 */         .addBox(-2.0F, -7.0F, -4.5F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), 
/*  75 */         PartPose.offset(0.0F, 0.0F, 0.0F));
/*  76 */     PartDefinition Body = partdefinition.addOrReplaceChild("Body", 
/*  77 */         CubeListBuilder.create().texOffs(28, 10).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 14)
/*  78 */         .addBox(-5.0F, -1.0F, -3.0F, 10.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(39, 19)
/*  79 */         .addBox(-3.0F, 5.0F, -2.0F, 6.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(24, 0)
/*  80 */         .addBox(-4.0F, 8.0F, -2.0F, 8.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  81 */         PartPose.offset(0.0F, 0.0F, 0.0F));
/*  82 */     PartDefinition Wings = Body.addOrReplaceChild("Wings", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
/*  83 */     PartDefinition cube_r7 = Wings.addOrReplaceChild("cube_r7", 
/*  84 */         CubeListBuilder.create().texOffs(0, 31).addBox(-10.3F, 2.5F, 1.4F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(18, 31)
/*  85 */         .addBox(-7.3F, 1.5F, 1.4F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(6, 6)
/*  86 */         .addBox(-4.3F, 0.5F, 1.4F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 37)
/*  87 */         .addBox(-3.3F, 3.5F, 1.4F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(6, 0)
/*  88 */         .addBox(-4.3F, 1.5F, 1.4F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(4, 14)
/*  89 */         .addBox(-5.3F, 2.5F, 1.4F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(14, 37)
/*  90 */         .addBox(-7.3F, 2.5F, 1.4F, 2.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
/*  91 */         .addBox(-10.3F, 3.5F, 1.4F, 3.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(6, 24).addBox(-11.3F, 3.5F, 1.4F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), 
/*     */         
/*  93 */         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));
/*  94 */     PartDefinition cube_r8 = Wings.addOrReplaceChild("cube_r8", 
/*  95 */         CubeListBuilder.create().texOffs(0, 24).addBox(7.3F, 2.5F, 1.4F, 3.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(32, 23)
/*  96 */         .addBox(4.3F, 1.5F, 1.4F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 19)
/*  97 */         .addBox(3.3F, 0.5F, 1.4F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(2, 37)
/*  98 */         .addBox(2.3F, 3.5F, 1.4F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(42, 50)
/*  99 */         .addBox(3.3F, 1.5F, 1.4F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(44, 50)
/* 100 */         .addBox(4.3F, 2.5F, 1.4F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(40, 37)
/* 101 */         .addBox(5.3F, 2.5F, 1.4F, 2.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(32, 9)
/* 102 */         .addBox(7.3F, 9.5F, 1.4F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(46, 50).addBox(10.3F, 3.5F, 1.4F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), 
/*     */         
/* 104 */         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));
/* 105 */     PartDefinition Tail = Body.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
/* 106 */     PartDefinition cube_r9 = Tail.addOrReplaceChild("cube_r9", 
/* 107 */         CubeListBuilder.create().texOffs(0, 24).addBox(-2.5F, 7.0F, 4.75F, 5.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(32, 20)
/* 108 */         .addBox(-0.5F, 9.0F, 12.75F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), 
/* 109 */         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 110 */     PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", 
/* 111 */         CubeListBuilder.create().texOffs(0, 37).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 112 */         PartPose.offset(-5.0F, 2.0F, 0.0F));
/* 113 */     PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", 
/* 114 */         CubeListBuilder.create().texOffs(26, 31).addBox(-1.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 115 */         PartPose.offset(5.0F, 2.0F, 0.0F));
/* 116 */     PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", 
/* 117 */         CubeListBuilder.create().texOffs(40, 27).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F))
/* 118 */         .texOffs(28, 47).addBox(-1.0F, 6.0F, -2.0F, 3.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 119 */         PartPose.offset(-2.0F, 12.0F, 0.0F));
/* 120 */     PartDefinition cube_r10 = LeftLeg.addOrReplaceChild("cube_r10", 
/* 121 */         CubeListBuilder.create().texOffs(24, 0).addBox(0.0F, 4.0F, 3.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 122 */         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/*     */     
/* 124 */     PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", 
/* 125 */         CubeListBuilder.create().texOffs(40, 40).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F))
/* 126 */         .texOffs(14, 43).addBox(-2.0F, 6.0F, -2.0F, 3.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 127 */         PartPose.offset(2.0F, 12.0F, 0.0F));
/* 128 */     PartDefinition cube_r11 = RightLeg.addOrReplaceChild("cube_r11", 
/* 129 */         CubeListBuilder.create().texOffs(26, 31).addBox(-1.0F, 4.0F, 3.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 130 */         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 131 */     return LayerDefinition.create(meshdefinition, 64, 64);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 137 */     this.Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 138 */     this.Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 139 */     this.LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 140 */     this.RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 141 */     this.LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 142 */     this.RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */   
/*     */   public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
/* 146 */     this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + 3.1415927F) * limbSwingAmount;
/* 147 */     this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
/* 148 */     this.Head.yRot = netHeadYaw / 57.295776F;
/* 149 */     this.Head.xRot = headPitch / 57.295776F;
/* 150 */     this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
/* 151 */     this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\client\model\ModelDark_latex_bee.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */