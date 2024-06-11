/*    */ package net.mcreator.latexes.client.renderer;
/*    */ import net.mcreator.latexes.client.model.Modeltsc_outsider_ranged_model;
/*    */ import net.mcreator.latexes.entity.TSCOutsiderGunnerEntity;
/*    */ import net.minecraft.client.model.EntityModel;
/*    */ import net.minecraft.client.renderer.RenderType;
/*    */ import net.minecraft.client.renderer.entity.EntityRendererProvider;
/*    */ import net.minecraft.client.renderer.entity.MobRenderer;
/*    */ import net.minecraft.client.renderer.entity.RenderLayerParent;
/*    */ import net.minecraft.client.renderer.entity.layers.EyesLayer;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ 
/*    */ public class TSCOutsiderGunnerRenderer extends MobRenderer<TSCOutsiderGunnerEntity, Modeltsc_outsider_ranged_model<TSCOutsiderGunnerEntity>> {
/*    */   public TSCOutsiderGunnerRenderer(EntityRendererProvider.Context context) {
/* 15 */     super(context, (EntityModel)new Modeltsc_outsider_ranged_model(context.bakeLayer(Modeltsc_outsider_ranged_model.LAYER_LOCATION)), 0.5F);
/* 16 */     addLayer((RenderLayer)new EyesLayer<TSCOutsiderGunnerEntity, Modeltsc_outsider_ranged_model<TSCOutsiderGunnerEntity>>((RenderLayerParent)this)
/*    */         {
/*    */           public RenderType renderType() {
/* 19 */             return RenderType.eyes(new ResourceLocation("latex:textures/entities/tsc_outsider_gunner_glow.png"));
/*    */           }
/*    */         });
/*    */   }
/*    */ 
/*    */   
/*    */   public ResourceLocation getTextureLocation(TSCOutsiderGunnerEntity entity) {
/* 26 */     return new ResourceLocation("latex:textures/entities/tsc_outsider_gunner_texture.png");
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\client\renderer\TSCOutsiderGunnerRenderer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */