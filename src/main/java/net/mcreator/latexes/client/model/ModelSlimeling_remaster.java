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
/*     */ public class ModelSlimeling_remaster<T extends Entity>
/*     */   extends EntityModel<T>
/*     */ {
/*  25 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("latex", "model_slimeling_remaster"), "main");
/*     */   public final ModelPart RightLeg;
/*     */   public final ModelPart LeftLeg;
/*     */   public final ModelPart RightArm;
/*     */   public final ModelPart LeftArm;
/*     */   public final ModelPart Body;
/*     */   public final ModelPart Head;
/*     */   
/*     */   public ModelSlimeling_remaster(ModelPart root) {
/*  34 */     this.RightLeg = root.getChild("RightLeg");
/*  35 */     this.LeftLeg = root.getChild("LeftLeg");
/*  36 */     this.RightArm = root.getChild("RightArm");
/*  37 */     this.LeftArm = root.getChild("LeftArm");
/*  38 */     this.Body = root.getChild("Body");
/*  39 */     this.Head = root.getChild("Head");
/*     */   }
/*     */   
/*     */   public static LayerDefinition createBodyLayer() {
/*  43 */     MeshDefinition meshdefinition = new MeshDefinition();
/*  44 */     PartDefinition partdefinition = meshdefinition.getRoot();
/*  45 */     PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", 
/*  46 */         CubeListBuilder.create().texOffs(61, 0).addBox(-0.75F, 11.9896F, -2.7744F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
/*  47 */         .texOffs(8, 50).addBox(-0.75F, 12.9896F, -3.7744F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  48 */         PartPose.offset(2.0F, 9.0F, 0.0F));
/*  49 */     PartDefinition cube_r11 = RightLeg.addOrReplaceChild("cube_r11", 
/*  50 */         CubeListBuilder.create().texOffs(47, 58).addBox(-2.0F, -1.0F, -1.0F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/*  51 */         PartPose.offsetAndRotation(1.25F, 10.0398F, 2.347F, -0.7854F, 0.0F, 0.0F));
/*  52 */     PartDefinition cube_r12 = RightLeg.addOrReplaceChild("cube_r12", 
/*  53 */         CubeListBuilder.create().texOffs(24, 55).addBox(-2.0F, 0.0F, -2.0F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  54 */         PartPose.offsetAndRotation(1.625F, 7.6F, 0.0F, 0.3927F, 0.0F, 0.0F));
/*  55 */     PartDefinition cube_r13 = RightLeg.addOrReplaceChild("cube_r13", 
/*  56 */         CubeListBuilder.create().texOffs(56, 6).addBox(-1.625F, -4.0F, -2.375F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), 
/*  57 */         PartPose.offsetAndRotation(1.0F, 2.85F, 0.0F, -0.0436F, 0.0F, 0.0F));
/*  58 */     PartDefinition cube_r14 = RightLeg.addOrReplaceChild("cube_r14", 
/*  59 */         CubeListBuilder.create().texOffs(0, 40).addBox(-1.625F, -3.0F, -2.375F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), 
/*  60 */         PartPose.offsetAndRotation(0.375F, 2.475F, 0.0F, -0.0436F, 0.0F, 0.0F));
/*  61 */     PartDefinition cube_r15 = RightLeg.addOrReplaceChild("cube_r15", 
/*  62 */         CubeListBuilder.create().texOffs(18, 43).addBox(0.375F, -5.0F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  63 */         PartPose.offsetAndRotation(-1.25F, 5.6F, 0.0F, -0.1309F, 0.0F, 0.0F));
/*  64 */     PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", 
/*  65 */         CubeListBuilder.create().texOffs(56, 40).addBox(-3.25F, 11.9896F, -2.7744F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
/*  66 */         .texOffs(47, 18).addBox(-3.25F, 12.9896F, -3.7744F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  67 */         PartPose.offset(-2.0F, 9.0F, 0.0F));
/*  68 */     PartDefinition cube_r6 = LeftLeg.addOrReplaceChild("cube_r6", 
/*  69 */         CubeListBuilder.create().texOffs(52, 18).addBox(-1.375F, -4.0F, -2.375F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), 
/*  70 */         PartPose.offsetAndRotation(-1.0F, 2.85F, 0.0F, -0.0436F, 0.0F, 0.0F));
/*  71 */     PartDefinition cube_r7 = LeftLeg.addOrReplaceChild("cube_r7", 
/*  72 */         CubeListBuilder.create().texOffs(54, 31).addBox(-2.0F, -1.0F, -1.0F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/*  73 */         PartPose.offsetAndRotation(-1.25F, 10.0398F, 2.347F, -0.7854F, 0.0F, 0.0F));
/*  74 */     PartDefinition cube_r8 = LeftLeg.addOrReplaceChild("cube_r8", 
/*  75 */         CubeListBuilder.create().texOffs(10, 55).addBox(-1.0F, 0.0F, -2.0F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  76 */         PartPose.offsetAndRotation(-1.625F, 7.6F, 0.0F, 0.3927F, 0.0F, 0.0F));
/*  77 */     PartDefinition cube_r9 = LeftLeg.addOrReplaceChild("cube_r9", 
/*  78 */         CubeListBuilder.create().texOffs(34, 17).addBox(-2.375F, -3.0F, -2.375F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), 
/*  79 */         PartPose.offsetAndRotation(-0.375F, 2.475F, 0.0F, -0.0436F, 0.0F, 0.0F));
/*  80 */     PartDefinition cube_r10 = LeftLeg.addOrReplaceChild("cube_r10", 
/*  81 */         CubeListBuilder.create().texOffs(38, 28).addBox(-4.375F, -5.0F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  82 */         PartPose.offsetAndRotation(1.25F, 5.6F, 0.0F, -0.1309F, 0.0F, 0.0F));
/*  83 */     PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", 
/*  84 */         CubeListBuilder.create().texOffs(35, 61).addBox(-1.1736F, -1.4152F, -1.5F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/*  85 */         PartPose.offsetAndRotation(5.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1745F));
/*  86 */     PartDefinition wrist_r = RightArm.addOrReplaceChild("wrist_r", 
/*  87 */         CubeListBuilder.create().texOffs(14, 27).addBox(-1.3F, 7.3F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(27, 17)
/*  88 */         .addBox(0.7F, 7.3F, 1.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 30)
/*  89 */         .addBox(0.7F, 7.3F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 30)
/*  90 */         .addBox(0.7F, 7.3F, -1.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 48)
/*  91 */         .addBox(-1.3F, 0.3F, -1.8F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  92 */         PartPose.offset(0.1263F, 4.2848F, -0.2F));
/*  93 */     PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", 
/*  94 */         CubeListBuilder.create().texOffs(0, 61).addBox(-1.8264F, -1.4152F, -1.5F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/*  95 */         PartPose.offsetAndRotation(-5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1745F));
/*  96 */     PartDefinition wrist_l = LeftArm.addOrReplaceChild("wrist_l", 
/*  97 */         CubeListBuilder.create().texOffs(45, 0).addBox(-2.7F, 0.3F, -1.8F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 27)
/*  98 */         .addBox(0.3F, 7.3F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(21, 13)
/*  99 */         .addBox(-2.7F, 7.3F, -1.8F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 18)
/* 100 */         .addBox(-2.7F, 7.3F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 0)
/* 101 */         .addBox(-2.7F, 7.3F, 1.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 102 */         PartPose.offset(-0.1263F, 4.2848F, -0.2F));
/* 103 */     PartDefinition Body = partdefinition.addOrReplaceChild("Body", 
/* 104 */         CubeListBuilder.create().texOffs(19, 0).addBox(-4.0F, 1.6F, -2.5F, 8.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(61, 58)
/* 105 */         .addBox(-2.0F, -0.9F, -1.375F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 27)
/* 106 */         .addBox(2.0F, -0.4F, -3.875F, 3.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 50)
/* 107 */         .addBox(5.0F, 0.6F, -2.875F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(48, 42)
/* 108 */         .addBox(-6.0F, 0.6F, -2.875F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(50, 51)
/* 109 */         .addBox(-3.0F, 0.85F, -3.375F, 6.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(20, 19)
/* 110 */         .addBox(-5.0F, -0.4F, -3.875F, 3.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(50, 25)
/* 111 */         .addBox(-4.0F, 0.35F, 2.0F, 8.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(47, 13)
/* 112 */         .addBox(-3.5F, 12.6F, -1.875F, 7.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(25, 10)
/* 113 */         .addBox(-3.5F, 10.6F, -2.0F, 7.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(34, 40)
/* 114 */         .addBox(-3.0F, 6.6F, -2.0F, 6.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 115 */         PartPose.offset(0.0F, -3.0F, 0.0F));
/* 116 */     PartDefinition cube_r2 = Body.addOrReplaceChild("cube_r2", 
/* 117 */         CubeListBuilder.create().texOffs(62, 46).addBox(-3.0F, -3.0F, 1.0F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 118 */         PartPose.offsetAndRotation(0.5F, 5.4422F, 0.6788F, -0.4363F, 0.0F, 0.0F));
/* 119 */     PartDefinition cube_r3 = Body.addOrReplaceChild("cube_r3", 
/* 120 */         CubeListBuilder.create().texOffs(61, 63).addBox(-3.0F, -3.0F, 1.0F, 5.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 121 */         PartPose.offsetAndRotation(0.5F, 9.1922F, 0.4288F, 0.1745F, 0.0F, 0.0F));
/* 122 */     PartDefinition Tail = Body.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offset(0.0F, 2.6F, 0.0F));
/* 123 */     PartDefinition cube_r4 = Tail.addOrReplaceChild("cube_r4", 
/* 124 */         CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -0.875F, -5.375F, 4.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), 
/* 125 */         PartPose.offsetAndRotation(0.0F, 17.3866F, 11.9212F, -0.5236F, 0.0F, 0.0F));
/* 126 */     PartDefinition cube_r5 = Tail.addOrReplaceChild("cube_r5", 
/* 127 */         CubeListBuilder.create().texOffs(14, 32).addBox(-2.0F, 5.0F, 8.0F, 4.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), 
/* 128 */         PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
/* 129 */     PartDefinition Head = partdefinition.addOrReplaceChild("Head", 
/* 130 */         CubeListBuilder.create().texOffs(0, 13).addBox(-3.5F, -5.4F, -3.5F, 7.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), 
/* 131 */         PartPose.offset(0.0F, -4.0F, 0.0F));
/* 132 */     PartDefinition Ears = Head.addOrReplaceChild("Ears", CubeListBuilder.create(), PartPose.offset(0.0F, 1.6F, 0.0F));
/* 133 */     PartDefinition cube_r1 = Ears.addOrReplaceChild("cube_r1", 
/* 134 */         CubeListBuilder.create().texOffs(6, 8).addBox(3.5F, -11.0F, 1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 2)
/* 135 */         .addBox(3.5F, -9.0F, 1.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 64)
/* 136 */         .addBox(3.5F, -12.0F, -0.5F, 1.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 13)
/* 137 */         .addBox(3.5F, -6.0F, 1.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(19, 0)
/* 138 */         .addBox(-4.5F, -11.0F, 1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 5)
/* 139 */         .addBox(-4.5F, -9.0F, 1.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(21, 15)
/* 140 */         .addBox(-4.5F, -6.0F, 1.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-4.5F, -12.0F, -0.5F, 1.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), 
/*     */         
/* 142 */         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3927F, 0.0F, 0.0F));
/* 143 */     return LayerDefinition.create(meshdefinition, 80, 80);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 149 */     this.RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 150 */     this.LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 151 */     this.RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 152 */     this.LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 153 */     this.Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 154 */     this.Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */   
/*     */   public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
/* 158 */     this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
/* 159 */     this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + 3.1415927F) * limbSwingAmount;
/* 160 */     this.Head.yRot = netHeadYaw / 57.295776F;
/* 161 */     this.Head.xRot = headPitch / 57.295776F;
/* 162 */     this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
/* 163 */     this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\client\model\ModelSlimeling_remaster.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */