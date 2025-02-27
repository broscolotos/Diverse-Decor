package me.broscolotos.diversedecor.blocks.itemblocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlockWithMetadata;
import net.minecraft.item.ItemStack;

public class GenericItemBlock extends ItemBlockWithMetadata {

    public GenericItemBlock(Block block) {
        super(block, block);
    }

    public String getUnlocalizedName(ItemStack item) {
        return this.getUnlocalizedName() + "_" + item.getItemDamage();
    }
}

