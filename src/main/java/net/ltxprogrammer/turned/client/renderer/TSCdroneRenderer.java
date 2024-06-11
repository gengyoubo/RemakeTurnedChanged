/*    */ package net.ltxprogrammer.turned.client.renderer;
/*    */ import net.ltxprogrammer.turned.client.model.Modeltsc_drone_model;
/*    */ import net.ltxprogrammer.turned.entity.TSCdroneEntity;
/*    */ import net.minecraft.client.renderer.RenderType;
/*    */ import net.minecraft.client.renderer.entity.EntityRendererProvider;
/*    */ import net.minecraft.client.renderer.entity.MobRenderer;
/*    */ import net.minecraft.client.renderer.entity.RenderLayerParent;
/*    */ import net.minecraft.client.renderer.entity.layers.EyesLayer;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ 
/*    */ public class TSCdroneRenderer extends MobRenderer<TSCdroneEntity, Modeltsc_drone_model<TSCdroneEntity>> {
/*    */   public TSCdroneRenderer(EntityRendererProvider.Context context) {
/* 14 */     super(context, (EntityModel)new Modeltsc_drone_model(context.m_174023_(Modeltsc_drone_model.LAYER_LOCATION)), 0.5F);
/* 15 */     m_115326_((RenderLayer)new EyesLayer<TSCdroneEntity, Modeltsc_drone_model<TSCdroneEntity>>((RenderLayerParent)this)
/*    */         {
/*    */           public RenderType m_5708_() {
/* 18 */             return RenderType.m_110488_(new ResourceLocation("turned:textures/entities/tsc_drone_glow.png"));
/*    */           }
/*    */         });
/*    */   }
/*    */ 
/*    */   
/*    */   public ResourceLocation getTextureLocation(TSCdroneEntity entity) {
/* 25 */     return new ResourceLocation("turned:textures/entities/tsc_drone_texture.png");
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\client\renderer\TSCdroneRenderer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */