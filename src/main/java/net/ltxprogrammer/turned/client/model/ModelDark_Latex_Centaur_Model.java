/*     */ package net.ltxprogrammer.turned.client.model;
/*     */ 
/*     */ import com.mojang.blaze3d.vertex.PoseStack;
/*     */ import com.mojang.blaze3d.vertex.VertexConsumer;
/*     */ import net.ltxprogrammer.changed.client.renderer.model.LatexHumanoidModel;
/*     */ import net.ltxprogrammer.changed.client.renderer.model.LatexHumanoidModelController;
/*     */ import net.ltxprogrammer.changed.client.renderer.model.LatexHumanoidModelInterface;
/*     */ import net.ltxprogrammer.changed.entity.LatexEntity;
/*     */ import net.ltxprogrammer.turned.entity.DarkLatexCentaurEntity;
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
/*     */ public class ModelDark_Latex_Centaur_Model
/*     */   extends LatexHumanoidModel<DarkLatexCentaurEntity>
/*     */   implements LatexHumanoidModelInterface
/*     */ {
/*  27 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("turned", "model_dark_latex_centaur_model"), "main");
/*     */   
/*     */   public final ModelPart Head;
/*     */   public final ModelPart Body;
/*     */   public final ModelPart Tail;
/*     */   public final ModelPart LeftArm;
/*     */   public final ModelPart RightArm;
/*     */   public final ModelPart RightLeg1;
/*     */   public final ModelPart RightLeg2;
/*     */   public final ModelPart LeftLeg1;
/*     */   public final ModelPart LeftLeg2;
/*     */   public final LatexHumanoidModelController controller;
/*     */   
/*     */   public ModelDark_Latex_Centaur_Model(ModelPart root) {
/*  41 */     super(root);
/*  42 */     this.Head = root.m_171324_("Head");
/*  43 */     this.Body = root.m_171324_("Body");
/*  44 */     this.Tail = this.Body.m_171324_("LowerBody").m_171324_("Tail");
/*  45 */     this.LeftArm = root.m_171324_("LeftArm");
/*  46 */     this.RightArm = root.m_171324_("RightArm");
/*  47 */     this.RightLeg1 = root.m_171324_("RightLeg1");
/*  48 */     this.RightLeg2 = root.m_171324_("RightLeg2");
/*  49 */     this.LeftLeg1 = root.m_171324_("LeftLeg1");
/*  50 */     this.LeftLeg2 = root.m_171324_("LeftLeg2");
/*  51 */     this.controller = LatexHumanoidModelController.Builder.of((EntityModel)this, this.Head, this.Body, this.Tail, this.RightArm, this.LeftArm, this.RightLeg1, this.LeftLeg1).legs2(this.Body.m_171324_("LowerBody"), this.RightLeg2, this.LeftLeg2).hipOffset(0.0F).forewardOffset(-8.375F).build();
/*     */   }
/*     */   
/*     */   public static LayerDefinition createBodyLayer() {
/*  55 */     MeshDefinition meshdefinition = new MeshDefinition();
/*  56 */     PartDefinition partdefinition = meshdefinition.m_171576_();
/*     */     
/*  58 */     PartDefinition Head = partdefinition.m_171599_("Head", CubeListBuilder.m_171558_(), PartPose.m_171419_(0.0F, -2.0F, -8.25F));
/*     */     
/*  60 */     PartDefinition cube_r1 = Head.m_171599_("cube_r1", CubeListBuilder.m_171558_().m_171514_(36, 39).m_171488_(-3.0F, -7.0F, -5.0F, 6.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
/*  61 */         .m_171514_(0, 82).m_171488_(-2.0F, -3.0F, -5.0F, 4.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, -3.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));
/*     */     
/*  63 */     PartDefinition cube_r2 = Head.m_171599_("cube_r2", CubeListBuilder.m_171558_().m_171514_(38, 0).m_171488_(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, -7.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));
/*     */     
/*  65 */     PartDefinition Mask = Head.m_171599_("Mask", CubeListBuilder.m_171558_().m_171514_(16, 0).m_171488_(-4.25F, -3.875F, 3.125F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  66 */         .m_171514_(16, 0).m_171480_().m_171488_(3.25F, -3.875F, 3.125F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).m_171555_(false)
/*  67 */         .m_171514_(16, 1).m_171488_(-2.5F, -0.875F, 3.25F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  68 */         .m_171514_(16, 4).m_171488_(1.5F, -0.875F, 3.25F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  69 */         .m_171514_(0, 1).m_171488_(-3.5F, -4.875F, 3.25F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
/*  70 */         .m_171514_(2, 1).m_171488_(2.5F, -4.875F, 3.25F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
/*  71 */         .m_171514_(12, 0).m_171488_(-0.5F, -3.875F, 3.25F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  72 */         .m_171514_(12, 3).m_171488_(-1.5F, -4.875F, 3.25F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  73 */         .m_171514_(0, 0).m_171488_(-1.0F, -7.875F, 3.25F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  74 */         .m_171514_(0, 19).m_171488_(-2.5F, -6.875F, 3.25F, 5.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  75 */         .m_171514_(0, 18).m_171488_(-3.5F, -5.875F, 3.25F, 7.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
/*  76 */         .m_171514_(38, 16).m_171488_(-2.5F, -2.875F, 3.25F, 5.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, -3.0F, -1.0F, -3.1416F, 0.0F, 3.1416F));
/*     */     
/*  78 */     PartDefinition Ears = Head.m_171599_("Ears", CubeListBuilder.m_171558_().m_171514_(72, 85).m_171488_(-4.75F, -6.3832F, -3.3303F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
/*  79 */         .m_171514_(62, 0).m_171488_(-4.75F, -2.3832F, -3.3303F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
/*  80 */         .m_171514_(14, 16).m_171488_(-4.75F, 1.6168F, -3.3303F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
/*  81 */         .m_171514_(12, 0).m_171488_(3.75F, 1.6168F, -3.3303F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
/*  82 */         .m_171514_(38, 0).m_171488_(3.75F, -2.3832F, -3.3303F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
/*  83 */         .m_171514_(46, 55).m_171488_(3.75F, -6.3832F, -3.3303F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, -9.0F, 5.75F, 1.1781F, 0.0F, 3.1416F));
/*     */     
/*  85 */     PartDefinition Body = partdefinition.m_171599_("Body", CubeListBuilder.m_171558_(), PartPose.m_171419_(0.0F, -2.0F, 0.0F));
/*     */     
/*  87 */     PartDefinition cube_r3 = Body.m_171599_("cube_r3", CubeListBuilder.m_171558_().m_171514_(58, 16).m_171488_(-3.5F, 5.0F, 13.25F, 7.0F, 6.0F, 4.0F, new CubeDeformation(0.0F))
/*  88 */         .m_171514_(0, 47).m_171488_(-5.0F, 0.0F, 12.75F, 10.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, -3.0F, 7.0F, -3.1416F, 0.0F, 3.1416F));
/*     */     
/*  90 */     PartDefinition LowerBody = Body.m_171599_("LowerBody", CubeListBuilder.m_171558_(), PartPose.m_171419_(0.0F, 11.0F, 0.0F));
/*     */     
/*  92 */     PartDefinition cube_r4 = LowerBody.m_171599_("cube_r4", CubeListBuilder.m_171558_().m_171514_(36, 26).m_171488_(-3.0F, -2.75F, -9.0F, 6.0F, 1.0F, 18.0F, new CubeDeformation(0.0F))
/*  93 */         .m_171514_(0, 26).m_171488_(-4.0F, -1.75F, -10.0F, 8.0F, 1.0F, 20.0F, new CubeDeformation(0.0F))
/*  94 */         .m_171514_(0, 0).m_171488_(-4.5F, -0.75F, -10.0F, 9.0F, 6.0F, 20.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, -2.25F, -0.75F, -3.1416F, 0.0F, 3.1416F));
/*     */     
/*  96 */     PartDefinition Tail = LowerBody.m_171599_("Tail", CubeListBuilder.m_171558_(), PartPose.m_171419_(0.0F, -2.125F, 7.25F));
/*     */     
/*  98 */     PartDefinition cube_r5 = Tail.m_171599_("cube_r5", CubeListBuilder.m_171558_().m_171514_(38, 45).m_171488_(-1.5F, -5.7164F, -26.4923F, 4.0F, 3.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.5F, 0.5376F, -9.7249F, -2.7489F, 0.0F, 3.1416F));
/*     */     
/* 100 */     PartDefinition LeftArm = partdefinition.m_171599_("LeftArm", CubeListBuilder.m_171558_(), PartPose.m_171419_(5.0F, 0.0F, -8.375F));
/*     */     
/* 102 */     PartDefinition cube_r6 = LeftArm.m_171599_("cube_r6", CubeListBuilder.m_171558_().m_171514_(66, 37).m_171488_(-13.0F, 13.75F, 5.25F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
/* 103 */         .m_171514_(45, 47).m_171488_(-13.0F, -1.25F, 5.25F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
/* 104 */         .m_171514_(0, 26).m_171488_(-13.0F, -0.25F, 5.25F, 4.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-9.897F, -2.7496F, 7.375F, 3.1416F, 0.0F, 2.9671F));
/*     */     
/* 106 */     PartDefinition RightArm = partdefinition.m_171599_("RightArm", CubeListBuilder.m_171558_(), PartPose.m_171419_(-5.0F, 0.0F, -8.375F));
/*     */     
/* 108 */     PartDefinition cube_r7 = RightArm.m_171599_("cube_r7", CubeListBuilder.m_171558_().m_171514_(64, 57).m_171488_(9.75F, 13.75F, 5.25F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
/* 109 */         .m_171514_(25, 47).m_171488_(11.75F, -1.25F, 5.25F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
/* 110 */         .m_171514_(0, 0).m_171488_(8.75F, -0.25F, 5.25F, 4.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(9.897F, -2.7496F, 7.375F, -3.1416F, 0.0F, -2.9671F));
/*     */     
/* 112 */     PartDefinition RightLeg1 = partdefinition.m_171599_("RightLeg1", CubeListBuilder.m_171558_(), PartPose.m_171419_(-2.75F, 9.25F, -9.0F));
/*     */     
/* 114 */     PartDefinition cube_r8 = RightLeg1.m_171599_("cube_r8", CubeListBuilder.m_171558_().m_171514_(77, 61).m_171488_(0.25F, 5.2934F, 7.2611F, 5.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
/* 115 */         .m_171514_(82, 85).m_171488_(0.625F, -8.7934F, 4.5039F, 5.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
/* 116 */         .m_171514_(40, 66).m_171488_(0.25F, -8.7934F, 5.5039F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(2.75F, 6.4184F, 8.2461F, -3.1416F, 0.0F, 3.1416F));
/*     */     
/* 118 */     PartDefinition bone = RightLeg1.m_171599_("bone", CubeListBuilder.m_171558_(), PartPose.m_171423_(5.75F, 0.625F, 15.75F, -0.7854F, 0.0F, 0.0F));
/*     */     
/* 120 */     PartDefinition cube_r9 = bone.m_171599_("cube_r9", CubeListBuilder.m_171558_().m_171514_(70, 0).m_171488_(0.25F, -0.1715F, 5.697F, 5.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-3.0F, 10.2865F, -2.0934F, 3.0543F, 0.0F, -3.1416F));
/*     */     
/* 122 */     PartDefinition bone2 = bone.m_171599_("bone2", CubeListBuilder.m_171558_(), PartPose.m_171423_(0.0F, -2.2929F, 1.5355F, 1.1781F, 0.0F, 0.0F));
/*     */     
/* 124 */     PartDefinition cube_r10 = bone2.m_171599_("cube_r10", CubeListBuilder.m_171558_().m_171514_(84, 44).m_171488_(0.75F, 2.9624F, 2.3798F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-3.0F, 1.4612F, -13.0106F, -2.3562F, 0.0F, 3.1416F));
/*     */     
/* 126 */     PartDefinition cube_r11 = bone2.m_171599_("cube_r11", CubeListBuilder.m_171558_().m_171514_(81, 19).m_171488_(0.75F, -9.065F, 3.6476F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-3.0F, 1.4612F, -13.0106F, 2.7489F, 0.0F, -3.1416F));
/*     */     
/* 128 */     PartDefinition RightLeg2 = partdefinition.m_171599_("RightLeg2", CubeListBuilder.m_171558_(), PartPose.m_171419_(-2.75F, 9.25F, 6.0F));
/*     */     
/* 130 */     PartDefinition cube_r12 = RightLeg2.m_171599_("cube_r12", CubeListBuilder.m_171558_().m_171514_(48, 77).m_171488_(0.625F, 5.2816F, -7.0623F, 5.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
/* 131 */         .m_171514_(60, 85).m_171488_(0.625F, -9.7934F, -10.2611F, 5.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
/* 132 */         .m_171514_(20, 61).m_171488_(0.625F, -9.7934F, -9.2611F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(2.75F, 6.4184F, -6.7539F, -3.1416F, 0.0F, 3.1416F));
/*     */     
/* 134 */     PartDefinition bone3 = RightLeg2.m_171599_("bone3", CubeListBuilder.m_171558_(), PartPose.m_171423_(5.75F, 0.625F, -13.25F, -0.7854F, 0.0F, 0.0F));
/*     */     
/* 136 */     PartDefinition cube_r13 = bone3.m_171599_("cube_r13", CubeListBuilder.m_171558_().m_171514_(64, 45).m_171488_(0.625F, -10.4283F, -4.9708F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-3.0F, 0.387F, 7.8061F, 3.0543F, 0.0F, -3.1416F));
/*     */     
/* 138 */     PartDefinition bone4 = bone3.m_171599_("bone4", CubeListBuilder.m_171558_(), PartPose.m_171423_(0.0F, -2.2929F, 1.5355F, 1.1781F, 0.0F, 0.0F));
/*     */     
/* 140 */     PartDefinition cube_r14 = bone4.m_171599_("cube_r14", CubeListBuilder.m_171558_().m_171514_(12, 81).m_171488_(1.125F, -3.5298F, -10.8488F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-3.0F, 6.8188F, -0.0762F, -2.3562F, 0.0F, 3.1416F));
/*     */     
/* 142 */     PartDefinition cube_r15 = bone4.m_171599_("cube_r15", CubeListBuilder.m_171558_().m_171514_(0, 69).m_171488_(1.125F, -0.3278F, -7.4128F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-3.0F, 6.8188F, -0.0762F, 2.7489F, 0.0F, -3.1416F));
/*     */     
/* 144 */     PartDefinition LeftLeg1 = partdefinition.m_171599_("LeftLeg1", CubeListBuilder.m_171558_(), PartPose.m_171419_(2.75F, 9.25F, -9.0F));
/*     */     
/* 146 */     PartDefinition cube_r16 = LeftLeg1.m_171599_("cube_r16", CubeListBuilder.m_171558_().m_171514_(76, 11).m_171488_(-5.375F, 5.2934F, 7.2611F, 5.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
/* 147 */         .m_171514_(84, 55).m_171488_(-5.625F, -8.7934F, 4.5039F, 5.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
/* 148 */         .m_171514_(66, 26).m_171488_(-5.375F, -8.7934F, 5.5039F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-2.75F, 6.4184F, 8.2461F, -3.1416F, 0.0F, 3.1416F));
/*     */     
/* 150 */     PartDefinition bone5 = LeftLeg1.m_171599_("bone5", CubeListBuilder.m_171558_(), PartPose.m_171423_(-5.75F, 0.625F, 15.75F, -0.7854F, 0.0F, 0.0F));
/*     */     
/* 152 */     PartDefinition cube_r17 = bone5.m_171599_("cube_r17", CubeListBuilder.m_171558_().m_171514_(60, 66).m_171488_(-5.375F, -0.1715F, 5.697F, 5.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(3.0F, 10.2865F, -2.0934F, 3.0543F, 0.0F, -3.1416F));
/*     */     
/* 154 */     PartDefinition bone6 = bone5.m_171599_("bone6", CubeListBuilder.m_171558_(), PartPose.m_171423_(0.0F, -2.2929F, 1.5355F, 1.1781F, 0.0F, 0.0F));
/*     */     
/* 156 */     PartDefinition cube_r18 = bone6.m_171599_("cube_r18", CubeListBuilder.m_171558_().m_171514_(82, 33).m_171488_(-4.875F, 2.9624F, 2.3798F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(3.0F, 1.4612F, -13.0106F, -2.3562F, 0.0F, 3.1416F));
/*     */     
/* 158 */     PartDefinition cube_r19 = bone6.m_171599_("cube_r19", CubeListBuilder.m_171558_().m_171514_(32, 77).m_171488_(-4.875F, -9.065F, 3.6476F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(3.0F, 1.4612F, -13.0106F, 2.7489F, 0.0F, -3.1416F));
/*     */     
/* 160 */     PartDefinition LeftLeg2 = partdefinition.m_171599_("LeftLeg2", CubeListBuilder.m_171558_(), PartPose.m_171419_(2.75F, 9.25F, 6.0F));
/*     */     
/* 162 */     PartDefinition cube_r20 = LeftLeg2.m_171599_("cube_r20", CubeListBuilder.m_171558_().m_171514_(16, 73).m_171488_(-5.375F, 5.2816F, -7.0623F, 5.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
/* 163 */         .m_171514_(48, 85).m_171488_(-5.375F, -9.7934F, -10.2611F, 5.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
/* 164 */         .m_171514_(30, 47).m_171488_(-5.375F, -9.7934F, -9.2611F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-2.75F, 6.4184F, -6.7539F, -3.1416F, 0.0F, 3.1416F));
/*     */     
/* 166 */     PartDefinition bone9 = LeftLeg2.m_171599_("bone9", CubeListBuilder.m_171558_(), PartPose.m_171423_(-5.75F, 0.625F, -13.25F, -0.7854F, 0.0F, 0.0F));
/*     */     
/* 168 */     PartDefinition cube_r21 = bone9.m_171599_("cube_r21", CubeListBuilder.m_171558_().m_171514_(0, 57).m_171488_(-5.375F, -10.4283F, -4.9708F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(3.0F, 0.387F, 7.8061F, 3.0543F, 0.0F, -3.1416F));
/*     */     
/* 170 */     PartDefinition bone10 = bone9.m_171599_("bone10", CubeListBuilder.m_171558_(), PartPose.m_171423_(0.0F, -2.2929F, 1.5355F, 1.1781F, 0.0F, 0.0F));
/*     */     
/* 172 */     PartDefinition cube_r22 = bone10.m_171599_("cube_r22", CubeListBuilder.m_171558_().m_171514_(74, 73).m_171488_(-4.875F, -3.5298F, -10.8488F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(3.0F, 6.8188F, -0.0762F, -2.3562F, 0.0F, 3.1416F));
/*     */     
/* 174 */     PartDefinition cube_r23 = bone10.m_171599_("cube_r23", CubeListBuilder.m_171558_().m_171514_(36, 26).m_171488_(-4.875F, -0.3278F, -7.4128F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(3.0F, 6.8188F, -0.0762F, 2.7489F, 0.0F, -3.1416F));
/*     */     
/* 176 */     return LayerDefinition.m_171565_(meshdefinition, 112, 112);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void m_7695_(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 182 */     this.Head.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 183 */     this.Body.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 184 */     this.LeftArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 185 */     this.RightArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 186 */     this.RightLeg1.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 187 */     this.RightLeg2.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 188 */     this.LeftLeg1.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 189 */     this.LeftLeg2.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */ 
/*     */   
/*     */   public void prepareMobModel(DarkLatexCentaurEntity p_102861_, float p_102862_, float p_102863_, float p_102864_) {
/* 194 */     prepareMobModel(this.controller, (LatexEntity)p_102861_, p_102862_, p_102863_, p_102864_);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setupAnim(DarkLatexCentaurEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float HeadPitch) {
/* 199 */     this.controller.setupAnim((LatexEntity)entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, HeadPitch);
/*     */   }
/*     */ 
/*     */   
/*     */   public ModelPart getArm(HumanoidArm humanoidArm) {
/* 204 */     switch (humanoidArm) { default: throw new IncompatibleClassChangeError();case LEFT: case RIGHT: break; }  return 
/*     */       
/* 206 */       this.RightArm;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setupHand() {
/* 212 */     this.controller.setupHand();
/*     */   }
/*     */ 
/*     */   
/*     */   public LatexHumanoidModelController getController() {
/* 217 */     return this.controller;
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6002_(HumanoidArm p_102108_, PoseStack p_102109_) {
/* 222 */     getArm(p_102108_).m_104299_(p_102109_);
/*     */   }
/*     */ 
/*     */   
/*     */   public ModelPart m_5585_() {
/* 227 */     return this.Head;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\client\model\ModelDark_Latex_Centaur_Model.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */