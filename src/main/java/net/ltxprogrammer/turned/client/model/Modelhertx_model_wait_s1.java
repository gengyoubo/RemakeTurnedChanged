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
/*     */ public class Modelhertx_model_wait_s1<T extends Entity>
/*     */   extends EntityModel<T>
/*     */ {
/*  24 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("turned", "modelhertx_model_wait_s_1"), "main");
/*     */   
/*     */   public final ModelPart Head;
/*     */   public final ModelPart Body;
/*     */   public final ModelPart Tail;
/*     */   public final ModelPart LeftArm;
/*     */   public final ModelPart RightArm;
/*     */   public final ModelPart LeftLeg;
/*     */   public final ModelPart RightLeg;
/*     */   
/*     */   public Modelhertx_model_wait_s1(ModelPart root) {
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
/*  48 */         CubeListBuilder.m_171558_().m_171514_(24, 0).m_171488_(-3.0F, -3.7F, -5.0F, 6.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).m_171514_(56, 47)
/*  49 */         .m_171488_(-2.0F, -4.8F, -3.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(18, 60)
/*  50 */         .m_171488_(-2.0F, -8.8F, 2.0F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).m_171514_(42, 11)
/*  51 */         .m_171488_(-2.0F, -4.8F, 3.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(14, 30)
/*  52 */         .m_171488_(-3.0F, -4.8F, 2.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(24, 8)
/*  53 */         .m_171488_(-3.0F, -2.8F, -2.9F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(24, 4)
/*  54 */         .m_171488_(-1.0F, -2.55F, -3.15F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(36, 22)
/*  55 */         .m_171488_(2.0F, -8.8F, 2.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(35, 30)
/*  56 */         .m_171488_(-3.0F, -8.8F, 2.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(17, 22)
/*  57 */         .m_171488_(-3.0F, -8.8F, -5.0F, 6.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).m_171514_(0, 53)
/*  58 */         .m_171488_(2.0F, -7.8F, -5.0F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).m_171514_(25, 60)
/*  59 */         .m_171488_(2.0F, -4.7F, -5.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).m_171514_(50, 30)
/*  60 */         .m_171488_(-3.0F, -7.8F, -5.0F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).m_171514_(9, 60)
/*  61 */         .m_171488_(-3.0F, -4.7F, -5.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).m_171514_(59, 28)
/*  62 */         .m_171488_(-3.25F, -4.5125F, -4.625F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).m_171514_(58, 0)
/*  63 */         .m_171488_(2.25F, -4.5125F, -4.625F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).m_171514_(20, 0)
/*  64 */         .m_171488_(-2.0F, -7.8F, -5.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(28, 41)
/*  65 */         .m_171488_(-2.0F, -4.7F, -5.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(54, 54)
/*  66 */         .m_171488_(-1.0F, -4.5125F, -5.1875F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), 
/*  67 */         PartPose.m_171419_(0.0F, 0.4F, -0.2F));
/*  68 */     PartDefinition bone = Head.m_171599_("bone", CubeListBuilder.m_171558_(), 
/*  69 */         PartPose.m_171423_(0.0F, -8.3F, -1.5F, 0.4276F, 0.0F, 0.0F));
/*  70 */     PartDefinition cube_r1 = Head.m_171599_("cube_r1", 
/*  71 */         CubeListBuilder.m_171558_().m_171514_(0, 33).m_171488_(-3.125F, -7.4142F, 9.2505F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
/*  72 */         .m_171514_(67, 16).m_171488_(-3.125F, -7.4142F, 4.2505F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(0, 0)
/*  73 */         .m_171488_(2.125F, -7.4142F, 9.2505F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 63)
/*  74 */         .m_171488_(2.125F, -7.4142F, 4.2505F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), 
/*  75 */         PartPose.m_171423_(0.0F, 0.0F, 1.125F, 0.4712F, 0.0F, 0.0F));
/*  76 */     PartDefinition Body = partdefinition.m_171599_("Body", 
/*  77 */         CubeListBuilder.m_171558_().m_171514_(0, 0).m_171488_(-4.0F, -1.8F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(0, 16)
/*  78 */         .m_171488_(-3.0F, -0.05F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(48, 60)
/*  79 */         .m_171488_(-4.25F, 3.2F, -3.5F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(34, 60)
/*  80 */         .m_171488_(2.25F, 3.2F, -3.5F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(0, 28)
/*  81 */         .m_171488_(-1.0F, 3.2F, -3.5F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(28, 39)
/*  82 */         .m_171488_(-2.5F, 3.2F, 2.25F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(14, 33)
/*  83 */         .m_171488_(-2.5F, 0.95F, 2.25F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(24, 8)
/*  84 */         .m_171488_(2.8125F, 0.95F, 1.8125F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(18, 16)
/*  85 */         .m_171488_(-3.8125F, 0.95F, 1.8125F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(18, 16)
/*  86 */         .m_171488_(-4.5F, 4.2F, -2.5F, 9.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(53, 62)
/*  87 */         .m_171488_(-3.5F, -2.05F, -2.5F, 1.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(41, 60)
/*  88 */         .m_171488_(2.5F, -2.05F, -2.5F, 1.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), 
/*  89 */         PartPose.m_171419_(0.0F, 0.0F, 0.0F));
/*  90 */     PartDefinition Tail = partdefinition.m_171599_("Tail", CubeListBuilder.m_171558_(), 
/*  91 */         PartPose.m_171423_(0.0F, 9.0F, 0.0F, -0.2618F, 0.0F, 0.0F));
/*  92 */     PartDefinition cube_r2 = Tail.m_171599_("cube_r2", CubeListBuilder.m_171558_(), 
/*  93 */         PartPose.m_171423_(0.0F, -9.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/*  94 */     PartDefinition cube_r3 = Tail.m_171599_("cube_r3", 
/*  95 */         CubeListBuilder.m_171558_().m_171514_(0, 28).m_171488_(-1.3F, 4.2F, 7.0F, 3.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).m_171514_(22, 30)
/*  96 */         .m_171488_(-1.3F, 5.2F, 15.0F, 3.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), 
/*  97 */         PartPose.m_171423_(0.0F, -9.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
/*  98 */     PartDefinition LeftArm = partdefinition.m_171599_("LeftArm", 
/*  99 */         CubeListBuilder.m_171558_().m_171514_(0, 39).m_171488_(-3.0F, -3.8F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(45, 3)
/* 100 */         .m_171488_(-3.25F, -4.05F, -2.5F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 101 */         PartPose.m_171423_(-4.25F, 2.375F, -2.0F, -0.7734F, -0.1536F, -0.1555F));
/* 102 */     PartDefinition bone2 = LeftArm.m_171599_("bone2", 
/* 103 */         CubeListBuilder.m_171558_().m_171514_(54, 11).m_171488_(5.2918F, -2.6603F, -1.7F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(16, 39)
/* 104 */         .m_171488_(5.2918F, 3.3397F, 1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(12, 39)
/* 105 */         .m_171488_(5.2918F, 3.3397F, -1.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 39)
/* 106 */         .m_171488_(7.2918F, 3.3397F, -1.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(36, 27).m_171488_(5.2918F, 3.3397F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*     */         
/* 108 */         PartPose.m_171423_(-1.8F, 10.0F, -0.3F, 0.0F, 0.0F, -1.309F));
/* 109 */     PartDefinition RightArm = partdefinition.m_171599_("RightArm", 
/* 110 */         CubeListBuilder.m_171558_().m_171514_(41, 17).m_171488_(-0.75F, -4.05F, -2.5F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(38, 38)
/* 111 */         .m_171488_(-1.0F, -3.8F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 112 */         PartPose.m_171423_(4.25F, 2.125F, -2.0F, -0.7777F, 0.1231F, 0.124F));
/* 113 */     PartDefinition bone3 = RightArm.m_171599_("bone3", 
/* 114 */         CubeListBuilder.m_171558_().m_171514_(44, 50).m_171488_(-13.2516F, -17.1828F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F))
/* 115 */         .m_171514_(35, 35).m_171488_(-12.2516F, -11.1828F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(22, 35)
/* 116 */         .m_171488_(-10.2516F, -11.1828F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(25, 34)
/* 117 */         .m_171488_(-10.2516F, -11.1828F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(4, 33)
/* 118 */         .m_171488_(-10.2516F, -11.1828F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 119 */         PartPose.m_171423_(-5.0F, 22.0F, 0.0F, 0.0F, 0.0F, 0.9163F));
/* 120 */     PartDefinition LeftLeg = partdefinition.m_171599_("LeftLeg", 
/* 121 */         CubeListBuilder.m_171558_().m_171514_(66, 8).m_171488_(-2.0F, -1.8F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(0, 16)
/* 122 */         .m_171488_(-1.625F, -1.8F, 1.75F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(54, 40).m_171488_(-2.0F, 10.0F, -2.9102F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), 
/*     */         
/* 124 */         PartPose.m_171423_(-2.0F, 12.0F, 0.0F, 0.0F, 0.0F, 0.0436F));
/* 125 */     PartDefinition cube_r4 = LeftLeg.m_171599_("cube_r4", 
/* 126 */         CubeListBuilder.m_171558_().m_171514_(67, 36).m_171488_(-2.0F, 4.3F, 3.0F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 127 */         PartPose.m_171423_(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 128 */     PartDefinition cube_r5 = LeftLeg.m_171599_("cube_r5", 
/* 129 */         CubeListBuilder.m_171558_().m_171514_(39, 26).m_171488_(-2.0F, 0.0F, -5.8F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 130 */         PartPose.m_171423_(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
/* 131 */     PartDefinition cube_r6 = LeftLeg.m_171599_("cube_r6", 
/* 132 */         CubeListBuilder.m_171558_().m_171514_(28, 50).m_171488_(-2.0F, -0.6F, -2.2F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 133 */         PartPose.m_171423_(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 134 */     PartDefinition RightLeg = partdefinition.m_171599_("RightLeg", 
/* 135 */         CubeListBuilder.m_171558_().m_171514_(64, 53).m_171488_(-2.0F, -1.8F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(54, 21)
/* 136 */         .m_171488_(-2.0F, 10.0F, -2.9102F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 137 */         PartPose.m_171423_(2.0F, 12.0F, 0.0F, 0.0F, 0.0F, -0.0436F));
/* 138 */     PartDefinition cube_r7 = RightLeg.m_171599_("cube_r7", 
/* 139 */         CubeListBuilder.m_171558_().m_171514_(65, 65).m_171488_(-2.0F, 4.3F, 3.0F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 140 */         PartPose.m_171423_(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 141 */     PartDefinition cube_r8 = RightLeg.m_171599_("cube_r8", 
/* 142 */         CubeListBuilder.m_171558_().m_171514_(16, 39).m_171488_(-2.0F, 0.0F, -5.8F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 143 */         PartPose.m_171423_(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
/* 144 */     PartDefinition cube_r9 = RightLeg.m_171599_("cube_r9", 
/* 145 */         CubeListBuilder.m_171558_().m_171514_(12, 50).m_171488_(-2.0F, -0.6F, -2.2F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 146 */         PartPose.m_171423_(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 147 */     return LayerDefinition.m_171565_(meshdefinition, 128, 128);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void m_7695_(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 153 */     this.Head.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 154 */     this.Body.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 155 */     this.Tail.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 156 */     this.LeftArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 157 */     this.RightArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 158 */     this.LeftLeg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 159 */     this.RightLeg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */   
/*     */   public void m_6973_(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
/* 163 */     this.Head.f_104204_ = netHeadYaw / 57.295776F;
/* 164 */     this.Head.f_104203_ = headPitch / 57.295776F;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\client\model\Modelhertx_model_wait_s1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */