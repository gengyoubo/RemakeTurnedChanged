/*     */ package net.ltxprogrammer.turned.block;
/*     */ 
/*     */ import io.netty.buffer.Unpooled;
/*     */ import net.ltxprogrammer.turned.world.inventory.SmallboxguiMenu;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.network.FriendlyByteBuf;
/*     */ import net.minecraft.network.chat.Component;
/*     */ import net.minecraft.network.chat.TextComponent;
/*     */ import net.minecraft.world.MenuProvider;
/*     */ import net.minecraft.world.entity.player.Inventory;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.inventory.AbstractContainerMenu;
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
/*     */ class null
/*     */   implements MenuProvider
/*     */ {
/*     */   public Component m_5446_() {
/* 133 */     return (Component)new TextComponent("Small Box");
/*     */   }
/*     */ 
/*     */   
/*     */   public AbstractContainerMenu m_7208_(int id, Inventory inventory, Player player) {
/* 138 */     return (AbstractContainerMenu)new SmallboxguiMenu(id, inventory, (new FriendlyByteBuf(Unpooled.buffer())).m_130064_(pos));
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\block\SmallBoxBlock$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */