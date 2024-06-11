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
/*     */ public class ModelDark_latex_snep<T extends Entity>
/*     */   extends EntityModel<T>
/*     */ {
/*  25 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("latex", "model_dark_latex_snep"), "main");
/*     */   public final ModelPart Head;
/*     */   public final ModelPart Body;
/*     */   public final ModelPart LeftArm;
/*     */   public final ModelPart RightArm;
/*     */   public final ModelPart LeftLeg;
/*     */   public final ModelPart Rightleg;
/*     */   
/*     */   public ModelDark_latex_snep(ModelPart root) {
/*  34 */     this.Head = root.getChild("Head");
/*  35 */     this.Body = root.getChild("Body");
/*  36 */     this.LeftArm = root.getChild("LeftArm");
/*  37 */     this.RightArm = root.getChild("RightArm");
/*  38 */     this.LeftLeg = root.getChild("LeftLeg");
/*  39 */     this.Rightleg = root.getChild("Rightleg");
/*     */   }
/*     */   
/*     */   public static LayerDefinition createBodyLayer() {
/*  43 */     MeshDefinition meshdefinition = new MeshDefinition();
/*  44 */     PartDefinition partdefinition = meshdefinition.getRoot();
/*  45 */     PartDefinition Head = partdefinition.addOrReplaceChild("Head", 
/*  46 */         CubeListBuilder.create().texOffs(52, 18).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 17)
/*  47 */         .addBox(-4.0F, -5.0F, -4.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 31)
/*  48 */         .addBox(-3.0F, -5.0F, -4.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 0)
/*  49 */         .addBox(-2.0F, -5.0F, -4.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(23, 21)
/*  50 */         .addBox(0.0F, -5.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 17)
/*  51 */         .addBox(-4.0F, -8.0F, -3.0F, 8.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(23, 18)
/*  52 */         .addBox(-4.0F, -1.0F, 3.0F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 11)
/*  53 */         .addBox(-4.0F, 1.0F, 3.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 3)
/*  54 */         .addBox(-4.0F, 2.0F, 3.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 22)
/*  55 */         .addBox(-4.0F, 3.0F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 28)
/*  56 */         .addBox(2.0F, -10.0F, -1.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(56, 22)
/*  57 */         .addBox(-5.0F, -10.0F, -1.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), 
/*  58 */         PartPose.offset(0.0F, 0.0F, 0.0F));
/*  59 */     PartDefinition mask = Head.addOrReplaceChild("mask", 
/*  60 */         CubeListBuilder.create().texOffs(0, 10).addBox(-3.0F, -3.0F, -5.0F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
/*  61 */         .addBox(-2.0F, -2.0F, -5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
/*  62 */         .addBox(1.0F, -2.0F, -5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 13)
/*  63 */         .addBox(-3.0F, -6.0F, -5.0F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(11, 0)
/*  64 */         .addBox(-0.5F, -4.0F, -5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(22, 11)
/*  65 */         .addBox(2.375F, -5.0F, -5.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(22, 11)
/*  66 */         .addBox(-3.625F, -5.0F, -5.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(22, 5)
/*  67 */         .addBox(-1.5F, -5.0F, -5.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), 
/*  68 */         PartPose.offset(0.0F, 0.0F, 1.75F));
/*  69 */     PartDefinition Body = partdefinition.addOrReplaceChild("Body", 
/*  70 */         CubeListBuilder.create().texOffs(0, 31).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(22, 0)
/*  71 */         .addBox(-5.0F, -1.0F, -3.0F, 10.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(30, 11)
/*  72 */         .addBox(-3.5F, 4.0F, -3.0F, 7.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), 
/*  73 */         PartPose.offset(0.0F, 0.0F, 0.0F));
/*  74 */     PartDefinition Tail = Body.addOrReplaceChild("Tail", 
/*  75 */         CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -0.5902F, 0.4559F, 4.0F, 3.0F, 14.0F, new CubeDeformation(0.0F)), 
/*  76 */         PartPose.offsetAndRotation(0.0F, 9.0F, 1.0F, -0.5672F, 0.0F, 0.0F));
/*  77 */     PartDefinition bone8 = Tail.addOrReplaceChild("bone8", 
/*  78 */         CubeListBuilder.create().texOffs(20, 21).addBox(-2.0F, 6.6167F, -7.7314F, 4.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)), 
/*  79 */         PartPose.offsetAndRotation(0.0F, -9.4336F, 17.9186F, 0.3927F, 0.0F, 0.0F));
/*     */     
/*  81 */     PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", 
/*  82 */         CubeListBuilder.create().texOffs(0, 54).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
/*  83 */         .texOffs(24, 34).addBox(-4.0F, 3.0F, -2.0F, 5.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  84 */         PartPose.offset(-5.0F, 2.0F, 0.0F));
/*     */     
/*  86 */     PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", 
/*  87 */         CubeListBuilder.create().texOffs(50, 49).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
/*  88 */         .texOffs(38, 18).addBox(-1.0F, 3.0F, -2.0F, 5.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  89 */         PartPose.offset(5.0F, 2.0F, 0.0F));
/*  90 */     PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", 
/*  91 */         CubeListBuilder.create().texOffs(50, 40).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
/*  92 */         .texOffs(0, 46).addBox(-2.0F, 10.213F, -3.1649F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), 
/*  93 */         PartPose.offset(-2.0F, 11.0F, 0.0F));
/*  94 */     PartDefinition bone = LeftLeg.addOrReplaceChild("bone", 
/*  95 */         CubeListBuilder.create().texOffs(50, 7).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  96 */         PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/*  97 */     PartDefinition bone3 = LeftLeg.addOrReplaceChild("bone3", 
/*  98 */         CubeListBuilder.create().texOffs(18, 46).addBox(-6.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  99 */         PartPose.offsetAndRotation(4.0F, 4.0F, -1.0F, 0.6545F, 0.0F, 0.0F));
/* 100 */     PartDefinition bone4 = LeftLeg.addOrReplaceChild("bone4", 
/* 101 */         CubeListBuilder.create().texOffs(16, 56).addBox(-2.0F, -0.1371F, 3.7689F, 4.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 102 */         PartPose.offsetAndRotation(0.0F, 4.0F, -1.0F, -0.48F, 0.0F, 0.0F));
/* 103 */     PartDefinition Rightleg = partdefinition.addOrReplaceChild("Rightleg", 
/* 104 */         CubeListBuilder.create().texOffs(48, 0).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
/* 105 */         .texOffs(37, 41).addBox(-2.0F, 10.213F, -3.1649F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 106 */         PartPose.offset(2.0F, 11.0F, 0.0F));
/* 107 */     PartDefinition bone5 = Rightleg.addOrReplaceChild("bone5", 
/* 108 */         CubeListBuilder.create().texOffs(34, 49).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 109 */         PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 110 */     PartDefinition bone6 = Rightleg.addOrReplaceChild("bone6", 
/* 111 */         CubeListBuilder.create().texOffs(44, 30).addBox(2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 112 */         PartPose.offsetAndRotation(-4.0F, 4.0F, -1.0F, 0.6545F, 0.0F, 0.0F));
/* 113 */     PartDefinition bone7 = Rightleg.addOrReplaceChild("bone7", 
/* 114 */         CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -0.1371F, 3.7689F, 4.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 115 */         PartPose.offsetAndRotation(0.0F, 4.0F, -1.0F, -0.48F, 0.0F, 0.0F));
/* 116 */     return LayerDefinition.create(meshdefinition, 80, 80);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 122 */     this.Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 123 */     this.Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 124 */     this.LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 125 */     this.RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 126 */     this.LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 127 */     this.Rightleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */   
/*     */   public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
/* 131 */     this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + 3.1415927F) * limbSwingAmount;
/* 132 */     this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
/* 133 */     this.Head.yRot = netHeadYaw / 57.295776F;
/* 134 */     this.Head.xRot = headPitch / 57.295776F;
/* 135 */     this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
/* 136 */     this.Rightleg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\client\model\ModelDark_latex_snep.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */