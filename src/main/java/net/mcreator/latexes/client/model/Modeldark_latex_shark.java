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
/*     */ public class Modeldark_latex_shark<T extends Entity>
/*     */   extends EntityModel<T>
/*     */ {
/*  25 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("latex", "modeldark_latex_shark"), "main");
/*     */   public final ModelPart head;
/*     */   public final ModelPart body;
/*     */   public final ModelPart leftArm;
/*     */   public final ModelPart rightArm;
/*     */   public final ModelPart leftLeg;
/*     */   public final ModelPart rightLeg;
/*     */   
/*     */   public Modeldark_latex_shark(ModelPart root) {
/*  34 */     this.head = root.getChild("head");
/*  35 */     this.body = root.getChild("body");
/*  36 */     this.leftArm = root.getChild("leftArm");
/*  37 */     this.rightArm = root.getChild("rightArm");
/*  38 */     this.leftLeg = root.getChild("leftLeg");
/*  39 */     this.rightLeg = root.getChild("rightLeg");
/*     */   }
/*     */   
/*     */   public static LayerDefinition createBodyLayer() {
/*  43 */     MeshDefinition meshdefinition = new MeshDefinition();
/*  44 */     PartDefinition partdefinition = meshdefinition.getRoot();
/*  45 */     PartDefinition head = partdefinition.addOrReplaceChild("head", 
/*  46 */         CubeListBuilder.create().texOffs(0, 16).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), 
/*  47 */         PartPose.offset(0.0F, 0.0F, 0.0F));
/*  48 */     PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1", 
/*  49 */         CubeListBuilder.create().texOffs(16, 49).addBox(-4.8F, -5.4F, 8.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 47)
/*  50 */         .addBox(2.8F, -5.4F, 8.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 47)
/*  51 */         .addBox(-4.8F, -5.4F, 2.0F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(50, 45).addBox(2.8F, -5.4F, 2.0F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), 
/*     */         
/*  53 */         PartPose.offsetAndRotation(0.5F, 0.0F, 0.0F, 0.3927F, 0.0F, 0.0F));
/*  54 */     PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2", 
/*  55 */         CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -7.65F, 2.25F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(36, 35)
/*  56 */         .addBox(0.0F, -5.65F, 9.25F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 51).addBox(0.0F, -6.65F, 3.25F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), 
/*     */         
/*  58 */         PartPose.offsetAndRotation(-0.5F, 0.0F, -2.5F, 0.3927F, 0.0F, 0.0F));
/*  59 */     PartDefinition cube_r3 = head.addOrReplaceChild("cube_r3", 
/*  60 */         CubeListBuilder.create().texOffs(0, 22).addBox(0.0F, -5.9F, 8.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  61 */         PartPose.offsetAndRotation(-0.5F, 0.246F, 0.1726F, 0.3927F, 0.0F, 0.0F));
/*  62 */     PartDefinition cube_r4 = head.addOrReplaceChild("cube_r4", 
/*  63 */         CubeListBuilder.create().texOffs(4, 22).addBox(-5.1F, -2.1F, 2.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 54)
/*  64 */         .addBox(-5.1F, -2.1F, -1.9F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  65 */         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));
/*  66 */     PartDefinition cube_r5 = head.addOrReplaceChild("cube_r5", 
/*  67 */         CubeListBuilder.create().texOffs(24, 22).addBox(4.1F, -2.1F, 2.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 17)
/*  68 */         .addBox(3.1F, -2.1F, -1.9F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  69 */         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));
/*  70 */     PartDefinition mask = head.addOrReplaceChild("mask", 
/*  71 */         CubeListBuilder.create().texOffs(21, 12).addBox(-5.0F, -4.0F, -4.1F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 11)
/*  72 */         .addBox(-3.0F, -3.0F, -4.1F, 6.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(10, 6)
/*  73 */         .addBox(-2.0F, -1.0F, -4.1F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(10, 7)
/*  74 */         .addBox(1.0F, -1.0F, -4.1F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(29, 12)
/*  75 */         .addBox(3.0F, -4.0F, -4.1F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 7)
/*  76 */         .addBox(3.0F, -5.0F, -4.1F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(21, 9)
/*  77 */         .addBox(-2.0F, -5.0F, -4.1F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(21, 8)
/*  78 */         .addBox(-2.0F, -7.0F, -4.1F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(21, 11)
/*  79 */         .addBox(-3.0F, -6.0F, -4.1F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(25, 12)
/*  80 */         .addBox(-1.0F, -8.0F, -4.1F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(3, 0)
/*  81 */         .addBox(-0.5F, -9.0F, -4.1F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(27, 3)
/*  82 */         .addBox(-1.0F, -4.0F, -4.1F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 6)
/*  83 */         .addBox(-4.0F, -5.0F, -4.1F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), 
/*  84 */         PartPose.offset(0.0F, 0.0F, 0.0F));
/*  85 */     PartDefinition body = partdefinition.addOrReplaceChild("body", 
/*  86 */         CubeListBuilder.create().texOffs(0, 32).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  87 */         PartPose.offset(0.0F, 0.0F, 0.0F));
/*  88 */     PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6", 
/*  89 */         CubeListBuilder.create().texOffs(0, 56).addBox(0.0F, -0.5F, 1.875F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(21, 0)
/*  90 */         .addBox(0.0F, 3.5F, 5.875F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
/*  91 */         .addBox(0.0F, 1.5F, 4.875F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 16).addBox(0.0F, 0.5F, 2.875F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), 
/*     */         
/*  93 */         PartPose.offsetAndRotation(-0.5F, 0.0F, 0.0F, -0.1309F, 0.0F, 0.0F));
/*  94 */     PartDefinition Tail = body.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
/*  95 */     PartDefinition cube_r7 = Tail.addOrReplaceChild("cube_r7", 
/*  96 */         CubeListBuilder.create().texOffs(53, 0).addBox(1.149F, -0.793F, 6.662F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(21, 0)
/*  97 */         .addBox(0.149F, -0.793F, -3.338F, 5.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), 
/*  98 */         PartPose.offsetAndRotation(0.0F, 17.3374F, 18.8717F, -0.1745F, 0.5672F, -1.5708F));
/*  99 */     PartDefinition cube_r8 = Tail.addOrReplaceChild("cube_r8", 
/* 100 */         CubeListBuilder.create().texOffs(4, 16).addBox(-4.149F, -0.793F, 3.662F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 11)
/* 101 */         .addBox(-4.149F, -0.793F, -6.338F, 3.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), 
/* 102 */         PartPose.offsetAndRotation(0.0F, 17.3374F, 18.8717F, -0.1745F, -0.5672F, -1.5708F));
/* 103 */     PartDefinition cube_r9 = Tail.addOrReplaceChild("cube_r9", 
/* 104 */         CubeListBuilder.create().texOffs(24, 24).addBox(-2.5F, 7.25F, 3.75F, 6.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), 
/* 105 */         PartPose.offsetAndRotation(-0.5F, 6.5063F, 7.4678F, -0.1745F, 0.0F, 0.0F));
/* 106 */     PartDefinition cube_r10 = Tail.addOrReplaceChild("cube_r10", 
/* 107 */         CubeListBuilder.create().texOffs(21, 0).addBox(0.0F, 1.25F, 10.75F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 108 */         PartPose.offsetAndRotation(-0.5F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
/* 109 */     PartDefinition cube_r11 = Tail.addOrReplaceChild("cube_r11", 
/* 110 */         CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, 7.25F, 3.75F, 4.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)), 
/* 111 */         PartPose.offsetAndRotation(-0.5F, 0.0F, 0.0F, -0.5236F, 0.0F, 0.0F));
/* 112 */     PartDefinition leftArm = partdefinition.addOrReplaceChild("leftArm", 
/* 113 */         CubeListBuilder.create().texOffs(40, 35).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(28, 22)
/* 114 */         .addBox(-3.0F, 10.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 19)
/* 115 */         .addBox(-3.0F, 10.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 116 */         PartPose.offset(-5.0F, 2.0F, 0.0F));
/* 117 */     PartDefinition cube_r12 = leftArm.addOrReplaceChild("cube_r12", 
/* 118 */         CubeListBuilder.create().texOffs(30, 16).addBox(-5.5F, -2.7F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(7, 0)
/* 119 */         .addBox(-5.5F, -0.7F, -1.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 120 */         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5672F));
/* 121 */     PartDefinition rightArm = partdefinition.addOrReplaceChild("rightArm", 
/* 122 */         CubeListBuilder.create().texOffs(24, 35).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(20, 32)
/* 123 */         .addBox(2.0F, 10.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 32)
/* 124 */         .addBox(2.0F, 10.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 125 */         PartPose.offset(5.0F, 2.0F, 0.0F));
/* 126 */     PartDefinition cube_r13 = rightArm.addOrReplaceChild("cube_r13", 
/* 127 */         CubeListBuilder.create().texOffs(27, 0).addBox(4.5F, -2.7F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 16)
/* 128 */         .addBox(3.5F, -0.7F, -1.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 129 */         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5672F));
/* 130 */     PartDefinition leftLeg = partdefinition.addOrReplaceChild("leftLeg", 
/* 131 */         CubeListBuilder.create().texOffs(0, 47).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 132 */         PartPose.offset(-2.0F, 12.0F, 0.0F));
/* 133 */     PartDefinition cube_r14 = leftLeg.addOrReplaceChild("cube_r14", 
/* 134 */         CubeListBuilder.create().texOffs(52, 10).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), 
/* 135 */         PartPose.offsetAndRotation(-0.03F, 9.8745F, 0.96F, -1.5708F, 0.0F, 0.0F));
/* 136 */     PartDefinition cube_r15 = leftLeg.addOrReplaceChild("cube_r15", 
/* 137 */         CubeListBuilder.create().texOffs(52, 31).addBox(-2.0F, -1.0F, -1.0F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 138 */         PartPose.offsetAndRotation(-0.03F, 7.4835F, 1.8083F, -0.6545F, 0.0F, 0.0F));
/* 139 */     PartDefinition cube_r16 = leftLeg.addOrReplaceChild("cube_r16", 
/* 140 */         CubeListBuilder.create().texOffs(40, 11).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 141 */         PartPose.offsetAndRotation(-0.03F, 4.9635F, 0.2358F, 0.48F, 0.0F, 0.0F));
/* 142 */     PartDefinition rightLeg = partdefinition.addOrReplaceChild("rightLeg", 
/* 143 */         CubeListBuilder.create().texOffs(44, 22).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 144 */         PartPose.offset(2.0F, 12.0F, 0.0F));
/* 145 */     PartDefinition cube_r17 = rightLeg.addOrReplaceChild("cube_r17", 
/* 146 */         CubeListBuilder.create().texOffs(0, 6).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), 
/* 147 */         PartPose.offsetAndRotation(0.03F, 9.8745F, 0.96F, -1.5708F, 0.0F, 0.0F));
/* 148 */     PartDefinition cube_r18 = rightLeg.addOrReplaceChild("cube_r18", 
/* 149 */         CubeListBuilder.create().texOffs(38, 51).addBox(-2.0F, -1.0F, -1.0F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 150 */         PartPose.offsetAndRotation(0.03F, 7.4835F, 1.8083F, -0.6545F, 0.0F, 0.0F));
/* 151 */     PartDefinition cube_r19 = rightLeg.addOrReplaceChild("cube_r19", 
/* 152 */         CubeListBuilder.create().texOffs(41, 0).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 153 */         PartPose.offsetAndRotation(0.03F, 4.9635F, 0.2358F, 0.48F, 0.0F, 0.0F));
/* 154 */     return LayerDefinition.create(meshdefinition, 128, 128);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 160 */     this.head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 161 */     this.body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 162 */     this.leftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 163 */     this.rightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 164 */     this.leftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 165 */     this.rightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */   
/*     */   public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
/* 169 */     this.head.yRot = netHeadYaw / 57.295776F;
/* 170 */     this.head.xRot = headPitch / 57.295776F;
/* 171 */     this.rightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
/* 172 */     this.rightArm.xRot = Mth.cos(limbSwing * 0.6662F + 3.1415927F) * limbSwingAmount;
/* 173 */     this.leftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
/* 174 */     this.leftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\client\model\Modeldark_latex_shark.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */