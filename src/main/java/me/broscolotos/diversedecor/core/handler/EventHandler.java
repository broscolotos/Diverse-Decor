package me.broscolotos.diversedecor.core.handler;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import me.broscolotos.diversedecor.blocks.normal.blocks.dynamic.RecolorableBlock;
import me.broscolotos.diversedecor.core.SlotAnvilRename;
import net.minecraft.block.Block;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.inventory.ContainerRepair;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.event.entity.player.PlayerOpenContainerEvent;


public class EventHandler {



    @SubscribeEvent
    public void onTooltip(ItemTooltipEvent event) {
        ItemStack item = event.itemStack;
        if ((Block.getBlockFromItem(item.getItem()) instanceof RecolorableBlock /*|| Block.getBlockFromItem(item.getItem()) instanceof RecolorableSlabBlock*/) && item.getTagCompound() != null) {
            if (item.getTagCompound().hasKey("Color")) {
                event.toolTip.add(1,"Color: " + item.getTagCompound().getString("Color"));
                event.toolTip.add(2, "Pattern: " + item.getTagCompound().getInteger("Base"));
                event.toolTip.add(EnumChatFormatting.GRAY + "Rename to change color");
                if (!GuiScreen.isShiftKeyDown())
                    event.toolTip.add(EnumChatFormatting.GRAY + "Shift for accepted formatting");
                else {
                    event.toolTip.add(EnumChatFormatting.GRAY + "formats:");
                    event.toolTip.add(EnumChatFormatting.GRAY + "- #" + EnumChatFormatting.RED + "ff" + EnumChatFormatting.GREEN + "00" + EnumChatFormatting.BLUE + "00"
                            + EnumChatFormatting.GRAY + " | 0x" + EnumChatFormatting.RED + "ff" + EnumChatFormatting.GREEN + "00" + EnumChatFormatting.BLUE + "00");
                    event.toolTip.add(EnumChatFormatting.GRAY + "- " + EnumChatFormatting.RED + "r255 " + EnumChatFormatting.GREEN + "g0 " + EnumChatFormatting.BLUE + "b0");
                    event.toolTip.add(EnumChatFormatting.GRAY + "- " + EnumChatFormatting.RED + "255" + EnumChatFormatting.GRAY + ", " + EnumChatFormatting.GREEN + "0"  +
                            EnumChatFormatting.GRAY + ", " +  EnumChatFormatting.BLUE + "0");
                    event.toolTip.add(EnumChatFormatting.GRAY + "pattern format: " + EnumChatFormatting.YELLOW + "pat[0-" + (RecolorableBlock.overlays.length - 1) + "]");

                }
            }
        }
    }

    @SubscribeEvent
    public void onContainerOpen(PlayerOpenContainerEvent event) {
        if (event.entityPlayer.openContainer instanceof ContainerRepair) {
            ContainerRepair repair = (ContainerRepair) event.entityPlayer.openContainer;

            Slot old = (Slot) repair.inventorySlots.get(2);
            Slot wrapper = new SlotAnvilRename(repair, old);

            repair.inventorySlots.set(2, wrapper);
        }
    }
}
