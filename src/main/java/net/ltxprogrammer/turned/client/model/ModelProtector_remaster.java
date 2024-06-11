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
/*     */ public class ModelProtector_remaster<T extends Entity>
/*     */   extends EntityModel<T>
/*     */ {
/*  25 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("turned", "model_protector_remaster"), "main");
/*     */   public final ModelPart RightLeg;
/*     */   public final ModelPart LeftLeg;
/*     */   public final ModelPart RightArm;
/*     */   public final ModelPart LeftArm;
/*     */   public final ModelPart Body;
/*     */   public final ModelPart Head;
/*     */   
/*     */   public ModelProtector_remaster(ModelPart root) {
/*  34 */     this.RightLeg = root.m_171324_("RightLeg");
/*  35 */     this.LeftLeg = root.m_171324_("LeftLeg");
/*  36 */     this.RightArm = root.m_171324_("RightArm");
/*  37 */     this.LeftArm = root.m_171324_("LeftArm");
/*  38 */     this.Body = root.m_171324_("Body");
/*  39 */     this.Head = root.m_171324_("Head");
/*     */   }
/*     */   
/*     */   public static LayerDefinition createBodyLayer() {
/*  43 */     MeshDefinition meshdefinition = new MeshDefinition();
/*  44 */     PartDefinition partdefinition = meshdefinition.m_171576_();
/*  45 */     PartDefinition RightLeg = partdefinition.m_171599_("RightLeg", 
/*  46 */         CubeListBuilder.m_171558_().m_171514_(61, 0).m_171488_(-0.75F, 11.9896F, -2.7744F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
/*  47 */         .m_171514_(8, 50).m_171488_(-0.75F, 12.9896F, -3.7744F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  48 */         PartPose.m_171419_(2.0F, 9.0F, 0.0F));
/*  49 */     PartDefinition cube_r11 = RightLeg.m_171599_("cube_r11", 
/*  50 */         CubeListBuilder.m_171558_().m_171514_(47, 58).m_171488_(-2.0F, -1.0F, -1.0F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/*  51 */         PartPose.m_171423_(1.25F, 10.0398F, 2.347F, -0.7854F, 0.0F, 0.0F));
/*  52 */     PartDefinition cube_r12 = RightLeg.m_171599_("cube_r12", 
/*  53 */         CubeListBuilder.m_171558_().m_171514_(24, 55).m_171488_(-2.0F, 0.0F, -2.0F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  54 */         PartPose.m_171423_(1.625F, 7.6F, 0.0F, 0.3927F, 0.0F, 0.0F));
/*  55 */     PartDefinition cube_r13 = RightLeg.m_171599_("cube_r13", 
/*  56 */         CubeListBuilder.m_171558_().m_171514_(56, 6).m_171488_(-1.625F, -4.0F, -2.375F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), 
/*  57 */         PartPose.m_171423_(1.0F, 2.85F, 0.0F, -0.0436F, 0.0F, 0.0F));
/*  58 */     PartDefinition cube_r14 = RightLeg.m_171599_("cube_r14", 
/*  59 */         CubeListBuilder.m_171558_().m_171514_(0, 40).m_171488_(-1.625F, -3.0F, -2.375F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), 
/*  60 */         PartPose.m_171423_(0.375F, 2.475F, 0.0F, -0.0436F, 0.0F, 0.0F));
/*  61 */     PartDefinition cube_r15 = RightLeg.m_171599_("cube_r15", 
/*  62 */         CubeListBuilder.m_171558_().m_171514_(18, 43).m_171488_(0.375F, -5.0F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  63 */         PartPose.m_171423_(-1.25F, 5.6F, 0.0F, -0.1309F, 0.0F, 0.0F));
/*  64 */     PartDefinition LeftLeg = partdefinition.m_171599_("LeftLeg", 
/*  65 */         CubeListBuilder.m_171558_().m_171514_(56, 40).m_171488_(-3.25F, 11.9896F, -2.7744F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
/*  66 */         .m_171514_(47, 18).m_171488_(-3.25F, 12.9896F, -3.7744F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  67 */         PartPose.m_171419_(-2.0F, 9.0F, 0.0F));
/*  68 */     PartDefinition cube_r6 = LeftLeg.m_171599_("cube_r6", 
/*  69 */         CubeListBuilder.m_171558_().m_171514_(52, 18).m_171488_(-1.375F, -4.0F, -2.375F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), 
/*  70 */         PartPose.m_171423_(-1.0F, 2.85F, 0.0F, -0.0436F, 0.0F, 0.0F));
/*  71 */     PartDefinition cube_r7 = LeftLeg.m_171599_("cube_r7", 
/*  72 */         CubeListBuilder.m_171558_().m_171514_(54, 31).m_171488_(-2.0F, -1.0F, -1.0F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/*  73 */         PartPose.m_171423_(-1.25F, 10.0398F, 2.347F, -0.7854F, 0.0F, 0.0F));
/*  74 */     PartDefinition cube_r8 = LeftLeg.m_171599_("cube_r8", 
/*  75 */         CubeListBuilder.m_171558_().m_171514_(10, 55).m_171488_(-1.0F, 0.0F, -2.0F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  76 */         PartPose.m_171423_(-1.625F, 7.6F, 0.0F, 0.3927F, 0.0F, 0.0F));
/*  77 */     PartDefinition cube_r9 = LeftLeg.m_171599_("cube_r9", 
/*  78 */         CubeListBuilder.m_171558_().m_171514_(34, 17).m_171488_(-2.375F, -3.0F, -2.375F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), 
/*  79 */         PartPose.m_171423_(-0.375F, 2.475F, 0.0F, -0.0436F, 0.0F, 0.0F));
/*  80 */     PartDefinition cube_r10 = LeftLeg.m_171599_("cube_r10", 
/*  81 */         CubeListBuilder.m_171558_().m_171514_(38, 28).m_171488_(-4.375F, -5.0F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  82 */         PartPose.m_171423_(1.25F, 5.6F, 0.0F, -0.1309F, 0.0F, 0.0F));
/*  83 */     PartDefinition RightArm = partdefinition.m_171599_("RightArm", 
/*  84 */         CubeListBuilder.m_171558_().m_171514_(35, 61).m_171488_(-1.1736F, -1.4152F, -1.5F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/*  85 */         PartPose.m_171423_(5.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1745F));
/*  86 */     PartDefinition wrist_r = RightArm.m_171599_("wrist_r", 
/*  87 */         CubeListBuilder.m_171558_().m_171514_(14, 27).m_171488_(-1.8264F, 6.0152F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(27, 17)
/*  88 */         .m_171488_(0.1736F, 6.0152F, 1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 30)
/*  89 */         .m_171488_(0.1736F, 6.0152F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(14, 30)
/*  90 */         .m_171488_(0.1736F, 6.0152F, -2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(34, 48)
/*  91 */         .m_171488_(-1.8264F, -0.9848F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  92 */         PartPose.m_171419_(0.6527F, 5.5696F, 0.0F));
/*  93 */     PartDefinition LeftArm = partdefinition.m_171599_("LeftArm", 
/*  94 */         CubeListBuilder.m_171558_().m_171514_(0, 61).m_171488_(-1.8264F, -1.4152F, -1.5F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/*  95 */         PartPose.m_171423_(-5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1745F));
/*  96 */     PartDefinition wrist_l = LeftArm.m_171599_("wrist_l", 
/*  97 */         CubeListBuilder.m_171558_().m_171514_(45, 0).m_171488_(-2.1736F, -0.9848F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(0, 27)
/*  98 */         .m_171488_(0.8264F, 6.0152F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(21, 13)
/*  99 */         .m_171488_(-2.1736F, 6.0152F, -2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 18)
/* 100 */         .m_171488_(-2.1736F, 6.0152F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(4, 0)
/* 101 */         .m_171488_(-2.1736F, 6.0152F, 1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 102 */         PartPose.m_171419_(-0.6527F, 5.5696F, 0.0F));
/* 103 */     PartDefinition Body = partdefinition.m_171599_("Body", 
/* 104 */         CubeListBuilder.m_171558_().m_171514_(19, 0).m_171488_(-4.0F, 1.6F, -2.5F, 8.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(61, 58)
/* 105 */         .m_171488_(-2.0F, -0.9F, -1.375F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).m_171514_(0, 27)
/* 106 */         .m_171488_(2.0F, -0.4F, -3.875F, 3.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)).m_171514_(0, 50)
/* 107 */         .m_171488_(5.0F, 0.6F, -2.875F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(48, 42)
/* 108 */         .m_171488_(-6.0F, 0.6F, -2.875F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(50, 51)
/* 109 */         .m_171488_(-3.0F, 0.85F, -3.375F, 6.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(20, 19)
/* 110 */         .m_171488_(-5.0F, -0.4F, -3.875F, 3.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)).m_171514_(50, 25)
/* 111 */         .m_171488_(-4.0F, 0.35F, 2.0F, 8.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(47, 13)
/* 112 */         .m_171488_(-3.5F, 12.6F, -1.875F, 7.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(25, 10)
/* 113 */         .m_171488_(-3.5F, 10.6F, -2.0F, 7.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(34, 40)
/* 114 */         .m_171488_(-3.0F, 6.6F, -2.0F, 6.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 115 */         PartPose.m_171419_(0.0F, -3.0F, 0.0F));
/* 116 */     PartDefinition cube_r2 = Body.m_171599_("cube_r2", 
/* 117 */         CubeListBuilder.m_171558_().m_171514_(62, 46).m_171488_(-3.0F, -3.0F, 1.0F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 118 */         PartPose.m_171423_(0.5F, 5.4422F, 0.6788F, -0.4363F, 0.0F, 0.0F));
/* 119 */     PartDefinition cube_r3 = Body.m_171599_("cube_r3", 
/* 120 */         CubeListBuilder.m_171558_().m_171514_(61, 63).m_171488_(-3.0F, -3.0F, 1.0F, 5.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 121 */         PartPose.m_171423_(0.5F, 9.1922F, 0.4288F, 0.1745F, 0.0F, 0.0F));
/* 122 */     PartDefinition Tail = Body.m_171599_("Tail", CubeListBuilder.m_171558_(), PartPose.m_171419_(0.0F, 2.6F, 0.0F));
/* 123 */     PartDefinition cube_r4 = Tail.m_171599_("cube_r4", 
/* 124 */         CubeListBuilder.m_171558_().m_171514_(0, 0).m_171488_(-2.0F, -0.875F, -5.375F, 4.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), 
/* 125 */         PartPose.m_171423_(0.0F, 17.3866F, 11.9212F, -0.5236F, 0.0F, 0.0F));
/* 126 */     PartDefinition cube_r5 = Tail.m_171599_("cube_r5", 
/* 127 */         CubeListBuilder.m_171558_().m_171514_(14, 32).m_171488_(-2.0F, 5.0F, 8.0F, 4.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), 
/* 128 */         PartPose.m_171423_(0.0F, -1.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
/* 129 */     PartDefinition Head = partdefinition.m_171599_("Head", 
/* 130 */         CubeListBuilder.m_171558_().m_171514_(0, 13).m_171488_(-3.5F, -6.4F, -3.5F, 7.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), 
/* 131 */         PartPose.m_171419_(0.0F, -3.0F, 0.0F));
/* 132 */     PartDefinition Ears = Head.m_171599_("Ears", CubeListBuilder.m_171558_(), PartPose.m_171419_(0.0F, 0.6F, 0.0F));
/* 133 */     PartDefinition cube_r1 = Ears.m_171599_("cube_r1", 
/* 134 */         CubeListBuilder.m_171558_().m_171514_(6, 8).m_171488_(3.5F, -11.0F, 1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(6, 2)
/* 135 */         .m_171488_(3.5F, -9.0F, 1.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(12, 64)
/* 136 */         .m_171488_(3.5F, -12.0F, -0.5F, 1.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(0, 13)
/* 137 */         .m_171488_(3.5F, -6.0F, 1.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(19, 0)
/* 138 */         .m_171488_(-4.5F, -11.0F, 1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(6, 5)
/* 139 */         .m_171488_(-4.5F, -9.0F, 1.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(21, 15)
/* 140 */         .m_171488_(-4.5F, -6.0F, 1.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(0, 0).m_171488_(-4.5F, -12.0F, -0.5F, 1.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), 
/*     */         
/* 142 */         PartPose.m_171423_(0.0F, 0.0F, 0.0F, 0.3927F, 0.0F, 0.0F));
/* 143 */     return LayerDefinition.m_171565_(meshdefinition, 80, 80);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void m_7695_(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 149 */     this.RightLeg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 150 */     this.LeftLeg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 151 */     this.RightArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 152 */     this.LeftArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 153 */     this.Body.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 154 */     this.Head.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */   
/*     */   public void m_6973_(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
/* 158 */     this.LeftLeg.f_104203_ = Mth.m_14089_(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
/* 159 */     this.RightArm.f_104203_ = Mth.m_14089_(limbSwing * 0.6662F + 3.1415927F) * limbSwingAmount;
/* 160 */     this.Head.f_104204_ = netHeadYaw / 57.295776F;
/* 161 */     this.Head.f_104203_ = headPitch / 57.295776F;
/* 162 */     this.RightLeg.f_104203_ = Mth.m_14089_(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
/* 163 */     this.LeftArm.f_104203_ = Mth.m_14089_(limbSwing * 0.6662F) * limbSwingAmount;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\client\model\ModelProtector_remaster.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */