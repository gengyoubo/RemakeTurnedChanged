/*    */ package net.ltxprogrammer.turned.client.renderer;
/*    */ import net.ltxprogrammer.turned.client.model.ModelSlimeling_remaster;
/*    */ import net.ltxprogrammer.turned.entity.ProtectorSlimelingEntity;
/*    */ import net.minecraft.client.renderer.RenderType;
/*    */ import net.minecraft.client.renderer.entity.EntityRendererProvider;
/*    */ import net.minecraft.client.renderer.entity.MobRenderer;
/*    */ import net.minecraft.client.renderer.entity.RenderLayerParent;
/*    */ import net.minecraft.client.renderer.entity.layers.EyesLayer;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ 
/*    */ public class ProtectorSlimelingRenderer extends MobRenderer<ProtectorSlimelingEntity, ModelSlimeling_remaster<ProtectorSlimelingEntity>> {
/*    */   public ProtectorSlimelingRenderer(EntityRendererProvider.Context context) {
/* 14 */     super(context, (EntityModel)new ModelSlimeling_remaster(context.m_174023_(ModelSlimeling_remaster.LAYER_LOCATION)), 0.5F);
/* 15 */     m_115326_((RenderLayer)new EyesLayer<ProtectorSlimelingEntity, ModelSlimeling_remaster<ProtectorSlimelingEntity>>((RenderLayerParent)this)
/*    */         {
/*    */           public RenderType m_5708_() {
/* 18 */             return RenderType.m_110488_(new ResourceLocation("turned:textures/entities/protector_glow.png"));
/*    */           }
/*    */         });
/*    */   }
/*    */ 
/*    */   
/*    */   public ResourceLocation getTextureLocation(ProtectorSlimelingEntity entity) {
/* 25 */     return new ResourceLocation("turned:textures/entities/protector_remaster_texture.png");
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\client\renderer\ProtectorSlimelingRenderer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */