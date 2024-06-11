package net.mcreator.latexes.block;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import net.mcreator.latexes.procedures.LatexeaterslimeEntityWalksOnTheBlockProcedure;
import net.mcreator.latexes.procedures.LatexeaterslimeUpdateTickProcedure;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.TieredItem;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/block/LatexeaterslimeBlock.class */
public class LatexeaterslimeBlock extends Block {
    public LatexeaterslimeBlock() {
        super(BlockBehaviour.Properties.of(Material.SPONGE, MaterialColor.COLOR_LIGHT_GREEN).sound(SoundType.SLIME_BLOCK).strength(0.5f, 5.0f).requiresCorrectToolForDrops().friction(0.5f).speedFactor(0.6f).jumpFactor(0.9f));
    }

    public void appendHoverText(ItemStack itemstack, BlockGetter world, List<Component> list, TooltipFlag flag) {
        appendHoverText(itemstack, world, list, flag);
        list.add(new TextComponent("it destroys dark latex blocks."));
    }

    public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
        return 15;
    }

    public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
        TieredItem tieredItem = player.getInventory().getSelected().getItem();
        return (tieredItem instanceof TieredItem) && tieredItem.getTier().getLevel() >= 0;
    }

    public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
        List<ItemStack> dropsOriginal = getDrops(state, builder);
        if (!dropsOriginal.isEmpty()) {
            return dropsOriginal;
        }
        return Collections.singletonList(new ItemStack(Items.SLIME_BALL, 3));
    }

    public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
        onPlace(blockstate, world, pos, oldState, moving);
        world.scheduleTick(pos, this, 25);
    }

    public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, Random random) {
        tick(blockstate, world, pos, random);
        LatexeaterslimeUpdateTickProcedure.execute(world, (double) pos.getX(), (double) pos.getY(), (double) pos.getZ());
        world.scheduleTick(pos, this, 25);
    }

    @OnlyIn(Dist.CLIENT)
    public void animateTick(BlockState blockstate, Level world, BlockPos pos, Random random) {
        animateTick(blockstate, world, pos, random);
        LocalPlayer localPlayer = Minecraft.getInstance().player;
        int x = pos.getX();
        int y = pos.getY();
        int z = pos.getZ();
        for (int l = 0; l < 3; l++) {
            world.addParticle(ParticleTypes.ITEM_SLIME, (double) (((float) x) + random.nextFloat()), (double) (((float) y) + random.nextFloat()), (double) (((float) z) + random.nextFloat()), (((double) random.nextFloat()) - 0.5d) * 0.5d, (((double) random.nextFloat()) - 0.5d) * 0.5d, (((double) random.nextFloat()) - 0.5d) * 0.5d);
        }
    }

    public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
        entityInside(blockstate, world, pos, entity);
        LatexeaterslimeEntityWalksOnTheBlockProcedure.execute(entity);
    }

    public void stepOn(Level world, BlockPos pos, BlockState blockstate, Entity entity) {
        stepOn(world, pos, blockstate, entity);
        LatexeaterslimeEntityWalksOnTheBlockProcedure.execute(entity);
    }
}
