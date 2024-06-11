/*    */ package net.mcreator.latexes.init;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import net.mcreator.latexes.world.inventory.BoxguiMenu;
/*    */ import net.mcreator.latexes.world.inventory.CrateguiMenu;
/*    */ import net.mcreator.latexes.world.inventory.LockerGUIMenu;
/*    */ import net.mcreator.latexes.world.inventory.SmallboxguiMenu;
/*    */ import net.mcreator.latexes.world.inventory.SupplyCrateGuiMenu;
/*    */ import net.minecraft.network.FriendlyByteBuf;
/*    */ import net.minecraft.world.entity.player.Inventory;
/*    */ import net.minecraft.world.inventory.MenuType;
/*    */ import net.minecraftforge.event.RegistryEvent;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ import net.minecraftforge.fml.common.Mod;
/*    */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*    */ import net.minecraftforge.network.IContainerFactory;
/*    */ import net.minecraftforge.registries.IForgeRegistryEntry;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
/*    */ public class LatexModMenus
/*    */ {
/* 26 */   private static final List<MenuType<?>> REGISTRY = new ArrayList<>(); public static final MenuType<BoxguiMenu> BOXGUI; public static final MenuType<LockerGUIMenu> LOCKER_GUI; static {
/* 27 */     BOXGUI = register("boxgui", (id, inv, extraData) -> new BoxguiMenu(id, inv, extraData));
/* 28 */     LOCKER_GUI = register("locker_gui", (id, inv, extraData) -> new LockerGUIMenu(id, inv, extraData));
/* 29 */     CRATEGUI = register("crategui", (id, inv, extraData) -> new CrateguiMenu(id, inv, extraData));
/* 30 */     SUPPLY_CRATE_GUI = register("supply_crate_gui", (id, inv, extraData) -> new SupplyCrateGuiMenu(id, inv, extraData));
/*    */     
/* 32 */     SMALLBOXGUI = register("smallboxgui", (id, inv, extraData) -> new SmallboxguiMenu(id, inv, extraData));
/*    */   }
/*    */   public static final MenuType<CrateguiMenu> CRATEGUI; public static final MenuType<SupplyCrateGuiMenu> SUPPLY_CRATE_GUI; public static final MenuType<SmallboxguiMenu> SMALLBOXGUI;
/*    */   private static <T extends net.minecraft.world.inventory.AbstractContainerMenu> MenuType<T> register(String registryname, IContainerFactory<T> containerFactory) {
/* 36 */     MenuType<T> menuType = new MenuType((MenuType.MenuSupplier)containerFactory);
/* 37 */     menuType.setRegistryName(registryname);
/* 38 */     REGISTRY.add(menuType);
/* 39 */     return menuType;
/*    */   }
/*    */   
/*    */   @SubscribeEvent
/*    */   public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
/* 44 */     event.getRegistry().registerAll((IForgeRegistryEntry[])REGISTRY.<MenuType>toArray(new MenuType[0]));
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\init\LatexModMenus.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */