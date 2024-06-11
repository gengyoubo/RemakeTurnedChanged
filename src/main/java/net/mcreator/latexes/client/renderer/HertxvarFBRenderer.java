/*    */ package net.mcreator.latexes.client.renderer;
/*    */ import net.mcreator.latexes.client.model.Modelhertx_model_fb;
/*    */ import net.mcreator.latexes.entity.HertxvarFBEntity;
/*    */ import net.minecraft.client.model.EntityModel;
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
/* 15 */     super(context, (EntityModel)new Modelhertx_model_fb(context.bakeLayer(Modelhertx_model_fb.LAYER_LOCATION)), 0.6F);
/* 16 */     addLayer((RenderLayer)new EyesLayer<HertxvarFBEntity, Modelhertx_model_fb<HertxvarFBEntity>>((RenderLayerParent)this)
/*    */         {
/*    */           public RenderType renderType() {
/* 19 */             return RenderType.eyes(new ResourceLocation("latex:textures/entities/hertx_variant_fb_glow.png"));
/*    */           }
/*    */         });
/*    */   }
/*    */ 
/*    */   
/*    */   public ResourceLocation getTextureLocation(HertxvarFBEntity entity) {
/* 26 */     return new ResourceLocation("latex:textures/entities/hertx_variant_fb_texture.png");
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\client\renderer\HertxvarFBRenderer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */