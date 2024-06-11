/*    */ package net.ltxprogrammer.turned.client.renderer;
/*    */ import net.ltxprogrammer.turned.client.model.ModelLatex_Drop_Pod;
/*    */ import net.ltxprogrammer.turned.entity.LatexDropPodEntity;
/*    */ import net.minecraft.client.model.EntityModel;
/*    */ import net.minecraft.client.renderer.entity.EntityRendererProvider;
/*    */ import net.minecraft.client.renderer.entity.MobRenderer;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ 
/*    */ public class LatexDropPodRenderer extends MobRenderer<LatexDropPodEntity, ModelLatex_Drop_Pod<LatexDropPodEntity>> {
/*    */   public LatexDropPodRenderer(EntityRendererProvider.Context context) {
/* 12 */     super(context, (EntityModel)new ModelLatex_Drop_Pod(context.m_174023_(ModelLatex_Drop_Pod.LAYER_LOCATION)), 1.2F);
/*    */   }
/*    */ 
/*    */   
/*    */   public ResourceLocation getTextureLocation(LatexDropPodEntity entity) {
/* 17 */     return new ResourceLocation("turned:textures/entities/latex_drop_pod.png");
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\client\renderer\LatexDropPodRenderer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */