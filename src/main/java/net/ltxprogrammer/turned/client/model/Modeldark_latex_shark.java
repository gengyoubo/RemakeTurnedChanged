/*     */ package net.ltxprogrammer.turned.client.model;
/*     */ 
/*     */ import com.mojang.blaze3d.vertex.PoseStack;
/*     */ import com.mojang.blaze3d.vertex.VertexConsumer;
/*     */ import net.ltxprogrammer.changed.client.renderer.model.LatexHumanoidModel;
/*     */ import net.ltxprogrammer.changed.client.renderer.model.LatexHumanoidModelController;
/*     */ import net.ltxprogrammer.changed.client.renderer.model.LatexHumanoidModelInterface;
/*     */ import net.ltxprogrammer.changed.entity.LatexEntity;
/*     */ import net.ltxprogrammer.turned.entity.DlsharkEntity;
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
/*     */ public class Modeldark_latex_shark
/*     */   extends LatexHumanoidModel<DlsharkEntity>
/*     */   implements LatexHumanoidModelInterface
/*     */ {
/*  27 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("turned", "modeldark_latex_shark"), "main");
/*     */   public final ModelPart Head;
/*     */   public final ModelPart Torso;
/*     */   public final ModelPart LeftArm;
/*     */   public final ModelPart RightArm;
/*     */   public final ModelPart LeftLeg;
/*     */   public final ModelPart RightLeg;
/*     */   private final LatexHumanoidModelController controller;
/*     */   
/*     */   public Modeldark_latex_shark(ModelPart root) {
/*  37 */     super(root);
/*  38 */     this.Head = root.m_171324_("Head");
/*  39 */     this.Torso = root.m_171324_("Torso");
/*  40 */     this.LeftArm = root.m_171324_("LeftArm");
/*  41 */     this.RightArm = root.m_171324_("RightArm");
/*  42 */     this.LeftLeg = root.m_171324_("LeftLeg");
/*  43 */     this.RightLeg = root.m_171324_("RightLeg");
/*  44 */     this.controller = LatexHumanoidModelController.Builder.of((EntityModel)this, this.Head, this.Torso, this.Torso.m_171324_("Tail"), this.RightArm, this.LeftArm, this.RightLeg, this.LeftLeg).hipOffset(0.0F).tailAidsInSwim().build();
/*     */   }
/*     */   
/*     */   public static LayerDefinition createBodyLayer() {
/*  48 */     MeshDefinition meshdefinition = new MeshDefinition();
/*  49 */     PartDefinition partdefinition = meshdefinition.m_171576_();
/*     */     
/*  51 */     PartDefinition Head = partdefinition.m_171599_("Head", CubeListBuilder.m_171558_().m_171514_(0, 16).m_171488_(-4.1F, -33.9F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(0.0F, 24.0F, 0.0F));
/*     */     
/*  53 */     PartDefinition cube_r1 = Head.m_171599_("cube_r1", CubeListBuilder.m_171558_().m_171514_(16, 49).m_171488_(-4.8F, -5.4F, 8.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
/*  54 */         .m_171514_(12, 47).m_171488_(2.8F, -5.4F, 8.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
/*  55 */         .m_171514_(16, 47).m_171488_(-4.8F, -5.4F, 2.0F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F))
/*  56 */         .m_171514_(50, 45).m_171488_(2.8F, -5.4F, 2.0F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.5F, -26.0F, 0.0F, 0.3927F, 0.0F, 0.0F));
/*     */     
/*  58 */     PartDefinition cube_r2 = Head.m_171599_("cube_r2", CubeListBuilder.m_171558_().m_171514_(0, 0).m_171488_(0.0F, -7.65F, 2.25F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
/*  59 */         .m_171514_(36, 35).m_171488_(0.0F, -5.65F, 9.25F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
/*  60 */         .m_171514_(24, 51).m_171488_(0.0F, -6.65F, 3.25F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-0.5F, -26.0F, -2.5F, 0.3927F, 0.0F, 0.0F));
/*     */     
/*  62 */     PartDefinition cube_r3 = Head.m_171599_("cube_r3", CubeListBuilder.m_171558_().m_171514_(0, 22).m_171488_(0.0F, -5.9F, 8.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-0.5F, -23.754F, 0.1726F, 0.3927F, 0.0F, 0.0F));
/*     */     
/*  64 */     PartDefinition cube_r4 = Head.m_171599_("cube_r4", CubeListBuilder.m_171558_().m_171514_(4, 22).m_171488_(-5.1F, -2.1F, 2.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
/*  65 */         .m_171514_(52, 54).m_171488_(-5.1F, -2.1F, -1.9F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, -26.0F, 0.0F, 0.0F, -0.3927F, 0.0F));
/*     */     
/*  67 */     PartDefinition cube_r5 = Head.m_171599_("cube_r5", CubeListBuilder.m_171558_().m_171514_(24, 22).m_171488_(4.1F, -2.1F, 2.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
/*  68 */         .m_171514_(52, 17).m_171488_(3.1F, -2.1F, -1.9F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, -26.0F, 0.0F, 0.0F, 0.3927F, 0.0F));
/*     */     
/*  70 */     PartDefinition mask = Head.m_171599_("mask", CubeListBuilder.m_171558_().m_171514_(21, 12).m_171488_(-5.0F, -4.0F, -4.1F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  71 */         .m_171514_(0, 11).m_171488_(-3.0F, -3.0F, -4.1F, 6.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
/*  72 */         .m_171514_(10, 6).m_171488_(-2.0F, -1.0F, -4.1F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  73 */         .m_171514_(10, 7).m_171488_(1.0F, -1.0F, -4.1F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  74 */         .m_171514_(29, 12).m_171488_(3.0F, -4.0F, -4.1F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  75 */         .m_171514_(0, 7).m_171488_(3.0F, -5.0F, -4.1F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  76 */         .m_171514_(21, 9).m_171488_(-2.0F, -5.0F, -4.1F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  77 */         .m_171514_(21, 8).m_171488_(-2.0F, -7.0F, -4.1F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  78 */         .m_171514_(21, 11).m_171488_(-3.0F, -6.0F, -4.1F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  79 */         .m_171514_(25, 12).m_171488_(-1.0F, -8.0F, -4.1F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  80 */         .m_171514_(3, 0).m_171488_(-0.5F, -9.0F, -4.1F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  81 */         .m_171514_(27, 3).m_171488_(-1.0F, -4.0F, -4.1F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  82 */         .m_171514_(0, 6).m_171488_(-4.0F, -5.0F, -4.1F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(0.0F, -26.0F, 0.0F));
/*     */     
/*  84 */     PartDefinition Torso = partdefinition.m_171599_("Torso", CubeListBuilder.m_171558_().m_171514_(0, 32).m_171488_(-4.0F, -25.0F, -2.0F, 8.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(0.0F, 25.0F, 0.0F));
/*     */     
/*  86 */     PartDefinition cube_r6 = Torso.m_171599_("cube_r6", CubeListBuilder.m_171558_().m_171514_(0, 56).m_171488_(0.0F, -0.5F, 1.875F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
/*  87 */         .m_171514_(21, 0).m_171488_(0.0F, 3.5F, 5.875F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
/*  88 */         .m_171514_(0, 0).m_171488_(0.0F, 1.5F, 4.875F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
/*  89 */         .m_171514_(0, 16).m_171488_(0.0F, 0.5F, 2.875F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-0.5F, -25.0F, 0.0F, -0.1309F, 0.0F, 0.0F));
/*     */     
/*  91 */     PartDefinition Tail = Torso.m_171599_("Tail", CubeListBuilder.m_171558_(), PartPose.m_171419_(0.0F, -15.0F, 0.0F));
/*     */     
/*  93 */     PartDefinition cube_r7 = Tail.m_171599_("cube_r7", CubeListBuilder.m_171558_().m_171514_(53, 0).m_171488_(-1.5375F, -0.5405F, 10.9885F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
/*  94 */         .m_171514_(21, 0).m_171488_(-2.5375F, -0.5405F, 0.9885F, 5.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, 7.3374F, 13.8717F, -0.0197F, 0.5618F, -1.4878F));
/*     */     
/*  96 */     PartDefinition cube_r8 = Tail.m_171599_("cube_r8", CubeListBuilder.m_171558_().m_171514_(4, 16).m_171488_(-1.4625F, -0.5405F, 7.9885F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
/*  97 */         .m_171514_(24, 11).m_171488_(-1.4625F, -0.5405F, -2.0115F, 3.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, 7.3374F, 13.8717F, -0.0197F, -0.5618F, -1.6538F));
/*     */     
/*  99 */     PartDefinition cube_r9 = Tail.m_171599_("cube_r9", CubeListBuilder.m_171558_().m_171514_(24, 24).m_171488_(-2.5F, 7.25F, 3.75F, 6.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-0.5F, -3.4937F, 7.4678F, -0.1745F, 0.0F, 0.0F));
/*     */     
/* 101 */     PartDefinition cube_r10 = Tail.m_171599_("cube_r10", CubeListBuilder.m_171558_().m_171514_(21, 0).m_171488_(0.0F, 1.25F, 10.75F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-0.5F, -10.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
/*     */     
/* 103 */     PartDefinition cube_r11 = Tail.m_171599_("cube_r11", CubeListBuilder.m_171558_().m_171514_(0, 0).m_171488_(-1.5F, 7.25F, 3.75F, 4.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-0.5F, -10.0F, 0.0F, -0.5236F, 0.0F, 0.0F));
/*     */     
/* 105 */     PartDefinition LeftArm = partdefinition.m_171599_("RightArm", CubeListBuilder.m_171558_().m_171514_(40, 35).m_171488_(-8.0F, -26.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
/* 106 */         .m_171514_(28, 22).m_171488_(-8.0F, -14.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
/* 107 */         .m_171514_(30, 19).m_171488_(-8.0F, -14.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(0.0F, 25.0F, 0.0F));
/*     */     
/* 109 */     PartDefinition cube_r12 = LeftArm.m_171599_("cube_r12", CubeListBuilder.m_171558_().m_171514_(30, 16).m_171488_(-5.5F, -2.7F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
/* 110 */         .m_171514_(7, 0).m_171488_(-5.5F, -0.7F, -1.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-5.0F, -24.0F, 0.0F, 0.0F, 0.0F, -0.5672F));
/*     */     
/* 112 */     PartDefinition RightArm = partdefinition.m_171599_("LeftArm", CubeListBuilder.m_171558_().m_171514_(24, 35).m_171488_(4.0F, -26.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
/* 113 */         .m_171514_(20, 32).m_171488_(7.0F, -14.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
/* 114 */         .m_171514_(0, 32).m_171488_(7.0F, -14.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(0.0F, 25.0F, 0.0F));
/*     */     
/* 116 */     PartDefinition cube_r13 = RightArm.m_171599_("cube_r13", CubeListBuilder.m_171558_().m_171514_(27, 0).m_171488_(4.5F, -2.7F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
/* 117 */         .m_171514_(24, 16).m_171488_(3.5F, -0.7F, -1.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(5.0F, -24.0F, 0.0F, 0.0F, 0.0F, 0.5672F));
/*     */     
/* 119 */     PartDefinition LeftLeg = partdefinition.m_171599_("RightLeg", CubeListBuilder.m_171558_().m_171514_(0, 47).m_171488_(-2.0F, -1.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(-2.0F, 12.0F, 0.0F));
/*     */     
/* 121 */     PartDefinition cube_r14 = LeftLeg.m_171599_("cube_r14", CubeListBuilder.m_171558_().m_171514_(52, 10).m_171488_(-2.0F, 0.0F, 0.0F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-0.03F, 9.8745F, 0.96F, -1.5708F, 0.0F, 0.0F));
/*     */     
/* 123 */     PartDefinition cube_r15 = LeftLeg.m_171599_("cube_r15", CubeListBuilder.m_171558_().m_171514_(52, 31).m_171488_(-2.0F, -1.0F, -1.0F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-0.03F, 7.4835F, 1.8083F, -0.6545F, 0.0F, 0.0F));
/*     */     
/* 125 */     PartDefinition cube_r16 = LeftLeg.m_171599_("cube_r16", CubeListBuilder.m_171558_().m_171514_(40, 11).m_171488_(-2.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-0.03F, 4.9635F, 0.2358F, 0.48F, 0.0F, 0.0F));
/*     */     
/* 127 */     PartDefinition RightLeg = partdefinition.m_171599_("LeftLeg", CubeListBuilder.m_171558_().m_171514_(44, 22).m_171488_(-2.0F, -1.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(2.0F, 12.0F, 0.0F));
/*     */     
/* 129 */     PartDefinition cube_r17 = RightLeg.m_171599_("cube_r17", CubeListBuilder.m_171558_().m_171514_(0, 6).m_171488_(-2.0F, 0.0F, 0.0F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.03F, 9.8745F, 0.96F, -1.5708F, 0.0F, 0.0F));
/*     */     
/* 131 */     PartDefinition cube_r18 = RightLeg.m_171599_("cube_r18", CubeListBuilder.m_171558_().m_171514_(38, 51).m_171488_(-2.0F, -1.0F, -1.0F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.03F, 7.4835F, 1.8083F, -0.6545F, 0.0F, 0.0F));
/*     */     
/* 133 */     PartDefinition cube_r19 = RightLeg.m_171599_("cube_r19", CubeListBuilder.m_171558_().m_171514_(41, 0).m_171488_(-2.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.03F, 4.9635F, 0.2358F, 0.48F, 0.0F, 0.0F));
/* 134 */     return LayerDefinition.m_171565_(process(meshdefinition), 128, 128);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void m_7695_(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 140 */     this.Head.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 141 */     this.Torso.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 142 */     this.LeftArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 143 */     this.RightArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 144 */     this.LeftLeg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 145 */     this.RightLeg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */ 
/*     */   
/*     */   public void prepareMobModel(DlsharkEntity p_102861_, float p_102862_, float p_102863_, float p_102864_) {
/* 150 */     prepareMobModel(this.controller, (LatexEntity)p_102861_, p_102862_, p_102863_, p_102864_);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setupAnim(DlsharkEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float HeadPitch) {
/* 155 */     this.controller.setupAnim((LatexEntity)entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, HeadPitch);
/*     */   }
/*     */ 
/*     */   
/*     */   public ModelPart getArm(HumanoidArm humanoidArm) {
/* 160 */     switch (humanoidArm) { default: throw new IncompatibleClassChangeError();case LEFT: case RIGHT: break; }  return 
/*     */       
/* 162 */       this.RightArm;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setupHand() {
/* 168 */     this.controller.setupHand();
/*     */   }
/*     */ 
/*     */   
/*     */   public LatexHumanoidModelController getController() {
/* 173 */     return this.controller;
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6002_(HumanoidArm p_102108_, PoseStack p_102109_) {
/* 178 */     getArm(p_102108_).m_104299_(p_102109_);
/*     */   }
/*     */ 
/*     */   
/*     */   public ModelPart m_5585_() {
/* 183 */     return this.Head;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\client\model\Modeldark_latex_shark.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */