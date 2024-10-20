package me.broscolotos.diversedecor.blocks.normal.blocks.mono;

import me.broscolotos.diversedecor.DiverseDecor;
import me.broscolotos.diversedecor.blocks.normal.blocks.dynamic.OrangeBrick;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import java.util.List;

public class RoseBrick extends Block {

    public IIcon[] textures;

    public RoseBrick(Material material) {
        super(material);
        setBlockName("rosebricks");
        setBlockTextureName(DiverseDecor.MODID+":bricks/rose/rose_brick");
        setTextureAmt(1);
    }

    public void setTextureAmt(int amt) {
        textures = new IIcon[amt];
    }

    public void registerBlockIcons(IIconRegister reg) {
        if (textures.length > 1) {
            for (int i = 0; i < textures.length; i++) {
                this.textures[i] = reg.registerIcon(this.textureName + "_" + i);
            }
        }
        else {
            this.textures[0] = reg.registerIcon(this.textureName);
        }
    }
    public IIcon getIcon ( int side, int meta){
        if (meta > textures.length ) meta = 0;
        return this.textures[meta];
    }

    public int damageDropped( int oldmeta){
        return oldmeta;
    }

    public void getSubBlocks(Item item, CreativeTabs tab, List list){
        for (int i = 0; i < textures.length; i++){
            list.add(new ItemStack(item, 1, i));
        }
    }
}
