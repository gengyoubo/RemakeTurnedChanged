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
/*     */ public class Modeldl_dragon_model<T extends Entity>
/*     */   extends EntityModel<T>
/*     */ {
/*  25 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("latex", "modeldl_dragon_model"), "main");
/*     */   public final ModelPart Head;
/*     */   public final ModelPart Body;
/*     */   public final ModelPart Tail;
/*     */   public final ModelPart Wings;
/*     */   public final ModelPart LeftArm;
/*     */   public final ModelPart RightArm;
/*     */   public final ModelPart LeftLeg;
/*     */   public final ModelPart RightLeg;
/*     */   
/*     */   public Modeldl_dragon_model(ModelPart root) {
/*  36 */     this.Head = root.getChild("Head");
/*  37 */     this.Body = root.getChild("Body");
/*  38 */     this.Tail = root.getChild("Tail");
/*  39 */     this.Wings = root.getChild("Wings");
/*  40 */     this.LeftArm = root.getChild("LeftArm");
/*  41 */     this.RightArm = root.getChild("RightArm");
/*  42 */     this.LeftLeg = root.getChild("LeftLeg");
/*  43 */     this.RightLeg = root.getChild("RightLeg");
/*     */   }
/*     */   
/*     */   public static LayerDefinition createBodyLayer() {
/*  47 */     MeshDefinition meshdefinition = new MeshDefinition();
/*  48 */     PartDefinition partdefinition = meshdefinition.getRoot();
/*  49 */     PartDefinition Head = partdefinition.addOrReplaceChild("Head", 
/*  50 */         CubeListBuilder.create().texOffs(0, 16).addBox(-5.0F, -10.0F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F))
/*  51 */         .texOffs(30, 20).addBox(-4.0F, -4.0F, -7.0F, 8.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), 
/*  52 */         PartPose.offset(0.0F, -21.0F, 0.0F));
/*  53 */     PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1", 
/*  54 */         CubeListBuilder.create().texOffs(54, 45).addBox(-4.7F, -26.0F, 7.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 45)
/*  55 */         .addBox(3.8F, -26.0F, 7.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 37)
/*  56 */         .addBox(-4.7F, -27.0F, 8.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 37).addBox(3.8F, -27.0F, 8.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), 
/*     */         
/*  58 */         PartPose.offsetAndRotation(0.0F, 13.0F, 0.0F, 0.4363F, 0.0F, 0.0F));
/*  59 */     PartDefinition cube_r2 = Head.addOrReplaceChild("cube_r2", 
/*  60 */         CubeListBuilder.create().texOffs(0, 16).addBox(-5.5F, -19.0F, 15.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(53, 20)
/*  61 */         .addBox(4.5F, -19.0F, 15.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(96, 29)
/*  62 */         .addBox(-5.5F, -19.0F, 7.0F, 1.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(64, 102).addBox(4.5F, -19.0F, 7.0F, 1.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), 
/*     */         
/*  64 */         PartPose.offsetAndRotation(0.0F, 13.0F, 0.0F, 0.48F, 0.0F, 0.0F));
/*  65 */     PartDefinition Mask = Head.addOrReplaceChild("Mask", 
/*  66 */         CubeListBuilder.create().texOffs(20, 36).addBox(-4.0F, -21.25F, -5.25F, 8.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(22, 52)
/*  67 */         .addBox(-3.0F, -22.25F, -5.25F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(38, 0)
/*  68 */         .addBox(-4.0F, -17.35F, -7.25F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(40, 2)
/*  69 */         .addBox(-4.0F, -17.25F, -7.25F, 8.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(6, 14)
/*  70 */         .addBox(4.1F, -17.25F, -7.25F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 14)
/*  71 */         .addBox(-4.1F, -17.25F, -7.25F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 19)
/*  72 */         .addBox(2.0F, -14.25F, -7.25F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 19)
/*  73 */         .addBox(-4.0F, -14.25F, -7.25F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(76, 43)
/*  74 */         .addBox(-1.0F, -19.25F, -5.25F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 36)
/*  75 */         .addBox(-5.0F, -20.25F, -5.25F, 10.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(6, 4)
/*  76 */         .addBox(-5.0F, -19.25F, -5.25F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(2, 25)
/*  77 */         .addBox(-6.0F, -18.25F, -5.25F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 25)
/*  78 */         .addBox(5.0F, -18.25F, -5.25F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(6, 25)
/*  79 */         .addBox(-2.0F, -19.25F, -5.25F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(4, 25)
/*  80 */         .addBox(1.0F, -19.25F, -5.25F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(6, 0)
/*  81 */         .addBox(4.0F, -19.25F, -5.25F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), 
/*  82 */         PartPose.offset(0.0F, 13.0F, 0.0F));
/*  83 */     PartDefinition Body = partdefinition.addOrReplaceChild("Body", 
/*  84 */         CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, 0.0F, -4.0F, 16.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(40, 8)
/*  85 */         .addBox(-7.0F, 8.0F, -4.0F, 14.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 37)
/*  86 */         .addBox(-6.0F, 12.0F, -4.0F, 12.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(32, 32)
/*  87 */         .addBox(-7.0F, 16.0F, -4.0F, 14.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), 
/*  88 */         PartPose.offset(0.0F, -21.0F, 0.0F));
/*  89 */     PartDefinition Bones = Body.addOrReplaceChild("Bones", 
/*  90 */         CubeListBuilder.create().texOffs(22, 49).addBox(-7.9F, -12.1F, -4.5F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 26)
/*  91 */         .addBox(-7.9F, -9.1F, -4.5F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 5)
/*  92 */         .addBox(-7.9F, -6.1F, -4.5F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 3)
/*  93 */         .addBox(-6.9F, -5.1F, -4.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 0)
/*  94 */         .addBox(-6.9F, -3.1F, -4.5F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(59, 20)
/*  95 */         .addBox(1.9F, -3.1F, -4.5F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 30)
/*  96 */         .addBox(1.9F, -5.1F, -4.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(53, 28)
/*  97 */         .addBox(1.9F, -6.1F, -4.5F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 5)
/*  98 */         .addBox(1.9F, -9.1F, -4.5F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 29)
/*  99 */         .addBox(1.9F, -12.1F, -4.5F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 73)
/* 100 */         .addBox(-2.0F, -13.0F, 3.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(84, 102)
/* 101 */         .addBox(-1.0F, -13.0F, 3.5F, 2.0F, 20.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(76, 40)
/* 102 */         .addBox(1.0F, -13.0F, 3.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(69, 23)
/* 103 */         .addBox(1.0F, -10.0F, 3.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 54)
/* 104 */         .addBox(-2.0F, -10.0F, 3.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 49)
/* 105 */         .addBox(1.0F, -7.0F, 3.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(66, 54)
/* 106 */         .addBox(1.0F, -4.0F, 3.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 68)
/* 107 */         .addBox(-3.0F, -4.0F, 3.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 69)
/* 108 */         .addBox(-2.0F, -7.0F, 3.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 53)
/* 109 */         .addBox(-3.0F, -1.0F, 3.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 53)
/* 110 */         .addBox(1.0F, -1.0F, 3.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 65)
/* 111 */         .addBox(-3.0F, 2.0F, 3.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(63, 23)
/* 112 */         .addBox(1.0F, 2.0F, 3.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(88, 15)
/* 113 */         .addBox(2.0F, -13.0F, 4.0F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
/* 114 */         .addBox(-4.0F, -12.0F, 4.0F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 115 */         PartPose.offset(0.0F, 13.0F, 0.0F));
/* 116 */     PartDefinition Tail = partdefinition.addOrReplaceChild("Tail", 
/* 117 */         CubeListBuilder.create().texOffs(84, 102).addBox(-1.0F, -45.0F, 3.5F, 2.0F, 15.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(112, 109)
/* 118 */         .addBox(-2.0F, -45.0F, -0.5F, 4.0F, 15.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 119 */         PartPose.offsetAndRotation(0.0F, 29.0F, 37.0F, 0.9163F, 0.0F, 0.0F));
/* 120 */     PartDefinition cube_r3 = Tail.addOrReplaceChild("cube_r3", 
/* 121 */         CubeListBuilder.create().texOffs(112, 107).addBox(-2.0F, 5.0F, -0.5F, 4.0F, 17.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 122 */         PartPose.offsetAndRotation(0.0F, -34.8107F, -1.9515F, 0.3927F, 0.0F, 0.0F));
/* 123 */     PartDefinition cube_r4 = Tail.addOrReplaceChild("cube_r4", 
/* 124 */         CubeListBuilder.create().texOffs(84, 102).addBox(-1.0F, 10.0F, 3.5F, 2.0F, 15.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 125 */         PartPose.offsetAndRotation(0.0F, -37.8994F, -3.5604F, 0.3927F, 0.0F, 0.0F));
/* 126 */     PartDefinition Wings = partdefinition.addOrReplaceChild("Wings", 
/* 127 */         CubeListBuilder.create().texOffs(0, 69).addBox(-8.0F, -13.0F, 5.5F, 2.0F, 15.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(30, 53)
/* 128 */         .addBox(-4.0F, -12.0F, 5.5F, 1.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(62, 45)
/* 129 */         .addBox(-6.0F, -13.0F, 5.5F, 2.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(14, 72)
/* 130 */         .addBox(-4.0F, -13.0F, 5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 23)
/* 131 */         .addBox(-8.0F, -14.0F, 5.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 18)
/* 132 */         .addBox(-11.0F, -15.0F, 6.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(67, 6)
/* 133 */         .addBox(-13.0F, -16.0F, 6.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 96)
/* 134 */         .addBox(-15.0F, -19.0F, 6.5F, 2.0F, 27.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(62, 26)
/* 135 */         .addBox(-17.0F, -17.0F, 7.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(76, 62)
/* 136 */         .addBox(-18.0F, -18.0F, 7.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 51)
/* 137 */         .addBox(-20.0F, -19.0F, 8.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 49)
/* 138 */         .addBox(-22.0F, -21.0F, 8.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 93)
/* 139 */         .addBox(-23.0F, -18.0F, 8.5F, 1.0F, 30.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 69)
/* 140 */         .addBox(-22.0F, 12.0F, 8.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 3)
/* 141 */         .addBox(-20.0F, 14.0F, 8.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 0)
/* 142 */         .addBox(-18.0F, 16.0F, 8.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 93)
/* 143 */         .addBox(-22.0F, -18.0F, 8.5F, 2.0F, 30.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(42, 96)
/* 144 */         .addBox(-20.0F, -18.0F, 8.5F, 2.0F, 29.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(50, 96)
/* 145 */         .addBox(-18.0F, -17.0F, 7.5F, 1.0F, 26.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 104)
/* 146 */         .addBox(-17.0F, -16.0F, 7.5F, 2.0F, 23.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(76, 60)
/* 147 */         .addBox(-13.0F, 8.0F, 6.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 104)
/* 148 */         .addBox(-13.0F, -15.0F, 6.5F, 2.0F, 21.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(102, 42)
/* 149 */         .addBox(-11.0F, -14.0F, 6.5F, 3.0F, 18.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(72, 45)
/* 150 */         .addBox(3.0F, -12.0F, 5.5F, 1.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(73, 2)
/* 151 */         .addBox(2.0F, -13.0F, 5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 16)
/* 152 */         .addBox(4.0F, -14.0F, 5.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(51, 65)
/* 153 */         .addBox(4.0F, -13.0F, 5.5F, 2.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(4, 69)
/* 154 */         .addBox(6.0F, -13.0F, 5.5F, 2.0F, 15.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(16, 104)
/* 155 */         .addBox(8.0F, -14.0F, 6.5F, 3.0F, 18.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(12, 104)
/* 156 */         .addBox(11.0F, -15.0F, 6.5F, 2.0F, 21.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(32, 37)
/* 157 */         .addBox(8.0F, -15.0F, 6.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(13, 74)
/* 158 */         .addBox(11.0F, -16.0F, 6.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 96)
/* 159 */         .addBox(13.0F, -19.0F, 6.5F, 2.0F, 27.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(69, 77)
/* 160 */         .addBox(11.0F, 8.0F, 6.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 104)
/* 161 */         .addBox(15.0F, -16.0F, 7.5F, 2.0F, 23.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(46, 96)
/* 162 */         .addBox(18.0F, -18.0F, 8.5F, 2.0F, 29.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(82, 102)
/* 163 */         .addBox(17.0F, -17.0F, 7.5F, 1.0F, 26.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(32, 96)
/* 164 */         .addBox(20.0F, -18.0F, 8.5F, 2.0F, 30.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(56, 93)
/* 165 */         .addBox(22.0F, -18.0F, 8.5F, 1.0F, 30.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 72)
/* 166 */         .addBox(20.0F, 12.0F, 8.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 69)
/* 167 */         .addBox(18.0F, 14.0F, 8.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 69)
/* 168 */         .addBox(16.0F, 16.0F, 8.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(50, 20)
/* 169 */         .addBox(20.0F, -21.0F, 8.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(74, 4)
/* 170 */         .addBox(18.0F, -19.0F, 8.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(74, 0)
/* 171 */         .addBox(15.0F, -17.0F, 7.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(65, 77)
/* 172 */         .addBox(17.0F, -18.0F, 7.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 173 */         PartPose.offset(0.0F, -8.0F, 0.0F));
/* 174 */     PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", 
/* 175 */         CubeListBuilder.create().texOffs(0, 90).addBox(-7.0F, -4.0F, -3.0F, 7.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(45, 78)
/* 176 */         .addBox(-7.0F, 12.0F, -3.0F, 7.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(94, 15)
/* 177 */         .addBox(-6.0F, 4.0F, -3.0F, 6.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)), 
/* 178 */         PartPose.offset(-8.0F, -17.0F, 0.0F));
/* 179 */     PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", 
/* 180 */         CubeListBuilder.create().texOffs(76, 0).addBox(0.0F, 12.0F, -3.0F, 7.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(65, 88)
/* 181 */         .addBox(0.0F, -4.0F, -3.0F, 7.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(91, 91)
/* 182 */         .addBox(0.0F, 4.0F, -3.0F, 6.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)), 
/* 183 */         PartPose.offset(8.0F, -17.0F, 0.0F));
/* 184 */     PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", 
/* 185 */         CubeListBuilder.create().texOffs(22, 85).addBox(-3.0F, 0.0F, -4.0F, 7.0F, 3.0F, 8.0F, new CubeDeformation(0.0F))
/* 186 */         .texOffs(75, 75).addBox(-3.0F, 18.0083F, -5.2582F, 7.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), 
/* 187 */         PartPose.offset(-4.0F, 0.0F, 0.0F));
/* 188 */     PartDefinition cube_r5 = LeftLeg.addOrReplaceChild("cube_r5", 
/* 189 */         CubeListBuilder.create().texOffs(23, 65).addBox(-5.0F, -4.0F, -4.0F, 7.0F, 12.0F, 7.0F, new CubeDeformation(0.0F)), 
/* 190 */         PartPose.offsetAndRotation(2.0F, 8.8603F, -2.757F, 1.1781F, 0.0F, 0.0F));
/* 191 */     PartDefinition cube_r6 = LeftLeg.addOrReplaceChild("cube_r6", 
/* 192 */         CubeListBuilder.create().texOffs(76, 40).addBox(-5.0F, -3.0F, -2.0F, 7.0F, 14.0F, 6.0F, new CubeDeformation(0.0F)), 
/* 193 */         PartPose.offsetAndRotation(2.0F, 11.3149F, 3.2558F, -0.3927F, 0.0F, 0.0F));
/* 194 */     PartDefinition cube_r7 = LeftLeg.addOrReplaceChild("cube_r7", 
/* 195 */         CubeListBuilder.create().texOffs(32, 45).addBox(-5.0F, -4.0F, -4.0F, 7.0F, 12.0F, 8.0F, new CubeDeformation(0.0F)), 
/* 196 */         PartPose.offsetAndRotation(2.0F, 5.1648F, -1.2263F, -0.3927F, 0.0F, 0.0F));
/* 197 */     PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", 
/* 198 */         CubeListBuilder.create().texOffs(83, 60).addBox(-4.0F, 0.0F, -4.0F, 7.0F, 3.0F, 8.0F, new CubeDeformation(0.0F))
/* 199 */         .texOffs(0, 76).addBox(-4.0F, 18.0083F, -5.2582F, 7.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), 
/* 200 */         PartPose.offset(4.0F, 0.0F, 0.0F));
/* 201 */     PartDefinition cube_r8 = RightLeg.addOrReplaceChild("cube_r8", 
/* 202 */         CubeListBuilder.create().texOffs(55, 58).addBox(-2.0F, -4.0F, -4.0F, 7.0F, 12.0F, 7.0F, new CubeDeformation(0.0F)), 
/* 203 */         PartPose.offsetAndRotation(-2.0F, 8.8603F, -2.757F, 1.1781F, 0.0F, 0.0F));
/* 204 */     PartDefinition cube_r9 = RightLeg.addOrReplaceChild("cube_r9", 
/* 205 */         CubeListBuilder.create().texOffs(68, 20).addBox(-2.0F, -3.0F, -2.0F, 7.0F, 14.0F, 6.0F, new CubeDeformation(0.0F)), 
/* 206 */         PartPose.offsetAndRotation(-2.0F, 11.3149F, 3.2558F, -0.3927F, 0.0F, 0.0F));
/* 207 */     PartDefinition cube_r10 = RightLeg.addOrReplaceChild("cube_r10", 
/* 208 */         CubeListBuilder.create().texOffs(0, 49).addBox(-2.0F, -4.0F, -4.0F, 7.0F, 12.0F, 8.0F, new CubeDeformation(0.0F)), 
/* 209 */         PartPose.offsetAndRotation(-2.0F, 5.1648F, -1.2263F, -0.3927F, 0.0F, 0.0F));
/* 210 */     return LayerDefinition.create(meshdefinition, 128, 128);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 216 */     this.Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 217 */     this.Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 218 */     this.Tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 219 */     this.Wings.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 220 */     this.LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 221 */     this.RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 222 */     this.LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 223 */     this.RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */   
/*     */   public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
/* 227 */     this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + 3.1415927F) * limbSwingAmount;
/* 228 */     this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
/* 229 */     this.Head.yRot = netHeadYaw / 57.295776F;
/* 230 */     this.Head.xRot = headPitch / 57.295776F;
/* 231 */     this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
/* 232 */     this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\client\model\Modeldl_dragon_model.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */