/*    */ package net.ltxprogrammer.turned.client.renderer;
/*    */ import net.ltxprogrammer.turned.client.model.Modelhertx_model_sit;
/*    */ import net.ltxprogrammer.turned.entity.HertxSitEntity;
/*    */ import net.minecraft.client.renderer.RenderType;
/*    */ import net.minecraft.client.renderer.entity.EntityRendererProvider;
/*    */ import net.minecraft.client.renderer.entity.MobRenderer;
/*    */ import net.minecraft.client.renderer.entity.RenderLayerParent;
/*    */ import net.minecraft.client.renderer.entity.layers.EyesLayer;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ 
/*    */ public class HertxSitRenderer extends MobRenderer<HertxSitEntity, Modelhertx_model_sit<HertxSitEntity>> {
/*    */   public HertxSitRenderer(EntityRendererProvider.Context context) {
/* 14 */     super(context, (EntityModel)new Modelhertx_model_sit(context.m_174023_(Modelhertx_model_sit.LAYER_LOCATION)), 0.7F);
/* 15 */     m_115326_((RenderLayer)new EyesLayer<HertxSitEntity, Modelhertx_model_sit<HertxSitEntity>>((RenderLayerParent)this)
/*    */         {
/*    */           public RenderType m_5708_() {
/* 18 */             return RenderType.m_110488_(new ResourceLocation("turned:textures/entities/hertx_glow.png"));
/*    */           }
/*    */         });
/*    */   }
/*    */ 
/*    */   
/*    */   public ResourceLocation getTextureLocation(HertxSitEntity entity) {
/* 25 */     return new ResourceLocation("turned:textures/entities/hertx_texture.png");
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\client\renderer\HertxSitRenderer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */