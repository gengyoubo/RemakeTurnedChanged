/*    */ package net.mcreator.latexes.client.model;
/*    */ 
/*    */ import com.mojang.blaze3d.vertex.PoseStack;
/*    */ import com.mojang.blaze3d.vertex.VertexConsumer;
/*    */ import net.minecraft.client.model.EntityModel;
/*    */ import net.minecraft.client.model.geom.ModelLayerLocation;
/*    */ import net.minecraft.client.model.geom.ModelPart;
/*    */ import net.minecraft.client.model.geom.PartPose;
/*    */ import net.minecraft.client.model.geom.builders.CubeDeformation;
/*    */ import net.minecraft.client.model.geom.builders.CubeListBuilder;
/*    */ import net.minecraft.client.model.geom.builders.LayerDefinition;
/*    */ import net.minecraft.client.model.geom.builders.MeshDefinition;
/*    */ import net.minecraft.client.model.geom.builders.PartDefinition;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Modeldrop_pod<T extends Entity>
/*    */   extends EntityModel<T>
/*    */ {
/* 24 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("latex", "modeldrop_pod"), "main");
/*    */   public final ModelPart Drop_pod;
/*    */   
/*    */   public Modeldrop_pod(ModelPart root) {
/* 28 */     this.Drop_pod = root.getChild("Drop_pod");
/*    */   }
/*    */   
/*    */   public static LayerDefinition createBodyLayer() {
/* 32 */     MeshDefinition meshdefinition = new MeshDefinition();
/* 33 */     PartDefinition partdefinition = meshdefinition.getRoot();
/* 34 */     PartDefinition Drop_pod = partdefinition.addOrReplaceChild("Drop_pod", 
/* 35 */         CubeListBuilder.create().texOffs(44, 44).addBox(-10.0F, -7.0F, -10.0F, 20.0F, 5.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(32, 46)
/* 36 */         .addBox(-3.0F, -48.0F, -3.0F, 6.0F, 11.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(72, 0)
/* 37 */         .addBox(-1.0F, -65.0F, -1.0F, 2.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
/* 38 */         .addBox(-8.0F, -37.0F, -8.0F, 16.0F, 30.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(114, 57)
/* 39 */         .addBox(6.0F, -38.0F, -6.0F, 3.0F, 31.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(126, 126)
/* 40 */         .addBox(-6.0F, -38.0F, -9.0F, 12.0F, 31.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(96, 96)
/* 41 */         .addBox(-9.0F, -38.0F, -6.0F, 3.0F, 31.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(29, 139)
/* 42 */         .addBox(-6.0F, -38.0F, 6.0F, 12.0F, 31.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(64, 0)
/* 43 */         .addBox(-10.0F, -2.0F, -10.0F, 20.0F, 2.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(64, 22)
/* 44 */         .addBox(-6.0F, 0.0F, -6.0F, 12.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
/* 45 */         .addBox(-3.0F, 2.0F, -3.0F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
/* 46 */         .addBox(-1.0F, 4.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(104, 45)
/* 47 */         .addBox(-10.0F, -2.0F, 10.0F, 20.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(104, 22)
/* 48 */         .addBox(-12.0F, -2.0F, -10.0F, 2.0F, 3.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(64, 36)
/* 49 */         .addBox(-10.0F, -2.0F, -12.0F, 20.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(32, 116)
/* 50 */         .addBox(10.0F, -2.0F, -10.0F, 2.0F, 3.0F, 20.0F, new CubeDeformation(0.0F)), 
/* 51 */         PartPose.offset(0.0F, 24.0F, 0.0F));
/* 52 */     PartDefinition bone3 = Drop_pod.addOrReplaceChild("bone3", 
/* 53 */         CubeListBuilder.create().texOffs(64, 69).addBox(-7.0F, -45.4809F, -13.89F, 14.0F, 45.0F, 2.0F, new CubeDeformation(0.0F)), 
/* 54 */         PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, -0.0873F, 0.0F, 0.0F));
/* 55 */     PartDefinition bone4 = Drop_pod.addOrReplaceChild("bone4", 
/* 56 */         CubeListBuilder.create().texOffs(32, 69).addBox(-7.0F, -45.4809F, -13.89F, 14.0F, 45.0F, 2.0F, new CubeDeformation(0.0F)), 
/* 57 */         PartPose.offsetAndRotation(1.0F, 0.0F, 0.0F, -0.0873F, 1.5708F, 0.0F));
/* 58 */     PartDefinition bone2 = Drop_pod.addOrReplaceChild("bone2", 
/* 59 */         CubeListBuilder.create().texOffs(0, 93).addBox(-7.0F, -45.4809F, 9.89F, 14.0F, 45.0F, 2.0F, new CubeDeformation(0.0F)), 
/* 60 */         PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, 0.0873F, 0.0F, 0.0F));
/* 61 */     PartDefinition bone5 = Drop_pod.addOrReplaceChild("bone5", 
/* 62 */         CubeListBuilder.create().texOffs(0, 46).addBox(-6.0F, -45.3937F, 10.8862F, 14.0F, 45.0F, 2.0F, new CubeDeformation(0.0F)), 
/* 63 */         PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, 0.0F, 1.5708F, -0.0873F));
/* 64 */     return LayerDefinition.create(meshdefinition, 256, 256);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 70 */     this.Drop_pod.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*    */   }
/*    */   
/*    */   public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {}
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\client\model\Modeldrop_pod.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */