/*    */ package net.mcreator.latexes.client.renderer;
/*    */ import net.mcreator.latexes.entity.DarkLatexQueenBeeEntity;
/*    */ import net.minecraft.client.model.HumanoidModel;
/*    */ import net.minecraft.client.model.geom.ModelLayers;
/*    */ import net.minecraft.client.renderer.RenderType;
/*    */ import net.minecraft.client.renderer.entity.EntityRendererProvider;
/*    */ import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
/*    */ import net.minecraft.client.renderer.entity.RenderLayerParent;
/*    */ import net.minecraft.client.renderer.entity.layers.EyesLayer;
/*    */ import net.minecraft.client.renderer.entity.layers.RenderLayer;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.Mob;
/*    */ 
/*    */ public class DarkLatexQueenBeeRenderer extends HumanoidMobRenderer<DarkLatexQueenBeeEntity, HumanoidModel<DarkLatexQueenBeeEntity>> {
/*    */   public DarkLatexQueenBeeRenderer(EntityRendererProvider.Context context) {
/* 17 */     super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 1.0F);
/* 18 */     addLayer((RenderLayer)new HumanoidArmorLayer((RenderLayerParent)this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context
/* 19 */             .bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));
/* 20 */     addLayer((RenderLayer)new EyesLayer<DarkLatexQueenBeeEntity, HumanoidModel<DarkLatexQueenBeeEntity>>((RenderLayerParent)this)
/*    */         {
/*    */           public RenderType renderType() {
/* 23 */             return RenderType.eyes(new ResourceLocation("latex:textures/entities/dark_latex_queen_bee_glow.png"));
/*    */           }
/*    */         });
/*    */   }
/*    */ 
/*    */   
/*    */   public ResourceLocation getTextureLocation(DarkLatexQueenBeeEntity entity) {
/* 30 */     return new ResourceLocation("latex:textures/entities/dark_latex_queen_bee_texture.png");
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\client\renderer\DarkLatexQueenBeeRenderer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */