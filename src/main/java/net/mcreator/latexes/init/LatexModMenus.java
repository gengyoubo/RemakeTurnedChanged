//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.mcreator.latexes.init;

import java.util.ArrayList;
import java.util.List;
import net.mcreator.latexes.world.inventory.BoxguiMenu;
import net.mcreator.latexes.world.inventory.CrateguiMenu;
import net.mcreator.latexes.world.inventory.LockerGUIMenu;
import net.mcreator.latexes.world.inventory.SmallboxguiMenu;
import net.mcreator.latexes.world.inventory.SupplyCrateGuiMenu;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.network.IContainerFactory;

@EventBusSubscriber(
        bus = Bus.MOD
)
public class LatexModMenus {
    private static final List<MenuType<?>> REGISTRY = new ArrayList();
    public static final MenuType<BoxguiMenu> BOXGUI = register("boxgui", (id, inv, extraData) -> {
        return new BoxguiMenu(id, inv, extraData);
    });
    public static final MenuType<LockerGUIMenu> LOCKER_GUI = register("locker_gui", (id, inv, extraData) -> {
        return new LockerGUIMenu(id, inv, extraData);
    });
    public static final MenuType<CrateguiMenu> CRATEGUI = register("crategui", (id, inv, extraData) -> {
        return new CrateguiMenu(id, inv, extraData);
    });
    public static final MenuType<SupplyCrateGuiMenu> SUPPLY_CRATE_GUI = register("supply_crate_gui", (id, inv, extraData) -> {
        return new SupplyCrateGuiMenu(id, inv, extraData);
    });
    public static final MenuType<SmallboxguiMenu> SMALLBOXGUI = register("smallboxgui", (id, inv, extraData) -> {
        return new SmallboxguiMenu(id, inv, extraData);
    });

    public LatexModMenus() {
    }

    private static <T extends AbstractContainerMenu> MenuType<T> register(String registryname, IContainerFactory<T> containerFactory) {
        MenuType<T> menuType = new MenuType(containerFactory);
        menuType.setRegistryName(registryname);
        REGISTRY.add(menuType);
        return menuType;
    }

    @SubscribeEvent
    public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
        event.getRegistry().registerAll((MenuType[])REGISTRY.toArray(new MenuType[0]));
    }
}
