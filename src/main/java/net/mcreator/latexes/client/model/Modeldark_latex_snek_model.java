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
/*     */ public class Modeldark_latex_snek_model<T extends Entity>
/*     */   extends EntityModel<T>
/*     */ {
/*  25 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("latex", "modeldark_latex_snek_model"), "main");
/*     */   
/*     */   public final ModelPart Head;
/*     */   public final ModelPart Body;
/*     */   public final ModelPart LeftArm;
/*     */   public final ModelPart RightArm;
/*     */   public final ModelPart Tail;
/*     */   
/*     */   public Modeldark_latex_snek_model(ModelPart root) {
/*  34 */     this.Head = root.getChild("Head");
/*  35 */     this.Body = root.getChild("Body");
/*  36 */     this.LeftArm = root.getChild("LeftArm");
/*  37 */     this.RightArm = root.getChild("RightArm");
/*  38 */     this.Tail = root.getChild("Tail");
/*     */   }
/*     */   
/*     */   public static LayerDefinition createBodyLayer() {
/*  42 */     MeshDefinition meshdefinition = new MeshDefinition();
/*  43 */     PartDefinition partdefinition = meshdefinition.getRoot();
/*  44 */     PartDefinition Head = partdefinition.addOrReplaceChild("Head", 
/*  45 */         CubeListBuilder.create().texOffs(48, 6).addBox(-4.0F, -2.2F, -1.875F, 8.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  46 */         PartPose.offset(0.0F, 0.0F, 0.0F));
/*  47 */     PartDefinition headbone = Head.addOrReplaceChild("headbone", 
/*  48 */         CubeListBuilder.create().texOffs(16, 53).addBox(-3.0F, 1.1522F, 0.1046F, 6.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  49 */         PartPose.offsetAndRotation(0.0F, -7.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
/*  50 */     PartDefinition headbone2 = Head.addOrReplaceChild("headbone2", 
/*  51 */         CubeListBuilder.create().texOffs(52, 11).addBox(-3.0F, 0.2331F, -3.4936F, 6.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  52 */         PartPose.offsetAndRotation(0.0F, -7.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
/*  53 */     PartDefinition headbone3 = Head.addOrReplaceChild("headbone3", 
/*  54 */         CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, 3.1364F, -2.6487F, 6.0F, 2.0F, 8.0F, new CubeDeformation(0.0F))
/*  55 */         .texOffs(20, 34).addBox(-3.0F, 1.1364F, -0.6487F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), 
/*  56 */         PartPose.offset(0.0F, -10.5F, -4.5F));
/*  57 */     PartDefinition Jawbone = headbone3.addOrReplaceChild("Jawbone", 
/*  58 */         CubeListBuilder.create().texOffs(43, 19).addBox(-6.0F, 6.7184F, -10.0575F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), 
/*  59 */         PartPose.offsetAndRotation(3.0F, -2.4136F, 6.2263F, 0.1745F, 0.0F, 0.0F));
/*  60 */     PartDefinition Tongue = Jawbone.addOrReplaceChild("Tongue", 
/*  61 */         CubeListBuilder.create().texOffs(3, 7).addBox(-1.125F, -30.2094F, -8.5178F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
/*  62 */         .addBox(-0.5F, -30.2094F, -7.5178F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(2, 0).addBox(0.125F, -30.2094F, -8.5178F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), 
/*     */         
/*  64 */         PartPose.offset(-3.0F, 36.9136F, -1.7263F));
/*  65 */     PartDefinition Mask = Head.addOrReplaceChild("Mask", 
/*  66 */         CubeListBuilder.create().texOffs(46, 26).addBox(-3.0F, -32.3636F, -5.3987F, 6.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
/*  67 */         .texOffs(36, 36).addBox(-3.0F, -30.3636F, -7.3987F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(36, 36)
/*  68 */         .addBox(-3.0F, -32.3636F, -5.3987F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(36, 36)
/*  69 */         .addBox(-3.0F, -32.3636F, -3.3987F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(46, 28)
/*  70 */         .addBox(-3.0F, -30.3636F, -7.3987F, 6.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(4, 2)
/*  71 */         .addBox(3.125F, -30.3636F, -7.3987F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 9)
/*  72 */         .addBox(3.125F, -30.3636F, -6.3987F, 0.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(10, 32)
/*  73 */         .addBox(3.125F, -32.3636F, -5.3987F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
/*  74 */         .addBox(3.125F, -31.3636F, -1.3987F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
/*  75 */         .addBox(3.125F, -31.3636F, -5.3987F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(23, 18)
/*  76 */         .addBox(-3.125F, -30.3636F, -6.3987F, 0.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 32)
/*  77 */         .addBox(-3.125F, -32.3636F, -5.3987F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(4, 0)
/*  78 */         .addBox(-3.125F, -30.3636F, -7.3987F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
/*  79 */         .addBox(-3.125F, -31.3636F, -1.3987F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
/*  80 */         .addBox(-3.125F, -31.3636F, -5.3987F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(20, 0)
/*  81 */         .addBox(1.0F, -28.3636F, -7.3987F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(20, 2)
/*  82 */         .addBox(-2.0F, -28.3636F, -7.3987F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), 
/*  83 */         PartPose.offset(0.0F, 22.875F, 0.0F));
/*  84 */     PartDefinition Body = partdefinition.addOrReplaceChild("Body", 
/*  85 */         CubeListBuilder.create().texOffs(0, 21).addBox(-4.5F, -1.2F, -2.375F, 9.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(40, 38)
/*  86 */         .addBox(-4.0F, 9.8F, -1.875F, 8.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 38)
/*  87 */         .addBox(-3.5F, 4.8F, -1.875F, 7.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(46, 0)
/*  88 */         .addBox(-4.0F, 2.8F, -1.875F, 8.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  89 */         PartPose.offset(0.0F, 0.0F, 0.0F));
/*  90 */     PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", 
/*  91 */         CubeListBuilder.create().texOffs(0, 47).addBox(-3.2164F, -3.1763F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  92 */         PartPose.offsetAndRotation(-5.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.2182F));
/*  93 */     PartDefinition RightArm_r1 = LeftArm.addOrReplaceChild("RightArm_r1", 
/*  94 */         CubeListBuilder.create().texOffs(0, 6).addBox(-2.3865F, 8.8266F, 0.1201F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 10)
/*  95 */         .addBox(-2.3865F, 8.8266F, -1.3799F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 12)
/*  96 */         .addBox(-2.3865F, 8.8266F, 1.6201F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 51)
/*  97 */         .addBox(-2.3865F, 1.8266F, -1.3799F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  98 */         PartPose.offsetAndRotation(-1.0F, 1.8F, -0.125F, -0.5219F, -0.0436F, -0.0756F));
/*  99 */     PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", 
/* 100 */         CubeListBuilder.create().texOffs(38, 51).addBox(-0.7836F, -3.1763F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 101 */         PartPose.offsetAndRotation(5.0F, 2.0F, 0.0F, 0.0F, 0.0F, -0.2182F));
/* 102 */     PartDefinition RightArm_r2 = RightArm.addOrReplaceChild("RightArm_r2", 
/* 103 */         CubeListBuilder.create().texOffs(3, 5).addBox(1.3865F, 8.8266F, 1.6201F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 4)
/* 104 */         .addBox(1.3865F, 8.8266F, -1.3799F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
/* 105 */         .addBox(1.3865F, 8.8266F, 0.1201F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 59)
/* 106 */         .addBox(-1.6135F, 1.8266F, -1.3799F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 107 */         PartPose.offsetAndRotation(1.0F, 1.8F, -0.125F, -0.5219F, 0.0436F, 0.0756F));
/* 108 */     PartDefinition Tail = partdefinition.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offset(-2.0F, 12.0F, 0.0F));
/* 109 */     PartDefinition bone2 = Tail.addOrReplaceChild("bone2", 
/* 110 */         CubeListBuilder.create().texOffs(46, 30).addBox(-6.0F, 0.8F, -2.0F, 8.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 111 */         PartPose.offset(4.0F, 0.0F, 0.0F));
/* 112 */     PartDefinition bone = Tail.addOrReplaceChild("bone", 
/* 113 */         CubeListBuilder.create().texOffs(24, 26).addBox(-4.5F, -3.677F, -4.8486F, 9.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 114 */         PartPose.offsetAndRotation(2.0F, 6.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
/* 115 */     PartDefinition bone_r1 = bone.addOrReplaceChild("bone_r1", 
/* 116 */         CubeListBuilder.create().texOffs(42, 45).addBox(-4.5F, -1.0F, -1.5F, 9.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 117 */         PartPose.offsetAndRotation(0.0F, -5.8281F, -4.4184F, 1.1781F, 0.0F, 0.0F));
/* 118 */     PartDefinition bone_r2 = bone.addOrReplaceChild("bone_r2", 
/* 119 */         CubeListBuilder.create().texOffs(0, 30).addBox(-4.5F, -1.0F, -2.5F, 9.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 120 */         PartPose.offsetAndRotation(0.0F, -4.9507F, -2.9997F, 0.3927F, 0.0F, 0.0F));
/* 121 */     PartDefinition bone3 = Tail.addOrReplaceChild("bone3", 
/* 122 */         CubeListBuilder.create().texOffs(26, 8).addBox(-6.5F, 2.8F, -3.6569F, 9.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 123 */         PartPose.offset(4.0F, 0.0F, 0.0F));
/* 124 */     PartDefinition bone4 = Tail.addOrReplaceChild("bone4", 
/* 125 */         CubeListBuilder.create().texOffs(23, 17).addBox(-4.5F, -0.6603F, -3.6846F, 9.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 126 */         PartPose.offsetAndRotation(2.0F, 6.0F, 0.0F, 0.3927F, 0.0F, 0.0F));
/* 127 */     PartDefinition bone5 = Tail.addOrReplaceChild("bone5", 
/* 128 */         CubeListBuilder.create().texOffs(20, 0).addBox(-4.5F, -0.2439F, -4.967F, 9.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 129 */         PartPose.offsetAndRotation(2.0F, 6.0F, 0.0F, 1.1781F, 0.0F, 0.0F));
/* 130 */     PartDefinition bone6 = Tail.addOrReplaceChild("bone6", 
/* 131 */         CubeListBuilder.create().texOffs(0, 10).addBox(-4.5F, 1.5694F, -6.0263F, 9.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(22, 42)
/* 132 */         .addBox(-3.5F, 8.5694F, -6.0263F, 7.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(16, 61)
/* 133 */         .addBox(-2.5F, 16.5694F, -6.0263F, 5.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), 
/* 134 */         PartPose.offsetAndRotation(2.0F, 6.0F, 0.0F, 1.5708F, 0.0F, 0.0F));
/* 135 */     return LayerDefinition.create(meshdefinition, 80, 80);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 141 */     this.Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 142 */     this.Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 143 */     this.LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 144 */     this.RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 145 */     this.Tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */   
/*     */   public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
/* 149 */     this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + 3.1415927F) * limbSwingAmount;
/* 150 */     this.Head.yRot = netHeadYaw / 57.295776F;
/* 151 */     this.Head.xRot = headPitch / 57.295776F;
/* 152 */     this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\client\model\Modeldark_latex_snek_model.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */