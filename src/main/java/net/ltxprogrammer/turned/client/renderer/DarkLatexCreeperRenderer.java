/*    */ package net.ltxprogrammer.turned.client.renderer;
/*    */ import net.ltxprogrammer.turned.client.model.ModelDark_latex_creeper;
/*    */ import net.ltxprogrammer.turned.entity.DarkLatexCreeperEntity;
/*    */ import net.minecraft.client.model.EntityModel;
/*    */ import net.minecraft.client.renderer.entity.EntityRendererProvider;
/*    */ import net.minecraft.client.renderer.entity.MobRenderer;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ 
/*    */ public class DarkLatexCreeperRenderer extends MobRenderer<DarkLatexCreeperEntity, ModelDark_latex_creeper<DarkLatexCreeperEntity>> {
/*    */   public DarkLatexCreeperRenderer(EntityRendererProvider.Context context) {
/* 12 */     super(context, (EntityModel)new ModelDark_latex_creeper(context.m_174023_(ModelDark_latex_creeper.LAYER_LOCATION)), 0.5F);
/*    */   }
/*    */ 
/*    */   
/*    */   public ResourceLocation getTextureLocation(DarkLatexCreeperEntity entity) {
/* 17 */     return new ResourceLocation("turned:textures/entities/dark_latex_creeper_texture.png");
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\client\renderer\DarkLatexCreeperRenderer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */