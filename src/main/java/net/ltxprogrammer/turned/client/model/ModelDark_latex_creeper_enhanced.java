/*     */ package net.ltxprogrammer.turned.client.model;
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
/*  25 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("turned", "model_dark_latex_creeper_enhanced"), "main");
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
/*  37 */     this.head = root.m_171324_("head");
/*  38 */     this.body = root.m_171324_("body");
/*  39 */     this.ArmL = root.m_171324_("ArmL");
/*  40 */     this.ArmR = root.m_171324_("ArmR");
/*  41 */     this.leg0 = root.m_171324_("leg0");
/*  42 */     this.leg1 = root.m_171324_("leg1");
/*  43 */     this.leg2 = root.m_171324_("leg2");
/*  44 */     this.leg3 = root.m_171324_("leg3");
/*     */   }
/*     */   
/*     */   public static LayerDefinition createBodyLayer() {
/*  48 */     MeshDefinition meshdefinition = new MeshDefinition();
/*  49 */     PartDefinition partdefinition = meshdefinition.m_171576_();
/*  50 */     PartDefinition head = partdefinition.m_171599_("head", 
/*  51 */         CubeListBuilder.m_171558_().m_171514_(43, 0).m_171488_(-4.5F, -8.7721F, -5.6047F, 9.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)), 
/*  52 */         PartPose.m_171419_(0.0F, -13.5F, -10.0F));
/*  53 */     PartDefinition head_r1 = head.m_171599_("head_r1", 
/*  54 */         CubeListBuilder.m_171558_().m_171514_(70, 96).m_171488_(-0.5F, -1.75F, -4.0F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(62, 18)
/*  55 */         .m_171488_(-0.5F, -1.75F, 1.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(13, 0)
/*  56 */         .m_171488_(-0.5F, -1.75F, 5.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(0, 47)
/*  57 */         .m_171488_(-10.5F, -1.75F, 5.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(98, 101)
/*  58 */         .m_171488_(-10.5F, -1.75F, 1.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(100, 74)
/*  59 */         .m_171488_(-10.5F, -1.75F, -4.0F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), 
/*  60 */         PartPose.m_171423_(5.0F, -5.0221F, 0.3953F, 0.2182F, 0.0F, 0.0F));
/*  61 */     PartDefinition Crest = head.m_171599_("Crest", 
/*  62 */         CubeListBuilder.m_171558_().m_171514_(0, 0).m_171488_(0.0F, -19.625F, -11.375F, 0.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)).m_171514_(43, 15)
/*  63 */         .m_171488_(0.0F, -20.625F, -10.375F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).m_171514_(61, 46)
/*  64 */         .m_171488_(0.0F, -21.625F, -8.375F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(61, 45)
/*  65 */         .m_171488_(0.0F, -21.625F, -4.375F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(43, 5)
/*  66 */         .m_171488_(0.0F, -20.625F, -6.375F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), 
/*  67 */         PartPose.m_171419_(0.0F, 10.2279F, 6.3953F));
/*  68 */     PartDefinition head_r2 = Crest.m_171599_("head_r2", 
/*  69 */         CubeListBuilder.m_171558_().m_171514_(61, 44).m_171488_(0.0F, -1.0F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 43)
/*  70 */         .m_171488_(0.0F, 0.0F, -3.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).m_171514_(44, 61)
/*  71 */         .m_171488_(0.0F, -1.0F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 42).m_171488_(0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), 
/*     */         
/*  73 */         PartPose.m_171423_(0.0F, -15.625F, -1.375F, -1.5708F, 0.0F, 0.0F));
/*  74 */     PartDefinition Mask = head.m_171599_("Mask", 
/*  75 */         CubeListBuilder.m_171558_().m_171514_(57, 18).m_171488_(-3.0F, -9.75F, -12.5F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(14, 8)
/*  76 */         .m_171488_(1.0F, -9.75F, -12.5F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(48, 41)
/*  77 */         .m_171488_(-1.0F, -10.25F, -12.5F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(45, 77)
/*  78 */         .m_171488_(3.0F, -16.0F, -12.5F, 1.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(36, 41)
/*  79 */         .m_171488_(-3.0F, -13.0F, -12.5F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(0, 4)
/*  80 */         .m_171488_(-1.0F, -14.0F, -12.5F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(49, 18)
/*  81 */         .m_171488_(-2.0F, -15.0F, -12.5F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(36, 38)
/*  82 */         .m_171488_(-3.0F, -17.0F, -12.5F, 6.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(0, 50)
/*  83 */         .m_171488_(1.0F, -12.0F, -12.5F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(46, 29)
/*  84 */         .m_171488_(-3.0F, -12.0F, -12.5F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(34, 55)
/*  85 */         .m_171488_(-4.0F, -16.0F, -12.5F, 1.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(0, 30)
/*  86 */         .m_171488_(-6.0F, -12.0F, -12.5F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(14, 18)
/*  87 */         .m_171488_(-1.0F, -18.0F, -12.5F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(36, 29)
/*  88 */         .m_171488_(4.0F, -12.0F, -12.5F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(17, 0)
/*  89 */         .m_171488_(-5.0F, -13.0F, -12.5F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(43, 0)
/*  90 */         .m_171488_(4.0F, -13.0F, -12.5F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), 
/*  91 */         PartPose.m_171419_(0.0F, 9.2279F, 6.5203F));
/*  92 */     PartDefinition body = partdefinition.m_171599_("body", 
/*  93 */         CubeListBuilder.m_171558_().m_171514_(0, 0).m_171488_(-6.0F, 14.5F, 2.0F, 12.0F, 7.0F, 19.0F, new CubeDeformation(0.0F)).m_171514_(66, 63)
/*  94 */         .m_171488_(-6.0F, 14.5F, 21.0F, 12.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(0, 26)
/*  95 */         .m_171488_(-5.0F, 21.5F, 4.0F, 10.0F, 3.0F, 16.0F, new CubeDeformation(0.0F)).m_171514_(36, 26)
/*  96 */         .m_171488_(-4.0F, 24.5F, 5.0F, 8.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)).m_171514_(54, 52)
/*  97 */         .m_171488_(-3.0F, 25.5F, 8.0F, 6.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), 
/*  98 */         PartPose.m_171419_(0.0F, -13.5F, -10.0F));
/*  99 */     PartDefinition cube_r1 = body.m_171599_("cube_r1", 
/* 100 */         CubeListBuilder.m_171558_().m_171514_(91, 48).m_171488_(-4.0F, -1.5F, -1.0F, 8.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 101 */         PartPose.m_171423_(0.0F, 15.375F, 22.875F, 0.3054F, 0.0F, 0.0F));
/* 102 */     PartDefinition cube_r2 = body.m_171599_("cube_r2", 
/* 103 */         CubeListBuilder.m_171558_().m_171514_(0, 55).m_171488_(-5.0F, -1.5F, -6.0F, 10.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), 
/* 104 */         PartPose.m_171423_(0.0F, 15.375F, 23.625F, 0.0873F, 0.0F, 0.0F));
/* 105 */     PartDefinition body_r1 = body.m_171599_("body_r1", 
/* 106 */         CubeListBuilder.m_171558_().m_171514_(59, 44).m_171488_(-2.5F, -16.0F, -2.0F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(0, 45)
/* 107 */         .m_171488_(-6.125F, -15.0F, -2.875F, 12.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(61, 86)
/* 108 */         .m_171488_(0.375F, -14.0F, -3.0F, 5.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(88, 27)
/* 109 */         .m_171488_(-5.5F, -14.0F, -3.0F, 5.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(83, 12)
/* 110 */         .m_171488_(-4.0F, -1.0F, -1.0F, 8.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(0, 0)
/* 111 */         .m_171488_(-0.5F, -3.25F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(96, 93)
/* 112 */         .m_171488_(-3.0F, -7.0F, -5.625F, 6.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(20, 89)
/* 113 */         .m_171488_(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(95, 37)
/* 114 */         .m_171488_(-3.5F, -8.5F, -5.0F, 7.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(13, 25)
/* 115 */         .m_171488_(-0.125F, -11.0F, 4.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(52, 40)
/* 116 */         .m_171488_(-0.125F, -11.0F, 5.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(61, 17)
/* 117 */         .m_171488_(-0.125F, -11.0F, 6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(42, 61)
/* 118 */         .m_171488_(-0.125F, -15.0F, 6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(26, 54)
/* 119 */         .m_171488_(-0.125F, -15.0F, 5.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(36, 25)
/* 120 */         .m_171488_(-0.125F, -15.0F, 4.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(16, 91)
/* 121 */         .m_171488_(-0.125F, -15.0F, 3.0F, 0.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(36, 45).m_171488_(-4.5F, -11.0F, -2.0F, 9.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)), 
/*     */         
/* 123 */         PartPose.m_171423_(0.0F, 15.5F, 2.0F, 0.1745F, 0.0F, 0.0F));
/* 124 */     PartDefinition body_r2 = body.m_171599_("body_r2", 
/* 125 */         CubeListBuilder.m_171558_().m_171514_(30, 48).m_171488_(1.0F, 10.125F, 4.875F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(32, 48)
/* 126 */         .m_171488_(1.0F, 7.125F, 4.875F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(58, 41)
/* 127 */         .m_171488_(1.0F, 7.125F, 5.875F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(34, 48)
/* 128 */         .m_171488_(1.0F, 4.125F, 4.875F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(28, 59)
/* 129 */         .m_171488_(1.0F, 4.125F, 5.875F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(30, 59)
/* 130 */         .m_171488_(1.0F, 1.125F, 5.875F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(48, 37)
/* 131 */         .m_171488_(1.0F, 1.125F, 4.875F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(90, 21)
/* 132 */         .m_171488_(1.0F, -0.875F, 3.875F, 0.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(21, 77)
/* 133 */         .m_171488_(-3.375F, -0.875F, 0.875F, 9.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 134 */         PartPose.m_171423_(-1.125F, 15.1403F, 5.1308F, 1.1781F, 0.0F, 0.0F));
/* 135 */     PartDefinition body_r3 = body.m_171599_("body_r3", 
/* 136 */         CubeListBuilder.m_171558_().m_171514_(60, 43).m_171488_(1.0F, -6.0F, 6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(49, 3)
/* 137 */         .m_171488_(1.0F, -6.0F, 5.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(11, 25)
/* 138 */         .m_171488_(1.0F, -6.0F, 4.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(103, 0)
/* 139 */         .m_171488_(1.0F, -7.0F, 3.0F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(79, 0).m_171488_(-3.375F, -7.0F, 0.0F, 9.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)), 
/*     */         
/* 141 */         PartPose.m_171423_(-1.125F, 15.1403F, 5.1308F, 0.6109F, 0.0F, 0.0F));
/* 142 */     PartDefinition Crest2 = body.m_171599_("Crest2", CubeListBuilder.m_171558_(), PartPose.m_171419_(0.0F, 29.5F, 10.0F));
/* 143 */     PartDefinition ArmL = partdefinition.m_171599_("ArmL", CubeListBuilder.m_171558_(), 
/* 144 */         PartPose.m_171423_(7.5644F, -4.8193F, -6.8098F, 0.1298F, 0.017F, -0.1298F));
/* 145 */     PartDefinition body_r4 = ArmL.m_171599_("body_r4", 
/* 146 */         CubeListBuilder.m_171558_().m_171514_(0, 79).m_171488_(-1.8219F, -0.5428F, -4.2825F, 5.0F, 8.0F, 5.0F, new CubeDeformation(0.0F))
/* 147 */         .m_171514_(0, 0).m_171488_(-1.7683F, -3.5318F, -4.2805F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(78, 93)
/* 148 */         .m_171488_(-1.7683F, -3.5318F, -4.2805F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 149 */         PartPose.m_171423_(0.1856F, 2.5931F, -1.3413F, -0.4765F, -0.0603F, -0.0873F));
/* 150 */     PartDefinition body_r5 = ArmL.m_171599_("body_r5", 
/* 151 */         CubeListBuilder.m_171558_().m_171514_(48, 26).m_171488_(-0.625F, -0.875F, 0.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), 
/* 152 */         PartPose.m_171423_(-0.6733F, 7.8765F, -7.88F, -0.4784F, 0.0403F, 0.1064F));
/* 153 */     PartDefinition body_r6 = ArmL.m_171599_("body_r6", 
/* 154 */         CubeListBuilder.m_171558_().m_171514_(30, 45).m_171488_(-0.5F, -0.875F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), 
/* 155 */         PartPose.m_171423_(-0.6733F, 7.7515F, -7.88F, -0.4784F, 0.0403F, 0.1064F));
/* 156 */     PartDefinition body_r7 = ArmL.m_171599_("body_r7", 
/* 157 */         CubeListBuilder.m_171558_().m_171514_(59, 45).m_171488_(1.25F, 0.0F, -0.125F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(32, 59)
/* 158 */         .m_171488_(1.25F, 0.0F, 3.125F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), 
/* 159 */         PartPose.m_171423_(2.1314F, 7.2426F, -7.3669F, -0.4608F, -0.1393F, -0.2437F));
/* 160 */     PartDefinition body_r8 = ArmL.m_171599_("body_r8", 
/* 161 */         CubeListBuilder.m_171558_().m_171514_(43, 4).m_171488_(0.125F, 0.0F, -1.125F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(43, 0)
/* 162 */         .m_171488_(0.125F, 0.0F, 2.125F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), 
/* 163 */         PartPose.m_171423_(2.1314F, 7.1176F, -7.3669F, -0.4608F, -0.1393F, -0.2437F));
/* 164 */     PartDefinition body_r9 = ArmL.m_171599_("body_r9", 
/* 165 */         CubeListBuilder.m_171558_().m_171514_(18, 92).m_171488_(6.1093F, -17.3441F, -2.4261F, 1.0F, 11.0F, 0.0F, new CubeDeformation(0.0F))
/* 166 */         .m_171514_(62, 19).m_171488_(5.1093F, -15.3441F, -2.4261F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(3, 0)
/* 167 */         .m_171488_(4.1093F, -14.3441F, -2.4261F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(88, 101)
/* 168 */         .m_171488_(7.0387F, -13.3382F, -4.4271F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(56, 96)
/* 169 */         .m_171488_(4.0387F, -13.3382F, -4.4271F, 3.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 170 */         PartPose.m_171423_(-5.5644F, 4.8277F, 1.8798F, 0.1745F, 0.0F, 0.0F));
/* 171 */     PartDefinition body_r10 = ArmL.m_171599_("body_r10", 
/* 172 */         CubeListBuilder.m_171558_().m_171514_(2, 25).m_171488_(0.2715F, -7.5348F, -0.2697F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
/* 173 */         .m_171514_(26, 58).m_171488_(0.2715F, -5.5348F, -1.2697F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 174 */         PartPose.m_171423_(0.1856F, 2.5931F, -1.3413F, -0.48F, 0.0F, -0.0873F));
/* 175 */     PartDefinition ArmR = partdefinition.m_171599_("ArmR", CubeListBuilder.m_171558_(), 
/* 176 */         PartPose.m_171423_(-7.5644F, -4.8193F, -6.8098F, 0.1304F, -0.0114F, 0.0866F));
/* 177 */     PartDefinition body_r11 = ArmR.m_171599_("body_r11", 
/* 178 */         CubeListBuilder.m_171558_().m_171514_(46, 26).m_171488_(-2.25F, 0.0F, 3.125F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(38, 45)
/* 179 */         .m_171488_(-2.25F, 0.0F, -0.125F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), 
/* 180 */         PartPose.m_171423_(-2.1314F, 7.2426F, -7.3669F, -0.4608F, 0.1393F, 0.2437F));
/* 181 */     PartDefinition body_r12 = ArmR.m_171599_("body_r12", 
/* 182 */         CubeListBuilder.m_171558_().m_171514_(38, 26).m_171488_(-0.375F, -0.875F, 0.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), 
/* 183 */         PartPose.m_171423_(0.6733F, 7.8765F, -7.88F, -0.4784F, -0.0403F, -0.1064F));
/* 184 */     PartDefinition body_r13 = ArmR.m_171599_("body_r13", 
/* 185 */         CubeListBuilder.m_171558_().m_171514_(78, 101).m_171488_(-8.0387F, -13.3382F, -4.4271F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
/* 186 */         .m_171514_(13, 0).m_171488_(-5.1093F, -14.3441F, -2.4261F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(92, 22)
/* 187 */         .m_171488_(-7.1093F, -17.3441F, -2.4261F, 1.0F, 11.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(51, 62)
/* 188 */         .m_171488_(-6.1093F, -15.3441F, -2.4261F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(36, 26)
/* 189 */         .m_171488_(-6.9843F, -13.3441F, -4.4261F, 3.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 190 */         PartPose.m_171423_(5.5644F, 4.8277F, 1.8798F, 0.1745F, 0.0F, 0.0F));
/* 191 */     PartDefinition body_r14 = ArmR.m_171599_("body_r14", 
/* 192 */         CubeListBuilder.m_171558_().m_171514_(0, 25).m_171488_(-0.2178F, -7.5443F, -0.2747F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
/* 193 */         .m_171514_(32, 54).m_171488_(-0.2178F, -5.5443F, -1.2747F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 194 */         PartPose.m_171423_(-0.1856F, 2.5931F, -1.3413F, -0.48F, 0.0F, 0.0873F));
/* 195 */     PartDefinition body_r15 = ArmR.m_171599_("body_r15", 
/* 196 */         CubeListBuilder.m_171558_().m_171514_(26, 55).m_171488_(-2.125F, 0.0F, 2.125F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(17, 64)
/* 197 */         .m_171488_(-2.125F, 0.0F, -1.125F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), 
/* 198 */         PartPose.m_171423_(-2.1314F, 7.1176F, -7.3669F, -0.4608F, 0.1393F, 0.2437F));
/* 199 */     PartDefinition body_r16 = ArmR.m_171599_("body_r16", 
/* 200 */         CubeListBuilder.m_171558_().m_171514_(52, 41).m_171488_(-1.5F, -0.875F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), 
/* 201 */         PartPose.m_171423_(0.6733F, 7.7515F, -7.88F, -0.4784F, -0.0403F, -0.1064F));
/* 202 */     PartDefinition body_r17 = ArmR.m_171599_("body_r17", 
/* 203 */         CubeListBuilder.m_171558_().m_171514_(93, 57).m_171488_(-2.1781F, -3.5428F, -4.2825F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
/* 204 */         .m_171514_(83, 80).m_171488_(-3.1781F, -0.5428F, -4.2825F, 5.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 205 */         PartPose.m_171423_(-0.1856F, 2.5931F, -1.3413F, -0.4765F, 0.0603F, 0.0873F));
/* 206 */     PartDefinition leg0 = partdefinition.m_171599_("leg0", 
/* 207 */         CubeListBuilder.m_171558_().m_171514_(66, 18).m_171488_(-4.625F, 11.7545F, -8.1168F, 5.0F, 8.0F, 7.0F, new CubeDeformation(0.0F))
/* 208 */         .m_171514_(51, 92).m_171488_(-1.125F, 17.7545F, -8.8668F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(94, 22)
/* 209 */         .m_171488_(-5.125F, 17.7545F, -8.8668F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(43, 3)
/* 210 */         .m_171488_(-4.125F, 17.7545F, -9.8668F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(30, 44)
/* 211 */         .m_171488_(-0.125F, 17.7545F, -9.8668F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(43, 0)
/* 212 */         .m_171488_(-4.125F, 18.7545F, -10.8668F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(36, 48)
/* 213 */         .m_171488_(-0.125F, 18.7545F, -10.8668F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 58)
/* 214 */         .m_171488_(-3.125F, 17.7545F, -1.1168F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 215 */         PartPose.m_171419_(-5.5F, 4.25F, -4.0F));
/* 216 */     PartDefinition leg4_r1 = leg0.m_171599_("leg4_r1", 
/* 217 */         CubeListBuilder.m_171558_().m_171514_(30, 101).m_171488_(-2.25F, -9.5F, -4.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(0, 92)
/* 218 */         .m_171488_(-3.25F, -8.55F, -4.0F, 3.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 219 */         PartPose.m_171423_(-0.25F, 7.2057F, -3.4455F, -0.5672F, 0.0F, 0.0F));
/* 220 */     PartDefinition leg4_r2 = leg0.m_171599_("leg4_r2", 
/* 221 */         CubeListBuilder.m_171558_().m_171514_(0, 11).m_171488_(-2.25F, -7.5F, -4.0F, 0.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).m_171514_(58, 40)
/* 222 */         .m_171488_(-2.25F, -10.5F, -4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 1)
/* 223 */         .m_171488_(-2.25F, -9.5F, -4.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(13, 1)
/* 224 */         .m_171488_(-2.25F, -8.5F, -4.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).m_171514_(45, 78).m_171488_(-4.25F, -6.5F, -4.0F, 4.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), 
/*     */         
/* 226 */         PartPose.m_171423_(0.0F, 12.25F, -4.25F, 0.2182F, 0.0F, 0.0F));
/* 227 */     PartDefinition leg1 = partdefinition.m_171599_("leg1", 
/* 228 */         CubeListBuilder.m_171558_().m_171514_(49, 63).m_171488_(-0.125F, 11.7545F, -7.1168F, 5.0F, 8.0F, 7.0F, new CubeDeformation(0.0F))
/* 229 */         .m_171514_(79, 12).m_171488_(-0.625F, 17.7545F, -7.8668F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(75, 48)
/* 230 */         .m_171488_(3.375F, 17.7545F, -7.8668F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(36, 44)
/* 231 */         .m_171488_(0.375F, 17.7545F, -8.8668F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 46)
/* 232 */         .m_171488_(4.375F, 17.7545F, -8.8668F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(49, 0)
/* 233 */         .m_171488_(0.375F, 18.7545F, -9.8668F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(4, 49)
/* 234 */         .m_171488_(4.375F, 18.7545F, -9.8668F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(60, 41)
/* 235 */         .m_171488_(1.5F, 17.7545F, -0.2418F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 236 */         PartPose.m_171419_(5.5F, 4.25F, -5.0F));
/* 237 */     PartDefinition leg5_r1 = leg1.m_171599_("leg5_r1", 
/* 238 */         CubeListBuilder.m_171558_().m_171514_(0, 1).m_171488_(2.25F, -7.5F, -4.0F, 0.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).m_171514_(13, 0)
/* 239 */         .m_171488_(2.25F, -8.5F, -4.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).m_171514_(0, 0)
/* 240 */         .m_171488_(2.25F, -9.5F, -4.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(30, 58)
/* 241 */         .m_171488_(2.25F, -10.5F, -4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(73, 34).m_171488_(0.25F, -6.5F, -4.0F, 4.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), 
/*     */         
/* 243 */         PartPose.m_171423_(0.0F, 12.25F, -3.25F, 0.2182F, 0.0F, 0.0F));
/* 244 */     PartDefinition leg5_r2 = leg1.m_171599_("leg5_r2", 
/* 245 */         CubeListBuilder.m_171558_().m_171514_(66, 33).m_171488_(0.25F, -9.5F, -4.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(0, 26)
/* 246 */         .m_171488_(0.25F, -8.55F, -4.0F, 3.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 247 */         PartPose.m_171423_(0.25F, 7.2057F, -2.4455F, -0.5672F, 0.0F, 0.0F));
/* 248 */     PartDefinition leg2 = partdefinition.m_171599_("leg2", 
/* 249 */         CubeListBuilder.m_171558_().m_171514_(0, 64).m_171488_(-4.625F, 10.7545F, 3.2582F, 5.0F, 8.0F, 7.0F, new CubeDeformation(0.0F))
/* 250 */         .m_171514_(81, 74).m_171488_(-1.125F, 16.7545F, 2.5082F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(81, 70)
/* 251 */         .m_171488_(-5.125F, 16.7545F, 2.5082F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(11, 28)
/* 252 */         .m_171488_(-0.125F, 16.7545F, 1.5082F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(13, 28)
/* 253 */         .m_171488_(-4.125F, 16.7545F, 1.5082F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(13, 0)
/* 254 */         .m_171488_(-0.125F, 17.7545F, 0.5082F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(17, 0)
/* 255 */         .m_171488_(-4.125F, 17.7545F, 0.5082F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 55)
/* 256 */         .m_171488_(-3.125F, 16.7545F, 10.2582F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 257 */         PartPose.m_171419_(-5.5F, 5.25F, 7.0F));
/* 258 */     PartDefinition leg5_r3 = leg2.m_171599_("leg5_r3", 
/* 259 */         CubeListBuilder.m_171558_().m_171514_(16, 101).m_171488_(-2.25F, -8.5F, -1.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(40, 92)
/* 260 */         .m_171488_(-3.25F, -7.55F, -1.0F, 3.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 261 */         PartPose.m_171423_(-0.25F, 6.2057F, 4.4455F, 0.7854F, 0.0F, 0.0F));
/* 262 */     PartDefinition leg3_r1 = leg2.m_171599_("leg3_r1", 
/* 263 */         CubeListBuilder.m_171558_().m_171514_(76, 48).m_171488_(-9.75F, -3.5F, -3.5F, 4.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), 
/* 264 */         PartPose.m_171423_(5.5F, 8.4293F, 5.9875F, 0.2182F, 0.0F, 0.0F));
/* 265 */     PartDefinition leg3 = partdefinition.m_171599_("leg3", 
/* 266 */         CubeListBuilder.m_171558_().m_171514_(25, 62).m_171488_(-0.125F, 10.7545F, 2.2582F, 5.0F, 8.0F, 7.0F, new CubeDeformation(0.0F))
/* 267 */         .m_171514_(70, 4).m_171488_(-0.625F, 16.7545F, 1.5082F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(70, 0)
/* 268 */         .m_171488_(3.375F, 16.7545F, 1.5082F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(4, 46)
/* 269 */         .m_171488_(0.375F, 16.7545F, 0.5082F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(38, 47)
/* 270 */         .m_171488_(4.375F, 16.7545F, 0.5082F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(49, 7)
/* 271 */         .m_171488_(0.375F, 17.7545F, -0.4918F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(28, 58)
/* 272 */         .m_171488_(4.375F, 17.7545F, -0.4918F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 64)
/* 273 */         .m_171488_(1.375F, 16.7545F, 9.1332F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 274 */         PartPose.m_171419_(5.5F, 5.25F, 8.0F));
/* 275 */     PartDefinition leg6_r1 = leg3.m_171599_("leg6_r1", 
/* 276 */         CubeListBuilder.m_171558_().m_171514_(42, 62).m_171488_(0.25F, -8.5F, -1.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(89, 65)
/* 277 */         .m_171488_(0.25F, -7.55F, -1.0F, 3.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 278 */         PartPose.m_171423_(0.25F, 6.2057F, 3.4455F, 0.7854F, 0.0F, 0.0F));
/* 279 */     PartDefinition leg4_r3 = leg3.m_171599_("leg4_r3", 
/* 280 */         CubeListBuilder.m_171558_().m_171514_(66, 71).m_171488_(5.75F, -3.5F, -3.5F, 4.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), 
/* 281 */         PartPose.m_171423_(-5.5F, 8.4293F, 4.9875F, 0.2182F, 0.0F, 0.0F));
/* 282 */     return LayerDefinition.m_171565_(meshdefinition, 128, 128);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void m_7695_(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 288 */     this.head.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 289 */     this.body.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 290 */     this.ArmL.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 291 */     this.ArmR.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 292 */     this.leg0.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 293 */     this.leg1.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 294 */     this.leg2.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 295 */     this.leg3.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */   
/*     */   public void m_6973_(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
/* 299 */     this.head.f_104204_ = netHeadYaw / 57.295776F;
/* 300 */     this.head.f_104203_ = headPitch / 57.295776F;
/* 301 */     this.leg0.f_104203_ = Mth.m_14089_(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
/* 302 */     this.leg1.f_104203_ = Mth.m_14089_(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
/* 303 */     this.leg2.f_104203_ = Mth.m_14089_(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
/* 304 */     this.leg3.f_104203_ = Mth.m_14089_(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
/* 305 */     this.ArmR.f_104203_ = Mth.m_14089_(limbSwing * 0.6662F + 3.1415927F) * limbSwingAmount;
/* 306 */     this.ArmL.f_104203_ = Mth.m_14089_(limbSwing * 0.6662F) * limbSwingAmount;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\client\model\ModelDark_latex_creeper_enhanced.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */