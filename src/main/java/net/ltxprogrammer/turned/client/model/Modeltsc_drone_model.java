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
/*     */ public class Modeltsc_drone_model<T extends Entity>
/*     */   extends EntityModel<T>
/*     */ {
/*  25 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("turned", "modeltsc_drone_model"), "main");
/*     */   public final ModelPart Head;
/*     */   public final ModelPart Body;
/*     */   public final ModelPart LeftArm;
/*     */   public final ModelPart RightArm;
/*     */   public final ModelPart LeftLeg;
/*     */   public final ModelPart RightLeg;
/*     */   
/*     */   public Modeltsc_drone_model(ModelPart root) {
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
/*  46 */         CubeListBuilder.m_171558_().m_171514_(0, 0).m_171488_(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).m_171514_(22, 23)
/*  47 */         .m_171488_(-3.0F, -8.5F, -4.5F, 6.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).m_171514_(31, 16)
/*  48 */         .m_171488_(2.75F, -2.5F, -4.75F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).m_171514_(12, 31)
/*  49 */         .m_171488_(-4.75F, -2.5F, -4.75F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).m_171514_(17, 23)
/*  50 */         .m_171488_(-2.0F, -1.5F, -4.75F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), 
/*  51 */         PartPose.m_171419_(0.0F, 0.0F, 0.0F));
/*  52 */     PartDefinition bone = Head.m_171599_("bone", 
/*  53 */         CubeListBuilder.m_171558_().m_171514_(12, 39).m_171488_(2.5F, -9.0F, -2.0F, 2.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).m_171514_(0, 31)
/*  54 */         .m_171488_(-4.5F, -9.0F, -2.0F, 2.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), 
/*  55 */         PartPose.m_171423_(0.0F, 0.0F, 3.0F, 0.3927F, 0.0F, 0.0F));
/*  56 */     PartDefinition Body = partdefinition.m_171599_("Body", 
/*  57 */         CubeListBuilder.m_171558_().m_171514_(32, 0).m_171488_(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  58 */         PartPose.m_171419_(0.0F, 0.0F, 0.0F));
/*  59 */     PartDefinition bone2 = Body.m_171599_("bone2", 
/*  60 */         CubeListBuilder.m_171558_().m_171514_(0, 16).m_171488_(-1.0F, 10.0F, -2.0F, 2.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)).m_171514_(48, 43)
/*  61 */         .m_171488_(-1.5F, 9.4619F, -1.8087F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(54, 16)
/*  62 */         .m_171488_(-1.5F, 9.4619F, 1.1913F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(52, 0)
/*  63 */         .m_171488_(-1.5F, 9.4619F, 3.1913F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(42, 25)
/*  64 */         .m_171488_(-1.5F, 9.4619F, 7.1913F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(8, 43)
/*  65 */         .m_171488_(-1.5F, 9.4619F, 5.1913F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 43).m_171488_(-1.5F, 9.4619F, 9.1913F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), 
/*     */         
/*  67 */         PartPose.m_171423_(0.0F, 1.0F, 7.0F, -0.3927F, 0.0F, 0.0F));
/*  68 */     PartDefinition LeftArm = partdefinition.m_171599_("LeftArm", 
/*  69 */         CubeListBuilder.m_171558_().m_171514_(50, 25).m_171488_(-3.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(48, 48)
/*  70 */         .m_171488_(-3.0F, 5.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(16, 51)
/*  71 */         .m_171488_(-2.0F, 2.0F, -2.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(0, 16)
/*  72 */         .m_171488_(-3.0F, -3.0F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  73 */         PartPose.m_171419_(-5.0F, 2.0F, 0.0F));
/*  74 */     PartDefinition bone6 = LeftArm.m_171599_("bone6", 
/*  75 */         CubeListBuilder.m_171558_().m_171514_(0, 31).m_171488_(-2.0F, 1.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), 
/*  76 */         PartPose.m_171423_(-2.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3491F));
/*  77 */     PartDefinition RightArm = partdefinition.m_171599_("RightArm", 
/*  78 */         CubeListBuilder.m_171558_().m_171514_(46, 35).m_171488_(-1.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(42, 16)
/*  79 */         .m_171488_(-1.0F, 5.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(17, 16)
/*  80 */         .m_171488_(-1.0F, 2.0F, -2.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(0, 21)
/*  81 */         .m_171488_(1.0F, -3.0F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  82 */         PartPose.m_171419_(5.0F, 2.0F, 0.0F));
/*  83 */     PartDefinition bone5 = RightArm.m_171599_("bone5", 
/*  84 */         CubeListBuilder.m_171558_().m_171514_(24, 39).m_171488_(0.0F, 1.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), 
/*  85 */         PartPose.m_171423_(2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3491F));
/*  86 */     PartDefinition LeftLeg = partdefinition.m_171599_("LeftLeg", 
/*  87 */         CubeListBuilder.m_171558_().m_171514_(0, 47).m_171488_(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  88 */         PartPose.m_171419_(-2.0F, 12.0F, 0.0F));
/*  89 */     PartDefinition bone4 = LeftLeg.m_171599_("bone4", 
/*  90 */         CubeListBuilder.m_171558_().m_171514_(24, 0).m_171488_(-1.0F, 4.0F, 0.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), 
/*  91 */         PartPose.m_171423_(4.0F, 0.0F, 3.5F, -0.3927F, 0.0F, 0.0F));
/*  92 */     PartDefinition RightLeg = partdefinition.m_171599_("RightLeg", 
/*  93 */         CubeListBuilder.m_171558_().m_171514_(32, 39).m_171488_(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  94 */         PartPose.m_171419_(2.0F, 12.0F, 0.0F));
/*  95 */     PartDefinition bone7 = RightLeg.m_171599_("bone7", 
/*  96 */         CubeListBuilder.m_171558_().m_171514_(0, 0).m_171488_(-1.0F, 4.0F, 0.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), 
/*  97 */         PartPose.m_171423_(-4.0F, 0.0F, 3.5F, -0.3927F, 0.0F, 0.0F));
/*  98 */     return LayerDefinition.m_171565_(meshdefinition, 80, 80);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void m_7695_(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 104 */     this.Head.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 105 */     this.Body.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 106 */     this.LeftArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 107 */     this.RightArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 108 */     this.LeftLeg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 109 */     this.RightLeg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */   
/*     */   public void m_6973_(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
/* 113 */     this.RightArm.f_104203_ = Mth.m_14089_(limbSwing * 0.6662F + 3.1415927F) * limbSwingAmount;
/* 114 */     this.LeftLeg.f_104203_ = Mth.m_14089_(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
/* 115 */     this.Head.f_104204_ = netHeadYaw / 57.295776F;
/* 116 */     this.Head.f_104203_ = headPitch / 57.295776F;
/* 117 */     this.LeftArm.f_104203_ = Mth.m_14089_(limbSwing * 0.6662F) * limbSwingAmount;
/* 118 */     this.RightLeg.f_104203_ = Mth.m_14089_(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\client\model\Modeltsc_drone_model.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */