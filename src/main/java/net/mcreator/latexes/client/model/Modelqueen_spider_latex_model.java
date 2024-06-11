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
/*     */ public class Modelqueen_spider_latex_model<T extends Entity>
/*     */   extends EntityModel<T>
/*     */ {
/*  25 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("latex", "modelqueen_spider_latex_model"), "main");
/*     */   
/*     */   public final ModelPart Head;
/*     */   public final ModelPart Body;
/*     */   public final ModelPart RightArm;
/*     */   public final ModelPart LeftArm;
/*     */   public final ModelPart LowerBody;
/*     */   public final ModelPart Rightleg;
/*     */   public final ModelPart Leftleg;
/*     */   
/*     */   public Modelqueen_spider_latex_model(ModelPart root) {
/*  36 */     this.Head = root.getChild("Head");
/*  37 */     this.Body = root.getChild("Body");
/*  38 */     this.RightArm = root.getChild("RightArm");
/*  39 */     this.LeftArm = root.getChild("LeftArm");
/*  40 */     this.LowerBody = root.getChild("LowerBody");
/*  41 */     this.Rightleg = root.getChild("Rightleg");
/*  42 */     this.Leftleg = root.getChild("Leftleg");
/*     */   }
/*     */   
/*     */   public static LayerDefinition createBodyLayer() {
/*  46 */     MeshDefinition meshdefinition = new MeshDefinition();
/*  47 */     PartDefinition partdefinition = meshdefinition.getRoot();
/*  48 */     PartDefinition Head = partdefinition.addOrReplaceChild("Head", 
/*  49 */         CubeListBuilder.create().texOffs(47, 74).addBox(-4.5F, -9.0F, -4.75F, 9.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)), 
/*  50 */         PartPose.offset(0.0F, -9.5F, -11.5F));
/*  51 */     PartDefinition bone9 = Head.addOrReplaceChild("bone9", 
/*  52 */         CubeListBuilder.create().texOffs(14, 6).addBox(-4.0941F, -4.5396F, -5.25F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), 
/*  53 */         PartPose.offsetAndRotation(0.5F, 1.0F, -0.75F, 0.0F, 0.0F, -0.1745F));
/*  54 */     PartDefinition bone10 = Head.addOrReplaceChild("bone10", 
/*  55 */         CubeListBuilder.create().texOffs(14, 0).addBox(-3.8706F, -3.4501F, -5.25F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), 
/*  56 */         PartPose.offsetAndRotation(5.5F, 1.0F, -0.75F, 0.0F, 0.0F, 0.1745F));
/*  57 */     PartDefinition Body = partdefinition.addOrReplaceChild("Body", 
/*  58 */         CubeListBuilder.create().texOffs(79, 29).addBox(-5.5F, 0.5F, -3.5F, 11.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(98, 0)
/*  59 */         .addBox(-5.5F, 2.5F, -5.5F, 11.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(62, 17)
/*  60 */         .addBox(-5.5F, 1.5F, -4.5F, 11.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
/*  61 */         .addBox(-2.5F, 0.0F, -2.5F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 99)
/*  62 */         .addBox(-4.0F, 8.5F, -2.25F, 8.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
/*  63 */         .addBox(-3.0F, 1.5F, 2.75F, 6.0F, 15.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  64 */         PartPose.offset(0.0F, -9.5F, -11.5F));
/*  65 */     PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", 
/*  66 */         CubeListBuilder.create().texOffs(12, 112).addBox(0.0F, -2.0F, -1.75F, 4.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(26, 99)
/*  67 */         .addBox(-1.0F, 7.0F, -2.75F, 6.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(43, 101)
/*  68 */         .addBox(0.0F, 9.0F, -2.75F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), 
/*  69 */         PartPose.offset(5.5F, -7.0F, -11.25F));
/*  70 */     PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", 
/*  71 */         CubeListBuilder.create().texOffs(0, 36).addBox(-4.0F, -2.0F, -1.75F, 4.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(98, 50)
/*  72 */         .addBox(-5.0F, 7.0F, -2.75F, 6.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(61, 101)
/*  73 */         .addBox(-4.0F, 9.0F, -2.75F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), 
/*  74 */         PartPose.offset(-5.5F, -7.0F, -11.25F));
/*  75 */     PartDefinition LowerBody = partdefinition.addOrReplaceChild("LowerBody", 
/*  76 */         CubeListBuilder.create().texOffs(0, 36).addBox(-7.5F, 18.5F, -3.75F, 15.0F, 9.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(62, 0)
/*  77 */         .addBox(-6.5F, 19.5F, -5.75F, 13.0F, 7.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
/*  78 */         .addBox(-10.0F, 14.75F, 17.25F, 20.0F, 14.0F, 22.0F, new CubeDeformation(0.0F)).texOffs(51, 51)
/*  79 */         .addBox(-9.0F, 15.75F, 31.25F, 18.0F, 12.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(88, 95)
/*  80 */         .addBox(-6.0F, 19.0F, 12.25F, 12.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 61)
/*  81 */         .addBox(-7.0F, 16.5F, -3.25F, 14.0F, 6.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(46, 36)
/*  82 */         .addBox(-5.0F, 15.5F, -2.75F, 10.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)), 
/*  83 */         PartPose.offset(0.0F, -9.5F, -11.5F));
/*  84 */     PartDefinition Rightleg = partdefinition.addOrReplaceChild("Rightleg", CubeListBuilder.create(), 
/*  85 */         PartPose.offsetAndRotation(4.0F, 10.75F, -5.25F, 0.0F, 0.0F, 0.7854F));
/*  86 */     PartDefinition bone = Rightleg.addOrReplaceChild("bone", CubeListBuilder.create(), 
/*  87 */         PartPose.offsetAndRotation(2.1469F, -3.7366F, 9.25F, -0.0524F, -0.2094F, 0.3927F));
/*  88 */     PartDefinition bone3 = bone.addOrReplaceChild("bone3", 
/*  89 */         CubeListBuilder.create().texOffs(0, 112).addBox(-2.3886F, -15.2722F, 0.25F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)), 
/*  90 */         PartPose.offset(1.3886F, 7.2722F, -2.25F));
/*  91 */     PartDefinition bone2 = bone.addOrReplaceChild("bone2", 
/*  92 */         CubeListBuilder.create().texOffs(44, 95).addBox(0.6114F, -15.2722F, 0.25F, 19.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), 
/*  93 */         PartPose.offset(1.3886F, 7.2722F, -2.25F));
/*  94 */     PartDefinition bone4 = Rightleg.addOrReplaceChild("bone4", CubeListBuilder.create(), 
/*  95 */         PartPose.offsetAndRotation(2.1469F, -3.7366F, 5.0F, -0.0524F, -0.1047F, 0.3927F));
/*  96 */     PartDefinition bone5 = bone4.addOrReplaceChild("bone5", 
/*  97 */         CubeListBuilder.create().texOffs(62, 111).addBox(-2.3886F, -15.2722F, 0.25F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)), 
/*  98 */         PartPose.offset(1.3886F, 7.2722F, -2.25F));
/*  99 */     PartDefinition bone6 = bone4.addOrReplaceChild("bone6", 
/* 100 */         CubeListBuilder.create().texOffs(0, 93).addBox(0.6114F, -15.2722F, 0.25F, 19.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 101 */         PartPose.offset(1.3886F, 7.2722F, -2.25F));
/* 102 */     PartDefinition bone15 = Rightleg.addOrReplaceChild("bone15", CubeListBuilder.create(), 
/* 103 */         PartPose.offsetAndRotation(2.1469F, -3.7366F, 1.0F, -0.0524F, 0.0F, 0.3927F));
/* 104 */     PartDefinition bone16 = bone15.addOrReplaceChild("bone16", 
/* 105 */         CubeListBuilder.create().texOffs(109, 57).addBox(-2.3886F, -15.2722F, 0.25F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 106 */         PartPose.offset(1.3886F, 7.2722F, -2.25F));
/* 107 */     PartDefinition bone17 = bone15.addOrReplaceChild("bone17", 
/* 108 */         CubeListBuilder.create().texOffs(0, 87).addBox(0.6114F, -15.2722F, 0.25F, 19.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 109 */         PartPose.offset(1.3886F, 7.2722F, -2.25F));
/* 110 */     PartDefinition bone7 = Rightleg.addOrReplaceChild("bone7", CubeListBuilder.create(), 
/* 111 */         PartPose.offsetAndRotation(2.1469F, -3.7366F, 0.75F, -0.0524F, 0.1047F, 0.3927F));
/* 112 */     PartDefinition bone8 = bone7.addOrReplaceChild("bone8", 
/* 113 */         CubeListBuilder.create().texOffs(50, 111).addBox(-1.9705F, -15.064F, -3.7226F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 114 */         PartPose.offset(1.3886F, 7.2722F, -2.25F));
/* 115 */     PartDefinition bone11 = bone7.addOrReplaceChild("bone11", 
/* 116 */         CubeListBuilder.create().texOffs(92, 44).addBox(1.0295F, -15.064F, -3.7226F, 19.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 117 */         PartPose.offset(1.3886F, 7.2722F, -2.25F));
/* 118 */     PartDefinition bone12 = Rightleg.addOrReplaceChild("bone12", CubeListBuilder.create(), 
/* 119 */         PartPose.offsetAndRotation(2.1469F, -3.7366F, -3.25F, -0.0524F, 0.2094F, 0.3927F));
/* 120 */     PartDefinition bone13 = bone12.addOrReplaceChild("bone13", 
/* 121 */         CubeListBuilder.create().texOffs(38, 111).addBox(-1.557F, -15.0674F, -3.6572F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 122 */         PartPose.offset(1.3886F, 7.2722F, -2.25F));
/* 123 */     PartDefinition bone14 = bone12.addOrReplaceChild("bone14", 
/* 124 */         CubeListBuilder.create().texOffs(80, 89).addBox(1.443F, -15.0674F, -3.6572F, 19.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 125 */         PartPose.offset(1.3886F, 7.2722F, -2.25F));
/* 126 */     PartDefinition Leftleg = partdefinition.addOrReplaceChild("Leftleg", CubeListBuilder.create(), 
/* 127 */         PartPose.offsetAndRotation(-4.0F, 10.75F, -5.25F, 0.0F, 0.0F, -0.7854F));
/* 128 */     PartDefinition bone18 = Leftleg.addOrReplaceChild("bone18", CubeListBuilder.create(), 
/* 129 */         PartPose.offsetAndRotation(-2.1469F, -3.7366F, 9.25F, -0.0524F, 0.2094F, -0.3927F));
/* 130 */     PartDefinition bone19 = bone18.addOrReplaceChild("bone19", 
/* 131 */         CubeListBuilder.create().texOffs(103, 108).addBox(-0.6114F, -15.2722F, 0.25F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 132 */         PartPose.offset(-1.3886F, 7.2722F, -2.25F));
/* 133 */     PartDefinition bone20 = bone18.addOrReplaceChild("bone20", 
/* 134 */         CubeListBuilder.create().texOffs(84, 23).addBox(-19.6114F, -15.2722F, 0.25F, 19.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 135 */         PartPose.offset(-1.3886F, 7.2722F, -2.25F));
/* 136 */     PartDefinition bone21 = Leftleg.addOrReplaceChild("bone21", CubeListBuilder.create(), 
/* 137 */         PartPose.offsetAndRotation(-2.1469F, -3.7366F, 5.0F, -0.0524F, 0.1047F, -0.3927F));
/* 138 */     PartDefinition bone22 = bone21.addOrReplaceChild("bone22", 
/* 139 */         CubeListBuilder.create().texOffs(91, 108).addBox(-0.6114F, -15.2722F, 0.25F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 140 */         PartPose.offset(-1.3886F, 7.2722F, -2.25F));
/* 141 */     PartDefinition bone23 = bone21.addOrReplaceChild("bone23", 
/* 142 */         CubeListBuilder.create().texOffs(84, 17).addBox(-19.6114F, -15.2722F, 0.25F, 19.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 143 */         PartPose.offset(-1.3886F, 7.2722F, -2.25F));
/* 144 */     PartDefinition bone24 = Leftleg.addOrReplaceChild("bone24", CubeListBuilder.create(), 
/* 145 */         PartPose.offsetAndRotation(-2.1469F, -3.7366F, 1.0F, -0.0524F, 0.0F, -0.3927F));
/* 146 */     PartDefinition bone25 = bone24.addOrReplaceChild("bone25", 
/* 147 */         CubeListBuilder.create().texOffs(26, 106).addBox(-0.6114F, -15.2722F, 0.25F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 148 */         PartPose.offset(-1.3886F, 7.2722F, -2.25F));
/* 149 */     PartDefinition bone26 = bone24.addOrReplaceChild("bone26", 
/* 150 */         CubeListBuilder.create().texOffs(83, 83).addBox(-19.6114F, -15.2722F, 0.25F, 19.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 151 */         PartPose.offset(-1.3886F, 7.2722F, -2.25F));
/* 152 */     PartDefinition bone27 = Leftleg.addOrReplaceChild("bone27", CubeListBuilder.create(), 
/* 153 */         PartPose.offsetAndRotation(-2.1469F, -3.7366F, 0.75F, -0.0524F, -0.1047F, -0.3927F));
/* 154 */     PartDefinition bone28 = bone27.addOrReplaceChild("bone28", 
/* 155 */         CubeListBuilder.create().texOffs(79, 105).addBox(-1.0295F, -15.064F, -3.7226F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 156 */         PartPose.offset(-1.3886F, 7.2722F, -2.25F));
/* 157 */     PartDefinition bone29 = bone27.addOrReplaceChild("bone29", 
/* 158 */         CubeListBuilder.create().texOffs(0, 81).addBox(-20.0295F, -15.064F, -3.7226F, 19.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 159 */         PartPose.offset(-1.3886F, 7.2722F, -2.25F));
/* 160 */     PartDefinition bone30 = Leftleg.addOrReplaceChild("bone30", CubeListBuilder.create(), 
/* 161 */         PartPose.offsetAndRotation(-2.1469F, -3.7366F, -3.25F, -0.0524F, -0.2094F, -0.3927F));
/* 162 */     PartDefinition bone31 = bone30.addOrReplaceChild("bone31", 
/* 163 */         CubeListBuilder.create().texOffs(0, 61).addBox(-1.443F, -15.0674F, -3.6572F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 164 */         PartPose.offset(-1.3886F, 7.2722F, -2.25F));
/* 165 */     PartDefinition bone32 = bone30.addOrReplaceChild("bone32", 
/* 166 */         CubeListBuilder.create().texOffs(74, 74).addBox(-20.443F, -15.0674F, -3.6572F, 19.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 167 */         PartPose.offset(-1.3886F, 7.2722F, -2.25F));
/* 168 */     return LayerDefinition.create(meshdefinition, 256, 256);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 174 */     this.Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 175 */     this.Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 176 */     this.RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 177 */     this.LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 178 */     this.LowerBody.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 179 */     this.Rightleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 180 */     this.Leftleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */   
/*     */   public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
/* 184 */     this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + 3.1415927F) * limbSwingAmount;
/* 185 */     this.Leftleg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
/* 186 */     this.Head.yRot = netHeadYaw / 57.295776F;
/* 187 */     this.Head.xRot = headPitch / 57.295776F;
/* 188 */     this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
/* 189 */     this.Rightleg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\client\model\Modelqueen_spider_latex_model.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */