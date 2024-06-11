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
/*     */ public class Modelhertx_model_f<T extends Entity>
/*     */   extends EntityModel<T>
/*     */ {
/*  25 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("turned", "modelhertx_model_f"), "main");
/*     */   public final ModelPart Head;
/*     */   public final ModelPart Body;
/*     */   public final ModelPart Tail;
/*     */   public final ModelPart LeftArm;
/*     */   public final ModelPart RightArm;
/*     */   public final ModelPart LeftLeg;
/*     */   public final ModelPart RightLeg;
/*     */   
/*     */   public Modelhertx_model_f(ModelPart root) {
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
/*  48 */         CubeListBuilder.m_171558_().m_171514_(24, 16).m_171488_(-3.0F, -3.7F, -4.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(19, 7)
/*  49 */         .m_171488_(-2.0F, -4.8F, -3.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(61, 47)
/*  50 */         .m_171488_(-2.0F, -8.8F, 2.0F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).m_171514_(20, 16)
/*  51 */         .m_171488_(-2.0F, -4.8F, 3.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(37, 0)
/*  52 */         .m_171488_(-3.0F, -4.8F, 2.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(24, 24)
/*  53 */         .m_171488_(-3.0F, -2.8F, -2.9F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(7, 0)
/*  54 */         .m_171488_(2.0F, -8.8F, 2.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 0)
/*  55 */         .m_171488_(-3.0F, -8.8F, 2.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(19, 0)
/*  56 */         .m_171488_(-3.0F, -8.8F, -4.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(24, 57)
/*  57 */         .m_171488_(2.0F, -7.8F, -4.0F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(0, 60)
/*  58 */         .m_171488_(2.0F, -4.7F, -4.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(55, 55)
/*  59 */         .m_171488_(-3.0F, -7.8F, -4.0F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(59, 40)
/*  60 */         .m_171488_(-3.0F, -4.7F, -4.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(0, 8)
/*  61 */         .m_171488_(-2.0F, -7.8F, -4.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(12, 32)
/*  62 */         .m_171488_(-2.0F, -4.7F, -4.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  63 */         PartPose.m_171419_(0.0F, 0.4F, -0.2F));
/*  64 */     PartDefinition cube_r1 = Head.m_171599_("cube_r1", 
/*  65 */         CubeListBuilder.m_171558_().m_171514_(24, 24).m_171488_(-3.0625F, -7.4142F, 10.2505F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
/*  66 */         .m_171514_(0, 16).m_171488_(-3.25F, -6.1184F, 8.7739F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(54, 23)
/*  67 */         .m_171488_(-3.0625F, -7.4142F, 4.2505F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(0, 0)
/*  68 */         .m_171488_(-3.25F, -6.1184F, 3.7739F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(19, 7)
/*  69 */         .m_171488_(2.0625F, -7.4142F, 10.2505F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(19, 2)
/*  70 */         .m_171488_(2.25F, -6.0861F, 8.8946F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(35, 51)
/*  71 */         .m_171488_(2.0625F, -7.4142F, 4.2505F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(62, 18)
/*  72 */         .m_171488_(2.25F, -6.0861F, 3.8946F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), 
/*  73 */         PartPose.m_171423_(0.0F, 0.0F, 0.0F, 0.2618F, 0.0F, 0.0F));
/*  74 */     PartDefinition Body = partdefinition.m_171599_("Body", 
/*  75 */         CubeListBuilder.m_171558_().m_171514_(0, 16).m_171488_(-4.0F, -1.8F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(32, 14)
/*  76 */         .m_171488_(-3.0F, 4.0125F, -2.5F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(19, 0)
/*  77 */         .m_171488_(-1.0F, -0.9875F, -2.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  78 */         PartPose.m_171419_(0.0F, 0.0F, 0.0F));
/*  79 */     PartDefinition bone = Body.m_171599_("bone", 
/*  80 */         CubeListBuilder.m_171558_().m_171514_(30, 31).m_171488_(-4.0F, -1.9089F, -1.4473F, 8.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), 
/*  81 */         PartPose.m_171423_(0.0F, 1.7F, -2.0F, -0.637F, 0.0F, 0.0F));
/*  82 */     PartDefinition Tail = partdefinition.m_171599_("Tail", CubeListBuilder.m_171558_(), PartPose.m_171419_(0.0F, 0.0F, 0.0F));
/*  83 */     PartDefinition cube_r2 = Tail.m_171599_("cube_r2", 
/*  84 */         CubeListBuilder.m_171558_().m_171514_(17, 31).m_171488_(-1.3F, 11.3026F, 15.6391F, 3.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), 
/*  85 */         PartPose.m_171423_(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/*  86 */     PartDefinition cube_r3 = Tail.m_171599_("cube_r3", 
/*  87 */         CubeListBuilder.m_171558_().m_171514_(0, 0).m_171488_(-1.3F, 4.2F, 7.0F, 3.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)), 
/*  88 */         PartPose.m_171423_(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
/*     */     
/*  90 */     PartDefinition LeftArm = partdefinition.m_171599_("LeftArm", 
/*  91 */         CubeListBuilder.m_171558_().m_171514_(10, 55).m_171488_(-2.0F, -3.8F, -2.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F))
/*  92 */         .m_171514_(33, 38).m_171488_(-3.0F, 3.2F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  93 */         PartPose.m_171419_(-5.0F, 2.0F, 0.0F));
/*     */     
/*  95 */     PartDefinition RightArm = partdefinition.m_171599_("RightArm", 
/*  96 */         CubeListBuilder.m_171558_().m_171514_(0, 48).m_171488_(-1.0F, -3.8F, -2.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F))
/*  97 */         .m_171514_(0, 32).m_171488_(-1.0F, 3.2F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  98 */         PartPose.m_171419_(5.0F, 2.0F, 0.0F));
/*  99 */     PartDefinition LeftLeg = partdefinition.m_171599_("LeftLeg", 
/* 100 */         CubeListBuilder.m_171558_().m_171514_(38, 60).m_171488_(-2.0F, -1.8F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
/* 101 */         .m_171514_(23, 50).m_171488_(-2.0F, 10.0F, -2.9102F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 102 */         PartPose.m_171419_(-2.0F, 12.0F, 0.0F));
/* 103 */     PartDefinition cube_r4 = LeftLeg.m_171599_("cube_r4", 
/* 104 */         CubeListBuilder.m_171558_().m_171514_(55, 9).m_171488_(-2.0F, 4.3F, 3.0F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 105 */         PartPose.m_171423_(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 106 */     PartDefinition cube_r5 = LeftLeg.m_171599_("cube_r5", 
/* 107 */         CubeListBuilder.m_171558_().m_171514_(12, 41).m_171488_(-2.0F, 0.0F, -5.8F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 108 */         PartPose.m_171423_(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
/* 109 */     PartDefinition cube_r6 = LeftLeg.m_171599_("cube_r6", 
/* 110 */         CubeListBuilder.m_171558_().m_171514_(45, 46).m_171488_(-2.0F, -0.6F, -2.2F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 111 */         PartPose.m_171423_(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 112 */     PartDefinition RightLeg = partdefinition.m_171599_("RightLeg", 
/* 113 */         CubeListBuilder.m_171558_().m_171514_(49, 40).m_171488_(-2.0F, -1.8F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
/* 114 */         .m_171514_(47, 33).m_171488_(-2.0F, 10.0F, -2.9102F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 115 */         PartPose.m_171419_(2.0F, 12.0F, 0.0F));
/* 116 */     PartDefinition cube_r7 = RightLeg.m_171599_("cube_r7", 
/* 117 */         CubeListBuilder.m_171558_().m_171514_(55, 0).m_171488_(-2.0F, 4.3F, 3.0F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 118 */         PartPose.m_171423_(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 119 */     PartDefinition cube_r8 = RightLeg.m_171599_("cube_r8", 
/* 120 */         CubeListBuilder.m_171558_().m_171514_(39, 3).m_171488_(-2.0F, 0.0F, -5.8F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 121 */         PartPose.m_171423_(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
/* 122 */     PartDefinition cube_r9 = RightLeg.m_171599_("cube_r9", 
/* 123 */         CubeListBuilder.m_171558_().m_171514_(44, 19).m_171488_(-2.0F, -0.6F, -2.2F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 124 */         PartPose.m_171423_(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 125 */     return LayerDefinition.m_171565_(meshdefinition, 128, 128);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void m_7695_(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 131 */     this.Head.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 132 */     this.Body.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 133 */     this.Tail.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 134 */     this.LeftArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 135 */     this.RightArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 136 */     this.LeftLeg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 137 */     this.RightLeg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */   
/*     */   public void m_6973_(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
/* 141 */     this.RightArm.f_104203_ = Mth.m_14089_(limbSwing * 0.6662F + 3.1415927F) * limbSwingAmount;
/* 142 */     this.LeftLeg.f_104203_ = Mth.m_14089_(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
/* 143 */     this.Head.f_104204_ = netHeadYaw / 57.295776F;
/* 144 */     this.Head.f_104203_ = headPitch / 57.295776F;
/* 145 */     this.LeftArm.f_104203_ = Mth.m_14089_(limbSwing * 0.6662F) * limbSwingAmount;
/* 146 */     this.RightLeg.f_104203_ = Mth.m_14089_(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\client\model\Modelhertx_model_f.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */