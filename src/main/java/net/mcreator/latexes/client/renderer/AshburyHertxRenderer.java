/*    */ package net.mcreator.latexes.client.renderer;
/*    */ import net.mcreator.latexes.client.model.Modelhertx_ashbury_model;
/*    */ import net.mcreator.latexes.entity.AshburyHertxEntity;
/*    */ import net.minecraft.client.model.EntityModel;
/*    */ import net.minecraft.client.renderer.RenderType;
/*    */ import net.minecraft.client.renderer.entity.EntityRendererProvider;
/*    */ import net.minecraft.client.renderer.entity.MobRenderer;
/*    */ import net.minecraft.client.renderer.entity.RenderLayerParent;
/*    */ import net.minecraft.client.renderer.entity.layers.EyesLayer;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ 
/*    */ public class AshburyHertxRenderer extends MobRenderer<AshburyHertxEntity, Modelhertx_ashbury_model<AshburyHertxEntity>> {
/*    */   public AshburyHertxRenderer(EntityRendererProvider.Context context) {
/* 15 */     super(context, (EntityModel)new Modelhertx_ashbury_model(context.bakeLayer(Modelhertx_ashbury_model.LAYER_LOCATION)), 0.6F);
/* 16 */     addLayer((RenderLayer)new EyesLayer<AshburyHertxEntity, Modelhertx_ashbury_model<AshburyHertxEntity>>((RenderLayerParent)this)
/*    */         {
/*    */           public RenderType renderType() {
/* 19 */             return RenderType.eyes(new ResourceLocation("latex:textures/entities/hertx_ashbury_model_glow.png"));
/*    */           }
/*    */         });
/*    */   }
/*    */ 
/*    */   
/*    */   public ResourceLocation getTextureLocation(AshburyHertxEntity entity) {
/* 26 */     return new ResourceLocation("latex:textures/entities/hertx_ashbury_model.png");
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\client\renderer\AshburyHertxRenderer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */