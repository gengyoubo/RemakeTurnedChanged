/*    */ package net.mcreator.latexes.client.renderer;
/*    */ import net.mcreator.latexes.client.model.Modeldl_dragon_model;
/*    */ import net.mcreator.latexes.entity.DarkLatexDragonEntity;
/*    */ import net.minecraft.client.model.EntityModel;
/*    */ import net.minecraft.client.renderer.RenderType;
/*    */ import net.minecraft.client.renderer.entity.EntityRendererProvider;
/*    */ import net.minecraft.client.renderer.entity.MobRenderer;
/*    */ import net.minecraft.client.renderer.entity.RenderLayerParent;
/*    */ import net.minecraft.client.renderer.entity.layers.EyesLayer;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ 
/*    */ public class DarkLatexDragonRenderer extends MobRenderer<DarkLatexDragonEntity, Modeldl_dragon_model<DarkLatexDragonEntity>> {
/*    */   public DarkLatexDragonRenderer(EntityRendererProvider.Context context) {
/* 15 */     super(context, (EntityModel)new Modeldl_dragon_model(context.bakeLayer(Modeldl_dragon_model.LAYER_LOCATION)), 0.8F);
/* 16 */     addLayer((RenderLayer)new EyesLayer<DarkLatexDragonEntity, Modeldl_dragon_model<DarkLatexDragonEntity>>((RenderLayerParent)this)
/*    */         {
/*    */           public RenderType renderType() {
/* 19 */             return RenderType.eyes(new ResourceLocation("latex:textures/entities/dl_dragon_glow.png"));
/*    */           }
/*    */         });
/*    */   }
/*    */ 
/*    */   
/*    */   public ResourceLocation getTextureLocation(DarkLatexDragonEntity entity) {
/* 26 */     return new ResourceLocation("latex:textures/entities/dark_latex_dragon.png");
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\client\renderer\DarkLatexDragonRenderer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */