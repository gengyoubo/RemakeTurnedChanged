/*     */ package net.ltxprogrammer.turned.client.model;
/*     */ 
/*     */ import com.mojang.blaze3d.vertex.PoseStack;
/*     */ import com.mojang.blaze3d.vertex.VertexConsumer;
/*     */ import net.ltxprogrammer.changed.client.renderer.model.LatexHumanoidModel;
/*     */ import net.ltxprogrammer.changed.client.renderer.model.LatexHumanoidModelController;
/*     */ import net.ltxprogrammer.changed.client.renderer.model.LatexHumanoidModelInterface;
/*     */ import net.ltxprogrammer.changed.entity.LatexEntity;
/*     */ import net.ltxprogrammer.turned.entity.DLbeeEntity;
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
/*     */ import net.minecraft.world.entity.HumanoidArm;
/*     */ 
/*     */ public class ModelDark_latex_bee
/*     */   extends LatexHumanoidModel<DLbeeEntity>
/*     */   implements LatexHumanoidModelInterface
/*     */ {
/*  27 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("turned", "model_dark_latex_bee"), "main");
/*     */   public final ModelPart Head;
/*     */   public final ModelPart Body;
/*     */   public final ModelPart LeftArm;
/*     */   public final ModelPart RightArm;
/*     */   public final ModelPart LeftLeg;
/*     */   public final ModelPart RightLeg;
/*     */   public final LatexHumanoidModelController controller;
/*     */   
/*     */   public ModelDark_latex_bee(ModelPart root) {
/*  37 */     super(root);
/*  38 */     this.Head = root.m_171324_("Head");
/*  39 */     this.Body = root.m_171324_("Body");
/*  40 */     this.LeftArm = root.m_171324_("LeftArm");
/*  41 */     this.RightArm = root.m_171324_("RightArm");
/*  42 */     this.LeftLeg = root.m_171324_("LeftLeg");
/*  43 */     this.RightLeg = root.m_171324_("RightLeg");
/*  44 */     this.controller = LatexHumanoidModelController.Builder.of((EntityModel)this, this.Head, this.Body, this.Body.m_171324_("Tail"), this.RightArm, this.LeftArm, this.RightLeg, this.LeftLeg).hipOffset(-1.0F).build();
/*     */   }
/*     */   
/*     */   public static LayerDefinition createBodyLayer() {
/*  48 */     MeshDefinition meshdefinition = new MeshDefinition();
/*  49 */     PartDefinition partdefinition = meshdefinition.m_171576_();
/*     */     
/*  51 */     PartDefinition Head = partdefinition.m_171599_("Head", CubeListBuilder.m_171558_().m_171514_(0, 0).m_171488_(-4.0F, -8.0F, -4.0F, 8.0F, 6.0F, 8.0F, new CubeDeformation(0.0F))
/*  52 */         .m_171514_(18, 24).m_171488_(-4.0F, -2.0F, -1.0F, 8.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(0.0F, 0.0F, 0.0F));
/*     */     
/*  54 */     PartDefinition cube_r1 = Head.m_171599_("cube_r1", CubeListBuilder.m_171558_().m_171514_(0, 14).m_171488_(3.0F, -12.0F, -2.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-0.2F, -11.2403F, 2.7827F, 1.6144F, 0.0F, 0.0F));
/*     */     
/*  56 */     PartDefinition cube_r2 = Head.m_171599_("cube_r2", CubeListBuilder.m_171558_().m_171514_(18, 37).m_171488_(3.0F, -12.0F, -2.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-6.8F, -11.2403F, 2.7827F, 1.6144F, 0.0F, 0.0F));
/*     */     
/*  58 */     PartDefinition cube_r3 = Head.m_171599_("cube_r3", CubeListBuilder.m_171558_().m_171514_(18, 24).m_171488_(3.0F, -12.0F, -2.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-6.8F, 0.0F, 1.7F, 0.5236F, 0.0F, 0.0F));
/*     */     
/*  60 */     PartDefinition cube_r4 = Head.m_171599_("cube_r4", CubeListBuilder.m_171558_().m_171514_(22, 37).m_171488_(3.0F, -12.0F, -0.3F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-0.2F, 1.0F, 0.2F, 0.5236F, 0.0F, 0.0F));
/*     */     
/*  62 */     PartDefinition cube_r5 = Head.m_171599_("cube_r5", CubeListBuilder.m_171558_().m_171514_(48, 0).m_171488_(-4.0F, -2.0F, -4.0F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-0.1895F, 0.341F, 0.0F, 0.0F, 0.0F, 0.0873F));
/*     */     
/*  64 */     PartDefinition cube_r6 = Head.m_171599_("cube_r6", CubeListBuilder.m_171558_().m_171514_(48, 9).m_171488_(0.0F, -2.0F, -4.0F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.1895F, 0.341F, 0.0F, 0.0F, 0.0F, -0.0873F));
/*     */     
/*  66 */     PartDefinition Mask = Head.m_171599_("Mask", CubeListBuilder.m_171558_().m_171514_(36, 31).m_171488_(-4.0F, -5.0F, -4.5F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F))
/*  67 */         .m_171514_(26, 19).m_171488_(-3.0F, -3.0F, -4.5F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  68 */         .m_171514_(36, 20).m_171488_(-1.0F, -5.0F, -4.5F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
/*  69 */         .m_171514_(26, 14).m_171488_(3.0F, -5.0F, -4.5F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F))
/*  70 */         .m_171514_(32, 8).m_171488_(-5.0F, -6.0F, -4.5F, 10.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  71 */         .m_171514_(0, 7).m_171488_(-2.0F, -7.0F, -4.5F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(0.0F, 0.0F, 0.0F));
/*     */     
/*  73 */     PartDefinition Body = partdefinition.m_171599_("Body", CubeListBuilder.m_171558_().m_171514_(28, 10).m_171488_(-4.0F, 0.0F, -2.0F, 8.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
/*  74 */         .m_171514_(0, 14).m_171488_(-5.0F, -1.0F, -3.0F, 10.0F, 4.0F, 6.0F, new CubeDeformation(0.0F))
/*  75 */         .m_171514_(39, 19).m_171488_(-3.0F, 5.0F, -2.0F, 6.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
/*  76 */         .m_171514_(24, 0).m_171488_(-4.0F, 8.0F, -2.0F, 8.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(0.0F, 0.0F, 0.0F));
/*     */     
/*  78 */     PartDefinition Wings = Body.m_171599_("Wings", CubeListBuilder.m_171558_(), PartPose.m_171419_(0.0F, 0.0F, 0.0F));
/*     */     
/*  80 */     PartDefinition cube_r7 = Wings.m_171599_("cube_r7", CubeListBuilder.m_171558_().m_171514_(0, 31).m_171488_(-10.3F, 2.5F, 1.4F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  81 */         .m_171514_(18, 31).m_171488_(-7.3F, 1.5F, 1.4F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  82 */         .m_171514_(6, 6).m_171488_(-4.3F, 0.5F, 1.4F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  83 */         .m_171514_(0, 37).m_171488_(-3.3F, 3.5F, 1.4F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
/*  84 */         .m_171514_(6, 0).m_171488_(-4.3F, 1.5F, 1.4F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F))
/*  85 */         .m_171514_(4, 14).m_171488_(-5.3F, 2.5F, 1.4F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F))
/*  86 */         .m_171514_(14, 37).m_171488_(-7.3F, 2.5F, 1.4F, 2.0F, 7.0F, 0.0F, new CubeDeformation(0.0F))
/*  87 */         .m_171514_(0, 0).m_171488_(-10.3F, 3.5F, 1.4F, 3.0F, 7.0F, 0.0F, new CubeDeformation(0.0F))
/*  88 */         .m_171514_(6, 24).m_171488_(-11.3F, 3.5F, 1.4F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));
/*     */     
/*  90 */     PartDefinition cube_r8 = Wings.m_171599_("cube_r8", CubeListBuilder.m_171558_().m_171514_(0, 24).m_171488_(7.3F, 2.5F, 1.4F, 3.0F, 7.0F, 0.0F, new CubeDeformation(0.0F))
/*  91 */         .m_171514_(32, 23).m_171488_(4.3F, 1.5F, 1.4F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  92 */         .m_171514_(0, 19).m_171488_(3.3F, 0.5F, 1.4F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  93 */         .m_171514_(2, 37).m_171488_(2.3F, 3.5F, 1.4F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
/*  94 */         .m_171514_(42, 50).m_171488_(3.3F, 1.5F, 1.4F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F))
/*  95 */         .m_171514_(44, 50).m_171488_(4.3F, 2.5F, 1.4F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F))
/*  96 */         .m_171514_(40, 37).m_171488_(5.3F, 2.5F, 1.4F, 2.0F, 7.0F, 0.0F, new CubeDeformation(0.0F))
/*  97 */         .m_171514_(32, 9).m_171488_(7.3F, 9.5F, 1.4F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  98 */         .m_171514_(46, 50).m_171488_(10.3F, 3.5F, 1.4F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));
/*     */     
/* 100 */     PartDefinition Tail = Body.m_171599_("Tail", CubeListBuilder.m_171558_(), PartPose.m_171419_(0.0F, 0.0F, 0.0F));
/*     */     
/* 102 */     PartDefinition cube_r9 = Tail.m_171599_("cube_r9", CubeListBuilder.m_171558_().m_171514_(0, 24).m_171488_(-2.5F, 7.0F, 4.75F, 5.0F, 5.0F, 8.0F, new CubeDeformation(0.0F))
/* 103 */         .m_171514_(32, 20).m_171488_(-0.5F, 9.0F, 12.75F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/*     */     
/* 105 */     PartDefinition LeftArm = partdefinition.m_171599_("RightArm", CubeListBuilder.m_171558_().m_171514_(0, 37).m_171488_(-2.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(-5.0F, 2.0F, 0.0F));
/*     */     
/* 107 */     PartDefinition RightArm = partdefinition.m_171599_("LeftArm", CubeListBuilder.m_171558_().m_171514_(26, 31).m_171488_(-1.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(5.0F, 2.0F, 0.0F));
/*     */     
/* 109 */     PartDefinition LeftLeg = partdefinition.m_171599_("RightLeg", CubeListBuilder.m_171558_().m_171514_(40, 27).m_171488_(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F))
/* 110 */         .m_171514_(28, 47).m_171488_(-1.0F, 6.0F, -2.0F, 3.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(-2.0F, 12.0F, 0.0F));
/*     */     
/* 112 */     PartDefinition cube_r10 = LeftLeg.m_171599_("cube_r10", CubeListBuilder.m_171558_().m_171514_(24, 0).m_171488_(0.0F, 4.0F, 3.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/*     */     
/* 114 */     PartDefinition RightLeg = partdefinition.m_171599_("LeftLeg", CubeListBuilder.m_171558_().m_171514_(40, 40).m_171488_(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F))
/* 115 */         .m_171514_(14, 43).m_171488_(-2.0F, 6.0F, -2.0F, 3.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(2.0F, 12.0F, 0.0F));
/*     */     
/* 117 */     PartDefinition cube_r11 = RightLeg.m_171599_("cube_r11", CubeListBuilder.m_171558_().m_171514_(26, 31).m_171488_(-1.0F, 4.0F, 3.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/*     */     
/* 119 */     return LayerDefinition.m_171565_(meshdefinition, 64, 64);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void m_7695_(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 125 */     this.Head.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 126 */     this.Body.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 127 */     this.LeftArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 128 */     this.RightArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 129 */     this.LeftLeg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 130 */     this.RightLeg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */ 
/*     */   
/*     */   public void prepareMobModel(DLbeeEntity p_102861_, float p_102862_, float p_102863_, float p_102864_) {
/* 135 */     prepareMobModel(this.controller, (LatexEntity)p_102861_, p_102862_, p_102863_, p_102864_);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setupAnim(DLbeeEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float HeadPitch) {
/* 140 */     this.controller.setupAnim((LatexEntity)entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, HeadPitch);
/*     */   }
/*     */ 
/*     */   
/*     */   public ModelPart getArm(HumanoidArm humanoidArm) {
/* 145 */     switch (humanoidArm) { default: throw new IncompatibleClassChangeError();case LEFT: case RIGHT: break; }  return 
/*     */       
/* 147 */       this.RightArm;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setupHand() {
/* 153 */     this.controller.setupHand();
/*     */   }
/*     */ 
/*     */   
/*     */   public LatexHumanoidModelController getController() {
/* 158 */     return this.controller;
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6002_(HumanoidArm p_102108_, PoseStack p_102109_) {
/* 163 */     getArm(p_102108_).m_104299_(p_102109_);
/*     */   }
/*     */ 
/*     */   
/*     */   public ModelPart m_5585_() {
/* 168 */     return this.Head;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\client\model\ModelDark_latex_bee.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */