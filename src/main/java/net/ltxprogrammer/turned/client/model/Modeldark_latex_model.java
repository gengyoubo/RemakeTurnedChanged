/*     */ package net.ltxprogrammer.turned.client.model;
/*     */ import com.mojang.blaze3d.vertex.PoseStack;
/*     */ import com.mojang.blaze3d.vertex.VertexConsumer;
/*     */ import net.ltxprogrammer.changed.client.renderer.model.LatexHumanoidModelController;
/*     */ import net.ltxprogrammer.changed.entity.LatexEntity;
/*     */ import net.ltxprogrammer.turned.entity.DarklatexEntity;
/*     */ import net.minecraft.client.model.geom.ModelLayerLocation;
/*     */ import net.minecraft.client.model.geom.ModelPart;
/*     */ import net.minecraft.client.model.geom.PartPose;
/*     */ import net.minecraft.client.model.geom.builders.CubeDeformation;
/*     */ import net.minecraft.client.model.geom.builders.CubeListBuilder;
/*     */ import net.minecraft.client.model.geom.builders.LayerDefinition;
/*     */ import net.minecraft.client.model.geom.builders.MeshDefinition;
/*     */ import net.minecraft.client.model.geom.builders.PartDefinition;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.HumanoidArm;
/*     */ 
/*     */ public class Modeldark_latex_model extends LatexHumanoidModel<DarklatexEntity> implements LatexHumanoidModelInterface {
/*  19 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("latex", "modeldark_latex_model"), "main");
/*     */   public final ModelPart head;
/*     */   public final ModelPart body;
/*     */   public final ModelPart leftArm;
/*     */   public final ModelPart rightArm;
/*     */   public final ModelPart leftLeg;
/*     */   public final ModelPart rightLeg;
/*     */   public final LatexHumanoidModelController controller;
/*     */   
/*     */   public Modeldark_latex_model(ModelPart root) {
/*  29 */     super(root);
/*  30 */     this.head = root.m_171324_("head");
/*  31 */     this.body = root.m_171324_("body");
/*  32 */     this.leftArm = root.m_171324_("leftArm");
/*  33 */     this.rightArm = root.m_171324_("rightArm");
/*  34 */     this.leftLeg = root.m_171324_("leftLeg");
/*  35 */     this.rightLeg = root.m_171324_("rightLeg");
/*  36 */     this.controller = LatexHumanoidModelController.Builder.of((EntityModel)this, this.head, this.body, this.body.m_171324_("Tail"), this.rightArm, this.leftArm, this.rightLeg, this.leftLeg).hipOffset(-2.0F).build();
/*     */   }
/*     */   
/*     */   public static LayerDefinition createBodyLayer() {
/*  40 */     MeshDefinition meshdefinition = new MeshDefinition();
/*  41 */     PartDefinition partdefinition = meshdefinition.m_171576_();
/*     */     
/*  43 */     PartDefinition head = partdefinition.m_171599_("head", CubeListBuilder.m_171558_().m_171514_(0, 16).m_171488_(-4.0F, -6.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
/*  44 */         .m_171514_(19, 10).m_171488_(4.0F, -2.0F, -4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
/*  45 */         .m_171514_(0, 7).m_171488_(-5.0F, -2.0F, -4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(0.0F, -2.0F, 0.0F));
/*     */     
/*  47 */     PartDefinition Head_r1 = head.m_171599_("Head_r1", CubeListBuilder.m_171558_().m_171514_(0, 0).m_171488_(0.5F, -1.75F, -1.625F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
/*  48 */         .m_171514_(0, 16).m_171488_(-0.5F, -0.75F, -1.625F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(3.5F, -7.0F, 0.5F, 0.0F, 1.5708F, 0.3927F));
/*     */     
/*  50 */     PartDefinition Head_r2 = head.m_171599_("Head_r2", CubeListBuilder.m_171558_().m_171514_(19, 0).m_171488_(-0.5F, -0.75F, -1.625F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
/*  51 */         .m_171514_(5, 4).m_171488_(-1.5F, -1.75F, -1.625F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-3.5F, -7.0F, 0.5F, 0.0F, -1.5708F, -0.3927F));
/*     */     
/*  53 */     PartDefinition mask = head.m_171599_("mask", CubeListBuilder.m_171558_().m_171514_(23, 12).m_171488_(-1.0F, -8.0F, -5.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  54 */         .m_171514_(19, 9).m_171488_(-4.0F, -3.0F, -5.0F, 8.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  55 */         .m_171514_(0, 11).m_171488_(-3.0F, -2.0F, -5.0F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  56 */         .m_171514_(0, 1).m_171488_(-2.5F, -1.0F, -5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  57 */         .m_171514_(0, 0).m_171488_(1.5F, -1.0F, -5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  58 */         .m_171514_(0, 12).m_171488_(-3.0F, -6.0F, -5.0F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  59 */         .m_171514_(19, 6).m_171488_(-2.0F, -7.0F, -5.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  60 */         .m_171514_(10, 4).m_171488_(-0.5F, -4.0F, -5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  61 */         .m_171514_(0, 10).m_171488_(2.375F, -4.0F, -5.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  62 */         .m_171514_(8, 3).m_171488_(-4.375F, -4.0F, -5.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  63 */         .m_171514_(3, 7).m_171488_(-3.375F, -5.0F, -5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  64 */         .m_171514_(0, 2).m_171488_(2.375F, -5.0F, -5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  65 */         .m_171514_(19, 7).m_171488_(-1.5F, -5.0F, -5.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(0.0F, 2.0F, 0.75F));
/*     */     
/*  67 */     PartDefinition body = partdefinition.m_171599_("body", CubeListBuilder.m_171558_().m_171514_(28, 28).m_171488_(-4.0F, 2.0F, -2.0F, 8.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(0.0F, -2.0F, 0.0F));
/*     */     
/*  69 */     PartDefinition Tail = body.m_171599_("Tail", CubeListBuilder.m_171558_(), PartPose.m_171419_(0.0F, 12.0F, 0.0F));
/*     */     
/*  71 */     PartDefinition Tail_r1 = Tail.m_171599_("Tail_r1", CubeListBuilder.m_171558_().m_171514_(38, 17).m_171488_(-1.25F, -16.6125F, 0.7823F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
/*  72 */         .m_171514_(19, 0).m_171488_(-1.25F, -12.6125F, 5.7823F, 3.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
/*  73 */         .m_171514_(5, 0).m_171488_(-1.25F, -15.6125F, 14.7823F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
/*  74 */         .m_171514_(0, 0).m_171488_(-1.25F, -15.6125F, 1.7823F, 3.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, 12.25F, -7.75F, -0.5672F, 0.0F, 0.0F));
/*     */     
/*  76 */     PartDefinition leftArm = partdefinition.m_171599_("rightArm", CubeListBuilder.m_171558_().m_171514_(0, 32).m_171488_(-3.0F, 5.0F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F))
/*  77 */         .m_171514_(52, 11).m_171488_(-2.0F, 0.0F, -2.0F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
/*  78 */         .m_171514_(23, 10).m_171488_(-3.0F, 12.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
/*  79 */         .m_171514_(0, 22).m_171488_(-3.0F, 12.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
/*  80 */         .m_171514_(4, 22).m_171488_(-3.0F, 12.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(-5.0F, 0.0F, 0.0F));
/*     */     
/*  82 */     PartDefinition rightArm = partdefinition.m_171599_("leftArm", CubeListBuilder.m_171558_().m_171514_(28, 12).m_171488_(-1.0F, 5.0F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F))
/*  83 */         .m_171514_(52, 0).m_171488_(-1.0F, 0.0F, -2.0F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
/*  84 */         .m_171514_(24, 20).m_171488_(2.0F, 12.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
/*  85 */         .m_171514_(24, 18).m_171488_(2.0F, 12.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
/*  86 */         .m_171514_(24, 16).m_171488_(2.0F, 12.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(5.0F, 0.0F, 0.0F));
/*     */     
/*  88 */     PartDefinition leftLeg = partdefinition.m_171599_("rightLeg", CubeListBuilder.m_171558_().m_171514_(52, 36).m_171488_(-2.0F, 1.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
/*  89 */         .m_171514_(52, 30).m_171488_(-2.0F, 12.213F, -2.1649F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(-2.0F, 10.0F, 0.0F));
/*     */     
/*  91 */     PartDefinition bone = leftLeg.m_171599_("bone", CubeListBuilder.m_171558_().m_171514_(44, 43).m_171488_(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, 2.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/*     */     
/*  93 */     PartDefinition bone3 = leftLeg.m_171599_("bone3", CubeListBuilder.m_171558_().m_171514_(40, 5).m_171488_(-6.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(4.0F, 5.0F, -1.0F, 0.6545F, 0.0F, 0.0F));
/*     */     
/*  95 */     PartDefinition bone4 = leftLeg.m_171599_("bone4", CubeListBuilder.m_171558_().m_171514_(14, 49).m_171488_(-2.0F, -0.1371F, 3.7689F, 4.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, 5.0F, -1.0F, -0.48F, 0.0F, 0.0F));
/*     */     
/*  97 */     PartDefinition rightLeg = partdefinition.m_171599_("leftLeg", CubeListBuilder.m_171558_().m_171514_(28, 52).m_171488_(-2.0F, 1.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
/*  98 */         .m_171514_(48, 24).m_171488_(-2.0F, 12.213F, -2.1649F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(2.0F, 10.0F, 0.0F));
/*     */     
/* 100 */     PartDefinition bone5 = rightLeg.m_171599_("bone5", CubeListBuilder.m_171558_().m_171514_(28, 43).m_171488_(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, 2.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/*     */     
/* 102 */     PartDefinition bone6 = rightLeg.m_171599_("bone6", CubeListBuilder.m_171558_().m_171514_(12, 39).m_171488_(2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-4.0F, 5.0F, -1.0F, 0.6545F, 0.0F, 0.0F));
/*     */     
/* 104 */     PartDefinition bone7 = rightLeg.m_171599_("bone7", CubeListBuilder.m_171558_().m_171514_(0, 46).m_171488_(-2.0F, -0.1371F, 3.7689F, 4.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, 5.0F, -1.0F, -0.48F, 0.0F, 0.0F));
/*     */     
/* 106 */     return LayerDefinition.m_171565_(meshdefinition, 128, 128);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void m_7695_(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 112 */     this.head.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 113 */     this.body.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 114 */     this.leftArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 115 */     this.rightArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 116 */     this.leftLeg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 117 */     this.rightLeg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */ 
/*     */   
/*     */   public void prepareMobModel(DarklatexEntity p_102861_, float p_102862_, float p_102863_, float p_102864_) {
/* 122 */     prepareMobModel(this.controller, (LatexEntity)p_102861_, p_102862_, p_102863_, p_102864_);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setupAnim(DarklatexEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float HeadPitch) {
/* 127 */     this.controller.setupAnim((LatexEntity)entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, HeadPitch);
/*     */   }
/*     */ 
/*     */   
/*     */   public ModelPart getArm(HumanoidArm humanoidArm) {
/* 132 */     switch (humanoidArm) { default: throw new IncompatibleClassChangeError();case LEFT: case RIGHT: break; }  return 
/*     */       
/* 134 */       this.rightArm;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setupHand() {
/* 140 */     this.controller.setupHand();
/*     */   }
/*     */ 
/*     */   
/*     */   public LatexHumanoidModelController getController() {
/* 145 */     return this.controller;
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6002_(HumanoidArm p_102108_, PoseStack p_102109_) {
/* 150 */     getArm(p_102108_).m_104299_(p_102109_);
/*     */   }
/*     */ 
/*     */   
/*     */   public ModelPart m_5585_() {
/* 155 */     return this.head;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\client\model\Modeldark_latex_model.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */