package me.broscolotos.diversedecor.blocks.decoration;

import ddfexcraft.tmt.slim.Vec3d;
import ddfexcraft.tmt.slim.Vec3f;
import me.broscolotos.diversedecor.DiverseDecor;
import me.broscolotos.diversedecor.core.ChairUtility;
import me.broscolotos.diversedecor.tiles.BaseTileEntity;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;



public class DecorationBlock extends BlockContainer {
    public BaseTileEntity tileEntity;

    public Vec3f[] seatPos = null;
    public Vec3f itemOffset = new Vec3f(0,0,0);
    public Vec3f itemScale = new Vec3f(1,1,1);
    public Vec3f itemRotation = new Vec3f(0, 0, 0);
    public float[][] bounds = null;

    public DecorationBlock(Material material) {
        super(material);
        setCreativeTab(DiverseDecor.diverseDecorCreativeTab);
    }

    @Override
    public TileEntity createTileEntity(World world, int meta) {
        return createNewTileEntity(world, meta);
    }

    @Override
    public TileEntity createNewTileEntity(World p_149915_1_, int meta) {
        try {
            return tileEntity.getClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack stack) {
        super.onBlockPlacedBy(world, x, y, z, entity, stack);
        handleBounds(world, x, y, z, entity);
        try {
            BaseTileEntity t = tileEntity.getClass().newInstance();
            t.dir = getDir(entity);
            //force tile spawn manually and override any existing tile at the space
            world.setTileEntity(x,y,z, t);
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    // Helper to get the Direction
    protected int getDir(EntityLivingBase entity) {
        return MathHelper.floor_double((entity.rotationYaw / 90.0F) + 2.5D) & 3;
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_) {
        if (seatPos != null) {
            for (Vec3f pos : seatPos) {
                if (!ChairUtility.isSomeoneSitting(world, x + pos.x, y + pos.y, z + pos.z)) {
                    ChairUtility.sitOnBlockWithRotationOffset(world, new Vec3d(x, y, z), player, pos.toVec3D(), ((BaseTileEntity) world.getTileEntity(x, y, z)).dir);
                    return true;
                }
            }
        }
        return false;
    }


    public boolean canCollideCheck(int p_149678_1_, boolean p_149678_2_) {
        return true;
    }

    public void handleBounds(World world, int x, int y, int z, EntityLivingBase player) {
        if (bounds != null) {
            for (float[] coord : bounds) {
                if (coord.length >= 6) {
                    switch (getDir(player)) {
                        case 1:
                        case 3:
                            this.setBlockBounds(coord[0], coord[1], coord[2], coord[3], coord[4], coord[5]);
                            //this.setBlockBounds(0.25f, 0, 0f, 0.75f, 0.5f, 1f);
                            break;
                        default:
                            this.setBlockBounds(coord[2], coord[1], coord[0], coord[5], coord[4], coord[3]);
                            //this.setBlockBounds(0f, 0, 0.25f, 1, 0.5f, 0.75f);
                            break;
                    }
                }
            }
        }
    }

    @Override
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x, int y, int z) {
        if (bounds != null) {
            return AxisAlignedBB.getBoundingBox(bounds[0][0], bounds[0][1], bounds[0][2], bounds[0][3], bounds[0][4], bounds[0][5]);
        }
        return null;
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

    public DecorationBlock setTileEntity(BaseTileEntity tile) {
        this.tileEntity = tile;
        return this;
    }

    public DecorationBlock setTool(String tool, int level) {
        setHarvestLevel(tool, level);
        return this;
    }

    public DecorationBlock bounds(float[][] coords) {
        this.bounds = coords;
        return this;
    }

    public DecorationBlock setName(String name) {
        setBlockName(name);
        return this;
    }

    public DecorationBlock setSeatPos(Vec3f[] seatPos) {
        this.seatPos = seatPos;
        return this;
    }

    public DecorationBlock setItemRotation(Vec3f rot) {
        this.itemRotation = rot;
        return this;
    }

    public DecorationBlock setItemScale(Vec3f scale) {
        this.itemScale = scale;
        return this;
    }

    public DecorationBlock setItemOffset(Vec3f off) {
        this.itemOffset = off;
        return this;
    }

}
