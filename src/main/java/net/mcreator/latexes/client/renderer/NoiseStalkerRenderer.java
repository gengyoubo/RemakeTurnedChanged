/*    */ package net.mcreator.latexes.client.renderer;
/*    */ 
/*    */ import net.mcreator.latexes.client.model.Modeldark_latex_noise_stalker;
/*    */ import net.mcreator.latexes.entity.NoiseStalkerEntity;
/*    */ import net.minecraft.client.model.EntityModel;
/*    */ import net.minecraft.client.renderer.entity.EntityRendererProvider;
/*    */ import net.minecraft.client.renderer.entity.MobRenderer;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ 
/*    */ public class NoiseStalkerRenderer extends MobRenderer<NoiseStalkerEntity, Modeldark_latex_noise_stalker<NoiseStalkerEntity>> {
/*    */   public NoiseStalkerRenderer(EntityRendererProvider.Context context) {
/* 13 */     super(context, (EntityModel)new Modeldark_latex_noise_stalker(context.bakeLayer(Modeldark_latex_noise_stalker.LAYER_LOCATION)), 0.8F);
/*    */   }
/*    */ 
/*    */   
/*    */   public ResourceLocation getTextureLocation(NoiseStalkerEntity entity) {
/* 18 */     return new ResourceLocation("latex:textures/entities/dark_latex_noisestalker_texture.png");
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\client\renderer\NoiseStalkerRenderer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */