package net.ltxprogrammer.turned.init;

import net.ltxprogrammer.changed.client.renderer.model.armor.ArmorModel;
import net.ltxprogrammer.changed.client.renderer.model.armor.ArmorNoneModel;
import net.ltxprogrammer.turned.LatexMod;
import net.ltxprogrammer.turned.client.model.ModelAHV_hertx_model;
import net.ltxprogrammer.turned.client.model.ModelAHV_hertx_sit_model;
import net.ltxprogrammer.turned.client.model.ModelArmed_Drone_Hertx_Rest;
import net.ltxprogrammer.turned.client.model.ModelDL_Queen_Bee;
import net.ltxprogrammer.turned.client.model.ModelDark_Latex_Centaur_Model;
import net.ltxprogrammer.turned.client.model.ModelDark_latex_bee;
import net.ltxprogrammer.turned.client.model.ModelDark_latex_creeper;
import net.ltxprogrammer.turned.client.model.ModelDark_latex_creeper_enhanced;
import net.ltxprogrammer.turned.client.model.ModelDark_latex_fox;
import net.ltxprogrammer.turned.client.model.ModelDark_latex_snep;
import net.ltxprogrammer.turned.client.model.ModelDark_latex_squid_dog;
import net.ltxprogrammer.turned.client.model.ModelDrone_Hertx;
import net.ltxprogrammer.turned.client.model.ModelDrone_Hertx_Sit;
import net.ltxprogrammer.turned.client.model.ModelLatex_Drop_Pod;
import net.ltxprogrammer.turned.client.model.ModelMilitary_Drone_Hertx;
import net.ltxprogrammer.turned.client.model.ModelProtector_remaster;
import net.ltxprogrammer.turned.client.model.ModelProtector_remaster_sit;
import net.ltxprogrammer.turned.client.model.ModelRoomba;
import net.ltxprogrammer.turned.client.model.ModelScientific_Drop_Pod;
import net.ltxprogrammer.turned.client.model.ModelSlimeling_remaster;
import net.ltxprogrammer.turned.client.model.ModelSlimeling_remaster_sit;
import net.ltxprogrammer.turned.client.model.ModelSlimeling_tamed_remaster;
import net.ltxprogrammer.turned.client.model.ModelTSC_Hunter_model;
import net.ltxprogrammer.turned.client.model.Modelbee_hertx_model;
import net.ltxprogrammer.turned.client.model.Modelbee_hertx_sit_model;
import net.ltxprogrammer.turned.client.model.Modeldark_latex_cake_model;
import net.ltxprogrammer.turned.client.model.Modeldark_latex_cone_model;
import net.ltxprogrammer.turned.client.model.Modeldark_latex_fox_scientist;
import net.ltxprogrammer.turned.client.model.Modeldark_latex_fox_sniper;
import net.ltxprogrammer.turned.client.model.Modeldark_latex_model;
import net.ltxprogrammer.turned.client.model.Modeldark_latex_noise_stalker;
import net.ltxprogrammer.turned.client.model.Modeldark_latex_shark;
import net.ltxprogrammer.turned.client.model.Modeldark_latex_skeleton_model;
import net.ltxprogrammer.turned.client.model.Modeldark_latex_snek_model;
import net.ltxprogrammer.turned.client.model.Modeldl_moth_model;
import net.ltxprogrammer.turned.client.model.Modeldl_slug_model;
import net.ltxprogrammer.turned.client.model.Modeldrop_pod;
import net.ltxprogrammer.turned.client.model.Modelhertx_ashbury_model;
import net.ltxprogrammer.turned.client.model.Modelhertx_ashbury_sit_model;
import net.ltxprogrammer.turned.client.model.Modelhertx_model;
import net.ltxprogrammer.turned.client.model.Modelhertx_model_f;
import net.ltxprogrammer.turned.client.model.Modelhertx_model_fb;
import net.ltxprogrammer.turned.client.model.Modelhertx_model_fb_sit;
import net.ltxprogrammer.turned.client.model.Modelhertx_model_s1;
import net.ltxprogrammer.turned.client.model.Modelhertx_model_sit;
import net.ltxprogrammer.turned.client.model.Modelhertx_model_wait_s1;
import net.ltxprogrammer.turned.client.model.Modelhertx_sit_model_f;
import net.ltxprogrammer.turned.client.model.Modella_4_tankmorph_model_m;
import net.ltxprogrammer.turned.client.model.Modella_4_tankmorph_model_r;
import net.ltxprogrammer.turned.client.model.Modelnxt_hertx_model;
import net.ltxprogrammer.turned.client.model.Modelnxt_hertx_sit_model;
import net.ltxprogrammer.turned.client.model.Modelqueen_spider_latex_model;
import net.ltxprogrammer.turned.client.model.Modelspider_latex_model;
import net.ltxprogrammer.turned.client.model.Modeltsc_berserk_model;
import net.ltxprogrammer.turned.client.model.Modeltsc_drone_model;
import net.ltxprogrammer.turned.client.model.Modeltsc_outsider_model;
import net.ltxprogrammer.turned.client.model.Modeltsc_outsider_ranged_model;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/init/LatexModModels.class */
public class LatexModModels {
    public static final ModelLayerLocation HUMANOID = new ModelLayerLocation(LatexMod.modResource("humanoid"), "main");

    @SubscribeEvent
    public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(HUMANOID, () -> LayerDefinition.create(HumanoidModel.createMesh(CubeDeformation.NONE, 0.0f), 64, 32));
        //event.registerLayerDefinition(Modeldark_latex_snek_model.LAYER_LOCATION, Modeldark_latex_snek_model::createBodyLayer);
        event.registerLayerDefinition(ModelTSC_Hunter_model.LAYER_LOCATION, ModelTSC_Hunter_model::createBodyLayer);
        event.registerLayerDefinition(Modeldrop_pod.LAYER_LOCATION, Modeldrop_pod::createBodyLayer);
        event.registerLayerDefinition(Modelhertx_model_wait_s1.LAYER_LOCATION, Modelhertx_model_wait_s1::createBodyLayer);
        event.registerLayerDefinition(Modelhertx_model.LAYER_LOCATION, Modelhertx_model::createBodyLayer);
        event.registerLayerDefinition(ModelRoomba.LAYER_LOCATION, ModelRoomba::createBodyLayer);
        event.registerLayerDefinition(ModelSlimeling_tamed_remaster.LAYER_LOCATION, ModelSlimeling_tamed_remaster::createBodyLayer);
        event.registerLayerDefinition(Modelnxt_hertx_sit_model.LAYER_LOCATION, Modelnxt_hertx_sit_model::createBodyLayer);
        event.registerLayerDefinition(Modelbee_hertx_model.LAYER_LOCATION, Modelbee_hertx_model::createBodyLayer);
        event.registerLayerDefinition(ModelArmed_Drone_Hertx_Rest.LAYER_LOCATION, ModelArmed_Drone_Hertx_Rest::createBodyLayer);
        event.registerLayerDefinition(Modelhertx_model_fb_sit.LAYER_LOCATION, Modelhertx_model_fb_sit::createBodyLayer);
        event.registerLayerDefinition(ModelProtector_remaster_sit.LAYER_LOCATION, ModelProtector_remaster_sit::createBodyLayer);
        //event.registerLayerDefinition(Modeldark_latex_cake_model.LAYER_LOCATION, Modeldark_latex_cake_model::createBodyLayer);
        event.registerLayerDefinition(Modella_4_tankmorph_model_m.LAYER_LOCATION, Modella_4_tankmorph_model_m::createBodyLayer);
        event.registerLayerDefinition(Modeltsc_outsider_model.LAYER_LOCATION, Modeltsc_outsider_model::createBodyLayer);
        event.registerLayerDefinition(ModelSlimeling_remaster_sit.LAYER_LOCATION, ModelSlimeling_remaster_sit::createBodyLayer);
        event.registerLayerDefinition(ModelScientific_Drop_Pod.LAYER_LOCATION, ModelScientific_Drop_Pod::createBodyLayer);
        event.registerLayerDefinition(ModelAHV_hertx_sit_model.LAYER_LOCATION, ModelAHV_hertx_sit_model::createBodyLayer);
        event.registerLayerDefinition(Modelhertx_model_f.LAYER_LOCATION, Modelhertx_model_f::createBodyLayer);
        //event.registerLayerDefinition(Modeldark_latex_cone_model.LAYER_LOCATION, Modeldark_latex_cone_model::createBodyLayer);
        event.registerLayerDefinition(Modeltsc_berserk_model.LAYER_LOCATION, Modeltsc_berserk_model::createBodyLayer);
        event.registerLayerDefinition(ModelDrone_Hertx.LAYER_LOCATION, ModelDrone_Hertx::createBodyLayer);
        event.registerLayerDefinition(ModelDrone_Hertx_Sit.LAYER_LOCATION, ModelDrone_Hertx_Sit::createBodyLayer);
        event.registerLayerDefinition(Modelhertx_ashbury_model.LAYER_LOCATION, Modelhertx_ashbury_model::createBodyLayer);
        event.registerLayerDefinition(Modella_4_tankmorph_model_r.LAYER_LOCATION, Modella_4_tankmorph_model_r::createBodyLayer);
        //event.registerLayerDefinition(ModelDark_latex_snep.LAYER_LOCATION, ModelDark_latex_snep::createBodyLayer);
        //event.registerLayerDefinition(Modeldark_latex_model.LAYER_LOCATION, Modeldark_latex_model::createBodyLayer);
        //event.registerLayerDefinition(ModelDark_latex_squid_dog.LAYER_LOCATION, ModelDark_latex_squid_dog::createBodyLayer);
        event.registerLayerDefinition(ModelProtector_remaster.LAYER_LOCATION, ModelProtector_remaster::createBodyLayer);
        event.registerLayerDefinition(Modelhertx_ashbury_sit_model.LAYER_LOCATION, Modelhertx_ashbury_sit_model::createBodyLayer);
        event.registerLayerDefinition(Modelhertx_model_fb.LAYER_LOCATION, Modelhertx_model_fb::createBodyLayer);
        event.registerLayerDefinition(ModelSlimeling_remaster.LAYER_LOCATION, ModelSlimeling_remaster::createBodyLayer);
        //event.registerLayerDefinition(ModelDark_latex_fox.LAYER_LOCATION, ModelDark_latex_fox::createBodyLayer);
        event.registerLayerDefinition(Modeldark_latex_fox_sniper.LAYER_LOCATION, Modeldark_latex_fox_sniper::createBodyLayer);
        event.registerLayerDefinition(Modeldark_latex_fox_scientist.LAYER_LOCATION, Modeldark_latex_fox_scientist::createBodyLayer);
        event.registerLayerDefinition(Modelhertx_model_s1.LAYER_LOCATION, Modelhertx_model_s1::createBodyLayer);
        //event.registerLayerDefinition(Modeldark_latex_shark.LAYER_LOCATION, Modeldark_latex_shark::createBodyLayer);
        event.registerLayerDefinition(ModelLatex_Drop_Pod.LAYER_LOCATION, ModelLatex_Drop_Pod::createBodyLayer);
        event.registerLayerDefinition(Modelspider_latex_model.LAYER_LOCATION, Modelspider_latex_model::createBodyLayer);
        event.registerLayerDefinition(ModelDark_latex_bee.LAYER_LOCATION, ModelDark_latex_bee::createBodyLayer);
        event.registerLayerDefinition(ModelDL_Queen_Bee.LAYER_LOCATION, ModelDL_Queen_Bee::createBodyLayer);
        event.registerLayerDefinition(Modeldl_slug_model.LAYER_LOCATION, Modeldl_slug_model::createBodyLayer);
        //event.registerLayerDefinition(ModelDark_Latex_Centaur_Model.LAYER_LOCATION, ModelDark_Latex_Centaur_Model::createBodyLayer);
        event.registerLayerDefinition(Modeltsc_outsider_ranged_model.LAYER_LOCATION, Modeltsc_outsider_ranged_model::createBodyLayer);
        event.registerLayerDefinition(ModelDark_latex_creeper.LAYER_LOCATION, ModelDark_latex_creeper::createBodyLayer);
        event.registerLayerDefinition(Modeltsc_drone_model.LAYER_LOCATION, Modeltsc_drone_model::createBodyLayer);
        event.registerLayerDefinition(ModelMilitary_Drone_Hertx.LAYER_LOCATION, ModelMilitary_Drone_Hertx::createBodyLayer);
        event.registerLayerDefinition(ModelDark_latex_creeper_enhanced.LAYER_LOCATION, ModelDark_latex_creeper_enhanced::createBodyLayer);
        event.registerLayerDefinition(Modelqueen_spider_latex_model.LAYER_LOCATION, Modelqueen_spider_latex_model::createBodyLayer);
        event.registerLayerDefinition(ModelAHV_hertx_model.LAYER_LOCATION, ModelAHV_hertx_model::createBodyLayer);
        event.registerLayerDefinition(Modelbee_hertx_sit_model.LAYER_LOCATION, Modelbee_hertx_sit_model::createBodyLayer);
        //event.registerLayerDefinition(Modeldl_moth_model.LAYER_LOCATION, Modeldl_moth_model::createBodyLayer);
        //event.registerLayerDefinition(Modeldark_latex_skeleton_model.LAYER_LOCATION, Modeldark_latex_skeleton_model::createBodyLayer);
        event.registerLayerDefinition(Modelhertx_model_sit.LAYER_LOCATION, Modelhertx_model_sit::createBodyLayer);
        event.registerLayerDefinition(Modeldark_latex_noise_stalker.LAYER_LOCATION, Modeldark_latex_noise_stalker::createBodyLayer);
        event.registerLayerDefinition(Modelhertx_sit_model_f.LAYER_LOCATION, Modelhertx_sit_model_f::createBodyLayer);
        event.registerLayerDefinition(Modelnxt_hertx_model.LAYER_LOCATION, Modelnxt_hertx_model::createBodyLayer);
        event.registerLayerDefinition(ArmorNoneModel.INNER_ARMOR, () -> ArmorNoneModel.createArmorLayer(ArmorModel.INNER));
        event.registerLayerDefinition(ArmorNoneModel.OUTER_ARMOR, () -> ArmorNoneModel.createArmorLayer(ArmorModel.OUTER));
    }
}