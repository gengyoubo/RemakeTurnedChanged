package net.ltxprogrammer.turned.init;

import net.ltxprogrammer.turned.client.renderer.AHVHertxRenderer;
import net.ltxprogrammer.turned.client.renderer.AHVHertxSitRenderer;
import net.ltxprogrammer.turned.client.renderer.AllydroppodRenderer;
import net.ltxprogrammer.turned.client.renderer.ArmedDroneHertxRenderer;
import net.ltxprogrammer.turned.client.renderer.ArmedDroneHertxWaitRenderer;
import net.ltxprogrammer.turned.client.renderer.AshburyHertxRenderer;
import net.ltxprogrammer.turned.client.renderer.AshburySitRenderer;
import net.ltxprogrammer.turned.client.renderer.BeeHertxRenderer;
import net.ltxprogrammer.turned.client.renderer.BeeHertxSitRenderer;
import net.ltxprogrammer.turned.client.renderer.CivilianMilitiaMeleeRenderer;
import net.ltxprogrammer.turned.client.renderer.CivilianRenderer;
import net.ltxprogrammer.turned.client.renderer.CivlianMilitiaRenderer;
import net.ltxprogrammer.turned.client.renderer.DLbeeRenderer;
import net.ltxprogrammer.turned.client.renderer.DROPPODRenderer;
import net.ltxprogrammer.turned.client.renderer.DarkLatexCakeRenderer;
import net.ltxprogrammer.turned.client.renderer.DarkLatexCentaurRenderer;
import net.ltxprogrammer.turned.client.renderer.DarkLatexCreeperEnhancedRenderer;
import net.ltxprogrammer.turned.client.renderer.DarkLatexCreeperRenderer;
import net.ltxprogrammer.turned.client.renderer.DarkLatexFoxRenderer;
import net.ltxprogrammer.turned.client.renderer.DarkLatexFoxScientistRenderer;
import net.ltxprogrammer.turned.client.renderer.DarkLatexFoxSniperRenderer;
import net.ltxprogrammer.turned.client.renderer.DarkLatexMothRenderer;
import net.ltxprogrammer.turned.client.renderer.DarkLatexQueenBeeRenderer;
import net.ltxprogrammer.turned.client.renderer.DarkLatexSkeletonRenderer;
import net.ltxprogrammer.turned.client.renderer.DarkLatexSnakeRenderer;
import net.ltxprogrammer.turned.client.renderer.DarkLatexSnepRenderer;
import net.ltxprogrammer.turned.client.renderer.DarkLatexSpiderQueenRenderer;
import net.ltxprogrammer.turned.client.renderer.DarkLatexSpiderRenderer;
import net.ltxprogrammer.turned.client.renderer.DarklatexRenderer;
import net.ltxprogrammer.turned.client.renderer.DarklatexconeRenderer;
import net.ltxprogrammer.turned.client.renderer.DarklatexslugRenderer;
import net.ltxprogrammer.turned.client.renderer.DlSquidDogRenderer;
import net.ltxprogrammer.turned.client.renderer.DlsharkRenderer;
import net.ltxprogrammer.turned.client.renderer.DroneHertxRenderer;
import net.ltxprogrammer.turned.client.renderer.DroneHertxWaitRenderer;
import net.ltxprogrammer.turned.client.renderer.EvilMilitaryRenderer;
import net.ltxprogrammer.turned.client.renderer.EvilScientistRenderer;
import net.ltxprogrammer.turned.client.renderer.EvilSniperRenderer;
import net.ltxprogrammer.turned.client.renderer.HertxFBSitRenderer;
import net.ltxprogrammer.turned.client.renderer.HertxFSitRenderer;
import net.ltxprogrammer.turned.client.renderer.HertxRenderer;
import net.ltxprogrammer.turned.client.renderer.HertxSitRenderer;
import net.ltxprogrammer.turned.client.renderer.HertxSolWaitRenderer;
import net.ltxprogrammer.turned.client.renderer.HertxvarFBRenderer;
import net.ltxprogrammer.turned.client.renderer.HertxvarFRenderer;
import net.ltxprogrammer.turned.client.renderer.HertxvarSolRenderer;
import net.ltxprogrammer.turned.client.renderer.La4tankmorphmRenderer;
import net.ltxprogrammer.turned.client.renderer.La4tankmorphrRenderer;
import net.ltxprogrammer.turned.client.renderer.LatexDropPodRenderer;
import net.ltxprogrammer.turned.client.renderer.MilitaryRenderer;
import net.ltxprogrammer.turned.client.renderer.MilitaryRiotRenderer;
import net.ltxprogrammer.turned.client.renderer.MilitaryflameunitRenderer;
import net.ltxprogrammer.turned.client.renderer.NXTHertxRenderer;
import net.ltxprogrammer.turned.client.renderer.NXTSitRenderer;
import net.ltxprogrammer.turned.client.renderer.NoiseStalkerRenderer;
import net.ltxprogrammer.turned.client.renderer.PrisionerMilitiaMeleeRenderer;
import net.ltxprogrammer.turned.client.renderer.PrisionerRenderer;
import net.ltxprogrammer.turned.client.renderer.PrisionermilitiaRenderer;
import net.ltxprogrammer.turned.client.renderer.ProtectorSlimelingRenderer;
import net.ltxprogrammer.turned.client.renderer.ProtectorSlimelingsitRenderer;
import net.ltxprogrammer.turned.client.renderer.ScientistRenderer;
import net.ltxprogrammer.turned.client.renderer.SlimelingRenderer;
import net.ltxprogrammer.turned.client.renderer.SlimelingTamedRenderer;
import net.ltxprogrammer.turned.client.renderer.SlimelingtamedsitRenderer;
import net.ltxprogrammer.turned.client.renderer.TSCBerserkRenderer;
import net.ltxprogrammer.turned.client.renderer.TSCHunterRenderer;
import net.ltxprogrammer.turned.client.renderer.TSCOutsiderGunnerRenderer;
import net.ltxprogrammer.turned.client.renderer.TSCOutsiderRenderer;
import net.ltxprogrammer.turned.client.renderer.TSCdroneRenderer;
import net.minecraft.client.renderer.entity.ThrownItemRenderer;
import net.minecraft.world.entity.EntityType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@EventBusSubscriber(
        bus = Bus.MOD,
        value = {Dist.CLIENT}
)
public class LatexModEntityRenderers {
    public LatexModEntityRenderers() {
    }

    @SubscribeEvent
    public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer((EntityType) LatexModEntities.SLIMELING.get(), SlimelingRenderer::new);
        event.registerEntityRenderer((EntityType) LatexModEntities.DARKLATEXSLUG.get(), DarklatexslugRenderer::new);
        event.registerEntityRenderer((EntityType) LatexModEntities.DARKLATEX.get(), DarklatexRenderer::new);
        event.registerEntityRenderer((EntityType) LatexModEntities.DARK_LATEX_CENTAUR.get(), DarkLatexCentaurRenderer::new);
        event.registerEntityRenderer((EntityType) LatexModEntities.DARK_LATEX_SKELETON.get(), DarkLatexSkeletonRenderer::new);
        event.registerEntityRenderer((EntityType) LatexModEntities.NOISE_STALKER.get(), NoiseStalkerRenderer::new);
        event.registerEntityRenderer((EntityType) LatexModEntities.DLSHARK.get(), DlsharkRenderer::new);
        event.registerEntityRenderer((EntityType) LatexModEntities.DARK_LATEX_MOTH.get(), DarkLatexMothRenderer::new);
        event.registerEntityRenderer((EntityType) LatexModEntities.DARK_LATEX_SNEP.get(), DarkLatexSnepRenderer::new);
        event.registerEntityRenderer((EntityType) LatexModEntities.DARK_LATEX_FOX.get(), DarkLatexFoxRenderer::new);
        event.registerEntityRenderer((EntityType) LatexModEntities.DARK_LATEX_FOX_SNIPER.get(), DarkLatexFoxSniperRenderer::new);
        event.registerEntityRenderer((EntityType) LatexModEntities.DARK_LATEX_SNAKE.get(), DarkLatexSnakeRenderer::new);
        event.registerEntityRenderer((EntityType) LatexModEntities.DARK_LATEX_SPIDER.get(), DarkLatexSpiderRenderer::new);
        event.registerEntityRenderer((EntityType) LatexModEntities.DL_SQUID_DOG.get(), DlSquidDogRenderer::new);
        event.registerEntityRenderer((EntityType) LatexModEntities.D_LBEE.get(), DLbeeRenderer::new);
        event.registerEntityRenderer((EntityType) LatexModEntities.DARK_LATEX_QUEEN_BEE.get(), DarkLatexQueenBeeRenderer::new);
        event.registerEntityRenderer((EntityType) LatexModEntities.DARK_LATEX_SPIDER_QUEEN.get(), DarkLatexSpiderQueenRenderer::new);
        event.registerEntityRenderer((EntityType) LatexModEntities.DARKLATEXCONE.get(), DarklatexconeRenderer::new);
        event.registerEntityRenderer((EntityType) LatexModEntities.HERTX.get(), HertxRenderer::new);
        event.registerEntityRenderer((EntityType) LatexModEntities.DRONE_HERTX.get(), DroneHertxRenderer::new);
        event.registerEntityRenderer((EntityType) LatexModEntities.ARMED_DRONE_HERTX.get(), ArmedDroneHertxRenderer::new);
        event.registerEntityRenderer((EntityType) LatexModEntities.SCIENTIST.get(), ScientistRenderer::new);
        event.registerEntityRenderer((EntityType) LatexModEntities.MILITARY.get(), MilitaryRenderer::new);
        event.registerEntityRenderer((EntityType) LatexModEntities.MILITARYFLAMEUNIT.get(), MilitaryflameunitRenderer::new);
        event.registerEntityRenderer((EntityType) LatexModEntities.EVIL_SCIENTIST.get(), EvilScientistRenderer::new);
        event.registerEntityRenderer((EntityType) LatexModEntities.EVIL_SNIPER.get(), EvilSniperRenderer::new);
        event.registerEntityRenderer((EntityType) LatexModEntities.EVIL_MILITARY.get(), EvilMilitaryRenderer::new);
        event.registerEntityRenderer((EntityType) LatexModEntities.TSC_OUTSIDER.get(), TSCOutsiderRenderer::new);
        event.registerEntityRenderer((EntityType) LatexModEntities.TSC_OUTSIDER_GUNNER.get(), TSCOutsiderGunnerRenderer::new);
        event.registerEntityRenderer((EntityType) LatexModEntities.TS_CDRONE.get(), TSCdroneRenderer::new);
        event.registerEntityRenderer((EntityType) LatexModEntities.TSC_HUNTER.get(), TSCHunterRenderer::new);
        event.registerEntityRenderer((EntityType) LatexModEntities.MILITARY_RIOT.get(), MilitaryRiotRenderer::new);
        event.registerEntityRenderer((EntityType) LatexModEntities.TSC_BERSERK.get(), TSCBerserkRenderer::new);
        event.registerEntityRenderer((EntityType) LatexModEntities.DARK_LATEX_CREEPER.get(), DarkLatexCreeperRenderer::new);
        event.registerEntityRenderer((EntityType) LatexModEntities.DARK_LATEX_CREEPER_ENHANCED.get(), DarkLatexCreeperEnhancedRenderer::new);
        event.registerEntityRenderer((EntityType) LatexModEntities.CIVILIAN.get(), CivilianRenderer::new);
        event.registerEntityRenderer((EntityType) LatexModEntities.PRISIONER.get(), PrisionerRenderer::new);
        event.registerEntityRenderer((EntityType) LatexModEntities.PRISIONERMILITIA.get(), PrisionermilitiaRenderer::new);
        event.registerEntityRenderer((EntityType) LatexModEntities.CIVLIAN_MILITIA.get(), CivlianMilitiaRenderer::new);
        event.registerEntityRenderer((EntityType) LatexModEntities.CRYSTALBOW.get(), ThrownItemRenderer::new);
        event.registerEntityRenderer((EntityType) LatexModEntities.LATEXCANNON.get(), ThrownItemRenderer::new);
        event.registerEntityRenderer((EntityType) LatexModEntities.REVOLVING_GOO_CANNON.get(), ThrownItemRenderer::new);
        event.registerEntityRenderer((EntityType) LatexModEntities.DARTRIFLE.get(), ThrownItemRenderer::new);
        event.registerEntityRenderer((EntityType) LatexModEntities.MATCHLOCK_PISTOL.get(), ThrownItemRenderer::new);
        event.registerEntityRenderer((EntityType) LatexModEntities.MATCH_LOCK_MUSKET.get(), ThrownItemRenderer::new);
        event.registerEntityRenderer((EntityType) LatexModEntities.AR_70_ASSAULT_RIFLE.get(), ThrownItemRenderer::new);
        event.registerEntityRenderer((EntityType) LatexModEntities.M_4_ASSAULT_RIFLE.get(), ThrownItemRenderer::new);
        event.registerEntityRenderer((EntityType) LatexModEntities.SCRAP_M_16_RIFLE.get(), ThrownItemRenderer::new);
        event.registerEntityRenderer((EntityType) LatexModEntities.TSC_PISTOL.get(), ThrownItemRenderer::new);
        event.registerEntityRenderer((EntityType) LatexModEntities.OVERUNDERSHOTGUN.get(), ThrownItemRenderer::new);
        event.registerEntityRenderer((EntityType) LatexModEntities.FLAMETHOWER.get(), ThrownItemRenderer::new);
        event.registerEntityRenderer((EntityType) LatexModEntities.LATEX_DART_RIFLE.get(), ThrownItemRenderer::new);
        event.registerEntityRenderer((EntityType) LatexModEntities.DARK_LATEX_FOX_SCIENTIST.get(), DarkLatexFoxScientistRenderer::new);
        event.registerEntityRenderer((EntityType) LatexModEntities.BEE_HERTX.get(), BeeHertxRenderer::new);
        event.registerEntityRenderer((EntityType) LatexModEntities.AHV_HERTX.get(), AHVHertxRenderer::new);
        event.registerEntityRenderer((EntityType) LatexModEntities.TANK_CANNON.get(), ThrownItemRenderer::new);
        event.registerEntityRenderer((EntityType) LatexModEntities.LA_4TANKMORPHR.get(), La4tankmorphrRenderer::new);
        event.registerEntityRenderer((EntityType) LatexModEntities.LA_4TANKMORPHM.get(), La4tankmorphmRenderer::new);
        event.registerEntityRenderer((EntityType) LatexModEntities.NXT_HERTX.get(), NXTHertxRenderer::new);
        event.registerEntityRenderer((EntityType) LatexModEntities.DROPPOD.get(), DROPPODRenderer::new);
        event.registerEntityRenderer((EntityType) LatexModEntities.SNEPPLE.get(), ThrownItemRenderer::new);
        event.registerEntityRenderer((EntityType) LatexModEntities.ALLYDROPPOD.get(), AllydroppodRenderer::new);
        event.registerEntityRenderer((EntityType) LatexModEntities.LATEX_DROP_POD.get(), LatexDropPodRenderer::new);
        event.registerEntityRenderer((EntityType) LatexModEntities.HERTXVAR_F.get(), HertxvarFRenderer::new);
        event.registerEntityRenderer((EntityType) LatexModEntities.HERTXVAR_SOL.get(), HertxvarSolRenderer::new);
        event.registerEntityRenderer((EntityType) LatexModEntities.HERTXVAR_FB.get(), HertxvarFBRenderer::new);
        event.registerEntityRenderer((EntityType) LatexModEntities.HERTX_SIT.get(), HertxSitRenderer::new);
        event.registerEntityRenderer((EntityType) LatexModEntities.ASHBURY_HERTX.get(), AshburyHertxRenderer::new);
        event.registerEntityRenderer((EntityType) LatexModEntities.ASHBURY_SIT.get(), AshburySitRenderer::new);
        event.registerEntityRenderer((EntityType) LatexModEntities.BEE_HERTX_SIT.get(), BeeHertxSitRenderer::new);
        event.registerEntityRenderer((EntityType) LatexModEntities.AHV_HERTX_SIT.get(), AHVHertxSitRenderer::new);
        event.registerEntityRenderer((EntityType) LatexModEntities.NXT_SIT.get(), NXTSitRenderer::new);
        event.registerEntityRenderer((EntityType) LatexModEntities.HERTX_F_SIT.get(), HertxFSitRenderer::new);
        event.registerEntityRenderer((EntityType) LatexModEntities.HERTX_FB_SIT.get(), HertxFBSitRenderer::new);
        event.registerEntityRenderer((EntityType) LatexModEntities.HERTX_SOL_WAIT.get(), HertxSolWaitRenderer::new);
        event.registerEntityRenderer((EntityType) LatexModEntities.SLIMELING_TAMED.get(), SlimelingTamedRenderer::new);
        event.registerEntityRenderer((EntityType) LatexModEntities.SLIMELINGTAMEDSIT.get(), SlimelingtamedsitRenderer::new);
        event.registerEntityRenderer((EntityType) LatexModEntities.PROTECTOR_SLIMELING.get(), ProtectorSlimelingRenderer::new);
        event.registerEntityRenderer((EntityType) LatexModEntities.PROTECTOR_SLIMELINGSIT.get(), ProtectorSlimelingsitRenderer::new);
        event.registerEntityRenderer((EntityType) LatexModEntities.DARK_LATEX_CAKE.get(), DarkLatexCakeRenderer::new);
        event.registerEntityRenderer((EntityType) LatexModEntities.DRONE_HERTX_WAIT.get(), DroneHertxWaitRenderer::new);
        event.registerEntityRenderer((EntityType) LatexModEntities.ARMED_DRONE_HERTX_WAIT.get(), ArmedDroneHertxWaitRenderer::new);
        event.registerEntityRenderer((EntityType) LatexModEntities.EXPLOSIVEGOO.get(), ThrownItemRenderer::new);
        event.registerEntityRenderer((EntityType) LatexModEntities.CIVILIAN_MILITIA_MELEE.get(), CivilianMilitiaMeleeRenderer::new);
        event.registerEntityRenderer((EntityType) LatexModEntities.PRISIONER_MILITIA_MELEE.get(), PrisionerMilitiaMeleeRenderer::new);
    }
}
