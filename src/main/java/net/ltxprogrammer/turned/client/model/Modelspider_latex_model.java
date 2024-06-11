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
/*     */ public class Modelspider_latex_model<T extends Entity>
/*     */   extends EntityModel<T>
/*     */ {
/*  25 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("turned", "modelspider_latex_model"), "main");
/*     */   public final ModelPart Head;
/*     */   public final ModelPart Body;
/*     */   public final ModelPart LeftArm;
/*     */   public final ModelPart RightArm;
/*     */   public final ModelPart LowerBody;
/*     */   public final ModelPart Rightleg;
/*     */   public final ModelPart Leftleg;
/*     */   
/*     */   public Modelspider_latex_model(ModelPart root) {
/*  35 */     this.Head = root.m_171324_("Head");
/*  36 */     this.Body = root.m_171324_("Body");
/*  37 */     this.LeftArm = root.m_171324_("LeftArm");
/*  38 */     this.RightArm = root.m_171324_("RightArm");
/*  39 */     this.LowerBody = root.m_171324_("LowerBody");
/*  40 */     this.Rightleg = root.m_171324_("Rightleg");
/*  41 */     this.Leftleg = root.m_171324_("Leftleg");
/*     */   }
/*     */   
/*     */   public static LayerDefinition createBodyLayer() {
/*  45 */     MeshDefinition meshdefinition = new MeshDefinition();
/*  46 */     PartDefinition partdefinition = meshdefinition.m_171576_();
/*  47 */     PartDefinition Head = partdefinition.m_171599_("Head", 
/*  48 */         CubeListBuilder.m_171558_().m_171514_(26, 31).m_171488_(-4.0F, -8.0F, -3.75F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), 
/*  49 */         PartPose.m_171419_(0.0F, 0.0F, -4.5F));
/*  50 */     PartDefinition bone9 = Head.m_171599_("bone9", 
/*  51 */         CubeListBuilder.m_171558_().m_171514_(46, 64).m_171488_(-4.0F, -3.0F, -5.25F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), 
/*  52 */         PartPose.m_171423_(0.5F, 0.0F, 0.25F, 0.0F, 0.0F, -0.1745F));
/*  53 */     PartDefinition bone10 = Head.m_171599_("bone10", 
/*  54 */         CubeListBuilder.m_171558_().m_171514_(0, 24).m_171488_(-3.9248F, -1.9978F, -5.25F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), 
/*  55 */         PartPose.m_171423_(5.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.1745F));
/*     */     
/*  57 */     PartDefinition Body = partdefinition.m_171599_("Body", 
/*  58 */         CubeListBuilder.m_171558_().m_171514_(54, 54).m_171488_(-4.5F, 0.0F, -1.75F, 9.0F, 7.0F, 4.0F, new CubeDeformation(0.0F))
/*  59 */         .m_171514_(0, 39).m_171488_(-4.0F, 7.0F, -1.25F, 8.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), 
/*  60 */         PartPose.m_171419_(0.0F, 0.0F, -4.5F));
/*  61 */     PartDefinition LeftArm = partdefinition.m_171599_("LeftArm", 
/*  62 */         CubeListBuilder.m_171558_().m_171514_(32, 64).m_171488_(-2.0F, -2.0F, -1.75F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F))
/*  63 */         .m_171514_(16, 63).m_171488_(-3.0F, 5.0F, -1.75F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  64 */         PartPose.m_171419_(-5.5F, 2.0F, -4.5F));
/*     */     
/*  66 */     PartDefinition RightArm = partdefinition.m_171599_("RightArm", 
/*  67 */         CubeListBuilder.m_171558_().m_171514_(0, 0).m_171488_(-1.0F, -2.0F, -1.75F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F))
/*  68 */         .m_171514_(0, 63).m_171488_(-1.0F, 5.0F, -1.75F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  69 */         PartPose.m_171419_(5.5F, 2.0F, -4.5F));
/*  70 */     PartDefinition LowerBody = partdefinition.m_171599_("LowerBody", 
/*  71 */         CubeListBuilder.m_171558_().m_171514_(0, 24).m_171488_(-4.5F, 14.0F, -2.75F, 9.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)).m_171514_(58, 24)
/*  72 */         .m_171488_(-3.5F, 15.0F, -3.75F, 7.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 0)
/*  73 */         .m_171488_(-6.0F, 12.25F, 10.25F, 12.0F, 10.0F, 14.0F, new CubeDeformation(0.0F)).m_171514_(58, 36)
/*  74 */         .m_171488_(-5.0F, 13.25F, 24.25F, 10.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(28, 53)
/*  75 */         .m_171488_(-4.0F, 14.5F, 5.25F, 8.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(0, 53)
/*  76 */         .m_171488_(-4.0F, 12.0F, -2.25F, 8.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), 
/*  77 */         PartPose.m_171419_(0.0F, 0.0F, -4.5F));
/*  78 */     PartDefinition Rightleg = partdefinition.m_171599_("Rightleg", CubeListBuilder.m_171558_(), 
/*  79 */         PartPose.m_171423_(2.0F, 18.75F, -1.25F, 0.0F, 0.0F, 0.3927F));
/*  80 */     PartDefinition bone = Rightleg.m_171599_("bone", 
/*  81 */         CubeListBuilder.m_171558_().m_171514_(52, 12).m_171488_(2.4476F, 6.0F, -0.7907F, 13.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), 
/*  82 */         PartPose.m_171423_(-1.3886F, -7.2722F, 2.25F, 0.0F, -0.3927F, 0.0F));
/*  83 */     PartDefinition bone2 = Rightleg.m_171599_("bone2", 
/*  84 */         CubeListBuilder.m_171558_().m_171514_(52, 18).m_171488_(2.9791F, 6.0F, -1.2044F, 13.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), 
/*  85 */         PartPose.m_171423_(-1.8109F, -7.6384F, 0.25F, 0.0F, -0.1745F, 0.0F));
/*  86 */     PartDefinition bone3 = Rightleg.m_171599_("bone3", 
/*  87 */         CubeListBuilder.m_171558_().m_171514_(32, 47).m_171488_(3.5559F, 4.5941F, -3.8746F, 13.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), 
/*  88 */         PartPose.m_171423_(-1.8886F, -6.2721F, 1.75F, 0.0F, 0.1745F, 0.0F));
/*  89 */     PartDefinition bone4 = Rightleg.m_171599_("bone4", 
/*  90 */         CubeListBuilder.m_171558_().m_171514_(50, 30).m_171488_(4.0929F, 4.6898F, -3.8044F, 13.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), 
/*  91 */         PartPose.m_171423_(-1.8886F, -6.2722F, -0.25F, 0.0F, 0.3927F, 0.0F));
/*  92 */     PartDefinition Leftleg = partdefinition.m_171599_("Leftleg", CubeListBuilder.m_171558_(), 
/*  93 */         PartPose.m_171423_(-2.0F, 18.75F, -1.25F, 0.0F, 0.0F, -0.3927F));
/*  94 */     PartDefinition bone5 = Leftleg.m_171599_("bone5", 
/*  95 */         CubeListBuilder.m_171558_().m_171514_(0, 47).m_171488_(-15.4476F, 6.0F, -0.7907F, 13.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), 
/*  96 */         PartPose.m_171423_(1.3886F, -7.2722F, 2.25F, 0.0F, 0.3927F, 0.0F));
/*  97 */     PartDefinition bone6 = Leftleg.m_171599_("bone6", 
/*  98 */         CubeListBuilder.m_171558_().m_171514_(38, 6).m_171488_(-15.9791F, 6.0F, -1.2044F, 13.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), 
/*  99 */         PartPose.m_171423_(1.8109F, -7.6384F, 0.25F, 0.0F, 0.1745F, 0.0F));
/* 100 */     PartDefinition bone7 = Leftleg.m_171599_("bone7", 
/* 101 */         CubeListBuilder.m_171558_().m_171514_(38, 0).m_171488_(-16.5559F, 4.5941F, -3.8746F, 13.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 102 */         PartPose.m_171423_(1.8886F, -6.2721F, 1.75F, 0.0F, -0.1745F, 0.0F));
/* 103 */     PartDefinition bone8 = Leftleg.m_171599_("bone8", 
/* 104 */         CubeListBuilder.m_171558_().m_171514_(26, 24).m_171488_(-17.0929F, 4.6898F, -3.8044F, 13.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 105 */         PartPose.m_171423_(1.8886F, -6.2722F, -0.25F, 0.0F, -0.3927F, 0.0F));
/* 106 */     return LayerDefinition.m_171565_(meshdefinition, 96, 96);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void m_7695_(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 112 */     this.Head.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 113 */     this.Body.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 114 */     this.LeftArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 115 */     this.RightArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 116 */     this.LowerBody.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 117 */     this.Rightleg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 118 */     this.Leftleg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */   
/*     */   public void m_6973_(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
/* 122 */     this.RightArm.f_104203_ = Mth.m_14089_(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
/* 123 */     this.Leftleg.f_104203_ = Mth.m_14089_(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
/* 124 */     this.Head.f_104204_ = netHeadYaw / 57.295776F;
/* 125 */     this.Head.f_104203_ = headPitch / 57.295776F;
/* 126 */     this.LeftArm.f_104203_ = Mth.m_14089_(limbSwing * 0.6662F) * limbSwingAmount;
/* 127 */     this.Rightleg.f_104203_ = Mth.m_14089_(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\client\model\Modelspider_latex_model.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */