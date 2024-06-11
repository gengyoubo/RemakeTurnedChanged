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
/*    */ public class ModelRoomba<T extends Entity>
/*    */   extends EntityModel<T>
/*    */ {
/* 24 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("latex", "model_roomba"), "main");
/*    */   public final ModelPart roomba;
/*    */   
/*    */   public ModelRoomba(ModelPart root) {
/* 28 */     this.roomba = root.getChild("roomba");
/*    */   }
/*    */   
/*    */   public static LayerDefinition createBodyLayer() {
/* 32 */     MeshDefinition meshdefinition = new MeshDefinition();
/* 33 */     PartDefinition partdefinition = meshdefinition.getRoot();
/* 34 */     PartDefinition roomba = partdefinition.addOrReplaceChild("roomba", CubeListBuilder.create(), PartPose.offset(-5.0607F, 23.0F, 3.5251F));
/* 35 */     PartDefinition eyes = roomba.addOrReplaceChild("eyes", 
/* 36 */         CubeListBuilder.create().texOffs(0, 6).addBox(-6.0F, -1.0F, -2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 14)
/* 37 */         .addBox(-6.0F, -1.0F, -3.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(7, 1)
/* 38 */         .addBox(-6.0F, -1.0F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 39 */         PartPose.offset(5.0607F, 1.0F, -3.5251F));
/* 40 */     PartDefinition body = roomba.addOrReplaceChild("body", 
/* 41 */         CubeListBuilder.create().texOffs(0, 0).addBox(1.0607F, -1.0F, -9.5251F, 8.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 14)
/* 42 */         .addBox(9.0607F, -1.0F, -7.5251F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(12, 14)
/* 43 */         .addBox(-0.9393F, -1.0F, -0.5251F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 21)
/* 44 */         .addBox(-0.9393F, -1.0F, -6.5251F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 14)
/* 45 */         .addBox(-0.9393F, -1.0F, -7.5251F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 2)
/* 46 */         .addBox(-1.9393F, 1.0F, -1.5251F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
/* 47 */         .addBox(-1.9393F, 1.0F, -6.5251F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
/* 48 */         .addBox(-1.9393F, 1.0F, -4.0251F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 49 */         PartPose.offset(0.0F, 0.0F, 0.0F));
/* 50 */     PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1", 
/* 51 */         CubeListBuilder.create().texOffs(0, 5).addBox(-2.0F, 1.0F, -2.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 0)
/* 52 */         .addBox(-2.0F, 1.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 24).addBox(-1.0F, -1.0F, -2.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), 
/*    */         
/* 54 */         PartPose.offsetAndRotation(0.0F, 0.0F, -7.0503F, 0.0F, -0.7854F, 0.0F));
/* 55 */     PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2", 
/* 56 */         CubeListBuilder.create().texOffs(0, 6).addBox(-2.0F, 1.0F, 1.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 1)
/* 57 */         .addBox(-2.0F, 1.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 5).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), 
/*    */         
/* 59 */         PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));
/* 60 */     PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3", 
/* 61 */         CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 62 */         PartPose.offsetAndRotation(10.1213F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));
/* 63 */     PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", 
/* 64 */         CubeListBuilder.create().texOffs(22, 14).addBox(-1.0F, -1.0F, -2.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 65 */         PartPose.offsetAndRotation(10.1213F, 0.0F, -7.0503F, 0.0F, 0.7854F, 0.0F));
/* 66 */     return LayerDefinition.create(meshdefinition, 64, 64);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {}
/*    */ 
/*    */ 
/*    */   
/*    */   public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 76 */     this.roomba.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\client\model\ModelRoomba.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */