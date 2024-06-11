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
/*    */ public class ModelScientific_Drop_Pod<T extends Entity>
/*    */   extends EntityModel<T>
/*    */ {
/* 24 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("turned", "model_scientific_drop_pod"), "main");
/*    */   
/*    */   public final ModelPart group;
/*    */   
/*    */   public ModelScientific_Drop_Pod(ModelPart root) {
/* 29 */     this.group = root.m_171324_("group");
/*    */   }
/*    */   
/*    */   public static LayerDefinition createBodyLayer() {
/* 33 */     MeshDefinition meshdefinition = new MeshDefinition();
/* 34 */     PartDefinition partdefinition = meshdefinition.m_171576_();
/* 35 */     PartDefinition group = partdefinition.m_171599_("group", 
/* 36 */         CubeListBuilder.m_171558_().m_171514_(0, 0).m_171488_(-1.0F, -22.0F, -17.0F, 18.0F, 30.0F, 18.0F, new CubeDeformation(0.0F)).m_171514_(76, 93)
/* 37 */         .m_171488_(0.0F, -22.0F, -0.25F, 16.0F, 29.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(0, 74)
/* 38 */         .m_171488_(-1.5F, -29.0F, -17.5F, 19.0F, 7.0F, 19.0F, new CubeDeformation(0.0F)).m_171514_(72, 0)
/* 39 */         .m_171488_(-1.5F, 7.0F, -17.5F, 19.0F, 7.0F, 19.0F, new CubeDeformation(0.0F)), 
/* 40 */         PartPose.m_171419_(-8.0F, 16.0F, 8.0F));
/* 41 */     PartDefinition Parachadute = group.m_171599_("Parachadute", 
/* 42 */         CubeListBuilder.m_171558_().m_171514_(69, 29).m_171488_(-12.5F, -45.0F, -9.5F, 25.0F, 5.0F, 19.0F, new CubeDeformation(0.0F)), 
/* 43 */         PartPose.m_171419_(8.0F, -4.5F, -8.0F));
/* 44 */     PartDefinition bone4 = Parachadute.m_171599_("bone4", 
/* 45 */         CubeListBuilder.m_171558_().m_171514_(69, 69).m_171488_(9.71F, -13.9898F, -10.0F, 25.0F, 5.0F, 19.0F, new CubeDeformation(0.0F)), 
/* 46 */         PartPose.m_171423_(-0.5F, -34.0F, 0.5F, 0.0F, 0.0F, 0.2618F));
/* 47 */     PartDefinition bone3 = Parachadute.m_171599_("bone3", 
/* 48 */         CubeListBuilder.m_171558_().m_171514_(0, 48).m_171488_(-34.71F, -13.9898F, -10.0F, 25.0F, 5.0F, 19.0F, new CubeDeformation(0.0F)), 
/* 49 */         PartPose.m_171423_(0.5F, -34.0F, 0.5F, 0.0F, 0.0F, -0.2618F));
/* 50 */     PartDefinition bone = Parachadute.m_171599_("bone", 
/* 51 */         CubeListBuilder.m_171558_().m_171514_(12, 100).m_171488_(-10.0F, -31.0F, 4.0F, 1.0F, 25.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 52 */         PartPose.m_171423_(2.5F, -19.0F, -6.5F, 0.0F, 0.0F, -0.6545F));
/* 53 */     PartDefinition bone2 = Parachadute.m_171599_("bone2", 
/* 54 */         CubeListBuilder.m_171558_().m_171514_(0, 100).m_171488_(9.0F, -31.0F, 4.0F, 1.0F, 25.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 55 */         PartPose.m_171423_(-2.5F, -19.0F, -6.5F, 0.0F, 0.0F, 0.6545F));
/* 56 */     return LayerDefinition.m_171565_(meshdefinition, 160, 160);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void m_7695_(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 62 */     this.group.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*    */   }
/*    */   
/*    */   public void m_6973_(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {}
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\client\model\ModelScientific_Drop_Pod.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */