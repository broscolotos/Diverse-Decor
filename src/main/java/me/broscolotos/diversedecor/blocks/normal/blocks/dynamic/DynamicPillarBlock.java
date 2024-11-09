package me.broscolotos.diversedecor.blocks.normal.blocks.dynamic;

import me.broscolotos.diversedecor.blocks.normal.blocks.standard.StandardBlock;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;

import java.util.List;
import java.util.Random;

public class DynamicPillarBlock extends DynamicBlock {

    public DynamicPillarBlock(Material mat) {
        super(mat);
    }

    public DynamicPillarBlock(Material mat, String name, String textName, int textAmt) {
        super(mat, name, textName, textAmt);
    }


    //randomly assign the texture for the block.
    @Override
    public IIcon getIcon (IBlockAccess world, int x, int y, int z, int side) { //#!# rework later to support more than two textures.
        if (world.getBlock(x,y-1,z) instanceof DynamicPillarBlock
        && world.getBlock(x,y-1,z).getIcon(world,z,y-1,z, side) == this.textures.get(1)) {
            return this.textures.get(0);
        }
        else {
            return this.textures.get(1);
        }
    }
}
