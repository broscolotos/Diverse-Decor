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

public class DynamicBlock extends StandardBlock {

    public DynamicBlock(Material mat) {
        super(mat);
    }

    public DynamicBlock(Material mat, String name, String textName, int textAmt) {
        super(mat, name, textName, textAmt);
    }


    //get the texture to render in the inventory. Default is the first one.
    @Override
    public IIcon getIcon ( int side, int meta){
        return this.textures[0];
    }

    //randomly assign the texture for the block.
    @Override
    public IIcon getIcon (IBlockAccess world, int x, int y, int z, int side) {
        return this.textures[Math.abs(new Random((long) x*x*y*z).nextInt())%textAmt];
    }

    @Override
    public void getSubBlocks(Item item, CreativeTabs tab, List list){
        list.add(new ItemStack(item, 1, 0));
    }
}
