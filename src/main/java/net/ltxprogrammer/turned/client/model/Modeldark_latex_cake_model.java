/*     */ package net.ltxprogrammer.turned.client.model;
/*     */ 
/*     */ import com.mojang.blaze3d.vertex.PoseStack;
/*     */ import com.mojang.blaze3d.vertex.VertexConsumer;
/*     */ import net.ltxprogrammer.changed.client.renderer.model.LatexHumanoidModel;
/*     */ import net.ltxprogrammer.changed.client.renderer.model.LatexHumanoidModelController;
/*     */ import net.ltxprogrammer.changed.client.renderer.model.LatexHumanoidModelInterface;
/*     */ import net.ltxprogrammer.changed.entity.LatexEntity;
/*     */ import net.ltxprogrammer.turned.entity.DarkLatexCakeEntity;
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
/*     */ public class Modeldark_latex_cake_model
/*     */   extends LatexHumanoidModel<DarkLatexCakeEntity>
/*     */   implements LatexHumanoidModelInterface
/*     */ {
/*  27 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("turned", "modeldark_latex_cake_model"), "main");
/*     */   
/*     */   public final ModelPart head;
/*     */   public final ModelPart body;
/*     */   public final ModelPart leftArm;
/*     */   public final ModelPart rightArm;
/*     */   public final ModelPart leftLeg;
/*     */   public final ModelPart rightLeg;
/*     */   public final LatexHumanoidModelController controller;
/*     */   
/*     */   public Modeldark_latex_cake_model(ModelPart root) {
/*  38 */     super(root);
/*  39 */     this.head = root.m_171324_("head");
/*  40 */     this.body = root.m_171324_("body");
/*  41 */     this.leftArm = root.m_171324_("leftArm");
/*  42 */     this.rightArm = root.m_171324_("rightArm");
/*  43 */     this.leftLeg = root.m_171324_("leftLeg");
/*  44 */     this.rightLeg = root.m_171324_("rightLeg");
/*  45 */     this.controller = LatexHumanoidModelController.Builder.of((EntityModel)this, this.head, this.body, this.body.m_171324_("Tail"), this.rightArm, this.leftArm, this.rightLeg, this.leftLeg).hipOffset(-2.0F).build();
/*     */   }
/*     */   
/*     */   public static LayerDefinition createBodyLayer() {
/*  49 */     MeshDefinition meshdefinition = new MeshDefinition();
/*  50 */     PartDefinition partdefinition = meshdefinition.m_171576_();
/*     */     
/*  52 */     PartDefinition head = partdefinition.m_171599_("head", CubeListBuilder.m_171558_().m_171514_(24, 22).m_171488_(-4.0F, -5.75F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
/*  53 */         .m_171514_(27, 2).m_171488_(4.0F, -0.75F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
/*  54 */         .m_171514_(27, 0).m_171488_(-5.0F, -0.75F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
/*  55 */         .m_171514_(19, 14).m_171488_(-6.0F, 0.25F, -4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
/*  56 */         .m_171514_(19, 16).m_171488_(4.0F, 0.25F, -4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(0.0F, -2.25F, 0.0F));
/*     */     
/*  58 */     PartDefinition Head_r1 = head.m_171599_("Head_r1", CubeListBuilder.m_171558_().m_171514_(0, 0).m_171488_(0.5F, -2.75F, -1.625F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
/*  59 */         .m_171514_(0, 14).m_171488_(-0.5F, -1.75F, -1.625F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(4.5F, -5.75F, 0.5F, 0.0F, 1.5708F, 0.6109F));
/*     */     
/*  61 */     PartDefinition Head_r2 = head.m_171599_("Head_r2", CubeListBuilder.m_171558_().m_171514_(15, 30).m_171488_(-0.5F, -0.75F, -1.625F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
/*  62 */         .m_171514_(5, 19).m_171488_(-1.5F, -1.75F, -1.625F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-5.5F, -5.25F, 0.5F, 0.0F, -1.5708F, -0.9599F));
/*     */     
/*  64 */     PartDefinition Cake = head.m_171599_("Cake", CubeListBuilder.m_171558_().m_171514_(0, 0).m_171488_(-4.0F, -32.0F, -5.0F, 9.0F, 5.0F, 9.0F, new CubeDeformation(0.0F))
/*  65 */         .m_171514_(5, 14).m_171488_(-0.5F, -32.875F, -1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(-0.375F, 25.875F, 0.5F));
/*     */     
/*  67 */     PartDefinition mask = head.m_171599_("mask", CubeListBuilder.m_171558_().m_171514_(0, 26).m_171488_(1.0F, -7.0F, -5.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  68 */         .m_171514_(19, 21).m_171488_(-4.0F, -3.0F, -5.0F, 8.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  69 */         .m_171514_(5, 2).m_171488_(-1.0F, -6.0F, -5.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  70 */         .m_171514_(19, 25).m_171488_(-3.0F, -7.0F, -5.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  71 */         .m_171514_(11, 14).m_171488_(-0.5F, -4.0F, -5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  72 */         .m_171514_(0, 14).m_171488_(-3.375F, -6.0F, -5.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
/*  73 */         .m_171514_(0, 0).m_171488_(2.375F, -6.0F, -5.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
/*  74 */         .m_171514_(5, 14).m_171488_(-0.5F, -5.0F, -5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(0.0F, 2.25F, 0.75F));
/*     */     
/*  76 */     PartDefinition body = partdefinition.m_171599_("body", CubeListBuilder.m_171558_().m_171514_(27, 0).m_171488_(-4.0F, 2.0F, -2.0F, 8.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
/*  77 */         .m_171514_(31, 9).m_171488_(-4.0F, 7.0F, -3.0F, 8.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(0.0F, -2.0F, 0.0F));
/*     */     
/*  79 */     PartDefinition Tail = body.m_171599_("Tail", CubeListBuilder.m_171558_(), PartPose.m_171419_(0.0F, 13.0F, 0.0F));
/*     */     
/*  81 */     PartDefinition Tail_r1 = Tail.m_171599_("Tail_r1", CubeListBuilder.m_171558_().m_171514_(19, 14).m_171488_(-1.25F, -16.6125F, 0.7823F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
/*  82 */         .m_171514_(14, 38).m_171488_(-1.25F, -12.6125F, 5.7823F, 3.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
/*  83 */         .m_171514_(19, 22).m_171488_(-1.25F, -15.6125F, 14.7823F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
/*  84 */         .m_171514_(0, 14).m_171488_(-1.25F, -15.6125F, 1.7823F, 3.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, 12.0F, -8.0F, -0.5672F, 0.0F, 0.0F));
/*     */     
/*  86 */     PartDefinition Cake4 = Tail.m_171599_("Cake4", CubeListBuilder.m_171558_().m_171514_(0, 30).m_171488_(-1.75F, -17.1125F, 0.4073F, 4.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, 12.0F, -8.0F, -0.5672F, 0.0F, 0.0F));
/*     */     
/*  88 */     PartDefinition rightArm = partdefinition.m_171599_("rightArm", CubeListBuilder.m_171558_().m_171514_(0, 43).m_171488_(-4.0F, 5.0F, -2.0F, 5.0F, 7.0F, 4.0F, new CubeDeformation(0.0F))
/*  89 */         .m_171514_(44, 61).m_171488_(-2.0F, 0.0F, -2.0F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
/*  90 */         .m_171514_(20, 30).m_171488_(-4.0F, 12.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
/*  91 */         .m_171514_(27, 22).m_171488_(-4.0F, 12.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
/*  92 */         .m_171514_(0, 30).m_171488_(-4.0F, 12.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(-5.0F, 0.0F, 0.0F));
/*     */     
/*  94 */     PartDefinition Cake2 = rightArm.m_171599_("Cake2", CubeListBuilder.m_171558_().m_171514_(51, 33).m_171488_(-8.0F, -19.0F, -3.0F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(5.5F, 18.25F, 0.5F));
/*     */     
/*  96 */     PartDefinition leftArm = partdefinition.m_171599_("leftArm", CubeListBuilder.m_171558_().m_171514_(36, 38).m_171488_(-1.0F, 5.0F, -2.0F, 5.0F, 7.0F, 4.0F, new CubeDeformation(0.0F))
/*  97 */         .m_171514_(30, 59).m_171488_(-1.0F, 0.0F, -2.0F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
/*  98 */         .m_171514_(3, 33).m_171488_(3.0F, 12.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
/*  99 */         .m_171514_(0, 32).m_171488_(3.0F, 12.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
/* 100 */         .m_171514_(3, 31).m_171488_(3.0F, 12.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(5.0F, 0.0F, 0.0F));
/*     */     
/* 102 */     PartDefinition Cake3 = leftArm.m_171599_("Cake3", CubeListBuilder.m_171558_().m_171514_(51, 0).m_171488_(4.0F, -19.0F, -3.0F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(-5.5F, 18.25F, 0.5F));
/*     */     
/* 104 */     PartDefinition rightLeg = partdefinition.m_171599_("rightLeg", CubeListBuilder.m_171558_().m_171514_(58, 61).m_171488_(-2.0F, 1.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
/* 105 */         .m_171514_(49, 44).m_171488_(-2.375F, 11.213F, -3.1649F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
/* 106 */         .m_171514_(19, 18).m_171488_(-2.375F, 13.213F, -4.1649F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
/* 107 */         .m_171514_(8, 17).m_171488_(0.625F, 13.213F, -4.1649F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
/* 108 */         .m_171514_(5, 0).m_171488_(-0.875F, 13.213F, -4.1649F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(-2.0F, 10.0F, 0.0F));
/*     */     
/* 110 */     PartDefinition bone = rightLeg.m_171599_("bone", CubeListBuilder.m_171558_().m_171514_(0, 54).m_171488_(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, 2.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/*     */     
/* 112 */     PartDefinition bone3 = rightLeg.m_171599_("bone3", CubeListBuilder.m_171558_().m_171514_(34, 49).m_171488_(-6.375F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(4.0F, 5.0F, -1.0F, 0.6545F, 0.0F, 0.0F));
/*     */     
/* 114 */     PartDefinition bone4 = rightLeg.m_171599_("bone4", CubeListBuilder.m_171558_().m_171514_(16, 57).m_171488_(-2.375F, -0.1371F, 3.7689F, 4.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, 5.0F, -1.0F, -0.48F, 0.0F, 0.0F));
/*     */     
/* 116 */     PartDefinition leftLeg = partdefinition.m_171599_("leftLeg", CubeListBuilder.m_171558_().m_171514_(61, 17).m_171488_(-2.0F, 1.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
/* 117 */         .m_171514_(48, 20).m_171488_(-1.625F, 11.213F, -3.1649F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
/* 118 */         .m_171514_(26, 25).m_171488_(1.375F, 13.213F, -4.1649F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
/* 119 */         .m_171514_(0, 24).m_171488_(-1.625F, 13.213F, -4.1649F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
/* 120 */         .m_171514_(0, 22).m_171488_(-0.125F, 13.213F, -4.1649F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(2.0F, 10.0F, 0.0F));
/*     */     
/* 122 */     PartDefinition bone5 = leftLeg.m_171599_("bone5", CubeListBuilder.m_171558_().m_171514_(50, 52).m_171488_(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, 2.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/*     */     
/* 124 */     PartDefinition bone6 = leftLeg.m_171599_("bone6", CubeListBuilder.m_171558_().m_171514_(18, 47).m_171488_(2.375F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-4.0F, 5.0F, -1.0F, 0.6545F, 0.0F, 0.0F));
/*     */     
/* 126 */     PartDefinition bone7 = leftLeg.m_171599_("bone7", CubeListBuilder.m_171558_().m_171514_(57, 7).m_171488_(-1.625F, -0.1371F, 3.7689F, 4.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, 5.0F, -1.0F, -0.48F, 0.0F, 0.0F));
/*     */     
/* 128 */     return LayerDefinition.m_171565_(meshdefinition, 80, 80);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void m_7695_(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 134 */     this.head.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 135 */     this.body.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 136 */     this.leftArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 137 */     this.rightArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 138 */     this.leftLeg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 139 */     this.rightLeg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */ 
/*     */   
/*     */   public void prepareMobModel(DarkLatexCakeEntity p_102861_, float p_102862_, float p_102863_, float p_102864_) {
/* 144 */     prepareMobModel(this.controller, (LatexEntity)p_102861_, p_102862_, p_102863_, p_102864_);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setupAnim(DarkLatexCakeEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float HeadPitch) {
/* 149 */     this.controller.setupAnim((LatexEntity)entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, HeadPitch);
/*     */   }
/*     */ 
/*     */   
/*     */   public ModelPart getArm(HumanoidArm humanoidArm) {
/* 154 */     switch (humanoidArm) { default: throw new IncompatibleClassChangeError();case LEFT: case RIGHT: break; }  return 
/*     */       
/* 156 */       this.rightArm;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setupHand() {
/* 162 */     this.controller.setupHand();
/*     */   }
/*     */ 
/*     */   
/*     */   public LatexHumanoidModelController getController() {
/* 167 */     return this.controller;
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6002_(HumanoidArm p_102108_, PoseStack p_102109_) {
/* 172 */     getArm(p_102108_).m_104299_(p_102109_);
/*     */   }
/*     */ 
/*     */   
/*     */   public ModelPart m_5585_() {
/* 177 */     return this.head;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\client\model\Modeldark_latex_cake_model.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */