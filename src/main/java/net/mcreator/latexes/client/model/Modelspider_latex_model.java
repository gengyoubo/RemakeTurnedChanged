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
/*     */ public class Modelspider_latex_model<T extends Entity>
/*     */   extends EntityModel<T>
/*     */ {
/*  25 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("latex", "modelspider_latex_model"), "main");
/*     */   public final ModelPart Head;
/*     */   public final ModelPart Body;
/*     */   public final ModelPart LeftArm;
/*     */   public final ModelPart RightArm;
/*     */   public final ModelPart LowerBody;
/*     */   public final ModelPart Rightleg;
/*     */   public final ModelPart Leftleg;
/*     */   
/*     */   public Modelspider_latex_model(ModelPart root) {
/*  35 */     this.Head = root.getChild("Head");
/*  36 */     this.Body = root.getChild("Body");
/*  37 */     this.LeftArm = root.getChild("LeftArm");
/*  38 */     this.RightArm = root.getChild("RightArm");
/*  39 */     this.LowerBody = root.getChild("LowerBody");
/*  40 */     this.Rightleg = root.getChild("Rightleg");
/*  41 */     this.Leftleg = root.getChild("Leftleg");
/*     */   }
/*     */   
/*     */   public static LayerDefinition createBodyLayer() {
/*  45 */     MeshDefinition meshdefinition = new MeshDefinition();
/*  46 */     PartDefinition partdefinition = meshdefinition.getRoot();
/*  47 */     PartDefinition Head = partdefinition.addOrReplaceChild("Head", 
/*  48 */         CubeListBuilder.create().texOffs(26, 31).addBox(-4.0F, -8.0F, -3.75F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), 
/*  49 */         PartPose.offset(0.0F, 0.0F, -4.5F));
/*  50 */     PartDefinition bone9 = Head.addOrReplaceChild("bone9", 
/*  51 */         CubeListBuilder.create().texOffs(46, 64).addBox(-4.0F, -3.0F, -5.25F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), 
/*  52 */         PartPose.offsetAndRotation(0.5F, 0.0F, 0.25F, 0.0F, 0.0F, -0.1745F));
/*  53 */     PartDefinition bone10 = Head.addOrReplaceChild("bone10", 
/*  54 */         CubeListBuilder.create().texOffs(0, 24).addBox(-3.9248F, -1.9978F, -5.25F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), 
/*  55 */         PartPose.offsetAndRotation(5.5F, 0.0F, 0.25F, 0.0F, 0.0F, 0.1745F));
/*     */     
/*  57 */     PartDefinition Body = partdefinition.addOrReplaceChild("Body", 
/*  58 */         CubeListBuilder.create().texOffs(54, 54).addBox(-4.5F, 0.0F, -1.75F, 9.0F, 7.0F, 4.0F, new CubeDeformation(0.0F))
/*  59 */         .texOffs(0, 39).addBox(-4.0F, 7.0F, -1.25F, 8.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), 
/*  60 */         PartPose.offset(0.0F, 0.0F, -4.5F));
/*  61 */     PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", 
/*  62 */         CubeListBuilder.create().texOffs(32, 64).addBox(-2.0F, -2.0F, -1.75F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F))
/*  63 */         .texOffs(16, 63).addBox(-3.0F, 5.0F, -1.75F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  64 */         PartPose.offset(-5.5F, 2.0F, -4.5F));
/*     */     
/*  66 */     PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", 
/*  67 */         CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -2.0F, -1.75F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F))
/*  68 */         .texOffs(0, 63).addBox(-1.0F, 5.0F, -1.75F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  69 */         PartPose.offset(5.5F, 2.0F, -4.5F));
/*  70 */     PartDefinition LowerBody = partdefinition.addOrReplaceChild("LowerBody", 
/*  71 */         CubeListBuilder.create().texOffs(0, 24).addBox(-4.5F, 14.0F, -2.75F, 9.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(58, 24)
/*  72 */         .addBox(-3.5F, 15.0F, -3.75F, 7.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
/*  73 */         .addBox(-6.0F, 12.25F, 10.25F, 12.0F, 10.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(58, 36)
/*  74 */         .addBox(-5.0F, 13.25F, 24.25F, 10.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 53)
/*  75 */         .addBox(-4.0F, 14.5F, 5.25F, 8.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 53)
/*  76 */         .addBox(-4.0F, 12.0F, -2.25F, 8.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), 
/*  77 */         PartPose.offset(0.0F, 0.0F, -4.5F));
/*  78 */     PartDefinition Rightleg = partdefinition.addOrReplaceChild("Rightleg", CubeListBuilder.create(), 
/*  79 */         PartPose.offsetAndRotation(2.0F, 18.75F, -1.25F, 0.0F, 0.0F, 0.3927F));
/*  80 */     PartDefinition bone = Rightleg.addOrReplaceChild("bone", 
/*  81 */         CubeListBuilder.create().texOffs(52, 12).addBox(2.4476F, 6.0F, -0.7907F, 13.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), 
/*  82 */         PartPose.offsetAndRotation(-1.3886F, -7.2722F, 2.25F, 0.0F, -0.3927F, 0.0F));
/*  83 */     PartDefinition bone2 = Rightleg.addOrReplaceChild("bone2", 
/*  84 */         CubeListBuilder.create().texOffs(52, 18).addBox(2.9791F, 6.0F, -1.2044F, 13.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), 
/*  85 */         PartPose.offsetAndRotation(-1.8109F, -7.6384F, 0.25F, 0.0F, -0.1745F, 0.0F));
/*  86 */     PartDefinition bone3 = Rightleg.addOrReplaceChild("bone3", 
/*  87 */         CubeListBuilder.create().texOffs(32, 47).addBox(3.5559F, 4.5941F, -3.8746F, 13.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), 
/*  88 */         PartPose.offsetAndRotation(-1.8886F, -6.2721F, 1.75F, 0.0F, 0.1745F, 0.0F));
/*  89 */     PartDefinition bone4 = Rightleg.addOrReplaceChild("bone4", 
/*  90 */         CubeListBuilder.create().texOffs(50, 30).addBox(4.0929F, 4.6898F, -3.8044F, 13.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), 
/*  91 */         PartPose.offsetAndRotation(-1.8886F, -6.2722F, -0.25F, 0.0F, 0.3927F, 0.0F));
/*  92 */     PartDefinition Leftleg = partdefinition.addOrReplaceChild("Leftleg", CubeListBuilder.create(), 
/*  93 */         PartPose.offsetAndRotation(-2.0F, 18.75F, -1.25F, 0.0F, 0.0F, -0.3927F));
/*  94 */     PartDefinition bone5 = Leftleg.addOrReplaceChild("bone5", 
/*  95 */         CubeListBuilder.create().texOffs(0, 47).addBox(-15.4476F, 6.0F, -0.7907F, 13.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), 
/*  96 */         PartPose.offsetAndRotation(1.3886F, -7.2722F, 2.25F, 0.0F, 0.3927F, 0.0F));
/*  97 */     PartDefinition bone6 = Leftleg.addOrReplaceChild("bone6", 
/*  98 */         CubeListBuilder.create().texOffs(38, 6).addBox(-15.9791F, 6.0F, -1.2044F, 13.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), 
/*  99 */         PartPose.offsetAndRotation(1.8109F, -7.6384F, 0.25F, 0.0F, 0.1745F, 0.0F));
/* 100 */     PartDefinition bone7 = Leftleg.addOrReplaceChild("bone7", 
/* 101 */         CubeListBuilder.create().texOffs(38, 0).addBox(-16.5559F, 4.5941F, -3.8746F, 13.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 102 */         PartPose.offsetAndRotation(1.8886F, -6.2721F, 1.75F, 0.0F, -0.1745F, 0.0F));
/* 103 */     PartDefinition bone8 = Leftleg.addOrReplaceChild("bone8", 
/* 104 */         CubeListBuilder.create().texOffs(26, 24).addBox(-17.0929F, 4.6898F, -3.8044F, 13.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 105 */         PartPose.offsetAndRotation(1.8886F, -6.2722F, -0.25F, 0.0F, -0.3927F, 0.0F));
/* 106 */     return LayerDefinition.create(meshdefinition, 96, 96);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 112 */     this.Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 113 */     this.Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 114 */     this.LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 115 */     this.RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 116 */     this.LowerBody.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 117 */     this.Rightleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 118 */     this.Leftleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */   
/*     */   public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
/* 122 */     this.RightArm.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
/* 123 */     this.Leftleg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
/* 124 */     this.Head.yRot = netHeadYaw / 57.295776F;
/* 125 */     this.Head.xRot = headPitch / 57.295776F;
/* 126 */     this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
/* 127 */     this.Rightleg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\client\model\Modelspider_latex_model.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */