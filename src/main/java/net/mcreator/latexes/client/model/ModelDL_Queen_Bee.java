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
/*     */ public class ModelDL_Queen_Bee<T extends Entity>
/*     */   extends EntityModel<T>
/*     */ {
/*  25 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("latex", "model_dl_queen_bee"), "main");
/*     */   public final ModelPart Head;
/*     */   public final ModelPart LeftLeg;
/*     */   public final ModelPart RightLeg;
/*     */   public final ModelPart LeftArm;
/*     */   public final ModelPart RightArm;
/*     */   public final ModelPart Tail;
/*     */   public final ModelPart Wings;
/*     */   public final ModelPart Body;
/*     */   
/*     */   public ModelDL_Queen_Bee(ModelPart root) {
/*  36 */     this.Head = root.getChild("Head");
/*  37 */     this.LeftLeg = root.getChild("LeftLeg");
/*  38 */     this.RightLeg = root.getChild("RightLeg");
/*  39 */     this.LeftArm = root.getChild("LeftArm");
/*  40 */     this.RightArm = root.getChild("RightArm");
/*  41 */     this.Tail = root.getChild("Tail");
/*  42 */     this.Wings = root.getChild("Wings");
/*  43 */     this.Body = root.getChild("Body");
/*     */   }
/*     */   
/*     */   public static LayerDefinition createBodyLayer() {
/*  47 */     MeshDefinition meshdefinition = new MeshDefinition();
/*  48 */     PartDefinition partdefinition = meshdefinition.getRoot();
/*  49 */     PartDefinition Head = partdefinition.addOrReplaceChild("Head", 
/*  50 */         CubeListBuilder.create().texOffs(28, 28).addBox(-4.0F, -7.0F, -4.0F, 8.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)), 
/*  51 */         PartPose.offsetAndRotation(0.0F, -10.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));
/*  52 */     PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1", 
/*  53 */         CubeListBuilder.create().texOffs(0, 0).addBox(-3.5F, -20.7F, -6.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(4, 5)
/*  54 */         .addBox(-9.5F, -20.7F, -6.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), 
/*  55 */         PartPose.offsetAndRotation(6.0F, -4.4965F, -13.7044F, -1.5708F, 0.0F, 0.0F));
/*  56 */     PartDefinition cube_r2 = Head.addOrReplaceChild("cube_r2", 
/*  57 */         CubeListBuilder.create().texOffs(31, 0).addBox(-3.5F, -19.7F, -6.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(58, 0)
/*  58 */         .addBox(-9.5F, -19.7F, -6.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), 
/*  59 */         PartPose.offsetAndRotation(6.0F, 10.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/*  60 */     PartDefinition Mask = Head.addOrReplaceChild("Mask", 
/*  61 */         CubeListBuilder.create().texOffs(28, 25).addBox(-3.0F, -12.0F, 4.5F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(28, 26)
/*  62 */         .addBox(3.0F, -13.0F, 4.5F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(48, 27)
/*  63 */         .addBox(4.0F, -14.0F, 4.5F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(28, 24)
/*  64 */         .addBox(-6.0F, -15.0F, 4.5F, 12.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 12)
/*  65 */         .addBox(-3.0F, -16.0F, 4.5F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(14, 34)
/*  66 */         .addBox(-2.0F, -17.0F, 4.5F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(2, 49)
/*  67 */         .addBox(-5.0F, -14.0F, 4.5F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(10, 9)
/*  68 */         .addBox(-4.0F, -13.0F, 4.5F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(17, 49)
/*  69 */         .addBox(-1.0F, -14.0F, 4.5F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), 
/*  70 */         PartPose.offset(0.0F, 10.0F, 0.0F));
/*  71 */     PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create(), 
/*  72 */         PartPose.offsetAndRotation(2.0F, 5.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));
/*  73 */     PartDefinition cube_r3 = LeftLeg.addOrReplaceChild("cube_r3", 
/*  74 */         CubeListBuilder.create().texOffs(44, 8).addBox(-3.5F, -3.25F, -0.5F, 6.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(32, 65)
/*  75 */         .addBox(-3.0F, -6.25F, 0.0F, 5.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  76 */         PartPose.offsetAndRotation(0.0F, 9.6932F, -2.6685F, -0.829F, 0.0F, 0.0F));
/*  77 */     PartDefinition cube_r4 = LeftLeg.addOrReplaceChild("cube_r4", 
/*  78 */         CubeListBuilder.create().texOffs(14, 60).addBox(-3.0F, -6.25F, 0.0F, 5.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  79 */         PartPose.offsetAndRotation(0.0F, 7.0F, 0.0F, 0.3054F, 0.0F, 0.0F));
/*  80 */     PartDefinition cube_r5 = LeftLeg.addOrReplaceChild("cube_r5", 
/*  81 */         CubeListBuilder.create().texOffs(27, 34).addBox(-1.0F, 11.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(31, 34)
/*  82 */         .addBox(-2.5F, 11.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 35)
/*  83 */         .addBox(0.5F, 11.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 51).addBox(-2.5F, 6.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), 
/*     */         
/*  85 */         PartPose.offsetAndRotation(0.0F, 9.0052F, 4.2588F, -1.1781F, 0.0F, 0.0F));
/*  86 */     PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create(), 
/*  87 */         PartPose.offsetAndRotation(-2.0F, 5.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));
/*  88 */     PartDefinition cube_r6 = RightLeg.addOrReplaceChild("cube_r6", 
/*  89 */         CubeListBuilder.create().texOffs(61, 3).addBox(-2.5F, -3.25F, -0.5F, 6.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(66, 11)
/*  90 */         .addBox(-2.0F, -6.25F, 0.0F, 5.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  91 */         PartPose.offsetAndRotation(0.0F, 9.6932F, -2.6685F, -0.829F, 0.0F, 0.0F));
/*  92 */     PartDefinition cube_r7 = RightLeg.addOrReplaceChild("cube_r7", 
/*  93 */         CubeListBuilder.create().texOffs(60, 60).addBox(-2.0F, -6.25F, 0.0F, 5.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  94 */         PartPose.offsetAndRotation(0.0F, 7.0F, 0.0F, 0.3054F, 0.0F, 0.0F));
/*  95 */     PartDefinition cube_r8 = RightLeg.addOrReplaceChild("cube_r8", 
/*  96 */         CubeListBuilder.create().texOffs(17, 47).addBox(0.0F, 11.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 47)
/*  97 */         .addBox(1.5F, 11.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(47, 25)
/*  98 */         .addBox(-1.5F, 11.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 73).addBox(-1.5F, 6.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), 
/*     */         
/* 100 */         PartPose.offsetAndRotation(0.0F, 9.0052F, 4.2588F, -1.1781F, 0.0F, 0.0F));
/* 101 */     PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", 
/* 102 */         CubeListBuilder.create().texOffs(46, 51).addBox(-4.0F, 2.0F, -2.0F, 3.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(24, 35)
/* 103 */         .addBox(-4.0F, 16.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 35)
/* 104 */         .addBox(-4.0F, 16.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 35)
/* 105 */         .addBox(-4.0F, 16.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(63, 73)
/* 106 */         .addBox(-5.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(67, 31)
/* 107 */         .addBox(-4.5F, -2.5F, -2.5F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(65, 22).addBox(-4.5F, 11.0F, -2.5F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), 
/*     */         
/* 109 */         PartPose.offsetAndRotation(5.0F, -7.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));
/* 110 */     PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", 
/* 111 */         CubeListBuilder.create().texOffs(0, 58).addBox(1.0F, 2.0F, -2.0F, 3.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(44, 26)
/* 112 */         .addBox(3.0F, 16.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(41, 25)
/* 113 */         .addBox(3.0F, 16.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(7, 36)
/* 114 */         .addBox(3.0F, 16.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(78, 0)
/* 115 */         .addBox(1.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(68, 40)
/* 116 */         .addBox(0.5F, -2.5F, -2.5F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(45, 71).addBox(0.5F, 11.0F, -2.5F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), 
/*     */         
/* 118 */         PartPose.offsetAndRotation(-5.0F, -7.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));
/* 119 */     PartDefinition Tail = partdefinition.addOrReplaceChild("Tail", CubeListBuilder.create(), 
/* 120 */         PartPose.offsetAndRotation(0.0F, 2.0F, 1.0F, -3.1416F, 0.0F, 3.1416F));
/* 121 */     PartDefinition cube_r9 = Tail.addOrReplaceChild("cube_r9", 
/* 122 */         CubeListBuilder.create().texOffs(78, 60).addBox(-2.0F, 0.0F, -4.5F, 5.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
/* 123 */         .addBox(-4.0F, -2.0F, -17.5F, 9.0F, 9.0F, 13.0F, new CubeDeformation(0.0F)), 
/* 124 */         PartPose.offsetAndRotation(-0.5F, -3.0F, 1.0F, 0.3927F, 0.0F, 0.0F));
/* 125 */     PartDefinition cube_r10 = Tail.addOrReplaceChild("cube_r10", 
/* 126 */         CubeListBuilder.create().texOffs(10, 34).addBox(0.0F, -9.0F, -18.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), 
/* 127 */         PartPose.offsetAndRotation(-0.5F, -9.247F, -7.3241F, 1.5708F, 0.0F, 0.0F));
/* 128 */     PartDefinition cube_r11 = Tail.addOrReplaceChild("cube_r11", 
/* 129 */         CubeListBuilder.create().texOffs(28, 26).addBox(0.0F, -5.0F, -19.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 130 */         PartPose.offsetAndRotation(-0.5F, -3.0F, 1.0F, 0.7854F, 0.0F, 0.0F));
/* 131 */     PartDefinition Wings = partdefinition.addOrReplaceChild("Wings", CubeListBuilder.create(), 
/* 132 */         PartPose.offsetAndRotation(0.0F, -3.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));
/* 133 */     PartDefinition LeftWings = Wings.addOrReplaceChild("LeftWings", 
/* 134 */         CubeListBuilder.create().texOffs(30, 47).addBox(0.159F, -6.6563F, 1.8484F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 47)
/* 135 */         .addBox(-0.841F, -8.6563F, 1.8484F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(2, 76)
/* 136 */         .addBox(-1.841F, -9.6563F, 1.8484F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(4, 34)
/* 137 */         .addBox(-4.841F, -10.6563F, 1.8484F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(62, 42)
/* 138 */         .addBox(-2.841F, -9.6563F, 1.8484F, 1.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(47, 11)
/* 139 */         .addBox(-0.841F, -9.6563F, 1.8484F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(33, 27)
/* 140 */         .addBox(-8.841F, -9.6563F, 1.8484F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(22, 47)
/* 141 */         .addBox(-4.841F, -9.6563F, 1.8484F, 2.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(52, 24)
/* 142 */         .addBox(-7.841F, -8.6563F, 1.8484F, 2.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(62, 55)
/* 143 */         .addBox(-5.841F, -8.6563F, 1.8484F, 1.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(32, 60)
/* 144 */         .addBox(-8.841F, -8.6563F, 1.8484F, 1.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(45, 12)
/* 145 */         .addBox(-10.841F, -8.6563F, 1.8484F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(56, 24)
/* 146 */         .addBox(-10.841F, -7.6563F, 1.8484F, 2.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(47, 8)
/* 147 */         .addBox(-11.841F, -7.6563F, 1.8484F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(6, 76)
/* 148 */         .addBox(-12.841F, -5.6563F, 1.8484F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(4, 76)
/* 149 */         .addBox(-11.841F, -5.6563F, 1.8484F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(33, 26)
/* 150 */         .addBox(-11.841F, 0.3438F, 1.8484F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(44, 25)
/* 151 */         .addBox(-7.841F, -0.6563F, 1.8484F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(22, 34)
/* 152 */         .addBox(-5.841F, -1.6563F, 1.8484F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(47, 10)
/* 153 */         .addBox(-2.841F, -2.6563F, 1.8484F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(20, 47)
/* 154 */         .addBox(-1.841F, -3.6563F, 1.8484F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(41, 27).addBox(-0.841F, -4.6563F, 1.8484F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), 
/*     */         
/* 156 */         PartPose.offset(-6.159F, 2.6563F, -6.0984F));
/* 157 */     PartDefinition cube_r12 = LeftWings.addOrReplaceChild("cube_r12", 
/* 158 */         CubeListBuilder.create().texOffs(60, 55).addBox(-0.9688F, -3.6563F, 0.0F, 1.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(43, 8)
/* 159 */         .addBox(-3.9688F, -0.6563F, 0.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(23, 37)
/* 160 */         .addBox(0.0312F, 2.3438F, 0.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(31, 11)
/* 161 */         .addBox(-3.9688F, 3.3438F, 0.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(4, 37)
/* 162 */         .addBox(3.0312F, 0.3438F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(40, 25)
/* 163 */         .addBox(2.0312F, 1.3438F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(2, 7)
/* 164 */         .addBox(-4.9688F, -0.6563F, 0.0F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(36, 22)
/* 165 */         .addBox(-3.9688F, -2.6563F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(30, 73)
/* 166 */         .addBox(-2.9688F, -2.6563F, 0.0F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 76)
/* 167 */         .addBox(-1.9688F, -2.6563F, 0.0F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(60, 36)
/* 168 */         .addBox(0.0312F, -3.6563F, 0.0F, 2.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(41, 12)
/* 169 */         .addBox(-2.9688F, -3.6563F, 0.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(39, 8)
/* 170 */         .addBox(2.0312F, -3.6563F, 0.0F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(31, 12)
/* 171 */         .addBox(-0.9688F, -4.6563F, 0.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(45, 8)
/* 172 */         .addBox(3.0312F, -3.6563F, 0.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(2, 47).addBox(4.0312F, -1.6563F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), 
/*     */         
/* 174 */         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));
/* 175 */     PartDefinition RightWings = Wings.addOrReplaceChild("RightWings", 
/* 176 */         CubeListBuilder.create().texOffs(0, 34).addBox(-2.5476F, -4.619F, 0.0F, 2.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(31, 6)
/* 177 */         .addBox(-2.5476F, 3.381F, 0.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(15, 37)
/* 178 */         .addBox(0.4524F, 4.381F, 0.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(4, 22)
/* 179 */         .addBox(0.4524F, -3.619F, 0.0F, 2.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(34, 60)
/* 180 */         .addBox(-0.5476F, -3.619F, 0.0F, 1.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(10, 0)
/* 181 */         .addBox(2.4524F, -3.619F, 0.0F, 1.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(31, 8)
/* 182 */         .addBox(2.4524F, 5.381F, 0.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(64, 36)
/* 183 */         .addBox(5.4524F, -0.619F, 0.0F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(58, 69)
/* 184 */         .addBox(6.4524F, -0.619F, 0.0F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(31, 0)
/* 185 */         .addBox(5.4524F, -2.619F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 22)
/* 186 */         .addBox(3.4524F, -2.619F, 0.0F, 2.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(19, 37)
/* 187 */         .addBox(3.4524F, -3.619F, 0.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(31, 9)
/* 188 */         .addBox(-0.5476F, -4.619F, 0.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(31, 10)
/* 189 */         .addBox(-4.5476F, -5.619F, 0.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(60, 42)
/* 190 */         .addBox(-3.5476F, -4.619F, 0.0F, 1.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(23, 35)
/* 191 */         .addBox(-5.5476F, -4.619F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(28, 73)
/* 192 */         .addBox(-4.5476F, -4.619F, 0.0F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(34, 42)
/* 193 */         .addBox(-5.5476F, -3.619F, 0.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(35, 0)
/* 194 */         .addBox(-6.5476F, -1.619F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(34, 34)
/* 195 */         .addBox(-5.5476F, 0.381F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(14, 35)
/* 196 */         .addBox(-4.5476F, 1.381F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(19, 35)
/* 197 */         .addBox(-3.5476F, 2.381F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), 
/* 198 */         PartPose.offset(11.5476F, -2.381F, -4.25F));
/* 199 */     PartDefinition cube_r13 = RightWings.addOrReplaceChild("cube_r13", 
/* 200 */         CubeListBuilder.create().texOffs(28, 23).addBox(-3.2667F, -4.6F, 0.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(11, 37)
/* 201 */         .addBox(0.7333F, -3.6F, 0.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
/* 202 */         .addBox(2.7333F, -2.6F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(7, 35)
/* 203 */         .addBox(-2.2667F, 2.4F, 0.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(30, 34)
/* 204 */         .addBox(-3.2667F, 1.4F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(4, 0)
/* 205 */         .addBox(-5.2667F, -1.6F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 7)
/* 206 */         .addBox(-3.2667F, -3.6F, 0.0F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(32, 42)
/* 207 */         .addBox(-4.2667F, -3.6F, 0.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(14, 58)
/* 208 */         .addBox(-2.2667F, -3.6F, 0.0F, 2.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(8, 0)
/* 209 */         .addBox(-0.2667F, -3.6F, 0.0F, 1.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(64, 16)
/* 210 */         .addBox(0.7333F, -2.6F, 0.0F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(28, 22)
/* 211 */         .addBox(-0.2667F, 3.4F, 0.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(41, 8)
/* 212 */         .addBox(2.7333F, -0.6F, 0.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(6, 0)
/* 213 */         .addBox(3.7333F, -0.6F, 0.0F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(64, 0).addBox(1.7333F, -2.6F, 0.0F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), 
/*     */         
/* 215 */         PartPose.offsetAndRotation(-5.2221F, 4.981F, -2.0148F, 0.0F, 0.7854F, 0.0F));
/* 216 */     PartDefinition cube_r14 = RightWings.addOrReplaceChild("cube_r14", 
/* 217 */         CubeListBuilder.create().texOffs(33, 28).addBox(11.0F, -3.0F, 0.75F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), 
/* 218 */         PartPose.offsetAndRotation(-16.5476F, 8.381F, 8.25F, 0.0F, 0.7854F, 0.0F));
/* 219 */     PartDefinition Body = partdefinition.addOrReplaceChild("Body", 
/* 220 */         CubeListBuilder.create().texOffs(0, 38).addBox(-6.0F, 1.0F, -2.0F, 12.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 22)
/* 221 */         .addBox(-5.0F, -1.0F, -4.0F, 10.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(31, 0)
/* 222 */         .addBox(-5.0F, 3.0F, -3.25F, 10.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(56, 43)
/* 223 */         .addBox(-7.0F, 0.0F, -4.0F, 2.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(19, 75)
/* 224 */         .addBox(-6.0F, 4.0F, -3.25F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(52, 24)
/* 225 */         .addBox(5.0F, 0.0F, -4.0F, 2.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(72, 74)
/* 226 */         .addBox(5.0F, 4.0F, -3.25F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(38, 16)
/* 227 */         .addBox(-5.0F, 3.25F, -3.0F, 10.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(22, 51)
/* 228 */         .addBox(-4.0F, 6.0F, -2.0F, 8.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 42)
/* 229 */         .addBox(-5.0F, 11.0F, -2.0F, 10.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 47).addBox(-3.0F, 9.0F, -2.5F, 6.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), 
/*     */         
/* 231 */         PartPose.offsetAndRotation(0.0F, -10.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));
/* 232 */     return LayerDefinition.create(meshdefinition, 128, 128);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 238 */     this.Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 239 */     this.LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 240 */     this.RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 241 */     this.LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 242 */     this.RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 243 */     this.Tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 244 */     this.Wings.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 245 */     this.Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */   
/*     */   public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
/* 249 */     this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
/* 250 */     this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + 3.1415927F) * limbSwingAmount;
/* 251 */     this.Head.yRot = netHeadYaw / 57.295776F;
/* 252 */     this.Head.xRot = headPitch / 57.295776F;
/* 253 */     this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
/* 254 */     this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\client\model\ModelDL_Queen_Bee.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */