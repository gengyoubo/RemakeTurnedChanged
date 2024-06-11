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
/*     */ public class Modeldark_latex_noise_stalker<T extends Entity>
/*     */   extends EntityModel<T>
/*     */ {
/*  25 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("turned", "modeldark_latex_noise_stalker"), "main");
/*     */   
/*     */   public final ModelPart Head;
/*     */   public final ModelPart Body;
/*     */   public final ModelPart Tail;
/*     */   public final ModelPart LeftArm;
/*     */   public final ModelPart RightArm;
/*     */   public final ModelPart LeftLeg;
/*     */   public final ModelPart RightLeg;
/*     */   
/*     */   public Modeldark_latex_noise_stalker(ModelPart root) {
/*  36 */     this.Head = root.m_171324_("Head");
/*  37 */     this.Body = root.m_171324_("Body");
/*  38 */     this.Tail = root.m_171324_("Tail");
/*  39 */     this.LeftArm = root.m_171324_("LeftArm");
/*  40 */     this.RightArm = root.m_171324_("RightArm");
/*  41 */     this.LeftLeg = root.m_171324_("LeftLeg");
/*  42 */     this.RightLeg = root.m_171324_("RightLeg");
/*     */   }
/*     */   
/*     */   public static LayerDefinition createBodyLayer() {
/*  46 */     MeshDefinition meshdefinition = new MeshDefinition();
/*  47 */     PartDefinition partdefinition = meshdefinition.m_171576_();
/*  48 */     PartDefinition Head = partdefinition.m_171599_("Head", 
/*  49 */         CubeListBuilder.m_171558_().m_171514_(0, 5).m_171488_(2.0F, -6.0F, -4.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(2, 4)
/*  50 */         .m_171488_(0.0F, -6.0F, -4.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(4, 3)
/*  51 */         .m_171488_(-1.0F, -6.0F, -4.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(4, 2)
/*  52 */         .m_171488_(-3.0F, -6.0F, -4.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(2, 2)
/*  53 */         .m_171488_(-4.0F, -6.0F, -4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 2)
/*  54 */         .m_171488_(-4.0F, -6.0F, -2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(2, 1)
/*  55 */         .m_171488_(4.0F, -6.0F, -4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 1)
/*  56 */         .m_171488_(4.0F, -6.0F, -2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 0)
/*  57 */         .m_171488_(-4.0F, -12.0F, -4.0F, 8.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)).m_171514_(48, 21)
/*  58 */         .m_171488_(-4.0F, -12.0F, 4.0F, 8.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), 
/*  59 */         PartPose.m_171419_(0.0F, 0.0F, -1.0F));
/*  60 */     PartDefinition cube_r1 = Head.m_171599_("cube_r1", 
/*  61 */         CubeListBuilder.m_171558_().m_171514_(65, 46).m_171488_(-4.0F, -7.75F, 4.5F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(46, 66)
/*  62 */         .m_171488_(-11.3F, -7.75F, 4.5F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(63, 61)
/*  63 */         .m_171488_(-4.0F, -7.75F, -0.5F, 2.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(0, 65).m_171488_(-11.3F, -7.75F, -0.5F, 2.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), 
/*     */         
/*  65 */         PartPose.m_171423_(6.6F, -4.0F, 2.2F, 0.2182F, 0.0F, 0.0F));
/*  66 */     PartDefinition cube_r2 = Head.m_171599_("cube_r2", 
/*  67 */         CubeListBuilder.m_171558_().m_171514_(55, 14).m_171488_(-3.0F, -2.0F, -4.0F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  68 */         PartPose.m_171423_(0.0F, -3.4F, 0.7F, 0.1745F, 0.0F, 0.0F));
/*  69 */     PartDefinition cube_r3 = Head.m_171599_("cube_r3", 
/*  70 */         CubeListBuilder.m_171558_().m_171514_(18, 43).m_171488_(-4.0F, -2.0F, 0.0F, 8.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(4, 1)
/*  71 */         .m_171488_(-2.0F, -2.0F, -4.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(4, 4)
/*  72 */         .m_171488_(1.0F, -2.0F, -4.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(3, 0)
/*  73 */         .m_171488_(-4.0F, -2.0F, -4.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(0, 4)
/*  74 */         .m_171488_(3.0F, -2.0F, -4.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(17, 14).m_171488_(-4.0F, -1.0F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), 
/*     */         
/*  76 */         PartPose.m_171423_(0.0F, -4.0F, 0.3F, 0.1745F, 0.0F, 0.0F));
/*  77 */     PartDefinition Body = partdefinition.m_171599_("Body", 
/*  78 */         CubeListBuilder.m_171558_().m_171514_(24, 25).m_171488_(-5.0F, -4.0F, -2.0F, 10.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(22, 35)
/*  79 */         .m_171488_(-4.0F, 2.0F, -2.0F, 8.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(24, 0)
/*  80 */         .m_171488_(-5.0F, 6.0F, -2.0F, 10.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  81 */         PartPose.m_171419_(0.0F, 0.0F, 0.0F));
/*  82 */     PartDefinition Tail = partdefinition.m_171599_("Tail", CubeListBuilder.m_171558_(), PartPose.m_171419_(0.0F, 0.0F, 0.0F));
/*  83 */     PartDefinition cube_r4 = Tail.m_171599_("cube_r4", 
/*  84 */         CubeListBuilder.m_171558_().m_171514_(0, 14).m_171488_(-1.5F, -1.75F, 1.0F, 3.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)), 
/*  85 */         PartPose.m_171423_(0.0F, 10.6288F, 7.2606F, -0.2618F, 0.0F, 0.0F));
/*  86 */     PartDefinition cube_r5 = Tail.m_171599_("cube_r5", 
/*  87 */         CubeListBuilder.m_171558_().m_171514_(0, 29).m_171488_(-1.5F, -0.75F, -6.0F, 3.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), 
/*  88 */         PartPose.m_171423_(0.0F, 10.2169F, 6.6575F, -0.3927F, 0.0F, 0.0F));
/*  89 */     PartDefinition LeftArm = partdefinition.m_171599_("LeftArm", 
/*  90 */         CubeListBuilder.m_171558_().m_171514_(0, 0).m_171488_(-5.7098F, 9.3629F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 0)
/*  91 */         .m_171488_(-5.7098F, 9.3629F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 0)
/*  92 */         .m_171488_(-5.7098F, 9.3629F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 40)
/*  93 */         .m_171488_(-5.7098F, 1.3629F, -2.0F, 5.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  94 */         PartPose.m_171419_(-5.0F, 2.0F, 0.0F));
/*  95 */     PartDefinition cube_r6 = LeftArm.m_171599_("cube_r6", 
/*  96 */         CubeListBuilder.m_171558_().m_171514_(47, 30).m_171488_(-4.0F, -5.0F, -2.8F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), 
/*  97 */         PartPose.m_171423_(0.1F, -1.6F, 0.3F, 0.0F, 0.0F, -0.2618F));
/*  98 */     PartDefinition cube_r7 = LeftArm.m_171599_("cube_r7", 
/*  99 */         CubeListBuilder.m_171558_().m_171514_(16, 57).m_171488_(-3.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 100 */         PartPose.m_171423_(-1.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.1745F));
/* 101 */     PartDefinition RightArm = partdefinition.m_171599_("RightArm", 
/* 102 */         CubeListBuilder.m_171558_().m_171514_(0, 40).m_171480_().m_171488_(0.7098F, 1.3629F, -2.0F, 5.0F, 8.0F, 4.0F, new CubeDeformation(0.0F))
/* 103 */         .m_171555_(false).m_171514_(0, 0).m_171480_().m_171488_(4.7098F, 9.3629F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
/* 104 */         .m_171555_(false).m_171514_(0, 0).m_171480_().m_171488_(4.7098F, 9.3629F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
/* 105 */         .m_171555_(false).m_171514_(0, 0).m_171480_().m_171488_(4.7098F, 9.3629F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
/* 106 */         .m_171555_(false), 
/* 107 */         PartPose.m_171419_(5.0F, 2.0F, 0.0F));
/*     */     
/* 109 */     PartDefinition cube_r8 = RightArm.m_171599_("cube_r8", 
/* 110 */         CubeListBuilder.m_171558_().m_171514_(16, 57).m_171480_()
/* 111 */         .m_171488_(-1.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).m_171555_(false), 
/* 112 */         PartPose.m_171423_(1.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.1745F));
/* 113 */     PartDefinition cube_r9 = RightArm.m_171599_("cube_r9", 
/* 114 */         CubeListBuilder.m_171558_().m_171514_(13, 48).m_171488_(-1.0F, -5.0F, -2.8F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 115 */         PartPose.m_171423_(-0.1F, -1.6F, 0.3F, 0.0F, 0.0F, 0.2618F));
/* 116 */     PartDefinition LeftLeg = partdefinition.m_171599_("LeftLeg", 
/* 117 */         CubeListBuilder.m_171558_().m_171514_(60, 39).m_171488_(-3.0F, -3.0F, -2.0F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
/* 118 */         .m_171514_(62, 29).m_171488_(-3.125F, 9.9239F, -3.3827F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 119 */         PartPose.m_171419_(-2.0F, 12.0F, 0.0F));
/* 120 */     PartDefinition cube_r10 = LeftLeg.m_171599_("cube_r10", 
/* 121 */         CubeListBuilder.m_171558_().m_171514_(0, 54).m_171488_(-3.0F, -2.0F, -1.0F, 5.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 122 */         PartPose.m_171423_(-0.125F, 5.4614F, 1.379F, -0.4538F, 0.0F, 0.0F));
/* 123 */     PartDefinition cube_r11 = LeftLeg.m_171599_("cube_r11", 
/* 124 */         CubeListBuilder.m_171558_().m_171514_(41, 7).m_171488_(-3.0F, -3.0F, -2.0F, 5.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 125 */         PartPose.m_171423_(-0.125F, 4.0006F, -0.3861F, 0.9861F, 0.0F, 0.0F));
/* 126 */     PartDefinition cube_r12 = LeftLeg.m_171599_("cube_r12", 
/* 127 */         CubeListBuilder.m_171558_().m_171514_(51, 50).m_171488_(-3.0F, -3.0F, -2.0F, 5.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 128 */         PartPose.m_171423_(0.0F, 2.0063F, -0.9958F, -0.3927F, 0.0F, 0.0F));
/* 129 */     PartDefinition RightLeg = partdefinition.m_171599_("RightLeg", 
/* 130 */         CubeListBuilder.m_171558_().m_171514_(32, 60).m_171488_(-2.0F, -3.0F, -2.0F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
/* 131 */         .m_171514_(50, 60).m_171488_(-1.875F, 9.9239F, -3.3827F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 132 */         PartPose.m_171419_(2.0F, 12.0F, 0.0F));
/* 133 */     PartDefinition cube_r13 = RightLeg.m_171599_("cube_r13", 
/* 134 */         CubeListBuilder.m_171558_().m_171514_(55, 0).m_171488_(-2.0F, -2.0F, -1.0F, 5.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 135 */         PartPose.m_171423_(0.125F, 5.4614F, 1.379F, -0.4538F, 0.0F, 0.0F));
/* 136 */     PartDefinition cube_r14 = RightLeg.m_171599_("cube_r14", 
/* 137 */         CubeListBuilder.m_171558_().m_171514_(42, 39).m_171488_(-2.0F, -3.0F, -2.0F, 5.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 138 */         PartPose.m_171423_(0.125F, 4.0006F, -0.3861F, 0.9861F, 0.0F, 0.0F));
/* 139 */     PartDefinition cube_r15 = RightLeg.m_171599_("cube_r15", 
/* 140 */         CubeListBuilder.m_171558_().m_171514_(33, 50).m_171488_(-2.0F, -3.0F, -2.0F, 5.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 141 */         PartPose.m_171423_(0.0F, 2.0063F, -0.9958F, -0.3927F, 0.0F, 0.0F));
/* 142 */     return LayerDefinition.m_171565_(meshdefinition, 80, 80);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void m_7695_(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 148 */     this.Head.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 149 */     this.Body.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 150 */     this.Tail.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 151 */     this.LeftArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 152 */     this.RightArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 153 */     this.LeftLeg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 154 */     this.RightLeg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */   
/*     */   public void m_6973_(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
/* 158 */     this.RightArm.f_104203_ = Mth.m_14089_(limbSwing * 0.6662F + 3.1415927F) * limbSwingAmount;
/* 159 */     this.LeftLeg.f_104203_ = Mth.m_14089_(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
/* 160 */     this.Head.f_104204_ = netHeadYaw / 57.295776F;
/* 161 */     this.Head.f_104203_ = headPitch / 57.295776F;
/* 162 */     this.LeftArm.f_104203_ = Mth.m_14089_(limbSwing * 0.6662F) * limbSwingAmount;
/* 163 */     this.RightLeg.f_104203_ = Mth.m_14089_(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\client\model\Modeldark_latex_noise_stalker.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */