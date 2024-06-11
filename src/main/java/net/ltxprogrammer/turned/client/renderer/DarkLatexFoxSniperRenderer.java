/*    */ package net.ltxprogrammer.turned.client.renderer;
/*    */ import net.ltxprogrammer.turned.client.model.Modeldark_latex_fox_sniper;
/*    */ import net.ltxprogrammer.turned.entity.DarkLatexFoxSniperEntity;
/*    */ import net.minecraft.client.model.EntityModel;
/*    */ import net.minecraft.client.renderer.entity.EntityRendererProvider;
/*    */ import net.minecraft.client.renderer.entity.MobRenderer;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ 
/*    */ public class DarkLatexFoxSniperRenderer extends MobRenderer<DarkLatexFoxSniperEntity, Modeldark_latex_fox_sniper<DarkLatexFoxSniperEntity>> {
/*    */   public DarkLatexFoxSniperRenderer(EntityRendererProvider.Context context) {
/* 12 */     super(context, (EntityModel)new Modeldark_latex_fox_sniper(context.m_174023_(Modeldark_latex_fox_sniper.LAYER_LOCATION)), 0.5F);
/*    */   }
/*    */ 
/*    */   
/*    */   public ResourceLocation getTextureLocation(DarkLatexFoxSniperEntity entity) {
/* 17 */     return new ResourceLocation("turned:textures/entities/darklatexfoxsniper.png");
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\client\renderer\DarkLatexFoxSniperRenderer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */