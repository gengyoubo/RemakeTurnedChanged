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
/*    */ public class ModelLatex_Drop_Pod<T extends Entity>
/*    */   extends EntityModel<T>
/*    */ {
/* 24 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("turned", "model_latex_drop_pod"), "main");
/*    */   public final ModelPart group;
/*    */   
/*    */   public ModelLatex_Drop_Pod(ModelPart root) {
/* 28 */     this.group = root.m_171324_("group");
/*    */   }
/*    */   
/*    */   public static LayerDefinition createBodyLayer() {
/* 32 */     MeshDefinition meshdefinition = new MeshDefinition();
/* 33 */     PartDefinition partdefinition = meshdefinition.m_171576_();
/* 34 */     PartDefinition group = partdefinition.m_171599_("group", 
/* 35 */         CubeListBuilder.m_171558_().m_171514_(100, 100).m_171488_(15.0F, -22.0F, -17.0F, 2.0F, 30.0F, 18.0F, new CubeDeformation(0.0F))
/* 36 */         .m_171514_(60, 95).m_171488_(-1.0F, -22.0F, -17.0F, 2.0F, 30.0F, 18.0F, new CubeDeformation(0.0F)).m_171514_(88, 31)
/* 37 */         .m_171488_(0.0F, -22.0F, -17.0F, 15.0F, 30.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(45, 72)
/* 38 */         .m_171488_(0.0F, -1.0F, -0.25F, 16.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(0, 0)
/* 39 */         .m_171488_(12.0F, -9.0F, -0.25F, 4.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(0, 15)
/* 40 */         .m_171488_(6.0F, -3.0F, -0.25F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(0, 31)
/* 41 */         .m_171488_(8.0F, -4.0F, -0.25F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(12, 5)
/* 42 */         .m_171488_(11.0F, -5.0F, -0.25F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(69, 0)
/* 43 */         .m_171488_(0.0F, -22.0F, -0.25F, 16.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(69, 63)
/* 44 */         .m_171488_(0.0F, -20.0F, -0.25F, 11.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(45, 82)
/* 45 */         .m_171488_(0.0F, -18.0F, -0.25F, 10.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(0, 10)
/* 46 */         .m_171488_(0.0F, -16.0F, -0.25F, 6.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(0, 24)
/* 47 */         .m_171488_(0.0F, -13.0F, -0.25F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(12, 0)
/* 48 */         .m_171488_(3.0F, -13.0F, -0.25F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(10, 24)
/* 49 */         .m_171488_(6.0F, -16.0F, -0.25F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(69, 5)
/* 50 */         .m_171488_(-1.5F, -29.0F, -17.5F, 19.0F, 7.0F, 19.0F, new CubeDeformation(0.0F)).m_171514_(69, 69)
/* 51 */         .m_171488_(-1.5F, 7.0F, -17.5F, 19.0F, 7.0F, 19.0F, new CubeDeformation(0.0F)).m_171514_(0, 72)
/* 52 */         .m_171488_(0.5F, -21.0F, -15.5F, 15.0F, 28.0F, 15.0F, new CubeDeformation(0.0F)), 
/* 53 */         PartPose.m_171419_(-8.0F, 16.0F, 8.0F));
/* 54 */     PartDefinition Parachadute = group.m_171599_("Parachadute", 
/* 55 */         CubeListBuilder.m_171558_().m_171514_(0, 48).m_171488_(-12.5F, -45.0F, -9.5F, 25.0F, 5.0F, 19.0F, new CubeDeformation(0.0F)), 
/* 56 */         PartPose.m_171419_(8.0F, -4.0F, -8.0F));
/* 57 */     PartDefinition bone4 = Parachadute.m_171599_("bone4", 
/* 58 */         CubeListBuilder.m_171558_().m_171514_(0, 24).m_171488_(9.71F, -13.9898F, -10.0F, 25.0F, 5.0F, 19.0F, new CubeDeformation(0.0F)), 
/* 59 */         PartPose.m_171423_(-0.5F, -34.0F, 0.5F, 0.0F, 0.0F, 0.2618F));
/* 60 */     PartDefinition bone3 = Parachadute.m_171599_("bone3", 
/* 61 */         CubeListBuilder.m_171558_().m_171514_(0, 0).m_171488_(-34.71F, -13.9898F, -10.0F, 25.0F, 5.0F, 19.0F, new CubeDeformation(0.0F)), 
/* 62 */         PartPose.m_171423_(0.5F, -34.0F, 0.5F, 0.0F, 0.0F, -0.2618F));
/* 63 */     PartDefinition bone = Parachadute.m_171599_("bone", 
/* 64 */         CubeListBuilder.m_171558_().m_171514_(12, 115).m_171488_(-10.0F, -31.0F, 4.0F, 1.0F, 25.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 65 */         PartPose.m_171423_(2.5F, -19.0F, -6.5F, 0.0F, 0.0F, -0.6545F));
/* 66 */     PartDefinition bone2 = Parachadute.m_171599_("bone2", 
/* 67 */         CubeListBuilder.m_171558_().m_171514_(0, 115).m_171488_(9.0F, -31.0F, 4.0F, 1.0F, 25.0F, 5.0F, new CubeDeformation(0.0F)), 
/* 68 */         PartPose.m_171423_(-2.5F, -19.0F, -6.5F, 0.0F, 0.0F, 0.6545F));
/* 69 */     return LayerDefinition.m_171565_(meshdefinition, 160, 160);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void m_7695_(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 75 */     this.group.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*    */   }
/*    */   
/*    */   public void m_6973_(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {}
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\client\model\ModelLatex_Drop_Pod.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */