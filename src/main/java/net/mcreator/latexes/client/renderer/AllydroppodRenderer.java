/*    */ package net.mcreator.latexes.client.renderer;
/*    */ import net.mcreator.latexes.client.model.ModelScientific_Drop_Pod;
/*    */ import net.mcreator.latexes.entity.AllydroppodEntity;
/*    */ import net.minecraft.client.model.EntityModel;
/*    */ import net.minecraft.client.renderer.RenderType;
/*    */ import net.minecraft.client.renderer.entity.EntityRendererProvider;
/*    */ import net.minecraft.client.renderer.entity.MobRenderer;
/*    */ import net.minecraft.client.renderer.entity.RenderLayerParent;
/*    */ import net.minecraft.client.renderer.entity.layers.EyesLayer;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ 
/*    */ public class AllydroppodRenderer extends MobRenderer<AllydroppodEntity, ModelScientific_Drop_Pod<AllydroppodEntity>> {
/*    */   public AllydroppodRenderer(EntityRendererProvider.Context context) {
/* 15 */     super(context, (EntityModel)new ModelScientific_Drop_Pod(context.bakeLayer(ModelScientific_Drop_Pod.LAYER_LOCATION)), 1.2F);
/* 16 */     addLayer((RenderLayer)new EyesLayer<AllydroppodEntity, ModelScientific_Drop_Pod<AllydroppodEntity>>((RenderLayerParent)this)
/*    */         {
/*    */           public RenderType renderType() {
/* 19 */             return RenderType.eyes(new ResourceLocation("latex:textures/entities/scientific_drop_pod_glow.png"));
/*    */           }
/*    */         });
/*    */   }
/*    */ 
/*    */   
/*    */   public ResourceLocation getTextureLocation(AllydroppodEntity entity) {
/* 26 */     return new ResourceLocation("latex:textures/entities/scientific_drop_pod.png");
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\client\renderer\AllydroppodRenderer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */