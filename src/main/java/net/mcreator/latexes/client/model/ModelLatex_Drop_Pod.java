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
/*    */ public class ModelLatex_Drop_Pod<T extends Entity>
/*    */   extends EntityModel<T>
/*    */ {
/* 24 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("latex", "model_latex_drop_pod"), "main");
/*    */   public final ModelPart group;
/*    */   
/*    */   public ModelLatex_Drop_Pod(ModelPart root) {
/* 28 */     this.group = root.getChild("group");
/*    */   }
/*    */   
/*    */   public static LayerDefinition createBodyLayer() {
/* 32 */     MeshDefinition meshdefinition = new MeshDefinition();
/* 33 */     PartDefinition partdefinition = meshdefinition.getRoot();
/* 34 */     PartDefinition group = partdefinition.addOrReplaceChild("group", 
/* 35 */         CubeListBuilder.create().texOffs(100, 100).addBox(15.0F, -22.0F, -17.0F, 2.0F, 30.0F, 18.0F, new CubeDeformation(0.0F))
/* 36 */         .texOffs(60, 95).addBox(-1.0F, -22.0F, -17.0F, 2.0F, 30.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(88, 31)
/* 37 */         .addBox(0.0F, -22.0F, -17.0F, 15.0F, 30.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(45, 72)
/* 38 */         .addBox(0.0F, -1.0F, -0.25F, 16.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
/* 39 */         .addBox(12.0F, -9.0F, -0.25F, 4.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 15)
/* 40 */         .addBox(6.0F, -3.0F, -0.25F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 31)
/* 41 */         .addBox(8.0F, -4.0F, -0.25F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 5)
/* 42 */         .addBox(11.0F, -5.0F, -0.25F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(69, 0)
/* 43 */         .addBox(0.0F, -22.0F, -0.25F, 16.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(69, 63)
/* 44 */         .addBox(0.0F, -20.0F, -0.25F, 11.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(45, 82)
/* 45 */         .addBox(0.0F, -18.0F, -0.25F, 10.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 10)
/* 46 */         .addBox(0.0F, -16.0F, -0.25F, 6.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 24)
/* 47 */         .addBox(0.0F, -13.0F, -0.25F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 0)
/* 48 */         .addBox(3.0F, -13.0F, -0.25F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(10, 24)
/* 49 */         .addBox(6.0F, -16.0F, -0.25F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(69, 5)
/* 50 */         .addBox(-1.5F, -29.0F, -17.5F, 19.0F, 7.0F, 19.0F, new CubeDeformation(0.0F)).texOffs(69, 69)
/* 51 */         .addBox(-1.5F, 7.0F, -17.5F, 19.0F, 7.0F, 19.0F, new CubeDeformation(0.0F)).texOffs(0, 72)
/* 52 */         .addBox(0.5F, -21.0F, -15.5F, 15.0F, 28.0F, 15.0F, new CubeDeformation(0.0F)), 
/* 53 */         PartPose.offset(-8.0F, 16.0F, 8.0F));
/* 54 */     PartDefinition Parachadute = group.addOrReplaceChild("Parachadute", 
/* 55 */         CubeListBuilder.create().texOffs(0, 48).addBox(-12.5F, -45.0F, -9.5F, 25.0F, 5.0F, 19.0F, new CubeDeformation(0.0F)), 
/* 56 */         PartPose.offset(8.0F, -4.0F, -8.0F));
/* 57 */     PartDefinition bone4 = Parachadute.addOrReplaceChild("bone4", 
/* 58 */         CubeListBuilder.create().texOffs(0, 24).addBox(9.71F, -13.9898F, -10.0F, 25.0F, 5.0F, 19.0F, new CubeDeformation(0.0F)), 
/* 59 */         PartPose.offsetAndRotation(-0.5F, -34.0F, 0.5F, 0.0F, 0.0F, 0.2618F));
/* 60 */     PartDefinition bone3 = Parachadute.addOrReplaceChild("bone3", 
/* 61 */         CubeListBuilder.create().texOffs(0, 0).addBox(-34.71F, -13.9898F, -10.0F, 25.0F, 5.0F, 19.0F, new CubeDeformation(0.0F)), 
/* 62 */         PartPose.offsetAndRotation(0.5F, -34.0F, 0.5F, 0.0F, 0.0F, -0.2618F));
/* 63 */     PartDefinition bone = Parachadute.addOrReplaceChild("bone", 
/* 64 */         CubeListBuilder.create().texOffs(12, 115).addBox(-10.0F, -31.0F, 4.0F, 1.0F, 25.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 65 */         PartPose.offsetAndRotation(2.5F, -19.0F, -6.5F, 0.0F, 0.0F, -0.6545F));
/* 66 */     PartDefinition bone2 = Parachadute.addOrReplaceChild("bone2", 
/* 67 */         CubeListBuilder.create().texOffs(0, 115).addBox(9.0F, -31.0F, 4.0F, 1.0F, 25.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 68 */         PartPose.offsetAndRotation(-2.5F, -19.0F, -6.5F, 0.0F, 0.0F, 0.6545F));
/* 69 */     return LayerDefinition.create(meshdefinition, 160, 160);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 75 */     this.group.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*    */   }
/*    */   
/*    */   public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {}
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\client\model\ModelLatex_Drop_Pod.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */