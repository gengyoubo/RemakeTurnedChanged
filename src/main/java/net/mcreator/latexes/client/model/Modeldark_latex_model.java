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
/*     */ public class Modeldark_latex_model<T extends Entity>
/*     */   extends EntityModel<T>
/*     */ {
/*  25 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("latex", "modeldark_latex_model"), "main");
/*     */   public final ModelPart head;
/*     */   public final ModelPart body;
/*     */   public final ModelPart leftArm;
/*     */   public final ModelPart rightArm;
/*     */   public final ModelPart leftLeg;
/*     */   public final ModelPart rightLeg;
/*     */   
/*     */   public Modeldark_latex_model(ModelPart root) {
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
/*  46 */         CubeListBuilder.create().texOffs(0, 16).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(19, 10)
/*  47 */         .addBox(4.0F, -4.0F, -4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 7)
/*  48 */         .addBox(-5.0F, -4.0F, -4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  49 */         PartPose.offset(0.0F, 0.0F, 0.0F));
/*  50 */     PartDefinition Head_r1 = head.addOrReplaceChild("Head_r1", 
/*  51 */         CubeListBuilder.create().texOffs(0, 0).addBox(0.5F, -1.75F, -1.625F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
/*  52 */         .addBox(-0.5F, -0.75F, -1.625F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), 
/*  53 */         PartPose.offsetAndRotation(3.5F, -9.0F, 0.5F, 0.0F, 1.5708F, 0.3927F));
/*  54 */     PartDefinition Head_r2 = head.addOrReplaceChild("Head_r2", 
/*  55 */         CubeListBuilder.create().texOffs(19, 0).addBox(-0.5F, -0.75F, -1.625F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(5, 4)
/*  56 */         .addBox(-1.5F, -1.75F, -1.625F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), 
/*  57 */         PartPose.offsetAndRotation(-3.5F, -9.0F, 0.5F, 0.0F, -1.5708F, -0.3927F));
/*  58 */     PartDefinition mask = head.addOrReplaceChild("mask", 
/*  59 */         CubeListBuilder.create().texOffs(23, 12).addBox(-1.0F, -8.0F, -5.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(19, 9)
/*  60 */         .addBox(-4.0F, -3.0F, -5.0F, 8.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 11)
/*  61 */         .addBox(-3.0F, -2.0F, -5.0F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
/*  62 */         .addBox(-2.5F, -1.0F, -5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
/*  63 */         .addBox(1.5F, -1.0F, -5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 12)
/*  64 */         .addBox(-3.0F, -6.0F, -5.0F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(19, 6)
/*  65 */         .addBox(-2.0F, -7.0F, -5.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(10, 4)
/*  66 */         .addBox(-0.5F, -4.0F, -5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 10)
/*  67 */         .addBox(2.375F, -4.0F, -5.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(8, 3)
/*  68 */         .addBox(-4.375F, -4.0F, -5.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(3, 7)
/*  69 */         .addBox(-3.375F, -5.0F, -5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 2)
/*  70 */         .addBox(2.375F, -5.0F, -5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(19, 7)
/*  71 */         .addBox(-1.5F, -5.0F, -5.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), 
/*  72 */         PartPose.offset(0.0F, 0.0F, 0.75F));
/*  73 */     PartDefinition body = partdefinition.addOrReplaceChild("body", 
/*  74 */         CubeListBuilder.create().texOffs(28, 28).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  75 */         PartPose.offset(0.0F, 0.0F, 0.0F));
/*  76 */     PartDefinition Tail = body.addOrReplaceChild("Tail", 
/*  77 */         CubeListBuilder.create().texOffs(0, 0).addBox(-1.25F, -0.6125F, 0.7823F, 3.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(5, 0)
/*  78 */         .addBox(-1.25F, -0.6125F, 13.7823F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 0)
/*  79 */         .addBox(-1.25F, 2.3875F, 4.7823F, 3.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(38, 17)
/*  80 */         .addBox(-1.25F, -1.6125F, -0.2177F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), 
/*  81 */         PartPose.offsetAndRotation(0.0F, 9.0F, 1.0F, -0.5672F, 0.0F, 0.0F));
/*  82 */     PartDefinition leftArm = partdefinition.addOrReplaceChild("leftArm", 
/*  83 */         CubeListBuilder.create().texOffs(0, 32).addBox(-2.0F, 3.0F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(52, 11)
/*  84 */         .addBox(-1.0F, -2.0F, -2.0F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(23, 10)
/*  85 */         .addBox(-2.0F, 10.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 22)
/*  86 */         .addBox(-2.0F, 10.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 22)
/*  87 */         .addBox(-2.0F, 10.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  88 */         PartPose.offset(-6.0F, 2.0F, 0.0F));
/*  89 */     PartDefinition rightArm = partdefinition.addOrReplaceChild("rightArm", 
/*  90 */         CubeListBuilder.create().texOffs(28, 12).addBox(-2.0F, 3.0F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(52, 0)
/*  91 */         .addBox(-2.0F, -2.0F, -2.0F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(24, 20)
/*  92 */         .addBox(1.0F, 10.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 18)
/*  93 */         .addBox(1.0F, 10.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 16)
/*  94 */         .addBox(1.0F, 10.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  95 */         PartPose.offset(6.0F, 2.0F, 0.0F));
/*  96 */     PartDefinition leftLeg = partdefinition.addOrReplaceChild("leftLeg", 
/*  97 */         CubeListBuilder.create().texOffs(52, 36).addBox(-2.0F, 1.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
/*  98 */         .texOffs(52, 30).addBox(-2.0F, 12.213F, -2.1649F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  99 */         PartPose.offset(-2.0F, 10.0F, 0.0F));
/* 100 */     PartDefinition bone = leftLeg.addOrReplaceChild("bone", 
/* 101 */         CubeListBuilder.create().texOffs(44, 43).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 102 */         PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 103 */     PartDefinition bone3 = leftLeg.addOrReplaceChild("bone3", 
/* 104 */         CubeListBuilder.create().texOffs(40, 5).addBox(-6.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 105 */         PartPose.offsetAndRotation(4.0F, 5.0F, -1.0F, 0.6545F, 0.0F, 0.0F));
/* 106 */     PartDefinition bone4 = leftLeg.addOrReplaceChild("bone4", 
/* 107 */         CubeListBuilder.create().texOffs(14, 49).addBox(-2.0F, -0.1371F, 3.7689F, 4.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 108 */         PartPose.offsetAndRotation(0.0F, 5.0F, -1.0F, -0.48F, 0.0F, 0.0F));
/* 109 */     PartDefinition rightLeg = partdefinition.addOrReplaceChild("rightLeg", 
/* 110 */         CubeListBuilder.create().texOffs(28, 52).addBox(-2.0F, 1.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
/* 111 */         .texOffs(48, 24).addBox(-2.0F, 12.213F, -2.1649F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 112 */         PartPose.offset(2.0F, 10.0F, 0.0F));
/* 113 */     PartDefinition bone5 = rightLeg.addOrReplaceChild("bone5", 
/* 114 */         CubeListBuilder.create().texOffs(28, 43).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 115 */         PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 116 */     PartDefinition bone6 = rightLeg.addOrReplaceChild("bone6", 
/* 117 */         CubeListBuilder.create().texOffs(12, 39).addBox(2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 118 */         PartPose.offsetAndRotation(-4.0F, 5.0F, -1.0F, 0.6545F, 0.0F, 0.0F));
/* 119 */     PartDefinition bone7 = rightLeg.addOrReplaceChild("bone7", 
/* 120 */         CubeListBuilder.create().texOffs(0, 46).addBox(-2.0F, -0.1371F, 3.7689F, 4.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 121 */         PartPose.offsetAndRotation(0.0F, 5.0F, -1.0F, -0.48F, 0.0F, 0.0F));
/* 122 */     return LayerDefinition.create(meshdefinition, 128, 128);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 128 */     this.head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 129 */     this.body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 130 */     this.leftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 131 */     this.rightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 132 */     this.leftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 133 */     this.rightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */   
/*     */   public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
/* 137 */     this.head.yRot = netHeadYaw / 57.295776F;
/* 138 */     this.head.xRot = headPitch / 57.295776F;
/* 139 */     this.rightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
/* 140 */     this.rightArm.xRot = Mth.cos(limbSwing * 0.6662F + 3.1415927F) * limbSwingAmount;
/* 141 */     this.leftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
/* 142 */     this.leftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\client\model\Modeldark_latex_model.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */