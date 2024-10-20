package me.broscolotos.diversedecor.blocks.normal.blocks.dynamic;

import me.broscolotos.diversedecor.DiverseDecor;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;

import java.util.LinkedList;
import java.util.Random;

public class DynamicBlock extends Block {

    public LinkedList<IIcon> textures = new LinkedList<>();

    public int textAmt;

    public DynamicBlock(Material mat) {
        super(mat);
        setHardness(2F);
        setResistance(10.0F);
        setHarvestLevel("pickaxe", 1);
        setStepSound(soundTypeStone);
        setCreativeTab(DiverseDecor.diverseDecorBlockTab);
    }

    public void setTextAmt(int amt) {
        this.textAmt = amt;
    }

    //register all the textures for the block.
    public void registerBlockIcons(IIconRegister reg) {
        for ( int i = 0; i < textAmt ; i++) {
            this.textures.add(reg.registerIcon(this.textureName+"_"+ i));
        }
    }

    //get the texture to render in the inventory. Default is the first one.
    public IIcon getIcon ( int side, int meta){
        return this.textures.get(0);
    }

    //randomly assign the texture for the block.
    @Override
    public IIcon getIcon (IBlockAccess world, int x, int y, int z, int side) {
        return this.textures.get(Math.abs(new Random((long) x*x*y*z).nextInt())%textAmt);
    }
}
