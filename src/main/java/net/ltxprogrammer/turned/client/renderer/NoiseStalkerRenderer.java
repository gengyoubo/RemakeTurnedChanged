/*    */ package net.ltxprogrammer.turned.client.renderer;
/*    */ import net.ltxprogrammer.turned.client.model.Modeldark_latex_noise_stalker;
/*    */ import net.ltxprogrammer.turned.entity.NoiseStalkerEntity;
/*    */ import net.minecraft.client.model.EntityModel;
/*    */ import net.minecraft.client.renderer.entity.EntityRendererProvider;
/*    */ import net.minecraft.client.renderer.entity.MobRenderer;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ 
/*    */ public class NoiseStalkerRenderer extends MobRenderer<NoiseStalkerEntity, Modeldark_latex_noise_stalker<NoiseStalkerEntity>> {
/*    */   public NoiseStalkerRenderer(EntityRendererProvider.Context context) {
/* 12 */     super(context, (EntityModel)new Modeldark_latex_noise_stalker(context.m_174023_(Modeldark_latex_noise_stalker.LAYER_LOCATION)), 0.8F);
/*    */   }
/*    */ 
/*    */   
/*    */   public ResourceLocation getTextureLocation(NoiseStalkerEntity entity) {
/* 17 */     return new ResourceLocation("turned:textures/entities/dark_latex_noisestalker_texture.png");
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\client\renderer\NoiseStalkerRenderer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */