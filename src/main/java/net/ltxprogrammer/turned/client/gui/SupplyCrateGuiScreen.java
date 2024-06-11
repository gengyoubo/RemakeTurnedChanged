/*    */ package net.ltxprogrammer.turned.client.gui;
/*    */ 
/*    */ import com.mojang.blaze3d.systems.RenderSystem;
/*    */ import com.mojang.blaze3d.vertex.PoseStack;
/*    */ import java.util.HashMap;
/*    */ import net.ltxprogrammer.turned.world.inventory.SupplyCrateGuiMenu;
/*    */ import net.minecraft.client.Minecraft;
/*    */ import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
/*    */ import net.minecraft.network.chat.Component;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.entity.player.Inventory;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.inventory.AbstractContainerMenu;
/*    */ import net.minecraft.world.level.Level;
/*    */ 
/*    */ 
/*    */ public class SupplyCrateGuiScreen
/*    */   extends AbstractContainerScreen<SupplyCrateGuiMenu>
/*    */ {
/* 20 */   private static final HashMap<String, Object> guistate = SupplyCrateGuiMenu.guistate;
/*    */   
/*    */   private final Level world;
/*    */   private final int x;
/*    */   
/*    */   public SupplyCrateGuiScreen(SupplyCrateGuiMenu container, Inventory inventory, Component text) {
/* 26 */     super((AbstractContainerMenu)container, inventory, text);
/* 27 */     this.world = container.world;
/* 28 */     this.x = container.x;
/* 29 */     this.y = container.y;
/* 30 */     this.z = container.z;
/* 31 */     this.entity = container.entity;
/* 32 */     this.f_97726_ = 176;
/* 33 */     this.f_97727_ = 166;
/*    */   }
/*    */   private final int y; private final int z; private final Player entity;
/* 36 */   private static final ResourceLocation texture = new ResourceLocation("turned:textures/screens/supply_crate_gui.png");
/*    */ 
/*    */   
/*    */   public void m_6305_(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
/* 40 */     m_7333_(ms);
/* 41 */     super.m_6305_(ms, mouseX, mouseY, partialTicks);
/* 42 */     m_7025_(ms, mouseX, mouseY);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void m_7286_(PoseStack ms, float partialTicks, int gx, int gy) {
/* 47 */     RenderSystem.m_157429_(1.0F, 1.0F, 1.0F, 1.0F);
/* 48 */     RenderSystem.m_69478_();
/* 49 */     RenderSystem.m_69453_();
/* 50 */     RenderSystem.m_157456_(0, texture);
/* 51 */     m_93133_(ms, this.f_97735_, this.f_97736_, 0.0F, 0.0F, this.f_97726_, this.f_97727_, this.f_97726_, this.f_97727_);
/* 52 */     RenderSystem.m_69461_();
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean m_7933_(int key, int b, int c) {
/* 57 */     if (key == 256) {
/* 58 */       this.f_96541_.f_91074_.m_6915_();
/* 59 */       return true;
/*    */     } 
/* 61 */     return super.m_7933_(key, b, c);
/*    */   }
/*    */ 
/*    */   
/*    */   public void m_181908_() {
/* 66 */     super.m_181908_();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected void m_7027_(PoseStack poseStack, int mouseX, int mouseY) {}
/*    */ 
/*    */   
/*    */   public void m_7379_() {
/* 75 */     super.m_7379_();
/* 76 */     (Minecraft.m_91087_()).f_91068_.m_90926_(false);
/*    */   }
/*    */ 
/*    */   
/*    */   public void m_7856_() {
/* 81 */     super.m_7856_();
/* 82 */     this.f_96541_.f_91068_.m_90926_(true);
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\client\gui\SupplyCrateGuiScreen.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */