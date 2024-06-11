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
/*     */ public class ModelAHV_hertx_sit_model<T extends Entity>
/*     */   extends EntityModel<T>
/*     */ {
/*  24 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("latex", "model_ahv_hertx_sit_model"), "main");
/*     */   
/*     */   public final ModelPart Head;
/*     */   public final ModelPart Body;
/*     */   public final ModelPart Tail;
/*     */   public final ModelPart LeftArm;
/*     */   public final ModelPart RightArm;
/*     */   public final ModelPart LeftLeg;
/*     */   public final ModelPart RightLeg;
/*     */   
/*     */   public ModelAHV_hertx_sit_model(ModelPart root) {
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
/*  48 */         CubeListBuilder.create().texOffs(21, 8).addBox(-3.0F, -2.3F, -5.2F, 6.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(56, 43)
/*  49 */         .addBox(-2.0F, -3.4F, -3.2F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(16, 66)
/*  50 */         .addBox(-2.0F, -7.4F, 1.8F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(38, 0)
/*  51 */         .addBox(-2.0F, -3.4F, 2.8F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 59)
/*  52 */         .addBox(-3.0F, -3.4F, 1.8F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 16)
/*  53 */         .addBox(-3.0F, -1.4F, -3.1F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(3, 4)
/*  54 */         .addBox(2.0F, -7.4F, 1.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
/*  55 */         .addBox(-3.0F, -7.4F, 1.8F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 0)
/*  56 */         .addBox(-3.0F, -7.4F, -5.2F, 6.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(50, 22)
/*  57 */         .addBox(2.0F, -6.4F, -5.2F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(55, 5)
/*  58 */         .addBox(2.0F, -3.3F, -5.2F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(41, 29)
/*  59 */         .addBox(-3.0F, -6.4F, -5.2F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(53, 53)
/*  60 */         .addBox(-3.0F, -3.3F, -5.2F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(32, 38)
/*  61 */         .addBox(-2.0F, -6.4F, -5.2F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 16)
/*  62 */         .addBox(-2.0F, -3.3F, -5.2F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  63 */         PartPose.offset(0.0F, 8.0F, 0.0F));
/*  64 */     PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1", 
/*  65 */         CubeListBuilder.create().texOffs(0, 14).addBox(-3.0F, 1.2791F, 6.9211F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(69, 39)
/*  66 */         .addBox(-3.0F, 1.2791F, 1.9211F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(4, 0)
/*  67 */         .addBox(2.0F, 1.2791F, 6.9211F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(46, 65).addBox(2.0F, 1.2791F, 1.9211F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), 
/*     */         
/*  69 */         PartPose.offsetAndRotation(0.0F, -7.6F, -0.2F, 0.2618F, 0.0F, 0.0F));
/*  70 */     PartDefinition Body = partdefinition.addOrReplaceChild("Body", 
/*  71 */         CubeListBuilder.create().texOffs(0, 14).addBox(-4.0F, -0.8F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 58)
/*  72 */         .addBox(-4.0F, -0.8F, -3.0F, 8.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(43, 23)
/*  73 */         .addBox(-3.0F, -0.8F, -3.3F, 6.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(66, 28)
/*  74 */         .addBox(-3.0F, 5.2F, -2.6F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  75 */         PartPose.offset(0.0F, 8.0F, 0.0F));
/*  76 */     PartDefinition Tail = partdefinition.addOrReplaceChild("Tail", CubeListBuilder.create(), 
/*  77 */         PartPose.offsetAndRotation(0.0F, 19.0F, 1.0F, 0.0F, -0.5672F, 0.0F));
/*  78 */     PartDefinition cube_r2 = Tail.addOrReplaceChild("cube_r2", 
/*  79 */         CubeListBuilder.create().texOffs(17, 36).addBox(-2.3F, 15.7384F, 3.3388F, 4.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)), 
/*  80 */         PartPose.offset(0.5F, -18.0F, -4.0F));
/*  81 */     PartDefinition cube_r3 = Tail.addOrReplaceChild("cube_r3", 
/*  82 */         CubeListBuilder.create().texOffs(0, 0).addBox(-2.8F, 16.2678F, -6.6465F, 5.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)), 
/*  83 */         PartPose.offsetAndRotation(0.5F, -18.0F, -4.0F, 0.7854F, 0.0F, 0.0F));
/*  84 */     PartDefinition cube_r10 = Tail.addOrReplaceChild("cube_r10", 
/*  85 */         CubeListBuilder.create().texOffs(24, 24).addBox(-3.8F, 9.7028F, -13.3744F, 7.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), 
/*  86 */         PartPose.offsetAndRotation(5.5F, -18.0F, -2.0F, 1.5708F, -0.3927F, 0.0F));
/*  87 */     PartDefinition cube_r10_r1 = cube_r10.addOrReplaceChild("cube_r10_r1", 
/*  88 */         CubeListBuilder.create().texOffs(57, 39).addBox(-4.3222F, -2.8968F, -7.1705F, 7.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
/*  89 */         .texOffs(0, 30).addBox(-4.3222F, -4.8968F, -12.1705F, 7.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), 
/*  90 */         PartPose.offsetAndRotation(-1.6967F, 14.025F, 3.7962F, 0.0F, 0.0F, 1.9635F));
/*  91 */     PartDefinition uppertailjaw = cube_r10.addOrReplaceChild("uppertailjaw", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
/*  92 */     PartDefinition uppertailjaw_r1 = uppertailjaw.addOrReplaceChild("uppertailjaw_r1", 
/*  93 */         CubeListBuilder.create().texOffs(39, 39).addBox(-4.3222F, -0.8968F, -10.1705F, 7.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  94 */         PartPose.offsetAndRotation(-1.6967F, -9.975F, 3.7962F, 0.0F, 0.0F, 1.9635F));
/*  95 */     PartDefinition lowertailjaw = cube_r10.addOrReplaceChild("lowertailjaw", CubeListBuilder.create(), 
/*  96 */         PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, -0.1309F, 0.0F, 0.0F));
/*  97 */     PartDefinition lowertailjaw_r1 = lowertailjaw.addOrReplaceChild("lowertailjaw_r1", 
/*  98 */         CubeListBuilder.create().texOffs(57, 32).addBox(-4.3222F, 0.4384F, -12.2007F, 7.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), 
/*  99 */         PartPose.offsetAndRotation(-1.6967F, -10.3852F, 2.4617F, -0.1812F, -0.1209F, 1.9665F));
/* 100 */     PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", 
/* 101 */         CubeListBuilder.create().texOffs(45, 0).addBox(-2.8393F, -1.9591F, -1.2349F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F))
/* 102 */         .texOffs(59, 22).addBox(-2.8393F, 9.0409F, -1.2349F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 58)
/* 103 */         .addBox(-2.8393F, 6.0409F, -1.2349F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(22, 1)
/* 104 */         .addBox(-2.8393F, 12.0409F, -1.2349F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 4)
/* 105 */         .addBox(-0.8393F, 12.0409F, -1.2349F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(62, 55)
/* 106 */         .addBox(-2.8393F, 11.0409F, -1.2349F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(19, 2)
/* 107 */         .addBox(-2.8393F, 12.0409F, 0.2651F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 0)
/* 108 */         .addBox(-2.8393F, 12.0409F, 1.7651F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 109 */         PartPose.offsetAndRotation(-5.0F, 9.0F, 0.0F, -0.3914F, 0.0334F, 0.0807F));
/* 110 */     PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", 
/* 111 */         CubeListBuilder.create().texOffs(0, 39).addBox(-1.1607F, -1.9591F, -1.2349F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F))
/* 112 */         .texOffs(66, 66).addBox(-1.1607F, 11.0409F, -1.2349F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(18, 59)
/* 113 */         .addBox(-1.1607F, 6.0409F, -1.2349F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(62, 49)
/* 114 */         .addBox(-1.1607F, 9.0409F, -1.2349F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(24, 18)
/* 115 */         .addBox(-0.1607F, 12.0409F, -1.2349F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 24)
/* 116 */         .addBox(1.8393F, 12.0409F, -1.2349F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 5)
/* 117 */         .addBox(1.8393F, 12.0409F, 0.2651F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 3)
/* 118 */         .addBox(1.8393F, 12.0409F, 1.7651F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 119 */         PartPose.offsetAndRotation(5.0F, 9.0F, 0.0F, -0.3914F, -0.0334F, -0.0807F));
/* 120 */     PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", 
/* 121 */         CubeListBuilder.create().texOffs(30, 65).addBox(-2.2578F, -2.0692F, -1.0721F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
/* 122 */         .texOffs(0, 65).addBox(-2.2578F, 9.7308F, -1.4823F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 123 */         PartPose.offsetAndRotation(-2.0F, 20.0F, 0.0F, -1.8762F, 0.0873F, -0.2618F));
/* 124 */     PartDefinition cube_r4 = LeftLeg.addOrReplaceChild("cube_r4", 
/* 125 */         CubeListBuilder.create().texOffs(59, 13).addBox(-4.3205F, -1.1325F, 9.79F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 126 */         PartPose.offsetAndRotation(2.0627F, 2.1513F, -7.4241F, -0.3927F, 0.0F, 0.0F));
/* 127 */     PartDefinition cube_r5 = LeftLeg.addOrReplaceChild("cube_r5", 
/* 128 */         CubeListBuilder.create().texOffs(28, 48).addBox(-4.3205F, 4.1942F, 1.8173F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 129 */         PartPose.offsetAndRotation(2.0627F, 2.1513F, -7.4241F, 0.7854F, 0.0F, 0.0F));
/* 130 */     PartDefinition cube_r6 = LeftLeg.addOrReplaceChild("cube_r6", 
/* 131 */         CubeListBuilder.create().texOffs(44, 48).addBox(-4.3205F, -6.0325F, 4.59F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 132 */         PartPose.offsetAndRotation(2.0627F, 2.1513F, -7.4241F, -0.3927F, 0.0F, 0.0F));
/* 133 */     PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", 
/* 134 */         CubeListBuilder.create().texOffs(64, 6).addBox(-1.7422F, -2.0692F, -1.0721F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
/* 135 */         .texOffs(64, 0).addBox(-1.7422F, 9.7308F, -1.4823F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 136 */         PartPose.offsetAndRotation(2.0F, 20.0F, 0.0F, -1.8762F, -0.0873F, 0.2618F));
/* 137 */     PartDefinition cube_r7 = RightLeg.addOrReplaceChild("cube_r7", 
/* 138 */         CubeListBuilder.create().texOffs(56, 61).addBox(0.3205F, -1.1325F, 9.79F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 139 */         PartPose.offsetAndRotation(-2.0627F, 2.1513F, -7.4241F, -0.3927F, 0.0F, 0.0F));
/* 140 */     PartDefinition cube_r8 = RightLeg.addOrReplaceChild("cube_r8", 
/* 141 */         CubeListBuilder.create().texOffs(12, 47).addBox(0.3205F, 4.1942F, 1.8173F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 142 */         PartPose.offsetAndRotation(-2.0627F, 2.1513F, -7.4241F, 0.7854F, 0.0F, 0.0F));
/* 143 */     PartDefinition cube_r9 = RightLeg.addOrReplaceChild("cube_r9", 
/* 144 */         CubeListBuilder.create().texOffs(43, 12).addBox(0.3205F, -6.0325F, 4.59F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 145 */         PartPose.offsetAndRotation(-2.0627F, 2.1513F, -7.4241F, -0.3927F, 0.0F, 0.0F));
/* 146 */     return LayerDefinition.create(meshdefinition, 128, 128);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 152 */     this.Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 153 */     this.Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 154 */     this.Tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 155 */     this.LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 156 */     this.RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 157 */     this.LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 158 */     this.RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */   
/*     */   public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
/* 162 */     this.Head.yRot = netHeadYaw / 57.295776F;
/* 163 */     this.Head.xRot = headPitch / 57.295776F;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\client\model\ModelAHV_hertx_sit_model.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */