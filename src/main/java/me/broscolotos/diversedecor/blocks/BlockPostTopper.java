package me.broscolotos.diversedecor.blocks;

import me.broscolotos.diversedecor.tiles.TilePostTopper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockPostTopper extends DecorationBlock {


    public BlockPostTopper(Material material) {
        super(material);
        setBlockName("Post Topper");
        setHardness(1);
        setResistance(2);
        setHarvestLevel("axe",1);
        setStepSound(Block.soundTypeWood);
        icon = "topperIcon";
        opaque = false;
        renderType = -1;
        normalBlock = false;
    }

    @Override
    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_)
    {
        return new TilePostTopper();
    }

    @Override
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack stack)
    {
        super.onBlockPlacedBy(world, x, y, z, entity, stack);
        //force tile spawn manually and override any existing tile at the space
        world.setTileEntity(x,y,z, new TilePostTopper());
    }

    @Override
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World p_149668_1_, int p_149668_2_, int p_149668_3_, int p_149668_4_) {
        return null;
    }

    @Override
    public void setBlockBoundsBasedOnState(IBlockAccess p_149719_1_, int p_149719_2_, int p_149719_3_, int p_149719_4_) {
        this.setBlockBounds(0.375F, 0.0F, 0.375F, 0.625F, 0.3125F, 0.625F);
    }
}
