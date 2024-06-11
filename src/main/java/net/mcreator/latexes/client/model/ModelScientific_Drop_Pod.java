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
/*    */ public class ModelScientific_Drop_Pod<T extends Entity>
/*    */   extends EntityModel<T>
/*    */ {
/* 24 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("latex", "model_scientific_drop_pod"), "main");
/*    */   
/*    */   public final ModelPart group;
/*    */   
/*    */   public ModelScientific_Drop_Pod(ModelPart root) {
/* 29 */     this.group = root.getChild("group");
/*    */   }
/*    */   
/*    */   public static LayerDefinition createBodyLayer() {
/* 33 */     MeshDefinition meshdefinition = new MeshDefinition();
/* 34 */     PartDefinition partdefinition = meshdefinition.getRoot();
/* 35 */     PartDefinition group = partdefinition.addOrReplaceChild("group", 
/* 36 */         CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -22.0F, -17.0F, 18.0F, 30.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(76, 93)
/* 37 */         .addBox(0.0F, -22.0F, -0.25F, 16.0F, 29.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 74)
/* 38 */         .addBox(-1.5F, -29.0F, -17.5F, 19.0F, 7.0F, 19.0F, new CubeDeformation(0.0F)).texOffs(72, 0)
/* 39 */         .addBox(-1.5F, 7.0F, -17.5F, 19.0F, 7.0F, 19.0F, new CubeDeformation(0.0F)), 
/* 40 */         PartPose.offset(-8.0F, 16.0F, 8.0F));
/* 41 */     PartDefinition Parachadute = group.addOrReplaceChild("Parachadute", 
/* 42 */         CubeListBuilder.create().texOffs(69, 29).addBox(-12.5F, -45.0F, -9.5F, 25.0F, 5.0F, 19.0F, new CubeDeformation(0.0F)), 
/* 43 */         PartPose.offset(8.0F, -4.5F, -8.0F));
/* 44 */     PartDefinition bone4 = Parachadute.addOrReplaceChild("bone4", 
/* 45 */         CubeListBuilder.create().texOffs(69, 69).addBox(9.71F, -13.9898F, -10.0F, 25.0F, 5.0F, 19.0F, new CubeDeformation(0.0F)), 
/* 46 */         PartPose.offsetAndRotation(-0.5F, -34.0F, 0.5F, 0.0F, 0.0F, 0.2618F));
/* 47 */     PartDefinition bone3 = Parachadute.addOrReplaceChild("bone3", 
/* 48 */         CubeListBuilder.create().texOffs(0, 48).addBox(-34.71F, -13.9898F, -10.0F, 25.0F, 5.0F, 19.0F, new CubeDeformation(0.0F)), 
/* 49 */         PartPose.offsetAndRotation(0.5F, -34.0F, 0.5F, 0.0F, 0.0F, -0.2618F));
/* 50 */     PartDefinition bone = Parachadute.addOrReplaceChild("bone", 
/* 51 */         CubeListBuilder.create().texOffs(12, 100).addBox(-10.0F, -31.0F, 4.0F, 1.0F, 25.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 52 */         PartPose.offsetAndRotation(2.5F, -19.0F, -6.5F, 0.0F, 0.0F, -0.6545F));
/* 53 */     PartDefinition bone2 = Parachadute.addOrReplaceChild("bone2", 
/* 54 */         CubeListBuilder.create().texOffs(0, 100).addBox(9.0F, -31.0F, 4.0F, 1.0F, 25.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 55 */         PartPose.offsetAndRotation(-2.5F, -19.0F, -6.5F, 0.0F, 0.0F, 0.6545F));
/* 56 */     return LayerDefinition.create(meshdefinition, 160, 160);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 62 */     this.group.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*    */   }
/*    */   
/*    */   public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {}
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\client\model\ModelScientific_Drop_Pod.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */