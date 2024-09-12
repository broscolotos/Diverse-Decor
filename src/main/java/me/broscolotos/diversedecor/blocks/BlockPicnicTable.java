package me.broscolotos.diversedecor.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import me.broscolotos.diversedecor.DiverseDecor;
import me.broscolotos.diversedecor.tiles.TilePicnicTable;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.List;

public class BlockPicnicTable extends BlockContainer {
    //returns a series of values to define the size of the block from start to end, with a normal block starting at 0 and ending at 1.
    public float[] hitboxShape(){return new float[]{-0.4375f,0,-1f,1.4375f,0.875f,2f};}
    public BlockPicnicTable(Material p_i45386_1_) {
        super(p_i45386_1_);
        setBlockName("Picnic Table");
        setHardness(1F);
        setResistance(2F);
        setHarvestLevel("axe",1);
        setStepSound(soundTypeWood);
        setCreativeTab(DiverseDecor.diverseDecorCreativeTab);
        setBlockBounds(hitboxShape()[0],hitboxShape()[1],hitboxShape()[2],hitboxShape()[3],hitboxShape()[4],hitboxShape()[5]);
    }

    @Override
    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
        return null;
    }
    @Override
    public TileEntity createTileEntity(World world, int meta) {
        return createNewTileEntity(world, meta);
    }

    @Override
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x, int y, int z) {
        return AxisAlignedBB.getBoundingBox((double)x + this.minX, (double)y + this.minY, (double)z + this.minZ, (double)x + this.maxX, (double)y + this.maxY, (double)z + this.maxZ);
    }

    @Override
    public void addCollisionBoxesToList(World world, int x, int y, int z, AxisAlignedBB hitboxSelf, List p_149743_6_, Entity collidingEntity) {
        this.setBlockBoundsBasedOnState(world, x, y, z);
        p_149743_6_.add(this.getCollisionBoundingBoxFromPool(world, x, y, z));
    }
    @Override
    public boolean getBlocksMovement(IBlockAccess p_149655_1_, int p_149655_2_, int p_149655_3_, int p_149655_4_) {
        return hitboxShape()[4]>1;
    }

    @Override
    public boolean hasTileEntity(int metadata) {
        return true;
    }
    @Override
    public int getRenderType(){
        return -1;
    }
    @Override
    public boolean isOpaqueCube(){
        return false;
    }
    @Override
    public boolean renderAsNormalBlock(){
        return false;
    }
    @Override
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack stack){
        super.onBlockPlacedBy(world, x, y, z, entity, stack);
        world.setTileEntity(x,y,z,new TilePicnicTable());
    }
    private IIcon texture;

    @Override
    public IIcon getIcon(int i, int j) {
        return texture;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        texture = iconRegister.registerIcon(DiverseDecor.MODID + ":items/tableIcon");
    }
}
