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
/*     */ public class Modelhertx_model_sit<T extends Entity>
/*     */   extends EntityModel<T>
/*     */ {
/*  24 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("turned", "modelhertx_model_sit"), "main");
/*     */   public final ModelPart Head;
/*     */   public final ModelPart Body;
/*     */   public final ModelPart Tail;
/*     */   public final ModelPart LeftArm;
/*     */   public final ModelPart RightArm;
/*     */   public final ModelPart LeftLeg;
/*     */   public final ModelPart RightLeg;
/*     */   
/*     */   public Modelhertx_model_sit(ModelPart root) {
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
/*  47 */         CubeListBuilder.m_171558_().m_171514_(24, 24).m_171488_(-3.0F, 5.3F, -5.0F, 6.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).m_171514_(18, 54)
/*  48 */         .m_171488_(-2.0F, 4.2F, -3.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(0, 60)
/*  49 */         .m_171488_(-2.0F, 0.2F, 2.0F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).m_171514_(20, 16)
/*  50 */         .m_171488_(-2.0F, 4.2F, 3.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(19, 8)
/*  51 */         .m_171488_(-3.0F, 4.2F, 2.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(24, 16)
/*  52 */         .m_171488_(-3.0F, 6.2F, -2.9F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(7, 0)
/*  53 */         .m_171488_(2.0F, 0.2F, 2.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 0)
/*  54 */         .m_171488_(-3.0F, 0.2F, 2.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(19, 0)
/*  55 */         .m_171488_(-3.0F, 0.2F, -5.0F, 6.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).m_171514_(50, 8)
/*  56 */         .m_171488_(2.0F, 1.2F, -5.0F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).m_171514_(32, 8)
/*  57 */         .m_171488_(2.0F, 4.3F, -5.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).m_171514_(48, 29)
/*  58 */         .m_171488_(-3.0F, 1.2F, -5.0F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).m_171514_(57, 57)
/*  59 */         .m_171488_(-3.0F, 4.3F, -5.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).m_171514_(0, 8)
/*  60 */         .m_171488_(-2.0F, 1.2F, -5.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(13, 32)
/*  61 */         .m_171488_(-2.0F, 4.3F, -5.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  62 */         PartPose.m_171419_(0.0F, 0.4F, -0.2F));
/*  63 */     PartDefinition cube_r1 = Head.m_171599_("cube_r1", 
/*  64 */         CubeListBuilder.m_171558_().m_171514_(19, 0).m_171488_(-3.0F, 1.2791F, 6.9211F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 0)
/*  65 */         .m_171488_(-3.0F, 1.2791F, 1.9211F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(0, 16)
/*  66 */         .m_171488_(2.0F, 1.2791F, 6.9211F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(14, 60).m_171488_(2.0F, 1.2791F, 1.9211F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), 
/*     */         
/*  68 */         PartPose.m_171423_(0.0F, 0.0F, 0.0F, 0.2618F, 0.0F, 0.0F));
/*  69 */     PartDefinition Body = partdefinition.m_171599_("Body", 
/*  70 */         CubeListBuilder.m_171558_().m_171514_(0, 16).m_171488_(-4.0F, 7.2F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(52, 39)
/*  71 */         .m_171488_(-4.0F, 7.2F, -3.0F, 8.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(19, 11)
/*  72 */         .m_171488_(-3.0F, 13.2F, -3.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  73 */         PartPose.m_171419_(0.0F, 0.0F, 0.0F));
/*  74 */     PartDefinition Tail = partdefinition.m_171599_("Tail", CubeListBuilder.m_171558_(), 
/*  75 */         PartPose.m_171423_(0.0F, 11.0F, 0.0F, 0.6109F, 0.0F, 0.0F));
/*  76 */     PartDefinition cube_r2 = Tail.m_171599_("cube_r2", 
/*  77 */         CubeListBuilder.m_171558_().m_171514_(0, 32).m_171488_(-1.3F, 20.0893F, 13.6912F, 3.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), 
/*  78 */         PartPose.m_171423_(0.0F, -10.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/*  79 */     PartDefinition cube_r3 = Tail.m_171599_("cube_r3", 
/*  80 */         CubeListBuilder.m_171558_().m_171514_(0, 0).m_171488_(-1.3F, 13.0633F, 8.5628F, 3.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)), 
/*  81 */         PartPose.m_171423_(0.0F, -10.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
/*  82 */     PartDefinition LeftArm = partdefinition.m_171599_("LeftArm", 
/*  83 */         CubeListBuilder.m_171558_().m_171514_(36, 36).m_171488_(-2.1472F, -1.4133F, -2.0884F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F))
/*  84 */         .m_171514_(16, 44).m_171488_(-2.1472F, 6.5867F, -2.0884F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(24, 26)
/*  85 */         .m_171488_(-2.1472F, 12.5867F, 0.9116F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(24, 19)
/*  86 */         .m_171488_(-2.1472F, 12.5867F, -2.0884F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(22, 4)
/*  87 */         .m_171488_(-0.1472F, 12.5867F, -2.0884F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(24, 24)
/*  88 */         .m_171488_(-2.1472F, 12.5867F, -0.5884F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  89 */         PartPose.m_171423_(-5.0F, 9.0F, 0.0F, 0.2618F, 0.0F, 0.2618F));
/*  90 */     PartDefinition RightArm = partdefinition.m_171599_("RightArm", 
/*  91 */         CubeListBuilder.m_171558_().m_171514_(20, 32).m_171488_(-1.6769F, -1.2771F, -2.125F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F))
/*  92 */         .m_171514_(44, 19).m_171488_(-1.6769F, 6.7229F, -2.125F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(22, 2)
/*  93 */         .m_171488_(-0.6769F, 12.7229F, -2.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(19, 3)
/*  94 */         .m_171488_(1.3231F, 12.7229F, 0.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(9, 11)
/*  95 */         .m_171488_(1.3231F, 12.7229F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(19, 5)
/*  96 */         .m_171488_(1.3231F, 12.7229F, -2.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  97 */         PartPose.m_171423_(5.0F, 9.0F, 0.0F, 0.2618F, 0.0F, -0.2618F));
/*  98 */     PartDefinition LeftLeg = partdefinition.m_171599_("LeftLeg", 
/*  99 */         CubeListBuilder.m_171558_().m_171514_(59, 7).m_171488_(-1.9299F, -2.4753F, -0.66F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(0, 53)
/* 100 */         .m_171488_(-1.9299F, 9.3247F, -1.5702F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 101 */         PartPose.m_171423_(-2.0F, 20.0F, 0.0F, -1.7802F, 0.2094F, 0.0524F));
/* 102 */     PartDefinition cube_r4 = LeftLeg.m_171599_("cube_r4", 
/* 103 */         CubeListBuilder.m_171558_().m_171514_(57, 26).m_171488_(-1.5393F, -0.8714F, 10.3515F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 104 */         PartPose.m_171423_(-0.3906F, 1.2891F, -7.4309F, -0.3927F, 0.0F, 0.0F));
/* 105 */     PartDefinition cube_r5 = LeftLeg.m_171599_("cube_r5", 
/* 106 */         CubeListBuilder.m_171558_().m_171514_(41, 4).m_171488_(-1.5393F, 4.8129F, 1.791F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 107 */         PartPose.m_171423_(-0.3906F, 1.2891F, -7.4309F, 0.7854F, 0.0F, 0.0F));
/* 108 */     PartDefinition cube_r6 = LeftLeg.m_171599_("cube_r6", 
/* 109 */         CubeListBuilder.m_171558_().m_171514_(32, 48).m_171488_(-1.5393F, -5.7714F, 5.1515F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 110 */         PartPose.m_171423_(-0.3906F, 1.2891F, -7.4309F, -0.3927F, 0.0F, 0.0F));
/* 111 */     PartDefinition RightLeg = partdefinition.m_171599_("RightLeg", 
/* 112 */         CubeListBuilder.m_171558_().m_171514_(47, 58).m_171488_(-1.9492F, -1.9973F, -1.021F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
/* 113 */         .m_171514_(53, 0).m_171488_(-1.9492F, 9.8027F, -1.9312F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 114 */         PartPose.m_171423_(2.0F, 20.0F, 0.0F, -1.7802F, -0.2094F, 0.0524F));
/* 115 */     PartDefinition cube_r7 = RightLeg.m_171599_("cube_r7", 
/* 116 */         CubeListBuilder.m_171558_().m_171514_(33, 58).m_171488_(-1.5393F, -0.71F, 10.4624F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 117 */         PartPose.m_171423_(-0.4099F, 1.5755F, -7.8326F, -0.3927F, 0.0F, 0.0F));
/* 118 */     PartDefinition cube_r8 = RightLeg.m_171599_("cube_r8", 
/* 119 */         CubeListBuilder.m_171558_().m_171514_(0, 42).m_171488_(-1.5393F, 4.9772F, 1.6843F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 120 */         PartPose.m_171423_(-0.4099F, 1.5755F, -7.8326F, 0.7854F, 0.0F, 0.0F));
/* 121 */     PartDefinition cube_r9 = RightLeg.m_171599_("cube_r9", 
/* 122 */         CubeListBuilder.m_171558_().m_171514_(48, 48).m_171488_(-1.5393F, -5.61F, 5.2624F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 123 */         PartPose.m_171423_(-0.4099F, 1.5755F, -7.8326F, -0.3927F, 0.0F, 0.0F));
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
/* 140 */     this.Head.f_104204_ = netHeadYaw / 57.295776F;
/* 141 */     this.Head.f_104203_ = headPitch / 57.295776F;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\client\model\Modelhertx_model_sit.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */