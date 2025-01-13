package me.broscolotos.diversedecor.blocks.itemblocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlockWithMetadata;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class GenericPropItemBlock  extends ItemBlockWithMetadata {

    private final Block block;

    public GenericPropItemBlock(Block block) {
        super(block, block);
        this.block = block;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIconFromDamage(int metadata)
    {
        return this.block.getIcon(2, metadata);
    }


    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return super.getUnlocalizedName(stack) + "." + stack.getItemDamageForDisplay();
    }

}
