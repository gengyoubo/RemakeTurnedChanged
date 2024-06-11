/*     */ package net.ltxprogrammer.turned.client.model;
/*     */ 
/*     */ import com.mojang.blaze3d.vertex.PoseStack;
/*     */ import com.mojang.blaze3d.vertex.VertexConsumer;
/*     */ import net.ltxprogrammer.changed.client.renderer.model.LatexHumanoidModel;
/*     */ import net.ltxprogrammer.changed.client.renderer.model.LatexHumanoidModelController;
/*     */ import net.ltxprogrammer.changed.client.renderer.model.LatexHumanoidModelInterface;
/*     */ import net.ltxprogrammer.changed.entity.LatexEntity;
/*     */ import net.ltxprogrammer.turned.entity.DarkLatexFoxEntity;
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
/*     */ public class ModelDark_latex_fox
/*     */   extends LatexHumanoidModel<DarkLatexFoxEntity>
/*     */   implements LatexHumanoidModelInterface
/*     */ {
/*  27 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("turned", "model_dark_latex_fox"), "main");
/*     */   public final ModelPart Head;
/*     */   public final ModelPart Body;
/*     */   public final ModelPart Tail;
/*     */   public final ModelPart LeftArm;
/*     */   public final ModelPart RightArm;
/*     */   public final ModelPart LeftLeg;
/*     */   public final ModelPart RightLeg;
/*     */   public final LatexHumanoidModelController controller;
/*     */   
/*     */   public ModelDark_latex_fox(ModelPart root) {
/*  38 */     super(root);
/*  39 */     this.Head = root.m_171324_("Head");
/*  40 */     this.Body = root.m_171324_("Body");
/*  41 */     this.Tail = this.Body.m_171324_("Tail");
/*  42 */     this.LeftArm = root.m_171324_("LeftArm");
/*  43 */     this.RightArm = root.m_171324_("RightArm");
/*  44 */     this.LeftLeg = root.m_171324_("LeftLeg");
/*  45 */     this.RightLeg = root.m_171324_("RightLeg");
/*  46 */     this.controller = LatexHumanoidModelController.Builder.of((EntityModel)this, this.Head, this.Body, this.Tail, this.RightArm, this.LeftArm, this.RightLeg, this.LeftLeg).hipOffset(0.0F).build();
/*     */   }
/*     */   
/*     */   public static LayerDefinition createBodyLayer() {
/*  50 */     MeshDefinition meshdefinition = new MeshDefinition();
/*  51 */     PartDefinition partdefinition = meshdefinition.m_171576_();
/*     */     
/*  53 */     PartDefinition Head = partdefinition.m_171599_("Head", CubeListBuilder.m_171558_().m_171514_(47, 39).m_171488_(-2.0F, -2.9F, -6.5F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
/*  54 */         .m_171514_(0, 16).m_171488_(-4.0F, -7.0F, -3.5F, 8.0F, 7.0F, 7.0F, new CubeDeformation(0.0F))
/*  55 */         .m_171514_(20, 0).m_171488_(-4.0F, -10.0F, -0.5F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
/*  56 */         .m_171514_(0, 3).m_171488_(1.0F, -10.0F, -0.5F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(0.0F, 0.0F, 0.0F));
/*     */     
/*  58 */     PartDefinition Mask = Head.m_171599_("Mask", CubeListBuilder.m_171558_().m_171514_(0, 11).m_171488_(-2.0F, -7.2F, -4.2F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  59 */         .m_171514_(0, 8).m_171488_(-3.0F, -6.2F, -4.2F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  60 */         .m_171514_(0, 19).m_171488_(-1.0F, -5.2F, -4.2F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
/*  61 */         .m_171514_(20, 5).m_171488_(-2.0F, -3.2F, -7.2F, 4.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
/*  62 */         .m_171514_(0, 4).m_171488_(-2.0F, -1.2F, -7.2F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  63 */         .m_171514_(8, 3).m_171488_(1.0F, -1.2F, -7.2F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  64 */         .m_171514_(4, 19).m_171488_(2.0F, -3.2F, -4.2F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
/*  65 */         .m_171514_(0, 0).m_171488_(3.0F, -5.2F, -4.2F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F))
/*  66 */         .m_171514_(0, 6).m_171488_(2.1F, -3.2F, -7.2F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
/*  67 */         .m_171514_(6, 6).m_171488_(-2.1F, -3.2F, -7.2F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
/*  68 */         .m_171514_(20, 7).m_171488_(-3.0F, -3.2F, -4.2F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
/*  69 */         .m_171514_(10, 3).m_171488_(-4.0F, -5.2F, -4.2F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F))
/*  70 */         .m_171514_(0, 0).m_171488_(-2.0F, -3.2F, -7.2F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(0.0F, 0.0F, 0.375F));
/*     */     
/*  72 */     PartDefinition Body = partdefinition.m_171599_("Body", CubeListBuilder.m_171558_().m_171514_(26, 26).m_171488_(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(0.0F, 0.0F, 0.0F));
/*     */     
/*  74 */     PartDefinition Tail = Body.m_171599_("Tail", CubeListBuilder.m_171558_(), PartPose.m_171419_(0.0F, 11.0F, 0.0F));
/*     */     
/*  76 */     PartDefinition cube_r1 = Tail.m_171599_("cube_r1", CubeListBuilder.m_171558_().m_171514_(0, 0).m_171488_(-2.0F, 7.25F, 12.25F, 4.0F, 4.0F, 12.0F, new CubeDeformation(0.0F))
/*  77 */         .m_171514_(0, 16).m_171488_(-1.0F, 8.25F, 11.25F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, -12.0F, -5.2F, -0.3927F, 0.0F, 0.0F));
/*     */     
/*  79 */     PartDefinition LeftArm = partdefinition.m_171599_("RightArm", CubeListBuilder.m_171558_().m_171514_(32, 0).m_171488_(-2.0F, -2.0F, -2.0F, 3.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(-5.0F, 2.0F, 0.0F));
/*     */     
/*  81 */     PartDefinition RightArm = partdefinition.m_171599_("LeftArm", CubeListBuilder.m_171558_().m_171514_(0, 30).m_171488_(-1.0F, -2.0F, -2.0F, 3.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(5.0F, 2.0F, 0.0F));
/*     */     
/*  83 */     PartDefinition LeftLeg = partdefinition.m_171599_("RightLeg", CubeListBuilder.m_171558_(), PartPose.m_171419_(-2.0F, 12.0F, 0.0F));
/*     */     
/*  85 */     PartDefinition cube_r2 = LeftLeg.m_171599_("cube_r2", CubeListBuilder.m_171558_().m_171514_(46, 23).m_171488_(-2.0F, 4.3732F, -4.2794F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(0.0F, 4.6268F, 1.6794F));
/*     */     
/*  87 */     PartDefinition cube_r3 = LeftLeg.m_171599_("cube_r3", CubeListBuilder.m_171558_().m_171514_(46, 0).m_171488_(-2.0F, 0.0F, -1.0F, 4.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, 4.6268F, 2.2794F, -0.3927F, 0.0F, 0.0F));
/*     */     
/*  89 */     PartDefinition cube_r4 = LeftLeg.m_171599_("cube_r4", CubeListBuilder.m_171558_().m_171514_(14, 38).m_171488_(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, 2.5637F, -2.5296F, 0.7854F, 0.0F, 0.0F));
/*     */     
/*  91 */     PartDefinition cube_r5 = LeftLeg.m_171599_("cube_r5", CubeListBuilder.m_171558_().m_171514_(46, 46).m_171488_(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, -0.8F, 0.2F, -0.3927F, 0.0F, 0.0F));
/*     */     
/*  93 */     PartDefinition RightLeg = partdefinition.m_171599_("LeftLeg", CubeListBuilder.m_171558_(), PartPose.m_171419_(2.0F, 12.0F, 0.0F));
/*     */     
/*  95 */     PartDefinition cube_r6 = RightLeg.m_171599_("cube_r6", CubeListBuilder.m_171558_().m_171514_(30, 19).m_171488_(-2.0F, 4.3732F, -4.2794F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(0.0F, 4.6268F, 1.6794F));
/*     */     
/*  97 */     PartDefinition cube_r7 = RightLeg.m_171599_("cube_r7", CubeListBuilder.m_171558_().m_171514_(0, 47).m_171488_(-2.0F, 0.0F, -1.0F, 4.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, 4.6268F, 2.2794F, -0.3927F, 0.0F, 0.0F));
/*     */     
/*  99 */     PartDefinition cube_r8 = RightLeg.m_171599_("cube_r8", CubeListBuilder.m_171558_().m_171514_(30, 42).m_171488_(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, 2.5637F, -2.5296F, 0.7854F, 0.0F, 0.0F));
/*     */     
/* 101 */     PartDefinition cube_r9 = RightLeg.m_171599_("cube_r9", CubeListBuilder.m_171558_().m_171514_(42, 13).m_171488_(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, -0.8F, 0.2F, -0.3927F, 0.0F, 0.0F));
/*     */     
/* 103 */     return LayerDefinition.m_171565_(meshdefinition, 64, 64);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void m_7695_(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 109 */     this.Head.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 110 */     this.Body.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 111 */     this.LeftArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 112 */     this.RightArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 113 */     this.LeftLeg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 114 */     this.RightLeg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */ 
/*     */   
/*     */   public void prepareMobModel(DarkLatexFoxEntity p_102861_, float p_102862_, float p_102863_, float p_102864_) {
/* 119 */     prepareMobModel(this.controller, (LatexEntity)p_102861_, p_102862_, p_102863_, p_102864_);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setupAnim(DarkLatexFoxEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float HeadPitch) {
/* 124 */     this.controller.setupAnim((LatexEntity)entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, HeadPitch);
/*     */   }
/*     */ 
/*     */   
/*     */   public ModelPart getArm(HumanoidArm humanoidArm) {
/* 129 */     switch (humanoidArm) { default: throw new IncompatibleClassChangeError();case LEFT: case RIGHT: break; }  return 
/*     */       
/* 131 */       this.RightArm;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setupHand() {
/* 137 */     this.controller.setupHand();
/*     */   }
/*     */ 
/*     */   
/*     */   public LatexHumanoidModelController getController() {
/* 142 */     return this.controller;
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6002_(HumanoidArm p_102108_, PoseStack p_102109_) {
/* 147 */     getArm(p_102108_).m_104299_(p_102109_);
/*     */   }
/*     */ 
/*     */   
/*     */   public ModelPart m_5585_() {
/* 152 */     return this.Head;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\client\model\ModelDark_latex_fox.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */