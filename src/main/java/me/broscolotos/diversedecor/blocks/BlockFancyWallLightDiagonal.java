package me.broscolotos.diversedecor.blocks;

import me.broscolotos.diversedecor.tiles.TileFancyWallLight;
import me.broscolotos.diversedecor.tiles.TileFancyWallLightDiagonal;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class BlockFancyWallLightDiagonal extends BlockFancyWallLight {
    public BlockFancyWallLightDiagonal(Material material) {
        super(material);
        setBlockName("Fancy Hanging Light Diagonal");
    }

    @Override
    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_)
    {
        return new TileFancyWallLightDiagonal();
    }
    @Override
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack stack)
    {
        super.onBlockPlacedBy(world, x, y, z, entity, stack);
        //force tile spawn manually and override any existing tile at the space
        world.setTileEntity(x,y,z, new TileFancyWallLightDiagonal(getDir(entity)));
    }
}
