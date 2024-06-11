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
/*     */ import net.minecraft.world.entity.Entity;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Modelhertx_model_fb_sit<T extends Entity>
/*     */   extends EntityModel<T>
/*     */ {
/*  24 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("latex", "modelhertx_model_fb_sit"), "main");
/*     */   public final ModelPart Head;
/*     */   public final ModelPart Body;
/*     */   public final ModelPart Tail;
/*     */   public final ModelPart LeftArm;
/*     */   public final ModelPart RightArm;
/*     */   public final ModelPart LeftLeg;
/*     */   public final ModelPart RightLeg;
/*     */   
/*     */   public Modelhertx_model_fb_sit(ModelPart root) {
/*  34 */     this.Head = root.getChild("Head");
/*  35 */     this.Body = root.getChild("Body");
/*  36 */     this.Tail = root.getChild("Tail");
/*  37 */     this.LeftArm = root.getChild("LeftArm");
/*  38 */     this.RightArm = root.getChild("RightArm");
/*  39 */     this.LeftLeg = root.getChild("LeftLeg");
/*  40 */     this.RightLeg = root.getChild("RightLeg");
/*     */   }
/*     */   
/*     */   public static LayerDefinition createBodyLayer() {
/*  44 */     MeshDefinition meshdefinition = new MeshDefinition();
/*  45 */     PartDefinition partdefinition = meshdefinition.getRoot();
/*  46 */     PartDefinition Head = partdefinition.addOrReplaceChild("Head", 
/*  47 */         CubeListBuilder.create().texOffs(15, 13).addBox(-3.0F, -1.675F, -5.075F, 6.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(52, 41)
/*  48 */         .addBox(-2.0F, -2.775F, -3.075F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(58, 47)
/*  49 */         .addBox(-2.0F, -6.775F, 1.925F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 7)
/*  50 */         .addBox(-2.0F, -2.775F, 2.925F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 3)
/*  51 */         .addBox(-3.0F, -2.775F, 1.925F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 0)
/*  52 */         .addBox(-2.5F, -0.775F, -2.475F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 17)
/*  53 */         .addBox(2.0F, -6.775F, 1.925F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(5, 16)
/*  54 */         .addBox(-3.0F, -6.775F, 1.925F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 27)
/*  55 */         .addBox(-3.0F, -6.775F, -3.075F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(41, 57)
/*  56 */         .addBox(2.0F, -5.775F, -4.075F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(49, 50)
/*  57 */         .addBox(2.0F, -2.675F, -5.075F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 56)
/*  58 */         .addBox(-3.0F, -5.775F, -4.075F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(53, 0)
/*  59 */         .addBox(-3.0F, -4.775F, -5.075F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 46)
/*  60 */         .addBox(-3.0F, -2.675F, -5.075F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(58, 54)
/*  61 */         .addBox(-2.0F, -5.775F, -5.075F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 25)
/*  62 */         .addBox(-2.0F, -6.775F, -4.075F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 25)
/*  63 */         .addBox(-2.0F, -2.675F, -5.075F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  64 */         PartPose.offset(0.0F, 4.125F, 1.5F));
/*  65 */     PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1", 
/*  66 */         CubeListBuilder.create().texOffs(15, 15).addBox(-3.0F, -1.8601F, 6.7623F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
/*  67 */         .addBox(-3.0F, -1.8601F, 8.7623F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 27)
/*  68 */         .addBox(-3.0F, -1.8601F, 2.7623F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 13)
/*  69 */         .addBox(2.0F, -1.8601F, 6.7623F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 2)
/*  70 */         .addBox(2.0F, -1.8601F, 8.7623F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
/*  71 */         .addBox(2.0F, -1.8601F, 2.7623F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  72 */         PartPose.offsetAndRotation(0.0F, -3.725F, -0.075F, 0.2618F, 0.0F, 0.0F));
/*  73 */     PartDefinition Body = partdefinition.addOrReplaceChild("Body", 
/*  74 */         CubeListBuilder.create().texOffs(26, 8).addBox(-4.0F, 10.9265F, -1.6411F, 8.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 0)
/*  75 */         .addBox(-3.5F, 6.9265F, -1.6411F, 7.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(20, 21)
/*  76 */         .addBox(-4.0F, -0.0735F, -1.6411F, 8.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(55, 58)
/*  77 */         .addBox(-3.5F, -0.261F, -2.3911F, 7.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(15, 13)
/*  78 */         .addBox(-1.0F, 5.739F, -1.9536F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 8).addBox(-3.0F, 4.739F, -2.1411F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*     */         
/*  80 */         PartPose.offsetAndRotation(0.0F, 4.125F, 1.5F, -0.1309F, 0.0F, 0.0F));
/*  81 */     PartDefinition Tail = partdefinition.addOrReplaceChild("Tail", CubeListBuilder.create(), 
/*  82 */         PartPose.offsetAndRotation(0.0F, 15.0F, 1.0F, 0.6545F, 0.0F, 0.0F));
/*  83 */     PartDefinition cube_r2 = Tail.addOrReplaceChild("cube_r2", CubeListBuilder.create(), 
/*  84 */         PartPose.offsetAndRotation(0.0F, -13.3689F, 23.8592F, -1.1781F, 0.0F, 0.0F));
/*  85 */     PartDefinition cube_r2_r1 = cube_r2.addOrReplaceChild("cube_r2_r1", 
/*  86 */         CubeListBuilder.create().texOffs(0, 13).addBox(-1.3F, -0.1297F, 36.5872F, 3.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), 
/*  87 */         PartPose.offsetAndRotation(0.0F, 40.8187F, -20.2444F, 0.5236F, 0.0F, 0.0F));
/*  88 */     PartDefinition cube_r3 = Tail.addOrReplaceChild("cube_r3", 
/*  89 */         CubeListBuilder.create().texOffs(0, 0).addBox(-1.3F, 10.1852F, 7.174F, 3.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)), 
/*  90 */         PartPose.offsetAndRotation(0.0F, -13.3689F, 2.8592F, -0.7854F, 0.0F, 0.0F));
/*  91 */     PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", 
/*  92 */         CubeListBuilder.create().texOffs(42, 45).addBox(-1.8228F, -2.0604F, -2.25F, 3.0F, 8.0F, 4.0F, new CubeDeformation(0.0F))
/*  93 */         .texOffs(41, 13).addBox(-2.8228F, 5.9396F, -2.25F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 0)
/*  94 */         .addBox(-2.8228F, 12.9396F, 0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 2)
/*  95 */         .addBox(-2.8228F, 12.9396F, -2.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 0)
/*  96 */         .addBox(-0.8228F, 12.9396F, -2.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 13)
/*  97 */         .addBox(-2.8228F, 12.9396F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  98 */         PartPose.offsetAndRotation(-5.0F, 6.25F, 2.0F, 0.0F, 0.0F, 0.0873F));
/*  99 */     PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", 
/* 100 */         CubeListBuilder.create().texOffs(28, 45).addBox(-1.2397F, -2.0604F, -2.25F, 3.0F, 8.0F, 4.0F, new CubeDeformation(0.0F))
/* 101 */         .texOffs(34, 34).addBox(-1.2397F, 5.9396F, -2.25F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 2)
/* 102 */         .addBox(-0.2397F, 12.9396F, -2.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 27)
/* 103 */         .addBox(1.7603F, 12.9396F, -2.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 10)
/* 104 */         .addBox(1.7603F, 12.9396F, -2.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 29)
/* 105 */         .addBox(1.7603F, 12.9396F, -2.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 106 */         PartPose.offsetAndRotation(5.0F, 6.25F, 2.0F, 0.0F, 0.0F, -0.0873F));
/* 107 */     PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", 
/* 108 */         CubeListBuilder.create().texOffs(57, 13).addBox(-2.0319F, -1.042F, -2.0541F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 109 */         PartPose.offsetAndRotation(-2.0F, 17.0F, 0.0F, -0.2164F, 0.0283F, 0.1278F));
/* 110 */     PartDefinition LeftLeg_r1 = LeftLeg.addOrReplaceChild("LeftLeg_r1", 
/* 111 */         CubeListBuilder.create().texOffs(50, 34).addBox(-3.2648F, -7.2043F, -7.6956F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 112 */         PartPose.offsetAndRotation(1.1705F, -6.3463F, 10.542F, 2.618F, 0.0F, 0.0F));
/* 113 */     PartDefinition cube_r4 = LeftLeg.addOrReplaceChild("cube_r4", CubeListBuilder.create(), 
/* 114 */         PartPose.offsetAndRotation(-0.9545F, -4.7756F, -1.5151F, -0.3927F, 0.0F, 0.0F));
/* 115 */     PartDefinition cube_r4_r1 = cube_r4.addOrReplaceChild("cube_r4_r1", 
/* 116 */         CubeListBuilder.create().texOffs(27, 57).addBox(-3.2023F, -7.6768F, -3.4127F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 117 */         PartPose.offsetAndRotation(2.0625F, -1.9018F, 13.6106F, 2.2253F, 0.0F, 0.0F));
/* 118 */     PartDefinition cube_r5 = LeftLeg.addOrReplaceChild("cube_r5", CubeListBuilder.create(), 
/* 119 */         PartPose.offsetAndRotation(-0.9545F, -4.7756F, -1.5151F, 1.5708F, 0.0F, 0.0F));
/* 120 */     PartDefinition cube_r5_r1 = cube_r5.addOrReplaceChild("cube_r5_r1", 
/* 121 */         CubeListBuilder.create().texOffs(0, 33).addBox(-3.1398F, -16.3407F, -14.2647F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 122 */         PartPose.offsetAndRotation(2.0F, 10.6954F, 7.2207F, 0.3927F, 0.0F, 0.0F));
/* 123 */     PartDefinition cube_r6 = LeftLeg.addOrReplaceChild("cube_r6", 
/* 124 */         CubeListBuilder.create().texOffs(44, 24).addBox(-1.1398F, 4.8772F, 1.6501F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 125 */         PartPose.offsetAndRotation(-0.9545F, -4.7756F, -1.5151F, -0.3927F, 0.0F, 0.0F));
/* 126 */     PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", 
/* 127 */         CubeListBuilder.create().texOffs(56, 20).addBox(-1.9681F, -1.042F, -2.0541F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 128 */         PartPose.offsetAndRotation(2.0F, 17.0F, 0.0F, -0.2164F, -0.0283F, -0.1278F));
/* 129 */     PartDefinition RightLeg_r1 = RightLeg.addOrReplaceChild("RightLeg_r1", 
/* 130 */         CubeListBuilder.create().texOffs(50, 6).addBox(-0.7352F, -6.9278F, -7.4422F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 131 */         PartPose.offsetAndRotation(-1.1705F, -5.9801F, 10.6232F, 2.618F, 0.0F, 0.0F));
/* 132 */     PartDefinition cube_r7 = RightLeg.addOrReplaceChild("cube_r7", CubeListBuilder.create(), 
/* 133 */         PartPose.offsetAndRotation(0.9545F, -4.7756F, -1.5151F, -0.3927F, 0.0F, 0.0F));
/* 134 */     PartDefinition cube_r7_r1 = cube_r7.addOrReplaceChild("cube_r7_r1", 
/* 135 */         CubeListBuilder.create().texOffs(13, 53).addBox(-0.7977F, -9.5183F, -3.0729F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 136 */         PartPose.offsetAndRotation(-2.0625F, -2.7532F, 15.2784F, 2.2253F, 0.0F, 0.0F));
/* 137 */     PartDefinition cube_r8 = RightLeg.addOrReplaceChild("cube_r8", 
/* 138 */         CubeListBuilder.create().texOffs(18, 32).addBox(-2.8602F, -3.6961F, -11.6865F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 139 */         PartPose.offsetAndRotation(0.9545F, -4.7756F, -1.5151F, 1.9635F, 0.0F, 0.0F));
/* 140 */     PartDefinition cube_r9 = RightLeg.addOrReplaceChild("cube_r9", 
/* 141 */         CubeListBuilder.create().texOffs(12, 43).addBox(-2.8602F, 4.8772F, 1.6501F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 142 */         PartPose.offsetAndRotation(0.9545F, -4.7756F, -1.5151F, -0.3927F, 0.0F, 0.0F));
/* 143 */     return LayerDefinition.create(meshdefinition, 128, 128);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 149 */     this.Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 150 */     this.Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 151 */     this.Tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 152 */     this.LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 153 */     this.RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 154 */     this.LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 155 */     this.RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */   
/*     */   public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
/* 159 */     this.Head.yRot = netHeadYaw / 57.295776F;
/* 160 */     this.Head.xRot = headPitch / 57.295776F;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\client\model\Modelhertx_model_fb_sit.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */