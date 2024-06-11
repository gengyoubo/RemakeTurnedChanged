/*     */ package net.ltxprogrammer.turned.client.model;
/*     */ import com.mojang.blaze3d.vertex.PoseStack;
/*     */ import com.mojang.blaze3d.vertex.VertexConsumer;
/*     */ import net.ltxprogrammer.changed.client.renderer.model.LatexHumanoidModelController;
/*     */ import net.ltxprogrammer.turned.entity.DlSquidDogEntity;
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
/*     */ public class ModelDark_latex_squid_dog extends LatexHumanoidModel<DlSquidDogEntity> implements LatexHumanoidModelInterface {
/*  17 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("turned", "model_dark_latex_squid_dog"), "main");
/*     */   public final ModelPart Head;
/*     */   public final ModelPart Torso;
/*     */   public final ModelPart LeftArm;
/*     */   public final ModelPart RightArm;
/*     */   public final ModelPart LeftArm2;
/*     */   public final ModelPart RightArm2;
/*     */   public final ModelPart LeftLeg;
/*     */   public final ModelPart Rightleg;
/*     */   public final LatexHumanoidModelController controller;
/*     */   
/*     */   public ModelDark_latex_squid_dog(ModelPart root) {
/*  29 */     super(root);
/*  30 */     this.Head = root.m_171324_("head");
/*  31 */     this.Torso = root.m_171324_("body");
/*  32 */     this.LeftArm = root.m_171324_("rightArm");
/*  33 */     this.RightArm = root.m_171324_("leftArm");
/*  34 */     this.LeftArm2 = root.m_171324_("rightArm2");
/*  35 */     this.RightArm2 = root.m_171324_("leftArm2");
/*  36 */     this.LeftLeg = root.m_171324_("rightLeg");
/*  37 */     this.Rightleg = root.m_171324_("leftLeg");
/*  38 */     this.controller = LatexHumanoidModelController.Builder.of((EntityModel)this, this.Head, this.Torso, this.Torso.m_171324_("Tail"), this.RightArm, this.LeftArm, this.Rightleg, this.LeftLeg).arms2(this.RightArm2, this.LeftArm2).hipOffset(-5.0F).build();
/*     */   }
/*     */ 
/*     */   
/*     */   public static LayerDefinition createBodyLayer() {
/*  43 */     MeshDefinition meshdefinition = new MeshDefinition();
/*  44 */     PartDefinition partdefinition = meshdefinition.m_171576_();
/*     */     
/*  46 */     PartDefinition head = partdefinition.m_171599_("head", CubeListBuilder.m_171558_().m_171514_(0, 19).m_171488_(-4.0F, -7.375F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
/*  47 */         .m_171514_(24, 19).m_171488_(-5.0F, -3.375F, -4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
/*  48 */         .m_171514_(35, 12).m_171488_(-5.75F, -3.25F, -3.75F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
/*  49 */         .m_171514_(27, 12).m_171488_(3.75F, -3.25F, -3.75F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
/*  50 */         .m_171514_(22, 0).m_171488_(-4.625F, -2.75F, -3.875F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
/*  51 */         .m_171514_(0, 0).m_171488_(4.0F, -3.375F, -4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
/*  52 */         .m_171514_(11, 0).m_171488_(3.625F, -2.75F, -3.875F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(0.0F, -5.0F, 0.0F));
/*     */     
/*  54 */     PartDefinition Head_r1 = head.m_171599_("Head_r1", CubeListBuilder.m_171558_().m_171514_(0, 19).m_171488_(0.5F, -1.75F, -1.625F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
/*  55 */         .m_171514_(14, 35).m_171488_(-0.5F, -0.75F, -1.625F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(3.5F, -8.375F, 0.5F, 0.0F, 1.5708F, 0.3927F));
/*     */     
/*  57 */     PartDefinition Head_r2 = head.m_171599_("Head_r2", CubeListBuilder.m_171558_().m_171514_(38, 27).m_171488_(-0.5F, -0.75F, -1.625F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
/*  58 */         .m_171514_(0, 35).m_171488_(-1.5F, -1.75F, -1.625F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-3.5F, -8.375F, 0.5F, 0.0F, -1.5708F, -0.3927F));
/*     */     
/*  60 */     PartDefinition mask = head.m_171599_("mask", CubeListBuilder.m_171558_().m_171514_(29, 8).m_171488_(-1.0F, -11.375F, -5.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  61 */         .m_171514_(0, 13).m_171488_(-4.0F, -6.375F, -5.0F, 8.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  62 */         .m_171514_(0, 14).m_171488_(-3.0F, -5.375F, -5.0F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  63 */         .m_171514_(3, 3).m_171488_(-2.5F, -4.375F, -5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  64 */         .m_171514_(3, 0).m_171488_(1.5F, -4.375F, -5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  65 */         .m_171514_(0, 15).m_171488_(-3.0F, -9.375F, -5.0F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  66 */         .m_171514_(0, 26).m_171488_(-2.0F, -10.375F, -5.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  67 */         .m_171514_(0, 19).m_171488_(-0.5F, -7.375F, -5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  68 */         .m_171514_(24, 22).m_171488_(2.375F, -7.375F, -5.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  69 */         .m_171514_(22, 3).m_171488_(-4.375F, -7.375F, -5.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  70 */         .m_171514_(14, 3).m_171488_(-3.375F, -8.375F, -5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  71 */         .m_171514_(14, 0).m_171488_(2.375F, -8.375F, -5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  72 */         .m_171514_(27, 14).m_171488_(-1.5F, -8.375F, -5.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(0.0F, 4.0F, 0.75F));
/*     */     
/*  74 */     PartDefinition body = partdefinition.m_171599_("body", CubeListBuilder.m_171558_().m_171514_(24, 19).m_171488_(-4.5F, 0.625F, -2.0F, 9.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
/*  75 */         .m_171514_(28, 38).m_171488_(-1.375F, -1.375F, -1.375F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
/*  76 */         .m_171514_(30, 47).m_171488_(1.0F, -1.0F, -3.0F, 4.0F, 4.0F, 6.0F, new CubeDeformation(0.0F))
/*  77 */         .m_171514_(0, 46).m_171488_(-5.0F, -1.0F, -3.0F, 4.0F, 4.0F, 6.0F, new CubeDeformation(0.0F))
/*  78 */         .m_171514_(38, 12).m_171488_(-4.5F, 10.625F, -2.0F, 9.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
/*  79 */         .m_171514_(36, 41).m_171488_(-4.0F, 4.625F, -2.0F, 8.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
/*  80 */         .m_171514_(53, 0).m_171488_(-2.5F, 12.625F, -2.0F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
/*  81 */         .m_171514_(50, 18).m_171488_(-3.5F, 6.625F, -2.0F, 7.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(0.0F, -5.0F, 0.0F));
/*     */     
/*  83 */     PartDefinition Tentapaws = body.m_171599_("Tentapaws", CubeListBuilder.m_171558_(), PartPose.m_171419_(0.0F, 25.0F, 0.0F));
/*     */     
/*  85 */     PartDefinition Tentapaw1 = Tentapaws.m_171599_("Tentapaw1", CubeListBuilder.m_171558_(), PartPose.m_171419_(1.3642F, -22.6544F, 2.3598F));
/*     */     
/*  87 */     PartDefinition Body_r1 = Tentapaw1.m_171599_("Body_r1", CubeListBuilder.m_171558_().m_171514_(61, 47).m_171488_(0.8003F, -4.0208F, 19.792F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
/*  88 */         .m_171514_(42, 57).m_171488_(0.8003F, -3.0208F, 24.167F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
/*  89 */         .m_171514_(5, 57).m_171488_(0.8003F, -1.6458F, 24.167F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
/*  90 */         .m_171514_(0, 56).m_171488_(0.8003F, -0.0208F, 24.167F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
/*  91 */         .m_171514_(26, 49).m_171488_(0.8003F, 1.3542F, 24.167F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
/*  92 */         .m_171514_(44, 47).m_171488_(0.8003F, 2.3542F, 19.792F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
/*  93 */         .m_171514_(51, 90).m_171488_(0.8003F, -2.3958F, 19.792F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(10.7875F, 5.4329F, 5.2181F, -2.2119F, 0.7864F, 2.9331F));
/*     */     
/*  95 */     PartDefinition Body_r2 = Tentapaw1.m_171599_("Body_r2", CubeListBuilder.m_171558_().m_171514_(57, 84).m_171488_(-2.347F, -1.375F, -4.6602F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(11.0F, -3.0F, 4.0F, -2.9234F, 1.5272F, 3.1416F));
/*     */     
/*  97 */     PartDefinition Body_r3 = Tentapaw1.m_171599_("Body_r3", CubeListBuilder.m_171558_().m_171514_(91, 57).m_171488_(-1.0849F, -0.25F, 16.4149F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
/*  98 */         .m_171514_(31, 57).m_171488_(-1.0849F, -1.25F, 11.4149F, 3.0F, 8.0F, 5.0F, new CubeDeformation(0.0F))
/*  99 */         .m_171514_(11, 84).m_171488_(-1.3349F, 1.375F, 6.6649F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(11.0F, -3.0F, 4.0F, -2.2119F, 0.7864F, 2.9331F));
/*     */     
/* 101 */     PartDefinition Body_r4 = Tentapaw1.m_171599_("Body_r4", CubeListBuilder.m_171558_().m_171514_(38, 30).m_171488_(-1.3349F, -1.625F, -0.3351F, 3.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(11.0F, -3.0F, 4.0F, -2.6483F, 0.7864F, 2.9331F));
/*     */     
/* 103 */     PartDefinition Body_r5 = Tentapaw1.m_171599_("Body_r5", CubeListBuilder.m_171558_().m_171514_(68, 87).m_171488_(-2.875F, -0.75F, 1.0F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(1.9067F, -1.5622F, 1.8475F, 0.491F, 1.1418F, 0.3592F));
/*     */     
/* 105 */     PartDefinition Body_r6 = Tentapaw1.m_171599_("Body_r6", CubeListBuilder.m_171558_().m_171514_(84, 87).m_171488_(-2.5F, -0.5F, 0.0F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(1.1358F, -0.8456F, -1.3598F, 0.2182F, 0.4363F, 0.0F));
/*     */     
/* 107 */     PartDefinition Tentapaw2 = Tentapaws.m_171599_("Tentapaw2", CubeListBuilder.m_171558_(), PartPose.m_171423_(2.3642F, -18.6544F, 2.3598F, 0.0F, 0.0F, 0.6109F));
/*     */     
/* 109 */     PartDefinition Body_r7 = Tentapaw2.m_171599_("Body_r7", CubeListBuilder.m_171558_().m_171514_(41, 82).m_171488_(-2.347F, -1.375F, -4.6602F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(9.9122F, -3.2783F, 4.0F, -2.9234F, 1.5272F, 3.1416F));
/*     */     
/* 111 */     PartDefinition Body_r8 = Tentapaw2.m_171599_("Body_r8", CubeListBuilder.m_171558_().m_171514_(91, 35).m_171488_(-0.4081F, 1.8708F, 15.506F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
/* 112 */         .m_171514_(86, 74).m_171488_(1.8003F, 1.2292F, 10.917F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
/* 113 */         .m_171514_(84, 0).m_171488_(1.8003F, 2.2292F, 15.292F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
/* 114 */         .m_171514_(36, 81).m_171488_(1.8003F, 3.6042F, 15.292F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
/* 115 */         .m_171514_(52, 82).m_171488_(1.8003F, 5.2292F, 15.292F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
/* 116 */         .m_171514_(86, 12).m_171488_(1.8003F, 6.6042F, 15.292F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
/* 117 */         .m_171514_(79, 87).m_171488_(1.8003F, 7.6042F, 10.917F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
/* 118 */         .m_171514_(92, 45).m_171488_(1.8003F, 2.8542F, 10.917F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
/* 119 */         .m_171514_(15, 52).m_171488_(-0.4081F, 0.8708F, 10.506F, 3.0F, 8.0F, 5.0F, new CubeDeformation(0.0F))
/* 120 */         .m_171514_(83, 4).m_171488_(-0.6581F, 3.4958F, 5.756F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(9.6998F, -4.8455F, 5.2181F, -2.1217F, 0.9972F, -2.8432F));
/*     */     
/* 122 */     PartDefinition Body_r9 = Tentapaw2.m_171599_("Body_r9", CubeListBuilder.m_171558_().m_171514_(14, 38).m_171488_(-0.6581F, 0.6812F, -0.2626F, 3.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(9.6998F, -4.8455F, 5.2181F, -2.5581F, 0.9972F, -2.8432F));
/*     */     
/* 124 */     PartDefinition Body_r10 = Tentapaw2.m_171599_("Body_r10", CubeListBuilder.m_171558_().m_171514_(83, 27).m_171488_(-2.875F, -0.75F, 1.0F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.8189F, -1.8405F, 1.8475F, 0.491F, 1.1418F, 0.3592F));
/*     */     
/* 126 */     PartDefinition Body_r11 = Tentapaw2.m_171599_("Body_r11", CubeListBuilder.m_171558_().m_171514_(83, 66).m_171488_(-2.5F, -0.5F, 0.0F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0481F, -1.1239F, -1.3598F, 0.2182F, 0.4363F, 0.0F));
/*     */     
/* 128 */     PartDefinition Tentapaw3 = Tentapaws.m_171599_("Tentapaw3", CubeListBuilder.m_171558_(), PartPose.m_171419_(-2.6358F, -22.6544F, 3.3598F));
/*     */     
/* 130 */     PartDefinition Body_r12 = Tentapaw3.m_171599_("Body_r12", CubeListBuilder.m_171558_().m_171514_(47, 26).m_171488_(-1.8003F, -1.6458F, 24.167F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
/* 131 */         .m_171514_(46, 18).m_171488_(-1.8003F, -0.0208F, 24.167F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
/* 132 */         .m_171514_(39, 4).m_171488_(-1.8003F, 1.3542F, 24.167F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
/* 133 */         .m_171514_(39, 0).m_171488_(-1.8003F, -4.0208F, 19.792F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
/* 134 */         .m_171514_(30, 12).m_171488_(-1.8003F, -3.0208F, 24.167F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
/* 135 */         .m_171514_(22, 0).m_171488_(-1.8003F, -2.3958F, 19.792F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
/* 136 */         .m_171514_(22, 12).m_171488_(-1.8003F, 2.3542F, 19.792F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-9.5159F, 5.4329F, 4.2181F, -2.2119F, -0.7864F, -2.9331F));
/*     */     
/* 138 */     PartDefinition Body_r13 = Tentapaw3.m_171599_("Body_r13", CubeListBuilder.m_171558_().m_171514_(0, 81).m_171488_(-0.653F, -1.375F, -4.6602F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-9.7284F, -3.0F, 3.0F, -2.9234F, -1.5272F, -3.1416F));
/*     */     
/* 140 */     PartDefinition Body_r14 = Tentapaw3.m_171599_("Body_r14", CubeListBuilder.m_171558_().m_171514_(39, 90).m_171488_(-1.9151F, -0.25F, 16.4149F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
/* 141 */         .m_171514_(50, 47).m_171488_(-1.9151F, -1.25F, 11.4149F, 3.0F, 8.0F, 5.0F, new CubeDeformation(0.0F))
/* 142 */         .m_171514_(25, 81).m_171488_(-1.6651F, 1.375F, 6.6649F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-9.7284F, -3.0F, 3.0F, -2.2119F, -0.7864F, -2.9331F));
/*     */     
/* 144 */     PartDefinition Body_r15 = Tentapaw3.m_171599_("Body_r15", CubeListBuilder.m_171558_().m_171514_(0, 35).m_171488_(-1.6651F, -1.625F, -0.3351F, 3.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-9.7284F, -3.0F, 3.0F, -2.6483F, -0.7864F, -2.9331F));
/*     */     
/* 146 */     PartDefinition Body_r16 = Tentapaw3.m_171599_("Body_r16", CubeListBuilder.m_171558_().m_171514_(81, 79).m_171488_(-0.125F, -0.75F, 1.0F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-0.635F, -1.5622F, 0.8475F, 0.491F, -1.1418F, -0.3592F));
/*     */     
/* 148 */     PartDefinition Body_r17 = Tentapaw3.m_171599_("Body_r17", CubeListBuilder.m_171558_().m_171514_(82, 19).m_171488_(-0.5F, -0.5F, 0.0F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.1358F, -0.8456F, -2.3598F, 0.2182F, -0.4363F, 0.0F));
/*     */     
/* 150 */     PartDefinition Tentapaw4 = Tentapaws.m_171599_("Tentapaw4", CubeListBuilder.m_171558_(), PartPose.m_171423_(-2.3642F, -18.6544F, 2.3598F, 0.0F, 0.0F, -0.6109F));
/*     */     
/* 152 */     PartDefinition Body_r18 = Tentapaw4.m_171599_("Body_r18", CubeListBuilder.m_171558_().m_171514_(12, 92).m_171488_(-2.8003F, 2.8542F, 10.917F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
/* 153 */         .m_171514_(67, 0).m_171488_(-2.8003F, 7.6042F, 10.917F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
/* 154 */         .m_171514_(68, 33).m_171488_(-2.8003F, 6.6042F, 15.292F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
/* 155 */         .m_171514_(74, 54).m_171488_(-2.8003F, 5.2292F, 15.292F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
/* 156 */         .m_171514_(76, 41).m_171488_(-2.8003F, 3.6042F, 15.292F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
/* 157 */         .m_171514_(78, 19).m_171488_(-2.8003F, 2.2292F, 15.292F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
/* 158 */         .m_171514_(79, 66).m_171488_(-2.8003F, 1.2292F, 10.917F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
/* 159 */         .m_171514_(0, 89).m_171488_(-2.5919F, 1.8708F, 15.506F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
/* 160 */         .m_171514_(0, 0).m_171488_(-2.5919F, 0.8708F, 10.506F, 3.0F, 8.0F, 5.0F, new CubeDeformation(0.0F))
/* 161 */         .m_171514_(75, 58).m_171488_(-2.3419F, 3.4958F, 5.756F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-9.6998F, -4.8455F, 5.2181F, -2.1217F, -0.9972F, 2.8432F));
/*     */     
/* 163 */     PartDefinition Body_r19 = Tentapaw4.m_171599_("Body_r19", CubeListBuilder.m_171558_().m_171514_(72, 33).m_171488_(-0.653F, -1.375F, -4.6602F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-9.9122F, -3.2783F, 4.0F, -2.9234F, -1.5272F, -3.1416F));
/*     */     
/* 165 */     PartDefinition Body_r20 = Tentapaw4.m_171599_("Body_r20", CubeListBuilder.m_171558_().m_171514_(24, 27).m_171488_(-2.3419F, 0.6812F, -0.2626F, 3.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-9.6998F, -4.8455F, 5.2181F, -2.5581F, -0.9972F, 2.8432F));
/*     */     
/* 167 */     PartDefinition Body_r21 = Tentapaw4.m_171599_("Body_r21", CubeListBuilder.m_171558_().m_171514_(79, 49).m_171488_(-0.125F, -0.75F, 1.0F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-0.8189F, -1.8405F, 1.8475F, 0.491F, -1.1418F, -0.3592F));
/*     */     
/* 169 */     PartDefinition Body_r22 = Tentapaw4.m_171599_("Body_r22", CubeListBuilder.m_171558_().m_171514_(80, 41).m_171488_(-0.5F, -0.5F, 0.0F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-0.0481F, -1.1239F, -1.3598F, 0.2182F, -0.4363F, 0.0F));
/*     */     
/* 171 */     PartDefinition Tail = body.m_171599_("Tail", CubeListBuilder.m_171558_(), PartPose.m_171419_(0.0F, 12.0F, 0.0F));
/*     */     
/* 173 */     PartDefinition Tail_r1 = Tail.m_171599_("Tail_r1", CubeListBuilder.m_171558_().m_171514_(39, 0).m_171488_(-1.25F, -19.459F, -1.031F, 3.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
/* 174 */         .m_171514_(22, 0).m_171488_(-1.25F, -15.459F, 3.969F, 3.0F, 1.0F, 11.0F, new CubeDeformation(0.0F))
/* 175 */         .m_171514_(22, 8).m_171488_(-1.25F, -18.459F, 15.969F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
/* 176 */         .m_171514_(0, 0).m_171488_(-1.25F, -18.459F, -0.031F, 3.0F, 3.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, 14.2802F, -8.3882F, -0.5672F, 0.0F, 0.0F));
/*     */     
/* 178 */     PartDefinition rightArm2 = partdefinition.m_171599_("rightArm2", CubeListBuilder.m_171558_(), PartPose.m_171419_(4.0F, -2.0F, 0.125F));
/*     */     
/* 180 */     PartDefinition bone = rightArm2.m_171599_("bone", CubeListBuilder.m_171558_().m_171514_(16, 73).m_171488_(-1.7276F, 0.0853F, -2.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, -2.0F, 0.0F, 0.0F, 0.0F, -1.0908F));
/*     */     
/* 182 */     PartDefinition bone8 = bone.m_171599_("bone8", CubeListBuilder.m_171558_().m_171514_(47, 60).m_171488_(-1.7109F, -0.4976F, -1.9985F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F))
/* 183 */         .m_171514_(39, 9).m_171488_(1.2891F, 6.5024F, -1.9985F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
/* 184 */         .m_171514_(38, 33).m_171488_(1.2891F, 6.5024F, -0.4985F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
/* 185 */         .m_171514_(38, 14).m_171488_(1.2891F, 6.5024F, 1.0015F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-0.1687F, 6.9791F, 0.0F, -0.5672F, 0.0F, 0.7418F));
/*     */     
/* 187 */     PartDefinition rightArm = partdefinition.m_171599_("rightArm", CubeListBuilder.m_171558_(), PartPose.m_171419_(3.75F, 2.25F, 0.75F));
/*     */     
/* 189 */     PartDefinition bone13 = rightArm.m_171599_("bone13", CubeListBuilder.m_171558_().m_171514_(58, 73).m_171488_(-1.6233F, -0.4507F, -2.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.6545F));
/*     */     
/* 191 */     PartDefinition bone2 = bone13.m_171599_("bone2", CubeListBuilder.m_171558_().m_171514_(0, 61).m_171488_(-2.2102F, -0.9644F, -2.1567F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F))
/* 192 */         .m_171514_(42, 33).m_171488_(0.7898F, 6.0356F, -2.1567F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
/* 193 */         .m_171514_(14, 41).m_171488_(0.7898F, 6.0356F, -0.6567F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
/* 194 */         .m_171514_(18, 41).m_171488_(0.7898F, 6.0356F, 0.8433F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-0.2094F, 6.7095F, 0.0F, -0.5564F, -0.1166F, 0.5569F));
/*     */     
/* 196 */     PartDefinition leftArm2 = partdefinition.m_171599_("leftArm2", CubeListBuilder.m_171558_(), PartPose.m_171419_(-4.0F, -1.0F, 0.125F));
/*     */     
/* 198 */     PartDefinition bone12 = leftArm2.m_171599_("bone12", CubeListBuilder.m_171558_().m_171514_(68, 22).m_171488_(-2.1594F, -0.3764F, -2.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 1.0908F));
/*     */     
/* 200 */     PartDefinition bone11 = bone12.m_171599_("bone11", CubeListBuilder.m_171558_().m_171514_(52, 26).m_171488_(-2.3812F, -0.5688F, -2.0439F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F))
/* 201 */         .m_171514_(12, 14).m_171488_(-2.3812F, 6.4312F, -2.0439F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
/* 202 */         .m_171514_(11, 3).m_171488_(-2.3812F, 6.4312F, -0.5439F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
/* 203 */         .m_171514_(0, 3).m_171488_(-2.3812F, 6.4312F, 0.9561F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-0.5933F, 6.5173F, 0.0F, -0.5672F, 0.0F, -0.7418F));
/*     */     
/* 205 */     PartDefinition leftArm = partdefinition.m_171599_("leftArm", CubeListBuilder.m_171558_(), PartPose.m_171419_(-3.75F, 2.25F, 0.75F));
/*     */     
/* 207 */     PartDefinition bone14 = leftArm.m_171599_("bone14", CubeListBuilder.m_171558_().m_171514_(30, 70).m_171488_(-1.3767F, -0.4507F, -2.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.6545F));
/*     */     
/* 209 */     PartDefinition bone10 = bone14.m_171599_("bone10", CubeListBuilder.m_171558_().m_171514_(60, 5).m_171488_(-1.7898F, -0.9644F, -2.1567F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F))
/* 210 */         .m_171514_(19, 35).m_171488_(-1.7898F, 6.0356F, -2.1567F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
/* 211 */         .m_171514_(28, 2).m_171488_(-1.7898F, 6.0356F, -0.6567F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
/* 212 */         .m_171514_(28, 0).m_171488_(-1.7898F, 6.0356F, 0.8433F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.2094F, 6.7095F, 0.0F, -0.5564F, 0.1166F, -0.5569F));
/*     */     
/* 214 */     PartDefinition rightLeg = partdefinition.m_171599_("rightLeg", CubeListBuilder.m_171558_().m_171514_(72, 12).m_171488_(-2.0F, -0.375F, -1.75F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
/* 215 */         .m_171514_(16, 65).m_171488_(-0.125F, 13.9965F, -3.8953F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(2.125F, 7.0F, 0.125F));
/*     */     
/* 217 */     PartDefinition bone5 = rightLeg.m_171599_("bone5", CubeListBuilder.m_171558_().m_171514_(72, 0).m_171488_(-1.5F, -3.0357F, -2.6784F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
/* 218 */         .m_171514_(23, 89).m_171488_(-1.25F, 1.9643F, -2.6784F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, 5.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/*     */     
/* 220 */     PartDefinition bone6 = rightLeg.m_171599_("bone6", CubeListBuilder.m_171558_(), PartPose.m_171423_(-4.0F, 8.0F, -1.0F, 0.6545F, 0.0F, 0.0F));
/*     */     
/* 222 */     PartDefinition bone6_r1 = bone6.m_171599_("bone6_r1", CubeListBuilder.m_171558_().m_171514_(63, 63).m_171488_(-1.3698F, -4.6945F, -1.3912F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(5.0F, 3.688F, -0.051F, 0.0F, 0.0F, -0.1745F));
/*     */     
/* 224 */     PartDefinition bone7 = rightLeg.m_171599_("bone7", CubeListBuilder.m_171558_().m_171514_(72, 73).m_171488_(-0.125F, -1.1097F, 3.0027F, 4.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, 8.0F, -1.0F, -0.48F, 0.0F, 0.0F));
/*     */     
/* 226 */     PartDefinition leftLeg = partdefinition.m_171599_("leftLeg", CubeListBuilder.m_171558_().m_171514_(66, 47).m_171488_(-3.0F, -0.375F, -1.75F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
/* 227 */         .m_171514_(61, 55).m_171488_(-3.875F, 13.9965F, -3.8953F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-2.125F, 7.0F, 0.125F, 0.0F, 0.0F, 0.0F));
/*     */     
/* 229 */     PartDefinition bone3 = leftLeg.m_171599_("bone3", CubeListBuilder.m_171558_().m_171514_(0, 72).m_171488_(-2.5F, -3.0357F, -2.6784F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
/* 230 */         .m_171514_(90, 12).m_171488_(-2.75F, 1.9643F, -2.6784F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, 5.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/*     */     
/* 232 */     PartDefinition bone4 = leftLeg.m_171599_("bone4", CubeListBuilder.m_171558_(), PartPose.m_171423_(4.0F, 8.0F, -1.0F, 0.6545F, 0.0F, 0.0F));
/*     */     
/* 234 */     PartDefinition bone7_r1 = bone4.m_171599_("bone7_r1", CubeListBuilder.m_171558_().m_171514_(60, 37).m_171488_(-2.6302F, -4.6945F, -1.3912F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-5.0F, 3.688F, -0.051F, 0.0F, 0.0F, 0.1745F));
/*     */     
/* 236 */     PartDefinition bone9 = leftLeg.m_171599_("bone9", CubeListBuilder.m_171558_().m_171514_(44, 71).m_171488_(-3.875F, -1.1097F, 3.0027F, 4.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, 8.0F, -1.0F, -0.48F, 0.0F, 0.0F));
/*     */     
/* 238 */     return LayerDefinition.m_171565_(meshdefinition, 112, 112);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void m_7695_(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 244 */     this.Head.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 245 */     this.Torso.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 246 */     this.LeftArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 247 */     this.RightArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 248 */     this.LeftArm2.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 249 */     this.RightArm2.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 250 */     this.LeftLeg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 251 */     this.Rightleg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */ 
/*     */   
/*     */   public void prepareMobModel(DlSquidDogEntity p_102861_, float p_102862_, float p_102863_, float p_102864_) {
/* 256 */     prepareMobModel(this.controller, (LatexEntity)p_102861_, p_102862_, p_102863_, p_102864_);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setupAnim(DlSquidDogEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float HeadPitch) {
/* 261 */     this.controller.setupAnim((LatexEntity)entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, HeadPitch);
/*     */   }
/*     */ 
/*     */   
/*     */   public ModelPart getArm(HumanoidArm humanoidArm) {
/* 266 */     switch (humanoidArm) { default: throw new IncompatibleClassChangeError();case LEFT: case RIGHT: break; }  return 
/*     */       
/* 268 */       this.RightArm;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setupHand() {
/* 274 */     this.controller.setupHand();
/*     */   }
/*     */ 
/*     */   
/*     */   public LatexHumanoidModelController getController() {
/* 279 */     return this.controller;
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6002_(HumanoidArm p_102108_, PoseStack p_102109_) {
/* 284 */     getArm(p_102108_).m_104299_(p_102109_);
/*     */   }
/*     */ 
/*     */   
/*     */   public ModelPart m_5585_() {
/* 289 */     return this.Head;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\client\model\ModelDark_latex_squid_dog.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */