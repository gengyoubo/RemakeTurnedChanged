/*     */ package net.mcreator.latexes.init;
/*     */ 
/*     */ import net.minecraft.client.renderer.entity.EntityRendererProvider;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraftforge.api.distmarker.Dist;
/*     */ import net.minecraftforge.client.event.EntityRenderersEvent;
/*     */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*     */ import net.minecraftforge.fml.common.Mod;
/*     */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
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
/*     */ public class LatexModEntityRenderers
/*     */ {
/*     */   @SubscribeEvent
/*     */   public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
/*  90 */     event.registerEntityRenderer((EntityType)LatexModEntities.SLIMELING.get(), net.mcreator.latexes.client.renderer.SlimelingRenderer::new);
/*  91 */     event.registerEntityRenderer((EntityType)LatexModEntities.DARKLATEXSLUG.get(), net.mcreator.latexes.client.renderer.DarklatexslugRenderer::new);
/*  92 */     event.registerEntityRenderer((EntityType)LatexModEntities.DARKLATEX.get(), net.mcreator.latexes.client.renderer.DarklatexRenderer::new);
/*  93 */     event.registerEntityRenderer((EntityType)LatexModEntities.DARK_LATEX_CENTAUR.get(), net.mcreator.latexes.client.renderer.DarkLatexCentaurRenderer::new);
/*  94 */     event.registerEntityRenderer((EntityType)LatexModEntities.DARK_LATEX_SKELETON.get(), net.mcreator.latexes.client.renderer.DarkLatexSkeletonRenderer::new);
/*  95 */     event.registerEntityRenderer((EntityType)LatexModEntities.YUFENG.get(), net.mcreator.latexes.client.renderer.YufengRenderer::new);
/*  96 */     event.registerEntityRenderer((EntityType)LatexModEntities.NOISE_STALKER.get(), net.mcreator.latexes.client.renderer.NoiseStalkerRenderer::new);
/*  97 */     event.registerEntityRenderer((EntityType)LatexModEntities.DLSHARK.get(), net.mcreator.latexes.client.renderer.DlsharkRenderer::new);
/*  98 */     event.registerEntityRenderer((EntityType)LatexModEntities.DARK_LATEX_MOTH.get(), net.mcreator.latexes.client.renderer.DarkLatexMothRenderer::new);
/*  99 */     event.registerEntityRenderer((EntityType)LatexModEntities.DARK_LATEX_SNEP.get(), net.mcreator.latexes.client.renderer.DarkLatexSnepRenderer::new);
/* 100 */     event.registerEntityRenderer((EntityType)LatexModEntities.DARK_LATEX_FOX.get(), net.mcreator.latexes.client.renderer.DarkLatexFoxRenderer::new);
/* 101 */     event.registerEntityRenderer((EntityType)LatexModEntities.DARK_LATEX_FOX_SNIPER.get(), net.mcreator.latexes.client.renderer.DarkLatexFoxSniperRenderer::new);
/* 102 */     event.registerEntityRenderer((EntityType)LatexModEntities.DARK_LATEX_SNAKE.get(), net.mcreator.latexes.client.renderer.DarkLatexSnakeRenderer::new);
/* 103 */     event.registerEntityRenderer((EntityType)LatexModEntities.DARK_LATEX_DRAGON.get(), net.mcreator.latexes.client.renderer.DarkLatexDragonRenderer::new);
/* 104 */     event.registerEntityRenderer((EntityType)LatexModEntities.DARK_LATEX_SPIDER.get(), net.mcreator.latexes.client.renderer.DarkLatexSpiderRenderer::new);
/* 105 */     event.registerEntityRenderer((EntityType)LatexModEntities.DL_SQUID_DOG.get(), net.mcreator.latexes.client.renderer.DlSquidDogRenderer::new);
/* 106 */     event.registerEntityRenderer((EntityType)LatexModEntities.D_LBEE.get(), net.mcreator.latexes.client.renderer.DLbeeRenderer::new);
/* 107 */     event.registerEntityRenderer((EntityType)LatexModEntities.DARK_LATEX_QUEEN_BEE.get(), net.mcreator.latexes.client.renderer.DarkLatexQueenBeeRenderer::new);
/* 108 */     event.registerEntityRenderer((EntityType)LatexModEntities.DARK_LATEX_SPIDER_QUEEN.get(), net.mcreator.latexes.client.renderer.DarkLatexSpiderQueenRenderer::new);
/* 109 */     event.registerEntityRenderer((EntityType)LatexModEntities.DARKLATEXCONE.get(), net.mcreator.latexes.client.renderer.DarklatexconeRenderer::new);
/* 110 */     event.registerEntityRenderer((EntityType)LatexModEntities.HERTX.get(), net.mcreator.latexes.client.renderer.HertxRenderer::new);
/* 111 */     event.registerEntityRenderer((EntityType)LatexModEntities.DRONE_HERTX.get(), net.mcreator.latexes.client.renderer.DroneHertxRenderer::new);
/* 112 */     event.registerEntityRenderer((EntityType)LatexModEntities.ARMED_DRONE_HERTX.get(), net.mcreator.latexes.client.renderer.ArmedDroneHertxRenderer::new);
/* 113 */     event.registerEntityRenderer((EntityType)LatexModEntities.SCIENTIST.get(), net.mcreator.latexes.client.renderer.ScientistRenderer::new);
/* 114 */     event.registerEntityRenderer((EntityType)LatexModEntities.MILITARY.get(), net.mcreator.latexes.client.renderer.MilitaryRenderer::new);
/* 115 */     event.registerEntityRenderer((EntityType)LatexModEntities.MILITARYFLAMEUNIT.get(), net.mcreator.latexes.client.renderer.MilitaryflameunitRenderer::new);
/* 116 */     event.registerEntityRenderer((EntityType)LatexModEntities.EVIL_SCIENTIST.get(), net.mcreator.latexes.client.renderer.EvilScientistRenderer::new);
/* 117 */     event.registerEntityRenderer((EntityType)LatexModEntities.EVIL_SNIPER.get(), net.mcreator.latexes.client.renderer.EvilSniperRenderer::new);
/* 118 */     event.registerEntityRenderer((EntityType)LatexModEntities.EVIL_MILITARY.get(), net.mcreator.latexes.client.renderer.EvilMilitaryRenderer::new);
/* 119 */     event.registerEntityRenderer((EntityType)LatexModEntities.TSC_OUTSIDER.get(), net.mcreator.latexes.client.renderer.TSCOutsiderRenderer::new);
/* 120 */     event.registerEntityRenderer((EntityType)LatexModEntities.TSC_OUTSIDER_GUNNER.get(), net.mcreator.latexes.client.renderer.TSCOutsiderGunnerRenderer::new);
/* 121 */     event.registerEntityRenderer((EntityType)LatexModEntities.TS_CDRONE.get(), net.mcreator.latexes.client.renderer.TSCdroneRenderer::new);
/* 122 */     event.registerEntityRenderer((EntityType)LatexModEntities.TSC_HUNTER.get(), net.mcreator.latexes.client.renderer.TSCHunterRenderer::new);
/* 123 */     event.registerEntityRenderer((EntityType)LatexModEntities.MILITARY_RIOT.get(), net.mcreator.latexes.client.renderer.MilitaryRiotRenderer::new);
/* 124 */     event.registerEntityRenderer((EntityType)LatexModEntities.TSC_BERSERK.get(), net.mcreator.latexes.client.renderer.TSCBerserkRenderer::new);
/* 125 */     event.registerEntityRenderer((EntityType)LatexModEntities.DARK_LATEX_CREEPER.get(), net.mcreator.latexes.client.renderer.DarkLatexCreeperRenderer::new);
/* 126 */     event.registerEntityRenderer((EntityType)LatexModEntities.DARK_LATEX_CREEPER_ENHANCED.get(), net.mcreator.latexes.client.renderer.DarkLatexCreeperEnhancedRenderer::new);
/* 127 */     event.registerEntityRenderer((EntityType)LatexModEntities.CIVILIAN.get(), net.mcreator.latexes.client.renderer.CivilianRenderer::new);
/* 128 */     event.registerEntityRenderer((EntityType)LatexModEntities.PRISIONER.get(), net.mcreator.latexes.client.renderer.PrisionerRenderer::new);
/* 129 */     event.registerEntityRenderer((EntityType)LatexModEntities.PRISIONERMILITIA.get(), net.mcreator.latexes.client.renderer.PrisionermilitiaRenderer::new);
/* 130 */     event.registerEntityRenderer((EntityType)LatexModEntities.CIVLIAN_MILITIA.get(), net.mcreator.latexes.client.renderer.CivlianMilitiaRenderer::new);
/* 131 */     event.registerEntityRenderer((EntityType)LatexModEntities.CRYSTALBOW.get(), net.minecraft.client.renderer.entity.ThrownItemRenderer::new);
/* 132 */     event.registerEntityRenderer((EntityType)LatexModEntities.LATEXCANNON.get(), net.minecraft.client.renderer.entity.ThrownItemRenderer::new);
/* 133 */     event.registerEntityRenderer((EntityType)LatexModEntities.REVOLVING_GOO_CANNON.get(), net.minecraft.client.renderer.entity.ThrownItemRenderer::new);
/* 134 */     event.registerEntityRenderer((EntityType)LatexModEntities.DARTRIFLE.get(), net.minecraft.client.renderer.entity.ThrownItemRenderer::new);
/* 135 */     event.registerEntityRenderer((EntityType)LatexModEntities.MATCHLOCK_PISTOL.get(), net.minecraft.client.renderer.entity.ThrownItemRenderer::new);
/* 136 */     event.registerEntityRenderer((EntityType)LatexModEntities.MATCH_LOCK_MUSKET.get(), net.minecraft.client.renderer.entity.ThrownItemRenderer::new);
/* 137 */     event.registerEntityRenderer((EntityType)LatexModEntities.AR_70_ASSAULT_RIFLE.get(), net.minecraft.client.renderer.entity.ThrownItemRenderer::new);
/* 138 */     event.registerEntityRenderer((EntityType)LatexModEntities.M_4_ASSAULT_RIFLE.get(), net.minecraft.client.renderer.entity.ThrownItemRenderer::new);
/* 139 */     event.registerEntityRenderer((EntityType)LatexModEntities.SCRAP_M_16_RIFLE.get(), net.minecraft.client.renderer.entity.ThrownItemRenderer::new);
/* 140 */     event.registerEntityRenderer((EntityType)LatexModEntities.TSC_PISTOL.get(), net.minecraft.client.renderer.entity.ThrownItemRenderer::new);
/* 141 */     event.registerEntityRenderer((EntityType)LatexModEntities.OVERUNDERSHOTGUN.get(), net.minecraft.client.renderer.entity.ThrownItemRenderer::new);
/* 142 */     event.registerEntityRenderer((EntityType)LatexModEntities.FLAMETHOWER.get(), net.minecraft.client.renderer.entity.ThrownItemRenderer::new);
/* 143 */     event.registerEntityRenderer((EntityType)LatexModEntities.LATEX_DART_RIFLE.get(), net.minecraft.client.renderer.entity.ThrownItemRenderer::new);
/* 144 */     event.registerEntityRenderer((EntityType)LatexModEntities.DARK_LATEX_FOX_SCIENTIST.get(), net.mcreator.latexes.client.renderer.DarkLatexFoxScientistRenderer::new);
/* 145 */     event.registerEntityRenderer((EntityType)LatexModEntities.BEE_HERTX.get(), net.mcreator.latexes.client.renderer.BeeHertxRenderer::new);
/* 146 */     event.registerEntityRenderer((EntityType)LatexModEntities.AHV_HERTX.get(), net.mcreator.latexes.client.renderer.AHVHertxRenderer::new);
/* 147 */     event.registerEntityRenderer((EntityType)LatexModEntities.TANK_CANNON.get(), net.minecraft.client.renderer.entity.ThrownItemRenderer::new);
/* 148 */     event.registerEntityRenderer((EntityType)LatexModEntities.LA_4TANKMORPHR.get(), net.mcreator.latexes.client.renderer.La4tankmorphrRenderer::new);
/* 149 */     event.registerEntityRenderer((EntityType)LatexModEntities.LA_4TANKMORPHM.get(), net.mcreator.latexes.client.renderer.La4tankmorphmRenderer::new);
/* 150 */     event.registerEntityRenderer((EntityType)LatexModEntities.NXT_HERTX.get(), net.mcreator.latexes.client.renderer.NXTHertxRenderer::new);
/* 151 */     event.registerEntityRenderer((EntityType)LatexModEntities.DROPPOD.get(), net.mcreator.latexes.client.renderer.DROPPODRenderer::new);
/* 152 */     event.registerEntityRenderer((EntityType)LatexModEntities.SNEPPLE.get(), net.minecraft.client.renderer.entity.ThrownItemRenderer::new);
/* 153 */     event.registerEntityRenderer((EntityType)LatexModEntities.ALLYDROPPOD.get(), net.mcreator.latexes.client.renderer.AllydroppodRenderer::new);
/* 154 */     event.registerEntityRenderer((EntityType)LatexModEntities.LATEX_DROP_POD.get(), net.mcreator.latexes.client.renderer.LatexDropPodRenderer::new);
/* 155 */     event.registerEntityRenderer((EntityType)LatexModEntities.HERTXVAR_F.get(), net.mcreator.latexes.client.renderer.HertxvarFRenderer::new);
/* 156 */     event.registerEntityRenderer((EntityType)LatexModEntities.HERTXVAR_SOL.get(), net.mcreator.latexes.client.renderer.HertxvarSolRenderer::new);
/* 157 */     event.registerEntityRenderer((EntityType)LatexModEntities.HERTXVAR_FB.get(), net.mcreator.latexes.client.renderer.HertxvarFBRenderer::new);
/* 158 */     event.registerEntityRenderer((EntityType)LatexModEntities.HERTX_SIT.get(), net.mcreator.latexes.client.renderer.HertxSitRenderer::new);
/* 159 */     event.registerEntityRenderer((EntityType)LatexModEntities.ASHBURY_HERTX.get(), net.mcreator.latexes.client.renderer.AshburyHertxRenderer::new);
/* 160 */     event.registerEntityRenderer((EntityType)LatexModEntities.ASHBURY_SIT.get(), net.mcreator.latexes.client.renderer.AshburySitRenderer::new);
/* 161 */     event.registerEntityRenderer((EntityType)LatexModEntities.BEE_HERTX_SIT.get(), net.mcreator.latexes.client.renderer.BeeHertxSitRenderer::new);
/* 162 */     event.registerEntityRenderer((EntityType)LatexModEntities.AHV_HERTX_SIT.get(), net.mcreator.latexes.client.renderer.AHVHertxSitRenderer::new);
/* 163 */     event.registerEntityRenderer((EntityType)LatexModEntities.NXT_SIT.get(), net.mcreator.latexes.client.renderer.NXTSitRenderer::new);
/* 164 */     event.registerEntityRenderer((EntityType)LatexModEntities.HERTX_F_SIT.get(), net.mcreator.latexes.client.renderer.HertxFSitRenderer::new);
/* 165 */     event.registerEntityRenderer((EntityType)LatexModEntities.HERTX_FB_SIT.get(), net.mcreator.latexes.client.renderer.HertxFBSitRenderer::new);
/* 166 */     event.registerEntityRenderer((EntityType)LatexModEntities.HERTX_SOL_WAIT.get(), net.mcreator.latexes.client.renderer.HertxSolWaitRenderer::new);
/* 167 */     event.registerEntityRenderer((EntityType)LatexModEntities.SLIMELING_TAMED.get(), net.mcreator.latexes.client.renderer.SlimelingTamedRenderer::new);
/* 168 */     event.registerEntityRenderer((EntityType)LatexModEntities.SLIMELINGTAMEDSIT.get(), net.mcreator.latexes.client.renderer.SlimelingtamedsitRenderer::new);
/* 169 */     event.registerEntityRenderer((EntityType)LatexModEntities.PROTECTOR_SLIMELING.get(), net.mcreator.latexes.client.renderer.ProtectorSlimelingRenderer::new);
/* 170 */     event.registerEntityRenderer((EntityType)LatexModEntities.PROTECTOR_SLIMELINGSIT.get(), net.mcreator.latexes.client.renderer.ProtectorSlimelingsitRenderer::new);
/* 171 */     event.registerEntityRenderer((EntityType)LatexModEntities.DARK_LATEX_CAKE.get(), net.mcreator.latexes.client.renderer.DarkLatexCakeRenderer::new);
/* 172 */     event.registerEntityRenderer((EntityType)LatexModEntities.DRONE_HERTX_WAIT.get(), net.mcreator.latexes.client.renderer.DroneHertxWaitRenderer::new);
/* 173 */     event.registerEntityRenderer((EntityType)LatexModEntities.ARMED_DRONE_HERTX_WAIT.get(), net.mcreator.latexes.client.renderer.ArmedDroneHertxWaitRenderer::new);
/* 174 */     event.registerEntityRenderer((EntityType)LatexModEntities.EXPLOSIVEGOO.get(), net.minecraft.client.renderer.entity.ThrownItemRenderer::new);
/* 175 */     event.registerEntityRenderer((EntityType)LatexModEntities.CIVILIAN_MILITIA_MELEE.get(), net.mcreator.latexes.client.renderer.CivilianMilitiaMeleeRenderer::new);
/* 176 */     event.registerEntityRenderer((EntityType)LatexModEntities.PRISIONER_MILITIA_MELEE.get(), net.mcreator.latexes.client.renderer.PrisionerMilitiaMeleeRenderer::new);
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\init\LatexModEntityRenderers.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */