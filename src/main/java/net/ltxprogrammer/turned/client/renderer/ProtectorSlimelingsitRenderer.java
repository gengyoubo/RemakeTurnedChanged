/*    */ package net.ltxprogrammer.turned.client.renderer;
/*    */ import net.ltxprogrammer.turned.client.model.ModelSlimeling_remaster_sit;
/*    */ import net.ltxprogrammer.turned.entity.ProtectorSlimelingsitEntity;
/*    */ import net.minecraft.client.model.EntityModel;
/*    */ import net.minecraft.client.renderer.RenderType;
/*    */ import net.minecraft.client.renderer.entity.EntityRendererProvider;
/*    */ import net.minecraft.client.renderer.entity.MobRenderer;
/*    */ import net.minecraft.client.renderer.entity.RenderLayerParent;
/*    */ import net.minecraft.client.renderer.entity.layers.EyesLayer;
/*    */ import net.minecraft.client.renderer.entity.layers.RenderLayer;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ 
/*    */ public class ProtectorSlimelingsitRenderer extends MobRenderer<ProtectorSlimelingsitEntity, ModelSlimeling_remaster_sit<ProtectorSlimelingsitEntity>> {
/*    */   public ProtectorSlimelingsitRenderer(EntityRendererProvider.Context context) {
/* 16 */     super(context, (EntityModel)new ModelSlimeling_remaster_sit(context.m_174023_(ModelSlimeling_remaster_sit.LAYER_LOCATION)), 0.7F);
/* 17 */     m_115326_((RenderLayer)new EyesLayer<ProtectorSlimelingsitEntity, ModelSlimeling_remaster_sit<ProtectorSlimelingsitEntity>>((RenderLayerParent)this)
/*    */         {
/*    */           public RenderType m_5708_() {
/* 20 */             return RenderType.m_110488_(new ResourceLocation("turned:textures/entities/protector_glow.png"));
/*    */           }
/*    */         });
/*    */   }
/*    */ 
/*    */   
/*    */   public ResourceLocation getTextureLocation(ProtectorSlimelingsitEntity entity) {
/* 27 */     return new ResourceLocation("turned:textures/entities/protector_remaster_texture.png");
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\client\renderer\ProtectorSlimelingsitRenderer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */