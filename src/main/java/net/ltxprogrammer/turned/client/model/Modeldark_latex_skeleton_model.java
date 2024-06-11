/*     */ package net.ltxprogrammer.turned.client.model;
/*     */ 
/*     */ import com.mojang.blaze3d.vertex.PoseStack;
/*     */ import com.mojang.blaze3d.vertex.VertexConsumer;
/*     */ import net.ltxprogrammer.changed.client.renderer.model.LatexHumanoidModel;
/*     */ import net.ltxprogrammer.changed.client.renderer.model.LatexHumanoidModelController;
/*     */ import net.ltxprogrammer.changed.client.renderer.model.LatexHumanoidModelInterface;
/*     */ import net.ltxprogrammer.changed.entity.LatexEntity;
/*     */ import net.ltxprogrammer.turned.entity.DarkLatexSkeletonEntity;
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
/*     */ public class Modeldark_latex_skeleton_model
/*     */   extends LatexHumanoidModel<DarkLatexSkeletonEntity>
/*     */   implements LatexHumanoidModelInterface
/*     */ {
/*  27 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("turned", "modeldark_latex_skeleton_model"), "main");
/*     */   
/*     */   public final ModelPart head;
/*     */   public final ModelPart body;
/*     */   public final ModelPart rightArm;
/*     */   public final ModelPart leftArm;
/*     */   public final ModelPart leftLeg;
/*     */   public final ModelPart rightLeg;
/*     */   public final LatexHumanoidModelController controller;
/*     */   
/*     */   public Modeldark_latex_skeleton_model(ModelPart root) {
/*  38 */     super(root);
/*  39 */     this.head = root.m_171324_("head");
/*  40 */     this.body = root.m_171324_("body");
/*  41 */     this.rightArm = root.m_171324_("rightArm");
/*  42 */     this.leftArm = root.m_171324_("leftArm");
/*  43 */     this.leftLeg = root.m_171324_("leftLeg");
/*  44 */     this.rightLeg = root.m_171324_("rightLeg");
/*  45 */     this.controller = LatexHumanoidModelController.Builder.of((EntityModel)this, this.head, this.body, this.body.m_171324_("Tail"), this.rightArm, this.leftArm, this.rightLeg, this.leftLeg).hipOffset(-1.0F).build();
/*     */   }
/*     */   
/*     */   public static LayerDefinition createBodyLayer() {
/*  49 */     MeshDefinition meshdefinition = new MeshDefinition();
/*  50 */     PartDefinition partdefinition = meshdefinition.m_171576_();
/*     */     
/*  52 */     PartDefinition head = partdefinition.m_171599_("head", CubeListBuilder.m_171558_().m_171514_(0, 0).m_171488_(-4.0F, -7.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
/*  53 */         .m_171514_(20, 16).m_171488_(4.0F, -2.0F, -4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
/*  54 */         .m_171514_(0, 16).m_171488_(-5.0F, -2.0F, -4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
/*  55 */         .m_171514_(24, 2).m_171488_(-6.0F, -1.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
/*  56 */         .m_171514_(24, 0).m_171488_(5.0F, -1.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(0.0F, -1.0F, 0.0F));
/*     */     
/*  58 */     PartDefinition Head_r1 = head.m_171599_("Head_r1", CubeListBuilder.m_171558_().m_171514_(0, 0).m_171488_(0.5F, -1.75F, -1.625F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
/*  59 */         .m_171514_(20, 64).m_171488_(-0.5F, -0.75F, -1.625F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(3.5F, -8.0F, 0.5F, 0.0F, 1.5708F, 0.3927F));
/*     */     
/*  61 */     PartDefinition Head_r2 = head.m_171599_("Head_r2", CubeListBuilder.m_171558_().m_171514_(64, 23).m_171488_(-0.5F, -0.75F, -1.625F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
/*  62 */         .m_171514_(64, 0).m_171488_(-1.5F, -1.75F, -1.625F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-3.5F, -8.0F, 0.5F, 0.0F, -1.5708F, -0.3927F));
/*     */     
/*  64 */     PartDefinition mask = head.m_171599_("mask", CubeListBuilder.m_171558_().m_171514_(23, 16).m_171488_(-1.0F, -8.0F, -5.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  65 */         .m_171514_(24, 7).m_171488_(-4.0F, -3.0F, -5.0F, 8.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  66 */         .m_171514_(28, 23).m_171488_(-3.0F, -2.0F, -5.0F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  67 */         .m_171514_(28, 24).m_171488_(-2.5F, -1.0F, -5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  68 */         .m_171514_(22, 28).m_171488_(1.5F, -1.0F, -5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  69 */         .m_171514_(24, 6).m_171488_(-4.0F, -6.0F, -5.0F, 8.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  70 */         .m_171514_(0, 7).m_171488_(-2.0F, -7.0F, -5.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  71 */         .m_171514_(22, 31).m_171488_(-0.5F, -4.0F, -5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  72 */         .m_171514_(20, 19).m_171488_(2.375F, -4.0F, -5.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  73 */         .m_171514_(0, 19).m_171488_(-4.375F, -4.0F, -5.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  74 */         .m_171514_(20, 31).m_171488_(-3.375F, -5.0F, -5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  75 */         .m_171514_(30, 24).m_171488_(2.375F, -5.0F, -5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  76 */         .m_171514_(16, 28).m_171488_(-1.5F, -5.0F, -5.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(0.0F, 1.0F, 0.75F));
/*     */     
/*  78 */     PartDefinition body = partdefinition.m_171599_("body", CubeListBuilder.m_171558_().m_171514_(0, 16).m_171488_(-4.0F, 1.0F, -2.0F, 8.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
/*  79 */         .m_171514_(55, 59).m_171488_(-4.125F, 4.0F, -2.125F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
/*  80 */         .m_171514_(60, 41).m_171488_(-3.375F, 5.5F, -2.125F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
/*  81 */         .m_171514_(60, 18).m_171488_(1.125F, 5.75F, -2.125F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
/*  82 */         .m_171514_(30, 55).m_171488_(2.125F, 7.375F, -2.125F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
/*  83 */         .m_171514_(60, 46).m_171488_(-3.375F, 7.375F, -2.125F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
/*  84 */         .m_171514_(52, 27).m_171488_(-4.125F, 2.0F, -2.125F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
/*  85 */         .m_171514_(56, 13).m_171488_(1.125F, 4.0F, -2.125F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
/*  86 */         .m_171514_(42, 50).m_171488_(0.125F, 2.0F, -2.125F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
/*  87 */         .m_171514_(64, 7).m_171488_(-3.25F, 2.0F, 0.125F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
/*  88 */         .m_171514_(25, 64).m_171488_(-3.25F, 4.0F, 0.125F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
/*  89 */         .m_171514_(0, 43).m_171488_(0.75F, 2.0F, 0.125F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
/*  90 */         .m_171514_(16, 57).m_171488_(0.75F, 4.0F, 0.125F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
/*  91 */         .m_171514_(24, 39).m_171488_(-2.25F, 5.75F, 0.125F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
/*  92 */         .m_171514_(44, 0).m_171488_(0.75F, 5.75F, 0.125F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
/*  93 */         .m_171514_(32, 8).m_171488_(0.75F, 7.375F, 0.125F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
/*  94 */         .m_171514_(12, 33).m_171488_(-2.25F, 7.375F, 0.125F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
/*  95 */         .m_171514_(0, 25).m_171488_(-3.0F, 6.0F, -2.0F, 6.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
/*  96 */         .m_171514_(24, 0).m_171488_(-4.0F, 10.0F, -2.0F, 8.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
/*  97 */         .m_171514_(35, 62).m_171488_(-0.25F, 1.0F, 1.125F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(0.0F, -1.0F, 0.0F));
/*     */     
/*  99 */     PartDefinition Tail = body.m_171599_("Tail", CubeListBuilder.m_171558_(), PartPose.m_171419_(0.0F, 12.0F, 0.0F));
/*     */     
/* 101 */     PartDefinition Tail_r1 = Tail.m_171599_("Tail_r1", CubeListBuilder.m_171558_().m_171514_(0, 63).m_171488_(-0.25F, -16.4875F, 12.7823F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
/* 102 */         .m_171514_(0, 56).m_171488_(-0.25F, -16.6125F, 6.7823F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
/* 103 */         .m_171514_(56, 6).m_171488_(-0.25F, -16.7375F, 0.7823F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
/* 104 */         .m_171514_(51, 59).m_171488_(-0.75F, -16.2375F, 14.7823F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
/* 105 */         .m_171514_(16, 17).m_171488_(-0.75F, -16.3625F, 6.7823F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.0F))
/* 106 */         .m_171514_(14, 49).m_171488_(-0.75F, -16.6125F, 1.7823F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, 13.0F, -8.0F, -0.5672F, 0.0F, 0.0F));
/*     */     
/* 108 */     PartDefinition rightArm = partdefinition.m_171599_("leftArm", CubeListBuilder.m_171558_(), PartPose.m_171419_(5.0F, 0.0F, 0.0F));
/*     */     
/* 110 */     PartDefinition RightArm_r1 = rightArm.m_171599_("RightArm_r1", CubeListBuilder.m_171558_().m_171514_(23, 55).m_171488_(1.625F, -2.625F, -2.5F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F))
/* 111 */         .m_171514_(32, 35).m_171488_(-1.5F, -2.5F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.5F, 2.5F, 0.0F, 0.0F, 0.0F, -0.3927F));
/*     */     
/* 113 */     PartDefinition bone2 = rightArm.m_171599_("bone2", CubeListBuilder.m_171558_().m_171514_(20, 28).m_171488_(-3.2F, -7.081F, -1.666F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F))
/* 114 */         .m_171514_(35, 55).m_171488_(-0.95F, -2.081F, -2.041F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
/* 115 */         .m_171514_(60, 51).m_171488_(-0.95F, -3.331F, -1.166F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
/* 116 */         .m_171514_(38, 8).m_171488_(-0.95F, -4.456F, -0.166F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
/* 117 */         .m_171514_(8, 59).m_171488_(-1.075F, -0.081F, -1.666F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
/* 118 */         .m_171514_(32, 28).m_171488_(-0.075F, 1.919F, -1.666F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
/* 119 */         .m_171514_(56, 41).m_171488_(-1.075F, -0.081F, -0.166F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
/* 120 */         .m_171514_(32, 30).m_171488_(-0.075F, 1.919F, -0.166F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
/* 121 */         .m_171514_(0, 59).m_171488_(-1.075F, -0.081F, 1.334F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
/* 122 */         .m_171514_(0, 33).m_171488_(-0.075F, 1.919F, 1.334F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(3.7F, 10.9375F, -2.8625F, -0.3927F, 0.0F, 0.0F));
/*     */     
/* 124 */     PartDefinition leftArm = partdefinition.m_171599_("rightArm", CubeListBuilder.m_171558_(), PartPose.m_171419_(-5.0F, 0.0F, 0.0F));
/*     */     
/* 126 */     PartDefinition RightArm_r2 = leftArm.m_171599_("RightArm_r2", CubeListBuilder.m_171558_().m_171514_(53, 50).m_171488_(-2.625F, -2.625F, -2.5F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F))
/* 127 */         .m_171514_(0, 33).m_171488_(-2.5F, -2.5F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-0.5F, 2.5F, 0.0F, 0.0F, 0.0F, 0.3927F));
/*     */     
/* 129 */     PartDefinition bone8 = leftArm.m_171599_("bone8", CubeListBuilder.m_171558_().m_171514_(28, 12).m_171488_(-0.8F, -7.081F, -1.666F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F))
/* 130 */         .m_171514_(55, 34).m_171488_(-1.05F, -2.081F, -2.041F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
/* 131 */         .m_171514_(52, 6).m_171488_(-1.05F, -3.331F, -1.166F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
/* 132 */         .m_171514_(36, 33).m_171488_(-1.05F, -4.456F, -0.166F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
/* 133 */         .m_171514_(8, 56).m_171488_(-0.925F, -0.081F, -1.666F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
/* 134 */         .m_171514_(20, 29).m_171488_(-0.925F, 1.919F, -1.666F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
/* 135 */         .m_171514_(0, 56).m_171488_(-0.925F, -0.081F, -0.166F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
/* 136 */         .m_171514_(0, 27).m_171488_(-0.925F, 1.919F, -0.166F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
/* 137 */         .m_171514_(44, 55).m_171488_(-0.925F, -0.081F, 1.334F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
/* 138 */         .m_171514_(0, 25).m_171488_(-0.925F, 1.919F, 1.334F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-3.7F, 10.9375F, -2.8625F, -0.3927F, 0.0F, 0.0F));
/*     */     
/* 140 */     PartDefinition leftLeg = partdefinition.m_171599_("rightLeg", CubeListBuilder.m_171558_().m_171514_(48, 21).m_171488_(-2.0F, 0.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
/* 141 */         .m_171514_(48, 0).m_171488_(-2.0F, 11.213F, -2.1649F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
/* 142 */         .m_171514_(0, 2).m_171488_(-1.875F, 12.213F, -2.2899F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/* 143 */         .m_171514_(0, 1).m_171488_(-0.5F, 12.213F, -2.2899F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/* 144 */         .m_171514_(0, 0).m_171488_(0.875F, 12.213F, -2.2899F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(-2.0F, 11.0F, 0.0F));
/*     */     
/* 146 */     PartDefinition bone = leftLeg.m_171599_("bone", CubeListBuilder.m_171558_().m_171514_(44, 41).m_171488_(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
/* 147 */         .m_171514_(45, 58).m_171488_(-2.25F, -0.125F, -2.5F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, 1.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/*     */     
/* 149 */     PartDefinition bone3 = leftLeg.m_171599_("bone3", CubeListBuilder.m_171558_().m_171514_(12, 39).m_171488_(-6.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(4.0F, 4.0F, -1.0F, 0.6545F, 0.0F, 0.0F));
/*     */     
/* 151 */     PartDefinition bone4 = leftLeg.m_171599_("bone4", CubeListBuilder.m_171558_().m_171514_(0, 46).m_171488_(-2.0F, -0.1371F, 3.7689F, 4.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, 4.0F, -1.0F, -0.48F, 0.0F, 0.0F));
/*     */     
/* 153 */     PartDefinition rightLeg = partdefinition.m_171599_("leftLeg", CubeListBuilder.m_171558_().m_171514_(44, 33).m_171488_(-2.0F, 0.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
/* 154 */         .m_171514_(44, 15).m_171488_(-2.0F, 11.213F, -2.1649F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
/* 155 */         .m_171514_(5, 2).m_171488_(0.875F, 12.213F, -2.2899F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/* 156 */         .m_171514_(5, 1).m_171488_(-1.875F, 12.213F, -2.2899F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/* 157 */         .m_171514_(5, 0).m_171488_(-0.5F, 12.213F, -2.2899F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(2.0F, 11.0F, 0.0F));
/*     */     
/* 159 */     PartDefinition bone5 = rightLeg.m_171599_("bone5", CubeListBuilder.m_171558_().m_171514_(40, 6).m_171488_(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
/* 160 */         .m_171514_(10, 59).m_171488_(1.25F, -0.125F, -2.5F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, 1.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/*     */     
/* 162 */     PartDefinition bone6 = rightLeg.m_171599_("bone6", CubeListBuilder.m_171558_().m_171514_(36, 23).m_171488_(2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-4.0F, 4.0F, -1.0F, 0.6545F, 0.0F, 0.0F));
/*     */     
/* 164 */     PartDefinition bone7 = rightLeg.m_171599_("bone7", CubeListBuilder.m_171558_().m_171514_(28, 45).m_171488_(-2.0F, -0.1371F, 3.7689F, 4.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, 4.0F, -1.0F, -0.48F, 0.0F, 0.0F));
/*     */     
/* 166 */     return LayerDefinition.m_171565_(meshdefinition, 128, 128);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void m_7695_(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 172 */     this.head.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 173 */     this.body.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 174 */     this.rightArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 175 */     this.leftArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 176 */     this.leftLeg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 177 */     this.rightLeg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */ 
/*     */   
/*     */   public void prepareMobModel(DarkLatexSkeletonEntity p_102861_, float p_102862_, float p_102863_, float p_102864_) {
/* 182 */     prepareMobModel(this.controller, (LatexEntity)p_102861_, p_102862_, p_102863_, p_102864_);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setupAnim(DarkLatexSkeletonEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float HeadPitch) {
/* 187 */     this.controller.setupAnim((LatexEntity)entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, HeadPitch);
/*     */   }
/*     */ 
/*     */   
/*     */   public ModelPart getArm(HumanoidArm humanoidArm) {
/* 192 */     switch (humanoidArm) { default: throw new IncompatibleClassChangeError();case LEFT: case RIGHT: break; }  return 
/*     */       
/* 194 */       this.rightArm;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setupHand() {
/* 200 */     this.controller.setupHand();
/*     */   }
/*     */ 
/*     */   
/*     */   public LatexHumanoidModelController getController() {
/* 205 */     return this.controller;
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6002_(HumanoidArm p_102108_, PoseStack p_102109_) {
/* 210 */     getArm(p_102108_).m_104299_(p_102109_);
/*     */   }
/*     */ 
/*     */   
/*     */   public ModelPart m_5585_() {
/* 215 */     return this.head;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\client\model\Modeldark_latex_skeleton_model.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */