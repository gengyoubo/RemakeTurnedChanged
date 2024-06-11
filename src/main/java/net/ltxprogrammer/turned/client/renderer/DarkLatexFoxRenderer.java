/*    */ package net.ltxprogrammer.turned.client.renderer;
/*    */ import java.util.function.Function;
/*    */ import net.ltxprogrammer.changed.client.renderer.LatexHumanoidRenderer;
/*    */ import net.ltxprogrammer.changed.client.renderer.model.LatexHumanoidModel;
/*    */ import net.ltxprogrammer.changed.client.renderer.model.armor.ArmorNoneModel;
/*    */ import net.ltxprogrammer.turned.client.model.ModelDark_latex_fox;
/*    */ import net.ltxprogrammer.turned.entity.DarkLatexFoxEntity;
/*    */ import net.minecraft.client.renderer.entity.EntityRendererProvider;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ 
/*    */ public class DarkLatexFoxRenderer extends LatexHumanoidRenderer<DarkLatexFoxEntity, ModelDark_latex_fox, ArmorNoneModel<DarkLatexFoxEntity>> {
/*    */   public DarkLatexFoxRenderer(EntityRendererProvider.Context context) {
/* 14 */     super(context, (LatexHumanoidModel)new ModelDark_latex_fox(context.m_174023_(ModelDark_latex_fox.LAYER_LOCATION)), ArmorNoneModel::new, ArmorNoneModel.INNER_ARMOR, ArmorNoneModel.OUTER_ARMOR, 0.5F);
/*    */     
/* 16 */     m_115326_((RenderLayer)new EmissiveBodyLayer((RenderLayerParent)this, new ResourceLocation("turned:textures/entities/dark_latex_fox_texture_glow.png")));
/*    */   }
/*    */ 
/*    */   
/*    */   public ResourceLocation getTextureLocation(DarkLatexFoxEntity entity) {
/* 21 */     return new ResourceLocation("turned:textures/entities/darklatexfoxtexture.png");
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\client\renderer\DarkLatexFoxRenderer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */