/*     */ package net.mcreator.latexes.client.model;
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
/*     */ public class Modeldark_latex_squiddog_model<T extends Entity>
/*     */   extends EntityModel<T>
/*     */ {
/*  25 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("latex", "modeldark_latex_squiddog_model"), "main");
/*     */   
/*     */   public final ModelPart head;
/*     */   public final ModelPart body;
/*     */   public final ModelPart rightArm2;
/*     */   public final ModelPart rightArm;
/*     */   public final ModelPart leftArm2;
/*     */   public final ModelPart leftArm;
/*     */   public final ModelPart rightLeg;
/*     */   public final ModelPart leftLeg;
/*     */   
/*     */   public Modeldark_latex_squiddog_model(ModelPart root) {
/*  37 */     this.head = root.getChild("head");
/*  38 */     this.body = root.getChild("body");
/*  39 */     this.rightArm2 = root.getChild("rightArm2");
/*  40 */     this.rightArm = root.getChild("rightArm");
/*  41 */     this.leftArm2 = root.getChild("leftArm2");
/*  42 */     this.leftArm = root.getChild("leftArm");
/*  43 */     this.rightLeg = root.getChild("rightLeg");
/*  44 */     this.leftLeg = root.getChild("leftLeg");
/*     */   }
/*     */   
/*     */   public static LayerDefinition createBodyLayer() {
/*  48 */     MeshDefinition meshdefinition = new MeshDefinition();
/*  49 */     PartDefinition partdefinition = meshdefinition.getRoot();
/*  50 */     PartDefinition head = partdefinition.addOrReplaceChild("head", 
/*  51 */         CubeListBuilder.create().texOffs(0, 19).addBox(-4.0F, -6.375F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(24, 19)
/*  52 */         .addBox(-5.0F, -2.375F, -4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 12)
/*  53 */         .addBox(-5.75F, -2.25F, -3.75F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(27, 12)
/*  54 */         .addBox(3.75F, -2.25F, -3.75F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 0)
/*  55 */         .addBox(-4.625F, -1.75F, -3.875F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
/*  56 */         .addBox(4.0F, -2.375F, -4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(11, 0)
/*  57 */         .addBox(3.625F, -1.75F, -3.875F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  58 */         PartPose.offset(0.0F, -6.0F, 0.0F));
/*  59 */     PartDefinition Head_r1 = head.addOrReplaceChild("Head_r1", 
/*  60 */         CubeListBuilder.create().texOffs(0, 19).addBox(0.5F, -1.75F, -1.625F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(14, 35)
/*  61 */         .addBox(-0.5F, -0.75F, -1.625F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), 
/*  62 */         PartPose.offsetAndRotation(3.5F, -7.375F, 0.5F, 0.0F, 1.5708F, 0.3927F));
/*  63 */     PartDefinition Head_r2 = head.addOrReplaceChild("Head_r2", 
/*  64 */         CubeListBuilder.create().texOffs(38, 27).addBox(-0.5F, -0.75F, -1.625F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 35)
/*  65 */         .addBox(-1.5F, -1.75F, -1.625F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), 
/*  66 */         PartPose.offsetAndRotation(-3.5F, -7.375F, 0.5F, 0.0F, -1.5708F, -0.3927F));
/*  67 */     PartDefinition mask = head.addOrReplaceChild("mask", 
/*  68 */         CubeListBuilder.create().texOffs(29, 8).addBox(-1.0F, -11.375F, -5.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 13)
/*  69 */         .addBox(-4.0F, -6.375F, -5.0F, 8.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 14)
/*  70 */         .addBox(-3.0F, -5.375F, -5.0F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(3, 3)
/*  71 */         .addBox(-2.5F, -4.375F, -5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(3, 0)
/*  72 */         .addBox(1.5F, -4.375F, -5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 15)
/*  73 */         .addBox(-3.0F, -9.375F, -5.0F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 26)
/*  74 */         .addBox(-2.0F, -10.375F, -5.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 19)
/*  75 */         .addBox(-0.5F, -7.375F, -5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(24, 22)
/*  76 */         .addBox(2.375F, -7.375F, -5.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(22, 3)
/*  77 */         .addBox(-4.375F, -7.375F, -5.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(14, 3)
/*  78 */         .addBox(-3.375F, -8.375F, -5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(14, 0)
/*  79 */         .addBox(2.375F, -8.375F, -5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(27, 14)
/*  80 */         .addBox(-1.5F, -8.375F, -5.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), 
/*  81 */         PartPose.offset(0.0F, 5.0F, 0.75F));
/*  82 */     PartDefinition body = partdefinition.addOrReplaceChild("body", 
/*  83 */         CubeListBuilder.create().texOffs(24, 19).addBox(-4.5F, 1.625F, -2.0F, 9.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(28, 38)
/*  84 */         .addBox(-1.375F, -0.375F, -1.375F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(30, 47)
/*  85 */         .addBox(1.0F, 0.0F, -3.0F, 4.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 46)
/*  86 */         .addBox(-5.0F, 0.0F, -3.0F, 4.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(38, 12)
/*  87 */         .addBox(-4.5F, 11.625F, -2.0F, 9.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(36, 41)
/*  88 */         .addBox(-4.0F, 5.625F, -2.0F, 8.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(53, 0)
/*  89 */         .addBox(-2.5F, 13.625F, -2.0F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(50, 18)
/*  90 */         .addBox(-3.5F, 7.625F, -2.0F, 7.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  91 */         PartPose.offset(0.0F, -6.0F, 0.0F));
/*  92 */     PartDefinition Tentapaws = body.addOrReplaceChild("Tentapaws", CubeListBuilder.create(), PartPose.offset(0.0F, 26.0F, 0.0F));
/*  93 */     PartDefinition Tentapaw1 = Tentapaws.addOrReplaceChild("Tentapaw1", CubeListBuilder.create(), PartPose.offset(1.3642F, -22.6544F, 2.3598F));
/*  94 */     PartDefinition Body_r1 = Tentapaw1.addOrReplaceChild("Body_r1", 
/*  95 */         CubeListBuilder.create().texOffs(61, 47).addBox(0.8003F, -4.0208F, 19.792F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
/*  96 */         .texOffs(42, 57).addBox(0.8003F, -3.0208F, 24.167F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(5, 57)
/*  97 */         .addBox(0.8003F, -1.6458F, 24.167F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 56)
/*  98 */         .addBox(0.8003F, -0.0208F, 24.167F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(26, 49)
/*  99 */         .addBox(0.8003F, 1.3542F, 24.167F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(44, 47)
/* 100 */         .addBox(0.8003F, 2.3542F, 19.792F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(51, 90)
/* 101 */         .addBox(0.8003F, -2.3958F, 19.792F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 102 */         PartPose.offsetAndRotation(10.7875F, 5.4329F, 5.2181F, -2.2119F, 0.7864F, 2.9331F));
/* 103 */     PartDefinition Body_r2 = Tentapaw1.addOrReplaceChild("Body_r2", 
/* 104 */         CubeListBuilder.create().texOffs(57, 84).addBox(-2.347F, -1.375F, -4.6602F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 105 */         PartPose.offsetAndRotation(11.0F, -3.0F, 4.0F, -2.9234F, 1.5272F, 3.1416F));
/* 106 */     PartDefinition Body_r3 = Tentapaw1.addOrReplaceChild("Body_r3", 
/* 107 */         CubeListBuilder.create().texOffs(91, 57).addBox(-1.0849F, -0.25F, 16.4149F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
/* 108 */         .texOffs(31, 57).addBox(-1.0849F, -1.25F, 11.4149F, 3.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(11, 84)
/* 109 */         .addBox(-1.3349F, 1.375F, 6.6649F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 110 */         PartPose.offsetAndRotation(11.0F, -3.0F, 4.0F, -2.2119F, 0.7864F, 2.9331F));
/* 111 */     PartDefinition Body_r4 = Tentapaw1.addOrReplaceChild("Body_r4", 
/* 112 */         CubeListBuilder.create().texOffs(38, 30).addBox(-1.3349F, -1.625F, -0.3351F, 3.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), 
/* 113 */         PartPose.offsetAndRotation(11.0F, -3.0F, 4.0F, -2.6483F, 0.7864F, 2.9331F));
/* 114 */     PartDefinition Body_r5 = Tentapaw1.addOrReplaceChild("Body_r5", 
/* 115 */         CubeListBuilder.create().texOffs(68, 87).addBox(-2.875F, -0.75F, 1.0F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 116 */         PartPose.offsetAndRotation(1.9067F, -1.5622F, 1.8475F, 0.491F, 1.1418F, 0.3592F));
/* 117 */     PartDefinition Body_r6 = Tentapaw1.addOrReplaceChild("Body_r6", 
/* 118 */         CubeListBuilder.create().texOffs(84, 87).addBox(-2.5F, -0.5F, 0.0F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 119 */         PartPose.offsetAndRotation(1.1358F, -0.8456F, -1.3598F, 0.2182F, 0.4363F, 0.0F));
/* 120 */     PartDefinition Tentapaw2 = Tentapaws.addOrReplaceChild("Tentapaw2", CubeListBuilder.create(), 
/* 121 */         PartPose.offsetAndRotation(2.3642F, -18.6544F, 2.3598F, 0.0F, 0.0F, 0.6109F));
/* 122 */     PartDefinition Body_r7 = Tentapaw2.addOrReplaceChild("Body_r7", 
/* 123 */         CubeListBuilder.create().texOffs(41, 82).addBox(-2.347F, -1.375F, -4.6602F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 124 */         PartPose.offsetAndRotation(9.9122F, -3.2783F, 4.0F, -2.9234F, 1.5272F, 3.1416F));
/* 125 */     PartDefinition Body_r8 = Tentapaw2.addOrReplaceChild("Body_r8", 
/* 126 */         CubeListBuilder.create().texOffs(91, 35).addBox(-0.4081F, 1.8708F, 15.506F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
/* 127 */         .texOffs(86, 74).addBox(1.8003F, 1.2292F, 10.917F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(84, 0)
/* 128 */         .addBox(1.8003F, 2.2292F, 15.292F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(36, 81)
/* 129 */         .addBox(1.8003F, 3.6042F, 15.292F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(52, 82)
/* 130 */         .addBox(1.8003F, 5.2292F, 15.292F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(86, 12)
/* 131 */         .addBox(1.8003F, 6.6042F, 15.292F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(79, 87)
/* 132 */         .addBox(1.8003F, 7.6042F, 10.917F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(92, 45)
/* 133 */         .addBox(1.8003F, 2.8542F, 10.917F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(15, 52)
/* 134 */         .addBox(-0.4081F, 0.8708F, 10.506F, 3.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(83, 4)
/* 135 */         .addBox(-0.6581F, 3.4958F, 5.756F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 136 */         PartPose.offsetAndRotation(9.6998F, -4.8455F, 5.2181F, -2.1217F, 0.9972F, -2.8432F));
/* 137 */     PartDefinition Body_r9 = Tentapaw2.addOrReplaceChild("Body_r9", 
/* 138 */         CubeListBuilder.create().texOffs(14, 38).addBox(-0.6581F, 0.6812F, -0.2626F, 3.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), 
/* 139 */         PartPose.offsetAndRotation(9.6998F, -4.8455F, 5.2181F, -2.5581F, 0.9972F, -2.8432F));
/* 140 */     PartDefinition Body_r10 = Tentapaw2.addOrReplaceChild("Body_r10", 
/* 141 */         CubeListBuilder.create().texOffs(83, 27).addBox(-2.875F, -0.75F, 1.0F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 142 */         PartPose.offsetAndRotation(0.8189F, -1.8405F, 1.8475F, 0.491F, 1.1418F, 0.3592F));
/* 143 */     PartDefinition Body_r11 = Tentapaw2.addOrReplaceChild("Body_r11", 
/* 144 */         CubeListBuilder.create().texOffs(83, 66).addBox(-2.5F, -0.5F, 0.0F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 145 */         PartPose.offsetAndRotation(0.0481F, -1.1239F, -1.3598F, 0.2182F, 0.4363F, 0.0F));
/* 146 */     PartDefinition Tentapaw3 = Tentapaws.addOrReplaceChild("Tentapaw3", CubeListBuilder.create(), PartPose.offset(-2.6358F, -22.6544F, 3.3598F));
/* 147 */     PartDefinition Body_r12 = Tentapaw3.addOrReplaceChild("Body_r12", 
/* 148 */         CubeListBuilder.create().texOffs(47, 26).addBox(-1.8003F, -1.6458F, 24.167F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
/* 149 */         .texOffs(46, 18).addBox(-1.8003F, -0.0208F, 24.167F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(39, 4)
/* 150 */         .addBox(-1.8003F, 1.3542F, 24.167F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(39, 0)
/* 151 */         .addBox(-1.8003F, -4.0208F, 19.792F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(30, 12)
/* 152 */         .addBox(-1.8003F, -3.0208F, 24.167F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(22, 0)
/* 153 */         .addBox(-1.8003F, -2.3958F, 19.792F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(22, 12)
/* 154 */         .addBox(-1.8003F, 2.3542F, 19.792F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 155 */         PartPose.offsetAndRotation(-9.5159F, 5.4329F, 4.2181F, -2.2119F, -0.7864F, -2.9331F));
/* 156 */     PartDefinition Body_r13 = Tentapaw3.addOrReplaceChild("Body_r13", 
/* 157 */         CubeListBuilder.create().texOffs(0, 81).addBox(-0.653F, -1.375F, -4.6602F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 158 */         PartPose.offsetAndRotation(-9.7284F, -3.0F, 3.0F, -2.9234F, -1.5272F, -3.1416F));
/* 159 */     PartDefinition Body_r14 = Tentapaw3.addOrReplaceChild("Body_r14", 
/* 160 */         CubeListBuilder.create().texOffs(39, 90).addBox(-1.9151F, -0.25F, 16.4149F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
/* 161 */         .texOffs(50, 47).addBox(-1.9151F, -1.25F, 11.4149F, 3.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(25, 81)
/* 162 */         .addBox(-1.6651F, 1.375F, 6.6649F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 163 */         PartPose.offsetAndRotation(-9.7284F, -3.0F, 3.0F, -2.2119F, -0.7864F, -2.9331F));
/* 164 */     PartDefinition Body_r15 = Tentapaw3.addOrReplaceChild("Body_r15", 
/* 165 */         CubeListBuilder.create().texOffs(0, 35).addBox(-1.6651F, -1.625F, -0.3351F, 3.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), 
/* 166 */         PartPose.offsetAndRotation(-9.7284F, -3.0F, 3.0F, -2.6483F, -0.7864F, -2.9331F));
/* 167 */     PartDefinition Body_r16 = Tentapaw3.addOrReplaceChild("Body_r16", 
/* 168 */         CubeListBuilder.create().texOffs(81, 79).addBox(-0.125F, -0.75F, 1.0F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 169 */         PartPose.offsetAndRotation(-0.635F, -1.5622F, 0.8475F, 0.491F, -1.1418F, -0.3592F));
/* 170 */     PartDefinition Body_r17 = Tentapaw3.addOrReplaceChild("Body_r17", 
/* 171 */         CubeListBuilder.create().texOffs(82, 19).addBox(-0.5F, -0.5F, 0.0F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 172 */         PartPose.offsetAndRotation(0.1358F, -0.8456F, -2.3598F, 0.2182F, -0.4363F, 0.0F));
/* 173 */     PartDefinition Tentapaw4 = Tentapaws.addOrReplaceChild("Tentapaw4", CubeListBuilder.create(), 
/* 174 */         PartPose.offsetAndRotation(-2.3642F, -18.6544F, 2.3598F, 0.0F, 0.0F, -0.6109F));
/* 175 */     PartDefinition Body_r18 = Tentapaw4.addOrReplaceChild("Body_r18", 
/* 176 */         CubeListBuilder.create().texOffs(12, 92).addBox(-2.8003F, 2.8542F, 10.917F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
/* 177 */         .texOffs(67, 0).addBox(-2.8003F, 7.6042F, 10.917F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(68, 33)
/* 178 */         .addBox(-2.8003F, 6.6042F, 15.292F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(74, 54)
/* 179 */         .addBox(-2.8003F, 5.2292F, 15.292F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(76, 41)
/* 180 */         .addBox(-2.8003F, 3.6042F, 15.292F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(78, 19)
/* 181 */         .addBox(-2.8003F, 2.2292F, 15.292F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(79, 66)
/* 182 */         .addBox(-2.8003F, 1.2292F, 10.917F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 89)
/* 183 */         .addBox(-2.5919F, 1.8708F, 15.506F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
/* 184 */         .addBox(-2.5919F, 0.8708F, 10.506F, 3.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(75, 58)
/* 185 */         .addBox(-2.3419F, 3.4958F, 5.756F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 186 */         PartPose.offsetAndRotation(-9.6998F, -4.8455F, 5.2181F, -2.1217F, -0.9972F, 2.8432F));
/* 187 */     PartDefinition Body_r19 = Tentapaw4.addOrReplaceChild("Body_r19", 
/* 188 */         CubeListBuilder.create().texOffs(72, 33).addBox(-0.653F, -1.375F, -4.6602F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 189 */         PartPose.offsetAndRotation(-9.9122F, -3.2783F, 4.0F, -2.9234F, -1.5272F, -3.1416F));
/* 190 */     PartDefinition Body_r20 = Tentapaw4.addOrReplaceChild("Body_r20", 
/* 191 */         CubeListBuilder.create().texOffs(24, 27).addBox(-2.3419F, 0.6812F, -0.2626F, 3.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), 
/* 192 */         PartPose.offsetAndRotation(-9.6998F, -4.8455F, 5.2181F, -2.5581F, -0.9972F, 2.8432F));
/* 193 */     PartDefinition Body_r21 = Tentapaw4.addOrReplaceChild("Body_r21", 
/* 194 */         CubeListBuilder.create().texOffs(79, 49).addBox(-0.125F, -0.75F, 1.0F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 195 */         PartPose.offsetAndRotation(-0.8189F, -1.8405F, 1.8475F, 0.491F, -1.1418F, -0.3592F));
/* 196 */     PartDefinition Body_r22 = Tentapaw4.addOrReplaceChild("Body_r22", 
/* 197 */         CubeListBuilder.create().texOffs(80, 41).addBox(-0.5F, -0.5F, 0.0F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 198 */         PartPose.offsetAndRotation(-0.0481F, -1.1239F, -1.3598F, 0.2182F, -0.4363F, 0.0F));
/* 199 */     PartDefinition Tail = body.addOrReplaceChild("Tail", 
/* 200 */         CubeListBuilder.create().texOffs(0, 0).addBox(-1.25F, -0.9288F, 0.5808F, 3.0F, 3.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(22, 8)
/* 201 */         .addBox(-1.25F, -0.9288F, 16.5808F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 0)
/* 202 */         .addBox(-1.25F, 2.0712F, 4.5808F, 3.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(39, 0)
/* 203 */         .addBox(-1.25F, -1.9288F, -0.4192F, 3.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), 
/* 204 */         PartPose.offsetAndRotation(0.0F, 12.0F, 1.0F, -0.5672F, 0.0F, 0.0F));
/* 205 */     PartDefinition rightArm2 = partdefinition.addOrReplaceChild("rightArm2", 
/* 206 */         CubeListBuilder.create().texOffs(16, 73).addBox(-1.7276F, 0.0853F, -2.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 207 */         PartPose.offsetAndRotation(4.0F, -4.0F, 0.125F, 0.0F, 0.0F, -1.0908F));
/* 208 */     PartDefinition bone8 = rightArm2.addOrReplaceChild("bone8", 
/* 209 */         CubeListBuilder.create().texOffs(47, 60).addBox(-1.7109F, -0.4976F, -1.9985F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F))
/* 210 */         .texOffs(39, 9).addBox(1.2891F, 6.5024F, -1.9985F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 33)
/* 211 */         .addBox(1.2891F, 6.5024F, -0.4985F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 14)
/* 212 */         .addBox(1.2891F, 6.5024F, 1.0015F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 213 */         PartPose.offsetAndRotation(-0.1687F, 6.9791F, 0.0F, -0.5672F, 0.0F, 0.7418F));
/* 214 */     PartDefinition rightArm = partdefinition.addOrReplaceChild("rightArm", 
/* 215 */         CubeListBuilder.create().texOffs(58, 73).addBox(-1.6233F, -0.4507F, -2.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 216 */         PartPose.offsetAndRotation(3.75F, 0.25F, 0.75F, 0.0F, 0.0F, -0.6545F));
/* 217 */     PartDefinition bone2 = rightArm.addOrReplaceChild("bone2", 
/* 218 */         CubeListBuilder.create().texOffs(0, 61).addBox(-2.2102F, -0.9644F, -2.1567F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F))
/* 219 */         .texOffs(42, 33).addBox(0.7898F, 6.0356F, -2.1567F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 41)
/* 220 */         .addBox(0.7898F, 6.0356F, -0.6567F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 41)
/* 221 */         .addBox(0.7898F, 6.0356F, 0.8433F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 222 */         PartPose.offsetAndRotation(-0.2094F, 6.7095F, 0.0F, -0.5564F, -0.1166F, 0.5569F));
/* 223 */     PartDefinition leftArm2 = partdefinition.addOrReplaceChild("leftArm2", 
/* 224 */         CubeListBuilder.create().texOffs(68, 22).addBox(-2.1594F, -0.3764F, -2.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 225 */         PartPose.offsetAndRotation(-4.0F, -3.0F, 0.125F, 0.0F, 0.0F, 1.0908F));
/* 226 */     PartDefinition bone11 = leftArm2.addOrReplaceChild("bone11", 
/* 227 */         CubeListBuilder.create().texOffs(52, 26).addBox(-2.3812F, -0.5688F, -2.0439F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F))
/* 228 */         .texOffs(12, 14).addBox(-2.3812F, 6.4312F, -2.0439F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(11, 3)
/* 229 */         .addBox(-2.3812F, 6.4312F, -0.5439F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 3)
/* 230 */         .addBox(-2.3812F, 6.4312F, 0.9561F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 231 */         PartPose.offsetAndRotation(-0.5933F, 6.5173F, 0.0F, -0.5672F, 0.0F, -0.7418F));
/* 232 */     PartDefinition leftArm = partdefinition.addOrReplaceChild("leftArm", 
/* 233 */         CubeListBuilder.create().texOffs(30, 70).addBox(-1.3767F, -0.4507F, -2.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 234 */         PartPose.offsetAndRotation(-3.75F, 0.25F, 0.75F, 0.0F, 0.0F, 0.6545F));
/* 235 */     PartDefinition bone10 = leftArm.addOrReplaceChild("bone10", 
/* 236 */         CubeListBuilder.create().texOffs(60, 5).addBox(-1.7898F, -0.9644F, -2.1567F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F))
/* 237 */         .texOffs(19, 35).addBox(-1.7898F, 6.0356F, -2.1567F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 2)
/* 238 */         .addBox(-1.7898F, 6.0356F, -0.6567F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 0)
/* 239 */         .addBox(-1.7898F, 6.0356F, 0.8433F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 240 */         PartPose.offsetAndRotation(0.2094F, 6.7095F, 0.0F, -0.5564F, 0.1166F, -0.5569F));
/* 241 */     PartDefinition rightLeg = partdefinition.addOrReplaceChild("rightLeg", 
/* 242 */         CubeListBuilder.create().texOffs(72, 12).addBox(-2.0F, -0.375F, -1.75F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
/* 243 */         .texOffs(16, 65).addBox(-0.125F, 13.9965F, -3.8953F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 244 */         PartPose.offset(2.125F, 7.0F, 0.125F));
/* 245 */     PartDefinition bone5 = rightLeg.addOrReplaceChild("bone5", 
/* 246 */         CubeListBuilder.create().texOffs(72, 0).addBox(-1.5F, -3.0357F, -2.6784F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(23, 89)
/* 247 */         .addBox(-1.25F, 1.9643F, -2.6784F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 248 */         PartPose.offsetAndRotation(0.0F, 5.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 249 */     PartDefinition bone6 = rightLeg.addOrReplaceChild("bone6", CubeListBuilder.create(), 
/* 250 */         PartPose.offsetAndRotation(-4.0F, 8.0F, -1.0F, 0.6545F, 0.0F, 0.0F));
/* 251 */     PartDefinition bone6_r1 = bone6.addOrReplaceChild("bone6_r1", 
/* 252 */         CubeListBuilder.create().texOffs(63, 63).addBox(-1.3698F, -4.6945F, -1.3912F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 253 */         PartPose.offsetAndRotation(5.0F, 3.688F, -0.051F, 0.0F, 0.0F, -0.1745F));
/* 254 */     PartDefinition bone7 = rightLeg.addOrReplaceChild("bone7", 
/* 255 */         CubeListBuilder.create().texOffs(72, 73).addBox(-0.125F, -1.1097F, 3.0027F, 4.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 256 */         PartPose.offsetAndRotation(0.0F, 8.0F, -1.0F, -0.48F, 0.0F, 0.0F));
/* 257 */     PartDefinition leftLeg = partdefinition.addOrReplaceChild("leftLeg", 
/* 258 */         CubeListBuilder.create().texOffs(66, 47).addBox(-3.0F, -0.375F, -1.75F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(61, 55)
/* 259 */         .addBox(-3.875F, 13.9965F, -3.8953F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 260 */         PartPose.offsetAndRotation(-2.125F, 7.0F, 0.125F, 0.0F, 0.0F, 0.0F));
/* 261 */     PartDefinition bone3 = leftLeg.addOrReplaceChild("bone3", 
/* 262 */         CubeListBuilder.create().texOffs(0, 72).addBox(-2.5F, -3.0357F, -2.6784F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(90, 12)
/* 263 */         .addBox(-2.75F, 1.9643F, -2.6784F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 264 */         PartPose.offsetAndRotation(0.0F, 5.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 265 */     PartDefinition bone4 = leftLeg.addOrReplaceChild("bone4", CubeListBuilder.create(), 
/* 266 */         PartPose.offsetAndRotation(4.0F, 8.0F, -1.0F, 0.6545F, 0.0F, 0.0F));
/* 267 */     PartDefinition bone7_r1 = bone4.addOrReplaceChild("bone7_r1", 
/* 268 */         CubeListBuilder.create().texOffs(60, 37).addBox(-2.6302F, -4.6945F, -1.3912F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 269 */         PartPose.offsetAndRotation(-5.0F, 3.688F, -0.051F, 0.0F, 0.0F, 0.1745F));
/* 270 */     PartDefinition bone9 = leftLeg.addOrReplaceChild("bone9", 
/* 271 */         CubeListBuilder.create().texOffs(44, 71).addBox(-3.875F, -1.1097F, 3.0027F, 4.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 272 */         PartPose.offsetAndRotation(0.0F, 8.0F, -1.0F, -0.48F, 0.0F, 0.0F));
/* 273 */     return LayerDefinition.create(meshdefinition, 112, 112);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 279 */     this.head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 280 */     this.body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 281 */     this.rightArm2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 282 */     this.rightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 283 */     this.leftArm2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 284 */     this.leftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 285 */     this.rightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 286 */     this.leftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */   
/*     */   public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
/* 290 */     this.head.yRot = netHeadYaw / 57.295776F;
/* 291 */     this.head.xRot = headPitch / 57.295776F;
/* 292 */     this.rightArm2.xRot = Mth.cos(limbSwing * 0.6662F + 3.1415927F) * limbSwingAmount;
/* 293 */     this.rightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
/* 294 */     this.rightArm.xRot = Mth.cos(limbSwing * 0.6662F + 3.1415927F) * limbSwingAmount;
/* 295 */     this.leftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
/* 296 */     this.leftArm2.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
/* 297 */     this.leftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\client\model\Modeldark_latex_squiddog_model.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */