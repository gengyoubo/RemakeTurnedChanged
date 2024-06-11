/*    */ package net.mcreator.latexes.client.renderer;
/*    */ 
/*    */ import net.mcreator.latexes.client.model.ModelSlimeling_remaster_sit;
/*    */ import net.mcreator.latexes.entity.ProtectorSlimelingsitEntity;
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
/*    */ public class ProtectorSlimelingsitRenderer extends MobRenderer<ProtectorSlimelingsitEntity, ModelSlimeling_remaster_sit<ProtectorSlimelingsitEntity>> {
/*    */   public ProtectorSlimelingsitRenderer(EntityRendererProvider.Context context) {
/* 17 */     super(context, (EntityModel)new ModelSlimeling_remaster_sit(context.bakeLayer(ModelSlimeling_remaster_sit.LAYER_LOCATION)), 0.7F);
/* 18 */     addLayer((RenderLayer)new EyesLayer<ProtectorSlimelingsitEntity, ModelSlimeling_remaster_sit<ProtectorSlimelingsitEntity>>((RenderLayerParent)this)
/*    */         {
/*    */           public RenderType renderType() {
/* 21 */             return RenderType.eyes(new ResourceLocation("latex:textures/entities/protector_glow.png"));
/*    */           }
/*    */         });
/*    */   }
/*    */ 
/*    */   
/*    */   public ResourceLocation getTextureLocation(ProtectorSlimelingsitEntity entity) {
/* 28 */     return new ResourceLocation("latex:textures/entities/protector_remaster_texture.png");
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\client\renderer\ProtectorSlimelingsitRenderer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */