/*    */ package net.mcreator.latexes.client.renderer;
/*    */ import net.mcreator.latexes.client.model.Modella_4_tankmorph_model_m;
/*    */ import net.mcreator.latexes.entity.La4tankmorphmEntity;
/*    */ import net.minecraft.client.model.EntityModel;
/*    */ import net.minecraft.client.renderer.RenderType;
/*    */ import net.minecraft.client.renderer.entity.EntityRendererProvider;
/*    */ import net.minecraft.client.renderer.entity.MobRenderer;
/*    */ import net.minecraft.client.renderer.entity.RenderLayerParent;
/*    */ import net.minecraft.client.renderer.entity.layers.EyesLayer;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ 
/*    */ public class La4tankmorphmRenderer extends MobRenderer<La4tankmorphmEntity, Modella_4_tankmorph_model_m<La4tankmorphmEntity>> {
/*    */   public La4tankmorphmRenderer(EntityRendererProvider.Context context) {
/* 15 */     super(context, (EntityModel)new Modella_4_tankmorph_model_m(context.bakeLayer(Modella_4_tankmorph_model_m.LAYER_LOCATION)), 1.1F);
/* 16 */     addLayer((RenderLayer)new EyesLayer<La4tankmorphmEntity, Modella_4_tankmorph_model_m<La4tankmorphmEntity>>((RenderLayerParent)this)
/*    */         {
/*    */           public RenderType renderType() {
/* 19 */             return RenderType.eyes(new ResourceLocation("latex:textures/entities/la4_glow.png"));
/*    */           }
/*    */         });
/*    */   }
/*    */ 
/*    */   
/*    */   public ResourceLocation getTextureLocation(La4tankmorphmEntity entity) {
/* 26 */     return new ResourceLocation("latex:textures/entities/la-4_tankmorph_evil.png");
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\client\renderer\La4tankmorphmRenderer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */