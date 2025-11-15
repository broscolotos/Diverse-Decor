package me.broscolotos.diversedecor.core;

import me.broscolotos.diversedecor.core.handler.BlockIDs;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ContainerRepair;
import net.minecraft.inventory.Slot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagInt;
import net.minecraft.nbt.NBTTagString;

public class SlotAnvilRename extends Slot {

    private final Slot parent;

    public SlotAnvilRename(ContainerRepair container, Slot parent) {
        super(parent.inventory, parent.getSlotIndex(), parent.xDisplayPosition, parent.yDisplayPosition);
        this.parent = parent;
    }

    @Override
    public boolean isItemValid(ItemStack stack) {
        return parent.isItemValid(stack);
    }

    @Override
    public boolean canTakeStack(EntityPlayer player) {
        return parent.canTakeStack(player);
    }


    @Override
    public void onPickupFromSlot(EntityPlayer player, ItemStack stack) {
        if (stack.getItem() != Item.getItemFromBlock(BlockIDs.blockRecolorable.block) /*&&
                !(Block.getBlockFromItem(stack.getItem()) instanceof RecolorableSlabBlock)*/) { return; }
        if (!stack.getDisplayName().contains("pat")) {
            if (stack.hasTagCompound() && stack.getTagCompound().hasKey("display")) {
                stack.setTagInfo("Color", new NBTTagString("#" + Integer.toHexString(Utility.getColorFromString(stack.getDisplayName()))));
                stack.getTagCompound().removeTag("display");
            }
        }
        else {
            if (stack.hasTagCompound() && stack.getTagCompound().hasKey("display")) {
                stack.setTagInfo("Base", new NBTTagInt(Integer.parseInt(stack.getDisplayName().substring(stack.getDisplayName().toLowerCase().indexOf("pat")+3))));
                stack.getTagCompound().removeTag("display");
            }
        }
        parent.onPickupFromSlot(player, stack);
    }
}
