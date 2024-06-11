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
/*     */ public class Modeldark_latex_cake_model<T extends Entity>
/*     */   extends EntityModel<T>
/*     */ {
/*  25 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("latex", "modeldark_latex_cake_model"), "main");
/*     */   
/*     */   public final ModelPart head;
/*     */   public final ModelPart body;
/*     */   public final ModelPart leftArm;
/*     */   public final ModelPart rightArm;
/*     */   public final ModelPart leftLeg;
/*     */   public final ModelPart rightLeg;
/*     */   
/*     */   public Modeldark_latex_cake_model(ModelPart root) {
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
/*  47 */         CubeListBuilder.create().texOffs(24, 22).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(27, 2)
/*  48 */         .addBox(4.0F, -3.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(27, 0)
/*  49 */         .addBox(-5.0F, -3.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 14)
/*  50 */         .addBox(-6.0F, -2.0F, -4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 16)
/*  51 */         .addBox(4.0F, -2.0F, -4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  52 */         PartPose.offset(0.0F, 0.0F, 0.0F));
/*  53 */     PartDefinition Head_r1 = head.addOrReplaceChild("Head_r1", 
/*  54 */         CubeListBuilder.create().texOffs(0, 0).addBox(0.5F, -2.75F, -1.625F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 14)
/*  55 */         .addBox(-0.5F, -1.75F, -1.625F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), 
/*  56 */         PartPose.offsetAndRotation(4.5F, -8.0F, 0.5F, 0.0F, 1.5708F, 0.6109F));
/*  57 */     PartDefinition Head_r2 = head.addOrReplaceChild("Head_r2", 
/*  58 */         CubeListBuilder.create().texOffs(15, 30).addBox(-0.5F, -0.75F, -1.625F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(5, 19)
/*  59 */         .addBox(-1.5F, -1.75F, -1.625F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), 
/*  60 */         PartPose.offsetAndRotation(-5.5F, -7.5F, 0.5F, 0.0F, -1.5708F, -0.9599F));
/*  61 */     PartDefinition Cake = head.addOrReplaceChild("Cake", 
/*  62 */         CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -32.0F, -5.0F, 9.0F, 5.0F, 9.0F, new CubeDeformation(0.0F))
/*  63 */         .texOffs(5, 14).addBox(-0.5F, -32.875F, -1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), 
/*  64 */         PartPose.offset(-0.375F, 23.625F, 0.5F));
/*  65 */     PartDefinition mask = head.addOrReplaceChild("mask", 
/*  66 */         CubeListBuilder.create().texOffs(0, 26).addBox(1.0F, -7.0F, -5.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(19, 21)
/*  67 */         .addBox(-4.0F, -3.0F, -5.0F, 8.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(5, 2)
/*  68 */         .addBox(-1.0F, -6.0F, -5.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(19, 25)
/*  69 */         .addBox(-3.0F, -7.0F, -5.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(11, 14)
/*  70 */         .addBox(-0.5F, -4.0F, -5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 14)
/*  71 */         .addBox(-3.375F, -6.0F, -5.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
/*  72 */         .addBox(2.375F, -6.0F, -5.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(5, 14)
/*  73 */         .addBox(-0.5F, -5.0F, -5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), 
/*  74 */         PartPose.offset(0.0F, 0.0F, 0.75F));
/*     */     
/*  76 */     PartDefinition body = partdefinition.addOrReplaceChild("body", 
/*  77 */         CubeListBuilder.create().texOffs(27, 0).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
/*  78 */         .texOffs(31, 9).addBox(-4.0F, 5.0F, -3.0F, 8.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), 
/*  79 */         PartPose.offset(0.0F, 0.0F, 0.0F));
/*  80 */     PartDefinition Tail = body.addOrReplaceChild("Tail", 
/*  81 */         CubeListBuilder.create().texOffs(0, 14).addBox(-1.25F, -0.6125F, 0.7823F, 3.0F, 3.0F, 13.0F, new CubeDeformation(0.0F))
/*  82 */         .texOffs(19, 22).addBox(-1.25F, -0.6125F, 13.7823F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 38)
/*  83 */         .addBox(-1.25F, 2.3875F, 4.7823F, 3.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(19, 14)
/*  84 */         .addBox(-1.25F, -1.6125F, -0.2177F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), 
/*  85 */         PartPose.offsetAndRotation(0.0F, 9.0F, 1.0F, -0.5672F, 0.0F, 0.0F));
/*  86 */     PartDefinition Cake4 = Tail.addOrReplaceChild("Cake4", 
/*  87 */         CubeListBuilder.create().texOffs(0, 30).addBox(-1.75F, -17.1125F, 0.4073F, 4.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), 
/*  88 */         PartPose.offset(0.0F, 15.0F, -1.0F));
/*  89 */     PartDefinition leftArm = partdefinition.addOrReplaceChild("leftArm", 
/*  90 */         CubeListBuilder.create().texOffs(0, 43).addBox(-4.0F, 4.0F, -2.0F, 5.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(44, 61)
/*  91 */         .addBox(-2.0F, -1.0F, -2.0F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(20, 30)
/*  92 */         .addBox(-4.0F, 11.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(27, 22)
/*  93 */         .addBox(-4.0F, 11.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 30)
/*  94 */         .addBox(-4.0F, 11.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  95 */         PartPose.offset(-5.0F, 1.0F, 0.0F));
/*  96 */     PartDefinition Cake2 = leftArm.addOrReplaceChild("Cake2", 
/*  97 */         CubeListBuilder.create().texOffs(51, 33).addBox(-8.0F, -19.0F, -3.0F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), 
/*  98 */         PartPose.offset(5.5F, 17.25F, 0.5F));
/*  99 */     PartDefinition rightArm = partdefinition.addOrReplaceChild("rightArm", 
/* 100 */         CubeListBuilder.create().texOffs(36, 38).addBox(-1.0F, 4.0F, -2.0F, 5.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(30, 59)
/* 101 */         .addBox(-1.0F, -1.0F, -2.0F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(3, 33)
/* 102 */         .addBox(3.0F, 11.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 32)
/* 103 */         .addBox(3.0F, 11.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 31)
/* 104 */         .addBox(3.0F, 11.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 105 */         PartPose.offset(5.0F, 1.0F, 0.0F));
/* 106 */     PartDefinition Cake3 = rightArm.addOrReplaceChild("Cake3", 
/* 107 */         CubeListBuilder.create().texOffs(51, 0).addBox(4.0F, -19.0F, -3.0F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 108 */         PartPose.offset(-5.5F, 17.25F, 0.5F));
/* 109 */     PartDefinition leftLeg = partdefinition.addOrReplaceChild("leftLeg", 
/* 110 */         CubeListBuilder.create().texOffs(58, 61).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(49, 44)
/* 111 */         .addBox(-2.375F, 10.213F, -3.1649F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(19, 18)
/* 112 */         .addBox(-2.375F, 12.213F, -4.1649F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 17)
/* 113 */         .addBox(0.625F, 12.213F, -4.1649F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(5, 0)
/* 114 */         .addBox(-0.875F, 12.213F, -4.1649F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 115 */         PartPose.offset(-2.0F, 11.0F, 0.0F));
/* 116 */     PartDefinition bone = leftLeg.addOrReplaceChild("bone", 
/* 117 */         CubeListBuilder.create().texOffs(0, 54).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 118 */         PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 119 */     PartDefinition bone3 = leftLeg.addOrReplaceChild("bone3", 
/* 120 */         CubeListBuilder.create().texOffs(34, 49).addBox(-6.375F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 121 */         PartPose.offsetAndRotation(4.0F, 4.0F, -1.0F, 0.6545F, 0.0F, 0.0F));
/* 122 */     PartDefinition bone4 = leftLeg.addOrReplaceChild("bone4", 
/* 123 */         CubeListBuilder.create().texOffs(16, 57).addBox(-2.375F, -0.1371F, 3.7689F, 4.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 124 */         PartPose.offsetAndRotation(0.0F, 4.0F, -1.0F, -0.48F, 0.0F, 0.0F));
/* 125 */     PartDefinition rightLeg = partdefinition.addOrReplaceChild("rightLeg", 
/* 126 */         CubeListBuilder.create().texOffs(61, 17).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 20)
/* 127 */         .addBox(-1.625F, 10.213F, -3.1649F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(26, 25)
/* 128 */         .addBox(1.375F, 12.213F, -4.1649F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 24)
/* 129 */         .addBox(-1.625F, 12.213F, -4.1649F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 22)
/* 130 */         .addBox(-0.125F, 12.213F, -4.1649F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 131 */         PartPose.offset(2.0F, 11.0F, 0.0F));
/* 132 */     PartDefinition bone5 = rightLeg.addOrReplaceChild("bone5", 
/* 133 */         CubeListBuilder.create().texOffs(50, 52).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 134 */         PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 135 */     PartDefinition bone6 = rightLeg.addOrReplaceChild("bone6", 
/* 136 */         CubeListBuilder.create().texOffs(18, 47).addBox(2.375F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 137 */         PartPose.offsetAndRotation(-4.0F, 4.0F, -1.0F, 0.6545F, 0.0F, 0.0F));
/* 138 */     PartDefinition bone7 = rightLeg.addOrReplaceChild("bone7", 
/* 139 */         CubeListBuilder.create().texOffs(57, 7).addBox(-1.625F, -0.1371F, 3.7689F, 4.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 140 */         PartPose.offsetAndRotation(0.0F, 4.0F, -1.0F, -0.48F, 0.0F, 0.0F));
/* 141 */     return LayerDefinition.create(meshdefinition, 80, 80);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 147 */     this.head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 148 */     this.body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 149 */     this.leftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 150 */     this.rightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 151 */     this.leftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 152 */     this.rightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */   
/*     */   public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
/* 156 */     this.head.yRot = netHeadYaw / 57.295776F;
/* 157 */     this.head.xRot = headPitch / 57.295776F;
/* 158 */     this.rightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
/* 159 */     this.rightArm.xRot = Mth.cos(limbSwing * 0.6662F + 3.1415927F) * limbSwingAmount;
/* 160 */     this.leftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
/* 161 */     this.leftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\client\model\Modeldark_latex_cake_model.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */