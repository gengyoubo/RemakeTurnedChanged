/*     */ package net.ltxprogrammer.turned.init;
/*     */ import net.ltxprogrammer.turned.block.Bookpile1Block;
/*     */ import net.ltxprogrammer.turned.block.Bookpile3Block;
/*     */ import net.ltxprogrammer.turned.block.Bookpile4Block;
/*     */ import net.ltxprogrammer.turned.block.BrokenTVBlock;
/*     */ import net.ltxprogrammer.turned.block.BunkerHatchOpenBlock;
/*     */ import net.ltxprogrammer.turned.block.DeskBlock;
/*     */ import net.ltxprogrammer.turned.block.DoomDollBlock;
/*     */ import net.ltxprogrammer.turned.block.EmptycapsuleBlock;
/*     */ import net.ltxprogrammer.turned.block.LaptopONBlock;
/*     */ import net.ltxprogrammer.turned.block.LatexcapsuleBlock;
/*     */ import net.ltxprogrammer.turned.block.OldTVBlock;
/*     */ import net.ltxprogrammer.turned.block.ServersBlock;
/*     */ import net.ltxprogrammer.turned.block.SupplyCrateBlock;
/*     */ import net.ltxprogrammer.turned.block.THECONEBlock;
/*     */ import net.ltxprogrammer.turned.block.WallscreenBlock;
/*     */ import net.minecraft.world.level.block.Block;
/*     */ import net.minecraftforge.registries.RegistryObject;
/*     */ 
/*     */ public class LatexModBlocks {
/*  21 */   public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, "turned");
/*  22 */   public static final RegistryObject<Block> DARKLATEXHIVE = REGISTRY.register("darklatexhive", () -> new DarklatexhiveBlock());
/*  23 */   public static final RegistryObject<Block> INFESTEDDLCOBBLESTONE = REGISTRY.register("infesteddlcobblestone", () -> new InfesteddlcobblestoneBlock());
/*     */   
/*  25 */   public static final RegistryObject<Block> EMPTYCAPSULE = REGISTRY.register("emptycapsule", () -> new EmptycapsuleBlock());
/*  26 */   public static final RegistryObject<Block> LATEXCAPSULE = REGISTRY.register("latexcapsule", () -> new LatexcapsuleBlock());
/*  27 */   public static final RegistryObject<Block> DARKLATEXPUDDLEHARMLESS = REGISTRY.register("darklatexpuddleharmless", () -> new DarklatexpuddleharmlessBlock());
/*     */   
/*  29 */   public static final RegistryObject<Block> LATEXEATERSLIME = REGISTRY.register("latexeaterslime", () -> new LatexeaterslimeBlock());
/*  30 */   public static final RegistryObject<Block> BLACKLABBLOCK_1A = REGISTRY.register("blacklabblock_1a", () -> new Blacklabblock1aBlock());
/*  31 */   public static final RegistryObject<Block> BLACKLABBLOCK_2 = REGISTRY.register("blacklabblock_2", () -> new Blacklabblock2Block());
/*  32 */   public static final RegistryObject<Block> BLACKLABBLOCK_3 = REGISTRY.register("blacklabblock_3", () -> new Blacklabblock3Block());
/*  33 */   public static final RegistryObject<Block> BLACKLABSLAB = REGISTRY.register("blacklabslab", () -> new BlacklabslabBlock());
/*  34 */   public static final RegistryObject<Block> REINFORCEDCONCRETE = REGISTRY.register("reinforcedconcrete", () -> new ReinforcedconcreteBlock());
/*  35 */   public static final RegistryObject<Block> BLUELABBLOCK_1 = REGISTRY.register("bluelabblock_1", () -> new Bluelabblock1Block());
/*  36 */   public static final RegistryObject<Block> BLUELABBLOCK_2 = REGISTRY.register("bluelabblock_2", () -> new Bluelabblock2Block());
/*  37 */   public static final RegistryObject<Block> BLUELABSLABS = REGISTRY.register("bluelabslabs", () -> new BluelabslabsBlock());
/*  38 */   public static final RegistryObject<Block> REINFORCEDBLUECONCRETE = REGISTRY.register("reinforcedblueconcrete", () -> new ReinforcedblueconcreteBlock());
/*     */   
/*  40 */   public static final RegistryObject<Block> GREENLABBLOCK_1 = REGISTRY.register("greenlabblock_1", () -> new Greenlabblock1Block());
/*  41 */   public static final RegistryObject<Block> GREENLABBLOCK_2 = REGISTRY.register("greenlabblock_2", () -> new Greenlabblock2Block());
/*  42 */   public static final RegistryObject<Block> GREENLABSLABS = REGISTRY.register("greenlabslabs", () -> new GreenlabslabsBlock());
/*  43 */   public static final RegistryObject<Block> REINFORCEDGREENCONCRETE = REGISTRY.register("reinforcedgreenconcrete", () -> new ReinforcedgreenconcreteBlock());
/*     */   
/*  45 */   public static final RegistryObject<Block> PURPLELABBLOCK_1 = REGISTRY.register("purplelabblock_1", () -> new Purplelabblock1Block());
/*  46 */   public static final RegistryObject<Block> PURPLELABBLOCK_2 = REGISTRY.register("purplelabblock_2", () -> new Purplelabblock2Block());
/*  47 */   public static final RegistryObject<Block> PURPLE_LAB_SLAB = REGISTRY.register("purple_lab_slab", () -> new PurpleLabSlabBlock());
/*  48 */   public static final RegistryObject<Block> REINFORCEDPURPLECONCRETE = REGISTRY.register("reinforcedpurpleconcrete", () -> new ReinforcedpurpleconcreteBlock());
/*     */   
/*  50 */   public static final RegistryObject<Block> YELLOWLABBLOCK_1 = REGISTRY.register("yellowlabblock_1", () -> new Yellowlabblock1Block());
/*  51 */   public static final RegistryObject<Block> YELLOWLABBLOCK_2 = REGISTRY.register("yellowlabblock_2", () -> new Yellowlabblock2Block());
/*  52 */   public static final RegistryObject<Block> YELLOWLABSLABS = REGISTRY.register("yellowlabslabs", () -> new YellowlabslabsBlock());
/*  53 */   public static final RegistryObject<Block> REINFORCEDYELLOWCONCRETE = REGISTRY.register("reinforcedyellowconcrete", () -> new ReinforcedyellowconcreteBlock());
/*     */   
/*  55 */   public static final RegistryObject<Block> REDLABBLOCK_1 = REGISTRY.register("redlabblock_1", () -> new Redlabblock1Block());
/*  56 */   public static final RegistryObject<Block> RED_LAB_BLOCK_2 = REGISTRY.register("red_lab_block_2", () -> new RedLabBlock2Block());
/*  57 */   public static final RegistryObject<Block> RED_LAB_SLABS = REGISTRY.register("red_lab_slabs", () -> new RedLabSlabsBlock());
/*  58 */   public static final RegistryObject<Block> REINFORCEDREDCONCRETE = REGISTRY.register("reinforcedredconcrete", () -> new ReinforcedredconcreteBlock());
/*     */   
/*  60 */   public static final RegistryObject<Block> REDLAB_1 = REGISTRY.register("redlab_1", () -> new Redlab1Block());
/*  61 */   public static final RegistryObject<Block> REDLAB_2 = REGISTRY.register("redlab_2", () -> new Redlab2Block());
/*  62 */   public static final RegistryObject<Block> REDLAB_3 = REGISTRY.register("redlab_3", () -> new Redlab3Block());
/*  63 */   public static final RegistryObject<Block> REDLAB_4 = REGISTRY.register("redlab_4", () -> new Redlab4Block());
/*  64 */   public static final RegistryObject<Block> REDLAB_5 = REGISTRY.register("redlab_5", () -> new Redlab5Block());
/*  65 */   public static final RegistryObject<Block> RED_LAB_SLAB = REGISTRY.register("red_lab_slab", () -> new RedLabSlabBlock());
/*  66 */   public static final RegistryObject<Block> RED_LAB_STAIRS = REGISTRY.register("red_lab_stairs", () -> new RedLabStairsBlock());
/*  67 */   public static final RegistryObject<Block> BUNKERBLOCK = REGISTRY.register("bunkerblock", () -> new BunkerblockBlock());
/*  68 */   public static final RegistryObject<Block> BUNKER_BLOCK_STRIPED = REGISTRY.register("bunker_block_striped", () -> new BunkerBlockStripedBlock());
/*  69 */   public static final RegistryObject<Block> BUNKER_BLOCK_SMOOTH = REGISTRY.register("bunker_block_smooth", () -> new BunkerBlockSmoothBlock());
/*  70 */   public static final RegistryObject<Block> BUNKER_STAIRS = REGISTRY.register("bunker_stairs", () -> new BunkerStairsBlock());
/*  71 */   public static final RegistryObject<Block> BUNKER_SLABS = REGISTRY.register("bunker_slabs", () -> new BunkerSlabsBlock());
/*  72 */   public static final RegistryObject<Block> BUNKER_WALL = REGISTRY.register("bunker_wall", () -> new BunkerWallBlock());
/*  73 */   public static final RegistryObject<Block> LIBRARYWALL_1 = REGISTRY.register("librarywall_1", () -> new Librarywall1Block());
/*  74 */   public static final RegistryObject<Block> LIBRARYWALL_2 = REGISTRY.register("librarywall_2", () -> new Librarywall2Block());
/*  75 */   public static final RegistryObject<Block> LIBRARYWALL_3 = REGISTRY.register("librarywall_3", () -> new Librarywall3Block());
/*  76 */   public static final RegistryObject<Block> LIBRARYWALL_4 = REGISTRY.register("librarywall_4", () -> new Librarywall4Block());
/*  77 */   public static final RegistryObject<Block> LIBRARYWALL_5 = REGISTRY.register("librarywall_5", () -> new Librarywall5Block());
/*  78 */   public static final RegistryObject<Block> SUPPLY_CRATE = REGISTRY.register("supply_crate", () -> new SupplyCrateBlock());
/*  79 */   public static final RegistryObject<Block> SMALL_BOX = REGISTRY.register("small_box", () -> new SmallBoxBlock());
/*  80 */   public static final RegistryObject<Block> BOX = REGISTRY.register("box", () -> new BoxBlock());
/*  81 */   public static final RegistryObject<Block> BOX_INVENTORY = REGISTRY.register("box_inventory", () -> new BoxInventoryBlock());
/*  82 */   public static final RegistryObject<Block> BOX_TRAP = REGISTRY.register("box_trap", () -> new BoxTrapBlock());
/*  83 */   public static final RegistryObject<Block> SCIENTIFIC_CRATE = REGISTRY.register("scientific_crate", () -> new ScientificCrateBlock());
/*  84 */   public static final RegistryObject<Block> CRATE = REGISTRY.register("crate", () -> new CrateBlock());
/*  85 */   public static final RegistryObject<Block> METAL_BOX = REGISTRY.register("metal_box", () -> new MetalBoxBlock());
/*  86 */   public static final RegistryObject<Block> CHES_TRAP = REGISTRY.register("ches_trap", () -> new ChesTrapBlock());
/*  87 */   public static final RegistryObject<Block> CONTROLPANELOFF = REGISTRY.register("controlpaneloff", () -> new ControlpaneloffBlock());
/*  88 */   public static final RegistryObject<Block> SERVERS = REGISTRY.register("servers", () -> new ServersBlock());
/*  89 */   public static final RegistryObject<Block> OLD_TV = REGISTRY.register("old_tv", () -> new OldTVBlock());
/*  90 */   public static final RegistryObject<Block> BROKEN_TV = REGISTRY.register("broken_tv", () -> new BrokenTVBlock());
/*  91 */   public static final RegistryObject<Block> COMPUTER = REGISTRY.register("computer", () -> new ComputerBlock());
/*  92 */   public static final RegistryObject<Block> LAPTOP_CLOSED = REGISTRY.register("laptop_closed", () -> new LaptopClosedBlock());
/*  93 */   public static final RegistryObject<Block> DESK = REGISTRY.register("desk", () -> new DeskBlock());
/*  94 */   public static final RegistryObject<Block> OFFICECHAIR = REGISTRY.register("officechair", () -> new OfficechairBlock());
/*  95 */   public static final RegistryObject<Block> PLANTER = REGISTRY.register("planter", () -> new PlanterBlock());
/*  96 */   public static final RegistryObject<Block> FLASKCONTAINER = REGISTRY.register("flaskcontainer", () -> new FlaskcontainerBlock());
/*  97 */   public static final RegistryObject<Block> TELEPHONE = REGISTRY.register("telephone", () -> new TelephoneBlock());
/*  98 */   public static final RegistryObject<Block> VENT = REGISTRY.register("vent", () -> new VentBlock());
/*  99 */   public static final RegistryObject<Block> BUNKERHATCH = REGISTRY.register("bunkerhatch", () -> new BunkerhatchBlock());
/* 100 */   public static final RegistryObject<Block> BUNKER_DOOR = REGISTRY.register("bunker_door", () -> new BunkerDoorBlock());
/* 101 */   public static final RegistryObject<Block> LAB_DOOR = REGISTRY.register("lab_door", () -> new LabDoorBlock());
/* 102 */   public static final RegistryObject<Block> BLASTDOOR = REGISTRY.register("blastdoor", () -> new BlastdoorBlock());
/* 103 */   public static final RegistryObject<Block> CEILINGLIGHT = REGISTRY.register("ceilinglight", () -> new CeilinglightBlock());
/* 104 */   public static final RegistryObject<Block> CAGELIGHT = REGISTRY.register("cagelight", () -> new CagelightBlock());
/* 105 */   public static final RegistryObject<Block> SAVE_STATION = REGISTRY.register("save_station", () -> new SaveStationBlock());
/* 106 */   public static final RegistryObject<Block> OFFICETABLE = REGISTRY.register("officetable", () -> new OfficetableBlock());
/* 107 */   public static final RegistryObject<Block> LOCKER = REGISTRY.register("locker", () -> new LockerBlock());
/* 108 */   public static final RegistryObject<Block> LAB_EQUIPMENT = REGISTRY.register("lab_equipment", () -> new LabEquipmentBlock());
/* 109 */   public static final RegistryObject<Block> WALLSCREEN = REGISTRY.register("wallscreen", () -> new WallscreenBlock());
/* 110 */   public static final RegistryObject<Block> MICROSCOPE = REGISTRY.register("microscope", () -> new MicroscopeBlock());
/* 111 */   public static final RegistryObject<Block> CRYOPOD = REGISTRY.register("cryopod", () -> new CryopodBlock());
/* 112 */   public static final RegistryObject<Block> BOOKPILE_1 = REGISTRY.register("bookpile_1", () -> new Bookpile1Block());
/* 113 */   public static final RegistryObject<Block> BOOKPILE_2 = REGISTRY.register("bookpile_2", () -> new Bookpile2Block());
/* 114 */   public static final RegistryObject<Block> BOOKPILE_3 = REGISTRY.register("bookpile_3", () -> new Bookpile3Block());
/* 115 */   public static final RegistryObject<Block> BOOKPILE_4 = REGISTRY.register("bookpile_4", () -> new Bookpile4Block());
/* 116 */   public static final RegistryObject<Block> BOOKPILE_5 = REGISTRY.register("bookpile_5", () -> new Bookpile5Block());
/* 117 */   public static final RegistryObject<Block> GLASS_DOOR = REGISTRY.register("glass_door", () -> new GlassDoorBlock());
/* 118 */   public static final RegistryObject<Block> INVERTED_GLASS_DOOR = REGISTRY.register("inverted_glass_door", () -> new InvertedGlassDoorBlock());
/* 119 */   public static final RegistryObject<Block> BIGCOUCH = REGISTRY.register("bigcouch", () -> new BigcouchBlock());
/* 120 */   public static final RegistryObject<Block> HIGH_PRESSURE_CYLINDER = REGISTRY.register("high_pressure_cylinder", () -> new HighPressureCylinderBlock());
/*     */   
/* 122 */   public static final RegistryObject<Block> HIGH_PRESSURE_CYLINDER_RED = REGISTRY.register("high_pressure_cylinder_red", () -> new HighPressureCylinderRedBlock());
/*     */   
/* 124 */   public static final RegistryObject<Block> HIGH_PRESSURE_CYLINDER_GREEN = REGISTRY.register("high_pressure_cylinder_green", () -> new HighPressureCylinderGreenBlock());
/*     */   
/* 126 */   public static final RegistryObject<Block> CEILINGLIGHTENHANCED = REGISTRY.register("ceilinglightenhanced", () -> new CeilinglightenhancedBlock());
/* 127 */   public static final RegistryObject<Block> MAKESHIFT_BEACON = REGISTRY.register("makeshift_beacon", () -> new MakeshiftBeaconBlock());
/* 128 */   public static final RegistryObject<Block> EVIL_BEACON = REGISTRY.register("evil_beacon", () -> new EvilBeaconBlock());
/* 129 */   public static final RegistryObject<Block> TACTICALBOMB = REGISTRY.register("tacticalbomb", () -> new TacticalbombBlock());
/* 130 */   public static final RegistryObject<Block> NUKE = REGISTRY.register("nuke", () -> new NukeBlock());
/* 131 */   public static final RegistryObject<Block> COMPUTER_ON = REGISTRY.register("computer_on", () -> new ComputerOnBlock());
/* 132 */   public static final RegistryObject<Block> LAPTOP = REGISTRY.register("laptop", () -> new LaptopBlock());
/* 133 */   public static final RegistryObject<Block> LAPTOP_ON = REGISTRY.register("laptop_on", () -> new LaptopONBlock());
/* 134 */   public static final RegistryObject<Block> TELEPHONENOPHONE = REGISTRY.register("telephonenophone", () -> new TelephonenophoneBlock());
/* 135 */   public static final RegistryObject<Block> VENT_OPEN = REGISTRY.register("vent_open", () -> new VentOpenBlock());
/* 136 */   public static final RegistryObject<Block> BUNKER_HATCH_OPEN = REGISTRY.register("bunker_hatch_open", () -> new BunkerHatchOpenBlock());
/* 137 */   public static final RegistryObject<Block> BUNKERDOOROPEN = REGISTRY.register("bunkerdooropen", () -> new BunkerdooropenBlock());
/* 138 */   public static final RegistryObject<Block> LAB_DOOR_OPEN = REGISTRY.register("lab_door_open", () -> new LabDoorOpenBlock());
/* 139 */   public static final RegistryObject<Block> WALLSCREENON = REGISTRY.register("wallscreenon", () -> new WallscreenonBlock());
/* 140 */   public static final RegistryObject<Block> OPEN_GLASS_DOOR = REGISTRY.register("open_glass_door", () -> new OpenGlassDoorBlock());
/* 141 */   public static final RegistryObject<Block> INVERTED_OPEN_GLASS_DOOR = REGISTRY.register("inverted_open_glass_door", () -> new InvertedOpenGlassDoorBlock());
/*     */   
/* 143 */   public static final RegistryObject<Block> THECONE = REGISTRY.register("thecone", () -> new THECONEBlock());
/* 144 */   public static final RegistryObject<Block> OLD_TVON = REGISTRY.register("old_tvon", () -> new OldTVONBlock());
/* 145 */   public static final RegistryObject<Block> EVILBEACONON = REGISTRY.register("evilbeaconon", () -> new EvilbeacononBlock());
/* 146 */   public static final RegistryObject<Block> MAKESHIFT_BEACON_ON = REGISTRY.register("makeshift_beacon_on", () -> new MakeshiftBeaconOnBlock());
/* 147 */   public static final RegistryObject<Block> DOOM_DOLL = REGISTRY.register("doom_doll", () -> new DoomDollBlock());
/* 148 */   public static final RegistryObject<Block> CONTROLPANELON = REGISTRY.register("controlpanelon", () -> new ControlpanelonBlock());
/* 149 */   public static final RegistryObject<Block> BLAST_DOOR_OPEN = REGISTRY.register("blast_door_open", () -> new BlastDoorOpenBlock());
/*     */   
/*     */   @EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
/*     */   public static class ClientSideHandler {
/*     */     @SubscribeEvent
/*     */     public static void clientSetup(FMLClientSetupEvent event) {
/* 155 */       EmptycapsuleBlock.registerRenderLayer();
/* 156 */       LatexcapsuleBlock.registerRenderLayer();
/* 157 */       DarklatexpuddleharmlessBlock.registerRenderLayer();
/* 158 */       SupplyCrateBlock.registerRenderLayer();
/* 159 */       SmallBoxBlock.registerRenderLayer();
/* 160 */       ScientificCrateBlock.registerRenderLayer();
/* 161 */       CrateBlock.registerRenderLayer();
/* 162 */       ChesTrapBlock.registerRenderLayer();
/* 163 */       ControlpaneloffBlock.registerRenderLayer();
/* 164 */       ServersBlock.registerRenderLayer();
/* 165 */       OldTVBlock.registerRenderLayer();
/* 166 */       BrokenTVBlock.registerRenderLayer();
/* 167 */       ComputerBlock.registerRenderLayer();
/* 168 */       LaptopClosedBlock.registerRenderLayer();
/* 169 */       DeskBlock.registerRenderLayer();
/* 170 */       OfficechairBlock.registerRenderLayer();
/* 171 */       PlanterBlock.registerRenderLayer();
/* 172 */       FlaskcontainerBlock.registerRenderLayer();
/* 173 */       TelephoneBlock.registerRenderLayer();
/* 174 */       VentBlock.registerRenderLayer();
/* 175 */       BunkerhatchBlock.registerRenderLayer();
/* 176 */       BunkerDoorBlock.registerRenderLayer();
/* 177 */       LabDoorBlock.registerRenderLayer();
/* 178 */       BlastdoorBlock.registerRenderLayer();
/* 179 */       CeilinglightBlock.registerRenderLayer();
/* 180 */       CagelightBlock.registerRenderLayer();
/* 181 */       SaveStationBlock.registerRenderLayer();
/* 182 */       OfficetableBlock.registerRenderLayer();
/* 183 */       LockerBlock.registerRenderLayer();
/* 184 */       LabEquipmentBlock.registerRenderLayer();
/* 185 */       WallscreenBlock.registerRenderLayer();
/* 186 */       MicroscopeBlock.registerRenderLayer();
/* 187 */       CryopodBlock.registerRenderLayer();
/* 188 */       Bookpile1Block.registerRenderLayer();
/* 189 */       Bookpile2Block.registerRenderLayer();
/* 190 */       Bookpile3Block.registerRenderLayer();
/* 191 */       Bookpile4Block.registerRenderLayer();
/* 192 */       Bookpile5Block.registerRenderLayer();
/* 193 */       GlassDoorBlock.registerRenderLayer();
/* 194 */       InvertedGlassDoorBlock.registerRenderLayer();
/* 195 */       BigcouchBlock.registerRenderLayer();
/* 196 */       HighPressureCylinderBlock.registerRenderLayer();
/* 197 */       HighPressureCylinderRedBlock.registerRenderLayer();
/* 198 */       HighPressureCylinderGreenBlock.registerRenderLayer();
/* 199 */       CeilinglightenhancedBlock.registerRenderLayer();
/* 200 */       ComputerOnBlock.registerRenderLayer();
/* 201 */       LaptopBlock.registerRenderLayer();
/* 202 */       LaptopONBlock.registerRenderLayer();
/* 203 */       TelephonenophoneBlock.registerRenderLayer();
/* 204 */       VentOpenBlock.registerRenderLayer();
/* 205 */       BunkerHatchOpenBlock.registerRenderLayer();
/* 206 */       BunkerdooropenBlock.registerRenderLayer();
/* 207 */       LabDoorOpenBlock.registerRenderLayer();
/* 208 */       WallscreenonBlock.registerRenderLayer();
/* 209 */       OpenGlassDoorBlock.registerRenderLayer();
/* 210 */       InvertedOpenGlassDoorBlock.registerRenderLayer();
/* 211 */       THECONEBlock.registerRenderLayer();
/* 212 */       OldTVONBlock.registerRenderLayer();
/* 213 */       DoomDollBlock.registerRenderLayer();
/* 214 */       ControlpanelonBlock.registerRenderLayer();
/* 215 */       BlastDoorOpenBlock.registerRenderLayer();
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\init\LatexModBlocks.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */