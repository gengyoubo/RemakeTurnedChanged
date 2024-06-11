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
/*     */ public class Modelhertx_model_wait_s1<T extends Entity>
/*     */   extends EntityModel<T>
/*     */ {
/*  24 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("latex", "modelhertx_model_wait_s_1"), "main");
/*     */   
/*     */   public final ModelPart Head;
/*     */   public final ModelPart Body;
/*     */   public final ModelPart Tail;
/*     */   public final ModelPart LeftArm;
/*     */   public final ModelPart RightArm;
/*     */   public final ModelPart LeftLeg;
/*     */   public final ModelPart RightLeg;
/*     */   
/*     */   public Modelhertx_model_wait_s1(ModelPart root) {
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
/*  90 */     PartDefinition Tail = partdefinition.addOrReplaceChild("Tail", CubeListBuilder.create(), 
/*  91 */         PartPose.offsetAndRotation(0.0F, 9.0F, 0.0F, -0.2618F, 0.0F, 0.0F));
/*  92 */     PartDefinition cube_r2 = Tail.addOrReplaceChild("cube_r2", CubeListBuilder.create(), 
/*  93 */         PartPose.offsetAndRotation(0.0F, -9.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/*  94 */     PartDefinition cube_r3 = Tail.addOrReplaceChild("cube_r3", 
/*  95 */         CubeListBuilder.create().texOffs(0, 28).addBox(-1.3F, 4.2F, 7.0F, 3.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(22, 30)
/*  96 */         .addBox(-1.3F, 5.2F, 15.0F, 3.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), 
/*  97 */         PartPose.offsetAndRotation(0.0F, -9.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
/*  98 */     PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", 
/*  99 */         CubeListBuilder.create().texOffs(0, 39).addBox(-3.0F, -3.8F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(45, 3)
/* 100 */         .addBox(-3.25F, -4.05F, -2.5F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 101 */         PartPose.offsetAndRotation(-4.25F, 2.375F, -2.0F, -0.7734F, -0.1536F, -0.1555F));
/* 102 */     PartDefinition bone2 = LeftArm.addOrReplaceChild("bone2", 
/* 103 */         CubeListBuilder.create().texOffs(54, 11).addBox(5.2918F, -2.6603F, -1.7F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 39)
/* 104 */         .addBox(5.2918F, 3.3397F, 1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 39)
/* 105 */         .addBox(5.2918F, 3.3397F, -1.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 39)
/* 106 */         .addBox(7.2918F, 3.3397F, -1.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 27).addBox(5.2918F, 3.3397F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*     */         
/* 108 */         PartPose.offsetAndRotation(-1.8F, 10.0F, -0.3F, 0.0F, 0.0F, -1.309F));
/* 109 */     PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", 
/* 110 */         CubeListBuilder.create().texOffs(41, 17).addBox(-0.75F, -4.05F, -2.5F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(38, 38)
/* 111 */         .addBox(-1.0F, -3.8F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 112 */         PartPose.offsetAndRotation(4.25F, 2.125F, -2.0F, -0.7777F, 0.1231F, 0.124F));
/* 113 */     PartDefinition bone3 = RightArm.addOrReplaceChild("bone3", 
/* 114 */         CubeListBuilder.create().texOffs(44, 50).addBox(-13.2516F, -17.1828F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F))
/* 115 */         .texOffs(35, 35).addBox(-12.2516F, -11.1828F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 35)
/* 116 */         .addBox(-10.2516F, -11.1828F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(25, 34)
/* 117 */         .addBox(-10.2516F, -11.1828F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 33)
/* 118 */         .addBox(-10.2516F, -11.1828F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 119 */         PartPose.offsetAndRotation(-5.0F, 22.0F, 0.0F, 0.0F, 0.0F, 0.9163F));
/* 120 */     PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", 
/* 121 */         CubeListBuilder.create().texOffs(66, 8).addBox(-2.0F, -1.8F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
/* 122 */         .addBox(-1.625F, -1.8F, 1.75F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 40).addBox(-2.0F, 10.0F, -2.9102F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), 
/*     */         
/* 124 */         PartPose.offsetAndRotation(-2.0F, 12.0F, 0.0F, 0.0F, 0.0F, 0.0436F));
/* 125 */     PartDefinition cube_r4 = LeftLeg.addOrReplaceChild("cube_r4", 
/* 126 */         CubeListBuilder.create().texOffs(67, 36).addBox(-2.0F, 4.3F, 3.0F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 127 */         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 128 */     PartDefinition cube_r5 = LeftLeg.addOrReplaceChild("cube_r5", 
/* 129 */         CubeListBuilder.create().texOffs(39, 26).addBox(-2.0F, 0.0F, -5.8F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 130 */         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
/* 131 */     PartDefinition cube_r6 = LeftLeg.addOrReplaceChild("cube_r6", 
/* 132 */         CubeListBuilder.create().texOffs(28, 50).addBox(-2.0F, -0.6F, -2.2F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 133 */         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 134 */     PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", 
/* 135 */         CubeListBuilder.create().texOffs(64, 53).addBox(-2.0F, -1.8F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(54, 21)
/* 136 */         .addBox(-2.0F, 10.0F, -2.9102F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 137 */         PartPose.offsetAndRotation(2.0F, 12.0F, 0.0F, 0.0F, 0.0F, -0.0436F));
/* 138 */     PartDefinition cube_r7 = RightLeg.addOrReplaceChild("cube_r7", 
/* 139 */         CubeListBuilder.create().texOffs(65, 65).addBox(-2.0F, 4.3F, 3.0F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 140 */         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 141 */     PartDefinition cube_r8 = RightLeg.addOrReplaceChild("cube_r8", 
/* 142 */         CubeListBuilder.create().texOffs(16, 39).addBox(-2.0F, 0.0F, -5.8F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 143 */         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
/* 144 */     PartDefinition cube_r9 = RightLeg.addOrReplaceChild("cube_r9", 
/* 145 */         CubeListBuilder.create().texOffs(12, 50).addBox(-2.0F, -0.6F, -2.2F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 146 */         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 147 */     return LayerDefinition.create(meshdefinition, 128, 128);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 153 */     this.Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 154 */     this.Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 155 */     this.Tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 156 */     this.LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 157 */     this.RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 158 */     this.LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 159 */     this.RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */   
/*     */   public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
/* 163 */     this.Head.yRot = netHeadYaw / 57.295776F;
/* 164 */     this.Head.xRot = headPitch / 57.295776F;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\client\model\Modelhertx_model_wait_s1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */