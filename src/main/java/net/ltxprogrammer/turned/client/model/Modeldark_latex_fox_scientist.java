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
/*     */ public class Modeldark_latex_fox_scientist<T extends Entity> extends EntityModel<T> {
/*  16 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(LatexMod.modResource("dark_latex_fox_scientist"), "main");
/*     */   private final ModelPart Head;
/*     */   private final ModelPart Body;
/*     */   private final ModelPart Tail;
/*     */   private final ModelPart LeftArm;
/*     */   private final ModelPart RightArm;
/*     */   private final ModelPart LeftLeg;
/*     */   private final ModelPart RightLeg;
/*     */   
/*     */   public Modeldark_latex_fox_scientist(ModelPart root) {
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
/*  39 */     PartDefinition Head = partdefinition.m_171599_("Head", CubeListBuilder.m_171558_().m_171514_(23, 16).m_171488_(-3.0F, -3.5F, -7.8F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
/*  40 */         .m_171514_(20, 4).m_171488_(2.0F, -3.5F, -7.8F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
/*  41 */         .m_171514_(50, 30).m_171488_(-2.0F, -3.9F, -7.5F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
/*  42 */         .m_171514_(0, 16).m_171488_(-4.0F, -8.0F, -3.5F, 8.0F, 7.0F, 7.0F, new CubeDeformation(0.0F))
/*  43 */         .m_171514_(0, 8).m_171488_(-3.0F, -4.0F, -4.5F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
/*  44 */         .m_171514_(12, 30).m_171488_(-3.0F, -8.0F, -4.5F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
/*  45 */         .m_171514_(28, 4).m_171488_(-4.0F, -8.0F, -4.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
/*  46 */         .m_171514_(0, 16).m_171488_(3.0F, -8.0F, -4.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
/*  47 */         .m_171514_(0, 5).m_171488_(-4.0F, -11.0F, -0.5F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
/*  48 */         .m_171514_(0, 0).m_171488_(1.0F, -11.0F, -0.5F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(0.0F, 0.0F, 0.0F));
/*     */     
/*  50 */     PartDefinition Body = partdefinition.m_171599_("Body", CubeListBuilder.m_171558_().m_171514_(26, 26).m_171488_(-4.0F, -1.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(0.0F, 0.0F, 0.0F));
/*     */     
/*  52 */     PartDefinition Tail = partdefinition.m_171599_("Tail", CubeListBuilder.m_171558_().m_171514_(16, 33).m_171488_(-1.0F, -14.9239F, 1.6173F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
/*  53 */         .m_171514_(0, 0).m_171488_(-2.0F, -15.9239F, 2.6173F, 4.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, 23.0F, -5.2F, -0.3927F, 0.0F, 0.0F));
/*     */     
/*  55 */     PartDefinition LeftArm = partdefinition.m_171599_("LeftArm", CubeListBuilder.m_171558_().m_171514_(32, 0).m_171488_(-3.0F, -3.0F, -2.0F, 4.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(-5.0F, 2.0F, 0.0F));
/*     */     
/*  57 */     PartDefinition RightArm = partdefinition.m_171599_("RightArm", CubeListBuilder.m_171558_().m_171514_(0, 30).m_171488_(-1.0F, -3.0F, -2.0F, 4.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(5.0F, 2.0F, 0.0F));
/*     */     
/*  59 */     PartDefinition LeftLeg = partdefinition.m_171599_("LeftLeg", CubeListBuilder.m_171558_().m_171514_(48, 43).m_171488_(-2.0F, -1.0F, -1.9F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(-2.0F, 12.0F, 0.0F));
/*     */     
/*  61 */     PartDefinition cube_r1 = LeftLeg.m_171599_("cube_r1", CubeListBuilder.m_171558_().m_171514_(46, 23).m_171488_(-2.0F, 4.3732F, -4.2794F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, 4.6268F, 1.6794F, 0.0F, 0.0F, 0.0F));
/*     */     
/*  63 */     PartDefinition cube_r2 = LeftLeg.m_171599_("cube_r2", CubeListBuilder.m_171558_().m_171514_(48, 48).m_171488_(-2.0F, 0.0F, -1.0F, 4.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, 4.6268F, 2.2794F, -0.3927F, 0.0F, 0.0F));
/*     */     
/*  65 */     PartDefinition cube_r3 = LeftLeg.m_171599_("cube_r3", CubeListBuilder.m_171558_().m_171514_(16, 42).m_171488_(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, 2.5637F, -2.5296F, 0.7854F, 0.0F, 0.0F));
/*     */     
/*  67 */     PartDefinition cube_r4 = LeftLeg.m_171599_("cube_r4", CubeListBuilder.m_171558_().m_171514_(0, 47).m_171488_(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, -0.8F, 0.2F, -0.3927F, 0.0F, 0.0F));
/*     */     
/*  69 */     PartDefinition RightLeg = partdefinition.m_171599_("RightLeg", CubeListBuilder.m_171558_().m_171514_(48, 43).m_171480_().m_171488_(-2.0F, -1.0F, -1.9F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).m_171555_(false), PartPose.m_171419_(2.0F, 12.0F, 0.0F));
/*     */     
/*  71 */     PartDefinition cube_r5 = RightLeg.m_171599_("cube_r5", CubeListBuilder.m_171558_().m_171514_(30, 19).m_171488_(-2.0F, 4.3732F, -4.2794F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, 4.6268F, 1.6794F, 0.0F, 0.0F, 0.0F));
/*     */     
/*  73 */     PartDefinition cube_r6 = RightLeg.m_171599_("cube_r6", CubeListBuilder.m_171558_().m_171514_(48, 0).m_171488_(-2.0F, 0.0F, -1.0F, 4.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, 4.6268F, 2.2794F, -0.3927F, 0.0F, 0.0F));
/*     */     
/*  75 */     PartDefinition cube_r7 = RightLeg.m_171599_("cube_r7", CubeListBuilder.m_171558_().m_171514_(32, 42).m_171488_(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, 2.5637F, -2.5296F, 0.7854F, 0.0F, 0.0F));
/*     */     
/*  77 */     PartDefinition cube_r8 = RightLeg.m_171599_("cube_r8", CubeListBuilder.m_171558_().m_171514_(44, 13).m_171488_(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, -0.8F, 0.2F, -0.3927F, 0.0F, 0.0F));
/*     */     
/*  79 */     return LayerDefinition.m_171565_(meshdefinition, 64, 64);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6973_(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
/*  84 */     this.Head.f_104204_ = netHeadYaw / 57.295776F;
/*  85 */     this.Head.f_104203_ = headPitch / 57.295776F;
/*  86 */     this.RightLeg.f_104203_ = Mth.m_14089_(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
/*  87 */     this.RightArm.f_104203_ = Mth.m_14089_(limbSwing * 0.6662F + 3.1415927F) * limbSwingAmount;
/*  88 */     this.LeftArm.f_104203_ = Mth.m_14089_(limbSwing * 0.6662F) * limbSwingAmount;
/*  89 */     this.LeftLeg.f_104203_ = Mth.m_14089_(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_7695_(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/*  94 */     this.Head.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*  95 */     this.Body.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*  96 */     this.Tail.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*  97 */     this.LeftArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*  98 */     this.RightArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*  99 */     this.LeftLeg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 100 */     this.RightLeg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\client\model\Modeldark_latex_fox_scientist.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */