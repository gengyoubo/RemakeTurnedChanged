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
/*     */ public class ModelProtector_remaster_sit<T extends Entity>
/*     */   extends EntityModel<T>
/*     */ {
/*  25 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("latex", "model_protector_remaster_sit"), "main");
/*     */   
/*     */   public final ModelPart LeftLeg;
/*     */   public final ModelPart RightLeg;
/*     */   public final ModelPart LeftArm;
/*     */   public final ModelPart RightArm;
/*     */   public final ModelPart Body;
/*     */   public final ModelPart Head;
/*     */   
/*     */   public ModelProtector_remaster_sit(ModelPart root) {
/*  35 */     this.LeftLeg = root.getChild("LeftLeg");
/*  36 */     this.RightLeg = root.getChild("RightLeg");
/*  37 */     this.LeftArm = root.getChild("LeftArm");
/*  38 */     this.RightArm = root.getChild("RightArm");
/*  39 */     this.Body = root.getChild("Body");
/*  40 */     this.Head = root.getChild("Head");
/*     */   }
/*     */   
/*     */   public static LayerDefinition createBodyLayer() {
/*  44 */     MeshDefinition meshdefinition = new MeshDefinition();
/*  45 */     PartDefinition partdefinition = meshdefinition.getRoot();
/*  46 */     PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create(), 
/*  47 */         PartPose.offsetAndRotation(-2.0F, 21.0F, 0.0F, -1.6583F, 0.1307F, 0.0F));
/*  48 */     PartDefinition cube_r11 = LeftLeg.addOrReplaceChild("cube_r11", 
/*  49 */         CubeListBuilder.create().texOffs(52, 18).addBox(-1.375F, -4.0F, -2.375F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), 
/*  50 */         PartPose.offsetAndRotation(-1.0F, 3.85F, 0.0F, -0.0436F, 0.0F, 0.0F));
/*  51 */     PartDefinition cube_r12 = LeftLeg.addOrReplaceChild("cube_r12", 
/*  52 */         CubeListBuilder.create().texOffs(34, 17).addBox(-2.375F, -3.0F, -2.375F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), 
/*  53 */         PartPose.offsetAndRotation(-0.375F, 3.475F, 0.0F, -0.0436F, 0.0F, 0.0F));
/*  54 */     PartDefinition bone2 = LeftLeg.addOrReplaceChild("bone2", CubeListBuilder.create(), 
/*  55 */         PartPose.offsetAndRotation(-1.25F, 4.0398F, 2.347F, -0.0019F, 0.0436F, -0.2618F));
/*  56 */     PartDefinition cube_r13 = bone2.addOrReplaceChild("cube_r13", 
/*  57 */         CubeListBuilder.create().texOffs(54, 31).addBox(-2.0F, -1.0F, -1.0F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/*  58 */         PartPose.offsetAndRotation(0.0F, 7.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
/*  59 */     PartDefinition cube_r14 = bone2.addOrReplaceChild("cube_r14", 
/*  60 */         CubeListBuilder.create().texOffs(10, 55).addBox(-1.0F, 0.0F, -2.0F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  61 */         PartPose.offsetAndRotation(-0.375F, 4.5602F, -2.347F, 0.3927F, 0.0F, 0.0F));
/*  62 */     PartDefinition cube_r15 = bone2.addOrReplaceChild("cube_r15", 
/*  63 */         CubeListBuilder.create().texOffs(38, 28).addBox(-4.375F, -5.0F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  64 */         PartPose.offsetAndRotation(2.5F, 2.5602F, -2.347F, -0.1309F, 0.0F, 0.0F));
/*  65 */     PartDefinition bone4 = bone2.addOrReplaceChild("bone4", 
/*  66 */         CubeListBuilder.create().texOffs(56, 40).addBox(-2.0525F, -1.5833F, -2.4923F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
/*  67 */         .texOffs(47, 18).addBox(-2.0525F, -0.5833F, -3.4923F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  68 */         PartPose.offsetAndRotation(0.0525F, 10.533F, -2.629F, 1.0388F, 0.1098F, 0.0034F));
/*  69 */     PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create(), 
/*  70 */         PartPose.offsetAndRotation(2.0F, 21.0F, 0.0F, -1.6583F, -0.1742F, -0.0019F));
/*  71 */     PartDefinition cube_r6 = RightLeg.addOrReplaceChild("cube_r6", 
/*  72 */         CubeListBuilder.create().texOffs(56, 6).addBox(-1.625F, -4.0F, -2.375F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), 
/*  73 */         PartPose.offsetAndRotation(1.0F, 3.85F, 0.0F, -0.0436F, 0.0F, 0.0F));
/*  74 */     PartDefinition cube_r7 = RightLeg.addOrReplaceChild("cube_r7", 
/*  75 */         CubeListBuilder.create().texOffs(0, 40).addBox(-1.625F, -3.0F, -2.375F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), 
/*  76 */         PartPose.offsetAndRotation(0.375F, 3.475F, 0.0F, -0.0436F, 0.0F, 0.0F));
/*  77 */     PartDefinition bone = RightLeg.addOrReplaceChild("bone", CubeListBuilder.create(), 
/*  78 */         PartPose.offsetAndRotation(0.8081F, 4.9895F, 0.0344F, -0.0077F, -0.1744F, 0.3497F));
/*  79 */     PartDefinition cube_r8 = bone.addOrReplaceChild("cube_r8", 
/*  80 */         CubeListBuilder.create().texOffs(18, 43).addBox(0.375F, -5.0F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  81 */         PartPose.offsetAndRotation(-2.0F, 2.0F, 0.0F, -0.1309F, 0.0F, 0.0F));
/*  82 */     PartDefinition cube_r9 = bone.addOrReplaceChild("cube_r9", 
/*  83 */         CubeListBuilder.create().texOffs(24, 55).addBox(-2.0F, 0.0F, -2.0F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  84 */         PartPose.offsetAndRotation(0.875F, 4.0F, 0.0F, 0.3927F, 0.0F, 0.0F));
/*  85 */     PartDefinition cube_r10 = bone.addOrReplaceChild("cube_r10", 
/*  86 */         CubeListBuilder.create().texOffs(47, 58).addBox(-2.0F, -1.0F, -1.0F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/*  87 */         PartPose.offsetAndRotation(0.5F, 6.4398F, 2.347F, -0.7854F, 0.0F, 0.0F));
/*  88 */     PartDefinition bone3 = bone.addOrReplaceChild("bone3", 
/*  89 */         CubeListBuilder.create().texOffs(61, 0).addBox(-1.9365F, -1.5865F, -2.4923F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
/*  90 */         .texOffs(8, 50).addBox(-1.9365F, -0.5865F, -3.4923F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  91 */         PartPose.offsetAndRotation(0.4365F, 9.976F, -0.2821F, 1.4429F, -0.05F, -0.121F));
/*  92 */     PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", 
/*  93 */         CubeListBuilder.create().texOffs(0, 61).addBox(-1.8264F, -1.4152F, -1.5F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/*  94 */         PartPose.offsetAndRotation(-5.0F, 12.0F, 0.0F, -0.9599F, 0.0F, 0.1745F));
/*  95 */     PartDefinition wrist_l = LeftArm.addOrReplaceChild("wrist_l", 
/*  96 */         CubeListBuilder.create().texOffs(45, 0).addBox(-1.6108F, -0.1215F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 27)
/*  97 */         .addBox(1.3892F, 6.8785F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(21, 13)
/*  98 */         .addBox(-1.6108F, 6.8785F, -2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 18)
/*  99 */         .addBox(-1.6108F, 6.8785F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 0)
/* 100 */         .addBox(-1.6108F, 6.8785F, 1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 101 */         PartPose.offsetAndRotation(-1.2155F, 4.7063F, 0.0F, 0.0F, 0.0F, -0.6981F));
/* 102 */     PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", 
/* 103 */         CubeListBuilder.create().texOffs(35, 61).addBox(-1.1736F, -1.4152F, -1.5F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 104 */         PartPose.offsetAndRotation(5.0F, 12.0F, 0.0F, -0.9599F, 0.0F, -0.1745F));
/* 105 */     PartDefinition wrist_r = RightArm.addOrReplaceChild("wrist_r", 
/* 106 */         CubeListBuilder.create().texOffs(14, 27).addBox(-2.3892F, 6.8785F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(27, 17)
/* 107 */         .addBox(-0.3892F, 6.8785F, 1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 30)
/* 108 */         .addBox(-0.3892F, 6.8785F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 30)
/* 109 */         .addBox(-0.3892F, 6.8785F, -2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 48)
/* 110 */         .addBox(-2.3892F, -0.1215F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 111 */         PartPose.offsetAndRotation(1.2155F, 4.7063F, 0.0F, 0.0F, 0.0F, 0.7854F));
/* 112 */     PartDefinition Body = partdefinition.addOrReplaceChild("Body", 
/* 113 */         CubeListBuilder.create().texOffs(19, 0).addBox(-4.0F, 0.6342F, -1.7156F, 8.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(61, 58)
/* 114 */         .addBox(-2.0F, -1.8658F, -0.5906F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 27)
/* 115 */         .addBox(2.0F, -1.3658F, -3.0906F, 3.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 50)
/* 116 */         .addBox(5.0F, -0.3658F, -2.0906F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(48, 42)
/* 117 */         .addBox(-6.0F, -0.3658F, -2.0906F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(50, 51)
/* 118 */         .addBox(-3.0F, -0.1158F, -2.5906F, 6.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(20, 19)
/* 119 */         .addBox(-5.0F, -1.3658F, -3.0906F, 3.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(50, 25)
/* 120 */         .addBox(-4.0F, -0.6158F, 2.7844F, 8.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(47, 13)
/* 121 */         .addBox(-3.5F, 11.6342F, -1.0906F, 7.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(25, 10)
/* 122 */         .addBox(-3.5F, 9.6342F, -1.2156F, 7.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(34, 40)
/* 123 */         .addBox(-3.0F, 5.6342F, -1.2156F, 6.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 124 */         PartPose.offsetAndRotation(0.0F, 10.0F, -1.0F, 0.0873F, 0.0F, 0.0F));
/* 125 */     PartDefinition cube_r2 = Body.addOrReplaceChild("cube_r2", 
/* 126 */         CubeListBuilder.create().texOffs(62, 46).addBox(-3.0F, -3.0F, 1.0F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 127 */         PartPose.offsetAndRotation(0.5F, 4.4764F, 1.4632F, -0.4363F, 0.0F, 0.0F));
/* 128 */     PartDefinition cube_r3 = Body.addOrReplaceChild("cube_r3", 
/* 129 */         CubeListBuilder.create().texOffs(61, 63).addBox(-3.0F, -3.0F, 1.0F, 5.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 130 */         PartPose.offsetAndRotation(0.5F, 8.2264F, 1.2132F, 0.1745F, 0.0F, 0.0F));
/* 131 */     PartDefinition Tail = Body.addOrReplaceChild("Tail", CubeListBuilder.create(), 
/* 132 */         PartPose.offsetAndRotation(0.0F, 9.6342F, 0.7844F, 0.3491F, 0.0F, 0.0F));
/* 133 */     PartDefinition cube_r4 = Tail.addOrReplaceChild("cube_r4", 
/* 134 */         CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -0.875F, -5.375F, 4.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), 
/* 135 */         PartPose.offsetAndRotation(0.0F, 9.3866F, 11.9212F, -0.5236F, 0.0F, 0.0F));
/* 136 */     PartDefinition cube_r5 = Tail.addOrReplaceChild("cube_r5", 
/* 137 */         CubeListBuilder.create().texOffs(14, 32).addBox(-2.0F, -2.0711F, 0.9289F, 4.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), 
/* 138 */         PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
/* 139 */     PartDefinition Head = partdefinition.addOrReplaceChild("Head", 
/* 140 */         CubeListBuilder.create().texOffs(0, 13).addBox(-3.5F, -6.4F, -3.375F, 7.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), 
/* 141 */         PartPose.offset(0.0F, 9.0F, -0.25F));
/* 142 */     PartDefinition Ears = Head.addOrReplaceChild("Ears", CubeListBuilder.create(), PartPose.offset(0.0F, -8.4F, 0.125F));
/* 143 */     PartDefinition cube_r1 = Ears.addOrReplaceChild("cube_r1", 
/* 144 */         CubeListBuilder.create().texOffs(6, 8).addBox(3.5F, -11.0F, 1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 2)
/* 145 */         .addBox(3.5F, -9.0F, 1.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 64)
/* 146 */         .addBox(3.5F, -12.0F, -0.5F, 1.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 13)
/* 147 */         .addBox(3.5F, -6.0F, 1.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(19, 0)
/* 148 */         .addBox(-4.5F, -11.0F, 1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 5)
/* 149 */         .addBox(-4.5F, -9.0F, 1.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(21, 15)
/* 150 */         .addBox(-4.5F, -6.0F, 1.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-4.5F, -12.0F, -0.5F, 1.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), 
/*     */         
/* 152 */         PartPose.offsetAndRotation(0.0F, 9.0F, 0.0F, 0.3927F, 0.0F, 0.0F));
/* 153 */     return LayerDefinition.create(meshdefinition, 80, 80);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 159 */     this.LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 160 */     this.RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 161 */     this.LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 162 */     this.RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 163 */     this.Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 164 */     this.Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */   
/*     */   public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
/* 168 */     this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
/* 169 */     this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + 3.1415927F) * limbSwingAmount;
/* 170 */     this.Head.yRot = netHeadYaw / 57.295776F;
/* 171 */     this.Head.xRot = headPitch / 57.295776F;
/* 172 */     this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
/* 173 */     this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\client\model\ModelProtector_remaster_sit.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */