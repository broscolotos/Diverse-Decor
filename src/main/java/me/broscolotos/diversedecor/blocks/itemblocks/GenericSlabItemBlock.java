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


    public GenericSlabItemBlock(Block block) {
        super(block,
                (BlockSlab) block, // BlockIDs.searchEnum(BlockIDs.class, block.getUnlocalizedName().replace("_DoubleSlab","_Slab").replace("tile.", "").replace(" ", "")).block
                (BaseSlabBlock) GameRegistry.findBlock(DiverseDecor.MODID, ((BaseSlabBlock)block).blockName + "_" + "DoubleSlab"), // BlockIDs.searchEnum(BlockIDs.class, block.getUnlocalizedName().replace("_Slab","_DoubleSlab").replace("tile.", "").replace(" ", "")).block
                block.getUnlocalizedName().contains("_DoubleSlab"));
        setHasSubtypes(true);
    }
}
