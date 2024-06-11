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
/*     */ public class Modeltsc_berserk_model<T extends Entity>
/*     */   extends EntityModel<T>
/*     */ {
/*  25 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("turned", "modeltsc_berserk_model"), "main");
/*     */   public final ModelPart Head;
/*     */   public final ModelPart Body;
/*     */   public final ModelPart LeftArm;
/*     */   public final ModelPart LeftArm2;
/*     */   public final ModelPart RightArm;
/*     */   public final ModelPart RightArm2;
/*     */   public final ModelPart LeftLeg;
/*     */   public final ModelPart RightLeg;
/*     */   public final ModelPart LeftArm3;
/*     */   public final ModelPart RightArm3;
/*     */   
/*     */   public Modeltsc_berserk_model(ModelPart root) {
/*  38 */     this.Head = root.m_171324_("Head");
/*  39 */     this.Body = root.m_171324_("Body");
/*  40 */     this.LeftArm = root.m_171324_("LeftArm");
/*  41 */     this.LeftArm2 = root.m_171324_("LeftArm2");
/*  42 */     this.RightArm = root.m_171324_("RightArm");
/*  43 */     this.RightArm2 = root.m_171324_("RightArm2");
/*  44 */     this.LeftLeg = root.m_171324_("LeftLeg");
/*  45 */     this.RightLeg = root.m_171324_("RightLeg");
/*  46 */     this.LeftArm3 = root.m_171324_("LeftArm3");
/*  47 */     this.RightArm3 = root.m_171324_("RightArm3");
/*     */   }
/*     */   
/*     */   public static LayerDefinition createBodyLayer() {
/*  51 */     MeshDefinition meshdefinition = new MeshDefinition();
/*  52 */     PartDefinition partdefinition = meshdefinition.m_171576_();
/*  53 */     PartDefinition Head = partdefinition.m_171599_("Head", 
/*  54 */         CubeListBuilder.m_171558_().m_171514_(0, 0).m_171488_(-3.5F, -7.0F, -3.5F, 7.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)).m_171514_(39, 16)
/*  55 */         .m_171488_(-0.5F, -7.25F, -3.75F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).m_171514_(13, 25)
/*  56 */         .m_171488_(-3.5F, -2.0F, -2.5F, 7.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(18, 45)
/*  57 */         .m_171488_(-2.5F, -1.0F, -3.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(48, 16)
/*  58 */         .m_171488_(-3.5F, -2.0F, -3.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(74, 32)
/*  59 */         .m_171488_(-3.75F, -2.625F, -3.625F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(74, 24)
/*  60 */         .m_171488_(2.75F, -2.625F, -3.625F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(64, 28)
/*  61 */         .m_171488_(-3.875F, -2.125F, -4.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(64, 19)
/*  62 */         .m_171488_(2.875F, -2.125F, -4.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(62, 35)
/*  63 */         .m_171488_(2.875F, -0.875F, -4.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(59, 32)
/*  64 */         .m_171488_(-3.875F, -0.875F, -4.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(78, 13)
/*  65 */         .m_171488_(2.75F, -2.625F, 0.375F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).m_171514_(15, 78)
/*  66 */         .m_171488_(-3.75F, -2.625F, 0.375F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).m_171514_(47, 0)
/*  67 */         .m_171488_(2.5F, -2.0F, -3.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  68 */         PartPose.m_171419_(0.0F, -1.75F, -3.125F));
/*  69 */     PartDefinition Head_r1 = Head.m_171599_("Head_r1", 
/*  70 */         CubeListBuilder.m_171558_().m_171514_(23, 3).m_171488_(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), 
/*  71 */         PartPose.m_171423_(-2.125F, -0.875F, -3.375F, 0.0F, 0.0F, 0.7854F));
/*  72 */     PartDefinition Head_r2 = Head.m_171599_("Head_r2", 
/*  73 */         CubeListBuilder.m_171558_().m_171514_(0, 23).m_171488_(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), 
/*  74 */         PartPose.m_171423_(-2.7071F, -2.2071F, -3.375F, 0.0F, 0.0F, 0.7854F));
/*  75 */     PartDefinition Head_r3 = Head.m_171599_("Head_r3", 
/*  76 */         CubeListBuilder.m_171558_().m_171514_(0, 0).m_171488_(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), 
/*  77 */         PartPose.m_171423_(2.6997F, -2.2071F, -3.375F, 0.0F, 0.0F, 0.7854F));
/*  78 */     PartDefinition Head_r4 = Head.m_171599_("Head_r4", 
/*  79 */         CubeListBuilder.m_171558_().m_171514_(4, 0).m_171488_(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), 
/*  80 */         PartPose.m_171423_(2.1176F, -0.875F, -3.375F, 0.0F, 0.0F, 0.7854F));
/*  81 */     PartDefinition Head_r5 = Head.m_171599_("Head_r5", 
/*  82 */         CubeListBuilder.m_171558_().m_171514_(0, 1).m_171488_(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), 
/*  83 */         PartPose.m_171423_(1.4105F, -1.8321F, -3.375F, 0.0F, 0.0F, 0.7854F));
/*  84 */     PartDefinition Head_r6 = Head.m_171599_("Head_r6", 
/*  85 */         CubeListBuilder.m_171558_().m_171514_(21, 3).m_171488_(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), 
/*  86 */         PartPose.m_171423_(-0.0037F, -2.0821F, -3.375F, 0.0F, 0.0F, 0.7854F));
/*  87 */     PartDefinition Head_r7 = Head.m_171599_("Head_r7", 
/*  88 */         CubeListBuilder.m_171558_().m_171514_(4, 1).m_171488_(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), 
/*  89 */         PartPose.m_171423_(0.7034F, -0.75F, -3.375F, 0.0F, 0.0F, 0.7854F));
/*  90 */     PartDefinition Head_r8 = Head.m_171599_("Head_r8", 
/*  91 */         CubeListBuilder.m_171558_().m_171514_(23, 12).m_171488_(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), 
/*  92 */         PartPose.m_171423_(-1.4179F, -1.8321F, -3.375F, 0.0F, 0.0F, 0.7854F));
/*  93 */     PartDefinition Head_r9 = Head.m_171599_("Head_r9", 
/*  94 */         CubeListBuilder.m_171558_().m_171514_(0, 24).m_171488_(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), 
/*  95 */         PartPose.m_171423_(-0.7108F, -0.75F, -3.375F, 0.0F, 0.0F, 0.7854F));
/*  96 */     PartDefinition Head_r10 = Head.m_171599_("Head_r10", 
/*  97 */         CubeListBuilder.m_171558_().m_171514_(48, 26).m_171488_(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  98 */         PartPose.m_171423_(-3.2217F, -1.625F, -4.2706F, 0.0F, -1.9635F, 0.0F));
/*  99 */     PartDefinition Head_r11 = Head.m_171599_("Head_r11", 
/* 100 */         CubeListBuilder.m_171558_().m_171514_(27, 49).m_171488_(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 101 */         PartPose.m_171423_(3.2217F, -1.625F, -4.2706F, 0.0F, 1.9635F, 0.0F));
/* 102 */     PartDefinition Head_r12 = Head.m_171599_("Head_r12", 
/* 103 */         CubeListBuilder.m_171558_().m_171514_(33, 49).m_171488_(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 104 */         PartPose.m_171423_(1.9152F, -0.375F, -4.4948F, 0.0F, 1.9635F, 0.0F));
/* 105 */     PartDefinition Head_r13 = Head.m_171599_("Head_r13", 
/* 106 */         CubeListBuilder.m_171558_().m_171514_(49, 33).m_171488_(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 107 */         PartPose.m_171423_(-1.9152F, -0.375F, -4.4948F, 0.0F, -1.9635F, 0.0F));
/* 108 */     PartDefinition Head_r14 = Head.m_171599_("Head_r14", 
/* 109 */         CubeListBuilder.m_171558_().m_171514_(56, 56).m_171488_(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), 
/* 110 */         PartPose.m_171423_(-2.7598F, -0.375F, -3.9207F, 0.0F, -1.1781F, 0.0F));
/* 111 */     PartDefinition Head_r15 = Head.m_171599_("Head_r15", 
/* 112 */         CubeListBuilder.m_171558_().m_171514_(14, 57).m_171488_(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), 
/* 113 */         PartPose.m_171423_(2.7598F, -0.375F, -3.9207F, 0.0F, 1.1781F, 0.0F));
/* 114 */     PartDefinition Head_r16 = Head.m_171599_("Head_r16", 
/* 115 */         CubeListBuilder.m_171558_().m_171514_(34, 41).m_171488_(-3.5F, -3.0F, 0.0F, 7.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), 
/* 116 */         PartPose.m_171423_(0.0F, -2.2119F, 1.172F, -0.9599F, 0.0F, 0.0F));
/* 117 */     PartDefinition Head_r17 = Head.m_171599_("Head_r17", 
/* 118 */         CubeListBuilder.m_171558_().m_171514_(26, 9).m_171488_(-3.5F, -2.5F, 1.5F, 7.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 119 */         PartPose.m_171423_(0.0F, -5.2643F, 1.1575F, -0.3927F, 0.0F, 0.0F));
/* 120 */     PartDefinition Head_r18 = Head.m_171599_("Head_r18", 
/* 121 */         CubeListBuilder.m_171558_().m_171514_(32, 34).m_171488_(-3.5F, -2.5F, 1.5F, 7.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), 
/* 122 */         PartPose.m_171423_(0.0F, -5.2643F, -5.8425F, -0.3927F, 0.0F, 0.0F));
/* 123 */     PartDefinition Head_r19 = Head.m_171599_("Head_r19", 
/* 124 */         CubeListBuilder.m_171558_().m_171514_(31, 72).m_171488_(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 125 */         PartPose.m_171423_(0.0F, -3.8251F, -4.6275F, 1.1781F, 0.0F, 0.0F));
/* 126 */     PartDefinition Ears = Head.m_171599_("Ears", 
/* 127 */         CubeListBuilder.m_171558_().m_171514_(68, 40).m_171488_(-0.875F, -1.5F, -4.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(66, 67)
/* 128 */         .m_171488_(6.875F, -1.5F, -4.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(56, 17)
/* 129 */         .m_171488_(6.875F, -1.5F, 1.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(56, 25).m_171488_(-0.875F, -1.5F, 1.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), 
/*     */         
/* 131 */         PartPose.m_171423_(-3.5F, -5.625F, 1.75F, 0.2618F, 0.0F, 0.0F));
/* 132 */     PartDefinition Ears2 = Head.m_171599_("Ears2", 
/* 133 */         CubeListBuilder.m_171558_().m_171514_(3, 67).m_171488_(-0.625F, -1.5F, -4.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(66, 60)
/* 134 */         .m_171488_(6.625F, -1.5F, -4.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(50, 49)
/* 135 */         .m_171488_(6.625F, -1.5F, 1.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(47, 42).m_171488_(-0.625F, -1.5F, 1.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), 
/*     */         
/* 137 */         PartPose.m_171423_(-3.5F, -3.875F, 4.25F, 0.2618F, 0.0F, 0.0F));
/* 138 */     PartDefinition Body = partdefinition.m_171599_("Body", 
/* 139 */         CubeListBuilder.m_171558_().m_171514_(21, 0).m_171488_(-4.0F, 8.0F, -2.0F, 8.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
/* 140 */         .m_171514_(26, 16).m_171488_(-3.5F, 4.0F, -1.375F, 7.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 141 */         PartPose.m_171419_(0.0F, 0.0F, 0.0F));
/* 142 */     PartDefinition Body_r1 = Body.m_171599_("Body_r1", 
/* 143 */         CubeListBuilder.m_171558_().m_171514_(33, 51).m_171488_(-2.125F, -0.5F, -1.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(27, 51)
/* 144 */         .m_171488_(0.125F, -0.5F, -1.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 145 */         PartPose.m_171423_(0.0F, 1.125F, -2.25F, 0.0F, -0.3927F, 1.5708F));
/* 146 */     PartDefinition Body_r2 = Body.m_171599_("Body_r2", 
/* 147 */         CubeListBuilder.m_171558_().m_171514_(54, 7).m_171488_(0.625F, -1.0F, -1.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(43, 57)
/* 148 */         .m_171488_(-1.625F, -1.0F, -1.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(31, 78).m_171488_(-1.5F, -2.0F, -1.75F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), 
/*     */         
/* 150 */         PartPose.m_171423_(0.0F, 1.125F, -2.25F, 0.3927F, 0.0F, 0.0F));
/* 151 */     PartDefinition Body_r3 = Body.m_171599_("Body_r3", 
/* 152 */         CubeListBuilder.m_171558_().m_171514_(28, 34).m_171488_(-1.0F, -13.0F, -2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(74, 20)
/* 153 */         .m_171488_(-2.0F, -16.0F, -2.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 154 */         PartPose.m_171423_(0.0F, 23.5474F, -6.2752F, -0.3927F, 0.0F, 0.0F));
/* 155 */     PartDefinition Body_r4 = Body.m_171599_("Body_r4", 
/* 156 */         CubeListBuilder.m_171558_().m_171514_(0, 12).m_171488_(2.0F, -2.5284F, -2.3321F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(20, 12)
/* 157 */         .m_171488_(-3.0F, -2.5284F, -2.3321F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 45)
/* 158 */         .m_171488_(-4.0F, -3.0284F, -2.0821F, 8.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(22, 31)
/* 159 */         .m_171488_(-4.125F, 1.5966F, -2.3321F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(43, 9)
/* 160 */         .m_171488_(2.125F, 1.5966F, -2.3321F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(27, 49)
/* 161 */         .m_171488_(2.625F, -3.6534F, -1.8321F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(8, 56)
/* 162 */         .m_171488_(-3.625F, -3.6534F, -1.8321F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(69, 0)
/* 163 */         .m_171488_(3.625F, -4.2216F, -2.1679F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(72, 47)
/* 164 */         .m_171488_(3.625F, -5.2216F, -1.1679F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(73, 67)
/* 165 */         .m_171488_(-4.625F, -5.2216F, -1.1679F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(71, 14)
/* 166 */         .m_171488_(-4.625F, -4.2216F, -2.1679F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(0, 12)
/* 167 */         .m_171488_(-4.0F, -3.3466F, -1.4179F, 8.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(64, 52)
/* 168 */         .m_171488_(-2.5F, -4.3466F, -0.9179F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 169 */         PartPose.m_171423_(0.0F, 1.7081F, -1.5933F, 0.2618F, 0.0F, 0.0F));
/* 170 */     PartDefinition Body_r5 = Body.m_171599_("Body_r5", 
/* 171 */         CubeListBuilder.m_171558_().m_171514_(59, 0).m_171488_(-2.5F, -1.0F, -0.5F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 172 */         PartPose.m_171423_(-0.125F, -2.3813F, 0.1016F, -0.3491F, 0.0F, 0.0F));
/* 173 */     PartDefinition Tail = Body.m_171599_("Tail", 
/* 174 */         CubeListBuilder.m_171558_().m_171514_(0, 23).m_171488_(-1.0F, -1.0474F, 8.4222F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).m_171514_(28, 25)
/* 175 */         .m_171488_(-1.0F, -1.0474F, -0.0778F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).m_171514_(14, 13)
/* 176 */         .m_171488_(-0.5F, -0.8937F, 7.9508F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).m_171514_(25, 41)
/* 177 */         .m_171488_(-0.5F, 1.1063F, 7.9508F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).m_171514_(38, 0)
/* 178 */         .m_171488_(-0.5F, -0.8937F, 0.4508F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).m_171514_(39, 24)
/* 179 */         .m_171488_(-0.5F, 1.1063F, 0.4508F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), 
/* 180 */         PartPose.m_171423_(0.0F, 7.9632F, 1.5971F, -0.3927F, 0.0F, 0.0F));
/* 181 */     PartDefinition Tail_r1 = Tail.m_171599_("Tail_r1", 
/* 182 */         CubeListBuilder.m_171558_().m_171514_(10, 75).m_171488_(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 183 */         PartPose.m_171423_(0.0F, 1.1235F, 16.1893F, 0.3491F, 0.0F, 0.0F));
/* 184 */     PartDefinition Tail_r2 = Tail.m_171599_("Tail_r2", 
/* 185 */         CubeListBuilder.m_171558_().m_171514_(58, 16).m_171488_(-0.6971F, 0.8948F, -0.3029F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
/* 186 */         .m_171514_(58, 18).m_171488_(-0.6971F, -0.8552F, -0.3029F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 187 */         PartPose.m_171423_(0.0F, 0.1063F, 7.4508F, 0.0F, 0.7854F, 0.0F));
/* 188 */     PartDefinition LeftArm = partdefinition.m_171599_("LeftArm", 
/* 189 */         CubeListBuilder.m_171558_().m_171514_(64, 10).m_171488_(-2.653F, -0.7563F, -0.6637F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
/* 190 */         .m_171514_(59, 3).m_171488_(-3.653F, 4.2437F, -2.1637F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(58, 10)
/* 191 */         .m_171488_(-3.7804F, 5.7699F, -1.5655F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(48, 16)
/* 192 */         .m_171488_(-3.2912F, -1.5734F, -1.2389F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 193 */         PartPose.m_171423_(-4.0F, 1.0F, -3.0F, 0.1309F, 0.0F, 0.3054F));
/* 194 */     PartDefinition RightBlade_r1 = LeftArm.m_171599_("RightBlade_r1", 
/* 195 */         CubeListBuilder.m_171558_().m_171514_(0, 23).m_171488_(-0.5F, -2.5F, -1.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 196 */         PartPose.m_171423_(-1.7636F, 13.2461F, -10.2117F, -1.5272F, 0.0F, 0.0F));
/* 197 */     PartDefinition LeftBlade_r1 = LeftArm.m_171599_("LeftBlade_r1", 
/* 198 */         CubeListBuilder.m_171558_().m_171514_(21, 0).m_171488_(-13.1106F, -0.8591F, -0.118F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 199 */         PartPose.m_171423_(10.847F, 19.3667F, -8.1568F, 0.7854F, 0.0F, 0.0F));
/* 200 */     PartDefinition RightBlade_r2 = LeftArm.m_171599_("RightBlade_r2", 
/* 201 */         CubeListBuilder.m_171558_().m_171514_(0, 0).m_171488_(-0.06F, 9.5F, -4.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), 
/* 202 */         PartPose.m_171423_(-2.2036F, 11.5238F, 2.9344F, -1.0472F, 0.0F, 0.0F));
/* 203 */     PartDefinition LeftBlade_r2 = LeftArm.m_171599_("LeftBlade_r2", 
/* 204 */         CubeListBuilder.m_171558_().m_171514_(31, 25).m_171488_(-13.1106F, -0.8591F, -0.118F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 205 */         PartPose.m_171423_(10.847F, 17.5912F, -8.1312F, -1.1781F, 0.0F, 0.0F));
/* 206 */     PartDefinition LeftBlade_r3 = LeftArm.m_171599_("LeftBlade_r3", 
/* 207 */         CubeListBuilder.m_171558_().m_171514_(27, 72).m_171488_(-13.1106F, -0.8591F, -0.118F, 1.0F, 13.0F, 1.0F, new CubeDeformation(0.0F))
/* 208 */         .m_171514_(36, 23).m_171488_(-13.1106F, 8.1409F, -1.118F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(28, 36)
/* 209 */         .m_171488_(-13.1106F, 1.1409F, -1.118F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(58, 65)
/* 210 */         .m_171488_(-13.1106F, 0.1409F, -4.118F, 1.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 211 */         PartPose.m_171423_(10.847F, 8.8687F, 0.9613F, -0.7854F, 0.0F, 0.0F));
/* 212 */     PartDefinition LeftArm_r1 = LeftArm.m_171599_("LeftArm_r1", 
/* 213 */         CubeListBuilder.m_171558_().m_171514_(66, 28).m_171488_(-1.03F, -2.5F, -5.0F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 214 */         PartPose.m_171423_(-1.653F, 9.7437F, -0.1637F, -0.7854F, 0.0F, 0.0F));
/* 215 */     PartDefinition LeftArm2 = partdefinition.m_171599_("LeftArm2", 
/* 216 */         CubeListBuilder.m_171558_().m_171514_(58, 38).m_171488_(-0.8125F, -9.9365F, -1.041F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
/* 217 */         .m_171514_(47, 56).m_171488_(-0.9375F, -7.6865F, 0.459F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).m_171514_(73, 6)
/* 218 */         .m_171488_(-0.4375F, -2.8115F, -0.541F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).m_171514_(28, 7)
/* 219 */         .m_171488_(-0.5699F, -9.4192F, -0.547F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 220 */         PartPose.m_171423_(-3.0F, 1.0F, 0.0F, -0.2839F, -0.3178F, -0.9685F));
/* 221 */     PartDefinition RightBlade_r3 = LeftArm2.m_171599_("RightBlade_r3", 
/* 222 */         CubeListBuilder.m_171558_().m_171514_(78, 45).m_171488_(-0.5F, -1.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), 
/* 223 */         PartPose.m_171423_(0.4425F, -17.7731F, -7.1356F, 0.829F, 0.0F, 0.0F));
/* 224 */     PartDefinition RightBlade_r4 = LeftArm2.m_171599_("RightBlade_r4", 
/* 225 */         CubeListBuilder.m_171558_().m_171514_(61, 78).m_171488_(-0.5F, -4.0F, -1.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 226 */         PartPose.m_171423_(0.4425F, -17.2699F, -7.2407F, 0.5236F, 0.0F, 0.0F));
/* 227 */     PartDefinition RightBlade_r5 = LeftArm2.m_171599_("RightBlade_r5", 
/* 228 */         CubeListBuilder.m_171558_().m_171514_(38, 64).m_171488_(-0.7449F, -8.957F, -4.0407F, 1.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 229 */         PartPose.m_171423_(0.6875F, -11.5615F, 2.084F, 0.7854F, 0.0F, 0.0F));
/* 230 */     PartDefinition RightArm_r1 = LeftArm2.m_171599_("RightArm_r1", 
/* 231 */         CubeListBuilder.m_171558_().m_171514_(46, 65).m_171488_(-1.7449F, -0.957F, -5.0407F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 232 */         PartPose.m_171423_(1.1875F, -12.4365F, 0.959F, 0.7854F, 0.0F, 0.0F));
/* 233 */     PartDefinition RightArm = partdefinition.m_171599_("RightArm", 
/* 234 */         CubeListBuilder.m_171558_().m_171514_(59, 56).m_171488_(-0.4588F, -0.6984F, -0.7389F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
/* 235 */         .m_171514_(48, 24).m_171488_(0.2912F, -1.5734F, -1.2389F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(58, 45)
/* 236 */         .m_171488_(0.5412F, 4.3016F, -2.1139F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(58, 52)
/* 237 */         .m_171488_(0.7804F, 5.7699F, -1.5655F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 238 */         PartPose.m_171423_(4.0F, 1.0F, -3.0F, 0.0873F, 0.0F, -0.3927F));
/* 239 */     PartDefinition LeftBlade_r4 = RightArm.m_171599_("LeftBlade_r4", 
/* 240 */         CubeListBuilder.m_171558_().m_171514_(23, 71).m_171488_(12.1106F, -1.8591F, -0.118F, 1.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 241 */         PartPose.m_171423_(-11.0094F, 10.6782F, -0.5736F, -0.7854F, 0.0F, 0.0F));
/* 242 */     PartDefinition LeftBlade_r5 = RightArm.m_171599_("LeftBlade_r5", 
/* 243 */         CubeListBuilder.m_171558_().m_171514_(5, 23).m_171488_(12.1106F, -0.8591F, -0.118F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 244 */         PartPose.m_171423_(-11.0094F, 20.4691F, -8.9845F, 0.7854F, 0.0F, 0.0F));
/* 245 */     PartDefinition LeftBlade_r6 = RightArm.m_171599_("LeftBlade_r6", 
/* 246 */         CubeListBuilder.m_171558_().m_171514_(13, 25).m_171488_(12.1106F, -0.8591F, -0.118F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 247 */         PartPose.m_171423_(-11.0094F, 18.6936F, -8.959F, -1.1781F, 0.0F, 0.0F));
/* 248 */     PartDefinition RightBlade_r6 = RightArm.m_171599_("RightBlade_r6", 
/* 249 */         CubeListBuilder.m_171558_().m_171514_(39, 24).m_171488_(-0.94F, 9.5F, -4.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), 
/* 250 */         PartPose.m_171423_(2.0412F, 11.919F, 2.8137F, -1.0472F, 0.0F, 0.0F));
/* 251 */     PartDefinition RightBlade_r7 = RightArm.m_171599_("RightBlade_r7", 
/* 252 */         CubeListBuilder.m_171558_().m_171514_(53, 74).m_171488_(-0.5F, -2.5F, -1.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 253 */         PartPose.m_171423_(1.6012F, 13.6414F, -10.3323F, -1.5272F, 0.0F, 0.0F));
/* 254 */     PartDefinition RightBlade_r8 = RightArm.m_171599_("RightBlade_r8", 
/* 255 */         CubeListBuilder.m_171558_().m_171514_(46, 32).m_171488_(-0.94F, 1.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(48, 24)
/* 256 */         .m_171488_(-0.94F, 8.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(15, 66).m_171488_(-0.94F, 0.5F, -4.0F, 1.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)), 
/*     */         
/* 258 */         PartPose.m_171423_(2.0412F, 8.9266F, 1.0111F, -0.7854F, 0.0F, 0.0F));
/* 259 */     PartDefinition RightArm_r2 = RightArm.m_171599_("RightArm_r2", 
/* 260 */         CubeListBuilder.m_171558_().m_171514_(66, 20).m_171488_(-0.94F, -2.5F, -5.0F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 261 */         PartPose.m_171423_(1.5412F, 9.8016F, -0.1139F, -0.7854F, 0.0F, 0.0F));
/* 262 */     PartDefinition RightArm2 = partdefinition.m_171599_("RightArm2", 
/* 263 */         CubeListBuilder.m_171558_().m_171514_(18, 57).m_171488_(-2.0625F, -7.6865F, 0.459F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
/* 264 */         .m_171514_(43, 73).m_171488_(-1.5625F, -2.8115F, -0.541F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).m_171514_(33, 57)
/* 265 */         .m_171488_(-2.1875F, -9.9365F, -1.041F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(0, 30)
/* 266 */         .m_171488_(-2.4301F, -9.4192F, -0.547F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 267 */         PartPose.m_171423_(3.0F, 1.0F, 0.0F, -0.2839F, 0.3178F, 0.9685F));
/* 268 */     PartDefinition RightBlade_r9 = RightArm2.m_171599_("RightBlade_r9", 
/* 269 */         CubeListBuilder.m_171558_().m_171514_(50, 49).m_171488_(-0.2856F, -12.1186F, -4.067F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), 
/* 270 */         PartPose.m_171423_(-0.6875F, -12.6867F, 3.0756F, 0.829F, 0.0F, 0.0F));
/* 271 */     PartDefinition RightBlade_r10 = RightArm2.m_171599_("RightBlade_r10", 
/* 272 */         CubeListBuilder.m_171558_().m_171514_(39, 78).m_171488_(-0.5F, -4.0F, -1.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 273 */         PartPose.m_171423_(-0.4731F, -17.434F, -7.2991F, 0.5236F, 0.0F, 0.0F));
/* 274 */     PartDefinition RightBlade_r11 = RightArm2.m_171599_("RightBlade_r11", 
/* 275 */         CubeListBuilder.m_171558_().m_171514_(0, 60).m_171488_(-0.2856F, -9.1143F, -3.966F, 1.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 276 */         PartPose.m_171423_(-0.6875F, -11.5615F, 2.084F, 0.7854F, 0.0F, 0.0F));
/* 277 */     PartDefinition RightArm_r3 = RightArm2.m_171599_("RightArm_r3", 
/* 278 */         CubeListBuilder.m_171558_().m_171514_(26, 64).m_171488_(-0.2856F, -1.1143F, -4.966F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 279 */         PartPose.m_171423_(-1.1875F, -12.4365F, 0.959F, 0.7854F, 0.0F, 0.0F));
/* 280 */     PartDefinition LeftLeg = partdefinition.m_171599_("LeftLeg", CubeListBuilder.m_171558_(), PartPose.m_171419_(-2.19F, 10.0F, 0.0F));
/* 281 */     PartDefinition cube_r1 = LeftLeg.m_171599_("cube_r1", 
/* 282 */         CubeListBuilder.m_171558_().m_171514_(47, 0).m_171488_(-2.875F, 4.3732F, -4.2794F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
/* 283 */         .m_171514_(75, 38).m_171488_(-3.34F, 5.3732F, -6.2794F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(76, 0)
/* 284 */         .m_171488_(-0.28F, 5.3732F, -6.2794F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), 
/* 285 */         PartPose.m_171419_(0.0F, 6.6268F, 1.6794F));
/* 286 */     PartDefinition cube_r7_r1 = cube_r1.m_171599_("cube_r7_r1", 
/* 287 */         CubeListBuilder.m_171558_().m_171514_(63, 74).m_171488_(-4.5325F, -0.5F, -2.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 288 */         PartPose.m_171423_(2.6275F, 6.2482F, 0.7206F, 0.3054F, 0.0F, 0.0F));
/* 289 */     PartDefinition cube_r2 = LeftLeg.m_171599_("cube_r2", 
/* 290 */         CubeListBuilder.m_171558_().m_171514_(50, 32).m_171488_(-2.375F, 0.0F, -1.0F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)).m_171514_(0, 34)
/* 291 */         .m_171488_(-2.28F, -4.0F, 1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(55, 45).m_171488_(-2.28F, -2.0F, 1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), 
/*     */         
/* 293 */         PartPose.m_171423_(0.0F, 6.6268F, 2.2794F, -0.3927F, 0.0F, 0.0F));
/* 294 */     PartDefinition cube_r3 = LeftLeg.m_171599_("cube_r3", 
/* 295 */         CubeListBuilder.m_171558_().m_171514_(0, 50).m_171488_(-1.875F, -1.0F, -1.0F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 296 */         PartPose.m_171423_(0.0F, 4.5637F, -2.5296F, 0.7854F, 0.0F, 0.0F));
/* 297 */     PartDefinition cube_r4 = LeftLeg.m_171599_("cube_r4", CubeListBuilder.m_171558_(), 
/* 298 */         PartPose.m_171423_(0.0F, 1.2F, 0.2F, -0.3927F, 0.0F, 0.0F));
/* 299 */     PartDefinition cube_r5_r1 = cube_r4.m_171599_("cube_r5_r1", 
/* 300 */         CubeListBuilder.m_171558_().m_171514_(0, 74).m_171488_(-1.5F, -0.375F, -2.875F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), 
/* 301 */         PartPose.m_171423_(4.38F, 2.5F, 0.0F, 0.0F, 0.0F, -0.0873F));
/* 302 */     PartDefinition cube_r4_r1 = cube_r4.m_171599_("cube_r4_r1", 
/* 303 */         CubeListBuilder.m_171558_().m_171514_(16, 34).m_171488_(-2.0F, -3.5F, -2.625F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 304 */         PartPose.m_171423_(0.0F, 2.5F, 0.0F, 0.0F, 0.0F, 0.0873F));
/* 305 */     PartDefinition RightLeg = partdefinition.m_171599_("RightLeg", CubeListBuilder.m_171558_(), PartPose.m_171419_(2.22F, 10.0F, 0.0F));
/* 306 */     PartDefinition cube_r5 = RightLeg.m_171599_("cube_r5", 
/* 307 */         CubeListBuilder.m_171558_().m_171514_(46, 9).m_171488_(-1.25F, 4.3732F, -4.2794F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(68, 36)
/* 308 */         .m_171488_(-1.75F, 5.3732F, -6.2794F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(12, 34)
/* 309 */         .m_171488_(1.31F, 5.3732F, -6.2794F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), 
/* 310 */         PartPose.m_171419_(0.0F, 6.6268F, 1.6794F));
/* 311 */     PartDefinition cube_r6_r1 = cube_r5.m_171599_("cube_r6_r1", 
/* 312 */         CubeListBuilder.m_171558_().m_171514_(73, 74).m_171488_(1.5325F, -0.5F, -2.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 313 */         PartPose.m_171423_(-1.7825F, 6.2482F, 0.7206F, 0.3054F, 0.0F, 0.0F));
/* 314 */     PartDefinition cube_r6 = RightLeg.m_171599_("cube_r6", 
/* 315 */         CubeListBuilder.m_171558_().m_171514_(38, 47).m_171488_(-0.75F, 0.0F, -1.0F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)).m_171514_(41, 0)
/* 316 */         .m_171488_(1.25F, -4.0F, 1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(9, 50).m_171488_(0.25F, -2.0F, 1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), 
/*     */         
/* 318 */         PartPose.m_171423_(0.0F, 6.6268F, 2.2794F, -0.3927F, 0.0F, 0.0F));
/* 319 */     PartDefinition cube_r7 = RightLeg.m_171599_("cube_r7", 
/* 320 */         CubeListBuilder.m_171558_().m_171514_(15, 47).m_171488_(-1.25F, -1.0F, -1.0F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 321 */         PartPose.m_171423_(0.0F, 4.5637F, -2.5296F, 0.7854F, 0.0F, 0.0F));
/* 322 */     PartDefinition cube_r8 = RightLeg.m_171599_("cube_r8", CubeListBuilder.m_171558_(), 
/* 323 */         PartPose.m_171423_(0.0F, 1.2F, 0.2F, -0.3927F, 0.0F, 0.0F));
/* 324 */     PartDefinition cube_r6_r2 = cube_r8.m_171599_("cube_r6_r2", 
/* 325 */         CubeListBuilder.m_171558_().m_171514_(73, 56).m_171488_(-1.5F, -0.375F, -2.875F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), 
/* 326 */         PartPose.m_171423_(-4.41F, 2.5F, 0.0F, 0.0F, 0.0F, 0.0873F));
/* 327 */     PartDefinition cube_r8_r1 = cube_r8.m_171599_("cube_r8_r1", 
/* 328 */         CubeListBuilder.m_171558_().m_171514_(0, 34).m_171488_(-2.0F, -3.5F, -2.625F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 329 */         PartPose.m_171423_(0.0F, 2.5F, 0.0F, 0.0F, 0.0F, -0.0873F));
/* 330 */     PartDefinition LeftArm3 = partdefinition.m_171599_("LeftArm3", 
/* 331 */         CubeListBuilder.m_171558_().m_171514_(58, 38).m_171488_(-0.8125F, -9.9365F, -1.041F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
/* 332 */         .m_171514_(47, 56).m_171488_(-0.9375F, -7.6865F, 0.459F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).m_171514_(73, 6)
/* 333 */         .m_171488_(-0.4375F, -2.8115F, -0.541F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).m_171514_(28, 7)
/* 334 */         .m_171488_(-0.5699F, -9.4192F, -0.547F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 335 */         PartPose.m_171423_(-3.0F, 4.0F, 0.0F, -0.4611F, -0.3971F, -2.0917F));
/* 336 */     PartDefinition RightBlade_r12 = LeftArm3.m_171599_("RightBlade_r12", 
/* 337 */         CubeListBuilder.m_171558_().m_171514_(78, 45).m_171488_(-0.5F, -1.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), 
/* 338 */         PartPose.m_171423_(0.4425F, -17.7731F, -7.1356F, 0.829F, 0.0F, 0.0F));
/* 339 */     PartDefinition RightBlade_r13 = LeftArm3.m_171599_("RightBlade_r13", 
/* 340 */         CubeListBuilder.m_171558_().m_171514_(61, 78).m_171488_(-0.5F, -4.0F, -1.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 341 */         PartPose.m_171423_(0.4425F, -17.2699F, -7.2407F, 0.5236F, 0.0F, 0.0F));
/* 342 */     PartDefinition RightBlade_r14 = LeftArm3.m_171599_("RightBlade_r14", 
/* 343 */         CubeListBuilder.m_171558_().m_171514_(38, 64).m_171488_(-0.7449F, -8.957F, -4.0407F, 1.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 344 */         PartPose.m_171423_(0.6875F, -11.5615F, 2.084F, 0.7854F, 0.0F, 0.0F));
/* 345 */     PartDefinition RightArm_r4 = LeftArm3.m_171599_("RightArm_r4", 
/* 346 */         CubeListBuilder.m_171558_().m_171514_(46, 65).m_171488_(-1.7449F, -0.957F, -5.0407F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 347 */         PartPose.m_171423_(1.1875F, -12.4365F, 0.959F, 0.7854F, 0.0F, 0.0F));
/* 348 */     PartDefinition RightArm3 = partdefinition.m_171599_("RightArm3", 
/* 349 */         CubeListBuilder.m_171558_().m_171514_(18, 57).m_171488_(-2.0625F, -7.6865F, 0.459F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
/* 350 */         .m_171514_(43, 73).m_171488_(-1.5625F, -2.8115F, -0.541F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).m_171514_(33, 57)
/* 351 */         .m_171488_(-2.1875F, -9.9365F, -1.041F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(0, 30)
/* 352 */         .m_171488_(-2.4301F, -9.4192F, -0.547F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 353 */         PartPose.m_171423_(3.0F, 4.0F, 0.0F, -0.4611F, 0.3971F, 2.0917F));
/* 354 */     PartDefinition RightBlade_r15 = RightArm3.m_171599_("RightBlade_r15", 
/* 355 */         CubeListBuilder.m_171558_().m_171514_(50, 49).m_171488_(-0.2856F, -12.1186F, -4.067F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), 
/* 356 */         PartPose.m_171423_(-0.6875F, -12.6867F, 3.0756F, 0.829F, 0.0F, 0.0F));
/* 357 */     PartDefinition RightBlade_r16 = RightArm3.m_171599_("RightBlade_r16", 
/* 358 */         CubeListBuilder.m_171558_().m_171514_(39, 78).m_171488_(-0.5F, -4.0F, -1.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 359 */         PartPose.m_171423_(-0.4731F, -17.434F, -7.2991F, 0.5236F, 0.0F, 0.0F));
/* 360 */     PartDefinition RightBlade_r17 = RightArm3.m_171599_("RightBlade_r17", 
/* 361 */         CubeListBuilder.m_171558_().m_171514_(0, 60).m_171488_(-0.2856F, -9.1143F, -3.966F, 1.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 362 */         PartPose.m_171423_(-0.6875F, -11.5615F, 2.084F, 0.7854F, 0.0F, 0.0F));
/* 363 */     PartDefinition RightArm_r5 = RightArm3.m_171599_("RightArm_r5", 
/* 364 */         CubeListBuilder.m_171558_().m_171514_(26, 64).m_171488_(-0.2856F, -1.1143F, -4.966F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 365 */         PartPose.m_171423_(-1.1875F, -12.4365F, 0.959F, 0.7854F, 0.0F, 0.0F));
/* 366 */     return LayerDefinition.m_171565_(meshdefinition, 96, 96);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void m_7695_(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 372 */     this.Head.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 373 */     this.Body.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 374 */     this.LeftArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 375 */     this.LeftArm2.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 376 */     this.RightArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 377 */     this.RightArm2.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 378 */     this.LeftLeg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 379 */     this.RightLeg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 380 */     this.LeftArm3.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 381 */     this.RightArm3.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */   
/*     */   public void m_6973_(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
/* 385 */     this.RightArm2.f_104203_ = Mth.m_14089_(limbSwing * 0.6662F + 3.1415927F) * limbSwingAmount;
/* 386 */     this.LeftArm3.f_104203_ = Mth.m_14089_(limbSwing * 0.6662F) * limbSwingAmount;
/* 387 */     this.RightArm.f_104203_ = Mth.m_14089_(limbSwing * 0.6662F + 3.1415927F) * limbSwingAmount;
/* 388 */     this.LeftLeg.f_104203_ = Mth.m_14089_(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
/* 389 */     this.RightArm3.f_104203_ = Mth.m_14089_(limbSwing * 0.6662F + 3.1415927F) * limbSwingAmount;
/* 390 */     this.Head.f_104204_ = netHeadYaw / 57.295776F;
/* 391 */     this.Head.f_104203_ = headPitch / 57.295776F;
/* 392 */     this.LeftArm.f_104203_ = Mth.m_14089_(limbSwing * 0.6662F) * limbSwingAmount;
/* 393 */     this.LeftArm2.f_104203_ = Mth.m_14089_(limbSwing * 0.6662F) * limbSwingAmount;
/* 394 */     this.RightLeg.f_104203_ = Mth.m_14089_(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\client\model\Modeltsc_berserk_model.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */