package net.ltxprogrammer.turned.client.gui;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import java.util.HashMap;
import java.util.Objects;

import net.ltxprogrammer.turned.world.inventory.SupplyCrateGuiMenu;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/gui/SupplyCrateGuiScreen.class */
public class SupplyCrateGuiScreen extends AbstractContainerScreen<SupplyCrateGuiMenu> {

    private static final HashMap<String, Object> guistate = SupplyCrateGuiMenu.guistate;
    private static final ResourceLocation texture = new ResourceLocation("turned:textures/screens/supply_crate_gui.png");

    public SupplyCrateGuiScreen(SupplyCrateGuiMenu container, Inventory inventory, Component text) {
        super(container, inventory, text);
        Level world = container.world;
        /* renamed from: x */
        int f12x = container.f27x;
        /* renamed from: y */
        int f13y = container.f28y;
        /* renamed from: z */
        int f14z = container.f29z;
        Player entity = container.entity;
        this.imageWidth = 176;
        this.imageHeight = 166;
    }

    public void render(@NotNull PoseStack ms, int mouseX, int mouseY, float partialTicks) {
        renderBackground(ms);
        render(ms, mouseX, mouseY, partialTicks);
        renderTooltip(ms, mouseX, mouseY);
    }

    protected void renderBg(@NotNull PoseStack ms, float partialTicks, int gx, int gy) {
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
        Objects.requireNonNull(this.minecraft.player).closeContainer();
        return true;
    }

    public void containerTick() {
        containerTick();
    }

    protected void renderLabels(@NotNull PoseStack poseStack, int mouseX, int mouseY) {
    }

    public void onClose() {
        onClose();
        Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
    }

    public void init() {
        init();
        Objects.requireNonNull(this.minecraft).keyboardHandler.setSendRepeatsToGui(true);
    }
}
