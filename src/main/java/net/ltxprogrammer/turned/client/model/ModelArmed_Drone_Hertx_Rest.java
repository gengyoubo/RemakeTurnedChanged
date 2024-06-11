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
/*     */ import net.minecraft.world.entity.Entity;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ModelArmed_Drone_Hertx_Rest<T extends Entity>
/*     */   extends EntityModel<T>
/*     */ {
/*  24 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("turned", "model_armed_drone_hertx_rest"), "main");
/*     */   
/*     */   public final ModelPart Head;
/*     */   public final ModelPart Body;
/*     */   public final ModelPart Tail;
/*     */   public final ModelPart LeftArm;
/*     */   public final ModelPart RightArm;
/*     */   public final ModelPart LeftLeg;
/*     */   public final ModelPart RightLeg;
/*     */   public final ModelPart bb_main;
/*     */   
/*     */   public ModelArmed_Drone_Hertx_Rest(ModelPart root) {
/*  36 */     this.Head = root.m_171324_("Head");
/*  37 */     this.Body = root.m_171324_("Body");
/*  38 */     this.Tail = root.m_171324_("Tail");
/*  39 */     this.LeftArm = root.m_171324_("LeftArm");
/*  40 */     this.RightArm = root.m_171324_("RightArm");
/*  41 */     this.LeftLeg = root.m_171324_("LeftLeg");
/*  42 */     this.RightLeg = root.m_171324_("RightLeg");
/*  43 */     this.bb_main = root.m_171324_("bb_main");
/*     */   }
/*     */   
/*     */   public static LayerDefinition createBodyLayer() {
/*  47 */     MeshDefinition meshdefinition = new MeshDefinition();
/*  48 */     PartDefinition partdefinition = meshdefinition.m_171576_();
/*  49 */     PartDefinition Head = partdefinition.m_171599_("Head", 
/*  50 */         CubeListBuilder.m_171558_().m_171514_(30, 25).m_171488_(-3.0F, -1.3F, -4.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(51, 53)
/*  51 */         .m_171488_(-2.0F, -2.4F, -3.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(16, 42)
/*  52 */         .m_171488_(-2.0F, -6.4F, 2.0F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(33, 7)
/*  53 */         .m_171488_(-1.5F, -6.775F, -3.75F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).m_171514_(30, 7)
/*  54 */         .m_171488_(-2.0F, -2.4F, 3.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 11)
/*  55 */         .m_171488_(-3.0F, -2.4F, 2.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(10, 36)
/*  56 */         .m_171488_(-3.0F, -0.275F, -2.275F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(26, 12)
/*  57 */         .m_171488_(-1.0F, -0.15F, -2.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 44)
/*  58 */         .m_171488_(2.0F, -6.4F, 2.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(10, 34)
/*  59 */         .m_171488_(-3.0F, -6.4F, 2.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(30, 0)
/*  60 */         .m_171488_(-3.0F, -6.3F, -4.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(8, 58)
/*  61 */         .m_171488_(2.0F, -5.3F, -4.0F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(0, 63)
/*  62 */         .m_171488_(2.0F, -2.3F, -4.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(56, 42)
/*  63 */         .m_171488_(-3.0F, -5.3F, -4.0F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(63, 53)
/*  64 */         .m_171488_(-3.0F, -2.3F, -4.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(16, 6)
/*  65 */         .m_171488_(-2.0F, -5.3F, -4.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(16, 12)
/*  66 */         .m_171488_(-2.0F, -2.3F, -4.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(40, 40)
/*  67 */         .m_171488_(-1.0F, -2.8F, -4.875F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  68 */         PartPose.m_171419_(0.0F, -2.0F, -0.2F));
/*  69 */     PartDefinition cube_r1 = Head.m_171599_("cube_r1", 
/*  70 */         CubeListBuilder.m_171558_().m_171514_(35, 15).m_171488_(-1.0F, -4.3F, -6.7F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), 
/*  71 */         PartPose.m_171423_(0.0F, 1.75F, 1.825F, 0.0F, 0.48F, 0.0F));
/*  72 */     PartDefinition Antenna = Head.m_171599_("Antenna", CubeListBuilder.m_171558_(), PartPose.m_171419_(0.0F, -6.1528F, 3.0874F));
/*  73 */     PartDefinition cube_r2 = Antenna.m_171599_("cube_r2", 
/*  74 */         CubeListBuilder.m_171558_().m_171514_(60, 0).m_171488_(0.0F, -2.75F, -1.25F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(22, 59)
/*  75 */         .m_171488_(-6.5F, -2.75F, -1.25F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(16, 0)
/*  76 */         .m_171488_(-6.5F, -3.75F, -5.25F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(16, 58).m_171488_(0.0F, -3.75F, -5.25F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), 
/*     */         
/*  78 */         PartPose.m_171423_(2.75F, 0.3511F, 2.7389F, 1.3526F, 0.0F, 0.0F));
/*  79 */     PartDefinition Body = partdefinition.m_171599_("Body", 
/*  80 */         CubeListBuilder.m_171558_().m_171514_(15, 15).m_171488_(-4.0F, 0.2F, -2.0F, 8.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(0, 28)
/*  81 */         .m_171488_(-4.0F, 10.2F, -2.0F, 8.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(35, 32)
/*  82 */         .m_171488_(-3.625F, 6.2F, -2.0F, 7.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  83 */         PartPose.m_171419_(0.0F, -2.0F, 0.0F));
/*  84 */     PartDefinition Tail = partdefinition.m_171599_("Tail", CubeListBuilder.m_171558_(), PartPose.m_171419_(0.0F, 10.0F, 0.0F));
/*  85 */     PartDefinition cube_r3 = Tail.m_171599_("cube_r3", 
/*  86 */         CubeListBuilder.m_171558_().m_171514_(0, 21).m_171488_(-1.25F, 10.3026F, 24.6391F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 16)
/*  87 */         .m_171488_(-0.25F, 10.8026F, 25.6391F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(10, 1)
/*  88 */         .m_171488_(1.75F, 10.8026F, 25.6391F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(16, 0)
/*  89 */         .m_171488_(-0.25F, 12.8026F, 25.6391F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(16, 1)
/*  90 */         .m_171488_(1.75F, 12.8026F, 25.6391F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(17, 25)
/*  91 */         .m_171488_(-0.25F, 11.3026F, 15.6391F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), 
/*  92 */         PartPose.m_171423_(-0.75F, -10.3628F, -1.0141F, -0.3927F, 0.0F, 0.0F));
/*  93 */     PartDefinition cube_r4 = Tail.m_171599_("cube_r4", 
/*  94 */         CubeListBuilder.m_171558_().m_171514_(0, 15).m_171488_(-0.25F, 4.2F, 7.0F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), 
/*  95 */         PartPose.m_171423_(-0.75F, -9.2F, 0.0F, -0.7854F, 0.0F, 0.0F));
/*  96 */     PartDefinition LeftArm = partdefinition.m_171599_("LeftArm", 
/*  97 */         CubeListBuilder.m_171558_().m_171514_(54, 21).m_171488_(-2.0F, -1.8F, -2.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(64, 7)
/*  98 */         .m_171488_(-0.375F, -2.925F, -1.875F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(39, 15)
/*  99 */         .m_171488_(-3.0F, 5.2F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(46, 10)
/* 100 */         .m_171488_(-3.0F, 11.2F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(26, 42)
/* 101 */         .m_171488_(-3.0F, 11.2F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(36, 12)
/* 102 */         .m_171488_(-1.0F, 11.2F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(10, 39)
/* 103 */         .m_171488_(-3.0F, 11.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 104 */         PartPose.m_171423_(-5.0F, 1.0F, 0.125F, -0.9667F, -0.7684F, -0.1824F));
/* 105 */     PartDefinition M16 = LeftArm.m_171599_("M16", CubeListBuilder.m_171558_(), 
/* 106 */         PartPose.m_171423_(-0.4987F, 9.9293F, -2.0497F, 1.5708F, 0.0F, 0.0873F));
/* 107 */     PartDefinition Grip = M16.m_171599_("Grip", 
/* 108 */         CubeListBuilder.m_171558_().m_171514_(32, 50).m_171488_(-0.5209F, -0.0875F, 1.2465F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), 
/* 109 */         PartPose.m_171419_(0.0F, 0.0F, 0.0F));
/* 110 */     PartDefinition cube_r5 = Grip.m_171599_("cube_r5", 
/* 111 */         CubeListBuilder.m_171558_().m_171514_(0, 0).m_171488_(-0.5934F, 2.0486F, 1.6886F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 112 */         PartPose.m_171423_(0.1225F, -0.4268F, -0.7684F, 0.3927F, 0.0F, 0.0F));
/* 113 */     PartDefinition cube_r6 = Grip.m_171599_("cube_r6", 
/* 114 */         CubeListBuilder.m_171558_().m_171514_(48, 25).m_171488_(-0.4934F, 2.0486F, 0.5386F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), 
/* 115 */         PartPose.m_171423_(0.1225F, -0.7768F, 0.1316F, 0.3927F, 0.0F, 0.0F));
/* 116 */     PartDefinition Mag = M16.m_171599_("Mag", 
/* 117 */         CubeListBuilder.m_171558_().m_171514_(30, 25).m_171488_(-0.4934F, 1.9643F, -3.2225F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), 
/* 118 */         PartPose.m_171419_(0.1225F, -1.7768F, 0.0066F));
/* 119 */     PartDefinition cube_r7 = Mag.m_171599_("cube_r7", 
/* 120 */         CubeListBuilder.m_171558_().m_171514_(48, 0).m_171488_(-0.4934F, 4.6897F, -0.8395F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), 
/* 121 */         PartPose.m_171423_(0.0F, 0.1875F, -0.5F, -0.3927F, 0.0F, 0.0F));
/* 122 */     PartDefinition Receiver = M16.m_171599_("Receiver", 
/* 123 */         CubeListBuilder.m_171558_().m_171514_(10, 0).m_171488_(-0.7434F, -0.2232F, -4.6225F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
/* 124 */         .m_171514_(0, 15).m_171488_(-0.7434F, -0.2232F, -0.6225F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(0, 34)
/* 125 */         .m_171488_(-0.7434F, -0.2232F, -3.6225F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).m_171514_(15, 15)
/* 126 */         .m_171488_(-0.4309F, -0.9732F, -3.6225F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(23, 51)
/* 127 */         .m_171488_(-0.4309F, -1.9732F, -3.6225F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).m_171514_(6, 15).m_171488_(-0.4309F, -0.9732F, 2.3775F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), 
/*     */         
/* 129 */         PartPose.m_171419_(0.1225F, -1.7768F, 0.0066F));
/* 130 */     PartDefinition Stock = M16.m_171599_("Stock", 
/* 131 */         CubeListBuilder.m_171558_().m_171514_(20, 28).m_171488_(-0.474F, 1.7572F, 9.0725F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(0, 34)
/* 132 */         .m_171488_(-0.474F, -0.2428F, 3.0725F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), 
/* 133 */         PartPose.m_171419_(0.1225F, -1.7768F, 0.0066F));
/* 134 */     PartDefinition cube_r8 = Stock.m_171599_("cube_r8", 
/* 135 */         CubeListBuilder.m_171558_().m_171514_(30, 0).m_171488_(-0.4806F, -3.6572F, 0.328F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), 
/* 136 */         PartPose.m_171423_(0.0066F, 3.8698F, 8.6116F, 1.0472F, 0.0F, 0.0F));
/* 137 */     PartDefinition Handguard = M16.m_171599_("Handguard", 
/* 138 */         CubeListBuilder.m_171558_().m_171514_(16, 0).m_171488_(-1.1184F, -0.3482F, -14.6225F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), 
/* 139 */         PartPose.m_171419_(0.2725F, -1.7768F, 0.0066F));
/* 140 */     PartDefinition Barrel = M16.m_171599_("Barrel", 
/* 141 */         CubeListBuilder.m_171558_().m_171514_(0, 0).m_171488_(-0.25F, 0.625F, -4.375F, 1.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)).m_171514_(0, 15)
/* 142 */         .m_171488_(-0.25F, -1.375F, -0.375F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 143 */         PartPose.m_171419_(-0.0959F, -2.125F, -15.2409F));
/* 144 */     PartDefinition RightArm = partdefinition.m_171599_("RightArm", 
/* 145 */         CubeListBuilder.m_171558_().m_171514_(0, 52).m_171488_(-1.0F, -1.8F, -2.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(62, 61)
/* 146 */         .m_171488_(-2.5924F, -2.0237F, -1.7847F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(28, 40)
/* 147 */         .m_171488_(-1.0F, 5.2F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(34, 32)
/* 148 */         .m_171488_(0.0F, 11.2F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(32, 12)
/* 149 */         .m_171488_(2.0F, 11.2F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(16, 0)
/* 150 */         .m_171488_(2.0F, 11.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(30, 32).m_171488_(2.0F, 11.2F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*     */         
/* 152 */         PartPose.m_171423_(5.0F, 1.0F, 0.125F, -1.3796F, -0.4282F, 1.1014F));
/* 153 */     PartDefinition LeftLeg = partdefinition.m_171599_("LeftLeg", 
/* 154 */         CubeListBuilder.m_171558_().m_171514_(50, 59).m_171488_(-2.0F, -0.8F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(0, 44)
/* 155 */         .m_171488_(-2.375F, 10.0F, -2.9102F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(22, 0)
/* 156 */         .m_171488_(0.625F, 11.0F, -3.9102F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 28)
/* 157 */         .m_171488_(-2.375F, 11.0F, -3.9102F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 158 */         PartPose.m_171419_(-2.0F, 11.0F, 0.0F));
/* 159 */     PartDefinition cube_r9 = LeftLeg.m_171599_("cube_r9", 
/* 160 */         CubeListBuilder.m_171558_().m_171514_(57, 32).m_171488_(-2.0F, 4.3F, 3.0F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 161 */         PartPose.m_171423_(-0.25F, 1.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 162 */     PartDefinition cube_r10 = LeftLeg.m_171599_("cube_r10", 
/* 163 */         CubeListBuilder.m_171558_().m_171514_(0, 0).m_171488_(-3.5625F, -3.5F, -2.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 164 */         PartPose.m_171423_(1.8125F, 6.0735F, -0.1237F, 0.7418F, 0.0F, 0.0F));
/* 165 */     PartDefinition cube_r11 = LeftLeg.m_171599_("cube_r11", 
/* 166 */         CubeListBuilder.m_171558_().m_171514_(14, 48).m_171488_(-2.0F, -0.6F, -2.2F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 167 */         PartPose.m_171423_(-0.125F, 1.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 168 */     PartDefinition RightLeg = partdefinition.m_171599_("RightLeg", 
/* 169 */         CubeListBuilder.m_171558_().m_171514_(55, 14).m_171488_(-2.0F, -0.8F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(44, 40)
/* 170 */         .m_171488_(-1.625F, 10.0F, -2.9102F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(46, 7)
/* 171 */         .m_171488_(1.375F, 11.0F, -3.9102F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(45, 42)
/* 172 */         .m_171488_(-1.625F, 11.0F, -3.9102F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 173 */         PartPose.m_171419_(2.0F, 11.0F, 0.0F));
/* 174 */     PartDefinition cube_r12 = RightLeg.m_171599_("cube_r12", 
/* 175 */         CubeListBuilder.m_171558_().m_171514_(36, 58).m_171488_(-2.0F, 4.3F, 3.0F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 176 */         PartPose.m_171423_(0.25F, 1.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 177 */     PartDefinition cube_r13 = RightLeg.m_171599_("cube_r13", 
/* 178 */         CubeListBuilder.m_171558_().m_171514_(50, 3).m_171488_(0.5625F, -3.5F, -2.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 179 */         PartPose.m_171423_(-1.9375F, 6.0735F, -0.1237F, 0.7418F, 0.0F, 0.0F));
/* 180 */     PartDefinition cube_r14 = RightLeg.m_171599_("cube_r14", 
/* 181 */         CubeListBuilder.m_171558_().m_171514_(40, 48).m_171488_(-2.0F, -0.6F, -2.2F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 182 */         PartPose.m_171423_(0.125F, 1.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 183 */     PartDefinition bb_main = partdefinition.m_171599_("bb_main", CubeListBuilder.m_171558_(), PartPose.m_171419_(0.0F, 24.0F, 0.0F));
/* 184 */     PartDefinition cube_r15 = bb_main.m_171599_("cube_r15", 
/* 185 */         CubeListBuilder.m_171558_().m_171514_(27, 36).m_171488_(-1.0F, -4.3F, -6.7F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), 
/* 186 */         PartPose.m_171423_(0.0F, -24.25F, 1.625F, 0.0F, -0.48F, 0.0F));
/* 187 */     return LayerDefinition.m_171565_(meshdefinition, 80, 80);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void m_7695_(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 193 */     this.Head.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 194 */     this.Body.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 195 */     this.Tail.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 196 */     this.LeftArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 197 */     this.RightArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 198 */     this.LeftLeg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 199 */     this.RightLeg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 200 */     this.bb_main.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */   
/*     */   public void m_6973_(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
/* 204 */     this.Head.f_104204_ = netHeadYaw / 57.295776F;
/* 205 */     this.Head.f_104203_ = headPitch / 57.295776F;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\client\model\ModelArmed_Drone_Hertx_Rest.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */