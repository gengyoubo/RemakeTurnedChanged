/*    */ package net.ltxprogrammer.turned.client.renderer;
/*    */ import java.util.function.Function;
/*    */ import net.ltxprogrammer.changed.client.renderer.model.LatexHumanoidModel;
/*    */ import net.ltxprogrammer.changed.client.renderer.model.armor.ArmorNoneModel;
/*    */ import net.ltxprogrammer.turned.client.model.ModelDark_Latex_Centaur_Model;
/*    */ import net.ltxprogrammer.turned.entity.DarkLatexCentaurEntity;
/*    */ import net.minecraft.client.renderer.RenderType;
/*    */ import net.minecraft.client.renderer.entity.EntityRendererProvider;
/*    */ import net.minecraft.client.renderer.entity.RenderLayerParent;
/*    */ import net.minecraft.client.renderer.entity.layers.EyesLayer;
/*    */ import net.minecraft.client.renderer.entity.layers.RenderLayer;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ 
/*    */ public class DarkLatexCentaurRenderer extends LatexHumanoidRenderer<DarkLatexCentaurEntity, ModelDark_Latex_Centaur_Model, ArmorNoneModel<DarkLatexCentaurEntity>> {
/*    */   public DarkLatexCentaurRenderer(EntityRendererProvider.Context context) {
/* 17 */     super(context, (LatexHumanoidModel)new ModelDark_Latex_Centaur_Model(context.m_174023_(ModelDark_Latex_Centaur_Model.LAYER_LOCATION)), ArmorNoneModel::new, ArmorNoneModel.INNER_ARMOR, ArmorNoneModel.OUTER_ARMOR, 1.5F);
/*    */     
/* 19 */     m_115326_((RenderLayer)new EyesLayer<DarkLatexCentaurEntity, ModelDark_Latex_Centaur_Model>((RenderLayerParent)this)
/*    */         {
/*    */           public RenderType m_5708_() {
/* 22 */             return RenderType.m_110488_(new ResourceLocation("turned:textures/entities/dark_latex_centaur_glow.png"));
/*    */           }
/*    */         });
/* 25 */     m_115326_((RenderLayer)new SaddleLayer((RenderLayerParent)this, m_7200_(), LatexMod.modResource("textures/entities/dark_latex_centaur_texture_saddle.png")));
/*    */   }
/*    */ 
/*    */   
/*    */   public ResourceLocation getTextureLocation(DarkLatexCentaurEntity entity) {
/* 30 */     return new ResourceLocation("turned:textures/entities/dark_latex_centaur_texture.png");
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\client\renderer\DarkLatexCentaurRenderer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */