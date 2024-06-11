/*     */ package net.ltxprogrammer.turned.init;
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
/*     */ @EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
/*     */ public class LatexModEntityRenderers
/*     */ {
/*     */   @SubscribeEvent
/*     */   public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
/*  20 */     event.registerEntityRenderer((EntityType)LatexModEntities.SLIMELING.get(), net.ltxprogrammer.turned.client.renderer.SlimelingRenderer::new);
/*  21 */     event.registerEntityRenderer((EntityType)LatexModEntities.DARKLATEXSLUG.get(), net.ltxprogrammer.turned.client.renderer.DarklatexslugRenderer::new);
/*  22 */     event.registerEntityRenderer((EntityType)LatexModEntities.DARKLATEX.get(), net.ltxprogrammer.turned.client.renderer.DarklatexRenderer::new);
/*  23 */     event.registerEntityRenderer((EntityType)LatexModEntities.DARK_LATEX_CENTAUR.get(), net.ltxprogrammer.turned.client.renderer.DarkLatexCentaurRenderer::new);
/*  24 */     event.registerEntityRenderer((EntityType)LatexModEntities.DARK_LATEX_SKELETON.get(), net.ltxprogrammer.turned.client.renderer.DarkLatexSkeletonRenderer::new);
/*  25 */     event.registerEntityRenderer((EntityType)LatexModEntities.NOISE_STALKER.get(), net.ltxprogrammer.turned.client.renderer.NoiseStalkerRenderer::new);
/*  26 */     event.registerEntityRenderer((EntityType)LatexModEntities.DLSHARK.get(), net.ltxprogrammer.turned.client.renderer.DlsharkRenderer::new);
/*  27 */     event.registerEntityRenderer((EntityType)LatexModEntities.DARK_LATEX_MOTH.get(), net.ltxprogrammer.turned.client.renderer.DarkLatexMothRenderer::new);
/*  28 */     event.registerEntityRenderer((EntityType)LatexModEntities.DARK_LATEX_SNEP.get(), net.ltxprogrammer.turned.client.renderer.DarkLatexSnepRenderer::new);
/*  29 */     event.registerEntityRenderer((EntityType)LatexModEntities.DARK_LATEX_FOX.get(), net.ltxprogrammer.turned.client.renderer.DarkLatexFoxRenderer::new);
/*  30 */     event.registerEntityRenderer((EntityType)LatexModEntities.DARK_LATEX_FOX_SNIPER.get(), net.ltxprogrammer.turned.client.renderer.DarkLatexFoxSniperRenderer::new);
/*  31 */     event.registerEntityRenderer((EntityType)LatexModEntities.DARK_LATEX_SNAKE.get(), net.ltxprogrammer.turned.client.renderer.DarkLatexSnakeRenderer::new);
/*  32 */     event.registerEntityRenderer((EntityType)LatexModEntities.DARK_LATEX_SPIDER.get(), net.ltxprogrammer.turned.client.renderer.DarkLatexSpiderRenderer::new);
/*  33 */     event.registerEntityRenderer((EntityType)LatexModEntities.DL_SQUID_DOG.get(), net.ltxprogrammer.turned.client.renderer.DlSquidDogRenderer::new);
/*  34 */     event.registerEntityRenderer((EntityType)LatexModEntities.D_LBEE.get(), net.ltxprogrammer.turned.client.renderer.DLbeeRenderer::new);
/*  35 */     event.registerEntityRenderer((EntityType)LatexModEntities.DARK_LATEX_QUEEN_BEE.get(), net.ltxprogrammer.turned.client.renderer.DarkLatexQueenBeeRenderer::new);
/*  36 */     event.registerEntityRenderer((EntityType)LatexModEntities.DARK_LATEX_SPIDER_QUEEN.get(), net.ltxprogrammer.turned.client.renderer.DarkLatexSpiderQueenRenderer::new);
/*  37 */     event.registerEntityRenderer((EntityType)LatexModEntities.DARKLATEXCONE.get(), net.ltxprogrammer.turned.client.renderer.DarklatexconeRenderer::new);
/*  38 */     event.registerEntityRenderer((EntityType)LatexModEntities.HERTX.get(), net.ltxprogrammer.turned.client.renderer.HertxRenderer::new);
/*  39 */     event.registerEntityRenderer((EntityType)LatexModEntities.DRONE_HERTX.get(), net.ltxprogrammer.turned.client.renderer.DroneHertxRenderer::new);
/*  40 */     event.registerEntityRenderer((EntityType)LatexModEntities.ARMED_DRONE_HERTX.get(), net.ltxprogrammer.turned.client.renderer.ArmedDroneHertxRenderer::new);
/*  41 */     event.registerEntityRenderer((EntityType)LatexModEntities.SCIENTIST.get(), net.ltxprogrammer.turned.client.renderer.ScientistRenderer::new);
/*  42 */     event.registerEntityRenderer((EntityType)LatexModEntities.MILITARY.get(), net.ltxprogrammer.turned.client.renderer.MilitaryRenderer::new);
/*  43 */     event.registerEntityRenderer((EntityType)LatexModEntities.MILITARYFLAMEUNIT.get(), net.ltxprogrammer.turned.client.renderer.MilitaryflameunitRenderer::new);
/*  44 */     event.registerEntityRenderer((EntityType)LatexModEntities.EVIL_SCIENTIST.get(), net.ltxprogrammer.turned.client.renderer.EvilScientistRenderer::new);
/*  45 */     event.registerEntityRenderer((EntityType)LatexModEntities.EVIL_SNIPER.get(), net.ltxprogrammer.turned.client.renderer.EvilSniperRenderer::new);
/*  46 */     event.registerEntityRenderer((EntityType)LatexModEntities.EVIL_MILITARY.get(), net.ltxprogrammer.turned.client.renderer.EvilMilitaryRenderer::new);
/*  47 */     event.registerEntityRenderer((EntityType)LatexModEntities.TSC_OUTSIDER.get(), net.ltxprogrammer.turned.client.renderer.TSCOutsiderRenderer::new);
/*  48 */     event.registerEntityRenderer((EntityType)LatexModEntities.TSC_OUTSIDER_GUNNER.get(), net.ltxprogrammer.turned.client.renderer.TSCOutsiderGunnerRenderer::new);
/*  49 */     event.registerEntityRenderer((EntityType)LatexModEntities.TS_CDRONE.get(), net.ltxprogrammer.turned.client.renderer.TSCdroneRenderer::new);
/*  50 */     event.registerEntityRenderer((EntityType)LatexModEntities.TSC_HUNTER.get(), net.ltxprogrammer.turned.client.renderer.TSCHunterRenderer::new);
/*  51 */     event.registerEntityRenderer((EntityType)LatexModEntities.MILITARY_RIOT.get(), net.ltxprogrammer.turned.client.renderer.MilitaryRiotRenderer::new);
/*  52 */     event.registerEntityRenderer((EntityType)LatexModEntities.TSC_BERSERK.get(), net.ltxprogrammer.turned.client.renderer.TSCBerserkRenderer::new);
/*  53 */     event.registerEntityRenderer((EntityType)LatexModEntities.DARK_LATEX_CREEPER.get(), net.ltxprogrammer.turned.client.renderer.DarkLatexCreeperRenderer::new);
/*  54 */     event.registerEntityRenderer((EntityType)LatexModEntities.DARK_LATEX_CREEPER_ENHANCED.get(), net.ltxprogrammer.turned.client.renderer.DarkLatexCreeperEnhancedRenderer::new);
/*  55 */     event.registerEntityRenderer((EntityType)LatexModEntities.CIVILIAN.get(), net.ltxprogrammer.turned.client.renderer.CivilianRenderer::new);
/*  56 */     event.registerEntityRenderer((EntityType)LatexModEntities.PRISIONER.get(), net.ltxprogrammer.turned.client.renderer.PrisionerRenderer::new);
/*  57 */     event.registerEntityRenderer((EntityType)LatexModEntities.PRISIONERMILITIA.get(), net.ltxprogrammer.turned.client.renderer.PrisionermilitiaRenderer::new);
/*  58 */     event.registerEntityRenderer((EntityType)LatexModEntities.CIVLIAN_MILITIA.get(), net.ltxprogrammer.turned.client.renderer.CivlianMilitiaRenderer::new);
/*  59 */     event.registerEntityRenderer((EntityType)LatexModEntities.CRYSTALBOW.get(), net.minecraft.client.renderer.entity.ThrownItemRenderer::new);
/*  60 */     event.registerEntityRenderer((EntityType)LatexModEntities.LATEXCANNON.get(), net.minecraft.client.renderer.entity.ThrownItemRenderer::new);
/*  61 */     event.registerEntityRenderer((EntityType)LatexModEntities.REVOLVING_GOO_CANNON.get(), net.minecraft.client.renderer.entity.ThrownItemRenderer::new);
/*  62 */     event.registerEntityRenderer((EntityType)LatexModEntities.DARTRIFLE.get(), net.minecraft.client.renderer.entity.ThrownItemRenderer::new);
/*  63 */     event.registerEntityRenderer((EntityType)LatexModEntities.MATCHLOCK_PISTOL.get(), net.minecraft.client.renderer.entity.ThrownItemRenderer::new);
/*  64 */     event.registerEntityRenderer((EntityType)LatexModEntities.MATCH_LOCK_MUSKET.get(), net.minecraft.client.renderer.entity.ThrownItemRenderer::new);
/*  65 */     event.registerEntityRenderer((EntityType)LatexModEntities.AR_70_ASSAULT_RIFLE.get(), net.minecraft.client.renderer.entity.ThrownItemRenderer::new);
/*  66 */     event.registerEntityRenderer((EntityType)LatexModEntities.M_4_ASSAULT_RIFLE.get(), net.minecraft.client.renderer.entity.ThrownItemRenderer::new);
/*  67 */     event.registerEntityRenderer((EntityType)LatexModEntities.SCRAP_M_16_RIFLE.get(), net.minecraft.client.renderer.entity.ThrownItemRenderer::new);
/*  68 */     event.registerEntityRenderer((EntityType)LatexModEntities.TSC_PISTOL.get(), net.minecraft.client.renderer.entity.ThrownItemRenderer::new);
/*  69 */     event.registerEntityRenderer((EntityType)LatexModEntities.OVERUNDERSHOTGUN.get(), net.minecraft.client.renderer.entity.ThrownItemRenderer::new);
/*  70 */     event.registerEntityRenderer((EntityType)LatexModEntities.FLAMETHOWER.get(), net.minecraft.client.renderer.entity.ThrownItemRenderer::new);
/*  71 */     event.registerEntityRenderer((EntityType)LatexModEntities.LATEX_DART_RIFLE.get(), net.minecraft.client.renderer.entity.ThrownItemRenderer::new);
/*  72 */     event.registerEntityRenderer((EntityType)LatexModEntities.DARK_LATEX_FOX_SCIENTIST.get(), net.ltxprogrammer.turned.client.renderer.DarkLatexFoxScientistRenderer::new);
/*  73 */     event.registerEntityRenderer((EntityType)LatexModEntities.BEE_HERTX.get(), net.ltxprogrammer.turned.client.renderer.BeeHertxRenderer::new);
/*  74 */     event.registerEntityRenderer((EntityType)LatexModEntities.AHV_HERTX.get(), net.ltxprogrammer.turned.client.renderer.AHVHertxRenderer::new);
/*  75 */     event.registerEntityRenderer((EntityType)LatexModEntities.TANK_CANNON.get(), net.minecraft.client.renderer.entity.ThrownItemRenderer::new);
/*  76 */     event.registerEntityRenderer((EntityType)LatexModEntities.LA_4TANKMORPHR.get(), net.ltxprogrammer.turned.client.renderer.La4tankmorphrRenderer::new);
/*  77 */     event.registerEntityRenderer((EntityType)LatexModEntities.LA_4TANKMORPHM.get(), net.ltxprogrammer.turned.client.renderer.La4tankmorphmRenderer::new);
/*  78 */     event.registerEntityRenderer((EntityType)LatexModEntities.NXT_HERTX.get(), net.ltxprogrammer.turned.client.renderer.NXTHertxRenderer::new);
/*  79 */     event.registerEntityRenderer((EntityType)LatexModEntities.DROPPOD.get(), net.ltxprogrammer.turned.client.renderer.DROPPODRenderer::new);
/*  80 */     event.registerEntityRenderer((EntityType)LatexModEntities.SNEPPLE.get(), net.minecraft.client.renderer.entity.ThrownItemRenderer::new);
/*  81 */     event.registerEntityRenderer((EntityType)LatexModEntities.ALLYDROPPOD.get(), net.ltxprogrammer.turned.client.renderer.AllydroppodRenderer::new);
/*  82 */     event.registerEntityRenderer((EntityType)LatexModEntities.LATEX_DROP_POD.get(), net.ltxprogrammer.turned.client.renderer.LatexDropPodRenderer::new);
/*  83 */     event.registerEntityRenderer((EntityType)LatexModEntities.HERTXVAR_F.get(), net.ltxprogrammer.turned.client.renderer.HertxvarFRenderer::new);
/*  84 */     event.registerEntityRenderer((EntityType)LatexModEntities.HERTXVAR_SOL.get(), net.ltxprogrammer.turned.client.renderer.HertxvarSolRenderer::new);
/*  85 */     event.registerEntityRenderer((EntityType)LatexModEntities.HERTXVAR_FB.get(), net.ltxprogrammer.turned.client.renderer.HertxvarFBRenderer::new);
/*  86 */     event.registerEntityRenderer((EntityType)LatexModEntities.HERTX_SIT.get(), net.ltxprogrammer.turned.client.renderer.HertxSitRenderer::new);
/*  87 */     event.registerEntityRenderer((EntityType)LatexModEntities.ASHBURY_HERTX.get(), net.ltxprogrammer.turned.client.renderer.AshburyHertxRenderer::new);
/*  88 */     event.registerEntityRenderer((EntityType)LatexModEntities.ASHBURY_SIT.get(), net.ltxprogrammer.turned.client.renderer.AshburySitRenderer::new);
/*  89 */     event.registerEntityRenderer((EntityType)LatexModEntities.BEE_HERTX_SIT.get(), net.ltxprogrammer.turned.client.renderer.BeeHertxSitRenderer::new);
/*  90 */     event.registerEntityRenderer((EntityType)LatexModEntities.AHV_HERTX_SIT.get(), net.ltxprogrammer.turned.client.renderer.AHVHertxSitRenderer::new);
/*  91 */     event.registerEntityRenderer((EntityType)LatexModEntities.NXT_SIT.get(), net.ltxprogrammer.turned.client.renderer.NXTSitRenderer::new);
/*  92 */     event.registerEntityRenderer((EntityType)LatexModEntities.HERTX_F_SIT.get(), net.ltxprogrammer.turned.client.renderer.HertxFSitRenderer::new);
/*  93 */     event.registerEntityRenderer((EntityType)LatexModEntities.HERTX_FB_SIT.get(), net.ltxprogrammer.turned.client.renderer.HertxFBSitRenderer::new);
/*  94 */     event.registerEntityRenderer((EntityType)LatexModEntities.HERTX_SOL_WAIT.get(), net.ltxprogrammer.turned.client.renderer.HertxSolWaitRenderer::new);
/*  95 */     event.registerEntityRenderer((EntityType)LatexModEntities.SLIMELING_TAMED.get(), net.ltxprogrammer.turned.client.renderer.SlimelingTamedRenderer::new);
/*  96 */     event.registerEntityRenderer((EntityType)LatexModEntities.SLIMELINGTAMEDSIT.get(), net.ltxprogrammer.turned.client.renderer.SlimelingtamedsitRenderer::new);
/*  97 */     event.registerEntityRenderer((EntityType)LatexModEntities.PROTECTOR_SLIMELING.get(), net.ltxprogrammer.turned.client.renderer.ProtectorSlimelingRenderer::new);
/*  98 */     event.registerEntityRenderer((EntityType)LatexModEntities.PROTECTOR_SLIMELINGSIT.get(), net.ltxprogrammer.turned.client.renderer.ProtectorSlimelingsitRenderer::new);
/*  99 */     event.registerEntityRenderer((EntityType)LatexModEntities.DARK_LATEX_CAKE.get(), net.ltxprogrammer.turned.client.renderer.DarkLatexCakeRenderer::new);
/* 100 */     event.registerEntityRenderer((EntityType)LatexModEntities.DRONE_HERTX_WAIT.get(), net.ltxprogrammer.turned.client.renderer.DroneHertxWaitRenderer::new);
/* 101 */     event.registerEntityRenderer((EntityType)LatexModEntities.ARMED_DRONE_HERTX_WAIT.get(), net.ltxprogrammer.turned.client.renderer.ArmedDroneHertxWaitRenderer::new);
/* 102 */     event.registerEntityRenderer((EntityType)LatexModEntities.EXPLOSIVEGOO.get(), net.minecraft.client.renderer.entity.ThrownItemRenderer::new);
/* 103 */     event.registerEntityRenderer((EntityType)LatexModEntities.CIVILIAN_MILITIA_MELEE.get(), net.ltxprogrammer.turned.client.renderer.CivilianMilitiaMeleeRenderer::new);
/* 104 */     event.registerEntityRenderer((EntityType)LatexModEntities.PRISIONER_MILITIA_MELEE.get(), net.ltxprogrammer.turned.client.renderer.PrisionerMilitiaMeleeRenderer::new);
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\init\LatexModEntityRenderers.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */