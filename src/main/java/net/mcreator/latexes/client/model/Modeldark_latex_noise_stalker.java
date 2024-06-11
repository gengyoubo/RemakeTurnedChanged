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
/*     */ public class Modeldark_latex_noise_stalker<T extends Entity>
/*     */   extends EntityModel<T>
/*     */ {
/*  25 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("latex", "modeldark_latex_noise_stalker"), "main");
/*     */   
/*     */   public final ModelPart Head;
/*     */   public final ModelPart Body;
/*     */   public final ModelPart Tail;
/*     */   public final ModelPart LeftArm;
/*     */   public final ModelPart RightArm;
/*     */   public final ModelPart LeftLeg;
/*     */   public final ModelPart RightLeg;
/*     */   
/*     */   public Modeldark_latex_noise_stalker(ModelPart root) {
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
/*  49 */         CubeListBuilder.create().texOffs(0, 5).addBox(2.0F, -6.0F, -4.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(2, 4)
/*  50 */         .addBox(0.0F, -6.0F, -4.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(4, 3)
/*  51 */         .addBox(-1.0F, -6.0F, -4.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(4, 2)
/*  52 */         .addBox(-3.0F, -6.0F, -4.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(2, 2)
/*  53 */         .addBox(-4.0F, -6.0F, -4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 2)
/*  54 */         .addBox(-4.0F, -6.0F, -2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(2, 1)
/*  55 */         .addBox(4.0F, -6.0F, -4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
/*  56 */         .addBox(4.0F, -6.0F, -2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
/*  57 */         .addBox(-4.0F, -12.0F, -4.0F, 8.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(48, 21)
/*  58 */         .addBox(-4.0F, -12.0F, 4.0F, 8.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), 
/*  59 */         PartPose.offset(0.0F, 0.0F, -1.0F));
/*  60 */     PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1", 
/*  61 */         CubeListBuilder.create().texOffs(65, 46).addBox(-4.0F, -7.75F, 4.5F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(46, 66)
/*  62 */         .addBox(-11.3F, -7.75F, 4.5F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(63, 61)
/*  63 */         .addBox(-4.0F, -7.75F, -0.5F, 2.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 65).addBox(-11.3F, -7.75F, -0.5F, 2.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), 
/*     */         
/*  65 */         PartPose.offsetAndRotation(6.6F, -4.0F, 2.2F, 0.2182F, 0.0F, 0.0F));
/*  66 */     PartDefinition cube_r2 = Head.addOrReplaceChild("cube_r2", 
/*  67 */         CubeListBuilder.create().texOffs(55, 14).addBox(-3.0F, -2.0F, -4.0F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  68 */         PartPose.offsetAndRotation(0.0F, -3.4F, 0.7F, 0.1745F, 0.0F, 0.0F));
/*  69 */     PartDefinition cube_r3 = Head.addOrReplaceChild("cube_r3", 
/*  70 */         CubeListBuilder.create().texOffs(18, 43).addBox(-4.0F, -2.0F, 0.0F, 8.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(4, 1)
/*  71 */         .addBox(-2.0F, -2.0F, -4.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(4, 4)
/*  72 */         .addBox(1.0F, -2.0F, -4.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(3, 0)
/*  73 */         .addBox(-4.0F, -2.0F, -4.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 4)
/*  74 */         .addBox(3.0F, -2.0F, -4.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(17, 14).addBox(-4.0F, -1.0F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), 
/*     */         
/*  76 */         PartPose.offsetAndRotation(0.0F, -4.0F, 0.3F, 0.1745F, 0.0F, 0.0F));
/*  77 */     PartDefinition Body = partdefinition.addOrReplaceChild("Body", 
/*  78 */         CubeListBuilder.create().texOffs(24, 25).addBox(-5.0F, -4.0F, -2.0F, 10.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(22, 35)
/*  79 */         .addBox(-4.0F, 2.0F, -2.0F, 8.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(24, 0)
/*  80 */         .addBox(-5.0F, 6.0F, -2.0F, 10.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  81 */         PartPose.offset(0.0F, 0.0F, 0.0F));
/*  82 */     PartDefinition Tail = partdefinition.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
/*  83 */     PartDefinition cube_r4 = Tail.addOrReplaceChild("cube_r4", 
/*  84 */         CubeListBuilder.create().texOffs(0, 14).addBox(-1.5F, -1.75F, 1.0F, 3.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)), 
/*  85 */         PartPose.offsetAndRotation(0.0F, 10.6288F, 7.2606F, -0.2618F, 0.0F, 0.0F));
/*  86 */     PartDefinition cube_r5 = Tail.addOrReplaceChild("cube_r5", 
/*  87 */         CubeListBuilder.create().texOffs(0, 29).addBox(-1.5F, -0.75F, -6.0F, 3.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), 
/*  88 */         PartPose.offsetAndRotation(0.0F, 10.2169F, 6.6575F, -0.3927F, 0.0F, 0.0F));
/*  89 */     PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", 
/*  90 */         CubeListBuilder.create().texOffs(0, 0).addBox(-5.7098F, 9.3629F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
/*  91 */         .addBox(-5.7098F, 9.3629F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
/*  92 */         .addBox(-5.7098F, 9.3629F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 40)
/*  93 */         .addBox(-5.7098F, 1.3629F, -2.0F, 5.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  94 */         PartPose.offset(-5.0F, 2.0F, 0.0F));
/*  95 */     PartDefinition cube_r6 = LeftArm.addOrReplaceChild("cube_r6", 
/*  96 */         CubeListBuilder.create().texOffs(47, 30).addBox(-4.0F, -5.0F, -2.8F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), 
/*  97 */         PartPose.offsetAndRotation(0.1F, -1.6F, 0.3F, 0.0F, 0.0F, -0.2618F));
/*  98 */     PartDefinition cube_r7 = LeftArm.addOrReplaceChild("cube_r7", 
/*  99 */         CubeListBuilder.create().texOffs(16, 57).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 100 */         PartPose.offsetAndRotation(-1.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.1745F));
/* 101 */     PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", 
/* 102 */         CubeListBuilder.create().texOffs(0, 40).mirror().addBox(0.7098F, 1.3629F, -2.0F, 5.0F, 8.0F, 4.0F, new CubeDeformation(0.0F))
/* 103 */         .mirror(false).texOffs(0, 0).mirror().addBox(4.7098F, 9.3629F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
/* 104 */         .mirror(false).texOffs(0, 0).mirror().addBox(4.7098F, 9.3629F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
/* 105 */         .mirror(false).texOffs(0, 0).mirror().addBox(4.7098F, 9.3629F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
/* 106 */         .mirror(false), 
/* 107 */         PartPose.offset(5.0F, 2.0F, 0.0F));
/*     */     
/* 109 */     PartDefinition cube_r8 = RightArm.addOrReplaceChild("cube_r8", 
/* 110 */         CubeListBuilder.create().texOffs(16, 57).mirror()
/* 111 */         .addBox(-1.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), 
/* 112 */         PartPose.offsetAndRotation(1.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.1745F));
/* 113 */     PartDefinition cube_r9 = RightArm.addOrReplaceChild("cube_r9", 
/* 114 */         CubeListBuilder.create().texOffs(13, 48).addBox(-1.0F, -5.0F, -2.8F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 115 */         PartPose.offsetAndRotation(-0.1F, -1.6F, 0.3F, 0.0F, 0.0F, 0.2618F));
/* 116 */     PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", 
/* 117 */         CubeListBuilder.create().texOffs(60, 39).addBox(-3.0F, -3.0F, -2.0F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
/* 118 */         .texOffs(62, 29).addBox(-3.125F, 9.9239F, -3.3827F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 119 */         PartPose.offset(-2.0F, 12.0F, 0.0F));
/* 120 */     PartDefinition cube_r10 = LeftLeg.addOrReplaceChild("cube_r10", 
/* 121 */         CubeListBuilder.create().texOffs(0, 54).addBox(-3.0F, -2.0F, -1.0F, 5.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 122 */         PartPose.offsetAndRotation(-0.125F, 5.4614F, 1.379F, -0.4538F, 0.0F, 0.0F));
/* 123 */     PartDefinition cube_r11 = LeftLeg.addOrReplaceChild("cube_r11", 
/* 124 */         CubeListBuilder.create().texOffs(41, 7).addBox(-3.0F, -3.0F, -2.0F, 5.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 125 */         PartPose.offsetAndRotation(-0.125F, 4.0006F, -0.3861F, 0.9861F, 0.0F, 0.0F));
/* 126 */     PartDefinition cube_r12 = LeftLeg.addOrReplaceChild("cube_r12", 
/* 127 */         CubeListBuilder.create().texOffs(51, 50).addBox(-3.0F, -3.0F, -2.0F, 5.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 128 */         PartPose.offsetAndRotation(0.0F, 2.0063F, -0.9958F, -0.3927F, 0.0F, 0.0F));
/* 129 */     PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", 
/* 130 */         CubeListBuilder.create().texOffs(32, 60).addBox(-2.0F, -3.0F, -2.0F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
/* 131 */         .texOffs(50, 60).addBox(-1.875F, 9.9239F, -3.3827F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 132 */         PartPose.offset(2.0F, 12.0F, 0.0F));
/* 133 */     PartDefinition cube_r13 = RightLeg.addOrReplaceChild("cube_r13", 
/* 134 */         CubeListBuilder.create().texOffs(55, 0).addBox(-2.0F, -2.0F, -1.0F, 5.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 135 */         PartPose.offsetAndRotation(0.125F, 5.4614F, 1.379F, -0.4538F, 0.0F, 0.0F));
/* 136 */     PartDefinition cube_r14 = RightLeg.addOrReplaceChild("cube_r14", 
/* 137 */         CubeListBuilder.create().texOffs(42, 39).addBox(-2.0F, -3.0F, -2.0F, 5.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 138 */         PartPose.offsetAndRotation(0.125F, 4.0006F, -0.3861F, 0.9861F, 0.0F, 0.0F));
/* 139 */     PartDefinition cube_r15 = RightLeg.addOrReplaceChild("cube_r15", 
/* 140 */         CubeListBuilder.create().texOffs(33, 50).addBox(-2.0F, -3.0F, -2.0F, 5.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 141 */         PartPose.offsetAndRotation(0.0F, 2.0063F, -0.9958F, -0.3927F, 0.0F, 0.0F));
/* 142 */     return LayerDefinition.create(meshdefinition, 80, 80);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 148 */     this.Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 149 */     this.Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 150 */     this.Tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 151 */     this.LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 152 */     this.RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 153 */     this.LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 154 */     this.RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */   
/*     */   public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
/* 158 */     this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + 3.1415927F) * limbSwingAmount;
/* 159 */     this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
/* 160 */     this.Head.yRot = netHeadYaw / 57.295776F;
/* 161 */     this.Head.xRot = headPitch / 57.295776F;
/* 162 */     this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
/* 163 */     this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\client\model\Modeldark_latex_noise_stalker.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */