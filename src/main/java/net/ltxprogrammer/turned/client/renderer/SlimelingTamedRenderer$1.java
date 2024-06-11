/*    */ package net.ltxprogrammer.turned.client.renderer;
/*    */ 
/*    */ import net.ltxprogrammer.turned.client.model.ModelSlimeling_remaster;
/*    */ import net.ltxprogrammer.turned.entity.SlimelingTamedEntity;
/*    */ import net.minecraft.client.renderer.RenderType;
/*    */ import net.minecraft.client.renderer.entity.RenderLayerParent;
/*    */ import net.minecraft.client.renderer.entity.layers.EyesLayer;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ 
/*    */ 
/*    */ class null
/*    */   extends EyesLayer<SlimelingTamedEntity, ModelSlimeling_remaster<SlimelingTamedEntity>>
/*    */ {
/*    */   null(RenderLayerParent<SlimelingTamedEntity, ModelSlimeling_remaster<SlimelingTamedEntity>> arg0) {
/* 15 */     super(arg0);
/*    */   }
/*    */   public RenderType m_5708_() {
/* 18 */     return RenderType.m_110488_(new ResourceLocation("turned:textures/entities/slimeling_tamed_glow.png"));
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\client\renderer\SlimelingTamedRenderer$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */