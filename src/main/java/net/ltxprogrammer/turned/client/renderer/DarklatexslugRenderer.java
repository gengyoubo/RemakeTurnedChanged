/*    */ package net.ltxprogrammer.turned.client.renderer;
/*    */ import net.ltxprogrammer.turned.client.model.Modeldl_slug_model;
/*    */ import net.ltxprogrammer.turned.entity.DarklatexslugEntity;
/*    */ import net.minecraft.client.renderer.RenderType;
/*    */ import net.minecraft.client.renderer.entity.EntityRendererProvider;
/*    */ import net.minecraft.client.renderer.entity.MobRenderer;
/*    */ import net.minecraft.client.renderer.entity.RenderLayerParent;
/*    */ import net.minecraft.client.renderer.entity.layers.EyesLayer;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ 
/*    */ public class DarklatexslugRenderer extends MobRenderer<DarklatexslugEntity, Modeldl_slug_model<DarklatexslugEntity>> {
/*    */   public DarklatexslugRenderer(EntityRendererProvider.Context context) {
/* 14 */     super(context, (EntityModel)new Modeldl_slug_model(context.m_174023_(Modeldl_slug_model.LAYER_LOCATION)), 0.6F);
/* 15 */     m_115326_((RenderLayer)new EyesLayer<DarklatexslugEntity, Modeldl_slug_model<DarklatexslugEntity>>((RenderLayerParent)this)
/*    */         {
/*    */           public RenderType m_5708_() {
/* 18 */             return RenderType.m_110488_(new ResourceLocation("turned:textures/entities/dl_slug_glow.png"));
/*    */           }
/*    */         });
/*    */   }
/*    */ 
/*    */   
/*    */   public ResourceLocation getTextureLocation(DarklatexslugEntity entity) {
/* 25 */     return new ResourceLocation("turned:textures/entities/dl_slug_texture.png");
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\client\renderer\DarklatexslugRenderer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */