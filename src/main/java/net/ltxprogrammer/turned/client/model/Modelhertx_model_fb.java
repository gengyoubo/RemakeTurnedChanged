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
/*     */ public class Modelhertx_model_fb<T extends Entity>
/*     */   extends EntityModel<T>
/*     */ {
/*  25 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("turned", "modelhertx_model_fb"), "main");
/*     */   public final ModelPart Head;
/*     */   public final ModelPart Body;
/*     */   public final ModelPart Tail;
/*     */   public final ModelPart LeftArm;
/*     */   public final ModelPart RightArm;
/*     */   public final ModelPart LeftLeg;
/*     */   public final ModelPart RightLeg;
/*     */   
/*     */   public Modelhertx_model_fb(ModelPart root) {
/*  35 */     this.Head = root.m_171324_("Head");
/*  36 */     this.Body = root.m_171324_("Body");
/*  37 */     this.Tail = root.m_171324_("Tail");
/*  38 */     this.LeftArm = root.m_171324_("LeftArm");
/*  39 */     this.RightArm = root.m_171324_("RightArm");
/*  40 */     this.LeftLeg = root.m_171324_("LeftLeg");
/*  41 */     this.RightLeg = root.m_171324_("RightLeg");
/*     */   }
/*     */   
/*     */   public static LayerDefinition createBodyLayer() {
/*  45 */     MeshDefinition meshdefinition = new MeshDefinition();
/*  46 */     PartDefinition partdefinition = meshdefinition.m_171576_();
/*  47 */     PartDefinition Head = partdefinition.m_171599_("Head", 
/*  48 */         CubeListBuilder.m_171558_().m_171514_(15, 13).m_171488_(-3.0F, -1.7F, -5.0F, 6.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).m_171514_(52, 41)
/*  49 */         .m_171488_(-2.0F, -2.8F, -3.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(58, 47)
/*  50 */         .m_171488_(-2.0F, -6.8F, 2.0F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).m_171514_(0, 7)
/*  51 */         .m_171488_(-2.0F, -2.8F, 3.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(58, 3)
/*  52 */         .m_171488_(-3.0F, -2.8F, 2.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(38, 0)
/*  53 */         .m_171488_(-2.5F, -0.8F, -2.4F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(0, 17)
/*  54 */         .m_171488_(2.0F, -6.8F, 2.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(5, 16)
/*  55 */         .m_171488_(-3.0F, -6.8F, 2.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 27)
/*  56 */         .m_171488_(-3.0F, -6.8F, -3.0F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(41, 57)
/*  57 */         .m_171488_(2.0F, -5.8F, -4.0F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(49, 50)
/*  58 */         .m_171488_(2.0F, -2.7F, -5.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).m_171514_(0, 56)
/*  59 */         .m_171488_(-3.0F, -5.8F, -4.0F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(53, 0)
/*  60 */         .m_171488_(-3.0F, -4.8F, -5.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 46)
/*  61 */         .m_171488_(-3.0F, -2.7F, -5.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).m_171514_(58, 54)
/*  62 */         .m_171488_(-2.0F, -5.8F, -5.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(0, 25)
/*  63 */         .m_171488_(-2.0F, -6.8F, -4.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(10, 25)
/*  64 */         .m_171488_(-2.0F, -2.7F, -5.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  65 */         PartPose.m_171419_(0.0F, -2.6F, -0.2F));
/*  66 */     PartDefinition cube_r1 = Head.m_171599_("cube_r1", 
/*  67 */         CubeListBuilder.m_171558_().m_171514_(15, 15).m_171488_(-3.0F, -8.3801F, 8.5093F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(0, 0)
/*  68 */         .m_171488_(-3.0F, -8.3801F, 10.5093F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(60, 27)
/*  69 */         .m_171488_(-3.0F, -8.3801F, 4.5093F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(0, 13)
/*  70 */         .m_171488_(2.0F, -8.3801F, 8.5093F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(0, 2)
/*  71 */         .m_171488_(2.0F, -8.3801F, 10.5093F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 0).m_171488_(2.0F, -8.3801F, 4.5093F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), 
/*     */         
/*  73 */         PartPose.m_171423_(0.0F, 3.0F, 0.0F, 0.2618F, 0.0F, 0.0F));
/*  74 */     PartDefinition Body = partdefinition.m_171599_("Body", 
/*  75 */         CubeListBuilder.m_171558_().m_171514_(26, 8).m_171488_(-4.0F, 8.2F, -2.0F, 8.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(16, 0)
/*  76 */         .m_171488_(-3.5F, 4.2F, -2.0F, 7.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(20, 21)
/*  77 */         .m_171488_(-4.0F, -2.8F, -2.0F, 8.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(55, 58)
/*  78 */         .m_171488_(-3.5F, -2.9875F, -2.75F, 7.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(15, 13)
/*  79 */         .m_171488_(-1.0F, 3.0125F, -2.3125F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(16, 8)
/*  80 */         .m_171488_(-3.0F, 2.0125F, -2.5F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  81 */         PartPose.m_171419_(0.0F, 0.0F, 0.0F));
/*  82 */     PartDefinition Tail = partdefinition.m_171599_("Tail", CubeListBuilder.m_171558_(), PartPose.m_171419_(0.0F, 0.0F, 0.0F));
/*  83 */     PartDefinition cube_r2 = Tail.m_171599_("cube_r2", 
/*  84 */         CubeListBuilder.m_171558_().m_171514_(0, 13).m_171488_(-1.3F, 9.2337F, 12.5679F, 3.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), 
/*  85 */         PartPose.m_171423_(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/*  86 */     PartDefinition cube_r3 = Tail.m_171599_("cube_r3", 
/*  87 */         CubeListBuilder.m_171558_().m_171514_(0, 0).m_171488_(-1.3F, 3.4929F, 6.2929F, 3.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)), 
/*  88 */         PartPose.m_171423_(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
/*  89 */     PartDefinition LeftArm = partdefinition.m_171599_("LeftArm", 
/*  90 */         CubeListBuilder.m_171558_().m_171514_(42, 45).m_171488_(-1.7385F, -1.8114F, -2.0F, 3.0F, 8.0F, 4.0F, new CubeDeformation(0.0F))
/*  91 */         .m_171514_(41, 13).m_171488_(-2.7385F, 6.1886F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(16, 0)
/*  92 */         .m_171488_(-2.7385F, 13.1886F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(6, 2)
/*  93 */         .m_171488_(-2.7385F, 13.1886F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(6, 0)
/*  94 */         .m_171488_(-0.7385F, 13.1886F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(4, 13)
/*  95 */         .m_171488_(-2.7385F, 13.1886F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  96 */         PartPose.m_171423_(-5.0625F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0873F));
/*  97 */     PartDefinition RightArm = partdefinition.m_171599_("RightArm", 
/*  98 */         CubeListBuilder.m_171558_().m_171514_(28, 45).m_171488_(-1.2615F, -1.8114F, -2.0F, 3.0F, 8.0F, 4.0F, new CubeDeformation(0.0F))
/*  99 */         .m_171514_(34, 34).m_171488_(-1.2615F, 6.1886F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(16, 2)
/* 100 */         .m_171488_(-0.2615F, 13.1886F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 27)
/* 101 */         .m_171488_(1.7385F, 13.1886F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(26, 10)
/* 102 */         .m_171488_(1.7385F, 13.1886F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 29).m_171488_(1.7385F, 13.1886F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*     */         
/* 104 */         PartPose.m_171423_(5.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.0873F));
/* 105 */     PartDefinition LeftLeg = partdefinition.m_171599_("LeftLeg", 
/* 106 */         CubeListBuilder.m_171558_().m_171514_(57, 13).m_171488_(-2.0F, -0.8F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
/* 107 */         .m_171514_(50, 34).m_171488_(-2.125F, 12.0F, -2.9102F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 108 */         PartPose.m_171419_(-2.0F, 10.0F, 0.0F));
/* 109 */     PartDefinition cube_r4 = LeftLeg.m_171599_("cube_r4", 
/* 110 */         CubeListBuilder.m_171558_().m_171514_(27, 57).m_171488_(-2.0F, 4.3F, 3.0F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 111 */         PartPose.m_171423_(-0.0625F, 2.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 112 */     PartDefinition cube_r5 = LeftLeg.m_171599_("cube_r5", 
/* 113 */         CubeListBuilder.m_171558_().m_171514_(0, 33).m_171488_(-1.9375F, 0.0F, -5.8F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 114 */         PartPose.m_171423_(-0.0625F, 2.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
/* 115 */     PartDefinition cube_r6 = LeftLeg.m_171599_("cube_r6", 
/* 116 */         CubeListBuilder.m_171558_().m_171514_(44, 24).m_171488_(-2.0F, -0.6F, -2.2F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 117 */         PartPose.m_171423_(-0.0625F, 2.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 118 */     PartDefinition RightLeg = partdefinition.m_171599_("RightLeg", 
/* 119 */         CubeListBuilder.m_171558_().m_171514_(56, 20).m_171488_(-2.0F, -0.8F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
/* 120 */         .m_171514_(50, 6).m_171488_(-1.875F, 12.0F, -2.9102F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 121 */         PartPose.m_171419_(2.0F, 10.0F, 0.0F));
/* 122 */     PartDefinition cube_r7 = RightLeg.m_171599_("cube_r7", 
/* 123 */         CubeListBuilder.m_171558_().m_171514_(13, 53).m_171488_(-2.0F, 4.3F, 3.0F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 124 */         PartPose.m_171423_(0.0625F, 2.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 125 */     PartDefinition cube_r8 = RightLeg.m_171599_("cube_r8", 
/* 126 */         CubeListBuilder.m_171558_().m_171514_(18, 32).m_171488_(-2.0625F, 0.0F, -5.8F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 127 */         PartPose.m_171423_(0.0625F, 2.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
/* 128 */     PartDefinition cube_r9 = RightLeg.m_171599_("cube_r9", 
/* 129 */         CubeListBuilder.m_171558_().m_171514_(12, 43).m_171488_(-2.0F, -0.6F, -2.2F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 130 */         PartPose.m_171423_(0.0625F, 2.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 131 */     return LayerDefinition.m_171565_(meshdefinition, 128, 128);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void m_7695_(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 137 */     this.Head.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 138 */     this.Body.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 139 */     this.Tail.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 140 */     this.LeftArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 141 */     this.RightArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 142 */     this.LeftLeg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 143 */     this.RightLeg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */   
/*     */   public void m_6973_(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
/* 147 */     this.RightArm.f_104203_ = Mth.m_14089_(limbSwing * 0.6662F + 3.1415927F) * limbSwingAmount;
/* 148 */     this.LeftLeg.f_104203_ = Mth.m_14089_(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
/* 149 */     this.Head.f_104204_ = netHeadYaw / 57.295776F;
/* 150 */     this.Head.f_104203_ = headPitch / 57.295776F;
/* 151 */     this.LeftArm.f_104203_ = Mth.m_14089_(limbSwing * 0.6662F) * limbSwingAmount;
/* 152 */     this.RightLeg.f_104203_ = Mth.m_14089_(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\client\model\Modelhertx_model_fb.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */