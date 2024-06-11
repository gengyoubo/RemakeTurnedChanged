/*    */ package net.ltxprogrammer.turned.client.renderer;
/*    */ import net.ltxprogrammer.turned.client.model.Modelqueen_spider_latex_model;
/*    */ import net.ltxprogrammer.turned.entity.DarkLatexSpiderQueenEntity;
/*    */ import net.minecraft.client.renderer.RenderType;
/*    */ import net.minecraft.client.renderer.entity.EntityRendererProvider;
/*    */ import net.minecraft.client.renderer.entity.MobRenderer;
/*    */ import net.minecraft.client.renderer.entity.RenderLayerParent;
/*    */ import net.minecraft.client.renderer.entity.layers.EyesLayer;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ 
/*    */ public class DarkLatexSpiderQueenRenderer extends MobRenderer<DarkLatexSpiderQueenEntity, Modelqueen_spider_latex_model<DarkLatexSpiderQueenEntity>> {
/*    */   public DarkLatexSpiderQueenRenderer(EntityRendererProvider.Context context) {
/* 14 */     super(context, (EntityModel)new Modelqueen_spider_latex_model(context.m_174023_(Modelqueen_spider_latex_model.LAYER_LOCATION)), 1.2F);
/* 15 */     m_115326_((RenderLayer)new EyesLayer<DarkLatexSpiderQueenEntity, Modelqueen_spider_latex_model<DarkLatexSpiderQueenEntity>>((RenderLayerParent)this)
/*    */         {
/*    */           public RenderType m_5708_() {
/* 18 */             return RenderType.m_110488_(new ResourceLocation("turned:textures/entities/spider_latex_queen_glow.png"));
/*    */           }
/*    */         });
/*    */   }
/*    */ 
/*    */   
/*    */   public ResourceLocation getTextureLocation(DarkLatexSpiderQueenEntity entity) {
/* 25 */     return new ResourceLocation("turned:textures/entities/spider_latex_queen_texture.png");
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\client\renderer\DarkLatexSpiderQueenRenderer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */