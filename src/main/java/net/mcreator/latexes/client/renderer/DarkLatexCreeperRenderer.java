/*    */ package net.mcreator.latexes.client.renderer;
/*    */ 
/*    */ import net.mcreator.latexes.client.model.ModelDark_latex_creeper;
/*    */ import net.mcreator.latexes.entity.DarkLatexCreeperEntity;
/*    */ import net.minecraft.client.model.EntityModel;
/*    */ import net.minecraft.client.renderer.entity.EntityRendererProvider;
/*    */ import net.minecraft.client.renderer.entity.MobRenderer;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ 
/*    */ public class DarkLatexCreeperRenderer extends MobRenderer<DarkLatexCreeperEntity, ModelDark_latex_creeper<DarkLatexCreeperEntity>> {
/*    */   public DarkLatexCreeperRenderer(EntityRendererProvider.Context context) {
/* 13 */     super(context, (EntityModel)new ModelDark_latex_creeper(context.bakeLayer(ModelDark_latex_creeper.LAYER_LOCATION)), 0.5F);
/*    */   }
/*    */ 
/*    */   
/*    */   public ResourceLocation getTextureLocation(DarkLatexCreeperEntity entity) {
/* 18 */     return new ResourceLocation("latex:textures/entities/dark_latex_creeper_texture.png");
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\client\renderer\DarkLatexCreeperRenderer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */