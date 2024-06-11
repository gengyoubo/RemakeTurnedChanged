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
/*     */ public class Modelhertx_model_fb_sit<T extends Entity>
/*     */   extends EntityModel<T>
/*     */ {
/*  24 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("turned", "modelhertx_model_fb_sit"), "main");
/*     */   public final ModelPart Head;
/*     */   public final ModelPart Body;
/*     */   public final ModelPart Tail;
/*     */   public final ModelPart LeftArm;
/*     */   public final ModelPart RightArm;
/*     */   public final ModelPart LeftLeg;
/*     */   public final ModelPart RightLeg;
/*     */   
/*     */   public Modelhertx_model_fb_sit(ModelPart root) {
/*  34 */     this.Head = root.m_171324_("Head");
/*  35 */     this.Body = root.m_171324_("Body");
/*  36 */     this.Tail = root.m_171324_("Tail");
/*  37 */     this.LeftArm = root.m_171324_("LeftArm");
/*  38 */     this.RightArm = root.m_171324_("RightArm");
/*  39 */     this.LeftLeg = root.m_171324_("LeftLeg");
/*  40 */     this.RightLeg = root.m_171324_("RightLeg");
/*     */   }
/*     */   
/*     */   public static LayerDefinition createBodyLayer() {
/*  44 */     MeshDefinition meshdefinition = new MeshDefinition();
/*  45 */     PartDefinition partdefinition = meshdefinition.m_171576_();
/*  46 */     PartDefinition Head = partdefinition.m_171599_("Head", 
/*  47 */         CubeListBuilder.m_171558_().m_171514_(15, 13).m_171488_(-3.0F, -1.675F, -5.075F, 6.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).m_171514_(52, 41)
/*  48 */         .m_171488_(-2.0F, -2.775F, -3.075F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(58, 47)
/*  49 */         .m_171488_(-2.0F, -6.775F, 1.925F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).m_171514_(0, 7)
/*  50 */         .m_171488_(-2.0F, -2.775F, 2.925F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(58, 3)
/*  51 */         .m_171488_(-3.0F, -2.775F, 1.925F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(38, 0)
/*  52 */         .m_171488_(-2.5F, -0.775F, -2.475F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(0, 17)
/*  53 */         .m_171488_(2.0F, -6.775F, 1.925F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(5, 16)
/*  54 */         .m_171488_(-3.0F, -6.775F, 1.925F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 27)
/*  55 */         .m_171488_(-3.0F, -6.775F, -3.075F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(41, 57)
/*  56 */         .m_171488_(2.0F, -5.775F, -4.075F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(49, 50)
/*  57 */         .m_171488_(2.0F, -2.675F, -5.075F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).m_171514_(0, 56)
/*  58 */         .m_171488_(-3.0F, -5.775F, -4.075F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(53, 0)
/*  59 */         .m_171488_(-3.0F, -4.775F, -5.075F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 46)
/*  60 */         .m_171488_(-3.0F, -2.675F, -5.075F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).m_171514_(58, 54)
/*  61 */         .m_171488_(-2.0F, -5.775F, -5.075F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(0, 25)
/*  62 */         .m_171488_(-2.0F, -6.775F, -4.075F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(10, 25)
/*  63 */         .m_171488_(-2.0F, -2.675F, -5.075F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  64 */         PartPose.m_171419_(0.0F, 4.125F, 1.5F));
/*  65 */     PartDefinition cube_r1 = Head.m_171599_("cube_r1", 
/*  66 */         CubeListBuilder.m_171558_().m_171514_(15, 15).m_171488_(-3.0F, -1.8601F, 6.7623F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(0, 0)
/*  67 */         .m_171488_(-3.0F, -1.8601F, 8.7623F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(60, 27)
/*  68 */         .m_171488_(-3.0F, -1.8601F, 2.7623F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(0, 13)
/*  69 */         .m_171488_(2.0F, -1.8601F, 6.7623F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(0, 2)
/*  70 */         .m_171488_(2.0F, -1.8601F, 8.7623F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 0)
/*  71 */         .m_171488_(2.0F, -1.8601F, 2.7623F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  72 */         PartPose.m_171423_(0.0F, -3.725F, -0.075F, 0.2618F, 0.0F, 0.0F));
/*  73 */     PartDefinition Body = partdefinition.m_171599_("Body", 
/*  74 */         CubeListBuilder.m_171558_().m_171514_(26, 8).m_171488_(-4.0F, 10.9265F, -1.6411F, 8.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(16, 0)
/*  75 */         .m_171488_(-3.5F, 6.9265F, -1.6411F, 7.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(20, 21)
/*  76 */         .m_171488_(-4.0F, -0.0735F, -1.6411F, 8.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(55, 58)
/*  77 */         .m_171488_(-3.5F, -0.261F, -2.3911F, 7.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(15, 13)
/*  78 */         .m_171488_(-1.0F, 5.739F, -1.9536F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(16, 8).m_171488_(-3.0F, 4.739F, -2.1411F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*     */         
/*  80 */         PartPose.m_171423_(0.0F, 4.125F, 1.5F, -0.1309F, 0.0F, 0.0F));
/*  81 */     PartDefinition Tail = partdefinition.m_171599_("Tail", CubeListBuilder.m_171558_(), 
/*  82 */         PartPose.m_171423_(0.0F, 15.0F, 1.0F, 0.6545F, 0.0F, 0.0F));
/*  83 */     PartDefinition cube_r2 = Tail.m_171599_("cube_r2", CubeListBuilder.m_171558_(), 
/*  84 */         PartPose.m_171423_(0.0F, -13.3689F, 23.8592F, -1.1781F, 0.0F, 0.0F));
/*  85 */     PartDefinition cube_r2_r1 = cube_r2.m_171599_("cube_r2_r1", 
/*  86 */         CubeListBuilder.m_171558_().m_171514_(0, 13).m_171488_(-1.3F, -0.1297F, 36.5872F, 3.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), 
/*  87 */         PartPose.m_171423_(0.0F, 40.8187F, -20.2444F, 0.5236F, 0.0F, 0.0F));
/*  88 */     PartDefinition cube_r3 = Tail.m_171599_("cube_r3", 
/*  89 */         CubeListBuilder.m_171558_().m_171514_(0, 0).m_171488_(-1.3F, 10.1852F, 7.174F, 3.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)), 
/*  90 */         PartPose.m_171423_(0.0F, -13.3689F, 2.8592F, -0.7854F, 0.0F, 0.0F));
/*  91 */     PartDefinition LeftArm = partdefinition.m_171599_("LeftArm", 
/*  92 */         CubeListBuilder.m_171558_().m_171514_(42, 45).m_171488_(-1.8228F, -2.0604F, -2.25F, 3.0F, 8.0F, 4.0F, new CubeDeformation(0.0F))
/*  93 */         .m_171514_(41, 13).m_171488_(-2.8228F, 5.9396F, -2.25F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(16, 0)
/*  94 */         .m_171488_(-2.8228F, 12.9396F, 0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(6, 2)
/*  95 */         .m_171488_(-2.8228F, 12.9396F, -2.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(6, 0)
/*  96 */         .m_171488_(-0.8228F, 12.9396F, -2.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(4, 13)
/*  97 */         .m_171488_(-2.8228F, 12.9396F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  98 */         PartPose.m_171423_(-5.0F, 6.25F, 2.0F, 0.0F, 0.0F, 0.0873F));
/*  99 */     PartDefinition RightArm = partdefinition.m_171599_("RightArm", 
/* 100 */         CubeListBuilder.m_171558_().m_171514_(28, 45).m_171488_(-1.2397F, -2.0604F, -2.25F, 3.0F, 8.0F, 4.0F, new CubeDeformation(0.0F))
/* 101 */         .m_171514_(34, 34).m_171488_(-1.2397F, 5.9396F, -2.25F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(16, 2)
/* 102 */         .m_171488_(-0.2397F, 12.9396F, -2.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 27)
/* 103 */         .m_171488_(1.7603F, 12.9396F, -2.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(26, 10)
/* 104 */         .m_171488_(1.7603F, 12.9396F, -2.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 29)
/* 105 */         .m_171488_(1.7603F, 12.9396F, -2.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 106 */         PartPose.m_171423_(5.0F, 6.25F, 2.0F, 0.0F, 0.0F, -0.0873F));
/* 107 */     PartDefinition LeftLeg = partdefinition.m_171599_("LeftLeg", 
/* 108 */         CubeListBuilder.m_171558_().m_171514_(57, 13).m_171488_(-2.0319F, -1.042F, -2.0541F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 109 */         PartPose.m_171423_(-2.0F, 17.0F, 0.0F, -0.2164F, 0.0283F, 0.1278F));
/* 110 */     PartDefinition LeftLeg_r1 = LeftLeg.m_171599_("LeftLeg_r1", 
/* 111 */         CubeListBuilder.m_171558_().m_171514_(50, 34).m_171488_(-3.2648F, -7.2043F, -7.6956F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 112 */         PartPose.m_171423_(1.1705F, -6.3463F, 10.542F, 2.618F, 0.0F, 0.0F));
/* 113 */     PartDefinition cube_r4 = LeftLeg.m_171599_("cube_r4", CubeListBuilder.m_171558_(), 
/* 114 */         PartPose.m_171423_(-0.9545F, -4.7756F, -1.5151F, -0.3927F, 0.0F, 0.0F));
/* 115 */     PartDefinition cube_r4_r1 = cube_r4.m_171599_("cube_r4_r1", 
/* 116 */         CubeListBuilder.m_171558_().m_171514_(27, 57).m_171488_(-3.2023F, -7.6768F, -3.4127F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 117 */         PartPose.m_171423_(2.0625F, -1.9018F, 13.6106F, 2.2253F, 0.0F, 0.0F));
/* 118 */     PartDefinition cube_r5 = LeftLeg.m_171599_("cube_r5", CubeListBuilder.m_171558_(), 
/* 119 */         PartPose.m_171423_(-0.9545F, -4.7756F, -1.5151F, 1.5708F, 0.0F, 0.0F));
/* 120 */     PartDefinition cube_r5_r1 = cube_r5.m_171599_("cube_r5_r1", 
/* 121 */         CubeListBuilder.m_171558_().m_171514_(0, 33).m_171488_(-3.1398F, -16.3407F, -14.2647F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 122 */         PartPose.m_171423_(2.0F, 10.6954F, 7.2207F, 0.3927F, 0.0F, 0.0F));
/* 123 */     PartDefinition cube_r6 = LeftLeg.m_171599_("cube_r6", 
/* 124 */         CubeListBuilder.m_171558_().m_171514_(44, 24).m_171488_(-1.1398F, 4.8772F, 1.6501F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 125 */         PartPose.m_171423_(-0.9545F, -4.7756F, -1.5151F, -0.3927F, 0.0F, 0.0F));
/* 126 */     PartDefinition RightLeg = partdefinition.m_171599_("RightLeg", 
/* 127 */         CubeListBuilder.m_171558_().m_171514_(56, 20).m_171488_(-1.9681F, -1.042F, -2.0541F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 128 */         PartPose.m_171423_(2.0F, 17.0F, 0.0F, -0.2164F, -0.0283F, -0.1278F));
/* 129 */     PartDefinition RightLeg_r1 = RightLeg.m_171599_("RightLeg_r1", 
/* 130 */         CubeListBuilder.m_171558_().m_171514_(50, 6).m_171488_(-0.7352F, -6.9278F, -7.4422F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 131 */         PartPose.m_171423_(-1.1705F, -5.9801F, 10.6232F, 2.618F, 0.0F, 0.0F));
/* 132 */     PartDefinition cube_r7 = RightLeg.m_171599_("cube_r7", CubeListBuilder.m_171558_(), 
/* 133 */         PartPose.m_171423_(0.9545F, -4.7756F, -1.5151F, -0.3927F, 0.0F, 0.0F));
/* 134 */     PartDefinition cube_r7_r1 = cube_r7.m_171599_("cube_r7_r1", 
/* 135 */         CubeListBuilder.m_171558_().m_171514_(13, 53).m_171488_(-0.7977F, -9.5183F, -3.0729F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 136 */         PartPose.m_171423_(-2.0625F, -2.7532F, 15.2784F, 2.2253F, 0.0F, 0.0F));
/* 137 */     PartDefinition cube_r8 = RightLeg.m_171599_("cube_r8", 
/* 138 */         CubeListBuilder.m_171558_().m_171514_(18, 32).m_171488_(-2.8602F, -3.6961F, -11.6865F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 139 */         PartPose.m_171423_(0.9545F, -4.7756F, -1.5151F, 1.9635F, 0.0F, 0.0F));
/* 140 */     PartDefinition cube_r9 = RightLeg.m_171599_("cube_r9", 
/* 141 */         CubeListBuilder.m_171558_().m_171514_(12, 43).m_171488_(-2.8602F, 4.8772F, 1.6501F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 142 */         PartPose.m_171423_(0.9545F, -4.7756F, -1.5151F, -0.3927F, 0.0F, 0.0F));
/* 143 */     return LayerDefinition.m_171565_(meshdefinition, 128, 128);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void m_7695_(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 149 */     this.Head.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 150 */     this.Body.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 151 */     this.Tail.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 152 */     this.LeftArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 153 */     this.RightArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 154 */     this.LeftLeg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 155 */     this.RightLeg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */   
/*     */   public void m_6973_(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
/* 159 */     this.Head.f_104204_ = netHeadYaw / 57.295776F;
/* 160 */     this.Head.f_104203_ = headPitch / 57.295776F;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\client\model\Modelhertx_model_fb_sit.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */