package me.broscolotos.diversedecor.core.handler;

import me.broscolotos.diversedecor.DiverseDecor;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class BaseBlock extends Block {


    public BaseBlock(Material material, String name, float hardness, float resistance, String harvestTool, int harvestLevel, Block.SoundType stepSound, String textureLocation) {
        super(material);
        setCreativeTab(DiverseDecor.diverseDecorCreativeTab);
        setBlockName(name);
        setHardness(hardness);
        setResistance(resistance);
        setHarvestLevel(harvestTool,harvestLevel);
        setStepSound(stepSound);
        setBlockTextureName(DiverseDecor.MODID+":"+textureLocation);
    }

    @Override
    protected void dropBlockAsItem(World p_149642_1_, int p_149642_2_, int p_149642_3_, int p_149642_4_, ItemStack p_149642_5_) {
        super.dropBlockAsItem(p_149642_1_, p_149642_2_, p_149642_3_, p_149642_4_, p_149642_5_);
    }
}
