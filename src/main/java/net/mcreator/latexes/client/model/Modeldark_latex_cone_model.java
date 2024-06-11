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
/*     */ public class Modeldark_latex_cone_model<T extends Entity>
/*     */   extends EntityModel<T>
/*     */ {
/*  25 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("latex", "modeldark_latex_cone_model"), "main");
/*     */   
/*     */   public final ModelPart head;
/*     */   public final ModelPart body;
/*     */   public final ModelPart leftArm;
/*     */   public final ModelPart rightArm;
/*     */   public final ModelPart leftLeg;
/*     */   public final ModelPart rightLeg;
/*     */   
/*     */   public Modeldark_latex_cone_model(ModelPart root) {
/*  35 */     this.head = root.getChild("head");
/*  36 */     this.body = root.getChild("body");
/*  37 */     this.leftArm = root.getChild("leftArm");
/*  38 */     this.rightArm = root.getChild("rightArm");
/*  39 */     this.leftLeg = root.getChild("leftLeg");
/*  40 */     this.rightLeg = root.getChild("rightLeg");
/*     */   }
/*     */   
/*     */   public static LayerDefinition createBodyLayer() {
/*  44 */     MeshDefinition meshdefinition = new MeshDefinition();
/*  45 */     PartDefinition partdefinition = meshdefinition.getRoot();
/*  46 */     PartDefinition head = partdefinition.addOrReplaceChild("head", 
/*  47 */         CubeListBuilder.create().texOffs(0, 22).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 11)
/*  48 */         .addBox(4.0F, -4.0F, -4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
/*  49 */         .addBox(-5.0F, -4.0F, -4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  50 */         PartPose.offset(0.0F, 0.0F, 0.0F));
/*  51 */     PartDefinition ears_t = head.addOrReplaceChild("ears_t", CubeListBuilder.create(), PartPose.offset(3.75F, -9.0F, 0.5F));
/*  52 */     PartDefinition ear_t_l = ears_t.addOrReplaceChild("ear_t_l", CubeListBuilder.create(), 
/*  53 */         PartPose.offsetAndRotation(-0.5F, 0.25F, 0.0F, -0.1338F, -0.5595F, 0.137F));
/*  54 */     PartDefinition Head_r1 = ear_t_l.addOrReplaceChild("Head_r1", 
/*  55 */         CubeListBuilder.create().texOffs(0, 22).addBox(0.5F, -1.75F, -1.625F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(38, 54)
/*  56 */         .addBox(-0.5F, -0.75F, -1.625F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), 
/*  57 */         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.3927F));
/*  58 */     PartDefinition ear_t_r = ears_t.addOrReplaceChild("ear_t_r", CubeListBuilder.create(), 
/*  59 */         PartPose.offsetAndRotation(-7.0F, 0.25F, 0.0F, -0.1338F, 0.5595F, -0.137F));
/*  60 */     PartDefinition Head_r2 = ear_t_r.addOrReplaceChild("Head_r2", 
/*  61 */         CubeListBuilder.create().texOffs(0, 22).mirror().addBox(-1.5F, -1.75F, -1.625F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
/*  62 */         .mirror(false).texOffs(38, 54).mirror().addBox(-0.5F, -0.75F, -1.625F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
/*  63 */         .mirror(false), 
/*  64 */         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, -0.3927F));
/*  65 */     PartDefinition ears_b = head.addOrReplaceChild("ears_b", CubeListBuilder.create(), PartPose.offset(3.5F, -9.0F, 0.5F));
/*  66 */     PartDefinition ear_b_l = ears_b.addOrReplaceChild("ear_b_l", CubeListBuilder.create(), 
/*  67 */         PartPose.offsetAndRotation(0.875F, 5.0F, 1.0F, -0.7719F, -0.4612F, 1.3981F));
/*  68 */     PartDefinition Head_r3 = ear_b_l.addOrReplaceChild("Head_r3", 
/*  69 */         CubeListBuilder.create().texOffs(24, 22).addBox(-0.5F, -1.75F, -1.625F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(25, 0)
/*  70 */         .addBox(0.5F, -2.75F, -1.625F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/*  71 */         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.3927F));
/*  72 */     PartDefinition ear_b_r = ears_b.addOrReplaceChild("ear_b_r", CubeListBuilder.create(), 
/*  73 */         PartPose.offsetAndRotation(-7.875F, 5.0F, 1.0F, -0.7719F, 0.4612F, -1.3981F));
/*  74 */     PartDefinition Head_r4 = ear_b_r.addOrReplaceChild("Head_r4", 
/*  75 */         CubeListBuilder.create().texOffs(24, 22).mirror().addBox(-0.5F, -1.75F, -1.625F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
/*  76 */         .mirror(false).texOffs(25, 0).mirror().addBox(-1.5F, -2.75F, -1.625F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
/*  77 */         .mirror(false), 
/*  78 */         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, -0.3927F));
/*  79 */     PartDefinition mask = head.addOrReplaceChild("mask", 
/*  80 */         CubeListBuilder.create().texOffs(12, 15).addBox(-1.0F, -8.0F, -5.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 18)
/*  81 */         .addBox(-4.0F, -3.0F, -5.0F, 8.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(25, 9)
/*  82 */         .addBox(-3.0F, -2.0F, -5.0F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(12, 3)
/*  83 */         .addBox(-2.5F, -1.0F, -5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(3, 11)
/*  84 */         .addBox(1.5F, -1.0F, -5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(25, 10)
/*  85 */         .addBox(-3.0F, -6.0F, -5.0F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(25, 11)
/*  86 */         .addBox(-2.0F, -7.0F, -5.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(3, 14)
/*  87 */         .addBox(-0.5F, -4.0F, -5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(15, 1)
/*  88 */         .addBox(2.375F, -4.0F, -5.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 3)
/*  89 */         .addBox(-4.375F, -4.0F, -5.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(4, 13)
/*  90 */         .addBox(-3.375F, -5.0F, -5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(4, 12)
/*  91 */         .addBox(2.375F, -5.0F, -5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(12, 0)
/*  92 */         .addBox(-1.5F, -5.0F, -5.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), 
/*  93 */         PartPose.offset(0.0F, 0.0F, 0.75F));
/*  94 */     PartDefinition hears = head.addOrReplaceChild("hears", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
/*  95 */     PartDefinition body = partdefinition.addOrReplaceChild("body", 
/*  96 */         CubeListBuilder.create().texOffs(32, 22).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  97 */         PartPose.offset(0.0F, 0.0F, 0.0F));
/*  98 */     PartDefinition Tail = body.addOrReplaceChild("Tail", 
/*  99 */         CubeListBuilder.create().texOffs(0, 0).addBox(-1.25F, -0.6125F, 0.7823F, 3.0F, 3.0F, 19.0F, new CubeDeformation(0.0F)).texOffs(51, 32)
/* 100 */         .addBox(-1.25F, -0.6125F, 19.7823F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(25, 0)
/* 101 */         .addBox(-1.25F, 2.3875F, 4.7823F, 3.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 11)
/* 102 */         .addBox(-1.25F, -1.6125F, -0.2177F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(22, 37)
/* 103 */         .addBox(-1.25F, -1.6125F, 14.7823F, 3.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), 
/* 104 */         PartPose.offsetAndRotation(0.0F, 9.0F, 1.0F, -0.5672F, 0.0F, 0.0F));
/* 105 */     PartDefinition leftArm = partdefinition.addOrReplaceChild("leftArm", 
/* 106 */         CubeListBuilder.create().texOffs(0, 38).addBox(-2.0F, 3.0F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 54)
/* 107 */         .addBox(-1.0F, -2.0F, -2.0F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(12, 13)
/* 108 */         .addBox(-2.0F, 10.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 1)
/* 109 */         .addBox(-2.0F, 10.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 11)
/* 110 */         .addBox(-2.0F, 10.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 111 */         PartPose.offset(-6.0F, 2.0F, 0.0F));
/* 112 */     PartDefinition rightArm = partdefinition.addOrReplaceChild("rightArm", 
/* 113 */         CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, 3.0F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(27, 48)
/* 114 */         .addBox(-2.0F, -2.0F, -2.0F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(15, 10)
/* 115 */         .addBox(1.0F, 10.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(15, 2)
/* 116 */         .addBox(1.0F, 10.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 14)
/* 117 */         .addBox(1.0F, 10.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 118 */         PartPose.offset(6.0F, 2.0F, 0.0F));
/* 119 */     PartDefinition leftLeg = partdefinition.addOrReplaceChild("leftLeg", 
/* 120 */         CubeListBuilder.create().texOffs(55, 53).addBox(-2.0F, 1.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
/* 121 */         .texOffs(55, 6).addBox(-2.375F, 12.213F, -2.1649F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 122 */         PartPose.offset(-2.0F, 10.0F, 0.0F));
/* 123 */     PartDefinition bone = leftLeg.addOrReplaceChild("bone", 
/* 124 */         CubeListBuilder.create().texOffs(44, 13).addBox(-2.125F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 125 */         PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 126 */     PartDefinition bone3 = leftLeg.addOrReplaceChild("bone3", 
/* 127 */         CubeListBuilder.create().texOffs(43, 0).addBox(-6.25F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 128 */         PartPose.offsetAndRotation(4.0F, 5.0F, -1.0F, 0.6545F, 0.0F, 0.0F));
/* 129 */     PartDefinition bone4 = leftLeg.addOrReplaceChild("bone4", 
/* 130 */         CubeListBuilder.create().texOffs(13, 48).addBox(-2.375F, -0.1371F, 3.7689F, 4.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 131 */         PartPose.offsetAndRotation(0.0F, 5.0F, -1.0F, -0.48F, 0.0F, 0.0F));
/* 132 */     PartDefinition rightLeg = partdefinition.addOrReplaceChild("rightLeg", 
/* 133 */         CubeListBuilder.create().texOffs(54, 39).addBox(-2.0F, 1.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
/* 134 */         .texOffs(25, 13).addBox(-1.625F, 12.213F, -2.1649F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 135 */         PartPose.offset(2.0F, 10.0F, 0.0F));
/* 136 */     PartDefinition bone5 = rightLeg.addOrReplaceChild("bone5", 
/* 137 */         CubeListBuilder.create().texOffs(16, 38).addBox(-1.875F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 138 */         PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 139 */     PartDefinition bone6 = rightLeg.addOrReplaceChild("bone6", 
/* 140 */         CubeListBuilder.create().texOffs(38, 37).addBox(2.25F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 141 */         PartPose.offsetAndRotation(-4.0F, 5.0F, -1.0F, 0.6545F, 0.0F, 0.0F));
/* 142 */     PartDefinition bone7 = rightLeg.addOrReplaceChild("bone7", 
/* 143 */         CubeListBuilder.create().texOffs(45, 47).addBox(-1.625F, -0.1371F, 3.7689F, 4.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 144 */         PartPose.offsetAndRotation(0.0F, 5.0F, -1.0F, -0.48F, 0.0F, 0.0F));
/* 145 */     return LayerDefinition.create(meshdefinition, 128, 128);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 151 */     this.head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 152 */     this.body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 153 */     this.leftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 154 */     this.rightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 155 */     this.leftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 156 */     this.rightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */   
/*     */   public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
/* 160 */     this.head.yRot = netHeadYaw / 57.295776F;
/* 161 */     this.head.xRot = headPitch / 57.295776F;
/* 162 */     this.rightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
/* 163 */     this.rightArm.xRot = Mth.cos(limbSwing * 0.6662F + 3.1415927F) * limbSwingAmount;
/* 164 */     this.leftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
/* 165 */     this.leftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\client\model\Modeldark_latex_cone_model.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */