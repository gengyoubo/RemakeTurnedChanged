/*    */ package net.ltxprogrammer.turned.client.renderer;
/*    */ import java.util.function.Function;
/*    */ import net.ltxprogrammer.changed.client.renderer.model.LatexHumanoidModel;
/*    */ import net.ltxprogrammer.changed.client.renderer.model.armor.ArmorNoneModel;
/*    */ import net.ltxprogrammer.turned.client.model.Modeldark_latex_snek_model;
/*    */ import net.ltxprogrammer.turned.entity.DarkLatexSnakeEntity;
/*    */ import net.minecraft.client.renderer.RenderType;
/*    */ import net.minecraft.client.renderer.entity.EntityRendererProvider;
/*    */ import net.minecraft.client.renderer.entity.RenderLayerParent;
/*    */ import net.minecraft.client.renderer.entity.layers.EyesLayer;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ 
/*    */ public class DarkLatexSnakeRenderer extends LatexHumanoidRenderer<DarkLatexSnakeEntity, Modeldark_latex_snek_model, ArmorNoneModel<DarkLatexSnakeEntity>> {
/*    */   public DarkLatexSnakeRenderer(EntityRendererProvider.Context context) {
/* 16 */     super(context, (LatexHumanoidModel)new Modeldark_latex_snek_model(context.m_174023_(Modeldark_latex_snek_model.LAYER_LOCATION)), ArmorNoneModel::new, ArmorNoneModel.INNER_ARMOR, ArmorNoneModel.OUTER_ARMOR, 0.5F);
/*    */     
/* 18 */     m_115326_((RenderLayer)new EyesLayer<DarkLatexSnakeEntity, Modeldark_latex_snek_model>((RenderLayerParent)this)
/*    */         {
/*    */           public RenderType m_5708_() {
/* 21 */             return RenderType.m_110488_(new ResourceLocation("turned:textures/entities/dark_latex_snake_glow.png"));
/*    */           }
/*    */         });
/*    */   }
/*    */ 
/*    */   
/*    */   public ResourceLocation getTextureLocation(DarkLatexSnakeEntity entity) {
/* 28 */     return new ResourceLocation("turned:textures/entities/dark_latex_snake_texture.png");
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\client\renderer\DarkLatexSnakeRenderer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */