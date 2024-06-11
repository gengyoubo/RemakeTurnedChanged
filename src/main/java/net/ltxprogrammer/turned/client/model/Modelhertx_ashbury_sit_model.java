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
/*     */ import net.minecraft.world.entity.Entity;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Modelhertx_ashbury_sit_model<T extends Entity>
/*     */   extends EntityModel<T>
/*     */ {
/*  24 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("turned", "modelhertx_ashbury_sit_model"), "main");
/*     */   
/*     */   public final ModelPart Head;
/*     */   public final ModelPart Body;
/*     */   public final ModelPart Tail;
/*     */   public final ModelPart LeftArm;
/*     */   public final ModelPart RightArm;
/*     */   public final ModelPart LeftLeg;
/*     */   public final ModelPart RightLeg;
/*     */   
/*     */   public Modelhertx_ashbury_sit_model(ModelPart root) {
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
/*  48 */         CubeListBuilder.m_171558_().m_171514_(24, 16).m_171488_(-3.0F, -1.5768F, -5.0166F, 6.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
/*  49 */         .m_171514_(14, 57).m_171488_(-2.0F, -2.5768F, -3.0166F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(63, 9)
/*  50 */         .m_171488_(-2.0F, -6.5768F, 1.9834F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).m_171514_(54, 9)
/*  51 */         .m_171488_(-2.0F, -2.5768F, 2.9834F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(19, 8)
/*  52 */         .m_171488_(-3.0F, -2.5768F, 1.9834F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(61, 33)
/*  53 */         .m_171488_(-2.0F, -0.5768F, -1.9166F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(20, 32)
/*  54 */         .m_171488_(2.0F, -6.5768F, 1.9834F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(24, 24)
/*  55 */         .m_171488_(-3.0F, -6.5768F, 1.9834F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(19, 0)
/*  56 */         .m_171488_(-3.0F, -6.5768F, -5.0166F, 6.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).m_171514_(52, 31)
/*  57 */         .m_171488_(2.0F, -5.5768F, -5.0166F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).m_171514_(55, 50)
/*  58 */         .m_171488_(2.0F, -2.5768F, -5.0166F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).m_171514_(45, 9)
/*  59 */         .m_171488_(-3.0F, -5.5768F, -5.0166F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).m_171514_(54, 12)
/*  60 */         .m_171488_(-3.0F, -2.5768F, -5.0166F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).m_171514_(20, 16)
/*  61 */         .m_171488_(-2.0F, -5.5768F, -5.0166F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 11)
/*  62 */         .m_171488_(-2.0F, -2.5768F, -5.0166F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  63 */         PartPose.m_171419_(0.0F, 9.75F, 5.8F));
/*  64 */     PartDefinition cube_r1 = Head.m_171599_("cube_r1", 
/*  65 */         CubeListBuilder.m_171558_().m_171514_(0, 16).m_171488_(-3.125F, 5.4099F, 6.9521F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(21, 63)
/*  66 */         .m_171488_(-3.125F, 5.4099F, 1.9521F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(7, 0)
/*  67 */         .m_171488_(2.125F, 5.4099F, 6.9521F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(9, 10)
/*  68 */         .m_171488_(2.125F, 5.4099F, 7.9521F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(19, 5)
/*  69 */         .m_171488_(-3.125F, 5.4099F, 7.9521F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(9, 63)
/*  70 */         .m_171488_(2.125F, 5.4099F, 1.9521F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), 
/*  71 */         PartPose.m_171423_(0.0F, -9.35F, -3.75F, 0.6545F, 0.0F, 0.0F));
/*  72 */     PartDefinition Body = partdefinition.m_171599_("Body", 
/*  73 */         CubeListBuilder.m_171558_().m_171514_(0, 32).m_171488_(-3.5F, 10.0673F, 7.6985F, 7.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).m_171514_(0, 16)
/*  74 */         .m_171488_(-4.0F, 9.7185F, 8.5972F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(62, 20)
/*  75 */         .m_171488_(-3.97F, 18.5985F, 7.5972F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(41, 57)
/*  76 */         .m_171488_(-1.625F, 9.5935F, 7.3472F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), 
/*  77 */         PartPose.m_171423_(0.0F, -3.25F, 0.0F, -0.3927F, 0.0F, 0.0F));
/*  78 */     PartDefinition booba = Body.m_171599_("booba", CubeListBuilder.m_171558_(), PartPose.m_171419_(0.0F, 3.65F, -0.2F));
/*  79 */     PartDefinition Body_r1 = booba.m_171599_("Body_r1", 
/*  80 */         CubeListBuilder.m_171558_().m_171514_(32, 8).m_171488_(-3.5F, 3.6265F, 11.6118F, 7.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), 
/*  81 */         PartPose.m_171423_(0.0F, -1.3768F, -1.4416F, -0.3927F, 0.0F, 0.0F));
/*  82 */     PartDefinition Tail = partdefinition.m_171599_("Tail", CubeListBuilder.m_171558_(), 
/*  83 */         PartPose.m_171423_(0.0F, 20.75F, 3.0F, 0.7854F, 0.0F, 0.0F));
/*  84 */     PartDefinition cube_r2 = Tail.m_171599_("cube_r2", 
/*  85 */         CubeListBuilder.m_171558_().m_171514_(24, 24).m_171488_(-1.3F, 19.0976F, 20.0755F, 3.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), 
/*  86 */         PartPose.m_171423_(0.0F, -17.8865F, -2.2909F, -0.3927F, 0.0F, 0.0F));
/*  87 */     PartDefinition bone = cube_r2.m_171599_("bone", 
/*  88 */         CubeListBuilder.m_171558_().m_171514_(0, 0).m_171488_(-1.0F, -3.125F, 6.6489F, 2.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)).m_171514_(44, 31)
/*  89 */         .m_171488_(-1.0F, -4.125F, 6.6489F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), 
/*  90 */         PartPose.m_171423_(0.2F, 11.0418F, 23.0617F, -0.7854F, 0.0F, 0.0F));
/*  91 */     PartDefinition bone2 = cube_r2.m_171599_("bone2", 
/*  92 */         CubeListBuilder.m_171558_().m_171514_(41, 64).m_171488_(-1.0F, -9.5817F, 3.5039F, 2.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).m_171514_(37, 28)
/*  93 */         .m_171488_(-1.0F, -10.5817F, 4.5039F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), 
/*  94 */         PartPose.m_171423_(0.2F, 14.2637F, 23.4492F, -1.9635F, 0.0F, 0.0F));
/*  95 */     PartDefinition cube_r3 = Tail.m_171599_("cube_r3", 
/*  96 */         CubeListBuilder.m_171558_().m_171514_(0, 0).m_171488_(-1.3F, 9.704F, 14.0817F, 3.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)).m_171514_(16, 63)
/*  97 */         .m_171488_(1.7F, 10.704F, 19.0817F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(28, 46)
/*  98 */         .m_171488_(3.7F, 10.704F, 21.0817F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).m_171514_(12, 40)
/*  99 */         .m_171488_(2.7F, 10.704F, 20.0817F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).m_171514_(32, 34)
/* 100 */         .m_171488_(-4.2F, 10.704F, 21.0817F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).m_171514_(48, 31)
/* 101 */         .m_171488_(-2.2F, 10.704F, 19.0817F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(37, 24)
/* 102 */         .m_171488_(-3.2F, 10.704F, 20.0817F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).m_171514_(64, 0)
/* 103 */         .m_171488_(-0.3F, 8.704F, 16.0817F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(0, 67)
/* 104 */         .m_171488_(-0.3F, 7.704F, 17.0817F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(51, 64)
/* 105 */         .m_171488_(-0.3F, 6.704F, 18.0817F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(64, 50)
/* 106 */         .m_171488_(-0.3F, 5.704F, 19.0817F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 107 */         PartPose.m_171423_(0.0F, -17.8865F, -2.2909F, -0.7854F, 0.0F, 0.0F));
/* 108 */     PartDefinition LeftArm = partdefinition.m_171599_("LeftArm", 
/* 109 */         CubeListBuilder.m_171558_().m_171514_(0, 51).m_171488_(-2.0F, 10.9693F, -3.9049F, 3.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(46, 46)
/* 110 */         .m_171488_(-3.0F, 19.9693F, -3.9049F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 111 */         PartPose.m_171423_(-5.0F, -1.0F, 0.0F, 0.5236F, 0.0F, 0.0F));
/* 112 */     PartDefinition RightArm = partdefinition.m_171599_("RightArm", 
/* 113 */         CubeListBuilder.m_171558_().m_171514_(32, 46).m_171488_(-1.75F, 9.1059F, -3.5243F, 3.0F, 9.0F, 4.0F, new CubeDeformation(0.0F))
/* 114 */         .m_171514_(46, 20).m_171488_(-1.75F, 18.1059F, -3.5243F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 115 */         PartPose.m_171423_(5.75F, 0.95F, 0.0F, 0.5236F, 0.0F, 0.0F));
/* 116 */     PartDefinition LeftLeg = partdefinition.m_171599_("LeftLeg", 
/* 117 */         CubeListBuilder.m_171558_().m_171514_(61, 27).m_171488_(-4.8871F, -3.866F, 7.9834F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
/* 118 */         .m_171514_(51, 2).m_171488_(-4.9071F, 9.6108F, 7.3998F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(19, 11)
/* 119 */         .m_171488_(-3.4071F, 10.6108F, 6.3998F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(23, 11)
/* 120 */         .m_171488_(-1.9071F, 10.6108F, 6.3998F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(24, 20)
/* 121 */         .m_171488_(-4.9071F, 10.6108F, 6.3998F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 122 */         PartPose.m_171423_(-2.125F, 10.0F, 0.0F, -1.7453F, 0.2618F, -0.2618F));
/* 123 */     PartDefinition cube_r4 = LeftLeg.m_171599_("cube_r4", 
/* 124 */         CubeListBuilder.m_171558_().m_171514_(57, 58).m_171488_(-4.8871F, -1.8528F, 11.6109F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 125 */         PartPose.m_171423_(0.0F, 2.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 126 */     PartDefinition cube_r5 = LeftLeg.m_171599_("cube_r5", 
/* 127 */         CubeListBuilder.m_171558_().m_171514_(36, 34).m_171488_(-4.9621F, 4.6009F, 3.1797F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 128 */         PartPose.m_171423_(0.0F, 2.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
/* 129 */     PartDefinition cube_r6 = LeftLeg.m_171599_("cube_r6", 
/* 130 */         CubeListBuilder.m_171558_().m_171514_(16, 46).m_171488_(-5.0121F, -8.177F, 5.4675F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F))
/* 131 */         .m_171514_(19, 0).m_171488_(-6.0121F, -6.4571F, 6.2991F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), 
/* 132 */         PartPose.m_171423_(0.0F, 2.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 133 */     PartDefinition RightLeg = partdefinition.m_171599_("RightLeg", 
/* 134 */         CubeListBuilder.m_171558_().m_171514_(28, 60).m_171488_(1.0121F, -3.866F, 7.9834F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(38, 0)
/* 135 */         .m_171488_(1.0421F, 9.6108F, 7.3998F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(27, 28)
/* 136 */         .m_171488_(4.0421F, 10.6108F, 6.3998F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(27, 21)
/* 137 */         .m_171488_(1.0421F, 10.6108F, 6.3998F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(27, 11)
/* 138 */         .m_171488_(2.5421F, 10.6108F, 6.3998F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 139 */         PartPose.m_171423_(2.0F, 10.0F, 0.0F, -1.7453F, -0.2618F, 0.2618F));
/* 140 */     PartDefinition cube_r7 = RightLeg.m_171599_("cube_r7", 
/* 141 */         CubeListBuilder.m_171558_().m_171514_(58, 41).m_171488_(1.0121F, -1.8528F, 11.6109F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 142 */         PartPose.m_171423_(0.0F, 2.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 143 */     PartDefinition cube_r8 = RightLeg.m_171599_("cube_r8", 
/* 144 */         CubeListBuilder.m_171558_().m_171514_(20, 34).m_171488_(1.0871F, 4.6009F, 3.1797F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 145 */         PartPose.m_171423_(0.0F, 2.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
/* 146 */     PartDefinition cube_r9 = RightLeg.m_171599_("cube_r9", 
/* 147 */         CubeListBuilder.m_171558_().m_171514_(0, 40).m_171488_(1.1371F, -8.177F, 5.4675F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 148 */         PartPose.m_171423_(0.0F, 2.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 149 */     return LayerDefinition.m_171565_(meshdefinition, 80, 80);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void m_7695_(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 155 */     this.Head.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 156 */     this.Body.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 157 */     this.Tail.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 158 */     this.LeftArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 159 */     this.RightArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 160 */     this.LeftLeg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 161 */     this.RightLeg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */   
/*     */   public void m_6973_(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
/* 165 */     this.Head.f_104204_ = netHeadYaw / 57.295776F;
/* 166 */     this.Head.f_104203_ = headPitch / 57.295776F;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\client\model\Modelhertx_ashbury_sit_model.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */