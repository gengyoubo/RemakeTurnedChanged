package net.mcreator.latexes.client.gui;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import java.util.HashMap;
import net.mcreator.latexes.world.inventory.SmallboxguiMenu;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/client/gui/SmallboxguiScreen.class */
public class SmallboxguiScreen extends AbstractContainerScreen<SmallboxguiMenu> {
    private final Level world;
    private final int x;
    private final int y;
    private final int z;
    private final Player entity;
    private static final HashMap<String, Object> guistate = SmallboxguiMenu.guistate;
    private static final ResourceLocation texture = new ResourceLocation("latex:textures/screens/smallboxgui.png");

    public SmallboxguiScreen(SmallboxguiMenu container, Inventory inventory, Component text) {
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
        renderBackground(ms);
        render(ms, mouseX, mouseY, partialTicks);
        renderTooltip(ms, mouseX, mouseY);
    }

    protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
        RenderSystem.setShaderColor(1.0f, 1.0f, 1.0f, 1.0f);
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.setShaderTexture(0, texture);
        blit(ms, this.leftPos, this.topPos, 0.0f, 0.0f, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
        RenderSystem.disableBlend();
    }

    public boolean keyPressed(int key, int b, int c) {
        if (key != 256) {
            return keyPressed(key, b, c);
        }
        this.minecraft.player.closeContainer();
        return true;
    }

    public void containerTick() {
        containerTick();
    }

    protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
    }

    public void onClose() {
        onClose();
        Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
    }

    public void init() {
        init();
        this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
    }
}
