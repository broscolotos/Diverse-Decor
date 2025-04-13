package me.broscolotos.diversedecor.blocks.decoration;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class GagDecorationBlock extends Block {

    private DecorationBlock host;
    private float[] bounds = new float[6]; //x1, y1, z1, x2, y2, z2

    public GagDecorationBlock(DecorationBlock host, float[] bounds) {
        super(host.getMaterial());
        this.host = host;
        this.bounds = bounds;
        if (this.bounds.length != 6) {
            this.bounds = new float[]{0,0,0,1,1,1};
        }
        this.setBlockBounds(this.bounds[0],this.bounds[1],this.bounds[2],this.bounds[3],this.bounds[4],this.bounds[5]);
    }

    public GagDecorationBlock(Material material) {
        super(material);
        setCreativeTab(null);
    }

    public GagDecorationBlock setHost(DecorationBlock block) { this.host = block; return this; }

    public GagDecorationBlock setBounds(float[] bounds) { this.bounds = bounds; return this; }

    public DecorationBlock getHost() { return this.host; }

    public float[] getBounds() { return this.bounds; }

    @Override
    public boolean canPlaceBlockAt(World par1World, int par2, int par3, int par4) {
        return false;
    }

    @Override
    public int getRenderType() {
        return -1;
    }

    @Override
    public boolean shouldSideBeRendered(IBlockAccess iblockaccess, int i, int j, int k, int l) {
        return false;
    }

    /*    *//**
     * Returns a bounding box from the pool of bounding boxes (this means this box can change after the pool has been cleared to be reused)
     *//*
    @Override
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int i, int j, int k) {
        TileEntity tileEntity = world.getTileEntity(i, j, k);
        if (tileEntity instanceof TileTCRailGag && !((TileTCRailGag)tileEntity).type.equals("null")) {
            return AxisAlignedBB.getBoundingBox(i, j, k, i + 1, j + ((TileTCRailGag)tileEntity).bbHeight, k + 1);
        }
        return null;
    }*/
}
