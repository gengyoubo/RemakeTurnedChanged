/*    */ package net.ltxprogrammer.turned.client.renderer;
/*    */ import java.util.function.Function;
/*    */ import net.ltxprogrammer.changed.client.renderer.LatexHumanoidRenderer;
/*    */ import net.ltxprogrammer.changed.client.renderer.model.armor.ArmorNoneModel;
/*    */ import net.ltxprogrammer.turned.client.model.Modeldark_latex_model;
/*    */ import net.ltxprogrammer.turned.entity.DarklatexEntity;
/*    */ import net.minecraft.client.renderer.entity.EntityRendererProvider;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ 
/*    */ public class DarklatexRenderer extends LatexHumanoidRenderer<DarklatexEntity, Modeldark_latex_model, ArmorNoneModel<DarklatexEntity>> {
/*    */   public DarklatexRenderer(EntityRendererProvider.Context context) {
/* 13 */     super(context, (LatexHumanoidModel)new Modeldark_latex_model(context.m_174023_(Modeldark_latex_model.LAYER_LOCATION)), ArmorNoneModel::new, ArmorNoneModel.INNER_ARMOR, ArmorNoneModel.OUTER_ARMOR, 0.5F);
/*    */     
/* 15 */     m_115326_((RenderLayer)new EmissiveBodyLayer((RenderLayerParent)this, new ResourceLocation("turned:textures/entities/dark_latex_glow.png")));
/*    */   }
/*    */ 
/*    */   
/*    */   public ResourceLocation getTextureLocation(DarklatexEntity entity) {
/* 20 */     return new ResourceLocation("turned:textures/entities/dark_latex_texture.png");
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\client\renderer\DarklatexRenderer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */