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
/*     */ public class ModelSlimeling_tamed_remaster<T extends Entity>
/*     */   extends EntityModel<T>
/*     */ {
/*  25 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("turned", "model_slimeling_tamed_remaster"), "main");
/*     */   
/*     */   public final ModelPart RightLeg;
/*     */   public final ModelPart LeftLeg;
/*     */   public final ModelPart RightArm;
/*     */   public final ModelPart LeftArm;
/*     */   public final ModelPart Body;
/*     */   public final ModelPart Head;
/*     */   
/*     */   public ModelSlimeling_tamed_remaster(ModelPart root) {
/*  35 */     this.RightLeg = root.m_171324_("RightLeg");
/*  36 */     this.LeftLeg = root.m_171324_("LeftLeg");
/*  37 */     this.RightArm = root.m_171324_("RightArm");
/*  38 */     this.LeftArm = root.m_171324_("LeftArm");
/*  39 */     this.Body = root.m_171324_("Body");
/*  40 */     this.Head = root.m_171324_("Head");
/*     */   }
/*     */   
/*     */   public static LayerDefinition createBodyLayer() {
/*  44 */     MeshDefinition meshdefinition = new MeshDefinition();
/*  45 */     PartDefinition partdefinition = meshdefinition.m_171576_();
/*  46 */     PartDefinition RightLeg = partdefinition.m_171599_("RightLeg", 
/*  47 */         CubeListBuilder.m_171558_().m_171514_(61, 0).m_171488_(-0.75F, 11.9896F, -2.7744F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
/*  48 */         .m_171514_(8, 50).m_171488_(-0.75F, 12.9896F, -3.7744F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  49 */         PartPose.m_171419_(2.0F, 9.0F, 0.0F));
/*  50 */     PartDefinition cube_r11 = RightLeg.m_171599_("cube_r11", 
/*  51 */         CubeListBuilder.m_171558_().m_171514_(47, 58).m_171488_(-2.0F, -1.0F, -1.0F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/*  52 */         PartPose.m_171423_(1.25F, 10.0398F, 2.347F, -0.7854F, 0.0F, 0.0F));
/*  53 */     PartDefinition cube_r12 = RightLeg.m_171599_("cube_r12", 
/*  54 */         CubeListBuilder.m_171558_().m_171514_(24, 55).m_171488_(-2.0F, 0.0F, -2.0F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  55 */         PartPose.m_171423_(1.625F, 7.6F, 0.0F, 0.3927F, 0.0F, 0.0F));
/*  56 */     PartDefinition cube_r13 = RightLeg.m_171599_("cube_r13", 
/*  57 */         CubeListBuilder.m_171558_().m_171514_(56, 6).m_171488_(-1.625F, -4.0F, -2.375F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), 
/*  58 */         PartPose.m_171423_(1.0F, 2.85F, 0.0F, -0.0436F, 0.0F, 0.0F));
/*  59 */     PartDefinition cube_r14 = RightLeg.m_171599_("cube_r14", 
/*  60 */         CubeListBuilder.m_171558_().m_171514_(0, 40).m_171488_(-1.625F, -3.0F, -2.375F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), 
/*  61 */         PartPose.m_171423_(0.375F, 2.475F, 0.0F, -0.0436F, 0.0F, 0.0F));
/*  62 */     PartDefinition cube_r15 = RightLeg.m_171599_("cube_r15", 
/*  63 */         CubeListBuilder.m_171558_().m_171514_(18, 43).m_171488_(0.375F, -5.0F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  64 */         PartPose.m_171423_(-1.25F, 5.6F, 0.0F, -0.1309F, 0.0F, 0.0F));
/*  65 */     PartDefinition LeftLeg = partdefinition.m_171599_("LeftLeg", 
/*  66 */         CubeListBuilder.m_171558_().m_171514_(56, 40).m_171488_(-3.25F, 11.9896F, -2.7744F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
/*  67 */         .m_171514_(47, 18).m_171488_(-3.25F, 12.9896F, -3.7744F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  68 */         PartPose.m_171419_(-2.0F, 9.0F, 0.0F));
/*  69 */     PartDefinition cube_r6 = LeftLeg.m_171599_("cube_r6", 
/*  70 */         CubeListBuilder.m_171558_().m_171514_(52, 18).m_171488_(-1.375F, -4.0F, -2.375F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), 
/*  71 */         PartPose.m_171423_(-1.0F, 2.85F, 0.0F, -0.0436F, 0.0F, 0.0F));
/*  72 */     PartDefinition cube_r7 = LeftLeg.m_171599_("cube_r7", 
/*  73 */         CubeListBuilder.m_171558_().m_171514_(54, 31).m_171488_(-2.0F, -1.0F, -1.0F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/*  74 */         PartPose.m_171423_(-1.25F, 10.0398F, 2.347F, -0.7854F, 0.0F, 0.0F));
/*  75 */     PartDefinition cube_r8 = LeftLeg.m_171599_("cube_r8", 
/*  76 */         CubeListBuilder.m_171558_().m_171514_(10, 55).m_171488_(-1.0F, 0.0F, -2.0F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  77 */         PartPose.m_171423_(-1.625F, 7.6F, 0.0F, 0.3927F, 0.0F, 0.0F));
/*  78 */     PartDefinition cube_r9 = LeftLeg.m_171599_("cube_r9", 
/*  79 */         CubeListBuilder.m_171558_().m_171514_(34, 17).m_171488_(-2.375F, -3.0F, -2.375F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), 
/*  80 */         PartPose.m_171423_(-0.375F, 2.475F, 0.0F, -0.0436F, 0.0F, 0.0F));
/*  81 */     PartDefinition cube_r10 = LeftLeg.m_171599_("cube_r10", 
/*  82 */         CubeListBuilder.m_171558_().m_171514_(38, 28).m_171488_(-4.375F, -5.0F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  83 */         PartPose.m_171423_(1.25F, 5.6F, 0.0F, -0.1309F, 0.0F, 0.0F));
/*  84 */     PartDefinition RightArm = partdefinition.m_171599_("RightArm", 
/*  85 */         CubeListBuilder.m_171558_().m_171514_(35, 61).m_171488_(-1.1736F, -1.4152F, -1.5F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/*  86 */         PartPose.m_171423_(5.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1745F));
/*  87 */     PartDefinition wrist_r = RightArm.m_171599_("wrist_r", 
/*  88 */         CubeListBuilder.m_171558_().m_171514_(14, 27).m_171488_(-1.3F, 7.3F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(27, 17)
/*  89 */         .m_171488_(0.7F, 7.3F, 1.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 30)
/*  90 */         .m_171488_(0.7F, 7.3F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(14, 30)
/*  91 */         .m_171488_(0.7F, 7.3F, -1.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(34, 48)
/*  92 */         .m_171488_(-1.3F, 0.3F, -1.8F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  93 */         PartPose.m_171419_(0.1263F, 4.2848F, -0.2F));
/*  94 */     PartDefinition LeftArm = partdefinition.m_171599_("LeftArm", 
/*  95 */         CubeListBuilder.m_171558_().m_171514_(0, 61).m_171488_(-1.8264F, -1.4152F, -1.5F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/*  96 */         PartPose.m_171423_(-5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1745F));
/*  97 */     PartDefinition wrist_l = LeftArm.m_171599_("wrist_l", 
/*  98 */         CubeListBuilder.m_171558_().m_171514_(45, 0).m_171488_(-2.7F, 0.3F, -1.8F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(0, 27)
/*  99 */         .m_171488_(0.3F, 7.3F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(21, 13)
/* 100 */         .m_171488_(-2.7F, 7.3F, -1.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 18)
/* 101 */         .m_171488_(-2.7F, 7.3F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(4, 0)
/* 102 */         .m_171488_(-2.7F, 7.3F, 1.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 103 */         PartPose.m_171419_(-0.1263F, 4.2848F, -0.2F));
/* 104 */     PartDefinition Body = partdefinition.m_171599_("Body", 
/* 105 */         CubeListBuilder.m_171558_().m_171514_(19, 0).m_171488_(-4.0F, 1.6F, -2.5F, 8.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(61, 58)
/* 106 */         .m_171488_(-2.0F, -0.9F, -1.375F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).m_171514_(0, 27)
/* 107 */         .m_171488_(2.0F, -0.4F, -3.875F, 3.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)).m_171514_(0, 50)
/* 108 */         .m_171488_(5.0F, 0.6F, -2.875F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(48, 42)
/* 109 */         .m_171488_(-6.0F, 0.6F, -2.875F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(50, 51)
/* 110 */         .m_171488_(-3.0F, 0.85F, -3.375F, 6.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(20, 19)
/* 111 */         .m_171488_(-5.0F, -0.4F, -3.875F, 3.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)).m_171514_(50, 25)
/* 112 */         .m_171488_(-4.0F, 0.35F, 2.0F, 8.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(47, 13)
/* 113 */         .m_171488_(-3.5F, 12.6F, -1.875F, 7.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(25, 10)
/* 114 */         .m_171488_(-3.5F, 10.6F, -2.0F, 7.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(34, 40)
/* 115 */         .m_171488_(-3.0F, 6.6F, -2.0F, 6.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 116 */         PartPose.m_171419_(0.0F, -3.0F, 0.0F));
/* 117 */     PartDefinition cube_r2 = Body.m_171599_("cube_r2", 
/* 118 */         CubeListBuilder.m_171558_().m_171514_(62, 46).m_171488_(-3.0F, -3.0F, 1.0F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 119 */         PartPose.m_171423_(0.5F, 5.4422F, 0.6788F, -0.4363F, 0.0F, 0.0F));
/* 120 */     PartDefinition cube_r3 = Body.m_171599_("cube_r3", 
/* 121 */         CubeListBuilder.m_171558_().m_171514_(61, 63).m_171488_(-3.0F, -3.0F, 1.0F, 5.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 122 */         PartPose.m_171423_(0.5F, 9.1922F, 0.4288F, 0.1745F, 0.0F, 0.0F));
/* 123 */     PartDefinition Tail = Body.m_171599_("Tail", CubeListBuilder.m_171558_(), PartPose.m_171419_(0.0F, 2.6F, 0.0F));
/* 124 */     PartDefinition cube_r4 = Tail.m_171599_("cube_r4", 
/* 125 */         CubeListBuilder.m_171558_().m_171514_(0, 0).m_171488_(-2.0F, -0.875F, -5.375F, 4.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), 
/* 126 */         PartPose.m_171423_(0.0F, 17.3866F, 11.9212F, -0.5236F, 0.0F, 0.0F));
/* 127 */     PartDefinition cube_r5 = Tail.m_171599_("cube_r5", 
/* 128 */         CubeListBuilder.m_171558_().m_171514_(14, 32).m_171488_(-2.0F, 5.0F, 8.0F, 4.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), 
/* 129 */         PartPose.m_171423_(0.0F, -1.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
/* 130 */     PartDefinition Head = partdefinition.m_171599_("Head", 
/* 131 */         CubeListBuilder.m_171558_().m_171514_(0, 13).m_171488_(-3.5F, -5.4F, -3.5F, 7.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), 
/* 132 */         PartPose.m_171419_(0.0F, -4.0F, 0.0F));
/* 133 */     PartDefinition Ears = Head.m_171599_("Ears", CubeListBuilder.m_171558_(), PartPose.m_171419_(0.0F, 1.6F, 0.0F));
/* 134 */     PartDefinition cube_r1 = Ears.m_171599_("cube_r1", 
/* 135 */         CubeListBuilder.m_171558_().m_171514_(6, 8).m_171488_(3.5F, -11.0F, 1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(6, 2)
/* 136 */         .m_171488_(3.5F, -9.0F, 1.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(12, 64)
/* 137 */         .m_171488_(3.5F, -12.0F, -0.5F, 1.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(0, 13)
/* 138 */         .m_171488_(3.5F, -6.0F, 1.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(19, 0)
/* 139 */         .m_171488_(-4.5F, -11.0F, 1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(6, 5)
/* 140 */         .m_171488_(-4.5F, -9.0F, 1.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(21, 15)
/* 141 */         .m_171488_(-4.5F, -6.0F, 1.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(0, 0).m_171488_(-4.5F, -12.0F, -0.5F, 1.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), 
/*     */         
/* 143 */         PartPose.m_171423_(0.0F, 0.0F, 0.0F, 0.3927F, 0.0F, 0.0F));
/* 144 */     return LayerDefinition.m_171565_(meshdefinition, 80, 80);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void m_7695_(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 150 */     this.RightLeg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 151 */     this.LeftLeg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 152 */     this.RightArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 153 */     this.LeftArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 154 */     this.Body.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 155 */     this.Head.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */   
/*     */   public void m_6973_(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
/* 159 */     this.LeftLeg.f_104203_ = Mth.m_14089_(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
/* 160 */     this.RightArm.f_104203_ = Mth.m_14089_(limbSwing * 0.6662F + 3.1415927F) * limbSwingAmount;
/* 161 */     this.Head.f_104204_ = netHeadYaw / 57.295776F;
/* 162 */     this.Head.f_104203_ = headPitch / 57.295776F;
/* 163 */     this.RightLeg.f_104203_ = Mth.m_14089_(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
/* 164 */     this.LeftArm.f_104203_ = Mth.m_14089_(limbSwing * 0.6662F) * limbSwingAmount;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\client\model\ModelSlimeling_tamed_remaster.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */