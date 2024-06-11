/*    */ package net.ltxprogrammer.turned.client.renderer;
/*    */ import net.ltxprogrammer.turned.client.model.ModelTSC_Hunter_model;
/*    */ import net.ltxprogrammer.turned.entity.TSCHunterEntity;
/*    */ import net.minecraft.client.renderer.RenderType;
/*    */ import net.minecraft.client.renderer.entity.EntityRendererProvider;
/*    */ import net.minecraft.client.renderer.entity.MobRenderer;
/*    */ import net.minecraft.client.renderer.entity.RenderLayerParent;
/*    */ import net.minecraft.client.renderer.entity.layers.EyesLayer;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ 
/*    */ public class TSCHunterRenderer extends MobRenderer<TSCHunterEntity, ModelTSC_Hunter_model<TSCHunterEntity>> {
/*    */   public TSCHunterRenderer(EntityRendererProvider.Context context) {
/* 14 */     super(context, (EntityModel)new ModelTSC_Hunter_model(context.m_174023_(ModelTSC_Hunter_model.LAYER_LOCATION)), 0.6F);
/* 15 */     m_115326_((RenderLayer)new EyesLayer<TSCHunterEntity, ModelTSC_Hunter_model<TSCHunterEntity>>((RenderLayerParent)this)
/*    */         {
/*    */           public RenderType m_5708_() {
/* 18 */             return RenderType.m_110488_(new ResourceLocation("turned:textures/entities/tsc_hunter_glow.png"));
/*    */           }
/*    */         });
/*    */   }
/*    */ 
/*    */   
/*    */   public ResourceLocation getTextureLocation(TSCHunterEntity entity) {
/* 25 */     return new ResourceLocation("turned:textures/entities/tsc_hunter_texture.png");
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\client\renderer\TSCHunterRenderer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */