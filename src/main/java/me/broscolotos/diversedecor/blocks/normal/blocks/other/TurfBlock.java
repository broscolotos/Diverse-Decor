package me.broscolotos.diversedecor.blocks.normal.blocks.other;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import me.broscolotos.diversedecor.DiverseDecor;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;

public class TurfBlock extends Block {

    @SideOnly(Side.CLIENT)
    public IIcon top;
    @SideOnly(Side.CLIENT)
    public IIcon bottom;
    @SideOnly(Side.CLIENT)
    public IIcon side;


    public TurfBlock() {
        super(Material.grass);
        setBlockName("turf");
        setBlockTextureName(DiverseDecor.MODID + ":turf/turf");
        setHardness(1F);
        setResistance(2.0F);
        setHarvestLevel("shovel", 1);
        setStepSound(soundTypeGrass);
        setCreativeTab(DiverseDecor.diverseDecorBlockTab);
    }

    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
        return side == 1 ? this.top : (side == 0 ? this.bottom : this.side);
    }

    @SideOnly(Side.CLIENT)
    public IIcon getIcon(IBlockAccess access, int x, int y, int z, int side) {
        return side == 1 ? this.top : (side == 0 ? this.bottom : this.side);
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister registry) {
        this.blockIcon = registry.registerIcon(this.getTextureName() + "_side");
        this.bottom = registry.registerIcon(this.getTextureName() + "_bottom");
        this.top = registry.registerIcon(this.getTextureName() + "_top");
        this.side = registry.registerIcon(this.getTextureName() + "_side");
    }
}
