/*    */ package net.mcreator.latexes.client.renderer;
/*    */ import net.mcreator.latexes.client.model.ModelArmed_Drone_Hertx_Rest;
/*    */ import net.mcreator.latexes.entity.ArmedDroneHertxWaitEntity;
/*    */ import net.minecraft.client.model.EntityModel;
/*    */ import net.minecraft.client.renderer.RenderType;
/*    */ import net.minecraft.client.renderer.entity.EntityRendererProvider;
/*    */ import net.minecraft.client.renderer.entity.MobRenderer;
/*    */ import net.minecraft.client.renderer.entity.RenderLayerParent;
/*    */ import net.minecraft.client.renderer.entity.layers.EyesLayer;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ 
/*    */ public class ArmedDroneHertxWaitRenderer extends MobRenderer<ArmedDroneHertxWaitEntity, ModelArmed_Drone_Hertx_Rest<ArmedDroneHertxWaitEntity>> {
/*    */   public ArmedDroneHertxWaitRenderer(EntityRendererProvider.Context context) {
/* 15 */     super(context, (EntityModel)new ModelArmed_Drone_Hertx_Rest(context.bakeLayer(ModelArmed_Drone_Hertx_Rest.LAYER_LOCATION)), 0.6F);
/* 16 */     addLayer((RenderLayer)new EyesLayer<ArmedDroneHertxWaitEntity, ModelArmed_Drone_Hertx_Rest<ArmedDroneHertxWaitEntity>>((RenderLayerParent)this)
/*    */         {
/*    */           public RenderType renderType() {
/* 19 */             return RenderType.eyes(new ResourceLocation("latex:textures/entities/armed_drone_hertx_texture_glow.png"));
/*    */           }
/*    */         });
/*    */   }
/*    */ 
/*    */   
/*    */   public ResourceLocation getTextureLocation(ArmedDroneHertxWaitEntity entity) {
/* 26 */     return new ResourceLocation("latex:textures/entities/armed_drone_hertx_texture.png");
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\client\renderer\ArmedDroneHertxWaitRenderer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */