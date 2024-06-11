/*    */ package net.mcreator.latexes.client.renderer;
/*    */ 
/*    */ import net.mcreator.latexes.client.model.Modeldrop_pod;
/*    */ import net.mcreator.latexes.entity.DROPPODEntity;
/*    */ import net.minecraft.client.model.EntityModel;
/*    */ import net.minecraft.client.renderer.entity.EntityRendererProvider;
/*    */ import net.minecraft.client.renderer.entity.MobRenderer;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ 
/*    */ public class DROPPODRenderer extends MobRenderer<DROPPODEntity, Modeldrop_pod<DROPPODEntity>> {
/*    */   public DROPPODRenderer(EntityRendererProvider.Context context) {
/* 13 */     super(context, (EntityModel)new Modeldrop_pod(context.bakeLayer(Modeldrop_pod.LAYER_LOCATION)), 1.2F);
/*    */   }
/*    */ 
/*    */   
/*    */   public ResourceLocation getTextureLocation(DROPPODEntity entity) {
/* 18 */     return new ResourceLocation("latex:textures/entities/drop_pod.png");
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\client\renderer\DROPPODRenderer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */