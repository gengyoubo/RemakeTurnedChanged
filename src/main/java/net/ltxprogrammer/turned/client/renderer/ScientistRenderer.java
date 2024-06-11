/*    */ package net.ltxprogrammer.turned.client.renderer;
/*    */ import net.ltxprogrammer.turned.entity.ScientistEntity;
/*    */ import net.ltxprogrammer.turned.init.LatexModModels;
/*    */ import net.minecraft.client.model.HumanoidModel;
/*    */ import net.minecraft.client.model.geom.ModelLayers;
/*    */ import net.minecraft.client.renderer.entity.EntityRendererProvider;
/*    */ import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
/*    */ import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.Mob;
/*    */ 
/*    */ public class ScientistRenderer extends HumanoidMobRenderer<ScientistEntity, HumanoidModel<ScientistEntity>> {
/*    */   public ScientistRenderer(EntityRendererProvider.Context context) {
/* 15 */     super(context, new HumanoidModel(context.m_174023_(LatexModModels.HUMANOID)), 0.5F);
/* 16 */     m_115326_((RenderLayer)new HumanoidArmorLayer((RenderLayerParent)this, new HumanoidModel(context.m_174023_(ModelLayers.f_171164_)), new HumanoidModel(context
/* 17 */             .m_174023_(ModelLayers.f_171165_))));
/*    */   }
/*    */ 
/*    */   
/*    */   public ResourceLocation getTextureLocation(ScientistEntity entity) {
/* 22 */     return new ResourceLocation("turned:textures/entities/scientist_steve.png");
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\client\renderer\ScientistRenderer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */