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
/*     */ public class ModelDrone_Hertx_Sit<T extends Entity>
/*     */   extends EntityModel<T>
/*     */ {
/*  24 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("turned", "model_drone_hertx_sit"), "main");
/*     */   public final ModelPart Head;
/*     */   public final ModelPart Body;
/*     */   public final ModelPart Tail;
/*     */   public final ModelPart RightArm;
/*     */   public final ModelPart LeftArm;
/*     */   public final ModelPart RightLeg;
/*     */   public final ModelPart LeftLeg;
/*     */   
/*     */   public ModelDrone_Hertx_Sit(ModelPart root) {
/*  34 */     this.Head = root.m_171324_("Head");
/*  35 */     this.Body = root.m_171324_("Body");
/*  36 */     this.Tail = root.m_171324_("Tail");
/*  37 */     this.RightArm = root.m_171324_("RightArm");
/*  38 */     this.LeftArm = root.m_171324_("LeftArm");
/*  39 */     this.RightLeg = root.m_171324_("RightLeg");
/*  40 */     this.LeftLeg = root.m_171324_("LeftLeg");
/*     */   }
/*     */   
/*     */   public static LayerDefinition createBodyLayer() {
/*  44 */     MeshDefinition meshdefinition = new MeshDefinition();
/*  45 */     PartDefinition partdefinition = meshdefinition.m_171576_();
/*  46 */     PartDefinition Head = partdefinition.m_171599_("Head", 
/*  47 */         CubeListBuilder.m_171558_().m_171514_(15, 0).m_171488_(-3.0F, -1.3F, -5.0F, 6.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).m_171514_(34, 0)
/*  48 */         .m_171488_(-2.0F, -2.4F, -3.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(0, 59)
/*  49 */         .m_171488_(-2.0F, -6.4F, 2.0F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(16, 23)
/*  50 */         .m_171488_(-1.5F, -6.9F, -4.5F, 3.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).m_171514_(15, 8)
/*  51 */         .m_171488_(-2.0F, -2.4F, 3.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(32, 14)
/*  52 */         .m_171488_(-3.0F, -2.4F, 2.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(32, 8)
/*  53 */         .m_171488_(-3.0F, -0.275F, -2.275F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(15, 5)
/*  54 */         .m_171488_(-1.0F, -0.15F, -2.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(15, 0)
/*  55 */         .m_171488_(2.0F, -6.4F, 2.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 13)
/*  56 */         .m_171488_(-3.0F, -6.4F, 2.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 13)
/*  57 */         .m_171488_(-3.0F, -6.4F, -5.0F, 6.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).m_171514_(47, 7)
/*  58 */         .m_171488_(2.0F, -5.4F, -5.0F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).m_171514_(47, 28)
/*  59 */         .m_171488_(2.0F, -2.3F, -5.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).m_171514_(46, 38)
/*  60 */         .m_171488_(-3.0F, -5.4F, -5.0F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).m_171514_(28, 55)
/*  61 */         .m_171488_(-3.0F, -2.3F, -5.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).m_171514_(30, 27)
/*  62 */         .m_171488_(-2.0F, -5.4F, -5.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(20, 21)
/*  63 */         .m_171488_(-2.0F, -2.3F, -5.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  64 */         PartPose.m_171419_(0.0F, 10.0F, -0.2F));
/*  65 */     PartDefinition Antenna = Head.m_171599_("Antenna", CubeListBuilder.m_171558_(), PartPose.m_171419_(0.0F, -6.1528F, 3.0874F));
/*  66 */     PartDefinition cube_r1 = Antenna.m_171599_("cube_r1", 
/*  67 */         CubeListBuilder.m_171558_().m_171514_(56, 53).m_171488_(0.0F, -2.75F, -1.25F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(37, 55)
/*  68 */         .m_171488_(-6.5F, -2.75F, -1.25F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(0, 0)
/*  69 */         .m_171488_(-6.5F, -3.75F, -5.25F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(55, 60).m_171488_(0.0F, -3.75F, -5.25F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), 
/*     */         
/*  71 */         PartPose.m_171423_(2.75F, 0.3511F, 2.7389F, 1.3526F, 0.0F, 0.0F));
/*  72 */     PartDefinition Body = partdefinition.m_171599_("Body", 
/*  73 */         CubeListBuilder.m_171558_().m_171514_(0, 21).m_171488_(-4.0F, 0.2F, -2.0F, 8.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(0, 32)
/*  74 */         .m_171488_(-4.0F, 10.2F, -2.0F, 8.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(30, 19).m_171488_(-3.625F, 6.2F, -2.0F, 7.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), 
/*     */         
/*  76 */         PartPose.m_171423_(0.0F, 10.0F, 0.0F, -0.1309F, 0.0F, 0.0F));
/*  77 */     PartDefinition Tail = partdefinition.m_171599_("Tail", CubeListBuilder.m_171558_(), 
/*  78 */         PartPose.m_171423_(0.0F, 22.0F, 0.0F, 0.5672F, 0.0F, 0.0F));
/*  79 */     PartDefinition cube_r2 = Tail.m_171599_("cube_r2", 
/*  80 */         CubeListBuilder.m_171558_().m_171514_(0, 6).m_171488_(-1.25F, 10.3026F, 24.6391F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 1)
/*  81 */         .m_171488_(-0.25F, 10.8026F, 25.6391F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(0, 0)
/*  82 */         .m_171488_(1.75F, 10.8026F, 25.6391F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(6, 0)
/*  83 */         .m_171488_(-0.25F, 12.8026F, 25.6391F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(6, 1)
/*  84 */         .m_171488_(1.75F, 12.8026F, 25.6391F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(19, 8)
/*  85 */         .m_171488_(-0.25F, 11.3026F, 15.6391F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), 
/*  86 */         PartPose.m_171423_(-0.75F, -10.3628F, -1.0141F, -0.3927F, 0.0F, 0.0F));
/*  87 */     PartDefinition cube_r3 = Tail.m_171599_("cube_r3", 
/*  88 */         CubeListBuilder.m_171558_().m_171514_(0, 0).m_171488_(-0.25F, 4.2F, 7.0F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), 
/*  89 */         PartPose.m_171423_(-0.75F, -9.2F, 0.0F, -0.7854F, 0.0F, 0.0F));
/*  90 */     PartDefinition RightArm = partdefinition.m_171599_("RightArm", 
/*  91 */         CubeListBuilder.m_171558_().m_171514_(14, 52).m_171488_(-1.0F, -1.8F, -2.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(56, 9)
/*  92 */         .m_171488_(-1.0F, -2.8F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(0, 38)
/*  93 */         .m_171488_(-1.0F, 5.2F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(26, 19)
/*  94 */         .m_171488_(0.0F, 11.2F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(6, 0)
/*  95 */         .m_171488_(2.0F, 11.2F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 0)
/*  96 */         .m_171488_(2.0F, 11.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(20, 23).m_171488_(2.0F, 11.2F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*     */         
/*  98 */         PartPose.m_171423_(5.0F, 13.0F, 0.125F, 0.0F, -0.48F, -0.2618F));
/*  99 */     PartDefinition LeftArm = partdefinition.m_171599_("LeftArm", 
/* 100 */         CubeListBuilder.m_171558_().m_171514_(52, 17).m_171488_(-2.0F, -1.8F, -2.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(47, 59)
/* 101 */         .m_171488_(-1.0F, -2.8F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(24, 32)
/* 102 */         .m_171488_(-3.0F, 5.2F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(32, 10)
/* 103 */         .m_171488_(-3.0F, 11.2F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(32, 8)
/* 104 */         .m_171488_(-3.0F, 11.2F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(29, 20)
/* 105 */         .m_171488_(-1.0F, 11.2F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 31).m_171488_(-3.0F, 11.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*     */         
/* 107 */         PartPose.m_171423_(-5.0F, 13.0F, 0.125F, 0.0F, 0.3491F, 0.3054F));
/* 108 */     PartDefinition RightLeg = partdefinition.m_171599_("RightLeg", 
/* 109 */         CubeListBuilder.m_171558_().m_171514_(56, 28).m_171488_(-2.0F, -0.8F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(35, 37)
/* 110 */         .m_171488_(-1.625F, 10.0F, -2.9102F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(23, 13)
/* 111 */         .m_171488_(1.375F, 11.0F, -3.9102F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 21)
/* 112 */         .m_171488_(-1.625F, 11.0F, -3.9102F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 113 */         PartPose.m_171423_(2.0F, 23.0F, -1.0F, -1.6844F, -0.3829F, -0.0894F));
/* 114 */     PartDefinition cube_r4 = RightLeg.m_171599_("cube_r4", 
/* 115 */         CubeListBuilder.m_171558_().m_171514_(56, 0).m_171488_(-2.0F, 4.3F, 3.0F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 116 */         PartPose.m_171423_(0.25F, 1.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 117 */     PartDefinition cube_r5 = RightLeg.m_171599_("cube_r5", 
/* 118 */         CubeListBuilder.m_171558_().m_171514_(48, 48).m_171488_(0.5625F, -3.5F, -2.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 119 */         PartPose.m_171423_(-1.9375F, 6.0735F, -0.1237F, 0.7418F, 0.0F, 0.0F));
/* 120 */     PartDefinition cube_r6 = RightLeg.m_171599_("cube_r6", 
/* 121 */         CubeListBuilder.m_171558_().m_171514_(32, 45).m_171488_(-2.0F, -0.6F, -2.2F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 122 */         PartPose.m_171423_(0.125F, 1.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 123 */     PartDefinition LeftLeg = partdefinition.m_171599_("LeftLeg", 
/* 124 */         CubeListBuilder.m_171558_().m_171514_(58, 45).m_171488_(-2.0F, -0.8F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(36, 27)
/* 125 */         .m_171488_(-2.375F, 10.0F, -2.9102F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(3, 17)
/* 126 */         .m_171488_(0.625F, 11.0F, -3.9102F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(19, 13)
/* 127 */         .m_171488_(-2.375F, 11.0F, -3.9102F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 128 */         PartPose.m_171423_(-2.0F, 23.0F, -1.0F, -1.6325F, 0.2955F, 0.2562F));
/* 129 */     PartDefinition cube_r7 = LeftLeg.m_171599_("cube_r7", 
/* 130 */         CubeListBuilder.m_171558_().m_171514_(55, 36).m_171488_(-2.0F, 4.3F, 3.0F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 131 */         PartPose.m_171423_(-0.25F, 1.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 132 */     PartDefinition cube_r8 = LeftLeg.m_171599_("cube_r8", 
/* 133 */         CubeListBuilder.m_171558_().m_171514_(0, 48).m_171488_(-3.5625F, -3.5F, -2.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 134 */         PartPose.m_171423_(1.8125F, 6.0735F, -0.1237F, 0.7418F, 0.0F, 0.0F));
/* 135 */     PartDefinition cube_r9 = LeftLeg.m_171599_("cube_r9", 
/* 136 */         CubeListBuilder.m_171558_().m_171514_(16, 42).m_171488_(-2.0F, -0.6F, -2.2F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 137 */         PartPose.m_171423_(-0.125F, 1.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 138 */     return LayerDefinition.m_171565_(meshdefinition, 80, 80);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void m_7695_(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 144 */     this.Head.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 145 */     this.Body.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 146 */     this.Tail.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 147 */     this.RightArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 148 */     this.LeftArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 149 */     this.RightLeg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 150 */     this.LeftLeg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */   
/*     */   public void m_6973_(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
/* 154 */     this.Head.f_104204_ = netHeadYaw / 57.295776F;
/* 155 */     this.Head.f_104203_ = headPitch / 57.295776F;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\client\model\ModelDrone_Hertx_Sit.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */