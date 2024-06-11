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
/*     */ public class ModelDrone_Hertx<T extends Entity>
/*     */   extends EntityModel<T>
/*     */ {
/*  25 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("latex", "model_drone_hertx"), "main");
/*     */   public final ModelPart Head;
/*     */   public final ModelPart Body;
/*     */   public final ModelPart Tail;
/*     */   public final ModelPart LeftArm;
/*     */   public final ModelPart RightArm;
/*     */   public final ModelPart LeftLeg;
/*     */   public final ModelPart RightLeg;
/*     */   
/*     */   public ModelDrone_Hertx(ModelPart root) {
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
/*  48 */         CubeListBuilder.create().texOffs(15, 0).addBox(-3.0F, -1.3F, -5.0F, 6.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(34, 0)
/*  49 */         .addBox(-2.0F, -2.4F, -3.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 59)
/*  50 */         .addBox(-2.0F, -6.4F, 2.0F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 23)
/*  51 */         .addBox(-1.5F, -6.9F, -4.5F, 3.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(15, 8)
/*  52 */         .addBox(-2.0F, -2.4F, 3.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 14)
/*  53 */         .addBox(-3.0F, -2.4F, 2.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 8)
/*  54 */         .addBox(-3.0F, -0.275F, -2.275F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(15, 5)
/*  55 */         .addBox(-1.0F, -0.15F, -2.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(15, 0)
/*  56 */         .addBox(2.0F, -6.4F, 2.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 13)
/*  57 */         .addBox(-3.0F, -6.4F, 2.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 13)
/*  58 */         .addBox(-3.0F, -6.4F, -5.0F, 6.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(47, 7)
/*  59 */         .addBox(2.0F, -5.4F, -5.0F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(47, 28)
/*  60 */         .addBox(2.0F, -2.3F, -5.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(46, 38)
/*  61 */         .addBox(-3.0F, -5.4F, -5.0F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(28, 55)
/*  62 */         .addBox(-3.0F, -2.3F, -5.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(30, 27)
/*  63 */         .addBox(-2.0F, -5.4F, -5.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 21)
/*  64 */         .addBox(-2.0F, -2.3F, -5.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  65 */         PartPose.offset(0.0F, -2.0F, -0.2F));
/*  66 */     PartDefinition Antenna = Head.addOrReplaceChild("Antenna", CubeListBuilder.create(), PartPose.offset(0.0F, -6.1528F, 3.0874F));
/*  67 */     PartDefinition cube_r1 = Antenna.addOrReplaceChild("cube_r1", 
/*  68 */         CubeListBuilder.create().texOffs(56, 53).addBox(0.0F, -2.75F, -1.25F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(37, 55)
/*  69 */         .addBox(-6.5F, -2.75F, -1.25F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
/*  70 */         .addBox(-6.5F, -3.75F, -5.25F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(55, 60).addBox(0.0F, -3.75F, -5.25F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), 
/*     */         
/*  72 */         PartPose.offsetAndRotation(2.75F, 0.3511F, 2.7389F, 1.3526F, 0.0F, 0.0F));
/*  73 */     PartDefinition Body = partdefinition.addOrReplaceChild("Body", 
/*  74 */         CubeListBuilder.create().texOffs(0, 21).addBox(-4.0F, 0.2F, -2.0F, 8.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 32)
/*  75 */         .addBox(-4.0F, 10.2F, -2.0F, 8.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(30, 19)
/*  76 */         .addBox(-3.625F, 6.2F, -2.0F, 7.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  77 */         PartPose.offset(0.0F, -2.0F, 0.0F));
/*  78 */     PartDefinition Tail = partdefinition.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offset(0.0F, 10.0F, 0.0F));
/*  79 */     PartDefinition cube_r2 = Tail.addOrReplaceChild("cube_r2", 
/*  80 */         CubeListBuilder.create().texOffs(0, 6).addBox(-1.25F, 10.3026F, 24.6391F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
/*  81 */         .addBox(-0.25F, 10.8026F, 25.6391F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
/*  82 */         .addBox(1.75F, 10.8026F, 25.6391F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 0)
/*  83 */         .addBox(-0.25F, 12.8026F, 25.6391F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 1)
/*  84 */         .addBox(1.75F, 12.8026F, 25.6391F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(19, 8)
/*  85 */         .addBox(-0.25F, 11.3026F, 15.6391F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), 
/*  86 */         PartPose.offsetAndRotation(-0.75F, -10.3628F, -1.0141F, -0.3927F, 0.0F, 0.0F));
/*  87 */     PartDefinition cube_r3 = Tail.addOrReplaceChild("cube_r3", 
/*  88 */         CubeListBuilder.create().texOffs(0, 0).addBox(-0.25F, 4.2F, 7.0F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), 
/*  89 */         PartPose.offsetAndRotation(-0.75F, -9.2F, 0.0F, -0.7854F, 0.0F, 0.0F));
/*  90 */     PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", 
/*  91 */         CubeListBuilder.create().texOffs(52, 17).addBox(-2.0F, -1.8F, -2.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(47, 59)
/*  92 */         .addBox(-1.0F, -2.8F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(24, 32)
/*  93 */         .addBox(-3.0F, 5.2F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 10)
/*  94 */         .addBox(-3.0F, 11.2F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 8)
/*  95 */         .addBox(-3.0F, 11.2F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(29, 20)
/*  96 */         .addBox(-1.0F, 11.2F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 31).addBox(-3.0F, 11.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*     */         
/*  98 */         PartPose.offsetAndRotation(-5.0F, 1.0F, 0.125F, 0.0F, 0.0F, 0.0436F));
/*  99 */     PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", 
/* 100 */         CubeListBuilder.create().texOffs(14, 52).addBox(-1.0F, -1.8F, -2.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(56, 9)
/* 101 */         .addBox(-1.0F, -2.8F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 38)
/* 102 */         .addBox(-1.0F, 5.2F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(26, 19)
/* 103 */         .addBox(0.0F, 11.2F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 0)
/* 104 */         .addBox(2.0F, 11.2F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
/* 105 */         .addBox(2.0F, 11.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 23).addBox(2.0F, 11.2F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*     */         
/* 107 */         PartPose.offsetAndRotation(5.0F, 1.0F, 0.125F, 0.0F, 0.0F, -0.0436F));
/* 108 */     PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", 
/* 109 */         CubeListBuilder.create().texOffs(58, 45).addBox(-2.0F, -0.8F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(36, 27)
/* 110 */         .addBox(-2.375F, 10.0F, -2.9102F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(3, 17)
/* 111 */         .addBox(0.625F, 11.0F, -3.9102F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 13)
/* 112 */         .addBox(-2.375F, 11.0F, -3.9102F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 113 */         PartPose.offset(-2.0F, 11.0F, 0.0F));
/* 114 */     PartDefinition cube_r4 = LeftLeg.addOrReplaceChild("cube_r4", 
/* 115 */         CubeListBuilder.create().texOffs(55, 36).addBox(-2.0F, 4.3F, 3.0F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 116 */         PartPose.offsetAndRotation(-0.25F, 1.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 117 */     PartDefinition cube_r5 = LeftLeg.addOrReplaceChild("cube_r5", 
/* 118 */         CubeListBuilder.create().texOffs(0, 48).addBox(-3.5625F, -3.5F, -2.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 119 */         PartPose.offsetAndRotation(1.8125F, 6.0735F, -0.1237F, 0.7418F, 0.0F, 0.0F));
/* 120 */     PartDefinition cube_r6 = LeftLeg.addOrReplaceChild("cube_r6", 
/* 121 */         CubeListBuilder.create().texOffs(16, 42).addBox(-2.0F, -0.6F, -2.2F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 122 */         PartPose.offsetAndRotation(-0.125F, 1.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 123 */     PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", 
/* 124 */         CubeListBuilder.create().texOffs(56, 28).addBox(-2.0F, -0.8F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(35, 37)
/* 125 */         .addBox(-1.625F, 10.0F, -2.9102F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(23, 13)
/* 126 */         .addBox(1.375F, 11.0F, -3.9102F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 21)
/* 127 */         .addBox(-1.625F, 11.0F, -3.9102F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 128 */         PartPose.offset(2.0F, 11.0F, 0.0F));
/* 129 */     PartDefinition cube_r7 = RightLeg.addOrReplaceChild("cube_r7", 
/* 130 */         CubeListBuilder.create().texOffs(56, 0).addBox(-2.0F, 4.3F, 3.0F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 131 */         PartPose.offsetAndRotation(0.25F, 1.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 132 */     PartDefinition cube_r8 = RightLeg.addOrReplaceChild("cube_r8", 
/* 133 */         CubeListBuilder.create().texOffs(48, 48).addBox(0.5625F, -3.5F, -2.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 134 */         PartPose.offsetAndRotation(-1.9375F, 6.0735F, -0.1237F, 0.7418F, 0.0F, 0.0F));
/* 135 */     PartDefinition cube_r9 = RightLeg.addOrReplaceChild("cube_r9", 
/* 136 */         CubeListBuilder.create().texOffs(32, 45).addBox(-2.0F, -0.6F, -2.2F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 137 */         PartPose.offsetAndRotation(0.125F, 1.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 138 */     return LayerDefinition.create(meshdefinition, 80, 80);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 144 */     this.Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 145 */     this.Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 146 */     this.Tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 147 */     this.LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 148 */     this.RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 149 */     this.LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 150 */     this.RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */   
/*     */   public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
/* 154 */     this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + 3.1415927F) * limbSwingAmount;
/* 155 */     this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
/* 156 */     this.Head.yRot = netHeadYaw / 57.295776F;
/* 157 */     this.Head.xRot = headPitch / 57.295776F;
/* 158 */     this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
/* 159 */     this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\client\model\ModelDrone_Hertx.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */