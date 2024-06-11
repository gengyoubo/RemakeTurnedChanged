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
/*     */ public class ModelDark_latex_fox<T extends Entity>
/*     */   extends EntityModel<T>
/*     */ {
/*  25 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("latex", "model_dark_latex_fox"), "main");
/*     */   public final ModelPart Head;
/*     */   public final ModelPart Body;
/*     */   public final ModelPart Tail;
/*     */   public final ModelPart LeftArm;
/*     */   public final ModelPart RightArm;
/*     */   public final ModelPart LeftLeg;
/*     */   public final ModelPart RightLeg;
/*     */   
/*     */   public ModelDark_latex_fox(ModelPart root) {
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
/*  48 */         CubeListBuilder.create().texOffs(47, 39).addBox(-2.0F, -2.9F, -6.5F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
/*  49 */         .addBox(-4.0F, -7.0F, -3.5F, 8.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(20, 0)
/*  50 */         .addBox(-4.0F, -10.0F, -0.5F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 3)
/*  51 */         .addBox(1.0F, -10.0F, -0.5F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), 
/*  52 */         PartPose.offset(0.0F, 0.0F, 0.0F));
/*  53 */     PartDefinition Mask = Head.addOrReplaceChild("Mask", 
/*  54 */         CubeListBuilder.create().texOffs(0, 11).addBox(-2.0F, -7.2F, -4.2F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 8)
/*  55 */         .addBox(-3.0F, -6.2F, -4.2F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 19)
/*  56 */         .addBox(-1.0F, -5.2F, -4.2F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(20, 5)
/*  57 */         .addBox(-2.0F, -3.2F, -7.2F, 4.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 4)
/*  58 */         .addBox(-2.0F, -1.2F, -7.2F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(8, 3)
/*  59 */         .addBox(1.0F, -1.2F, -7.2F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(4, 19)
/*  60 */         .addBox(2.0F, -3.2F, -4.2F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
/*  61 */         .addBox(3.0F, -5.2F, -4.2F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 6)
/*  62 */         .addBox(2.1F, -3.2F, -7.2F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(6, 6)
/*  63 */         .addBox(-2.1F, -3.2F, -7.2F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(20, 7)
/*  64 */         .addBox(-3.0F, -3.2F, -4.2F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(10, 3)
/*  65 */         .addBox(-4.0F, -5.2F, -4.2F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
/*  66 */         .addBox(-2.0F, -3.2F, -7.2F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), 
/*  67 */         PartPose.offset(0.0F, 0.0F, 0.375F));
/*  68 */     PartDefinition Body = partdefinition.addOrReplaceChild("Body", 
/*  69 */         CubeListBuilder.create().texOffs(26, 26).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  70 */         PartPose.offset(0.0F, 0.0F, 0.0F));
/*  71 */     PartDefinition Tail = partdefinition.addOrReplaceChild("Tail", 
/*  72 */         CubeListBuilder.create().texOffs(0, 16).addBox(-1.0F, -14.0F, 2.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
/*  73 */         .addBox(-2.0F, -15.0F, 3.0F, 4.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)), 
/*  74 */         PartPose.offsetAndRotation(0.0F, 23.0F, -5.2F, -0.3927F, 0.0F, 0.0F));
/*  75 */     PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", 
/*  76 */         CubeListBuilder.create().texOffs(32, 0).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  77 */         PartPose.offset(-5.0F, 2.0F, 0.0F));
/*  78 */     PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", 
/*  79 */         CubeListBuilder.create().texOffs(0, 30).addBox(-1.0F, -2.0F, -2.0F, 3.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  80 */         PartPose.offset(5.0F, 2.0F, 0.0F));
/*  81 */     PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create(), PartPose.offset(-2.0F, 12.0F, 0.0F));
/*  82 */     PartDefinition cube_r1 = LeftLeg.addOrReplaceChild("cube_r1", 
/*  83 */         CubeListBuilder.create().texOffs(46, 23).addBox(-2.0F, 4.3732F, -4.2794F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  84 */         PartPose.offset(0.0F, 4.6268F, 1.6794F));
/*  85 */     PartDefinition cube_r2 = LeftLeg.addOrReplaceChild("cube_r2", 
/*  86 */         CubeListBuilder.create().texOffs(46, 0).addBox(-2.0F, 0.0F, -1.0F, 4.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), 
/*  87 */         PartPose.offsetAndRotation(0.0F, 4.6268F, 2.2794F, -0.3927F, 0.0F, 0.0F));
/*  88 */     PartDefinition cube_r3 = LeftLeg.addOrReplaceChild("cube_r3", 
/*  89 */         CubeListBuilder.create().texOffs(14, 38).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  90 */         PartPose.offsetAndRotation(0.0F, 2.5637F, -2.5296F, 0.7854F, 0.0F, 0.0F));
/*  91 */     PartDefinition cube_r4 = LeftLeg.addOrReplaceChild("cube_r4", 
/*  92 */         CubeListBuilder.create().texOffs(46, 46).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  93 */         PartPose.offsetAndRotation(0.0F, -0.8F, 0.2F, -0.3927F, 0.0F, 0.0F));
/*  94 */     PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create(), PartPose.offset(2.0F, 12.0F, 0.0F));
/*  95 */     PartDefinition cube_r5 = RightLeg.addOrReplaceChild("cube_r5", 
/*  96 */         CubeListBuilder.create().texOffs(30, 19).addBox(-2.0F, 4.3732F, -4.2794F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  97 */         PartPose.offset(0.0F, 4.6268F, 1.6794F));
/*  98 */     PartDefinition cube_r6 = RightLeg.addOrReplaceChild("cube_r6", 
/*  99 */         CubeListBuilder.create().texOffs(0, 47).addBox(-2.0F, 0.0F, -1.0F, 4.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 100 */         PartPose.offsetAndRotation(0.0F, 4.6268F, 2.2794F, -0.3927F, 0.0F, 0.0F));
/* 101 */     PartDefinition cube_r7 = RightLeg.addOrReplaceChild("cube_r7", 
/* 102 */         CubeListBuilder.create().texOffs(30, 42).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 103 */         PartPose.offsetAndRotation(0.0F, 2.5637F, -2.5296F, 0.7854F, 0.0F, 0.0F));
/* 104 */     PartDefinition cube_r8 = RightLeg.addOrReplaceChild("cube_r8", 
/* 105 */         CubeListBuilder.create().texOffs(42, 13).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 106 */         PartPose.offsetAndRotation(0.0F, -0.8F, 0.2F, -0.3927F, 0.0F, 0.0F));
/* 107 */     return LayerDefinition.create(meshdefinition, 64, 64);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 113 */     this.Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 114 */     this.Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 115 */     this.Tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 116 */     this.LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 117 */     this.RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 118 */     this.LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 119 */     this.RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */   
/*     */   public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
/* 123 */     this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + 3.1415927F) * limbSwingAmount;
/* 124 */     this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
/* 125 */     this.Head.yRot = netHeadYaw / 57.295776F;
/* 126 */     this.Head.xRot = headPitch / 57.295776F;
/* 127 */     this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
/* 128 */     this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\client\model\ModelDark_latex_fox.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */