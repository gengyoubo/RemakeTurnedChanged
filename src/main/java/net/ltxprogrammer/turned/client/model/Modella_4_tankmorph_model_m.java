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
/*     */ public class Modella_4_tankmorph_model_m<T extends Entity>
/*     */   extends EntityModel<T>
/*     */ {
/*  25 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("turned", "modella_4_tankmorph_model_m"), "main");
/*     */   
/*     */   public final ModelPart Head;
/*     */   public final ModelPart Body;
/*     */   public final ModelPart Cannon;
/*     */   public final ModelPart LeftArm;
/*     */   public final ModelPart RightArm;
/*     */   public final ModelPart LeftLeg;
/*     */   public final ModelPart RightLeg;
/*     */   
/*     */   public Modella_4_tankmorph_model_m(ModelPart root) {
/*  36 */     this.Head = root.m_171324_("Head");
/*  37 */     this.Body = root.m_171324_("Body");
/*  38 */     this.Cannon = root.m_171324_("Cannon");
/*  39 */     this.LeftArm = root.m_171324_("LeftArm");
/*  40 */     this.RightArm = root.m_171324_("RightArm");
/*  41 */     this.LeftLeg = root.m_171324_("LeftLeg");
/*  42 */     this.RightLeg = root.m_171324_("RightLeg");
/*     */   }
/*     */   
/*     */   public static LayerDefinition createBodyLayer() {
/*  46 */     MeshDefinition meshdefinition = new MeshDefinition();
/*  47 */     PartDefinition partdefinition = meshdefinition.m_171576_();
/*  48 */     PartDefinition Head = partdefinition.m_171599_("Head", 
/*  49 */         CubeListBuilder.m_171558_().m_171514_(52, 81).m_171488_(-4.0F, -10.0F, -3.5F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).m_171514_(46, 34)
/*  50 */         .m_171488_(-0.1F, -6.5F, -3.75F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(68, 46)
/*  51 */         .m_171488_(-4.5F, -4.0F, -4.0F, 9.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).m_171514_(20, 63)
/*  52 */         .m_171488_(-5.0F, -2.5F, -4.5F, 10.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)).m_171514_(26, 99)
/*  53 */         .m_171488_(0.5F, -1.5F, 3.0F, 5.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)), 
/*  54 */         PartPose.m_171419_(0.0F, -33.0F, 0.0F));
/*  55 */     PartDefinition bone = Head.m_171599_("bone", 
/*  56 */         CubeListBuilder.m_171558_().m_171514_(96, 101).m_171488_(8.1676F, -31.6354F, -2.5F, 3.0F, 5.0F, 5.0F, new CubeDeformation(0.0F))
/*  57 */         .m_171514_(22, 42).m_171488_(10.0212F, -31.0701F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(0, 105)
/*  58 */         .m_171488_(11.1676F, -31.6354F, -2.5F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), 
/*  59 */         PartPose.m_171423_(0.0F, 22.6F, 0.5F, 0.0F, 0.0F, -0.1745F));
/*  60 */     PartDefinition bone3 = Head.m_171599_("bone3", 
/*  61 */         CubeListBuilder.m_171558_().m_171514_(80, 101).m_171488_(-11.1676F, -31.6354F, -2.5F, 3.0F, 5.0F, 5.0F, new CubeDeformation(0.0F))
/*  62 */         .m_171514_(104, 12).m_171488_(-14.1676F, -31.6354F, -2.5F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(106, 0)
/*  63 */         .m_171488_(-14.0525F, -30.0704F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  64 */         PartPose.m_171423_(0.0F, 22.6F, 0.5F, 0.0F, 0.0F, 0.1745F));
/*  65 */     PartDefinition Body = partdefinition.m_171599_("Body", 
/*  66 */         CubeListBuilder.m_171558_().m_171514_(0, 15).m_171488_(-9.5F, 0.0F, -2.5F, 19.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(44, 22)
/*  67 */         .m_171488_(-7.5F, 7.0F, -2.5F, 15.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(60, 34)
/*  68 */         .m_171488_(-7.0F, 13.0F, -2.5F, 14.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(0, 28)
/*  69 */         .m_171488_(-8.0F, 19.0F, -3.0F, 16.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), 
/*  70 */         PartPose.m_171419_(0.0F, -33.0F, 0.0F));
/*  71 */     PartDefinition bone2 = Body.m_171599_("bone2", 
/*  72 */         CubeListBuilder.m_171558_().m_171514_(0, 0).m_171488_(-8.5F, -18.8747F, 7.5115F, 17.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)), 
/*  73 */         PartPose.m_171423_(0.0F, 25.0F, -0.5F, 0.7418F, 0.0F, 0.0F));
/*  74 */     PartDefinition Cannon = partdefinition.m_171599_("Cannon", 
/*  75 */         CubeListBuilder.m_171558_().m_171514_(94, 57).m_171488_(-9.0F, 2.5F, 2.25F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(42, 0)
/*  76 */         .m_171488_(-8.0F, -1.5F, 3.75F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(50, 97)
/*  77 */         .m_171488_(-7.5F, -21.5F, 4.75F, 3.0F, 20.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(106, 69)
/*  78 */         .m_171488_(-8.5F, 8.5F, 4.25F, 5.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).m_171514_(34, 42)
/*  79 */         .m_171488_(-8.5F, 8.5F, 3.25F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  80 */         PartPose.m_171419_(0.0F, -33.0F, 0.0F));
/*  81 */     PartDefinition LeftArm = partdefinition.m_171599_("LeftArm", 
/*  82 */         CubeListBuilder.m_171558_().m_171514_(95, 48).m_171488_(-6.45F, -4.75F, -2.0F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(84, 84)
/*  83 */         .m_171488_(-6.45F, -2.75F, -2.0F, 6.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(88, 75)
/*  84 */         .m_171488_(-5.95F, 8.25F, -2.5F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(0, 70)
/*  85 */         .m_171488_(-6.95F, 9.25F, -2.5F, 7.0F, 17.0F, 6.0F, new CubeDeformation(0.0F)), 
/*  86 */         PartPose.m_171419_(-9.0F, -30.0F, 0.0F));
/*  87 */     PartDefinition RightArm = partdefinition.m_171599_("RightArm", 
/*  88 */         CubeListBuilder.m_171558_().m_171514_(84, 0).m_171488_(0.45F, -2.75F, -2.0F, 6.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(101, 82)
/*  89 */         .m_171488_(2.45F, -4.75F, -2.0F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(94, 29)
/*  90 */         .m_171488_(-0.05F, 8.25F, -2.5F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(26, 76)
/*  91 */         .m_171488_(-0.05F, 9.25F, -2.5F, 7.0F, 17.0F, 6.0F, new CubeDeformation(0.0F)), 
/*  92 */         PartPose.m_171419_(9.0F, -30.0F, 0.0F));
/*  93 */     PartDefinition LeftLeg = partdefinition.m_171599_("LeftLeg", 
/*  94 */         CubeListBuilder.m_171558_().m_171514_(86, 17).m_171488_(-5.0F, -4.0F, -3.5F, 5.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).m_171514_(95, 38)
/*  95 */         .m_171488_(0.0F, -2.0F, -3.5F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).m_171514_(50, 0)
/*  96 */         .m_171488_(-5.0F, 0.0F, -3.5F, 9.0F, 13.0F, 8.0F, new CubeDeformation(0.0F)).m_171514_(38, 38)
/*  97 */         .m_171488_(-3.0F, 13.0F, -3.5F, 7.0F, 17.0F, 8.0F, new CubeDeformation(0.0F)), 
/*  98 */         PartPose.m_171419_(-4.0F, -8.0F, 0.0F));
/*  99 */     PartDefinition RightLeg = partdefinition.m_171599_("RightLeg", 
/* 100 */         CubeListBuilder.m_171558_().m_171514_(0, 93).m_171488_(0.0F, -4.0F, -3.5F, 5.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).m_171514_(60, 97)
/* 101 */         .m_171488_(-2.0F, -2.0F, -3.5F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).m_171514_(60, 60)
/* 102 */         .m_171488_(-4.0F, 0.0F, -3.5F, 9.0F, 13.0F, 8.0F, new CubeDeformation(0.0F)).m_171514_(0, 42)
/* 103 */         .m_171488_(-4.0F, 13.0F, -3.5F, 7.0F, 17.0F, 8.0F, new CubeDeformation(0.0F)), 
/* 104 */         PartPose.m_171419_(4.0F, -8.0F, 0.0F));
/* 105 */     return LayerDefinition.m_171565_(meshdefinition, 128, 128);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void m_7695_(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 111 */     this.Head.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 112 */     this.Body.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 113 */     this.Cannon.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 114 */     this.LeftArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 115 */     this.RightArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 116 */     this.LeftLeg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 117 */     this.RightLeg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */   
/*     */   public void m_6973_(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
/* 121 */     this.RightArm.f_104203_ = Mth.m_14089_(limbSwing * 0.6662F + 3.1415927F) * limbSwingAmount;
/* 122 */     this.LeftLeg.f_104203_ = Mth.m_14089_(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
/* 123 */     this.Head.f_104204_ = netHeadYaw / 57.295776F;
/* 124 */     this.Head.f_104203_ = headPitch / 57.295776F;
/* 125 */     this.LeftArm.f_104203_ = Mth.m_14089_(limbSwing * 0.6662F) * limbSwingAmount;
/* 126 */     this.RightLeg.f_104203_ = Mth.m_14089_(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\client\model\Modella_4_tankmorph_model_m.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */