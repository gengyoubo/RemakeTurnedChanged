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
/* 25 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("turned", "modeldl_slug_model"), "main");
/*    */   public final ModelPart Head;
/*    */   public final ModelPart Body;
/*    */   public final ModelPart leftarm;
/*    */   public final ModelPart Rightarm;
/*    */   
/*    */   public Modeldl_slug_model(ModelPart root) {
/* 32 */     this.Head = root.m_171324_("Head");
/* 33 */     this.Body = root.m_171324_("Body");
/* 34 */     this.leftarm = root.m_171324_("leftarm");
/* 35 */     this.Rightarm = root.m_171324_("Rightarm");
/*    */   }
/*    */   
/*    */   public static LayerDefinition createBodyLayer() {
/* 39 */     MeshDefinition meshdefinition = new MeshDefinition();
/* 40 */     PartDefinition partdefinition = meshdefinition.m_171576_();
/* 41 */     PartDefinition Head = partdefinition.m_171599_("Head", 
/* 42 */         CubeListBuilder.m_171558_().m_171514_(0, 12).m_171488_(-2.0F, -3.0F, -2.75F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(19, 4)
/* 43 */         .m_171488_(-2.0F, -3.0F, -3.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(2, 5)
/* 44 */         .m_171488_(2.0F, -2.0F, -3.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(19, 5)
/* 45 */         .m_171488_(-2.0F, -1.0F, -3.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(4, 3)
/* 46 */         .m_171488_(1.0F, 0.0F, -3.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(4, 4)
/* 47 */         .m_171488_(-2.0F, 0.0F, -3.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(0, 4)
/* 48 */         .m_171488_(-1.0F, -2.0F, -3.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(0, 5)
/* 49 */         .m_171488_(-3.0F, -2.0F, -3.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(0, 3)
/* 50 */         .m_171488_(-1.0F, -4.0F, -3.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), 
/* 51 */         PartPose.m_171419_(0.0F, 21.0F, -4.25F));
/* 52 */     PartDefinition Body = partdefinition.m_171599_("Body", 
/* 53 */         CubeListBuilder.m_171558_().m_171514_(0, 0).m_171488_(-3.0F, -2.0F, -0.75F, 6.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)).m_171514_(16, 16)
/* 54 */         .m_171488_(-2.0F, -1.0F, 6.25F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(0, 20)
/* 55 */         .m_171488_(-1.0F, 0.0F, 8.25F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(0, 0)
/* 56 */         .m_171488_(-1.0F, 1.0F, 10.25F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 57 */         PartPose.m_171419_(0.0F, 21.0F, -4.25F));
/* 58 */     PartDefinition leftarm = partdefinition.m_171599_("leftarm", 
/* 59 */         CubeListBuilder.m_171558_().m_171514_(19, 0).m_171488_(1.0F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), 
/* 60 */         PartPose.m_171419_(2.0F, 23.0F, -3.0F));
/* 61 */     PartDefinition Rightarm = partdefinition.m_171599_("Rightarm", 
/* 62 */         CubeListBuilder.m_171558_().m_171514_(12, 12).m_171488_(-4.0F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), 
/* 63 */         PartPose.m_171419_(-2.0F, 23.0F, -3.0F));
/* 64 */     return LayerDefinition.m_171565_(meshdefinition, 32, 32);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void m_7695_(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 70 */     this.Head.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 71 */     this.Body.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 72 */     this.leftarm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 73 */     this.Rightarm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*    */   }
/*    */   
/*    */   public void m_6973_(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
/* 77 */     this.Rightarm.f_104203_ = Mth.m_14089_(limbSwing * 0.6662F + 3.1415927F) * limbSwingAmount;
/* 78 */     this.Head.f_104204_ = netHeadYaw / 57.295776F;
/* 79 */     this.Head.f_104203_ = headPitch / 57.295776F;
/* 80 */     this.leftarm.f_104203_ = Mth.m_14089_(limbSwing * 0.6662F) * limbSwingAmount;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\client\model\Modeldl_slug_model.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */