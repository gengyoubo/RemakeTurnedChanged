/*    */ package net.ltxprogrammer.turned.client.model;
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
/* 24 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("turned", "model_roomba"), "main");
/*    */   public final ModelPart roomba;
/*    */   
/*    */   public ModelRoomba(ModelPart root) {
/* 28 */     this.roomba = root.m_171324_("roomba");
/*    */   }
/*    */   
/*    */   public static LayerDefinition createBodyLayer() {
/* 32 */     MeshDefinition meshdefinition = new MeshDefinition();
/* 33 */     PartDefinition partdefinition = meshdefinition.m_171576_();
/* 34 */     PartDefinition roomba = partdefinition.m_171599_("roomba", CubeListBuilder.m_171558_(), PartPose.m_171419_(-5.0607F, 23.0F, 3.5251F));
/* 35 */     PartDefinition eyes = roomba.m_171599_("eyes", 
/* 36 */         CubeListBuilder.m_171558_().m_171514_(0, 6).m_171488_(-6.0F, -1.0F, -2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(12, 14)
/* 37 */         .m_171488_(-6.0F, -1.0F, -3.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(7, 1)
/* 38 */         .m_171488_(-6.0F, -1.0F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 39 */         PartPose.m_171419_(5.0607F, 1.0F, -3.5251F));
/* 40 */     PartDefinition body = roomba.m_171599_("body", 
/* 41 */         CubeListBuilder.m_171558_().m_171514_(0, 0).m_171488_(1.0607F, -1.0F, -9.5251F, 8.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)).m_171514_(0, 14)
/* 42 */         .m_171488_(9.0607F, -1.0F, -7.5251F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).m_171514_(12, 14)
/* 43 */         .m_171488_(-0.9393F, -1.0F, -0.5251F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(14, 21)
/* 44 */         .m_171488_(-0.9393F, -1.0F, -6.5251F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(0, 14)
/* 45 */         .m_171488_(-0.9393F, -1.0F, -7.5251F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 2)
/* 46 */         .m_171488_(-1.9393F, 1.0F, -1.5251F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 1)
/* 47 */         .m_171488_(-1.9393F, 1.0F, -6.5251F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 0)
/* 48 */         .m_171488_(-1.9393F, 1.0F, -4.0251F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 49 */         PartPose.m_171419_(0.0F, 0.0F, 0.0F));
/* 50 */     PartDefinition cube_r1 = body.m_171599_("cube_r1", 
/* 51 */         CubeListBuilder.m_171558_().m_171514_(0, 5).m_171488_(-2.0F, 1.0F, -2.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(6, 0)
/* 52 */         .m_171488_(-2.0F, 1.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 24).m_171488_(-1.0F, -1.0F, -2.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), 
/*    */         
/* 54 */         PartPose.m_171423_(0.0F, 0.0F, -7.0503F, 0.0F, -0.7854F, 0.0F));
/* 55 */     PartDefinition cube_r2 = body.m_171599_("cube_r2", 
/* 56 */         CubeListBuilder.m_171558_().m_171514_(0, 6).m_171488_(-2.0F, 1.0F, 1.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(6, 1)
/* 57 */         .m_171488_(-2.0F, 1.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 5).m_171488_(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), 
/*    */         
/* 59 */         PartPose.m_171423_(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));
/* 60 */     PartDefinition cube_r3 = body.m_171599_("cube_r3", 
/* 61 */         CubeListBuilder.m_171558_().m_171514_(0, 0).m_171488_(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 62 */         PartPose.m_171423_(10.1213F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));
/* 63 */     PartDefinition cube_r4 = body.m_171599_("cube_r4", 
/* 64 */         CubeListBuilder.m_171558_().m_171514_(22, 14).m_171488_(-1.0F, -1.0F, -2.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), 
/* 65 */         PartPose.m_171423_(10.1213F, 0.0F, -7.0503F, 0.0F, 0.7854F, 0.0F));
/* 66 */     return LayerDefinition.m_171565_(meshdefinition, 64, 64);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void m_6973_(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {}
/*    */ 
/*    */ 
/*    */   
/*    */   public void m_7695_(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 76 */     this.roomba.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\client\model\ModelRoomba.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */