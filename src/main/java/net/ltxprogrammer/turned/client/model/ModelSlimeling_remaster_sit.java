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
/*     */ public class ModelSlimeling_remaster_sit<T extends Entity>
/*     */   extends EntityModel<T>
/*     */ {
/*  24 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("turned", "model_slimeling_remaster_sit"), "main");
/*     */   
/*     */   public final ModelPart LeftLeg;
/*     */   public final ModelPart RightLeg;
/*     */   public final ModelPart LeftArm;
/*     */   public final ModelPart RightArm;
/*     */   public final ModelPart Body;
/*     */   public final ModelPart Head;
/*     */   
/*     */   public ModelSlimeling_remaster_sit(ModelPart root) {
/*  34 */     this.LeftLeg = root.m_171324_("LeftLeg");
/*  35 */     this.RightLeg = root.m_171324_("RightLeg");
/*  36 */     this.LeftArm = root.m_171324_("LeftArm");
/*  37 */     this.RightArm = root.m_171324_("RightArm");
/*  38 */     this.Body = root.m_171324_("Body");
/*  39 */     this.Head = root.m_171324_("Head");
/*     */   }
/*     */   
/*     */   public static LayerDefinition createBodyLayer() {
/*  43 */     MeshDefinition meshdefinition = new MeshDefinition();
/*  44 */     PartDefinition partdefinition = meshdefinition.m_171576_();
/*  45 */     PartDefinition LeftLeg = partdefinition.m_171599_("LeftLeg", CubeListBuilder.m_171558_(), 
/*  46 */         PartPose.m_171423_(-2.0F, 21.0F, 0.0F, -1.6583F, 0.1307F, 0.0F));
/*  47 */     PartDefinition cube_r11 = LeftLeg.m_171599_("cube_r11", 
/*  48 */         CubeListBuilder.m_171558_().m_171514_(52, 18).m_171488_(-1.375F, -4.0F, -2.375F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), 
/*  49 */         PartPose.m_171423_(-1.0F, 3.85F, 0.0F, -0.0436F, 0.0F, 0.0F));
/*  50 */     PartDefinition cube_r12 = LeftLeg.m_171599_("cube_r12", 
/*  51 */         CubeListBuilder.m_171558_().m_171514_(34, 17).m_171488_(-2.375F, -3.0F, -2.375F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), 
/*  52 */         PartPose.m_171423_(-0.375F, 3.475F, 0.0F, -0.0436F, 0.0F, 0.0F));
/*  53 */     PartDefinition bone2 = LeftLeg.m_171599_("bone2", CubeListBuilder.m_171558_(), 
/*  54 */         PartPose.m_171423_(-1.25F, 4.0398F, 2.347F, -0.0019F, 0.0436F, -0.2618F));
/*  55 */     PartDefinition cube_r13 = bone2.m_171599_("cube_r13", 
/*  56 */         CubeListBuilder.m_171558_().m_171514_(54, 31).m_171488_(-2.0F, -1.0F, -1.0F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/*  57 */         PartPose.m_171423_(0.0F, 7.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
/*  58 */     PartDefinition cube_r14 = bone2.m_171599_("cube_r14", 
/*  59 */         CubeListBuilder.m_171558_().m_171514_(10, 55).m_171488_(-1.0F, 0.0F, -2.0F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  60 */         PartPose.m_171423_(-0.375F, 4.5602F, -2.347F, 0.3927F, 0.0F, 0.0F));
/*  61 */     PartDefinition cube_r15 = bone2.m_171599_("cube_r15", 
/*  62 */         CubeListBuilder.m_171558_().m_171514_(38, 28).m_171488_(-4.375F, -5.0F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  63 */         PartPose.m_171423_(2.5F, 2.5602F, -2.347F, -0.1309F, 0.0F, 0.0F));
/*  64 */     PartDefinition bone4 = bone2.m_171599_("bone4", 
/*  65 */         CubeListBuilder.m_171558_().m_171514_(56, 40).m_171488_(-2.0525F, -1.5833F, -2.4923F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
/*  66 */         .m_171514_(47, 18).m_171488_(-2.0525F, -0.5833F, -3.4923F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  67 */         PartPose.m_171423_(0.0525F, 10.533F, -2.629F, 1.0388F, 0.1098F, 0.0034F));
/*  68 */     PartDefinition RightLeg = partdefinition.m_171599_("RightLeg", CubeListBuilder.m_171558_(), 
/*  69 */         PartPose.m_171423_(2.0F, 21.0F, 0.0F, -1.6583F, -0.1742F, -0.0019F));
/*  70 */     PartDefinition cube_r6 = RightLeg.m_171599_("cube_r6", 
/*  71 */         CubeListBuilder.m_171558_().m_171514_(56, 6).m_171488_(-1.625F, -4.0F, -2.375F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), 
/*  72 */         PartPose.m_171423_(1.0F, 3.85F, 0.0F, -0.0436F, 0.0F, 0.0F));
/*  73 */     PartDefinition cube_r7 = RightLeg.m_171599_("cube_r7", 
/*  74 */         CubeListBuilder.m_171558_().m_171514_(0, 40).m_171488_(-1.625F, -3.0F, -2.375F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), 
/*  75 */         PartPose.m_171423_(0.375F, 3.475F, 0.0F, -0.0436F, 0.0F, 0.0F));
/*  76 */     PartDefinition bone = RightLeg.m_171599_("bone", CubeListBuilder.m_171558_(), 
/*  77 */         PartPose.m_171423_(0.8081F, 4.9895F, 0.0344F, -0.0077F, -0.1744F, 0.3497F));
/*  78 */     PartDefinition cube_r8 = bone.m_171599_("cube_r8", 
/*  79 */         CubeListBuilder.m_171558_().m_171514_(18, 43).m_171488_(0.375F, -5.0F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  80 */         PartPose.m_171423_(-2.0F, 2.0F, 0.0F, -0.1309F, 0.0F, 0.0F));
/*  81 */     PartDefinition cube_r9 = bone.m_171599_("cube_r9", 
/*  82 */         CubeListBuilder.m_171558_().m_171514_(24, 55).m_171488_(-2.0F, 0.0F, -2.0F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  83 */         PartPose.m_171423_(0.875F, 4.0F, 0.0F, 0.3927F, 0.0F, 0.0F));
/*  84 */     PartDefinition cube_r10 = bone.m_171599_("cube_r10", 
/*  85 */         CubeListBuilder.m_171558_().m_171514_(47, 58).m_171488_(-2.0F, -1.0F, -1.0F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/*  86 */         PartPose.m_171423_(0.5F, 6.4398F, 2.347F, -0.7854F, 0.0F, 0.0F));
/*  87 */     PartDefinition bone3 = bone.m_171599_("bone3", 
/*  88 */         CubeListBuilder.m_171558_().m_171514_(61, 0).m_171488_(-1.9365F, -1.5865F, -2.4923F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
/*  89 */         .m_171514_(8, 50).m_171488_(-1.9365F, -0.5865F, -3.4923F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  90 */         PartPose.m_171423_(0.4365F, 9.976F, -0.2821F, 1.4429F, -0.05F, -0.121F));
/*  91 */     PartDefinition LeftArm = partdefinition.m_171599_("LeftArm", 
/*  92 */         CubeListBuilder.m_171558_().m_171514_(0, 61).m_171488_(-1.8264F, -1.4152F, -1.5F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/*  93 */         PartPose.m_171423_(-5.0F, 12.0F, 0.0F, -0.9599F, 0.0F, 0.1745F));
/*  94 */     PartDefinition wrist_l = LeftArm.m_171599_("wrist_l", 
/*  95 */         CubeListBuilder.m_171558_().m_171514_(45, 0).m_171488_(-1.6108F, -0.1215F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(0, 27)
/*  96 */         .m_171488_(1.3892F, 6.8785F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(21, 13)
/*  97 */         .m_171488_(-1.6108F, 6.8785F, -2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 18)
/*  98 */         .m_171488_(-1.6108F, 6.8785F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(4, 0)
/*  99 */         .m_171488_(-1.6108F, 6.8785F, 1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 100 */         PartPose.m_171423_(-1.2155F, 4.7063F, 0.0F, 0.0F, 0.0F, -0.6981F));
/* 101 */     PartDefinition RightArm = partdefinition.m_171599_("RightArm", 
/* 102 */         CubeListBuilder.m_171558_().m_171514_(35, 61).m_171488_(-1.1736F, -1.4152F, -1.5F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 103 */         PartPose.m_171423_(5.0F, 12.0F, 0.0F, -0.9599F, 0.0F, -0.1745F));
/* 104 */     PartDefinition wrist_r = RightArm.m_171599_("wrist_r", 
/* 105 */         CubeListBuilder.m_171558_().m_171514_(14, 27).m_171488_(-2.3892F, 6.8785F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(27, 17)
/* 106 */         .m_171488_(-0.3892F, 6.8785F, 1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 30)
/* 107 */         .m_171488_(-0.3892F, 6.8785F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(14, 30)
/* 108 */         .m_171488_(-0.3892F, 6.8785F, -2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(34, 48)
/* 109 */         .m_171488_(-2.3892F, -0.1215F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 110 */         PartPose.m_171423_(1.2155F, 4.7063F, 0.0F, 0.0F, 0.0F, 0.7854F));
/* 111 */     PartDefinition Body = partdefinition.m_171599_("Body", 
/* 112 */         CubeListBuilder.m_171558_().m_171514_(19, 0).m_171488_(-4.0F, 0.6342F, -1.7156F, 8.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(61, 58)
/* 113 */         .m_171488_(-2.0F, -1.8658F, -0.5906F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).m_171514_(0, 27)
/* 114 */         .m_171488_(2.0F, -1.3658F, -3.0906F, 3.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)).m_171514_(0, 50)
/* 115 */         .m_171488_(5.0F, -0.3658F, -2.0906F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(48, 42)
/* 116 */         .m_171488_(-6.0F, -0.3658F, -2.0906F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(50, 51)
/* 117 */         .m_171488_(-3.0F, -0.1158F, -2.5906F, 6.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(20, 19)
/* 118 */         .m_171488_(-5.0F, -1.3658F, -3.0906F, 3.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)).m_171514_(50, 25)
/* 119 */         .m_171488_(-4.0F, -0.6158F, 2.7844F, 8.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(47, 13)
/* 120 */         .m_171488_(-3.5F, 11.6342F, -1.0906F, 7.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(25, 10)
/* 121 */         .m_171488_(-3.5F, 9.6342F, -1.2156F, 7.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(34, 40)
/* 122 */         .m_171488_(-3.0F, 5.6342F, -1.2156F, 6.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 123 */         PartPose.m_171423_(0.0F, 10.0F, -1.0F, 0.0873F, 0.0F, 0.0F));
/* 124 */     PartDefinition cube_r2 = Body.m_171599_("cube_r2", 
/* 125 */         CubeListBuilder.m_171558_().m_171514_(62, 46).m_171488_(-3.0F, -3.0F, 1.0F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 126 */         PartPose.m_171423_(0.5F, 4.4764F, 1.4632F, -0.4363F, 0.0F, 0.0F));
/* 127 */     PartDefinition cube_r3 = Body.m_171599_("cube_r3", 
/* 128 */         CubeListBuilder.m_171558_().m_171514_(61, 63).m_171488_(-3.0F, -3.0F, 1.0F, 5.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 129 */         PartPose.m_171423_(0.5F, 8.2264F, 1.2132F, 0.1745F, 0.0F, 0.0F));
/* 130 */     PartDefinition Tail = Body.m_171599_("Tail", CubeListBuilder.m_171558_(), 
/* 131 */         PartPose.m_171423_(0.0F, 9.6342F, 0.7844F, 0.3491F, 0.0F, 0.0F));
/* 132 */     PartDefinition cube_r4 = Tail.m_171599_("cube_r4", 
/* 133 */         CubeListBuilder.m_171558_().m_171514_(0, 0).m_171488_(-2.0F, -0.875F, -5.375F, 4.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), 
/* 134 */         PartPose.m_171423_(0.0F, 9.3866F, 11.9212F, -0.5236F, 0.0F, 0.0F));
/* 135 */     PartDefinition cube_r5 = Tail.m_171599_("cube_r5", 
/* 136 */         CubeListBuilder.m_171558_().m_171514_(14, 32).m_171488_(-2.0F, -2.0711F, 0.9289F, 4.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), 
/* 137 */         PartPose.m_171423_(0.0F, 1.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
/* 138 */     PartDefinition Head = partdefinition.m_171599_("Head", 
/* 139 */         CubeListBuilder.m_171558_().m_171514_(0, 13).m_171488_(-3.5F, -6.4F, -3.375F, 7.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), 
/* 140 */         PartPose.m_171419_(0.0F, 9.0F, -0.25F));
/* 141 */     PartDefinition Ears = Head.m_171599_("Ears", CubeListBuilder.m_171558_(), PartPose.m_171419_(0.0F, -8.4F, 0.125F));
/* 142 */     PartDefinition cube_r1 = Ears.m_171599_("cube_r1", 
/* 143 */         CubeListBuilder.m_171558_().m_171514_(6, 8).m_171488_(3.5F, -11.0F, 1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(6, 2)
/* 144 */         .m_171488_(3.5F, -9.0F, 1.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(12, 64)
/* 145 */         .m_171488_(3.5F, -12.0F, -0.5F, 1.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(0, 13)
/* 146 */         .m_171488_(3.5F, -6.0F, 1.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(19, 0)
/* 147 */         .m_171488_(-4.5F, -11.0F, 1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(6, 5)
/* 148 */         .m_171488_(-4.5F, -9.0F, 1.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(21, 15)
/* 149 */         .m_171488_(-4.5F, -6.0F, 1.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(0, 0).m_171488_(-4.5F, -12.0F, -0.5F, 1.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), 
/*     */         
/* 151 */         PartPose.m_171423_(0.0F, 9.0F, 0.0F, 0.3927F, 0.0F, 0.0F));
/* 152 */     return LayerDefinition.m_171565_(meshdefinition, 80, 80);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void m_7695_(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 158 */     this.LeftLeg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 159 */     this.RightLeg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 160 */     this.LeftArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 161 */     this.RightArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 162 */     this.Body.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 163 */     this.Head.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */   
/*     */   public void m_6973_(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
/* 167 */     this.Head.f_104204_ = netHeadYaw / 57.295776F;
/* 168 */     this.Head.f_104203_ = headPitch / 57.295776F;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\client\model\ModelSlimeling_remaster_sit.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */