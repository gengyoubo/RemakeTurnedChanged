//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.mcreator.latexes.init;

import net.mcreator.latexes.client.renderer.AHVHertxRenderer;
import net.mcreator.latexes.client.renderer.AHVHertxSitRenderer;
import net.mcreator.latexes.client.renderer.AllydroppodRenderer;
import net.mcreator.latexes.client.renderer.ArmedDroneHertxRenderer;
import net.mcreator.latexes.client.renderer.ArmedDroneHertxWaitRenderer;
import net.mcreator.latexes.client.renderer.AshburyHertxRenderer;
import net.mcreator.latexes.client.renderer.AshburySitRenderer;
import net.mcreator.latexes.client.renderer.BeeHertxRenderer;
import net.mcreator.latexes.client.renderer.BeeHertxSitRenderer;
import net.mcreator.latexes.client.renderer.CivilianMilitiaMeleeRenderer;
import net.mcreator.latexes.client.renderer.CivilianRenderer;
import net.mcreator.latexes.client.renderer.CivlianMilitiaRenderer;
import net.mcreator.latexes.client.renderer.DLbeeRenderer;
import net.mcreator.latexes.client.renderer.DROPPODRenderer;
import net.mcreator.latexes.client.renderer.DarkLatexCakeRenderer;
import net.mcreator.latexes.client.renderer.DarkLatexCentaurRenderer;
import net.mcreator.latexes.client.renderer.DarkLatexCreeperEnhancedRenderer;
import net.mcreator.latexes.client.renderer.DarkLatexCreeperRenderer;
import net.mcreator.latexes.client.renderer.DarkLatexDragonRenderer;
import net.mcreator.latexes.client.renderer.DarkLatexFoxRenderer;
import net.mcreator.latexes.client.renderer.DarkLatexFoxScientistRenderer;
import net.mcreator.latexes.client.renderer.DarkLatexFoxSniperRenderer;
import net.mcreator.latexes.client.renderer.DarkLatexMothRenderer;
import net.mcreator.latexes.client.renderer.DarkLatexQueenBeeRenderer;
import net.mcreator.latexes.client.renderer.DarkLatexSkeletonRenderer;
import net.mcreator.latexes.client.renderer.DarkLatexSnakeRenderer;
import net.mcreator.latexes.client.renderer.DarkLatexSnepRenderer;
import net.mcreator.latexes.client.renderer.DarkLatexSpiderQueenRenderer;
import net.mcreator.latexes.client.renderer.DarkLatexSpiderRenderer;
import net.mcreator.latexes.client.renderer.DarklatexRenderer;
import net.mcreator.latexes.client.renderer.DarklatexconeRenderer;
import net.mcreator.latexes.client.renderer.DarklatexslugRenderer;
import net.mcreator.latexes.client.renderer.DlSquidDogRenderer;
import net.mcreator.latexes.client.renderer.DlsharkRenderer;
import net.mcreator.latexes.client.renderer.DroneHertxRenderer;
import net.mcreator.latexes.client.renderer.DroneHertxWaitRenderer;
import net.mcreator.latexes.client.renderer.EvilMilitaryRenderer;
import net.mcreator.latexes.client.renderer.EvilScientistRenderer;
import net.mcreator.latexes.client.renderer.EvilSniperRenderer;
import net.mcreator.latexes.client.renderer.HertxFBSitRenderer;
import net.mcreator.latexes.client.renderer.HertxFSitRenderer;
import net.mcreator.latexes.client.renderer.HertxRenderer;
import net.mcreator.latexes.client.renderer.HertxSitRenderer;
import net.mcreator.latexes.client.renderer.HertxSolWaitRenderer;
import net.mcreator.latexes.client.renderer.HertxvarFBRenderer;
import net.mcreator.latexes.client.renderer.HertxvarFRenderer;
import net.mcreator.latexes.client.renderer.HertxvarSolRenderer;
import net.mcreator.latexes.client.renderer.La4tankmorphmRenderer;
import net.mcreator.latexes.client.renderer.La4tankmorphrRenderer;
import net.mcreator.latexes.client.renderer.LatexDropPodRenderer;
import net.mcreator.latexes.client.renderer.MilitaryRenderer;
import net.mcreator.latexes.client.renderer.MilitaryRiotRenderer;
import net.mcreator.latexes.client.renderer.MilitaryflameunitRenderer;
import net.mcreator.latexes.client.renderer.NXTHertxRenderer;
import net.mcreator.latexes.client.renderer.NXTSitRenderer;
import net.mcreator.latexes.client.renderer.NoiseStalkerRenderer;
import net.mcreator.latexes.client.renderer.PrisionerMilitiaMeleeRenderer;
import net.mcreator.latexes.client.renderer.PrisionerRenderer;
import net.mcreator.latexes.client.renderer.PrisionermilitiaRenderer;
import net.mcreator.latexes.client.renderer.ProtectorSlimelingRenderer;
import net.mcreator.latexes.client.renderer.ProtectorSlimelingsitRenderer;
import net.mcreator.latexes.client.renderer.ScientistRenderer;
import net.mcreator.latexes.client.renderer.SlimelingRenderer;
import net.mcreator.latexes.client.renderer.SlimelingTamedRenderer;
import net.mcreator.latexes.client.renderer.SlimelingtamedsitRenderer;
import net.mcreator.latexes.client.renderer.TSCBerserkRenderer;
import net.mcreator.latexes.client.renderer.TSCHunterRenderer;
import net.mcreator.latexes.client.renderer.TSCOutsiderGunnerRenderer;
import net.mcreator.latexes.client.renderer.TSCOutsiderRenderer;
import net.mcreator.latexes.client.renderer.TSCdroneRenderer;
import net.mcreator.latexes.client.renderer.YufengRenderer;
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
        event.registerEntityRenderer((EntityType)LatexModEntities.SLIMELING.get(), SlimelingRenderer::new);
        event.registerEntityRenderer((EntityType)LatexModEntities.DARKLATEXSLUG.get(), DarklatexslugRenderer::new);
        event.registerEntityRenderer((EntityType)LatexModEntities.DARKLATEX.get(), DarklatexRenderer::new);
        event.registerEntityRenderer((EntityType)LatexModEntities.DARK_LATEX_CENTAUR.get(), DarkLatexCentaurRenderer::new);
        event.registerEntityRenderer((EntityType)LatexModEntities.DARK_LATEX_SKELETON.get(), DarkLatexSkeletonRenderer::new);
        event.registerEntityRenderer((EntityType)LatexModEntities.YUFENG.get(), YufengRenderer::new);
        event.registerEntityRenderer((EntityType)LatexModEntities.NOISE_STALKER.get(), NoiseStalkerRenderer::new);
        event.registerEntityRenderer((EntityType)LatexModEntities.DLSHARK.get(), DlsharkRenderer::new);
        event.registerEntityRenderer((EntityType)LatexModEntities.DARK_LATEX_MOTH.get(), DarkLatexMothRenderer::new);
        event.registerEntityRenderer((EntityType)LatexModEntities.DARK_LATEX_SNEP.get(), DarkLatexSnepRenderer::new);
        event.registerEntityRenderer((EntityType)LatexModEntities.DARK_LATEX_FOX.get(), DarkLatexFoxRenderer::new);
        event.registerEntityRenderer((EntityType)LatexModEntities.DARK_LATEX_FOX_SNIPER.get(), DarkLatexFoxSniperRenderer::new);
        event.registerEntityRenderer((EntityType)LatexModEntities.DARK_LATEX_SNAKE.get(), DarkLatexSnakeRenderer::new);
        event.registerEntityRenderer((EntityType)LatexModEntities.DARK_LATEX_DRAGON.get(), DarkLatexDragonRenderer::new);
        event.registerEntityRenderer((EntityType)LatexModEntities.DARK_LATEX_SPIDER.get(), DarkLatexSpiderRenderer::new);
        event.registerEntityRenderer((EntityType)LatexModEntities.DL_SQUID_DOG.get(), DlSquidDogRenderer::new);
        event.registerEntityRenderer((EntityType)LatexModEntities.D_LBEE.get(), DLbeeRenderer::new);
        event.registerEntityRenderer((EntityType)LatexModEntities.DARK_LATEX_QUEEN_BEE.get(), DarkLatexQueenBeeRenderer::new);
        event.registerEntityRenderer((EntityType)LatexModEntities.DARK_LATEX_SPIDER_QUEEN.get(), DarkLatexSpiderQueenRenderer::new);
        event.registerEntityRenderer((EntityType)LatexModEntities.DARKLATEXCONE.get(), DarklatexconeRenderer::new);
        event.registerEntityRenderer((EntityType)LatexModEntities.HERTX.get(), HertxRenderer::new);
        event.registerEntityRenderer((EntityType)LatexModEntities.DRONE_HERTX.get(), DroneHertxRenderer::new);
        event.registerEntityRenderer((EntityType)LatexModEntities.ARMED_DRONE_HERTX.get(), ArmedDroneHertxRenderer::new);
        event.registerEntityRenderer((EntityType)LatexModEntities.SCIENTIST.get(), ScientistRenderer::new);
        event.registerEntityRenderer((EntityType)LatexModEntities.MILITARY.get(), MilitaryRenderer::new);
        event.registerEntityRenderer((EntityType)LatexModEntities.MILITARYFLAMEUNIT.get(), MilitaryflameunitRenderer::new);
        event.registerEntityRenderer((EntityType)LatexModEntities.EVIL_SCIENTIST.get(), EvilScientistRenderer::new);
        event.registerEntityRenderer((EntityType)LatexModEntities.EVIL_SNIPER.get(), EvilSniperRenderer::new);
        event.registerEntityRenderer((EntityType)LatexModEntities.EVIL_MILITARY.get(), EvilMilitaryRenderer::new);
        event.registerEntityRenderer((EntityType)LatexModEntities.TSC_OUTSIDER.get(), TSCOutsiderRenderer::new);
        event.registerEntityRenderer((EntityType)LatexModEntities.TSC_OUTSIDER_GUNNER.get(), TSCOutsiderGunnerRenderer::new);
        event.registerEntityRenderer((EntityType)LatexModEntities.TS_CDRONE.get(), TSCdroneRenderer::new);
        event.registerEntityRenderer((EntityType)LatexModEntities.TSC_HUNTER.get(), TSCHunterRenderer::new);
        event.registerEntityRenderer((EntityType)LatexModEntities.MILITARY_RIOT.get(), MilitaryRiotRenderer::new);
        event.registerEntityRenderer((EntityType)LatexModEntities.TSC_BERSERK.get(), TSCBerserkRenderer::new);
        event.registerEntityRenderer((EntityType)LatexModEntities.DARK_LATEX_CREEPER.get(), DarkLatexCreeperRenderer::new);
        event.registerEntityRenderer((EntityType)LatexModEntities.DARK_LATEX_CREEPER_ENHANCED.get(), DarkLatexCreeperEnhancedRenderer::new);
        event.registerEntityRenderer((EntityType)LatexModEntities.CIVILIAN.get(), CivilianRenderer::new);
        event.registerEntityRenderer((EntityType)LatexModEntities.PRISIONER.get(), PrisionerRenderer::new);
        event.registerEntityRenderer((EntityType)LatexModEntities.PRISIONERMILITIA.get(), PrisionermilitiaRenderer::new);
        event.registerEntityRenderer((EntityType)LatexModEntities.CIVLIAN_MILITIA.get(), CivlianMilitiaRenderer::new);
        event.registerEntityRenderer((EntityType)LatexModEntities.CRYSTALBOW.get(), ThrownItemRenderer::new);
        event.registerEntityRenderer((EntityType)LatexModEntities.LATEXCANNON.get(), ThrownItemRenderer::new);
        event.registerEntityRenderer((EntityType)LatexModEntities.REVOLVING_GOO_CANNON.get(), ThrownItemRenderer::new);
        event.registerEntityRenderer((EntityType)LatexModEntities.DARTRIFLE.get(), ThrownItemRenderer::new);
        event.registerEntityRenderer((EntityType)LatexModEntities.MATCHLOCK_PISTOL.get(), ThrownItemRenderer::new);
        event.registerEntityRenderer((EntityType)LatexModEntities.MATCH_LOCK_MUSKET.get(), ThrownItemRenderer::new);
        event.registerEntityRenderer((EntityType)LatexModEntities.AR_70_ASSAULT_RIFLE.get(), ThrownItemRenderer::new);
        event.registerEntityRenderer((EntityType)LatexModEntities.M_4_ASSAULT_RIFLE.get(), ThrownItemRenderer::new);
        event.registerEntityRenderer((EntityType)LatexModEntities.SCRAP_M_16_RIFLE.get(), ThrownItemRenderer::new);
        event.registerEntityRenderer((EntityType)LatexModEntities.TSC_PISTOL.get(), ThrownItemRenderer::new);
        event.registerEntityRenderer((EntityType)LatexModEntities.OVERUNDERSHOTGUN.get(), ThrownItemRenderer::new);
        event.registerEntityRenderer((EntityType)LatexModEntities.FLAMETHOWER.get(), ThrownItemRenderer::new);
        event.registerEntityRenderer((EntityType)LatexModEntities.LATEX_DART_RIFLE.get(), ThrownItemRenderer::new);
        event.registerEntityRenderer((EntityType)LatexModEntities.DARK_LATEX_FOX_SCIENTIST.get(), DarkLatexFoxScientistRenderer::new);
        event.registerEntityRenderer((EntityType)LatexModEntities.BEE_HERTX.get(), BeeHertxRenderer::new);
        event.registerEntityRenderer((EntityType)LatexModEntities.AHV_HERTX.get(), AHVHertxRenderer::new);
        event.registerEntityRenderer((EntityType)LatexModEntities.TANK_CANNON.get(), ThrownItemRenderer::new);
        event.registerEntityRenderer((EntityType)LatexModEntities.LA_4TANKMORPHR.get(), La4tankmorphrRenderer::new);
        event.registerEntityRenderer((EntityType)LatexModEntities.LA_4TANKMORPHM.get(), La4tankmorphmRenderer::new);
        event.registerEntityRenderer((EntityType)LatexModEntities.NXT_HERTX.get(), NXTHertxRenderer::new);
        event.registerEntityRenderer((EntityType)LatexModEntities.DROPPOD.get(), DROPPODRenderer::new);
        event.registerEntityRenderer((EntityType)LatexModEntities.SNEPPLE.get(), ThrownItemRenderer::new);
        event.registerEntityRenderer((EntityType)LatexModEntities.ALLYDROPPOD.get(), AllydroppodRenderer::new);
        event.registerEntityRenderer((EntityType)LatexModEntities.LATEX_DROP_POD.get(), LatexDropPodRenderer::new);
        event.registerEntityRenderer((EntityType)LatexModEntities.HERTXVAR_F.get(), HertxvarFRenderer::new);
        event.registerEntityRenderer((EntityType)LatexModEntities.HERTXVAR_SOL.get(), HertxvarSolRenderer::new);
        event.registerEntityRenderer((EntityType)LatexModEntities.HERTXVAR_FB.get(), HertxvarFBRenderer::new);
        event.registerEntityRenderer((EntityType)LatexModEntities.HERTX_SIT.get(), HertxSitRenderer::new);
        event.registerEntityRenderer((EntityType)LatexModEntities.ASHBURY_HERTX.get(), AshburyHertxRenderer::new);
        event.registerEntityRenderer((EntityType)LatexModEntities.ASHBURY_SIT.get(), AshburySitRenderer::new);
        event.registerEntityRenderer((EntityType)LatexModEntities.BEE_HERTX_SIT.get(), BeeHertxSitRenderer::new);
        event.registerEntityRenderer((EntityType)LatexModEntities.AHV_HERTX_SIT.get(), AHVHertxSitRenderer::new);
        event.registerEntityRenderer((EntityType)LatexModEntities.NXT_SIT.get(), NXTSitRenderer::new);
        event.registerEntityRenderer((EntityType)LatexModEntities.HERTX_F_SIT.get(), HertxFSitRenderer::new);
        event.registerEntityRenderer((EntityType)LatexModEntities.HERTX_FB_SIT.get(), HertxFBSitRenderer::new);
        event.registerEntityRenderer((EntityType)LatexModEntities.HERTX_SOL_WAIT.get(), HertxSolWaitRenderer::new);
        event.registerEntityRenderer((EntityType)LatexModEntities.SLIMELING_TAMED.get(), SlimelingTamedRenderer::new);
        event.registerEntityRenderer((EntityType)LatexModEntities.SLIMELINGTAMEDSIT.get(), SlimelingtamedsitRenderer::new);
        event.registerEntityRenderer((EntityType)LatexModEntities.PROTECTOR_SLIMELING.get(), ProtectorSlimelingRenderer::new);
        event.registerEntityRenderer((EntityType)LatexModEntities.PROTECTOR_SLIMELINGSIT.get(), ProtectorSlimelingsitRenderer::new);
        event.registerEntityRenderer((EntityType)LatexModEntities.DARK_LATEX_CAKE.get(), DarkLatexCakeRenderer::new);
        event.registerEntityRenderer((EntityType)LatexModEntities.DRONE_HERTX_WAIT.get(), DroneHertxWaitRenderer::new);
        event.registerEntityRenderer((EntityType)LatexModEntities.ARMED_DRONE_HERTX_WAIT.get(), ArmedDroneHertxWaitRenderer::new);
        event.registerEntityRenderer((EntityType)LatexModEntities.EXPLOSIVEGOO.get(), ThrownItemRenderer::new);
        event.registerEntityRenderer((EntityType)LatexModEntities.CIVILIAN_MILITIA_MELEE.get(), CivilianMilitiaMeleeRenderer::new);
        event.registerEntityRenderer((EntityType)LatexModEntities.PRISIONER_MILITIA_MELEE.get(), PrisionerMilitiaMeleeRenderer::new);
    }
}
