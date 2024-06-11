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
/*     */ public class Modelbee_hertx_model<T extends Entity>
/*     */   extends EntityModel<T>
/*     */ {
/*  25 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("latex", "modelbee_hertx_model"), "main");
/*     */   public final ModelPart Head;
/*     */   public final ModelPart Body;
/*     */   public final ModelPart LeftArm;
/*     */   public final ModelPart RightArm;
/*     */   public final ModelPart LeftLeg;
/*     */   public final ModelPart RightLeg;
/*     */   
/*     */   public Modelbee_hertx_model(ModelPart root) {
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
/*  46 */         CubeListBuilder.create().texOffs(0, 31).addBox(-3.0F, -1.4F, -5.0F, 6.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(58, 11)
/*  47 */         .addBox(-3.0F, -6.4F, 2.0F, 6.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 25)
/*  48 */         .addBox(-3.0F, -6.4F, 3.0F, 6.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 60)
/*  49 */         .addBox(-3.0F, -2.4F, -4.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(50, 12)
/*  50 */         .addBox(-3.0F, -5.4F, -4.0F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(58, 18)
/*  51 */         .addBox(2.0F, -2.4F, -4.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(54, 54)
/*  52 */         .addBox(2.0F, -5.4F, -4.0F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(60, 38)
/*  53 */         .addBox(-3.0F, -2.4F, -5.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 41)
/*  54 */         .addBox(-3.0F, -5.4F, -5.0F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 18)
/*  55 */         .addBox(-3.0F, -6.4F, -4.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(45, 35)
/*  56 */         .addBox(-2.5F, -0.4F, -1.9F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), 
/*  57 */         PartPose.offset(0.0F, -5.0F, 0.0F));
/*  58 */     PartDefinition bone4 = Head.addOrReplaceChild("bone4", 
/*  59 */         CubeListBuilder.create().texOffs(26, 15).addBox(2.0F, -10.8124F, 2.5135F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 0)
/*  60 */         .addBox(-3.0F, -10.8124F, 2.5135F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  61 */         PartPose.offsetAndRotation(0.0F, 1.35F, 2.75F, 0.3927F, 0.0F, 0.0F));
/*  62 */     PartDefinition bone5 = bone4.addOrReplaceChild("bone5", 
/*  63 */         CubeListBuilder.create().texOffs(36, 57).addBox(2.0F, -10.3263F, -5.4786F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(6, 7)
/*  64 */         .addBox(2.0F, -9.3263F, -6.4786F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 41)
/*  65 */         .addBox(-3.0F, -10.3263F, -5.4786F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(25, 21)
/*  66 */         .addBox(-3.0F, -9.3263F, -6.4786F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  67 */         PartPose.offsetAndRotation(0.0F, -2.067F, 0.6109F, -0.2618F, 0.0F, 0.0F));
/*  68 */     PartDefinition bone3 = Head.addOrReplaceChild("bone3", 
/*  69 */         CubeListBuilder.create().texOffs(50, 21).addBox(-3.0F, -0.7071F, -7.7782F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
/*  70 */         .texOffs(46, 32).addBox(-3.0F, -3.5355F, -0.2929F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 49)
/*  71 */         .addBox(-3.0F, -0.2929F, -7.7782F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 45)
/*  72 */         .addBox(-3.0F, -3.1213F, -0.2929F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  73 */         PartPose.offsetAndRotation(0.0F, -0.4F, 1.0F, -0.7854F, 0.0F, 0.0F));
/*  74 */     PartDefinition Body = partdefinition.addOrReplaceChild("Body", 
/*  75 */         CubeListBuilder.create().texOffs(26, 31).addBox(-4.0F, 1.0F, -2.0F, 8.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(20, 0)
/*  76 */         .addBox(-5.0F, 0.0F, -3.0F, 10.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(46, 25)
/*  77 */         .addBox(-3.0F, 6.0F, -2.0F, 6.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 10)
/*  78 */         .addBox(-4.0F, 9.0F, -2.0F, 8.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  79 */         PartPose.offset(0.0F, -5.0F, 0.0F));
/*  80 */     PartDefinition Wings = Body.addOrReplaceChild("Wings", CubeListBuilder.create(), PartPose.offset(0.0F, 4.0F, 1.0F));
/*  81 */     PartDefinition bone2 = Wings.addOrReplaceChild("bone2", 
/*  82 */         CubeListBuilder.create().texOffs(6, 15).addBox(-4.3F, -2.5F, 1.4F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(19, 31)
/*  83 */         .addBox(-3.3F, -0.5F, 1.4F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(24, 0)
/*  84 */         .addBox(-5.3F, -1.5F, 1.4F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(6, 0)
/*  85 */         .addBox(-7.3F, -1.5F, 1.4F, 2.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
/*  86 */         .addBox(-10.3F, -0.5F, 1.4F, 3.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 30)
/*  87 */         .addBox(-11.3F, -0.5F, 1.4F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 7)
/*  88 */         .addBox(-10.3F, -1.5F, 1.4F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 8)
/*  89 */         .addBox(-7.3F, -2.5F, 1.4F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(6, 9).addBox(-4.3F, -3.5F, 1.4F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), 
/*     */         
/*  91 */         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2618F, 0.0F));
/*  92 */     PartDefinition bone = Wings.addOrReplaceChild("bone", 
/*  93 */         CubeListBuilder.create().texOffs(30, 10).addBox(10.3F, -0.5F, 1.4F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 9)
/*  94 */         .addBox(7.3F, 5.5F, 1.4F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(22, 15)
/*  95 */         .addBox(5.3F, -1.5F, 1.4F, 2.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(4, 30)
/*  96 */         .addBox(4.3F, -1.5F, 1.4F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(2, 30)
/*  97 */         .addBox(3.3F, -2.5F, 1.4F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(21, 31)
/*  98 */         .addBox(2.3F, -0.5F, 1.4F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(8, 9)
/*  99 */         .addBox(3.3F, -3.5F, 1.4F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 22)
/* 100 */         .addBox(4.3F, -2.5F, 1.4F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 15).addBox(7.3F, -1.5F, 1.4F, 3.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), 
/*     */         
/* 102 */         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, 0.0F));
/* 103 */     PartDefinition Tail = Body.addOrReplaceChild("Tail", 
/* 104 */         CubeListBuilder.create().texOffs(60, 32).addBox(-1.5F, 4.3045F, 3.2193F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 15)
/* 105 */         .addBox(-3.5F, 2.3045F, 6.2193F, 7.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
/* 106 */         .addBox(-2.5F, 3.3045F, 5.2193F, 5.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(17, 17).addBox(-0.5F, 5.3045F, 5.2193F, 1.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)), 
/*     */         
/* 108 */         PartPose.offsetAndRotation(0.0F, 5.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/* 109 */     PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", 
/* 110 */         CubeListBuilder.create().texOffs(44, 48).addBox(-3.0F, 6.0F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F))
/* 111 */         .texOffs(28, 52).addBox(-2.0F, -1.0F, -2.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 112 */         PartPose.offset(-5.0F, -3.0F, 0.0F));
/*     */     
/* 114 */     PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", 
/* 115 */         CubeListBuilder.create().texOffs(32, 40).addBox(-1.0F, 6.0F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F))
/* 116 */         .texOffs(52, 0).addBox(-1.0F, -1.0F, -2.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 117 */         PartPose.offset(5.0F, -3.0F, 0.0F));
/*     */     
/* 119 */     PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", 
/* 120 */         CubeListBuilder.create().texOffs(16, 40).addBox(-2.0F, 1.0F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F))
/* 121 */         .texOffs(14, 52).addBox(-1.0F, 9.0F, -2.0F, 3.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 122 */         PartPose.offset(-2.0F, 7.0F, 0.0F));
/*     */     
/* 124 */     PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", 
/* 125 */         CubeListBuilder.create().texOffs(0, 39).addBox(-2.0F, 1.0F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F))
/* 126 */         .texOffs(0, 51).addBox(-2.0F, 9.0F, -2.0F, 3.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 127 */         PartPose.offset(2.0F, 7.0F, 0.0F));
/* 128 */     return LayerDefinition.create(meshdefinition, 80, 80);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 134 */     this.Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 135 */     this.Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 136 */     this.LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 137 */     this.RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 138 */     this.LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 139 */     this.RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */   
/*     */   public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
/* 143 */     this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + 3.1415927F) * limbSwingAmount;
/* 144 */     this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
/* 145 */     this.Head.yRot = netHeadYaw / 57.295776F;
/* 146 */     this.Head.xRot = headPitch / 57.295776F;
/* 147 */     this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
/* 148 */     this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\client\model\Modelbee_hertx_model.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */