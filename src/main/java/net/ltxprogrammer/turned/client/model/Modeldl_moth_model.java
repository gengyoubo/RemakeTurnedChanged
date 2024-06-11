/*     */ package net.ltxprogrammer.turned.client.model;
/*     */ 
/*     */ import com.mojang.blaze3d.vertex.PoseStack;
/*     */ import com.mojang.blaze3d.vertex.VertexConsumer;
/*     */ import net.ltxprogrammer.changed.client.renderer.model.LatexHumanoidModel;
/*     */ import net.ltxprogrammer.changed.client.renderer.model.LatexHumanoidModelController;
/*     */ import net.ltxprogrammer.changed.client.renderer.model.LatexHumanoidModelInterface;
/*     */ import net.ltxprogrammer.changed.entity.LatexEntity;
/*     */ import net.ltxprogrammer.turned.entity.DarkLatexMothEntity;
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
/*     */ public class Modeldl_moth_model
/*     */   extends LatexHumanoidModel<DarkLatexMothEntity>
/*     */   implements LatexHumanoidModelInterface
/*     */ {
/*  27 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("turned", "modeldl_moth_model"), "main");
/*     */   public final ModelPart Head;
/*     */   public final ModelPart Body;
/*     */   public final ModelPart LeftArm;
/*     */   public final ModelPart RightArm;
/*     */   public final ModelPart LeftLeg;
/*     */   public final ModelPart RightLeg;
/*     */   public final LatexHumanoidModelController controller;
/*     */   
/*     */   public Modeldl_moth_model(ModelPart root) {
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
/*  50 */     PartDefinition Head = partdefinition.m_171599_("Head", 
/*  51 */         CubeListBuilder.m_171558_().m_171514_(22, 0).m_171488_(-4.5F, -2.25F, -2.7F, 9.0F, 4.0F, 6.0F, new CubeDeformation(0.0F))
/*  52 */         .m_171514_(27, 10).m_171488_(-3.0F, -6.0F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), 
/*  53 */         PartPose.m_171419_(0.0F, -2.0F, 0.0F));
/*  54 */     PartDefinition bone4 = Head.m_171599_("bone4", 
/*  55 */         CubeListBuilder.m_171558_().m_171514_(38, 42).m_171488_(-2.0F, -7.0F, -2.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(36, 29)
/*  56 */         .m_171488_(-3.0F, -6.0F, -2.0F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(24, 29)
/*  57 */         .m_171488_(-3.0F, -3.0F, -2.0F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(0, 0)
/*  58 */         .m_171488_(-1.0F, -5.0F, -2.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(2, 2)
/*  59 */         .m_171488_(-4.0F, -5.0F, -2.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(0, 2)
/*  60 */         .m_171488_(3.0F, -5.0F, -2.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), 
/*  61 */         PartPose.m_171419_(0.0F, 1.0F, -1.25F));
/*  62 */     PartDefinition bone8 = Head.m_171599_("bone8", 
/*  63 */         CubeListBuilder.m_171558_().m_171514_(56, 47).m_171488_(-4.0F, -6.0F, 1.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).m_171514_(59, 59)
/*  64 */         .m_171488_(2.0F, -6.0F, 1.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).m_171514_(0, 5)
/*  65 */         .m_171488_(2.0F, -7.0F, 1.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(0, 0).m_171488_(-4.0F, -7.0F, 1.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), 
/*     */         
/*  67 */         PartPose.m_171423_(0.5F, 1.25F, 2.0F, 0.3927F, 0.0F, 0.0F));
/*  68 */     PartDefinition Body = partdefinition.m_171599_("Body", 
/*  69 */         CubeListBuilder.m_171558_().m_171514_(30, 30).m_171488_(-4.0F, 1.0F, -2.0F, 8.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(30, 22)
/*  70 */         .m_171488_(-4.0F, 9.0F, -2.0F, 8.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(46, 0)
/*  71 */         .m_171488_(-3.5F, 7.0F, -1.5F, 7.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).m_171514_(0, 26)
/*  72 */         .m_171488_(-4.5F, 2.0F, -3.0F, 9.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(0, 16)
/*  73 */         .m_171488_(-5.0F, -1.0F, -3.5F, 10.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), 
/*  74 */         PartPose.m_171419_(0.0F, -2.0F, 0.0F));
/*  75 */     PartDefinition BREAAAAAAAAAAAAAASTS = Body.m_171599_("BREAAAAAAAAAAAAAASTS", 
/*  76 */         CubeListBuilder.m_171558_().m_171514_(48, 6).m_171488_(-3.5F, -3.7073F, -3.7495F, 7.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  77 */         PartPose.m_171423_(0.0F, 3.5F, 0.5F, 1.1781F, 0.0F, 0.0F));
/*  78 */     PartDefinition Tail = Body.m_171599_("Tail", 
/*  79 */         CubeListBuilder.m_171558_().m_171514_(0, 0).m_171488_(-3.0F, -1.8394F, 1.2472F, 6.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)).m_171514_(65, 47)
/*  80 */         .m_171488_(-2.5F, -1.3394F, 11.2472F, 5.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), 
/*  81 */         PartPose.m_171423_(0.0F, 9.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/*  82 */     PartDefinition Wings = Body.m_171599_("Wings", CubeListBuilder.m_171558_(), PartPose.m_171419_(0.0F, 3.0F, 1.5F));
/*  83 */     PartDefinition LeftWing = Wings.m_171599_("LeftWing", CubeListBuilder.m_171558_(), 
/*  84 */         PartPose.m_171423_(9.0F, -2.0F, 4.0F, 0.0F, -0.3927F, 0.0F));
/*  85 */     PartDefinition bone = LeftWing.m_171599_("bone", 
/*  86 */         CubeListBuilder.m_171558_().m_171514_(14, 35).m_171488_(-1.0F, -6.0F, -1.0F, 5.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(10, 54)
/*  87 */         .m_171488_(-4.0F, -6.0F, -1.0F, 3.0F, 16.0F, 2.0F, new CubeDeformation(0.0F)), 
/*  88 */         PartPose.m_171423_(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.9635F));
/*  89 */     PartDefinition bone3 = LeftWing.m_171599_("bone3", 
/*  90 */         CubeListBuilder.m_171558_().m_171514_(63, 14).m_171488_(-5.0F, -7.0F, -0.5F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(38, 40)
/*  91 */         .m_171488_(-3.0F, -8.0F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(66, 3).m_171488_(-9.0F, -6.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), 
/*     */         
/*  93 */         PartPose.m_171423_(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5708F));
/*  94 */     PartDefinition bone2 = LeftWing.m_171599_("bone2", 
/*  95 */         CubeListBuilder.m_171558_().m_171514_(32, 57).m_171488_(-8.0F, -5.0F, -1.0F, 4.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(52, 66)
/*  96 */         .m_171488_(-10.0F, -5.0F, -1.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), 
/*  97 */         PartPose.m_171423_(2.0F, 2.0F, 0.0F, 0.0F, 0.0F, -1.1781F));
/*  98 */     PartDefinition Rightwing = Wings.m_171599_("Rightwing", CubeListBuilder.m_171558_(), 
/*  99 */         PartPose.m_171423_(-9.0F, -2.0F, 4.0F, 0.0F, 0.3927F, 0.0F));
/* 100 */     PartDefinition bone5 = Rightwing.m_171599_("bone5", 
/* 101 */         CubeListBuilder.m_171558_().m_171514_(0, 35).m_171488_(-4.0F, -6.0F, -1.0F, 5.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(0, 54)
/* 102 */         .m_171488_(1.0F, -6.0F, -1.0F, 3.0F, 16.0F, 2.0F, new CubeDeformation(0.0F)), 
/* 103 */         PartPose.m_171423_(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.9635F));
/* 104 */     PartDefinition bone6 = Rightwing.m_171599_("bone6", 
/* 105 */         CubeListBuilder.m_171558_().m_171514_(62, 55).m_171488_(-1.0F, -7.0F, -0.5F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(24, 30)
/* 106 */         .m_171488_(0.0F, -8.0F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(63, 0).m_171488_(5.0F, -6.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), 
/*     */         
/* 108 */         PartPose.m_171423_(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5708F));
/* 109 */     PartDefinition bone7 = Rightwing.m_171599_("bone7", 
/* 110 */         CubeListBuilder.m_171558_().m_171514_(20, 57).m_171488_(4.0F, -5.0F, -1.0F, 4.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(44, 59)
/* 111 */         .m_171488_(8.0F, -5.0F, -1.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), 
/* 112 */         PartPose.m_171423_(-2.0F, 2.0F, 0.0F, 0.0F, 0.0F, 1.1781F));
/* 113 */     PartDefinition LeftArm = partdefinition.m_171599_("RightArm", 
/* 114 */         CubeListBuilder.m_171558_().m_171514_(42, 42).m_171488_(-2.0F, -2.0F, -2.0F, 3.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 115 */         PartPose.m_171419_(-5.0F, 1.0F, 0.0F));
/* 116 */     PartDefinition RightArm = partdefinition.m_171599_("LeftArm", 
/* 117 */         CubeListBuilder.m_171558_().m_171514_(28, 40).m_171488_(-1.0F, -2.0F, -2.0F, 3.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 118 */         PartPose.m_171419_(5.0F, 1.0F, 0.0F));
/* 119 */     PartDefinition LeftLeg = partdefinition.m_171599_("RightLeg", 
/* 120 */         CubeListBuilder.m_171558_().m_171514_(54, 25).m_171488_(-2.0F, -1.0F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F))
/* 121 */         .m_171514_(56, 36).m_171488_(-1.0F, 6.0F, -2.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 122 */         PartPose.m_171419_(-2.0F, 11.0F, 0.0F));
/*     */     
/* 124 */     PartDefinition RightLeg = partdefinition.m_171599_("LeftLeg", 
/* 125 */         CubeListBuilder.m_171558_().m_171514_(51, 14).m_171488_(-2.0F, -1.0F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F))
/* 126 */         .m_171514_(52, 55).m_171488_(-2.0F, 6.0F, -2.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 127 */         PartPose.m_171419_(2.0F, 11.0F, 0.0F));
/* 128 */     return LayerDefinition.m_171565_(meshdefinition, 128, 128);
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
/*     */   
/*     */   public void prepareMobModel(DarkLatexMothEntity p_102861_, float p_102862_, float p_102863_, float p_102864_) {
/* 144 */     prepareMobModel(this.controller, (LatexEntity)p_102861_, p_102862_, p_102863_, p_102864_);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setupAnim(DarkLatexMothEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float HeadPitch) {
/* 149 */     this.controller.setupAnim((LatexEntity)entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, HeadPitch);
/*     */   }
/*     */ 
/*     */   
/*     */   public ModelPart getArm(HumanoidArm humanoidArm) {
/* 154 */     switch (humanoidArm) { default: throw new IncompatibleClassChangeError();case LEFT: case RIGHT: break; }  return 
/*     */       
/* 156 */       this.RightArm;
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
/* 177 */     return this.Head;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\client\model\Modeldl_moth_model.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */