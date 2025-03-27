package me.broscolotos.diversedecor.blocks.itemblocks;

import cpw.mods.fml.common.registry.GameRegistry;
import me.broscolotos.diversedecor.DiverseDecor;
import me.broscolotos.diversedecor.blocks.normal.blocks.standard.BaseSlabBlock;
import me.broscolotos.diversedecor.core.Utility;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.ItemSlab;
import net.minecraft.item.ItemStack;

public class GenericSlabItemBlock extends ItemSlab {

    public GenericSlabItemBlock(Block block) { //block, block as a slab, the doubleslab associated with this slab, and compare main block with double slab
        super(block, (BlockSlab) block,
                (BlockSlab) GameRegistry.findBlock(DiverseDecor.MODID, Utility.getBlockFromString(block.getUnlocalizedName()).blockName.toLowerCase() + block.getUnlocalizedName().replaceAll("[a-z,.,_]", "") + "_doubleslab"),
                block == GameRegistry.findBlock(DiverseDecor.MODID, Utility.getBlockFromString(block.getUnlocalizedName()).blockName.toLowerCase() + block.getUnlocalizedName().replaceAll("[a-z,.,_]", "") + "_doubleslab"));

    }

}
