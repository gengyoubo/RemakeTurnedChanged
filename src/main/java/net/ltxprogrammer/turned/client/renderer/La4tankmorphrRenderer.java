/*    */ package net.ltxprogrammer.turned.client.renderer;
/*    */ import net.ltxprogrammer.turned.client.model.Modella_4_tankmorph_model_r;
/*    */ import net.ltxprogrammer.turned.entity.La4tankmorphrEntity;
/*    */ import net.minecraft.client.renderer.RenderType;
/*    */ import net.minecraft.client.renderer.entity.EntityRendererProvider;
/*    */ import net.minecraft.client.renderer.entity.MobRenderer;
/*    */ import net.minecraft.client.renderer.entity.RenderLayerParent;
/*    */ import net.minecraft.client.renderer.entity.layers.EyesLayer;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ 
/*    */ public class La4tankmorphrRenderer extends MobRenderer<La4tankmorphrEntity, Modella_4_tankmorph_model_r<La4tankmorphrEntity>> {
/*    */   public La4tankmorphrRenderer(EntityRendererProvider.Context context) {
/* 14 */     super(context, (EntityModel)new Modella_4_tankmorph_model_r(context.m_174023_(Modella_4_tankmorph_model_r.LAYER_LOCATION)), 1.1F);
/* 15 */     m_115326_((RenderLayer)new EyesLayer<La4tankmorphrEntity, Modella_4_tankmorph_model_r<La4tankmorphrEntity>>((RenderLayerParent)this)
/*    */         {
/*    */           public RenderType m_5708_() {
/* 18 */             return RenderType.m_110488_(new ResourceLocation("turned:textures/entities/la4_glow.png"));
/*    */           }
/*    */         });
/*    */   }
/*    */ 
/*    */   
/*    */   public ResourceLocation getTextureLocation(La4tankmorphrEntity entity) {
/* 25 */     return new ResourceLocation("turned:textures/entities/la-4_tankmorph_evil.png");
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\client\renderer\La4tankmorphrRenderer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */