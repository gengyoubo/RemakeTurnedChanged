/*     */ package net.ltxprogrammer.turned.client.model;
/*     */ import com.mojang.blaze3d.vertex.PoseStack;
/*     */ import com.mojang.blaze3d.vertex.VertexConsumer;
/*     */ import net.ltxprogrammer.turned.LatexMod;
/*     */ import net.minecraft.client.model.geom.ModelLayerLocation;
/*     */ import net.minecraft.client.model.geom.ModelPart;
/*     */ import net.minecraft.client.model.geom.PartPose;
/*     */ import net.minecraft.client.model.geom.builders.CubeDeformation;
/*     */ import net.minecraft.client.model.geom.builders.CubeListBuilder;
/*     */ import net.minecraft.client.model.geom.builders.LayerDefinition;
/*     */ import net.minecraft.client.model.geom.builders.MeshDefinition;
/*     */ import net.minecraft.client.model.geom.builders.PartDefinition;
/*     */ import net.minecraft.util.Mth;
/*     */ 
/*     */ public class Modeldark_latex_fox_sniper<T extends Entity> extends EntityModel<T> {
/*  16 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(LatexMod.modResource("dark_latex_fox_sniper"), "main");
/*     */   private final ModelPart Head;
/*     */   private final ModelPart Body;
/*     */   private final ModelPart Tail;
/*     */   private final ModelPart LeftArm;
/*     */   private final ModelPart RightArm;
/*     */   private final ModelPart LeftLeg;
/*     */   private final ModelPart RightLeg;
/*     */   
/*     */   public Modeldark_latex_fox_sniper(ModelPart root) {
/*  26 */     this.Head = root.m_171324_("Head");
/*  27 */     this.Body = root.m_171324_("Body");
/*  28 */     this.Tail = root.m_171324_("Tail");
/*  29 */     this.LeftArm = root.m_171324_("LeftArm");
/*  30 */     this.RightArm = root.m_171324_("RightArm");
/*  31 */     this.LeftLeg = root.m_171324_("LeftLeg");
/*  32 */     this.RightLeg = root.m_171324_("RightLeg");
/*     */   }
/*     */   
/*     */   public static LayerDefinition createBodyLayer() {
/*  36 */     MeshDefinition meshdefinition = new MeshDefinition();
/*  37 */     PartDefinition partdefinition = meshdefinition.m_171576_();
/*     */     
/*  39 */     PartDefinition Head = partdefinition.m_171599_("Head", CubeListBuilder.m_171558_().m_171514_(0, 57).m_171488_(-3.0F, -3.5F, -7.8F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
/*  40 */         .m_171514_(56, 10).m_171488_(2.0F, -3.5F, -7.8F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
/*  41 */         .m_171514_(55, 41).m_171488_(-2.0F, -3.9F, -7.5F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
/*  42 */         .m_171514_(0, 16).m_171488_(-4.0F, -8.0F, -3.5F, 8.0F, 7.0F, 7.0F, new CubeDeformation(0.0F))
/*  43 */         .m_171514_(20, 0).m_171488_(-3.0F, -4.0F, -4.5F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
/*  44 */         .m_171514_(12, 30).m_171488_(-3.0F, -8.0F, -4.5F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
/*  45 */         .m_171514_(20, 9).m_171488_(-3.0F, -6.0F, -5.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
/*  46 */         .m_171514_(0, 2).m_171488_(-2.0F, -8.0F, -4.6F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
/*  47 */         .m_171514_(22, 57).m_171488_(-4.0F, -8.0F, -4.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
/*  48 */         .m_171514_(22, 33).m_171488_(3.0F, -8.0F, -4.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
/*  49 */         .m_171514_(20, 4).m_171488_(-4.0F, -11.0F, -0.5F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
/*  50 */         .m_171514_(0, 6).m_171488_(1.0F, -11.0F, -0.5F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(0.0F, 0.0F, 0.0F));
/*     */     
/*  52 */     PartDefinition Body = partdefinition.m_171599_("Body", CubeListBuilder.m_171558_().m_171514_(26, 26).m_171488_(-4.0F, -1.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(0.0F, 0.0F, 0.0F));
/*     */     
/*  54 */     PartDefinition Tail = partdefinition.m_171599_("Tail", CubeListBuilder.m_171558_().m_171514_(23, 20).m_171488_(-1.0F, -14.9239F, 1.6173F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
/*  55 */         .m_171514_(0, 0).m_171488_(-2.0F, -15.9239F, 2.6173F, 4.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, 23.0F, -5.2F, -0.3927F, 0.0F, 0.0F));
/*     */     
/*  57 */     PartDefinition LeftArm = partdefinition.m_171599_("LeftArm", CubeListBuilder.m_171558_(), PartPose.m_171419_(-5.0F, 2.0F, 0.0F));
/*     */     
/*  59 */     PartDefinition cube_r1 = LeftArm.m_171599_("cube_r1", CubeListBuilder.m_171558_().m_171514_(32, 0).m_171488_(-3.0F, -2.0F, -2.0F, 4.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, -1.0F, 0.0F, -1.5708F, 0.0F, 0.0F));
/*     */     
/*  61 */     PartDefinition Gun = LeftArm.m_171599_("Gun", CubeListBuilder.m_171558_(), PartPose.m_171419_(0.0F, -1.3F, 5.0F));
/*     */     
/*  63 */     PartDefinition cube_r2 = Gun.m_171599_("cube_r2", CubeListBuilder.m_171558_().m_171514_(26, 57).m_171488_(-1.5F, 15.0F, -3.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
/*  64 */         .m_171514_(16, 57).m_171488_(-1.5F, 17.0F, -1.3F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
/*  65 */         .m_171514_(0, 0).m_171488_(-2.0F, 6.0F, -3.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
/*  66 */         .m_171514_(28, 42).m_171488_(-2.0F, 8.0F, -1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
/*  67 */         .m_171514_(23, 16).m_171488_(-2.0F, 11.0F, -3.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
/*  68 */         .m_171514_(0, 16).m_171488_(-1.5F, 25.0F, -2.75F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
/*  69 */         .m_171514_(16, 33).m_171488_(-2.0F, 14.0F, -4.5F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
/*  70 */         .m_171514_(50, 30).m_171488_(-2.0F, 13.0F, -3.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F))
/*  71 */         .m_171514_(0, 0).m_171488_(-1.5F, 12.0F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));
/*     */     
/*  73 */     PartDefinition cube_r3 = Gun.m_171599_("cube_r3", CubeListBuilder.m_171558_().m_171514_(8, 57).m_171488_(-1.5F, 12.0F, -6.3F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, 0.0F, 0.0F, -1.2217F, 0.0F, 0.0F));
/*     */     
/*  75 */     PartDefinition RightArm = partdefinition.m_171599_("RightArm", CubeListBuilder.m_171558_(), PartPose.m_171419_(5.0F, 2.0F, 0.0F));
/*     */     
/*  77 */     PartDefinition cube_r4 = RightArm.m_171599_("cube_r4", CubeListBuilder.m_171558_().m_171514_(0, 30).m_171488_(-1.0F, -2.0F, -2.0F, 4.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, -1.0F, 0.0F, -1.5708F, 0.6545F, 0.0F));
/*     */     
/*  79 */     PartDefinition LeftLeg = partdefinition.m_171599_("LeftLeg", CubeListBuilder.m_171558_().m_171514_(32, 52).m_171488_(-2.0F, -1.0F, -1.9F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(-2.0F, 12.0F, 0.0F));
/*     */     
/*  81 */     PartDefinition cube_r5 = LeftLeg.m_171599_("cube_r5", CubeListBuilder.m_171558_().m_171514_(46, 23).m_171488_(-2.0F, 4.3732F, -4.2794F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, 4.6268F, 1.6794F, 0.0F, 0.0F, 0.0F));
/*     */     
/*  83 */     PartDefinition cube_r6 = LeftLeg.m_171599_("cube_r6", CubeListBuilder.m_171558_().m_171514_(48, 48).m_171488_(-2.0F, 0.0F, -1.0F, 4.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, 4.6268F, 2.2794F, -0.3927F, 0.0F, 0.0F));
/*     */     
/*  85 */     PartDefinition cube_r7 = LeftLeg.m_171599_("cube_r7", CubeListBuilder.m_171558_().m_171514_(16, 42).m_171488_(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, 2.5637F, -2.5296F, 0.7854F, 0.0F, 0.0F));
/*     */     
/*  87 */     PartDefinition cube_r8 = LeftLeg.m_171599_("cube_r8", CubeListBuilder.m_171558_().m_171514_(0, 47).m_171488_(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, -0.8F, 0.2F, -0.3927F, 0.0F, 0.0F));
/*     */     
/*  89 */     PartDefinition RightLeg = partdefinition.m_171599_("RightLeg", CubeListBuilder.m_171558_().m_171514_(16, 52).m_171488_(-2.0F, -1.0F, -1.9F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(2.0F, 12.0F, 0.0F));
/*     */     
/*  91 */     PartDefinition cube_r9 = RightLeg.m_171599_("cube_r9", CubeListBuilder.m_171558_().m_171514_(30, 19).m_171488_(-2.0F, 4.3732F, -4.2794F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, 4.6268F, 1.6794F, 0.0F, 0.0F, 0.0F));
/*     */     
/*  93 */     PartDefinition cube_r10 = RightLeg.m_171599_("cube_r10", CubeListBuilder.m_171558_().m_171514_(48, 0).m_171488_(-2.0F, 0.0F, -1.0F, 4.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, 4.6268F, 2.2794F, -0.3927F, 0.0F, 0.0F));
/*     */     
/*  95 */     PartDefinition cube_r11 = RightLeg.m_171599_("cube_r11", CubeListBuilder.m_171558_().m_171514_(32, 42).m_171488_(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, 2.5637F, -2.5296F, 0.7854F, 0.0F, 0.0F));
/*     */     
/*  97 */     PartDefinition cube_r12 = RightLeg.m_171599_("cube_r12", CubeListBuilder.m_171558_().m_171514_(44, 13).m_171488_(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, -0.8F, 0.2F, -0.3927F, 0.0F, 0.0F));
/*     */     
/*  99 */     return LayerDefinition.m_171565_(meshdefinition, 128, 128);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6973_(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
/* 104 */     this.Head.f_104204_ = netHeadYaw / 57.295776F;
/* 105 */     this.Head.f_104203_ = headPitch / 57.295776F;
/* 106 */     this.RightLeg.f_104203_ = Mth.m_14089_(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
/* 107 */     this.RightArm.f_104203_ = Mth.m_14089_(limbSwing * 0.6662F + 3.1415927F) * limbSwingAmount;
/* 108 */     this.LeftArm.f_104203_ = Mth.m_14089_(limbSwing * 0.6662F) * limbSwingAmount;
/* 109 */     this.LeftLeg.f_104203_ = Mth.m_14089_(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_7695_(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 114 */     this.Head.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 115 */     this.Body.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 116 */     this.Tail.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 117 */     this.LeftArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 118 */     this.RightArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 119 */     this.LeftLeg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 120 */     this.RightLeg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\client\model\Modeldark_latex_fox_sniper.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */