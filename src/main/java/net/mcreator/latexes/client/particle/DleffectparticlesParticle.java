/*    */ package net.mcreator.latexes.client.particle;
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
/*    */   private float angularVelocity; private float angularAcceleration;
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
/* 42 */     setSize(0.5F, 0.5F);
/* 43 */     this.quadSize *= 0.4F;
/* 44 */     this.lifetime = 15;
/* 45 */     this.gravity = -0.4F;
/* 46 */     this.hasPhysics = true;
/* 47 */     this.xd = vx * 0.5D;
/* 48 */     this.yd = vy * 0.5D;
/* 49 */     this.zd = vz * 0.5D;
/* 50 */     this.angularVelocity = 0.0F;
/* 51 */     this.angularAcceleration = 1.2F;
/* 52 */     setSpriteFromAge(spriteSet);
/*    */   }
/*    */ 
/*    */   
/*    */   public ParticleRenderType getRenderType() {
/* 57 */     return ParticleRenderType.PARTICLE_SHEET_OPAQUE;
/*    */   }
/*    */ 
/*    */   
/*    */   public void tick() {
/* 62 */     super.tick();
/* 63 */     this.oRoll = this.roll;
/* 64 */     this.roll += this.angularVelocity;
/* 65 */     this.angularVelocity += this.angularAcceleration;
/* 66 */     if (!this.removed)
/* 67 */       setSprite(this.spriteSet.get(this.age / 15 % 5 + 1, 5)); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\client\particle\DleffectparticlesParticle.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */