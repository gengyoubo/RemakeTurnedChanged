/*    */ package net.ltxprogrammer.turned.client.renderer;
/*    */ import java.util.function.Function;
/*    */ import net.ltxprogrammer.changed.client.renderer.model.armor.ArmorNoneModel;
/*    */ import net.ltxprogrammer.turned.client.model.Modeldark_latex_shark;
/*    */ import net.ltxprogrammer.turned.entity.DlsharkEntity;
/*    */ import net.minecraft.client.renderer.RenderType;
/*    */ import net.minecraft.client.renderer.entity.EntityRendererProvider;
/*    */ import net.minecraft.client.renderer.entity.RenderLayerParent;
/*    */ import net.minecraft.client.renderer.entity.layers.EyesLayer;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ 
/*    */ public class DlsharkRenderer extends LatexHumanoidRenderer<DlsharkEntity, Modeldark_latex_shark, ArmorNoneModel<DlsharkEntity>> {
/*    */   public DlsharkRenderer(EntityRendererProvider.Context context) {
/* 15 */     super(context, (LatexHumanoidModel)new Modeldark_latex_shark(context.m_174023_(Modeldark_latex_shark.LAYER_LOCATION)), ArmorNoneModel::new, ArmorNoneModel.INNER_ARMOR, ArmorNoneModel.OUTER_ARMOR, 0.6F);
/*    */     
/* 17 */     m_115326_((RenderLayer)new EyesLayer<DlsharkEntity, Modeldark_latex_shark>((RenderLayerParent)this)
/*    */         {
/*    */           public RenderType m_5708_() {
/* 20 */             return RenderType.m_110488_(new ResourceLocation("turned:textures/entities/dark_latex_shark_glow.png"));
/*    */           }
/*    */         });
/*    */   }
/*    */ 
/*    */   
/*    */   public ResourceLocation getTextureLocation(DlsharkEntity entity) {
/* 27 */     return new ResourceLocation("turned:textures/entities/dark_latex_shark_texture.png");
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\client\renderer\DlsharkRenderer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */