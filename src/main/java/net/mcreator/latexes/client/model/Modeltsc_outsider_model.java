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
/*     */ public class Modeltsc_outsider_model<T extends Entity>
/*     */   extends EntityModel<T>
/*     */ {
/*  25 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("latex", "modeltsc_outsider_model"), "main");
/*     */   public final ModelPart Head;
/*     */   public final ModelPart Body;
/*     */   public final ModelPart LeftArm;
/*     */   public final ModelPart RightArm;
/*     */   public final ModelPart LeftLeg;
/*     */   public final ModelPart RightLeg;
/*     */   
/*     */   public Modeltsc_outsider_model(ModelPart root) {
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
/*  46 */         CubeListBuilder.create().texOffs(0, 0).addBox(-3.5F, -7.0F, -3.5F, 7.0F, 7.0F, 7.0F, new CubeDeformation(0.0F))
/*  47 */         .texOffs(12, 27).addBox(-3.0F, -5.25F, -3.75F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  48 */         PartPose.offset(0.0F, 0.0F, 0.0F));
/*  49 */     PartDefinition Ears = Head.addOrReplaceChild("Ears", 
/*  50 */         CubeListBuilder.create().texOffs(53, 24).addBox(-1.0F, -1.5F, -3.0F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(52, 34)
/*  51 */         .addBox(6.0F, -1.5F, -3.0F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), 
/*  52 */         PartPose.offsetAndRotation(-3.5F, -6.5F, 2.5F, 0.7854F, 0.0F, 0.0F));
/*  53 */     PartDefinition Body = partdefinition.addOrReplaceChild("Body", 
/*  54 */         CubeListBuilder.create().texOffs(16, 14).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(28, 0)
/*  55 */         .addBox(-4.0F, 8.0F, -2.0F, 8.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(28, 8)
/*  56 */         .addBox(-3.5F, 6.0F, -2.0F, 7.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 14)
/*  57 */         .addBox(-1.5F, 0.5F, -2.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  58 */         PartPose.offset(0.0F, 0.0F, 0.0F));
/*  59 */     PartDefinition Tail = Body.addOrReplaceChild("Tail", 
/*  60 */         CubeListBuilder.create().texOffs(19, 24).addBox(-2.0F, -15.5381F, 4.1913F, 4.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 14)
/*  61 */         .addBox(-1.5F, -15.0F, 2.0F, 3.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)), 
/*  62 */         PartPose.offsetAndRotation(0.0F, 23.0F, -5.2F, -0.3927F, 0.0F, 0.0F));
/*  63 */     PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", 
/*  64 */         CubeListBuilder.create().texOffs(16, 45).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(28, 50)
/*  65 */         .addBox(-3.0F, 3.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(41, 30)
/*  66 */         .addBox(-3.0F, 6.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  67 */         PartPose.offset(-5.0F, 2.0F, 0.0F));
/*  68 */     PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", 
/*  69 */         CubeListBuilder.create().texOffs(40, 41).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 50)
/*  70 */         .addBox(-1.0F, 3.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 41)
/*  71 */         .addBox(-1.0F, 6.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  72 */         PartPose.offset(5.0F, 2.0F, 0.0F));
/*  73 */     PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create(), PartPose.offset(-2.0F, 12.0F, 0.0F));
/*  74 */     PartDefinition cube_r1 = LeftLeg.addOrReplaceChild("cube_r1", 
/*  75 */         CubeListBuilder.create().texOffs(48, 17).addBox(-2.0F, 4.3732F, -4.2794F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  76 */         PartPose.offset(0.0F, 4.6268F, 1.6794F));
/*  77 */     PartDefinition cube_r2 = LeftLeg.addOrReplaceChild("cube_r2", 
/*  78 */         CubeListBuilder.create().texOffs(52, 0).addBox(-1.5F, 0.0F, -1.0F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), 
/*  79 */         PartPose.offsetAndRotation(0.0F, 4.6268F, 2.2794F, -0.3927F, 0.0F, 0.0F));
/*  80 */     PartDefinition cube_r3 = LeftLeg.addOrReplaceChild("cube_r3", 
/*  81 */         CubeListBuilder.create().texOffs(36, 20).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  82 */         PartPose.offsetAndRotation(0.0F, 2.5637F, -2.5296F, 0.7854F, 0.0F, 0.0F));
/*  83 */     PartDefinition cube_r4 = LeftLeg.addOrReplaceChild("cube_r4", 
/*  84 */         CubeListBuilder.create().texOffs(28, 35).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  85 */         PartPose.offsetAndRotation(0.0F, -0.8F, 0.2F, -0.3927F, 0.0F, 0.0F));
/*  86 */     PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create(), PartPose.offset(2.0F, 12.0F, 0.0F));
/*  87 */     PartDefinition cube_r5 = RightLeg.addOrReplaceChild("cube_r5", 
/*  88 */         CubeListBuilder.create().texOffs(46, 10).addBox(-2.0F, 4.3732F, -4.2794F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  89 */         PartPose.offset(0.0F, 4.6268F, 1.6794F));
/*  90 */     PartDefinition cube_r6 = RightLeg.addOrReplaceChild("cube_r6", 
/*  91 */         CubeListBuilder.create().texOffs(44, 50).addBox(-1.5F, 0.0F, -1.0F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), 
/*  92 */         PartPose.offsetAndRotation(0.0F, 4.6268F, 2.2794F, -0.3927F, 0.0F, 0.0F));
/*  93 */     PartDefinition cube_r7 = RightLeg.addOrReplaceChild("cube_r7", 
/*  94 */         CubeListBuilder.create().texOffs(12, 35).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  95 */         PartPose.offsetAndRotation(0.0F, 2.5637F, -2.5296F, 0.7854F, 0.0F, 0.0F));
/*  96 */     PartDefinition cube_r8 = RightLeg.addOrReplaceChild("cube_r8", 
/*  97 */         CubeListBuilder.create().texOffs(0, 27).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  98 */         PartPose.offsetAndRotation(0.0F, -0.8F, 0.2F, -0.3927F, 0.0F, 0.0F));
/*  99 */     return LayerDefinition.create(meshdefinition, 80, 80);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 105 */     this.Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 106 */     this.Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 107 */     this.LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 108 */     this.RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 109 */     this.LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 110 */     this.RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */   
/*     */   public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
/* 114 */     this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + 3.1415927F) * limbSwingAmount;
/* 115 */     this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
/* 116 */     this.Head.yRot = netHeadYaw / 57.295776F;
/* 117 */     this.Head.xRot = headPitch / 57.295776F;
/* 118 */     this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
/* 119 */     this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\client\model\Modeltsc_outsider_model.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */