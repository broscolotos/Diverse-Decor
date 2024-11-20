package me.broscolotos.diversedecor.blocks.decoration;

import me.broscolotos.diversedecor.tiles.TileCashRegister;
import me.broscolotos.diversedecor.tiles.TilePicnicTable;
import me.broscolotos.diversedecor.tiles.TileTopPostLight;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockCashRegister extends DecorationBlock {
    public BlockCashRegister(Material material) {
        super(material);
        setBlockName("Cash Register");
        setHardness(1);
        setResistance(2);
        setHarvestLevel("pickaxe",1);
        setStepSound(Block.soundTypeMetal);
        icon = "cashRegisterIcon";
        opaque = false;
        renderType = -1;
        normalBlock = false;
    }

    @Override
    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_)
    {
        return new TileCashRegister();
    }
    @Override
    public boolean canCollideCheck(int p_149678_1_, boolean p_149678_2_){
        return true;
    }
    @Override
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack stack)
    {
        super.onBlockPlacedBy(world, x, y, z, entity, stack);
        //force tile spawn manually and override any existing tile at the space
        world.setTileEntity(x,y,z, new TileCashRegister(getDir(entity)));
    }

    @Override
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World p_149668_1_, int p_149668_2_, int p_149668_3_, int p_149668_4_) {
        return null;
    }

    @Override
    public void setBlockBoundsBasedOnState(IBlockAccess p_149719_1_, int p_149719_2_, int p_149719_3_, int p_149719_4_) {
        this.setBlockBounds(0.125F, 0.0F, 0.125F, 0.875F, 0.625F, 0.875F);
    }
}
