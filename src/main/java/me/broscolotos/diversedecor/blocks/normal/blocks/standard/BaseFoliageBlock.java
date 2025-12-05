package me.broscolotos.diversedecor.blocks.normal.blocks.standard;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import me.broscolotos.diversedecor.DiverseDecor;
import net.minecraft.block.Block;
import net.minecraft.block.BlockTallGrass;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import java.util.List;

public class BaseFoliageBlock extends BlockTallGrass {

    public IIcon[] textures;
    public int textAmt;

    public BaseFoliageBlock(String name, String textureName, int textureAmount) {
        setCreativeTab(DiverseDecor.diverseDecorBlockTab);
        setBlockName(name);
        setBlockTextureName(textureName);
        setStepSound(soundTypeGrass);
        textAmt = textureAmount;
        float f = 0.4F;
        setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.8F, 0.5F + f);
    }

    public void harvestBlock(World world, EntityPlayer player, int p_149636_3_, int p_149636_4_, int p_149636_5_, int p_149636_6_) {
        super.harvestBlock(world, player, p_149636_3_, p_149636_4_, p_149636_5_, p_149636_6_);
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister registry) {
        this.textures = new IIcon[textAmt];

        for (int i = 0; i < this.textures.length; ++i)
        {
            this.textures[i] = registry.registerIcon(getTextureName());
        }
    }

    public IIcon getIcon ( int side, int meta) {
        if (meta >= textAmt) meta = 0;
        return this.textures[meta];
    }

    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item p_149666_1_, CreativeTabs p_149666_2_, List p_149666_3_) {
        for (int i = 0; i < textAmt; i ++) {
            p_149666_3_.add(new ItemStack(p_149666_1_, 1, i));
        }
    }
}
