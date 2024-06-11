/*    */ package net.ltxprogrammer.turned.init;
/*    */ import net.ltxprogrammer.changed.client.renderer.model.armor.ArmorModel;
/*    */ import net.ltxprogrammer.changed.client.renderer.model.armor.ArmorNoneModel;
/*    */ import net.ltxprogrammer.turned.client.model.ModelAHV_hertx_sit_model;
/*    */ import net.ltxprogrammer.turned.client.model.ModelDark_latex_creeper;
/*    */ import net.ltxprogrammer.turned.client.model.ModelLatex_Drop_Pod;
/*    */ import net.ltxprogrammer.turned.client.model.ModelProtector_remaster;
/*    */ import net.ltxprogrammer.turned.client.model.ModelScientific_Drop_Pod;
/*    */ import net.ltxprogrammer.turned.client.model.ModelSlimeling_remaster;
/*    */ import net.ltxprogrammer.turned.client.model.ModelSlimeling_remaster_sit;
/*    */ import net.ltxprogrammer.turned.client.model.ModelTSC_Hunter_model;
/*    */ import net.ltxprogrammer.turned.client.model.Modelbee_hertx_sit_model;
/*    */ import net.ltxprogrammer.turned.client.model.Modeldark_latex_fox_scientist;
/*    */ import net.ltxprogrammer.turned.client.model.Modeldark_latex_model;
/*    */ import net.ltxprogrammer.turned.client.model.Modeltsc_drone_model;
/*    */ import net.ltxprogrammer.turned.client.model.Modeltsc_outsider_model;
/*    */ import net.minecraft.client.model.HumanoidModel;
/*    */ import net.minecraft.client.model.geom.builders.LayerDefinition;
/*    */ import net.minecraftforge.client.event.EntityRenderersEvent;
/*    */ 
/*    */ @EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
/*    */ public class LatexModModels {
/* 23 */   public static ModelLayerLocation HUMANOID = new ModelLayerLocation(LatexMod.modResource("humanoid"), "main");
/*    */   
/*    */   @SubscribeEvent
/*    */   public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
/* 27 */     event.registerLayerDefinition(HUMANOID, () -> LayerDefinition.m_171565_(HumanoidModel.m_170681_(CubeDeformation.f_171458_, 0.0F), 64, 32));
/*    */     
/* 29 */     event.registerLayerDefinition(Modeldark_latex_snek_model.LAYER_LOCATION, Modeldark_latex_snek_model::createBodyLayer);
/* 30 */     event.registerLayerDefinition(ModelTSC_Hunter_model.LAYER_LOCATION, ModelTSC_Hunter_model::createBodyLayer);
/* 31 */     event.registerLayerDefinition(Modeldrop_pod.LAYER_LOCATION, Modeldrop_pod::createBodyLayer);
/* 32 */     event.registerLayerDefinition(Modelhertx_model_wait_s1.LAYER_LOCATION, Modelhertx_model_wait_s1::createBodyLayer);
/* 33 */     event.registerLayerDefinition(Modelhertx_model.LAYER_LOCATION, Modelhertx_model::createBodyLayer);
/* 34 */     event.registerLayerDefinition(ModelRoomba.LAYER_LOCATION, ModelRoomba::createBodyLayer);
/* 35 */     event.registerLayerDefinition(ModelSlimeling_tamed_remaster.LAYER_LOCATION, ModelSlimeling_tamed_remaster::createBodyLayer);
/* 36 */     event.registerLayerDefinition(Modelnxt_hertx_sit_model.LAYER_LOCATION, Modelnxt_hertx_sit_model::createBodyLayer);
/* 37 */     event.registerLayerDefinition(Modelbee_hertx_model.LAYER_LOCATION, Modelbee_hertx_model::createBodyLayer);
/* 38 */     event.registerLayerDefinition(ModelArmed_Drone_Hertx_Rest.LAYER_LOCATION, ModelArmed_Drone_Hertx_Rest::createBodyLayer);
/* 39 */     event.registerLayerDefinition(Modelhertx_model_fb_sit.LAYER_LOCATION, Modelhertx_model_fb_sit::createBodyLayer);
/* 40 */     event.registerLayerDefinition(ModelProtector_remaster_sit.LAYER_LOCATION, ModelProtector_remaster_sit::createBodyLayer);
/* 41 */     event.registerLayerDefinition(Modeldark_latex_cake_model.LAYER_LOCATION, Modeldark_latex_cake_model::createBodyLayer);
/* 42 */     event.registerLayerDefinition(Modella_4_tankmorph_model_m.LAYER_LOCATION, Modella_4_tankmorph_model_m::createBodyLayer);
/* 43 */     event.registerLayerDefinition(Modeltsc_outsider_model.LAYER_LOCATION, Modeltsc_outsider_model::createBodyLayer);
/* 44 */     event.registerLayerDefinition(ModelSlimeling_remaster_sit.LAYER_LOCATION, ModelSlimeling_remaster_sit::createBodyLayer);
/* 45 */     event.registerLayerDefinition(ModelScientific_Drop_Pod.LAYER_LOCATION, ModelScientific_Drop_Pod::createBodyLayer);
/* 46 */     event.registerLayerDefinition(ModelAHV_hertx_sit_model.LAYER_LOCATION, ModelAHV_hertx_sit_model::createBodyLayer);
/* 47 */     event.registerLayerDefinition(Modelhertx_model_f.LAYER_LOCATION, Modelhertx_model_f::createBodyLayer);
/* 48 */     event.registerLayerDefinition(Modeldark_latex_cone_model.LAYER_LOCATION, Modeldark_latex_cone_model::createBodyLayer);
/* 49 */     event.registerLayerDefinition(Modeltsc_berserk_model.LAYER_LOCATION, Modeltsc_berserk_model::createBodyLayer);
/* 50 */     event.registerLayerDefinition(ModelDrone_Hertx.LAYER_LOCATION, ModelDrone_Hertx::createBodyLayer);
/* 51 */     event.registerLayerDefinition(ModelDrone_Hertx_Sit.LAYER_LOCATION, ModelDrone_Hertx_Sit::createBodyLayer);
/* 52 */     event.registerLayerDefinition(Modelhertx_ashbury_model.LAYER_LOCATION, Modelhertx_ashbury_model::createBodyLayer);
/* 53 */     event.registerLayerDefinition(Modella_4_tankmorph_model_r.LAYER_LOCATION, Modella_4_tankmorph_model_r::createBodyLayer);
/* 54 */     event.registerLayerDefinition(ModelDark_latex_snep.LAYER_LOCATION, ModelDark_latex_snep::createBodyLayer);
/* 55 */     event.registerLayerDefinition(Modeldark_latex_model.LAYER_LOCATION, Modeldark_latex_model::createBodyLayer);
/* 56 */     event.registerLayerDefinition(ModelDark_latex_squid_dog.LAYER_LOCATION, ModelDark_latex_squid_dog::createBodyLayer);
/* 57 */     event.registerLayerDefinition(ModelProtector_remaster.LAYER_LOCATION, ModelProtector_remaster::createBodyLayer);
/* 58 */     event.registerLayerDefinition(Modelhertx_ashbury_sit_model.LAYER_LOCATION, Modelhertx_ashbury_sit_model::createBodyLayer);
/* 59 */     event.registerLayerDefinition(Modelhertx_model_fb.LAYER_LOCATION, Modelhertx_model_fb::createBodyLayer);
/* 60 */     event.registerLayerDefinition(ModelSlimeling_remaster.LAYER_LOCATION, ModelSlimeling_remaster::createBodyLayer);
/* 61 */     event.registerLayerDefinition(ModelDark_latex_fox.LAYER_LOCATION, ModelDark_latex_fox::createBodyLayer);
/* 62 */     event.registerLayerDefinition(Modeldark_latex_fox_sniper.LAYER_LOCATION, Modeldark_latex_fox_sniper::createBodyLayer);
/* 63 */     event.registerLayerDefinition(Modeldark_latex_fox_scientist.LAYER_LOCATION, Modeldark_latex_fox_scientist::createBodyLayer);
/* 64 */     event.registerLayerDefinition(Modelhertx_model_s1.LAYER_LOCATION, Modelhertx_model_s1::createBodyLayer);
/* 65 */     event.registerLayerDefinition(Modeldark_latex_shark.LAYER_LOCATION, Modeldark_latex_shark::createBodyLayer);
/* 66 */     event.registerLayerDefinition(ModelLatex_Drop_Pod.LAYER_LOCATION, ModelLatex_Drop_Pod::createBodyLayer);
/* 67 */     event.registerLayerDefinition(Modelspider_latex_model.LAYER_LOCATION, Modelspider_latex_model::createBodyLayer);
/* 68 */     event.registerLayerDefinition(ModelDark_latex_bee.LAYER_LOCATION, ModelDark_latex_bee::createBodyLayer);
/* 69 */     event.registerLayerDefinition(ModelDL_Queen_Bee.LAYER_LOCATION, ModelDL_Queen_Bee::createBodyLayer);
/* 70 */     event.registerLayerDefinition(Modeldl_slug_model.LAYER_LOCATION, Modeldl_slug_model::createBodyLayer);
/* 71 */     event.registerLayerDefinition(ModelDark_Latex_Centaur_Model.LAYER_LOCATION, ModelDark_Latex_Centaur_Model::createBodyLayer);
/* 72 */     event.registerLayerDefinition(Modeltsc_outsider_ranged_model.LAYER_LOCATION, Modeltsc_outsider_ranged_model::createBodyLayer);
/* 73 */     event.registerLayerDefinition(ModelDark_latex_creeper.LAYER_LOCATION, ModelDark_latex_creeper::createBodyLayer);
/* 74 */     event.registerLayerDefinition(Modeltsc_drone_model.LAYER_LOCATION, Modeltsc_drone_model::createBodyLayer);
/* 75 */     event.registerLayerDefinition(ModelMilitary_Drone_Hertx.LAYER_LOCATION, ModelMilitary_Drone_Hertx::createBodyLayer);
/* 76 */     event.registerLayerDefinition(ModelDark_latex_creeper_enhanced.LAYER_LOCATION, ModelDark_latex_creeper_enhanced::createBodyLayer);
/* 77 */     event.registerLayerDefinition(Modelqueen_spider_latex_model.LAYER_LOCATION, Modelqueen_spider_latex_model::createBodyLayer);
/* 78 */     event.registerLayerDefinition(ModelAHV_hertx_model.LAYER_LOCATION, ModelAHV_hertx_model::createBodyLayer);
/* 79 */     event.registerLayerDefinition(Modelbee_hertx_sit_model.LAYER_LOCATION, Modelbee_hertx_sit_model::createBodyLayer);
/* 80 */     event.registerLayerDefinition(Modeldl_moth_model.LAYER_LOCATION, Modeldl_moth_model::createBodyLayer);
/* 81 */     event.registerLayerDefinition(Modeldark_latex_skeleton_model.LAYER_LOCATION, Modeldark_latex_skeleton_model::createBodyLayer);
/* 82 */     event.registerLayerDefinition(Modelhertx_model_sit.LAYER_LOCATION, Modelhertx_model_sit::createBodyLayer);
/* 83 */     event.registerLayerDefinition(Modeldark_latex_noise_stalker.LAYER_LOCATION, Modeldark_latex_noise_stalker::createBodyLayer);
/* 84 */     event.registerLayerDefinition(Modelhertx_sit_model_f.LAYER_LOCATION, Modelhertx_sit_model_f::createBodyLayer);
/* 85 */     event.registerLayerDefinition(Modelnxt_hertx_model.LAYER_LOCATION, Modelnxt_hertx_model::createBodyLayer);
/*    */     
/* 87 */     event.registerLayerDefinition(ArmorNoneModel.INNER_ARMOR, () -> ArmorNoneModel.createArmorLayer(ArmorModel.INNER));
/* 88 */     event.registerLayerDefinition(ArmorNoneModel.OUTER_ARMOR, () -> ArmorNoneModel.createArmorLayer(ArmorModel.OUTER));
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\init\LatexModModels.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */