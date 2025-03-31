package me.broscolotos.diversedecor.blocks.itemblocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlockWithMetadata;
import net.minecraft.item.ItemStack;

public class GenericItemBlock extends ItemBlockWithMetadata {

    public GenericItemBlock(Block block) {
        super(block, block);
    }

    public String getUnlocalizedName( ItemStack item) {
        if (this.getUnlocalizedName().toLowerCase().contains("stair") || this.getUnlocalizedName().toLowerCase().contains("slab") || this.getUnlocalizedName().toLowerCase().contains("fence") || this.getUnlocalizedName().toLowerCase().contains("wall")) {
            return this.getUnlocalizedName();
        }
        return this.getUnlocalizedName() + "_" + item.getItemDamage();
    }
}

