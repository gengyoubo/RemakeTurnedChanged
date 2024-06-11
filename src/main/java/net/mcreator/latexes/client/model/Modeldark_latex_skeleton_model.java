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
/*     */ public class Modeldark_latex_skeleton_model<T extends Entity>
/*     */   extends EntityModel<T>
/*     */ {
/*  25 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("latex", "modeldark_latex_skeleton_model"), "main");
/*     */   
/*     */   public final ModelPart head;
/*     */   public final ModelPart body;
/*     */   public final ModelPart rightArm;
/*     */   public final ModelPart leftArm;
/*     */   public final ModelPart leftLeg;
/*     */   public final ModelPart rightLeg;
/*     */   
/*     */   public Modeldark_latex_skeleton_model(ModelPart root) {
/*  35 */     this.head = root.getChild("head");
/*  36 */     this.body = root.getChild("body");
/*  37 */     this.rightArm = root.getChild("rightArm");
/*  38 */     this.leftArm = root.getChild("leftArm");
/*  39 */     this.leftLeg = root.getChild("leftLeg");
/*  40 */     this.rightLeg = root.getChild("rightLeg");
/*     */   }
/*     */   
/*     */   public static LayerDefinition createBodyLayer() {
/*  44 */     MeshDefinition meshdefinition = new MeshDefinition();
/*  45 */     PartDefinition partdefinition = meshdefinition.getRoot();
/*  46 */     PartDefinition head = partdefinition.addOrReplaceChild("head", 
/*  47 */         CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(20, 16)
/*  48 */         .addBox(4.0F, -3.0F, -4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
/*  49 */         .addBox(-5.0F, -3.0F, -4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 2)
/*  50 */         .addBox(-6.0F, -2.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 0)
/*  51 */         .addBox(5.0F, -2.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  52 */         PartPose.offset(0.0F, 0.0F, 0.0F));
/*  53 */     PartDefinition Head_r1 = head.addOrReplaceChild("Head_r1", 
/*  54 */         CubeListBuilder.create().texOffs(0, 0).addBox(0.5F, -1.75F, -1.625F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(20, 64)
/*  55 */         .addBox(-0.5F, -0.75F, -1.625F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), 
/*  56 */         PartPose.offsetAndRotation(3.5F, -9.0F, 0.5F, 0.0F, 1.5708F, 0.3927F));
/*  57 */     PartDefinition Head_r2 = head.addOrReplaceChild("Head_r2", 
/*  58 */         CubeListBuilder.create().texOffs(64, 23).addBox(-0.5F, -0.75F, -1.625F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(64, 0)
/*  59 */         .addBox(-1.5F, -1.75F, -1.625F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), 
/*  60 */         PartPose.offsetAndRotation(-3.5F, -9.0F, 0.5F, 0.0F, -1.5708F, -0.3927F));
/*  61 */     PartDefinition mask = head.addOrReplaceChild("mask", 
/*  62 */         CubeListBuilder.create().texOffs(23, 16).addBox(-1.0F, -8.0F, -5.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(24, 7)
/*  63 */         .addBox(-4.0F, -3.0F, -5.0F, 8.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(28, 23)
/*  64 */         .addBox(-3.0F, -2.0F, -5.0F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(28, 24)
/*  65 */         .addBox(-2.5F, -1.0F, -5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(22, 28)
/*  66 */         .addBox(1.5F, -1.0F, -5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(24, 6)
/*  67 */         .addBox(-4.0F, -6.0F, -5.0F, 8.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 7)
/*  68 */         .addBox(-2.0F, -7.0F, -5.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(22, 31)
/*  69 */         .addBox(-0.5F, -4.0F, -5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(20, 19)
/*  70 */         .addBox(2.375F, -4.0F, -5.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 19)
/*  71 */         .addBox(-4.375F, -4.0F, -5.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(20, 31)
/*  72 */         .addBox(-3.375F, -5.0F, -5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(30, 24)
/*  73 */         .addBox(2.375F, -5.0F, -5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(16, 28)
/*  74 */         .addBox(-1.5F, -5.0F, -5.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), 
/*  75 */         PartPose.offset(0.0F, 0.0F, 0.75F));
/*  76 */     PartDefinition body = partdefinition.addOrReplaceChild("body", 
/*  77 */         CubeListBuilder.create().texOffs(0, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(55, 59)
/*  78 */         .addBox(-4.125F, 3.0F, -2.125F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(60, 41)
/*  79 */         .addBox(-3.375F, 4.5F, -2.125F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(60, 18)
/*  80 */         .addBox(1.125F, 4.75F, -2.125F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(30, 55)
/*  81 */         .addBox(2.125F, 6.375F, -2.125F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(60, 46)
/*  82 */         .addBox(-3.375F, 6.375F, -2.125F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(52, 27)
/*  83 */         .addBox(-4.125F, 1.0F, -2.125F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(56, 13)
/*  84 */         .addBox(1.125F, 3.0F, -2.125F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(42, 50)
/*  85 */         .addBox(0.125F, 1.0F, -2.125F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(64, 7)
/*  86 */         .addBox(-3.25F, 1.0F, 0.125F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(25, 64)
/*  87 */         .addBox(-3.25F, 3.0F, 0.125F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 43)
/*  88 */         .addBox(0.75F, 1.0F, 0.125F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 57)
/*  89 */         .addBox(0.75F, 3.0F, 0.125F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 39)
/*  90 */         .addBox(-2.25F, 4.75F, 0.125F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 0)
/*  91 */         .addBox(0.75F, 4.75F, 0.125F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(32, 8)
/*  92 */         .addBox(0.75F, 6.375F, 0.125F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 33)
/*  93 */         .addBox(-2.25F, 6.375F, 0.125F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 25)
/*  94 */         .addBox(-3.0F, 5.0F, -2.0F, 6.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(24, 0)
/*  95 */         .addBox(-4.0F, 9.0F, -2.0F, 8.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(35, 62)
/*  96 */         .addBox(-0.25F, 0.0F, 1.125F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  97 */         PartPose.offset(0.0F, 0.0F, 0.0F));
/*  98 */     PartDefinition Tail = body.addOrReplaceChild("Tail", 
/*  99 */         CubeListBuilder.create().texOffs(14, 49).addBox(-0.75F, -1.6125F, 0.7823F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
/* 100 */         .texOffs(16, 17).addBox(-0.75F, -1.3625F, 5.7823F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(51, 59)
/* 101 */         .addBox(-0.75F, -1.2375F, 13.7823F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 6)
/* 102 */         .addBox(-0.25F, -1.7375F, -0.2177F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 56)
/* 103 */         .addBox(-0.25F, -1.6125F, 5.7823F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 63)
/* 104 */         .addBox(-0.25F, -1.4875F, 11.7823F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 105 */         PartPose.offsetAndRotation(0.0F, 9.0F, 1.0F, -0.5672F, 0.0F, 0.0F));
/* 106 */     PartDefinition rightArm = partdefinition.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offset(4.0F, 2.0F, 0.0F));
/* 107 */     PartDefinition RightArm_r1 = rightArm.addOrReplaceChild("RightArm_r1", 
/* 108 */         CubeListBuilder.create().texOffs(23, 55).addBox(1.625F, -2.625F, -2.5F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(32, 35)
/* 109 */         .addBox(-1.5F, -2.5F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 110 */         PartPose.offsetAndRotation(1.5F, 0.5F, 0.0F, 0.0F, 0.0F, -0.3927F));
/* 111 */     PartDefinition bone2 = rightArm.addOrReplaceChild("bone2", 
/* 112 */         CubeListBuilder.create().texOffs(20, 28).addBox(-3.2F, -7.081F, -1.666F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(35, 55)
/* 113 */         .addBox(-0.95F, -2.081F, -2.041F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(60, 51)
/* 114 */         .addBox(-0.95F, -3.331F, -1.166F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(38, 8)
/* 115 */         .addBox(-0.95F, -4.456F, -0.166F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 59)
/* 116 */         .addBox(-1.075F, -0.081F, -1.666F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 28)
/* 117 */         .addBox(-0.075F, 1.919F, -1.666F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 41)
/* 118 */         .addBox(-1.075F, -0.081F, -0.166F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 30)
/* 119 */         .addBox(-0.075F, 1.919F, -0.166F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 59)
/* 120 */         .addBox(-1.075F, -0.081F, 1.334F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 33)
/* 121 */         .addBox(-0.075F, 1.919F, 1.334F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 122 */         PartPose.offsetAndRotation(4.7F, 8.9375F, -2.8625F, -0.3927F, 0.0F, 0.0F));
/* 123 */     PartDefinition leftArm = partdefinition.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offset(-4.0F, 2.0F, 0.0F));
/* 124 */     PartDefinition RightArm_r2 = leftArm.addOrReplaceChild("RightArm_r2", 
/* 125 */         CubeListBuilder.create().texOffs(53, 50).addBox(-2.625F, -2.625F, -2.5F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 33)
/* 126 */         .addBox(-2.5F, -2.5F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 127 */         PartPose.offsetAndRotation(-1.5F, 0.5F, 0.0F, 0.0F, 0.0F, 0.3927F));
/* 128 */     PartDefinition bone8 = leftArm.addOrReplaceChild("bone8", 
/* 129 */         CubeListBuilder.create().texOffs(28, 12).addBox(-0.8F, -7.081F, -1.666F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(55, 34)
/* 130 */         .addBox(-1.05F, -2.081F, -2.041F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(52, 6)
/* 131 */         .addBox(-1.05F, -3.331F, -1.166F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(36, 33)
/* 132 */         .addBox(-1.05F, -4.456F, -0.166F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 56)
/* 133 */         .addBox(-0.925F, -0.081F, -1.666F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 29)
/* 134 */         .addBox(-0.925F, 1.919F, -1.666F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 56)
/* 135 */         .addBox(-0.925F, -0.081F, -0.166F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 27)
/* 136 */         .addBox(-0.925F, 1.919F, -0.166F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 55)
/* 137 */         .addBox(-0.925F, -0.081F, 1.334F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 25)
/* 138 */         .addBox(-0.925F, 1.919F, 1.334F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 139 */         PartPose.offsetAndRotation(-4.7F, 8.9375F, -2.8625F, -0.3927F, 0.0F, 0.0F));
/* 140 */     PartDefinition leftLeg = partdefinition.addOrReplaceChild("leftLeg", 
/* 141 */         CubeListBuilder.create().texOffs(48, 21).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
/* 142 */         .addBox(-2.0F, 11.213F, -2.1649F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 2)
/* 143 */         .addBox(-1.875F, 12.213F, -2.2899F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
/* 144 */         .addBox(-0.5F, 12.213F, -2.2899F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
/* 145 */         .addBox(0.875F, 12.213F, -2.2899F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), 
/* 146 */         PartPose.offset(-2.0F, 11.0F, 0.0F));
/* 147 */     PartDefinition bone = leftLeg.addOrReplaceChild("bone", 
/* 148 */         CubeListBuilder.create().texOffs(44, 41).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(45, 58)
/* 149 */         .addBox(-2.25F, -0.125F, -2.5F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 150 */         PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 151 */     PartDefinition bone3 = leftLeg.addOrReplaceChild("bone3", 
/* 152 */         CubeListBuilder.create().texOffs(12, 39).addBox(-6.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 153 */         PartPose.offsetAndRotation(4.0F, 4.0F, -1.0F, 0.6545F, 0.0F, 0.0F));
/* 154 */     PartDefinition bone4 = leftLeg.addOrReplaceChild("bone4", 
/* 155 */         CubeListBuilder.create().texOffs(0, 46).addBox(-2.0F, -0.1371F, 3.7689F, 4.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 156 */         PartPose.offsetAndRotation(0.0F, 4.0F, -1.0F, -0.48F, 0.0F, 0.0F));
/* 157 */     PartDefinition rightLeg = partdefinition.addOrReplaceChild("rightLeg", 
/* 158 */         CubeListBuilder.create().texOffs(44, 33).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(44, 15)
/* 159 */         .addBox(-2.0F, 11.213F, -2.1649F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(5, 2)
/* 160 */         .addBox(0.875F, 12.213F, -2.2899F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(5, 1)
/* 161 */         .addBox(-1.875F, 12.213F, -2.2899F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(5, 0)
/* 162 */         .addBox(-0.5F, 12.213F, -2.2899F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), 
/* 163 */         PartPose.offset(2.0F, 11.0F, 0.0F));
/* 164 */     PartDefinition bone5 = rightLeg.addOrReplaceChild("bone5", 
/* 165 */         CubeListBuilder.create().texOffs(40, 6).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(10, 59)
/* 166 */         .addBox(1.25F, -0.125F, -2.5F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 167 */         PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 168 */     PartDefinition bone6 = rightLeg.addOrReplaceChild("bone6", 
/* 169 */         CubeListBuilder.create().texOffs(36, 23).addBox(2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 170 */         PartPose.offsetAndRotation(-4.0F, 4.0F, -1.0F, 0.6545F, 0.0F, 0.0F));
/* 171 */     PartDefinition bone7 = rightLeg.addOrReplaceChild("bone7", 
/* 172 */         CubeListBuilder.create().texOffs(28, 45).addBox(-2.0F, -0.1371F, 3.7689F, 4.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 173 */         PartPose.offsetAndRotation(0.0F, 4.0F, -1.0F, -0.48F, 0.0F, 0.0F));
/* 174 */     return LayerDefinition.create(meshdefinition, 128, 128);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 180 */     this.head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 181 */     this.body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 182 */     this.rightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 183 */     this.leftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 184 */     this.leftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 185 */     this.rightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */   
/*     */   public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
/* 189 */     this.head.yRot = netHeadYaw / 57.295776F;
/* 190 */     this.head.xRot = headPitch / 57.295776F;
/* 191 */     this.rightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
/* 192 */     this.rightArm.xRot = Mth.cos(limbSwing * 0.6662F + 3.1415927F) * limbSwingAmount;
/* 193 */     this.leftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
/* 194 */     this.leftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\client\model\Modeldark_latex_skeleton_model.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */