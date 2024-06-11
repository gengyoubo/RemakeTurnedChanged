/*    */ package net.mcreator.latexes.client.gui;
/*    */ 
/*    */ import com.mojang.blaze3d.systems.RenderSystem;
/*    */ import com.mojang.blaze3d.vertex.PoseStack;
/*    */ import java.util.HashMap;
/*    */ import net.mcreator.latexes.world.inventory.BoxguiMenu;
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
/*    */ public class BoxguiScreen
/*    */   extends AbstractContainerScreen<BoxguiMenu>
/*    */ {
/* 20 */   private static final HashMap<String, Object> guistate = BoxguiMenu.guistate;
/*    */   
/*    */   private final Level world;
/*    */   private final int x;
/*    */   
/*    */   public BoxguiScreen(BoxguiMenu container, Inventory inventory, Component text) {
/* 26 */     super((AbstractContainerMenu)container, inventory, text);
/* 27 */     this.world = container.world;
/* 28 */     this.x = container.x;
/* 29 */     this.y = container.y;
/* 30 */     this.z = container.z;
/* 31 */     this.entity = container.entity;
/* 32 */     this.imageWidth = 176;
/* 33 */     this.imageHeight = 166;
/*    */   }
/*    */   private final int y; private final int z; private final Player entity;
/* 36 */   private static final ResourceLocation texture = new ResourceLocation("latex:textures/screens/boxgui.png");
/*    */ 
/*    */   
/*    */   public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
/* 40 */     renderBackground(ms);
/* 41 */     super.render(ms, mouseX, mouseY, partialTicks);
/* 42 */     renderTooltip(ms, mouseX, mouseY);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
/* 47 */     RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
/* 48 */     RenderSystem.enableBlend();
/* 49 */     RenderSystem.defaultBlendFunc();
/* 50 */     RenderSystem.setShaderTexture(0, texture);
/* 51 */     this; blit(ms, this.leftPos, this.topPos, 0.0F, 0.0F, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
/* 52 */     RenderSystem.disableBlend();
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean keyPressed(int key, int b, int c) {
/* 57 */     if (key == 256) {
/* 58 */       this.minecraft.player.closeContainer();
/* 59 */       return true;
/*    */     } 
/* 61 */     return super.keyPressed(key, b, c);
/*    */   }
/*    */ 
/*    */   
/*    */   public void containerTick() {
/* 66 */     super.containerTick();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {}
/*    */ 
/*    */   
/*    */   public void onClose() {
/* 75 */     super.onClose();
/* 76 */     (Minecraft.getInstance()).keyboardHandler.setSendRepeatsToGui(false);
/*    */   }
/*    */ 
/*    */   
/*    */   public void init() {
/* 81 */     super.init();
/* 82 */     this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\client\gui\BoxguiScreen.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */