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
/*     */ public class ModelAHV_hertx_sit_model<T extends Entity>
/*     */   extends EntityModel<T>
/*     */ {
/*  24 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("turned", "model_ahv_hertx_sit_model"), "main");
/*     */   
/*     */   public final ModelPart Head;
/*     */   public final ModelPart Body;
/*     */   public final ModelPart Tail;
/*     */   public final ModelPart LeftArm;
/*     */   public final ModelPart RightArm;
/*     */   public final ModelPart LeftLeg;
/*     */   public final ModelPart RightLeg;
/*     */   
/*     */   public ModelAHV_hertx_sit_model(ModelPart root) {
/*  35 */     this.Head = root.m_171324_("Head");
/*  36 */     this.Body = root.m_171324_("Body");
/*  37 */     this.Tail = root.m_171324_("Tail");
/*  38 */     this.LeftArm = root.m_171324_("LeftArm");
/*  39 */     this.RightArm = root.m_171324_("RightArm");
/*  40 */     this.LeftLeg = root.m_171324_("LeftLeg");
/*  41 */     this.RightLeg = root.m_171324_("RightLeg");
/*     */   }
/*     */   
/*     */   public static LayerDefinition createBodyLayer() {
/*  45 */     MeshDefinition meshdefinition = new MeshDefinition();
/*  46 */     PartDefinition partdefinition = meshdefinition.m_171576_();
/*  47 */     PartDefinition Head = partdefinition.m_171599_("Head", 
/*  48 */         CubeListBuilder.m_171558_().m_171514_(21, 8).m_171488_(-3.0F, -2.3F, -5.2F, 6.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).m_171514_(56, 43)
/*  49 */         .m_171488_(-2.0F, -3.4F, -3.2F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(16, 66)
/*  50 */         .m_171488_(-2.0F, -7.4F, 1.8F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).m_171514_(38, 0)
/*  51 */         .m_171488_(-2.0F, -3.4F, 2.8F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(30, 59)
/*  52 */         .m_171488_(-3.0F, -3.4F, 1.8F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(24, 16)
/*  53 */         .m_171488_(-3.0F, -1.4F, -3.1F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(3, 4)
/*  54 */         .m_171488_(2.0F, -7.4F, 1.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 0)
/*  55 */         .m_171488_(-3.0F, -7.4F, 1.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(19, 0)
/*  56 */         .m_171488_(-3.0F, -7.4F, -5.2F, 6.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).m_171514_(50, 22)
/*  57 */         .m_171488_(2.0F, -6.4F, -5.2F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).m_171514_(55, 5)
/*  58 */         .m_171488_(2.0F, -3.3F, -5.2F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).m_171514_(41, 29)
/*  59 */         .m_171488_(-3.0F, -6.4F, -5.2F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).m_171514_(53, 53)
/*  60 */         .m_171488_(-3.0F, -3.3F, -5.2F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).m_171514_(32, 38)
/*  61 */         .m_171488_(-2.0F, -6.4F, -5.2F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(20, 16)
/*  62 */         .m_171488_(-2.0F, -3.3F, -5.2F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  63 */         PartPose.m_171419_(0.0F, 8.0F, 0.0F));
/*  64 */     PartDefinition cube_r1 = Head.m_171599_("cube_r1", 
/*  65 */         CubeListBuilder.m_171558_().m_171514_(0, 14).m_171488_(-3.0F, 1.2791F, 6.9211F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(69, 39)
/*  66 */         .m_171488_(-3.0F, 1.2791F, 1.9211F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(4, 0)
/*  67 */         .m_171488_(2.0F, 1.2791F, 6.9211F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(46, 65).m_171488_(2.0F, 1.2791F, 1.9211F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), 
/*     */         
/*  69 */         PartPose.m_171423_(0.0F, -7.6F, -0.2F, 0.2618F, 0.0F, 0.0F));
/*  70 */     PartDefinition Body = partdefinition.m_171599_("Body", 
/*  71 */         CubeListBuilder.m_171558_().m_171514_(0, 14).m_171488_(-4.0F, -0.8F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(0, 58)
/*  72 */         .m_171488_(-4.0F, -0.8F, -3.0F, 8.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(43, 23)
/*  73 */         .m_171488_(-3.0F, -0.8F, -3.3F, 6.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(66, 28)
/*  74 */         .m_171488_(-3.0F, 5.2F, -2.6F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  75 */         PartPose.m_171419_(0.0F, 8.0F, 0.0F));
/*  76 */     PartDefinition Tail = partdefinition.m_171599_("Tail", CubeListBuilder.m_171558_(), 
/*  77 */         PartPose.m_171423_(0.0F, 19.0F, 1.0F, 0.0F, -0.5672F, 0.0F));
/*  78 */     PartDefinition cube_r2 = Tail.m_171599_("cube_r2", 
/*  79 */         CubeListBuilder.m_171558_().m_171514_(17, 36).m_171488_(-2.3F, 15.7384F, 3.3388F, 4.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)), 
/*  80 */         PartPose.m_171419_(0.5F, -18.0F, -4.0F));
/*  81 */     PartDefinition cube_r3 = Tail.m_171599_("cube_r3", 
/*  82 */         CubeListBuilder.m_171558_().m_171514_(0, 0).m_171488_(-2.8F, 16.2678F, -6.6465F, 5.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)), 
/*  83 */         PartPose.m_171423_(0.5F, -18.0F, -4.0F, 0.7854F, 0.0F, 0.0F));
/*  84 */     PartDefinition cube_r10 = Tail.m_171599_("cube_r10", 
/*  85 */         CubeListBuilder.m_171558_().m_171514_(24, 24).m_171488_(-3.8F, 9.7028F, -13.3744F, 7.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), 
/*  86 */         PartPose.m_171423_(5.5F, -18.0F, -2.0F, 1.5708F, -0.3927F, 0.0F));
/*  87 */     PartDefinition cube_r10_r1 = cube_r10.m_171599_("cube_r10_r1", 
/*  88 */         CubeListBuilder.m_171558_().m_171514_(57, 39).m_171488_(-4.3222F, -2.8968F, -7.1705F, 7.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
/*  89 */         .m_171514_(0, 30).m_171488_(-4.3222F, -4.8968F, -12.1705F, 7.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), 
/*  90 */         PartPose.m_171423_(-1.6967F, 14.025F, 3.7962F, 0.0F, 0.0F, 1.9635F));
/*  91 */     PartDefinition uppertailjaw = cube_r10.m_171599_("uppertailjaw", CubeListBuilder.m_171558_(), PartPose.m_171419_(0.0F, 24.0F, 0.0F));
/*  92 */     PartDefinition uppertailjaw_r1 = uppertailjaw.m_171599_("uppertailjaw_r1", 
/*  93 */         CubeListBuilder.m_171558_().m_171514_(39, 39).m_171488_(-4.3222F, -0.8968F, -10.1705F, 7.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  94 */         PartPose.m_171423_(-1.6967F, -9.975F, 3.7962F, 0.0F, 0.0F, 1.9635F));
/*  95 */     PartDefinition lowertailjaw = cube_r10.m_171599_("lowertailjaw", CubeListBuilder.m_171558_(), 
/*  96 */         PartPose.m_171423_(0.0F, 24.0F, 0.0F, -0.1309F, 0.0F, 0.0F));
/*  97 */     PartDefinition lowertailjaw_r1 = lowertailjaw.m_171599_("lowertailjaw_r1", 
/*  98 */         CubeListBuilder.m_171558_().m_171514_(57, 32).m_171488_(-4.3222F, 0.4384F, -12.2007F, 7.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), 
/*  99 */         PartPose.m_171423_(-1.6967F, -10.3852F, 2.4617F, -0.1812F, -0.1209F, 1.9665F));
/* 100 */     PartDefinition LeftArm = partdefinition.m_171599_("LeftArm", 
/* 101 */         CubeListBuilder.m_171558_().m_171514_(45, 0).m_171488_(-2.8393F, -1.9591F, -1.2349F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F))
/* 102 */         .m_171514_(59, 22).m_171488_(-2.8393F, 9.0409F, -1.2349F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(40, 58)
/* 103 */         .m_171488_(-2.8393F, 6.0409F, -1.2349F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(22, 1)
/* 104 */         .m_171488_(-2.8393F, 12.0409F, -1.2349F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(19, 4)
/* 105 */         .m_171488_(-0.8393F, 12.0409F, -1.2349F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(62, 55)
/* 106 */         .m_171488_(-2.8393F, 11.0409F, -1.2349F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(19, 2)
/* 107 */         .m_171488_(-2.8393F, 12.0409F, 0.2651F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(19, 0)
/* 108 */         .m_171488_(-2.8393F, 12.0409F, 1.7651F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 109 */         PartPose.m_171423_(-5.0F, 9.0F, 0.0F, -0.3914F, 0.0334F, 0.0807F));
/* 110 */     PartDefinition RightArm = partdefinition.m_171599_("RightArm", 
/* 111 */         CubeListBuilder.m_171558_().m_171514_(0, 39).m_171488_(-1.1607F, -1.9591F, -1.2349F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F))
/* 112 */         .m_171514_(66, 66).m_171488_(-1.1607F, 11.0409F, -1.2349F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(18, 59)
/* 113 */         .m_171488_(-1.1607F, 6.0409F, -1.2349F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(62, 49)
/* 114 */         .m_171488_(-1.1607F, 9.0409F, -1.2349F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(24, 18)
/* 115 */         .m_171488_(-0.1607F, 12.0409F, -1.2349F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(24, 24)
/* 116 */         .m_171488_(1.8393F, 12.0409F, -1.2349F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(22, 5)
/* 117 */         .m_171488_(1.8393F, 12.0409F, 0.2651F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(22, 3)
/* 118 */         .m_171488_(1.8393F, 12.0409F, 1.7651F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 119 */         PartPose.m_171423_(5.0F, 9.0F, 0.0F, -0.3914F, -0.0334F, -0.0807F));
/* 120 */     PartDefinition LeftLeg = partdefinition.m_171599_("LeftLeg", 
/* 121 */         CubeListBuilder.m_171558_().m_171514_(30, 65).m_171488_(-2.2578F, -2.0692F, -1.0721F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
/* 122 */         .m_171514_(0, 65).m_171488_(-2.2578F, 9.7308F, -1.4823F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 123 */         PartPose.m_171423_(-2.0F, 20.0F, 0.0F, -1.8762F, 0.0873F, -0.2618F));
/* 124 */     PartDefinition cube_r4 = LeftLeg.m_171599_("cube_r4", 
/* 125 */         CubeListBuilder.m_171558_().m_171514_(59, 13).m_171488_(-4.3205F, -1.1325F, 9.79F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 126 */         PartPose.m_171423_(2.0627F, 2.1513F, -7.4241F, -0.3927F, 0.0F, 0.0F));
/* 127 */     PartDefinition cube_r5 = LeftLeg.m_171599_("cube_r5", 
/* 128 */         CubeListBuilder.m_171558_().m_171514_(28, 48).m_171488_(-4.3205F, 4.1942F, 1.8173F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 129 */         PartPose.m_171423_(2.0627F, 2.1513F, -7.4241F, 0.7854F, 0.0F, 0.0F));
/* 130 */     PartDefinition cube_r6 = LeftLeg.m_171599_("cube_r6", 
/* 131 */         CubeListBuilder.m_171558_().m_171514_(44, 48).m_171488_(-4.3205F, -6.0325F, 4.59F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 132 */         PartPose.m_171423_(2.0627F, 2.1513F, -7.4241F, -0.3927F, 0.0F, 0.0F));
/* 133 */     PartDefinition RightLeg = partdefinition.m_171599_("RightLeg", 
/* 134 */         CubeListBuilder.m_171558_().m_171514_(64, 6).m_171488_(-1.7422F, -2.0692F, -1.0721F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
/* 135 */         .m_171514_(64, 0).m_171488_(-1.7422F, 9.7308F, -1.4823F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 136 */         PartPose.m_171423_(2.0F, 20.0F, 0.0F, -1.8762F, -0.0873F, 0.2618F));
/* 137 */     PartDefinition cube_r7 = RightLeg.m_171599_("cube_r7", 
/* 138 */         CubeListBuilder.m_171558_().m_171514_(56, 61).m_171488_(0.3205F, -1.1325F, 9.79F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 139 */         PartPose.m_171423_(-2.0627F, 2.1513F, -7.4241F, -0.3927F, 0.0F, 0.0F));
/* 140 */     PartDefinition cube_r8 = RightLeg.m_171599_("cube_r8", 
/* 141 */         CubeListBuilder.m_171558_().m_171514_(12, 47).m_171488_(0.3205F, 4.1942F, 1.8173F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 142 */         PartPose.m_171423_(-2.0627F, 2.1513F, -7.4241F, 0.7854F, 0.0F, 0.0F));
/* 143 */     PartDefinition cube_r9 = RightLeg.m_171599_("cube_r9", 
/* 144 */         CubeListBuilder.m_171558_().m_171514_(43, 12).m_171488_(0.3205F, -6.0325F, 4.59F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 145 */         PartPose.m_171423_(-2.0627F, 2.1513F, -7.4241F, -0.3927F, 0.0F, 0.0F));
/* 146 */     return LayerDefinition.m_171565_(meshdefinition, 128, 128);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void m_7695_(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 152 */     this.Head.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 153 */     this.Body.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 154 */     this.Tail.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 155 */     this.LeftArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 156 */     this.RightArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 157 */     this.LeftLeg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 158 */     this.RightLeg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */   
/*     */   public void m_6973_(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
/* 162 */     this.Head.f_104204_ = netHeadYaw / 57.295776F;
/* 163 */     this.Head.f_104203_ = headPitch / 57.295776F;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\client\model\ModelAHV_hertx_sit_model.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */