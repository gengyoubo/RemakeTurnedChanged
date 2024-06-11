/*    */ package net.ltxprogrammer.turned.client.particle;
/*    */ import net.minecraft.client.multiplayer.ClientLevel;
/*    */ import net.minecraft.client.particle.Particle;
/*    */ import net.minecraft.client.particle.ParticleProvider;
/*    */ import net.minecraft.client.particle.ParticleRenderType;
/*    */ import net.minecraft.client.particle.SpriteSet;
/*    */ import net.minecraft.client.particle.TextureSheetParticle;
/*    */ import net.minecraft.core.particles.ParticleOptions;
/*    */ import net.minecraft.core.particles.SimpleParticleType;
/*    */ import net.minecraftforge.api.distmarker.Dist;
/*    */ import net.minecraftforge.api.distmarker.OnlyIn;
/*    */ 
/*    */ @OnlyIn(Dist.CLIENT)
/*    */ public class DleffectparticlesParticle extends TextureSheetParticle {
/*    */   private final SpriteSet spriteSet;
/*    */   
/*    */   public static DleffectparticlesParticleProvider provider(SpriteSet spriteSet) {
/* 18 */     return new DleffectparticlesParticleProvider(spriteSet);
/*    */   }
/*    */   private float angularVelocity; private final float angularAcceleration;
/*    */   
/*    */   public static class DleffectparticlesParticleProvider implements ParticleProvider<SimpleParticleType> { private final SpriteSet spriteSet;
/*    */     
/*    */     public DleffectparticlesParticleProvider(SpriteSet spriteSet) {
/* 25 */       this.spriteSet = spriteSet;
/*    */     }
/*    */ 
/*    */     
/*    */     public Particle createParticle(SimpleParticleType typeIn, ClientLevel worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
/* 30 */       return (Particle)new DleffectparticlesParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed, this.spriteSet);
/*    */     } }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected DleffectparticlesParticle(ClientLevel world, double x, double y, double z, double vx, double vy, double vz, SpriteSet spriteSet) {
/* 40 */     super(world, x, y, z);
/* 41 */     this.spriteSet = spriteSet;
/* 42 */     m_107250_(0.5F, 0.5F);
/* 43 */     this.f_107663_ *= 0.4F;
/* 44 */     this.f_107225_ = 15;
/* 45 */     this.f_107226_ = -0.4F;
/* 46 */     this.f_107219_ = true;
/* 47 */     this.f_107215_ = vx * 0.5D;
/* 48 */     this.f_107216_ = vy * 0.5D;
/* 49 */     this.f_107217_ = vz * 0.5D;
/* 50 */     this.angularVelocity = 0.0F;
/* 51 */     this.angularAcceleration = 1.2F;
/* 52 */     m_108339_(spriteSet);
/*    */   }
/*    */ 
/*    */   
/*    */   public ParticleRenderType m_7556_() {
/* 57 */     return ParticleRenderType.f_107430_;
/*    */   }
/*    */ 
/*    */   
/*    */   public void m_5989_() {
/* 62 */     super.m_5989_();
/* 63 */     this.f_107204_ = this.f_107231_;
/* 64 */     this.f_107231_ += this.angularVelocity;
/* 65 */     this.angularVelocity += this.angularAcceleration;
/* 66 */     if (!this.f_107220_)
/* 67 */       m_108337_(this.spriteSet.m_5819_(this.f_107224_ / 15 % 5 + 1, 5)); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\client\particle\DleffectparticlesParticle.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */