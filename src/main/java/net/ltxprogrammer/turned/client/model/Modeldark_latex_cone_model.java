/*     */ package net.ltxprogrammer.turned.client.model;
/*     */ 
/*     */ import com.mojang.blaze3d.vertex.PoseStack;
/*     */ import com.mojang.blaze3d.vertex.VertexConsumer;
/*     */ import net.ltxprogrammer.changed.client.renderer.model.LatexHumanoidModel;
/*     */ import net.ltxprogrammer.changed.client.renderer.model.LatexHumanoidModelController;
/*     */ import net.ltxprogrammer.changed.client.renderer.model.LatexHumanoidModelInterface;
/*     */ import net.ltxprogrammer.changed.entity.LatexEntity;
/*     */ import net.ltxprogrammer.turned.entity.DarklatexconeEntity;
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
/*     */ public class Modeldark_latex_cone_model
/*     */   extends LatexHumanoidModel<DarklatexconeEntity>
/*     */   implements LatexHumanoidModelInterface
/*     */ {
/*  27 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("turned", "modeldark_latex_cone_model"), "main");
/*     */   
/*     */   public final ModelPart head;
/*     */   public final ModelPart body;
/*     */   public final ModelPart leftArm;
/*     */   public final ModelPart rightArm;
/*     */   public final ModelPart leftLeg;
/*     */   public final ModelPart rightLeg;
/*     */   public final LatexHumanoidModelController controller;
/*     */   
/*     */   public Modeldark_latex_cone_model(ModelPart root) {
/*  38 */     super(root);
/*  39 */     this.head = root.m_171324_("head");
/*  40 */     this.body = root.m_171324_("body");
/*  41 */     this.leftArm = root.m_171324_("leftArm");
/*  42 */     this.rightArm = root.m_171324_("rightArm");
/*  43 */     this.leftLeg = root.m_171324_("leftLeg");
/*  44 */     this.rightLeg = root.m_171324_("rightLeg");
/*  45 */     this.controller = LatexHumanoidModelController.Builder.of((EntityModel)this, this.head, this.body, this.body.m_171324_("Tail"), this.rightArm, this.leftArm, this.rightLeg, this.leftLeg).build();
/*     */   }
/*     */   
/*     */   public static LayerDefinition createBodyLayer() {
/*  49 */     MeshDefinition meshdefinition = new MeshDefinition();
/*  50 */     PartDefinition partdefinition = meshdefinition.m_171576_();
/*     */     
/*  52 */     PartDefinition head = partdefinition.m_171599_("head", CubeListBuilder.m_171558_().m_171514_(0, 22).m_171488_(-4.0F, -6.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
/*  53 */         .m_171514_(0, 11).m_171488_(4.0F, -2.0F, -4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
/*  54 */         .m_171514_(0, 0).m_171488_(-5.0F, -2.0F, -4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(0.0F, -2.0F, 0.0F));
/*     */     
/*  56 */     PartDefinition ears_t = head.m_171599_("ears_t", CubeListBuilder.m_171558_(), PartPose.m_171419_(3.75F, -7.0F, 0.5F));
/*     */     
/*  58 */     PartDefinition ear_t_l = ears_t.m_171599_("ear_t_l", CubeListBuilder.m_171558_(), PartPose.m_171423_(-0.5F, 0.25F, 0.0F, -0.1338F, -0.5595F, 0.137F));
/*     */     
/*  60 */     PartDefinition Head_r1 = ear_t_l.m_171599_("Head_r1", CubeListBuilder.m_171558_().m_171514_(0, 22).m_171488_(0.5F, -1.75F, -1.625F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
/*  61 */         .m_171514_(38, 54).m_171488_(-0.5F, -0.75F, -1.625F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.3927F));
/*     */     
/*  63 */     PartDefinition ear_t_r = ears_t.m_171599_("ear_t_r", CubeListBuilder.m_171558_(), PartPose.m_171423_(-7.0F, 0.25F, 0.0F, -0.1338F, 0.5595F, -0.137F));
/*     */     
/*  65 */     PartDefinition Head_r2 = ear_t_r.m_171599_("Head_r2", CubeListBuilder.m_171558_().m_171514_(0, 22).m_171480_().m_171488_(-1.5F, -1.75F, -1.625F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).m_171555_(false)
/*  66 */         .m_171514_(38, 54).m_171480_().m_171488_(-0.5F, -0.75F, -1.625F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).m_171555_(false), PartPose.m_171423_(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, -0.3927F));
/*     */     
/*  68 */     PartDefinition ears_b = head.m_171599_("ears_b", CubeListBuilder.m_171558_(), PartPose.m_171419_(3.5F, -7.0F, 0.5F));
/*     */     
/*  70 */     PartDefinition ear_b_l = ears_b.m_171599_("ear_b_l", CubeListBuilder.m_171558_(), PartPose.m_171423_(0.875F, 5.0F, 1.0F, -0.7719F, -0.4612F, 1.3981F));
/*     */     
/*  72 */     PartDefinition Head_r3 = ear_b_l.m_171599_("Head_r3", CubeListBuilder.m_171558_().m_171514_(24, 22).m_171488_(-0.5F, -1.75F, -1.625F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
/*  73 */         .m_171514_(25, 0).m_171488_(0.5F, -2.75F, -1.625F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.3927F));
/*     */     
/*  75 */     PartDefinition ear_b_r = ears_b.m_171599_("ear_b_r", CubeListBuilder.m_171558_(), PartPose.m_171423_(-7.875F, 5.0F, 1.0F, -0.7719F, 0.4612F, -1.3981F));
/*     */     
/*  77 */     PartDefinition Head_r4 = ear_b_r.m_171599_("Head_r4", CubeListBuilder.m_171558_().m_171514_(24, 22).m_171480_().m_171488_(-0.5F, -1.75F, -1.625F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).m_171555_(false)
/*  78 */         .m_171514_(25, 0).m_171480_().m_171488_(-1.5F, -2.75F, -1.625F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).m_171555_(false), PartPose.m_171423_(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, -0.3927F));
/*     */     
/*  80 */     PartDefinition mask = head.m_171599_("mask", CubeListBuilder.m_171558_().m_171514_(12, 15).m_171488_(-1.0F, -8.0F, -5.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  81 */         .m_171514_(0, 18).m_171488_(-4.0F, -3.0F, -5.0F, 8.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  82 */         .m_171514_(25, 9).m_171488_(-3.0F, -2.0F, -5.0F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  83 */         .m_171514_(12, 3).m_171488_(-2.5F, -1.0F, -5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  84 */         .m_171514_(3, 11).m_171488_(1.5F, -1.0F, -5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  85 */         .m_171514_(25, 10).m_171488_(-3.0F, -6.0F, -5.0F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  86 */         .m_171514_(25, 11).m_171488_(-2.0F, -7.0F, -5.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  87 */         .m_171514_(3, 14).m_171488_(-0.5F, -4.0F, -5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  88 */         .m_171514_(15, 1).m_171488_(2.375F, -4.0F, -5.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  89 */         .m_171514_(0, 3).m_171488_(-4.375F, -4.0F, -5.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  90 */         .m_171514_(4, 13).m_171488_(-3.375F, -5.0F, -5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  91 */         .m_171514_(4, 12).m_171488_(2.375F, -5.0F, -5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  92 */         .m_171514_(12, 0).m_171488_(-1.5F, -5.0F, -5.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(0.0F, 2.0F, 0.75F));
/*     */     
/*  94 */     PartDefinition hears = head.m_171599_("hears", CubeListBuilder.m_171558_(), PartPose.m_171419_(0.0F, 2.0F, 0.0F));
/*     */     
/*  96 */     PartDefinition body = partdefinition.m_171599_("body", CubeListBuilder.m_171558_().m_171514_(32, 22).m_171488_(-4.0F, 2.0F, -2.0F, 8.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(0.0F, -2.0F, 0.0F));
/*     */     
/*  98 */     PartDefinition Tail = body.m_171599_("Tail", CubeListBuilder.m_171558_(), PartPose.m_171419_(0.0F, 12.0F, 0.0F));
/*     */     
/* 100 */     PartDefinition Tail_r1 = Tail.m_171599_("Tail_r1", CubeListBuilder.m_171558_().m_171514_(22, 37).m_171488_(-1.25F, -16.6125F, 15.7823F, 3.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
/* 101 */         .m_171514_(0, 11).m_171488_(-1.25F, -16.6125F, 0.7823F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
/* 102 */         .m_171514_(25, 0).m_171488_(-1.25F, -12.6125F, 5.7823F, 3.0F, 1.0F, 12.0F, new CubeDeformation(0.0F))
/* 103 */         .m_171514_(51, 32).m_171488_(-1.25F, -15.6125F, 20.7823F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
/* 104 */         .m_171514_(0, 0).m_171488_(-1.25F, -15.6125F, 1.7823F, 3.0F, 3.0F, 19.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, 12.0F, -8.0F, -0.5672F, 0.0F, 0.0F));
/*     */     
/* 106 */     PartDefinition leftArm = partdefinition.m_171599_("rightArm", CubeListBuilder.m_171558_().m_171514_(0, 38).m_171488_(-3.0F, 5.0F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F))
/* 107 */         .m_171514_(0, 54).m_171488_(-2.0F, 0.0F, -2.0F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
/* 108 */         .m_171514_(12, 13).m_171488_(-3.0F, 12.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
/* 109 */         .m_171514_(12, 1).m_171488_(-3.0F, 12.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
/* 110 */         .m_171514_(12, 11).m_171488_(-3.0F, 12.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(-5.0F, 0.0F, 0.0F));
/*     */     
/* 112 */     PartDefinition rightArm = partdefinition.m_171599_("leftArm", CubeListBuilder.m_171558_().m_171514_(0, 0).m_171488_(-1.0F, 5.0F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F))
/* 113 */         .m_171514_(27, 48).m_171488_(-1.0F, 0.0F, -2.0F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
/* 114 */         .m_171514_(15, 10).m_171488_(2.0F, 12.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
/* 115 */         .m_171514_(15, 2).m_171488_(2.0F, 12.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
/* 116 */         .m_171514_(0, 14).m_171488_(2.0F, 12.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(5.0F, 0.0F, 0.0F));
/*     */     
/* 118 */     PartDefinition leftLeg = partdefinition.m_171599_("rightLeg", CubeListBuilder.m_171558_().m_171514_(55, 53).m_171488_(-2.0F, 1.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
/* 119 */         .m_171514_(55, 6).m_171488_(-2.375F, 12.213F, -2.1649F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(-2.0F, 10.0F, 0.0F));
/*     */     
/* 121 */     PartDefinition bone = leftLeg.m_171599_("bone", CubeListBuilder.m_171558_().m_171514_(44, 13).m_171488_(-2.125F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, 2.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/*     */     
/* 123 */     PartDefinition bone3 = leftLeg.m_171599_("bone3", CubeListBuilder.m_171558_().m_171514_(43, 0).m_171488_(-6.25F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(4.0F, 5.0F, -1.0F, 0.6545F, 0.0F, 0.0F));
/*     */     
/* 125 */     PartDefinition bone4 = leftLeg.m_171599_("bone4", CubeListBuilder.m_171558_().m_171514_(13, 48).m_171488_(-2.375F, -0.1371F, 3.7689F, 4.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, 5.0F, -1.0F, -0.48F, 0.0F, 0.0F));
/*     */     
/* 127 */     PartDefinition rightLeg = partdefinition.m_171599_("leftLeg", CubeListBuilder.m_171558_().m_171514_(54, 39).m_171488_(-2.0F, 1.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
/* 128 */         .m_171514_(25, 13).m_171488_(-1.625F, 12.213F, -2.1649F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(2.0F, 10.0F, 0.0F));
/*     */     
/* 130 */     PartDefinition bone5 = rightLeg.m_171599_("bone5", CubeListBuilder.m_171558_().m_171514_(16, 38).m_171488_(-1.875F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, 2.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/*     */     
/* 132 */     PartDefinition bone6 = rightLeg.m_171599_("bone6", CubeListBuilder.m_171558_().m_171514_(38, 37).m_171488_(2.25F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-4.0F, 5.0F, -1.0F, 0.6545F, 0.0F, 0.0F));
/*     */     
/* 134 */     PartDefinition bone7 = rightLeg.m_171599_("bone7", CubeListBuilder.m_171558_().m_171514_(45, 47).m_171488_(-1.625F, -0.1371F, 3.7689F, 4.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, 5.0F, -1.0F, -0.48F, 0.0F, 0.0F));
/*     */     
/* 136 */     return LayerDefinition.m_171565_(meshdefinition, 128, 128);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void m_7695_(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 142 */     this.head.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 143 */     this.body.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 144 */     this.leftArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 145 */     this.rightArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 146 */     this.leftLeg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 147 */     this.rightLeg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */ 
/*     */   
/*     */   public void prepareMobModel(DarklatexconeEntity p_102861_, float p_102862_, float p_102863_, float p_102864_) {
/* 152 */     prepareMobModel(this.controller, (LatexEntity)p_102861_, p_102862_, p_102863_, p_102864_);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setupAnim(DarklatexconeEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float HeadPitch) {
/* 157 */     this.controller.setupAnim((LatexEntity)entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, HeadPitch);
/*     */   }
/*     */ 
/*     */   
/*     */   public ModelPart getArm(HumanoidArm humanoidArm) {
/* 162 */     switch (humanoidArm) { default: throw new IncompatibleClassChangeError();case LEFT: case RIGHT: break; }  return 
/*     */       
/* 164 */       this.rightArm;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setupHand() {
/* 170 */     this.controller.setupHand();
/*     */   }
/*     */ 
/*     */   
/*     */   public LatexHumanoidModelController getController() {
/* 175 */     return this.controller;
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6002_(HumanoidArm p_102108_, PoseStack p_102109_) {
/* 180 */     getArm(p_102108_).m_104299_(p_102109_);
/*     */   }
/*     */ 
/*     */   
/*     */   public ModelPart m_5585_() {
/* 185 */     return this.head;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\client\model\Modeldark_latex_cone_model.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */