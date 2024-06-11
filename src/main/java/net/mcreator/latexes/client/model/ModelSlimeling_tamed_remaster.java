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
/*     */ public class ModelSlimeling_tamed_remaster<T extends Entity>
/*     */   extends EntityModel<T>
/*     */ {
/*  25 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("latex", "model_slimeling_tamed_remaster"), "main");
/*     */   
/*     */   public final ModelPart RightLeg;
/*     */   public final ModelPart LeftLeg;
/*     */   public final ModelPart RightArm;
/*     */   public final ModelPart LeftArm;
/*     */   public final ModelPart Body;
/*     */   public final ModelPart Head;
/*     */   
/*     */   public ModelSlimeling_tamed_remaster(ModelPart root) {
/*  35 */     this.RightLeg = root.getChild("RightLeg");
/*  36 */     this.LeftLeg = root.getChild("LeftLeg");
/*  37 */     this.RightArm = root.getChild("RightArm");
/*  38 */     this.LeftArm = root.getChild("LeftArm");
/*  39 */     this.Body = root.getChild("Body");
/*  40 */     this.Head = root.getChild("Head");
/*     */   }
/*     */   
/*     */   public static LayerDefinition createBodyLayer() {
/*  44 */     MeshDefinition meshdefinition = new MeshDefinition();
/*  45 */     PartDefinition partdefinition = meshdefinition.getRoot();
/*  46 */     PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", 
/*  47 */         CubeListBuilder.create().texOffs(61, 0).addBox(-0.75F, 11.9896F, -2.7744F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
/*  48 */         .texOffs(8, 50).addBox(-0.75F, 12.9896F, -3.7744F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  49 */         PartPose.offset(2.0F, 9.0F, 0.0F));
/*  50 */     PartDefinition cube_r11 = RightLeg.addOrReplaceChild("cube_r11", 
/*  51 */         CubeListBuilder.create().texOffs(47, 58).addBox(-2.0F, -1.0F, -1.0F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/*  52 */         PartPose.offsetAndRotation(1.25F, 10.0398F, 2.347F, -0.7854F, 0.0F, 0.0F));
/*  53 */     PartDefinition cube_r12 = RightLeg.addOrReplaceChild("cube_r12", 
/*  54 */         CubeListBuilder.create().texOffs(24, 55).addBox(-2.0F, 0.0F, -2.0F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  55 */         PartPose.offsetAndRotation(1.625F, 7.6F, 0.0F, 0.3927F, 0.0F, 0.0F));
/*  56 */     PartDefinition cube_r13 = RightLeg.addOrReplaceChild("cube_r13", 
/*  57 */         CubeListBuilder.create().texOffs(56, 6).addBox(-1.625F, -4.0F, -2.375F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), 
/*  58 */         PartPose.offsetAndRotation(1.0F, 2.85F, 0.0F, -0.0436F, 0.0F, 0.0F));
/*  59 */     PartDefinition cube_r14 = RightLeg.addOrReplaceChild("cube_r14", 
/*  60 */         CubeListBuilder.create().texOffs(0, 40).addBox(-1.625F, -3.0F, -2.375F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), 
/*  61 */         PartPose.offsetAndRotation(0.375F, 2.475F, 0.0F, -0.0436F, 0.0F, 0.0F));
/*  62 */     PartDefinition cube_r15 = RightLeg.addOrReplaceChild("cube_r15", 
/*  63 */         CubeListBuilder.create().texOffs(18, 43).addBox(0.375F, -5.0F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  64 */         PartPose.offsetAndRotation(-1.25F, 5.6F, 0.0F, -0.1309F, 0.0F, 0.0F));
/*  65 */     PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", 
/*  66 */         CubeListBuilder.create().texOffs(56, 40).addBox(-3.25F, 11.9896F, -2.7744F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
/*  67 */         .texOffs(47, 18).addBox(-3.25F, 12.9896F, -3.7744F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  68 */         PartPose.offset(-2.0F, 9.0F, 0.0F));
/*  69 */     PartDefinition cube_r6 = LeftLeg.addOrReplaceChild("cube_r6", 
/*  70 */         CubeListBuilder.create().texOffs(52, 18).addBox(-1.375F, -4.0F, -2.375F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), 
/*  71 */         PartPose.offsetAndRotation(-1.0F, 2.85F, 0.0F, -0.0436F, 0.0F, 0.0F));
/*  72 */     PartDefinition cube_r7 = LeftLeg.addOrReplaceChild("cube_r7", 
/*  73 */         CubeListBuilder.create().texOffs(54, 31).addBox(-2.0F, -1.0F, -1.0F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/*  74 */         PartPose.offsetAndRotation(-1.25F, 10.0398F, 2.347F, -0.7854F, 0.0F, 0.0F));
/*  75 */     PartDefinition cube_r8 = LeftLeg.addOrReplaceChild("cube_r8", 
/*  76 */         CubeListBuilder.create().texOffs(10, 55).addBox(-1.0F, 0.0F, -2.0F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  77 */         PartPose.offsetAndRotation(-1.625F, 7.6F, 0.0F, 0.3927F, 0.0F, 0.0F));
/*  78 */     PartDefinition cube_r9 = LeftLeg.addOrReplaceChild("cube_r9", 
/*  79 */         CubeListBuilder.create().texOffs(34, 17).addBox(-2.375F, -3.0F, -2.375F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), 
/*  80 */         PartPose.offsetAndRotation(-0.375F, 2.475F, 0.0F, -0.0436F, 0.0F, 0.0F));
/*  81 */     PartDefinition cube_r10 = LeftLeg.addOrReplaceChild("cube_r10", 
/*  82 */         CubeListBuilder.create().texOffs(38, 28).addBox(-4.375F, -5.0F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  83 */         PartPose.offsetAndRotation(1.25F, 5.6F, 0.0F, -0.1309F, 0.0F, 0.0F));
/*  84 */     PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", 
/*  85 */         CubeListBuilder.create().texOffs(35, 61).addBox(-1.1736F, -1.4152F, -1.5F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/*  86 */         PartPose.offsetAndRotation(5.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1745F));
/*  87 */     PartDefinition wrist_r = RightArm.addOrReplaceChild("wrist_r", 
/*  88 */         CubeListBuilder.create().texOffs(14, 27).addBox(-1.3F, 7.3F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(27, 17)
/*  89 */         .addBox(0.7F, 7.3F, 1.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 30)
/*  90 */         .addBox(0.7F, 7.3F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 30)
/*  91 */         .addBox(0.7F, 7.3F, -1.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 48)
/*  92 */         .addBox(-1.3F, 0.3F, -1.8F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  93 */         PartPose.offset(0.1263F, 4.2848F, -0.2F));
/*  94 */     PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", 
/*  95 */         CubeListBuilder.create().texOffs(0, 61).addBox(-1.8264F, -1.4152F, -1.5F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/*  96 */         PartPose.offsetAndRotation(-5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1745F));
/*  97 */     PartDefinition wrist_l = LeftArm.addOrReplaceChild("wrist_l", 
/*  98 */         CubeListBuilder.create().texOffs(45, 0).addBox(-2.7F, 0.3F, -1.8F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 27)
/*  99 */         .addBox(0.3F, 7.3F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(21, 13)
/* 100 */         .addBox(-2.7F, 7.3F, -1.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 18)
/* 101 */         .addBox(-2.7F, 7.3F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 0)
/* 102 */         .addBox(-2.7F, 7.3F, 1.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 103 */         PartPose.offset(-0.1263F, 4.2848F, -0.2F));
/* 104 */     PartDefinition Body = partdefinition.addOrReplaceChild("Body", 
/* 105 */         CubeListBuilder.create().texOffs(19, 0).addBox(-4.0F, 1.6F, -2.5F, 8.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(61, 58)
/* 106 */         .addBox(-2.0F, -0.9F, -1.375F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 27)
/* 107 */         .addBox(2.0F, -0.4F, -3.875F, 3.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 50)
/* 108 */         .addBox(5.0F, 0.6F, -2.875F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(48, 42)
/* 109 */         .addBox(-6.0F, 0.6F, -2.875F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(50, 51)
/* 110 */         .addBox(-3.0F, 0.85F, -3.375F, 6.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(20, 19)
/* 111 */         .addBox(-5.0F, -0.4F, -3.875F, 3.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(50, 25)
/* 112 */         .addBox(-4.0F, 0.35F, 2.0F, 8.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(47, 13)
/* 113 */         .addBox(-3.5F, 12.6F, -1.875F, 7.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(25, 10)
/* 114 */         .addBox(-3.5F, 10.6F, -2.0F, 7.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(34, 40)
/* 115 */         .addBox(-3.0F, 6.6F, -2.0F, 6.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 116 */         PartPose.offset(0.0F, -3.0F, 0.0F));
/* 117 */     PartDefinition cube_r2 = Body.addOrReplaceChild("cube_r2", 
/* 118 */         CubeListBuilder.create().texOffs(62, 46).addBox(-3.0F, -3.0F, 1.0F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 119 */         PartPose.offsetAndRotation(0.5F, 5.4422F, 0.6788F, -0.4363F, 0.0F, 0.0F));
/* 120 */     PartDefinition cube_r3 = Body.addOrReplaceChild("cube_r3", 
/* 121 */         CubeListBuilder.create().texOffs(61, 63).addBox(-3.0F, -3.0F, 1.0F, 5.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 122 */         PartPose.offsetAndRotation(0.5F, 9.1922F, 0.4288F, 0.1745F, 0.0F, 0.0F));
/* 123 */     PartDefinition Tail = Body.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offset(0.0F, 2.6F, 0.0F));
/* 124 */     PartDefinition cube_r4 = Tail.addOrReplaceChild("cube_r4", 
/* 125 */         CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -0.875F, -5.375F, 4.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), 
/* 126 */         PartPose.offsetAndRotation(0.0F, 17.3866F, 11.9212F, -0.5236F, 0.0F, 0.0F));
/* 127 */     PartDefinition cube_r5 = Tail.addOrReplaceChild("cube_r5", 
/* 128 */         CubeListBuilder.create().texOffs(14, 32).addBox(-2.0F, 5.0F, 8.0F, 4.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), 
/* 129 */         PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
/* 130 */     PartDefinition Head = partdefinition.addOrReplaceChild("Head", 
/* 131 */         CubeListBuilder.create().texOffs(0, 13).addBox(-3.5F, -5.4F, -3.5F, 7.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), 
/* 132 */         PartPose.offset(0.0F, -4.0F, 0.0F));
/* 133 */     PartDefinition Ears = Head.addOrReplaceChild("Ears", CubeListBuilder.create(), PartPose.offset(0.0F, 1.6F, 0.0F));
/* 134 */     PartDefinition cube_r1 = Ears.addOrReplaceChild("cube_r1", 
/* 135 */         CubeListBuilder.create().texOffs(6, 8).addBox(3.5F, -11.0F, 1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 2)
/* 136 */         .addBox(3.5F, -9.0F, 1.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 64)
/* 137 */         .addBox(3.5F, -12.0F, -0.5F, 1.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 13)
/* 138 */         .addBox(3.5F, -6.0F, 1.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(19, 0)
/* 139 */         .addBox(-4.5F, -11.0F, 1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 5)
/* 140 */         .addBox(-4.5F, -9.0F, 1.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(21, 15)
/* 141 */         .addBox(-4.5F, -6.0F, 1.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-4.5F, -12.0F, -0.5F, 1.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), 
/*     */         
/* 143 */         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3927F, 0.0F, 0.0F));
/* 144 */     return LayerDefinition.create(meshdefinition, 80, 80);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 150 */     this.RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 151 */     this.LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 152 */     this.RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 153 */     this.LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 154 */     this.Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 155 */     this.Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */   
/*     */   public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
/* 159 */     this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
/* 160 */     this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + 3.1415927F) * limbSwingAmount;
/* 161 */     this.Head.yRot = netHeadYaw / 57.295776F;
/* 162 */     this.Head.xRot = headPitch / 57.295776F;
/* 163 */     this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
/* 164 */     this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\client\model\ModelSlimeling_tamed_remaster.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */