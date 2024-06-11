/*     */ package net.ltxprogrammer.turned.client.model;
/*     */ import com.mojang.blaze3d.vertex.PoseStack;
/*     */ import com.mojang.blaze3d.vertex.VertexConsumer;
/*     */ import net.ltxprogrammer.changed.client.renderer.model.LatexHumanoidModelController;
/*     */ import net.ltxprogrammer.turned.entity.DarkLatexQueenBeeEntity;
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
/*     */ public class ModelDark_latex_queen_bee extends LatexHumanoidModel<DarkLatexQueenBeeEntity> implements LatexHumanoidModelInterface {
/*  18 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(LatexMod.modResource("dl_queen_bee"), "main");
/*     */   private final ModelPart QueenBee;
/*     */   private final ModelPart Head;
/*     */   private final ModelPart Torso;
/*     */   private final ModelPart LeftArm;
/*     */   private final ModelPart RightArm;
/*     */   private final ModelPart LeftLeg;
/*     */   private final ModelPart RightLeg;
/*     */   private final LatexHumanoidModelController controller;
/*     */   
/*     */   public ModelDark_latex_queen_bee(ModelPart root) {
/*  29 */     super(root);
/*  30 */     this.QueenBee = root.m_171324_("QueenBee");
/*  31 */     this.Head = this.QueenBee.m_171324_("Head");
/*  32 */     this.Torso = this.QueenBee.m_171324_("Body");
/*  33 */     this.LeftArm = this.QueenBee.m_171324_("LeftArm");
/*  34 */     this.RightArm = this.QueenBee.m_171324_("RightArm");
/*  35 */     this.LeftLeg = this.QueenBee.m_171324_("LeftLeg");
/*  36 */     this.RightLeg = this.QueenBee.m_171324_("RightLeg");
/*  37 */     this.controller = LatexHumanoidModelController.Builder.of((EntityModel)this, this.Head, this.Torso, this.Torso.m_171324_("Tail"), this.RightArm, this.LeftArm, this.RightLeg, this.LeftLeg).hipOffset(0.0F).build();
/*     */   }
/*     */   
/*     */   public static LayerDefinition createBodyLayer() {
/*  41 */     MeshDefinition meshdefinition = new MeshDefinition();
/*  42 */     PartDefinition partdefinition = meshdefinition.m_171576_();
/*     */     
/*  44 */     PartDefinition QueenBee = partdefinition.m_171599_("QueenBee", CubeListBuilder.m_171558_(), PartPose.m_171423_(0.0F, 24.0F, 0.0F, 0.0F, 3.1416F, 0.0F));
/*     */     
/*  46 */     PartDefinition Head = QueenBee.m_171599_("Head", CubeListBuilder.m_171558_().m_171514_(28, 28).m_171488_(-4.0F, -7.0F, -4.0F, 8.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(0.0F, -34.0F, 0.0F));
/*     */     
/*  48 */     PartDefinition cube_r1 = Head.m_171599_("cube_r1", CubeListBuilder.m_171558_().m_171514_(0, 0).m_171488_(-3.5F, -20.7F, -6.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
/*  49 */         .m_171514_(4, 5).m_171488_(-9.5F, -20.7F, -6.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(6.0F, -4.4965F, -13.7044F, -1.5708F, 0.0F, 0.0F));
/*     */     
/*  51 */     PartDefinition cube_r2 = Head.m_171599_("cube_r2", CubeListBuilder.m_171558_().m_171514_(31, 0).m_171488_(-3.5F, -19.7F, -6.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
/*  52 */         .m_171514_(58, 0).m_171488_(-9.5F, -19.7F, -6.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(6.0F, 10.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/*     */     
/*  54 */     PartDefinition Mask = Head.m_171599_("Mask", CubeListBuilder.m_171558_().m_171514_(28, 25).m_171488_(-3.0F, -12.0F, 4.5F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  55 */         .m_171514_(28, 26).m_171488_(3.0F, -13.0F, 4.5F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
/*  56 */         .m_171514_(48, 27).m_171488_(4.0F, -14.0F, 4.5F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  57 */         .m_171514_(28, 24).m_171488_(-6.0F, -15.0F, 4.5F, 12.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  58 */         .m_171514_(0, 12).m_171488_(-3.0F, -16.0F, 4.5F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  59 */         .m_171514_(14, 34).m_171488_(-2.0F, -17.0F, 4.5F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  60 */         .m_171514_(2, 49).m_171488_(-5.0F, -14.0F, 4.5F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  61 */         .m_171514_(10, 9).m_171488_(-4.0F, -13.0F, 4.5F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
/*  62 */         .m_171514_(17, 49).m_171488_(-1.0F, -14.0F, 4.5F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(0.0F, 10.0F, 0.0F));
/*     */     
/*  64 */     PartDefinition Body = QueenBee.m_171599_("Body", CubeListBuilder.m_171558_().m_171514_(0, 38).m_171488_(-6.0F, 1.0F, -2.0F, 12.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
/*  65 */         .m_171514_(0, 22).m_171488_(-5.0F, -1.0F, -4.0F, 10.0F, 4.0F, 8.0F, new CubeDeformation(0.0F))
/*  66 */         .m_171514_(31, 0).m_171488_(-5.0F, 3.0F, -3.25F, 10.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
/*  67 */         .m_171514_(56, 43).m_171488_(-7.0F, 0.0F, -4.0F, 2.0F, 4.0F, 8.0F, new CubeDeformation(0.0F))
/*  68 */         .m_171514_(19, 75).m_171488_(-6.0F, 4.0F, -3.25F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
/*  69 */         .m_171514_(52, 24).m_171488_(5.0F, 0.0F, -4.0F, 2.0F, 4.0F, 8.0F, new CubeDeformation(0.0F))
/*  70 */         .m_171514_(72, 74).m_171488_(5.0F, 4.0F, -3.25F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
/*  71 */         .m_171514_(38, 16).m_171488_(-5.0F, 3.25F, -3.0F, 10.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
/*  72 */         .m_171514_(22, 51).m_171488_(-4.0F, 6.0F, -2.0F, 8.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
/*  73 */         .m_171514_(32, 42).m_171488_(-5.0F, 11.0F, -2.0F, 10.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
/*  74 */         .m_171514_(0, 47).m_171488_(-3.0F, 9.0F, -2.5F, 6.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(0.0F, -34.0F, 0.0F));
/*     */     
/*  76 */     PartDefinition Wings = QueenBee.m_171599_("Wings", CubeListBuilder.m_171558_(), PartPose.m_171419_(0.0F, -27.0F, 0.0F));
/*     */     
/*  78 */     PartDefinition LeftWings = Wings.m_171599_("LeftWings", CubeListBuilder.m_171558_().m_171514_(30, 47).m_171488_(0.159F, -6.6563F, 1.8484F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
/*  79 */         .m_171514_(0, 47).m_171488_(-0.841F, -8.6563F, 1.8484F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F))
/*  80 */         .m_171514_(2, 76).m_171488_(-1.841F, -9.6563F, 1.8484F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F))
/*  81 */         .m_171514_(4, 34).m_171488_(-4.841F, -10.6563F, 1.8484F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  82 */         .m_171514_(62, 42).m_171488_(-2.841F, -9.6563F, 1.8484F, 1.0F, 7.0F, 0.0F, new CubeDeformation(0.0F))
/*  83 */         .m_171514_(47, 11).m_171488_(-0.841F, -9.6563F, 1.8484F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  84 */         .m_171514_(33, 27).m_171488_(-8.841F, -9.6563F, 1.8484F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  85 */         .m_171514_(22, 47).m_171488_(-4.841F, -9.6563F, 1.8484F, 2.0F, 8.0F, 0.0F, new CubeDeformation(0.0F))
/*  86 */         .m_171514_(52, 24).m_171488_(-7.841F, -8.6563F, 1.8484F, 2.0F, 8.0F, 0.0F, new CubeDeformation(0.0F))
/*  87 */         .m_171514_(62, 55).m_171488_(-5.841F, -8.6563F, 1.8484F, 1.0F, 7.0F, 0.0F, new CubeDeformation(0.0F))
/*  88 */         .m_171514_(32, 60).m_171488_(-8.841F, -8.6563F, 1.8484F, 1.0F, 9.0F, 0.0F, new CubeDeformation(0.0F))
/*  89 */         .m_171514_(45, 12).m_171488_(-10.841F, -8.6563F, 1.8484F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  90 */         .m_171514_(56, 24).m_171488_(-10.841F, -7.6563F, 1.8484F, 2.0F, 8.0F, 0.0F, new CubeDeformation(0.0F))
/*  91 */         .m_171514_(47, 8).m_171488_(-11.841F, -7.6563F, 1.8484F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
/*  92 */         .m_171514_(6, 76).m_171488_(-12.841F, -5.6563F, 1.8484F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F))
/*  93 */         .m_171514_(4, 76).m_171488_(-11.841F, -5.6563F, 1.8484F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F))
/*  94 */         .m_171514_(33, 26).m_171488_(-11.841F, 0.3438F, 1.8484F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  95 */         .m_171514_(44, 25).m_171488_(-7.841F, -0.6563F, 1.8484F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  96 */         .m_171514_(22, 34).m_171488_(-5.841F, -1.6563F, 1.8484F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  97 */         .m_171514_(47, 10).m_171488_(-2.841F, -2.6563F, 1.8484F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  98 */         .m_171514_(20, 47).m_171488_(-1.841F, -3.6563F, 1.8484F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  99 */         .m_171514_(41, 27).m_171488_(-0.841F, -4.6563F, 1.8484F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(-6.159F, 2.6563F, -6.0984F));
/*     */     
/* 101 */     PartDefinition cube_r3 = LeftWings.m_171599_("cube_r3", CubeListBuilder.m_171558_().m_171514_(60, 55).m_171488_(-0.9688F, -3.6563F, 0.0F, 1.0F, 7.0F, 0.0F, new CubeDeformation(0.0F))
/* 102 */         .m_171514_(43, 8).m_171488_(-3.9688F, -0.6563F, 0.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F))
/* 103 */         .m_171514_(23, 37).m_171488_(0.0312F, 2.3438F, 0.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/* 104 */         .m_171514_(31, 11).m_171488_(-3.9688F, 3.3438F, 0.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/* 105 */         .m_171514_(4, 37).m_171488_(3.0312F, 0.3438F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/* 106 */         .m_171514_(40, 25).m_171488_(2.0312F, 1.3438F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/* 107 */         .m_171514_(2, 7).m_171488_(-4.9688F, -0.6563F, 0.0F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F))
/* 108 */         .m_171514_(36, 22).m_171488_(-3.9688F, -2.6563F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
/* 109 */         .m_171514_(30, 73).m_171488_(-2.9688F, -2.6563F, 0.0F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F))
/* 110 */         .m_171514_(0, 76).m_171488_(-1.9688F, -2.6563F, 0.0F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F))
/* 111 */         .m_171514_(60, 36).m_171488_(0.0312F, -3.6563F, 0.0F, 2.0F, 6.0F, 0.0F, new CubeDeformation(0.0F))
/* 112 */         .m_171514_(41, 12).m_171488_(-2.9688F, -3.6563F, 0.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/* 113 */         .m_171514_(39, 8).m_171488_(2.0312F, -3.6563F, 0.0F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F))
/* 114 */         .m_171514_(31, 12).m_171488_(-0.9688F, -4.6563F, 0.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/* 115 */         .m_171514_(45, 8).m_171488_(3.0312F, -3.6563F, 0.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F))
/* 116 */         .m_171514_(2, 47).m_171488_(4.0312F, -1.6563F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));
/*     */     
/* 118 */     PartDefinition RightWings = Wings.m_171599_("RightWings", CubeListBuilder.m_171558_().m_171514_(0, 34).m_171488_(-2.5476F, -4.619F, 0.0F, 2.0F, 8.0F, 0.0F, new CubeDeformation(0.0F))
/* 119 */         .m_171514_(31, 6).m_171488_(-2.5476F, 3.381F, 0.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/* 120 */         .m_171514_(15, 37).m_171488_(0.4524F, 4.381F, 0.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/* 121 */         .m_171514_(4, 22).m_171488_(0.4524F, -3.619F, 0.0F, 2.0F, 8.0F, 0.0F, new CubeDeformation(0.0F))
/* 122 */         .m_171514_(34, 60).m_171488_(-0.5476F, -3.619F, 0.0F, 1.0F, 7.0F, 0.0F, new CubeDeformation(0.0F))
/* 123 */         .m_171514_(10, 0).m_171488_(2.4524F, -3.619F, 0.0F, 1.0F, 9.0F, 0.0F, new CubeDeformation(0.0F))
/* 124 */         .m_171514_(31, 8).m_171488_(2.4524F, 5.381F, 0.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/* 125 */         .m_171514_(64, 36).m_171488_(5.4524F, -0.619F, 0.0F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F))
/* 126 */         .m_171514_(58, 69).m_171488_(6.4524F, -0.619F, 0.0F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F))
/* 127 */         .m_171514_(31, 0).m_171488_(5.4524F, -2.619F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
/* 128 */         .m_171514_(0, 22).m_171488_(3.4524F, -2.619F, 0.0F, 2.0F, 8.0F, 0.0F, new CubeDeformation(0.0F))
/* 129 */         .m_171514_(19, 37).m_171488_(3.4524F, -3.619F, 0.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/* 130 */         .m_171514_(31, 9).m_171488_(-0.5476F, -4.619F, 0.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/* 131 */         .m_171514_(31, 10).m_171488_(-4.5476F, -5.619F, 0.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/* 132 */         .m_171514_(60, 42).m_171488_(-3.5476F, -4.619F, 0.0F, 1.0F, 7.0F, 0.0F, new CubeDeformation(0.0F))
/* 133 */         .m_171514_(23, 35).m_171488_(-5.5476F, -4.619F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/* 134 */         .m_171514_(28, 73).m_171488_(-4.5476F, -4.619F, 0.0F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F))
/* 135 */         .m_171514_(34, 42).m_171488_(-5.5476F, -3.619F, 0.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F))
/* 136 */         .m_171514_(35, 0).m_171488_(-6.5476F, -1.619F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
/* 137 */         .m_171514_(34, 34).m_171488_(-5.5476F, 0.381F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/* 138 */         .m_171514_(14, 35).m_171488_(-4.5476F, 1.381F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/* 139 */         .m_171514_(19, 35).m_171488_(-3.5476F, 2.381F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(11.5476F, -2.381F, -4.25F));
/*     */     
/* 141 */     PartDefinition cube_r4 = RightWings.m_171599_("cube_r4", CubeListBuilder.m_171558_().m_171514_(28, 23).m_171488_(-3.2667F, -4.6F, 0.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/* 142 */         .m_171514_(11, 37).m_171488_(0.7333F, -3.6F, 0.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/* 143 */         .m_171514_(0, 0).m_171488_(2.7333F, -2.6F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
/* 144 */         .m_171514_(7, 35).m_171488_(-2.2667F, 2.4F, 0.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/* 145 */         .m_171514_(30, 34).m_171488_(-3.2667F, 1.4F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/* 146 */         .m_171514_(4, 0).m_171488_(-5.2667F, -1.6F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
/* 147 */         .m_171514_(0, 7).m_171488_(-3.2667F, -3.6F, 0.0F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F))
/* 148 */         .m_171514_(32, 42).m_171488_(-4.2667F, -3.6F, 0.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F))
/* 149 */         .m_171514_(14, 58).m_171488_(-2.2667F, -3.6F, 0.0F, 2.0F, 6.0F, 0.0F, new CubeDeformation(0.0F))
/* 150 */         .m_171514_(8, 0).m_171488_(-0.2667F, -3.6F, 0.0F, 1.0F, 7.0F, 0.0F, new CubeDeformation(0.0F))
/* 151 */         .m_171514_(64, 16).m_171488_(0.7333F, -2.6F, 0.0F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F))
/* 152 */         .m_171514_(28, 22).m_171488_(-0.2667F, 3.4F, 0.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/* 153 */         .m_171514_(41, 8).m_171488_(2.7333F, -0.6F, 0.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F))
/* 154 */         .m_171514_(6, 0).m_171488_(3.7333F, -0.6F, 0.0F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F))
/* 155 */         .m_171514_(64, 0).m_171488_(1.7333F, -2.6F, 0.0F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-5.2221F, 4.981F, -2.0148F, 0.0F, 0.7854F, 0.0F));
/*     */     
/* 157 */     PartDefinition cube_r5 = RightWings.m_171599_("cube_r5", CubeListBuilder.m_171558_().m_171514_(33, 28).m_171488_(11.0F, -3.0F, 0.75F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-16.5476F, 8.381F, 8.25F, 0.0F, 0.7854F, 0.0F));
/*     */     
/* 159 */     PartDefinition Tail = QueenBee.m_171599_("Tail", CubeListBuilder.m_171558_(), PartPose.m_171419_(0.0F, -22.0F, -1.0F));
/*     */     
/* 161 */     PartDefinition cube_r6 = Tail.m_171599_("cube_r6", CubeListBuilder.m_171558_().m_171514_(78, 60).m_171488_(-2.0F, 0.0F, -4.5F, 5.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
/* 162 */         .m_171514_(0, 0).m_171488_(-4.0F, -2.0F, -17.5F, 9.0F, 9.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-0.5F, -3.0F, 1.0F, 0.3927F, 0.0F, 0.0F));
/*     */     
/* 164 */     PartDefinition cube_r7 = Tail.m_171599_("cube_r7", CubeListBuilder.m_171558_().m_171514_(10, 34).m_171488_(0.0F, -9.0F, -18.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-0.5F, -9.247F, -7.3241F, 1.5708F, 0.0F, 0.0F));
/*     */     
/* 166 */     PartDefinition cube_r8 = Tail.m_171599_("cube_r8", CubeListBuilder.m_171558_().m_171514_(28, 26).m_171488_(0.0F, -5.0F, -19.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-0.5F, -3.0F, 1.0F, 0.7854F, 0.0F, 0.0F));
/*     */     
/* 168 */     PartDefinition RightArm = QueenBee.m_171599_("RightArm", CubeListBuilder.m_171558_().m_171514_(0, 58).m_171488_(1.0F, 2.0F, -2.0F, 3.0F, 14.0F, 4.0F, new CubeDeformation(0.0F))
/* 169 */         .m_171514_(44, 26).m_171488_(3.0F, 16.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
/* 170 */         .m_171514_(41, 25).m_171488_(3.0F, 16.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
/* 171 */         .m_171514_(7, 36).m_171488_(3.0F, 16.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
/* 172 */         .m_171514_(78, 0).m_171488_(1.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
/* 173 */         .m_171514_(68, 40).m_171488_(0.5F, -2.5F, -2.5F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F))
/* 174 */         .m_171514_(45, 71).m_171488_(0.5F, 11.0F, -2.5F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(5.0F, -31.0F, 0.0F));
/*     */     
/* 176 */     PartDefinition LeftArm = QueenBee.m_171599_("LeftArm", CubeListBuilder.m_171558_().m_171514_(46, 51).m_171488_(-4.0F, 2.0F, -2.0F, 3.0F, 14.0F, 4.0F, new CubeDeformation(0.0F))
/* 177 */         .m_171514_(24, 35).m_171488_(-4.0F, 16.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
/* 178 */         .m_171514_(20, 35).m_171488_(-4.0F, 16.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
/* 179 */         .m_171514_(16, 35).m_171488_(-4.0F, 16.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
/* 180 */         .m_171514_(63, 73).m_171488_(-5.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
/* 181 */         .m_171514_(67, 31).m_171488_(-4.5F, -2.5F, -2.5F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F))
/* 182 */         .m_171514_(65, 22).m_171488_(-4.5F, 11.0F, -2.5F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(-5.0F, -31.0F, 0.0F));
/*     */     
/* 184 */     PartDefinition RightLeg = QueenBee.m_171599_("RightLeg", CubeListBuilder.m_171558_(), PartPose.m_171419_(2.0F, -19.0F, 0.0F));
/*     */     
/* 186 */     PartDefinition cube_r9 = RightLeg.m_171599_("cube_r9", CubeListBuilder.m_171558_().m_171514_(61, 3).m_171488_(-2.5F, -3.25F, -0.5F, 6.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
/* 187 */         .m_171514_(66, 11).m_171488_(-2.0F, -6.25F, 0.0F, 5.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, 9.6932F, -2.6685F, -0.829F, 0.0F, 0.0F));
/*     */     
/* 189 */     PartDefinition cube_r10 = RightLeg.m_171599_("cube_r10", CubeListBuilder.m_171558_().m_171514_(60, 60).m_171488_(-2.0F, -6.25F, 0.0F, 5.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, 7.0F, 0.0F, 0.3054F, 0.0F, 0.0F));
/*     */     
/* 191 */     PartDefinition cube_r11 = RightLeg.m_171599_("cube_r11", CubeListBuilder.m_171558_().m_171514_(17, 47).m_171488_(0.0F, 11.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
/* 192 */         .m_171514_(26, 47).m_171488_(1.5F, 11.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
/* 193 */         .m_171514_(47, 25).m_171488_(-1.5F, 11.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
/* 194 */         .m_171514_(10, 73).m_171488_(-1.5F, 6.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, 9.0052F, 4.2588F, -1.1781F, 0.0F, 0.0F));
/*     */     
/* 196 */     PartDefinition LeftLeg = QueenBee.m_171599_("LeftLeg", CubeListBuilder.m_171558_(), PartPose.m_171419_(-2.0F, -19.0F, 0.0F));
/*     */     
/* 198 */     PartDefinition cube_r12 = LeftLeg.m_171599_("cube_r12", CubeListBuilder.m_171558_().m_171514_(44, 8).m_171488_(-3.5F, -3.25F, -0.5F, 6.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
/* 199 */         .m_171514_(32, 65).m_171488_(-3.0F, -6.25F, 0.0F, 5.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, 9.6932F, -2.6685F, -0.829F, 0.0F, 0.0F));
/*     */     
/* 201 */     PartDefinition cube_r13 = LeftLeg.m_171599_("cube_r13", CubeListBuilder.m_171558_().m_171514_(14, 60).m_171488_(-3.0F, -6.25F, 0.0F, 5.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, 7.0F, 0.0F, 0.3054F, 0.0F, 0.0F));
/*     */     
/* 203 */     PartDefinition cube_r14 = LeftLeg.m_171599_("cube_r14", CubeListBuilder.m_171558_().m_171514_(27, 34).m_171488_(-1.0F, 11.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
/* 204 */         .m_171514_(31, 34).m_171488_(-2.5F, 11.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
/* 205 */         .m_171514_(4, 35).m_171488_(0.5F, 11.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
/* 206 */         .m_171514_(72, 51).m_171488_(-2.5F, 6.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, 9.0052F, 4.2588F, -1.1781F, 0.0F, 0.0F));
/*     */     
/* 208 */     return LayerDefinition.m_171565_(meshdefinition, 128, 128);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void m_7695_(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 214 */     this.QueenBee.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */ 
/*     */   
/*     */   public void prepareMobModel(DarkLatexQueenBeeEntity p_102861_, float p_102862_, float p_102863_, float p_102864_) {
/* 219 */     prepareMobModel(this.controller, (LatexEntity)p_102861_, p_102862_, p_102863_, p_102864_);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setupAnim(DarkLatexQueenBeeEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float HeadPitch) {
/* 224 */     this.controller.setupAnim((LatexEntity)entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, HeadPitch);
/*     */   }
/*     */ 
/*     */   
/*     */   public ModelPart getArm(HumanoidArm humanoidArm) {
/* 229 */     switch (humanoidArm) { default: throw new IncompatibleClassChangeError();case LEFT: case RIGHT: break; }  return 
/*     */       
/* 231 */       this.RightArm;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setupHand() {
/* 237 */     this.controller.setupHand();
/*     */   }
/*     */ 
/*     */   
/*     */   public LatexHumanoidModelController getController() {
/* 242 */     return this.controller;
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6002_(HumanoidArm p_102108_, PoseStack p_102109_) {
/* 247 */     getArm(p_102108_).m_104299_(p_102109_);
/*     */   }
/*     */ 
/*     */   
/*     */   public ModelPart m_5585_() {
/* 252 */     return this.Head;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\client\model\ModelDark_latex_queen_bee.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */