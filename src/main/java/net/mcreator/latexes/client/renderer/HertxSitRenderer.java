/*    */ package net.mcreator.latexes.client.renderer;
/*    */ import net.mcreator.latexes.client.model.Modelhertx_model_sit;
/*    */ import net.mcreator.latexes.entity.HertxSitEntity;
/*    */ import net.minecraft.client.model.EntityModel;
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
/* 15 */     super(context, (EntityModel)new Modelhertx_model_sit(context.bakeLayer(Modelhertx_model_sit.LAYER_LOCATION)), 0.7F);
/* 16 */     addLayer((RenderLayer)new EyesLayer<HertxSitEntity, Modelhertx_model_sit<HertxSitEntity>>((RenderLayerParent)this)
/*    */         {
/*    */           public RenderType renderType() {
/* 19 */             return RenderType.eyes(new ResourceLocation("latex:textures/entities/hertx_glow.png"));
/*    */           }
/*    */         });
/*    */   }
/*    */ 
/*    */   
/*    */   public ResourceLocation getTextureLocation(HertxSitEntity entity) {
/* 26 */     return new ResourceLocation("latex:textures/entities/hertx_texture.png");
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\client\renderer\HertxSitRenderer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */