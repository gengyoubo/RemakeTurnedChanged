/*     */ package net.ltxprogrammer.turned.client.model;
/*     */ 
/*     */ import com.mojang.blaze3d.vertex.PoseStack;
/*     */ import com.mojang.blaze3d.vertex.VertexConsumer;
/*     */ import net.ltxprogrammer.changed.client.renderer.model.LatexHumanoidModel;
/*     */ import net.ltxprogrammer.changed.client.renderer.model.LatexHumanoidModelController;
/*     */ import net.ltxprogrammer.changed.client.renderer.model.LatexHumanoidModelInterface;
/*     */ import net.ltxprogrammer.changed.entity.LatexEntity;
/*     */ import net.ltxprogrammer.turned.entity.DarkLatexSnakeEntity;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Modeldark_latex_snek_model
/*     */   extends LatexHumanoidModel<DarkLatexSnakeEntity>
/*     */   implements LatexHumanoidModelInterface
/*     */ {
/*  31 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("turned", "modeldark_latex_snek_model"), "main");
/*     */   
/*     */   public final ModelPart Head;
/*     */   public final ModelPart Body;
/*     */   public final ModelPart LeftArm;
/*     */   public final ModelPart RightArm;
/*     */   public final ModelPart Tail;
/*     */   public final LatexHumanoidModelController controller;
/*     */   
/*     */   public Modeldark_latex_snek_model(ModelPart root) {
/*  41 */     super(root);
/*  42 */     this.Head = root.m_171324_("Head");
/*  43 */     this.Body = root.m_171324_("Body");
/*  44 */     this.LeftArm = root.m_171324_("LeftArm");
/*  45 */     this.RightArm = root.m_171324_("RightArm");
/*  46 */     this.Tail = root.m_171324_("Tail");
/*  47 */     this.controller = LatexHumanoidModelController.Builder.of((EntityModel)this, this.Head, this.Body, this.Tail, this.RightArm, this.LeftArm, root, root).build();
/*     */   }
/*     */   
/*     */   public static LayerDefinition createBodyLayer() {
/*  51 */     MeshDefinition meshdefinition = new MeshDefinition();
/*  52 */     PartDefinition partdefinition = meshdefinition.m_171576_();
/*  53 */     PartDefinition Head = partdefinition.m_171599_("Head", 
/*  54 */         CubeListBuilder.m_171558_().m_171514_(48, 6).m_171488_(-4.0F, -2.2F, -1.875F, 8.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  55 */         PartPose.m_171419_(0.0F, 0.0F, 0.0F));
/*  56 */     PartDefinition headbone = Head.m_171599_("headbone", 
/*  57 */         CubeListBuilder.m_171558_().m_171514_(16, 53).m_171488_(-3.0F, 1.1522F, 0.1046F, 6.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  58 */         PartPose.m_171423_(0.0F, -7.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/*  59 */     PartDefinition headbone2 = Head.m_171599_("headbone2", 
/*  60 */         CubeListBuilder.m_171558_().m_171514_(52, 11).m_171488_(-3.0F, 0.2331F, -3.4936F, 6.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  61 */         PartPose.m_171423_(0.0F, -7.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
/*  62 */     PartDefinition headbone3 = Head.m_171599_("headbone3", 
/*  63 */         CubeListBuilder.m_171558_().m_171514_(0, 0).m_171488_(-3.0F, 3.1364F, -2.6487F, 6.0F, 2.0F, 8.0F, new CubeDeformation(0.0F))
/*  64 */         .m_171514_(20, 34).m_171488_(-3.0F, 1.1364F, -0.6487F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), 
/*  65 */         PartPose.m_171419_(0.0F, -10.5F, -4.5F));
/*  66 */     PartDefinition Jawbone = headbone3.m_171599_("Jawbone", 
/*  67 */         CubeListBuilder.m_171558_().m_171514_(43, 19).m_171488_(-6.0F, 6.7184F, -10.0575F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), 
/*  68 */         PartPose.m_171423_(3.0F, -2.4136F, 6.2263F, 0.1745F, 0.0F, 0.0F));
/*  69 */     PartDefinition Tongue = Jawbone.m_171599_("Tongue", 
/*  70 */         CubeListBuilder.m_171558_().m_171514_(3, 7).m_171488_(-1.125F, -30.2094F, -8.5178F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 0)
/*  71 */         .m_171488_(-0.5F, -30.2094F, -7.5178F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(2, 0).m_171488_(0.125F, -30.2094F, -8.5178F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), 
/*     */         
/*  73 */         PartPose.m_171419_(-3.0F, 36.9136F, -1.7263F));
/*  74 */     PartDefinition Mask = Head.m_171599_("Mask", 
/*  75 */         CubeListBuilder.m_171558_().m_171514_(46, 26).m_171488_(-3.0F, -32.3636F, -5.3987F, 6.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
/*  76 */         .m_171514_(36, 36).m_171488_(-3.0F, -30.3636F, -7.3987F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(36, 36)
/*  77 */         .m_171488_(-3.0F, -32.3636F, -5.3987F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(36, 36)
/*  78 */         .m_171488_(-3.0F, -32.3636F, -3.3987F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(46, 28)
/*  79 */         .m_171488_(-3.0F, -30.3636F, -7.3987F, 6.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(4, 2)
/*  80 */         .m_171488_(3.125F, -30.3636F, -7.3987F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(26, 9)
/*  81 */         .m_171488_(3.125F, -30.3636F, -6.3987F, 0.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).m_171514_(10, 32)
/*  82 */         .m_171488_(3.125F, -32.3636F, -5.3987F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(0, 1)
/*  83 */         .m_171488_(3.125F, -31.3636F, -1.3987F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(0, 1)
/*  84 */         .m_171488_(3.125F, -31.3636F, -5.3987F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(23, 18)
/*  85 */         .m_171488_(-3.125F, -30.3636F, -6.3987F, 0.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).m_171514_(0, 32)
/*  86 */         .m_171488_(-3.125F, -32.3636F, -5.3987F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(4, 0)
/*  87 */         .m_171488_(-3.125F, -30.3636F, -7.3987F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 0)
/*  88 */         .m_171488_(-3.125F, -31.3636F, -1.3987F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(0, 0)
/*  89 */         .m_171488_(-3.125F, -31.3636F, -5.3987F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(20, 0)
/*  90 */         .m_171488_(1.0F, -28.3636F, -7.3987F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(20, 2)
/*  91 */         .m_171488_(-2.0F, -28.3636F, -7.3987F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), 
/*  92 */         PartPose.m_171419_(0.0F, 22.875F, 0.0F));
/*  93 */     PartDefinition Body = partdefinition.m_171599_("Body", 
/*  94 */         CubeListBuilder.m_171558_().m_171514_(0, 21).m_171488_(-4.5F, -1.2F, -2.375F, 9.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(40, 38)
/*  95 */         .m_171488_(-4.0F, 9.8F, -1.875F, 8.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(0, 38)
/*  96 */         .m_171488_(-3.5F, 4.8F, -1.875F, 7.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(46, 0)
/*  97 */         .m_171488_(-4.0F, 2.8F, -1.875F, 8.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  98 */         PartPose.m_171419_(0.0F, 0.0F, 0.0F));
/*  99 */     PartDefinition LeftArm = partdefinition.m_171599_("RightArm", 
/* 100 */         CubeListBuilder.m_171558_().m_171514_(0, 47).m_171488_(-3.2164F, -3.1763F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 101 */         PartPose.m_171423_(-5.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.2182F));
/* 102 */     PartDefinition RightArm_r1 = LeftArm.m_171599_("RightArm_r1", 
/* 103 */         CubeListBuilder.m_171558_().m_171514_(0, 6).m_171488_(-2.3865F, 8.8266F, 0.1201F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 10)
/* 104 */         .m_171488_(-2.3865F, 8.8266F, -1.3799F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 12)
/* 105 */         .m_171488_(-2.3865F, 8.8266F, 1.6201F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(54, 51)
/* 106 */         .m_171488_(-2.3865F, 1.8266F, -1.3799F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 107 */         PartPose.m_171423_(-1.0F, 1.8F, -0.125F, -0.5219F, -0.0436F, -0.0756F));
/* 108 */     PartDefinition RightArm = partdefinition.m_171599_("LeftArm", 
/* 109 */         CubeListBuilder.m_171558_().m_171514_(38, 51).m_171488_(-0.7836F, -3.1763F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 110 */         PartPose.m_171423_(5.0F, 2.0F, 0.0F, 0.0F, 0.0F, -0.2182F));
/* 111 */     PartDefinition RightArm_r2 = RightArm.m_171599_("RightArm_r2", 
/* 112 */         CubeListBuilder.m_171558_().m_171514_(3, 5).m_171488_(1.3865F, 8.8266F, 1.6201F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 4)
/* 113 */         .m_171488_(1.3865F, 8.8266F, -1.3799F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 0)
/* 114 */         .m_171488_(1.3865F, 8.8266F, 0.1201F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 59)
/* 115 */         .m_171488_(-1.6135F, 1.8266F, -1.3799F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 116 */         PartPose.m_171423_(1.0F, 1.8F, -0.125F, -0.5219F, 0.0436F, 0.0756F));
/* 117 */     PartDefinition Tail = partdefinition.m_171599_("Tail", CubeListBuilder.m_171558_(), PartPose.m_171419_(-2.0F, 12.0F, 0.0F));
/* 118 */     PartDefinition bone2 = Tail.m_171599_("bone2", 
/* 119 */         CubeListBuilder.m_171558_().m_171514_(46, 30).m_171488_(-6.0F, 0.8F, -2.0F, 8.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 120 */         PartPose.m_171419_(4.0F, 0.0F, 0.0F));
/* 121 */     PartDefinition bone = Tail.m_171599_("bone", 
/* 122 */         CubeListBuilder.m_171558_().m_171514_(24, 26).m_171488_(-4.5F, -3.677F, -4.8486F, 9.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 123 */         PartPose.m_171423_(2.0F, 6.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
/* 124 */     PartDefinition bone_r1 = bone.m_171599_("bone_r1", 
/* 125 */         CubeListBuilder.m_171558_().m_171514_(42, 45).m_171488_(-4.5F, -1.0F, -1.5F, 9.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 126 */         PartPose.m_171423_(0.0F, -5.8281F, -4.4184F, 1.1781F, 0.0F, 0.0F));
/* 127 */     PartDefinition bone_r2 = bone.m_171599_("bone_r2", 
/* 128 */         CubeListBuilder.m_171558_().m_171514_(0, 30).m_171488_(-4.5F, -1.0F, -2.5F, 9.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 129 */         PartPose.m_171423_(0.0F, -4.9507F, -2.9997F, 0.3927F, 0.0F, 0.0F));
/* 130 */     PartDefinition bone3 = Tail.m_171599_("bone3", 
/* 131 */         CubeListBuilder.m_171558_().m_171514_(26, 8).m_171488_(-6.5F, 2.8F, -3.6569F, 9.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 132 */         PartPose.m_171419_(4.0F, 0.0F, 0.0F));
/* 133 */     PartDefinition bone4 = Tail.m_171599_("bone4", 
/* 134 */         CubeListBuilder.m_171558_().m_171514_(23, 17).m_171488_(-4.5F, -0.6603F, -3.6846F, 9.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 135 */         PartPose.m_171423_(2.0F, 6.0F, 0.0F, 0.3927F, 0.0F, 0.0F));
/* 136 */     PartDefinition bone5 = Tail.m_171599_("bone5", 
/* 137 */         CubeListBuilder.m_171558_().m_171514_(20, 0).m_171488_(-4.5F, -0.2439F, -4.967F, 9.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 138 */         PartPose.m_171423_(2.0F, 6.0F, 0.0F, 1.1781F, 0.0F, 0.0F));
/* 139 */     PartDefinition bone6 = Tail.m_171599_("bone6", 
/* 140 */         CubeListBuilder.m_171558_().m_171514_(0, 10).m_171488_(-4.5F, 1.5694F, -6.0263F, 9.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(22, 42)
/* 141 */         .m_171488_(-3.5F, 8.5694F, -6.0263F, 7.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)).m_171514_(16, 61)
/* 142 */         .m_171488_(-2.5F, 16.5694F, -6.0263F, 5.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), 
/* 143 */         PartPose.m_171423_(2.0F, 6.0F, 0.0F, 1.5708F, 0.0F, 0.0F));
/* 144 */     return LayerDefinition.m_171565_(meshdefinition, 80, 80);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void m_7695_(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 150 */     this.Head.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 151 */     this.Body.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 152 */     this.LeftArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 153 */     this.RightArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 154 */     this.Tail.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */ 
/*     */   
/*     */   public void prepareMobModel(DarkLatexSnakeEntity p_102861_, float p_102862_, float p_102863_, float p_102864_) {
/* 159 */     prepareMobModel(this.controller, (LatexEntity)p_102861_, p_102862_, p_102863_, p_102864_);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setupAnim(DarkLatexSnakeEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float HeadPitch) {
/* 164 */     this.controller.setupAnim((LatexEntity)entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, HeadPitch);
/*     */   }
/*     */ 
/*     */   
/*     */   public ModelPart getArm(HumanoidArm humanoidArm) {
/* 169 */     switch (humanoidArm) { default: throw new IncompatibleClassChangeError();case LEFT: case RIGHT: break; }  return 
/*     */       
/* 171 */       this.RightArm;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setupHand() {
/* 177 */     this.controller.setupHand();
/*     */   }
/*     */ 
/*     */   
/*     */   public LatexHumanoidModelController getController() {
/* 182 */     return this.controller;
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6002_(HumanoidArm p_102108_, PoseStack p_102109_) {
/* 187 */     getArm(p_102108_).m_104299_(p_102109_);
/*     */   }
/*     */ 
/*     */   
/*     */   public ModelPart m_5585_() {
/* 192 */     return this.Head;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\client\model\Modeldark_latex_snek_model.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */