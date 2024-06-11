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
/*     */ public class Modelhertx_model<T extends Entity>
/*     */   extends EntityModel<T>
/*     */ {
/*  25 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("turned", "modelhertx_model"), "main");
/*     */   public final ModelPart Head;
/*     */   public final ModelPart Body;
/*     */   public final ModelPart Tail;
/*     */   public final ModelPart LeftArm;
/*     */   public final ModelPart RightArm;
/*     */   public final ModelPart LeftLeg;
/*     */   public final ModelPart RightLeg;
/*     */   
/*     */   public Modelhertx_model(ModelPart root) {
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
/*  48 */         CubeListBuilder.m_171558_().m_171514_(24, 24).m_171488_(-3.0F, -3.7F, -5.0F, 6.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).m_171514_(18, 54)
/*  49 */         .m_171488_(-2.0F, -4.8F, -3.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(0, 60)
/*  50 */         .m_171488_(-2.0F, -8.8F, 2.0F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).m_171514_(20, 16)
/*  51 */         .m_171488_(-2.0F, -4.8F, 3.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(19, 8)
/*  52 */         .m_171488_(-3.0F, -4.8F, 2.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(24, 16)
/*  53 */         .m_171488_(-3.0F, -2.8F, -2.9F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(7, 0)
/*  54 */         .m_171488_(2.0F, -8.8F, 2.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 0)
/*  55 */         .m_171488_(-3.0F, -8.8F, 2.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(19, 0)
/*  56 */         .m_171488_(-3.0F, -8.8F, -5.0F, 6.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).m_171514_(50, 8)
/*  57 */         .m_171488_(2.0F, -7.8F, -5.0F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).m_171514_(32, 8)
/*  58 */         .m_171488_(2.0F, -4.7F, -5.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).m_171514_(48, 29)
/*  59 */         .m_171488_(-3.0F, -7.8F, -5.0F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).m_171514_(57, 57)
/*  60 */         .m_171488_(-3.0F, -4.7F, -5.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).m_171514_(0, 8)
/*  61 */         .m_171488_(-2.0F, -7.8F, -5.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(13, 32)
/*  62 */         .m_171488_(-2.0F, -4.7F, -5.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  63 */         PartPose.m_171419_(0.0F, 0.4F, -0.2F));
/*  64 */     PartDefinition cube_r1 = Head.m_171599_("cube_r1", 
/*  65 */         CubeListBuilder.m_171558_().m_171514_(19, 0).m_171488_(-3.0F, -7.4142F, 9.2505F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 0)
/*  66 */         .m_171488_(-3.0F, -7.4142F, 4.2505F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(0, 16)
/*  67 */         .m_171488_(2.0F, -7.4142F, 9.2505F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(14, 60).m_171488_(2.0F, -7.4142F, 4.2505F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), 
/*     */         
/*  69 */         PartPose.m_171423_(0.0F, 0.0F, 0.0F, 0.2618F, 0.0F, 0.0F));
/*  70 */     PartDefinition Body = partdefinition.m_171599_("Body", 
/*  71 */         CubeListBuilder.m_171558_().m_171514_(0, 16).m_171488_(-4.0F, -1.8F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(52, 39)
/*  72 */         .m_171488_(-4.0F, -1.8F, -3.0F, 8.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(19, 11)
/*  73 */         .m_171488_(-3.0F, 4.2F, -3.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  74 */         PartPose.m_171419_(0.0F, 0.0F, 0.0F));
/*  75 */     PartDefinition Tail = partdefinition.m_171599_("Tail", CubeListBuilder.m_171558_(), PartPose.m_171419_(0.0F, 0.0F, 0.0F));
/*  76 */     PartDefinition cube_r2 = Tail.m_171599_("cube_r2", 
/*  77 */         CubeListBuilder.m_171558_().m_171514_(0, 32).m_171488_(-1.3F, 11.3026F, 15.6391F, 3.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), 
/*  78 */         PartPose.m_171423_(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/*  79 */     PartDefinition cube_r3 = Tail.m_171599_("cube_r3", 
/*  80 */         CubeListBuilder.m_171558_().m_171514_(0, 0).m_171488_(-1.3F, 4.2F, 7.0F, 3.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)), 
/*  81 */         PartPose.m_171423_(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
/*  82 */     PartDefinition LeftArm = partdefinition.m_171599_("LeftArm", 
/*  83 */         CubeListBuilder.m_171558_().m_171514_(36, 36).m_171488_(-3.0F, -3.8F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(16, 44)
/*  84 */         .m_171488_(-3.0F, 4.2F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(24, 26)
/*  85 */         .m_171488_(-3.0F, 10.2F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(24, 19)
/*  86 */         .m_171488_(-3.0F, 10.2F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(22, 4)
/*  87 */         .m_171488_(-1.0F, 10.2F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(24, 24)
/*  88 */         .m_171488_(-3.0F, 10.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  89 */         PartPose.m_171419_(-5.0F, 2.0F, 0.0F));
/*  90 */     PartDefinition RightArm = partdefinition.m_171599_("RightArm", 
/*  91 */         CubeListBuilder.m_171558_().m_171514_(20, 32).m_171488_(-1.0F, -3.8F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(44, 19)
/*  92 */         .m_171488_(-1.0F, 4.2F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(22, 2)
/*  93 */         .m_171488_(0.0F, 10.2F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(19, 3)
/*  94 */         .m_171488_(2.0F, 10.2F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(9, 11)
/*  95 */         .m_171488_(2.0F, 10.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(19, 5)
/*  96 */         .m_171488_(2.0F, 10.2F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  97 */         PartPose.m_171419_(5.0F, 2.0F, 0.0F));
/*  98 */     PartDefinition LeftLeg = partdefinition.m_171599_("LeftLeg", 
/*  99 */         CubeListBuilder.m_171558_().m_171514_(59, 7).m_171488_(-2.0F, -1.8F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
/* 100 */         .m_171514_(0, 53).m_171488_(-2.0F, 10.0F, -2.9102F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 101 */         PartPose.m_171419_(-2.0F, 12.0F, 0.0F));
/* 102 */     PartDefinition cube_r4 = LeftLeg.m_171599_("cube_r4", 
/* 103 */         CubeListBuilder.m_171558_().m_171514_(57, 26).m_171488_(-2.0F, 4.3F, 3.0F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 104 */         PartPose.m_171423_(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 105 */     PartDefinition cube_r5 = LeftLeg.m_171599_("cube_r5", 
/* 106 */         CubeListBuilder.m_171558_().m_171514_(41, 4).m_171488_(-2.0F, 0.0F, -5.8F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 107 */         PartPose.m_171423_(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
/* 108 */     PartDefinition cube_r6 = LeftLeg.m_171599_("cube_r6", 
/* 109 */         CubeListBuilder.m_171558_().m_171514_(32, 48).m_171488_(-2.0F, -0.6F, -2.2F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 110 */         PartPose.m_171423_(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 111 */     PartDefinition RightLeg = partdefinition.m_171599_("RightLeg", 
/* 112 */         CubeListBuilder.m_171558_().m_171514_(47, 58).m_171488_(-2.0F, -1.8F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
/* 113 */         .m_171514_(53, 0).m_171488_(-2.0F, 10.0F, -2.9102F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 114 */         PartPose.m_171419_(2.0F, 12.0F, 0.0F));
/* 115 */     PartDefinition cube_r7 = RightLeg.m_171599_("cube_r7", 
/* 116 */         CubeListBuilder.m_171558_().m_171514_(33, 58).m_171488_(-2.0F, 4.3F, 3.0F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 117 */         PartPose.m_171423_(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 118 */     PartDefinition cube_r8 = RightLeg.m_171599_("cube_r8", 
/* 119 */         CubeListBuilder.m_171558_().m_171514_(0, 42).m_171488_(-2.0F, 0.0F, -5.8F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 120 */         PartPose.m_171423_(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
/* 121 */     PartDefinition cube_r9 = RightLeg.m_171599_("cube_r9", 
/* 122 */         CubeListBuilder.m_171558_().m_171514_(48, 48).m_171488_(-2.0F, -0.6F, -2.2F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 123 */         PartPose.m_171423_(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 124 */     return LayerDefinition.m_171565_(meshdefinition, 128, 128);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void m_7695_(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 130 */     this.Head.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 131 */     this.Body.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 132 */     this.Tail.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 133 */     this.LeftArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 134 */     this.RightArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 135 */     this.LeftLeg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 136 */     this.RightLeg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */   
/*     */   public void m_6973_(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
/* 140 */     this.RightArm.f_104203_ = Mth.m_14089_(limbSwing * 0.6662F + 3.1415927F) * limbSwingAmount;
/* 141 */     this.LeftLeg.f_104203_ = Mth.m_14089_(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
/* 142 */     this.Head.f_104204_ = netHeadYaw / 57.295776F;
/* 143 */     this.Head.f_104203_ = headPitch / 57.295776F;
/* 144 */     this.LeftArm.f_104203_ = Mth.m_14089_(limbSwing * 0.6662F) * limbSwingAmount;
/* 145 */     this.RightLeg.f_104203_ = Mth.m_14089_(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\client\model\Modelhertx_model.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */