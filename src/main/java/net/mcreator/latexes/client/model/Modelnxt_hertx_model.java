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
/*     */ public class Modelnxt_hertx_model<T extends Entity>
/*     */   extends EntityModel<T>
/*     */ {
/*  25 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("latex", "modelnxt_hertx_model"), "main");
/*     */   public final ModelPart Head;
/*     */   public final ModelPart Body;
/*     */   public final ModelPart Tail;
/*     */   public final ModelPart LeftArm;
/*     */   public final ModelPart RightArm;
/*     */   public final ModelPart LeftLeg;
/*     */   public final ModelPart RightLeg;
/*     */   
/*     */   public Modelnxt_hertx_model(ModelPart root) {
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
/*  48 */         CubeListBuilder.create().texOffs(46, 33).addBox(-2.0F, -3.4F, -3.2F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(58, 12)
/*  49 */         .addBox(-2.0F, -7.4F, 1.8F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(24, 18)
/*  50 */         .addBox(-2.0F, -3.4F, 2.8F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(62, 64)
/*  51 */         .addBox(-3.0F, -3.4F, 1.8F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 11)
/*  52 */         .addBox(-3.0F, -1.4F, -3.1F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(20, 14)
/*  53 */         .addBox(-1.5F, -0.4F, -2.85F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 33)
/*  54 */         .addBox(-3.5F, -6.4F, 1.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(31, 0)
/*  55 */         .addBox(2.5F, -6.4F, 1.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 39)
/*  56 */         .addBox(2.0F, -7.4F, 1.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 45)
/*  57 */         .addBox(-3.0F, -7.4F, 1.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(31, 0)
/*  58 */         .addBox(-3.0F, -7.4F, -3.2F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(10, 50)
/*  59 */         .addBox(2.0F, -6.4F, -4.2F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(34, 48)
/*  60 */         .addBox(-3.0F, -6.4F, -4.2F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 7)
/*  61 */         .addBox(-2.0F, -6.4F, -4.2F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  62 */         PartPose.offset(0.0F, -2.0F, 0.0F));
/*  63 */     PartDefinition Jaw = Head.addOrReplaceChild("Jaw", 
/*  64 */         CubeListBuilder.create().texOffs(30, 57).addBox(2.0F, -0.3F, -6.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(31, 6)
/*  65 */         .addBox(-2.0F, -0.3F, -6.2F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 33)
/*  66 */         .addBox(-3.0F, 0.7F, -5.2F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 56)
/*  67 */         .addBox(-3.0F, -0.3F, -6.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), 
/*  68 */         PartPose.offset(0.0F, -3.0F, 2.0F));
/*  69 */     PartDefinition bone2 = Jaw.addOrReplaceChild("bone2", 
/*  70 */         CubeListBuilder.create().texOffs(33, 33).addBox(-3.0F, -18.0413F, -22.5668F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
/*  71 */         .texOffs(36, 46).addBox(-3.0F, -18.0413F, -22.981F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  72 */         PartPose.offsetAndRotation(0.0F, 29.0F, -2.0F, -0.7854F, 0.0F, 0.0F));
/*  73 */     PartDefinition bone = Head.addOrReplaceChild("bone", 
/*  74 */         CubeListBuilder.create().texOffs(38, 59).addBox(-3.0F, -25.8801F, 19.9404F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
/*  75 */         .texOffs(58, 46).addBox(-3.0F, -25.8801F, 20.3546F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  76 */         PartPose.offsetAndRotation(0.0F, 26.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
/*  77 */     PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1", 
/*  78 */         CubeListBuilder.create().texOffs(33, 35).addBox(-2.9F, -8.7665F, 9.6128F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(9, 59)
/*  79 */         .addBox(-2.9F, -8.7665F, 4.6128F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(12, 30)
/*  80 */         .addBox(1.9F, -8.7665F, 9.6128F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 30)
/*  81 */         .addBox(-3.4F, -7.4142F, 8.2505F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 14)
/*  82 */         .addBox(2.4F, -7.4142F, 8.2505F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 48)
/*  83 */         .addBox(1.9F, -8.7665F, 4.6128F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 63)
/*  84 */         .addBox(-3.4F, -7.4142F, 4.2505F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(2.4F, -7.4142F, 4.2505F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), 
/*     */         
/*  86 */         PartPose.offsetAndRotation(0.0F, 2.4F, -0.2F, 0.2618F, 0.0F, 0.0F));
/*  87 */     PartDefinition Body = partdefinition.addOrReplaceChild("Body", 
/*  88 */         CubeListBuilder.create().texOffs(0, 14).addBox(-4.0F, -0.8F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(59, 30)
/*  89 */         .addBox(-3.0F, 0.2F, -3.0F, 6.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
/*  90 */         .addBox(-4.0F, 0.2F, 2.0F, 8.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 0)
/*  91 */         .addBox(3.0F, 0.2F, -3.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
/*  92 */         .addBox(-4.0F, 0.2F, -3.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(50, 61)
/*  93 */         .addBox(3.0F, -1.8F, -2.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(21, 61)
/*  94 */         .addBox(-4.0F, -1.8F, -2.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(24, 39)
/*  95 */         .addBox(-1.0F, 1.2F, -3.25F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 56)
/*  96 */         .addBox(-2.5F, 5.2F, -3.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 18)
/*  97 */         .addBox(0.5F, 5.2F, -3.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  98 */         PartPose.offset(0.0F, -2.0F, 0.0F));
/*  99 */     PartDefinition Tail = partdefinition.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offset(0.0F, -2.0F, 0.0F));
/* 100 */     PartDefinition cube_r10 = Tail.addOrReplaceChild("cube_r10", 
/* 101 */         CubeListBuilder.create().texOffs(17, 0).addBox(-1.3F, 15.4952F, 16.7033F, 3.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), 
/* 102 */         PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, -0.0873F, 0.0F, 0.0F));
/* 103 */     PartDefinition cube_r2 = Tail.addOrReplaceChild("cube_r2", 
/* 104 */         CubeListBuilder.create().texOffs(16, 22).addBox(-1.3F, 9.6164F, 13.4918F, 3.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), 
/* 105 */         PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 106 */     PartDefinition cube_r3 = Tail.addOrReplaceChild("cube_r3", 
/* 107 */         CubeListBuilder.create().texOffs(0, 0).addBox(-1.3F, 3.4929F, 6.2929F, 3.0F, 3.0F, 11.0F, new CubeDeformation(0.0F)), 
/* 108 */         PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
/* 109 */     PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", 
/* 110 */         CubeListBuilder.create().texOffs(30, 18).addBox(-3.0F, -2.8F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(20, 55)
/* 111 */         .addBox(-3.0F, 5.2F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(17, 0)
/* 112 */         .addBox(-3.25F, 5.2F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(46, 16)
/* 113 */         .addBox(-3.0F, 7.2F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(18, 54)
/* 114 */         .addBox(-3.0F, 11.2F, 1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 5)
/* 115 */         .addBox(-3.0F, 11.2F, -2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 42)
/* 116 */         .addBox(-1.0F, 11.2F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(18, 52)
/* 117 */         .addBox(-3.0F, 11.2F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 118 */         PartPose.offset(-5.0F, 0.0F, 0.0F));
/* 119 */     PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", 
/* 120 */         CubeListBuilder.create().texOffs(0, 30).addBox(-1.0F, -4.8F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(54, 24)
/* 121 */         .addBox(-1.0F, 3.2F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(24, 46)
/* 122 */         .addBox(-1.0F, 5.2F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 42)
/* 123 */         .addBox(0.0F, 9.2F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(18, 50)
/* 124 */         .addBox(1.0F, 9.2F, -2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 48)
/* 125 */         .addBox(1.0F, 9.2F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 44)
/* 126 */         .addBox(1.0F, 9.2F, 1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(17, 4)
/* 127 */         .addBox(2.25F, 3.2F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), 
/* 128 */         PartPose.offset(5.0F, 2.0F, 0.0F));
/* 129 */     PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", 
/* 130 */         CubeListBuilder.create().texOffs(44, 53).addBox(-2.0F, -0.8F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
/* 131 */         .texOffs(45, 45).addBox(-2.0F, 11.0F, -3.4102F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 132 */         PartPose.offset(-2.0F, 10.0F, 0.0F));
/* 133 */     PartDefinition cube_r4 = LeftLeg.addOrReplaceChild("cube_r4", 
/* 134 */         CubeListBuilder.create().texOffs(57, 57).addBox(-2.0F, 3.3F, 3.0F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(62, 36)
/* 135 */         .addBox(-2.0F, 7.3F, 3.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(41, 61).addBox(-2.0F, 8.3F, 3.0F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), 
/*     */         
/* 137 */         PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 138 */     PartDefinition cube_r5 = LeftLeg.addOrReplaceChild("cube_r5", 
/* 139 */         CubeListBuilder.create().texOffs(12, 39).addBox(-2.0F, -0.5848F, -5.0633F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 140 */         PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
/* 141 */     PartDefinition cube_r6 = LeftLeg.addOrReplaceChild("cube_r6", 
/* 142 */         CubeListBuilder.create().texOffs(0, 46).addBox(-2.0F, -1.5045F, -2.4584F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 143 */         PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 144 */     PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", 
/* 145 */         CubeListBuilder.create().texOffs(50, 39).addBox(-2.0F, -0.8F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
/* 146 */         .texOffs(41, 25).addBox(-2.0F, 11.0F, -3.4102F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 147 */         PartPose.offset(2.0F, 10.0F, 0.0F));
/* 148 */     PartDefinition cube_r7 = RightLeg.addOrReplaceChild("cube_r7", 
/* 149 */         CubeListBuilder.create().texOffs(56, 5).addBox(-2.0F, 3.3F, 3.0F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(63, 42)
/* 150 */         .addBox(-2.0F, 7.3F, 3.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(62, 19).addBox(-2.0F, 8.3F, 3.0F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), 
/*     */         
/* 152 */         PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 153 */     PartDefinition cube_r8 = RightLeg.addOrReplaceChild("cube_r8", 
/* 154 */         CubeListBuilder.create().texOffs(34, 35).addBox(-2.0F, -0.5848F, -5.0633F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 155 */         PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
/* 156 */     PartDefinition cube_r9 = RightLeg.addOrReplaceChild("cube_r9", 
/* 157 */         CubeListBuilder.create().texOffs(40, 6).addBox(-2.0F, -1.5045F, -2.4584F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 158 */         PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 159 */     return LayerDefinition.create(meshdefinition, 128, 128);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 165 */     this.Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 166 */     this.Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 167 */     this.Tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 168 */     this.LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 169 */     this.RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 170 */     this.LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 171 */     this.RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */   
/*     */   public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
/* 175 */     this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + 3.1415927F) * limbSwingAmount;
/* 176 */     this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
/* 177 */     this.Head.yRot = netHeadYaw / 57.295776F;
/* 178 */     this.Head.xRot = headPitch / 57.295776F;
/* 179 */     this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
/* 180 */     this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\client\model\Modelnxt_hertx_model.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */