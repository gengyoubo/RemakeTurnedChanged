/*    */ package net.ltxprogrammer.turned.client.renderer;
/*    */ import net.ltxprogrammer.turned.client.model.Modeldrop_pod;
/*    */ import net.ltxprogrammer.turned.entity.DROPPODEntity;
/*    */ import net.minecraft.client.model.EntityModel;
/*    */ import net.minecraft.client.renderer.entity.EntityRendererProvider;
/*    */ import net.minecraft.client.renderer.entity.MobRenderer;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ 
/*    */ public class DROPPODRenderer extends MobRenderer<DROPPODEntity, Modeldrop_pod<DROPPODEntity>> {
/*    */   public DROPPODRenderer(EntityRendererProvider.Context context) {
/* 12 */     super(context, (EntityModel)new Modeldrop_pod(context.m_174023_(Modeldrop_pod.LAYER_LOCATION)), 1.2F);
/*    */   }
/*    */ 
/*    */   
/*    */   public ResourceLocation getTextureLocation(DROPPODEntity entity) {
/* 17 */     return new ResourceLocation("turned:textures/entities/drop_pod.png");
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\client\renderer\DROPPODRenderer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */