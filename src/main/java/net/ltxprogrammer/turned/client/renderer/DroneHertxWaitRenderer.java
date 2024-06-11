/*    */ package net.ltxprogrammer.turned.client.renderer;
/*    */ import net.ltxprogrammer.turned.client.model.ModelDrone_Hertx_Sit;
/*    */ import net.ltxprogrammer.turned.entity.DroneHertxWaitEntity;
/*    */ import net.minecraft.client.renderer.RenderType;
/*    */ import net.minecraft.client.renderer.entity.EntityRendererProvider;
/*    */ import net.minecraft.client.renderer.entity.MobRenderer;
/*    */ import net.minecraft.client.renderer.entity.RenderLayerParent;
/*    */ import net.minecraft.client.renderer.entity.layers.EyesLayer;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ 
/*    */ public class DroneHertxWaitRenderer extends MobRenderer<DroneHertxWaitEntity, ModelDrone_Hertx_Sit<DroneHertxWaitEntity>> {
/*    */   public DroneHertxWaitRenderer(EntityRendererProvider.Context context) {
/* 14 */     super(context, (EntityModel)new ModelDrone_Hertx_Sit(context.m_174023_(ModelDrone_Hertx_Sit.LAYER_LOCATION)), 0.6F);
/* 15 */     m_115326_((RenderLayer)new EyesLayer<DroneHertxWaitEntity, ModelDrone_Hertx_Sit<DroneHertxWaitEntity>>((RenderLayerParent)this)
/*    */         {
/*    */           public RenderType m_5708_() {
/* 18 */             return RenderType.m_110488_(new ResourceLocation("turned:textures/entities/drone_hertx_texture_glow.png"));
/*    */           }
/*    */         });
/*    */   }
/*    */ 
/*    */   
/*    */   public ResourceLocation getTextureLocation(DroneHertxWaitEntity entity) {
/* 25 */     return new ResourceLocation("turned:textures/entities/drone_hertx_texture.png");
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\client\renderer\DroneHertxWaitRenderer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */