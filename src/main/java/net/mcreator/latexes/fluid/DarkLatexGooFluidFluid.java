/*    */ package net.mcreator.latexes.fluid;
/*    */ 
/*    */ import java.util.function.Supplier;
/*    */ import net.mcreator.latexes.init.LatexModBlocks;
/*    */ import net.mcreator.latexes.init.LatexModFluids;
/*    */ import net.mcreator.latexes.init.LatexModItems;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.sounds.SoundEvent;
/*    */ import net.minecraft.world.level.BlockGetter;
/*    */ import net.minecraft.world.level.block.LiquidBlock;
/*    */ import net.minecraft.world.level.block.state.StateDefinition;
/*    */ import net.minecraft.world.level.block.state.properties.Property;
/*    */ import net.minecraft.world.level.material.Fluid;
/*    */ import net.minecraft.world.level.material.FluidState;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ import net.minecraftforge.fluids.FluidAttributes;
/*    */ import net.minecraftforge.fluids.ForgeFlowingFluid;
/*    */ import net.minecraftforge.registries.ForgeRegistries;
/*    */ 
/*    */ public abstract class DarkLatexGooFluidFluid extends ForgeFlowingFluid {
/* 22 */   public static final ForgeFlowingFluid.Properties PROPERTIES = (new ForgeFlowingFluid.Properties((Supplier)LatexModFluids.DARK_LATEX_GOO_FLUID, (Supplier)LatexModFluids.FLOWING_DARK_LATEX_GOO_FLUID, 
/*    */ 
/*    */       
/* 25 */       FluidAttributes.builder(new ResourceLocation("latex:blocks/dark_latex_goo_fluid"), new ResourceLocation("latex:blocks/dark_latex_goo_fluid"))
/*    */       
/* 27 */       .density(5000).viscosity(2500).temperature(350)
/*    */       
/* 29 */       .sound((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.slime_block.place")))))
/* 30 */     .explosionResistance(125.0F).canMultiply().tickRate(15).levelDecreasePerBlock(4).slopeFindDistance(3)
/* 31 */     .bucket((Supplier)LatexModItems.DARK_LATEX_GOO_FLUID_BUCKET).block(() -> (LiquidBlock)LatexModBlocks.DARK_LATEX_GOO_FLUID.get());
/*    */   
/*    */   private DarkLatexGooFluidFluid() {
/* 34 */     super(PROPERTIES);
/*    */   }
/*    */ 
/*    */   
/*    */   public Vec3 getFlow(BlockGetter world, BlockPos pos, FluidState fluidstate) {
/* 39 */     return super.getFlow(world, pos, fluidstate).scale(-2.0D);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public static class Source
/*    */     extends DarkLatexGooFluidFluid
/*    */   {
/*    */     public int getAmount(FluidState state) {
/* 48 */       return 8;
/*    */     }
/*    */     
/*    */     public boolean isSource(FluidState state) {
/* 52 */       return true;
/*    */     }
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public static class Flowing
/*    */     extends DarkLatexGooFluidFluid
/*    */   {
/*    */     protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
/* 62 */       super.createFluidStateDefinition(builder);
/* 63 */       builder.add(new Property[] { (Property)LEVEL });
/*    */     }
/*    */     
/*    */     public int getAmount(FluidState state) {
/* 67 */       return ((Integer)state.getValue((Property)LEVEL)).intValue();
/*    */     }
/*    */     
/*    */     public boolean isSource(FluidState state) {
/* 71 */       return false;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\fluid\DarkLatexGooFluidFluid.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */