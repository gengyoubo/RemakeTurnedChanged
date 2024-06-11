/*    */ package net.ltxprogrammer.turned.item;
/*    */ 
/*    */ import net.ltxprogrammer.turned.init.LatexModSounds;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.sounds.SoundEvent;
/*    */ import net.minecraft.world.item.CreativeModeTab;
/*    */ import net.minecraft.world.item.Item;
/*    */ import net.minecraft.world.item.Rarity;
/*    */ import net.minecraft.world.item.RecordItem;
/*    */ 
/*    */ public class ArmageddonItem
/*    */   extends RecordItem {
/*    */   public ArmageddonItem() {
/* 14 */     super(0, (SoundEvent)LatexModSounds.REGISTRY.get(new ResourceLocation("turned:armageddon")), (new Item.Properties())
/* 15 */         .m_41491_(CreativeModeTab.f_40753_).m_41487_(1).m_41497_(Rarity.RARE));
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\item\ArmageddonItem.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */