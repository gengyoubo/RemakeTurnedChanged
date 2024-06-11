/*     */ package net.ltxprogrammer.turned.init;
/*     */ 
/*     */ import net.ltxprogrammer.turned.block.BigcouchBlock;
/*     */ import net.ltxprogrammer.turned.block.BlastDoorOpenBlock;
/*     */ import net.ltxprogrammer.turned.block.BlastdoorBlock;
/*     */ import net.ltxprogrammer.turned.block.Bookpile1Block;
/*     */ import net.ltxprogrammer.turned.block.Bookpile2Block;
/*     */ import net.ltxprogrammer.turned.block.Bookpile3Block;
/*     */ import net.ltxprogrammer.turned.block.Bookpile4Block;
/*     */ import net.ltxprogrammer.turned.block.Bookpile5Block;
/*     */ import net.ltxprogrammer.turned.block.BrokenTVBlock;
/*     */ import net.ltxprogrammer.turned.block.BunkerDoorBlock;
/*     */ import net.ltxprogrammer.turned.block.BunkerHatchOpenBlock;
/*     */ import net.ltxprogrammer.turned.block.BunkerdooropenBlock;
/*     */ import net.ltxprogrammer.turned.block.BunkerhatchBlock;
/*     */ import net.ltxprogrammer.turned.block.CagelightBlock;
/*     */ import net.ltxprogrammer.turned.block.CeilinglightBlock;
/*     */ import net.ltxprogrammer.turned.block.CeilinglightenhancedBlock;
/*     */ import net.ltxprogrammer.turned.block.ChesTrapBlock;
/*     */ import net.ltxprogrammer.turned.block.ComputerBlock;
/*     */ import net.ltxprogrammer.turned.block.ComputerOnBlock;
/*     */ import net.ltxprogrammer.turned.block.ControlpaneloffBlock;
/*     */ import net.ltxprogrammer.turned.block.ControlpanelonBlock;
/*     */ import net.ltxprogrammer.turned.block.CrateBlock;
/*     */ import net.ltxprogrammer.turned.block.CryopodBlock;
/*     */ import net.ltxprogrammer.turned.block.DarklatexpuddleharmlessBlock;
/*     */ import net.ltxprogrammer.turned.block.DeskBlock;
/*     */ import net.ltxprogrammer.turned.block.DoomDollBlock;
/*     */ import net.ltxprogrammer.turned.block.EmptycapsuleBlock;
/*     */ import net.ltxprogrammer.turned.block.FlaskcontainerBlock;
/*     */ import net.ltxprogrammer.turned.block.GlassDoorBlock;
/*     */ import net.ltxprogrammer.turned.block.HighPressureCylinderBlock;
/*     */ import net.ltxprogrammer.turned.block.HighPressureCylinderGreenBlock;
/*     */ import net.ltxprogrammer.turned.block.HighPressureCylinderRedBlock;
/*     */ import net.ltxprogrammer.turned.block.InvertedGlassDoorBlock;
/*     */ import net.ltxprogrammer.turned.block.InvertedOpenGlassDoorBlock;
/*     */ import net.ltxprogrammer.turned.block.LabDoorBlock;
/*     */ import net.ltxprogrammer.turned.block.LabDoorOpenBlock;
/*     */ import net.ltxprogrammer.turned.block.LabEquipmentBlock;
/*     */ import net.ltxprogrammer.turned.block.LaptopBlock;
/*     */ import net.ltxprogrammer.turned.block.LaptopClosedBlock;
/*     */ import net.ltxprogrammer.turned.block.LaptopONBlock;
/*     */ import net.ltxprogrammer.turned.block.LatexcapsuleBlock;
/*     */ import net.ltxprogrammer.turned.block.LockerBlock;
/*     */ import net.ltxprogrammer.turned.block.MicroscopeBlock;
/*     */ import net.ltxprogrammer.turned.block.OfficechairBlock;
/*     */ import net.ltxprogrammer.turned.block.OfficetableBlock;
/*     */ import net.ltxprogrammer.turned.block.OldTVBlock;
/*     */ import net.ltxprogrammer.turned.block.OldTVONBlock;
/*     */ import net.ltxprogrammer.turned.block.OpenGlassDoorBlock;
/*     */ import net.ltxprogrammer.turned.block.PlanterBlock;
/*     */ import net.ltxprogrammer.turned.block.SaveStationBlock;
/*     */ import net.ltxprogrammer.turned.block.ScientificCrateBlock;
/*     */ import net.ltxprogrammer.turned.block.ServersBlock;
/*     */ import net.ltxprogrammer.turned.block.SmallBoxBlock;
/*     */ import net.ltxprogrammer.turned.block.SupplyCrateBlock;
/*     */ import net.ltxprogrammer.turned.block.THECONEBlock;
/*     */ import net.ltxprogrammer.turned.block.TelephoneBlock;
/*     */ import net.ltxprogrammer.turned.block.TelephonenophoneBlock;
/*     */ import net.ltxprogrammer.turned.block.VentBlock;
/*     */ import net.ltxprogrammer.turned.block.VentOpenBlock;
/*     */ import net.ltxprogrammer.turned.block.WallscreenBlock;
/*     */ import net.ltxprogrammer.turned.block.WallscreenonBlock;
/*     */ import net.minecraftforge.api.distmarker.Dist;
/*     */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*     */ import net.minecraftforge.fml.common.Mod;
/*     */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*     */ import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
/*     */ public class ClientSideHandler
/*     */ {
/*     */   @SubscribeEvent
/*     */   public static void clientSetup(FMLClientSetupEvent event) {
/* 155 */     EmptycapsuleBlock.registerRenderLayer();
/* 156 */     LatexcapsuleBlock.registerRenderLayer();
/* 157 */     DarklatexpuddleharmlessBlock.registerRenderLayer();
/* 158 */     SupplyCrateBlock.registerRenderLayer();
/* 159 */     SmallBoxBlock.registerRenderLayer();
/* 160 */     ScientificCrateBlock.registerRenderLayer();
/* 161 */     CrateBlock.registerRenderLayer();
/* 162 */     ChesTrapBlock.registerRenderLayer();
/* 163 */     ControlpaneloffBlock.registerRenderLayer();
/* 164 */     ServersBlock.registerRenderLayer();
/* 165 */     OldTVBlock.registerRenderLayer();
/* 166 */     BrokenTVBlock.registerRenderLayer();
/* 167 */     ComputerBlock.registerRenderLayer();
/* 168 */     LaptopClosedBlock.registerRenderLayer();
/* 169 */     DeskBlock.registerRenderLayer();
/* 170 */     OfficechairBlock.registerRenderLayer();
/* 171 */     PlanterBlock.registerRenderLayer();
/* 172 */     FlaskcontainerBlock.registerRenderLayer();
/* 173 */     TelephoneBlock.registerRenderLayer();
/* 174 */     VentBlock.registerRenderLayer();
/* 175 */     BunkerhatchBlock.registerRenderLayer();
/* 176 */     BunkerDoorBlock.registerRenderLayer();
/* 177 */     LabDoorBlock.registerRenderLayer();
/* 178 */     BlastdoorBlock.registerRenderLayer();
/* 179 */     CeilinglightBlock.registerRenderLayer();
/* 180 */     CagelightBlock.registerRenderLayer();
/* 181 */     SaveStationBlock.registerRenderLayer();
/* 182 */     OfficetableBlock.registerRenderLayer();
/* 183 */     LockerBlock.registerRenderLayer();
/* 184 */     LabEquipmentBlock.registerRenderLayer();
/* 185 */     WallscreenBlock.registerRenderLayer();
/* 186 */     MicroscopeBlock.registerRenderLayer();
/* 187 */     CryopodBlock.registerRenderLayer();
/* 188 */     Bookpile1Block.registerRenderLayer();
/* 189 */     Bookpile2Block.registerRenderLayer();
/* 190 */     Bookpile3Block.registerRenderLayer();
/* 191 */     Bookpile4Block.registerRenderLayer();
/* 192 */     Bookpile5Block.registerRenderLayer();
/* 193 */     GlassDoorBlock.registerRenderLayer();
/* 194 */     InvertedGlassDoorBlock.registerRenderLayer();
/* 195 */     BigcouchBlock.registerRenderLayer();
/* 196 */     HighPressureCylinderBlock.registerRenderLayer();
/* 197 */     HighPressureCylinderRedBlock.registerRenderLayer();
/* 198 */     HighPressureCylinderGreenBlock.registerRenderLayer();
/* 199 */     CeilinglightenhancedBlock.registerRenderLayer();
/* 200 */     ComputerOnBlock.registerRenderLayer();
/* 201 */     LaptopBlock.registerRenderLayer();
/* 202 */     LaptopONBlock.registerRenderLayer();
/* 203 */     TelephonenophoneBlock.registerRenderLayer();
/* 204 */     VentOpenBlock.registerRenderLayer();
/* 205 */     BunkerHatchOpenBlock.registerRenderLayer();
/* 206 */     BunkerdooropenBlock.registerRenderLayer();
/* 207 */     LabDoorOpenBlock.registerRenderLayer();
/* 208 */     WallscreenonBlock.registerRenderLayer();
/* 209 */     OpenGlassDoorBlock.registerRenderLayer();
/* 210 */     InvertedOpenGlassDoorBlock.registerRenderLayer();
/* 211 */     THECONEBlock.registerRenderLayer();
/* 212 */     OldTVONBlock.registerRenderLayer();
/* 213 */     DoomDollBlock.registerRenderLayer();
/* 214 */     ControlpanelonBlock.registerRenderLayer();
/* 215 */     BlastDoorOpenBlock.registerRenderLayer();
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\init\LatexModBlocks$ClientSideHandler.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */