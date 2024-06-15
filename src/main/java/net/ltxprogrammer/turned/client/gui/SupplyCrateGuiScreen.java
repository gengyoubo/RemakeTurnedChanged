//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.ltxprogrammer.turned.client.gui;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import java.util.HashMap;
import net.ltxprogrammer.turned.world.inventory.SupplyCrateGuiMenu;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

public class SupplyCrateGuiScreen extends AbstractContainerScreen<SupplyCrateGuiMenu> {
    private static final HashMap<String, Object> guistate;
    private final Level world;
    private final int x;
    private final int y;
    private final int z;
    private final Player entity;
    private static final ResourceLocation texture;

    public SupplyCrateGuiScreen(SupplyCrateGuiMenu container, Inventory inventory, Component text) {
        super(container, inventory, text);
        this.world = container.world;
        this.x = container.x;
        this.y = container.y;
        this.z = container.z;
        this.entity = container.entity;
        this.imageWidth = 176;
        this.imageHeight = 166;
    }

    public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
        this.renderBackground(ms);
        super.render(ms, mouseX, mouseY, partialTicks);
        this.renderTooltip(ms, mouseX, mouseY);
    }

    protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.setShaderTexture(0, texture);
        blit(ms, this.leftPos, this.topPos, 0.0F, 0.0F, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
        RenderSystem.disableBlend();
    }

    public boolean keyPressed(int key, int b, int c) {
        if (key == 256) {
            this.minecraft.player.closeContainer();
            return true;
        } else {
            return super.keyPressed(key, b, c);
        }
    }

    public void containerTick() {
        super.containerTick();
    }

    protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
    }

    public void onClose() {
        super.onClose();
        Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
    }

    public void init() {
        super.init();
        this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
    }

    static {
        guistate = SupplyCrateGuiMenu.guistate;
        texture = new ResourceLocation("turned:textures/screens/supply_crate_gui.png");
    }
}
