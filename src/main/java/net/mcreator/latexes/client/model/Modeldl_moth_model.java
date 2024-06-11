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
/*     */ public class Modeldl_moth_model<T extends Entity>
/*     */   extends EntityModel<T>
/*     */ {
/*  25 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("latex", "modeldl_moth_model"), "main");
/*     */   public final ModelPart Head;
/*     */   public final ModelPart Body;
/*     */   public final ModelPart LeftArm;
/*     */   public final ModelPart RightArm;
/*     */   public final ModelPart LeftLeg;
/*     */   public final ModelPart RightLeg;
/*     */   
/*     */   public Modeldl_moth_model(ModelPart root) {
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
/*  45 */     PartDefinition Head = partdefinition.addOrReplaceChild("Head", 
/*  46 */         CubeListBuilder.create().texOffs(22, 0).addBox(-4.5F, -2.25F, -2.7F, 9.0F, 4.0F, 6.0F, new CubeDeformation(0.0F))
/*  47 */         .texOffs(27, 10).addBox(-3.0F, -6.0F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), 
/*  48 */         PartPose.offset(0.0F, -2.0F, 0.0F));
/*  49 */     PartDefinition bone4 = Head.addOrReplaceChild("bone4", 
/*  50 */         CubeListBuilder.create().texOffs(38, 42).addBox(-2.0F, -7.0F, -2.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(36, 29)
/*  51 */         .addBox(-3.0F, -6.0F, -2.0F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(24, 29)
/*  52 */         .addBox(-3.0F, -3.0F, -2.0F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
/*  53 */         .addBox(-1.0F, -5.0F, -2.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(2, 2)
/*  54 */         .addBox(-4.0F, -5.0F, -2.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 2)
/*  55 */         .addBox(3.0F, -5.0F, -2.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), 
/*  56 */         PartPose.offset(0.0F, 1.0F, -1.25F));
/*  57 */     PartDefinition bone8 = Head.addOrReplaceChild("bone8", 
/*  58 */         CubeListBuilder.create().texOffs(56, 47).addBox(-4.0F, -6.0F, 1.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(59, 59)
/*  59 */         .addBox(2.0F, -6.0F, 1.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 5)
/*  60 */         .addBox(2.0F, -7.0F, 1.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-4.0F, -7.0F, 1.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), 
/*     */         
/*  62 */         PartPose.offsetAndRotation(0.5F, 1.25F, 2.0F, 0.3927F, 0.0F, 0.0F));
/*  63 */     PartDefinition Body = partdefinition.addOrReplaceChild("Body", 
/*  64 */         CubeListBuilder.create().texOffs(30, 30).addBox(-4.0F, 1.0F, -2.0F, 8.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(30, 22)
/*  65 */         .addBox(-4.0F, 9.0F, -2.0F, 8.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(46, 0)
/*  66 */         .addBox(-3.5F, 7.0F, -1.5F, 7.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 26)
/*  67 */         .addBox(-4.5F, 2.0F, -3.0F, 9.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
/*  68 */         .addBox(-5.0F, -1.0F, -3.5F, 10.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), 
/*  69 */         PartPose.offset(0.0F, -2.0F, 0.0F));
/*  70 */     PartDefinition BREAAAAAAAAAAAAAASTS = Body.addOrReplaceChild("BREAAAAAAAAAAAAAASTS", 
/*  71 */         CubeListBuilder.create().texOffs(48, 6).addBox(-3.5F, -3.7073F, -3.7495F, 7.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  72 */         PartPose.offsetAndRotation(0.0F, 3.5F, 0.5F, 1.1781F, 0.0F, 0.0F));
/*  73 */     PartDefinition Tail = Body.addOrReplaceChild("Tail", 
/*  74 */         CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -1.8394F, 1.2472F, 6.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(65, 47)
/*  75 */         .addBox(-2.5F, -1.3394F, 11.2472F, 5.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), 
/*  76 */         PartPose.offsetAndRotation(0.0F, 9.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/*  77 */     PartDefinition Wings = Body.addOrReplaceChild("Wings", CubeListBuilder.create(), PartPose.offset(0.0F, 3.0F, 1.5F));
/*  78 */     PartDefinition LeftWing = Wings.addOrReplaceChild("LeftWing", CubeListBuilder.create(), 
/*  79 */         PartPose.offsetAndRotation(9.0F, -2.0F, 4.0F, 0.0F, -0.3927F, 0.0F));
/*  80 */     PartDefinition bone = LeftWing.addOrReplaceChild("bone", 
/*  81 */         CubeListBuilder.create().texOffs(14, 35).addBox(-1.0F, -6.0F, -1.0F, 5.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(10, 54)
/*  82 */         .addBox(-4.0F, -6.0F, -1.0F, 3.0F, 16.0F, 2.0F, new CubeDeformation(0.0F)), 
/*  83 */         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.9635F));
/*  84 */     PartDefinition bone3 = LeftWing.addOrReplaceChild("bone3", 
/*  85 */         CubeListBuilder.create().texOffs(63, 14).addBox(-5.0F, -7.0F, -0.5F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 40)
/*  86 */         .addBox(-3.0F, -8.0F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(66, 3).addBox(-9.0F, -6.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), 
/*     */         
/*  88 */         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5708F));
/*  89 */     PartDefinition bone2 = LeftWing.addOrReplaceChild("bone2", 
/*  90 */         CubeListBuilder.create().texOffs(32, 57).addBox(-8.0F, -5.0F, -1.0F, 4.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(52, 66)
/*  91 */         .addBox(-10.0F, -5.0F, -1.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), 
/*  92 */         PartPose.offsetAndRotation(2.0F, 2.0F, 0.0F, 0.0F, 0.0F, -1.1781F));
/*  93 */     PartDefinition Rightwing = Wings.addOrReplaceChild("Rightwing", CubeListBuilder.create(), 
/*  94 */         PartPose.offsetAndRotation(-9.0F, -2.0F, 4.0F, 0.0F, 0.3927F, 0.0F));
/*  95 */     PartDefinition bone5 = Rightwing.addOrReplaceChild("bone5", 
/*  96 */         CubeListBuilder.create().texOffs(0, 35).addBox(-4.0F, -6.0F, -1.0F, 5.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 54)
/*  97 */         .addBox(1.0F, -6.0F, -1.0F, 3.0F, 16.0F, 2.0F, new CubeDeformation(0.0F)), 
/*  98 */         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.9635F));
/*  99 */     PartDefinition bone6 = Rightwing.addOrReplaceChild("bone6", 
/* 100 */         CubeListBuilder.create().texOffs(62, 55).addBox(-1.0F, -7.0F, -0.5F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 30)
/* 101 */         .addBox(0.0F, -8.0F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(63, 0).addBox(5.0F, -6.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), 
/*     */         
/* 103 */         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5708F));
/* 104 */     PartDefinition bone7 = Rightwing.addOrReplaceChild("bone7", 
/* 105 */         CubeListBuilder.create().texOffs(20, 57).addBox(4.0F, -5.0F, -1.0F, 4.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 59)
/* 106 */         .addBox(8.0F, -5.0F, -1.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), 
/* 107 */         PartPose.offsetAndRotation(-2.0F, 2.0F, 0.0F, 0.0F, 0.0F, 1.1781F));
/* 108 */     PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", 
/* 109 */         CubeListBuilder.create().texOffs(42, 42).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 110 */         PartPose.offset(-5.0F, 1.0F, 0.0F));
/* 111 */     PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", 
/* 112 */         CubeListBuilder.create().texOffs(28, 40).addBox(-1.0F, -2.0F, -2.0F, 3.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 113 */         PartPose.offset(5.0F, 1.0F, 0.0F));
/* 114 */     PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", 
/* 115 */         CubeListBuilder.create().texOffs(54, 25).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F))
/* 116 */         .texOffs(56, 36).addBox(-1.0F, 6.0F, -2.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 117 */         PartPose.offset(-2.0F, 11.0F, 0.0F));
/*     */     
/* 119 */     PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", 
/* 120 */         CubeListBuilder.create().texOffs(51, 14).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F))
/* 121 */         .texOffs(52, 55).addBox(-2.0F, 6.0F, -2.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 122 */         PartPose.offset(2.0F, 11.0F, 0.0F));
/* 123 */     return LayerDefinition.create(meshdefinition, 128, 128);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 129 */     this.Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 130 */     this.Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 131 */     this.LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 132 */     this.RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 133 */     this.LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 134 */     this.RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */   
/*     */   public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
/* 138 */     this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + 3.1415927F) * limbSwingAmount;
/* 139 */     this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
/* 140 */     this.Head.yRot = netHeadYaw / 57.295776F;
/* 141 */     this.Head.xRot = headPitch / 57.295776F;
/* 142 */     this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
/* 143 */     this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\client\model\Modeldl_moth_model.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */