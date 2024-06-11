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
/*     */ public class ModelTSC_Hunter_model<T extends Entity>
/*     */   extends EntityModel<T>
/*     */ {
/*  25 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("latex", "model_tsc_hunter_model"), "main");
/*     */   public final ModelPart Head;
/*     */   public final ModelPart Body;
/*     */   public final ModelPart LeftArm;
/*     */   public final ModelPart RightArm;
/*     */   public final ModelPart LeftLeg;
/*     */   public final ModelPart RightLeg;
/*     */   
/*     */   public ModelTSC_Hunter_model(ModelPart root) {
/*  34 */     this.Head = root.getChild("Head");
/*  35 */     this.Body = root.getChild("Body");
/*  36 */     this.LeftArm = root.getChild("LeftArm");
/*  37 */     this.RightArm = root.getChild("RightArm");
/*  38 */     this.LeftLeg = root.getChild("LeftLeg");
/*  39 */     this.RightLeg = root.getChild("RightLeg");
/*     */   }
/*     */   
/*     */   public static LayerDefinition createBodyLayer() {
/*  43 */     MeshDefinition meshdefinition = new MeshDefinition();
/*  44 */     PartDefinition partdefinition = meshdefinition.getRoot();
/*  45 */     PartDefinition Head = partdefinition.addOrReplaceChild("Head", 
/*  46 */         CubeListBuilder.create().texOffs(0, 16).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), 
/*  47 */         PartPose.offset(0.0F, -13.0F, 0.0F));
/*  48 */     PartDefinition Muzzle = Head.addOrReplaceChild("Muzzle", 
/*  49 */         CubeListBuilder.create().texOffs(76, 32).addBox(-3.9F, -3.2384F, -6.9248F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), 
/*  50 */         PartPose.offsetAndRotation(1.4F, -1.0F, 1.0F, 0.3054F, 0.0F, 0.0F));
/*  51 */     PartDefinition Hair = Head.addOrReplaceChild("Hair", 
/*  52 */         CubeListBuilder.create().texOffs(87, 63).addBox(-7.0F, -4.0F, -5.25F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(61, 39)
/*  53 */         .addBox(-7.0F, 1.0F, -5.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 10)
/*  54 */         .addBox(-7.0F, 1.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
/*  55 */         .addBox(-7.0F, -4.0F, -4.25F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(24, 22)
/*  56 */         .addBox(-7.0F, -5.0F, -5.25F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(17, 46)
/*  57 */         .addBox(-6.0F, -7.0F, -5.25F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(49, 2)
/*  58 */         .addBox(-3.0F, -4.0F, -5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 83)
/*  59 */         .addBox(-7.0F, -7.0F, -4.25F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(47, 3)
/*  60 */         .addBox(-6.0F, -8.0F, -4.25F, 6.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(19, 61)
/*  61 */         .addBox(-1.0F, -7.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 49)
/*  62 */         .addBox(-2.0F, -5.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  63 */         PartPose.offset(2.0F, -1.0F, 0.25F));
/*  64 */     PartDefinition Ears = Head.addOrReplaceChild("Ears", 
/*  65 */         CubeListBuilder.create().texOffs(82, 72).addBox(2.6F, -7.8978F, 0.7765F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(14, 82)
/*  66 */         .addBox(-5.4F, -7.8978F, 0.7765F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(10, 73)
/*  67 */         .addBox(2.6F, -8.8978F, 0.7765F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 72)
/*  68 */         .addBox(-5.4F, -8.8978F, 0.7765F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(66, 0)
/*  69 */         .addBox(2.6F, -9.8978F, 0.7765F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(59, 23).addBox(-5.4F, -9.8978F, 0.7765F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), 
/*     */         
/*  71 */         PartPose.offsetAndRotation(0.9F, 3.0F, 2.0F, 0.2618F, 0.0F, 0.0F));
/*  72 */     PartDefinition Body = partdefinition.addOrReplaceChild("Body", 
/*  73 */         CubeListBuilder.create().texOffs(30, 12).addBox(-5.5F, 1.0F, -2.0F, 11.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(61, 56)
/*  74 */         .addBox(-0.5F, 2.0F, 2.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 16)
/*  75 */         .addBox(-0.5F, 3.0F, 3.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 0)
/*  76 */         .addBox(-0.5F, 4.0F, 4.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 46)
/*  77 */         .addBox(-0.5F, 6.0F, 5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 61)
/*  78 */         .addBox(-0.5F, 8.0F, 6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 32)
/*  79 */         .addBox(-2.5F, 0.0F, -2.0F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 33)
/*  80 */         .addBox(-5.0F, 12.0F, -2.0F, 10.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 37)
/*  81 */         .addBox(-5.5F, 14.0F, -2.0F, 11.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(70, 21)
/*  82 */         .addBox(-8.25F, 0.75F, -2.5F, 4.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(48, 69)
/*  83 */         .addBox(4.25F, 0.75F, -2.5F, 4.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(22, 50)
/*  84 */         .addBox(-4.5F, 7.0F, -1.5F, 9.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), 
/*  85 */         PartPose.offset(0.0F, -13.0F, 0.0F));
/*  86 */     PartDefinition breast = Body.addOrReplaceChild("breast", 
/*  87 */         CubeListBuilder.create().texOffs(24, 0).addBox(-5.0F, -0.7716F, -2.8519F, 10.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), 
/*  88 */         PartPose.offsetAndRotation(0.0F, 3.0F, -3.0F, 0.3927F, 0.0F, 0.0F));
/*  89 */     PartDefinition tail = Body.addOrReplaceChild("tail", 
/*  90 */         CubeListBuilder.create().texOffs(0, 0).addBox(-3.5F, 9.3478F, -0.3686F, 7.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(24, 24)
/*  91 */         .addBox(-3.0F, 9.9147F, 9.3814F, 6.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(79, 8)
/*  92 */         .addBox(3.5F, 11.3478F, 2.6314F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(68, 85)
/*  93 */         .addBox(4.5F, 11.3478F, 3.6314F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(83, 16)
/*  94 */         .addBox(-5.5F, 11.3478F, 3.6314F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(14, 32)
/*  95 */         .addBox(5.5F, 11.3478F, 5.6314F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 20)
/*  96 */         .addBox(-6.5F, 11.3478F, 5.6314F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(44, 25)
/*  97 */         .addBox(6.5F, 11.3478F, 6.6314F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 22)
/*  98 */         .addBox(-7.5F, 11.3478F, 6.6314F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(56, 58)
/*  99 */         .addBox(7.5F, 11.3478F, 8.6314F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 56)
/* 100 */         .addBox(-8.5F, 11.3478F, 8.6314F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(78, 64)
/* 101 */         .addBox(-4.5F, 11.3478F, 2.6314F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(87, 33)
/* 102 */         .addBox(-0.5F, 8.3478F, 4.6314F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(26, 37)
/* 103 */         .addBox(-0.5F, 7.3478F, 5.6314F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 59)
/* 104 */         .addBox(-0.5F, 5.3478F, 8.6314F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(15, 61).addBox(-0.5F, 6.3478F, 6.6314F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), 
/*     */         
/* 106 */         PartPose.offsetAndRotation(0.0F, 3.0F, 6.0F, -0.5236F, 0.0F, 0.0F));
/* 107 */     PartDefinition bone = tail.addOrReplaceChild("bone", 
/* 108 */         CubeListBuilder.create().texOffs(52, 39).addBox(-1.0F, 4.1205F, 16.1991F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(77, 0)
/* 109 */         .addBox(-2.0F, 4.1205F, 12.1991F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 110 */         PartPose.offsetAndRotation(-0.5F, 9.884F, 2.933F, 0.2618F, 0.0F, 0.0F));
/* 111 */     PartDefinition bone6 = bone.addOrReplaceChild("bone6", 
/* 112 */         CubeListBuilder.create().texOffs(60, 81).addBox(0.0F, -26.6952F, -2.3316F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 113 */         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.9635F, 0.0F, 0.0F));
/* 114 */     PartDefinition bone7 = bone.addOrReplaceChild("bone7", 
/* 115 */         CubeListBuilder.create().texOffs(20, 60).addBox(0.0F, -23.3693F, 14.3681F, 1.0F, 15.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 116 */         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
/* 117 */     PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", 
/* 118 */         CubeListBuilder.create().texOffs(66, 71).addBox(-3.071F, -2.2617F, -2.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(15, 59)
/* 119 */         .addBox(-3.571F, 14.7383F, 1.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 1)
/* 120 */         .addBox(-3.571F, 14.7383F, 0.15F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(49, 0)
/* 121 */         .addBox(-3.571F, 14.7383F, -1.15F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(43, 50)
/* 122 */         .addBox(-3.571F, 14.7383F, -2.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 59)
/* 123 */         .addBox(-3.571F, 6.7383F, -2.5F, 5.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(56, 11)
/* 124 */         .addBox(0.429F, 14.7383F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(82, 55).addBox(-3.571F, 3.7383F, -2.5F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), 
/*     */         
/* 126 */         PartPose.offsetAndRotation(-6.0F, -9.0F, 0.0F, 0.0F, 0.0F, 0.1309F));
/* 127 */     PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", 
/* 128 */         CubeListBuilder.create().texOffs(32, 69).addBox(-0.929F, -2.2617F, -2.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(17, 49)
/* 129 */         .addBox(0.571F, 14.7383F, 1.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(47, 39)
/* 130 */         .addBox(0.571F, 14.7383F, 0.15F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 22)
/* 131 */         .addBox(0.571F, 14.7383F, -1.15F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 10)
/* 132 */         .addBox(0.571F, 14.7383F, -2.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(41, 56)
/* 133 */         .addBox(-1.429F, 6.7383F, -2.5F, 5.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
/* 134 */         .addBox(-1.429F, 14.7383F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(23, 80).addBox(1.571F, 3.7383F, -2.5F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), 
/*     */         
/* 136 */         PartPose.offsetAndRotation(6.0F, -9.0F, 0.0F, 0.0F, 0.0F, -0.1309F));
/* 137 */     PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", 
/* 138 */         CubeListBuilder.create().texOffs(81, 43).addBox(-3.0F, -3.5F, -2.5F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(65, 51)
/* 139 */         .addBox(-3.0F, -1.5F, -2.5F, 6.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(31, 37)
/* 140 */         .addBox(-3.0F, 16.0F, -5.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 37)
/* 141 */         .addBox(2.0F, 16.0F, -5.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 32)
/* 142 */         .addBox(-0.5F, 16.0F, -5.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(81, 39)
/* 143 */         .addBox(-3.0F, 15.0F, -4.5F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(46, 46)
/* 144 */         .addBox(-3.0F, 14.0F, -3.5F, 6.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), 
/* 145 */         PartPose.offset(-3.0F, 6.0F, 0.0F));
/* 146 */     PartDefinition bone3 = LeftLeg.addOrReplaceChild("bone3", 
/* 147 */         CubeListBuilder.create().texOffs(0, 46).addBox(-4.0F, -0.7654F, -3.1522F, 6.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 148 */         PartPose.offsetAndRotation(1.0F, 2.5F, 0.5F, -0.3927F, 0.0F, 0.0F));
/* 149 */     PartDefinition bone4 = bone3.addOrReplaceChild("bone4", 
/* 150 */         CubeListBuilder.create().texOffs(61, 61).addBox(-4.0F, 0.4335F, -8.6488F, 6.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 151 */         PartPose.offsetAndRotation(0.0F, -1.4142F, 1.4142F, 1.5708F, 0.0F, 0.0F));
/* 152 */     PartDefinition bone5 = bone4.addOrReplaceChild("bone5", 
/* 153 */         CubeListBuilder.create().texOffs(78, 80).addBox(-3.0F, 8.0F, -1.8284F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 154 */         PartPose.offsetAndRotation(0.0F, 3.262F, -0.6488F, -1.5708F, 0.0F, 0.0F));
/* 155 */     PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", 
/* 156 */         CubeListBuilder.create().texOffs(0, 81).addBox(1.0F, -3.5F, -2.5F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(64, 39)
/* 157 */         .addBox(-3.0F, -1.5F, -2.5F, 6.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 32)
/* 158 */         .addBox(2.0F, 16.0F, -5.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 0)
/* 159 */         .addBox(-3.0F, 16.0F, -5.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
/* 160 */         .addBox(-0.5F, 16.0F, -5.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(27, 60)
/* 161 */         .addBox(-3.0F, 15.0F, -4.5F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 22)
/* 162 */         .addBox(-3.0F, 14.0F, -3.5F, 6.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), 
/* 163 */         PartPose.offset(3.0F, 6.0F, 0.0F));
/* 164 */     PartDefinition bone2 = RightLeg.addOrReplaceChild("bone2", 
/* 165 */         CubeListBuilder.create().texOffs(30, 37).addBox(-2.0F, -0.7654F, -3.1522F, 6.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 166 */         PartPose.offsetAndRotation(-1.0F, 2.5F, 0.5F, -0.3927F, 0.0F, 0.0F));
/* 167 */     PartDefinition bone8 = bone2.addOrReplaceChild("bone8", 
/* 168 */         CubeListBuilder.create().texOffs(60, 11).addBox(-2.0F, 0.4335F, -8.6488F, 6.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 169 */         PartPose.offsetAndRotation(0.0F, -1.4142F, 1.4142F, 1.5708F, 0.0F, 0.0F));
/* 170 */     PartDefinition bone9 = bone8.addOrReplaceChild("bone9", 
/* 171 */         CubeListBuilder.create().texOffs(44, 80).addBox(-1.0F, 8.0F, -1.8284F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 172 */         PartPose.offsetAndRotation(0.0F, 3.262F, -0.6488F, -1.5708F, 0.0F, 0.0F));
/* 173 */     return LayerDefinition.create(meshdefinition, 128, 128);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 179 */     this.Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 180 */     this.Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 181 */     this.LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 182 */     this.RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 183 */     this.LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 184 */     this.RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */   
/*     */   public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
/* 188 */     this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + 3.1415927F) * limbSwingAmount;
/* 189 */     this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
/* 190 */     this.Head.yRot = netHeadYaw / 57.295776F;
/* 191 */     this.Head.xRot = headPitch / 57.295776F;
/* 192 */     this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
/* 193 */     this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\client\model\ModelTSC_Hunter_model.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */