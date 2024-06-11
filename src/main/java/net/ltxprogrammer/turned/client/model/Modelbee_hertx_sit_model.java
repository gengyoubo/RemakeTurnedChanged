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
/*     */ public class Modelbee_hertx_sit_model<T extends Entity>
/*     */   extends EntityModel<T>
/*     */ {
/*  24 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("turned", "modelbee_hertx_sit_model"), "main");
/*     */   public final ModelPart Head;
/*     */   public final ModelPart Body;
/*     */   public final ModelPart LeftArm;
/*     */   public final ModelPart RightArm;
/*     */   public final ModelPart LeftLeg;
/*     */   public final ModelPart RightLeg;
/*     */   
/*     */   public Modelbee_hertx_sit_model(ModelPart root) {
/*  33 */     this.Head = root.m_171324_("Head");
/*  34 */     this.Body = root.m_171324_("Body");
/*  35 */     this.LeftArm = root.m_171324_("LeftArm");
/*  36 */     this.RightArm = root.m_171324_("RightArm");
/*  37 */     this.LeftLeg = root.m_171324_("LeftLeg");
/*  38 */     this.RightLeg = root.m_171324_("RightLeg");
/*     */   }
/*     */   
/*     */   public static LayerDefinition createBodyLayer() {
/*  42 */     MeshDefinition meshdefinition = new MeshDefinition();
/*  43 */     PartDefinition partdefinition = meshdefinition.m_171576_();
/*  44 */     PartDefinition Head = partdefinition.m_171599_("Head", 
/*  45 */         CubeListBuilder.m_171558_().m_171514_(0, 31).m_171488_(-3.0F, -1.4F, -5.0F, 6.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).m_171514_(58, 11)
/*  46 */         .m_171488_(-3.0F, -6.4F, 2.0F, 6.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(32, 25)
/*  47 */         .m_171488_(-3.0F, -6.4F, 3.0F, 6.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(44, 60)
/*  48 */         .m_171488_(-3.0F, -2.4F, -4.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(50, 12)
/*  49 */         .m_171488_(-3.0F, -5.4F, -4.0F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(58, 18)
/*  50 */         .m_171488_(2.0F, -2.4F, -4.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(54, 54)
/*  51 */         .m_171488_(2.0F, -5.4F, -4.0F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(60, 38)
/*  52 */         .m_171488_(-3.0F, -2.4F, -5.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(48, 41)
/*  53 */         .m_171488_(-3.0F, -5.4F, -5.0F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(32, 18)
/*  54 */         .m_171488_(-3.0F, -6.4F, -4.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(45, 35)
/*  55 */         .m_171488_(-2.5F, -0.4F, -1.9F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), 
/*  56 */         PartPose.m_171419_(0.0F, 9.0F, 0.0F));
/*  57 */     PartDefinition bone4 = Head.m_171599_("bone4", 
/*  58 */         CubeListBuilder.m_171558_().m_171514_(26, 15).m_171488_(2.0F, 2.1219F, -2.8441F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(20, 0)
/*  59 */         .m_171488_(-3.0F, 2.1219F, -2.8441F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  60 */         PartPose.m_171423_(0.0F, -12.65F, 2.75F, 0.3927F, 0.0F, 0.0F));
/*  61 */     PartDefinition bone5 = bone4.m_171599_("bone5", 
/*  62 */         CubeListBuilder.m_171558_().m_171514_(36, 57).m_171488_(2.0F, 3.5539F, -7.306F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(6, 7)
/*  63 */         .m_171488_(2.0F, 4.5539F, -8.306F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(56, 41)
/*  64 */         .m_171488_(-3.0F, 3.5539F, -7.306F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(25, 21)
/*  65 */         .m_171488_(-3.0F, 4.5539F, -8.306F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  66 */         PartPose.m_171423_(0.0F, -2.067F, 0.6109F, -0.2618F, 0.0F, 0.0F));
/*  67 */     PartDefinition bone3 = Head.m_171599_("bone3", 
/*  68 */         CubeListBuilder.m_171558_().m_171514_(50, 21).m_171488_(-3.0F, 9.1924F, 2.1213F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(46, 32)
/*  69 */         .m_171488_(-3.0F, 6.364F, 9.6066F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(56, 49)
/*  70 */         .m_171488_(-3.0F, 9.6066F, 2.1213F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(48, 45).m_171488_(-3.0F, 6.7782F, 9.6066F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*     */         
/*  72 */         PartPose.m_171423_(0.0F, -14.4F, 1.0F, -0.7854F, 0.0F, 0.0F));
/*  73 */     PartDefinition Body = partdefinition.m_171599_("Body", 
/*  74 */         CubeListBuilder.m_171558_().m_171514_(26, 31).m_171488_(-4.0F, 1.0F, -2.0F, 8.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(20, 0)
/*  75 */         .m_171488_(-5.0F, 0.0F, -3.0F, 10.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(46, 25)
/*  76 */         .m_171488_(-3.0F, 6.0F, -2.0F, 6.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(32, 10)
/*  77 */         .m_171488_(-4.0F, 9.0F, -2.0F, 8.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  78 */         PartPose.m_171419_(0.0F, 9.0F, 0.0F));
/*  79 */     PartDefinition Wings = Body.m_171599_("Wings", CubeListBuilder.m_171558_(), PartPose.m_171419_(0.0F, -10.0F, 1.0F));
/*  80 */     PartDefinition bone2 = Wings.m_171599_("bone2", 
/*  81 */         CubeListBuilder.m_171558_().m_171514_(6, 15).m_171488_(-4.3F, 11.5F, 1.4F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(19, 31)
/*  82 */         .m_171488_(-3.3F, 13.5F, 1.4F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(24, 0)
/*  83 */         .m_171488_(-5.3F, 12.5F, 1.4F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(6, 0)
/*  84 */         .m_171488_(-7.3F, 12.5F, 1.4F, 2.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(0, 0)
/*  85 */         .m_171488_(-10.3F, 13.5F, 1.4F, 3.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(0, 30)
/*  86 */         .m_171488_(-11.3F, 13.5F, 1.4F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(0, 7)
/*  87 */         .m_171488_(-10.3F, 12.5F, 1.4F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(0, 8)
/*  88 */         .m_171488_(-7.3F, 11.5F, 1.4F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(6, 9).m_171488_(-4.3F, 10.5F, 1.4F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), 
/*     */         
/*  90 */         PartPose.m_171423_(0.0F, 0.0F, 0.0F, 0.0F, 0.2618F, 0.0F));
/*  91 */     PartDefinition bone = Wings.m_171599_("bone", 
/*  92 */         CubeListBuilder.m_171558_().m_171514_(30, 10).m_171488_(10.3F, 13.5F, 1.4F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(0, 9)
/*  93 */         .m_171488_(7.3F, 19.5F, 1.4F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(22, 15)
/*  94 */         .m_171488_(5.3F, 12.5F, 1.4F, 2.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(4, 30)
/*  95 */         .m_171488_(4.3F, 12.5F, 1.4F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(2, 30)
/*  96 */         .m_171488_(3.3F, 11.5F, 1.4F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(21, 31)
/*  97 */         .m_171488_(2.3F, 13.5F, 1.4F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(8, 9)
/*  98 */         .m_171488_(3.3F, 10.5F, 1.4F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(0, 22)
/*  99 */         .m_171488_(4.3F, 11.5F, 1.4F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(0, 15).m_171488_(7.3F, 12.5F, 1.4F, 3.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), 
/*     */         
/* 101 */         PartPose.m_171423_(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, 0.0F));
/* 102 */     PartDefinition Tail = Body.m_171599_("Tail", 
/* 103 */         CubeListBuilder.m_171558_().m_171514_(60, 32).m_171488_(-1.5F, 12.1133F, -3.2867F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).m_171514_(0, 15)
/* 104 */         .m_171488_(-3.5F, 10.1133F, -0.2867F, 7.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)).m_171514_(0, 0)
/* 105 */         .m_171488_(-2.5F, 11.1133F, -1.2867F, 5.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)).m_171514_(17, 17)
/* 106 */         .m_171488_(-0.5F, 13.1133F, -1.2867F, 1.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)), 
/* 107 */         PartPose.m_171423_(0.0F, -3.0F, 0.0F, 0.3054F, 0.0F, 0.0F));
/* 108 */     PartDefinition LeftArm = partdefinition.m_171599_("LeftArm", 
/* 109 */         CubeListBuilder.m_171558_().m_171514_(44, 48).m_171488_(-3.0F, 6.0F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(28, 52)
/* 110 */         .m_171488_(-2.0F, -1.0F, -2.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 111 */         PartPose.m_171423_(-5.0F, 11.0F, 0.0F, -0.6545F, 0.0F, 0.2182F));
/* 112 */     PartDefinition RightArm = partdefinition.m_171599_("RightArm", 
/* 113 */         CubeListBuilder.m_171558_().m_171514_(32, 40).m_171488_(-1.0F, 6.0F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(52, 0)
/* 114 */         .m_171488_(-1.0F, -1.0F, -2.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 115 */         PartPose.m_171423_(5.0F, 11.0F, 0.0F, -0.6545F, 0.0F, -0.2182F));
/* 116 */     PartDefinition LeftLeg = partdefinition.m_171599_("LeftLeg", 
/* 117 */         CubeListBuilder.m_171558_().m_171514_(16, 40).m_171488_(-2.0F, 1.0F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(14, 52)
/* 118 */         .m_171488_(-1.0F, 9.0F, -2.0F, 3.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 119 */         PartPose.m_171423_(-2.0F, 21.0F, 0.0F, -1.5708F, 0.2618F, 0.0873F));
/* 120 */     PartDefinition RightLeg = partdefinition.m_171599_("RightLeg", 
/* 121 */         CubeListBuilder.m_171558_().m_171514_(0, 39).m_171488_(-2.0F, 2.0F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(0, 51)
/* 122 */         .m_171488_(-2.0F, 10.0F, -2.0F, 3.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 123 */         PartPose.m_171423_(2.0F, 21.0F, 0.0F, -1.5708F, -0.2618F, -0.0873F));
/* 124 */     return LayerDefinition.m_171565_(meshdefinition, 80, 80);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void m_7695_(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 130 */     this.Head.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 131 */     this.Body.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 132 */     this.LeftArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 133 */     this.RightArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 134 */     this.LeftLeg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 135 */     this.RightLeg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */   
/*     */   public void m_6973_(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
/* 139 */     this.Head.f_104204_ = netHeadYaw / 57.295776F;
/* 140 */     this.Head.f_104203_ = headPitch / 57.295776F;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\client\model\Modelbee_hertx_sit_model.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */