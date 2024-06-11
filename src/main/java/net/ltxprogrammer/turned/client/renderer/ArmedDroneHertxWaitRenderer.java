/*    */ package net.ltxprogrammer.turned.client.renderer;
/*    */ import net.ltxprogrammer.turned.client.model.ModelArmed_Drone_Hertx_Rest;
/*    */ import net.ltxprogrammer.turned.entity.ArmedDroneHertxWaitEntity;
/*    */ import net.minecraft.client.renderer.RenderType;
/*    */ import net.minecraft.client.renderer.entity.EntityRendererProvider;
/*    */ import net.minecraft.client.renderer.entity.MobRenderer;
/*    */ import net.minecraft.client.renderer.entity.RenderLayerParent;
/*    */ import net.minecraft.client.renderer.entity.layers.EyesLayer;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ 
/*    */ public class ArmedDroneHertxWaitRenderer extends MobRenderer<ArmedDroneHertxWaitEntity, ModelArmed_Drone_Hertx_Rest<ArmedDroneHertxWaitEntity>> {
/*    */   public ArmedDroneHertxWaitRenderer(EntityRendererProvider.Context context) {
/* 14 */     super(context, (EntityModel)new ModelArmed_Drone_Hertx_Rest(context.m_174023_(ModelArmed_Drone_Hertx_Rest.LAYER_LOCATION)), 0.6F);
/* 15 */     m_115326_((RenderLayer)new EyesLayer<ArmedDroneHertxWaitEntity, ModelArmed_Drone_Hertx_Rest<ArmedDroneHertxWaitEntity>>((RenderLayerParent)this)
/*    */         {
/*    */           public RenderType m_5708_() {
/* 18 */             return RenderType.m_110488_(new ResourceLocation("turned:textures/entities/armed_drone_hertx_texture_glow.png"));
/*    */           }
/*    */         });
/*    */   }
/*    */ 
/*    */   
/*    */   public ResourceLocation getTextureLocation(ArmedDroneHertxWaitEntity entity) {
/* 25 */     return new ResourceLocation("turned:textures/entities/armed_drone_hertx_texture.png");
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\client\renderer\ArmedDroneHertxWaitRenderer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */