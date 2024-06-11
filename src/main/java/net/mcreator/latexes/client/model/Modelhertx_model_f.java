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
/*     */ public class Modelhertx_model_f<T extends Entity>
/*     */   extends EntityModel<T>
/*     */ {
/*  25 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("latex", "modelhertx_model_f"), "main");
/*     */   public final ModelPart Head;
/*     */   public final ModelPart Body;
/*     */   public final ModelPart Tail;
/*     */   public final ModelPart LeftArm;
/*     */   public final ModelPart RightArm;
/*     */   public final ModelPart LeftLeg;
/*     */   public final ModelPart RightLeg;
/*     */   
/*     */   public Modelhertx_model_f(ModelPart root) {
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
/*  48 */         CubeListBuilder.create().texOffs(24, 16).addBox(-3.0F, -3.7F, -4.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(19, 7)
/*  49 */         .addBox(-2.0F, -4.8F, -3.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(61, 47)
/*  50 */         .addBox(-2.0F, -8.8F, 2.0F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(20, 16)
/*  51 */         .addBox(-2.0F, -4.8F, 3.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(37, 0)
/*  52 */         .addBox(-3.0F, -4.8F, 2.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 24)
/*  53 */         .addBox(-3.0F, -2.8F, -2.9F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(7, 0)
/*  54 */         .addBox(2.0F, -8.8F, 2.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
/*  55 */         .addBox(-3.0F, -8.8F, 2.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 0)
/*  56 */         .addBox(-3.0F, -8.8F, -4.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(24, 57)
/*  57 */         .addBox(2.0F, -7.8F, -4.0F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 60)
/*  58 */         .addBox(2.0F, -4.7F, -4.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(55, 55)
/*  59 */         .addBox(-3.0F, -7.8F, -4.0F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(59, 40)
/*  60 */         .addBox(-3.0F, -4.7F, -4.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 8)
/*  61 */         .addBox(-2.0F, -7.8F, -4.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 32)
/*  62 */         .addBox(-2.0F, -4.7F, -4.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  63 */         PartPose.offset(0.0F, 0.4F, -0.2F));
/*  64 */     PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1", 
/*  65 */         CubeListBuilder.create().texOffs(24, 24).addBox(-3.0625F, -7.4142F, 10.2505F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
/*  66 */         .texOffs(0, 16).addBox(-3.25F, -6.1184F, 8.7739F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 23)
/*  67 */         .addBox(-3.0625F, -7.4142F, 4.2505F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
/*  68 */         .addBox(-3.25F, -6.1184F, 3.7739F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(19, 7)
/*  69 */         .addBox(2.0625F, -7.4142F, 10.2505F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 2)
/*  70 */         .addBox(2.25F, -6.0861F, 8.8946F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 51)
/*  71 */         .addBox(2.0625F, -7.4142F, 4.2505F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(62, 18)
/*  72 */         .addBox(2.25F, -6.0861F, 3.8946F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), 
/*  73 */         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2618F, 0.0F, 0.0F));
/*  74 */     PartDefinition Body = partdefinition.addOrReplaceChild("Body", 
/*  75 */         CubeListBuilder.create().texOffs(0, 16).addBox(-4.0F, -1.8F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 14)
/*  76 */         .addBox(-3.0F, 4.0125F, -2.5F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 0)
/*  77 */         .addBox(-1.0F, -0.9875F, -2.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  78 */         PartPose.offset(0.0F, 0.0F, 0.0F));
/*  79 */     PartDefinition bone = Body.addOrReplaceChild("bone", 
/*  80 */         CubeListBuilder.create().texOffs(30, 31).addBox(-4.0F, -1.9089F, -1.4473F, 8.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), 
/*  81 */         PartPose.offsetAndRotation(0.0F, 1.7F, -2.0F, -0.637F, 0.0F, 0.0F));
/*  82 */     PartDefinition Tail = partdefinition.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
/*  83 */     PartDefinition cube_r2 = Tail.addOrReplaceChild("cube_r2", 
/*  84 */         CubeListBuilder.create().texOffs(17, 31).addBox(-1.3F, 11.3026F, 15.6391F, 3.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), 
/*  85 */         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/*  86 */     PartDefinition cube_r3 = Tail.addOrReplaceChild("cube_r3", 
/*  87 */         CubeListBuilder.create().texOffs(0, 0).addBox(-1.3F, 4.2F, 7.0F, 3.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)), 
/*  88 */         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
/*     */     
/*  90 */     PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", 
/*  91 */         CubeListBuilder.create().texOffs(10, 55).addBox(-2.0F, -3.8F, -2.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F))
/*  92 */         .texOffs(33, 38).addBox(-3.0F, 3.2F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  93 */         PartPose.offset(-5.0F, 2.0F, 0.0F));
/*     */     
/*  95 */     PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", 
/*  96 */         CubeListBuilder.create().texOffs(0, 48).addBox(-1.0F, -3.8F, -2.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F))
/*  97 */         .texOffs(0, 32).addBox(-1.0F, 3.2F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  98 */         PartPose.offset(5.0F, 2.0F, 0.0F));
/*  99 */     PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", 
/* 100 */         CubeListBuilder.create().texOffs(38, 60).addBox(-2.0F, -1.8F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
/* 101 */         .texOffs(23, 50).addBox(-2.0F, 10.0F, -2.9102F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 102 */         PartPose.offset(-2.0F, 12.0F, 0.0F));
/* 103 */     PartDefinition cube_r4 = LeftLeg.addOrReplaceChild("cube_r4", 
/* 104 */         CubeListBuilder.create().texOffs(55, 9).addBox(-2.0F, 4.3F, 3.0F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 105 */         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 106 */     PartDefinition cube_r5 = LeftLeg.addOrReplaceChild("cube_r5", 
/* 107 */         CubeListBuilder.create().texOffs(12, 41).addBox(-2.0F, 0.0F, -5.8F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 108 */         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
/* 109 */     PartDefinition cube_r6 = LeftLeg.addOrReplaceChild("cube_r6", 
/* 110 */         CubeListBuilder.create().texOffs(45, 46).addBox(-2.0F, -0.6F, -2.2F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 111 */         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 112 */     PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", 
/* 113 */         CubeListBuilder.create().texOffs(49, 40).addBox(-2.0F, -1.8F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
/* 114 */         .texOffs(47, 33).addBox(-2.0F, 10.0F, -2.9102F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 115 */         PartPose.offset(2.0F, 12.0F, 0.0F));
/* 116 */     PartDefinition cube_r7 = RightLeg.addOrReplaceChild("cube_r7", 
/* 117 */         CubeListBuilder.create().texOffs(55, 0).addBox(-2.0F, 4.3F, 3.0F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 118 */         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 119 */     PartDefinition cube_r8 = RightLeg.addOrReplaceChild("cube_r8", 
/* 120 */         CubeListBuilder.create().texOffs(39, 3).addBox(-2.0F, 0.0F, -5.8F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 121 */         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
/* 122 */     PartDefinition cube_r9 = RightLeg.addOrReplaceChild("cube_r9", 
/* 123 */         CubeListBuilder.create().texOffs(44, 19).addBox(-2.0F, -0.6F, -2.2F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 124 */         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 125 */     return LayerDefinition.create(meshdefinition, 128, 128);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 131 */     this.Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 132 */     this.Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 133 */     this.Tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 134 */     this.LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 135 */     this.RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 136 */     this.LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 137 */     this.RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */   
/*     */   public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
/* 141 */     this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + 3.1415927F) * limbSwingAmount;
/* 142 */     this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
/* 143 */     this.Head.yRot = netHeadYaw / 57.295776F;
/* 144 */     this.Head.xRot = headPitch / 57.295776F;
/* 145 */     this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
/* 146 */     this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\client\model\Modelhertx_model_f.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */