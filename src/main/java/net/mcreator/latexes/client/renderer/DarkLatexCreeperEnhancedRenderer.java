/*    */ package net.mcreator.latexes.client.renderer;
/*    */ 
/*    */ import net.mcreator.latexes.client.model.ModelDark_latex_creeper_enhanced;
/*    */ import net.mcreator.latexes.entity.DarkLatexCreeperEnhancedEntity;
/*    */ import net.minecraft.client.model.EntityModel;
/*    */ import net.minecraft.client.renderer.RenderType;
/*    */ import net.minecraft.client.renderer.entity.EntityRendererProvider;
/*    */ import net.minecraft.client.renderer.entity.MobRenderer;
/*    */ import net.minecraft.client.renderer.entity.RenderLayerParent;
/*    */ import net.minecraft.client.renderer.entity.layers.EyesLayer;
/*    */ import net.minecraft.client.renderer.entity.layers.RenderLayer;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ 
/*    */ public class DarkLatexCreeperEnhancedRenderer extends MobRenderer<DarkLatexCreeperEnhancedEntity, ModelDark_latex_creeper_enhanced<DarkLatexCreeperEnhancedEntity>> {
/*    */   public DarkLatexCreeperEnhancedRenderer(EntityRendererProvider.Context context) {
/* 17 */     super(context, (EntityModel)new ModelDark_latex_creeper_enhanced(context.bakeLayer(ModelDark_latex_creeper_enhanced.LAYER_LOCATION)), 0.8F);
/* 18 */     addLayer((RenderLayer)new EyesLayer<DarkLatexCreeperEnhancedEntity, ModelDark_latex_creeper_enhanced<DarkLatexCreeperEnhancedEntity>>((RenderLayerParent)this)
/*    */         {
/*    */           public RenderType renderType() {
/* 21 */             return RenderType.eyes(new ResourceLocation("latex:textures/entities/dark_latex_creeper_enhanced_glow_texture.png"));
/*    */           }
/*    */         });
/*    */   }
/*    */ 
/*    */   
/*    */   public ResourceLocation getTextureLocation(DarkLatexCreeperEnhancedEntity entity) {
/* 28 */     return new ResourceLocation("latex:textures/entities/dark_latex_creeper_enhanced__texture.png");
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\client\renderer\DarkLatexCreeperEnhancedRenderer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */