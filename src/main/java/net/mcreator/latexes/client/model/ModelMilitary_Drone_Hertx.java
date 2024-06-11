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
/*     */ public class ModelMilitary_Drone_Hertx<T extends Entity>
/*     */   extends EntityModel<T>
/*     */ {
/*  25 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("latex", "model_military_drone_hertx"), "main");
/*     */   
/*     */   public final ModelPart Head;
/*     */   public final ModelPart Body;
/*     */   public final ModelPart Tail;
/*     */   public final ModelPart LeftArm;
/*     */   public final ModelPart RightArm;
/*     */   public final ModelPart LeftLeg;
/*     */   public final ModelPart RightLeg;
/*     */   
/*     */   public ModelMilitary_Drone_Hertx(ModelPart root) {
/*  36 */     this.Head = root.getChild("Head");
/*  37 */     this.Body = root.getChild("Body");
/*  38 */     this.Tail = root.getChild("Tail");
/*  39 */     this.LeftArm = root.getChild("LeftArm");
/*  40 */     this.RightArm = root.getChild("RightArm");
/*  41 */     this.LeftLeg = root.getChild("LeftLeg");
/*  42 */     this.RightLeg = root.getChild("RightLeg");
/*     */   }
/*     */   
/*     */   public static LayerDefinition createBodyLayer() {
/*  46 */     MeshDefinition meshdefinition = new MeshDefinition();
/*  47 */     PartDefinition partdefinition = meshdefinition.getRoot();
/*  48 */     PartDefinition Head = partdefinition.addOrReplaceChild("Head", 
/*  49 */         CubeListBuilder.create().texOffs(30, 25).addBox(-3.0F, -1.3F, -4.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(51, 53)
/*  50 */         .addBox(-2.0F, -2.4F, -3.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(16, 42)
/*  51 */         .addBox(-2.0F, -6.4F, 2.0F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(33, 7)
/*  52 */         .addBox(-1.5F, -6.775F, -3.75F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(30, 7)
/*  53 */         .addBox(-2.0F, -2.4F, 3.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 11)
/*  54 */         .addBox(-3.0F, -2.4F, 2.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 36)
/*  55 */         .addBox(-3.0F, -0.275F, -2.275F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(26, 12)
/*  56 */         .addBox(-1.0F, -0.15F, -2.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 44)
/*  57 */         .addBox(2.0F, -6.4F, 2.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 34)
/*  58 */         .addBox(-3.0F, -6.4F, 2.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 0)
/*  59 */         .addBox(-3.0F, -6.3F, -4.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(8, 58)
/*  60 */         .addBox(2.0F, -5.3F, -4.0F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 63)
/*  61 */         .addBox(2.0F, -2.3F, -4.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(56, 42)
/*  62 */         .addBox(-3.0F, -5.3F, -4.0F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(63, 53)
/*  63 */         .addBox(-3.0F, -2.3F, -4.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(16, 6)
/*  64 */         .addBox(-2.0F, -5.3F, -4.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 12)
/*  65 */         .addBox(-2.0F, -2.3F, -4.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 40)
/*  66 */         .addBox(-1.0F, -2.8F, -4.875F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  67 */         PartPose.offset(0.0F, -2.0F, -0.2F));
/*  68 */     PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1", 
/*  69 */         CubeListBuilder.create().texOffs(35, 15).addBox(-1.0F, -4.3F, -6.7F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), 
/*  70 */         PartPose.offsetAndRotation(0.0F, 1.75F, 1.825F, 0.0F, 0.48F, 0.0F));
/*  71 */     PartDefinition cube_r2 = Head.addOrReplaceChild("cube_r2", 
/*  72 */         CubeListBuilder.create().texOffs(27, 36).addBox(-1.0F, -4.3F, -6.7F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), 
/*  73 */         PartPose.offsetAndRotation(0.0F, 1.75F, 1.825F, 0.0F, -0.48F, 0.0F));
/*  74 */     PartDefinition Antenna = Head.addOrReplaceChild("Antenna", CubeListBuilder.create(), PartPose.offset(0.0F, -6.1528F, 3.0874F));
/*  75 */     PartDefinition cube_r3 = Antenna.addOrReplaceChild("cube_r3", 
/*  76 */         CubeListBuilder.create().texOffs(60, 0).addBox(0.0F, -2.75F, -1.25F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(22, 59)
/*  77 */         .addBox(-6.5F, -2.75F, -1.25F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(16, 0)
/*  78 */         .addBox(-6.5F, -3.75F, -5.25F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 58).addBox(0.0F, -3.75F, -5.25F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), 
/*     */         
/*  80 */         PartPose.offsetAndRotation(2.75F, 0.3511F, 2.7389F, 1.3526F, 0.0F, 0.0F));
/*  81 */     PartDefinition Body = partdefinition.addOrReplaceChild("Body", 
/*  82 */         CubeListBuilder.create().texOffs(15, 15).addBox(-4.0F, 0.2F, -2.0F, 8.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 28)
/*  83 */         .addBox(-4.0F, 10.2F, -2.0F, 8.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(35, 32)
/*  84 */         .addBox(-3.625F, 6.2F, -2.0F, 7.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  85 */         PartPose.offset(0.0F, -2.0F, 0.0F));
/*  86 */     PartDefinition Tail = partdefinition.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offset(0.0F, 10.0F, 0.0F));
/*  87 */     PartDefinition cube_r4 = Tail.addOrReplaceChild("cube_r4", 
/*  88 */         CubeListBuilder.create().texOffs(0, 21).addBox(-1.25F, 10.3026F, 24.6391F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
/*  89 */         .addBox(-0.25F, 10.8026F, 25.6391F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(10, 1)
/*  90 */         .addBox(1.75F, 10.8026F, 25.6391F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 0)
/*  91 */         .addBox(-0.25F, 12.8026F, 25.6391F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 1)
/*  92 */         .addBox(1.75F, 12.8026F, 25.6391F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(17, 25)
/*  93 */         .addBox(-0.25F, 11.3026F, 15.6391F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), 
/*  94 */         PartPose.offsetAndRotation(-0.75F, -10.3628F, -1.0141F, -0.3927F, 0.0F, 0.0F));
/*  95 */     PartDefinition cube_r5 = Tail.addOrReplaceChild("cube_r5", 
/*  96 */         CubeListBuilder.create().texOffs(0, 15).addBox(-0.25F, 4.2F, 7.0F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), 
/*  97 */         PartPose.offsetAndRotation(-0.75F, -9.2F, 0.0F, -0.7854F, 0.0F, 0.0F));
/*  98 */     PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", 
/*  99 */         CubeListBuilder.create().texOffs(54, 21).addBox(-2.0F, -1.8F, -2.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(64, 7)
/* 100 */         .addBox(-0.375F, -2.8F, -1.875F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(39, 15)
/* 101 */         .addBox(-3.0F, 5.2F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(46, 10)
/* 102 */         .addBox(-3.0F, 11.2F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 42)
/* 103 */         .addBox(-3.0F, 11.2F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 12)
/* 104 */         .addBox(-1.0F, 11.2F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 39).addBox(-3.0F, 11.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*     */         
/* 106 */         PartPose.offsetAndRotation(-5.0F, 1.0F, 0.125F, -1.5704F, -0.1308F, 0.0379F));
/* 107 */     PartDefinition M16 = LeftArm.addOrReplaceChild("M16", CubeListBuilder.create(), 
/* 108 */         PartPose.offsetAndRotation(-0.4987F, 9.9293F, -2.0497F, 1.5708F, 0.0F, 0.0873F));
/* 109 */     PartDefinition Grip = M16.addOrReplaceChild("Grip", 
/* 110 */         CubeListBuilder.create().texOffs(32, 50).addBox(-0.5209F, -0.0875F, 1.2465F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), 
/* 111 */         PartPose.offset(0.0F, 0.0F, 0.0F));
/* 112 */     PartDefinition cube_r6 = Grip.addOrReplaceChild("cube_r6", 
/* 113 */         CubeListBuilder.create().texOffs(0, 0).addBox(-0.5934F, 2.0486F, 1.6886F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 114 */         PartPose.offsetAndRotation(0.1225F, -0.4268F, -0.7684F, 0.3927F, 0.0F, 0.0F));
/* 115 */     PartDefinition cube_r7 = Grip.addOrReplaceChild("cube_r7", 
/* 116 */         CubeListBuilder.create().texOffs(48, 25).addBox(-0.4934F, 2.0486F, 0.5386F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), 
/* 117 */         PartPose.offsetAndRotation(0.1225F, -0.7768F, 0.1316F, 0.3927F, 0.0F, 0.0F));
/* 118 */     PartDefinition Mag = M16.addOrReplaceChild("Mag", 
/* 119 */         CubeListBuilder.create().texOffs(30, 25).addBox(-0.4934F, 1.9643F, -3.2225F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), 
/* 120 */         PartPose.offset(0.1225F, -1.7768F, 0.0066F));
/* 121 */     PartDefinition cube_r8 = Mag.addOrReplaceChild("cube_r8", 
/* 122 */         CubeListBuilder.create().texOffs(48, 0).addBox(-0.4934F, 4.6897F, -0.8395F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), 
/* 123 */         PartPose.offsetAndRotation(0.0F, 0.1875F, -0.5F, -0.3927F, 0.0F, 0.0F));
/* 124 */     PartDefinition Receiver = M16.addOrReplaceChild("Receiver", 
/* 125 */         CubeListBuilder.create().texOffs(10, 0).addBox(-0.7434F, -0.2232F, -4.6225F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
/* 126 */         .texOffs(0, 15).addBox(-0.7434F, -0.2232F, -0.6225F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 34)
/* 127 */         .addBox(-0.7434F, -0.2232F, -3.6225F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(15, 15)
/* 128 */         .addBox(-0.4309F, -0.9732F, -3.6225F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(23, 51)
/* 129 */         .addBox(-0.4309F, -1.9732F, -3.6225F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(6, 15).addBox(-0.4309F, -0.9732F, 2.3775F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), 
/*     */         
/* 131 */         PartPose.offset(0.1225F, -1.7768F, 0.0066F));
/* 132 */     PartDefinition Stock = M16.addOrReplaceChild("Stock", 
/* 133 */         CubeListBuilder.create().texOffs(20, 28).addBox(-0.474F, 1.7572F, 9.0725F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 34)
/* 134 */         .addBox(-0.474F, -0.2428F, 3.0725F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), 
/* 135 */         PartPose.offset(0.1225F, -1.7768F, 0.0066F));
/* 136 */     PartDefinition cube_r9 = Stock.addOrReplaceChild("cube_r9", 
/* 137 */         CubeListBuilder.create().texOffs(30, 0).addBox(-0.4806F, -3.6572F, 0.328F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), 
/* 138 */         PartPose.offsetAndRotation(0.0066F, 3.8698F, 8.6116F, 1.0472F, 0.0F, 0.0F));
/* 139 */     PartDefinition Handguard = M16.addOrReplaceChild("Handguard", 
/* 140 */         CubeListBuilder.create().texOffs(16, 0).addBox(-1.1184F, -0.3482F, -14.6225F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), 
/* 141 */         PartPose.offset(0.2725F, -1.7768F, 0.0066F));
/* 142 */     PartDefinition Barrel = M16.addOrReplaceChild("Barrel", 
/* 143 */         CubeListBuilder.create().texOffs(0, 0).addBox(-0.25F, 0.625F, -4.375F, 1.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(0, 15)
/* 144 */         .addBox(-0.25F, -1.375F, -0.375F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 145 */         PartPose.offset(-0.0959F, -2.125F, -15.2409F));
/* 146 */     PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", 
/* 147 */         CubeListBuilder.create().texOffs(0, 52).addBox(-1.0F, -1.8F, -2.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(62, 61)
/* 148 */         .addBox(-2.5924F, -2.0237F, -1.7847F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(28, 40)
/* 149 */         .addBox(-1.0F, 5.2F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(34, 32)
/* 150 */         .addBox(0.0F, 11.2F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 12)
/* 151 */         .addBox(2.0F, 11.2F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 0)
/* 152 */         .addBox(2.0F, 11.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 32).addBox(2.0F, 11.2F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*     */         
/* 154 */         PartPose.offsetAndRotation(5.0F, 1.0F, 0.125F, -1.2192F, 0.8352F, 0.4887F));
/* 155 */     PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", 
/* 156 */         CubeListBuilder.create().texOffs(50, 59).addBox(-2.0F, -0.8F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 44)
/* 157 */         .addBox(-2.375F, 10.0F, -2.9102F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(22, 0)
/* 158 */         .addBox(0.625F, 11.0F, -3.9102F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 28)
/* 159 */         .addBox(-2.375F, 11.0F, -3.9102F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 160 */         PartPose.offset(-2.0F, 11.0F, 0.0F));
/* 161 */     PartDefinition cube_r10 = LeftLeg.addOrReplaceChild("cube_r10", 
/* 162 */         CubeListBuilder.create().texOffs(57, 32).addBox(-2.0F, 4.3F, 3.0F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 163 */         PartPose.offsetAndRotation(-0.25F, 1.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 164 */     PartDefinition cube_r11 = LeftLeg.addOrReplaceChild("cube_r11", 
/* 165 */         CubeListBuilder.create().texOffs(0, 0).addBox(-3.5625F, -3.5F, -2.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 166 */         PartPose.offsetAndRotation(1.8125F, 6.0735F, -0.1237F, 0.7418F, 0.0F, 0.0F));
/* 167 */     PartDefinition cube_r12 = LeftLeg.addOrReplaceChild("cube_r12", 
/* 168 */         CubeListBuilder.create().texOffs(14, 48).addBox(-2.0F, -0.6F, -2.2F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 169 */         PartPose.offsetAndRotation(-0.125F, 1.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 170 */     PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", 
/* 171 */         CubeListBuilder.create().texOffs(55, 14).addBox(-2.0F, -0.8F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(44, 40)
/* 172 */         .addBox(-1.625F, 10.0F, -2.9102F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(46, 7)
/* 173 */         .addBox(1.375F, 11.0F, -3.9102F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(45, 42)
/* 174 */         .addBox(-1.625F, 11.0F, -3.9102F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 175 */         PartPose.offset(2.0F, 11.0F, 0.0F));
/* 176 */     PartDefinition cube_r13 = RightLeg.addOrReplaceChild("cube_r13", 
/* 177 */         CubeListBuilder.create().texOffs(36, 58).addBox(-2.0F, 4.3F, 3.0F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 178 */         PartPose.offsetAndRotation(0.25F, 1.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 179 */     PartDefinition cube_r14 = RightLeg.addOrReplaceChild("cube_r14", 
/* 180 */         CubeListBuilder.create().texOffs(50, 3).addBox(0.5625F, -3.5F, -2.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 181 */         PartPose.offsetAndRotation(-1.9375F, 6.0735F, -0.1237F, 0.7418F, 0.0F, 0.0F));
/* 182 */     PartDefinition cube_r15 = RightLeg.addOrReplaceChild("cube_r15", 
/* 183 */         CubeListBuilder.create().texOffs(40, 48).addBox(-2.0F, -0.6F, -2.2F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 184 */         PartPose.offsetAndRotation(0.125F, 1.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 185 */     return LayerDefinition.create(meshdefinition, 80, 80);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 191 */     this.Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 192 */     this.Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 193 */     this.Tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 194 */     this.LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 195 */     this.RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 196 */     this.LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 197 */     this.RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */   
/*     */   public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
/* 201 */     this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + 3.1415927F) * limbSwingAmount;
/* 202 */     this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
/* 203 */     this.Head.yRot = netHeadYaw / 57.295776F;
/* 204 */     this.Head.xRot = headPitch / 57.295776F;
/* 205 */     this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
/* 206 */     this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\client\model\ModelMilitary_Drone_Hertx.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */