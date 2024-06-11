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
/*     */ public class Modelqueen_spider_latex_model<T extends Entity>
/*     */   extends EntityModel<T>
/*     */ {
/*  25 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("turned", "modelqueen_spider_latex_model"), "main");
/*     */   
/*     */   public final ModelPart Head;
/*     */   public final ModelPart Body;
/*     */   public final ModelPart RightArm;
/*     */   public final ModelPart LeftArm;
/*     */   public final ModelPart LowerBody;
/*     */   public final ModelPart Rightleg;
/*     */   public final ModelPart Leftleg;
/*     */   
/*     */   public Modelqueen_spider_latex_model(ModelPart root) {
/*  36 */     this.Head = root.m_171324_("Head");
/*  37 */     this.Body = root.m_171324_("Body");
/*  38 */     this.RightArm = root.m_171324_("RightArm");
/*  39 */     this.LeftArm = root.m_171324_("LeftArm");
/*  40 */     this.LowerBody = root.m_171324_("LowerBody");
/*  41 */     this.Rightleg = root.m_171324_("Rightleg");
/*  42 */     this.Leftleg = root.m_171324_("Leftleg");
/*     */   }
/*     */   
/*     */   public static LayerDefinition createBodyLayer() {
/*  46 */     MeshDefinition meshdefinition = new MeshDefinition();
/*  47 */     PartDefinition partdefinition = meshdefinition.m_171576_();
/*  48 */     PartDefinition Head = partdefinition.m_171599_("Head", 
/*  49 */         CubeListBuilder.m_171558_().m_171514_(47, 74).m_171488_(-4.5F, -9.0F, -4.75F, 9.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)), 
/*  50 */         PartPose.m_171419_(0.0F, -9.5F, -11.5F));
/*  51 */     PartDefinition bone9 = Head.m_171599_("bone9", 
/*  52 */         CubeListBuilder.m_171558_().m_171514_(14, 6).m_171488_(-4.0941F, -4.5396F, -5.25F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), 
/*  53 */         PartPose.m_171423_(0.5F, 1.0F, -0.75F, 0.0F, 0.0F, -0.1745F));
/*  54 */     PartDefinition bone10 = Head.m_171599_("bone10", 
/*  55 */         CubeListBuilder.m_171558_().m_171514_(14, 0).m_171488_(-3.8706F, -3.4501F, -5.25F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), 
/*  56 */         PartPose.m_171423_(5.5F, 1.0F, -0.75F, 0.0F, 0.0F, 0.1745F));
/*  57 */     PartDefinition Body = partdefinition.m_171599_("Body", 
/*  58 */         CubeListBuilder.m_171558_().m_171514_(79, 29).m_171488_(-5.5F, 0.5F, -3.5F, 11.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)).m_171514_(98, 0)
/*  59 */         .m_171488_(-5.5F, 2.5F, -5.5F, 11.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(62, 17)
/*  60 */         .m_171488_(-5.5F, 1.5F, -4.5F, 11.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 16)
/*  61 */         .m_171488_(-2.5F, 0.0F, -2.5F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(0, 99)
/*  62 */         .m_171488_(-4.0F, 8.5F, -2.25F, 8.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(0, 0)
/*  63 */         .m_171488_(-3.0F, 1.5F, 2.75F, 6.0F, 15.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  64 */         PartPose.m_171419_(0.0F, -9.5F, -11.5F));
/*  65 */     PartDefinition RightArm = partdefinition.m_171599_("RightArm", 
/*  66 */         CubeListBuilder.m_171558_().m_171514_(12, 112).m_171488_(0.0F, -2.0F, -1.75F, 4.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)).m_171514_(26, 99)
/*  67 */         .m_171488_(-1.0F, 7.0F, -2.75F, 6.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(43, 101)
/*  68 */         .m_171488_(0.0F, 9.0F, -2.75F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), 
/*  69 */         PartPose.m_171419_(5.5F, -7.0F, -11.25F));
/*  70 */     PartDefinition LeftArm = partdefinition.m_171599_("LeftArm", 
/*  71 */         CubeListBuilder.m_171558_().m_171514_(0, 36).m_171488_(-4.0F, -2.0F, -1.75F, 4.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)).m_171514_(98, 50)
/*  72 */         .m_171488_(-5.0F, 7.0F, -2.75F, 6.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(61, 101)
/*  73 */         .m_171488_(-4.0F, 9.0F, -2.75F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), 
/*  74 */         PartPose.m_171419_(-5.5F, -7.0F, -11.25F));
/*  75 */     PartDefinition LowerBody = partdefinition.m_171599_("LowerBody", 
/*  76 */         CubeListBuilder.m_171558_().m_171514_(0, 36).m_171488_(-7.5F, 18.5F, -3.75F, 15.0F, 9.0F, 16.0F, new CubeDeformation(0.0F)).m_171514_(62, 0)
/*  77 */         .m_171488_(-6.5F, 19.5F, -5.75F, 13.0F, 7.0F, 10.0F, new CubeDeformation(0.0F)).m_171514_(0, 0)
/*  78 */         .m_171488_(-10.0F, 14.75F, 17.25F, 20.0F, 14.0F, 22.0F, new CubeDeformation(0.0F)).m_171514_(51, 51)
/*  79 */         .m_171488_(-9.0F, 15.75F, 31.25F, 18.0F, 12.0F, 11.0F, new CubeDeformation(0.0F)).m_171514_(88, 95)
/*  80 */         .m_171488_(-6.0F, 19.0F, 12.25F, 12.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(0, 61)
/*  81 */         .m_171488_(-7.0F, 16.5F, -3.25F, 14.0F, 6.0F, 14.0F, new CubeDeformation(0.0F)).m_171514_(46, 36)
/*  82 */         .m_171488_(-5.0F, 15.5F, -2.75F, 10.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)), 
/*  83 */         PartPose.m_171419_(0.0F, -9.5F, -11.5F));
/*  84 */     PartDefinition Rightleg = partdefinition.m_171599_("Rightleg", CubeListBuilder.m_171558_(), 
/*  85 */         PartPose.m_171423_(4.0F, 10.75F, -5.25F, 0.0F, 0.0F, 0.7854F));
/*  86 */     PartDefinition bone = Rightleg.m_171599_("bone", CubeListBuilder.m_171558_(), 
/*  87 */         PartPose.m_171423_(2.1469F, -3.7366F, 9.25F, -0.0524F, -0.2094F, 0.3927F));
/*  88 */     PartDefinition bone3 = bone.m_171599_("bone3", 
/*  89 */         CubeListBuilder.m_171558_().m_171514_(0, 112).m_171488_(-2.3886F, -15.2722F, 0.25F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)), 
/*  90 */         PartPose.m_171419_(1.3886F, 7.2722F, -2.25F));
/*  91 */     PartDefinition bone2 = bone.m_171599_("bone2", 
/*  92 */         CubeListBuilder.m_171558_().m_171514_(44, 95).m_171488_(0.6114F, -15.2722F, 0.25F, 19.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), 
/*  93 */         PartPose.m_171419_(1.3886F, 7.2722F, -2.25F));
/*  94 */     PartDefinition bone4 = Rightleg.m_171599_("bone4", CubeListBuilder.m_171558_(), 
/*  95 */         PartPose.m_171423_(2.1469F, -3.7366F, 5.0F, -0.0524F, -0.1047F, 0.3927F));
/*  96 */     PartDefinition bone5 = bone4.m_171599_("bone5", 
/*  97 */         CubeListBuilder.m_171558_().m_171514_(62, 111).m_171488_(-2.3886F, -15.2722F, 0.25F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)), 
/*  98 */         PartPose.m_171419_(1.3886F, 7.2722F, -2.25F));
/*  99 */     PartDefinition bone6 = bone4.m_171599_("bone6", 
/* 100 */         CubeListBuilder.m_171558_().m_171514_(0, 93).m_171488_(0.6114F, -15.2722F, 0.25F, 19.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 101 */         PartPose.m_171419_(1.3886F, 7.2722F, -2.25F));
/* 102 */     PartDefinition bone15 = Rightleg.m_171599_("bone15", CubeListBuilder.m_171558_(), 
/* 103 */         PartPose.m_171423_(2.1469F, -3.7366F, 1.0F, -0.0524F, 0.0F, 0.3927F));
/* 104 */     PartDefinition bone16 = bone15.m_171599_("bone16", 
/* 105 */         CubeListBuilder.m_171558_().m_171514_(109, 57).m_171488_(-2.3886F, -15.2722F, 0.25F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 106 */         PartPose.m_171419_(1.3886F, 7.2722F, -2.25F));
/* 107 */     PartDefinition bone17 = bone15.m_171599_("bone17", 
/* 108 */         CubeListBuilder.m_171558_().m_171514_(0, 87).m_171488_(0.6114F, -15.2722F, 0.25F, 19.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 109 */         PartPose.m_171419_(1.3886F, 7.2722F, -2.25F));
/* 110 */     PartDefinition bone7 = Rightleg.m_171599_("bone7", CubeListBuilder.m_171558_(), 
/* 111 */         PartPose.m_171423_(2.1469F, -3.7366F, 0.75F, -0.0524F, 0.1047F, 0.3927F));
/* 112 */     PartDefinition bone8 = bone7.m_171599_("bone8", 
/* 113 */         CubeListBuilder.m_171558_().m_171514_(50, 111).m_171488_(-1.9705F, -15.064F, -3.7226F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 114 */         PartPose.m_171419_(1.3886F, 7.2722F, -2.25F));
/* 115 */     PartDefinition bone11 = bone7.m_171599_("bone11", 
/* 116 */         CubeListBuilder.m_171558_().m_171514_(92, 44).m_171488_(1.0295F, -15.064F, -3.7226F, 19.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 117 */         PartPose.m_171419_(1.3886F, 7.2722F, -2.25F));
/* 118 */     PartDefinition bone12 = Rightleg.m_171599_("bone12", CubeListBuilder.m_171558_(), 
/* 119 */         PartPose.m_171423_(2.1469F, -3.7366F, -3.25F, -0.0524F, 0.2094F, 0.3927F));
/* 120 */     PartDefinition bone13 = bone12.m_171599_("bone13", 
/* 121 */         CubeListBuilder.m_171558_().m_171514_(38, 111).m_171488_(-1.557F, -15.0674F, -3.6572F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 122 */         PartPose.m_171419_(1.3886F, 7.2722F, -2.25F));
/* 123 */     PartDefinition bone14 = bone12.m_171599_("bone14", 
/* 124 */         CubeListBuilder.m_171558_().m_171514_(80, 89).m_171488_(1.443F, -15.0674F, -3.6572F, 19.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 125 */         PartPose.m_171419_(1.3886F, 7.2722F, -2.25F));
/* 126 */     PartDefinition Leftleg = partdefinition.m_171599_("Leftleg", CubeListBuilder.m_171558_(), 
/* 127 */         PartPose.m_171423_(-4.0F, 10.75F, -5.25F, 0.0F, 0.0F, -0.7854F));
/* 128 */     PartDefinition bone18 = Leftleg.m_171599_("bone18", CubeListBuilder.m_171558_(), 
/* 129 */         PartPose.m_171423_(-2.1469F, -3.7366F, 9.25F, -0.0524F, 0.2094F, -0.3927F));
/* 130 */     PartDefinition bone19 = bone18.m_171599_("bone19", 
/* 131 */         CubeListBuilder.m_171558_().m_171514_(103, 108).m_171488_(-0.6114F, -15.2722F, 0.25F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 132 */         PartPose.m_171419_(-1.3886F, 7.2722F, -2.25F));
/* 133 */     PartDefinition bone20 = bone18.m_171599_("bone20", 
/* 134 */         CubeListBuilder.m_171558_().m_171514_(84, 23).m_171488_(-19.6114F, -15.2722F, 0.25F, 19.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 135 */         PartPose.m_171419_(-1.3886F, 7.2722F, -2.25F));
/* 136 */     PartDefinition bone21 = Leftleg.m_171599_("bone21", CubeListBuilder.m_171558_(), 
/* 137 */         PartPose.m_171423_(-2.1469F, -3.7366F, 5.0F, -0.0524F, 0.1047F, -0.3927F));
/* 138 */     PartDefinition bone22 = bone21.m_171599_("bone22", 
/* 139 */         CubeListBuilder.m_171558_().m_171514_(91, 108).m_171488_(-0.6114F, -15.2722F, 0.25F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 140 */         PartPose.m_171419_(-1.3886F, 7.2722F, -2.25F));
/* 141 */     PartDefinition bone23 = bone21.m_171599_("bone23", 
/* 142 */         CubeListBuilder.m_171558_().m_171514_(84, 17).m_171488_(-19.6114F, -15.2722F, 0.25F, 19.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 143 */         PartPose.m_171419_(-1.3886F, 7.2722F, -2.25F));
/* 144 */     PartDefinition bone24 = Leftleg.m_171599_("bone24", CubeListBuilder.m_171558_(), 
/* 145 */         PartPose.m_171423_(-2.1469F, -3.7366F, 1.0F, -0.0524F, 0.0F, -0.3927F));
/* 146 */     PartDefinition bone25 = bone24.m_171599_("bone25", 
/* 147 */         CubeListBuilder.m_171558_().m_171514_(26, 106).m_171488_(-0.6114F, -15.2722F, 0.25F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 148 */         PartPose.m_171419_(-1.3886F, 7.2722F, -2.25F));
/* 149 */     PartDefinition bone26 = bone24.m_171599_("bone26", 
/* 150 */         CubeListBuilder.m_171558_().m_171514_(83, 83).m_171488_(-19.6114F, -15.2722F, 0.25F, 19.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 151 */         PartPose.m_171419_(-1.3886F, 7.2722F, -2.25F));
/* 152 */     PartDefinition bone27 = Leftleg.m_171599_("bone27", CubeListBuilder.m_171558_(), 
/* 153 */         PartPose.m_171423_(-2.1469F, -3.7366F, 0.75F, -0.0524F, -0.1047F, -0.3927F));
/* 154 */     PartDefinition bone28 = bone27.m_171599_("bone28", 
/* 155 */         CubeListBuilder.m_171558_().m_171514_(79, 105).m_171488_(-1.0295F, -15.064F, -3.7226F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 156 */         PartPose.m_171419_(-1.3886F, 7.2722F, -2.25F));
/* 157 */     PartDefinition bone29 = bone27.m_171599_("bone29", 
/* 158 */         CubeListBuilder.m_171558_().m_171514_(0, 81).m_171488_(-20.0295F, -15.064F, -3.7226F, 19.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 159 */         PartPose.m_171419_(-1.3886F, 7.2722F, -2.25F));
/* 160 */     PartDefinition bone30 = Leftleg.m_171599_("bone30", CubeListBuilder.m_171558_(), 
/* 161 */         PartPose.m_171423_(-2.1469F, -3.7366F, -3.25F, -0.0524F, -0.2094F, -0.3927F));
/* 162 */     PartDefinition bone31 = bone30.m_171599_("bone31", 
/* 163 */         CubeListBuilder.m_171558_().m_171514_(0, 61).m_171488_(-1.443F, -15.0674F, -3.6572F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 164 */         PartPose.m_171419_(-1.3886F, 7.2722F, -2.25F));
/* 165 */     PartDefinition bone32 = bone30.m_171599_("bone32", 
/* 166 */         CubeListBuilder.m_171558_().m_171514_(74, 74).m_171488_(-20.443F, -15.0674F, -3.6572F, 19.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 167 */         PartPose.m_171419_(-1.3886F, 7.2722F, -2.25F));
/* 168 */     return LayerDefinition.m_171565_(meshdefinition, 256, 256);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void m_7695_(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 174 */     this.Head.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 175 */     this.Body.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 176 */     this.RightArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 177 */     this.LeftArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 178 */     this.LowerBody.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 179 */     this.Rightleg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 180 */     this.Leftleg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */   
/*     */   public void m_6973_(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
/* 184 */     this.RightArm.f_104203_ = Mth.m_14089_(limbSwing * 0.6662F + 3.1415927F) * limbSwingAmount;
/* 185 */     this.Leftleg.f_104203_ = Mth.m_14089_(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
/* 186 */     this.Head.f_104204_ = netHeadYaw / 57.295776F;
/* 187 */     this.Head.f_104203_ = headPitch / 57.295776F;
/* 188 */     this.LeftArm.f_104203_ = Mth.m_14089_(limbSwing * 0.6662F) * limbSwingAmount;
/* 189 */     this.Rightleg.f_104203_ = Mth.m_14089_(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\client\model\Modelqueen_spider_latex_model.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */