/*    */ package net.ltxprogrammer.turned.client.renderer;
/*    */ import net.ltxprogrammer.turned.client.model.ModelScientific_Drop_Pod;
/*    */ import net.ltxprogrammer.turned.entity.AllydroppodEntity;
/*    */ import net.minecraft.client.renderer.RenderType;
/*    */ import net.minecraft.client.renderer.entity.EntityRendererProvider;
/*    */ import net.minecraft.client.renderer.entity.MobRenderer;
/*    */ import net.minecraft.client.renderer.entity.RenderLayerParent;
/*    */ import net.minecraft.client.renderer.entity.layers.EyesLayer;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ 
/*    */ public class AllydroppodRenderer extends MobRenderer<AllydroppodEntity, ModelScientific_Drop_Pod<AllydroppodEntity>> {
/*    */   public AllydroppodRenderer(EntityRendererProvider.Context context) {
/* 14 */     super(context, (EntityModel)new ModelScientific_Drop_Pod(context.m_174023_(ModelScientific_Drop_Pod.LAYER_LOCATION)), 1.2F);
/* 15 */     m_115326_((RenderLayer)new EyesLayer<AllydroppodEntity, ModelScientific_Drop_Pod<AllydroppodEntity>>((RenderLayerParent)this)
/*    */         {
/*    */           public RenderType m_5708_() {
/* 18 */             return RenderType.m_110488_(new ResourceLocation("turned:textures/entities/scientific_drop_pod_glow.png"));
/*    */           }
/*    */         });
/*    */   }
/*    */ 
/*    */   
/*    */   public ResourceLocation getTextureLocation(AllydroppodEntity entity) {
/* 25 */     return new ResourceLocation("turned:textures/entities/scientific_drop_pod.png");
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\client\renderer\AllydroppodRenderer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */