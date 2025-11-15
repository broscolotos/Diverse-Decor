package me.broscolotos.diversedecor.blocks.itemblocks.Recolorable;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import me.broscolotos.diversedecor.core.Utility;
import net.minecraft.block.Block;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemColored;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IIcon;

import java.util.List;

public class RecolorableItemBlock extends ItemColored {


    public RecolorableItemBlock(Block block) {
        super(block, true);
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister registry) {
        super.registerIcons(registry);
    }

    @SideOnly(Side.CLIENT)
    public IIcon getIconFromDamageForRenderPass(int damage, int pass) {
        return super.getIconFromDamageForRenderPass(damage, pass);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public int getColorFromItemStack(ItemStack stack, int pass) {
        if (pass == 0)
            return 0xFFFFFF;
        if (stack.hasDisplayName()) {
            return Utility.getColorFromString(stack.getDisplayName());
        }
        else if (stack.hasTagCompound() && stack.getTagCompound().hasKey("Color")) {
            return Utility.getColorFromString(stack.getTagCompound().getString("Color"));
        }
        return 0xFFFFFF;
    }
}
