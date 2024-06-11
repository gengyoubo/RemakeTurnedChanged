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
/*     */ public class Modelhertx_sit_model_f<T extends Entity>
/*     */   extends EntityModel<T>
/*     */ {
/*  24 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("latex", "modelhertx_sit_model_f"), "main");
/*     */   public final ModelPart Head;
/*     */   public final ModelPart Body;
/*     */   public final ModelPart Tail;
/*     */   public final ModelPart LeftArm;
/*     */   public final ModelPart RightArm;
/*     */   public final ModelPart LeftLeg;
/*     */   public final ModelPart RightLeg;
/*     */   
/*     */   public Modelhertx_sit_model_f(ModelPart root) {
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
/*  47 */         CubeListBuilder.create().texOffs(24, 16).addBox(-3.0F, -2.3F, -4.2F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(19, 7)
/*  48 */         .addBox(-2.0F, -3.4F, -3.2F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(61, 47)
/*  49 */         .addBox(-2.0F, -7.4F, 1.8F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(20, 16)
/*  50 */         .addBox(-2.0F, -3.4F, 2.8F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(37, 0)
/*  51 */         .addBox(-3.0F, -3.4F, 1.8F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 24)
/*  52 */         .addBox(-3.0F, -1.4F, -3.1F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(7, 0)
/*  53 */         .addBox(2.0F, -7.4F, 1.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
/*  54 */         .addBox(-3.0F, -7.4F, 1.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 0)
/*  55 */         .addBox(-3.0F, -7.4F, -4.2F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(24, 57)
/*  56 */         .addBox(2.0F, -6.4F, -4.2F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 60)
/*  57 */         .addBox(2.0F, -3.3F, -4.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(55, 55)
/*  58 */         .addBox(-3.0F, -6.4F, -4.2F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(59, 40)
/*  59 */         .addBox(-3.0F, -3.3F, -4.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 8)
/*  60 */         .addBox(-2.0F, -6.4F, -4.2F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 32)
/*  61 */         .addBox(-2.0F, -3.3F, -4.2F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  62 */         PartPose.offset(0.0F, 9.0F, 4.0F));
/*  63 */     PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1", 
/*  64 */         CubeListBuilder.create().texOffs(24, 24).addBox(-3.0625F, 1.2791F, 7.9211F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
/*  65 */         .texOffs(0, 16).addBox(-3.25F, 2.5749F, 6.4445F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 23)
/*  66 */         .addBox(-3.0625F, 1.2791F, 1.9211F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
/*  67 */         .addBox(-3.25F, 2.5749F, 1.4445F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(19, 7)
/*  68 */         .addBox(2.0625F, 1.2791F, 7.9211F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 2)
/*  69 */         .addBox(2.25F, 2.6072F, 6.5652F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 51)
/*  70 */         .addBox(2.0625F, 1.2791F, 1.9211F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(62, 18)
/*  71 */         .addBox(2.25F, 2.6072F, 1.5652F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), 
/*  72 */         PartPose.offsetAndRotation(0.0F, -7.6F, -0.2F, 0.2618F, 0.0F, 0.0F));
/*  73 */     PartDefinition Body = partdefinition.addOrReplaceChild("Body", 
/*  74 */         CubeListBuilder.create().texOffs(0, 16).addBox(-4.0F, -0.8761F, -1.6173F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
/*  75 */         .texOffs(32, 14).addBox(-3.0F, 4.9364F, -2.1173F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 0)
/*  76 */         .addBox(-1.0F, -0.0636F, -2.1173F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  77 */         PartPose.offsetAndRotation(0.0F, 9.0F, 4.0F, -0.3927F, 0.0F, 0.0F));
/*  78 */     PartDefinition bone = Body.addOrReplaceChild("bone", 
/*  79 */         CubeListBuilder.create().texOffs(30, 31).addBox(-4.0F, 2.7268F, 6.267F, 8.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), 
/*  80 */         PartPose.offsetAndRotation(0.0F, -5.691F, -5.0615F, -0.637F, 0.0F, 0.0F));
/*  81 */     PartDefinition Tail = partdefinition.addOrReplaceChild("Tail", CubeListBuilder.create(), 
/*  82 */         PartPose.offsetAndRotation(0.0F, 15.0F, 2.0F, 1.0036F, 0.0F, 0.0F));
/*  83 */     PartDefinition cube_r2 = Tail.addOrReplaceChild("cube_r2", 
/*  84 */         CubeListBuilder.create().texOffs(17, 31).addBox(-1.3F, 18.675F, 10.4769F, 3.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), 
/*  85 */         PartPose.offsetAndRotation(0.0F, -13.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/*  86 */     PartDefinition cube_r3 = Tail.addOrReplaceChild("cube_r3", 
/*  87 */         CubeListBuilder.create().texOffs(0, 0).addBox(-1.3F, 12.9867F, 5.0521F, 3.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)), 
/*  88 */         PartPose.offsetAndRotation(0.0F, -13.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
/*  89 */     PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", 
/*  90 */         CubeListBuilder.create().texOffs(10, 55).addBox(-2.0F, -1.8F, -2.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F))
/*  91 */         .texOffs(33, 38).addBox(-3.0F, 5.2F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  92 */         PartPose.offset(-5.0F, 10.0F, 4.0F));
/*     */     
/*  94 */     PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", 
/*  95 */         CubeListBuilder.create().texOffs(0, 48).addBox(-1.0F, -1.8F, -2.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F))
/*  96 */         .texOffs(0, 32).addBox(-1.0F, 5.2F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  97 */         PartPose.offset(5.0F, 10.0F, 4.0F));
/*  98 */     PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", 
/*  99 */         CubeListBuilder.create().texOffs(38, 60).addBox(-2.0F, -0.8514F, -1.6826F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 100 */         PartPose.offsetAndRotation(-2.0F, 20.75F, 0.0F, -1.9199F, 0.0F, 0.0F));
/* 101 */     PartDefinition LeftLeg_r1 = LeftLeg.addOrReplaceChild("LeftLeg_r1", 
/* 102 */         CubeListBuilder.create().texOffs(23, 50).addBox(-4.0F, 3.784F, 4.9976F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 103 */         PartPose.offsetAndRotation(2.0F, 16.7779F, -3.6805F, 0.9163F, 0.0F, 0.0F));
/* 104 */     PartDefinition cube_r4 = LeftLeg.addOrReplaceChild("cube_r4", 
/* 105 */         CubeListBuilder.create().texOffs(55, 9).addBox(-2.0F, 0.2165F, 5.2991F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 106 */         PartPose.offsetAndRotation(0.0F, 11.1332F, -3.301F, 0.5236F, 0.0F, 0.0F));
/* 107 */     PartDefinition cube_r5 = LeftLeg.addOrReplaceChild("cube_r5", 
/* 108 */         CubeListBuilder.create().texOffs(12, 41).addBox(-2.0F, 4.6985F, 1.9106F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 109 */         PartPose.offsetAndRotation(0.0F, 3.0785F, -8.4571F, 0.7854F, 0.0F, 0.0F));
/* 110 */     PartDefinition cube_r6 = LeftLeg.addOrReplaceChild("cube_r6", 
/* 111 */         CubeListBuilder.create().texOffs(45, 46).addBox(-2.0F, -5.9256F, 5.0916F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 112 */         PartPose.offsetAndRotation(0.0F, 3.0785F, -8.4571F, -0.3927F, 0.0F, 0.0F));
/* 113 */     PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", 
/* 114 */         CubeListBuilder.create().texOffs(49, 40).addBox(-2.0F, -0.9768F, -1.6824F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
/* 115 */         .texOffs(47, 33).addBox(-2.0F, 10.8232F, -2.5926F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 116 */         PartPose.offsetAndRotation(2.0F, 20.75F, 0.0F, -1.8937F, 0.0F, 1.3963F));
/* 117 */     PartDefinition cube_r7 = RightLeg.addOrReplaceChild("cube_r7", 
/* 118 */         CubeListBuilder.create().texOffs(55, 0).addBox(6.8633F, 4.0294F, 4.8355F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 119 */         PartPose.offsetAndRotation(-8.8633F, 0.3708F, -1.4818F, -0.3927F, 0.0F, 0.0F));
/* 120 */     PartDefinition cube_r8 = RightLeg.addOrReplaceChild("cube_r8", 
/* 121 */         CubeListBuilder.create().texOffs(39, 3).addBox(6.8633F, 1.5923F, -4.8476F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 122 */         PartPose.offsetAndRotation(-8.8633F, 0.3708F, -1.4818F, 0.7854F, 0.0F, 0.0F));
/* 123 */     PartDefinition cube_r9 = RightLeg.addOrReplaceChild("cube_r9", 
/* 124 */         CubeListBuilder.create().texOffs(44, 19).addBox(6.8633F, -0.8706F, -0.3645F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 125 */         PartPose.offsetAndRotation(-8.8633F, 0.3708F, -1.4818F, -0.3927F, 0.0F, 0.0F));
/* 126 */     return LayerDefinition.create(meshdefinition, 128, 128);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 132 */     this.Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 133 */     this.Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 134 */     this.Tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 135 */     this.LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 136 */     this.RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 137 */     this.LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 138 */     this.RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */   
/*     */   public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
/* 142 */     this.Head.yRot = netHeadYaw / 57.295776F;
/* 143 */     this.Head.xRot = headPitch / 57.295776F;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\client\model\Modelhertx_sit_model_f.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */