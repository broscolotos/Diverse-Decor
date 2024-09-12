package me.broscolotos.diversedecor.blocks;

import me.broscolotos.diversedecor.DiverseDecor;
import me.broscolotos.diversedecor.tiles.TilePicnicTable;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class BlockPicnicTable extends DecorationBlock{


    public BlockPicnicTable(Material material) {
        super(material);
        setBlockName("Picnic Table");
        setHardness(1);
        setResistance(2);
        setHarvestLevel("axe",1);
        setStepSound(Block.soundTypeWood);
        icon = "tableIcon";
        opaque = false;
        renderType = -1;
        normalBlock = false;
    }

    @Override
    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_)
    {
        return new TilePicnicTable();
    }

    @Override
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack stack)
    {
        super.onBlockPlacedBy(world, x, y, z, entity, stack);
        //force tile spawn manually and override any existing tile at the space
        world.setTileEntity(x,y,z, new TilePicnicTable(getDir(entity)));
    }
}
