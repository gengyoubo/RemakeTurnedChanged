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
/*     */ public class Modelhertx_ashbury_model<T extends Entity>
/*     */   extends EntityModel<T>
/*     */ {
/*  25 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("turned", "modelhertx_ashbury_model"), "main");
/*     */   public final ModelPart Head;
/*     */   public final ModelPart Body;
/*     */   public final ModelPart Tail;
/*     */   public final ModelPart LeftArm;
/*     */   public final ModelPart RightArm;
/*     */   public final ModelPart LeftLeg;
/*     */   public final ModelPart RightLeg;
/*     */   
/*     */   public Modelhertx_ashbury_model(ModelPart root) {
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
/*  48 */         CubeListBuilder.m_171558_().m_171514_(24, 16).m_171488_(-3.0F, -1.8268F, -5.0166F, 6.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
/*  49 */         .m_171514_(14, 57).m_171488_(-2.0F, -2.8268F, -3.0166F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(63, 9)
/*  50 */         .m_171488_(-2.0F, -6.8268F, 1.9834F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).m_171514_(54, 9)
/*  51 */         .m_171488_(-2.0F, -2.8268F, 2.9834F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(19, 8)
/*  52 */         .m_171488_(-3.0F, -2.8268F, 1.9834F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(61, 33)
/*  53 */         .m_171488_(-2.0F, -0.8268F, -1.9166F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(20, 32)
/*  54 */         .m_171488_(2.0F, -6.8268F, 1.9834F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(24, 24)
/*  55 */         .m_171488_(-3.0F, -6.8268F, 1.9834F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(19, 0)
/*  56 */         .m_171488_(-3.0F, -6.8268F, -5.0166F, 6.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).m_171514_(52, 31)
/*  57 */         .m_171488_(2.0F, -5.8268F, -5.0166F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).m_171514_(55, 50)
/*  58 */         .m_171488_(2.0F, -2.8268F, -5.0166F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).m_171514_(45, 9)
/*  59 */         .m_171488_(-3.0F, -5.8268F, -5.0166F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).m_171514_(54, 12)
/*  60 */         .m_171488_(-3.0F, -2.8268F, -5.0166F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).m_171514_(20, 16)
/*  61 */         .m_171488_(-2.0F, -5.8268F, -5.0166F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 11)
/*  62 */         .m_171488_(-2.0F, -2.8268F, -5.0166F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  63 */         PartPose.m_171419_(0.0F, -3.25F, -0.2F));
/*  64 */     PartDefinition cube_r1 = Head.m_171599_("cube_r1", 
/*  65 */         CubeListBuilder.m_171558_().m_171514_(0, 16).m_171488_(-3.125F, -8.7546F, 10.2581F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
/*  66 */         .m_171514_(21, 63).m_171488_(-3.125F, -8.7546F, 5.2581F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(7, 0)
/*  67 */         .m_171488_(2.125F, -8.7546F, 10.2581F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(9, 10)
/*  68 */         .m_171488_(2.125F, -8.7546F, 11.2581F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(19, 5)
/*  69 */         .m_171488_(-3.125F, -8.7546F, 11.2581F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(9, 63)
/*  70 */         .m_171488_(2.125F, -8.7546F, 5.2581F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), 
/*  71 */         PartPose.m_171423_(0.0F, 3.65F, 2.25F, 0.6545F, 0.0F, 0.0F));
/*  72 */     PartDefinition Body = partdefinition.m_171599_("Body", 
/*  73 */         CubeListBuilder.m_171558_().m_171514_(0, 32).m_171488_(-3.5F, 0.122F, -2.9153F, 7.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).m_171514_(0, 16)
/*  74 */         .m_171488_(-4.0F, -0.2268F, -2.0166F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(62, 20)
/*  75 */         .m_171488_(-3.97F, 8.6532F, -3.0166F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(41, 57)
/*  76 */         .m_171488_(-1.625F, -0.3518F, -3.2666F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), 
/*  77 */         PartPose.m_171419_(0.0F, -3.25F, 0.0F));
/*  78 */     PartDefinition booba = Body.m_171599_("booba", CubeListBuilder.m_171558_(), PartPose.m_171419_(0.0F, 3.65F, -0.2F));
/*  79 */     PartDefinition Body_r1 = booba.m_171599_("Body_r1", 
/*  80 */         CubeListBuilder.m_171558_().m_171514_(32, 8).m_171488_(-3.5F, -1.5F, -2.0F, 7.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), 
/*  81 */         PartPose.m_171423_(0.0F, -1.3768F, -1.4416F, -0.3927F, 0.0F, 0.0F));
/*  82 */     PartDefinition Tail = partdefinition.m_171599_("Tail", CubeListBuilder.m_171558_(), PartPose.m_171419_(0.0F, -3.25F, 0.0F));
/*  83 */     PartDefinition cube_r2 = Tail.m_171599_("cube_r2", 
/*  84 */         CubeListBuilder.m_171558_().m_171514_(24, 24).m_171488_(-1.3F, 9.7598F, 14.9821F, 3.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), 
/*  85 */         PartPose.m_171423_(0.0F, 3.25F, 0.0F, -0.3927F, 0.0F, 0.0F));
/*  86 */     PartDefinition bone = cube_r2.m_171599_("bone", 
/*  87 */         CubeListBuilder.m_171558_().m_171514_(0, 0).m_171488_(-1.0F, -6.1263F, -3.5555F, 2.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)).m_171514_(44, 31)
/*  88 */         .m_171488_(-1.0F, -7.1263F, -3.5555F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), 
/*  89 */         PartPose.m_171423_(0.2F, 11.0418F, 23.0617F, -0.7854F, 0.0F, 0.0F));
/*  90 */     PartDefinition bone2 = cube_r2.m_171599_("bone2", 
/*  91 */         CubeListBuilder.m_171558_().m_171514_(41, 64).m_171488_(-1.0F, -1.3026F, -3.1739F, 2.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
/*  92 */         .m_171514_(37, 28).m_171488_(-1.0F, -2.3026F, -2.1739F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), 
/*  93 */         PartPose.m_171423_(0.2F, 14.2637F, 23.4492F, -1.9635F, 0.0F, 0.0F));
/*  94 */     PartDefinition cube_r3 = Tail.m_171599_("cube_r3", 
/*  95 */         CubeListBuilder.m_171558_().m_171514_(0, 0).m_171488_(-1.3F, 3.0261F, 5.8026F, 3.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)).m_171514_(16, 63)
/*  96 */         .m_171488_(1.7F, 4.0261F, 10.8026F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(28, 46)
/*  97 */         .m_171488_(3.7F, 4.0261F, 12.8026F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).m_171514_(12, 40)
/*  98 */         .m_171488_(2.7F, 4.0261F, 11.8026F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).m_171514_(32, 34)
/*  99 */         .m_171488_(-4.2F, 4.0261F, 12.8026F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).m_171514_(48, 31)
/* 100 */         .m_171488_(-2.2F, 4.0261F, 10.8026F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(37, 24)
/* 101 */         .m_171488_(-3.2F, 4.0261F, 11.8026F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).m_171514_(64, 0)
/* 102 */         .m_171488_(-0.3F, 2.0261F, 7.8026F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(0, 67)
/* 103 */         .m_171488_(-0.3F, 1.0261F, 8.8026F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(51, 64)
/* 104 */         .m_171488_(-0.3F, 0.0261F, 9.8026F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(64, 50)
/* 105 */         .m_171488_(-0.3F, -0.9739F, 10.8026F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 106 */         PartPose.m_171423_(0.0F, 3.25F, 0.0F, -0.7854F, 0.0F, 0.0F));
/* 107 */     PartDefinition LeftArm = partdefinition.m_171599_("LeftArm", 
/* 108 */         CubeListBuilder.m_171558_().m_171514_(0, 51).m_171488_(-2.0F, -2.4768F, -2.0166F, 3.0F, 9.0F, 4.0F, new CubeDeformation(0.0F))
/* 109 */         .m_171514_(46, 46).m_171488_(-3.0F, 6.5232F, -2.0166F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 110 */         PartPose.m_171419_(-5.0F, -1.0F, 0.0F));
/* 111 */     PartDefinition RightArm = partdefinition.m_171599_("RightArm", 
/* 112 */         CubeListBuilder.m_171558_().m_171514_(32, 46).m_171488_(-1.75F, -2.4268F, -2.0166F, 3.0F, 9.0F, 4.0F, new CubeDeformation(0.0F))
/* 113 */         .m_171514_(46, 20).m_171488_(-1.75F, 6.5732F, -2.0166F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 114 */         PartPose.m_171419_(5.75F, -1.05F, 0.0F));
/* 115 */     PartDefinition LeftLeg = partdefinition.m_171599_("LeftLeg", 
/* 116 */         CubeListBuilder.m_171558_().m_171514_(61, 27).m_171488_(-1.875F, -1.4768F, -2.0166F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
/* 117 */         .m_171514_(51, 2).m_171488_(-1.895F, 12.0F, -2.6002F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(19, 11)
/* 118 */         .m_171488_(-0.395F, 13.0F, -3.6002F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(23, 11)
/* 119 */         .m_171488_(1.105F, 13.0F, -3.6002F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(24, 20)
/* 120 */         .m_171488_(-1.895F, 13.0F, -3.6002F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 121 */         PartPose.m_171419_(-2.125F, 10.0F, 0.0F));
/* 122 */     PartDefinition cube_r4 = LeftLeg.m_171599_("cube_r4", 
/* 123 */         CubeListBuilder.m_171558_().m_171514_(57, 58).m_171488_(-1.875F, 4.1814F, 3.2864F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 124 */         PartPose.m_171423_(0.0F, 2.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 125 */     PartDefinition cube_r5 = LeftLeg.m_171599_("cube_r5", 
/* 126 */         CubeListBuilder.m_171558_().m_171514_(36, 34).m_171488_(-1.95F, -0.7808F, -5.5808F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 127 */         PartPose.m_171423_(0.0F, 2.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
/* 128 */     PartDefinition cube_r6 = LeftLeg.m_171599_("cube_r6", 
/* 129 */         CubeListBuilder.m_171558_().m_171514_(16, 46).m_171488_(-2.0F, -2.1428F, -2.857F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(19, 0)
/* 130 */         .m_171488_(-3.0F, -0.4229F, -2.0254F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), 
/* 131 */         PartPose.m_171423_(0.0F, 2.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 132 */     PartDefinition RightLeg = partdefinition.m_171599_("RightLeg", 
/* 133 */         CubeListBuilder.m_171558_().m_171514_(28, 60).m_171488_(-2.0F, -1.4768F, -2.0166F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(38, 0)
/* 134 */         .m_171488_(-1.97F, 12.0F, -2.6002F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(27, 28)
/* 135 */         .m_171488_(1.03F, 13.0F, -3.6002F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(27, 21)
/* 136 */         .m_171488_(-1.97F, 13.0F, -3.6002F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(27, 11)
/* 137 */         .m_171488_(-0.47F, 13.0F, -3.6002F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 138 */         PartPose.m_171419_(2.0F, 10.0F, 0.0F));
/* 139 */     PartDefinition cube_r7 = RightLeg.m_171599_("cube_r7", 
/* 140 */         CubeListBuilder.m_171558_().m_171514_(58, 41).m_171488_(-2.0F, 4.1814F, 3.2864F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 141 */         PartPose.m_171423_(0.0F, 2.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 142 */     PartDefinition cube_r8 = RightLeg.m_171599_("cube_r8", 
/* 143 */         CubeListBuilder.m_171558_().m_171514_(20, 34).m_171488_(-1.925F, -0.7808F, -5.5808F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 144 */         PartPose.m_171423_(0.0F, 2.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
/* 145 */     PartDefinition cube_r9 = RightLeg.m_171599_("cube_r9", 
/* 146 */         CubeListBuilder.m_171558_().m_171514_(0, 40).m_171488_(-1.875F, -2.1428F, -2.857F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 147 */         PartPose.m_171423_(0.0F, 2.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 148 */     return LayerDefinition.m_171565_(meshdefinition, 80, 80);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void m_7695_(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 154 */     this.Head.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 155 */     this.Body.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 156 */     this.Tail.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 157 */     this.LeftArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 158 */     this.RightArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 159 */     this.LeftLeg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 160 */     this.RightLeg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */   
/*     */   public void m_6973_(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
/* 164 */     this.RightArm.f_104203_ = Mth.m_14089_(limbSwing * 0.6662F + 3.1415927F) * limbSwingAmount;
/* 165 */     this.LeftLeg.f_104203_ = Mth.m_14089_(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
/* 166 */     this.Head.f_104204_ = netHeadYaw / 57.295776F;
/* 167 */     this.Head.f_104203_ = headPitch / 57.295776F;
/* 168 */     this.LeftArm.f_104203_ = Mth.m_14089_(limbSwing * 0.6662F) * limbSwingAmount;
/* 169 */     this.RightLeg.f_104203_ = Mth.m_14089_(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\client\model\Modelhertx_ashbury_model.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */