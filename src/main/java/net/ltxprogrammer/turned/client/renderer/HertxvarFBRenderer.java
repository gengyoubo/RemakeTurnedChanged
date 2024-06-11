/*    */ package net.ltxprogrammer.turned.client.renderer;
/*    */ import net.ltxprogrammer.turned.client.model.Modelhertx_model_fb;
/*    */ import net.ltxprogrammer.turned.entity.HertxvarFBEntity;
/*    */ import net.minecraft.client.renderer.RenderType;
/*    */ import net.minecraft.client.renderer.entity.EntityRendererProvider;
/*    */ import net.minecraft.client.renderer.entity.MobRenderer;
/*    */ import net.minecraft.client.renderer.entity.RenderLayerParent;
/*    */ import net.minecraft.client.renderer.entity.layers.EyesLayer;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ 
/*    */ public class HertxvarFBRenderer extends MobRenderer<HertxvarFBEntity, Modelhertx_model_fb<HertxvarFBEntity>> {
/*    */   public HertxvarFBRenderer(EntityRendererProvider.Context context) {
/* 14 */     super(context, (EntityModel)new Modelhertx_model_fb(context.m_174023_(Modelhertx_model_fb.LAYER_LOCATION)), 0.6F);
/* 15 */     m_115326_((RenderLayer)new EyesLayer<HertxvarFBEntity, Modelhertx_model_fb<HertxvarFBEntity>>((RenderLayerParent)this)
/*    */         {
/*    */           public RenderType m_5708_() {
/* 18 */             return RenderType.m_110488_(new ResourceLocation("turned:textures/entities/hertx_variant_fb_glow.png"));
/*    */           }
/*    */         });
/*    */   }
/*    */ 
/*    */   
/*    */   public ResourceLocation getTextureLocation(HertxvarFBEntity entity) {
/* 25 */     return new ResourceLocation("turned:textures/entities/hertx_variant_fb_texture.png");
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\client\renderer\HertxvarFBRenderer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */