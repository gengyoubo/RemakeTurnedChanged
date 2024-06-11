/*    */ package net.mcreator.latexes.procedures;
/*    */ 
/*    */ import net.minecraft.core.Registry;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.tags.TagKey;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ 
/*    */ public class CheckentityishertxProcedure {
/*    */   public static boolean execute(Entity entity) {
/* 10 */     if (entity == null)
/* 11 */       return false; 
/* 12 */     return (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("latex:hertx"))) == true);
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\CheckentityishertxProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */