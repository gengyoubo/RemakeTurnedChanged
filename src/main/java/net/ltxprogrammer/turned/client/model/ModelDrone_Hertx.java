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
/*     */ public class ModelDrone_Hertx<T extends Entity>
/*     */   extends EntityModel<T> {
/*  20 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("turned", "model_drone_hertx"), "main");
/*     */   public final ModelPart Head;
/*     */   public final ModelPart Body;
/*     */   public final ModelPart Tail;
/*     */   public final ModelPart RightArm;
/*     */   public final ModelPart LeftArm;
/*     */   public final ModelPart RightLeg;
/*     */   public final ModelPart LeftLeg;
/*     */   
/*     */   public ModelDrone_Hertx(ModelPart root) {
/*  30 */     this.Head = root.m_171324_("Head");
/*  31 */     this.Body = root.m_171324_("Body");
/*  32 */     this.Tail = root.m_171324_("Tail");
/*  33 */     this.RightArm = root.m_171324_("RightArm");
/*  34 */     this.LeftArm = root.m_171324_("LeftArm");
/*  35 */     this.RightLeg = root.m_171324_("RightLeg");
/*  36 */     this.LeftLeg = root.m_171324_("LeftLeg");
/*     */   }
/*     */   
/*     */   public static LayerDefinition createBodyLayer() {
/*  40 */     MeshDefinition meshdefinition = new MeshDefinition();
/*  41 */     PartDefinition partdefinition = meshdefinition.m_171576_();
/*     */     
/*  43 */     PartDefinition Head = partdefinition.m_171599_("Head", CubeListBuilder.m_171558_().m_171514_(15, 0).m_171488_(-3.0F, -1.3F, -5.0F, 6.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
/*  44 */         .m_171514_(34, 0).m_171488_(-2.0F, -2.4F, -3.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
/*  45 */         .m_171514_(0, 59).m_171488_(-2.0F, -6.4F, 2.0F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
/*  46 */         .m_171514_(16, 23).m_171488_(-1.5F, -6.9F, -4.5F, 3.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
/*  47 */         .m_171514_(15, 8).m_171488_(-2.0F, -2.4F, 3.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
/*  48 */         .m_171514_(32, 14).m_171488_(-3.0F, -2.4F, 2.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
/*  49 */         .m_171514_(32, 8).m_171488_(-3.0F, -0.275F, -2.275F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
/*  50 */         .m_171514_(15, 5).m_171488_(-1.0F, -0.15F, -2.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
/*  51 */         .m_171514_(15, 0).m_171488_(2.0F, -6.4F, 2.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
/*  52 */         .m_171514_(0, 13).m_171488_(-3.0F, -6.4F, 2.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
/*  53 */         .m_171514_(0, 13).m_171488_(-3.0F, -6.4F, -5.0F, 6.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
/*  54 */         .m_171514_(47, 7).m_171488_(2.0F, -5.4F, -5.0F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F))
/*  55 */         .m_171514_(47, 28).m_171488_(2.0F, -2.3F, -5.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
/*  56 */         .m_171514_(46, 38).m_171488_(-3.0F, -5.4F, -5.0F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F))
/*  57 */         .m_171514_(28, 55).m_171488_(-3.0F, -2.3F, -5.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
/*  58 */         .m_171514_(30, 27).m_171488_(-2.0F, -5.4F, -5.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
/*  59 */         .m_171514_(20, 21).m_171488_(-2.0F, -2.3F, -5.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(0.0F, -2.0F, -0.2F));
/*     */     
/*  61 */     PartDefinition Antenna = Head.m_171599_("Antenna", CubeListBuilder.m_171558_(), PartPose.m_171419_(0.0F, -6.1528F, 3.0874F));
/*     */     
/*  63 */     PartDefinition cube_r1 = Antenna.m_171599_("cube_r1", CubeListBuilder.m_171558_().m_171514_(56, 53).m_171488_(0.0F, -2.75F, -1.25F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
/*  64 */         .m_171514_(37, 55).m_171488_(-6.5F, -2.75F, -1.25F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
/*  65 */         .m_171514_(0, 0).m_171488_(-6.5F, -3.75F, -5.25F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
/*  66 */         .m_171514_(55, 60).m_171488_(0.0F, -3.75F, -5.25F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(2.75F, 0.3511F, 2.7389F, 1.3526F, 0.0F, 0.0F));
/*     */     
/*  68 */     PartDefinition Body = partdefinition.m_171599_("Body", CubeListBuilder.m_171558_().m_171514_(0, 21).m_171488_(-4.0F, 0.2F, -2.0F, 8.0F, 6.0F, 4.0F, new CubeDeformation(0.0F))
/*  69 */         .m_171514_(0, 32).m_171488_(-4.0F, 10.2F, -2.0F, 8.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
/*  70 */         .m_171514_(30, 19).m_171488_(-3.625F, 6.2F, -2.0F, 7.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(0.0F, -2.0F, 0.0F));
/*     */     
/*  72 */     PartDefinition Tail = partdefinition.m_171599_("Tail", CubeListBuilder.m_171558_(), PartPose.m_171419_(0.0F, 10.0F, 0.0F));
/*     */     
/*  74 */     PartDefinition cube_r2 = Tail.m_171599_("cube_r2", CubeListBuilder.m_171558_().m_171514_(0, 6).m_171488_(-1.25F, 10.3026F, 24.6391F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
/*  75 */         .m_171514_(0, 1).m_171488_(-0.25F, 10.8026F, 25.6391F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
/*  76 */         .m_171514_(0, 0).m_171488_(1.75F, 10.8026F, 25.6391F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
/*  77 */         .m_171514_(6, 0).m_171488_(-0.25F, 12.8026F, 25.6391F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
/*  78 */         .m_171514_(6, 1).m_171488_(1.75F, 12.8026F, 25.6391F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
/*  79 */         .m_171514_(19, 8).m_171488_(-0.25F, 11.3026F, 15.6391F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-0.75F, -10.3628F, -1.0141F, -0.3927F, 0.0F, 0.0F));
/*     */     
/*  81 */     PartDefinition cube_r3 = Tail.m_171599_("cube_r3", CubeListBuilder.m_171558_().m_171514_(0, 0).m_171488_(-0.25F, 4.2F, 7.0F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-0.75F, -9.2F, 0.0F, -0.7854F, 0.0F, 0.0F));
/*     */     
/*  83 */     PartDefinition LeftArm = partdefinition.m_171599_("LeftArm", CubeListBuilder.m_171558_().m_171514_(52, 17).m_171488_(-2.0F, -1.8F, -2.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F))
/*  84 */         .m_171514_(47, 59).m_171488_(-1.0F, -2.8F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
/*  85 */         .m_171514_(24, 32).m_171488_(-3.0F, 5.2F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F))
/*  86 */         .m_171514_(32, 10).m_171488_(-3.0F, 11.2F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
/*  87 */         .m_171514_(32, 8).m_171488_(-3.0F, 11.2F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
/*  88 */         .m_171514_(29, 20).m_171488_(-1.0F, 11.2F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
/*  89 */         .m_171514_(0, 31).m_171488_(-3.0F, 11.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-5.0F, 1.0F, 0.125F, 0.0F, 0.0F, 0.0436F));
/*     */     
/*  91 */     PartDefinition RightArm = partdefinition.m_171599_("RightArm", CubeListBuilder.m_171558_().m_171514_(14, 52).m_171488_(-1.0F, -1.8F, -2.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F))
/*  92 */         .m_171514_(56, 9).m_171488_(-1.0F, -2.8F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
/*  93 */         .m_171514_(0, 38).m_171488_(-1.0F, 5.2F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F))
/*  94 */         .m_171514_(26, 19).m_171488_(0.0F, 11.2F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
/*  95 */         .m_171514_(6, 0).m_171488_(2.0F, 11.2F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
/*  96 */         .m_171514_(0, 0).m_171488_(2.0F, 11.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
/*  97 */         .m_171514_(20, 23).m_171488_(2.0F, 11.2F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(5.0F, 1.0F, 0.125F, 0.0F, 0.0F, -0.0436F));
/*     */     
/*  99 */     PartDefinition LeftLeg = partdefinition.m_171599_("LeftLeg", CubeListBuilder.m_171558_().m_171514_(58, 45).m_171488_(-2.0F, -0.8F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
/* 100 */         .m_171514_(36, 27).m_171488_(-2.375F, 10.0F, -2.9102F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
/* 101 */         .m_171514_(3, 17).m_171488_(0.625F, 11.0F, -3.9102F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
/* 102 */         .m_171514_(19, 13).m_171488_(-2.375F, 11.0F, -3.9102F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(-2.0F, 11.0F, 0.0F));
/*     */     
/* 104 */     PartDefinition cube_r4 = LeftLeg.m_171599_("cube_r4", CubeListBuilder.m_171558_().m_171514_(55, 36).m_171488_(-2.0F, 4.3F, 3.0F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-0.25F, 1.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/*     */     
/* 106 */     PartDefinition cube_r5 = LeftLeg.m_171599_("cube_r5", CubeListBuilder.m_171558_().m_171514_(0, 48).m_171488_(-3.5625F, -3.5F, -2.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(1.8125F, 6.0735F, -0.1237F, 0.7418F, 0.0F, 0.0F));
/*     */     
/* 108 */     PartDefinition cube_r6 = LeftLeg.m_171599_("cube_r6", CubeListBuilder.m_171558_().m_171514_(16, 42).m_171488_(-2.0F, -0.6F, -2.2F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-0.125F, 1.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/*     */     
/* 110 */     PartDefinition RightLeg = partdefinition.m_171599_("RightLeg", CubeListBuilder.m_171558_().m_171514_(56, 28).m_171488_(-2.0F, -0.8F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
/* 111 */         .m_171514_(35, 37).m_171488_(-1.625F, 10.0F, -2.9102F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
/* 112 */         .m_171514_(23, 13).m_171488_(1.375F, 11.0F, -3.9102F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
/* 113 */         .m_171514_(0, 21).m_171488_(-1.625F, 11.0F, -3.9102F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(2.0F, 11.0F, 0.0F));
/*     */     
/* 115 */     PartDefinition cube_r7 = RightLeg.m_171599_("cube_r7", CubeListBuilder.m_171558_().m_171514_(56, 0).m_171488_(-2.0F, 4.3F, 3.0F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.25F, 1.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/*     */     
/* 117 */     PartDefinition cube_r8 = RightLeg.m_171599_("cube_r8", CubeListBuilder.m_171558_().m_171514_(48, 48).m_171488_(0.5625F, -3.5F, -2.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-1.9375F, 6.0735F, -0.1237F, 0.7418F, 0.0F, 0.0F));
/*     */     
/* 119 */     PartDefinition cube_r9 = RightLeg.m_171599_("cube_r9", CubeListBuilder.m_171558_().m_171514_(32, 45).m_171488_(-2.0F, -0.6F, -2.2F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.125F, 1.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/*     */     
/* 121 */     return LayerDefinition.m_171565_(meshdefinition, 80, 80);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void m_7695_(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 127 */     this.Head.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 128 */     this.Body.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 129 */     this.Tail.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 130 */     this.RightArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 131 */     this.LeftArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 132 */     this.RightLeg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 133 */     this.LeftLeg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */   
/*     */   public void m_6973_(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
/* 137 */     this.RightArm.f_104203_ = Mth.m_14089_(limbSwing * 0.6662F + 3.1415927F) * limbSwingAmount;
/* 138 */     this.LeftLeg.f_104203_ = Mth.m_14089_(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
/* 139 */     this.Head.f_104204_ = netHeadYaw / 57.295776F;
/* 140 */     this.Head.f_104203_ = headPitch / 57.295776F;
/* 141 */     this.LeftArm.f_104203_ = Mth.m_14089_(limbSwing * 0.6662F) * limbSwingAmount;
/* 142 */     this.RightLeg.f_104203_ = Mth.m_14089_(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\client\model\ModelDrone_Hertx.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */