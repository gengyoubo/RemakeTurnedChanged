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
/*     */ public class Modelnxt_hertx_model<T extends Entity>
/*     */   extends EntityModel<T>
/*     */ {
/*  25 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("turned", "modelnxt_hertx_model"), "main");
/*     */   public final ModelPart Head;
/*     */   public final ModelPart Body;
/*     */   public final ModelPart Tail;
/*     */   public final ModelPart LeftArm;
/*     */   public final ModelPart RightArm;
/*     */   public final ModelPart LeftLeg;
/*     */   public final ModelPart RightLeg;
/*     */   
/*     */   public Modelnxt_hertx_model(ModelPart root) {
/*  35 */     this.Head = root.m_171324_("Head");
/*  36 */     this.Body = root.m_171324_("Body");
/*  37 */     this.Tail = root.m_171324_("Tail");
/*  38 */     this.LeftArm = root.m_171324_("LeftArm");
/*  39 */     this.RightArm = root.m_171324_("RightArm");
/*  40 */     this.LeftLeg = root.m_171324_("LeftLeg");
/*  41 */     this.RightLeg = root.m_171324_("RightLeg");
/*     */   }
/*     */   
/*     */   public static LayerDefinition createBodyLayer() {
/*  45 */     MeshDefinition meshdefinition = new MeshDefinition();
/*  46 */     PartDefinition partdefinition = meshdefinition.m_171576_();
/*  47 */     PartDefinition Head = partdefinition.m_171599_("Head", 
/*  48 */         CubeListBuilder.m_171558_().m_171514_(46, 33).m_171488_(-2.0F, -3.4F, -3.2F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(58, 12)
/*  49 */         .m_171488_(-2.0F, -7.4F, 1.8F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).m_171514_(24, 18)
/*  50 */         .m_171488_(-2.0F, -3.4F, 2.8F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(62, 64)
/*  51 */         .m_171488_(-3.0F, -3.4F, 1.8F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(22, 11)
/*  52 */         .m_171488_(-3.0F, -1.4F, -3.1F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(20, 14)
/*  53 */         .m_171488_(-1.5F, -0.4F, -2.85F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(16, 33)
/*  54 */         .m_171488_(-3.5F, -6.4F, 1.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(31, 0)
/*  55 */         .m_171488_(2.5F, -6.4F, 1.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(30, 39)
/*  56 */         .m_171488_(2.0F, -7.4F, 1.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 45)
/*  57 */         .m_171488_(-3.0F, -7.4F, 1.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(31, 0)
/*  58 */         .m_171488_(-3.0F, -7.4F, -3.2F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(10, 50)
/*  59 */         .m_171488_(2.0F, -6.4F, -4.2F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(34, 48)
/*  60 */         .m_171488_(-3.0F, -6.4F, -4.2F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(0, 7)
/*  61 */         .m_171488_(-2.0F, -6.4F, -4.2F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  62 */         PartPose.m_171419_(0.0F, -2.0F, 0.0F));
/*  63 */     PartDefinition Jaw = Head.m_171599_("Jaw", 
/*  64 */         CubeListBuilder.m_171558_().m_171514_(30, 57).m_171488_(2.0F, -0.3F, -6.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(31, 6)
/*  65 */         .m_171488_(-2.0F, -0.3F, -6.2F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(16, 33)
/*  66 */         .m_171488_(-3.0F, 0.7F, -5.2F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(0, 56)
/*  67 */         .m_171488_(-3.0F, -0.3F, -6.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), 
/*  68 */         PartPose.m_171419_(0.0F, -3.0F, 2.0F));
/*  69 */     PartDefinition bone2 = Jaw.m_171599_("bone2", 
/*  70 */         CubeListBuilder.m_171558_().m_171514_(33, 33).m_171488_(-3.0F, -18.0413F, -22.5668F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
/*  71 */         .m_171514_(36, 46).m_171488_(-3.0F, -18.0413F, -22.981F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  72 */         PartPose.m_171423_(0.0F, 29.0F, -2.0F, -0.7854F, 0.0F, 0.0F));
/*  73 */     PartDefinition bone = Head.m_171599_("bone", 
/*  74 */         CubeListBuilder.m_171558_().m_171514_(38, 59).m_171488_(-3.0F, -25.8801F, 19.9404F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
/*  75 */         .m_171514_(58, 46).m_171488_(-3.0F, -25.8801F, 20.3546F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  76 */         PartPose.m_171423_(0.0F, 26.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
/*  77 */     PartDefinition cube_r1 = Head.m_171599_("cube_r1", 
/*  78 */         CubeListBuilder.m_171558_().m_171514_(33, 35).m_171488_(-2.9F, -8.7665F, 9.6128F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(9, 59)
/*  79 */         .m_171488_(-2.9F, -8.7665F, 4.6128F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(12, 30)
/*  80 */         .m_171488_(1.9F, -8.7665F, 9.6128F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 30)
/*  81 */         .m_171488_(-3.4F, -7.4142F, 8.2505F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 14)
/*  82 */         .m_171488_(2.4F, -7.4142F, 8.2505F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(58, 48)
/*  83 */         .m_171488_(1.9F, -8.7665F, 4.6128F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(0, 63)
/*  84 */         .m_171488_(-3.4F, -7.4142F, 4.2505F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(0, 0).m_171488_(2.4F, -7.4142F, 4.2505F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), 
/*     */         
/*  86 */         PartPose.m_171423_(0.0F, 2.4F, -0.2F, 0.2618F, 0.0F, 0.0F));
/*  87 */     PartDefinition Body = partdefinition.m_171599_("Body", 
/*  88 */         CubeListBuilder.m_171558_().m_171514_(0, 14).m_171488_(-4.0F, -0.8F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(59, 30)
/*  89 */         .m_171488_(-3.0F, 0.2F, -3.0F, 6.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(48, 0)
/*  90 */         .m_171488_(-4.0F, 0.2F, 2.0F, 8.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(6, 0)
/*  91 */         .m_171488_(3.0F, 0.2F, -3.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 0)
/*  92 */         .m_171488_(-4.0F, 0.2F, -3.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(50, 61)
/*  93 */         .m_171488_(3.0F, -1.8F, -2.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(21, 61)
/*  94 */         .m_171488_(-4.0F, -1.8F, -2.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(24, 39)
/*  95 */         .m_171488_(-1.0F, 1.2F, -3.25F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 56)
/*  96 */         .m_171488_(-2.5F, 5.2F, -3.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(42, 18)
/*  97 */         .m_171488_(0.5F, 5.2F, -3.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  98 */         PartPose.m_171419_(0.0F, -2.0F, 0.0F));
/*  99 */     PartDefinition Tail = partdefinition.m_171599_("Tail", CubeListBuilder.m_171558_(), PartPose.m_171419_(0.0F, -2.0F, 0.0F));
/* 100 */     PartDefinition cube_r10 = Tail.m_171599_("cube_r10", 
/* 101 */         CubeListBuilder.m_171558_().m_171514_(17, 0).m_171488_(-1.3F, 15.4952F, 16.7033F, 3.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), 
/* 102 */         PartPose.m_171423_(0.0F, 2.0F, 0.0F, -0.0873F, 0.0F, 0.0F));
/* 103 */     PartDefinition cube_r2 = Tail.m_171599_("cube_r2", 
/* 104 */         CubeListBuilder.m_171558_().m_171514_(16, 22).m_171488_(-1.3F, 9.6164F, 13.4918F, 3.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), 
/* 105 */         PartPose.m_171423_(0.0F, 2.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 106 */     PartDefinition cube_r3 = Tail.m_171599_("cube_r3", 
/* 107 */         CubeListBuilder.m_171558_().m_171514_(0, 0).m_171488_(-1.3F, 3.4929F, 6.2929F, 3.0F, 3.0F, 11.0F, new CubeDeformation(0.0F)), 
/* 108 */         PartPose.m_171423_(0.0F, 2.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
/* 109 */     PartDefinition LeftArm = partdefinition.m_171599_("LeftArm", 
/* 110 */         CubeListBuilder.m_171558_().m_171514_(30, 18).m_171488_(-3.0F, -2.8F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(20, 55)
/* 111 */         .m_171488_(-3.0F, 5.2F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(17, 0)
/* 112 */         .m_171488_(-3.25F, 5.2F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(46, 16)
/* 113 */         .m_171488_(-3.0F, 7.2F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(18, 54)
/* 114 */         .m_171488_(-3.0F, 11.2F, 1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(52, 5)
/* 115 */         .m_171488_(-3.0F, 11.2F, -2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(6, 42)
/* 116 */         .m_171488_(-1.0F, 11.2F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(18, 52)
/* 117 */         .m_171488_(-3.0F, 11.2F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 118 */         PartPose.m_171419_(-5.0F, 0.0F, 0.0F));
/* 119 */     PartDefinition RightArm = partdefinition.m_171599_("RightArm", 
/* 120 */         CubeListBuilder.m_171558_().m_171514_(0, 30).m_171488_(-1.0F, -4.8F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(54, 24)
/* 121 */         .m_171488_(-1.0F, 3.2F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(24, 46)
/* 122 */         .m_171488_(-1.0F, 5.2F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(0, 42)
/* 123 */         .m_171488_(0.0F, 9.2F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(18, 50)
/* 124 */         .m_171488_(1.0F, 9.2F, -2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(42, 48)
/* 125 */         .m_171488_(1.0F, 9.2F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(28, 44)
/* 126 */         .m_171488_(1.0F, 9.2F, 1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(17, 4)
/* 127 */         .m_171488_(2.25F, 3.2F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), 
/* 128 */         PartPose.m_171419_(5.0F, 2.0F, 0.0F));
/* 129 */     PartDefinition LeftLeg = partdefinition.m_171599_("LeftLeg", 
/* 130 */         CubeListBuilder.m_171558_().m_171514_(44, 53).m_171488_(-2.0F, -0.8F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
/* 131 */         .m_171514_(45, 45).m_171488_(-2.0F, 11.0F, -3.4102F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 132 */         PartPose.m_171419_(-2.0F, 10.0F, 0.0F));
/* 133 */     PartDefinition cube_r4 = LeftLeg.m_171599_("cube_r4", 
/* 134 */         CubeListBuilder.m_171558_().m_171514_(57, 57).m_171488_(-2.0F, 3.3F, 3.0F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).m_171514_(62, 36)
/* 135 */         .m_171488_(-2.0F, 7.3F, 3.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).m_171514_(41, 61).m_171488_(-2.0F, 8.3F, 3.0F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), 
/*     */         
/* 137 */         PartPose.m_171423_(0.0F, 2.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 138 */     PartDefinition cube_r5 = LeftLeg.m_171599_("cube_r5", 
/* 139 */         CubeListBuilder.m_171558_().m_171514_(12, 39).m_171488_(-2.0F, -0.5848F, -5.0633F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 140 */         PartPose.m_171423_(0.0F, 2.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
/* 141 */     PartDefinition cube_r6 = LeftLeg.m_171599_("cube_r6", 
/* 142 */         CubeListBuilder.m_171558_().m_171514_(0, 46).m_171488_(-2.0F, -1.5045F, -2.4584F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 143 */         PartPose.m_171423_(0.0F, 2.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 144 */     PartDefinition RightLeg = partdefinition.m_171599_("RightLeg", 
/* 145 */         CubeListBuilder.m_171558_().m_171514_(50, 39).m_171488_(-2.0F, -0.8F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
/* 146 */         .m_171514_(41, 25).m_171488_(-2.0F, 11.0F, -3.4102F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 147 */         PartPose.m_171419_(2.0F, 10.0F, 0.0F));
/* 148 */     PartDefinition cube_r7 = RightLeg.m_171599_("cube_r7", 
/* 149 */         CubeListBuilder.m_171558_().m_171514_(56, 5).m_171488_(-2.0F, 3.3F, 3.0F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).m_171514_(63, 42)
/* 150 */         .m_171488_(-2.0F, 7.3F, 3.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).m_171514_(62, 19).m_171488_(-2.0F, 8.3F, 3.0F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), 
/*     */         
/* 152 */         PartPose.m_171423_(0.0F, 2.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 153 */     PartDefinition cube_r8 = RightLeg.m_171599_("cube_r8", 
/* 154 */         CubeListBuilder.m_171558_().m_171514_(34, 35).m_171488_(-2.0F, -0.5848F, -5.0633F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 155 */         PartPose.m_171423_(0.0F, 2.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
/* 156 */     PartDefinition cube_r9 = RightLeg.m_171599_("cube_r9", 
/* 157 */         CubeListBuilder.m_171558_().m_171514_(40, 6).m_171488_(-2.0F, -1.5045F, -2.4584F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 158 */         PartPose.m_171423_(0.0F, 2.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 159 */     return LayerDefinition.m_171565_(meshdefinition, 128, 128);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void m_7695_(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 165 */     this.Head.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 166 */     this.Body.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 167 */     this.Tail.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 168 */     this.LeftArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 169 */     this.RightArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 170 */     this.LeftLeg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 171 */     this.RightLeg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */   
/*     */   public void m_6973_(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
/* 175 */     this.RightArm.f_104203_ = Mth.m_14089_(limbSwing * 0.6662F + 3.1415927F) * limbSwingAmount;
/* 176 */     this.LeftLeg.f_104203_ = Mth.m_14089_(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
/* 177 */     this.Head.f_104204_ = netHeadYaw / 57.295776F;
/* 178 */     this.Head.f_104203_ = headPitch / 57.295776F;
/* 179 */     this.LeftArm.f_104203_ = Mth.m_14089_(limbSwing * 0.6662F) * limbSwingAmount;
/* 180 */     this.RightLeg.f_104203_ = Mth.m_14089_(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\client\model\Modelnxt_hertx_model.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */