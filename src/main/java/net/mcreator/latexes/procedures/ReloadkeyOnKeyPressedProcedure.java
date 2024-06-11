package net.mcreator.latexes.procedures;

import net.mcreator.latexes.init.LatexModItems;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/ReloadkeyOnKeyPressedProcedure.class */
public class ReloadkeyOnKeyPressedProcedure {
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0092, code lost:
        if ((r3 instanceof net.minecraft.world.entity.LivingEntity ? ((net.minecraft.world.entity.LivingEntity) r3).getMainHandItem() : net.minecraft.world.item.ItemStack.EMPTY).getItem() == net.mcreator.latexes.init.LatexModItems.SCRAP_M_16_RIFLE.get()) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0126, code lost:
        if ((r3 instanceof net.minecraft.world.entity.LivingEntity ? ((net.minecraft.world.entity.LivingEntity) r3).getOffhandItem() : net.minecraft.world.item.ItemStack.EMPTY).getItem() == net.mcreator.latexes.init.LatexModItems.TSC_PISTOL.get()) goto L_0x0129;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01ba, code lost:
        if ((r3 instanceof net.minecraft.world.entity.LivingEntity ? ((net.minecraft.world.entity.LivingEntity) r3).getOffhandItem() : net.minecraft.world.item.ItemStack.EMPTY).getItem() == net.mcreator.latexes.init.LatexModItems.MATCHLOCK_PISTOL.get()) goto L_0x01bd;
     */
    public static void execute(Entity entity) {
        if (entity != null) {
            if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getMainHandItem() : ItemStack.EMPTY).getItem() == LatexModItems.DARTRIFLE.get()) {
                DartRifleReloadProcedure.execute(entity);
            }
            if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getMainHandItem() : ItemStack.EMPTY).getItem() == LatexModItems.LATEX_DART_RIFLE.get()) {
                LatexDartRifleReloadProcedure.execute(entity);
            }
            if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getMainHandItem() : ItemStack.EMPTY).getItem() != LatexModItems.M_4_ASSAULT_RIFLE.get()) {
            }
            M4AssaultRifleReloadProcedure.execute(entity);
            if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getMainHandItem() : ItemStack.EMPTY).getItem() == LatexModItems.AR_70_ASSAULT_RIFLE.get()) {
                AR70ReloadProcedure.execute(entity);
            }
            if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getMainHandItem() : ItemStack.EMPTY).getItem() == LatexModItems.FLAMETHOWER.get()) {
                FlamethowerReloadProcedure.execute(entity);
            }
            if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getMainHandItem() : ItemStack.EMPTY).getItem() != LatexModItems.TSC_PISTOL.get()) {
            }
            TSCPistolReloadProcedure.execute(entity);
            if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getMainHandItem() : ItemStack.EMPTY).getItem() == LatexModItems.OVERUNDERSHOTGUN.get()) {
                ShotgunReloadProcedure.execute(entity);
            }
            if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getMainHandItem() : ItemStack.EMPTY).getItem() == LatexModItems.MATCH_LOCK_MUSKET.get()) {
                MatchlockReloadProcedure.execute(entity);
            }
            if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getMainHandItem() : ItemStack.EMPTY).getItem() != LatexModItems.MATCHLOCK_PISTOL.get()) {
            }
            MatchlockPistolReloadProcedure.execute(entity);
            if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getMainHandItem() : ItemStack.EMPTY).getItem() == LatexModItems.REVOLVING_GOO_CANNON.get()) {
                RevolvingGooCannonReloadProcedure.execute(entity);
            }
        }
    }
}
