/*    */ package net.ltxprogrammer.turned.client.renderer;
/*    */ import net.ltxprogrammer.turned.client.model.ModelDrone_Hertx;
/*    */ import net.ltxprogrammer.turned.entity.DroneHertxEntity;
/*    */ import net.minecraft.client.model.EntityModel;
/*    */ import net.minecraft.client.model.HumanoidModel;
/*    */ import net.minecraft.client.model.geom.ModelLayers;
/*    */ import net.minecraft.client.renderer.RenderType;
/*    */ import net.minecraft.client.renderer.entity.EntityRendererProvider;
/*    */ import net.minecraft.client.renderer.entity.MobRenderer;
/*    */ import net.minecraft.client.renderer.entity.RenderLayerParent;
/*    */ import net.minecraft.client.renderer.entity.layers.EyesLayer;
/*    */ import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
/*    */ import net.minecraft.client.renderer.entity.layers.RenderLayer;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ 
/*    */ public class DroneHertxRenderer extends MobRenderer<DroneHertxEntity, ModelDrone_Hertx<DroneHertxEntity>> {
/*    */   public DroneHertxRenderer(EntityRendererProvider.Context context) {
/* 19 */     super(context, (EntityModel)new ModelDrone_Hertx(context.m_174023_(ModelDrone_Hertx.LAYER_LOCATION)), 0.6F);
/* 20 */     m_115326_((RenderLayer)new HumanoidArmorLayer((RenderLayerParent)this, new HumanoidModel(context.m_174023_(ModelLayers.f_171164_)), new HumanoidModel(context
/* 21 */             .m_174023_(ModelLayers.f_171165_))));
/* 22 */     m_115326_((RenderLayer)new EyesLayer<DroneHertxEntity, ModelDrone_Hertx<DroneHertxEntity>>((RenderLayerParent)this)
/*    */         {
/*    */           public RenderType m_5708_() {
/* 25 */             return RenderType.m_110488_(new ResourceLocation("turned:textures/entities/drone_hertx_texture_glow.png"));
/*    */           }
/*    */         });
/*    */   }
/*    */ 
/*    */   
/*    */   public ResourceLocation getTextureLocation(DroneHertxEntity entity) {
/* 32 */     return new ResourceLocation("turned:textures/entities/drone_hertx_texture.png");
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\client\renderer\DroneHertxRenderer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */