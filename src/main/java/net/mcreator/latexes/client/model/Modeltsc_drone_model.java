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
/*     */ public class Modeltsc_drone_model<T extends Entity>
/*     */   extends EntityModel<T>
/*     */ {
/*  25 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("latex", "modeltsc_drone_model"), "main");
/*     */   public final ModelPart Head;
/*     */   public final ModelPart Body;
/*     */   public final ModelPart LeftArm;
/*     */   public final ModelPart RightArm;
/*     */   public final ModelPart LeftLeg;
/*     */   public final ModelPart RightLeg;
/*     */   
/*     */   public Modeltsc_drone_model(ModelPart root) {
/*  34 */     this.Head = root.getChild("Head");
/*  35 */     this.Body = root.getChild("Body");
/*  36 */     this.LeftArm = root.getChild("LeftArm");
/*  37 */     this.RightArm = root.getChild("RightArm");
/*  38 */     this.LeftLeg = root.getChild("LeftLeg");
/*  39 */     this.RightLeg = root.getChild("RightLeg");
/*     */   }
/*     */   
/*     */   public static LayerDefinition createBodyLayer() {
/*  43 */     MeshDefinition meshdefinition = new MeshDefinition();
/*  44 */     PartDefinition partdefinition = meshdefinition.getRoot();
/*  45 */     PartDefinition Head = partdefinition.addOrReplaceChild("Head", 
/*  46 */         CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(22, 23)
/*  47 */         .addBox(-3.0F, -8.5F, -4.5F, 6.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(31, 16)
/*  48 */         .addBox(2.75F, -2.5F, -4.75F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(12, 31)
/*  49 */         .addBox(-4.75F, -2.5F, -4.75F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(17, 23)
/*  50 */         .addBox(-2.0F, -1.5F, -4.75F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), 
/*  51 */         PartPose.offset(0.0F, 0.0F, 0.0F));
/*  52 */     PartDefinition bone = Head.addOrReplaceChild("bone", 
/*  53 */         CubeListBuilder.create().texOffs(12, 39).addBox(2.5F, -9.0F, -2.0F, 2.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 31)
/*  54 */         .addBox(-4.5F, -9.0F, -2.0F, 2.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), 
/*  55 */         PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, 0.3927F, 0.0F, 0.0F));
/*  56 */     PartDefinition Body = partdefinition.addOrReplaceChild("Body", 
/*  57 */         CubeListBuilder.create().texOffs(32, 0).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  58 */         PartPose.offset(0.0F, 0.0F, 0.0F));
/*  59 */     PartDefinition bone2 = Body.addOrReplaceChild("bone2", 
/*  60 */         CubeListBuilder.create().texOffs(0, 16).addBox(-1.0F, 10.0F, -2.0F, 2.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(48, 43)
/*  61 */         .addBox(-1.5F, 9.4619F, -1.8087F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 16)
/*  62 */         .addBox(-1.5F, 9.4619F, 1.1913F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 0)
/*  63 */         .addBox(-1.5F, 9.4619F, 3.1913F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 25)
/*  64 */         .addBox(-1.5F, 9.4619F, 7.1913F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 43)
/*  65 */         .addBox(-1.5F, 9.4619F, 5.1913F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 43).addBox(-1.5F, 9.4619F, 9.1913F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), 
/*     */         
/*  67 */         PartPose.offsetAndRotation(0.0F, 1.0F, 7.0F, -0.3927F, 0.0F, 0.0F));
/*  68 */     PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", 
/*  69 */         CubeListBuilder.create().texOffs(50, 25).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 48)
/*  70 */         .addBox(-3.0F, 5.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 51)
/*  71 */         .addBox(-2.0F, 2.0F, -2.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
/*  72 */         .addBox(-3.0F, -3.0F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  73 */         PartPose.offset(-5.0F, 2.0F, 0.0F));
/*  74 */     PartDefinition bone6 = LeftArm.addOrReplaceChild("bone6", 
/*  75 */         CubeListBuilder.create().texOffs(0, 31).addBox(-2.0F, 1.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), 
/*  76 */         PartPose.offsetAndRotation(-2.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3491F));
/*  77 */     PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", 
/*  78 */         CubeListBuilder.create().texOffs(46, 35).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(42, 16)
/*  79 */         .addBox(-1.0F, 5.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(17, 16)
/*  80 */         .addBox(-1.0F, 2.0F, -2.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 21)
/*  81 */         .addBox(1.0F, -3.0F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  82 */         PartPose.offset(5.0F, 2.0F, 0.0F));
/*  83 */     PartDefinition bone5 = RightArm.addOrReplaceChild("bone5", 
/*  84 */         CubeListBuilder.create().texOffs(24, 39).addBox(0.0F, 1.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), 
/*  85 */         PartPose.offsetAndRotation(2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3491F));
/*  86 */     PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", 
/*  87 */         CubeListBuilder.create().texOffs(0, 47).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  88 */         PartPose.offset(-2.0F, 12.0F, 0.0F));
/*  89 */     PartDefinition bone4 = LeftLeg.addOrReplaceChild("bone4", 
/*  90 */         CubeListBuilder.create().texOffs(24, 0).addBox(-1.0F, 4.0F, 0.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), 
/*  91 */         PartPose.offsetAndRotation(4.0F, 0.0F, 3.5F, -0.3927F, 0.0F, 0.0F));
/*  92 */     PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", 
/*  93 */         CubeListBuilder.create().texOffs(32, 39).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  94 */         PartPose.offset(2.0F, 12.0F, 0.0F));
/*  95 */     PartDefinition bone7 = RightLeg.addOrReplaceChild("bone7", 
/*  96 */         CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 4.0F, 0.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), 
/*  97 */         PartPose.offsetAndRotation(-4.0F, 0.0F, 3.5F, -0.3927F, 0.0F, 0.0F));
/*  98 */     return LayerDefinition.create(meshdefinition, 80, 80);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 104 */     this.Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 105 */     this.Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 106 */     this.LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 107 */     this.RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 108 */     this.LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 109 */     this.RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */   
/*     */   public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
/* 113 */     this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + 3.1415927F) * limbSwingAmount;
/* 114 */     this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
/* 115 */     this.Head.yRot = netHeadYaw / 57.295776F;
/* 116 */     this.Head.xRot = headPitch / 57.295776F;
/* 117 */     this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
/* 118 */     this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\client\model\Modeltsc_drone_model.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */