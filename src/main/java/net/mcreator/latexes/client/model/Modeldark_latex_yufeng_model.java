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
/*     */ public class Modeldark_latex_yufeng_model<T extends Entity>
/*     */   extends EntityModel<T>
/*     */ {
/*  25 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("latex", "modeldark_latex_yufeng_model"), "main");
/*     */   
/*     */   public final ModelPart head;
/*     */   public final ModelPart body;
/*     */   public final ModelPart leftArm;
/*     */   public final ModelPart rightArm;
/*     */   public final ModelPart leftLeg;
/*     */   public final ModelPart rightLeg;
/*     */   
/*     */   public Modeldark_latex_yufeng_model(ModelPart root) {
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
/*  47 */         CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), 
/*  48 */         PartPose.offset(0.0F, 0.0F, 0.0F));
/*  49 */     PartDefinition Head_r1 = head.addOrReplaceChild("Head_r1", 
/*  50 */         CubeListBuilder.create().texOffs(38, 55).addBox(-1.5F, -7.75F, -1.625F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 30)
/*  51 */         .addBox(-1.5F, -4.75F, -1.625F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/*  52 */         PartPose.offsetAndRotation(-3.0F, -5.5F, -0.5F, -1.309F, 0.0F, 0.0F));
/*  53 */     PartDefinition Head_r2 = head.addOrReplaceChild("Head_r2", 
/*  54 */         CubeListBuilder.create().texOffs(44, 55).addBox(0.5F, -7.75F, -1.625F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(4, 52)
/*  55 */         .addBox(0.5F, -4.75F, -1.625F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/*  56 */         PartPose.offsetAndRotation(3.0F, -5.5F, -0.5F, -1.309F, 0.0F, 0.0F));
/*  57 */     PartDefinition Head_r3 = head.addOrReplaceChild("Head_r3", 
/*  58 */         CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(20, 16)
/*  59 */         .addBox(-0.5F, -2.875F, 1.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 1).addBox(-0.5F, -2.875F, -1.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), 
/*     */         
/*  61 */         PartPose.offsetAndRotation(-4.125F, -0.75F, -2.25F, 0.0F, -0.3927F, 0.0F));
/*  62 */     PartDefinition Head_r4 = head.addOrReplaceChild("Head_r4", 
/*  63 */         CubeListBuilder.create().texOffs(0, 31).addBox(-0.5F, -1.5F, 1.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 54)
/*  64 */         .addBox(-1.5F, -1.5F, -1.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 4).addBox(-0.5F, 0.875F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), 
/*     */         
/*  66 */         PartPose.offsetAndRotation(4.125F, -2.125F, -2.25F, 0.0F, 0.3927F, 0.0F));
/*  67 */     PartDefinition Head_r5 = head.addOrReplaceChild("Head_r5", 
/*  68 */         CubeListBuilder.create().texOffs(0, 16).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 0)
/*  69 */         .addBox(-6.25F, -2.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  70 */         PartPose.offsetAndRotation(2.875F, -8.125F, -3.875F, 0.7854F, 0.0F, 0.0F));
/*  71 */     PartDefinition mask = head.addOrReplaceChild("mask", 
/*  72 */         CubeListBuilder.create().texOffs(30, 30).addBox(-1.0F, -8.0F, -5.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(50, 0)
/*  73 */         .addBox(-4.0F, -3.0F, -5.0F, 8.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(20, 19)
/*  74 */         .addBox(-3.0F, -2.0F, -5.0F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(5, 5)
/*  75 */         .addBox(-2.5F, -1.0F, -5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(5, 4)
/*  76 */         .addBox(1.5F, -1.0F, -5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(24, 7)
/*  77 */         .addBox(-3.0F, -6.0F, -5.0F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(24, 20)
/*  78 */         .addBox(-2.0F, -7.0F, -5.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(27, 0)
/*  79 */         .addBox(-0.5F, -4.0F, -5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(24, 22)
/*  80 */         .addBox(2.375F, -4.0F, -5.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(24, 4)
/*  81 */         .addBox(-4.375F, -4.0F, -5.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(5, 6)
/*  82 */         .addBox(-3.375F, -5.0F, -5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 6)
/*  83 */         .addBox(2.375F, -5.0F, -5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(24, 21)
/*  84 */         .addBox(-1.5F, -5.0F, -5.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), 
/*  85 */         PartPose.offset(0.0F, 0.0F, 0.75F));
/*  86 */     PartDefinition body = partdefinition.addOrReplaceChild("body", 
/*  87 */         CubeListBuilder.create().texOffs(0, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  88 */         PartPose.offset(0.0F, 0.0F, 0.0F));
/*  89 */     PartDefinition tail = body.addOrReplaceChild("tail", 
/*  90 */         CubeListBuilder.create().texOffs(24, 0).addBox(-1.25F, 17.6466F, 12.6581F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), 
/*  91 */         PartPose.offset(0.0F, -0.125F, 0.375F));
/*  92 */     PartDefinition cube_r1 = tail.addOrReplaceChild("cube_r1", 
/*  93 */         CubeListBuilder.create().texOffs(16, 23).addBox(-1.5F, 11.0F, 11.5F, 3.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), 
/*  94 */         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/*  95 */     PartDefinition cube_r2 = tail.addOrReplaceChild("cube_r2", 
/*  96 */         CubeListBuilder.create().texOffs(24, 8).addBox(-1.5F, 5.5F, 8.0F, 3.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), 
/*  97 */         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
/*  98 */     PartDefinition wings = body.addOrReplaceChild("wings", CubeListBuilder.create(), PartPose.offset(0.0F, -0.125F, 0.375F));
/*  99 */     PartDefinition wing_left = wings.addOrReplaceChild("wing_left", 
/* 100 */         CubeListBuilder.create().texOffs(0, 4).addBox(1.0F, 2.0F, 2.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(56, 6)
/* 101 */         .addBox(3.0F, 1.0F, 2.0F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(35, 0)
/* 102 */         .addBox(2.0F, 1.0F, 2.0F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(54, 55)
/* 103 */         .addBox(4.0F, 1.0F, 2.0F, 1.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(52, 55)
/* 104 */         .addBox(5.0F, 0.0F, 2.0F, 1.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(32, 55)
/* 105 */         .addBox(6.0F, 0.0F, 2.0F, 1.0F, 11.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(5, 1)
/* 106 */         .addBox(5.0F, 11.0F, 2.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(36, 55)
/* 107 */         .addBox(7.0F, -1.0F, 2.0F, 1.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(18, 54)
/* 108 */         .addBox(8.0F, -4.0F, 2.0F, 1.0F, 14.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(16, 54)
/* 109 */         .addBox(9.0F, -3.0F, 2.0F, 1.0F, 14.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(2, 52)
/* 110 */         .addBox(10.0F, -2.0F, 2.0F, 1.0F, 15.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(5, 2)
/* 111 */         .addBox(9.0F, 13.0F, 2.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), 
/* 112 */         PartPose.offset(0.0F, 0.0F, 0.0F));
/* 113 */     PartDefinition wing_right = wings.addOrReplaceChild("wing_right", 
/* 114 */         CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, 2.0F, 2.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(33, 0)
/* 115 */         .addBox(-3.0F, 1.0F, 2.0F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(32, 34)
/* 116 */         .addBox(-4.0F, 1.0F, 2.0F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(44, 9)
/* 117 */         .addBox(-5.0F, 1.0F, 2.0F, 1.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(50, 55)
/* 118 */         .addBox(-6.0F, 0.0F, 2.0F, 1.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(30, 55)
/* 119 */         .addBox(-7.0F, 0.0F, 2.0F, 1.0F, 11.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(34, 55)
/* 120 */         .addBox(-8.0F, -1.0F, 2.0F, 1.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 52)
/* 121 */         .addBox(-11.0F, -2.0F, 2.0F, 1.0F, 15.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(5, 0)
/* 122 */         .addBox(-10.0F, 13.0F, 2.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 2)
/* 123 */         .addBox(-6.0F, 11.0F, 2.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(14, 54)
/* 124 */         .addBox(-10.0F, -3.0F, 2.0F, 1.0F, 14.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(12, 52)
/* 125 */         .addBox(-9.0F, -4.0F, 2.0F, 1.0F, 14.0F, 0.0F, new CubeDeformation(0.0F)), 
/* 126 */         PartPose.offset(0.0F, 0.0F, 0.0F));
/* 127 */     PartDefinition leftArm = partdefinition.addOrReplaceChild("leftArm", 
/* 128 */         CubeListBuilder.create().texOffs(0, 31).addBox(-3.0F, 3.0F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(46, 9)
/* 129 */         .addBox(-2.0F, -2.0F, -2.0F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(38, 9)
/* 130 */         .addBox(-3.375F, 1.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), 
/* 131 */         PartPose.offset(-5.0F, 2.0F, 0.0F));
/* 132 */     PartDefinition claws_l = leftArm.addOrReplaceChild("claws_l", 
/* 133 */         CubeListBuilder.create().texOffs(29, 21).addBox(-8.0F, -12.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 31)
/* 134 */         .addBox(-8.0F, -12.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 33)
/* 135 */         .addBox(-8.0F, -12.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 136 */         PartPose.offset(5.0F, 22.0F, 0.0F));
/* 137 */     PartDefinition rightArm = partdefinition.addOrReplaceChild("rightArm", 
/* 138 */         CubeListBuilder.create().texOffs(30, 19).addBox(-1.0F, 3.0F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(54, 39)
/* 139 */         .addBox(2.375F, 1.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 40)
/* 140 */         .addBox(-1.0F, -2.0F, -2.0F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 141 */         PartPose.offset(5.0F, 2.0F, 0.0F));
/* 142 */     PartDefinition claws_r = rightArm.addOrReplaceChild("claws_r", 
/* 143 */         CubeListBuilder.create().texOffs(16, 36).addBox(7.0F, -12.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 34)
/* 144 */         .addBox(7.0F, -12.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 34)
/* 145 */         .addBox(7.0F, -12.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 146 */         PartPose.offset(-5.0F, 22.0F, 0.0F));
/* 147 */     PartDefinition leftLeg = partdefinition.addOrReplaceChild("leftLeg", 
/* 148 */         CubeListBuilder.create().texOffs(44, 49).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
/* 149 */         .texOffs(28, 49).addBox(-2.0F, 11.213F, -2.1649F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 150 */         PartPose.offset(-2.0F, 11.0F, 0.0F));
/* 151 */     PartDefinition bone = leftLeg.addOrReplaceChild("bone", 
/* 152 */         CubeListBuilder.create().texOffs(28, 40).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 153 */         PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 154 */     PartDefinition bone3 = leftLeg.addOrReplaceChild("bone3", 
/* 155 */         CubeListBuilder.create().texOffs(34, 30).addBox(-6.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 156 */         PartPose.offsetAndRotation(4.0F, 4.0F, -1.0F, 0.6545F, 0.0F, 0.0F));
/* 157 */     PartDefinition bone4 = leftLeg.addOrReplaceChild("bone4", 
/* 158 */         CubeListBuilder.create().texOffs(14, 44).addBox(-2.0F, -0.1371F, 3.7689F, 4.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 159 */         PartPose.offsetAndRotation(0.0F, 4.0F, -1.0F, -0.48F, 0.0F, 0.0F));
/* 160 */     PartDefinition rightLeg = partdefinition.addOrReplaceChild("rightLeg", 
/* 161 */         CubeListBuilder.create().texOffs(46, 24).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
/* 162 */         .texOffs(46, 18).addBox(-2.0F, 11.213F, -2.1649F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 163 */         PartPose.offset(2.0F, 11.0F, 0.0F));
/* 164 */     PartDefinition bone5 = rightLeg.addOrReplaceChild("bone5", 
/* 165 */         CubeListBuilder.create().texOffs(38, 0).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 166 */         PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 167 */     PartDefinition bone6 = rightLeg.addOrReplaceChild("bone6", 
/* 168 */         CubeListBuilder.create().texOffs(16, 34).addBox(2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 169 */         PartPose.offsetAndRotation(-4.0F, 4.0F, -1.0F, 0.6545F, 0.0F, 0.0F));
/* 170 */     PartDefinition bone7 = rightLeg.addOrReplaceChild("bone7", 
/* 171 */         CubeListBuilder.create().texOffs(0, 42).addBox(-2.0F, -0.1371F, 3.7689F, 4.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 172 */         PartPose.offsetAndRotation(0.0F, 4.0F, -1.0F, -0.48F, 0.0F, 0.0F));
/* 173 */     return LayerDefinition.create(meshdefinition, 128, 128);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 179 */     this.head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 180 */     this.body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 181 */     this.leftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 182 */     this.rightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 183 */     this.leftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 184 */     this.rightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */   
/*     */   public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
/* 188 */     this.head.yRot = netHeadYaw / 57.295776F;
/* 189 */     this.head.xRot = headPitch / 57.295776F;
/* 190 */     this.rightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
/* 191 */     this.rightArm.xRot = Mth.cos(limbSwing * 0.6662F + 3.1415927F) * limbSwingAmount;
/* 192 */     this.leftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
/* 193 */     this.leftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\client\model\Modeldark_latex_yufeng_model.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */