/*     */ package net.mcreator.latexes.init;
/*     */ 
/*     */ import net.mcreator.latexes.client.model.ModelAHV_hertx_model;
/*     */ import net.mcreator.latexes.client.model.ModelAHV_hertx_sit_model;
/*     */ import net.mcreator.latexes.client.model.ModelArmed_Drone_Hertx_Rest;
/*     */ import net.mcreator.latexes.client.model.ModelDL_Queen_Bee;
/*     */ import net.mcreator.latexes.client.model.ModelDark_Latex_Centaur_Model;
/*     */ import net.mcreator.latexes.client.model.ModelDark_latex_bee;
/*     */ import net.mcreator.latexes.client.model.ModelDark_latex_creeper;
/*     */ import net.mcreator.latexes.client.model.ModelDark_latex_creeper_enhanced;
/*     */ import net.mcreator.latexes.client.model.ModelDark_latex_fox;
/*     */ import net.mcreator.latexes.client.model.ModelDark_latex_snep;
/*     */ import net.mcreator.latexes.client.model.ModelDrone_Hertx;
/*     */ import net.mcreator.latexes.client.model.ModelDrone_Hertx_Sit;
/*     */ import net.mcreator.latexes.client.model.ModelLatex_Drop_Pod;
/*     */ import net.mcreator.latexes.client.model.ModelMilitary_Drone_Hertx;
/*     */ import net.mcreator.latexes.client.model.ModelProtector_remaster;
/*     */ import net.mcreator.latexes.client.model.ModelProtector_remaster_sit;
/*     */ import net.mcreator.latexes.client.model.ModelRoomba;
/*     */ import net.mcreator.latexes.client.model.ModelScientific_Drop_Pod;
/*     */ import net.mcreator.latexes.client.model.ModelSlimeling_remaster;
/*     */ import net.mcreator.latexes.client.model.ModelSlimeling_remaster_sit;
/*     */ import net.mcreator.latexes.client.model.ModelSlimeling_tamed_remaster;
/*     */ import net.mcreator.latexes.client.model.ModelTSC_Hunter_model;
/*     */ import net.mcreator.latexes.client.model.Modelbee_hertx_model;
/*     */ import net.mcreator.latexes.client.model.Modelbee_hertx_sit_model;
/*     */ import net.mcreator.latexes.client.model.Modeldark_latex_cake_model;
/*     */ import net.mcreator.latexes.client.model.Modeldark_latex_cone_model;
/*     */ import net.mcreator.latexes.client.model.Modeldark_latex_model;
/*     */ import net.mcreator.latexes.client.model.Modeldark_latex_noise_stalker;
/*     */ import net.mcreator.latexes.client.model.Modeldark_latex_shark;
/*     */ import net.mcreator.latexes.client.model.Modeldark_latex_skeleton_model;
/*     */ import net.mcreator.latexes.client.model.Modeldark_latex_snek_model;
/*     */ import net.mcreator.latexes.client.model.Modeldark_latex_squiddog_model;
/*     */ import net.mcreator.latexes.client.model.Modeldark_latex_yufeng_model;
/*     */ import net.mcreator.latexes.client.model.Modeldl_dragon_model;
/*     */ import net.mcreator.latexes.client.model.Modeldl_moth_model;
/*     */ import net.mcreator.latexes.client.model.Modeldl_slug_model;
/*     */ import net.mcreator.latexes.client.model.Modeldrop_pod;
/*     */ import net.mcreator.latexes.client.model.Modelhertx_ashbury_model;
/*     */ import net.mcreator.latexes.client.model.Modelhertx_ashbury_sit_model;
/*     */ import net.mcreator.latexes.client.model.Modelhertx_model;
/*     */ import net.mcreator.latexes.client.model.Modelhertx_model_f;
/*     */ import net.mcreator.latexes.client.model.Modelhertx_model_fb;
/*     */ import net.mcreator.latexes.client.model.Modelhertx_model_fb_sit;
/*     */ import net.mcreator.latexes.client.model.Modelhertx_model_s1;
/*     */ import net.mcreator.latexes.client.model.Modelhertx_model_sit;
/*     */ import net.mcreator.latexes.client.model.Modelhertx_model_wait_s1;
/*     */ import net.mcreator.latexes.client.model.Modelhertx_sit_model_f;
/*     */ import net.mcreator.latexes.client.model.Modella_4_tankmorph_model_m;
/*     */ import net.mcreator.latexes.client.model.Modella_4_tankmorph_model_r;
/*     */ import net.mcreator.latexes.client.model.Modelnxt_hertx_model;
/*     */ import net.mcreator.latexes.client.model.Modelnxt_hertx_sit_model;
/*     */ import net.mcreator.latexes.client.model.Modelqueen_spider_latex_model;
/*     */ import net.mcreator.latexes.client.model.Modelspider_latex_model;
/*     */ import net.mcreator.latexes.client.model.Modeltsc_berserk_model;
/*     */ import net.mcreator.latexes.client.model.Modeltsc_drone_model;
/*     */ import net.mcreator.latexes.client.model.Modeltsc_outsider_model;
/*     */ import net.mcreator.latexes.client.model.Modeltsc_outsider_ranged_model;
/*     */ import net.minecraftforge.api.distmarker.Dist;
/*     */ import net.minecraftforge.client.event.EntityRenderersEvent;
/*     */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*     */ import net.minecraftforge.fml.common.Mod;
/*     */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
/*     */ public class LatexModModels
/*     */ {
/*     */   @SubscribeEvent
/*     */   public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
/*  74 */     event.registerLayerDefinition(Modeldark_latex_snek_model.LAYER_LOCATION, Modeldark_latex_snek_model::createBodyLayer);
/*  75 */     event.registerLayerDefinition(ModelTSC_Hunter_model.LAYER_LOCATION, ModelTSC_Hunter_model::createBodyLayer);
/*  76 */     event.registerLayerDefinition(Modeldrop_pod.LAYER_LOCATION, Modeldrop_pod::createBodyLayer);
/*  77 */     event.registerLayerDefinition(Modelhertx_model_wait_s1.LAYER_LOCATION, Modelhertx_model_wait_s1::createBodyLayer);
/*  78 */     event.registerLayerDefinition(Modelhertx_model.LAYER_LOCATION, Modelhertx_model::createBodyLayer);
/*  79 */     event.registerLayerDefinition(ModelRoomba.LAYER_LOCATION, ModelRoomba::createBodyLayer);
/*  80 */     event.registerLayerDefinition(ModelSlimeling_tamed_remaster.LAYER_LOCATION, ModelSlimeling_tamed_remaster::createBodyLayer);
/*  81 */     event.registerLayerDefinition(Modelnxt_hertx_sit_model.LAYER_LOCATION, Modelnxt_hertx_sit_model::createBodyLayer);
/*  82 */     event.registerLayerDefinition(Modelbee_hertx_model.LAYER_LOCATION, Modelbee_hertx_model::createBodyLayer);
/*  83 */     event.registerLayerDefinition(ModelArmed_Drone_Hertx_Rest.LAYER_LOCATION, ModelArmed_Drone_Hertx_Rest::createBodyLayer);
/*  84 */     event.registerLayerDefinition(Modelhertx_model_fb_sit.LAYER_LOCATION, Modelhertx_model_fb_sit::createBodyLayer);
/*  85 */     event.registerLayerDefinition(ModelProtector_remaster_sit.LAYER_LOCATION, ModelProtector_remaster_sit::createBodyLayer);
/*  86 */     event.registerLayerDefinition(Modeldark_latex_cake_model.LAYER_LOCATION, Modeldark_latex_cake_model::createBodyLayer);
/*  87 */     event.registerLayerDefinition(Modella_4_tankmorph_model_m.LAYER_LOCATION, Modella_4_tankmorph_model_m::createBodyLayer);
/*  88 */     event.registerLayerDefinition(Modeltsc_outsider_model.LAYER_LOCATION, Modeltsc_outsider_model::createBodyLayer);
/*  89 */     event.registerLayerDefinition(ModelDrone_Hertx.LAYER_LOCATION, ModelDrone_Hertx::createBodyLayer);
/*  90 */     event.registerLayerDefinition(ModelSlimeling_remaster_sit.LAYER_LOCATION, ModelSlimeling_remaster_sit::createBodyLayer);
/*  91 */     event.registerLayerDefinition(ModelScientific_Drop_Pod.LAYER_LOCATION, ModelScientific_Drop_Pod::createBodyLayer);
/*  92 */     event.registerLayerDefinition(ModelAHV_hertx_sit_model.LAYER_LOCATION, ModelAHV_hertx_sit_model::createBodyLayer);
/*  93 */     event.registerLayerDefinition(Modelhertx_model_f.LAYER_LOCATION, Modelhertx_model_f::createBodyLayer);
/*  94 */     event.registerLayerDefinition(Modeldark_latex_cone_model.LAYER_LOCATION, Modeldark_latex_cone_model::createBodyLayer);
/*  95 */     event.registerLayerDefinition(Modeltsc_berserk_model.LAYER_LOCATION, Modeltsc_berserk_model::createBodyLayer);
/*  96 */     event.registerLayerDefinition(ModelDrone_Hertx_Sit.LAYER_LOCATION, ModelDrone_Hertx_Sit::createBodyLayer);
/*  97 */     event.registerLayerDefinition(Modelhertx_ashbury_model.LAYER_LOCATION, Modelhertx_ashbury_model::createBodyLayer);
/*  98 */     event.registerLayerDefinition(Modeldark_latex_squiddog_model.LAYER_LOCATION, Modeldark_latex_squiddog_model::createBodyLayer);
/*  99 */     event.registerLayerDefinition(Modella_4_tankmorph_model_r.LAYER_LOCATION, Modella_4_tankmorph_model_r::createBodyLayer);
/* 100 */     event.registerLayerDefinition(ModelDark_latex_snep.LAYER_LOCATION, ModelDark_latex_snep::createBodyLayer);
/* 101 */     event.registerLayerDefinition(Modeldark_latex_model.LAYER_LOCATION, Modeldark_latex_model::createBodyLayer);
/* 102 */     event.registerLayerDefinition(ModelProtector_remaster.LAYER_LOCATION, ModelProtector_remaster::createBodyLayer);
/* 103 */     event.registerLayerDefinition(Modelhertx_ashbury_sit_model.LAYER_LOCATION, Modelhertx_ashbury_sit_model::createBodyLayer);
/* 104 */     event.registerLayerDefinition(Modelhertx_model_fb.LAYER_LOCATION, Modelhertx_model_fb::createBodyLayer);
/* 105 */     event.registerLayerDefinition(ModelSlimeling_remaster.LAYER_LOCATION, ModelSlimeling_remaster::createBodyLayer);
/* 106 */     event.registerLayerDefinition(ModelDark_latex_fox.LAYER_LOCATION, ModelDark_latex_fox::createBodyLayer);
/* 107 */     event.registerLayerDefinition(Modelhertx_model_s1.LAYER_LOCATION, Modelhertx_model_s1::createBodyLayer);
/* 108 */     event.registerLayerDefinition(Modeldark_latex_shark.LAYER_LOCATION, Modeldark_latex_shark::createBodyLayer);
/* 109 */     event.registerLayerDefinition(ModelLatex_Drop_Pod.LAYER_LOCATION, ModelLatex_Drop_Pod::createBodyLayer);
/* 110 */     event.registerLayerDefinition(Modelspider_latex_model.LAYER_LOCATION, Modelspider_latex_model::createBodyLayer);
/* 111 */     event.registerLayerDefinition(ModelDark_latex_bee.LAYER_LOCATION, ModelDark_latex_bee::createBodyLayer);
/* 112 */     event.registerLayerDefinition(ModelDL_Queen_Bee.LAYER_LOCATION, ModelDL_Queen_Bee::createBodyLayer);
/* 113 */     event.registerLayerDefinition(Modeldl_slug_model.LAYER_LOCATION, Modeldl_slug_model::createBodyLayer);
/* 114 */     event.registerLayerDefinition(ModelDark_Latex_Centaur_Model.LAYER_LOCATION, ModelDark_Latex_Centaur_Model::createBodyLayer);
/* 115 */     event.registerLayerDefinition(Modeltsc_outsider_ranged_model.LAYER_LOCATION, Modeltsc_outsider_ranged_model::createBodyLayer);
/* 116 */     event.registerLayerDefinition(ModelDark_latex_creeper.LAYER_LOCATION, ModelDark_latex_creeper::createBodyLayer);
/* 117 */     event.registerLayerDefinition(Modeldl_dragon_model.LAYER_LOCATION, Modeldl_dragon_model::createBodyLayer);
/* 118 */     event.registerLayerDefinition(Modeldark_latex_yufeng_model.LAYER_LOCATION, Modeldark_latex_yufeng_model::createBodyLayer);
/* 119 */     event.registerLayerDefinition(Modeltsc_drone_model.LAYER_LOCATION, Modeltsc_drone_model::createBodyLayer);
/* 120 */     event.registerLayerDefinition(ModelMilitary_Drone_Hertx.LAYER_LOCATION, ModelMilitary_Drone_Hertx::createBodyLayer);
/* 121 */     event.registerLayerDefinition(ModelDark_latex_creeper_enhanced.LAYER_LOCATION, ModelDark_latex_creeper_enhanced::createBodyLayer);
/* 122 */     event.registerLayerDefinition(Modelqueen_spider_latex_model.LAYER_LOCATION, Modelqueen_spider_latex_model::createBodyLayer);
/* 123 */     event.registerLayerDefinition(ModelAHV_hertx_model.LAYER_LOCATION, ModelAHV_hertx_model::createBodyLayer);
/* 124 */     event.registerLayerDefinition(Modelbee_hertx_sit_model.LAYER_LOCATION, Modelbee_hertx_sit_model::createBodyLayer);
/* 125 */     event.registerLayerDefinition(Modeldl_moth_model.LAYER_LOCATION, Modeldl_moth_model::createBodyLayer);
/* 126 */     event.registerLayerDefinition(Modeldark_latex_skeleton_model.LAYER_LOCATION, Modeldark_latex_skeleton_model::createBodyLayer);
/* 127 */     event.registerLayerDefinition(Modelhertx_model_sit.LAYER_LOCATION, Modelhertx_model_sit::createBodyLayer);
/* 128 */     event.registerLayerDefinition(Modeldark_latex_noise_stalker.LAYER_LOCATION, Modeldark_latex_noise_stalker::createBodyLayer);
/* 129 */     event.registerLayerDefinition(Modelhertx_sit_model_f.LAYER_LOCATION, Modelhertx_sit_model_f::createBodyLayer);
/* 130 */     event.registerLayerDefinition(Modelnxt_hertx_model.LAYER_LOCATION, Modelnxt_hertx_model::createBodyLayer);
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\init\LatexModModels.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */