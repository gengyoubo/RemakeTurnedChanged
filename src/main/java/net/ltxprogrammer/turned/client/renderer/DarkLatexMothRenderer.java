/*    */ package net.ltxprogrammer.turned.client.renderer;
/*    */ import java.util.function.Function;
/*    */ import net.ltxprogrammer.changed.client.renderer.LatexHumanoidRenderer;
/*    */ import net.ltxprogrammer.changed.client.renderer.model.armor.ArmorNoneModel;
/*    */ import net.ltxprogrammer.turned.client.model.Modeldl_moth_model;
/*    */ import net.ltxprogrammer.turned.entity.DarkLatexMothEntity;
/*    */ import net.minecraft.client.renderer.entity.EntityRendererProvider;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ 
/*    */ public class DarkLatexMothRenderer extends LatexHumanoidRenderer<DarkLatexMothEntity, Modeldl_moth_model, ArmorNoneModel<DarkLatexMothEntity>> {
/*    */   public DarkLatexMothRenderer(EntityRendererProvider.Context context) {
/* 13 */     super(context, (LatexHumanoidModel)new Modeldl_moth_model(context.m_174023_(Modeldl_moth_model.LAYER_LOCATION)), ArmorNoneModel::new, ArmorNoneModel.INNER_ARMOR, ArmorNoneModel.OUTER_ARMOR, 0.6F);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public ResourceLocation getTextureLocation(DarkLatexMothEntity entity) {
/* 19 */     return new ResourceLocation("turned:textures/entities/dl_moth_texture.png");
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\client\renderer\DarkLatexMothRenderer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */