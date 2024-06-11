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
/*     */ public class Modelhertx_model<T extends Entity>
/*     */   extends EntityModel<T>
/*     */ {
/*  25 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("latex", "modelhertx_model"), "main");
/*     */   public final ModelPart Head;
/*     */   public final ModelPart Body;
/*     */   public final ModelPart Tail;
/*     */   public final ModelPart LeftArm;
/*     */   public final ModelPart RightArm;
/*     */   public final ModelPart LeftLeg;
/*     */   public final ModelPart RightLeg;
/*     */   
/*     */   public Modelhertx_model(ModelPart root) {
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
/*  48 */         CubeListBuilder.create().texOffs(24, 24).addBox(-3.0F, -3.7F, -5.0F, 6.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(18, 54)
/*  49 */         .addBox(-2.0F, -4.8F, -3.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 60)
/*  50 */         .addBox(-2.0F, -8.8F, 2.0F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(20, 16)
/*  51 */         .addBox(-2.0F, -4.8F, 3.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 8)
/*  52 */         .addBox(-3.0F, -4.8F, 2.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 16)
/*  53 */         .addBox(-3.0F, -2.8F, -2.9F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(7, 0)
/*  54 */         .addBox(2.0F, -8.8F, 2.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
/*  55 */         .addBox(-3.0F, -8.8F, 2.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 0)
/*  56 */         .addBox(-3.0F, -8.8F, -5.0F, 6.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(50, 8)
/*  57 */         .addBox(2.0F, -7.8F, -5.0F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(32, 8)
/*  58 */         .addBox(2.0F, -4.7F, -5.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(48, 29)
/*  59 */         .addBox(-3.0F, -7.8F, -5.0F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(57, 57)
/*  60 */         .addBox(-3.0F, -4.7F, -5.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 8)
/*  61 */         .addBox(-2.0F, -7.8F, -5.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(13, 32)
/*  62 */         .addBox(-2.0F, -4.7F, -5.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  63 */         PartPose.offset(0.0F, 0.4F, -0.2F));
/*  64 */     PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1", 
/*  65 */         CubeListBuilder.create().texOffs(19, 0).addBox(-3.0F, -7.4142F, 9.2505F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
/*  66 */         .addBox(-3.0F, -7.4142F, 4.2505F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
/*  67 */         .addBox(2.0F, -7.4142F, 9.2505F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 60).addBox(2.0F, -7.4142F, 4.2505F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), 
/*     */         
/*  69 */         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2618F, 0.0F, 0.0F));
/*  70 */     PartDefinition Body = partdefinition.addOrReplaceChild("Body", 
/*  71 */         CubeListBuilder.create().texOffs(0, 16).addBox(-4.0F, -1.8F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(52, 39)
/*  72 */         .addBox(-4.0F, -1.8F, -3.0F, 8.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 11)
/*  73 */         .addBox(-3.0F, 4.2F, -3.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  74 */         PartPose.offset(0.0F, 0.0F, 0.0F));
/*  75 */     PartDefinition Tail = partdefinition.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
/*  76 */     PartDefinition cube_r2 = Tail.addOrReplaceChild("cube_r2", 
/*  77 */         CubeListBuilder.create().texOffs(0, 32).addBox(-1.3F, 11.3026F, 15.6391F, 3.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), 
/*  78 */         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/*  79 */     PartDefinition cube_r3 = Tail.addOrReplaceChild("cube_r3", 
/*  80 */         CubeListBuilder.create().texOffs(0, 0).addBox(-1.3F, 4.2F, 7.0F, 3.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)), 
/*  81 */         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
/*  82 */     PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", 
/*  83 */         CubeListBuilder.create().texOffs(36, 36).addBox(-3.0F, -3.8F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 44)
/*  84 */         .addBox(-3.0F, 4.2F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(24, 26)
/*  85 */         .addBox(-3.0F, 10.2F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 19)
/*  86 */         .addBox(-3.0F, 10.2F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 4)
/*  87 */         .addBox(-1.0F, 10.2F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 24)
/*  88 */         .addBox(-3.0F, 10.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  89 */         PartPose.offset(-5.0F, 2.0F, 0.0F));
/*  90 */     PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", 
/*  91 */         CubeListBuilder.create().texOffs(20, 32).addBox(-1.0F, -3.8F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(44, 19)
/*  92 */         .addBox(-1.0F, 4.2F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(22, 2)
/*  93 */         .addBox(0.0F, 10.2F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 3)
/*  94 */         .addBox(2.0F, 10.2F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(9, 11)
/*  95 */         .addBox(2.0F, 10.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 5)
/*  96 */         .addBox(2.0F, 10.2F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  97 */         PartPose.offset(5.0F, 2.0F, 0.0F));
/*  98 */     PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", 
/*  99 */         CubeListBuilder.create().texOffs(59, 7).addBox(-2.0F, -1.8F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
/* 100 */         .texOffs(0, 53).addBox(-2.0F, 10.0F, -2.9102F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 101 */         PartPose.offset(-2.0F, 12.0F, 0.0F));
/* 102 */     PartDefinition cube_r4 = LeftLeg.addOrReplaceChild("cube_r4", 
/* 103 */         CubeListBuilder.create().texOffs(57, 26).addBox(-2.0F, 4.3F, 3.0F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 104 */         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 105 */     PartDefinition cube_r5 = LeftLeg.addOrReplaceChild("cube_r5", 
/* 106 */         CubeListBuilder.create().texOffs(41, 4).addBox(-2.0F, 0.0F, -5.8F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 107 */         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
/* 108 */     PartDefinition cube_r6 = LeftLeg.addOrReplaceChild("cube_r6", 
/* 109 */         CubeListBuilder.create().texOffs(32, 48).addBox(-2.0F, -0.6F, -2.2F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 110 */         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 111 */     PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", 
/* 112 */         CubeListBuilder.create().texOffs(47, 58).addBox(-2.0F, -1.8F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
/* 113 */         .texOffs(53, 0).addBox(-2.0F, 10.0F, -2.9102F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 114 */         PartPose.offset(2.0F, 12.0F, 0.0F));
/* 115 */     PartDefinition cube_r7 = RightLeg.addOrReplaceChild("cube_r7", 
/* 116 */         CubeListBuilder.create().texOffs(33, 58).addBox(-2.0F, 4.3F, 3.0F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 117 */         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 118 */     PartDefinition cube_r8 = RightLeg.addOrReplaceChild("cube_r8", 
/* 119 */         CubeListBuilder.create().texOffs(0, 42).addBox(-2.0F, 0.0F, -5.8F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 120 */         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
/* 121 */     PartDefinition cube_r9 = RightLeg.addOrReplaceChild("cube_r9", 
/* 122 */         CubeListBuilder.create().texOffs(48, 48).addBox(-2.0F, -0.6F, -2.2F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 123 */         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 124 */     return LayerDefinition.create(meshdefinition, 128, 128);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 130 */     this.Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 131 */     this.Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 132 */     this.Tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 133 */     this.LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 134 */     this.RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 135 */     this.LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 136 */     this.RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */   
/*     */   public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
/* 140 */     this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + 3.1415927F) * limbSwingAmount;
/* 141 */     this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
/* 142 */     this.Head.yRot = netHeadYaw / 57.295776F;
/* 143 */     this.Head.xRot = headPitch / 57.295776F;
/* 144 */     this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
/* 145 */     this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\client\model\Modelhertx_model.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */