package me.broscolotos.diversedecor.blocks.normal.blocks.standard;

import me.broscolotos.diversedecor.DiverseDecor;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import java.util.LinkedList;
import java.util.List;

public class StandardBlock extends Block {

    public IIcon[] textures = new IIcon[16];
    public int textAmt;

    public StandardBlock(Material material) {
        super(material);
        standardRegister();
    }

    public StandardBlock(Material material, String name, String textName, int textAmt) {
        super(material);
        standardRegister();
        setBlockName(name);
        setBlockTextureName(textName);
        setTextureAmt(textAmt);
    }

    public StandardBlock(Material material, String name, String textName, int textAmt, String tool) {
        super(material);
        standardRegister(tool);
        setBlockName(name);
        setBlockTextureName(textName);
        setTextureAmt(textAmt);
    }

    public void standardRegister() {
        setHardness(2F);
        setResistance(10.0F);
        setHarvestLevel("pickaxe", 1);
        setStepSound(soundTypeStone);
        setCreativeTab(DiverseDecor.diverseDecorBlockTab);
    }

    public void standardRegister(String tool) {
        setHardness(2F);
        setResistance(10.0F);
        setHarvestLevel(tool, 1);
        setStepSound(soundTypeWood);
        setCreativeTab(DiverseDecor.diverseDecorBlockTab);
    }

    public void setTextureAmt(int amt) {
        this.textAmt = amt;
    }

    public void registerBlockIcons(IIconRegister reg) {
        if (textAmt != 1) {
            for (int i = 0; i < textAmt; i++) {
                this.textures[i] = reg.registerIcon(this.textureName + "_" + i);
            }
        }
        else {
            this.textures[0] = reg.registerIcon(this.textureName);
        }
    }

    public IIcon getIcon ( int side, int meta){
        if (meta > textAmt) meta = 0;
        return this.textures[meta];
    }

    public int damageDropped( int oldmeta){
        return oldmeta;
    }

    public void getSubBlocks(Item item, CreativeTabs tab, List list){
        for (int i = 0; i < textAmt; i++){
            list.add(new ItemStack(item, 1, i));
        }
    }
}
