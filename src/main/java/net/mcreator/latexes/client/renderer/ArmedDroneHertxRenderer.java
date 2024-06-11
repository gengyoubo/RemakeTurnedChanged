/*    */ package net.mcreator.latexes.client.renderer;
/*    */ import net.mcreator.latexes.client.model.ModelMilitary_Drone_Hertx;
/*    */ import net.mcreator.latexes.entity.ArmedDroneHertxEntity;
/*    */ import net.minecraft.client.model.EntityModel;
/*    */ import net.minecraft.client.renderer.RenderType;
/*    */ import net.minecraft.client.renderer.entity.EntityRendererProvider;
/*    */ import net.minecraft.client.renderer.entity.MobRenderer;
/*    */ import net.minecraft.client.renderer.entity.RenderLayerParent;
/*    */ import net.minecraft.client.renderer.entity.layers.EyesLayer;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ 
/*    */ public class ArmedDroneHertxRenderer extends MobRenderer<ArmedDroneHertxEntity, ModelMilitary_Drone_Hertx<ArmedDroneHertxEntity>> {
/*    */   public ArmedDroneHertxRenderer(EntityRendererProvider.Context context) {
/* 15 */     super(context, (EntityModel)new ModelMilitary_Drone_Hertx(context.bakeLayer(ModelMilitary_Drone_Hertx.LAYER_LOCATION)), 0.6F);
/* 16 */     addLayer((RenderLayer)new EyesLayer<ArmedDroneHertxEntity, ModelMilitary_Drone_Hertx<ArmedDroneHertxEntity>>((RenderLayerParent)this)
/*    */         {
/*    */           public RenderType renderType() {
/* 19 */             return RenderType.eyes(new ResourceLocation("latex:textures/entities/armed_drone_hertx_texture_glow.png"));
/*    */           }
/*    */         });
/*    */   }
/*    */ 
/*    */   
/*    */   public ResourceLocation getTextureLocation(ArmedDroneHertxEntity entity) {
/* 26 */     return new ResourceLocation("latex:textures/entities/armed_drone_hertx_texture.png");
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\client\renderer\ArmedDroneHertxRenderer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */