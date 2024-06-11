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
/*     */ public class ModelMilitary_Drone_Hertx<T extends Entity>
/*     */   extends EntityModel<T>
/*     */ {
/*  25 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("turned", "model_military_drone_hertx"), "main");
/*     */   
/*     */   public final ModelPart Head;
/*     */   public final ModelPart Body;
/*     */   public final ModelPart Tail;
/*     */   public final ModelPart LeftArm;
/*     */   public final ModelPart RightArm;
/*     */   public final ModelPart LeftLeg;
/*     */   public final ModelPart RightLeg;
/*     */   
/*     */   public ModelMilitary_Drone_Hertx(ModelPart root) {
/*  36 */     this.Head = root.m_171324_("Head");
/*  37 */     this.Body = root.m_171324_("Body");
/*  38 */     this.Tail = root.m_171324_("Tail");
/*  39 */     this.LeftArm = root.m_171324_("LeftArm");
/*  40 */     this.RightArm = root.m_171324_("RightArm");
/*  41 */     this.LeftLeg = root.m_171324_("LeftLeg");
/*  42 */     this.RightLeg = root.m_171324_("RightLeg");
/*     */   }
/*     */   
/*     */   public static LayerDefinition createBodyLayer() {
/*  46 */     MeshDefinition meshdefinition = new MeshDefinition();
/*  47 */     PartDefinition partdefinition = meshdefinition.m_171576_();
/*  48 */     PartDefinition Head = partdefinition.m_171599_("Head", 
/*  49 */         CubeListBuilder.m_171558_().m_171514_(30, 25).m_171488_(-3.0F, -1.3F, -4.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(51, 53)
/*  50 */         .m_171488_(-2.0F, -2.4F, -3.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(16, 42)
/*  51 */         .m_171488_(-2.0F, -6.4F, 2.0F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(33, 7)
/*  52 */         .m_171488_(-1.5F, -6.775F, -3.75F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).m_171514_(30, 7)
/*  53 */         .m_171488_(-2.0F, -2.4F, 3.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 11)
/*  54 */         .m_171488_(-3.0F, -2.4F, 2.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(10, 36)
/*  55 */         .m_171488_(-3.0F, -0.275F, -2.275F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(26, 12)
/*  56 */         .m_171488_(-1.0F, -0.15F, -2.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 44)
/*  57 */         .m_171488_(2.0F, -6.4F, 2.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(10, 34)
/*  58 */         .m_171488_(-3.0F, -6.4F, 2.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(30, 0)
/*  59 */         .m_171488_(-3.0F, -6.3F, -4.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(8, 58)
/*  60 */         .m_171488_(2.0F, -5.3F, -4.0F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(0, 63)
/*  61 */         .m_171488_(2.0F, -2.3F, -4.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(56, 42)
/*  62 */         .m_171488_(-3.0F, -5.3F, -4.0F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(63, 53)
/*  63 */         .m_171488_(-3.0F, -2.3F, -4.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(16, 6)
/*  64 */         .m_171488_(-2.0F, -5.3F, -4.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(16, 12)
/*  65 */         .m_171488_(-2.0F, -2.3F, -4.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(40, 40)
/*  66 */         .m_171488_(-1.0F, -2.8F, -4.875F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  67 */         PartPose.m_171419_(0.0F, -2.0F, -0.2F));
/*  68 */     PartDefinition cube_r1 = Head.m_171599_("cube_r1", 
/*  69 */         CubeListBuilder.m_171558_().m_171514_(35, 15).m_171488_(-1.0F, -4.3F, -6.7F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), 
/*  70 */         PartPose.m_171423_(0.0F, 1.75F, 1.825F, 0.0F, 0.48F, 0.0F));
/*  71 */     PartDefinition cube_r2 = Head.m_171599_("cube_r2", 
/*  72 */         CubeListBuilder.m_171558_().m_171514_(27, 36).m_171488_(-1.0F, -4.3F, -6.7F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), 
/*  73 */         PartPose.m_171423_(0.0F, 1.75F, 1.825F, 0.0F, -0.48F, 0.0F));
/*  74 */     PartDefinition Antenna = Head.m_171599_("Antenna", CubeListBuilder.m_171558_(), PartPose.m_171419_(0.0F, -6.1528F, 3.0874F));
/*  75 */     PartDefinition cube_r3 = Antenna.m_171599_("cube_r3", 
/*  76 */         CubeListBuilder.m_171558_().m_171514_(60, 0).m_171488_(0.0F, -2.75F, -1.25F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(22, 59)
/*  77 */         .m_171488_(-6.5F, -2.75F, -1.25F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(16, 0)
/*  78 */         .m_171488_(-6.5F, -3.75F, -5.25F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(16, 58).m_171488_(0.0F, -3.75F, -5.25F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), 
/*     */         
/*  80 */         PartPose.m_171423_(2.75F, 0.3511F, 2.7389F, 1.3526F, 0.0F, 0.0F));
/*  81 */     PartDefinition Body = partdefinition.m_171599_("Body", 
/*  82 */         CubeListBuilder.m_171558_().m_171514_(15, 15).m_171488_(-4.0F, 0.2F, -2.0F, 8.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(0, 28)
/*  83 */         .m_171488_(-4.0F, 10.2F, -2.0F, 8.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(35, 32)
/*  84 */         .m_171488_(-3.625F, 6.2F, -2.0F, 7.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  85 */         PartPose.m_171419_(0.0F, -2.0F, 0.0F));
/*  86 */     PartDefinition Tail = partdefinition.m_171599_("Tail", CubeListBuilder.m_171558_(), PartPose.m_171419_(0.0F, 10.0F, 0.0F));
/*  87 */     PartDefinition cube_r4 = Tail.m_171599_("cube_r4", 
/*  88 */         CubeListBuilder.m_171558_().m_171514_(0, 21).m_171488_(-1.25F, 10.3026F, 24.6391F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 16)
/*  89 */         .m_171488_(-0.25F, 10.8026F, 25.6391F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(10, 1)
/*  90 */         .m_171488_(1.75F, 10.8026F, 25.6391F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(16, 0)
/*  91 */         .m_171488_(-0.25F, 12.8026F, 25.6391F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(16, 1)
/*  92 */         .m_171488_(1.75F, 12.8026F, 25.6391F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(17, 25)
/*  93 */         .m_171488_(-0.25F, 11.3026F, 15.6391F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), 
/*  94 */         PartPose.m_171423_(-0.75F, -10.3628F, -1.0141F, -0.3927F, 0.0F, 0.0F));
/*  95 */     PartDefinition cube_r5 = Tail.m_171599_("cube_r5", 
/*  96 */         CubeListBuilder.m_171558_().m_171514_(0, 15).m_171488_(-0.25F, 4.2F, 7.0F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), 
/*  97 */         PartPose.m_171423_(-0.75F, -9.2F, 0.0F, -0.7854F, 0.0F, 0.0F));
/*  98 */     PartDefinition LeftArm = partdefinition.m_171599_("LeftArm", 
/*  99 */         CubeListBuilder.m_171558_().m_171514_(54, 21).m_171488_(-2.0F, -1.8F, -2.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(64, 7)
/* 100 */         .m_171488_(-0.375F, -2.8F, -1.875F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(39, 15)
/* 101 */         .m_171488_(-3.0F, 5.2F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(46, 10)
/* 102 */         .m_171488_(-3.0F, 11.2F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(26, 42)
/* 103 */         .m_171488_(-3.0F, 11.2F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(36, 12)
/* 104 */         .m_171488_(-1.0F, 11.2F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(10, 39).m_171488_(-3.0F, 11.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*     */         
/* 106 */         PartPose.m_171423_(-5.0F, 1.0F, 0.125F, -1.5704F, -0.1308F, 0.0379F));
/* 107 */     PartDefinition M16 = LeftArm.m_171599_("M16", CubeListBuilder.m_171558_(), 
/* 108 */         PartPose.m_171423_(-0.4987F, 9.9293F, -2.0497F, 1.5708F, 0.0F, 0.0873F));
/* 109 */     PartDefinition Grip = M16.m_171599_("Grip", 
/* 110 */         CubeListBuilder.m_171558_().m_171514_(32, 50).m_171488_(-0.5209F, -0.0875F, 1.2465F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), 
/* 111 */         PartPose.m_171419_(0.0F, 0.0F, 0.0F));
/* 112 */     PartDefinition cube_r6 = Grip.m_171599_("cube_r6", 
/* 113 */         CubeListBuilder.m_171558_().m_171514_(0, 0).m_171488_(-0.5934F, 2.0486F, 1.6886F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 114 */         PartPose.m_171423_(0.1225F, -0.4268F, -0.7684F, 0.3927F, 0.0F, 0.0F));
/* 115 */     PartDefinition cube_r7 = Grip.m_171599_("cube_r7", 
/* 116 */         CubeListBuilder.m_171558_().m_171514_(48, 25).m_171488_(-0.4934F, 2.0486F, 0.5386F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), 
/* 117 */         PartPose.m_171423_(0.1225F, -0.7768F, 0.1316F, 0.3927F, 0.0F, 0.0F));
/* 118 */     PartDefinition Mag = M16.m_171599_("Mag", 
/* 119 */         CubeListBuilder.m_171558_().m_171514_(30, 25).m_171488_(-0.4934F, 1.9643F, -3.2225F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), 
/* 120 */         PartPose.m_171419_(0.1225F, -1.7768F, 0.0066F));
/* 121 */     PartDefinition cube_r8 = Mag.m_171599_("cube_r8", 
/* 122 */         CubeListBuilder.m_171558_().m_171514_(48, 0).m_171488_(-0.4934F, 4.6897F, -0.8395F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), 
/* 123 */         PartPose.m_171423_(0.0F, 0.1875F, -0.5F, -0.3927F, 0.0F, 0.0F));
/* 124 */     PartDefinition Receiver = M16.m_171599_("Receiver", 
/* 125 */         CubeListBuilder.m_171558_().m_171514_(10, 0).m_171488_(-0.7434F, -0.2232F, -4.6225F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
/* 126 */         .m_171514_(0, 15).m_171488_(-0.7434F, -0.2232F, -0.6225F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(0, 34)
/* 127 */         .m_171488_(-0.7434F, -0.2232F, -3.6225F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).m_171514_(15, 15)
/* 128 */         .m_171488_(-0.4309F, -0.9732F, -3.6225F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(23, 51)
/* 129 */         .m_171488_(-0.4309F, -1.9732F, -3.6225F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).m_171514_(6, 15).m_171488_(-0.4309F, -0.9732F, 2.3775F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), 
/*     */         
/* 131 */         PartPose.m_171419_(0.1225F, -1.7768F, 0.0066F));
/* 132 */     PartDefinition Stock = M16.m_171599_("Stock", 
/* 133 */         CubeListBuilder.m_171558_().m_171514_(20, 28).m_171488_(-0.474F, 1.7572F, 9.0725F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(0, 34)
/* 134 */         .m_171488_(-0.474F, -0.2428F, 3.0725F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), 
/* 135 */         PartPose.m_171419_(0.1225F, -1.7768F, 0.0066F));
/* 136 */     PartDefinition cube_r9 = Stock.m_171599_("cube_r9", 
/* 137 */         CubeListBuilder.m_171558_().m_171514_(30, 0).m_171488_(-0.4806F, -3.6572F, 0.328F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), 
/* 138 */         PartPose.m_171423_(0.0066F, 3.8698F, 8.6116F, 1.0472F, 0.0F, 0.0F));
/* 139 */     PartDefinition Handguard = M16.m_171599_("Handguard", 
/* 140 */         CubeListBuilder.m_171558_().m_171514_(16, 0).m_171488_(-1.1184F, -0.3482F, -14.6225F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), 
/* 141 */         PartPose.m_171419_(0.2725F, -1.7768F, 0.0066F));
/* 142 */     PartDefinition Barrel = M16.m_171599_("Barrel", 
/* 143 */         CubeListBuilder.m_171558_().m_171514_(0, 0).m_171488_(-0.25F, 0.625F, -4.375F, 1.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)).m_171514_(0, 15)
/* 144 */         .m_171488_(-0.25F, -1.375F, -0.375F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 145 */         PartPose.m_171419_(-0.0959F, -2.125F, -15.2409F));
/* 146 */     PartDefinition RightArm = partdefinition.m_171599_("RightArm", 
/* 147 */         CubeListBuilder.m_171558_().m_171514_(0, 52).m_171488_(-1.0F, -1.8F, -2.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(62, 61)
/* 148 */         .m_171488_(-2.5924F, -2.0237F, -1.7847F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(28, 40)
/* 149 */         .m_171488_(-1.0F, 5.2F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(34, 32)
/* 150 */         .m_171488_(0.0F, 11.2F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(32, 12)
/* 151 */         .m_171488_(2.0F, 11.2F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(16, 0)
/* 152 */         .m_171488_(2.0F, 11.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(30, 32).m_171488_(2.0F, 11.2F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*     */         
/* 154 */         PartPose.m_171423_(5.0F, 1.0F, 0.125F, -1.2192F, 0.8352F, 0.4887F));
/* 155 */     PartDefinition LeftLeg = partdefinition.m_171599_("LeftLeg", 
/* 156 */         CubeListBuilder.m_171558_().m_171514_(50, 59).m_171488_(-2.0F, -0.8F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(0, 44)
/* 157 */         .m_171488_(-2.375F, 10.0F, -2.9102F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(22, 0)
/* 158 */         .m_171488_(0.625F, 11.0F, -3.9102F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 28)
/* 159 */         .m_171488_(-2.375F, 11.0F, -3.9102F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 160 */         PartPose.m_171419_(-2.0F, 11.0F, 0.0F));
/* 161 */     PartDefinition cube_r10 = LeftLeg.m_171599_("cube_r10", 
/* 162 */         CubeListBuilder.m_171558_().m_171514_(57, 32).m_171488_(-2.0F, 4.3F, 3.0F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 163 */         PartPose.m_171423_(-0.25F, 1.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 164 */     PartDefinition cube_r11 = LeftLeg.m_171599_("cube_r11", 
/* 165 */         CubeListBuilder.m_171558_().m_171514_(0, 0).m_171488_(-3.5625F, -3.5F, -2.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 166 */         PartPose.m_171423_(1.8125F, 6.0735F, -0.1237F, 0.7418F, 0.0F, 0.0F));
/* 167 */     PartDefinition cube_r12 = LeftLeg.m_171599_("cube_r12", 
/* 168 */         CubeListBuilder.m_171558_().m_171514_(14, 48).m_171488_(-2.0F, -0.6F, -2.2F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 169 */         PartPose.m_171423_(-0.125F, 1.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 170 */     PartDefinition RightLeg = partdefinition.m_171599_("RightLeg", 
/* 171 */         CubeListBuilder.m_171558_().m_171514_(55, 14).m_171488_(-2.0F, -0.8F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(44, 40)
/* 172 */         .m_171488_(-1.625F, 10.0F, -2.9102F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(46, 7)
/* 173 */         .m_171488_(1.375F, 11.0F, -3.9102F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(45, 42)
/* 174 */         .m_171488_(-1.625F, 11.0F, -3.9102F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 175 */         PartPose.m_171419_(2.0F, 11.0F, 0.0F));
/* 176 */     PartDefinition cube_r13 = RightLeg.m_171599_("cube_r13", 
/* 177 */         CubeListBuilder.m_171558_().m_171514_(36, 58).m_171488_(-2.0F, 4.3F, 3.0F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 178 */         PartPose.m_171423_(0.25F, 1.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 179 */     PartDefinition cube_r14 = RightLeg.m_171599_("cube_r14", 
/* 180 */         CubeListBuilder.m_171558_().m_171514_(50, 3).m_171488_(0.5625F, -3.5F, -2.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 181 */         PartPose.m_171423_(-1.9375F, 6.0735F, -0.1237F, 0.7418F, 0.0F, 0.0F));
/* 182 */     PartDefinition cube_r15 = RightLeg.m_171599_("cube_r15", 
/* 183 */         CubeListBuilder.m_171558_().m_171514_(40, 48).m_171488_(-2.0F, -0.6F, -2.2F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 184 */         PartPose.m_171423_(0.125F, 1.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 185 */     return LayerDefinition.m_171565_(meshdefinition, 80, 80);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void m_7695_(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 191 */     this.Head.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 192 */     this.Body.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 193 */     this.Tail.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 194 */     this.LeftArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 195 */     this.RightArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 196 */     this.LeftLeg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 197 */     this.RightLeg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */   
/*     */   public void m_6973_(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
/* 201 */     this.RightArm.f_104203_ = Mth.m_14089_(limbSwing * 0.6662F + 3.1415927F) * limbSwingAmount;
/* 202 */     this.LeftLeg.f_104203_ = Mth.m_14089_(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
/* 203 */     this.Head.f_104204_ = netHeadYaw / 57.295776F;
/* 204 */     this.Head.f_104203_ = headPitch / 57.295776F;
/* 205 */     this.LeftArm.f_104203_ = Mth.m_14089_(limbSwing * 0.6662F) * limbSwingAmount;
/* 206 */     this.RightLeg.f_104203_ = Mth.m_14089_(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\client\model\ModelMilitary_Drone_Hertx.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */