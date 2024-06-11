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
/*     */ public class ModelDark_Latex_Centaur_Model<T extends Entity>
/*     */   extends EntityModel<T>
/*     */ {
/*  25 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("latex", "model_dark_latex_centaur_model"), "main");
/*     */   
/*     */   public final ModelPart Head;
/*     */   public final ModelPart Body;
/*     */   public final ModelPart Tail;
/*     */   public final ModelPart LeftArm;
/*     */   public final ModelPart RightArm;
/*     */   public final ModelPart RightLeg1;
/*     */   public final ModelPart RightLeg2;
/*     */   public final ModelPart LeftLeg1;
/*     */   public final ModelPart LeftLeg2;
/*     */   
/*     */   public ModelDark_Latex_Centaur_Model(ModelPart root) {
/*  38 */     this.Head = root.getChild("Head");
/*  39 */     this.Body = root.getChild("Body");
/*  40 */     this.Tail = root.getChild("Tail");
/*  41 */     this.LeftArm = root.getChild("LeftArm");
/*  42 */     this.RightArm = root.getChild("RightArm");
/*  43 */     this.RightLeg1 = root.getChild("RightLeg1");
/*  44 */     this.RightLeg2 = root.getChild("RightLeg2");
/*  45 */     this.LeftLeg1 = root.getChild("LeftLeg1");
/*  46 */     this.LeftLeg2 = root.getChild("LeftLeg2");
/*     */   }
/*     */   
/*     */   public static LayerDefinition createBodyLayer() {
/*  50 */     MeshDefinition meshdefinition = new MeshDefinition();
/*  51 */     PartDefinition partdefinition = meshdefinition.getRoot();
/*  52 */     PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offset(0.0F, -5.0F, -7.0F));
/*  53 */     PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1", 
/*  54 */         CubeListBuilder.create().texOffs(36, 39).addBox(-3.0154F, -15.489F, -1.4718F, 6.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
/*  55 */         .texOffs(0, 82).addBox(-2.0154F, -11.489F, -1.4718F, 4.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 0)
/*  56 */         .addBox(-4.0154F, -16.489F, -0.4718F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), 
/*  57 */         PartPose.offsetAndRotation(0.0154F, 8.489F, 3.2218F, -3.1416F, 0.0F, 3.1416F));
/*  58 */     PartDefinition Mask = Head.addOrReplaceChild("Mask", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 13.75F));
/*  59 */     PartDefinition Mask_r1 = Mask.addOrReplaceChild("Mask_r1", 
/*  60 */         CubeListBuilder.create().texOffs(38, 16).addBox(-2.5154F, -11.364F, 7.7782F, 5.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
/*  61 */         .texOffs(0, 18).addBox(-3.5154F, -14.364F, 7.7782F, 7.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 19)
/*  62 */         .addBox(-2.5154F, -15.364F, 7.7782F, 5.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
/*  63 */         .addBox(-1.0154F, -16.364F, 7.7782F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(12, 3)
/*  64 */         .addBox(-1.5154F, -13.364F, 7.7782F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(12, 0)
/*  65 */         .addBox(-0.5154F, -12.364F, 7.7782F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(2, 1)
/*  66 */         .addBox(2.4846F, -13.364F, 7.7782F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
/*  67 */         .addBox(-3.5154F, -13.364F, 7.7782F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(16, 4)
/*  68 */         .addBox(1.4846F, -9.364F, 7.7782F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(16, 1)
/*  69 */         .addBox(-2.5154F, -9.364F, 7.7782F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(16, 0).mirror()
/*  70 */         .addBox(3.2346F, -12.364F, 7.6532F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(16, 0)
/*  71 */         .addBox(-4.2654F, -12.364F, 7.6532F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), 
/*  72 */         PartPose.offsetAndRotation(0.0154F, 8.489F, -10.5282F, -3.1416F, 0.0F, 3.1416F));
/*  73 */     PartDefinition Ears = Head.addOrReplaceChild("Ears", CubeListBuilder.create(), 
/*  74 */         PartPose.offsetAndRotation(0.25F, -6.0F, 6.75F, -1.9635F, 0.0F, 0.0F));
/*  75 */     PartDefinition Ears_r1 = Ears.addOrReplaceChild("Ears_r1", 
/*  76 */         CubeListBuilder.create().texOffs(46, 55).addBox(3.7346F, -5.7148F, -18.7363F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
/*  77 */         .texOffs(38, 0).addBox(3.7346F, -1.7148F, -18.7363F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(12, 0)
/*  78 */         .addBox(3.7346F, 2.2852F, -18.7363F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(14, 16)
/*  79 */         .addBox(-4.7654F, 2.2852F, -18.7363F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(62, 0)
/*  80 */         .addBox(-4.7654F, -1.7148F, -18.7363F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(72, 85)
/*  81 */         .addBox(-4.7654F, -5.7148F, -18.7363F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  82 */         PartPose.offsetAndRotation(-0.2346F, -8.7523F, 12.0574F, -0.7854F, 0.0F, 3.1416F));
/*  83 */     PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offset(0.0F, -5.0F, -7.0F));
/*  84 */     PartDefinition Body_r1 = Body.addOrReplaceChild("Body_r1", 
/*  85 */         CubeListBuilder.create().texOffs(36, 26).addBox(-3.0154F, 0.511F, -13.2218F, 6.0F, 1.0F, 18.0F, new CubeDeformation(0.0F))
/*  86 */         .texOffs(0, 26).addBox(-4.0154F, 1.511F, -14.2218F, 8.0F, 1.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
/*  87 */         .addBox(-4.5154F, 2.511F, -14.2218F, 9.0F, 6.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(58, 16)
/*  88 */         .addBox(-3.5154F, -3.489F, 1.5282F, 7.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 47)
/*  89 */         .addBox(-5.0154F, -8.489F, 1.0282F, 10.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), 
/*  90 */         PartPose.offsetAndRotation(0.0154F, 8.489F, 3.2218F, -3.1416F, 0.0F, 3.1416F));
/*  91 */     PartDefinition Tail = partdefinition.addOrReplaceChild("Tail", CubeListBuilder.create(), 
/*  92 */         PartPose.offsetAndRotation(0.0F, 6.0F, 9.625F, 0.3927F, 0.0F, 0.0F));
/*  93 */     PartDefinition Tail_r1 = Tail.addOrReplaceChild("Tail_r1", 
/*  94 */         CubeListBuilder.create().texOffs(38, 45).addBox(-2.0154F, -1.3296F, -25.276F, 4.0F, 3.0F, 18.0F, new CubeDeformation(0.0F)), 
/*  95 */         PartPose.offsetAndRotation(0.0154F, -4.7702F, -4.9548F, -2.3562F, 0.0F, 3.1416F));
/*  96 */     PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create(), 
/*  97 */         PartPose.offsetAndRotation(5.0F, -2.5F, -7.25F, 0.0F, 0.0F, 0.1745F));
/*  98 */     PartDefinition LeftArm_r1 = LeftArm.addOrReplaceChild("LeftArm_r1", 
/*  99 */         CubeListBuilder.create().texOffs(66, 37).addBox(-9.1108F, 6.8967F, 8.5282F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
/* 100 */         .texOffs(45, 47).addBox(-9.1108F, -8.1033F, 8.5282F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 26)
/* 101 */         .addBox(-9.1108F, -7.1033F, 8.5282F, 4.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 102 */         PartPose.offsetAndRotation(-3.8709F, 6.7636F, 10.4718F, 3.1416F, 0.0F, 2.7926F));
/* 103 */     PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create(), 
/* 104 */         PartPose.offsetAndRotation(-5.0F, -2.5F, -7.25F, 0.0F, 0.0F, -0.1745F));
/* 105 */     PartDefinition RightArm_r1 = RightArm.addOrReplaceChild("RightArm_r1", 
/* 106 */         CubeListBuilder.create().texOffs(64, 57).addBox(6.0805F, 6.8914F, 8.5282F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
/* 107 */         .texOffs(25, 47).addBox(8.0805F, -8.1086F, 8.5282F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
/* 108 */         .addBox(5.0805F, -7.1086F, 8.5282F, 4.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 109 */         PartPose.offsetAndRotation(3.8994F, 6.7688F, 10.4718F, -3.1416F, 0.0F, -2.7926F));
/* 110 */     PartDefinition RightLeg1 = partdefinition.addOrReplaceChild("RightLeg1", CubeListBuilder.create(), PartPose.offset(-2.5F, 9.0F, -7.0F));
/* 111 */     PartDefinition RightLeg1_r1 = RightLeg1.addOrReplaceChild("RightLeg1_r1", 
/* 112 */         CubeListBuilder.create().texOffs(77, 61).addBox(0.2346F, 17.4727F, 2.7854F, 5.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
/* 113 */         .texOffs(82, 85).addBox(0.6096F, 3.386F, 0.0282F, 5.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 66)
/* 114 */         .addBox(0.2346F, 3.386F, 1.0282F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 115 */         PartPose.offsetAndRotation(2.5154F, -5.511F, 3.2218F, -3.1416F, 0.0F, 3.1416F));
/* 116 */     PartDefinition bone = RightLeg1.addOrReplaceChild("bone", CubeListBuilder.create(), 
/* 117 */         PartPose.offsetAndRotation(5.5F, 0.875F, 13.75F, -0.7854F, 0.0F, 0.0F));
/* 118 */     PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1", CubeListBuilder.create(), 
/* 119 */         PartPose.offsetAndRotation(0.0F, 1.9888F, -2.8143F, 1.4835F, 0.0F, 0.0F));
/* 120 */     PartDefinition cube_r1_r1 = cube_r1.addOrReplaceChild("cube_r1_r1", 
/* 121 */         CubeListBuilder.create().texOffs(70, 0).addBox(0.2346F, 11.5843F, 0.7598F, 5.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 122 */         PartPose.offsetAndRotation(-2.9846F, -4.5297F, 3.6285F, -1.7454F, 0.0F, -3.1416F));
/* 123 */     PartDefinition bone2 = bone.addOrReplaceChild("bone2", CubeListBuilder.create(), 
/* 124 */         PartPose.offsetAndRotation(0.0F, -2.2929F, 1.5355F, 1.1781F, 0.0F, 0.0F));
/* 125 */     PartDefinition bone2_r1 = bone2.addOrReplaceChild("bone2_r1", 
/* 126 */         CubeListBuilder.create().texOffs(84, 44).addBox(0.7346F, 15.659F, 1.2059F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 127 */         PartPose.offsetAndRotation(-2.9846F, -7.7912F, -3.5217F, -2.3562F, 0.0F, -3.1416F));
/* 128 */     PartDefinition cube_r2 = bone2.addOrReplaceChild("cube_r2", CubeListBuilder.create(), 
/* 129 */         PartPose.offsetAndRotation(0.0F, 3.5598F, 1.3004F, -1.1781F, 0.0F, 0.0F));
/* 130 */     PartDefinition cube_r2_r1 = cube_r2.addOrReplaceChild("cube_r2_r1", 
/* 131 */         CubeListBuilder.create().texOffs(81, 19).addBox(0.7346F, -3.1217F, 14.9285F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 132 */         PartPose.offsetAndRotation(-2.9846F, 0.1113F, -12.3323F, 1.5708F, 0.0F, 3.1416F));
/* 133 */     PartDefinition RightLeg2 = partdefinition.addOrReplaceChild("RightLeg2", CubeListBuilder.create(), PartPose.offset(-3.5F, 9.0F, 8.0F));
/* 134 */     PartDefinition RightLeg2_r1 = RightLeg2.addOrReplaceChild("RightLeg2_r1", 
/* 135 */         CubeListBuilder.create().texOffs(48, 77).addBox(0.6096F, 17.4609F, -11.538F, 5.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
/* 136 */         .texOffs(60, 85).addBox(0.6096F, 2.386F, -14.7368F, 5.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 61)
/* 137 */         .addBox(0.6096F, 2.386F, -13.7368F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 138 */         PartPose.offsetAndRotation(3.5154F, -5.511F, -11.7782F, -3.1416F, 0.0F, 3.1416F));
/* 139 */     PartDefinition bone3 = RightLeg2.addOrReplaceChild("bone3", CubeListBuilder.create(), 
/* 140 */         PartPose.offsetAndRotation(6.5F, 0.875F, -15.25F, -0.7854F, 0.0F, 0.0F));
/* 141 */     PartDefinition cube_r3 = bone3.addOrReplaceChild("cube_r3", CubeListBuilder.create(), 
/* 142 */         PartPose.offsetAndRotation(0.0F, 1.9888F, -2.8143F, 1.4835F, 0.0F, 0.0F));
/* 143 */     PartDefinition cube_r3_r1 = cube_r3.addOrReplaceChild("cube_r3_r1", 
/* 144 */         CubeListBuilder.create().texOffs(64, 45).addBox(0.6096F, 1.3279F, -9.9083F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 145 */         PartPose.offsetAndRotation(-2.9846F, 4.469F, 14.3534F, -1.7454F, 0.0F, -3.1416F));
/* 146 */     PartDefinition bone4 = bone3.addOrReplaceChild("bone4", CubeListBuilder.create(), 
/* 147 */         PartPose.offsetAndRotation(0.0F, -2.2929F, 1.5355F, 1.1781F, 0.0F, 0.0F));
/* 148 */     PartDefinition bone4_r1 = bone4.addOrReplaceChild("bone4_r1", 
/* 149 */         CubeListBuilder.create().texOffs(12, 81).addBox(1.1096F, 9.1667F, -12.0227F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 150 */         PartPose.offsetAndRotation(-2.9846F, -2.4336F, 9.4126F, -2.3562F, 0.0F, -3.1416F));
/* 151 */     PartDefinition cube_r4 = bone4.addOrReplaceChild("cube_r4", CubeListBuilder.create(), 
/* 152 */         PartPose.offsetAndRotation(0.5F, 2.3352F, 2.6368F, -1.1781F, 0.0F, 0.0F));
/* 153 */     PartDefinition cube_r4_r1 = cube_r4.addOrReplaceChild("cube_r4_r1", 
/* 154 */         CubeListBuilder.create().texOffs(0, 69).addBox(1.1096F, 5.6155F, 3.8681F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 155 */         PartPose.offsetAndRotation(-3.4846F, -8.0849F, -1.8129F, 1.5708F, 0.0F, 3.1416F));
/* 156 */     PartDefinition LeftLeg1 = partdefinition.addOrReplaceChild("LeftLeg1", CubeListBuilder.create(), PartPose.offset(2.5F, 9.0F, -7.0F));
/* 157 */     PartDefinition LeftLeg1_r1 = LeftLeg1.addOrReplaceChild("LeftLeg1_r1", 
/* 158 */         CubeListBuilder.create().texOffs(76, 11).addBox(-5.3904F, 17.4727F, 2.7854F, 5.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
/* 159 */         .texOffs(84, 55).addBox(-5.6404F, 3.386F, 0.0282F, 5.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(66, 26)
/* 160 */         .addBox(-5.3904F, 3.386F, 1.0282F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 161 */         PartPose.offsetAndRotation(-2.4846F, -5.511F, 3.2218F, -3.1416F, 0.0F, 3.1416F));
/* 162 */     PartDefinition bone5 = LeftLeg1.addOrReplaceChild("bone5", CubeListBuilder.create(), 
/* 163 */         PartPose.offsetAndRotation(-5.5F, 0.875F, 13.75F, -0.7854F, 0.0F, 0.0F));
/* 164 */     PartDefinition cube_r5 = bone5.addOrReplaceChild("cube_r5", CubeListBuilder.create(), 
/* 165 */         PartPose.offsetAndRotation(0.0F, 1.9888F, -2.8143F, 1.4835F, 0.0F, 0.0F));
/* 166 */     PartDefinition cube_r5_r1 = cube_r5.addOrReplaceChild("cube_r5_r1", 
/* 167 */         CubeListBuilder.create().texOffs(60, 66).addBox(-5.3904F, 11.5843F, 0.7598F, 5.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 168 */         PartPose.offsetAndRotation(3.0154F, -4.5297F, 3.6285F, -1.7454F, 0.0F, -3.1416F));
/* 169 */     PartDefinition bone6 = bone5.addOrReplaceChild("bone6", CubeListBuilder.create(), 
/* 170 */         PartPose.offsetAndRotation(0.0F, -2.2929F, 1.5355F, 1.1781F, 0.0F, 0.0F));
/* 171 */     PartDefinition bone6_r1 = bone6.addOrReplaceChild("bone6_r1", 
/* 172 */         CubeListBuilder.create().texOffs(82, 33).addBox(-4.8904F, 15.659F, 1.2059F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 173 */         PartPose.offsetAndRotation(3.0154F, -7.7912F, -3.5217F, -2.3562F, 0.0F, -3.1416F));
/* 174 */     PartDefinition cube_r6 = bone6.addOrReplaceChild("cube_r6", CubeListBuilder.create(), 
/* 175 */         PartPose.offsetAndRotation(0.0F, 3.5598F, 1.3004F, -1.1781F, 0.0F, 0.0F));
/* 176 */     PartDefinition cube_r6_r1 = cube_r6.addOrReplaceChild("cube_r6_r1", 
/* 177 */         CubeListBuilder.create().texOffs(32, 77).addBox(-4.8904F, -3.1217F, 14.9285F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 178 */         PartPose.offsetAndRotation(3.0154F, 0.1113F, -12.3323F, 1.5708F, 0.0F, 3.1416F));
/* 179 */     PartDefinition LeftLeg2 = partdefinition.addOrReplaceChild("LeftLeg2", CubeListBuilder.create(), PartPose.offset(3.5F, 9.0F, 8.0F));
/* 180 */     PartDefinition LeftLeg2_r1 = LeftLeg2.addOrReplaceChild("LeftLeg2_r1", 
/* 181 */         CubeListBuilder.create().texOffs(16, 73).addBox(-5.3904F, 17.4609F, -11.538F, 5.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
/* 182 */         .texOffs(48, 85).addBox(-5.3904F, 2.386F, -14.7368F, 5.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 47)
/* 183 */         .addBox(-5.3904F, 2.386F, -13.7368F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 184 */         PartPose.offsetAndRotation(-3.4846F, -5.511F, -11.7782F, -3.1416F, 0.0F, 3.1416F));
/* 185 */     PartDefinition bone9 = LeftLeg2.addOrReplaceChild("bone9", CubeListBuilder.create(), 
/* 186 */         PartPose.offsetAndRotation(-6.5F, 0.875F, -15.25F, -0.7854F, 0.0F, 0.0F));
/* 187 */     PartDefinition cube_r7 = bone9.addOrReplaceChild("cube_r7", CubeListBuilder.create(), 
/* 188 */         PartPose.offsetAndRotation(0.0F, 1.9888F, -2.8143F, 1.4835F, 0.0F, 0.0F));
/* 189 */     PartDefinition cube_r7_r1 = cube_r7.addOrReplaceChild("cube_r7_r1", 
/* 190 */         CubeListBuilder.create().texOffs(0, 57).addBox(-5.3904F, 1.3279F, -9.9083F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 191 */         PartPose.offsetAndRotation(3.0154F, 4.469F, 14.3534F, -1.7454F, 0.0F, -3.1416F));
/* 192 */     PartDefinition bone10 = bone9.addOrReplaceChild("bone10", CubeListBuilder.create(), 
/* 193 */         PartPose.offsetAndRotation(0.0F, -2.2929F, 1.5355F, 1.1781F, 0.0F, 0.0F));
/* 194 */     PartDefinition bone10_r1 = bone10.addOrReplaceChild("bone10_r1", 
/* 195 */         CubeListBuilder.create().texOffs(74, 73).addBox(-4.8904F, 9.1667F, -12.0227F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 196 */         PartPose.offsetAndRotation(3.0154F, -2.4336F, 9.4126F, -2.3562F, 0.0F, -3.1416F));
/* 197 */     PartDefinition cube_r8 = bone10.addOrReplaceChild("cube_r8", CubeListBuilder.create(), 
/* 198 */         PartPose.offsetAndRotation(0.5F, 2.3352F, 2.6368F, -1.1781F, 0.0F, 0.0F));
/* 199 */     PartDefinition cube_r8_r1 = cube_r8.addOrReplaceChild("cube_r8_r1", 
/* 200 */         CubeListBuilder.create().texOffs(36, 26).addBox(-4.8904F, 5.6155F, 3.8681F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 201 */         PartPose.offsetAndRotation(2.5154F, -8.0849F, -1.8129F, 1.5708F, 0.0F, 3.1416F));
/* 202 */     return LayerDefinition.create(meshdefinition, 112, 112);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 208 */     this.Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 209 */     this.Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 210 */     this.Tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 211 */     this.LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 212 */     this.RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 213 */     this.RightLeg1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 214 */     this.RightLeg2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 215 */     this.LeftLeg1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 216 */     this.LeftLeg2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */   
/*     */   public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
/* 220 */     this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + 3.1415927F) * limbSwingAmount;
/* 221 */     this.Head.yRot = netHeadYaw / 57.295776F;
/* 222 */     this.Head.xRot = headPitch / 57.295776F;
/* 223 */     this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
/* 224 */     this.RightLeg2.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
/* 225 */     this.RightLeg1.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
/* 226 */     this.LeftLeg2.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
/* 227 */     this.LeftLeg1.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\client\model\ModelDark_Latex_Centaur_Model.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */