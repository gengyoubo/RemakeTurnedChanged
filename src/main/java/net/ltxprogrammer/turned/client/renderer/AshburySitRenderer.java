/*    */ package net.ltxprogrammer.turned.client.renderer;
/*    */ import net.ltxprogrammer.turned.client.model.Modelhertx_ashbury_sit_model;
/*    */ import net.ltxprogrammer.turned.entity.AshburySitEntity;
/*    */ import net.minecraft.client.renderer.RenderType;
/*    */ import net.minecraft.client.renderer.entity.EntityRendererProvider;
/*    */ import net.minecraft.client.renderer.entity.MobRenderer;
/*    */ import net.minecraft.client.renderer.entity.RenderLayerParent;
/*    */ import net.minecraft.client.renderer.entity.layers.EyesLayer;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ 
/*    */ public class AshburySitRenderer extends MobRenderer<AshburySitEntity, Modelhertx_ashbury_sit_model<AshburySitEntity>> {
/*    */   public AshburySitRenderer(EntityRendererProvider.Context context) {
/* 14 */     super(context, (EntityModel)new Modelhertx_ashbury_sit_model(context.m_174023_(Modelhertx_ashbury_sit_model.LAYER_LOCATION)), 0.7F);
/* 15 */     m_115326_((RenderLayer)new EyesLayer<AshburySitEntity, Modelhertx_ashbury_sit_model<AshburySitEntity>>((RenderLayerParent)this)
/*    */         {
/*    */           public RenderType m_5708_() {
/* 18 */             return RenderType.m_110488_(new ResourceLocation("turned:textures/entities/hertx_ashbury_model_glow.png"));
/*    */           }
/*    */         });
/*    */   }
/*    */ 
/*    */   
/*    */   public ResourceLocation getTextureLocation(AshburySitEntity entity) {
/* 25 */     return new ResourceLocation("turned:textures/entities/hertx_ashbury_model.png");
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\client\renderer\AshburySitRenderer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */