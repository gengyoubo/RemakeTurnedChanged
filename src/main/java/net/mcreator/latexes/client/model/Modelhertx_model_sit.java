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
/*     */ public class Modelhertx_model_sit<T extends Entity>
/*     */   extends EntityModel<T>
/*     */ {
/*  24 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("latex", "modelhertx_model_sit"), "main");
/*     */   public final ModelPart Head;
/*     */   public final ModelPart Body;
/*     */   public final ModelPart Tail;
/*     */   public final ModelPart LeftArm;
/*     */   public final ModelPart RightArm;
/*     */   public final ModelPart LeftLeg;
/*     */   public final ModelPart RightLeg;
/*     */   
/*     */   public Modelhertx_model_sit(ModelPart root) {
/*  34 */     this.Head = root.getChild("Head");
/*  35 */     this.Body = root.getChild("Body");
/*  36 */     this.Tail = root.getChild("Tail");
/*  37 */     this.LeftArm = root.getChild("LeftArm");
/*  38 */     this.RightArm = root.getChild("RightArm");
/*  39 */     this.LeftLeg = root.getChild("LeftLeg");
/*  40 */     this.RightLeg = root.getChild("RightLeg");
/*     */   }
/*     */   
/*     */   public static LayerDefinition createBodyLayer() {
/*  44 */     MeshDefinition meshdefinition = new MeshDefinition();
/*  45 */     PartDefinition partdefinition = meshdefinition.getRoot();
/*  46 */     PartDefinition Head = partdefinition.addOrReplaceChild("Head", 
/*  47 */         CubeListBuilder.create().texOffs(24, 24).addBox(-3.0F, 5.3F, -5.0F, 6.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(18, 54)
/*  48 */         .addBox(-2.0F, 4.2F, -3.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 60)
/*  49 */         .addBox(-2.0F, 0.2F, 2.0F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(20, 16)
/*  50 */         .addBox(-2.0F, 4.2F, 3.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 8)
/*  51 */         .addBox(-3.0F, 4.2F, 2.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 16)
/*  52 */         .addBox(-3.0F, 6.2F, -2.9F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(7, 0)
/*  53 */         .addBox(2.0F, 0.2F, 2.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
/*  54 */         .addBox(-3.0F, 0.2F, 2.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 0)
/*  55 */         .addBox(-3.0F, 0.2F, -5.0F, 6.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(50, 8)
/*  56 */         .addBox(2.0F, 1.2F, -5.0F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(32, 8)
/*  57 */         .addBox(2.0F, 4.3F, -5.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(48, 29)
/*  58 */         .addBox(-3.0F, 1.2F, -5.0F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(57, 57)
/*  59 */         .addBox(-3.0F, 4.3F, -5.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 8)
/*  60 */         .addBox(-2.0F, 1.2F, -5.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(13, 32)
/*  61 */         .addBox(-2.0F, 4.3F, -5.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  62 */         PartPose.offset(0.0F, 0.4F, -0.2F));
/*  63 */     PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1", 
/*  64 */         CubeListBuilder.create().texOffs(19, 0).addBox(-3.0F, 1.2791F, 6.9211F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
/*  65 */         .addBox(-3.0F, 1.2791F, 1.9211F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
/*  66 */         .addBox(2.0F, 1.2791F, 6.9211F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 60).addBox(2.0F, 1.2791F, 1.9211F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), 
/*     */         
/*  68 */         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2618F, 0.0F, 0.0F));
/*  69 */     PartDefinition Body = partdefinition.addOrReplaceChild("Body", 
/*  70 */         CubeListBuilder.create().texOffs(0, 16).addBox(-4.0F, 7.2F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(52, 39)
/*  71 */         .addBox(-4.0F, 7.2F, -3.0F, 8.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 11)
/*  72 */         .addBox(-3.0F, 13.2F, -3.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  73 */         PartPose.offset(0.0F, 0.0F, 0.0F));
/*  74 */     PartDefinition Tail = partdefinition.addOrReplaceChild("Tail", CubeListBuilder.create(), 
/*  75 */         PartPose.offsetAndRotation(0.0F, 11.0F, 0.0F, 0.6109F, 0.0F, 0.0F));
/*  76 */     PartDefinition cube_r2 = Tail.addOrReplaceChild("cube_r2", 
/*  77 */         CubeListBuilder.create().texOffs(0, 32).addBox(-1.3F, 20.0893F, 13.6912F, 3.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), 
/*  78 */         PartPose.offsetAndRotation(0.0F, -10.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/*  79 */     PartDefinition cube_r3 = Tail.addOrReplaceChild("cube_r3", 
/*  80 */         CubeListBuilder.create().texOffs(0, 0).addBox(-1.3F, 13.0633F, 8.5628F, 3.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)), 
/*  81 */         PartPose.offsetAndRotation(0.0F, -10.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
/*  82 */     PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", 
/*  83 */         CubeListBuilder.create().texOffs(36, 36).addBox(-2.1472F, -1.4133F, -2.0884F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F))
/*  84 */         .texOffs(16, 44).addBox(-2.1472F, 6.5867F, -2.0884F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(24, 26)
/*  85 */         .addBox(-2.1472F, 12.5867F, 0.9116F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 19)
/*  86 */         .addBox(-2.1472F, 12.5867F, -2.0884F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 4)
/*  87 */         .addBox(-0.1472F, 12.5867F, -2.0884F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 24)
/*  88 */         .addBox(-2.1472F, 12.5867F, -0.5884F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  89 */         PartPose.offsetAndRotation(-5.0F, 9.0F, 0.0F, 0.2618F, 0.0F, 0.2618F));
/*  90 */     PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", 
/*  91 */         CubeListBuilder.create().texOffs(20, 32).addBox(-1.6769F, -1.2771F, -2.125F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F))
/*  92 */         .texOffs(44, 19).addBox(-1.6769F, 6.7229F, -2.125F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(22, 2)
/*  93 */         .addBox(-0.6769F, 12.7229F, -2.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 3)
/*  94 */         .addBox(1.3231F, 12.7229F, 0.875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(9, 11)
/*  95 */         .addBox(1.3231F, 12.7229F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 5)
/*  96 */         .addBox(1.3231F, 12.7229F, -2.125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  97 */         PartPose.offsetAndRotation(5.0F, 9.0F, 0.0F, 0.2618F, 0.0F, -0.2618F));
/*  98 */     PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", 
/*  99 */         CubeListBuilder.create().texOffs(59, 7).addBox(-1.9299F, -2.4753F, -0.66F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 53)
/* 100 */         .addBox(-1.9299F, 9.3247F, -1.5702F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 101 */         PartPose.offsetAndRotation(-2.0F, 20.0F, 0.0F, -1.7802F, 0.2094F, 0.0524F));
/* 102 */     PartDefinition cube_r4 = LeftLeg.addOrReplaceChild("cube_r4", 
/* 103 */         CubeListBuilder.create().texOffs(57, 26).addBox(-1.5393F, -0.8714F, 10.3515F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 104 */         PartPose.offsetAndRotation(-0.3906F, 1.2891F, -7.4309F, -0.3927F, 0.0F, 0.0F));
/* 105 */     PartDefinition cube_r5 = LeftLeg.addOrReplaceChild("cube_r5", 
/* 106 */         CubeListBuilder.create().texOffs(41, 4).addBox(-1.5393F, 4.8129F, 1.791F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 107 */         PartPose.offsetAndRotation(-0.3906F, 1.2891F, -7.4309F, 0.7854F, 0.0F, 0.0F));
/* 108 */     PartDefinition cube_r6 = LeftLeg.addOrReplaceChild("cube_r6", 
/* 109 */         CubeListBuilder.create().texOffs(32, 48).addBox(-1.5393F, -5.7714F, 5.1515F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 110 */         PartPose.offsetAndRotation(-0.3906F, 1.2891F, -7.4309F, -0.3927F, 0.0F, 0.0F));
/* 111 */     PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", 
/* 112 */         CubeListBuilder.create().texOffs(47, 58).addBox(-1.9492F, -1.9973F, -1.021F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
/* 113 */         .texOffs(53, 0).addBox(-1.9492F, 9.8027F, -1.9312F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 114 */         PartPose.offsetAndRotation(2.0F, 20.0F, 0.0F, -1.7802F, -0.2094F, 0.0524F));
/* 115 */     PartDefinition cube_r7 = RightLeg.addOrReplaceChild("cube_r7", 
/* 116 */         CubeListBuilder.create().texOffs(33, 58).addBox(-1.5393F, -0.71F, 10.4624F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 117 */         PartPose.offsetAndRotation(-0.4099F, 1.5755F, -7.8326F, -0.3927F, 0.0F, 0.0F));
/* 118 */     PartDefinition cube_r8 = RightLeg.addOrReplaceChild("cube_r8", 
/* 119 */         CubeListBuilder.create().texOffs(0, 42).addBox(-1.5393F, 4.9772F, 1.6843F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 120 */         PartPose.offsetAndRotation(-0.4099F, 1.5755F, -7.8326F, 0.7854F, 0.0F, 0.0F));
/* 121 */     PartDefinition cube_r9 = RightLeg.addOrReplaceChild("cube_r9", 
/* 122 */         CubeListBuilder.create().texOffs(48, 48).addBox(-1.5393F, -5.61F, 5.2624F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 123 */         PartPose.offsetAndRotation(-0.4099F, 1.5755F, -7.8326F, -0.3927F, 0.0F, 0.0F));
/* 124 */     return LayerDefinition.create(meshdefinition, 128, 128);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 130 */     this.Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 131 */     this.Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 132 */     this.Tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 133 */     this.LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 134 */     this.RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 135 */     this.LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 136 */     this.RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */   
/*     */   public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
/* 140 */     this.Head.yRot = netHeadYaw / 57.295776F;
/* 141 */     this.Head.xRot = headPitch / 57.295776F;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\client\model\Modelhertx_model_sit.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */