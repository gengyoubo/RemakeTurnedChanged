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
/*     */ public class Modelbee_hertx_model<T extends Entity>
/*     */   extends EntityModel<T>
/*     */ {
/*  25 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("turned", "modelbee_hertx_model"), "main");
/*     */   public final ModelPart Head;
/*     */   public final ModelPart Body;
/*     */   public final ModelPart LeftArm;
/*     */   public final ModelPart RightArm;
/*     */   public final ModelPart LeftLeg;
/*     */   public final ModelPart RightLeg;
/*     */   
/*     */   public Modelbee_hertx_model(ModelPart root) {
/*  34 */     this.Head = root.m_171324_("Head");
/*  35 */     this.Body = root.m_171324_("Body");
/*  36 */     this.LeftArm = root.m_171324_("LeftArm");
/*  37 */     this.RightArm = root.m_171324_("RightArm");
/*  38 */     this.LeftLeg = root.m_171324_("LeftLeg");
/*  39 */     this.RightLeg = root.m_171324_("RightLeg");
/*     */   }
/*     */   
/*     */   public static LayerDefinition createBodyLayer() {
/*  43 */     MeshDefinition meshdefinition = new MeshDefinition();
/*  44 */     PartDefinition partdefinition = meshdefinition.m_171576_();
/*  45 */     PartDefinition Head = partdefinition.m_171599_("Head", 
/*  46 */         CubeListBuilder.m_171558_().m_171514_(0, 31).m_171488_(-3.0F, -1.4F, -5.0F, 6.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).m_171514_(58, 11)
/*  47 */         .m_171488_(-3.0F, -6.4F, 2.0F, 6.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(32, 25)
/*  48 */         .m_171488_(-3.0F, -6.4F, 3.0F, 6.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(44, 60)
/*  49 */         .m_171488_(-3.0F, -2.4F, -4.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(50, 12)
/*  50 */         .m_171488_(-3.0F, -5.4F, -4.0F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(58, 18)
/*  51 */         .m_171488_(2.0F, -2.4F, -4.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(54, 54)
/*  52 */         .m_171488_(2.0F, -5.4F, -4.0F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(60, 38)
/*  53 */         .m_171488_(-3.0F, -2.4F, -5.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(48, 41)
/*  54 */         .m_171488_(-3.0F, -5.4F, -5.0F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(32, 18)
/*  55 */         .m_171488_(-3.0F, -6.4F, -4.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(45, 35)
/*  56 */         .m_171488_(-2.5F, -0.4F, -1.9F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), 
/*  57 */         PartPose.m_171419_(0.0F, -5.0F, 0.0F));
/*  58 */     PartDefinition bone4 = Head.m_171599_("bone4", 
/*  59 */         CubeListBuilder.m_171558_().m_171514_(26, 15).m_171488_(2.0F, -10.8124F, 2.5135F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(20, 0)
/*  60 */         .m_171488_(-3.0F, -10.8124F, 2.5135F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  61 */         PartPose.m_171423_(0.0F, 1.35F, 2.75F, 0.3927F, 0.0F, 0.0F));
/*  62 */     PartDefinition bone5 = bone4.m_171599_("bone5", 
/*  63 */         CubeListBuilder.m_171558_().m_171514_(36, 57).m_171488_(2.0F, -10.3263F, -5.4786F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(6, 7)
/*  64 */         .m_171488_(2.0F, -9.3263F, -6.4786F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(56, 41)
/*  65 */         .m_171488_(-3.0F, -10.3263F, -5.4786F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(25, 21)
/*  66 */         .m_171488_(-3.0F, -9.3263F, -6.4786F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  67 */         PartPose.m_171423_(0.0F, -2.067F, 0.6109F, -0.2618F, 0.0F, 0.0F));
/*  68 */     PartDefinition bone3 = Head.m_171599_("bone3", 
/*  69 */         CubeListBuilder.m_171558_().m_171514_(50, 21).m_171488_(-3.0F, -0.7071F, -7.7782F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
/*  70 */         .m_171514_(46, 32).m_171488_(-3.0F, -3.5355F, -0.2929F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(56, 49)
/*  71 */         .m_171488_(-3.0F, -0.2929F, -7.7782F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(48, 45)
/*  72 */         .m_171488_(-3.0F, -3.1213F, -0.2929F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  73 */         PartPose.m_171423_(0.0F, -0.4F, 1.0F, -0.7854F, 0.0F, 0.0F));
/*  74 */     PartDefinition Body = partdefinition.m_171599_("Body", 
/*  75 */         CubeListBuilder.m_171558_().m_171514_(26, 31).m_171488_(-4.0F, 1.0F, -2.0F, 8.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(20, 0)
/*  76 */         .m_171488_(-5.0F, 0.0F, -3.0F, 10.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(46, 25)
/*  77 */         .m_171488_(-3.0F, 6.0F, -2.0F, 6.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(32, 10)
/*  78 */         .m_171488_(-4.0F, 9.0F, -2.0F, 8.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  79 */         PartPose.m_171419_(0.0F, -5.0F, 0.0F));
/*  80 */     PartDefinition Wings = Body.m_171599_("Wings", CubeListBuilder.m_171558_(), PartPose.m_171419_(0.0F, 4.0F, 1.0F));
/*  81 */     PartDefinition bone2 = Wings.m_171599_("bone2", 
/*  82 */         CubeListBuilder.m_171558_().m_171514_(6, 15).m_171488_(-4.3F, -2.5F, 1.4F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(19, 31)
/*  83 */         .m_171488_(-3.3F, -0.5F, 1.4F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(24, 0)
/*  84 */         .m_171488_(-5.3F, -1.5F, 1.4F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(6, 0)
/*  85 */         .m_171488_(-7.3F, -1.5F, 1.4F, 2.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(0, 0)
/*  86 */         .m_171488_(-10.3F, -0.5F, 1.4F, 3.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(0, 30)
/*  87 */         .m_171488_(-11.3F, -0.5F, 1.4F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(0, 7)
/*  88 */         .m_171488_(-10.3F, -1.5F, 1.4F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(0, 8)
/*  89 */         .m_171488_(-7.3F, -2.5F, 1.4F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(6, 9).m_171488_(-4.3F, -3.5F, 1.4F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), 
/*     */         
/*  91 */         PartPose.m_171423_(0.0F, 0.0F, 0.0F, 0.0F, 0.2618F, 0.0F));
/*  92 */     PartDefinition bone = Wings.m_171599_("bone", 
/*  93 */         CubeListBuilder.m_171558_().m_171514_(30, 10).m_171488_(10.3F, -0.5F, 1.4F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(0, 9)
/*  94 */         .m_171488_(7.3F, 5.5F, 1.4F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(22, 15)
/*  95 */         .m_171488_(5.3F, -1.5F, 1.4F, 2.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(4, 30)
/*  96 */         .m_171488_(4.3F, -1.5F, 1.4F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(2, 30)
/*  97 */         .m_171488_(3.3F, -2.5F, 1.4F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(21, 31)
/*  98 */         .m_171488_(2.3F, -0.5F, 1.4F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(8, 9)
/*  99 */         .m_171488_(3.3F, -3.5F, 1.4F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(0, 22)
/* 100 */         .m_171488_(4.3F, -2.5F, 1.4F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(0, 15).m_171488_(7.3F, -1.5F, 1.4F, 3.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), 
/*     */         
/* 102 */         PartPose.m_171423_(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, 0.0F));
/* 103 */     PartDefinition Tail = Body.m_171599_("Tail", 
/* 104 */         CubeListBuilder.m_171558_().m_171514_(60, 32).m_171488_(-1.5F, 4.3045F, 3.2193F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).m_171514_(0, 15)
/* 105 */         .m_171488_(-3.5F, 2.3045F, 6.2193F, 7.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)).m_171514_(0, 0)
/* 106 */         .m_171488_(-2.5F, 3.3045F, 5.2193F, 5.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)).m_171514_(17, 17).m_171488_(-0.5F, 5.3045F, 5.2193F, 1.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)), 
/*     */         
/* 108 */         PartPose.m_171423_(0.0F, 5.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 109 */     PartDefinition LeftArm = partdefinition.m_171599_("LeftArm", 
/* 110 */         CubeListBuilder.m_171558_().m_171514_(44, 48).m_171488_(-3.0F, 6.0F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F))
/* 111 */         .m_171514_(28, 52).m_171488_(-2.0F, -1.0F, -2.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 112 */         PartPose.m_171419_(-5.0F, -3.0F, 0.0F));
/*     */     
/* 114 */     PartDefinition RightArm = partdefinition.m_171599_("RightArm", 
/* 115 */         CubeListBuilder.m_171558_().m_171514_(32, 40).m_171488_(-1.0F, 6.0F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F))
/* 116 */         .m_171514_(52, 0).m_171488_(-1.0F, -1.0F, -2.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 117 */         PartPose.m_171419_(5.0F, -3.0F, 0.0F));
/*     */     
/* 119 */     PartDefinition LeftLeg = partdefinition.m_171599_("LeftLeg", 
/* 120 */         CubeListBuilder.m_171558_().m_171514_(16, 40).m_171488_(-2.0F, 1.0F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F))
/* 121 */         .m_171514_(14, 52).m_171488_(-1.0F, 9.0F, -2.0F, 3.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 122 */         PartPose.m_171419_(-2.0F, 7.0F, 0.0F));
/*     */     
/* 124 */     PartDefinition RightLeg = partdefinition.m_171599_("RightLeg", 
/* 125 */         CubeListBuilder.m_171558_().m_171514_(0, 39).m_171488_(-2.0F, 1.0F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F))
/* 126 */         .m_171514_(0, 51).m_171488_(-2.0F, 9.0F, -2.0F, 3.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 127 */         PartPose.m_171419_(2.0F, 7.0F, 0.0F));
/* 128 */     return LayerDefinition.m_171565_(meshdefinition, 80, 80);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void m_7695_(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 134 */     this.Head.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 135 */     this.Body.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 136 */     this.LeftArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 137 */     this.RightArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 138 */     this.LeftLeg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 139 */     this.RightLeg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */   
/*     */   public void m_6973_(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
/* 143 */     this.RightArm.f_104203_ = Mth.m_14089_(limbSwing * 0.6662F + 3.1415927F) * limbSwingAmount;
/* 144 */     this.LeftLeg.f_104203_ = Mth.m_14089_(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
/* 145 */     this.Head.f_104204_ = netHeadYaw / 57.295776F;
/* 146 */     this.Head.f_104203_ = headPitch / 57.295776F;
/* 147 */     this.LeftArm.f_104203_ = Mth.m_14089_(limbSwing * 0.6662F) * limbSwingAmount;
/* 148 */     this.RightLeg.f_104203_ = Mth.m_14089_(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\client\model\Modelbee_hertx_model.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */