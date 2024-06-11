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
/*     */ public class Modella_4_tankmorph_model_r<T extends Entity>
/*     */   extends EntityModel<T>
/*     */ {
/*  25 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("latex", "modella_4_tankmorph_model_r"), "main");
/*     */   
/*     */   public final ModelPart Head;
/*     */   public final ModelPart Body;
/*     */   public final ModelPart Cannon;
/*     */   public final ModelPart LeftArm;
/*     */   public final ModelPart RightArm;
/*     */   public final ModelPart LeftLeg;
/*     */   public final ModelPart RightLeg;
/*     */   
/*     */   public Modella_4_tankmorph_model_r(ModelPart root) {
/*  36 */     this.Head = root.getChild("Head");
/*  37 */     this.Body = root.getChild("Body");
/*  38 */     this.Cannon = root.getChild("Cannon");
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
/*  49 */         CubeListBuilder.create().texOffs(52, 81).addBox(-4.0F, -10.0F, -3.5F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(46, 34)
/*  50 */         .addBox(-0.1F, -6.5F, -3.75F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 46)
/*  51 */         .addBox(-4.5F, -4.0F, -4.0F, 9.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(20, 63)
/*  52 */         .addBox(-5.0F, -2.5F, -4.5F, 10.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(26, 99)
/*  53 */         .addBox(0.5F, -1.5F, 3.0F, 5.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)), 
/*  54 */         PartPose.offset(0.0F, -33.0F, 0.0F));
/*  55 */     PartDefinition bone = Head.addOrReplaceChild("bone", 
/*  56 */         CubeListBuilder.create().texOffs(96, 101).addBox(8.1676F, -31.6354F, -2.5F, 3.0F, 5.0F, 5.0F, new CubeDeformation(0.0F))
/*  57 */         .texOffs(22, 42).addBox(10.0212F, -31.0701F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 105)
/*  58 */         .addBox(11.1676F, -31.6354F, -2.5F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), 
/*  59 */         PartPose.offsetAndRotation(0.0F, 22.6F, 0.5F, 0.0F, 0.0F, -0.1745F));
/*  60 */     PartDefinition bone3 = Head.addOrReplaceChild("bone3", 
/*  61 */         CubeListBuilder.create().texOffs(80, 101).addBox(-11.1676F, -31.6354F, -2.5F, 3.0F, 5.0F, 5.0F, new CubeDeformation(0.0F))
/*  62 */         .texOffs(104, 12).addBox(-14.1676F, -31.6354F, -2.5F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(106, 0)
/*  63 */         .addBox(-14.0525F, -30.0704F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  64 */         PartPose.offsetAndRotation(0.0F, 22.6F, 0.5F, 0.0F, 0.0F, 0.1745F));
/*  65 */     PartDefinition Body = partdefinition.addOrReplaceChild("Body", 
/*  66 */         CubeListBuilder.create().texOffs(0, 15).addBox(-9.5F, 0.0F, -2.5F, 19.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(44, 22)
/*  67 */         .addBox(-7.5F, 7.0F, -2.5F, 15.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(60, 34)
/*  68 */         .addBox(-7.0F, 13.0F, -2.5F, 14.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 28)
/*  69 */         .addBox(-8.0F, 19.0F, -3.0F, 16.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), 
/*  70 */         PartPose.offset(0.0F, -33.0F, 0.0F));
/*  71 */     PartDefinition bone2 = Body.addOrReplaceChild("bone2", 
/*  72 */         CubeListBuilder.create().texOffs(0, 0).addBox(-8.5F, -18.8747F, 7.5115F, 17.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)), 
/*  73 */         PartPose.offsetAndRotation(0.0F, 25.0F, -0.5F, 0.7418F, 0.0F, 0.0F));
/*  74 */     PartDefinition Cannon = partdefinition.addOrReplaceChild("Cannon", 
/*  75 */         CubeListBuilder.create().texOffs(94, 57).addBox(-9.0F, 2.5F, 2.25F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(42, 0)
/*  76 */         .addBox(-8.0F, -1.5F, 3.75F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(50, 97)
/*  77 */         .addBox(-7.5F, -21.5F, 4.75F, 3.0F, 20.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(106, 69)
/*  78 */         .addBox(-8.5F, 8.5F, 4.25F, 5.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(34, 42).addBox(-8.5F, 8.5F, 3.25F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), 
/*     */         
/*  80 */         PartPose.offsetAndRotation(-1.0F, -30.0F, -5.25F, 1.5708F, 0.0F, 0.0F));
/*  81 */     PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", 
/*  82 */         CubeListBuilder.create().texOffs(95, 48).addBox(-5.45F, -5.75F, -2.0F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(84, 84)
/*  83 */         .addBox(-5.45F, -3.75F, -2.0F, 6.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(88, 75)
/*  84 */         .addBox(-4.95F, 7.25F, -2.5F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 70).addBox(-5.95F, 8.25F, -2.5F, 7.0F, 17.0F, 6.0F, new CubeDeformation(0.0F)), 
/*     */         
/*  86 */         PartPose.offsetAndRotation(-9.0F, -31.0F, -2.0F, -1.5708F, 0.0F, 0.0F));
/*  87 */     PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", 
/*  88 */         CubeListBuilder.create().texOffs(84, 0).addBox(0.45F, -3.75F, -3.0F, 6.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(101, 82)
/*  89 */         .addBox(2.45F, -5.75F, -3.0F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(94, 29)
/*  90 */         .addBox(-0.05F, 7.25F, -3.5F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(26, 76)
/*  91 */         .addBox(-0.05F, 8.25F, -3.5F, 7.0F, 17.0F, 6.0F, new CubeDeformation(0.0F)), 
/*  92 */         PartPose.offset(9.0F, -29.0F, 1.0F));
/*  93 */     PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", 
/*  94 */         CubeListBuilder.create().texOffs(86, 17).addBox(-5.0F, -4.0F, -3.5F, 5.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(95, 38)
/*  95 */         .addBox(0.0F, -2.0F, -3.5F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(50, 0)
/*  96 */         .addBox(-5.0F, 0.0F, -3.5F, 9.0F, 13.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(38, 38)
/*  97 */         .addBox(-3.0F, 13.0F, -3.5F, 7.0F, 17.0F, 8.0F, new CubeDeformation(0.0F)), 
/*  98 */         PartPose.offset(-4.0F, -8.0F, 0.0F));
/*  99 */     PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", 
/* 100 */         CubeListBuilder.create().texOffs(0, 93).addBox(0.0F, -4.0F, -3.5F, 5.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(60, 97)
/* 101 */         .addBox(-2.0F, -2.0F, -3.5F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(60, 60)
/* 102 */         .addBox(-4.0F, 0.0F, -3.5F, 9.0F, 13.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 42)
/* 103 */         .addBox(-4.0F, 13.0F, -3.5F, 7.0F, 17.0F, 8.0F, new CubeDeformation(0.0F)), 
/* 104 */         PartPose.offset(4.0F, -8.0F, 0.0F));
/* 105 */     return LayerDefinition.create(meshdefinition, 128, 128);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 111 */     this.Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 112 */     this.Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 113 */     this.Cannon.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 114 */     this.LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 115 */     this.RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 116 */     this.LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 117 */     this.RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */   
/*     */   public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
/* 121 */     this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + 3.1415927F) * limbSwingAmount;
/* 122 */     this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
/* 123 */     this.Head.yRot = netHeadYaw / 57.295776F;
/* 124 */     this.Head.xRot = headPitch / 57.295776F;
/* 125 */     this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\client\model\Modella_4_tankmorph_model_r.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */