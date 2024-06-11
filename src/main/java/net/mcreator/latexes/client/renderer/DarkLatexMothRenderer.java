/*    */ package net.mcreator.latexes.client.renderer;
/*    */ 
/*    */ import net.mcreator.latexes.client.model.Modeldl_moth_model;
/*    */ import net.mcreator.latexes.entity.DarkLatexMothEntity;
/*    */ import net.minecraft.client.model.EntityModel;
/*    */ import net.minecraft.client.renderer.entity.EntityRendererProvider;
/*    */ import net.minecraft.client.renderer.entity.MobRenderer;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ 
/*    */ public class DarkLatexMothRenderer extends MobRenderer<DarkLatexMothEntity, Modeldl_moth_model<DarkLatexMothEntity>> {
/*    */   public DarkLatexMothRenderer(EntityRendererProvider.Context context) {
/* 13 */     super(context, (EntityModel)new Modeldl_moth_model(context.bakeLayer(Modeldl_moth_model.LAYER_LOCATION)), 0.6F);
/*    */   }
/*    */ 
/*    */   
/*    */   public ResourceLocation getTextureLocation(DarkLatexMothEntity entity) {
/* 18 */     return new ResourceLocation("latex:textures/entities/dl_moth_texture.png");
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\client\renderer\DarkLatexMothRenderer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */