/*     */ package net.ltxprogrammer.turned.client.model;
/*     */ 
/*     */ import com.mojang.blaze3d.vertex.PoseStack;
/*     */ import com.mojang.blaze3d.vertex.VertexConsumer;
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
/*     */ import net.minecraft.util.Mth;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ModelTSC_Hunter_model<T extends Entity>
/*     */   extends EntityModel<T>
/*     */ {
/*  25 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("turned", "model_tsc_hunter_model"), "main");
/*     */   public final ModelPart Head;
/*     */   public final ModelPart Body;
/*     */   public final ModelPart LeftArm;
/*     */   public final ModelPart RightArm;
/*     */   public final ModelPart LeftLeg;
/*     */   public final ModelPart RightLeg;
/*     */   
/*     */   public ModelTSC_Hunter_model(ModelPart root) {
/*  34 */     this.Head = root.m_171324_("Head");
/*  35 */     this.Body = root.m_171324_("Body");
/*  36 */     this.LeftArm = root.m_171324_("LeftArm");
/*  37 */     this.RightArm = root.m_171324_("RightArm");
/*  38 */     this.LeftLeg = root.m_171324_("LeftLeg");
/*  39 */     this.RightLeg = root.m_171324_("RightLeg");
/*     */   }
/*     */   
/*     */   public static LayerDefinition createBodyLayer() {
/*  43 */     MeshDefinition meshdefinition = new MeshDefinition();
/*  44 */     PartDefinition partdefinition = meshdefinition.m_171576_();
/*  45 */     PartDefinition Head = partdefinition.m_171599_("Head", 
/*  46 */         CubeListBuilder.m_171558_().m_171514_(0, 16).m_171488_(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), 
/*  47 */         PartPose.m_171419_(0.0F, -13.0F, 0.0F));
/*  48 */     PartDefinition Muzzle = Head.m_171599_("Muzzle", 
/*  49 */         CubeListBuilder.m_171558_().m_171514_(76, 32).m_171488_(-3.9F, -3.2384F, -6.9248F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), 
/*  50 */         PartPose.m_171423_(1.4F, -1.0F, 1.0F, 0.3054F, 0.0F, 0.0F));
/*  51 */     PartDefinition Hair = Head.m_171599_("Hair", 
/*  52 */         CubeListBuilder.m_171558_().m_171514_(87, 63).m_171488_(-7.0F, -4.0F, -5.25F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(61, 39)
/*  53 */         .m_171488_(-7.0F, 1.0F, -5.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(42, 10)
/*  54 */         .m_171488_(-7.0F, 1.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 0)
/*  55 */         .m_171488_(-7.0F, -4.0F, -4.25F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(24, 22)
/*  56 */         .m_171488_(-7.0F, -5.0F, -5.25F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(17, 46)
/*  57 */         .m_171488_(-6.0F, -7.0F, -5.25F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(49, 2)
/*  58 */         .m_171488_(-3.0F, -4.0F, -5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(32, 83)
/*  59 */         .m_171488_(-7.0F, -7.0F, -4.25F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(47, 3)
/*  60 */         .m_171488_(-6.0F, -8.0F, -4.25F, 6.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).m_171514_(19, 61)
/*  61 */         .m_171488_(-1.0F, -7.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 49)
/*  62 */         .m_171488_(-2.0F, -5.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  63 */         PartPose.m_171419_(2.0F, -1.0F, 0.25F));
/*  64 */     PartDefinition Ears = Head.m_171599_("Ears", 
/*  65 */         CubeListBuilder.m_171558_().m_171514_(82, 72).m_171488_(2.6F, -7.8978F, 0.7765F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(14, 82)
/*  66 */         .m_171488_(-5.4F, -7.8978F, 0.7765F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(10, 73)
/*  67 */         .m_171488_(2.6F, -8.8978F, 0.7765F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).m_171514_(0, 72)
/*  68 */         .m_171488_(-5.4F, -8.8978F, 0.7765F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).m_171514_(66, 0)
/*  69 */         .m_171488_(2.6F, -9.8978F, 0.7765F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).m_171514_(59, 23).m_171488_(-5.4F, -9.8978F, 0.7765F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), 
/*     */         
/*  71 */         PartPose.m_171423_(0.9F, 3.0F, 2.0F, 0.2618F, 0.0F, 0.0F));
/*  72 */     PartDefinition Body = partdefinition.m_171599_("Body", 
/*  73 */         CubeListBuilder.m_171558_().m_171514_(30, 12).m_171488_(-5.5F, 1.0F, -2.0F, 11.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(61, 56)
/*  74 */         .m_171488_(-0.5F, 2.0F, 2.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(24, 16)
/*  75 */         .m_171488_(-0.5F, 3.0F, 3.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(24, 0)
/*  76 */         .m_171488_(-0.5F, 4.0F, 4.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 46)
/*  77 */         .m_171488_(-0.5F, 6.0F, 5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 61)
/*  78 */         .m_171488_(-0.5F, 8.0F, 6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 32)
/*  79 */         .m_171488_(-2.5F, 0.0F, -2.0F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(48, 33)
/*  80 */         .m_171488_(-5.0F, 12.0F, -2.0F, 10.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(0, 37)
/*  81 */         .m_171488_(-5.5F, 14.0F, -2.0F, 11.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(70, 21)
/*  82 */         .m_171488_(-8.25F, 0.75F, -2.5F, 4.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(48, 69)
/*  83 */         .m_171488_(4.25F, 0.75F, -2.5F, 4.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(22, 50)
/*  84 */         .m_171488_(-4.5F, 7.0F, -1.5F, 9.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), 
/*  85 */         PartPose.m_171419_(0.0F, -13.0F, 0.0F));
/*  86 */     PartDefinition breast = Body.m_171599_("breast", 
/*  87 */         CubeListBuilder.m_171558_().m_171514_(24, 0).m_171488_(-5.0F, -0.7716F, -2.8519F, 10.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), 
/*  88 */         PartPose.m_171423_(0.0F, 3.0F, -3.0F, 0.3927F, 0.0F, 0.0F));
/*  89 */     PartDefinition tail = Body.m_171599_("tail", 
/*  90 */         CubeListBuilder.m_171558_().m_171514_(0, 0).m_171488_(-3.5F, 9.3478F, -0.3686F, 7.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)).m_171514_(24, 24)
/*  91 */         .m_171488_(-3.0F, 9.9147F, 9.3814F, 6.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)).m_171514_(79, 8)
/*  92 */         .m_171488_(3.5F, 11.3478F, 2.6314F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).m_171514_(68, 85)
/*  93 */         .m_171488_(4.5F, 11.3478F, 3.6314F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(83, 16)
/*  94 */         .m_171488_(-5.5F, 11.3478F, 3.6314F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(14, 32)
/*  95 */         .m_171488_(5.5F, 11.3478F, 5.6314F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).m_171514_(0, 20)
/*  96 */         .m_171488_(-6.5F, 11.3478F, 5.6314F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).m_171514_(44, 25)
/*  97 */         .m_171488_(6.5F, 11.3478F, 6.6314F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(44, 22)
/*  98 */         .m_171488_(-7.5F, 11.3478F, 6.6314F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(56, 58)
/*  99 */         .m_171488_(7.5F, 11.3478F, 8.6314F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(56, 56)
/* 100 */         .m_171488_(-8.5F, 11.3478F, 8.6314F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(78, 64)
/* 101 */         .m_171488_(-4.5F, 11.3478F, 2.6314F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).m_171514_(87, 33)
/* 102 */         .m_171488_(-0.5F, 8.3478F, 4.6314F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(26, 37)
/* 103 */         .m_171488_(-0.5F, 7.3478F, 5.6314F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).m_171514_(0, 59)
/* 104 */         .m_171488_(-0.5F, 5.3478F, 8.6314F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(15, 61).m_171488_(-0.5F, 6.3478F, 6.6314F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), 
/*     */         
/* 106 */         PartPose.m_171423_(0.0F, 3.0F, 6.0F, -0.5236F, 0.0F, 0.0F));
/* 107 */     PartDefinition bone = tail.m_171599_("bone", 
/* 108 */         CubeListBuilder.m_171558_().m_171514_(52, 39).m_171488_(-1.0F, 4.1205F, 16.1991F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).m_171514_(77, 0)
/* 109 */         .m_171488_(-2.0F, 4.1205F, 12.1991F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 110 */         PartPose.m_171423_(-0.5F, 9.884F, 2.933F, 0.2618F, 0.0F, 0.0F));
/* 111 */     PartDefinition bone6 = bone.m_171599_("bone6", 
/* 112 */         CubeListBuilder.m_171558_().m_171514_(60, 81).m_171488_(0.0F, -26.6952F, -2.3316F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 113 */         PartPose.m_171423_(0.0F, 0.0F, 0.0F, -1.9635F, 0.0F, 0.0F));
/* 114 */     PartDefinition bone7 = bone.m_171599_("bone7", 
/* 115 */         CubeListBuilder.m_171558_().m_171514_(20, 60).m_171488_(0.0F, -23.3693F, 14.3681F, 1.0F, 15.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 116 */         PartPose.m_171423_(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
/* 117 */     PartDefinition LeftArm = partdefinition.m_171599_("LeftArm", 
/* 118 */         CubeListBuilder.m_171558_().m_171514_(66, 71).m_171488_(-3.071F, -2.2617F, -2.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(15, 59)
/* 119 */         .m_171488_(-3.571F, 14.7383F, 1.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(56, 1)
/* 120 */         .m_171488_(-3.571F, 14.7383F, 0.15F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(49, 0)
/* 121 */         .m_171488_(-3.571F, 14.7383F, -1.15F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(43, 50)
/* 122 */         .m_171488_(-3.571F, 14.7383F, -2.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 59)
/* 123 */         .m_171488_(-3.571F, 6.7383F, -2.5F, 5.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(56, 11)
/* 124 */         .m_171488_(0.429F, 14.7383F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).m_171514_(82, 55).m_171488_(-3.571F, 3.7383F, -2.5F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), 
/*     */         
/* 126 */         PartPose.m_171423_(-6.0F, -9.0F, 0.0F, 0.0F, 0.0F, 0.1309F));
/* 127 */     PartDefinition RightArm = partdefinition.m_171599_("RightArm", 
/* 128 */         CubeListBuilder.m_171558_().m_171514_(32, 69).m_171488_(-0.929F, -2.2617F, -2.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(17, 49)
/* 129 */         .m_171488_(0.571F, 14.7383F, 1.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(47, 39)
/* 130 */         .m_171488_(0.571F, 14.7383F, 0.15F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(36, 22)
/* 131 */         .m_171488_(0.571F, 14.7383F, -1.15F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(34, 10)
/* 132 */         .m_171488_(0.571F, 14.7383F, -2.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(41, 56)
/* 133 */         .m_171488_(-1.429F, 6.7383F, -2.5F, 5.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(0, 16)
/* 134 */         .m_171488_(-1.429F, 14.7383F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).m_171514_(23, 80).m_171488_(1.571F, 3.7383F, -2.5F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), 
/*     */         
/* 136 */         PartPose.m_171423_(6.0F, -9.0F, 0.0F, 0.0F, 0.0F, -0.1309F));
/* 137 */     PartDefinition LeftLeg = partdefinition.m_171599_("LeftLeg", 
/* 138 */         CubeListBuilder.m_171558_().m_171514_(81, 43).m_171488_(-3.0F, -3.5F, -2.5F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(65, 51)
/* 139 */         .m_171488_(-3.0F, -1.5F, -2.5F, 6.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(31, 37)
/* 140 */         .m_171488_(-3.0F, 16.0F, -5.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 37)
/* 141 */         .m_171488_(2.0F, 16.0F, -5.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(19, 32)
/* 142 */         .m_171488_(-0.5F, 16.0F, -5.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(81, 39)
/* 143 */         .m_171488_(-3.0F, 15.0F, -4.5F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(46, 46)
/* 144 */         .m_171488_(-3.0F, 14.0F, -3.5F, 6.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), 
/* 145 */         PartPose.m_171419_(-3.0F, 6.0F, 0.0F));
/* 146 */     PartDefinition bone3 = LeftLeg.m_171599_("bone3", 
/* 147 */         CubeListBuilder.m_171558_().m_171514_(0, 46).m_171488_(-4.0F, -0.7654F, -3.1522F, 6.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 148 */         PartPose.m_171423_(1.0F, 2.5F, 0.5F, -0.3927F, 0.0F, 0.0F));
/* 149 */     PartDefinition bone4 = bone3.m_171599_("bone4", 
/* 150 */         CubeListBuilder.m_171558_().m_171514_(61, 61).m_171488_(-4.0F, 0.4335F, -8.6488F, 6.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 151 */         PartPose.m_171423_(0.0F, -1.4142F, 1.4142F, 1.5708F, 0.0F, 0.0F));
/* 152 */     PartDefinition bone5 = bone4.m_171599_("bone5", 
/* 153 */         CubeListBuilder.m_171558_().m_171514_(78, 80).m_171488_(-3.0F, 8.0F, -1.8284F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 154 */         PartPose.m_171423_(0.0F, 3.262F, -0.6488F, -1.5708F, 0.0F, 0.0F));
/* 155 */     PartDefinition RightLeg = partdefinition.m_171599_("RightLeg", 
/* 156 */         CubeListBuilder.m_171558_().m_171514_(0, 81).m_171488_(1.0F, -3.5F, -2.5F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(64, 39)
/* 157 */         .m_171488_(-3.0F, -1.5F, -2.5F, 6.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(0, 32)
/* 158 */         .m_171488_(2.0F, 16.0F, -5.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(6, 0)
/* 159 */         .m_171488_(-3.0F, 16.0F, -5.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 0)
/* 160 */         .m_171488_(-0.5F, 16.0F, -5.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(27, 60)
/* 161 */         .m_171488_(-3.0F, 15.0F, -4.5F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(44, 22)
/* 162 */         .m_171488_(-3.0F, 14.0F, -3.5F, 6.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), 
/* 163 */         PartPose.m_171419_(3.0F, 6.0F, 0.0F));
/* 164 */     PartDefinition bone2 = RightLeg.m_171599_("bone2", 
/* 165 */         CubeListBuilder.m_171558_().m_171514_(30, 37).m_171488_(-2.0F, -0.7654F, -3.1522F, 6.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 166 */         PartPose.m_171423_(-1.0F, 2.5F, 0.5F, -0.3927F, 0.0F, 0.0F));
/* 167 */     PartDefinition bone8 = bone2.m_171599_("bone8", 
/* 168 */         CubeListBuilder.m_171558_().m_171514_(60, 11).m_171488_(-2.0F, 0.4335F, -8.6488F, 6.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 169 */         PartPose.m_171423_(0.0F, -1.4142F, 1.4142F, 1.5708F, 0.0F, 0.0F));
/* 170 */     PartDefinition bone9 = bone8.m_171599_("bone9", 
/* 171 */         CubeListBuilder.m_171558_().m_171514_(44, 80).m_171488_(-1.0F, 8.0F, -1.8284F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 172 */         PartPose.m_171423_(0.0F, 3.262F, -0.6488F, -1.5708F, 0.0F, 0.0F));
/* 173 */     return LayerDefinition.m_171565_(meshdefinition, 128, 128);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void m_7695_(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 179 */     this.Head.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 180 */     this.Body.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 181 */     this.LeftArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 182 */     this.RightArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 183 */     this.LeftLeg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 184 */     this.RightLeg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */   
/*     */   public void m_6973_(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
/* 188 */     this.RightArm.f_104203_ = Mth.m_14089_(limbSwing * 0.6662F + 3.1415927F) * limbSwingAmount;
/* 189 */     this.LeftLeg.f_104203_ = Mth.m_14089_(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
/* 190 */     this.Head.f_104204_ = netHeadYaw / 57.295776F;
/* 191 */     this.Head.f_104203_ = headPitch / 57.295776F;
/* 192 */     this.LeftArm.f_104203_ = Mth.m_14089_(limbSwing * 0.6662F) * limbSwingAmount;
/* 193 */     this.RightLeg.f_104203_ = Mth.m_14089_(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\client\model\ModelTSC_Hunter_model.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */