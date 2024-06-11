/*     */ package net.ltxprogrammer.turned.block.entity;
/*     */ 
/*     */ import io.netty.buffer.Unpooled;
/*     */ import java.util.stream.IntStream;
/*     */ import javax.annotation.Nullable;
/*     */ import net.ltxprogrammer.turned.init.LatexModBlockEntities;
/*     */ import net.ltxprogrammer.turned.world.inventory.BoxguiMenu;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.core.Direction;
/*     */ import net.minecraft.core.NonNullList;
/*     */ import net.minecraft.nbt.CompoundTag;
/*     */ import net.minecraft.network.FriendlyByteBuf;
/*     */ import net.minecraft.network.chat.Component;
/*     */ import net.minecraft.network.chat.TextComponent;
/*     */ import net.minecraft.network.protocol.Packet;
/*     */ import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
/*     */ import net.minecraft.world.ContainerHelper;
/*     */ import net.minecraft.world.WorldlyContainer;
/*     */ import net.minecraft.world.entity.player.Inventory;
/*     */ import net.minecraft.world.inventory.AbstractContainerMenu;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.level.block.entity.BlockEntity;
/*     */ import net.minecraft.world.level.block.entity.BlockEntityType;
/*     */ import net.minecraft.world.level.block.entity.RandomizableContainerBlockEntity;
/*     */ import net.minecraft.world.level.block.state.BlockState;
/*     */ import net.minecraftforge.common.capabilities.Capability;
/*     */ import net.minecraftforge.common.util.LazyOptional;
/*     */ import net.minecraftforge.items.CapabilityItemHandler;
/*     */ import net.minecraftforge.items.IItemHandler;
/*     */ import net.minecraftforge.items.wrapper.SidedInvWrapper;
/*     */ 
/*     */ public class MetalBoxBlockEntity
/*     */   extends RandomizableContainerBlockEntity
/*     */   implements WorldlyContainer {
/*  35 */   private NonNullList<ItemStack> stacks = NonNullList.m_122780_(12, ItemStack.f_41583_);
/*  36 */   private final LazyOptional<? extends IItemHandler>[] handlers = (LazyOptional<? extends IItemHandler>[])SidedInvWrapper.create(this, Direction.values());
/*     */   
/*     */   public MetalBoxBlockEntity(BlockPos position, BlockState state) {
/*  39 */     super((BlockEntityType)LatexModBlockEntities.METAL_BOX.get(), position, state);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_142466_(CompoundTag compound) {
/*  44 */     super.m_142466_(compound);
/*  45 */     if (!m_59631_(compound))
/*  46 */       this.stacks = NonNullList.m_122780_(m_6643_(), ItemStack.f_41583_); 
/*  47 */     ContainerHelper.m_18980_(compound, this.stacks);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_183515_(CompoundTag compound) {
/*  52 */     super.m_183515_(compound);
/*  53 */     if (!m_59634_(compound)) {
/*  54 */       ContainerHelper.m_18973_(compound, this.stacks);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public ClientboundBlockEntityDataPacket getUpdatePacket() {
/*  60 */     return ClientboundBlockEntityDataPacket.m_195640_((BlockEntity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   public CompoundTag m_5995_() {
/*  65 */     return m_187480_();
/*     */   }
/*     */ 
/*     */   
/*     */   public int m_6643_() {
/*  70 */     return this.stacks.size();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_7983_() {
/*  75 */     for (ItemStack itemstack : this.stacks) {
/*  76 */       if (!itemstack.m_41619_())
/*  77 */         return false; 
/*  78 */     }  return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public Component m_6820_() {
/*  83 */     return (Component)new TextComponent("metal_box");
/*     */   }
/*     */ 
/*     */   
/*     */   public int m_6893_() {
/*  88 */     return 64;
/*     */   }
/*     */ 
/*     */   
/*     */   public AbstractContainerMenu m_6555_(int id, Inventory inventory) {
/*  93 */     return (AbstractContainerMenu)new BoxguiMenu(id, inventory, (new FriendlyByteBuf(Unpooled.buffer())).m_130064_(this.f_58858_));
/*     */   }
/*     */ 
/*     */   
/*     */   public Component m_5446_() {
/*  98 */     return (Component)new TextComponent("Metal Box");
/*     */   }
/*     */ 
/*     */   
/*     */   protected NonNullList<ItemStack> m_7086_() {
/* 103 */     return this.stacks;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_6520_(NonNullList<ItemStack> stacks) {
/* 108 */     this.stacks = stacks;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_7013_(int index, ItemStack stack) {
/* 113 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int[] m_7071_(Direction side) {
/* 118 */     return IntStream.range(0, m_6643_()).toArray();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_7155_(int index, ItemStack stack, @Nullable Direction direction) {
/* 123 */     return m_7013_(index, stack);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_7157_(int index, ItemStack stack, Direction direction) {
/* 128 */     if (index == 0)
/* 129 */       return false; 
/* 130 */     if (index == 1)
/* 131 */       return false; 
/* 132 */     if (index == 2)
/* 133 */       return false; 
/* 134 */     if (index == 3)
/* 135 */       return false; 
/* 136 */     if (index == 4)
/* 137 */       return false; 
/* 138 */     if (index == 5)
/* 139 */       return false; 
/* 140 */     if (index == 6)
/* 141 */       return false; 
/* 142 */     if (index == 7)
/* 143 */       return false; 
/* 144 */     if (index == 8)
/* 145 */       return false; 
/* 146 */     if (index == 9)
/* 147 */       return false; 
/* 148 */     if (index == 10)
/* 149 */       return false; 
/* 150 */     return (index != 11);
/*     */   }
/*     */ 
/*     */   
/*     */   public <T> LazyOptional<T> getCapability(Capability<T> capability, @Nullable Direction facing) {
/* 155 */     if (!this.f_58859_ && facing != null && capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY)
/* 156 */       return this.handlers[facing.ordinal()].cast(); 
/* 157 */     return super.getCapability(capability, facing);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_7651_() {
/* 162 */     super.m_7651_();
/* 163 */     for (LazyOptional<? extends IItemHandler> handler : this.handlers)
/* 164 */       handler.invalidate(); 
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\block\entity\MetalBoxBlockEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */