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
/*     */ public class ModelAHV_hertx_model<T extends Entity>
/*     */   extends EntityModel<T>
/*     */ {
/*  25 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("latex", "model_ahv_hertx_model"), "main");
/*     */   public final ModelPart Head;
/*     */   public final ModelPart Body;
/*     */   public final ModelPart LeftArm;
/*     */   public final ModelPart RightArm;
/*     */   public final ModelPart LeftLeg;
/*     */   public final ModelPart RightLeg;
/*     */   
/*     */   public ModelAHV_hertx_model(ModelPart root) {
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
/*  46 */         CubeListBuilder.create().texOffs(21, 8).addBox(-3.0F, -2.3F, -5.2F, 6.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(56, 43)
/*  47 */         .addBox(-2.0F, -3.4F, -3.2F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(16, 66)
/*  48 */         .addBox(-2.0F, -7.4F, 1.8F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(38, 0)
/*  49 */         .addBox(-2.0F, -3.4F, 2.8F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 59)
/*  50 */         .addBox(-3.0F, -3.4F, 1.8F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 16)
/*  51 */         .addBox(-3.0F, -1.4F, -3.1F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(3, 4)
/*  52 */         .addBox(2.0F, -7.4F, 1.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
/*  53 */         .addBox(-3.0F, -7.4F, 1.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 0)
/*  54 */         .addBox(-3.0F, -7.4F, -5.2F, 6.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(50, 22)
/*  55 */         .addBox(2.0F, -6.4F, -5.2F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(55, 5)
/*  56 */         .addBox(2.0F, -3.3F, -5.2F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(41, 29)
/*  57 */         .addBox(-3.0F, -6.4F, -5.2F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(53, 53)
/*  58 */         .addBox(-3.0F, -3.3F, -5.2F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(32, 38)
/*  59 */         .addBox(-2.0F, -6.4F, -5.2F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 16)
/*  60 */         .addBox(-2.0F, -3.3F, -5.2F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  61 */         PartPose.offset(0.0F, -1.0F, 0.0F));
/*  62 */     PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1", 
/*  63 */         CubeListBuilder.create().texOffs(0, 14).addBox(-3.0F, -7.4142F, 9.2505F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(69, 39)
/*  64 */         .addBox(-3.0F, -7.4142F, 4.2505F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(4, 0)
/*  65 */         .addBox(2.0F, -7.4142F, 9.2505F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(46, 65).addBox(2.0F, -7.4142F, 4.2505F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), 
/*     */         
/*  67 */         PartPose.offsetAndRotation(0.0F, 1.4F, -0.2F, 0.2618F, 0.0F, 0.0F));
/*  68 */     PartDefinition Body = partdefinition.addOrReplaceChild("Body", 
/*  69 */         CubeListBuilder.create().texOffs(0, 14).addBox(-4.0F, -0.8F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 58)
/*  70 */         .addBox(-4.0F, -0.8F, -3.0F, 8.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(43, 23)
/*  71 */         .addBox(-3.0F, -0.8F, -3.3F, 6.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(66, 28)
/*  72 */         .addBox(-3.0F, 5.2F, -2.6F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  73 */         PartPose.offset(0.0F, -1.0F, 0.0F));
/*  74 */     PartDefinition Tail = Body.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offset(0.0F, 11.0F, 1.0F));
/*  75 */     PartDefinition cube_r2 = Tail.addOrReplaceChild("cube_r2", 
/*  76 */         CubeListBuilder.create().texOffs(17, 36).addBox(-2.3F, 6.7384F, 3.3388F, 4.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)), 
/*  77 */         PartPose.offset(0.5F, -9.0F, -4.0F));
/*  78 */     PartDefinition cube_r3 = Tail.addOrReplaceChild("cube_r3", 
/*  79 */         CubeListBuilder.create().texOffs(0, 0).addBox(-2.8F, 9.9039F, -0.2825F, 5.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)), 
/*  80 */         PartPose.offsetAndRotation(0.5F, -9.0F, -4.0F, 0.7854F, 0.0F, 0.0F));
/*  81 */     PartDefinition cube_r10 = Tail.addOrReplaceChild("cube_r10", 
/*  82 */         CubeListBuilder.create().texOffs(24, 24).addBox(-3.8F, 9.7028F, -4.3744F, 7.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 30)
/*  83 */         .addBox(-3.8F, 9.7028F, 0.6256F, 7.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(57, 39).addBox(-3.8F, 11.7028F, 5.6256F, 7.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), 
/*     */         
/*  85 */         PartPose.offsetAndRotation(0.5F, -9.0F, -4.0F, 1.5708F, 0.0F, 0.0F));
/*  86 */     PartDefinition uppertailjaw = cube_r10.addOrReplaceChild("uppertailjaw", 
/*  87 */         CubeListBuilder.create().texOffs(39, 39).addBox(-3.8F, -10.2972F, 2.6256F, 7.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  88 */         PartPose.offset(0.0F, 24.0F, 0.0F));
/*  89 */     PartDefinition lowertailjaw = cube_r10.addOrReplaceChild("lowertailjaw", 
/*  90 */         CubeListBuilder.create().texOffs(57, 32).addBox(-3.8F, -10.5518F, -0.741F, 7.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), 
/*  91 */         PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, -0.1309F, 0.0F, 0.0F));
/*  92 */     PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", 
/*  93 */         CubeListBuilder.create().texOffs(45, 0).addBox(-3.0F, -3.8F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(59, 22)
/*  94 */         .addBox(-3.0F, 7.2F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 58)
/*  95 */         .addBox(-3.0F, 4.2F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(22, 1)
/*  96 */         .addBox(-3.0F, 10.2F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 4)
/*  97 */         .addBox(-1.0F, 10.2F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(62, 55)
/*  98 */         .addBox(-3.0F, 9.2F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(19, 2)
/*  99 */         .addBox(-3.0F, 10.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 0)
/* 100 */         .addBox(-3.0F, 10.2F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 101 */         PartPose.offset(-5.0F, 2.0F, 0.0F));
/* 102 */     PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", 
/* 103 */         CubeListBuilder.create().texOffs(0, 39).addBox(-1.0F, -3.8F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(66, 66)
/* 104 */         .addBox(-1.0F, 9.2F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(18, 59)
/* 105 */         .addBox(-1.0F, 4.2F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(62, 49)
/* 106 */         .addBox(-1.0F, 7.2F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(24, 18)
/* 107 */         .addBox(0.0F, 10.2F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 24)
/* 108 */         .addBox(2.0F, 10.2F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 5)
/* 109 */         .addBox(2.0F, 10.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 3)
/* 110 */         .addBox(2.0F, 10.2F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 111 */         PartPose.offset(5.0F, 2.0F, 0.0F));
/* 112 */     PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", 
/* 113 */         CubeListBuilder.create().texOffs(30, 65).addBox(-2.0F, -1.8F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
/* 114 */         .texOffs(0, 65).addBox(-2.0F, 10.0F, -2.4102F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 115 */         PartPose.offset(-2.0F, 12.0F, 0.0F));
/* 116 */     PartDefinition cube_r4 = LeftLeg.addOrReplaceChild("cube_r4", 
/* 117 */         CubeListBuilder.create().texOffs(59, 13).addBox(-2.0F, 4.3F, 3.0F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 118 */         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 119 */     PartDefinition cube_r5 = LeftLeg.addOrReplaceChild("cube_r5", 
/* 120 */         CubeListBuilder.create().texOffs(28, 48).addBox(-2.0F, 0.0F, -5.8F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 121 */         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
/* 122 */     PartDefinition cube_r6 = LeftLeg.addOrReplaceChild("cube_r6", 
/* 123 */         CubeListBuilder.create().texOffs(44, 48).addBox(-2.0F, -0.6F, -2.2F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 124 */         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 125 */     PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", 
/* 126 */         CubeListBuilder.create().texOffs(64, 6).addBox(-2.0F, -1.8F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
/* 127 */         .texOffs(64, 0).addBox(-2.0F, 10.0F, -2.4102F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 128 */         PartPose.offset(2.0F, 12.0F, 0.0F));
/* 129 */     PartDefinition cube_r7 = RightLeg.addOrReplaceChild("cube_r7", 
/* 130 */         CubeListBuilder.create().texOffs(56, 61).addBox(-2.0F, 4.3F, 3.0F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 131 */         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 132 */     PartDefinition cube_r8 = RightLeg.addOrReplaceChild("cube_r8", 
/* 133 */         CubeListBuilder.create().texOffs(12, 47).addBox(-2.0F, 0.0F, -5.8F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 134 */         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
/* 135 */     PartDefinition cube_r9 = RightLeg.addOrReplaceChild("cube_r9", 
/* 136 */         CubeListBuilder.create().texOffs(43, 12).addBox(-2.0F, -0.6F, -2.2F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 137 */         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 138 */     return LayerDefinition.create(meshdefinition, 128, 128);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 144 */     this.Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 145 */     this.Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 146 */     this.LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 147 */     this.RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 148 */     this.LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 149 */     this.RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */   
/*     */   public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
/* 153 */     this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + 3.1415927F) * limbSwingAmount;
/* 154 */     this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
/* 155 */     this.Head.yRot = netHeadYaw / 57.295776F;
/* 156 */     this.Head.xRot = headPitch / 57.295776F;
/* 157 */     this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
/* 158 */     this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\client\model\ModelAHV_hertx_model.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */