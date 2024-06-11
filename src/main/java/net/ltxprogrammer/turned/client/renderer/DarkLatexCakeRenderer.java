/*    */ package net.ltxprogrammer.turned.client.renderer;
/*    */ import java.util.function.Function;
/*    */ import net.ltxprogrammer.changed.client.renderer.LatexHumanoidRenderer;
/*    */ import net.ltxprogrammer.changed.client.renderer.model.LatexHumanoidModel;
/*    */ import net.ltxprogrammer.changed.client.renderer.model.armor.ArmorNoneModel;
/*    */ import net.ltxprogrammer.turned.client.model.Modeldark_latex_cake_model;
/*    */ import net.ltxprogrammer.turned.entity.DarkLatexCakeEntity;
/*    */ import net.minecraft.client.renderer.entity.EntityRendererProvider;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ 
/*    */ public class DarkLatexCakeRenderer extends LatexHumanoidRenderer<DarkLatexCakeEntity, Modeldark_latex_cake_model, ArmorNoneModel<DarkLatexCakeEntity>> {
/*    */   public DarkLatexCakeRenderer(EntityRendererProvider.Context context) {
/* 14 */     super(context, (LatexHumanoidModel)new Modeldark_latex_cake_model(context.m_174023_(Modeldark_latex_cake_model.LAYER_LOCATION)), ArmorNoneModel::new, ArmorNoneModel.INNER_ARMOR, ArmorNoneModel.OUTER_ARMOR, 0.5F);
/*    */     
/* 16 */     m_115326_((RenderLayer)new EmissiveBodyLayer((RenderLayerParent)this, new ResourceLocation("turned:textures/entities/dark_latex_cake_glow.png")));
/*    */   }
/*    */ 
/*    */   
/*    */   public ResourceLocation getTextureLocation(DarkLatexCakeEntity entity) {
/* 21 */     return new ResourceLocation("turned:textures/entities/dark_latex_cake_model.png");
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\client\renderer\DarkLatexCakeRenderer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */