/*    */ package net.mcreator.latexes.client.renderer;
/*    */ import net.mcreator.latexes.client.model.Modeltsc_berserk_model;
/*    */ import net.mcreator.latexes.entity.TSCBerserkEntity;
/*    */ import net.minecraft.client.model.EntityModel;
/*    */ import net.minecraft.client.renderer.RenderType;
/*    */ import net.minecraft.client.renderer.entity.EntityRendererProvider;
/*    */ import net.minecraft.client.renderer.entity.MobRenderer;
/*    */ import net.minecraft.client.renderer.entity.RenderLayerParent;
/*    */ import net.minecraft.client.renderer.entity.layers.EyesLayer;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ 
/*    */ public class TSCBerserkRenderer extends MobRenderer<TSCBerserkEntity, Modeltsc_berserk_model<TSCBerserkEntity>> {
/*    */   public TSCBerserkRenderer(EntityRendererProvider.Context context) {
/* 15 */     super(context, (EntityModel)new Modeltsc_berserk_model(context.bakeLayer(Modeltsc_berserk_model.LAYER_LOCATION)), 0.7F);
/* 16 */     addLayer((RenderLayer)new EyesLayer<TSCBerserkEntity, Modeltsc_berserk_model<TSCBerserkEntity>>((RenderLayerParent)this)
/*    */         {
/*    */           public RenderType renderType() {
/* 19 */             return RenderType.eyes(new ResourceLocation("latex:textures/entities/tsc_berserk_texture_glow.png"));
/*    */           }
/*    */         });
/*    */   }
/*    */ 
/*    */   
/*    */   public ResourceLocation getTextureLocation(TSCBerserkEntity entity) {
/* 26 */     return new ResourceLocation("latex:textures/entities/tsc_berserk_texture.png");
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\client\renderer\TSCBerserkRenderer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */