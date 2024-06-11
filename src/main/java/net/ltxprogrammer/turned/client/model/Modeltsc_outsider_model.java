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
/*     */ public class Modeltsc_outsider_model<T extends Entity>
/*     */   extends EntityModel<T>
/*     */ {
/*  25 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("turned", "modeltsc_outsider_model"), "main");
/*     */   public final ModelPart Head;
/*     */   public final ModelPart Body;
/*     */   public final ModelPart LeftArm;
/*     */   public final ModelPart RightArm;
/*     */   public final ModelPart LeftLeg;
/*     */   public final ModelPart RightLeg;
/*     */   
/*     */   public Modeltsc_outsider_model(ModelPart root) {
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
/*  46 */         CubeListBuilder.m_171558_().m_171514_(0, 0).m_171488_(-3.5F, -7.0F, -3.5F, 7.0F, 7.0F, 7.0F, new CubeDeformation(0.0F))
/*  47 */         .m_171514_(12, 27).m_171488_(-3.0F, -5.25F, -3.75F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  48 */         PartPose.m_171419_(0.0F, 0.0F, 0.0F));
/*  49 */     PartDefinition Ears = Head.m_171599_("Ears", 
/*  50 */         CubeListBuilder.m_171558_().m_171514_(53, 24).m_171488_(-1.0F, -1.5F, -3.0F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(52, 34)
/*  51 */         .m_171488_(6.0F, -1.5F, -3.0F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), 
/*  52 */         PartPose.m_171423_(-3.5F, -6.5F, 2.5F, 0.7854F, 0.0F, 0.0F));
/*  53 */     PartDefinition Body = partdefinition.m_171599_("Body", 
/*  54 */         CubeListBuilder.m_171558_().m_171514_(16, 14).m_171488_(-4.0F, 0.0F, -2.0F, 8.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(28, 0)
/*  55 */         .m_171488_(-4.0F, 8.0F, -2.0F, 8.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(28, 8)
/*  56 */         .m_171488_(-3.5F, 6.0F, -2.0F, 7.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(0, 14)
/*  57 */         .m_171488_(-1.5F, 0.5F, -2.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  58 */         PartPose.m_171419_(0.0F, 0.0F, 0.0F));
/*  59 */     PartDefinition Tail = Body.m_171599_("Tail", 
/*  60 */         CubeListBuilder.m_171558_().m_171514_(19, 24).m_171488_(-2.0F, -15.5381F, 4.1913F, 4.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)).m_171514_(0, 14)
/*  61 */         .m_171488_(-1.5F, -15.0F, 2.0F, 3.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)), 
/*  62 */         PartPose.m_171423_(0.0F, 23.0F, -5.2F, -0.3927F, 0.0F, 0.0F));
/*  63 */     PartDefinition LeftArm = partdefinition.m_171599_("LeftArm", 
/*  64 */         CubeListBuilder.m_171558_().m_171514_(16, 45).m_171488_(-3.0F, -2.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(28, 50)
/*  65 */         .m_171488_(-3.0F, 3.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(41, 30)
/*  66 */         .m_171488_(-3.0F, 6.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  67 */         PartPose.m_171419_(-5.0F, 2.0F, 0.0F));
/*  68 */     PartDefinition RightArm = partdefinition.m_171599_("RightArm", 
/*  69 */         CubeListBuilder.m_171558_().m_171514_(40, 41).m_171488_(-1.0F, -2.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(0, 50)
/*  70 */         .m_171488_(-1.0F, 3.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(0, 41)
/*  71 */         .m_171488_(-1.0F, 6.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  72 */         PartPose.m_171419_(5.0F, 2.0F, 0.0F));
/*  73 */     PartDefinition LeftLeg = partdefinition.m_171599_("LeftLeg", CubeListBuilder.m_171558_(), PartPose.m_171419_(-2.0F, 12.0F, 0.0F));
/*  74 */     PartDefinition cube_r1 = LeftLeg.m_171599_("cube_r1", 
/*  75 */         CubeListBuilder.m_171558_().m_171514_(48, 17).m_171488_(-2.0F, 4.3732F, -4.2794F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  76 */         PartPose.m_171419_(0.0F, 4.6268F, 1.6794F));
/*  77 */     PartDefinition cube_r2 = LeftLeg.m_171599_("cube_r2", 
/*  78 */         CubeListBuilder.m_171558_().m_171514_(52, 0).m_171488_(-1.5F, 0.0F, -1.0F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), 
/*  79 */         PartPose.m_171423_(0.0F, 4.6268F, 2.2794F, -0.3927F, 0.0F, 0.0F));
/*  80 */     PartDefinition cube_r3 = LeftLeg.m_171599_("cube_r3", 
/*  81 */         CubeListBuilder.m_171558_().m_171514_(36, 20).m_171488_(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  82 */         PartPose.m_171423_(0.0F, 2.5637F, -2.5296F, 0.7854F, 0.0F, 0.0F));
/*  83 */     PartDefinition cube_r4 = LeftLeg.m_171599_("cube_r4", 
/*  84 */         CubeListBuilder.m_171558_().m_171514_(28, 35).m_171488_(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  85 */         PartPose.m_171423_(0.0F, -0.8F, 0.2F, -0.3927F, 0.0F, 0.0F));
/*  86 */     PartDefinition RightLeg = partdefinition.m_171599_("RightLeg", CubeListBuilder.m_171558_(), PartPose.m_171419_(2.0F, 12.0F, 0.0F));
/*  87 */     PartDefinition cube_r5 = RightLeg.m_171599_("cube_r5", 
/*  88 */         CubeListBuilder.m_171558_().m_171514_(46, 10).m_171488_(-2.0F, 4.3732F, -4.2794F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  89 */         PartPose.m_171419_(0.0F, 4.6268F, 1.6794F));
/*  90 */     PartDefinition cube_r6 = RightLeg.m_171599_("cube_r6", 
/*  91 */         CubeListBuilder.m_171558_().m_171514_(44, 50).m_171488_(-1.5F, 0.0F, -1.0F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), 
/*  92 */         PartPose.m_171423_(0.0F, 4.6268F, 2.2794F, -0.3927F, 0.0F, 0.0F));
/*  93 */     PartDefinition cube_r7 = RightLeg.m_171599_("cube_r7", 
/*  94 */         CubeListBuilder.m_171558_().m_171514_(12, 35).m_171488_(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  95 */         PartPose.m_171423_(0.0F, 2.5637F, -2.5296F, 0.7854F, 0.0F, 0.0F));
/*  96 */     PartDefinition cube_r8 = RightLeg.m_171599_("cube_r8", 
/*  97 */         CubeListBuilder.m_171558_().m_171514_(0, 27).m_171488_(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  98 */         PartPose.m_171423_(0.0F, -0.8F, 0.2F, -0.3927F, 0.0F, 0.0F));
/*  99 */     return LayerDefinition.m_171565_(meshdefinition, 80, 80);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void m_7695_(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 105 */     this.Head.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 106 */     this.Body.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 107 */     this.LeftArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 108 */     this.RightArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 109 */     this.LeftLeg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 110 */     this.RightLeg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */   
/*     */   public void m_6973_(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
/* 114 */     this.RightArm.f_104203_ = Mth.m_14089_(limbSwing * 0.6662F + 3.1415927F) * limbSwingAmount;
/* 115 */     this.LeftLeg.f_104203_ = Mth.m_14089_(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
/* 116 */     this.Head.f_104204_ = netHeadYaw / 57.295776F;
/* 117 */     this.Head.f_104203_ = headPitch / 57.295776F;
/* 118 */     this.LeftArm.f_104203_ = Mth.m_14089_(limbSwing * 0.6662F) * limbSwingAmount;
/* 119 */     this.RightLeg.f_104203_ = Mth.m_14089_(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\client\model\Modeltsc_outsider_model.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */