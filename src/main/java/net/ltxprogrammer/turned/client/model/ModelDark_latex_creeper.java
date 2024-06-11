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
/*     */ public class ModelDark_latex_creeper<T extends Entity>
/*     */   extends EntityModel<T>
/*     */ {
/*  25 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("turned", "model_dark_latex_creeper"), "main");
/*     */   public final ModelPart head;
/*     */   public final ModelPart body;
/*     */   public final ModelPart leg0;
/*     */   public final ModelPart leg1;
/*     */   public final ModelPart leg2;
/*     */   public final ModelPart leg3;
/*     */   
/*     */   public ModelDark_latex_creeper(ModelPart root) {
/*  34 */     this.head = root.m_171324_("head");
/*  35 */     this.body = root.m_171324_("body");
/*  36 */     this.leg0 = root.m_171324_("leg0");
/*  37 */     this.leg1 = root.m_171324_("leg1");
/*  38 */     this.leg2 = root.m_171324_("leg2");
/*  39 */     this.leg3 = root.m_171324_("leg3");
/*     */   }
/*     */   
/*     */   public static LayerDefinition createBodyLayer() {
/*  43 */     MeshDefinition meshdefinition = new MeshDefinition();
/*  44 */     PartDefinition partdefinition = meshdefinition.m_171576_();
/*  45 */     PartDefinition head = partdefinition.m_171599_("head", 
/*  46 */         CubeListBuilder.m_171558_().m_171514_(0, 0).m_171488_(-4.0F, -10.7721F, -6.6047F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), 
/*  47 */         PartPose.m_171419_(0.0F, 6.0F, 0.0F));
/*  48 */     PartDefinition Crest = head.m_171599_("Crest", 
/*  49 */         CubeListBuilder.m_171558_().m_171514_(0, 3).m_171488_(0.0F, -6.0F, -4.0F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(18, 16)
/*  50 */         .m_171488_(0.0F, -7.0F, -4.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).m_171514_(18, 13)
/*  51 */         .m_171488_(0.0F, -7.0F, 2.0F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).m_171514_(0, 23)
/*  52 */         .m_171488_(0.0F, -6.0F, 5.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 0)
/*  53 */         .m_171488_(0.0F, -2.0F, 2.0F, 0.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).m_171514_(2, 15)
/*  54 */         .m_171488_(0.0F, -1.0F, 5.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  55 */         PartPose.m_171419_(0.0F, -5.7721F, -2.6047F));
/*  56 */     PartDefinition Mask = head.m_171599_("Mask", 
/*  57 */         CubeListBuilder.m_171558_().m_171514_(34, 21).m_171488_(-3.0F, 2.25F, -4.5F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(0, 2)
/*  58 */         .m_171488_(1.0F, 2.25F, -4.5F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(24, 19)
/*  59 */         .m_171488_(-1.0F, 1.75F, -4.5F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(40, 31)
/*  60 */         .m_171488_(3.0F, -3.0F, -4.5F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(24, 0)
/*  61 */         .m_171488_(-3.0F, -4.0F, -4.5F, 6.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(32, 11)
/*  62 */         .m_171488_(1.0F, 0.0F, -4.5F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(24, 18)
/*  63 */         .m_171488_(-3.0F, 0.0F, -4.5F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(16, 24)
/*  64 */         .m_171488_(-4.0F, -3.0F, -4.5F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(24, 16)
/*  65 */         .m_171488_(-6.0F, 0.0F, -4.5F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(22, 20)
/*  66 */         .m_171488_(-1.0F, -5.0F, -4.5F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(24, 17)
/*  67 */         .m_171488_(4.0F, 0.0F, -4.5F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(4, 2)
/*  68 */         .m_171488_(-5.0F, -1.0F, -4.5F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(6, 6)
/*  69 */         .m_171488_(4.0F, -1.0F, -4.5F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), 
/*  70 */         PartPose.m_171419_(0.0F, -5.7721F, -2.4797F));
/*  71 */     PartDefinition body = partdefinition.m_171599_("body", CubeListBuilder.m_171558_(), PartPose.m_171419_(0.0F, 24.0F, 0.0F));
/*  72 */     PartDefinition body_r1 = body.m_171599_("body_r1", 
/*  73 */         CubeListBuilder.m_171558_().m_171514_(0, 16).m_171488_(-3.5F, -12.0F, -2.125F, 7.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(40, 9)
/*  74 */         .m_171488_(-2.5F, -6.5F, -4.625F, 5.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(0, 24)
/*  75 */         .m_171488_(-3.0F, -8.0F, -3.0F, 6.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(44, 31)
/*  76 */         .m_171488_(-3.0F, -7.0F, -4.0F, 6.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(24, 42)
/*  77 */         .m_171488_(-3.0F, -1.0F, 2.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(19, 21).m_171488_(-3.0F, -8.0F, -1.0F, 6.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)), 
/*     */         
/*  79 */         PartPose.m_171423_(0.0F, -10.0F, 0.0F, 0.1745F, 0.0F, 0.0F));
/*  80 */     PartDefinition Crest2 = body.m_171599_("Crest2", CubeListBuilder.m_171558_(), PartPose.m_171419_(0.0F, -9.0F, 0.0F));
/*  81 */     PartDefinition body_r2 = Crest2.m_171599_("body_r2", 
/*  82 */         CubeListBuilder.m_171558_().m_171514_(14, 23).m_171488_(0.0F, -3.0F, 4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(6, 1)
/*  83 */         .m_171488_(0.0F, -5.0F, 3.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(16, 29)
/*  84 */         .m_171488_(0.0F, -8.0F, 4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 15)
/*  85 */         .m_171488_(0.0F, -10.0F, 3.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 0)
/*  86 */         .m_171488_(-1.5F, -6.125F, 1.375F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(44, 2)
/*  87 */         .m_171488_(-2.5F, -7.75F, 1.375F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 35)
/*  88 */         .m_171488_(-3.0F, -9.375F, 1.375F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(24, 33)
/*  89 */         .m_171488_(-3.375F, -9.5F, -2.375F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(32, 9)
/*  90 */         .m_171488_(1.375F, -9.5F, -2.375F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(24, 4)
/*  91 */         .m_171488_(-3.375F, -11.125F, -2.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(24, 6)
/*  92 */         .m_171488_(0.375F, -11.125F, -2.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(44, 0)
/*  93 */         .m_171488_(-3.0F, -11.0F, 1.375F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(38, 41).m_171488_(0.0F, -11.0F, 2.0F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), 
/*     */         
/*  95 */         PartPose.m_171423_(0.0F, -1.0F, 0.0F, 0.1745F, 0.0F, 0.0F));
/*  96 */     PartDefinition leg0 = partdefinition.m_171599_("leg0", 
/*  97 */         CubeListBuilder.m_171558_().m_171514_(28, 33).m_171488_(-2.0F, 4.75F, -1.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  98 */         PartPose.m_171419_(-2.25F, 14.25F, 3.0F));
/*  99 */     PartDefinition leg1_r1 = leg0.m_171599_("leg1_r1", 
/* 100 */         CubeListBuilder.m_171558_().m_171514_(40, 38).m_171488_(-3.25F, -3.5F, -2.0F, 3.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 101 */         PartPose.m_171423_(1.75F, 3.2057F, 0.1955F, 0.3927F, 0.0F, 0.0F));
/* 102 */     PartDefinition leg1 = partdefinition.m_171599_("leg1", 
/* 103 */         CubeListBuilder.m_171558_().m_171514_(12, 33).m_171488_(-2.0F, 4.75F, -1.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 104 */         PartPose.m_171419_(2.25F, 14.25F, 3.0F));
/* 105 */     PartDefinition leg2_r1 = leg1.m_171599_("leg2_r1", 
/* 106 */         CubeListBuilder.m_171558_().m_171514_(14, 42).m_171488_(1.25F, -3.5F, -2.0F, 3.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 107 */         PartPose.m_171423_(-2.75F, 3.2057F, 0.1955F, 0.3927F, 0.0F, 0.0F));
/* 108 */     PartDefinition leg2 = partdefinition.m_171599_("leg2", 
/* 109 */         CubeListBuilder.m_171558_().m_171514_(32, 0).m_171488_(-2.0F, 4.75F, -3.25F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 110 */         PartPose.m_171419_(-2.25F, 14.25F, -3.0F));
/* 111 */     PartDefinition leg3_r1 = leg2.m_171599_("leg3_r1", 
/* 112 */         CubeListBuilder.m_171558_().m_171514_(37, 21).m_171488_(-3.25F, -3.5F, -2.0F, 3.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 113 */         PartPose.m_171423_(1.75F, 3.2057F, -0.4455F, -0.3927F, 0.0F, 0.0F));
/* 114 */     PartDefinition leg3 = partdefinition.m_171599_("leg3", 
/* 115 */         CubeListBuilder.m_171558_().m_171514_(28, 12).m_171488_(-2.0F, 4.75F, -3.25F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 116 */         PartPose.m_171419_(2.25F, 14.25F, -3.0F));
/* 117 */     PartDefinition leg4_r1 = leg3.m_171599_("leg4_r1", 
/* 118 */         CubeListBuilder.m_171558_().m_171514_(0, 38).m_171488_(1.25F, -3.5F, -2.0F, 3.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 119 */         PartPose.m_171423_(-2.75F, 3.2057F, -0.4455F, -0.3927F, 0.0F, 0.0F));
/* 120 */     return LayerDefinition.m_171565_(meshdefinition, 64, 64);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void m_7695_(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 126 */     this.head.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 127 */     this.body.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 128 */     this.leg0.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 129 */     this.leg1.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 130 */     this.leg2.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 131 */     this.leg3.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */   
/*     */   public void m_6973_(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
/* 135 */     this.head.f_104204_ = netHeadYaw / 57.295776F;
/* 136 */     this.head.f_104203_ = headPitch / 57.295776F;
/* 137 */     this.leg0.f_104203_ = Mth.m_14089_(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
/* 138 */     this.leg1.f_104203_ = Mth.m_14089_(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
/* 139 */     this.leg2.f_104203_ = Mth.m_14089_(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
/* 140 */     this.leg3.f_104203_ = Mth.m_14089_(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\client\model\ModelDark_latex_creeper.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */