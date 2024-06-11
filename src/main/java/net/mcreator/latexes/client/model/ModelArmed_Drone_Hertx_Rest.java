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
/*     */ public class ModelArmed_Drone_Hertx_Rest<T extends Entity>
/*     */   extends EntityModel<T>
/*     */ {
/*  24 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("latex", "model_armed_drone_hertx_rest"), "main");
/*     */   
/*     */   public final ModelPart Head;
/*     */   public final ModelPart Body;
/*     */   public final ModelPart Tail;
/*     */   public final ModelPart LeftArm;
/*     */   public final ModelPart RightArm;
/*     */   public final ModelPart LeftLeg;
/*     */   public final ModelPart RightLeg;
/*     */   public final ModelPart bb_main;
/*     */   
/*     */   public ModelArmed_Drone_Hertx_Rest(ModelPart root) {
/*  36 */     this.Head = root.getChild("Head");
/*  37 */     this.Body = root.getChild("Body");
/*  38 */     this.Tail = root.getChild("Tail");
/*  39 */     this.LeftArm = root.getChild("LeftArm");
/*  40 */     this.RightArm = root.getChild("RightArm");
/*  41 */     this.LeftLeg = root.getChild("LeftLeg");
/*  42 */     this.RightLeg = root.getChild("RightLeg");
/*  43 */     this.bb_main = root.getChild("bb_main");
/*     */   }
/*     */   
/*     */   public static LayerDefinition createBodyLayer() {
/*  47 */     MeshDefinition meshdefinition = new MeshDefinition();
/*  48 */     PartDefinition partdefinition = meshdefinition.getRoot();
/*  49 */     PartDefinition Head = partdefinition.addOrReplaceChild("Head", 
/*  50 */         CubeListBuilder.create().texOffs(30, 25).addBox(-3.0F, -1.3F, -4.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(51, 53)
/*  51 */         .addBox(-2.0F, -2.4F, -3.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(16, 42)
/*  52 */         .addBox(-2.0F, -6.4F, 2.0F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(33, 7)
/*  53 */         .addBox(-1.5F, -6.775F, -3.75F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(30, 7)
/*  54 */         .addBox(-2.0F, -2.4F, 3.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 11)
/*  55 */         .addBox(-3.0F, -2.4F, 2.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 36)
/*  56 */         .addBox(-3.0F, -0.275F, -2.275F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(26, 12)
/*  57 */         .addBox(-1.0F, -0.15F, -2.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 44)
/*  58 */         .addBox(2.0F, -6.4F, 2.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 34)
/*  59 */         .addBox(-3.0F, -6.4F, 2.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 0)
/*  60 */         .addBox(-3.0F, -6.3F, -4.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(8, 58)
/*  61 */         .addBox(2.0F, -5.3F, -4.0F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 63)
/*  62 */         .addBox(2.0F, -2.3F, -4.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(56, 42)
/*  63 */         .addBox(-3.0F, -5.3F, -4.0F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(63, 53)
/*  64 */         .addBox(-3.0F, -2.3F, -4.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(16, 6)
/*  65 */         .addBox(-2.0F, -5.3F, -4.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 12)
/*  66 */         .addBox(-2.0F, -2.3F, -4.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 40)
/*  67 */         .addBox(-1.0F, -2.8F, -4.875F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  68 */         PartPose.offset(0.0F, -2.0F, -0.2F));
/*  69 */     PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1", 
/*  70 */         CubeListBuilder.create().texOffs(35, 15).addBox(-1.0F, -4.3F, -6.7F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), 
/*  71 */         PartPose.offsetAndRotation(0.0F, 1.75F, 1.825F, 0.0F, 0.48F, 0.0F));
/*  72 */     PartDefinition Antenna = Head.addOrReplaceChild("Antenna", CubeListBuilder.create(), PartPose.offset(0.0F, -6.1528F, 3.0874F));
/*  73 */     PartDefinition cube_r2 = Antenna.addOrReplaceChild("cube_r2", 
/*  74 */         CubeListBuilder.create().texOffs(60, 0).addBox(0.0F, -2.75F, -1.25F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(22, 59)
/*  75 */         .addBox(-6.5F, -2.75F, -1.25F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(16, 0)
/*  76 */         .addBox(-6.5F, -3.75F, -5.25F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 58).addBox(0.0F, -3.75F, -5.25F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), 
/*     */         
/*  78 */         PartPose.offsetAndRotation(2.75F, 0.3511F, 2.7389F, 1.3526F, 0.0F, 0.0F));
/*  79 */     PartDefinition Body = partdefinition.addOrReplaceChild("Body", 
/*  80 */         CubeListBuilder.create().texOffs(15, 15).addBox(-4.0F, 0.2F, -2.0F, 8.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 28)
/*  81 */         .addBox(-4.0F, 10.2F, -2.0F, 8.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(35, 32)
/*  82 */         .addBox(-3.625F, 6.2F, -2.0F, 7.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  83 */         PartPose.offset(0.0F, -2.0F, 0.0F));
/*  84 */     PartDefinition Tail = partdefinition.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offset(0.0F, 10.0F, 0.0F));
/*  85 */     PartDefinition cube_r3 = Tail.addOrReplaceChild("cube_r3", 
/*  86 */         CubeListBuilder.create().texOffs(0, 21).addBox(-1.25F, 10.3026F, 24.6391F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
/*  87 */         .addBox(-0.25F, 10.8026F, 25.6391F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(10, 1)
/*  88 */         .addBox(1.75F, 10.8026F, 25.6391F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 0)
/*  89 */         .addBox(-0.25F, 12.8026F, 25.6391F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 1)
/*  90 */         .addBox(1.75F, 12.8026F, 25.6391F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(17, 25)
/*  91 */         .addBox(-0.25F, 11.3026F, 15.6391F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), 
/*  92 */         PartPose.offsetAndRotation(-0.75F, -10.3628F, -1.0141F, -0.3927F, 0.0F, 0.0F));
/*  93 */     PartDefinition cube_r4 = Tail.addOrReplaceChild("cube_r4", 
/*  94 */         CubeListBuilder.create().texOffs(0, 15).addBox(-0.25F, 4.2F, 7.0F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), 
/*  95 */         PartPose.offsetAndRotation(-0.75F, -9.2F, 0.0F, -0.7854F, 0.0F, 0.0F));
/*  96 */     PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", 
/*  97 */         CubeListBuilder.create().texOffs(54, 21).addBox(-2.0F, -1.8F, -2.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(64, 7)
/*  98 */         .addBox(-0.375F, -2.925F, -1.875F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(39, 15)
/*  99 */         .addBox(-3.0F, 5.2F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(46, 10)
/* 100 */         .addBox(-3.0F, 11.2F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 42)
/* 101 */         .addBox(-3.0F, 11.2F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 12)
/* 102 */         .addBox(-1.0F, 11.2F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 39)
/* 103 */         .addBox(-3.0F, 11.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 104 */         PartPose.offsetAndRotation(-5.0F, 1.0F, 0.125F, -0.9667F, -0.7684F, -0.1824F));
/* 105 */     PartDefinition M16 = LeftArm.addOrReplaceChild("M16", CubeListBuilder.create(), 
/* 106 */         PartPose.offsetAndRotation(-0.4987F, 9.9293F, -2.0497F, 1.5708F, 0.0F, 0.0873F));
/* 107 */     PartDefinition Grip = M16.addOrReplaceChild("Grip", 
/* 108 */         CubeListBuilder.create().texOffs(32, 50).addBox(-0.5209F, -0.0875F, 1.2465F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), 
/* 109 */         PartPose.offset(0.0F, 0.0F, 0.0F));
/* 110 */     PartDefinition cube_r5 = Grip.addOrReplaceChild("cube_r5", 
/* 111 */         CubeListBuilder.create().texOffs(0, 0).addBox(-0.5934F, 2.0486F, 1.6886F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 112 */         PartPose.offsetAndRotation(0.1225F, -0.4268F, -0.7684F, 0.3927F, 0.0F, 0.0F));
/* 113 */     PartDefinition cube_r6 = Grip.addOrReplaceChild("cube_r6", 
/* 114 */         CubeListBuilder.create().texOffs(48, 25).addBox(-0.4934F, 2.0486F, 0.5386F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), 
/* 115 */         PartPose.offsetAndRotation(0.1225F, -0.7768F, 0.1316F, 0.3927F, 0.0F, 0.0F));
/* 116 */     PartDefinition Mag = M16.addOrReplaceChild("Mag", 
/* 117 */         CubeListBuilder.create().texOffs(30, 25).addBox(-0.4934F, 1.9643F, -3.2225F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), 
/* 118 */         PartPose.offset(0.1225F, -1.7768F, 0.0066F));
/* 119 */     PartDefinition cube_r7 = Mag.addOrReplaceChild("cube_r7", 
/* 120 */         CubeListBuilder.create().texOffs(48, 0).addBox(-0.4934F, 4.6897F, -0.8395F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), 
/* 121 */         PartPose.offsetAndRotation(0.0F, 0.1875F, -0.5F, -0.3927F, 0.0F, 0.0F));
/* 122 */     PartDefinition Receiver = M16.addOrReplaceChild("Receiver", 
/* 123 */         CubeListBuilder.create().texOffs(10, 0).addBox(-0.7434F, -0.2232F, -4.6225F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
/* 124 */         .texOffs(0, 15).addBox(-0.7434F, -0.2232F, -0.6225F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 34)
/* 125 */         .addBox(-0.7434F, -0.2232F, -3.6225F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(15, 15)
/* 126 */         .addBox(-0.4309F, -0.9732F, -3.6225F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(23, 51)
/* 127 */         .addBox(-0.4309F, -1.9732F, -3.6225F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(6, 15).addBox(-0.4309F, -0.9732F, 2.3775F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), 
/*     */         
/* 129 */         PartPose.offset(0.1225F, -1.7768F, 0.0066F));
/* 130 */     PartDefinition Stock = M16.addOrReplaceChild("Stock", 
/* 131 */         CubeListBuilder.create().texOffs(20, 28).addBox(-0.474F, 1.7572F, 9.0725F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 34)
/* 132 */         .addBox(-0.474F, -0.2428F, 3.0725F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), 
/* 133 */         PartPose.offset(0.1225F, -1.7768F, 0.0066F));
/* 134 */     PartDefinition cube_r8 = Stock.addOrReplaceChild("cube_r8", 
/* 135 */         CubeListBuilder.create().texOffs(30, 0).addBox(-0.4806F, -3.6572F, 0.328F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), 
/* 136 */         PartPose.offsetAndRotation(0.0066F, 3.8698F, 8.6116F, 1.0472F, 0.0F, 0.0F));
/* 137 */     PartDefinition Handguard = M16.addOrReplaceChild("Handguard", 
/* 138 */         CubeListBuilder.create().texOffs(16, 0).addBox(-1.1184F, -0.3482F, -14.6225F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), 
/* 139 */         PartPose.offset(0.2725F, -1.7768F, 0.0066F));
/* 140 */     PartDefinition Barrel = M16.addOrReplaceChild("Barrel", 
/* 141 */         CubeListBuilder.create().texOffs(0, 0).addBox(-0.25F, 0.625F, -4.375F, 1.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(0, 15)
/* 142 */         .addBox(-0.25F, -1.375F, -0.375F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 143 */         PartPose.offset(-0.0959F, -2.125F, -15.2409F));
/* 144 */     PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", 
/* 145 */         CubeListBuilder.create().texOffs(0, 52).addBox(-1.0F, -1.8F, -2.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(62, 61)
/* 146 */         .addBox(-2.5924F, -2.0237F, -1.7847F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(28, 40)
/* 147 */         .addBox(-1.0F, 5.2F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(34, 32)
/* 148 */         .addBox(0.0F, 11.2F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 12)
/* 149 */         .addBox(2.0F, 11.2F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 0)
/* 150 */         .addBox(2.0F, 11.2F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 32).addBox(2.0F, 11.2F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*     */         
/* 152 */         PartPose.offsetAndRotation(5.0F, 1.0F, 0.125F, -1.3796F, -0.4282F, 1.1014F));
/* 153 */     PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", 
/* 154 */         CubeListBuilder.create().texOffs(50, 59).addBox(-2.0F, -0.8F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 44)
/* 155 */         .addBox(-2.375F, 10.0F, -2.9102F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(22, 0)
/* 156 */         .addBox(0.625F, 11.0F, -3.9102F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 28)
/* 157 */         .addBox(-2.375F, 11.0F, -3.9102F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 158 */         PartPose.offset(-2.0F, 11.0F, 0.0F));
/* 159 */     PartDefinition cube_r9 = LeftLeg.addOrReplaceChild("cube_r9", 
/* 160 */         CubeListBuilder.create().texOffs(57, 32).addBox(-2.0F, 4.3F, 3.0F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 161 */         PartPose.offsetAndRotation(-0.25F, 1.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 162 */     PartDefinition cube_r10 = LeftLeg.addOrReplaceChild("cube_r10", 
/* 163 */         CubeListBuilder.create().texOffs(0, 0).addBox(-3.5625F, -3.5F, -2.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 164 */         PartPose.offsetAndRotation(1.8125F, 6.0735F, -0.1237F, 0.7418F, 0.0F, 0.0F));
/* 165 */     PartDefinition cube_r11 = LeftLeg.addOrReplaceChild("cube_r11", 
/* 166 */         CubeListBuilder.create().texOffs(14, 48).addBox(-2.0F, -0.6F, -2.2F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 167 */         PartPose.offsetAndRotation(-0.125F, 1.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 168 */     PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", 
/* 169 */         CubeListBuilder.create().texOffs(55, 14).addBox(-2.0F, -0.8F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(44, 40)
/* 170 */         .addBox(-1.625F, 10.0F, -2.9102F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(46, 7)
/* 171 */         .addBox(1.375F, 11.0F, -3.9102F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(45, 42)
/* 172 */         .addBox(-1.625F, 11.0F, -3.9102F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 173 */         PartPose.offset(2.0F, 11.0F, 0.0F));
/* 174 */     PartDefinition cube_r12 = RightLeg.addOrReplaceChild("cube_r12", 
/* 175 */         CubeListBuilder.create().texOffs(36, 58).addBox(-2.0F, 4.3F, 3.0F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 176 */         PartPose.offsetAndRotation(0.25F, 1.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 177 */     PartDefinition cube_r13 = RightLeg.addOrReplaceChild("cube_r13", 
/* 178 */         CubeListBuilder.create().texOffs(50, 3).addBox(0.5625F, -3.5F, -2.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 179 */         PartPose.offsetAndRotation(-1.9375F, 6.0735F, -0.1237F, 0.7418F, 0.0F, 0.0F));
/* 180 */     PartDefinition cube_r14 = RightLeg.addOrReplaceChild("cube_r14", 
/* 181 */         CubeListBuilder.create().texOffs(40, 48).addBox(-2.0F, -0.6F, -2.2F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 182 */         PartPose.offsetAndRotation(0.125F, 1.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 183 */     PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
/* 184 */     PartDefinition cube_r15 = bb_main.addOrReplaceChild("cube_r15", 
/* 185 */         CubeListBuilder.create().texOffs(27, 36).addBox(-1.0F, -4.3F, -6.7F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), 
/* 186 */         PartPose.offsetAndRotation(0.0F, -24.25F, 1.625F, 0.0F, -0.48F, 0.0F));
/* 187 */     return LayerDefinition.create(meshdefinition, 80, 80);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 193 */     this.Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 194 */     this.Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 195 */     this.Tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 196 */     this.LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 197 */     this.RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 198 */     this.LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 199 */     this.RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 200 */     this.bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */   
/*     */   public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
/* 204 */     this.Head.yRot = netHeadYaw / 57.295776F;
/* 205 */     this.Head.xRot = headPitch / 57.295776F;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\client\model\ModelArmed_Drone_Hertx_Rest.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */