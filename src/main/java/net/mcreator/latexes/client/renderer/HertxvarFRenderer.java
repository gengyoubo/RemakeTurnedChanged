/*    */ package net.mcreator.latexes.client.renderer;
/*    */ import net.mcreator.latexes.client.model.Modelhertx_model_f;
/*    */ import net.mcreator.latexes.entity.HertxvarFEntity;
/*    */ import net.minecraft.client.model.EntityModel;
/*    */ import net.minecraft.client.renderer.RenderType;
/*    */ import net.minecraft.client.renderer.entity.EntityRendererProvider;
/*    */ import net.minecraft.client.renderer.entity.MobRenderer;
/*    */ import net.minecraft.client.renderer.entity.RenderLayerParent;
/*    */ import net.minecraft.client.renderer.entity.layers.EyesLayer;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ 
/*    */ public class HertxvarFRenderer extends MobRenderer<HertxvarFEntity, Modelhertx_model_f<HertxvarFEntity>> {
/*    */   public HertxvarFRenderer(EntityRendererProvider.Context context) {
/* 15 */     super(context, (EntityModel)new Modelhertx_model_f(context.bakeLayer(Modelhertx_model_f.LAYER_LOCATION)), 0.6F);
/* 16 */     addLayer((RenderLayer)new EyesLayer<HertxvarFEntity, Modelhertx_model_f<HertxvarFEntity>>((RenderLayerParent)this)
/*    */         {
/*    */           public RenderType renderType() {
/* 19 */             return RenderType.eyes(new ResourceLocation("latex:textures/entities/hertx_variant_f_glow.png"));
/*    */           }
/*    */         });
/*    */   }
/*    */ 
/*    */   
/*    */   public ResourceLocation getTextureLocation(HertxvarFEntity entity) {
/* 26 */     return new ResourceLocation("latex:textures/entities/hertx_variant_f_texture.png");
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\client\renderer\HertxvarFRenderer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */