/*     */ package net.ltxprogrammer.turned.client.model;
/*     */ 
/*     */ import com.mojang.blaze3d.vertex.PoseStack;
/*     */ import com.mojang.blaze3d.vertex.VertexConsumer;
/*     */ import net.ltxprogrammer.changed.client.renderer.model.LatexHumanoidModel;
/*     */ import net.ltxprogrammer.changed.client.renderer.model.LatexHumanoidModelController;
/*     */ import net.ltxprogrammer.changed.client.renderer.model.LatexHumanoidModelInterface;
/*     */ import net.ltxprogrammer.changed.entity.LatexEntity;
/*     */ import net.ltxprogrammer.turned.entity.DarkLatexSnepEntity;
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
/*     */ public class ModelDark_latex_snep
/*     */   extends LatexHumanoidModel<DarkLatexSnepEntity>
/*     */   implements LatexHumanoidModelInterface
/*     */ {
/*  27 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("turned", "model_dark_latex_snep"), "main");
/*     */   public final ModelPart Head;
/*     */   public final ModelPart Torso;
/*     */   public final ModelPart LeftArm;
/*     */   public final ModelPart RightArm;
/*     */   public final ModelPart LeftLeg;
/*     */   public final ModelPart Rightleg;
/*     */   public final LatexHumanoidModelController controller;
/*     */   
/*     */   public ModelDark_latex_snep(ModelPart root) {
/*  37 */     super(root);
/*  38 */     this.Head = root.m_171324_("Head");
/*  39 */     this.Torso = root.m_171324_("Body");
/*  40 */     this.LeftArm = root.m_171324_("LeftArm");
/*  41 */     this.RightArm = root.m_171324_("RightArm");
/*  42 */     this.LeftLeg = root.m_171324_("LeftLeg");
/*  43 */     this.Rightleg = root.m_171324_("Rightleg");
/*  44 */     this.controller = LatexHumanoidModelController.Builder.of((EntityModel)this, this.Head, this.Torso, this.Torso.m_171324_("Tail"), this.RightArm, this.LeftArm, this.Rightleg, this.LeftLeg).hipOffset(-1.0F).build();
/*     */   }
/*     */   
/*     */   public static LayerDefinition createBodyLayer() {
/*  48 */     MeshDefinition meshdefinition = new MeshDefinition();
/*  49 */     PartDefinition partdefinition = meshdefinition.m_171576_();
/*     */     
/*  51 */     PartDefinition Head = partdefinition.m_171599_("Head", CubeListBuilder.m_171558_().m_171514_(52, 18).m_171488_(-4.0F, -6.0F, -4.0F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
/*  52 */         .m_171514_(0, 17).m_171488_(-4.0F, -3.0F, -4.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
/*  53 */         .m_171514_(0, 31).m_171488_(-3.0F, -3.0F, -4.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
/*  54 */         .m_171514_(22, 0).m_171488_(-2.0F, -3.0F, -4.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
/*  55 */         .m_171514_(23, 21).m_171488_(0.0F, -3.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
/*  56 */         .m_171514_(0, 17).m_171488_(-4.0F, -6.0F, -3.0F, 8.0F, 7.0F, 7.0F, new CubeDeformation(0.0F))
/*  57 */         .m_171514_(23, 18).m_171488_(-4.0F, 1.0F, 3.0F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
/*  58 */         .m_171514_(0, 11).m_171488_(-4.0F, 3.0F, 3.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
/*  59 */         .m_171514_(22, 3).m_171488_(-4.0F, 4.0F, 3.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
/*  60 */         .m_171514_(3, 22).m_171488_(-4.0F, 5.0F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
/*  61 */         .m_171514_(56, 28).m_171488_(2.0F, -8.0F, -1.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
/*  62 */         .m_171514_(56, 22).m_171488_(-5.0F, -8.0F, -1.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(0.0F, -2.0F, 0.0F));
/*     */     
/*  64 */     PartDefinition mask = Head.m_171599_("mask", CubeListBuilder.m_171558_().m_171514_(0, 10).m_171488_(-3.0F, -3.0F, -5.0F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  65 */         .m_171514_(0, 1).m_171488_(-2.0F, -2.0F, -5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  66 */         .m_171514_(0, 0).m_171488_(1.0F, -2.0F, -5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  67 */         .m_171514_(0, 13).m_171488_(-3.0F, -6.0F, -5.0F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  68 */         .m_171514_(11, 0).m_171488_(-0.5F, -4.0F, -5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  69 */         .m_171514_(22, 11).m_171488_(2.375F, -5.0F, -5.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
/*  70 */         .m_171514_(22, 11).m_171488_(-3.625F, -5.0F, -5.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
/*  71 */         .m_171514_(22, 5).m_171488_(-1.5F, -5.0F, -5.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(0.0F, 2.0F, 1.75F));
/*     */     
/*  73 */     PartDefinition Body = partdefinition.m_171599_("Body", CubeListBuilder.m_171558_().m_171514_(0, 31).m_171488_(-4.0F, 2.0F, -2.0F, 8.0F, 11.0F, 4.0F, new CubeDeformation(0.0F))
/*  74 */         .m_171514_(22, 0).m_171488_(-5.0F, 1.0F, -3.0F, 10.0F, 5.0F, 6.0F, new CubeDeformation(0.0F))
/*  75 */         .m_171514_(30, 11).m_171488_(-3.5F, 6.0F, -3.0F, 7.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(0.0F, -2.0F, 0.0F));
/*     */     
/*  77 */     PartDefinition Tail = Body.m_171599_("Tail", CubeListBuilder.m_171558_(), PartPose.m_171419_(0.0F, 12.0F, 0.0F));
/*     */     
/*  79 */     PartDefinition bone2 = Tail.m_171599_("bone2", CubeListBuilder.m_171558_().m_171514_(0, 0).m_171488_(-2.0F, -1.5902F, 1.4559F, 4.0F, 3.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, 0.0F, 0.0F, -0.5672F, 0.0F, 0.0F));
/*     */     
/*  81 */     PartDefinition bone8 = bone2.m_171599_("bone8", CubeListBuilder.m_171558_().m_171514_(20, 21).m_171488_(-2.0F, 6.6167F, -7.7314F, 4.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, -10.4336F, 18.9186F, 0.3927F, 0.0F, 0.0F));
/*     */     
/*  83 */     PartDefinition LeftArm = partdefinition.m_171599_("RightArm", CubeListBuilder.m_171558_().m_171514_(0, 54).m_171488_(-3.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
/*  84 */         .m_171514_(24, 34).m_171488_(-4.0F, 5.0F, -2.0F, 5.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(-5.0F, 0.0F, 0.0F));
/*     */     
/*  86 */     PartDefinition RightArm = partdefinition.m_171599_("LeftArm", CubeListBuilder.m_171558_().m_171514_(50, 49).m_171488_(-1.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
/*  87 */         .m_171514_(38, 18).m_171488_(-1.0F, 5.0F, -2.0F, 5.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(5.0F, 0.0F, 0.0F));
/*     */     
/*  89 */     PartDefinition LeftLeg = partdefinition.m_171599_("Rightleg", CubeListBuilder.m_171558_().m_171514_(50, 40).m_171488_(-2.0F, 0.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
/*  90 */         .m_171514_(0, 46).m_171488_(-2.0F, 10.213F, -3.1649F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(-2.0F, 11.0F, 0.0F));
/*     */     
/*  92 */     PartDefinition bone = LeftLeg.m_171599_("bone", CubeListBuilder.m_171558_().m_171514_(50, 7).m_171488_(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, 1.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/*     */     
/*  94 */     PartDefinition bone3 = LeftLeg.m_171599_("bone3", CubeListBuilder.m_171558_().m_171514_(18, 46).m_171488_(-6.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(4.0F, 4.0F, -1.0F, 0.6545F, 0.0F, 0.0F));
/*     */     
/*  96 */     PartDefinition bone4 = LeftLeg.m_171599_("bone4", CubeListBuilder.m_171558_().m_171514_(16, 56).m_171488_(-2.0F, -0.1371F, 3.7689F, 4.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, 4.0F, -1.0F, -0.48F, 0.0F, 0.0F));
/*     */     
/*  98 */     PartDefinition Rightleg = partdefinition.m_171599_("LeftLeg", CubeListBuilder.m_171558_().m_171514_(48, 0).m_171488_(-2.0F, 0.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
/*  99 */         .m_171514_(37, 41).m_171488_(-2.0F, 10.213F, -3.1649F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(2.0F, 11.0F, 0.0F));
/*     */     
/* 101 */     PartDefinition bone5 = Rightleg.m_171599_("bone5", CubeListBuilder.m_171558_().m_171514_(34, 49).m_171488_(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, 1.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/*     */     
/* 103 */     PartDefinition bone6 = Rightleg.m_171599_("bone6", CubeListBuilder.m_171558_().m_171514_(44, 30).m_171488_(2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-4.0F, 4.0F, -1.0F, 0.6545F, 0.0F, 0.0F));
/*     */     
/* 105 */     PartDefinition bone7 = Rightleg.m_171599_("bone7", CubeListBuilder.m_171558_().m_171514_(0, 0).m_171488_(-2.0F, -0.1371F, 3.7689F, 4.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, 4.0F, -1.0F, -0.48F, 0.0F, 0.0F));
/*     */     
/* 107 */     return LayerDefinition.m_171565_(meshdefinition, 80, 80);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void m_7695_(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 113 */     this.Head.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 114 */     this.Torso.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 115 */     this.LeftArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 116 */     this.RightArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 117 */     this.LeftLeg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 118 */     this.Rightleg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */ 
/*     */   
/*     */   public void prepareMobModel(DarkLatexSnepEntity p_102861_, float p_102862_, float p_102863_, float p_102864_) {
/* 123 */     prepareMobModel(this.controller, (LatexEntity)p_102861_, p_102862_, p_102863_, p_102864_);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setupAnim(DarkLatexSnepEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float HeadPitch) {
/* 128 */     this.controller.setupAnim((LatexEntity)entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, HeadPitch);
/*     */   }
/*     */ 
/*     */   
/*     */   public ModelPart getArm(HumanoidArm humanoidArm) {
/* 133 */     switch (humanoidArm) { default: throw new IncompatibleClassChangeError();case LEFT: case RIGHT: break; }  return 
/*     */       
/* 135 */       this.RightArm;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setupHand() {
/* 141 */     this.controller.setupHand();
/*     */   }
/*     */ 
/*     */   
/*     */   public LatexHumanoidModelController getController() {
/* 146 */     return this.controller;
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6002_(HumanoidArm p_102108_, PoseStack p_102109_) {
/* 151 */     getArm(p_102108_).m_104299_(p_102109_);
/*     */   }
/*     */ 
/*     */   
/*     */   public ModelPart m_5585_() {
/* 156 */     return this.Head;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\client\model\ModelDark_latex_snep.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */