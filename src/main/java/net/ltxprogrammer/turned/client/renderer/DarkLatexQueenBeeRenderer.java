/*    */ package net.ltxprogrammer.turned.client.renderer;
/*    */ import net.ltxprogrammer.turned.client.model.ModelDL_Queen_Bee;
/*    */ import net.ltxprogrammer.turned.entity.DarkLatexQueenBeeEntity;
/*    */ import net.minecraft.client.renderer.RenderType;
/*    */ import net.minecraft.client.renderer.entity.EntityRendererProvider;
/*    */ import net.minecraft.client.renderer.entity.MobRenderer;
/*    */ import net.minecraft.client.renderer.entity.RenderLayerParent;
/*    */ import net.minecraft.client.renderer.entity.layers.EyesLayer;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ 
/*    */ public class DarkLatexQueenBeeRenderer extends MobRenderer<DarkLatexQueenBeeEntity, ModelDL_Queen_Bee<DarkLatexQueenBeeEntity>> {
/*    */   public DarkLatexQueenBeeRenderer(EntityRendererProvider.Context context) {
/* 14 */     super(context, (EntityModel)new ModelDL_Queen_Bee(context.m_174023_(ModelDL_Queen_Bee.LAYER_LOCATION)), 1.0F);
/* 15 */     m_115326_((RenderLayer)new EyesLayer<DarkLatexQueenBeeEntity, ModelDL_Queen_Bee<DarkLatexQueenBeeEntity>>((RenderLayerParent)this)
/*    */         {
/*    */           public RenderType m_5708_() {
/* 18 */             return RenderType.m_110488_(new ResourceLocation("turned:textures/entities/dark_latex_queen_bee_glow.png"));
/*    */           }
/*    */         });
/*    */   }
/*    */ 
/*    */   
/*    */   public ResourceLocation getTextureLocation(DarkLatexQueenBeeEntity entity) {
/* 25 */     return new ResourceLocation("turned:textures/entities/dark_latex_queen_bee_texture.png");
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\client\renderer\DarkLatexQueenBeeRenderer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */