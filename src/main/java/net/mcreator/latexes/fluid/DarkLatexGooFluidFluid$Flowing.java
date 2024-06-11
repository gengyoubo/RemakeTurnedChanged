/*    */ package net.mcreator.latexes.fluid;
/*    */ 
/*    */ import net.minecraft.world.level.block.state.StateDefinition;
/*    */ import net.minecraft.world.level.block.state.properties.Property;
/*    */ import net.minecraft.world.level.material.Fluid;
/*    */ import net.minecraft.world.level.material.FluidState;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Flowing
/*    */   extends DarkLatexGooFluidFluid
/*    */ {
/*    */   protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
/* 62 */     super.createFluidStateDefinition(builder);
/* 63 */     builder.add(new Property[] { (Property)LEVEL });
/*    */   }
/*    */   
/*    */   public int getAmount(FluidState state) {
/* 67 */     return ((Integer)state.getValue((Property)LEVEL)).intValue();
/*    */   }
/*    */   
/*    */   public boolean isSource(FluidState state) {
/* 71 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\fluid\DarkLatexGooFluidFluid$Flowing.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */