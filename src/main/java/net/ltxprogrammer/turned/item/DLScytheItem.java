/*     */ package net.ltxprogrammer.turned.item;
/*     */ 
/*     */ import com.google.common.collect.ImmutableMultimap;
/*     */ import com.google.common.collect.Multimap;
/*     */ import net.ltxprogrammer.changed.init.ChangedBlocks;
/*     */ import net.ltxprogrammer.changed.init.ChangedItems;
/*     */ import net.ltxprogrammer.turned.init.LatexModTabs;
/*     */ import net.ltxprogrammer.turned.procedures.DLSwordLivingEntityIsHitWithToolProcedure;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.tags.BlockTags;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EquipmentSlot;
/*     */ import net.minecraft.world.entity.LivingEntity;
/*     */ import net.minecraft.world.entity.ai.attributes.Attribute;
/*     */ import net.minecraft.world.entity.ai.attributes.AttributeModifier;
/*     */ import net.minecraft.world.entity.ai.attributes.Attributes;
/*     */ import net.minecraft.world.item.Item;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.item.Tier;
/*     */ import net.minecraft.world.item.TieredItem;
/*     */ import net.minecraft.world.item.crafting.Ingredient;
/*     */ import net.minecraft.world.level.ItemLike;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.block.state.BlockState;
/*     */ import net.minecraftforge.common.ToolAction;
/*     */ import net.minecraftforge.common.ToolActions;
/*     */ 
/*     */ public class DLScytheItem
/*     */   extends TieredItem
/*     */ {
/*     */   public DLScytheItem() {
/*  32 */     super(new Tier() {
/*     */           public int m_6609_() {
/*  34 */             return 225;
/*     */           }
/*     */           
/*     */           public float m_6624_() {
/*  38 */             return 5.5F;
/*     */           }
/*     */           
/*     */           public float m_6631_() {
/*  42 */             return 5.0F;
/*     */           }
/*     */           
/*     */           public int m_6604_() {
/*  46 */             return 2;
/*     */           }
/*     */           
/*     */           public int m_6601_() {
/*  50 */             return 25;
/*     */           }
/*     */           
/*     */           public Ingredient m_6282_() {
/*  54 */             return Ingredient.m_43927_(new ItemStack[] { new ItemStack((ItemLike)ChangedItems.DARK_LATEX_GOO.get()), new ItemStack((ItemLike)ChangedBlocks.DARK_LATEX_BLOCK.get()), new ItemStack((ItemLike)ChangedItems.DARK_LATEX_CRYSTAL_FRAGMENT
/*  55 */                     .get()) }, );
/*     */           }
/*  57 */         },  (new Item.Properties()).m_41491_(LatexModTabs.TAB_LATEXITEMS));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_8096_(BlockState blockstate) {
/*  62 */     int tier = 2;
/*  63 */     if (tier < 3 && blockstate.m_204336_(BlockTags.f_144284_))
/*  64 */       return false; 
/*  65 */     if (tier < 2 && blockstate.m_204336_(BlockTags.f_144285_)) {
/*  66 */       return false;
/*     */     }
/*  68 */     return ((tier >= 1 || !blockstate.m_204336_(BlockTags.f_144286_)) && (blockstate.m_204336_(BlockTags.f_144280_) || blockstate.m_204336_(BlockTags.f_144281_) || blockstate
/*  69 */       .m_204336_(BlockTags.f_144282_) || blockstate.m_204336_(BlockTags.f_144283_)));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean canPerformAction(ItemStack stack, ToolAction toolAction) {
/*  75 */     return (ToolActions.DEFAULT_AXE_ACTIONS.contains(toolAction) || ToolActions.DEFAULT_HOE_ACTIONS.contains(toolAction) || ToolActions.DEFAULT_SHOVEL_ACTIONS
/*  76 */       .contains(toolAction) || ToolActions.DEFAULT_PICKAXE_ACTIONS.contains(toolAction) || ToolActions.DEFAULT_SWORD_ACTIONS
/*  77 */       .contains(toolAction));
/*     */   }
/*     */ 
/*     */   
/*     */   public float m_8102_(ItemStack itemstack, BlockState blockstate) {
/*  82 */     return 5.5F;
/*     */   }
/*     */ 
/*     */   
/*     */   public Multimap<Attribute, AttributeModifier> m_7167_(EquipmentSlot equipmentSlot) {
/*  87 */     if (equipmentSlot == EquipmentSlot.MAINHAND) {
/*  88 */       ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
/*  89 */       builder.putAll(super.m_7167_(equipmentSlot));
/*  90 */       builder.put(Attributes.f_22281_, new AttributeModifier(f_41374_, "Tool modifier", 5.0D, AttributeModifier.Operation.ADDITION));
/*     */       
/*  92 */       builder.put(Attributes.f_22283_, new AttributeModifier(f_41375_, "Tool modifier", -3.4D, AttributeModifier.Operation.ADDITION));
/*     */       
/*  94 */       return (Multimap<Attribute, AttributeModifier>)builder.build();
/*     */     } 
/*  96 */     return super.m_7167_(equipmentSlot);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6813_(ItemStack itemstack, Level world, BlockState blockstate, BlockPos pos, LivingEntity entity) {
/* 101 */     itemstack.m_41622_(1, entity, i -> i.m_21166_(EquipmentSlot.MAINHAND));
/* 102 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_7579_(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
/* 107 */     itemstack.m_41622_(2, entity, i -> i.m_21166_(EquipmentSlot.MAINHAND));
/* 108 */     DLSwordLivingEntityIsHitWithToolProcedure.execute((Entity)entity);
/* 109 */     return true;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\item\DLScytheItem.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */