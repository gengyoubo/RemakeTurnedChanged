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
/*     */ import net.minecraft.world.entity.Entity;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Modelbee_hertx_sit_model<T extends Entity>
/*     */   extends EntityModel<T>
/*     */ {
/*  24 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("latex", "modelbee_hertx_sit_model"), "main");
/*     */   public final ModelPart Head;
/*     */   public final ModelPart Body;
/*     */   public final ModelPart LeftArm;
/*     */   public final ModelPart RightArm;
/*     */   public final ModelPart LeftLeg;
/*     */   public final ModelPart RightLeg;
/*     */   
/*     */   public Modelbee_hertx_sit_model(ModelPart root) {
/*  33 */     this.Head = root.getChild("Head");
/*  34 */     this.Body = root.getChild("Body");
/*  35 */     this.LeftArm = root.getChild("LeftArm");
/*  36 */     this.RightArm = root.getChild("RightArm");
/*  37 */     this.LeftLeg = root.getChild("LeftLeg");
/*  38 */     this.RightLeg = root.getChild("RightLeg");
/*     */   }
/*     */   
/*     */   public static LayerDefinition createBodyLayer() {
/*  42 */     MeshDefinition meshdefinition = new MeshDefinition();
/*  43 */     PartDefinition partdefinition = meshdefinition.getRoot();
/*  44 */     PartDefinition Head = partdefinition.addOrReplaceChild("Head", 
/*  45 */         CubeListBuilder.create().texOffs(0, 31).addBox(-3.0F, -1.4F, -5.0F, 6.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(58, 11)
/*  46 */         .addBox(-3.0F, -6.4F, 2.0F, 6.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 25)
/*  47 */         .addBox(-3.0F, -6.4F, 3.0F, 6.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 60)
/*  48 */         .addBox(-3.0F, -2.4F, -4.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(50, 12)
/*  49 */         .addBox(-3.0F, -5.4F, -4.0F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(58, 18)
/*  50 */         .addBox(2.0F, -2.4F, -4.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(54, 54)
/*  51 */         .addBox(2.0F, -5.4F, -4.0F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(60, 38)
/*  52 */         .addBox(-3.0F, -2.4F, -5.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 41)
/*  53 */         .addBox(-3.0F, -5.4F, -5.0F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 18)
/*  54 */         .addBox(-3.0F, -6.4F, -4.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(45, 35)
/*  55 */         .addBox(-2.5F, -0.4F, -1.9F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), 
/*  56 */         PartPose.offset(0.0F, 9.0F, 0.0F));
/*  57 */     PartDefinition bone4 = Head.addOrReplaceChild("bone4", 
/*  58 */         CubeListBuilder.create().texOffs(26, 15).addBox(2.0F, 2.1219F, -2.8441F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 0)
/*  59 */         .addBox(-3.0F, 2.1219F, -2.8441F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  60 */         PartPose.offsetAndRotation(0.0F, -12.65F, 2.75F, 0.3927F, 0.0F, 0.0F));
/*  61 */     PartDefinition bone5 = bone4.addOrReplaceChild("bone5", 
/*  62 */         CubeListBuilder.create().texOffs(36, 57).addBox(2.0F, 3.5539F, -7.306F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(6, 7)
/*  63 */         .addBox(2.0F, 4.5539F, -8.306F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 41)
/*  64 */         .addBox(-3.0F, 3.5539F, -7.306F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(25, 21)
/*  65 */         .addBox(-3.0F, 4.5539F, -8.306F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  66 */         PartPose.offsetAndRotation(0.0F, -2.067F, 0.6109F, -0.2618F, 0.0F, 0.0F));
/*  67 */     PartDefinition bone3 = Head.addOrReplaceChild("bone3", 
/*  68 */         CubeListBuilder.create().texOffs(50, 21).addBox(-3.0F, 9.1924F, 2.1213F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(46, 32)
/*  69 */         .addBox(-3.0F, 6.364F, 9.6066F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 49)
/*  70 */         .addBox(-3.0F, 9.6066F, 2.1213F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 45).addBox(-3.0F, 6.7782F, 9.6066F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*     */         
/*  72 */         PartPose.offsetAndRotation(0.0F, -14.4F, 1.0F, -0.7854F, 0.0F, 0.0F));
/*  73 */     PartDefinition Body = partdefinition.addOrReplaceChild("Body", 
/*  74 */         CubeListBuilder.create().texOffs(26, 31).addBox(-4.0F, 1.0F, -2.0F, 8.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(20, 0)
/*  75 */         .addBox(-5.0F, 0.0F, -3.0F, 10.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(46, 25)
/*  76 */         .addBox(-3.0F, 6.0F, -2.0F, 6.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 10)
/*  77 */         .addBox(-4.0F, 9.0F, -2.0F, 8.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  78 */         PartPose.offset(0.0F, 9.0F, 0.0F));
/*  79 */     PartDefinition Wings = Body.addOrReplaceChild("Wings", CubeListBuilder.create(), PartPose.offset(0.0F, -10.0F, 1.0F));
/*  80 */     PartDefinition bone2 = Wings.addOrReplaceChild("bone2", 
/*  81 */         CubeListBuilder.create().texOffs(6, 15).addBox(-4.3F, 11.5F, 1.4F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(19, 31)
/*  82 */         .addBox(-3.3F, 13.5F, 1.4F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(24, 0)
/*  83 */         .addBox(-5.3F, 12.5F, 1.4F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(6, 0)
/*  84 */         .addBox(-7.3F, 12.5F, 1.4F, 2.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
/*  85 */         .addBox(-10.3F, 13.5F, 1.4F, 3.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 30)
/*  86 */         .addBox(-11.3F, 13.5F, 1.4F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 7)
/*  87 */         .addBox(-10.3F, 12.5F, 1.4F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 8)
/*  88 */         .addBox(-7.3F, 11.5F, 1.4F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(6, 9).addBox(-4.3F, 10.5F, 1.4F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), 
/*     */         
/*  90 */         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2618F, 0.0F));
/*  91 */     PartDefinition bone = Wings.addOrReplaceChild("bone", 
/*  92 */         CubeListBuilder.create().texOffs(30, 10).addBox(10.3F, 13.5F, 1.4F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 9)
/*  93 */         .addBox(7.3F, 19.5F, 1.4F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(22, 15)
/*  94 */         .addBox(5.3F, 12.5F, 1.4F, 2.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(4, 30)
/*  95 */         .addBox(4.3F, 12.5F, 1.4F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(2, 30)
/*  96 */         .addBox(3.3F, 11.5F, 1.4F, 1.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(21, 31)
/*  97 */         .addBox(2.3F, 13.5F, 1.4F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(8, 9)
/*  98 */         .addBox(3.3F, 10.5F, 1.4F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 22)
/*  99 */         .addBox(4.3F, 11.5F, 1.4F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 15).addBox(7.3F, 12.5F, 1.4F, 3.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), 
/*     */         
/* 101 */         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, 0.0F));
/* 102 */     PartDefinition Tail = Body.addOrReplaceChild("Tail", 
/* 103 */         CubeListBuilder.create().texOffs(60, 32).addBox(-1.5F, 12.1133F, -3.2867F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 15)
/* 104 */         .addBox(-3.5F, 10.1133F, -0.2867F, 7.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
/* 105 */         .addBox(-2.5F, 11.1133F, -1.2867F, 5.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(17, 17)
/* 106 */         .addBox(-0.5F, 13.1133F, -1.2867F, 1.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)), 
/* 107 */         PartPose.offsetAndRotation(0.0F, -3.0F, 0.0F, 0.3054F, 0.0F, 0.0F));
/* 108 */     PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", 
/* 109 */         CubeListBuilder.create().texOffs(44, 48).addBox(-3.0F, 6.0F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(28, 52)
/* 110 */         .addBox(-2.0F, -1.0F, -2.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 111 */         PartPose.offsetAndRotation(-5.0F, 11.0F, 0.0F, -0.6545F, 0.0F, 0.2182F));
/* 112 */     PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", 
/* 113 */         CubeListBuilder.create().texOffs(32, 40).addBox(-1.0F, 6.0F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(52, 0)
/* 114 */         .addBox(-1.0F, -1.0F, -2.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 115 */         PartPose.offsetAndRotation(5.0F, 11.0F, 0.0F, -0.6545F, 0.0F, -0.2182F));
/* 116 */     PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", 
/* 117 */         CubeListBuilder.create().texOffs(16, 40).addBox(-2.0F, 1.0F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(14, 52)
/* 118 */         .addBox(-1.0F, 9.0F, -2.0F, 3.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 119 */         PartPose.offsetAndRotation(-2.0F, 21.0F, 0.0F, -1.5708F, 0.2618F, 0.0873F));
/* 120 */     PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", 
/* 121 */         CubeListBuilder.create().texOffs(0, 39).addBox(-2.0F, 2.0F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 51)
/* 122 */         .addBox(-2.0F, 10.0F, -2.0F, 3.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 123 */         PartPose.offsetAndRotation(2.0F, 21.0F, 0.0F, -1.5708F, -0.2618F, -0.0873F));
/* 124 */     return LayerDefinition.create(meshdefinition, 80, 80);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 130 */     this.Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 131 */     this.Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 132 */     this.LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 133 */     this.RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 134 */     this.LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 135 */     this.RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */   
/*     */   public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
/* 139 */     this.Head.yRot = netHeadYaw / 57.295776F;
/* 140 */     this.Head.xRot = headPitch / 57.295776F;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\client\model\Modelbee_hertx_sit_model.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */