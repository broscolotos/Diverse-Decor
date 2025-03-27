package me.broscolotos.diversedecor.blocks.normal.blocks.standard;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.Facing;
import net.minecraft.world.IBlockAccess;

public class TransparentBlock extends StandardBlock {
    public TransparentBlock(Material material) {
        super(material);
        setStepSound(soundTypeGlass);
    }

    public TransparentBlock(Material material, String name, String textName, int textAmt) {
        super(material, name, textName, textAmt);
        setStepSound(soundTypeGlass);
    }

    public TransparentBlock(Material material, String name, String textName, int textAmt, String tool) {
        super(material, name, textName, textAmt, tool);
        setStepSound(soundTypeGlass);
    }


    /** stuff for glass */
    public Block setLightOpacity(int num) { return super.setLightOpacity(1); }

    public boolean isOpaqueCube() { return false; }

    @SideOnly(Side.CLIENT)
    public int getRenderBlockPass() { return 1; }

    public boolean renderAsNormalBlock() { return false; }

    @SideOnly(Side.CLIENT)
    public boolean shouldSideBeRendered(IBlockAccess p_149646_1_, int p_149646_2_, int p_149646_3_, int p_149646_4_, int p_149646_5_) {
        Block block = p_149646_1_.getBlock(p_149646_2_, p_149646_3_, p_149646_4_);

        if (p_149646_1_.getBlockMetadata(p_149646_2_, p_149646_3_, p_149646_4_) != p_149646_1_.getBlockMetadata(p_149646_2_ - Facing.offsetsXForSide[p_149646_5_], p_149646_3_ - Facing.offsetsYForSide[p_149646_5_], p_149646_4_ - Facing.offsetsZForSide[p_149646_5_])) {
            return true;
        }

        if (block == this) {
            return false;
        }

        return block == this ? false : super.shouldSideBeRendered(p_149646_1_, p_149646_2_, p_149646_3_, p_149646_4_, p_149646_5_);
    }
}
