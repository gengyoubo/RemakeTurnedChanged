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
/*     */ public class ModelSlimeling_remaster_sit<T extends Entity>
/*     */   extends EntityModel<T>
/*     */ {
/*  24 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("latex", "model_slimeling_remaster_sit"), "main");
/*     */   
/*     */   public final ModelPart LeftLeg;
/*     */   public final ModelPart RightLeg;
/*     */   public final ModelPart LeftArm;
/*     */   public final ModelPart RightArm;
/*     */   public final ModelPart Body;
/*     */   public final ModelPart Head;
/*     */   
/*     */   public ModelSlimeling_remaster_sit(ModelPart root) {
/*  34 */     this.LeftLeg = root.getChild("LeftLeg");
/*  35 */     this.RightLeg = root.getChild("RightLeg");
/*  36 */     this.LeftArm = root.getChild("LeftArm");
/*  37 */     this.RightArm = root.getChild("RightArm");
/*  38 */     this.Body = root.getChild("Body");
/*  39 */     this.Head = root.getChild("Head");
/*     */   }
/*     */   
/*     */   public static LayerDefinition createBodyLayer() {
/*  43 */     MeshDefinition meshdefinition = new MeshDefinition();
/*  44 */     PartDefinition partdefinition = meshdefinition.getRoot();
/*  45 */     PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create(), 
/*  46 */         PartPose.offsetAndRotation(-2.0F, 21.0F, 0.0F, -1.6583F, 0.1307F, 0.0F));
/*  47 */     PartDefinition cube_r11 = LeftLeg.addOrReplaceChild("cube_r11", 
/*  48 */         CubeListBuilder.create().texOffs(52, 18).addBox(-1.375F, -4.0F, -2.375F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), 
/*  49 */         PartPose.offsetAndRotation(-1.0F, 3.85F, 0.0F, -0.0436F, 0.0F, 0.0F));
/*  50 */     PartDefinition cube_r12 = LeftLeg.addOrReplaceChild("cube_r12", 
/*  51 */         CubeListBuilder.create().texOffs(34, 17).addBox(-2.375F, -3.0F, -2.375F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), 
/*  52 */         PartPose.offsetAndRotation(-0.375F, 3.475F, 0.0F, -0.0436F, 0.0F, 0.0F));
/*  53 */     PartDefinition bone2 = LeftLeg.addOrReplaceChild("bone2", CubeListBuilder.create(), 
/*  54 */         PartPose.offsetAndRotation(-1.25F, 4.0398F, 2.347F, -0.0019F, 0.0436F, -0.2618F));
/*  55 */     PartDefinition cube_r13 = bone2.addOrReplaceChild("cube_r13", 
/*  56 */         CubeListBuilder.create().texOffs(54, 31).addBox(-2.0F, -1.0F, -1.0F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/*  57 */         PartPose.offsetAndRotation(0.0F, 7.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
/*  58 */     PartDefinition cube_r14 = bone2.addOrReplaceChild("cube_r14", 
/*  59 */         CubeListBuilder.create().texOffs(10, 55).addBox(-1.0F, 0.0F, -2.0F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  60 */         PartPose.offsetAndRotation(-0.375F, 4.5602F, -2.347F, 0.3927F, 0.0F, 0.0F));
/*  61 */     PartDefinition cube_r15 = bone2.addOrReplaceChild("cube_r15", 
/*  62 */         CubeListBuilder.create().texOffs(38, 28).addBox(-4.375F, -5.0F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  63 */         PartPose.offsetAndRotation(2.5F, 2.5602F, -2.347F, -0.1309F, 0.0F, 0.0F));
/*  64 */     PartDefinition bone4 = bone2.addOrReplaceChild("bone4", 
/*  65 */         CubeListBuilder.create().texOffs(56, 40).addBox(-2.0525F, -1.5833F, -2.4923F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
/*  66 */         .texOffs(47, 18).addBox(-2.0525F, -0.5833F, -3.4923F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  67 */         PartPose.offsetAndRotation(0.0525F, 10.533F, -2.629F, 1.0388F, 0.1098F, 0.0034F));
/*  68 */     PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create(), 
/*  69 */         PartPose.offsetAndRotation(2.0F, 21.0F, 0.0F, -1.6583F, -0.1742F, -0.0019F));
/*  70 */     PartDefinition cube_r6 = RightLeg.addOrReplaceChild("cube_r6", 
/*  71 */         CubeListBuilder.create().texOffs(56, 6).addBox(-1.625F, -4.0F, -2.375F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), 
/*  72 */         PartPose.offsetAndRotation(1.0F, 3.85F, 0.0F, -0.0436F, 0.0F, 0.0F));
/*  73 */     PartDefinition cube_r7 = RightLeg.addOrReplaceChild("cube_r7", 
/*  74 */         CubeListBuilder.create().texOffs(0, 40).addBox(-1.625F, -3.0F, -2.375F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), 
/*  75 */         PartPose.offsetAndRotation(0.375F, 3.475F, 0.0F, -0.0436F, 0.0F, 0.0F));
/*  76 */     PartDefinition bone = RightLeg.addOrReplaceChild("bone", CubeListBuilder.create(), 
/*  77 */         PartPose.offsetAndRotation(0.8081F, 4.9895F, 0.0344F, -0.0077F, -0.1744F, 0.3497F));
/*  78 */     PartDefinition cube_r8 = bone.addOrReplaceChild("cube_r8", 
/*  79 */         CubeListBuilder.create().texOffs(18, 43).addBox(0.375F, -5.0F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  80 */         PartPose.offsetAndRotation(-2.0F, 2.0F, 0.0F, -0.1309F, 0.0F, 0.0F));
/*  81 */     PartDefinition cube_r9 = bone.addOrReplaceChild("cube_r9", 
/*  82 */         CubeListBuilder.create().texOffs(24, 55).addBox(-2.0F, 0.0F, -2.0F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), 
/*  83 */         PartPose.offsetAndRotation(0.875F, 4.0F, 0.0F, 0.3927F, 0.0F, 0.0F));
/*  84 */     PartDefinition cube_r10 = bone.addOrReplaceChild("cube_r10", 
/*  85 */         CubeListBuilder.create().texOffs(47, 58).addBox(-2.0F, -1.0F, -1.0F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/*  86 */         PartPose.offsetAndRotation(0.5F, 6.4398F, 2.347F, -0.7854F, 0.0F, 0.0F));
/*  87 */     PartDefinition bone3 = bone.addOrReplaceChild("bone3", 
/*  88 */         CubeListBuilder.create().texOffs(61, 0).addBox(-1.9365F, -1.5865F, -2.4923F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
/*  89 */         .texOffs(8, 50).addBox(-1.9365F, -0.5865F, -3.4923F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  90 */         PartPose.offsetAndRotation(0.4365F, 9.976F, -0.2821F, 1.4429F, -0.05F, -0.121F));
/*  91 */     PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", 
/*  92 */         CubeListBuilder.create().texOffs(0, 61).addBox(-1.8264F, -1.4152F, -1.5F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/*  93 */         PartPose.offsetAndRotation(-5.0F, 12.0F, 0.0F, -0.9599F, 0.0F, 0.1745F));
/*  94 */     PartDefinition wrist_l = LeftArm.addOrReplaceChild("wrist_l", 
/*  95 */         CubeListBuilder.create().texOffs(45, 0).addBox(-1.6108F, -0.1215F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 27)
/*  96 */         .addBox(1.3892F, 6.8785F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(21, 13)
/*  97 */         .addBox(-1.6108F, 6.8785F, -2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 18)
/*  98 */         .addBox(-1.6108F, 6.8785F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 0)
/*  99 */         .addBox(-1.6108F, 6.8785F, 1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 100 */         PartPose.offsetAndRotation(-1.2155F, 4.7063F, 0.0F, 0.0F, 0.0F, -0.6981F));
/* 101 */     PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", 
/* 102 */         CubeListBuilder.create().texOffs(35, 61).addBox(-1.1736F, -1.4152F, -1.5F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 103 */         PartPose.offsetAndRotation(5.0F, 12.0F, 0.0F, -0.9599F, 0.0F, -0.1745F));
/* 104 */     PartDefinition wrist_r = RightArm.addOrReplaceChild("wrist_r", 
/* 105 */         CubeListBuilder.create().texOffs(14, 27).addBox(-2.3892F, 6.8785F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(27, 17)
/* 106 */         .addBox(-0.3892F, 6.8785F, 1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 30)
/* 107 */         .addBox(-0.3892F, 6.8785F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 30)
/* 108 */         .addBox(-0.3892F, 6.8785F, -2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 48)
/* 109 */         .addBox(-2.3892F, -0.1215F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 110 */         PartPose.offsetAndRotation(1.2155F, 4.7063F, 0.0F, 0.0F, 0.0F, 0.7854F));
/* 111 */     PartDefinition Body = partdefinition.addOrReplaceChild("Body", 
/* 112 */         CubeListBuilder.create().texOffs(19, 0).addBox(-4.0F, 0.6342F, -1.7156F, 8.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(61, 58)
/* 113 */         .addBox(-2.0F, -1.8658F, -0.5906F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 27)
/* 114 */         .addBox(2.0F, -1.3658F, -3.0906F, 3.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 50)
/* 115 */         .addBox(5.0F, -0.3658F, -2.0906F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(48, 42)
/* 116 */         .addBox(-6.0F, -0.3658F, -2.0906F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(50, 51)
/* 117 */         .addBox(-3.0F, -0.1158F, -2.5906F, 6.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(20, 19)
/* 118 */         .addBox(-5.0F, -1.3658F, -3.0906F, 3.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(50, 25)
/* 119 */         .addBox(-4.0F, -0.6158F, 2.7844F, 8.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(47, 13)
/* 120 */         .addBox(-3.5F, 11.6342F, -1.0906F, 7.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(25, 10)
/* 121 */         .addBox(-3.5F, 9.6342F, -1.2156F, 7.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(34, 40)
/* 122 */         .addBox(-3.0F, 5.6342F, -1.2156F, 6.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), 
/* 123 */         PartPose.offsetAndRotation(0.0F, 10.0F, -1.0F, 0.0873F, 0.0F, 0.0F));
/* 124 */     PartDefinition cube_r2 = Body.addOrReplaceChild("cube_r2", 
/* 125 */         CubeListBuilder.create().texOffs(62, 46).addBox(-3.0F, -3.0F, 1.0F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 126 */         PartPose.offsetAndRotation(0.5F, 4.4764F, 1.4632F, -0.4363F, 0.0F, 0.0F));
/* 127 */     PartDefinition cube_r3 = Body.addOrReplaceChild("cube_r3", 
/* 128 */         CubeListBuilder.create().texOffs(61, 63).addBox(-3.0F, -3.0F, 1.0F, 5.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 129 */         PartPose.offsetAndRotation(0.5F, 8.2264F, 1.2132F, 0.1745F, 0.0F, 0.0F));
/* 130 */     PartDefinition Tail = Body.addOrReplaceChild("Tail", CubeListBuilder.create(), 
/* 131 */         PartPose.offsetAndRotation(0.0F, 9.6342F, 0.7844F, 0.3491F, 0.0F, 0.0F));
/* 132 */     PartDefinition cube_r4 = Tail.addOrReplaceChild("cube_r4", 
/* 133 */         CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -0.875F, -5.375F, 4.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), 
/* 134 */         PartPose.offsetAndRotation(0.0F, 9.3866F, 11.9212F, -0.5236F, 0.0F, 0.0F));
/* 135 */     PartDefinition cube_r5 = Tail.addOrReplaceChild("cube_r5", 
/* 136 */         CubeListBuilder.create().texOffs(14, 32).addBox(-2.0F, -2.0711F, 0.9289F, 4.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), 
/* 137 */         PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
/* 138 */     PartDefinition Head = partdefinition.addOrReplaceChild("Head", 
/* 139 */         CubeListBuilder.create().texOffs(0, 13).addBox(-3.5F, -6.4F, -3.375F, 7.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), 
/* 140 */         PartPose.offset(0.0F, 9.0F, -0.25F));
/* 141 */     PartDefinition Ears = Head.addOrReplaceChild("Ears", CubeListBuilder.create(), PartPose.offset(0.0F, -8.4F, 0.125F));
/* 142 */     PartDefinition cube_r1 = Ears.addOrReplaceChild("cube_r1", 
/* 143 */         CubeListBuilder.create().texOffs(6, 8).addBox(3.5F, -11.0F, 1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 2)
/* 144 */         .addBox(3.5F, -9.0F, 1.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 64)
/* 145 */         .addBox(3.5F, -12.0F, -0.5F, 1.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 13)
/* 146 */         .addBox(3.5F, -6.0F, 1.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(19, 0)
/* 147 */         .addBox(-4.5F, -11.0F, 1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 5)
/* 148 */         .addBox(-4.5F, -9.0F, 1.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(21, 15)
/* 149 */         .addBox(-4.5F, -6.0F, 1.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-4.5F, -12.0F, -0.5F, 1.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), 
/*     */         
/* 151 */         PartPose.offsetAndRotation(0.0F, 9.0F, 0.0F, 0.3927F, 0.0F, 0.0F));
/* 152 */     return LayerDefinition.create(meshdefinition, 80, 80);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 158 */     this.LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 159 */     this.RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 160 */     this.LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 161 */     this.RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 162 */     this.Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 163 */     this.Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */   
/*     */   public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
/* 167 */     this.Head.yRot = netHeadYaw / 57.295776F;
/* 168 */     this.Head.xRot = headPitch / 57.295776F;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\client\model\ModelSlimeling_remaster_sit.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */