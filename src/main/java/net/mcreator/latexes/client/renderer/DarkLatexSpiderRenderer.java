/*    */ package net.mcreator.latexes.client.renderer;
/*    */ import net.mcreator.latexes.client.model.Modelspider_latex_model;
/*    */ import net.mcreator.latexes.entity.DarkLatexSpiderEntity;
/*    */ import net.minecraft.client.model.EntityModel;
/*    */ import net.minecraft.client.renderer.RenderType;
/*    */ import net.minecraft.client.renderer.entity.EntityRendererProvider;
/*    */ import net.minecraft.client.renderer.entity.MobRenderer;
/*    */ import net.minecraft.client.renderer.entity.RenderLayerParent;
/*    */ import net.minecraft.client.renderer.entity.layers.EyesLayer;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ 
/*    */ public class DarkLatexSpiderRenderer extends MobRenderer<DarkLatexSpiderEntity, Modelspider_latex_model<DarkLatexSpiderEntity>> {
/*    */   public DarkLatexSpiderRenderer(EntityRendererProvider.Context context) {
/* 15 */     super(context, (EntityModel)new Modelspider_latex_model(context.bakeLayer(Modelspider_latex_model.LAYER_LOCATION)), 0.8F);
/* 16 */     addLayer((RenderLayer)new EyesLayer<DarkLatexSpiderEntity, Modelspider_latex_model<DarkLatexSpiderEntity>>((RenderLayerParent)this)
/*    */         {
/*    */           public RenderType renderType() {
/* 19 */             return RenderType.eyes(new ResourceLocation("latex:textures/entities/dark_latex_spider_glow.png"));
/*    */           }
/*    */         });
/*    */   }
/*    */ 
/*    */   
/*    */   public ResourceLocation getTextureLocation(DarkLatexSpiderEntity entity) {
/* 26 */     return new ResourceLocation("latex:textures/entities/spider_latex_texture.png");
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\client\renderer\DarkLatexSpiderRenderer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */