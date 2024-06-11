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
/*     */ public class ModelDark_latex_creeper_enhanced<T extends Entity>
/*     */   extends EntityModel<T>
/*     */ {
/*  25 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("latex", "model_dark_latex_creeper_enhanced"), "main");
/*     */   
/*     */   public final ModelPart head;
/*     */   public final ModelPart body;
/*     */   public final ModelPart ArmL;
/*     */   public final ModelPart ArmR;
/*     */   public final ModelPart leg0;
/*     */   public final ModelPart leg1;
/*     */   public final ModelPart leg2;
/*     */   public final ModelPart leg3;
/*     */   
/*     */   public ModelDark_latex_creeper_enhanced(ModelPart root) {
/*  37 */     this.head = root.getChild("head");
/*  38 */     this.body = root.getChild("body");
/*  39 */     this.ArmL = root.getChild("ArmL");
/*  40 */     this.ArmR = root.getChild("ArmR");
/*  41 */     this.leg0 = root.getChild("leg0");
/*  42 */     this.leg1 = root.getChild("leg1");
/*  43 */     this.leg2 = root.getChild("leg2");
/*  44 */     this.leg3 = root.getChild("leg3");
/*     */   }
/*     */   
/*     */   public static LayerDefinition createBodyLayer() {
/*  48 */     MeshDefinition meshdefinition = new MeshDefinition();
/*  49 */     PartDefinition partdefinition = meshdefinition.getRoot();
/*  50 */     PartDefinition head = partdefinition.addOrReplaceChild("head", 
/*  51 */         CubeListBuilder.create().texOffs(43, 0).addBox(-4.5F, -8.7721F, -5.6047F, 9.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)), 
/*  52 */         PartPose.offset(0.0F, -13.5F, -10.0F));
/*  53 */     PartDefinition head_r1 = head.addOrReplaceChild("head_r1", 
/*  54 */         CubeListBuilder.create().texOffs(70, 96).addBox(-0.5F, -1.75F, -4.0F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(62, 18)
/*  55 */         .addBox(-0.5F, -1.75F, 1.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(13, 0)
/*  56 */         .addBox(-0.5F, -1.75F, 5.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 47)
/*  57 */         .addBox(-10.5F, -1.75F, 5.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(98, 101)
/*  58 */         .addBox(-10.5F, -1.75F, 1.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(100, 74)
/*  59 */         .addBox(-10.5F, -1.75F, -4.0F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), 
/*  60 */         PartPose.offsetAndRotation(5.0F, -5.0221F, 0.3953F, 0.2182F, 0.0F, 0.0F));
/*  61 */     PartDefinition Crest = head.addOrReplaceChild("Crest", 
/*  62 */         CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -19.625F, -11.375F, 0.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(43, 15)
/*  63 */         .addBox(0.0F, -20.625F, -10.375F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(61, 46)
/*  64 */         .addBox(0.0F, -21.625F, -8.375F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(61, 45)
/*  65 */         .addBox(0.0F, -21.625F, -4.375F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(43, 5)
/*  66 */         .addBox(0.0F, -20.625F, -6.375F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), 
/*  67 */         PartPose.offset(0.0F, 10.2279F, 6.3953F));
/*  68 */     PartDefinition head_r2 = Crest.addOrReplaceChild("head_r2", 
/*  69 */         CubeListBuilder.create().texOffs(61, 44).addBox(0.0F, -1.0F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 43)
/*  70 */         .addBox(0.0F, 0.0F, -3.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(44, 61)
/*  71 */         .addBox(0.0F, -1.0F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 42).addBox(0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), 
/*     */         
/*  73 */         PartPose.offsetAndRotation(0.0F, -15.625F, -1.375F, -1.5708F, 0.0F, 0.0F));
/*  74 */     PartDefinition Mask = head.addOrReplaceChild("Mask", 
/*  75 */         CubeListBuilder.create().texOffs(57, 18).addBox(-3.0F, -9.75F, -12.5F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(14, 8)
/*  76 */         .addBox(1.0F, -9.75F, -12.5F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(48, 41)
/*  77 */         .addBox(-1.0F, -10.25F, -12.5F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(45, 77)
/*  78 */         .addBox(3.0F, -16.0F, -12.5F, 1.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(36, 41)
/*  79 */         .addBox(-3.0F, -13.0F, -12.5F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 4)
/*  80 */         .addBox(-1.0F, -14.0F, -12.5F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(49, 18)
/*  81 */         .addBox(-2.0F, -15.0F, -12.5F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(36, 38)
/*  82 */         .addBox(-3.0F, -17.0F, -12.5F, 6.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 50)
/*  83 */         .addBox(1.0F, -12.0F, -12.5F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(46, 29)
/*  84 */         .addBox(-3.0F, -12.0F, -12.5F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(34, 55)
/*  85 */         .addBox(-4.0F, -16.0F, -12.5F, 1.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 30)
/*  86 */         .addBox(-6.0F, -12.0F, -12.5F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(14, 18)
/*  87 */         .addBox(-1.0F, -18.0F, -12.5F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(36, 29)
/*  88 */         .addBox(4.0F, -12.0F, -12.5F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(17, 0)
/*  89 */         .addBox(-5.0F, -13.0F, -12.5F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(43, 0)
/*  90 */         .addBox(4.0F, -13.0F, -12.5F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), 
/*  91 */         PartPose.offset(0.0F, 9.2279F, 6.5203F));
/*  92 */     PartDefinition body = partdefinition.addOrReplaceChild("body", 
/*  93 */         CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, 14.5F, 2.0F, 12.0F, 7.0F, 19.0F, new CubeDeformation(0.0F)).texOffs(66, 63)
/*  94 */         .addBox(-6.0F, 14.5F, 21.0F, 12.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 26)
/*  95 */         .addBox(-5.0F, 21.5F, 4.0F, 10.0F, 3.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(36, 26)
/*  96 */         .addBox(-4.0F, 24.5F, 5.0F, 8.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(54, 52)
/*  97 */         .addBox(-3.0F, 25.5F, 8.0F, 6.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), 
/*  98 */         PartPose.offset(0.0F, -13.5F, -10.0F));
/*  99 */     PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1", 
/* 100 */         CubeListBuilder.create().texOffs(91, 48).addBox(-4.0F, -1.5F, -1.0F, 8.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 101 */         PartPose.offsetAndRotation(0.0F, 15.375F, 22.875F, 0.3054F, 0.0F, 0.0F));
/* 102 */     PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2", 
/* 103 */         CubeListBuilder.create().texOffs(0, 55).addBox(-5.0F, -1.5F, -6.0F, 10.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), 
/* 104 */         PartPose.offsetAndRotation(0.0F, 15.375F, 23.625F, 0.0873F, 0.0F, 0.0F));
/* 105 */     PartDefinition body_r1 = body.addOrReplaceChild("body_r1", 
/* 106 */         CubeListBuilder.create().texOffs(59, 44).addBox(-2.5F, -16.0F, -2.0F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 45)
/* 107 */         .addBox(-6.125F, -15.0F, -2.875F, 12.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(61, 86)
/* 108 */         .addBox(0.375F, -14.0F, -3.0F, 5.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(88, 27)
/* 109 */         .addBox(-5.5F, -14.0F, -3.0F, 5.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(83, 12)
/* 110 */         .addBox(-4.0F, -1.0F, -1.0F, 8.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
/* 111 */         .addBox(-0.5F, -3.25F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(96, 93)
/* 112 */         .addBox(-3.0F, -7.0F, -5.625F, 6.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(20, 89)
/* 113 */         .addBox(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(95, 37)
/* 114 */         .addBox(-3.5F, -8.5F, -5.0F, 7.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(13, 25)
/* 115 */         .addBox(-0.125F, -11.0F, 4.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 40)
/* 116 */         .addBox(-0.125F, -11.0F, 5.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(61, 17)
/* 117 */         .addBox(-0.125F, -11.0F, 6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 61)
/* 118 */         .addBox(-0.125F, -15.0F, 6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 54)
/* 119 */         .addBox(-0.125F, -15.0F, 5.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 25)
/* 120 */         .addBox(-0.125F, -15.0F, 4.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 91)
/* 121 */         .addBox(-0.125F, -15.0F, 3.0F, 0.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 45).addBox(-4.5F, -11.0F, -2.0F, 9.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)), 
/*     */         
/* 123 */         PartPose.offsetAndRotation(0.0F, 15.5F, 2.0F, 0.1745F, 0.0F, 0.0F));
/* 124 */     PartDefinition body_r2 = body.addOrReplaceChild("body_r2", 
/* 125 */         CubeListBuilder.create().texOffs(30, 48).addBox(1.0F, 10.125F, 4.875F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 48)
/* 126 */         .addBox(1.0F, 7.125F, 4.875F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 41)
/* 127 */         .addBox(1.0F, 7.125F, 5.875F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 48)
/* 128 */         .addBox(1.0F, 4.125F, 4.875F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 59)
/* 129 */         .addBox(1.0F, 4.125F, 5.875F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 59)
/* 130 */         .addBox(1.0F, 1.125F, 5.875F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 37)
/* 131 */         .addBox(1.0F, 1.125F, 4.875F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(90, 21)
/* 132 */         .addBox(1.0F, -0.875F, 3.875F, 0.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(21, 77)
/* 133 */         .addBox(-3.375F, -0.875F, 0.875F, 9.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 134 */         PartPose.offsetAndRotation(-1.125F, 15.1403F, 5.1308F, 1.1781F, 0.0F, 0.0F));
/* 135 */     PartDefinition body_r3 = body.addOrReplaceChild("body_r3", 
/* 136 */         CubeListBuilder.create().texOffs(60, 43).addBox(1.0F, -6.0F, 6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(49, 3)
/* 137 */         .addBox(1.0F, -6.0F, 5.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(11, 25)
/* 138 */         .addBox(1.0F, -6.0F, 4.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(103, 0)
/* 139 */         .addBox(1.0F, -7.0F, 3.0F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(79, 0).addBox(-3.375F, -7.0F, 0.0F, 9.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)), 
/*     */         
/* 141 */         PartPose.offsetAndRotation(-1.125F, 15.1403F, 5.1308F, 0.6109F, 0.0F, 0.0F));
/* 142 */     PartDefinition Crest2 = body.addOrReplaceChild("Crest2", CubeListBuilder.create(), PartPose.offset(0.0F, 29.5F, 10.0F));
/* 143 */     PartDefinition ArmL = partdefinition.addOrReplaceChild("ArmL", CubeListBuilder.create(), 
/* 144 */         PartPose.offsetAndRotation(7.5644F, -4.8193F, -6.8098F, 0.1298F, 0.017F, -0.1298F));
/* 145 */     PartDefinition body_r4 = ArmL.addOrReplaceChild("body_r4", 
/* 146 */         CubeListBuilder.create().texOffs(0, 79).addBox(-1.8219F, -0.5428F, -4.2825F, 5.0F, 8.0F, 5.0F, new CubeDeformation(0.0F))
/* 147 */         .texOffs(0, 0).addBox(-1.7683F, -3.5318F, -4.2805F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(78, 93)
/* 148 */         .addBox(-1.7683F, -3.5318F, -4.2805F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 149 */         PartPose.offsetAndRotation(0.1856F, 2.5931F, -1.3413F, -0.4765F, -0.0603F, -0.0873F));
/* 150 */     PartDefinition body_r5 = ArmL.addOrReplaceChild("body_r5", 
/* 151 */         CubeListBuilder.create().texOffs(48, 26).addBox(-0.625F, -0.875F, 0.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), 
/* 152 */         PartPose.offsetAndRotation(-0.6733F, 7.8765F, -7.88F, -0.4784F, 0.0403F, 0.1064F));
/* 153 */     PartDefinition body_r6 = ArmL.addOrReplaceChild("body_r6", 
/* 154 */         CubeListBuilder.create().texOffs(30, 45).addBox(-0.5F, -0.875F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), 
/* 155 */         PartPose.offsetAndRotation(-0.6733F, 7.7515F, -7.88F, -0.4784F, 0.0403F, 0.1064F));
/* 156 */     PartDefinition body_r7 = ArmL.addOrReplaceChild("body_r7", 
/* 157 */         CubeListBuilder.create().texOffs(59, 45).addBox(1.25F, 0.0F, -0.125F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(32, 59)
/* 158 */         .addBox(1.25F, 0.0F, 3.125F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), 
/* 159 */         PartPose.offsetAndRotation(2.1314F, 7.2426F, -7.3669F, -0.4608F, -0.1393F, -0.2437F));
/* 160 */     PartDefinition body_r8 = ArmL.addOrReplaceChild("body_r8", 
/* 161 */         CubeListBuilder.create().texOffs(43, 4).addBox(0.125F, 0.0F, -1.125F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(43, 0)
/* 162 */         .addBox(0.125F, 0.0F, 2.125F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), 
/* 163 */         PartPose.offsetAndRotation(2.1314F, 7.1176F, -7.3669F, -0.4608F, -0.1393F, -0.2437F));
/* 164 */     PartDefinition body_r9 = ArmL.addOrReplaceChild("body_r9", 
/* 165 */         CubeListBuilder.create().texOffs(18, 92).addBox(6.1093F, -17.3441F, -2.4261F, 1.0F, 11.0F, 0.0F, new CubeDeformation(0.0F))
/* 166 */         .texOffs(62, 19).addBox(5.1093F, -15.3441F, -2.4261F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(3, 0)
/* 167 */         .addBox(4.1093F, -14.3441F, -2.4261F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(88, 101)
/* 168 */         .addBox(7.0387F, -13.3382F, -4.4271F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(56, 96)
/* 169 */         .addBox(4.0387F, -13.3382F, -4.4271F, 3.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 170 */         PartPose.offsetAndRotation(-5.5644F, 4.8277F, 1.8798F, 0.1745F, 0.0F, 0.0F));
/* 171 */     PartDefinition body_r10 = ArmL.addOrReplaceChild("body_r10", 
/* 172 */         CubeListBuilder.create().texOffs(2, 25).addBox(0.2715F, -7.5348F, -0.2697F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
/* 173 */         .texOffs(26, 58).addBox(0.2715F, -5.5348F, -1.2697F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 174 */         PartPose.offsetAndRotation(0.1856F, 2.5931F, -1.3413F, -0.48F, 0.0F, -0.0873F));
/* 175 */     PartDefinition ArmR = partdefinition.addOrReplaceChild("ArmR", CubeListBuilder.create(), 
/* 176 */         PartPose.offsetAndRotation(-7.5644F, -4.8193F, -6.8098F, 0.1304F, -0.0114F, 0.0866F));
/* 177 */     PartDefinition body_r11 = ArmR.addOrReplaceChild("body_r11", 
/* 178 */         CubeListBuilder.create().texOffs(46, 26).addBox(-2.25F, 0.0F, 3.125F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(38, 45)
/* 179 */         .addBox(-2.25F, 0.0F, -0.125F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), 
/* 180 */         PartPose.offsetAndRotation(-2.1314F, 7.2426F, -7.3669F, -0.4608F, 0.1393F, 0.2437F));
/* 181 */     PartDefinition body_r12 = ArmR.addOrReplaceChild("body_r12", 
/* 182 */         CubeListBuilder.create().texOffs(38, 26).addBox(-0.375F, -0.875F, 0.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), 
/* 183 */         PartPose.offsetAndRotation(0.6733F, 7.8765F, -7.88F, -0.4784F, -0.0403F, -0.1064F));
/* 184 */     PartDefinition body_r13 = ArmR.addOrReplaceChild("body_r13", 
/* 185 */         CubeListBuilder.create().texOffs(78, 101).addBox(-8.0387F, -13.3382F, -4.4271F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
/* 186 */         .texOffs(13, 0).addBox(-5.1093F, -14.3441F, -2.4261F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(92, 22)
/* 187 */         .addBox(-7.1093F, -17.3441F, -2.4261F, 1.0F, 11.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(51, 62)
/* 188 */         .addBox(-6.1093F, -15.3441F, -2.4261F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(36, 26)
/* 189 */         .addBox(-6.9843F, -13.3441F, -4.4261F, 3.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 190 */         PartPose.offsetAndRotation(5.5644F, 4.8277F, 1.8798F, 0.1745F, 0.0F, 0.0F));
/* 191 */     PartDefinition body_r14 = ArmR.addOrReplaceChild("body_r14", 
/* 192 */         CubeListBuilder.create().texOffs(0, 25).addBox(-0.2178F, -7.5443F, -0.2747F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
/* 193 */         .texOffs(32, 54).addBox(-0.2178F, -5.5443F, -1.2747F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 194 */         PartPose.offsetAndRotation(-0.1856F, 2.5931F, -1.3413F, -0.48F, 0.0F, 0.0873F));
/* 195 */     PartDefinition body_r15 = ArmR.addOrReplaceChild("body_r15", 
/* 196 */         CubeListBuilder.create().texOffs(26, 55).addBox(-2.125F, 0.0F, 2.125F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(17, 64)
/* 197 */         .addBox(-2.125F, 0.0F, -1.125F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), 
/* 198 */         PartPose.offsetAndRotation(-2.1314F, 7.1176F, -7.3669F, -0.4608F, 0.1393F, 0.2437F));
/* 199 */     PartDefinition body_r16 = ArmR.addOrReplaceChild("body_r16", 
/* 200 */         CubeListBuilder.create().texOffs(52, 41).addBox(-1.5F, -0.875F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), 
/* 201 */         PartPose.offsetAndRotation(0.6733F, 7.7515F, -7.88F, -0.4784F, -0.0403F, -0.1064F));
/* 202 */     PartDefinition body_r17 = ArmR.addOrReplaceChild("body_r17", 
/* 203 */         CubeListBuilder.create().texOffs(93, 57).addBox(-2.1781F, -3.5428F, -4.2825F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
/* 204 */         .texOffs(83, 80).addBox(-3.1781F, -0.5428F, -4.2825F, 5.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 205 */         PartPose.offsetAndRotation(-0.1856F, 2.5931F, -1.3413F, -0.4765F, 0.0603F, 0.0873F));
/* 206 */     PartDefinition leg0 = partdefinition.addOrReplaceChild("leg0", 
/* 207 */         CubeListBuilder.create().texOffs(66, 18).addBox(-4.625F, 11.7545F, -8.1168F, 5.0F, 8.0F, 7.0F, new CubeDeformation(0.0F))
/* 208 */         .texOffs(51, 92).addBox(-1.125F, 17.7545F, -8.8668F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(94, 22)
/* 209 */         .addBox(-5.125F, 17.7545F, -8.8668F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(43, 3)
/* 210 */         .addBox(-4.125F, 17.7545F, -9.8668F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 44)
/* 211 */         .addBox(-0.125F, 17.7545F, -9.8668F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(43, 0)
/* 212 */         .addBox(-4.125F, 18.7545F, -10.8668F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 48)
/* 213 */         .addBox(-0.125F, 18.7545F, -10.8668F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 58)
/* 214 */         .addBox(-3.125F, 17.7545F, -1.1168F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 215 */         PartPose.offset(-5.5F, 4.25F, -4.0F));
/* 216 */     PartDefinition leg4_r1 = leg0.addOrReplaceChild("leg4_r1", 
/* 217 */         CubeListBuilder.create().texOffs(30, 101).addBox(-2.25F, -9.5F, -4.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 92)
/* 218 */         .addBox(-3.25F, -8.55F, -4.0F, 3.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 219 */         PartPose.offsetAndRotation(-0.25F, 7.2057F, -3.4455F, -0.5672F, 0.0F, 0.0F));
/* 220 */     PartDefinition leg4_r2 = leg0.addOrReplaceChild("leg4_r2", 
/* 221 */         CubeListBuilder.create().texOffs(0, 11).addBox(-2.25F, -7.5F, -4.0F, 0.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(58, 40)
/* 222 */         .addBox(-2.25F, -10.5F, -4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
/* 223 */         .addBox(-2.25F, -9.5F, -4.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(13, 1)
/* 224 */         .addBox(-2.25F, -8.5F, -4.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(45, 78).addBox(-4.25F, -6.5F, -4.0F, 4.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), 
/*     */         
/* 226 */         PartPose.offsetAndRotation(0.0F, 12.25F, -4.25F, 0.2182F, 0.0F, 0.0F));
/* 227 */     PartDefinition leg1 = partdefinition.addOrReplaceChild("leg1", 
/* 228 */         CubeListBuilder.create().texOffs(49, 63).addBox(-0.125F, 11.7545F, -7.1168F, 5.0F, 8.0F, 7.0F, new CubeDeformation(0.0F))
/* 229 */         .texOffs(79, 12).addBox(-0.625F, 17.7545F, -7.8668F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(75, 48)
/* 230 */         .addBox(3.375F, 17.7545F, -7.8668F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(36, 44)
/* 231 */         .addBox(0.375F, 17.7545F, -8.8668F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 46)
/* 232 */         .addBox(4.375F, 17.7545F, -8.8668F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(49, 0)
/* 233 */         .addBox(0.375F, 18.7545F, -9.8668F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 49)
/* 234 */         .addBox(4.375F, 18.7545F, -9.8668F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 41)
/* 235 */         .addBox(1.5F, 17.7545F, -0.2418F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 236 */         PartPose.offset(5.5F, 4.25F, -5.0F));
/* 237 */     PartDefinition leg5_r1 = leg1.addOrReplaceChild("leg5_r1", 
/* 238 */         CubeListBuilder.create().texOffs(0, 1).addBox(2.25F, -7.5F, -4.0F, 0.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(13, 0)
/* 239 */         .addBox(2.25F, -8.5F, -4.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
/* 240 */         .addBox(2.25F, -9.5F, -4.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(30, 58)
/* 241 */         .addBox(2.25F, -10.5F, -4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(73, 34).addBox(0.25F, -6.5F, -4.0F, 4.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), 
/*     */         
/* 243 */         PartPose.offsetAndRotation(0.0F, 12.25F, -3.25F, 0.2182F, 0.0F, 0.0F));
/* 244 */     PartDefinition leg5_r2 = leg1.addOrReplaceChild("leg5_r2", 
/* 245 */         CubeListBuilder.create().texOffs(66, 33).addBox(0.25F, -9.5F, -4.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 26)
/* 246 */         .addBox(0.25F, -8.55F, -4.0F, 3.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 247 */         PartPose.offsetAndRotation(0.25F, 7.2057F, -2.4455F, -0.5672F, 0.0F, 0.0F));
/* 248 */     PartDefinition leg2 = partdefinition.addOrReplaceChild("leg2", 
/* 249 */         CubeListBuilder.create().texOffs(0, 64).addBox(-4.625F, 10.7545F, 3.2582F, 5.0F, 8.0F, 7.0F, new CubeDeformation(0.0F))
/* 250 */         .texOffs(81, 74).addBox(-1.125F, 16.7545F, 2.5082F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(81, 70)
/* 251 */         .addBox(-5.125F, 16.7545F, 2.5082F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(11, 28)
/* 252 */         .addBox(-0.125F, 16.7545F, 1.5082F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(13, 28)
/* 253 */         .addBox(-4.125F, 16.7545F, 1.5082F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(13, 0)
/* 254 */         .addBox(-0.125F, 17.7545F, 0.5082F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(17, 0)
/* 255 */         .addBox(-4.125F, 17.7545F, 0.5082F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 55)
/* 256 */         .addBox(-3.125F, 16.7545F, 10.2582F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 257 */         PartPose.offset(-5.5F, 5.25F, 7.0F));
/* 258 */     PartDefinition leg5_r3 = leg2.addOrReplaceChild("leg5_r3", 
/* 259 */         CubeListBuilder.create().texOffs(16, 101).addBox(-2.25F, -8.5F, -1.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(40, 92)
/* 260 */         .addBox(-3.25F, -7.55F, -1.0F, 3.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 261 */         PartPose.offsetAndRotation(-0.25F, 6.2057F, 4.4455F, 0.7854F, 0.0F, 0.0F));
/* 262 */     PartDefinition leg3_r1 = leg2.addOrReplaceChild("leg3_r1", 
/* 263 */         CubeListBuilder.create().texOffs(76, 48).addBox(-9.75F, -3.5F, -3.5F, 4.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), 
/* 264 */         PartPose.offsetAndRotation(5.5F, 8.4293F, 5.9875F, 0.2182F, 0.0F, 0.0F));
/* 265 */     PartDefinition leg3 = partdefinition.addOrReplaceChild("leg3", 
/* 266 */         CubeListBuilder.create().texOffs(25, 62).addBox(-0.125F, 10.7545F, 2.2582F, 5.0F, 8.0F, 7.0F, new CubeDeformation(0.0F))
/* 267 */         .texOffs(70, 4).addBox(-0.625F, 16.7545F, 1.5082F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(70, 0)
/* 268 */         .addBox(3.375F, 16.7545F, 1.5082F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(4, 46)
/* 269 */         .addBox(0.375F, 16.7545F, 0.5082F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 47)
/* 270 */         .addBox(4.375F, 16.7545F, 0.5082F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(49, 7)
/* 271 */         .addBox(0.375F, 17.7545F, -0.4918F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 58)
/* 272 */         .addBox(4.375F, 17.7545F, -0.4918F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 64)
/* 273 */         .addBox(1.375F, 16.7545F, 9.1332F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 274 */         PartPose.offset(5.5F, 5.25F, 8.0F));
/* 275 */     PartDefinition leg6_r1 = leg3.addOrReplaceChild("leg6_r1", 
/* 276 */         CubeListBuilder.create().texOffs(42, 62).addBox(0.25F, -8.5F, -1.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(89, 65)
/* 277 */         .addBox(0.25F, -7.55F, -1.0F, 3.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 278 */         PartPose.offsetAndRotation(0.25F, 6.2057F, 3.4455F, 0.7854F, 0.0F, 0.0F));
/* 279 */     PartDefinition leg4_r3 = leg3.addOrReplaceChild("leg4_r3", 
/* 280 */         CubeListBuilder.create().texOffs(66, 71).addBox(5.75F, -3.5F, -3.5F, 4.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), 
/* 281 */         PartPose.offsetAndRotation(-5.5F, 8.4293F, 4.9875F, 0.2182F, 0.0F, 0.0F));
/* 282 */     return LayerDefinition.create(meshdefinition, 128, 128);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 288 */     this.head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 289 */     this.body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 290 */     this.ArmL.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 291 */     this.ArmR.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 292 */     this.leg0.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 293 */     this.leg1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 294 */     this.leg2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 295 */     this.leg3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */   
/*     */   public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
/* 299 */     this.head.yRot = netHeadYaw / 57.295776F;
/* 300 */     this.head.xRot = headPitch / 57.295776F;
/* 301 */     this.leg0.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
/* 302 */     this.leg1.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
/* 303 */     this.leg2.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
/* 304 */     this.leg3.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
/* 305 */     this.ArmR.xRot = Mth.cos(limbSwing * 0.6662F + 3.1415927F) * limbSwingAmount;
/* 306 */     this.ArmL.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\client\model\ModelDark_latex_creeper_enhanced.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */