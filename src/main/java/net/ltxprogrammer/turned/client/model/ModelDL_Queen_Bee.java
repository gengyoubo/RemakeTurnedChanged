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
/*     */ public class ModelDL_Queen_Bee<T extends Entity>
/*     */   extends EntityModel<T>
/*     */ {
/*  25 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("turned", "model_dl_queen_bee"), "main");
/*     */   public final ModelPart Head;
/*     */   public final ModelPart LeftLeg;
/*     */   public final ModelPart RightLeg;
/*     */   public final ModelPart LeftArm;
/*     */   public final ModelPart RightArm;
/*     */   public final ModelPart Tail;
/*     */   public final ModelPart Wings;
/*     */   public final ModelPart Body;
/*     */   
/*     */   public ModelDL_Queen_Bee(ModelPart root) {
/*  36 */     this.Head = root.m_171324_("Head");
/*  37 */     this.LeftLeg = root.m_171324_("LeftLeg");
/*  38 */     this.RightLeg = root.m_171324_("RightLeg");
/*  39 */     this.LeftArm = root.m_171324_("LeftArm");
/*  40 */     this.RightArm = root.m_171324_("RightArm");
/*  41 */     this.Tail = root.m_171324_("Tail");
/*  42 */     this.Wings = root.m_171324_("Wings");
/*  43 */     this.Body = root.m_171324_("Body");
/*     */   }
/*     */   
/*     */   public static LayerDefinition createBodyLayer() {
/*  47 */     MeshDefinition meshdefinition = new MeshDefinition();
/*  48 */     PartDefinition partdefinition = meshdefinition.m_171576_();
/*  49 */     PartDefinition Head = partdefinition.m_171599_("Head", 
/*  50 */         CubeListBuilder.m_171558_().m_171514_(28, 28).m_171488_(-4.0F, -7.0F, -4.0F, 8.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)), 
/*  51 */         PartPose.m_171423_(0.0F, -10.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));
/*  52 */     PartDefinition cube_r1 = Head.m_171599_("cube_r1", 
/*  53 */         CubeListBuilder.m_171558_().m_171514_(0, 0).m_171488_(-3.5F, -20.7F, -6.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(4, 5)
/*  54 */         .m_171488_(-9.5F, -20.7F, -6.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), 
/*  55 */         PartPose.m_171423_(6.0F, -4.4965F, -13.7044F, -1.5708F, 0.0F, 0.0F));
/*  56 */     PartDefinition cube_r2 = Head.m_171599_("cube_r2", 
/*  57 */         CubeListBuilder.m_171558_().m_171514_(31, 0).m_171488_(-3.5F, -19.7F, -6.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(58, 0)
/*  58 */         .m_171488_(-9.5F, -19.7F, -6.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), 
/*  59 */         PartPose.m_171423_(6.0F, 10.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/*  60 */     PartDefinition Mask = Head.m_171599_("Mask", 
/*  61 */         CubeListBuilder.m_171558_().m_171514_(28, 25).m_171488_(-3.0F, -12.0F, 4.5F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(28, 26)
/*  62 */         .m_171488_(3.0F, -13.0F, 4.5F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(48, 27)
/*  63 */         .m_171488_(4.0F, -14.0F, 4.5F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(28, 24)
/*  64 */         .m_171488_(-6.0F, -15.0F, 4.5F, 12.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(0, 12)
/*  65 */         .m_171488_(-3.0F, -16.0F, 4.5F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(14, 34)
/*  66 */         .m_171488_(-2.0F, -17.0F, 4.5F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(2, 49)
/*  67 */         .m_171488_(-5.0F, -14.0F, 4.5F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(10, 9)
/*  68 */         .m_171488_(-4.0F, -13.0F, 4.5F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(17, 49)
/*  69 */         .m_171488_(-1.0F, -14.0F, 4.5F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), 
/*  70 */         PartPose.m_171419_(0.0F, 10.0F, 0.0F));
/*  71 */     PartDefinition LeftLeg = partdefinition.m_171599_("LeftLeg", CubeListBuilder.m_171558_(), 
/*  72 */         PartPose.m_171423_(2.0F, 5.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));
/*  73 */     PartDefinition cube_r3 = LeftLeg.m_171599_("cube_r3", 
/*  74 */         CubeListBuilder.m_171558_().m_171514_(44, 8).m_171488_(-3.5F, -3.25F, -0.5F, 6.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(32, 65)
/*  75 */         .m_171488_(-3.0F, -6.25F, 0.0F, 5.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  76 */         PartPose.m_171423_(0.0F, 9.6932F, -2.6685F, -0.829F, 0.0F, 0.0F));
/*  77 */     PartDefinition cube_r4 = LeftLeg.m_171599_("cube_r4", 
/*  78 */         CubeListBuilder.m_171558_().m_171514_(14, 60).m_171488_(-3.0F, -6.25F, 0.0F, 5.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  79 */         PartPose.m_171423_(0.0F, 7.0F, 0.0F, 0.3054F, 0.0F, 0.0F));
/*  80 */     PartDefinition cube_r5 = LeftLeg.m_171599_("cube_r5", 
/*  81 */         CubeListBuilder.m_171558_().m_171514_(27, 34).m_171488_(-1.0F, 11.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(31, 34)
/*  82 */         .m_171488_(-2.5F, 11.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(4, 35)
/*  83 */         .m_171488_(0.5F, 11.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(72, 51).m_171488_(-2.5F, 6.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), 
/*     */         
/*  85 */         PartPose.m_171423_(0.0F, 9.0052F, 4.2588F, -1.1781F, 0.0F, 0.0F));
/*  86 */     PartDefinition RightLeg = partdefinition.m_171599_("RightLeg", CubeListBuilder.m_171558_(), 
/*  87 */         PartPose.m_171423_(-2.0F, 5.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));
/*  88 */     PartDefinition cube_r6 = RightLeg.m_171599_("cube_r6", 
/*  89 */         CubeListBuilder.m_171558_().m_171514_(61, 3).m_171488_(-2.5F, -3.25F, -0.5F, 6.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(66, 11)
/*  90 */         .m_171488_(-2.0F, -6.25F, 0.0F, 5.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  91 */         PartPose.m_171423_(0.0F, 9.6932F, -2.6685F, -0.829F, 0.0F, 0.0F));
/*  92 */     PartDefinition cube_r7 = RightLeg.m_171599_("cube_r7", 
/*  93 */         CubeListBuilder.m_171558_().m_171514_(60, 60).m_171488_(-2.0F, -6.25F, 0.0F, 5.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  94 */         PartPose.m_171423_(0.0F, 7.0F, 0.0F, 0.3054F, 0.0F, 0.0F));
/*  95 */     PartDefinition cube_r8 = RightLeg.m_171599_("cube_r8", 
/*  96 */         CubeListBuilder.m_171558_().m_171514_(17, 47).m_171488_(0.0F, 11.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(26, 47)
/*  97 */         .m_171488_(1.5F, 11.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(47, 25)
/*  98 */         .m_171488_(-1.5F, 11.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(10, 73).m_171488_(-1.5F, 6.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), 
/*     */         
/* 100 */         PartPose.m_171423_(0.0F, 9.0052F, 4.2588F, -1.1781F, 0.0F, 0.0F));
/* 101 */     PartDefinition LeftArm = partdefinition.m_171599_("LeftArm", 
/* 102 */         CubeListBuilder.m_171558_().m_171514_(46, 51).m_171488_(-4.0F, 2.0F, -2.0F, 3.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(24, 35)
/* 103 */         .m_171488_(-4.0F, 16.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(20, 35)
/* 104 */         .m_171488_(-4.0F, 16.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(16, 35)
/* 105 */         .m_171488_(-4.0F, 16.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(63, 73)
/* 106 */         .m_171488_(-5.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(67, 31)
/* 107 */         .m_171488_(-4.5F, -2.5F, -2.5F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(65, 22).m_171488_(-4.5F, 11.0F, -2.5F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), 
/*     */         
/* 109 */         PartPose.m_171423_(5.0F, -7.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));
/* 110 */     PartDefinition RightArm = partdefinition.m_171599_("RightArm", 
/* 111 */         CubeListBuilder.m_171558_().m_171514_(0, 58).m_171488_(1.0F, 2.0F, -2.0F, 3.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(44, 26)
/* 112 */         .m_171488_(3.0F, 16.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(41, 25)
/* 113 */         .m_171488_(3.0F, 16.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(7, 36)
/* 114 */         .m_171488_(3.0F, 16.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(78, 0)
/* 115 */         .m_171488_(1.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(68, 40)
/* 116 */         .m_171488_(0.5F, -2.5F, -2.5F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(45, 71).m_171488_(0.5F, 11.0F, -2.5F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), 
/*     */         
/* 118 */         PartPose.m_171423_(-5.0F, -7.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));
/* 119 */     PartDefinition Tail = partdefinition.m_171599_("Tail", CubeListBuilder.m_171558_(), 
/* 120 */         PartPose.m_171423_(0.0F, 2.0F, 1.0F, -3.1416F, 0.0F, 3.1416F));
/* 121 */     PartDefinition cube_r9 = Tail.m_171599_("cube_r9", 
/* 122 */         CubeListBuilder.m_171558_().m_171514_(78, 60).m_171488_(-2.0F, 0.0F, -4.5F, 5.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(0, 0)
/* 123 */         .m_171488_(-4.0F, -2.0F, -17.5F, 9.0F, 9.0F, 13.0F, new CubeDeformation(0.0F)), 
/* 124 */         PartPose.m_171423_(-0.5F, -3.0F, 1.0F, 0.3927F, 0.0F, 0.0F));
/* 125 */     PartDefinition cube_r10 = Tail.m_171599_("cube_r10", 
/* 126 */         CubeListBuilder.m_171558_().m_171514_(10, 34).m_171488_(0.0F, -9.0F, -18.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), 
/* 127 */         PartPose.m_171423_(-0.5F, -9.247F, -7.3241F, 1.5708F, 0.0F, 0.0F));
/* 128 */     PartDefinition cube_r11 = Tail.m_171599_("cube_r11", 
/* 129 */         CubeListBuilder.m_171558_().m_171514_(28, 26).m_171488_(0.0F, -5.0F, -19.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 130 */         PartPose.m_171423_(-0.5F, -3.0F, 1.0F, 0.7854F, 0.0F, 0.0F));
/* 131 */     PartDefinition Wings = partdefinition.m_171599_("Wings", CubeListBuilder.m_171558_(), 
/* 132 */         PartPose.m_171423_(0.0F, -3.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));
/* 133 */     PartDefinition LeftWings = Wings.m_171599_("LeftWings", 
/* 134 */         CubeListBuilder.m_171558_().m_171514_(30, 47).m_171488_(0.159F, -6.6563F, 1.8484F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(0, 47)
/* 135 */         .m_171488_(-0.841F, -8.6563F, 1.8484F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(2, 76)
/* 136 */         .m_171488_(-1.841F, -9.6563F, 1.8484F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(4, 34)
/* 137 */         .m_171488_(-4.841F, -10.6563F, 1.8484F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(62, 42)
/* 138 */         .m_171488_(-2.841F, -9.6563F, 1.8484F, 1.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(47, 11)
/* 139 */         .m_171488_(-0.841F, -9.6563F, 1.8484F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(33, 27)
/* 140 */         .m_171488_(-8.841F, -9.6563F, 1.8484F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(22, 47)
/* 141 */         .m_171488_(-4.841F, -9.6563F, 1.8484F, 2.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(52, 24)
/* 142 */         .m_171488_(-7.841F, -8.6563F, 1.8484F, 2.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(62, 55)
/* 143 */         .m_171488_(-5.841F, -8.6563F, 1.8484F, 1.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(32, 60)
/* 144 */         .m_171488_(-8.841F, -8.6563F, 1.8484F, 1.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(45, 12)
/* 145 */         .m_171488_(-10.841F, -8.6563F, 1.8484F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(56, 24)
/* 146 */         .m_171488_(-10.841F, -7.6563F, 1.8484F, 2.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(47, 8)
/* 147 */         .m_171488_(-11.841F, -7.6563F, 1.8484F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(6, 76)
/* 148 */         .m_171488_(-12.841F, -5.6563F, 1.8484F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(4, 76)
/* 149 */         .m_171488_(-11.841F, -5.6563F, 1.8484F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(33, 26)
/* 150 */         .m_171488_(-11.841F, 0.3438F, 1.8484F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(44, 25)
/* 151 */         .m_171488_(-7.841F, -0.6563F, 1.8484F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(22, 34)
/* 152 */         .m_171488_(-5.841F, -1.6563F, 1.8484F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(47, 10)
/* 153 */         .m_171488_(-2.841F, -2.6563F, 1.8484F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(20, 47)
/* 154 */         .m_171488_(-1.841F, -3.6563F, 1.8484F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(41, 27).m_171488_(-0.841F, -4.6563F, 1.8484F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), 
/*     */         
/* 156 */         PartPose.m_171419_(-6.159F, 2.6563F, -6.0984F));
/* 157 */     PartDefinition cube_r12 = LeftWings.m_171599_("cube_r12", 
/* 158 */         CubeListBuilder.m_171558_().m_171514_(60, 55).m_171488_(-0.9688F, -3.6563F, 0.0F, 1.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(43, 8)
/* 159 */         .m_171488_(-3.9688F, -0.6563F, 0.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(23, 37)
/* 160 */         .m_171488_(0.0312F, 2.3438F, 0.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(31, 11)
/* 161 */         .m_171488_(-3.9688F, 3.3438F, 0.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(4, 37)
/* 162 */         .m_171488_(3.0312F, 0.3438F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(40, 25)
/* 163 */         .m_171488_(2.0312F, 1.3438F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(2, 7)
/* 164 */         .m_171488_(-4.9688F, -0.6563F, 0.0F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(36, 22)
/* 165 */         .m_171488_(-3.9688F, -2.6563F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(30, 73)
/* 166 */         .m_171488_(-2.9688F, -2.6563F, 0.0F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(0, 76)
/* 167 */         .m_171488_(-1.9688F, -2.6563F, 0.0F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(60, 36)
/* 168 */         .m_171488_(0.0312F, -3.6563F, 0.0F, 2.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(41, 12)
/* 169 */         .m_171488_(-2.9688F, -3.6563F, 0.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(39, 8)
/* 170 */         .m_171488_(2.0312F, -3.6563F, 0.0F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(31, 12)
/* 171 */         .m_171488_(-0.9688F, -4.6563F, 0.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(45, 8)
/* 172 */         .m_171488_(3.0312F, -3.6563F, 0.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(2, 47).m_171488_(4.0312F, -1.6563F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), 
/*     */         
/* 174 */         PartPose.m_171423_(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));
/* 175 */     PartDefinition RightWings = Wings.m_171599_("RightWings", 
/* 176 */         CubeListBuilder.m_171558_().m_171514_(0, 34).m_171488_(-2.5476F, -4.619F, 0.0F, 2.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(31, 6)
/* 177 */         .m_171488_(-2.5476F, 3.381F, 0.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(15, 37)
/* 178 */         .m_171488_(0.4524F, 4.381F, 0.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(4, 22)
/* 179 */         .m_171488_(0.4524F, -3.619F, 0.0F, 2.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(34, 60)
/* 180 */         .m_171488_(-0.5476F, -3.619F, 0.0F, 1.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(10, 0)
/* 181 */         .m_171488_(2.4524F, -3.619F, 0.0F, 1.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(31, 8)
/* 182 */         .m_171488_(2.4524F, 5.381F, 0.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(64, 36)
/* 183 */         .m_171488_(5.4524F, -0.619F, 0.0F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(58, 69)
/* 184 */         .m_171488_(6.4524F, -0.619F, 0.0F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(31, 0)
/* 185 */         .m_171488_(5.4524F, -2.619F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(0, 22)
/* 186 */         .m_171488_(3.4524F, -2.619F, 0.0F, 2.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(19, 37)
/* 187 */         .m_171488_(3.4524F, -3.619F, 0.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(31, 9)
/* 188 */         .m_171488_(-0.5476F, -4.619F, 0.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(31, 10)
/* 189 */         .m_171488_(-4.5476F, -5.619F, 0.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(60, 42)
/* 190 */         .m_171488_(-3.5476F, -4.619F, 0.0F, 1.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(23, 35)
/* 191 */         .m_171488_(-5.5476F, -4.619F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(28, 73)
/* 192 */         .m_171488_(-4.5476F, -4.619F, 0.0F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(34, 42)
/* 193 */         .m_171488_(-5.5476F, -3.619F, 0.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(35, 0)
/* 194 */         .m_171488_(-6.5476F, -1.619F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(34, 34)
/* 195 */         .m_171488_(-5.5476F, 0.381F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(14, 35)
/* 196 */         .m_171488_(-4.5476F, 1.381F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(19, 35)
/* 197 */         .m_171488_(-3.5476F, 2.381F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), 
/* 198 */         PartPose.m_171419_(11.5476F, -2.381F, -4.25F));
/* 199 */     PartDefinition cube_r13 = RightWings.m_171599_("cube_r13", 
/* 200 */         CubeListBuilder.m_171558_().m_171514_(28, 23).m_171488_(-3.2667F, -4.6F, 0.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(11, 37)
/* 201 */         .m_171488_(0.7333F, -3.6F, 0.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(0, 0)
/* 202 */         .m_171488_(2.7333F, -2.6F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(7, 35)
/* 203 */         .m_171488_(-2.2667F, 2.4F, 0.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(30, 34)
/* 204 */         .m_171488_(-3.2667F, 1.4F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(4, 0)
/* 205 */         .m_171488_(-5.2667F, -1.6F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(0, 7)
/* 206 */         .m_171488_(-3.2667F, -3.6F, 0.0F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(32, 42)
/* 207 */         .m_171488_(-4.2667F, -3.6F, 0.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(14, 58)
/* 208 */         .m_171488_(-2.2667F, -3.6F, 0.0F, 2.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(8, 0)
/* 209 */         .m_171488_(-0.2667F, -3.6F, 0.0F, 1.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(64, 16)
/* 210 */         .m_171488_(0.7333F, -2.6F, 0.0F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(28, 22)
/* 211 */         .m_171488_(-0.2667F, 3.4F, 0.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(41, 8)
/* 212 */         .m_171488_(2.7333F, -0.6F, 0.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(6, 0)
/* 213 */         .m_171488_(3.7333F, -0.6F, 0.0F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(64, 0).m_171488_(1.7333F, -2.6F, 0.0F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), 
/*     */         
/* 215 */         PartPose.m_171423_(-5.2221F, 4.981F, -2.0148F, 0.0F, 0.7854F, 0.0F));
/* 216 */     PartDefinition cube_r14 = RightWings.m_171599_("cube_r14", 
/* 217 */         CubeListBuilder.m_171558_().m_171514_(33, 28).m_171488_(11.0F, -3.0F, 0.75F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), 
/* 218 */         PartPose.m_171423_(-16.5476F, 8.381F, 8.25F, 0.0F, 0.7854F, 0.0F));
/* 219 */     PartDefinition Body = partdefinition.m_171599_("Body", 
/* 220 */         CubeListBuilder.m_171558_().m_171514_(0, 38).m_171488_(-6.0F, 1.0F, -2.0F, 12.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(0, 22)
/* 221 */         .m_171488_(-5.0F, -1.0F, -4.0F, 10.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).m_171514_(31, 0)
/* 222 */         .m_171488_(-5.0F, 3.0F, -3.25F, 10.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).m_171514_(56, 43)
/* 223 */         .m_171488_(-7.0F, 0.0F, -4.0F, 2.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).m_171514_(19, 75)
/* 224 */         .m_171488_(-6.0F, 4.0F, -3.25F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).m_171514_(52, 24)
/* 225 */         .m_171488_(5.0F, 0.0F, -4.0F, 2.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).m_171514_(72, 74)
/* 226 */         .m_171488_(5.0F, 4.0F, -3.25F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).m_171514_(38, 16)
/* 227 */         .m_171488_(-5.0F, 3.25F, -3.0F, 10.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(22, 51)
/* 228 */         .m_171488_(-4.0F, 6.0F, -2.0F, 8.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(32, 42)
/* 229 */         .m_171488_(-5.0F, 11.0F, -2.0F, 10.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(0, 47).m_171488_(-3.0F, 9.0F, -2.5F, 6.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), 
/*     */         
/* 231 */         PartPose.m_171423_(0.0F, -10.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));
/* 232 */     return LayerDefinition.m_171565_(meshdefinition, 128, 128);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void m_7695_(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 238 */     this.Head.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 239 */     this.LeftLeg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 240 */     this.RightLeg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 241 */     this.LeftArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 242 */     this.RightArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 243 */     this.Tail.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 244 */     this.Wings.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 245 */     this.Body.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */   
/*     */   public void m_6973_(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
/* 249 */     this.LeftLeg.f_104203_ = Mth.m_14089_(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
/* 250 */     this.RightArm.f_104203_ = Mth.m_14089_(limbSwing * 0.6662F + 3.1415927F) * limbSwingAmount;
/* 251 */     this.Head.f_104204_ = netHeadYaw / 57.295776F;
/* 252 */     this.Head.f_104203_ = headPitch / 57.295776F;
/* 253 */     this.RightLeg.f_104203_ = Mth.m_14089_(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
/* 254 */     this.LeftArm.f_104203_ = Mth.m_14089_(limbSwing * 0.6662F) * limbSwingAmount;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\client\model\ModelDL_Queen_Bee.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */