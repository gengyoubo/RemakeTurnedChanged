/*    */ package net.ltxprogrammer.turned.client.renderer;
/*    */ import net.ltxprogrammer.turned.client.model.ModelDark_latex_creeper_enhanced;
/*    */ import net.ltxprogrammer.turned.entity.DarkLatexCreeperEnhancedEntity;
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
/*    */ public class DarkLatexCreeperEnhancedRenderer extends MobRenderer<DarkLatexCreeperEnhancedEntity, ModelDark_latex_creeper_enhanced<DarkLatexCreeperEnhancedEntity>> {
/*    */   public DarkLatexCreeperEnhancedRenderer(EntityRendererProvider.Context context) {
/* 16 */     super(context, (EntityModel)new ModelDark_latex_creeper_enhanced(context.m_174023_(ModelDark_latex_creeper_enhanced.LAYER_LOCATION)), 0.8F);
/* 17 */     m_115326_((RenderLayer)new EyesLayer<DarkLatexCreeperEnhancedEntity, ModelDark_latex_creeper_enhanced<DarkLatexCreeperEnhancedEntity>>((RenderLayerParent)this)
/*    */         {
/*    */           public RenderType m_5708_() {
/* 20 */             return RenderType.m_110488_(new ResourceLocation("turned:textures/entities/dark_latex_creeper_enhanced_glow_texture.png"));
/*    */           }
/*    */         });
/*    */   }
/*    */ 
/*    */   
/*    */   public ResourceLocation getTextureLocation(DarkLatexCreeperEnhancedEntity entity) {
/* 27 */     return new ResourceLocation("turned:textures/entities/dark_latex_creeper_enhanced__texture.png");
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\client\renderer\DarkLatexCreeperEnhancedRenderer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */