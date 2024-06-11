/*    */ package net.ltxprogrammer.turned.client.renderer;
/*    */ import net.ltxprogrammer.turned.client.model.Modeltsc_outsider_ranged_model;
/*    */ import net.ltxprogrammer.turned.entity.TSCOutsiderGunnerEntity;
/*    */ import net.minecraft.client.renderer.RenderType;
/*    */ import net.minecraft.client.renderer.entity.EntityRendererProvider;
/*    */ import net.minecraft.client.renderer.entity.MobRenderer;
/*    */ import net.minecraft.client.renderer.entity.RenderLayerParent;
/*    */ import net.minecraft.client.renderer.entity.layers.EyesLayer;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ 
/*    */ public class TSCOutsiderGunnerRenderer extends MobRenderer<TSCOutsiderGunnerEntity, Modeltsc_outsider_ranged_model<TSCOutsiderGunnerEntity>> {
/*    */   public TSCOutsiderGunnerRenderer(EntityRendererProvider.Context context) {
/* 14 */     super(context, (EntityModel)new Modeltsc_outsider_ranged_model(context.m_174023_(Modeltsc_outsider_ranged_model.LAYER_LOCATION)), 0.5F);
/* 15 */     m_115326_((RenderLayer)new EyesLayer<TSCOutsiderGunnerEntity, Modeltsc_outsider_ranged_model<TSCOutsiderGunnerEntity>>((RenderLayerParent)this)
/*    */         {
/*    */           public RenderType m_5708_() {
/* 18 */             return RenderType.m_110488_(new ResourceLocation("turned:textures/entities/tsc_outsider_gunner_glow.png"));
/*    */           }
/*    */         });
/*    */   }
/*    */ 
/*    */   
/*    */   public ResourceLocation getTextureLocation(TSCOutsiderGunnerEntity entity) {
/* 25 */     return new ResourceLocation("turned:textures/entities/tsc_outsider_gunner_texture.png");
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\client\renderer\TSCOutsiderGunnerRenderer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */