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
/*     */ public class Modelhertx_sit_model_f<T extends Entity>
/*     */   extends EntityModel<T>
/*     */ {
/*  24 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("turned", "modelhertx_sit_model_f"), "main");
/*     */   public final ModelPart Head;
/*     */   public final ModelPart Body;
/*     */   public final ModelPart Tail;
/*     */   public final ModelPart LeftArm;
/*     */   public final ModelPart RightArm;
/*     */   public final ModelPart LeftLeg;
/*     */   public final ModelPart RightLeg;
/*     */   
/*     */   public Modelhertx_sit_model_f(ModelPart root) {
/*  34 */     this.Head = root.m_171324_("Head");
/*  35 */     this.Body = root.m_171324_("Body");
/*  36 */     this.Tail = root.m_171324_("Tail");
/*  37 */     this.LeftArm = root.m_171324_("LeftArm");
/*  38 */     this.RightArm = root.m_171324_("RightArm");
/*  39 */     this.LeftLeg = root.m_171324_("LeftLeg");
/*  40 */     this.RightLeg = root.m_171324_("RightLeg");
/*     */   }
/*     */   
/*     */   public static LayerDefinition createBodyLayer() {
/*  44 */     MeshDefinition meshdefinition = new MeshDefinition();
/*  45 */     PartDefinition partdefinition = meshdefinition.m_171576_();
/*  46 */     PartDefinition Head = partdefinition.m_171599_("Head", 
/*  47 */         CubeListBuilder.m_171558_().m_171514_(24, 16).m_171488_(-3.0F, -2.3F, -4.2F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(19, 7)
/*  48 */         .m_171488_(-2.0F, -3.4F, -3.2F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(61, 47)
/*  49 */         .m_171488_(-2.0F, -7.4F, 1.8F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).m_171514_(20, 16)
/*  50 */         .m_171488_(-2.0F, -3.4F, 2.8F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(37, 0)
/*  51 */         .m_171488_(-3.0F, -3.4F, 1.8F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(24, 24)
/*  52 */         .m_171488_(-3.0F, -1.4F, -3.1F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(7, 0)
/*  53 */         .m_171488_(2.0F, -7.4F, 1.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 0)
/*  54 */         .m_171488_(-3.0F, -7.4F, 1.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(19, 0)
/*  55 */         .m_171488_(-3.0F, -7.4F, -4.2F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(24, 57)
/*  56 */         .m_171488_(2.0F, -6.4F, -4.2F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(0, 60)
/*  57 */         .m_171488_(2.0F, -3.3F, -4.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(55, 55)
/*  58 */         .m_171488_(-3.0F, -6.4F, -4.2F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(59, 40)
/*  59 */         .m_171488_(-3.0F, -3.3F, -4.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(0, 8)
/*  60 */         .m_171488_(-2.0F, -6.4F, -4.2F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(12, 32)
/*  61 */         .m_171488_(-2.0F, -3.3F, -4.2F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  62 */         PartPose.m_171419_(0.0F, 9.0F, 4.0F));
/*  63 */     PartDefinition cube_r1 = Head.m_171599_("cube_r1", 
/*  64 */         CubeListBuilder.m_171558_().m_171514_(24, 24).m_171488_(-3.0625F, 1.2791F, 7.9211F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
/*  65 */         .m_171514_(0, 16).m_171488_(-3.25F, 2.5749F, 6.4445F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(54, 23)
/*  66 */         .m_171488_(-3.0625F, 1.2791F, 1.9211F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(0, 0)
/*  67 */         .m_171488_(-3.25F, 2.5749F, 1.4445F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(19, 7)
/*  68 */         .m_171488_(2.0625F, 1.2791F, 7.9211F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(19, 2)
/*  69 */         .m_171488_(2.25F, 2.6072F, 6.5652F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(35, 51)
/*  70 */         .m_171488_(2.0625F, 1.2791F, 1.9211F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(62, 18)
/*  71 */         .m_171488_(2.25F, 2.6072F, 1.5652F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), 
/*  72 */         PartPose.m_171423_(0.0F, -7.6F, -0.2F, 0.2618F, 0.0F, 0.0F));
/*  73 */     PartDefinition Body = partdefinition.m_171599_("Body", 
/*  74 */         CubeListBuilder.m_171558_().m_171514_(0, 16).m_171488_(-4.0F, -0.8761F, -1.6173F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
/*  75 */         .m_171514_(32, 14).m_171488_(-3.0F, 4.9364F, -2.1173F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(19, 0)
/*  76 */         .m_171488_(-1.0F, -0.0636F, -2.1173F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  77 */         PartPose.m_171423_(0.0F, 9.0F, 4.0F, -0.3927F, 0.0F, 0.0F));
/*  78 */     PartDefinition bone = Body.m_171599_("bone", 
/*  79 */         CubeListBuilder.m_171558_().m_171514_(30, 31).m_171488_(-4.0F, 2.7268F, 6.267F, 8.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), 
/*  80 */         PartPose.m_171423_(0.0F, -5.691F, -5.0615F, -0.637F, 0.0F, 0.0F));
/*  81 */     PartDefinition Tail = partdefinition.m_171599_("Tail", CubeListBuilder.m_171558_(), 
/*  82 */         PartPose.m_171423_(0.0F, 15.0F, 2.0F, 1.0036F, 0.0F, 0.0F));
/*  83 */     PartDefinition cube_r2 = Tail.m_171599_("cube_r2", 
/*  84 */         CubeListBuilder.m_171558_().m_171514_(17, 31).m_171488_(-1.3F, 18.675F, 10.4769F, 3.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), 
/*  85 */         PartPose.m_171423_(0.0F, -13.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/*  86 */     PartDefinition cube_r3 = Tail.m_171599_("cube_r3", 
/*  87 */         CubeListBuilder.m_171558_().m_171514_(0, 0).m_171488_(-1.3F, 12.9867F, 5.0521F, 3.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)), 
/*  88 */         PartPose.m_171423_(0.0F, -13.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
/*  89 */     PartDefinition LeftArm = partdefinition.m_171599_("LeftArm", 
/*  90 */         CubeListBuilder.m_171558_().m_171514_(10, 55).m_171488_(-2.0F, -1.8F, -2.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F))
/*  91 */         .m_171514_(33, 38).m_171488_(-3.0F, 5.2F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  92 */         PartPose.m_171419_(-5.0F, 10.0F, 4.0F));
/*     */     
/*  94 */     PartDefinition RightArm = partdefinition.m_171599_("RightArm", 
/*  95 */         CubeListBuilder.m_171558_().m_171514_(0, 48).m_171488_(-1.0F, -1.8F, -2.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F))
/*  96 */         .m_171514_(0, 32).m_171488_(-1.0F, 5.2F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  97 */         PartPose.m_171419_(5.0F, 10.0F, 4.0F));
/*  98 */     PartDefinition LeftLeg = partdefinition.m_171599_("LeftLeg", 
/*  99 */         CubeListBuilder.m_171558_().m_171514_(38, 60).m_171488_(-2.0F, -0.8514F, -1.6826F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 100 */         PartPose.m_171423_(-2.0F, 20.75F, 0.0F, -1.9199F, 0.0F, 0.0F));
/* 101 */     PartDefinition LeftLeg_r1 = LeftLeg.m_171599_("LeftLeg_r1", 
/* 102 */         CubeListBuilder.m_171558_().m_171514_(23, 50).m_171488_(-4.0F, 3.784F, 4.9976F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 103 */         PartPose.m_171423_(2.0F, 16.7779F, -3.6805F, 0.9163F, 0.0F, 0.0F));
/* 104 */     PartDefinition cube_r4 = LeftLeg.m_171599_("cube_r4", 
/* 105 */         CubeListBuilder.m_171558_().m_171514_(55, 9).m_171488_(-2.0F, 0.2165F, 5.2991F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 106 */         PartPose.m_171423_(0.0F, 11.1332F, -3.301F, 0.5236F, 0.0F, 0.0F));
/* 107 */     PartDefinition cube_r5 = LeftLeg.m_171599_("cube_r5", 
/* 108 */         CubeListBuilder.m_171558_().m_171514_(12, 41).m_171488_(-2.0F, 4.6985F, 1.9106F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 109 */         PartPose.m_171423_(0.0F, 3.0785F, -8.4571F, 0.7854F, 0.0F, 0.0F));
/* 110 */     PartDefinition cube_r6 = LeftLeg.m_171599_("cube_r6", 
/* 111 */         CubeListBuilder.m_171558_().m_171514_(45, 46).m_171488_(-2.0F, -5.9256F, 5.0916F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 112 */         PartPose.m_171423_(0.0F, 3.0785F, -8.4571F, -0.3927F, 0.0F, 0.0F));
/* 113 */     PartDefinition RightLeg = partdefinition.m_171599_("RightLeg", 
/* 114 */         CubeListBuilder.m_171558_().m_171514_(49, 40).m_171488_(-2.0F, -0.9768F, -1.6824F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
/* 115 */         .m_171514_(47, 33).m_171488_(-2.0F, 10.8232F, -2.5926F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 116 */         PartPose.m_171423_(2.0F, 20.75F, 0.0F, -1.8937F, 0.0F, 1.3963F));
/* 117 */     PartDefinition cube_r7 = RightLeg.m_171599_("cube_r7", 
/* 118 */         CubeListBuilder.m_171558_().m_171514_(55, 0).m_171488_(6.8633F, 4.0294F, 4.8355F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 119 */         PartPose.m_171423_(-8.8633F, 0.3708F, -1.4818F, -0.3927F, 0.0F, 0.0F));
/* 120 */     PartDefinition cube_r8 = RightLeg.m_171599_("cube_r8", 
/* 121 */         CubeListBuilder.m_171558_().m_171514_(39, 3).m_171488_(6.8633F, 1.5923F, -4.8476F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 122 */         PartPose.m_171423_(-8.8633F, 0.3708F, -1.4818F, 0.7854F, 0.0F, 0.0F));
/* 123 */     PartDefinition cube_r9 = RightLeg.m_171599_("cube_r9", 
/* 124 */         CubeListBuilder.m_171558_().m_171514_(44, 19).m_171488_(6.8633F, -0.8706F, -0.3645F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 125 */         PartPose.m_171423_(-8.8633F, 0.3708F, -1.4818F, -0.3927F, 0.0F, 0.0F));
/* 126 */     return LayerDefinition.m_171565_(meshdefinition, 128, 128);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void m_7695_(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 132 */     this.Head.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 133 */     this.Body.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 134 */     this.Tail.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 135 */     this.LeftArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 136 */     this.RightArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 137 */     this.LeftLeg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 138 */     this.RightLeg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */   
/*     */   public void m_6973_(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
/* 142 */     this.Head.f_104204_ = netHeadYaw / 57.295776F;
/* 143 */     this.Head.f_104203_ = headPitch / 57.295776F;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\client\model\Modelhertx_sit_model_f.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */