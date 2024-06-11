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
/*     */ public class Modelhertx_ashbury_sit_model<T extends Entity>
/*     */   extends EntityModel<T>
/*     */ {
/*  24 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("latex", "modelhertx_ashbury_sit_model"), "main");
/*     */   
/*     */   public final ModelPart Head;
/*     */   public final ModelPart Body;
/*     */   public final ModelPart Tail;
/*     */   public final ModelPart LeftArm;
/*     */   public final ModelPart RightArm;
/*     */   public final ModelPart LeftLeg;
/*     */   public final ModelPart RightLeg;
/*     */   
/*     */   public Modelhertx_ashbury_sit_model(ModelPart root) {
/*  35 */     this.Head = root.getChild("Head");
/*  36 */     this.Body = root.getChild("Body");
/*  37 */     this.Tail = root.getChild("Tail");
/*  38 */     this.LeftArm = root.getChild("LeftArm");
/*  39 */     this.RightArm = root.getChild("RightArm");
/*  40 */     this.LeftLeg = root.getChild("LeftLeg");
/*  41 */     this.RightLeg = root.getChild("RightLeg");
/*     */   }
/*     */   
/*     */   public static LayerDefinition createBodyLayer() {
/*  45 */     MeshDefinition meshdefinition = new MeshDefinition();
/*  46 */     PartDefinition partdefinition = meshdefinition.getRoot();
/*  47 */     PartDefinition Head = partdefinition.addOrReplaceChild("Head", 
/*  48 */         CubeListBuilder.create().texOffs(24, 16).addBox(-3.0F, -1.5768F, -5.0166F, 6.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
/*  49 */         .texOffs(14, 57).addBox(-2.0F, -2.5768F, -3.0166F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(63, 9)
/*  50 */         .addBox(-2.0F, -6.5768F, 1.9834F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(54, 9)
/*  51 */         .addBox(-2.0F, -2.5768F, 2.9834F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 8)
/*  52 */         .addBox(-3.0F, -2.5768F, 1.9834F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(61, 33)
/*  53 */         .addBox(-2.0F, -0.5768F, -1.9166F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(20, 32)
/*  54 */         .addBox(2.0F, -6.5768F, 1.9834F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 24)
/*  55 */         .addBox(-3.0F, -6.5768F, 1.9834F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 0)
/*  56 */         .addBox(-3.0F, -6.5768F, -5.0166F, 6.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(52, 31)
/*  57 */         .addBox(2.0F, -5.5768F, -5.0166F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(55, 50)
/*  58 */         .addBox(2.0F, -2.5768F, -5.0166F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(45, 9)
/*  59 */         .addBox(-3.0F, -5.5768F, -5.0166F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(54, 12)
/*  60 */         .addBox(-3.0F, -2.5768F, -5.0166F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(20, 16)
/*  61 */         .addBox(-2.0F, -5.5768F, -5.0166F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 11)
/*  62 */         .addBox(-2.0F, -2.5768F, -5.0166F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  63 */         PartPose.offset(0.0F, 9.75F, 5.8F));
/*  64 */     PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1", 
/*  65 */         CubeListBuilder.create().texOffs(0, 16).addBox(-3.125F, 5.4099F, 6.9521F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(21, 63)
/*  66 */         .addBox(-3.125F, 5.4099F, 1.9521F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(7, 0)
/*  67 */         .addBox(2.125F, 5.4099F, 6.9521F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(9, 10)
/*  68 */         .addBox(2.125F, 5.4099F, 7.9521F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 5)
/*  69 */         .addBox(-3.125F, 5.4099F, 7.9521F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(9, 63)
/*  70 */         .addBox(2.125F, 5.4099F, 1.9521F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), 
/*  71 */         PartPose.offsetAndRotation(0.0F, -9.35F, -3.75F, 0.6545F, 0.0F, 0.0F));
/*  72 */     PartDefinition Body = partdefinition.addOrReplaceChild("Body", 
/*  73 */         CubeListBuilder.create().texOffs(0, 32).addBox(-3.5F, 10.0673F, 7.6985F, 7.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
/*  74 */         .addBox(-4.0F, 9.7185F, 8.5972F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(62, 20)
/*  75 */         .addBox(-3.97F, 18.5985F, 7.5972F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(41, 57)
/*  76 */         .addBox(-1.625F, 9.5935F, 7.3472F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), 
/*  77 */         PartPose.offsetAndRotation(0.0F, -3.25F, 0.0F, -0.3927F, 0.0F, 0.0F));
/*  78 */     PartDefinition booba = Body.addOrReplaceChild("booba", CubeListBuilder.create(), PartPose.offset(0.0F, 3.65F, -0.2F));
/*  79 */     PartDefinition Body_r1 = booba.addOrReplaceChild("Body_r1", 
/*  80 */         CubeListBuilder.create().texOffs(32, 8).addBox(-3.5F, 3.6265F, 11.6118F, 7.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), 
/*  81 */         PartPose.offsetAndRotation(0.0F, -1.3768F, -1.4416F, -0.3927F, 0.0F, 0.0F));
/*  82 */     PartDefinition Tail = partdefinition.addOrReplaceChild("Tail", CubeListBuilder.create(), 
/*  83 */         PartPose.offsetAndRotation(0.0F, 20.75F, 3.0F, 0.7854F, 0.0F, 0.0F));
/*  84 */     PartDefinition cube_r2 = Tail.addOrReplaceChild("cube_r2", 
/*  85 */         CubeListBuilder.create().texOffs(24, 24).addBox(-1.3F, 19.0976F, 20.0755F, 3.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), 
/*  86 */         PartPose.offsetAndRotation(0.0F, -17.8865F, -2.2909F, -0.3927F, 0.0F, 0.0F));
/*  87 */     PartDefinition bone = cube_r2.addOrReplaceChild("bone", 
/*  88 */         CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -3.125F, 6.6489F, 2.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(44, 31)
/*  89 */         .addBox(-1.0F, -4.125F, 6.6489F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), 
/*  90 */         PartPose.offsetAndRotation(0.2F, 11.0418F, 23.0617F, -0.7854F, 0.0F, 0.0F));
/*  91 */     PartDefinition bone2 = cube_r2.addOrReplaceChild("bone2", 
/*  92 */         CubeListBuilder.create().texOffs(41, 64).addBox(-1.0F, -9.5817F, 3.5039F, 2.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(37, 28)
/*  93 */         .addBox(-1.0F, -10.5817F, 4.5039F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), 
/*  94 */         PartPose.offsetAndRotation(0.2F, 14.2637F, 23.4492F, -1.9635F, 0.0F, 0.0F));
/*  95 */     PartDefinition cube_r3 = Tail.addOrReplaceChild("cube_r3", 
/*  96 */         CubeListBuilder.create().texOffs(0, 0).addBox(-1.3F, 9.704F, 14.0817F, 3.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(16, 63)
/*  97 */         .addBox(1.7F, 10.704F, 19.0817F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(28, 46)
/*  98 */         .addBox(3.7F, 10.704F, 21.0817F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(12, 40)
/*  99 */         .addBox(2.7F, 10.704F, 20.0817F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(32, 34)
/* 100 */         .addBox(-4.2F, 10.704F, 21.0817F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(48, 31)
/* 101 */         .addBox(-2.2F, 10.704F, 19.0817F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(37, 24)
/* 102 */         .addBox(-3.2F, 10.704F, 20.0817F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(64, 0)
/* 103 */         .addBox(-0.3F, 8.704F, 16.0817F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 67)
/* 104 */         .addBox(-0.3F, 7.704F, 17.0817F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(51, 64)
/* 105 */         .addBox(-0.3F, 6.704F, 18.0817F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(64, 50)
/* 106 */         .addBox(-0.3F, 5.704F, 19.0817F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 107 */         PartPose.offsetAndRotation(0.0F, -17.8865F, -2.2909F, -0.7854F, 0.0F, 0.0F));
/* 108 */     PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", 
/* 109 */         CubeListBuilder.create().texOffs(0, 51).addBox(-2.0F, 10.9693F, -3.9049F, 3.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(46, 46)
/* 110 */         .addBox(-3.0F, 19.9693F, -3.9049F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 111 */         PartPose.offsetAndRotation(-5.0F, -1.0F, 0.0F, 0.5236F, 0.0F, 0.0F));
/* 112 */     PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", 
/* 113 */         CubeListBuilder.create().texOffs(32, 46).addBox(-1.75F, 9.1059F, -3.5243F, 3.0F, 9.0F, 4.0F, new CubeDeformation(0.0F))
/* 114 */         .texOffs(46, 20).addBox(-1.75F, 18.1059F, -3.5243F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 115 */         PartPose.offsetAndRotation(5.75F, 0.95F, 0.0F, 0.5236F, 0.0F, 0.0F));
/* 116 */     PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", 
/* 117 */         CubeListBuilder.create().texOffs(61, 27).addBox(-4.8871F, -3.866F, 7.9834F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
/* 118 */         .texOffs(51, 2).addBox(-4.9071F, 9.6108F, 7.3998F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(19, 11)
/* 119 */         .addBox(-3.4071F, 10.6108F, 6.3998F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(23, 11)
/* 120 */         .addBox(-1.9071F, 10.6108F, 6.3998F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 20)
/* 121 */         .addBox(-4.9071F, 10.6108F, 6.3998F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 122 */         PartPose.offsetAndRotation(-2.125F, 10.0F, 0.0F, -1.7453F, 0.2618F, -0.2618F));
/* 123 */     PartDefinition cube_r4 = LeftLeg.addOrReplaceChild("cube_r4", 
/* 124 */         CubeListBuilder.create().texOffs(57, 58).addBox(-4.8871F, -1.8528F, 11.6109F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 125 */         PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 126 */     PartDefinition cube_r5 = LeftLeg.addOrReplaceChild("cube_r5", 
/* 127 */         CubeListBuilder.create().texOffs(36, 34).addBox(-4.9621F, 4.6009F, 3.1797F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 128 */         PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
/* 129 */     PartDefinition cube_r6 = LeftLeg.addOrReplaceChild("cube_r6", 
/* 130 */         CubeListBuilder.create().texOffs(16, 46).addBox(-5.0121F, -8.177F, 5.4675F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F))
/* 131 */         .texOffs(19, 0).addBox(-6.0121F, -6.4571F, 6.2991F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), 
/* 132 */         PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 133 */     PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", 
/* 134 */         CubeListBuilder.create().texOffs(28, 60).addBox(1.0121F, -3.866F, 7.9834F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(38, 0)
/* 135 */         .addBox(1.0421F, 9.6108F, 7.3998F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(27, 28)
/* 136 */         .addBox(4.0421F, 10.6108F, 6.3998F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(27, 21)
/* 137 */         .addBox(1.0421F, 10.6108F, 6.3998F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(27, 11)
/* 138 */         .addBox(2.5421F, 10.6108F, 6.3998F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 139 */         PartPose.offsetAndRotation(2.0F, 10.0F, 0.0F, -1.7453F, -0.2618F, 0.2618F));
/* 140 */     PartDefinition cube_r7 = RightLeg.addOrReplaceChild("cube_r7", 
/* 141 */         CubeListBuilder.create().texOffs(58, 41).addBox(1.0121F, -1.8528F, 11.6109F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 142 */         PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 143 */     PartDefinition cube_r8 = RightLeg.addOrReplaceChild("cube_r8", 
/* 144 */         CubeListBuilder.create().texOffs(20, 34).addBox(1.0871F, 4.6009F, 3.1797F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 145 */         PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
/* 146 */     PartDefinition cube_r9 = RightLeg.addOrReplaceChild("cube_r9", 
/* 147 */         CubeListBuilder.create().texOffs(0, 40).addBox(1.1371F, -8.177F, 5.4675F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 148 */         PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 149 */     return LayerDefinition.create(meshdefinition, 80, 80);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 155 */     this.Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 156 */     this.Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 157 */     this.Tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 158 */     this.LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 159 */     this.RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 160 */     this.LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 161 */     this.RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */   
/*     */   public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
/* 165 */     this.Head.yRot = netHeadYaw / 57.295776F;
/* 166 */     this.Head.xRot = headPitch / 57.295776F;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\client\model\Modelhertx_ashbury_sit_model.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */