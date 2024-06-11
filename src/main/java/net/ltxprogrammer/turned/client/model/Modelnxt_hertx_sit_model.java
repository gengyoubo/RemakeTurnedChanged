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
/*     */ public class Modelnxt_hertx_sit_model<T extends Entity>
/*     */   extends EntityModel<T>
/*     */ {
/*  24 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("turned", "modelnxt_hertx_sit_model"), "main");
/*     */   public final ModelPart Head;
/*     */   public final ModelPart Body;
/*     */   public final ModelPart Tail;
/*     */   public final ModelPart LeftArm;
/*     */   public final ModelPart RightArm;
/*     */   public final ModelPart LeftLeg;
/*     */   public final ModelPart RightLeg;
/*     */   
/*     */   public Modelnxt_hertx_sit_model(ModelPart root) {
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
/*  47 */         CubeListBuilder.m_171558_().m_171514_(46, 33).m_171488_(-2.0F, -2.65F, -3.2F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(58, 12)
/*  48 */         .m_171488_(-2.0F, -6.65F, 1.8F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).m_171514_(24, 18)
/*  49 */         .m_171488_(-2.0F, -2.65F, 2.8F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(62, 64)
/*  50 */         .m_171488_(-3.0F, -2.65F, 1.8F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(22, 11)
/*  51 */         .m_171488_(-3.0F, -0.65F, -3.1F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(20, 14)
/*  52 */         .m_171488_(-1.5F, 0.35F, -2.85F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(16, 33)
/*  53 */         .m_171488_(-3.5F, -5.65F, 1.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(31, 0)
/*  54 */         .m_171488_(2.5F, -5.65F, 1.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(30, 39)
/*  55 */         .m_171488_(2.0F, -6.65F, 1.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 45)
/*  56 */         .m_171488_(-3.0F, -6.65F, 1.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(31, 0)
/*  57 */         .m_171488_(-3.0F, -6.65F, -3.2F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(10, 50)
/*  58 */         .m_171488_(2.0F, -5.65F, -4.2F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(34, 48)
/*  59 */         .m_171488_(-3.0F, -5.65F, -4.2F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(0, 7)
/*  60 */         .m_171488_(-2.0F, -5.65F, -4.2F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  61 */         PartPose.m_171419_(0.0F, 9.0F, -1.0F));
/*  62 */     PartDefinition Jaw = Head.m_171599_("Jaw", 
/*  63 */         CubeListBuilder.m_171558_().m_171514_(30, 57).m_171488_(2.0F, 11.45F, -6.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(31, 6)
/*  64 */         .m_171488_(-2.0F, 11.45F, -6.2F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(16, 33)
/*  65 */         .m_171488_(-3.0F, 12.45F, -5.2F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(0, 56)
/*  66 */         .m_171488_(-3.0F, 11.45F, -6.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), 
/*  67 */         PartPose.m_171419_(0.0F, -14.0F, 2.0F));
/*  68 */     PartDefinition bone2 = Jaw.m_171599_("bone2", 
/*  69 */         CubeListBuilder.m_171558_().m_171514_(33, 33).m_171488_(-3.0F, -9.7328F, -14.2583F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
/*  70 */         .m_171514_(36, 46).m_171488_(-3.0F, -9.7328F, -14.6725F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  71 */         PartPose.m_171423_(0.0F, 29.0F, -2.0F, -0.7854F, 0.0F, 0.0F));
/*  72 */     PartDefinition bone = Head.m_171599_("bone", 
/*  73 */         CubeListBuilder.m_171558_().m_171514_(38, 59).m_171488_(-3.0F, -17.5716F, 11.6319F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
/*  74 */         .m_171514_(58, 46).m_171488_(-3.0F, -17.5716F, 12.0461F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  75 */         PartPose.m_171423_(0.0F, 15.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
/*  76 */     PartDefinition cube_r1 = Head.m_171599_("cube_r1", 
/*  77 */         CubeListBuilder.m_171558_().m_171514_(33, 35).m_171488_(-2.9F, 2.5831F, 6.5717F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(9, 59)
/*  78 */         .m_171488_(-2.9F, 2.5831F, 1.5717F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(12, 30)
/*  79 */         .m_171488_(1.9F, 2.5831F, 6.5717F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 30)
/*  80 */         .m_171488_(-3.4F, 3.9354F, 5.2094F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 14)
/*  81 */         .m_171488_(2.4F, 3.9354F, 5.2094F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(58, 48)
/*  82 */         .m_171488_(1.9F, 2.5831F, 1.5717F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(0, 63)
/*  83 */         .m_171488_(-3.4F, 3.9354F, 1.2094F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(0, 0).m_171488_(2.4F, 3.9354F, 1.2094F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), 
/*     */         
/*  85 */         PartPose.m_171423_(0.0F, -8.6F, -0.2F, 0.2618F, 0.0F, 0.0F));
/*  86 */     PartDefinition Body = partdefinition.m_171599_("Body", 
/*  87 */         CubeListBuilder.m_171558_().m_171514_(0, 14).m_171488_(-4.0F, -0.0614F, -2.1302F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
/*  88 */         .m_171514_(59, 30).m_171488_(-3.0F, 0.9386F, -3.1302F, 6.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(48, 0)
/*  89 */         .m_171488_(-4.0F, 0.9386F, 1.8698F, 8.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(6, 0)
/*  90 */         .m_171488_(3.0F, 0.9386F, -3.1302F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 0)
/*  91 */         .m_171488_(-4.0F, 0.9386F, -3.1302F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(50, 61)
/*  92 */         .m_171488_(3.0F, -1.0614F, -2.6302F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(21, 61)
/*  93 */         .m_171488_(-4.0F, -1.0614F, -2.6302F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(24, 39)
/*  94 */         .m_171488_(-1.0F, 1.9386F, -3.3802F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 56)
/*  95 */         .m_171488_(-2.5F, 5.9386F, -3.1302F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(42, 18).m_171488_(0.5F, 5.9386F, -3.1302F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*     */         
/*  97 */         PartPose.m_171423_(0.0F, 9.0F, -1.0F, 0.1745F, 0.0F, 0.0F));
/*  98 */     PartDefinition Tail = partdefinition.m_171599_("Tail", CubeListBuilder.m_171558_(), 
/*  99 */         PartPose.m_171423_(0.0F, 19.625F, 0.0F, 0.5236F, 0.0F, 0.0F));
/* 100 */     PartDefinition cube_r10 = Tail.m_171599_("cube_r10", 
/* 101 */         CubeListBuilder.m_171558_().m_171514_(17, 0).m_171488_(-1.3F, 26.1445F, 11.7379F, 3.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), 
/* 102 */         PartPose.m_171423_(0.0F, -17.5263F, 5.5F, -0.0873F, 0.0F, 0.0F));
/* 103 */     PartDefinition cube_r2 = Tail.m_171599_("cube_r2", 
/* 104 */         CubeListBuilder.m_171558_().m_171514_(16, 22).m_171488_(-1.3F, 21.2659F, 11.9581F, 3.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), 
/* 105 */         PartPose.m_171423_(0.0F, -17.5263F, 5.5F, -0.3927F, 0.0F, 0.0F));
/* 106 */     PartDefinition cube_r3 = Tail.m_171599_("cube_r3", 
/* 107 */         CubeListBuilder.m_171558_().m_171514_(0, 0).m_171488_(-1.3F, 14.8425F, 9.334F, 3.0F, 3.0F, 11.0F, new CubeDeformation(0.0F)), 
/* 108 */         PartPose.m_171423_(0.0F, -17.5263F, 5.5F, -0.7854F, 0.0F, 0.0F));
/* 109 */     PartDefinition LeftArm = partdefinition.m_171599_("LeftArm", 
/* 110 */         CubeListBuilder.m_171558_().m_171514_(30, 18).m_171488_(-3.0F, -2.2697F, -2.8839F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F))
/* 111 */         .m_171514_(20, 55).m_171488_(-3.0F, 5.7303F, -2.8839F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(17, 0)
/* 112 */         .m_171488_(-3.25F, 5.7303F, -1.8839F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(46, 16)
/* 113 */         .m_171488_(-3.0F, 7.7303F, -2.8839F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(18, 54)
/* 114 */         .m_171488_(-3.0F, 11.7303F, 0.1161F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(52, 5)
/* 115 */         .m_171488_(-3.0F, 11.7303F, -1.3839F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(6, 42)
/* 116 */         .m_171488_(0.0F, 11.7303F, -2.8839F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(18, 52)
/* 117 */         .m_171488_(-3.0F, 11.7303F, -2.8839F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 118 */         PartPose.m_171423_(-5.0F, 12.0F, -1.0F, -0.7854F, 0.0F, 0.0F));
/* 119 */     PartDefinition RightArm = partdefinition.m_171599_("RightArm", 
/* 120 */         CubeListBuilder.m_171558_().m_171514_(0, 30).m_171488_(-1.0F, -2.2697F, -2.4697F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(54, 24)
/* 121 */         .m_171488_(-1.0F, 5.7303F, -2.4697F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(24, 46)
/* 122 */         .m_171488_(-1.0F, 7.7303F, -2.4697F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(0, 42)
/* 123 */         .m_171488_(-1.0F, 11.7303F, -2.4697F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(18, 50)
/* 124 */         .m_171488_(1.0F, 11.7303F, -2.4697F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(42, 48)
/* 125 */         .m_171488_(1.0F, 11.7303F, -0.9697F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(28, 44)
/* 126 */         .m_171488_(1.0F, 11.7303F, 0.5303F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(17, 4).m_171488_(2.25F, 5.7303F, -1.4697F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), 
/*     */         
/* 128 */         PartPose.m_171423_(5.0F, 12.0F, -1.0F, -0.7854F, 0.0F, 0.0F));
/* 129 */     PartDefinition LeftLeg = partdefinition.m_171599_("LeftLeg", 
/* 130 */         CubeListBuilder.m_171558_().m_171514_(44, 53).m_171488_(-1.75F, -0.8F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 131 */         PartPose.m_171423_(-2.0F, 22.0F, 1.0F, -1.8326F, 0.0F, -1.5708F));
/* 132 */     PartDefinition LeftLeg_r1 = LeftLeg.m_171599_("LeftLeg_r1", 
/* 133 */         CubeListBuilder.m_171558_().m_171514_(45, 45).m_171488_(-15.75F, -3.0F, -3.4102F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 134 */         PartPose.m_171423_(14.0F, 13.7095F, 3.6236F, 1.5708F, 0.0F, 0.0F));
/* 135 */     PartDefinition cube_r4 = LeftLeg.m_171599_("cube_r4", CubeListBuilder.m_171558_(), 
/* 136 */         PartPose.m_171423_(12.0F, 2.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 137 */     PartDefinition cube_r4_r1 = cube_r4.m_171599_("cube_r4_r1", 
/* 138 */         CubeListBuilder.m_171558_().m_171514_(41, 61).m_171488_(-15.75F, -3.7F, 3.0F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).m_171514_(62, 36)
/* 139 */         .m_171488_(-15.75F, -4.7F, 3.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).m_171514_(57, 57).m_171488_(-15.75F, -8.7F, 3.0F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), 
/*     */         
/* 141 */         PartPose.m_171423_(2.0F, 13.9626F, 8.9204F, 1.5708F, 0.0F, 0.0F));
/* 142 */     PartDefinition cube_r5 = LeftLeg.m_171599_("cube_r5", CubeListBuilder.m_171558_(), 
/* 143 */         PartPose.m_171423_(12.0F, 2.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
/* 144 */     PartDefinition cube_r5_r1 = cube_r5.m_171599_("cube_r5_r1", 
/* 145 */         CubeListBuilder.m_171558_().m_171514_(12, 39).m_171488_(-15.75F, 4.4152F, -5.0633F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 146 */         PartPose.m_171423_(2.0F, -0.0927F, 1.6082F, -0.7854F, 0.0F, 0.0F));
/* 147 */     PartDefinition cube_r6 = LeftLeg.m_171599_("cube_r6", 
/* 148 */         CubeListBuilder.m_171558_().m_171514_(0, 46).m_171488_(-13.75F, -1.5045F, -2.4584F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 149 */         PartPose.m_171423_(12.0F, 2.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 150 */     PartDefinition RightLeg = partdefinition.m_171599_("RightLeg", 
/* 151 */         CubeListBuilder.m_171558_().m_171514_(44, 53).m_171480_()
/* 152 */         .m_171488_(-2.25F, -0.8F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).m_171555_(false), 
/* 153 */         PartPose.m_171423_(2.0F, 22.0F, 1.0F, -1.8326F, 0.0F, 1.5708F));
/* 154 */     PartDefinition LeftLeg_r2 = RightLeg.m_171599_("LeftLeg_r2", 
/* 155 */         CubeListBuilder.m_171558_().m_171514_(45, 45).m_171480_()
/* 156 */         .m_171488_(11.75F, -3.0F, -3.4102F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).m_171555_(false), 
/* 157 */         PartPose.m_171423_(-14.0F, 13.7095F, 3.6236F, 1.5708F, 0.0F, 0.0F));
/* 158 */     PartDefinition cube_r7 = RightLeg.m_171599_("cube_r7", CubeListBuilder.m_171558_(), 
/* 159 */         PartPose.m_171423_(-12.0F, 2.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 160 */     PartDefinition cube_r5_r2 = cube_r7.m_171599_("cube_r5_r2", 
/* 161 */         CubeListBuilder.m_171558_().m_171514_(41, 61).m_171480_().m_171488_(11.75F, -3.7F, 3.0F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
/* 162 */         .m_171555_(false).m_171514_(62, 36).m_171480_().m_171488_(11.75F, -4.7F, 3.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).m_171555_(false)
/* 163 */         .m_171514_(57, 57).m_171480_().m_171488_(11.75F, -8.7F, 3.0F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).m_171555_(false), 
/* 164 */         PartPose.m_171423_(-2.0F, 13.9626F, 8.9204F, 1.5708F, 0.0F, 0.0F));
/* 165 */     PartDefinition cube_r8 = RightLeg.m_171599_("cube_r8", CubeListBuilder.m_171558_(), 
/* 166 */         PartPose.m_171423_(-12.0F, 2.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
/* 167 */     PartDefinition cube_r6_r1 = cube_r8.m_171599_("cube_r6_r1", 
/* 168 */         CubeListBuilder.m_171558_().m_171514_(12, 39).m_171480_()
/* 169 */         .m_171488_(11.75F, 4.4152F, -5.0633F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).m_171555_(false), 
/* 170 */         PartPose.m_171423_(-2.0F, -0.0927F, 1.6082F, -0.7854F, 0.0F, 0.0F));
/* 171 */     PartDefinition cube_r9 = RightLeg.m_171599_("cube_r9", 
/* 172 */         CubeListBuilder.m_171558_().m_171514_(0, 46).m_171480_()
/* 173 */         .m_171488_(9.75F, -1.5045F, -2.4584F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).m_171555_(false), 
/* 174 */         PartPose.m_171423_(-12.0F, 2.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 175 */     return LayerDefinition.m_171565_(meshdefinition, 128, 128);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void m_7695_(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 181 */     this.Head.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 182 */     this.Body.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 183 */     this.Tail.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 184 */     this.LeftArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 185 */     this.RightArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 186 */     this.LeftLeg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 187 */     this.RightLeg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */   
/*     */   public void m_6973_(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
/* 191 */     this.Head.f_104204_ = netHeadYaw / 57.295776F;
/* 192 */     this.Head.f_104203_ = headPitch / 57.295776F;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\client\model\Modelnxt_hertx_sit_model.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */