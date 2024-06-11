/*    */ package net.mcreator.latexes.client.renderer;
/*    */ import net.mcreator.latexes.entity.MilitaryRiotEntity;
/*    */ import net.minecraft.client.model.HumanoidModel;
/*    */ import net.minecraft.client.model.geom.ModelLayers;
/*    */ import net.minecraft.client.renderer.entity.EntityRendererProvider;
/*    */ import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
/*    */ import net.minecraft.client.renderer.entity.RenderLayerParent;
/*    */ import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.Mob;
/*    */ 
/*    */ public class MilitaryRiotRenderer extends HumanoidMobRenderer<MilitaryRiotEntity, HumanoidModel<MilitaryRiotEntity>> {
/*    */   public MilitaryRiotRenderer(EntityRendererProvider.Context context) {
/* 15 */     super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5F);
/* 16 */     addLayer((RenderLayer)new HumanoidArmorLayer((RenderLayerParent)this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context
/* 17 */             .bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));
/*    */   }
/*    */ 
/*    */   
/*    */   public ResourceLocation getTextureLocation(MilitaryRiotEntity entity) {
/* 22 */     return new ResourceLocation("latex:textures/entities/military_steve.png");
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\client\renderer\MilitaryRiotRenderer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */