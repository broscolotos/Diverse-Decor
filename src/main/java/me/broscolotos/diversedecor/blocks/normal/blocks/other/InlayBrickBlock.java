package me.broscolotos.diversedecor.blocks.normal.blocks.other;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import me.broscolotos.diversedecor.DiverseDecor;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;

public class InlayBrickBlock extends Block {

    @SideOnly(Side.CLIENT)
    public IIcon defaultTexture;

    @SideOnly(Side.CLIENT)
    public IIcon bottomTexture;
    @SideOnly(Side.CLIENT)
    public IIcon verticalTexture;
    @SideOnly(Side.CLIENT)
    public IIcon topTexture;

    @SideOnly(Side.CLIENT)
    public IIcon leftTexture;
    @SideOnly(Side.CLIENT)
    public IIcon horizontalTexture;
    @SideOnly(Side.CLIENT)
    public IIcon rightTexture;


    @SideOnly(Side.CLIENT)
    public IIcon bottomLeftTexture;
    @SideOnly(Side.CLIENT)
    public IIcon bottomRightTexture;
    @SideOnly(Side.CLIENT)
    public IIcon topLeftTexture;
    @SideOnly(Side.CLIENT)
    public IIcon topRightTexture;

    @SideOnly(Side.CLIENT)
    public IIcon plusTexture;
    @SideOnly(Side.CLIENT)
    public IIcon tLeftTexture;
    @SideOnly(Side.CLIENT)
    public IIcon tRightTexture;
    @SideOnly(Side.CLIENT)
    public IIcon tTopTexture;
    @SideOnly(Side.CLIENT)
    public IIcon tBottomTexture;


    public InlayBrickBlock() {
        super(Material.rock);
        setBlockName("Inlay Brick");
        setHardness(1F);
        setResistance(2.0F);
        setBlockTextureName(DiverseDecor.MODID + ":bricks/darkmortar/inlay");
        setHarvestLevel("pickaxe", 1);
        setStepSound(soundTypeStone);
        setCreativeTab(DiverseDecor.diverseDecorBlockTab);
    }

    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
        return defaultTexture;
    }

    /**
     * 0 - down
     * 1 - top
     * 2 - south
     * 3 - north
     * 4 - east
     * 5 - west
    */

    @SideOnly(Side.CLIENT)
    public IIcon getIcon(IBlockAccess access, int x, int y, int z, int side) {
        IIcon active = this.defaultTexture;

        int dx1 = 0, dx2 = 0, dy1 = 0, dy2 = 0, dz1 = 0, dz2 = 0;

        switch (side) {
            case 0: case 1: // XZ plane
                dx1 = 1; dx2 = -1; dz1 = 1; dz2 = -1;
                break;
            case 2:
                dx1 = -1; dx2 = 1; dy1 = 1; dy2 = -1;
                break;
            case 3: // XY plane
                dx1 = 1; dx2 = -1; dy1 = 1; dy2 = -1;
                break;
            case 4: // YZ plane
                dz1 = 1; dz2 = -1; dy1 = 1; dy2 = -1;
                break;
            case 5:
                dz1 = -1; dz2 = 1; dy1 = 1; dy2 = -1;

        }
        boolean comp1;
        boolean comp2;
        boolean comp3;
        boolean comp4;
        if (dx1 != 0) {
            comp1 = access.getBlock(x + dx1, y, z) instanceof InlayBrickBlock;
            comp2 = access.getBlock(x + dx2, y, z) instanceof InlayBrickBlock;
            comp3 = access.getBlock(x, y + dy2, z + dz1) instanceof InlayBrickBlock;
            comp4 = access.getBlock(x, y + dy1, z + dz2) instanceof InlayBrickBlock;
        }
        else {
            comp1 = access.getBlock(x, y, z + dz1) instanceof InlayBrickBlock;
            comp2 = access.getBlock(x, y, z + dz2) instanceof InlayBrickBlock;
            comp3 = access.getBlock(x + dx1, y + dy2, z) instanceof InlayBrickBlock;
            comp4 = access.getBlock(x + dx2, y + dy1, z) instanceof InlayBrickBlock;
        }
        if (comp1 && comp2) {
            if (comp3 && comp4) {
                active = this.plusTexture;
            } else if (comp3) {
                active = this.tBottomTexture;
            } else if (comp4) {
                active = this.tTopTexture;
            } else {
                active = this.horizontalTexture;
            }
        }
        else if (comp1) {
            if (comp3 && comp4) {
                active = this.tRightTexture;
            } else if (comp3) {
                active = this.topLeftTexture;
            } else if (comp4) {
                active = this.bottomLeftTexture;
            } else {
                active = this.leftTexture;
            }
        }
        else if (comp2) {
            if (comp3 && comp4) {
                active = this.tLeftTexture;
            } else if (comp3) {
                active = this.topRightTexture;
            } else if (comp4) {
                active = this.bottomRightTexture;
            } else {
                active = this.rightTexture;
            }
        }
        else if (comp3 && comp4) {
            active = this.verticalTexture;
        } else if (comp3) {
            active = this.topTexture;
        } else if (comp4) {
            active = this.bottomTexture;
        }
        return active;
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister registry) {
        this.blockIcon = registry.registerIcon(this.getTextureName());
        this.defaultTexture = this.blockIcon;

        this.bottomTexture = registry.registerIcon(this.getTextureName() + " bottom");
        this.verticalTexture = registry.registerIcon(this.getTextureName() + " vertical");
        this.topTexture = registry.registerIcon(this.getTextureName() + " top");

        this.leftTexture = registry.registerIcon(this.getTextureName() + " left");
        this.horizontalTexture = registry.registerIcon(this.getTextureName() + " horizontal");
        this.rightTexture = registry.registerIcon(this.getTextureName() + " right");

        this.bottomLeftTexture = registry.registerIcon(this.getTextureName() + " bottom left");
        this.bottomRightTexture = registry.registerIcon(this.getTextureName() + " bottom right");
        this.topLeftTexture = registry.registerIcon(this.getTextureName() + " top left");
        this.topRightTexture = registry.registerIcon(this.getTextureName() + " top right");

        this.plusTexture = registry.registerIcon(this.getTextureName() + " plus");
        this.tTopTexture = registry.registerIcon(this.getTextureName() + " t top");
        this.tBottomTexture = registry.registerIcon(this.getTextureName() + " t bottom");
        this.tLeftTexture = registry.registerIcon(this.getTextureName() + " t left");
        this.tRightTexture = registry.registerIcon(this.getTextureName() + " t right");
    }


}
