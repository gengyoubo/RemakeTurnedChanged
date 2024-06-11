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
/*    */ public class Modeldrop_pod<T extends Entity>
/*    */   extends EntityModel<T>
/*    */ {
/* 24 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("turned", "modeldrop_pod"), "main");
/*    */   public final ModelPart Drop_pod;
/*    */   
/*    */   public Modeldrop_pod(ModelPart root) {
/* 28 */     this.Drop_pod = root.m_171324_("Drop_pod");
/*    */   }
/*    */   
/*    */   public static LayerDefinition createBodyLayer() {
/* 32 */     MeshDefinition meshdefinition = new MeshDefinition();
/* 33 */     PartDefinition partdefinition = meshdefinition.m_171576_();
/* 34 */     PartDefinition Drop_pod = partdefinition.m_171599_("Drop_pod", 
/* 35 */         CubeListBuilder.m_171558_().m_171514_(44, 44).m_171488_(-10.0F, -7.0F, -10.0F, 20.0F, 5.0F, 20.0F, new CubeDeformation(0.0F)).m_171514_(32, 46)
/* 36 */         .m_171488_(-3.0F, -48.0F, -3.0F, 6.0F, 11.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(72, 0)
/* 37 */         .m_171488_(-1.0F, -65.0F, -1.0F, 2.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(0, 0)
/* 38 */         .m_171488_(-8.0F, -37.0F, -8.0F, 16.0F, 30.0F, 16.0F, new CubeDeformation(0.0F)).m_171514_(114, 57)
/* 39 */         .m_171488_(6.0F, -38.0F, -6.0F, 3.0F, 31.0F, 12.0F, new CubeDeformation(0.0F)).m_171514_(126, 126)
/* 40 */         .m_171488_(-6.0F, -38.0F, -9.0F, 12.0F, 31.0F, 3.0F, new CubeDeformation(0.0F)).m_171514_(96, 96)
/* 41 */         .m_171488_(-9.0F, -38.0F, -6.0F, 3.0F, 31.0F, 12.0F, new CubeDeformation(0.0F)).m_171514_(29, 139)
/* 42 */         .m_171488_(-6.0F, -38.0F, 6.0F, 12.0F, 31.0F, 3.0F, new CubeDeformation(0.0F)).m_171514_(64, 0)
/* 43 */         .m_171488_(-10.0F, -2.0F, -10.0F, 20.0F, 2.0F, 20.0F, new CubeDeformation(0.0F)).m_171514_(64, 22)
/* 44 */         .m_171488_(-6.0F, 0.0F, -6.0F, 12.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)).m_171514_(48, 0)
/* 45 */         .m_171488_(-3.0F, 2.0F, -3.0F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(0, 0)
/* 46 */         .m_171488_(-1.0F, 4.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(104, 45)
/* 47 */         .m_171488_(-10.0F, -2.0F, 10.0F, 20.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(104, 22)
/* 48 */         .m_171488_(-12.0F, -2.0F, -10.0F, 2.0F, 3.0F, 20.0F, new CubeDeformation(0.0F)).m_171514_(64, 36)
/* 49 */         .m_171488_(-10.0F, -2.0F, -12.0F, 20.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(32, 116)
/* 50 */         .m_171488_(10.0F, -2.0F, -10.0F, 2.0F, 3.0F, 20.0F, new CubeDeformation(0.0F)), 
/* 51 */         PartPose.m_171419_(0.0F, 24.0F, 0.0F));
/* 52 */     PartDefinition bone3 = Drop_pod.m_171599_("bone3", 
/* 53 */         CubeListBuilder.m_171558_().m_171514_(64, 69).m_171488_(-7.0F, -45.4809F, -13.89F, 14.0F, 45.0F, 2.0F, new CubeDeformation(0.0F)), 
/* 54 */         PartPose.m_171423_(0.0F, 0.0F, 1.0F, -0.0873F, 0.0F, 0.0F));
/* 55 */     PartDefinition bone4 = Drop_pod.m_171599_("bone4", 
/* 56 */         CubeListBuilder.m_171558_().m_171514_(32, 69).m_171488_(-7.0F, -45.4809F, -13.89F, 14.0F, 45.0F, 2.0F, new CubeDeformation(0.0F)), 
/* 57 */         PartPose.m_171423_(1.0F, 0.0F, 0.0F, -0.0873F, 1.5708F, 0.0F));
/* 58 */     PartDefinition bone2 = Drop_pod.m_171599_("bone2", 
/* 59 */         CubeListBuilder.m_171558_().m_171514_(0, 93).m_171488_(-7.0F, -45.4809F, 9.89F, 14.0F, 45.0F, 2.0F, new CubeDeformation(0.0F)), 
/* 60 */         PartPose.m_171423_(0.0F, 0.0F, 1.0F, 0.0873F, 0.0F, 0.0F));
/* 61 */     PartDefinition bone5 = Drop_pod.m_171599_("bone5", 
/* 62 */         CubeListBuilder.m_171558_().m_171514_(0, 46).m_171488_(-6.0F, -45.3937F, 10.8862F, 14.0F, 45.0F, 2.0F, new CubeDeformation(0.0F)), 
/* 63 */         PartPose.m_171423_(0.0F, 0.0F, 1.0F, 0.0F, 1.5708F, -0.0873F));
/* 64 */     return LayerDefinition.m_171565_(meshdefinition, 256, 256);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void m_7695_(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 70 */     this.Drop_pod.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*    */   }
/*    */   
/*    */   public void m_6973_(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {}
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\client\model\Modeldrop_pod.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */