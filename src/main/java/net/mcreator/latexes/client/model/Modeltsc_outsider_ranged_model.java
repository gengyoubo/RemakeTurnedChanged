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
/*     */ public class Modeltsc_outsider_ranged_model<T extends Entity>
/*     */   extends EntityModel<T>
/*     */ {
/*  25 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("latex", "modeltsc_outsider_ranged_model"), "main");
/*     */   
/*     */   public final ModelPart Head;
/*     */   public final ModelPart Body;
/*     */   public final ModelPart LeftArm;
/*     */   public final ModelPart RightArm;
/*     */   public final ModelPart LeftLeg;
/*     */   public final ModelPart RightLeg;
/*     */   
/*     */   public Modeltsc_outsider_ranged_model(ModelPart root) {
/*  35 */     this.Head = root.getChild("Head");
/*  36 */     this.Body = root.getChild("Body");
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
/*  47 */         CubeListBuilder.create().texOffs(0, 0).addBox(-3.5F, -7.0F, -3.5F, 7.0F, 7.0F, 7.0F, new CubeDeformation(0.0F))
/*  48 */         .texOffs(12, 27).addBox(-3.0F, -5.25F, -3.75F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  49 */         PartPose.offset(0.0F, 0.0F, 0.0F));
/*  50 */     PartDefinition Ears = Head.addOrReplaceChild("Ears", 
/*  51 */         CubeListBuilder.create().texOffs(53, 24).addBox(-1.0F, -1.5F, -3.0F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(52, 34)
/*  52 */         .addBox(6.0F, -1.5F, -3.0F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), 
/*  53 */         PartPose.offsetAndRotation(-3.5F, -6.5F, 2.5F, 0.7854F, 0.0F, 0.0F));
/*  54 */     PartDefinition Body = partdefinition.addOrReplaceChild("Body", 
/*  55 */         CubeListBuilder.create().texOffs(16, 14).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(28, 0)
/*  56 */         .addBox(-4.0F, 8.0F, -2.0F, 8.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(28, 8)
/*  57 */         .addBox(-3.5F, 6.0F, -2.0F, 7.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(24, 35)
/*  58 */         .addBox(-1.5F, 0.5F, -2.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  59 */         PartPose.offset(0.0F, 0.0F, 0.0F));
/*  60 */     PartDefinition Tail = Body.addOrReplaceChild("Tail", 
/*  61 */         CubeListBuilder.create().texOffs(0, 14).addBox(-1.5F, -14.9043F, 1.769F, 3.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(19, 24)
/*  62 */         .addBox(-2.0F, -15.4424F, 3.9603F, 4.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)), 
/*  63 */         PartPose.offsetAndRotation(0.0F, 23.0F, -5.2F, -0.3927F, 0.0F, 0.0F));
/*  64 */     PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", 
/*  65 */         CubeListBuilder.create().texOffs(16, 45).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(28, 50)
/*  66 */         .addBox(-3.0F, 3.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(41, 30).addBox(-3.0F, 6.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), 
/*     */         
/*  68 */         PartPose.offsetAndRotation(-5.0F, 2.0F, 0.0F, -1.5708F, 0.0F, 0.0F));
/*  69 */     PartDefinition TSCPistol = LeftArm.addOrReplaceChild("TSCPistol", 
/*  70 */         CubeListBuilder.create().texOffs(21, 0).addBox(-2.0F, -2.3108F, 0.4651F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(40, 14)
/*  71 */         .addBox(-2.0F, -3.3108F, -2.5349F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(53, 46)
/*  72 */         .addBox(-2.0F, -0.3108F, -1.5349F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  73 */         PartPose.offsetAndRotation(0.0F, 9.0F, 1.0F, 1.9635F, 0.0F, 0.0F));
/*  74 */     PartDefinition bone2 = TSCPistol.addOrReplaceChild("bone2", 
/*  75 */         CubeListBuilder.create().texOffs(0, 14).addBox(-2.0F, -7.0F, 3.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 14)
/*  76 */         .addBox(-1.5F, -10.0F, 3.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
/*  77 */         .addBox(-2.0F, -11.0F, 4.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(21, 4)
/*  78 */         .addBox(-2.0F, -6.0F, 5.0F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 5).addBox(-2.0F, -6.0F, 5.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), 
/*     */         
/*  80 */         PartPose.offsetAndRotation(0.0F, 1.8806F, 1.927F, 1.1781F, 0.0F, 0.0F));
/*  81 */     PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", 
/*  82 */         CubeListBuilder.create().texOffs(40, 41).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 50)
/*  83 */         .addBox(-1.0F, 3.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 41)
/*  84 */         .addBox(-1.0F, 6.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  85 */         PartPose.offset(5.0F, 2.0F, 0.0F));
/*  86 */     PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create(), PartPose.offset(-2.0F, 12.0F, 0.0F));
/*  87 */     PartDefinition cube_r1 = LeftLeg.addOrReplaceChild("cube_r1", 
/*  88 */         CubeListBuilder.create().texOffs(48, 17).addBox(-2.0F, 4.3732F, -4.2794F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  89 */         PartPose.offset(0.0F, 4.6268F, 1.6794F));
/*  90 */     PartDefinition cube_r2 = LeftLeg.addOrReplaceChild("cube_r2", 
/*  91 */         CubeListBuilder.create().texOffs(52, 0).addBox(-1.5F, 0.0F, -1.0F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), 
/*  92 */         PartPose.offsetAndRotation(0.0F, 4.6268F, 2.2794F, -0.3927F, 0.0F, 0.0F));
/*  93 */     PartDefinition cube_r3 = LeftLeg.addOrReplaceChild("cube_r3", 
/*  94 */         CubeListBuilder.create().texOffs(36, 20).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  95 */         PartPose.offsetAndRotation(0.0F, 2.5637F, -2.5296F, 0.7854F, 0.0F, 0.0F));
/*  96 */     PartDefinition cube_r4 = LeftLeg.addOrReplaceChild("cube_r4", 
/*  97 */         CubeListBuilder.create().texOffs(28, 35).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  98 */         PartPose.offsetAndRotation(0.0F, -0.8F, 0.2F, -0.3927F, 0.0F, 0.0F));
/*  99 */     PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create(), PartPose.offset(2.0F, 12.0F, 0.0F));
/* 100 */     PartDefinition cube_r5 = RightLeg.addOrReplaceChild("cube_r5", 
/* 101 */         CubeListBuilder.create().texOffs(46, 10).addBox(-2.0F, 4.3732F, -4.2794F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 102 */         PartPose.offset(0.0F, 4.6268F, 1.6794F));
/* 103 */     PartDefinition cube_r6 = RightLeg.addOrReplaceChild("cube_r6", 
/* 104 */         CubeListBuilder.create().texOffs(44, 50).addBox(-1.5F, 0.0F, -1.0F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 105 */         PartPose.offsetAndRotation(0.0F, 4.6268F, 2.2794F, -0.3927F, 0.0F, 0.0F));
/* 106 */     PartDefinition cube_r7 = RightLeg.addOrReplaceChild("cube_r7", 
/* 107 */         CubeListBuilder.create().texOffs(12, 35).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 108 */         PartPose.offsetAndRotation(0.0F, 2.5637F, -2.5296F, 0.7854F, 0.0F, 0.0F));
/* 109 */     PartDefinition cube_r8 = RightLeg.addOrReplaceChild("cube_r8", 
/* 110 */         CubeListBuilder.create().texOffs(0, 27).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 111 */         PartPose.offsetAndRotation(0.0F, -0.8F, 0.2F, -0.3927F, 0.0F, 0.0F));
/* 112 */     return LayerDefinition.create(meshdefinition, 80, 80);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 118 */     this.Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 119 */     this.Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 120 */     this.LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 121 */     this.RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 122 */     this.LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 123 */     this.RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */   
/*     */   public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
/* 127 */     this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
/* 128 */     this.Head.yRot = netHeadYaw / 57.295776F;
/* 129 */     this.Head.xRot = headPitch / 57.295776F;
/* 130 */     this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
/* 131 */     this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\client\model\Modeltsc_outsider_ranged_model.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */