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
/*     */ public class ModelAHV_hertx_model<T extends Entity>
/*     */   extends EntityModel<T>
/*     */ {
/*  25 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("turned", "model_ahv_hertx_model"), "main");
/*     */   public final ModelPart Head;
/*     */   public final ModelPart Body;
/*     */   public final ModelPart LeftArm;
/*     */   public final ModelPart RightArm;
/*     */   public final ModelPart LeftLeg;
/*     */   public final ModelPart RightLeg;
/*     */   
/*     */   public ModelAHV_hertx_model(ModelPart root) {
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
/*  46 */         CubeListBuilder.m_171558_().m_171514_(21, 8).m_171488_(-3.0F, -2.3F, -5.2F, 6.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).m_171514_(56, 43)
/*  47 */         .m_171488_(-2.0F, -3.4F, -3.2F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(16, 66)
/*  48 */         .m_171488_(-2.0F, -7.4F, 1.8F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).m_171514_(38, 0)
/*  49 */         .m_171488_(-2.0F, -3.4F, 2.8F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(30, 59)
/*  50 */         .m_171488_(-3.0F, -3.4F, 1.8F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(24, 16)
/*  51 */         .m_171488_(-3.0F, -1.4F, -3.1F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(3, 4)
/*  52 */         .m_171488_(2.0F, -7.4F, 1.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 0)
/*  53 */         .m_171488_(-3.0F, -7.4F, 1.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(19, 0)
/*  54 */         .m_171488_(-3.0F, -7.4F, -5.2F, 6.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).m_171514_(50, 22)
/*  55 */         .m_171488_(2.0F, -6.4F, -5.2F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).m_171514_(55, 5)
/*  56 */         .m_171488_(2.0F, -3.3F, -5.2F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).m_171514_(41, 29)
/*  57 */         .m_171488_(-3.0F, -6.4F, -5.2F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).m_171514_(53, 53)
/*  58 */         .m_171488_(-3.0F, -3.3F, -5.2F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).m_171514_(32, 38)
/*  59 */         .m_171488_(-2.0F, -6.4F, -5.2F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(20, 16)
/*  60 */         .m_171488_(-2.0F, -3.3F, -5.2F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  61 */         PartPose.m_171419_(0.0F, -1.0F, 0.0F));
/*  62 */     PartDefinition cube_r1 = Head.m_171599_("cube_r1", 
/*  63 */         CubeListBuilder.m_171558_().m_171514_(0, 14).m_171488_(-3.0F, -7.4142F, 9.2505F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(69, 39)
/*  64 */         .m_171488_(-3.0F, -7.4142F, 4.2505F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(4, 0)
/*  65 */         .m_171488_(2.0F, -7.4142F, 9.2505F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(46, 65).m_171488_(2.0F, -7.4142F, 4.2505F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), 
/*     */         
/*  67 */         PartPose.m_171423_(0.0F, 1.4F, -0.2F, 0.2618F, 0.0F, 0.0F));
/*  68 */     PartDefinition Body = partdefinition.m_171599_("Body", 
/*  69 */         CubeListBuilder.m_171558_().m_171514_(0, 14).m_171488_(-4.0F, -0.8F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(0, 58)
/*  70 */         .m_171488_(-4.0F, -0.8F, -3.0F, 8.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(43, 23)
/*  71 */         .m_171488_(-3.0F, -0.8F, -3.3F, 6.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(66, 28)
/*  72 */         .m_171488_(-3.0F, 5.2F, -2.6F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  73 */         PartPose.m_171419_(0.0F, -1.0F, 0.0F));
/*  74 */     PartDefinition Tail = Body.m_171599_("Tail", CubeListBuilder.m_171558_(), PartPose.m_171419_(0.0F, 11.0F, 1.0F));
/*  75 */     PartDefinition cube_r2 = Tail.m_171599_("cube_r2", 
/*  76 */         CubeListBuilder.m_171558_().m_171514_(17, 36).m_171488_(-2.3F, 6.7384F, 3.3388F, 4.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)), 
/*  77 */         PartPose.m_171419_(0.5F, -9.0F, -4.0F));
/*  78 */     PartDefinition cube_r3 = Tail.m_171599_("cube_r3", 
/*  79 */         CubeListBuilder.m_171558_().m_171514_(0, 0).m_171488_(-2.8F, 9.9039F, -0.2825F, 5.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)), 
/*  80 */         PartPose.m_171423_(0.5F, -9.0F, -4.0F, 0.7854F, 0.0F, 0.0F));
/*  81 */     PartDefinition cube_r10 = Tail.m_171599_("cube_r10", 
/*  82 */         CubeListBuilder.m_171558_().m_171514_(24, 24).m_171488_(-3.8F, 9.7028F, -4.3744F, 7.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(0, 30)
/*  83 */         .m_171488_(-3.8F, 9.7028F, 0.6256F, 7.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(57, 39).m_171488_(-3.8F, 11.7028F, 5.6256F, 7.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), 
/*     */         
/*  85 */         PartPose.m_171423_(0.5F, -9.0F, -4.0F, 1.5708F, 0.0F, 0.0F));
/*  86 */     PartDefinition uppertailjaw = cube_r10.m_171599_("uppertailjaw", 
/*  87 */         CubeListBuilder.m_171558_().m_171514_(39, 39).m_171488_(-3.8F, -10.2972F, 2.6256F, 7.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  88 */         PartPose.m_171419_(0.0F, 24.0F, 0.0F));
/*  89 */     PartDefinition lowertailjaw = cube_r10.m_171599_("lowertailjaw", 
/*  90 */         CubeListBuilder.m_171558_().m_171514_(57, 32).m_171488_(-3.8F, -10.5518F, -0.741F, 7.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), 
/*  91 */         PartPose.m_171423_(0.0F, 24.0F, 0.0F, -0.1309F, 0.0F, 0.0F));
/*  92 */     PartDefinition LeftArm = partdefinition.m_171599_("LeftArm", 
/*  93 */         CubeListBuilder.m_171558_().m_171514_(45, 0).m_171488_(-3.0F, -3.8F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(59, 22)
/*  94 */         .m_171488_(-3.0F, 7.2F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(40, 58)
/*  95 */         .m_171488_(-3.0F, 4.2F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(22, 1)
/*  96 */         .m_171488_(-3.0F, 10.2F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(19, 4)
/*  97 */         .m_171488_(-1.0F, 10.2F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(62, 55)
/*  98 */         .m_171488_(-3.0F, 9.2F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(19, 2)
/*  99 */         .m_171488_(-3.0F, 10.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(19, 0)
/* 100 */         .m_171488_(-3.0F, 10.2F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 101 */         PartPose.m_171419_(-5.0F, 2.0F, 0.0F));
/* 102 */     PartDefinition RightArm = partdefinition.m_171599_("RightArm", 
/* 103 */         CubeListBuilder.m_171558_().m_171514_(0, 39).m_171488_(-1.0F, -3.8F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(66, 66)
/* 104 */         .m_171488_(-1.0F, 9.2F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(18, 59)
/* 105 */         .m_171488_(-1.0F, 4.2F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(62, 49)
/* 106 */         .m_171488_(-1.0F, 7.2F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(24, 18)
/* 107 */         .m_171488_(0.0F, 10.2F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(24, 24)
/* 108 */         .m_171488_(2.0F, 10.2F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(22, 5)
/* 109 */         .m_171488_(2.0F, 10.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(22, 3)
/* 110 */         .m_171488_(2.0F, 10.2F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 111 */         PartPose.m_171419_(5.0F, 2.0F, 0.0F));
/* 112 */     PartDefinition LeftLeg = partdefinition.m_171599_("LeftLeg", 
/* 113 */         CubeListBuilder.m_171558_().m_171514_(30, 65).m_171488_(-2.0F, -1.8F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
/* 114 */         .m_171514_(0, 65).m_171488_(-2.0F, 10.0F, -2.4102F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 115 */         PartPose.m_171419_(-2.0F, 12.0F, 0.0F));
/* 116 */     PartDefinition cube_r4 = LeftLeg.m_171599_("cube_r4", 
/* 117 */         CubeListBuilder.m_171558_().m_171514_(59, 13).m_171488_(-2.0F, 4.3F, 3.0F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 118 */         PartPose.m_171423_(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 119 */     PartDefinition cube_r5 = LeftLeg.m_171599_("cube_r5", 
/* 120 */         CubeListBuilder.m_171558_().m_171514_(28, 48).m_171488_(-2.0F, 0.0F, -5.8F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 121 */         PartPose.m_171423_(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
/* 122 */     PartDefinition cube_r6 = LeftLeg.m_171599_("cube_r6", 
/* 123 */         CubeListBuilder.m_171558_().m_171514_(44, 48).m_171488_(-2.0F, -0.6F, -2.2F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 124 */         PartPose.m_171423_(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 125 */     PartDefinition RightLeg = partdefinition.m_171599_("RightLeg", 
/* 126 */         CubeListBuilder.m_171558_().m_171514_(64, 6).m_171488_(-2.0F, -1.8F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
/* 127 */         .m_171514_(64, 0).m_171488_(-2.0F, 10.0F, -2.4102F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 128 */         PartPose.m_171419_(2.0F, 12.0F, 0.0F));
/* 129 */     PartDefinition cube_r7 = RightLeg.m_171599_("cube_r7", 
/* 130 */         CubeListBuilder.m_171558_().m_171514_(56, 61).m_171488_(-2.0F, 4.3F, 3.0F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 131 */         PartPose.m_171423_(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 132 */     PartDefinition cube_r8 = RightLeg.m_171599_("cube_r8", 
/* 133 */         CubeListBuilder.m_171558_().m_171514_(12, 47).m_171488_(-2.0F, 0.0F, -5.8F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 134 */         PartPose.m_171423_(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
/* 135 */     PartDefinition cube_r9 = RightLeg.m_171599_("cube_r9", 
/* 136 */         CubeListBuilder.m_171558_().m_171514_(43, 12).m_171488_(-2.0F, -0.6F, -2.2F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 137 */         PartPose.m_171423_(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 138 */     return LayerDefinition.m_171565_(meshdefinition, 128, 128);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void m_7695_(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 144 */     this.Head.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 145 */     this.Body.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 146 */     this.LeftArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 147 */     this.RightArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 148 */     this.LeftLeg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 149 */     this.RightLeg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */   
/*     */   public void m_6973_(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
/* 153 */     this.RightArm.f_104203_ = Mth.m_14089_(limbSwing * 0.6662F + 3.1415927F) * limbSwingAmount;
/* 154 */     this.LeftLeg.f_104203_ = Mth.m_14089_(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
/* 155 */     this.Head.f_104204_ = netHeadYaw / 57.295776F;
/* 156 */     this.Head.f_104203_ = headPitch / 57.295776F;
/* 157 */     this.LeftArm.f_104203_ = Mth.m_14089_(limbSwing * 0.6662F) * limbSwingAmount;
/* 158 */     this.RightLeg.f_104203_ = Mth.m_14089_(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\client\model\ModelAHV_hertx_model.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */