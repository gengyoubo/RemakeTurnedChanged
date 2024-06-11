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
/*     */ import net.minecraft.world.entity.Entity;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Modelnxt_hertx_sit_model<T extends Entity>
/*     */   extends EntityModel<T>
/*     */ {
/*  24 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("latex", "modelnxt_hertx_sit_model"), "main");
/*     */   public final ModelPart Head;
/*     */   public final ModelPart Body;
/*     */   public final ModelPart Tail;
/*     */   public final ModelPart LeftArm;
/*     */   public final ModelPart RightArm;
/*     */   public final ModelPart LeftLeg;
/*     */   public final ModelPart RightLeg;
/*     */   
/*     */   public Modelnxt_hertx_sit_model(ModelPart root) {
/*  34 */     this.Head = root.getChild("Head");
/*  35 */     this.Body = root.getChild("Body");
/*  36 */     this.Tail = root.getChild("Tail");
/*  37 */     this.LeftArm = root.getChild("LeftArm");
/*  38 */     this.RightArm = root.getChild("RightArm");
/*  39 */     this.LeftLeg = root.getChild("LeftLeg");
/*  40 */     this.RightLeg = root.getChild("RightLeg");
/*     */   }
/*     */   
/*     */   public static LayerDefinition createBodyLayer() {
/*  44 */     MeshDefinition meshdefinition = new MeshDefinition();
/*  45 */     PartDefinition partdefinition = meshdefinition.getRoot();
/*  46 */     PartDefinition Head = partdefinition.addOrReplaceChild("Head", 
/*  47 */         CubeListBuilder.create().texOffs(46, 33).addBox(-2.0F, -2.65F, -3.2F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(58, 12)
/*  48 */         .addBox(-2.0F, -6.65F, 1.8F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(24, 18)
/*  49 */         .addBox(-2.0F, -2.65F, 2.8F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(62, 64)
/*  50 */         .addBox(-3.0F, -2.65F, 1.8F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 11)
/*  51 */         .addBox(-3.0F, -0.65F, -3.1F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(20, 14)
/*  52 */         .addBox(-1.5F, 0.35F, -2.85F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 33)
/*  53 */         .addBox(-3.5F, -5.65F, 1.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(31, 0)
/*  54 */         .addBox(2.5F, -5.65F, 1.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 39)
/*  55 */         .addBox(2.0F, -6.65F, 1.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 45)
/*  56 */         .addBox(-3.0F, -6.65F, 1.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(31, 0)
/*  57 */         .addBox(-3.0F, -6.65F, -3.2F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(10, 50)
/*  58 */         .addBox(2.0F, -5.65F, -4.2F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(34, 48)
/*  59 */         .addBox(-3.0F, -5.65F, -4.2F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 7)
/*  60 */         .addBox(-2.0F, -5.65F, -4.2F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  61 */         PartPose.offset(0.0F, 9.0F, -1.0F));
/*  62 */     PartDefinition Jaw = Head.addOrReplaceChild("Jaw", 
/*  63 */         CubeListBuilder.create().texOffs(30, 57).addBox(2.0F, 11.45F, -6.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(31, 6)
/*  64 */         .addBox(-2.0F, 11.45F, -6.2F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 33)
/*  65 */         .addBox(-3.0F, 12.45F, -5.2F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 56)
/*  66 */         .addBox(-3.0F, 11.45F, -6.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), 
/*  67 */         PartPose.offset(0.0F, -14.0F, 2.0F));
/*  68 */     PartDefinition bone2 = Jaw.addOrReplaceChild("bone2", 
/*  69 */         CubeListBuilder.create().texOffs(33, 33).addBox(-3.0F, -9.7328F, -14.2583F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
/*  70 */         .texOffs(36, 46).addBox(-3.0F, -9.7328F, -14.6725F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  71 */         PartPose.offsetAndRotation(0.0F, 29.0F, -2.0F, -0.7854F, 0.0F, 0.0F));
/*  72 */     PartDefinition bone = Head.addOrReplaceChild("bone", 
/*  73 */         CubeListBuilder.create().texOffs(38, 59).addBox(-3.0F, -17.5716F, 11.6319F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
/*  74 */         .texOffs(58, 46).addBox(-3.0F, -17.5716F, 12.0461F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  75 */         PartPose.offsetAndRotation(0.0F, 15.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
/*  76 */     PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1", 
/*  77 */         CubeListBuilder.create().texOffs(33, 35).addBox(-2.9F, 2.5831F, 6.5717F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(9, 59)
/*  78 */         .addBox(-2.9F, 2.5831F, 1.5717F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(12, 30)
/*  79 */         .addBox(1.9F, 2.5831F, 6.5717F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 30)
/*  80 */         .addBox(-3.4F, 3.9354F, 5.2094F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 14)
/*  81 */         .addBox(2.4F, 3.9354F, 5.2094F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 48)
/*  82 */         .addBox(1.9F, 2.5831F, 1.5717F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 63)
/*  83 */         .addBox(-3.4F, 3.9354F, 1.2094F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(2.4F, 3.9354F, 1.2094F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), 
/*     */         
/*  85 */         PartPose.offsetAndRotation(0.0F, -8.6F, -0.2F, 0.2618F, 0.0F, 0.0F));
/*  86 */     PartDefinition Body = partdefinition.addOrReplaceChild("Body", 
/*  87 */         CubeListBuilder.create().texOffs(0, 14).addBox(-4.0F, -0.0614F, -2.1302F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
/*  88 */         .texOffs(59, 30).addBox(-3.0F, 0.9386F, -3.1302F, 6.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
/*  89 */         .addBox(-4.0F, 0.9386F, 1.8698F, 8.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 0)
/*  90 */         .addBox(3.0F, 0.9386F, -3.1302F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
/*  91 */         .addBox(-4.0F, 0.9386F, -3.1302F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(50, 61)
/*  92 */         .addBox(3.0F, -1.0614F, -2.6302F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(21, 61)
/*  93 */         .addBox(-4.0F, -1.0614F, -2.6302F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(24, 39)
/*  94 */         .addBox(-1.0F, 1.9386F, -3.3802F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 56)
/*  95 */         .addBox(-2.5F, 5.9386F, -3.1302F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 18).addBox(0.5F, 5.9386F, -3.1302F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*     */         
/*  97 */         PartPose.offsetAndRotation(0.0F, 9.0F, -1.0F, 0.1745F, 0.0F, 0.0F));
/*  98 */     PartDefinition Tail = partdefinition.addOrReplaceChild("Tail", CubeListBuilder.create(), 
/*  99 */         PartPose.offsetAndRotation(0.0F, 19.625F, 0.0F, 0.5236F, 0.0F, 0.0F));
/* 100 */     PartDefinition cube_r10 = Tail.addOrReplaceChild("cube_r10", 
/* 101 */         CubeListBuilder.create().texOffs(17, 0).addBox(-1.3F, 26.1445F, 11.7379F, 3.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), 
/* 102 */         PartPose.offsetAndRotation(0.0F, -17.5263F, 5.5F, -0.0873F, 0.0F, 0.0F));
/* 103 */     PartDefinition cube_r2 = Tail.addOrReplaceChild("cube_r2", 
/* 104 */         CubeListBuilder.create().texOffs(16, 22).addBox(-1.3F, 21.2659F, 11.9581F, 3.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), 
/* 105 */         PartPose.offsetAndRotation(0.0F, -17.5263F, 5.5F, -0.3927F, 0.0F, 0.0F));
/* 106 */     PartDefinition cube_r3 = Tail.addOrReplaceChild("cube_r3", 
/* 107 */         CubeListBuilder.create().texOffs(0, 0).addBox(-1.3F, 14.8425F, 9.334F, 3.0F, 3.0F, 11.0F, new CubeDeformation(0.0F)), 
/* 108 */         PartPose.offsetAndRotation(0.0F, -17.5263F, 5.5F, -0.7854F, 0.0F, 0.0F));
/* 109 */     PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", 
/* 110 */         CubeListBuilder.create().texOffs(30, 18).addBox(-3.0F, -2.2697F, -2.8839F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F))
/* 111 */         .texOffs(20, 55).addBox(-3.0F, 5.7303F, -2.8839F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(17, 0)
/* 112 */         .addBox(-3.25F, 5.7303F, -1.8839F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(46, 16)
/* 113 */         .addBox(-3.0F, 7.7303F, -2.8839F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(18, 54)
/* 114 */         .addBox(-3.0F, 11.7303F, 0.1161F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 5)
/* 115 */         .addBox(-3.0F, 11.7303F, -1.3839F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 42)
/* 116 */         .addBox(0.0F, 11.7303F, -2.8839F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(18, 52)
/* 117 */         .addBox(-3.0F, 11.7303F, -2.8839F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 118 */         PartPose.offsetAndRotation(-5.0F, 12.0F, -1.0F, -0.7854F, 0.0F, 0.0F));
/* 119 */     PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", 
/* 120 */         CubeListBuilder.create().texOffs(0, 30).addBox(-1.0F, -2.2697F, -2.4697F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(54, 24)
/* 121 */         .addBox(-1.0F, 5.7303F, -2.4697F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(24, 46)
/* 122 */         .addBox(-1.0F, 7.7303F, -2.4697F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 42)
/* 123 */         .addBox(-1.0F, 11.7303F, -2.4697F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(18, 50)
/* 124 */         .addBox(1.0F, 11.7303F, -2.4697F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 48)
/* 125 */         .addBox(1.0F, 11.7303F, -0.9697F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 44)
/* 126 */         .addBox(1.0F, 11.7303F, 0.5303F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(17, 4).addBox(2.25F, 5.7303F, -1.4697F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), 
/*     */         
/* 128 */         PartPose.offsetAndRotation(5.0F, 12.0F, -1.0F, -0.7854F, 0.0F, 0.0F));
/* 129 */     PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", 
/* 130 */         CubeListBuilder.create().texOffs(44, 53).addBox(-1.75F, -0.8F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 131 */         PartPose.offsetAndRotation(-2.0F, 22.0F, 1.0F, -1.8326F, 0.0F, -1.5708F));
/* 132 */     PartDefinition LeftLeg_r1 = LeftLeg.addOrReplaceChild("LeftLeg_r1", 
/* 133 */         CubeListBuilder.create().texOffs(45, 45).addBox(-15.75F, -3.0F, -3.4102F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 134 */         PartPose.offsetAndRotation(14.0F, 13.7095F, 3.6236F, 1.5708F, 0.0F, 0.0F));
/* 135 */     PartDefinition cube_r4 = LeftLeg.addOrReplaceChild("cube_r4", CubeListBuilder.create(), 
/* 136 */         PartPose.offsetAndRotation(12.0F, 2.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 137 */     PartDefinition cube_r4_r1 = cube_r4.addOrReplaceChild("cube_r4_r1", 
/* 138 */         CubeListBuilder.create().texOffs(41, 61).addBox(-15.75F, -3.7F, 3.0F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(62, 36)
/* 139 */         .addBox(-15.75F, -4.7F, 3.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(57, 57).addBox(-15.75F, -8.7F, 3.0F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), 
/*     */         
/* 141 */         PartPose.offsetAndRotation(2.0F, 13.9626F, 8.9204F, 1.5708F, 0.0F, 0.0F));
/* 142 */     PartDefinition cube_r5 = LeftLeg.addOrReplaceChild("cube_r5", CubeListBuilder.create(), 
/* 143 */         PartPose.offsetAndRotation(12.0F, 2.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
/* 144 */     PartDefinition cube_r5_r1 = cube_r5.addOrReplaceChild("cube_r5_r1", 
/* 145 */         CubeListBuilder.create().texOffs(12, 39).addBox(-15.75F, 4.4152F, -5.0633F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 146 */         PartPose.offsetAndRotation(2.0F, -0.0927F, 1.6082F, -0.7854F, 0.0F, 0.0F));
/* 147 */     PartDefinition cube_r6 = LeftLeg.addOrReplaceChild("cube_r6", 
/* 148 */         CubeListBuilder.create().texOffs(0, 46).addBox(-13.75F, -1.5045F, -2.4584F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 149 */         PartPose.offsetAndRotation(12.0F, 2.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 150 */     PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", 
/* 151 */         CubeListBuilder.create().texOffs(44, 53).mirror()
/* 152 */         .addBox(-2.25F, -0.8F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), 
/* 153 */         PartPose.offsetAndRotation(2.0F, 22.0F, 1.0F, -1.8326F, 0.0F, 1.5708F));
/* 154 */     PartDefinition LeftLeg_r2 = RightLeg.addOrReplaceChild("LeftLeg_r2", 
/* 155 */         CubeListBuilder.create().texOffs(45, 45).mirror()
/* 156 */         .addBox(11.75F, -3.0F, -3.4102F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), 
/* 157 */         PartPose.offsetAndRotation(-14.0F, 13.7095F, 3.6236F, 1.5708F, 0.0F, 0.0F));
/* 158 */     PartDefinition cube_r7 = RightLeg.addOrReplaceChild("cube_r7", CubeListBuilder.create(), 
/* 159 */         PartPose.offsetAndRotation(-12.0F, 2.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 160 */     PartDefinition cube_r5_r2 = cube_r7.addOrReplaceChild("cube_r5_r2", 
/* 161 */         CubeListBuilder.create().texOffs(41, 61).mirror().addBox(11.75F, -3.7F, 3.0F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
/* 162 */         .mirror(false).texOffs(62, 36).mirror().addBox(11.75F, -4.7F, 3.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
/* 163 */         .texOffs(57, 57).mirror().addBox(11.75F, -8.7F, 3.0F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), 
/* 164 */         PartPose.offsetAndRotation(-2.0F, 13.9626F, 8.9204F, 1.5708F, 0.0F, 0.0F));
/* 165 */     PartDefinition cube_r8 = RightLeg.addOrReplaceChild("cube_r8", CubeListBuilder.create(), 
/* 166 */         PartPose.offsetAndRotation(-12.0F, 2.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
/* 167 */     PartDefinition cube_r6_r1 = cube_r8.addOrReplaceChild("cube_r6_r1", 
/* 168 */         CubeListBuilder.create().texOffs(12, 39).mirror()
/* 169 */         .addBox(11.75F, 4.4152F, -5.0633F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), 
/* 170 */         PartPose.offsetAndRotation(-2.0F, -0.0927F, 1.6082F, -0.7854F, 0.0F, 0.0F));
/* 171 */     PartDefinition cube_r9 = RightLeg.addOrReplaceChild("cube_r9", 
/* 172 */         CubeListBuilder.create().texOffs(0, 46).mirror()
/* 173 */         .addBox(9.75F, -1.5045F, -2.4584F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), 
/* 174 */         PartPose.offsetAndRotation(-12.0F, 2.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 175 */     return LayerDefinition.create(meshdefinition, 128, 128);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 181 */     this.Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 182 */     this.Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 183 */     this.Tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 184 */     this.LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 185 */     this.RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 186 */     this.LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 187 */     this.RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */   
/*     */   public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
/* 191 */     this.Head.yRot = netHeadYaw / 57.295776F;
/* 192 */     this.Head.xRot = headPitch / 57.295776F;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\client\model\Modelnxt_hertx_sit_model.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */