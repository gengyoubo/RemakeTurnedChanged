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
/*    */ import net.minecraft.util.Mth;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Modeldl_slug_model<T extends Entity>
/*    */   extends EntityModel<T>
/*    */ {
/* 25 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("latex", "modeldl_slug_model"), "main");
/*    */   public final ModelPart Head;
/*    */   public final ModelPart Body;
/*    */   public final ModelPart leftarm;
/*    */   public final ModelPart Rightarm;
/*    */   
/*    */   public Modeldl_slug_model(ModelPart root) {
/* 32 */     this.Head = root.getChild("Head");
/* 33 */     this.Body = root.getChild("Body");
/* 34 */     this.leftarm = root.getChild("leftarm");
/* 35 */     this.Rightarm = root.getChild("Rightarm");
/*    */   }
/*    */   
/*    */   public static LayerDefinition createBodyLayer() {
/* 39 */     MeshDefinition meshdefinition = new MeshDefinition();
/* 40 */     PartDefinition partdefinition = meshdefinition.getRoot();
/* 41 */     PartDefinition Head = partdefinition.addOrReplaceChild("Head", 
/* 42 */         CubeListBuilder.create().texOffs(0, 12).addBox(-2.0F, -3.0F, -2.75F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(19, 4)
/* 43 */         .addBox(-2.0F, -3.0F, -3.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(2, 5)
/* 44 */         .addBox(2.0F, -2.0F, -3.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(19, 5)
/* 45 */         .addBox(-2.0F, -1.0F, -3.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(4, 3)
/* 46 */         .addBox(1.0F, 0.0F, -3.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(4, 4)
/* 47 */         .addBox(-2.0F, 0.0F, -3.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 4)
/* 48 */         .addBox(-1.0F, -2.0F, -3.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 5)
/* 49 */         .addBox(-3.0F, -2.0F, -3.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 3)
/* 50 */         .addBox(-1.0F, -4.0F, -3.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), 
/* 51 */         PartPose.offset(0.0F, 21.0F, -4.25F));
/* 52 */     PartDefinition Body = partdefinition.addOrReplaceChild("Body", 
/* 53 */         CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -2.0F, -0.75F, 6.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(16, 16)
/* 54 */         .addBox(-2.0F, -1.0F, 6.25F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 20)
/* 55 */         .addBox(-1.0F, 0.0F, 8.25F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
/* 56 */         .addBox(-1.0F, 1.0F, 10.25F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 57 */         PartPose.offset(0.0F, 21.0F, -4.25F));
/* 58 */     PartDefinition leftarm = partdefinition.addOrReplaceChild("leftarm", 
/* 59 */         CubeListBuilder.create().texOffs(19, 0).addBox(1.0F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), 
/* 60 */         PartPose.offset(2.0F, 23.0F, -3.0F));
/* 61 */     PartDefinition Rightarm = partdefinition.addOrReplaceChild("Rightarm", 
/* 62 */         CubeListBuilder.create().texOffs(12, 12).addBox(-4.0F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), 
/* 63 */         PartPose.offset(-2.0F, 23.0F, -3.0F));
/* 64 */     return LayerDefinition.create(meshdefinition, 32, 32);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 70 */     this.Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 71 */     this.Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 72 */     this.leftarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 73 */     this.Rightarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*    */   }
/*    */   
/*    */   public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
/* 77 */     this.Rightarm.xRot = Mth.cos(limbSwing * 0.6662F + 3.1415927F) * limbSwingAmount;
/* 78 */     this.Head.yRot = netHeadYaw / 57.295776F;
/* 79 */     this.Head.xRot = headPitch / 57.295776F;
/* 80 */     this.leftarm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\client\model\Modeldl_slug_model.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */