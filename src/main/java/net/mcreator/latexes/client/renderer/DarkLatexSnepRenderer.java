/*    */ package net.mcreator.latexes.client.renderer;
/*    */ import net.mcreator.latexes.client.model.ModelDark_latex_snep;
/*    */ import net.mcreator.latexes.entity.DarkLatexSnepEntity;
/*    */ import net.minecraft.client.model.EntityModel;
/*    */ import net.minecraft.client.renderer.RenderType;
/*    */ import net.minecraft.client.renderer.entity.EntityRendererProvider;
/*    */ import net.minecraft.client.renderer.entity.MobRenderer;
/*    */ import net.minecraft.client.renderer.entity.RenderLayerParent;
/*    */ import net.minecraft.client.renderer.entity.layers.EyesLayer;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ 
/*    */ public class DarkLatexSnepRenderer extends MobRenderer<DarkLatexSnepEntity, ModelDark_latex_snep<DarkLatexSnepEntity>> {
/*    */   public DarkLatexSnepRenderer(EntityRendererProvider.Context context) {
/* 15 */     super(context, (EntityModel)new ModelDark_latex_snep(context.bakeLayer(ModelDark_latex_snep.LAYER_LOCATION)), 0.5F);
/* 16 */     addLayer((RenderLayer)new EyesLayer<DarkLatexSnepEntity, ModelDark_latex_snep<DarkLatexSnepEntity>>((RenderLayerParent)this)
/*    */         {
/*    */           public RenderType renderType() {
/* 19 */             return RenderType.eyes(new ResourceLocation("latex:textures/entities/dark_latex_snep_glow.png"));
/*    */           }
/*    */         });
/*    */   }
/*    */ 
/*    */   
/*    */   public ResourceLocation getTextureLocation(DarkLatexSnepEntity entity) {
/* 26 */     return new ResourceLocation("latex:textures/entities/dl_snep_texture.png");
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\client\renderer\DarkLatexSnepRenderer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */